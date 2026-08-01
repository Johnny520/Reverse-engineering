.class public interface abstract Lnet/bytebuddy/description/field/FieldDescription;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/description/ModifierReviewable$ForFieldDescription;
.implements Lnet/bytebuddy/description/DeclaredByType$WithMandatoryDeclaration;
.implements Lnet/bytebuddy/description/ByteCodeElement$Member;
.implements Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/description/field/FieldDescription$SignatureToken;,
        Lnet/bytebuddy/description/field/FieldDescription$Token;,
        Lnet/bytebuddy/description/field/FieldDescription$TypeSubstituting;,
        Lnet/bytebuddy/description/field/FieldDescription$Latent;,
        Lnet/bytebuddy/description/field/FieldDescription$ForLoadedField;,
        Lnet/bytebuddy/description/field/FieldDescription$AbstractBase;,
        Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;,
        Lnet/bytebuddy/description/field/FieldDescription$InGenericShape;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lnet/bytebuddy/description/ModifierReviewable$ForFieldDescription;",
        "Lnet/bytebuddy/description/DeclaredByType$WithMandatoryDeclaration;",
        "Lnet/bytebuddy/description/ByteCodeElement$Member;",
        "Lnet/bytebuddy/description/ByteCodeElement$TypeDependant<",
        "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
        "Lnet/bytebuddy/description/field/FieldDescription$Token;",
        ">;"
    }
.end annotation


# static fields
.field public static final NO_DEFAULT_VALUE:Ljava/lang/Object;
    .annotation runtime Lnet/bytebuddy/utility/nullability/AlwaysNull;
    .end annotation
.end field


# virtual methods
.method public abstract asSignatureToken()Lnet/bytebuddy/description/field/FieldDescription$SignatureToken;
.end method

.method public abstract getActualModifiers()I
.end method

.method public abstract getDeclaringType()Lnet/bytebuddy/description/type/TypeDefinition;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end method

.method public abstract getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;
.end method
