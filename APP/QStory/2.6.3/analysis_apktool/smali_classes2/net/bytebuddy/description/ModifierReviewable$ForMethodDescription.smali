.class public interface abstract Lnet/bytebuddy/description/ModifierReviewable$ForMethodDescription;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

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
