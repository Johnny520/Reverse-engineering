.class public final Lyyds/ᛶᛵᛵᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static volatile ᛱᛳᲇ:Ljava/lang/reflect/Field;

.field public static volatile ᛱᲈᲁ:Ljava/lang/reflect/Field;

.field public static volatile ᛲᛲᲈᲈ:Ljava/lang/Class;

.field public static volatile ᛲᛳᛶᲁ:Ljava/lang/reflect/Field;

.field public static final ᛲᛴᛳᛲ:Ljava/util/Map;

.field public static volatile ᛲᛶᛱᲈ:Ljava/lang/reflect/Constructor;

.field public static final ᛲᲈᲁ:Lyyds/ᛶᛵᛵᲀ;

.field public static volatile ᛳᛸᛴᛶ:Ljava/lang/reflect/Method;

.field public static volatile ᛳᲁᲁᲇ:Ljava/lang/reflect/Method;

.field public static volatile ᛵᛶᛲᲀ:Ljava/lang/reflect/Field;

.field public static final ᛵᛸᛸᛷ:Landroid/os/Handler;

.field public static volatile ᛵᲀᛵᛸ:Ljava/lang/reflect/Field;

.field public static volatile ᛵᲀᲈᛴ:Ljava/lang/reflect/Field;

.field public static volatile ᛶᛳᛶᛵ:Ljava/lang/reflect/Field;

.field public static volatile ᛶᛷᛲᲁ:Lyyds/ᲁᛴᛸᲈ;

.field public static volatile ᛶᛸᲀᲁ:Ljava/lang/reflect/Method;

.field public static volatile ᛶᲈᛴᲈ:Ljava/lang/reflect/Method;

.field public static volatile ᛷᛲᲈᛱ:Ljava/lang/reflect/Method;

.field public static volatile ᛷᛵᲇᲀ:Ljava/lang/reflect/Method;

.field public static volatile ᛷᲈᲈᲁ:Ljava/lang/Class;

.field public static volatile ᲀᛲᛲᲇ:Ljava/lang/reflect/Field;

.field public static final ᲀᛲᛳᲀ:Ljava/lang/Object;

.field public static volatile ᲇᛱᛲ:Ljava/lang/reflect/Field;

.field public static final ᲇᲇᲇᛱ:Ljava/util/Map;

.field public static final ᲇᲈᛵᛷ:Lyyds/ᛱᲈᛴᛶ;

.field public static volatile ᲈᲀᛲᲀ:Ljava/lang/reflect/Field;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lyyds/ᛶᛵᛵᲀ;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lyyds/ᛶᛵᛵᲀ;->ᛲᲈᲁ:Lyyds/ᛶᛵᛵᲀ;

    .line 7
    .line 8
    new-instance v0, Landroid/os/Handler;

    .line 9
    .line 10
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lyyds/ᛶᛵᛵᲀ;->ᛵᛸᛸᛷ:Landroid/os/Handler;

    .line 18
    .line 19
    new-instance v0, Ljava/lang/Object;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lyyds/ᛶᛵᛵᲀ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 25
    .line 26
    new-instance v0, Lyyds/ᛱᲈᛴᛶ;

    .line 27
    .line 28
    const/high16 v1, 0x3f400000    # 0.75f

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    const/16 v3, 0x80

    .line 32
    .line 33
    invoke-direct {v0, v3, v1, v2}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    .line 34
    .line 35
    .line 36
    sput-object v0, Lyyds/ᛶᛵᛵᲀ;->ᲇᲈᛵᛷ:Lyyds/ᛱᲈᛴᛶ;

    .line 37
    .line 38
    invoke-static {}, Lyyds/ᛴᛷᛷᲇ;->ᛳᲁᲁᲇ()Ljava/util/Map;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    sput-object v0, Lyyds/ᛶᛵᛵᲀ;->ᛲᛴᛳᛲ:Ljava/util/Map;

    .line 43
    .line 44
    invoke-static {}, Lyyds/ᛴᛷᛷᲇ;->ᛳᲁᲁᲇ()Ljava/util/Map;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    sput-object v0, Lyyds/ᛶᛵᛵᲀ;->ᲇᲇᲇᛱ:Ljava/util/Map;

    .line 49
    .line 50
    return-void
.end method

.method public static ᛱᛳᲇ(Ljava/lang/Object;)Lcom/ss/android/ugc/aweme/comment/model/Comment;
    .locals 2

    .line 1
    sget-object v0, Lyyds/ᛶᛵᛵᲀ;->ᛲᛲᲈᲈ:Ljava/lang/Class;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    :goto_0
    return-object v1

    .line 14
    :cond_1
    :try_start_0
    sget-object v0, Lyyds/ᛶᛵᛵᲀ;->ᛱᛳᲇ:Ljava/lang/reflect/Field;

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    goto :goto_1

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    goto :goto_2

    .line 25
    :cond_2
    move-object p0, v1

    .line 26
    :goto_1
    instance-of v0, p0, Lcom/ss/android/ugc/aweme/comment/model/Comment;

    .line 27
    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    check-cast p0, Lcom/ss/android/ugc/aweme/comment/model/Comment;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    goto :goto_3

    .line 33
    :cond_3
    move-object p0, v1

    .line 34
    goto :goto_3

    .line 35
    :goto_2
    new-instance v0, Lyyds/ᲈᛵᛵᛴ;

    .line 36
    .line 37
    invoke-direct {v0, p0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    move-object p0, v0

    .line 41
    :goto_3
    instance-of v0, p0, Lyyds/ᲈᛵᛵᛴ;

    .line 42
    .line 43
    if-eqz v0, :cond_4

    .line 44
    .line 45
    goto :goto_4

    .line 46
    :cond_4
    move-object v1, p0

    .line 47
    :goto_4
    check-cast v1, Lcom/ss/android/ugc/aweme/comment/model/Comment;

    .line 48
    .line 49
    return-object v1
.end method

.method public static ᛱᲈᲁ(Ljava/lang/Object;Lyyds/ᛸᛵᲈᛵ;Ljava/lang/Object;Ljava/lang/String;)Z
    .locals 3

    .line 1
    sget-object v0, Lyyds/ᛶᛵᛵᲀ;->ᛲᛴᛳᛲ:Ljava/util/Map;

    .line 2
    .line 3
    const-wide v1, -0x2d31ce68a836eL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    monitor-enter v0

    .line 12
    :try_start_0
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lyyds/ᛸᛵᲈᛵ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 17
    .line 18
    monitor-exit v0

    .line 19
    const/4 v0, 0x0

    .line 20
    if-eq v1, p1, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    monitor-enter p1

    .line 24
    :try_start_1
    iget-object v1, p1, Lyyds/ᛸᛵᲈᛵ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v1, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    iget-object v1, p1, Lyyds/ᛸᛵᲈᛵ;->ᲀᛲᛳᲀ:Ljava/lang/ref/WeakReference;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    if-ne v1, p2, :cond_1

    .line 39
    .line 40
    const/4 v1, 0x1

    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception p0

    .line 43
    goto :goto_3

    .line 44
    :cond_1
    move v1, v0

    .line 45
    :goto_0
    monitor-exit p1

    .line 46
    if-nez v1, :cond_2

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    sget-object p1, Lyyds/ᛶᛵᛵᲀ;->ᛳᲁᲁᲇ:Ljava/lang/reflect/Method;

    .line 50
    .line 51
    if-nez p1, :cond_3

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    const-wide v1, -0x2d32ce68a836eL

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    invoke-static {p1}, Lyyds/ᲀᲀᛷᛸ;->ᛷᛸᲇᛶ([Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    check-cast p1, Ljava/lang/Class;

    .line 71
    .line 72
    if-nez p1, :cond_4

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_4
    invoke-static {p0, p1}, Lyyds/ᛶᛵᛵᲀ;->ᲇᲇᲇᛱ(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    if-nez p0, :cond_5

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_5
    if-eq p0, p2, :cond_6

    .line 83
    .line 84
    :goto_1
    return v0

    .line 85
    :cond_6
    invoke-static {p0}, Lyyds/ᛶᛵᛵᲀ;->ᛱᛳᲇ(Ljava/lang/Object;)Lcom/ss/android/ugc/aweme/comment/model/Comment;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    if-eqz p0, :cond_7

    .line 90
    .line 91
    iget-object p0, p0, Lcom/ss/android/ugc/aweme/comment/model/Comment;->cid:Ljava/lang/String;

    .line 92
    .line 93
    invoke-static {p0}, Lyyds/ᛶᛵᛵᲀ;->ᛷᛲᲈᛱ(Ljava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    goto :goto_2

    .line 98
    :cond_7
    const/4 p0, 0x0

    .line 99
    :goto_2
    invoke-static {p0, p3}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    return p0

    .line 104
    :goto_3
    monitor-exit p1

    .line 105
    throw p0

    .line 106
    :catchall_1
    move-exception p0

    .line 107
    monitor-exit v0

    .line 108
    throw p0
.end method

.method public static ᛲᛲᲈᲈ(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    const/4 v1, 0x1

    .line 6
    :try_start_0
    invoke-virtual {p0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    new-instance p1, Lyyds/ᲈᛵᛵᛴ;

    .line 16
    .line 17
    invoke-direct {p1, p0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    move-object p0, p1

    .line 21
    :goto_0
    instance-of p1, p0, Lyyds/ᲈᛵᛵᛴ;

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move-object v0, p0

    .line 27
    :goto_1
    return-object v0
.end method

.method public static ᛲᛳᛶᲁ(Ljava/lang/String;)Z
    .locals 3

    .line 1
    sget-object v0, Lyyds/ᛶᛵᛵᲀ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lyyds/ᛶᛵᛵᲀ;->ᲇᲈᛵᛷ:Lyyds/ᛱᲈᛴᛶ;

    .line 5
    .line 6
    invoke-virtual {v1, p0}, Lyyds/ᛱᲈᛴᛶ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Lyyds/ᛵᛲᲁᛴ;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    iget-boolean p0, p0, Lyyds/ᛵᛲᲁᛴ;->ᛲᲈᲁ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    if-ne p0, v2, :cond_0

    .line 19
    .line 20
    move v1, v2

    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    :goto_0
    monitor-exit v0

    .line 25
    return v1

    .line 26
    :goto_1
    monitor-exit v0

    .line 27
    throw p0
.end method

.method public static ᛲᛴᛳᛲ(Ljava/util/List;)Ljava/util/List;
    .locals 14

    .line 1
    const-wide v0, -0x2d1d7e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto/16 :goto_17

    .line 16
    .line 17
    :cond_0
    invoke-static {}, Lyyds/ᛶᛵᛵᲀ;->ᲀᛲᛳᲀ()Lyyds/ᲁᛴᛸᲈ;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Lyyds/ᛶᛵᛵᲀ;->ᲇᲈᛵᛷ(Lyyds/ᲁᛴᛸᲈ;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lyyds/ᲁᛴᛸᲈ;->ᛲᲈᲁ()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    goto/16 :goto_17

    .line 31
    .line 32
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 39
    .line 40
    .line 41
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    const/4 v3, 0x0

    .line 46
    move v4, v3

    .line 47
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    if-eqz v5, :cond_1c

    .line 52
    .line 53
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    invoke-static {v5}, Lyyds/ᛶᛵᛵᲀ;->ᛱᛳᲇ(Ljava/lang/Object;)Lcom/ss/android/ugc/aweme/comment/model/Comment;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    const/4 v7, 0x1

    .line 62
    if-eqz v6, :cond_4

    .line 63
    .line 64
    iget-object v8, v6, Lcom/ss/android/ugc/aweme/comment/model/Comment;->cid:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v8}, Lyyds/ᛶᛵᛵᲀ;->ᛷᛲᲈᛱ(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v8

    .line 70
    invoke-static {v6, v0}, Lyyds/ᛶᛵᛵᲀ;->ᛷᲈᲈᲁ(Lcom/ss/android/ugc/aweme/comment/model/Comment;Lyyds/ᲁᛴᛸᲈ;)Z

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    if-nez v6, :cond_3

    .line 75
    .line 76
    if-eqz v8, :cond_2

    .line 77
    .line 78
    invoke-static {v8}, Lyyds/ᛶᛵᛵᲀ;->ᛲᛳᛶᲁ(Ljava/lang/String;)Z

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    if-eqz v6, :cond_2

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_2
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_3
    :goto_1
    move v4, v7

    .line 90
    goto :goto_0

    .line 91
    :cond_4
    sget-object v6, Lyyds/ᛶᛵᛵᲀ;->ᛷᲈᲈᲁ:Ljava/lang/Class;

    .line 92
    .line 93
    const/4 v8, 0x0

    .line 94
    if-nez v6, :cond_5

    .line 95
    .line 96
    :goto_2
    move-object v6, v8

    .line 97
    goto :goto_6

    .line 98
    :cond_5
    invoke-virtual {v6, v5}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v6

    .line 102
    if-nez v6, :cond_6

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_6
    :try_start_0
    sget-object v6, Lyyds/ᛶᛵᛵᲀ;->ᛷᛲᲈᛱ:Ljava/lang/reflect/Method;

    .line 106
    .line 107
    if-eqz v6, :cond_7

    .line 108
    .line 109
    invoke-virtual {v6, v5, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    goto :goto_3

    .line 114
    :catchall_0
    move-exception v6

    .line 115
    goto :goto_4

    .line 116
    :cond_7
    move-object v6, v8

    .line 117
    :goto_3
    instance-of v9, v6, Lcom/ss/android/ugc/aweme/comment/model/Comment;

    .line 118
    .line 119
    if-eqz v9, :cond_8

    .line 120
    .line 121
    check-cast v6, Lcom/ss/android/ugc/aweme/comment/model/Comment;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 122
    .line 123
    goto :goto_5

    .line 124
    :cond_8
    move-object v6, v8

    .line 125
    goto :goto_5

    .line 126
    :goto_4
    new-instance v9, Lyyds/ᲈᛵᛵᛴ;

    .line 127
    .line 128
    invoke-direct {v9, v6}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 129
    .line 130
    .line 131
    move-object v6, v9

    .line 132
    :goto_5
    instance-of v9, v6, Lyyds/ᲈᛵᛵᛴ;

    .line 133
    .line 134
    if-eqz v9, :cond_9

    .line 135
    .line 136
    move-object v6, v8

    .line 137
    :cond_9
    check-cast v6, Lcom/ss/android/ugc/aweme/comment/model/Comment;

    .line 138
    .line 139
    :goto_6
    if-nez v6, :cond_a

    .line 140
    .line 141
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_a
    sget-object v9, Lyyds/ᛶᛵᛵᲀ;->ᛷᲈᲈᲁ:Ljava/lang/Class;

    .line 146
    .line 147
    if-nez v9, :cond_b

    .line 148
    .line 149
    :goto_7
    move-object v9, v8

    .line 150
    goto :goto_b

    .line 151
    :cond_b
    invoke-virtual {v9, v5}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v9

    .line 155
    if-nez v9, :cond_c

    .line 156
    .line 157
    goto :goto_7

    .line 158
    :cond_c
    :try_start_1
    sget-object v9, Lyyds/ᛶᛵᛵᲀ;->ᛷᛵᲇᲀ:Ljava/lang/reflect/Method;

    .line 159
    .line 160
    if-eqz v9, :cond_d

    .line 161
    .line 162
    invoke-virtual {v9, v5, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v9

    .line 166
    goto :goto_8

    .line 167
    :catchall_1
    move-exception v9

    .line 168
    goto :goto_9

    .line 169
    :cond_d
    move-object v9, v8

    .line 170
    :goto_8
    instance-of v10, v9, Ljava/lang/Integer;

    .line 171
    .line 172
    if-eqz v10, :cond_e

    .line 173
    .line 174
    check-cast v9, Ljava/lang/Integer;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 175
    .line 176
    goto :goto_a

    .line 177
    :cond_e
    move-object v9, v8

    .line 178
    goto :goto_a

    .line 179
    :goto_9
    new-instance v10, Lyyds/ᲈᛵᛵᛴ;

    .line 180
    .line 181
    invoke-direct {v10, v9}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 182
    .line 183
    .line 184
    move-object v9, v10

    .line 185
    :goto_a
    instance-of v10, v9, Lyyds/ᲈᛵᛵᛴ;

    .line 186
    .line 187
    if-eqz v10, :cond_f

    .line 188
    .line 189
    move-object v9, v8

    .line 190
    :cond_f
    check-cast v9, Ljava/lang/Integer;

    .line 191
    .line 192
    :goto_b
    sget-object v10, Lyyds/ᛶᛵᛵᲀ;->ᛲᲈᲁ:Lyyds/ᛶᛵᛵᲀ;

    .line 193
    .line 194
    if-nez v9, :cond_10

    .line 195
    .line 196
    goto :goto_c

    .line 197
    :cond_10
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 198
    .line 199
    .line 200
    move-result v11

    .line 201
    if-ne v11, v7, :cond_11

    .line 202
    .line 203
    goto :goto_f

    .line 204
    :cond_11
    :goto_c
    if-nez v9, :cond_12

    .line 205
    .line 206
    goto :goto_d

    .line 207
    :cond_12
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 208
    .line 209
    .line 210
    move-result v11

    .line 211
    const/4 v12, 0x2

    .line 212
    if-eq v11, v12, :cond_18

    .line 213
    .line 214
    :goto_d
    if-nez v9, :cond_13

    .line 215
    .line 216
    goto :goto_e

    .line 217
    :cond_13
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 218
    .line 219
    .line 220
    move-result v9

    .line 221
    const/16 v11, 0x132

    .line 222
    .line 223
    if-ne v9, v11, :cond_14

    .line 224
    .line 225
    goto :goto_13

    .line 226
    :cond_14
    :goto_e
    invoke-virtual {v10, v6}, Lyyds/ᛶᛵᛵᲀ;->ᛷᛵᲇᲀ(Lcom/ss/android/ugc/aweme/comment/model/Comment;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v9

    .line 230
    if-nez v9, :cond_18

    .line 231
    .line 232
    :goto_f
    iget-object v9, v6, Lcom/ss/android/ugc/aweme/comment/model/Comment;->cid:Ljava/lang/String;

    .line 233
    .line 234
    invoke-static {v9}, Lyyds/ᛶᛵᛵᲀ;->ᛷᛲᲈᛱ(Ljava/lang/String;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v9

    .line 238
    invoke-static {v6, v0}, Lyyds/ᛶᛵᛵᲀ;->ᛷᲈᲈᲁ(Lcom/ss/android/ugc/aweme/comment/model/Comment;Lyyds/ᲁᛴᛸᲈ;)Z

    .line 239
    .line 240
    .line 241
    move-result v6

    .line 242
    if-eqz v9, :cond_16

    .line 243
    .line 244
    sget-object v10, Lyyds/ᛶᛵᛵᲀ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 245
    .line 246
    monitor-enter v10

    .line 247
    :try_start_2
    sget-object v11, Lyyds/ᛶᛵᛵᲀ;->ᲇᲈᛵᛷ:Lyyds/ᛱᲈᛴᛶ;

    .line 248
    .line 249
    invoke-virtual {v11, v9}, Lyyds/ᛱᲈᛴᛶ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v12

    .line 253
    check-cast v12, Lyyds/ᛵᛲᲁᛴ;

    .line 254
    .line 255
    new-instance v13, Lyyds/ᛵᛲᲁᛴ;

    .line 256
    .line 257
    if-eqz v12, :cond_15

    .line 258
    .line 259
    iget-object v8, v12, Lyyds/ᛵᛲᲁᛴ;->ᛵᛸᛸᛷ:Ljava/lang/Boolean;

    .line 260
    .line 261
    goto :goto_10

    .line 262
    :catchall_2
    move-exception p0

    .line 263
    goto :goto_11

    .line 264
    :cond_15
    :goto_10
    invoke-direct {v13, v6, v8}, Lyyds/ᛵᛲᲁᛴ;-><init>(ZLjava/lang/Boolean;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v11, v9, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 268
    .line 269
    .line 270
    monitor-exit v10

    .line 271
    goto :goto_12

    .line 272
    :goto_11
    monitor-exit v10

    .line 273
    throw p0

    .line 274
    :cond_16
    :goto_12
    if-eqz v6, :cond_17

    .line 275
    .line 276
    goto/16 :goto_1

    .line 277
    .line 278
    :cond_17
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    goto/16 :goto_0

    .line 282
    .line 283
    :cond_18
    :goto_13
    invoke-virtual {v10, v6}, Lyyds/ᛶᛵᛵᲀ;->ᛷᛵᲇᲀ(Lcom/ss/android/ugc/aweme/comment/model/Comment;)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v8

    .line 287
    invoke-static {v6, v0}, Lyyds/ᛶᛵᛵᲀ;->ᛷᲈᲈᲁ(Lcom/ss/android/ugc/aweme/comment/model/Comment;Lyyds/ᲁᛴᛸᲈ;)Z

    .line 288
    .line 289
    .line 290
    move-result v6

    .line 291
    if-nez v6, :cond_3

    .line 292
    .line 293
    if-eqz v8, :cond_19

    .line 294
    .line 295
    invoke-static {v8}, Lyyds/ᛶᛵᛵᲀ;->ᛲᛳᛶᲁ(Ljava/lang/String;)Z

    .line 296
    .line 297
    .line 298
    move-result v6

    .line 299
    if-eqz v6, :cond_19

    .line 300
    .line 301
    goto/16 :goto_1

    .line 302
    .line 303
    :cond_19
    if-eqz v8, :cond_1b

    .line 304
    .line 305
    sget-object v6, Lyyds/ᛶᛵᛵᲀ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 306
    .line 307
    monitor-enter v6

    .line 308
    :try_start_3
    sget-object v7, Lyyds/ᛶᛵᛵᲀ;->ᲇᲈᛵᛷ:Lyyds/ᛱᲈᛴᛶ;

    .line 309
    .line 310
    invoke-virtual {v7, v8}, Lyyds/ᛱᲈᛴᛶ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v9

    .line 314
    check-cast v9, Lyyds/ᛵᛲᲁᛴ;

    .line 315
    .line 316
    new-instance v10, Lyyds/ᛵᛲᲁᛴ;

    .line 317
    .line 318
    if-eqz v9, :cond_1a

    .line 319
    .line 320
    iget-boolean v9, v9, Lyyds/ᛵᛲᲁᛴ;->ᛲᲈᲁ:Z

    .line 321
    .line 322
    goto :goto_14

    .line 323
    :catchall_3
    move-exception p0

    .line 324
    goto :goto_15

    .line 325
    :cond_1a
    move v9, v3

    .line 326
    :goto_14
    sget-object v11, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 327
    .line 328
    invoke-direct {v10, v9, v11}, Lyyds/ᛵᛲᲁᛴ;-><init>(ZLjava/lang/Boolean;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v7, v8, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 332
    .line 333
    .line 334
    monitor-exit v6

    .line 335
    invoke-static {v8}, Lyyds/ᛶᛵᛵᲀ;->ᲇᛱᛲ(Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    goto :goto_16

    .line 339
    :goto_15
    monitor-exit v6

    .line 340
    throw p0

    .line 341
    :cond_1b
    :goto_16
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 342
    .line 343
    .line 344
    goto/16 :goto_0

    .line 345
    .line 346
    :cond_1c
    if-eqz v4, :cond_1d

    .line 347
    .line 348
    sget-object v0, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 349
    .line 350
    new-instance v2, Ljava/lang/StringBuilder;

    .line 351
    .line 352
    const-wide v3, -0x2d1dce68a836eL

    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v3

    .line 361
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 365
    .line 366
    .line 367
    move-result p0

    .line 368
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 369
    .line 370
    .line 371
    const-wide v3, -0x2d1f3e68a836eL

    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object p0

    .line 380
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 384
    .line 385
    .line 386
    move-result p0

    .line 387
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object p0

    .line 394
    invoke-virtual {v0, p0}, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ(Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    return-object v1

    .line 398
    :cond_1d
    :goto_17
    return-object p0
.end method

.method public static ᛲᲈᲁ(Ljava/lang/Object;)V
    .locals 3

    .line 1
    sget-object v0, Lyyds/ᛶᛵᛵᲀ;->ᛲᛴᛳᛲ:Ljava/util/Map;

    .line 2
    .line 3
    const-wide v1, -0x2d2bce68a836eL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    monitor-enter v0

    .line 12
    :try_start_0
    invoke-interface {v0, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lyyds/ᛸᛵᲈᛵ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    monitor-exit v0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-static {p0, v0}, Lyyds/ᛶᛵᛵᲀ;->ᛳᲁᲁᲇ(Lyyds/ᛸᛵᲈᛵ;Z)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void

    .line 26
    :catchall_0
    move-exception p0

    .line 27
    monitor-exit v0

    .line 28
    throw p0
.end method

.method public static ᛳᲁᲁᲇ(Lyyds/ᛸᛵᲈᛵ;Z)V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x0

    .line 3
    :try_start_0
    iput-boolean v0, p0, Lyyds/ᛸᛵᲈᛵ;->ᛲᛴᛳᛲ:Z

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    iput v1, p0, Lyyds/ᛸᛵᲈᛵ;->ᲇᲇᲇᛱ:I

    .line 7
    .line 8
    iput-boolean v0, p0, Lyyds/ᛸᛵᲈᛵ;->ᛶᛷᛲᲁ:Z

    .line 9
    .line 10
    iput-boolean v0, p0, Lyyds/ᛸᛵᲈᛵ;->ᛱᲈᲁ:Z

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iput-boolean v0, p0, Lyyds/ᛸᛵᲈᛵ;->ᛲᛳᛶᲁ:Z

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    :goto_0
    iget-wide v0, p0, Lyyds/ᛸᛵᲈᛵ;->ᛷᲈᲈᲁ:J

    .line 20
    .line 21
    const-wide/16 v2, 0x1

    .line 22
    .line 23
    add-long/2addr v0, v2

    .line 24
    iput-wide v0, p0, Lyyds/ᛸᛵᲈᛵ;->ᛷᲈᲈᲁ:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    monitor-exit p0

    .line 27
    return-void

    .line 28
    :goto_1
    monitor-exit p0

    .line 29
    throw p1
.end method

.method public static ᛵᛸᛸᛷ(Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    move-object/from16 v4, p6

    .line 10
    .line 11
    move-object/from16 v5, p7

    .line 12
    .line 13
    move-object/from16 v6, p8

    .line 14
    .line 15
    move-object/from16 v7, p9

    .line 16
    .line 17
    move-object/from16 v8, p10

    .line 18
    .line 19
    move-object/from16 v9, p11

    .line 20
    .line 21
    move-object/from16 v10, p12

    .line 22
    .line 23
    move-object/from16 v11, p13

    .line 24
    .line 25
    move-object/from16 v12, p14

    .line 26
    .line 27
    move-object/from16 v13, p15

    .line 28
    .line 29
    move-object/from16 v14, p16

    .line 30
    .line 31
    const/16 v16, 0x0

    .line 32
    .line 33
    const/4 v15, 0x1

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    invoke-virtual {v0, v15}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move-object/from16 v0, v16

    .line 41
    .line 42
    :goto_0
    sput-object v0, Lyyds/ᛶᛵᛵᲀ;->ᛱᲈᲁ:Ljava/lang/reflect/Field;

    .line 43
    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    invoke-virtual {v1, v15}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    move-object/from16 v1, v16

    .line 51
    .line 52
    :goto_1
    sput-object v1, Lyyds/ᛶᛵᛵᲀ;->ᛲᛳᛶᲁ:Ljava/lang/reflect/Field;

    .line 53
    .line 54
    sput-object p2, Lyyds/ᛶᛵᛵᲀ;->ᛷᲈᲈᲁ:Ljava/lang/Class;

    .line 55
    .line 56
    if-eqz v2, :cond_2

    .line 57
    .line 58
    invoke-virtual {v2, v15}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 59
    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_2
    move-object/from16 v2, v16

    .line 63
    .line 64
    :goto_2
    sput-object v2, Lyyds/ᛶᛵᛵᲀ;->ᛷᛲᲈᛱ:Ljava/lang/reflect/Method;

    .line 65
    .line 66
    if-eqz v3, :cond_3

    .line 67
    .line 68
    invoke-virtual {v3, v15}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 69
    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_3
    move-object/from16 v3, v16

    .line 73
    .line 74
    :goto_3
    sput-object v3, Lyyds/ᛶᛵᛵᲀ;->ᛷᛵᲇᲀ:Ljava/lang/reflect/Method;

    .line 75
    .line 76
    sput-object p5, Lyyds/ᛶᛵᛵᲀ;->ᛲᛲᲈᲈ:Ljava/lang/Class;

    .line 77
    .line 78
    if-eqz v4, :cond_4

    .line 79
    .line 80
    invoke-virtual {v4, v15}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 81
    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_4
    move-object/from16 v4, v16

    .line 85
    .line 86
    :goto_4
    sput-object v4, Lyyds/ᛶᛵᛵᲀ;->ᛱᛳᲇ:Ljava/lang/reflect/Field;

    .line 87
    .line 88
    if-eqz v5, :cond_5

    .line 89
    .line 90
    invoke-virtual {v5, v15}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 91
    .line 92
    .line 93
    goto :goto_5

    .line 94
    :cond_5
    move-object/from16 v5, v16

    .line 95
    .line 96
    :goto_5
    sput-object v5, Lyyds/ᛶᛵᛵᲀ;->ᛳᲁᲁᲇ:Ljava/lang/reflect/Method;

    .line 97
    .line 98
    if-eqz v6, :cond_6

    .line 99
    .line 100
    invoke-virtual {v6, v15}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 101
    .line 102
    .line 103
    goto :goto_6

    .line 104
    :cond_6
    move-object/from16 v6, v16

    .line 105
    .line 106
    :goto_6
    sput-object v6, Lyyds/ᛶᛵᛵᲀ;->ᲇᛱᛲ:Ljava/lang/reflect/Field;

    .line 107
    .line 108
    if-eqz v7, :cond_7

    .line 109
    .line 110
    invoke-virtual {v7, v15}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 111
    .line 112
    .line 113
    goto :goto_7

    .line 114
    :cond_7
    move-object/from16 v7, v16

    .line 115
    .line 116
    :goto_7
    sput-object v7, Lyyds/ᛶᛵᛵᲀ;->ᛶᛳᛶᛵ:Ljava/lang/reflect/Field;

    .line 117
    .line 118
    if-eqz v8, :cond_8

    .line 119
    .line 120
    invoke-virtual {v8, v15}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 121
    .line 122
    .line 123
    goto :goto_8

    .line 124
    :cond_8
    move-object/from16 v8, v16

    .line 125
    .line 126
    :goto_8
    sput-object v8, Lyyds/ᛶᛵᛵᲀ;->ᛵᛶᛲᲀ:Ljava/lang/reflect/Field;

    .line 127
    .line 128
    if-eqz v9, :cond_9

    .line 129
    .line 130
    invoke-virtual {v9, v15}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 131
    .line 132
    .line 133
    goto :goto_9

    .line 134
    :cond_9
    move-object/from16 v9, v16

    .line 135
    .line 136
    :goto_9
    sput-object v9, Lyyds/ᛶᛵᛵᲀ;->ᲀᛲᛲᲇ:Ljava/lang/reflect/Field;

    .line 137
    .line 138
    if-eqz v10, :cond_a

    .line 139
    .line 140
    invoke-virtual {v10, v15}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 141
    .line 142
    .line 143
    goto :goto_a

    .line 144
    :cond_a
    move-object/from16 v10, v16

    .line 145
    .line 146
    :goto_a
    sput-object v10, Lyyds/ᛶᛵᛵᲀ;->ᛳᛸᛴᛶ:Ljava/lang/reflect/Method;

    .line 147
    .line 148
    if-eqz v11, :cond_b

    .line 149
    .line 150
    invoke-virtual {v11, v15}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 151
    .line 152
    .line 153
    goto :goto_b

    .line 154
    :cond_b
    move-object/from16 v11, v16

    .line 155
    .line 156
    :goto_b
    sput-object v11, Lyyds/ᛶᛵᛵᲀ;->ᛶᲈᛴᲈ:Ljava/lang/reflect/Method;

    .line 157
    .line 158
    if-eqz v12, :cond_c

    .line 159
    .line 160
    invoke-virtual {v12, v15}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 161
    .line 162
    .line 163
    goto :goto_c

    .line 164
    :cond_c
    move-object/from16 v12, v16

    .line 165
    .line 166
    :goto_c
    sput-object v12, Lyyds/ᛶᛵᛵᲀ;->ᛶᛸᲀᲁ:Ljava/lang/reflect/Method;

    .line 167
    .line 168
    if-eqz v13, :cond_d

    .line 169
    .line 170
    invoke-virtual {v13, v15}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 171
    .line 172
    .line 173
    goto :goto_d

    .line 174
    :cond_d
    move-object/from16 v13, v16

    .line 175
    .line 176
    :goto_d
    sput-object v13, Lyyds/ᛶᛵᛵᲀ;->ᛵᲀᲈᛴ:Ljava/lang/reflect/Field;

    .line 177
    .line 178
    if-eqz v14, :cond_e

    .line 179
    .line 180
    invoke-virtual {v14, v15}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 181
    .line 182
    .line 183
    goto :goto_e

    .line 184
    :cond_e
    move-object/from16 v14, v16

    .line 185
    .line 186
    :goto_e
    sput-object v14, Lyyds/ᛶᛵᛵᲀ;->ᛲᛶᛱᲈ:Ljava/lang/reflect/Constructor;

    .line 187
    .line 188
    if-eqz p17, :cond_f

    .line 189
    .line 190
    move-object/from16 v0, p17

    .line 191
    .line 192
    invoke-virtual {v0, v15}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 193
    .line 194
    .line 195
    goto :goto_f

    .line 196
    :cond_f
    move-object/from16 v0, v16

    .line 197
    .line 198
    :goto_f
    sput-object v0, Lyyds/ᛶᛵᛵᲀ;->ᲈᲀᛲᲀ:Ljava/lang/reflect/Field;

    .line 199
    .line 200
    move-object/from16 v0, p18

    .line 201
    .line 202
    if-eqz v0, :cond_10

    .line 203
    .line 204
    invoke-virtual {v0, v15}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 205
    .line 206
    .line 207
    goto :goto_10

    .line 208
    :cond_10
    move-object/from16 v0, v16

    .line 209
    .line 210
    :goto_10
    sput-object v0, Lyyds/ᛶᛵᛵᲀ;->ᛵᲀᛵᛸ:Ljava/lang/reflect/Field;

    .line 211
    .line 212
    return-void
.end method

.method public static ᛶᛷᛲᲁ(Ljava/lang/Object;Lyyds/ᛸᛵᲈᛵ;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-static {p0, p1, p2, p3}, Lyyds/ᛶᛵᛵᲀ;->ᛱᲈᲁ(Ljava/lang/Object;Lyyds/ᛸᛵᲈᛵ;Ljava/lang/Object;Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    goto/16 :goto_5

    .line 8
    .line 9
    :cond_0
    sget-object p1, Lyyds/ᛶᛵᛵᲀ;->ᛶᲈᛴᲈ:Ljava/lang/reflect/Method;

    .line 10
    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    goto/16 :goto_5

    .line 14
    .line 15
    :cond_1
    sget-object v0, Lyyds/ᛶᛵᛵᲀ;->ᛶᛸᲀᲁ:Ljava/lang/reflect/Method;

    .line 16
    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    goto/16 :goto_5

    .line 20
    .line 21
    :cond_2
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const-wide v2, -0x2d26ce68a836eL

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    invoke-static {p0, v1}, Lyyds/ᛶᛵᛵᲀ;->ᲇᲇᲇᛱ(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    if-nez p0, :cond_3

    .line 38
    .line 39
    goto/16 :goto_5

    .line 40
    .line 41
    :cond_3
    sget-object v1, Lyyds/ᛶᛵᛵᲀ;->ᛲᛲᲈᲈ:Ljava/lang/Class;

    .line 42
    .line 43
    if-eqz v1, :cond_9

    .line 44
    .line 45
    invoke-static {p0, v1}, Lyyds/ᛶᛵᛵᲀ;->ᲇᲇᲇᛱ(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    if-eqz v1, :cond_9

    .line 50
    .line 51
    invoke-static {v1}, Lyyds/ᛶᛵᛵᲀ;->ᛱᛳᲇ(Ljava/lang/Object;)Lcom/ss/android/ugc/aweme/comment/model/Comment;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    const/4 v3, 0x0

    .line 56
    if-eqz v2, :cond_4

    .line 57
    .line 58
    iget-object v2, v2, Lcom/ss/android/ugc/aweme/comment/model/Comment;->cid:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {v2}, Lyyds/ᛶᛵᛵᲀ;->ᛷᛲᲈᛱ(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    goto :goto_0

    .line 65
    :cond_4
    move-object v2, v3

    .line 66
    :goto_0
    if-ne v1, p2, :cond_9

    .line 67
    .line 68
    invoke-static {v2, p3}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-nez v1, :cond_5

    .line 73
    .line 74
    goto/16 :goto_5

    .line 75
    .line 76
    :cond_5
    :try_start_0
    invoke-virtual {p1, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    instance-of v1, p1, Ljava/lang/Integer;

    .line 81
    .line 82
    if-eqz v1, :cond_6

    .line 83
    .line 84
    check-cast p1, Ljava/lang/Integer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :catchall_0
    move-exception p1

    .line 88
    goto :goto_1

    .line 89
    :cond_6
    move-object p1, v3

    .line 90
    goto :goto_2

    .line 91
    :goto_1
    new-instance v1, Lyyds/ᲈᛵᛵᛴ;

    .line 92
    .line 93
    invoke-direct {v1, p1}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    move-object p1, v1

    .line 97
    :goto_2
    instance-of v1, p1, Lyyds/ᲈᛵᛵᛴ;

    .line 98
    .line 99
    if-eqz v1, :cond_7

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_7
    move-object v3, p1

    .line 103
    :goto_3
    check-cast v3, Ljava/lang/Integer;

    .line 104
    .line 105
    if-eqz v3, :cond_9

    .line 106
    .line 107
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    const/4 v1, 0x4

    .line 112
    if-ne p1, v1, :cond_8

    .line 113
    .line 114
    goto :goto_5

    .line 115
    :cond_8
    :try_start_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    sget-object v0, Lyyds/ᛶᛵᛵᲀ;->ᲇᲇᲇᛱ:Ljava/util/Map;

    .line 127
    .line 128
    const-wide v1, -0x2d283e68a836eL

    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    new-instance v1, Lyyds/ᲇᲁᲀᛵ;

    .line 137
    .line 138
    new-instance v2, Ljava/lang/ref/WeakReference;

    .line 139
    .line 140
    invoke-direct {v2, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    invoke-direct {v1, p3, p1, v2}, Lyyds/ᲇᲁᲀᛵ;-><init>(Ljava/lang/String;ILjava/lang/ref/WeakReference;)V

    .line 144
    .line 145
    .line 146
    invoke-interface {v0, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    sget-object p0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 150
    .line 151
    goto :goto_4

    .line 152
    :catchall_1
    move-exception p0

    .line 153
    new-instance p1, Lyyds/ᲈᛵᛵᛴ;

    .line 154
    .line 155
    invoke-direct {p1, p0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 156
    .line 157
    .line 158
    move-object p0, p1

    .line 159
    :goto_4
    invoke-static {p0}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    if-eqz p0, :cond_9

    .line 164
    .line 165
    sget-object p1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 166
    .line 167
    const-wide p2, -0x2d296e68a836eL

    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    invoke-static {p2, p3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p2

    .line 176
    invoke-virtual {p1, p2, p0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 177
    .line 178
    .line 179
    :cond_9
    :goto_5
    return-void
.end method

.method public static ᛷᛲᲈᛱ(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-static {p0}, Lyyds/ᛲᲇᛸᲇ;->ᲁᛵᲁᲁ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-lez v0, :cond_0

    .line 18
    .line 19
    const-wide v0, -0x2d317e68a836eL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    const-wide v0, -0x2d319e68a836eL

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_0

    .line 48
    .line 49
    return-object p0

    .line 50
    :cond_0
    const/4 p0, 0x0

    .line 51
    return-object p0
.end method

.method public static ᛷᲈᲈᲁ(Lcom/ss/android/ugc/aweme/comment/model/Comment;Lyyds/ᲁᛴᛸᲈ;)Z
    .locals 3

    .line 1
    iget-boolean v0, p1, Lyyds/ᲁᛴᛸᲈ;->ᛵᛸᛸᛷ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-wide v1, -0x2d2dce68a836eL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object p0, p0, Lcom/ss/android/ugc/aweme/comment/model/Comment;->text:Ljava/lang/String;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    if-nez p0, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    iget-object p1, p1, Lyyds/ᲁᛴᛸᲈ;->ᛲᲈᲁ:Ljava/util/Set;

    .line 36
    .line 37
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_4

    .line 53
    .line 54
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {p0, v1, v0}, Lyyds/ᛲᲇᛸᲇ;->ᛵᲀᲈᛴ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_3

    .line 65
    .line 66
    :goto_0
    const/4 p0, 0x1

    .line 67
    return p0

    .line 68
    :cond_4
    :goto_1
    return v0
.end method

.method public static ᲀᛲᛳᲀ()Lyyds/ᲁᛴᛸᲈ;
    .locals 3

    .line 1
    sget-object v0, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lyyds/ᛷᛳᛲᛳ;->ᛶᛷᛶᛲ:Lyyds/ᛳᲀᛲ;

    .line 7
    .line 8
    sget-object v1, Lyyds/ᛷᛳᛲᛳ;->ᛵᛸᛸᛷ:[Lyyds/ᲀᛴᛶᲇ;

    .line 9
    .line 10
    const/16 v2, 0x4f

    .line 11
    .line 12
    aget-object v1, v1, v2

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lyyds/ᛳᲀᛲ;->ᛲᲈᲁ(Lyyds/ᲀᛴᛶᲇ;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Ljava/util/Set;

    .line 19
    .line 20
    new-instance v1, Lyyds/ᛳᛳᲀᲀ;

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    invoke-direct {v1, v2, v0}, Lyyds/ᛳᛳᲀᲀ;-><init>(ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    sget-object v0, Lyyds/ᛳᛲᲇᲇ;->ᛷᲈᲈᲁ:Lyyds/ᛳᛲᲇᲇ;

    .line 27
    .line 28
    new-instance v2, Lyyds/ᛵᛶᲀᛶ;

    .line 29
    .line 30
    invoke-direct {v2, v1, v0}, Lyyds/ᛵᛶᲀᛶ;-><init>(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛷᛴᲈᲀ;)V

    .line 31
    .line 32
    .line 33
    sget-object v0, Lyyds/ᛶᲀᛱᛱ;->ᛷᲈᲈᲁ:Lyyds/ᛶᲀᛱᛱ;

    .line 34
    .line 35
    invoke-static {v2, v0}, Lyyds/ᛷᛴᛳᛶ;->ᲀᛲᛲᲇ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛷᛴᲈᲀ;)Lyyds/ᛲᲈᲁᛱ;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v0}, Lyyds/ᛷᛴᛳᛶ;->ᛱᛳᛶᛳ(Lyyds/ᛵᲈᛴᛷ;)Ljava/util/Set;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    new-instance v1, Lyyds/ᲁᛴᛸᲈ;

    .line 44
    .line 45
    invoke-static {}, Lyyds/ᛷᛳᛲᛳ;->ᲈᛷᲈᛶ()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    invoke-direct {v1, v0, v2}, Lyyds/ᲁᛴᛸᲈ;-><init>(Ljava/util/Set;Z)V

    .line 50
    .line 51
    .line 52
    return-object v1
.end method

.method public static ᲇᛱᛲ(Ljava/lang/String;)V
    .locals 5

    .line 1
    sget-object v0, Lyyds/ᛶᛵᛵᲀ;->ᲇᲇᲇᛱ:Ljava/util/Map;

    .line 2
    .line 3
    const-wide v1, -0x2d343e68a836eL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    monitor-enter v0

    .line 12
    :try_start_0
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    new-instance v2, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_2

    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    move-object v4, v3

    .line 36
    check-cast v4, Ljava/util/Map$Entry;

    .line 37
    .line 38
    if-eqz p0, :cond_1

    .line 39
    .line 40
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    check-cast v4, Lyyds/ᲇᲁᲀᛵ;

    .line 45
    .line 46
    iget-object v4, v4, Lyyds/ᲇᲁᲀᛵ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v4, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-eqz v4, :cond_0

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :catchall_0
    move-exception p0

    .line 56
    goto :goto_4

    .line 57
    :cond_1
    :goto_1
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    new-instance p0, Ljava/util/ArrayList;

    .line 62
    .line 63
    const/16 v1, 0xa

    .line 64
    .line 65
    invoke-static {v2, v1}, Lyyds/ᛱᛱᛵᛲ;->ᛳᛸᛴᛶ(Ljava/lang/Iterable;I)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    invoke-direct {p0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_3

    .line 81
    .line 82
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    check-cast v2, Ljava/util/Map$Entry;

    .line 87
    .line 88
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    new-instance v4, Lkotlin/Pair;

    .line 97
    .line 98
    invoke-direct {v4, v3, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_3
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    if-eqz v2, :cond_4

    .line 114
    .line 115
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    check-cast v2, Lkotlin/Pair;

    .line 120
    .line 121
    invoke-virtual {v2}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    sget-object v3, Lyyds/ᛶᛵᛵᲀ;->ᲇᲇᲇᛱ:Ljava/util/Map;

    .line 126
    .line 127
    invoke-interface {v3, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 128
    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_4
    monitor-exit v0

    .line 132
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-eqz v0, :cond_5

    .line 137
    .line 138
    return-void

    .line 139
    :cond_5
    new-instance v0, Lyyds/ᛲᛳᛵᛱ;

    .line 140
    .line 141
    const/4 v1, 0x2

    .line 142
    invoke-direct {v0, v1, p0}, Lyyds/ᛲᛳᛵᛱ;-><init>(ILjava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-static {p0, v1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result p0

    .line 157
    if-eqz p0, :cond_6

    .line 158
    .line 159
    invoke-virtual {v0}, Lyyds/ᛲᛳᛵᛱ;->run()V

    .line 160
    .line 161
    .line 162
    return-void

    .line 163
    :cond_6
    sget-object p0, Lyyds/ᛶᛵᛵᲀ;->ᛵᛸᛸᛷ:Landroid/os/Handler;

    .line 164
    .line 165
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 166
    .line 167
    .line 168
    return-void

    .line 169
    :goto_4
    monitor-exit v0

    .line 170
    throw p0
.end method

.method public static ᲇᲇᲇᛱ(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lyyds/ᛱᛱᛸᛷ;

    .line 6
    .line 7
    const/16 v2, 0x1a

    .line 8
    .line 9
    invoke-direct {v1, v2}, Lyyds/ᛱᛱᛸᛷ;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Lyyds/ᛷᛴᛳᛶ;->ᛵᲀᲈᛴ(Ljava/lang/Object;Lyyds/ᛷᛴᲈᲀ;)Lyyds/ᛵᲈᛴᛷ;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, Lyyds/ᛱᛱᛸᛷ;

    .line 17
    .line 18
    const/16 v2, 0x1b

    .line 19
    .line 20
    invoke-direct {v1, v2}, Lyyds/ᛱᛱᛸᛷ;-><init>(I)V

    .line 21
    .line 22
    .line 23
    new-instance v2, Lyyds/ᲈᛸᲀᛱ;

    .line 24
    .line 25
    const/4 v3, 0x2

    .line 26
    invoke-direct {v2, v0, v1, v3}, Lyyds/ᲈᛸᲀᛱ;-><init>(Ljava/lang/Object;Lyyds/ᛷᛴᲈᲀ;I)V

    .line 27
    .line 28
    .line 29
    new-instance v0, Lyyds/ᛱᛱᛸᛷ;

    .line 30
    .line 31
    const/16 v1, 0x1c

    .line 32
    .line 33
    invoke-direct {v0, v1}, Lyyds/ᛱᛱᛸᛷ;-><init>(I)V

    .line 34
    .line 35
    .line 36
    invoke-static {v2, v0}, Lyyds/ᛷᛴᛳᛶ;->ᛶᛸᲀᲁ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛷᛴᲈᲀ;)Lyyds/ᛲᛶᛷᲇ;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    new-instance v1, Lyyds/ᛵᛶᛷᛸ;

    .line 41
    .line 42
    invoke-direct {v1, v0}, Lyyds/ᛵᛶᛷᛸ;-><init>(Lyyds/ᛲᛶᛷᲇ;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    :goto_0
    invoke-virtual {v1}, Lyyds/ᛵᛶᛷᛸ;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    invoke-virtual {v1}, Lyyds/ᛵᛶᛷᛸ;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, Ljava/lang/reflect/Field;

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    invoke-static {v0, p0}, Lyyds/ᛶᛵᛵᲀ;->ᛲᛲᲈᲈ(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    if-nez v0, :cond_2

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    invoke-virtual {p1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_0

    .line 80
    .line 81
    return-object v0

    .line 82
    :cond_3
    const/4 p0, 0x0

    .line 83
    return-object p0
.end method

.method public static ᲇᲈᛵᛷ(Lyyds/ᲁᛴᛸᲈ;)V
    .locals 2

    .line 1
    sget-object v0, Lyyds/ᛶᛵᛵᲀ;->ᛶᛷᛲᲁ:Lyyds/ᲁᛴᛸᲈ;

    .line 2
    .line 3
    invoke-static {v0, p0}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    sget-object v0, Lyyds/ᛶᛵᛵᲀ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 11
    .line 12
    monitor-enter v0

    .line 13
    :try_start_0
    sget-object v1, Lyyds/ᛶᛵᛵᲀ;->ᛶᛷᛲᲁ:Lyyds/ᲁᛴᛸᲈ;

    .line 14
    .line 15
    invoke-static {v1, p0}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    sput-object p0, Lyyds/ᛶᛵᛵᲀ;->ᛶᛷᛲᲁ:Lyyds/ᲁᛴᛸᲈ;

    .line 24
    .line 25
    sget-object p0, Lyyds/ᛶᛵᛵᲀ;->ᲇᲈᛵᛷ:Lyyds/ᛱᲈᛴᛶ;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/util/AbstractMap;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x1

    .line 31
    :goto_0
    monitor-exit v0

    .line 32
    if-nez p0, :cond_2

    .line 33
    .line 34
    :goto_1
    return-void

    .line 35
    :cond_2
    sget-object p0, Lyyds/ᛶᛵᛵᲀ;->ᛲᛴᛳᛲ:Ljava/util/Map;

    .line 36
    .line 37
    const-wide v0, -0x2d2cce68a836eL

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    monitor-enter p0

    .line 46
    :try_start_1
    invoke-interface {p0}, Ljava/util/Map;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    .line 48
    .line 49
    monitor-exit p0

    .line 50
    const/4 p0, 0x0

    .line 51
    invoke-static {p0}, Lyyds/ᛶᛵᛵᲀ;->ᲇᛱᛲ(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :catchall_0
    move-exception v0

    .line 56
    monitor-exit p0

    .line 57
    throw v0

    .line 58
    :catchall_1
    move-exception p0

    .line 59
    monitor-exit v0

    .line 60
    throw p0
.end method


# virtual methods
.method public final ᛷᛵᲇᲀ(Lcom/ss/android/ugc/aweme/comment/model/Comment;)Ljava/lang/String;
    .locals 9

    .line 1
    iget-object v0, p1, Lcom/ss/android/ugc/aweme/comment/model/Comment;->cid:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lyyds/ᛶᛵᛵᲀ;->ᛷᛲᲈᛱ(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p1, Lcom/ss/android/ugc/aweme/comment/model/Comment;->replyId:Ljava/lang/String;

    .line 8
    .line 9
    iget-object p1, p1, Lcom/ss/android/ugc/aweme/comment/model/Comment;->rootCommentId:Ljava/lang/String;

    .line 10
    .line 11
    filled-new-array {v1, p1}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, Lyyds/ᲀᲀᛷᛸ;->ᛵᛶᛲᲀ([Ljava/lang/Object;)Lyyds/ᛵᲈᛴᛷ;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    new-instance v1, Lyyds/ᲈᛳᲀᲈ;

    .line 20
    .line 21
    const-wide v2, -0x22bc4e68a836eL

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    const-wide v2, -0x22bd8e68a836eL

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    const/4 v7, 0x0

    .line 40
    const/4 v8, 0x7

    .line 41
    const/4 v2, 0x1

    .line 42
    const-class v4, Lyyds/ᛶᛵᛵᲀ;

    .line 43
    .line 44
    move-object v3, p0

    .line 45
    invoke-direct/range {v1 .. v8}, Lyyds/ᲈᛳᲀᲈ;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 46
    .line 47
    .line 48
    invoke-static {p1, v1}, Lyyds/ᛷᛴᛳᛶ;->ᲈᲀᛲᲀ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛷᛴᲈᲀ;)Lyyds/ᛲᲈᲁᛱ;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    new-instance p1, Lyyds/ᛵᛶᛷᛸ;

    .line 53
    .line 54
    invoke-direct {p1, p0}, Lyyds/ᛵᛶᛷᛸ;-><init>(Lyyds/ᛲᲈᲁᛱ;)V

    .line 55
    .line 56
    .line 57
    :cond_0
    invoke-virtual {p1}, Lyyds/ᛵᛶᛷᛸ;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    if-eqz p0, :cond_1

    .line 62
    .line 63
    invoke-virtual {p1}, Lyyds/ᛵᛶᛷᛸ;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    move-object v1, p0

    .line 68
    check-cast v1, Ljava/lang/String;

    .line 69
    .line 70
    invoke-static {v1, v0}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-nez v1, :cond_0

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    const/4 p0, 0x0

    .line 78
    :goto_0
    check-cast p0, Ljava/lang/String;

    .line 79
    .line 80
    return-object p0
.end method
