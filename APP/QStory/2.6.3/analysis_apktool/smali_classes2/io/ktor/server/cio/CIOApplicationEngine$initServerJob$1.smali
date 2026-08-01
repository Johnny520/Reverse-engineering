.class final Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;
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
        "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "<anonymous>",
        "(Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "io.ktor.server.cio.CIOApplicationEngine$initServerJob$1"
    f = "CIOApplicationEngine.kt"
    l = {
        0xcb,
        0xd6,
        0xde
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $cioConnectors:Lkotlinx/coroutines/飘花落叶言子楪哲苏兰世;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
        }
    .end annotation
.end field

.field final synthetic $environment:Lio/ktor/server/application/飘花落叶言子楪世哲兰苏;

.field final synthetic $startupJob:Lkotlinx/coroutines/飘花落叶言子楪哲苏兰世;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
        }
    .end annotation
.end field

.field final synthetic $stopRequest:Lkotlinx/coroutines/飘花落叶言子楪哲兰苏世;

.field final synthetic $userDispatcher:Lkotlinx/coroutines/飘花落叶言子楪兰哲世苏;

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/ktor/server/cio/飘花落叶言子楪世哲苏兰;


# direct methods
.method public constructor <init>(Lio/ktor/server/cio/飘花落叶言子楪世哲苏兰;Lkotlinx/coroutines/飘花落叶言子楪哲苏兰世;Lkotlinx/coroutines/飘花落叶言子楪哲兰苏世;Lkotlinx/coroutines/飘花落叶言子楪哲苏兰世;Lkotlinx/coroutines/飘花落叶言子楪兰哲世苏;Lio/ktor/server/application/飘花落叶言子楪世哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/ktor/server/cio/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170;",
            "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;",
            "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u5170\u82cf\u4e16;",
            "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;",
            "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u54f2\u4e16\u82cf;",
            "Lio/ktor/server/application/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->this$0:Lio/ktor/server/cio/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    iput-object p2, p0, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->$cioConnectors:Lkotlinx/coroutines/飘花落叶言子楪哲苏兰世;

    .line 4
    .line 5
    iput-object p3, p0, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->$stopRequest:Lkotlinx/coroutines/飘花落叶言子楪哲兰苏世;

    .line 6
    .line 7
    iput-object p4, p0, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->$startupJob:Lkotlinx/coroutines/飘花落叶言子楪哲苏兰世;

    .line 8
    .line 9
    iput-object p5, p0, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->$userDispatcher:Lkotlinx/coroutines/飘花落叶言子楪兰哲世苏;

    .line 10
    .line 11
    iput-object p6, p0, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->$environment:Lio/ktor/server/application/飘花落叶言子楪世哲兰苏;

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
    new-instance v0, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;

    .line 2
    .line 3
    iget-object v1, p0, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->this$0:Lio/ktor/server/cio/飘花落叶言子楪世哲苏兰;

    .line 4
    .line 5
    iget-object v2, p0, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->$cioConnectors:Lkotlinx/coroutines/飘花落叶言子楪哲苏兰世;

    .line 6
    .line 7
    iget-object v3, p0, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->$stopRequest:Lkotlinx/coroutines/飘花落叶言子楪哲兰苏世;

    .line 8
    .line 9
    iget-object v4, p0, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->$startupJob:Lkotlinx/coroutines/飘花落叶言子楪哲苏兰世;

    .line 10
    .line 11
    iget-object v5, p0, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->$userDispatcher:Lkotlinx/coroutines/飘花落叶言子楪兰哲世苏;

    .line 12
    .line 13
    iget-object v6, p0, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->$environment:Lio/ktor/server/application/飘花落叶言子楪世哲兰苏;

    .line 14
    .line 15
    move-object v7, p2

    .line 16
    invoke-direct/range {v0 .. v7}, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;-><init>(Lio/ktor/server/cio/飘花落叶言子楪世哲苏兰;Lkotlinx/coroutines/飘花落叶言子楪哲苏兰世;Lkotlinx/coroutines/飘花落叶言子楪哲兰苏世;Lkotlinx/coroutines/飘花落叶言子楪哲苏兰世;Lkotlinx/coroutines/飘花落叶言子楪兰哲世苏;Lio/ktor/server/application/飘花落叶言子楪世哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, v0, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->L$0:Ljava/lang/Object;

    .line 20
    .line 21
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 4
    .line 5
    iget v2, v1, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->label:I

    .line 6
    .line 7
    sget-object v3, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    const/4 v4, 0x3

    .line 10
    const/4 v5, 0x2

    .line 11
    const/16 v6, 0xa

    .line 12
    .line 13
    const/4 v7, 0x1

    .line 14
    const/4 v8, 0x0

    .line 15
    if-eqz v2, :cond_3

    .line 16
    .line 17
    if-eq v2, v7, :cond_2

    .line 18
    .line 19
    if-eq v2, v5, :cond_1

    .line 20
    .line 21
    if-ne v2, v4, :cond_0

    .line 22
    .line 23
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-object v3

    .line 27
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-object v8

    .line 33
    :cond_1
    iget-object v2, v1, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->L$0:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v2, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto/16 :goto_7

    .line 41
    .line 42
    :cond_2
    iget-object v2, v1, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->L$4:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v2, Ljava/util/Collection;

    .line 45
    .line 46
    iget-object v9, v1, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->L$3:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v9, Lio/ktor/server/engine/飘花落叶言子楪哲苏世兰;

    .line 49
    .line 50
    iget-object v10, v1, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->L$2:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v10, Ljava/util/Iterator;

    .line 53
    .line 54
    iget-object v11, v1, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->L$1:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v11, Ljava/util/Collection;

    .line 57
    .line 58
    iget-object v12, v1, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->L$0:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v12, Ljava/util/ArrayList;

    .line 61
    .line 62
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    .line 65
    move-object/from16 v4, p1

    .line 66
    .line 67
    move v5, v7

    .line 68
    goto/16 :goto_4

    .line 69
    .line 70
    :catchall_0
    move-exception v0

    .line 71
    goto/16 :goto_a

    .line 72
    .line 73
    :cond_3
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    iget-object v2, v1, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->L$0:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v2, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    .line 79
    .line 80
    new-instance v12, Ljava/util/ArrayList;

    .line 81
    .line 82
    iget-object v9, v1, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->this$0:Lio/ktor/server/cio/飘花落叶言子楪世哲苏兰;

    .line 83
    .line 84
    iget-object v9, v9, Lio/ktor/server/cio/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:Lio/ktor/server/cio/飘花落叶言子楪世苏兰哲;

    .line 85
    .line 86
    iget-object v9, v9, Lio/ktor/server/cio/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 89
    .line 90
    .line 91
    move-result v9

    .line 92
    invoke-direct {v12, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 93
    .line 94
    .line 95
    :try_start_1
    iget-object v9, v1, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->this$0:Lio/ktor/server/cio/飘花落叶言子楪世哲苏兰;

    .line 96
    .line 97
    iget-object v9, v9, Lio/ktor/server/cio/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:Lio/ktor/server/cio/飘花落叶言子楪世苏兰哲;

    .line 98
    .line 99
    iget-object v9, v9, Lio/ktor/server/cio/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object v9

    .line 105
    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v10

    .line 109
    if-eqz v10, :cond_5

    .line 110
    .line 111
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v10

    .line 115
    check-cast v10, Lio/ktor/server/engine/飘花落叶言子楪哲苏世兰;

    .line 116
    .line 117
    invoke-interface {v10}, Lio/ktor/server/engine/飘花落叶言子楪哲苏世兰;->getType()Lio/ktor/server/engine/飘花落叶言子楪苏世兰哲;

    .line 118
    .line 119
    .line 120
    move-result-object v10

    .line 121
    sget-object v11, Lio/ktor/server/engine/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Lio/ktor/server/engine/飘花落叶言子楪苏世兰哲;

    .line 122
    .line 123
    invoke-static {v10, v11}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v10

    .line 127
    if-nez v10, :cond_4

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_4
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 131
    .line 132
    const-string v2, "CIO Engine does not currently support HTTPS. Please consider using a different engine if you require HTTPS"

    .line 133
    .line 134
    invoke-direct {v0, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    throw v0

    .line 138
    :cond_5
    iget-object v9, v1, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->this$0:Lio/ktor/server/cio/飘花落叶言子楪世哲苏兰;

    .line 139
    .line 140
    iget-object v10, v9, Lio/ktor/server/cio/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:Lio/ktor/server/cio/飘花落叶言子楪世苏兰哲;

    .line 141
    .line 142
    iget-object v10, v10, Lio/ktor/server/cio/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 143
    .line 144
    new-instance v11, Ljava/util/ArrayList;

    .line 145
    .line 146
    invoke-static {v10, v6}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子哲楪苏世兰(Ljava/lang/Iterable;I)I

    .line 147
    .line 148
    .line 149
    move-result v13

    .line 150
    invoke-direct {v11, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 154
    .line 155
    .line 156
    move-result-object v10

    .line 157
    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v13

    .line 161
    if-eqz v13, :cond_6

    .line 162
    .line 163
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v13

    .line 167
    check-cast v13, Lio/ktor/server/engine/飘花落叶言子楪哲苏世兰;

    .line 168
    .line 169
    invoke-interface {v13}, Lio/ktor/server/engine/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏兰哲()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v14

    .line 173
    invoke-interface {v13}, Lio/ktor/server/engine/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰()I

    .line 174
    .line 175
    .line 176
    move-result v15

    .line 177
    new-instance v4, Lio/ktor/server/cio/飘花落叶言子楪苏哲世兰;

    .line 178
    .line 179
    iget-object v5, v9, Lio/ktor/server/cio/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:Lio/ktor/server/cio/飘花落叶言子楪世苏兰哲;

    .line 180
    .line 181
    iget v5, v5, Lio/ktor/server/cio/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 182
    .line 183
    int-to-long v6, v5

    .line 184
    invoke-direct {v4, v14, v15, v6, v7}, Lio/ktor/server/cio/飘花落叶言子楪苏哲世兰;-><init>(Ljava/lang/String;IJ)V

    .line 185
    .line 186
    .line 187
    new-instance v5, Lio/ktor/server/cio/CIOApplicationEngine$startConnector$1;

    .line 188
    .line 189
    invoke-direct {v5, v9, v8}, Lio/ktor/server/cio/CIOApplicationEngine$startConnector$1;-><init>(Lio/ktor/server/cio/飘花落叶言子楪世哲苏兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 190
    .line 191
    .line 192
    invoke-static {v2, v4, v5}, Lio/ktor/server/cio/backend/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lio/ktor/server/cio/飘花落叶言子楪苏哲世兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;)Lio/ktor/server/cio/飘花落叶言子楪苏世兰哲;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    new-instance v5, Lkotlin/Pair;

    .line 197
    .line 198
    invoke-direct {v5, v13, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    const/4 v4, 0x3

    .line 205
    const/4 v5, 0x2

    .line 206
    const/16 v6, 0xa

    .line 207
    .line 208
    const/4 v7, 0x1

    .line 209
    goto :goto_1

    .line 210
    :cond_6
    new-instance v2, Ljava/util/ArrayList;

    .line 211
    .line 212
    const/16 v4, 0xa

    .line 213
    .line 214
    invoke-static {v11, v4}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子哲楪苏世兰(Ljava/lang/Iterable;I)I

    .line 215
    .line 216
    .line 217
    move-result v5

    .line 218
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 226
    .line 227
    .line 228
    move-result v5

    .line 229
    if-eqz v5, :cond_7

    .line 230
    .line 231
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v5

    .line 235
    check-cast v5, Lkotlin/Pair;

    .line 236
    .line 237
    invoke-virtual {v5}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v5

    .line 241
    check-cast v5, Lio/ktor/server/cio/飘花落叶言子楪苏世兰哲;

    .line 242
    .line 243
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    goto :goto_2

    .line 247
    :cond_7
    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 248
    .line 249
    .line 250
    new-instance v2, Ljava/util/ArrayList;

    .line 251
    .line 252
    const/16 v4, 0xa

    .line 253
    .line 254
    invoke-static {v11, v4}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子哲楪苏世兰(Ljava/lang/Iterable;I)I

    .line 255
    .line 256
    .line 257
    move-result v5

    .line 258
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 262
    .line 263
    .line 264
    move-result-object v4

    .line 265
    move-object v10, v4

    .line 266
    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 267
    .line 268
    .line 269
    move-result v4

    .line 270
    if-eqz v4, :cond_9

    .line 271
    .line 272
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v4

    .line 276
    check-cast v4, Lkotlin/Pair;

    .line 277
    .line 278
    invoke-virtual {v4}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v5

    .line 282
    move-object v9, v5

    .line 283
    check-cast v9, Lio/ktor/server/engine/飘花落叶言子楪哲苏世兰;

    .line 284
    .line 285
    invoke-virtual {v4}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v4

    .line 289
    check-cast v4, Lio/ktor/server/cio/飘花落叶言子楪苏世兰哲;

    .line 290
    .line 291
    iget-object v4, v4, Lio/ktor/server/cio/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Lkotlinx/coroutines/飘花落叶言子楪哲兰世苏;

    .line 292
    .line 293
    iput-object v12, v1, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->L$0:Ljava/lang/Object;

    .line 294
    .line 295
    iput-object v2, v1, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->L$1:Ljava/lang/Object;

    .line 296
    .line 297
    iput-object v10, v1, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->L$2:Ljava/lang/Object;

    .line 298
    .line 299
    iput-object v9, v1, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->L$3:Ljava/lang/Object;

    .line 300
    .line 301
    iput-object v2, v1, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->L$4:Ljava/lang/Object;

    .line 302
    .line 303
    const/4 v5, 0x1

    .line 304
    iput v5, v1, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->label:I

    .line 305
    .line 306
    invoke-virtual {v4, v1}, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;->飘花落叶言子世苏哲兰楪(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v4

    .line 310
    sget-object v6, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 311
    .line 312
    if-ne v4, v0, :cond_8

    .line 313
    .line 314
    goto/16 :goto_9

    .line 315
    .line 316
    :cond_8
    move-object v11, v2

    .line 317
    :goto_4
    new-instance v6, Lkotlin/Pair;

    .line 318
    .line 319
    invoke-direct {v6, v9, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    invoke-interface {v2, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    move-object v2, v11

    .line 326
    goto :goto_3

    .line 327
    :cond_9
    check-cast v2, Ljava/util/List;

    .line 328
    .line 329
    new-instance v4, Ljava/util/ArrayList;

    .line 330
    .line 331
    const/16 v5, 0xa

    .line 332
    .line 333
    invoke-static {v2, v5}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子哲楪苏世兰(Ljava/lang/Iterable;I)I

    .line 334
    .line 335
    .line 336
    move-result v5

    .line 337
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 338
    .line 339
    .line 340
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 341
    .line 342
    .line 343
    move-result-object v2

    .line 344
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 345
    .line 346
    .line 347
    move-result v5

    .line 348
    if-eqz v5, :cond_c

    .line 349
    .line 350
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v5

    .line 354
    check-cast v5, Lkotlin/Pair;

    .line 355
    .line 356
    invoke-virtual {v5}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v6

    .line 360
    check-cast v6, Lio/ktor/server/engine/飘花落叶言子楪哲苏世兰;

    .line 361
    .line 362
    invoke-virtual {v5}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v5

    .line 366
    check-cast v5, Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;

    .line 367
    .line 368
    invoke-virtual {v5}, Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;->getLocalAddress()Lio/ktor/network/sockets/飘花落叶言子楪哲兰苏世;

    .line 369
    .line 370
    .line 371
    move-result-object v5

    .line 372
    instance-of v7, v5, Lio/ktor/network/sockets/飘花落叶言子楪苏兰哲世;

    .line 373
    .line 374
    if-eqz v7, :cond_a

    .line 375
    .line 376
    check-cast v5, Lio/ktor/network/sockets/飘花落叶言子楪苏兰哲世;

    .line 377
    .line 378
    goto :goto_6

    .line 379
    :cond_a
    move-object v5, v8

    .line 380
    :goto_6
    if-eqz v5, :cond_b

    .line 381
    .line 382
    iget-object v5, v5, Lio/ktor/network/sockets/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Ljava/net/InetSocketAddress;

    .line 383
    .line 384
    invoke-virtual {v5}, Ljava/net/InetSocketAddress;->getPort()I

    .line 385
    .line 386
    .line 387
    move-result v5

    .line 388
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 389
    .line 390
    .line 391
    new-instance v7, Lio/ktor/server/engine/飘花落叶言子楪哲苏兰世;

    .line 392
    .line 393
    invoke-direct {v7, v6, v5}, Lio/ktor/server/engine/飘花落叶言子楪哲苏兰世;-><init>(Lio/ktor/server/engine/飘花落叶言子楪哲苏世兰;I)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 397
    .line 398
    .line 399
    goto :goto_5

    .line 400
    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 401
    .line 402
    const-string v2, "Expected inet socket address"

    .line 403
    .line 404
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    throw v0

    .line 408
    :cond_c
    iget-object v2, v1, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->$cioConnectors:Lkotlinx/coroutines/飘花落叶言子楪哲苏兰世;

    .line 409
    .line 410
    check-cast v2, Lkotlinx/coroutines/飘花落叶言子楪哲兰世苏;

    .line 411
    .line 412
    invoke-virtual {v2, v4}, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;->飘花落叶言子苏哲楪世兰(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 413
    .line 414
    .line 415
    iget-object v2, v1, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->$startupJob:Lkotlinx/coroutines/飘花落叶言子楪哲苏兰世;

    .line 416
    .line 417
    check-cast v2, Lkotlinx/coroutines/飘花落叶言子楪哲兰世苏;

    .line 418
    .line 419
    invoke-virtual {v2, v3}, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;->飘花落叶言子苏哲楪世兰(Ljava/lang/Object;)Z

    .line 420
    .line 421
    .line 422
    iget-object v2, v1, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->$stopRequest:Lkotlinx/coroutines/飘花落叶言子楪哲兰苏世;

    .line 423
    .line 424
    iput-object v12, v1, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->L$0:Ljava/lang/Object;

    .line 425
    .line 426
    iput-object v8, v1, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->L$1:Ljava/lang/Object;

    .line 427
    .line 428
    iput-object v8, v1, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->L$2:Ljava/lang/Object;

    .line 429
    .line 430
    iput-object v8, v1, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->L$3:Ljava/lang/Object;

    .line 431
    .line 432
    iput-object v8, v1, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->L$4:Ljava/lang/Object;

    .line 433
    .line 434
    const/4 v4, 0x2

    .line 435
    iput v4, v1, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->label:I

    .line 436
    .line 437
    check-cast v2, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;

    .line 438
    .line 439
    invoke-virtual {v2, v1}, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪哲兰苏世(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v2

    .line 443
    if-ne v2, v0, :cond_d

    .line 444
    .line 445
    goto :goto_9

    .line 446
    :cond_d
    move-object v2, v12

    .line 447
    :goto_7
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 448
    .line 449
    .line 450
    move-result-object v2

    .line 451
    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 452
    .line 453
    .line 454
    move-result v4

    .line 455
    if-eqz v4, :cond_e

    .line 456
    .line 457
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v4

    .line 461
    check-cast v4, Lio/ktor/server/cio/飘花落叶言子楪苏世兰哲;

    .line 462
    .line 463
    iget-object v5, v4, Lio/ktor/server/cio/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

    .line 464
    .line 465
    invoke-virtual {v5, v8}, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪苏世兰哲(Ljava/util/concurrent/CancellationException;)V

    .line 466
    .line 467
    .line 468
    iget-object v4, v4, Lio/ktor/server/cio/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

    .line 469
    .line 470
    invoke-virtual {v4, v8}, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪苏世兰哲(Ljava/util/concurrent/CancellationException;)V

    .line 471
    .line 472
    .line 473
    goto :goto_8

    .line 474
    :cond_e
    iget-object v2, v1, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->$userDispatcher:Lkotlinx/coroutines/飘花落叶言子楪兰哲世苏;

    .line 475
    .line 476
    new-instance v4, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1$5;

    .line 477
    .line 478
    iget-object v5, v1, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->this$0:Lio/ktor/server/cio/飘花落叶言子楪世哲苏兰;

    .line 479
    .line 480
    iget-object v6, v1, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->$environment:Lio/ktor/server/application/飘花落叶言子楪世哲兰苏;

    .line 481
    .line 482
    invoke-direct {v4, v5, v6, v8}, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1$5;-><init>(Lio/ktor/server/cio/飘花落叶言子楪世哲苏兰;Lio/ktor/server/application/飘花落叶言子楪世哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 483
    .line 484
    .line 485
    iput-object v8, v1, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->L$0:Ljava/lang/Object;

    .line 486
    .line 487
    const/4 v5, 0x3

    .line 488
    iput v5, v1, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->label:I

    .line 489
    .line 490
    invoke-static {v2, v4, v1}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世哲楪兰苏(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object v1

    .line 494
    if-ne v1, v0, :cond_f

    .line 495
    .line 496
    :goto_9
    return-object v0

    .line 497
    :cond_f
    return-object v3

    .line 498
    :goto_a
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 499
    .line 500
    .line 501
    move-result-object v2

    .line 502
    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 503
    .line 504
    .line 505
    move-result v3

    .line 506
    if-eqz v3, :cond_10

    .line 507
    .line 508
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v3

    .line 512
    check-cast v3, Lio/ktor/server/cio/飘花落叶言子楪苏世兰哲;

    .line 513
    .line 514
    iget-object v3, v3, Lio/ktor/server/cio/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

    .line 515
    .line 516
    invoke-virtual {v3, v8}, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪苏世兰哲(Ljava/util/concurrent/CancellationException;)V

    .line 517
    .line 518
    .line 519
    goto :goto_b

    .line 520
    :cond_10
    iget-object v2, v1, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->$stopRequest:Lkotlinx/coroutines/飘花落叶言子楪哲兰苏世;

    .line 521
    .line 522
    check-cast v2, Lkotlinx/coroutines/飘花落叶言子苏世哲楪兰;

    .line 523
    .line 524
    invoke-virtual {v2, v0}, Lkotlinx/coroutines/飘花落叶言子苏世哲楪兰;->飘花落叶言子哲世楪兰苏(Ljava/lang/Throwable;)Z

    .line 525
    .line 526
    .line 527
    iget-object v1, v1, Lio/ktor/server/cio/CIOApplicationEngine$initServerJob$1;->$startupJob:Lkotlinx/coroutines/飘花落叶言子楪哲苏兰世;

    .line 528
    .line 529
    check-cast v1, Lkotlinx/coroutines/飘花落叶言子楪哲兰世苏;

    .line 530
    .line 531
    invoke-virtual {v1, v0}, Lkotlinx/coroutines/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲世楪苏兰(Ljava/lang/Throwable;)Z

    .line 532
    .line 533
    .line 534
    throw v0
.end method
