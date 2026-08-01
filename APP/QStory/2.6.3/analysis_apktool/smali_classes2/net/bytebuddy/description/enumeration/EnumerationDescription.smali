.class public interface abstract Lnet/bytebuddy/description/enumeration/EnumerationDescription;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/description/NamedElement;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/description/enumeration/EnumerationDescription$Latent;,
        Lnet/bytebuddy/description/enumeration/EnumerationDescription$ForLoadedEnumeration;,
        Lnet/bytebuddy/description/enumeration/EnumerationDescription$AbstractBase;
    }
.end annotation


# virtual methods
.method public abstract getEnumerationType()Lnet/bytebuddy/description/type/TypeDescription;
.end method

.method public abstract getValue()Ljava/lang/String;
.end method

.method public abstract load(Ljava/lang/Class;)Ljava/lang/Enum;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Enum<",
            "TT;>;>(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation
.end method
