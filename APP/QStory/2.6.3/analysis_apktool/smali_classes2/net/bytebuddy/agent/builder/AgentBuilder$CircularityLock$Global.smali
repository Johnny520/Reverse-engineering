.class public Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$Global;
.super Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$WithInnerClassLoadingLock;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Global"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final lock:Ljava/util/concurrent/locks/Lock;

.field private final time:J

.field private final timeUnit:Ljava/util/concurrent/TimeUnit;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x64

    .line 18
    invoke-direct {p0, v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$Global;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 3

    const-wide/16 v0, 0x0

    .line 17
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-direct {p0, p1, v0, v1, v2}, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$Global;-><init>(IJLjava/util/concurrent/TimeUnit;)V

    return-void
.end method

.method public constructor <init>(IJLjava/util/concurrent/TimeUnit;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$WithInnerClassLoadingLock;-><init>(I)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/util/concurrent/locks/ReentrantLock;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$Global;->lock:Ljava/util/concurrent/locks/Lock;

    .line 10
    .line 11
    iput-wide p2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$Global;->time:J

    .line 12
    .line 13
    iput-object p4, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$Global;->timeUnit:Ljava/util/concurrent/TimeUnit;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(JLjava/util/concurrent/TimeUnit;)V
    .locals 1

    const/16 v0, 0x64

    .line 16
    invoke-direct {p0, v0, p1, p2, p3}, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$Global;-><init>(IJLjava/util/concurrent/TimeUnit;)V

    return-void
.end method


# virtual methods
.method public doAcquire()Z
    .locals 4

    .line 1
    :try_start_0
    iget-wide v0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$Global;->time:J
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v2, v0, v2

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$Global;->lock:Ljava/util/concurrent/locks/Lock;

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    :try_start_1
    invoke-interface {v3}, Ljava/util/concurrent/locks/Lock;->tryLock()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$Global;->timeUnit:Ljava/util/concurrent/TimeUnit;

    .line 17
    .line 18
    invoke-interface {v3, v0, v1, p0}, Ljava/util/concurrent/locks/Lock;->tryLock(JLjava/util/concurrent/TimeUnit;)Z

    .line 19
    .line 20
    .line 21
    move-result p0
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 22
    return p0

    .line 23
    :catch_0
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eq v2, v3, :cond_2

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    iget-wide v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$Global;->time:J

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$Global;

    .line 23
    .line 24
    iget-wide v4, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$Global;->time:J

    .line 25
    .line 26
    cmp-long v2, v2, v4

    .line 27
    .line 28
    if-eqz v2, :cond_3

    .line 29
    .line 30
    return v1

    .line 31
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$Global;->timeUnit:Ljava/util/concurrent/TimeUnit;

    .line 32
    .line 33
    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$Global;->timeUnit:Ljava/util/concurrent/TimeUnit;

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_4

    .line 40
    .line 41
    return v1

    .line 42
    :cond_4
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$Global;->lock:Ljava/util/concurrent/locks/Lock;

    .line 43
    .line 44
    iget-object p1, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$Global;->lock:Ljava/util/concurrent/locks/Lock;

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-nez p0, :cond_5

    .line 51
    .line 52
    return v1

    .line 53
    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$Global;->lock:Ljava/util/concurrent/locks/Lock;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/2addr v1, v0

    .line 18
    mul-int/lit8 v1, v1, 0x1f

    .line 19
    .line 20
    iget-wide v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$Global;->time:J

    .line 21
    .line 22
    const/16 v0, 0x20

    .line 23
    .line 24
    ushr-long v4, v2, v0

    .line 25
    .line 26
    xor-long/2addr v2, v4

    .line 27
    long-to-int v0, v2

    .line 28
    add-int/2addr v1, v0

    .line 29
    mul-int/lit8 v1, v1, 0x1f

    .line 30
    .line 31
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$Global;->timeUnit:Ljava/util/concurrent/TimeUnit;

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    add-int/2addr p0, v1

    .line 38
    return p0
.end method

.method public release()V
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$Global;->lock:Ljava/util/concurrent/locks/Lock;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
