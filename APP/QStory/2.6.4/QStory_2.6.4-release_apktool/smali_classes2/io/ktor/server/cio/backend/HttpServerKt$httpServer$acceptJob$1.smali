.class final Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;
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
        0x0,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏兰哲楪/飘花落叶言子楪世哲苏兰;
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
.field final synthetic $handler:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲兰世苏;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u5170\u4e16\u82cf;"
        }
    .end annotation
.end field

.field final synthetic $logger:L飘花落叶言苏楪世子兰哲/飘花落叶言子楪世苏兰哲;

.field final synthetic $selector:Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

.field final synthetic $serverJob:Lkotlinx/coroutines/飘花落叶言子苏世兰楪哲;

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
.method public constructor <init>(Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;Lio/ktor/server/cio/飘花落叶言子楪苏哲世兰;Lkotlinx/coroutines/飘花落叶言子楪哲苏兰世;L飘花落叶言苏楪世子兰哲/飘花落叶言子楪世苏兰哲;Lkotlinx/coroutines/飘花落叶言子苏世兰楪哲;JL飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲兰世苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/ktor/network/selector/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u4e16\u54f2;",
            "Lio/ktor/server/cio/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u4e16\u5170;",
            "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u82cf\u696a\u4e16\u5b50\u5170\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;",
            "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u4e16\u5170\u696a\u54f2;",
            "J",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u5170\u4e16\u82cf;",
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
    iput-object p4, p0, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->$logger:L飘花落叶言苏楪世子兰哲/飘花落叶言子楪世苏兰哲;

    .line 8
    .line 9
    iput-object p5, p0, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->$serverJob:Lkotlinx/coroutines/飘花落叶言子苏世兰楪哲;

    .line 10
    .line 11
    iput-wide p6, p0, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->$timeout:J

    .line 12
    .line 13
    iput-object p8, p0, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->$handler:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲兰世苏;

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

.method public static synthetic 飘花落叶言子楪世哲兰苏(Lio/ktor/network/sockets/飘花落叶言子楪哲兰世苏;Ljava/lang/Throwable;)Lkotlin/飘花落叶言子楪兰苏哲世;
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
    iget-object v4, p0, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->$logger:L飘花落叶言苏楪世子兰哲/飘花落叶言子楪世苏兰哲;

    .line 10
    .line 11
    iget-object v5, p0, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->$serverJob:Lkotlinx/coroutines/飘花落叶言子苏世兰楪哲;

    .line 12
    .line 13
    iget-wide v6, p0, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->$timeout:J

    .line 14
    .line 15
    iget-object v8, p0, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->$handler:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲兰世苏;

    .line 16
    .line 17
    move-object v9, p2

    .line 18
    invoke-direct/range {v0 .. v9}, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;-><init>(Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;Lio/ktor/server/cio/飘花落叶言子楪苏哲世兰;Lkotlinx/coroutines/飘花落叶言子楪哲苏兰世;L飘花落叶言苏楪世子兰哲/飘花落叶言子楪世苏兰哲;Lkotlinx/coroutines/飘花落叶言子苏世兰楪哲;JL飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲兰世苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

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
    .locals 22

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
    const/4 v3, 0x4

    .line 8
    const/4 v4, 0x3

    .line 9
    const/4 v5, 0x2

    .line 10
    const/4 v6, 0x1

    .line 11
    const/4 v7, 0x0

    .line 12
    const/4 v8, 0x0

    .line 13
    if-eqz v0, :cond_5

    .line 14
    .line 15
    if-eq v0, v6, :cond_4

    .line 16
    .line 17
    if-eq v0, v5, :cond_2

    .line 18
    .line 19
    if-eq v0, v4, :cond_1

    .line 20
    .line 21
    if-eq v0, v3, :cond_0

    .line 22
    .line 23
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-static {v0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-object v8

    .line 29
    :cond_0
    iget-object v0, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$2:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Ljava/lang/Throwable;

    .line 32
    .line 33
    iget-object v2, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$1:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v2, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    .line 36
    .line 37
    iget-object v1, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$0:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, Ljava/io/Closeable;

    .line 40
    .line 41
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    goto/16 :goto_f

    .line 45
    .line 46
    :catchall_0
    move-exception v0

    .line 47
    move-object v4, v1

    .line 48
    :goto_0
    move-object v1, v0

    .line 49
    goto/16 :goto_11

    .line 50
    .line 51
    :cond_1
    iget-object v0, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$1:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    .line 54
    .line 55
    iget-object v1, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$0:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v1, Ljava/io/Closeable;

    .line 58
    .line 59
    :try_start_1
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 60
    .line 61
    .line 62
    goto/16 :goto_b

    .line 63
    .line 64
    :cond_2
    iget v6, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->I$0:I

    .line 65
    .line 66
    iget-wide v9, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->J$0:J

    .line 67
    .line 68
    iget-object v0, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$4:Ljava/lang/Object;

    .line 69
    .line 70
    move-object v11, v0

    .line 71
    check-cast v11, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    .line 72
    .line 73
    iget-object v0, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$3:Ljava/lang/Object;

    .line 74
    .line 75
    move-object v12, v0

    .line 76
    check-cast v12, Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;

    .line 77
    .line 78
    iget-object v0, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$2:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v0, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲兰世苏;

    .line 81
    .line 82
    iget-object v13, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$1:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v13, Ljava/io/Closeable;

    .line 85
    .line 86
    iget-object v14, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$0:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v14, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    .line 89
    .line 90
    :try_start_2
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 91
    .line 92
    .line 93
    move-object/from16 v3, p1

    .line 94
    .line 95
    :cond_3
    move-object v15, v11

    .line 96
    move-object/from16 v19, v13

    .line 97
    .line 98
    move-object v13, v0

    .line 99
    move-object v0, v14

    .line 100
    move-wide/from16 v20, v9

    .line 101
    .line 102
    move-object v9, v12

    .line 103
    move-wide/from16 v11, v20

    .line 104
    .line 105
    move-object/from16 v10, v19

    .line 106
    .line 107
    goto/16 :goto_6

    .line 108
    .line 109
    :catchall_1
    move-exception v0

    .line 110
    move-object v15, v11

    .line 111
    move-object v4, v13

    .line 112
    goto/16 :goto_d

    .line 113
    .line 114
    :catch_0
    move/from16 v17, v7

    .line 115
    .line 116
    move v7, v5

    .line 117
    move v5, v3

    .line 118
    move v3, v4

    .line 119
    goto/16 :goto_10

    .line 120
    .line 121
    :cond_4
    iget-object v0, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$0:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v0, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    .line 124
    .line 125
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    move-object/from16 v11, p1

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_5
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    iget-object v0, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$0:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v0, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    .line 137
    .line 138
    iget-object v9, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->$selector:Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

    .line 139
    .line 140
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    new-instance v10, Ljava/util/HashMap;

    .line 144
    .line 145
    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    .line 146
    .line 147
    .line 148
    new-instance v11, Ljava/util/HashMap;

    .line 149
    .line 150
    invoke-direct {v11, v10}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 151
    .line 152
    .line 153
    iget-object v10, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->$settings:Lio/ktor/server/cio/飘花落叶言子楪苏哲世兰;

    .line 154
    .line 155
    iget-object v12, v10, Lio/ktor/server/cio/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 156
    .line 157
    iget v13, v10, Lio/ktor/server/cio/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:I

    .line 158
    .line 159
    iput-object v0, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$0:Ljava/lang/Object;

    .line 160
    .line 161
    iput v6, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->label:I

    .line 162
    .line 163
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    new-instance v6, Ljava/net/InetSocketAddress;

    .line 167
    .line 168
    invoke-direct {v6, v12, v13}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    .line 169
    .line 170
    .line 171
    new-instance v12, Lio/ktor/network/sockets/飘花落叶言子楪兰世哲苏;

    .line 172
    .line 173
    new-instance v13, Ljava/util/HashMap;

    .line 174
    .line 175
    invoke-direct {v13, v11}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 176
    .line 177
    .line 178
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 179
    .line 180
    .line 181
    invoke-static {v10, v12}, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->invokeSuspend$lambda$0(Lio/ktor/server/cio/飘花落叶言子楪苏哲世兰;Lio/ktor/network/sockets/飘花落叶言子楪兰世哲苏;)Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 182
    .line 183
    .line 184
    move-object v10, v9

    .line 185
    check-cast v10, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;

    .line 186
    .line 187
    iget-object v10, v10, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Ljava/nio/channels/spi/SelectorProvider;

    .line 188
    .line 189
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v10}, Ljava/nio/channels/spi/SelectorProvider;->openServerSocketChannel()Ljava/nio/channels/ServerSocketChannel;

    .line 193
    .line 194
    .line 195
    move-result-object v10

    .line 196
    :try_start_3
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    sget-boolean v11, Lio/ktor/network/sockets/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:Z

    .line 200
    .line 201
    invoke-virtual {v10, v7}, Ljava/nio/channels/SelectableChannel;->configureBlocking(Z)Ljava/nio/channels/SelectableChannel;

    .line 202
    .line 203
    .line 204
    new-instance v11, Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;

    .line 205
    .line 206
    invoke-direct {v11, v10, v9}, Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;-><init>(Ljava/nio/channels/ServerSocketChannel;Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;)V

    .line 207
    .line 208
    .line 209
    sget-boolean v9, Lio/ktor/network/sockets/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 210
    .line 211
    const/16 v12, 0x1ff

    .line 212
    .line 213
    iget-object v13, v11, Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰世苏:Ljava/nio/channels/ServerSocketChannel;

    .line 214
    .line 215
    if-eqz v9, :cond_6

    .line 216
    .line 217
    :try_start_4
    invoke-virtual {v13, v6, v12}, Ljava/nio/channels/ServerSocketChannel;->bind(Ljava/net/SocketAddress;I)Ljava/nio/channels/ServerSocketChannel;

    .line 218
    .line 219
    .line 220
    goto :goto_1

    .line 221
    :catchall_2
    move-exception v0

    .line 222
    goto/16 :goto_13

    .line 223
    .line 224
    :cond_6
    invoke-virtual {v13}, Ljava/nio/channels/ServerSocketChannel;->socket()Ljava/net/ServerSocket;

    .line 225
    .line 226
    .line 227
    move-result-object v9

    .line 228
    invoke-virtual {v9, v6, v12}, Ljava/net/ServerSocket;->bind(Ljava/net/SocketAddress;I)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 229
    .line 230
    .line 231
    :goto_1
    if-ne v11, v2, :cond_7

    .line 232
    .line 233
    goto/16 :goto_e

    .line 234
    .line 235
    :cond_7
    :goto_2
    move-object v6, v11

    .line 236
    check-cast v6, Ljava/io/Closeable;

    .line 237
    .line 238
    iget-object v9, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->$socket:Lkotlinx/coroutines/飘花落叶言子楪哲苏兰世;

    .line 239
    .line 240
    iget-object v10, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->$logger:L飘花落叶言苏楪世子兰哲/飘花落叶言子楪世苏兰哲;

    .line 241
    .line 242
    iget-object v11, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->$serverJob:Lkotlinx/coroutines/飘花落叶言子苏世兰楪哲;

    .line 243
    .line 244
    iget-wide v12, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->$timeout:J

    .line 245
    .line 246
    iget-object v14, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->$handler:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲兰世苏;

    .line 247
    .line 248
    :try_start_5
    move-object v15, v6

    .line 249
    check-cast v15, Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;

    .line 250
    .line 251
    check-cast v9, Lkotlinx/coroutines/飘花落叶言子楪哲兰世苏;

    .line 252
    .line 253
    invoke-virtual {v9, v15}, Lkotlinx/coroutines/飘花落叶言子苏兰楪世哲;->飘花落叶言子苏世楪哲兰(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    invoke-interface {v0}, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;->飘花落叶言子苏兰哲楪世()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 257
    .line 258
    .line 259
    move-result-object v9

    .line 260
    sget-object v3, Lkotlinx/coroutines/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/飘花落叶言子楪兰哲苏世;

    .line 261
    .line 262
    invoke-interface {v9, v3}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->get(Lkotlin/coroutines/飘花落叶言子楪苏世哲兰;)Lkotlin/coroutines/飘花落叶言子楪世兰哲苏;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    check-cast v3, Lkotlinx/coroutines/飘花落叶言子世楪苏哲兰;

    .line 267
    .line 268
    if-nez v3, :cond_8

    .line 269
    .line 270
    new-instance v3, Lio/ktor/server/engine/飘花落叶言子楪苏哲兰世;

    .line 271
    .line 272
    invoke-direct {v3, v10}, Lio/ktor/server/engine/飘花落叶言子楪苏哲兰世;-><init>(L飘花落叶言苏楪世子兰哲/飘花落叶言子楪世苏兰哲;)V

    .line 273
    .line 274
    .line 275
    goto :goto_3

    .line 276
    :catchall_3
    move-exception v0

    .line 277
    move-object v1, v0

    .line 278
    move-object v4, v6

    .line 279
    goto/16 :goto_11

    .line 280
    .line 281
    :cond_8
    :goto_3
    invoke-interface {v0}, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;->飘花落叶言子苏兰哲楪世()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 282
    .line 283
    .line 284
    move-result-object v9

    .line 285
    new-instance v10, Lkotlinx/coroutines/飘花落叶言子哲世楪苏兰;

    .line 286
    .line 287
    invoke-direct {v10, v11}, Lkotlinx/coroutines/飘花落叶言子苏世兰哲楪;-><init>(Lkotlinx/coroutines/飘花落叶言子苏世兰楪哲;)V

    .line 288
    .line 289
    .line 290
    invoke-interface {v9, v10}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->plus(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 291
    .line 292
    .line 293
    move-result-object v9

    .line 294
    invoke-interface {v9, v3}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->plus(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 295
    .line 296
    .line 297
    move-result-object v3

    .line 298
    new-instance v9, Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;

    .line 299
    .line 300
    const-string v10, "request"

    .line 301
    .line 302
    invoke-direct {v9, v10}, Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;-><init>(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    invoke-interface {v3, v9}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->plus(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 306
    .line 307
    .line 308
    move-result-object v3

    .line 309
    invoke-static {v3}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlinx/coroutines/internal/飘花落叶言子楪世哲兰苏;

    .line 310
    .line 311
    .line 312
    move-result-object v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 313
    move-object v9, v14

    .line 314
    move-object v14, v0

    .line 315
    move-object v0, v9

    .line 316
    move-object v11, v3

    .line 317
    move-wide v9, v12

    .line 318
    move-object v12, v15

    .line 319
    move-object v13, v6

    .line 320
    move v6, v7

    .line 321
    :goto_4
    :try_start_6
    iput-object v14, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$0:Ljava/lang/Object;

    .line 322
    .line 323
    iput-object v13, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$1:Ljava/lang/Object;

    .line 324
    .line 325
    iput-object v0, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$2:Ljava/lang/Object;

    .line 326
    .line 327
    iput-object v12, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$3:Ljava/lang/Object;

    .line 328
    .line 329
    iput-object v11, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$4:Ljava/lang/Object;

    .line 330
    .line 331
    iput-wide v9, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->J$0:J

    .line 332
    .line 333
    iput v6, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->I$0:I

    .line 334
    .line 335
    iput v5, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->label:I
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_7
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 336
    .line 337
    :try_start_7
    iget-object v3, v12, Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰世苏:Ljava/nio/channels/ServerSocketChannel;

    .line 338
    .line 339
    invoke-virtual {v3}, Ljava/nio/channels/ServerSocketChannel;->accept()Ljava/nio/channels/SocketChannel;

    .line 340
    .line 341
    .line 342
    move-result-object v3

    .line 343
    if-eqz v3, :cond_9

    .line 344
    .line 345
    invoke-virtual {v12, v3}, Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰(Ljava/nio/channels/SocketChannel;)Lio/ktor/network/sockets/飘花落叶言子楪兰世苏哲;

    .line 346
    .line 347
    .line 348
    move-result-object v3

    .line 349
    goto :goto_5

    .line 350
    :cond_9
    invoke-virtual {v12, v1}, Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v3
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_6
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 354
    :goto_5
    if-ne v3, v2, :cond_3

    .line 355
    .line 356
    goto/16 :goto_e

    .line 357
    .line 358
    :goto_6
    :try_start_8
    check-cast v3, Lio/ktor/network/sockets/飘花落叶言子楪哲兰世苏;
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_5
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 359
    .line 360
    move-object v14, v10

    .line 361
    :try_start_9
    new-instance v10, Lio/ktor/server/cio/backend/飘花落叶言子楪世哲苏兰;

    .line 362
    .line 363
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    new-instance v4, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 367
    .line 368
    invoke-direct {v4, v7}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;-><init>(Z)V

    .line 369
    .line 370
    .line 371
    invoke-interface {v3, v4}, Lio/ktor/network/sockets/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰(Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;)Lio/ktor/utils/io/飘花落叶言子世楪哲兰苏;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 375
    .line 376
    .line 377
    new-instance v5, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 378
    .line 379
    invoke-direct {v5, v7}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;-><init>(Z)V

    .line 380
    .line 381
    .line 382
    invoke-interface {v3, v5}, Lio/ktor/network/sockets/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰(Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;)Lio/ktor/utils/io/飘花落叶言子世楪苏哲兰;

    .line 383
    .line 384
    .line 385
    invoke-interface {v3}, Lio/ktor/network/sockets/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏世兰()Lio/ktor/network/sockets/飘花落叶言子楪哲兰苏世;

    .line 386
    .line 387
    .line 388
    move-result-object v16

    .line 389
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 390
    .line 391
    .line 392
    invoke-virtual/range {v16 .. v16}, Lio/ktor/network/sockets/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰()Ljava/net/SocketAddress;

    .line 393
    .line 394
    .line 395
    move-result-object v7

    .line 396
    instance-of v8, v7, Ljava/net/InetSocketAddress;

    .line 397
    .line 398
    if-eqz v8, :cond_a

    .line 399
    .line 400
    check-cast v7, Ljava/net/InetSocketAddress;
    :try_end_9
    .catch Ljava/nio/channels/ClosedChannelException; {:try_start_9 .. :try_end_9} :catch_2
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 401
    .line 402
    goto :goto_7

    .line 403
    :cond_a
    const/4 v7, 0x0

    .line 404
    :goto_7
    const-string v8, "Expected inet socket address"

    .line 405
    .line 406
    if-eqz v7, :cond_d

    .line 407
    .line 408
    :try_start_a
    invoke-interface {v3}, Lio/ktor/network/sockets/飘花落叶言子楪世苏哲兰;->getLocalAddress()Lio/ktor/network/sockets/飘花落叶言子楪哲兰苏世;

    .line 409
    .line 410
    .line 411
    move-result-object v18

    .line 412
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_a
    .catch Ljava/nio/channels/ClosedChannelException; {:try_start_a .. :try_end_a} :catch_2
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 413
    .line 414
    .line 415
    move-object/from16 p1, v0

    .line 416
    .line 417
    :try_start_b
    invoke-virtual/range {v18 .. v18}, Lio/ktor/network/sockets/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰()Ljava/net/SocketAddress;

    .line 418
    .line 419
    .line 420
    move-result-object v0
    :try_end_b
    .catch Ljava/nio/channels/ClosedChannelException; {:try_start_b .. :try_end_b} :catch_3
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 421
    move-object/from16 v18, v9

    .line 422
    .line 423
    :try_start_c
    instance-of v9, v0, Ljava/net/InetSocketAddress;

    .line 424
    .line 425
    if-eqz v9, :cond_b

    .line 426
    .line 427
    check-cast v0, Ljava/net/InetSocketAddress;

    .line 428
    .line 429
    goto :goto_8

    .line 430
    :cond_b
    const/4 v0, 0x0

    .line 431
    :goto_8
    if-eqz v0, :cond_c

    .line 432
    .line 433
    invoke-direct {v10, v4, v5, v7, v0}, Lio/ktor/server/cio/backend/飘花落叶言子楪世哲苏兰;-><init>(Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;Ljava/net/InetSocketAddress;Ljava/net/InetSocketAddress;)V

    .line 434
    .line 435
    .line 436
    sget-object v0, Lio/ktor/server/cio/backend/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 437
    .line 438
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 442
    .line 443
    .line 444
    sget-object v0, Lio/ktor/server/cio/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;

    .line 445
    .line 446
    new-instance v9, Lio/ktor/server/cio/backend/ServerPipelineKt$startServerConnectionPipeline$1;
    :try_end_c
    .catch Ljava/nio/channels/ClosedChannelException; {:try_start_c .. :try_end_c} :catch_1
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 447
    .line 448
    move-object v4, v14

    .line 449
    const/4 v14, 0x0

    .line 450
    move-object/from16 v5, v18

    .line 451
    .line 452
    :try_start_d
    invoke-direct/range {v9 .. v14}, Lio/ktor/server/cio/backend/ServerPipelineKt$startServerConnectionPipeline$1;-><init>(Lio/ktor/server/cio/backend/飘花落叶言子楪世哲苏兰;JL飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲兰世苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 453
    .line 454
    .line 455
    const/4 v7, 0x2

    .line 456
    const/4 v8, 0x0

    .line 457
    invoke-static {v15, v0, v8, v9, v7}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪兰苏哲(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlinx/coroutines/CoroutineStart;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;I)Lkotlinx/coroutines/飘花落叶言子哲楪兰世苏;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    new-instance v8, Lio/ktor/server/cio/backend/飘花落叶言子楪世苏哲兰;

    .line 462
    .line 463
    const/4 v9, 0x0

    .line 464
    invoke-direct {v8, v3, v9}, Lio/ktor/server/cio/backend/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/Object;I)V

    .line 465
    .line 466
    .line 467
    invoke-virtual {v0, v8}, Lkotlinx/coroutines/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪哲苏世兰(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)Lkotlinx/coroutines/飘花落叶言子世哲兰楪苏;

    .line 468
    .line 469
    .line 470
    move-wide/from16 v19, v11

    .line 471
    .line 472
    move-object v12, v5

    .line 473
    move v5, v7

    .line 474
    move v7, v9

    .line 475
    move-wide/from16 v9, v19

    .line 476
    .line 477
    move-object/from16 v14, p1

    .line 478
    .line 479
    move-object v0, v13

    .line 480
    move-object v11, v15

    .line 481
    const/4 v8, 0x0

    .line 482
    move-object v13, v4

    .line 483
    const/4 v4, 0x3

    .line 484
    goto/16 :goto_4

    .line 485
    .line 486
    :catchall_4
    move-exception v0

    .line 487
    :goto_9
    move-object v12, v5

    .line 488
    goto/16 :goto_d

    .line 489
    .line 490
    :catchall_5
    move-exception v0

    .line 491
    move-object v4, v14

    .line 492
    move-object/from16 v5, v18

    .line 493
    .line 494
    goto :goto_9

    .line 495
    :catch_1
    move-object v4, v14

    .line 496
    move-object/from16 v5, v18

    .line 497
    .line 498
    goto :goto_a

    .line 499
    :cond_c
    move-object v4, v14

    .line 500
    move-object/from16 v5, v18

    .line 501
    .line 502
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 503
    .line 504
    invoke-direct {v0, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 505
    .line 506
    .line 507
    throw v0

    .line 508
    :catchall_6
    move-exception v0

    .line 509
    move-object v5, v9

    .line 510
    move-object v4, v14

    .line 511
    goto :goto_9

    .line 512
    :catch_2
    move-object/from16 p1, v0

    .line 513
    .line 514
    :catch_3
    move-object v5, v9

    .line 515
    move-object v4, v14

    .line 516
    goto :goto_a

    .line 517
    :cond_d
    move-object/from16 p1, v0

    .line 518
    .line 519
    move-object v5, v9

    .line 520
    move-object v4, v14

    .line 521
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 522
    .line 523
    invoke-direct {v0, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 524
    .line 525
    .line 526
    throw v0
    :try_end_d
    .catch Ljava/nio/channels/ClosedChannelException; {:try_start_d .. :try_end_d} :catch_4
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 527
    :catch_4
    :goto_a
    :try_start_e
    invoke-interface/range {p1 .. p1}, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;->飘花落叶言子苏兰哲楪世()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 528
    .line 529
    .line 530
    move-result-object v0

    .line 531
    const/4 v8, 0x0

    .line 532
    invoke-static {v0, v8}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪苏哲兰世(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Ljava/util/concurrent/CancellationException;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .line 533
    .line 534
    .line 535
    :try_start_f
    invoke-virtual {v5}, Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;->close()V

    .line 536
    .line 537
    .line 538
    iput-object v4, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$0:Ljava/lang/Object;

    .line 539
    .line 540
    iput-object v15, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$1:Ljava/lang/Object;

    .line 541
    .line 542
    iput-object v8, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$2:Ljava/lang/Object;

    .line 543
    .line 544
    iput-object v8, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$3:Ljava/lang/Object;

    .line 545
    .line 546
    iput-object v8, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$4:Ljava/lang/Object;

    .line 547
    .line 548
    iput v6, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->I$0:I

    .line 549
    .line 550
    const/4 v3, 0x3

    .line 551
    iput v3, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->label:I

    .line 552
    .line 553
    invoke-static {v5, v1}, Lio/ktor/network/sockets/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 554
    .line 555
    .line 556
    move-result-object v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    .line 557
    if-ne v0, v2, :cond_e

    .line 558
    .line 559
    goto/16 :goto_e

    .line 560
    .line 561
    :cond_e
    move-object v1, v4

    .line 562
    move-object v0, v15

    .line 563
    :goto_b
    :try_start_10
    invoke-interface {v0}, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;->飘花落叶言子苏兰哲楪世()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 564
    .line 565
    .line 566
    move-result-object v0

    .line 567
    const/4 v8, 0x0

    .line 568
    invoke-static {v0, v8}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪苏哲兰世(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Ljava/util/concurrent/CancellationException;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    .line 569
    .line 570
    .line 571
    if-eqz v1, :cond_f

    .line 572
    .line 573
    invoke-interface {v1}, Ljava/io/Closeable;->close()V

    .line 574
    .line 575
    .line 576
    :cond_f
    sget-object v0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 577
    .line 578
    return-object v0

    .line 579
    :catchall_7
    move-exception v0

    .line 580
    goto/16 :goto_0

    .line 581
    .line 582
    :catchall_8
    move-exception v0

    .line 583
    move-object v5, v9

    .line 584
    move-object v4, v10

    .line 585
    goto :goto_9

    .line 586
    :catch_5
    move/from16 p1, v7

    .line 587
    .line 588
    move v7, v5

    .line 589
    move-object v5, v9

    .line 590
    move/from16 v9, p1

    .line 591
    .line 592
    move-object/from16 p1, v0

    .line 593
    .line 594
    move v3, v4

    .line 595
    move-object v4, v10

    .line 596
    move-object/from16 v14, p1

    .line 597
    .line 598
    move/from16 v17, v9

    .line 599
    .line 600
    move-wide v9, v11

    .line 601
    move-object v0, v13

    .line 602
    move-object v11, v15

    .line 603
    move-object v13, v4

    .line 604
    move-object v12, v5

    .line 605
    :goto_c
    const/4 v5, 0x4

    .line 606
    goto :goto_10

    .line 607
    :catch_6
    move v3, v4

    .line 608
    move/from16 v17, v7

    .line 609
    .line 610
    move v7, v5

    .line 611
    const/4 v5, 0x4

    .line 612
    const/4 v8, 0x0

    .line 613
    goto :goto_10

    .line 614
    :catch_7
    move v3, v4

    .line 615
    move/from16 v17, v7

    .line 616
    .line 617
    move v7, v5

    .line 618
    goto :goto_c

    .line 619
    :goto_d
    :try_start_11
    invoke-virtual {v12}, Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;->close()V

    .line 620
    .line 621
    .line 622
    iput-object v4, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$0:Ljava/lang/Object;

    .line 623
    .line 624
    iput-object v15, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$1:Ljava/lang/Object;

    .line 625
    .line 626
    iput-object v0, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$2:Ljava/lang/Object;

    .line 627
    .line 628
    const/4 v8, 0x0

    .line 629
    iput-object v8, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$3:Ljava/lang/Object;

    .line 630
    .line 631
    iput-object v8, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->L$4:Ljava/lang/Object;

    .line 632
    .line 633
    iput v6, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->I$0:I

    .line 634
    .line 635
    const/4 v5, 0x4

    .line 636
    iput v5, v1, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->label:I

    .line 637
    .line 638
    invoke-static {v12, v1}, Lio/ktor/network/sockets/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 639
    .line 640
    .line 641
    move-result-object v1
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    .line 642
    if-ne v1, v2, :cond_10

    .line 643
    .line 644
    :goto_e
    return-object v2

    .line 645
    :cond_10
    move-object v1, v4

    .line 646
    move-object v2, v15

    .line 647
    :goto_f
    :try_start_12
    invoke-interface {v2}, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;->飘花落叶言子苏兰哲楪世()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 648
    .line 649
    .line 650
    move-result-object v2

    .line 651
    const/4 v8, 0x0

    .line 652
    invoke-static {v2, v8}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪苏哲兰世(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Ljava/util/concurrent/CancellationException;)V

    .line 653
    .line 654
    .line 655
    throw v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_0

    .line 656
    :goto_10
    move v4, v3

    .line 657
    move v5, v7

    .line 658
    move/from16 v7, v17

    .line 659
    .line 660
    goto/16 :goto_4

    .line 661
    .line 662
    :goto_11
    if-eqz v4, :cond_11

    .line 663
    .line 664
    :try_start_13
    invoke-interface {v4}, Ljava/io/Closeable;->close()V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_9

    .line 665
    .line 666
    .line 667
    goto :goto_12

    .line 668
    :catchall_9
    move-exception v0

    .line 669
    invoke-static {v1, v0}, Lkotlin/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 670
    .line 671
    .line 672
    :cond_11
    :goto_12
    throw v1

    .line 673
    :goto_13
    invoke-interface {v10}, Ljava/io/Closeable;->close()V

    .line 674
    .line 675
    .line 676
    throw v0
.end method
