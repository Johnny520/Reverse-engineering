.class final Lio/ktor/client/plugins/cache/storage/HttpCacheStorageKt$store$3;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


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
    c = "io.ktor.client.plugins.cache.storage.HttpCacheStorageKt"
    f = "HttpCacheStorage.kt"
    l = {
        0x77,
        0x83
    }
    m = "store"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field Z$0:Z

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
            "Lio/ktor/client/plugins/cache/storage/HttpCacheStorageKt$store$3;",
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
    .locals 3

    .line 1
    iput-object p1, p0, Lio/ktor/client/plugins/cache/storage/HttpCacheStorageKt$store$3;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lio/ktor/client/plugins/cache/storage/HttpCacheStorageKt$store$3;->label:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lio/ktor/client/plugins/cache/storage/HttpCacheStorageKt$store$3;->label:I

    .line 9
    .line 10
    and-int v1, p1, v0

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    sub-int/2addr p1, v0

    .line 15
    iput p1, p0, Lio/ktor/client/plugins/cache/storage/HttpCacheStorageKt$store$3;->label:I

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p1, Lio/ktor/client/plugins/cache/storage/HttpCacheStorageKt$store$3;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Lio/ktor/client/plugins/cache/storage/HttpCacheStorageKt$store$3;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 21
    .line 22
    .line 23
    move-object p0, p1

    .line 24
    :goto_0
    iget-object p1, p0, Lio/ktor/client/plugins/cache/storage/HttpCacheStorageKt$store$3;->result:Ljava/lang/Object;

    .line 25
    .line 26
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 27
    .line 28
    iget v0, p0, Lio/ktor/client/plugins/cache/storage/HttpCacheStorageKt$store$3;->label:I

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    if-eqz v0, :cond_5

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    if-eq v0, v2, :cond_2

    .line 35
    .line 36
    const/4 v2, 0x2

    .line 37
    if-ne v0, v2, :cond_1

    .line 38
    .line 39
    iget-object p0, p0, Lio/ktor/client/plugins/cache/storage/HttpCacheStorageKt$store$3;->L$0:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, Lio/ktor/client/plugins/cache/storage/飘花落叶言子楪世苏哲兰;

    .line 42
    .line 43
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v1

    .line 53
    :cond_2
    iget-object v0, p0, Lio/ktor/client/plugins/cache/storage/HttpCacheStorageKt$store$3;->L$3:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世哲苏楪兰;

    .line 56
    .line 57
    iget-object v0, p0, Lio/ktor/client/plugins/cache/storage/HttpCacheStorageKt$store$3;->L$2:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, Ljava/util/Map;

    .line 60
    .line 61
    iget-object v0, p0, Lio/ktor/client/plugins/cache/storage/HttpCacheStorageKt$store$3;->L$1:Ljava/lang/Object;

    .line 62
    .line 63
    if-nez v0, :cond_4

    .line 64
    .line 65
    iget-object p0, p0, Lio/ktor/client/plugins/cache/storage/HttpCacheStorageKt$store$3;->L$0:Ljava/lang/Object;

    .line 66
    .line 67
    if-eqz p0, :cond_3

    .line 68
    .line 69
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 70
    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_3
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    check-cast p1, Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    const/4 p0, -0x1

    .line 82
    invoke-static {p1, p0}, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏兰世哲(Lkotlinx/io/飘花落叶言子楪苏兰世哲;I)[B

    .line 83
    .line 84
    .line 85
    throw v1

    .line 86
    :cond_4
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 87
    .line 88
    .line 89
    return-object v1

    .line 90
    :cond_5
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    throw v1
.end method
