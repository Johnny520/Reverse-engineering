.class public interface abstract Lnet/bytebuddy/build/BuildLogger;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/build/BuildLogger$Compound;,
        Lnet/bytebuddy/build/BuildLogger$StreamWriting;,
        Lnet/bytebuddy/build/BuildLogger$Adapter;,
        Lnet/bytebuddy/build/BuildLogger$NoOp;
    }
.end annotation


# virtual methods
.method public abstract debug(Ljava/lang/String;)V
.end method

.method public abstract debug(Ljava/lang/String;Ljava/lang/Throwable;)V
.end method

.method public abstract error(Ljava/lang/String;)V
.end method

.method public abstract error(Ljava/lang/String;Ljava/lang/Throwable;)V
.end method

.method public abstract info(Ljava/lang/String;)V
.end method

.method public abstract info(Ljava/lang/String;Ljava/lang/Throwable;)V
.end method

.method public abstract isDebugEnabled()Z
.end method

.method public abstract isErrorEnabled()Z
.end method

.method public abstract isInfoEnabled()Z
.end method

.method public abstract isWarnEnabled()Z
.end method

.method public abstract warn(Ljava/lang/String;)V
.end method

.method public abstract warn(Ljava/lang/String;Ljava/lang/Throwable;)V
.end method
