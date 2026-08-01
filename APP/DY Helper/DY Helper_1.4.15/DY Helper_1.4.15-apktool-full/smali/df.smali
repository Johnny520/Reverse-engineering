.class public final Ldf;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Ljava/util/concurrent/atomic/AtomicLong;

.field public final β:Ljava/lang/Object;

.field public volatile γ:Lcf;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 5
    .line 6
    const-wide/high16 v1, -0x8000000000000000L

    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Ldf;->α:Ljava/util/concurrent/atomic/AtomicLong;

    .line 12
    .line 13
    new-instance v0, Ljava/lang/Object;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Ldf;->β:Ljava/lang/Object;

    .line 19
    .line 20
    new-instance v0, Lcf;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-direct {v0, v1, v2, v3}, Lcf;-><init>(JZ)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Ldf;->γ:Lcf;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final α(JLp70;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Ldf;->γ:Lcf;

    .line 2
    .line 3
    iget-wide v1, v0, Lcf;->β:J

    .line 4
    .line 5
    cmp-long v1, p1, v1

    .line 6
    .line 7
    if-gez v1, :cond_0

    .line 8
    .line 9
    iget-boolean p0, v0, Lcf;->α:Z

    .line 10
    .line 11
    return p0

    .line 12
    :cond_0
    iget-object v0, p0, Ldf;->β:Ljava/lang/Object;

    .line 13
    .line 14
    monitor-enter v0

    .line 15
    :try_start_0
    iget-object v1, p0, Ldf;->γ:Lcf;

    .line 16
    .line 17
    iget-wide v2, v1, Lcf;->β:J

    .line 18
    .line 19
    cmp-long v2, p1, v2

    .line 20
    .line 21
    if-gez v2, :cond_1

    .line 22
    .line 23
    iget-boolean p0, v1, Lcf;->α:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :catchall_0
    move-exception p0

    .line 27
    goto :goto_2

    .line 28
    :cond_1
    :try_start_1
    invoke-interface {p3}, Lp70;->invoke()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 32
    goto :goto_0

    .line 33
    :catchall_1
    move-exception p3

    .line 34
    :try_start_2
    new-instance v1, Leo1;

    .line 35
    .line 36
    invoke-direct {v1, p3}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    move-object p3, v1

    .line 40
    :goto_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 41
    .line 42
    instance-of v2, p3, Leo1;

    .line 43
    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    move-object p3, v1

    .line 47
    :cond_2
    check-cast p3, Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 50
    .line 51
    .line 52
    move-result p3

    .line 53
    new-instance v1, Lcf;

    .line 54
    .line 55
    const-wide/16 v2, 0x1388

    .line 56
    .line 57
    add-long/2addr p1, v2

    .line 58
    invoke-direct {v1, p1, p2, p3}, Lcf;-><init>(JZ)V

    .line 59
    .line 60
    .line 61
    iput-object v1, p0, Ldf;->γ:Lcf;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 62
    .line 63
    move p0, p3

    .line 64
    :goto_1
    monitor-exit v0

    .line 65
    return p0

    .line 66
    :goto_2
    monitor-exit v0

    .line 67
    throw p0
.end method

.method public final β(J)Z
    .locals 7

    .line 1
    :cond_0
    iget-object v0, p0, Ldf;->α:Ljava/util/concurrent/atomic/AtomicLong;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    const-wide/high16 v3, -0x8000000000000000L

    .line 8
    .line 9
    cmp-long v3, v1, v3

    .line 10
    .line 11
    if-eqz v3, :cond_1

    .line 12
    .line 13
    sub-long v3, p1, v1

    .line 14
    .line 15
    const-wide/16 v5, 0x5dc

    .line 16
    .line 17
    cmp-long v3, v3, v5

    .line 18
    .line 19
    if-gez v3, :cond_1

    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return p0

    .line 23
    :cond_1
    invoke-virtual {v0, v1, v2, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    return p0
.end method
