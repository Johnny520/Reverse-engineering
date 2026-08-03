.class public final Lha/k;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final k:Ljava/lang/Object;


# instance fields
.field public final a:Lab/b;

.field public final b:Landroid/content/SharedPreferences;

.field public final c:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/util/LinkedHashMap;

.field public final g:Ljava/util/LinkedHashSet;

.field public final h:Ljava/util/concurrent/ConcurrentHashMap;

.field public i:Z

.field public final j:Lb9/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lha/k;->k:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lr8/g;Lab/b;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lha/k;->a:Lab/b;

    .line 8
    .line 9
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 10
    .line 11
    const-string p2, "Hchat_moments_auto_like_config"

    .line 12
    .line 13
    invoke-static {p1, p2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lha/k;->b:Landroid/content/SharedPreferences;

    .line 18
    .line 19
    new-instance p2, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 20
    .line 21
    new-instance v0, Lc9/q;

    .line 22
    .line 23
    const/16 v1, 0xc

    .line 24
    .line 25
    invoke-direct {v0, v1}, Lc9/q;-><init>(I)V

    .line 26
    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-direct {p2, v1, v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->setRemoveOnCancelPolicy(Z)V

    .line 33
    .line 34
    .line 35
    iput-object p2, p0, Lha/k;->c:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 36
    .line 37
    new-instance p2, Ljava/lang/Object;

    .line 38
    .line 39
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object p2, p0, Lha/k;->d:Ljava/lang/Object;

    .line 43
    .line 44
    new-instance p2, Ljava/lang/Object;

    .line 45
    .line 46
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object p2, p0, Lha/k;->e:Ljava/lang/Object;

    .line 50
    .line 51
    new-instance p2, Ljava/util/LinkedHashMap;

    .line 52
    .line 53
    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object p2, p0, Lha/k;->f:Ljava/util/LinkedHashMap;

    .line 57
    .line 58
    new-instance p2, Ljava/util/LinkedHashSet;

    .line 59
    .line 60
    invoke-direct {p2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object p2, p0, Lha/k;->g:Ljava/util/LinkedHashSet;

    .line 64
    .line 65
    new-instance p2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 66
    .line 67
    invoke-direct {p2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 68
    .line 69
    .line 70
    iput-object p2, p0, Lha/k;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 71
    .line 72
    const-string p2, "enable"

    .line 73
    .line 74
    const/4 v0, 0x0

    .line 75
    invoke-interface {p1, p2, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    iput-boolean p1, p0, Lha/k;->i:Z

    .line 80
    .line 81
    new-instance p1, Lb9/b;

    .line 82
    .line 83
    const/4 p2, 0x4

    .line 84
    invoke-direct {p1, p0, p2}, Lb9/b;-><init>(Ljava/lang/Object;I)V

    .line 85
    .line 86
    .line 87
    iput-object p1, p0, Lha/k;->j:Lb9/b;

    .line 88
    .line 89
    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Lg8/i;->n(Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatContact;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatContact;->displayName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    move-object v0, p0

    .line 26
    :cond_0
    if-eqz v0, :cond_1

    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_1
    return-object p0
.end method


# virtual methods
.method public final b(Ljava/lang/String;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lha/k;->b:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    const-string v1, "log_enable"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 14
    .line 15
    const-string v1, "MM-dd HH:mm:ss"

    .line 16
    .line 17
    sget-object v2, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 18
    .line 19
    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 20
    .line 21
    .line 22
    new-instance v1, Ljava/util/Date;

    .line 23
    .line 24
    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v1, "  "

    .line 32
    .line 33
    invoke-static {v0, v1, p1}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    sget-object v1, Lha/k;->k:Ljava/lang/Object;

    .line 38
    .line 39
    monitor-enter v1

    .line 40
    :try_start_0
    invoke-static {p1}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iget-object v0, p0, Lha/k;->b:Landroid/content/SharedPreferences;

    .line 45
    .line 46
    const-string v2, "logs"

    .line 47
    .line 48
    const-string v3, ""

    .line 49
    .line 50
    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-nez v0, :cond_1

    .line 55
    .line 56
    const-string v0, ""

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :catchall_0
    move-exception v0

    .line 60
    move-object p1, v0

    .line 61
    goto :goto_1

    .line 62
    :cond_1
    :goto_0
    new-instance v2, Ldg/n;

    .line 63
    .line 64
    const/4 v3, 0x4

    .line 65
    invoke-direct {v2, v0, v3}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 66
    .line 67
    .line 68
    new-instance v0, Lg0/o;

    .line 69
    .line 70
    const/4 v3, 0x6

    .line 71
    invoke-direct {v0, v3}, Lg0/o;-><init>(I)V

    .line 72
    .line 73
    .line 74
    new-instance v3, Lng/i;

    .line 75
    .line 76
    const/4 v4, 0x1

    .line 77
    invoke-direct {v3, v2, v4, v0}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 78
    .line 79
    .line 80
    invoke-static {v3}, Lng/m;->b0(Lng/j;)Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-static {p1, v0}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    const/16 v0, 0xc8

    .line 89
    .line 90
    invoke-static {v0, p1}, Ltf/m;->L1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    const-string v3, "\n"

    .line 95
    .line 96
    const/4 v6, 0x0

    .line 97
    const/16 v7, 0x3e

    .line 98
    .line 99
    const/4 v4, 0x0

    .line 100
    const/4 v5, 0x0

    .line 101
    invoke-static/range {v2 .. v7}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    iget-object v0, p0, Lha/k;->b:Landroid/content/SharedPreferences;

    .line 106
    .line 107
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    const-string v2, "logs"

    .line 112
    .line 113
    invoke-interface {v0, v2, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 118
    .line 119
    .line 120
    monitor-exit v1

    .line 121
    return-void

    .line 122
    :goto_1
    monitor-exit v1

    .line 123
    throw p1
.end method

.method public final c()V
    .locals 6

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object v2, p0, Lha/k;->f:Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    check-cast v3, Ljava/lang/Iterable;

    .line 15
    .line 16
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_2

    .line 25
    .line 26
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    check-cast v4, Ljava/util/Map$Entry;

    .line 31
    .line 32
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    check-cast v4, Lha/j;

    .line 40
    .line 41
    iget-wide v4, v4, Lha/j;->a:J

    .line 42
    .line 43
    cmp-long v4, v4, v0

    .line 44
    .line 45
    const/4 v5, 0x1

    .line 46
    if-gtz v4, :cond_1

    .line 47
    .line 48
    move v4, v5

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    const/4 v4, 0x0

    .line 51
    :goto_1
    if-ne v4, v5, :cond_0

    .line 52
    .line 53
    invoke-interface {v3}, Ljava/util/Iterator;->remove()V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    :goto_2
    invoke-virtual {v2}, Ljava/util/AbstractMap;->size()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    const/16 v1, 0x1000

    .line 62
    .line 63
    if-le v0, v1, :cond_3

    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    check-cast v0, Ljava/lang/Iterable;

    .line 73
    .line 74
    invoke-static {v0}, Ltf/m;->s1(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, Ljava/util/Map$Entry;

    .line 79
    .line 80
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {v2, v0}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_3
    return-void
.end method

.method public final d(Ljava/lang/String;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lha/k;->e:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Ljava/text/SimpleDateFormat;

    .line 5
    .line 6
    const-string v2, "yyyy-MM-dd"

    .line 7
    .line 8
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 9
    .line 10
    invoke-direct {v1, v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 11
    .line 12
    .line 13
    new-instance v2, Ljava/util/Date;

    .line 14
    .line 15
    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget-object v2, p0, Lha/k;->b:Landroid/content/SharedPreferences;

    .line 26
    .line 27
    const-string v3, "daily_like_date"

    .line 28
    .line 29
    const-string v4, ""

    .line 30
    .line 31
    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-static {v2, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    :try_start_1
    new-instance v2, Lorg/json/JSONObject;

    .line 42
    .line 43
    iget-object v3, p0, Lha/k;->b:Landroid/content/SharedPreferences;

    .line 44
    .line 45
    const-string v4, "daily_like_counts"

    .line 46
    .line 47
    const-string v5, "{}"

    .line 48
    .line 49
    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    if-nez v3, :cond_0

    .line 54
    .line 55
    const-string v3, ""

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :catchall_0
    move-exception v2

    .line 59
    goto :goto_1

    .line 60
    :cond_0
    :goto_0
    invoke-direct {v2, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :goto_1
    :try_start_2
    new-instance v3, Lsf/f;

    .line 65
    .line 66
    invoke-direct {v3, v2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    move-object v2, v3

    .line 70
    :goto_2
    invoke-static {v2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    if-nez v3, :cond_1

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_1
    new-instance v2, Lorg/json/JSONObject;

    .line 78
    .line 79
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 80
    .line 81
    .line 82
    :goto_3
    check-cast v2, Lorg/json/JSONObject;

    .line 83
    .line 84
    goto :goto_4

    .line 85
    :catchall_1
    move-exception p1

    .line 86
    goto :goto_6

    .line 87
    :cond_2
    new-instance v2, Lorg/json/JSONObject;

    .line 88
    .line 89
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 90
    .line 91
    .line 92
    :goto_4
    const/4 v3, 0x0

    .line 93
    invoke-virtual {v2, p1, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    if-gez v4, :cond_3

    .line 98
    .line 99
    goto :goto_5

    .line 100
    :cond_3
    move v3, v4

    .line 101
    :goto_5
    add-int/lit8 v3, v3, 0x1

    .line 102
    .line 103
    invoke-virtual {v2, p1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 104
    .line 105
    .line 106
    iget-object p1, p0, Lha/k;->b:Landroid/content/SharedPreferences;

    .line 107
    .line 108
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    const-string v3, "daily_like_date"

    .line 113
    .line 114
    invoke-interface {p1, v3, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    const-string v1, "daily_like_counts"

    .line 119
    .line 120
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-interface {p1, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 129
    .line 130
    .line 131
    monitor-exit v0

    .line 132
    return-void

    .line 133
    :goto_6
    monitor-exit v0

    .line 134
    throw p1
.end method

.method public final e(Lha/c0;)Ljava/lang/String;
    .locals 11

    .line 1
    iget-object v0, p0, Lha/k;->b:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    const-string v1, "enable"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string p1, "\u529f\u80fd\u5df2\u5173\u95ed"

    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->account()Lg8/a;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0}, Lg8/a;->c()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move-object v0, v1

    .line 28
    :goto_0
    if-nez v0, :cond_2

    .line 29
    .line 30
    const-string v0, ""

    .line 31
    .line 32
    :cond_2
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    const/4 v4, 0x1

    .line 37
    if-nez v3, :cond_3

    .line 38
    .line 39
    iget-object v3, p1, Lha/c0;->c:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    move v0, v4

    .line 48
    goto :goto_1

    .line 49
    :cond_3
    move v0, v2

    .line 50
    :goto_1
    if-eqz v0, :cond_4

    .line 51
    .line 52
    iget-object v3, p0, Lha/k;->b:Landroid/content/SharedPreferences;

    .line 53
    .line 54
    const-string v5, "like_self"

    .line 55
    .line 56
    invoke-interface {v3, v5, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-nez v3, :cond_4

    .line 61
    .line 62
    const-string p1, "\u672a\u5f00\u542f\u70b9\u8d5e\u81ea\u5df1\u7684\u670b\u53cb\u5708"

    .line 63
    .line 64
    return-object p1

    .line 65
    :cond_4
    iget-object v3, p0, Lha/k;->b:Landroid/content/SharedPreferences;

    .line 66
    .line 67
    const-string v5, "list_mode"

    .line 68
    .line 69
    invoke-interface {v3, v5, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    iget-object v5, p0, Lha/k;->b:Landroid/content/SharedPreferences;

    .line 74
    .line 75
    if-ne v3, v4, :cond_5

    .line 76
    .line 77
    const-string v6, "blacklist"

    .line 78
    .line 79
    const-string v7, ""

    .line 80
    .line 81
    invoke-interface {v5, v6, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    invoke-static {v5}, Lr9/e0;->S(Ljava/lang/String;)Ljava/util/Set;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    goto :goto_2

    .line 90
    :cond_5
    const-string v6, "whitelist"

    .line 91
    .line 92
    const-string v7, ""

    .line 93
    .line 94
    invoke-interface {v5, v6, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    invoke-static {v5}, Lr9/e0;->S(Ljava/lang/String;)Ljava/util/Set;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    :goto_2
    if-nez v0, :cond_6

    .line 103
    .line 104
    if-nez v3, :cond_6

    .line 105
    .line 106
    iget-object v6, p1, Lha/c0;->c:Ljava/lang/String;

    .line 107
    .line 108
    invoke-interface {v5, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    if-nez v6, :cond_6

    .line 113
    .line 114
    const-string p1, "\u4e0d\u5728\u767d\u540d\u5355"

    .line 115
    .line 116
    return-object p1

    .line 117
    :cond_6
    if-nez v0, :cond_7

    .line 118
    .line 119
    if-ne v3, v4, :cond_7

    .line 120
    .line 121
    iget-object v0, p1, Lha/c0;->c:Ljava/lang/String;

    .line 122
    .line 123
    invoke-interface {v5, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-eqz v0, :cond_7

    .line 128
    .line 129
    const-string p1, "\u547d\u4e2d\u9ed1\u540d\u5355"

    .line 130
    .line 131
    return-object p1

    .line 132
    :cond_7
    iget-object v0, p0, Lha/k;->b:Landroid/content/SharedPreferences;

    .line 133
    .line 134
    const-string v3, "daily_like_limit"

    .line 135
    .line 136
    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-gez v0, :cond_8

    .line 141
    .line 142
    move v0, v2

    .line 143
    :cond_8
    if-lez v0, :cond_d

    .line 144
    .line 145
    iget-object v3, p1, Lha/c0;->c:Ljava/lang/String;

    .line 146
    .line 147
    iget-object v5, p0, Lha/k;->e:Ljava/lang/Object;

    .line 148
    .line 149
    monitor-enter v5

    .line 150
    :try_start_0
    new-instance v6, Ljava/text/SimpleDateFormat;

    .line 151
    .line 152
    const-string v7, "yyyy-MM-dd"

    .line 153
    .line 154
    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 155
    .line 156
    invoke-direct {v6, v7, v8}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 157
    .line 158
    .line 159
    new-instance v7, Ljava/util/Date;

    .line 160
    .line 161
    invoke-direct {v7}, Ljava/util/Date;-><init>()V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v6, v7}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    iget-object v7, p0, Lha/k;->b:Landroid/content/SharedPreferences;

    .line 172
    .line 173
    const-string v8, "daily_like_date"

    .line 174
    .line 175
    const-string v9, ""

    .line 176
    .line 177
    invoke-interface {v7, v8, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v7

    .line 181
    invoke-static {v7, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v7

    .line 185
    if-nez v7, :cond_9

    .line 186
    .line 187
    iget-object v3, p0, Lha/k;->b:Landroid/content/SharedPreferences;

    .line 188
    .line 189
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    const-string v7, "daily_like_date"

    .line 194
    .line 195
    invoke-interface {v3, v7, v6}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    const-string v6, "daily_like_counts"

    .line 200
    .line 201
    const-string v7, "{}"

    .line 202
    .line 203
    invoke-interface {v3, v6, v7}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 208
    .line 209
    .line 210
    :goto_3
    move v3, v2

    .line 211
    goto :goto_8

    .line 212
    :cond_9
    :try_start_1
    new-instance v6, Lorg/json/JSONObject;

    .line 213
    .line 214
    iget-object v7, p0, Lha/k;->b:Landroid/content/SharedPreferences;

    .line 215
    .line 216
    const-string v8, "daily_like_counts"

    .line 217
    .line 218
    const-string v9, "{}"

    .line 219
    .line 220
    invoke-interface {v7, v8, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v7

    .line 224
    if-nez v7, :cond_a

    .line 225
    .line 226
    const-string v7, ""

    .line 227
    .line 228
    goto :goto_4

    .line 229
    :catchall_0
    move-exception v6

    .line 230
    goto :goto_5

    .line 231
    :cond_a
    :goto_4
    invoke-direct {v6, v7}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 232
    .line 233
    .line 234
    goto :goto_6

    .line 235
    :goto_5
    :try_start_2
    new-instance v7, Lsf/f;

    .line 236
    .line 237
    invoke-direct {v7, v6}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 238
    .line 239
    .line 240
    move-object v6, v7

    .line 241
    :goto_6
    invoke-static {v6}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 242
    .line 243
    .line 244
    move-result-object v7

    .line 245
    if-nez v7, :cond_b

    .line 246
    .line 247
    goto :goto_7

    .line 248
    :cond_b
    new-instance v6, Lorg/json/JSONObject;

    .line 249
    .line 250
    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 251
    .line 252
    .line 253
    :goto_7
    check-cast v6, Lorg/json/JSONObject;

    .line 254
    .line 255
    invoke-virtual {v6, v3, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 256
    .line 257
    .line 258
    move-result v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 259
    if-gez v3, :cond_c

    .line 260
    .line 261
    goto :goto_3

    .line 262
    :cond_c
    :goto_8
    monitor-exit v5

    .line 263
    if-lt v3, v0, :cond_d

    .line 264
    .line 265
    const-string p1, "\u5df2\u8fbe\u5230\u540c\u4e00\u4eba\u5f53\u5929\u70b9\u8d5e\u4e0a\u9650"

    .line 266
    .line 267
    return-object p1

    .line 268
    :catchall_1
    move-exception p1

    .line 269
    monitor-exit v5

    .line 270
    throw p1

    .line 271
    :cond_d
    iget-object v0, p0, Lha/k;->b:Landroid/content/SharedPreferences;

    .line 272
    .line 273
    const-string v3, "time_window_enable"

    .line 274
    .line 275
    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 276
    .line 277
    .line 278
    move-result v0

    .line 279
    if-eqz v0, :cond_10

    .line 280
    .line 281
    iget-object v0, p0, Lha/k;->b:Landroid/content/SharedPreferences;

    .line 282
    .line 283
    const-string v3, "start_time"

    .line 284
    .line 285
    const-string v5, "08:00:00"

    .line 286
    .line 287
    invoke-interface {v0, v3, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    if-nez v0, :cond_e

    .line 292
    .line 293
    const-string v0, ""

    .line 294
    .line 295
    :cond_e
    iget-object v3, p0, Lha/k;->b:Landroid/content/SharedPreferences;

    .line 296
    .line 297
    const-string v5, "end_time"

    .line 298
    .line 299
    const-string v6, "23:30:00"

    .line 300
    .line 301
    invoke-interface {v3, v5, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v3

    .line 305
    if-nez v3, :cond_f

    .line 306
    .line 307
    const-string v3, ""

    .line 308
    .line 309
    :cond_f
    invoke-static {v0, v3}, Lr9/e0;->H(Ljava/lang/String;Ljava/lang/String;)Z

    .line 310
    .line 311
    .line 312
    move-result v0

    .line 313
    if-nez v0, :cond_10

    .line 314
    .line 315
    const-string p1, "\u5f53\u524d\u4e0d\u5728\u8fd0\u884c\u65f6\u6bb5"

    .line 316
    .line 317
    return-object p1

    .line 318
    :cond_10
    iget-object v0, p0, Lha/k;->b:Landroid/content/SharedPreferences;

    .line 319
    .line 320
    const-string v3, "max_age_hours"

    .line 321
    .line 322
    const/16 v5, 0x18

    .line 323
    .line 324
    invoke-interface {v0, v3, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 325
    .line 326
    .line 327
    move-result v0

    .line 328
    if-ge v0, v4, :cond_11

    .line 329
    .line 330
    move v0, v4

    .line 331
    :cond_11
    iget-wide v5, p1, Lha/c0;->d:J

    .line 332
    .line 333
    const-wide/16 v7, 0x0

    .line 334
    .line 335
    cmp-long v3, v5, v7

    .line 336
    .line 337
    if-gtz v3, :cond_12

    .line 338
    .line 339
    const-string p1, "\u65e0\u6cd5\u786e\u8ba4\u53d1\u5e03\u65f6\u95f4"

    .line 340
    .line 341
    return-object p1

    .line 342
    :cond_12
    iget-object v3, p0, Lha/k;->b:Landroid/content/SharedPreferences;

    .line 343
    .line 344
    const-string v5, "enabled_at_seconds"

    .line 345
    .line 346
    invoke-interface {v3, v5, v7, v8}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 347
    .line 348
    .line 349
    move-result-wide v5

    .line 350
    cmp-long v3, v5, v7

    .line 351
    .line 352
    if-lez v3, :cond_25

    .line 353
    .line 354
    iget-wide v9, p1, Lha/c0;->d:J

    .line 355
    .line 356
    cmp-long v3, v9, v5

    .line 357
    .line 358
    if-gez v3, :cond_13

    .line 359
    .line 360
    goto/16 :goto_d

    .line 361
    .line 362
    :cond_13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 363
    .line 364
    .line 365
    move-result-wide v5

    .line 366
    const-wide/16 v9, 0x3e8

    .line 367
    .line 368
    div-long/2addr v5, v9

    .line 369
    iget-wide v9, p1, Lha/c0;->d:J

    .line 370
    .line 371
    sub-long/2addr v5, v9

    .line 372
    cmp-long v3, v7, v5

    .line 373
    .line 374
    if-gtz v3, :cond_24

    .line 375
    .line 376
    int-to-long v7, v0

    .line 377
    const-wide/16 v9, 0xe10

    .line 378
    .line 379
    mul-long/2addr v7, v9

    .line 380
    cmp-long v3, v5, v7

    .line 381
    .line 382
    if-gtz v3, :cond_24

    .line 383
    .line 384
    iget-object v0, p1, Lha/c0;->e:Lha/d0;

    .line 385
    .line 386
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 387
    .line 388
    .line 389
    move-result v0

    .line 390
    const/4 v3, 0x3

    .line 391
    const/4 v5, 0x2

    .line 392
    if-eqz v0, :cond_17

    .line 393
    .line 394
    if-eq v0, v4, :cond_16

    .line 395
    .line 396
    if-eq v0, v5, :cond_15

    .line 397
    .line 398
    if-ne v0, v3, :cond_14

    .line 399
    .line 400
    move v0, v2

    .line 401
    goto :goto_9

    .line 402
    :cond_14
    invoke-static {}, Lokio/a;->k()V

    .line 403
    .line 404
    .line 405
    const/4 p1, 0x0

    .line 406
    return-object p1

    .line 407
    :cond_15
    iget-object v0, p0, Lha/k;->b:Landroid/content/SharedPreferences;

    .line 408
    .line 409
    const-string v6, "allow_video"

    .line 410
    .line 411
    invoke-interface {v0, v6, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 412
    .line 413
    .line 414
    move-result v0

    .line 415
    goto :goto_9

    .line 416
    :cond_16
    iget-object v0, p0, Lha/k;->b:Landroid/content/SharedPreferences;

    .line 417
    .line 418
    const-string v6, "allow_image"

    .line 419
    .line 420
    invoke-interface {v0, v6, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 421
    .line 422
    .line 423
    move-result v0

    .line 424
    goto :goto_9

    .line 425
    :cond_17
    iget-object v0, p0, Lha/k;->b:Landroid/content/SharedPreferences;

    .line 426
    .line 427
    const-string v6, "allow_text"

    .line 428
    .line 429
    invoke-interface {v0, v6, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 430
    .line 431
    .line 432
    move-result v0

    .line 433
    :goto_9
    iget-object v6, p1, Lha/c0;->e:Lha/d0;

    .line 434
    .line 435
    if-nez v0, :cond_18

    .line 436
    .line 437
    iget-object p1, v6, Lha/d0;->g:Ljava/lang/String;

    .line 438
    .line 439
    const-string v0, "\u5df2\u8fc7\u6ee4"

    .line 440
    .line 441
    const-string v1, "\u7c7b\u578b"

    .line 442
    .line 443
    invoke-static {v0, p1, v1}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object p1

    .line 447
    return-object p1

    .line 448
    :cond_18
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 449
    .line 450
    .line 451
    move-result v0

    .line 452
    if-eqz v0, :cond_1c

    .line 453
    .line 454
    if-eq v0, v4, :cond_1b

    .line 455
    .line 456
    if-eq v0, v5, :cond_1a

    .line 457
    .line 458
    if-ne v0, v3, :cond_19

    .line 459
    .line 460
    move v0, v2

    .line 461
    goto :goto_a

    .line 462
    :cond_19
    invoke-static {}, Lokio/a;->k()V

    .line 463
    .line 464
    .line 465
    const/4 p1, 0x0

    .line 466
    return-object p1

    .line 467
    :cond_1a
    iget-object v0, p0, Lha/k;->b:Landroid/content/SharedPreferences;

    .line 468
    .line 469
    const-string v6, "keyword_video"

    .line 470
    .line 471
    invoke-interface {v0, v6, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 472
    .line 473
    .line 474
    move-result v0

    .line 475
    goto :goto_a

    .line 476
    :cond_1b
    iget-object v0, p0, Lha/k;->b:Landroid/content/SharedPreferences;

    .line 477
    .line 478
    const-string v6, "keyword_image"

    .line 479
    .line 480
    invoke-interface {v0, v6, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 481
    .line 482
    .line 483
    move-result v0

    .line 484
    goto :goto_a

    .line 485
    :cond_1c
    iget-object v0, p0, Lha/k;->b:Landroid/content/SharedPreferences;

    .line 486
    .line 487
    const-string v6, "keyword_text"

    .line 488
    .line 489
    invoke-interface {v0, v6, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 490
    .line 491
    .line 492
    move-result v0

    .line 493
    :goto_a
    iget-object v6, p1, Lha/c0;->e:Lha/d0;

    .line 494
    .line 495
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 496
    .line 497
    .line 498
    move-result v6

    .line 499
    if-eqz v6, :cond_20

    .line 500
    .line 501
    if-eq v6, v4, :cond_1f

    .line 502
    .line 503
    if-eq v6, v5, :cond_1e

    .line 504
    .line 505
    if-ne v6, v3, :cond_1d

    .line 506
    .line 507
    const-string v3, ""

    .line 508
    .line 509
    goto :goto_b

    .line 510
    :cond_1d
    invoke-static {}, Lokio/a;->k()V

    .line 511
    .line 512
    .line 513
    const/4 p1, 0x0

    .line 514
    return-object p1

    .line 515
    :cond_1e
    iget-object v3, p0, Lha/k;->b:Landroid/content/SharedPreferences;

    .line 516
    .line 517
    const-string v4, "exclude_keywords_video_text"

    .line 518
    .line 519
    const-string v5, ""

    .line 520
    .line 521
    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 522
    .line 523
    .line 524
    move-result-object v3

    .line 525
    goto :goto_b

    .line 526
    :cond_1f
    iget-object v3, p0, Lha/k;->b:Landroid/content/SharedPreferences;

    .line 527
    .line 528
    const-string v4, "exclude_keywords_image_text"

    .line 529
    .line 530
    const-string v5, ""

    .line 531
    .line 532
    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 533
    .line 534
    .line 535
    move-result-object v3

    .line 536
    goto :goto_b

    .line 537
    :cond_20
    iget-object v3, p0, Lha/k;->b:Landroid/content/SharedPreferences;

    .line 538
    .line 539
    const-string v4, "exclude_keywords_text"

    .line 540
    .line 541
    const-string v5, ""

    .line 542
    .line 543
    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 544
    .line 545
    .line 546
    move-result-object v3

    .line 547
    :goto_b
    if-eqz v0, :cond_23

    .line 548
    .line 549
    iget-object v0, p1, Lha/c0;->f:Ljava/lang/String;

    .line 550
    .line 551
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 552
    .line 553
    .line 554
    move-result v0

    .line 555
    if-nez v0, :cond_23

    .line 556
    .line 557
    iget-object p1, p1, Lha/c0;->f:Ljava/lang/String;

    .line 558
    .line 559
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 560
    .line 561
    invoke-static {v0, p1, v0}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object p1

    .line 565
    invoke-static {v3}, Lr9/e0;->T(Ljava/lang/String;)Ljava/util/Set;

    .line 566
    .line 567
    .line 568
    move-result-object v0

    .line 569
    check-cast v0, Ljava/lang/Iterable;

    .line 570
    .line 571
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    :cond_21
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 576
    .line 577
    .line 578
    move-result v3

    .line 579
    if-eqz v3, :cond_22

    .line 580
    .line 581
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 582
    .line 583
    .line 584
    move-result-object v3

    .line 585
    move-object v4, v3

    .line 586
    check-cast v4, Ljava/lang/CharSequence;

    .line 587
    .line 588
    invoke-static {p1, v4, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 589
    .line 590
    .line 591
    move-result v4

    .line 592
    if-eqz v4, :cond_21

    .line 593
    .line 594
    goto :goto_c

    .line 595
    :cond_22
    move-object v3, v1

    .line 596
    :goto_c
    check-cast v3, Ljava/lang/String;

    .line 597
    .line 598
    if-eqz v3, :cond_23

    .line 599
    .line 600
    const-string p1, "\u547d\u4e2d\u6392\u9664\u5173\u952e\u8bcd\u201c"

    .line 601
    .line 602
    const-string v0, "\u201d"

    .line 603
    .line 604
    invoke-static {p1, v3, v0}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 605
    .line 606
    .line 607
    move-result-object p1

    .line 608
    return-object p1

    .line 609
    :cond_23
    return-object v1

    .line 610
    :cond_24
    const-string p1, "\u8d85\u8fc7"

    .line 611
    .line 612
    const-string v1, "\u5c0f\u65f6"

    .line 613
    .line 614
    invoke-static {v0, p1, v1}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 615
    .line 616
    .line 617
    move-result-object p1

    .line 618
    return-object p1

    .line 619
    :cond_25
    :goto_d
    const-string p1, "\u65e9\u4e8e\u672c\u6b21\u5f00\u542f\u65f6\u95f4"

    .line 620
    .line 621
    return-object p1
.end method

.method public final f(JLjava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lha/k;->d:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lha/k;->f:Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-virtual {v1, p3}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lha/k;->f:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    new-instance v2, Lha/j;

    .line 12
    .line 13
    invoke-direct {v2, p1, p2}, Lha/j;-><init>(J)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v1, p3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lha/k;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    monitor-exit v0

    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    monitor-exit v0

    .line 26
    throw p1
.end method

.method public final g()V
    .locals 4

    .line 1
    new-instance v0, Lorg/json/JSONArray;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lha/k;->d:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v1

    .line 9
    :try_start_0
    iget-object v2, p0, Lha/k;->g:Ljava/util/LinkedHashSet;

    .line 10
    .line 11
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v0

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    monitor-exit v1

    .line 34
    iget-object v1, p0, Lha/k;->b:Landroid/content/SharedPreferences;

    .line 35
    .line 36
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    const-string v2, "success_records"

    .line 41
    .line 42
    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :goto_1
    monitor-exit v1

    .line 55
    throw v0
.end method
