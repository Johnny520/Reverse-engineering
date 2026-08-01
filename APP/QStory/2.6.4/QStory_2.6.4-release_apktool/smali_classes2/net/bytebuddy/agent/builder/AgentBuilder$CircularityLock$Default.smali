.class public Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$Default;
.super Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$WithInnerClassLoadingLock;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Default"
.end annotation


# instance fields
.field private final threads:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljava/lang/Thread;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const/16 v0, 0x64

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$WithInnerClassLoadingLock;-><init>(I)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$Default;->threads:Ljava/util/concurrent/ConcurrentMap;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 14
    invoke-direct {p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$WithInnerClassLoadingLock;-><init>(I)V

    .line 15
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$Default;->threads:Ljava/util/concurrent/ConcurrentMap;

    return-void
.end method


# virtual methods
.method public doAcquire()Z
    .locals 2

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$Default;->threads:Ljava/util/concurrent/ConcurrentMap;

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-interface {p0, v0, v1}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public isLocked()Z
    .locals 1

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$Default;->threads:Ljava/util/concurrent/ConcurrentMap;

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {p0, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public release()V
    .locals 1

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$Default;->threads:Ljava/util/concurrent/ConcurrentMap;

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {p0, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-void
.end method
