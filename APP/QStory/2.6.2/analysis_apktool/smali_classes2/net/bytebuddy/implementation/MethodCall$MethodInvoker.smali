.class public interface abstract Lnet/bytebuddy/implementation/MethodCall$MethodInvoker;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


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
