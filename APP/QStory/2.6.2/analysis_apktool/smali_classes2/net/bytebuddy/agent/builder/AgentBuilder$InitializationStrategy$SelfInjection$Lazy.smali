.class public Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy$SelfInjection$Lazy;
.super Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy$SelfInjection;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy$SelfInjection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Lazy"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy$SelfInjection$Lazy$Dispatcher;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/dynamic/NexusAccessor;

    .line 2
    .line 3
    invoke-direct {v0}, Lnet/bytebuddy/dynamic/NexusAccessor;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy$SelfInjection$Lazy;-><init>(Lnet/bytebuddy/dynamic/NexusAccessor;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/dynamic/NexusAccessor;)V
    .locals 0

    .line 10
    invoke-direct {p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy$SelfInjection;-><init>(Lnet/bytebuddy/dynamic/NexusAccessor;)V

    return-void
.end method


# virtual methods
.method public dispatcher(I)Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy$Dispatcher;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy$SelfInjection$Lazy$Dispatcher;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy$SelfInjection;->nexusAccessor:Lnet/bytebuddy/dynamic/NexusAccessor;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy$SelfInjection$Lazy$Dispatcher;-><init>(Lnet/bytebuddy/dynamic/NexusAccessor;I)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
