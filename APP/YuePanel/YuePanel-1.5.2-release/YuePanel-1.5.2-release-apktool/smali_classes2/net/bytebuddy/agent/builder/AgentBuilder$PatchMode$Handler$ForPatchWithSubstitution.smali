.class public Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$ForPatchWithSubstitution;
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
    name = "ForPatchWithSubstitution"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final classFileTransformer:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$Substitutable;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$Substitutable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$ForPatchWithSubstitution;->classFileTransformer:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$Substitutable;

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
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$ForPatchWithSubstitution;->classFileTransformer:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$Substitutable;

    check-cast p1, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$ForPatchWithSubstitution;

    iget-object p1, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$ForPatchWithSubstitution;->classFileTransformer:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$Substitutable;

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

    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$ForPatchWithSubstitution;->classFileTransformer:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$Substitutable;

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
    .locals 0

    return-void
.end method

.method public onRegistration(Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;)Z
    .locals 1

    iget-object v0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$ForPatchWithSubstitution;->classFileTransformer:Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$Substitutable;

    invoke-interface {v0, p1}, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$Substitutable;->substitute(Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;)V

    const/4 p1, 0x0

    return p1
.end method
