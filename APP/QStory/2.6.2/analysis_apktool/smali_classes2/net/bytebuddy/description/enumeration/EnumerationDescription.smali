.class public interface abstract Lnet/bytebuddy/description/enumeration/EnumerationDescription;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

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
