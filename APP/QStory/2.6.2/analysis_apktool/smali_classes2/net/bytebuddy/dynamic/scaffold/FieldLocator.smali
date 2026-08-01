.class public interface abstract Lnet/bytebuddy/dynamic/scaffold/FieldLocator;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/dynamic/scaffold/FieldLocator$ForTopLevelType;,
        Lnet/bytebuddy/dynamic/scaffold/FieldLocator$ForClassHierarchy;,
        Lnet/bytebuddy/dynamic/scaffold/FieldLocator$ForExactType;,
        Lnet/bytebuddy/dynamic/scaffold/FieldLocator$AbstractBase;,
        Lnet/bytebuddy/dynamic/scaffold/FieldLocator$NoOp;,
        Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Factory;,
        Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Resolution;
    }
.end annotation


# virtual methods
.method public abstract locate(Ljava/lang/String;)Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Resolution;
.end method

.method public abstract locate(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Resolution;
.end method
