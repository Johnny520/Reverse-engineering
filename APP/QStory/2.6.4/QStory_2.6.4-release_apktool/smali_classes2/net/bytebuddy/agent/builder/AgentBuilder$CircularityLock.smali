.class public interface abstract Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


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
