.class public interface abstract Lnet/bytebuddy/description/ModifierReviewable$ForMethodDescription;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/description/ModifierReviewable$OfAbstraction;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/ModifierReviewable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "ForMethodDescription"
.end annotation


# virtual methods
.method public abstract getMethodManifestation()Lnet/bytebuddy/description/modifier/MethodManifestation;
.end method

.method public abstract getMethodStrictness()Lnet/bytebuddy/description/modifier/MethodStrictness;
.end method

.method public abstract getSynchronizationState()Lnet/bytebuddy/description/modifier/SynchronizationState;
.end method

.method public abstract isBridge()Z
.end method

.method public abstract isNative()Z
.end method

.method public abstract isStrict()Z
.end method

.method public abstract isSynchronized()Z
.end method

.method public abstract isVarArgs()Z
.end method
