.class public interface abstract Lnet/bytebuddy/description/ByteCodeElement;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/description/NamedElement$WithRuntimeName;
.implements Lnet/bytebuddy/description/NamedElement$WithDescriptor;
.implements Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;
.implements Lnet/bytebuddy/description/DeclaredByType;
.implements Lnet/bytebuddy/description/annotation/AnnotationSource;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/description/ByteCodeElement$Token;,
        Lnet/bytebuddy/description/ByteCodeElement$Member;,
        Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;
    }
.end annotation


# virtual methods
.method public abstract isAccessibleTo(Lnet/bytebuddy/description/type/TypeDescription;)Z
.end method

.method public abstract isVisibleTo(Lnet/bytebuddy/description/type/TypeDescription;)Z
.end method
