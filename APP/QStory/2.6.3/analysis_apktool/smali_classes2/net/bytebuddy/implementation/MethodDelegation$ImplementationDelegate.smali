.class public interface abstract Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

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
