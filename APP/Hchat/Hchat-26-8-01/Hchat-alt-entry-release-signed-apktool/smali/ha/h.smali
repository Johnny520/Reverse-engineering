.class public final Lha/h;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final m:Ljava/lang/Object;


# instance fields
.field public final a:Lab/b;

.field public final b:Landroid/content/SharedPreferences;

.field public final c:Lp8/o;

.field public final d:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public final g:Ljava/lang/Object;

.field public final h:Ljava/util/LinkedHashSet;

.field public final i:Ljava/util/concurrent/ConcurrentHashMap;

.field public volatile j:Z

.field public volatile k:J

.field public final l:Lb9/b;


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
    sput-object v0, Lha/h;->m:Ljava/lang/Object;

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
    iput-object p2, p0, Lha/h;->a:Lab/b;

    .line 8
    .line 9
    iget-object v0, p1, Lr8/g;->a:Landroid/content/Context;

    .line 10
    .line 11
    const-string v1, "Hchat_moments_auto_forward_config"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lha/h;->b:Landroid/content/SharedPreferences;

    .line 18
    .line 19
    new-instance v1, Lp8/o;

    .line 20
    .line 21
    invoke-direct {v1, p1, p2}, Lp8/o;-><init>(Lr8/g;Lfg/p;)V

    .line 22
    .line 23
    .line 24
    iput-object v1, p0, Lha/h;->c:Lp8/o;

    .line 25
    .line 26
    new-instance p1, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 27
    .line 28
    new-instance p2, Lc9/q;

    .line 29
    .line 30
    const/16 v1, 0xb

    .line 31
    .line 32
    invoke-direct {p2, v1}, Lc9/q;-><init>(I)V

    .line 33
    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    invoke-direct {p1, v1, p2}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->setRemoveOnCancelPolicy(Z)V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Lha/h;->d:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 43
    .line 44
    new-instance p1, Ljava/lang/Object;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, Lha/h;->e:Ljava/lang/Object;

    .line 50
    .line 51
    new-instance p1, Ljava/lang/Object;

    .line 52
    .line 53
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, Lha/h;->f:Ljava/lang/Object;

    .line 57
    .line 58
    new-instance p1, Ljava/lang/Object;

    .line 59
    .line 60
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object p1, p0, Lha/h;->g:Ljava/lang/Object;

    .line 64
    .line 65
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 66
    .line 67
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 68
    .line 69
    .line 70
    iput-object p1, p0, Lha/h;->h:Ljava/util/LinkedHashSet;

    .line 71
    .line 72
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 73
    .line 74
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 75
    .line 76
    .line 77
    iput-object p1, p0, Lha/h;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 78
    .line 79
    const-string p1, "enable"

    .line 80
    .line 81
    const/4 p2, 0x0

    .line 82
    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    iput-boolean p1, p0, Lha/h;->j:Z

    .line 87
    .line 88
    new-instance p1, Lb9/b;

    .line 89
    .line 90
    const/4 p2, 0x3

    .line 91
    invoke-direct {p1, p0, p2}, Lb9/b;-><init>(Ljava/lang/Object;I)V

    .line 92
    .line 93
    .line 94
    iput-object p1, p0, Lha/h;->l:Lb9/b;

    .line 95
    .line 96
    return-void
.end method

.method public static m(Lha/t;Ljava/lang/String;Lp8/c;)Z
    .locals 3

    .line 1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->snsApi()Lp8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_6

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    const-string v1, ""

    .line 12
    .line 13
    if-eqz p0, :cond_5

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    if-eq p0, v2, :cond_4

    .line 17
    .line 18
    const/4 v2, 0x2

    .line 19
    if-eq p0, v2, :cond_3

    .line 20
    .line 21
    const/4 v1, 0x3

    .line 22
    if-eq p0, v1, :cond_1

    .line 23
    .line 24
    const/4 p1, 0x4

    .line 25
    if-ne p0, p1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {}, Lokio/a;->k()V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return p0

    .line 33
    :cond_1
    iget-object p0, p2, Lp8/c;->b:Ljava/util/List;

    .line 34
    .line 35
    invoke-static {p0}, Ltf/m;->I1(Ljava/util/List;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, Lp8/d;

    .line 40
    .line 41
    if-eqz p0, :cond_6

    .line 42
    .line 43
    invoke-virtual {p0}, Lp8/d;->a()Z

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    if-nez p2, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    new-instance p2, Lorg/json/JSONObject;

    .line 51
    .line 52
    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    .line 53
    .line 54
    .line 55
    const-string v1, "content"

    .line 56
    .line 57
    invoke-virtual {p2, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    const-string p2, "imagePath"

    .line 62
    .line 63
    iget-object v1, p0, Lp8/d;->a:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {p1, p2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    const-string p2, "videoPath"

    .line 70
    .line 71
    iget-object p0, p0, Lp8/d;->b:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {p1, p2, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    const-string p1, "coverTimeMs"

    .line 78
    .line 79
    const-wide/16 v1, 0x0

    .line 80
    .line 81
    invoke-virtual {p0, p1, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-virtual {v0, p0}, Lp8/d0;->w(Lorg/json/JSONObject;)Z

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    return p0

    .line 90
    :cond_3
    iget-object p0, p2, Lp8/c;->c:Ljava/lang/String;

    .line 91
    .line 92
    invoke-virtual {v0, p1, p0, v1, v1}, Lp8/d0;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    return p0

    .line 97
    :cond_4
    invoke-virtual {p2}, Lp8/c;->b()Ljava/util/ArrayList;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-virtual {v0, p1, p0, v1, v1}, Lp8/d0;->x(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Z

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    return p0

    .line 106
    :cond_5
    invoke-virtual {v0, p1, v1, v1}, Lp8/d0;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    return p0

    .line 111
    :cond_6
    :goto_0
    const/4 p0, 0x0

    .line 112
    return p0
.end method


# virtual methods
.method public final a()V
    .locals 6

    .line 1
    iget-object v0, p0, Lha/h;->f:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lha/h;->h:Ljava/util/LinkedHashSet;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    .line 9
    monitor-exit v0

    .line 10
    iget-object v0, p0, Lha/h;->b:Landroid/content/SharedPreferences;

    .line 11
    .line 12
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "enabled_at_seconds"

    .line 17
    .line 18
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 19
    .line 20
    .line 21
    move-result-wide v2

    .line 22
    const-wide/16 v4, 0x3e8

    .line 23
    .line 24
    div-long/2addr v2, v4

    .line 25
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, "handled_ids"

    .line 30
    .line 31
    const-string v2, "[]"

    .line 32
    .line 33
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_0

    .line 42
    .line 43
    iget-object v0, p0, Lha/h;->a:Lab/b;

    .line 44
    .line 45
    const-string v1, "\u521d\u59cb\u5316\u670b\u53cb\u5708\u81ea\u52a8\u8f6c\u53d1\u542f\u7528\u72b6\u6001\u5931\u8d25"

    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    invoke-virtual {v0, v1, v2}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    :cond_0
    return-void

    .line 52
    :catchall_0
    move-exception v1

    .line 53
    monitor-exit v0

    .line 54
    throw v1
.end method

.method public final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    :try_start_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contact()Li8/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->e()Lg8/i;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lg8/i;->n(Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatContact;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatContact;->displayName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    move-object v0, p1

    .line 33
    :cond_0
    if-eqz v0, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :catchall_0
    move-exception v0

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move-object v0, p1

    .line 39
    goto :goto_1

    .line 40
    :goto_0
    new-instance v1, Lsf/f;

    .line 41
    .line 42
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    move-object v0, v1

    .line 46
    :goto_1
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    if-eqz v1, :cond_2

    .line 51
    .line 52
    new-instance v2, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string v3, "\u8bfb\u53d6\u670b\u53cb\u5708\u53d1\u5e03\u8005\u540d\u79f0\u5931\u8d25: "

    .line 55
    .line 56
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    iget-object v3, p0, Lha/h;->a:Lab/b;

    .line 67
    .line 68
    invoke-virtual {v3, v2, v1}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    :cond_2
    instance-of v1, v0, Lsf/f;

    .line 72
    .line 73
    if-eqz v1, :cond_3

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_3
    move-object p1, v0

    .line 77
    :goto_2
    check-cast p1, Ljava/lang/String;

    .line 78
    .line 79
    return-object p1
.end method

.method public final c(Lha/g;)V
    .locals 13

    .line 1
    iget-object v0, p1, Lha/g;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    iget-wide v1, p1, Lha/g;->d:J

    .line 4
    .line 5
    iget-object v3, p1, Lha/g;->a:Lha/c0;

    .line 6
    .line 7
    iget-object v4, p0, Lha/h;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    .line 9
    const-string v5, "\u5df2\u63d0\u4ea4\u5230\u5fae\u4fe1\u53d1\u5e03\u961f\u5217 "

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    :try_start_0
    invoke-virtual {p0, p1}, Lha/h;->h(Lha/g;)Z

    .line 13
    .line 14
    .line 15
    move-result v7
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    iget-object v8, p1, Lha/g;->b:Lp8/v;

    .line 17
    .line 18
    iget-object v9, p1, Lha/g;->c:Lha/t;

    .line 19
    .line 20
    iget-object v10, v3, Lha/c0;->a:Ljava/lang/String;

    .line 21
    .line 22
    if-nez v7, :cond_0

    .line 23
    .line 24
    invoke-virtual {v4, v10, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    :try_start_1
    invoke-virtual {p0, v3, v8, v9}, Lha/h;->o(Lha/c0;Lp8/v;Lha/t;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    const/4 v11, 0x0

    .line 33
    if-eqz v7, :cond_2

    .line 34
    .line 35
    const-string v5, "\u6682\u65f6\u65e0\u6cd5\u786e\u8ba4\u5f53\u524d\u8d26\u53f7"

    .line 36
    .line 37
    invoke-virtual {v7, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-eqz v5, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0, p1, v7, v11}, Lha/h;->f(Lha/g;Ljava/lang/String;Ljava/lang/Throwable;)Z

    .line 44
    .line 45
    .line 46
    move-result v0
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    if-nez v0, :cond_6

    .line 48
    .line 49
    invoke-virtual {v4, v10, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :catchall_0
    move-exception v0

    .line 54
    goto :goto_1

    .line 55
    :catch_0
    move-exception v5

    .line 56
    goto :goto_3

    .line 57
    :cond_1
    :try_start_2
    invoke-virtual {p0, v3, v1, v2, v7}, Lha/h;->d(Lha/c0;JLjava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4, v10, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_2
    :try_start_3
    invoke-virtual {p0, v3, v8, v9}, Lha/h;->e(Lha/c0;Lp8/v;Lha/t;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    iget-object v12, p0, Lha/h;->c:Lp8/o;

    .line 69
    .line 70
    invoke-virtual {v12, v8, v0}, Lp8/o;->q(Lp8/v;Ljava/util/concurrent/atomic/AtomicBoolean;)Lp8/c;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    invoke-virtual {p0, p1}, Lha/h;->h(Lha/g;)Z

    .line 75
    .line 76
    .line 77
    move-result v12
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 78
    if-nez v12, :cond_3

    .line 79
    .line 80
    invoke-virtual {v4, v10, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_3
    :try_start_4
    invoke-static {v9, v7, v8}, Lha/h;->m(Lha/t;Ljava/lang/String;Lp8/c;)Z

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    if-eqz v7, :cond_4

    .line 89
    .line 90
    invoke-virtual {p0}, Lha/h;->n()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, v1, v2, v10}, Lha/h;->j(JLjava/lang/String;)Z

    .line 94
    .line 95
    .line 96
    iget-object v7, v3, Lha/c0;->c:Ljava/lang/String;

    .line 97
    .line 98
    invoke-virtual {p0, v7}, Lha/h;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    iget-object v8, v9, Lha/t;->g:Ljava/lang/String;

    .line 103
    .line 104
    new-instance v9, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    invoke-direct {v9, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string v5, " \u00b7 "

    .line 113
    .line 114
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    invoke-virtual {p0, v5}, Lha/h;->i(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_4
    const-string v5, "\u9759\u9ed8\u53d1\u5e03\u5931\u8d25"

    .line 129
    .line 130
    invoke-virtual {p0, p1, v5, v11}, Lha/h;->f(Lha/g;Ljava/lang/String;Ljava/lang/Throwable;)Z

    .line 131
    .line 132
    .line 133
    move-result v6
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 134
    :goto_0
    if-nez v6, :cond_6

    .line 135
    .line 136
    invoke-virtual {v4, v10, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :goto_1
    :try_start_5
    const-string v1, "\u51c6\u5907\u6216\u53d1\u5e03\u670b\u53cb\u5708\u5931\u8d25"

    .line 141
    .line 142
    invoke-virtual {p0, p1, v1, v0}, Lha/h;->f(Lha/g;Ljava/lang/String;Ljava/lang/Throwable;)Z

    .line 143
    .line 144
    .line 145
    move-result v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 146
    if-nez v0, :cond_6

    .line 147
    .line 148
    :goto_2
    iget-object v0, v3, Lha/c0;->a:Ljava/lang/String;

    .line 149
    .line 150
    invoke-virtual {v4, v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    goto :goto_4

    .line 154
    :catchall_1
    move-exception v0

    .line 155
    goto :goto_5

    .line 156
    :goto_3
    :try_start_6
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    if-nez v0, :cond_5

    .line 161
    .line 162
    invoke-virtual {p0, v1, v2}, Lha/h;->g(J)Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-eqz v0, :cond_5

    .line 167
    .line 168
    const-string v0, "\u5a92\u4f53\u51c6\u5907\u88ab\u4e2d\u65ad"

    .line 169
    .line 170
    invoke-virtual {p0, p1, v0, v5}, Lha/h;->f(Lha/g;Ljava/lang/String;Ljava/lang/Throwable;)Z

    .line 171
    .line 172
    .line 173
    move-result v6
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 174
    :cond_5
    if-nez v6, :cond_6

    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_6
    :goto_4
    return-void

    .line 178
    :goto_5
    iget-object v1, v3, Lha/c0;->a:Ljava/lang/String;

    .line 179
    .line 180
    invoke-virtual {v4, v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    throw v0
.end method

.method public final d(Lha/c0;JLjava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p1, Lha/c0;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0, p2, p3, v0}, Lha/h;->j(JLjava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    iget-object p1, p1, Lha/c0;->c:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lha/h;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    new-instance p2, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string p3, "\u8df3\u8fc7 "

    .line 18
    .line 19
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string p1, "\uff1a"

    .line 26
    .line 27
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p0, p1}, Lha/h;->i(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    return-void
.end method

.method public final e(Lha/c0;Lp8/v;Lha/t;)Ljava/lang/String;
    .locals 6

    .line 1
    iget-object v0, p1, Lha/c0;->c:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lha/h;->b:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    const-string v2, "content_template"

    .line 6
    .line 7
    const-string v3, "%content%"

    .line 8
    .line 9
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    const-string v1, ""

    .line 16
    .line 17
    :cond_0
    const-string v2, "%sender%"

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lha/h;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    const/4 v5, 0x0

    .line 24
    invoke-static {v1, v2, v4, v5}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const-string v2, "%wxid%"

    .line 29
    .line 30
    invoke-static {v1, v2, v0, v5}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-string v1, "%type%"

    .line 35
    .line 36
    iget-object p3, p3, Lha/t;->g:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v0, v1, p3, v5}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p3

    .line 42
    iget-object p2, p2, Lp8/v;->b:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {p3, v3, p2, v5}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    const-string p3, "%snsid%"

    .line 49
    .line 50
    iget-object p1, p1, Lha/c0;->a:Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {p2, p3, p1, v5}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    return-object p1
.end method

.method public final f(Lha/g;Ljava/lang/String;Ljava/lang/Throwable;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lha/h;->a:Lab/b;

    .line 2
    .line 3
    iget-object v1, p1, Lha/g;->a:Lha/c0;

    .line 4
    .line 5
    iget-object v1, v1, Lha/c0;->a:Ljava/lang/String;

    .line 6
    .line 7
    iget v2, p1, Lha/g;->f:I

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    add-int/2addr v2, v3

    .line 11
    new-instance v4, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string p2, ": snsId="

    .line 20
    .line 21
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string p2, " attempt="

    .line 28
    .line 29
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-virtual {v0, p2, p3}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    iget p2, p1, Lha/g;->f:I

    .line 43
    .line 44
    const/4 p3, 0x0

    .line 45
    const-string v0, "\u8f6c\u53d1\u5931\u8d25 "

    .line 46
    .line 47
    if-nez p2, :cond_4

    .line 48
    .line 49
    invoke-virtual {p0, p1}, Lha/h;->h(Lha/g;)Z

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    if-eqz p2, :cond_4

    .line 54
    .line 55
    iput v3, p1, Lha/g;->f:I

    .line 56
    .line 57
    :try_start_0
    iget-object p2, p0, Lha/h;->d:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 58
    .line 59
    new-instance v1, Lha/f;

    .line 60
    .line 61
    const/4 v2, 0x0

    .line 62
    invoke-direct {v1, p0, p1, v2}, Lha/f;-><init>(Lha/h;Lha/g;I)V

    .line 63
    .line 64
    .line 65
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 66
    .line 67
    const-wide/16 v4, 0x12c

    .line 68
    .line 69
    invoke-virtual {p2, v1, v4, v5, v2}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 70
    .line 71
    .line 72
    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    goto :goto_0

    .line 74
    :catchall_0
    move-exception p2

    .line 75
    new-instance v1, Lsf/f;

    .line 76
    .line 77
    invoke-direct {v1, p2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    move-object p2, v1

    .line 81
    :goto_0
    invoke-static {p2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    if-eqz v1, :cond_0

    .line 86
    .line 87
    iget-object v2, p0, Lha/h;->a:Lab/b;

    .line 88
    .line 89
    iget-object v4, p1, Lha/g;->a:Lha/c0;

    .line 90
    .line 91
    iget-object v4, v4, Lha/c0;->a:Ljava/lang/String;

    .line 92
    .line 93
    const-string v5, "\u8c03\u5ea6\u670b\u53cb\u5708\u81ea\u52a8\u8f6c\u53d1\u91cd\u8bd5\u5931\u8d25: snsId="

    .line 94
    .line 95
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    invoke-virtual {v2, v4, v1}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    :cond_0
    instance-of v1, p2, Lsf/f;

    .line 103
    .line 104
    if-eqz v1, :cond_1

    .line 105
    .line 106
    const/4 p2, 0x0

    .line 107
    :cond_1
    check-cast p2, Ljava/util/concurrent/ScheduledFuture;

    .line 108
    .line 109
    if-eqz p2, :cond_4

    .line 110
    .line 111
    iput-object p2, p1, Lha/g;->g:Ljava/util/concurrent/ScheduledFuture;

    .line 112
    .line 113
    iget-object v1, p1, Lha/g;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 114
    .line 115
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    if-nez v1, :cond_3

    .line 120
    .line 121
    iget-object v1, p0, Lha/h;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 122
    .line 123
    iget-object v2, p1, Lha/g;->a:Lha/c0;

    .line 124
    .line 125
    iget-object v2, v2, Lha/c0;->a:Ljava/lang/String;

    .line 126
    .line 127
    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    if-eq v1, p1, :cond_2

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_2
    iget-object p1, p1, Lha/g;->a:Lha/c0;

    .line 135
    .line 136
    iget-object p1, p1, Lha/c0;->c:Ljava/lang/String;

    .line 137
    .line 138
    invoke-virtual {p0, p1}, Lha/h;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    new-instance p2, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    const-string p1, "\uff0c300\u79d2\u540e\u91cd\u8bd5\u4e00\u6b21"

    .line 151
    .line 152
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    invoke-virtual {p0, p1}, Lha/h;->i(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    return v3

    .line 163
    :cond_3
    :goto_1
    invoke-interface {p2, v3}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 164
    .line 165
    .line 166
    return p3

    .line 167
    :cond_4
    iget-object p2, p1, Lha/g;->a:Lha/c0;

    .line 168
    .line 169
    iget-object p2, p2, Lha/c0;->a:Ljava/lang/String;

    .line 170
    .line 171
    iget-wide v1, p1, Lha/g;->d:J

    .line 172
    .line 173
    invoke-virtual {p0, v1, v2, p2}, Lha/h;->j(JLjava/lang/String;)Z

    .line 174
    .line 175
    .line 176
    iget-object p1, p1, Lha/g;->a:Lha/c0;

    .line 177
    .line 178
    iget-object p1, p1, Lha/c0;->c:Ljava/lang/String;

    .line 179
    .line 180
    invoke-virtual {p0, p1}, Lha/h;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    new-instance p2, Ljava/lang/StringBuilder;

    .line 185
    .line 186
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    const-string p1, "\uff0c\u5df2\u505c\u6b62\u91cd\u8bd5"

    .line 193
    .line 194
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    invoke-virtual {p0, p1}, Lha/h;->i(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    return p3
.end method

.method public final g(J)Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Lha/h;->j:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-wide v2, p0, Lha/h;->k:J

    .line 7
    .line 8
    cmp-long p1, v2, p1

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    iget-object p1, p0, Lha/h;->b:Landroid/content/SharedPreferences;

    .line 13
    .line 14
    const-string p2, "enable"

    .line 15
    .line 16
    invoke-interface {p1, p2, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    return p1

    .line 24
    :cond_0
    return v1
.end method

.method public final h(Lha/g;)Z
    .locals 2

    .line 1
    iget-object v0, p1, Lha/g;->a:Lha/c0;

    .line 2
    .line 3
    iget-object v0, v0, Lha/c0;->a:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Lha/h;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-ne v0, p1, :cond_0

    .line 12
    .line 13
    iget-object v0, p1, Lha/g;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    iget-wide v0, p1, Lha/g;->d:J

    .line 22
    .line 23
    invoke-virtual {p0, v0, v1}, Lha/h;->g(J)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    const/4 p1, 0x1

    .line 30
    return p1

    .line 31
    :cond_0
    const/4 p1, 0x0

    .line 32
    return p1
.end method

.method public final i(Ljava/lang/String;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lha/h;->b:Landroid/content/SharedPreferences;

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
    sget-object v1, Lha/h;->m:Ljava/lang/Object;

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
    iget-object v0, p0, Lha/h;->b:Landroid/content/SharedPreferences;

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
    const/4 v3, 0x5

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
    iget-object v0, p0, Lha/h;->b:Landroid/content/SharedPreferences;

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

.method public final j(JLjava/lang/String;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lha/h;->e:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0, p1, p2}, Lha/h;->g(J)Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0, p3}, Lha/h;->k(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    :goto_0
    monitor-exit v0

    .line 17
    return p1

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    monitor-exit v0

    .line 20
    throw p1
.end method

.method public final k(Ljava/lang/String;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lha/h;->f:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lha/h;->h:Ljava/util/LinkedHashSet;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    const/4 p1, 0x0

    .line 14
    return p1

    .line 15
    :cond_0
    :try_start_1
    iget-object p1, p0, Lha/h;->h:Ljava/util/LinkedHashSet;

    .line 16
    .line 17
    invoke-static {p1}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    monitor-exit v0

    .line 22
    new-instance v0, Lorg/json/JSONArray;

    .line 23
    .line 24
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    iget-object p1, p0, Lha/h;->b:Landroid/content/SharedPreferences;

    .line 46
    .line 47
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const-string v1, "handled_ids"

    .line 52
    .line 53
    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-nez p1, :cond_2

    .line 66
    .line 67
    iget-object p1, p0, Lha/h;->a:Lab/b;

    .line 68
    .line 69
    const-string v0, "\u4fdd\u5b58\u670b\u53cb\u5708\u81ea\u52a8\u8f6c\u53d1\u53bb\u91cd\u8bb0\u5f55\u5931\u8d25"

    .line 70
    .line 71
    const/4 v1, 0x0

    .line 72
    invoke-virtual {p1, v0, v1}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    :cond_2
    const/4 p1, 0x1

    .line 76
    return p1

    .line 77
    :catchall_0
    move-exception p1

    .line 78
    monitor-exit v0

    .line 79
    throw p1
.end method

.method public final l()J
    .locals 7

    .line 1
    iget-object v0, p0, Lha/h;->b:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    const-string v1, "delay_mode"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    const-string v1, "fixed_delay_seconds"

    .line 13
    .line 14
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-gez v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v2, v0

    .line 22
    :goto_0
    int-to-long v0, v2

    .line 23
    return-wide v0

    .line 24
    :cond_1
    const-string v1, "random_min_seconds"

    .line 25
    .line 26
    const/16 v3, 0x3c

    .line 27
    .line 28
    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-gez v1, :cond_2

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    move v2, v1

    .line 36
    :goto_1
    int-to-long v1, v2

    .line 37
    const-string v3, "random_max_seconds"

    .line 38
    .line 39
    const/16 v4, 0x12c

    .line 40
    .line 41
    invoke-interface {v0, v3, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    int-to-long v3, v0

    .line 46
    cmp-long v0, v3, v1

    .line 47
    .line 48
    if-gez v0, :cond_3

    .line 49
    .line 50
    move-wide v3, v1

    .line 51
    :cond_3
    cmp-long v0, v1, v3

    .line 52
    .line 53
    if-nez v0, :cond_4

    .line 54
    .line 55
    return-wide v1

    .line 56
    :cond_4
    const-wide/16 v5, 0x1

    .line 57
    .line 58
    add-long/2addr v3, v5

    .line 59
    sget-object v0, Ljg/d;->g:Ljg/a;

    .line 60
    .line 61
    invoke-virtual {v0, v1, v2, v3, v4}, Ljg/d;->e(JJ)J

    .line 62
    .line 63
    .line 64
    move-result-wide v0

    .line 65
    return-wide v0
.end method

.method public final n()V
    .locals 5

    .line 1
    iget-object v0, p0, Lha/h;->g:Ljava/lang/Object;

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
    iget-object v2, p0, Lha/h;->b:Landroid/content/SharedPreferences;

    .line 26
    .line 27
    const-string v3, "daily_date"

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

    .line 39
    const/4 v3, 0x0

    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    iget-object v2, p0, Lha/h;->b:Landroid/content/SharedPreferences;

    .line 43
    .line 44
    const-string v4, "daily_count"

    .line 45
    .line 46
    invoke-interface {v2, v4, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-gez v2, :cond_0

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    move v3, v2

    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    move-exception v1

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    :goto_0
    iget-object v2, p0, Lha/h;->b:Landroid/content/SharedPreferences;

    .line 58
    .line 59
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    const-string v4, "daily_date"

    .line 64
    .line 65
    invoke-interface {v2, v4, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    const-string v2, "daily_count"

    .line 70
    .line 71
    add-int/lit8 v3, v3, 0x1

    .line 72
    .line 73
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-nez v1, :cond_2

    .line 82
    .line 83
    iget-object v1, p0, Lha/h;->a:Lab/b;

    .line 84
    .line 85
    const-string v2, "\u4fdd\u5b58\u670b\u53cb\u5708\u81ea\u52a8\u8f6c\u53d1\u6bcf\u65e5\u8ba1\u6570\u5931\u8d25"

    .line 86
    .line 87
    const/4 v3, 0x0

    .line 88
    invoke-virtual {v1, v2, v3}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    .line 90
    .line 91
    :cond_2
    monitor-exit v0

    .line 92
    return-void

    .line 93
    :goto_1
    monitor-exit v0

    .line 94
    throw v1
.end method

.method public final o(Lha/c0;Lp8/v;Lha/t;)Ljava/lang/String;
    .locals 8

    .line 1
    iget-object v0, p0, Lha/h;->b:Landroid/content/SharedPreferences;

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
    iget-object v0, p1, Lha/c0;->g:Ljava/lang/Object;

    .line 16
    .line 17
    :try_start_0
    const-string v1, "isAd"

    .line 18
    .line 19
    new-array v3, v2, [Ljava/lang/Object;

    .line 20
    .line 21
    invoke-static {v0, v1, v3}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 32
    .line 33
    .line 34
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception v0

    .line 37
    new-instance v1, Lsf/f;

    .line 38
    .line 39
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    move-object v0, v1

    .line 43
    :goto_0
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    if-eqz v1, :cond_1

    .line 48
    .line 49
    iget-object v3, p0, Lha/h;->a:Lab/b;

    .line 50
    .line 51
    const-string v4, "\u5224\u65ad\u670b\u53cb\u5708\u5e7f\u544a\u72b6\u6001\u5931\u8d25"

    .line 52
    .line 53
    invoke-virtual {v3, v4, v1}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    :cond_1
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 57
    .line 58
    instance-of v3, v0, Lsf/f;

    .line 59
    .line 60
    if-eqz v3, :cond_2

    .line 61
    .line 62
    move-object v0, v1

    .line 63
    :cond_2
    check-cast v0, Ljava/lang/Boolean;

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_3

    .line 70
    .line 71
    const-string p1, "\u5e7f\u544a\u5185\u5bb9"

    .line 72
    .line 73
    return-object p1

    .line 74
    :cond_3
    invoke-virtual {p0, p1}, Lha/h;->q(Lha/c0;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    return-object v0

    .line 81
    :cond_4
    iget-object v0, p0, Lha/h;->b:Landroid/content/SharedPreferences;

    .line 82
    .line 83
    const-string v1, "enabled_at_seconds"

    .line 84
    .line 85
    const-wide/16 v3, 0x0

    .line 86
    .line 87
    invoke-interface {v0, v1, v3, v4}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 88
    .line 89
    .line 90
    move-result-wide v0

    .line 91
    iget-wide v5, p1, Lha/c0;->d:J

    .line 92
    .line 93
    cmp-long v7, v5, v3

    .line 94
    .line 95
    if-gtz v7, :cond_5

    .line 96
    .line 97
    const-string p1, "\u65e0\u6cd5\u786e\u8ba4\u53d1\u5e03\u65f6\u95f4"

    .line 98
    .line 99
    return-object p1

    .line 100
    :cond_5
    cmp-long v3, v0, v3

    .line 101
    .line 102
    if-lez v3, :cond_24

    .line 103
    .line 104
    cmp-long v0, v5, v0

    .line 105
    .line 106
    if-gez v0, :cond_6

    .line 107
    .line 108
    goto/16 :goto_a

    .line 109
    .line 110
    :cond_6
    sget-object v0, Lha/t;->l:Lha/t;

    .line 111
    .line 112
    if-ne p3, v0, :cond_7

    .line 113
    .line 114
    const-string p1, "\u672a\u77e5\u6216\u5361\u7247\u7c7b\u578b"

    .line 115
    .line 116
    return-object p1

    .line 117
    :cond_7
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    const/4 v1, 0x1

    .line 122
    if-eqz v0, :cond_10

    .line 123
    .line 124
    if-eq v0, v1, :cond_e

    .line 125
    .line 126
    const/4 p1, 0x2

    .line 127
    if-eq v0, p1, :cond_c

    .line 128
    .line 129
    const/4 p1, 0x3

    .line 130
    if-eq v0, p1, :cond_9

    .line 131
    .line 132
    const/4 p1, 0x4

    .line 133
    if-ne v0, p1, :cond_8

    .line 134
    .line 135
    const-string p1, "\u672a\u77e5\u6216\u5361\u7247\u7c7b\u578b"

    .line 136
    .line 137
    return-object p1

    .line 138
    :cond_8
    invoke-static {}, Lokio/a;->k()V

    .line 139
    .line 140
    .line 141
    const/4 p1, 0x0

    .line 142
    return-object p1

    .line 143
    :cond_9
    iget-object p1, p2, Lp8/v;->d:Ljava/util/ArrayList;

    .line 144
    .line 145
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    if-ne p1, v1, :cond_b

    .line 150
    .line 151
    iget-object p1, p2, Lp8/v;->d:Ljava/util/ArrayList;

    .line 152
    .line 153
    invoke-static {p1}, Ltf/m;->H1(Ljava/util/List;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    check-cast p1, Lp8/s;

    .line 158
    .line 159
    iget-object p1, p1, Lp8/s;->f:Lp8/s;

    .line 160
    .line 161
    if-nez p1, :cond_a

    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_a
    iget-object p1, p0, Lha/h;->b:Landroid/content/SharedPreferences;

    .line 165
    .line 166
    const-string p3, "allow_live_photo"

    .line 167
    .line 168
    invoke-interface {p1, p3, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    if-nez p1, :cond_13

    .line 173
    .line 174
    const-string p1, "\u5df2\u8fc7\u6ee4\u5b9e\u51b5\u7c7b\u578b"

    .line 175
    .line 176
    return-object p1

    .line 177
    :cond_b
    :goto_1
    const-string p1, "\u591a\u5f20\u6216\u6df7\u5408\u5b9e\u51b5\u4e0d\u652f\u6301\u81ea\u52a8\u8f6c\u53d1"

    .line 178
    .line 179
    return-object p1

    .line 180
    :cond_c
    iget-object p1, p2, Lp8/v;->d:Ljava/util/ArrayList;

    .line 181
    .line 182
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 183
    .line 184
    .line 185
    move-result p1

    .line 186
    if-eqz p1, :cond_d

    .line 187
    .line 188
    const-string p1, "\u672a\u627e\u5230\u670b\u53cb\u5708\u89c6\u9891"

    .line 189
    .line 190
    return-object p1

    .line 191
    :cond_d
    iget-object p1, p0, Lha/h;->b:Landroid/content/SharedPreferences;

    .line 192
    .line 193
    const-string p3, "allow_video"

    .line 194
    .line 195
    invoke-interface {p1, p3, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 196
    .line 197
    .line 198
    move-result p1

    .line 199
    if-nez p1, :cond_13

    .line 200
    .line 201
    const-string p1, "\u5df2\u8fc7\u6ee4\u89c6\u9891\u7c7b\u578b"

    .line 202
    .line 203
    return-object p1

    .line 204
    :cond_e
    iget-object p1, p2, Lp8/v;->d:Ljava/util/ArrayList;

    .line 205
    .line 206
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 207
    .line 208
    .line 209
    move-result p1

    .line 210
    if-eqz p1, :cond_f

    .line 211
    .line 212
    const-string p1, "\u672a\u627e\u5230\u670b\u53cb\u5708\u56fe\u7247"

    .line 213
    .line 214
    return-object p1

    .line 215
    :cond_f
    iget-object p1, p0, Lha/h;->b:Landroid/content/SharedPreferences;

    .line 216
    .line 217
    const-string p3, "allow_image"

    .line 218
    .line 219
    invoke-interface {p1, p3, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 220
    .line 221
    .line 222
    move-result p1

    .line 223
    if-nez p1, :cond_13

    .line 224
    .line 225
    const-string p1, "\u5df2\u8fc7\u6ee4\u56fe\u7247\u7c7b\u578b"

    .line 226
    .line 227
    return-object p1

    .line 228
    :cond_10
    iget-object v0, p2, Lp8/v;->d:Ljava/util/ArrayList;

    .line 229
    .line 230
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    if-nez v0, :cond_11

    .line 235
    .line 236
    const-string p1, "\u6587\u5b57\u7c7b\u578b\u5305\u542b\u672a\u77e5\u5a92\u4f53"

    .line 237
    .line 238
    return-object p1

    .line 239
    :cond_11
    iget-object v0, p0, Lha/h;->b:Landroid/content/SharedPreferences;

    .line 240
    .line 241
    const-string v3, "allow_text"

    .line 242
    .line 243
    invoke-interface {v0, v3, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    if-nez v0, :cond_12

    .line 248
    .line 249
    const-string p1, "\u5df2\u8fc7\u6ee4\u6587\u5b57\u7c7b\u578b"

    .line 250
    .line 251
    return-object p1

    .line 252
    :cond_12
    invoke-virtual {p0, p1, p2, p3}, Lha/h;->e(Lha/c0;Lp8/v;Lha/t;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 257
    .line 258
    .line 259
    move-result p1

    .line 260
    if-eqz p1, :cond_13

    .line 261
    .line 262
    const-string p1, "\u8f6c\u53d1\u6587\u5b57\u4e3a\u7a7a"

    .line 263
    .line 264
    return-object p1

    .line 265
    :cond_13
    iget-object p1, p0, Lha/h;->b:Landroid/content/SharedPreferences;

    .line 266
    .line 267
    const-string p3, "daily_limit"

    .line 268
    .line 269
    const/16 v0, 0x14

    .line 270
    .line 271
    invoke-interface {p1, p3, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 272
    .line 273
    .line 274
    move-result p1

    .line 275
    if-gez p1, :cond_14

    .line 276
    .line 277
    move p1, v2

    .line 278
    :cond_14
    iget-object p2, p2, Lp8/v;->b:Ljava/lang/String;

    .line 279
    .line 280
    sget-object p3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 281
    .line 282
    invoke-static {p3, p2, p3}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object p2

    .line 286
    iget-object p3, p0, Lha/h;->b:Landroid/content/SharedPreferences;

    .line 287
    .line 288
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 289
    .line 290
    .line 291
    const-string v0, "include_keywords_enable"

    .line 292
    .line 293
    const-string v3, "include_keywords"

    .line 294
    .line 295
    const-string v4, ""

    .line 296
    .line 297
    invoke-interface {p3, v0}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 298
    .line 299
    .line 300
    move-result v5

    .line 301
    if-eqz v5, :cond_15

    .line 302
    .line 303
    invoke-interface {p3, v0, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 304
    .line 305
    .line 306
    move-result p3

    .line 307
    goto :goto_3

    .line 308
    :cond_15
    invoke-interface {p3, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object p3

    .line 312
    if-nez p3, :cond_16

    .line 313
    .line 314
    goto :goto_2

    .line 315
    :cond_16
    move-object v4, p3

    .line 316
    :goto_2
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 317
    .line 318
    .line 319
    move-result p3

    .line 320
    xor-int/2addr p3, v1

    .line 321
    :goto_3
    if-eqz p3, :cond_1a

    .line 322
    .line 323
    iget-object p3, p0, Lha/h;->b:Landroid/content/SharedPreferences;

    .line 324
    .line 325
    const-string v0, "include_keywords"

    .line 326
    .line 327
    const-string v3, ""

    .line 328
    .line 329
    invoke-interface {p3, v0, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object p3

    .line 333
    invoke-static {p3}, Lr9/e0;->T(Ljava/lang/String;)Ljava/util/Set;

    .line 334
    .line 335
    .line 336
    move-result-object p3

    .line 337
    move-object v0, p3

    .line 338
    check-cast v0, Ljava/util/Collection;

    .line 339
    .line 340
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 341
    .line 342
    .line 343
    move-result v0

    .line 344
    if-nez v0, :cond_1a

    .line 345
    .line 346
    check-cast p3, Ljava/lang/Iterable;

    .line 347
    .line 348
    instance-of v0, p3, Ljava/util/Collection;

    .line 349
    .line 350
    if-eqz v0, :cond_17

    .line 351
    .line 352
    move-object v0, p3

    .line 353
    check-cast v0, Ljava/util/Collection;

    .line 354
    .line 355
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 356
    .line 357
    .line 358
    move-result v0

    .line 359
    if-eqz v0, :cond_17

    .line 360
    .line 361
    goto :goto_4

    .line 362
    :cond_17
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 363
    .line 364
    .line 365
    move-result-object p3

    .line 366
    :cond_18
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 367
    .line 368
    .line 369
    move-result v0

    .line 370
    if-eqz v0, :cond_19

    .line 371
    .line 372
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    check-cast v0, Ljava/lang/CharSequence;

    .line 377
    .line 378
    invoke-static {p2, v0, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 379
    .line 380
    .line 381
    move-result v0

    .line 382
    if-eqz v0, :cond_18

    .line 383
    .line 384
    goto :goto_5

    .line 385
    :cond_19
    :goto_4
    const-string p1, "\u672a\u547d\u4e2d\u5305\u542b\u5173\u952e\u8bcd"

    .line 386
    .line 387
    return-object p1

    .line 388
    :cond_1a
    :goto_5
    iget-object p3, p0, Lha/h;->b:Landroid/content/SharedPreferences;

    .line 389
    .line 390
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 391
    .line 392
    .line 393
    const-string v0, "exclude_keywords_enable"

    .line 394
    .line 395
    const-string v3, "exclude_keywords"

    .line 396
    .line 397
    const-string v4, ""

    .line 398
    .line 399
    invoke-interface {p3, v0}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 400
    .line 401
    .line 402
    move-result v5

    .line 403
    if-eqz v5, :cond_1b

    .line 404
    .line 405
    invoke-interface {p3, v0, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 406
    .line 407
    .line 408
    move-result p3

    .line 409
    goto :goto_7

    .line 410
    :cond_1b
    invoke-interface {p3, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object p3

    .line 414
    if-nez p3, :cond_1c

    .line 415
    .line 416
    goto :goto_6

    .line 417
    :cond_1c
    move-object v4, p3

    .line 418
    :goto_6
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 419
    .line 420
    .line 421
    move-result p3

    .line 422
    xor-int/2addr p3, v1

    .line 423
    :goto_7
    const/4 v0, 0x0

    .line 424
    if-eqz p3, :cond_1f

    .line 425
    .line 426
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 427
    .line 428
    .line 429
    move-result p3

    .line 430
    if-nez p3, :cond_1f

    .line 431
    .line 432
    iget-object p3, p0, Lha/h;->b:Landroid/content/SharedPreferences;

    .line 433
    .line 434
    const-string v1, "exclude_keywords"

    .line 435
    .line 436
    const-string v3, ""

    .line 437
    .line 438
    invoke-interface {p3, v1, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object p3

    .line 442
    invoke-static {p3}, Lr9/e0;->T(Ljava/lang/String;)Ljava/util/Set;

    .line 443
    .line 444
    .line 445
    move-result-object p3

    .line 446
    check-cast p3, Ljava/lang/Iterable;

    .line 447
    .line 448
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 449
    .line 450
    .line 451
    move-result-object p3

    .line 452
    :cond_1d
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 453
    .line 454
    .line 455
    move-result v1

    .line 456
    if-eqz v1, :cond_1e

    .line 457
    .line 458
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v1

    .line 462
    move-object v3, v1

    .line 463
    check-cast v3, Ljava/lang/CharSequence;

    .line 464
    .line 465
    invoke-static {p2, v3, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 466
    .line 467
    .line 468
    move-result v3

    .line 469
    if-eqz v3, :cond_1d

    .line 470
    .line 471
    goto :goto_8

    .line 472
    :cond_1e
    move-object v1, v0

    .line 473
    :goto_8
    check-cast v1, Ljava/lang/String;

    .line 474
    .line 475
    if-eqz v1, :cond_1f

    .line 476
    .line 477
    const-string p1, "\u547d\u4e2d\u6392\u9664\u5173\u952e\u8bcd\u201c"

    .line 478
    .line 479
    const-string p2, "\u201d"

    .line 480
    .line 481
    invoke-static {p1, v1, p2}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 482
    .line 483
    .line 484
    move-result-object p1

    .line 485
    return-object p1

    .line 486
    :cond_1f
    if-lez p1, :cond_23

    .line 487
    .line 488
    iget-object p2, p0, Lha/h;->g:Ljava/lang/Object;

    .line 489
    .line 490
    monitor-enter p2

    .line 491
    :try_start_1
    new-instance p3, Ljava/text/SimpleDateFormat;

    .line 492
    .line 493
    const-string v1, "yyyy-MM-dd"

    .line 494
    .line 495
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 496
    .line 497
    invoke-direct {p3, v1, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 498
    .line 499
    .line 500
    new-instance v1, Ljava/util/Date;

    .line 501
    .line 502
    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    .line 503
    .line 504
    .line 505
    invoke-virtual {p3, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    move-result-object p3

    .line 509
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 510
    .line 511
    .line 512
    iget-object v1, p0, Lha/h;->b:Landroid/content/SharedPreferences;

    .line 513
    .line 514
    const-string v3, "daily_date"

    .line 515
    .line 516
    const-string v4, ""

    .line 517
    .line 518
    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 519
    .line 520
    .line 521
    move-result-object v1

    .line 522
    invoke-static {v1, p3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 523
    .line 524
    .line 525
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 526
    iget-object v3, p0, Lha/h;->b:Landroid/content/SharedPreferences;

    .line 527
    .line 528
    if-nez v1, :cond_20

    .line 529
    .line 530
    :try_start_2
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 531
    .line 532
    .line 533
    move-result-object v1

    .line 534
    const-string v3, "daily_date"

    .line 535
    .line 536
    invoke-interface {v1, v3, p3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 537
    .line 538
    .line 539
    move-result-object p3

    .line 540
    const-string v1, "daily_count"

    .line 541
    .line 542
    invoke-interface {p3, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 543
    .line 544
    .line 545
    move-result-object p3

    .line 546
    invoke-interface {p3}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 547
    .line 548
    .line 549
    move-result p3

    .line 550
    if-nez p3, :cond_22

    .line 551
    .line 552
    iget-object p3, p0, Lha/h;->a:Lab/b;

    .line 553
    .line 554
    const-string v1, "\u91cd\u7f6e\u670b\u53cb\u5708\u81ea\u52a8\u8f6c\u53d1\u6bcf\u65e5\u8ba1\u6570\u5931\u8d25"

    .line 555
    .line 556
    invoke-virtual {p3, v1, v0}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    goto :goto_9

    .line 560
    :cond_20
    const-string p3, "daily_count"

    .line 561
    .line 562
    invoke-interface {v3, p3, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 563
    .line 564
    .line 565
    move-result p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 566
    if-gez p3, :cond_21

    .line 567
    .line 568
    goto :goto_9

    .line 569
    :cond_21
    move v2, p3

    .line 570
    :cond_22
    :goto_9
    monitor-exit p2

    .line 571
    if-lt v2, p1, :cond_23

    .line 572
    .line 573
    const-string p1, "\u5df2\u8fbe\u5230\u4eca\u65e5\u8f6c\u53d1\u4e0a\u9650"

    .line 574
    .line 575
    return-object p1

    .line 576
    :catchall_1
    move-exception p1

    .line 577
    monitor-exit p2

    .line 578
    throw p1

    .line 579
    :cond_23
    return-object v0

    .line 580
    :cond_24
    :goto_a
    const-string p1, "\u65e9\u4e8e\u672c\u6b21\u5f00\u542f\u65f6\u95f4"

    .line 581
    .line 582
    return-object p1
.end method

.method public final p(Lha/c0;Lp8/v;Lha/t;JJ)V
    .locals 8

    .line 1
    const-string v1, "\u8c03\u5ea6\u670b\u53cb\u5708\u81ea\u52a8\u8f6c\u53d1\u5931\u8d25: snsId="

    .line 2
    .line 3
    new-instance v2, Lha/g;

    .line 4
    .line 5
    move-object v3, p1

    .line 6
    move-object v4, p2

    .line 7
    move-object v5, p3

    .line 8
    move-wide v6, p4

    .line 9
    invoke-direct/range {v2 .. v7}, Lha/g;-><init>(Lha/c0;Lp8/v;Lha/t;J)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lha/h;->e:Ljava/lang/Object;

    .line 13
    .line 14
    monitor-enter p1

    .line 15
    :try_start_0
    invoke-virtual {p0, v6, v7}, Lha/h;->g(J)Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-eqz p2, :cond_7

    .line 20
    .line 21
    iget-object p2, v3, Lha/c0;->a:Ljava/lang/String;

    .line 22
    .line 23
    iget-object p3, p0, Lha/h;->f:Ljava/lang/Object;

    .line 24
    .line 25
    monitor-enter p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 26
    :try_start_1
    iget-object p4, p0, Lha/h;->h:Ljava/util/LinkedHashSet;

    .line 27
    .line 28
    invoke-virtual {p4, p2}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 32
    :try_start_2
    monitor-exit p3

    .line 33
    if-eqz p2, :cond_0

    .line 34
    .line 35
    goto/16 :goto_2

    .line 36
    .line 37
    :cond_0
    iget-object p2, p0, Lha/h;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 38
    .line 39
    iget-object p3, v3, Lha/c0;->a:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {p2, p3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 45
    if-eqz p2, :cond_1

    .line 46
    .line 47
    monitor-exit p1

    .line 48
    return-void

    .line 49
    :cond_1
    :try_start_3
    iget-object p2, p0, Lha/h;->d:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 50
    .line 51
    new-instance p3, Lha/f;

    .line 52
    .line 53
    const/4 p4, 0x1

    .line 54
    invoke-direct {p3, p0, v2, p4}, Lha/f;-><init>(Lha/h;Lha/g;I)V

    .line 55
    .line 56
    .line 57
    sget-object p4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 58
    .line 59
    invoke-virtual {p2, p3, p6, p7, p4}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 60
    .line 61
    .line 62
    move-result-object p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 63
    goto :goto_0

    .line 64
    :catchall_0
    move-exception v0

    .line 65
    move-object p2, v0

    .line 66
    :try_start_4
    new-instance p3, Lsf/f;

    .line 67
    .line 68
    invoke-direct {p3, p2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    move-object p2, p3

    .line 72
    :goto_0
    invoke-static {p2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 73
    .line 74
    .line 75
    move-result-object p3

    .line 76
    if-eqz p3, :cond_2

    .line 77
    .line 78
    iget-object p4, p0, Lha/h;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 79
    .line 80
    iget-object p5, v3, Lha/c0;->a:Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {p4, p5, v2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    iget-object p4, p0, Lha/h;->a:Lab/b;

    .line 86
    .line 87
    iget-object p5, v3, Lha/c0;->a:Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {v1, p5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p5

    .line 93
    invoke-virtual {p4, p5, p3}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :catchall_1
    move-exception v0

    .line 98
    move-object p2, v0

    .line 99
    goto :goto_3

    .line 100
    :cond_2
    :goto_1
    instance-of p3, p2, Lsf/f;

    .line 101
    .line 102
    if-eqz p3, :cond_3

    .line 103
    .line 104
    const/4 p2, 0x0

    .line 105
    :cond_3
    check-cast p2, Ljava/util/concurrent/ScheduledFuture;

    .line 106
    .line 107
    if-eqz p2, :cond_6

    .line 108
    .line 109
    iput-object p2, v2, Lha/g;->g:Ljava/util/concurrent/ScheduledFuture;

    .line 110
    .line 111
    iget-object p3, v2, Lha/g;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 112
    .line 113
    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 114
    .line 115
    .line 116
    move-result p3

    .line 117
    if-nez p3, :cond_4

    .line 118
    .line 119
    iget-object p3, p0, Lha/h;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 120
    .line 121
    iget-object p4, v3, Lha/c0;->a:Ljava/lang/String;

    .line 122
    .line 123
    invoke-virtual {p3, p4}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p3

    .line 127
    if-eq p3, v2, :cond_5

    .line 128
    .line 129
    :cond_4
    const/4 p3, 0x1

    .line 130
    invoke-interface {p2, p3}, Ljava/util/concurrent/Future;->cancel(Z)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 131
    .line 132
    .line 133
    :cond_5
    monitor-exit p1

    .line 134
    iget-object p1, v3, Lha/c0;->c:Ljava/lang/String;

    .line 135
    .line 136
    invoke-virtual {p0, p1}, Lha/h;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    iget-object p2, v5, Lha/t;->g:Ljava/lang/String;

    .line 141
    .line 142
    const-string p3, "\u5df2\u6355\u6349 "

    .line 143
    .line 144
    const-string p4, " \u7684"

    .line 145
    .line 146
    const-string p5, "\u670b\u53cb\u5708\uff0c"

    .line 147
    .line 148
    invoke-static {p3, p1, p4, p2, p5}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-virtual {p1, p6, p7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    const-string p2, "\u79d2\u540e\u8f6c\u53d1"

    .line 156
    .line 157
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-virtual {p0, p1}, Lha/h;->i(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    :cond_6
    monitor-exit p1

    .line 169
    return-void

    .line 170
    :catchall_2
    move-exception v0

    .line 171
    move-object p2, v0

    .line 172
    :try_start_5
    monitor-exit p3

    .line 173
    throw p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 174
    :cond_7
    :goto_2
    monitor-exit p1

    .line 175
    return-void

    .line 176
    :goto_3
    monitor-exit p1

    .line 177
    throw p2
.end method

.method public final q(Lha/c0;)Ljava/lang/String;
    .locals 6

    .line 1
    iget-object p1, p1, Lha/c0;->c:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v0, p0, Lha/h;->b:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    const-string v1, "targets"

    .line 6
    .line 7
    const-string v2, ""

    .line 8
    .line 9
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Lr9/e0;->S(Ljava/lang/String;)Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    const-string p1, "\u672a\u6307\u5b9a\u597d\u53cb"

    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_0
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    const-string p1, "\u4e0d\u5728\u6307\u5b9a\u597d\u53cb\u4e2d"

    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_1
    const/4 v0, 0x0

    .line 36
    :try_start_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->account()Lg8/a;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    invoke-virtual {v1}, Lg8/a;->c()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception v1

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    move-object v1, v0

    .line 50
    :goto_0
    if-nez v1, :cond_3

    .line 51
    .line 52
    move-object v1, v2

    .line 53
    :cond_3
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    goto :goto_2

    .line 62
    :goto_1
    new-instance v3, Lsf/f;

    .line 63
    .line 64
    invoke-direct {v3, v1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    move-object v1, v3

    .line 68
    :goto_2
    invoke-static {v1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    if-eqz v3, :cond_4

    .line 73
    .line 74
    iget-object v4, p0, Lha/h;->a:Lab/b;

    .line 75
    .line 76
    const-string v5, "\u8bfb\u53d6\u5f53\u524d\u5fae\u4fe1\u8d26\u53f7\u5931\u8d25"

    .line 77
    .line 78
    invoke-virtual {v4, v5, v3}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    :cond_4
    instance-of v3, v1, Lsf/f;

    .line 82
    .line 83
    if-eqz v3, :cond_5

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_5
    move-object v2, v1

    .line 87
    :goto_3
    check-cast v2, Ljava/lang/String;

    .line 88
    .line 89
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-eqz v1, :cond_6

    .line 94
    .line 95
    const-string p1, "\u6682\u65f6\u65e0\u6cd5\u786e\u8ba4\u5f53\u524d\u8d26\u53f7"

    .line 96
    .line 97
    return-object p1

    .line 98
    :cond_6
    invoke-static {p1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-eqz p1, :cond_7

    .line 103
    .line 104
    const-string p1, "\u81ea\u5df1\u7684\u670b\u53cb\u5708"

    .line 105
    .line 106
    return-object p1

    .line 107
    :cond_7
    return-object v0
.end method
