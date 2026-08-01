.class public interface abstract Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


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
