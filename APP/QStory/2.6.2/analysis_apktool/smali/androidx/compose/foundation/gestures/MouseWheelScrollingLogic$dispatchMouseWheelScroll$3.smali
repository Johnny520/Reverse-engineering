.class final Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;
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
    c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3"
    f = "MouseWheelScrollingLogic.kt"
    l = {
        0xe4,
        0xf1,
        0x105
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field final synthetic $animationState:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Landroidx/compose/animation/core/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u5170\u4e16;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $speed:F

.field final synthetic $targetScrollDelta:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Landroidx/compose/foundation/gestures/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u54f2\u696a\u5170\u4e16;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $targetValue:Lkotlin/jvm/internal/Ref$FloatRef;

.field final synthetic $this_dispatchMouseWheelScroll:Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;

.field final synthetic $threshold:F

.field I$0:I

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Landroidx/compose/foundation/gestures/飘花落叶言子苏哲世兰楪;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;FLandroidx/compose/foundation/gestures/飘花落叶言子苏哲世兰楪;FLandroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$FloatRef;",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Landroidx/compose/animation/core/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u5170\u4e16;",
            ">;",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Landroidx/compose/foundation/gestures/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u54f2\u696a\u5170\u4e16;",
            ">;F",
            "Landroidx/compose/foundation/gestures/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u54f2\u4e16\u5170\u696a;",
            "F",
            "Landroidx/compose/foundation/gestures/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u54f2\u5170\u696a\u4e16\u82cf;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->$targetValue:Lkotlin/jvm/internal/Ref$FloatRef;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->$animationState:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->$targetScrollDelta:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 6
    .line 7
    iput p4, p0, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->$threshold:F

    .line 8
    .line 9
    iput-object p5, p0, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->this$0:Landroidx/compose/foundation/gestures/飘花落叶言子苏哲世兰楪;

    .line 10
    .line 11
    iput p6, p0, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->$speed:F

    .line 12
    .line 13
    iput-object p7, p0, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->$this_dispatchMouseWheelScroll:Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1, p8}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private static final invokeSuspend$lambda$0(Landroidx/compose/foundation/gestures/飘花落叶言子苏哲世兰楪;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$FloatRef;Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;Lkotlin/jvm/internal/Ref$BooleanRef;F)Z
    .locals 9

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪苏世哲兰:Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪苏世哲兰(Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;)Landroidx/compose/foundation/gestures/飘花落叶言子苏哲楪兰世;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object p0, p0, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世兰苏哲:Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 11
    .line 12
    iget-wide v2, v0, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲楪兰世;->飘花落叶言子楪世苏兰哲:J

    .line 13
    .line 14
    iget-wide v4, v0, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲楪兰世;->飘花落叶言子楪世苏哲兰:J

    .line 15
    .line 16
    iget-object v6, p0, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v6, L飘花落叶言子世兰哲苏楪/飘花落叶言子楪世哲苏兰;

    .line 19
    .line 20
    const/16 v7, 0x20

    .line 21
    .line 22
    shr-long v7, v4, v7

    .line 23
    .line 24
    long-to-int v7, v7

    .line 25
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    invoke-virtual {v6, v7, v2, v3}, L飘花落叶言子世兰哲苏楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(FJ)V

    .line 30
    .line 31
    .line 32
    iget-object p0, p0, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, L飘花落叶言子世兰哲苏楪/飘花落叶言子楪世哲苏兰;

    .line 35
    .line 36
    const-wide v6, 0xffffffffL

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    and-long/2addr v4, v6

    .line 42
    long-to-int v4, v4

    .line 43
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    invoke-virtual {p0, v4, v2, v3}, L飘花落叶言子世兰哲苏楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(FJ)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲楪兰世;

    .line 53
    .line 54
    invoke-virtual {p0, v0}, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲楪兰世;->飘花落叶言子楪世苏哲兰(Landroidx/compose/foundation/gestures/飘花落叶言子苏哲楪兰世;)Landroidx/compose/foundation/gestures/飘花落叶言子苏哲楪兰世;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    iput-object p0, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 59
    .line 60
    iget-wide p0, p0, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲楪兰世;->飘花落叶言子楪世苏哲兰:J

    .line 61
    .line 62
    invoke-virtual {p3, p0, p1}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪世兰苏哲(J)J

    .line 63
    .line 64
    .line 65
    move-result-wide p0

    .line 66
    invoke-virtual {p3, p0, p1}, Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪苏哲世兰(J)F

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    iput p0, p2, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 71
    .line 72
    sub-float/2addr p0, p5

    .line 73
    invoke-static {p0}, Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏(F)Z

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    xor-int/2addr p0, v1

    .line 78
    iput-boolean p0, p4, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 79
    .line 80
    :cond_0
    if-eqz v0, :cond_1

    .line 81
    .line 82
    return v1

    .line 83
    :cond_1
    const/4 p0, 0x0

    .line 84
    return p0
.end method

.method public static synthetic 飘花落叶言子楪世苏兰哲(Landroidx/compose/foundation/gestures/飘花落叶言子苏哲世兰楪;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$FloatRef;Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;Lkotlin/jvm/internal/Ref$BooleanRef;F)Z
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->invokeSuspend$lambda$0(Landroidx/compose/foundation/gestures/飘花落叶言子苏哲世兰楪;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$FloatRef;Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;Lkotlin/jvm/internal/Ref$BooleanRef;F)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
    .locals 9
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
    new-instance v0, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->$targetValue:Lkotlin/jvm/internal/Ref$FloatRef;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->$animationState:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 6
    .line 7
    iget-object v3, p0, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->$targetScrollDelta:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 8
    .line 9
    iget v4, p0, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->$threshold:F

    .line 10
    .line 11
    iget-object v5, p0, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->this$0:Landroidx/compose/foundation/gestures/飘花落叶言子苏哲世兰楪;

    .line 12
    .line 13
    iget v6, p0, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->$speed:F

    .line 14
    .line 15
    iget-object v7, p0, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->$this_dispatchMouseWheelScroll:Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;

    .line 16
    .line 17
    move-object v8, p2

    .line 18
    invoke-direct/range {v0 .. v8}, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;-><init>(Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;FLandroidx/compose/foundation/gestures/飘花落叶言子苏哲世兰楪;FLandroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, v0, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->L$0:Ljava/lang/Object;

    .line 22
    .line 23
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
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->invoke(Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    sget-object v8, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 4
    .line 5
    iget v0, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->label:I

    .line 6
    .line 7
    const/4 v9, 0x0

    .line 8
    const/4 v10, 0x3

    .line 9
    const/4 v11, 0x2

    .line 10
    const/4 v12, 0x1

    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    if-eq v0, v12, :cond_2

    .line 14
    .line 15
    if-eq v0, v11, :cond_1

    .line 16
    .line 17
    if-ne v0, v10, :cond_0

    .line 18
    .line 19
    iget-object v0, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->L$2:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 22
    .line 23
    iget-object v1, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->L$1:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 26
    .line 27
    iget-object v2, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->L$0:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v2, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;

    .line 30
    .line 31
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    move-object v13, v0

    .line 35
    move-object v6, v2

    .line 36
    move-object/from16 v0, p1

    .line 37
    .line 38
    goto/16 :goto_3

    .line 39
    .line 40
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-object v9

    .line 46
    :cond_1
    iget v0, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->I$0:I

    .line 47
    .line 48
    iget-object v1, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->L$1:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 51
    .line 52
    iget-object v2, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->L$0:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v2, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;

    .line 55
    .line 56
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    move-object v13, v1

    .line 60
    move-object v14, v2

    .line 61
    goto/16 :goto_2

    .line 62
    .line 63
    :cond_2
    iget-object v0, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->L$2:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v0, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 66
    .line 67
    iget-object v1, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->L$1:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v1, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 70
    .line 71
    iget-object v2, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->L$0:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v2, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;

    .line 74
    .line 75
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    move-object v13, v0

    .line 79
    move-object v6, v2

    .line 80
    move v11, v12

    .line 81
    move-object/from16 v0, p1

    .line 82
    .line 83
    goto/16 :goto_6

    .line 84
    .line 85
    :cond_3
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    iget-object v0, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->L$0:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;

    .line 91
    .line 92
    new-instance v1, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 93
    .line 94
    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    .line 95
    .line 96
    .line 97
    iput-boolean v12, v1, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 98
    .line 99
    move-object v6, v0

    .line 100
    :goto_0
    iget-boolean v0, v1, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 101
    .line 102
    sget-object v19, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 103
    .line 104
    if-eqz v0, :cond_c

    .line 105
    .line 106
    const/4 v0, 0x0

    .line 107
    iput-boolean v0, v1, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 108
    .line 109
    iget-object v0, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->$targetValue:Lkotlin/jvm/internal/Ref$FloatRef;

    .line 110
    .line 111
    iget v0, v0, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 112
    .line 113
    iget-object v2, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->$animationState:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 114
    .line 115
    iget-object v2, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v2, Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;

    .line 118
    .line 119
    iget-object v2, v2, Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 120
    .line 121
    check-cast v2, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;

    .line 122
    .line 123
    invoke-virtual {v2}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->getValue()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    check-cast v2, Ljava/lang/Number;

    .line 128
    .line 129
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    sub-float/2addr v0, v2

    .line 134
    iget-object v2, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->$targetScrollDelta:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 135
    .line 136
    iget-object v2, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v2, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲楪兰世;

    .line 139
    .line 140
    iget-boolean v2, v2, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲楪兰世;->飘花落叶言子楪世哲苏兰:Z

    .line 141
    .line 142
    if-nez v2, :cond_4

    .line 143
    .line 144
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    iget v3, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->$threshold:F

    .line 149
    .line 150
    cmpg-float v2, v2, v3

    .line 151
    .line 152
    if-gez v2, :cond_5

    .line 153
    .line 154
    :cond_4
    move-object v13, v1

    .line 155
    goto/16 :goto_4

    .line 156
    .line 157
    :cond_5
    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    iget v2, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->$threshold:F

    .line 162
    .line 163
    mul-float/2addr v0, v2

    .line 164
    iget-object v2, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->this$0:Landroidx/compose/foundation/gestures/飘花落叶言子苏哲世兰楪;

    .line 165
    .line 166
    invoke-virtual {v2, v6, v0}, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世兰苏哲(Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;F)F

    .line 167
    .line 168
    .line 169
    iget-object v2, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->$animationState:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 170
    .line 171
    iget-object v3, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v3, Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;

    .line 174
    .line 175
    iget-object v4, v3, Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 176
    .line 177
    check-cast v4, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;

    .line 178
    .line 179
    invoke-virtual {v4}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->getValue()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    check-cast v4, Ljava/lang/Number;

    .line 184
    .line 185
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 186
    .line 187
    .line 188
    move-result v4

    .line 189
    add-float/2addr v4, v0

    .line 190
    const/4 v0, 0x0

    .line 191
    const/16 v5, 0x1e

    .line 192
    .line 193
    invoke-static {v3, v4, v0, v5}, Landroidx/compose/animation/core/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰(Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;FFI)Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    iput-object v0, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 198
    .line 199
    iget-object v0, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->$targetValue:Lkotlin/jvm/internal/Ref$FloatRef;

    .line 200
    .line 201
    iget v0, v0, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 202
    .line 203
    iget-object v2, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->$animationState:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 204
    .line 205
    iget-object v2, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v2, Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;

    .line 208
    .line 209
    iget-object v2, v2, Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 210
    .line 211
    check-cast v2, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;

    .line 212
    .line 213
    invoke-virtual {v2}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->getValue()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    check-cast v2, Ljava/lang/Number;

    .line 218
    .line 219
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    sub-float/2addr v0, v2

    .line 224
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    iget v2, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->$speed:F

    .line 229
    .line 230
    div-float/2addr v0, v2

    .line 231
    invoke-static {v0}, L飘花落叶言世子哲苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲苏楪兰(F)I

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    const/16 v2, 0x64

    .line 236
    .line 237
    if-le v0, v2, :cond_6

    .line 238
    .line 239
    move v0, v2

    .line 240
    :cond_6
    iget-object v14, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->this$0:Landroidx/compose/foundation/gestures/飘花落叶言子苏哲世兰楪;

    .line 241
    .line 242
    iget-object v2, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->$animationState:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 243
    .line 244
    iget-object v2, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v2, Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;

    .line 247
    .line 248
    iget-object v3, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->$targetValue:Lkotlin/jvm/internal/Ref$FloatRef;

    .line 249
    .line 250
    iget v4, v3, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 251
    .line 252
    iget-object v15, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->$targetScrollDelta:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 253
    .line 254
    iget-object v5, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->$this_dispatchMouseWheelScroll:Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;

    .line 255
    .line 256
    new-instance v13, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲世楪兰;

    .line 257
    .line 258
    move-object/from16 v18, v1

    .line 259
    .line 260
    move-object/from16 v16, v3

    .line 261
    .line 262
    move-object/from16 v17, v5

    .line 263
    .line 264
    invoke-direct/range {v13 .. v18}, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲世楪兰;-><init>(Landroidx/compose/foundation/gestures/飘花落叶言子苏哲世兰楪;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$FloatRef;Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;Lkotlin/jvm/internal/Ref$BooleanRef;)V

    .line 265
    .line 266
    .line 267
    move-object v1, v13

    .line 268
    move-object/from16 v13, v18

    .line 269
    .line 270
    iput-object v6, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->L$0:Ljava/lang/Object;

    .line 271
    .line 272
    iput-object v13, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->L$1:Ljava/lang/Object;

    .line 273
    .line 274
    iput-object v9, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->L$2:Ljava/lang/Object;

    .line 275
    .line 276
    iput v0, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->I$0:I

    .line 277
    .line 278
    iput v11, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->label:I

    .line 279
    .line 280
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    new-instance v3, Lkotlin/jvm/internal/Ref$FloatRef;

    .line 284
    .line 285
    invoke-direct {v3}, Lkotlin/jvm/internal/Ref$FloatRef;-><init>()V

    .line 286
    .line 287
    .line 288
    iget-object v5, v2, Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 289
    .line 290
    check-cast v5, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;

    .line 291
    .line 292
    invoke-virtual {v5}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->getValue()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v5

    .line 296
    check-cast v5, Ljava/lang/Number;

    .line 297
    .line 298
    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    .line 299
    .line 300
    .line 301
    move-result v5

    .line 302
    iput v5, v3, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 303
    .line 304
    new-instance v5, Ljava/lang/Float;

    .line 305
    .line 306
    invoke-direct {v5, v4}, Ljava/lang/Float;-><init>(F)V

    .line 307
    .line 308
    .line 309
    sget-object v4, Landroidx/compose/animation/core/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏兰哲:Landroidx/collection/飘花落叶言子楪苏世哲兰;

    .line 310
    .line 311
    invoke-static {v0, v11, v4}, Landroidx/compose/animation/core/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏(IILandroidx/compose/animation/core/飘花落叶言子楪兰哲世苏;)Landroidx/compose/animation/core/飘花落叶言子苏兰楪哲世;

    .line 312
    .line 313
    .line 314
    move-result-object v4

    .line 315
    move v15, v0

    .line 316
    move-object v0, v2

    .line 317
    move-object v2, v4

    .line 318
    new-instance v4, Landroidx/compose/foundation/gestures/飘花落叶言子楪哲兰苏世;

    .line 319
    .line 320
    invoke-direct {v4, v3, v14, v6, v1}, Landroidx/compose/foundation/gestures/飘花落叶言子楪哲兰苏世;-><init>(Lkotlin/jvm/internal/Ref$FloatRef;Landroidx/compose/foundation/gestures/飘花落叶言子苏哲世兰楪;Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;Landroidx/compose/foundation/gestures/飘花落叶言子苏哲世楪兰;)V

    .line 321
    .line 322
    .line 323
    const/4 v3, 0x1

    .line 324
    move-object v1, v5

    .line 325
    move-object v5, v7

    .line 326
    invoke-static/range {v0 .. v5}, Landroidx/compose/animation/core/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲兰世(Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;Ljava/lang/Object;Landroidx/compose/animation/core/飘花落叶言子楪苏哲世兰;ZL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 331
    .line 332
    if-ne v0, v1, :cond_7

    .line 333
    .line 334
    goto :goto_1

    .line 335
    :cond_7
    move-object/from16 v0, v19

    .line 336
    .line 337
    :goto_1
    if-ne v0, v8, :cond_8

    .line 338
    .line 339
    goto/16 :goto_5

    .line 340
    .line 341
    :cond_8
    move-object v14, v6

    .line 342
    move v0, v15

    .line 343
    :goto_2
    iget-boolean v1, v13, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 344
    .line 345
    if-nez v1, :cond_a

    .line 346
    .line 347
    iget-object v1, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->this$0:Landroidx/compose/foundation/gestures/飘花落叶言子苏哲世兰楪;

    .line 348
    .line 349
    move-object v2, v1

    .line 350
    iget-object v1, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->$targetScrollDelta:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 351
    .line 352
    move-object v3, v2

    .line 353
    iget-object v2, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->$targetValue:Lkotlin/jvm/internal/Ref$FloatRef;

    .line 354
    .line 355
    move-object v4, v3

    .line 356
    iget-object v3, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->$this_dispatchMouseWheelScroll:Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;

    .line 357
    .line 358
    move-object v5, v4

    .line 359
    iget-object v4, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->$animationState:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 360
    .line 361
    const-wide/16 v15, 0x32

    .line 362
    .line 363
    int-to-long v11, v0

    .line 364
    sub-long/2addr v15, v11

    .line 365
    iput-object v14, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->L$0:Ljava/lang/Object;

    .line 366
    .line 367
    iput-object v13, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->L$1:Ljava/lang/Object;

    .line 368
    .line 369
    iput-object v13, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->L$2:Ljava/lang/Object;

    .line 370
    .line 371
    iput v10, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->label:I

    .line 372
    .line 373
    move-object v0, v5

    .line 374
    move-wide v5, v15

    .line 375
    invoke-static/range {v0 .. v7}, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世哲兰苏(Landroidx/compose/foundation/gestures/飘花落叶言子苏哲世兰楪;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$FloatRef;Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;Lkotlin/jvm/internal/Ref$ObjectRef;JLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    if-ne v0, v8, :cond_9

    .line 380
    .line 381
    goto :goto_5

    .line 382
    :cond_9
    move-object v1, v13

    .line 383
    move-object v6, v14

    .line 384
    :goto_3
    check-cast v0, Ljava/lang/Boolean;

    .line 385
    .line 386
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 387
    .line 388
    .line 389
    move-result v0

    .line 390
    iput-boolean v0, v13, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 391
    .line 392
    const/4 v11, 0x2

    .line 393
    const/4 v12, 0x1

    .line 394
    goto/16 :goto_0

    .line 395
    .line 396
    :cond_a
    move-object v1, v13

    .line 397
    move-object v6, v14

    .line 398
    goto/16 :goto_0

    .line 399
    .line 400
    :goto_4
    iget-object v1, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->this$0:Landroidx/compose/foundation/gestures/飘花落叶言子苏哲世兰楪;

    .line 401
    .line 402
    invoke-virtual {v1, v6, v0}, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世兰苏哲(Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;F)F

    .line 403
    .line 404
    .line 405
    iget-object v0, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->this$0:Landroidx/compose/foundation/gestures/飘花落叶言子苏哲世兰楪;

    .line 406
    .line 407
    iget-object v1, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->$targetScrollDelta:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 408
    .line 409
    iget-object v2, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->$targetValue:Lkotlin/jvm/internal/Ref$FloatRef;

    .line 410
    .line 411
    iget-object v3, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->$this_dispatchMouseWheelScroll:Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;

    .line 412
    .line 413
    iget-object v4, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->$animationState:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 414
    .line 415
    iput-object v6, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->L$0:Ljava/lang/Object;

    .line 416
    .line 417
    iput-object v13, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->L$1:Ljava/lang/Object;

    .line 418
    .line 419
    iput-object v13, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->L$2:Ljava/lang/Object;

    .line 420
    .line 421
    const/4 v11, 0x1

    .line 422
    iput v11, v7, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$dispatchMouseWheelScroll$3;->label:I

    .line 423
    .line 424
    move-object v14, v6

    .line 425
    const-wide/16 v5, 0x32

    .line 426
    .line 427
    invoke-static/range {v0 .. v7}, Landroidx/compose/foundation/gestures/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世哲兰苏(Landroidx/compose/foundation/gestures/飘花落叶言子苏哲世兰楪;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$FloatRef;Landroidx/compose/foundation/gestures/飘花落叶言子哲兰楪世苏;Lkotlin/jvm/internal/Ref$ObjectRef;JLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    if-ne v0, v8, :cond_b

    .line 432
    .line 433
    :goto_5
    return-object v8

    .line 434
    :cond_b
    move-object v1, v13

    .line 435
    move-object v6, v14

    .line 436
    :goto_6
    check-cast v0, Ljava/lang/Boolean;

    .line 437
    .line 438
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 439
    .line 440
    .line 441
    move-result v0

    .line 442
    iput-boolean v0, v13, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 443
    .line 444
    move-object/from16 v7, p0

    .line 445
    .line 446
    move v12, v11

    .line 447
    const/4 v11, 0x2

    .line 448
    goto/16 :goto_0

    .line 449
    .line 450
    :cond_c
    return-object v19
.end method
