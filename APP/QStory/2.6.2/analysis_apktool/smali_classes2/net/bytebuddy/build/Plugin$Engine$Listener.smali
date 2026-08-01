.class public interface abstract Lnet/bytebuddy/build/Plugin$Engine$Listener;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/Plugin$Engine;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Listener"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/build/Plugin$Engine$Listener$Compound;,
        Lnet/bytebuddy/build/Plugin$Engine$Listener$ForErrorHandler;,
        Lnet/bytebuddy/build/Plugin$Engine$Listener$WithErrorsOnly;,
        Lnet/bytebuddy/build/Plugin$Engine$Listener$WithTransformationsOnly;,
        Lnet/bytebuddy/build/Plugin$Engine$Listener$StreamWriting;,
        Lnet/bytebuddy/build/Plugin$Engine$Listener$Adapter;,
        Lnet/bytebuddy/build/Plugin$Engine$Listener$NoOp;
    }
.end annotation


# virtual methods
.method public abstract onComplete(Lnet/bytebuddy/description/type/TypeDescription;)V
.end method

.method public abstract onDiscovery(Ljava/lang/String;)V
.end method

.method public abstract onIgnored(Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/build/Plugin;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract onIgnored(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/build/Plugin;)V
.end method

.method public abstract onTransformation(Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/build/Plugin;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract onTransformation(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/build/Plugin;)V
.end method
