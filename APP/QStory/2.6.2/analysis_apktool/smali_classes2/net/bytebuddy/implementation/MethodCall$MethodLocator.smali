.class public interface abstract Lnet/bytebuddy/implementation/MethodCall$MethodLocator;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/MethodCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "MethodLocator"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/MethodCall$MethodLocator$ForElementMatcher;,
        Lnet/bytebuddy/implementation/MethodCall$MethodLocator$ForExplicitMethod;,
        Lnet/bytebuddy/implementation/MethodCall$MethodLocator$ForInstrumentedMethod;,
        Lnet/bytebuddy/implementation/MethodCall$MethodLocator$Factory;
    }
.end annotation


# virtual methods
.method public abstract resolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/description/method/MethodDescription;
.end method
