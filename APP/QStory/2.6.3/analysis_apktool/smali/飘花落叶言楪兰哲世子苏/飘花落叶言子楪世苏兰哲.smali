.class public final L飘花落叶言楪兰哲世子苏/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final synthetic 飘花落叶言子楪世苏兰哲:J

.field public static final synthetic 飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic current:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-class v0, L飘花落叶言楪兰哲世子苏/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    const-class v1, Ljava/lang/Object;

    .line 4
    .line 5
    const-string v2, "current"

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sput-object v1, L飘花落叶言楪兰哲世子苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

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
    sput-wide v0, L飘花落叶言楪兰哲世子苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:J

    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lkotlin/collections/飘花落叶言子楪兰哲苏世;->飘花落叶言子苏兰楪哲世()Ljava/util/Map;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, L飘花落叶言楪兰哲世子苏/飘花落叶言子楪世苏兰哲;->current:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲(L飘花落叶言楪兰世苏哲子/飘花落叶言子楪世苏哲兰;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言楪兰哲世子苏/飘花落叶言子楪世苏兰哲;->current:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/Map;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(L飘花落叶言楪兰世苏哲子/飘花落叶言子楪世苏哲兰;L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世兰苏哲;)Ljava/lang/Object;
    .locals 8

    .line 1
    :goto_0
    iget-object v0, p0, L飘花落叶言楪兰哲世子苏/飘花落叶言子楪世苏兰哲;->current:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v5, v0

    .line 4
    check-cast v5, Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v5, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    new-instance v6, Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-direct {v6, v5}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2, p1}, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世兰苏哲;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v6, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    sget-object v7, L飘花落叶言楪兰哲世子苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 26
    .line 27
    :goto_1
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    sget-object v1, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 31
    .line 32
    sget-wide v3, L飘花落叶言楪兰哲世子苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:J

    .line 33
    .line 34
    move-object v2, p0

    .line 35
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-eqz p0, :cond_1

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_1
    invoke-virtual {v1, v2, v3, v4}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    if-eq p0, v5, :cond_2

    .line 47
    .line 48
    move-object p0, v2

    .line 49
    goto :goto_0

    .line 50
    :cond_2
    move-object p0, v2

    .line 51
    goto :goto_1
.end method
