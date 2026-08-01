.class final Landroidx/compose/runtime/ProduceStateScopeImpl$awaitDispose$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "androidx.compose.runtime.ProduceStateScopeImpl"
    f = "ProduceState.kt"
    l = {
        0xd0
    }
    m = "awaitDispose"
    v = 0x1
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Landroidx/compose/runtime/飘花落叶言子苏哲世兰楪;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u54f2\u4e16\u5170\u696a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/compose/runtime/飘花落叶言子苏哲世兰楪;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u54f2\u4e16\u5170\u696a;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Landroidx/compose/runtime/ProduceStateScopeImpl$awaitDispose$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/runtime/ProduceStateScopeImpl$awaitDispose$1;->this$0:Landroidx/compose/runtime/飘花落叶言子苏哲世兰楪;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iput-object p1, p0, Landroidx/compose/runtime/ProduceStateScopeImpl$awaitDispose$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Landroidx/compose/runtime/ProduceStateScopeImpl$awaitDispose$1;->label:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Landroidx/compose/runtime/ProduceStateScopeImpl$awaitDispose$1;->label:I

    .line 9
    .line 10
    iget-object p1, p0, Landroidx/compose/runtime/ProduceStateScopeImpl$awaitDispose$1;->this$0:Landroidx/compose/runtime/飘花落叶言子苏哲世兰楪;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget v1, p0, Landroidx/compose/runtime/ProduceStateScopeImpl$awaitDispose$1;->label:I

    .line 16
    .line 17
    and-int v2, v1, v0

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    sub-int/2addr v1, v0

    .line 22
    iput v1, p0, Landroidx/compose/runtime/ProduceStateScopeImpl$awaitDispose$1;->label:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, Landroidx/compose/runtime/ProduceStateScopeImpl$awaitDispose$1;

    .line 26
    .line 27
    invoke-direct {v0, p1, p0}, Landroidx/compose/runtime/ProduceStateScopeImpl$awaitDispose$1;-><init>(Landroidx/compose/runtime/飘花落叶言子苏哲世兰楪;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 28
    .line 29
    .line 30
    move-object p0, v0

    .line 31
    :goto_0
    iget-object p1, p0, Landroidx/compose/runtime/ProduceStateScopeImpl$awaitDispose$1;->result:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 34
    .line 35
    iget v1, p0, Landroidx/compose/runtime/ProduceStateScopeImpl$awaitDispose$1;->label:I

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    const/4 v3, 0x1

    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    if-eq v1, v3, :cond_1

    .line 42
    .line 43
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v2

    .line 49
    :cond_1
    iget-object p0, p0, Landroidx/compose/runtime/ProduceStateScopeImpl$awaitDispose$1;->L$0:Ljava/lang/Object;

    .line 50
    .line 51
    move-object v2, p0

    .line 52
    check-cast v2, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;

    .line 53
    .line 54
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :catchall_0
    move-exception p0

    .line 59
    goto :goto_2

    .line 60
    :cond_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :try_start_1
    iput-object v2, p0, Landroidx/compose/runtime/ProduceStateScopeImpl$awaitDispose$1;->L$0:Ljava/lang/Object;

    .line 64
    .line 65
    iput v3, p0, Landroidx/compose/runtime/ProduceStateScopeImpl$awaitDispose$1;->label:I

    .line 66
    .line 67
    new-instance p1, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;

    .line 68
    .line 69
    invoke-static {p0}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世苏哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-direct {p1, v3, p0}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰苏世哲()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世苏哲()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    if-ne p0, v0, :cond_3

    .line 84
    .line 85
    return-object v0

    .line 86
    :cond_3
    :goto_1
    new-instance p0, Lkotlin/KotlinNothingValueException;

    .line 87
    .line 88
    invoke-direct {p0}, Lkotlin/KotlinNothingValueException;-><init>()V

    .line 89
    .line 90
    .line 91
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 92
    :goto_2
    invoke-interface {v2}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;->invoke()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    throw p0
.end method
