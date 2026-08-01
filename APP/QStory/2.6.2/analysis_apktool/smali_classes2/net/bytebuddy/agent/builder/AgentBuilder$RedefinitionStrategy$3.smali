.class final enum Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$3;
.super Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4009
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;IZZ)V
    .locals 6

    .line 1
    const/4 v5, 0x0

    .line 2
    move-object v0, p0

    .line 3
    move-object v1, p1

    .line 4
    move v2, p2

    .line 5
    move v3, p3

    .line 6
    move v4, p4

    .line 7
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;-><init>(Ljava/lang/String;IZZLnet/bytebuddy/agent/builder/AgentBuilder$1;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public check(Ljava/lang/instrument/Instrumentation;)V
    .locals 0

    .line 1
    sget-object p0, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;->DISPATCHER:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Dispatcher;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Dispatcher;->isRetransformClassesSupported(Ljava/lang/instrument/Instrumentation;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const-string p0, "Cannot apply retransformation on "

    .line 11
    .line 12
    invoke-static {p1, p0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public make(Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;)Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Collector;
    .locals 1

    .line 1
    new-instance p0, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Collector$ForRetransformation;

    .line 2
    .line 3
    move-object v0, p2

    .line 4
    move-object p2, p1

    .line 5
    move-object p1, p6

    .line 6
    move-object p6, p4

    .line 7
    move-object p4, p3

    .line 8
    move-object p3, v0

    .line 9
    invoke-direct/range {p0 .. p7}, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Collector$ForRetransformation;-><init>(Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;)V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method
