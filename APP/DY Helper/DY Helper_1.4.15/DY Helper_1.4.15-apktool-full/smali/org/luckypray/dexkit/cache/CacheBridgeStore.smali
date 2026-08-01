.class public final Lorg/luckypray/dexkit/cache/CacheBridgeStore;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;,
        Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome;,
        Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;,
        Lorg/luckypray/dexkit/cache/CacheBridgeStore$WhenMappings;
    }
.end annotation


# static fields
.field private static final CACHE_NON_UNIQUE:Ljava/lang/String; = "CACHE_NON_UNIQUE"

.field private static final CACHE_NO_RESULT:Ljava/lang/String; = "CACHE_NO_RESULT"

.field public static final INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeStore;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/cache/CacheBridgeStore;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/luckypray/dexkit/cache/CacheBridgeStore;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeStore;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic getCachedList$default(Lorg/luckypray/dexkit/cache/CacheBridgeStore;Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;Ljava/util/concurrent/locks/ReentrantReadWriteLock;Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;Ljava/lang/String;ZLp70;Lp70;ILjava/lang/Object;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;
    .locals 9

    .line 1
    and-int/lit8 v0, p8, 0x40

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    move-object v8, v0

    .line 7
    :goto_0
    move-object v1, p0

    .line 8
    move-object v2, p1

    .line 9
    move-object v3, p2

    .line 10
    move-object v4, p3

    .line 11
    move-object v5, p4

    .line 12
    move v6, p5

    .line 13
    move-object v7, p6

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    move-object/from16 v8, p7

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :goto_1
    invoke-virtual/range {v1 .. v8}, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->getCachedList(Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;Ljava/util/concurrent/locks/ReentrantReadWriteLock;Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;Ljava/lang/String;ZLp70;Lp70;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method private static final getCachedList$innerGet$10(Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;Ljava/lang/String;Z)Lfo1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<U::",
            "Lorg/luckypray/dexkit/wrap/ISerializable;",
            ">(",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;",
            "Ljava/lang/String;",
            "Z)",
            "Lfo1;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, p1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;->getStringList(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    if-eqz p0, :cond_2

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    const/16 v1, 0xa

    .line 11
    .line 12
    invoke-static {p0, v1}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Ljava/lang/String;

    .line 34
    .line 35
    sget-object v2, Lorg/luckypray/dexkit/wrap/ISerializable;->Companion:Lorg/luckypray/dexkit/wrap/ISerializable$Companion;

    .line 36
    .line 37
    invoke-virtual {v2, v1}, Lorg/luckypray/dexkit/wrap/ISerializable$Companion;->deserializeAs(Ljava/lang/String;)Lorg/luckypray/dexkit/wrap/ISerializable;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    if-eqz p0, :cond_1

    .line 50
    .line 51
    if-nez p2, :cond_1

    .line 52
    .line 53
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string p2, "cached empty for key: "

    .line 56
    .line 57
    const-string v0, " but empty not allowed"

    .line 58
    .line 59
    invoke-static {p2, p1, v0}, Llz1;->Δ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    new-instance p1, Leo1;

    .line 67
    .line 68
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    new-instance p0, Lfo1;

    .line 72
    .line 73
    invoke-direct {p0, p1}, Lfo1;-><init>(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    return-object p0

    .line 77
    :cond_1
    new-instance p0, Lfo1;

    .line 78
    .line 79
    invoke-direct {p0, v0}, Lfo1;-><init>(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    return-object p0

    .line 83
    :cond_2
    return-object v0
.end method

.method public static synthetic getCachedMap$default(Lorg/luckypray/dexkit/cache/CacheBridgeStore;Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;Ljava/util/concurrent/locks/ReentrantReadWriteLock;Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;Ljava/lang/String;Lp70;Lp70;ILjava/lang/Object;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;
    .locals 7

    .line 1
    and-int/lit8 p7, p7, 0x20

    .line 2
    .line 3
    if-eqz p7, :cond_0

    .line 4
    .line 5
    const/4 p6, 0x0

    .line 6
    :cond_0
    move-object v0, p0

    .line 7
    move-object v1, p1

    .line 8
    move-object v2, p2

    .line 9
    move-object v3, p3

    .line 10
    move-object v4, p4

    .line 11
    move-object v5, p5

    .line 12
    move-object v6, p6

    .line 13
    invoke-virtual/range {v0 .. v6}, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->getCachedMap(Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;Ljava/util/concurrent/locks/ReentrantReadWriteLock;Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;Ljava/lang/String;Lp70;Lp70;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method private static final getCachedMap$innerGetMap(Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;Ljava/lang/String;)Ljava/util/Map;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<U::",
            "Lorg/luckypray/dexkit/wrap/ISerializable;",
            ">(",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "TU;>;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeKeys;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->mapGroupsKey(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-interface {p0, v0, v1}, Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;->getStringList(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_2

    .line 15
    :cond_0
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-direct {v2, v3}, Ljava/util/LinkedHashSet;-><init>(I)V

    .line 22
    .line 23
    .line 24
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    invoke-direct {v3, v4}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 31
    .line 32
    .line 33
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_5

    .line 42
    .line 43
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    check-cast v4, Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v2, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-nez v5, :cond_1

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_1
    sget-object v5, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeKeys;

    .line 57
    .line 58
    invoke-virtual {v5, p1, v4}, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->mapGroupKey(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    invoke-interface {p0, v5, v1}, Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;->getStringList(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    if-nez v5, :cond_2

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_2
    :try_start_0
    new-instance v6, Ljava/util/ArrayList;

    .line 70
    .line 71
    const/16 v7, 0xa

    .line 72
    .line 73
    invoke-static {v5, v7}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 74
    .line 75
    .line 76
    move-result v7

    .line 77
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 78
    .line 79
    .line 80
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    if-eqz v7, :cond_3

    .line 89
    .line 90
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    check-cast v7, Ljava/lang/String;

    .line 95
    .line 96
    sget-object v8, Lorg/luckypray/dexkit/wrap/ISerializable;->Companion:Lorg/luckypray/dexkit/wrap/ISerializable$Companion;

    .line 97
    .line 98
    invoke-virtual {v8, v7}, Lorg/luckypray/dexkit/wrap/ISerializable$Companion;->deserializeAs(Ljava/lang/String;)Lorg/luckypray/dexkit/wrap/ISerializable;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :catchall_0
    move-exception v5

    .line 107
    new-instance v6, Leo1;

    .line 108
    .line 109
    invoke-direct {v6, v5}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 110
    .line 111
    .line 112
    :cond_3
    invoke-static {v6}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    if-nez v5, :cond_4

    .line 117
    .line 118
    check-cast v6, Ljava/util/List;

    .line 119
    .line 120
    invoke-interface {v3, v4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_4
    :goto_2
    return-object v1

    .line 125
    :cond_5
    return-object v3
.end method

.method public static synthetic getCachedSingle$default(Lorg/luckypray/dexkit/cache/CacheBridgeStore;Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;Ljava/util/concurrent/locks/ReentrantReadWriteLock;Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;Ljava/lang/String;Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;ZLp70;Lp70;ILjava/lang/Object;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;
    .locals 10

    .line 1
    move/from16 v0, p9

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0x80

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    move-object v9, v0

    .line 9
    :goto_0
    move-object v1, p0

    .line 10
    move-object v2, p1

    .line 11
    move-object v3, p2

    .line 12
    move-object v4, p3

    .line 13
    move-object v5, p4

    .line 14
    move-object v6, p5

    .line 15
    move/from16 v7, p6

    .line 16
    .line 17
    move-object/from16 v8, p7

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    move-object/from16 v9, p8

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :goto_1
    invoke-virtual/range {v1 .. v9}, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->getCachedSingle(Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;Ljava/util/concurrent/locks/ReentrantReadWriteLock;Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;Ljava/lang/String;Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;ZLp70;Lp70;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method private static final getCachedSingle$innerGet(Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;Ljava/lang/String;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<U::",
            "Lorg/luckypray/dexkit/wrap/ISerializable;",
            ">(",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;",
            "Ljava/lang/String;",
            ")",
            "Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome<",
            "TU;>;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, p1, v0}, Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    sget-object p1, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeStore;

    .line 9
    .line 10
    invoke-direct {p1, p0}, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->parseSingleOutcome(Ljava/lang/String;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :cond_0
    return-object v0
.end method

.method private final parseSingleOutcome(Ljava/lang/String;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lorg/luckypray/dexkit/wrap/ISerializable;",
            ">(",
            "Ljava/lang/String;",
            ")",
            "Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome<",
            "TT;>;"
        }
    .end annotation

    .line 1
    const-string p0, "CACHE_NO_RESULT"

    .line 2
    .line 3
    invoke-static {p1, p0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const/4 v0, 0x1

    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    new-instance p0, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NoResult;

    .line 12
    .line 13
    invoke-direct {p0, v1, v0, v1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NoResult;-><init>(Lorg/luckypray/dexkit/exceptions/NoResultException;ILzq;)V

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    const-string p0, "CACHE_NON_UNIQUE"

    .line 18
    .line 19
    invoke-static {p1, p0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_1

    .line 24
    .line 25
    new-instance p0, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NonUnique;

    .line 26
    .line 27
    invoke-direct {p0, v1, v0, v1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NonUnique;-><init>(Lorg/luckypray/dexkit/exceptions/NonUniqueResultException;ILzq;)V

    .line 28
    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_1
    new-instance p0, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$Value;

    .line 32
    .line 33
    sget-object v0, Lorg/luckypray/dexkit/wrap/ISerializable;->Companion:Lorg/luckypray/dexkit/wrap/ISerializable$Companion;

    .line 34
    .line 35
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/wrap/ISerializable$Companion;->deserializeAs(Ljava/lang/String;)Lorg/luckypray/dexkit/wrap/ISerializable;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$Value;-><init>(Lorg/luckypray/dexkit/wrap/ISerializable;)V

    .line 43
    .line 44
    .line 45
    return-object p0
.end method

.method private final resolveSingleOutcome-gIAlu-s(Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome;Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lorg/luckypray/dexkit/wrap/ISerializable;",
            ">(",
            "Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome<",
            "+TT;>;",
            "Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of p0, p1, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$Value;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$Value;

    .line 6
    .line 7
    invoke-virtual {p1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$Value;->getValue()Lorg/luckypray/dexkit/wrap/ISerializable;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    instance-of p0, p1, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NoResult;

    .line 13
    .line 14
    const/4 v0, 0x2

    .line 15
    const/4 v1, 0x1

    .line 16
    if-eqz p0, :cond_2

    .line 17
    .line 18
    sget-object p0, Lorg/luckypray/dexkit/cache/CacheBridgeStore$WhenMappings;->$EnumSwitchMapping$1:[I

    .line 19
    .line 20
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    aget p0, p0, p2

    .line 25
    .line 26
    if-eq p0, v1, :cond_4

    .line 27
    .line 28
    if-ne p0, v0, :cond_1

    .line 29
    .line 30
    check-cast p1, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NoResult;

    .line 31
    .line 32
    invoke-virtual {p1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NoResult;->getException()Lorg/luckypray/dexkit/exceptions/NoResultException;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {p0}, Li81;->κ(Ljava/lang/Throwable;)Leo1;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :cond_1
    invoke-static {}, Lγ;->κ()V

    .line 42
    .line 43
    .line 44
    const/4 p0, 0x0

    .line 45
    return-object p0

    .line 46
    :cond_2
    instance-of p0, p1, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NonUnique;

    .line 47
    .line 48
    if-eqz p0, :cond_5

    .line 49
    .line 50
    sget-object p0, Lorg/luckypray/dexkit/cache/CacheBridgeStore$WhenMappings;->$EnumSwitchMapping$1:[I

    .line 51
    .line 52
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    aget p0, p0, p2

    .line 57
    .line 58
    if-eq p0, v1, :cond_4

    .line 59
    .line 60
    if-ne p0, v0, :cond_3

    .line 61
    .line 62
    check-cast p1, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NonUnique;

    .line 63
    .line 64
    invoke-virtual {p1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NonUnique;->getException()Lorg/luckypray/dexkit/exceptions/NonUniqueResultException;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-static {p0}, Li81;->κ(Ljava/lang/Throwable;)Leo1;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0

    .line 73
    :cond_3
    invoke-static {}, Lγ;->κ()V

    .line 74
    .line 75
    .line 76
    const/4 p0, 0x0

    .line 77
    return-object p0

    .line 78
    :cond_4
    const/4 p0, 0x0

    .line 79
    return-object p0

    .line 80
    :cond_5
    invoke-static {}, Lγ;->κ()V

    .line 81
    .line 82
    .line 83
    const/4 p0, 0x0

    .line 84
    return-object p0
.end method


# virtual methods
.method public final getCachedList(Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;Ljava/util/concurrent/locks/ReentrantReadWriteLock;Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;Ljava/lang/String;ZLp70;Lp70;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lorg/luckypray/dexkit/wrap/ISerializable;",
            ">(",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;",
            "Ljava/util/concurrent/locks/ReentrantReadWriteLock;",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;",
            "Ljava/lang/String;",
            "Z",
            "Lp70;",
            "Lp70;",
            ")",
            "Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult<",
            "Ljava/util/List<",
            "TT;>;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-interface {p6}, Lp70;->invoke()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 24
    .line 25
    .line 26
    :try_start_0
    invoke-static {p1, p4, p5}, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->getCachedList$innerGet$10(Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;Ljava/lang/String;Z)Lfo1;

    .line 27
    .line 28
    .line 29
    move-result-object p6

    .line 30
    if-eqz p6, :cond_0

    .line 31
    .line 32
    iget-object p1, p6, Lfo1;->ε:Ljava/lang/Object;

    .line 33
    .line 34
    new-instance p2, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;

    .line 35
    .line 36
    sget-object p3, Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;->CACHE:Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;

    .line 37
    .line 38
    invoke-direct {p2, p3, p1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;-><init>(Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 42
    .line 43
    .line 44
    return-object p2

    .line 45
    :catchall_0
    move-exception p1

    .line 46
    goto/16 :goto_8

    .line 47
    .line 48
    :cond_0
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 49
    .line 50
    .line 51
    if-nez p7, :cond_1

    .line 52
    .line 53
    new-instance p0, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;

    .line 54
    .line 55
    sget-object p1, Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;->CACHE:Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;

    .line 56
    .line 57
    new-instance p2, Ljava/util/NoSuchElementException;

    .line 58
    .line 59
    const-string p3, "no found cache for key: "

    .line 60
    .line 61
    invoke-virtual {p3, p4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p3

    .line 65
    invoke-direct {p2, p3}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    new-instance p3, Leo1;

    .line 69
    .line 70
    invoke-direct {p3, p2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    invoke-direct {p0, p1, p3}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;-><init>(Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    return-object p0

    .line 77
    :cond_1
    :try_start_1
    invoke-interface {p7}, Lp70;->invoke()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    check-cast p0, Ljava/util/List;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :catchall_1
    move-exception p0

    .line 85
    new-instance p6, Leo1;

    .line 86
    .line 87
    invoke-direct {p6, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 88
    .line 89
    .line 90
    move-object p0, p6

    .line 91
    :goto_0
    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    .line 92
    .line 93
    .line 94
    move-result-object p6

    .line 95
    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->getWriteHoldCount()I

    .line 96
    .line 97
    .line 98
    move-result p7

    .line 99
    const/4 v0, 0x0

    .line 100
    if-nez p7, :cond_2

    .line 101
    .line 102
    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->getReadHoldCount()I

    .line 103
    .line 104
    .line 105
    move-result p7

    .line 106
    goto :goto_1

    .line 107
    :cond_2
    move p7, v0

    .line 108
    :goto_1
    move v1, v0

    .line 109
    :goto_2
    if-ge v1, p7, :cond_3

    .line 110
    .line 111
    invoke-virtual {p6}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 112
    .line 113
    .line 114
    add-int/lit8 v1, v1, 0x1

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_3
    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V

    .line 122
    .line 123
    .line 124
    :try_start_2
    invoke-static {p1, p4, p5}, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->getCachedList$innerGet$10(Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;Ljava/lang/String;Z)Lfo1;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    if-eqz v1, :cond_5

    .line 129
    .line 130
    iget-object p0, v1, Lfo1;->ε:Ljava/lang/Object;

    .line 131
    .line 132
    new-instance p1, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;

    .line 133
    .line 134
    sget-object p3, Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;->CACHE:Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;

    .line 135
    .line 136
    invoke-direct {p1, p3, p0}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;-><init>(Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 137
    .line 138
    .line 139
    :goto_3
    if-ge v0, p7, :cond_4

    .line 140
    .line 141
    invoke-virtual {p6}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 142
    .line 143
    .line 144
    add-int/lit8 v0, v0, 0x1

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_4
    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 148
    .line 149
    .line 150
    return-object p1

    .line 151
    :cond_5
    :try_start_3
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;->QUERY:Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;

    .line 152
    .line 153
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    if-nez v2, :cond_8

    .line 158
    .line 159
    check-cast p0, Ljava/util/List;

    .line 160
    .line 161
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    if-eqz v2, :cond_6

    .line 166
    .line 167
    if-nez p5, :cond_6

    .line 168
    .line 169
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 170
    .line 171
    new-instance p1, Ljava/lang/StringBuilder;

    .line 172
    .line 173
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 174
    .line 175
    .line 176
    const-string p3, "query returned empty for key: "

    .line 177
    .line 178
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    const-string p3, " but empty not allowed"

    .line 185
    .line 186
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    new-instance p1, Leo1;

    .line 197
    .line 198
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 199
    .line 200
    .line 201
    move-object p0, p1

    .line 202
    goto :goto_5

    .line 203
    :catchall_2
    move-exception p0

    .line 204
    goto :goto_7

    .line 205
    :cond_6
    invoke-virtual {p3}, Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;->getCacheSuccess()Z

    .line 206
    .line 207
    .line 208
    move-result p3

    .line 209
    if-eqz p3, :cond_9

    .line 210
    .line 211
    new-instance p3, Ljava/util/ArrayList;

    .line 212
    .line 213
    const/16 p5, 0xa

    .line 214
    .line 215
    invoke-static {p0, p5}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 216
    .line 217
    .line 218
    move-result p5

    .line 219
    invoke-direct {p3, p5}, Ljava/util/ArrayList;-><init>(I)V

    .line 220
    .line 221
    .line 222
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 223
    .line 224
    .line 225
    move-result-object p5

    .line 226
    :goto_4
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    .line 227
    .line 228
    .line 229
    move-result v2

    .line 230
    if-eqz v2, :cond_7

    .line 231
    .line 232
    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    check-cast v2, Lorg/luckypray/dexkit/wrap/ISerializable;

    .line 237
    .line 238
    invoke-interface {v2}, Lorg/luckypray/dexkit/wrap/ISerializable;->serialize()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    invoke-virtual {p3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    goto :goto_4

    .line 246
    :cond_7
    invoke-interface {p1, p4, p3}, Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;->putStringList(Ljava/lang/String;Ljava/util/List;)V

    .line 247
    .line 248
    .line 249
    goto :goto_5

    .line 250
    :cond_8
    new-instance p0, Leo1;

    .line 251
    .line 252
    invoke-direct {p0, v2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 253
    .line 254
    .line 255
    :cond_9
    :goto_5
    new-instance p1, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;

    .line 256
    .line 257
    invoke-direct {p1, v1, p0}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;-><init>(Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 258
    .line 259
    .line 260
    :goto_6
    if-ge v0, p7, :cond_a

    .line 261
    .line 262
    invoke-virtual {p6}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 263
    .line 264
    .line 265
    add-int/lit8 v0, v0, 0x1

    .line 266
    .line 267
    goto :goto_6

    .line 268
    :cond_a
    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 269
    .line 270
    .line 271
    return-object p1

    .line 272
    :goto_7
    if-ge v0, p7, :cond_b

    .line 273
    .line 274
    invoke-virtual {p6}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 275
    .line 276
    .line 277
    add-int/lit8 v0, v0, 0x1

    .line 278
    .line 279
    goto :goto_7

    .line 280
    :cond_b
    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 281
    .line 282
    .line 283
    throw p0

    .line 284
    :goto_8
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 285
    .line 286
    .line 287
    throw p1
.end method

.method public final getCachedMap(Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;Ljava/util/concurrent/locks/ReentrantReadWriteLock;Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;Ljava/lang/String;Lp70;Lp70;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lorg/luckypray/dexkit/wrap/ISerializable;",
            ">(",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;",
            "Ljava/util/concurrent/locks/ReentrantReadWriteLock;",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;",
            "Ljava/lang/String;",
            "Lp70;",
            "Lp70;",
            ")",
            "Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "TT;>;>;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-interface {p5}, Lp70;->invoke()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 24
    .line 25
    .line 26
    :try_start_0
    invoke-static {p1, p4}, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->getCachedMap$innerGetMap(Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;Ljava/lang/String;)Ljava/util/Map;

    .line 27
    .line 28
    .line 29
    move-result-object p5

    .line 30
    if-eqz p5, :cond_0

    .line 31
    .line 32
    new-instance p1, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;

    .line 33
    .line 34
    sget-object p2, Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;->CACHE:Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;

    .line 35
    .line 36
    invoke-direct {p1, p2, p5}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;-><init>(Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 40
    .line 41
    .line 42
    return-object p1

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    goto/16 :goto_d

    .line 45
    .line 46
    :cond_0
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 47
    .line 48
    .line 49
    if-nez p6, :cond_1

    .line 50
    .line 51
    new-instance p0, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;

    .line 52
    .line 53
    sget-object p1, Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;->CACHE:Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;

    .line 54
    .line 55
    new-instance p2, Ljava/util/NoSuchElementException;

    .line 56
    .line 57
    const-string p3, "no found cache for key: "

    .line 58
    .line 59
    invoke-virtual {p3, p4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p3

    .line 63
    invoke-direct {p2, p3}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    new-instance p3, Leo1;

    .line 67
    .line 68
    invoke-direct {p3, p2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    invoke-direct {p0, p1, p3}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;-><init>(Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    return-object p0

    .line 75
    :cond_1
    :try_start_1
    invoke-interface {p6}, Lp70;->invoke()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    check-cast p0, Ljava/util/Map;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :catchall_1
    move-exception p0

    .line 83
    new-instance p5, Leo1;

    .line 84
    .line 85
    invoke-direct {p5, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    move-object p0, p5

    .line 89
    :goto_0
    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    .line 90
    .line 91
    .line 92
    move-result-object p5

    .line 93
    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->getWriteHoldCount()I

    .line 94
    .line 95
    .line 96
    move-result p6

    .line 97
    const/4 v0, 0x0

    .line 98
    if-nez p6, :cond_2

    .line 99
    .line 100
    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->getReadHoldCount()I

    .line 101
    .line 102
    .line 103
    move-result p6

    .line 104
    goto :goto_1

    .line 105
    :cond_2
    move p6, v0

    .line 106
    :goto_1
    move v1, v0

    .line 107
    :goto_2
    if-ge v1, p6, :cond_3

    .line 108
    .line 109
    invoke-virtual {p5}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 110
    .line 111
    .line 112
    add-int/lit8 v1, v1, 0x1

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_3
    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V

    .line 120
    .line 121
    .line 122
    :try_start_2
    invoke-static {p1, p4}, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->getCachedMap$innerGetMap(Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;Ljava/lang/String;)Ljava/util/Map;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    if-eqz v1, :cond_5

    .line 127
    .line 128
    new-instance p0, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;

    .line 129
    .line 130
    sget-object p1, Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;->CACHE:Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;

    .line 131
    .line 132
    invoke-direct {p0, p1, v1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;-><init>(Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 133
    .line 134
    .line 135
    :goto_3
    if-ge v0, p6, :cond_4

    .line 136
    .line 137
    invoke-virtual {p5}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 138
    .line 139
    .line 140
    add-int/lit8 v0, v0, 0x1

    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_4
    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 144
    .line 145
    .line 146
    return-object p0

    .line 147
    :cond_5
    :try_start_3
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;->QUERY:Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;

    .line 148
    .line 149
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    if-nez v2, :cond_e

    .line 154
    .line 155
    check-cast p0, Ljava/util/Map;

    .line 156
    .line 157
    sget-object v2, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeKeys;

    .line 158
    .line 159
    invoke-virtual {v2, p4}, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->mapGroupsKey(Ljava/lang/String;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    const/4 v3, 0x0

    .line 164
    invoke-interface {p1, v2, v3}, Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;->getStringList(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    if-nez v2, :cond_6

    .line 169
    .line 170
    sget-object v2, Ljz;->ε:Ljz;

    .line 171
    .line 172
    :cond_6
    new-instance v3, Ljava/util/ArrayList;

    .line 173
    .line 174
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 175
    .line 176
    .line 177
    invoke-virtual {p3}, Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;->getCacheSuccess()Z

    .line 178
    .line 179
    .line 180
    move-result p3

    .line 181
    if-eqz p3, :cond_f

    .line 182
    .line 183
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 184
    .line 185
    .line 186
    move-result-object p3

    .line 187
    check-cast p3, Ljava/lang/Iterable;

    .line 188
    .line 189
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 190
    .line 191
    .line 192
    move-result-object p3

    .line 193
    :goto_4
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 194
    .line 195
    .line 196
    move-result v4

    .line 197
    if-eqz v4, :cond_8

    .line 198
    .line 199
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    check-cast v4, Ljava/util/Map$Entry;

    .line 204
    .line 205
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v5

    .line 209
    check-cast v5, Ljava/lang/String;

    .line 210
    .line 211
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    check-cast v4, Ljava/util/List;

    .line 216
    .line 217
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    sget-object v6, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeKeys;

    .line 221
    .line 222
    invoke-virtual {v6, p4, v5}, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->mapGroupKey(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v5

    .line 226
    new-instance v6, Ljava/util/ArrayList;

    .line 227
    .line 228
    const/16 v7, 0xa

    .line 229
    .line 230
    invoke-static {v4, v7}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 231
    .line 232
    .line 233
    move-result v7

    .line 234
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 235
    .line 236
    .line 237
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 238
    .line 239
    .line 240
    move-result-object v4

    .line 241
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 242
    .line 243
    .line 244
    move-result v7

    .line 245
    if-eqz v7, :cond_7

    .line 246
    .line 247
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v7

    .line 251
    check-cast v7, Lorg/luckypray/dexkit/wrap/ISerializable;

    .line 252
    .line 253
    invoke-interface {v7}, Lorg/luckypray/dexkit/wrap/ISerializable;->serialize()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v7

    .line 257
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    goto :goto_5

    .line 261
    :cond_7
    invoke-interface {p1, v5, v6}, Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;->putStringList(Ljava/lang/String;Ljava/util/List;)V

    .line 262
    .line 263
    .line 264
    goto :goto_4

    .line 265
    :cond_8
    invoke-static {v3}, Lxh;->ｊ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 266
    .line 267
    .line 268
    move-result-object p3

    .line 269
    check-cast p3, Ljava/lang/Iterable;

    .line 270
    .line 271
    instance-of v4, p3, Ljava/util/Collection;

    .line 272
    .line 273
    if-eqz v4, :cond_9

    .line 274
    .line 275
    check-cast p3, Ljava/util/Collection;

    .line 276
    .line 277
    goto :goto_6

    .line 278
    :cond_9
    invoke-static {p3}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 279
    .line 280
    .line 281
    move-result-object p3

    .line 282
    :goto_6
    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    .line 283
    .line 284
    .line 285
    move-result v4

    .line 286
    if-eqz v4, :cond_a

    .line 287
    .line 288
    invoke-static {v2}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 289
    .line 290
    .line 291
    move-result-object p3

    .line 292
    goto :goto_8

    .line 293
    :cond_a
    new-instance v4, Ljava/util/ArrayList;

    .line 294
    .line 295
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 296
    .line 297
    .line 298
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    :cond_b
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 303
    .line 304
    .line 305
    move-result v5

    .line 306
    if-eqz v5, :cond_c

    .line 307
    .line 308
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v5

    .line 312
    invoke-interface {p3, v5}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result v6

    .line 316
    if-nez v6, :cond_b

    .line 317
    .line 318
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    goto :goto_7

    .line 322
    :catchall_2
    move-exception p0

    .line 323
    goto :goto_c

    .line 324
    :cond_c
    move-object p3, v4

    .line 325
    :goto_8
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 326
    .line 327
    .line 328
    move-result-object p3

    .line 329
    :goto_9
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 330
    .line 331
    .line 332
    move-result v2

    .line 333
    if-eqz v2, :cond_d

    .line 334
    .line 335
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    check-cast v2, Ljava/lang/String;

    .line 340
    .line 341
    sget-object v4, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeKeys;

    .line 342
    .line 343
    invoke-virtual {v4, p4, v2}, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->mapGroupKey(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v2

    .line 347
    invoke-interface {p1, v2}, Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;->remove(Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    goto :goto_9

    .line 351
    :cond_d
    sget-object p3, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeKeys;

    .line 352
    .line 353
    invoke-virtual {p3, p4}, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->mapGroupsKey(Ljava/lang/String;)Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object p3

    .line 357
    invoke-interface {p1, p3, v3}, Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;->putStringList(Ljava/lang/String;Ljava/util/List;)V

    .line 358
    .line 359
    .line 360
    goto :goto_a

    .line 361
    :cond_e
    new-instance p0, Leo1;

    .line 362
    .line 363
    invoke-direct {p0, v2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 364
    .line 365
    .line 366
    :cond_f
    :goto_a
    new-instance p1, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;

    .line 367
    .line 368
    invoke-direct {p1, v1, p0}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;-><init>(Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 369
    .line 370
    .line 371
    :goto_b
    if-ge v0, p6, :cond_10

    .line 372
    .line 373
    invoke-virtual {p5}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 374
    .line 375
    .line 376
    add-int/lit8 v0, v0, 0x1

    .line 377
    .line 378
    goto :goto_b

    .line 379
    :cond_10
    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 380
    .line 381
    .line 382
    return-object p1

    .line 383
    :goto_c
    if-ge v0, p6, :cond_11

    .line 384
    .line 385
    invoke-virtual {p5}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 386
    .line 387
    .line 388
    add-int/lit8 v0, v0, 0x1

    .line 389
    .line 390
    goto :goto_c

    .line 391
    :cond_11
    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 392
    .line 393
    .line 394
    throw p0

    .line 395
    :goto_d
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 396
    .line 397
    .line 398
    throw p1
.end method

.method public final getCachedSingle(Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;Ljava/util/concurrent/locks/ReentrantReadWriteLock;Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;Ljava/lang/String;Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;ZLp70;Lp70;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lorg/luckypray/dexkit/wrap/ISerializable;",
            ">(",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;",
            "Ljava/util/concurrent/locks/ReentrantReadWriteLock;",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;",
            "Z",
            "Lp70;",
            "Lp70;",
            ")",
            "Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-interface {p7}, Lp70;->invoke()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 27
    .line 28
    .line 29
    :try_start_0
    invoke-static {p1, p4}, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->getCachedSingle$innerGet(Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;Ljava/lang/String;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome;

    .line 30
    .line 31
    .line 32
    move-result-object p7

    .line 33
    if-eqz p7, :cond_0

    .line 34
    .line 35
    new-instance p1, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;

    .line 36
    .line 37
    sget-object p2, Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;->CACHE:Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;

    .line 38
    .line 39
    sget-object p3, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeStore;

    .line 40
    .line 41
    invoke-direct {p3, p7, p5}, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->resolveSingleOutcome-gIAlu-s(Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome;Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p3

    .line 45
    invoke-direct {p1, p2, p3}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;-><init>(Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 49
    .line 50
    .line 51
    return-object p1

    .line 52
    :catchall_0
    move-exception p1

    .line 53
    goto/16 :goto_8

    .line 54
    .line 55
    :cond_0
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 56
    .line 57
    .line 58
    if-nez p8, :cond_1

    .line 59
    .line 60
    new-instance p0, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;

    .line 61
    .line 62
    sget-object p1, Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;->CACHE:Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;

    .line 63
    .line 64
    new-instance p2, Ljava/util/NoSuchElementException;

    .line 65
    .line 66
    const-string p3, "no found cache for key: "

    .line 67
    .line 68
    invoke-virtual {p3, p4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p3

    .line 72
    invoke-direct {p2, p3}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    new-instance p3, Leo1;

    .line 76
    .line 77
    invoke-direct {p3, p2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    invoke-direct {p0, p1, p3}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;-><init>(Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    return-object p0

    .line 84
    :cond_1
    :try_start_1
    invoke-interface {p8}, Lp70;->invoke()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    check-cast p0, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :catchall_1
    move-exception p0

    .line 92
    new-instance p7, Leo1;

    .line 93
    .line 94
    invoke-direct {p7, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 95
    .line 96
    .line 97
    move-object p0, p7

    .line 98
    :goto_0
    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    .line 99
    .line 100
    .line 101
    move-result-object p7

    .line 102
    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->getWriteHoldCount()I

    .line 103
    .line 104
    .line 105
    move-result p8

    .line 106
    const/4 v0, 0x0

    .line 107
    if-nez p8, :cond_2

    .line 108
    .line 109
    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->getReadHoldCount()I

    .line 110
    .line 111
    .line 112
    move-result p8

    .line 113
    goto :goto_1

    .line 114
    :cond_2
    move p8, v0

    .line 115
    :goto_1
    move v1, v0

    .line 116
    :goto_2
    if-ge v1, p8, :cond_3

    .line 117
    .line 118
    invoke-virtual {p7}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 119
    .line 120
    .line 121
    add-int/lit8 v1, v1, 0x1

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_3
    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V

    .line 129
    .line 130
    .line 131
    :try_start_2
    invoke-static {p1, p4}, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->getCachedSingle$innerGet(Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;Ljava/lang/String;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    if-eqz v1, :cond_5

    .line 136
    .line 137
    new-instance p0, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;

    .line 138
    .line 139
    sget-object p1, Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;->CACHE:Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;

    .line 140
    .line 141
    sget-object p3, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeStore;

    .line 142
    .line 143
    invoke-direct {p3, v1, p5}, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->resolveSingleOutcome-gIAlu-s(Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome;Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p3

    .line 147
    invoke-direct {p0, p1, p3}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;-><init>(Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 148
    .line 149
    .line 150
    :goto_3
    if-ge v0, p8, :cond_4

    .line 151
    .line 152
    invoke-virtual {p7}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 153
    .line 154
    .line 155
    add-int/lit8 v0, v0, 0x1

    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_4
    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 159
    .line 160
    .line 161
    return-object p0

    .line 162
    :cond_5
    :try_start_3
    sget-object v1, Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;->QUERY:Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;

    .line 163
    .line 164
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    if-nez v2, :cond_9

    .line 169
    .line 170
    check-cast p0, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome;

    .line 171
    .line 172
    instance-of v2, p0, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$Value;

    .line 173
    .line 174
    if-eqz v2, :cond_6

    .line 175
    .line 176
    invoke-virtual {p3}, Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;->getCacheSuccess()Z

    .line 177
    .line 178
    .line 179
    move-result p3

    .line 180
    if-eqz p3, :cond_8

    .line 181
    .line 182
    move-object p3, p0

    .line 183
    check-cast p3, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$Value;

    .line 184
    .line 185
    invoke-virtual {p3}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$Value;->getValue()Lorg/luckypray/dexkit/wrap/ISerializable;

    .line 186
    .line 187
    .line 188
    move-result-object p3

    .line 189
    invoke-interface {p3}, Lorg/luckypray/dexkit/wrap/ISerializable;->serialize()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object p3

    .line 193
    invoke-interface {p1, p4, p3}, Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_6
    instance-of p3, p0, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NoResult;

    .line 198
    .line 199
    if-eqz p3, :cond_7

    .line 200
    .line 201
    if-eqz p6, :cond_8

    .line 202
    .line 203
    const-string p3, "CACHE_NO_RESULT"

    .line 204
    .line 205
    invoke-interface {p1, p4, p3}, Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    goto :goto_4

    .line 209
    :cond_7
    instance-of p3, p0, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NonUnique;

    .line 210
    .line 211
    if-eqz p3, :cond_8

    .line 212
    .line 213
    if-eqz p6, :cond_8

    .line 214
    .line 215
    const-string p3, "CACHE_NON_UNIQUE"

    .line 216
    .line 217
    invoke-interface {p1, p4, p3}, Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    :cond_8
    :goto_4
    sget-object p1, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeStore;

    .line 221
    .line 222
    invoke-direct {p1, p0, p5}, Lorg/luckypray/dexkit/cache/CacheBridgeStore;->resolveSingleOutcome-gIAlu-s(Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome;Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleResolveMode;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    goto :goto_5

    .line 227
    :cond_9
    new-instance p0, Leo1;

    .line 228
    .line 229
    invoke-direct {p0, v2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 230
    .line 231
    .line 232
    :goto_5
    new-instance p1, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;

    .line 233
    .line 234
    invoke-direct {p1, v1, p0}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$LoadResult;-><init>(Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 235
    .line 236
    .line 237
    :goto_6
    if-ge v0, p8, :cond_a

    .line 238
    .line 239
    invoke-virtual {p7}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 240
    .line 241
    .line 242
    add-int/lit8 v0, v0, 0x1

    .line 243
    .line 244
    goto :goto_6

    .line 245
    :cond_a
    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 246
    .line 247
    .line 248
    return-object p1

    .line 249
    :catchall_2
    move-exception p0

    .line 250
    :goto_7
    if-ge v0, p8, :cond_b

    .line 251
    .line 252
    invoke-virtual {p7}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 253
    .line 254
    .line 255
    add-int/lit8 v0, v0, 0x1

    .line 256
    .line 257
    goto :goto_7

    .line 258
    :cond_b
    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 259
    .line 260
    .line 261
    throw p0

    .line 262
    :goto_8
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 263
    .line 264
    .line 265
    throw p1
.end method

.method public final shouldCacheFailure(Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;Z)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;->getFailurePolicy()Lorg/luckypray/dexkit/DexKitCacheBridge$CacheFailurePolicy;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object p1, Lorg/luckypray/dexkit/cache/CacheBridgeStore$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    aget p0, p1, p0

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    if-eq p0, p1, :cond_2

    .line 18
    .line 19
    const/4 v0, 0x2

    .line 20
    if-eq p0, v0, :cond_1

    .line 21
    .line 22
    const/4 p2, 0x3

    .line 23
    if-ne p0, p2, :cond_0

    .line 24
    .line 25
    return p1

    .line 26
    :cond_0
    invoke-static {}, Lγ;->κ()V

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    return p0

    .line 31
    :cond_1
    return p2

    .line 32
    :cond_2
    const/4 p0, 0x0

    .line 33
    return p0
.end method
