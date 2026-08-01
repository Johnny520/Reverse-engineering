.class final Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$4;
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
    c = "androidx.compose.foundation.gestures.TransformableStateKt$animateBy$4"
    f = "TransformableState.kt"
    l = {
        0x19d
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field final synthetic $animationSpec:Landroidx/compose/foundation/gestures/飘花落叶言子世楪哲兰苏;

.field final synthetic $centroid:J

.field final synthetic $previousState:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Landroidx/compose/foundation/gestures/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $targetState:Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;Landroidx/compose/foundation/gestures/飘花落叶言子世楪哲兰苏;JLkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Landroidx/compose/foundation/gestures/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;",
            ">;",
            "Landroidx/compose/foundation/gestures/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;",
            "Landroidx/compose/foundation/gestures/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;",
            "J",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$4;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$4;->$previousState:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$4;->$targetState:Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;

    .line 4
    .line 5
    iput-wide p4, p0, Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$4;->$centroid:J

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private static final invokeSuspend$lambda$0(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/foundation/gestures/飘花落叶言子兰楪苏哲世;JLandroidx/compose/animation/core/飘花落叶言子楪苏世兰哲;)Lkotlin/飘花落叶言子楪兰苏哲世;
    .locals 2

    .line 1
    iget-object p2, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p2, Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;

    .line 4
    .line 5
    iget p2, p2, Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:F

    .line 6
    .line 7
    const/4 p3, 0x0

    .line 8
    cmpg-float p2, p2, p3

    .line 9
    .line 10
    if-nez p2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object p2, p4, Landroidx/compose/animation/core/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 14
    .line 15
    check-cast p2, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;

    .line 16
    .line 17
    invoke-virtual {p2}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    check-cast p2, Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;

    .line 22
    .line 23
    iget p2, p2, Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:F

    .line 24
    .line 25
    iget-object p2, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p2, Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;

    .line 28
    .line 29
    iget p2, p2, Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:F

    .line 30
    .line 31
    :goto_0
    iget-object p2, p4, Landroidx/compose/animation/core/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 32
    .line 33
    move-object p3, p2

    .line 34
    check-cast p3, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;

    .line 35
    .line 36
    invoke-virtual {p3}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p3

    .line 40
    check-cast p3, Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;

    .line 41
    .line 42
    iget p3, p3, Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:F

    .line 43
    .line 44
    iget-object p3, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p3, Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;

    .line 47
    .line 48
    iget p3, p3, Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:F

    .line 49
    .line 50
    check-cast p2, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;

    .line 51
    .line 52
    invoke-virtual {p2}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p3

    .line 56
    check-cast p3, Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;

    .line 57
    .line 58
    iget-wide p3, p3, Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:J

    .line 59
    .line 60
    iget-object v0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v0, Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;

    .line 63
    .line 64
    iget-wide v0, v0, Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:J

    .line 65
    .line 66
    invoke-static {p3, p4, v0, v1}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(JJ)J

    .line 67
    .line 68
    .line 69
    invoke-interface {p1}, Landroidx/compose/foundation/gestures/飘花落叶言子兰楪苏哲世;->飘花落叶言子楪世苏哲兰()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->getValue()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iput-object p1, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 77
    .line 78
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 79
    .line 80
    return-object p0
.end method

.method public static synthetic 飘花落叶言子楪世苏兰哲(Lkotlin/jvm/internal/Ref$ObjectRef;JLandroidx/compose/animation/core/飘花落叶言子楪苏世兰哲;)Lkotlin/飘花落叶言子楪兰苏哲世;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0, p1, p2, p3}, Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$4;->invokeSuspend$lambda$0(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/foundation/gestures/飘花落叶言子兰楪苏哲世;JLandroidx/compose/animation/core/飘花落叶言子楪苏世兰哲;)Lkotlin/飘花落叶言子楪兰苏哲世;

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
    new-instance v0, Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$4;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$4;->$previousState:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$4;->$targetState:Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-wide v4, p0, Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$4;->$centroid:J

    .line 9
    .line 10
    move-object v6, p2

    .line 11
    invoke-direct/range {v0 .. v6}, Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$4;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;Landroidx/compose/foundation/gestures/飘花落叶言子世楪哲兰苏;JLkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$4;->L$0:Ljava/lang/Object;

    .line 15
    .line 16
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
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$4;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    move-result-object p0

    check-cast p0, Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$4;

    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$4;->invoke(Landroidx/compose/foundation/gestures/飘花落叶言子兰楪苏哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

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
    iget v1, p0, Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$4;->label:I

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
    iget-object p1, p0, Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$4;->L$0:Ljava/lang/Object;

    .line 25
    .line 26
    if-nez p1, :cond_3

    .line 27
    .line 28
    iget-object p1, p0, Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$4;->$previousState:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 29
    .line 30
    iget-object p1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 31
    .line 32
    sget-object v1, Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;

    .line 33
    .line 34
    sget-object v2, Landroidx/compose/foundation/gestures/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/gestures/飘花落叶言子楪苏哲世兰;

    .line 35
    .line 36
    invoke-static {v2, p1, v1}, Landroidx/compose/animation/core/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(Landroidx/compose/animation/core/飘花落叶言子苏兰世楪哲;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    iget-object v5, p0, Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$4;->$targetState:Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;

    .line 41
    .line 42
    iget-object p1, p0, Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$4;->$previousState:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 43
    .line 44
    iget-wide v1, p0, Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$4;->$centroid:J

    .line 45
    .line 46
    new-instance v8, Landroidx/compose/foundation/gestures/飘花落叶言子兰楪哲苏世;

    .line 47
    .line 48
    const/4 v6, 0x0

    .line 49
    invoke-direct {v8, p1, v1, v2, v6}, Landroidx/compose/foundation/gestures/飘花落叶言子兰楪哲苏世;-><init>(Ljava/io/Serializable;JI)V

    .line 50
    .line 51
    .line 52
    iput v3, p0, Landroidx/compose/foundation/gestures/TransformableStateKt$animateBy$4;->label:I

    .line 53
    .line 54
    const/4 v6, 0x0

    .line 55
    const/4 v7, 0x0

    .line 56
    const/4 v10, 0x4

    .line 57
    move-object v9, p0

    .line 58
    invoke-static/range {v4 .. v10}, Landroidx/compose/animation/core/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰世哲(Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;Ljava/lang/Object;Landroidx/compose/animation/core/飘花落叶言子楪苏哲世兰;ZL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    if-ne p0, v0, :cond_2

    .line 63
    .line 64
    return-object v0

    .line 65
    :cond_2
    :goto_0
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 66
    .line 67
    return-object p0

    .line 68
    :cond_3
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 69
    .line 70
    .line 71
    return-object v2
.end method
