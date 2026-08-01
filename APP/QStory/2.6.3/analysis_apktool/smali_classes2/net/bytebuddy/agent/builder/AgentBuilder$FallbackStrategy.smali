.class public interface abstract Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "FallbackStrategy"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy$ByThrowableType;,
        Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy$Simple;
    }
.end annotation


# virtual methods
.method public abstract isFallback(Ljava/lang/Class;Ljava/lang/Throwable;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Throwable;",
            ")Z"
        }
    .end annotation
.end method
