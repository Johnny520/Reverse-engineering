.class public interface abstract Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Target$Resolved;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


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
