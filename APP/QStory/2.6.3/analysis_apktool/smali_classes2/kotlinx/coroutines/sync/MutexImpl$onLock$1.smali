.class final synthetic Lkotlinx/coroutines/sync/MutexImpl$onLock$1;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u5170\u4e16\u82cf;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lkotlinx/coroutines/sync/MutexImpl$onLock$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lkotlinx/coroutines/sync/MutexImpl$onLock$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlinx/coroutines/sync/MutexImpl$onLock$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lkotlinx/coroutines/sync/MutexImpl$onLock$1;->INSTANCE:Lkotlinx/coroutines/sync/MutexImpl$onLock$1;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const-string v4, "onLockRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V"

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    const/4 v1, 0x3

    .line 5
    const-class v2, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;

    .line 6
    .line 7
    const-string v3, "onLockRegFunction"

    .line 8
    .line 9
    move-object v0, p0

    .line 10
    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 55
    check-cast p1, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;

    check-cast p2, Lkotlinx/coroutines/selects/飘花落叶言子楪世兰哲苏;

    invoke-virtual {p0, p1, p2, p3}, Lkotlinx/coroutines/sync/MutexImpl$onLock$1;->invoke(Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;Lkotlinx/coroutines/selects/飘花落叶言子楪世兰哲苏;Ljava/lang/Object;)V

    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    return-object p0
.end method

.method public final invoke(Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;Lkotlinx/coroutines/selects/飘花落叶言子楪世兰哲苏;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/sync/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;",
            "Lkotlinx/coroutines/selects/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u54f2\u82cf;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 1
    const/4 p0, 0x1

    .line 2
    if-eqz p3, :cond_0

    .line 3
    .line 4
    invoke-virtual {p1, p3}, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏(Ljava/lang/Object;)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-ne v0, p0, :cond_1

    .line 9
    .line 10
    sget-object p0, Lkotlinx/coroutines/sync/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪兰哲世苏;

    .line 11
    .line 12
    invoke-interface {p2, p0}, Lkotlinx/coroutines/selects/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    :cond_1
    new-instance v0, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲苏兰;

    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    check-cast p2, Lkotlinx/coroutines/selects/飘花落叶言子楪苏世哲兰;

    .line 25
    .line 26
    invoke-direct {v0, p1, p2, p3}, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲苏兰;-><init>(Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;Lkotlinx/coroutines/selects/飘花落叶言子楪苏世哲兰;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    :cond_3
    sget-object p2, Lkotlinx/coroutines/sync/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 33
    .line 34
    invoke-virtual {p2, p1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->getAndDecrement(Ljava/lang/Object;)I

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    if-gt p2, p0, :cond_3

    .line 39
    .line 40
    if-lez p2, :cond_4

    .line 41
    .line 42
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 43
    .line 44
    invoke-virtual {v0, p0}, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_4
    invoke-virtual {p1, v0}, Lkotlinx/coroutines/sync/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Lkotlinx/coroutines/飘花落叶言子哲世兰苏楪;)Z

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    if-eqz p2, :cond_2

    .line 53
    .line 54
    return-void
.end method
