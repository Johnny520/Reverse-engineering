.class public interface abstract Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/pool/TypePool$Default;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "AnnotationRegistrant"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant$ForTypeVariable;,
        Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant$ForByteCodeElement;,
        Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant$AbstractBase;
    }
.end annotation


# virtual methods
.method public abstract onComplete()V
.end method

.method public abstract register(Ljava/lang/String;Lnet/bytebuddy/description/annotation/AnnotationValue;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "**>;)V"
        }
    .end annotation
.end method
