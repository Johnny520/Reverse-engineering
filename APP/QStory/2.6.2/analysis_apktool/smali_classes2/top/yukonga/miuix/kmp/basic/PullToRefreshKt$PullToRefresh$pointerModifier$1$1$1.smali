.class final Ltop/yukonga/miuix/kmp/basic/PullToRefreshKt$PullToRefresh$pointerModifier$1$1$1;
.super Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Landroidx/compose/ui/input/pointer/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "<anonymous>",
        "(Landroidx/compose/ui/input/pointer/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "top.yukonga.miuix.kmp.basic.PullToRefreshKt$PullToRefresh$pointerModifier$1$1$1"
    f = "PullToRefresh.kt"
    l = {
        0x92
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic $coroutineScope:Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

.field final synthetic $currentOnRefresh$delegate:Landroidx/compose/runtime/飘花落叶言子哲兰世楪苏;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u54f2\u5170\u4e16\u696a\u82cf;"
        }
    .end annotation
.end field

.field final synthetic $pullToRefreshState:Ltop/yukonga/miuix/kmp/basic/飘花落叶言子世楪苏哲兰;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Ltop/yukonga/miuix/kmp/basic/飘花落叶言子世楪苏哲兰;Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Landroidx/compose/runtime/飘花落叶言子哲兰世楪苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltop/yukonga/miuix/kmp/basic/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u82cf\u54f2\u5170;",
            "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;",
            "Landroidx/compose/runtime/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u54f2\u5170\u4e16\u696a\u82cf;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Ltop/yukonga/miuix/kmp/basic/PullToRefreshKt$PullToRefresh$pointerModifier$1$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p2, p0, Ltop/yukonga/miuix/kmp/basic/PullToRefreshKt$PullToRefresh$pointerModifier$1$1$1;->$coroutineScope:Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    .line 2
    .line 3
    iput-object p3, p0, Ltop/yukonga/miuix/kmp/basic/PullToRefreshKt$PullToRefresh$pointerModifier$1$1$1;->$currentOnRefresh$delegate:Landroidx/compose/runtime/飘花落叶言子哲兰世楪苏;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 7
    .line 8
    .line 9
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
    new-instance v0, Ltop/yukonga/miuix/kmp/basic/PullToRefreshKt$PullToRefresh$pointerModifier$1$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Ltop/yukonga/miuix/kmp/basic/PullToRefreshKt$PullToRefresh$pointerModifier$1$1$1;->$coroutineScope:Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    .line 4
    .line 5
    iget-object p0, p0, Ltop/yukonga/miuix/kmp/basic/PullToRefreshKt$PullToRefresh$pointerModifier$1$1$1;->$currentOnRefresh$delegate:Landroidx/compose/runtime/飘花落叶言子哲兰世楪苏;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v0, v2, v1, p0, p2}, Ltop/yukonga/miuix/kmp/basic/PullToRefreshKt$PullToRefresh$pointerModifier$1$1$1;-><init>(Ltop/yukonga/miuix/kmp/basic/飘花落叶言子世楪苏哲兰;Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Landroidx/compose/runtime/飘花落叶言子哲兰世楪苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, v0, Ltop/yukonga/miuix/kmp/basic/PullToRefreshKt$PullToRefresh$pointerModifier$1$1$1;->L$0:Ljava/lang/Object;

    .line 12
    .line 13
    return-object v0
.end method

.method public final invoke(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Ltop/yukonga/miuix/kmp/basic/PullToRefreshKt$PullToRefresh$pointerModifier$1$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ltop/yukonga/miuix/kmp/basic/PullToRefreshKt$PullToRefresh$pointerModifier$1$1$1;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ltop/yukonga/miuix/kmp/basic/PullToRefreshKt$PullToRefresh$pointerModifier$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    check-cast p1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Ltop/yukonga/miuix/kmp/basic/PullToRefreshKt$PullToRefresh$pointerModifier$1$1$1;->invoke(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Ltop/yukonga/miuix/kmp/basic/PullToRefreshKt$PullToRefresh$pointerModifier$1$1$1;->L$0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 4
    .line 5
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 6
    .line 7
    iget v2, p0, Ltop/yukonga/miuix/kmp/basic/PullToRefreshKt$PullToRefresh$pointerModifier$1$1$1;->label:I

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    if-eq v2, v3, :cond_0

    .line 13
    .line 14
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
    :cond_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Ltop/yukonga/miuix/kmp/basic/PullToRefreshKt$PullToRefresh$pointerModifier$1$1$1;->L$0:Ljava/lang/Object;

    .line 29
    .line 30
    iput v3, p0, Ltop/yukonga/miuix/kmp/basic/PullToRefreshKt$PullToRefresh$pointerModifier$1$1$1;->label:I

    .line 31
    .line 32
    invoke-static {v0, p0}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;->飘花落叶言子苏楪世哲兰(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    if-ne p1, v1, :cond_2

    .line 37
    .line 38
    return-object v1

    .line 39
    :cond_2
    :goto_0
    check-cast p1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 40
    .line 41
    const/4 p0, 0x0

    .line 42
    throw p0
.end method
