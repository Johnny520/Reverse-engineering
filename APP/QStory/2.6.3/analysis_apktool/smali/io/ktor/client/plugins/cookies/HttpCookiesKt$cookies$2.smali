.class final Lio/ktor/client/plugins/cookies/HttpCookiesKt$cookies$2;
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
    c = "io.ktor.client.plugins.cookies.HttpCookiesKt"
    f = "HttpCookies.kt"
    l = {
        0x8e
    }
    m = "cookies"
.end annotation


# instance fields
.field label:I

.field synthetic result:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/client/plugins/cookies/HttpCookiesKt$cookies$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iput-object p1, p0, Lio/ktor/client/plugins/cookies/HttpCookiesKt$cookies$2;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lio/ktor/client/plugins/cookies/HttpCookiesKt$cookies$2;->label:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lio/ktor/client/plugins/cookies/HttpCookiesKt$cookies$2;->label:I

    .line 9
    .line 10
    sget v1, Lio/ktor/client/plugins/cookies/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 11
    .line 12
    and-int v1, p1, v0

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    sub-int/2addr p1, v0

    .line 17
    iput p1, p0, Lio/ktor/client/plugins/cookies/HttpCookiesKt$cookies$2;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Lio/ktor/client/plugins/cookies/HttpCookiesKt$cookies$2;

    .line 21
    .line 22
    invoke-direct {p1, p0}, Lio/ktor/client/plugins/cookies/HttpCookiesKt$cookies$2;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    move-object p0, p1

    .line 26
    :goto_0
    iget-object p1, p0, Lio/ktor/client/plugins/cookies/HttpCookiesKt$cookies$2;->result:Ljava/lang/Object;

    .line 27
    .line 28
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 29
    .line 30
    iget p0, p0, Lio/ktor/client/plugins/cookies/HttpCookiesKt$cookies$2;->label:I

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    if-eqz p0, :cond_3

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    if-ne p0, v1, :cond_2

    .line 37
    .line 38
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    check-cast p1, Ljava/util/List;

    .line 42
    .line 43
    if-nez p1, :cond_1

    .line 44
    .line 45
    sget-object p0, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_1
    return-object p1

    .line 49
    :cond_2
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_3
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    sget p0, Lio/ktor/client/plugins/cookies/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 59
    .line 60
    sget p0, Lio/ktor/client/plugins/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:I

    .line 61
    .line 62
    throw v0
.end method
