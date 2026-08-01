.class public interface abstract Lnet/bytebuddy/description/modifier/ModifierContributor;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/description/modifier/ModifierContributor$Resolver;,
        Lnet/bytebuddy/description/modifier/ModifierContributor$ForParameter;,
        Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;,
        Lnet/bytebuddy/description/modifier/ModifierContributor$ForField;,
        Lnet/bytebuddy/description/modifier/ModifierContributor$ForModule;,
        Lnet/bytebuddy/description/modifier/ModifierContributor$ForType;
    }
.end annotation


# static fields
.field public static final EMPTY_MASK:I


# virtual methods
.method public abstract getMask()I
.end method

.method public abstract getRange()I
.end method

.method public abstract isDefault()Z
.end method
