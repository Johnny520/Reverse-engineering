.class public interface abstract Lnet/bytebuddy/dynamic/loading/ClassInjector;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingJna;,
        Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingInstrumentation;,
        Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingUnsafe;,
        Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup;,
        Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;,
        Lnet/bytebuddy/dynamic/loading/ClassInjector$AbstractBase;
    }
.end annotation


# static fields
.field public static final ALLOW_EXISTING_TYPES:Z = false


# virtual methods
.method public abstract inject(Ljava/util/Map;)Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "[B>;)",
            "Ljava/util/Map<",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end method

.method public abstract inject(Ljava/util/Set;Lnet/bytebuddy/dynamic/ClassFileLocator;)Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;",
            "Lnet/bytebuddy/dynamic/ClassFileLocator;",
            ")",
            "Ljava/util/Map<",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end method

.method public abstract injectRaw(Ljava/util/Map;)Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "[B>;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end method

.method public abstract injectRaw(Ljava/util/Set;Lnet/bytebuddy/dynamic/ClassFileLocator;)Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lnet/bytebuddy/dynamic/ClassFileLocator;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end method

.method public abstract isAlive()Z
.end method
