.class public final Lio/ktor/network/selector/飘花落叶言子楪世兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final synthetic 飘花落叶言子楪世苏兰哲:J

.field public static final synthetic 飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _cur:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-class v0, Lio/ktor/network/selector/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    const-class v1, Ljava/lang/Object;

    .line 4
    .line 5
    const-string v2, "_cur"

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sput-object v1, Lio/ktor/network/selector/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 12
    .line 13
    sget-object v1, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

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
    sput-wide v0, Lio/ktor/network/selector/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:J

    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;

    .line 5
    .line 6
    const/16 v1, 0x8

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lio/ktor/network/selector/飘花落叶言子楪世兰苏哲;->_cur:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲兰苏()Ljava/lang/Object;
    .locals 7

    .line 1
    :goto_0
    iget-object v0, p0, Lio/ktor/network/selector/飘花落叶言子楪世兰苏哲;->_cur:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v5, v0

    .line 4
    check-cast v5, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;

    .line 5
    .line 6
    invoke-virtual {v5}, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏:Lio/ktor/network/selector/飘花落叶言子楪世苏兰哲;

    .line 11
    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    sget-object v0, Lio/ktor/network/selector/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 16
    .line 17
    invoke-virtual {v5}, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲()Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;

    .line 18
    .line 19
    .line 20
    move-result-object v6

    .line 21
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    sget-object v1, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 25
    .line 26
    sget-wide v3, Lio/ktor/network/selector/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:J

    .line 27
    .line 28
    move-object v2, p0

    .line 29
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_1

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_1
    invoke-virtual {v1, v2, v3, v4}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    if-eq p0, v5, :cond_2

    .line 41
    .line 42
    :goto_2
    move-object p0, v2

    .line 43
    goto :goto_0

    .line 44
    :cond_2
    move-object p0, v2

    .line 45
    goto :goto_1
.end method

.method public final 飘花落叶言子楪世哲苏兰()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/network/selector/飘花落叶言子楪世兰苏哲;->_cur:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;

    .line 4
    .line 5
    invoke-virtual {p0}, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final 飘花落叶言子楪世苏兰哲()V
    .locals 7

    .line 1
    :goto_0
    iget-object v0, p0, Lio/ktor/network/selector/飘花落叶言子楪世兰苏哲;->_cur:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v5, v0

    .line 4
    check-cast v5, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;

    .line 5
    .line 6
    invoke-virtual {v5}, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    sget-object v0, Lio/ktor/network/selector/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 14
    .line 15
    invoke-virtual {v5}, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲()Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;

    .line 16
    .line 17
    .line 18
    move-result-object v6

    .line 19
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    sget-object v1, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 23
    .line 24
    sget-wide v3, Lio/ktor/network/selector/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:J

    .line 25
    .line 26
    move-object v2, p0

    .line 27
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_1

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_1
    invoke-virtual {v1, v2, v3, v4}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    if-eq p0, v5, :cond_2

    .line 39
    .line 40
    :goto_2
    move-object p0, v2

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    move-object p0, v2

    .line 43
    goto :goto_1
.end method

.method public final 飘花落叶言子楪世苏哲兰(Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;)Z
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :goto_0
    iget-object v0, p0, Lio/ktor/network/selector/飘花落叶言子楪世兰苏哲;->_cur:Ljava/lang/Object;

    .line 5
    .line 6
    move-object v5, v0

    .line 7
    check-cast v5, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;

    .line 8
    .line 9
    invoke-virtual {v5, p1}, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    if-eqz v0, :cond_4

    .line 15
    .line 16
    if-eq v0, v1, :cond_1

    .line 17
    .line 18
    const/4 v1, 0x2

    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    move-object v2, p0

    .line 22
    goto :goto_2

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0

    .line 25
    :cond_1
    sget-object v0, Lio/ktor/network/selector/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 26
    .line 27
    invoke-virtual {v5}, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲()Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    sget-object v1, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 35
    .line 36
    sget-wide v3, Lio/ktor/network/selector/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:J

    .line 37
    .line 38
    move-object v2, p0

    .line 39
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-eqz p0, :cond_2

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    invoke-virtual {v1, v2, v3, v4}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    if-eq p0, v5, :cond_3

    .line 51
    .line 52
    :goto_2
    move-object p0, v2

    .line 53
    goto :goto_0

    .line 54
    :cond_3
    move-object p0, v2

    .line 55
    goto :goto_1

    .line 56
    :cond_4
    return v1
.end method
