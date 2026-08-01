.class public final Lcom/example/dyhelper/beta/BlacklistVerifier;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lcom/example/dyhelper/beta/BlacklistVerifier;

.field public static final β:Ljava/util/List;

.field public static final γ:Ljava/util/Set;

.field public static final δ:Landroid/os/Handler;

.field public static final ε:Ljava/lang/Object;

.field public static final ζ:Ljava/lang/Object;

.field public static final η:Ljava/util/Set;

.field public static final θ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static volatile ι:Landroid/content/Context;

.field public static volatile κ:Ljava/lang/String;

.field public static λ:Ljava/lang/ref/WeakReference;

.field public static volatile μ:Z

.field public static volatile ν:Ljava/lang/String;

.field public static volatile ξ:Z

.field public static volatile ο:Z

.field public static volatile π:Z

.field public static volatile ρ:Z

.field public static volatile σ:Z

.field public static volatile τ:Ljava/lang/String;

.field public static volatile υ:Z

.field public static volatile φ:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lcom/example/dyhelper/beta/BlacklistVerifier;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/example/dyhelper/beta/BlacklistVerifier;->α:Lcom/example/dyhelper/beta/BlacklistVerifier;

    .line 7
    .line 8
    const-string v0, "https://raw.githubusercontent.com/yyhh73144-max/dyhelperUser/refs/heads/main/blacklist_users.json"

    .line 9
    .line 10
    invoke-static {v0}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lcom/example/dyhelper/beta/BlacklistVerifier;->β:Ljava/util/List;

    .line 15
    .line 16
    const-string v5, "native parse failed"

    .line 17
    .line 18
    const-string v6, "java parse failed"

    .line 19
    .line 20
    const-string v1, "verification abnormal"

    .line 21
    .line 22
    const-string v2, "verification_pending"

    .line 23
    .line 24
    const-string v3, "runtime_untrusted"

    .line 25
    .line 26
    const-string v4, "native unavailable"

    .line 27
    .line 28
    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sput-object v0, Lcom/example/dyhelper/beta/BlacklistVerifier;->γ:Ljava/util/Set;

    .line 37
    .line 38
    new-instance v0, Landroid/os/Handler;

    .line 39
    .line 40
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lcom/example/dyhelper/beta/BlacklistVerifier;->δ:Landroid/os/Handler;

    .line 48
    .line 49
    new-instance v0, Ljava/lang/Object;

    .line 50
    .line 51
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 52
    .line 53
    .line 54
    sput-object v0, Lcom/example/dyhelper/beta/BlacklistVerifier;->ε:Ljava/lang/Object;

    .line 55
    .line 56
    new-instance v0, Ljava/lang/Object;

    .line 57
    .line 58
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    sput-object v0, Lcom/example/dyhelper/beta/BlacklistVerifier;->ζ:Ljava/lang/Object;

    .line 62
    .line 63
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 64
    .line 65
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    sput-object v0, Lcom/example/dyhelper/beta/BlacklistVerifier;->η:Ljava/util/Set;

    .line 73
    .line 74
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 75
    .line 76
    const/4 v1, 0x0

    .line 77
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 78
    .line 79
    .line 80
    sput-object v0, Lcom/example/dyhelper/beta/BlacklistVerifier;->θ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 81
    .line 82
    const-string v0, ""

    .line 83
    .line 84
    sput-object v0, Lcom/example/dyhelper/beta/BlacklistVerifier;->κ:Ljava/lang/String;

    .line 85
    .line 86
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 87
    .line 88
    const/4 v2, 0x0

    .line 89
    invoke-direct {v1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    sput-object v1, Lcom/example/dyhelper/beta/BlacklistVerifier;->λ:Ljava/lang/ref/WeakReference;

    .line 93
    .line 94
    sput-object v0, Lcom/example/dyhelper/beta/BlacklistVerifier;->ν:Ljava/lang/String;

    .line 95
    .line 96
    sput-object v0, Lcom/example/dyhelper/beta/BlacklistVerifier;->τ:Ljava/lang/String;

    .line 97
    .line 98
    sput-object v0, Lcom/example/dyhelper/beta/BlacklistVerifier;->φ:Ljava/lang/String;

    .line 99
    .line 100
    return-void
.end method

.method private final native nativeCheckUidInBlacklist(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method

.method private final native nativeGetReason()Ljava/lang/String;
.end method

.method private final native nativeIsBlocked()Z
.end method

.method private final native nativeSetBlocked(ZLjava/lang/String;)V
.end method

.method private final native nativeStartBlockEnforcer(J)V
.end method

.method public static γ()Z
    .locals 6

    .line 1
    const-string v0, "native library load failed: "

    .line 2
    .line 3
    sget-boolean v1, Lcom/example/dyhelper/beta/BlacklistVerifier;->ρ:Z

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    sget-object v1, Lcom/example/dyhelper/beta/BlacklistVerifier;->ε:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter v1

    .line 12
    :try_start_0
    sget-boolean v3, Lcom/example/dyhelper/beta/BlacklistVerifier;->ρ:Z

    .line 13
    .line 14
    if-eqz v3, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    sget-boolean v3, Lcom/example/dyhelper/beta/BlacklistVerifier;->π:Z

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    if-eqz v3, :cond_2

    .line 21
    .line 22
    move v2, v4

    .line 23
    goto :goto_1

    .line 24
    :cond_2
    sput-boolean v2, Lcom/example/dyhelper/beta/BlacklistVerifier;->π:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 25
    .line 26
    :try_start_1
    const-string v3, "blacklist_verify"

    .line 27
    .line 28
    invoke-static {v3}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception v2

    .line 33
    :try_start_2
    const-string v3, "rc2b948eb05c3593c"

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    new-instance v5, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const/4 v2, 0x4

    .line 52
    const/4 v5, 0x0

    .line 53
    invoke-static {v3, v0, v5, v2, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    move v2, v4

    .line 57
    :goto_0
    sput-boolean v2, Lcom/example/dyhelper/beta/BlacklistVerifier;->ρ:Z

    .line 58
    .line 59
    sget-boolean v2, Lcom/example/dyhelper/beta/BlacklistVerifier;->ρ:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 60
    .line 61
    :goto_1
    monitor-exit v1

    .line 62
    return v2

    .line 63
    :catchall_1
    move-exception v0

    .line 64
    monitor-exit v1

    .line 65
    throw v0
.end method

.method public static η()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    sget-object v2, Lcom/example/dyhelper/beta/BlacklistVerifier;->θ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance v0, Ls0;

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    invoke-direct {v0, v1}, Ls0;-><init>(I)V

    .line 16
    .line 17
    .line 18
    sget-object v1, Lcom/example/dyhelper/beta/BlacklistVerifier;->δ:Landroid/os/Handler;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public static θ(Ljava/lang/String;)Z
    .locals 2

    .line 1
    const-string v0, "<boolean\\s+name=\"blocked\"\\s+value=\"(true|false)\"\\s*/>"

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
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-static {v0, v1, p0}, Lv71;->α(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Lix0;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    if-eqz p0, :cond_2

    .line 23
    .line 24
    invoke-virtual {p0}, Lix0;->α()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const/4 v0, 0x1

    .line 29
    invoke-static {v0, p0}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Ljava/lang/String;

    .line 34
    .line 35
    if-eqz p0, :cond_2

    .line 36
    .line 37
    const-string v0, "true"

    .line 38
    .line 39
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const-string v0, "false"

    .line 49
    .line 50
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-eqz p0, :cond_1

    .line 55
    .line 56
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    const/4 p0, 0x0

    .line 60
    :goto_0
    if-eqz p0, :cond_2

    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    return p0

    .line 67
    :cond_2
    return v1
.end method

.method public static ι(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "<string\\s+name=\""

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string p1, "\">(.*?)</string>"

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const/16 v0, 0x20

    .line 21
    .line 22
    invoke-static {p1, v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    invoke-static {p1, v0, p0}, Lv71;->α(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Lix0;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    if-eqz p0, :cond_0

    .line 42
    .line 43
    invoke-virtual {p0}, Lix0;->α()Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    const/4 p1, 0x1

    .line 48
    invoke-static {p1, p0}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    check-cast p0, Ljava/lang/String;

    .line 53
    .line 54
    if-eqz p0, :cond_0

    .line 55
    .line 56
    const-string p1, "&lt;"

    .line 57
    .line 58
    const-string v0, "<"

    .line 59
    .line 60
    invoke-static {p0, p1, v0}, Lx02;->Ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    const-string p1, "&gt;"

    .line 65
    .line 66
    const-string v0, ">"

    .line 67
    .line 68
    invoke-static {p0, p1, v0}, Lx02;->Ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    const-string p1, "&amp;"

    .line 73
    .line 74
    const-string v0, "&"

    .line 75
    .line 76
    invoke-static {p0, p1, v0}, Lx02;->Ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    const-string p1, "&quot;"

    .line 81
    .line 82
    const-string v0, "\""

    .line 83
    .line 84
    invoke-static {p0, p1, v0}, Lx02;->Ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    const-string p1, "&apos;"

    .line 89
    .line 90
    const-string v0, "\'"

    .line 91
    .line 92
    invoke-static {p0, p1, v0}, Lx02;->Ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    goto :goto_0

    .line 105
    :cond_0
    const/4 p0, 0x0

    .line 106
    :goto_0
    if-nez p0, :cond_1

    .line 107
    .line 108
    const-string p0, ""

    .line 109
    .line 110
    :cond_1
    return-object p0
.end method


# virtual methods
.method public final α(Ljava/lang/String;)V
    .locals 6

    .line 1
    const-string v0, "native block enforcer armed source="

    .line 2
    .line 3
    invoke-static {}, Lcom/example/dyhelper/beta/BlacklistVerifier;->γ()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto :goto_3

    .line 10
    :cond_0
    sget-object v1, Lcom/example/dyhelper/beta/BlacklistVerifier;->ζ:Ljava/lang/Object;

    .line 11
    .line 12
    monitor-enter v1

    .line 13
    :try_start_0
    sget-boolean v2, Lcom/example/dyhelper/beta/BlacklistVerifier;->σ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    monitor-exit v1

    .line 18
    return-void

    .line 19
    :cond_1
    const/4 v2, 0x1

    .line 20
    :try_start_1
    sput-boolean v2, Lcom/example/dyhelper/beta/BlacklistVerifier;->σ:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 21
    .line 22
    monitor-exit v1

    .line 23
    const/4 v1, 0x4

    .line 24
    const/4 v3, 0x0

    .line 25
    :try_start_2
    sget-object v4, Lcom/example/dyhelper/beta/BlacklistVerifier;->ν:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-eqz v5, :cond_2

    .line 32
    .line 33
    const-string v4, "blocked"

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception p0

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    :goto_0
    invoke-direct {p0, v2, v4}, Lcom/example/dyhelper/beta/BlacklistVerifier;->nativeSetBlocked(ZLjava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const-wide/16 v4, 0x1388

    .line 42
    .line 43
    invoke-direct {p0, v4, v5}, Lcom/example/dyhelper/beta/BlacklistVerifier;->nativeStartBlockEnforcer(J)V

    .line 44
    .line 45
    .line 46
    const-string p0, "rc2b948eb05c3593c"

    .line 47
    .line 48
    new-instance v2, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string p1, " delay=5000"

    .line 57
    .line 58
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-static {p0, p1, v3, v1, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    sget-object p0, Ls62;->α:Ls62;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :goto_1
    new-instance p1, Leo1;

    .line 72
    .line 73
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    move-object p0, p1

    .line 77
    :goto_2
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    if-eqz p0, :cond_3

    .line 82
    .line 83
    sget-object p1, Lcom/example/dyhelper/beta/BlacklistVerifier;->ζ:Ljava/lang/Object;

    .line 84
    .line 85
    monitor-enter p1

    .line 86
    const/4 v0, 0x0

    .line 87
    :try_start_3
    sput-boolean v0, Lcom/example/dyhelper/beta/BlacklistVerifier;->σ:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 88
    .line 89
    monitor-exit p1

    .line 90
    const-string p1, "rc2b948eb05c3593c"

    .line 91
    .line 92
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    const-string v0, "arm native enforcer failed: "

    .line 97
    .line 98
    invoke-static {v0, p0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-static {p1, p0, v3, v1, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    goto :goto_3

    .line 106
    :catchall_1
    move-exception p0

    .line 107
    monitor-exit p1

    .line 108
    throw p0

    .line 109
    :cond_3
    :goto_3
    return-void

    .line 110
    :catchall_2
    move-exception p0

    .line 111
    monitor-exit v1

    .line 112
    throw p0
.end method

.method public final β(Ljava/lang/String;)Lfa;
    .locals 11

    .line 1
    sget-object v0, Ls72;->α:Ljava/util/List;

    .line 2
    .line 3
    sget-object v0, Lcom/example/dyhelper/beta/BlacklistVerifier;->β:Ljava/util/List;

    .line 4
    .line 5
    const/16 v1, 0xa

    .line 6
    .line 7
    invoke-static {v1, v0}, Ls72;->γ(ILjava/util/List;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x1

    .line 16
    const/4 v4, 0x4

    .line 17
    const-string v5, "rc2b948eb05c3593c"

    .line 18
    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v7, 0x0

    .line 21
    if-eqz v2, :cond_2

    .line 22
    .line 23
    const-string p0, "blacklist json unavailable, keep current state"

    .line 24
    .line 25
    invoke-static {v5, p0, v6, v4, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    sget-boolean p0, Lcom/example/dyhelper/beta/BlacklistVerifier;->μ:Z

    .line 29
    .line 30
    sget-object p1, Lcom/example/dyhelper/beta/BlacklistVerifier;->ν:Ljava/lang/String;

    .line 31
    .line 32
    if-eqz p0, :cond_0

    .line 33
    .line 34
    sget-object p0, Lcom/example/dyhelper/beta/BlacklistVerifier;->γ:Ljava/util/Set;

    .line 35
    .line 36
    invoke-static {p1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-nez p0, :cond_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    move v3, v7

    .line 52
    :goto_0
    sget-object p0, Lcom/example/dyhelper/beta/BlacklistVerifier;->ν:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_1

    .line 59
    .line 60
    const-string p0, "network unavailable"

    .line 61
    .line 62
    :cond_1
    new-instance p1, Lfa;

    .line 63
    .line 64
    invoke-direct {p1, p0, v3, v7}, Lfa;-><init>(Ljava/lang/String;ZZ)V

    .line 65
    .line 66
    .line 67
    return-object p1

    .line 68
    :cond_2
    invoke-static {}, Lcom/example/dyhelper/beta/BlacklistVerifier;->γ()Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    const-string v8, ""

    .line 73
    .line 74
    const-string v9, "native unavailable"

    .line 75
    .line 76
    if-nez v2, :cond_3

    .line 77
    .line 78
    new-instance p0, Lfa;

    .line 79
    .line 80
    invoke-direct {p0, v9, v7, v7}, Lfa;-><init>(Ljava/lang/String;ZZ)V

    .line 81
    .line 82
    .line 83
    goto/16 :goto_5

    .line 84
    .line 85
    :cond_3
    :try_start_0
    invoke-static {p1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-direct {p0, v2, v0}, Lcom/example/dyhelper/beta/BlacklistVerifier;->nativeCheckUidInBlacklist(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    new-array v2, v3, [C

    .line 98
    .line 99
    aput-char v1, v2, v7

    .line 100
    .line 101
    const/4 v1, 0x3

    .line 102
    const/4 v10, 0x2

    .line 103
    invoke-static {p0, v2, v1, v10}, Lq02;->с(Ljava/lang/String;[CII)Ljava/util/List;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-static {p0}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    check-cast v1, Ljava/lang/String;

    .line 112
    .line 113
    const-string v2, "1"

    .line 114
    .line 115
    invoke-static {v1, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-eqz v2, :cond_6

    .line 120
    .line 121
    invoke-static {v3, p0}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    check-cast p0, Ljava/lang/String;

    .line 126
    .line 127
    if-nez p0, :cond_4

    .line 128
    .line 129
    move-object p0, v8

    .line 130
    :cond_4
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-eqz v1, :cond_5

    .line 143
    .line 144
    const-string p0, "blocked"

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :catchall_0
    move-exception p0

    .line 148
    goto :goto_4

    .line 149
    :cond_5
    :goto_1
    new-instance v1, Lfa;

    .line 150
    .line 151
    invoke-direct {v1, p0, v3, v3}, Lfa;-><init>(Ljava/lang/String;ZZ)V

    .line 152
    .line 153
    .line 154
    :goto_2
    move-object p0, v1

    .line 155
    goto :goto_5

    .line 156
    :cond_6
    const-string v2, "0"

    .line 157
    .line 158
    invoke-static {v1, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    if-eqz v1, :cond_8

    .line 163
    .line 164
    new-instance v1, Lfa;

    .line 165
    .line 166
    invoke-static {v3, p0}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    check-cast p0, Ljava/lang/String;

    .line 171
    .line 172
    if-nez p0, :cond_7

    .line 173
    .line 174
    move-object p0, v8

    .line 175
    :cond_7
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    invoke-direct {v1, p0, v7, v3}, Lfa;-><init>(Ljava/lang/String;ZZ)V

    .line 184
    .line 185
    .line 186
    goto :goto_2

    .line 187
    :cond_8
    invoke-static {v3, p0}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    check-cast p0, Ljava/lang/String;

    .line 192
    .line 193
    if-nez p0, :cond_9

    .line 194
    .line 195
    move-object p0, v8

    .line 196
    :cond_9
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    if-eqz v1, :cond_a

    .line 209
    .line 210
    goto :goto_3

    .line 211
    :cond_a
    move-object v9, p0

    .line 212
    :goto_3
    new-instance p0, Lfa;

    .line 213
    .line 214
    invoke-direct {p0, v9, v7, v7}, Lfa;-><init>(Ljava/lang/String;ZZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 215
    .line 216
    .line 217
    goto :goto_5

    .line 218
    :goto_4
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    const-string v1, "native blacklist parse failed: "

    .line 223
    .line 224
    invoke-static {v1, p0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    invoke-static {v5, p0, v6, v4, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    new-instance p0, Lfa;

    .line 232
    .line 233
    const-string v1, "native parse failed"

    .line 234
    .line 235
    invoke-direct {p0, v1, v7, v7}, Lfa;-><init>(Ljava/lang/String;ZZ)V

    .line 236
    .line 237
    .line 238
    :goto_5
    :try_start_1
    new-instance v1, Lorg/json/JSONObject;

    .line 239
    .line 240
    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    const-string v0, "blacklist_users"

    .line 244
    .line 245
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    if-nez v0, :cond_b

    .line 250
    .line 251
    new-instance v0, Lorg/json/JSONArray;

    .line 252
    .line 253
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 254
    .line 255
    .line 256
    goto :goto_6

    .line 257
    :catchall_1
    move-exception p1

    .line 258
    goto :goto_9

    .line 259
    :cond_b
    :goto_6
    invoke-static {p1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 268
    .line 269
    .line 270
    move-result v1

    .line 271
    move v2, v7

    .line 272
    :goto_7
    if-ge v2, v1, :cond_e

    .line 273
    .line 274
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 275
    .line 276
    .line 277
    move-result-object v9

    .line 278
    if-nez v9, :cond_c

    .line 279
    .line 280
    goto :goto_8

    .line 281
    :cond_c
    const-string v10, "uid"

    .line 282
    .line 283
    invoke-virtual {v9, v10, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v10

    .line 287
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    invoke-static {v10}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 291
    .line 292
    .line 293
    move-result-object v10

    .line 294
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v10

    .line 298
    invoke-static {v10, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    move-result v10

    .line 302
    if-eqz v10, :cond_d

    .line 303
    .line 304
    const-string p1, "enabled"

    .line 305
    .line 306
    invoke-virtual {v9, p1, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 307
    .line 308
    .line 309
    move-result p1

    .line 310
    new-instance v0, Lfa;

    .line 311
    .line 312
    const-string v1, "reason"

    .line 313
    .line 314
    invoke-virtual {v9, v1, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    invoke-static {v1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    invoke-direct {v0, v1, p1, v3}, Lfa;-><init>(Ljava/lang/String;ZZ)V

    .line 330
    .line 331
    .line 332
    goto :goto_a

    .line 333
    :cond_d
    :goto_8
    add-int/lit8 v2, v2, 0x1

    .line 334
    .line 335
    goto :goto_7

    .line 336
    :cond_e
    new-instance v0, Lfa;

    .line 337
    .line 338
    const-string p1, "not_found"

    .line 339
    .line 340
    invoke-direct {v0, p1, v7, v3}, Lfa;-><init>(Ljava/lang/String;ZZ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 341
    .line 342
    .line 343
    goto :goto_a

    .line 344
    :goto_9
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object p1

    .line 348
    const-string v0, "java blacklist parse failed: "

    .line 349
    .line 350
    invoke-static {v0, p1}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object p1

    .line 354
    invoke-static {v5, p1, v6, v4, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    new-instance v0, Lfa;

    .line 358
    .line 359
    const-string p1, "java parse failed"

    .line 360
    .line 361
    invoke-direct {v0, p1, v7, v7}, Lfa;-><init>(Ljava/lang/String;ZZ)V

    .line 362
    .line 363
    .line 364
    :goto_a
    iget-boolean p1, v0, Lfa;->γ:Z

    .line 365
    .line 366
    const-string v1, "verification_pending"

    .line 367
    .line 368
    if-eqz p1, :cond_11

    .line 369
    .line 370
    iget-boolean p1, p0, Lfa;->γ:Z

    .line 371
    .line 372
    if-nez p1, :cond_f

    .line 373
    .line 374
    goto :goto_b

    .line 375
    :cond_f
    iget-boolean p1, v0, Lfa;->α:Z

    .line 376
    .line 377
    iget-boolean v0, p0, Lfa;->α:Z

    .line 378
    .line 379
    if-eq p1, v0, :cond_10

    .line 380
    .line 381
    new-instance p0, Ljava/lang/StringBuilder;

    .line 382
    .line 383
    const-string v2, "java/native blacklist mismatch java="

    .line 384
    .line 385
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 386
    .line 387
    .line 388
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    const-string p1, " native="

    .line 392
    .line 393
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 394
    .line 395
    .line 396
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 397
    .line 398
    .line 399
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object p0

    .line 403
    invoke-static {v5, p0, v6, v4, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 404
    .line 405
    .line 406
    new-instance p0, Lfa;

    .line 407
    .line 408
    invoke-direct {p0, v1, v7, v7}, Lfa;-><init>(Ljava/lang/String;ZZ)V

    .line 409
    .line 410
    .line 411
    :cond_10
    return-object p0

    .line 412
    :cond_11
    :goto_b
    new-instance p0, Lfa;

    .line 413
    .line 414
    invoke-direct {p0, v1, v7, v7}, Lfa;-><init>(Ljava/lang/String;ZZ)V

    .line 415
    .line 416
    .line 417
    return-object p0
.end method

.method public final δ()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {}, Lcom/example/dyhelper/beta/BlacklistVerifier;->γ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, ""

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    :try_start_0
    invoke-direct {p0}, Lcom/example/dyhelper/beta/BlacklistVerifier;->nativeGetReason()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    new-instance v0, Leo1;

    .line 16
    .line 17
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    move-object p0, v0

    .line 21
    :goto_0
    instance-of v0, p0, Leo1;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    move-object v1, p0

    .line 27
    :goto_1
    check-cast v1, Ljava/lang/String;

    .line 28
    .line 29
    :cond_1
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_2

    .line 34
    .line 35
    sget-object v1, Lcom/example/dyhelper/beta/BlacklistVerifier;->ν:Ljava/lang/String;

    .line 36
    .line 37
    :cond_2
    return-object v1
.end method

.method public final ε(Landroid/content/Context;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move-object p1, v0

    .line 9
    :goto_0
    sput-object p1, Lcom/example/dyhelper/beta/BlacklistVerifier;->ι:Landroid/content/Context;

    .line 10
    .line 11
    invoke-static {}, Lui1;->Α()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x4

    .line 16
    const/4 v2, 0x0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    :try_start_0
    invoke-static {p1}, Lui1;->π(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    sget-object v0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    new-instance v3, Leo1;

    .line 27
    .line 28
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    move-object v0, v3

    .line 32
    :goto_1
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    const-string v3, "rc2b948eb05c3593c"

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-string v4, "PrefsManager init failed: "

    .line 45
    .line 46
    invoke-static {v4, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-static {v3, v0, v2, v1, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    const-string v0, "rc2b948eb05c3593c"

    .line 54
    .line 55
    const-string v3, ""

    .line 56
    .line 57
    const-string v4, "migrated legacy blacklist cache uid="

    .line 58
    .line 59
    const-string v5, "__dyhelper_blacklist_legacy_migrated"

    .line 60
    .line 61
    const/4 v6, 0x0

    .line 62
    invoke-static {v5, v6}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    const/4 v8, 0x1

    .line 67
    if-eqz v7, :cond_2

    .line 68
    .line 69
    goto/16 :goto_7

    .line 70
    .line 71
    :cond_2
    :try_start_1
    const-string v7, "dyhelper_blacklist"

    .line 72
    .line 73
    invoke-virtual {p1, v7, v6}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    const-string v9, "uid"

    .line 78
    .line 79
    invoke-interface {v7, v9, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v9

    .line 83
    if-eqz v9, :cond_3

    .line 84
    .line 85
    invoke-static {v9}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 86
    .line 87
    .line 88
    move-result-object v9

    .line 89
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v9

    .line 93
    goto :goto_2

    .line 94
    :catchall_1
    move-exception v3

    .line 95
    goto :goto_5

    .line 96
    :cond_3
    move-object v9, v2

    .line 97
    :goto_2
    if-nez v9, :cond_4

    .line 98
    .line 99
    move-object v9, v3

    .line 100
    :cond_4
    const-string v10, "blocked"

    .line 101
    .line 102
    invoke-interface {v7, v10, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    const-string v10, "reason"

    .line 107
    .line 108
    invoke-interface {v7, v10, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    if-eqz v7, :cond_5

    .line 113
    .line 114
    invoke-static {v7}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    goto :goto_3

    .line 123
    :cond_5
    move-object v7, v2

    .line 124
    :goto_3
    if-nez v7, :cond_6

    .line 125
    .line 126
    goto :goto_4

    .line 127
    :cond_6
    move-object v3, v7

    .line 128
    :goto_4
    invoke-static {v9}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 129
    .line 130
    .line 131
    move-result v7

    .line 132
    if-nez v7, :cond_8

    .line 133
    .line 134
    invoke-static {}, Lui1;->κ()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v7

    .line 138
    invoke-static {v7}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 139
    .line 140
    .line 141
    move-result-object v7

    .line 142
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v7

    .line 146
    invoke-static {v7}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 147
    .line 148
    .line 149
    move-result v10

    .line 150
    if-nez v10, :cond_7

    .line 151
    .line 152
    invoke-virtual {v7, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v7

    .line 156
    if-eqz v7, :cond_8

    .line 157
    .line 158
    :cond_7
    invoke-static {v9, v3, v6}, Lui1;->Μ(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 159
    .line 160
    .line 161
    new-instance v3, Ljava/lang/StringBuilder;

    .line 162
    .line 163
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    const-string v4, " blocked="

    .line 170
    .line 171
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    invoke-static {v0, v3, v2, v1, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    :cond_8
    invoke-static {v5, v8}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 185
    .line 186
    .line 187
    sget-object v3, Ls62;->α:Ls62;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 188
    .line 189
    goto :goto_6

    .line 190
    :goto_5
    new-instance v4, Leo1;

    .line 191
    .line 192
    invoke-direct {v4, v3}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 193
    .line 194
    .line 195
    move-object v3, v4

    .line 196
    :goto_6
    invoke-static {v3}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    if-eqz v3, :cond_9

    .line 201
    .line 202
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    const-string v4, "legacy blacklist cache migration failed: "

    .line 207
    .line 208
    invoke-static {v4, v3}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    invoke-static {v0, v3, v2, v1, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    :cond_9
    :goto_7
    sget-object v0, Lcom/example/dyhelper/beta/BlacklistVerifier;->ζ:Ljava/lang/Object;

    .line 216
    .line 217
    monitor-enter v0

    .line 218
    :try_start_2
    sget-boolean v1, Lcom/example/dyhelper/beta/BlacklistVerifier;->ξ:Z

    .line 219
    .line 220
    if-nez v1, :cond_d

    .line 221
    .line 222
    sput-boolean v8, Lcom/example/dyhelper/beta/BlacklistVerifier;->ξ:Z

    .line 223
    .line 224
    sget-boolean v1, Lcom/example/dyhelper/beta/BlacklistVerifier;->ο:Z

    .line 225
    .line 226
    if-eqz v1, :cond_a

    .line 227
    .line 228
    goto :goto_8

    .line 229
    :cond_a
    instance-of v1, p1, Landroid/app/Application;

    .line 230
    .line 231
    if-eqz v1, :cond_b

    .line 232
    .line 233
    move-object v2, p1

    .line 234
    check-cast v2, Landroid/app/Application;

    .line 235
    .line 236
    :cond_b
    if-nez v2, :cond_c

    .line 237
    .line 238
    goto :goto_8

    .line 239
    :cond_c
    sput-boolean v8, Lcom/example/dyhelper/beta/BlacklistVerifier;->ο:Z

    .line 240
    .line 241
    new-instance p1, Lq9;

    .line 242
    .line 243
    const/4 v1, 0x1

    .line 244
    invoke-direct {p1, v1}, Lq9;-><init>(I)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v2, p1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 248
    .line 249
    .line 250
    goto :goto_8

    .line 251
    :catchall_2
    move-exception p0

    .line 252
    goto :goto_9

    .line 253
    :cond_d
    :goto_8
    monitor-exit v0

    .line 254
    const-string p1, "init"

    .line 255
    .line 256
    invoke-virtual {p0, p1}, Lcom/example/dyhelper/beta/BlacklistVerifier;->κ(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    invoke-static {}, Lcom/example/dyhelper/beta/BlacklistVerifier;->γ()Z

    .line 260
    .line 261
    .line 262
    return-void

    .line 263
    :goto_9
    monitor-exit v0

    .line 264
    throw p0
.end method

.method public final ζ()Z
    .locals 6

    .line 1
    sget-boolean v0, Lcom/example/dyhelper/beta/BlacklistVerifier;->μ:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-static {}, Lui1;->Α()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    sget-object v0, Lcom/example/dyhelper/beta/BlacklistVerifier;->ι:Landroid/content/Context;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-static {v0}, Lui1;->π(Landroid/content/Context;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    invoke-static {}, Lui1;->Α()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v2, 0x0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    const-string v0, "blacklist_blocked"

    .line 28
    .line 29
    invoke-static {v0, v2}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    const-string v3, "blacklist_uid"

    .line 34
    .line 35
    const-string v4, ""

    .line 36
    .line 37
    invoke-static {v3, v4}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-static {v3}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    const-string v5, "blacklist_reason"

    .line 50
    .line 51
    invoke-static {v5, v4}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-static {v4}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_2

    .line 70
    .line 71
    sput-boolean v1, Lcom/example/dyhelper/beta/BlacklistVerifier;->μ:Z

    .line 72
    .line 73
    sput-object v4, Lcom/example/dyhelper/beta/BlacklistVerifier;->ν:Ljava/lang/String;

    .line 74
    .line 75
    sput-object v3, Lcom/example/dyhelper/beta/BlacklistVerifier;->κ:Ljava/lang/String;

    .line 76
    .line 77
    const-string v0, "isBlocked"

    .line 78
    .line 79
    invoke-virtual {p0, v4, v0, v1}, Lcom/example/dyhelper/beta/BlacklistVerifier;->λ(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 80
    .line 81
    .line 82
    return v1

    .line 83
    :cond_2
    invoke-static {}, Lcom/example/dyhelper/beta/BlacklistVerifier;->γ()Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-eqz v0, :cond_4

    .line 88
    .line 89
    :try_start_0
    invoke-direct {p0}, Lcom/example/dyhelper/beta/BlacklistVerifier;->nativeIsBlocked()Z

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 94
    .line 95
    .line 96
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    goto :goto_0

    .line 98
    :catchall_0
    move-exception p0

    .line 99
    new-instance v0, Leo1;

    .line 100
    .line 101
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 102
    .line 103
    .line 104
    move-object p0, v0

    .line 105
    :goto_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 106
    .line 107
    instance-of v1, p0, Leo1;

    .line 108
    .line 109
    if-eqz v1, :cond_3

    .line 110
    .line 111
    move-object p0, v0

    .line 112
    :cond_3
    check-cast p0, Ljava/lang/Boolean;

    .line 113
    .line 114
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    return p0

    .line 119
    :cond_4
    return v2
.end method

.method public final κ(Ljava/lang/String;)V
    .locals 8

    .line 1
    invoke-static {}, Lui1;->Α()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const-string v0, "blacklist_uid"

    .line 9
    .line 10
    const-string v1, ""

    .line 11
    .line 12
    invoke-static {v0, v1}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v2, "blacklist_blocked"

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-static {v2, v3}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    const-string v4, "blacklist_reason"

    .line 32
    .line 33
    invoke-static {v4, v1}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-static {v4}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    if-eqz v2, :cond_2

    .line 46
    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    sget-object v5, Lcom/example/dyhelper/beta/BlacklistVerifier;->γ:Ljava/util/Set;

    .line 50
    .line 51
    invoke-static {v4}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    invoke-interface {v5, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-nez v5, :cond_1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    const-string v4, "verification_pending"

    .line 67
    .line 68
    invoke-static {v0, v4, v3}, Lui1;->Μ(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 69
    .line 70
    .line 71
    const-string v2, "cleared legacy non-authoritative blacklist cache reason=verification_pending"

    .line 72
    .line 73
    const/4 v5, 0x4

    .line 74
    const-string v6, "rc2b948eb05c3593c"

    .line 75
    .line 76
    const/4 v7, 0x0

    .line 77
    invoke-static {v6, v2, v7, v5, v7}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    move v2, v3

    .line 81
    :cond_2
    :goto_0
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-nez v5, :cond_3

    .line 86
    .line 87
    sput-object v0, Lcom/example/dyhelper/beta/BlacklistVerifier;->κ:Ljava/lang/String;

    .line 88
    .line 89
    :cond_3
    sput-boolean v2, Lcom/example/dyhelper/beta/BlacklistVerifier;->μ:Z

    .line 90
    .line 91
    sput-object v4, Lcom/example/dyhelper/beta/BlacklistVerifier;->ν:Ljava/lang/String;

    .line 92
    .line 93
    if-eqz v2, :cond_4

    .line 94
    .line 95
    const/4 v0, 0x1

    .line 96
    invoke-virtual {p0, v4, p1, v0}, Lcom/example/dyhelper/beta/BlacklistVerifier;->λ(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 97
    .line 98
    .line 99
    invoke-static {}, Lcom/example/dyhelper/beta/BlacklistVerifier;->η()V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :cond_4
    invoke-virtual {p0, v1, p1, v3}, Lcom/example/dyhelper/beta/BlacklistVerifier;->λ(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 104
    .line 105
    .line 106
    return-void
.end method

.method public final λ(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 4

    .line 1
    const-string v0, "same-state:"

    .line 2
    .line 3
    invoke-static {p1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    sget-object v1, Lcom/example/dyhelper/beta/BlacklistVerifier;->κ:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {v1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    sget-object v2, Lcom/example/dyhelper/beta/BlacklistVerifier;->ζ:Ljava/lang/Object;

    .line 22
    .line 23
    monitor-enter v2

    .line 24
    :try_start_0
    sget-object v3, Lcom/example/dyhelper/beta/BlacklistVerifier;->τ:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v3, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    sget-boolean v3, Lcom/example/dyhelper/beta/BlacklistVerifier;->υ:Z

    .line 33
    .line 34
    if-ne v3, p3, :cond_1

    .line 35
    .line 36
    sget-object v3, Lcom/example/dyhelper/beta/BlacklistVerifier;->φ:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v3, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    if-eqz p3, :cond_0

    .line 45
    .line 46
    sget-boolean p0, Lcom/example/dyhelper/beta/BlacklistVerifier;->σ:Z

    .line 47
    .line 48
    if-nez p0, :cond_0

    .line 49
    .line 50
    sget-object p0, Lcom/example/dyhelper/beta/BlacklistVerifier;->α:Lcom/example/dyhelper/beta/BlacklistVerifier;

    .line 51
    .line 52
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p0, p1}, Lcom/example/dyhelper/beta/BlacklistVerifier;->α(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :catchall_0
    move-exception p0

    .line 61
    goto :goto_3

    .line 62
    :cond_0
    :goto_0
    monitor-exit v2

    .line 63
    return-void

    .line 64
    :cond_1
    :try_start_1
    sput-object v1, Lcom/example/dyhelper/beta/BlacklistVerifier;->τ:Ljava/lang/String;

    .line 65
    .line 66
    sput-boolean p3, Lcom/example/dyhelper/beta/BlacklistVerifier;->υ:Z

    .line 67
    .line 68
    sput-object p1, Lcom/example/dyhelper/beta/BlacklistVerifier;->φ:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 69
    .line 70
    monitor-exit v2

    .line 71
    invoke-static {}, Lcom/example/dyhelper/beta/BlacklistVerifier;->γ()Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-nez v0, :cond_2

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_2
    if-eqz p3, :cond_4

    .line 79
    .line 80
    const/4 p3, 0x1

    .line 81
    :try_start_2
    invoke-direct {p0, p3, p1}, Lcom/example/dyhelper/beta/BlacklistVerifier;->nativeSetBlocked(ZLjava/lang/String;)V

    .line 82
    .line 83
    .line 84
    sget-object p1, Ls62;->α:Ls62;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :catchall_1
    move-exception p1

    .line 88
    new-instance p3, Leo1;

    .line 89
    .line 90
    invoke-direct {p3, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 91
    .line 92
    .line 93
    move-object p1, p3

    .line 94
    :goto_1
    invoke-static {p1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    if-eqz p1, :cond_3

    .line 99
    .line 100
    const-string p3, "rc2b948eb05c3593c"

    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    const-string v0, "nativeSetBlocked(true) failed: "

    .line 107
    .line 108
    invoke-static {v0, p1}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    const/4 v0, 0x4

    .line 113
    const/4 v1, 0x0

    .line 114
    invoke-static {p3, p1, v1, v0, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    :cond_3
    invoke-virtual {p0, p2}, Lcom/example/dyhelper/beta/BlacklistVerifier;->α(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    :cond_4
    :goto_2
    return-void

    .line 121
    :goto_3
    monitor-exit v2

    .line 122
    throw p0
.end method
