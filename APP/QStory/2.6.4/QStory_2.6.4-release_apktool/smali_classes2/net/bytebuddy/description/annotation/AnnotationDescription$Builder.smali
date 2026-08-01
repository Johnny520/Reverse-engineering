.class public Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/annotation/AnnotationDescription;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final annotationType:Lnet/bytebuddy/description/type/TypeDescription;

.field private final annotationValues:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "**>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "**>;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->annotationType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->annotationValues:Ljava/util/Map;

    .line 7
    .line 8
    return-void
.end method

.method public static ofType(Ljava/lang/Class;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/annotation/Annotation;",
            ">;)",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;"
        }
    .end annotation

    .line 26
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->ofType(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;

    move-result-object p0

    return-object p0
.end method

.method public static ofType(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;
    .locals 2

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/ModifierReviewable$ForTypeDefinition;->isAnnotation()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;

    .line 8
    .line 9
    sget-object v1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 10
    .line 11
    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/Map;)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    const-string v0, "Not an annotation type: "

    .line 16
    .line 17
    invoke-static {v0, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    return-object p0
.end method


# virtual methods
.method public build()Lnet/bytebuddy/description/annotation/AnnotationDescription;
    .locals 6

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->annotationType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_4

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 22
    .line 23
    iget-object v2, p0, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->annotationValues:Ljava/util/Map;

    .line 24
    .line 25
    invoke-interface {v1}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    if-nez v2, :cond_2

    .line 37
    .line 38
    invoke-interface {v1}, Lnet/bytebuddy/description/method/MethodDescription;->getDefaultValue()Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    if-eqz v4, :cond_1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const-string p0, "No value or default value defined for "

    .line 46
    .line 47
    invoke-interface {v1}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {v0, p0}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰哲楪;->飘花落叶言子世楪苏哲兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v3

    .line 55
    :cond_2
    :goto_1
    if-eqz v2, :cond_0

    .line 56
    .line 57
    invoke-interface {v2, v1}, Lnet/bytebuddy/description/annotation/AnnotationValue;->filter(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-interface {v4}, Lnet/bytebuddy/description/annotation/AnnotationValue;->getState()Lnet/bytebuddy/description/annotation/AnnotationValue$State;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    sget-object v5, Lnet/bytebuddy/description/annotation/AnnotationValue$State;->RESOLVED:Lnet/bytebuddy/description/annotation/AnnotationValue$State;

    .line 66
    .line 67
    if-ne v4, v5, :cond_3

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    const-string p0, "Illegal annotation value for "

    .line 71
    .line 72
    const-string v0, ": "

    .line 73
    .line 74
    invoke-static {p0, v1, v0, v2}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    return-object v3

    .line 78
    :cond_4
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationDescription$Latent;

    .line 79
    .line 80
    iget-object v1, p0, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->annotationType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 81
    .line 82
    iget-object p0, p0, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->annotationValues:Ljava/util/Map;

    .line 83
    .line 84
    invoke-direct {v0, v1, p0}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Latent;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/Map;)V

    .line 85
    .line 86
    .line 87
    return-object v0
.end method

.method public build(Z)Lnet/bytebuddy/description/annotation/AnnotationDescription;
    .locals 1

    if-eqz p1, :cond_0

    .line 88
    invoke-virtual {p0}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->build()Lnet/bytebuddy/description/annotation/AnnotationDescription;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p1, Lnet/bytebuddy/description/annotation/AnnotationDescription$Latent;

    iget-object v0, p0, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->annotationType:Lnet/bytebuddy/description/type/TypeDescription;

    iget-object p0, p0, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->annotationValues:Ljava/util/Map;

    invoke-direct {p1, v0, p0}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Latent;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/Map;)V

    return-object p1
.end method

.method public define(Ljava/lang/String;B)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;
    .locals 0

    .line 81
    invoke-static {p2}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->of(B)Lnet/bytebuddy/description/annotation/AnnotationValue;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->define(Ljava/lang/String;Lnet/bytebuddy/description/annotation/AnnotationValue;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;

    move-result-object p0

    return-object p0
.end method

.method public define(Ljava/lang/String;C)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;
    .locals 0

    .line 82
    invoke-static {p2}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->of(C)Lnet/bytebuddy/description/annotation/AnnotationValue;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->define(Ljava/lang/String;Lnet/bytebuddy/description/annotation/AnnotationValue;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;

    move-result-object p0

    return-object p0
.end method

.method public define(Ljava/lang/String;D)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;
    .locals 0

    .line 87
    invoke-static {p2, p3}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->of(D)Lnet/bytebuddy/description/annotation/AnnotationValue;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->define(Ljava/lang/String;Lnet/bytebuddy/description/annotation/AnnotationValue;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;

    move-result-object p0

    return-object p0
.end method

.method public define(Ljava/lang/String;F)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;
    .locals 0

    .line 86
    invoke-static {p2}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->of(F)Lnet/bytebuddy/description/annotation/AnnotationValue;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->define(Ljava/lang/String;Lnet/bytebuddy/description/annotation/AnnotationValue;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;

    move-result-object p0

    return-object p0
.end method

.method public define(Ljava/lang/String;I)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;
    .locals 0

    .line 84
    invoke-static {p2}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->of(I)Lnet/bytebuddy/description/annotation/AnnotationValue;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->define(Ljava/lang/String;Lnet/bytebuddy/description/annotation/AnnotationValue;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;

    move-result-object p0

    return-object p0
.end method

.method public define(Ljava/lang/String;J)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;
    .locals 0

    .line 85
    invoke-static {p2, p3}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->of(J)Lnet/bytebuddy/description/annotation/AnnotationValue;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->define(Ljava/lang/String;Lnet/bytebuddy/description/annotation/AnnotationValue;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;

    move-result-object p0

    return-object p0
.end method

.method public define(Ljava/lang/String;Ljava/lang/Class;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;"
        }
    .end annotation

    .line 78
    invoke-static {p2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->define(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;

    move-result-object p0

    return-object p0
.end method

.method public define(Ljava/lang/String;Ljava/lang/Enum;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Enum<",
            "*>;)",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;"
        }
    .end annotation

    .line 73
    new-instance v0, Lnet/bytebuddy/description/enumeration/EnumerationDescription$ForLoadedEnumeration;

    invoke-direct {v0, p2}, Lnet/bytebuddy/description/enumeration/EnumerationDescription$ForLoadedEnumeration;-><init>(Ljava/lang/Enum;)V

    invoke-virtual {p0, p1, v0}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->define(Ljava/lang/String;Lnet/bytebuddy/description/enumeration/EnumerationDescription;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;

    move-result-object p0

    return-object p0
.end method

.method public define(Ljava/lang/String;Ljava/lang/String;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;
    .locals 0

    .line 88
    invoke-static {p2}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->of(Ljava/lang/String;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->define(Ljava/lang/String;Lnet/bytebuddy/description/annotation/AnnotationValue;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;

    move-result-object p0

    return-object p0
.end method

.method public define(Ljava/lang/String;Ljava/lang/annotation/Annotation;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;
    .locals 1

    .line 76
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationDescription$ForLoadedAnnotation;

    invoke-direct {v0, p2}, Lnet/bytebuddy/description/annotation/AnnotationDescription$ForLoadedAnnotation;-><init>(Ljava/lang/annotation/Annotation;)V

    invoke-virtual {p0, p1, v0}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->define(Ljava/lang/String;Lnet/bytebuddy/description/annotation/AnnotationDescription;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;

    move-result-object p0

    return-object p0
.end method

.method public define(Ljava/lang/String;Lnet/bytebuddy/description/annotation/AnnotationDescription;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;
    .locals 1

    .line 77
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForAnnotationDescription;

    invoke-direct {v0, p2}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForAnnotationDescription;-><init>(Lnet/bytebuddy/description/annotation/AnnotationDescription;)V

    invoke-virtual {p0, p1, v0}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->define(Ljava/lang/String;Lnet/bytebuddy/description/annotation/AnnotationValue;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;

    move-result-object p0

    return-object p0
.end method

.method public define(Ljava/lang/String;Lnet/bytebuddy/description/annotation/AnnotationValue;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "**>;)",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->annotationType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lnet/bytebuddy/description/method/MethodList;

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, 0x0

    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    new-instance v1, Ljava/util/HashMap;

    .line 25
    .line 26
    iget-object v3, p0, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->annotationValues:Ljava/util/Map;

    .line 27
    .line 28
    invoke-direct {v1, v3}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v0}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 36
    .line 37
    invoke-interface {v0}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v1, v0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    if-nez p2, :cond_0

    .line 46
    .line 47
    new-instance p1, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;

    .line 48
    .line 49
    iget-object p0, p0, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->annotationType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 50
    .line 51
    invoke-direct {p1, p0, v1}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/Map;)V

    .line 52
    .line 53
    .line 54
    return-object p1

    .line 55
    :cond_0
    const-string p0, "Property already defined: "

    .line 56
    .line 57
    invoke-static {p0, p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-object v2

    .line 65
    :cond_1
    iget-object p0, p0, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->annotationType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 66
    .line 67
    const-string p2, " does not define a property named "

    .line 68
    .line 69
    invoke-static {p0, p2, p1}, Landroidx/fragment/app/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    return-object v2
.end method

.method public define(Ljava/lang/String;Lnet/bytebuddy/description/enumeration/EnumerationDescription;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;
    .locals 0

    .line 75
    invoke-static {p2}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForEnumerationDescription;->of(Lnet/bytebuddy/description/enumeration/EnumerationDescription;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->define(Ljava/lang/String;Lnet/bytebuddy/description/annotation/AnnotationValue;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;

    move-result-object p0

    return-object p0
.end method

.method public define(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;
    .locals 0

    .line 79
    invoke-static {p2}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForTypeDescription;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->define(Ljava/lang/String;Lnet/bytebuddy/description/annotation/AnnotationValue;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;

    move-result-object p0

    return-object p0
.end method

.method public define(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;
    .locals 1

    .line 74
    new-instance v0, Lnet/bytebuddy/description/enumeration/EnumerationDescription$Latent;

    invoke-direct {v0, p2, p3}, Lnet/bytebuddy/description/enumeration/EnumerationDescription$Latent;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;)V

    invoke-virtual {p0, p1, v0}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->define(Ljava/lang/String;Lnet/bytebuddy/description/enumeration/EnumerationDescription;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;

    move-result-object p0

    return-object p0
.end method

.method public define(Ljava/lang/String;S)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;
    .locals 0

    .line 83
    invoke-static {p2}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->of(S)Lnet/bytebuddy/description/annotation/AnnotationValue;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->define(Ljava/lang/String;Lnet/bytebuddy/description/annotation/AnnotationValue;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;

    move-result-object p0

    return-object p0
.end method

.method public define(Ljava/lang/String;Z)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;
    .locals 0

    .line 80
    invoke-static {p2}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->of(Z)Lnet/bytebuddy/description/annotation/AnnotationValue;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->define(Ljava/lang/String;Lnet/bytebuddy/description/annotation/AnnotationValue;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;

    move-result-object p0

    return-object p0
.end method

.method public varargs defineAnnotationArray(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/annotation/Annotation;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/annotation/Annotation;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;[TT;)",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;"
        }
    .end annotation

    .line 1
    invoke-static {p2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationList$ForLoadedAnnotations;

    .line 6
    .line 7
    invoke-static {p3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p3

    .line 11
    invoke-direct {v0, p3}, Lnet/bytebuddy/description/annotation/AnnotationList$ForLoadedAnnotations;-><init>(Ljava/util/List;)V

    .line 12
    .line 13
    .line 14
    const/4 p3, 0x0

    .line 15
    new-array p3, p3, [Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 16
    .line 17
    invoke-virtual {v0, p3}, Ljava/util/AbstractCollection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    check-cast p3, [Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 22
    .line 23
    invoke-virtual {p0, p1, p2, p3}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->defineAnnotationArray(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/annotation/AnnotationDescription;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method public varargs defineAnnotationArray(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/annotation/AnnotationDescription;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;
    .locals 0

    .line 28
    invoke-static {p2, p3}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;->of(Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/annotation/AnnotationDescription;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->define(Ljava/lang/String;Lnet/bytebuddy/description/annotation/AnnotationValue;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;

    move-result-object p0

    return-object p0
.end method

.method public varargs defineArray(Ljava/lang/String;[B)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;
    .locals 0

    .line 10
    invoke-static {p2}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->of([B)Lnet/bytebuddy/description/annotation/AnnotationValue;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->define(Ljava/lang/String;Lnet/bytebuddy/description/annotation/AnnotationValue;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;

    move-result-object p0

    return-object p0
.end method

.method public varargs defineArray(Ljava/lang/String;[C)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;
    .locals 0

    .line 11
    invoke-static {p2}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->of([C)Lnet/bytebuddy/description/annotation/AnnotationValue;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->define(Ljava/lang/String;Lnet/bytebuddy/description/annotation/AnnotationValue;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;

    move-result-object p0

    return-object p0
.end method

.method public varargs defineArray(Ljava/lang/String;[D)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;
    .locals 0

    .line 16
    invoke-static {p2}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->of([D)Lnet/bytebuddy/description/annotation/AnnotationValue;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->define(Ljava/lang/String;Lnet/bytebuddy/description/annotation/AnnotationValue;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;

    move-result-object p0

    return-object p0
.end method

.method public varargs defineArray(Ljava/lang/String;[F)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;
    .locals 0

    .line 15
    invoke-static {p2}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->of([F)Lnet/bytebuddy/description/annotation/AnnotationValue;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->define(Ljava/lang/String;Lnet/bytebuddy/description/annotation/AnnotationValue;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;

    move-result-object p0

    return-object p0
.end method

.method public varargs defineArray(Ljava/lang/String;[I)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;
    .locals 0

    .line 13
    invoke-static {p2}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->of([I)Lnet/bytebuddy/description/annotation/AnnotationValue;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->define(Ljava/lang/String;Lnet/bytebuddy/description/annotation/AnnotationValue;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;

    move-result-object p0

    return-object p0
.end method

.method public varargs defineArray(Ljava/lang/String;[J)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;
    .locals 0

    .line 14
    invoke-static {p2}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->of([J)Lnet/bytebuddy/description/annotation/AnnotationValue;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->define(Ljava/lang/String;Lnet/bytebuddy/description/annotation/AnnotationValue;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;

    move-result-object p0

    return-object p0
.end method

.method public varargs defineArray(Ljava/lang/String;[Ljava/lang/String;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;
    .locals 0

    .line 17
    invoke-static {p2}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->of([Ljava/lang/String;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->define(Ljava/lang/String;Lnet/bytebuddy/description/annotation/AnnotationValue;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;

    move-result-object p0

    return-object p0
.end method

.method public varargs defineArray(Ljava/lang/String;[S)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;
    .locals 0

    .line 12
    invoke-static {p2}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->of([S)Lnet/bytebuddy/description/annotation/AnnotationValue;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->define(Ljava/lang/String;Lnet/bytebuddy/description/annotation/AnnotationValue;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;

    move-result-object p0

    return-object p0
.end method

.method public varargs defineArray(Ljava/lang/String;[Z)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;
    .locals 0

    .line 1
    invoke-static {p2}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->of([Z)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->define(Ljava/lang/String;Lnet/bytebuddy/description/annotation/AnnotationValue;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public varargs defineEnumerationArray(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Enum;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Enum<",
            "*>;>(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;[TT;)",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;"
        }
    .end annotation

    .line 42
    array-length v0, p3

    new-array v0, v0, [Lnet/bytebuddy/description/enumeration/EnumerationDescription;

    .line 43
    array-length v1, p3

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v4, p3, v2

    add-int/lit8 v5, v3, 0x1

    .line 44
    new-instance v6, Lnet/bytebuddy/description/enumeration/EnumerationDescription$ForLoadedEnumeration;

    invoke-direct {v6, v4}, Lnet/bytebuddy/description/enumeration/EnumerationDescription$ForLoadedEnumeration;-><init>(Ljava/lang/Enum;)V

    aput-object v6, v0, v3

    add-int/lit8 v2, v2, 0x1

    move v3, v5

    goto :goto_0

    .line 45
    :cond_0
    invoke-static {p2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p2

    invoke-virtual {p0, p1, p2, v0}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->defineEnumerationArray(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/enumeration/EnumerationDescription;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;

    move-result-object p0

    return-object p0
.end method

.method public varargs defineEnumerationArray(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Ljava/lang/String;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;
    .locals 4

    .line 1
    invoke-interface {p2}, Lnet/bytebuddy/description/ModifierReviewable$OfEnumeration;->isEnum()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    array-length v0, p3

    .line 8
    new-array v0, v0, [Lnet/bytebuddy/description/enumeration/EnumerationDescription;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    array-length v2, p3

    .line 12
    if-ge v1, v2, :cond_0

    .line 13
    .line 14
    new-instance v2, Lnet/bytebuddy/description/enumeration/EnumerationDescription$Latent;

    .line 15
    .line 16
    aget-object v3, p3, v1

    .line 17
    .line 18
    invoke-direct {v2, p2, v3}, Lnet/bytebuddy/description/enumeration/EnumerationDescription$Latent;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    aput-object v2, v0, v1

    .line 22
    .line 23
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {p0, p1, p2, v0}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->defineEnumerationArray(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/enumeration/EnumerationDescription;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_1
    const-string p0, "Not an enumeration type: "

    .line 32
    .line 33
    invoke-static {p0, p2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 p0, 0x0

    .line 41
    return-object p0
.end method

.method public varargs defineEnumerationArray(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/enumeration/EnumerationDescription;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;
    .locals 0

    .line 46
    invoke-static {p2, p3}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;->of(Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/enumeration/EnumerationDescription;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->define(Ljava/lang/String;Lnet/bytebuddy/description/annotation/AnnotationValue;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;

    move-result-object p0

    return-object p0
.end method

.method public varargs defineTypeArray(Ljava/lang/String;[Ljava/lang/Class;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/description/type/TypeList$ForLoadedTypes;

    .line 2
    .line 3
    invoke-direct {v0, p2}, Lnet/bytebuddy/description/type/TypeList$ForLoadedTypes;-><init>([Ljava/lang/Class;)V

    .line 4
    .line 5
    .line 6
    const/4 p2, 0x0

    .line 7
    new-array p2, p2, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 8
    .line 9
    invoke-virtual {v0, p2}, Ljava/util/AbstractCollection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    check-cast p2, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 14
    .line 15
    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->defineTypeArray(Ljava/lang/String;[Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public varargs defineTypeArray(Ljava/lang/String;[Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;
    .locals 0

    .line 20
    invoke-static {p2}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;->of([Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->define(Ljava/lang/String;Lnet/bytebuddy/description/annotation/AnnotationValue;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;

    move-result-object p0

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eq v2, v3, :cond_2

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    iget-object v2, p0, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->annotationType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->annotationType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    iget-object p0, p0, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->annotationValues:Ljava/util/Map;

    .line 34
    .line 35
    iget-object p1, p1, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->annotationValues:Ljava/util/Map;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-nez p0, :cond_4

    .line 42
    .line 43
    return v1

    .line 44
    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x1f

    .line 10
    .line 11
    mul-int/2addr v0, v1

    .line 12
    iget-object v2, p0, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->annotationType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Lnet/bytebuddy/description/type/TypeDescription;II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object p0, p0, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->annotationValues:Ljava/util/Map;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    add-int/2addr p0, v0

    .line 25
    return p0
.end method
