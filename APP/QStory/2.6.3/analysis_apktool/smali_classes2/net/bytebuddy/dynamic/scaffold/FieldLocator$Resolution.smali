.class public interface abstract Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Resolution;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/scaffold/FieldLocator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Resolution"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Resolution$Simple;,
        Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Resolution$Illegal;
    }
.end annotation


# virtual methods
.method public abstract getField()Lnet/bytebuddy/description/field/FieldDescription;
.end method

.method public abstract isResolved()Z
.end method
