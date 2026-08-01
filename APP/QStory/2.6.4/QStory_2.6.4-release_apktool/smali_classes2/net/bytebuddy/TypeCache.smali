.class public Lnet/bytebuddy/TypeCache;
.super Ljava/lang/ref/ReferenceQueue;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/TypeCache$SimpleKey;,
        Lnet/bytebuddy/TypeCache$WithInlineExpunction;,
        Lnet/bytebuddy/TypeCache$StorageKey;,
        Lnet/bytebuddy/TypeCache$LookupKey;,
        Lnet/bytebuddy/TypeCache$Sort;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/ref/ReferenceQueue<",
        "Ljava/lang/ClassLoader;",
        ">;"
    }
.end annotation


# static fields
.field private static final NOT_FOUND:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/AlwaysNull;
    .end annotation
.end field


# instance fields
.field protected final cache:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Lnet/bytebuddy/TypeCache$StorageKey;",
            "Ljava/util/concurrent/ConcurrentMap<",
            "TT;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field protected final sort:Lnet/bytebuddy/TypeCache$Sort;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    sget-object v0, Lnet/bytebuddy/TypeCache$Sort;->STRONG:Lnet/bytebuddy/TypeCache$Sort;

    invoke-direct {p0, v0}, Lnet/bytebuddy/TypeCache;-><init>(Lnet/bytebuddy/TypeCache$Sort;)V

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/TypeCache$Sort;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/TypeCache;->sort:Lnet/bytebuddy/TypeCache$Sort;

    .line 5
    .line 6
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lnet/bytebuddy/TypeCache;->cache:Ljava/util/concurrent/ConcurrentMap;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public clear()V
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/TypeCache;->cache:Ljava/util/concurrent/ConcurrentMap;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Map;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public expungeStaleEntries()V
    .locals 2

    .line 1
    :goto_0
    invoke-virtual {p0}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lnet/bytebuddy/TypeCache;->cache:Ljava/util/concurrent/ConcurrentMap;

    .line 8
    .line 9
    invoke-interface {v1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    return-void
.end method

.method public find(Ljava/lang/ClassLoader;Ljava/lang/Object;)Ljava/lang/Class;
    .locals 1
    .param p1    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "TT;)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/TypeCache;->cache:Ljava/util/concurrent/ConcurrentMap;

    .line 2
    .line 3
    new-instance v0, Lnet/bytebuddy/TypeCache$LookupKey;

    .line 4
    .line 5
    invoke-direct {v0, p1}, Lnet/bytebuddy/TypeCache$LookupKey;-><init>(Ljava/lang/ClassLoader;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ljava/util/concurrent/ConcurrentMap;

    .line 13
    .line 14
    if-nez p0, :cond_0

    .line 15
    .line 16
    sget-object p0, Lnet/bytebuddy/TypeCache;->NOT_FOUND:Ljava/lang/Class;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    invoke-interface {p0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    if-nez p0, :cond_1

    .line 24
    .line 25
    sget-object p0, Lnet/bytebuddy/TypeCache;->NOT_FOUND:Ljava/lang/Class;

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_1
    instance-of p1, p0, Ljava/lang/ref/Reference;

    .line 29
    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    check-cast p0, Ljava/lang/ref/Reference;

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Ljava/lang/Class;

    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_2
    check-cast p0, Ljava/lang/Class;

    .line 42
    .line 43
    return-object p0
.end method

.method public findOrInsert(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/util/concurrent/Callable;)Ljava/lang/Class;
    .locals 1
    .param p1    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "TT;",
            "Ljava/util/concurrent/Callable<",
            "Ljava/lang/Class<",
            "*>;>;)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/TypeCache;->find(Ljava/lang/ClassLoader;Ljava/lang/Object;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    :try_start_0
    invoke-interface {p3}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p3

    .line 12
    check-cast p3, Ljava/lang/Class;

    .line 13
    .line 14
    invoke-virtual {p0, p1, p2, p3}, Lnet/bytebuddy/TypeCache;->insert(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    return-object p0

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 21
    .line 22
    const-string p2, "Could not create type"

    .line 23
    .line 24
    invoke-direct {p1, p2, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    throw p1
.end method

.method public findOrInsert(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/util/concurrent/Callable;Ljava/lang/Object;)Ljava/lang/Class;
    .locals 1
    .param p1    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "TT;",
            "Ljava/util/concurrent/Callable<",
            "Ljava/lang/Class<",
            "*>;>;",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 28
    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/TypeCache;->find(Ljava/lang/ClassLoader;Ljava/lang/Object;)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 29
    :cond_0
    monitor-enter p4

    .line 30
    :try_start_0
    invoke-virtual {p0, p1, p2, p3}, Lnet/bytebuddy/TypeCache;->findOrInsert(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/util/concurrent/Callable;)Ljava/lang/Class;

    move-result-object p0

    monitor-exit p4

    return-object p0

    :catchall_0
    move-exception p0

    .line 31
    monitor-exit p4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public insert(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Class;
    .locals 3
    .param p1    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "TT;",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/TypeCache;->cache:Ljava/util/concurrent/ConcurrentMap;

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/TypeCache$LookupKey;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Lnet/bytebuddy/TypeCache$LookupKey;-><init>(Ljava/lang/ClassLoader;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/util/concurrent/ConcurrentMap;

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lnet/bytebuddy/TypeCache;->cache:Ljava/util/concurrent/ConcurrentMap;

    .line 22
    .line 23
    new-instance v2, Lnet/bytebuddy/TypeCache$StorageKey;

    .line 24
    .line 25
    invoke-direct {v2, p1, p0}, Lnet/bytebuddy/TypeCache$StorageKey;-><init>(Ljava/lang/ClassLoader;Ljava/lang/ref/ReferenceQueue;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {v1, v2, v0}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Ljava/util/concurrent/ConcurrentMap;

    .line 33
    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    move-object v0, p1

    .line 37
    :cond_0
    iget-object p0, p0, Lnet/bytebuddy/TypeCache;->sort:Lnet/bytebuddy/TypeCache$Sort;

    .line 38
    .line 39
    invoke-virtual {p0, p3}, Lnet/bytebuddy/TypeCache$Sort;->wrap(Ljava/lang/Class;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-interface {v0, p2, p0}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    :cond_1
    :goto_0
    if-eqz p1, :cond_5

    .line 48
    .line 49
    instance-of v1, p1, Ljava/lang/ref/Reference;

    .line 50
    .line 51
    if-eqz v1, :cond_2

    .line 52
    .line 53
    move-object v1, p1

    .line 54
    check-cast v1, Ljava/lang/ref/Reference;

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    goto :goto_1

    .line 61
    :cond_2
    move-object v1, p1

    .line 62
    :goto_1
    check-cast v1, Ljava/lang/Class;

    .line 63
    .line 64
    if-eqz v1, :cond_3

    .line 65
    .line 66
    return-object v1

    .line 67
    :cond_3
    invoke-interface {v0, p2, p1}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-eqz p1, :cond_4

    .line 72
    .line 73
    invoke-interface {v0, p2, p0}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    goto :goto_0

    .line 78
    :cond_4
    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    if-nez p1, :cond_1

    .line 83
    .line 84
    invoke-interface {v0, p2, p0}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    goto :goto_0

    .line 89
    :cond_5
    return-object p3
.end method
