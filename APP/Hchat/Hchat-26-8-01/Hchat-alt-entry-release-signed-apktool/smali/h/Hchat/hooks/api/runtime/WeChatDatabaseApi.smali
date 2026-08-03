.class public final Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field private volatile coreStorage:Ljava/lang/Object;

.field private volatile dbWrapper:Ljava/lang/Object;

.field private volatile deleteMethod:Ljava/lang/reflect/Method;

.field private final dexFinder:Lh/Hchat/dexkit/DexFinder;

.field private volatile insertMethods:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/reflect/Method;",
            ">;"
        }
    .end annotation
.end field

.field private final logger:Lo8/b;

.field private volatile messageStorage:Ljava/lang/Object;

.field private final messageTableCache:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private volatile messageTableMethod:Ljava/lang/reflect/Method;

.field private volatile messageTables:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private volatile nativeMessageByIdMethod:Ljava/lang/reflect/Method;

.field private volatile nativeMessageUpdateMethod:Ljava/lang/reflect/Method;

.field private volatile nativeMessageUpdateStorage:Ljava/lang/Object;

.field private volatile queryMethod:Ljava/lang/reflect/Method;

.field private final storageObjectCache:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private volatile updateMethod:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Lh/Hchat/dexkit/DexFinder;Lo8/b;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->messageTableCache:Ljava/util/Map;

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->storageObjectCache:Ljava/util/Map;

    .line 17
    .line 18
    iput-object p1, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->dexFinder:Lh/Hchat/dexkit/DexFinder;

    .line 19
    .line 20
    iput-object p2, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->logger:Lo8/b;

    .line 21
    .line 22
    return-void
.end method

.method private cursorValue(Landroid/database/Cursor;I)Ljava/lang/Object;
    .locals 3

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    :try_start_0
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getType(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_4

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-eq v1, v2, :cond_3

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    if-eq v1, v2, :cond_2

    .line 14
    .line 15
    const/4 v2, 0x4

    .line 16
    if-eq v1, v2, :cond_1

    .line 17
    .line 18
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_0
    return-object v0

    .line 26
    :cond_1
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getBlob(I)[B

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    return-object p1

    .line 31
    :cond_2
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getDouble(I)D

    .line 32
    .line 33
    .line 34
    move-result-wide p1

    .line 35
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    :cond_3
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getLong(I)J

    .line 41
    .line 42
    .line 43
    move-result-wide p1

    .line 44
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 45
    .line 46
    .line 47
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    return-object p1

    .line 49
    :catchall_0
    :cond_4
    return-object v0
.end method

.method private enqueueNestedObjects(Ljava/lang/Object;Ljava/util/ArrayDeque;Ljava/util/Set;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/util/ArrayDeque<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    if-eqz v0, :cond_4

    .line 6
    .line 7
    const-class v1, Ljava/lang/Object;

    .line 8
    .line 9
    if-eq v0, v1, :cond_4

    .line 10
    .line 11
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :catchall_0
    :cond_0
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_3

    .line 24
    .line 25
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Ljava/lang/reflect/Field;

    .line 30
    .line 31
    :try_start_0
    invoke-static {v2}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Field;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    if-eqz v3, :cond_0

    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/lang/Class;->isPrimitive()Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-nez v4, :cond_0

    .line 49
    .line 50
    const-class v4, Ljava/lang/String;

    .line 51
    .line 52
    if-ne v3, v4, :cond_2

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    invoke-static {v2, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    if-eqz v2, :cond_0

    .line 60
    .line 61
    invoke-interface {p3, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-nez v3, :cond_0

    .line 66
    .line 67
    invoke-virtual {p2, v2}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    goto :goto_0

    .line 76
    :cond_4
    return-void
.end method

.method private declared-synchronized ensureNativeMessageUpdateMethod(Ljava/lang/Object;)Ljava/lang/reflect/Method;
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->nativeMessageUpdateMethod:Ljava/lang/reflect/Method;

    .line 3
    .line 4
    iget-object v1, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->nativeMessageUpdateStorage:Ljava/lang/Object;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v2, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-direct {p0, v0, p1}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->isNativeMessageUpdateMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    monitor-exit p0

    .line 27
    return-object v0

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    :try_start_1
    new-instance v0, Ljava/util/IdentityHashMap;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    new-instance v1, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    iget-object v2, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->messageStorage:Ljava/lang/Object;

    .line 45
    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    iget-object v2, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->messageStorage:Ljava/lang/Object;

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    :cond_1
    invoke-virtual {p0}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->getCoreStorage()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    if-eqz v2, :cond_2

    .line 58
    .line 59
    invoke-direct {p0, v2}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->storageFieldObjects(Ljava/lang/Object;)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 64
    .line 65
    .line 66
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    :cond_3
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-eqz v2, :cond_6

    .line 75
    .line 76
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    if-eqz v2, :cond_3

    .line 81
    .line 82
    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-nez v3, :cond_4

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_4
    invoke-direct {p0, v2, p1}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->findNativeMessageUpdateMethod(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    if-nez v3, :cond_5

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_5
    iput-object v2, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->nativeMessageUpdateStorage:Ljava/lang/Object;

    .line 97
    .line 98
    iput-object v3, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->nativeMessageUpdateMethod:Ljava/lang/reflect/Method;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 99
    .line 100
    monitor-exit p0

    .line 101
    return-object v3

    .line 102
    :cond_6
    monitor-exit p0

    .line 103
    const/4 p1, 0x0

    .line 104
    return-object p1

    .line 105
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 106
    throw p1
.end method

.method private declared-synchronized ensureReady()Z
    .locals 6

    .line 1
    const-string v0, "\u6570\u636e\u5e93API\u5df2\u5c31\u7eea: wrapper="

    .line 2
    .line 3
    const-string v1, "\u672a\u627e\u5230 SqliteDB \u67e5\u8be2\u65b9\u6cd5: "

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-object v2, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->dbWrapper:Ljava/lang/Object;

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    iget-object v2, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->queryMethod:Ljava/lang/reflect/Method;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    monitor-exit p0

    .line 16
    return v3

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->isAvailable()Z

    .line 20
    .line 21
    .line 22
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    const/4 v4, 0x0

    .line 24
    if-nez v2, :cond_1

    .line 25
    .line 26
    monitor-exit p0

    .line 27
    return v4

    .line 28
    :cond_1
    :try_start_2
    invoke-virtual {p0}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->getCoreStorage()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 32
    if-nez v2, :cond_2

    .line 33
    .line 34
    monitor-exit p0

    .line 35
    return v4

    .line 36
    :cond_2
    :try_start_3
    invoke-direct {p0, v2}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->findDbWrapper(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    if-nez v2, :cond_3

    .line 41
    .line 42
    const-string v0, "\u672a\u627e\u5230 SqliteDB wrapper"

    .line 43
    .line 44
    invoke-direct {p0, v0}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->log(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 45
    .line 46
    .line 47
    monitor-exit p0

    .line 48
    return v4

    .line 49
    :cond_3
    :try_start_4
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-direct {p0, v5}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->findQueryMethod(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    if-nez v5, :cond_4

    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-direct {p0, v0}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->log(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 72
    .line 73
    .line 74
    monitor-exit p0

    .line 75
    return v4

    .line 76
    :cond_4
    :try_start_5
    iput-object v2, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->dbWrapper:Ljava/lang/Object;

    .line 77
    .line 78
    iput-object v5, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->queryMethod:Ljava/lang/reflect/Method;

    .line 79
    .line 80
    new-instance v1, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string v0, " query="

    .line 97
    .line 98
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-direct {p0, v0}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->log(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 113
    .line 114
    .line 115
    monitor-exit p0

    .line 116
    return v3

    .line 117
    :goto_0
    :try_start_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 118
    throw v0
.end method

.method private findDbWrapper(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_5

    .line 3
    .line 4
    iget-object v1, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->dexFinder:Lh/Hchat/dexkit/DexFinder;

    .line 5
    .line 6
    iget-object v1, v1, Lh/Hchat/dexkit/DexFinder;->sqliteDbWrapperClass:Ljava/lang/Class;

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto :goto_2

    .line 11
    :cond_0
    new-instance v1, Ljava/util/IdentityHashMap;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-static {v1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    new-instance v2, Ljava/util/ArrayDeque;

    .line 21
    .line 22
    invoke-direct {v2}, Ljava/util/ArrayDeque;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    :cond_1
    :goto_0
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-nez p1, :cond_5

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_2

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    iget-object v3, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->dexFinder:Lh/Hchat/dexkit/DexFinder;

    .line 51
    .line 52
    iget-object v3, v3, Lh/Hchat/dexkit/DexFinder;->sqliteDbWrapperClass:Ljava/lang/Class;

    .line 53
    .line 54
    invoke-virtual {v3, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_3

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-direct {p0, v3}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->findQueryMethod(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    if-eqz v3, :cond_4

    .line 70
    .line 71
    :goto_1
    return-object p1

    .line 72
    :cond_4
    invoke-direct {p0, p1, v2, v1}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->enqueueNestedObjects(Ljava/lang/Object;Ljava/util/ArrayDeque;Ljava/util/Set;)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_5
    :goto_2
    return-object v0
.end method

.method private findDeleteMethod(Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/reflect/Method;"
        }
    .end annotation

    .line 1
    :goto_0
    if-eqz p1, :cond_2

    .line 2
    .line 3
    const-class v0, Ljava/lang/Object;

    .line 4
    .line 5
    if-eq p1, v0, :cond_2

    .line 6
    .line 7
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Ljava/lang/reflect/Method;

    .line 26
    .line 27
    invoke-direct {p0, v1}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->isDeleteMethod(Ljava/lang/reflect/Method;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-nez v2, :cond_0

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    return-object v1

    .line 35
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    goto :goto_0

    .line 40
    :cond_2
    const/4 p1, 0x0

    .line 41
    return-object p1
.end method

.method private findInsertMethods(Ljava/lang/Class;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/util/List<",
            "Ljava/lang/reflect/Method;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    if-eqz p1, :cond_2

    .line 7
    .line 8
    const-class v1, Ljava/lang/Object;

    .line 9
    .line 10
    if-eq p1, v1, :cond_2

    .line 11
    .line 12
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Ljava/lang/reflect/Method;

    .line 31
    .line 32
    invoke-direct {p0, v2}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->isInsertMethod(Ljava/lang/reflect/Method;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-nez v3, :cond_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    goto :goto_0

    .line 48
    :cond_2
    return-object v0
.end method

.method private findMessageTableMethod(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    invoke-virtual {p0}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->getCoreStorage()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, ""

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-object v1

    .line 10
    :cond_0
    new-instance v2, Ljava/util/HashSet;

    .line 11
    .line 12
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, v0}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->storageFieldObjects(Ljava/lang/Object;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_4

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_2

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    invoke-virtual {v2, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    invoke-direct {p0, v3, p1}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->findMessageTableMethod(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    if-nez v4, :cond_3

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    invoke-static {v4, v3, v5}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    instance-of v6, v5, Ljava/lang/String;

    .line 61
    .line 62
    if-eqz v6, :cond_1

    .line 63
    .line 64
    check-cast v5, Ljava/lang/String;

    .line 65
    .line 66
    invoke-direct {p0, v5}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->isUsableMessageTable(Ljava/lang/String;)Z

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    if-eqz v6, :cond_1

    .line 71
    .line 72
    iput-object v3, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->messageStorage:Ljava/lang/Object;

    .line 73
    .line 74
    iput-object v4, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->messageTableMethod:Ljava/lang/reflect/Method;

    .line 75
    .line 76
    return-object v5

    .line 77
    :cond_4
    return-object v1
.end method

.method private findMessageTableMethod(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/reflect/Method;
    .locals 5

    .line 78
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_3

    .line 79
    const-class v1, Ljava/lang/Object;

    if-eq v0, v1, :cond_3

    .line 80
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/reflect/Method;

    .line 81
    invoke-direct {p0, v2}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->isMessageTableNameMethod(Ljava/lang/reflect/Method;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_1

    .line 82
    :cond_1
    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, p1, v3}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 83
    instance-of v4, v3, Ljava/lang/String;

    if-eqz v4, :cond_0

    check-cast v3, Ljava/lang/String;

    invoke-direct {p0, v3}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->isUsableMessageTable(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    return-object v2

    .line 84
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method private findNativeMessageByIdMethod(Ljava/lang/Object;)Ljava/lang/reflect/Method;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_3

    .line 3
    .line 4
    iget-object v1, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->dexFinder:Lh/Hchat/dexkit/DexFinder;

    .line 5
    .line 6
    if-eqz v1, :cond_3

    .line 7
    .line 8
    iget-object v1, v1, Lh/Hchat/dexkit/DexFinder;->localMessageClass:Ljava/lang/Class;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    goto :goto_2

    .line 13
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    :goto_0
    if-eqz p1, :cond_3

    .line 18
    .line 19
    const-class v1, Ljava/lang/Object;

    .line 20
    .line 21
    if-eq p1, v1, :cond_3

    .line 22
    .line 23
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Ljava/lang/reflect/Method;

    .line 42
    .line 43
    invoke-direct {p0, v2}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->isNativeMessageByIdMethod(Ljava/lang/reflect/Method;)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-nez v3, :cond_1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    invoke-static {v2}, Lh/Hchat/utils/KavaReflector;->accessible(Ljava/lang/reflect/Method;)Ljava/lang/reflect/Method;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    return-object p1

    .line 55
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    goto :goto_0

    .line 60
    :cond_3
    :goto_2
    return-object v0
.end method

.method private findNativeMessageUpdateMethod(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/reflect/Method;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :goto_0
    if-eqz p1, :cond_2

    .line 6
    .line 7
    const-class v0, Ljava/lang/Object;

    .line 8
    .line 9
    if-eq p1, v0, :cond_2

    .line 10
    .line 11
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Ljava/lang/reflect/Method;

    .line 30
    .line 31
    invoke-direct {p0, v1, p2}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->isNativeMessageUpdateMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->accessible(Ljava/lang/reflect/Method;)Ljava/lang/reflect/Method;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1

    .line 42
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    const/4 p1, 0x0

    .line 48
    return-object p1
.end method

.method private findQueryMethod(Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/reflect/Method;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    if-eqz p1, :cond_4

    .line 3
    .line 4
    const-class v1, Ljava/lang/Object;

    .line 5
    .line 6
    if-eq p1, v1, :cond_4

    .line 7
    .line 8
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :cond_0
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_3

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Ljava/lang/reflect/Method;

    .line 27
    .line 28
    invoke-direct {p0, v2}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->isQueryMethod(Ljava/lang/reflect/Method;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-nez v3, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    if-eqz v0, :cond_2

    .line 36
    .line 37
    invoke-direct {p0, v2}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->queryPriority(Ljava/lang/reflect/Method;)I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    invoke-direct {p0, v0}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->queryPriority(Ljava/lang/reflect/Method;)I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-le v3, v4, :cond_0

    .line 46
    .line 47
    :cond_2
    move-object v0, v2

    .line 48
    goto :goto_1

    .line 49
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    goto :goto_0

    .line 54
    :cond_4
    return-object v0
.end method

.method private findUpdateMethod(Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/reflect/Method;"
        }
    .end annotation

    .line 1
    :goto_0
    if-eqz p1, :cond_2

    .line 2
    .line 3
    const-class v0, Ljava/lang/Object;

    .line 4
    .line 5
    if-eq p1, v0, :cond_2

    .line 6
    .line 7
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Ljava/lang/reflect/Method;

    .line 26
    .line 27
    invoke-direct {p0, v1}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->isUpdateMethod(Ljava/lang/reflect/Method;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-nez v2, :cond_0

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    return-object v1

    .line 35
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    goto :goto_0

    .line 40
    :cond_2
    const/4 p1, 0x0

    .line 41
    return-object p1
.end method

.method private invokeMessageTableMethod(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->messageStorage:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v1, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->messageTableMethod:Ljava/lang/reflect/Method;

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    :try_start_0
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {v1, v0, p1}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    instance-of v0, p1, Ljava/lang/String;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    check-cast p1, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    return-object p1

    .line 27
    :catchall_0
    :cond_1
    :goto_0
    return-object v2
.end method

.method private invokeNativeMessageById(Ljava/lang/Object;Ljava/lang/reflect/Method;J)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    if-nez p2, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    :try_start_0
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 8
    .line 9
    .line 10
    move-result-object p3

    .line 11
    filled-new-array {p3}, [Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    invoke-static {p2, p1, p3}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object p2, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->dexFinder:Lh/Hchat/dexkit/DexFinder;

    .line 20
    .line 21
    iget-object p2, p2, Lh/Hchat/dexkit/DexFinder;->localMessageClass:Ljava/lang/Class;

    .line 22
    .line 23
    invoke-virtual {p2, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    if-eqz p2, :cond_1

    .line 28
    .line 29
    return-object p1

    .line 30
    :catchall_0
    :cond_1
    :goto_0
    return-object v0
.end method

.method private isDeleteMethod(Ljava/lang/reflect/Method;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 10
    .line 11
    if-eq v1, v2, :cond_1

    .line 12
    .line 13
    const-class v2, Ljava/lang/Integer;

    .line 14
    .line 15
    if-eq v1, v2, :cond_1

    .line 16
    .line 17
    return v0

    .line 18
    :cond_1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    array-length v1, p1

    .line 23
    const/4 v2, 0x3

    .line 24
    if-ne v1, v2, :cond_2

    .line 25
    .line 26
    aget-object v1, p1, v0

    .line 27
    .line 28
    const-class v2, Ljava/lang/String;

    .line 29
    .line 30
    if-ne v1, v2, :cond_2

    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    aget-object v3, p1, v1

    .line 34
    .line 35
    if-ne v3, v2, :cond_2

    .line 36
    .line 37
    const/4 v2, 0x2

    .line 38
    aget-object p1, p1, v2

    .line 39
    .line 40
    const-class v2, [Ljava/lang/String;

    .line 41
    .line 42
    if-ne p1, v2, :cond_2

    .line 43
    .line 44
    return v1

    .line 45
    :cond_2
    return v0
.end method

.method private isInsertMethod(Ljava/lang/reflect/Method;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 10
    .line 11
    if-eq v1, v2, :cond_1

    .line 12
    .line 13
    const-class v2, Ljava/lang/Long;

    .line 14
    .line 15
    if-eq v1, v2, :cond_1

    .line 16
    .line 17
    return v0

    .line 18
    :cond_1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    array-length v1, p1

    .line 23
    const/4 v2, 0x3

    .line 24
    if-ne v1, v2, :cond_2

    .line 25
    .line 26
    aget-object v1, p1, v0

    .line 27
    .line 28
    const-class v2, Ljava/lang/String;

    .line 29
    .line 30
    if-ne v1, v2, :cond_2

    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    aget-object v3, p1, v1

    .line 34
    .line 35
    if-ne v3, v2, :cond_2

    .line 36
    .line 37
    const/4 v2, 0x2

    .line 38
    aget-object p1, p1, v2

    .line 39
    .line 40
    const-class v2, Landroid/content/ContentValues;

    .line 41
    .line 42
    if-ne p1, v2, :cond_2

    .line 43
    .line 44
    return v1

    .line 45
    :cond_2
    return v0
.end method

.method private isLikelyMessageTable(Ljava/lang/String;)Z
    .locals 9

    .line 1
    invoke-direct {p0, p1}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->isSafeTableName(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v2, "PRAGMA table_info("

    .line 12
    .line 13
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->quoteTable(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p1, ")"

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-direct {p0, p1, v0, v1}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->rawQueryInternal(Ljava/lang/String;[Ljava/lang/String;Z)Landroid/database/Cursor;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    if-nez p1, :cond_1

    .line 38
    .line 39
    return v1

    .line 40
    :cond_1
    :try_start_0
    const-string v0, "name"

    .line 41
    .line 42
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 46
    if-gez v0, :cond_2

    .line 47
    .line 48
    :try_start_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    .line 50
    .line 51
    :catchall_0
    return v1

    .line 52
    :cond_2
    move v2, v1

    .line 53
    move v3, v2

    .line 54
    move v4, v3

    .line 55
    move v5, v4

    .line 56
    :cond_3
    :goto_0
    :try_start_2
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    const/4 v7, 0x1

    .line 61
    if-eqz v6, :cond_7

    .line 62
    .line 63
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    const-string v8, "msgId"

    .line 68
    .line 69
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v8

    .line 73
    if-eqz v8, :cond_4

    .line 74
    .line 75
    move v2, v7

    .line 76
    :cond_4
    const-string v8, "msgSvrId"

    .line 77
    .line 78
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v8

    .line 82
    if-eqz v8, :cond_5

    .line 83
    .line 84
    move v3, v7

    .line 85
    :cond_5
    const-string v8, "createTime"

    .line 86
    .line 87
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v8

    .line 91
    if-eqz v8, :cond_6

    .line 92
    .line 93
    move v4, v7

    .line 94
    :cond_6
    const-string v8, "content"

    .line 95
    .line 96
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 100
    if-eqz v6, :cond_3

    .line 101
    .line 102
    move v5, v7

    .line 103
    goto :goto_0

    .line 104
    :cond_7
    if-eqz v2, :cond_8

    .line 105
    .line 106
    if-eqz v3, :cond_8

    .line 107
    .line 108
    if-eqz v4, :cond_8

    .line 109
    .line 110
    if-eqz v5, :cond_8

    .line 111
    .line 112
    move v1, v7

    .line 113
    :cond_8
    :try_start_3
    invoke-interface {p1}, Landroid/database/Cursor;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 114
    .line 115
    .line 116
    :catchall_1
    return v1

    .line 117
    :catchall_2
    :try_start_4
    invoke-interface {p1}, Landroid/database/Cursor;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 118
    .line 119
    .line 120
    :catchall_3
    return v1
.end method

.method private isMessageTableNameMethod(Ljava/lang/reflect/Method;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_2

    .line 3
    .line 4
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-class v2, Ljava/lang/String;

    .line 16
    .line 17
    if-eq v1, v2, :cond_1

    .line 18
    .line 19
    return v0

    .line 20
    :cond_1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    array-length v1, p1

    .line 25
    const/4 v3, 0x1

    .line 26
    if-ne v1, v3, :cond_2

    .line 27
    .line 28
    aget-object p1, p1, v0

    .line 29
    .line 30
    if-ne p1, v2, :cond_2

    .line 31
    .line 32
    return v3

    .line 33
    :cond_2
    :goto_0
    return v0
.end method

.method private isNativeMessageByIdMethod(Ljava/lang/reflect/Method;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_4

    .line 3
    .line 4
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v1, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->dexFinder:Lh/Hchat/dexkit/DexFinder;

    .line 12
    .line 13
    if-eqz v1, :cond_4

    .line 14
    .line 15
    iget-object v1, v1, Lh/Hchat/dexkit/DexFinder;->localMessageClass:Ljava/lang/Class;

    .line 16
    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_2

    .line 29
    .line 30
    return v0

    .line 31
    :cond_2
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    array-length v1, p1

    .line 36
    const/4 v2, 0x1

    .line 37
    if-ne v1, v2, :cond_4

    .line 38
    .line 39
    aget-object p1, p1, v0

    .line 40
    .line 41
    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 42
    .line 43
    if-eq p1, v1, :cond_3

    .line 44
    .line 45
    const-class v1, Ljava/lang/Long;

    .line 46
    .line 47
    if-ne p1, v1, :cond_4

    .line 48
    .line 49
    :cond_3
    return v2

    .line 50
    :cond_4
    :goto_0
    return v0
.end method

.method private isNativeMessageUpdateMethod(Ljava/lang/reflect/Method;Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_3

    .line 3
    .line 4
    if-eqz p2, :cond_3

    .line 5
    .line 6
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 18
    .line 19
    if-eq v1, v2, :cond_1

    .line 20
    .line 21
    const-class v2, Ljava/lang/Integer;

    .line 22
    .line 23
    if-eq v1, v2, :cond_1

    .line 24
    .line 25
    return v0

    .line 26
    :cond_1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    array-length v1, p1

    .line 31
    const/4 v2, 0x2

    .line 32
    if-ne v1, v2, :cond_3

    .line 33
    .line 34
    aget-object v1, p1, v0

    .line 35
    .line 36
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 37
    .line 38
    if-eq v1, v2, :cond_2

    .line 39
    .line 40
    const-class v2, Ljava/lang/Long;

    .line 41
    .line 42
    if-ne v1, v2, :cond_3

    .line 43
    .line 44
    :cond_2
    const/4 v1, 0x1

    .line 45
    aget-object p1, p1, v1

    .line 46
    .line 47
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-virtual {p1, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-eqz p1, :cond_3

    .line 56
    .line 57
    return v1

    .line 58
    :cond_3
    :goto_0
    return v0
.end method

.method private isQueryMethod(Ljava/lang/reflect/Method;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const-class v2, Landroid/database/Cursor;

    .line 9
    .line 10
    if-eq v1, v2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    array-length v1, p1

    .line 18
    const/4 v2, 0x2

    .line 19
    if-ne v1, v2, :cond_1

    .line 20
    .line 21
    aget-object v1, p1, v0

    .line 22
    .line 23
    const-class v2, Ljava/lang/String;

    .line 24
    .line 25
    if-ne v1, v2, :cond_1

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    aget-object p1, p1, v1

    .line 29
    .line 30
    const-class v2, [Ljava/lang/String;

    .line 31
    .line 32
    if-ne p1, v2, :cond_1

    .line 33
    .line 34
    return v1

    .line 35
    :cond_1
    :goto_0
    return v0
.end method

.method private isSafeTableName(Ljava/lang/String;)Z
    .locals 4

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    move v0, v1

    .line 10
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-ge v0, v2, :cond_6

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/16 v3, 0x61

    .line 21
    .line 22
    if-lt v2, v3, :cond_1

    .line 23
    .line 24
    const/16 v3, 0x7a

    .line 25
    .line 26
    if-le v2, v3, :cond_4

    .line 27
    .line 28
    :cond_1
    const/16 v3, 0x41

    .line 29
    .line 30
    if-lt v2, v3, :cond_2

    .line 31
    .line 32
    const/16 v3, 0x5a

    .line 33
    .line 34
    if-le v2, v3, :cond_4

    .line 35
    .line 36
    :cond_2
    const/16 v3, 0x30

    .line 37
    .line 38
    if-lt v2, v3, :cond_3

    .line 39
    .line 40
    const/16 v3, 0x39

    .line 41
    .line 42
    if-le v2, v3, :cond_4

    .line 43
    .line 44
    :cond_3
    const/16 v3, 0x5f

    .line 45
    .line 46
    if-ne v2, v3, :cond_5

    .line 47
    .line 48
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_5
    return v1

    .line 52
    :cond_6
    const/4 p1, 0x1

    .line 53
    return p1
.end method

.method private isUpdateMethod(Ljava/lang/reflect/Method;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 10
    .line 11
    if-eq v1, v2, :cond_1

    .line 12
    .line 13
    const-class v2, Ljava/lang/Integer;

    .line 14
    .line 15
    if-eq v1, v2, :cond_1

    .line 16
    .line 17
    return v0

    .line 18
    :cond_1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    array-length v1, p1

    .line 23
    const/4 v2, 0x4

    .line 24
    if-ne v1, v2, :cond_2

    .line 25
    .line 26
    aget-object v1, p1, v0

    .line 27
    .line 28
    const-class v2, Ljava/lang/String;

    .line 29
    .line 30
    if-ne v1, v2, :cond_2

    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    aget-object v3, p1, v1

    .line 34
    .line 35
    const-class v4, Landroid/content/ContentValues;

    .line 36
    .line 37
    if-ne v3, v4, :cond_2

    .line 38
    .line 39
    const/4 v3, 0x2

    .line 40
    aget-object v3, p1, v3

    .line 41
    .line 42
    if-ne v3, v2, :cond_2

    .line 43
    .line 44
    const/4 v2, 0x3

    .line 45
    aget-object p1, p1, v2

    .line 46
    .line 47
    const-class v2, [Ljava/lang/String;

    .line 48
    .line 49
    if-ne p1, v2, :cond_2

    .line 50
    .line 51
    return v1

    .line 52
    :cond_2
    return v0
.end method

.method private isUsableMessageTable(Ljava/lang/String;)Z
    .locals 4

    .line 1
    invoke-direct {p0, p1}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->isSafeTableName(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    filled-new-array {p1}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v2, "name"

    .line 14
    .line 15
    const-string v3, "SELECT name FROM sqlite_master WHERE type=\'table\' AND name=? LIMIT 1"

    .line 16
    .line 17
    invoke-virtual {p0, v3, v0, v2}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->queryFirstString(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    return v1

    .line 28
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v2, "SELECT msgId,msgSvrId,type,status,isSend,createTime,talker,content FROM "

    .line 31
    .line 32
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->quoteTable(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string p1, " LIMIT 0"

    .line 43
    .line 44
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const/4 v0, 0x0

    .line 52
    invoke-direct {p0, p1, v0, v1}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->rawQueryInternal(Ljava/lang/String;[Ljava/lang/String;Z)Landroid/database/Cursor;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-nez p1, :cond_2

    .line 57
    .line 58
    return v1

    .line 59
    :cond_2
    const/4 v0, 0x1

    .line 60
    :try_start_0
    invoke-interface {p1}, Landroid/database/Cursor;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    .line 62
    .line 63
    :catchall_0
    return v0
.end method

.method private log(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->logger:Lo8/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v1, "[WeChatDatabaseApi] "

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p1}, Li8/i;->f(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method private queryPriority(Ljava/lang/reflect/Method;)I
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "rawQuery"

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/16 p1, 0x64

    .line 14
    .line 15
    return p1

    .line 16
    :cond_0
    const-string v0, "f"

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    const/16 p1, 0x5a

    .line 25
    .line 26
    return p1

    .line 27
    :cond_1
    const-string v0, "j"

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    const/16 p1, 0x50

    .line 36
    .line 37
    return p1

    .line 38
    :cond_2
    const-string v0, "a"

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_3

    .line 45
    .line 46
    const/16 p1, 0x46

    .line 47
    .line 48
    return p1

    .line 49
    :cond_3
    const/16 p1, 0xa

    .line 50
    .line 51
    return p1
.end method

.method private rawQueryInternal(Ljava/lang/String;[Ljava/lang/String;Z)Landroid/database/Cursor;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->queryMethod:Ljava/lang/reflect/Method;

    .line 3
    .line 4
    iget-object v2, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->dbWrapper:Ljava/lang/Object;

    .line 5
    .line 6
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-static {v1, v2, p2}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    instance-of v1, p2, Landroid/database/Cursor;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    check-cast p2, Landroid/database/Cursor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    return-object p2

    .line 21
    :catchall_0
    move-exception p2

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-object v0

    .line 24
    :goto_0
    if-eqz p3, :cond_1

    .line 25
    .line 26
    new-instance p3, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    const-string v1, "SQL \u67e5\u8be2\u5f02\u5e38: "

    .line 29
    .line 30
    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string p2, " sql="

    .line 41
    .line 42
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-direct {p0, p1}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->log(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    return-object v0
.end method

.method private storageFieldObjects(Ljava/lang/Object;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    :goto_0
    if-eqz v1, :cond_4

    .line 11
    .line 12
    const-class v2, Ljava/lang/Object;

    .line 13
    .line 14
    if-eq v1, v2, :cond_4

    .line 15
    .line 16
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    :catchall_0
    :cond_0
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_3

    .line 29
    .line 30
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Ljava/lang/reflect/Field;

    .line 35
    .line 36
    :try_start_0
    invoke-static {v3}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Field;)Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    if-eqz v4, :cond_0

    .line 48
    .line 49
    invoke-virtual {v4}, Ljava/lang/Class;->isPrimitive()Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-nez v5, :cond_0

    .line 54
    .line 55
    const-class v5, Ljava/lang/String;

    .line 56
    .line 57
    if-ne v4, v5, :cond_2

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    invoke-static {v3, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    if-eqz v3, :cond_0

    .line 65
    .line 66
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    goto :goto_0

    .line 75
    :cond_4
    return-object v0
.end method

.method private static stringValue(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    :goto_0
    if-eqz p0, :cond_1

    .line 10
    .line 11
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_1
    const-string p0, ""

    .line 17
    .line 18
    return-object p0
.end method


# virtual methods
.method public delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 3

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-direct {p0}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->ensureReady()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    return v1

    .line 16
    :cond_1
    iget-object v0, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->deleteMethod:Ljava/lang/reflect/Method;

    .line 17
    .line 18
    if-nez v0, :cond_2

    .line 19
    .line 20
    iget-object v0, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->dbWrapper:Ljava/lang/Object;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-direct {p0, v0}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->findDeleteMethod(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->deleteMethod:Ljava/lang/reflect/Method;

    .line 31
    .line 32
    :cond_2
    iget-object v2, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->dbWrapper:Ljava/lang/Object;

    .line 33
    .line 34
    if-nez v0, :cond_3

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    const-string p2, "\u672a\u627e\u5230 SqliteDB \u5220\u9664\u65b9\u6cd5: "

    .line 45
    .line 46
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-direct {p0, p1}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->log(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return v1

    .line 54
    :cond_3
    :try_start_0
    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-static {v0, v2, p2}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    instance-of p3, p2, Ljava/lang/Number;

    .line 63
    .line 64
    if-eqz p3, :cond_4

    .line 65
    .line 66
    check-cast p2, Ljava/lang/Number;

    .line 67
    .line 68
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 69
    .line 70
    .line 71
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    return p1

    .line 73
    :catchall_0
    move-exception p2

    .line 74
    goto :goto_0

    .line 75
    :cond_4
    return v1

    .line 76
    :goto_0
    new-instance p3, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    const-string v0, "SQL \u5220\u9664\u5f02\u5e38: "

    .line 79
    .line 80
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string p2, " table="

    .line 91
    .line 92
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-direct {p0, p1}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->log(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    return v1
.end method

.method public getCoreStorage()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->coreStorage:Ljava/lang/Object;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->coreStorage:Ljava/lang/Object;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :try_start_0
    iget-object v1, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->dexFinder:Lh/Hchat/dexkit/DexFinder;

    .line 10
    .line 11
    iget-object v1, v1, Lh/Hchat/dexkit/DexFinder;->coreStorageGetter:Ljava/lang/reflect/Method;

    .line 12
    .line 13
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    move-object v2, v0

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    iget-object v2, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->dexFinder:Lh/Hchat/dexkit/DexFinder;

    .line 22
    .line 23
    iget-object v2, v2, Lh/Hchat/dexkit/DexFinder;->mmKernelClass:Ljava/lang/Class;

    .line 24
    .line 25
    :goto_0
    const/4 v3, 0x0

    .line 26
    new-array v3, v3, [Ljava/lang/Object;

    .line 27
    .line 28
    invoke-static {v1, v2, v3}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    iput-object v1, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->coreStorage:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    return-object v1

    .line 37
    :catchall_0
    move-exception v1

    .line 38
    new-instance v2, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string v3, "\u83b7\u53d6 CoreStorage \u5931\u8d25: "

    .line 41
    .line 42
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-direct {p0, v1}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->log(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    :cond_2
    return-object v0
.end method

.method public insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    .locals 7

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide/16 v1, -0x1

    .line 6
    .line 7
    if-nez v0, :cond_8

    .line 8
    .line 9
    if-nez p3, :cond_0

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_0
    invoke-direct {p0}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->ensureReady()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    return-wide v1

    .line 19
    :cond_1
    iget-object v0, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->insertMethods:Ljava/util/List;

    .line 20
    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    iget-object v0, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->dbWrapper:Ljava/lang/Object;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-direct {p0, v0}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->findInsertMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->insertMethods:Ljava/util/List;

    .line 34
    .line 35
    :cond_2
    if-eqz v0, :cond_7

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_3

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    :catchall_0
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_6

    .line 53
    .line 54
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    check-cast v3, Ljava/lang/reflect/Method;

    .line 59
    .line 60
    :try_start_0
    iget-object v4, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->dbWrapper:Ljava/lang/Object;

    .line 61
    .line 62
    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-static {v3, v4, v5}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    instance-of v4, v3, Ljava/lang/Number;

    .line 71
    .line 72
    if-eqz v4, :cond_5

    .line 73
    .line 74
    check-cast v3, Ljava/lang/Number;

    .line 75
    .line 76
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 77
    .line 78
    .line 79
    move-result-wide v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    goto :goto_0

    .line 81
    :cond_5
    move-wide v3, v1

    .line 82
    :goto_0
    const-wide/16 v5, 0x0

    .line 83
    .line 84
    cmp-long v5, v3, v5

    .line 85
    .line 86
    if-ltz v5, :cond_4

    .line 87
    .line 88
    return-wide v3

    .line 89
    :cond_6
    const-string p2, "SQL \u63d2\u5165\u5931\u8d25: table="

    .line 90
    .line 91
    invoke-static {p2, p1}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-direct {p0, p1}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->log(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    return-wide v1

    .line 99
    :cond_7
    :goto_1
    iget-object p1, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->dbWrapper:Ljava/lang/Object;

    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    const-string p2, "\u672a\u627e\u5230 SqliteDB \u63d2\u5165\u65b9\u6cd5: "

    .line 110
    .line 111
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-direct {p0, p1}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->log(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    :cond_8
    :goto_2
    return-wide v1
.end method

.method public isAvailable()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->dexFinder:Lh/Hchat/dexkit/DexFinder;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, v0, Lh/Hchat/dexkit/DexFinder;->coreStorageGetter:Ljava/lang/reflect/Method;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Lh/Hchat/dexkit/DexFinder;->sqliteDbWrapperClass:Ljava/lang/Class;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public isReady()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->dbWrapper:Ljava/lang/Object;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->queryMethod:Ljava/lang/reflect/Method;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public messageTableForTalker(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, ""

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object v1

    .line 10
    :cond_0
    iget-object v0, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->messageTableCache:Ljava/util/Map;

    .line 11
    .line 12
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_1
    invoke-direct {p0}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->ensureReady()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_2

    .line 30
    .line 31
    return-object v1

    .line 32
    :cond_2
    invoke-direct {p0, p1}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->invokeMessageTableMethod(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-direct {p0, v0}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->isUsableMessageTable(Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_3

    .line 41
    .line 42
    iget-object v1, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->messageTableCache:Ljava/util/Map;

    .line 43
    .line 44
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_3
    invoke-direct {p0, p1}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->findMessageTableMethod(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-direct {p0, v0}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->isUsableMessageTable(Ljava/lang/String;)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_4

    .line 57
    .line 58
    iget-object v1, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->messageTableCache:Ljava/util/Map;

    .line 59
    .line 60
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    return-object v0

    .line 64
    :cond_4
    return-object v1
.end method

.method public messageTables()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->messageTables:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    invoke-direct {p0}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->ensureReady()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_1
    monitor-enter p0

    .line 19
    :try_start_0
    iget-object v0, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->messageTables:Ljava/util/List;

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    iget-object v0, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->messageTables:Ljava/util/List;

    .line 24
    .line 25
    monitor-exit p0

    .line 26
    return-object v0

    .line 27
    :catchall_0
    move-exception v0

    .line 28
    goto :goto_1

    .line 29
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    const-string v1, "SELECT name FROM sqlite_master WHERE type=\'table\' AND name NOT LIKE \'sqlite_%\'"

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    invoke-virtual {p0, v1, v2}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->query(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    :cond_3
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_4

    .line 50
    .line 51
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    check-cast v2, Ljava/util/Map;

    .line 56
    .line 57
    const-string v3, "name"

    .line 58
    .line 59
    invoke-static {v2, v3}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->stringValue(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-direct {p0, v2}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->isLikelyMessageTable(Ljava/lang/String;)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_3

    .line 68
    .line 69
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_4
    iput-object v0, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->messageTables:Ljava/util/List;

    .line 74
    .line 75
    monitor-exit p0

    .line 76
    return-object v0

    .line 77
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    throw v0
.end method

.method public nativeMessageById(J)Ljava/lang/Object;
    .locals 6

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-lez v0, :cond_7

    .line 7
    .line 8
    iget-object v0, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->dexFinder:Lh/Hchat/dexkit/DexFinder;

    .line 9
    .line 10
    if-eqz v0, :cond_7

    .line 11
    .line 12
    iget-object v0, v0, Lh/Hchat/dexkit/DexFinder;->localMessageClass:Ljava/lang/Class;

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    invoke-direct {p0}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->ensureReady()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    return-object v1

    .line 24
    :cond_1
    iget-object v0, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->messageStorage:Ljava/lang/Object;

    .line 25
    .line 26
    iget-object v2, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->nativeMessageByIdMethod:Ljava/lang/reflect/Method;

    .line 27
    .line 28
    invoke-direct {p0, v0, v2, p1, p2}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->invokeNativeMessageById(Ljava/lang/Object;Ljava/lang/reflect/Method;J)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    return-object v0

    .line 35
    :cond_2
    invoke-virtual {p0}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->getCoreStorage()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-nez v0, :cond_3

    .line 40
    .line 41
    return-object v1

    .line 42
    :cond_3
    new-instance v2, Ljava/util/HashSet;

    .line 43
    .line 44
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-direct {p0, v0}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->storageFieldObjects(Ljava/lang/Object;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    :cond_4
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_7

    .line 60
    .line 61
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    if-eqz v3, :cond_4

    .line 66
    .line 67
    invoke-virtual {v2, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-eqz v4, :cond_5

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_5
    invoke-virtual {v2, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    invoke-direct {p0, v3}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->findNativeMessageByIdMethod(Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-direct {p0, v3, v4, p1, p2}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->invokeNativeMessageById(Ljava/lang/Object;Ljava/lang/reflect/Method;J)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    if-nez v5, :cond_6

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_6
    iput-object v3, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->messageStorage:Ljava/lang/Object;

    .line 89
    .line 90
    iput-object v4, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->nativeMessageByIdMethod:Ljava/lang/reflect/Method;

    .line 91
    .line 92
    return-object v5

    .line 93
    :cond_7
    :goto_1
    return-object v1
.end method

.method public query(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, p2}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto :goto_3

    .line 13
    :cond_0
    :try_start_0
    invoke-interface {p1}, Landroid/database/Cursor;->getColumnNames()[Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    if-eqz p2, :cond_3

    .line 18
    .line 19
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    new-instance v1, Ljava/util/HashMap;

    .line 27
    .line 28
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 29
    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    :goto_0
    array-length v3, p2

    .line 33
    if-ge v2, v3, :cond_2

    .line 34
    .line 35
    aget-object v3, p2, v2

    .line 36
    .line 37
    invoke-direct {p0, p1, v2}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->cursorValue(Landroid/database/Cursor;I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    add-int/lit8 v2, v2, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception p2

    .line 48
    goto :goto_2

    .line 49
    :cond_2
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    .line 53
    .line 54
    .line 55
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    if-nez v1, :cond_1

    .line 57
    .line 58
    :try_start_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 59
    .line 60
    .line 61
    return-object v0

    .line 62
    :cond_3
    :goto_1
    :try_start_2
    invoke-interface {p1}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 63
    .line 64
    .line 65
    :catchall_1
    return-object v0

    .line 66
    :goto_2
    :try_start_3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 69
    .line 70
    .line 71
    const-string v2, "SQL \u7ed3\u679c\u8bfb\u53d6\u5f02\u5e38: "

    .line 72
    .line 73
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    invoke-direct {p0, p2}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->log(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 88
    .line 89
    .line 90
    :try_start_4
    invoke-interface {p1}, Landroid/database/Cursor;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 91
    .line 92
    .line 93
    :catchall_2
    :goto_3
    return-object v0

    .line 94
    :catchall_3
    move-exception p2

    .line 95
    :try_start_5
    invoke-interface {p1}, Landroid/database/Cursor;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 96
    .line 97
    .line 98
    :catchall_4
    throw p2
.end method

.method public queryFirstString(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "SQL \u5355\u503c\u8bfb\u53d6\u5f02\u5e38: "

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string p2, ""

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    return-object p2

    .line 12
    :cond_0
    :try_start_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 13
    .line 14
    .line 15
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    :try_start_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    .line 20
    .line 21
    :catchall_0
    return-object p2

    .line 22
    :cond_1
    :try_start_2
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/4 v2, 0x0

    .line 27
    if-nez v1, :cond_2

    .line 28
    .line 29
    invoke-interface {p1, p3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result p3

    .line 33
    goto :goto_0

    .line 34
    :catchall_1
    move-exception p3

    .line 35
    goto :goto_2

    .line 36
    :cond_2
    move p3, v2

    .line 37
    :goto_0
    if-gez p3, :cond_3

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_3
    move v2, p3

    .line 41
    :goto_1
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 45
    if-eqz p3, :cond_4

    .line 46
    .line 47
    move-object p2, p3

    .line 48
    :cond_4
    :try_start_3
    invoke-interface {p1}, Landroid/database/Cursor;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 49
    .line 50
    .line 51
    :catchall_2
    return-object p2

    .line 52
    :goto_2
    :try_start_4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p3

    .line 61
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p3

    .line 68
    invoke-direct {p0, p3}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->log(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 69
    .line 70
    .line 71
    :try_start_5
    invoke-interface {p1}, Landroid/database/Cursor;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 72
    .line 73
    .line 74
    :catchall_3
    return-object p2

    .line 75
    :catchall_4
    move-exception p2

    .line 76
    :try_start_6
    invoke-interface {p1}, Landroid/database/Cursor;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 77
    .line 78
    .line 79
    :catchall_5
    throw p2
.end method

.method public quoteTable(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->isSafeTableName(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v0, "`"

    .line 8
    .line 9
    invoke-static {v0, p1, v0}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    const-string p1, ""

    .line 15
    .line 16
    return-object p1
.end method

.method public rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    .locals 2

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    invoke-direct {p0}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->ensureReady()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    return-object v1

    .line 16
    :cond_1
    const/4 v0, 0x1

    .line 17
    invoke-direct {p0, p1, p2, v0}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->rawQueryInternal(Ljava/lang/String;[Ljava/lang/String;Z)Landroid/database/Cursor;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method

.method public storageObjectForMethod(Ljava/lang/reflect/Method;)Ljava/lang/Object;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-nez p1, :cond_1

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget-object v2, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->storageObjectCache:Ljava/util/Map;

    .line 17
    .line 18
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    if-eqz v2, :cond_3

    .line 23
    .line 24
    invoke-virtual {p1, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_2

    .line 29
    .line 30
    return-object v2

    .line 31
    :cond_2
    iget-object v2, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->storageObjectCache:Ljava/util/Map;

    .line 32
    .line 33
    invoke-interface {v2, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    :cond_3
    invoke-virtual {p0}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->getCoreStorage()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    if-nez v2, :cond_4

    .line 41
    .line 42
    return-object v0

    .line 43
    :cond_4
    new-instance v3, Ljava/util/IdentityHashMap;

    .line 44
    .line 45
    invoke-direct {v3}, Ljava/util/IdentityHashMap;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-static {v3}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    new-instance v4, Ljava/util/ArrayDeque;

    .line 53
    .line 54
    invoke-direct {v4}, Ljava/util/ArrayDeque;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v4, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    :cond_5
    :goto_0
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-nez v2, :cond_8

    .line 65
    .line 66
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    if-eqz v2, :cond_5

    .line 71
    .line 72
    invoke-interface {v3, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    if-eqz v5, :cond_6

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_6
    invoke-interface {v3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    if-eqz v5, :cond_7

    .line 87
    .line 88
    iget-object p1, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->storageObjectCache:Ljava/util/Map;

    .line 89
    .line 90
    invoke-interface {p1, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    return-object v2

    .line 94
    :cond_7
    invoke-direct {p0, v2, v4, v3}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->enqueueNestedObjects(Ljava/lang/Object;Ljava/util/ArrayDeque;Ljava/util/Set;)V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_8
    return-object v0
.end method

.method public update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 3

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-nez v0, :cond_5

    .line 7
    .line 8
    if-nez p2, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    invoke-direct {p0}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->ensureReady()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    iget-object v0, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->updateMethod:Ljava/lang/reflect/Method;

    .line 19
    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    iget-object v0, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->dbWrapper:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-direct {p0, v0}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->findUpdateMethod(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->updateMethod:Ljava/lang/reflect/Method;

    .line 33
    .line 34
    :cond_2
    iget-object v2, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->dbWrapper:Ljava/lang/Object;

    .line 35
    .line 36
    if-nez v0, :cond_3

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    const-string p2, "\u672a\u627e\u5230 SqliteDB \u66f4\u65b0\u65b9\u6cd5: "

    .line 47
    .line 48
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-direct {p0, p1}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->log(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return v1

    .line 56
    :cond_3
    :try_start_0
    filled-new-array {p1, p2, p3, p4}, [Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-static {v0, v2, p2}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    instance-of p3, p2, Ljava/lang/Number;

    .line 65
    .line 66
    if-eqz p3, :cond_4

    .line 67
    .line 68
    check-cast p2, Ljava/lang/Number;

    .line 69
    .line 70
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 71
    .line 72
    .line 73
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    return p1

    .line 75
    :catchall_0
    move-exception p2

    .line 76
    goto :goto_0

    .line 77
    :cond_4
    return v1

    .line 78
    :goto_0
    new-instance p3, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    const-string p4, "SQL \u66f4\u65b0\u5f02\u5e38: "

    .line 81
    .line 82
    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string p2, " table="

    .line 93
    .line 94
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-direct {p0, p1}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->log(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    :cond_5
    :goto_1
    return v1
.end method

.method public updateNativeMessageContent(JLjava/lang/String;Ljava/lang/Object;)Z
    .locals 6

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-lez v0, :cond_9

    .line 7
    .line 8
    iget-object v0, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->dexFinder:Lh/Hchat/dexkit/DexFinder;

    .line 9
    .line 10
    if-eqz v0, :cond_9

    .line 11
    .line 12
    iget-object v0, v0, Lh/Hchat/dexkit/DexFinder;->localMessageClass:Ljava/lang/Class;

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    goto/16 :goto_3

    .line 17
    .line 18
    :cond_0
    invoke-virtual {v0, p4}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-virtual {p0, p1, p2}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->nativeMessageById(J)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p4

    .line 29
    :goto_0
    if-nez p4, :cond_2

    .line 30
    .line 31
    return v1

    .line 32
    :cond_2
    invoke-direct {p0, p4}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->ensureNativeMessageUpdateMethod(Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget-object v2, p0, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->nativeMessageUpdateStorage:Ljava/lang/Object;

    .line 37
    .line 38
    if-eqz v0, :cond_9

    .line 39
    .line 40
    if-nez v2, :cond_3

    .line 41
    .line 42
    goto :goto_3

    .line 43
    :cond_3
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    const-string v4, "field_content"

    .line 48
    .line 49
    invoke-static {v3, v4}, Lh/Hchat/utils/KavaReflector;->findFieldRecursive(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    if-nez v3, :cond_4

    .line 54
    .line 55
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    const-string v4, "content"

    .line 60
    .line 61
    invoke-static {v3, v4}, Lh/Hchat/utils/KavaReflector;->findFieldRecursive(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    :cond_4
    if-eqz v3, :cond_9

    .line 66
    .line 67
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    const-class v5, Ljava/lang/String;

    .line 72
    .line 73
    if-eq v4, v5, :cond_5

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_5
    invoke-static {v3, p4}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-static {v3, p4, p3}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p3

    .line 84
    if-nez p3, :cond_6

    .line 85
    .line 86
    return v1

    .line 87
    :cond_6
    :try_start_0
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 88
    .line 89
    .line 90
    move-result-object p3

    .line 91
    filled-new-array {p3, p4}, [Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p3

    .line 95
    invoke-static {v0, v2, p3}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p3

    .line 99
    instance-of v0, p3, Ljava/lang/Number;

    .line 100
    .line 101
    if-eqz v0, :cond_7

    .line 102
    .line 103
    check-cast p3, Ljava/lang/Number;

    .line 104
    .line 105
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 106
    .line 107
    .line 108
    move-result p3

    .line 109
    goto :goto_1

    .line 110
    :catchall_0
    move-exception p3

    .line 111
    goto :goto_2

    .line 112
    :cond_7
    move p3, v1

    .line 113
    :goto_1
    if-lez p3, :cond_8

    .line 114
    .line 115
    const/4 p1, 0x1

    .line 116
    return p1

    .line 117
    :cond_8
    invoke-static {v3, p4, v4}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 118
    .line 119
    .line 120
    return v1

    .line 121
    :goto_2
    invoke-static {v3, p4, v4}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    new-instance p4, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    const-string v0, "\u539f\u751f\u6d88\u606f\u66f4\u65b0\u5f02\u5e38: "

    .line 127
    .line 128
    invoke-direct {p4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p3

    .line 135
    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    const-string p3, " msgId="

    .line 139
    .line 140
    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {p4, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-direct {p0, p1}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->log(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    :cond_9
    :goto_3
    return v1
.end method
