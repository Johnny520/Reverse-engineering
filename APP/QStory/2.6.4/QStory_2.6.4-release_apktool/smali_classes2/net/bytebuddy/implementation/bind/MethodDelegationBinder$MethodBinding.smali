.class public interface abstract Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/StackManipulation;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/bind/MethodDelegationBinder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "MethodBinding"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder;,
        Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Illegal;
    }
.end annotation


# virtual methods
.method public abstract getTarget()Lnet/bytebuddy/description/method/MethodDescription;
.end method

.method public abstract getTargetParameterIndex(Ljava/lang/Object;)Ljava/lang/Integer;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end method
