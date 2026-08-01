.class public interface abstract Lnet/bytebuddy/description/NamedElement$WithRuntimeName;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/description/NamedElement;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/NamedElement;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "WithRuntimeName"
.end annotation


# virtual methods
.method public abstract getInternalName()Ljava/lang/String;
.end method

.method public abstract getName()Ljava/lang/String;
.end method
