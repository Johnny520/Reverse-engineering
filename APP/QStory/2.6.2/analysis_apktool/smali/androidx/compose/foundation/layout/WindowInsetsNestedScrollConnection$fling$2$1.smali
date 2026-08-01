.class final Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection$fling$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection$fling$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

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
        "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "<anonymous>",
        "(Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2$1"
    f = "WindowInsetsConnection.android.kt"
    l = {
        0x149
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field final synthetic $animationController:Landroid/view/WindowInsetsAnimationController;

.field final synthetic $current:I

.field final synthetic $endVelocity:Lkotlin/jvm/internal/Ref$FloatRef;

.field final synthetic $flingAmount:F

.field final synthetic $hidden:I

.field final synthetic $shown:I

.field final synthetic $spec:Landroidx/compose/foundation/layout/飘花落叶言子哲楪兰世苏;

.field final synthetic $targetShown:Z

.field label:I

.field final synthetic this$0:Landroidx/compose/foundation/layout/飘花落叶言子哲苏兰楪世;


# direct methods
.method public constructor <init>(IFLandroidx/compose/foundation/layout/飘花落叶言子哲楪兰世苏;IILandroidx/compose/foundation/layout/飘花落叶言子哲苏兰楪世;Lkotlin/jvm/internal/Ref$FloatRef;Landroid/view/WindowInsetsAnimationController;ZLkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IF",
            "Landroidx/compose/foundation/layout/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u54f2\u696a\u5170\u4e16\u82cf;",
            "II",
            "Landroidx/compose/foundation/layout/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u54f2\u82cf\u5170\u696a\u4e16;",
            "Lkotlin/jvm/internal/Ref$FloatRef;",
            "Landroid/view/WindowInsetsAnimationController;",
            "Z",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection$fling$2$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput p1, p0, Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection$fling$2$1;->$current:I

    .line 2
    .line 3
    iput p2, p0, Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection$fling$2$1;->$flingAmount:F

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection$fling$2$1;->$spec:Landroidx/compose/foundation/layout/飘花落叶言子哲楪兰世苏;

    .line 6
    .line 7
    iput p4, p0, Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection$fling$2$1;->$hidden:I

    .line 8
    .line 9
    iput p5, p0, Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection$fling$2$1;->$shown:I

    .line 10
    .line 11
    iput-object p7, p0, Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection$fling$2$1;->$endVelocity:Lkotlin/jvm/internal/Ref$FloatRef;

    .line 12
    .line 13
    iput-object p8, p0, Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection$fling$2$1;->$animationController:Landroid/view/WindowInsetsAnimationController;

    .line 14
    .line 15
    iput-boolean p9, p0, Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection$fling$2$1;->$targetShown:Z

    .line 16
    .line 17
    const/4 p1, 0x2

    .line 18
    invoke-direct {p0, p1, p10}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method private static final invokeSuspend$lambda$0(IILandroidx/compose/foundation/layout/飘花落叶言子哲苏兰楪世;Lkotlin/jvm/internal/Ref$FloatRef;Landroid/view/WindowInsetsAnimationController;ZFF)Lkotlin/飘花落叶言子楪兰苏哲世;
    .locals 0

    .line 1
    int-to-float p0, p0

    .line 2
    int-to-float p1, p1

    .line 3
    cmpg-float p1, p6, p1

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    if-gtz p1, :cond_0

    .line 7
    .line 8
    cmpg-float p0, p0, p6

    .line 9
    .line 10
    if-gtz p0, :cond_0

    .line 11
    .line 12
    throw p2

    .line 13
    :cond_0
    iput p7, p3, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 14
    .line 15
    invoke-static {p4, p5}, Landroidx/compose/foundation/layout/飘花落叶言子哲苏楪兰世;->飘花落叶言子楪兰世苏哲(Landroid/view/WindowInsetsAnimationController;Z)V

    .line 16
    .line 17
    .line 18
    throw p2
.end method

.method public static synthetic 飘花落叶言子楪世苏兰哲(IILkotlin/jvm/internal/Ref$FloatRef;Landroid/view/WindowInsetsAnimationController;ZFF)Lkotlin/飘花落叶言子楪兰苏哲世;
    .locals 8

    .line 1
    const/4 v2, 0x0

    .line 2
    move v0, p0

    .line 3
    move v1, p1

    .line 4
    move-object v3, p2

    .line 5
    move-object v4, p3

    .line 6
    move v5, p4

    .line 7
    move v6, p5

    .line 8
    move v7, p6

    .line 9
    invoke-static/range {v0 .. v7}, Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection$fling$2$1;->invokeSuspend$lambda$0(IILandroidx/compose/foundation/layout/飘花落叶言子哲苏兰楪世;Lkotlin/jvm/internal/Ref$FloatRef;Landroid/view/WindowInsetsAnimationController;ZFF)Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
    .locals 11
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
    new-instance v0, Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection$fling$2$1;

    .line 2
    .line 3
    iget v1, p0, Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection$fling$2$1;->$current:I

    .line 4
    .line 5
    iget v2, p0, Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection$fling$2$1;->$flingAmount:F

    .line 6
    .line 7
    iget-object v3, p0, Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection$fling$2$1;->$spec:Landroidx/compose/foundation/layout/飘花落叶言子哲楪兰世苏;

    .line 8
    .line 9
    iget v4, p0, Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection$fling$2$1;->$hidden:I

    .line 10
    .line 11
    iget v5, p0, Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection$fling$2$1;->$shown:I

    .line 12
    .line 13
    iget-object v7, p0, Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection$fling$2$1;->$endVelocity:Lkotlin/jvm/internal/Ref$FloatRef;

    .line 14
    .line 15
    iget-object v8, p0, Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection$fling$2$1;->$animationController:Landroid/view/WindowInsetsAnimationController;

    .line 16
    .line 17
    iget-boolean v9, p0, Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection$fling$2$1;->$targetShown:Z

    .line 18
    .line 19
    const/4 v6, 0x0

    .line 20
    move-object v10, p2

    .line 21
    invoke-direct/range {v0 .. v10}, Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection$fling$2$1;-><init>(IFLandroidx/compose/foundation/layout/飘花落叶言子哲楪兰世苏;IILandroidx/compose/foundation/layout/飘花落叶言子哲苏兰楪世;Lkotlin/jvm/internal/Ref$FloatRef;Landroid/view/WindowInsetsAnimationController;ZLkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection$fling$2$1;->invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

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
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection$fling$2$1;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection$fling$2$1;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection$fling$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection$fling$2$1;->label:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    sget-object v3, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-ne v1, v4, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-object v3

    .line 17
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 18
    .line 19
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-object v2

    .line 23
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget p1, p0, Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection$fling$2$1;->$current:I

    .line 27
    .line 28
    int-to-float p1, p1

    .line 29
    iget v1, p0, Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection$fling$2$1;->$flingAmount:F

    .line 30
    .line 31
    iget v6, p0, Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection$fling$2$1;->$hidden:I

    .line 32
    .line 33
    iget v7, p0, Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection$fling$2$1;->$shown:I

    .line 34
    .line 35
    iget-object v8, p0, Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection$fling$2$1;->$endVelocity:Lkotlin/jvm/internal/Ref$FloatRef;

    .line 36
    .line 37
    iget-object v9, p0, Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection$fling$2$1;->$animationController:Landroid/view/WindowInsetsAnimationController;

    .line 38
    .line 39
    iget-boolean v10, p0, Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection$fling$2$1;->$targetShown:Z

    .line 40
    .line 41
    new-instance v5, Landroidx/compose/foundation/layout/飘花落叶言子哲苏世楪兰;

    .line 42
    .line 43
    invoke-direct/range {v5 .. v10}, Landroidx/compose/foundation/layout/飘花落叶言子哲苏世楪兰;-><init>(IILkotlin/jvm/internal/Ref$FloatRef;Landroid/view/WindowInsetsAnimationController;Z)V

    .line 44
    .line 45
    .line 46
    iput v4, p0, Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection$fling$2$1;->label:I

    .line 47
    .line 48
    new-instance v7, Landroidx/compose/animation/core/飘花落叶言子楪哲兰苏世;

    .line 49
    .line 50
    new-instance v4, Landroidx/compose/animation/core/飘花落叶言子楪兰世哲苏;

    .line 51
    .line 52
    invoke-direct {v4, v2}, Landroidx/compose/animation/core/飘花落叶言子楪兰世哲苏;-><init>(Landroidx/compose/animation/core/飘花落叶言子世楪哲苏兰;)V

    .line 53
    .line 54
    .line 55
    sget-object v2, Landroidx/compose/animation/core/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲兰世:Landroidx/compose/animation/core/飘花落叶言子苏兰世哲楪;

    .line 56
    .line 57
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    new-instance v8, Landroidx/compose/animation/core/飘花落叶言子楪苏兰世哲;

    .line 62
    .line 63
    invoke-direct {v8, v1}, Landroidx/compose/animation/core/飘花落叶言子楪苏兰世哲;-><init>(F)V

    .line 64
    .line 65
    .line 66
    invoke-direct {v7, v4, v2, v6, v8}, Landroidx/compose/animation/core/飘花落叶言子楪哲兰苏世;-><init>(Landroidx/compose/animation/core/飘花落叶言子楪兰世苏哲;Landroidx/compose/animation/core/飘花落叶言子苏兰世楪哲;Ljava/lang/Object;Landroidx/compose/animation/core/飘花落叶言子楪哲苏世兰;)V

    .line 67
    .line 68
    .line 69
    const/16 v2, 0x1c

    .line 70
    .line 71
    invoke-static {p1, v1, v2}, Landroidx/compose/animation/core/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(FFI)Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    new-instance v10, Landroidx/compose/animation/core/飘花落叶言子苏楪哲世兰;

    .line 76
    .line 77
    const/4 p1, 0x0

    .line 78
    invoke-direct {v10, v5, p1}, Landroidx/compose/animation/core/飘花落叶言子苏楪哲世兰;-><init>(Lkotlin/飘花落叶言子楪世兰苏哲;I)V

    .line 79
    .line 80
    .line 81
    const-wide/high16 v8, -0x8000000000000000L

    .line 82
    .line 83
    move-object v11, p0

    .line 84
    invoke-static/range {v6 .. v11}, Landroidx/compose/animation/core/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;Landroidx/compose/animation/core/飘花落叶言子楪世兰哲苏;JL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    if-ne p0, v0, :cond_2

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_2
    move-object p0, v3

    .line 92
    :goto_0
    if-ne p0, v0, :cond_3

    .line 93
    .line 94
    return-object v0

    .line 95
    :cond_3
    return-object v3
.end method
