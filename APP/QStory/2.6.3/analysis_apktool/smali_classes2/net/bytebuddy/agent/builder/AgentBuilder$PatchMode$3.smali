.class final enum Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$3;
.super Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


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
    instance-of p0, p1, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$Substitutable;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    new-instance p0, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$ForPatchWithSubstitution;

    .line 6
    .line 7
    check-cast p1, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$Substitutable;

    .line 8
    .line 9
    invoke-direct {p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$ForPatchWithSubstitution;-><init>(Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$Substitutable;)V

    .line 10
    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    const-string p0, "Original class file transformer is not substitutable: "

    .line 14
    .line 15
    invoke-static {p1, p0}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    return-object p0
.end method
