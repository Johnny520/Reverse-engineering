.class public interface abstract Lnet/bytebuddy/dynamic/loading/ClassLoaderDecorator$Factory;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/loading/ClassLoaderDecorator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Factory"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/dynamic/loading/ClassLoaderDecorator$Factory$NoOp;
    }
.end annotation


# virtual methods
.method public abstract make(Ljava/lang/ClassLoader;Ljava/util/Map;)Lnet/bytebuddy/dynamic/loading/ClassLoaderDecorator;
    .param p1    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "[B>;)",
            "Lnet/bytebuddy/dynamic/loading/ClassLoaderDecorator;"
        }
    .end annotation
.end method
