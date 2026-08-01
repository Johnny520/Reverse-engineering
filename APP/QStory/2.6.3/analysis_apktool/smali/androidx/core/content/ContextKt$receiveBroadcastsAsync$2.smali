.class final Landroidx/core/content/ContextKt$receiveBroadcastsAsync$2;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;",
        "",
        "<anonymous>",
        "(Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;)Ljava/lang/Void;"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "androidx.core.content.ContextKt$receiveBroadcastsAsync$2"
    f = "Context.kt"
    l = {
        0xee
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field final synthetic $broadcastPermission:Ljava/lang/String;

.field final synthetic $filter:Landroid/content/IntentFilter;

.field final synthetic $flags:I

.field final synthetic $onReceive:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u5170\u4e16\u82cf;"
        }
    .end annotation
.end field

.field final synthetic $scheduler:Landroid/os/Handler;

.field final synthetic $this_receiveBroadcastsAsync:Landroid/content/Context;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/content/IntentFilter;ILjava/lang/String;Landroid/os/Handler;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/content/IntentFilter;",
            "I",
            "Ljava/lang/String;",
            "Landroid/os/Handler;",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u5170\u4e16\u82cf;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Landroidx/core/content/ContextKt$receiveBroadcastsAsync$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/core/content/ContextKt$receiveBroadcastsAsync$2;->$this_receiveBroadcastsAsync:Landroid/content/Context;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/core/content/ContextKt$receiveBroadcastsAsync$2;->$filter:Landroid/content/IntentFilter;

    .line 4
    .line 5
    iput p3, p0, Landroidx/core/content/ContextKt$receiveBroadcastsAsync$2;->$flags:I

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/core/content/ContextKt$receiveBroadcastsAsync$2;->$broadcastPermission:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p5, p0, Landroidx/core/content/ContextKt$receiveBroadcastsAsync$2;->$scheduler:Landroid/os/Handler;

    .line 10
    .line 11
    iput-object p6, p0, Landroidx/core/content/ContextKt$receiveBroadcastsAsync$2;->$onReceive:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private static final invokeSuspend$lambda$0(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;Landroid/content/BroadcastReceiver;Landroid/content/Intent;)Lkotlin/飘花落叶言子楪兰苏哲世;
    .locals 3

    .line 1
    invoke-virtual {p2}, Landroid/content/BroadcastReceiver;->goAsync()Landroid/content/BroadcastReceiver$PendingResult;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    sget-object v0, Lkotlinx/coroutines/CoroutineStart;->ATOMIC:Lkotlinx/coroutines/CoroutineStart;

    .line 6
    .line 7
    new-instance v1, Landroidx/core/content/ContextKt$receiveBroadcastsAsync$2$1$1;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v1, p1, p2, p3, v2}, Landroidx/core/content/ContextKt$receiveBroadcastsAsync$2$1$1;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;Landroid/content/BroadcastReceiver$PendingResult;Landroid/content/Intent;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    invoke-static {p0, v2, v0, v1, p1}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪哲苏兰(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlinx/coroutines/CoroutineStart;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;I)Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

    .line 15
    .line 16
    .line 17
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 18
    .line 19
    return-object p0
.end method

.method public static synthetic 飘花落叶言子楪世苏兰哲(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;Landroid/content/BroadcastReceiver;Landroid/content/Intent;)Lkotlin/飘花落叶言子楪兰苏哲世;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Landroidx/core/content/ContextKt$receiveBroadcastsAsync$2;->invokeSuspend$lambda$0(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;Landroid/content/BroadcastReceiver;Landroid/content/Intent;)Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
    .locals 8
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
    new-instance v0, Landroidx/core/content/ContextKt$receiveBroadcastsAsync$2;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/core/content/ContextKt$receiveBroadcastsAsync$2;->$this_receiveBroadcastsAsync:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/core/content/ContextKt$receiveBroadcastsAsync$2;->$filter:Landroid/content/IntentFilter;

    .line 6
    .line 7
    iget v3, p0, Landroidx/core/content/ContextKt$receiveBroadcastsAsync$2;->$flags:I

    .line 8
    .line 9
    iget-object v4, p0, Landroidx/core/content/ContextKt$receiveBroadcastsAsync$2;->$broadcastPermission:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v5, p0, Landroidx/core/content/ContextKt$receiveBroadcastsAsync$2;->$scheduler:Landroid/os/Handler;

    .line 12
    .line 13
    iget-object v6, p0, Landroidx/core/content/ContextKt$receiveBroadcastsAsync$2;->$onReceive:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;

    .line 14
    .line 15
    move-object v7, p2

    .line 16
    invoke-direct/range {v0 .. v7}, Landroidx/core/content/ContextKt$receiveBroadcastsAsync$2;-><init>(Landroid/content/Context;Landroid/content/IntentFilter;ILjava/lang/String;Landroid/os/Handler;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, v0, Landroidx/core/content/ContextKt$receiveBroadcastsAsync$2;->L$0:Ljava/lang/Object;

    .line 20
    .line 21
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Landroidx/core/content/ContextKt$receiveBroadcastsAsync$2;->invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

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
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/core/content/ContextKt$receiveBroadcastsAsync$2;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroidx/core/content/ContextKt$receiveBroadcastsAsync$2;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroidx/core/content/ContextKt$receiveBroadcastsAsync$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Landroidx/core/content/ContextKt$receiveBroadcastsAsync$2;->label:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-eq v1, v2, :cond_0

    .line 9
    .line 10
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :goto_0
    const/4 p0, 0x0

    .line 16
    return-object p0

    .line 17
    :cond_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Landroidx/core/content/ContextKt$receiveBroadcastsAsync$2;->L$0:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    .line 27
    .line 28
    iget-object v3, p0, Landroidx/core/content/ContextKt$receiveBroadcastsAsync$2;->$this_receiveBroadcastsAsync:Landroid/content/Context;

    .line 29
    .line 30
    iget-object v4, p0, Landroidx/core/content/ContextKt$receiveBroadcastsAsync$2;->$filter:Landroid/content/IntentFilter;

    .line 31
    .line 32
    iget v5, p0, Landroidx/core/content/ContextKt$receiveBroadcastsAsync$2;->$flags:I

    .line 33
    .line 34
    iget-object v6, p0, Landroidx/core/content/ContextKt$receiveBroadcastsAsync$2;->$broadcastPermission:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v7, p0, Landroidx/core/content/ContextKt$receiveBroadcastsAsync$2;->$scheduler:Landroid/os/Handler;

    .line 37
    .line 38
    iget-object v1, p0, Landroidx/core/content/ContextKt$receiveBroadcastsAsync$2;->$onReceive:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;

    .line 39
    .line 40
    new-instance v8, Landroidx/core/content/飘花落叶言子楪世苏哲兰;

    .line 41
    .line 42
    invoke-direct {v8, p1, v1}, Landroidx/core/content/飘花落叶言子楪世苏哲兰;-><init>(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;)V

    .line 43
    .line 44
    .line 45
    iput v2, p0, Landroidx/core/content/ContextKt$receiveBroadcastsAsync$2;->label:I

    .line 46
    .line 47
    move-object v9, p0

    .line 48
    invoke-static/range {v3 .. v9}, Landroidx/core/content/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Landroid/content/Context;Landroid/content/IntentFilter;ILjava/lang/String;Landroid/os/Handler;Landroidx/core/content/飘花落叶言子楪世苏哲兰;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    if-ne p0, v0, :cond_2

    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_2
    :goto_1
    invoke-static {}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲()V

    .line 56
    .line 57
    .line 58
    goto :goto_0
.end method
