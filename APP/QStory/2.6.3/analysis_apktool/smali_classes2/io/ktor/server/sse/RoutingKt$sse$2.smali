.class final Lio/ktor/server/sse/RoutingKt$sse$2;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lio/ktor/server/routing/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u4e16\u82cf\u54f2;",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "<anonymous>",
        "(Lio/ktor/server/routing/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u4e16\u82cf\u54f2;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "io.ktor.server.sse.RoutingKt$sse$2"
    f = "Routing.kt"
    l = {
        0x34
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $handler:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
        }
    .end annotation
.end field

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/server/sse/RoutingKt$sse$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lio/ktor/server/sse/RoutingKt$sse$2;->$handler:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

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
    new-instance v0, Lio/ktor/server/sse/RoutingKt$sse$2;

    .line 2
    .line 3
    iget-object p0, p0, Lio/ktor/server/sse/RoutingKt$sse$2;->$handler:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 4
    .line 5
    invoke-direct {v0, p0, p2}, Lio/ktor/server/sse/RoutingKt$sse$2;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lio/ktor/server/sse/RoutingKt$sse$2;->L$0:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/ktor/server/routing/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u4e16\u82cf\u54f2;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/ktor/server/sse/RoutingKt$sse$2;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lio/ktor/server/sse/RoutingKt$sse$2;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lio/ktor/server/sse/RoutingKt$sse$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    check-cast p1, Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Lio/ktor/server/sse/RoutingKt$sse$2;->invoke(Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lio/ktor/server/sse/RoutingKt$sse$2;->label:I

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
    iget-object p1, p0, Lio/ktor/server/sse/RoutingKt$sse$2;->L$0:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;

    .line 27
    .line 28
    iget-object p1, p1, Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰:Lio/ktor/server/routing/飘花落叶言子楪哲兰苏世;

    .line 29
    .line 30
    invoke-virtual {p1}, Lio/ktor/server/routing/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰()Lio/ktor/server/routing/飘花落叶言子世苏楪哲兰;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    sget-object v4, L飘花落叶言楪兰世哲子苏/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏哲兰:[Ljava/lang/String;

    .line 35
    .line 36
    sget-object v4, L飘花落叶言楪兰世哲子苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪兰世哲子苏/飘花落叶言子楪苏世哲兰;

    .line 37
    .line 38
    invoke-virtual {v4}, Landroidx/appcompat/app/飘花落叶言子世苏哲兰楪;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    const-string v5, "Content-Type"

    .line 43
    .line 44
    invoke-static {v1, v5, v4}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪哲兰苏(Lio/ktor/server/response/飘花落叶言子楪世苏哲兰;Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Lio/ktor/server/routing/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰()Lio/ktor/server/routing/飘花落叶言子世苏楪哲兰;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const-string v4, "Cache-Control"

    .line 52
    .line 53
    const-string v5, "no-store"

    .line 54
    .line 55
    invoke-static {v1, v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪哲兰苏(Lio/ktor/server/response/飘花落叶言子楪世苏哲兰;Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Lio/ktor/server/routing/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰()Lio/ktor/server/routing/飘花落叶言子世苏楪哲兰;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    const-string v4, "Connection"

    .line 63
    .line 64
    const-string v5, "keep-alive"

    .line 65
    .line 66
    invoke-static {v1, v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪哲兰苏(Lio/ktor/server/response/飘花落叶言子楪世苏哲兰;Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Lio/ktor/server/routing/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰()Lio/ktor/server/routing/飘花落叶言子世苏楪哲兰;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    const-string v4, "X-Accel-Buffering"

    .line 74
    .line 75
    const-string v5, "no"

    .line 76
    .line 77
    invoke-static {v1, v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪哲兰苏(Lio/ktor/server/response/飘花落叶言子楪世苏哲兰;Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    new-instance v1, Lio/ktor/server/sse/飘花落叶言子楪世哲苏兰;

    .line 81
    .line 82
    iget-object v4, p0, Lio/ktor/server/sse/RoutingKt$sse$2;->$handler:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 83
    .line 84
    invoke-direct {v1, p1, v4}, Lio/ktor/server/sse/飘花落叶言子楪世哲苏兰;-><init>(Lio/ktor/server/routing/飘花落叶言子楪哲兰苏世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)V

    .line 85
    .line 86
    .line 87
    sget-object v4, Lkotlin/jvm/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;

    .line 88
    .line 89
    const-class v5, Lio/ktor/server/sse/飘花落叶言子楪世哲苏兰;

    .line 90
    .line 91
    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)Lkotlin/reflect/飘花落叶言子楪世哲兰苏;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    :try_start_0
    invoke-static {v5}, Lkotlin/jvm/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)Lkotlin/reflect/飘花落叶言子世楪苏兰哲;

    .line 96
    .line 97
    .line 98
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    :catchall_0
    new-instance v5, L飘花落叶言世子楪苏哲兰/飘花落叶言子楪世苏哲兰;

    .line 100
    .line 101
    invoke-direct {v5, v4, v2}, L飘花落叶言世子楪苏哲兰/飘花落叶言子楪世苏哲兰;-><init>(Lkotlin/reflect/飘花落叶言子楪世哲兰苏;Lkotlin/reflect/飘花落叶言子世楪苏兰哲;)V

    .line 102
    .line 103
    .line 104
    iput v3, p0, Lio/ktor/server/sse/RoutingKt$sse$2;->label:I

    .line 105
    .line 106
    invoke-virtual {p1, v1, v5, p0}, Lio/ktor/server/routing/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;L飘花落叶言世子楪苏哲兰/飘花落叶言子楪世苏哲兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    if-ne p0, v0, :cond_2

    .line 111
    .line 112
    return-object v0

    .line 113
    :cond_2
    :goto_0
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 114
    .line 115
    return-object p0
.end method
