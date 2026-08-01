.class public final Lkotlinx/coroutines/飘花落叶言子楪世哲苏兰;
.super Lkotlinx/coroutines/飘花落叶言子苏世哲兰楪;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final synthetic 飘花落叶言子世楪哲苏兰:J

.field public static final synthetic 飘花落叶言子世楪苏兰哲:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _disposer$volatile:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子世楪苏哲兰:Lkotlinx/coroutines/飘花落叶言子楪世兰苏哲;

.field public final 飘花落叶言子楪兰哲世苏:Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;

.field public 飘花落叶言子楪兰哲苏世:Lkotlinx/coroutines/飘花落叶言子世哲苏楪兰;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-class v0, Lkotlinx/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    const-class v1, Ljava/lang/Object;

    .line 4
    .line 5
    const-string v2, "_disposer$volatile"

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sput-object v1, Lkotlinx/coroutines/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪苏兰哲:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 12
    .line 13
    sget-object v1, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v1, v0}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    sput-wide v0, Lkotlinx/coroutines/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪哲苏兰:J

    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>(Lkotlinx/coroutines/飘花落叶言子楪世兰苏哲;Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lkotlinx/coroutines/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪苏哲兰:Lkotlinx/coroutines/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    invoke-direct {p0}, Lkotlinx/coroutines/internal/飘花落叶言子楪苏世兰哲;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lkotlinx/coroutines/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲世苏:Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪兰世哲苏()Lkotlinx/coroutines/飘花落叶言子楪世哲兰苏;
    .locals 3

    .line 1
    sget-object v0, Lkotlinx/coroutines/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪苏兰哲:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 7
    .line 8
    sget-wide v1, Lkotlinx/coroutines/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪哲苏兰:J

    .line 9
    .line 10
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Lkotlinx/coroutines/飘花落叶言子楪世哲兰苏;

    .line 15
    .line 16
    return-object p0
.end method

.method public final 飘花落叶言子楪兰世苏哲(Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lkotlinx/coroutines/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲世苏:Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    new-instance v2, Lkotlinx/coroutines/飘花落叶言子楪兰世哲苏;

    .line 7
    .line 8
    invoke-direct {v2, p1, v0}, Lkotlinx/coroutines/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/Throwable;Z)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-virtual {v1, v2, p1}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子世苏哲兰楪(Ljava/lang/Object;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;)Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪兰哲世苏;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_2

    .line 17
    .line 18
    invoke-virtual {v1, p1}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子世楪兰苏哲(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lkotlinx/coroutines/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏()Lkotlinx/coroutines/飘花落叶言子楪世哲兰苏;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    if-eqz p0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p0}, Lkotlinx/coroutines/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    sget-object p1, Lkotlinx/coroutines/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 32
    .line 33
    iget-object p0, p0, Lkotlinx/coroutines/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪苏哲兰:Lkotlinx/coroutines/飘花落叶言子楪世兰苏哲;

    .line 34
    .line 35
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-nez p1, :cond_2

    .line 40
    .line 41
    iget-object p0, p0, Lkotlinx/coroutines/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:[Lkotlinx/coroutines/飘花落叶言子世苏哲楪兰;

    .line 42
    .line 43
    new-instance p1, Ljava/util/ArrayList;

    .line 44
    .line 45
    array-length v2, p0

    .line 46
    invoke-direct {p1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 47
    .line 48
    .line 49
    array-length v2, p0

    .line 50
    :goto_0
    if-ge v0, v2, :cond_1

    .line 51
    .line 52
    aget-object v3, p0, v0

    .line 53
    .line 54
    invoke-interface {v3}, Lkotlinx/coroutines/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪哲世苏兰()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    add-int/lit8 v0, v0, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {v1, p0}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->resumeWith(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    :cond_2
    return-void
.end method

.method public final 飘花落叶言子楪兰苏世哲(Lkotlinx/coroutines/飘花落叶言子楪世哲兰苏;)V
    .locals 3

    .line 1
    sget-object v0, Lkotlinx/coroutines/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪苏兰哲:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 7
    .line 8
    sget-wide v1, Lkotlinx/coroutines/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪哲苏兰:J

    .line 9
    .line 10
    invoke-virtual {v0, p0, v1, v2, p1}, Lsun/misc/Unsafe;->putObjectVolatile(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final 飘花落叶言子楪哲兰苏世()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method
