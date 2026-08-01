.class public interface abstract Lnet/bytebuddy/build/Plugin$Engine$Source;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/Plugin$Engine;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Source"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/build/Plugin$Engine$Source$Filtering;,
        Lnet/bytebuddy/build/Plugin$Engine$Source$ForJarFile;,
        Lnet/bytebuddy/build/Plugin$Engine$Source$ForFolder;,
        Lnet/bytebuddy/build/Plugin$Engine$Source$InMemory;,
        Lnet/bytebuddy/build/Plugin$Engine$Source$Compound;,
        Lnet/bytebuddy/build/Plugin$Engine$Source$Empty;,
        Lnet/bytebuddy/build/Plugin$Engine$Source$Element;,
        Lnet/bytebuddy/build/Plugin$Engine$Source$Origin;
    }
.end annotation


# virtual methods
.method public abstract read()Lnet/bytebuddy/build/Plugin$Engine$Source$Origin;
.end method
