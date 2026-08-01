.class public interface abstract Lnet/bytebuddy/implementation/HashCodeMethod$NullValueGuard;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


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
