.class public abstract Landroidx/room/飘花落叶言子楪兰哲苏世;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public 飘花落叶言子楪世兰哲苏:Landroidx/room/飘花落叶言子楪苏哲世兰;

.field public 飘花落叶言子楪世兰苏哲:Landroidx/constraintlayout/core/widgets/analyzer/飘花落叶言子楪世兰苏哲;

.field public 飘花落叶言子楪世哲兰苏:Landroidx/appcompat/app/飘花落叶言子楪兰世苏哲;

.field public 飘花落叶言子楪世哲苏兰:Ljava/util/concurrent/Executor;

.field public 飘花落叶言子楪世苏兰哲:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

.field public 飘花落叶言子楪世苏哲兰:Lkotlinx/coroutines/internal/飘花落叶言子楪世哲兰苏;

.field public 飘花落叶言子楪苏世兰哲:Z

.field public final 飘花落叶言子楪苏世哲兰:L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世苏哲兰;

.field public 飘花落叶言子楪苏兰世哲:Z

.field public final 飘花落叶言子楪苏哲世兰:Ljava/lang/ThreadLocal;

.field public final 飘花落叶言子楪苏哲兰世:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世苏哲兰;

    .line 5
    .line 6
    new-instance v1, Landroidx/room/RoomDatabase$closeBarrier$1;

    .line 7
    .line 8
    invoke-direct {v1, p0}, Landroidx/room/RoomDatabase$closeBarrier$1;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1}, L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世苏哲兰;-><init>(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Landroidx/room/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪苏世哲兰:L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世苏哲兰;

    .line 15
    .line 16
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Landroidx/room/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪苏哲世兰:Ljava/lang/ThreadLocal;

    .line 22
    .line 23
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Landroidx/room/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪苏哲兰世:Ljava/util/LinkedHashMap;

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    iput-boolean v0, p0, Landroidx/room/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪苏兰世哲:Z

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰哲苏()L飘花落叶言子兰世哲楪苏/飘花落叶言子楪世苏兰哲;
    .locals 1

    .line 1
    iget-object p0, p0, Landroidx/room/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世兰苏哲:Landroidx/constraintlayout/core/widgets/analyzer/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p0, :cond_1

    .line 5
    .line 6
    iget-object p0, p0, Landroidx/constraintlayout/core/widgets/analyzer/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪世苏兰哲;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    const-string p0, "Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room."

    .line 14
    .line 15
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_1
    const-string p0, "connectionManager"

    .line 20
    .line 21
    invoke-static {p0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw v0
.end method

.method public final 飘花落叶言子楪世兰苏哲()Landroidx/room/飘花落叶言子楪苏哲世兰;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/room/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世兰哲苏:Landroidx/room/飘花落叶言子楪苏哲世兰;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "internalTracker"

    .line 7
    .line 8
    invoke-static {p0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public 飘花落叶言子楪世哲兰苏()Landroidx/recyclerview/widget/飘花落叶言子世哲兰苏楪;
    .locals 2

    .line 1
    new-instance p0, Lkotlin/NotImplementedError;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    invoke-direct {p0, v0, v1, v0}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/飘花落叶言子楪世哲苏兰;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public abstract 飘花落叶言子楪世哲苏兰()Landroidx/room/飘花落叶言子楪苏哲世兰;
.end method

.method public 飘花落叶言子楪世苏兰哲(Ljava/util/LinkedHashMap;)Ljava/util/List;
    .locals 2

    .line 1
    new-instance p0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/Map;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Lkotlin/collections/飘花落叶言子世楪苏兰哲;->飘花落叶言子世哲楪兰苏(I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-direct {p0, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Ljava/lang/Iterable;

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Ljava/util/Map$Entry;

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Lkotlin/reflect/飘花落叶言子楪世哲兰苏;

    .line 41
    .line 42
    invoke-static {v1}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰哲世(Lkotlin/reflect/飘花落叶言子楪世哲兰苏;)Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    sget-object p0, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 55
    .line 56
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰()V
    .locals 1

    .line 1
    iget-boolean p0, p0, Landroidx/room/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪苏世兰哲:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-ne p0, v0, :cond_1

    .line 19
    .line 20
    const/4 p0, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 p0, 0x0

    .line 23
    :goto_0
    if-nez p0, :cond_2

    .line 24
    .line 25
    :goto_1
    return-void

    .line 26
    :cond_2
    const-string p0, "Cannot access database on the main thread since it may potentially lock the UI for a long period of time."

    .line 27
    .line 28
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public 飘花落叶言子楪苏世兰哲()Ljava/util/LinkedHashMap;
    .locals 7

    .line 1
    invoke-static {}, Lkotlin/collections/飘花落叶言子世楪苏兰哲;->飘花落叶言子世苏兰哲楪()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/lang/Iterable;

    .line 10
    .line 11
    const/16 v0, 0xa

    .line 12
    .line 13
    invoke-static {p0, v0}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子苏世兰哲楪(Ljava/lang/Iterable;I)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-static {v1}, Lkotlin/collections/飘花落叶言子世楪苏兰哲;->飘花落叶言子世哲楪兰苏(I)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/16 v2, 0x10

    .line 22
    .line 23
    if-ge v1, v2, :cond_0

    .line 24
    .line 25
    move v1, v2

    .line 26
    :cond_0
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 27
    .line 28
    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Ljava/util/Map$Entry;

    .line 46
    .line 47
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    check-cast v3, Ljava/lang/Class;

    .line 52
    .line 53
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, Ljava/util/List;

    .line 58
    .line 59
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    sget-object v4, Lkotlin/jvm/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;

    .line 63
    .line 64
    invoke-virtual {v4, v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)Lkotlin/reflect/飘花落叶言子楪世哲兰苏;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    new-instance v4, Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-static {v1, v0}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子苏世兰哲楪(Ljava/lang/Iterable;I)I

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 75
    .line 76
    .line 77
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-eqz v5, :cond_1

    .line 86
    .line 87
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    check-cast v5, Ljava/lang/Class;

    .line 92
    .line 93
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    sget-object v6, Lkotlin/jvm/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;

    .line 97
    .line 98
    invoke-virtual {v6, v5}, Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)Lkotlin/reflect/飘花落叶言子楪世哲兰苏;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_1
    new-instance v1, Lkotlin/Pair;

    .line 107
    .line 108
    invoke-direct {v1, v3, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    invoke-virtual {v1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_2
    return-object v2
.end method

.method public 飘花落叶言子楪苏世哲兰()Ljava/util/Set;
    .locals 3

    .line 1
    sget-object p0, Lkotlin/collections/EmptySet;->INSTANCE:Lkotlin/collections/EmptySet;

    .line 2
    .line 3
    new-instance v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    const/16 v1, 0xa

    .line 6
    .line 7
    invoke-static {p0, v1}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子苏世兰哲楪(Ljava/lang/Iterable;I)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/lang/Class;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    sget-object v2, Lkotlin/jvm/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;

    .line 34
    .line 35
    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)Lkotlin/reflect/飘花落叶言子楪世哲兰苏;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-static {v0}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子兰世楪哲苏(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
.end method

.method public final 飘花落叶言子楪苏兰世哲()Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/room/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世兰苏哲:Landroidx/constraintlayout/core/widgets/analyzer/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/constraintlayout/core/widgets/analyzer/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪世苏哲兰;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪世苏哲兰;->isOpen()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0

    .line 18
    :cond_1
    const-string p0, "connectionManager"

    .line 19
    .line 20
    invoke-static {p0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    throw p0
.end method

.method public final 飘花落叶言子楪苏兰哲世(ZL飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/room/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世兰苏哲:Landroidx/constraintlayout/core/widgets/analyzer/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/constraintlayout/core/widgets/analyzer/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Landroidx/room/coroutines/飘花落叶言子楪世哲苏兰;

    .line 8
    .line 9
    invoke-interface {p0, p1, p2, p3}, Landroidx/room/coroutines/飘花落叶言子楪世哲苏兰;->飘花落叶言子世哲楪苏兰(ZL飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    const-string p0, "connectionManager"

    .line 15
    .line 16
    invoke-static {p0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    throw p0
.end method

.method public final 飘花落叶言子楪苏哲世兰()Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/room/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世兰苏哲:Landroidx/constraintlayout/core/widgets/analyzer/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/constraintlayout/core/widgets/analyzer/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪世苏兰哲;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0

    .line 15
    :cond_1
    const-string p0, "connectionManager"

    .line 16
    .line 17
    invoke-static {p0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    throw p0
.end method

.method public final 飘花落叶言子楪苏哲兰世()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/room/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪苏兰世哲()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/room/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世兰哲苏()L飘花落叶言子兰世哲楪苏/飘花落叶言子楪世苏兰哲;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-interface {p0}, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子苏世楪哲兰()L飘花落叶言子兰世哲楪苏/飘花落叶言子楪世苏哲兰;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {p0}, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世()Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0
.end method
