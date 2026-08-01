.class public abstract Lio/ktor/client/plugins/cache/飘花落叶言子楪世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# direct methods
.method public static final 飘花落叶言子楪世苏哲兰(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V
    .locals 4

    .line 1
    instance-of v0, p0, Lio/ktor/client/plugins/cache/HttpCacheEntryKt$HttpCacheEntry$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Lio/ktor/client/plugins/cache/HttpCacheEntryKt$HttpCacheEntry$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/client/plugins/cache/HttpCacheEntryKt$HttpCacheEntry$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lio/ktor/client/plugins/cache/HttpCacheEntryKt$HttpCacheEntry$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/client/plugins/cache/HttpCacheEntryKt$HttpCacheEntry$1;

    .line 21
    .line 22
    invoke-direct {v0, p0}, Lio/ktor/client/plugins/cache/HttpCacheEntryKt$HttpCacheEntry$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p0, v0, Lio/ktor/client/plugins/cache/HttpCacheEntryKt$HttpCacheEntry$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v1, v0, Lio/ktor/client/plugins/cache/HttpCacheEntryKt$HttpCacheEntry$1;->label:I

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    const/4 v3, 0x1

    .line 35
    if-ne v1, v3, :cond_2

    .line 36
    .line 37
    iget-object v0, v0, Lio/ktor/client/plugins/cache/HttpCacheEntryKt$HttpCacheEntry$1;->L$0:Ljava/lang/Object;

    .line 38
    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    invoke-static {p0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    check-cast p0, Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 45
    .line 46
    invoke-static {p0}, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏哲世兰(Lkotlinx/io/飘花落叶言子楪苏兰世哲;)[B

    .line 47
    .line 48
    .line 49
    throw v2

    .line 50
    :cond_1
    new-instance p0, Ljava/lang/ClassCastException;

    .line 51
    .line 52
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 53
    .line 54
    .line 55
    throw p0

    .line 56
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p0

    .line 64
    :cond_3
    invoke-static {p0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    throw v2
.end method
