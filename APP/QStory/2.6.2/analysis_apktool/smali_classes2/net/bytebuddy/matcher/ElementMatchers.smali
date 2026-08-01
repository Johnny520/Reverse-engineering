.class public final Lnet/bytebuddy/matcher/ElementMatchers;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 5
    .line 6
    const-string v0, "This class is a utility class and not supposed to be instantiated"

    .line 7
    .line 8
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    throw p0
.end method

.method public static annotationType(Ljava/lang/Class;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription;",
            ">(",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/annotation/Annotation;",
            ">;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->annotationType(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static annotationType(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription;",
            ">(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 10
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/Object;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->annotationType(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static annotationType(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription;",
            ">(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 11
    new-instance v0, Lnet/bytebuddy/matcher/AnnotationTypeMatcher;

    invoke-direct {v0, p0}, Lnet/bytebuddy/matcher/AnnotationTypeMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    return-object v0
.end method

.method public static any()Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Lnet/bytebuddy/matcher/BooleanMatcher;->of(Z)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    return-object v0
.end method

.method public static anyOf(Ljava/lang/Iterable;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable<",
            "*>;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/Object;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/Object;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->or(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    if-nez v0, :cond_2

    .line 33
    .line 34
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->none()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :cond_2
    return-object v0
.end method

.method public static varargs anyOf([Ljava/lang/Object;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([",
            "Ljava/lang/Object;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 40
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->anyOf(Ljava/lang/Iterable;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static varargs anyOf([Ljava/lang/annotation/Annotation;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription;",
            ">([",
            "Ljava/lang/annotation/Annotation;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 45
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationList$ForLoadedAnnotations;

    invoke-direct {v0, p0}, Lnet/bytebuddy/description/annotation/AnnotationList$ForLoadedAnnotations;-><init>([Ljava/lang/annotation/Annotation;)V

    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->anyOf(Ljava/lang/Iterable;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static varargs anyOf([Ljava/lang/reflect/Constructor;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">([",
            "Ljava/lang/reflect/Constructor<",
            "*>;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 42
    new-instance v0, Lnet/bytebuddy/description/method/MethodList$ForLoadedMethods;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/reflect/Method;

    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/description/method/MethodList$ForLoadedMethods;-><init>([Ljava/lang/reflect/Constructor;[Ljava/lang/reflect/Method;)V

    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->anyOf(Ljava/lang/Iterable;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->definedMethod(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static varargs anyOf([Ljava/lang/reflect/Field;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/field/FieldDescription;",
            ">([",
            "Ljava/lang/reflect/Field;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 44
    new-instance v0, Lnet/bytebuddy/description/field/FieldList$ForLoadedFields;

    invoke-direct {v0, p0}, Lnet/bytebuddy/description/field/FieldList$ForLoadedFields;-><init>([Ljava/lang/reflect/Field;)V

    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->anyOf(Ljava/lang/Iterable;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->definedField(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static varargs anyOf([Ljava/lang/reflect/Method;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">([",
            "Ljava/lang/reflect/Method;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 43
    new-instance v0, Lnet/bytebuddy/description/method/MethodList$ForLoadedMethods;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/reflect/Constructor;

    invoke-direct {v0, v1, p0}, Lnet/bytebuddy/description/method/MethodList$ForLoadedMethods;-><init>([Ljava/lang/reflect/Constructor;[Ljava/lang/reflect/Method;)V

    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->anyOf(Ljava/lang/Iterable;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->definedMethod(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static varargs anyOf([Ljava/lang/reflect/Type;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ">([",
            "Ljava/lang/reflect/Type;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 41
    new-instance v0, Lnet/bytebuddy/description/type/TypeList$Generic$ForLoadedTypes;

    invoke-direct {v0, p0}, Lnet/bytebuddy/description/type/TypeList$Generic$ForLoadedTypes;-><init>([Ljava/lang/reflect/Type;)V

    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->anyOf(Ljava/lang/Iterable;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static cached(Lnet/bytebuddy/matcher/ElementMatcher;I)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-TT;>;I)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    if-lt p1, v0, :cond_0

    .line 3
    .line 4
    new-instance v0, Lnet/bytebuddy/matcher/CachingMatcher$WithInlineEviction;

    .line 5
    .line 6
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, p0, v1, p1}, Lnet/bytebuddy/matcher/CachingMatcher$WithInlineEviction;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;Ljava/util/concurrent/ConcurrentMap;I)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    const-string p0, "Eviction size must be a positive number: "

    .line 16
    .line 17
    invoke-static {p1, p0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    return-object p0
.end method

.method public static cached(Lnet/bytebuddy/matcher/ElementMatcher;Ljava/util/concurrent/ConcurrentMap;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-TT;>;",
            "Ljava/util/concurrent/ConcurrentMap<",
            "-TT;",
            "Ljava/lang/Boolean;",
            ">;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 26
    new-instance v0, Lnet/bytebuddy/matcher/CachingMatcher;

    invoke-direct {v0, p0, p1}, Lnet/bytebuddy/matcher/CachingMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;Ljava/util/concurrent/ConcurrentMap;)V

    return-object v0
.end method

.method public static canThrow(Ljava/lang/Class;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/Throwable;",
            ">;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 42
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->canThrow(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static canThrow(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    const-class v0, Ljava/lang/RuntimeException;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription;->isAssignableTo(Ljava/lang/Class;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const-class v0, Ljava/lang/Error;

    .line 10
    .line 11
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription;->isAssignableTo(Ljava/lang/Class;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance v0, Lnet/bytebuddy/matcher/CollectionItemMatcher;

    .line 19
    .line 20
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->isSuperTypeOf(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->erasure(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-direct {v0, p0}, Lnet/bytebuddy/matcher/CollectionItemMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->declaresGenericException(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 37
    invoke-static {p0}, Lnet/bytebuddy/matcher/BooleanMatcher;->of(Z)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method

.method public static declaresAnnotation(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/annotation/AnnotationSource;",
            ">(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription;",
            ">;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/matcher/DeclaringAnnotationMatcher;

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/matcher/CollectionItemMatcher;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lnet/bytebuddy/matcher/CollectionItemMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Lnet/bytebuddy/matcher/DeclaringAnnotationMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static declaresException(Ljava/lang/Class;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/Throwable;",
            ">;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 29
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->declaresException(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static declaresException(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    const-class v0, Ljava/lang/Throwable;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription;->isAssignableTo(Ljava/lang/Class;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lnet/bytebuddy/matcher/CollectionItemMatcher;

    .line 10
    .line 11
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->erasure(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-direct {v0, p0}, Lnet/bytebuddy/matcher/CollectionItemMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->declaresGenericException(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    invoke-static {p0}, Lnet/bytebuddy/matcher/BooleanMatcher;->of(Z)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public static declaresField(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ">(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/field/FieldDescription;",
            ">;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/matcher/DeclaringFieldMatcher;

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/matcher/CollectionItemMatcher;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lnet/bytebuddy/matcher/CollectionItemMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Lnet/bytebuddy/matcher/DeclaringFieldMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static declaresGenericException(Ljava/lang/reflect/Type;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(",
            "Ljava/lang/reflect/Type;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 43
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->describe(Ljava/lang/reflect/Type;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->declaresGenericException(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static declaresGenericException(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->getSort()Lnet/bytebuddy/description/type/TypeDefinition$Sort;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->isWildcard()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-class v1, Ljava/lang/Throwable;

    .line 16
    .line 17
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDescription;->isAssignableTo(Ljava/lang/Class;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    new-instance v0, Lnet/bytebuddy/matcher/CollectionItemMatcher;

    .line 24
    .line 25
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/Object;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-direct {v0, p0}, Lnet/bytebuddy/matcher/CollectionItemMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->declaresGenericException(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :cond_0
    const/4 p0, 0x0

    .line 38
    invoke-static {p0}, Lnet/bytebuddy/matcher/BooleanMatcher;->of(Z)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method

.method public static declaresGenericException(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Ljava/lang/Iterable<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ">;>;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 44
    new-instance v0, Lnet/bytebuddy/matcher/MethodExceptionTypeMatcher;

    invoke-direct {v0, p0}, Lnet/bytebuddy/matcher/MethodExceptionTypeMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    return-object v0
.end method

.method public static declaresMethod(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ">(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/matcher/DeclaringMethodMatcher;

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/matcher/CollectionItemMatcher;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lnet/bytebuddy/matcher/CollectionItemMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Lnet/bytebuddy/matcher/DeclaringMethodMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static definedField(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/field/FieldDescription;",
            ">(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/matcher/DefinedShapeMatcher;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lnet/bytebuddy/matcher/DefinedShapeMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static definedMethod(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;",
            ">;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/matcher/DefinedShapeMatcher;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lnet/bytebuddy/matcher/DefinedShapeMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static definedParameter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/ParameterDescription;",
            ">(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/ParameterDescription$InDefinedShape;",
            ">;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/matcher/DefinedShapeMatcher;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lnet/bytebuddy/matcher/DefinedShapeMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static erasure(Ljava/lang/Class;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ">(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/reflect/Type;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->erasure(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static erasure(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ">(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 10
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/Object;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->erasure(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static erasure(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ">(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 11
    new-instance v0, Lnet/bytebuddy/matcher/ErasureMatcher;

    invoke-direct {v0, p0}, Lnet/bytebuddy/matcher/ErasureMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    return-object v0
.end method

.method public static erasures(Ljava/lang/Iterable;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/Iterable<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ">;>(",
            "Ljava/lang/Iterable<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lnet/bytebuddy/description/type/TypeDescription;

    .line 21
    .line 22
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/Object;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance p0, Lnet/bytebuddy/matcher/CollectionOneToOneMatcher;

    .line 31
    .line 32
    invoke-direct {p0, v0}, Lnet/bytebuddy/matcher/CollectionOneToOneMatcher;-><init>(Ljava/util/List;)V

    .line 33
    .line 34
    .line 35
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->erasures(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method

.method public static erasures(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/Iterable<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ">;>(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Ljava/lang/Iterable<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;>;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 42
    new-instance v0, Lnet/bytebuddy/matcher/CollectionErasureMatcher;

    invoke-direct {v0, p0}, Lnet/bytebuddy/matcher/CollectionErasureMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    return-object v0
.end method

.method public static varargs erasures([Ljava/lang/Class;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/Iterable<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ">;>([",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 41
    new-instance v0, Lnet/bytebuddy/description/type/TypeList$ForLoadedTypes;

    invoke-direct {v0, p0}, Lnet/bytebuddy/description/type/TypeList$ForLoadedTypes;-><init>([Ljava/lang/Class;)V

    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->erasures(Ljava/lang/Iterable;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static varargs erasures([Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/Iterable<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ">;>([",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 40
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->erasures(Ljava/lang/Iterable;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static failSafe(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-TT;>;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/matcher/FailSafeMatcher;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/matcher/FailSafeMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;Z)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public static fieldType(Ljava/lang/Class;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/field/FieldDescription;",
            ">(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->fieldType(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static fieldType(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/field/FieldDescription;",
            ">(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 10
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/Object;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->fieldType(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static fieldType(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/field/FieldDescription;",
            ">(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 11
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->erasure(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->genericFieldType(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static genericFieldType(Ljava/lang/reflect/Type;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/field/FieldDescription;",
            ">(",
            "Ljava/lang/reflect/Type;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->describe(Ljava/lang/reflect/Type;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->genericFieldType(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static genericFieldType(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/field/FieldDescription;",
            ">(",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 10
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/Object;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->genericFieldType(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static genericFieldType(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/field/FieldDescription;",
            ">(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ">;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 11
    new-instance v0, Lnet/bytebuddy/matcher/FieldTypeMatcher;

    invoke-direct {v0, p0}, Lnet/bytebuddy/matcher/FieldTypeMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    return-object v0
.end method

.method public static hasAnnotation(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription;",
            ">;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/matcher/InheritedAnnotationMatcher;

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/matcher/CollectionItemMatcher;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lnet/bytebuddy/matcher/CollectionItemMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Lnet/bytebuddy/matcher/InheritedAnnotationMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static hasChild(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/ClassLoader;",
            ">(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Ljava/lang/ClassLoader;",
            ">;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/matcher/ClassLoaderHierarchyMatcher;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lnet/bytebuddy/matcher/ClassLoaderHierarchyMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static hasClassFileVersionAtLeast(Lnet/bytebuddy/ClassFileVersion;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">(",
            "Lnet/bytebuddy/ClassFileVersion;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/matcher/ClassFileVersionMatcher;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/matcher/ClassFileVersionMatcher;-><init>(Lnet/bytebuddy/ClassFileVersion;Z)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public static hasClassFileVersionAtMost(Lnet/bytebuddy/ClassFileVersion;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">(",
            "Lnet/bytebuddy/ClassFileVersion;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/matcher/ClassFileVersionMatcher;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/matcher/ClassFileVersionMatcher;-><init>(Lnet/bytebuddy/ClassFileVersion;Z)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public static hasDescriptor(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/NamedElement$WithDescriptor;",
            ">(",
            "Ljava/lang/String;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/matcher/DescriptorMatcher;

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/matcher/StringMatcher;

    .line 4
    .line 5
    sget-object v2, Lnet/bytebuddy/matcher/StringMatcher$Mode;->EQUALS_FULLY:Lnet/bytebuddy/matcher/StringMatcher$Mode;

    .line 6
    .line 7
    invoke-direct {v1, p0, v2}, Lnet/bytebuddy/matcher/StringMatcher;-><init>(Ljava/lang/String;Lnet/bytebuddy/matcher/StringMatcher$Mode;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Lnet/bytebuddy/matcher/DescriptorMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public static hasGenericSuperClass(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ">;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/matcher/HasSuperClassMatcher;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lnet/bytebuddy/matcher/HasSuperClassMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static hasGenericSuperType(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ">;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/matcher/HasSuperTypeMatcher;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lnet/bytebuddy/matcher/HasSuperTypeMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static hasGenericType(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/ParameterDescription;",
            ">(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ">;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/matcher/MethodParameterTypeMatcher;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lnet/bytebuddy/matcher/MethodParameterTypeMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static hasMethodName(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(",
            "Ljava/lang/String;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    const-string v0, "<init>"

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isConstructor()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    const-string v0, "<clinit>"

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isTypeInitializer()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_1
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method public static hasParameters(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Ljava/lang/Iterable<",
            "+",
            "Lnet/bytebuddy/description/method/ParameterDescription;",
            ">;>;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/matcher/MethodParametersMatcher;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lnet/bytebuddy/matcher/MethodParametersMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static hasSignature(Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(",
            "Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/matcher/SignatureTokenMatcher;

    .line 2
    .line 3
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/Object;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, Lnet/bytebuddy/matcher/SignatureTokenMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public static hasSuperClass(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->erasure(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->hasGenericSuperClass(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static hasSuperType(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->erasure(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->hasGenericSuperType(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static hasType(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/ParameterDescription;",
            ">(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->erasure(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->hasGenericType(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static inheritsAnnotation(Ljava/lang/Class;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->inheritsAnnotation(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static inheritsAnnotation(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 10
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/Object;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->inheritsAnnotation(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static inheritsAnnotation(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 11
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->annotationType(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->hasAnnotation(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static is(Ljava/lang/Object;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .param p0    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    invoke-static {}, Lnet/bytebuddy/matcher/NullMatcher;->make()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0

    .line 8
    :cond_0
    new-instance v0, Lnet/bytebuddy/matcher/EqualityMatcher;

    .line 9
    .line 10
    invoke-direct {v0, p0}, Lnet/bytebuddy/matcher/EqualityMatcher;-><init>(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public static is(Ljava/lang/annotation/Annotation;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription;",
            ">(",
            "Ljava/lang/annotation/Annotation;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 21
    invoke-static {p0}, Lnet/bytebuddy/description/annotation/AnnotationDescription$ForLoadedAnnotation;->of(Ljava/lang/annotation/Annotation;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/Object;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static is(Ljava/lang/reflect/Constructor;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(",
            "Ljava/lang/reflect/Constructor<",
            "*>;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 17
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;

    invoke-direct {v0, p0}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;-><init>(Ljava/lang/reflect/Constructor;)V

    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static is(Ljava/lang/reflect/Field;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/field/FieldDescription;",
            ">(",
            "Ljava/lang/reflect/Field;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 14
    new-instance v0, Lnet/bytebuddy/description/field/FieldDescription$ForLoadedField;

    invoke-direct {v0, p0}, Lnet/bytebuddy/description/field/FieldDescription$ForLoadedField;-><init>(Ljava/lang/reflect/Field;)V

    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static is(Ljava/lang/reflect/Method;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(",
            "Ljava/lang/reflect/Method;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 16
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    invoke-direct {v0, p0}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static is(Ljava/lang/reflect/Type;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ">(",
            "Ljava/lang/reflect/Type;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 20
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->describe(Ljava/lang/reflect/Type;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/Object;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static is(Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/field/FieldDescription;",
            ">(",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 15
    new-instance v0, Lnet/bytebuddy/matcher/EqualityMatcher;

    invoke-direct {v0, p0}, Lnet/bytebuddy/matcher/EqualityMatcher;-><init>(Ljava/lang/Object;)V

    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->definedField(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static is(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(",
            "Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 18
    new-instance v0, Lnet/bytebuddy/matcher/EqualityMatcher;

    invoke-direct {v0, p0}, Lnet/bytebuddy/matcher/EqualityMatcher;-><init>(Ljava/lang/Object;)V

    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->definedMethod(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static is(Lnet/bytebuddy/description/method/ParameterDescription$InDefinedShape;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/ParameterDescription;",
            ">(",
            "Lnet/bytebuddy/description/method/ParameterDescription$InDefinedShape;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 19
    new-instance v0, Lnet/bytebuddy/matcher/EqualityMatcher;

    invoke-direct {v0, p0}, Lnet/bytebuddy/matcher/EqualityMatcher;-><init>(Ljava/lang/Object;)V

    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->definedParameter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static isAbstract()Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/ModifierReviewable$OfAbstraction;",
            ">()",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->ABSTRACT:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/matcher/ModifierMatcher;->of(Lnet/bytebuddy/matcher/ModifierMatcher$Mode;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static isAccessibleTo(Ljava/lang/Class;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/ByteCodeElement;",
            ">(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->isAccessibleTo(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static isAccessibleTo(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/ByteCodeElement;",
            ">(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 10
    new-instance v0, Lnet/bytebuddy/matcher/AccessibilityMatcher;

    invoke-direct {v0, p0}, Lnet/bytebuddy/matcher/AccessibilityMatcher;-><init>(Lnet/bytebuddy/description/type/TypeDescription;)V

    return-object v0
.end method

.method public static isAnnotatedWith(Ljava/lang/Class;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/annotation/AnnotationSource;",
            ">(",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/annotation/Annotation;",
            ">;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->isAnnotatedWith(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static isAnnotatedWith(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/annotation/AnnotationSource;",
            ">(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 10
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/Object;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->isAnnotatedWith(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static isAnnotatedWith(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/annotation/AnnotationSource;",
            ">(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 11
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->annotationType(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->declaresAnnotation(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static isAnnotation()Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">()",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->ANNOTATION:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/matcher/ModifierMatcher;->of(Lnet/bytebuddy/matcher/ModifierMatcher$Mode;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static isArray()Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ">()",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/matcher/ArrayTypeMatcher;

    .line 2
    .line 3
    invoke-direct {v0}, Lnet/bytebuddy/matcher/ArrayTypeMatcher;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static isBootstrapClassLoader()Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/ClassLoader;",
            ">()",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lnet/bytebuddy/matcher/NullMatcher;->make()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static isBridge()Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/ModifierReviewable$ForMethodDescription;",
            ">()",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->BRIDGE:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/matcher/ModifierMatcher;->of(Lnet/bytebuddy/matcher/ModifierMatcher$Mode;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static isChildOf(Ljava/lang/ClassLoader;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .param p0    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/ClassLoader;",
            ">(",
            "Ljava/lang/ClassLoader;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy;->BOOTSTRAP_LOADER:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    invoke-static {p0}, Lnet/bytebuddy/matcher/BooleanMatcher;->of(Z)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :cond_0
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/Object;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->hasChild(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public static isClone()Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">()",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    const-string v0, "clone"

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->takesNoArguments()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method public static isConstructor()Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">()",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;->CONSTRUCTOR:Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/matcher/MethodSortMatcher;->of(Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static isDeclaredBy(Ljava/lang/Class;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/ByteCodeElement;",
            ">(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->isDeclaredBy(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static isDeclaredBy(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/ByteCodeElement;",
            ">(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 10
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/Object;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->isDeclaredBy(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static isDeclaredBy(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/ByteCodeElement;",
            ">(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 11
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->erasure(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->isDeclaredByGeneric(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static isDeclaredByGeneric(Ljava/lang/reflect/Type;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/ByteCodeElement;",
            ">(",
            "Ljava/lang/reflect/Type;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->describe(Ljava/lang/reflect/Type;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->isDeclaredByGeneric(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static isDeclaredByGeneric(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/ByteCodeElement;",
            ">(",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 10
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/Object;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->isDeclaredByGeneric(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static isDeclaredByGeneric(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/ByteCodeElement;",
            ">(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ">;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 11
    new-instance v0, Lnet/bytebuddy/matcher/DeclaringTypeMatcher;

    invoke-direct {v0, p0}, Lnet/bytebuddy/matcher/DeclaringTypeMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    return-object v0
.end method

.method public static isDefaultConstructor()Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">()",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isConstructor()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->takesNoArguments()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public static isDefaultFinalizer()Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">()",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isFinalizer()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Ljava/lang/Object;

    .line 6
    .line 7
    invoke-static {v1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->isDeclaredBy(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method

.method public static isDefaultMethod()Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">()",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;->DEFAULT_METHOD:Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/matcher/MethodSortMatcher;->of(Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static isEnum()Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/ModifierReviewable$OfEnumeration;",
            ">()",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->ENUMERATION:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/matcher/ModifierMatcher;->of(Lnet/bytebuddy/matcher/ModifierMatcher$Mode;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static isEquals()Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">()",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    const-string v0, "equals"

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-class v1, Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {v1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/4 v2, 0x1

    .line 14
    new-array v2, v2, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    aput-object v1, v2, v3

    .line 18
    .line 19
    invoke-static {v2}, Lnet/bytebuddy/matcher/ElementMatchers;->takesArguments([Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 28
    .line 29
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->returns(Ljava/lang/Class;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    return-object v0
.end method

.method public static isExtensionClassLoader()Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/ClassLoader;",
            ">()",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/ClassLoader;->getParent()Ljava/lang/ClassLoader;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->none()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_0
    new-instance v1, Lnet/bytebuddy/matcher/EqualityMatcher;

    .line 17
    .line 18
    invoke-direct {v1, v0}, Lnet/bytebuddy/matcher/EqualityMatcher;-><init>(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-object v1
.end method

.method public static isFinal()Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/ModifierReviewable;",
            ">()",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->FINAL:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/matcher/ModifierMatcher;->of(Lnet/bytebuddy/matcher/ModifierMatcher$Mode;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static isFinalizer()Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">()",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    const-string v0, "finalize"

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->takesNoArguments()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 16
    .line 17
    invoke-static {v1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->returns(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0
.end method

.method public static isGenericGetter(Ljava/lang/reflect/Type;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(",
            "Ljava/lang/reflect/Type;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 15
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->describe(Ljava/lang/reflect/Type;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->isGenericGetter(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static isGenericGetter(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 14
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/Object;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->isGenericGetter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static isGenericGetter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ">;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isGetter()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->returnsGeneric(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {v0, p0}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public static isGenericSetter(Ljava/lang/reflect/Type;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(",
            "Ljava/lang/reflect/Type;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 24
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->describe(Ljava/lang/reflect/Type;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->isGenericSetter(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static isGenericSetter(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 23
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/Object;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->isGenericSetter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static isGenericSetter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ">;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isSetter()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lnet/bytebuddy/matcher/CollectionOneToOneMatcher;

    .line 6
    .line 7
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-direct {v1, p0}, Lnet/bytebuddy/matcher/CollectionOneToOneMatcher;-><init>(Ljava/util/List;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->takesGenericArguments(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-interface {v0, p0}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public static isGetter()Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">()",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 101
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->takesNoArguments()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v0

    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-static {v1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v1

    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->returns(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v1

    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->not(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v1

    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v0

    const-string v1, "get"

    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->nameStartsWith(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v1

    const-string v2, "is"

    invoke-static {v2}, Lnet/bytebuddy/matcher/ElementMatchers;->nameStartsWith(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v2

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/reflect/Type;

    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const-class v4, Ljava/lang/Boolean;

    const/4 v5, 0x1

    aput-object v4, v3, v5

    invoke-static {v3}, Lnet/bytebuddy/matcher/ElementMatchers;->anyOf([Ljava/lang/reflect/Type;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v3

    invoke-static {v3}, Lnet/bytebuddy/matcher/ElementMatchers;->returnsGeneric(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v3

    invoke-interface {v2, v3}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v2

    invoke-interface {v1, v2}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->or(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v1

    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v0

    return-object v0
.end method

.method public static isGetter(Ljava/lang/Class;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 102
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->isGetter(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static isGetter(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(",
            "Ljava/lang/String;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isGetter()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const-string v2, "is"

    .line 10
    .line 11
    const-string v3, "get"

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    invoke-static {v3}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {v2}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-interface {p0, v1}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->or(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    invoke-static {v4}, Ljava/lang/Character;->toUpperCase(C)C

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const/4 v4, 0x1

    .line 46
    invoke-virtual {p0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    new-instance v5, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    invoke-static {v2}, Ljava/lang/Character;->toUpperCase(C)C

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-interface {v1, p0}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->or(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    :goto_0
    invoke-interface {v0, p0}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    return-object p0
.end method

.method public static isGetter(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 103
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/Object;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->isGetter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static isGetter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 104
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->erasure(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->isGenericGetter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static isHashCode()Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">()",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    const-string v0, "hashCode"

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->takesNoArguments()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 16
    .line 17
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->returns(Ljava/lang/Class;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
.end method

.method public static isInterface()Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">()",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->INTERFACE:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/matcher/ModifierMatcher;->of(Lnet/bytebuddy/matcher/ModifierMatcher$Mode;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static isMain()Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">()",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    const/4 v0, 0x1

    .line 104
    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->isMain(Z)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v0

    return-object v0
.end method

.method public static isMain(Z)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(Z)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    const-class v1, [Ljava/lang/String;

    .line 4
    .line 5
    const-string v2, "main"

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-static {v2}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->takesArguments([Ljava/lang/Class;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-static {v2}, Lnet/bytebuddy/matcher/ElementMatchers;->takesArguments(I)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-interface {v1, v2}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->or(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-interface {p0, v1}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->returns(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-interface {p0, v0}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isPrivate()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->not(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-interface {p0, v0}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0

    .line 59
    :cond_0
    invoke-static {v2}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->takesArguments([Ljava/lang/Class;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-interface {p0, v1}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->returns(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-interface {p0, v0}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isStatic()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-interface {p0, v0}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isPublic()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-interface {p0, v0}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    return-object p0
.end method

.method public static isMandated()Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/ParameterDescription;",
            ">()",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->MANDATED:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/matcher/ModifierMatcher;->of(Lnet/bytebuddy/matcher/ModifierMatcher$Mode;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static isMethod()Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">()",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;->METHOD:Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/matcher/MethodSortMatcher;->of(Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static isNamed()Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/NamedElement$WithOptionalName;",
            ">()",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/matcher/IsNamedMatcher;

    .line 2
    .line 3
    invoke-direct {v0}, Lnet/bytebuddy/matcher/IsNamedMatcher;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static isNative()Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/ModifierReviewable$ForMethodDescription;",
            ">()",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->NATIVE:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/matcher/ModifierMatcher;->of(Lnet/bytebuddy/matcher/ModifierMatcher$Mode;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static isOverriddenFrom(Ljava/lang/Class;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->isOverriddenFrom(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static isOverriddenFrom(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 10
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/Object;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->isOverriddenFrom(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static isOverriddenFrom(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 11
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->erasure(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->isOverriddenFromGeneric(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static isOverriddenFromGeneric(Ljava/lang/reflect/Type;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(",
            "Ljava/lang/reflect/Type;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->describe(Ljava/lang/reflect/Type;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->isOverriddenFromGeneric(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static isOverriddenFromGeneric(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 10
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/Object;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->isOverriddenFromGeneric(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static isOverriddenFromGeneric(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ">;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 11
    new-instance v0, Lnet/bytebuddy/matcher/MethodOverrideMatcher;

    invoke-direct {v0, p0}, Lnet/bytebuddy/matcher/MethodOverrideMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    return-object v0
.end method

.method public static isPackagePrivate()Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;",
            ">()",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isPublic()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isProtected()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->or(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isPrivate()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->or(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->not(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
.end method

.method public static isParentOf(Ljava/lang/ClassLoader;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .param p0    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/ClassLoader;",
            ">(",
            "Ljava/lang/ClassLoader;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy;->BOOTSTRAP_LOADER:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isBootstrapClassLoader()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    new-instance v0, Lnet/bytebuddy/matcher/ClassLoaderParentMatcher;

    .line 11
    .line 12
    invoke-direct {v0, p0}, Lnet/bytebuddy/matcher/ClassLoaderParentMatcher;-><init>(Ljava/lang/ClassLoader;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public static isPrimitive()Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ">()",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/matcher/PrimitiveTypeMatcher;

    .line 2
    .line 3
    invoke-direct {v0}, Lnet/bytebuddy/matcher/PrimitiveTypeMatcher;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static isPrivate()Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;",
            ">()",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->PRIVATE:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/matcher/ModifierMatcher;->of(Lnet/bytebuddy/matcher/ModifierMatcher$Mode;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static isProtected()Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;",
            ">()",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->PROTECTED:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/matcher/ModifierMatcher;->of(Lnet/bytebuddy/matcher/ModifierMatcher$Mode;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static isPublic()Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;",
            ">()",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->PUBLIC:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/matcher/ModifierMatcher;->of(Lnet/bytebuddy/matcher/ModifierMatcher$Mode;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static isRecord()Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ">()",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/matcher/RecordMatcher;

    .line 2
    .line 3
    invoke-direct {v0}, Lnet/bytebuddy/matcher/RecordMatcher;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static isSetter()Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">()",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 56
    const-string v0, "set"

    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->nameStartsWith(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->takesArguments(I)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v1

    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v0

    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-static {v1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v1

    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->returns(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v1

    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v0

    return-object v0
.end method

.method public static isSetter(Ljava/lang/Class;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 57
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->isSetter(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static isSetter(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(",
            "Ljava/lang/String;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isSetter()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const-string v2, "set"

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-static {v2}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-static {v2}, Ljava/lang/Character;->toUpperCase(C)C

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const/4 v2, 0x1

    .line 36
    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    :goto_0
    invoke-interface {v0, p0}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0
.end method

.method public static isSetter(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 58
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/Object;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->isSetter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static isSetter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 59
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->erasure(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->isGenericSetter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static isStatic()Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;",
            ">()",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->STATIC:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/matcher/ModifierMatcher;->of(Lnet/bytebuddy/matcher/ModifierMatcher$Mode;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static isStrict()Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/ModifierReviewable$ForMethodDescription;",
            ">()",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->STRICT:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/matcher/ModifierMatcher;->of(Lnet/bytebuddy/matcher/ModifierMatcher$Mode;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static isSubTypeOf(Ljava/lang/Class;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->isSubTypeOf(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static isSubTypeOf(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 10
    new-instance v0, Lnet/bytebuddy/matcher/SubTypeMatcher;

    invoke-direct {v0, p0}, Lnet/bytebuddy/matcher/SubTypeMatcher;-><init>(Lnet/bytebuddy/description/type/TypeDescription;)V

    return-object v0
.end method

.method public static isSuperTypeOf(Ljava/lang/Class;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->isSuperTypeOf(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static isSuperTypeOf(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 10
    new-instance v0, Lnet/bytebuddy/matcher/SuperTypeMatcher;

    invoke-direct {v0, p0}, Lnet/bytebuddy/matcher/SuperTypeMatcher;-><init>(Lnet/bytebuddy/description/type/TypeDescription;)V

    return-object v0
.end method

.method public static isSynchronized()Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/ModifierReviewable$ForMethodDescription;",
            ">()",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->SYNCHRONIZED:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/matcher/ModifierMatcher;->of(Lnet/bytebuddy/matcher/ModifierMatcher$Mode;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static isSynthetic()Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/ModifierReviewable;",
            ">()",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->SYNTHETIC:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/matcher/ModifierMatcher;->of(Lnet/bytebuddy/matcher/ModifierMatcher$Mode;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static isSystemClassLoader()Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/ClassLoader;",
            ">()",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/matcher/EqualityMatcher;

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Lnet/bytebuddy/matcher/EqualityMatcher;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public static isToString()Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">()",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    const-string v0, "toString"

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->takesNoArguments()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-class v1, Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->returns(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0
.end method

.method public static isTransient()Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/field/FieldDescription;",
            ">()",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->TRANSIENT:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/matcher/ModifierMatcher;->of(Lnet/bytebuddy/matcher/ModifierMatcher$Mode;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static isTypeInitializer()Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">()",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;->TYPE_INITIALIZER:Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/matcher/MethodSortMatcher;->of(Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static isVarArgs()Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/ModifierReviewable$ForMethodDescription;",
            ">()",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->VAR_ARGS:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/matcher/ModifierMatcher;->of(Lnet/bytebuddy/matcher/ModifierMatcher$Mode;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static isVariable(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ">(",
            "Ljava/lang/String;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 23
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->isVariable(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static isVariable(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ">(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/NamedElement;",
            ">;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/matcher/TypeSortMatcher;

    .line 2
    .line 3
    sget-object v1, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->VARIABLE:Lnet/bytebuddy/description/type/TypeDefinition$Sort;

    .line 4
    .line 5
    sget-object v2, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->VARIABLE_SYMBOLIC:Lnet/bytebuddy/description/type/TypeDefinition$Sort;

    .line 6
    .line 7
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->anyOf([Ljava/lang/Object;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-direct {v0, v1}, Lnet/bytebuddy/matcher/TypeSortMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p0}, Lnet/bytebuddy/matcher/ElementMatcher$Junction$AbstractBase;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public static isVirtual()Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">()",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;->VIRTUAL:Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/matcher/MethodSortMatcher;->of(Lnet/bytebuddy/matcher/MethodSortMatcher$Sort;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static isVisibleTo(Ljava/lang/Class;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/ByteCodeElement;",
            ">(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->isVisibleTo(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static isVisibleTo(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/ByteCodeElement;",
            ">(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 10
    new-instance v0, Lnet/bytebuddy/matcher/VisibilityMatcher;

    invoke-direct {v0, p0}, Lnet/bytebuddy/matcher/VisibilityMatcher;-><init>(Lnet/bytebuddy/description/type/TypeDescription;)V

    return-object v0
.end method

.method public static isVolatile()Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/field/FieldDescription;",
            ">()",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/matcher/ModifierMatcher$Mode;->VOLATILE:Lnet/bytebuddy/matcher/ModifierMatcher$Mode;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/matcher/ModifierMatcher;->of(Lnet/bytebuddy/matcher/ModifierMatcher$Mode;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static nameContains(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/NamedElement;",
            ">(",
            "Ljava/lang/String;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/matcher/NameMatcher;

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/matcher/StringMatcher;

    .line 4
    .line 5
    sget-object v2, Lnet/bytebuddy/matcher/StringMatcher$Mode;->CONTAINS:Lnet/bytebuddy/matcher/StringMatcher$Mode;

    .line 6
    .line 7
    invoke-direct {v1, p0, v2}, Lnet/bytebuddy/matcher/StringMatcher;-><init>(Ljava/lang/String;Lnet/bytebuddy/matcher/StringMatcher$Mode;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Lnet/bytebuddy/matcher/NameMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public static nameContainsIgnoreCase(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/NamedElement;",
            ">(",
            "Ljava/lang/String;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/matcher/NameMatcher;

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/matcher/StringMatcher;

    .line 4
    .line 5
    sget-object v2, Lnet/bytebuddy/matcher/StringMatcher$Mode;->CONTAINS_IGNORE_CASE:Lnet/bytebuddy/matcher/StringMatcher$Mode;

    .line 6
    .line 7
    invoke-direct {v1, p0, v2}, Lnet/bytebuddy/matcher/StringMatcher;-><init>(Ljava/lang/String;Lnet/bytebuddy/matcher/StringMatcher$Mode;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Lnet/bytebuddy/matcher/NameMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public static nameEndsWith(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/NamedElement;",
            ">(",
            "Ljava/lang/String;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/matcher/NameMatcher;

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/matcher/StringMatcher;

    .line 4
    .line 5
    sget-object v2, Lnet/bytebuddy/matcher/StringMatcher$Mode;->ENDS_WITH:Lnet/bytebuddy/matcher/StringMatcher$Mode;

    .line 6
    .line 7
    invoke-direct {v1, p0, v2}, Lnet/bytebuddy/matcher/StringMatcher;-><init>(Ljava/lang/String;Lnet/bytebuddy/matcher/StringMatcher$Mode;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Lnet/bytebuddy/matcher/NameMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public static nameEndsWithIgnoreCase(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/NamedElement;",
            ">(",
            "Ljava/lang/String;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/matcher/NameMatcher;

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/matcher/StringMatcher;

    .line 4
    .line 5
    sget-object v2, Lnet/bytebuddy/matcher/StringMatcher$Mode;->ENDS_WITH_IGNORE_CASE:Lnet/bytebuddy/matcher/StringMatcher$Mode;

    .line 6
    .line 7
    invoke-direct {v1, p0, v2}, Lnet/bytebuddy/matcher/StringMatcher;-><init>(Ljava/lang/String;Lnet/bytebuddy/matcher/StringMatcher$Mode;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Lnet/bytebuddy/matcher/NameMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public static nameMatches(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/NamedElement;",
            ">(",
            "Ljava/lang/String;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/matcher/NameMatcher;

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/matcher/StringMatcher;

    .line 4
    .line 5
    sget-object v2, Lnet/bytebuddy/matcher/StringMatcher$Mode;->MATCHES:Lnet/bytebuddy/matcher/StringMatcher$Mode;

    .line 6
    .line 7
    invoke-direct {v1, p0, v2}, Lnet/bytebuddy/matcher/StringMatcher;-><init>(Ljava/lang/String;Lnet/bytebuddy/matcher/StringMatcher$Mode;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Lnet/bytebuddy/matcher/NameMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public static nameStartsWith(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/NamedElement;",
            ">(",
            "Ljava/lang/String;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/matcher/NameMatcher;

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/matcher/StringMatcher;

    .line 4
    .line 5
    sget-object v2, Lnet/bytebuddy/matcher/StringMatcher$Mode;->STARTS_WITH:Lnet/bytebuddy/matcher/StringMatcher$Mode;

    .line 6
    .line 7
    invoke-direct {v1, p0, v2}, Lnet/bytebuddy/matcher/StringMatcher;-><init>(Ljava/lang/String;Lnet/bytebuddy/matcher/StringMatcher$Mode;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Lnet/bytebuddy/matcher/NameMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public static nameStartsWithIgnoreCase(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/NamedElement;",
            ">(",
            "Ljava/lang/String;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/matcher/NameMatcher;

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/matcher/StringMatcher;

    .line 4
    .line 5
    sget-object v2, Lnet/bytebuddy/matcher/StringMatcher$Mode;->STARTS_WITH_IGNORE_CASE:Lnet/bytebuddy/matcher/StringMatcher$Mode;

    .line 6
    .line 7
    invoke-direct {v1, p0, v2}, Lnet/bytebuddy/matcher/StringMatcher;-><init>(Ljava/lang/String;Lnet/bytebuddy/matcher/StringMatcher$Mode;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Lnet/bytebuddy/matcher/NameMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public static named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/NamedElement;",
            ">(",
            "Ljava/lang/String;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/matcher/NameMatcher;

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/matcher/StringMatcher;

    .line 4
    .line 5
    sget-object v2, Lnet/bytebuddy/matcher/StringMatcher$Mode;->EQUALS_FULLY:Lnet/bytebuddy/matcher/StringMatcher$Mode;

    .line 6
    .line 7
    invoke-direct {v1, p0, v2}, Lnet/bytebuddy/matcher/StringMatcher;-><init>(Ljava/lang/String;Lnet/bytebuddy/matcher/StringMatcher$Mode;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Lnet/bytebuddy/matcher/NameMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public static namedIgnoreCase(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/NamedElement;",
            ">(",
            "Ljava/lang/String;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/matcher/NameMatcher;

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/matcher/StringMatcher;

    .line 4
    .line 5
    sget-object v2, Lnet/bytebuddy/matcher/StringMatcher$Mode;->EQUALS_FULLY_IGNORE_CASE:Lnet/bytebuddy/matcher/StringMatcher$Mode;

    .line 6
    .line 7
    invoke-direct {v1, p0, v2}, Lnet/bytebuddy/matcher/StringMatcher;-><init>(Ljava/lang/String;Lnet/bytebuddy/matcher/StringMatcher$Mode;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Lnet/bytebuddy/matcher/NameMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public static varargs namedOneOf([Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/NamedElement;",
            ">([",
            "Ljava/lang/String;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/matcher/NameMatcher;

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/matcher/StringSetMatcher;

    .line 4
    .line 5
    new-instance v2, Ljava/util/HashSet;

    .line 6
    .line 7
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-direct {v2, p0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, v2}, Lnet/bytebuddy/matcher/StringSetMatcher;-><init>(Ljava/util/Set;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1}, Lnet/bytebuddy/matcher/NameMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public static none()Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Lnet/bytebuddy/matcher/BooleanMatcher;->of(Z)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    return-object v0
.end method

.method public static noneOf(Ljava/lang/Iterable;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable<",
            "*>;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/Object;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->not(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/Object;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->not(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    if-nez v0, :cond_2

    .line 41
    .line 42
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->any()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :cond_2
    return-object v0
.end method

.method public static varargs noneOf([Ljava/lang/Object;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([",
            "Ljava/lang/Object;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 48
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->noneOf(Ljava/lang/Iterable;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static varargs noneOf([Ljava/lang/annotation/Annotation;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription;",
            ">([",
            "Ljava/lang/annotation/Annotation;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 53
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationList$ForLoadedAnnotations;

    invoke-direct {v0, p0}, Lnet/bytebuddy/description/annotation/AnnotationList$ForLoadedAnnotations;-><init>([Ljava/lang/annotation/Annotation;)V

    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->noneOf(Ljava/lang/Iterable;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static varargs noneOf([Ljava/lang/reflect/Constructor;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">([",
            "Ljava/lang/reflect/Constructor<",
            "*>;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 50
    new-instance v0, Lnet/bytebuddy/description/method/MethodList$ForLoadedMethods;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/reflect/Method;

    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/description/method/MethodList$ForLoadedMethods;-><init>([Ljava/lang/reflect/Constructor;[Ljava/lang/reflect/Method;)V

    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->noneOf(Ljava/lang/Iterable;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->definedMethod(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static varargs noneOf([Ljava/lang/reflect/Field;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/field/FieldDescription;",
            ">([",
            "Ljava/lang/reflect/Field;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 52
    new-instance v0, Lnet/bytebuddy/description/field/FieldList$ForLoadedFields;

    invoke-direct {v0, p0}, Lnet/bytebuddy/description/field/FieldList$ForLoadedFields;-><init>([Ljava/lang/reflect/Field;)V

    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->noneOf(Ljava/lang/Iterable;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->definedField(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static varargs noneOf([Ljava/lang/reflect/Method;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">([",
            "Ljava/lang/reflect/Method;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 51
    new-instance v0, Lnet/bytebuddy/description/method/MethodList$ForLoadedMethods;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/reflect/Constructor;

    invoke-direct {v0, v1, p0}, Lnet/bytebuddy/description/method/MethodList$ForLoadedMethods;-><init>([Ljava/lang/reflect/Constructor;[Ljava/lang/reflect/Method;)V

    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->noneOf(Ljava/lang/Iterable;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->definedMethod(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static varargs noneOf([Ljava/lang/reflect/Type;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ">([",
            "Ljava/lang/reflect/Type;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 49
    new-instance v0, Lnet/bytebuddy/description/type/TypeList$Generic$ForLoadedTypes;

    invoke-direct {v0, p0}, Lnet/bytebuddy/description/type/TypeList$Generic$ForLoadedTypes;-><init>([Ljava/lang/reflect/Type;)V

    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->noneOf(Ljava/lang/Iterable;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static not(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-TT;>;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/matcher/NegatingMatcher;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lnet/bytebuddy/matcher/NegatingMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static ofSort(Lnet/bytebuddy/description/type/TypeDefinition$Sort;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ">(",
            "Lnet/bytebuddy/description/type/TypeDefinition$Sort;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/Object;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->ofSort(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static ofSort(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ">(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDefinition$Sort;",
            ">;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 10
    new-instance v0, Lnet/bytebuddy/matcher/TypeSortMatcher;

    invoke-direct {v0, p0}, Lnet/bytebuddy/matcher/TypeSortMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    return-object v0
.end method

.method public static ofType(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/ClassLoader;",
            ">(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/matcher/InstanceTypeMatcher;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lnet/bytebuddy/matcher/InstanceTypeMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static returns(Ljava/lang/Class;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->erasure(Ljava/lang/Class;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->returnsGeneric(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static returns(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 10
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/Object;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->returns(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static returns(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 11
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->erasure(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->returnsGeneric(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static returnsGeneric(Ljava/lang/reflect/Type;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(",
            "Ljava/lang/reflect/Type;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->describe(Ljava/lang/reflect/Type;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->returnsGeneric(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static returnsGeneric(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 10
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/Object;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->returnsGeneric(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static returnsGeneric(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ">;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 11
    new-instance v0, Lnet/bytebuddy/matcher/MethodReturnTypeMatcher;

    invoke-direct {v0, p0}, Lnet/bytebuddy/matcher/MethodReturnTypeMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    return-object v0
.end method

.method public static supportsModules()Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lnet/bytebuddy/utility/JavaModule;",
            ">()",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lnet/bytebuddy/matcher/NullMatcher;->make()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->not(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public static takesArgument(ILjava/lang/Class;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(I",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p0, p1}, Lnet/bytebuddy/matcher/ElementMatchers;->takesArgument(ILnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static takesArgument(ILnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(I",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 10
    invoke-static {p1}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/Object;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p1

    invoke-static {p0, p1}, Lnet/bytebuddy/matcher/ElementMatchers;->takesArgument(ILnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static takesArgument(ILnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(I",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 11
    invoke-static {p1}, Lnet/bytebuddy/matcher/ElementMatchers;->erasure(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p1

    invoke-static {p0, p1}, Lnet/bytebuddy/matcher/ElementMatchers;->takesGenericArgument(ILnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static takesArguments(I)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(I)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 43
    new-instance v0, Lnet/bytebuddy/matcher/MethodParametersMatcher;

    new-instance v1, Lnet/bytebuddy/matcher/CollectionSizeMatcher;

    invoke-direct {v1, p0}, Lnet/bytebuddy/matcher/CollectionSizeMatcher;-><init>(I)V

    invoke-direct {v0, v1}, Lnet/bytebuddy/matcher/MethodParametersMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    return-object v0
.end method

.method public static takesArguments(Ljava/lang/Iterable;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(",
            "Ljava/lang/Iterable<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lnet/bytebuddy/description/type/TypeDescription;

    .line 21
    .line 22
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->erasure(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance p0, Lnet/bytebuddy/matcher/CollectionOneToOneMatcher;

    .line 31
    .line 32
    invoke-direct {p0, v0}, Lnet/bytebuddy/matcher/CollectionOneToOneMatcher;-><init>(Ljava/util/List;)V

    .line 33
    .line 34
    .line 35
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->takesGenericArguments(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method

.method public static takesArguments(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Ljava/lang/Iterable<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;>;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 42
    new-instance v0, Lnet/bytebuddy/matcher/MethodParametersMatcher;

    new-instance v1, Lnet/bytebuddy/matcher/MethodParameterTypesMatcher;

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->erasures(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    invoke-direct {v1, p0}, Lnet/bytebuddy/matcher/MethodParameterTypesMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    invoke-direct {v0, v1}, Lnet/bytebuddy/matcher/MethodParametersMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    return-object v0
.end method

.method public static varargs takesArguments([Ljava/lang/Class;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">([",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 41
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->erasures([Ljava/lang/Class;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->takesGenericArguments(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static varargs takesArguments([Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">([",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 40
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->erasures([Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->takesGenericArguments(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static takesGenericArgument(ILjava/lang/reflect/Type;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(I",
            "Ljava/lang/reflect/Type;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 12
    invoke-static {p1}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->describe(Ljava/lang/reflect/Type;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object p1

    invoke-static {p0, p1}, Lnet/bytebuddy/matcher/ElementMatchers;->takesGenericArgument(ILnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static takesGenericArgument(ILnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(I",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 11
    invoke-static {p1}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/Object;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p1

    invoke-static {p0, p1}, Lnet/bytebuddy/matcher/ElementMatchers;->takesGenericArgument(ILnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static takesGenericArgument(ILnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(I",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ">;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/matcher/CollectionElementMatcher;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lnet/bytebuddy/matcher/CollectionElementMatcher;-><init>(ILnet/bytebuddy/matcher/ElementMatcher;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->takesGenericArguments(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static takesGenericArguments(Ljava/util/List;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ">;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lnet/bytebuddy/description/type/TypeDefinition;

    .line 21
    .line 22
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/Object;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance p0, Lnet/bytebuddy/matcher/CollectionOneToOneMatcher;

    .line 31
    .line 32
    invoke-direct {p0, v0}, Lnet/bytebuddy/matcher/CollectionOneToOneMatcher;-><init>(Ljava/util/List;)V

    .line 33
    .line 34
    .line 35
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->takesGenericArguments(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method

.method public static takesGenericArguments(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Ljava/lang/Iterable<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ">;>;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 42
    new-instance v0, Lnet/bytebuddy/matcher/MethodParametersMatcher;

    new-instance v1, Lnet/bytebuddy/matcher/MethodParameterTypesMatcher;

    invoke-direct {v1, p0}, Lnet/bytebuddy/matcher/MethodParameterTypesMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    invoke-direct {v0, v1}, Lnet/bytebuddy/matcher/MethodParametersMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    return-object v0
.end method

.method public static varargs takesGenericArguments([Ljava/lang/reflect/Type;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">([",
            "Ljava/lang/reflect/Type;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 41
    new-instance v0, Lnet/bytebuddy/description/type/TypeList$Generic$ForLoadedTypes;

    invoke-direct {v0, p0}, Lnet/bytebuddy/description/type/TypeList$Generic$ForLoadedTypes;-><init>([Ljava/lang/reflect/Type;)V

    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->takesGenericArguments(Ljava/util/List;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static varargs takesGenericArguments([Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">([",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 40
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->takesGenericArguments(Ljava/util/List;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p0

    return-object p0
.end method

.method public static takesNoArguments()Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">()",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->takesArguments(I)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    return-object v0
.end method

.method public static targetsElement(Ljava/lang/annotation/ElementType;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription;",
            ">(",
            "Ljava/lang/annotation/ElementType;",
            ")",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/matcher/AnnotationTargetMatcher;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lnet/bytebuddy/matcher/AnnotationTargetMatcher;-><init>(Ljava/lang/annotation/ElementType;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static whereAny(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-TT;>;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "Ljava/lang/Iterable<",
            "+TT;>;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/matcher/CollectionItemMatcher;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lnet/bytebuddy/matcher/CollectionItemMatcher;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static whereNone(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-TT;>;)",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "Ljava/lang/Iterable<",
            "+TT;>;>;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->whereAny(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->not(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method
