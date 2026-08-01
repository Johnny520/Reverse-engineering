.class public abstract Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$WithInnerClassLoadingLock;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "WithInnerClassLoadingLock"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$WithInnerClassLoadingLock$TrivialLock;
    }
.end annotation


# static fields
.field protected static final DEFAULT_SIZE:I = 0x64


# instance fields
.field private final lock:[Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$WithInnerClassLoadingLock$TrivialLock;


# direct methods
.method public constructor <init>(I)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-array v0, p1, [Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$WithInnerClassLoadingLock$TrivialLock;

    .line 5
    .line 6
    iput-object v0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$WithInnerClassLoadingLock;->lock:[Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$WithInnerClassLoadingLock$TrivialLock;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    :goto_0
    if-ge v0, p1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$WithInnerClassLoadingLock;->lock:[Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$WithInnerClassLoadingLock$TrivialLock;

    .line 12
    .line 13
    new-instance v2, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$WithInnerClassLoadingLock$TrivialLock;

    .line 14
    .line 15
    invoke-direct {v2}, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$WithInnerClassLoadingLock$TrivialLock;-><init>()V

    .line 16
    .line 17
    .line 18
    aput-object v2, v1, v0

    .line 19
    .line 20
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
.end method


# virtual methods
.method public acquire()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$WithInnerClassLoadingLock;->lock:[Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$WithInnerClassLoadingLock$TrivialLock;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$WithInnerClassLoadingLock;->doAcquire()Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :cond_0
    array-length v1, v0

    .line 12
    const/4 v2, 0x1

    .line 13
    const/4 v3, 0x0

    .line 14
    if-ne v1, v2, :cond_1

    .line 15
    .line 16
    aget-object v0, v0, v3

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$WithInnerClassLoadingLock;->lock:[Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$WithInnerClassLoadingLock$TrivialLock;

    .line 28
    .line 29
    const/high16 v4, -0x80000000

    .line 30
    .line 31
    if-ne v0, v4, :cond_2

    .line 32
    .line 33
    move v0, v3

    .line 34
    goto :goto_0

    .line 35
    :cond_2
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    iget-object v4, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$WithInnerClassLoadingLock;->lock:[Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$WithInnerClassLoadingLock$TrivialLock;

    .line 40
    .line 41
    array-length v4, v4

    .line 42
    rem-int/2addr v0, v4

    .line 43
    :goto_0
    aget-object v0, v1, v0

    .line 44
    .line 45
    :goto_1
    monitor-enter v0

    .line 46
    :try_start_0
    iget-boolean v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$WithInnerClassLoadingLock$TrivialLock;->locked:Z

    .line 47
    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    monitor-exit v0

    .line 51
    return v3

    .line 52
    :catchall_0
    move-exception p0

    .line 53
    goto :goto_2

    .line 54
    :cond_3
    iput-boolean v2, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$WithInnerClassLoadingLock$TrivialLock;->locked:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    :try_start_1
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$WithInnerClassLoadingLock;->doAcquire()Z

    .line 57
    .line 58
    .line 59
    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 60
    :try_start_2
    iput-boolean v3, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$WithInnerClassLoadingLock$TrivialLock;->locked:Z

    .line 61
    .line 62
    monitor-exit v0

    .line 63
    return p0

    .line 64
    :catchall_1
    move-exception p0

    .line 65
    iput-boolean v3, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$WithInnerClassLoadingLock$TrivialLock;->locked:Z

    .line 66
    .line 67
    throw p0

    .line 68
    :goto_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 69
    throw p0
.end method

.method public abstract doAcquire()Z
.end method
