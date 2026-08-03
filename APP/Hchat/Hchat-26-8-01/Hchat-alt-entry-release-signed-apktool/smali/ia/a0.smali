.class public final Lia/a0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lr8/g;

.field public final b:Lb5/c;

.field public final c:Lia/h;

.field public final d:Lab/b;

.field public final e:Landroid/content/SharedPreferences;

.field public final f:Ljava/util/Set;

.field public final g:Ljava/util/Set;

.field public final h:Landroid/os/Handler;

.field public final i:Ljava/util/concurrent/ExecutorService;

.field public final j:Ljava/lang/ThreadLocal;

.field public final k:Ljava/lang/Object;

.field public final l:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final m:Lsf/i;

.field public volatile n:Z

.field public volatile o:Z


# direct methods
.method public constructor <init>(Lr8/g;Lb5/c;Lia/h;Lab/b;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lia/a0;->a:Lr8/g;

    .line 8
    .line 9
    iput-object p2, p0, Lia/a0;->b:Lb5/c;

    .line 10
    .line 11
    iput-object p3, p0, Lia/a0;->c:Lia/h;

    .line 12
    .line 13
    iput-object p4, p0, Lia/a0;->d:Lab/b;

    .line 14
    .line 15
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 16
    .line 17
    const-string p2, "Hchat_moments_fake_interaction_config"

    .line 18
    .line 19
    invoke-static {p1, p2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Lia/a0;->e:Landroid/content/SharedPreferences;

    .line 24
    .line 25
    invoke-static {}, Lj8/b;->o()Ljava/util/Set;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Lia/a0;->f:Ljava/util/Set;

    .line 30
    .line 31
    invoke-static {}, Lj8/b;->o()Ljava/util/Set;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, Lia/a0;->g:Ljava/util/Set;

    .line 36
    .line 37
    new-instance p1, Landroid/os/Handler;

    .line 38
    .line 39
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Lia/a0;->h:Landroid/os/Handler;

    .line 47
    .line 48
    new-instance p1, Lc9/q;

    .line 49
    .line 50
    const/16 p2, 0x10

    .line 51
    .line 52
    invoke-direct {p1, p2}, Lc9/q;-><init>(I)V

    .line 53
    .line 54
    .line 55
    invoke-static {p1}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iput-object p1, p0, Lia/a0;->i:Ljava/util/concurrent/ExecutorService;

    .line 60
    .line 61
    new-instance p1, Ljava/lang/ThreadLocal;

    .line 62
    .line 63
    invoke-direct {p1}, Ljava/lang/ThreadLocal;-><init>()V

    .line 64
    .line 65
    .line 66
    iput-object p1, p0, Lia/a0;->j:Ljava/lang/ThreadLocal;

    .line 67
    .line 68
    new-instance p1, Ljava/lang/Object;

    .line 69
    .line 70
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 71
    .line 72
    .line 73
    iput-object p1, p0, Lia/a0;->k:Ljava/lang/Object;

    .line 74
    .line 75
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 76
    .line 77
    const/4 p2, 0x0

    .line 78
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 79
    .line 80
    .line 81
    iput-object p1, p0, Lia/a0;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 82
    .line 83
    new-instance p1, Lia/x;

    .line 84
    .line 85
    invoke-direct {p1, p0, p2}, Lia/x;-><init>(Lia/a0;I)V

    .line 86
    .line 87
    .line 88
    new-instance p2, Lsf/i;

    .line 89
    .line 90
    invoke-direct {p2, p1}, Lsf/i;-><init>(Lfg/a;)V

    .line 91
    .line 92
    .line 93
    iput-object p2, p0, Lia/a0;->m:Lsf/i;

    .line 94
    .line 95
    return-void
.end method

.method public static b(Ljava/lang/Object;)[B
    .locals 3

    .line 1
    const-string v0, "field_attrBuf"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v1, v0, [B

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    check-cast v0, [B

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, v2

    .line 16
    :goto_0
    if-eqz v0, :cond_1

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_1
    const-string v0, "attrBuf"

    .line 20
    .line 21
    invoke-static {p0, v0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    instance-of v0, p0, [B

    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    check-cast p0, [B

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_2
    return-object v2
.end method

.method public static c()Landroid/app/Activity;
    .locals 3

    .line 1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->currentActivity()Lq8/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lq8/o;->a()Landroid/app/Activity;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v1

    .line 14
    :goto_0
    if-eqz v0, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    move-object v0, v1

    .line 18
    :goto_1
    if-eqz v0, :cond_4

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_3

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_2
    const/4 v2, 0x0

    .line 34
    goto :goto_3

    .line 35
    :cond_3
    :goto_2
    const/4 v2, 0x1

    .line 36
    :goto_3
    if-nez v2, :cond_4

    .line 37
    .line 38
    return-object v0

    .line 39
    :cond_4
    return-object v1
.end method

.method public static g(Lia/c;)Lia/c;
    .locals 8

    .line 1
    iget-object v0, p0, Lia/c;->a:Ljava/util/List;

    .line 2
    .line 3
    iget-object v1, p0, Lia/c;->c:Ljava/util/List;

    .line 4
    .line 5
    invoke-static {v0, v1}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Ljava/util/HashSet;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v2, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    move-object v4, v3

    .line 34
    check-cast v4, Lia/d;

    .line 35
    .line 36
    iget-object v4, v4, Lia/d;->a:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_0

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    iget-object v0, p0, Lia/c;->b:Ljava/util/List;

    .line 49
    .line 50
    iget-object p0, p0, Lia/c;->d:Ljava/util/List;

    .line 51
    .line 52
    invoke-static {v0, p0}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    new-instance v0, Ljava/util/HashSet;

    .line 57
    .line 58
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 59
    .line 60
    .line 61
    new-instance v1, Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-eqz v3, :cond_3

    .line 75
    .line 76
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    move-object v4, v3

    .line 81
    check-cast v4, Lia/b;

    .line 82
    .line 83
    new-instance v5, Lsf/j;

    .line 84
    .line 85
    iget-object v6, v4, Lia/b;->a:Ljava/lang/String;

    .line 86
    .line 87
    iget-object v7, v4, Lia/b;->b:Ljava/lang/String;

    .line 88
    .line 89
    iget-object v4, v4, Lia/b;->d:Ljava/lang/String;

    .line 90
    .line 91
    invoke-direct {v5, v6, v7, v4}, Lsf/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    if-eqz v4, :cond_2

    .line 99
    .line 100
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_3
    new-instance p0, Lia/c;

    .line 105
    .line 106
    const/16 v0, 0xc

    .line 107
    .line 108
    invoke-direct {p0, v0, v2, v1}, Lia/c;-><init>(ILjava/util/List;Ljava/util/List;)V

    .line 109
    .line 110
    .line 111
    return-object p0
.end method

.method public static j(Lia/c;Lia/c;)Lia/c;
    .locals 7

    .line 1
    invoke-static {p0}, Lia/a0;->g(Lia/c;)Lia/c;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p1}, Lia/a0;->g(Lia/c;)Lia/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v0, p0, Lia/c;->a:Ljava/util/List;

    .line 10
    .line 11
    iget-object v1, p1, Lia/c;->a:Ljava/util/List;

    .line 12
    .line 13
    invoke-static {v0, v1}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Ljava/util/HashSet;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 20
    .line 21
    .line 22
    new-instance v2, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    move-object v4, v3

    .line 42
    check-cast v4, Lia/d;

    .line 43
    .line 44
    iget-object v4, v4, Lia/d;->a:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_0

    .line 51
    .line 52
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    iget-object p0, p0, Lia/c;->b:Ljava/util/List;

    .line 57
    .line 58
    iget-object p1, p1, Lia/c;->b:Ljava/util/List;

    .line 59
    .line 60
    invoke-static {p0, p1}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    new-instance p1, Ljava/util/HashSet;

    .line 65
    .line 66
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 67
    .line 68
    .line 69
    new-instance v0, Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-eqz v1, :cond_3

    .line 83
    .line 84
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    move-object v3, v1

    .line 89
    check-cast v3, Lia/b;

    .line 90
    .line 91
    new-instance v4, Lsf/j;

    .line 92
    .line 93
    iget-object v5, v3, Lia/b;->a:Ljava/lang/String;

    .line 94
    .line 95
    iget-object v6, v3, Lia/b;->b:Ljava/lang/String;

    .line 96
    .line 97
    iget-object v3, v3, Lia/b;->d:Ljava/lang/String;

    .line 98
    .line 99
    invoke-direct {v4, v5, v6, v3}, Lsf/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    if-eqz v3, :cond_2

    .line 107
    .line 108
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_3
    new-instance p0, Lia/c;

    .line 113
    .line 114
    const/16 p1, 0xc

    .line 115
    .line 116
    invoke-direct {p0, p1, v2, v0}, Lia/c;-><init>(ILjava/util/List;Ljava/util/List;)V

    .line 117
    .line 118
    .line 119
    return-object p0
.end method

.method public static q(Ljava/lang/Object;)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "field_snsId"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string v0, "snsId"

    .line 11
    .line 12
    invoke-static {p0, v0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_3

    .line 17
    .line 18
    :goto_0
    instance-of p0, v0, Ljava/lang/Number;

    .line 19
    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    check-cast v0, Ljava/lang/Number;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0}, Log/t;->g0(Ljava/lang/String;)Ljava/lang/Long;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    if-eqz p0, :cond_3

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 40
    .line 41
    .line 42
    move-result-wide v0

    .line 43
    :goto_1
    const-wide/16 v2, 0x0

    .line 44
    .line 45
    cmp-long p0, v0, v2

    .line 46
    .line 47
    if-nez p0, :cond_2

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    invoke-static {v0, v1}, Ljava/lang/Long;->toUnsignedString(J)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :cond_3
    :goto_2
    const/4 p0, 0x0

    .line 56
    return-object p0
.end method


# virtual methods
.method public final a(Landroid/app/Activity;Lp8/l;Lia/c;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v5, p2, Lp8/l;->a:Ljava/lang/String;

    .line 8
    .line 9
    if-eqz v5, :cond_0

    .line 10
    .line 11
    new-instance v0, Lc9/r0;

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    move-object v3, p0

    .line 15
    move-object v2, p1

    .line 16
    move-object v4, p2

    .line 17
    move-object v6, p3

    .line 18
    invoke-direct/range {v0 .. v6}, Lc9/r0;-><init>(ILandroid/app/Activity;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lia/a0;->r(Lfg/a;)Z

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    move-object v3, p0

    .line 26
    return-void
.end method

.method public final d(Lia/c;)Lia/c;
    .locals 4

    .line 1
    new-instance v0, Lia/c;

    .line 2
    .line 3
    invoke-virtual {p0}, Lia/a0;->f()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    sget-object v2, Ltf/t;->g:Ltf/t;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p1, Lia/c;->a:Ljava/util/List;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v1, v2

    .line 15
    :goto_0
    invoke-virtual {p0}, Lia/a0;->e()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    iget-object v2, p1, Lia/c;->b:Ljava/util/List;

    .line 22
    .line 23
    :cond_1
    const/16 p1, 0xc

    .line 24
    .line 25
    invoke-direct {v0, p1, v1, v2}, Lia/c;-><init>(ILjava/util/List;Ljava/util/List;)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public final e()Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Lia/a0;->n:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-boolean v0, p0, Lia/a0;->o:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lia/a0;->e:Landroid/content/SharedPreferences;

    .line 11
    .line 12
    const-string v2, "fake_comment_enable"

    .line 13
    .line 14
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    return v0

    .line 22
    :cond_0
    return v1
.end method

.method public final f()Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Lia/a0;->n:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lia/a0;->e:Landroid/content/SharedPreferences;

    .line 7
    .line 8
    const-string v2, "fake_like_enable"

    .line 9
    .line 10
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    return v0

    .line 18
    :cond_0
    return v1
.end method

.method public final h(Ljava/lang/String;Ljava/lang/Object;Lia/c;Lia/c;ZZ)Z
    .locals 7

    .line 1
    invoke-static {p2}, Lia/a0;->b(Ljava/lang/Object;)[B

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    const/4 v6, 0x0

    .line 6
    if-eqz v1, :cond_7

    .line 7
    .line 8
    iget-object v0, p0, Lia/a0;->c:Lia/h;

    .line 9
    .line 10
    move-object v2, p3

    .line 11
    move-object v3, p4

    .line 12
    move v4, p5

    .line 13
    move v5, p6

    .line 14
    invoke-virtual/range {v0 .. v5}, Lia/h;->d([BLia/c;Lia/c;ZZ)Lia/a;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    iget-boolean p4, p3, Lia/a;->b:Z

    .line 19
    .line 20
    const/4 p5, 0x1

    .line 21
    if-nez p4, :cond_0

    .line 22
    .line 23
    return p5

    .line 24
    :cond_0
    iget-object p3, p3, Lia/a;->a:[B

    .line 25
    .line 26
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object p4

    .line 30
    const-string p6, "setAttrBuf"

    .line 31
    .line 32
    filled-new-array {p3}, [Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {p4, p6, v0}, Lh/Hchat/utils/KavaReflector;->findCompatibleMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 37
    .line 38
    .line 39
    move-result-object p4

    .line 40
    if-eqz p4, :cond_1

    .line 41
    .line 42
    filled-new-array {p3}, [Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p3

    .line 46
    invoke-static {p4, p2, p3}, Lh/Hchat/utils/KavaReflector;->invokeSuccessfully(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p3

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move p3, v6

    .line 52
    :goto_0
    if-nez p3, :cond_2

    .line 53
    .line 54
    goto :goto_4

    .line 55
    :cond_2
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->snsApi()Lp8/d0;

    .line 56
    .line 57
    .line 58
    move-result-object p3

    .line 59
    if-eqz p3, :cond_6

    .line 60
    .line 61
    new-instance p4, Laa/c;

    .line 62
    .line 63
    const/16 p6, 0x19

    .line 64
    .line 65
    invoke-direct {p4, p3, p6, p2}, Laa/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iget-object p2, p3, Lp8/d0;->j:Ljava/lang/Object;

    .line 69
    .line 70
    invoke-interface {p2}, Lsf/c;->getValue()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    check-cast p2, Lp8/e0;

    .line 75
    .line 76
    if-eqz p2, :cond_5

    .line 77
    .line 78
    iget-object p2, p2, Lp8/e0;->g:Ljava/lang/ThreadLocal;

    .line 79
    .line 80
    invoke-virtual {p2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p3

    .line 84
    check-cast p3, Ljava/lang/Boolean;

    .line 85
    .line 86
    sget-object p6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 87
    .line 88
    invoke-virtual {p2, p6}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :try_start_0
    invoke-virtual {p4}, Laa/c;->invoke()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    if-nez p3, :cond_3

    .line 96
    .line 97
    invoke-virtual {p2}, Ljava/lang/ThreadLocal;->remove()V

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_3
    invoke-virtual {p2, p3}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :goto_1
    check-cast p4, Ljava/lang/Boolean;

    .line 105
    .line 106
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 107
    .line 108
    .line 109
    move-result p2

    .line 110
    goto :goto_3

    .line 111
    :catchall_0
    move-exception v0

    .line 112
    move-object p1, v0

    .line 113
    if-nez p3, :cond_4

    .line 114
    .line 115
    invoke-virtual {p2}, Ljava/lang/ThreadLocal;->remove()V

    .line 116
    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_4
    invoke-virtual {p2, p3}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    :goto_2
    throw p1

    .line 123
    :cond_5
    invoke-virtual {p4}, Laa/c;->invoke()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    check-cast p2, Ljava/lang/Boolean;

    .line 128
    .line 129
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 130
    .line 131
    .line 132
    move-result p2

    .line 133
    :goto_3
    if-ne p2, p5, :cond_6

    .line 134
    .line 135
    move v6, p5

    .line 136
    :cond_6
    if-nez v6, :cond_7

    .line 137
    .line 138
    new-instance p2, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    const-string p3, "\u5199\u5165\u670b\u53cb\u5708\u4f2a\u4e92\u52a8\u539f\u751f\u7f13\u5b58\u5931\u8d25: snsId="

    .line 141
    .line 142
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    const/4 p2, 0x0

    .line 153
    iget-object p3, p0, Lia/a0;->d:Lab/b;

    .line 154
    .line 155
    invoke-virtual {p3, p1, p2}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    :cond_7
    :goto_4
    return v6
.end method

.method public final i(Ljava/lang/Object;)V
    .locals 9

    .line 1
    iget-object v1, p0, Lia/a0;->b:Lb5/c;

    .line 2
    .line 3
    iget-object v0, p0, Lia/a0;->j:Ljava/lang/ThreadLocal;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_3

    .line 16
    .line 17
    if-eqz p1, :cond_3

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v2, "com.tencent.mm.plugin.sns.storage.SnsInfo"

    .line 28
    .line 29
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-static {p1}, Lia/a0;->q(Ljava/lang/Object;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    monitor-enter v1

    .line 43
    :try_start_0
    invoke-virtual {v1}, Lb5/c;->J()Ljava/util/LinkedHashMap;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v2, v0}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    monitor-exit v1

    .line 52
    if-nez v2, :cond_1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    invoke-static {p1}, Lia/a0;->b(Ljava/lang/Object;)[B

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    if-eqz v4, :cond_3

    .line 60
    .line 61
    invoke-virtual {v1, v0}, Lb5/c;->l(Ljava/lang/String;)Lia/c;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iget-object v3, p0, Lia/a0;->c:Lia/h;

    .line 66
    .line 67
    invoke-virtual {p0, v0}, Lia/a0;->d(Lia/c;)Lia/c;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    invoke-static {v0}, Lia/a0;->g(Lia/c;)Lia/c;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    invoke-virtual {p0}, Lia/a0;->f()Z

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    invoke-virtual {p0}, Lia/a0;->e()Z

    .line 80
    .line 81
    .line 82
    move-result v8

    .line 83
    invoke-virtual/range {v3 .. v8}, Lia/h;->d([BLia/c;Lia/c;ZZ)Lia/a;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    iget-boolean v1, v0, Lia/a;->b:Z

    .line 88
    .line 89
    if-eqz v1, :cond_3

    .line 90
    .line 91
    iget-object v0, v0, Lia/a;->a:[B

    .line 92
    .line 93
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    const-string v2, "setAttrBuf"

    .line 98
    .line 99
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    invoke-static {v1, v2, v3}, Lh/Hchat/utils/KavaReflector;->findCompatibleMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    if-eqz v1, :cond_2

    .line 108
    .line 109
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-static {v1, p1, v0}, Lh/Hchat/utils/KavaReflector;->invokeSuccessfully(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    :cond_2
    return-void

    .line 117
    :catchall_0
    move-exception v0

    .line 118
    move-object p1, v0

    .line 119
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 120
    throw p1

    .line 121
    :cond_3
    :goto_0
    return-void
.end method

.method public final k(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lia/a0;->l(Landroid/view/View;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    instance-of v0, p1, Landroid/widget/AbsListView;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    move-object v0, p1

    .line 12
    check-cast v0, Landroid/widget/AbsListView;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/widget/AbsListView;->invalidateViews()V

    .line 15
    .line 16
    .line 17
    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    check-cast p1, Landroid/view/ViewGroup;

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v1, 0x0

    .line 28
    :goto_0
    if-lt v1, v0, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v2}, Lia/a0;->k(Landroid/view/View;)V

    .line 39
    .line 40
    .line 41
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    :goto_1
    return-void
.end method

.method public final l(Landroid/view/View;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lia/a0;->m:Lsf/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lsf/i;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Class;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string v0, "getAdapter"

    .line 20
    .line 21
    new-array v2, v1, [Ljava/lang/Object;

    .line 22
    .line 23
    invoke-static {p1, v0, v2}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const-string v0, "notifyDataSetChanged"

    .line 28
    .line 29
    new-array v1, v1, [Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {p1, v0, v1}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    const/4 p1, 0x1

    .line 35
    return p1

    .line 36
    :cond_1
    :goto_0
    return v1
.end method

.method public final m(Ljava/lang/String;)Lp8/f;
    .locals 4

    .line 1
    iget-object v0, p0, Lia/a0;->j:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/lang/Boolean;

    .line 8
    .line 9
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {v0, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    :try_start_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->snsApi()Lp8/d0;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {v2, p1}, Lp8/d0;->c(Ljava/lang/String;)Lp8/f;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    new-instance p1, Lp8/f;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-direct {p1, v3, v2}, Lp8/f;-><init>(Ljava/lang/Object;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    :goto_0
    if-nez v1, :cond_1

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    .line 37
    .line 38
    .line 39
    return-object p1

    .line 40
    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-object p1

    .line 44
    :goto_1
    if-nez v1, :cond_2

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    .line 47
    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    :goto_2
    throw p1
.end method

.method public final n(Landroid/app/Activity;Landroid/view/View;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object v5

    .line 11
    if-eqz v5, :cond_0

    .line 12
    .line 13
    new-instance v1, Lb9/c;

    .line 14
    .line 15
    const/4 v6, 0x7

    .line 16
    move-object v3, p0

    .line 17
    move-object v2, p1

    .line 18
    move-object v4, p2

    .line 19
    invoke-direct/range {v1 .. v6}, Lb9/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v5, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public final o(ZZLfg/l;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lia/a0;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    if-nez v3, :cond_0

    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    new-instance v3, Lia/y;

    .line 13
    .line 14
    invoke-direct {v3, p0, p1, p2, p3}, Lia/y;-><init>(Lia/a0;ZZLfg/l;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v3}, Lia/a0;->r(Lfg/a;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 24
    .line 25
    .line 26
    return v1

    .line 27
    :cond_1
    return v2
.end method

.method public final p(ZZ)Z
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lia/a0;->b:Lb5/c;

    .line 4
    .line 5
    invoke-virtual {v0}, Lb5/c;->d()Ljava/util/LinkedHashSet;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v8, 0x1

    .line 14
    move v9, v8

    .line 15
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_7

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Ljava/lang/String;

    .line 26
    .line 27
    iget-object v3, v1, Lia/a0;->b:Lb5/c;

    .line 28
    .line 29
    invoke-virtual {v3, v2}, Lb5/c;->l(Ljava/lang/String;)Lia/c;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v1, v3}, Lia/a0;->d(Lia/c;)Lia/c;

    .line 34
    .line 35
    .line 36
    move-result-object v10

    .line 37
    iget-object v4, v1, Lia/a0;->k:Ljava/lang/Object;

    .line 38
    .line 39
    monitor-enter v4

    .line 40
    :try_start_0
    invoke-virtual {v1, v2}, Lia/a0;->m(Ljava/lang/String;)Lp8/f;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    iget-boolean v6, v5, Lp8/f;->a:Z

    .line 45
    .line 46
    const/16 v16, 0x0

    .line 47
    .line 48
    if-nez v6, :cond_1

    .line 49
    .line 50
    move-object v10, v4

    .line 51
    move/from16 v2, v16

    .line 52
    .line 53
    goto/16 :goto_7

    .line 54
    .line 55
    :cond_1
    iget-object v5, v5, Lp8/f;->b:Ljava/lang/Object;

    .line 56
    .line 57
    if-eqz v5, :cond_6

    .line 58
    .line 59
    if-eqz p1, :cond_2

    .line 60
    .line 61
    sget-object v6, Ltf/t;->g:Ltf/t;

    .line 62
    .line 63
    :goto_1
    move-object v11, v6

    .line 64
    goto :goto_2

    .line 65
    :catchall_0
    move-exception v0

    .line 66
    move-object v10, v4

    .line 67
    goto/16 :goto_8

    .line 68
    .line 69
    :cond_2
    iget-object v6, v10, Lia/c;->a:Ljava/util/List;

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :goto_2
    if-eqz p2, :cond_3

    .line 73
    .line 74
    sget-object v6, Ltf/t;->g:Ltf/t;

    .line 75
    .line 76
    :goto_3
    move-object v12, v6

    .line 77
    goto :goto_4

    .line 78
    :cond_3
    iget-object v6, v10, Lia/c;->b:Ljava/util/List;

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :goto_4
    const/4 v14, 0x0

    .line 82
    const/16 v15, 0xc

    .line 83
    .line 84
    const/4 v13, 0x0

    .line 85
    invoke-static/range {v10 .. v15}, Lia/c;->b(Lia/c;Ljava/util/List;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/ArrayList;I)Lia/c;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    invoke-static {v3}, Lia/a0;->g(Lia/c;)Lia/c;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    if-nez p1, :cond_4

    .line 94
    .line 95
    invoke-virtual {v1}, Lia/a0;->f()Z

    .line 96
    .line 97
    .line 98
    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    if-eqz v7, :cond_4

    .line 100
    .line 101
    move-object v7, v4

    .line 102
    move-object v4, v6

    .line 103
    move v6, v8

    .line 104
    goto :goto_5

    .line 105
    :cond_4
    move-object v7, v4

    .line 106
    move-object v4, v6

    .line 107
    move/from16 v6, v16

    .line 108
    .line 109
    :goto_5
    if-nez p2, :cond_5

    .line 110
    .line 111
    :try_start_1
    invoke-virtual {v1}, Lia/a0;->e()Z

    .line 112
    .line 113
    .line 114
    move-result v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 115
    if-eqz v10, :cond_5

    .line 116
    .line 117
    move-object v10, v5

    .line 118
    move-object v5, v3

    .line 119
    move-object v3, v10

    .line 120
    move-object v10, v7

    .line 121
    move v7, v8

    .line 122
    goto :goto_6

    .line 123
    :catchall_1
    move-exception v0

    .line 124
    move-object v10, v7

    .line 125
    goto :goto_8

    .line 126
    :cond_5
    move-object v10, v5

    .line 127
    move-object v5, v3

    .line 128
    move-object v3, v10

    .line 129
    move-object v10, v7

    .line 130
    move/from16 v7, v16

    .line 131
    .line 132
    :goto_6
    :try_start_2
    invoke-virtual/range {v1 .. v7}, Lia/a0;->h(Ljava/lang/String;Ljava/lang/Object;Lia/c;Lia/c;ZZ)Z

    .line 133
    .line 134
    .line 135
    move-result v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 136
    goto :goto_7

    .line 137
    :catchall_2
    move-exception v0

    .line 138
    goto :goto_8

    .line 139
    :cond_6
    move-object v10, v4

    .line 140
    move v2, v8

    .line 141
    :goto_7
    monitor-exit v10

    .line 142
    if-nez v2, :cond_0

    .line 143
    .line 144
    move/from16 v9, v16

    .line 145
    .line 146
    goto/16 :goto_0

    .line 147
    .line 148
    :goto_8
    monitor-exit v10

    .line 149
    throw v0

    .line 150
    :cond_7
    if-eqz v9, :cond_13

    .line 151
    .line 152
    iget-object v2, v1, Lia/a0;->b:Lb5/c;

    .line 153
    .line 154
    monitor-enter v2

    .line 155
    if-nez p1, :cond_8

    .line 156
    .line 157
    if-nez p2, :cond_8

    .line 158
    .line 159
    monitor-exit v2

    .line 160
    goto :goto_e

    .line 161
    :cond_8
    if-eqz p1, :cond_9

    .line 162
    .line 163
    if-eqz p2, :cond_9

    .line 164
    .line 165
    :try_start_3
    invoke-virtual {v2}, Lb5/c;->g()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 166
    .line 167
    .line 168
    monitor-exit v2

    .line 169
    goto :goto_e

    .line 170
    :catchall_3
    move-exception v0

    .line 171
    goto/16 :goto_f

    .line 172
    .line 173
    :cond_9
    :try_start_4
    invoke-virtual {v2}, Lb5/c;->J()Ljava/util/LinkedHashMap;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    check-cast v3, Ljava/lang/Iterable;

    .line 185
    .line 186
    invoke-static {v3}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    :cond_a
    :goto_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 195
    .line 196
    .line 197
    move-result v4

    .line 198
    if-eqz v4, :cond_f

    .line 199
    .line 200
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v4

    .line 204
    check-cast v4, Ljava/lang/String;

    .line 205
    .line 206
    invoke-virtual {v0, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v5

    .line 210
    check-cast v5, Lia/c;

    .line 211
    .line 212
    if-eqz v5, :cond_a

    .line 213
    .line 214
    if-eqz p1, :cond_b

    .line 215
    .line 216
    sget-object v6, Ltf/t;->g:Ltf/t;

    .line 217
    .line 218
    goto :goto_a

    .line 219
    :cond_b
    iget-object v6, v5, Lia/c;->a:Ljava/util/List;

    .line 220
    .line 221
    :goto_a
    if-eqz p2, :cond_c

    .line 222
    .line 223
    sget-object v7, Ltf/t;->g:Ltf/t;

    .line 224
    .line 225
    goto :goto_b

    .line 226
    :cond_c
    iget-object v7, v5, Lia/c;->b:Ljava/util/List;

    .line 227
    .line 228
    :goto_b
    if-eqz p1, :cond_d

    .line 229
    .line 230
    sget-object v8, Ltf/t;->g:Ltf/t;

    .line 231
    .line 232
    goto :goto_c

    .line 233
    :cond_d
    iget-object v8, v5, Lia/c;->c:Ljava/util/List;

    .line 234
    .line 235
    :goto_c
    if-eqz p2, :cond_e

    .line 236
    .line 237
    sget-object v5, Ltf/t;->g:Ltf/t;

    .line 238
    .line 239
    goto :goto_d

    .line 240
    :cond_e
    iget-object v5, v5, Lia/c;->d:Ljava/util/List;

    .line 241
    .line 242
    :goto_d
    invoke-static {v6, v7, v8, v5}, Lia/c;->a(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lia/c;

    .line 243
    .line 244
    .line 245
    move-result-object v5

    .line 246
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    invoke-static {v0, v4, v5}, Lb5/c;->I(Ljava/util/LinkedHashMap;Ljava/lang/String;Lia/c;)V

    .line 250
    .line 251
    .line 252
    goto :goto_9

    .line 253
    :cond_f
    invoke-virtual {v2, v0}, Lb5/c;->N(Ljava/util/LinkedHashMap;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 254
    .line 255
    .line 256
    monitor-exit v2

    .line 257
    :goto_e
    iget-object v0, v1, Lia/a0;->e:Landroid/content/SharedPreferences;

    .line 258
    .line 259
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    if-eqz p1, :cond_10

    .line 264
    .line 265
    const-string v2, "pending_restore_likes_v1"

    .line 266
    .line 267
    invoke-interface {v0, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 268
    .line 269
    .line 270
    :cond_10
    if-eqz p2, :cond_11

    .line 271
    .line 272
    const-string v2, "pending_restore_comments_v1"

    .line 273
    .line 274
    invoke-interface {v0, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 275
    .line 276
    .line 277
    :cond_11
    if-eqz p1, :cond_12

    .line 278
    .line 279
    if-eqz p2, :cond_12

    .line 280
    .line 281
    const-string v2, "pending_restore_all_v1"

    .line 282
    .line 283
    invoke-interface {v0, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 284
    .line 285
    .line 286
    :cond_12
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 287
    .line 288
    .line 289
    invoke-static {}, Lia/a0;->c()Landroid/app/Activity;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    if-eqz v0, :cond_13

    .line 294
    .line 295
    const/4 v2, 0x0

    .line 296
    invoke-virtual {v1, v0, v2}, Lia/a0;->n(Landroid/app/Activity;Landroid/view/View;)V

    .line 297
    .line 298
    .line 299
    return v9

    .line 300
    :goto_f
    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 301
    throw v0

    .line 302
    :cond_13
    return v9
.end method

.method public final r(Lfg/a;)Z
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lia/a0;->i:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    new-instance v1, Lb0/c;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v1, p1, v2}, Lb0/c;-><init>(Lfg/a;I)V

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    return p1

    .line 14
    :catch_0
    const/4 p1, 0x0

    .line 15
    return p1
.end method
