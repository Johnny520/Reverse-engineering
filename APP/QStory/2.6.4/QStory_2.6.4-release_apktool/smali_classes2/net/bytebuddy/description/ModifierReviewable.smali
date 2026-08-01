.class public interface abstract Lnet/bytebuddy/description/ModifierReviewable;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;,
        Lnet/bytebuddy/description/ModifierReviewable$ForModuleRequirement;,
        Lnet/bytebuddy/description/ModifierReviewable$ForModuleDescription;,
        Lnet/bytebuddy/description/ModifierReviewable$ForParameterDescription;,
        Lnet/bytebuddy/description/ModifierReviewable$ForMethodDescription;,
        Lnet/bytebuddy/description/ModifierReviewable$ForFieldDescription;,
        Lnet/bytebuddy/description/ModifierReviewable$ForTypeDefinition;,
        Lnet/bytebuddy/description/ModifierReviewable$OfMandatable;,
        Lnet/bytebuddy/description/ModifierReviewable$OfEnumeration;,
        Lnet/bytebuddy/description/ModifierReviewable$OfAbstraction;,
        Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;
    }
.end annotation


# static fields
.field public static final EMPTY_MASK:I


# virtual methods
.method public abstract getModifiers()I
.end method

.method public abstract getSyntheticState()Lnet/bytebuddy/description/modifier/SyntheticState;
.end method

.method public abstract isFinal()Z
.end method

.method public abstract isSynthetic()Z
.end method
