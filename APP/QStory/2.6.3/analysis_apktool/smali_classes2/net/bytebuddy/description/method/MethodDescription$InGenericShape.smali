.class public interface abstract Lnet/bytebuddy/description/method/MethodDescription$InGenericShape;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/description/method/MethodDescription;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/method/MethodDescription;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "InGenericShape"
.end annotation


# virtual methods
.method public abstract getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end method

.method public abstract getParameters()Lnet/bytebuddy/description/method/ParameterList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/description/method/ParameterList<",
            "Lnet/bytebuddy/description/method/ParameterDescription$InGenericShape;",
            ">;"
        }
    .end annotation
.end method
