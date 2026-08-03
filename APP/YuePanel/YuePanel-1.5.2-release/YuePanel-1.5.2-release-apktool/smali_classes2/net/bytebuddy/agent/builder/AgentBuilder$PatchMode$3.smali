.class final enum Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$3;
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
    .locals 3

    instance-of v0, p1, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$Substitutable;

    if-eqz v0, :cond_0

    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$ForPatchWithSubstitution;

    check-cast p1, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$Substitutable;

    invoke-direct {v0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$ForPatchWithSubstitution;-><init>(Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$Substitutable;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Original class file transformer is not substitutable: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
