.class public final Lf9/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lr8/g;

.field public final b:Lab/b;

.field public final c:Ljava/util/Set;

.field public final d:Ljava/util/Map;

.field public final e:Ljava/util/concurrent/ConcurrentHashMap;

.field public final f:Ljava/util/concurrent/ConcurrentHashMap;

.field public final g:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method public constructor <init>(Lr8/g;Lab/b;)V
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
    iput-object p1, p0, Lf9/e;->a:Lr8/g;

    .line 8
    .line 9
    iput-object p2, p0, Lf9/e;->b:Lab/b;

    .line 10
    .line 11
    invoke-static {}, Lj8/b;->o()Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lf9/e;->c:Ljava/util/Set;

    .line 16
    .line 17
    invoke-static {}, Lp/a;->p()Ljava/util/Map;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lf9/e;->d:Ljava/util/Map;

    .line 22
    .line 23
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lf9/e;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 29
    .line 30
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 31
    .line 32
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lf9/e;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 36
    .line 37
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 38
    .line 39
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Lf9/e;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 43
    .line 44
    return-void
.end method

.method public static a(Ljava/lang/Object;)Landroid/view/MenuItem;
    .locals 2

    .line 1
    const v0, 0x48434544    # 199957.06f

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "findItem"

    .line 13
    .line 14
    invoke-static {p0, v1, v0}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    instance-of v0, p0, Landroid/view/MenuItem;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    check-cast p0, Landroid/view/MenuItem;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    return-object p0
.end method

.method public static d(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 2

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->currentActivity()Lq8/o;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-eqz p0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Lq8/o;->a()Landroid/app/Activity;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    goto :goto_0

    .line 15
    :cond_1
    const/4 p0, 0x0

    .line 16
    :goto_0
    if-eqz p0, :cond_2

    .line 17
    .line 18
    new-instance v0, Lc9/t;

    .line 19
    .line 20
    const/4 v1, 0x4

    .line 21
    invoke-direct {v0, p0, p1, v1}, Lc9/t;-><init>(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 25
    .line 26
    .line 27
    :cond_2
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/reflect/Method;Z)Z
    .locals 4

    .line 1
    new-instance v0, Lf9/d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p2, p0, v1}, Lf9/d;-><init>(ZLjava/lang/Object;I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    invoke-static {p2}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    if-nez p2, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-virtual {p2}, Ljava/lang/Class;->isInterface()Z

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-nez p2, :cond_1

    .line 26
    .line 27
    iget-object p2, p0, Lf9/e;->c:Ljava/util/Set;

    .line 28
    .line 29
    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    const/4 v3, 0x1

    .line 34
    if-nez v2, :cond_0

    .line 35
    .line 36
    return v3

    .line 37
    :cond_0
    :try_start_0
    sget-object v2, Lr8/i;->b:Lr8/i;

    .line 38
    .line 39
    invoke-virtual {v2, p1, v0}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    return v3

    .line 43
    :catchall_0
    move-exception v0

    .line 44
    invoke-interface {p2, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    new-instance p2, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    const-string v2, "\u4fee\u6539\u804a\u5929\u8bb0\u5f55Hook\u5b89\u88c5\u5931\u8d25: "

    .line 54
    .line 55
    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iget-object p2, p0, Lf9/e;->b:Lab/b;

    .line 66
    .line 67
    invoke-virtual {p2, p1, v0}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    :cond_1
    return v1
.end method

.method public final c(Ljava/lang/Object;)J
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lf9/b;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p1, v2}, Lf9/b;-><init>(Ljava/lang/Object;I)V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Lf9/e;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Ljava/lang/reflect/Method;

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v1}, Lf9/b;->invoke()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    move-object v3, v1

    .line 28
    check-cast v3, Ljava/lang/reflect/Method;

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    invoke-virtual {v2, v0, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move-object v3, v4

    .line 37
    :goto_0
    const/4 v0, 0x0

    .line 38
    if-eqz v3, :cond_3

    .line 39
    .line 40
    new-array v1, v0, [Ljava/lang/Object;

    .line 41
    .line 42
    invoke-static {v3, p1, v1}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    instance-of v2, v1, Ljava/lang/Number;

    .line 47
    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    check-cast v1, Ljava/lang/Number;

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    move-object v1, v4

    .line 54
    :goto_1
    if-eqz v1, :cond_3

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 57
    .line 58
    .line 59
    move-result-wide v0

    .line 60
    return-wide v0

    .line 61
    :cond_3
    const-string v1, "msgId"

    .line 62
    .line 63
    const-string v2, "msgID"

    .line 64
    .line 65
    const-string v3, "field_msgId"

    .line 66
    .line 67
    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    :goto_2
    const/4 v2, 0x3

    .line 72
    if-lt v0, v2, :cond_4

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_4
    aget-object v2, v1, v0

    .line 76
    .line 77
    invoke-static {p1, v2}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    instance-of v3, v2, Ljava/lang/Number;

    .line 82
    .line 83
    if-eqz v3, :cond_6

    .line 84
    .line 85
    move-object v4, v2

    .line 86
    check-cast v4, Ljava/lang/Number;

    .line 87
    .line 88
    :goto_3
    if-eqz v4, :cond_5

    .line 89
    .line 90
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 91
    .line 92
    .line 93
    move-result-wide v0

    .line 94
    return-wide v0

    .line 95
    :cond_5
    const-wide/16 v0, 0x0

    .line 96
    .line 97
    return-wide v0

    .line 98
    :cond_6
    add-int/lit8 v0, v0, 0x1

    .line 99
    .line 100
    goto :goto_2
.end method
