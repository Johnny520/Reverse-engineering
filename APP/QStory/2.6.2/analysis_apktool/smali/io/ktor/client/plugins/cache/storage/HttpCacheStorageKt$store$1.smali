.class final Lio/ktor/client/plugins/cache/storage/HttpCacheStorageKt$store$1;
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
        0x3b
    }
    m = "store"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

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
            "Lio/ktor/client/plugins/cache/storage/HttpCacheStorageKt$store$1;",
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
    iput-object p1, p0, Lio/ktor/client/plugins/cache/storage/HttpCacheStorageKt$store$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lio/ktor/client/plugins/cache/storage/HttpCacheStorageKt$store$1;->label:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lio/ktor/client/plugins/cache/storage/HttpCacheStorageKt$store$1;->label:I

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
    iput p1, p0, Lio/ktor/client/plugins/cache/storage/HttpCacheStorageKt$store$1;->label:I

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p1, Lio/ktor/client/plugins/cache/storage/HttpCacheStorageKt$store$1;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Lio/ktor/client/plugins/cache/storage/HttpCacheStorageKt$store$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 21
    .line 22
    .line 23
    move-object p0, p1

    .line 24
    :goto_0
    iget-object p1, p0, Lio/ktor/client/plugins/cache/storage/HttpCacheStorageKt$store$1;->result:Ljava/lang/Object;

    .line 25
    .line 26
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 27
    .line 28
    iget v0, p0, Lio/ktor/client/plugins/cache/storage/HttpCacheStorageKt$store$1;->label:I

    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    if-ne v0, v1, :cond_2

    .line 34
    .line 35
    iget-object v0, p0, Lio/ktor/client/plugins/cache/storage/HttpCacheStorageKt$store$1;->L$1:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世哲苏楪兰;

    .line 38
    .line 39
    iget-object p0, p0, Lio/ktor/client/plugins/cache/storage/HttpCacheStorageKt$store$1;->L$0:Ljava/lang/Object;

    .line 40
    .line 41
    if-nez p0, :cond_1

    .line 42
    .line 43
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    new-instance p0, Ljava/lang/ClassCastException;

    .line 50
    .line 51
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 52
    .line 53
    .line 54
    throw p0

    .line 55
    :cond_1
    new-instance p0, Ljava/lang/ClassCastException;

    .line 56
    .line 57
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 58
    .line 59
    .line 60
    throw p0

    .line 61
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 64
    .line 65
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p0

    .line 69
    :cond_3
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    const/4 p1, 0x0

    .line 73
    iput-object p1, p0, Lio/ktor/client/plugins/cache/storage/HttpCacheStorageKt$store$1;->L$0:Ljava/lang/Object;

    .line 74
    .line 75
    iput-object p1, p0, Lio/ktor/client/plugins/cache/storage/HttpCacheStorageKt$store$1;->L$1:Ljava/lang/Object;

    .line 76
    .line 77
    iput v1, p0, Lio/ktor/client/plugins/cache/storage/HttpCacheStorageKt$store$1;->label:I

    .line 78
    .line 79
    invoke-static {p0}, Lio/ktor/client/plugins/cache/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    .line 80
    .line 81
    .line 82
    throw p1
.end method
