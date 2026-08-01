.class public interface abstract Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Prepareable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/MethodDelegation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "ImplementationDelegate"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate$ForConstruction;,
        Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate$ForMethodReturn;,
        Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate$ForField;,
        Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate$ForStaticMethod;,
        Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate$Compiled;
    }
.end annotation


# static fields
.field public static final FIELD_NAME_PREFIX:Ljava/lang/String; = "delegate"


# virtual methods
.method public abstract compile(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate$Compiled;
.end method
