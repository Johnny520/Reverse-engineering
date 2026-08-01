.class public interface abstract Lnet/bytebuddy/pool/TypePool$CacheProvider;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/pool/TypePool;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "CacheProvider"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/pool/TypePool$CacheProvider$Discriminating;,
        Lnet/bytebuddy/pool/TypePool$CacheProvider$WithIllegalResolutionReattempt;,
        Lnet/bytebuddy/pool/TypePool$CacheProvider$Simple;,
        Lnet/bytebuddy/pool/TypePool$CacheProvider$NoOp;
    }
.end annotation


# static fields
.field public static final UNRESOLVED:Lnet/bytebuddy/pool/TypePool$Resolution;
    .annotation runtime Lnet/bytebuddy/utility/nullability/AlwaysNull;
    .end annotation
.end field


# virtual methods
.method public abstract clear()V
.end method

.method public abstract find(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end method

.method public abstract register(Ljava/lang/String;Lnet/bytebuddy/pool/TypePool$Resolution;)Lnet/bytebuddy/pool/TypePool$Resolution;
.end method
