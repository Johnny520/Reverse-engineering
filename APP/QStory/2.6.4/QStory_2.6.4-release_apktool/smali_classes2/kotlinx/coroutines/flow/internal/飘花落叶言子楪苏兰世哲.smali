.class public final Lkotlinx/coroutines/flow/internal/飘花落叶言子楪苏兰世哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;


# instance fields
.field public final synthetic 飘花落叶言子楪兰世哲苏:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲兰世苏;

.field public final synthetic 飘花落叶言子楪兰世苏哲:Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;

.field public final synthetic 飘花落叶言子楪兰苏世哲:Lkotlinx/coroutines/飘花落叶言子楪哲兰苏世;

.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

.field public final synthetic 飘花落叶言子楪哲苏兰世:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;


# direct methods
.method public constructor <init>(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Ljava/lang/Object;Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲兰世苏;Lkotlinx/coroutines/飘花落叶言子楪哲兰苏世;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏兰世:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 5
    .line 6
    iput-object p2, p0, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰苏世:Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 9
    .line 10
    iput-object p4, p0, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世苏哲:Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;

    .line 11
    .line 12
    iput-object p5, p0, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世哲苏:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲兰世苏;

    .line 13
    .line 14
    iput-object p6, p0, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰苏世哲:Lkotlinx/coroutines/飘花落叶言子楪哲兰苏世;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 13

    .line 1
    instance-of v0, p2, Lkotlinx/coroutines/flow/internal/CombineKt$zipImpl$1$1$2$1$emit$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lkotlinx/coroutines/flow/internal/CombineKt$zipImpl$1$1$2$1$emit$1;

    .line 7
    .line 8
    iget v1, v0, Lkotlinx/coroutines/flow/internal/CombineKt$zipImpl$1$1$2$1$emit$1;->label:I

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
    iput v1, v0, Lkotlinx/coroutines/flow/internal/CombineKt$zipImpl$1$1$2$1$emit$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lkotlinx/coroutines/flow/internal/CombineKt$zipImpl$1$1$2$1$emit$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lkotlinx/coroutines/flow/internal/CombineKt$zipImpl$1$1$2$1$emit$1;-><init>(Lkotlinx/coroutines/flow/internal/飘花落叶言子楪苏兰世哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lkotlinx/coroutines/flow/internal/CombineKt$zipImpl$1$1$2$1$emit$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lkotlinx/coroutines/flow/internal/CombineKt$zipImpl$1$1$2$1$emit$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    sget-object v4, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 33
    .line 34
    const/4 v5, 0x1

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v5, :cond_1

    .line 38
    .line 39
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v3

    .line 49
    :cond_2
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    new-instance v6, Lkotlinx/coroutines/flow/internal/CombineKt$zipImpl$1$1$2$1$1;

    .line 53
    .line 54
    iget-object v11, p0, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰苏世哲:Lkotlinx/coroutines/飘花落叶言子楪哲兰苏世;

    .line 55
    .line 56
    const/4 v12, 0x0

    .line 57
    iget-object v7, p0, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰苏世:Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 58
    .line 59
    iget-object v8, p0, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世苏哲:Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;

    .line 60
    .line 61
    iget-object v9, p0, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世哲苏:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲兰世苏;

    .line 62
    .line 63
    move-object v10, p1

    .line 64
    invoke-direct/range {v6 .. v12}, Lkotlinx/coroutines/flow/internal/CombineKt$zipImpl$1$1$2$1$1;-><init>(Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲兰世苏;Ljava/lang/Object;Lkotlinx/coroutines/飘花落叶言子楪哲兰苏世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 65
    .line 66
    .line 67
    iput-object v3, v0, Lkotlinx/coroutines/flow/internal/CombineKt$zipImpl$1$1$2$1$emit$1;->L$0:Ljava/lang/Object;

    .line 68
    .line 69
    iput v5, v0, Lkotlinx/coroutines/flow/internal/CombineKt$zipImpl$1$1$2$1$emit$1;->label:I

    .line 70
    .line 71
    iget-object p1, p0, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏兰世:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 72
    .line 73
    iget-object p0, p0, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 74
    .line 75
    invoke-static {p1, v4, p0, v6, v0}, Lkotlinx/coroutines/flow/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Ljava/lang/Object;Ljava/lang/Object;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    if-ne p0, v1, :cond_3

    .line 80
    .line 81
    return-object v1

    .line 82
    :cond_3
    :goto_1
    return-object v4
.end method
