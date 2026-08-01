.class public abstract Lje1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lje1;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    return-void
.end method

.method public static α(JJLp70;)Ljava/lang/Object;
    .locals 6

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p0, v0

    .line 4
    .line 5
    if-lez v2, :cond_2

    .line 6
    .line 7
    sget-object v2, Lje1;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    .line 9
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    new-instance p1, Lf71;

    .line 14
    .line 15
    const/16 v3, 0x18

    .line 16
    .line 17
    invoke-direct {p1, v3}, Lf71;-><init>(I)V

    .line 18
    .line 19
    .line 20
    new-instance v3, Lc8;

    .line 21
    .line 22
    const/16 v4, 0xb

    .line 23
    .line 24
    invoke-direct {v3, p1, v4}, Lc8;-><init>(La80;I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, p0, v3}, Ljava/util/concurrent/ConcurrentHashMap;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    check-cast p0, Lie1;

    .line 35
    .line 36
    iget-object p1, p0, Lie1;->α:Ljava/lang/Object;

    .line 37
    .line 38
    monitor-enter p1

    .line 39
    cmp-long v2, p2, v0

    .line 40
    .line 41
    if-gez v2, :cond_0

    .line 42
    .line 43
    move-wide p2, v0

    .line 44
    :cond_0
    :goto_0
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 45
    .line 46
    .line 47
    move-result-wide v2

    .line 48
    iget-wide v4, p0, Lie1;->β:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    sub-long/2addr v2, v4

    .line 51
    sub-long v2, p2, v2

    .line 52
    .line 53
    cmp-long v4, v2, v0

    .line 54
    .line 55
    if-lez v4, :cond_1

    .line 56
    .line 57
    :try_start_1
    iget-object v4, p0, Lie1;->α:Ljava/lang/Object;

    .line 58
    .line 59
    invoke-virtual {v4, v2, v3}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :catchall_0
    move-exception p0

    .line 64
    goto :goto_1

    .line 65
    :catch_0
    move-exception p0

    .line 66
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-virtual {p2}, Ljava/lang/Thread;->interrupt()V

    .line 71
    .line 72
    .line 73
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 74
    :cond_1
    :try_start_3
    invoke-interface {p4}, Lp70;->invoke()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 78
    :try_start_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 79
    .line 80
    .line 81
    move-result-wide p3

    .line 82
    iput-wide p3, p0, Lie1;->β:J

    .line 83
    .line 84
    iget-object p0, p0, Lie1;->α:Ljava/lang/Object;

    .line 85
    .line 86
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 87
    .line 88
    .line 89
    monitor-exit p1

    .line 90
    return-object p2

    .line 91
    :catchall_1
    move-exception p2

    .line 92
    :try_start_5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 93
    .line 94
    .line 95
    move-result-wide p3

    .line 96
    iput-wide p3, p0, Lie1;->β:J

    .line 97
    .line 98
    iget-object p0, p0, Lie1;->α:Ljava/lang/Object;

    .line 99
    .line 100
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 101
    .line 102
    .line 103
    throw p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 104
    :goto_1
    monitor-exit p1

    .line 105
    throw p0

    .line 106
    :cond_2
    const-string p0, "\u4f1a\u8bdd\u77ed ID \u5fc5\u987b\u5927\u4e8e 0"

    .line 107
    .line 108
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    const/4 p0, 0x0

    .line 112
    return-object p0
.end method
