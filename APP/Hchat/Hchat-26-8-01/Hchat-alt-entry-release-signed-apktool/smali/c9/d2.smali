.class public final Lc9/d2;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lc9/d2;

.field public static final b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final c:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final d:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final e:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public static final f:Ljava/util/Map;

.field public static final g:Ljava/util/Map;

.field public static final h:Ljava/util/Map;

.field public static final i:Ljava/util/Map;

.field public static final j:Ljava/lang/ThreadLocal;

.field public static final k:Ljava/lang/ThreadLocal;

.field public static final l:Ljava/lang/ThreadLocal;

.field public static final m:Ljava/util/concurrent/ExecutorService;

.field public static final n:Landroid/os/Handler;

.field public static volatile o:Ljava/lang/reflect/Method;

.field public static volatile p:Ljava/lang/reflect/Method;

.field public static volatile q:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lc9/d2;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lc9/d2;->a:Lc9/d2;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lc9/d2;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lc9/d2;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 22
    .line 23
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 24
    .line 25
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 26
    .line 27
    .line 28
    sput-object v0, Lc9/d2;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 29
    .line 30
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sput-object v0, Lc9/d2;->e:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 35
    .line 36
    invoke-static {}, Lp/a;->p()Ljava/util/Map;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sput-object v0, Lc9/d2;->f:Ljava/util/Map;

    .line 41
    .line 42
    invoke-static {}, Lp/a;->p()Ljava/util/Map;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sput-object v0, Lc9/d2;->g:Ljava/util/Map;

    .line 47
    .line 48
    invoke-static {}, Lp/a;->p()Ljava/util/Map;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    sput-object v0, Lc9/d2;->h:Ljava/util/Map;

    .line 53
    .line 54
    invoke-static {}, Lp/a;->p()Ljava/util/Map;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    sput-object v0, Lc9/d2;->i:Ljava/util/Map;

    .line 59
    .line 60
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 61
    .line 62
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 63
    .line 64
    .line 65
    sput-object v0, Lc9/d2;->j:Ljava/lang/ThreadLocal;

    .line 66
    .line 67
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 68
    .line 69
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 70
    .line 71
    .line 72
    sput-object v0, Lc9/d2;->k:Ljava/lang/ThreadLocal;

    .line 73
    .line 74
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 75
    .line 76
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 77
    .line 78
    .line 79
    sput-object v0, Lc9/d2;->l:Ljava/lang/ThreadLocal;

    .line 80
    .line 81
    new-instance v0, Lc9/q;

    .line 82
    .line 83
    const/4 v1, 0x1

    .line 84
    invoke-direct {v0, v1}, Lc9/q;-><init>(I)V

    .line 85
    .line 86
    .line 87
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    sput-object v0, Lc9/d2;->m:Ljava/util/concurrent/ExecutorService;

    .line 92
    .line 93
    new-instance v0, Landroid/os/Handler;

    .line 94
    .line 95
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 100
    .line 101
    .line 102
    sput-object v0, Lc9/d2;->n:Landroid/os/Handler;

    .line 103
    .line 104
    return-void
.end method

.method public static A(Ljava/lang/Object;Landroid/content/Context;)V
    .locals 3

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    invoke-static {p0}, Lc9/d2;->v(Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-static {p1}, Lc9/o2;->i(Landroid/content/Context;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    move-object v2, v1

    .line 28
    check-cast v2, Lc9/a;

    .line 29
    .line 30
    iget-object v2, v2, Lc9/a;->a:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v2}, Lc9/d2;->F(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/4 v1, 0x0

    .line 44
    :goto_0
    check-cast v1, Lc9/a;

    .line 45
    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    iget-object p1, v1, Lc9/a;->b:Ljava/lang/String;

    .line 49
    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    const-string v1, "adapter"

    .line 53
    .line 54
    invoke-static {p0, v1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-static {v0, p0, p1, v1}, Lc9/d2;->x(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    :cond_2
    return-void
.end method

.method public static B(Ljava/lang/Object;)V
    .locals 6

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-static {p0}, Lc9/d2;->v(Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->database()Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    filled-new-array {v0}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const-string v3, "unReadCount"

    .line 20
    .line 21
    const-string v4, "SELECT IFNULL(unReadCount,0) AS unReadCount FROM rconversation WHERE username=? LIMIT 1"

    .line 22
    .line 23
    invoke-virtual {v1, v4, v2, v3}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->queryFirstString(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    const/16 v2, 0xa

    .line 30
    .line 31
    invoke-static {v2, v1}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-gez v1, :cond_0

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 53
    .line 54
    filled-new-array {v3, v4}, [Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    const-string v5, "setUnread"

    .line 59
    .line 60
    invoke-static {v2, v5, v3}, Lh/Hchat/utils/KavaReflector;->findCompatibleMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    filled-new-array {v3, v4}, [Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-static {v2, p0, v3}, Lh/Hchat/utils/KavaReflector;->invokeSuccessfully(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    if-nez p0, :cond_1

    .line 77
    .line 78
    new-instance p0, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    const-string v2, "[Hchat:ConversationGroup] \u540c\u6b65\u5fae\u4fe1\u539f\u751f\u5206\u7ec4\u9875\u672a\u8bfb\u6570\u5931\u8d25: talker="

    .line 81
    .line 82
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string v0, " unread="

    .line 89
    .line 90
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-static {p0}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    :cond_1
    return-void
.end method

.method public static C(Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;Ljava/util/List;Ljava/lang/String;)Z
    .locals 8

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    sget-object v0, Lc9/d2;->o:Ljava/lang/reflect/Method;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_b

    .line 13
    .line 14
    sget-object v2, Lc9/d2;->q:Ljava/lang/Object;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    if-eqz v2, :cond_2

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v4, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-eqz v4, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move-object v2, v3

    .line 34
    :goto_0
    if-eqz v2, :cond_2

    .line 35
    .line 36
    :goto_1
    move-object v3, v2

    .line 37
    goto :goto_2

    .line 38
    :cond_2
    invoke-virtual {p0, v0}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->storageObjectForMethod(Ljava/lang/reflect/Method;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    if-eqz v2, :cond_3

    .line 43
    .line 44
    sput-object v2, Lc9/d2;->q:Ljava/lang/Object;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_3
    :goto_2
    if-nez v3, :cond_4

    .line 48
    .line 49
    goto/16 :goto_7

    .line 50
    .line 51
    :cond_4
    :try_start_0
    new-array v2, v1, [Ljava/lang/String;

    .line 52
    .line 53
    invoke-interface {p1, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, [Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    array-length v4, v4

    .line 64
    const/4 v5, 0x2

    .line 65
    if-ne v4, v5, :cond_5

    .line 66
    .line 67
    filled-new-array {v2, p2}, [Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-static {v0, v3, v2}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    goto :goto_3

    .line 75
    :catchall_0
    move-exception v0

    .line 76
    move-object p0, v0

    .line 77
    goto/16 :goto_5

    .line 78
    .line 79
    :cond_5
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 80
    .line 81
    filled-new-array {v2, p2, v4, v4}, [Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-static {v0, v3, v2}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    :goto_3
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    new-instance v2, Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 95
    .line 96
    .line 97
    move v3, v1

    .line 98
    :goto_4
    if-ge v3, v0, :cond_6

    .line 99
    .line 100
    const-string v4, "?"

    .line 101
    .line 102
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    add-int/lit8 v3, v3, 0x1

    .line 106
    .line 107
    goto :goto_4

    .line 108
    :cond_6
    const-string v3, ","

    .line 109
    .line 110
    const/4 v6, 0x0

    .line 111
    const/16 v7, 0x3e

    .line 112
    .line 113
    const/4 v4, 0x0

    .line 114
    const/4 v5, 0x0

    .line 115
    invoke-static/range {v2 .. v7}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-static {p1, p2}, Ltf/m;->G1(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    new-array v2, v1, [Ljava/lang/String;

    .line 124
    .line 125
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    check-cast p2, [Ljava/lang/String;

    .line 130
    .line 131
    new-instance v2, Ljava/lang/StringBuilder;

    .line 132
    .line 133
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 134
    .line 135
    .line 136
    const-string v3, "SELECT COUNT(*) AS matched FROM rconversation WHERE username IN ("

    .line 137
    .line 138
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    const-string v0, ") AND IFNULL(parentRef,\'\')=?"

    .line 145
    .line 146
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    const-string v2, "matched"

    .line 154
    .line 155
    invoke-virtual {p0, v0, p2, v2}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->queryFirstString(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    const/16 p2, 0xa

    .line 163
    .line 164
    invoke-static {p2, p0}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    if-eqz p0, :cond_7

    .line 169
    .line 170
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    :cond_7
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 175
    .line 176
    .line 177
    move-result p0

    .line 178
    if-ne v1, p0, :cond_8

    .line 179
    .line 180
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 181
    .line 182
    goto :goto_6

    .line 183
    :cond_8
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 184
    .line 185
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 186
    .line 187
    .line 188
    move-result p2

    .line 189
    new-instance v0, Ljava/lang/StringBuilder;

    .line 190
    .line 191
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 192
    .line 193
    .line 194
    const-string v2, "\u6570\u636e\u5e93\u4ec5\u66f4\u65b0 "

    .line 195
    .line 196
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    const-string v1, "/"

    .line 203
    .line 204
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    const-string p2, " \u6761\u4f1a\u8bdd"

    .line 211
    .line 212
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object p2

    .line 219
    invoke-direct {p0, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 223
    :goto_5
    new-instance p2, Lsf/f;

    .line 224
    .line 225
    invoke-direct {p2, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 226
    .line 227
    .line 228
    move-object p0, p2

    .line 229
    :goto_6
    invoke-static {p0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 230
    .line 231
    .line 232
    move-result-object p2

    .line 233
    if-eqz p2, :cond_9

    .line 234
    .line 235
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 236
    .line 237
    .line 238
    move-result p1

    .line 239
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    new-instance v1, Ljava/lang/StringBuilder;

    .line 244
    .line 245
    const-string v2, "[Hchat:ConversationGroup] \u8c03\u7528\u5fae\u4fe1\u539f\u751f\u4f1a\u8bdd\u5f52\u62e2\u5931\u8d25: count="

    .line 246
    .line 247
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    const-string p1, " "

    .line 254
    .line 255
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    invoke-static {p1, p2}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 266
    .line 267
    .line 268
    :cond_9
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 269
    .line 270
    instance-of p2, p0, Lsf/f;

    .line 271
    .line 272
    if-eqz p2, :cond_a

    .line 273
    .line 274
    move-object p0, p1

    .line 275
    :cond_a
    check-cast p0, Ljava/lang/Boolean;

    .line 276
    .line 277
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 278
    .line 279
    .line 280
    move-result p0

    .line 281
    return p0

    .line 282
    :cond_b
    :goto_7
    return v1
.end method

.method public static D(Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)Z
    .locals 8

    .line 1
    const-string v0, "SELECT username FROM "

    .line 2
    .line 3
    const-string v1, " WHERE username=? LIMIT 1"

    .line 4
    .line 5
    invoke-static {v0, p1, v1}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    filled-new-array {p2}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "username"

    .line 14
    .line 15
    invoke-virtual {p0, v0, v1, v2}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->queryFirstString(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0, p2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v1, 0x0

    .line 24
    const/4 v3, 0x1

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    const-string v0, "username=?"

    .line 28
    .line 29
    filled-new-array {p2}, [Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {p0, p1, p3, v0, v2}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-lez p0, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {p0, p1, v2, p3}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 41
    .line 42
    .line 43
    move-result-wide v4

    .line 44
    const-wide/16 v6, 0x0

    .line 45
    .line 46
    cmp-long p0, v4, v6

    .line 47
    .line 48
    if-ltz p0, :cond_1

    .line 49
    .line 50
    :goto_0
    move v1, v3

    .line 51
    :cond_1
    if-nez v1, :cond_2

    .line 52
    .line 53
    new-instance p0, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string p3, "[Hchat:ConversationGroup] \u5199\u5165\u865a\u62df\u5206\u7ec4\u5165\u53e3\u5931\u8d25: table="

    .line 56
    .line 57
    invoke-direct {p0, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string p1, " talker="

    .line 64
    .line 65
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-static {p0}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    :cond_2
    return v1
.end method

.method public static E(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    :goto_0
    if-nez p0, :cond_1

    .line 14
    .line 15
    const-string p0, ""

    .line 16
    .line 17
    :cond_1
    return-object p0
.end method

.method public static final F(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "SHA-256"

    .line 5
    .line 6
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Log/a;->a:Ljava/nio/charset/Charset;

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->digest([B)[B

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const/16 v0, 0x20

    .line 24
    .line 25
    new-array v0, v0, [C

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    :goto_0
    const/16 v2, 0x10

    .line 29
    .line 30
    if-ge v1, v2, :cond_0

    .line 31
    .line 32
    aget-byte v2, p0, v1

    .line 33
    .line 34
    and-int/lit16 v3, v2, 0xff

    .line 35
    .line 36
    mul-int/lit8 v4, v1, 0x2

    .line 37
    .line 38
    ushr-int/lit8 v3, v3, 0x4

    .line 39
    .line 40
    const-string v5, "0123456789abcdef"

    .line 41
    .line 42
    invoke-virtual {v5, v3}, Ljava/lang/String;->charAt(I)C

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    aput-char v3, v0, v4

    .line 47
    .line 48
    add-int/lit8 v4, v4, 0x1

    .line 49
    .line 50
    and-int/lit8 v2, v2, 0xf

    .line 51
    .line 52
    invoke-virtual {v5, v2}, Ljava/lang/String;->charAt(I)C

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    aput-char v2, v0, v4

    .line 57
    .line 58
    add-int/lit8 v1, v1, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 62
    .line 63
    invoke-direct {p0, v0}, Ljava/lang/String;-><init>([C)V

    .line 64
    .line 65
    .line 66
    const-string v0, "wxid_hchat_group_"

    .line 67
    .line 68
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0
.end method

.method public static final a(Lc9/d2;Ljava/lang/reflect/Method;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    array-length v0, p0

    .line 30
    const/4 v2, 0x4

    .line 31
    if-ne v0, v2, :cond_0

    .line 32
    .line 33
    const-class v0, Landroid/widget/AdapterView;

    .line 34
    .line 35
    aget-object v2, p0, v1

    .line 36
    .line 37
    invoke-virtual {v0, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    const-class v0, Landroid/view/View;

    .line 44
    .line 45
    const/4 v2, 0x1

    .line 46
    aget-object v3, p0, v2

    .line 47
    .line 48
    invoke-virtual {v0, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_0

    .line 53
    .line 54
    const/4 v0, 0x2

    .line 55
    aget-object v0, p0, v0

    .line 56
    .line 57
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 58
    .line 59
    invoke-static {v0, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_0

    .line 64
    .line 65
    const/4 v0, 0x3

    .line 66
    aget-object p0, p0, v0

    .line 67
    .line 68
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 69
    .line 70
    invoke-static {p0, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    if-eqz p0, :cond_0

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    sget-object p1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 81
    .line 82
    invoke-static {p0, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    if-eqz p0, :cond_0

    .line 87
    .line 88
    return v2

    .line 89
    :cond_0
    return v1
.end method

.method public static final b(Lc9/d2;Ljava/lang/reflect/Method;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 34
    .line 35
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_0

    .line 40
    .line 41
    array-length p1, p0

    .line 42
    const/4 v0, 0x1

    .line 43
    if-ne p1, v0, :cond_0

    .line 44
    .line 45
    aget-object p0, p0, v1

    .line 46
    .line 47
    const-class p1, Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {p0, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-eqz p0, :cond_0

    .line 54
    .line 55
    return v0

    .line 56
    :cond_0
    return v1
.end method

.method public static final c(Lc9/d2;Ljava/lang/reflect/Method;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    const-class v0, Landroid/database/Cursor;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_0

    .line 40
    .line 41
    array-length p1, p0

    .line 42
    const/4 v0, 0x4

    .line 43
    if-ne p1, v0, :cond_0

    .line 44
    .line 45
    aget-object p1, p0, v1

    .line 46
    .line 47
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 48
    .line 49
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_0

    .line 54
    .line 55
    const-class p1, Ljava/util/List;

    .line 56
    .line 57
    const/4 v2, 0x1

    .line 58
    aget-object v3, p0, v2

    .line 59
    .line 60
    invoke-virtual {p1, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_0

    .line 65
    .line 66
    const/4 p1, 0x2

    .line 67
    aget-object p1, p0, p1

    .line 68
    .line 69
    const-class v3, Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {p1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-eqz p1, :cond_0

    .line 76
    .line 77
    const/4 p1, 0x3

    .line 78
    aget-object p0, p0, p1

    .line 79
    .line 80
    invoke-static {p0, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    if-eqz p0, :cond_0

    .line 85
    .line 86
    return v2

    .line 87
    :cond_0
    return v1
.end method

.method public static final d(Lc9/d2;Ljava/lang/reflect/Method;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    if-nez v0, :cond_3

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_3

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 34
    .line 35
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    array-length p0, p0

    .line 45
    if-nez p0, :cond_3

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {p0}, Lh/Hchat/utils/KavaReflector;->declaredConstructors(Ljava/lang/Class;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    if-eqz p0, :cond_0

    .line 56
    .line 57
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_0

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-eqz p1, :cond_3

    .line 73
    .line 74
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    check-cast p1, Ljava/lang/reflect/Constructor;

    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    array-length v0, p1

    .line 85
    const/4 v2, 0x3

    .line 86
    const/4 v3, 0x1

    .line 87
    if-ne v0, v2, :cond_2

    .line 88
    .line 89
    const-class v0, Landroid/content/Context;

    .line 90
    .line 91
    aget-object v2, p1, v1

    .line 92
    .line 93
    invoke-virtual {v0, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_2

    .line 98
    .line 99
    aget-object p1, p1, v3

    .line 100
    .line 101
    const-class v0, Ljava/lang/String;

    .line 102
    .line 103
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    if-eqz p1, :cond_2

    .line 108
    .line 109
    move p1, v3

    .line 110
    goto :goto_0

    .line 111
    :cond_2
    move p1, v1

    .line 112
    :goto_0
    if-eqz p1, :cond_1

    .line 113
    .line 114
    return v3

    .line 115
    :cond_3
    :goto_1
    return v1
.end method

.method public static final e(Lc9/d2;Ljava/lang/reflect/Method;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 34
    .line 35
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_0

    .line 40
    .line 41
    array-length p1, p0

    .line 42
    const/4 v0, 0x2

    .line 43
    if-ne p1, v0, :cond_0

    .line 44
    .line 45
    aget-object p1, p0, v1

    .line 46
    .line 47
    const-class v0, Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_0

    .line 54
    .line 55
    const/4 p1, 0x1

    .line 56
    aget-object p0, p0, p1

    .line 57
    .line 58
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 59
    .line 60
    invoke-static {p0, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    if-eqz p0, :cond_0

    .line 65
    .line 66
    return p1

    .line 67
    :cond_0
    return v1
.end method

.method public static final f(Lc9/d2;Ljava/lang/reflect/Method;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 34
    .line 35
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    const/4 p1, 0x2

    .line 42
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const/4 v2, 0x4

    .line 47
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    filled-new-array {v0, v2}, [Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {v0}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    array-length v2, p0

    .line 60
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_1

    .line 69
    .line 70
    aget-object v0, p0, v1

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_1

    .line 77
    .line 78
    aget-object v0, p0, v1

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    const-class v2, Ljava/lang/String;

    .line 85
    .line 86
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_1

    .line 91
    .line 92
    const/4 v0, 0x1

    .line 93
    aget-object v3, p0, v0

    .line 94
    .line 95
    invoke-static {v3, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-eqz v2, :cond_1

    .line 100
    .line 101
    array-length v2, p0

    .line 102
    if-eq v2, p1, :cond_0

    .line 103
    .line 104
    aget-object p1, p0, p1

    .line 105
    .line 106
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 107
    .line 108
    invoke-static {p1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    if-eqz p1, :cond_1

    .line 113
    .line 114
    const/4 p1, 0x3

    .line 115
    aget-object p0, p0, p1

    .line 116
    .line 117
    invoke-static {p0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result p0

    .line 121
    if-eqz p0, :cond_1

    .line 122
    .line 123
    :cond_0
    return v0

    .line 124
    :cond_1
    return v1
.end method

.method public static final g(Lc9/d2;Ljava/lang/reflect/Method;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    const-class v0, Landroid/database/Cursor;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    array-length p1, p0

    .line 32
    const/4 v0, 0x5

    .line 33
    if-ne p1, v0, :cond_0

    .line 34
    .line 35
    aget-object p1, p0, v1

    .line 36
    .line 37
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 38
    .line 39
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_0

    .line 44
    .line 45
    const-class p1, Ljava/util/List;

    .line 46
    .line 47
    const/4 v0, 0x1

    .line 48
    aget-object v2, p0, v0

    .line 49
    .line 50
    invoke-virtual {p1, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-eqz p1, :cond_0

    .line 55
    .line 56
    const/4 p1, 0x2

    .line 57
    aget-object p1, p0, p1

    .line 58
    .line 59
    const-class v2, Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {p1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_0

    .line 66
    .line 67
    const/4 p1, 0x3

    .line 68
    aget-object p1, p0, p1

    .line 69
    .line 70
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 71
    .line 72
    invoke-static {p1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-eqz p1, :cond_0

    .line 77
    .line 78
    const/4 p1, 0x4

    .line 79
    aget-object p0, p0, p1

    .line 80
    .line 81
    invoke-static {p0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    if-eqz p0, :cond_0

    .line 86
    .line 87
    return v0

    .line 88
    :cond_0
    return v1
.end method

.method public static final h(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {p0}, Lc9/o2;->i(Landroid/content/Context;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    move-object v2, v1

    .line 20
    check-cast v2, Lc9/a;

    .line 21
    .line 22
    iget-object v2, v2, Lc9/a;->a:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v2, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v1, 0x0

    .line 32
    :goto_0
    check-cast v1, Lc9/a;

    .line 33
    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    iget-object p1, v1, Lc9/a;->a:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {p1}, Lc9/d2;->F(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    :try_start_0
    new-instance v1, Landroid/content/Intent;

    .line 43
    .line 44
    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 45
    .line 46
    .line 47
    const-string v2, "com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI"

    .line 48
    .line 49
    invoke-virtual {v1, p0, v2}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    const-string v2, "Contact_User"

    .line 54
    .line 55
    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 59
    .line 60
    .line 61
    sget-object p0, Lsf/n;->a:Lsf/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :catchall_0
    move-exception p0

    .line 65
    new-instance v0, Lsf/f;

    .line 66
    .line 67
    invoke-direct {v0, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    move-object p0, v0

    .line 71
    :goto_1
    invoke-static {p0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    if-eqz p0, :cond_2

    .line 76
    .line 77
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    const-string v1, "[Hchat:ConversationGroup] \u6253\u5f00\u5fae\u4fe1\u539f\u751f\u5206\u7ec4\u9875\u9762\u5931\u8d25: group="

    .line 82
    .line 83
    const-string v2, " "

    .line 84
    .line 85
    invoke-static {v1, p1, v2, v0, p0}, Leh/a;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    :cond_2
    return-void
.end method

.method public static i(Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "username"

    .line 2
    .line 3
    const-string v1, "userName"

    .line 4
    .line 5
    const-string v2, "field_username"

    .line 6
    .line 7
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Ltf/l;->k0([Ljava/lang/Object;)Lng/j;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Lc9/k1;

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    invoke-direct {v1, p0, v2}, Lc9/k1;-><init>(Ljava/lang/Object;I)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1}, Lng/m;->X(Lng/j;Lfg/l;)Lng/i;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    new-instance v0, Lng/h;

    .line 26
    .line 27
    invoke-direct {v0, p0}, Lng/h;-><init>(Lng/i;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-virtual {v0}, Lng/h;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eqz p0, :cond_1

    .line 35
    .line 36
    invoke-virtual {v0}, Lng/h;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    move-object v1, p0

    .line 41
    check-cast v1, Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-nez v1, :cond_0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    const/4 p0, 0x0

    .line 51
    :goto_0
    check-cast p0, Ljava/lang/String;

    .line 52
    .line 53
    return-object p0
.end method

.method public static j(Ljava/lang/String;Ljava/util/List;)Ljava/util/LinkedHashSet;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    move-object v3, v2

    .line 24
    check-cast v3, Lc9/a;

    .line 25
    .line 26
    iget-object v3, v3, Lc9/a;->c:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v0, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    if-nez v4, :cond_0

    .line 33
    .line 34
    new-instance v4, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    :cond_0
    check-cast v4, Ljava/util/List;

    .line 43
    .line 44
    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    invoke-static {p1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    invoke-static {v1}, Ltf/y;->a0(I)I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    const/16 v2, 0x10

    .line 57
    .line 58
    if-ge v1, v2, :cond_2

    .line 59
    .line 60
    move v1, v2

    .line 61
    :cond_2
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 62
    .line 63
    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 64
    .line 65
    .line 66
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-eqz v1, :cond_3

    .line 75
    .line 76
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    move-object v3, v1

    .line 81
    check-cast v3, Lc9/a;

    .line 82
    .line 83
    iget-object v3, v3, Lc9/a;->a:Ljava/lang/String;

    .line 84
    .line 85
    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_3
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 90
    .line 91
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 92
    .line 93
    .line 94
    new-instance v1, Ljava/util/HashSet;

    .line 95
    .line 96
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-static {v1, v2, v0, p1, p0}, Lc9/d2;->k(Ljava/util/HashSet;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashSet;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    return-object p1
.end method

.method public static final k(Ljava/util/HashSet;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashSet;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p0, p4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    invoke-virtual {p1, p4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lc9/a;

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    iget-object v0, v0, Lc9/a;->e:Ljava/util/List;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-nez v2, :cond_1

    .line 41
    .line 42
    invoke-virtual {p3, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    invoke-virtual {p2, p4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p4

    .line 50
    check-cast p4, Ljava/util/List;

    .line 51
    .line 52
    if-nez p4, :cond_3

    .line 53
    .line 54
    sget-object p4, Ltf/t;->g:Ltf/t;

    .line 55
    .line 56
    :cond_3
    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object p4

    .line 60
    :goto_1
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_4

    .line 65
    .line 66
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    check-cast v0, Lc9/a;

    .line 71
    .line 72
    iget-object v0, v0, Lc9/a;->a:Ljava/lang/String;

    .line 73
    .line 74
    invoke-static {p0, p1, p2, p3, v0}, Lc9/d2;->k(Ljava/util/HashSet;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashSet;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_4
    :goto_2
    return-void
.end method

.method public static l(Landroid/content/Context;)Landroid/app/Activity;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    const/16 v1, 0x8

    .line 3
    .line 4
    if-ge v0, v1, :cond_1

    .line 5
    .line 6
    instance-of v1, p0, Landroid/app/Activity;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    check-cast p0, Landroid/app/Activity;

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    instance-of v1, p0, Landroid/content/ContextWrapper;

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    check-cast p0, Landroid/content/ContextWrapper;

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 p0, 0x0

    .line 27
    return-object p0
.end method

.method public static m(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z
    .locals 3

    .line 1
    sget-object v0, Lc9/d2;->e:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    :try_start_0
    sget-object v1, Lr8/i;->b:Lr8/i;

    .line 12
    .line 13
    invoke-virtual {v1, p0, p1}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 14
    .line 15
    .line 16
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    new-instance v1, Lsf/f;

    .line 21
    .line 22
    invoke-direct {v1, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    move-object p1, v1

    .line 26
    :goto_0
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    const-string v0, "[Hchat:ConversationGroup] Hook \u5b89\u88c5\u5931\u8d25: "

    .line 45
    .line 46
    const-string v2, " "

    .line 47
    .line 48
    invoke-static {v0, p0, v2, p1, v1}, Leh/a;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 52
    .line 53
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    return p0
.end method

.method public static n(Ljava/lang/String;Ljava/util/Map;)I
    .locals 2

    .line 1
    invoke-interface {p1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Ljava/lang/Number;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Ljava/lang/Number;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_1
    invoke-static {p0, p1}, Lc9/d2;->E(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const/16 p1, 0xa

    .line 25
    .line 26
    invoke-static {p1, p0}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    if-eqz p0, :cond_2

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    return p0

    .line 37
    :cond_2
    const/4 p0, 0x0

    .line 38
    return p0
.end method

.method public static o(Ljava/lang/reflect/Method;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 31
    .line 32
    invoke-static {p0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-eqz p0, :cond_0

    .line 37
    .line 38
    array-length p0, v0

    .line 39
    const/4 v1, 0x2

    .line 40
    if-ne p0, v1, :cond_0

    .line 41
    .line 42
    const-class p0, Landroid/view/MenuItem;

    .line 43
    .line 44
    aget-object v1, v0, v2

    .line 45
    .line 46
    invoke-virtual {p0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-eqz p0, :cond_0

    .line 51
    .line 52
    const/4 p0, 0x1

    .line 53
    aget-object v0, v0, p0

    .line 54
    .line 55
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 56
    .line 57
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_0

    .line 62
    .line 63
    return p0

    .line 64
    :cond_0
    return v2
.end method

.method public static p(Ljava/lang/reflect/Method;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    sget-object v3, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 31
    .line 32
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    array-length v1, v0

    .line 39
    const/4 v3, 0x3

    .line 40
    if-ne v1, v3, :cond_0

    .line 41
    .line 42
    const-class v1, Landroid/view/ContextMenu;

    .line 43
    .line 44
    aget-object v3, v0, v2

    .line 45
    .line 46
    invoke-virtual {v1, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_0

    .line 51
    .line 52
    const-class v1, Landroid/view/View;

    .line 53
    .line 54
    const/4 v3, 0x1

    .line 55
    aget-object v4, v0, v3

    .line 56
    .line 57
    invoke-virtual {v1, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_0

    .line 62
    .line 63
    const/4 v1, 0x2

    .line 64
    aget-object v0, v0, v1

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    const-string v1, "android.view.ContextMenu$ContextMenuInfo"

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_0

    .line 77
    .line 78
    invoke-static {p0}, Lc9/d2;->t(Ljava/lang/reflect/Method;)Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    if-eqz p0, :cond_0

    .line 83
    .line 84
    return v3

    .line 85
    :cond_0
    return v2
.end method

.method public static final q(Ljava/lang/String;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    const-string v1, "wxid_hchat_group_"

    .line 5
    .line 6
    invoke-static {p0, v1, v0}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    const/4 v1, 0x1

    .line 11
    if-ne p0, v1, :cond_0

    .line 12
    .line 13
    return v1

    .line 14
    :cond_0
    return v0
.end method

.method public static s(Ljava/lang/String;Ljava/util/Map;)J
    .locals 2

    .line 1
    invoke-interface {p1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Ljava/lang/Number;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Ljava/lang/Number;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 16
    .line 17
    .line 18
    move-result-wide p0

    .line 19
    return-wide p0

    .line 20
    :cond_1
    invoke-static {p0, p1}, Lc9/d2;->E(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {p0}, Log/t;->g0(Ljava/lang/String;)Ljava/lang/Long;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    if-eqz p0, :cond_2

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 31
    .line 32
    .line 33
    move-result-wide p0

    .line 34
    return-wide p0

    .line 35
    :cond_2
    const-wide/16 p0, 0x0

    .line 36
    .line 37
    return-wide p0
.end method

.method public static t(Ljava/lang/reflect/Method;)Ljava/lang/Class;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lh/Hchat/utils/KavaReflector;->declaredConstructors(Ljava/lang/Class;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Ltf/m;->m1(Ljava/lang/Iterable;)Ldg/n;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    new-instance v0, Lb4/b;

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    invoke-direct {v0, v1}, Lb4/b;-><init>(I)V

    .line 17
    .line 18
    .line 19
    new-instance v1, Ldg/j;

    .line 20
    .line 21
    sget-object v2, Lng/q;->n:Lng/q;

    .line 22
    .line 23
    invoke-direct {v1, p0, v0, v2}, Ldg/j;-><init>(Lng/j;Lfg/l;Lfg/l;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v1}, Lng/m;->S(Lng/j;)Lng/c;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0}, Lng/c;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    :cond_0
    move-object v0, p0

    .line 35
    check-cast v0, Ltf/b;

    .line 36
    .line 37
    invoke-virtual {v0}, Ltf/b;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_5

    .line 42
    .line 43
    invoke-virtual {v0}, Ltf/b;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    move-object v1, v0

    .line 48
    check-cast v1, Ljava/lang/Class;

    .line 49
    .line 50
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    const/4 v3, 0x0

    .line 55
    if-eqz v2, :cond_1

    .line 56
    .line 57
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-eqz v4, :cond_1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-eqz v4, :cond_4

    .line 73
    .line 74
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    check-cast v4, Ljava/lang/reflect/Field;

    .line 79
    .line 80
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    const-string v5, "com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI"

    .line 89
    .line 90
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-eqz v4, :cond_2

    .line 95
    .line 96
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 97
    .line 98
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    sget-object v4, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 102
    .line 103
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    const-class v5, Landroid/widget/AdapterView;

    .line 107
    .line 108
    const-class v6, Landroid/view/View;

    .line 109
    .line 110
    filled-new-array {v5, v6, v2, v4}, [Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    const-string v4, "onItemLongClick"

    .line 115
    .line 116
    invoke-static {v1, v4, v2}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    if-eqz v1, :cond_4

    .line 121
    .line 122
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 127
    .line 128
    invoke-static {v2, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    const/4 v4, 0x1

    .line 133
    if-eqz v2, :cond_3

    .line 134
    .line 135
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    if-nez v1, :cond_3

    .line 144
    .line 145
    move v1, v4

    .line 146
    goto :goto_0

    .line 147
    :cond_3
    move v1, v3

    .line 148
    :goto_0
    if-ne v1, v4, :cond_4

    .line 149
    .line 150
    move v3, v4

    .line 151
    :cond_4
    :goto_1
    if-eqz v3, :cond_0

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_5
    const/4 v0, 0x0

    .line 155
    :goto_2
    check-cast v0, Ljava/lang/Class;

    .line 156
    .line 157
    return-object v0
.end method

.method public static u(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)Ljava/lang/Class;
    .locals 2

    .line 1
    invoke-static {p0}, Lc9/d2;->p(Ljava/lang/reflect/Method;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    invoke-static {p1}, Lc9/d2;->o(Ljava/lang/reflect/Method;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    invoke-static {p0}, Lc9/d2;->t(Ljava/lang/reflect/Method;)Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    if-eqz p0, :cond_4

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->declaredConstructors(Ljava/lang/Class;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 v0, 0x0

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_3

    .line 47
    .line 48
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    check-cast v1, Ljava/lang/reflect/Constructor;

    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-static {v1, p0}, Ltf/l;->m0([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_2

    .line 66
    .line 67
    const/4 v0, 0x1

    .line 68
    :cond_3
    :goto_0
    if-eqz v0, :cond_4

    .line 69
    .line 70
    return-object p0

    .line 71
    :cond_4
    :goto_1
    const/4 p0, 0x0

    .line 72
    return-object p0
.end method

.method public static v(Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto :goto_2

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    new-array v1, v1, [Ljava/lang/Object;

    .line 7
    .line 8
    const-string v2, "getUserName"

    .line 9
    .line 10
    invoke-static {p0, v2, v1}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    instance-of v2, v1, Ljava/lang/String;

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    check-cast v1, Ljava/lang/String;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    move-object v1, v0

    .line 22
    :goto_0
    invoke-static {v1}, Lc9/d2;->q(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    return-object v1

    .line 29
    :cond_2
    const-string v1, "superUsername"

    .line 30
    .line 31
    invoke-static {p0, v1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    instance-of v1, p0, Ljava/lang/String;

    .line 36
    .line 37
    if-eqz v1, :cond_3

    .line 38
    .line 39
    check-cast p0, Ljava/lang/String;

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_3
    move-object p0, v0

    .line 43
    :goto_1
    if-eqz p0, :cond_4

    .line 44
    .line 45
    invoke-static {p0}, Lc9/d2;->q(Ljava/lang/String;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_4

    .line 50
    .line 51
    return-object p0

    .line 52
    :cond_4
    :goto_2
    return-object v0
.end method

.method public static w(Ljava/lang/Object;Landroid/content/Context;)V
    .locals 3

    .line 1
    const-string v0, "adapter"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-static {p0}, Lc9/d2;->v(Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    sget-object v2, Lc9/d2;->h:Ljava/util/Map;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    check-cast v2, Ljava/util/Map;

    .line 21
    .line 22
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    :cond_0
    sget-object v1, Lc9/d2;->p:Ljava/lang/reflect/Method;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    new-array v2, v2, [Ljava/lang/Object;

    .line 29
    .line 30
    invoke-static {v1, v0, v2}, Lh/Hchat/utils/KavaReflector;->invokeSuccessfully(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_1

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-string v1, "[Hchat:ConversationGroup] \u5237\u65b0\u5fae\u4fe1\u539f\u751f\u5206\u7ec4\u5217\u8868\u5931\u8d25: adapter="

    .line 45
    .line 46
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-static {v0}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    invoke-static {p0, p1}, Lc9/d2;->A(Ljava/lang/Object;Landroid/content/Context;)V

    .line 54
    .line 55
    .line 56
    invoke-static {p0}, Lc9/d2;->B(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :cond_2
    return-void
.end method

.method public static x(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    .line 1
    instance-of v0, p3, Landroid/widget/Adapter;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p3, Landroid/widget/Adapter;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object p3, v1

    .line 10
    :goto_0
    if-eqz p3, :cond_1

    .line 11
    .line 12
    invoke-interface {p3}, Landroid/widget/Adapter;->getCount()I

    .line 13
    .line 14
    .line 15
    move-result p3

    .line 16
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_1
    if-eqz v1, :cond_2

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result p3

    .line 26
    new-instance v0, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string p2, " ("

    .line 35
    .line 36
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string p2, ")"

    .line 43
    .line 44
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object p3

    .line 55
    const-class v0, Ljava/lang/String;

    .line 56
    .line 57
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const-string v1, "setMMTitle"

    .line 62
    .line 63
    invoke-static {p3, v1, v0}, Lh/Hchat/utils/KavaReflector;->findMethodRecursive(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 64
    .line 65
    .line 66
    move-result-object p3

    .line 67
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-static {p3, p1, v0}, Lh/Hchat/utils/KavaReflector;->invokeSuccessfully(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-nez p1, :cond_3

    .line 76
    .line 77
    new-instance p1, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    const-string p3, "[Hchat:ConversationGroup] \u8bbe\u7f6e\u5fae\u4fe1\u539f\u751f\u5206\u7ec4\u9875\u6807\u9898\u5931\u8d25: talker="

    .line 80
    .line 81
    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string p0, " title="

    .line 88
    .line 89
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-static {p0}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    :cond_3
    return-void
.end method

.method public static final y(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lc9/d2;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 8
    .line 9
    .line 10
    sget-object v0, Lc9/d2;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    new-instance v0, Lc9/p1;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-direct {v0, p0, v1}, Lc9/p1;-><init>(Landroid/content/Context;I)V

    .line 24
    .line 25
    .line 26
    sget-object p0, Lc9/d2;->m:Ljava/util/concurrent/ExecutorService;

    .line 27
    .line 28
    invoke-interface {p0, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public static z(Landroid/content/Context;)V
    .locals 45

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v2, "original_parent_refs"

    .line 4
    .line 5
    const-string v3, "{}"

    .line 6
    .line 7
    sget-object v4, Ltf/u;->g:Ltf/u;

    .line 8
    .line 9
    invoke-static {}, Lc9/o2;->a()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v5

    .line 13
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto/16 :goto_67

    .line 20
    .line 21
    :cond_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->database()Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    if-eqz v6, :cond_95

    .line 26
    .line 27
    invoke-static {v1}, Lc9/o2;->i(Landroid/content/Context;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v7

    .line 31
    const-string v8, "Hchat_conversation_groups"

    .line 32
    .line 33
    invoke-static {v1, v8}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-string v9, "enabled"

    .line 38
    .line 39
    const/4 v10, 0x0

    .line 40
    invoke-interface {v0, v9, v10}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 41
    .line 42
    .line 43
    move-result v9

    .line 44
    const-string v11, "digestUser"

    .line 45
    .line 46
    const-string v12, "digest"

    .line 47
    .line 48
    const-string v13, "flag"

    .line 49
    .line 50
    const-string v14, "msgType"

    .line 51
    .line 52
    const-string v15, "content"

    .line 53
    .line 54
    const-string v10, "conversationTime"

    .line 55
    .line 56
    move-object/from16 v17, v4

    .line 57
    .line 58
    const-string v4, "isSend"

    .line 59
    .line 60
    move/from16 v18, v9

    .line 61
    .line 62
    const-string v9, "status"

    .line 63
    .line 64
    move-object/from16 v19, v5

    .line 65
    .line 66
    const-string v5, "unReadCount"

    .line 67
    .line 68
    move-object/from16 v20, v2

    .line 69
    .line 70
    const-string v2, "username"

    .line 71
    .line 72
    if-eqz v18, :cond_9

    .line 73
    .line 74
    new-instance v0, Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object v21

    .line 83
    :goto_0
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result v22

    .line 87
    if-eqz v22, :cond_1

    .line 88
    .line 89
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v22

    .line 93
    move-object/from16 v23, v3

    .line 94
    .line 95
    move-object/from16 v3, v22

    .line 96
    .line 97
    check-cast v3, Lc9/a;

    .line 98
    .line 99
    iget-object v3, v3, Lc9/a;->e:Ljava/util/List;

    .line 100
    .line 101
    invoke-static {v0, v3}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 102
    .line 103
    .line 104
    move-object/from16 v3, v23

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_1
    move-object/from16 v23, v3

    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    if-eqz v3, :cond_2

    .line 114
    .line 115
    goto/16 :goto_5

    .line 116
    .line 117
    :cond_2
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->database()Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    if-eqz v3, :cond_a

    .line 122
    .line 123
    move-object/from16 v21, v0

    .line 124
    .line 125
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 126
    .line 127
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 128
    .line 129
    .line 130
    new-instance v1, Ljava/util/ArrayList;

    .line 131
    .line 132
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v21 .. v21}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 136
    .line 137
    .line 138
    move-result-object v21

    .line 139
    :goto_1
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v22

    .line 143
    if-eqz v22, :cond_4

    .line 144
    .line 145
    move-object/from16 v22, v8

    .line 146
    .line 147
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v8

    .line 151
    move-object/from16 v24, v8

    .line 152
    .line 153
    check-cast v24, Ljava/lang/String;

    .line 154
    .line 155
    invoke-static/range {v24 .. v24}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 156
    .line 157
    .line 158
    move-result v24

    .line 159
    if-nez v24, :cond_3

    .line 160
    .line 161
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    :cond_3
    move-object/from16 v8, v22

    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_4
    move-object/from16 v22, v8

    .line 168
    .line 169
    invoke-static {v1}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-static {v1}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    const/16 v8, 0x190

    .line 178
    .line 179
    invoke-static {v8, v1}, Ltf/m;->n1(ILjava/util/List;)Ljava/util/ArrayList;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 188
    .line 189
    .line 190
    move-result v8

    .line 191
    if-eqz v8, :cond_8

    .line 192
    .line 193
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v8

    .line 197
    check-cast v8, Ljava/util/List;

    .line 198
    .line 199
    move-object/from16 v21, v1

    .line 200
    .line 201
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    move-object/from16 v30, v6

    .line 206
    .line 207
    new-instance v6, Ljava/util/ArrayList;

    .line 208
    .line 209
    invoke-direct {v6, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 210
    .line 211
    .line 212
    move-object/from16 v31, v7

    .line 213
    .line 214
    const/4 v7, 0x0

    .line 215
    :goto_3
    if-ge v7, v1, :cond_5

    .line 216
    .line 217
    move/from16 v24, v1

    .line 218
    .line 219
    const-string v1, "?"

    .line 220
    .line 221
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    add-int/lit8 v7, v7, 0x1

    .line 225
    .line 226
    move/from16 v1, v24

    .line 227
    .line 228
    goto :goto_3

    .line 229
    :cond_5
    const/16 v28, 0x0

    .line 230
    .line 231
    const/16 v29, 0x3e

    .line 232
    .line 233
    const-string v25, ","

    .line 234
    .line 235
    const/16 v26, 0x0

    .line 236
    .line 237
    const/16 v27, 0x0

    .line 238
    .line 239
    move-object/from16 v24, v6

    .line 240
    .line 241
    invoke-static/range {v24 .. v29}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    const-string v6, "SELECT username,unReadCount,status,isSend,conversationTime,content,msgType,flag,digest,digestUser FROM rconversation WHERE username IN ("

    .line 246
    .line 247
    const-string v7, ")"

    .line 248
    .line 249
    invoke-static {v6, v1, v7}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    const/4 v6, 0x0

    .line 254
    new-array v7, v6, [Ljava/lang/String;

    .line 255
    .line 256
    invoke-interface {v8, v7}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v6

    .line 260
    check-cast v6, [Ljava/lang/String;

    .line 261
    .line 262
    invoke-virtual {v3, v1, v6}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->query(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    :cond_6
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 274
    .line 275
    .line 276
    move-result v6

    .line 277
    if-eqz v6, :cond_7

    .line 278
    .line 279
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v6

    .line 283
    check-cast v6, Ljava/util/Map;

    .line 284
    .line 285
    new-instance v32, Lc9/s1;

    .line 286
    .line 287
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    invoke-static {v2, v6}, Lc9/d2;->E(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v33

    .line 294
    invoke-static {v5, v6}, Lc9/d2;->n(Ljava/lang/String;Ljava/util/Map;)I

    .line 295
    .line 296
    .line 297
    move-result v34

    .line 298
    invoke-static {v9, v6}, Lc9/d2;->n(Ljava/lang/String;Ljava/util/Map;)I

    .line 299
    .line 300
    .line 301
    move-result v35

    .line 302
    invoke-static {v4, v6}, Lc9/d2;->n(Ljava/lang/String;Ljava/util/Map;)I

    .line 303
    .line 304
    .line 305
    move-result v36

    .line 306
    invoke-static {v10, v6}, Lc9/d2;->s(Ljava/lang/String;Ljava/util/Map;)J

    .line 307
    .line 308
    .line 309
    move-result-wide v37

    .line 310
    invoke-static {v15, v6}, Lc9/d2;->E(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v39

    .line 314
    invoke-static {v14, v6}, Lc9/d2;->n(Ljava/lang/String;Ljava/util/Map;)I

    .line 315
    .line 316
    .line 317
    move-result v40

    .line 318
    invoke-static {v13, v6}, Lc9/d2;->s(Ljava/lang/String;Ljava/util/Map;)J

    .line 319
    .line 320
    .line 321
    move-result-wide v41

    .line 322
    invoke-static {v12, v6}, Lc9/d2;->E(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v43

    .line 326
    invoke-static {v11, v6}, Lc9/d2;->E(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v44

    .line 330
    invoke-direct/range {v32 .. v44}, Lc9/s1;-><init>(Ljava/lang/String;IIIJLjava/lang/String;IJLjava/lang/String;Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    move-object/from16 v6, v32

    .line 334
    .line 335
    move-object/from16 v7, v33

    .line 336
    .line 337
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 338
    .line 339
    .line 340
    move-result v8

    .line 341
    if-nez v8, :cond_6

    .line 342
    .line 343
    invoke-interface {v0, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    goto :goto_4

    .line 347
    :cond_7
    move-object/from16 v1, v21

    .line 348
    .line 349
    move-object/from16 v6, v30

    .line 350
    .line 351
    move-object/from16 v7, v31

    .line 352
    .line 353
    goto/16 :goto_2

    .line 354
    .line 355
    :cond_8
    move-object/from16 v30, v6

    .line 356
    .line 357
    move-object/from16 v31, v7

    .line 358
    .line 359
    goto :goto_6

    .line 360
    :cond_9
    move-object/from16 v23, v3

    .line 361
    .line 362
    :cond_a
    :goto_5
    move-object/from16 v30, v6

    .line 363
    .line 364
    move-object/from16 v31, v7

    .line 365
    .line 366
    move-object/from16 v22, v8

    .line 367
    .line 368
    move-object/from16 v0, v17

    .line 369
    .line 370
    :goto_6
    if-eqz v18, :cond_19

    .line 371
    .line 372
    new-instance v3, Ljava/util/ArrayList;

    .line 373
    .line 374
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 375
    .line 376
    .line 377
    invoke-interface/range {v31 .. v31}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 378
    .line 379
    .line 380
    move-result-object v7

    .line 381
    :goto_7
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 382
    .line 383
    .line 384
    move-result v8

    .line 385
    if-eqz v8, :cond_18

    .line 386
    .line 387
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v8

    .line 391
    check-cast v8, Lc9/a;

    .line 392
    .line 393
    iget-object v1, v8, Lc9/a;->a:Ljava/lang/String;

    .line 394
    .line 395
    move-object/from16 v6, v31

    .line 396
    .line 397
    invoke-static {v1, v6}, Lc9/d2;->j(Ljava/lang/String;Ljava/util/List;)Ljava/util/LinkedHashSet;

    .line 398
    .line 399
    .line 400
    move-result-object v1

    .line 401
    move-object/from16 v25, v1

    .line 402
    .line 403
    new-instance v1, Ljava/util/ArrayList;

    .line 404
    .line 405
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 406
    .line 407
    .line 408
    invoke-interface/range {v25 .. v25}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 409
    .line 410
    .line 411
    move-result-object v25

    .line 412
    :goto_8
    invoke-interface/range {v25 .. v25}, Ljava/util/Iterator;->hasNext()Z

    .line 413
    .line 414
    .line 415
    move-result v26

    .line 416
    if-eqz v26, :cond_c

    .line 417
    .line 418
    invoke-interface/range {v25 .. v25}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v26

    .line 422
    move-object/from16 v31, v6

    .line 423
    .line 424
    move-object/from16 v6, v26

    .line 425
    .line 426
    check-cast v6, Ljava/lang/String;

    .line 427
    .line 428
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v6

    .line 432
    check-cast v6, Lc9/s1;

    .line 433
    .line 434
    if-eqz v6, :cond_b

    .line 435
    .line 436
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 437
    .line 438
    .line 439
    :cond_b
    move-object/from16 v6, v31

    .line 440
    .line 441
    goto :goto_8

    .line 442
    :cond_c
    move-object/from16 v31, v6

    .line 443
    .line 444
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 445
    .line 446
    .line 447
    move-result v6

    .line 448
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 449
    .line 450
    .line 451
    move-result-object v25

    .line 452
    move-object/from16 v26, v0

    .line 453
    .line 454
    const/4 v0, 0x0

    .line 455
    :goto_9
    invoke-interface/range {v25 .. v25}, Ljava/util/Iterator;->hasNext()Z

    .line 456
    .line 457
    .line 458
    move-result v27

    .line 459
    if-eqz v27, :cond_e

    .line 460
    .line 461
    invoke-interface/range {v25 .. v25}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v27

    .line 465
    move-object/from16 v28, v1

    .line 466
    .line 467
    move-object/from16 v1, v27

    .line 468
    .line 469
    check-cast v1, Lc9/s1;

    .line 470
    .line 471
    iget v1, v1, Lc9/s1;->b:I

    .line 472
    .line 473
    if-gez v1, :cond_d

    .line 474
    .line 475
    const/4 v1, 0x0

    .line 476
    :cond_d
    add-int/2addr v0, v1

    .line 477
    move-object/from16 v1, v28

    .line 478
    .line 479
    goto :goto_9

    .line 480
    :cond_e
    move-object/from16 v28, v1

    .line 481
    .line 482
    invoke-virtual/range {v28 .. v28}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 483
    .line 484
    .line 485
    move-result-object v1

    .line 486
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 487
    .line 488
    .line 489
    move-result v25

    .line 490
    if-nez v25, :cond_f

    .line 491
    .line 492
    move-object/from16 v28, v11

    .line 493
    .line 494
    move-object/from16 v29, v12

    .line 495
    .line 496
    const/16 v25, 0x0

    .line 497
    .line 498
    goto :goto_a

    .line 499
    :cond_f
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object v25

    .line 503
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 504
    .line 505
    .line 506
    move-result v27

    .line 507
    if-nez v27, :cond_10

    .line 508
    .line 509
    move-object/from16 v28, v11

    .line 510
    .line 511
    move-object/from16 v29, v12

    .line 512
    .line 513
    goto :goto_a

    .line 514
    :cond_10
    move-object/from16 v27, v1

    .line 515
    .line 516
    move-object/from16 v1, v25

    .line 517
    .line 518
    check-cast v1, Lc9/s1;

    .line 519
    .line 520
    move-object/from16 v28, v11

    .line 521
    .line 522
    move-object/from16 v29, v12

    .line 523
    .line 524
    iget-wide v11, v1, Lc9/s1;->e:J

    .line 525
    .line 526
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 527
    .line 528
    .line 529
    move-result-object v1

    .line 530
    :cond_11
    invoke-interface/range {v27 .. v27}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    move-result-object v11

    .line 534
    move-object v12, v11

    .line 535
    check-cast v12, Lc9/s1;

    .line 536
    .line 537
    move-object/from16 v32, v11

    .line 538
    .line 539
    iget-wide v11, v12, Lc9/s1;->e:J

    .line 540
    .line 541
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 542
    .line 543
    .line 544
    move-result-object v11

    .line 545
    invoke-virtual {v1, v11}, Ljava/lang/Long;->compareTo(Ljava/lang/Object;)I

    .line 546
    .line 547
    .line 548
    move-result v12

    .line 549
    if-gez v12, :cond_12

    .line 550
    .line 551
    move-object v1, v11

    .line 552
    move-object/from16 v25, v32

    .line 553
    .line 554
    :cond_12
    invoke-interface/range {v27 .. v27}, Ljava/util/Iterator;->hasNext()Z

    .line 555
    .line 556
    .line 557
    move-result v11

    .line 558
    if-nez v11, :cond_11

    .line 559
    .line 560
    :goto_a
    move-object/from16 v1, v25

    .line 561
    .line 562
    check-cast v1, Lc9/s1;

    .line 563
    .line 564
    new-instance v11, Lc9/t1;

    .line 565
    .line 566
    invoke-direct {v11, v6, v0, v1}, Lc9/t1;-><init>(IILc9/s1;)V

    .line 567
    .line 568
    .line 569
    if-gtz v6, :cond_14

    .line 570
    .line 571
    iget-boolean v0, v8, Lc9/a;->l:Z

    .line 572
    .line 573
    if-eqz v0, :cond_13

    .line 574
    .line 575
    goto :goto_b

    .line 576
    :cond_13
    const/4 v0, 0x0

    .line 577
    goto :goto_c

    .line 578
    :cond_14
    :goto_b
    const/4 v0, 0x1

    .line 579
    :goto_c
    if-eqz v0, :cond_15

    .line 580
    .line 581
    goto :goto_d

    .line 582
    :cond_15
    const/4 v8, 0x0

    .line 583
    :goto_d
    if-eqz v8, :cond_16

    .line 584
    .line 585
    new-instance v0, Lsf/e;

    .line 586
    .line 587
    invoke-direct {v0, v8, v11}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 588
    .line 589
    .line 590
    goto :goto_e

    .line 591
    :cond_16
    const/4 v0, 0x0

    .line 592
    :goto_e
    if-eqz v0, :cond_17

    .line 593
    .line 594
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 595
    .line 596
    .line 597
    :cond_17
    move-object/from16 v0, v26

    .line 598
    .line 599
    move-object/from16 v11, v28

    .line 600
    .line 601
    move-object/from16 v12, v29

    .line 602
    .line 603
    goto/16 :goto_7

    .line 604
    .line 605
    :cond_18
    move-object/from16 v28, v11

    .line 606
    .line 607
    move-object/from16 v29, v12

    .line 608
    .line 609
    :goto_f
    const/16 v16, 0x0

    .line 610
    .line 611
    goto :goto_10

    .line 612
    :cond_19
    move-object/from16 v28, v11

    .line 613
    .line 614
    move-object/from16 v29, v12

    .line 615
    .line 616
    sget-object v3, Ltf/t;->g:Ltf/t;

    .line 617
    .line 618
    goto :goto_f

    .line 619
    :goto_10
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 620
    .line 621
    .line 622
    move-result-object v1

    .line 623
    new-instance v6, Ljava/util/LinkedHashSet;

    .line 624
    .line 625
    invoke-direct {v6}, Ljava/util/LinkedHashSet;-><init>()V

    .line 626
    .line 627
    .line 628
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 629
    .line 630
    .line 631
    move-result-object v7

    .line 632
    :goto_11
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 633
    .line 634
    .line 635
    move-result v0

    .line 636
    const-string v8, "rconversation"

    .line 637
    .line 638
    const-string v11, "username=?"

    .line 639
    .line 640
    const-string v12, "rcontact"

    .line 641
    .line 642
    move-object/from16 v25, v3

    .line 643
    .line 644
    const-string v3, "img_flag"

    .line 645
    .line 646
    move-object/from16 v26, v7

    .line 647
    .line 648
    const-string v7, "parentRef"

    .line 649
    .line 650
    move-object/from16 v27, v6

    .line 651
    .line 652
    const-string v6, ""

    .line 653
    .line 654
    if-eqz v0, :cond_49

    .line 655
    .line 656
    invoke-interface/range {v26 .. v26}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    move-result-object v0

    .line 660
    check-cast v0, Lsf/e;

    .line 661
    .line 662
    move-object/from16 v32, v8

    .line 663
    .line 664
    iget-object v8, v0, Lsf/e;->g:Ljava/lang/Object;

    .line 665
    .line 666
    check-cast v8, Lc9/a;

    .line 667
    .line 668
    iget-object v0, v0, Lsf/e;->h:Ljava/lang/Object;

    .line 669
    .line 670
    move-object/from16 v33, v13

    .line 671
    .line 672
    move-object v13, v0

    .line 673
    check-cast v13, Lc9/t1;

    .line 674
    .line 675
    iget-object v0, v8, Lc9/a;->a:Ljava/lang/String;

    .line 676
    .line 677
    move-object/from16 v34, v14

    .line 678
    .line 679
    iget-boolean v14, v8, Lc9/a;->j:Z

    .line 680
    .line 681
    move/from16 v35, v14

    .line 682
    .line 683
    invoke-static {v0}, Lc9/d2;->F(Ljava/lang/String;)Ljava/lang/String;

    .line 684
    .line 685
    .line 686
    move-result-object v14

    .line 687
    new-instance v0, Landroid/content/ContentValues;

    .line 688
    .line 689
    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 690
    .line 691
    .line 692
    invoke-virtual {v0, v2, v14}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 693
    .line 694
    .line 695
    move-object/from16 v36, v15

    .line 696
    .line 697
    const-string v15, "nickname"

    .line 698
    .line 699
    move-object/from16 v37, v10

    .line 700
    .line 701
    iget-object v10, v8, Lc9/a;->b:Ljava/lang/String;

    .line 702
    .line 703
    invoke-virtual {v0, v15, v10}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 704
    .line 705
    .line 706
    const-string v10, "encryptUsername"

    .line 707
    .line 708
    invoke-virtual {v0, v10, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 709
    .line 710
    .line 711
    const-string v10, "type"

    .line 712
    .line 713
    invoke-virtual {v0, v10, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 714
    .line 715
    .line 716
    const-string v10, "verifyFlag"

    .line 717
    .line 718
    invoke-virtual {v0, v10, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 719
    .line 720
    .line 721
    move-object/from16 v10, v30

    .line 722
    .line 723
    invoke-static {v10, v12, v14, v0}, Lc9/d2;->D(Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)Z

    .line 724
    .line 725
    .line 726
    move-result v0

    .line 727
    if-nez v0, :cond_1a

    .line 728
    .line 729
    move-object v13, v4

    .line 730
    move-object v15, v5

    .line 731
    move-object/from16 v8, v27

    .line 732
    .line 733
    move-object/from16 v12, v28

    .line 734
    .line 735
    move-object/from16 v4, v29

    .line 736
    .line 737
    move-object/from16 v5, v33

    .line 738
    .line 739
    move-object/from16 v11, v34

    .line 740
    .line 741
    move-object/from16 v7, v36

    .line 742
    .line 743
    goto/16 :goto_34

    .line 744
    .line 745
    :cond_1a
    iget-object v12, v13, Lc9/t1;->c:Lc9/s1;

    .line 746
    .line 747
    if-eqz v12, :cond_1e

    .line 748
    .line 749
    if-eqz v35, :cond_1b

    .line 750
    .line 751
    move-object v0, v12

    .line 752
    goto :goto_12

    .line 753
    :cond_1b
    const/4 v0, 0x0

    .line 754
    :goto_12
    if-eqz v0, :cond_1e

    .line 755
    .line 756
    :try_start_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contact()Li8/a;

    .line 757
    .line 758
    .line 759
    move-result-object v15

    .line 760
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 761
    .line 762
    .line 763
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->e()Lg8/i;

    .line 764
    .line 765
    .line 766
    move-result-object v15

    .line 767
    if-eqz v15, :cond_1c

    .line 768
    .line 769
    iget-object v0, v0, Lc9/s1;->a:Ljava/lang/String;

    .line 770
    .line 771
    invoke-virtual {v15, v0}, Lg8/i;->n(Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatContact;

    .line 772
    .line 773
    .line 774
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 775
    goto :goto_14

    .line 776
    :catchall_0
    move-exception v0

    .line 777
    goto :goto_13

    .line 778
    :cond_1c
    const/4 v0, 0x0

    .line 779
    goto :goto_14

    .line 780
    :goto_13
    new-instance v15, Lsf/f;

    .line 781
    .line 782
    invoke-direct {v15, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 783
    .line 784
    .line 785
    move-object v0, v15

    .line 786
    :goto_14
    nop

    .line 787
    instance-of v15, v0, Lsf/f;

    .line 788
    .line 789
    if-eqz v15, :cond_1d

    .line 790
    .line 791
    const/4 v0, 0x0

    .line 792
    :cond_1d
    check-cast v0, Lh/Hchat/hooks/api/model/WeChatContact;

    .line 793
    .line 794
    goto :goto_15

    .line 795
    :cond_1e
    const/4 v0, 0x0

    .line 796
    :goto_15
    if-eqz v0, :cond_1f

    .line 797
    .line 798
    iget-object v15, v0, Lh/Hchat/hooks/api/model/WeChatContact;->avatarUrl:Ljava/lang/String;

    .line 799
    .line 800
    invoke-static {v15}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 801
    .line 802
    .line 803
    move-result v15

    .line 804
    if-eqz v15, :cond_20

    .line 805
    .line 806
    iget-object v15, v0, Lh/Hchat/hooks/api/model/WeChatContact;->avatarBackupUrl:Ljava/lang/String;

    .line 807
    .line 808
    invoke-static {v15}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 809
    .line 810
    .line 811
    move-result v15

    .line 812
    if-nez v15, :cond_1f

    .line 813
    .line 814
    goto :goto_16

    .line 815
    :cond_1f
    move-object/from16 v30, v6

    .line 816
    .line 817
    goto :goto_17

    .line 818
    :cond_20
    :goto_16
    new-instance v11, Landroid/content/ContentValues;

    .line 819
    .line 820
    invoke-direct {v11}, Landroid/content/ContentValues;-><init>()V

    .line 821
    .line 822
    .line 823
    invoke-virtual {v11, v2, v14}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 824
    .line 825
    .line 826
    const-string v15, "reserved1"

    .line 827
    .line 828
    move-object/from16 v30, v6

    .line 829
    .line 830
    iget-object v6, v0, Lh/Hchat/hooks/api/model/WeChatContact;->avatarUrl:Ljava/lang/String;

    .line 831
    .line 832
    invoke-virtual {v11, v15, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 833
    .line 834
    .line 835
    const-string v6, "reserved2"

    .line 836
    .line 837
    iget-object v0, v0, Lh/Hchat/hooks/api/model/WeChatContact;->avatarBackupUrl:Ljava/lang/String;

    .line 838
    .line 839
    invoke-virtual {v11, v6, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 840
    .line 841
    .line 842
    invoke-static {v10, v3, v14, v11}, Lc9/d2;->D(Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)Z

    .line 843
    .line 844
    .line 845
    goto :goto_18

    .line 846
    :goto_17
    filled-new-array {v14}, [Ljava/lang/String;

    .line 847
    .line 848
    .line 849
    move-result-object v0

    .line 850
    invoke-virtual {v10, v3, v11, v0}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 851
    .line 852
    .line 853
    :goto_18
    iget-boolean v0, v8, Lc9/a;->i:Z

    .line 854
    .line 855
    if-eqz v0, :cond_21

    .line 856
    .line 857
    iget v0, v13, Lc9/t1;->b:I

    .line 858
    .line 859
    move v3, v0

    .line 860
    goto :goto_19

    .line 861
    :cond_21
    const/4 v3, 0x0

    .line 862
    :goto_19
    iget v0, v13, Lc9/t1;->a:I

    .line 863
    .line 864
    if-lez v3, :cond_22

    .line 865
    .line 866
    new-instance v6, Ljava/lang/StringBuilder;

    .line 867
    .line 868
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 869
    .line 870
    .line 871
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 872
    .line 873
    .line 874
    const-string v0, " \u4e2a\u4f1a\u8bdd \u00b7 "

    .line 875
    .line 876
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 877
    .line 878
    .line 879
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 880
    .line 881
    .line 882
    const-string v0, " \u6761\u672a\u8bfb"

    .line 883
    .line 884
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 885
    .line 886
    .line 887
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 888
    .line 889
    .line 890
    move-result-object v0

    .line 891
    :goto_1a
    move-object v6, v0

    .line 892
    goto :goto_1b

    .line 893
    :cond_22
    const-string v6, " \u4e2a\u4f1a\u8bdd"

    .line 894
    .line 895
    invoke-static {v0, v6}, Lp/a;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 896
    .line 897
    .line 898
    move-result-object v0

    .line 899
    goto :goto_1a

    .line 900
    :goto_1b
    if-eqz v35, :cond_24

    .line 901
    .line 902
    if-eqz v12, :cond_24

    .line 903
    .line 904
    iget-object v0, v12, Lc9/s1;->f:Ljava/lang/String;

    .line 905
    .line 906
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 907
    .line 908
    .line 909
    move-result v0

    .line 910
    if-eqz v0, :cond_23

    .line 911
    .line 912
    iget-object v0, v12, Lc9/s1;->i:Ljava/lang/String;

    .line 913
    .line 914
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 915
    .line 916
    .line 917
    move-result v0

    .line 918
    if-nez v0, :cond_24

    .line 919
    .line 920
    :cond_23
    const/4 v11, 0x1

    .line 921
    goto :goto_1c

    .line 922
    :cond_24
    const/4 v11, 0x0

    .line 923
    :goto_1c
    if-eqz v12, :cond_35

    .line 924
    .line 925
    if-eqz v11, :cond_25

    .line 926
    .line 927
    move-object v0, v12

    .line 928
    goto :goto_1d

    .line 929
    :cond_25
    const/4 v0, 0x0

    .line 930
    :goto_1d
    if-eqz v0, :cond_35

    .line 931
    .line 932
    iget-object v13, v0, Lc9/s1;->i:Ljava/lang/String;

    .line 933
    .line 934
    iget-object v15, v0, Lc9/s1;->j:Ljava/lang/String;

    .line 935
    .line 936
    invoke-static {v13}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 937
    .line 938
    .line 939
    move-result v38

    .line 940
    const-string v39, "[\u6d88\u606f]"

    .line 941
    .line 942
    if-eqz v38, :cond_2c

    .line 943
    .line 944
    iget v13, v0, Lc9/s1;->g:I

    .line 945
    .line 946
    move/from16 v38, v3

    .line 947
    .line 948
    const/4 v3, 0x1

    .line 949
    if-eq v13, v3, :cond_2b

    .line 950
    .line 951
    const/4 v3, 0x3

    .line 952
    if-eq v13, v3, :cond_2a

    .line 953
    .line 954
    const/16 v3, 0x22

    .line 955
    .line 956
    if-eq v13, v3, :cond_29

    .line 957
    .line 958
    const/16 v3, 0x2b

    .line 959
    .line 960
    if-eq v13, v3, :cond_28

    .line 961
    .line 962
    const/16 v3, 0x3e

    .line 963
    .line 964
    if-eq v13, v3, :cond_28

    .line 965
    .line 966
    const/16 v3, 0x2710

    .line 967
    .line 968
    if-eq v13, v3, :cond_2b

    .line 969
    .line 970
    const/16 v0, 0x2f

    .line 971
    .line 972
    if-eq v13, v0, :cond_27

    .line 973
    .line 974
    const/16 v0, 0x30

    .line 975
    .line 976
    if-eq v13, v0, :cond_26

    .line 977
    .line 978
    move-object/from16 v13, v39

    .line 979
    .line 980
    goto :goto_1f

    .line 981
    :cond_26
    const-string v0, "[\u4f4d\u7f6e]"

    .line 982
    .line 983
    :goto_1e
    move-object v13, v0

    .line 984
    goto :goto_1f

    .line 985
    :cond_27
    const-string v0, "[\u52a8\u753b\u8868\u60c5]"

    .line 986
    .line 987
    goto :goto_1e

    .line 988
    :cond_28
    const-string v0, "[\u89c6\u9891]"

    .line 989
    .line 990
    goto :goto_1e

    .line 991
    :cond_29
    const-string v0, "[\u8bed\u97f3]"

    .line 992
    .line 993
    goto :goto_1e

    .line 994
    :cond_2a
    const-string v0, "[\u56fe\u7247]"

    .line 995
    .line 996
    goto :goto_1e

    .line 997
    :cond_2b
    iget-object v0, v0, Lc9/s1;->f:Ljava/lang/String;

    .line 998
    .line 999
    goto :goto_1e

    .line 1000
    :cond_2c
    move/from16 v38, v3

    .line 1001
    .line 1002
    :goto_1f
    invoke-static {v15}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1003
    .line 1004
    .line 1005
    move-result v0

    .line 1006
    if-nez v0, :cond_33

    .line 1007
    .line 1008
    const/16 v0, 0x25

    .line 1009
    .line 1010
    invoke-static {v13, v0}, Log/m;->i0(Ljava/lang/CharSequence;C)Z

    .line 1011
    .line 1012
    .line 1013
    move-result v0

    .line 1014
    if-nez v0, :cond_2d

    .line 1015
    .line 1016
    goto :goto_25

    .line 1017
    :cond_2d
    :try_start_1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contact()Li8/a;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v0

    .line 1021
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1022
    .line 1023
    .line 1024
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->e()Lg8/i;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v0

    .line 1028
    if-eqz v0, :cond_2e

    .line 1029
    .line 1030
    invoke-virtual {v0, v15}, Lg8/i;->n(Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatContact;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v0

    .line 1034
    if-eqz v0, :cond_2e

    .line 1035
    .line 1036
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatContact;->displayName()Ljava/lang/String;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1040
    goto :goto_21

    .line 1041
    :catchall_1
    move-exception v0

    .line 1042
    goto :goto_20

    .line 1043
    :cond_2e
    const/4 v0, 0x0

    .line 1044
    goto :goto_21

    .line 1045
    :goto_20
    new-instance v3, Lsf/f;

    .line 1046
    .line 1047
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1048
    .line 1049
    .line 1050
    move-object v0, v3

    .line 1051
    :goto_21
    nop

    .line 1052
    instance-of v3, v0, Lsf/f;

    .line 1053
    .line 1054
    if-eqz v3, :cond_2f

    .line 1055
    .line 1056
    const/4 v0, 0x0

    .line 1057
    :cond_2f
    check-cast v0, Ljava/lang/String;

    .line 1058
    .line 1059
    if-nez v0, :cond_30

    .line 1060
    .line 1061
    move-object/from16 v0, v30

    .line 1062
    .line 1063
    :cond_30
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1064
    .line 1065
    .line 1066
    move-result v3

    .line 1067
    if-eqz v3, :cond_31

    .line 1068
    .line 1069
    goto :goto_22

    .line 1070
    :cond_31
    move-object v15, v0

    .line 1071
    :goto_22
    :try_start_2
    filled-new-array {v15}, [Ljava/lang/Object;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v0

    .line 1075
    const/4 v3, 0x1

    .line 1076
    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v0

    .line 1080
    invoke-static {v13, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 1084
    goto :goto_23

    .line 1085
    :catchall_2
    move-exception v0

    .line 1086
    new-instance v3, Lsf/f;

    .line 1087
    .line 1088
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1089
    .line 1090
    .line 1091
    move-object v0, v3

    .line 1092
    :goto_23
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v3

    .line 1096
    if-nez v3, :cond_32

    .line 1097
    .line 1098
    goto :goto_24

    .line 1099
    :cond_32
    const-string v0, "%1$s"

    .line 1100
    .line 1101
    const/4 v3, 0x0

    .line 1102
    invoke-static {v13, v0, v15, v3}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v0

    .line 1106
    const-string v13, "%s"

    .line 1107
    .line 1108
    invoke-static {v0, v13, v15, v3}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v0

    .line 1112
    :goto_24
    move-object v13, v0

    .line 1113
    check-cast v13, Ljava/lang/String;

    .line 1114
    .line 1115
    :cond_33
    :goto_25
    invoke-static {v13}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v0

    .line 1119
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v0

    .line 1123
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1124
    .line 1125
    .line 1126
    move-result v3

    .line 1127
    if-eqz v3, :cond_34

    .line 1128
    .line 1129
    move-object/from16 v0, v39

    .line 1130
    .line 1131
    :cond_34
    const-string v3, "%"

    .line 1132
    .line 1133
    const-string v13, "%%"

    .line 1134
    .line 1135
    const/4 v15, 0x0

    .line 1136
    invoke-static {v0, v3, v13, v15}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v0

    .line 1140
    const-string v3, "%s: "

    .line 1141
    .line 1142
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v0

    .line 1146
    goto :goto_26

    .line 1147
    :cond_35
    move/from16 v38, v3

    .line 1148
    .line 1149
    const/4 v0, 0x0

    .line 1150
    :goto_26
    new-instance v3, Landroid/content/ContentValues;

    .line 1151
    .line 1152
    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 1153
    .line 1154
    .line 1155
    invoke-virtual {v3, v2, v14}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1156
    .line 1157
    .line 1158
    iget-object v13, v8, Lc9/a;->c:Ljava/lang/String;

    .line 1159
    .line 1160
    if-eqz v13, :cond_36

    .line 1161
    .line 1162
    invoke-static {v13}, Lc9/d2;->F(Ljava/lang/String;)Ljava/lang/String;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v13

    .line 1166
    goto :goto_27

    .line 1167
    :cond_36
    const/4 v13, 0x0

    .line 1168
    :goto_27
    if-nez v13, :cond_37

    .line 1169
    .line 1170
    move-object/from16 v13, v30

    .line 1171
    .line 1172
    :cond_37
    invoke-virtual {v3, v7, v13}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1173
    .line 1174
    .line 1175
    invoke-static/range {v38 .. v38}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v7

    .line 1179
    invoke-virtual {v3, v5, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 1180
    .line 1181
    .line 1182
    if-eqz v12, :cond_38

    .line 1183
    .line 1184
    iget v7, v12, Lc9/s1;->c:I

    .line 1185
    .line 1186
    goto :goto_28

    .line 1187
    :cond_38
    const/4 v7, 0x0

    .line 1188
    :goto_28
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v7

    .line 1192
    invoke-virtual {v3, v9, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 1193
    .line 1194
    .line 1195
    if-eqz v12, :cond_39

    .line 1196
    .line 1197
    iget v7, v12, Lc9/s1;->d:I

    .line 1198
    .line 1199
    goto :goto_29

    .line 1200
    :cond_39
    const/4 v7, 0x0

    .line 1201
    :goto_29
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1202
    .line 1203
    .line 1204
    move-result-object v7

    .line 1205
    invoke-virtual {v3, v4, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 1206
    .line 1207
    .line 1208
    const-wide/16 v38, 0x0

    .line 1209
    .line 1210
    move-object v13, v4

    .line 1211
    move-object v15, v5

    .line 1212
    if-eqz v12, :cond_3a

    .line 1213
    .line 1214
    iget-wide v4, v12, Lc9/s1;->e:J

    .line 1215
    .line 1216
    goto :goto_2a

    .line 1217
    :cond_3a
    move-wide/from16 v4, v38

    .line 1218
    .line 1219
    :goto_2a
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1220
    .line 1221
    .line 1222
    move-result-object v4

    .line 1223
    move-object/from16 v5, v37

    .line 1224
    .line 1225
    invoke-virtual {v3, v5, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 1226
    .line 1227
    .line 1228
    if-eqz v35, :cond_3e

    .line 1229
    .line 1230
    if-eqz v12, :cond_3b

    .line 1231
    .line 1232
    iget-object v4, v12, Lc9/s1;->f:Ljava/lang/String;

    .line 1233
    .line 1234
    goto :goto_2b

    .line 1235
    :cond_3b
    const/4 v4, 0x0

    .line 1236
    :goto_2b
    if-nez v4, :cond_3c

    .line 1237
    .line 1238
    move-object/from16 v4, v30

    .line 1239
    .line 1240
    :cond_3c
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1241
    .line 1242
    .line 1243
    move-result v7

    .line 1244
    if-eqz v7, :cond_3d

    .line 1245
    .line 1246
    if-eqz v11, :cond_3e

    .line 1247
    .line 1248
    move-object/from16 v4, v30

    .line 1249
    .line 1250
    :cond_3d
    :goto_2c
    move-object/from16 v7, v36

    .line 1251
    .line 1252
    goto :goto_2d

    .line 1253
    :cond_3e
    move-object v4, v6

    .line 1254
    goto :goto_2c

    .line 1255
    :goto_2d
    invoke-virtual {v3, v7, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1256
    .line 1257
    .line 1258
    if-eqz v35, :cond_40

    .line 1259
    .line 1260
    if-eqz v12, :cond_3f

    .line 1261
    .line 1262
    iget v4, v12, Lc9/s1;->g:I

    .line 1263
    .line 1264
    goto :goto_2e

    .line 1265
    :cond_3f
    const/4 v4, 0x0

    .line 1266
    goto :goto_2e

    .line 1267
    :cond_40
    const/4 v4, 0x1

    .line 1268
    :goto_2e
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1269
    .line 1270
    .line 1271
    move-result-object v4

    .line 1272
    move-object/from16 v11, v34

    .line 1273
    .line 1274
    invoke-virtual {v3, v11, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 1275
    .line 1276
    .line 1277
    iget-boolean v4, v8, Lc9/a;->g:Z

    .line 1278
    .line 1279
    if-eqz v4, :cond_42

    .line 1280
    .line 1281
    iget v4, v8, Lc9/a;->d:I

    .line 1282
    .line 1283
    if-gez v4, :cond_41

    .line 1284
    .line 1285
    const/4 v4, 0x0

    .line 1286
    :cond_41
    move-object/from16 v37, v5

    .line 1287
    .line 1288
    int-to-long v4, v4

    .line 1289
    const-wide v38, 0x7fffffffffffffffL

    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    sub-long v38, v38, v4

    .line 1295
    .line 1296
    goto :goto_2f

    .line 1297
    :cond_42
    move-object/from16 v37, v5

    .line 1298
    .line 1299
    if-eqz v12, :cond_43

    .line 1300
    .line 1301
    iget-wide v4, v12, Lc9/s1;->e:J

    .line 1302
    .line 1303
    move-wide/from16 v38, v4

    .line 1304
    .line 1305
    :cond_43
    :goto_2f
    invoke-static/range {v38 .. v39}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v4

    .line 1309
    move-object/from16 v5, v33

    .line 1310
    .line 1311
    invoke-virtual {v3, v5, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 1312
    .line 1313
    .line 1314
    if-eqz v35, :cond_44

    .line 1315
    .line 1316
    if-eqz v0, :cond_44

    .line 1317
    .line 1318
    move-object v6, v0

    .line 1319
    :cond_44
    move-object/from16 v4, v29

    .line 1320
    .line 1321
    invoke-virtual {v3, v4, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1322
    .line 1323
    .line 1324
    if-eqz v35, :cond_47

    .line 1325
    .line 1326
    if-eqz v0, :cond_47

    .line 1327
    .line 1328
    if-eqz v12, :cond_45

    .line 1329
    .line 1330
    iget-object v0, v12, Lc9/s1;->a:Ljava/lang/String;

    .line 1331
    .line 1332
    goto :goto_30

    .line 1333
    :cond_45
    const/4 v0, 0x0

    .line 1334
    :goto_30
    if-nez v0, :cond_46

    .line 1335
    .line 1336
    goto :goto_32

    .line 1337
    :cond_46
    move-object v6, v0

    .line 1338
    :goto_31
    move-object/from16 v12, v28

    .line 1339
    .line 1340
    goto :goto_33

    .line 1341
    :cond_47
    :goto_32
    move-object/from16 v6, v30

    .line 1342
    .line 1343
    goto :goto_31

    .line 1344
    :goto_33
    invoke-virtual {v3, v12, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1345
    .line 1346
    .line 1347
    const-string v0, "hasTrunc"

    .line 1348
    .line 1349
    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 1350
    .line 1351
    .line 1352
    move-object/from16 v6, v32

    .line 1353
    .line 1354
    invoke-static {v10, v6, v14, v3}, Lc9/d2;->D(Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)Z

    .line 1355
    .line 1356
    .line 1357
    move-result v0

    .line 1358
    if-eqz v0, :cond_48

    .line 1359
    .line 1360
    iget-object v0, v8, Lc9/a;->a:Ljava/lang/String;

    .line 1361
    .line 1362
    move-object/from16 v8, v27

    .line 1363
    .line 1364
    invoke-virtual {v8, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 1365
    .line 1366
    .line 1367
    goto :goto_34

    .line 1368
    :cond_48
    move-object/from16 v8, v27

    .line 1369
    .line 1370
    :goto_34
    move-object/from16 v29, v4

    .line 1371
    .line 1372
    move-object v6, v8

    .line 1373
    move-object/from16 v30, v10

    .line 1374
    .line 1375
    move-object v14, v11

    .line 1376
    move-object/from16 v28, v12

    .line 1377
    .line 1378
    move-object v4, v13

    .line 1379
    move-object/from16 v3, v25

    .line 1380
    .line 1381
    move-object/from16 v10, v37

    .line 1382
    .line 1383
    move-object v13, v5

    .line 1384
    move-object v5, v15

    .line 1385
    move-object v15, v7

    .line 1386
    move-object/from16 v7, v26

    .line 1387
    .line 1388
    goto/16 :goto_11

    .line 1389
    .line 1390
    :cond_49
    move-object/from16 v10, v30

    .line 1391
    .line 1392
    move-object/from16 v30, v6

    .line 1393
    .line 1394
    move-object v6, v8

    .line 1395
    move-object/from16 v8, v27

    .line 1396
    .line 1397
    invoke-static/range {v31 .. v31}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 1398
    .line 1399
    .line 1400
    move-result v0

    .line 1401
    invoke-static {v0}, Ltf/y;->a0(I)I

    .line 1402
    .line 1403
    .line 1404
    move-result v0

    .line 1405
    const/16 v1, 0x10

    .line 1406
    .line 1407
    if-ge v0, v1, :cond_4a

    .line 1408
    .line 1409
    move v0, v1

    .line 1410
    :cond_4a
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 1411
    .line 1412
    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 1413
    .line 1414
    .line 1415
    invoke-interface/range {v31 .. v31}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1416
    .line 1417
    .line 1418
    move-result-object v0

    .line 1419
    :goto_35
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1420
    .line 1421
    .line 1422
    move-result v4

    .line 1423
    if-eqz v4, :cond_4b

    .line 1424
    .line 1425
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1426
    .line 1427
    .line 1428
    move-result-object v4

    .line 1429
    move-object v5, v4

    .line 1430
    check-cast v5, Lc9/a;

    .line 1431
    .line 1432
    iget-object v5, v5, Lc9/a;->a:Ljava/lang/String;

    .line 1433
    .line 1434
    invoke-interface {v1, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1435
    .line 1436
    .line 1437
    goto :goto_35

    .line 1438
    :cond_4b
    new-instance v4, Ljava/util/LinkedHashSet;

    .line 1439
    .line 1440
    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1441
    .line 1442
    .line 1443
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1444
    .line 1445
    .line 1446
    move-result-object v0

    .line 1447
    :cond_4c
    :goto_36
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1448
    .line 1449
    .line 1450
    move-result v5

    .line 1451
    if-eqz v5, :cond_50

    .line 1452
    .line 1453
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1454
    .line 1455
    .line 1456
    move-result-object v5

    .line 1457
    move-object v9, v5

    .line 1458
    check-cast v9, Ljava/lang/String;

    .line 1459
    .line 1460
    invoke-virtual {v1, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1461
    .line 1462
    .line 1463
    move-result-object v9

    .line 1464
    check-cast v9, Lc9/a;

    .line 1465
    .line 1466
    new-instance v13, Ljava/util/HashSet;

    .line 1467
    .line 1468
    invoke-direct {v13}, Ljava/util/HashSet;-><init>()V

    .line 1469
    .line 1470
    .line 1471
    :goto_37
    if-eqz v9, :cond_4f

    .line 1472
    .line 1473
    iget-object v14, v9, Lc9/a;->c:Ljava/lang/String;

    .line 1474
    .line 1475
    if-eqz v14, :cond_4f

    .line 1476
    .line 1477
    iget-object v9, v9, Lc9/a;->a:Ljava/lang/String;

    .line 1478
    .line 1479
    invoke-virtual {v13, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1480
    .line 1481
    .line 1482
    move-result v9

    .line 1483
    if-nez v9, :cond_4d

    .line 1484
    .line 1485
    :goto_38
    const/4 v9, 0x0

    .line 1486
    goto :goto_39

    .line 1487
    :cond_4d
    invoke-interface {v8, v14}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1488
    .line 1489
    .line 1490
    move-result v9

    .line 1491
    if-nez v9, :cond_4e

    .line 1492
    .line 1493
    goto :goto_38

    .line 1494
    :cond_4e
    invoke-virtual {v1, v14}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1495
    .line 1496
    .line 1497
    move-result-object v9

    .line 1498
    check-cast v9, Lc9/a;

    .line 1499
    .line 1500
    goto :goto_37

    .line 1501
    :cond_4f
    const/4 v9, 0x1

    .line 1502
    :goto_39
    if-eqz v9, :cond_4c

    .line 1503
    .line 1504
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1505
    .line 1506
    .line 1507
    goto :goto_36

    .line 1508
    :cond_50
    if-eqz v18, :cond_56

    .line 1509
    .line 1510
    new-instance v0, Luf/g;

    .line 1511
    .line 1512
    invoke-direct {v0}, Luf/g;-><init>()V

    .line 1513
    .line 1514
    .line 1515
    new-instance v1, Ljava/util/ArrayList;

    .line 1516
    .line 1517
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1518
    .line 1519
    .line 1520
    invoke-interface/range {v31 .. v31}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1521
    .line 1522
    .line 1523
    move-result-object v5

    .line 1524
    :cond_51
    :goto_3a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1525
    .line 1526
    .line 1527
    move-result v8

    .line 1528
    if-eqz v8, :cond_52

    .line 1529
    .line 1530
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1531
    .line 1532
    .line 1533
    move-result-object v8

    .line 1534
    move-object v9, v8

    .line 1535
    check-cast v9, Lc9/a;

    .line 1536
    .line 1537
    iget-object v9, v9, Lc9/a;->a:Ljava/lang/String;

    .line 1538
    .line 1539
    invoke-virtual {v4, v9}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 1540
    .line 1541
    .line 1542
    move-result v9

    .line 1543
    if-eqz v9, :cond_51

    .line 1544
    .line 1545
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1546
    .line 1547
    .line 1548
    goto :goto_3a

    .line 1549
    :cond_52
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1550
    .line 1551
    .line 1552
    move-result-object v1

    .line 1553
    :cond_53
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1554
    .line 1555
    .line 1556
    move-result v5

    .line 1557
    if-eqz v5, :cond_55

    .line 1558
    .line 1559
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1560
    .line 1561
    .line 1562
    move-result-object v5

    .line 1563
    check-cast v5, Lc9/a;

    .line 1564
    .line 1565
    iget-object v8, v5, Lc9/a;->e:Ljava/util/List;

    .line 1566
    .line 1567
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1568
    .line 1569
    .line 1570
    move-result-object v8

    .line 1571
    :cond_54
    :goto_3b
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1572
    .line 1573
    .line 1574
    move-result v9

    .line 1575
    if-eqz v9, :cond_53

    .line 1576
    .line 1577
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1578
    .line 1579
    .line 1580
    move-result-object v9

    .line 1581
    check-cast v9, Ljava/lang/String;

    .line 1582
    .line 1583
    invoke-static {v9}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1584
    .line 1585
    .line 1586
    move-result v13

    .line 1587
    if-nez v13, :cond_54

    .line 1588
    .line 1589
    iget-object v13, v5, Lc9/a;->a:Ljava/lang/String;

    .line 1590
    .line 1591
    invoke-virtual {v0, v9, v13}, Luf/g;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1592
    .line 1593
    .line 1594
    goto :goto_3b

    .line 1595
    :cond_55
    invoke-virtual {v0}, Luf/g;->c()Luf/g;

    .line 1596
    .line 1597
    .line 1598
    move-result-object v0

    .line 1599
    move-object v1, v0

    .line 1600
    :goto_3c
    move-object/from16 v5, p0

    .line 1601
    .line 1602
    move-object/from16 v8, v22

    .line 1603
    .line 1604
    goto :goto_3d

    .line 1605
    :cond_56
    move-object/from16 v1, v17

    .line 1606
    .line 1607
    goto :goto_3c

    .line 1608
    :goto_3d
    invoke-static {v5, v8}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 1609
    .line 1610
    .line 1611
    move-result-object v5

    .line 1612
    move-object/from16 v8, v20

    .line 1613
    .line 1614
    move-object/from16 v9, v23

    .line 1615
    .line 1616
    :try_start_3
    invoke-interface {v5, v8, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1617
    .line 1618
    .line 1619
    move-result-object v0

    .line 1620
    if-nez v0, :cond_57

    .line 1621
    .line 1622
    move-object/from16 v0, v30

    .line 1623
    .line 1624
    :cond_57
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1625
    .line 1626
    .line 1627
    move-result v13

    .line 1628
    if-eqz v13, :cond_58

    .line 1629
    .line 1630
    move-object v0, v9

    .line 1631
    :cond_58
    new-instance v13, Lorg/json/JSONObject;

    .line 1632
    .line 1633
    invoke-direct {v13, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 1634
    .line 1635
    .line 1636
    goto :goto_3e

    .line 1637
    :catchall_3
    move-exception v0

    .line 1638
    new-instance v13, Lsf/f;

    .line 1639
    .line 1640
    invoke-direct {v13, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1641
    .line 1642
    .line 1643
    :goto_3e
    new-instance v0, Lorg/json/JSONObject;

    .line 1644
    .line 1645
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 1646
    .line 1647
    .line 1648
    instance-of v14, v13, Lsf/f;

    .line 1649
    .line 1650
    if-eqz v14, :cond_59

    .line 1651
    .line 1652
    move-object v13, v0

    .line 1653
    :cond_59
    check-cast v13, Lorg/json/JSONObject;

    .line 1654
    .line 1655
    move-object/from16 v14, v19

    .line 1656
    .line 1657
    invoke-virtual {v13, v14}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 1658
    .line 1659
    .line 1660
    move-result-object v0

    .line 1661
    if-eqz v0, :cond_5c

    .line 1662
    .line 1663
    new-instance v13, Luf/g;

    .line 1664
    .line 1665
    invoke-direct {v13}, Luf/g;-><init>()V

    .line 1666
    .line 1667
    .line 1668
    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 1669
    .line 1670
    .line 1671
    move-result-object v15

    .line 1672
    :goto_3f
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 1673
    .line 1674
    .line 1675
    move-result v17

    .line 1676
    if-eqz v17, :cond_5b

    .line 1677
    .line 1678
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1679
    .line 1680
    .line 1681
    move-result-object v17

    .line 1682
    move-object/from16 p0, v15

    .line 1683
    .line 1684
    move-object/from16 v15, v17

    .line 1685
    .line 1686
    check-cast v15, Ljava/lang/String;

    .line 1687
    .line 1688
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1689
    .line 1690
    .line 1691
    invoke-static {v15}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1692
    .line 1693
    .line 1694
    move-result v17

    .line 1695
    move-object/from16 v18, v11

    .line 1696
    .line 1697
    if-nez v17, :cond_5a

    .line 1698
    .line 1699
    invoke-virtual {v0, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1700
    .line 1701
    .line 1702
    move-result-object v11

    .line 1703
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1704
    .line 1705
    .line 1706
    invoke-virtual {v13, v15, v11}, Luf/g;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1707
    .line 1708
    .line 1709
    :cond_5a
    move-object/from16 v15, p0

    .line 1710
    .line 1711
    move-object/from16 v11, v18

    .line 1712
    .line 1713
    goto :goto_3f

    .line 1714
    :cond_5b
    move-object/from16 v18, v11

    .line 1715
    .line 1716
    invoke-virtual {v13}, Luf/g;->c()Luf/g;

    .line 1717
    .line 1718
    .line 1719
    move-result-object v0

    .line 1720
    goto :goto_40

    .line 1721
    :cond_5c
    move-object/from16 v18, v11

    .line 1722
    .line 1723
    move-object/from16 v0, v17

    .line 1724
    .line 1725
    :goto_40
    new-instance v11, Ljava/util/LinkedHashMap;

    .line 1726
    .line 1727
    invoke-direct {v11, v0}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 1728
    .line 1729
    .line 1730
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 1731
    .line 1732
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 1733
    .line 1734
    .line 1735
    new-instance v13, Ljava/util/HashSet;

    .line 1736
    .line 1737
    invoke-direct {v13}, Ljava/util/HashSet;-><init>()V

    .line 1738
    .line 1739
    .line 1740
    const-string v15, "hchat_conv_group:%"

    .line 1741
    .line 1742
    move-object/from16 v17, v3

    .line 1743
    .line 1744
    const-string v3, "wxid_hchat_group_%"

    .line 1745
    .line 1746
    filled-new-array {v15, v3}, [Ljava/lang/String;

    .line 1747
    .line 1748
    .line 1749
    move-result-object v15

    .line 1750
    move-object/from16 p0, v3

    .line 1751
    .line 1752
    const-string v3, "SELECT username,parentRef FROM rconversation WHERE parentRef LIKE ? OR parentRef LIKE ?"

    .line 1753
    .line 1754
    invoke-virtual {v10, v3, v15}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->query(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    .line 1755
    .line 1756
    .line 1757
    move-result-object v3

    .line 1758
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1759
    .line 1760
    .line 1761
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1762
    .line 1763
    .line 1764
    move-result-object v3

    .line 1765
    :goto_41
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1766
    .line 1767
    .line 1768
    move-result v15

    .line 1769
    if-eqz v15, :cond_61

    .line 1770
    .line 1771
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1772
    .line 1773
    .line 1774
    move-result-object v15

    .line 1775
    check-cast v15, Ljava/util/Map;

    .line 1776
    .line 1777
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1778
    .line 1779
    .line 1780
    invoke-static {v2, v15}, Lc9/d2;->E(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 1781
    .line 1782
    .line 1783
    move-result-object v15

    .line 1784
    invoke-static {v15}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1785
    .line 1786
    .line 1787
    move-result v19

    .line 1788
    if-nez v19, :cond_5d

    .line 1789
    .line 1790
    invoke-static {v15}, Lc9/d2;->q(Ljava/lang/String;)Z

    .line 1791
    .line 1792
    .line 1793
    move-result v19

    .line 1794
    if-nez v19, :cond_5d

    .line 1795
    .line 1796
    invoke-interface {v1, v15}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1797
    .line 1798
    .line 1799
    move-result v19

    .line 1800
    if-eqz v19, :cond_5e

    .line 1801
    .line 1802
    :cond_5d
    move-object/from16 v20, v1

    .line 1803
    .line 1804
    move-object/from16 v22, v3

    .line 1805
    .line 1806
    goto :goto_44

    .line 1807
    :cond_5e
    invoke-virtual {v11, v15}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1808
    .line 1809
    .line 1810
    move-result-object v19

    .line 1811
    check-cast v19, Ljava/lang/String;

    .line 1812
    .line 1813
    move-object/from16 v20, v1

    .line 1814
    .line 1815
    if-nez v19, :cond_5f

    .line 1816
    .line 1817
    move-object/from16 v1, v30

    .line 1818
    .line 1819
    goto :goto_42

    .line 1820
    :cond_5f
    move-object/from16 v1, v19

    .line 1821
    .line 1822
    :goto_42
    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1823
    .line 1824
    .line 1825
    move-result-object v19

    .line 1826
    if-nez v19, :cond_60

    .line 1827
    .line 1828
    move-object/from16 v22, v3

    .line 1829
    .line 1830
    new-instance v3, Ljava/util/ArrayList;

    .line 1831
    .line 1832
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1833
    .line 1834
    .line 1835
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1836
    .line 1837
    .line 1838
    move-object/from16 v19, v3

    .line 1839
    .line 1840
    goto :goto_43

    .line 1841
    :cond_60
    move-object/from16 v22, v3

    .line 1842
    .line 1843
    :goto_43
    move-object/from16 v1, v19

    .line 1844
    .line 1845
    check-cast v1, Ljava/util/List;

    .line 1846
    .line 1847
    invoke-interface {v1, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1848
    .line 1849
    .line 1850
    invoke-virtual {v13, v15}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1851
    .line 1852
    .line 1853
    :goto_44
    move-object/from16 v1, v20

    .line 1854
    .line 1855
    move-object/from16 v3, v22

    .line 1856
    .line 1857
    goto :goto_41

    .line 1858
    :cond_61
    move-object/from16 v20, v1

    .line 1859
    .line 1860
    invoke-interface/range {v20 .. v20}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 1861
    .line 1862
    .line 1863
    move-result-object v1

    .line 1864
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1865
    .line 1866
    .line 1867
    move-result-object v1

    .line 1868
    :goto_45
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1869
    .line 1870
    .line 1871
    move-result v3

    .line 1872
    if-eqz v3, :cond_65

    .line 1873
    .line 1874
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1875
    .line 1876
    .line 1877
    move-result-object v3

    .line 1878
    check-cast v3, Ljava/util/Map$Entry;

    .line 1879
    .line 1880
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1881
    .line 1882
    .line 1883
    move-result-object v15

    .line 1884
    check-cast v15, Ljava/lang/String;

    .line 1885
    .line 1886
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1887
    .line 1888
    .line 1889
    move-result-object v3

    .line 1890
    check-cast v3, Ljava/lang/String;

    .line 1891
    .line 1892
    invoke-static {v3}, Lc9/d2;->F(Ljava/lang/String;)Ljava/lang/String;

    .line 1893
    .line 1894
    .line 1895
    move-result-object v3

    .line 1896
    move-object/from16 v19, v1

    .line 1897
    .line 1898
    const-string v1, "SELECT IFNULL(parentRef,\'\') AS parentRef FROM rconversation WHERE username=? LIMIT 1"

    .line 1899
    .line 1900
    move-object/from16 v20, v2

    .line 1901
    .line 1902
    filled-new-array {v15}, [Ljava/lang/String;

    .line 1903
    .line 1904
    .line 1905
    move-result-object v2

    .line 1906
    invoke-virtual {v10, v1, v2, v7}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->queryFirstString(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1907
    .line 1908
    .line 1909
    move-result-object v1

    .line 1910
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1911
    .line 1912
    .line 1913
    move-result v2

    .line 1914
    if-eqz v2, :cond_62

    .line 1915
    .line 1916
    move-object/from16 v22, v7

    .line 1917
    .line 1918
    goto :goto_46

    .line 1919
    :cond_62
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1920
    .line 1921
    .line 1922
    const-string v2, "hchat_conv_group:"

    .line 1923
    .line 1924
    move-object/from16 v22, v7

    .line 1925
    .line 1926
    const/4 v7, 0x0

    .line 1927
    invoke-static {v1, v2, v7}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1928
    .line 1929
    .line 1930
    move-result v2

    .line 1931
    if-nez v2, :cond_63

    .line 1932
    .line 1933
    invoke-static {v1}, Lc9/d2;->q(Ljava/lang/String;)Z

    .line 1934
    .line 1935
    .line 1936
    move-result v2

    .line 1937
    if-nez v2, :cond_63

    .line 1938
    .line 1939
    invoke-interface {v11, v15}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1940
    .line 1941
    .line 1942
    move-result v2

    .line 1943
    if-nez v2, :cond_63

    .line 1944
    .line 1945
    invoke-interface {v11, v15, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1946
    .line 1947
    .line 1948
    :cond_63
    invoke-virtual {v0, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1949
    .line 1950
    .line 1951
    move-result-object v1

    .line 1952
    if-nez v1, :cond_64

    .line 1953
    .line 1954
    new-instance v1, Ljava/util/ArrayList;

    .line 1955
    .line 1956
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1957
    .line 1958
    .line 1959
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1960
    .line 1961
    .line 1962
    :cond_64
    check-cast v1, Ljava/util/List;

    .line 1963
    .line 1964
    invoke-interface {v1, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1965
    .line 1966
    .line 1967
    :goto_46
    move-object/from16 v1, v19

    .line 1968
    .line 1969
    move-object/from16 v2, v20

    .line 1970
    .line 1971
    move-object/from16 v7, v22

    .line 1972
    .line 1973
    goto :goto_45

    .line 1974
    :cond_65
    move-object/from16 v20, v2

    .line 1975
    .line 1976
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 1977
    .line 1978
    .line 1979
    move-result-object v0

    .line 1980
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1981
    .line 1982
    .line 1983
    move-result-object v0

    .line 1984
    :cond_66
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1985
    .line 1986
    .line 1987
    move-result v1

    .line 1988
    const/16 v2, 0xc8

    .line 1989
    .line 1990
    if-eqz v1, :cond_6b

    .line 1991
    .line 1992
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1993
    .line 1994
    .line 1995
    move-result-object v1

    .line 1996
    check-cast v1, Ljava/util/Map$Entry;

    .line 1997
    .line 1998
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1999
    .line 2000
    .line 2001
    move-result-object v3

    .line 2002
    check-cast v3, Ljava/lang/String;

    .line 2003
    .line 2004
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 2005
    .line 2006
    .line 2007
    move-result-object v1

    .line 2008
    check-cast v1, Ljava/util/List;

    .line 2009
    .line 2010
    invoke-static {v1}, Ltf/m;->p1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 2011
    .line 2012
    .line 2013
    move-result-object v1

    .line 2014
    invoke-static {v2, v1}, Ltf/m;->n1(ILjava/util/List;)Ljava/util/ArrayList;

    .line 2015
    .line 2016
    .line 2017
    move-result-object v1

    .line 2018
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2019
    .line 2020
    .line 2021
    move-result-object v1

    .line 2022
    :goto_47
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2023
    .line 2024
    .line 2025
    move-result v2

    .line 2026
    if-eqz v2, :cond_66

    .line 2027
    .line 2028
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2029
    .line 2030
    .line 2031
    move-result-object v2

    .line 2032
    check-cast v2, Ljava/util/List;

    .line 2033
    .line 2034
    invoke-static {v10, v2, v3}, Lc9/d2;->C(Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;Ljava/util/List;Ljava/lang/String;)Z

    .line 2035
    .line 2036
    .line 2037
    move-result v7

    .line 2038
    if-eqz v7, :cond_69

    .line 2039
    .line 2040
    new-instance v7, Ljava/util/ArrayList;

    .line 2041
    .line 2042
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 2043
    .line 2044
    .line 2045
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2046
    .line 2047
    .line 2048
    move-result-object v2

    .line 2049
    :goto_48
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 2050
    .line 2051
    .line 2052
    move-result v15

    .line 2053
    if-eqz v15, :cond_68

    .line 2054
    .line 2055
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2056
    .line 2057
    .line 2058
    move-result-object v15

    .line 2059
    move-object/from16 v19, v0

    .line 2060
    .line 2061
    move-object v0, v15

    .line 2062
    check-cast v0, Ljava/lang/String;

    .line 2063
    .line 2064
    invoke-virtual {v13, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 2065
    .line 2066
    .line 2067
    move-result v0

    .line 2068
    if-eqz v0, :cond_67

    .line 2069
    .line 2070
    invoke-virtual {v7, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2071
    .line 2072
    .line 2073
    :cond_67
    move-object/from16 v0, v19

    .line 2074
    .line 2075
    goto :goto_48

    .line 2076
    :cond_68
    move-object/from16 v19, v0

    .line 2077
    .line 2078
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2079
    .line 2080
    .line 2081
    move-result-object v0

    .line 2082
    :goto_49
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2083
    .line 2084
    .line 2085
    move-result v2

    .line 2086
    if-eqz v2, :cond_6a

    .line 2087
    .line 2088
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2089
    .line 2090
    .line 2091
    move-result-object v2

    .line 2092
    check-cast v2, Ljava/lang/String;

    .line 2093
    .line 2094
    invoke-interface {v11, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2095
    .line 2096
    .line 2097
    invoke-virtual {v13, v2}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 2098
    .line 2099
    .line 2100
    goto :goto_49

    .line 2101
    :cond_69
    move-object/from16 v19, v0

    .line 2102
    .line 2103
    :cond_6a
    move-object/from16 v0, v19

    .line 2104
    .line 2105
    goto :goto_47

    .line 2106
    :cond_6b
    new-instance v0, Ljava/util/ArrayList;

    .line 2107
    .line 2108
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2109
    .line 2110
    .line 2111
    invoke-interface/range {v25 .. v25}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2112
    .line 2113
    .line 2114
    move-result-object v1

    .line 2115
    :cond_6c
    :goto_4a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2116
    .line 2117
    .line 2118
    move-result v3

    .line 2119
    if-eqz v3, :cond_6d

    .line 2120
    .line 2121
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2122
    .line 2123
    .line 2124
    move-result-object v3

    .line 2125
    move-object v7, v3

    .line 2126
    check-cast v7, Lsf/e;

    .line 2127
    .line 2128
    iget-object v7, v7, Lsf/e;->g:Ljava/lang/Object;

    .line 2129
    .line 2130
    check-cast v7, Lc9/a;

    .line 2131
    .line 2132
    iget-object v7, v7, Lc9/a;->a:Ljava/lang/String;

    .line 2133
    .line 2134
    invoke-virtual {v4, v7}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 2135
    .line 2136
    .line 2137
    move-result v7

    .line 2138
    if-eqz v7, :cond_6c

    .line 2139
    .line 2140
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2141
    .line 2142
    .line 2143
    goto :goto_4a

    .line 2144
    :cond_6d
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 2145
    .line 2146
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 2147
    .line 2148
    .line 2149
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2150
    .line 2151
    .line 2152
    move-result-object v0

    .line 2153
    :goto_4b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2154
    .line 2155
    .line 2156
    move-result v3

    .line 2157
    if-eqz v3, :cond_71

    .line 2158
    .line 2159
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2160
    .line 2161
    .line 2162
    move-result-object v3

    .line 2163
    move-object v7, v3

    .line 2164
    check-cast v7, Lsf/e;

    .line 2165
    .line 2166
    iget-object v7, v7, Lsf/e;->g:Ljava/lang/Object;

    .line 2167
    .line 2168
    check-cast v7, Lc9/a;

    .line 2169
    .line 2170
    iget-object v7, v7, Lc9/a;->c:Ljava/lang/String;

    .line 2171
    .line 2172
    if-eqz v7, :cond_6e

    .line 2173
    .line 2174
    invoke-static {v7}, Lc9/d2;->F(Ljava/lang/String;)Ljava/lang/String;

    .line 2175
    .line 2176
    .line 2177
    move-result-object v7

    .line 2178
    goto :goto_4c

    .line 2179
    :cond_6e
    const/4 v7, 0x0

    .line 2180
    :goto_4c
    if-nez v7, :cond_6f

    .line 2181
    .line 2182
    move-object/from16 v7, v30

    .line 2183
    .line 2184
    :cond_6f
    invoke-virtual {v1, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2185
    .line 2186
    .line 2187
    move-result-object v13

    .line 2188
    if-nez v13, :cond_70

    .line 2189
    .line 2190
    new-instance v13, Ljava/util/ArrayList;

    .line 2191
    .line 2192
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 2193
    .line 2194
    .line 2195
    invoke-interface {v1, v7, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2196
    .line 2197
    .line 2198
    :cond_70
    check-cast v13, Ljava/util/List;

    .line 2199
    .line 2200
    invoke-interface {v13, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2201
    .line 2202
    .line 2203
    goto :goto_4b

    .line 2204
    :cond_71
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 2205
    .line 2206
    .line 2207
    move-result-object v0

    .line 2208
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 2209
    .line 2210
    .line 2211
    move-result-object v0

    .line 2212
    :cond_72
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2213
    .line 2214
    .line 2215
    move-result v1

    .line 2216
    if-eqz v1, :cond_74

    .line 2217
    .line 2218
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2219
    .line 2220
    .line 2221
    move-result-object v1

    .line 2222
    check-cast v1, Ljava/util/Map$Entry;

    .line 2223
    .line 2224
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 2225
    .line 2226
    .line 2227
    move-result-object v3

    .line 2228
    check-cast v3, Ljava/lang/String;

    .line 2229
    .line 2230
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 2231
    .line 2232
    .line 2233
    move-result-object v1

    .line 2234
    check-cast v1, Ljava/util/List;

    .line 2235
    .line 2236
    new-instance v7, Ljava/util/ArrayList;

    .line 2237
    .line 2238
    invoke-static {v1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 2239
    .line 2240
    .line 2241
    move-result v13

    .line 2242
    invoke-direct {v7, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 2243
    .line 2244
    .line 2245
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2246
    .line 2247
    .line 2248
    move-result-object v1

    .line 2249
    :goto_4d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2250
    .line 2251
    .line 2252
    move-result v13

    .line 2253
    if-eqz v13, :cond_73

    .line 2254
    .line 2255
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2256
    .line 2257
    .line 2258
    move-result-object v13

    .line 2259
    check-cast v13, Lsf/e;

    .line 2260
    .line 2261
    iget-object v13, v13, Lsf/e;->g:Ljava/lang/Object;

    .line 2262
    .line 2263
    check-cast v13, Lc9/a;

    .line 2264
    .line 2265
    iget-object v13, v13, Lc9/a;->a:Ljava/lang/String;

    .line 2266
    .line 2267
    invoke-static {v13}, Lc9/d2;->F(Ljava/lang/String;)Ljava/lang/String;

    .line 2268
    .line 2269
    .line 2270
    move-result-object v13

    .line 2271
    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2272
    .line 2273
    .line 2274
    goto :goto_4d

    .line 2275
    :cond_73
    invoke-static {v2, v7}, Ltf/m;->n1(ILjava/util/List;)Ljava/util/ArrayList;

    .line 2276
    .line 2277
    .line 2278
    move-result-object v1

    .line 2279
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2280
    .line 2281
    .line 2282
    move-result-object v1

    .line 2283
    :goto_4e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2284
    .line 2285
    .line 2286
    move-result v7

    .line 2287
    if-eqz v7, :cond_72

    .line 2288
    .line 2289
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2290
    .line 2291
    .line 2292
    move-result-object v7

    .line 2293
    check-cast v7, Ljava/util/List;

    .line 2294
    .line 2295
    invoke-static {v10, v7, v3}, Lc9/d2;->C(Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;Ljava/util/List;Ljava/lang/String;)Z

    .line 2296
    .line 2297
    .line 2298
    goto :goto_4e

    .line 2299
    :cond_74
    new-instance v0, Ljava/util/ArrayList;

    .line 2300
    .line 2301
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2302
    .line 2303
    .line 2304
    invoke-interface/range {v25 .. v25}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2305
    .line 2306
    .line 2307
    move-result-object v1

    .line 2308
    :cond_75
    :goto_4f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2309
    .line 2310
    .line 2311
    move-result v3

    .line 2312
    if-eqz v3, :cond_76

    .line 2313
    .line 2314
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2315
    .line 2316
    .line 2317
    move-result-object v3

    .line 2318
    move-object v7, v3

    .line 2319
    check-cast v7, Lsf/e;

    .line 2320
    .line 2321
    iget-object v7, v7, Lsf/e;->g:Ljava/lang/Object;

    .line 2322
    .line 2323
    check-cast v7, Lc9/a;

    .line 2324
    .line 2325
    iget-object v7, v7, Lc9/a;->a:Ljava/lang/String;

    .line 2326
    .line 2327
    invoke-virtual {v4, v7}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 2328
    .line 2329
    .line 2330
    move-result v7

    .line 2331
    if-eqz v7, :cond_75

    .line 2332
    .line 2333
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2334
    .line 2335
    .line 2336
    goto :goto_4f

    .line 2337
    :cond_76
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2338
    .line 2339
    .line 2340
    move-result v1

    .line 2341
    if-eqz v1, :cond_78

    .line 2342
    .line 2343
    :cond_77
    move-object/from16 v23, v11

    .line 2344
    .line 2345
    goto/16 :goto_59

    .line 2346
    .line 2347
    :cond_78
    sget-object v1, Lc9/d2;->o:Ljava/lang/reflect/Method;

    .line 2348
    .line 2349
    if-eqz v1, :cond_77

    .line 2350
    .line 2351
    sget-object v3, Lc9/d2;->q:Ljava/lang/Object;

    .line 2352
    .line 2353
    if-eqz v3, :cond_7a

    .line 2354
    .line 2355
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2356
    .line 2357
    .line 2358
    move-result-object v7

    .line 2359
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2360
    .line 2361
    .line 2362
    invoke-virtual {v7, v3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 2363
    .line 2364
    .line 2365
    move-result v7

    .line 2366
    if-eqz v7, :cond_79

    .line 2367
    .line 2368
    goto :goto_50

    .line 2369
    :cond_79
    const/4 v3, 0x0

    .line 2370
    :goto_50
    if-eqz v3, :cond_7a

    .line 2371
    .line 2372
    goto :goto_51

    .line 2373
    :cond_7a
    invoke-virtual {v10, v1}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->storageObjectForMethod(Ljava/lang/reflect/Method;)Ljava/lang/Object;

    .line 2374
    .line 2375
    .line 2376
    move-result-object v3

    .line 2377
    if-eqz v3, :cond_77

    .line 2378
    .line 2379
    sput-object v3, Lc9/d2;->q:Ljava/lang/Object;

    .line 2380
    .line 2381
    :goto_51
    new-instance v7, Ljava/util/LinkedHashMap;

    .line 2382
    .line 2383
    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    .line 2384
    .line 2385
    .line 2386
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2387
    .line 2388
    .line 2389
    move-result-object v0

    .line 2390
    :goto_52
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2391
    .line 2392
    .line 2393
    move-result v13

    .line 2394
    if-eqz v13, :cond_7e

    .line 2395
    .line 2396
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2397
    .line 2398
    .line 2399
    move-result-object v13

    .line 2400
    move-object v15, v13

    .line 2401
    check-cast v15, Lsf/e;

    .line 2402
    .line 2403
    iget-object v15, v15, Lsf/e;->g:Ljava/lang/Object;

    .line 2404
    .line 2405
    check-cast v15, Lc9/a;

    .line 2406
    .line 2407
    iget-object v15, v15, Lc9/a;->c:Ljava/lang/String;

    .line 2408
    .line 2409
    if-eqz v15, :cond_7b

    .line 2410
    .line 2411
    invoke-static {v15}, Lc9/d2;->F(Ljava/lang/String;)Ljava/lang/String;

    .line 2412
    .line 2413
    .line 2414
    move-result-object v15

    .line 2415
    goto :goto_53

    .line 2416
    :cond_7b
    const/4 v15, 0x0

    .line 2417
    :goto_53
    if-nez v15, :cond_7c

    .line 2418
    .line 2419
    move-object/from16 v15, v30

    .line 2420
    .line 2421
    :cond_7c
    invoke-virtual {v7, v15}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2422
    .line 2423
    .line 2424
    move-result-object v19

    .line 2425
    if-nez v19, :cond_7d

    .line 2426
    .line 2427
    new-instance v2, Ljava/util/ArrayList;

    .line 2428
    .line 2429
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 2430
    .line 2431
    .line 2432
    invoke-interface {v7, v15, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2433
    .line 2434
    .line 2435
    move-object/from16 v19, v2

    .line 2436
    .line 2437
    :cond_7d
    move-object/from16 v2, v19

    .line 2438
    .line 2439
    check-cast v2, Ljava/util/List;

    .line 2440
    .line 2441
    invoke-interface {v2, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2442
    .line 2443
    .line 2444
    const/16 v2, 0xc8

    .line 2445
    .line 2446
    goto :goto_52

    .line 2447
    :cond_7e
    invoke-virtual {v7}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 2448
    .line 2449
    .line 2450
    move-result-object v0

    .line 2451
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 2452
    .line 2453
    .line 2454
    move-result-object v2

    .line 2455
    :cond_7f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 2456
    .line 2457
    .line 2458
    move-result v0

    .line 2459
    if-eqz v0, :cond_77

    .line 2460
    .line 2461
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2462
    .line 2463
    .line 2464
    move-result-object v0

    .line 2465
    check-cast v0, Ljava/util/Map$Entry;

    .line 2466
    .line 2467
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 2468
    .line 2469
    .line 2470
    move-result-object v7

    .line 2471
    check-cast v7, Ljava/lang/String;

    .line 2472
    .line 2473
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 2474
    .line 2475
    .line 2476
    move-result-object v0

    .line 2477
    check-cast v0, Ljava/util/List;

    .line 2478
    .line 2479
    new-instance v13, Ljava/util/ArrayList;

    .line 2480
    .line 2481
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 2482
    .line 2483
    .line 2484
    move-result v15

    .line 2485
    invoke-direct {v13, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 2486
    .line 2487
    .line 2488
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2489
    .line 2490
    .line 2491
    move-result-object v0

    .line 2492
    :goto_54
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2493
    .line 2494
    .line 2495
    move-result v15

    .line 2496
    if-eqz v15, :cond_80

    .line 2497
    .line 2498
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2499
    .line 2500
    .line 2501
    move-result-object v15

    .line 2502
    check-cast v15, Lsf/e;

    .line 2503
    .line 2504
    iget-object v15, v15, Lsf/e;->g:Ljava/lang/Object;

    .line 2505
    .line 2506
    check-cast v15, Lc9/a;

    .line 2507
    .line 2508
    iget-object v15, v15, Lc9/a;->a:Ljava/lang/String;

    .line 2509
    .line 2510
    invoke-static {v15}, Lc9/d2;->F(Ljava/lang/String;)Ljava/lang/String;

    .line 2511
    .line 2512
    .line 2513
    move-result-object v15

    .line 2514
    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2515
    .line 2516
    .line 2517
    goto :goto_54

    .line 2518
    :cond_80
    const/16 v15, 0xc8

    .line 2519
    .line 2520
    invoke-static {v15, v13}, Ltf/m;->n1(ILjava/util/List;)Ljava/util/ArrayList;

    .line 2521
    .line 2522
    .line 2523
    move-result-object v0

    .line 2524
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2525
    .line 2526
    .line 2527
    move-result-object v13

    .line 2528
    :goto_55
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 2529
    .line 2530
    .line 2531
    move-result v0

    .line 2532
    if-eqz v0, :cond_7f

    .line 2533
    .line 2534
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2535
    .line 2536
    .line 2537
    move-result-object v0

    .line 2538
    move-object v15, v0

    .line 2539
    check-cast v15, Ljava/util/List;

    .line 2540
    .line 2541
    move-object/from16 v19, v2

    .line 2542
    .line 2543
    const/4 v2, 0x0

    .line 2544
    :try_start_4
    new-array v0, v2, [Ljava/lang/String;

    .line 2545
    .line 2546
    invoke-interface {v15, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 2547
    .line 2548
    .line 2549
    move-result-object v0

    .line 2550
    check-cast v0, [Ljava/lang/String;

    .line 2551
    .line 2552
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2553
    .line 2554
    .line 2555
    move-result-object v2

    .line 2556
    array-length v2, v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 2557
    move-object/from16 v23, v11

    .line 2558
    .line 2559
    const/4 v11, 0x2

    .line 2560
    if-ne v2, v11, :cond_81

    .line 2561
    .line 2562
    :try_start_5
    filled-new-array {v0, v7}, [Ljava/lang/Object;

    .line 2563
    .line 2564
    .line 2565
    move-result-object v0

    .line 2566
    invoke-static {v1, v3, v0}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2567
    .line 2568
    .line 2569
    move-result-object v0

    .line 2570
    goto :goto_57

    .line 2571
    :catchall_4
    move-exception v0

    .line 2572
    goto :goto_56

    .line 2573
    :cond_81
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2574
    .line 2575
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2576
    .line 2577
    .line 2578
    move-result v11

    .line 2579
    const/16 v24, 0x1

    .line 2580
    .line 2581
    xor-int/lit8 v11, v11, 0x1

    .line 2582
    .line 2583
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2584
    .line 2585
    .line 2586
    move-result-object v11

    .line 2587
    filled-new-array {v0, v7, v2, v11}, [Ljava/lang/Object;

    .line 2588
    .line 2589
    .line 2590
    move-result-object v0

    .line 2591
    invoke-static {v1, v3, v0}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2592
    .line 2593
    .line 2594
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 2595
    goto :goto_57

    .line 2596
    :catchall_5
    move-exception v0

    .line 2597
    move-object/from16 v23, v11

    .line 2598
    .line 2599
    :goto_56
    new-instance v2, Lsf/f;

    .line 2600
    .line 2601
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 2602
    .line 2603
    .line 2604
    move-object v0, v2

    .line 2605
    :goto_57
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 2606
    .line 2607
    .line 2608
    move-result-object v0

    .line 2609
    if-eqz v0, :cond_82

    .line 2610
    .line 2611
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 2612
    .line 2613
    .line 2614
    move-result v2

    .line 2615
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2616
    .line 2617
    .line 2618
    move-result-object v11

    .line 2619
    new-instance v15, Ljava/lang/StringBuilder;

    .line 2620
    .line 2621
    move-object/from16 v26, v1

    .line 2622
    .line 2623
    const-string v1, "[Hchat:ConversationGroup] \u901a\u77e5\u865a\u62df\u5206\u7ec4\u4f1a\u8bdd\u5237\u65b0\u5931\u8d25: count="

    .line 2624
    .line 2625
    invoke-direct {v15, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2626
    .line 2627
    .line 2628
    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2629
    .line 2630
    .line 2631
    const-string v1, " parent="

    .line 2632
    .line 2633
    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2634
    .line 2635
    .line 2636
    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2637
    .line 2638
    .line 2639
    const-string v1, " "

    .line 2640
    .line 2641
    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2642
    .line 2643
    .line 2644
    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2645
    .line 2646
    .line 2647
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2648
    .line 2649
    .line 2650
    move-result-object v1

    .line 2651
    invoke-static {v1, v0}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2652
    .line 2653
    .line 2654
    goto :goto_58

    .line 2655
    :cond_82
    move-object/from16 v26, v1

    .line 2656
    .line 2657
    :goto_58
    move-object/from16 v2, v19

    .line 2658
    .line 2659
    move-object/from16 v11, v23

    .line 2660
    .line 2661
    move-object/from16 v1, v26

    .line 2662
    .line 2663
    const/16 v15, 0xc8

    .line 2664
    .line 2665
    goto/16 :goto_55

    .line 2666
    .line 2667
    :goto_59
    :try_start_6
    invoke-interface {v5, v8, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2668
    .line 2669
    .line 2670
    move-result-object v0

    .line 2671
    if-nez v0, :cond_83

    .line 2672
    .line 2673
    move-object/from16 v0, v30

    .line 2674
    .line 2675
    :cond_83
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2676
    .line 2677
    .line 2678
    move-result v1

    .line 2679
    if-eqz v1, :cond_84

    .line 2680
    .line 2681
    move-object v0, v9

    .line 2682
    :cond_84
    new-instance v1, Lorg/json/JSONObject;

    .line 2683
    .line 2684
    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 2685
    .line 2686
    .line 2687
    goto :goto_5a

    .line 2688
    :catchall_6
    move-exception v0

    .line 2689
    new-instance v1, Lsf/f;

    .line 2690
    .line 2691
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 2692
    .line 2693
    .line 2694
    :goto_5a
    new-instance v0, Lorg/json/JSONObject;

    .line 2695
    .line 2696
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 2697
    .line 2698
    .line 2699
    instance-of v2, v1, Lsf/f;

    .line 2700
    .line 2701
    if-eqz v2, :cond_85

    .line 2702
    .line 2703
    move-object v1, v0

    .line 2704
    :cond_85
    check-cast v1, Lorg/json/JSONObject;

    .line 2705
    .line 2706
    invoke-interface/range {v23 .. v23}, Ljava/util/Map;->isEmpty()Z

    .line 2707
    .line 2708
    .line 2709
    move-result v0

    .line 2710
    if-eqz v0, :cond_86

    .line 2711
    .line 2712
    invoke-virtual {v1, v14}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 2713
    .line 2714
    .line 2715
    goto :goto_5c

    .line 2716
    :cond_86
    new-instance v0, Lorg/json/JSONObject;

    .line 2717
    .line 2718
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 2719
    .line 2720
    .line 2721
    invoke-virtual/range {v23 .. v23}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 2722
    .line 2723
    .line 2724
    move-result-object v2

    .line 2725
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 2726
    .line 2727
    .line 2728
    move-result-object v2

    .line 2729
    :goto_5b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 2730
    .line 2731
    .line 2732
    move-result v3

    .line 2733
    if-eqz v3, :cond_87

    .line 2734
    .line 2735
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2736
    .line 2737
    .line 2738
    move-result-object v3

    .line 2739
    check-cast v3, Ljava/util/Map$Entry;

    .line 2740
    .line 2741
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 2742
    .line 2743
    .line 2744
    move-result-object v7

    .line 2745
    check-cast v7, Ljava/lang/String;

    .line 2746
    .line 2747
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 2748
    .line 2749
    .line 2750
    move-result-object v3

    .line 2751
    check-cast v3, Ljava/lang/String;

    .line 2752
    .line 2753
    invoke-virtual {v0, v7, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2754
    .line 2755
    .line 2756
    goto :goto_5b

    .line 2757
    :cond_87
    invoke-virtual {v1, v14, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2758
    .line 2759
    .line 2760
    :goto_5c
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 2761
    .line 2762
    .line 2763
    move-result-object v0

    .line 2764
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2765
    .line 2766
    .line 2767
    invoke-interface {v5, v8, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2768
    .line 2769
    .line 2770
    move-result-object v1

    .line 2771
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2772
    .line 2773
    .line 2774
    move-result v1

    .line 2775
    if-eqz v1, :cond_88

    .line 2776
    .line 2777
    goto :goto_5d

    .line 2778
    :cond_88
    invoke-interface {v5}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 2779
    .line 2780
    .line 2781
    move-result-object v1

    .line 2782
    invoke-interface {v1, v8, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 2783
    .line 2784
    .line 2785
    move-result-object v0

    .line 2786
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 2787
    .line 2788
    .line 2789
    move-result v0

    .line 2790
    if-nez v0, :cond_89

    .line 2791
    .line 2792
    const-string v0, "[Hchat:ConversationGroup] \u4fdd\u5b58\u539f\u59cb parentRef \u5931\u8d25: account="

    .line 2793
    .line 2794
    invoke-virtual {v0, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 2795
    .line 2796
    .line 2797
    move-result-object v0

    .line 2798
    invoke-static {v0}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 2799
    .line 2800
    .line 2801
    :cond_89
    :goto_5d
    new-instance v0, Ljava/util/ArrayList;

    .line 2802
    .line 2803
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2804
    .line 2805
    .line 2806
    invoke-interface/range {v25 .. v25}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2807
    .line 2808
    .line 2809
    move-result-object v1

    .line 2810
    :cond_8a
    :goto_5e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2811
    .line 2812
    .line 2813
    move-result v2

    .line 2814
    if-eqz v2, :cond_8b

    .line 2815
    .line 2816
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2817
    .line 2818
    .line 2819
    move-result-object v2

    .line 2820
    move-object v3, v2

    .line 2821
    check-cast v3, Lsf/e;

    .line 2822
    .line 2823
    iget-object v3, v3, Lsf/e;->g:Ljava/lang/Object;

    .line 2824
    .line 2825
    check-cast v3, Lc9/a;

    .line 2826
    .line 2827
    iget-object v3, v3, Lc9/a;->a:Ljava/lang/String;

    .line 2828
    .line 2829
    invoke-virtual {v4, v3}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 2830
    .line 2831
    .line 2832
    move-result v3

    .line 2833
    if-eqz v3, :cond_8a

    .line 2834
    .line 2835
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2836
    .line 2837
    .line 2838
    goto :goto_5e

    .line 2839
    :cond_8b
    new-instance v1, Ljava/util/ArrayList;

    .line 2840
    .line 2841
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 2842
    .line 2843
    .line 2844
    move-result v2

    .line 2845
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 2846
    .line 2847
    .line 2848
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2849
    .line 2850
    .line 2851
    move-result-object v0

    .line 2852
    :goto_5f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2853
    .line 2854
    .line 2855
    move-result v2

    .line 2856
    if-eqz v2, :cond_8c

    .line 2857
    .line 2858
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2859
    .line 2860
    .line 2861
    move-result-object v2

    .line 2862
    check-cast v2, Lsf/e;

    .line 2863
    .line 2864
    iget-object v2, v2, Lsf/e;->g:Ljava/lang/Object;

    .line 2865
    .line 2866
    check-cast v2, Lc9/a;

    .line 2867
    .line 2868
    iget-object v2, v2, Lc9/a;->a:Ljava/lang/String;

    .line 2869
    .line 2870
    invoke-static {v2}, Lc9/d2;->F(Ljava/lang/String;)Ljava/lang/String;

    .line 2871
    .line 2872
    .line 2873
    move-result-object v2

    .line 2874
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2875
    .line 2876
    .line 2877
    goto :goto_5f

    .line 2878
    :cond_8c
    invoke-static {v1}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 2879
    .line 2880
    .line 2881
    move-result-object v0

    .line 2882
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 2883
    .line 2884
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 2885
    .line 2886
    .line 2887
    move-object/from16 v2, v17

    .line 2888
    .line 2889
    filled-new-array {v6, v12, v2}, [Ljava/lang/String;

    .line 2890
    .line 2891
    .line 2892
    move-result-object v3

    .line 2893
    invoke-static {v3}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 2894
    .line 2895
    .line 2896
    move-result-object v3

    .line 2897
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2898
    .line 2899
    .line 2900
    move-result-object v3

    .line 2901
    :cond_8d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 2902
    .line 2903
    .line 2904
    move-result v4

    .line 2905
    if-eqz v4, :cond_90

    .line 2906
    .line 2907
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2908
    .line 2909
    .line 2910
    move-result-object v4

    .line 2911
    check-cast v4, Ljava/lang/String;

    .line 2912
    .line 2913
    const-string v5, "SELECT username FROM "

    .line 2914
    .line 2915
    const-string v7, " WHERE username LIKE ?"

    .line 2916
    .line 2917
    invoke-static {v5, v4, v7}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2918
    .line 2919
    .line 2920
    move-result-object v4

    .line 2921
    filled-new-array/range {p0 .. p0}, [Ljava/lang/String;

    .line 2922
    .line 2923
    .line 2924
    move-result-object v5

    .line 2925
    invoke-virtual {v10, v4, v5}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->query(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    .line 2926
    .line 2927
    .line 2928
    move-result-object v4

    .line 2929
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2930
    .line 2931
    .line 2932
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2933
    .line 2934
    .line 2935
    move-result-object v4

    .line 2936
    :goto_60
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 2937
    .line 2938
    .line 2939
    move-result v5

    .line 2940
    if-eqz v5, :cond_8d

    .line 2941
    .line 2942
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2943
    .line 2944
    .line 2945
    move-result-object v5

    .line 2946
    check-cast v5, Ljava/util/Map;

    .line 2947
    .line 2948
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2949
    .line 2950
    .line 2951
    move-object/from16 v7, v20

    .line 2952
    .line 2953
    invoke-static {v7, v5}, Lc9/d2;->E(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 2954
    .line 2955
    .line 2956
    move-result-object v5

    .line 2957
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2958
    .line 2959
    .line 2960
    move-result v8

    .line 2961
    if-nez v8, :cond_8e

    .line 2962
    .line 2963
    goto :goto_61

    .line 2964
    :cond_8e
    const/4 v5, 0x0

    .line 2965
    :goto_61
    if-eqz v5, :cond_8f

    .line 2966
    .line 2967
    invoke-virtual {v1, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 2968
    .line 2969
    .line 2970
    :cond_8f
    move-object/from16 v20, v7

    .line 2971
    .line 2972
    goto :goto_60

    .line 2973
    :cond_90
    check-cast v0, Ljava/lang/Iterable;

    .line 2974
    .line 2975
    invoke-static {v1, v0}, Ltf/d0;->T(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 2976
    .line 2977
    .line 2978
    move-result-object v0

    .line 2979
    check-cast v0, Ljava/lang/Iterable;

    .line 2980
    .line 2981
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2982
    .line 2983
    .line 2984
    move-result-object v1

    .line 2985
    :goto_62
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2986
    .line 2987
    .line 2988
    move-result v0

    .line 2989
    if-eqz v0, :cond_95

    .line 2990
    .line 2991
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2992
    .line 2993
    .line 2994
    move-result-object v0

    .line 2995
    move-object v3, v0

    .line 2996
    check-cast v3, Ljava/lang/String;

    .line 2997
    .line 2998
    :try_start_7
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->conversations()Lh8/a;

    .line 2999
    .line 3000
    .line 3001
    move-result-object v0

    .line 3002
    if-eqz v0, :cond_91

    .line 3003
    .line 3004
    invoke-virtual {v0, v3}, Lh8/a;->a(Ljava/lang/String;)Z

    .line 3005
    .line 3006
    .line 3007
    move-result v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 3008
    const/4 v4, 0x1

    .line 3009
    if-ne v0, v4, :cond_92

    .line 3010
    .line 3011
    move v0, v4

    .line 3012
    goto :goto_63

    .line 3013
    :catchall_7
    move-exception v0

    .line 3014
    const/4 v4, 0x1

    .line 3015
    goto :goto_64

    .line 3016
    :cond_91
    const/4 v4, 0x1

    .line 3017
    :cond_92
    const/4 v0, 0x0

    .line 3018
    :goto_63
    :try_start_8
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 3019
    .line 3020
    .line 3021
    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 3022
    goto :goto_65

    .line 3023
    :catchall_8
    move-exception v0

    .line 3024
    :goto_64
    new-instance v5, Lsf/f;

    .line 3025
    .line 3026
    invoke-direct {v5, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 3027
    .line 3028
    .line 3029
    move-object v0, v5

    .line 3030
    :goto_65
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 3031
    .line 3032
    instance-of v7, v0, Lsf/f;

    .line 3033
    .line 3034
    if-eqz v7, :cond_93

    .line 3035
    .line 3036
    move-object v0, v5

    .line 3037
    :cond_93
    check-cast v0, Ljava/lang/Boolean;

    .line 3038
    .line 3039
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 3040
    .line 3041
    .line 3042
    move-result v0

    .line 3043
    if-nez v0, :cond_94

    .line 3044
    .line 3045
    filled-new-array {v3}, [Ljava/lang/String;

    .line 3046
    .line 3047
    .line 3048
    move-result-object v0

    .line 3049
    move-object/from16 v5, v18

    .line 3050
    .line 3051
    invoke-virtual {v10, v6, v5, v0}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 3052
    .line 3053
    .line 3054
    goto :goto_66

    .line 3055
    :cond_94
    move-object/from16 v5, v18

    .line 3056
    .line 3057
    :goto_66
    filled-new-array {v3}, [Ljava/lang/String;

    .line 3058
    .line 3059
    .line 3060
    move-result-object v0

    .line 3061
    invoke-virtual {v10, v12, v5, v0}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 3062
    .line 3063
    .line 3064
    filled-new-array {v3}, [Ljava/lang/String;

    .line 3065
    .line 3066
    .line 3067
    move-result-object v0

    .line 3068
    invoke-virtual {v10, v2, v5, v0}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 3069
    .line 3070
    .line 3071
    move-object/from16 v18, v5

    .line 3072
    .line 3073
    goto :goto_62

    .line 3074
    :cond_95
    :goto_67
    return-void
.end method


# virtual methods
.method public final r(Lr8/g;Ljava/lang/String;Lch/e;Lfg/l;)Ljava/lang/reflect/Method;
    .locals 5

    .line 1
    iget-object v0, p1, Lr8/g;->a:Landroid/content/Context;

    .line 2
    .line 3
    const-string v1, "Hchat_conversation_group_method_cache"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 10
    .line 11
    iget-object v2, p1, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v2}, Lo8/k;->a(Landroid/content/Context;Ljava/lang/ClassLoader;)Ll8/i;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget-object v1, v1, Ll8/i;->h:Ljava/lang/String;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    :try_start_0
    iget-object v3, p1, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 24
    .line 25
    invoke-virtual {v3, p3}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    invoke-static {p3}, Ltf/m;->m1(Ljava/lang/Iterable;)Ldg/n;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    new-instance v3, Lc9/o1;

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    invoke-direct {v3, p0, p1, v4}, Lc9/o1;-><init>(Ljava/lang/Object;Lr8/g;I)V

    .line 37
    .line 38
    .line 39
    invoke-static {p3, v3}, Lng/m;->X(Lng/j;Lfg/l;)Lng/i;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    new-instance p3, Lng/h;

    .line 44
    .line 45
    invoke-direct {p3, p1}, Lng/h;-><init>(Lng/i;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    invoke-virtual {p3}, Lng/h;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_1

    .line 53
    .line 54
    invoke-virtual {p3}, Lng/h;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-interface {p4, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    check-cast v3, Ljava/lang/Boolean;

    .line 63
    .line 64
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_0

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :catchall_0
    move-exception p1

    .line 72
    goto :goto_1

    .line 73
    :cond_1
    move-object p1, v2

    .line 74
    :goto_0
    check-cast p1, Ljava/lang/reflect/Method;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :goto_1
    new-instance p3, Lsf/f;

    .line 78
    .line 79
    invoke-direct {p3, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    move-object p1, p3

    .line 83
    :goto_2
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 84
    .line 85
    .line 86
    move-result-object p3

    .line 87
    if-eqz p3, :cond_2

    .line 88
    .line 89
    invoke-virtual {p3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p4

    .line 93
    const-string v3, "[Hchat:ConversationGroup] \u5b9a\u4f4d\u5fae\u4fe1\u4f1a\u8bdd\u5165\u53e3\u5931\u8d25 key="

    .line 94
    .line 95
    const-string v4, ": "

    .line 96
    .line 97
    invoke-static {v3, p2, v4, p4, p3}, Leh/a;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 98
    .line 99
    .line 100
    :cond_2
    instance-of p3, p1, Lsf/f;

    .line 101
    .line 102
    if-eqz p3, :cond_3

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_3
    move-object v2, p1

    .line 106
    :goto_3
    check-cast v2, Ljava/lang/reflect/Method;

    .line 107
    .line 108
    if-eqz v2, :cond_4

    .line 109
    .line 110
    invoke-static {v0, v1, p2, v2}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 111
    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_4
    const-string p1, "cache.key"

    .line 115
    .line 116
    :try_start_1
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 117
    .line 118
    .line 119
    move-result-object p3

    .line 120
    const-string p4, ""

    .line 121
    .line 122
    invoke-interface {v0, p1, p4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p4

    .line 126
    invoke-static {p4, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result p4

    .line 130
    if-nez p4, :cond_5

    .line 131
    .line 132
    invoke-interface {p3}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 133
    .line 134
    .line 135
    move-result-object p4

    .line 136
    invoke-interface {p4, p1, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 137
    .line 138
    .line 139
    :cond_5
    invoke-interface {p3, p2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 144
    .line 145
    .line 146
    :catchall_1
    :goto_4
    return-object v2
.end method
