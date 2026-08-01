.class final Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$5;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
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
    c = "io.modelcontextprotocol.kotlin.sdk.shared.Protocol$request$5"
    f = "Protocol.kt"
    l = {
        0x18b
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $message:L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;

.field final synthetic $messageId:L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏兰哲子世;

.field label:I

.field final synthetic this$0:Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏世兰哲;


# direct methods
.method public constructor <init>(Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏世兰哲;L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏兰哲子世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/modelcontextprotocol/kotlin/sdk/shared/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u696a\u5170\u82cf\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u54f2\u82cf\u4e16\u696a\u5170;",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u696a\u5170\u82cf\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u82cf\u5170\u54f2\u5b50\u4e16;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$5;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$5;->this$0:Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    iput-object p2, p0, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$5;->$message:L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;

    .line 4
    .line 5
    iput-object p3, p0, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$5;->$messageId:L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏兰哲子世;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private static final invokeSuspend$lambda$0(L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏兰哲子世;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Sending request message with id: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static synthetic 飘花落叶言子楪世苏兰哲(L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏兰哲子世;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$5;->invokeSuspend$lambda$0(L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏兰哲子世;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
    .locals 2
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
    new-instance p1, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$5;

    .line 2
    .line 3
    iget-object v0, p0, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$5;->this$0:Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏世兰哲;

    .line 4
    .line 5
    iget-object v1, p0, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$5;->$message:L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;

    .line 6
    .line 7
    iget-object p0, p0, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$5;->$messageId:L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏兰哲子世;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, p0, p2}, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$5;-><init>(Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏世兰哲;L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏兰哲子世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$5;->invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$5;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$5;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$5;->label:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    if-ne v1, v3, :cond_0

    .line 10
    .line 11
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 16
    .line 17
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-object v2

    .line 21
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    sget-object p1, Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪兰子哲苏世/飘花落叶言子楪世苏哲兰;

    .line 25
    .line 26
    iget-object v1, p0, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$5;->$messageId:L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏兰哲子世;

    .line 27
    .line 28
    new-instance v4, Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏世哲兰;

    .line 29
    .line 30
    const/4 v5, 0x0

    .line 31
    invoke-direct {v4, v1, v5}, Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏世哲兰;-><init>(Ljava/lang/Object;I)V

    .line 32
    .line 33
    .line 34
    invoke-interface {p1, v4}, L飘花落叶言楪兰子哲苏世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$5;->this$0:Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏世兰哲;

    .line 38
    .line 39
    iget-object p1, p1, Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏兰世哲;

    .line 40
    .line 41
    if-eqz p1, :cond_3

    .line 42
    .line 43
    iget-object v1, p0, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$5;->$message:L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;

    .line 44
    .line 45
    iput v3, p0, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$5;->label:I

    .line 46
    .line 47
    check-cast p1, Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏兰哲世;

    .line 48
    .line 49
    invoke-virtual {p1, v1, p0}, Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲(L飘花落叶言世子楪兰苏哲/飘花落叶言子哲世楪兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    if-ne p0, v0, :cond_2

    .line 54
    .line 55
    return-object v0

    .line 56
    :cond_2
    :goto_0
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 57
    .line 58
    return-object p0

    .line 59
    :cond_3
    return-object v2
.end method
