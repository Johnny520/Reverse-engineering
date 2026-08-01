.class final Landroidx/compose/material3/AppBarKt$settleAppBar$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "androidx.compose.material3.AppBarKt"
    f = "AppBar.kt"
    l = {
        0xd88,
        0xd98
    }
    m = "settleAppBar"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Landroidx/compose/material3/AppBarKt$settleAppBar$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iput-object p1, p0, Landroidx/compose/material3/AppBarKt$settleAppBar$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Landroidx/compose/material3/AppBarKt$settleAppBar$1;->label:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Landroidx/compose/material3/AppBarKt$settleAppBar$1;->label:I

    .line 9
    .line 10
    sget v1, Landroidx/compose/material3/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:I

    .line 11
    .line 12
    and-int v1, p1, v0

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    sub-int/2addr p1, v0

    .line 17
    iput p1, p0, Landroidx/compose/material3/AppBarKt$settleAppBar$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Landroidx/compose/material3/AppBarKt$settleAppBar$1;

    .line 21
    .line 22
    invoke-direct {p1, p0}, Landroidx/compose/material3/AppBarKt$settleAppBar$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    move-object p0, p1

    .line 26
    :goto_0
    iget-object p1, p0, Landroidx/compose/material3/AppBarKt$settleAppBar$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 29
    .line 30
    iget v0, p0, Landroidx/compose/material3/AppBarKt$settleAppBar$1;->label:I

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    if-eqz v0, :cond_5

    .line 34
    .line 35
    const/4 v2, 0x1

    .line 36
    if-eq v0, v2, :cond_2

    .line 37
    .line 38
    const/4 v2, 0x2

    .line 39
    if-ne v0, v2, :cond_1

    .line 40
    .line 41
    iget-object p0, p0, Landroidx/compose/material3/AppBarKt$settleAppBar$1;->L$0:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p0, Lkotlin/jvm/internal/Ref$FloatRef;

    .line 44
    .line 45
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v1

    .line 55
    :cond_2
    iget-object v0, p0, Landroidx/compose/material3/AppBarKt$settleAppBar$1;->L$2:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, Lkotlin/jvm/internal/Ref$FloatRef;

    .line 58
    .line 59
    iget-object v2, p0, Landroidx/compose/material3/AppBarKt$settleAppBar$1;->L$1:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v2, Landroidx/compose/animation/core/飘花落叶言子楪苏哲世兰;

    .line 62
    .line 63
    iget-object p0, p0, Landroidx/compose/material3/AppBarKt$settleAppBar$1;->L$0:Ljava/lang/Object;

    .line 64
    .line 65
    if-nez p0, :cond_4

    .line 66
    .line 67
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    if-nez v2, :cond_3

    .line 71
    .line 72
    move-object p0, v0

    .line 73
    :goto_1
    const/4 p1, 0x0

    .line 74
    iget p0, p0, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 75
    .line 76
    invoke-static {p1, p0}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(FF)J

    .line 77
    .line 78
    .line 79
    move-result-wide p0

    .line 80
    new-instance v0, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;

    .line 81
    .line 82
    invoke-direct {v0, p0, p1}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲苏兰世;-><init>(J)V

    .line 83
    .line 84
    .line 85
    return-object v0

    .line 86
    :cond_3
    throw v1

    .line 87
    :cond_4
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 88
    .line 89
    .line 90
    return-object v1

    .line 91
    :cond_5
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    throw v1
.end method
