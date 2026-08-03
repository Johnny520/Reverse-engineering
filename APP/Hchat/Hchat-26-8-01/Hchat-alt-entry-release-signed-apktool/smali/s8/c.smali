.class public final Ls8/c;
.super Lr8/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final n:Ljava/util/Set;


# instance fields
.field public final e:Ljava/util/Set;

.field public final f:Ljava/util/concurrent/ConcurrentHashMap;

.field public final g:Ljava/util/Set;

.field public final h:Ljava/util/concurrent/ConcurrentHashMap;

.field public i:Landroid/content/SharedPreferences;

.field public volatile j:Z

.field public volatile k:Z

.field public volatile l:Z

.field public volatile m:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "rowid"

    .line 2
    .line 3
    invoke-static {v0}, Lac/p;->N(Ljava/lang/Object;)Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Ls8/c;->n:Ljava/util/Set;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lr8/a;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lj8/b;->o()Ljava/util/Set;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Ls8/c;->e:Ljava/util/Set;

    .line 9
    .line 10
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Ls8/c;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 16
    .line 17
    invoke-static {}, Lj8/b;->o()Ljava/util/Set;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Ls8/c;->g:Ljava/util/Set;

    .line 22
    .line 23
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Ls8/c;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 29
    .line 30
    return-void
.end method

.method public static A(Ljava/lang/Class;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [Ljava/lang/Class;

    .line 3
    .line 4
    const-string v2, "getMsgId"

    .line 5
    .line 6
    invoke-static {p0, v2, v1}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    const-string v1, "getType"

    .line 13
    .line 14
    new-array v2, v0, [Ljava/lang/Class;

    .line 15
    .line 16
    invoke-static {p0, v1, v2}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const-string v2, "setType"

    .line 32
    .line 33
    invoke-static {p0, v2, v1}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    if-eqz p0, :cond_0

    .line 38
    .line 39
    const/4 p0, 0x1

    .line 40
    return p0

    .line 41
    :cond_0
    return v0
.end method

.method public static B(I)Z
    .locals 1

    .line 1
    const v0, 0x10002710

    .line 2
    .line 3
    .line 4
    if-eq p0, v0, :cond_1

    .line 5
    .line 6
    const v0, 0x10002712

    .line 7
    .line 8
    .line 9
    if-eq p0, v0, :cond_1

    .line 10
    .line 11
    const v0, 0x11002712

    .line 12
    .line 13
    .line 14
    if-ne p0, v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0

    .line 19
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 20
    return p0
.end method

.method public static C(Lr8/g;)Z
    .locals 2

    .line 1
    iget-object p0, p0, Lr8/g;->a:Landroid/content/Context;

    .line 2
    .line 3
    const-string v0, "Hchat_anti_recall_config"

    .line 4
    .line 5
    invoke-static {p0, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v0, "anti_recall_keep_self"

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public static G(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    const-string v0, "isSend"

    .line 2
    .line 3
    const-string v1, "field_isSend"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    move v2, v1

    .line 11
    :goto_0
    const/4 v3, 0x2

    .line 12
    if-lt v2, v3, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    aget-object v3, v0, v2

    .line 16
    .line 17
    invoke-static {p0, v3}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    instance-of v4, v3, Ljava/lang/Number;

    .line 22
    .line 23
    if-eqz v4, :cond_1

    .line 24
    .line 25
    check-cast v3, Ljava/lang/Number;

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    const/4 v3, 0x0

    .line 29
    :goto_1
    if-eqz v3, :cond_2

    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    const/4 v4, 0x1

    .line 36
    if-ne v3, v4, :cond_2

    .line 37
    .line 38
    return v4

    .line 39
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    goto :goto_0
.end method

.method public static H(Ljava/lang/Object;)J
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    const-string v2, "getMsgId"

    .line 7
    .line 8
    new-array v3, v0, [Ljava/lang/Class;

    .line 9
    .line 10
    invoke-static {v1, v2, v3}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-array v2, v0, [Ljava/lang/Object;

    .line 15
    .line 16
    invoke-static {v1, p0, v2}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    instance-of v2, v1, Ljava/lang/Number;

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    check-cast v1, Ljava/lang/Number;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 27
    .line 28
    .line 29
    move-result-wide v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    return-wide v0

    .line 31
    :catchall_0
    :cond_0
    const-string v1, "msgId"

    .line 32
    .line 33
    const-string v2, "field_msgId"

    .line 34
    .line 35
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    :goto_0
    const/4 v2, 0x2

    .line 40
    if-lt v0, v2, :cond_1

    .line 41
    .line 42
    const-wide/16 v0, 0x0

    .line 43
    .line 44
    return-wide v0

    .line 45
    :cond_1
    aget-object v2, v1, v0

    .line 46
    .line 47
    invoke-static {p0, v2}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    instance-of v3, v2, Ljava/lang/Number;

    .line 52
    .line 53
    if-eqz v3, :cond_2

    .line 54
    .line 55
    check-cast v2, Ljava/lang/Number;

    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 58
    .line 59
    .line 60
    move-result-wide v0

    .line 61
    return-wide v0

    .line 62
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 63
    .line 64
    goto :goto_0
.end method

.method public static I(Ljava/lang/Object;)I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    const-string v3, "getType"

    .line 8
    .line 9
    new-array v4, v1, [Ljava/lang/Class;

    .line 10
    .line 11
    invoke-static {v2, v3, v4}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    new-array v3, v1, [Ljava/lang/Object;

    .line 16
    .line 17
    invoke-static {v2, p0, v3}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    instance-of v2, p0, Ljava/lang/Number;

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    check-cast p0, Ljava/lang/Number;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move-object p0, v0

    .line 31
    goto :goto_1

    .line 32
    :goto_0
    new-instance v2, Lsf/f;

    .line 33
    .line 34
    invoke-direct {v2, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    move-object p0, v2

    .line 38
    :goto_1
    nop

    .line 39
    instance-of v2, p0, Lsf/f;

    .line 40
    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_1
    move-object v0, p0

    .line 45
    :goto_2
    check-cast v0, Ljava/lang/Number;

    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    :cond_2
    return v1
.end method

.method public static J(Lr8/g;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lr8/g;->a:Landroid/content/Context;

    .line 2
    .line 3
    iget-object p0, p0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {v0, p0}, Lo8/k;->a(Landroid/content/Context;Ljava/lang/ClassLoader;)Ll8/i;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    iget-object p0, p0, Ll8/i;->h:Ljava/lang/String;

    .line 13
    .line 14
    return-object p0
.end method

.method public static K(J)J
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p0, v0

    .line 4
    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    const-wide v0, 0x2540be400L

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    cmp-long v0, p0, v0

    .line 13
    .line 14
    if-gez v0, :cond_0

    .line 15
    .line 16
    const-wide/16 v0, 0x3e8

    .line 17
    .line 18
    mul-long/2addr p0, v0

    .line 19
    :cond_0
    return-wide p0
.end method

.method public static L(JLjava/lang/String;)Ljava/util/Map;
    .locals 6

    .line 1
    const-string v0, "`"

    .line 2
    .line 3
    const-string v1, "SELECT * FROM "

    .line 4
    .line 5
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    goto :goto_2

    .line 13
    :cond_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->database()Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    if-eqz v2, :cond_2

    .line 18
    .line 19
    :try_start_0
    const-string v4, "``"

    .line 20
    .line 21
    const/4 v5, 0x0

    .line 22
    invoke-static {p2, v0, v4, v5}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    new-instance v4, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string p2, " WHERE msgId=? LIMIT 1"

    .line 50
    .line 51
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-static {p0, p1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    filled-new-array {p0}, [Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-virtual {v2, p2, p0}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->query(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-static {p0}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    check-cast p0, Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :catchall_0
    move-exception p0

    .line 81
    new-instance p1, Lsf/f;

    .line 82
    .line 83
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    move-object p0, p1

    .line 87
    :goto_0
    nop

    .line 88
    instance-of p1, p0, Lsf/f;

    .line 89
    .line 90
    if-eqz p1, :cond_1

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_1
    move-object v3, p0

    .line 94
    :goto_1
    check-cast v3, Ljava/util/Map;

    .line 95
    .line 96
    :cond_2
    :goto_2
    return-object v3
.end method

.method public static M(JLl8/f;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-wide v2, p2, Ll8/f;->a:J

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move-wide v2, v0

    .line 9
    :goto_0
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-eqz p2, :cond_1

    .line 18
    .line 19
    iget-wide p1, p2, Ll8/f;->b:J

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move-wide p1, v0

    .line 23
    :goto_1
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    filled-new-array {v2, p0, p1}, [Ljava/lang/Long;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p0}, Ltf/d0;->R([Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    new-instance p1, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    :cond_2
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    if-eqz p2, :cond_4

    .line 49
    .line 50
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    move-object v2, p2

    .line 55
    check-cast v2, Ljava/lang/Number;

    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 58
    .line 59
    .line 60
    move-result-wide v2

    .line 61
    cmp-long v2, v2, v0

    .line 62
    .line 63
    if-lez v2, :cond_3

    .line 64
    .line 65
    const/4 v2, 0x1

    .line 66
    goto :goto_3

    .line 67
    :cond_3
    const/4 v2, 0x0

    .line 68
    :goto_3
    if-eqz v2, :cond_2

    .line 69
    .line 70
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_4
    return-object p1
.end method

.method public static P(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Long;
    .locals 4

    .line 1
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

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
    goto :goto_1

    .line 9
    :cond_0
    const-string v0, "\\b[^>]*>\\s*(.*?)\\s*</"

    .line 10
    .line 11
    const-string v2, ">"

    .line 12
    .line 13
    const-string v3, "<"

    .line 14
    .line 15
    invoke-static {v3, p1, v0, p1, v2}, Lbc/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const/4 v0, 0x2

    .line 20
    invoke-static {v0}, Ll3/w;->f(I)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-static {p1, v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-static {p1, v0, p0}, La7/a;->b(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Log/i;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    if-eqz p0, :cond_1

    .line 44
    .line 45
    invoke-virtual {p0}, Log/i;->a()Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    const/4 p1, 0x1

    .line 50
    invoke-static {p1, p0}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast p0, Ljava/lang/String;

    .line 55
    .line 56
    if-eqz p0, :cond_1

    .line 57
    .line 58
    const-string p1, "<![CDATA["

    .line 59
    .line 60
    const-string v2, ""

    .line 61
    .line 62
    invoke-static {p0, p1, v2, v0}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    const-string p1, "]]>"

    .line 67
    .line 68
    invoke-static {p0, p1, v2, v0}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    goto :goto_0

    .line 81
    :cond_1
    move-object p0, v1

    .line 82
    :goto_0
    if-eqz p0, :cond_2

    .line 83
    .line 84
    invoke-static {p0}, Log/t;->g0(Ljava/lang/String;)Ljava/lang/Long;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0

    .line 89
    :cond_2
    :goto_1
    return-object v1
.end method

.method public static final k(Ls8/c;Lr8/g;)Z
    .locals 1

    .line 1
    iget-object p0, p1, Lr8/g;->a:Landroid/content/Context;

    .line 2
    .line 3
    const-string p1, "Hchat_anti_recall_config"

    .line 4
    .line 5
    invoke-static {p0, p1}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string p1, "anti_recall_enable"

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-interface {p0, p1, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public static l(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {p0, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_3

    .line 6
    .line 7
    instance-of p1, p0, Ljava/lang/String;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    check-cast p0, Ljava/lang/String;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const-string p1, "g"

    .line 15
    .line 16
    const-string v0, "a"

    .line 17
    .line 18
    const-string v1, "d"

    .line 19
    .line 20
    const-string v2, "e"

    .line 21
    .line 22
    const-string v3, "f"

    .line 23
    .line 24
    filled-new-array {v1, v2, v3, p1, v0}, [Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 v0, 0x0

    .line 29
    :goto_0
    const/4 v1, 0x5

    .line 30
    if-lt v0, v1, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    aget-object v1, p1, v0

    .line 34
    .line 35
    invoke-static {p0, v1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    instance-of v2, v1, Ljava/lang/String;

    .line 40
    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    move-object v2, v1

    .line 44
    check-cast v2, Ljava/lang/CharSequence;

    .line 45
    .line 46
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-nez v2, :cond_2

    .line 51
    .line 52
    check-cast v1, Ljava/lang/String;

    .line 53
    .line 54
    return-object v1

    .line 55
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    :goto_1
    const-string p0, ""

    .line 59
    .line 60
    return-object p0
.end method

.method public static m(JLjava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p0, v0

    .line 4
    .line 5
    if-gtz v0, :cond_0

    .line 6
    .line 7
    const-string p0, ""

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    :try_start_0
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 11
    .line 12
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-direct {v0, p2, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 17
    .line 18
    .line 19
    new-instance p2, Ljava/util/Date;

    .line 20
    .line 21
    invoke-direct {p2, p0, p1}, Ljava/util/Date;-><init>(J)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p2

    .line 30
    new-instance v0, Lsf/f;

    .line 31
    .line 32
    invoke-direct {v0, p2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    move-object p2, v0

    .line 36
    :goto_0
    invoke-static {p2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-nez v0, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    new-instance p2, Ljava/text/SimpleDateFormat;

    .line 44
    .line 45
    const-string v0, "yyyy-MM-dd HH:mm:ss"

    .line 46
    .line 47
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-direct {p2, v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 52
    .line 53
    .line 54
    new-instance v0, Ljava/util/Date;

    .line 55
    .line 56
    invoke-direct {v0, p0, p1}, Ljava/util/Date;-><init>(J)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    :goto_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    check-cast p2, Ljava/lang/String;

    .line 67
    .line 68
    return-object p2
.end method

.method public static o(Lr8/g;Ljava/lang/String;JLl8/f;JZ)V
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-wide/from16 v6, p2

    .line 6
    .line 7
    move-object/from16 v2, p4

    .line 8
    .line 9
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    const-string v8, " newmsgid="

    .line 14
    .line 15
    if-nez v3, :cond_0

    .line 16
    .line 17
    const-wide/16 v9, 0x0

    .line 18
    .line 19
    cmp-long v3, v6, v9

    .line 20
    .line 21
    if-gtz v3, :cond_1

    .line 22
    .line 23
    :cond_0
    move-object v2, v8

    .line 24
    goto/16 :goto_25

    .line 25
    .line 26
    :cond_1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->localMessages()Lk8/e;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    if-nez v3, :cond_2

    .line 31
    .line 32
    const-string v0, "[Hchat:AntiRecall] \u63d2\u5165\u63d0\u793a\u5931\u8d25: LocalMessage API\u4e3a\u7a7a"

    .line 33
    .line 34
    invoke-static {v0}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_2
    invoke-virtual {v3}, Lk8/e;->c()V

    .line 39
    .line 40
    .line 41
    invoke-static/range {p2 .. p4}, Ls8/c;->M(JLl8/f;)Ljava/util/ArrayList;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    :cond_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-eqz v5, :cond_5

    .line 54
    .line 55
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    check-cast v5, Ljava/lang/Number;

    .line 60
    .line 61
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 62
    .line 63
    .line 64
    move-result-wide v11

    .line 65
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->messageStore()Lk8/s;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    if-eqz v5, :cond_4

    .line 70
    .line 71
    invoke-virtual {v5, v11, v12}, Lk8/s;->c(J)Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    if-eqz v5, :cond_4

    .line 76
    .line 77
    iget-wide v11, v5, Lh/Hchat/hooks/api/model/WeChatMessage;->createTime:J

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_4
    move-wide v11, v9

    .line 81
    :goto_0
    invoke-static {v11, v12}, Ls8/c;->K(J)J

    .line 82
    .line 83
    .line 84
    move-result-wide v11

    .line 85
    cmp-long v5, v11, v9

    .line 86
    .line 87
    if-lez v5, :cond_3

    .line 88
    .line 89
    goto :goto_5

    .line 90
    :cond_5
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->messageStore()Lk8/s;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    if-eqz v4, :cond_7

    .line 95
    .line 96
    if-eqz v2, :cond_6

    .line 97
    .line 98
    iget-wide v11, v2, Ll8/f;->b:J

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_6
    move-wide v11, v9

    .line 102
    :goto_1
    invoke-virtual {v4, v11, v12}, Lk8/s;->a(J)J

    .line 103
    .line 104
    .line 105
    move-result-wide v4

    .line 106
    goto :goto_2

    .line 107
    :cond_7
    move-wide v4, v9

    .line 108
    :goto_2
    invoke-static {v4, v5}, Ls8/c;->K(J)J

    .line 109
    .line 110
    .line 111
    move-result-wide v11

    .line 112
    cmp-long v4, v11, v9

    .line 113
    .line 114
    if-lez v4, :cond_8

    .line 115
    .line 116
    goto :goto_5

    .line 117
    :cond_8
    if-eqz v2, :cond_9

    .line 118
    .line 119
    invoke-virtual {v2}, Ll8/f;->a()J

    .line 120
    .line 121
    .line 122
    move-result-wide v4

    .line 123
    goto :goto_3

    .line 124
    :cond_9
    move-wide v4, v9

    .line 125
    :goto_3
    invoke-static {v4, v5}, Ls8/c;->K(J)J

    .line 126
    .line 127
    .line 128
    move-result-wide v11

    .line 129
    cmp-long v4, v11, v9

    .line 130
    .line 131
    if-lez v4, :cond_a

    .line 132
    .line 133
    goto :goto_5

    .line 134
    :cond_a
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->messageStore()Lk8/s;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    if-eqz v4, :cond_b

    .line 139
    .line 140
    invoke-virtual {v4, v6, v7}, Lk8/s;->a(J)J

    .line 141
    .line 142
    .line 143
    move-result-wide v4

    .line 144
    goto :goto_4

    .line 145
    :cond_b
    move-wide v4, v9

    .line 146
    :goto_4
    invoke-static {v4, v5}, Ls8/c;->K(J)J

    .line 147
    .line 148
    .line 149
    move-result-wide v11

    .line 150
    :goto_5
    if-eqz p7, :cond_c

    .line 151
    .line 152
    const-string v0, "\u4f60\u64a4\u56de\u4e86\u4e0a\u4e00\u6761\u6d88\u606f"

    .line 153
    .line 154
    move-object/from16 v19, v3

    .line 155
    .line 156
    move-object/from16 v33, v8

    .line 157
    .line 158
    move-wide/from16 v16, v9

    .line 159
    .line 160
    goto/16 :goto_22

    .line 161
    .line 162
    :cond_c
    iget-object v4, v0, Lr8/g;->a:Landroid/content/Context;

    .line 163
    .line 164
    const-string v5, "Hchat_anti_recall_config"

    .line 165
    .line 166
    invoke-static {v4, v5}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    const-string v13, "anti_recall_notice_text"

    .line 171
    .line 172
    const-string v14, "{name}\u64a4\u56de\u4e86\u4e0a\u4e00\u6761\u6d88\u606f {content}"

    .line 173
    .line 174
    invoke-interface {v4, v13, v14}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    if-eqz v4, :cond_e

    .line 179
    .line 180
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 181
    .line 182
    .line 183
    move-result v15

    .line 184
    if-nez v15, :cond_d

    .line 185
    .line 186
    goto :goto_6

    .line 187
    :cond_d
    const/4 v4, 0x0

    .line 188
    :goto_6
    if-eqz v4, :cond_e

    .line 189
    .line 190
    goto :goto_7

    .line 191
    :cond_e
    move-object v4, v14

    .line 192
    :goto_7
    const-string v15, "\u5df2\u963b\u6b62\u4e00\u6761\u64a4\u56de\u6d88\u606f"

    .line 193
    .line 194
    invoke-virtual {v4, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v15

    .line 198
    if-eqz v15, :cond_f

    .line 199
    .line 200
    goto :goto_8

    .line 201
    :cond_f
    move-object v14, v4

    .line 202
    :goto_8
    iget-object v0, v0, Lr8/g;->a:Landroid/content/Context;

    .line 203
    .line 204
    invoke-static {v0, v5}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    const-string v4, "anti_recall_notice_time_format"

    .line 209
    .line 210
    const-string v5, "yyyy-MM-dd HH:mm:ss"

    .line 211
    .line 212
    invoke-interface {v0, v4, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    if-eqz v0, :cond_11

    .line 217
    .line 218
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    if-eqz v0, :cond_11

    .line 227
    .line 228
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 229
    .line 230
    .line 231
    move-result v4

    .line 232
    if-lez v4, :cond_10

    .line 233
    .line 234
    goto :goto_9

    .line 235
    :cond_10
    const/4 v0, 0x0

    .line 236
    :goto_9
    if-eqz v0, :cond_11

    .line 237
    .line 238
    move-object v5, v0

    .line 239
    :cond_11
    const-string v0, ""

    .line 240
    .line 241
    if-eqz v2, :cond_14

    .line 242
    .line 243
    iget-object v4, v2, Ll8/f;->d:Ljava/lang/String;

    .line 244
    .line 245
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    .line 246
    .line 247
    .line 248
    move-result v15

    .line 249
    if-nez v15, :cond_12

    .line 250
    .line 251
    goto :goto_a

    .line 252
    :cond_12
    iget-object v4, v2, Ll8/f;->j:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 253
    .line 254
    if-eqz v4, :cond_13

    .line 255
    .line 256
    invoke-virtual {v4}, Lh/Hchat/hooks/api/model/WeChatMessage;->sendTalker()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    goto :goto_a

    .line 261
    :cond_13
    move-object v4, v0

    .line 262
    :goto_a
    if-eqz v4, :cond_14

    .line 263
    .line 264
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 265
    .line 266
    .line 267
    move-result v15

    .line 268
    if-nez v15, :cond_14

    .line 269
    .line 270
    invoke-static {v1, v4}, Ls8/c;->z(Ljava/lang/String;Ljava/lang/String;)Z

    .line 271
    .line 272
    .line 273
    move-result v15

    .line 274
    if-eqz v15, :cond_14

    .line 275
    .line 276
    goto :goto_b

    .line 277
    :cond_14
    const/4 v4, 0x0

    .line 278
    :goto_b
    const-string v15, ":"

    .line 279
    .line 280
    move-wide/from16 v16, v9

    .line 281
    .line 282
    const-string v10, "@im.chatroom"

    .line 283
    .line 284
    const-string v13, "@chatroom"

    .line 285
    .line 286
    if-eqz v4, :cond_16

    .line 287
    .line 288
    move-object/from16 v18, v0

    .line 289
    .line 290
    move-object/from16 v19, v3

    .line 291
    .line 292
    move-object/from16 v33, v8

    .line 293
    .line 294
    :cond_15
    :goto_c
    const/4 v6, 0x0

    .line 295
    goto/16 :goto_12

    .line 296
    .line 297
    :cond_16
    if-eqz v2, :cond_17

    .line 298
    .line 299
    iget-object v4, v2, Ll8/f;->j:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 300
    .line 301
    goto :goto_d

    .line 302
    :cond_17
    const/4 v4, 0x0

    .line 303
    :goto_d
    if-eqz v4, :cond_18

    .line 304
    .line 305
    invoke-virtual {v4}, Lh/Hchat/hooks/api/model/WeChatMessage;->sendTalker()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v9

    .line 309
    if-eqz v9, :cond_18

    .line 310
    .line 311
    invoke-static {v9}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 312
    .line 313
    .line 314
    move-result v18

    .line 315
    if-nez v18, :cond_18

    .line 316
    .line 317
    invoke-static {v1, v9}, Ls8/c;->z(Ljava/lang/String;Ljava/lang/String;)Z

    .line 318
    .line 319
    .line 320
    move-result v18

    .line 321
    if-eqz v18, :cond_18

    .line 322
    .line 323
    goto :goto_e

    .line 324
    :cond_18
    const/4 v9, 0x0

    .line 325
    :goto_e
    if-eqz v9, :cond_19

    .line 326
    .line 327
    move-object/from16 v18, v0

    .line 328
    .line 329
    move-object/from16 v19, v3

    .line 330
    .line 331
    move-object/from16 v33, v8

    .line 332
    .line 333
    move-object v4, v9

    .line 334
    goto :goto_c

    .line 335
    :cond_19
    if-eqz v4, :cond_1c

    .line 336
    .line 337
    invoke-virtual {v4}, Lh/Hchat/hooks/api/model/WeChatMessage;->getMsgSource()Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v9

    .line 341
    move-object/from16 v18, v0

    .line 342
    .line 343
    invoke-virtual {v4}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    iget-object v4, v4, Lh/Hchat/hooks/api/model/WeChatMessage;->reserved:Ljava/lang/String;

    .line 348
    .line 349
    sget-object v19, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 350
    .line 351
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 352
    .line 353
    .line 354
    move-object/from16 v19, v3

    .line 355
    .line 356
    const-string v3, "fromusername"

    .line 357
    .line 358
    invoke-static {v0, v3}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v20

    .line 362
    move-object/from16 v33, v8

    .line 363
    .line 364
    const-string v8, "fromusr"

    .line 365
    .line 366
    invoke-static {v0, v8}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v21

    .line 370
    const-string v6, "sender"

    .line 371
    .line 372
    invoke-static {v0, v6}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v22

    .line 376
    invoke-static {v9, v3}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object v23

    .line 380
    invoke-static {v9, v8}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v24

    .line 384
    invoke-static {v4, v3}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v25

    .line 388
    invoke-static {v4, v8}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v26

    .line 392
    const-string v0, ".msgsource.fromusername"

    .line 393
    .line 394
    invoke-static {v9, v0}, Ll8/d;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v27

    .line 398
    invoke-static {v9, v3}, Ll8/d;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v28

    .line 402
    const-string v0, ".msgsource.fromusr"

    .line 403
    .line 404
    invoke-static {v9, v0}, Ll8/d;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v29

    .line 408
    invoke-static {v9, v8}, Ll8/d;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v30

    .line 412
    const-string v0, ".msgsource.sender"

    .line 413
    .line 414
    invoke-static {v9, v0}, Ll8/d;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object v31

    .line 418
    invoke-static {v9, v6}, Ll8/d;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v32

    .line 422
    filled-new-array/range {v20 .. v32}, [Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    const/4 v3, 0x0

    .line 427
    :goto_f
    const/16 v4, 0xd

    .line 428
    .line 429
    if-lt v3, v4, :cond_1a

    .line 430
    .line 431
    move-object/from16 v4, v18

    .line 432
    .line 433
    goto :goto_10

    .line 434
    :cond_1a
    aget-object v4, v0, v3

    .line 435
    .line 436
    invoke-static {v4, v15}, Log/m;->N0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object v4

    .line 440
    invoke-static {v4}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 441
    .line 442
    .line 443
    move-result-object v4

    .line 444
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v4

    .line 448
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 449
    .line 450
    .line 451
    move-result v6

    .line 452
    if-nez v6, :cond_1b

    .line 453
    .line 454
    invoke-static {v1, v4}, Ls8/c;->z(Ljava/lang/String;Ljava/lang/String;)Z

    .line 455
    .line 456
    .line 457
    move-result v6

    .line 458
    if-eqz v6, :cond_1b

    .line 459
    .line 460
    goto :goto_10

    .line 461
    :cond_1b
    add-int/lit8 v3, v3, 0x1

    .line 462
    .line 463
    goto :goto_f

    .line 464
    :cond_1c
    move-object/from16 v18, v0

    .line 465
    .line 466
    move-object/from16 v19, v3

    .line 467
    .line 468
    move-object/from16 v33, v8

    .line 469
    .line 470
    const/4 v4, 0x0

    .line 471
    :goto_10
    if-eqz v4, :cond_1d

    .line 472
    .line 473
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 474
    .line 475
    .line 476
    move-result v0

    .line 477
    if-eqz v0, :cond_15

    .line 478
    .line 479
    :cond_1d
    if-eqz v2, :cond_1f

    .line 480
    .line 481
    iget-object v0, v2, Ll8/f;->j:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 482
    .line 483
    if-eqz v0, :cond_1e

    .line 484
    .line 485
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    goto :goto_11

    .line 490
    :cond_1e
    iget-object v0, v2, Ll8/f;->g:Ljava/lang/String;

    .line 491
    .line 492
    goto :goto_11

    .line 493
    :cond_1f
    const/4 v0, 0x0

    .line 494
    :goto_11
    if-nez v0, :cond_20

    .line 495
    .line 496
    move-object/from16 v0, v18

    .line 497
    .line 498
    :cond_20
    const-string v3, ":\n"

    .line 499
    .line 500
    const/4 v4, 0x6

    .line 501
    const/4 v6, 0x0

    .line 502
    invoke-static {v0, v3, v6, v6, v4}, Log/m;->r0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 503
    .line 504
    .line 505
    move-result v3

    .line 506
    invoke-static {v1, v13, v6}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 507
    .line 508
    .line 509
    move-result v4

    .line 510
    if-nez v4, :cond_21

    .line 511
    .line 512
    invoke-static {v1, v10, v6}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 513
    .line 514
    .line 515
    move-result v4

    .line 516
    if-eqz v4, :cond_22

    .line 517
    .line 518
    :cond_21
    if-lez v3, :cond_22

    .line 519
    .line 520
    invoke-virtual {v0, v6, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 521
    .line 522
    .line 523
    move-result-object v4

    .line 524
    goto :goto_12

    .line 525
    :cond_22
    move-object/from16 v4, v18

    .line 526
    .line 527
    :goto_12
    invoke-static {v4, v15}, Log/m;->N0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object v0

    .line 531
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v0

    .line 539
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 540
    .line 541
    .line 542
    move-result v3

    .line 543
    if-eqz v3, :cond_23

    .line 544
    .line 545
    move-object/from16 v0, v18

    .line 546
    .line 547
    goto/16 :goto_1d

    .line 548
    .line 549
    :cond_23
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->users()Lg8/k;

    .line 550
    .line 551
    .line 552
    move-result-object v3

    .line 553
    invoke-static {v1, v13, v6}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 554
    .line 555
    .line 556
    move-result v4

    .line 557
    if-nez v4, :cond_2c

    .line 558
    .line 559
    invoke-static {v1, v10, v6}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 560
    .line 561
    .line 562
    move-result v4

    .line 563
    if-eqz v4, :cond_24

    .line 564
    .line 565
    goto :goto_18

    .line 566
    :cond_24
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contacts()Lg8/i;

    .line 567
    .line 568
    .line 569
    move-result-object v3

    .line 570
    if-eqz v3, :cond_25

    .line 571
    .line 572
    invoke-virtual {v3, v0}, Lg8/i;->n(Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatContact;

    .line 573
    .line 574
    .line 575
    move-result-object v3

    .line 576
    goto :goto_13

    .line 577
    :cond_25
    const/4 v3, 0x0

    .line 578
    :goto_13
    if-eqz v3, :cond_26

    .line 579
    .line 580
    iget-object v4, v3, Lh/Hchat/hooks/api/model/WeChatContact;->remarkName:Ljava/lang/String;

    .line 581
    .line 582
    goto :goto_14

    .line 583
    :cond_26
    const/4 v4, 0x0

    .line 584
    :goto_14
    if-eqz v3, :cond_27

    .line 585
    .line 586
    iget-object v3, v3, Lh/Hchat/hooks/api/model/WeChatContact;->nickname:Ljava/lang/String;

    .line 587
    .line 588
    goto :goto_15

    .line 589
    :cond_27
    const/4 v3, 0x0

    .line 590
    :goto_15
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->users()Lg8/k;

    .line 591
    .line 592
    .line 593
    move-result-object v6

    .line 594
    if-eqz v6, :cond_28

    .line 595
    .line 596
    invoke-virtual {v6, v0}, Lg8/k;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 597
    .line 598
    .line 599
    move-result-object v6

    .line 600
    goto :goto_16

    .line 601
    :cond_28
    const/4 v6, 0x0

    .line 602
    :goto_16
    filled-new-array {v4, v3, v6}, [Ljava/lang/String;

    .line 603
    .line 604
    .line 605
    move-result-object v3

    .line 606
    const/4 v6, 0x0

    .line 607
    :goto_17
    const/4 v4, 0x3

    .line 608
    if-ge v6, v4, :cond_2a

    .line 609
    .line 610
    aget-object v4, v3, v6

    .line 611
    .line 612
    if-eqz v4, :cond_29

    .line 613
    .line 614
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 615
    .line 616
    .line 617
    move-result v7

    .line 618
    if-eqz v7, :cond_2b

    .line 619
    .line 620
    :cond_29
    add-int/lit8 v6, v6, 0x1

    .line 621
    .line 622
    goto :goto_17

    .line 623
    :cond_2a
    const/4 v4, 0x0

    .line 624
    :cond_2b
    if-nez v4, :cond_31

    .line 625
    .line 626
    move-object/from16 v4, v18

    .line 627
    .line 628
    goto :goto_1b

    .line 629
    :cond_2c
    :goto_18
    if-eqz v3, :cond_30

    .line 630
    .line 631
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 632
    .line 633
    .line 634
    move-result v4

    .line 635
    if-eqz v4, :cond_2d

    .line 636
    .line 637
    goto :goto_19

    .line 638
    :cond_2d
    iget-object v3, v3, Lg8/k;->b:Lg8/i;

    .line 639
    .line 640
    invoke-virtual {v3, v1, v0}, Lg8/i;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 641
    .line 642
    .line 643
    move-result-object v3

    .line 644
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 645
    .line 646
    .line 647
    move-result v4

    .line 648
    if-nez v4, :cond_2f

    .line 649
    .line 650
    if-eqz v3, :cond_2e

    .line 651
    .line 652
    goto :goto_1a

    .line 653
    :cond_2e
    :goto_19
    move-object/from16 v3, v18

    .line 654
    .line 655
    goto :goto_1a

    .line 656
    :cond_2f
    move-object v3, v0

    .line 657
    :goto_1a
    move-object v4, v3

    .line 658
    goto :goto_1b

    .line 659
    :cond_30
    const/4 v4, 0x0

    .line 660
    :cond_31
    :goto_1b
    if-eqz v4, :cond_33

    .line 661
    .line 662
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 663
    .line 664
    .line 665
    move-result v3

    .line 666
    if-nez v3, :cond_32

    .line 667
    .line 668
    goto :goto_1c

    .line 669
    :cond_32
    const/4 v4, 0x0

    .line 670
    :goto_1c
    if-eqz v4, :cond_33

    .line 671
    .line 672
    move-object v0, v4

    .line 673
    :cond_33
    :goto_1d
    if-eqz v2, :cond_39

    .line 674
    .line 675
    iget-object v3, v2, Ll8/f;->j:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 676
    .line 677
    if-eqz v3, :cond_39

    .line 678
    .line 679
    invoke-virtual {v3}, Lh/Hchat/hooks/api/model/WeChatMessage;->isText()Z

    .line 680
    .line 681
    .line 682
    move-result v4

    .line 683
    if-eqz v4, :cond_34

    .line 684
    .line 685
    invoke-virtual {v3}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 686
    .line 687
    .line 688
    move-result-object v3

    .line 689
    goto :goto_1f

    .line 690
    :cond_34
    invoke-virtual {v3}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 691
    .line 692
    .line 693
    move-result-object v4

    .line 694
    invoke-virtual {v3}, Lh/Hchat/hooks/api/model/WeChatMessage;->isQuote()Z

    .line 695
    .line 696
    .line 697
    move-result v6

    .line 698
    if-nez v6, :cond_36

    .line 699
    .line 700
    sget-object v6, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 701
    .line 702
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 703
    .line 704
    .line 705
    const-string v6, "type"

    .line 706
    .line 707
    invoke-static {v4, v6}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 708
    .line 709
    .line 710
    move-result-object v6

    .line 711
    const-string v7, "57"

    .line 712
    .line 713
    invoke-static {v6, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 714
    .line 715
    .line 716
    move-result v6

    .line 717
    if-nez v6, :cond_36

    .line 718
    .line 719
    const-string v6, "<refermsg>"

    .line 720
    .line 721
    const/4 v7, 0x1

    .line 722
    invoke-static {v4, v6, v7}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 723
    .line 724
    .line 725
    move-result v4

    .line 726
    if-eqz v4, :cond_35

    .line 727
    .line 728
    goto :goto_1e

    .line 729
    :cond_35
    move-object/from16 v3, v18

    .line 730
    .line 731
    goto :goto_1f

    .line 732
    :cond_36
    :goto_1e
    sget-object v4, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 733
    .line 734
    invoke-virtual {v3}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 735
    .line 736
    .line 737
    move-result-object v3

    .line 738
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 739
    .line 740
    .line 741
    const-string v4, "title"

    .line 742
    .line 743
    invoke-static {v3, v4}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 744
    .line 745
    .line 746
    move-result-object v3

    .line 747
    :goto_1f
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 748
    .line 749
    .line 750
    move-result v4

    .line 751
    if-nez v4, :cond_37

    .line 752
    .line 753
    goto :goto_20

    .line 754
    :cond_37
    const/4 v3, 0x0

    .line 755
    :goto_20
    if-eqz v3, :cond_38

    .line 756
    .line 757
    const/16 v4, 0xa

    .line 758
    .line 759
    const/16 v6, 0x20

    .line 760
    .line 761
    invoke-virtual {v3, v4, v6}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 762
    .line 763
    .line 764
    move-result-object v3

    .line 765
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 766
    .line 767
    .line 768
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 769
    .line 770
    .line 771
    move-result-object v3

    .line 772
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 773
    .line 774
    .line 775
    move-result-object v13

    .line 776
    goto :goto_21

    .line 777
    :cond_38
    const/4 v13, 0x0

    .line 778
    :goto_21
    if-nez v13, :cond_3a

    .line 779
    .line 780
    :cond_39
    move-object/from16 v13, v18

    .line 781
    .line 782
    :cond_3a
    const-string v3, "{name}"

    .line 783
    .line 784
    const/4 v6, 0x0

    .line 785
    invoke-static {v14, v3, v0, v6}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 786
    .line 787
    .line 788
    move-result-object v0

    .line 789
    const-string v3, "{content}"

    .line 790
    .line 791
    invoke-static {v0, v3, v13, v6}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 792
    .line 793
    .line 794
    move-result-object v0

    .line 795
    const-string v3, "{sendTime}"

    .line 796
    .line 797
    invoke-static {v11, v12, v5}, Ls8/c;->m(JLjava/lang/String;)Ljava/lang/String;

    .line 798
    .line 799
    .line 800
    move-result-object v4

    .line 801
    invoke-static {v0, v3, v4, v6}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 802
    .line 803
    .line 804
    move-result-object v0

    .line 805
    const-string v3, "{recallTime}"

    .line 806
    .line 807
    move-wide/from16 v7, p5

    .line 808
    .line 809
    invoke-static {v7, v8, v5}, Ls8/c;->m(JLjava/lang/String;)Ljava/lang/String;

    .line 810
    .line 811
    .line 812
    move-result-object v4

    .line 813
    invoke-static {v0, v3, v4, v6}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 814
    .line 815
    .line 816
    move-result-object v0

    .line 817
    :goto_22
    cmp-long v3, v11, v16

    .line 818
    .line 819
    if-gtz v3, :cond_3d

    .line 820
    .line 821
    if-eqz v2, :cond_3b

    .line 822
    .line 823
    iget-wide v3, v2, Ll8/f;->a:J

    .line 824
    .line 825
    goto :goto_23

    .line 826
    :cond_3b
    move-wide/from16 v3, v16

    .line 827
    .line 828
    :goto_23
    if-eqz v2, :cond_3c

    .line 829
    .line 830
    iget-wide v9, v2, Ll8/f;->b:J

    .line 831
    .line 832
    goto :goto_24

    .line 833
    :cond_3c
    move-wide/from16 v9, v16

    .line 834
    .line 835
    :goto_24
    const-string v0, "[Hchat:AntiRecall] \u63d2\u5165\u63d0\u793a\u5931\u8d25: \u672a\u5b9a\u4f4d\u539f\u6d88\u606f\u65f6\u95f4 talker="

    .line 836
    .line 837
    const-string v2, " id="

    .line 838
    .line 839
    move-wide/from16 v6, p2

    .line 840
    .line 841
    invoke-static {v0, v1, v2, v6, v7}, Leh/a;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/StringBuilder;

    .line 842
    .line 843
    .line 844
    move-result-object v0

    .line 845
    const-string v1, " origin="

    .line 846
    .line 847
    const-string v2, " new="

    .line 848
    .line 849
    invoke-static {v0, v1, v3, v4, v2}, Lj8/b;->s(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 850
    .line 851
    .line 852
    invoke-virtual {v0, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 853
    .line 854
    .line 855
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 856
    .line 857
    .line 858
    move-result-object v0

    .line 859
    invoke-static {v0}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 860
    .line 861
    .line 862
    return-void

    .line 863
    :cond_3d
    move-wide/from16 v6, p2

    .line 864
    .line 865
    const-wide/16 v2, 0x1

    .line 866
    .line 867
    add-long v3, v11, v2

    .line 868
    .line 869
    const/4 v5, 0x0

    .line 870
    move-object v2, v0

    .line 871
    move-object/from16 v0, v19

    .line 872
    .line 873
    invoke-virtual/range {v0 .. v5}, Lk8/e;->e(Ljava/lang/String;Ljava/lang/String;JZ)J

    .line 874
    .line 875
    .line 876
    move-result-wide v2

    .line 877
    cmp-long v0, v2, v16

    .line 878
    .line 879
    if-gtz v0, :cond_3e

    .line 880
    .line 881
    new-instance v0, Ljava/lang/StringBuilder;

    .line 882
    .line 883
    const-string v2, "[Hchat:AntiRecall] \u63d2\u5165\u63d0\u793a\u5931\u8d25: talker="

    .line 884
    .line 885
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 886
    .line 887
    .line 888
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 889
    .line 890
    .line 891
    move-object/from16 v2, v33

    .line 892
    .line 893
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 894
    .line 895
    .line 896
    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 897
    .line 898
    .line 899
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 900
    .line 901
    .line 902
    move-result-object v0

    .line 903
    invoke-static {v0}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 904
    .line 905
    .line 906
    :cond_3e
    return-void

    .line 907
    :goto_25
    new-instance v0, Ljava/lang/StringBuilder;

    .line 908
    .line 909
    const-string v3, "[Hchat:AntiRecall] \u63d2\u5165\u63d0\u793a\u5931\u8d25: talker/newmsgid\u4e3a\u7a7a talker="

    .line 910
    .line 911
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 912
    .line 913
    .line 914
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 915
    .line 916
    .line 917
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 918
    .line 919
    .line 920
    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 921
    .line 922
    .line 923
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 924
    .line 925
    .line 926
    move-result-object v0

    .line 927
    invoke-static {v0}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 928
    .line 929
    .line 930
    return-void
.end method

.method public static s(Ljava/lang/reflect/Method;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 10
    .line 11
    invoke-static {p0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    array-length p0, v0

    .line 19
    const/4 v2, 0x2

    .line 20
    if-ne p0, v2, :cond_0

    .line 21
    .line 22
    aget-object p0, v0, v1

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-static {p0}, Ls8/c;->A(Ljava/lang/Class;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    const/4 p0, 0x1

    .line 34
    aget-object v0, v0, p0

    .line 35
    .line 36
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 37
    .line 38
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    return p0

    .line 45
    :cond_0
    return v1
.end method

.method public static t(Ljava/lang/reflect/Method;)Z
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x3

    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x2

    .line 9
    if-eq v1, v4, :cond_0

    .line 10
    .line 11
    array-length v1, v0

    .line 12
    if-eq v1, v2, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    aget-object v1, v0, v3

    .line 16
    .line 17
    sget-object v5, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 18
    .line 19
    invoke-static {v1, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 v1, 0x1

    .line 27
    aget-object v5, v0, v1

    .line 28
    .line 29
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-static {v5}, Ls8/c;->A(Ljava/lang/Class;)Z

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    if-nez v5, :cond_2

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    array-length v5, v0

    .line 40
    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 41
    .line 42
    if-ne v5, v2, :cond_3

    .line 43
    .line 44
    aget-object v2, v0, v4

    .line 45
    .line 46
    invoke-static {v2, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-nez v2, :cond_3

    .line 51
    .line 52
    aget-object v0, v0, v4

    .line 53
    .line 54
    const-class v2, Ljava/lang/Boolean;

    .line 55
    .line 56
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_3

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 68
    .line 69
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_5

    .line 74
    .line 75
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {v0, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-nez v0, :cond_5

    .line 84
    .line 85
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 90
    .line 91
    invoke-static {p0, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    if-eqz p0, :cond_4

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_4
    :goto_0
    return v3

    .line 99
    :cond_5
    :goto_1
    return v1
.end method

.method public static u(Ljava/lang/String;)Z
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v0, v0, [C

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    invoke-static {p0, v0}, Log/m;->S0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v0, "message"

    .line 12
    .line 13
    invoke-static {p0, v0}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x1

    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    invoke-static {p0, v0, v2}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    invoke-static {p0, v0, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-eqz p0, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 p0, 0x0

    .line 34
    return p0

    .line 35
    :cond_1
    :goto_0
    return v2

    .line 36
    nop

    .line 37
    :array_0
    .array-data 2
        0x60s
        0x22s
        0x5bs
        0x5ds
    .end array-data
.end method

.method public static v(Ljava/lang/reflect/Method;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 10
    .line 11
    invoke-static {p0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    array-length p0, v0

    .line 19
    const/4 v2, 0x2

    .line 20
    if-ne p0, v2, :cond_0

    .line 21
    .line 22
    aget-object p0, v0, v1

    .line 23
    .line 24
    const-class v2, Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {p0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-eqz p0, :cond_0

    .line 31
    .line 32
    const/4 p0, 0x1

    .line 33
    aget-object v0, v0, p0

    .line 34
    .line 35
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 36
    .line 37
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    return p0

    .line 44
    :cond_0
    return v1
.end method

.method public static w(Ljava/lang/reflect/Method;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 10
    .line 11
    invoke-static {p0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    array-length p0, v0

    .line 19
    const/4 v2, 0x1

    .line 20
    if-ne p0, v2, :cond_0

    .line 21
    .line 22
    aget-object p0, v0, v1

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-static {p0}, Ls8/c;->A(Ljava/lang/Class;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    return v2

    .line 34
    :cond_0
    return v1
.end method

.method public static x(Ljava/lang/reflect/Method;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 10
    .line 11
    invoke-static {p0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    array-length p0, v0

    .line 19
    const/4 v2, 0x6

    .line 20
    if-ne p0, v2, :cond_0

    .line 21
    .line 22
    aget-object p0, v0, v1

    .line 23
    .line 24
    const-class v2, Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {p0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-eqz p0, :cond_0

    .line 31
    .line 32
    const/4 p0, 0x1

    .line 33
    aget-object v3, v0, p0

    .line 34
    .line 35
    sget-object v4, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 36
    .line 37
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_0

    .line 42
    .line 43
    const/4 v3, 0x3

    .line 44
    aget-object v3, v0, v3

    .line 45
    .line 46
    invoke-static {v3, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_0

    .line 51
    .line 52
    const/4 v3, 0x4

    .line 53
    aget-object v3, v0, v3

    .line 54
    .line 55
    invoke-static {v3, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_0

    .line 60
    .line 61
    const/4 v3, 0x5

    .line 62
    aget-object v0, v0, v3

    .line 63
    .line 64
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_0

    .line 69
    .line 70
    return p0

    .line 71
    :cond_0
    return v1
.end method

.method public static y(Ll8/f;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    iget-object v1, p0, Ll8/f;->j:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    move-object v1, v0

    .line 8
    :goto_0
    const/4 v2, 0x1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v1}, Lh/Hchat/hooks/api/model/WeChatMessage;->isSend()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-ne v1, v2, :cond_1

    .line 16
    .line 17
    goto :goto_4

    .line 18
    :cond_1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->account()Lg8/a;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    invoke-virtual {v1}, Lg8/a;->c()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    goto :goto_1

    .line 29
    :cond_2
    move-object v1, v0

    .line 30
    :goto_1
    const-string v3, ""

    .line 31
    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    move-object v1, v3

    .line 35
    :cond_3
    if-eqz p0, :cond_6

    .line 36
    .line 37
    iget-object v0, p0, Ll8/f;->d:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-nez v4, :cond_4

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_4
    iget-object p0, p0, Ll8/f;->j:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 47
    .line 48
    if-eqz p0, :cond_5

    .line 49
    .line 50
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->sendTalker()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    move-object v0, p0

    .line 55
    goto :goto_2

    .line 56
    :cond_5
    move-object v0, v3

    .line 57
    :cond_6
    :goto_2
    if-nez v0, :cond_7

    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_7
    move-object v3, v0

    .line 61
    :goto_3
    const-string p0, ":"

    .line 62
    .line 63
    invoke-static {v3, p0}, Log/m;->N0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    const-string v0, "\u4f60"

    .line 76
    .line 77
    invoke-static {p0, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-nez v0, :cond_a

    .line 82
    .line 83
    const-string v0, "\u4f60\u64a4\u56de"

    .line 84
    .line 85
    const/4 v3, 0x0

    .line 86
    invoke-static {p0, v0, v3}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_8

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_8
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-nez v0, :cond_9

    .line 98
    .line 99
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    if-eqz p0, :cond_9

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_9
    return v3

    .line 107
    :cond_a
    :goto_4
    return v2
.end method

.method public static z(Ljava/lang/String;Ljava/lang/String;)Z
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
    goto :goto_0

    .line 9
    :cond_0
    const-string v0, "@chatroom"

    .line 10
    .line 11
    invoke-static {p0, v0, v1}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const-string v3, "@im.chatroom"

    .line 16
    .line 17
    if-nez v2, :cond_1

    .line 18
    .line 19
    invoke-static {p0, v3, v1}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    :cond_1
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_2

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    invoke-static {p1, v0, v1}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-nez p0, :cond_3

    .line 37
    .line 38
    invoke-static {p1, v3, v1}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-nez p0, :cond_3

    .line 43
    .line 44
    const/4 p0, 0x1

    .line 45
    return p0

    .line 46
    :cond_3
    :goto_0
    return v1
.end method


# virtual methods
.method public final D(Ljava/lang/String;Lr8/g;)Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, Ls8/c;->i:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p2}, Ls8/c;->J(Lr8/g;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object p2, p2, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 10
    .line 11
    invoke-static {v0, v1, p2, p1}, Le8/b;->f(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    sget-object p1, Ltf/t;->g:Ltf/t;

    .line 17
    .line 18
    return-object p1
.end method

.method public final E(Lr8/g;)Ljava/util/List;
    .locals 10

    .line 1
    const-string v0, "revoke_entries"

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Ls8/c;->D(Ljava/lang/String;Lr8/g;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    new-instance v2, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_1

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    move-object v4, v3

    .line 27
    check-cast v4, Ljava/lang/reflect/Method;

    .line 28
    .line 29
    invoke-static {v4}, Ls8/c;->x(Ljava/lang/reflect/Method;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_0

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    const/4 v3, 0x0

    .line 44
    if-nez v1, :cond_2

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    move-object v2, v3

    .line 48
    :goto_1
    if-eqz v2, :cond_4

    .line 49
    .line 50
    new-instance p1, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-static {v2}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 57
    .line 58
    .line 59
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_3

    .line 68
    .line 69
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    check-cast v1, Ljava/lang/reflect/Method;

    .line 74
    .line 75
    new-instance v2, Ls8/a;

    .line 76
    .line 77
    invoke-direct {v2, v1, v3}, Ls8/a;-><init>(Ljava/lang/reflect/Method;Lhh/o;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_3
    return-object p1

    .line 85
    :cond_4
    const-string v1, "doRevokeMsg xmlSrvMsgId"

    .line 86
    .line 87
    const-string v2, "summerbadcr get a revoke"

    .line 88
    .line 89
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    const-string v2, "MM_DATA_SYSCMD_NEWXML_SUBTYPE_REVOKE"

    .line 94
    .line 95
    const-string v4, ".sysmsg.revokemsg.newmsgid"

    .line 96
    .line 97
    filled-new-array {v2, v4}, [Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    const-string v4, "ashutest::[oneliang][xml parse]"

    .line 102
    .line 103
    const-string v5, ".sysmsg.revokemsg.replacemsg"

    .line 104
    .line 105
    filled-new-array {v4, v5}, [Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    filled-new-array {v1, v2, v4}, [[Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 114
    .line 115
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 116
    .line 117
    .line 118
    const/4 v4, 0x0

    .line 119
    :goto_3
    const/4 v5, 0x3

    .line 120
    if-lt v4, v5, :cond_5

    .line 121
    .line 122
    goto/16 :goto_a

    .line 123
    .line 124
    :cond_5
    aget-object v5, v1, v4

    .line 125
    .line 126
    array-length v6, v5

    .line 127
    invoke-static {v5, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    check-cast v5, [Ljava/lang/String;

    .line 132
    .line 133
    :try_start_0
    iget-object v6, p1, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 134
    .line 135
    new-instance v7, Lch/e;

    .line 136
    .line 137
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 138
    .line 139
    .line 140
    new-instance v8, Lfh/k;

    .line 141
    .line 142
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 143
    .line 144
    .line 145
    invoke-static {v5}, Ltf/l;->L0([Ljava/lang/Object;)Ljava/util/List;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    invoke-static {v8, v5}, Lfh/k;->u0(Lfh/k;Ljava/util/Collection;)V

    .line 150
    .line 151
    .line 152
    iput-object v8, v7, Lch/e;->h:Lfh/k;

    .line 153
    .line 154
    invoke-virtual {v6, v7}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    new-instance v6, Ljava/util/ArrayList;

    .line 159
    .line 160
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    :cond_6
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 168
    .line 169
    .line 170
    move-result v7

    .line 171
    if-eqz v7, :cond_9

    .line 172
    .line 173
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v7

    .line 177
    check-cast v7, Lhh/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 178
    .line 179
    :try_start_1
    iget-object v8, p1, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 180
    .line 181
    invoke-virtual {v7, v8}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 182
    .line 183
    .line 184
    move-result-object v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 185
    goto :goto_5

    .line 186
    :catchall_0
    move-exception v8

    .line 187
    :try_start_2
    new-instance v9, Lsf/f;

    .line 188
    .line 189
    invoke-direct {v9, v8}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 190
    .line 191
    .line 192
    move-object v8, v9

    .line 193
    :goto_5
    nop

    .line 194
    instance-of v9, v8, Lsf/f;

    .line 195
    .line 196
    if-eqz v9, :cond_7

    .line 197
    .line 198
    move-object v8, v3

    .line 199
    :cond_7
    check-cast v8, Ljava/lang/reflect/Method;

    .line 200
    .line 201
    if-eqz v8, :cond_8

    .line 202
    .line 203
    invoke-static {v8}, Ls8/c;->x(Ljava/lang/reflect/Method;)Z

    .line 204
    .line 205
    .line 206
    move-result v9

    .line 207
    if-eqz v9, :cond_8

    .line 208
    .line 209
    new-instance v9, Ls8/a;

    .line 210
    .line 211
    invoke-direct {v9, v8, v7}, Ls8/a;-><init>(Ljava/lang/reflect/Method;Lhh/o;)V

    .line 212
    .line 213
    .line 214
    goto :goto_6

    .line 215
    :catchall_1
    move-exception v5

    .line 216
    goto :goto_7

    .line 217
    :cond_8
    move-object v9, v3

    .line 218
    :goto_6
    if-eqz v9, :cond_6

    .line 219
    .line 220
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 221
    .line 222
    .line 223
    goto :goto_4

    .line 224
    :goto_7
    new-instance v6, Lsf/f;

    .line 225
    .line 226
    invoke-direct {v6, v5}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 227
    .line 228
    .line 229
    :cond_9
    invoke-static {v6}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 230
    .line 231
    .line 232
    move-result-object v5

    .line 233
    if-nez v5, :cond_a

    .line 234
    .line 235
    goto :goto_8

    .line 236
    :cond_a
    const-string v6, "\u9632\u64a4\u56de\u5165\u53e3\u5b9a\u4f4d\u5931\u8d25"

    .line 237
    .line 238
    invoke-virtual {p0, v6, v5}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 239
    .line 240
    .line 241
    sget-object v6, Ltf/t;->g:Ltf/t;

    .line 242
    .line 243
    :goto_8
    check-cast v6, Ljava/util/List;

    .line 244
    .line 245
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 246
    .line 247
    .line 248
    move-result-object v5

    .line 249
    :goto_9
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 250
    .line 251
    .line 252
    move-result v6

    .line 253
    if-eqz v6, :cond_b

    .line 254
    .line 255
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v6

    .line 259
    check-cast v6, Ls8/a;

    .line 260
    .line 261
    iget-object v7, v6, Ls8/a;->a:Ljava/lang/reflect/Method;

    .line 262
    .line 263
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v7

    .line 267
    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    goto :goto_9

    .line 271
    :cond_b
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 272
    .line 273
    .line 274
    move-result v5

    .line 275
    if-nez v5, :cond_d

    .line 276
    .line 277
    :goto_a
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    check-cast v1, Ljava/lang/Iterable;

    .line 285
    .line 286
    new-instance v3, Ljava/util/ArrayList;

    .line 287
    .line 288
    invoke-static {v1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 289
    .line 290
    .line 291
    move-result v4

    .line 292
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 293
    .line 294
    .line 295
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 300
    .line 301
    .line 302
    move-result v4

    .line 303
    if-eqz v4, :cond_c

    .line 304
    .line 305
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v4

    .line 309
    check-cast v4, Ls8/a;

    .line 310
    .line 311
    iget-object v4, v4, Ls8/a;->a:Ljava/lang/reflect/Method;

    .line 312
    .line 313
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    goto :goto_b

    .line 317
    :cond_c
    invoke-virtual {p0, p1, v0, v3}, Ls8/c;->O(Lr8/g;Ljava/lang/String;Ljava/util/List;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 321
    .line 322
    .line 323
    move-result-object p1

    .line 324
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    check-cast p1, Ljava/lang/Iterable;

    .line 328
    .line 329
    invoke-static {p1}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 330
    .line 331
    .line 332
    move-result-object p1

    .line 333
    return-object p1

    .line 334
    :cond_d
    add-int/lit8 v4, v4, 0x1

    .line 335
    .line 336
    goto/16 :goto_3
.end method

.method public final F(J)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-gtz v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object p2, p0, Ls8/c;->g:Ljava/util/Set;

    .line 13
    .line 14
    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    invoke-interface {p2}, Ljava/util/Set;->size()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    const/16 v0, 0x3e8

    .line 22
    .line 23
    if-le p1, v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-object p1, p2

    .line 29
    check-cast p1, Ljava/lang/Iterable;

    .line 30
    .line 31
    invoke-interface {p2}, Ljava/util/Set;->size()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    sub-int/2addr v1, v0

    .line 36
    invoke-static {v1, p1}, Ltf/m;->L1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Ljava/lang/Long;

    .line 55
    .line 56
    invoke-interface {p2, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    :goto_1
    return-void
.end method

.method public final N(Lh/Hchat/hooks/api/model/WeChatMessage;)V
    .locals 4

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p1, Lh/Hchat/hooks/api/model/WeChatMessage;->talker:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-wide v0, p1, Lh/Hchat/hooks/api/model/WeChatMessage;->msgSvrId:J

    .line 12
    .line 13
    const-wide/16 v2, 0x0

    .line 14
    .line 15
    cmp-long v0, v0, v2

    .line 16
    .line 17
    if-lez v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatMessage;->isRecalled()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    iget-object v0, p1, Lh/Hchat/hooks/api/model/WeChatMessage;->talker:Ljava/lang/String;

    .line 27
    .line 28
    iget-wide v1, p1, Lh/Hchat/hooks/api/model/WeChatMessage;->msgSvrId:J

    .line 29
    .line 30
    new-instance v3, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v0, ":"

    .line 39
    .line 40
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iget-object v1, p0, Ls8/c;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 51
    .line 52
    invoke-virtual {v1, v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    const/16 v0, 0x3e8

    .line 60
    .line 61
    if-le p1, v0, :cond_1

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    check-cast p1, Ljava/lang/Iterable;

    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    sub-int/2addr v2, v0

    .line 77
    invoke-static {v2, p1}, Ltf/m;->L1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_1

    .line 90
    .line 91
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    check-cast v0, Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_1
    :goto_1
    return-void
.end method

.method public final O(Lr8/g;Ljava/lang/String;Ljava/util/List;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ls8/c;->i:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    invoke-static {p1}, Ls8/c;->J(Lr8/g;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string p3, "cache.key"

    .line 16
    .line 17
    :try_start_0
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, ""

    .line 22
    .line 23
    invoke-interface {v0, p3, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {v0, p3, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-interface {v1, p2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_1
    sget-object v1, Le8/b;->a:Le8/b;

    .line 49
    .line 50
    invoke-static {p1}, Ls8/c;->J(Lr8/g;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {v1, v0, p1, p2, p3}, Le8/b;->j(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 55
    .line 56
    .line 57
    :catchall_0
    :cond_2
    return-void
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "anti_recall"

    .line 2
    .line 3
    return-object v0
.end method

.method public final f(Lr8/g;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p1, Ls8/d;

    .line 5
    .line 6
    const-string v0, "\u4fdd\u7559\u88ab\u64a4\u56de\u7684\u6d88\u606f"

    .line 7
    .line 8
    const-string v1, "practical"

    .line 9
    .line 10
    const-string v2, "anti_recall"

    .line 11
    .line 12
    const-string v3, "\u9632\u64a4\u56de"

    .line 13
    .line 14
    invoke-direct {p1, v2, v3, v0, v1}, Lvb/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lr8/a;->h(Lvb/a;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final g(Lr8/g;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lr8/g;->a:Landroid/content/Context;

    .line 5
    .line 6
    const-string v1, "Hchat_anti_recall_method_cache"

    .line 7
    .line 8
    invoke-static {v0, v1}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Ls8/c;->i:Landroid/content/SharedPreferences;

    .line 13
    .line 14
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->messageEvents()Lk8/k;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    new-instance v2, Lq9/a;

    .line 22
    .line 23
    const/4 v3, 0x5

    .line 24
    invoke-direct {v2, p0, v3}, Lq9/a;-><init>(Ljava/lang/Object;I)V

    .line 25
    .line 26
    .line 27
    iget-object v0, v0, Lk8/k;->d:Lf8/c;

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    const-class v3, Lf8/g;

    .line 32
    .line 33
    invoke-virtual {v0, v3, v2}, Lf8/c;->c(Ljava/lang/Class;Lf8/d;)Lf8/b;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move-object v0, v1

    .line 39
    :goto_0
    invoke-virtual {p0, v0}, Lr8/a;->j(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->messageChanges()Lk8/i;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    new-instance v2, Lk8/m;

    .line 49
    .line 50
    const/4 v3, 0x2

    .line 51
    invoke-direct {v2, p0, v3}, Lk8/m;-><init>(Ljava/lang/Object;I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v2}, Lk8/i;->e(Lk8/h;)La2/a;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    goto :goto_1

    .line 59
    :cond_1
    move-object v0, v1

    .line 60
    :goto_1
    invoke-virtual {p0, v0}, Lr8/a;->j(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    const-string v0, "com.tencent.wcdb.database.SQLiteDatabase"

    .line 64
    .line 65
    invoke-virtual {p0, v0, p1}, Ls8/c;->n(Ljava/lang/String;Lr8/g;)V

    .line 66
    .line 67
    .line 68
    const-string v0, "android.database.sqlite.SQLiteDatabase"

    .line 69
    .line 70
    invoke-virtual {p0, v0, p1}, Ls8/c;->n(Ljava/lang/String;Lr8/g;)V

    .line 71
    .line 72
    .line 73
    new-instance v0, Laa/c;

    .line 74
    .line 75
    const/16 v2, 0x1d

    .line 76
    .line 77
    invoke-direct {v0, p0, v2, p1}, Laa/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    const/16 v2, 0xc

    .line 81
    .line 82
    const-string v3, "anti_recall"

    .line 83
    .line 84
    const-string v4, "\u9632\u64a4\u56de"

    .line 85
    .line 86
    invoke-static {v2, v0, v3, v4, v1}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 87
    .line 88
    .line 89
    new-instance v0, Le9/a;

    .line 90
    .line 91
    const/4 v1, 0x7

    .line 92
    invoke-direct {v0, p0, v1, p1}, Le9/a;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    const-class p1, Lf8/e;

    .line 96
    .line 97
    invoke-virtual {p0, p1, v0}, Lr8/a;->i(Ljava/lang/Class;Lf8/d;)V

    .line 98
    .line 99
    .line 100
    return-void
.end method

.method public final n(Ljava/lang/String;Lr8/g;)V
    .locals 6

    .line 1
    iget-object v0, p2, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_4

    .line 8
    .line 9
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_4

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Ljava/lang/reflect/Method;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 34
    .line 35
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    const-string v2, "update"

    .line 47
    .line 48
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-nez v1, :cond_2

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    const-string v2, "updateWithOnConflict"

    .line 59
    .line 60
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-nez v1, :cond_2

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    array-length v2, v1

    .line 75
    const/4 v3, 0x0

    .line 76
    :goto_1
    if-ge v3, v2, :cond_0

    .line 77
    .line 78
    aget-object v4, v1, v3

    .line 79
    .line 80
    const-class v5, Landroid/content/ContentValues;

    .line 81
    .line 82
    invoke-virtual {v5, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    if-eqz v4, :cond_3

    .line 87
    .line 88
    sget-object v1, Lr8/i;->b:Lr8/i;

    .line 89
    .line 90
    new-instance v2, Ls8/b;

    .line 91
    .line 92
    const/4 v3, 0x0

    .line 93
    invoke-direct {v2, p0, p2, v3}, Ls8/b;-><init>(Ls8/c;Lr8/g;I)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, v0, v2}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_4
    return-void
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "\u9632\u64a4\u56de"

    .line 2
    .line 3
    return-object v0
.end method

.method public final p(Lr8/g;)V
    .locals 8

    .line 1
    iget-boolean v0, p0, Ls8/c;->m:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string v0, "legacy_self_recall_media_cleanup"

    .line 7
    .line 8
    invoke-virtual {p0, v0, p1}, Ls8/c;->D(Ljava/lang/String;Lr8/g;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_2

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    move-object v4, v3

    .line 32
    check-cast v4, Ljava/lang/reflect/Method;

    .line 33
    .line 34
    invoke-static {v4}, Ls8/c;->s(Ljava/lang/reflect/Method;)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_1

    .line 39
    .line 40
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    const/4 v3, 0x0

    .line 49
    if-nez v1, :cond_3

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_3
    move-object v2, v3

    .line 53
    :goto_1
    if-eqz v2, :cond_4

    .line 54
    .line 55
    goto/16 :goto_a

    .line 56
    .line 57
    :cond_4
    :try_start_0
    iget-object v1, p1, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 58
    .line 59
    new-instance v2, Lch/e;

    .line 60
    .line 61
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 62
    .line 63
    .line 64
    new-instance v4, Lfh/k;

    .line 65
    .line 66
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 67
    .line 68
    .line 69
    const-string v5, "MicroMsg.NetSceneRevokeMsg"

    .line 70
    .line 71
    const-string v6, "[oneliang][doSceneEnd.revokeMsg]"

    .line 72
    .line 73
    const-string v7, "cannot find the msg:%d after revoke."

    .line 74
    .line 75
    filled-new-array {v5, v6, v7}, [Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    invoke-static {v5}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    invoke-static {v4, v5}, Lfh/k;->u0(Lfh/k;Ljava/util/Collection;)V

    .line 84
    .line 85
    .line 86
    iput-object v4, v2, Lch/e;->h:Lfh/k;

    .line 87
    .line 88
    invoke-virtual {v1, v2}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    new-instance v2, Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    if-eqz v4, :cond_8

    .line 106
    .line 107
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    check-cast v4, Lhh/o;

    .line 112
    .line 113
    invoke-virtual {v4}, Lhh/o;->q()Lhh/p;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    new-instance v5, Ljava/util/ArrayList;

    .line 118
    .line 119
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    :cond_5
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 127
    .line 128
    .line 129
    move-result v6

    .line 130
    if-eqz v6, :cond_7

    .line 131
    .line 132
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v6

    .line 136
    check-cast v6, Lhh/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 137
    .line 138
    :try_start_1
    iget-object v7, p1, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 139
    .line 140
    invoke-virtual {v6, v7}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 141
    .line 142
    .line 143
    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 144
    goto :goto_4

    .line 145
    :catchall_0
    move-exception v6

    .line 146
    :try_start_2
    new-instance v7, Lsf/f;

    .line 147
    .line 148
    invoke-direct {v7, v6}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 149
    .line 150
    .line 151
    move-object v6, v7

    .line 152
    :goto_4
    nop

    .line 153
    instance-of v7, v6, Lsf/f;

    .line 154
    .line 155
    if-eqz v7, :cond_6

    .line 156
    .line 157
    move-object v6, v3

    .line 158
    :cond_6
    check-cast v6, Ljava/lang/reflect/Method;

    .line 159
    .line 160
    if-eqz v6, :cond_5

    .line 161
    .line 162
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    goto :goto_3

    .line 166
    :catchall_1
    move-exception v0

    .line 167
    goto :goto_7

    .line 168
    :cond_7
    invoke-static {v2, v5}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 169
    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_8
    new-instance v1, Ljava/util/ArrayList;

    .line 173
    .line 174
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    :cond_9
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    if-eqz v3, :cond_a

    .line 186
    .line 187
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    move-object v4, v3

    .line 192
    check-cast v4, Ljava/lang/reflect/Method;

    .line 193
    .line 194
    invoke-static {v4}, Ls8/c;->s(Ljava/lang/reflect/Method;)Z

    .line 195
    .line 196
    .line 197
    move-result v4

    .line 198
    if-eqz v4, :cond_9

    .line 199
    .line 200
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    goto :goto_5

    .line 204
    :cond_a
    new-instance v2, Ljava/util/HashSet;

    .line 205
    .line 206
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 207
    .line 208
    .line 209
    new-instance v3, Ljava/util/ArrayList;

    .line 210
    .line 211
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    :cond_b
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 219
    .line 220
    .line 221
    move-result v4

    .line 222
    if-eqz v4, :cond_c

    .line 223
    .line 224
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v4

    .line 228
    move-object v5, v4

    .line 229
    check-cast v5, Ljava/lang/reflect/Method;

    .line 230
    .line 231
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v5

    .line 235
    invoke-virtual {v2, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v5

    .line 239
    if-eqz v5, :cond_b

    .line 240
    .line 241
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    goto :goto_6

    .line 245
    :cond_c
    invoke-virtual {p0, p1, v0, v3}, Ls8/c;->O(Lr8/g;Ljava/lang/String;Ljava/util/List;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 246
    .line 247
    .line 248
    goto :goto_8

    .line 249
    :goto_7
    new-instance v3, Lsf/f;

    .line 250
    .line 251
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 252
    .line 253
    .line 254
    :goto_8
    invoke-static {v3}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    if-nez v0, :cond_d

    .line 259
    .line 260
    goto :goto_9

    .line 261
    :cond_d
    const-string v1, "\u5b9a\u4f4d\u65e7\u7248\u81ea\u5df1\u64a4\u56de\u5a92\u4f53\u6e05\u7406\u65b9\u6cd5\u5931\u8d25"

    .line 262
    .line 263
    invoke-virtual {p0, v1, v0}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 264
    .line 265
    .line 266
    sget-object v3, Ltf/t;->g:Ltf/t;

    .line 267
    .line 268
    :goto_9
    move-object v2, v3

    .line 269
    check-cast v2, Ljava/util/List;

    .line 270
    .line 271
    :goto_a
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    const/4 v1, 0x0

    .line 276
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 277
    .line 278
    .line 279
    move-result v2

    .line 280
    if-eqz v2, :cond_e

    .line 281
    .line 282
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    check-cast v2, Ljava/lang/reflect/Method;

    .line 287
    .line 288
    :try_start_3
    sget-object v3, Lr8/i;->b:Lr8/i;

    .line 289
    .line 290
    new-instance v4, Ls8/b;

    .line 291
    .line 292
    const/4 v5, 0x2

    .line 293
    invoke-direct {v4, p0, p1, v5}, Ls8/b;-><init>(Ls8/c;Lr8/g;I)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v3, v2, v4}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 297
    .line 298
    .line 299
    const/4 v1, 0x1

    .line 300
    goto :goto_b

    .line 301
    :catchall_2
    move-exception v2

    .line 302
    const-string v3, "\u65e7\u7248\u81ea\u5df1\u64a4\u56de\u5a92\u4f53\u6e05\u7406Hook\u5b89\u88c5\u5931\u8d25"

    .line 303
    .line 304
    invoke-virtual {p0, v3, v2}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 305
    .line 306
    .line 307
    goto :goto_b

    .line 308
    :cond_e
    iput-boolean v1, p0, Ls8/c;->m:Z

    .line 309
    .line 310
    return-void
.end method

.method public final q(Lr8/g;Ljava/util/List;)V
    .locals 10

    .line 1
    iget-boolean v0, p0, Ls8/c;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_d

    .line 6
    .line 7
    :cond_0
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 8
    .line 9
    const-string v1, "message_storage_update"

    .line 10
    .line 11
    invoke-virtual {p0, v1, p1}, Ls8/c;->D(Ljava/lang/String;Lr8/g;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    new-instance v3, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-eqz v4, :cond_2

    .line 29
    .line 30
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    move-object v5, v4

    .line 35
    check-cast v5, Ljava/lang/reflect/Method;

    .line 36
    .line 37
    invoke-static {v5}, Ls8/c;->t(Ljava/lang/reflect/Method;)Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-eqz v5, :cond_1

    .line 42
    .line 43
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    const/4 v4, 0x0

    .line 52
    if-nez v2, :cond_3

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    move-object v3, v4

    .line 56
    :goto_1
    const/4 v2, 0x0

    .line 57
    const/4 v5, 0x1

    .line 58
    if-eqz v3, :cond_4

    .line 59
    .line 60
    goto/16 :goto_b

    .line 61
    .line 62
    :cond_4
    new-instance v3, Ljava/util/LinkedHashSet;

    .line 63
    .line 64
    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    :cond_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    if-eqz v7, :cond_9

    .line 76
    .line 77
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    check-cast v7, Ls8/a;

    .line 82
    .line 83
    iget-object v7, v7, Ls8/a;->b:Lhh/o;

    .line 84
    .line 85
    if-eqz v7, :cond_5

    .line 86
    .line 87
    :try_start_0
    invoke-virtual {v7}, Lhh/o;->q()Lhh/p;

    .line 88
    .line 89
    .line 90
    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    goto :goto_2

    .line 92
    :catchall_0
    move-exception v7

    .line 93
    new-instance v8, Lsf/f;

    .line 94
    .line 95
    invoke-direct {v8, v7}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 96
    .line 97
    .line 98
    move-object v7, v8

    .line 99
    :goto_2
    nop

    .line 100
    instance-of v8, v7, Lsf/f;

    .line 101
    .line 102
    if-eqz v8, :cond_6

    .line 103
    .line 104
    move-object v7, v0

    .line 105
    :cond_6
    check-cast v7, Ljava/util/List;

    .line 106
    .line 107
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    :cond_7
    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v8

    .line 115
    if-eqz v8, :cond_5

    .line 116
    .line 117
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v8

    .line 121
    check-cast v8, Lhh/o;

    .line 122
    .line 123
    :try_start_1
    iget-object v9, p1, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 124
    .line 125
    invoke-virtual {v8, v9}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 126
    .line 127
    .line 128
    move-result-object v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 129
    goto :goto_4

    .line 130
    :catchall_1
    move-exception v8

    .line 131
    new-instance v9, Lsf/f;

    .line 132
    .line 133
    invoke-direct {v9, v8}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 134
    .line 135
    .line 136
    move-object v8, v9

    .line 137
    :goto_4
    nop

    .line 138
    instance-of v9, v8, Lsf/f;

    .line 139
    .line 140
    if-eqz v9, :cond_8

    .line 141
    .line 142
    move-object v8, v4

    .line 143
    :cond_8
    check-cast v8, Ljava/lang/reflect/Method;

    .line 144
    .line 145
    if-eqz v8, :cond_7

    .line 146
    .line 147
    invoke-static {v8}, Ls8/c;->t(Ljava/lang/reflect/Method;)Z

    .line 148
    .line 149
    .line 150
    move-result v9

    .line 151
    if-eqz v9, :cond_7

    .line 152
    .line 153
    invoke-virtual {v3, v8}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_9
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 158
    .line 159
    .line 160
    move-result v6

    .line 161
    if-nez v6, :cond_a

    .line 162
    .line 163
    invoke-static {v3}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 164
    .line 165
    .line 166
    move-result-object p2

    .line 167
    move-object v3, p2

    .line 168
    goto/16 :goto_a

    .line 169
    .line 170
    :cond_a
    new-instance v3, Ljava/util/ArrayList;

    .line 171
    .line 172
    invoke-static {p2}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 173
    .line 174
    .line 175
    move-result v6

    .line 176
    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 177
    .line 178
    .line 179
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 180
    .line 181
    .line 182
    move-result-object p2

    .line 183
    :goto_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 184
    .line 185
    .line 186
    move-result v6

    .line 187
    if-eqz v6, :cond_b

    .line 188
    .line 189
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v6

    .line 193
    check-cast v6, Ls8/a;

    .line 194
    .line 195
    iget-object v6, v6, Ls8/a;->a:Ljava/lang/reflect/Method;

    .line 196
    .line 197
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    goto :goto_5

    .line 201
    :cond_b
    invoke-static {v3}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object p2

    .line 205
    check-cast p2, Ljava/lang/reflect/Method;

    .line 206
    .line 207
    if-eqz p2, :cond_c

    .line 208
    .line 209
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    move-result-object p2

    .line 213
    if-eqz p2, :cond_c

    .line 214
    .line 215
    invoke-virtual {p2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 216
    .line 217
    .line 218
    move-result-object p2

    .line 219
    if-eqz p2, :cond_c

    .line 220
    .line 221
    goto :goto_6

    .line 222
    :cond_c
    iget-object p2, p1, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 223
    .line 224
    :goto_6
    :try_start_2
    const-string v3, "com.tencent.mm.storage.m9"

    .line 225
    .line 226
    invoke-virtual {p2, v3}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 230
    goto :goto_7

    .line 231
    :catchall_2
    move-exception v3

    .line 232
    new-instance v6, Lsf/f;

    .line 233
    .line 234
    invoke-direct {v6, v3}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 235
    .line 236
    .line 237
    move-object v3, v6

    .line 238
    :goto_7
    nop

    .line 239
    instance-of v6, v3, Lsf/f;

    .line 240
    .line 241
    if-eqz v6, :cond_d

    .line 242
    .line 243
    move-object v3, v4

    .line 244
    :cond_d
    check-cast v3, Ljava/lang/Class;

    .line 245
    .line 246
    if-eqz v3, :cond_11

    .line 247
    .line 248
    :try_start_3
    const-string v6, "com.tencent.mm.storage.k9"

    .line 249
    .line 250
    invoke-virtual {p2, v6}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    move-result-object p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 254
    goto :goto_8

    .line 255
    :catchall_3
    move-exception p2

    .line 256
    new-instance v6, Lsf/f;

    .line 257
    .line 258
    invoke-direct {v6, p2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 259
    .line 260
    .line 261
    move-object p2, v6

    .line 262
    :goto_8
    nop

    .line 263
    instance-of v6, p2, Lsf/f;

    .line 264
    .line 265
    if-eqz v6, :cond_e

    .line 266
    .line 267
    move-object p2, v4

    .line 268
    :cond_e
    check-cast p2, Ljava/lang/Class;

    .line 269
    .line 270
    if-eqz p2, :cond_11

    .line 271
    .line 272
    invoke-static {v3}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    new-instance v3, Ljava/util/ArrayList;

    .line 277
    .line 278
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 279
    .line 280
    .line 281
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    :cond_f
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 286
    .line 287
    .line 288
    move-result v6

    .line 289
    if-eqz v6, :cond_10

    .line 290
    .line 291
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v6

    .line 295
    move-object v7, v6

    .line 296
    check-cast v7, Ljava/lang/reflect/Method;

    .line 297
    .line 298
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    move-result-object v8

    .line 302
    array-length v8, v8

    .line 303
    const/4 v9, 0x2

    .line 304
    if-ne v8, v9, :cond_f

    .line 305
    .line 306
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    move-result-object v8

    .line 310
    aget-object v8, v8, v2

    .line 311
    .line 312
    sget-object v9, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 313
    .line 314
    invoke-static {v8, v9}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 315
    .line 316
    .line 317
    move-result v8

    .line 318
    if-eqz v8, :cond_f

    .line 319
    .line 320
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    move-result-object v7

    .line 324
    aget-object v7, v7, v5

    .line 325
    .line 326
    invoke-static {v7, p2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result v7

    .line 330
    if-eqz v7, :cond_f

    .line 331
    .line 332
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    goto :goto_9

    .line 336
    :cond_10
    move-object v0, v3

    .line 337
    :cond_11
    move-object v3, v0

    .line 338
    :goto_a
    invoke-virtual {p0, p1, v1, v3}, Ls8/c;->O(Lr8/g;Ljava/lang/String;Ljava/util/List;)V

    .line 339
    .line 340
    .line 341
    :goto_b
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 342
    .line 343
    .line 344
    move-result-object p2

    .line 345
    :goto_c
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 346
    .line 347
    .line 348
    move-result v0

    .line 349
    if-eqz v0, :cond_12

    .line 350
    .line 351
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    check-cast v0, Ljava/lang/reflect/Method;

    .line 356
    .line 357
    :try_start_4
    sget-object v1, Lr8/i;->b:Lr8/i;

    .line 358
    .line 359
    new-instance v6, Laa/d;

    .line 360
    .line 361
    invoke-direct {v6, p0, p1, v0}, Laa/d;-><init>(Ls8/c;Lr8/g;Ljava/lang/reflect/Method;)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v1, v0, v6}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 365
    .line 366
    .line 367
    move v2, v5

    .line 368
    goto :goto_c

    .line 369
    :catchall_4
    move-exception v0

    .line 370
    const-string v1, "\u81ea\u5df1\u64a4\u56de\u6d88\u606f\u5b58\u50a8Hook\u5b89\u88c5\u5931\u8d25"

    .line 371
    .line 372
    invoke-virtual {p0, v1, v0}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 373
    .line 374
    .line 375
    goto :goto_c

    .line 376
    :cond_12
    iput-boolean v2, p0, Ls8/c;->k:Z

    .line 377
    .line 378
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 379
    .line 380
    .line 381
    move-result p1

    .line 382
    if-eqz p1, :cond_13

    .line 383
    .line 384
    const-string p1, "\u81ea\u5df1\u64a4\u56de\u6d88\u606f\u5b58\u50a8Hook\u672a\u627e\u5230"

    .line 385
    .line 386
    invoke-virtual {p0, p1, v4}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 387
    .line 388
    .line 389
    :cond_13
    :goto_d
    return-void
.end method

.method public final r(Lr8/g;)V
    .locals 8

    .line 1
    iget-boolean v0, p0, Ls8/c;->l:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string v0, "msg_processing_clear"

    .line 7
    .line 8
    invoke-virtual {p0, v0, p1}, Ls8/c;->D(Ljava/lang/String;Lr8/g;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_3

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    move-object v4, v3

    .line 32
    check-cast v4, Ljava/lang/reflect/Method;

    .line 33
    .line 34
    invoke-static {v4}, Ls8/c;->w(Ljava/lang/reflect/Method;)Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-nez v5, :cond_2

    .line 39
    .line 40
    invoke-static {v4}, Ls8/c;->v(Ljava/lang/reflect/Method;)Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-eqz v4, :cond_1

    .line 45
    .line 46
    :cond_2
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_4

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_4
    const/4 v2, 0x0

    .line 58
    :goto_1
    if-eqz v2, :cond_5

    .line 59
    .line 60
    goto/16 :goto_9

    .line 61
    .line 62
    :cond_5
    :try_start_0
    iget-object v1, p1, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 63
    .line 64
    new-instance v2, Lch/e;

    .line 65
    .line 66
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 67
    .line 68
    .line 69
    new-instance v3, Lfh/k;

    .line 70
    .line 71
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 72
    .line 73
    .line 74
    const-string v4, "MicroMsg.MsgProcessingManager"

    .line 75
    .line 76
    const-string v5, "chris: can not parse from mmkv data!"

    .line 77
    .line 78
    filled-new-array {v4, v5}, [Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-static {v4}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    invoke-static {v3, v4}, Lfh/k;->u0(Lfh/k;Ljava/util/Collection;)V

    .line 87
    .line 88
    .line 89
    iput-object v3, v2, Lch/e;->h:Lfh/k;

    .line 90
    .line 91
    invoke-virtual {v1, v2}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    new-instance v2, Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    if-eqz v3, :cond_9

    .line 109
    .line 110
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    check-cast v3, Lhh/o;

    .line 115
    .line 116
    iget-object v4, p1, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 117
    .line 118
    invoke-virtual {v3, v4}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-static {v3}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    new-instance v4, Ljava/util/ArrayList;

    .line 131
    .line 132
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 133
    .line 134
    .line 135
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    :cond_6
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v5

    .line 143
    if-eqz v5, :cond_8

    .line 144
    .line 145
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    move-object v6, v5

    .line 150
    check-cast v6, Ljava/lang/reflect/Method;

    .line 151
    .line 152
    invoke-static {v6}, Ls8/c;->w(Ljava/lang/reflect/Method;)Z

    .line 153
    .line 154
    .line 155
    move-result v7

    .line 156
    if-nez v7, :cond_7

    .line 157
    .line 158
    invoke-static {v6}, Ls8/c;->v(Ljava/lang/reflect/Method;)Z

    .line 159
    .line 160
    .line 161
    move-result v6

    .line 162
    if-eqz v6, :cond_6

    .line 163
    .line 164
    goto :goto_4

    .line 165
    :catchall_0
    move-exception v0

    .line 166
    goto :goto_6

    .line 167
    :cond_7
    :goto_4
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_8
    invoke-static {v2, v4}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 172
    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_9
    new-instance v1, Ljava/util/HashSet;

    .line 176
    .line 177
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 178
    .line 179
    .line 180
    new-instance v3, Ljava/util/ArrayList;

    .line 181
    .line 182
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    :cond_a
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 190
    .line 191
    .line 192
    move-result v4

    .line 193
    if-eqz v4, :cond_b

    .line 194
    .line 195
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    move-object v5, v4

    .line 200
    check-cast v5, Ljava/lang/reflect/Method;

    .line 201
    .line 202
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v5

    .line 206
    invoke-virtual {v1, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result v5

    .line 210
    if-eqz v5, :cond_a

    .line 211
    .line 212
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    goto :goto_5

    .line 216
    :cond_b
    invoke-virtual {p0, p1, v0, v3}, Ls8/c;->O(Lr8/g;Ljava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 217
    .line 218
    .line 219
    goto :goto_7

    .line 220
    :goto_6
    new-instance v3, Lsf/f;

    .line 221
    .line 222
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 223
    .line 224
    .line 225
    :goto_7
    invoke-static {v3}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    if-nez v0, :cond_c

    .line 230
    .line 231
    goto :goto_8

    .line 232
    :cond_c
    const-string v1, "\u5b9a\u4f4d\u5a92\u4f53\u5904\u7406\u4fe1\u606f\u6e05\u7406\u65b9\u6cd5\u5931\u8d25"

    .line 233
    .line 234
    invoke-virtual {p0, v1, v0}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 235
    .line 236
    .line 237
    sget-object v3, Ltf/t;->g:Ltf/t;

    .line 238
    .line 239
    :goto_8
    move-object v2, v3

    .line 240
    check-cast v2, Ljava/util/List;

    .line 241
    .line 242
    :goto_9
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    const/4 v1, 0x0

    .line 247
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 248
    .line 249
    .line 250
    move-result v2

    .line 251
    if-eqz v2, :cond_d

    .line 252
    .line 253
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    check-cast v2, Ljava/lang/reflect/Method;

    .line 258
    .line 259
    :try_start_1
    sget-object v3, Lr8/i;->b:Lr8/i;

    .line 260
    .line 261
    new-instance v4, Ls8/b;

    .line 262
    .line 263
    const/4 v5, 0x3

    .line 264
    invoke-direct {v4, p0, p1, v5}, Ls8/b;-><init>(Ls8/c;Lr8/g;I)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v3, v2, v4}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 268
    .line 269
    .line 270
    const/4 v1, 0x1

    .line 271
    goto :goto_a

    .line 272
    :catchall_1
    move-exception v2

    .line 273
    const-string v3, "\u5a92\u4f53\u5904\u7406\u4fe1\u606f\u6e05\u7406Hook\u5b89\u88c5\u5931\u8d25"

    .line 274
    .line 275
    invoke-virtual {p0, v3, v2}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 276
    .line 277
    .line 278
    goto :goto_a

    .line 279
    :cond_d
    iput-boolean v1, p0, Ls8/c;->l:Z

    .line 280
    .line 281
    return-void
.end method
