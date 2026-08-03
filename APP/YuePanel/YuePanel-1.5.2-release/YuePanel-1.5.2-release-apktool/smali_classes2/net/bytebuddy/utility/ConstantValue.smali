.class public interface abstract Lnet/bytebuddy/utility/ConstantValue;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/utility/ConstantValue$Simple;
    }
.end annotation


# virtual methods
.method public abstract getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;
.end method

.method public abstract toStackManipulation()Lnet/bytebuddy/implementation/bytecode/StackManipulation;
.end method
