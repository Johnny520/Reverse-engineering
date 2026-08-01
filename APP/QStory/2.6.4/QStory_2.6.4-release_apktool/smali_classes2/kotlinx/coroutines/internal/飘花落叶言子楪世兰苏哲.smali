.class public abstract Lkotlinx/coroutines/internal/飘花落叶言子楪世兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, L飘花落叶言世苏哲兰子楪/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    invoke-direct {v0}, L飘花落叶言世苏哲兰子楪/飘花落叶言子楪世苏兰哲;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    new-array v1, v1, [Lkotlinx/coroutines/飘花落叶言子世楪苏哲兰;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    aput-object v0, v1, v2

    .line 11
    .line 12
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    new-instance v1, Lkotlin/collections/飘花落叶言子楪哲苏兰世;

    .line 24
    .line 25
    const/4 v2, 0x3

    .line 26
    invoke-direct {v1, v0, v2}, Lkotlin/collections/飘花落叶言子楪哲苏兰世;-><init>(Ljava/lang/Object;I)V

    .line 27
    .line 28
    .line 29
    new-instance v0, Lkotlin/sequences/飘花落叶言子楪世苏哲兰;

    .line 30
    .line 31
    invoke-direct {v0, v1}, Lkotlin/sequences/飘花落叶言子楪世苏哲兰;-><init>(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, Lkotlin/sequences/飘花落叶言子楪哲世苏兰;->飘花落叶言子世兰苏哲楪(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, Lkotlinx/coroutines/internal/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 39
    .line 40
    return-void

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    new-instance v1, Ljava/util/ServiceConfigurationError;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-direct {v1, v2, v0}, Ljava/util/ServiceConfigurationError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    throw v1
.end method
