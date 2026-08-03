.class public final Lhb/i0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lr8/g;

.field public final b:Lab/b;

.field public final c:Landroid/os/Handler;

.field public final d:Landroid/content/SharedPreferences;

.field public final e:Ljava/util/Set;

.field public final f:Landroid/content/SharedPreferences;

.field public final g:Lhb/r;

.field public final h:Lhb/c;

.field public final i:Lhb/k;


# direct methods
.method public constructor <init>(Lr8/g;Lab/b;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lhb/i0;->a:Lr8/g;

    .line 8
    .line 9
    iput-object p2, p0, Lhb/i0;->b:Lab/b;

    .line 10
    .line 11
    new-instance v0, Landroid/os/Handler;

    .line 12
    .line 13
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lhb/i0;->c:Landroid/os/Handler;

    .line 21
    .line 22
    iget-object v0, p1, Lr8/g;->a:Landroid/content/Context;

    .line 23
    .line 24
    const-string v1, "Hchat_selected_messages_config"

    .line 25
    .line 26
    invoke-static {v0, v1}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iput-object v1, p0, Lhb/i0;->d:Landroid/content/SharedPreferences;

    .line 31
    .line 32
    invoke-static {}, Lj8/b;->o()Ljava/util/Set;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iput-object v1, p0, Lhb/i0;->e:Ljava/util/Set;

    .line 37
    .line 38
    const-string v1, "Hchat_selected_message_method_cache"

    .line 39
    .line 40
    invoke-static {v0, v1}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iput-object v0, p0, Lhb/i0;->f:Landroid/content/SharedPreferences;

    .line 45
    .line 46
    new-instance v0, Lhb/r;

    .line 47
    .line 48
    invoke-direct {v0, p1, p2}, Lhb/r;-><init>(Lr8/g;Lab/b;)V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, Lhb/i0;->g:Lhb/r;

    .line 52
    .line 53
    new-instance v0, Lhb/c;

    .line 54
    .line 55
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object p2, v0, Lhb/c;->g:Ljava/lang/Object;

    .line 59
    .line 60
    new-instance v1, Landroid/os/Handler;

    .line 61
    .line 62
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 67
    .line 68
    .line 69
    iput-object v1, v0, Lhb/c;->h:Ljava/lang/Object;

    .line 70
    .line 71
    new-instance v1, Lc9/q;

    .line 72
    .line 73
    const/16 v2, 0xf

    .line 74
    .line 75
    invoke-direct {v1, v2}, Lc9/q;-><init>(I)V

    .line 76
    .line 77
    .line 78
    invoke-static {v1}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    iput-object v1, v0, Lhb/c;->i:Ljava/lang/Object;

    .line 83
    .line 84
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 85
    .line 86
    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 87
    .line 88
    .line 89
    iput-object v1, v0, Lhb/c;->j:Ljava/lang/Object;

    .line 90
    .line 91
    iput-object v0, p0, Lhb/i0;->h:Lhb/c;

    .line 92
    .line 93
    new-instance v0, Lhb/k;

    .line 94
    .line 95
    invoke-direct {v0, p1, p2}, Lhb/k;-><init>(Lr8/g;Lab/b;)V

    .line 96
    .line 97
    .line 98
    iput-object v0, p0, Lhb/i0;->i:Lhb/k;

    .line 99
    .line 100
    return-void
.end method

.method public static a(Ljava/lang/Object;Ljava/lang/String;I)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-string v2, "findItem"

    .line 15
    .line 16
    invoke-static {p0, v2, v1}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    filled-new-array {v0, v1, v0, p1}, [Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const-string v2, "add"

    .line 32
    .line 33
    invoke-static {p0, v2, v1}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    filled-new-array {v0, v1, v0, p1}, [Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {p0, v2, v0}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    const-string v1, "f"

    .line 64
    .line 65
    invoke-static {p0, v1, v0}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    if-eqz v0, :cond_3

    .line 70
    .line 71
    :goto_0
    return-void

    .line 72
    :cond_3
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    filled-new-array {p2, p1}, [Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-static {p0, v1, p1}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public static c(Ljava/lang/reflect/Method;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "com.tencent.mm.ui.transmit.MsgRetransmitUI"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 22
    .line 23
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const-class v0, Ljava/lang/String;

    .line 34
    .line 35
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {p0, v0}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-eqz p0, :cond_0

    .line 44
    .line 45
    const/4 p0, 0x1

    .line 46
    return p0

    .line 47
    :cond_0
    const/4 p0, 0x0

    .line 48
    return p0
.end method


# virtual methods
.method public final b(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lhb/i0;->e:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :cond_0
    :try_start_0
    sget-object v1, Lr8/i;->b:Lr8/i;

    .line 12
    .line 13
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->accessible(Ljava/lang/reflect/Method;)Ljava/lang/reflect/Method;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    move-object v2, p1

    .line 21
    :goto_0
    invoke-virtual {v1, v2, p2}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 22
    .line 23
    .line 24
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :catchall_0
    move-exception p2

    .line 28
    new-instance v1, Lsf/f;

    .line 29
    .line 30
    invoke-direct {v1, p2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    move-object p2, v1

    .line 34
    :goto_1
    invoke-static {p2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v2, "\u7fa4\u53d1\u52a9\u624bHook\u5b89\u88c5\u5931\u8d25: "

    .line 50
    .line 51
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iget-object v0, p0, Lhb/i0;->b:Lab/b;

    .line 62
    .line 63
    invoke-virtual {v0, p1, v1}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    :cond_2
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 67
    .line 68
    instance-of v0, p2, Lsf/f;

    .line 69
    .line 70
    if-eqz v0, :cond_3

    .line 71
    .line 72
    move-object p2, p1

    .line 73
    :cond_3
    check-cast p2, Ljava/lang/Boolean;

    .line 74
    .line 75
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    return p1
.end method

.method public final d(Landroid/app/Activity;Lfg/l;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 9

    .line 1
    new-instance v0, Lhb/x;

    .line 2
    .line 3
    move-object v2, p0

    .line 4
    move-object v1, p1

    .line 5
    move-object v3, p2

    .line 6
    move-object v4, p3

    .line 7
    move-object v5, p4

    .line 8
    move v6, p5

    .line 9
    invoke-direct/range {v0 .. v6}, Lhb/x;-><init>(Landroid/app/Activity;Lhb/i0;Lfg/l;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 10
    .line 11
    .line 12
    move v2, v6

    .line 13
    sget-object p1, Lhb/m;->a:Lhb/l;

    .line 14
    .line 15
    invoke-static {v2}, Lhb/m;->a(Z)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lhb/x;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    new-instance v3, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    invoke-direct {v3, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 29
    .line 30
    .line 31
    move-object p2, v4

    .line 32
    new-instance v4, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 33
    .line 34
    invoke-direct {v4, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 35
    .line 36
    .line 37
    new-instance p1, Lc9/h;

    .line 38
    .line 39
    const/4 p3, 0x4

    .line 40
    invoke-direct {p1, v4, v3, p3}, Lc9/h;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicBoolean;I)V

    .line 41
    .line 42
    .line 43
    const-string p3, "\u6b63\u5728\u8f7d\u5165\u8054\u7cfb\u4eba..."

    .line 44
    .line 45
    invoke-static {v1, p1, p2, p3}, Lwb/y2;->X1(Landroid/app/Activity;Lfg/a;Ljava/lang/String;Ljava/lang/String;)Lwb/kv;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    new-instance p1, Ljava/lang/Thread;

    .line 50
    .line 51
    move-object v7, v0

    .line 52
    new-instance v0, Lc9/p;

    .line 53
    .line 54
    const/4 v8, 0x2

    .line 55
    move-object v6, v1

    .line 56
    move-object v1, p0

    .line 57
    invoke-direct/range {v0 .. v8}, Lc9/p;-><init>(Ljava/lang/Object;ZLjava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicBoolean;Lwb/kv;Landroid/app/Activity;Lfg/l;I)V

    .line 58
    .line 59
    .line 60
    const-string p2, "Hchat-SelectedMessageContacts"

    .line 61
    .line 62
    invoke-direct {p1, v0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public final e(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object p1, v0

    .line 12
    :goto_0
    if-eqz p1, :cond_1

    .line 13
    .line 14
    goto :goto_3

    .line 15
    :cond_1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->currentActivity()Lq8/o;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    invoke-virtual {p1}, Lq8/o;->a()Landroid/app/Activity;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    goto :goto_1

    .line 26
    :cond_2
    move-object p1, v0

    .line 27
    :goto_1
    if-eqz p1, :cond_3

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_3
    move-object p1, v0

    .line 31
    :goto_2
    if-eqz p1, :cond_4

    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-nez v1, :cond_4

    .line 38
    .line 39
    move-object v0, p1

    .line 40
    :cond_4
    if-eqz v0, :cond_5

    .line 41
    .line 42
    move-object p1, v0

    .line 43
    :goto_3
    new-instance v0, Lc9/t;

    .line 44
    .line 45
    const/4 v1, 0x6

    .line 46
    invoke-direct {v0, p1, p2, v1}, Lc9/t;-><init>(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lhb/i0;->c:Landroid/os/Handler;

    .line 50
    .line 51
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 52
    .line 53
    .line 54
    :cond_5
    return-void
.end method
