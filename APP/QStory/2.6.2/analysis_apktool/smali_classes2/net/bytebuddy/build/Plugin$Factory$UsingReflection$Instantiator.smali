.class public interface abstract Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/Plugin$Factory$UsingReflection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Instantiator"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Resolved;,
        Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Ambiguous;,
        Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Unresolved;
    }
.end annotation


# virtual methods
.method public abstract instantiate()Lnet/bytebuddy/build/Plugin;
.end method

.method public abstract replaceBy(Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Resolved;)Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator;
.end method
