.class public final Lfb/g1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lfb/g1;

.field public static final b:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final c:Ljava/util/HashMap;

.field public static final d:Ljava/lang/Object;

.field public static final e:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final f:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final g:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public static final h:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public static final i:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lfb/g1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lfb/g1;->a:Lfb/g1;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lfb/g1;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    new-instance v0, Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lfb/g1;->c:Ljava/util/HashMap;

    .line 21
    .line 22
    new-instance v0, Ljava/lang/Object;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lfb/g1;->d:Ljava/lang/Object;

    .line 28
    .line 29
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lfb/g1;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 35
    .line 36
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 39
    .line 40
    .line 41
    sput-object v0, Lfb/g1;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 42
    .line 43
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Lfb/g1;->g:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 48
    .line 49
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sput-object v0, Lfb/g1;->h:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 54
    .line 55
    new-instance v0, Lc9/q;

    .line 56
    .line 57
    const/16 v1, 0x9

    .line 58
    .line 59
    invoke-direct {v0, v1}, Lc9/q;-><init>(I)V

    .line 60
    .line 61
    .line 62
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    sput-object v0, Lfb/g1;->i:Ljava/util/concurrent/ExecutorService;

    .line 67
    .line 68
    return-void
.end method

.method public static a(Landroid/content/Context;)Ljava/io/File;
    .locals 2

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-static {p0}, Lfb/g1;->p(Landroid/content/Context;)Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v1, "attachments"

    .line 12
    .line 13
    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public static b(Landroid/content/Context;Ljava/util/List;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-static {p0}, Lfb/g1;->a(Landroid/content/Context;)Ljava/io/File;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 9
    .line 10
    .line 11
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    new-instance v1, Lsf/f;

    .line 15
    .line 16
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    move-object v0, v1

    .line 20
    :goto_0
    nop

    .line 21
    instance-of v1, v0, Lsf/f;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    :cond_0
    check-cast v0, Ljava/io/File;

    .line 27
    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    new-instance v1, Ldg/n;

    .line 31
    .line 32
    const/4 v2, 0x6

    .line 33
    invoke-direct {v1, p1, v2}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 34
    .line 35
    .line 36
    new-instance p1, Lfb/f1;

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    invoke-direct {p1, p0, v2}, Lfb/f1;-><init>(Landroid/content/Context;I)V

    .line 40
    .line 41
    .line 42
    invoke-static {v1, p1}, Lng/m;->X(Lng/j;Lfg/l;)Lng/i;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    new-instance p1, Lfb/g0;

    .line 47
    .line 48
    const/16 v1, 0xe

    .line 49
    .line 50
    invoke-direct {p1, v1}, Lfb/g0;-><init>(I)V

    .line 51
    .line 52
    .line 53
    new-instance v1, Lng/b;

    .line 54
    .line 55
    invoke-interface {p0}, Lng/j;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-direct {v1, p0, p1}, Lng/b;-><init>(Ljava/util/Iterator;Lfg/l;)V

    .line 60
    .line 61
    .line 62
    :cond_1
    :goto_1
    invoke-virtual {v1}, Ltf/b;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-eqz p0, :cond_3

    .line 67
    .line 68
    invoke-virtual {v1}, Ltf/b;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    check-cast p0, Ljava/io/File;

    .line 73
    .line 74
    :try_start_1
    invoke-virtual {p0}, Ljava/io/File;->delete()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 75
    .line 76
    .line 77
    :catchall_1
    invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    :goto_2
    if-eqz p0, :cond_1

    .line 82
    .line 83
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-nez p1, :cond_1

    .line 88
    .line 89
    invoke-virtual {p0}, Ljava/io/File;->list()[Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    if-eqz p1, :cond_1

    .line 94
    .line 95
    array-length p1, p1

    .line 96
    if-nez p1, :cond_1

    .line 97
    .line 98
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-nez p1, :cond_2

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_2
    invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    goto :goto_2

    .line 110
    :cond_3
    return-void
.end method

.method public static d(Lorg/json/JSONObject;)Lfb/y;
    .locals 7

    .line 1
    new-instance v0, Lfb/y;

    .line 2
    .line 3
    const-string v1, "pluginName"

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v3, "pluginId"

    .line 12
    .line 13
    invoke-static {v1, v3, v2, p0}, Lj8/b;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    const-string v4, "infoProp"

    .line 18
    .line 19
    invoke-virtual {p0, v4, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    const-string v5, "mainJava"

    .line 24
    .line 25
    invoke-static {v4, v5, v2, p0}, Lj8/b;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    const-string v6, "summary"

    .line 30
    .line 31
    invoke-virtual {p0, v6, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-object v2, v3

    .line 39
    move-object v3, v4

    .line 40
    move-object v4, v5

    .line 41
    move-object v5, p0

    .line 42
    invoke-direct/range {v0 .. v5}, Lfb/y;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-object v0
.end method

.method public static e(Landroid/content/Context;Ljava/lang/String;)V
    .locals 6

    .line 1
    const-string v0, ".json"

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Lfb/g1;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    sget-object v2, Lfb/g1;->h:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    sget-object v2, Lfb/g1;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 22
    .line 23
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    sget-object v2, Lfb/g1;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 27
    .line 28
    new-instance v3, Lfb/g0;

    .line 29
    .line 30
    const/16 v4, 0xd

    .line 31
    .line 32
    invoke-direct {v3, v4}, Lfb/g0;-><init>(I)V

    .line 33
    .line 34
    .line 35
    new-instance v4, Lbc/j;

    .line 36
    .line 37
    const/16 v5, 0x8

    .line 38
    .line 39
    invoke-direct {v4, v3, v5}, Lbc/j;-><init>(Ljava/lang/Object;I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, v1, v4}, Ljava/util/concurrent/ConcurrentHashMap;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    monitor-enter v2

    .line 50
    :try_start_0
    new-instance v3, Ljava/io/File;

    .line 51
    .line 52
    invoke-static {p0}, Lfb/g1;->p(Landroid/content/Context;)Ljava/io/File;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-direct {v3, v4, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/io/File;->delete()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    .line 65
    .line 66
    monitor-exit v2

    .line 67
    new-instance v0, Ljava/io/File;

    .line 68
    .line 69
    sget-object v1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 70
    .line 71
    invoke-virtual {v1, p0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->scriptDir(Landroid/content/Context;)Ljava/io/File;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    const-string v1, "Agent/tool-results"

    .line 80
    .line 81
    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 85
    .line 86
    .line 87
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    if-eqz p0, :cond_0

    .line 92
    .line 93
    const-string p1, "session"

    .line 94
    .line 95
    :cond_0
    const-string p0, "[^A-Za-z0-9_-]"

    .line 96
    .line 97
    invoke-static {p0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    const-string v1, "_"

    .line 105
    .line 106
    invoke-virtual {p0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-virtual {p0, v1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    const/16 p1, 0x60

    .line 118
    .line 119
    invoke-static {p1, p0}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    if-eqz p1, :cond_1

    .line 128
    .line 129
    const-string p0, "item"

    .line 130
    .line 131
    :cond_1
    new-instance p1, Ljava/io/File;

    .line 132
    .line 133
    invoke-direct {p1, v0, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-static {p1}, Ldg/l;->b0(Ljava/io/File;)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :catchall_0
    move-exception p0

    .line 141
    monitor-exit v2

    .line 142
    throw p0
.end method

.method public static f(Lfb/d1;)Lorg/json/JSONObject;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lorg/json/JSONObject;

    .line 4
    .line 5
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v2, v0, Lfb/d1;->a:Ljava/lang/String;

    .line 9
    .line 10
    const-string v3, "id"

    .line 11
    .line 12
    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 13
    .line 14
    .line 15
    const-string v2, "title"

    .line 16
    .line 17
    iget-object v4, v0, Lfb/d1;->b:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v1, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 20
    .line 21
    .line 22
    iget-wide v4, v0, Lfb/d1;->c:J

    .line 23
    .line 24
    const-string v2, "createdAt"

    .line 25
    .line 26
    invoke-virtual {v1, v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 27
    .line 28
    .line 29
    iget-wide v4, v0, Lfb/d1;->d:J

    .line 30
    .line 31
    const-string v6, "updatedAt"

    .line 32
    .line 33
    invoke-virtual {v1, v6, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 34
    .line 35
    .line 36
    const-string v4, "targetPluginId"

    .line 37
    .line 38
    iget-object v5, v0, Lfb/d1;->g:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 41
    .line 42
    .line 43
    const-string v4, "conversationSummary"

    .line 44
    .line 45
    iget-object v5, v0, Lfb/d1;->h:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 48
    .line 49
    .line 50
    const-string v4, "nativeToolHistory"

    .line 51
    .line 52
    iget-object v5, v0, Lfb/d1;->i:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 55
    .line 56
    .line 57
    const-string v4, "protocolTranscript"

    .line 58
    .line 59
    iget-object v5, v0, Lfb/d1;->j:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 62
    .line 63
    .line 64
    const-string v4, "compactedMessageCount"

    .line 65
    .line 66
    iget v5, v0, Lfb/d1;->k:I

    .line 67
    .line 68
    invoke-virtual {v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 69
    .line 70
    .line 71
    const-string v4, "pinned"

    .line 72
    .line 73
    iget-boolean v5, v0, Lfb/d1;->l:Z

    .line 74
    .line 75
    invoke-virtual {v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 76
    .line 77
    .line 78
    const-string v4, "locked"

    .line 79
    .line 80
    iget-boolean v5, v0, Lfb/d1;->m:Z

    .line 81
    .line 82
    invoke-virtual {v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 83
    .line 84
    .line 85
    const-string v4, "sortOrder"

    .line 86
    .line 87
    iget-wide v7, v0, Lfb/d1;->n:J

    .line 88
    .line 89
    invoke-virtual {v1, v4, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 90
    .line 91
    .line 92
    const-string v4, "checkpointSeq"

    .line 93
    .line 94
    iget-wide v7, v0, Lfb/d1;->p:J

    .line 95
    .line 96
    invoke-virtual {v1, v4, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 97
    .line 98
    .line 99
    iget-object v4, v0, Lfb/d1;->o:Lfb/c1;

    .line 100
    .line 101
    const-string v5, "startedAt"

    .line 102
    .line 103
    const-string v7, "turnId"

    .line 104
    .line 105
    if-eqz v4, :cond_2

    .line 106
    .line 107
    new-instance v8, Lorg/json/JSONObject;

    .line 108
    .line 109
    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 110
    .line 111
    .line 112
    iget-object v9, v4, Lfb/c1;->a:Ljava/lang/String;

    .line 113
    .line 114
    invoke-virtual {v8, v7, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 115
    .line 116
    .line 117
    const-string v9, "sourceUserMessageId"

    .line 118
    .line 119
    iget-object v10, v4, Lfb/c1;->b:Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 122
    .line 123
    .line 124
    const-string v9, "taskGoal"

    .line 125
    .line 126
    iget-object v10, v4, Lfb/c1;->c:Ljava/lang/String;

    .line 127
    .line 128
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 129
    .line 130
    .line 131
    const-string v9, "workContext"

    .line 132
    .line 133
    iget-object v10, v4, Lfb/c1;->d:Ljava/lang/String;

    .line 134
    .line 135
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 136
    .line 137
    .line 138
    iget-object v9, v4, Lfb/c1;->e:Lfb/j2;

    .line 139
    .line 140
    if-eqz v9, :cond_1

    .line 141
    .line 142
    new-instance v10, Lorg/json/JSONObject;

    .line 143
    .line 144
    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    .line 145
    .line 146
    .line 147
    const-string v11, "stagingPath"

    .line 148
    .line 149
    iget-object v12, v9, Lfb/j2;->a:Ljava/lang/String;

    .line 150
    .line 151
    invoke-virtual {v10, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 152
    .line 153
    .line 154
    const-string v11, "pluginId"

    .line 155
    .line 156
    iget-object v12, v9, Lfb/j2;->b:Ljava/lang/String;

    .line 157
    .line 158
    invoke-virtual {v10, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 159
    .line 160
    .line 161
    const-string v11, "existed"

    .line 162
    .line 163
    iget-boolean v12, v9, Lfb/j2;->c:Z

    .line 164
    .line 165
    invoke-virtual {v10, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 166
    .line 167
    .line 168
    const-string v11, "baseFingerprint"

    .line 169
    .line 170
    iget-object v12, v9, Lfb/j2;->d:Ljava/lang/String;

    .line 171
    .line 172
    invoke-virtual {v10, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 173
    .line 174
    .line 175
    const-string v11, "stageFingerprint"

    .line 176
    .line 177
    iget-object v12, v9, Lfb/j2;->e:Ljava/lang/String;

    .line 178
    .line 179
    invoke-virtual {v10, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 180
    .line 181
    .line 182
    new-instance v11, Lorg/json/JSONObject;

    .line 183
    .line 184
    invoke-direct {v11}, Lorg/json/JSONObject;-><init>()V

    .line 185
    .line 186
    .line 187
    iget-object v12, v9, Lfb/j2;->f:Ljava/util/LinkedHashMap;

    .line 188
    .line 189
    invoke-virtual {v12}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 190
    .line 191
    .line 192
    move-result-object v12

    .line 193
    invoke-interface {v12}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 194
    .line 195
    .line 196
    move-result-object v12

    .line 197
    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 198
    .line 199
    .line 200
    move-result v13

    .line 201
    if-eqz v13, :cond_0

    .line 202
    .line 203
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v13

    .line 207
    check-cast v13, Ljava/util/Map$Entry;

    .line 208
    .line 209
    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v14

    .line 213
    check-cast v14, Ljava/lang/String;

    .line 214
    .line 215
    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v13

    .line 219
    check-cast v13, Ljava/lang/String;

    .line 220
    .line 221
    invoke-virtual {v11, v14, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 222
    .line 223
    .line 224
    goto :goto_0

    .line 225
    :cond_0
    const-string v12, "basePathStates"

    .line 226
    .line 227
    invoke-virtual {v10, v12, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 228
    .line 229
    .line 230
    const-string v11, "initialPluginName"

    .line 231
    .line 232
    iget-object v12, v9, Lfb/j2;->g:Ljava/lang/String;

    .line 233
    .line 234
    invoke-virtual {v10, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 235
    .line 236
    .line 237
    const-string v11, "revision"

    .line 238
    .line 239
    iget v12, v9, Lfb/j2;->h:I

    .line 240
    .line 241
    invoke-virtual {v10, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 242
    .line 243
    .line 244
    const-string v11, "checkedRevision"

    .line 245
    .line 246
    iget v12, v9, Lfb/j2;->i:I

    .line 247
    .line 248
    invoke-virtual {v10, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 249
    .line 250
    .line 251
    const-string v11, "shownRevision"

    .line 252
    .line 253
    iget v12, v9, Lfb/j2;->j:I

    .line 254
    .line 255
    invoke-virtual {v10, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 256
    .line 257
    .line 258
    const-string v11, "deletePlugin"

    .line 259
    .line 260
    iget-boolean v12, v9, Lfb/j2;->k:Z

    .line 261
    .line 262
    invoke-virtual {v10, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 263
    .line 264
    .line 265
    iget-wide v11, v9, Lfb/j2;->l:J

    .line 266
    .line 267
    invoke-virtual {v10, v6, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 268
    .line 269
    .line 270
    goto :goto_1

    .line 271
    :cond_1
    sget-object v10, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 272
    .line 273
    :goto_1
    const-string v9, "workspaceCheckpoint"

    .line 274
    .line 275
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 276
    .line 277
    .line 278
    const-string v9, "autoOpen"

    .line 279
    .line 280
    iget-boolean v10, v4, Lfb/c1;->f:Z

    .line 281
    .line 282
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 283
    .line 284
    .line 285
    iget-wide v9, v4, Lfb/c1;->g:J

    .line 286
    .line 287
    invoke-virtual {v8, v5, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 288
    .line 289
    .line 290
    iget-wide v9, v4, Lfb/c1;->h:J

    .line 291
    .line 292
    invoke-virtual {v8, v6, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 293
    .line 294
    .line 295
    goto :goto_2

    .line 296
    :cond_2
    sget-object v8, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 297
    .line 298
    :goto_2
    const-string v4, "resumeState"

    .line 299
    .line 300
    invoke-virtual {v1, v4, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 301
    .line 302
    .line 303
    new-instance v4, Lorg/json/JSONArray;

    .line 304
    .line 305
    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    .line 306
    .line 307
    .line 308
    iget-object v6, v0, Lfb/d1;->e:Ljava/util/List;

    .line 309
    .line 310
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 311
    .line 312
    .line 313
    move-result-object v6

    .line 314
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 315
    .line 316
    .line 317
    move-result v8

    .line 318
    if-eqz v8, :cond_7

    .line 319
    .line 320
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v8

    .line 324
    check-cast v8, Lfb/c;

    .line 325
    .line 326
    new-instance v9, Lorg/json/JSONObject;

    .line 327
    .line 328
    invoke-direct {v9}, Lorg/json/JSONObject;-><init>()V

    .line 329
    .line 330
    .line 331
    iget-object v10, v8, Lfb/c;->a:Ljava/lang/String;

    .line 332
    .line 333
    const-string v11, "role"

    .line 334
    .line 335
    invoke-virtual {v9, v11, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 336
    .line 337
    .line 338
    iget-object v10, v8, Lfb/c;->b:Ljava/lang/String;

    .line 339
    .line 340
    const-string v12, "content"

    .line 341
    .line 342
    invoke-virtual {v9, v12, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 343
    .line 344
    .line 345
    iget-object v10, v8, Lfb/c;->c:Ljava/lang/String;

    .line 346
    .line 347
    invoke-virtual {v9, v3, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 348
    .line 349
    .line 350
    iget-object v10, v8, Lfb/c;->d:Ljava/lang/String;

    .line 351
    .line 352
    invoke-virtual {v9, v7, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 353
    .line 354
    .line 355
    const-string v10, "parentMessageId"

    .line 356
    .line 357
    iget-object v13, v8, Lfb/c;->e:Ljava/lang/String;

    .line 358
    .line 359
    invoke-virtual {v9, v10, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 360
    .line 361
    .line 362
    const-string v10, "phase"

    .line 363
    .line 364
    iget-object v13, v8, Lfb/c;->f:Ljava/lang/String;

    .line 365
    .line 366
    invoke-virtual {v9, v10, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 367
    .line 368
    .line 369
    iget-object v10, v8, Lfb/c;->g:Ljava/lang/String;

    .line 370
    .line 371
    const-string v13, "progress"

    .line 372
    .line 373
    invoke-virtual {v9, v13, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 374
    .line 375
    .line 376
    const-string v10, "reasoning"

    .line 377
    .line 378
    iget-object v14, v8, Lfb/c;->h:Ljava/lang/String;

    .line 379
    .line 380
    invoke-virtual {v9, v10, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 381
    .line 382
    .line 383
    iget-object v10, v8, Lfb/c;->i:Ljava/lang/String;

    .line 384
    .line 385
    const-string v14, "diff"

    .line 386
    .line 387
    invoke-virtual {v9, v14, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 388
    .line 389
    .line 390
    new-instance v10, Lorg/json/JSONArray;

    .line 391
    .line 392
    invoke-direct {v10}, Lorg/json/JSONArray;-><init>()V

    .line 393
    .line 394
    .line 395
    iget-object v15, v8, Lfb/c;->j:Ljava/util/List;

    .line 396
    .line 397
    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 398
    .line 399
    .line 400
    move-result-object v15

    .line 401
    :goto_4
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 402
    .line 403
    .line 404
    move-result v16

    .line 405
    move-object/from16 v17, v6

    .line 406
    .line 407
    const-string v6, "status"

    .line 408
    .line 409
    move-object/from16 v18, v15

    .line 410
    .line 411
    const-string v15, "name"

    .line 412
    .line 413
    if-eqz v16, :cond_3

    .line 414
    .line 415
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v16

    .line 419
    move-object/from16 v0, v16

    .line 420
    .line 421
    check-cast v0, Lfb/q1;

    .line 422
    .line 423
    move-object/from16 v16, v1

    .line 424
    .line 425
    new-instance v1, Lorg/json/JSONObject;

    .line 426
    .line 427
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 428
    .line 429
    .line 430
    move-object/from16 v19, v4

    .line 431
    .line 432
    iget-object v4, v0, Lfb/q1;->a:Ljava/lang/String;

    .line 433
    .line 434
    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 435
    .line 436
    .line 437
    const-string v4, "kind"

    .line 438
    .line 439
    move-object/from16 v20, v3

    .line 440
    .line 441
    iget-object v3, v0, Lfb/q1;->b:Ljava/lang/String;

    .line 442
    .line 443
    invoke-virtual {v1, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 444
    .line 445
    .line 446
    iget-object v3, v0, Lfb/q1;->c:Ljava/lang/String;

    .line 447
    .line 448
    invoke-virtual {v1, v15, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 449
    .line 450
    .line 451
    const-string v3, "arguments"

    .line 452
    .line 453
    iget-object v4, v0, Lfb/q1;->d:Ljava/lang/String;

    .line 454
    .line 455
    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 456
    .line 457
    .line 458
    const-string v3, "result"

    .line 459
    .line 460
    iget-object v4, v0, Lfb/q1;->e:Ljava/lang/String;

    .line 461
    .line 462
    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 463
    .line 464
    .line 465
    iget-object v3, v0, Lfb/q1;->f:Ljava/lang/String;

    .line 466
    .line 467
    invoke-virtual {v1, v14, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 468
    .line 469
    .line 470
    iget-object v3, v0, Lfb/q1;->g:Ljava/lang/String;

    .line 471
    .line 472
    invoke-virtual {v1, v6, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 473
    .line 474
    .line 475
    iget-wide v3, v0, Lfb/q1;->h:J

    .line 476
    .line 477
    invoke-virtual {v1, v5, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 478
    .line 479
    .line 480
    const-string v3, "finishedAt"

    .line 481
    .line 482
    move-object/from16 v21, v5

    .line 483
    .line 484
    iget-wide v4, v0, Lfb/q1;->i:J

    .line 485
    .line 486
    invoke-virtual {v1, v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 487
    .line 488
    .line 489
    iget-object v3, v0, Lfb/q1;->j:Ljava/lang/String;

    .line 490
    .line 491
    invoke-virtual {v1, v13, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 492
    .line 493
    .line 494
    iget-object v3, v0, Lfb/q1;->k:Ljava/lang/String;

    .line 495
    .line 496
    invoke-virtual {v1, v7, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 497
    .line 498
    .line 499
    const-string v3, "toolCallId"

    .line 500
    .line 501
    iget-object v4, v0, Lfb/q1;->l:Ljava/lang/String;

    .line 502
    .line 503
    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 504
    .line 505
    .line 506
    const-string v3, "protocolName"

    .line 507
    .line 508
    iget-object v4, v0, Lfb/q1;->m:Ljava/lang/String;

    .line 509
    .line 510
    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 511
    .line 512
    .line 513
    const-string v3, "providerMetadata"

    .line 514
    .line 515
    iget-object v4, v0, Lfb/q1;->n:Ljava/lang/String;

    .line 516
    .line 517
    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 518
    .line 519
    .line 520
    const-string v3, "parentAssistantMessageId"

    .line 521
    .line 522
    iget-object v4, v0, Lfb/q1;->o:Ljava/lang/String;

    .line 523
    .line 524
    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 525
    .line 526
    .line 527
    const-string v3, "resultHandle"

    .line 528
    .line 529
    iget-object v4, v0, Lfb/q1;->p:Ljava/lang/String;

    .line 530
    .line 531
    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 532
    .line 533
    .line 534
    const-string v3, "resultLength"

    .line 535
    .line 536
    iget v4, v0, Lfb/q1;->q:I

    .line 537
    .line 538
    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 539
    .line 540
    .line 541
    const-string v3, "truncated"

    .line 542
    .line 543
    iget-boolean v4, v0, Lfb/q1;->r:Z

    .line 544
    .line 545
    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 546
    .line 547
    .line 548
    const-string v3, "nextOffset"

    .line 549
    .line 550
    iget v0, v0, Lfb/q1;->s:I

    .line 551
    .line 552
    invoke-virtual {v1, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 553
    .line 554
    .line 555
    invoke-virtual {v10, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 556
    .line 557
    .line 558
    move-object/from16 v0, p0

    .line 559
    .line 560
    move-object/from16 v1, v16

    .line 561
    .line 562
    move-object/from16 v6, v17

    .line 563
    .line 564
    move-object/from16 v15, v18

    .line 565
    .line 566
    move-object/from16 v4, v19

    .line 567
    .line 568
    move-object/from16 v3, v20

    .line 569
    .line 570
    move-object/from16 v5, v21

    .line 571
    .line 572
    goto/16 :goto_4

    .line 573
    .line 574
    :cond_3
    move-object/from16 v16, v1

    .line 575
    .line 576
    move-object/from16 v20, v3

    .line 577
    .line 578
    move-object/from16 v19, v4

    .line 579
    .line 580
    move-object/from16 v21, v5

    .line 581
    .line 582
    const-string v0, "toolEvents"

    .line 583
    .line 584
    invoke-virtual {v9, v0, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 585
    .line 586
    .line 587
    iget-object v0, v8, Lfb/c;->n:Ljava/lang/String;

    .line 588
    .line 589
    invoke-virtual {v9, v6, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 590
    .line 591
    .line 592
    iget-object v0, v8, Lfb/c;->o:Lfb/y;

    .line 593
    .line 594
    if-eqz v0, :cond_4

    .line 595
    .line 596
    invoke-static {v0}, Lfb/g1;->g(Lfb/y;)Lorg/json/JSONObject;

    .line 597
    .line 598
    .line 599
    move-result-object v0

    .line 600
    goto :goto_5

    .line 601
    :cond_4
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 602
    .line 603
    :goto_5
    const-string v1, "draftSnapshot"

    .line 604
    .line 605
    invoke-virtual {v9, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 606
    .line 607
    .line 608
    const-string v0, "clearsDraft"

    .line 609
    .line 610
    iget-boolean v1, v8, Lfb/c;->p:Z

    .line 611
    .line 612
    invoke-virtual {v9, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 613
    .line 614
    .line 615
    new-instance v0, Lorg/json/JSONArray;

    .line 616
    .line 617
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 618
    .line 619
    .line 620
    iget-object v1, v8, Lfb/c;->k:Ljava/util/List;

    .line 621
    .line 622
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 623
    .line 624
    .line 625
    move-result-object v1

    .line 626
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 627
    .line 628
    .line 629
    move-result v3

    .line 630
    if-eqz v3, :cond_5

    .line 631
    .line 632
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 633
    .line 634
    .line 635
    move-result-object v3

    .line 636
    check-cast v3, Lfb/a;

    .line 637
    .line 638
    new-instance v4, Lorg/json/JSONObject;

    .line 639
    .line 640
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 641
    .line 642
    .line 643
    iget-object v5, v3, Lfb/a;->a:Ljava/lang/String;

    .line 644
    .line 645
    invoke-virtual {v4, v15, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 646
    .line 647
    .line 648
    const-string v5, "path"

    .line 649
    .line 650
    iget-object v6, v3, Lfb/a;->b:Ljava/lang/String;

    .line 651
    .line 652
    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 653
    .line 654
    .line 655
    const-string v5, "mimeType"

    .line 656
    .line 657
    iget-object v6, v3, Lfb/a;->c:Ljava/lang/String;

    .line 658
    .line 659
    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 660
    .line 661
    .line 662
    const-string v5, "size"

    .line 663
    .line 664
    iget-wide v13, v3, Lfb/a;->d:J

    .line 665
    .line 666
    invoke-virtual {v4, v5, v13, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 667
    .line 668
    .line 669
    const-string v5, "sourceUri"

    .line 670
    .line 671
    iget-object v3, v3, Lfb/a;->e:Ljava/lang/String;

    .line 672
    .line 673
    invoke-virtual {v4, v5, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 674
    .line 675
    .line 676
    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 677
    .line 678
    .line 679
    goto :goto_6

    .line 680
    :cond_5
    const-string v1, "attachments"

    .line 681
    .line 682
    invoke-virtual {v9, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 683
    .line 684
    .line 685
    iget-object v0, v8, Lfb/c;->l:Lfb/a1;

    .line 686
    .line 687
    if-eqz v0, :cond_6

    .line 688
    .line 689
    new-instance v1, Lorg/json/JSONObject;

    .line 690
    .line 691
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 692
    .line 693
    .line 694
    iget-object v3, v0, Lfb/a1;->a:Ljava/lang/String;

    .line 695
    .line 696
    invoke-virtual {v1, v11, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 697
    .line 698
    .line 699
    iget-object v3, v0, Lfb/a1;->b:Ljava/lang/String;

    .line 700
    .line 701
    invoke-virtual {v1, v12, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 702
    .line 703
    .line 704
    iget-wide v3, v0, Lfb/a1;->c:J

    .line 705
    .line 706
    invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 707
    .line 708
    .line 709
    goto :goto_7

    .line 710
    :cond_6
    sget-object v1, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 711
    .line 712
    :goto_7
    const-string v0, "quotedMessage"

    .line 713
    .line 714
    invoke-virtual {v9, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 715
    .line 716
    .line 717
    iget-wide v0, v8, Lfb/c;->m:J

    .line 718
    .line 719
    invoke-virtual {v9, v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 720
    .line 721
    .line 722
    const-string v0, "streamId"

    .line 723
    .line 724
    iget-object v1, v8, Lfb/c;->q:Ljava/lang/String;

    .line 725
    .line 726
    invoke-virtual {v9, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 727
    .line 728
    .line 729
    const-string v0, "completedAt"

    .line 730
    .line 731
    iget-wide v3, v8, Lfb/c;->r:J

    .line 732
    .line 733
    invoke-virtual {v9, v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 734
    .line 735
    .line 736
    move-object/from16 v0, v19

    .line 737
    .line 738
    invoke-virtual {v0, v9}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 739
    .line 740
    .line 741
    move-object v4, v0

    .line 742
    move-object/from16 v1, v16

    .line 743
    .line 744
    move-object/from16 v6, v17

    .line 745
    .line 746
    move-object/from16 v3, v20

    .line 747
    .line 748
    move-object/from16 v5, v21

    .line 749
    .line 750
    move-object/from16 v0, p0

    .line 751
    .line 752
    goto/16 :goto_3

    .line 753
    .line 754
    :cond_7
    move-object/from16 v16, v1

    .line 755
    .line 756
    move-object v0, v4

    .line 757
    const-string v1, "messages"

    .line 758
    .line 759
    move-object/from16 v2, v16

    .line 760
    .line 761
    invoke-virtual {v2, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 762
    .line 763
    .line 764
    move-object/from16 v0, p0

    .line 765
    .line 766
    iget-object v0, v0, Lfb/d1;->f:Lfb/y;

    .line 767
    .line 768
    if-eqz v0, :cond_8

    .line 769
    .line 770
    invoke-static {v0}, Lfb/g1;->g(Lfb/y;)Lorg/json/JSONObject;

    .line 771
    .line 772
    .line 773
    move-result-object v0

    .line 774
    goto :goto_8

    .line 775
    :cond_8
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 776
    .line 777
    :goto_8
    const-string v1, "draft"

    .line 778
    .line 779
    invoke-virtual {v2, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 780
    .line 781
    .line 782
    return-object v2
.end method

.method public static g(Lfb/y;)Lorg/json/JSONObject;
    .locals 3

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "pluginName"

    .line 7
    .line 8
    iget-object v2, p0, Lfb/y;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    const-string v1, "pluginId"

    .line 14
    .line 15
    iget-object v2, p0, Lfb/y;->b:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 18
    .line 19
    .line 20
    const-string v1, "infoProp"

    .line 21
    .line 22
    iget-object v2, p0, Lfb/y;->c:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 25
    .line 26
    .line 27
    const-string v1, "mainJava"

    .line 28
    .line 29
    iget-object v2, p0, Lfb/y;->d:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 32
    .line 33
    .line 34
    const-string v1, "summary"

    .line 35
    .line 36
    iget-object p0, p0, Lfb/y;->e:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 39
    .line 40
    .line 41
    return-object v0
.end method

.method public static h(Ljava/util/List;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_4

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Lfb/c;

    .line 27
    .line 28
    iget-object v2, v0, Lfb/c;->a:Ljava/lang/String;

    .line 29
    .line 30
    const-string v3, "user"

    .line 31
    .line 32
    invoke-static {v2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    const/4 v3, 0x1

    .line 37
    if-eqz v2, :cond_3

    .line 38
    .line 39
    iget-object v2, v0, Lfb/c;->b:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_2

    .line 46
    .line 47
    iget-object v0, v0, Lfb/c;->k:Ljava/util/List;

    .line 48
    .line 49
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_3

    .line 54
    .line 55
    :cond_2
    move v0, v3

    .line 56
    goto :goto_0

    .line 57
    :cond_3
    move v0, v1

    .line 58
    :goto_0
    if-eqz v0, :cond_1

    .line 59
    .line 60
    return v3

    .line 61
    :cond_4
    :goto_1
    return v1
.end method

.method public static i(Landroid/content/Context;)Ljava/util/List;
    .locals 3

    .line 1
    invoke-static {p0}, Lfb/g1;->p(Landroid/content/Context;)Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    invoke-static {p0}, Ltf/l;->k0([Ljava/lang/Object;)Lng/j;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    new-instance v0, Lfb/g0;

    .line 23
    .line 24
    const/16 v1, 0xf

    .line 25
    .line 26
    invoke-direct {v0, v1}, Lfb/g0;-><init>(I)V

    .line 27
    .line 28
    .line 29
    new-instance v1, Lng/i;

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    invoke-direct {v1, p0, v2, v0}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 33
    .line 34
    .line 35
    new-instance p0, Lfb/g0;

    .line 36
    .line 37
    const/16 v0, 0x10

    .line 38
    .line 39
    invoke-direct {p0, v0}, Lfb/g0;-><init>(I)V

    .line 40
    .line 41
    .line 42
    invoke-static {v1, p0}, Lng/m;->X(Lng/j;Lfg/l;)Lng/i;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    new-instance v0, Lfb/g0;

    .line 47
    .line 48
    const/16 v1, 0xb

    .line 49
    .line 50
    invoke-direct {v0, v1}, Lfb/g0;-><init>(I)V

    .line 51
    .line 52
    .line 53
    new-instance v1, Lng/i;

    .line 54
    .line 55
    invoke-direct {v1, p0, v2, v0}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 56
    .line 57
    .line 58
    invoke-static {v1}, Lng/m;->b0(Lng/j;)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    new-instance v0, Lfb/r;

    .line 63
    .line 64
    const/4 v1, 0x7

    .line 65
    invoke-direct {v0, v1}, Lfb/r;-><init>(I)V

    .line 66
    .line 67
    .line 68
    new-instance v1, Lc9/a0;

    .line 69
    .line 70
    const/16 v2, 0xc

    .line 71
    .line 72
    invoke-direct {v1, v0, v2}, Lc9/a0;-><init>(Ljava/lang/Object;I)V

    .line 73
    .line 74
    .line 75
    new-instance v0, Lc9/a0;

    .line 76
    .line 77
    const/16 v2, 0xd

    .line 78
    .line 79
    invoke-direct {v0, v1, v2}, Lc9/a0;-><init>(Ljava/lang/Object;I)V

    .line 80
    .line 81
    .line 82
    invoke-static {p0, v0}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0

    .line 87
    :cond_1
    :goto_0
    sget-object p0, Ltf/t;->g:Ltf/t;

    .line 88
    .line 89
    return-object p0
.end method

.method public static j(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    .locals 4

    .line 1
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

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
    goto :goto_2

    .line 9
    :cond_0
    :try_start_0
    invoke-static {p0}, Lfb/g1;->a(Landroid/content/Context;)Ljava/io/File;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 14
    .line 15
    .line 16
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    new-instance v0, Lsf/f;

    .line 20
    .line 21
    invoke-direct {v0, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    move-object p0, v0

    .line 25
    :goto_0
    nop

    .line 26
    instance-of v0, p0, Lsf/f;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    move-object p0, v1

    .line 31
    :cond_1
    check-cast p0, Ljava/io/File;

    .line 32
    .line 33
    if-eqz p0, :cond_3

    .line 34
    .line 35
    :try_start_1
    new-instance v0, Ljava/io/File;

    .line 36
    .line 37
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 41
    .line 42
    .line 43
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 44
    goto :goto_1

    .line 45
    :catchall_1
    move-exception p1

    .line 46
    new-instance v0, Lsf/f;

    .line 47
    .line 48
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    move-object p1, v0

    .line 52
    :goto_1
    nop

    .line 53
    instance-of v0, p1, Lsf/f;

    .line 54
    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    move-object p1, v1

    .line 58
    :cond_2
    check-cast p1, Ljava/io/File;

    .line 59
    .line 60
    if-eqz p1, :cond_3

    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    const/4 v0, 0x1

    .line 70
    new-array v0, v0, [C

    .line 71
    .line 72
    sget-char v2, Ljava/io/File;->separatorChar:C

    .line 73
    .line 74
    const/4 v3, 0x0

    .line 75
    aput-char v2, v0, v3

    .line 76
    .line 77
    invoke-static {p0, v0}, Log/m;->U0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {p0, v0}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-static {v0, p0, v3}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    if-eqz p0, :cond_3

    .line 99
    .line 100
    move-object v1, p1

    .line 101
    :cond_3
    :goto_2
    return-object v1
.end method

.method public static k(Landroid/content/Context;Ljava/util/ArrayList;)Ljava/lang/Object;
    .locals 12

    .line 1
    :try_start_0
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    move-object v3, v2

    .line 26
    check-cast v3, Lfb/a;

    .line 27
    .line 28
    iget-object v3, v3, Lfb/a;->b:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_11

    .line 49
    .line 50
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Lfb/a;

    .line 55
    .line 56
    iget-object v1, v0, Lfb/a;->b:Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {p0, v1}, Lfb/g1;->j(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    if-eqz v1, :cond_10

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    const-wide/16 v3, 0x0

    .line 69
    .line 70
    if-eqz v2, :cond_2

    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/io/File;->length()J

    .line 73
    .line 74
    .line 75
    move-result-wide v5

    .line 76
    cmp-long v2, v5, v3

    .line 77
    .line 78
    if-lez v2, :cond_2

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    sget-object v2, Lfb/g1;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    invoke-virtual {v2, v5}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    if-nez v6, :cond_4

    .line 92
    .line 93
    new-instance v6, Ljava/lang/Object;

    .line 94
    .line 95
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2, v5, v6}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    if-nez v2, :cond_3

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_3
    move-object v6, v2

    .line 106
    :cond_4
    :goto_2
    monitor-enter v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    .line 107
    :try_start_1
    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    if-eqz v2, :cond_5

    .line 112
    .line 113
    invoke-virtual {v1}, Ljava/io/File;->length()J

    .line 114
    .line 115
    .line 116
    move-result-wide v7

    .line 117
    cmp-long v2, v7, v3

    .line 118
    .line 119
    if-lez v2, :cond_5

    .line 120
    .line 121
    goto/16 :goto_6

    .line 122
    .line 123
    :catchall_0
    move-exception p0

    .line 124
    goto/16 :goto_9

    .line 125
    .line 126
    :cond_5
    iget-object v2, v0, Lfb/a;->e:Ljava/lang/String;

    .line 127
    .line 128
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    if-nez v5, :cond_6

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_6
    const/4 v2, 0x0

    .line 136
    :goto_3
    if-eqz v2, :cond_f

    .line 137
    .line 138
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    if-eqz v2, :cond_f

    .line 143
    .line 144
    new-instance v5, Ljava/io/File;

    .line 145
    .line 146
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v8

    .line 154
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 155
    .line 156
    .line 157
    move-result-object v9

    .line 158
    new-instance v10, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 161
    .line 162
    .line 163
    const-string v11, "."

    .line 164
    .line 165
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    const-string v8, "."

    .line 172
    .line 173
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    const-string v8, ".tmp"

    .line 180
    .line 181
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v8

    .line 188
    invoke-direct {v5, v7, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 189
    .line 190
    .line 191
    :try_start_2
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 192
    .line 193
    .line 194
    move-result-object v7

    .line 195
    if-eqz v7, :cond_7

    .line 196
    .line 197
    invoke-virtual {v7}, Ljava/io/File;->mkdirs()Z

    .line 198
    .line 199
    .line 200
    goto :goto_4

    .line 201
    :catchall_1
    move-exception p0

    .line 202
    goto/16 :goto_8

    .line 203
    .line 204
    :cond_7
    :goto_4
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 205
    .line 206
    .line 207
    move-result-object v7

    .line 208
    invoke-virtual {v7, v2}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 209
    .line 210
    .line 211
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 212
    if-eqz v2, :cond_e

    .line 213
    .line 214
    :try_start_3
    new-instance v7, Ljava/io/FileOutputStream;

    .line 215
    .line 216
    invoke-direct {v7, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 217
    .line 218
    .line 219
    :try_start_4
    invoke-static {v2, v7}, Lg4/a;->j(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 220
    .line 221
    .line 222
    :try_start_5
    invoke-virtual {v7}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 223
    .line 224
    .line 225
    :try_start_6
    invoke-interface {v2}, Ljava/io/Closeable;->close()V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v5}, Ljava/io/File;->isFile()Z

    .line 229
    .line 230
    .line 231
    move-result v2

    .line 232
    if-eqz v2, :cond_d

    .line 233
    .line 234
    invoke-virtual {v5}, Ljava/io/File;->length()J

    .line 235
    .line 236
    .line 237
    move-result-wide v7

    .line 238
    cmp-long v2, v7, v3

    .line 239
    .line 240
    if-lez v2, :cond_d

    .line 241
    .line 242
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 243
    .line 244
    .line 245
    move-result v2

    .line 246
    if-eqz v2, :cond_9

    .line 247
    .line 248
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 249
    .line 250
    .line 251
    move-result v2

    .line 252
    if-eqz v2, :cond_8

    .line 253
    .line 254
    goto :goto_5

    .line 255
    :cond_8
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 256
    .line 257
    const-string p1, "\u65e0\u6cd5\u66ff\u6362\u9644\u4ef6\u526f\u672c"

    .line 258
    .line 259
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    throw p0

    .line 263
    :cond_9
    :goto_5
    invoke-virtual {v5, v1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 264
    .line 265
    .line 266
    move-result v2

    .line 267
    if-nez v2, :cond_a

    .line 268
    .line 269
    invoke-static {v5, v1}, Ldg/l;->a0(Ljava/io/File;Ljava/io/File;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    .line 273
    .line 274
    .line 275
    :cond_a
    iget-wide v7, v0, Lfb/a;->d:J

    .line 276
    .line 277
    cmp-long v2, v7, v3

    .line 278
    .line 279
    if-lez v2, :cond_c

    .line 280
    .line 281
    invoke-virtual {v1}, Ljava/io/File;->length()J

    .line 282
    .line 283
    .line 284
    move-result-wide v2

    .line 285
    iget-wide v7, v0, Lfb/a;->d:J

    .line 286
    .line 287
    cmp-long v2, v2, v7

    .line 288
    .line 289
    if-nez v2, :cond_b

    .line 290
    .line 291
    goto :goto_6

    .line 292
    :cond_b
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 293
    .line 294
    const-string p1, "\u9644\u4ef6\u5927\u5c0f\u5df2\u53d8\u5316"

    .line 295
    .line 296
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 300
    :cond_c
    :goto_6
    :try_start_7
    monitor-exit v6
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 301
    goto/16 :goto_1

    .line 302
    .line 303
    :cond_d
    :try_start_8
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 304
    .line 305
    const-string p1, "\u9644\u4ef6\u5185\u5bb9\u4e3a\u7a7a"

    .line 306
    .line 307
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    throw p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 311
    :catchall_2
    move-exception p0

    .line 312
    goto :goto_7

    .line 313
    :catchall_3
    move-exception p0

    .line 314
    :try_start_9
    throw p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 315
    :catchall_4
    move-exception p1

    .line 316
    :try_start_a
    invoke-static {v7, p0}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 317
    .line 318
    .line 319
    throw p1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 320
    :goto_7
    :try_start_b
    throw p0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 321
    :catchall_5
    move-exception p1

    .line 322
    :try_start_c
    invoke-static {v2, p0}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 323
    .line 324
    .line 325
    throw p1

    .line 326
    :cond_e
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 327
    .line 328
    const-string p1, "\u65e0\u6cd5\u91cd\u65b0\u8bfb\u53d6\u9644\u4ef6"

    .line 329
    .line 330
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    throw p0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    .line 334
    :goto_8
    :try_start_d
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    .line 335
    .line 336
    .line 337
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 338
    .line 339
    .line 340
    iget-object p1, v0, Lfb/a;->a:Ljava/lang/String;

    .line 341
    .line 342
    new-instance v1, Ljava/lang/StringBuilder;

    .line 343
    .line 344
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 345
    .line 346
    .line 347
    const-string v2, "[Hchat:ScriptAgent] \u6062\u590d\u9644\u4ef6\u5931\u8d25: "

    .line 348
    .line 349
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object p1

    .line 359
    invoke-static {p1, p0}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 360
    .line 361
    .line 362
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 363
    .line 364
    iget-object v0, v0, Lfb/a;->a:Ljava/lang/String;

    .line 365
    .line 366
    new-instance v1, Ljava/lang/StringBuilder;

    .line 367
    .line 368
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 369
    .line 370
    .line 371
    const-string v2, "\u65e0\u6cd5\u6062\u590d\u9644\u4ef6: "

    .line 372
    .line 373
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 374
    .line 375
    .line 376
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 377
    .line 378
    .line 379
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    invoke-direct {p1, v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 384
    .line 385
    .line 386
    throw p1

    .line 387
    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 388
    .line 389
    iget-object p1, v0, Lfb/a;->a:Ljava/lang/String;

    .line 390
    .line 391
    new-instance v0, Ljava/lang/StringBuilder;

    .line 392
    .line 393
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 394
    .line 395
    .line 396
    const-string v1, "\u9644\u4ef6\u526f\u672c\u4e0d\u5b58\u5728\u4e14\u65e0\u6cd5\u91cd\u65b0\u8bfb\u53d6: "

    .line 397
    .line 398
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object p1

    .line 408
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    throw p0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    .line 412
    :goto_9
    :try_start_e
    monitor-exit v6

    .line 413
    throw p0

    .line 414
    :cond_10
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 415
    .line 416
    iget-object p1, v0, Lfb/a;->a:Ljava/lang/String;

    .line 417
    .line 418
    new-instance v0, Ljava/lang/StringBuilder;

    .line 419
    .line 420
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 421
    .line 422
    .line 423
    const-string v1, "\u9644\u4ef6\u8def\u5f84\u65e0\u6548: "

    .line 424
    .line 425
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 426
    .line 427
    .line 428
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object p1

    .line 435
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    throw p0

    .line 439
    :cond_11
    sget-object p0, Lsf/n;->a:Lsf/n;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    .line 440
    .line 441
    return-object p0

    .line 442
    :catchall_6
    move-exception p0

    .line 443
    new-instance p1, Lsf/f;

    .line 444
    .line 445
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 446
    .line 447
    .line 448
    return-object p1
.end method

.method public static l(Landroid/content/Context;Ljava/util/ArrayList;)V
    .locals 8

    .line 1
    sget-object v0, Lfb/g1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_3

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    move-object v3, v2

    .line 24
    check-cast v3, Lfb/a;

    .line 25
    .line 26
    iget-object v3, v3, Lfb/a;->b:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {p0, v3}, Lfb/g1;->j(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v3, :cond_2

    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    sget-object v5, Lfb/g1;->c:Ljava/util/HashMap;

    .line 42
    .line 43
    const/4 v6, 0x1

    .line 44
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    invoke-virtual {v5, v3, v7}, Ljava/util/HashMap;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    check-cast v7, Ljava/lang/Number;

    .line 53
    .line 54
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    sub-int/2addr v7, v6

    .line 59
    if-lez v7, :cond_1

    .line 60
    .line 61
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    invoke-virtual {v5, v3, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :catchall_0
    move-exception p0

    .line 70
    goto :goto_3

    .line 71
    :cond_1
    invoke-virtual {v5, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move v4, v6

    .line 75
    :cond_2
    :goto_1
    if-eqz v4, :cond_0

    .line 76
    .line 77
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_3
    invoke-static {p0, v1}, Lfb/g1;->b(Landroid/content/Context;Ljava/util/List;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    :cond_4
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-eqz v1, :cond_5

    .line 93
    .line 94
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    check-cast v1, Lfb/a;

    .line 99
    .line 100
    iget-object v1, v1, Lfb/a;->b:Ljava/lang/String;

    .line 101
    .line 102
    invoke-static {p0, v1}, Lfb/g1;->j(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    if-eqz v1, :cond_4

    .line 107
    .line 108
    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    if-eqz v1, :cond_4

    .line 113
    .line 114
    sget-object v2, Lfb/g1;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 115
    .line 116
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_5
    monitor-exit v0

    .line 121
    return-void

    .line 122
    :goto_3
    monitor-exit v0

    .line 123
    throw p0
.end method

.method public static m(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "[^A-Za-z0-9_-]"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const-string v0, "_"

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    const/16 v0, 0x50

    .line 27
    .line 28
    invoke-static {v0, p0}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    const-string p0, "session"

    .line 39
    .line 40
    :cond_0
    return-object p0
.end method

.method public static n(Landroid/content/Context;Lfb/d1;)V
    .locals 12

    .line 1
    const-string v0, "."

    .line 2
    .line 3
    const-string v1, ".json"

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v2, p1, Lfb/d1;->e:Ljava/util/List;

    .line 12
    .line 13
    invoke-static {v2}, Lfb/g1;->h(Ljava/util/List;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    iget-object v3, p1, Lfb/d1;->a:Ljava/lang/String;

    .line 18
    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-static {p0, v3}, Lfb/g1;->e(Landroid/content/Context;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    new-instance p1, Ljava/io/File;

    .line 28
    .line 29
    invoke-static {p0}, Lfb/g1;->a(Landroid/content/Context;)Ljava/io/File;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {v3}, Lfb/g1;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-direct {p1, p0, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-static {p1}, Ldg/l;->b0(Ljava/io/File;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_0
    invoke-static {v3}, Lfb/g1;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    sget-object v3, Lfb/g1;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 49
    .line 50
    new-instance v4, Lfb/g0;

    .line 51
    .line 52
    const/16 v5, 0xc

    .line 53
    .line 54
    invoke-direct {v4, v5}, Lfb/g0;-><init>(I)V

    .line 55
    .line 56
    .line 57
    new-instance v5, Lbc/j;

    .line 58
    .line 59
    const/4 v6, 0x7

    .line 60
    invoke-direct {v5, v4, v6}, Lbc/j;-><init>(Ljava/lang/Object;I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3, v2, v5}, Ljava/util/concurrent/ConcurrentHashMap;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    monitor-enter v3

    .line 71
    :try_start_0
    sget-object v4, Lfb/g1;->h:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 72
    .line 73
    invoke-virtual {v4, v2}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->contains(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    if-eqz v4, :cond_1

    .line 78
    .line 79
    monitor-exit v3

    .line 80
    return-void

    .line 81
    :cond_1
    :try_start_1
    invoke-static {p0}, Lfb/g1;->p(Landroid/content/Context;)Ljava/io/File;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    if-nez v4, :cond_2

    .line 90
    .line 91
    invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :catchall_0
    move-exception p0

    .line 96
    goto/16 :goto_8

    .line 97
    .line 98
    :cond_2
    :goto_0
    new-instance v4, Ljava/io/File;

    .line 99
    .line 100
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-direct {v4, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 105
    .line 106
    .line 107
    const/4 v1, 0x0

    .line 108
    :try_start_2
    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-eqz v2, :cond_3

    .line 113
    .line 114
    new-instance v2, Lorg/json/JSONObject;

    .line 115
    .line 116
    sget-object v5, Log/a;->a:Ljava/nio/charset/Charset;

    .line 117
    .line 118
    invoke-static {v4, v5}, Ldg/l;->h0(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    invoke-direct {v2, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 123
    .line 124
    .line 125
    goto :goto_2

    .line 126
    :catchall_1
    move-exception v2

    .line 127
    goto :goto_1

    .line 128
    :cond_3
    move-object v2, v1

    .line 129
    goto :goto_2

    .line 130
    :goto_1
    :try_start_3
    new-instance v5, Lsf/f;

    .line 131
    .line 132
    invoke-direct {v5, v2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 133
    .line 134
    .line 135
    move-object v2, v5

    .line 136
    :goto_2
    nop

    .line 137
    instance-of v5, v2, Lsf/f;

    .line 138
    .line 139
    if-eqz v5, :cond_4

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_4
    move-object v1, v2

    .line 143
    :goto_3
    check-cast v1, Lorg/json/JSONObject;

    .line 144
    .line 145
    const-wide/16 v5, 0x0

    .line 146
    .line 147
    if-eqz v1, :cond_5

    .line 148
    .line 149
    const-string v2, "checkpointSeq"

    .line 150
    .line 151
    invoke-virtual {v1, v2, v5, v6}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 152
    .line 153
    .line 154
    move-result-wide v7

    .line 155
    goto :goto_4

    .line 156
    :cond_5
    move-wide v7, v5

    .line 157
    :goto_4
    if-eqz v1, :cond_6

    .line 158
    .line 159
    const-string v2, "updatedAt"

    .line 160
    .line 161
    invoke-virtual {v1, v2, v5, v6}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 162
    .line 163
    .line 164
    move-result-wide v1

    .line 165
    goto :goto_5

    .line 166
    :cond_6
    move-wide v1, v5

    .line 167
    :goto_5
    iget-wide v9, p1, Lfb/d1;->p:J

    .line 168
    .line 169
    cmp-long v11, v7, v9

    .line 170
    .line 171
    if-gtz v11, :cond_9

    .line 172
    .line 173
    cmp-long v7, v7, v5

    .line 174
    .line 175
    if-nez v7, :cond_7

    .line 176
    .line 177
    cmp-long v5, v9, v5

    .line 178
    .line 179
    if-nez v5, :cond_7

    .line 180
    .line 181
    iget-wide v5, p1, Lfb/d1;->d:J

    .line 182
    .line 183
    cmp-long v1, v1, v5

    .line 184
    .line 185
    if-lez v1, :cond_7

    .line 186
    .line 187
    goto :goto_7

    .line 188
    :cond_7
    new-instance v1, Ljava/io/File;

    .line 189
    .line 190
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    new-instance v5, Ljava/lang/StringBuilder;

    .line 195
    .line 196
    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    const-string v0, ".tmp"

    .line 203
    .line 204
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-direct {v1, p0, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    new-instance p0, Ljava/io/FileOutputStream;

    .line 215
    .line 216
    invoke-direct {p0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 217
    .line 218
    .line 219
    :try_start_4
    invoke-static {p1}, Lfb/g1;->f(Lfb/d1;)Lorg/json/JSONObject;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 231
    .line 232
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    invoke-virtual {p0, p1}, Ljava/io/FileOutputStream;->write([B)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {p0}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    invoke-virtual {p1}, Ljava/io/FileDescriptor;->sync()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 250
    .line 251
    .line 252
    :try_start_5
    invoke-virtual {p0}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 253
    .line 254
    .line 255
    :try_start_6
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    invoke-static {p0, p1}, Landroid/system/Os;->rename(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 264
    .line 265
    .line 266
    goto :goto_6

    .line 267
    :catchall_2
    move-exception p0

    .line 268
    :try_start_7
    invoke-virtual {v1, v4}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 269
    .line 270
    .line 271
    move-result p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 272
    if-eqz p1, :cond_8

    .line 273
    .line 274
    :goto_6
    monitor-exit v3

    .line 275
    return-void

    .line 276
    :cond_8
    :try_start_8
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 277
    .line 278
    .line 279
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 280
    .line 281
    const-string v0, "\u4fdd\u5b58 Agent \u4f1a\u8bdd\u5931\u8d25"

    .line 282
    .line 283
    invoke-direct {p1, v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 284
    .line 285
    .line 286
    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 287
    :catchall_3
    move-exception p1

    .line 288
    :try_start_9
    throw p1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 289
    :catchall_4
    move-exception v0

    .line 290
    :try_start_a
    invoke-static {p0, p1}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 291
    .line 292
    .line 293
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 294
    :cond_9
    :goto_7
    monitor-exit v3

    .line 295
    return-void

    .line 296
    :goto_8
    monitor-exit v3

    .line 297
    throw p0
.end method

.method public static o(Landroid/content/Context;Lfb/d1;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p1, Lfb/d1;->e:Ljava/util/List;

    .line 8
    .line 9
    invoke-static {v0}, Lfb/g1;->h(Ljava/util/List;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v0, p1, Lfb/d1;->a:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0}, Lfb/g1;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    move-object p0, v1

    .line 29
    :cond_1
    new-instance v1, Lsf/e;

    .line 30
    .line 31
    invoke-direct {v1, p0, p1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Lfb/g1;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 35
    .line 36
    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    sget-object p0, Lfb/g1;->g:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-nez p0, :cond_2

    .line 46
    .line 47
    :goto_0
    return-void

    .line 48
    :cond_2
    new-instance p0, Lfb/e1;

    .line 49
    .line 50
    invoke-direct {p0, v0}, Lfb/e1;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    sget-object p1, Lfb/g1;->i:Ljava/util/concurrent/ExecutorService;

    .line 54
    .line 55
    invoke-interface {p1, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public static p(Landroid/content/Context;)Ljava/io/File;
    .locals 2

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    sget-object v1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 4
    .line 5
    invoke-virtual {v1, p0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->scriptDir(Landroid/content/Context;)Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const-string v1, "Agent/sessions"

    .line 14
    .line 15
    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public static q(Lfb/g1;Ljava/util/List;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    const/4 v0, 0x0

    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    move-object v1, p1

    .line 20
    check-cast v1, Lfb/c;

    .line 21
    .line 22
    iget-object v1, v1, Lfb/c;->a:Ljava/lang/String;

    .line 23
    .line 24
    const-string v2, "user"

    .line 25
    .line 26
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move-object p1, v0

    .line 34
    :goto_0
    check-cast p1, Lfb/c;

    .line 35
    .line 36
    if-eqz p1, :cond_2

    .line 37
    .line 38
    iget-object v0, p1, Lfb/c;->b:Ljava/lang/String;

    .line 39
    .line 40
    :cond_2
    if-nez v0, :cond_3

    .line 41
    .line 42
    const-string v0, ""

    .line 43
    .line 44
    :cond_3
    const-string p0, "\\s+"

    .line 45
    .line 46
    invoke-static {p0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    const-string p1, " "

    .line 54
    .line 55
    invoke-virtual {p0, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    const/16 p1, 0x20

    .line 75
    .line 76
    invoke-static {p1, p0}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eqz p1, :cond_4

    .line 85
    .line 86
    const-string p0, "\u65b0\u5bf9\u8bdd"

    .line 87
    .line 88
    :cond_4
    return-object p0
.end method


# virtual methods
.method public final c(Ljava/lang/String;)Lfb/d1;
    .locals 71

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v8, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v1, "messages"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lorg/json/JSONArray;

    .line 23
    .line 24
    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 25
    .line 26
    .line 27
    :goto_0
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    const/4 v4, 0x0

    .line 32
    :goto_1
    const-string v5, "-"

    .line 33
    .line 34
    const-string v6, "startedAt"

    .line 35
    .line 36
    const-string v7, "createdAt"

    .line 37
    .line 38
    const-string v9, "id"

    .line 39
    .line 40
    const-string v10, "turnId"

    .line 41
    .line 42
    const-string v15, ""

    .line 43
    .line 44
    if-lt v4, v2, :cond_9

    .line 45
    .line 46
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 47
    .line 48
    .line 49
    move-result-wide v1

    .line 50
    const-string v4, "updatedAt"

    .line 51
    .line 52
    invoke-virtual {v0, v4, v1, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 53
    .line 54
    .line 55
    move-result-wide v1

    .line 56
    const-string v14, "resumeState"

    .line 57
    .line 58
    invoke-virtual {v0, v14}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 59
    .line 60
    .line 61
    move-result-object v14

    .line 62
    if-eqz v14, :cond_5

    .line 63
    .line 64
    invoke-virtual {v14, v10, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v17

    .line 68
    const-string v10, "sourceUserMessageId"

    .line 69
    .line 70
    invoke-virtual {v14, v10, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v18

    .line 74
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-static/range {v17 .. v17}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 78
    .line 79
    .line 80
    move-result v10

    .line 81
    if-nez v10, :cond_4

    .line 82
    .line 83
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-static/range {v18 .. v18}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 87
    .line 88
    .line 89
    move-result v10

    .line 90
    if-eqz v10, :cond_1

    .line 91
    .line 92
    goto/16 :goto_4

    .line 93
    .line 94
    :cond_1
    const-string v10, "taskGoal"

    .line 95
    .line 96
    invoke-virtual {v14, v10, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v10

    .line 100
    const-string v13, "workContext"

    .line 101
    .line 102
    invoke-static {v10, v13, v15, v14}, Lj8/b;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v20

    .line 106
    const-string v13, "workspaceCheckpoint"

    .line 107
    .line 108
    invoke-virtual {v14, v13}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 109
    .line 110
    .line 111
    move-result-object v13

    .line 112
    if-eqz v13, :cond_3

    .line 113
    .line 114
    new-instance v11, Ljava/util/LinkedHashMap;

    .line 115
    .line 116
    invoke-direct {v11}, Ljava/util/LinkedHashMap;-><init>()V

    .line 117
    .line 118
    .line 119
    const-string v12, "basePathStates"

    .line 120
    .line 121
    invoke-virtual {v13, v12}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 122
    .line 123
    .line 124
    move-result-object v12

    .line 125
    if-eqz v12, :cond_2

    .line 126
    .line 127
    invoke-virtual {v12}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object v19

    .line 131
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-static/range {v19 .. v19}, Lng/m;->R(Ljava/util/Iterator;)Lng/j;

    .line 135
    .line 136
    .line 137
    move-result-object v19

    .line 138
    check-cast v19, Lng/a;

    .line 139
    .line 140
    invoke-virtual/range {v19 .. v19}, Lng/a;->iterator()Ljava/util/Iterator;

    .line 141
    .line 142
    .line 143
    move-result-object v19

    .line 144
    :goto_2
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result v21

    .line 148
    if-eqz v21, :cond_2

    .line 149
    .line 150
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v21

    .line 154
    move-object/from16 v3, v21

    .line 155
    .line 156
    check-cast v3, Ljava/lang/String;

    .line 157
    .line 158
    move-object/from16 v37, v10

    .line 159
    .line 160
    const-string v10, "missing"

    .line 161
    .line 162
    invoke-virtual {v12, v3, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v10

    .line 166
    invoke-interface {v11, v3, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-object/from16 v10, v37

    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_2
    move-object/from16 v37, v10

    .line 173
    .line 174
    new-instance v21, Lfb/j2;

    .line 175
    .line 176
    const-string v3, "stagingPath"

    .line 177
    .line 178
    invoke-virtual {v13, v3, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    const-string v10, "pluginId"

    .line 183
    .line 184
    invoke-static {v3, v10, v15, v13}, Lj8/b;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v23

    .line 188
    const-string v10, "existed"

    .line 189
    .line 190
    const/4 v12, 0x0

    .line 191
    invoke-virtual {v13, v10, v12}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 192
    .line 193
    .line 194
    move-result v24

    .line 195
    const-string v10, "baseFingerprint"

    .line 196
    .line 197
    invoke-virtual {v13, v10, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v10

    .line 201
    const-string v12, "stageFingerprint"

    .line 202
    .line 203
    invoke-static {v10, v12, v15, v13}, Lj8/b;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v26

    .line 207
    const-string v12, "initialPluginName"

    .line 208
    .line 209
    invoke-virtual {v13, v12, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v28

    .line 213
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    const-string v12, "revision"

    .line 217
    .line 218
    move-object/from16 v22, v3

    .line 219
    .line 220
    const/4 v3, 0x0

    .line 221
    invoke-virtual {v13, v12, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 222
    .line 223
    .line 224
    move-result v29

    .line 225
    const-string v12, "checkedRevision"

    .line 226
    .line 227
    const/4 v3, -0x1

    .line 228
    invoke-virtual {v13, v12, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 229
    .line 230
    .line 231
    move-result v30

    .line 232
    const-string v12, "shownRevision"

    .line 233
    .line 234
    invoke-virtual {v13, v12, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 235
    .line 236
    .line 237
    move-result v31

    .line 238
    const-string v3, "deletePlugin"

    .line 239
    .line 240
    const/4 v12, 0x0

    .line 241
    invoke-virtual {v13, v3, v12}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 242
    .line 243
    .line 244
    move-result v32

    .line 245
    move-object/from16 v25, v10

    .line 246
    .line 247
    move-object/from16 v27, v11

    .line 248
    .line 249
    const-wide/16 v10, 0x0

    .line 250
    .line 251
    invoke-virtual {v13, v4, v10, v11}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 252
    .line 253
    .line 254
    move-result-wide v33

    .line 255
    invoke-direct/range {v21 .. v34}, Lfb/j2;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/lang/String;IIIZJ)V

    .line 256
    .line 257
    .line 258
    goto :goto_3

    .line 259
    :cond_3
    move-object/from16 v37, v10

    .line 260
    .line 261
    const/16 v21, 0x0

    .line 262
    .line 263
    :goto_3
    const-string v3, "autoOpen"

    .line 264
    .line 265
    const/4 v11, 0x1

    .line 266
    invoke-virtual {v14, v3, v11}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 267
    .line 268
    .line 269
    move-result v22

    .line 270
    invoke-virtual {v14, v6, v1, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 271
    .line 272
    .line 273
    move-result-wide v23

    .line 274
    invoke-virtual {v14, v4, v1, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 275
    .line 276
    .line 277
    move-result-wide v25

    .line 278
    new-instance v16, Lfb/c1;

    .line 279
    .line 280
    move-object/from16 v19, v37

    .line 281
    .line 282
    invoke-direct/range {v16 .. v26}, Lfb/c1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfb/j2;ZJJ)V

    .line 283
    .line 284
    .line 285
    goto :goto_5

    .line 286
    :cond_4
    :goto_4
    const/16 v16, 0x0

    .line 287
    .line 288
    :goto_5
    move-object/from16 v19, v16

    .line 289
    .line 290
    goto :goto_6

    .line 291
    :cond_5
    const/16 v19, 0x0

    .line 292
    .line 293
    :goto_6
    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v3

    .line 297
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 298
    .line 299
    .line 300
    move-result v4

    .line 301
    if-eqz v4, :cond_6

    .line 302
    .line 303
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 304
    .line 305
    .line 306
    move-result-object v3

    .line 307
    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v3

    .line 311
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    const/4 v12, 0x0

    .line 315
    invoke-static {v3, v5, v15, v12}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v3

    .line 319
    :cond_6
    const-string v4, "title"

    .line 320
    .line 321
    move-object/from16 v5, p0

    .line 322
    .line 323
    invoke-static {v5, v8}, Lfb/g1;->q(Lfb/g1;Ljava/util/List;)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v6

    .line 327
    invoke-virtual {v0, v4, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v4

    .line 331
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 332
    .line 333
    .line 334
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 335
    .line 336
    .line 337
    move-result-wide v9

    .line 338
    invoke-virtual {v0, v7, v9, v10}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 339
    .line 340
    .line 341
    move-result-wide v6

    .line 342
    const-string v9, "draft"

    .line 343
    .line 344
    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 345
    .line 346
    .line 347
    move-result-object v9

    .line 348
    if-eqz v9, :cond_7

    .line 349
    .line 350
    invoke-static {v9}, Lfb/g1;->d(Lorg/json/JSONObject;)Lfb/y;

    .line 351
    .line 352
    .line 353
    move-result-object v14

    .line 354
    move-object v9, v14

    .line 355
    goto :goto_7

    .line 356
    :cond_7
    const/4 v9, 0x0

    .line 357
    :goto_7
    const-string v10, "targetPluginId"

    .line 358
    .line 359
    invoke-virtual {v0, v10, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v10

    .line 363
    const-string v11, "conversationSummary"

    .line 364
    .line 365
    invoke-static {v10, v11, v15, v0}, Lj8/b;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v11

    .line 369
    const-string v12, "nativeToolHistory"

    .line 370
    .line 371
    invoke-virtual {v0, v12, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v12

    .line 375
    const-string v13, "protocolTranscript"

    .line 376
    .line 377
    invoke-static {v12, v13, v15, v0}, Lj8/b;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v13

    .line 381
    const-string v14, "compactedMessageCount"

    .line 382
    .line 383
    const/4 v15, 0x0

    .line 384
    invoke-virtual {v0, v14, v15}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 385
    .line 386
    .line 387
    move-result v14

    .line 388
    move-object/from16 v16, v3

    .line 389
    .line 390
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 391
    .line 392
    .line 393
    move-result v3

    .line 394
    invoke-static {v14, v15, v3}, Lr9/e0;->r(III)I

    .line 395
    .line 396
    .line 397
    move-result v14

    .line 398
    const-string v3, "pinned"

    .line 399
    .line 400
    invoke-virtual {v0, v3, v15}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 401
    .line 402
    .line 403
    move-result v3

    .line 404
    move/from16 p1, v3

    .line 405
    .line 406
    const-string v3, "locked"

    .line 407
    .line 408
    invoke-virtual {v0, v3, v15}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 409
    .line 410
    .line 411
    move-result v3

    .line 412
    const-string v15, "sortOrder"

    .line 413
    .line 414
    invoke-virtual {v0, v15, v1, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 415
    .line 416
    .line 417
    move-result-wide v17

    .line 418
    const-string v15, "checkpointSeq"

    .line 419
    .line 420
    move-wide/from16 v20, v1

    .line 421
    .line 422
    const-wide/16 v1, 0x0

    .line 423
    .line 424
    invoke-virtual {v0, v15, v1, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 425
    .line 426
    .line 427
    move-result-wide v22

    .line 428
    cmp-long v0, v22, v1

    .line 429
    .line 430
    if-gez v0, :cond_8

    .line 431
    .line 432
    const-wide/16 v35, 0x0

    .line 433
    .line 434
    goto :goto_8

    .line 435
    :cond_8
    move-wide/from16 v35, v22

    .line 436
    .line 437
    :goto_8
    new-instance v1, Lfb/d1;

    .line 438
    .line 439
    move/from16 v15, p1

    .line 440
    .line 441
    move-object/from16 v2, v16

    .line 442
    .line 443
    move/from16 v16, v3

    .line 444
    .line 445
    move-object v3, v4

    .line 446
    move-wide v4, v6

    .line 447
    move-wide/from16 v6, v20

    .line 448
    .line 449
    move-wide/from16 v20, v35

    .line 450
    .line 451
    invoke-direct/range {v1 .. v21}, Lfb/d1;-><init>(Ljava/lang/String;Ljava/lang/String;JJLjava/util/List;Lfb/y;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZZJLfb/c1;J)V

    .line 452
    .line 453
    .line 454
    return-object v1

    .line 455
    :cond_9
    const/4 v11, 0x1

    .line 456
    invoke-virtual {v1, v4}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 457
    .line 458
    .line 459
    move-result-object v3

    .line 460
    if-eqz v3, :cond_1e

    .line 461
    .line 462
    new-instance v48, Ljava/util/ArrayList;

    .line 463
    .line 464
    invoke-direct/range {v48 .. v48}, Ljava/util/ArrayList;-><init>()V

    .line 465
    .line 466
    .line 467
    new-instance v47, Ljava/util/ArrayList;

    .line 468
    .line 469
    invoke-direct/range {v47 .. v47}, Ljava/util/ArrayList;-><init>()V

    .line 470
    .line 471
    .line 472
    const-string v12, "toolEvents"

    .line 473
    .line 474
    invoke-virtual {v3, v12}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 475
    .line 476
    .line 477
    move-result-object v12

    .line 478
    if-eqz v12, :cond_a

    .line 479
    .line 480
    goto :goto_9

    .line 481
    :cond_a
    new-instance v12, Lorg/json/JSONArray;

    .line 482
    .line 483
    invoke-direct {v12}, Lorg/json/JSONArray;-><init>()V

    .line 484
    .line 485
    .line 486
    :goto_9
    invoke-virtual {v12}, Lorg/json/JSONArray;->length()I

    .line 487
    .line 488
    .line 489
    move-result v13

    .line 490
    const/4 v14, 0x0

    .line 491
    :goto_a
    const-string v11, "name"

    .line 492
    .line 493
    move-object/from16 v17, v0

    .line 494
    .line 495
    const-string v0, "diff"

    .line 496
    .line 497
    move-object/from16 v18, v1

    .line 498
    .line 499
    const-string v1, "status"

    .line 500
    .line 501
    move/from16 v19, v2

    .line 502
    .line 503
    const-string v2, "progress"

    .line 504
    .line 505
    move-object/from16 v20, v6

    .line 506
    .line 507
    const-string v6, "interrupted"

    .line 508
    .line 509
    if-lt v14, v13, :cond_18

    .line 510
    .line 511
    const-string v5, "attachments"

    .line 512
    .line 513
    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 514
    .line 515
    .line 516
    move-result-object v5

    .line 517
    if-eqz v5, :cond_b

    .line 518
    .line 519
    goto :goto_b

    .line 520
    :cond_b
    new-instance v5, Lorg/json/JSONArray;

    .line 521
    .line 522
    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    .line 523
    .line 524
    .line 525
    :goto_b
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    .line 526
    .line 527
    .line 528
    move-result v12

    .line 529
    const/4 v13, 0x0

    .line 530
    :goto_c
    if-lt v13, v12, :cond_16

    .line 531
    .line 532
    const-string v5, "complete"

    .line 533
    .line 534
    invoke-virtual {v3, v1, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 535
    .line 536
    .line 537
    move-result-object v1

    .line 538
    invoke-virtual {v3, v2, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 539
    .line 540
    .line 541
    move-result-object v5

    .line 542
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 543
    .line 544
    .line 545
    new-instance v11, Log/d;

    .line 546
    .line 547
    invoke-direct {v11, v5}, Log/d;-><init>(Ljava/lang/CharSequence;)V

    .line 548
    .line 549
    .line 550
    invoke-virtual {v11}, Log/d;->hasNext()Z

    .line 551
    .line 552
    .line 553
    move-result v5

    .line 554
    if-nez v5, :cond_c

    .line 555
    .line 556
    const/4 v5, 0x0

    .line 557
    goto :goto_e

    .line 558
    :cond_c
    invoke-virtual {v11}, Log/d;->next()Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object v5

    .line 562
    :goto_d
    invoke-virtual {v11}, Log/d;->hasNext()Z

    .line 563
    .line 564
    .line 565
    move-result v12

    .line 566
    if-eqz v12, :cond_d

    .line 567
    .line 568
    invoke-virtual {v11}, Log/d;->next()Ljava/lang/Object;

    .line 569
    .line 570
    .line 571
    move-result-object v5

    .line 572
    goto :goto_d

    .line 573
    :cond_d
    :goto_e
    check-cast v5, Ljava/lang/String;

    .line 574
    .line 575
    if-nez v5, :cond_e

    .line 576
    .line 577
    move-object v5, v15

    .line 578
    :cond_e
    const-string v11, "\u7b49\u5f85\u786e\u8ba4"

    .line 579
    .line 580
    const/4 v12, 0x0

    .line 581
    invoke-static {v5, v11, v12}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 582
    .line 583
    .line 584
    move-result v11

    .line 585
    if-nez v11, :cond_10

    .line 586
    .line 587
    const-string v11, "\u6b63\u5728\u63d0\u4ea4\u63d2\u4ef6"

    .line 588
    .line 589
    invoke-static {v5, v11, v12}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 590
    .line 591
    .line 592
    move-result v11

    .line 593
    if-nez v11, :cond_10

    .line 594
    .line 595
    const-string v11, "\u6b63\u5728\u521b\u5efa\u63d2\u4ef6"

    .line 596
    .line 597
    invoke-static {v5, v11, v12}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 598
    .line 599
    .line 600
    move-result v11

    .line 601
    if-nez v11, :cond_10

    .line 602
    .line 603
    const-string v11, "\u6b63\u5728\u5199\u5165\u63d2\u4ef6"

    .line 604
    .line 605
    invoke-static {v5, v11, v12}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 606
    .line 607
    .line 608
    move-result v11

    .line 609
    if-nez v11, :cond_10

    .line 610
    .line 611
    const-string v11, "\u6b63\u5728\u5220\u9664\u63d2\u4ef6"

    .line 612
    .line 613
    invoke-static {v5, v11, v12}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 614
    .line 615
    .line 616
    move-result v5

    .line 617
    if-eqz v5, :cond_f

    .line 618
    .line 619
    goto :goto_f

    .line 620
    :cond_f
    const/4 v13, 0x0

    .line 621
    goto :goto_10

    .line 622
    :cond_10
    :goto_f
    const/4 v13, 0x1

    .line 623
    :goto_10
    const-string v5, "streaming"

    .line 624
    .line 625
    invoke-static {v1, v5}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 626
    .line 627
    .line 628
    move-result v5

    .line 629
    if-eqz v5, :cond_11

    .line 630
    .line 631
    :goto_11
    move-object/from16 v52, v6

    .line 632
    .line 633
    goto :goto_12

    .line 634
    :cond_11
    if-eqz v13, :cond_12

    .line 635
    .line 636
    goto :goto_11

    .line 637
    :cond_12
    move-object/from16 v52, v1

    .line 638
    .line 639
    :goto_12
    const-string v1, "role"

    .line 640
    .line 641
    const-string v5, "user"

    .line 642
    .line 643
    invoke-virtual {v3, v1, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 644
    .line 645
    .line 646
    move-result-object v6

    .line 647
    const-string v11, "content"

    .line 648
    .line 649
    invoke-static {v6, v11, v15, v3}, Lj8/b;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 650
    .line 651
    .line 652
    move-result-object v39

    .line 653
    invoke-virtual {v3, v9, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 654
    .line 655
    .line 656
    move-result-object v9

    .line 657
    invoke-static {v9}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 658
    .line 659
    .line 660
    move-result v12

    .line 661
    if-eqz v12, :cond_13

    .line 662
    .line 663
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 664
    .line 665
    .line 666
    move-result-object v9

    .line 667
    invoke-virtual {v9}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 668
    .line 669
    .line 670
    move-result-object v9

    .line 671
    :cond_13
    invoke-static {v9, v10, v15, v3}, Lj8/b;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 672
    .line 673
    .line 674
    move-result-object v41

    .line 675
    const-string v10, "parentMessageId"

    .line 676
    .line 677
    invoke-virtual {v3, v10, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 678
    .line 679
    .line 680
    move-result-object v42

    .line 681
    invoke-virtual/range {v42 .. v42}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 682
    .line 683
    .line 684
    const-string v10, "phase"

    .line 685
    .line 686
    invoke-virtual {v3, v1, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 687
    .line 688
    .line 689
    move-result-object v12

    .line 690
    invoke-virtual {v3, v10, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 691
    .line 692
    .line 693
    move-result-object v43

    .line 694
    invoke-virtual/range {v43 .. v43}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 695
    .line 696
    .line 697
    invoke-virtual {v3, v2, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 698
    .line 699
    .line 700
    move-result-object v2

    .line 701
    const-string v10, "reasoning"

    .line 702
    .line 703
    invoke-static {v2, v10, v15, v3}, Lj8/b;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 704
    .line 705
    .line 706
    move-result-object v45

    .line 707
    invoke-virtual {v3, v0, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 708
    .line 709
    .line 710
    move-result-object v46

    .line 711
    invoke-virtual/range {v46 .. v46}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 712
    .line 713
    .line 714
    const-string v0, "quotedMessage"

    .line 715
    .line 716
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 717
    .line 718
    .line 719
    move-result-object v0

    .line 720
    if-eqz v0, :cond_14

    .line 721
    .line 722
    new-instance v10, Lfb/a1;

    .line 723
    .line 724
    invoke-virtual {v0, v1, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 725
    .line 726
    .line 727
    move-result-object v1

    .line 728
    invoke-static {v1, v11, v15, v0}, Lj8/b;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 729
    .line 730
    .line 731
    move-result-object v5

    .line 732
    const-wide/16 v11, 0x0

    .line 733
    .line 734
    invoke-virtual {v0, v7, v11, v12}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 735
    .line 736
    .line 737
    move-result-wide v13

    .line 738
    invoke-direct {v10, v13, v14, v1, v5}, Lfb/a1;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 739
    .line 740
    .line 741
    move-object/from16 v49, v10

    .line 742
    .line 743
    goto :goto_13

    .line 744
    :cond_14
    const/16 v49, 0x0

    .line 745
    .line 746
    :goto_13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 747
    .line 748
    .line 749
    move-result-wide v0

    .line 750
    invoke-virtual {v3, v7, v0, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 751
    .line 752
    .line 753
    move-result-wide v50

    .line 754
    invoke-virtual/range {v52 .. v52}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 755
    .line 756
    .line 757
    const-string v0, "draftSnapshot"

    .line 758
    .line 759
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 760
    .line 761
    .line 762
    move-result-object v0

    .line 763
    if-eqz v0, :cond_15

    .line 764
    .line 765
    invoke-static {v0}, Lfb/g1;->d(Lorg/json/JSONObject;)Lfb/y;

    .line 766
    .line 767
    .line 768
    move-result-object v14

    .line 769
    move-object/from16 v53, v14

    .line 770
    .line 771
    goto :goto_14

    .line 772
    :cond_15
    const/16 v53, 0x0

    .line 773
    .line 774
    :goto_14
    const-string v0, "clearsDraft"

    .line 775
    .line 776
    const/4 v12, 0x0

    .line 777
    invoke-virtual {v3, v0, v12}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 778
    .line 779
    .line 780
    move-result v54

    .line 781
    const-string v0, "streamId"

    .line 782
    .line 783
    invoke-virtual {v3, v0, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 784
    .line 785
    .line 786
    move-result-object v55

    .line 787
    invoke-virtual/range {v55 .. v55}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 788
    .line 789
    .line 790
    const-string v0, "completedAt"

    .line 791
    .line 792
    const-wide/16 v10, 0x0

    .line 793
    .line 794
    invoke-virtual {v3, v0, v10, v11}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 795
    .line 796
    .line 797
    move-result-wide v56

    .line 798
    new-instance v37, Lfb/c;

    .line 799
    .line 800
    move-object/from16 v44, v2

    .line 801
    .line 802
    move-object/from16 v38, v6

    .line 803
    .line 804
    move-object/from16 v40, v9

    .line 805
    .line 806
    invoke-direct/range {v37 .. v57}, Lfb/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lfb/a1;JLjava/lang/String;Lfb/y;ZLjava/lang/String;J)V

    .line 807
    .line 808
    .line 809
    move-object/from16 v0, v37

    .line 810
    .line 811
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 812
    .line 813
    .line 814
    :goto_15
    move/from16 v23, v4

    .line 815
    .line 816
    move-object/from16 v30, v8

    .line 817
    .line 818
    const/4 v8, 0x0

    .line 819
    goto/16 :goto_1a

    .line 820
    .line 821
    :cond_16
    move-object/from16 v21, v3

    .line 822
    .line 823
    move-object/from16 v22, v7

    .line 824
    .line 825
    move-object/from16 v3, v47

    .line 826
    .line 827
    move-object/from16 v14, v48

    .line 828
    .line 829
    invoke-virtual {v5, v13}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 830
    .line 831
    .line 832
    move-result-object v7

    .line 833
    if-eqz v7, :cond_17

    .line 834
    .line 835
    new-instance v23, Lfb/a;

    .line 836
    .line 837
    move-object/from16 v20, v5

    .line 838
    .line 839
    invoke-virtual {v7, v11, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 840
    .line 841
    .line 842
    move-result-object v5

    .line 843
    move-object/from16 v30, v8

    .line 844
    .line 845
    const-string v8, "path"

    .line 846
    .line 847
    invoke-static {v5, v8, v15, v7}, Lj8/b;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 848
    .line 849
    .line 850
    move-result-object v25

    .line 851
    const-string v8, "mimeType"

    .line 852
    .line 853
    move-object/from16 v24, v5

    .line 854
    .line 855
    const-string v5, "application/octet-stream"

    .line 856
    .line 857
    invoke-virtual {v7, v8, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 858
    .line 859
    .line 860
    move-result-object v26

    .line 861
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 862
    .line 863
    .line 864
    const-string v5, "size"

    .line 865
    .line 866
    move v8, v12

    .line 867
    move/from16 v31, v13

    .line 868
    .line 869
    const-wide/16 v12, 0x0

    .line 870
    .line 871
    invoke-virtual {v7, v5, v12, v13}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 872
    .line 873
    .line 874
    move-result-wide v28

    .line 875
    const-string v5, "sourceUri"

    .line 876
    .line 877
    invoke-virtual {v7, v5, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 878
    .line 879
    .line 880
    move-result-object v27

    .line 881
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 882
    .line 883
    .line 884
    invoke-direct/range {v23 .. v29}, Lfb/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 885
    .line 886
    .line 887
    move-object/from16 v5, v23

    .line 888
    .line 889
    invoke-virtual {v14, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 890
    .line 891
    .line 892
    goto :goto_16

    .line 893
    :cond_17
    move-object/from16 v20, v5

    .line 894
    .line 895
    move-object/from16 v30, v8

    .line 896
    .line 897
    move v8, v12

    .line 898
    move/from16 v31, v13

    .line 899
    .line 900
    :goto_16
    add-int/lit8 v13, v31, 0x1

    .line 901
    .line 902
    move-object/from16 v47, v3

    .line 903
    .line 904
    move v12, v8

    .line 905
    move-object/from16 v48, v14

    .line 906
    .line 907
    move-object/from16 v5, v20

    .line 908
    .line 909
    move-object/from16 v3, v21

    .line 910
    .line 911
    move-object/from16 v7, v22

    .line 912
    .line 913
    move-object/from16 v8, v30

    .line 914
    .line 915
    goto/16 :goto_c

    .line 916
    .line 917
    :cond_18
    move-object/from16 v21, v3

    .line 918
    .line 919
    move-object/from16 v22, v7

    .line 920
    .line 921
    move-object/from16 v30, v8

    .line 922
    .line 923
    move-object/from16 v3, v47

    .line 924
    .line 925
    invoke-virtual {v12, v14}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 926
    .line 927
    .line 928
    move-result-object v7

    .line 929
    if-eqz v7, :cond_1d

    .line 930
    .line 931
    const-string v8, "success"

    .line 932
    .line 933
    invoke-virtual {v7, v1, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 934
    .line 935
    .line 936
    move-result-object v1

    .line 937
    const-string v8, "running"

    .line 938
    .line 939
    invoke-static {v1, v8}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 940
    .line 941
    .line 942
    move-result v8

    .line 943
    if-nez v8, :cond_19

    .line 944
    .line 945
    const-string v8, "queued"

    .line 946
    .line 947
    invoke-static {v1, v8}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 948
    .line 949
    .line 950
    move-result v8

    .line 951
    if-eqz v8, :cond_1a

    .line 952
    .line 953
    :cond_19
    const/4 v1, 0x0

    .line 954
    :cond_1a
    if-eqz v1, :cond_1b

    .line 955
    .line 956
    goto :goto_17

    .line 957
    :cond_1b
    move-object v1, v6

    .line 958
    :goto_17
    new-instance v49, Lfb/q1;

    .line 959
    .line 960
    const-string v8, "legacy-"

    .line 961
    .line 962
    invoke-static {v4, v8, v5, v14}, Lp/a;->j(ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 963
    .line 964
    .line 965
    move-result-object v8

    .line 966
    invoke-virtual {v7, v9, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 967
    .line 968
    .line 969
    move-result-object v8

    .line 970
    move/from16 v23, v4

    .line 971
    .line 972
    const-string v4, "kind"

    .line 973
    .line 974
    move-object/from16 v24, v5

    .line 975
    .line 976
    const-string v5, "tool"

    .line 977
    .line 978
    invoke-static {v8, v4, v5, v7}, Lj8/b;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 979
    .line 980
    .line 981
    move-result-object v51

    .line 982
    const-string v4, "\u5de5\u5177\u8c03\u7528"

    .line 983
    .line 984
    invoke-virtual {v7, v11, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 985
    .line 986
    .line 987
    move-result-object v4

    .line 988
    const-string v5, "arguments"

    .line 989
    .line 990
    invoke-static {v4, v5, v15, v7}, Lj8/b;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 991
    .line 992
    .line 993
    move-result-object v53

    .line 994
    const-string v5, "result"

    .line 995
    .line 996
    invoke-virtual {v7, v5, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 997
    .line 998
    .line 999
    move-result-object v11

    .line 1000
    invoke-static {v11, v0, v15, v7}, Lj8/b;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v55

    .line 1004
    move-object/from16 v50, v8

    .line 1005
    .line 1006
    move-object/from16 v0, v20

    .line 1007
    .line 1008
    move-object/from16 v20, v9

    .line 1009
    .line 1010
    const-wide/16 v8, 0x0

    .line 1011
    .line 1012
    invoke-virtual {v7, v0, v8, v9}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 1013
    .line 1014
    .line 1015
    move-result-wide v57

    .line 1016
    move-object/from16 v25, v0

    .line 1017
    .line 1018
    const-string v0, "finishedAt"

    .line 1019
    .line 1020
    invoke-virtual {v7, v0, v8, v9}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 1021
    .line 1022
    .line 1023
    move-result-wide v59

    .line 1024
    invoke-virtual {v1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1025
    .line 1026
    .line 1027
    move-result v0

    .line 1028
    if-eqz v0, :cond_1c

    .line 1029
    .line 1030
    const-string v0, "\u4efb\u52a1\u610f\u5916\u4e2d\u65ad"

    .line 1031
    .line 1032
    goto :goto_18

    .line 1033
    :cond_1c
    invoke-virtual {v7, v2, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v0

    .line 1037
    :goto_18
    invoke-static {v0, v10, v15, v7}, Lj8/b;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v62

    .line 1041
    const-string v2, "toolCallId"

    .line 1042
    .line 1043
    invoke-virtual {v7, v2, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v2

    .line 1047
    const-string v6, "protocolName"

    .line 1048
    .line 1049
    invoke-static {v2, v6, v15, v7}, Lj8/b;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v64

    .line 1053
    const-string v6, "providerMetadata"

    .line 1054
    .line 1055
    invoke-virtual {v7, v6, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v6

    .line 1059
    const-string v8, "parentAssistantMessageId"

    .line 1060
    .line 1061
    invoke-static {v6, v8, v15, v7}, Lj8/b;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v66

    .line 1065
    const-string v8, "resultHandle"

    .line 1066
    .line 1067
    invoke-virtual {v7, v8, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v67

    .line 1071
    invoke-virtual/range {v67 .. v67}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1072
    .line 1073
    .line 1074
    invoke-virtual {v7, v5, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v5

    .line 1078
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 1079
    .line 1080
    .line 1081
    move-result v5

    .line 1082
    const-string v8, "resultLength"

    .line 1083
    .line 1084
    invoke-virtual {v7, v8, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 1085
    .line 1086
    .line 1087
    move-result v68

    .line 1088
    const-string v5, "truncated"

    .line 1089
    .line 1090
    const/4 v8, 0x0

    .line 1091
    invoke-virtual {v7, v5, v8}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 1092
    .line 1093
    .line 1094
    move-result v69

    .line 1095
    const-string v5, "nextOffset"

    .line 1096
    .line 1097
    invoke-virtual {v7, v5, v8}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 1098
    .line 1099
    .line 1100
    move-result v70

    .line 1101
    move-object/from16 v61, v0

    .line 1102
    .line 1103
    move-object/from16 v56, v1

    .line 1104
    .line 1105
    move-object/from16 v63, v2

    .line 1106
    .line 1107
    move-object/from16 v52, v4

    .line 1108
    .line 1109
    move-object/from16 v65, v6

    .line 1110
    .line 1111
    move-object/from16 v54, v11

    .line 1112
    .line 1113
    invoke-direct/range {v49 .. v70}, Lfb/q1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZI)V

    .line 1114
    .line 1115
    .line 1116
    move-object/from16 v0, v49

    .line 1117
    .line 1118
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1119
    .line 1120
    .line 1121
    goto :goto_19

    .line 1122
    :cond_1d
    move/from16 v23, v4

    .line 1123
    .line 1124
    move-object/from16 v24, v5

    .line 1125
    .line 1126
    move-object/from16 v25, v20

    .line 1127
    .line 1128
    const/4 v8, 0x0

    .line 1129
    move-object/from16 v20, v9

    .line 1130
    .line 1131
    :goto_19
    add-int/lit8 v14, v14, 0x1

    .line 1132
    .line 1133
    move-object/from16 v47, v3

    .line 1134
    .line 1135
    move-object/from16 v0, v17

    .line 1136
    .line 1137
    move-object/from16 v1, v18

    .line 1138
    .line 1139
    move/from16 v2, v19

    .line 1140
    .line 1141
    move-object/from16 v9, v20

    .line 1142
    .line 1143
    move-object/from16 v3, v21

    .line 1144
    .line 1145
    move-object/from16 v7, v22

    .line 1146
    .line 1147
    move/from16 v4, v23

    .line 1148
    .line 1149
    move-object/from16 v5, v24

    .line 1150
    .line 1151
    move-object/from16 v6, v25

    .line 1152
    .line 1153
    move-object/from16 v8, v30

    .line 1154
    .line 1155
    goto/16 :goto_a

    .line 1156
    .line 1157
    :cond_1e
    move-object/from16 v17, v0

    .line 1158
    .line 1159
    move-object/from16 v18, v1

    .line 1160
    .line 1161
    move/from16 v19, v2

    .line 1162
    .line 1163
    goto/16 :goto_15

    .line 1164
    .line 1165
    :goto_1a
    add-int/lit8 v4, v23, 0x1

    .line 1166
    .line 1167
    move-object/from16 v0, v17

    .line 1168
    .line 1169
    move-object/from16 v1, v18

    .line 1170
    .line 1171
    move/from16 v2, v19

    .line 1172
    .line 1173
    move-object/from16 v8, v30

    .line 1174
    .line 1175
    goto/16 :goto_1
.end method
