.class public interface abstract Lnet/bytebuddy/asm/Advice$StackMapFrameHandler;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "StackMapFrameHandler"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;,
        Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$NoOp;,
        Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;,
        Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForInstrumentedMethod;,
        Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForPostProcessor;
    }
.end annotation


# virtual methods
.method public abstract injectCompletionFrame(Lnet/bytebuddy/jar/asm/MethodVisitor;)V
.end method

.method public abstract injectExceptionFrame(Lnet/bytebuddy/jar/asm/MethodVisitor;)V
.end method

.method public abstract injectReturnFrame(Lnet/bytebuddy/jar/asm/MethodVisitor;)V
.end method

.method public abstract translateFrame(Lnet/bytebuddy/jar/asm/MethodVisitor;II[Ljava/lang/Object;I[Ljava/lang/Object;)V
    .param p4    # [Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p6    # [Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
.end method
