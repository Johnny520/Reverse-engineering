.class final Lio/ktor/client/plugins/cache/storage/FileCacheStorage$writeCache$2;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;",
        "",
        "<anonymous>",
        "(Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;)Ljava/lang/Object;"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCache$2"
    f = "FileCacheStorage.kt"
    l = {
        0xca,
        0x67
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $caches:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/ktor/client/plugins/cache/storage/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $urlHex:Ljava/lang/String;

.field I$0:I

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/ktor/client/plugins/cache/storage/飘花落叶言子楪世哲苏兰;


# direct methods
.method public constructor <init>(Lio/ktor/client/plugins/cache/storage/飘花落叶言子楪世哲苏兰;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/ktor/client/plugins/cache/storage/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/ktor/client/plugins/cache/storage/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
            ">;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/client/plugins/cache/storage/FileCacheStorage$writeCache$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p2, p0, Lio/ktor/client/plugins/cache/storage/FileCacheStorage$writeCache$2;->$urlHex:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p3, p0, Lio/ktor/client/plugins/cache/storage/FileCacheStorage$writeCache$2;->$caches:Ljava/util/List;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private static final invokeSuspend$lambda$0()Lkotlinx/coroutines/sync/飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    new-instance v0, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
    .locals 3
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
    new-instance v0, Lio/ktor/client/plugins/cache/storage/FileCacheStorage$writeCache$2;

    .line 2
    .line 3
    iget-object v1, p0, Lio/ktor/client/plugins/cache/storage/FileCacheStorage$writeCache$2;->$urlHex:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, Lio/ktor/client/plugins/cache/storage/FileCacheStorage$writeCache$2;->$caches:Ljava/util/List;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v0, v2, v1, p0, p2}, Lio/ktor/client/plugins/cache/storage/FileCacheStorage$writeCache$2;-><init>(Lio/ktor/client/plugins/cache/storage/飘花落叶言子楪世哲苏兰;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, v0, Lio/ktor/client/plugins/cache/storage/FileCacheStorage$writeCache$2;->L$0:Ljava/lang/Object;

    .line 12
    .line 13
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Lio/ktor/client/plugins/cache/storage/FileCacheStorage$writeCache$2;->invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

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
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/ktor/client/plugins/cache/storage/FileCacheStorage$writeCache$2;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lio/ktor/client/plugins/cache/storage/FileCacheStorage$writeCache$2;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lio/ktor/client/plugins/cache/storage/FileCacheStorage$writeCache$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    const-string v0, "Exception during saving a cache to a file: "

    .line 2
    .line 3
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 4
    .line 5
    iget v1, p0, Lio/ktor/client/plugins/cache/storage/FileCacheStorage$writeCache$2;->label:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_5

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    if-eq v1, v3, :cond_2

    .line 12
    .line 13
    const/4 v3, 0x2

    .line 14
    if-ne v1, v3, :cond_1

    .line 15
    .line 16
    iget-object v1, p0, Lio/ktor/client/plugins/cache/storage/FileCacheStorage$writeCache$2;->L$1:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Ljava/io/Closeable;

    .line 19
    .line 20
    iget-object p0, p0, Lio/ktor/client/plugins/cache/storage/FileCacheStorage$writeCache$2;->L$0:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, Lkotlinx/coroutines/sync/飘花落叶言子楪世苏哲兰;

    .line 23
    .line 24
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    check-cast p1, Ljava/lang/Number;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 30
    .line 31
    .line 32
    move-result-wide v3

    .line 33
    new-instance p1, Ljava/lang/Long;

    .line 34
    .line 35
    invoke-direct {p1, v3, v4}, Ljava/lang/Long;-><init>(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 36
    .line 37
    .line 38
    if-eqz v1, :cond_4

    .line 39
    .line 40
    :try_start_1
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    .line 42
    .line 43
    goto :goto_3

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    goto :goto_4

    .line 46
    :catch_0
    move-exception p1

    .line 47
    goto :goto_2

    .line 48
    :catchall_1
    move-exception p1

    .line 49
    if-eqz v1, :cond_0

    .line 50
    .line 51
    :try_start_2
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catchall_2
    move-exception v1

    .line 56
    :try_start_3
    invoke-static {p1, v1}, Lkotlin/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :catchall_3
    move-exception p1

    .line 61
    goto :goto_1

    .line 62
    :cond_0
    :goto_0
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 63
    :goto_1
    :try_start_4
    throw p1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 64
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 65
    .line 66
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return-object v2

    .line 70
    :cond_2
    iget-object v1, p0, Lio/ktor/client/plugins/cache/storage/FileCacheStorage$writeCache$2;->L$4:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v1, Ljava/util/List;

    .line 73
    .line 74
    iget-object v1, p0, Lio/ktor/client/plugins/cache/storage/FileCacheStorage$writeCache$2;->L$3:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v1, Ljava/lang/String;

    .line 77
    .line 78
    iget-object v1, p0, Lio/ktor/client/plugins/cache/storage/FileCacheStorage$writeCache$2;->L$2:Ljava/lang/Object;

    .line 79
    .line 80
    if-eqz v1, :cond_3

    .line 81
    .line 82
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 83
    .line 84
    .line 85
    return-object v2

    .line 86
    :cond_3
    iget-object v1, p0, Lio/ktor/client/plugins/cache/storage/FileCacheStorage$writeCache$2;->L$1:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v1, Lkotlinx/coroutines/sync/飘花落叶言子楪世苏哲兰;

    .line 89
    .line 90
    iget-object p0, p0, Lio/ktor/client/plugins/cache/storage/FileCacheStorage$writeCache$2;->L$0:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast p0, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    .line 93
    .line 94
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    :try_start_5
    new-instance p0, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 98
    .line 99
    const/4 p1, 0x0

    .line 100
    invoke-direct {p0, p1}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;-><init>(Z)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 101
    .line 102
    .line 103
    :try_start_6
    new-instance p0, Ljava/io/FileOutputStream;

    .line 104
    .line 105
    new-instance p0, Ljava/io/File;

    .line 106
    .line 107
    throw v2
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 108
    :catchall_4
    move-exception p1

    .line 109
    move-object p0, v1

    .line 110
    goto :goto_4

    .line 111
    :catch_1
    move-exception p1

    .line 112
    move-object p0, v1

    .line 113
    :goto_2
    :try_start_7
    sget-object v1, Lio/ktor/client/plugins/cache/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏兰哲;

    .line 114
    .line 115
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-interface {v1, p1}, L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏兰哲;->trace(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 127
    .line 128
    :cond_4
    :goto_3
    check-cast p0, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;

    .line 129
    .line 130
    invoke-virtual {p0, v2}, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    return-object p1

    .line 134
    :goto_4
    check-cast p0, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;

    .line 135
    .line 136
    invoke-virtual {p0, v2}, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    throw p1

    .line 140
    :cond_5
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    iget-object p0, p0, Lio/ktor/client/plugins/cache/storage/FileCacheStorage$writeCache$2;->L$0:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast p0, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    .line 146
    .line 147
    throw v2
.end method
