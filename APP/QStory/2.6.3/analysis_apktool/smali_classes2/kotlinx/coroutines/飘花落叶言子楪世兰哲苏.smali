.class public final Lkotlinx/coroutines/飘花落叶言子楪世兰哲苏;
.super Lkotlinx/coroutines/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪兰苏世哲:Ljava/lang/Thread;

.field public final 飘花落叶言子楪兰苏哲世:Lkotlinx/coroutines/飘花落叶言子世哲兰苏楪;


# direct methods
.method public constructor <init>(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Ljava/lang/Thread;Lkotlinx/coroutines/飘花落叶言子世哲兰苏楪;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, v0, v0}, Lkotlinx/coroutines/飘花落叶言子楪世苏哲兰;-><init>(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;ZZ)V

    .line 3
    .line 4
    .line 5
    iput-object p2, p0, Lkotlinx/coroutines/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰苏世哲:Ljava/lang/Thread;

    .line 6
    .line 7
    iput-object p3, p0, Lkotlinx/coroutines/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰苏哲世:Lkotlinx/coroutines/飘花落叶言子世哲兰苏楪;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子世楪兰哲苏(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p0, p0, Lkotlinx/coroutines/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰苏世哲:Ljava/lang/Thread;

    .line 6
    .line 7
    invoke-static {p1, p0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    invoke-static {p0}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method
