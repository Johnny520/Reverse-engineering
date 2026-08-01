.class public final synthetic Lqh0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:Ljava/lang/String;

.field public final synthetic ζ:J

.field public final synthetic η:Lth0;

.field public final synthetic θ:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;JLvh0;Lth0;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqh0;->ε:Ljava/lang/String;

    .line 5
    .line 6
    iput-wide p2, p0, Lqh0;->ζ:J

    .line 7
    .line 8
    iput-object p5, p0, Lqh0;->η:Lth0;

    .line 9
    .line 10
    iput-object p6, p0, Lqh0;->θ:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget-object v0, p0, Lqh0;->ε:Ljava/lang/String;

    .line 2
    .line 3
    iget-wide v1, p0, Lqh0;->ζ:J

    .line 4
    .line 5
    iget-object v3, p0, Lqh0;->η:Lth0;

    .line 6
    .line 7
    iget-object p0, p0, Lqh0;->θ:Ljava/lang/String;

    .line 8
    .line 9
    sget-object v4, Lvh0;->ξ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 10
    .line 11
    sget-object v5, Lvh0;->μ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    const-string v6, "\u5f02\u6b65\u89e3\u6790 IM \u6635\u79f0\u5931\u8d25 uid="

    .line 14
    .line 15
    :try_start_0
    sget-object v7, Lst;->α:Lst;

    .line 16
    .line 17
    invoke-virtual {v7, v1, v2, v0}, Lst;->ξ(JLjava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v7

    .line 21
    invoke-static {v1, v2, v7}, Lst;->ε(JLjava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v7

    .line 25
    if-eqz v7, :cond_1

    .line 26
    .line 27
    invoke-static {v7}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result v8

    .line 31
    if-eqz v8, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iget-object v3, v3, Lth0;->ζ:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v1, v2, v3, v7}, Lvh0;->Ε(JLjava/lang/String;Ljava/lang/String;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception v3

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    :goto_0
    invoke-virtual {v5, p0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :goto_1
    :try_start_1
    const-string v7, "r54982dbb4488a7d6"

    .line 50
    .line 51
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    new-instance v8, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {v8, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v8, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, " cid="

    .line 64
    .line 65
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v0, " err="

    .line 72
    .line 73
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-static {v7, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :catchall_1
    move-exception v0

    .line 88
    invoke-virtual {v5, p0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 92
    .line 93
    .line 94
    throw v0
.end method
