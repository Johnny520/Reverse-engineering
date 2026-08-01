.class public interface abstract Lnet/bytebuddy/description/annotation/AnnotationList;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/matcher/FilterableList;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/description/annotation/AnnotationList$Empty;,
        Lnet/bytebuddy/description/annotation/AnnotationList$Explicit;,
        Lnet/bytebuddy/description/annotation/AnnotationList$ForLoadedAnnotations;,
        Lnet/bytebuddy/description/annotation/AnnotationList$AbstractBase;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lnet/bytebuddy/matcher/FilterableList<",
        "Lnet/bytebuddy/description/annotation/AnnotationDescription;",
        "Lnet/bytebuddy/description/annotation/AnnotationList;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract asTypeList()Lnet/bytebuddy/description/type/TypeList;
.end method

.method public abstract asTypeNames()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract inherited(Ljava/util/Set;)Lnet/bytebuddy/description/annotation/AnnotationList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;)",
            "Lnet/bytebuddy/description/annotation/AnnotationList;"
        }
    .end annotation
.end method

.method public abstract isAnnotationPresent(Ljava/lang/Class;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/annotation/Annotation;",
            ">;)Z"
        }
    .end annotation
.end method

.method public abstract isAnnotationPresent(Lnet/bytebuddy/description/type/TypeDescription;)Z
.end method

.method public abstract ofType(Ljava/lang/Class;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/annotation/Annotation;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end method

.method public abstract ofType(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/description/annotation/AnnotationDescription;
.end method

.method public abstract visibility(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/description/annotation/AnnotationList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Ljava/lang/annotation/RetentionPolicy;",
            ">;)",
            "Lnet/bytebuddy/description/annotation/AnnotationList;"
        }
    .end annotation
.end method
