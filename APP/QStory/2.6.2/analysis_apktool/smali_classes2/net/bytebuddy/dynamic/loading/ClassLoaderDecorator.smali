.class public interface abstract Lnet/bytebuddy/dynamic/loading/ClassLoaderDecorator;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


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
