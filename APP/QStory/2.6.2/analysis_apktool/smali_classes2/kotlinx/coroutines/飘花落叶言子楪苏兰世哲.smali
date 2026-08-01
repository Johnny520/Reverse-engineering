.class public Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;
.super Lkotlinx/coroutines/飘花落叶言子世哲楪苏兰;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lkotlinx/coroutines/飘花落叶言子楪苏哲兰世;
.implements L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世苏兰哲;
.implements Lkotlinx/coroutines/飘花落叶言子哲世兰苏楪;


# static fields
.field public static final synthetic 飘花落叶言子世楪苏哲兰:J

.field public static final synthetic 飘花落叶言子楪兰哲世苏:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic 飘花落叶言子楪兰哲苏世:J

.field public static final synthetic 飘花落叶言子楪兰苏世哲:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

.field public static final synthetic 飘花落叶言子楪兰苏哲世:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _decisionAndIndex$volatile:I

.field private volatile synthetic _parentHandle$volatile:Ljava/lang/Object;

.field private volatile synthetic _state$volatile:Ljava/lang/Object;

.field public final 飘花落叶言子楪兰世哲苏:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

.field public final 飘花落叶言子楪兰世苏哲:Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const-string v0, "_decisionAndIndex$volatile"

    .line 2
    .line 3
    const-class v1, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;

    .line 4
    .line 5
    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰苏世哲:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 10
    .line 11
    const-class v0, Ljava/lang/Object;

    .line 12
    .line 13
    const-string v2, "_state$volatile"

    .line 14
    .line 15
    invoke-static {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    sput-object v3, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰苏哲世:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 20
    .line 21
    sget-object v3, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v3, v2}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 28
    .line 29
    .line 30
    move-result-wide v4

    .line 31
    sput-wide v4, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子世楪苏哲兰:J

    .line 32
    .line 33
    const-string v2, "_parentHandle$volatile"

    .line 34
    .line 35
    invoke-static {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲世苏:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v3, v0}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 46
    .line 47
    .line 48
    move-result-wide v0

    .line 49
    sput-wide v0, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲苏世:J

    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lkotlinx/coroutines/飘花落叶言子世哲楪苏兰;-><init>(I)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世苏哲:Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 5
    .line 6
    invoke-interface {p2}, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;->getContext()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世哲苏:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 11
    .line 12
    const p1, 0x1fffffff

    .line 13
    .line 14
    .line 15
    iput p1, p0, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->_decisionAndIndex$volatile:I

    .line 16
    .line 17
    sget-object p1, Lkotlinx/coroutines/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/飘花落叶言子楪世苏兰哲;

    .line 18
    .line 19
    iput-object p1, p0, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->_state$volatile:Ljava/lang/Object;

    .line 20
    .line 21
    return-void
.end method

.method public static 飘花落叶言子世楪苏兰哲(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "It\'s prohibited to register multiple handlers, tried to register "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p0, ", already has "

    .line 14
    .line 15
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v0
.end method

.method public static 飘花落叶言子世苏哲楪兰(Lkotlinx/coroutines/飘花落叶言子苏兰世哲楪;Ljava/lang/Object;IL飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, Lkotlinx/coroutines/飘花落叶言子楪兰世哲苏;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    if-eq p2, v0, :cond_2

    .line 8
    .line 9
    const/4 v0, 0x2

    .line 10
    if-ne p2, v0, :cond_1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_1
    return-object p1

    .line 14
    :cond_2
    :goto_0
    if-nez p3, :cond_3

    .line 15
    .line 16
    instance-of p2, p0, Lkotlinx/coroutines/飘花落叶言子楪苏哲世兰;

    .line 17
    .line 18
    if-nez p2, :cond_3

    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_3
    new-instance v0, Lkotlinx/coroutines/飘花落叶言子楪兰世苏哲;

    .line 22
    .line 23
    instance-of p2, p0, Lkotlinx/coroutines/飘花落叶言子楪苏哲世兰;

    .line 24
    .line 25
    if-eqz p2, :cond_4

    .line 26
    .line 27
    check-cast p0, Lkotlinx/coroutines/飘花落叶言子楪苏哲世兰;

    .line 28
    .line 29
    :goto_1
    move-object v2, p0

    .line 30
    goto :goto_2

    .line 31
    :cond_4
    const/4 p0, 0x0

    .line 32
    goto :goto_1

    .line 33
    :goto_2
    const/4 v4, 0x0

    .line 34
    const/16 v5, 0x10

    .line 35
    .line 36
    move-object v1, p1

    .line 37
    move-object v3, p3

    .line 38
    invoke-direct/range {v0 .. v5}, Lkotlinx/coroutines/飘花落叶言子楪兰世苏哲;-><init>(Ljava/lang/Object;Lkotlinx/coroutines/飘花落叶言子楪苏哲世兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;Ljava/lang/Throwable;I)V

    .line 39
    .line 40
    .line 41
    return-object v0
.end method


# virtual methods
.method public final getCallerFrame()L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世苏兰哲;
    .locals 1

    .line 1
    iget-object p0, p0, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世苏哲:Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    instance-of v0, p0, L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世苏兰哲;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世苏兰哲;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public final getContext()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世哲苏:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance p1, Lkotlinx/coroutines/飘花落叶言子楪兰世哲苏;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {p1, v0, v1}, Lkotlinx/coroutines/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/Throwable;Z)V

    .line 12
    .line 13
    .line 14
    :goto_0
    iget v0, p0, Lkotlinx/coroutines/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪哲兰苏世:I

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {p0, p1, v0, v1}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子世苏楪哲兰(Ljava/lang/Object;IL飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;)V

    .line 18
    .line 19
    .line 20
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
    invoke-virtual {p0}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子世楪哲苏兰()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 v1, 0x28

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世苏哲:Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 19
    .line 20
    invoke-static {v1}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世苏哲兰楪(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, "){"

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世哲苏()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    instance-of v2, v1, Lkotlinx/coroutines/飘花落叶言子苏兰世哲楪;

    .line 37
    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    const-string v1, "Active"

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    instance-of v1, v1, Lkotlinx/coroutines/飘花落叶言子楪苏兰哲世;

    .line 44
    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    const-string v1, "Cancelled"

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    const-string v1, "Completed"

    .line 51
    .line 52
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v1, "}@"

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-static {p0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲兰苏世(Ljava/lang/Object;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0
.end method

.method public final 飘花落叶言子世楪兰哲苏()Z
    .locals 5

    .line 1
    sget-object v0, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰苏哲世:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 7
    .line 8
    sget-wide v1, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子世楪苏哲兰:J

    .line 9
    .line 10
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    instance-of v4, v3, Lkotlinx/coroutines/飘花落叶言子楪兰世苏哲;

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    check-cast v3, Lkotlinx/coroutines/飘花落叶言子楪兰世苏哲;

    .line 19
    .line 20
    iget-object v3, v3, Lkotlinx/coroutines/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 21
    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲世苏兰()V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    return p0

    .line 29
    :cond_0
    sget-object v3, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰苏世哲:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 30
    .line 31
    const v4, 0x1fffffff

    .line 32
    .line 33
    .line 34
    invoke-virtual {v3, p0, v4}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->set(Ljava/lang/Object;I)V

    .line 35
    .line 36
    .line 37
    sget-object v3, Lkotlinx/coroutines/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/飘花落叶言子楪世苏兰哲;

    .line 38
    .line 39
    invoke-virtual {v0, p0, v1, v2, v3}, Lsun/misc/Unsafe;->putObjectVolatile(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    const/4 p0, 0x1

    .line 43
    return p0
.end method

.method public final 飘花落叶言子世楪兰苏哲(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget p1, p0, Lkotlinx/coroutines/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪哲兰苏世:I

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏世兰(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final 飘花落叶言子世楪哲兰苏()V
    .locals 2

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世苏哲:Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    instance-of v1, v0, Lkotlinx/coroutines/internal/飘花落叶言子楪世兰苏哲;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Lkotlinx/coroutines/internal/飘花落叶言子楪世兰苏哲;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    if-eqz v0, :cond_2

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Lkotlinx/coroutines/internal/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰(Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;)Ljava/lang/Throwable;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    invoke-virtual {p0}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲世苏兰()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Throwable;)Z

    .line 24
    .line 25
    .line 26
    :cond_2
    :goto_1
    return-void
.end method

.method public 飘花落叶言子世楪哲苏兰()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "CancellableContinuation"

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子世楪苏哲兰()Z
    .locals 2

    .line 1
    iget v0, p0, Lkotlinx/coroutines/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪哲兰苏世:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget-object p0, p0, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世苏哲:Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 7
    .line 8
    check-cast p0, Lkotlinx/coroutines/internal/飘花落叶言子楪世兰苏哲;

    .line 9
    .line 10
    invoke-virtual {p0}, Lkotlinx/coroutines/internal/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰()Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    const/4 p0, 0x1

    .line 17
    return p0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0
.end method

.method public final 飘花落叶言子世苏哲兰楪(Ljava/lang/Object;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;)Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪兰哲世苏;
    .locals 10

    .line 1
    sget-object v0, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪兰哲世苏;

    .line 2
    .line 3
    :goto_0
    sget-object v1, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰苏哲世:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v1, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 9
    .line 10
    sget-wide v2, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子世楪苏哲兰:J

    .line 11
    .line 12
    invoke-virtual {v1, p0, v2, v3}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v8

    .line 16
    instance-of v1, v8, Lkotlinx/coroutines/飘花落叶言子苏兰世哲楪;

    .line 17
    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    move-object v1, v8

    .line 21
    check-cast v1, Lkotlinx/coroutines/飘花落叶言子苏兰世哲楪;

    .line 22
    .line 23
    iget v4, p0, Lkotlinx/coroutines/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪哲兰苏世:I

    .line 24
    .line 25
    invoke-static {v1, p1, v4, p2}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子世苏哲楪兰(Lkotlinx/coroutines/飘花落叶言子苏兰世哲楪;Ljava/lang/Object;IL飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v9

    .line 29
    :goto_1
    sget-object v4, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 30
    .line 31
    sget-wide v6, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子世楪苏哲兰:J

    .line 32
    .line 33
    move-object v5, p0

    .line 34
    invoke-virtual/range {v4 .. v9}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-eqz p0, :cond_0

    .line 39
    .line 40
    invoke-virtual {v5}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲世兰苏()V

    .line 41
    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_0
    invoke-virtual {v4, v5, v2, v3}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    if-eq p0, v8, :cond_1

    .line 49
    .line 50
    move-object p0, v5

    .line 51
    goto :goto_0

    .line 52
    :cond_1
    move-object p0, v5

    .line 53
    goto :goto_1

    .line 54
    :cond_2
    const/4 p0, 0x0

    .line 55
    return-object p0
.end method

.method public final 飘花落叶言子世苏楪兰哲(Lkotlinx/coroutines/飘花落叶言子楪兰哲世苏;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世苏哲:Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    instance-of v1, v0, Lkotlinx/coroutines/internal/飘花落叶言子楪世兰苏哲;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    check-cast v0, Lkotlinx/coroutines/internal/飘花落叶言子楪世兰苏哲;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v0, v2

    .line 12
    :goto_0
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v0, v0, Lkotlinx/coroutines/internal/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世苏哲:Lkotlinx/coroutines/飘花落叶言子楪兰哲世苏;

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    move-object v0, v2

    .line 18
    :goto_1
    if-ne v0, p1, :cond_2

    .line 19
    .line 20
    const/4 p1, 0x4

    .line 21
    goto :goto_2

    .line 22
    :cond_2
    iget p1, p0, Lkotlinx/coroutines/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪哲兰苏世:I

    .line 23
    .line 24
    :goto_2
    sget-object v0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 25
    .line 26
    invoke-virtual {p0, v0, p1, v2}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子世苏楪哲兰(Ljava/lang/Object;IL飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final 飘花落叶言子世苏楪哲兰(Ljava/lang/Object;IL飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;)V
    .locals 9

    .line 1
    :goto_0
    sget-object v0, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰苏哲世:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 7
    .line 8
    sget-wide v1, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子世楪苏哲兰:J

    .line 9
    .line 10
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v7

    .line 14
    instance-of v0, v7, Lkotlinx/coroutines/飘花落叶言子苏兰世哲楪;

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    move-object v0, v7

    .line 19
    check-cast v0, Lkotlinx/coroutines/飘花落叶言子苏兰世哲楪;

    .line 20
    .line 21
    invoke-static {v0, p1, p2, p3}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子世苏哲楪兰(Lkotlinx/coroutines/飘花落叶言子苏兰世哲楪;Ljava/lang/Object;IL飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v8

    .line 25
    :goto_1
    sget-object v3, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 26
    .line 27
    sget-wide v5, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子世楪苏哲兰:J

    .line 28
    .line 29
    move-object v4, p0

    .line 30
    invoke-virtual/range {v3 .. v8}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eqz p0, :cond_0

    .line 35
    .line 36
    invoke-virtual {v4}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲世兰苏()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v4, p2}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏世兰(I)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_0
    invoke-virtual {v3, v4, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    if-eq p0, v7, :cond_1

    .line 48
    .line 49
    move-object p0, v4

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move-object p0, v4

    .line 52
    goto :goto_1

    .line 53
    :cond_2
    move-object v4, p0

    .line 54
    instance-of p0, v7, Lkotlinx/coroutines/飘花落叶言子楪苏兰哲世;

    .line 55
    .line 56
    if-eqz p0, :cond_4

    .line 57
    .line 58
    check-cast v7, Lkotlinx/coroutines/飘花落叶言子楪苏兰哲世;

    .line 59
    .line 60
    sget-object p0, Lkotlinx/coroutines/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 61
    .line 62
    const/4 p2, 0x0

    .line 63
    const/4 v0, 0x1

    .line 64
    invoke-virtual {p0, v7, p2, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    if-eqz p0, :cond_4

    .line 69
    .line 70
    if-eqz p3, :cond_3

    .line 71
    .line 72
    iget-object p0, v7, Lkotlinx/coroutines/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/Throwable;

    .line 73
    .line 74
    invoke-virtual {v4, p3, p0, p1}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏兰世哲(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;Ljava/lang/Throwable;Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :cond_3
    return-void

    .line 78
    :cond_4
    const-string p0, "Already resumed, but proposed with update "

    .line 79
    .line 80
    invoke-static {p1, p0}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子世楪兰哲苏(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public final 飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lkotlinx/coroutines/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰苏哲(Ljava/lang/Object;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;)V
    .locals 1

    .line 1
    iget v0, p0, Lkotlinx/coroutines/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪哲兰苏世:I

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0, p2}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子世苏楪哲兰(Ljava/lang/Object;IL飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final 飘花落叶言子楪世哲兰苏()Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世苏哲:Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲苏兰(Ljava/util/concurrent/CancellationException;)V
    .locals 10

    .line 1
    :goto_0
    sget-object v0, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰苏哲世:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 7
    .line 8
    sget-wide v1, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子世楪苏哲兰:J

    .line 9
    .line 10
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v7

    .line 14
    instance-of v0, v7, Lkotlinx/coroutines/飘花落叶言子苏兰世哲楪;

    .line 15
    .line 16
    if-nez v0, :cond_9

    .line 17
    .line 18
    instance-of v0, v7, Lkotlinx/coroutines/飘花落叶言子楪兰世哲苏;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    goto/16 :goto_3

    .line 23
    .line 24
    :cond_0
    instance-of v0, v7, Lkotlinx/coroutines/飘花落叶言子楪兰世苏哲;

    .line 25
    .line 26
    if-eqz v0, :cond_5

    .line 27
    .line 28
    move-object v0, v7

    .line 29
    check-cast v0, Lkotlinx/coroutines/飘花落叶言子楪兰世苏哲;

    .line 30
    .line 31
    iget-object v3, v0, Lkotlinx/coroutines/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世兰苏哲:Ljava/lang/Throwable;

    .line 32
    .line 33
    if-nez v3, :cond_4

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    const/16 v4, 0xf

    .line 37
    .line 38
    invoke-static {v0, v3, p1, v4}, Lkotlinx/coroutines/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰(Lkotlinx/coroutines/飘花落叶言子楪兰世苏哲;Lkotlinx/coroutines/飘花落叶言子楪苏哲世兰;Ljava/lang/Throwable;I)Lkotlinx/coroutines/飘花落叶言子楪兰世苏哲;

    .line 39
    .line 40
    .line 41
    move-result-object v8

    .line 42
    :goto_1
    sget-object v3, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 43
    .line 44
    sget-wide v5, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子世楪苏哲兰:J

    .line 45
    .line 46
    move-object v4, p0

    .line 47
    invoke-virtual/range {v3 .. v8}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    move-object v9, v4

    .line 52
    if-eqz p0, :cond_2

    .line 53
    .line 54
    iget-object p0, v0, Lkotlinx/coroutines/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏兰哲:Lkotlinx/coroutines/飘花落叶言子楪苏哲世兰;

    .line 55
    .line 56
    if-eqz p0, :cond_1

    .line 57
    .line 58
    invoke-virtual {v9, p0, p1}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲兰世(Lkotlinx/coroutines/飘花落叶言子楪苏哲世兰;Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    :cond_1
    iget-object p0, v0, Lkotlinx/coroutines/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;

    .line 62
    .line 63
    if-eqz p0, :cond_6

    .line 64
    .line 65
    iget-object v0, v0, Lkotlinx/coroutines/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/Object;

    .line 66
    .line 67
    invoke-virtual {v9, p0, p1, v0}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏兰世哲(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;Ljava/lang/Throwable;Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_2
    invoke-virtual {v3, v9, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    if-eq p0, v7, :cond_3

    .line 76
    .line 77
    move-object p0, p1

    .line 78
    move-object v4, v9

    .line 79
    goto :goto_4

    .line 80
    :cond_3
    move-object p0, v9

    .line 81
    goto :goto_1

    .line 82
    :cond_4
    const-string p0, "Must be called at most once"

    .line 83
    .line 84
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_5
    move-object v9, p0

    .line 89
    new-instance v3, Lkotlinx/coroutines/飘花落叶言子楪兰世苏哲;

    .line 90
    .line 91
    const/4 v6, 0x0

    .line 92
    const/16 v8, 0xe

    .line 93
    .line 94
    const/4 v5, 0x0

    .line 95
    move-object v4, v7

    .line 96
    move-object v7, p1

    .line 97
    invoke-direct/range {v3 .. v8}, Lkotlinx/coroutines/飘花落叶言子楪兰世苏哲;-><init>(Ljava/lang/Object;Lkotlinx/coroutines/飘花落叶言子楪苏哲世兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;Ljava/lang/Throwable;I)V

    .line 98
    .line 99
    .line 100
    move-object p0, v7

    .line 101
    move-object v7, v4

    .line 102
    :goto_2
    move-object v8, v3

    .line 103
    sget-object v3, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 104
    .line 105
    sget-wide v5, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子世楪苏哲兰:J

    .line 106
    .line 107
    move-object v4, v9

    .line 108
    invoke-virtual/range {v3 .. v8}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    move-object v0, v3

    .line 113
    move-object v3, v8

    .line 114
    if-eqz p1, :cond_7

    .line 115
    .line 116
    :cond_6
    :goto_3
    return-void

    .line 117
    :cond_7
    invoke-virtual {v0, v4, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    if-eq p1, v7, :cond_8

    .line 122
    .line 123
    :goto_4
    move-object p1, p0

    .line 124
    move-object p0, v4

    .line 125
    goto :goto_0

    .line 126
    :cond_8
    move-object v9, v4

    .line 127
    goto :goto_2

    .line 128
    :cond_9
    const-string p0, "Not completed"

    .line 129
    .line 130
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲(Lkotlinx/coroutines/internal/飘花落叶言子楪哲苏兰世;I)V
    .locals 4

    .line 1
    :cond_0
    sget-object v0, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰苏世哲:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const v2, 0x1fffffff

    .line 8
    .line 9
    .line 10
    and-int v3, v1, v2

    .line 11
    .line 12
    if-ne v3, v2, :cond_1

    .line 13
    .line 14
    shr-int/lit8 v2, v1, 0x1d

    .line 15
    .line 16
    shl-int/lit8 v2, v2, 0x1d

    .line 17
    .line 18
    add-int/2addr v2, p2

    .line 19
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲苏世(Lkotlinx/coroutines/飘花落叶言子苏兰世哲楪;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    const-string p0, "invokeOnCancellation should be called at most once"

    .line 30
    .line 31
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/Throwable;)Z
    .locals 10

    .line 1
    :goto_0
    sget-object v0, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰苏哲世:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 7
    .line 8
    sget-wide v1, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子世楪苏哲兰:J

    .line 9
    .line 10
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v7

    .line 14
    instance-of v0, v7, Lkotlinx/coroutines/飘花落叶言子苏兰世哲楪;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    return v3

    .line 20
    :cond_0
    new-instance v8, Lkotlinx/coroutines/飘花落叶言子楪苏兰哲世;

    .line 21
    .line 22
    instance-of v0, v7, Lkotlinx/coroutines/飘花落叶言子楪苏哲世兰;

    .line 23
    .line 24
    const/4 v9, 0x1

    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    instance-of v0, v7, Lkotlinx/coroutines/internal/飘花落叶言子楪哲苏兰世;

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    :cond_1
    move v3, v9

    .line 32
    :cond_2
    if-nez p1, :cond_3

    .line 33
    .line 34
    new-instance v0, Ljava/util/concurrent/CancellationException;

    .line 35
    .line 36
    new-instance v4, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string v5, "Continuation "

    .line 39
    .line 40
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v5, " was cancelled normally"

    .line 47
    .line 48
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-direct {v0, v4}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    move-object v0, p1

    .line 60
    :goto_1
    invoke-direct {v8, v0, v3}, Lkotlinx/coroutines/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/Throwable;Z)V

    .line 61
    .line 62
    .line 63
    :goto_2
    sget-object v3, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 64
    .line 65
    sget-wide v5, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子世楪苏哲兰:J

    .line 66
    .line 67
    move-object v4, p0

    .line 68
    invoke-virtual/range {v3 .. v8}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    if-eqz p0, :cond_6

    .line 73
    .line 74
    move-object p0, v7

    .line 75
    check-cast p0, Lkotlinx/coroutines/飘花落叶言子苏兰世哲楪;

    .line 76
    .line 77
    instance-of v0, p0, Lkotlinx/coroutines/飘花落叶言子楪苏哲世兰;

    .line 78
    .line 79
    if-eqz v0, :cond_4

    .line 80
    .line 81
    check-cast v7, Lkotlinx/coroutines/飘花落叶言子楪苏哲世兰;

    .line 82
    .line 83
    invoke-virtual {v4, v7, p1}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲兰世(Lkotlinx/coroutines/飘花落叶言子楪苏哲世兰;Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_4
    instance-of p0, p0, Lkotlinx/coroutines/internal/飘花落叶言子楪哲苏兰世;

    .line 88
    .line 89
    if-eqz p0, :cond_5

    .line 90
    .line 91
    check-cast v7, Lkotlinx/coroutines/internal/飘花落叶言子楪哲苏兰世;

    .line 92
    .line 93
    invoke-virtual {v4, v7, p1}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏兰哲世(Lkotlinx/coroutines/internal/飘花落叶言子楪哲苏兰世;Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    :cond_5
    :goto_3
    invoke-virtual {v4}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲世兰苏()V

    .line 97
    .line 98
    .line 99
    iget p0, v4, Lkotlinx/coroutines/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪哲兰苏世:I

    .line 100
    .line 101
    invoke-virtual {v4, p0}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏世兰(I)V

    .line 102
    .line 103
    .line 104
    return v9

    .line 105
    :cond_6
    invoke-virtual {v3, v4, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    if-eq p0, v7, :cond_7

    .line 110
    .line 111
    move-object p0, v4

    .line 112
    goto :goto_0

    .line 113
    :cond_7
    move-object p0, v4

    .line 114
    goto :goto_2
.end method

.method public final 飘花落叶言子楪兰世哲苏()Ljava/lang/Object;
    .locals 3

    .line 1
    sget-object v0, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰苏哲世:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 7
    .line 8
    sget-wide v1, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子世楪苏哲兰:J

    .line 9
    .line 10
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public final 飘花落叶言子楪兰世苏哲()Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子世楪苏哲兰()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    :cond_0
    sget-object v1, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰苏世哲:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 6
    .line 7
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    shr-int/lit8 v3, v2, 0x1d

    .line 12
    .line 13
    if-eqz v3, :cond_7

    .line 14
    .line 15
    const/4 v1, 0x2

    .line 16
    if-ne v3, v1, :cond_6

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子世楪哲兰苏()V

    .line 21
    .line 22
    .line 23
    :cond_1
    invoke-virtual {p0}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世哲苏()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    instance-of v2, v0, Lkotlinx/coroutines/飘花落叶言子楪兰世哲苏;

    .line 28
    .line 29
    if-nez v2, :cond_5

    .line 30
    .line 31
    iget v2, p0, Lkotlinx/coroutines/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪哲兰苏世:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eq v2, v3, :cond_2

    .line 35
    .line 36
    if-ne v2, v1, :cond_4

    .line 37
    .line 38
    :cond_2
    iget-object v1, p0, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世哲苏:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 39
    .line 40
    sget-object v2, Lkotlinx/coroutines/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/飘花落叶言子苏世楪哲兰;

    .line 41
    .line 42
    invoke-interface {v1, v2}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->get(Lkotlin/coroutines/飘花落叶言子楪苏世哲兰;)Lkotlin/coroutines/飘花落叶言子楪世兰哲苏;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 47
    .line 48
    if-eqz v1, :cond_4

    .line 49
    .line 50
    invoke-interface {v1}, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世兰哲苏()Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_3

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    invoke-interface {v1}, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪兰哲苏世()Ljava/util/concurrent/CancellationException;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {p0, v0}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰(Ljava/util/concurrent/CancellationException;)V

    .line 62
    .line 63
    .line 64
    throw v0

    .line 65
    :cond_4
    :goto_0
    invoke-virtual {p0, v0}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0

    .line 70
    :cond_5
    check-cast v0, Lkotlinx/coroutines/飘花落叶言子楪兰世哲苏;

    .line 71
    .line 72
    iget-object p0, v0, Lkotlinx/coroutines/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/Throwable;

    .line 73
    .line 74
    throw p0

    .line 75
    :cond_6
    const-string p0, "Already suspended"

    .line 76
    .line 77
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    const/4 p0, 0x0

    .line 81
    return-object p0

    .line 82
    :cond_7
    const v3, 0x1fffffff

    .line 83
    .line 84
    .line 85
    and-int/2addr v3, v2

    .line 86
    const/high16 v4, 0x20000000

    .line 87
    .line 88
    add-int/2addr v4, v3

    .line 89
    invoke-virtual {v1, p0, v2, v4}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-eqz v1, :cond_0

    .line 94
    .line 95
    invoke-virtual {p0}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰苏世()Lkotlinx/coroutines/飘花落叶言子世哲苏楪兰;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    if-nez v1, :cond_8

    .line 100
    .line 101
    invoke-virtual {p0}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰苏哲世()Lkotlinx/coroutines/飘花落叶言子世哲苏楪兰;

    .line 102
    .line 103
    .line 104
    :cond_8
    if-eqz v0, :cond_9

    .line 105
    .line 106
    invoke-virtual {p0}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子世楪哲兰苏()V

    .line 107
    .line 108
    .line 109
    :cond_9
    sget-object p0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 110
    .line 111
    return-object p0
.end method

.method public final 飘花落叶言子楪兰哲世苏(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V
    .locals 2

    .line 1
    new-instance v0, Lkotlinx/coroutines/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, v1}, Lkotlinx/coroutines/飘花落叶言子楪苏世兰哲;-><init>(Ljava/lang/Object;I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲苏世(Lkotlinx/coroutines/飘花落叶言子苏兰世哲楪;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final 飘花落叶言子楪兰哲苏世(Lkotlinx/coroutines/飘花落叶言子苏兰世哲楪;)V
    .locals 10

    .line 1
    :goto_0
    sget-object v0, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰苏哲世:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 7
    .line 8
    sget-wide v1, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子世楪苏哲兰:J

    .line 9
    .line 10
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v7

    .line 14
    instance-of v0, v7, Lkotlinx/coroutines/飘花落叶言子楪世苏兰哲;

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    :goto_1
    sget-object v3, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 19
    .line 20
    sget-wide v5, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子世楪苏哲兰:J

    .line 21
    .line 22
    move-object v4, p0

    .line 23
    move-object v8, p1

    .line 24
    invoke-virtual/range {v3 .. v8}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-eqz p0, :cond_0

    .line 29
    .line 30
    goto/16 :goto_3

    .line 31
    .line 32
    :cond_0
    invoke-virtual {v3, v4, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    if-eq p0, v7, :cond_1

    .line 37
    .line 38
    goto/16 :goto_4

    .line 39
    .line 40
    :cond_1
    move-object p0, v4

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    move-object v4, p0

    .line 43
    instance-of p0, v7, Lkotlinx/coroutines/飘花落叶言子楪苏哲世兰;

    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    if-nez p0, :cond_10

    .line 47
    .line 48
    instance-of p0, v7, Lkotlinx/coroutines/internal/飘花落叶言子楪哲苏兰世;

    .line 49
    .line 50
    if-nez p0, :cond_10

    .line 51
    .line 52
    instance-of p0, v7, Lkotlinx/coroutines/飘花落叶言子楪兰世哲苏;

    .line 53
    .line 54
    if-eqz p0, :cond_5

    .line 55
    .line 56
    move-object p0, v7

    .line 57
    check-cast p0, Lkotlinx/coroutines/飘花落叶言子楪兰世哲苏;

    .line 58
    .line 59
    sget-object v1, Lkotlinx/coroutines/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 60
    .line 61
    const/4 v2, 0x0

    .line 62
    const/4 v3, 0x1

    .line 63
    invoke-virtual {v1, p0, v2, v3}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_4

    .line 68
    .line 69
    instance-of v0, v7, Lkotlinx/coroutines/飘花落叶言子楪苏兰哲世;

    .line 70
    .line 71
    if-eqz v0, :cond_d

    .line 72
    .line 73
    iget-object p0, p0, Lkotlinx/coroutines/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/Throwable;

    .line 74
    .line 75
    instance-of v0, p1, Lkotlinx/coroutines/飘花落叶言子楪苏哲世兰;

    .line 76
    .line 77
    if-eqz v0, :cond_3

    .line 78
    .line 79
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子楪苏哲世兰;

    .line 80
    .line 81
    invoke-virtual {v4, p1, p0}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲兰世(Lkotlinx/coroutines/飘花落叶言子楪苏哲世兰;Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    check-cast p1, Lkotlinx/coroutines/internal/飘花落叶言子楪哲苏兰世;

    .line 89
    .line 90
    invoke-virtual {v4, p1, p0}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏兰哲世(Lkotlinx/coroutines/internal/飘花落叶言子楪哲苏兰世;Ljava/lang/Throwable;)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_4
    invoke-static {p1, v7}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子世楪苏兰哲(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    throw v0

    .line 98
    :cond_5
    instance-of p0, v7, Lkotlinx/coroutines/飘花落叶言子楪兰世苏哲;

    .line 99
    .line 100
    if-eqz p0, :cond_b

    .line 101
    .line 102
    move-object p0, v7

    .line 103
    check-cast p0, Lkotlinx/coroutines/飘花落叶言子楪兰世苏哲;

    .line 104
    .line 105
    iget-object v3, p0, Lkotlinx/coroutines/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏兰哲:Lkotlinx/coroutines/飘花落叶言子楪苏哲世兰;

    .line 106
    .line 107
    if-nez v3, :cond_a

    .line 108
    .line 109
    instance-of v3, p1, Lkotlinx/coroutines/internal/飘花落叶言子楪哲苏兰世;

    .line 110
    .line 111
    if-eqz v3, :cond_6

    .line 112
    .line 113
    return-void

    .line 114
    :cond_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    move-object v3, p1

    .line 118
    check-cast v3, Lkotlinx/coroutines/飘花落叶言子楪苏哲世兰;

    .line 119
    .line 120
    iget-object v5, p0, Lkotlinx/coroutines/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世兰苏哲:Ljava/lang/Throwable;

    .line 121
    .line 122
    if-eqz v5, :cond_7

    .line 123
    .line 124
    invoke-virtual {v4, v3, v5}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲兰世(Lkotlinx/coroutines/飘花落叶言子楪苏哲世兰;Ljava/lang/Throwable;)V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :cond_7
    const/16 v5, 0x1d

    .line 129
    .line 130
    invoke-static {p0, v3, v0, v5}, Lkotlinx/coroutines/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰(Lkotlinx/coroutines/飘花落叶言子楪兰世苏哲;Lkotlinx/coroutines/飘花落叶言子楪苏哲世兰;Ljava/lang/Throwable;I)Lkotlinx/coroutines/飘花落叶言子楪兰世苏哲;

    .line 131
    .line 132
    .line 133
    move-result-object v8

    .line 134
    :cond_8
    sget-object v3, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 135
    .line 136
    sget-wide v5, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子世楪苏哲兰:J

    .line 137
    .line 138
    invoke-virtual/range {v3 .. v8}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result p0

    .line 142
    move-object v9, v4

    .line 143
    if-eqz p0, :cond_9

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_9
    invoke-virtual {v3, v9, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    move-object v4, v9

    .line 151
    if-eq p0, v7, :cond_8

    .line 152
    .line 153
    goto :goto_4

    .line 154
    :cond_a
    invoke-static {p1, v7}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子世楪苏兰哲(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    throw v0

    .line 158
    :cond_b
    move-object v9, v4

    .line 159
    instance-of p0, p1, Lkotlinx/coroutines/internal/飘花落叶言子楪哲苏兰世;

    .line 160
    .line 161
    if-eqz p0, :cond_c

    .line 162
    .line 163
    return-void

    .line 164
    :cond_c
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    move-object v5, p1

    .line 168
    check-cast v5, Lkotlinx/coroutines/飘花落叶言子楪苏哲世兰;

    .line 169
    .line 170
    new-instance v3, Lkotlinx/coroutines/飘花落叶言子楪兰世苏哲;

    .line 171
    .line 172
    move-object v4, v7

    .line 173
    const/4 v7, 0x0

    .line 174
    const/16 v8, 0x1c

    .line 175
    .line 176
    const/4 v6, 0x0

    .line 177
    invoke-direct/range {v3 .. v8}, Lkotlinx/coroutines/飘花落叶言子楪兰世苏哲;-><init>(Ljava/lang/Object;Lkotlinx/coroutines/飘花落叶言子楪苏哲世兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;Ljava/lang/Throwable;I)V

    .line 178
    .line 179
    .line 180
    move-object v7, v4

    .line 181
    :goto_2
    move-object v8, v3

    .line 182
    sget-object v3, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 183
    .line 184
    sget-wide v5, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子世楪苏哲兰:J

    .line 185
    .line 186
    move-object v4, v9

    .line 187
    invoke-virtual/range {v3 .. v8}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result p0

    .line 191
    move-object v0, v3

    .line 192
    move-object v3, v8

    .line 193
    if-eqz p0, :cond_e

    .line 194
    .line 195
    :cond_d
    :goto_3
    return-void

    .line 196
    :cond_e
    invoke-virtual {v0, v4, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    if-eq p0, v7, :cond_f

    .line 201
    .line 202
    :goto_4
    move-object p0, v4

    .line 203
    goto/16 :goto_0

    .line 204
    .line 205
    :cond_f
    move-object v9, v4

    .line 206
    goto :goto_2

    .line 207
    :cond_10
    invoke-static {p1, v7}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子世楪苏兰哲(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    throw v0
.end method

.method public final 飘花落叶言子楪兰苏世哲()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰苏哲世()Lkotlinx/coroutines/飘花落叶言子世哲苏楪兰;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p0}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世哲苏()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    instance-of v1, v1, Lkotlinx/coroutines/飘花落叶言子苏兰世哲楪;

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    invoke-interface {v0}, Lkotlinx/coroutines/飘花落叶言子世哲苏楪兰;->dispose()V

    .line 17
    .line 18
    .line 19
    sget-object v0, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲世苏:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    sget-object v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 25
    .line 26
    sget-wide v1, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲苏世:J

    .line 27
    .line 28
    sget-object v3, Lkotlinx/coroutines/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/飘花落叶言子苏兰世楪哲;

    .line 29
    .line 30
    invoke-virtual {v0, p0, v1, v2, v3}, Lsun/misc/Unsafe;->putObjectVolatile(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    :goto_0
    return-void
.end method

.method public final 飘花落叶言子楪兰苏哲世()Lkotlinx/coroutines/飘花落叶言子世哲苏楪兰;
    .locals 8

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世哲苏:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    sget-object v1, Lkotlinx/coroutines/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/飘花落叶言子苏世楪哲兰;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->get(Lkotlin/coroutines/飘花落叶言子楪苏世哲兰;)Lkotlin/coroutines/飘花落叶言子楪世兰哲苏;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return-object p0

    .line 15
    :cond_0
    new-instance v1, Lkotlinx/coroutines/飘花落叶言子楪哲世苏兰;

    .line 16
    .line 17
    invoke-direct {v1, p0}, Lkotlinx/coroutines/飘花落叶言子楪哲世苏兰;-><init>(Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰苏哲世(Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;Lkotlinx/coroutines/飘花落叶言子苏世哲兰楪;)Lkotlinx/coroutines/飘花落叶言子世哲苏楪兰;

    .line 21
    .line 22
    .line 23
    move-result-object v7

    .line 24
    :goto_0
    sget-object v0, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲世苏:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    sget-object v2, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 30
    .line 31
    sget-wide v4, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲苏世:J

    .line 32
    .line 33
    const/4 v6, 0x0

    .line 34
    move-object v3, p0

    .line 35
    invoke-virtual/range {v2 .. v7}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-eqz p0, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    invoke-virtual {v2, v3, v4, v5}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    if-eqz p0, :cond_2

    .line 47
    .line 48
    :goto_1
    return-object v7

    .line 49
    :cond_2
    move-object p0, v3

    .line 50
    goto :goto_0
.end method

.method public final 飘花落叶言子楪哲世兰苏()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子世楪苏哲兰()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲世苏兰()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子楪哲世苏兰()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰苏世()Lkotlinx/coroutines/飘花落叶言子世哲苏楪兰;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-interface {v0}, Lkotlinx/coroutines/飘花落叶言子世哲苏楪兰;->dispose()V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲世苏:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    sget-object v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 17
    .line 18
    sget-wide v1, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲苏世:J

    .line 19
    .line 20
    sget-object v3, Lkotlinx/coroutines/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/飘花落叶言子苏兰世楪哲;

    .line 21
    .line 22
    invoke-virtual {v0, p0, v1, v2, v3}, Lsun/misc/Unsafe;->putObjectVolatile(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final 飘花落叶言子楪哲兰世苏(Ljava/lang/Object;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;)Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪兰哲世苏;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子世苏哲兰楪(Ljava/lang/Object;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;)Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪兰哲世苏;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final 飘花落叶言子楪哲兰苏世()Lkotlinx/coroutines/飘花落叶言子世哲苏楪兰;
    .locals 3

    .line 1
    sget-object v0, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲世苏:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 7
    .line 8
    sget-wide v1, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲苏世:J

    .line 9
    .line 10
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Lkotlinx/coroutines/飘花落叶言子世哲苏楪兰;

    .line 15
    .line 16
    return-object p0
.end method

.method public final 飘花落叶言子楪哲苏世兰(I)V
    .locals 6

    .line 1
    :cond_0
    sget-object v0, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰苏世哲:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    shr-int/lit8 v2, v1, 0x1d

    .line 8
    .line 9
    if-eqz v2, :cond_b

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    if-ne v2, v0, :cond_a

    .line 13
    .line 14
    const/4 v1, 0x4

    .line 15
    const/4 v2, 0x0

    .line 16
    if-ne p1, v1, :cond_1

    .line 17
    .line 18
    move v1, v0

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    move v1, v2

    .line 21
    :goto_0
    iget-object v3, p0, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世苏哲:Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 22
    .line 23
    if-nez v1, :cond_9

    .line 24
    .line 25
    instance-of v4, v3, Lkotlinx/coroutines/internal/飘花落叶言子楪世兰苏哲;

    .line 26
    .line 27
    if-eqz v4, :cond_9

    .line 28
    .line 29
    const/4 v4, 0x2

    .line 30
    if-eq p1, v0, :cond_3

    .line 31
    .line 32
    if-ne p1, v4, :cond_2

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    move p1, v2

    .line 36
    goto :goto_2

    .line 37
    :cond_3
    :goto_1
    move p1, v0

    .line 38
    :goto_2
    iget v5, p0, Lkotlinx/coroutines/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪哲兰苏世:I

    .line 39
    .line 40
    if-eq v5, v0, :cond_4

    .line 41
    .line 42
    if-ne v5, v4, :cond_5

    .line 43
    .line 44
    :cond_4
    move v2, v0

    .line 45
    :cond_5
    if-ne p1, v2, :cond_9

    .line 46
    .line 47
    move-object p1, v3

    .line 48
    check-cast p1, Lkotlinx/coroutines/internal/飘花落叶言子楪世兰苏哲;

    .line 49
    .line 50
    iget-object v1, p1, Lkotlinx/coroutines/internal/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世苏哲:Lkotlinx/coroutines/飘花落叶言子楪兰哲世苏;

    .line 51
    .line 52
    iget-object p1, p1, Lkotlinx/coroutines/internal/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世哲苏:Lkotlin/coroutines/jvm/internal/ContinuationImpl;

    .line 53
    .line 54
    invoke-interface {p1}, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;->getContext()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {v1, p1}, Lkotlinx/coroutines/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Lkotlinx/coroutines/飘花落叶言子楪兰哲世苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_6

    .line 63
    .line 64
    invoke-static {v1, p1, p0}, Lkotlinx/coroutines/internal/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Lkotlinx/coroutines/飘花落叶言子楪兰哲世苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Ljava/lang/Runnable;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_6
    invoke-static {}, Lkotlinx/coroutines/飘花落叶言子哲楪兰苏世;->飘花落叶言子楪世苏哲兰()Lkotlinx/coroutines/飘花落叶言子世哲兰苏楪;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iget-wide v1, p1, Lkotlinx/coroutines/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲兰世苏:J

    .line 73
    .line 74
    const-wide v4, 0x100000000L

    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    cmp-long v1, v1, v4

    .line 80
    .line 81
    if-ltz v1, :cond_7

    .line 82
    .line 83
    invoke-virtual {p1, p0}, Lkotlinx/coroutines/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪兰哲世苏(Lkotlinx/coroutines/飘花落叶言子世哲楪苏兰;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_7
    invoke-virtual {p1, v0}, Lkotlinx/coroutines/飘花落叶言子世哲兰苏楪;->飘花落叶言子世苏哲楪兰(Z)V

    .line 88
    .line 89
    .line 90
    :try_start_0
    invoke-static {p0, v3, v0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪兰哲苏(Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;Z)V

    .line 91
    .line 92
    .line 93
    :cond_8
    invoke-virtual {p1}, Lkotlinx/coroutines/飘花落叶言子世哲兰苏楪;->飘花落叶言子苏楪哲兰世()Z

    .line 94
    .line 95
    .line 96
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    if-nez v1, :cond_8

    .line 98
    .line 99
    :goto_3
    invoke-virtual {p1, v0}, Lkotlinx/coroutines/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪兰苏世哲(Z)V

    .line 100
    .line 101
    .line 102
    goto :goto_4

    .line 103
    :catchall_0
    move-exception v1

    .line 104
    :try_start_1
    invoke-virtual {p0, v1}, Lkotlinx/coroutines/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 105
    .line 106
    .line 107
    goto :goto_3

    .line 108
    :catchall_1
    move-exception p0

    .line 109
    invoke-virtual {p1, v0}, Lkotlinx/coroutines/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪兰苏世哲(Z)V

    .line 110
    .line 111
    .line 112
    throw p0

    .line 113
    :cond_9
    invoke-static {p0, v3, v1}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪兰哲苏(Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;Z)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :cond_a
    const-string p0, "Already resumed"

    .line 118
    .line 119
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :cond_b
    const v2, 0x1fffffff

    .line 124
    .line 125
    .line 126
    and-int/2addr v2, v1

    .line 127
    const/high16 v3, 0x40000000    # 2.0f

    .line 128
    .line 129
    add-int/2addr v3, v2

    .line 130
    invoke-virtual {v0, p0, v1, v3}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-eqz v0, :cond_0

    .line 135
    .line 136
    :goto_4
    return-void
.end method

.method public 飘花落叶言子楪哲苏兰世(Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;)Ljava/lang/Throwable;
    .locals 0

    .line 1
    invoke-virtual {p1}, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪兰哲苏世()Ljava/util/concurrent/CancellationException;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final 飘花落叶言子楪苏世哲兰(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    instance-of p0, p1, Lkotlinx/coroutines/飘花落叶言子楪兰世苏哲;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子楪兰世苏哲;

    .line 6
    .line 7
    iget-object p0, p1, Lkotlinx/coroutines/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/Object;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    return-object p1
.end method

.method public final 飘花落叶言子楪苏兰世哲(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;Ljava/lang/Throwable;Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世哲苏:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    :try_start_0
    invoke-interface {p1, p2, p3, v0}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catchall_0
    move-exception p1

    .line 8
    new-instance p2, Lkotlinx/coroutines/CompletionHandlerException;

    .line 9
    .line 10
    new-instance p3, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v1, "Exception in resume onCancellation handler for "

    .line 13
    .line 14
    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-direct {p2, p0, p1}, Lkotlinx/coroutines/CompletionHandlerException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v0, p2}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰苏世哲(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final 飘花落叶言子楪苏兰哲世(Lkotlinx/coroutines/internal/飘花落叶言子楪哲苏兰世;Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    iget-object p2, p0, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世哲苏:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    sget-object v0, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰苏世哲:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const v1, 0x1fffffff

    .line 10
    .line 11
    .line 12
    and-int/2addr v0, v1

    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    :try_start_0
    invoke-virtual {p1, v0, p2}, Lkotlinx/coroutines/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世苏兰(ILkotlin/coroutines/飘花落叶言子楪苏世兰哲;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    new-instance v0, Lkotlinx/coroutines/CompletionHandlerException;

    .line 21
    .line 22
    new-instance v1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v2, "Exception in invokeOnCancellation handler for "

    .line 25
    .line 26
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-direct {v0, p0, p1}, Lkotlinx/coroutines/CompletionHandlerException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    invoke-static {p2, v0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰苏世哲(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_0
    const-string p0, "The index for Segment.onCancellation(..) is broken"

    .line 44
    .line 45
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final 飘花落叶言子楪苏哲世兰()Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世哲苏()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final 飘花落叶言子楪苏哲兰世(Lkotlinx/coroutines/飘花落叶言子楪苏哲世兰;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-interface {p1, p2}, Lkotlinx/coroutines/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catchall_0
    move-exception p1

    .line 6
    new-instance p2, Lkotlinx/coroutines/CompletionHandlerException;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v1, "Exception in invokeOnCancellation handler for "

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-direct {p2, v0, p1}, Lkotlinx/coroutines/CompletionHandlerException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世哲苏:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 26
    .line 27
    invoke-static {p0, p2}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰苏世哲(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method
