.class public Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$ForPatchWithGap;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForPatchWithGap"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final classFileTransformer:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$ForPatchWithGap;->classFileTransformer:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$ForPatchWithGap;->classFileTransformer:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    check-cast p1, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$ForPatchWithGap;

    iget-object p1, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$ForPatchWithGap;->classFileTransformer:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v1

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$ForPatchWithGap;->classFileTransformer:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public onAfterRegistration(Ljava/lang/instrument/Instrumentation;)V
    .locals 0

    return-void
.end method

.method public onBeforeRegistration(Ljava/lang/instrument/Instrumentation;)V
    .locals 2

    iget-object v0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$ForPatchWithGap;->classFileTransformer:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    sget-object v1, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;->DISABLED:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;

    invoke-interface {v0, p1, v1}, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;->reset(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to deregister patched class file transformer: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$ForPatchWithGap;->classFileTransformer:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public onRegistration(Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
