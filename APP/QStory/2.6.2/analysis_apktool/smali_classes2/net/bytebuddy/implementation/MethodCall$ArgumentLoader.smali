.class public interface abstract Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/MethodCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "ArgumentLoader"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForStackManipulation;,
        Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodCall;,
        Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForField;,
        Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForInstance;,
        Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodParameterArrayElement;,
        Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodParameterArray;,
        Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodParameter;,
        Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForInstrumentedType;,
        Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForThisReference;,
        Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForNullConstant;,
        Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;,
        Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ArgumentProvider;
    }
.end annotation


# virtual methods
.method public abstract toStackManipulation(Lnet/bytebuddy/description/method/ParameterDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
.end method
