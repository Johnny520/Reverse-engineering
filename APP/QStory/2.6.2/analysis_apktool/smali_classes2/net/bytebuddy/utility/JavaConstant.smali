.class public interface abstract Lnet/bytebuddy/utility/JavaConstant;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

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
