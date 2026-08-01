.class public interface abstract Lnet/bytebuddy/dynamic/scaffold/FieldLocator;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


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
