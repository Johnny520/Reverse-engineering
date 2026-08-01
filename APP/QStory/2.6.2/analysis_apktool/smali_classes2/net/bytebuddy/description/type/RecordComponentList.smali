.class public interface abstract Lnet/bytebuddy/description/type/RecordComponentList;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/matcher/FilterableList;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/description/type/RecordComponentList$Empty;,
        Lnet/bytebuddy/description/type/RecordComponentList$TypeSubstituting;,
        Lnet/bytebuddy/description/type/RecordComponentList$ForTokens;,
        Lnet/bytebuddy/description/type/RecordComponentList$Explicit;,
        Lnet/bytebuddy/description/type/RecordComponentList$ForLoadedRecordComponents;,
        Lnet/bytebuddy/description/type/RecordComponentList$AbstractBase;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lnet/bytebuddy/description/type/RecordComponentDescription;",
        ">",
        "Ljava/lang/Object;",
        "Lnet/bytebuddy/matcher/FilterableList<",
        "TT;",
        "Lnet/bytebuddy/description/type/RecordComponentList<",
        "TT;>;>;"
    }
.end annotation


# virtual methods
.method public abstract asDefined()Lnet/bytebuddy/description/type/RecordComponentList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/description/type/RecordComponentList<",
            "Lnet/bytebuddy/description/type/RecordComponentDescription$InDefinedShape;",
            ">;"
        }
    .end annotation
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
            "Lnet/bytebuddy/description/type/RecordComponentDescription$Token;",
            ">;"
        }
    .end annotation
.end method

.method public abstract asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;
.end method
