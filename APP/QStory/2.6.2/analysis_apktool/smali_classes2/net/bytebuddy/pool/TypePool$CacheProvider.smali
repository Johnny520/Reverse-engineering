.class public interface abstract Lnet/bytebuddy/pool/TypePool$CacheProvider;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


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
