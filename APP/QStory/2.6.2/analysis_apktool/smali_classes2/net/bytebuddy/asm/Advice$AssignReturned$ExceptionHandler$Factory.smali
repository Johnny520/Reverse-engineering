.class public interface abstract Lnet/bytebuddy/asm/Advice$AssignReturned$ExceptionHandler$Factory;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$AssignReturned$ExceptionHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Factory"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/Advice$AssignReturned$ExceptionHandler$Factory$Enabled;,
        Lnet/bytebuddy/asm/Advice$AssignReturned$ExceptionHandler$Factory$NoOp;
    }
.end annotation


# virtual methods
.method public abstract wrap(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForPostProcessor;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
.end method
