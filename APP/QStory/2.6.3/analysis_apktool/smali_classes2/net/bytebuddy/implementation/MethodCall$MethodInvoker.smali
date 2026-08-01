.class public interface abstract Lnet/bytebuddy/implementation/MethodCall$MethodInvoker;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/MethodCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "MethodInvoker"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$ForDefaultMethodInvocation;,
        Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$ForSuperMethodInvocation;,
        Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$ForVirtualInvocation;,
        Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$ForContextualInvocation;,
        Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$Factory;
    }
.end annotation


# virtual methods
.method public abstract toStackManipulation(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/Implementation$Target;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
.end method
