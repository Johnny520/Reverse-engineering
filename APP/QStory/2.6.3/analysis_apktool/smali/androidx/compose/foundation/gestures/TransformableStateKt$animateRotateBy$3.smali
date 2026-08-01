.class final Landroidx/compose/foundation/gestures/TransformableStateKt$animateRotateBy$3;
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
        "Landroidx/compose/foundation/gestures/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u5170\u696a\u82cf\u54f2\u4e16;",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "<anonymous>",
        "(Landroidx/compose/foundation/gestures/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u5170\u696a\u82cf\u54f2\u4e16;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "androidx.compose.foundation.gestures.TransformableStateKt$animateRotateBy$3"
    f = "TransformableState.kt"
    l = {
        0x120
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field final synthetic $animationSpec:Landroidx/compose/animation/core/飘花落叶言子楪苏哲世兰;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u4e16\u5170;"
        }
    .end annotation
.end field

.field final synthetic $centroid:J

.field final synthetic $degrees:F

.field final synthetic $previous:Lkotlin/jvm/internal/Ref$FloatRef;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/Ref$FloatRef;FLandroidx/compose/animation/core/飘花落叶言子楪苏哲世兰;JLkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$FloatRef;",
            "F",
            "Landroidx/compose/animation/core/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u4e16\u5170;",
            "J",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Landroidx/compose/foundation/gestures/TransformableStateKt$animateRotateBy$3;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/gestures/TransformableStateKt$animateRotateBy$3;->$previous:Lkotlin/jvm/internal/Ref$FloatRef;

    .line 2
    .line 3
    iput p2, p0, Landroidx/compose/foundation/gestures/TransformableStateKt$animateRotateBy$3;->$degrees:F

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/foundation/gestures/TransformableStateKt$animateRotateBy$3;->$animationSpec:Landroidx/compose/animation/core/飘花落叶言子楪苏哲世兰;

    .line 6
    .line 7
    iput-wide p4, p0, Landroidx/compose/foundation/gestures/TransformableStateKt$animateRotateBy$3;->$centroid:J

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private static final invokeSuspend$lambda$0(Lkotlin/jvm/internal/Ref$FloatRef;Landroidx/compose/foundation/gestures/飘花落叶言子兰楪苏哲世;JLandroidx/compose/animation/core/飘花落叶言子楪苏世兰哲;)Lkotlin/飘花落叶言子楪兰苏哲世;
    .locals 0

    .line 1
    iget-object p1, p4, Landroidx/compose/animation/core/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 2
    .line 3
    check-cast p1, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;

    .line 4
    .line 5
    invoke-virtual {p1}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 12
    .line 13
    .line 14
    iget p0, p0, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    throw p0
.end method

.method public static synthetic 飘花落叶言子楪世苏兰哲(Lkotlin/jvm/internal/Ref$FloatRef;JLandroidx/compose/animation/core/飘花落叶言子楪苏世兰哲;)Lkotlin/飘花落叶言子楪兰苏哲世;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0, p1, p2, p3}, Landroidx/compose/foundation/gestures/TransformableStateKt$animateRotateBy$3;->invokeSuspend$lambda$0(Lkotlin/jvm/internal/Ref$FloatRef;Landroidx/compose/foundation/gestures/飘花落叶言子兰楪苏哲世;JLandroidx/compose/animation/core/飘花落叶言子楪苏世兰哲;)Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
    .locals 7
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
    new-instance v0, Landroidx/compose/foundation/gestures/TransformableStateKt$animateRotateBy$3;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/gestures/TransformableStateKt$animateRotateBy$3;->$previous:Lkotlin/jvm/internal/Ref$FloatRef;

    .line 4
    .line 5
    iget v2, p0, Landroidx/compose/foundation/gestures/TransformableStateKt$animateRotateBy$3;->$degrees:F

    .line 6
    .line 7
    iget-object v3, p0, Landroidx/compose/foundation/gestures/TransformableStateKt$animateRotateBy$3;->$animationSpec:Landroidx/compose/animation/core/飘花落叶言子楪苏哲世兰;

    .line 8
    .line 9
    iget-wide v4, p0, Landroidx/compose/foundation/gestures/TransformableStateKt$animateRotateBy$3;->$centroid:J

    .line 10
    .line 11
    move-object v6, p2

    .line 12
    invoke-direct/range {v0 .. v6}, Landroidx/compose/foundation/gestures/TransformableStateKt$animateRotateBy$3;-><init>(Lkotlin/jvm/internal/Ref$FloatRef;FLandroidx/compose/animation/core/飘花落叶言子楪苏哲世兰;JLkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Landroidx/compose/foundation/gestures/TransformableStateKt$animateRotateBy$3;->L$0:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Landroidx/compose/foundation/gestures/飘花落叶言子兰楪苏哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/gestures/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u5170\u696a\u82cf\u54f2\u4e16;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 16
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/TransformableStateKt$animateRotateBy$3;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    move-result-object p0

    check-cast p0, Landroidx/compose/foundation/gestures/TransformableStateKt$animateRotateBy$3;

    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/gestures/TransformableStateKt$animateRotateBy$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/TransformableStateKt$animateRotateBy$3;->invoke(Landroidx/compose/foundation/gestures/飘花落叶言子兰楪苏哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :cond_0
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Landroidx/compose/foundation/gestures/TransformableStateKt$animateRotateBy$3;->label:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    if-ne v1, v3, :cond_0

    .line 10
    .line 11
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 16
    .line 17
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-object v2

    .line 21
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Landroidx/compose/foundation/gestures/TransformableStateKt$animateRotateBy$3;->L$0:Ljava/lang/Object;

    .line 25
    .line 26
    if-nez p1, :cond_3

    .line 27
    .line 28
    iget-object p1, p0, Landroidx/compose/foundation/gestures/TransformableStateKt$animateRotateBy$3;->$previous:Lkotlin/jvm/internal/Ref$FloatRef;

    .line 29
    .line 30
    iget p1, p1, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    const/16 v2, 0x1e

    .line 34
    .line 35
    invoke-static {p1, v1, v2}, Landroidx/compose/animation/core/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(FFI)Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    iget p1, p0, Landroidx/compose/foundation/gestures/TransformableStateKt$animateRotateBy$3;->$degrees:F

    .line 40
    .line 41
    new-instance v5, Ljava/lang/Float;

    .line 42
    .line 43
    invoke-direct {v5, p1}, Ljava/lang/Float;-><init>(F)V

    .line 44
    .line 45
    .line 46
    iget-object v6, p0, Landroidx/compose/foundation/gestures/TransformableStateKt$animateRotateBy$3;->$animationSpec:Landroidx/compose/animation/core/飘花落叶言子楪苏哲世兰;

    .line 47
    .line 48
    iget-object p1, p0, Landroidx/compose/foundation/gestures/TransformableStateKt$animateRotateBy$3;->$previous:Lkotlin/jvm/internal/Ref$FloatRef;

    .line 49
    .line 50
    iget-wide v1, p0, Landroidx/compose/foundation/gestures/TransformableStateKt$animateRotateBy$3;->$centroid:J

    .line 51
    .line 52
    new-instance v8, Landroidx/compose/foundation/gestures/飘花落叶言子兰世楪苏哲;

    .line 53
    .line 54
    const/4 v7, 0x0

    .line 55
    invoke-direct {v8, p1, v1, v2, v7}, Landroidx/compose/foundation/gestures/飘花落叶言子兰世楪苏哲;-><init>(Lkotlin/jvm/internal/Ref$FloatRef;JI)V

    .line 56
    .line 57
    .line 58
    iput v3, p0, Landroidx/compose/foundation/gestures/TransformableStateKt$animateRotateBy$3;->label:I

    .line 59
    .line 60
    const/4 v10, 0x4

    .line 61
    move-object v9, p0

    .line 62
    invoke-static/range {v4 .. v10}, Landroidx/compose/animation/core/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰世哲(Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;Ljava/lang/Object;Landroidx/compose/animation/core/飘花落叶言子楪苏哲世兰;ZL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    if-ne p0, v0, :cond_2

    .line 67
    .line 68
    return-object v0

    .line 69
    :cond_2
    :goto_0
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 70
    .line 71
    return-object p0

    .line 72
    :cond_3
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 73
    .line 74
    .line 75
    return-object v2
.end method
