.class public interface abstract Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$SimpleModuleFinder;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "SimpleModuleFinder"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$SimpleModuleFinder$CreationAction;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Proxied;
    value = "net.bytebuddy.dynamic.loading.SimpleModuleFinder"
.end annotation


# virtual methods
.method public abstract newInstance(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .annotation runtime Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$IsConstructor;
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Proxied;
        value = "newInstance"
    .end annotation
.end method
