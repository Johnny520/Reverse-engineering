.class public interface abstract Lnet/bytebuddy/build/Plugin$Engine$Target;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/Plugin$Engine;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Target"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/build/Plugin$Engine$Target$ForJarFile;,
        Lnet/bytebuddy/build/Plugin$Engine$Target$ForFolder;,
        Lnet/bytebuddy/build/Plugin$Engine$Target$InMemory;,
        Lnet/bytebuddy/build/Plugin$Engine$Target$Discarding;,
        Lnet/bytebuddy/build/Plugin$Engine$Target$Sink;
    }
.end annotation


# virtual methods
.method public abstract write(Ljava/util/jar/Manifest;)Lnet/bytebuddy/build/Plugin$Engine$Target$Sink;
    .param p1    # Ljava/util/jar/Manifest;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
.end method
