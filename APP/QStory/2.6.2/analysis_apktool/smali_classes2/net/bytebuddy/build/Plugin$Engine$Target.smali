.class public interface abstract Lnet/bytebuddy/build/Plugin$Engine$Target;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


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
