.class public interface abstract Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Handler"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$ForPatchWithSubstitution;,
        Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$ForPatchWithOverlap;,
        Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$ForPatchWithGap;,
        Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$NoOp;
    }
.end annotation


# virtual methods
.method public abstract onAfterRegistration(Ljava/lang/instrument/Instrumentation;)V
.end method

.method public abstract onBeforeRegistration(Ljava/lang/instrument/Instrumentation;)V
.end method

.method public abstract onRegistration(Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;)Z
.end method
