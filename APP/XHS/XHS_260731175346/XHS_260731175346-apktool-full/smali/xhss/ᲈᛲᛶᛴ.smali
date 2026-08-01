.class public final Lxhss/ᲈᛲᛶᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛱᛱᛲᲇ:Ljava/util/concurrent/ConcurrentHashMap;

.field public final ᛳᲁᲇᛸ:Lxhss/ᛳᛱᛲᲀ;

.field public final ᛷᛴᛷᛱ:Ljava/util/List;

.field public final ᛷᛵᛵᲈ:Ljava/lang/ThreadLocal;

.field public final ᲇᛴᲇᛵ:Lxhss/ᛱᲁᲈᛷ;

.field public final ᲇᛶᛴᲀ:Lxhss/ᛱᲀᛸᛸ;


# direct methods
.method public constructor <init>(Lxhss/ᛵᛶᛱᛸ;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lxhss/ᲈᛲᛶᛴ;->ᛷᛵᛵᲈ:Ljava/lang/ThreadLocal;

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lxhss/ᲈᛲᛶᛴ;->ᛱᛱᛲᲇ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 17
    .line 18
    iget-object v0, p1, Lxhss/ᛵᛶᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛱᛷᲈᛱ;

    .line 19
    .line 20
    new-instance v0, Ljava/util/HashMap;

    .line 21
    .line 22
    iget-object v1, p1, Lxhss/ᛵᛶᛱᛸ;->ᛱᛱᛲᲇ:Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 25
    .line 26
    .line 27
    iget-object v1, p1, Lxhss/ᛵᛶᛱᛸ;->ᛷᛴᛷᛱ:Lxhss/ᛱᲀᛸᛸ;

    .line 28
    .line 29
    iput-object v1, p0, Lxhss/ᲈᛲᛶᛴ;->ᲇᛶᛴᲀ:Lxhss/ᛱᲀᛸᛸ;

    .line 30
    .line 31
    iget-object v1, p1, Lxhss/ᛵᛶᛱᛸ;->ᛳᲁᲇᛸ:Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-static {v1}, Lxhss/ᛵᛶᛱᛸ;->ᛱᛱᛲᲇ(Ljava/util/AbstractCollection;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    iget-object v1, p1, Lxhss/ᛵᛶᛱᛸ;->ᲇᛴᲇᛵ:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-static {v1}, Lxhss/ᛵᛶᛱᛸ;->ᛱᛱᛲᲇ(Ljava/util/AbstractCollection;)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    iget-object v1, p1, Lxhss/ᛵᛶᛱᛸ;->ᲇᛶᛴᲀ:Ljava/util/ArrayDeque;

    .line 42
    .line 43
    invoke-static {v1}, Lxhss/ᛵᛶᛱᛸ;->ᛱᛱᛲᲇ(Ljava/util/AbstractCollection;)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    sget-object v2, Lxhss/ᛵᛶᛱᛸ;->ᛸᛶᲈᛶ:Lxhss/ᛵᛶᛱᛸ;

    .line 48
    .line 49
    if-ne p1, v2, :cond_0

    .line 50
    .line 51
    sget-object p1, Lxhss/ᛵᛶᛱᛸ;->ᲈᛳᲀ:Lxhss/ᛳᛱᛲᲀ;

    .line 52
    .line 53
    iput-object p1, p0, Lxhss/ᲈᛲᛶᛴ;->ᛳᲁᲇᛸ:Lxhss/ᛳᛱᛲᲀ;

    .line 54
    .line 55
    sget-object p1, Lxhss/ᛵᛶᛱᛸ;->ᛷᲁᲁ:Lxhss/ᛱᲁᲈᛷ;

    .line 56
    .line 57
    iput-object p1, p0, Lxhss/ᲈᛲᛶᛴ;->ᲇᛴᲇᛵ:Lxhss/ᛱᲁᲈᛷ;

    .line 58
    .line 59
    sget-object p1, Lxhss/ᛵᛶᛱᛸ;->ᲇᛸᛳᲁ:Ljava/util/List;

    .line 60
    .line 61
    iput-object p1, p0, Lxhss/ᲈᛲᛶᛴ;->ᛷᛴᛷᛱ:Ljava/util/List;

    .line 62
    .line 63
    return-void

    .line 64
    :cond_0
    new-instance v2, Lxhss/ᛳᛱᛲᲀ;

    .line 65
    .line 66
    const/4 v3, 0x4

    .line 67
    invoke-direct {v2, v3, v0, v1}, Lxhss/ᛳᛱᛲᲀ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iput-object v2, p0, Lxhss/ᲈᛲᛶᛴ;->ᛳᲁᲇᛸ:Lxhss/ᛳᛱᛲᲀ;

    .line 71
    .line 72
    new-instance v0, Lxhss/ᛱᲁᲈᛷ;

    .line 73
    .line 74
    invoke-direct {v0, v2}, Lxhss/ᛱᲁᲈᛷ;-><init>(Lxhss/ᛳᛱᛲᲀ;)V

    .line 75
    .line 76
    .line 77
    iput-object v0, p0, Lxhss/ᲈᛲᛶᛴ;->ᲇᛴᲇᛵ:Lxhss/ᛱᲁᲈᛷ;

    .line 78
    .line 79
    invoke-virtual {p1, v2, v0}, Lxhss/ᛵᛶᛱᛸ;->ᛷᛵᛵᲈ(Lxhss/ᛳᛱᛲᲀ;Lxhss/ᛱᲁᲈᛷ;)Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iput-object p1, p0, Lxhss/ᲈᛲᛶᛴ;->ᛷᛴᛷᛱ:Ljava/util/List;

    .line 84
    .line 85
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "{serializeNulls:false,factories:"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lxhss/ᲈᛲᛶᛴ;->ᛷᛴᛷᛱ:Ljava/util/List;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ",instanceCreators:"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lxhss/ᲈᛲᛶᛴ;->ᛳᲁᲇᛸ:Lxhss/ᛳᛱᛲᲀ;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p0, "}"

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public final ᛱᛱᛲᲇ(Ljava/lang/Class;)Lxhss/ᛲᛱᛶᛴ;
    .locals 1

    .line 1
    new-instance v0, Lxhss/ᛱᛳᲈᛷ;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lxhss/ᛱᛳᲈᛷ;-><init>(Ljava/lang/reflect/Type;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lxhss/ᲈᛲᛶᛴ;->ᛳᲁᲇᛸ(Lxhss/ᛱᛳᲈᛷ;)Lxhss/ᛲᛱᛶᛴ;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final ᛳᲁᲇᛸ(Lxhss/ᛱᛳᲈᛷ;)Lxhss/ᛲᛱᛶᛴ;
    .locals 9

    .line 1
    iget-object v0, p0, Lxhss/ᲈᛲᛶᛴ;->ᛱᛱᛲᲇ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lxhss/ᛲᛱᛶᛴ;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_0
    iget-object v1, p0, Lxhss/ᲈᛲᛶᛴ;->ᛷᛵᛵᲈ:Ljava/lang/ThreadLocal;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Ljava/util/Map;

    .line 19
    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    new-instance v2, Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    const/4 v3, 0x1

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Lxhss/ᛲᛱᛶᛴ;

    .line 37
    .line 38
    if-eqz v3, :cond_2

    .line 39
    .line 40
    return-object v3

    .line 41
    :cond_2
    const/4 v3, 0x0

    .line 42
    :goto_0
    :try_start_0
    new-instance v4, Lxhss/ᛵᛸᲁ;

    .line 43
    .line 44
    invoke-direct {v4}, Lxhss/ᛵᛸᲁ;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-interface {v2, p1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    iget-object v5, p0, Lxhss/ᲈᛲᛶᛴ;->ᛷᛴᛷᛱ:Ljava/util/List;

    .line 51
    .line 52
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    const/4 v6, 0x0

    .line 57
    move-object v7, v6

    .line 58
    :cond_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    if-eqz v8, :cond_5

    .line 63
    .line 64
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    check-cast v7, Lxhss/ᛴᛲᲀᛵ;

    .line 69
    .line 70
    invoke-interface {v7, p0, p1}, Lxhss/ᛴᛲᲀᛵ;->ᛷᛵᛵᲈ(Lxhss/ᲈᛲᛶᛴ;Lxhss/ᛱᛳᲈᛷ;)Lxhss/ᛲᛱᛶᛴ;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    if-eqz v7, :cond_3

    .line 75
    .line 76
    iget-object p0, v4, Lxhss/ᛵᛸᲁ;->ᛷᛵᛵᲈ:Lxhss/ᛲᛱᛶᛴ;

    .line 77
    .line 78
    if-nez p0, :cond_4

    .line 79
    .line 80
    iput-object v7, v4, Lxhss/ᛵᛸᲁ;->ᛷᛵᛵᲈ:Lxhss/ᛲᛱᛶᛴ;

    .line 81
    .line 82
    invoke-interface {v2, p1, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :catchall_0
    move-exception p0

    .line 87
    goto :goto_2

    .line 88
    :cond_4
    new-instance p0, Ljava/lang/AssertionError;

    .line 89
    .line 90
    const-string p1, "Delegate is already set"

    .line 91
    .line 92
    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    :cond_5
    :goto_1
    if-eqz v3, :cond_6

    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 99
    .line 100
    .line 101
    :cond_6
    if-eqz v7, :cond_8

    .line 102
    .line 103
    if-eqz v3, :cond_7

    .line 104
    .line 105
    invoke-virtual {v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    .line 106
    .line 107
    .line 108
    :cond_7
    return-object v7

    .line 109
    :cond_8
    const-string p0, "GSON (2.14.0) cannot handle "

    .line 110
    .line 111
    invoke-static {p1, p0}, Lxhss/ᛵᲈᲁᲈ;->ᛸᛶᛴᲈ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    return-object v6

    .line 115
    :goto_2
    if-eqz v3, :cond_9

    .line 116
    .line 117
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 118
    .line 119
    .line 120
    :cond_9
    throw p0
.end method

.method public final ᛷᛴᛷᛱ(Ljava/lang/Object;Ljava/lang/Class;Lxhss/ᛸᲈᲈᛶ;)V
    .locals 4

    .line 1
    const-string v0, "AssertionError (GSON 2.14.0): "

    .line 2
    .line 3
    new-instance v1, Lxhss/ᛱᛳᲈᛷ;

    .line 4
    .line 5
    invoke-direct {v1, p2}, Lxhss/ᛱᛳᲈᛷ;-><init>(Ljava/lang/reflect/Type;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v1}, Lxhss/ᲈᛲᛶᛴ;->ᛳᲁᲇᛸ(Lxhss/ᛱᛳᲈᛷ;)Lxhss/ᛲᛱᛶᛴ;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    iget p2, p3, Lxhss/ᛸᲈᲈᛶ;->ᛸᛲᲀᛵ:I

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    const/4 v2, 0x1

    .line 16
    if-ne p2, v1, :cond_0

    .line 17
    .line 18
    iput v2, p3, Lxhss/ᛸᲈᲈᛶ;->ᛸᛲᲀᛵ:I

    .line 19
    .line 20
    :cond_0
    iget-boolean v1, p3, Lxhss/ᛸᲈᲈᛶ;->ᛸᛷᲈᲈ:Z

    .line 21
    .line 22
    iget-boolean v3, p3, Lxhss/ᛸᲈᲈᛶ;->ᛷᲁᲁ:Z

    .line 23
    .line 24
    iput-boolean v2, p3, Lxhss/ᛸᲈᲈᛶ;->ᛸᛷᲈᲈ:Z

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    iput-boolean v2, p3, Lxhss/ᛸᲈᲈᛶ;->ᛷᲁᲁ:Z

    .line 28
    .line 29
    :try_start_0
    invoke-virtual {p0, p3, p1}, Lxhss/ᛲᛱᛶᛴ;->ᛳᲁᲇᛸ(Lxhss/ᛸᲈᲈᛶ;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    iput p2, p3, Lxhss/ᛸᲈᲈᛶ;->ᛸᛲᲀᛵ:I

    .line 33
    .line 34
    iput-boolean v1, p3, Lxhss/ᛸᲈᲈᛶ;->ᛸᛷᲈᲈ:Z

    .line 35
    .line 36
    iput-boolean v3, p3, Lxhss/ᛸᲈᲈᛶ;->ᛷᲁᲁ:Z

    .line 37
    .line 38
    return-void

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    goto :goto_0

    .line 41
    :catch_0
    move-exception p0

    .line 42
    :try_start_1
    new-instance p1, Ljava/lang/AssertionError;

    .line 43
    .line 44
    new-instance v2, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-direct {p1, v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    throw p1

    .line 64
    :catch_1
    move-exception p0

    .line 65
    new-instance p1, Lxhss/ᛱᲈᛲᛷ;

    .line 66
    .line 67
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    :goto_0
    iput p2, p3, Lxhss/ᛸᲈᲈᛶ;->ᛸᛲᲀᛵ:I

    .line 72
    .line 73
    iput-boolean v1, p3, Lxhss/ᛸᲈᲈᛶ;->ᛸᛷᲈᲈ:Z

    .line 74
    .line 75
    iput-boolean v3, p3, Lxhss/ᛸᲈᲈᛶ;->ᛷᲁᲁ:Z

    .line 76
    .line 77
    throw p0
.end method

.method public final ᛷᛵᛵᲈ(Ljava/lang/String;Lxhss/ᛱᛳᲈᛷ;)Ljava/lang/Object;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    new-instance v1, Ljava/io/StringReader;

    .line 6
    .line 7
    invoke-direct {v1, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance p1, Lxhss/ᛴᛷᛸᛷ;

    .line 11
    .line 12
    invoke-direct {p1, v1}, Lxhss/ᛴᛷᛸᛷ;-><init>(Ljava/io/StringReader;)V

    .line 13
    .line 14
    .line 15
    const-string v1, "AssertionError (GSON 2.14.0): "

    .line 16
    .line 17
    const-string v2, "Type adapter \'"

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    iput v3, p1, Lxhss/ᛴᛷᛸᛷ;->ᛶᲇᲈᛸ:I

    .line 21
    .line 22
    const/4 v4, 0x2

    .line 23
    :try_start_0
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᲁᲁᛴᲁ()I

    .line 24
    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-virtual {p0, p2}, Lxhss/ᲈᛲᛶᛴ;->ᛳᲁᲇᛸ(Lxhss/ᛱᛳᲈᛷ;)Lxhss/ᛲᛱᛶᛴ;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    iget-object p2, p2, Lxhss/ᛱᛳᲈᛷ;->ᛷᛵᛵᲈ:Ljava/lang/Class;

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Lxhss/ᛲᛱᛶᛴ;->ᛱᛱᛲᲇ(Lxhss/ᛴᛷᛸᛷ;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    invoke-static {p2}, Lxhss/ᛵᛶᲀᲇ;->ᛷᲁᲁ(Ljava/lang/Class;)Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    if-eqz v5, :cond_2

    .line 42
    .line 43
    invoke-virtual {v6, v5}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    if-eqz v6, :cond_1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    new-instance v6, Ljava/lang/ClassCastException;

    .line 51
    .line 52
    new-instance v7, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v7, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string p0, "\' returned wrong type; requested "

    .line 61
    .line 62
    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v7, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string p0, " but got instance of "

    .line 69
    .line 70
    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string p0, "\nVerify that the adapter was registered for the correct type."

    .line 81
    .line 82
    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-direct {v6, p0}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw v6
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    :catchall_0
    move-exception p0

    .line 94
    goto :goto_7

    .line 95
    :catch_0
    move-exception p0

    .line 96
    goto :goto_1

    .line 97
    :catch_1
    move-exception p0

    .line 98
    goto :goto_2

    .line 99
    :catch_2
    move-exception p0

    .line 100
    goto :goto_3

    .line 101
    :catch_3
    move-exception p0

    .line 102
    goto :goto_4

    .line 103
    :cond_2
    :goto_0
    iput v4, p1, Lxhss/ᛴᛷᛸᛷ;->ᛶᲇᲈᛸ:I

    .line 104
    .line 105
    move-object v0, v5

    .line 106
    goto :goto_5

    .line 107
    :goto_1
    :try_start_1
    new-instance p2, Ljava/lang/AssertionError;

    .line 108
    .line 109
    new-instance v0, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-direct {p2, v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 126
    .line 127
    .line 128
    throw p2

    .line 129
    :goto_2
    new-instance p2, Lxhss/ᛱᲈᛲᛷ;

    .line 130
    .line 131
    invoke-direct {p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 132
    .line 133
    .line 134
    throw p2

    .line 135
    :goto_3
    new-instance p2, Lxhss/ᛱᲈᛲᛷ;

    .line 136
    .line 137
    invoke-direct {p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 138
    .line 139
    .line 140
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 141
    :goto_4
    if-eqz v3, :cond_5

    .line 142
    .line 143
    iput v4, p1, Lxhss/ᛴᛷᛸᛷ;->ᛶᲇᲈᛸ:I

    .line 144
    .line 145
    :goto_5
    if-eqz v0, :cond_4

    .line 146
    .line 147
    :try_start_2
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᲁᲁᛴᲁ()I

    .line 148
    .line 149
    .line 150
    move-result p0

    .line 151
    const/16 p1, 0xa

    .line 152
    .line 153
    if-ne p0, p1, :cond_3

    .line 154
    .line 155
    goto :goto_6

    .line 156
    :cond_3
    new-instance p0, Lxhss/ᛱᲈᛲᛷ;

    .line 157
    .line 158
    const-string p1, "JSON document was not fully consumed."

    .line 159
    .line 160
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    throw p0
    :try_end_2
    .catch Lxhss/ᲈᲇᲁᲈ; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4

    .line 164
    :catch_4
    move-exception p0

    .line 165
    new-instance p1, Lxhss/ᛱᲈᛲᛷ;

    .line 166
    .line 167
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 168
    .line 169
    .line 170
    throw p1

    .line 171
    :catch_5
    move-exception p0

    .line 172
    new-instance p1, Lxhss/ᛱᲈᛲᛷ;

    .line 173
    .line 174
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 175
    .line 176
    .line 177
    throw p1

    .line 178
    :cond_4
    :goto_6
    return-object v0

    .line 179
    :cond_5
    :try_start_3
    new-instance p2, Lxhss/ᛱᲈᛲᛷ;

    .line 180
    .line 181
    invoke-direct {p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 182
    .line 183
    .line 184
    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 185
    :goto_7
    iput v4, p1, Lxhss/ᛴᛷᛸᛷ;->ᛶᲇᲈᛸ:I

    .line 186
    .line 187
    throw p0
.end method

.method public final ᲇᛴᲇᛵ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x1

    .line 4
    iget-object v3, p0, Lxhss/ᲈᛲᛶᛴ;->ᲇᛶᛴᲀ:Lxhss/ᛱᲀᛸᛸ;

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    new-instance p1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    :try_start_0
    new-instance v4, Lxhss/ᛳᛸᛶᛸ;

    .line 14
    .line 15
    invoke-direct {v4, p1}, Lxhss/ᛳᛸᛶᛸ;-><init>(Ljava/lang/StringBuilder;)V

    .line 16
    .line 17
    .line 18
    new-instance v5, Lxhss/ᛸᲈᲈᛶ;

    .line 19
    .line 20
    invoke-direct {v5, v4}, Lxhss/ᛸᲈᲈᛶ;-><init>(Ljava/io/Writer;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v5, v3}, Lxhss/ᛸᲈᲈᛶ;->ᛸᛶᛴᲈ(Lxhss/ᛱᲀᛸᛸ;)V

    .line 24
    .line 25
    .line 26
    iput-boolean v2, v5, Lxhss/ᛸᲈᲈᛶ;->ᛸᛷᲈᲈ:Z

    .line 27
    .line 28
    iput v1, v5, Lxhss/ᛸᲈᲈᛶ;->ᛸᛲᲀᛵ:I

    .line 29
    .line 30
    iput-boolean v0, v5, Lxhss/ᛸᲈᲈᛶ;->ᛷᲁᲁ:Z

    .line 31
    .line 32
    invoke-virtual {p0, v5}, Lxhss/ᲈᛲᛶᛴ;->ᲇᛶᛴᲀ(Lxhss/ᛸᲈᲈᛶ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :catch_0
    move-exception p0

    .line 41
    new-instance p1, Lxhss/ᛱᲈᛲᛷ;

    .line 42
    .line 43
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    throw p1

    .line 47
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    new-instance v5, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    .line 55
    .line 56
    :try_start_1
    new-instance v6, Lxhss/ᛳᛸᛶᛸ;

    .line 57
    .line 58
    invoke-direct {v6, v5}, Lxhss/ᛳᛸᛶᛸ;-><init>(Ljava/lang/StringBuilder;)V

    .line 59
    .line 60
    .line 61
    new-instance v7, Lxhss/ᛸᲈᲈᛶ;

    .line 62
    .line 63
    invoke-direct {v7, v6}, Lxhss/ᛸᲈᲈᛶ;-><init>(Ljava/io/Writer;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v7, v3}, Lxhss/ᛸᲈᲈᛶ;->ᛸᛶᛴᲈ(Lxhss/ᛱᲀᛸᛸ;)V

    .line 67
    .line 68
    .line 69
    iput-boolean v2, v7, Lxhss/ᛸᲈᲈᛶ;->ᛸᛷᲈᲈ:Z

    .line 70
    .line 71
    iput v1, v7, Lxhss/ᛸᲈᲈᛶ;->ᛸᛲᲀᛵ:I

    .line 72
    .line 73
    iput-boolean v0, v7, Lxhss/ᛸᲈᲈᛶ;->ᛷᲁᲁ:Z

    .line 74
    .line 75
    invoke-virtual {p0, p1, v4, v7}, Lxhss/ᲈᛲᛶᛴ;->ᛷᛴᛷᛱ(Ljava/lang/Object;Ljava/lang/Class;Lxhss/ᛸᲈᲈᛶ;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 76
    .line 77
    .line 78
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0

    .line 83
    :catch_1
    move-exception p0

    .line 84
    new-instance p1, Lxhss/ᛱᲈᛲᛷ;

    .line 85
    .line 86
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    throw p1
.end method

.method public final ᲇᛶᛴᲀ(Lxhss/ᛸᲈᲈᛶ;)V
    .locals 6

    .line 1
    sget-object p0, Lxhss/ᲇᛳᛷᛳ;->ᛱᛱᛲᲇ:Lxhss/ᲇᛳᛷᛳ;

    .line 2
    .line 3
    const-string v0, "AssertionError (GSON 2.14.0): "

    .line 4
    .line 5
    iget v1, p1, Lxhss/ᛸᲈᲈᛶ;->ᛸᛲᲀᛵ:I

    .line 6
    .line 7
    iget-boolean v2, p1, Lxhss/ᛸᲈᲈᛶ;->ᛸᛷᲈᲈ:Z

    .line 8
    .line 9
    iget-boolean v3, p1, Lxhss/ᛸᲈᲈᛶ;->ᛷᲁᲁ:Z

    .line 10
    .line 11
    const/4 v4, 0x1

    .line 12
    iput-boolean v4, p1, Lxhss/ᛸᲈᲈᛶ;->ᛸᛷᲈᲈ:Z

    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    iput-boolean v5, p1, Lxhss/ᛸᲈᲈᛶ;->ᛷᲁᲁ:Z

    .line 16
    .line 17
    const/4 v5, 0x2

    .line 18
    if-ne v1, v5, :cond_0

    .line 19
    .line 20
    iput v4, p1, Lxhss/ᛸᲈᲈᛶ;->ᛸᛲᲀᛵ:I

    .line 21
    .line 22
    :cond_0
    :try_start_0
    sget-object v4, Lxhss/ᛲᲁᛸᛴ;->ᛷᛵᛵᲈ:Lxhss/ᛲᲁᛸᛴ;

    .line 23
    .line 24
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-static {p1, p0}, Lxhss/ᛲᲁᛸᛴ;->ᲇᛶᛴᲀ(Lxhss/ᛸᲈᲈᛶ;Lxhss/ᛵᛷᛸᛶ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    iput v1, p1, Lxhss/ᛸᲈᲈᛶ;->ᛸᛲᲀᛵ:I

    .line 31
    .line 32
    iput-boolean v2, p1, Lxhss/ᛸᲈᲈᛶ;->ᛸᛷᲈᲈ:Z

    .line 33
    .line 34
    iput-boolean v3, p1, Lxhss/ᛸᲈᲈᛶ;->ᛷᲁᲁ:Z

    .line 35
    .line 36
    return-void

    .line 37
    :catch_0
    move-exception p0

    .line 38
    :try_start_1
    new-instance v4, Ljava/lang/AssertionError;

    .line 39
    .line 40
    new-instance v5, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-direct {v4, v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    throw v4

    .line 60
    :catchall_0
    move-exception p0

    .line 61
    goto :goto_0

    .line 62
    :catch_1
    move-exception p0

    .line 63
    new-instance v0, Lxhss/ᛱᲈᛲᛷ;

    .line 64
    .line 65
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 69
    :goto_0
    iput v1, p1, Lxhss/ᛸᲈᲈᛶ;->ᛸᛲᲀᛵ:I

    .line 70
    .line 71
    iput-boolean v2, p1, Lxhss/ᛸᲈᲈᛶ;->ᛸᛷᲈᲈ:Z

    .line 72
    .line 73
    iput-boolean v3, p1, Lxhss/ᛸᲈᲈᛶ;->ᛷᲁᲁ:Z

    .line 74
    .line 75
    throw p0
.end method
