.class final Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$Companion$run$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
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
        0x4,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏兰哲楪/飘花落叶言子楪世哲苏兰;
    c = "top.suzhelan.qstory.hook.item.mcp.config.McpServerManager$Companion$run$1"
    f = "McpServerManager.kt"
    l = {
        0x1dc
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic $port:I

.field I$0:I

.field L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$Companion$run$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput p1, p0, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$Companion$run$1;->$port:I

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private static final invokeSuspend$lambda$0$0(Ljava/lang/String;)Lkotlin/飘花落叶言子楪兰苏哲世;
    .locals 1

    .line 1
    sget-object v0, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰:Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    invoke-static {p0, v0}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 13
    .line 14
    return-object p0
.end method

.method public static synthetic 飘花落叶言子楪世哲兰苏(Ljava/lang/String;)Lkotlin/飘花落叶言子楪兰苏哲世;
    .locals 0

    .line 1
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$Companion$run$1;->invokeSuspend$lambda$0$0(Ljava/lang/String;)Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
    .locals 0
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
    new-instance p1, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$Companion$run$1;

    .line 2
    .line 3
    iget p0, p0, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$Companion$run$1;->$port:I

    .line 4
    .line 5
    invoke-direct {p1, p0, p2}, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$Companion$run$1;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$Companion$run$1;->invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$Companion$run$1;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$Companion$run$1;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$Companion$run$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$Companion$run$1;->label:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    if-ne v1, v2, :cond_0

    .line 10
    .line 11
    iget v0, p0, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$Companion$run$1;->I$0:I

    .line 12
    .line 13
    iget-object p0, p0, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$Companion$run$1;->L$0:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lkotlinx/coroutines/sync/飘花落叶言子楪世苏哲兰;

    .line 16
    .line 17
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/16 p0, 0x4d1

    .line 22
    .line 23
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-object v3

    .line 31
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    sget-object p1, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲:Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;

    .line 35
    .line 36
    iget v1, p0, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$Companion$run$1;->$port:I

    .line 37
    .line 38
    iput-object p1, p0, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$Companion$run$1;->L$0:Ljava/lang/Object;

    .line 39
    .line 40
    iput v1, p0, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$Companion$run$1;->I$0:I

    .line 41
    .line 42
    iput v2, p0, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$Companion$run$1;->label:I

    .line 43
    .line 44
    invoke-virtual {p1, p0}, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    if-ne p0, v0, :cond_2

    .line 49
    .line 50
    return-object v0

    .line 51
    :cond_2
    move-object p0, p1

    .line 52
    move v0, v1

    .line 53
    :goto_0
    :try_start_0
    sget-object p1, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰:Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰哲苏;

    .line 54
    .line 55
    if-eqz p1, :cond_3

    .line 56
    .line 57
    invoke-static {p1}, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰(Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰哲苏;)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :catchall_0
    move-exception p1

    .line 62
    goto :goto_2

    .line 63
    :cond_3
    :goto_1
    new-instance p1, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰哲苏;

    .line 64
    .line 65
    new-instance v1, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世哲苏兰;

    .line 66
    .line 67
    invoke-direct {v1, v2}, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 68
    .line 69
    .line 70
    invoke-direct {p1, v1, v0}, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰哲苏;-><init>(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;I)V

    .line 71
    .line 72
    .line 73
    sput-object p1, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰:Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰哲苏;

    .line 74
    .line 75
    invoke-static {p1}, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰哲苏;)V

    .line 76
    .line 77
    .line 78
    const/16 p1, 0x96e

    .line 79
    .line 80
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-static {p1}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    .line 86
    .line 87
    invoke-interface {p0, v3}, Lkotlinx/coroutines/sync/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 91
    .line 92
    return-object p0

    .line 93
    :goto_2
    invoke-interface {p0, v3}, Lkotlinx/coroutines/sync/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    throw p1
.end method
