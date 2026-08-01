.class public interface abstract Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


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
