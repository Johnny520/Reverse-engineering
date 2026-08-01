.class public final L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪世兰苏哲:J

.field public static 飘花落叶言子楪世哲兰苏:Ljava/util/Timer;

.field public static 飘花落叶言子楪世哲苏兰:Lorg/luckypray/dexkit/DexKitBridge;

.field public static final 飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final 飘花落叶言子楪世苏哲兰:L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 14
    .line 15
    const-wide/16 v0, 0x2710

    .line 16
    .line 17
    sput-wide v0, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:J

    .line 18
    .line 19
    return-void
.end method

.method public static final 飘花落叶言子楪世苏哲兰()Lorg/luckypray/dexkit/DexKitBridge;
    .locals 4

    .line 1
    sget-object v0, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:Lorg/luckypray/dexkit/DexKitBridge;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    sget-object v0, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;

    .line 6
    .line 7
    sget-object v1, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/content/Context;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    monitor-enter v0

    .line 19
    :try_start_0
    sget-object v2, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:Lorg/luckypray/dexkit/DexKitBridge;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    monitor-exit v0

    .line 24
    goto :goto_2

    .line 25
    :cond_0
    :try_start_1
    sget-object v2, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 29
    .line 30
    .line 31
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    if-nez v2, :cond_1

    .line 33
    .line 34
    :try_start_2
    const-string v2, "dexkit"

    .line 35
    .line 36
    invoke-static {v2}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception v1

    .line 41
    goto :goto_1

    .line 42
    :catch_0
    :cond_1
    :goto_0
    :try_start_3
    new-instance v2, Lorg/luckypray/dexkit/DexKitBridge;

    .line 43
    .line 44
    invoke-direct {v2, v1}, Lorg/luckypray/dexkit/DexKitBridge;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v2, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:Lorg/luckypray/dexkit/DexKitBridge;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 48
    .line 49
    monitor-exit v0

    .line 50
    goto :goto_2

    .line 51
    :goto_1
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 52
    throw v1

    .line 53
    :cond_2
    :goto_2
    sget-wide v0, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:J

    .line 54
    .line 55
    const-wide/16 v2, 0x0

    .line 56
    .line 57
    cmp-long v2, v0, v2

    .line 58
    .line 59
    if-gtz v2, :cond_3

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_3
    sget-object v2, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:Ljava/util/Timer;

    .line 63
    .line 64
    if-eqz v2, :cond_4

    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/util/Timer;->cancel()V

    .line 67
    .line 68
    .line 69
    :cond_4
    new-instance v2, Ljava/util/Timer;

    .line 70
    .line 71
    invoke-direct {v2}, Ljava/util/Timer;-><init>()V

    .line 72
    .line 73
    .line 74
    sput-object v2, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:Ljava/util/Timer;

    .line 75
    .line 76
    new-instance v3, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世苏兰哲;

    .line 77
    .line 78
    invoke-direct {v3}, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世苏兰哲;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v3, v0, v1}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 82
    .line 83
    .line 84
    :goto_3
    sget-object v0, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:Lorg/luckypray/dexkit/DexKitBridge;

    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    return-object v0
.end method
