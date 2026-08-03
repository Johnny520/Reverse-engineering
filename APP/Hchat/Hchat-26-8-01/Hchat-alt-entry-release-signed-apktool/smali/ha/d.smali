.class public final Lha/d;
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
    sput-object v0, Lha/d;->k:Ljava/lang/Object;

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
    iput-object p2, p0, Lha/d;->a:Lab/b;

    .line 8
    .line 9
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 10
    .line 11
    const-string p2, "Hchat_moments_auto_comment_config"

    .line 12
    .line 13
    invoke-static {p1, p2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lha/d;->b:Landroid/content/SharedPreferences;

    .line 18
    .line 19
    new-instance p2, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 20
    .line 21
    new-instance v0, Lc9/q;

    .line 22
    .line 23
    const/16 v1, 0xa

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
    iput-object p2, p0, Lha/d;->c:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 36
    .line 37
    new-instance p2, Ljava/lang/Object;

    .line 38
    .line 39
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object p2, p0, Lha/d;->d:Ljava/lang/Object;

    .line 43
    .line 44
    new-instance p2, Ljava/lang/Object;

    .line 45
    .line 46
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object p2, p0, Lha/d;->e:Ljava/lang/Object;

    .line 50
    .line 51
    new-instance p2, Ljava/util/LinkedHashMap;

    .line 52
    .line 53
    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object p2, p0, Lha/d;->f:Ljava/util/LinkedHashMap;

    .line 57
    .line 58
    new-instance p2, Ljava/util/LinkedHashSet;

    .line 59
    .line 60
    invoke-direct {p2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object p2, p0, Lha/d;->g:Ljava/util/LinkedHashSet;

    .line 64
    .line 65
    new-instance p2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 66
    .line 67
    invoke-direct {p2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 68
    .line 69
    .line 70
    iput-object p2, p0, Lha/d;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 71
    .line 72
    const-string p2, "comment_enable"

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
    iput-boolean p1, p0, Lha/d;->i:Z

    .line 80
    .line 81
    new-instance p1, Lb9/b;

    .line 82
    .line 83
    const/4 p2, 0x2

    .line 84
    invoke-direct {p1, p0, p2}, Lb9/b;-><init>(Ljava/lang/Object;I)V

    .line 85
    .line 86
    .line 87
    iput-object p1, p0, Lha/d;->j:Lb9/b;

    .line 88
    .line 89
    return-void
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
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
.method public final a()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lha/d;->b:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    const-string v1, "comment_content"

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v2, v0

    .line 15
    :goto_0
    invoke-static {v2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0
.end method

.method public final c(Ljava/lang/String;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lha/d;->b:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    const-string v1, "comment_log_enable"

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
    sget-object v1, Lha/d;->k:Ljava/lang/Object;

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
    iget-object v0, p0, Lha/d;->b:Landroid/content/SharedPreferences;

    .line 45
    .line 46
    const-string v2, "comment_logs"

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
    const/4 v3, 0x4

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
    iget-object v0, p0, Lha/d;->b:Landroid/content/SharedPreferences;

    .line 106
    .line 107
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    const-string v2, "comment_logs"

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

.method public final d()V
    .locals 6

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object v2, p0, Lha/d;->f:Ljava/util/LinkedHashMap;

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
    check-cast v4, Lha/b;

    .line 40
    .line 41
    iget-wide v4, v4, Lha/b;->a:J

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

.method public final e(Ljava/lang/String;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lha/d;->e:Ljava/lang/Object;

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
    iget-object v2, p0, Lha/d;->b:Landroid/content/SharedPreferences;

    .line 26
    .line 27
    const-string v3, "daily_comment_date"

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
    iget-object v3, p0, Lha/d;->b:Landroid/content/SharedPreferences;

    .line 44
    .line 45
    const-string v4, "daily_comment_counts"

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
    iget-object p1, p0, Lha/d;->b:Landroid/content/SharedPreferences;

    .line 107
    .line 108
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    const-string v3, "daily_comment_date"

    .line 113
    .line 114
    invoke-interface {p1, v3, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    const-string v1, "daily_comment_counts"

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

.method public final f(Lha/c0;)Ljava/lang/String;
    .locals 11

    .line 1
    iget-object v0, p0, Lha/d;->b:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    const-string v1, "comment_enable"

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
    invoke-virtual {p0}, Lha/d;->a()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    const-string p1, "\u8bc4\u8bba\u5185\u5bb9\u4e3a\u7a7a"

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->account()Lg8/a;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const/4 v1, 0x0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    invoke-virtual {v0}, Lg8/a;->c()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    goto :goto_0

    .line 40
    :cond_2
    move-object v0, v1

    .line 41
    :goto_0
    if-nez v0, :cond_3

    .line 42
    .line 43
    const-string v0, ""

    .line 44
    .line 45
    :cond_3
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    const/4 v4, 0x1

    .line 50
    if-nez v3, :cond_4

    .line 51
    .line 52
    iget-object v3, p1, Lha/c0;->c:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_4

    .line 59
    .line 60
    move v0, v4

    .line 61
    goto :goto_1

    .line 62
    :cond_4
    move v0, v2

    .line 63
    :goto_1
    if-eqz v0, :cond_5

    .line 64
    .line 65
    iget-object v3, p0, Lha/d;->b:Landroid/content/SharedPreferences;

    .line 66
    .line 67
    const-string v5, "comment_self"

    .line 68
    .line 69
    invoke-interface {v3, v5, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-nez v3, :cond_5

    .line 74
    .line 75
    const-string p1, "\u672a\u5f00\u542f\u8bc4\u8bba\u81ea\u5df1\u7684\u670b\u53cb\u5708"

    .line 76
    .line 77
    return-object p1

    .line 78
    :cond_5
    iget-object v3, p0, Lha/d;->b:Landroid/content/SharedPreferences;

    .line 79
    .line 80
    const-string v5, "comment_list_mode"

    .line 81
    .line 82
    invoke-interface {v3, v5, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    iget-object v5, p0, Lha/d;->b:Landroid/content/SharedPreferences;

    .line 87
    .line 88
    if-ne v3, v4, :cond_6

    .line 89
    .line 90
    const-string v6, "comment_blacklist"

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
    goto :goto_2

    .line 103
    :cond_6
    const-string v6, "comment_whitelist"

    .line 104
    .line 105
    const-string v7, ""

    .line 106
    .line 107
    invoke-interface {v5, v6, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    invoke-static {v5}, Lr9/e0;->S(Ljava/lang/String;)Ljava/util/Set;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    :goto_2
    if-nez v0, :cond_7

    .line 116
    .line 117
    if-nez v3, :cond_7

    .line 118
    .line 119
    iget-object v6, p1, Lha/c0;->c:Ljava/lang/String;

    .line 120
    .line 121
    invoke-interface {v5, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v6

    .line 125
    if-nez v6, :cond_7

    .line 126
    .line 127
    const-string p1, "\u4e0d\u5728\u767d\u540d\u5355"

    .line 128
    .line 129
    return-object p1

    .line 130
    :cond_7
    if-nez v0, :cond_8

    .line 131
    .line 132
    if-ne v3, v4, :cond_8

    .line 133
    .line 134
    iget-object v0, p1, Lha/c0;->c:Ljava/lang/String;

    .line 135
    .line 136
    invoke-interface {v5, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-eqz v0, :cond_8

    .line 141
    .line 142
    const-string p1, "\u547d\u4e2d\u9ed1\u540d\u5355"

    .line 143
    .line 144
    return-object p1

    .line 145
    :cond_8
    iget-object v0, p0, Lha/d;->b:Landroid/content/SharedPreferences;

    .line 146
    .line 147
    const-string v3, "daily_comment_limit"

    .line 148
    .line 149
    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-gez v0, :cond_9

    .line 154
    .line 155
    move v0, v2

    .line 156
    :cond_9
    if-lez v0, :cond_e

    .line 157
    .line 158
    iget-object v3, p1, Lha/c0;->c:Ljava/lang/String;

    .line 159
    .line 160
    iget-object v5, p0, Lha/d;->e:Ljava/lang/Object;

    .line 161
    .line 162
    monitor-enter v5

    .line 163
    :try_start_0
    new-instance v6, Ljava/text/SimpleDateFormat;

    .line 164
    .line 165
    const-string v7, "yyyy-MM-dd"

    .line 166
    .line 167
    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 168
    .line 169
    invoke-direct {v6, v7, v8}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 170
    .line 171
    .line 172
    new-instance v7, Ljava/util/Date;

    .line 173
    .line 174
    invoke-direct {v7}, Ljava/util/Date;-><init>()V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v6, v7}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    iget-object v7, p0, Lha/d;->b:Landroid/content/SharedPreferences;

    .line 185
    .line 186
    const-string v8, "daily_comment_date"

    .line 187
    .line 188
    const-string v9, ""

    .line 189
    .line 190
    invoke-interface {v7, v8, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v7

    .line 194
    invoke-static {v7, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v7

    .line 198
    if-nez v7, :cond_a

    .line 199
    .line 200
    iget-object v3, p0, Lha/d;->b:Landroid/content/SharedPreferences;

    .line 201
    .line 202
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    const-string v7, "daily_comment_date"

    .line 207
    .line 208
    invoke-interface {v3, v7, v6}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    const-string v6, "daily_comment_counts"

    .line 213
    .line 214
    const-string v7, "{}"

    .line 215
    .line 216
    invoke-interface {v3, v6, v7}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 217
    .line 218
    .line 219
    move-result-object v3

    .line 220
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 221
    .line 222
    .line 223
    :goto_3
    move v3, v2

    .line 224
    goto :goto_8

    .line 225
    :cond_a
    :try_start_1
    new-instance v6, Lorg/json/JSONObject;

    .line 226
    .line 227
    iget-object v7, p0, Lha/d;->b:Landroid/content/SharedPreferences;

    .line 228
    .line 229
    const-string v8, "daily_comment_counts"

    .line 230
    .line 231
    const-string v9, "{}"

    .line 232
    .line 233
    invoke-interface {v7, v8, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v7

    .line 237
    if-nez v7, :cond_b

    .line 238
    .line 239
    const-string v7, ""

    .line 240
    .line 241
    goto :goto_4

    .line 242
    :catchall_0
    move-exception v6

    .line 243
    goto :goto_5

    .line 244
    :cond_b
    :goto_4
    invoke-direct {v6, v7}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 245
    .line 246
    .line 247
    goto :goto_6

    .line 248
    :goto_5
    :try_start_2
    new-instance v7, Lsf/f;

    .line 249
    .line 250
    invoke-direct {v7, v6}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 251
    .line 252
    .line 253
    move-object v6, v7

    .line 254
    :goto_6
    invoke-static {v6}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 255
    .line 256
    .line 257
    move-result-object v7

    .line 258
    if-nez v7, :cond_c

    .line 259
    .line 260
    goto :goto_7

    .line 261
    :cond_c
    new-instance v6, Lorg/json/JSONObject;

    .line 262
    .line 263
    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 264
    .line 265
    .line 266
    :goto_7
    check-cast v6, Lorg/json/JSONObject;

    .line 267
    .line 268
    invoke-virtual {v6, v3, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 269
    .line 270
    .line 271
    move-result v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 272
    if-gez v3, :cond_d

    .line 273
    .line 274
    goto :goto_3

    .line 275
    :cond_d
    :goto_8
    monitor-exit v5

    .line 276
    if-lt v3, v0, :cond_e

    .line 277
    .line 278
    const-string p1, "\u5df2\u8fbe\u5230\u540c\u4e00\u4eba\u5f53\u5929\u8bc4\u8bba\u4e0a\u9650"

    .line 279
    .line 280
    return-object p1

    .line 281
    :catchall_1
    move-exception p1

    .line 282
    monitor-exit v5

    .line 283
    throw p1

    .line 284
    :cond_e
    iget-object v0, p0, Lha/d;->b:Landroid/content/SharedPreferences;

    .line 285
    .line 286
    const-string v3, "comment_time_window_enable"

    .line 287
    .line 288
    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    if-eqz v0, :cond_11

    .line 293
    .line 294
    iget-object v0, p0, Lha/d;->b:Landroid/content/SharedPreferences;

    .line 295
    .line 296
    const-string v3, "comment_start_time"

    .line 297
    .line 298
    const-string v5, "08:00:00"

    .line 299
    .line 300
    invoke-interface {v0, v3, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    if-nez v0, :cond_f

    .line 305
    .line 306
    const-string v0, ""

    .line 307
    .line 308
    :cond_f
    iget-object v3, p0, Lha/d;->b:Landroid/content/SharedPreferences;

    .line 309
    .line 310
    const-string v5, "comment_end_time"

    .line 311
    .line 312
    const-string v6, "23:30:00"

    .line 313
    .line 314
    invoke-interface {v3, v5, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v3

    .line 318
    if-nez v3, :cond_10

    .line 319
    .line 320
    const-string v3, ""

    .line 321
    .line 322
    :cond_10
    invoke-static {v0, v3}, Lr9/e0;->H(Ljava/lang/String;Ljava/lang/String;)Z

    .line 323
    .line 324
    .line 325
    move-result v0

    .line 326
    if-nez v0, :cond_11

    .line 327
    .line 328
    const-string p1, "\u5f53\u524d\u4e0d\u5728\u8fd0\u884c\u65f6\u6bb5"

    .line 329
    .line 330
    return-object p1

    .line 331
    :cond_11
    iget-object v0, p0, Lha/d;->b:Landroid/content/SharedPreferences;

    .line 332
    .line 333
    const-string v3, "comment_max_age_hours"

    .line 334
    .line 335
    const/16 v5, 0x18

    .line 336
    .line 337
    invoke-interface {v0, v3, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 338
    .line 339
    .line 340
    move-result v0

    .line 341
    if-ge v0, v4, :cond_12

    .line 342
    .line 343
    move v0, v4

    .line 344
    :cond_12
    iget-wide v5, p1, Lha/c0;->d:J

    .line 345
    .line 346
    const-wide/16 v7, 0x0

    .line 347
    .line 348
    cmp-long v3, v5, v7

    .line 349
    .line 350
    if-gtz v3, :cond_13

    .line 351
    .line 352
    const-string p1, "\u65e0\u6cd5\u786e\u8ba4\u53d1\u5e03\u65f6\u95f4"

    .line 353
    .line 354
    return-object p1

    .line 355
    :cond_13
    iget-object v3, p0, Lha/d;->b:Landroid/content/SharedPreferences;

    .line 356
    .line 357
    const-string v5, "comment_enabled_at_seconds"

    .line 358
    .line 359
    invoke-interface {v3, v5, v7, v8}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 360
    .line 361
    .line 362
    move-result-wide v5

    .line 363
    cmp-long v3, v5, v7

    .line 364
    .line 365
    if-lez v3, :cond_26

    .line 366
    .line 367
    iget-wide v9, p1, Lha/c0;->d:J

    .line 368
    .line 369
    cmp-long v3, v9, v5

    .line 370
    .line 371
    if-gez v3, :cond_14

    .line 372
    .line 373
    goto/16 :goto_d

    .line 374
    .line 375
    :cond_14
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 376
    .line 377
    .line 378
    move-result-wide v5

    .line 379
    const-wide/16 v9, 0x3e8

    .line 380
    .line 381
    div-long/2addr v5, v9

    .line 382
    iget-wide v9, p1, Lha/c0;->d:J

    .line 383
    .line 384
    sub-long/2addr v5, v9

    .line 385
    cmp-long v3, v7, v5

    .line 386
    .line 387
    if-gtz v3, :cond_25

    .line 388
    .line 389
    int-to-long v7, v0

    .line 390
    const-wide/16 v9, 0xe10

    .line 391
    .line 392
    mul-long/2addr v7, v9

    .line 393
    cmp-long v3, v5, v7

    .line 394
    .line 395
    if-gtz v3, :cond_25

    .line 396
    .line 397
    iget-object v0, p1, Lha/c0;->e:Lha/d0;

    .line 398
    .line 399
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 400
    .line 401
    .line 402
    move-result v0

    .line 403
    const/4 v3, 0x3

    .line 404
    const/4 v5, 0x2

    .line 405
    if-eqz v0, :cond_18

    .line 406
    .line 407
    if-eq v0, v4, :cond_17

    .line 408
    .line 409
    if-eq v0, v5, :cond_16

    .line 410
    .line 411
    if-ne v0, v3, :cond_15

    .line 412
    .line 413
    move v0, v2

    .line 414
    goto :goto_9

    .line 415
    :cond_15
    invoke-static {}, Lokio/a;->k()V

    .line 416
    .line 417
    .line 418
    const/4 p1, 0x0

    .line 419
    return-object p1

    .line 420
    :cond_16
    iget-object v0, p0, Lha/d;->b:Landroid/content/SharedPreferences;

    .line 421
    .line 422
    const-string v6, "comment_allow_video"

    .line 423
    .line 424
    invoke-interface {v0, v6, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 425
    .line 426
    .line 427
    move-result v0

    .line 428
    goto :goto_9

    .line 429
    :cond_17
    iget-object v0, p0, Lha/d;->b:Landroid/content/SharedPreferences;

    .line 430
    .line 431
    const-string v6, "comment_allow_image"

    .line 432
    .line 433
    invoke-interface {v0, v6, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 434
    .line 435
    .line 436
    move-result v0

    .line 437
    goto :goto_9

    .line 438
    :cond_18
    iget-object v0, p0, Lha/d;->b:Landroid/content/SharedPreferences;

    .line 439
    .line 440
    const-string v6, "comment_allow_text"

    .line 441
    .line 442
    invoke-interface {v0, v6, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 443
    .line 444
    .line 445
    move-result v0

    .line 446
    :goto_9
    iget-object v6, p1, Lha/c0;->e:Lha/d0;

    .line 447
    .line 448
    if-nez v0, :cond_19

    .line 449
    .line 450
    iget-object p1, v6, Lha/d0;->g:Ljava/lang/String;

    .line 451
    .line 452
    const-string v0, "\u5df2\u8fc7\u6ee4"

    .line 453
    .line 454
    const-string v1, "\u7c7b\u578b"

    .line 455
    .line 456
    invoke-static {v0, p1, v1}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object p1

    .line 460
    return-object p1

    .line 461
    :cond_19
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 462
    .line 463
    .line 464
    move-result v0

    .line 465
    if-eqz v0, :cond_1d

    .line 466
    .line 467
    if-eq v0, v4, :cond_1c

    .line 468
    .line 469
    if-eq v0, v5, :cond_1b

    .line 470
    .line 471
    if-ne v0, v3, :cond_1a

    .line 472
    .line 473
    move v0, v2

    .line 474
    goto :goto_a

    .line 475
    :cond_1a
    invoke-static {}, Lokio/a;->k()V

    .line 476
    .line 477
    .line 478
    const/4 p1, 0x0

    .line 479
    return-object p1

    .line 480
    :cond_1b
    iget-object v0, p0, Lha/d;->b:Landroid/content/SharedPreferences;

    .line 481
    .line 482
    const-string v6, "comment_keyword_video"

    .line 483
    .line 484
    invoke-interface {v0, v6, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 485
    .line 486
    .line 487
    move-result v0

    .line 488
    goto :goto_a

    .line 489
    :cond_1c
    iget-object v0, p0, Lha/d;->b:Landroid/content/SharedPreferences;

    .line 490
    .line 491
    const-string v6, "comment_keyword_image"

    .line 492
    .line 493
    invoke-interface {v0, v6, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 494
    .line 495
    .line 496
    move-result v0

    .line 497
    goto :goto_a

    .line 498
    :cond_1d
    iget-object v0, p0, Lha/d;->b:Landroid/content/SharedPreferences;

    .line 499
    .line 500
    const-string v6, "comment_keyword_text"

    .line 501
    .line 502
    invoke-interface {v0, v6, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 503
    .line 504
    .line 505
    move-result v0

    .line 506
    :goto_a
    iget-object v6, p1, Lha/c0;->e:Lha/d0;

    .line 507
    .line 508
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 509
    .line 510
    .line 511
    move-result v6

    .line 512
    if-eqz v6, :cond_21

    .line 513
    .line 514
    if-eq v6, v4, :cond_20

    .line 515
    .line 516
    if-eq v6, v5, :cond_1f

    .line 517
    .line 518
    if-ne v6, v3, :cond_1e

    .line 519
    .line 520
    const-string v3, ""

    .line 521
    .line 522
    goto :goto_b

    .line 523
    :cond_1e
    invoke-static {}, Lokio/a;->k()V

    .line 524
    .line 525
    .line 526
    const/4 p1, 0x0

    .line 527
    return-object p1

    .line 528
    :cond_1f
    iget-object v3, p0, Lha/d;->b:Landroid/content/SharedPreferences;

    .line 529
    .line 530
    const-string v4, "comment_exclude_keywords_video_text"

    .line 531
    .line 532
    const-string v5, ""

    .line 533
    .line 534
    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 535
    .line 536
    .line 537
    move-result-object v3

    .line 538
    goto :goto_b

    .line 539
    :cond_20
    iget-object v3, p0, Lha/d;->b:Landroid/content/SharedPreferences;

    .line 540
    .line 541
    const-string v4, "comment_exclude_keywords_image_text"

    .line 542
    .line 543
    const-string v5, ""

    .line 544
    .line 545
    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 546
    .line 547
    .line 548
    move-result-object v3

    .line 549
    goto :goto_b

    .line 550
    :cond_21
    iget-object v3, p0, Lha/d;->b:Landroid/content/SharedPreferences;

    .line 551
    .line 552
    const-string v4, "comment_exclude_keywords_text"

    .line 553
    .line 554
    const-string v5, ""

    .line 555
    .line 556
    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 557
    .line 558
    .line 559
    move-result-object v3

    .line 560
    :goto_b
    if-eqz v0, :cond_24

    .line 561
    .line 562
    iget-object v0, p1, Lha/c0;->f:Ljava/lang/String;

    .line 563
    .line 564
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 565
    .line 566
    .line 567
    move-result v0

    .line 568
    if-nez v0, :cond_24

    .line 569
    .line 570
    iget-object p1, p1, Lha/c0;->f:Ljava/lang/String;

    .line 571
    .line 572
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 573
    .line 574
    invoke-static {v0, p1, v0}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object p1

    .line 578
    invoke-static {v3}, Lr9/e0;->T(Ljava/lang/String;)Ljava/util/Set;

    .line 579
    .line 580
    .line 581
    move-result-object v0

    .line 582
    check-cast v0, Ljava/lang/Iterable;

    .line 583
    .line 584
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 585
    .line 586
    .line 587
    move-result-object v0

    .line 588
    :cond_22
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 589
    .line 590
    .line 591
    move-result v3

    .line 592
    if-eqz v3, :cond_23

    .line 593
    .line 594
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    move-result-object v3

    .line 598
    move-object v4, v3

    .line 599
    check-cast v4, Ljava/lang/CharSequence;

    .line 600
    .line 601
    invoke-static {p1, v4, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 602
    .line 603
    .line 604
    move-result v4

    .line 605
    if-eqz v4, :cond_22

    .line 606
    .line 607
    goto :goto_c

    .line 608
    :cond_23
    move-object v3, v1

    .line 609
    :goto_c
    check-cast v3, Ljava/lang/String;

    .line 610
    .line 611
    if-eqz v3, :cond_24

    .line 612
    .line 613
    const-string p1, "\u547d\u4e2d\u6392\u9664\u5173\u952e\u8bcd\u201c"

    .line 614
    .line 615
    const-string v0, "\u201d"

    .line 616
    .line 617
    invoke-static {p1, v3, v0}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 618
    .line 619
    .line 620
    move-result-object p1

    .line 621
    return-object p1

    .line 622
    :cond_24
    return-object v1

    .line 623
    :cond_25
    const-string p1, "\u8d85\u8fc7"

    .line 624
    .line 625
    const-string v1, "\u5c0f\u65f6"

    .line 626
    .line 627
    invoke-static {v0, p1, v1}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 628
    .line 629
    .line 630
    move-result-object p1

    .line 631
    return-object p1

    .line 632
    :cond_26
    :goto_d
    const-string p1, "\u65e9\u4e8e\u672c\u6b21\u5f00\u542f\u65f6\u95f4"

    .line 633
    .line 634
    return-object p1
.end method

.method public final g(JLjava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lha/d;->d:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lha/d;->f:Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-virtual {v1, p3}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lha/d;->f:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    new-instance v2, Lha/b;

    .line 12
    .line 13
    invoke-direct {v2, p1, p2}, Lha/b;-><init>(J)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v1, p3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lha/d;->d()V
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

.method public final h()Ljava/lang/String;
    .locals 9

    .line 1
    invoke-virtual {p0}, Lha/d;->a()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lha/d;->b:Landroid/content/SharedPreferences;

    .line 6
    .line 7
    const-string v2, "comment_time_format"

    .line 8
    .line 9
    const-string v3, "yyyy-MM-dd HH:mm:ss"

    .line 10
    .line 11
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 16
    .line 17
    .line 18
    move-result-wide v4

    .line 19
    const-string v2, ""

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    move-object v0, v2

    .line 24
    :cond_0
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v6, "${time}"

    .line 33
    .line 34
    const/4 v7, 0x0

    .line 35
    invoke-static {v0, v6, v7}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 36
    .line 37
    .line 38
    move-result v8

    .line 39
    if-nez v8, :cond_1

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_1
    new-instance v8, Ljava/util/Date;

    .line 43
    .line 44
    invoke-direct {v8, v4, v5}, Ljava/util/Date;-><init>(J)V

    .line 45
    .line 46
    .line 47
    :try_start_0
    new-instance v4, Ljava/text/SimpleDateFormat;

    .line 48
    .line 49
    if-nez v1, :cond_2

    .line 50
    .line 51
    move-object v1, v2

    .line 52
    :cond_2
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_3

    .line 65
    .line 66
    move-object v1, v3

    .line 67
    :cond_3
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-direct {v4, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v4, v8}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    goto :goto_0

    .line 79
    :catchall_0
    move-exception v1

    .line 80
    new-instance v2, Lsf/f;

    .line 81
    .line 82
    invoke-direct {v2, v1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 83
    .line 84
    .line 85
    move-object v1, v2

    .line 86
    :goto_0
    invoke-static {v1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    if-nez v2, :cond_4

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_4
    new-instance v1, Ljava/text/SimpleDateFormat;

    .line 94
    .line 95
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-direct {v1, v3, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1, v8}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    :goto_1
    check-cast v1, Ljava/lang/String;

    .line 107
    .line 108
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-static {v0, v6, v1, v7}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    return-object v0
.end method

.method public final i()V
    .locals 4

    .line 1
    new-instance v0, Lorg/json/JSONArray;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lha/d;->d:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v1

    .line 9
    :try_start_0
    iget-object v2, p0, Lha/d;->g:Ljava/util/LinkedHashSet;

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
    iget-object v1, p0, Lha/d;->b:Landroid/content/SharedPreferences;

    .line 35
    .line 36
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    const-string v2, "comment_success_records"

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
