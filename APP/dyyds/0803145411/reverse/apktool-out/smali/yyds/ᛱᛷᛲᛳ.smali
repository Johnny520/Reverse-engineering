.class public final Lyyds/ᛱᛷᛲᛳ;
.super Lyyds/ᛱᛶᛶᲇ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛱᲈᲁ:Ljava/util/WeakHashMap;

.field public static final ᛲᛳᛶᲁ:Ljava/lang/ThreadLocal;

.field public static final ᛶᛷᛲᲁ:Landroid/os/Handler;

.field public static volatile ᛷᲈᲈᲁ:Ljava/lang/reflect/Method;

.field public static final ᲇᲇᲇᛱ:Lyyds/ᛱᛷᛲᛳ;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-wide v0, -0x39a79e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const-wide v0, -0x39a8fe68a836eL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    new-instance v0, Lyyds/ᛱᛷᛲᛳ;

    .line 18
    .line 19
    invoke-direct {v0}, Lyyds/ᛱᛶᛶᲇ;-><init>()V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lyyds/ᛱᛷᛲᛳ;->ᲇᲇᲇᛱ:Lyyds/ᛱᛷᛲᛳ;

    .line 23
    .line 24
    new-instance v0, Landroid/os/Handler;

    .line 25
    .line 26
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 31
    .line 32
    .line 33
    sput-object v0, Lyyds/ᛱᛷᛲᛳ;->ᛶᛷᛲᲁ:Landroid/os/Handler;

    .line 34
    .line 35
    new-instance v0, Ljava/util/WeakHashMap;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 38
    .line 39
    .line 40
    sput-object v0, Lyyds/ᛱᛷᛲᛳ;->ᛱᲈᲁ:Ljava/util/WeakHashMap;

    .line 41
    .line 42
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 43
    .line 44
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lyyds/ᛱᛷᛲᛳ;->ᛲᛳᛶᲁ:Ljava/lang/ThreadLocal;

    .line 48
    .line 49
    return-void
.end method

.method public static ᛱᛳᛶᛳ(Ljava/lang/Object;)I
    .locals 1

    .line 1
    instance-of v0, p0, Ljava/lang/Number;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/Number;

    .line 6
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
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    const/4 p0, 0x0

    .line 17
    :goto_1
    if-lez p0, :cond_2

    .line 18
    .line 19
    const/4 p0, 0x2

    .line 20
    return p0

    .line 21
    :cond_2
    const/4 p0, 0x1

    .line 22
    return p0
.end method

.method public static ᛸᛸᛷᛱ(Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/util/ArrayList;I)V
    .locals 3

    .line 1
    sget-object v0, Lyyds/ᛱᛷᛲᛳ;->ᛱᲈᲁ:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Lyyds/ᛲᛱᛵ;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    new-array v2, v2, [Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-direct {v1, p1, p2, p3}, Lyyds/ᛲᛱᛵ;-><init>(Ljava/lang/reflect/Method;[Ljava/lang/Object;I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p0, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    monitor-exit v0

    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    monitor-exit v0

    .line 23
    throw p0
.end method

.method public static ᲀᛲᛱᛱ(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    sget-object v0, Lyyds/ᛱᛷᛲᛳ;->ᛷᲈᲈᲁ:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 v1, 0x1

    .line 8
    :try_start_0
    sget-object v2, Lyyds/ᛱᛷᛲᛳ;->ᛲᛳᛶᲁ:Ljava/lang/ThreadLocal;

    .line 9
    .line 10
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-virtual {v2, v3}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    :try_start_1
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 16
    .line 17
    const-wide v4, -0x39973e68a836eL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    const/4 v6, 0x0

    .line 31
    filled-new-array {v3, v4, v5, v6}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-virtual {v0, p0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    const-wide v4, -0x39989e68a836eL

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    const/4 v5, 0x2

    .line 48
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    filled-new-array {v3, v4, v5, v6}, [Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-virtual {v0, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 60
    :try_start_2
    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->remove()V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :catchall_0
    move-exception p0

    .line 65
    goto :goto_0

    .line 66
    :catchall_1
    move-exception p0

    .line 67
    sget-object v0, Lyyds/ᛱᛷᛲᛳ;->ᛲᛳᛶᲁ:Ljava/lang/ThreadLocal;

    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    .line 70
    .line 71
    .line 72
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 73
    :goto_0
    new-instance v0, Lyyds/ᲈᛵᛵᛴ;

    .line 74
    .line 75
    invoke-direct {v0, p0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    move-object p0, v0

    .line 79
    :goto_1
    invoke-static {p0}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    if-eqz v0, :cond_1

    .line 84
    .line 85
    sget-object v2, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 86
    .line 87
    const-wide v3, -0x3999fe68a836eL

    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-virtual {v2, v3, v0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 97
    .line 98
    .line 99
    :cond_1
    instance-of p0, p0, Lyyds/ᲈᛵᛵᛴ;

    .line 100
    .line 101
    xor-int/2addr p0, v1

    .line 102
    return p0
.end method

.method public static ᲀᛴᲁᲈ(Ljava/util/ArrayList;)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0, p0}, Lyyds/ᛷᛷᛶᲇ;->ᛷᛶᛷᲀ(ILjava/util/List;)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    instance-of v2, v1, Ljava/lang/String;

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    check-cast v1, Ljava/lang/String;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v1, v3

    .line 15
    :goto_0
    if-nez v1, :cond_1

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_1
    const/4 v2, 0x3

    .line 19
    invoke-static {v2, p0}, Lyyds/ᛷᛷᛶᲇ;->ᛷᛶᛷᲀ(ILjava/util/List;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    instance-of v2, p0, Ljava/lang/String;

    .line 24
    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    move-object v3, p0

    .line 28
    check-cast v3, Ljava/lang/String;

    .line 29
    .line 30
    :cond_2
    if-nez v3, :cond_3

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_3
    const-wide v4, -0x3991be68a836eL

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {v1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-eqz p0, :cond_4

    .line 47
    .line 48
    const-wide v1, -0x39931e68a836eL

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {v3, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    if-eqz p0, :cond_4

    .line 62
    .line 63
    const/4 p0, 0x1

    .line 64
    return p0

    .line 65
    :cond_4
    :goto_1
    return v0
.end method


# virtual methods
.method public final ᲇᲇᲇᛱ()V
    .locals 14

    .line 1
    sget-object v0, Lyyds/ᛶᛵᛳᛵ;->ᛲᲈᲁ:Lyyds/ᛶᛵᛳᛵ;

    .line 2
    .line 3
    const-wide v0, -0x24018e68a836eL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const-wide v2, -0x24038e68a836eL

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᲇᛱᛲ(JJ)Lyyds/ᛸᲀᛷᛴ;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lyyds/ᛳᲈᲁᲀ;

    .line 18
    .line 19
    const-wide v1, -0x24041e68a836eL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    const-wide v3, -0x24065e68a836eL

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    invoke-static {v1, v2, v3, v4}, Lyyds/ᲀᲁᲈᲇ;->ᲇᛱᛲ(JJ)Lyyds/ᛸᲀᛷᛴ;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Lyyds/ᛳᲈᲁᲀ;

    .line 34
    .line 35
    const-wide v2, -0x2406ee68a836eL

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    const-wide v4, -0x24093e68a836eL

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    invoke-static {v2, v3, v4, v5}, Lyyds/ᲀᲁᲈᲇ;->ᲇᛱᛲ(JJ)Lyyds/ᛸᲀᛷᛴ;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Lyyds/ᛳᲈᲁᲀ;

    .line 50
    .line 51
    const/4 v3, 0x1

    .line 52
    const/4 v4, 0x0

    .line 53
    if-eqz v0, :cond_0

    .line 54
    .line 55
    :try_start_0
    invoke-virtual {p0}, Lyyds/ᛱᛶᛶᲇ;->ᛲᲈᲁ()Ljava/lang/ClassLoader;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    invoke-static {v0, v5}, Lyyds/ᛳᲈᲁᲀ;->ᛵᛸᛸᛷ(Lyyds/ᛳᲈᲁᲀ;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    invoke-virtual {v5, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :catchall_0
    move-exception v5

    .line 68
    new-instance v6, Lyyds/ᲈᛵᛵᛴ;

    .line 69
    .line 70
    invoke-direct {v6, v5}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_0
    move-object v5, v4

    .line 75
    :goto_0
    move-object v6, v5

    .line 76
    :goto_1
    invoke-static {v6}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    if-eqz v5, :cond_1

    .line 81
    .line 82
    sget-object v7, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 83
    .line 84
    const-wide v8, -0x398ace68a836eL

    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    invoke-static {v8, v9}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    invoke-virtual {v7, v8, v5}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    :cond_1
    instance-of v5, v6, Lyyds/ᲈᛵᛵᛴ;

    .line 97
    .line 98
    if-eqz v5, :cond_2

    .line 99
    .line 100
    move-object v6, v4

    .line 101
    :cond_2
    check-cast v6, Ljava/lang/reflect/Method;

    .line 102
    .line 103
    if-eqz v1, :cond_3

    .line 104
    .line 105
    :try_start_1
    invoke-virtual {p0}, Lyyds/ᛱᛶᛶᲇ;->ᛲᲈᲁ()Ljava/lang/ClassLoader;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    invoke-static {v1, v5}, Lyyds/ᛳᲈᲁᲀ;->ᛵᛸᛸᛷ(Lyyds/ᛳᲈᲁᲀ;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    invoke-virtual {v5, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 114
    .line 115
    .line 116
    goto :goto_2

    .line 117
    :catchall_1
    move-exception v5

    .line 118
    new-instance v7, Lyyds/ᲈᛵᛵᛴ;

    .line 119
    .line 120
    invoke-direct {v7, v5}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 121
    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_3
    move-object v5, v4

    .line 125
    :goto_2
    move-object v7, v5

    .line 126
    :goto_3
    invoke-static {v7}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    if-eqz v5, :cond_4

    .line 131
    .line 132
    sget-object v8, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 133
    .line 134
    const-wide v9, -0x398c1e68a836eL

    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    invoke-static {v9, v10}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v9

    .line 143
    invoke-virtual {v8, v9, v5}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 144
    .line 145
    .line 146
    :cond_4
    instance-of v5, v7, Lyyds/ᲈᛵᛵᛴ;

    .line 147
    .line 148
    if-eqz v5, :cond_5

    .line 149
    .line 150
    move-object v7, v4

    .line 151
    :cond_5
    check-cast v7, Ljava/lang/reflect/Method;

    .line 152
    .line 153
    if-eqz v2, :cond_6

    .line 154
    .line 155
    :try_start_2
    invoke-virtual {p0}, Lyyds/ᛱᛶᛶᲇ;->ᛲᲈᲁ()Ljava/lang/ClassLoader;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    invoke-static {v2, v5}, Lyyds/ᛳᲈᲁᲀ;->ᛵᛸᛸᛷ(Lyyds/ᛳᲈᲁᲀ;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 160
    .line 161
    .line 162
    move-result-object v5

    .line 163
    invoke-virtual {v5, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 164
    .line 165
    .line 166
    goto :goto_4

    .line 167
    :catchall_2
    move-exception v5

    .line 168
    new-instance v8, Lyyds/ᲈᛵᛵᛴ;

    .line 169
    .line 170
    invoke-direct {v8, v5}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 171
    .line 172
    .line 173
    goto :goto_5

    .line 174
    :cond_6
    move-object v5, v4

    .line 175
    :goto_4
    move-object v8, v5

    .line 176
    :goto_5
    invoke-static {v8}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    if-eqz v5, :cond_7

    .line 181
    .line 182
    sget-object v9, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 183
    .line 184
    const-wide v10, -0x398d6e68a836eL

    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    invoke-static {v10, v11}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v10

    .line 193
    invoke-virtual {v9, v10, v5}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 194
    .line 195
    .line 196
    :cond_7
    instance-of v5, v8, Lyyds/ᲈᛵᛵᛴ;

    .line 197
    .line 198
    if-eqz v5, :cond_8

    .line 199
    .line 200
    move-object v8, v4

    .line 201
    :cond_8
    check-cast v8, Ljava/lang/reflect/Method;

    .line 202
    .line 203
    :try_start_3
    sget-object v5, Lyyds/ᛶᛵᛳᛵ;->ᛲᲈᲁ:Lyyds/ᛶᛵᛳᛵ;

    .line 204
    .line 205
    const-wide v9, -0x2409ce68a836eL

    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    invoke-static {v9, v10}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v5

    .line 214
    const-wide v9, -0x240bae68a836eL

    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    invoke-static {v9, v10}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    invoke-static {v5}, Lyyds/ᛷᛶᲇᲁ;->ᛶᛷᛲᲁ(Ljava/lang/String;)Lyyds/ᛸᲀᛷᛴ;

    .line 223
    .line 224
    .line 225
    move-result-object v5

    .line 226
    check-cast v5, Lyyds/ᛳᲈᲁᲀ;

    .line 227
    .line 228
    if-eqz v5, :cond_9

    .line 229
    .line 230
    invoke-virtual {p0}, Lyyds/ᛱᛶᛶᲇ;->ᛲᲈᲁ()Ljava/lang/ClassLoader;

    .line 231
    .line 232
    .line 233
    move-result-object v9

    .line 234
    invoke-static {v5, v9}, Lyyds/ᛳᲈᲁᲀ;->ᛵᛸᛸᛷ(Lyyds/ᛳᲈᲁᲀ;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 235
    .line 236
    .line 237
    move-result-object v5

    .line 238
    invoke-virtual {v5, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 239
    .line 240
    .line 241
    goto :goto_7

    .line 242
    :catchall_3
    move-exception v3

    .line 243
    goto :goto_6

    .line 244
    :cond_9
    move-object v5, v4

    .line 245
    goto :goto_7

    .line 246
    :goto_6
    new-instance v5, Lyyds/ᲈᛵᛵᛴ;

    .line 247
    .line 248
    invoke-direct {v5, v3}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 249
    .line 250
    .line 251
    :goto_7
    invoke-static {v5}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    if-eqz v3, :cond_a

    .line 256
    .line 257
    sget-object v9, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 258
    .line 259
    const-wide v10, -0x398ebe68a836eL

    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    invoke-static {v10, v11}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v10

    .line 268
    invoke-virtual {v9, v10, v3}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 269
    .line 270
    .line 271
    :cond_a
    instance-of v3, v5, Lyyds/ᲈᛵᛵᛴ;

    .line 272
    .line 273
    if-eqz v3, :cond_b

    .line 274
    .line 275
    goto :goto_8

    .line 276
    :cond_b
    move-object v4, v5

    .line 277
    :goto_8
    check-cast v4, Ljava/lang/reflect/Method;

    .line 278
    .line 279
    if-eqz v4, :cond_13

    .line 280
    .line 281
    if-nez v6, :cond_c

    .line 282
    .line 283
    if-nez v7, :cond_c

    .line 284
    .line 285
    if-nez v8, :cond_c

    .line 286
    .line 287
    goto/16 :goto_c

    .line 288
    .line 289
    :cond_c
    sput-object v4, Lyyds/ᛱᛷᛲᛳ;->ᛷᲈᲈᲁ:Ljava/lang/reflect/Method;

    .line 290
    .line 291
    const/16 v3, 0x1a

    .line 292
    .line 293
    const-wide v9, -0x38537e68a836eL

    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    if-eqz v0, :cond_e

    .line 299
    .line 300
    if-eqz v6, :cond_e

    .line 301
    .line 302
    sget-object v5, Lyyds/ᛷᛴᲁᛸ;->ᛱᛳᲇ:Lyyds/ᛷᛴᲁᛸ;

    .line 303
    .line 304
    invoke-static {v9, v10}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    sget-object v11, Lyyds/ᛶᛵᛳᛵ;->ᛲᲈᲁ:Lyyds/ᛶᛵᛳᛵ;

    .line 308
    .line 309
    const-wide v11, -0x399cee68a836eL

    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    invoke-static {v11, v12}, Lyyds/ᲀᲁᲈᲇ;->ᛳᲁᲁᲇ(J)Lyyds/ᛱᲀᲈᛷ;

    .line 315
    .line 316
    .line 317
    move-result-object v11

    .line 318
    new-instance v12, Lyyds/ᛷᲈᲈᲁ;

    .line 319
    .line 320
    const/4 v13, 0x3

    .line 321
    invoke-direct {v12, v6, v13}, Lyyds/ᛷᲈᲈᲁ;-><init>(Ljava/lang/reflect/Method;I)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v11, v12}, Lyyds/ᛱᲀᲈᛷ;->ᛵᛸᛸᛷ(Lyyds/ᛷᛴᲈᲀ;)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v0}, Lyyds/ᛳᲈᲁᲀ;->ᲀᛲᛳᲀ()Z

    .line 328
    .line 329
    .line 330
    move-result v6

    .line 331
    if-eqz v6, :cond_d

    .line 332
    .line 333
    invoke-virtual {p0}, Lyyds/ᛱᛶᛶᲇ;->ᛲᲈᲁ()Ljava/lang/ClassLoader;

    .line 334
    .line 335
    .line 336
    move-result-object v6

    .line 337
    invoke-virtual {v0, v6}, Lyyds/ᛳᲈᲁᲀ;->ᛲᲈᲁ(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Constructor;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    goto :goto_9

    .line 342
    :cond_d
    invoke-virtual {p0}, Lyyds/ᛱᛶᛶᲇ;->ᛲᲈᲁ()Ljava/lang/ClassLoader;

    .line 343
    .line 344
    .line 345
    move-result-object v6

    .line 346
    invoke-static {v0, v6}, Lyyds/ᛳᲈᲁᲀ;->ᛵᛸᛸᛷ(Lyyds/ᛳᲈᲁᲀ;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    :goto_9
    new-instance v6, Lyyds/ᛱᛱᛴ;

    .line 351
    .line 352
    invoke-direct {v6, v3, v11}, Lyyds/ᛱᛱᛴ;-><init>(ILjava/lang/Object;)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {p0, v0, v5, v6}, Lyyds/ᛱᛶᛶᲇ;->ᛶᛷᛲᲁ(Ljava/lang/reflect/Member;Lyyds/ᛷᛴᲁᛸ;Lyyds/ᛱᛳᛶᲈ;)V

    .line 356
    .line 357
    .line 358
    :cond_e
    if-eqz v1, :cond_10

    .line 359
    .line 360
    if-eqz v7, :cond_10

    .line 361
    .line 362
    sget-object v0, Lyyds/ᛷᛴᲁᛸ;->ᛳᲁᲁᲇ:Lyyds/ᛷᛴᲁᛸ;

    .line 363
    .line 364
    invoke-static {v9, v10}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    sget-object v5, Lyyds/ᛶᛵᛳᛵ;->ᛲᲈᲁ:Lyyds/ᛶᛵᛳᛵ;

    .line 368
    .line 369
    const-wide v5, -0x399fbe68a836eL

    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    invoke-static {v5, v6}, Lyyds/ᲀᲁᲈᲇ;->ᛳᲁᲁᲇ(J)Lyyds/ᛱᲀᲈᛷ;

    .line 375
    .line 376
    .line 377
    move-result-object v5

    .line 378
    new-instance v6, Lyyds/ᛷᲈᲈᲁ;

    .line 379
    .line 380
    const/4 v11, 0x5

    .line 381
    invoke-direct {v6, v7, v11}, Lyyds/ᛷᲈᲈᲁ;-><init>(Ljava/lang/reflect/Method;I)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v5, v6}, Lyyds/ᛱᲀᲈᛷ;->ᛵᛸᛸᛷ(Lyyds/ᛷᛴᲈᲀ;)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v1}, Lyyds/ᛳᲈᲁᲀ;->ᲀᛲᛳᲀ()Z

    .line 388
    .line 389
    .line 390
    move-result v6

    .line 391
    if-eqz v6, :cond_f

    .line 392
    .line 393
    invoke-virtual {p0}, Lyyds/ᛱᛶᛶᲇ;->ᛲᲈᲁ()Ljava/lang/ClassLoader;

    .line 394
    .line 395
    .line 396
    move-result-object v6

    .line 397
    invoke-virtual {v1, v6}, Lyyds/ᛳᲈᲁᲀ;->ᛲᲈᲁ(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Constructor;

    .line 398
    .line 399
    .line 400
    move-result-object v1

    .line 401
    goto :goto_a

    .line 402
    :cond_f
    invoke-virtual {p0}, Lyyds/ᛱᛶᛶᲇ;->ᛲᲈᲁ()Ljava/lang/ClassLoader;

    .line 403
    .line 404
    .line 405
    move-result-object v6

    .line 406
    invoke-static {v1, v6}, Lyyds/ᛳᲈᲁᲀ;->ᛵᛸᛸᛷ(Lyyds/ᛳᲈᲁᲀ;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 407
    .line 408
    .line 409
    move-result-object v1

    .line 410
    :goto_a
    new-instance v6, Lyyds/ᛱᛱᛴ;

    .line 411
    .line 412
    invoke-direct {v6, v3, v5}, Lyyds/ᛱᛱᛴ;-><init>(ILjava/lang/Object;)V

    .line 413
    .line 414
    .line 415
    invoke-virtual {p0, v1, v0, v6}, Lyyds/ᛱᛶᛶᲇ;->ᛶᛷᛲᲁ(Ljava/lang/reflect/Member;Lyyds/ᛷᛴᲁᛸ;Lyyds/ᛱᛳᛶᲈ;)V

    .line 416
    .line 417
    .line 418
    :cond_10
    if-eqz v2, :cond_12

    .line 419
    .line 420
    if-eqz v8, :cond_12

    .line 421
    .line 422
    sget-object v0, Lyyds/ᛷᛴᲁᛸ;->ᲇᛱᛲ:Lyyds/ᛷᛴᲁᛸ;

    .line 423
    .line 424
    invoke-static {v9, v10}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    sget-object v1, Lyyds/ᛶᛵᛳᛵ;->ᛲᲈᲁ:Lyyds/ᛶᛵᛳᛵ;

    .line 428
    .line 429
    const-wide v5, -0x39a29e68a836eL

    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    invoke-static {v5, v6}, Lyyds/ᲀᲁᲈᲇ;->ᛳᲁᲁᲇ(J)Lyyds/ᛱᲀᲈᛷ;

    .line 435
    .line 436
    .line 437
    move-result-object v1

    .line 438
    new-instance v5, Lyyds/ᛷᲈᲈᲁ;

    .line 439
    .line 440
    const/4 v6, 0x4

    .line 441
    invoke-direct {v5, v8, v6}, Lyyds/ᛷᲈᲈᲁ;-><init>(Ljava/lang/reflect/Method;I)V

    .line 442
    .line 443
    .line 444
    invoke-virtual {v1, v5}, Lyyds/ᛱᲀᲈᛷ;->ᛵᛸᛸᛷ(Lyyds/ᛷᛴᲈᲀ;)V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v2}, Lyyds/ᛳᲈᲁᲀ;->ᲀᛲᛳᲀ()Z

    .line 448
    .line 449
    .line 450
    move-result v5

    .line 451
    if-eqz v5, :cond_11

    .line 452
    .line 453
    invoke-virtual {p0}, Lyyds/ᛱᛶᛶᲇ;->ᛲᲈᲁ()Ljava/lang/ClassLoader;

    .line 454
    .line 455
    .line 456
    move-result-object v5

    .line 457
    invoke-virtual {v2, v5}, Lyyds/ᛳᲈᲁᲀ;->ᛲᲈᲁ(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Constructor;

    .line 458
    .line 459
    .line 460
    move-result-object v2

    .line 461
    goto :goto_b

    .line 462
    :cond_11
    invoke-virtual {p0}, Lyyds/ᛱᛶᛶᲇ;->ᛲᲈᲁ()Ljava/lang/ClassLoader;

    .line 463
    .line 464
    .line 465
    move-result-object v5

    .line 466
    invoke-static {v2, v5}, Lyyds/ᛳᲈᲁᲀ;->ᛵᛸᛸᛷ(Lyyds/ᛳᲈᲁᲀ;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 467
    .line 468
    .line 469
    move-result-object v2

    .line 470
    :goto_b
    new-instance v5, Lyyds/ᛱᛱᛴ;

    .line 471
    .line 472
    invoke-direct {v5, v3, v1}, Lyyds/ᛱᛱᛴ;-><init>(ILjava/lang/Object;)V

    .line 473
    .line 474
    .line 475
    invoke-virtual {p0, v2, v0, v5}, Lyyds/ᛱᛶᛶᲇ;->ᛶᛷᛲᲁ(Ljava/lang/reflect/Member;Lyyds/ᛷᛴᲁᛸ;Lyyds/ᛱᛳᛶᲈ;)V

    .line 476
    .line 477
    .line 478
    :cond_12
    sget-object v0, Lyyds/ᛷᛴᲁᛸ;->ᛶᛳᛶᛵ:Lyyds/ᛷᛴᲁᛸ;

    .line 479
    .line 480
    new-instance v1, Lyyds/ᛸᛴᛵᲇ;

    .line 481
    .line 482
    const/16 v2, 0x10

    .line 483
    .line 484
    invoke-direct {v1, v2}, Lyyds/ᛸᛴᛵᲇ;-><init>(I)V

    .line 485
    .line 486
    .line 487
    invoke-virtual {p0, v4, v0, v1}, Lyyds/ᛱᛶᛶᲇ;->ᲀᛲᛲᲇ(Ljava/lang/reflect/Member;Lyyds/ᛷᛴᲁᛸ;Lyyds/ᛷᛴᲈᲀ;)V

    .line 488
    .line 489
    .line 490
    return-void

    .line 491
    :cond_13
    :goto_c
    sget-object p0, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 492
    .line 493
    const-wide v0, -0x39900e68a836eL

    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    invoke-virtual {p0, v0}, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ(Ljava/lang/String;)V

    .line 503
    .line 504
    .line 505
    return-void
.end method
