.class public interface abstract Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/EqualsMethod;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "NullValueGuard"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;,
        Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$NoOp;
    }
.end annotation


# virtual methods
.method public abstract after()Lnet/bytebuddy/implementation/bytecode/StackManipulation;
.end method

.method public abstract before()Lnet/bytebuddy/implementation/bytecode/StackManipulation;
.end method

.method public abstract getRequiredVariablePadding()I
.end method
