.class public interface abstract Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$SimpleModuleFinder;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


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
