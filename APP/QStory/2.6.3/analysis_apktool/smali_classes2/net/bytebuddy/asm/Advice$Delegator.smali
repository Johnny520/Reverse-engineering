.class public interface abstract Lnet/bytebuddy/asm/Advice$Delegator;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Delegator"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/Advice$Delegator$ForDynamicInvocation;,
        Lnet/bytebuddy/asm/Advice$Delegator$ForRegularInvocation;,
        Lnet/bytebuddy/asm/Advice$Delegator$Factory;
    }
.end annotation


# virtual methods
.method public abstract apply(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
.end method

.method public abstract assertVisibility(Lnet/bytebuddy/description/type/TypeDescription;)V
.end method

.method public abstract getTypeToken()Lnet/bytebuddy/description/method/MethodDescription$TypeToken;
.end method
