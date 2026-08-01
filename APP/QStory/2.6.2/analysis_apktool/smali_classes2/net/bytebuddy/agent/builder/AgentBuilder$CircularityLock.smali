.class public interface abstract Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "CircularityLock"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$Global;,
        Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$Default;,
        Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$WithInnerClassLoadingLock;,
        Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$Inactive;
    }
.end annotation


# virtual methods
.method public abstract acquire()Z
.end method

.method public abstract release()V
.end method
