.class public interface abstract Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$ForDefaultConstructor;,
        Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;
    }
.end annotation


# virtual methods
.method public abstract extractConstructors(Lnet/bytebuddy/description/type/TypeDescription;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ")",
            "Ljava/util/List<",
            "Lnet/bytebuddy/description/method/MethodDescription$Token;",
            ">;"
        }
    .end annotation
.end method

.method public abstract inject(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/scaffold/MethodRegistry;)Lnet/bytebuddy/dynamic/scaffold/MethodRegistry;
.end method
