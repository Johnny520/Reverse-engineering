.class public interface abstract Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "PoolStrategy"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$WithTypePoolCache;,
        Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$ClassLoading;,
        Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$Eager;,
        Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$ExtraLazy;,
        Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$Default;
    }
.end annotation


# virtual methods
.method public abstract typePool(Lnet/bytebuddy/dynamic/ClassFileLocator;Ljava/lang/ClassLoader;)Lnet/bytebuddy/pool/TypePool;
    .param p2    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
.end method

.method public abstract typePool(Lnet/bytebuddy/dynamic/ClassFileLocator;Ljava/lang/ClassLoader;Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool;
    .param p2    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
.end method
