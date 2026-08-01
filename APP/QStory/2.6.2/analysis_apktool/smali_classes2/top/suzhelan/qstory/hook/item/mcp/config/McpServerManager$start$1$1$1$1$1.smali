.class final Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$start$1$1$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$start$1$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Ljava/io/Writer;",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "<anonymous>",
        "(Ljava/io/Writer;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "top.suzhelan.qstory.hook.item.mcp.config.McpServerManager$start$1$1$1$1$1"
    f = "McpServerManager.kt"
    l = {
        0xf3
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic $clientChannel:Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;"
        }
    .end annotation
.end field

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/channels/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$start$1$1$1$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$start$1$1$1$1$1;->$clientChannel:Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;

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


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
    .locals 1
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
    new-instance v0, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$start$1$1$1$1$1;

    .line 2
    .line 3
    iget-object p0, p0, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$start$1$1$1$1$1;->$clientChannel:Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;

    .line 4
    .line 5
    invoke-direct {v0, p0, p2}, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$start$1$1$1$1$1;-><init>(Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$start$1$1$1$1$1;->L$0:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Ljava/io/Writer;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/Writer;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$start$1$1$1$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$start$1$1$1$1$1;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$start$1$1$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    check-cast p1, Ljava/io/Writer;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$start$1$1$1$1$1;->invoke(Ljava/io/Writer;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$start$1$1$1$1$1;->L$0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/io/Writer;

    .line 4
    .line 5
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 6
    .line 7
    iget v2, p0, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$start$1$1$1$1$1;->label:I

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    if-ne v2, v3, :cond_0

    .line 13
    .line 14
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    check-cast p1, Lkotlinx/coroutines/channels/飘花落叶言子楪哲世苏兰;

    .line 18
    .line 19
    iget-object p1, p1, Lkotlinx/coroutines/channels/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/Object;

    .line 20
    .line 21
    goto :goto_1

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
    const/4 p0, 0x0

    .line 35
    return-object p0

    .line 36
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    iget-object p1, p0, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$start$1$1$1$1$1;->$clientChannel:Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;

    .line 40
    .line 41
    iput-object v0, p0, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$start$1$1$1$1$1;->L$0:Ljava/lang/Object;

    .line 42
    .line 43
    iput v3, p0, Ltop/suzhelan/qstory/hook/item/mcp/config/McpServerManager$start$1$1$1$1$1;->label:I

    .line 44
    .line 45
    invoke-interface {p1, p0}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰世哲苏(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-ne p1, v1, :cond_2

    .line 50
    .line 51
    return-object v1

    .line 52
    :cond_2
    :goto_1
    invoke-static {p1}, Lkotlinx/coroutines/channels/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    check-cast p1, Ljava/lang/String;

    .line 57
    .line 58
    if-nez p1, :cond_3

    .line 59
    .line 60
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 61
    .line 62
    return-object p0

    .line 63
    :cond_3
    const-wide v4, -0x36a5e778051405a7L    # -2.3278253667038365E45

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-virtual {v0, v2}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    .line 73
    .line 74
    .line 75
    const-wide v4, -0x36a542fd051405a7L    # -2.3851384451995964E45

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-virtual {v0, v2}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    .line 85
    .line 86
    .line 87
    const/16 v2, 0xa

    .line 88
    .line 89
    invoke-virtual {v0, v2}, Ljava/io/Writer;->append(C)Ljava/io/Writer;

    .line 90
    .line 91
    .line 92
    new-instance v4, Lkotlin/text/飘花落叶言子楪苏世哲兰;

    .line 93
    .line 94
    invoke-direct {v4, p1}, Lkotlin/text/飘花落叶言子楪苏世哲兰;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    :goto_2
    invoke-virtual {v4}, Lkotlin/text/飘花落叶言子楪苏世哲兰;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    if-eqz p1, :cond_4

    .line 102
    .line 103
    invoke-virtual {v4}, Lkotlin/text/飘花落叶言子楪苏世哲兰;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    check-cast p1, Ljava/lang/String;

    .line 108
    .line 109
    const-wide v5, -0x36a5e760051405a7L    # -2.327858033811061E45

    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    invoke-virtual {v0, v5}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0, p1}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, v2}, Ljava/io/Writer;->append(C)Ljava/io/Writer;

    .line 125
    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_4
    invoke-virtual {v0, v2}, Ljava/io/Writer;->append(C)Ljava/io/Writer;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, Ljava/io/Writer;->flush()V

    .line 132
    .line 133
    .line 134
    goto :goto_0
.end method
