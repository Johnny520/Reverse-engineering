.class public interface abstract Lnet/bytebuddy/build/Plugin$Engine$Dispatcher;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/Plugin$Engine;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Dispatcher"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForParallelTransformation;,
        Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForSerialTransformation;,
        Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Factory;,
        Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Materializable;
    }
.end annotation


# virtual methods
.method public abstract accept(Ljava/util/concurrent/Callable;Z)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Callable<",
            "+",
            "Ljava/util/concurrent/Callable<",
            "+",
            "Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Materializable;",
            ">;>;Z)V"
        }
    .end annotation
.end method

.method public abstract complete()V
.end method
