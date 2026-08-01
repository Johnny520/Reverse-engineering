.class public abstract Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Collector;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Collector"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Collector$ForRetransformation;,
        Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Collector$ForRedefinition;,
        Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Collector$PrependableIterator;
    }
.end annotation


# instance fields
.field protected final circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

.field private final descriptionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;

.field private final fallbackStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;

.field protected final listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

.field protected final locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

.field private final matcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

.field private final poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

.field protected final types:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Collector;->matcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Collector;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Collector;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Collector;->descriptionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;

    .line 11
    .line 12
    iput-object p5, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Collector;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    .line 13
    .line 14
    iput-object p6, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Collector;->fallbackStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;

    .line 15
    .line 16
    iput-object p7, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Collector;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    .line 17
    .line 18
    new-instance p1, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Collector;->types:Ljava/util/List;

    .line 24
    .line 25
    return-void
.end method

.method private doConsider(Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/Class;Lnet/bytebuddy/utility/JavaModule;Z)V
    .locals 7
    .param p5    # Ljava/lang/Class;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p6    # Lnet/bytebuddy/utility/JavaModule;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Lnet/bytebuddy/utility/JavaModule;",
            "Z)V"
        }
    .end annotation

    .line 1
    if-eqz p7, :cond_1

    .line 2
    .line 3
    invoke-virtual {p4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    invoke-virtual {p4}, Ljava/lang/Class;->getProtectionDomain()Ljava/security/ProtectionDomain;

    .line 8
    .line 9
    .line 10
    move-result-object v5

    .line 11
    move-object v0, p1

    .line 12
    move-object v1, p3

    .line 13
    move-object v4, p5

    .line 14
    move-object v3, p6

    .line 15
    invoke-interface/range {v0 .. v5}, Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;->matches(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Ljava/lang/Class;Ljava/security/ProtectionDomain;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Collector;->types:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {p0, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 29
    const/4 p1, 0x1

    .line 30
    :try_start_0
    invoke-static {p4}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->getName(Ljava/lang/Class;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {p4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    if-eqz p5, :cond_2

    .line 39
    .line 40
    move v4, p1

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    move v4, p0

    .line 43
    :goto_1
    invoke-interface {p2, v0, v2, p6, v4}, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;->onDiscovery(Ljava/lang/String;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Z)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    if-eqz p5, :cond_3

    .line 51
    .line 52
    move v2, p1

    .line 53
    goto :goto_2

    .line 54
    :cond_3
    move v2, p0

    .line 55
    :goto_2
    invoke-interface {p2, p3, v0, p6, v2}, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;->onIgnored(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    .line 58
    :try_start_1
    invoke-static {p4}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->getName(Ljava/lang/Class;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p3

    .line 62
    invoke-virtual {p4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 63
    .line 64
    .line 65
    move-result-object p4

    .line 66
    if-eqz p5, :cond_4

    .line 67
    .line 68
    :goto_3
    move p0, p1

    .line 69
    :cond_4
    invoke-interface {p2, p3, p4, p6, p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;->onComplete(Ljava/lang/String;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 70
    .line 71
    .line 72
    goto :goto_6

    .line 73
    :catchall_0
    move-exception v0

    .line 74
    move-object p3, v0

    .line 75
    move-object v6, p3

    .line 76
    :try_start_2
    invoke-static {p4}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->getName(Ljava/lang/Class;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-virtual {p4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    if-eqz p5, :cond_5

    .line 85
    .line 86
    move v5, p1

    .line 87
    :goto_4
    move-object v1, p2

    .line 88
    move-object v4, p6

    .line 89
    goto :goto_5

    .line 90
    :cond_5
    move v5, p0

    .line 91
    goto :goto_4

    .line 92
    :goto_5
    invoke-interface/range {v1 .. v6}, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;->onError(Ljava/lang/String;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;ZLjava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 93
    .line 94
    .line 95
    :try_start_3
    invoke-static {p4}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->getName(Ljava/lang/Class;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p3

    .line 99
    invoke-virtual {p4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 100
    .line 101
    .line 102
    move-result-object p4

    .line 103
    if-eqz p5, :cond_4

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :catchall_1
    move-exception v0

    .line 107
    move-object p3, v0

    .line 108
    invoke-static {p4}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->getName(Ljava/lang/Class;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {p4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 113
    .line 114
    .line 115
    move-result-object p4

    .line 116
    if-eqz p5, :cond_6

    .line 117
    .line 118
    move p0, p1

    .line 119
    :cond_6
    invoke-interface {p2, v0, p4, p6, p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;->onComplete(Ljava/lang/String;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Z)V

    .line 120
    .line 121
    .line 122
    throw p3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 123
    :catchall_2
    :goto_6
    return-void
.end method


# virtual methods
.method public apply(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;I)I
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Collector$PrependableIterator;

    .line 7
    .line 8
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Collector;->types:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {p2, v2}, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;->batch(Ljava/util/List;)Ljava/lang/Iterable;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-direct {v1, p2}, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Collector$PrependableIterator;-><init>(Ljava/lang/Iterable;)V

    .line 15
    .line 16
    .line 17
    :goto_0
    invoke-virtual {v1}, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Collector$PrependableIterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    if-eqz p2, :cond_0

    .line 22
    .line 23
    invoke-virtual {v1}, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Collector$PrependableIterator;->next()Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Collector;->types:Ljava/util/List;

    .line 28
    .line 29
    invoke-interface {p3, p4, p2, v2}, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;->onBatch(ILjava/util/List;Ljava/util/List;)V

    .line 30
    .line 31
    .line 32
    :try_start_0
    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Collector;->doApply(Ljava/lang/instrument/Instrumentation;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :catchall_0
    move-exception v2

    .line 37
    iget-object v3, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Collector;->types:Ljava/util/List;

    .line 38
    .line 39
    invoke-interface {p3, p4, p2, v2, v3}, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;->onError(ILjava/util/List;Ljava/lang/Throwable;Ljava/util/List;)Ljava/lang/Iterable;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v1, v3}, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Collector$PrependableIterator;->prepend(Ljava/lang/Iterable;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p2, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    :goto_1
    add-int/lit8 p4, p4, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Collector;->types:Ljava/util/List;

    .line 53
    .line 54
    invoke-interface {p3, p4, p0, v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;->onComplete(ILjava/util/List;Ljava/util/Map;)V

    .line 55
    .line 56
    .line 57
    return p4
.end method

.method public consider(Ljava/lang/Class;Z)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;Z)V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lnet/bytebuddy/utility/JavaModule;->ofType(Ljava/lang/Class;)Lnet/bytebuddy/utility/JavaModule;

    .line 2
    .line 3
    .line 4
    move-result-object v3

    .line 5
    :try_start_0
    iget-object v0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Collector;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    .line 6
    .line 7
    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Collector;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-interface {v1, v2, v3}, Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;->classFileLocator(Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;)Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-interface {v0, v1, v2}, Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;->typePool(Lnet/bytebuddy/dynamic/ClassFileLocator;Ljava/lang/ClassLoader;)Lnet/bytebuddy/pool/TypePool;

    .line 22
    .line 23
    .line 24
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_8

    .line 25
    :try_start_1
    iget-object v7, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Collector;->matcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    .line 26
    .line 27
    iget-object v8, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Collector;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    .line 28
    .line 29
    iget-object v0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Collector;->descriptionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 30
    .line 31
    move-object v6, v3

    .line 32
    move-object v3, v1

    .line 33
    :try_start_2
    invoke-static {p1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->getName(Ljava/lang/Class;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iget-object v4, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Collector;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 40
    .line 41
    .line 42
    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 43
    move-object v2, p1

    .line 44
    :try_start_3
    invoke-interface/range {v0 .. v6}, Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;->apply(Ljava/lang/String;Ljava/lang/Class;Lnet/bytebuddy/pool/TypePool;Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 45
    .line 46
    .line 47
    move-result-object v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 48
    move-object v5, v2

    .line 49
    move-object p1, v3

    .line 50
    move-object v3, v6

    .line 51
    move-object v6, v5

    .line 52
    move-object v1, p0

    .line 53
    move-object v2, v7

    .line 54
    move-object v7, v3

    .line 55
    move-object v3, v8

    .line 56
    move v8, p2

    .line 57
    :try_start_4
    invoke-direct/range {v1 .. v8}, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Collector;->doConsider(Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/Class;Lnet/bytebuddy/utility/JavaModule;Z)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 58
    .line 59
    .line 60
    goto/16 :goto_5

    .line 61
    .line 62
    :catchall_0
    move-exception v0

    .line 63
    move-object v3, v7

    .line 64
    :goto_0
    move-object p0, v0

    .line 65
    goto :goto_2

    .line 66
    :catchall_1
    move-exception v0

    .line 67
    move-object v1, p0

    .line 68
    move-object v5, v2

    .line 69
    :goto_1
    move-object p1, v3

    .line 70
    move-object v3, v6

    .line 71
    goto :goto_0

    .line 72
    :catchall_2
    move-exception v0

    .line 73
    move-object v1, p0

    .line 74
    move-object v5, p1

    .line 75
    goto :goto_1

    .line 76
    :catchall_3
    move-exception v0

    .line 77
    move-object v5, p1

    .line 78
    move-object p1, v1

    .line 79
    move-object v1, p0

    .line 80
    goto :goto_0

    .line 81
    :goto_2
    :try_start_5
    iget-object p2, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Collector;->descriptionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;

    .line 82
    .line 83
    invoke-interface {p2}, Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;->isLoadedFirst()Z

    .line 84
    .line 85
    .line 86
    move-result p2

    .line 87
    if-eqz p2, :cond_0

    .line 88
    .line 89
    iget-object p2, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Collector;->fallbackStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;

    .line 90
    .line 91
    invoke-interface {p2, v5, p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;->isFallback(Ljava/lang/Class;Ljava/lang/Throwable;)Z

    .line 92
    .line 93
    .line 94
    move-result p2

    .line 95
    if-eqz p2, :cond_0

    .line 96
    .line 97
    iget-object v2, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Collector;->matcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    .line 98
    .line 99
    move-object v6, v3

    .line 100
    :try_start_6
    iget-object v3, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Collector;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    .line 101
    .line 102
    invoke-static {v5}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->getName(Ljava/lang/Class;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-interface {p1, p0}, Lnet/bytebuddy/pool/TypePool;->describe(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-interface {p0}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 111
    .line 112
    .line 113
    move-result-object v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 114
    move-object v7, v6

    .line 115
    const/4 v6, 0x0

    .line 116
    const/4 v8, 0x1

    .line 117
    :try_start_7
    invoke-direct/range {v1 .. v8}, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Collector;->doConsider(Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/Class;Lnet/bytebuddy/utility/JavaModule;Z)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 118
    .line 119
    .line 120
    goto/16 :goto_5

    .line 121
    .line 122
    :catchall_4
    move-exception v0

    .line 123
    move-object p1, v1

    .line 124
    move-object p2, v5

    .line 125
    move-object v3, v7

    .line 126
    :goto_3
    move-object p0, v0

    .line 127
    move-object v5, p0

    .line 128
    goto :goto_4

    .line 129
    :catchall_5
    move-exception v0

    .line 130
    move-object p1, v1

    .line 131
    move-object p2, v5

    .line 132
    move-object v3, v6

    .line 133
    goto :goto_3

    .line 134
    :catchall_6
    move-exception v0

    .line 135
    move-object p1, v1

    .line 136
    move-object p2, v5

    .line 137
    goto :goto_3

    .line 138
    :cond_0
    move-object p1, v1

    .line 139
    move-object p2, v5

    .line 140
    :try_start_8
    throw p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 141
    :catchall_7
    move-exception v0

    .line 142
    goto :goto_3

    .line 143
    :catchall_8
    move-exception v0

    .line 144
    move-object p2, p1

    .line 145
    move-object p1, p0

    .line 146
    goto :goto_3

    .line 147
    :goto_4
    const/4 p0, 0x1

    .line 148
    :try_start_9
    iget-object v0, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Collector;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    .line 149
    .line 150
    invoke-static {p2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->getName(Ljava/lang/Class;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-virtual {p2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    invoke-interface {v0, v1, v2, v3, p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;->onDiscovery(Ljava/lang/String;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Z)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_a

    .line 159
    .line 160
    .line 161
    :try_start_a
    iget-object v0, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Collector;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    .line 162
    .line 163
    invoke-static {p2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->getName(Ljava/lang/Class;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-virtual {p2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    const/4 v4, 0x1

    .line 172
    invoke-interface/range {v0 .. v5}, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;->onError(Ljava/lang/String;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;ZLjava/lang/Throwable;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_9

    .line 173
    .line 174
    .line 175
    :try_start_b
    iget-object p1, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Collector;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    .line 176
    .line 177
    invoke-static {p2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->getName(Ljava/lang/Class;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-virtual {p2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 182
    .line 183
    .line 184
    move-result-object p2

    .line 185
    invoke-interface {p1, v0, p2, v3, p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;->onComplete(Ljava/lang/String;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Z)V

    .line 186
    .line 187
    .line 188
    goto :goto_5

    .line 189
    :catchall_9
    move-exception v0

    .line 190
    iget-object p1, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Collector;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    .line 191
    .line 192
    invoke-static {p2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->getName(Ljava/lang/Class;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    invoke-virtual {p2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 197
    .line 198
    .line 199
    move-result-object p2

    .line 200
    invoke-interface {p1, v1, p2, v3, p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;->onComplete(Ljava/lang/String;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Z)V

    .line 201
    .line 202
    .line 203
    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_c

    .line 204
    :catchall_a
    move-exception v0

    .line 205
    move-object v6, v0

    .line 206
    :try_start_c
    iget-object v0, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Collector;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    .line 207
    .line 208
    invoke-static {p2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->getName(Ljava/lang/Class;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    invoke-virtual {p2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    const/4 v4, 0x1

    .line 217
    invoke-interface/range {v0 .. v5}, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;->onError(Ljava/lang/String;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;ZLjava/lang/Throwable;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_b

    .line 218
    .line 219
    .line 220
    :try_start_d
    iget-object p1, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Collector;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    .line 221
    .line 222
    invoke-static {p2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->getName(Ljava/lang/Class;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-virtual {p2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 227
    .line 228
    .line 229
    move-result-object p2

    .line 230
    invoke-interface {p1, v0, p2, v3, p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;->onComplete(Ljava/lang/String;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Z)V

    .line 231
    .line 232
    .line 233
    throw v6

    .line 234
    :catchall_b
    move-exception v0

    .line 235
    iget-object p1, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Collector;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    .line 236
    .line 237
    invoke-static {p2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->getName(Ljava/lang/Class;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    invoke-virtual {p2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 242
    .line 243
    .line 244
    move-result-object p2

    .line 245
    invoke-interface {p1, v1, p2, v3, p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;->onComplete(Ljava/lang/String;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Z)V

    .line 246
    .line 247
    .line 248
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_c

    .line 249
    :catchall_c
    :goto_5
    return-void
.end method

.method public abstract doApply(Ljava/lang/instrument/Instrumentation;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/instrument/Instrumentation;",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;)V"
        }
    .end annotation
.end method
