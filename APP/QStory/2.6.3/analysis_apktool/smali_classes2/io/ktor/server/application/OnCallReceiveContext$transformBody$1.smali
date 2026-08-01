.class final Lio/ktor/server/application/OnCallReceiveContext$transformBody$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


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
    c = "io.ktor.server.application.OnCallReceiveContext"
    f = "KtorCallContexts.kt"
    l = {
        0x40
    }
    m = "transformBody"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lio/ktor/server/application/飘花落叶言子楪哲世苏兰;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/ktor/server/application/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u4e16\u82cf\u5170;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/ktor/server/application/飘花落叶言子楪哲世苏兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/ktor/server/application/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u4e16\u82cf\u5170;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/server/application/OnCallReceiveContext$transformBody$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lio/ktor/server/application/OnCallReceiveContext$transformBody$1;->this$0:Lio/ktor/server/application/飘花落叶言子楪哲世苏兰;

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
    .locals 7

    .line 1
    iput-object p1, p0, Lio/ktor/server/application/OnCallReceiveContext$transformBody$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget v0, p0, Lio/ktor/server/application/OnCallReceiveContext$transformBody$1;->label:I

    .line 4
    .line 5
    const/high16 v1, -0x80000000

    .line 6
    .line 7
    or-int/2addr v0, v1

    .line 8
    iput v0, p0, Lio/ktor/server/application/OnCallReceiveContext$transformBody$1;->label:I

    .line 9
    .line 10
    iget-object v2, p0, Lio/ktor/server/application/OnCallReceiveContext$transformBody$1;->this$0:Lio/ktor/server/application/飘花落叶言子楪哲世苏兰;

    .line 11
    .line 12
    iget-object v2, v2, Lio/ktor/server/application/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲:Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;

    .line 13
    .line 14
    sub-int/2addr v0, v1

    .line 15
    iput v0, p0, Lio/ktor/server/application/OnCallReceiveContext$transformBody$1;->label:I

    .line 16
    .line 17
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    const/4 v3, 0x1

    .line 21
    sget-object v4, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    if-ne v0, v3, :cond_0

    .line 26
    .line 27
    iget-object p0, p0, Lio/ktor/server/application/OnCallReceiveContext$transformBody$1;->L$0:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p0, Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;

    .line 30
    .line 31
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, p1}, Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    return-object v4

    .line 38
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-object v1

    .line 44
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    instance-of v0, p1, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 52
    .line 53
    if-eqz v0, :cond_2

    .line 54
    .line 55
    check-cast p1, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    move-object p1, v1

    .line 59
    :goto_0
    if-nez p1, :cond_3

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    iget-object p1, v2, Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p1, Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;

    .line 65
    .line 66
    invoke-static {p1}, Lio/ktor/server/application/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰(Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;)L飘花落叶言世子楪苏哲兰/飘花落叶言子楪世苏哲兰;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    sget-object v0, Lkotlin/jvm/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;

    .line 71
    .line 72
    const-class v5, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 73
    .line 74
    invoke-virtual {v0, v5}, Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)Lkotlin/reflect/飘花落叶言子楪世哲兰苏;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    :try_start_0
    invoke-static {v5}, Lkotlin/jvm/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)Lkotlin/reflect/飘花落叶言子世楪苏兰哲;

    .line 79
    .line 80
    .line 81
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    goto :goto_1

    .line 83
    :catchall_0
    move-object v5, v1

    .line 84
    :goto_1
    new-instance v6, L飘花落叶言世子楪苏哲兰/飘花落叶言子楪世苏哲兰;

    .line 85
    .line 86
    invoke-direct {v6, v0, v5}, L飘花落叶言世子楪苏哲兰/飘花落叶言子楪世苏哲兰;-><init>(Lkotlin/reflect/飘花落叶言子楪世哲兰苏;Lkotlin/reflect/飘花落叶言子世楪苏兰哲;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, v6}, L飘花落叶言世子楪苏哲兰/飘花落叶言子楪世苏哲兰;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-eqz p1, :cond_4

    .line 94
    .line 95
    :goto_2
    return-object v4

    .line 96
    :cond_4
    iput-object v2, p0, Lio/ktor/server/application/OnCallReceiveContext$transformBody$1;->L$0:Ljava/lang/Object;

    .line 97
    .line 98
    iput v3, p0, Lio/ktor/server/application/OnCallReceiveContext$transformBody$1;->label:I

    .line 99
    .line 100
    throw v1
.end method
