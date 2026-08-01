.class final Lio/ktor/http/content/WriterContent$writeTo$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "<anonymous>",
        "()V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "io.ktor.http.content.WriterContent$writeTo$2"
    f = "WriterContent.kt"
    l = {
        0x1a
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $channel:Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

.field final synthetic $charset:Ljava/nio/charset/Charset;

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/ktor/http/content/飘花落叶言子楪兰苏哲世;


# direct methods
.method public constructor <init>(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Ljava/nio/charset/Charset;Lio/ktor/http/content/飘花落叶言子楪兰苏哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/ktor/utils/io/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u4e16\u5170;",
            "Ljava/nio/charset/Charset;",
            "Lio/ktor/http/content/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/http/content/WriterContent$writeTo$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lio/ktor/http/content/WriterContent$writeTo$2;->$channel:Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 2
    .line 3
    iput-object p2, p0, Lio/ktor/http/content/WriterContent$writeTo$2;->$charset:Ljava/nio/charset/Charset;

    .line 4
    .line 5
    iput-object p3, p0, Lio/ktor/http/content/WriterContent$writeTo$2;->this$0:Lio/ktor/http/content/飘花落叶言子楪兰苏哲世;

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
    new-instance v0, Lio/ktor/http/content/WriterContent$writeTo$2;

    .line 2
    .line 3
    iget-object v1, p0, Lio/ktor/http/content/WriterContent$writeTo$2;->$channel:Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 4
    .line 5
    iget-object v2, p0, Lio/ktor/http/content/WriterContent$writeTo$2;->$charset:Ljava/nio/charset/Charset;

    .line 6
    .line 7
    iget-object p0, p0, Lio/ktor/http/content/WriterContent$writeTo$2;->this$0:Lio/ktor/http/content/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, p0, p1}, Lio/ktor/http/content/WriterContent$writeTo$2;-><init>(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Ljava/nio/charset/Charset;Lio/ktor/http/content/飘花落叶言子楪兰苏哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1}, Lio/ktor/http/content/WriterContent$writeTo$2;->invoke(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invoke(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lio/ktor/http/content/WriterContent$writeTo$2;->create(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lio/ktor/http/content/WriterContent$writeTo$2;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lio/ktor/http/content/WriterContent$writeTo$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lio/ktor/http/content/WriterContent$writeTo$2;->label:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    if-ne v1, v2, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Lio/ktor/http/content/WriterContent$writeTo$2;->L$0:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Ljava/io/Closeable;

    .line 14
    .line 15
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object v3

    .line 27
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lio/ktor/http/content/WriterContent$writeTo$2;->$channel:Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 31
    .line 32
    iget-object v1, p0, Lio/ktor/http/content/WriterContent$writeTo$2;->$charset:Ljava/nio/charset/Charset;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    new-instance v4, Ljava/io/OutputStreamWriter;

    .line 41
    .line 42
    new-instance v5, Lio/ktor/utils/io/jvm/javaio/飘花落叶言子楪世苏兰哲;

    .line 43
    .line 44
    invoke-direct {v5, p1}, Lio/ktor/utils/io/jvm/javaio/飘花落叶言子楪世苏兰哲;-><init>(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;)V

    .line 45
    .line 46
    .line 47
    invoke-direct {v4, v5, v1}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Lio/ktor/http/content/WriterContent$writeTo$2;->this$0:Lio/ktor/http/content/飘花落叶言子楪兰苏哲世;

    .line 51
    .line 52
    :try_start_1
    iget-object p1, p1, Lio/ktor/http/content/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 53
    .line 54
    iput-object v4, p0, Lio/ktor/http/content/WriterContent$writeTo$2;->L$0:Ljava/lang/Object;

    .line 55
    .line 56
    iput v2, p0, Lio/ktor/http/content/WriterContent$writeTo$2;->label:I

    .line 57
    .line 58
    invoke-interface {p1, v4, p0}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 62
    if-ne p0, v0, :cond_2

    .line 63
    .line 64
    return-object v0

    .line 65
    :cond_2
    move-object p0, v4

    .line 66
    :goto_0
    invoke-static {p0, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世兰苏哲(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 70
    .line 71
    return-object p0

    .line 72
    :catchall_1
    move-exception p1

    .line 73
    move-object p0, v4

    .line 74
    :goto_1
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 75
    :catchall_2
    move-exception v0

    .line 76
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世兰苏哲(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 77
    .line 78
    .line 79
    throw v0
.end method
