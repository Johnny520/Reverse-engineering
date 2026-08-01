.class final Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$Companion$refreshServerForCurrentProcess$1;
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
        "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "<anonymous>",
        "(Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "top.suzhelan.qstory.hook.item.mcp.config.McpServerManager$Companion$refreshServerForCurrentProcess$1"
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

.field I$1:I

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
            "Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$Companion$refreshServerForCurrentProcess$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput p1, p0, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$Companion$refreshServerForCurrentProcess$1;->$port:I

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
    sget-object v0, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰:Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    invoke-static {p0, v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 13
    .line 14
    return-object p0
.end method

.method public static synthetic 飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Lkotlin/飘花落叶言子楪兰苏哲世;
    .locals 0

    .line 1
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$Companion$refreshServerForCurrentProcess$1;->invokeSuspend$lambda$0$0(Ljava/lang/String;)Lkotlin/飘花落叶言子楪兰苏哲世;

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
    new-instance p1, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$Companion$refreshServerForCurrentProcess$1;

    .line 2
    .line 3
    iget p0, p0, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$Companion$refreshServerForCurrentProcess$1;->$port:I

    .line 4
    .line 5
    invoke-direct {p1, p0, p2}, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$Companion$refreshServerForCurrentProcess$1;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

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

    invoke-virtual {p0, p1, p2}, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$Companion$refreshServerForCurrentProcess$1;->invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$Companion$refreshServerForCurrentProcess$1;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$Companion$refreshServerForCurrentProcess$1;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$Companion$refreshServerForCurrentProcess$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$Companion$refreshServerForCurrentProcess$1;->label:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v3, :cond_0

    .line 11
    .line 12
    iget v0, p0, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$Companion$refreshServerForCurrentProcess$1;->I$0:I

    .line 13
    .line 14
    iget-object p0, p0, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$Companion$refreshServerForCurrentProcess$1;->L$0:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Lkotlinx/coroutines/sync/飘花落叶言子楪世苏哲兰;

    .line 17
    .line 18
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-wide p0, -0x36a57f60051405a7L    # -2.3640967447586732E45

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-object v4

    .line 35
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    sget-object p1, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲:Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;

    .line 39
    .line 40
    iget v1, p0, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$Companion$refreshServerForCurrentProcess$1;->$port:I

    .line 41
    .line 42
    iput-object p1, p0, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$Companion$refreshServerForCurrentProcess$1;->L$0:Ljava/lang/Object;

    .line 43
    .line 44
    iput v1, p0, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$Companion$refreshServerForCurrentProcess$1;->I$0:I

    .line 45
    .line 46
    iput v2, p0, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$Companion$refreshServerForCurrentProcess$1;->I$1:I

    .line 47
    .line 48
    iput v3, p0, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$Companion$refreshServerForCurrentProcess$1;->label:I

    .line 49
    .line 50
    invoke-virtual {p1, p0}, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    if-ne p0, v0, :cond_2

    .line 55
    .line 56
    return-object v0

    .line 57
    :cond_2
    move-object p0, p1

    .line 58
    move v0, v1

    .line 59
    :goto_0
    :try_start_0
    sget-object p1, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏:Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世哲苏兰;

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-static {}, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_4

    .line 69
    .line 70
    sget-object p1, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰:Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰苏哲;

    .line 71
    .line 72
    if-eqz p1, :cond_3

    .line 73
    .line 74
    invoke-static {p1}, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰苏哲;)V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :catchall_0
    move-exception p1

    .line 79
    goto :goto_3

    .line 80
    :cond_3
    :goto_1
    new-instance p1, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰苏哲;

    .line 81
    .line 82
    new-instance v1, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世苏兰哲;

    .line 83
    .line 84
    invoke-direct {v1, v2}, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世苏兰哲;-><init>(I)V

    .line 85
    .line 86
    .line 87
    invoke-direct {p1, v1, v0}, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰苏哲;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;I)V

    .line 88
    .line 89
    .line 90
    sput-object p1, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰:Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰苏哲;

    .line 91
    .line 92
    invoke-static {p1}, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰苏哲;)V

    .line 93
    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_4
    sget-object p1, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰:Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰苏哲;

    .line 97
    .line 98
    if-eqz p1, :cond_5

    .line 99
    .line 100
    invoke-static {p1}, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰苏哲;)V

    .line 101
    .line 102
    .line 103
    :cond_5
    sput-object v4, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰:Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰苏哲;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    .line 105
    :goto_2
    check-cast p0, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;

    .line 106
    .line 107
    invoke-virtual {p0, v4}, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 111
    .line 112
    return-object p0

    .line 113
    :goto_3
    check-cast p0, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;

    .line 114
    .line 115
    invoke-virtual {p0, v4}, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    throw p1
.end method
