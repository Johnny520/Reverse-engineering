.class final enum Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$1;
.super Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;
.source "SourceFile"


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

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;-><init>(Ljava/lang/String;ILnet/bytebuddy/agent/builder/AgentBuilder$1;)V

    return-void
.end method


# virtual methods
.method public toHandler(Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;)Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler;
    .locals 1

    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$ForPatchWithGap;

    invoke-direct {v0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$ForPatchWithGap;-><init>(Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;)V

    return-object v0
.end method
