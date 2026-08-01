.class public final Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;
.super Lkotlinx/coroutines/飘花落叶言子苏哲楪世兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final synthetic 飘花落叶言子楪兰哲苏世:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile synthetic _invoked$volatile:I

.field public final 飘花落叶言子楪兰哲世苏:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 2
    .line 3
    const-string v1, "_invoked$volatile"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪兰哲苏世:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lkotlinx/coroutines/internal/飘花落叶言子楪苏哲世兰;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪兰哲世苏:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪哲兰世苏()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final 飘花落叶言子楪哲兰苏世(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    sget-object v2, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪兰哲苏世:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 4
    .line 5
    invoke-virtual {v2, p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪兰哲世苏:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 12
    .line 13
    invoke-interface {p0, p1}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method
