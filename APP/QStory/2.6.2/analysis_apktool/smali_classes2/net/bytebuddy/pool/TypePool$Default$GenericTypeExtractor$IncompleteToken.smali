.class public interface abstract Lnet/bytebuddy/pool/TypePool$Default$GenericTypeExtractor$IncompleteToken;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/pool/TypePool$Default$GenericTypeExtractor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "IncompleteToken"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/pool/TypePool$Default$GenericTypeExtractor$IncompleteToken$ForInnerClass;,
        Lnet/bytebuddy/pool/TypePool$Default$GenericTypeExtractor$IncompleteToken$ForTopLevelType;,
        Lnet/bytebuddy/pool/TypePool$Default$GenericTypeExtractor$IncompleteToken$AbstractBase;
    }
.end annotation


# virtual methods
.method public abstract appendDirectBound()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;
.end method

.method public abstract appendLowerBound()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;
.end method

.method public abstract appendPlaceholder()V
.end method

.method public abstract appendUpperBound()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;
.end method

.method public abstract getName()Ljava/lang/String;
.end method

.method public abstract isParameterized()Z
.end method

.method public abstract toToken()Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$GenericTypeToken;
.end method
