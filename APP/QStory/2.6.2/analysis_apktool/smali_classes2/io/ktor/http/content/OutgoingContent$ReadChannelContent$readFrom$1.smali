.class final Lio/ktor/http/content/OutgoingContent$ReadChannelContent$readFrom$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

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
        "Lio/ktor/utils/io/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u5170\u82cf\u54f2;",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "<anonymous>",
        "(Lio/ktor/utils/io/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u5170\u82cf\u54f2;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "io.ktor.http.content.OutgoingContent$ReadChannelContent$readFrom$1"
    f = "OutgoingContent.kt"
    l = {
        0x5d,
        0x5f
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $range:L飘花落叶言世子兰楪苏哲/飘花落叶言子楪苏世兰哲;

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/ktor/http/content/飘花落叶言子楪苏兰世哲;


# direct methods
.method public constructor <init>(Lio/ktor/http/content/飘花落叶言子楪苏兰世哲;L飘花落叶言世子兰楪苏哲/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/ktor/http/content/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u4e16\u54f2;",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u5170\u696a\u82cf\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/http/content/OutgoingContent$ReadChannelContent$readFrom$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lio/ktor/http/content/OutgoingContent$ReadChannelContent$readFrom$1;->this$0:Lio/ktor/http/content/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    iput-object p2, p0, Lio/ktor/http/content/OutgoingContent$ReadChannelContent$readFrom$1;->$range:L飘花落叶言世子兰楪苏哲/飘花落叶言子楪苏世兰哲;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 7
    .line 8
    .line 9
    return-void
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
    new-instance v0, Lio/ktor/http/content/OutgoingContent$ReadChannelContent$readFrom$1;

    .line 2
    .line 3
    iget-object v1, p0, Lio/ktor/http/content/OutgoingContent$ReadChannelContent$readFrom$1;->this$0:Lio/ktor/http/content/飘花落叶言子楪苏兰世哲;

    .line 4
    .line 5
    iget-object p0, p0, Lio/ktor/http/content/OutgoingContent$ReadChannelContent$readFrom$1;->$range:L飘花落叶言世子兰楪苏哲/飘花落叶言子楪苏世兰哲;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0, p2}, Lio/ktor/http/content/OutgoingContent$ReadChannelContent$readFrom$1;-><init>(Lio/ktor/http/content/飘花落叶言子楪苏兰世哲;L飘花落叶言世子兰楪苏哲/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lio/ktor/http/content/OutgoingContent$ReadChannelContent$readFrom$1;->L$0:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke(Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/ktor/utils/io/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u5170\u82cf\u54f2;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/ktor/http/content/OutgoingContent$ReadChannelContent$readFrom$1;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lio/ktor/http/content/OutgoingContent$ReadChannelContent$readFrom$1;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lio/ktor/http/content/OutgoingContent$ReadChannelContent$readFrom$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    check-cast p1, Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Lio/ktor/http/content/OutgoingContent$ReadChannelContent$readFrom$1;->invoke(Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lio/ktor/http/content/OutgoingContent$ReadChannelContent$readFrom$1;->label:I

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x2

    .line 9
    const/4 v6, 0x1

    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    if-eq v1, v6, :cond_1

    .line 13
    .line 14
    if-ne v1, v5, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-object v4

    .line 26
    :cond_1
    iget-object v1, p0, Lio/ktor/http/content/OutgoingContent$ReadChannelContent$readFrom$1;->L$1:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 29
    .line 30
    iget-object v6, p0, Lio/ktor/http/content/OutgoingContent$ReadChannelContent$readFrom$1;->L$0:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v6, Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;

    .line 33
    .line 34
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lio/ktor/http/content/OutgoingContent$ReadChannelContent$readFrom$1;->L$0:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;

    .line 44
    .line 45
    iget-object v1, p0, Lio/ktor/http/content/OutgoingContent$ReadChannelContent$readFrom$1;->this$0:Lio/ktor/http/content/飘花落叶言子楪苏兰世哲;

    .line 46
    .line 47
    invoke-virtual {v1}, Lio/ktor/http/content/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏世哲兰()Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    iget-object v7, p0, Lio/ktor/http/content/OutgoingContent$ReadChannelContent$readFrom$1;->$range:L飘花落叶言世子兰楪苏哲/飘花落叶言子楪苏世兰哲;

    .line 52
    .line 53
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, Lio/ktor/http/content/OutgoingContent$ReadChannelContent$readFrom$1;->L$0:Ljava/lang/Object;

    .line 57
    .line 58
    iput-object v1, p0, Lio/ktor/http/content/OutgoingContent$ReadChannelContent$readFrom$1;->L$1:Ljava/lang/Object;

    .line 59
    .line 60
    iput v6, p0, Lio/ktor/http/content/OutgoingContent$ReadChannelContent$readFrom$1;->label:I

    .line 61
    .line 62
    invoke-static {v1, v2, v3, p0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏世兰哲(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;JLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    if-ne v6, v0, :cond_3

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    move-object v6, p1

    .line 70
    :goto_0
    iget-object p1, p0, Lio/ktor/http/content/OutgoingContent$ReadChannelContent$readFrom$1;->$range:L飘花落叶言世子兰楪苏哲/飘花落叶言子楪苏世兰哲;

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    sub-long/2addr v2, v2

    .line 76
    const-wide/16 v7, 0x1

    .line 77
    .line 78
    add-long/2addr v2, v7

    .line 79
    iget-object p1, v6, Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪哲苏兰世:Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 80
    .line 81
    iput-object v4, p0, Lio/ktor/http/content/OutgoingContent$ReadChannelContent$readFrom$1;->L$0:Ljava/lang/Object;

    .line 82
    .line 83
    iput-object v4, p0, Lio/ktor/http/content/OutgoingContent$ReadChannelContent$readFrom$1;->L$1:Ljava/lang/Object;

    .line 84
    .line 85
    iput v5, p0, Lio/ktor/http/content/OutgoingContent$ReadChannelContent$readFrom$1;->label:I

    .line 86
    .line 87
    invoke-static {v1, p1, v2, v3, p0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世兰哲苏(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;JLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    if-ne p0, v0, :cond_4

    .line 92
    .line 93
    :goto_1
    return-object v0

    .line 94
    :cond_4
    :goto_2
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 95
    .line 96
    return-object p0
.end method
