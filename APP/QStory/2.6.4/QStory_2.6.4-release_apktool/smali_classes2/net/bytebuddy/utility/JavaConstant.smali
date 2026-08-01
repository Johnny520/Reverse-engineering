.class public interface abstract Lnet/bytebuddy/utility/JavaConstant;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/utility/ConstantValue;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/utility/JavaConstant$Dynamic;,
        Lnet/bytebuddy/utility/JavaConstant$MethodHandle;,
        Lnet/bytebuddy/utility/JavaConstant$MethodType;,
        Lnet/bytebuddy/utility/JavaConstant$Simple;,
        Lnet/bytebuddy/utility/JavaConstant$Visitor;
    }
.end annotation


# virtual methods
.method public abstract accept(Lnet/bytebuddy/utility/JavaConstant$Visitor;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lnet/bytebuddy/utility/JavaConstant$Visitor<",
            "TT;>;)TT;"
        }
    .end annotation
.end method

.method public abstract toDescription()Ljava/lang/Object;
.end method
