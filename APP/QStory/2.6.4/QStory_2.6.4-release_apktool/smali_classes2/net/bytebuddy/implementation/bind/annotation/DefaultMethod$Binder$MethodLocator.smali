.class public interface abstract Lnet/bytebuddy/implementation/bind/annotation/DefaultMethod$Binder$MethodLocator;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/bind/annotation/DefaultMethod$Binder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "MethodLocator"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/bind/annotation/DefaultMethod$Binder$MethodLocator$ForExplicitType;,
        Lnet/bytebuddy/implementation/bind/annotation/DefaultMethod$Binder$MethodLocator$ForImplicitType;
    }
.end annotation


# virtual methods
.method public abstract resolve(Lnet/bytebuddy/implementation/Implementation$Target;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation;
.end method
