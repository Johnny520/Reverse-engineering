.class public interface abstract Lnet/bytebuddy/description/ModifierReviewable$ForModuleRequirement;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

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
