.class public interface abstract Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;
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
    name = "ForAdvice"
.end annotation


# virtual methods
.method public abstract recordMaxima(II)V
.end method

.method public abstract requireLocalVariableLengthPadding(I)V
.end method

.method public abstract requireStackSizePadding(I)V
.end method
