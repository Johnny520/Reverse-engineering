.class public abstract Ltw0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/Set;

.field public static final β:Ljava/util/Set;

.field public static final γ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final δ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final ε:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final ζ:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "~79F5E25B4ED201D89B6CE77FECC600ECA88AB6F7485F4A97"

    .line 2
    .line 3
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "~79E12C8E079FE6A48D2A4BA59CF063B7FD3CDFA2905F3880B8C578874D"

    .line 8
    .line 9
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Ltw0;->α:Ljava/util/Set;

    .line 22
    .line 23
    const-string v0, "BlacklistVerifier"

    .line 24
    .line 25
    const-string v1, "UserUidFetcher"

    .line 26
    .line 27
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Ltw0;->β:Ljava/util/Set;

    .line 36
    .line 37
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 41
    .line 42
    .line 43
    sput-object v0, Ltw0;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 44
    .line 45
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 46
    .line 47
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 48
    .line 49
    .line 50
    sput-object v0, Ltw0;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 51
    .line 52
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 53
    .line 54
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 55
    .line 56
    .line 57
    sput-object v0, Ltw0;->ε:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 58
    .line 59
    sget-object v0, Lef0;->α:Lef0;

    .line 60
    .line 61
    const-string v1, "~7918AA8296C85B92707DC4C904CE4F6B863956D476D464A4B4FA8248966EA0F63C4AD8"

    .line 62
    .line 63
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v0, v1}, Lef0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    sput-object v0, Ltw0;->ζ:Ljava/lang/String;

    .line 72
    .line 73
    return-void
.end method

.method public static α()Landroid/content/Context;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-string v1, "android.app.ActivityThread"

    .line 3
    .line 4
    invoke-static {v0, v1}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const-string v2, "currentActivityThread"

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    new-array v4, v3, [Ljava/lang/Object;

    .line 12
    .line 13
    invoke-static {v1, v2, v4}, Lqe0;->β(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    if-nez v2, :cond_1

    .line 18
    .line 19
    :cond_0
    move-object v1, v0

    .line 20
    goto :goto_2

    .line 21
    :cond_1
    const-string v4, "currentApplication"

    .line 22
    .line 23
    new-array v5, v3, [Ljava/lang/Object;

    .line 24
    .line 25
    invoke-static {v1, v4, v5}, Lqe0;->β(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    instance-of v4, v1, Landroid/content/Context;

    .line 30
    .line 31
    if-eqz v4, :cond_2

    .line 32
    .line 33
    check-cast v1, Landroid/content/Context;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception v1

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move-object v1, v0

    .line 39
    :goto_0
    if-nez v1, :cond_3

    .line 40
    .line 41
    const-string v1, "getSystemContext"

    .line 42
    .line 43
    new-array v3, v3, [Ljava/lang/Object;

    .line 44
    .line 45
    invoke-static {v2, v1, v3}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    instance-of v2, v1, Landroid/content/Context;

    .line 50
    .line 51
    if-eqz v2, :cond_0

    .line 52
    .line 53
    check-cast v1, Landroid/content/Context;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :goto_1
    new-instance v2, Leo1;

    .line 57
    .line 58
    invoke-direct {v2, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    move-object v1, v2

    .line 62
    :cond_3
    :goto_2
    instance-of v2, v1, Leo1;

    .line 63
    .line 64
    if-eqz v2, :cond_4

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_4
    move-object v0, v1

    .line 68
    :goto_3
    check-cast v0, Landroid/content/Context;

    .line 69
    .line 70
    return-object v0
.end method
