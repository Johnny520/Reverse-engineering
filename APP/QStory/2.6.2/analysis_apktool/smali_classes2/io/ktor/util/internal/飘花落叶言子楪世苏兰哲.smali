.class public Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final synthetic 飘花落叶言子楪兰世哲苏:J

.field public static final synthetic 飘花落叶言子楪兰世苏哲:J

.field public static final synthetic 飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic 飘花落叶言子楪哲兰苏世:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic 飘花落叶言子楪哲苏兰世:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field volatile synthetic _next:Ljava/lang/Object;

.field volatile synthetic _prev:Ljava/lang/Object;

.field private volatile synthetic _removedRef:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const-class v0, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    const-class v1, Ljava/lang/Object;

    .line 4
    .line 5
    const-string v2, "_next"

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    sput-object v3, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 12
    .line 13
    sget-object v3, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v3, v2}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 20
    .line 21
    .line 22
    move-result-wide v4

    .line 23
    sput-wide v4, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:J

    .line 24
    .line 25
    const-string v2, "_prev"

    .line 26
    .line 27
    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    sput-object v4, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v3, v2}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 38
    .line 39
    .line 40
    move-result-wide v2

    .line 41
    sput-wide v2, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:J

    .line 42
    .line 43
    const-string v2, "_removedRef"

    .line 44
    .line 45
    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sput-object v0, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p0, p0, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->_next:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p0, p0, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->_prev:Ljava/lang/Object;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->_removedRef:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世()Z

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    sget-object v2, Lkotlin/jvm/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;

    .line 11
    .line 12
    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)Lkotlin/reflect/飘花落叶言子楪世哲兰苏;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {v1}, Lkotlin/reflect/飘花落叶言子楪世哲兰苏;->getSimpleName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const/16 v1, 0x40

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰哲苏()Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->_next:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {p0}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世兰楪苏哲(Ljava/lang/Object;)Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰苏哲()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->_next:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲兰苏(Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;)V
    .locals 7

    .line 1
    :goto_0
    iget-object v4, p1, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->_prev:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, v4, Lio/ktor/util/internal/飘花落叶言子楪世哲苏兰;

    .line 4
    .line 5
    if-nez v0, :cond_3

    .line 6
    .line 7
    iget-object v0, p0, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->_next:Ljava/lang/Object;

    .line 8
    .line 9
    if-eq v0, p1, :cond_0

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_0
    sget-object v6, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 13
    .line 14
    :goto_1
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    sget-object v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 18
    .line 19
    sget-wide v2, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:J

    .line 20
    .line 21
    move-object v5, p0

    .line 22
    move-object v1, p1

    .line 23
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_1

    .line 28
    .line 29
    iget-object p0, v5, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->_next:Ljava/lang/Object;

    .line 30
    .line 31
    instance-of p0, p0, Lio/ktor/util/internal/飘花落叶言子楪世哲苏兰;

    .line 32
    .line 33
    if-eqz p0, :cond_3

    .line 34
    .line 35
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    check-cast v4, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;

    .line 39
    .line 40
    invoke-virtual {v1, v4}, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    invoke-virtual {v0, v1, v2, v3}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    move-object p1, v1

    .line 49
    if-eq p0, v4, :cond_2

    .line 50
    .line 51
    move-object p0, v5

    .line 52
    goto :goto_0

    .line 53
    :cond_2
    move-object p0, v5

    .line 54
    goto :goto_1

    .line 55
    :cond_3
    :goto_2
    return-void
.end method

.method public final 飘花落叶言子楪世哲苏兰(Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;)V
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    move-object v5, p1

    .line 3
    move-object v2, v0

    .line 4
    :goto_0
    iget-object p1, v5, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->_next:Ljava/lang/Object;

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    goto/16 :goto_4

    .line 9
    .line 10
    :cond_0
    instance-of v1, p1, Lio/ktor/util/internal/飘花落叶言子楪世哲苏兰;

    .line 11
    .line 12
    if-eqz v1, :cond_4

    .line 13
    .line 14
    if-eqz v2, :cond_3

    .line 15
    .line 16
    invoke-virtual {v5}, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲世兰()Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;

    .line 17
    .line 18
    .line 19
    sget-object v7, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 20
    .line 21
    check-cast p1, Lio/ktor/util/internal/飘花落叶言子楪世哲苏兰;

    .line 22
    .line 23
    iget-object v6, p1, Lio/ktor/util/internal/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;

    .line 24
    .line 25
    :goto_1
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    sget-object v1, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 29
    .line 30
    sget-wide v3, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:J

    .line 31
    .line 32
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    move-object v8, v2

    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_1
    invoke-virtual {v1, v8, v3, v4}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    if-eq p1, v5, :cond_2

    .line 45
    .line 46
    :goto_2
    move-object v2, v0

    .line 47
    move-object v5, v8

    .line 48
    goto :goto_0

    .line 49
    :cond_2
    move-object v2, v8

    .line 50
    goto :goto_1

    .line 51
    :cond_3
    move-object v8, v2

    .line 52
    iget-object p1, v5, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->_prev:Ljava/lang/Object;

    .line 53
    .line 54
    invoke-static {p1}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世兰楪苏哲(Ljava/lang/Object;)Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    move-object v5, p1

    .line 59
    goto :goto_0

    .line 60
    :cond_4
    move-object v8, v2

    .line 61
    move-object v6, v5

    .line 62
    iget-object v5, p0, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->_prev:Ljava/lang/Object;

    .line 63
    .line 64
    instance-of v1, v5, Lio/ktor/util/internal/飘花落叶言子楪世哲苏兰;

    .line 65
    .line 66
    if-eqz v1, :cond_5

    .line 67
    .line 68
    goto :goto_4

    .line 69
    :cond_5
    if-eq p1, p0, :cond_6

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-object v5, p1

    .line 75
    check-cast v5, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;

    .line 76
    .line 77
    move-object v2, v6

    .line 78
    goto :goto_0

    .line 79
    :cond_6
    if-ne v5, v6, :cond_7

    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_7
    sget-object p1, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 83
    .line 84
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    sget-object v1, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 88
    .line 89
    sget-wide v3, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:J

    .line 90
    .line 91
    move-object v2, p0

    .line 92
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    move-wide v9, v3

    .line 97
    move-object v3, v1

    .line 98
    move-object v1, v5

    .line 99
    move-object v5, v6

    .line 100
    move-wide v6, v9

    .line 101
    if-eqz p0, :cond_8

    .line 102
    .line 103
    iget-object p0, v5, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->_prev:Ljava/lang/Object;

    .line 104
    .line 105
    instance-of p0, p0, Lio/ktor/util/internal/飘花落叶言子楪世哲苏兰;

    .line 106
    .line 107
    if-nez p0, :cond_9

    .line 108
    .line 109
    :goto_4
    return-void

    .line 110
    :cond_8
    invoke-virtual {v3, v2, v6, v7}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    if-eq p0, v1, :cond_a

    .line 115
    .line 116
    :cond_9
    move-object p0, v2

    .line 117
    move-object v2, v8

    .line 118
    goto :goto_0

    .line 119
    :cond_a
    move-object p0, v2

    .line 120
    move-object v6, v5

    .line 121
    move-object v5, v1

    .line 122
    goto :goto_3
.end method

.method public final 飘花落叶言子楪世苏兰哲(L飘花落叶言楪兰世苏哲子/飘花落叶言子楪世苏兰哲;Lio/ktor/util/internal/飘花落叶言子楪世苏哲兰;)Z
    .locals 7

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 5
    .line 6
    invoke-virtual {v0, p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    sget-object v0, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    :goto_0
    sget-object v1, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 15
    .line 16
    sget-wide v3, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:J

    .line 17
    .line 18
    move-object v2, p0

    .line 19
    move-object v6, p1

    .line 20
    move-object v5, p2

    .line 21
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-eqz p0, :cond_0

    .line 26
    .line 27
    invoke-virtual {v6, v5}, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;)V

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x1

    .line 31
    return p0

    .line 32
    :cond_0
    invoke-virtual {v1, v2, v3, v4}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    if-eq p0, v5, :cond_1

    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    return p0

    .line 40
    :cond_1
    move-object p0, v2

    .line 41
    move-object p2, v5

    .line 42
    move-object p1, v6

    .line 43
    goto :goto_0
.end method

.method public final 飘花落叶言子楪世苏哲兰(L飘花落叶言楪兰世苏哲子/飘花落叶言子楪世苏兰哲;)V
    .locals 3

    .line 1
    :cond_0
    :goto_0
    iget-object v0, p0, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->_prev:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Lio/ktor/util/internal/飘花落叶言子楪世哲苏兰;

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-object v1, v0

    .line 12
    check-cast v1, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;

    .line 13
    .line 14
    iget-object v2, v1, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->_next:Ljava/lang/Object;

    .line 15
    .line 16
    if-ne v2, p0, :cond_2

    .line 17
    .line 18
    :goto_1
    check-cast v0, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;

    .line 19
    .line 20
    move-object v1, p0

    .line 21
    check-cast v1, Lio/ktor/util/internal/飘花落叶言子楪世苏哲兰;

    .line 22
    .line 23
    invoke-virtual {v0, p1, v1}, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(L飘花落叶言楪兰世苏哲子/飘花落叶言子楪世苏兰哲;Lio/ktor/util/internal/飘花落叶言子楪世苏哲兰;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    return-void

    .line 30
    :cond_2
    invoke-virtual {p0, v1}, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0
.end method

.method public final 飘花落叶言子楪苏世哲兰()V
    .locals 12

    .line 1
    invoke-virtual {p0}, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲世兰()Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->_next:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast v1, Lio/ktor/util/internal/飘花落叶言子楪世哲苏兰;

    .line 11
    .line 12
    iget-object v1, v1, Lio/ktor/util/internal/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    move-object v4, v0

    .line 16
    move-object v0, v2

    .line 17
    :goto_0
    iget-object v3, v1, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->_next:Ljava/lang/Object;

    .line 18
    .line 19
    instance-of v5, v3, Lio/ktor/util/internal/飘花落叶言子楪世哲苏兰;

    .line 20
    .line 21
    if-eqz v5, :cond_0

    .line 22
    .line 23
    invoke-virtual {v1}, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲世兰()Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;

    .line 24
    .line 25
    .line 26
    check-cast v3, Lio/ktor/util/internal/飘花落叶言子楪世哲苏兰;

    .line 27
    .line 28
    iget-object v1, v3, Lio/ktor/util/internal/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-object v3, v4, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->_next:Ljava/lang/Object;

    .line 32
    .line 33
    instance-of v5, v3, Lio/ktor/util/internal/飘花落叶言子楪世哲苏兰;

    .line 34
    .line 35
    if-eqz v5, :cond_4

    .line 36
    .line 37
    if-eqz v0, :cond_3

    .line 38
    .line 39
    invoke-virtual {v4}, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲世兰()Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;

    .line 40
    .line 41
    .line 42
    sget-object v9, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 43
    .line 44
    check-cast v3, Lio/ktor/util/internal/飘花落叶言子楪世哲苏兰;

    .line 45
    .line 46
    iget-object v8, v3, Lio/ktor/util/internal/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;

    .line 47
    .line 48
    :goto_1
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    sget-object v3, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 52
    .line 53
    sget-wide v5, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:J

    .line 54
    .line 55
    move-object v7, v4

    .line 56
    move-object v4, v0

    .line 57
    invoke-virtual/range {v3 .. v8}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    move-object v10, v4

    .line 62
    move-object v4, v7

    .line 63
    if-eqz v0, :cond_1

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_1
    invoke-virtual {v3, v10, v5, v6}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    if-eq v0, v4, :cond_2

    .line 71
    .line 72
    :goto_2
    move-object v0, v2

    .line 73
    move-object v4, v10

    .line 74
    goto :goto_0

    .line 75
    :cond_2
    move-object v0, v10

    .line 76
    goto :goto_1

    .line 77
    :cond_3
    move-object v10, v0

    .line 78
    iget-object v0, v4, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->_prev:Ljava/lang/Object;

    .line 79
    .line 80
    invoke-static {v0}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世兰楪苏哲(Ljava/lang/Object;)Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    move-object v4, v0

    .line 85
    goto :goto_5

    .line 86
    :cond_4
    move-object v10, v0

    .line 87
    if-eq v3, p0, :cond_6

    .line 88
    .line 89
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    move-object v0, v3

    .line 93
    check-cast v0, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;

    .line 94
    .line 95
    if-ne v0, v1, :cond_5

    .line 96
    .line 97
    goto :goto_4

    .line 98
    :cond_5
    move-object v11, v4

    .line 99
    move-object v4, v0

    .line 100
    move-object v0, v11

    .line 101
    goto :goto_0

    .line 102
    :cond_6
    sget-object v0, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 103
    .line 104
    :goto_3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    sget-object v3, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 108
    .line 109
    sget-wide v5, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:J

    .line 110
    .line 111
    move-object v7, p0

    .line 112
    move-object v8, v1

    .line 113
    invoke-virtual/range {v3 .. v8}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result p0

    .line 117
    if-eqz p0, :cond_7

    .line 118
    .line 119
    :goto_4
    return-void

    .line 120
    :cond_7
    invoke-virtual {v3, v4, v5, v6}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    if-eq p0, v7, :cond_8

    .line 125
    .line 126
    move-object p0, v7

    .line 127
    move-object v1, v8

    .line 128
    :goto_5
    move-object v0, v10

    .line 129
    goto :goto_0

    .line 130
    :cond_8
    move-object p0, v7

    .line 131
    move-object v1, v8

    .line 132
    goto :goto_3
.end method

.method public final 飘花落叶言子楪苏哲世兰()Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;
    .locals 7

    .line 1
    :goto_0
    iget-object v4, p0, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->_prev:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, v4, Lio/ktor/util/internal/飘花落叶言子楪世哲苏兰;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast v4, Lio/ktor/util/internal/飘花落叶言子楪世哲苏兰;

    .line 8
    .line 9
    iget-object p0, v4, Lio/ktor/util/internal/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    if-ne v4, p0, :cond_3

    .line 13
    .line 14
    move-object v0, p0

    .line 15
    :goto_1
    instance-of v1, v0, Lio/ktor/util/internal/飘花落叶言子楪世苏哲兰;

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_1
    iget-object v0, v0, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->_next:Ljava/lang/Object;

    .line 21
    .line 22
    invoke-static {v0}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世兰楪苏哲(Ljava/lang/Object;)Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eq v0, p0, :cond_2

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_2
    const-string p0, "Cannot loop to this while looking for list head"

    .line 30
    .line 31
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x0

    .line 35
    return-object p0

    .line 36
    :cond_3
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-object v0, v4

    .line 40
    check-cast v0, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;

    .line 41
    .line 42
    :goto_2
    iget-object v1, v0, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->_removedRef:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, Lio/ktor/util/internal/飘花落叶言子楪世哲苏兰;

    .line 45
    .line 46
    if-nez v1, :cond_4

    .line 47
    .line 48
    new-instance v1, Lio/ktor/util/internal/飘花落叶言子楪世哲苏兰;

    .line 49
    .line 50
    invoke-direct {v1, v0}, Lio/ktor/util/internal/飘花落叶言子楪世哲苏兰;-><init>(Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;)V

    .line 51
    .line 52
    .line 53
    sget-object v2, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 54
    .line 55
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :cond_4
    move-object v5, v1

    .line 59
    sget-object v6, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 60
    .line 61
    :goto_3
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    sget-object v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 65
    .line 66
    sget-wide v2, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:J

    .line 67
    .line 68
    move-object v1, p0

    .line 69
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    if-eqz p0, :cond_5

    .line 74
    .line 75
    check-cast v4, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;

    .line 76
    .line 77
    return-object v4

    .line 78
    :cond_5
    invoke-virtual {v0, v1, v2, v3}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    if-eq p0, v4, :cond_6

    .line 83
    .line 84
    move-object p0, v1

    .line 85
    goto :goto_0

    .line 86
    :cond_6
    move-object p0, v1

    .line 87
    goto :goto_3
.end method

.method public final 飘花落叶言子楪苏哲兰世()Z
    .locals 8

    .line 1
    :goto_0
    iget-object v4, p0, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->_next:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, v4, Lio/ktor/util/internal/飘花落叶言子楪世哲苏兰;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    if-ne v4, p0, :cond_1

    .line 9
    .line 10
    :goto_1
    const/4 p0, 0x0

    .line 11
    return p0

    .line 12
    :cond_1
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-object v6, v4

    .line 16
    check-cast v6, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;

    .line 17
    .line 18
    iget-object v0, v6, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->_removedRef:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lio/ktor/util/internal/飘花落叶言子楪世哲苏兰;

    .line 21
    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    new-instance v0, Lio/ktor/util/internal/飘花落叶言子楪世哲苏兰;

    .line 25
    .line 26
    invoke-direct {v0, v6}, Lio/ktor/util/internal/飘花落叶言子楪世哲苏兰;-><init>(Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;)V

    .line 27
    .line 28
    .line 29
    sget-object v1, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 30
    .line 31
    invoke-virtual {v1, v6, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    :cond_2
    move-object v5, v0

    .line 35
    sget-object v7, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 36
    .line 37
    :goto_2
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    sget-object v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 41
    .line 42
    sget-wide v2, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:J

    .line 43
    .line 44
    move-object v1, p0

    .line 45
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    if-eqz p0, :cond_3

    .line 50
    .line 51
    invoke-virtual {v1}, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰()V

    .line 52
    .line 53
    .line 54
    iget-object p0, v1, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->_prev:Ljava/lang/Object;

    .line 55
    .line 56
    invoke-static {p0}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世兰楪苏哲(Ljava/lang/Object;)Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {v6, p0}, Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(Lio/ktor/util/internal/飘花落叶言子楪世苏兰哲;)V

    .line 61
    .line 62
    .line 63
    const/4 p0, 0x1

    .line 64
    return p0

    .line 65
    :cond_3
    invoke-virtual {v0, v1, v2, v3}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    if-eq p0, v4, :cond_4

    .line 70
    .line 71
    move-object p0, v1

    .line 72
    goto :goto_0

    .line 73
    :cond_4
    move-object p0, v1

    .line 74
    goto :goto_2
.end method
