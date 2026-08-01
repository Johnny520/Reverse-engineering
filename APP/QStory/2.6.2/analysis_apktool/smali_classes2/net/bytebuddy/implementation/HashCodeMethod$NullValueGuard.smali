.class public interface abstract Lnet/bytebuddy/implementation/HashCodeMethod$NullValueGuard;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/HashCodeMethod;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "NullValueGuard"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/HashCodeMethod$NullValueGuard$UsingJump;,
        Lnet/bytebuddy/implementation/HashCodeMethod$NullValueGuard$NoOp;
    }
.end annotation


# virtual methods
.method public abstract after()Lnet/bytebuddy/implementation/bytecode/StackManipulation;
.end method

.method public abstract before()Lnet/bytebuddy/implementation/bytecode/StackManipulation;
.end method

.method public abstract getRequiredVariablePadding()I
.end method
