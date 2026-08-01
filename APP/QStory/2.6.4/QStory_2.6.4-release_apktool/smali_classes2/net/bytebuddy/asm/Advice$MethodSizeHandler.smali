.class public interface abstract Lnet/bytebuddy/asm/Advice$MethodSizeHandler;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "MethodSizeHandler"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default;,
        Lnet/bytebuddy/asm/Advice$MethodSizeHandler$NoOp;,
        Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;,
        Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForInstrumentedMethod;
    }
.end annotation


# static fields
.field public static final UNDEFINED_SIZE:I = 0x7fff


# virtual methods
.method public abstract requireLocalVariableLength(I)V
.end method

.method public abstract requireStackSize(I)V
.end method
