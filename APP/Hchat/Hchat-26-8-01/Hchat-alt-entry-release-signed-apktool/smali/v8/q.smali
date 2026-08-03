.class public final Lv8/q;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final i:Log/k;


# instance fields
.field public final a:Li2/y;

.field public final b:Landroid/content/Context;

.field public final c:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

.field public final d:Ljava/util/LinkedHashMap;

.field public final e:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public final f:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public final g:Ljava/util/concurrent/ConcurrentLinkedDeque;

.field public h:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Log/k;

    .line 2
    .line 3
    const-string v1, "[0-9a-fA-F]{32}"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Log/k;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lv8/q;->i:Log/k;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Li2/y;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lv8/q;->a:Li2/y;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    move-object p1, p2

    .line 13
    :cond_0
    iput-object p1, p0, Lv8/q;->b:Landroid/content/Context;

    .line 14
    .line 15
    new-instance p1, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 16
    .line 17
    new-instance p2, Lc9/q;

    .line 18
    .line 19
    const/16 v0, 0x1a

    .line 20
    .line 21
    invoke-direct {p2, v0}, Lc9/q;-><init>(I)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    invoke-direct {p1, v0, p2}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->setRemoveOnCancelPolicy(Z)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lv8/q;->c:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 32
    .line 33
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 34
    .line 35
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Lv8/q;->d:Ljava/util/LinkedHashMap;

    .line 39
    .line 40
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iput-object p1, p0, Lv8/q;->e:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 45
    .line 46
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iput-object p1, p0, Lv8/q;->f:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 51
    .line 52
    new-instance p1, Ljava/util/concurrent/ConcurrentLinkedDeque;

    .line 53
    .line 54
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentLinkedDeque;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object p1, p0, Lv8/q;->g:Ljava/util/concurrent/ConcurrentLinkedDeque;

    .line 58
    .line 59
    new-instance p1, Lv0/a;

    .line 60
    .line 61
    const/4 p2, 0x2

    .line 62
    invoke-direct {p1, p0, p2}, Lv0/a;-><init>(Ljava/lang/Object;I)V

    .line 63
    .line 64
    .line 65
    const-wide/16 v0, 0x0

    .line 66
    .line 67
    invoke-virtual {p0, v0, v1, p1}, Lv8/q;->o(JLfg/a;)Z

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public static varargs c([Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {p0}, Ltf/l;->k0([Ljava/lang/Object;)Lng/j;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, Lr9/p;

    .line 6
    .line 7
    const/16 v1, 0xc

    .line 8
    .line 9
    invoke-direct {v0, v1}, Lr9/p;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-static {p0, v0}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    new-instance v0, Lr9/p;

    .line 17
    .line 18
    const/16 v1, 0xd

    .line 19
    .line 20
    invoke-direct {v0, v1}, Lr9/p;-><init>(I)V

    .line 21
    .line 22
    .line 23
    new-instance v1, Lng/i;

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    invoke-direct {v1, p0, v2, v0}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 27
    .line 28
    .line 29
    sget-object p0, Lv8/p;->n:Lv8/p;

    .line 30
    .line 31
    invoke-static {v1, p0}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    iget-object v0, p0, Lng/t;->a:Lng/j;

    .line 36
    .line 37
    invoke-interface {v0}, Lng/j;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    const/4 v2, 0x0

    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    iget-object v1, p0, Lng/t;->b:Lfg/l;

    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-interface {v1, v3}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    move-object v3, v1

    .line 59
    check-cast v3, Ljava/io/File;

    .line 60
    .line 61
    invoke-virtual {v3}, Ljava/io/File;->isFile()Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_0

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    move-object v1, v2

    .line 69
    :goto_0
    check-cast v1, Ljava/io/File;

    .line 70
    .line 71
    if-eqz v1, :cond_2

    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    :cond_2
    if-nez v2, :cond_3

    .line 78
    .line 79
    const-string p0, ""

    .line 80
    .line 81
    return-object p0

    .line 82
    :cond_3
    return-object v2
.end method

.method public static varargs e([Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-ge v2, v0, :cond_3

    .line 5
    .line 6
    aget-object v3, p0, v2

    .line 7
    .line 8
    if-eqz v3, :cond_1

    .line 9
    .line 10
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    if-eqz v4, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    move v4, v1

    .line 18
    goto :goto_2

    .line 19
    :cond_1
    :goto_1
    const/4 v4, 0x1

    .line 20
    :goto_2
    if-nez v4, :cond_2

    .line 21
    .line 22
    goto :goto_3

    .line 23
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_3
    const/4 v3, 0x0

    .line 27
    :goto_3
    if-nez v3, :cond_4

    .line 28
    .line 29
    const-string p0, ""

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_4
    return-object v3
.end method

.method public static f(Lv8/h;Ljava/lang/String;J)Z
    .locals 6

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-wide/16 v1, -0x1

    .line 18
    .line 19
    :goto_0
    const-wide/16 v3, 0x0

    .line 20
    .line 21
    cmp-long p1, v1, v3

    .line 22
    .line 23
    const/4 v5, 0x0

    .line 24
    if-lez p1, :cond_3

    .line 25
    .line 26
    cmp-long p1, p2, v3

    .line 27
    .line 28
    if-lez p1, :cond_1

    .line 29
    .line 30
    cmp-long p1, v1, p2

    .line 31
    .line 32
    if-gez p1, :cond_1

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_1
    iget-object p1, p0, Lv8/h;->t:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    const/4 p2, 0x1

    .line 46
    if-eqz p1, :cond_2

    .line 47
    .line 48
    iget-wide v3, p0, Lv8/h;->u:J

    .line 49
    .line 50
    cmp-long p1, v3, v1

    .line 51
    .line 52
    if-nez p1, :cond_2

    .line 53
    .line 54
    iget p1, p0, Lv8/h;->v:I

    .line 55
    .line 56
    add-int/2addr p1, p2

    .line 57
    iput p1, p0, Lv8/h;->v:I

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iput-object p1, p0, Lv8/h;->t:Ljava/lang/String;

    .line 68
    .line 69
    iput-wide v1, p0, Lv8/h;->u:J

    .line 70
    .line 71
    iput v5, p0, Lv8/h;->v:I

    .line 72
    .line 73
    :goto_1
    iget p0, p0, Lv8/h;->v:I

    .line 74
    .line 75
    if-lt p0, p2, :cond_3

    .line 76
    .line 77
    return p2

    .line 78
    :cond_3
    :goto_2
    return v5
.end method

.method public static h(Lh/Hchat/hooks/api/model/WeChatMessage;Ljava/lang/String;)J
    .locals 3

    .line 1
    invoke-static {p0, p1}, Lv8/q;->i(Lh/Hchat/hooks/api/model/WeChatMessage;Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Log/t;->g0(Ljava/lang/String;)Ljava/lang/Long;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-wide/16 v0, 0x0

    .line 10
    .line 11
    if-eqz p0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 14
    .line 15
    .line 16
    move-result-wide p0

    .line 17
    cmp-long v2, p0, v0

    .line 18
    .line 19
    if-gez v2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-wide p0

    .line 23
    :cond_1
    :goto_0
    return-wide v0
.end method

.method public static i(Lh/Hchat/hooks/api/model/WeChatMessage;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->reserved:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v2, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->translatedContent:Ljava/lang/String;

    .line 8
    .line 9
    iget-object p0, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->msgSource:Ljava/lang/String;

    .line 10
    .line 11
    filled-new-array {v0, v1, v2, p0}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p0}, Ltf/l;->k0([Ljava/lang/Object;)Lng/j;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    new-instance v0, Lca/s;

    .line 20
    .line 21
    const/16 v1, 0x11

    .line 22
    .line 23
    invoke-direct {v0, p1, v1}, Lca/s;-><init>(Ljava/lang/String;I)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v0}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    iget-object p1, p0, Lng/t;->a:Lng/j;

    .line 31
    .line 32
    invoke-interface {p1}, Lng/j;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    iget-object v0, p0, Lng/t;->b:Lfg/l;

    .line 43
    .line 44
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    move-object v1, v0

    .line 53
    check-cast v1, Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-nez v1, :cond_0

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    const/4 v0, 0x0

    .line 63
    :goto_0
    check-cast v0, Ljava/lang/String;

    .line 64
    .line 65
    if-nez v0, :cond_2

    .line 66
    .line 67
    const-string p0, ""

    .line 68
    .line 69
    return-object p0

    .line 70
    :cond_2
    return-object v0
.end method

.method public static l(ILjava/lang/String;)Ljava/util/ArrayList;
    .locals 6

    .line 1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->messageStore()Lk8/s;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/16 v1, 0x18

    .line 8
    .line 9
    invoke-virtual {v0, v1, p1}, Lk8/s;->f(ILjava/lang/String;)Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    :goto_0
    if-nez p1, :cond_1

    .line 16
    .line 17
    sget-object p1, Ltf/t;->g:Ltf/t;

    .line 18
    .line 19
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_7

    .line 33
    .line 34
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    move-object v2, v1

    .line 39
    check-cast v2, Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 40
    .line 41
    invoke-virtual {v2}, Lh/Hchat/hooks/api/model/WeChatMessage;->isOutgoing()Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_2

    .line 46
    .line 47
    iget v2, v2, Lh/Hchat/hooks/api/model/WeChatMessage;->type:I

    .line 48
    .line 49
    if-gtz v2, :cond_3

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_3
    and-int/lit16 v3, v2, 0xff

    .line 53
    .line 54
    const v4, 0xffff

    .line 55
    .line 56
    .line 57
    and-int/2addr v4, v2

    .line 58
    ushr-int/lit8 v5, v2, 0x10

    .line 59
    .line 60
    if-nez v5, :cond_4

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_4
    const/16 v5, 0x2710

    .line 64
    .line 65
    if-eq v4, v5, :cond_5

    .line 66
    .line 67
    const/16 v5, 0x2712

    .line 68
    .line 69
    if-eq v4, v5, :cond_5

    .line 70
    .line 71
    if-eqz v3, :cond_6

    .line 72
    .line 73
    if-ne v4, v3, :cond_6

    .line 74
    .line 75
    move v2, v3

    .line 76
    goto :goto_2

    .line 77
    :cond_5
    move v2, v4

    .line 78
    :cond_6
    :goto_2
    if-ne v2, p0, :cond_2

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_7
    return-object v0
.end method

.method public static n(Lv8/a;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;)Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Lv8/a;->c:Z

    .line 2
    .line 3
    iget-object v1, p0, Lv8/a;->f:Ljava/util/Set;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v0, :cond_11

    .line 7
    .line 8
    iget-object v0, p0, Lv8/a;->e:Ljava/util/Set;

    .line 9
    .line 10
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    goto/16 :goto_4

    .line 17
    .line 18
    :cond_0
    if-eqz p5, :cond_1

    .line 19
    .line 20
    iget-boolean p5, p0, Lv8/a;->d:Z

    .line 21
    .line 22
    if-nez p5, :cond_1

    .line 23
    .line 24
    goto/16 :goto_4

    .line 25
    .line 26
    :cond_1
    move-object p5, v1

    .line 27
    check-cast p5, Ljava/util/Collection;

    .line 28
    .line 29
    invoke-interface {p5}, Ljava/util/Collection;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result p5

    .line 33
    if-nez p5, :cond_3

    .line 34
    .line 35
    sget-object p5, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 36
    .line 37
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-static {p1}, Ll8/d;->g(Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result p5

    .line 44
    if-eqz p5, :cond_11

    .line 45
    .line 46
    invoke-static {p6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 47
    .line 48
    .line 49
    move-result p5

    .line 50
    if-eqz p5, :cond_2

    .line 51
    .line 52
    goto/16 :goto_4

    .line 53
    .line 54
    :cond_2
    new-instance p5, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string p1, "/"

    .line 63
    .line 64
    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p5, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-nez p1, :cond_3

    .line 79
    .line 80
    goto/16 :goto_4

    .line 81
    .line 82
    :cond_3
    iget-object p1, p0, Lv8/a;->h:Ljava/util/Set;

    .line 83
    .line 84
    invoke-interface {p1, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    const/4 p5, 0x1

    .line 89
    if-eqz p2, :cond_4

    .line 90
    .line 91
    :goto_0
    move p1, p5

    .line 92
    goto :goto_2

    .line 93
    :cond_4
    if-gtz p3, :cond_5

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_5
    and-int/lit16 p2, p3, 0xff

    .line 97
    .line 98
    const p6, 0xffff

    .line 99
    .line 100
    .line 101
    and-int/2addr p6, p3

    .line 102
    ushr-int/lit8 v0, p3, 0x10

    .line 103
    .line 104
    if-nez v0, :cond_6

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_6
    const/16 v0, 0x2710

    .line 108
    .line 109
    if-eq p6, v0, :cond_7

    .line 110
    .line 111
    const/16 v0, 0x2712

    .line 112
    .line 113
    if-eq p6, v0, :cond_7

    .line 114
    .line 115
    if-eqz p2, :cond_8

    .line 116
    .line 117
    if-ne p6, p2, :cond_8

    .line 118
    .line 119
    move p3, p2

    .line 120
    goto :goto_1

    .line 121
    :cond_7
    move p3, p6

    .line 122
    :cond_8
    :goto_1
    const/16 p2, 0x3e

    .line 123
    .line 124
    if-ne p3, p2, :cond_9

    .line 125
    .line 126
    const-string p2, "video_number_video"

    .line 127
    .line 128
    invoke-interface {p1, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    if-eqz p1, :cond_9

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_9
    move p1, v2

    .line 136
    :goto_2
    if-nez p1, :cond_a

    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_a
    iget-boolean p1, p0, Lv8/a;->k:Z

    .line 140
    .line 141
    if-eqz p1, :cond_d

    .line 142
    .line 143
    sget-object p1, Lv8/r;->a:Lv8/r;

    .line 144
    .line 145
    iget-object p1, p0, Lv8/a;->l:Ljava/lang/String;

    .line 146
    .line 147
    invoke-static {p1}, Lv8/r;->c(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 152
    .line 153
    .line 154
    move-result p2

    .line 155
    if-nez p2, :cond_d

    .line 156
    .line 157
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 158
    .line 159
    .line 160
    move-result p2

    .line 161
    if-eqz p2, :cond_b

    .line 162
    .line 163
    goto :goto_4

    .line 164
    :cond_b
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    :cond_c
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 169
    .line 170
    .line 171
    move-result p2

    .line 172
    if-eqz p2, :cond_11

    .line 173
    .line 174
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object p2

    .line 178
    check-cast p2, Ljava/lang/String;

    .line 179
    .line 180
    invoke-static {p4, p2, p5}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 181
    .line 182
    .line 183
    move-result p2

    .line 184
    if-eqz p2, :cond_c

    .line 185
    .line 186
    :cond_d
    iget-boolean p1, p0, Lv8/a;->m:Z

    .line 187
    .line 188
    if-eqz p1, :cond_10

    .line 189
    .line 190
    sget-object p1, Lv8/r;->a:Lv8/r;

    .line 191
    .line 192
    iget-object p0, p0, Lv8/a;->n:Ljava/lang/String;

    .line 193
    .line 194
    invoke-static {p0}, Lv8/r;->c(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 199
    .line 200
    .line 201
    move-result p1

    .line 202
    if-eqz p1, :cond_e

    .line 203
    .line 204
    goto :goto_3

    .line 205
    :cond_e
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    :cond_f
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 210
    .line 211
    .line 212
    move-result p1

    .line 213
    if-eqz p1, :cond_10

    .line 214
    .line 215
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    check-cast p1, Ljava/lang/String;

    .line 220
    .line 221
    invoke-static {p4, p1, p5}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 222
    .line 223
    .line 224
    move-result p1

    .line 225
    if-eqz p1, :cond_f

    .line 226
    .line 227
    goto :goto_4

    .line 228
    :cond_10
    :goto_3
    return p5

    .line 229
    :cond_11
    :goto_4
    return v2
.end method

.method public static p(Lv8/f;Ljava/lang/String;)Z
    .locals 7

    .line 1
    invoke-static {}, Lp/a;->q()Lk8/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_6

    .line 6
    .line 7
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget v2, p0, Lv8/f;->a:I

    .line 12
    .line 13
    iget-object v3, p0, Lv8/f;->b:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v4, p0, Lv8/f;->c:Ljava/lang/String;

    .line 16
    .line 17
    const/4 v5, 0x1

    .line 18
    if-eq v2, v5, :cond_5

    .line 19
    .line 20
    const/4 v6, 0x3

    .line 21
    if-eq v2, v6, :cond_4

    .line 22
    .line 23
    const/16 v6, 0x22

    .line 24
    .line 25
    if-eq v2, v6, :cond_3

    .line 26
    .line 27
    const/16 v6, 0x3e

    .line 28
    .line 29
    if-eq v2, v6, :cond_2

    .line 30
    .line 31
    const/16 v6, 0x42

    .line 32
    .line 33
    if-eq v2, v6, :cond_1

    .line 34
    .line 35
    const/16 v6, 0x2a

    .line 36
    .line 37
    if-eq v2, v6, :cond_1

    .line 38
    .line 39
    const/16 v6, 0x2b

    .line 40
    .line 41
    if-eq v2, v6, :cond_2

    .line 42
    .line 43
    packed-switch v2, :pswitch_data_0

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :pswitch_0
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-nez v2, :cond_0

    .line 52
    .line 53
    if-eqz v1, :cond_6

    .line 54
    .line 55
    iget-object v0, v1, Lj8/p;->e:Landroidx/lifecycle/x;

    .line 56
    .line 57
    if-eqz v0, :cond_6

    .line 58
    .line 59
    iget-object p0, p0, Lv8/f;->e:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v0, p1, v4, p0}, Landroidx/lifecycle/x;->T(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-ne p0, v5, :cond_6

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    invoke-virtual {v0, p1, v3}, Lk8/g;->z(Ljava/lang/String;Ljava/lang/String;)Z

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    return p0

    .line 73
    :pswitch_1
    const/16 p0, 0x30

    .line 74
    .line 75
    invoke-virtual {v0, p0, p1, v3}, Lk8/g;->v(ILjava/lang/String;Ljava/lang/String;)Z

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    return p0

    .line 80
    :pswitch_2
    if-eqz v1, :cond_6

    .line 81
    .line 82
    iget-object p0, v1, Lj8/p;->d:Lj8/f;

    .line 83
    .line 84
    if-eqz p0, :cond_6

    .line 85
    .line 86
    invoke-virtual {p0, p1, v4}, Lj8/f;->v(Ljava/lang/String;Ljava/lang/String;)Z

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    if-ne p0, v5, :cond_6

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_1
    invoke-virtual {v0, v2, p1, v3}, Lk8/g;->v(ILjava/lang/String;Ljava/lang/String;)Z

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    return p0

    .line 98
    :cond_2
    if-eqz v1, :cond_6

    .line 99
    .line 100
    iget-object p0, v1, Lj8/p;->c:Lbb/b;

    .line 101
    .line 102
    if-eqz p0, :cond_6

    .line 103
    .line 104
    invoke-virtual {p0, p1, v4}, Lbb/b;->q(Ljava/lang/String;Ljava/lang/String;)Z

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    if-ne p0, v5, :cond_6

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_3
    if-eqz v1, :cond_6

    .line 112
    .line 113
    iget-object v0, v1, Lj8/p;->b:Lj8/y;

    .line 114
    .line 115
    if-eqz v0, :cond_6

    .line 116
    .line 117
    iget p0, p0, Lv8/f;->d:I

    .line 118
    .line 119
    invoke-virtual {v0, p0, p1, v4}, Lj8/y;->s(ILjava/lang/String;Ljava/lang/String;)Z

    .line 120
    .line 121
    .line 122
    move-result p0

    .line 123
    if-ne p0, v5, :cond_6

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_4
    if-eqz v1, :cond_6

    .line 127
    .line 128
    iget-object p0, v1, Lj8/p;->a:Lj8/n;

    .line 129
    .line 130
    if-eqz p0, :cond_6

    .line 131
    .line 132
    const-string v0, ""

    .line 133
    .line 134
    invoke-virtual {p0, p1, v4, v0, v5}, Lj8/n;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 135
    .line 136
    .line 137
    move-result p0

    .line 138
    if-ne p0, v5, :cond_6

    .line 139
    .line 140
    :goto_0
    return v5

    .line 141
    :cond_5
    invoke-virtual {v0, p1, v3}, Lk8/g;->x(Ljava/lang/String;Ljava/lang/String;)Z

    .line 142
    .line 143
    .line 144
    move-result p0

    .line 145
    return p0

    .line 146
    :cond_6
    :goto_1
    const/4 p0, 0x0

    .line 147
    return p0

    .line 148
    nop

    .line 149
    :pswitch_data_0
    .packed-switch 0x2f
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a(Ljava/io/File;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lv8/q;->g(Ljava/io/File;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object p1, p0, Lv8/q;->f:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    :cond_1
    return-void
.end method

.method public final b(Lv8/h;Lv8/c;Lfg/a;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lv8/q;->c:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    if-eqz p2, :cond_1

    .line 10
    .line 11
    invoke-virtual {p2}, Lv8/c;->invoke()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    :try_start_0
    new-instance v2, Lb9/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 16
    .line 17
    const/16 v7, 0x12

    .line 18
    .line 19
    move-object v4, p0

    .line 20
    move-object v3, p1

    .line 21
    move-object v5, p2

    .line 22
    move-object v6, p3

    .line 23
    :try_start_1
    invoke-direct/range {v2 .. v7}, Lb9/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v2}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 27
    .line 28
    .line 29
    sget-object p1, Lsf/n;->a:Lsf/n;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :catchall_0
    move-exception v0

    .line 33
    :goto_0
    move-object p1, v0

    .line 34
    goto :goto_1

    .line 35
    :catchall_1
    move-exception v0

    .line 36
    move-object v5, p2

    .line 37
    goto :goto_0

    .line 38
    :goto_1
    new-instance p2, Lsf/f;

    .line 39
    .line 40
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    move-object p1, p2

    .line 44
    :goto_2
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    if-eqz v5, :cond_1

    .line 51
    .line 52
    invoke-virtual {v5}, Lv8/c;->invoke()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    :cond_1
    return-void
.end method

.method public final d(Lv8/h;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lv8/q;->e:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 2
    .line 3
    iget-object v1, p1, Lv8/h;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

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
    const/4 v0, 0x0

    .line 13
    iput-boolean v0, p1, Lv8/h;->q:Z

    .line 14
    .line 15
    iget-boolean v0, p1, Lv8/h;->p:Z

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p1, Lv8/h;->o:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    :goto_0
    return-void

    .line 28
    :cond_1
    new-instance v0, Lv8/b;

    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    invoke-direct {v0, p0, p1, v1}, Lv8/b;-><init>(Lv8/q;Lv8/h;I)V

    .line 32
    .line 33
    .line 34
    const-wide/32 v1, 0x36ee80

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v1, v2, v0}, Lv8/q;->o(JLfg/a;)Z

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final g(Ljava/io/File;)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    iget-object v1, p0, Lv8/q;->b:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "Hchat_auto_message_forward"

    .line 10
    .line 11
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {v0}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 40
    .line 41
    .line 42
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    if-eqz p1, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move-object v2, v1

    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception p1

    .line 49
    new-instance v2, Lsf/f;

    .line 50
    .line 51
    invoke-direct {v2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    :goto_0
    instance-of p1, v2, Lsf/f;

    .line 55
    .line 56
    if-eqz p1, :cond_1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    move-object v1, v2

    .line 60
    :goto_1
    check-cast v1, Ljava/lang/String;

    .line 61
    .line 62
    return-object v1
.end method

.method public final j(Lh/Hchat/hooks/api/model/WeChatMessage;Lv8/h;)Lv8/n;
    .locals 40

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    iget v0, v2, Lh/Hchat/hooks/api/model/WeChatMessage;->type:I

    .line 8
    .line 9
    if-gtz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    and-int/lit16 v4, v0, 0xff

    .line 13
    .line 14
    const v5, 0xffff

    .line 15
    .line 16
    .line 17
    and-int/2addr v5, v0

    .line 18
    ushr-int/lit8 v6, v0, 0x10

    .line 19
    .line 20
    if-nez v6, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/16 v6, 0x2710

    .line 24
    .line 25
    if-eq v5, v6, :cond_3

    .line 26
    .line 27
    const/16 v6, 0x2712

    .line 28
    .line 29
    if-eq v5, v6, :cond_3

    .line 30
    .line 31
    if-eqz v4, :cond_2

    .line 32
    .line 33
    if-ne v5, v4, :cond_2

    .line 34
    .line 35
    move v8, v4

    .line 36
    goto :goto_1

    .line 37
    :cond_2
    :goto_0
    move v8, v0

    .line 38
    goto :goto_1

    .line 39
    :cond_3
    move v8, v5

    .line 40
    :goto_1
    iget-wide v4, v2, Lh/Hchat/hooks/api/model/WeChatMessage;->msgId:J

    .line 41
    .line 42
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const-wide/16 v6, 0x0

    .line 47
    .line 48
    cmp-long v4, v4, v6

    .line 49
    .line 50
    if-lez v4, :cond_4

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_4
    const/4 v0, 0x0

    .line 54
    :goto_2
    if-eqz v0, :cond_7

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 57
    .line 58
    .line 59
    move-result-wide v9

    .line 60
    :try_start_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->database()Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    if-eqz v0, :cond_5

    .line 65
    .line 66
    invoke-virtual {v0, v9, v10}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->nativeMessageById(J)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    goto :goto_4

    .line 71
    :catchall_0
    move-exception v0

    .line 72
    goto :goto_3

    .line 73
    :cond_5
    const/4 v0, 0x0

    .line 74
    goto :goto_4

    .line 75
    :goto_3
    new-instance v4, Lsf/f;

    .line 76
    .line 77
    invoke-direct {v4, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    move-object v0, v4

    .line 81
    :goto_4
    nop

    .line 82
    instance-of v4, v0, Lsf/f;

    .line 83
    .line 84
    if-eqz v4, :cond_6

    .line 85
    .line 86
    const/4 v0, 0x0

    .line 87
    :cond_6
    move-object v9, v0

    .line 88
    goto :goto_5

    .line 89
    :cond_7
    const/4 v9, 0x0

    .line 90
    :goto_5
    invoke-virtual {v2}, Lh/Hchat/hooks/api/model/WeChatMessage;->isVoice()Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    const/4 v4, 0x0

    .line 95
    sget-object v10, Lv8/m;->a:Lv8/m;

    .line 96
    .line 97
    const-string v11, ""

    .line 98
    .line 99
    const/4 v12, 0x1

    .line 100
    if-eqz v0, :cond_14

    .line 101
    .line 102
    iget-object v0, v2, Lh/Hchat/hooks/api/model/WeChatMessage;->imagePath:Ljava/lang/String;

    .line 103
    .line 104
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    if-nez v3, :cond_8

    .line 117
    .line 118
    goto :goto_6

    .line 119
    :cond_8
    const/4 v0, 0x0

    .line 120
    :goto_6
    if-eqz v0, :cond_9

    .line 121
    .line 122
    goto :goto_9

    .line 123
    :cond_9
    invoke-virtual {v2}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    const/4 v3, 0x2

    .line 128
    new-array v3, v3, [C

    .line 129
    .line 130
    fill-array-data v3, :array_0

    .line 131
    .line 132
    .line 133
    invoke-static {v0, v3}, Log/m;->U0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    new-array v3, v12, [C

    .line 138
    .line 139
    const/16 v6, 0x3a

    .line 140
    .line 141
    aput-char v6, v3, v4

    .line 142
    .line 143
    const/4 v6, 0x6

    .line 144
    invoke-static {v0, v3, v6}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 149
    .line 150
    .line 151
    move-result v6

    .line 152
    const/4 v7, 0x3

    .line 153
    if-lt v6, v7, :cond_b

    .line 154
    .line 155
    const/16 v6, 0x3c

    .line 156
    .line 157
    invoke-static {v0, v6}, Log/m;->i0(Ljava/lang/CharSequence;C)Z

    .line 158
    .line 159
    .line 160
    move-result v6

    .line 161
    if-nez v6, :cond_b

    .line 162
    .line 163
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    const/4 v6, 0x4

    .line 168
    if-ne v0, v6, :cond_a

    .line 169
    .line 170
    invoke-interface {v3, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    :goto_7
    check-cast v0, Ljava/lang/String;

    .line 175
    .line 176
    goto :goto_8

    .line 177
    :cond_a
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    goto :goto_7

    .line 182
    :goto_8
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    goto :goto_9

    .line 191
    :cond_b
    sget-object v3, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 192
    .line 193
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    const-string v3, "filename"

    .line 197
    .line 198
    invoke-static {v0, v3}, Ll8/d;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 203
    .line 204
    .line 205
    move-result v6

    .line 206
    if-eqz v6, :cond_c

    .line 207
    .line 208
    const-string v4, "voiceurl"

    .line 209
    .line 210
    invoke-static {v0, v4}, Ll8/d;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v4

    .line 214
    :cond_c
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 215
    .line 216
    .line 217
    move-result v6

    .line 218
    if-eqz v6, :cond_d

    .line 219
    .line 220
    invoke-static {v0, v3}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    goto :goto_9

    .line 225
    :cond_d
    move-object v0, v4

    .line 226
    :goto_9
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 227
    .line 228
    .line 229
    move-result v3

    .line 230
    if-eqz v3, :cond_e

    .line 231
    .line 232
    :goto_a
    move-object v3, v11

    .line 233
    goto :goto_d

    .line 234
    :cond_e
    filled-new-array {v0}, [Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    invoke-static {v3}, Lv8/q;->c([Ljava/lang/String;)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 243
    .line 244
    .line 245
    move-result v4

    .line 246
    if-nez v4, :cond_f

    .line 247
    .line 248
    goto :goto_b

    .line 249
    :cond_f
    const/4 v3, 0x0

    .line 250
    :goto_b
    if-eqz v3, :cond_10

    .line 251
    .line 252
    goto :goto_d

    .line 253
    :cond_10
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 254
    .line 255
    .line 256
    move-result-object v3

    .line 257
    if-eqz v3, :cond_11

    .line 258
    .line 259
    iget-object v3, v3, Lj8/p;->b:Lj8/y;

    .line 260
    .line 261
    if-eqz v3, :cond_11

    .line 262
    .line 263
    invoke-virtual {v3, v0}, Lj8/y;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v3

    .line 267
    if-eqz v3, :cond_11

    .line 268
    .line 269
    invoke-static {v3}, Leh/a;->y(Ljava/lang/String;)Z

    .line 270
    .line 271
    .line 272
    move-result v4

    .line 273
    if-eqz v4, :cond_11

    .line 274
    .line 275
    move-object v5, v3

    .line 276
    goto :goto_c

    .line 277
    :cond_11
    const/4 v5, 0x0

    .line 278
    :goto_c
    if-nez v5, :cond_12

    .line 279
    .line 280
    goto :goto_a

    .line 281
    :cond_12
    move-object v3, v5

    .line 282
    :goto_d
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 283
    .line 284
    .line 285
    move-result v4

    .line 286
    if-eqz v4, :cond_13

    .line 287
    .line 288
    return-object v10

    .line 289
    :cond_13
    sget-object v4, Lj8/e;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 290
    .line 291
    iget-wide v11, v2, Lh/Hchat/hooks/api/model/WeChatMessage;->msgId:J

    .line 292
    .line 293
    iget-object v4, v2, Lh/Hchat/hooks/api/model/WeChatMessage;->content:Ljava/lang/String;

    .line 294
    .line 295
    invoke-virtual {v2}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    filled-new-array {v4, v2}, [Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    invoke-static {v2}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 304
    .line 305
    .line 306
    move-result-object v13

    .line 307
    const/16 v14, 0x3e8

    .line 308
    .line 309
    move-object v10, v0

    .line 310
    invoke-static/range {v9 .. v14}, Lj8/e;->d(Ljava/lang/Object;Ljava/lang/String;JLjava/util/List;I)I

    .line 311
    .line 312
    .line 313
    move-result v11

    .line 314
    new-instance v0, Lv8/k;

    .line 315
    .line 316
    new-instance v7, Lv8/f;

    .line 317
    .line 318
    const/4 v12, 0x0

    .line 319
    const/16 v13, 0x12

    .line 320
    .line 321
    const/4 v9, 0x0

    .line 322
    move-object v10, v3

    .line 323
    invoke-direct/range {v7 .. v13}, Lv8/f;-><init>(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V

    .line 324
    .line 325
    .line 326
    invoke-direct {v0, v7}, Lv8/k;-><init>(Lv8/f;)V

    .line 327
    .line 328
    .line 329
    return-object v0

    .line 330
    :cond_14
    invoke-static {v2, v9}, Lfb/v0;->e(Lh/Hchat/hooks/api/model/WeChatMessage;Ljava/lang/Object;)Lk8/t;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    invoke-virtual {v2}, Lh/Hchat/hooks/api/model/WeChatMessage;->isText()Z

    .line 335
    .line 336
    .line 337
    move-result v13

    .line 338
    sget-object v14, Lv8/l;->a:Lv8/l;

    .line 339
    .line 340
    if-eqz v13, :cond_18

    .line 341
    .line 342
    if-eqz v0, :cond_15

    .line 343
    .line 344
    iget-object v0, v0, Lk8/t;->c:Ljava/lang/String;

    .line 345
    .line 346
    goto :goto_e

    .line 347
    :cond_15
    const/4 v0, 0x0

    .line 348
    :goto_e
    if-nez v0, :cond_16

    .line 349
    .line 350
    goto :goto_f

    .line 351
    :cond_16
    move-object v11, v0

    .line 352
    :goto_f
    invoke-static {v11}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 353
    .line 354
    .line 355
    move-result v0

    .line 356
    if-nez v0, :cond_17

    .line 357
    .line 358
    move-object v9, v11

    .line 359
    goto :goto_10

    .line 360
    :cond_17
    const/4 v9, 0x0

    .line 361
    :goto_10
    if-eqz v9, :cond_7a

    .line 362
    .line 363
    new-instance v14, Lv8/k;

    .line 364
    .line 365
    new-instance v7, Lv8/f;

    .line 366
    .line 367
    const/4 v12, 0x0

    .line 368
    const/16 v13, 0x1c

    .line 369
    .line 370
    const/4 v10, 0x0

    .line 371
    const/4 v11, 0x0

    .line 372
    invoke-direct/range {v7 .. v13}, Lv8/f;-><init>(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V

    .line 373
    .line 374
    .line 375
    invoke-direct {v14, v7}, Lv8/k;-><init>(Lv8/f;)V

    .line 376
    .line 377
    .line 378
    goto/16 :goto_58

    .line 379
    .line 380
    :cond_18
    invoke-virtual {v2}, Lh/Hchat/hooks/api/model/WeChatMessage;->isImage()Z

    .line 381
    .line 382
    .line 383
    move-result v13

    .line 384
    move-wide v15, v6

    .line 385
    iget-object v7, v1, Lv8/q;->f:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 386
    .line 387
    move-wide/from16 v18, v15

    .line 388
    .line 389
    const-string v15, "Hchat_auto_message_forward"

    .line 390
    .line 391
    iget-object v4, v1, Lv8/q;->b:Landroid/content/Context;

    .line 392
    .line 393
    const-string v5, "CDN\u4efb\u52a1\u63d0\u4ea4\u5931\u8d25"

    .line 394
    .line 395
    const-string v6, "aeskey"

    .line 396
    .line 397
    const-string v12, "length"

    .line 398
    .line 399
    sget-object v23, Lv8/i;->a:Lv8/i;

    .line 400
    .line 401
    move-object/from16 v24, v4

    .line 402
    .line 403
    const-string v4, "md5"

    .line 404
    .line 405
    if-eqz v13, :cond_3c

    .line 406
    .line 407
    if-eqz v0, :cond_19

    .line 408
    .line 409
    iget-object v0, v0, Lk8/t;->f:Ljava/lang/String;

    .line 410
    .line 411
    goto :goto_11

    .line 412
    :cond_19
    const/4 v0, 0x0

    .line 413
    :goto_11
    if-nez v0, :cond_1a

    .line 414
    .line 415
    goto :goto_12

    .line 416
    :cond_1a
    move-object v11, v0

    .line 417
    :goto_12
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    if-eqz v0, :cond_3b

    .line 422
    .line 423
    iget-object v0, v0, Lj8/p;->a:Lj8/n;

    .line 424
    .line 425
    if-eqz v0, :cond_3b

    .line 426
    .line 427
    invoke-virtual {v2}, Lh/Hchat/hooks/api/model/WeChatMessage;->getImageMsg()Lh/Hchat/hooks/api/model/WeChatImageMsg;

    .line 428
    .line 429
    .line 430
    move-result-object v8

    .line 431
    invoke-virtual {v0, v9}, Lj8/n;->p(Ljava/lang/Object;)Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v9

    .line 435
    filled-new-array {v9}, [Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object v9

    .line 439
    invoke-static {v9}, Lv8/q;->c([Ljava/lang/String;)Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v9

    .line 443
    invoke-static {v9}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 444
    .line 445
    .line 446
    move-result v13

    .line 447
    const-string v14, "hdlength"

    .line 448
    .line 449
    if-nez v13, :cond_1e

    .line 450
    .line 451
    if-eqz v8, :cond_1c

    .line 452
    .line 453
    iget v13, v8, Lh/Hchat/hooks/api/model/WeChatImageMsg;->bigLength:I

    .line 454
    .line 455
    move-object/from16 v31, v10

    .line 456
    .line 457
    move-object/from16 v32, v11

    .line 458
    .line 459
    int-to-long v10, v13

    .line 460
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 461
    .line 462
    .line 463
    move-result-object v13

    .line 464
    cmp-long v10, v10, v18

    .line 465
    .line 466
    if-lez v10, :cond_1b

    .line 467
    .line 468
    goto :goto_13

    .line 469
    :cond_1b
    const/4 v13, 0x0

    .line 470
    :goto_13
    if-eqz v13, :cond_1d

    .line 471
    .line 472
    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    .line 473
    .line 474
    .line 475
    move-result-wide v10

    .line 476
    goto :goto_14

    .line 477
    :cond_1c
    move-object/from16 v31, v10

    .line 478
    .line 479
    move-object/from16 v32, v11

    .line 480
    .line 481
    :cond_1d
    invoke-static {v2, v14}, Lv8/q;->h(Lh/Hchat/hooks/api/model/WeChatMessage;Ljava/lang/String;)J

    .line 482
    .line 483
    .line 484
    move-result-wide v10

    .line 485
    :goto_14
    invoke-static {v3, v9, v10, v11}, Lv8/q;->f(Lv8/h;Ljava/lang/String;J)Z

    .line 486
    .line 487
    .line 488
    move-result v10

    .line 489
    if-eqz v10, :cond_1f

    .line 490
    .line 491
    new-instance v10, Lv8/k;

    .line 492
    .line 493
    new-instance v25, Lv8/f;

    .line 494
    .line 495
    const/16 v30, 0x0

    .line 496
    .line 497
    const/16 v31, 0x1a

    .line 498
    .line 499
    const/16 v26, 0x3

    .line 500
    .line 501
    const/16 v27, 0x0

    .line 502
    .line 503
    const/16 v29, 0x0

    .line 504
    .line 505
    move-object/from16 v28, v9

    .line 506
    .line 507
    invoke-direct/range {v25 .. v31}, Lv8/f;-><init>(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V

    .line 508
    .line 509
    .line 510
    move-object/from16 v0, v25

    .line 511
    .line 512
    invoke-direct {v10, v0}, Lv8/k;-><init>(Lv8/f;)V

    .line 513
    .line 514
    .line 515
    goto/16 :goto_2c

    .line 516
    .line 517
    :cond_1e
    move-object/from16 v31, v10

    .line 518
    .line 519
    move-object/from16 v32, v11

    .line 520
    .line 521
    :cond_1f
    iget-object v10, v3, Lv8/h;->o:Ljava/lang/String;

    .line 522
    .line 523
    filled-new-array {v10}, [Ljava/lang/String;

    .line 524
    .line 525
    .line 526
    move-result-object v10

    .line 527
    invoke-static {v10}, Lv8/q;->c([Ljava/lang/String;)Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object v10

    .line 531
    invoke-static {v10}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 532
    .line 533
    .line 534
    move-result v11

    .line 535
    if-nez v11, :cond_20

    .line 536
    .line 537
    move-object/from16 v36, v10

    .line 538
    .line 539
    goto :goto_15

    .line 540
    :cond_20
    const/16 v36, 0x0

    .line 541
    .line 542
    :goto_15
    if-eqz v36, :cond_21

    .line 543
    .line 544
    new-instance v10, Lv8/k;

    .line 545
    .line 546
    new-instance v33, Lv8/f;

    .line 547
    .line 548
    const/16 v38, 0x0

    .line 549
    .line 550
    const/16 v39, 0x1a

    .line 551
    .line 552
    const/16 v34, 0x3

    .line 553
    .line 554
    const/16 v35, 0x0

    .line 555
    .line 556
    const/16 v37, 0x0

    .line 557
    .line 558
    invoke-direct/range {v33 .. v39}, Lv8/f;-><init>(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V

    .line 559
    .line 560
    .line 561
    move-object/from16 v0, v33

    .line 562
    .line 563
    invoke-direct {v10, v0}, Lv8/k;-><init>(Lv8/f;)V

    .line 564
    .line 565
    .line 566
    goto/16 :goto_2c

    .line 567
    .line 568
    :cond_21
    invoke-virtual {v2}, Lh/Hchat/hooks/api/model/WeChatMessage;->getImageMsg()Lh/Hchat/hooks/api/model/WeChatImageMsg;

    .line 569
    .line 570
    .line 571
    move-result-object v10

    .line 572
    if-eqz v10, :cond_22

    .line 573
    .line 574
    iget-object v11, v10, Lh/Hchat/hooks/api/model/WeChatImageMsg;->key:Ljava/lang/String;

    .line 575
    .line 576
    goto :goto_16

    .line 577
    :cond_22
    const/4 v11, 0x0

    .line 578
    :goto_16
    invoke-static {v2, v6}, Lv8/q;->i(Lh/Hchat/hooks/api/model/WeChatMessage;Ljava/lang/String;)Ljava/lang/String;

    .line 579
    .line 580
    .line 581
    move-result-object v6

    .line 582
    filled-new-array {v11, v6}, [Ljava/lang/String;

    .line 583
    .line 584
    .line 585
    move-result-object v6

    .line 586
    invoke-static {v6}, Lv8/q;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 587
    .line 588
    .line 589
    move-result-object v36

    .line 590
    invoke-static/range {v36 .. v36}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 591
    .line 592
    .line 593
    move-result v6

    .line 594
    if-eqz v6, :cond_23

    .line 595
    .line 596
    :goto_17
    const/4 v4, 0x0

    .line 597
    goto/16 :goto_25

    .line 598
    .line 599
    :cond_23
    if-eqz v10, :cond_24

    .line 600
    .line 601
    iget-object v6, v10, Lh/Hchat/hooks/api/model/WeChatImageMsg;->bigImgUrl:Ljava/lang/String;

    .line 602
    .line 603
    goto :goto_18

    .line 604
    :cond_24
    const/4 v6, 0x0

    .line 605
    :goto_18
    const-string v11, "cdnbigimgurl"

    .line 606
    .line 607
    invoke-static {v2, v11}, Lv8/q;->i(Lh/Hchat/hooks/api/model/WeChatMessage;Ljava/lang/String;)Ljava/lang/String;

    .line 608
    .line 609
    .line 610
    move-result-object v11

    .line 611
    filled-new-array {v6, v11}, [Ljava/lang/String;

    .line 612
    .line 613
    .line 614
    move-result-object v6

    .line 615
    invoke-static {v6}, Lv8/q;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 616
    .line 617
    .line 618
    move-result-object v35

    .line 619
    invoke-static/range {v35 .. v35}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 620
    .line 621
    .line 622
    move-result v6

    .line 623
    if-nez v6, :cond_29

    .line 624
    .line 625
    if-eqz v10, :cond_25

    .line 626
    .line 627
    iget-object v6, v10, Lh/Hchat/hooks/api/model/WeChatImageMsg;->md5:Ljava/lang/String;

    .line 628
    .line 629
    goto :goto_19

    .line 630
    :cond_25
    const/4 v6, 0x0

    .line 631
    :goto_19
    invoke-static {v2, v4}, Lv8/q;->i(Lh/Hchat/hooks/api/model/WeChatMessage;Ljava/lang/String;)Ljava/lang/String;

    .line 632
    .line 633
    .line 634
    move-result-object v4

    .line 635
    filled-new-array {v6, v4}, [Ljava/lang/String;

    .line 636
    .line 637
    .line 638
    move-result-object v4

    .line 639
    invoke-static {v4}, Lv8/q;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 640
    .line 641
    .line 642
    move-result-object v34

    .line 643
    if-eqz v10, :cond_26

    .line 644
    .line 645
    iget v4, v10, Lh/Hchat/hooks/api/model/WeChatImageMsg;->bigLength:I

    .line 646
    .line 647
    int-to-long v10, v4

    .line 648
    goto :goto_1a

    .line 649
    :cond_26
    move-wide/from16 v10, v18

    .line 650
    .line 651
    :goto_1a
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 652
    .line 653
    .line 654
    move-result-object v4

    .line 655
    cmp-long v6, v10, v18

    .line 656
    .line 657
    if-lez v6, :cond_27

    .line 658
    .line 659
    goto :goto_1b

    .line 660
    :cond_27
    const/4 v4, 0x0

    .line 661
    :goto_1b
    if-eqz v4, :cond_28

    .line 662
    .line 663
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 664
    .line 665
    .line 666
    move-result-wide v10

    .line 667
    :goto_1c
    move-wide/from16 v38, v10

    .line 668
    .line 669
    goto :goto_1d

    .line 670
    :cond_28
    invoke-static {v2, v14}, Lv8/q;->h(Lh/Hchat/hooks/api/model/WeChatMessage;Ljava/lang/String;)J

    .line 671
    .line 672
    .line 673
    move-result-wide v10

    .line 674
    goto :goto_1c

    .line 675
    :goto_1d
    new-instance v33, Lv8/e;

    .line 676
    .line 677
    const/16 v37, 0x1

    .line 678
    .line 679
    invoke-direct/range {v33 .. v39}, Lv8/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJ)V

    .line 680
    .line 681
    .line 682
    :goto_1e
    move-object/from16 v4, v33

    .line 683
    .line 684
    goto :goto_25

    .line 685
    :cond_29
    if-eqz v10, :cond_2a

    .line 686
    .line 687
    iget-object v6, v10, Lh/Hchat/hooks/api/model/WeChatImageMsg;->midImgUrl:Ljava/lang/String;

    .line 688
    .line 689
    goto :goto_1f

    .line 690
    :cond_2a
    const/4 v6, 0x0

    .line 691
    :goto_1f
    const-string v11, "cdnmidimgurl"

    .line 692
    .line 693
    invoke-static {v2, v11}, Lv8/q;->i(Lh/Hchat/hooks/api/model/WeChatMessage;Ljava/lang/String;)Ljava/lang/String;

    .line 694
    .line 695
    .line 696
    move-result-object v11

    .line 697
    filled-new-array {v6, v11}, [Ljava/lang/String;

    .line 698
    .line 699
    .line 700
    move-result-object v6

    .line 701
    invoke-static {v6}, Lv8/q;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 702
    .line 703
    .line 704
    move-result-object v35

    .line 705
    invoke-static/range {v35 .. v35}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 706
    .line 707
    .line 708
    move-result v6

    .line 709
    if-eqz v6, :cond_2b

    .line 710
    .line 711
    goto :goto_17

    .line 712
    :cond_2b
    if-eqz v10, :cond_2c

    .line 713
    .line 714
    iget-object v6, v10, Lh/Hchat/hooks/api/model/WeChatImageMsg;->md5:Ljava/lang/String;

    .line 715
    .line 716
    goto :goto_20

    .line 717
    :cond_2c
    const/4 v6, 0x0

    .line 718
    :goto_20
    invoke-static {v2, v4}, Lv8/q;->i(Lh/Hchat/hooks/api/model/WeChatMessage;Ljava/lang/String;)Ljava/lang/String;

    .line 719
    .line 720
    .line 721
    move-result-object v4

    .line 722
    filled-new-array {v6, v4}, [Ljava/lang/String;

    .line 723
    .line 724
    .line 725
    move-result-object v4

    .line 726
    invoke-static {v4}, Lv8/q;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 727
    .line 728
    .line 729
    move-result-object v34

    .line 730
    if-eqz v10, :cond_2d

    .line 731
    .line 732
    iget v4, v10, Lh/Hchat/hooks/api/model/WeChatImageMsg;->midLength:I

    .line 733
    .line 734
    int-to-long v10, v4

    .line 735
    goto :goto_21

    .line 736
    :cond_2d
    move-wide/from16 v10, v18

    .line 737
    .line 738
    :goto_21
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 739
    .line 740
    .line 741
    move-result-object v4

    .line 742
    cmp-long v6, v10, v18

    .line 743
    .line 744
    if-lez v6, :cond_2e

    .line 745
    .line 746
    goto :goto_22

    .line 747
    :cond_2e
    const/4 v4, 0x0

    .line 748
    :goto_22
    if-eqz v4, :cond_2f

    .line 749
    .line 750
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 751
    .line 752
    .line 753
    move-result-wide v10

    .line 754
    :goto_23
    move-wide/from16 v38, v10

    .line 755
    .line 756
    goto :goto_24

    .line 757
    :cond_2f
    invoke-static {v2, v12}, Lv8/q;->h(Lh/Hchat/hooks/api/model/WeChatMessage;Ljava/lang/String;)J

    .line 758
    .line 759
    .line 760
    move-result-wide v10

    .line 761
    goto :goto_23

    .line 762
    :goto_24
    new-instance v33, Lv8/e;

    .line 763
    .line 764
    const/16 v37, 0x2

    .line 765
    .line 766
    invoke-direct/range {v33 .. v39}, Lv8/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJ)V

    .line 767
    .line 768
    .line 769
    goto :goto_1e

    .line 770
    :goto_25
    if-eqz v4, :cond_32

    .line 771
    .line 772
    iget-boolean v6, v3, Lv8/h;->p:Z

    .line 773
    .line 774
    if-nez v6, :cond_32

    .line 775
    .line 776
    new-instance v6, Ljava/io/File;

    .line 777
    .line 778
    invoke-virtual/range {v24 .. v24}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 779
    .line 780
    .line 781
    move-result-object v10

    .line 782
    invoke-direct {v6, v10, v15}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 783
    .line 784
    .line 785
    invoke-virtual {v6}, Ljava/io/File;->mkdirs()Z

    .line 786
    .line 787
    .line 788
    new-instance v10, Ljava/io/File;

    .line 789
    .line 790
    iget-object v11, v3, Lv8/h;->m:Ljava/lang/String;

    .line 791
    .line 792
    const-string v13, "image_"

    .line 793
    .line 794
    const-string v14, ".jpg"

    .line 795
    .line 796
    invoke-static {v13, v11, v14}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 797
    .line 798
    .line 799
    move-result-object v11

    .line 800
    invoke-direct {v10, v6, v11}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 801
    .line 802
    .line 803
    invoke-virtual {v10}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 804
    .line 805
    .line 806
    move-result-object v6

    .line 807
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 808
    .line 809
    .line 810
    iput-object v6, v3, Lv8/h;->n:Ljava/lang/String;

    .line 811
    .line 812
    new-instance v10, Ljava/io/File;

    .line 813
    .line 814
    invoke-direct {v10, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 815
    .line 816
    .line 817
    invoke-virtual {v1, v10}, Lv8/q;->g(Ljava/io/File;)Ljava/lang/String;

    .line 818
    .line 819
    .line 820
    move-result-object v10

    .line 821
    if-eqz v10, :cond_30

    .line 822
    .line 823
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 824
    .line 825
    .line 826
    invoke-virtual {v7, v10}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 827
    .line 828
    .line 829
    :cond_30
    const/4 v7, 0x1

    .line 830
    iput-boolean v7, v3, Lv8/h;->p:Z

    .line 831
    .line 832
    iput-boolean v7, v3, Lv8/h;->q:Z

    .line 833
    .line 834
    iget-object v7, v4, Lv8/e;->b:Ljava/lang/String;

    .line 835
    .line 836
    iget-object v10, v4, Lv8/e;->c:Ljava/lang/String;

    .line 837
    .line 838
    iget v11, v4, Lv8/e;->d:I

    .line 839
    .line 840
    new-instance v13, Lp4/t;

    .line 841
    .line 842
    const/16 v14, 0xd

    .line 843
    .line 844
    invoke-direct {v13, v1, v14, v3}, Lp4/t;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 845
    .line 846
    .line 847
    move-object/from16 v25, v0

    .line 848
    .line 849
    move-object/from16 v28, v6

    .line 850
    .line 851
    move-object/from16 v26, v7

    .line 852
    .line 853
    move-object/from16 v27, v10

    .line 854
    .line 855
    move/from16 v29, v11

    .line 856
    .line 857
    move-object/from16 v30, v13

    .line 858
    .line 859
    invoke-virtual/range {v25 .. v30}, Lj8/n;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILj8/l;)Z

    .line 860
    .line 861
    .line 862
    move-result v0

    .line 863
    if-eqz v0, :cond_31

    .line 864
    .line 865
    new-instance v0, Lv8/b;

    .line 866
    .line 867
    invoke-direct {v0, v3, v1}, Lv8/b;-><init>(Lv8/h;Lv8/q;)V

    .line 868
    .line 869
    .line 870
    const-wide/32 v2, 0xea60

    .line 871
    .line 872
    .line 873
    invoke-virtual {v1, v2, v3, v0}, Lv8/q;->o(JLfg/a;)Z

    .line 874
    .line 875
    .line 876
    :goto_26
    move-object/from16 v10, v23

    .line 877
    .line 878
    goto/16 :goto_2c

    .line 879
    .line 880
    :cond_31
    const/4 v6, 0x0

    .line 881
    iput-boolean v6, v3, Lv8/h;->q:Z

    .line 882
    .line 883
    const/4 v7, 0x1

    .line 884
    iput-boolean v7, v3, Lv8/h;->r:Z

    .line 885
    .line 886
    iput-object v5, v3, Lv8/h;->s:Ljava/lang/String;

    .line 887
    .line 888
    :cond_32
    iget-boolean v0, v3, Lv8/h;->q:Z

    .line 889
    .line 890
    if-eqz v0, :cond_33

    .line 891
    .line 892
    goto :goto_26

    .line 893
    :cond_33
    iget-boolean v0, v3, Lv8/h;->r:Z

    .line 894
    .line 895
    const-string v5, "\u56fe\u7247\u4e0b\u8f7d\u5931\u8d25"

    .line 896
    .line 897
    if-eqz v0, :cond_35

    .line 898
    .line 899
    if-eqz v4, :cond_35

    .line 900
    .line 901
    iget-object v0, v3, Lv8/h;->s:Ljava/lang/String;

    .line 902
    .line 903
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 904
    .line 905
    .line 906
    move-result v2

    .line 907
    if-eqz v2, :cond_34

    .line 908
    .line 909
    goto :goto_27

    .line 910
    :cond_34
    move-object v5, v0

    .line 911
    :goto_27
    new-instance v10, Lv8/j;

    .line 912
    .line 913
    invoke-direct {v10, v5}, Lv8/j;-><init>(Ljava/lang/String;)V

    .line 914
    .line 915
    .line 916
    goto/16 :goto_2c

    .line 917
    .line 918
    :cond_35
    iget-object v0, v2, Lh/Hchat/hooks/api/model/WeChatMessage;->imagePath:Ljava/lang/String;

    .line 919
    .line 920
    move-object/from16 v11, v32

    .line 921
    .line 922
    filled-new-array {v11, v9, v0}, [Ljava/lang/String;

    .line 923
    .line 924
    .line 925
    move-result-object v0

    .line 926
    invoke-static {v0}, Lv8/q;->c([Ljava/lang/String;)Ljava/lang/String;

    .line 927
    .line 928
    .line 929
    move-result-object v0

    .line 930
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 931
    .line 932
    .line 933
    move-result v4

    .line 934
    if-nez v4, :cond_38

    .line 935
    .line 936
    if-eqz v8, :cond_37

    .line 937
    .line 938
    iget v4, v8, Lh/Hchat/hooks/api/model/WeChatImageMsg;->midLength:I

    .line 939
    .line 940
    int-to-long v6, v4

    .line 941
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 942
    .line 943
    .line 944
    move-result-object v4

    .line 945
    cmp-long v6, v6, v18

    .line 946
    .line 947
    if-lez v6, :cond_36

    .line 948
    .line 949
    move-object/from16 v17, v4

    .line 950
    .line 951
    goto :goto_28

    .line 952
    :cond_36
    const/16 v17, 0x0

    .line 953
    .line 954
    :goto_28
    if-eqz v17, :cond_37

    .line 955
    .line 956
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Long;->longValue()J

    .line 957
    .line 958
    .line 959
    move-result-wide v6

    .line 960
    goto :goto_29

    .line 961
    :cond_37
    invoke-static {v2, v12}, Lv8/q;->h(Lh/Hchat/hooks/api/model/WeChatMessage;Ljava/lang/String;)J

    .line 962
    .line 963
    .line 964
    move-result-wide v6

    .line 965
    :goto_29
    invoke-static {v3, v0, v6, v7}, Lv8/q;->f(Lv8/h;Ljava/lang/String;J)Z

    .line 966
    .line 967
    .line 968
    move-result v2

    .line 969
    if-eqz v2, :cond_38

    .line 970
    .line 971
    new-instance v10, Lv8/k;

    .line 972
    .line 973
    new-instance v20, Lv8/f;

    .line 974
    .line 975
    const/16 v25, 0x0

    .line 976
    .line 977
    const/16 v26, 0x1a

    .line 978
    .line 979
    const/16 v21, 0x3

    .line 980
    .line 981
    const/16 v22, 0x0

    .line 982
    .line 983
    const/16 v24, 0x0

    .line 984
    .line 985
    move-object/from16 v23, v0

    .line 986
    .line 987
    invoke-direct/range {v20 .. v26}, Lv8/f;-><init>(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V

    .line 988
    .line 989
    .line 990
    move-object/from16 v0, v20

    .line 991
    .line 992
    invoke-direct {v10, v0}, Lv8/k;-><init>(Lv8/f;)V

    .line 993
    .line 994
    .line 995
    goto :goto_2c

    .line 996
    :cond_38
    iget-boolean v0, v3, Lv8/h;->r:Z

    .line 997
    .line 998
    if-eqz v0, :cond_3a

    .line 999
    .line 1000
    iget-object v0, v3, Lv8/h;->s:Ljava/lang/String;

    .line 1001
    .line 1002
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1003
    .line 1004
    .line 1005
    move-result v2

    .line 1006
    if-eqz v2, :cond_39

    .line 1007
    .line 1008
    goto :goto_2a

    .line 1009
    :cond_39
    move-object v5, v0

    .line 1010
    :goto_2a
    new-instance v10, Lv8/j;

    .line 1011
    .line 1012
    invoke-direct {v10, v5}, Lv8/j;-><init>(Ljava/lang/String;)V

    .line 1013
    .line 1014
    .line 1015
    goto :goto_2c

    .line 1016
    :cond_3a
    :goto_2b
    move-object/from16 v10, v31

    .line 1017
    .line 1018
    goto :goto_2c

    .line 1019
    :cond_3b
    move-object/from16 v31, v10

    .line 1020
    .line 1021
    goto :goto_2b

    .line 1022
    :goto_2c
    move-object v14, v10

    .line 1023
    goto/16 :goto_58

    .line 1024
    .line 1025
    :cond_3c
    move-object/from16 v31, v10

    .line 1026
    .line 1027
    invoke-virtual {v2}, Lh/Hchat/hooks/api/model/WeChatMessage;->isVideo()Z

    .line 1028
    .line 1029
    .line 1030
    move-result v9

    .line 1031
    if-eqz v9, :cond_5f

    .line 1032
    .line 1033
    if-eqz v0, :cond_3d

    .line 1034
    .line 1035
    iget-object v0, v0, Lk8/t;->f:Ljava/lang/String;

    .line 1036
    .line 1037
    goto :goto_2d

    .line 1038
    :cond_3d
    const/4 v0, 0x0

    .line 1039
    :goto_2d
    if-nez v0, :cond_3e

    .line 1040
    .line 1041
    goto :goto_2e

    .line 1042
    :cond_3e
    move-object v11, v0

    .line 1043
    :goto_2e
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v0

    .line 1047
    if-eqz v0, :cond_3a

    .line 1048
    .line 1049
    iget-object v9, v0, Lj8/p;->c:Lbb/b;

    .line 1050
    .line 1051
    if-eqz v9, :cond_3a

    .line 1052
    .line 1053
    iget-object v0, v2, Lh/Hchat/hooks/api/model/WeChatMessage;->imagePath:Ljava/lang/String;

    .line 1054
    .line 1055
    filled-new-array {v0, v11}, [Ljava/lang/String;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v0

    .line 1059
    invoke-static {v0}, Ltf/l;->k0([Ljava/lang/Object;)Lng/j;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v0

    .line 1063
    new-instance v10, Lr9/p;

    .line 1064
    .line 1065
    const/16 v13, 0xe

    .line 1066
    .line 1067
    invoke-direct {v10, v13}, Lr9/p;-><init>(I)V

    .line 1068
    .line 1069
    .line 1070
    invoke-static {v0, v10}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v0

    .line 1074
    new-instance v10, Lr9/p;

    .line 1075
    .line 1076
    const/16 v13, 0xf

    .line 1077
    .line 1078
    invoke-direct {v10, v13}, Lr9/p;-><init>(I)V

    .line 1079
    .line 1080
    .line 1081
    new-instance v13, Lng/i;

    .line 1082
    .line 1083
    const/4 v14, 0x1

    .line 1084
    invoke-direct {v13, v0, v14, v10}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 1085
    .line 1086
    .line 1087
    invoke-static {v13}, Lng/m;->S(Lng/j;)Lng/c;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v0

    .line 1091
    invoke-virtual {v0}, Lng/c;->iterator()Ljava/util/Iterator;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v10

    .line 1095
    const/4 v13, 0x0

    .line 1096
    :cond_3f
    move-object v0, v10

    .line 1097
    check-cast v0, Ltf/b;

    .line 1098
    .line 1099
    invoke-virtual {v0}, Ltf/b;->hasNext()Z

    .line 1100
    .line 1101
    .line 1102
    move-result v14

    .line 1103
    if-eqz v14, :cond_42

    .line 1104
    .line 1105
    invoke-virtual {v0}, Ltf/b;->next()Ljava/lang/Object;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v0

    .line 1109
    check-cast v0, Ljava/lang/String;

    .line 1110
    .line 1111
    :try_start_1
    invoke-virtual {v9, v0}, Lbb/b;->n(Ljava/lang/String;)Lj8/r;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1115
    goto :goto_2f

    .line 1116
    :catchall_1
    move-exception v0

    .line 1117
    new-instance v14, Lsf/f;

    .line 1118
    .line 1119
    invoke-direct {v14, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1120
    .line 1121
    .line 1122
    move-object v0, v14

    .line 1123
    :goto_2f
    nop

    .line 1124
    instance-of v14, v0, Lsf/f;

    .line 1125
    .line 1126
    if-eqz v14, :cond_40

    .line 1127
    .line 1128
    const/4 v0, 0x0

    .line 1129
    :cond_40
    check-cast v0, Lj8/r;

    .line 1130
    .line 1131
    if-eqz v0, :cond_3f

    .line 1132
    .line 1133
    if-nez v13, :cond_41

    .line 1134
    .line 1135
    move-object v13, v0

    .line 1136
    :cond_41
    iget-object v14, v0, Lj8/r;->b:Ljava/lang/String;

    .line 1137
    .line 1138
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1139
    .line 1140
    .line 1141
    invoke-static {v14}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1142
    .line 1143
    .line 1144
    move-result v14

    .line 1145
    if-nez v14, :cond_3f

    .line 1146
    .line 1147
    iget-object v14, v0, Lj8/r;->c:Ljava/lang/String;

    .line 1148
    .line 1149
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1150
    .line 1151
    .line 1152
    invoke-static {v14}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1153
    .line 1154
    .line 1155
    move-result v14

    .line 1156
    if-nez v14, :cond_3f

    .line 1157
    .line 1158
    move-object v13, v0

    .line 1159
    :cond_42
    invoke-virtual {v2}, Lh/Hchat/hooks/api/model/WeChatMessage;->getVideoMsg()Lh/Hchat/hooks/api/model/WeChatVideoMsg;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v0

    .line 1163
    if-eqz v13, :cond_43

    .line 1164
    .line 1165
    iget-object v10, v13, Lj8/r;->b:Ljava/lang/String;

    .line 1166
    .line 1167
    goto :goto_30

    .line 1168
    :cond_43
    const/4 v10, 0x0

    .line 1169
    :goto_30
    if-eqz v0, :cond_44

    .line 1170
    .line 1171
    iget-object v14, v0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->cdnVideoUrl:Ljava/lang/String;

    .line 1172
    .line 1173
    :goto_31
    move/from16 v25, v8

    .line 1174
    .line 1175
    goto :goto_32

    .line 1176
    :cond_44
    const/4 v14, 0x0

    .line 1177
    goto :goto_31

    .line 1178
    :goto_32
    const-string v8, "cdnvideourl"

    .line 1179
    .line 1180
    invoke-static {v2, v8}, Lv8/q;->i(Lh/Hchat/hooks/api/model/WeChatMessage;Ljava/lang/String;)Ljava/lang/String;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v8

    .line 1184
    filled-new-array {v10, v14, v8}, [Ljava/lang/String;

    .line 1185
    .line 1186
    .line 1187
    move-result-object v8

    .line 1188
    invoke-static {v8}, Lv8/q;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v34

    .line 1192
    if-eqz v13, :cond_45

    .line 1193
    .line 1194
    iget-object v8, v13, Lj8/r;->c:Ljava/lang/String;

    .line 1195
    .line 1196
    goto :goto_33

    .line 1197
    :cond_45
    const/4 v8, 0x0

    .line 1198
    :goto_33
    if-eqz v0, :cond_46

    .line 1199
    .line 1200
    iget-object v10, v0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->aesKey:Ljava/lang/String;

    .line 1201
    .line 1202
    goto :goto_34

    .line 1203
    :cond_46
    const/4 v10, 0x0

    .line 1204
    :goto_34
    invoke-static {v2, v6}, Lv8/q;->i(Lh/Hchat/hooks/api/model/WeChatMessage;Ljava/lang/String;)Ljava/lang/String;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v6

    .line 1208
    filled-new-array {v8, v10, v6}, [Ljava/lang/String;

    .line 1209
    .line 1210
    .line 1211
    move-result-object v6

    .line 1212
    invoke-static {v6}, Lv8/q;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v35

    .line 1216
    invoke-static/range {v34 .. v34}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1217
    .line 1218
    .line 1219
    move-result v6

    .line 1220
    if-nez v6, :cond_47

    .line 1221
    .line 1222
    invoke-static/range {v35 .. v35}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1223
    .line 1224
    .line 1225
    move-result v6

    .line 1226
    if-eqz v6, :cond_48

    .line 1227
    .line 1228
    :cond_47
    move-object v6, v5

    .line 1229
    goto/16 :goto_3e

    .line 1230
    .line 1231
    :cond_48
    if-eqz v13, :cond_49

    .line 1232
    .line 1233
    iget-object v6, v13, Lj8/r;->a:Ljava/lang/String;

    .line 1234
    .line 1235
    goto :goto_35

    .line 1236
    :cond_49
    const/4 v6, 0x0

    .line 1237
    :goto_35
    if-eqz v0, :cond_4a

    .line 1238
    .line 1239
    iget-object v8, v0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->md5:Ljava/lang/String;

    .line 1240
    .line 1241
    goto :goto_36

    .line 1242
    :cond_4a
    const/4 v8, 0x0

    .line 1243
    :goto_36
    if-eqz v0, :cond_4b

    .line 1244
    .line 1245
    iget-object v10, v0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->newMd5:Ljava/lang/String;

    .line 1246
    .line 1247
    goto :goto_37

    .line 1248
    :cond_4b
    const/4 v10, 0x0

    .line 1249
    :goto_37
    invoke-static {v2, v4}, Lv8/q;->i(Lh/Hchat/hooks/api/model/WeChatMessage;Ljava/lang/String;)Ljava/lang/String;

    .line 1250
    .line 1251
    .line 1252
    move-result-object v4

    .line 1253
    const-string v14, "newmd5"

    .line 1254
    .line 1255
    invoke-static {v2, v14}, Lv8/q;->i(Lh/Hchat/hooks/api/model/WeChatMessage;Ljava/lang/String;)Ljava/lang/String;

    .line 1256
    .line 1257
    .line 1258
    move-result-object v14

    .line 1259
    filled-new-array {v6, v8, v10, v4, v14}, [Ljava/lang/String;

    .line 1260
    .line 1261
    .line 1262
    move-result-object v4

    .line 1263
    invoke-static {v4}, Lv8/q;->e([Ljava/lang/String;)Ljava/lang/String;

    .line 1264
    .line 1265
    .line 1266
    move-result-object v33

    .line 1267
    move-object v6, v5

    .line 1268
    if-eqz v13, :cond_4c

    .line 1269
    .line 1270
    iget-wide v4, v13, Lj8/r;->d:J

    .line 1271
    .line 1272
    goto :goto_38

    .line 1273
    :cond_4c
    move-wide/from16 v4, v18

    .line 1274
    .line 1275
    :goto_38
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1276
    .line 1277
    .line 1278
    move-result-object v8

    .line 1279
    cmp-long v4, v4, v18

    .line 1280
    .line 1281
    if-lez v4, :cond_4d

    .line 1282
    .line 1283
    goto :goto_39

    .line 1284
    :cond_4d
    const/4 v8, 0x0

    .line 1285
    :goto_39
    if-eqz v8, :cond_4e

    .line 1286
    .line 1287
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 1288
    .line 1289
    .line 1290
    move-result-wide v4

    .line 1291
    :goto_3a
    move-wide/from16 v37, v4

    .line 1292
    .line 1293
    goto :goto_3d

    .line 1294
    :cond_4e
    if-eqz v0, :cond_4f

    .line 1295
    .line 1296
    iget-wide v4, v0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->length:J

    .line 1297
    .line 1298
    goto :goto_3b

    .line 1299
    :cond_4f
    move-wide/from16 v4, v18

    .line 1300
    .line 1301
    :goto_3b
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1302
    .line 1303
    .line 1304
    move-result-object v0

    .line 1305
    cmp-long v4, v4, v18

    .line 1306
    .line 1307
    if-lez v4, :cond_50

    .line 1308
    .line 1309
    goto :goto_3c

    .line 1310
    :cond_50
    const/4 v0, 0x0

    .line 1311
    :goto_3c
    if-eqz v0, :cond_51

    .line 1312
    .line 1313
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 1314
    .line 1315
    .line 1316
    move-result-wide v4

    .line 1317
    goto :goto_3a

    .line 1318
    :cond_51
    invoke-static {v2, v12}, Lv8/q;->h(Lh/Hchat/hooks/api/model/WeChatMessage;Ljava/lang/String;)J

    .line 1319
    .line 1320
    .line 1321
    move-result-wide v4

    .line 1322
    goto :goto_3a

    .line 1323
    :goto_3d
    new-instance v32, Lv8/e;

    .line 1324
    .line 1325
    const/16 v36, 0x4

    .line 1326
    .line 1327
    invoke-direct/range {v32 .. v38}, Lv8/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJ)V

    .line 1328
    .line 1329
    .line 1330
    move-object/from16 v0, v32

    .line 1331
    .line 1332
    goto :goto_3f

    .line 1333
    :goto_3e
    const/4 v0, 0x0

    .line 1334
    :goto_3f
    iget-object v4, v2, Lh/Hchat/hooks/api/model/WeChatMessage;->imagePath:Ljava/lang/String;

    .line 1335
    .line 1336
    invoke-virtual {v9, v4}, Lbb/b;->o(Ljava/lang/String;)Ljava/lang/String;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v5

    .line 1340
    filled-new-array {v11, v4, v5}, [Ljava/lang/String;

    .line 1341
    .line 1342
    .line 1343
    move-result-object v4

    .line 1344
    invoke-static {v4}, Lv8/q;->c([Ljava/lang/String;)Ljava/lang/String;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v10

    .line 1348
    invoke-static {v10}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1349
    .line 1350
    .line 1351
    move-result v4

    .line 1352
    if-nez v4, :cond_57

    .line 1353
    .line 1354
    if-eqz v13, :cond_53

    .line 1355
    .line 1356
    iget-wide v4, v13, Lj8/r;->d:J

    .line 1357
    .line 1358
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1359
    .line 1360
    .line 1361
    move-result-object v8

    .line 1362
    cmp-long v4, v4, v18

    .line 1363
    .line 1364
    if-lez v4, :cond_52

    .line 1365
    .line 1366
    goto :goto_40

    .line 1367
    :cond_52
    const/4 v8, 0x0

    .line 1368
    :goto_40
    if-eqz v8, :cond_53

    .line 1369
    .line 1370
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 1371
    .line 1372
    .line 1373
    move-result-wide v4

    .line 1374
    goto :goto_42

    .line 1375
    :cond_53
    if-eqz v0, :cond_54

    .line 1376
    .line 1377
    iget-wide v4, v0, Lv8/e;->e:J

    .line 1378
    .line 1379
    goto :goto_42

    .line 1380
    :cond_54
    invoke-virtual {v2}, Lh/Hchat/hooks/api/model/WeChatMessage;->getVideoMsg()Lh/Hchat/hooks/api/model/WeChatVideoMsg;

    .line 1381
    .line 1382
    .line 1383
    move-result-object v2

    .line 1384
    if-eqz v2, :cond_55

    .line 1385
    .line 1386
    iget-wide v4, v2, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->length:J

    .line 1387
    .line 1388
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1389
    .line 1390
    .line 1391
    move-result-object v2

    .line 1392
    goto :goto_41

    .line 1393
    :cond_55
    const/4 v2, 0x0

    .line 1394
    :goto_41
    if-eqz v2, :cond_56

    .line 1395
    .line 1396
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 1397
    .line 1398
    .line 1399
    move-result-wide v4

    .line 1400
    goto :goto_42

    .line 1401
    :cond_56
    move-wide/from16 v4, v18

    .line 1402
    .line 1403
    :goto_42
    invoke-static {v3, v10, v4, v5}, Lv8/q;->f(Lv8/h;Ljava/lang/String;J)Z

    .line 1404
    .line 1405
    .line 1406
    move-result v2

    .line 1407
    if-eqz v2, :cond_57

    .line 1408
    .line 1409
    new-instance v0, Lv8/k;

    .line 1410
    .line 1411
    new-instance v7, Lv8/f;

    .line 1412
    .line 1413
    const/4 v12, 0x0

    .line 1414
    const/16 v13, 0x1a

    .line 1415
    .line 1416
    const/4 v9, 0x0

    .line 1417
    const/4 v11, 0x0

    .line 1418
    move/from16 v8, v25

    .line 1419
    .line 1420
    invoke-direct/range {v7 .. v13}, Lv8/f;-><init>(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V

    .line 1421
    .line 1422
    .line 1423
    invoke-direct {v0, v7}, Lv8/k;-><init>(Lv8/f;)V

    .line 1424
    .line 1425
    .line 1426
    :goto_43
    move-object v10, v0

    .line 1427
    goto/16 :goto_2c

    .line 1428
    .line 1429
    :cond_57
    move/from16 v8, v25

    .line 1430
    .line 1431
    iget-object v2, v3, Lv8/h;->o:Ljava/lang/String;

    .line 1432
    .line 1433
    filled-new-array {v2}, [Ljava/lang/String;

    .line 1434
    .line 1435
    .line 1436
    move-result-object v2

    .line 1437
    invoke-static {v2}, Lv8/q;->c([Ljava/lang/String;)Ljava/lang/String;

    .line 1438
    .line 1439
    .line 1440
    move-result-object v2

    .line 1441
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1442
    .line 1443
    .line 1444
    move-result v4

    .line 1445
    if-nez v4, :cond_58

    .line 1446
    .line 1447
    move-object v10, v2

    .line 1448
    goto :goto_44

    .line 1449
    :cond_58
    const/4 v10, 0x0

    .line 1450
    :goto_44
    if-eqz v10, :cond_59

    .line 1451
    .line 1452
    new-instance v0, Lv8/k;

    .line 1453
    .line 1454
    new-instance v7, Lv8/f;

    .line 1455
    .line 1456
    const/4 v12, 0x0

    .line 1457
    const/16 v13, 0x1a

    .line 1458
    .line 1459
    const/4 v9, 0x0

    .line 1460
    const/4 v11, 0x0

    .line 1461
    invoke-direct/range {v7 .. v13}, Lv8/f;-><init>(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V

    .line 1462
    .line 1463
    .line 1464
    invoke-direct {v0, v7}, Lv8/k;-><init>(Lv8/f;)V

    .line 1465
    .line 1466
    .line 1467
    goto :goto_43

    .line 1468
    :cond_59
    if-eqz v0, :cond_5c

    .line 1469
    .line 1470
    iget-boolean v2, v3, Lv8/h;->p:Z

    .line 1471
    .line 1472
    if-nez v2, :cond_5c

    .line 1473
    .line 1474
    new-instance v2, Ljava/io/File;

    .line 1475
    .line 1476
    invoke-virtual/range {v24 .. v24}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 1477
    .line 1478
    .line 1479
    move-result-object v4

    .line 1480
    invoke-direct {v2, v4, v15}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1481
    .line 1482
    .line 1483
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 1484
    .line 1485
    .line 1486
    new-instance v4, Ljava/io/File;

    .line 1487
    .line 1488
    iget-object v5, v3, Lv8/h;->m:Ljava/lang/String;

    .line 1489
    .line 1490
    const-string v8, "video_"

    .line 1491
    .line 1492
    const-string v10, ".mp4"

    .line 1493
    .line 1494
    invoke-static {v8, v5, v10}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1495
    .line 1496
    .line 1497
    move-result-object v5

    .line 1498
    invoke-direct {v4, v2, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1499
    .line 1500
    .line 1501
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 1502
    .line 1503
    .line 1504
    move-result-object v13

    .line 1505
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1506
    .line 1507
    .line 1508
    iput-object v13, v3, Lv8/h;->n:Ljava/lang/String;

    .line 1509
    .line 1510
    new-instance v2, Ljava/io/File;

    .line 1511
    .line 1512
    invoke-direct {v2, v13}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1513
    .line 1514
    .line 1515
    invoke-virtual {v1, v2}, Lv8/q;->g(Ljava/io/File;)Ljava/lang/String;

    .line 1516
    .line 1517
    .line 1518
    move-result-object v2

    .line 1519
    if-eqz v2, :cond_5a

    .line 1520
    .line 1521
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1522
    .line 1523
    .line 1524
    invoke-virtual {v7, v2}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 1525
    .line 1526
    .line 1527
    :cond_5a
    const/4 v7, 0x1

    .line 1528
    iput-boolean v7, v3, Lv8/h;->p:Z

    .line 1529
    .line 1530
    iput-boolean v7, v3, Lv8/h;->q:Z

    .line 1531
    .line 1532
    iget-object v11, v0, Lv8/e;->b:Ljava/lang/String;

    .line 1533
    .line 1534
    iget-object v12, v0, Lv8/e;->c:Ljava/lang/String;

    .line 1535
    .line 1536
    new-instance v2, Lb5/c;

    .line 1537
    .line 1538
    invoke-direct {v2, v0, v1, v3}, Lb5/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1539
    .line 1540
    .line 1541
    iget-object v0, v9, Lbb/b;->d:Ljava/lang/Object;

    .line 1542
    .line 1543
    move-object v10, v0

    .line 1544
    check-cast v10, Lj8/n;

    .line 1545
    .line 1546
    new-instance v15, Landroidx/lifecycle/x;

    .line 1547
    .line 1548
    const/16 v0, 0x1b

    .line 1549
    .line 1550
    invoke-direct {v15, v2, v0}, Landroidx/lifecycle/x;-><init>(Ljava/lang/Object;I)V

    .line 1551
    .line 1552
    .line 1553
    const/4 v14, 0x4

    .line 1554
    invoke-virtual/range {v10 .. v15}, Lj8/n;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILj8/l;)Z

    .line 1555
    .line 1556
    .line 1557
    move-result v0

    .line 1558
    if-eqz v0, :cond_5b

    .line 1559
    .line 1560
    new-instance v0, Lv8/b;

    .line 1561
    .line 1562
    invoke-direct {v0, v3, v1}, Lv8/b;-><init>(Lv8/h;Lv8/q;)V

    .line 1563
    .line 1564
    .line 1565
    const-wide/32 v2, 0xea60

    .line 1566
    .line 1567
    .line 1568
    invoke-virtual {v1, v2, v3, v0}, Lv8/q;->o(JLfg/a;)Z

    .line 1569
    .line 1570
    .line 1571
    goto/16 :goto_26

    .line 1572
    .line 1573
    :cond_5b
    const/4 v2, 0x0

    .line 1574
    iput-boolean v2, v3, Lv8/h;->q:Z

    .line 1575
    .line 1576
    const/4 v7, 0x1

    .line 1577
    iput-boolean v7, v3, Lv8/h;->r:Z

    .line 1578
    .line 1579
    iput-object v6, v3, Lv8/h;->s:Ljava/lang/String;

    .line 1580
    .line 1581
    :cond_5c
    iget-boolean v0, v3, Lv8/h;->q:Z

    .line 1582
    .line 1583
    if-eqz v0, :cond_5d

    .line 1584
    .line 1585
    goto/16 :goto_26

    .line 1586
    .line 1587
    :cond_5d
    iget-boolean v0, v3, Lv8/h;->r:Z

    .line 1588
    .line 1589
    if-eqz v0, :cond_3a

    .line 1590
    .line 1591
    iget-object v0, v3, Lv8/h;->s:Ljava/lang/String;

    .line 1592
    .line 1593
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1594
    .line 1595
    .line 1596
    move-result v2

    .line 1597
    if-eqz v2, :cond_5e

    .line 1598
    .line 1599
    const-string v0, "\u89c6\u9891\u4e0b\u8f7d\u5931\u8d25"

    .line 1600
    .line 1601
    :cond_5e
    new-instance v10, Lv8/j;

    .line 1602
    .line 1603
    invoke-direct {v10, v0}, Lv8/j;-><init>(Ljava/lang/String;)V

    .line 1604
    .line 1605
    .line 1606
    goto/16 :goto_2c

    .line 1607
    .line 1608
    :cond_5f
    const/16 v3, 0x3e

    .line 1609
    .line 1610
    if-ne v8, v3, :cond_62

    .line 1611
    .line 1612
    if-eqz v0, :cond_60

    .line 1613
    .line 1614
    iget-object v0, v0, Lk8/t;->f:Ljava/lang/String;

    .line 1615
    .line 1616
    goto :goto_45

    .line 1617
    :cond_60
    const/4 v0, 0x0

    .line 1618
    :goto_45
    iget-object v2, v2, Lh/Hchat/hooks/api/model/WeChatMessage;->imagePath:Ljava/lang/String;

    .line 1619
    .line 1620
    filled-new-array {v0, v2}, [Ljava/lang/String;

    .line 1621
    .line 1622
    .line 1623
    move-result-object v0

    .line 1624
    invoke-static {v0}, Lv8/q;->c([Ljava/lang/String;)Ljava/lang/String;

    .line 1625
    .line 1626
    .line 1627
    move-result-object v0

    .line 1628
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1629
    .line 1630
    .line 1631
    move-result v2

    .line 1632
    if-nez v2, :cond_61

    .line 1633
    .line 1634
    move-object v10, v0

    .line 1635
    goto :goto_46

    .line 1636
    :cond_61
    const/4 v10, 0x0

    .line 1637
    :goto_46
    if-eqz v10, :cond_3a

    .line 1638
    .line 1639
    new-instance v0, Lv8/k;

    .line 1640
    .line 1641
    new-instance v7, Lv8/f;

    .line 1642
    .line 1643
    const/4 v12, 0x0

    .line 1644
    const/16 v13, 0x1a

    .line 1645
    .line 1646
    const/4 v9, 0x0

    .line 1647
    const/4 v11, 0x0

    .line 1648
    invoke-direct/range {v7 .. v13}, Lv8/f;-><init>(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V

    .line 1649
    .line 1650
    .line 1651
    invoke-direct {v0, v7}, Lv8/k;-><init>(Lv8/f;)V

    .line 1652
    .line 1653
    .line 1654
    goto/16 :goto_43

    .line 1655
    .line 1656
    :cond_62
    invoke-virtual {v2}, Lh/Hchat/hooks/api/model/WeChatMessage;->isEmoji()Z

    .line 1657
    .line 1658
    .line 1659
    move-result v3

    .line 1660
    if-eqz v3, :cond_6c

    .line 1661
    .line 1662
    if-eqz v0, :cond_63

    .line 1663
    .line 1664
    iget-object v0, v0, Lk8/t;->f:Ljava/lang/String;

    .line 1665
    .line 1666
    goto :goto_47

    .line 1667
    :cond_63
    const/4 v0, 0x0

    .line 1668
    :goto_47
    if-nez v0, :cond_64

    .line 1669
    .line 1670
    goto :goto_48

    .line 1671
    :cond_64
    move-object v11, v0

    .line 1672
    :goto_48
    iget-object v0, v2, Lh/Hchat/hooks/api/model/WeChatMessage;->imagePath:Ljava/lang/String;

    .line 1673
    .line 1674
    filled-new-array {v11, v0}, [Ljava/lang/String;

    .line 1675
    .line 1676
    .line 1677
    move-result-object v0

    .line 1678
    invoke-static {v0}, Lv8/q;->c([Ljava/lang/String;)Ljava/lang/String;

    .line 1679
    .line 1680
    .line 1681
    move-result-object v0

    .line 1682
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1683
    .line 1684
    .line 1685
    move-result v3

    .line 1686
    if-nez v3, :cond_65

    .line 1687
    .line 1688
    goto :goto_49

    .line 1689
    :cond_65
    const/4 v0, 0x0

    .line 1690
    :goto_49
    if-eqz v0, :cond_66

    .line 1691
    .line 1692
    goto :goto_4b

    .line 1693
    :cond_66
    iget-object v0, v2, Lh/Hchat/hooks/api/model/WeChatMessage;->imagePath:Ljava/lang/String;

    .line 1694
    .line 1695
    filled-new-array {v11, v0}, [Ljava/lang/String;

    .line 1696
    .line 1697
    .line 1698
    move-result-object v0

    .line 1699
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 1700
    .line 1701
    .line 1702
    move-result-object v0

    .line 1703
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1704
    .line 1705
    .line 1706
    move-result-object v0

    .line 1707
    :cond_67
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1708
    .line 1709
    .line 1710
    move-result v3

    .line 1711
    if-eqz v3, :cond_68

    .line 1712
    .line 1713
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1714
    .line 1715
    .line 1716
    move-result-object v3

    .line 1717
    move-object v5, v3

    .line 1718
    check-cast v5, Ljava/lang/String;

    .line 1719
    .line 1720
    sget-object v6, Lv8/q;->i:Log/k;

    .line 1721
    .line 1722
    invoke-virtual {v6, v5}, Log/k;->d(Ljava/lang/String;)Z

    .line 1723
    .line 1724
    .line 1725
    move-result v5

    .line 1726
    if-eqz v5, :cond_67

    .line 1727
    .line 1728
    goto :goto_4a

    .line 1729
    :cond_68
    const/4 v3, 0x0

    .line 1730
    :goto_4a
    move-object v0, v3

    .line 1731
    check-cast v0, Ljava/lang/String;

    .line 1732
    .line 1733
    if-eqz v0, :cond_69

    .line 1734
    .line 1735
    goto :goto_4b

    .line 1736
    :cond_69
    invoke-virtual {v2}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 1737
    .line 1738
    .line 1739
    move-result-object v0

    .line 1740
    sget-object v2, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 1741
    .line 1742
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1743
    .line 1744
    .line 1745
    invoke-static {v0, v4}, Ll8/d;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1746
    .line 1747
    .line 1748
    move-result-object v2

    .line 1749
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1750
    .line 1751
    .line 1752
    move-result v3

    .line 1753
    if-eqz v3, :cond_6a

    .line 1754
    .line 1755
    invoke-static {v0, v4}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1756
    .line 1757
    .line 1758
    move-result-object v0

    .line 1759
    goto :goto_4b

    .line 1760
    :cond_6a
    move-object v0, v2

    .line 1761
    :goto_4b
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1762
    .line 1763
    .line 1764
    move-result v2

    .line 1765
    if-nez v2, :cond_6b

    .line 1766
    .line 1767
    move-object v10, v0

    .line 1768
    goto :goto_4c

    .line 1769
    :cond_6b
    const/4 v10, 0x0

    .line 1770
    :goto_4c
    if-eqz v10, :cond_3a

    .line 1771
    .line 1772
    new-instance v0, Lv8/k;

    .line 1773
    .line 1774
    new-instance v7, Lv8/f;

    .line 1775
    .line 1776
    const/4 v12, 0x0

    .line 1777
    const/16 v13, 0x1a

    .line 1778
    .line 1779
    const/4 v9, 0x0

    .line 1780
    const/4 v11, 0x0

    .line 1781
    invoke-direct/range {v7 .. v13}, Lv8/f;-><init>(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V

    .line 1782
    .line 1783
    .line 1784
    invoke-direct {v0, v7}, Lv8/k;-><init>(Lv8/f;)V

    .line 1785
    .line 1786
    .line 1787
    goto/16 :goto_43

    .line 1788
    .line 1789
    :cond_6c
    invoke-virtual {v2}, Lh/Hchat/hooks/api/model/WeChatMessage;->isFile()Z

    .line 1790
    .line 1791
    .line 1792
    move-result v3

    .line 1793
    if-eqz v3, :cond_71

    .line 1794
    .line 1795
    if-eqz v0, :cond_6d

    .line 1796
    .line 1797
    iget-object v0, v0, Lk8/t;->f:Ljava/lang/String;

    .line 1798
    .line 1799
    goto :goto_4d

    .line 1800
    :cond_6d
    const/4 v0, 0x0

    .line 1801
    :goto_4d
    iget-object v3, v2, Lh/Hchat/hooks/api/model/WeChatMessage;->imagePath:Ljava/lang/String;

    .line 1802
    .line 1803
    filled-new-array {v0, v3}, [Ljava/lang/String;

    .line 1804
    .line 1805
    .line 1806
    move-result-object v0

    .line 1807
    invoke-static {v0}, Lv8/q;->c([Ljava/lang/String;)Ljava/lang/String;

    .line 1808
    .line 1809
    .line 1810
    move-result-object v0

    .line 1811
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1812
    .line 1813
    .line 1814
    move-result v3

    .line 1815
    if-nez v3, :cond_6e

    .line 1816
    .line 1817
    move-object v10, v0

    .line 1818
    goto :goto_4e

    .line 1819
    :cond_6e
    const/4 v10, 0x0

    .line 1820
    :goto_4e
    if-eqz v10, :cond_3a

    .line 1821
    .line 1822
    new-instance v0, Lv8/k;

    .line 1823
    .line 1824
    new-instance v7, Lv8/f;

    .line 1825
    .line 1826
    invoke-virtual {v2}, Lh/Hchat/hooks/api/model/WeChatMessage;->getFileMsg()Lh/Hchat/hooks/api/model/WeChatFileMsg;

    .line 1827
    .line 1828
    .line 1829
    move-result-object v2

    .line 1830
    if-eqz v2, :cond_6f

    .line 1831
    .line 1832
    iget-object v5, v2, Lh/Hchat/hooks/api/model/WeChatFileMsg;->title:Ljava/lang/String;

    .line 1833
    .line 1834
    goto :goto_4f

    .line 1835
    :cond_6f
    const/4 v5, 0x0

    .line 1836
    :goto_4f
    if-nez v5, :cond_70

    .line 1837
    .line 1838
    move-object v12, v11

    .line 1839
    goto :goto_50

    .line 1840
    :cond_70
    move-object v12, v5

    .line 1841
    :goto_50
    const/16 v13, 0xa

    .line 1842
    .line 1843
    const/4 v9, 0x0

    .line 1844
    const/4 v11, 0x0

    .line 1845
    invoke-direct/range {v7 .. v13}, Lv8/f;-><init>(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V

    .line 1846
    .line 1847
    .line 1848
    invoke-direct {v0, v7}, Lv8/k;-><init>(Lv8/f;)V

    .line 1849
    .line 1850
    .line 1851
    goto/16 :goto_43

    .line 1852
    .line 1853
    :cond_71
    invoke-virtual {v2}, Lh/Hchat/hooks/api/model/WeChatMessage;->isShareCard()Z

    .line 1854
    .line 1855
    .line 1856
    move-result v3

    .line 1857
    if-nez v3, :cond_76

    .line 1858
    .line 1859
    invoke-virtual {v2}, Lh/Hchat/hooks/api/model/WeChatMessage;->isLocation()Z

    .line 1860
    .line 1861
    .line 1862
    move-result v3

    .line 1863
    if-eqz v3, :cond_72

    .line 1864
    .line 1865
    goto :goto_54

    .line 1866
    :cond_72
    invoke-static {v2}, Lfb/v0;->y(Lh/Hchat/hooks/api/model/WeChatMessage;)Z

    .line 1867
    .line 1868
    .line 1869
    move-result v2

    .line 1870
    if-eqz v2, :cond_7a

    .line 1871
    .line 1872
    if-eqz v0, :cond_73

    .line 1873
    .line 1874
    iget-object v0, v0, Lk8/t;->c:Ljava/lang/String;

    .line 1875
    .line 1876
    goto :goto_51

    .line 1877
    :cond_73
    const/4 v0, 0x0

    .line 1878
    :goto_51
    if-nez v0, :cond_74

    .line 1879
    .line 1880
    goto :goto_52

    .line 1881
    :cond_74
    move-object v11, v0

    .line 1882
    :goto_52
    invoke-static {v11}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1883
    .line 1884
    .line 1885
    move-result v0

    .line 1886
    if-nez v0, :cond_75

    .line 1887
    .line 1888
    move-object v9, v11

    .line 1889
    goto :goto_53

    .line 1890
    :cond_75
    const/4 v9, 0x0

    .line 1891
    :goto_53
    if-eqz v9, :cond_7a

    .line 1892
    .line 1893
    new-instance v14, Lv8/k;

    .line 1894
    .line 1895
    new-instance v7, Lv8/f;

    .line 1896
    .line 1897
    const/4 v12, 0x0

    .line 1898
    const/16 v13, 0x1c

    .line 1899
    .line 1900
    const/4 v10, 0x0

    .line 1901
    const/4 v11, 0x0

    .line 1902
    invoke-direct/range {v7 .. v13}, Lv8/f;-><init>(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V

    .line 1903
    .line 1904
    .line 1905
    invoke-direct {v14, v7}, Lv8/k;-><init>(Lv8/f;)V

    .line 1906
    .line 1907
    .line 1908
    goto :goto_58

    .line 1909
    :cond_76
    :goto_54
    if-eqz v0, :cond_77

    .line 1910
    .line 1911
    iget-object v0, v0, Lk8/t;->c:Ljava/lang/String;

    .line 1912
    .line 1913
    goto :goto_55

    .line 1914
    :cond_77
    const/4 v0, 0x0

    .line 1915
    :goto_55
    if-nez v0, :cond_78

    .line 1916
    .line 1917
    goto :goto_56

    .line 1918
    :cond_78
    move-object v11, v0

    .line 1919
    :goto_56
    invoke-static {v11}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1920
    .line 1921
    .line 1922
    move-result v0

    .line 1923
    if-nez v0, :cond_79

    .line 1924
    .line 1925
    move-object v9, v11

    .line 1926
    goto :goto_57

    .line 1927
    :cond_79
    const/4 v9, 0x0

    .line 1928
    :goto_57
    if-eqz v9, :cond_7a

    .line 1929
    .line 1930
    new-instance v14, Lv8/k;

    .line 1931
    .line 1932
    new-instance v7, Lv8/f;

    .line 1933
    .line 1934
    const/4 v12, 0x0

    .line 1935
    const/16 v13, 0x1c

    .line 1936
    .line 1937
    const/4 v10, 0x0

    .line 1938
    const/4 v11, 0x0

    .line 1939
    invoke-direct/range {v7 .. v13}, Lv8/f;-><init>(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V

    .line 1940
    .line 1941
    .line 1942
    invoke-direct {v14, v7}, Lv8/k;-><init>(Lv8/f;)V

    .line 1943
    .line 1944
    .line 1945
    :cond_7a
    :goto_58
    return-object v14

    .line 1946
    nop

    .line 1947
    :array_0
    .array-data 2
        0xas
        0xds
    .end array-data
.end method

.method public final k(Lv8/h;)V
    .locals 12

    .line 1
    const-string v0, " msgSvrId="

    .line 2
    .line 3
    iget-object v1, p0, Lv8/q;->a:Li2/y;

    .line 4
    .line 5
    const-string v2, "\u6d88\u606f\u7c7b\u578b\u6682\u4e0d\u652f\u6301\u9759\u9ed8\u8f6c\u53d1: talker="

    .line 6
    .line 7
    const-string v3, "\u6d88\u606f\u5a92\u4f53\u51c6\u5907\u5931\u8d25: talker="

    .line 8
    .line 9
    const-string v4, "\u7b49\u5f85\u6d88\u606f\u5a92\u4f53\u6587\u4ef6\u8d85\u65f6: talker="

    .line 10
    .line 11
    sget-object v5, Lv8/r;->a:Lv8/r;

    .line 12
    .line 13
    iget-object v5, p0, Lv8/q;->b:Landroid/content/Context;

    .line 14
    .line 15
    invoke-static {v5}, Lv8/r;->a(Landroid/content/Context;)Z

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    if-nez v5, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lv8/q;->d(Lv8/h;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    :try_start_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->messageStore()Lk8/s;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    const/4 v6, 0x0

    .line 30
    if-eqz v5, :cond_3

    .line 31
    .line 32
    iget-wide v7, p1, Lv8/h;->c:J

    .line 33
    .line 34
    const-wide/16 v9, 0x0

    .line 35
    .line 36
    cmp-long v11, v7, v9

    .line 37
    .line 38
    if-lez v11, :cond_2

    .line 39
    .line 40
    iget-object v9, p1, Lv8/h;->b:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v5, v7, v8, v9}, Lk8/s;->e(JLjava/lang/String;)Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    if-eqz v7, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    iget-wide v7, p1, Lv8/h;->c:J

    .line 50
    .line 51
    invoke-virtual {v5, v7, v8}, Lk8/s;->d(J)Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    iget-object v7, p1, Lv8/h;->d:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 57
    .line 58
    iget-wide v7, v7, Lh/Hchat/hooks/api/model/WeChatMessage;->msgId:J

    .line 59
    .line 60
    cmp-long v9, v7, v9

    .line 61
    .line 62
    if-lez v9, :cond_3

    .line 63
    .line 64
    invoke-virtual {v5, v7, v8}, Lk8/s;->c(J)Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    goto :goto_0

    .line 69
    :cond_3
    move-object v7, v6

    .line 70
    :goto_0
    if-eqz v7, :cond_4

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_4
    iget-object v7, p1, Lv8/h;->d:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 74
    .line 75
    :goto_1
    invoke-virtual {p0, v7, p1}, Lv8/q;->j(Lh/Hchat/hooks/api/model/WeChatMessage;Lv8/h;)Lv8/n;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    instance-of v8, v5, Lv8/k;

    .line 80
    .line 81
    const/4 v9, 0x0

    .line 82
    if-eqz v8, :cond_5

    .line 83
    .line 84
    check-cast v5, Lv8/k;

    .line 85
    .line 86
    iget-object v2, v5, Lv8/k;->a:Lv8/f;

    .line 87
    .line 88
    invoke-virtual {p0, p1, v2, v9}, Lv8/q;->q(Lv8/h;Lv8/f;I)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :catchall_0
    move-exception v2

    .line 93
    goto/16 :goto_2

    .line 94
    .line 95
    :cond_5
    sget-object v8, Lv8/m;->a:Lv8/m;

    .line 96
    .line 97
    invoke-virtual {v5, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v8

    .line 101
    if-eqz v8, :cond_7

    .line 102
    .line 103
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 104
    .line 105
    .line 106
    move-result-wide v2

    .line 107
    iget-wide v7, p1, Lv8/h;->l:J

    .line 108
    .line 109
    cmp-long v2, v2, v7

    .line 110
    .line 111
    if-gez v2, :cond_6

    .line 112
    .line 113
    new-instance v2, Lv8/b;

    .line 114
    .line 115
    invoke-direct {v2, p0, p1, v9}, Lv8/b;-><init>(Lv8/q;Lv8/h;I)V

    .line 116
    .line 117
    .line 118
    const-wide/16 v3, 0x1f4

    .line 119
    .line 120
    invoke-virtual {p0, v3, v4, v2}, Lv8/q;->o(JLfg/a;)Z

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-nez v2, :cond_8

    .line 125
    .line 126
    invoke-virtual {p0, p1}, Lv8/q;->d(Lv8/h;)V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :cond_6
    invoke-virtual {p0, p1}, Lv8/q;->d(Lv8/h;)V

    .line 131
    .line 132
    .line 133
    iget-object v2, p1, Lv8/h;->b:Ljava/lang/String;

    .line 134
    .line 135
    iget-wide v7, p1, Lv8/h;->c:J

    .line 136
    .line 137
    new-instance v3, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v3, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    invoke-virtual {v1, v2, v6}, Li2/y;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    return-void

    .line 159
    :cond_7
    sget-object v4, Lv8/i;->a:Lv8/i;

    .line 160
    .line 161
    invoke-virtual {v5, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    if-eqz v4, :cond_9

    .line 166
    .line 167
    :cond_8
    return-void

    .line 168
    :cond_9
    instance-of v4, v5, Lv8/j;

    .line 169
    .line 170
    if-eqz v4, :cond_a

    .line 171
    .line 172
    invoke-virtual {p0, p1}, Lv8/q;->d(Lv8/h;)V

    .line 173
    .line 174
    .line 175
    iget-object v2, p1, Lv8/h;->b:Ljava/lang/String;

    .line 176
    .line 177
    iget-wide v7, p1, Lv8/h;->c:J

    .line 178
    .line 179
    check-cast v5, Lv8/j;

    .line 180
    .line 181
    iget-object v4, v5, Lv8/j;->a:Ljava/lang/String;

    .line 182
    .line 183
    new-instance v5, Ljava/lang/StringBuilder;

    .line 184
    .line 185
    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v5, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    const-string v2, " reason="

    .line 198
    .line 199
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    invoke-virtual {v1, v2, v6}, Li2/y;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    return-void

    .line 213
    :cond_a
    sget-object v3, Lv8/l;->a:Lv8/l;

    .line 214
    .line 215
    invoke-virtual {v5, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v3

    .line 219
    if-eqz v3, :cond_b

    .line 220
    .line 221
    invoke-virtual {p0, p1}, Lv8/q;->d(Lv8/h;)V

    .line 222
    .line 223
    .line 224
    iget-object v3, p1, Lv8/h;->b:Ljava/lang/String;

    .line 225
    .line 226
    iget v4, v7, Lh/Hchat/hooks/api/model/WeChatMessage;->type:I

    .line 227
    .line 228
    new-instance v5, Ljava/lang/StringBuilder;

    .line 229
    .line 230
    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    const-string v2, " type="

    .line 237
    .line 238
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    invoke-virtual {v1, v2, v6}, Li2/y;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    return-void

    .line 252
    :cond_b
    new-instance v2, Laf/d;

    .line 253
    .line 254
    invoke-direct {v2}, Ljava/lang/RuntimeException;-><init>()V

    .line 255
    .line 256
    .line 257
    throw v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 258
    :goto_2
    invoke-virtual {p0, p1}, Lv8/q;->d(Lv8/h;)V

    .line 259
    .line 260
    .line 261
    iget-object v3, p1, Lv8/h;->b:Ljava/lang/String;

    .line 262
    .line 263
    iget-wide v4, p1, Lv8/h;->c:J

    .line 264
    .line 265
    new-instance p1, Ljava/lang/StringBuilder;

    .line 266
    .line 267
    const-string v6, "\u51c6\u5907\u8f6c\u53d1\u6d88\u606f\u5f02\u5e38: talker="

    .line 268
    .line 269
    invoke-direct {p1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {p1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object p1

    .line 285
    invoke-virtual {v1, p1, v2}, Li2/y;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    return-void
.end method

.method public final m(Lv8/g;)V
    .locals 5

    .line 1
    iget-object v0, p1, Lv8/g;->a:Ljava/lang/String;

    .line 2
    .line 3
    iget v1, p1, Lv8/g;->b:I

    .line 4
    .line 5
    invoke-static {v1, v0}, Lv8/q;->l(ILjava/lang/String;)Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Ldg/n;

    .line 10
    .line 11
    const/4 v2, 0x6

    .line 12
    invoke-direct {v1, v0, v2}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Lnb/a;

    .line 16
    .line 17
    const/16 v2, 0x11

    .line 18
    .line 19
    invoke-direct {v0, p1, v2, p0}, Lnb/a;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    new-instance v2, Lng/i;

    .line 23
    .line 24
    const/4 v3, 0x1

    .line 25
    invoke-direct {v2, v1, v3, v0}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 26
    .line 27
    .line 28
    new-instance v0, Lng/h;

    .line 29
    .line 30
    invoke-direct {v0, v2}, Lng/h;-><init>(Lng/i;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    :goto_0
    invoke-virtual {v0}, Lng/h;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    invoke-virtual {v0}, Lng/h;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 44
    .line 45
    iget-object v2, p1, Lv8/g;->f:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 46
    .line 47
    iget-wide v3, v1, Lh/Hchat/hooks/api/model/WeChatMessage;->msgId:J

    .line 48
    .line 49
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-interface {v2, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    iget-wide v1, v1, Lh/Hchat/hooks/api/model/WeChatMessage;->msgSvrId:J

    .line 57
    .line 58
    const-wide/16 v3, 0x0

    .line 59
    .line 60
    cmp-long v3, v1, v3

    .line 61
    .line 62
    if-lez v3, :cond_0

    .line 63
    .line 64
    iget-object v3, p1, Lv8/g;->g:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 65
    .line 66
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-interface {v3, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    return-void
.end method

.method public final o(JLfg/a;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lv8/q;->c:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_0
    :try_start_0
    new-instance v1, Lb0/c;

    .line 12
    .line 13
    const/4 v2, 0x3

    .line 14
    invoke-direct {v1, p3, v2}, Lb0/c;-><init>(Lfg/a;I)V

    .line 15
    .line 16
    .line 17
    const-wide/16 v2, 0x0

    .line 18
    .line 19
    cmp-long p3, p1, v2

    .line 20
    .line 21
    if-gez p3, :cond_1

    .line 22
    .line 23
    move-wide p1, v2

    .line 24
    :cond_1
    sget-object p3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 25
    .line 26
    invoke-virtual {v0, v1, p1, p2, p3}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 27
    .line 28
    .line 29
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    new-instance p2, Lsf/f;

    .line 34
    .line 35
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    move-object p1, p2

    .line 39
    :goto_0
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 40
    .line 41
    instance-of p3, p1, Lsf/f;

    .line 42
    .line 43
    if-eqz p3, :cond_2

    .line 44
    .line 45
    move-object p1, p2

    .line 46
    :cond_2
    check-cast p1, Ljava/lang/Boolean;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    return p1
.end method

.method public final q(Lv8/h;Lv8/f;I)V
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p0, p1, p2, p3}, Lv8/q;->r(Lv8/h;Lv8/f;I)V

    .line 2
    .line 3
    .line 4
    sget-object p2, Lsf/n;->a:Lsf/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :catchall_0
    move-exception p2

    .line 8
    new-instance p3, Lsf/f;

    .line 9
    .line 10
    invoke-direct {p3, p2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    move-object p2, p3

    .line 14
    :goto_0
    invoke-static {p2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    if-eqz p2, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lv8/q;->d(Lv8/h;)V

    .line 21
    .line 22
    .line 23
    iget-object p3, p1, Lv8/h;->b:Ljava/lang/String;

    .line 24
    .line 25
    iget-wide v0, p1, Lv8/h;->c:J

    .line 26
    .line 27
    new-instance p1, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const-string v2, "\u6267\u884c\u8f6c\u53d1\u4efb\u52a1\u5f02\u5e38: talker="

    .line 30
    .line 31
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string p3, " msgSvrId="

    .line 38
    .line 39
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iget-object p3, p0, Lv8/q;->a:Li2/y;

    .line 50
    .line 51
    invoke-virtual {p3, p1, p2}, Li2/y;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    :cond_0
    return-void
.end method

.method public final r(Lv8/h;Lv8/f;I)V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    iget v4, v3, Lv8/f;->a:I

    .line 8
    .line 9
    sget-object v0, Lv8/r;->a:Lv8/r;

    .line 10
    .line 11
    iget-object v0, v1, Lv8/q;->b:Landroid/content/Context;

    .line 12
    .line 13
    invoke-static {v0}, Lv8/r;->a(Landroid/content/Context;)Z

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    if-nez v5, :cond_0

    .line 18
    .line 19
    invoke-virtual/range {p0 .. p1}, Lv8/q;->d(Lv8/h;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    move v5, v4

    .line 24
    new-instance v4, Lgg/s;

    .line 25
    .line 26
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    move/from16 v6, p3

    .line 30
    .line 31
    iput v6, v4, Lgg/s;->g:I

    .line 32
    .line 33
    const/4 v6, 0x0

    .line 34
    move-object v7, v6

    .line 35
    :goto_0
    iget v8, v4, Lgg/s;->g:I

    .line 36
    .line 37
    iget-object v9, v2, Lv8/h;->e:Ljava/util/List;

    .line 38
    .line 39
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 40
    .line 41
    .line 42
    move-result v10

    .line 43
    const/4 v11, 0x1

    .line 44
    if-ge v8, v10, :cond_8

    .line 45
    .line 46
    iget v7, v4, Lgg/s;->g:I

    .line 47
    .line 48
    invoke-interface {v9, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    check-cast v7, Ljava/lang/String;

    .line 53
    .line 54
    iget-object v8, v2, Lv8/h;->f:Ljava/util/LinkedHashMap;

    .line 55
    .line 56
    invoke-virtual {v8, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    check-cast v8, Ljava/util/Map;

    .line 61
    .line 62
    if-nez v8, :cond_1

    .line 63
    .line 64
    sget-object v8, Ltf/u;->g:Ltf/u;

    .line 65
    .line 66
    :cond_1
    invoke-interface {v8}, Ljava/util/Map;->isEmpty()Z

    .line 67
    .line 68
    .line 69
    move-result v10

    .line 70
    if-nez v10, :cond_6

    .line 71
    .line 72
    sget-object v10, Lv8/r;->a:Lv8/r;

    .line 73
    .line 74
    invoke-static {v0}, Lv8/r;->a(Landroid/content/Context;)Z

    .line 75
    .line 76
    .line 77
    move-result v10

    .line 78
    if-nez v10, :cond_2

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_2
    invoke-static {v0}, Lv8/r;->b(Landroid/content/Context;)Ljava/util/List;

    .line 82
    .line 83
    .line 84
    move-result-object v10

    .line 85
    invoke-static {v10}, Ltf/m;->m1(Ljava/lang/Iterable;)Ldg/n;

    .line 86
    .line 87
    .line 88
    move-result-object v10

    .line 89
    new-instance v12, Lb0/s;

    .line 90
    .line 91
    invoke-direct {v12, v8, v7, v1, v2}, Lb0/s;-><init>(Ljava/util/Map;Ljava/lang/String;Lv8/q;Lv8/h;)V

    .line 92
    .line 93
    .line 94
    new-instance v7, Lng/i;

    .line 95
    .line 96
    invoke-direct {v7, v10, v11, v12}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 97
    .line 98
    .line 99
    new-instance v10, Lnb/a;

    .line 100
    .line 101
    const/16 v12, 0x12

    .line 102
    .line 103
    invoke-direct {v10, v8, v12}, Lnb/a;-><init>(Ljava/lang/Object;I)V

    .line 104
    .line 105
    .line 106
    invoke-static {v7, v10}, Lng/m;->X(Lng/j;Lfg/l;)Lng/i;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    new-instance v8, Lng/h;

    .line 111
    .line 112
    invoke-direct {v8, v7}, Lng/h;-><init>(Lng/i;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v8}, Lng/h;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v7

    .line 119
    if-nez v7, :cond_3

    .line 120
    .line 121
    move-object v7, v6

    .line 122
    goto :goto_2

    .line 123
    :cond_3
    invoke-virtual {v8}, Lng/h;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    check-cast v7, Ljava/lang/Comparable;

    .line 128
    .line 129
    :cond_4
    :goto_1
    invoke-virtual {v8}, Lng/h;->hasNext()Z

    .line 130
    .line 131
    .line 132
    move-result v10

    .line 133
    if-eqz v10, :cond_5

    .line 134
    .line 135
    invoke-virtual {v8}, Lng/h;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v10

    .line 139
    check-cast v10, Ljava/lang/Comparable;

    .line 140
    .line 141
    invoke-interface {v7, v10}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 142
    .line 143
    .line 144
    move-result v12

    .line 145
    if-lez v12, :cond_4

    .line 146
    .line 147
    move-object v7, v10

    .line 148
    goto :goto_1

    .line 149
    :cond_5
    :goto_2
    check-cast v7, Ljava/lang/Long;

    .line 150
    .line 151
    goto :goto_4

    .line 152
    :cond_6
    :goto_3
    move-object v7, v6

    .line 153
    :goto_4
    if-eqz v7, :cond_7

    .line 154
    .line 155
    goto :goto_5

    .line 156
    :cond_7
    iget v8, v4, Lgg/s;->g:I

    .line 157
    .line 158
    add-int/2addr v8, v11

    .line 159
    iput v8, v4, Lgg/s;->g:I

    .line 160
    .line 161
    goto :goto_0

    .line 162
    :cond_8
    :goto_5
    iget v0, v4, Lgg/s;->g:I

    .line 163
    .line 164
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 165
    .line 166
    .line 167
    move-result v8

    .line 168
    if-lt v0, v8, :cond_9

    .line 169
    .line 170
    invoke-virtual/range {p0 .. p1}, Lv8/q;->d(Lv8/h;)V

    .line 171
    .line 172
    .line 173
    return-void

    .line 174
    :cond_9
    iget v0, v4, Lgg/s;->g:I

    .line 175
    .line 176
    invoke-interface {v9, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    move-object v8, v0

    .line 181
    check-cast v8, Ljava/lang/String;

    .line 182
    .line 183
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 184
    .line 185
    .line 186
    move-result-wide v12

    .line 187
    iget-wide v14, v1, Lv8/q;->h:J

    .line 188
    .line 189
    if-eqz v7, :cond_a

    .line 190
    .line 191
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 192
    .line 193
    .line 194
    move-result-wide v16

    .line 195
    move/from16 p3, v11

    .line 196
    .line 197
    move-wide/from16 v18, v16

    .line 198
    .line 199
    move-wide/from16 v16, v12

    .line 200
    .line 201
    move-wide/from16 v11, v18

    .line 202
    .line 203
    goto :goto_6

    .line 204
    :cond_a
    move/from16 p3, v11

    .line 205
    .line 206
    move-wide/from16 v16, v12

    .line 207
    .line 208
    move-wide/from16 v11, v16

    .line 209
    .line 210
    :goto_6
    invoke-static {v14, v15, v11, v12}, Ljava/lang/Math;->max(JJ)J

    .line 211
    .line 212
    .line 213
    move-result-wide v10

    .line 214
    sub-long v10, v10, v16

    .line 215
    .line 216
    const-wide/16 v12, 0x0

    .line 217
    .line 218
    cmp-long v0, v10, v12

    .line 219
    .line 220
    if-gez v0, :cond_b

    .line 221
    .line 222
    move-wide v10, v12

    .line 223
    :cond_b
    cmp-long v0, v10, v12

    .line 224
    .line 225
    if-lez v0, :cond_c

    .line 226
    .line 227
    new-instance v0, Lv8/d;

    .line 228
    .line 229
    const/4 v5, 0x0

    .line 230
    invoke-direct/range {v0 .. v5}, Lv8/d;-><init>(Lv8/q;Lv8/h;Lv8/f;Lgg/s;I)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v1, v10, v11, v0}, Lv8/q;->o(JLfg/a;)Z

    .line 234
    .line 235
    .line 236
    move-result v0

    .line 237
    if-nez v0, :cond_10

    .line 238
    .line 239
    invoke-virtual/range {p0 .. p1}, Lv8/q;->d(Lv8/h;)V

    .line 240
    .line 241
    .line 242
    return-void

    .line 243
    :cond_c
    :try_start_0
    invoke-virtual {v1, v3, v8}, Lv8/q;->s(Lv8/f;Ljava/lang/String;)Z

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 248
    .line 249
    .line 250
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 251
    goto :goto_7

    .line 252
    :catchall_0
    move-exception v0

    .line 253
    new-instance v2, Lsf/f;

    .line 254
    .line 255
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 256
    .line 257
    .line 258
    move-object v0, v2

    .line 259
    :goto_7
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    const-string v7, " type="

    .line 264
    .line 265
    iget-object v10, v1, Lv8/q;->a:Li2/y;

    .line 266
    .line 267
    if-eqz v2, :cond_d

    .line 268
    .line 269
    new-instance v11, Ljava/lang/StringBuilder;

    .line 270
    .line 271
    const-string v12, "\u8f6c\u53d1\u6d88\u606f\u5f02\u5e38: target="

    .line 272
    .line 273
    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v11

    .line 289
    invoke-virtual {v10, v11, v2}, Li2/y;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    :cond_d
    instance-of v2, v0, Lsf/f;

    .line 293
    .line 294
    if-nez v2, :cond_e

    .line 295
    .line 296
    check-cast v0, Ljava/lang/Boolean;

    .line 297
    .line 298
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 299
    .line 300
    .line 301
    move-result v0

    .line 302
    if-nez v0, :cond_e

    .line 303
    .line 304
    new-instance v0, Ljava/lang/StringBuilder;

    .line 305
    .line 306
    const-string v2, "\u8f6c\u53d1\u6d88\u606f\u5931\u8d25: target="

    .line 307
    .line 308
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    invoke-virtual {v10, v0, v6}, Li2/y;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    :cond_e
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 328
    .line 329
    .line 330
    move-result-wide v5

    .line 331
    const-wide/16 v7, 0x1f4

    .line 332
    .line 333
    add-long/2addr v5, v7

    .line 334
    iput-wide v5, v1, Lv8/q;->h:J

    .line 335
    .line 336
    iget v0, v4, Lgg/s;->g:I

    .line 337
    .line 338
    add-int/lit8 v0, v0, 0x1

    .line 339
    .line 340
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 341
    .line 342
    .line 343
    move-result v2

    .line 344
    if-ge v0, v2, :cond_f

    .line 345
    .line 346
    new-instance v0, Lv8/d;

    .line 347
    .line 348
    const/4 v5, 0x1

    .line 349
    move-object/from16 v2, p1

    .line 350
    .line 351
    invoke-direct/range {v0 .. v5}, Lv8/d;-><init>(Lv8/q;Lv8/h;Lv8/f;Lgg/s;I)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v1, v7, v8, v0}, Lv8/q;->o(JLfg/a;)Z

    .line 355
    .line 356
    .line 357
    move-result v0

    .line 358
    if-nez v0, :cond_10

    .line 359
    .line 360
    invoke-virtual/range {p0 .. p1}, Lv8/q;->d(Lv8/h;)V

    .line 361
    .line 362
    .line 363
    goto :goto_8

    .line 364
    :cond_f
    invoke-virtual/range {p0 .. p1}, Lv8/q;->d(Lv8/h;)V

    .line 365
    .line 366
    .line 367
    :cond_10
    :goto_8
    return-void
.end method

.method public final s(Lv8/f;Ljava/lang/String;)Z
    .locals 10

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x2710

    .line 6
    .line 7
    sub-long/2addr v0, v2

    .line 8
    new-instance v2, Lca/c;

    .line 9
    .line 10
    const/16 v3, 0xe

    .line 11
    .line 12
    invoke-direct {v2, v0, v1, v3}, Lca/c;-><init>(JI)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Lbe/i;

    .line 16
    .line 17
    const/16 v1, 0x1c

    .line 18
    .line 19
    invoke-direct {v0, v2, v1}, Lbe/i;-><init>(Ljava/lang/Object;I)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lv8/q;->g:Ljava/util/concurrent/ConcurrentLinkedDeque;

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentLinkedDeque;->removeIf(Ljava/util/function/Predicate;)Z

    .line 25
    .line 26
    .line 27
    :goto_0
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedDeque;->size()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const/16 v2, 0x80

    .line 32
    .line 33
    if-lt v0, v2, :cond_0

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedDeque;->pollFirst()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iget v0, p1, Lv8/f;->a:I

    .line 40
    .line 41
    const/16 v2, 0x3e

    .line 42
    .line 43
    if-ne v0, v2, :cond_2

    .line 44
    .line 45
    const/16 v0, 0x2b

    .line 46
    .line 47
    :cond_1
    :goto_1
    move v4, v0

    .line 48
    goto :goto_2

    .line 49
    :cond_2
    if-gtz v0, :cond_3

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_3
    and-int/lit16 v2, v0, 0xff

    .line 53
    .line 54
    const v3, 0xffff

    .line 55
    .line 56
    .line 57
    and-int/2addr v3, v0

    .line 58
    ushr-int/lit8 v4, v0, 0x10

    .line 59
    .line 60
    if-nez v4, :cond_4

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_4
    const/16 v4, 0x2710

    .line 64
    .line 65
    if-eq v3, v4, :cond_5

    .line 66
    .line 67
    const/16 v4, 0x2712

    .line 68
    .line 69
    if-eq v3, v4, :cond_5

    .line 70
    .line 71
    if-eqz v2, :cond_1

    .line 72
    .line 73
    if-ne v3, v2, :cond_1

    .line 74
    .line 75
    move v0, v2

    .line 76
    goto :goto_1

    .line 77
    :cond_5
    move v0, v3

    .line 78
    goto :goto_1

    .line 79
    :goto_2
    iget-object v5, p1, Lv8/f;->b:Ljava/lang/String;

    .line 80
    .line 81
    invoke-static {v4, p2}, Lv8/q;->l(ILjava/lang/String;)Ljava/util/ArrayList;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    new-instance v6, Ljava/util/LinkedHashSet;

    .line 86
    .line 87
    invoke-direct {v6}, Ljava/util/LinkedHashSet;-><init>()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    :cond_6
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-eqz v2, :cond_8

    .line 99
    .line 100
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    check-cast v2, Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 105
    .line 106
    iget-wide v2, v2, Lh/Hchat/hooks/api/model/WeChatMessage;->msgId:J

    .line 107
    .line 108
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    const-wide/16 v8, 0x0

    .line 113
    .line 114
    cmp-long v2, v2, v8

    .line 115
    .line 116
    if-lez v2, :cond_7

    .line 117
    .line 118
    goto :goto_4

    .line 119
    :cond_7
    const/4 v7, 0x0

    .line 120
    :goto_4
    if-eqz v7, :cond_6

    .line 121
    .line 122
    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 127
    .line 128
    .line 129
    move-result-wide v7

    .line 130
    new-instance v2, Lv8/g;

    .line 131
    .line 132
    move-object v3, p2

    .line 133
    invoke-direct/range {v2 .. v8}, Lv8/g;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/util/LinkedHashSet;J)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentLinkedDeque;->addLast(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    :try_start_0
    invoke-static {p1, v3}, Lv8/q;->p(Lv8/f;Ljava/lang/String;)Z

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    if-eqz p1, :cond_9

    .line 144
    .line 145
    invoke-virtual {p0, v2}, Lv8/q;->m(Lv8/g;)V

    .line 146
    .line 147
    .line 148
    return p1

    .line 149
    :catchall_0
    move-exception v0

    .line 150
    move-object p1, v0

    .line 151
    goto :goto_5

    .line 152
    :cond_9
    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentLinkedDeque;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 153
    .line 154
    .line 155
    return p1

    .line 156
    :goto_5
    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentLinkedDeque;->remove(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    throw p1
.end method
