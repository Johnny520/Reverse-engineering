.class public interface abstract Lnet/bytebuddy/dynamic/scaffold/inline/MethodRebaseResolver;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/dynamic/scaffold/inline/MethodRebaseResolver$Default;,
        Lnet/bytebuddy/dynamic/scaffold/inline/MethodRebaseResolver$Resolution;,
        Lnet/bytebuddy/dynamic/scaffold/inline/MethodRebaseResolver$Disabled;
    }
.end annotation


# virtual methods
.method public abstract asTokenMap()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;",
            "Lnet/bytebuddy/dynamic/scaffold/inline/MethodRebaseResolver$Resolution;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getAuxiliaryTypes()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lnet/bytebuddy/dynamic/DynamicType;",
            ">;"
        }
    .end annotation
.end method

.method public abstract resolve(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/dynamic/scaffold/inline/MethodRebaseResolver$Resolution;
.end method
