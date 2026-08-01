.class public interface abstract Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

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
