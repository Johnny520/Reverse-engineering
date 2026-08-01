.class public interface abstract Lnet/bytebuddy/dynamic/loading/ClassLoaderDecorator;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/dynamic/loading/ClassLoaderDecorator$Factory;,
        Lnet/bytebuddy/dynamic/loading/ClassLoaderDecorator$NoOp;
    }
.end annotation


# virtual methods
.method public abstract apply(Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/ClassLoader;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end method

.method public abstract isSkipped(Lnet/bytebuddy/description/type/TypeDescription;)Z
.end method
