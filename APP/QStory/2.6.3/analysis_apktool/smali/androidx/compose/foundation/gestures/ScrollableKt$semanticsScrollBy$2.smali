.class final Landroidx/compose/foundation/gestures/ScrollableKt$semanticsScrollBy$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

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
        "Landroidx/compose/foundation/gestures/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u54f2\u5170\u696a\u4e16;",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "<anonymous>",
        "(Landroidx/compose/foundation/gestures/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u54f2\u5170\u696a\u4e16;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2"
    f = "Scrollable.kt"
    l = {
        0x47e
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field final synthetic $offset:J

.field final synthetic $previousValue:Lkotlin/jvm/internal/Ref$FloatRef;

.field final synthetic $this_semanticsScrollBy:Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;JLkotlin/jvm/internal/Ref$FloatRef;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/gestures/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u54f2\u5170\u696a\u4e16\u82cf;",
            "J",
            "Lkotlin/jvm/internal/Ref$FloatRef;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Landroidx/compose/foundation/gestures/ScrollableKt$semanticsScrollBy$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/gestures/ScrollableKt$semanticsScrollBy$2;->$this_semanticsScrollBy:Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;

    .line 2
    .line 3
    iput-wide p2, p0, Landroidx/compose/foundation/gestures/ScrollableKt$semanticsScrollBy$2;->$offset:J

    .line 4
    .line 5
    iput-object p4, p0, Landroidx/compose/foundation/gestures/ScrollableKt$semanticsScrollBy$2;->$previousValue:Lkotlin/jvm/internal/Ref$FloatRef;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private static final invokeSuspend$lambda$0(Lkotlin/jvm/internal/Ref$FloatRef;Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;FF)Lkotlin/飘花落叶言子楪兰苏哲世;
    .locals 2

    .line 1
    iget p4, p0, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 2
    .line 3
    sub-float/2addr p3, p4

    .line 4
    invoke-virtual {p1, p3}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪世哲兰苏(F)F

    .line 5
    .line 6
    .line 7
    move-result p3

    .line 8
    invoke-virtual {p1, p3}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪苏世兰哲(F)J

    .line 9
    .line 10
    .line 11
    move-result-wide p3

    .line 12
    check-cast p2, Landroidx/compose/foundation/gestures/飘花落叶言子哲苏兰楪世;

    .line 13
    .line 14
    iget-object p2, p2, Landroidx/compose/foundation/gestures/飘花落叶言子哲苏兰楪世;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;

    .line 15
    .line 16
    iget-object v0, p2, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪苏兰世哲:Landroidx/compose/foundation/gestures/飘花落叶言子哲楪世苏兰;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-virtual {p2, v0, p3, p4, v1}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪世哲苏兰(Landroidx/compose/foundation/gestures/飘花落叶言子哲楪世苏兰;JI)J

    .line 20
    .line 21
    .line 22
    move-result-wide p2

    .line 23
    invoke-virtual {p1, p2, p3}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪苏世哲兰(J)F

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    invoke-virtual {p1, p2}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪世哲兰苏(F)F

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iget p2, p0, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 32
    .line 33
    add-float/2addr p2, p1

    .line 34
    iput p2, p0, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 35
    .line 36
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 37
    .line 38
    return-object p0
.end method

.method public static synthetic 飘花落叶言子楪世苏兰哲(Lkotlin/jvm/internal/Ref$FloatRef;Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;FF)Lkotlin/飘花落叶言子楪兰苏哲世;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/gestures/ScrollableKt$semanticsScrollBy$2;->invokeSuspend$lambda$0(Lkotlin/jvm/internal/Ref$FloatRef;Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;FF)Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
    .locals 6
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
    new-instance v0, Landroidx/compose/foundation/gestures/ScrollableKt$semanticsScrollBy$2;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/gestures/ScrollableKt$semanticsScrollBy$2;->$this_semanticsScrollBy:Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;

    .line 4
    .line 5
    iget-wide v2, p0, Landroidx/compose/foundation/gestures/ScrollableKt$semanticsScrollBy$2;->$offset:J

    .line 6
    .line 7
    iget-object v4, p0, Landroidx/compose/foundation/gestures/ScrollableKt$semanticsScrollBy$2;->$previousValue:Lkotlin/jvm/internal/Ref$FloatRef;

    .line 8
    .line 9
    move-object v5, p2

    .line 10
    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/gestures/ScrollableKt$semanticsScrollBy$2;-><init>(Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;JLkotlin/jvm/internal/Ref$FloatRef;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, v0, Landroidx/compose/foundation/gestures/ScrollableKt$semanticsScrollBy$2;->L$0:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0
.end method

.method public final invoke(Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/gestures/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u54f2\u5170\u696a\u4e16;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/ScrollableKt$semanticsScrollBy$2;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroidx/compose/foundation/gestures/ScrollableKt$semanticsScrollBy$2;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/gestures/ScrollableKt$semanticsScrollBy$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    check-cast p1, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/ScrollableKt$semanticsScrollBy$2;->invoke(Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Landroidx/compose/foundation/gestures/ScrollableKt$semanticsScrollBy$2;->label:I

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
    iget-object p1, p0, Landroidx/compose/foundation/gestures/ScrollableKt$semanticsScrollBy$2;->L$0:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;

    .line 27
    .line 28
    iget-object v1, p0, Landroidx/compose/foundation/gestures/ScrollableKt$semanticsScrollBy$2;->$this_semanticsScrollBy:Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;

    .line 29
    .line 30
    iget-wide v3, p0, Landroidx/compose/foundation/gestures/ScrollableKt$semanticsScrollBy$2;->$offset:J

    .line 31
    .line 32
    invoke-virtual {v1, v3, v4}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪苏世哲兰(J)F

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    iget-object v1, p0, Landroidx/compose/foundation/gestures/ScrollableKt$semanticsScrollBy$2;->$previousValue:Lkotlin/jvm/internal/Ref$FloatRef;

    .line 37
    .line 38
    iget-object v3, p0, Landroidx/compose/foundation/gestures/ScrollableKt$semanticsScrollBy$2;->$this_semanticsScrollBy:Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;

    .line 39
    .line 40
    new-instance v8, Landroidx/compose/foundation/gestures/飘花落叶言子哲世苏楪兰;

    .line 41
    .line 42
    invoke-direct {v8, v1, v3, p1}, Landroidx/compose/foundation/gestures/飘花落叶言子哲世苏楪兰;-><init>(Lkotlin/jvm/internal/Ref$FloatRef;Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;)V

    .line 43
    .line 44
    .line 45
    iput v2, p0, Landroidx/compose/foundation/gestures/ScrollableKt$semanticsScrollBy$2;->label:I

    .line 46
    .line 47
    const/4 v5, 0x0

    .line 48
    const/4 v7, 0x0

    .line 49
    const/16 v10, 0xc

    .line 50
    .line 51
    move-object v9, p0

    .line 52
    invoke-static/range {v5 .. v10}, Landroidx/compose/animation/core/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰(FFLandroidx/compose/animation/core/飘花落叶言子楪苏哲世兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/jvm/internal/SuspendLambda;I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    if-ne p0, v0, :cond_2

    .line 57
    .line 58
    return-object v0

    .line 59
    :cond_2
    :goto_0
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 60
    .line 61
    return-object p0
.end method
