.class public interface abstract Lnet/bytebuddy/dynamic/loading/ClassLoaderDecorator;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


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
