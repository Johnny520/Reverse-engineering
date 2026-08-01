.class public interface abstract Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


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
