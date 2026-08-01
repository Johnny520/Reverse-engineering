.class final Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;
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
    c = "io.ktor.server.cio.backend.HttpServerKt$httpServer$acceptJob$1"
    f = "HttpServer.kt"
    l = {
        0x2f,
        0x41,
        0x5b,
        0x5b
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $handler:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u5170\u4e16\u82cf;"
        }
    .end annotation
.end field

.field final synthetic $logger:L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏兰哲;

.field final synthetic $selector:Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

.field final synthetic $serverJob:Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

.field final synthetic $settings:Lio/ktor/server/cio/飘花落叶言子楪苏哲世兰;

.field final synthetic $socket:Lkotlinx/coroutines/飘花落叶言子楪哲苏兰世;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
        }
    .end annotation
.end field

.field final synthetic $timeout:J

.field I$0:I

.field J$0:J

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;Lio/ktor/server/cio/飘花落叶言子楪苏哲世兰;Lkotlinx/coroutines/飘花落叶言子楪哲苏兰世;L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏兰哲;Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;JL飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/ktor/network/selector/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u4e16\u54f2;",
            "Lio/ktor/server/cio/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u4e16\u5170;",
            "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u82cf\u696a\u5b50\u54f2\u4e16\u5170/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;",
            "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u4e16\u696a\u5170\u54f2;",
            "J",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u5170\u4e16\u82cf;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->$selector:Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    iput-object p2, p0, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->$settings:Lio/ktor/server/cio/飘花落叶言子楪苏哲世兰;

    .line 4
    .line 5
    iput-object p3, p0, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->$socket:Lkotlinx/coroutines/飘花落叶言子楪哲苏兰世;

    .line 6
    .line 7
    iput-object p4, p0, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->$logger:L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏兰哲;

    .line 8
    .line 9
    iput-object p5, p0, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->$serverJob:Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 10
    .line 11
    iput-wide p6, p0, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->$timeout:J

    .line 12
    .line 13
    iput-object p8, p0, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->$handler:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1, p9}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private static final invokeSuspend$lambda$0(Lio/ktor/server/cio/飘花落叶言子楪苏哲世兰;Lio/ktor/network/sockets/飘花落叶言子楪兰世哲苏;)Lkotlin/飘花落叶言子楪兰苏哲世;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    return-object p0
.end method

.method private static final invokeSuspend$lambda$2$lambda$1(Lio/ktor/network/sockets/飘花落叶言子楪哲兰世苏;Ljava/lang/Throwable;)Lkotlin/飘花落叶言子楪兰苏哲世;
    .locals 0

    .line 1
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 5
    .line 6
    return-object p0
.end method

.method public static synthetic 飘花落叶言子楪世苏兰哲(Lio/ktor/network/sockets/飘花落叶言子楪哲兰世苏;Ljava/lang/Throwable;)Lkotlin/飘花落叶言子楪兰苏哲世;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->invokeSuspend$lambda$2$lambda$1(Lio/ktor/network/sockets/飘花落叶言子楪哲兰世苏;Ljava/lang/Throwable;)Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
    .locals 10
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
    new-instance v0, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;

    .line 2
    .line 3
    iget-object v1, p0, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->$selector:Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

    .line 4
    .line 5
    iget-object v2, p0, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->$settings:Lio/ktor/server/cio/飘花落叶言子楪苏哲世兰;

    .line 6
    .line 7
    iget-object v3, p0, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->$socket:Lkotlinx/coroutines/飘花落叶言子楪哲苏兰世;

    .line 8
    .line 9
    iget-object v4, p0, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->$logger:L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏兰哲;

    .line 10
    .line 11
    iget-object v5, p0, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->$serverJob:Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 12
    .line 13
    iget-wide v6, p0, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->$timeout:J

    .line 14
    .line 15
    iget-object v8, p0, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->$handler:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;

    .line 16
    .line 17
    move-object v9, p2

    .line 18
    invoke-direct/range {v0 .. v9}, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;-><init>(Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;Lio/ktor/server/cio/飘花落叶言子楪苏哲世兰;Lkotlinx/coroutines/飘花落叶言子楪哲苏兰世;L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏兰哲;Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;JL飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, v0, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$0:Ljava/lang/Object;

    .line 22
    .line 23
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 4
    .line 5
    iget v0, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->label:I

    .line 6
    .line 7
    sget-object v3, Lkotlinx/coroutines/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/飘花落叶言子苏世楪哲兰;

    .line 8
    .line 9
    const/4 v4, 0x4

    .line 10
    const/4 v5, 0x3

    .line 11
    const/4 v6, 0x2

    .line 12
    const/4 v7, 0x1

    .line 13
    const/4 v8, 0x0

    .line 14
    const/4 v9, 0x0

    .line 15
    if-eqz v0, :cond_5

    .line 16
    .line 17
    if-eq v0, v7, :cond_4

    .line 18
    .line 19
    if-eq v0, v6, :cond_2

    .line 20
    .line 21
    if-eq v0, v5, :cond_1

    .line 22
    .line 23
    if-ne v0, v4, :cond_0

    .line 24
    .line 25
    iget-object v0, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$2:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Ljava/lang/Throwable;

    .line 28
    .line 29
    iget-object v2, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$1:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v2, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    .line 32
    .line 33
    iget-object v1, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$0:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v1, Ljava/io/Closeable;

    .line 36
    .line 37
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    goto/16 :goto_11

    .line 41
    .line 42
    :catchall_0
    move-exception v0

    .line 43
    move-object v6, v1

    .line 44
    :goto_0
    move-object v1, v0

    .line 45
    goto/16 :goto_13

    .line 46
    .line 47
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v9

    .line 53
    :cond_1
    iget-object v0, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$1:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    .line 56
    .line 57
    iget-object v1, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$0:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v1, Ljava/io/Closeable;

    .line 60
    .line 61
    :try_start_1
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 62
    .line 63
    .line 64
    goto/16 :goto_d

    .line 65
    .line 66
    :cond_2
    iget v7, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->I$0:I

    .line 67
    .line 68
    iget-wide v10, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->J$0:J

    .line 69
    .line 70
    iget-object v0, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$4:Ljava/lang/Object;

    .line 71
    .line 72
    move-object v12, v0

    .line 73
    check-cast v12, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    .line 74
    .line 75
    iget-object v0, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$3:Ljava/lang/Object;

    .line 76
    .line 77
    move-object v13, v0

    .line 78
    check-cast v13, Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;

    .line 79
    .line 80
    iget-object v0, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$2:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v0, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;

    .line 83
    .line 84
    iget-object v14, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$1:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v14, Ljava/io/Closeable;

    .line 87
    .line 88
    iget-object v15, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$0:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v15, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    .line 91
    .line 92
    :try_start_2
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 93
    .line 94
    .line 95
    move-object/from16 v4, p1

    .line 96
    .line 97
    :cond_3
    move-object v5, v12

    .line 98
    move-object/from16 v21, v14

    .line 99
    .line 100
    move-object v14, v0

    .line 101
    move-object v0, v15

    .line 102
    move-wide/from16 v22, v10

    .line 103
    .line 104
    move-object v10, v13

    .line 105
    move-wide/from16 v12, v22

    .line 106
    .line 107
    move-object/from16 v11, v21

    .line 108
    .line 109
    goto/16 :goto_7

    .line 110
    .line 111
    :catchall_1
    move-exception v0

    .line 112
    move-object v5, v12

    .line 113
    move-object v6, v14

    .line 114
    goto/16 :goto_f

    .line 115
    .line 116
    :catch_0
    move-object/from16 v17, v9

    .line 117
    .line 118
    move v9, v4

    .line 119
    move v4, v5

    .line 120
    move-object/from16 v5, v17

    .line 121
    .line 122
    move/from16 v17, v8

    .line 123
    .line 124
    :goto_1
    move v8, v6

    .line 125
    goto/16 :goto_12

    .line 126
    .line 127
    :cond_4
    iget-object v0, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$0:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v0, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    .line 130
    .line 131
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    move-object/from16 v12, p1

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_5
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    iget-object v0, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$0:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v0, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    .line 143
    .line 144
    iget-object v10, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->$selector:Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

    .line 145
    .line 146
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    new-instance v11, Ljava/util/HashMap;

    .line 150
    .line 151
    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    .line 152
    .line 153
    .line 154
    new-instance v12, Ljava/util/HashMap;

    .line 155
    .line 156
    invoke-direct {v12, v11}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 157
    .line 158
    .line 159
    iget-object v11, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->$settings:Lio/ktor/server/cio/飘花落叶言子楪苏哲世兰;

    .line 160
    .line 161
    iget-object v13, v11, Lio/ktor/server/cio/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 162
    .line 163
    iget v14, v11, Lio/ktor/server/cio/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:I

    .line 164
    .line 165
    iput-object v0, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$0:Ljava/lang/Object;

    .line 166
    .line 167
    iput v7, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->label:I

    .line 168
    .line 169
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    new-instance v7, Ljava/net/InetSocketAddress;

    .line 173
    .line 174
    invoke-direct {v7, v13, v14}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    .line 175
    .line 176
    .line 177
    new-instance v13, Lio/ktor/network/sockets/飘花落叶言子楪兰世哲苏;

    .line 178
    .line 179
    new-instance v14, Ljava/util/HashMap;

    .line 180
    .line 181
    invoke-direct {v14, v12}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 182
    .line 183
    .line 184
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 185
    .line 186
    .line 187
    invoke-static {v11, v13}, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->invokeSuspend$lambda$0(Lio/ktor/server/cio/飘花落叶言子楪苏哲世兰;Lio/ktor/network/sockets/飘花落叶言子楪兰世哲苏;)Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 188
    .line 189
    .line 190
    move-object v11, v10

    .line 191
    check-cast v11, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;

    .line 192
    .line 193
    iget-object v11, v11, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Ljava/nio/channels/spi/SelectorProvider;

    .line 194
    .line 195
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v11}, Ljava/nio/channels/spi/SelectorProvider;->openServerSocketChannel()Ljava/nio/channels/ServerSocketChannel;

    .line 199
    .line 200
    .line 201
    move-result-object v11

    .line 202
    :try_start_3
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    sget-boolean v12, Lio/ktor/network/sockets/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:Z

    .line 206
    .line 207
    invoke-virtual {v11, v8}, Ljava/nio/channels/SelectableChannel;->configureBlocking(Z)Ljava/nio/channels/SelectableChannel;

    .line 208
    .line 209
    .line 210
    new-instance v12, Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;

    .line 211
    .line 212
    invoke-direct {v12, v11, v10}, Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;-><init>(Ljava/nio/channels/ServerSocketChannel;Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;)V

    .line 213
    .line 214
    .line 215
    sget-boolean v10, Lio/ktor/network/sockets/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 216
    .line 217
    const/16 v13, 0x1ff

    .line 218
    .line 219
    iget-object v14, v12, Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰世苏:Ljava/nio/channels/ServerSocketChannel;

    .line 220
    .line 221
    if-eqz v10, :cond_6

    .line 222
    .line 223
    :try_start_4
    invoke-virtual {v14, v7, v13}, Ljava/nio/channels/ServerSocketChannel;->bind(Ljava/net/SocketAddress;I)Ljava/nio/channels/ServerSocketChannel;

    .line 224
    .line 225
    .line 226
    goto :goto_2

    .line 227
    :catchall_2
    move-exception v0

    .line 228
    goto/16 :goto_15

    .line 229
    .line 230
    :cond_6
    invoke-virtual {v14}, Ljava/nio/channels/ServerSocketChannel;->socket()Ljava/net/ServerSocket;

    .line 231
    .line 232
    .line 233
    move-result-object v10

    .line 234
    invoke-virtual {v10, v7, v13}, Ljava/net/ServerSocket;->bind(Ljava/net/SocketAddress;I)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 235
    .line 236
    .line 237
    :goto_2
    if-ne v12, v2, :cond_7

    .line 238
    .line 239
    goto/16 :goto_10

    .line 240
    .line 241
    :cond_7
    :goto_3
    move-object v7, v12

    .line 242
    check-cast v7, Ljava/io/Closeable;

    .line 243
    .line 244
    iget-object v10, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->$socket:Lkotlinx/coroutines/飘花落叶言子楪哲苏兰世;

    .line 245
    .line 246
    iget-object v11, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->$logger:L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏兰哲;

    .line 247
    .line 248
    iget-object v12, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->$serverJob:Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 249
    .line 250
    iget-wide v13, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->$timeout:J

    .line 251
    .line 252
    iget-object v15, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->$handler:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;

    .line 253
    .line 254
    :try_start_5
    move-object v4, v7

    .line 255
    check-cast v4, Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;

    .line 256
    .line 257
    check-cast v10, Lkotlinx/coroutines/飘花落叶言子楪哲兰世苏;

    .line 258
    .line 259
    invoke-virtual {v10, v4}, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;->飘花落叶言子苏哲楪世兰(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    invoke-interface {v0}, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;->飘花落叶言子世哲苏楪兰()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 263
    .line 264
    .line 265
    move-result-object v10

    .line 266
    sget-object v5, Lkotlinx/coroutines/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/飘花落叶言子楪兰哲苏世;

    .line 267
    .line 268
    invoke-interface {v10, v5}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->get(Lkotlin/coroutines/飘花落叶言子楪苏世哲兰;)Lkotlin/coroutines/飘花落叶言子楪世兰哲苏;

    .line 269
    .line 270
    .line 271
    move-result-object v5

    .line 272
    check-cast v5, Lkotlinx/coroutines/飘花落叶言子世楪苏哲兰;

    .line 273
    .line 274
    if-nez v5, :cond_8

    .line 275
    .line 276
    new-instance v5, Lio/ktor/server/engine/飘花落叶言子楪苏哲兰世;

    .line 277
    .line 278
    invoke-direct {v5, v11}, Lio/ktor/server/engine/飘花落叶言子楪苏哲兰世;-><init>(L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏兰哲;)V

    .line 279
    .line 280
    .line 281
    goto :goto_4

    .line 282
    :catchall_3
    move-exception v0

    .line 283
    move-object v1, v0

    .line 284
    move-object v6, v7

    .line 285
    goto/16 :goto_13

    .line 286
    .line 287
    :cond_8
    :goto_4
    invoke-interface {v0}, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;->飘花落叶言子世哲苏楪兰()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 288
    .line 289
    .line 290
    move-result-object v10

    .line 291
    new-instance v11, Lkotlinx/coroutines/飘花落叶言子哲楪苏兰世;

    .line 292
    .line 293
    invoke-direct {v11, v12}, Lkotlinx/coroutines/飘花落叶言子苏世哲楪兰;-><init>(Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;)V

    .line 294
    .line 295
    .line 296
    invoke-interface {v10, v11}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->plus(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 297
    .line 298
    .line 299
    move-result-object v10

    .line 300
    invoke-interface {v10, v5}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->plus(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 301
    .line 302
    .line 303
    move-result-object v5

    .line 304
    new-instance v10, Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;

    .line 305
    .line 306
    const-string v11, "request"

    .line 307
    .line 308
    invoke-direct {v10, v11}, Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;-><init>(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    invoke-interface {v5, v10}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->plus(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 312
    .line 313
    .line 314
    move-result-object v5

    .line 315
    invoke-static {v5}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlinx/coroutines/internal/飘花落叶言子楪世哲苏兰;

    .line 316
    .line 317
    .line 318
    move-result-object v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 319
    move-object v10, v15

    .line 320
    move-object v15, v0

    .line 321
    move-object v0, v10

    .line 322
    move-object v12, v5

    .line 323
    move-wide v10, v13

    .line 324
    move-object v13, v4

    .line 325
    move-object v14, v7

    .line 326
    move v7, v8

    .line 327
    :goto_5
    :try_start_6
    iput-object v15, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$0:Ljava/lang/Object;
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_8
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 328
    .line 329
    :try_start_7
    iput-object v14, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$1:Ljava/lang/Object;

    .line 330
    .line 331
    iput-object v0, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$2:Ljava/lang/Object;

    .line 332
    .line 333
    iput-object v13, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$3:Ljava/lang/Object;

    .line 334
    .line 335
    iput-object v12, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$4:Ljava/lang/Object;

    .line 336
    .line 337
    iput-wide v10, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->J$0:J

    .line 338
    .line 339
    iput v7, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->I$0:I

    .line 340
    .line 341
    iput v6, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->label:I
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 342
    .line 343
    :try_start_8
    iget-object v4, v13, Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰世苏:Ljava/nio/channels/ServerSocketChannel;

    .line 344
    .line 345
    invoke-virtual {v4}, Ljava/nio/channels/ServerSocketChannel;->accept()Ljava/nio/channels/SocketChannel;

    .line 346
    .line 347
    .line 348
    move-result-object v4

    .line 349
    if-eqz v4, :cond_9

    .line 350
    .line 351
    invoke-virtual {v13, v4}, Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰(Ljava/nio/channels/SocketChannel;)Lio/ktor/network/sockets/飘花落叶言子楪兰世苏哲;

    .line 352
    .line 353
    .line 354
    move-result-object v4

    .line 355
    goto :goto_6

    .line 356
    :cond_9
    invoke-virtual {v13, v1}, Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v4
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_6
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 360
    :goto_6
    if-ne v4, v2, :cond_3

    .line 361
    .line 362
    goto/16 :goto_10

    .line 363
    .line 364
    :goto_7
    :try_start_9
    check-cast v4, Lio/ktor/network/sockets/飘花落叶言子楪哲兰世苏;
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_5
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    .line 365
    .line 366
    move-object v15, v11

    .line 367
    :try_start_a
    new-instance v11, Lio/ktor/server/cio/backend/飘花落叶言子楪世哲苏兰;

    .line 368
    .line 369
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 370
    .line 371
    .line 372
    new-instance v6, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 373
    .line 374
    invoke-direct {v6, v8}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;-><init>(Z)V

    .line 375
    .line 376
    .line 377
    invoke-interface {v4, v6}, Lio/ktor/network/sockets/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏(Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;)Lio/ktor/utils/io/飘花落叶言子世楪哲兰苏;

    .line 378
    .line 379
    .line 380
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 381
    .line 382
    .line 383
    new-instance v9, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 384
    .line 385
    invoke-direct {v9, v8}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;-><init>(Z)V

    .line 386
    .line 387
    .line 388
    invoke-interface {v4, v9}, Lio/ktor/network/sockets/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰世哲(Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;)Lio/ktor/utils/io/飘花落叶言子世楪苏哲兰;

    .line 389
    .line 390
    .line 391
    invoke-interface {v4}, Lio/ktor/network/sockets/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲世苏兰()Lio/ktor/network/sockets/飘花落叶言子楪哲兰苏世;

    .line 392
    .line 393
    .line 394
    move-result-object v16

    .line 395
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 396
    .line 397
    .line 398
    invoke-virtual/range {v16 .. v16}, Lio/ktor/network/sockets/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰()Ljava/net/SocketAddress;

    .line 399
    .line 400
    .line 401
    move-result-object v8
    :try_end_a
    .catch Ljava/nio/channels/ClosedChannelException; {:try_start_a .. :try_end_a} :catch_3
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 402
    move-object/from16 p1, v0

    .line 403
    .line 404
    :try_start_b
    instance-of v0, v8, Ljava/net/InetSocketAddress;

    .line 405
    .line 406
    if-eqz v0, :cond_a

    .line 407
    .line 408
    move-object v0, v8

    .line 409
    check-cast v0, Ljava/net/InetSocketAddress;
    :try_end_b
    .catch Ljava/nio/channels/ClosedChannelException; {:try_start_b .. :try_end_b} :catch_2
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 410
    .line 411
    goto :goto_8

    .line 412
    :cond_a
    const/4 v0, 0x0

    .line 413
    :goto_8
    const-string v8, "Expected inet socket address"

    .line 414
    .line 415
    if-eqz v0, :cond_d

    .line 416
    .line 417
    :try_start_c
    invoke-interface {v4}, Lio/ktor/network/sockets/飘花落叶言子楪世苏哲兰;->getLocalAddress()Lio/ktor/network/sockets/飘花落叶言子楪哲兰苏世;

    .line 418
    .line 419
    .line 420
    move-result-object v16

    .line 421
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_c
    .catch Ljava/nio/channels/ClosedChannelException; {:try_start_c .. :try_end_c} :catch_2
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    .line 422
    .line 423
    .line 424
    move-object/from16 v18, v10

    .line 425
    .line 426
    :try_start_d
    invoke-virtual/range {v16 .. v16}, Lio/ktor/network/sockets/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰()Ljava/net/SocketAddress;

    .line 427
    .line 428
    .line 429
    move-result-object v10

    .line 430
    move-wide/from16 v19, v12

    .line 431
    .line 432
    instance-of v12, v10, Ljava/net/InetSocketAddress;

    .line 433
    .line 434
    if-eqz v12, :cond_b

    .line 435
    .line 436
    check-cast v10, Ljava/net/InetSocketAddress;

    .line 437
    .line 438
    goto :goto_9

    .line 439
    :cond_b
    const/4 v10, 0x0

    .line 440
    :goto_9
    if-eqz v10, :cond_c

    .line 441
    .line 442
    invoke-direct {v11, v6, v9, v0, v10}, Lio/ktor/server/cio/backend/飘花落叶言子楪世哲苏兰;-><init>(Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;Ljava/net/InetSocketAddress;Ljava/net/InetSocketAddress;)V

    .line 443
    .line 444
    .line 445
    sget-object v0, Lio/ktor/server/cio/backend/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 446
    .line 447
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 451
    .line 452
    .line 453
    sget-object v0, Lio/ktor/server/cio/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;

    .line 454
    .line 455
    new-instance v10, Lio/ktor/server/cio/backend/ServerPipelineKt$startServerConnectionPipeline$1;
    :try_end_d
    .catch Ljava/nio/channels/ClosedChannelException; {:try_start_d .. :try_end_d} :catch_1
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    .line 456
    .line 457
    move-object v6, v15

    .line 458
    const/4 v15, 0x0

    .line 459
    move-object/from16 v9, v18

    .line 460
    .line 461
    move-wide/from16 v12, v19

    .line 462
    .line 463
    :try_start_e
    invoke-direct/range {v10 .. v15}, Lio/ktor/server/cio/backend/ServerPipelineKt$startServerConnectionPipeline$1;-><init>(Lio/ktor/server/cio/backend/飘花落叶言子楪世哲苏兰;JL飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 464
    .line 465
    .line 466
    const/4 v8, 0x2

    .line 467
    const/4 v11, 0x0

    .line 468
    invoke-static {v5, v0, v11, v10, v8}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪哲苏兰(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlinx/coroutines/CoroutineStart;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;I)Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    new-instance v10, Lio/ktor/server/cio/backend/飘花落叶言子楪世苏哲兰;

    .line 473
    .line 474
    const/4 v11, 0x0

    .line 475
    invoke-direct {v10, v4, v11}, Lio/ktor/server/cio/backend/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/Object;I)V

    .line 476
    .line 477
    .line 478
    invoke-virtual {v0, v10}, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;->飘花落叶言子世兰楪哲苏(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Lkotlinx/coroutines/飘花落叶言子世哲苏楪兰;

    .line 479
    .line 480
    .line 481
    move-object/from16 v15, p1

    .line 482
    .line 483
    move-object v12, v5

    .line 484
    move-object v13, v9

    .line 485
    move-object v0, v14

    .line 486
    const/4 v9, 0x0

    .line 487
    move-object v14, v6

    .line 488
    move v6, v8

    .line 489
    move v8, v11

    .line 490
    move-wide/from16 v10, v19

    .line 491
    .line 492
    goto/16 :goto_5

    .line 493
    .line 494
    :catchall_4
    move-exception v0

    .line 495
    :goto_a
    move-object v13, v9

    .line 496
    goto/16 :goto_f

    .line 497
    .line 498
    :catchall_5
    move-exception v0

    .line 499
    move-object v6, v15

    .line 500
    move-object/from16 v9, v18

    .line 501
    .line 502
    goto :goto_a

    .line 503
    :catch_1
    move-object v6, v15

    .line 504
    move-object/from16 v9, v18

    .line 505
    .line 506
    goto :goto_c

    .line 507
    :cond_c
    move-object v6, v15

    .line 508
    move-object/from16 v9, v18

    .line 509
    .line 510
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 511
    .line 512
    invoke-direct {v0, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 513
    .line 514
    .line 515
    throw v0

    .line 516
    :catchall_6
    move-exception v0

    .line 517
    move-object v9, v10

    .line 518
    move-object v6, v15

    .line 519
    goto :goto_a

    .line 520
    :catch_2
    :goto_b
    move-object v9, v10

    .line 521
    move-object v6, v15

    .line 522
    goto :goto_c

    .line 523
    :cond_d
    move-object v9, v10

    .line 524
    move-object v6, v15

    .line 525
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 526
    .line 527
    invoke-direct {v0, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 528
    .line 529
    .line 530
    throw v0
    :try_end_e
    .catch Ljava/nio/channels/ClosedChannelException; {:try_start_e .. :try_end_e} :catch_4
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .line 531
    :catch_3
    move-object/from16 p1, v0

    .line 532
    .line 533
    goto :goto_b

    .line 534
    :catch_4
    :goto_c
    :try_start_f
    invoke-interface/range {p1 .. p1}, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;->飘花落叶言子世哲苏楪兰()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    invoke-interface {v0, v3}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->get(Lkotlin/coroutines/飘花落叶言子楪苏世哲兰;)Lkotlin/coroutines/飘花落叶言子楪世兰哲苏;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    check-cast v0, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 543
    .line 544
    if-eqz v0, :cond_e

    .line 545
    .line 546
    const/4 v11, 0x0

    .line 547
    invoke-interface {v0, v11}, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪苏世兰哲(Ljava/util/concurrent/CancellationException;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_4

    .line 548
    .line 549
    .line 550
    :cond_e
    :try_start_10
    invoke-virtual {v9}, Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;->close()V

    .line 551
    .line 552
    .line 553
    iput-object v6, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$0:Ljava/lang/Object;

    .line 554
    .line 555
    iput-object v5, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$1:Ljava/lang/Object;

    .line 556
    .line 557
    const/4 v11, 0x0

    .line 558
    iput-object v11, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$2:Ljava/lang/Object;

    .line 559
    .line 560
    iput-object v11, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$3:Ljava/lang/Object;

    .line 561
    .line 562
    iput-object v11, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$4:Ljava/lang/Object;

    .line 563
    .line 564
    iput v7, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->I$0:I

    .line 565
    .line 566
    const/4 v4, 0x3

    .line 567
    iput v4, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->label:I

    .line 568
    .line 569
    invoke-static {v9, v1}, Lio/ktor/network/sockets/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    .line 573
    if-ne v0, v2, :cond_f

    .line 574
    .line 575
    goto/16 :goto_10

    .line 576
    .line 577
    :cond_f
    move-object v0, v5

    .line 578
    move-object v1, v6

    .line 579
    :goto_d
    :try_start_11
    invoke-interface {v0}, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;->飘花落叶言子世哲苏楪兰()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    invoke-interface {v0, v3}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->get(Lkotlin/coroutines/飘花落叶言子楪苏世哲兰;)Lkotlin/coroutines/飘花落叶言子楪世兰哲苏;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    check-cast v0, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 588
    .line 589
    if-eqz v0, :cond_10

    .line 590
    .line 591
    const/4 v11, 0x0

    .line 592
    invoke-interface {v0, v11}, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪苏世兰哲(Ljava/util/concurrent/CancellationException;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    .line 593
    .line 594
    .line 595
    :cond_10
    if-eqz v1, :cond_11

    .line 596
    .line 597
    invoke-interface {v1}, Ljava/io/Closeable;->close()V

    .line 598
    .line 599
    .line 600
    :cond_11
    sget-object v0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 601
    .line 602
    return-object v0

    .line 603
    :catchall_7
    move-exception v0

    .line 604
    goto/16 :goto_0

    .line 605
    .line 606
    :catchall_8
    move-exception v0

    .line 607
    move-object v9, v10

    .line 608
    move-object v6, v11

    .line 609
    goto :goto_a

    .line 610
    :catch_5
    move/from16 p1, v8

    .line 611
    .line 612
    move v8, v6

    .line 613
    move-object v6, v11

    .line 614
    move/from16 v11, p1

    .line 615
    .line 616
    move-object/from16 p1, v0

    .line 617
    .line 618
    move-object v9, v10

    .line 619
    move-wide/from16 v19, v12

    .line 620
    .line 621
    const/4 v4, 0x3

    .line 622
    move-object/from16 v15, p1

    .line 623
    .line 624
    move-object v12, v5

    .line 625
    move-object v13, v9

    .line 626
    move/from16 v17, v11

    .line 627
    .line 628
    move-object v0, v14

    .line 629
    move-wide/from16 v10, v19

    .line 630
    .line 631
    const/4 v5, 0x0

    .line 632
    const/4 v9, 0x4

    .line 633
    move-object v14, v6

    .line 634
    goto :goto_12

    .line 635
    :catch_6
    move/from16 v17, v8

    .line 636
    .line 637
    const/4 v4, 0x3

    .line 638
    move v8, v6

    .line 639
    const/4 v5, 0x0

    .line 640
    :goto_e
    const/4 v9, 0x4

    .line 641
    goto :goto_12

    .line 642
    :catch_7
    move/from16 v17, v8

    .line 643
    .line 644
    const/4 v4, 0x3

    .line 645
    move v8, v6

    .line 646
    move-object v5, v9

    .line 647
    goto :goto_e

    .line 648
    :goto_f
    :try_start_12
    invoke-virtual {v13}, Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;->close()V

    .line 649
    .line 650
    .line 651
    iput-object v6, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$0:Ljava/lang/Object;

    .line 652
    .line 653
    iput-object v5, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$1:Ljava/lang/Object;

    .line 654
    .line 655
    iput-object v0, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$2:Ljava/lang/Object;

    .line 656
    .line 657
    const/4 v11, 0x0

    .line 658
    iput-object v11, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$3:Ljava/lang/Object;

    .line 659
    .line 660
    iput-object v11, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$4:Ljava/lang/Object;

    .line 661
    .line 662
    iput v7, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->I$0:I

    .line 663
    .line 664
    const/4 v9, 0x4

    .line 665
    iput v9, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->label:I

    .line 666
    .line 667
    invoke-static {v13, v1}, Lio/ktor/network/sockets/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 668
    .line 669
    .line 670
    move-result-object v1
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_7

    .line 671
    if-ne v1, v2, :cond_12

    .line 672
    .line 673
    :goto_10
    return-object v2

    .line 674
    :cond_12
    move-object v2, v5

    .line 675
    move-object v1, v6

    .line 676
    :goto_11
    :try_start_13
    invoke-interface {v2}, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;->飘花落叶言子世哲苏楪兰()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 677
    .line 678
    .line 679
    move-result-object v2

    .line 680
    invoke-interface {v2, v3}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->get(Lkotlin/coroutines/飘花落叶言子楪苏世哲兰;)Lkotlin/coroutines/飘花落叶言子楪世兰哲苏;

    .line 681
    .line 682
    .line 683
    move-result-object v2

    .line 684
    check-cast v2, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 685
    .line 686
    if-eqz v2, :cond_13

    .line 687
    .line 688
    const/4 v5, 0x0

    .line 689
    invoke-interface {v2, v5}, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪苏世兰哲(Ljava/util/concurrent/CancellationException;)V

    .line 690
    .line 691
    .line 692
    :cond_13
    throw v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_0

    .line 693
    :catch_8
    move/from16 v17, v8

    .line 694
    .line 695
    move-object v5, v9

    .line 696
    const/4 v4, 0x3

    .line 697
    const/4 v9, 0x4

    .line 698
    goto/16 :goto_1

    .line 699
    .line 700
    :goto_12
    move-object v9, v5

    .line 701
    move v6, v8

    .line 702
    move/from16 v8, v17

    .line 703
    .line 704
    goto/16 :goto_5

    .line 705
    .line 706
    :goto_13
    if-eqz v6, :cond_14

    .line 707
    .line 708
    :try_start_14
    invoke-interface {v6}, Ljava/io/Closeable;->close()V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_9

    .line 709
    .line 710
    .line 711
    goto :goto_14

    .line 712
    :catchall_9
    move-exception v0

    .line 713
    invoke-static {v1, v0}, Lkotlin/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 714
    .line 715
    .line 716
    :cond_14
    :goto_14
    throw v1

    .line 717
    :goto_15
    invoke-interface {v11}, Ljava/io/Closeable;->close()V

    .line 718
    .line 719
    .line 720
    throw v0
.end method
