.class public interface abstract Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/ByteCodeElement;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "TypeDependant"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lnet/bytebuddy/description/ByteCodeElement$TypeDependant<",
        "*TS;>;S::",
        "Lnet/bytebuddy/description/ByteCodeElement$Token<",
        "TS;>;>",
        "Ljava/lang/Object;"
    }
.end annotation


# virtual methods
.method public abstract asDefined()Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method public abstract asToken(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/description/ByteCodeElement$Token;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;)TS;"
        }
    .end annotation
.end method
