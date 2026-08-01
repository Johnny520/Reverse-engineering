.class final Landroidx/compose/animation/SharedTransitionScopeKt$SharedTransitionScope$1;
.super Lkotlin/jvm/internal/Lambda;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u5170\u4e16\u82cf;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Landroidx/compose/ui/layout/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u54f2\u5170\u696a\u82cf;",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "invoke",
        "(Landroidx/compose/ui/layout/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u54f2\u5170\u696a\u82cf;Landroidx/compose/runtime/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u4e16\u5170;I)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $content:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰苏世;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u5170\u82cf\u4e16;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰苏世;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u5170\u82cf\u4e16;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/animation/SharedTransitionScopeKt$SharedTransitionScope$1;->$content:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰苏世;

    .line 2
    .line 3
    const/4 p1, 0x3

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 54
    check-cast p1, Landroidx/compose/ui/layout/飘花落叶言子世哲兰楪苏;

    check-cast p2, Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/animation/SharedTransitionScopeKt$SharedTransitionScope$1;->invoke(Landroidx/compose/ui/layout/飘花落叶言子世哲兰楪苏;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V

    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    return-object p0
.end method

.method public final invoke(Landroidx/compose/ui/layout/飘花落叶言子世哲兰楪苏;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V
    .locals 2

    .line 1
    check-cast p2, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 2
    .line 3
    invoke-virtual {p2}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲楪兰苏()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    sget-object v0, Landroidx/compose/runtime/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/飘花落叶言子楪世哲兰苏;

    .line 8
    .line 9
    if-ne p3, v0, :cond_0

    .line 10
    .line 11
    sget-object p3, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 12
    .line 13
    invoke-static {p3, p2}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏兰世(Lkotlin/coroutines/EmptyCoroutineContext;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;)Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    invoke-virtual {p2, p3}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏世哲兰楪(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    check-cast p3, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    .line 21
    .line 22
    invoke-virtual {p2}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲楪兰苏()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    if-ne v1, v0, :cond_1

    .line 27
    .line 28
    new-instance v1, Landroidx/compose/animation/飘花落叶言子苏世哲兰楪;

    .line 29
    .line 30
    invoke-direct {v1, p1, p3}, Landroidx/compose/animation/飘花落叶言子苏世哲兰楪;-><init>(Landroidx/compose/ui/layout/飘花落叶言子世哲兰楪苏;Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2, v1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏世哲兰楪(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    check-cast v1, Landroidx/compose/animation/飘花落叶言子苏世哲兰楪;

    .line 37
    .line 38
    iget-object p0, p0, Landroidx/compose/animation/SharedTransitionScopeKt$SharedTransitionScope$1;->$content:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰苏世;

    .line 39
    .line 40
    new-instance p1, Landroidx/compose/animation/飘花落叶言子苏世兰哲楪;

    .line 41
    .line 42
    invoke-direct {p1, v1}, Landroidx/compose/animation/飘花落叶言子苏世兰哲楪;-><init>(Landroidx/compose/animation/飘花落叶言子苏世哲兰楪;)V

    .line 43
    .line 44
    .line 45
    const/4 p3, 0x6

    .line 46
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object p3

    .line 50
    invoke-interface {p0, v1, p1, p2, p3}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰苏世;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    return-void
.end method
