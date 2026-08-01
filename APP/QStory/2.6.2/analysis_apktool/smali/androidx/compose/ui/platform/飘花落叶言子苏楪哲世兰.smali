.class public final Landroidx/compose/ui/platform/飘花落叶言子苏楪哲世兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

.field public final 飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/platform/飘花落叶言子苏楪哲世兰;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/飘花落叶言子苏楪哲世兰;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/platform/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/platform/飘花落叶言子苏楪哲世兰;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    invoke-static {p1}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰哲苏(Ljava/lang/Object;)Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Landroidx/compose/ui/platform/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世苏兰哲:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/node/飘花落叶言子苏哲世兰楪;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Lkotlin/coroutines/intrinsics/CoroutineSingletons;
    .locals 5

    .line 1
    instance-of v0, p3, Landroidx/compose/ui/platform/ChainedPlatformTextInputInterceptor$textInputSession$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Landroidx/compose/ui/platform/ChainedPlatformTextInputInterceptor$textInputSession$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/ui/platform/ChainedPlatformTextInputInterceptor$textInputSession$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/compose/ui/platform/ChainedPlatformTextInputInterceptor$textInputSession$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/compose/ui/platform/ChainedPlatformTextInputInterceptor$textInputSession$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Landroidx/compose/ui/platform/ChainedPlatformTextInputInterceptor$textInputSession$1;-><init>(Landroidx/compose/ui/platform/飘花落叶言子苏楪哲世兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Landroidx/compose/ui/platform/ChainedPlatformTextInputInterceptor$textInputSession$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Landroidx/compose/ui/platform/ChainedPlatformTextInputInterceptor$textInputSession$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-eq v2, v4, :cond_1

    .line 36
    .line 37
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 38
    .line 39
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-object v3

    .line 43
    :cond_1
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    new-instance p3, Landroidx/compose/ui/platform/ChainedPlatformTextInputInterceptor$textInputSession$2;

    .line 51
    .line 52
    invoke-direct {p3, p2, p0, v3}, Landroidx/compose/ui/platform/ChainedPlatformTextInputInterceptor$textInputSession$2;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Landroidx/compose/ui/platform/飘花落叶言子苏楪哲世兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 53
    .line 54
    .line 55
    iput v4, v0, Landroidx/compose/ui/platform/ChainedPlatformTextInputInterceptor$textInputSession$1;->label:I

    .line 56
    .line 57
    iget-object p0, p0, Landroidx/compose/ui/platform/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/platform/飘花落叶言子苏楪哲世兰;

    .line 58
    .line 59
    invoke-static {p1, p0, p3, v0}, Landroidx/compose/ui/platform/飘花落叶言子哲世兰楪苏;->飘花落叶言子楪世苏兰哲(Landroidx/compose/ui/node/飘花落叶言子苏哲世兰楪;Landroidx/compose/ui/platform/飘花落叶言子苏楪哲世兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    if-ne p0, v1, :cond_3

    .line 64
    .line 65
    return-object v1

    .line 66
    :cond_3
    :goto_1
    invoke-static {}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲()V

    .line 67
    .line 68
    .line 69
    return-object v3
.end method
