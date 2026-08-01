.class public interface abstract Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$Dispatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "SuppressionHandler"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Suppressing;,
        Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$NoOp;,
        Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;
    }
.end annotation


# virtual methods
.method public abstract bind(Lnet/bytebuddy/implementation/bytecode/StackManipulation;)Lnet/bytebuddy/asm/Advice$Dispatcher$SuppressionHandler$Bound;
.end method
