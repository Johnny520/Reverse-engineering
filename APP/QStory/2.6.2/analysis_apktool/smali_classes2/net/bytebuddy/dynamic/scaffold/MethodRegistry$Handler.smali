.class public interface abstract Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Handler;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Prepareable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/scaffold/MethodRegistry;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Handler"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Handler$ForAnnotationValue;,
        Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Handler$ForImplementation;,
        Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Handler$Compiled;,
        Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Handler$ForVisibilityBridge;,
        Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Handler$ForAbstractMethod;
    }
.end annotation


# virtual methods
.method public abstract compile(Lnet/bytebuddy/implementation/Implementation$Target;)Lnet/bytebuddy/dynamic/scaffold/MethodRegistry$Handler$Compiled;
.end method
