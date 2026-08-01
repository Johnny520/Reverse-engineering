.class public final Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;
.super Lkotlinx/coroutines/sync/飘花落叶言子楪苏世哲兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lkotlinx/coroutines/sync/飘花落叶言子楪世苏哲兰;


# static fields
.field public static final synthetic 飘花落叶言子世楪苏兰哲:J

.field public static final synthetic 飘花落叶言子世楪苏哲兰:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic owner$volatile:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-class v0, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    const-class v1, Ljava/lang/Object;

    .line 4
    .line 5
    const-string v2, "owner$volatile"

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sput-object v1, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏哲兰:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

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
    sput-wide v0, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲:J

    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lkotlinx/coroutines/sync/飘花落叶言子楪苏世哲兰;-><init>(I)V

    .line 3
    .line 4
    .line 5
    sget-object v0, Lkotlinx/coroutines/sync/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪兰哲世苏;

    .line 6
    .line 7
    iput-object v0, p0, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;->owner$volatile:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Mutex@"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰世哲苏(Ljava/lang/Object;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, "[isLocked="

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世哲兰()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, ",owner="

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    sget-object v1, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏哲兰:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    sget-object v1, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 38
    .line 39
    sget-wide v2, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲:J

    .line 40
    .line 41
    invoke-virtual {v1, p0, v2, v3}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const/16 p0, 0x5d

    .line 49
    .line 50
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)I
    .locals 3

    .line 1
    :cond_0
    invoke-virtual {p0}, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世哲兰()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_1
    sget-object v0, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏哲兰:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sget-object v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 15
    .line 16
    sget-wide v1, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲:J

    .line 17
    .line 18
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sget-object v1, Lkotlinx/coroutines/sync/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪兰哲世苏;

    .line 23
    .line 24
    if-eq v0, v1, :cond_0

    .line 25
    .line 26
    if-ne v0, p1, :cond_2

    .line 27
    .line 28
    const/4 p0, 0x1

    .line 29
    return p0

    .line 30
    :cond_2
    const/4 p0, 0x2

    .line 31
    return p0
.end method

.method public final 飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V
    .locals 9

    .line 1
    :cond_0
    :goto_0
    invoke-virtual {p0}, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世哲兰()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_5

    .line 6
    .line 7
    sget-object v0, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏哲兰:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget-object v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 13
    .line 14
    sget-wide v1, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲:J

    .line 15
    .line 16
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v7

    .line 20
    sget-object v8, Lkotlinx/coroutines/sync/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪兰哲世苏;

    .line 21
    .line 22
    if-eq v7, v8, :cond_0

    .line 23
    .line 24
    if-eq v7, p1, :cond_2

    .line 25
    .line 26
    if-nez p1, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    new-instance p0, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v0, "This mutex is locked by "

    .line 32
    .line 33
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v0, ", but "

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string p1, " is expected"

    .line 48
    .line 49
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw p1

    .line 66
    :cond_2
    :goto_1
    sget-object v3, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 67
    .line 68
    sget-wide v5, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲:J

    .line 69
    .line 70
    move-object v4, p0

    .line 71
    invoke-virtual/range {v3 .. v8}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    if-eqz p0, :cond_3

    .line 76
    .line 77
    invoke-virtual {v4}, Lkotlinx/coroutines/sync/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏()V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_3
    invoke-virtual {v3, v4, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    if-eq p0, v7, :cond_4

    .line 86
    .line 87
    move-object p0, v4

    .line 88
    goto :goto_0

    .line 89
    :cond_4
    move-object p0, v4

    .line 90
    goto :goto_1

    .line 91
    :cond_5
    const-string p0, "This mutex is not locked"

    .line 92
    .line 93
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世兰哲()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget-object v1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_2

    .line 10
    :cond_0
    invoke-static {p1}, Landroidx/window/area/飘花落叶言子楪世兰哲苏;->飘花落叶言子世楪苏哲兰(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰苏哲世(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :try_start_0
    new-instance v0, Lkotlinx/coroutines/sync/飘花落叶言子楪世苏兰哲;

    .line 19
    .line 20
    invoke-direct {v0, p0, p1}, Lkotlinx/coroutines/sync/飘花落叶言子楪世苏兰哲;-><init>(Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    sget-object v2, Lkotlinx/coroutines/sync/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰苏哲世:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 24
    .line 25
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->getAndDecrement(Ljava/lang/Object;)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    iget v3, p0, Lkotlinx/coroutines/sync/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 30
    .line 31
    if-gt v2, v3, :cond_1

    .line 32
    .line 33
    if-lez v2, :cond_2

    .line 34
    .line 35
    sget-object p0, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏哲兰:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 36
    .line 37
    iget-object v2, v0, Lkotlinx/coroutines/sync/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    invoke-virtual {p0, v2, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-object p0, v0, Lkotlinx/coroutines/sync/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;

    .line 44
    .line 45
    new-instance v3, Landroidx/compose/foundation/飘花落叶言子楪哲苏兰世;

    .line 46
    .line 47
    const/16 v4, 0x19

    .line 48
    .line 49
    invoke-direct {v3, v2, v4, v0}, Landroidx/compose/foundation/飘花落叶言子楪哲苏兰世;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget v0, p0, Lkotlinx/coroutines/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪哲兰苏世:I

    .line 53
    .line 54
    new-instance v2, Landroidx/compose/foundation/飘花落叶言子苏楪世哲兰;

    .line 55
    .line 56
    const/4 v4, 0x1

    .line 57
    invoke-direct {v2, v3, v4}, Landroidx/compose/foundation/飘花落叶言子苏楪世哲兰;-><init>(Ljava/lang/Object;I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, v1, v0, v2}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子世苏楪哲兰(Ljava/lang/Object;IL飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲兰世苏;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    invoke-virtual {p0, v0}, Lkotlinx/coroutines/sync/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Lkotlinx/coroutines/飘花落叶言子哲苏世楪兰;)Z

    .line 65
    .line 66
    .line 67
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    if-eqz v2, :cond_1

    .line 69
    .line 70
    :goto_0
    invoke-virtual {p1}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰世苏()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    sget-object p1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 75
    .line 76
    if-ne p0, p1, :cond_3

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    move-object p0, v1

    .line 80
    :goto_1
    if-ne p0, p1, :cond_4

    .line 81
    .line 82
    return-object p0

    .line 83
    :cond_4
    :goto_2
    return-object v1

    .line 84
    :catchall_0
    move-exception p0

    .line 85
    invoke-virtual {p1}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子世楪兰苏哲()V

    .line 86
    .line 87
    .line 88
    throw p0
.end method

.method public final 飘花落叶言子楪苏世兰哲()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, 0x1

    .line 6
    if-eqz p0, :cond_2

    .line 7
    .line 8
    if-eq p0, v0, :cond_1

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    if-eq p0, v0, :cond_0

    .line 12
    .line 13
    const-string p0, "unexpected"

    .line 14
    .line 15
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :goto_0
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_0
    const-string p0, "This mutex is already locked by the specified owner: null"

    .line 21
    .line 22
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 p0, 0x0

    .line 27
    return p0

    .line 28
    :cond_2
    return v0
.end method

.method public final 飘花落叶言子楪苏世哲兰()Z
    .locals 1

    .line 1
    sget-object v0, Lkotlinx/coroutines/sync/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰苏哲世:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-static {p0, v0}, Ljava/lang/Math;->max(II)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    return p0

    .line 16
    :cond_0
    return v0
.end method

.method public final 飘花落叶言子楪苏哲世兰()I
    .locals 4

    .line 1
    :cond_0
    :goto_0
    sget-object v0, Lkotlinx/coroutines/sync/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰苏哲世:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget v2, p0, Lkotlinx/coroutines/sync/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 8
    .line 9
    if-le v1, v2, :cond_2

    .line 10
    .line 11
    :cond_1
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-le v1, v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    if-gtz v1, :cond_3

    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    return p0

    .line 28
    :cond_3
    add-int/lit8 v2, v1, -0x1

    .line 29
    .line 30
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    sget-object v0, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏哲兰:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    sget-object v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 42
    .line 43
    sget-wide v1, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲:J

    .line 44
    .line 45
    const/4 v3, 0x0

    .line 46
    invoke-virtual {v0, p0, v1, v2, v3}, Lsun/misc/Unsafe;->putObjectVolatile(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    return p0
.end method
