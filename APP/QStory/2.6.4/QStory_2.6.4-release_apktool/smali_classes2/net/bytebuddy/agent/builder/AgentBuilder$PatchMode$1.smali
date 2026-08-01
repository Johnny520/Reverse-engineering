.class final enum Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$1;
.super Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4009
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;-><init>(Ljava/lang/String;ILnet/bytebuddy/agent/builder/AgentBuilder$1;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public toHandler(Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;)Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler;
    .locals 0

    .line 1
    new-instance p0, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$ForPatchWithGap;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$ForPatchWithGap;-><init>(Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method
