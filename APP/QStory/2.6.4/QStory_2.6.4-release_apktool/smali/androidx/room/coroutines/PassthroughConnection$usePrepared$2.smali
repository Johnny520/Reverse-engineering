.class final Landroidx/room/coroutines/PassthroughConnection$usePrepared$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        ""
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime L飘花落叶言世子苏兰哲楪/飘花落叶言子楪世哲苏兰;
    c = "androidx.room.coroutines.PassthroughConnection$usePrepared$2"
    f = "PassthroughConnectionPool.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $block:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;"
        }
    .end annotation
.end field

.field final synthetic $sql:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Landroidx/room/coroutines/飘花落叶言子楪苏兰哲世;


# direct methods
.method public constructor <init>(Landroidx/room/coroutines/飘花落叶言子楪苏兰哲世;Ljava/lang/String;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/room/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;",
            "Ljava/lang/String;",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Landroidx/room/coroutines/PassthroughConnection$usePrepared$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/room/coroutines/PassthroughConnection$usePrepared$2;->this$0:Landroidx/room/coroutines/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/room/coroutines/PassthroughConnection$usePrepared$2;->$sql:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/room/coroutines/PassthroughConnection$usePrepared$2;->$block:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "*>;)",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/room/coroutines/PassthroughConnection$usePrepared$2;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/room/coroutines/PassthroughConnection$usePrepared$2;->this$0:Landroidx/room/coroutines/飘花落叶言子楪苏兰哲世;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/room/coroutines/PassthroughConnection$usePrepared$2;->$sql:Ljava/lang/String;

    .line 6
    .line 7
    iget-object p0, p0, Landroidx/room/coroutines/PassthroughConnection$usePrepared$2;->$block:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, p0, p1}, Landroidx/room/coroutines/PassthroughConnection$usePrepared$2;-><init>(Landroidx/room/coroutines/飘花落叶言子楪苏兰哲世;Ljava/lang/String;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1}, Landroidx/room/coroutines/PassthroughConnection$usePrepared$2;->invoke(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invoke(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Landroidx/room/coroutines/PassthroughConnection$usePrepared$2;->create(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroidx/room/coroutines/PassthroughConnection$usePrepared$2;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroidx/room/coroutines/PassthroughConnection$usePrepared$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v0, p0, Landroidx/room/coroutines/PassthroughConnection$usePrepared$2;->label:I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Landroidx/room/coroutines/PassthroughConnection$usePrepared$2;->this$0:Landroidx/room/coroutines/飘花落叶言子楪苏兰哲世;

    .line 12
    .line 13
    iget-object p1, p1, Landroidx/room/coroutines/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世苏哲兰;

    .line 14
    .line 15
    iget-object v0, p0, Landroidx/room/coroutines/PassthroughConnection$usePrepared$2;->$sql:Ljava/lang/String;

    .line 16
    .line 17
    invoke-interface {p1, v0}, L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子哲苏世楪兰(Ljava/lang/String;)L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世哲苏兰;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object p0, p0, Landroidx/room/coroutines/PassthroughConnection$usePrepared$2;->$block:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 22
    .line 23
    :try_start_0
    invoke-interface {p0, p1}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    invoke-static {p1, v1}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    return-object p0

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 33
    :catchall_1
    move-exception v0

    .line 34
    invoke-static {p1, p0}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    throw v0

    .line 38
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-object v1
.end method
