.class public interface abstract Lnet/bytebuddy/dynamic/ClassFileLocator$Resolution;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/ClassFileLocator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Resolution"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/dynamic/ClassFileLocator$Resolution$Explicit;,
        Lnet/bytebuddy/dynamic/ClassFileLocator$Resolution$Illegal;
    }
.end annotation


# virtual methods
.method public abstract isResolved()Z
.end method

.method public abstract resolve()[B
.end method
