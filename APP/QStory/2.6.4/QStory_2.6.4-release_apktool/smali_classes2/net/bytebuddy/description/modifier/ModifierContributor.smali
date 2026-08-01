.class public interface abstract Lnet/bytebuddy/description/modifier/ModifierContributor;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


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
