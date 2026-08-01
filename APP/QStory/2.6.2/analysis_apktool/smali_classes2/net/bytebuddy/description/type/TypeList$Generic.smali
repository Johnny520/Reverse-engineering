.class public interface abstract Lnet/bytebuddy/description/type/TypeList$Generic;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/matcher/FilterableList;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/type/TypeList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Generic"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/description/type/TypeList$Generic$Empty;,
        Lnet/bytebuddy/description/type/TypeList$Generic$OfMethodExceptionTypes;,
        Lnet/bytebuddy/description/type/TypeList$Generic$OfConstructorExceptionTypes;,
        Lnet/bytebuddy/description/type/TypeList$Generic$OfLoadedInterfaceTypes;,
        Lnet/bytebuddy/description/type/TypeList$Generic$ForDetachedTypes;,
        Lnet/bytebuddy/description/type/TypeList$Generic$ForLoadedTypes;,
        Lnet/bytebuddy/description/type/TypeList$Generic$Explicit;,
        Lnet/bytebuddy/description/type/TypeList$Generic$AbstractBase;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lnet/bytebuddy/matcher/FilterableList<",
        "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
        "Lnet/bytebuddy/description/type/TypeList$Generic;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Lnet/bytebuddy/description/type/TypeList$Generic;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ">;)",
            "Lnet/bytebuddy/description/type/TypeList$Generic;"
        }
    .end annotation
.end method

.method public abstract asErasures()Lnet/bytebuddy/description/type/TypeList;
.end method

.method public abstract asRawTypes()Lnet/bytebuddy/description/type/TypeList$Generic;
.end method

.method public abstract asTokenList(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/description/ByteCodeElement$Token$TokenList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;)",
            "Lnet/bytebuddy/description/ByteCodeElement$Token$TokenList<",
            "Lnet/bytebuddy/description/type/TypeVariableToken;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getStackSize()I
.end method
