.class public final Lbb/k;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lbb/l;

.field public final b:Lb9/f;

.field public final c:Lab/b;

.field public final d:Lbb/c;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/util/ArrayDeque;

.field public final g:Ljava/util/HashSet;

.field public final h:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public final i:Ljava/util/concurrent/ConcurrentHashMap;

.field public final j:Ljava/util/concurrent/ConcurrentHashMap;

.field public final k:Ljava/util/concurrent/ConcurrentHashMap;

.field public final l:Ljava/util/concurrent/ConcurrentHashMap;

.field public final m:Ljava/util/concurrent/ConcurrentHashMap;

.field public final n:Ljava/util/concurrent/ConcurrentHashMap;

.field public volatile o:Z

.field public volatile p:Z

.field public volatile q:J

.field public volatile r:J


# direct methods
.method public constructor <init>(Lbb/l;Lb9/f;Lab/b;Lbb/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbb/k;->a:Lbb/l;

    .line 5
    .line 6
    iput-object p2, p0, Lbb/k;->b:Lb9/f;

    .line 7
    .line 8
    iput-object p3, p0, Lbb/k;->c:Lab/b;

    .line 9
    .line 10
    iput-object p4, p0, Lbb/k;->d:Lbb/c;

    .line 11
    .line 12
    new-instance p1, Ljava/lang/Object;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lbb/k;->e:Ljava/lang/Object;

    .line 18
    .line 19
    new-instance p1, Ljava/util/ArrayDeque;

    .line 20
    .line 21
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lbb/k;->f:Ljava/util/ArrayDeque;

    .line 25
    .line 26
    new-instance p1, Ljava/util/HashSet;

    .line 27
    .line 28
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lbb/k;->g:Ljava/util/HashSet;

    .line 32
    .line 33
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Lbb/k;->h:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 38
    .line 39
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 40
    .line 41
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lbb/k;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 45
    .line 46
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 47
    .line 48
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object p1, p0, Lbb/k;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 52
    .line 53
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 54
    .line 55
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, Lbb/k;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 59
    .line 60
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 61
    .line 62
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object p1, p0, Lbb/k;->l:Ljava/util/concurrent/ConcurrentHashMap;

    .line 66
    .line 67
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 68
    .line 69
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 70
    .line 71
    .line 72
    iput-object p1, p0, Lbb/k;->m:Ljava/util/concurrent/ConcurrentHashMap;

    .line 73
    .line 74
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 75
    .line 76
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 77
    .line 78
    .line 79
    iput-object p1, p0, Lbb/k;->n:Ljava/util/concurrent/ConcurrentHashMap;

    .line 80
    .line 81
    return-void
.end method

.method public static g(Ljava/lang/String;)Z
    .locals 2

    .line 1
    const-string v0, "@chatroom"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p0, v0, v1}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    const-string v0, "@im.chatroom"

    .line 11
    .line 12
    invoke-static {p0, v0, v1}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return v1

    .line 20
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 21
    return p0
.end method

.method public static h(Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->account()Lg8/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lg8/a;->c()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-nez v0, :cond_1

    .line 14
    .line 15
    const-string v0, ""

    .line 16
    .line 17
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-lez v1, :cond_2

    .line 22
    .line 23
    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_2

    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    return p0

    .line 31
    :cond_2
    const/4 p0, 0x0

    .line 32
    return p0
.end method

.method public static n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "|"

    .line 2
    .line 3
    invoke-static {p0, v0, p1}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method


# virtual methods
.method public final a()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lbb/k;->e:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lbb/k;->p:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    const/4 v0, 0x0

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v1, 0x1

    .line 12
    :try_start_1
    iput-boolean v1, p0, Lbb/k;->p:Z

    .line 13
    .line 14
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 15
    .line 16
    .line 17
    move-result-wide v2

    .line 18
    iput-wide v2, p0, Lbb/k;->q:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    .line 20
    monitor-exit v0

    .line 21
    return v1

    .line 22
    :catchall_0
    move-exception v1

    .line 23
    monitor-exit v0

    .line 24
    throw v1
.end method

.method public final b(JLjava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lbb/k;->n:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/lang/Long;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    cmp-long p1, v1, p1

    .line 17
    .line 18
    if-nez p1, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0, p3}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    :cond_1
    :goto_0
    return-void
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-static {p1}, Lbb/k;->g(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    sget-object v0, Lbb/l;->c:Log/k;

    .line 8
    .line 9
    invoke-static {p2}, Lfb/v0;->A(Ljava/lang/String;)Z

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
    iget-object v0, p0, Lbb/k;->a:Lbb/l;

    .line 17
    .line 18
    invoke-virtual {v0, p2}, Lbb/l;->e(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_3

    .line 23
    .line 24
    iget-object v0, p0, Lbb/k;->h:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 25
    .line 26
    invoke-virtual {v0, p2}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->contains(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    invoke-virtual {p0, p1, p2}, Lbb/k;->e(Ljava/lang/String;Ljava/lang/String;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-static {p1, p2}, Lbb/k;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-object v1, p0, Lbb/k;->e:Ljava/lang/Object;

    .line 44
    .line 45
    monitor-enter v1

    .line 46
    :try_start_0
    iget-object v2, p0, Lbb/k;->g:Ljava/util/HashSet;

    .line 47
    .line 48
    invoke-virtual {v2, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    monitor-exit v1

    .line 55
    return-void

    .line 56
    :cond_2
    :try_start_1
    iget-object v2, p0, Lbb/k;->f:Ljava/util/ArrayDeque;

    .line 57
    .line 58
    new-instance v3, Lsf/e;

    .line 59
    .line 60
    invoke-direct {v3, p1, p2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, v3}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iget-object p1, p0, Lbb/k;->g:Ljava/util/HashSet;

    .line 67
    .line 68
    invoke-virtual {p1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 69
    .line 70
    .line 71
    monitor-exit v1

    .line 72
    invoke-virtual {p0}, Lbb/k;->d()V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :catchall_0
    move-exception p1

    .line 77
    monitor-exit v1

    .line 78
    throw p1

    .line 79
    :cond_3
    :goto_0
    return-void
.end method

.method public final d()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lbb/k;->i()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lbb/k;->e:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-boolean v1, p0, Lbb/k;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    monitor-exit v0

    .line 12
    return-void

    .line 13
    :cond_0
    const/4 v1, 0x1

    .line 14
    :try_start_1
    iput-boolean v1, p0, Lbb/k;->o:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    .line 16
    monitor-exit v0

    .line 17
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->tasks()Lo8/j;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    new-instance v1, Lbb/i;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-direct {v1, p0, v2}, Lbb/i;-><init>(Lbb/k;I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lo8/j;->d(Ljava/lang/Runnable;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    new-instance v0, Ljava/lang/Thread;

    .line 34
    .line 35
    new-instance v1, Lbb/i;

    .line 36
    .line 37
    const/4 v2, 0x1

    .line 38
    invoke-direct {v1, p0, v2}, Lbb/i;-><init>(Lbb/k;I)V

    .line 39
    .line 40
    .line 41
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :catchall_0
    move-exception v1

    .line 49
    monitor-exit v0

    .line 50
    throw v1
.end method

.method public final e(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lbb/k;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-static {p1, p2}, Lbb/k;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Ljava/lang/Long;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 16
    .line 17
    .line 18
    move-result-wide p1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-wide/16 p1, 0x0

    .line 21
    .line 22
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    cmp-long p1, p1, v0

    .line 27
    .line 28
    if-lez p1, :cond_1

    .line 29
    .line 30
    const/4 p1, 0x1

    .line 31
    return p1

    .line 32
    :cond_1
    const/4 p1, 0x0

    .line 33
    return p1
.end method

.method public final f(JLjava/lang/String;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lbb/k;->n:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    check-cast p3, Ljava/lang/Long;

    .line 8
    .line 9
    if-nez p3, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    cmp-long p1, v0, p1

    .line 17
    .line 18
    if-nez p1, :cond_1

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    return p1

    .line 22
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 23
    return p1
.end method

.method public final i()V
    .locals 7

    .line 1
    iget-object v0, p0, Lbb/k;->e:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lbb/k;->p:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_1
    iget-wide v1, p0, Lbb/k;->q:J

    .line 11
    .line 12
    const-wide/16 v3, 0x0

    .line 13
    .line 14
    cmp-long v5, v1, v3

    .line 15
    .line 16
    if-lez v5, :cond_1

    .line 17
    .line 18
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 19
    .line 20
    .line 21
    move-result-wide v5

    .line 22
    sub-long/2addr v5, v1

    .line 23
    const-wide/16 v1, 0x3a98

    .line 24
    .line 25
    cmp-long v1, v5, v1

    .line 26
    .line 27
    if-ltz v1, :cond_1

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    iput-boolean v1, p0, Lbb/k;->p:Z

    .line 31
    .line 32
    iput-wide v3, p0, Lbb/k;->q:J

    .line 33
    .line 34
    iget-object v1, p0, Lbb/k;->h:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->clear()V

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, Lbb/k;->n:Ljava/util/concurrent/ConcurrentHashMap;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception v1

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    :goto_0
    monitor-exit v0

    .line 48
    return-void

    .line 49
    :goto_1
    monitor-exit v0

    .line 50
    throw v1
.end method

.method public final j()V
    .locals 5

    .line 1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->tasks()Lo8/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Ljava/lang/Math;->random()D

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    const-wide/16 v3, 0x2bc

    .line 12
    .line 13
    long-to-double v3, v3

    .line 14
    mul-double/2addr v1, v3

    .line 15
    double-to-long v1, v1

    .line 16
    const-wide/16 v3, 0x320

    .line 17
    .line 18
    add-long/2addr v1, v3

    .line 19
    new-instance v3, Lbb/i;

    .line 20
    .line 21
    const/4 v4, 0x2

    .line 22
    invoke-direct {v3, p0, v4}, Lbb/i;-><init>(Lbb/k;I)V

    .line 23
    .line 24
    .line 25
    const-string v4, "real_tail_resume"

    .line 26
    .line 27
    invoke-virtual {v0, v4, v1, v2, v3}, Lo8/j;->f(Ljava/lang/String;JLjava/lang/Runnable;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public final k()V
    .locals 6

    .line 1
    :catchall_0
    :cond_0
    :goto_0
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lbb/k;->a:Lbb/l;

    .line 3
    .line 4
    iget-object v1, v1, Lbb/l;->a:Landroid/content/SharedPreferences;

    .line 5
    .line 6
    const-string v2, "enable"

    .line 7
    .line 8
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_a

    .line 13
    .line 14
    invoke-virtual {p0}, Lbb/k;->i()V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lbb/k;->e:Ljava/lang/Object;

    .line 18
    .line 19
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 20
    :try_start_1
    iget-boolean v2, p0, Lbb/k;->p:Z

    .line 21
    .line 22
    if-eqz v2, :cond_2

    .line 23
    .line 24
    iput-boolean v0, p0, Lbb/k;->o:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 25
    .line 26
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 27
    iget-object v1, p0, Lbb/k;->e:Ljava/lang/Object;

    .line 28
    .line 29
    monitor-enter v1

    .line 30
    iget-boolean v2, p0, Lbb/k;->p:Z

    .line 31
    .line 32
    if-nez v2, :cond_1

    .line 33
    .line 34
    iget-object v2, p0, Lbb/k;->f:Ljava/util/ArrayDeque;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    iput-boolean v0, p0, Lbb/k;->o:Z

    .line 43
    .line 44
    :cond_1
    monitor-exit v1

    .line 45
    return-void

    .line 46
    :catchall_1
    move-exception v1

    .line 47
    goto/16 :goto_7

    .line 48
    .line 49
    :catchall_2
    move-exception v2

    .line 50
    goto/16 :goto_4

    .line 51
    .line 52
    :cond_2
    :try_start_3
    monitor-exit v1

    .line 53
    iget-object v1, p0, Lbb/k;->e:Ljava/lang/Object;

    .line 54
    .line 55
    monitor-enter v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 56
    :try_start_4
    iget-object v2, p0, Lbb/k;->f:Ljava/util/ArrayDeque;

    .line 57
    .line 58
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_3

    .line 63
    .line 64
    const/4 v2, 0x0

    .line 65
    goto :goto_1

    .line 66
    :cond_3
    iget-object v2, p0, Lbb/k;->f:Ljava/util/ArrayDeque;

    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    move-object v3, v2

    .line 73
    check-cast v3, Lsf/e;

    .line 74
    .line 75
    iget-object v4, p0, Lbb/k;->g:Ljava/util/HashSet;

    .line 76
    .line 77
    iget-object v5, v3, Lsf/e;->g:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v5, Ljava/lang/String;

    .line 80
    .line 81
    iget-object v3, v3, Lsf/e;->h:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v3, Ljava/lang/String;

    .line 84
    .line 85
    invoke-static {v5, v3}, Lbb/k;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-virtual {v4, v3}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    check-cast v2, Lsf/e;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_6

    .line 93
    .line 94
    :goto_1
    :try_start_5
    monitor-exit v1

    .line 95
    if-eqz v2, :cond_8

    .line 96
    .line 97
    iget-object v1, v2, Lsf/e;->g:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v1, Ljava/lang/String;

    .line 100
    .line 101
    iget-object v2, v2, Lsf/e;->h:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v2, Ljava/lang/String;

    .line 104
    .line 105
    iget-object v3, p0, Lbb/k;->a:Lbb/l;

    .line 106
    .line 107
    invoke-virtual {v3, v2}, Lbb/l;->e(Ljava/lang/String;)Z

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    if-nez v3, :cond_0

    .line 112
    .line 113
    iget-object v3, p0, Lbb/k;->h:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 114
    .line 115
    invoke-virtual {v3, v2}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->contains(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    if-nez v3, :cond_0

    .line 120
    .line 121
    invoke-virtual {p0, v1, v2}, Lbb/k;->e(Ljava/lang/String;Ljava/lang/String;)Z

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    if-eqz v3, :cond_4

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_4
    iget-object v3, p0, Lbb/k;->b:Lb9/f;

    .line 129
    .line 130
    invoke-virtual {v3}, Lb9/f;->c()Z

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    if-nez v3, :cond_5

    .line 135
    .line 136
    invoke-virtual {p0, v1, v2}, Lbb/k;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 137
    .line 138
    .line 139
    const-wide/16 v0, 0x320

    .line 140
    .line 141
    :try_start_6
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 142
    .line 143
    .line 144
    goto/16 :goto_0

    .line 145
    .line 146
    :cond_5
    :try_start_7
    invoke-virtual {p0}, Lbb/k;->a()Z

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    if-nez v3, :cond_6

    .line 151
    .line 152
    invoke-virtual {p0, v1, v2}, Lbb/k;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    goto/16 :goto_0

    .line 156
    .line 157
    :cond_6
    invoke-virtual {p0, v1, v2, v0}, Lbb/k;->m(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 158
    .line 159
    .line 160
    iget-object v1, p0, Lbb/k;->e:Ljava/lang/Object;

    .line 161
    .line 162
    monitor-enter v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 163
    :try_start_8
    iput-boolean v0, p0, Lbb/k;->o:Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 164
    .line 165
    :try_start_9
    monitor-exit v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 166
    iget-object v1, p0, Lbb/k;->e:Ljava/lang/Object;

    .line 167
    .line 168
    monitor-enter v1

    .line 169
    :try_start_a
    iget-boolean v2, p0, Lbb/k;->p:Z

    .line 170
    .line 171
    if-nez v2, :cond_7

    .line 172
    .line 173
    iget-object v2, p0, Lbb/k;->f:Ljava/util/ArrayDeque;

    .line 174
    .line 175
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 176
    .line 177
    .line 178
    move-result v2

    .line 179
    if-eqz v2, :cond_7

    .line 180
    .line 181
    iput-boolean v0, p0, Lbb/k;->o:Z
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 182
    .line 183
    goto :goto_2

    .line 184
    :catchall_3
    move-exception v0

    .line 185
    goto :goto_3

    .line 186
    :cond_7
    :goto_2
    monitor-exit v1

    .line 187
    return-void

    .line 188
    :goto_3
    monitor-exit v1

    .line 189
    throw v0

    .line 190
    :catchall_4
    move-exception v2

    .line 191
    :try_start_b
    monitor-exit v1

    .line 192
    throw v2

    .line 193
    :cond_8
    iget-object v1, p0, Lbb/k;->e:Ljava/lang/Object;

    .line 194
    .line 195
    monitor-enter v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 196
    :try_start_c
    iput-boolean v0, p0, Lbb/k;->o:Z
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 197
    .line 198
    :try_start_d
    monitor-exit v1
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    .line 199
    iget-object v1, p0, Lbb/k;->e:Ljava/lang/Object;

    .line 200
    .line 201
    monitor-enter v1

    .line 202
    iget-boolean v2, p0, Lbb/k;->p:Z

    .line 203
    .line 204
    if-nez v2, :cond_9

    .line 205
    .line 206
    iget-object v2, p0, Lbb/k;->f:Ljava/util/ArrayDeque;

    .line 207
    .line 208
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 209
    .line 210
    .line 211
    move-result v2

    .line 212
    if-eqz v2, :cond_9

    .line 213
    .line 214
    iput-boolean v0, p0, Lbb/k;->o:Z

    .line 215
    .line 216
    :cond_9
    monitor-exit v1

    .line 217
    return-void

    .line 218
    :catchall_5
    move-exception v2

    .line 219
    :try_start_e
    monitor-exit v1

    .line 220
    throw v2

    .line 221
    :catchall_6
    move-exception v2

    .line 222
    monitor-exit v1

    .line 223
    throw v2

    .line 224
    :goto_4
    monitor-exit v1

    .line 225
    throw v2
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    .line 226
    :cond_a
    iget-object v1, p0, Lbb/k;->e:Ljava/lang/Object;

    .line 227
    .line 228
    monitor-enter v1

    .line 229
    :try_start_f
    iget-boolean v2, p0, Lbb/k;->p:Z

    .line 230
    .line 231
    if-nez v2, :cond_b

    .line 232
    .line 233
    iget-object v2, p0, Lbb/k;->f:Ljava/util/ArrayDeque;

    .line 234
    .line 235
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 236
    .line 237
    .line 238
    move-result v2

    .line 239
    if-eqz v2, :cond_b

    .line 240
    .line 241
    iput-boolean v0, p0, Lbb/k;->o:Z
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    .line 242
    .line 243
    goto :goto_5

    .line 244
    :catchall_7
    move-exception v0

    .line 245
    goto :goto_6

    .line 246
    :cond_b
    :goto_5
    monitor-exit v1

    .line 247
    goto :goto_8

    .line 248
    :goto_6
    monitor-exit v1

    .line 249
    throw v0

    .line 250
    :goto_7
    :try_start_10
    iget-object v2, p0, Lbb/k;->c:Lab/b;

    .line 251
    .line 252
    const-string v3, "\u5b9e\u540d\u5c3e\u5b57\u961f\u5217\u5f02\u5e38"

    .line 253
    .line 254
    invoke-virtual {v2, v3, v1}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_9

    .line 255
    .line 256
    .line 257
    iget-object v1, p0, Lbb/k;->e:Ljava/lang/Object;

    .line 258
    .line 259
    monitor-enter v1

    .line 260
    :try_start_11
    iget-boolean v2, p0, Lbb/k;->p:Z

    .line 261
    .line 262
    if-nez v2, :cond_b

    .line 263
    .line 264
    iget-object v2, p0, Lbb/k;->f:Ljava/util/ArrayDeque;

    .line 265
    .line 266
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 267
    .line 268
    .line 269
    move-result v2

    .line 270
    if-eqz v2, :cond_b

    .line 271
    .line 272
    iput-boolean v0, p0, Lbb/k;->o:Z
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    .line 273
    .line 274
    goto :goto_5

    .line 275
    :catchall_8
    move-exception v0

    .line 276
    goto :goto_9

    .line 277
    :goto_8
    return-void

    .line 278
    :goto_9
    monitor-exit v1

    .line 279
    throw v0

    .line 280
    :catchall_9
    move-exception v1

    .line 281
    iget-object v2, p0, Lbb/k;->e:Ljava/lang/Object;

    .line 282
    .line 283
    monitor-enter v2

    .line 284
    :try_start_12
    iget-boolean v3, p0, Lbb/k;->p:Z

    .line 285
    .line 286
    if-nez v3, :cond_c

    .line 287
    .line 288
    iget-object v3, p0, Lbb/k;->f:Ljava/util/ArrayDeque;

    .line 289
    .line 290
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 291
    .line 292
    .line 293
    move-result v3

    .line 294
    if-eqz v3, :cond_c

    .line 295
    .line 296
    iput-boolean v0, p0, Lbb/k;->o:Z
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_a

    .line 297
    .line 298
    goto :goto_a

    .line 299
    :catchall_a
    move-exception v0

    .line 300
    goto :goto_b

    .line 301
    :cond_c
    :goto_a
    monitor-exit v2

    .line 302
    throw v1

    .line 303
    :goto_b
    monitor-exit v2

    .line 304
    throw v0
.end method

.method public final l()V
    .locals 3

    .line 1
    iget-object v0, p0, Lbb/k;->e:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :try_start_0
    iput-boolean v1, p0, Lbb/k;->p:Z

    .line 6
    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    iput-wide v1, p0, Lbb/k;->q:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    monitor-exit v0

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v1

    .line 14
    monitor-exit v0

    .line 15
    throw v1
.end method

.method public final m(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 11

    .line 1
    invoke-static {p1, p2}, Lbb/k;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lbb/k;->h:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 6
    .line 7
    invoke-virtual {v1, p2}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lbb/k;->e:Ljava/lang/Object;

    .line 11
    .line 12
    monitor-enter v1

    .line 13
    :try_start_0
    iget-wide v2, p0, Lbb/k;->r:J

    .line 14
    .line 15
    const-wide/16 v4, 0x1

    .line 16
    .line 17
    add-long/2addr v2, v4

    .line 18
    iput-wide v2, p0, Lbb/k;->r:J

    .line 19
    .line 20
    iget-object v2, p0, Lbb/k;->n:Ljava/util/concurrent/ConcurrentHashMap;

    .line 21
    .line 22
    iget-wide v3, p0, Lbb/k;->r:J

    .line 23
    .line 24
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v2, v0, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    iget-wide v8, p0, Lbb/k;->r:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    monitor-exit v1

    .line 34
    new-instance v0, Ljava/lang/Thread;

    .line 35
    .line 36
    new-instance v4, Lbb/h;

    .line 37
    .line 38
    const/4 v10, 0x1

    .line 39
    move-object v5, p0

    .line 40
    move-object v6, p1

    .line 41
    move-object v7, p2

    .line 42
    invoke-direct/range {v4 .. v10}, Lbb/h;-><init>(Lbb/k;Ljava/lang/String;Ljava/lang/String;JI)V

    .line 43
    .line 44
    .line 45
    invoke-direct {v0, v4}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 49
    .line 50
    .line 51
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->tasks()Lo8/j;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    new-instance v4, Lbb/h;

    .line 56
    .line 57
    const/4 v10, 0x0

    .line 58
    move-object v5, v7

    .line 59
    move-object v7, v6

    .line 60
    move-object v6, v5

    .line 61
    move-object v5, p0

    .line 62
    invoke-direct/range {v4 .. v10}, Lbb/h;-><init>(Lbb/k;Ljava/lang/String;Ljava/lang/String;JI)V

    .line 63
    .line 64
    .line 65
    if-eqz p3, :cond_1

    .line 66
    .line 67
    if-eqz p1, :cond_0

    .line 68
    .line 69
    invoke-virtual {p1, v4}, Lo8/j;->e(Ljava/lang/Runnable;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_0
    invoke-virtual {v4}, Lbb/h;->run()V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_1
    if-eqz p1, :cond_2

    .line 78
    .line 79
    invoke-virtual {p1, v4}, Lo8/j;->e(Ljava/lang/Runnable;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_2
    invoke-virtual {v4}, Lbb/h;->run()V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :catchall_0
    move-exception v0

    .line 88
    move-object p1, v0

    .line 89
    monitor-exit v1

    .line 90
    throw p1
.end method
