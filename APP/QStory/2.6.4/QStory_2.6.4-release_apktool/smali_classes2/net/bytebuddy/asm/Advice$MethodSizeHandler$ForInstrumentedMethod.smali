.class public interface abstract Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForInstrumentedMethod;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/asm/Advice$MethodSizeHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$MethodSizeHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "ForInstrumentedMethod"
.end annotation


# virtual methods
.method public abstract bindEnter(Lnet/bytebuddy/description/method/MethodDescription$TypeToken;)Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;
.end method

.method public abstract bindExit(Lnet/bytebuddy/description/method/MethodDescription$TypeToken;)Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;
.end method

.method public abstract compoundLocalVariableLength(I)I
.end method

.method public abstract compoundStackSize(I)I
.end method
