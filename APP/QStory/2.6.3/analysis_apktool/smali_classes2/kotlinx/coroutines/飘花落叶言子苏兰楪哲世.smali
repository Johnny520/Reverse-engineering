.class public final Lkotlinx/coroutines/飘花落叶言子苏兰楪哲世;
.super Lkotlin/coroutines/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;


# static fields
.field public static final 飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/飘花落叶言子苏兰楪哲世;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lkotlinx/coroutines/飘花落叶言子苏兰楪哲世;

    .line 2
    .line 3
    sget-object v1, Lkotlinx/coroutines/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/飘花落叶言子苏世楪哲兰;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lkotlin/coroutines/飘花落叶言子楪世苏哲兰;-><init>(Lkotlin/coroutines/飘花落叶言子楪苏世哲兰;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lkotlinx/coroutines/飘花落叶言子苏兰楪哲世;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/飘花落叶言子苏兰楪哲世;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final isCancelled()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final start()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "NonCancellable"

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子世兰哲苏楪()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final 飘花落叶言子世兰楪哲苏(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Lkotlinx/coroutines/飘花落叶言子世哲苏楪兰;
    .locals 0

    .line 1
    sget-object p0, Lkotlinx/coroutines/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/飘花落叶言子苏兰世楪哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子世楪苏哲兰(Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;)Lkotlinx/coroutines/飘花落叶言子楪哲世兰苏;
    .locals 0

    .line 1
    sget-object p0, Lkotlinx/coroutines/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/飘花落叶言子苏兰世楪哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子世苏楪兰哲(ZZL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Lkotlinx/coroutines/飘花落叶言子世哲苏楪兰;
    .locals 0

    .line 1
    sget-object p0, Lkotlinx/coroutines/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/飘花落叶言子苏兰世楪哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰哲苏()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final 飘花落叶言子楪兰苏哲世()Ljava/util/concurrent/CancellationException;
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v0, "This job is always active"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final 飘花落叶言子楪哲兰苏世(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p1, "This job is always active"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final 飘花落叶言子楪苏世兰哲(Ljava/util/concurrent/CancellationException;)V
    .locals 0

    .line 1
    return-void
.end method
