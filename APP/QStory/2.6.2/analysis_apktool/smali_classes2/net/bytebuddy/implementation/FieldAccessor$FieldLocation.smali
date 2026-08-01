.class public interface abstract Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/FieldAccessor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "FieldLocation"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation$Relative;,
        Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation$Absolute;,
        Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation$Prepared;
    }
.end annotation


# virtual methods
.method public abstract prepare(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation$Prepared;
.end method

.method public abstract with(Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Factory;)Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation;
.end method
