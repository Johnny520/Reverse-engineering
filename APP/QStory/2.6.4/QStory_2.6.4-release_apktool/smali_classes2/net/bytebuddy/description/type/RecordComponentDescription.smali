.class public interface abstract Lnet/bytebuddy/description/type/RecordComponentDescription;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/description/DeclaredByType$WithMandatoryDeclaration;
.implements Lnet/bytebuddy/description/NamedElement$WithDescriptor;
.implements Lnet/bytebuddy/description/annotation/AnnotationSource;
.implements Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/description/type/RecordComponentDescription$Token;,
        Lnet/bytebuddy/description/type/RecordComponentDescription$TypeSubstituting;,
        Lnet/bytebuddy/description/type/RecordComponentDescription$Latent;,
        Lnet/bytebuddy/description/type/RecordComponentDescription$ForLoadedRecordComponent;,
        Lnet/bytebuddy/description/type/RecordComponentDescription$AbstractBase;,
        Lnet/bytebuddy/description/type/RecordComponentDescription$InDefinedShape;,
        Lnet/bytebuddy/description/type/RecordComponentDescription$InGenericShape;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lnet/bytebuddy/description/DeclaredByType$WithMandatoryDeclaration;",
        "Lnet/bytebuddy/description/NamedElement$WithDescriptor;",
        "Lnet/bytebuddy/description/annotation/AnnotationSource;",
        "Lnet/bytebuddy/description/ByteCodeElement$TypeDependant<",
        "Lnet/bytebuddy/description/type/RecordComponentDescription$InDefinedShape;",
        "Lnet/bytebuddy/description/type/RecordComponentDescription$Token;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract asToken(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/description/type/RecordComponentDescription$Token;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;)",
            "Lnet/bytebuddy/description/type/RecordComponentDescription$Token;"
        }
    .end annotation
.end method

.method public abstract getAccessor()Lnet/bytebuddy/description/method/MethodDescription;
.end method

.method public abstract getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;
.end method
