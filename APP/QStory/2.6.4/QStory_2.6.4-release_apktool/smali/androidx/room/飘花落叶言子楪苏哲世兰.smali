.class public final Landroidx/room/飘花落叶言子楪苏哲世兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世兰哲苏:Landroidx/room/飘花落叶言子楪苏世兰哲;

.field public final 飘花落叶言子楪世兰苏哲:Landroidx/room/飘花落叶言子楪苏世兰哲;

.field public final 飘花落叶言子楪世哲兰苏:Ljava/util/concurrent/locks/ReentrantLock;

.field public final 飘花落叶言子楪世哲苏兰:Ljava/util/LinkedHashMap;

.field public final 飘花落叶言子楪世苏兰哲:Landroidx/room/飘花落叶言子世苏兰楪哲;

.field public final 飘花落叶言子楪世苏哲兰:Ltop/suzhelan/qstory/database/RecallDatabase_Impl;

.field public final 飘花落叶言子楪苏世哲兰:Ljava/lang/Object;


# direct methods
.method public varargs constructor <init>(Ltop/suzhelan/qstory/database/RecallDatabase_Impl;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;[Ljava/lang/String;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/room/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Ltop/suzhelan/qstory/database/RecallDatabase_Impl;

    .line 5
    .line 6
    new-instance v0, Landroidx/room/飘花落叶言子世苏兰楪哲;

    .line 7
    .line 8
    iget-boolean v5, p1, Landroidx/room/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪苏兰世哲:Z

    .line 9
    .line 10
    new-instance v6, Landroidx/room/InvalidationTracker$implementation$1;

    .line 11
    .line 12
    invoke-direct {v6, p0}, Landroidx/room/InvalidationTracker$implementation$1;-><init>(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    move-object v1, p1

    .line 16
    move-object v2, p2

    .line 17
    move-object v3, p3

    .line 18
    move-object v4, p4

    .line 19
    invoke-direct/range {v0 .. v6}, Landroidx/room/飘花落叶言子世苏兰楪哲;-><init>(Ltop/suzhelan/qstory/database/RecallDatabase_Impl;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;[Ljava/lang/String;ZL飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Landroidx/room/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:Landroidx/room/飘花落叶言子世苏兰楪哲;

    .line 23
    .line 24
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 25
    .line 26
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Landroidx/room/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰:Ljava/util/LinkedHashMap;

    .line 30
    .line 31
    new-instance p1, Ljava/util/concurrent/locks/ReentrantLock;

    .line 32
    .line 33
    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Landroidx/room/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏:Ljava/util/concurrent/locks/ReentrantLock;

    .line 37
    .line 38
    new-instance p1, Landroidx/room/飘花落叶言子楪苏世兰哲;

    .line 39
    .line 40
    const/4 p2, 0x0

    .line 41
    invoke-direct {p1, p0, p2}, Landroidx/room/飘花落叶言子楪苏世兰哲;-><init>(Ljava/lang/Object;I)V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Landroidx/room/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰苏哲:Landroidx/room/飘花落叶言子楪苏世兰哲;

    .line 45
    .line 46
    new-instance p1, Landroidx/room/飘花落叶言子楪苏世兰哲;

    .line 47
    .line 48
    const/4 p2, 0x1

    .line 49
    invoke-direct {p1, p0, p2}, Landroidx/room/飘花落叶言子楪苏世兰哲;-><init>(Ljava/lang/Object;I)V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, Landroidx/room/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰哲苏:Landroidx/room/飘花落叶言子楪苏世兰哲;

    .line 53
    .line 54
    new-instance p1, Ljava/util/IdentityHashMap;

    .line 55
    .line 56
    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-static {p1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    new-instance p1, Ljava/lang/Object;

    .line 67
    .line 68
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 69
    .line 70
    .line 71
    iput-object p1, p0, Landroidx/room/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世哲兰:Ljava/lang/Object;

    .line 72
    .line 73
    new-instance p1, Landroidx/compose/foundation/飘花落叶言子世楪哲苏兰;

    .line 74
    .line 75
    const/4 p2, 0x7

    .line 76
    invoke-direct {p1, p0, p2}, Landroidx/compose/foundation/飘花落叶言子世楪哲苏兰;-><init>(Ljava/lang/Object;I)V

    .line 77
    .line 78
    .line 79
    iput-object p1, v0, Landroidx/room/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏兰世哲:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;

    .line 80
    .line 81
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲(Lkotlin/coroutines/jvm/internal/SuspendLambda;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/room/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:Landroidx/room/飘花落叶言子世苏兰楪哲;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/room/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object p1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 8
    .line 9
    if-ne p0, p1, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 13
    .line 14
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/room/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰苏哲:Landroidx/room/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/room/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰哲苏:Landroidx/room/飘花落叶言子楪苏世兰哲;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/room/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:Landroidx/room/飘花落叶言子世苏兰楪哲;

    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Landroidx/room/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
