.class public interface abstract Lnet/bytebuddy/description/ModifierReviewable$ForModuleRequirement;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/description/ModifierReviewable$OfMandatable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/ModifierReviewable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "ForModuleRequirement"
.end annotation


# virtual methods
.method public abstract getRequiredPhase()Lnet/bytebuddy/description/modifier/RequiredPhase;
.end method

.method public abstract getTransitivity()Lnet/bytebuddy/description/modifier/Transitivity;
.end method

.method public abstract isStaticPhase()Z
.end method

.method public abstract isTransitive()Z
.end method
