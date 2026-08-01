.class public interface abstract Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Target$Resolved;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Target;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Resolved"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Target$Resolved$Simple;
    }
.end annotation


# virtual methods
.method public abstract getInternalName()Ljava/lang/String;
.end method

.method public abstract getParameterTypes()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getReturnType()Lnet/bytebuddy/description/type/TypeDescription;
.end method

.method public abstract getStackManipulation()Lnet/bytebuddy/implementation/bytecode/StackManipulation;
.end method
