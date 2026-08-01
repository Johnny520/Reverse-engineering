.class final Landroidx/compose/foundation/gestures/DefaultFlingBehavior$performFling$2;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;",
        "",
        "<anonymous>",
        "(Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;)F"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2"
    f = "Scrollable.kt"
    l = {
        0x437
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field final synthetic $initialVelocity:F

.field final synthetic $this_performFling:Landroidx/compose/foundation/gestures/飘花落叶言子哲楪世苏兰;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Landroidx/compose/foundation/gestures/飘花落叶言子楪兰哲世苏;


# direct methods
.method public constructor <init>(FLandroidx/compose/foundation/gestures/飘花落叶言子楪兰哲世苏;Landroidx/compose/foundation/gestures/飘花落叶言子哲楪世苏兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F",
            "Landroidx/compose/foundation/gestures/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u54f2\u4e16\u82cf;",
            "Landroidx/compose/foundation/gestures/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u54f2\u696a\u4e16\u82cf\u5170;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Landroidx/compose/foundation/gestures/DefaultFlingBehavior$performFling$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput p1, p0, Landroidx/compose/foundation/gestures/DefaultFlingBehavior$performFling$2;->$initialVelocity:F

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/foundation/gestures/DefaultFlingBehavior$performFling$2;->this$0:Landroidx/compose/foundation/gestures/飘花落叶言子楪兰哲世苏;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/foundation/gestures/DefaultFlingBehavior$performFling$2;->$this_performFling:Landroidx/compose/foundation/gestures/飘花落叶言子哲楪世苏兰;

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

.method private static final invokeSuspend$lambda$0(Lkotlin/jvm/internal/Ref$FloatRef;Landroidx/compose/foundation/gestures/飘花落叶言子哲楪世苏兰;Lkotlin/jvm/internal/Ref$FloatRef;Landroidx/compose/foundation/gestures/飘花落叶言子楪兰哲世苏;Landroidx/compose/animation/core/飘花落叶言子楪苏世兰哲;)Lkotlin/飘花落叶言子楪兰苏哲世;
    .locals 2

    .line 1
    iget-object v0, p4, Landroidx/compose/animation/core/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 2
    .line 3
    check-cast v0, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget v1, p0, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 16
    .line 17
    sub-float/2addr v0, v1

    .line 18
    invoke-interface {p1, v0}, Landroidx/compose/foundation/gestures/飘花落叶言子哲楪世苏兰;->飘花落叶言子楪世兰哲苏(F)F

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    iget-object v1, p4, Landroidx/compose/animation/core/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 23
    .line 24
    check-cast v1, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;

    .line 25
    .line 26
    invoke-virtual {v1}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Ljava/lang/Number;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    iput v1, p0, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 37
    .line 38
    invoke-virtual {p4}, Landroidx/compose/animation/core/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    check-cast p0, Ljava/lang/Number;

    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    iput p0, p2, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 49
    .line 50
    sub-float/2addr v0, p1

    .line 51
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    const/high16 p1, 0x3f000000    # 0.5f

    .line 56
    .line 57
    cmpl-float p0, p0, p1

    .line 58
    .line 59
    if-lez p0, :cond_0

    .line 60
    .line 61
    invoke-virtual {p4}, Landroidx/compose/animation/core/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰()V

    .line 62
    .line 63
    .line 64
    :cond_0
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 68
    .line 69
    return-object p0
.end method

.method public static synthetic 飘花落叶言子楪世苏兰哲(Lkotlin/jvm/internal/Ref$FloatRef;Landroidx/compose/foundation/gestures/飘花落叶言子哲楪世苏兰;Lkotlin/jvm/internal/Ref$FloatRef;Landroidx/compose/foundation/gestures/飘花落叶言子楪兰哲世苏;Landroidx/compose/animation/core/飘花落叶言子楪苏世兰哲;)Lkotlin/飘花落叶言子楪兰苏哲世;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/gestures/DefaultFlingBehavior$performFling$2;->invokeSuspend$lambda$0(Lkotlin/jvm/internal/Ref$FloatRef;Landroidx/compose/foundation/gestures/飘花落叶言子哲楪世苏兰;Lkotlin/jvm/internal/Ref$FloatRef;Landroidx/compose/foundation/gestures/飘花落叶言子楪兰哲世苏;Landroidx/compose/animation/core/飘花落叶言子楪苏世兰哲;)Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
    .locals 2
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
    new-instance p1, Landroidx/compose/foundation/gestures/DefaultFlingBehavior$performFling$2;

    .line 2
    .line 3
    iget v0, p0, Landroidx/compose/foundation/gestures/DefaultFlingBehavior$performFling$2;->$initialVelocity:F

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/compose/foundation/gestures/DefaultFlingBehavior$performFling$2;->this$0:Landroidx/compose/foundation/gestures/飘花落叶言子楪兰哲世苏;

    .line 6
    .line 7
    iget-object p0, p0, Landroidx/compose/foundation/gestures/DefaultFlingBehavior$performFling$2;->$this_performFling:Landroidx/compose/foundation/gestures/飘花落叶言子哲楪世苏兰;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, p0, p2}, Landroidx/compose/foundation/gestures/DefaultFlingBehavior$performFling$2;-><init>(FLandroidx/compose/foundation/gestures/飘花落叶言子楪兰哲世苏;Landroidx/compose/foundation/gestures/飘花落叶言子哲楪世苏兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/DefaultFlingBehavior$performFling$2;->invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Ljava/lang/Float;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/DefaultFlingBehavior$performFling$2;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroidx/compose/foundation/gestures/DefaultFlingBehavior$performFling$2;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/gestures/DefaultFlingBehavior$performFling$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Landroidx/compose/foundation/gestures/DefaultFlingBehavior$performFling$2;->label:I

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
    iget-object v0, p0, Landroidx/compose/foundation/gestures/DefaultFlingBehavior$performFling$2;->L$1:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;

    .line 13
    .line 14
    iget-object p0, p0, Landroidx/compose/foundation/gestures/DefaultFlingBehavior$performFling$2;->L$0:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Lkotlin/jvm/internal/Ref$FloatRef;

    .line 17
    .line 18
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    return-object p0

    .line 29
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget p1, p0, Landroidx/compose/foundation/gestures/DefaultFlingBehavior$performFling$2;->$initialVelocity:F

    .line 33
    .line 34
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    const/high16 v1, 0x3f800000    # 1.0f

    .line 39
    .line 40
    cmpl-float p1, p1, v1

    .line 41
    .line 42
    if-lez p1, :cond_3

    .line 43
    .line 44
    new-instance v6, Lkotlin/jvm/internal/Ref$FloatRef;

    .line 45
    .line 46
    invoke-direct {v6}, Lkotlin/jvm/internal/Ref$FloatRef;-><init>()V

    .line 47
    .line 48
    .line 49
    iget p1, p0, Landroidx/compose/foundation/gestures/DefaultFlingBehavior$performFling$2;->$initialVelocity:F

    .line 50
    .line 51
    iput p1, v6, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 52
    .line 53
    new-instance v4, Lkotlin/jvm/internal/Ref$FloatRef;

    .line 54
    .line 55
    invoke-direct {v4}, Lkotlin/jvm/internal/Ref$FloatRef;-><init>()V

    .line 56
    .line 57
    .line 58
    iget p1, p0, Landroidx/compose/foundation/gestures/DefaultFlingBehavior$performFling$2;->$initialVelocity:F

    .line 59
    .line 60
    const/16 v1, 0x1c

    .line 61
    .line 62
    const/4 v3, 0x0

    .line 63
    invoke-static {v3, p1, v1}, Landroidx/compose/animation/core/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(FFI)Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    :try_start_1
    iget-object v7, p0, Landroidx/compose/foundation/gestures/DefaultFlingBehavior$performFling$2;->this$0:Landroidx/compose/foundation/gestures/飘花落叶言子楪兰哲世苏;

    .line 68
    .line 69
    iget-object v1, v7, Landroidx/compose/foundation/gestures/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/animation/core/飘花落叶言子楪兰世苏哲;

    .line 70
    .line 71
    iget-object v5, p0, Landroidx/compose/foundation/gestures/DefaultFlingBehavior$performFling$2;->$this_performFling:Landroidx/compose/foundation/gestures/飘花落叶言子哲楪世苏兰;

    .line 72
    .line 73
    new-instance v3, Landroidx/compose/foundation/gestures/飘花落叶言子楪哲兰苏世;

    .line 74
    .line 75
    const/4 v8, 0x1

    .line 76
    invoke-direct/range {v3 .. v8}, Landroidx/compose/foundation/gestures/飘花落叶言子楪哲兰苏世;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 77
    .line 78
    .line 79
    iput-object v6, p0, Landroidx/compose/foundation/gestures/DefaultFlingBehavior$performFling$2;->L$0:Ljava/lang/Object;

    .line 80
    .line 81
    iput-object p1, p0, Landroidx/compose/foundation/gestures/DefaultFlingBehavior$performFling$2;->L$1:Ljava/lang/Object;

    .line 82
    .line 83
    iput v2, p0, Landroidx/compose/foundation/gestures/DefaultFlingBehavior$performFling$2;->label:I

    .line 84
    .line 85
    const/4 v2, 0x0

    .line 86
    invoke-static {p1, v1, v2, v3, p0}, Landroidx/compose/animation/core/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲(Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;Landroidx/compose/animation/core/飘花落叶言子楪兰世苏哲;ZL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 90
    if-ne p0, v0, :cond_2

    .line 91
    .line 92
    return-object v0

    .line 93
    :cond_2
    move-object p0, v6

    .line 94
    goto :goto_0

    .line 95
    :catch_0
    move-object v0, p1

    .line 96
    move-object p0, v6

    .line 97
    :catch_1
    invoke-virtual {v0}, Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    check-cast p1, Ljava/lang/Number;

    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    iput p1, p0, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 108
    .line 109
    :goto_0
    iget p0, p0, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_3
    iget p0, p0, Landroidx/compose/foundation/gestures/DefaultFlingBehavior$performFling$2;->$initialVelocity:F

    .line 113
    .line 114
    :goto_1
    new-instance p1, Ljava/lang/Float;

    .line 115
    .line 116
    invoke-direct {p1, p0}, Ljava/lang/Float;-><init>(F)V

    .line 117
    .line 118
    .line 119
    return-object p1
.end method
