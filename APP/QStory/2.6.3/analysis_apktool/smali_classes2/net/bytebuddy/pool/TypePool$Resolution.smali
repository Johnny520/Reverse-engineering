.class public interface abstract Lnet/bytebuddy/pool/TypePool$Resolution;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/pool/TypePool;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Resolution"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/pool/TypePool$Resolution$NoSuchTypeException;,
        Lnet/bytebuddy/pool/TypePool$Resolution$Illegal;,
        Lnet/bytebuddy/pool/TypePool$Resolution$Simple;
    }
.end annotation


# virtual methods
.method public abstract isResolved()Z
.end method

.method public abstract resolve()Lnet/bytebuddy/description/type/TypeDescription;
.end method
