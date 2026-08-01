.class final enum Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance$InvokeSuper$1;
.super Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance$InvokeSuper;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance$InvokeSuper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4009
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance$InvokeSuper;-><init>(Ljava/lang/String;ILnet/bytebuddy/build/HashCodeAndEqualsPlugin$1;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public equalsMethod(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/EqualsMethod;
    .locals 1

    .line 1
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDefinition;->getSuperClass()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :goto_0
    if-eqz p0, :cond_3

    .line 6
    .line 7
    const-class p1, Ljava/lang/Object;

    .line 8
    .line 9
    invoke-interface {p0, p1}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-nez p1, :cond_3

    .line 14
    .line 15
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-interface {p1}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-class v0, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;

    .line 24
    .line 25
    invoke-interface {p1, v0}, Lnet/bytebuddy/description/annotation/AnnotationList;->isAnnotationPresent(Ljava/lang/Class;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    invoke-static {}, Lnet/bytebuddy/implementation/EqualsMethod;->requiringSuperClassEquality()Lnet/bytebuddy/implementation/EqualsMethod;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :cond_0
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isHashCode()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-interface {p1, v0}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Lnet/bytebuddy/description/method/MethodList;

    .line 49
    .line 50
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_2

    .line 55
    .line 56
    invoke-interface {p1}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    check-cast p0, Lnet/bytebuddy/description/method/MethodDescription;

    .line 61
    .line 62
    invoke-interface {p0}, Lnet/bytebuddy/description/ModifierReviewable$OfAbstraction;->isAbstract()Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-eqz p0, :cond_1

    .line 67
    .line 68
    invoke-static {}, Lnet/bytebuddy/implementation/EqualsMethod;->isolated()Lnet/bytebuddy/implementation/EqualsMethod;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0

    .line 73
    :cond_1
    invoke-static {}, Lnet/bytebuddy/implementation/EqualsMethod;->requiringSuperClassEquality()Lnet/bytebuddy/implementation/EqualsMethod;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    return-object p0

    .line 78
    :cond_2
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->getSuperClass()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    goto :goto_0

    .line 83
    :cond_3
    invoke-static {}, Lnet/bytebuddy/implementation/EqualsMethod;->isolated()Lnet/bytebuddy/implementation/EqualsMethod;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0
.end method

.method public hashCodeMethod(Lnet/bytebuddy/description/type/TypeDescription;ZZ)Lnet/bytebuddy/implementation/HashCodeMethod;
    .locals 1

    .line 1
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDefinition;->getSuperClass()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :goto_0
    if-eqz p0, :cond_4

    .line 6
    .line 7
    const-class p1, Ljava/lang/Object;

    .line 8
    .line 9
    invoke-interface {p0, p1}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-nez p1, :cond_4

    .line 14
    .line 15
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-interface {p1}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-class v0, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;

    .line 24
    .line 25
    invoke-interface {p1, v0}, Lnet/bytebuddy/description/annotation/AnnotationList;->isAnnotationPresent(Ljava/lang/Class;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    invoke-static {}, Lnet/bytebuddy/implementation/HashCodeMethod;->usingSuperClassOffset()Lnet/bytebuddy/implementation/HashCodeMethod;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :cond_0
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isHashCode()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-interface {p1, v0}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Lnet/bytebuddy/description/method/MethodList;

    .line 49
    .line 50
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_3

    .line 55
    .line 56
    invoke-interface {p1}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    check-cast p0, Lnet/bytebuddy/description/method/MethodDescription;

    .line 61
    .line 62
    invoke-interface {p0}, Lnet/bytebuddy/description/ModifierReviewable$OfAbstraction;->isAbstract()Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-eqz p0, :cond_2

    .line 67
    .line 68
    if-eqz p2, :cond_1

    .line 69
    .line 70
    xor-int/lit8 p0, p3, 0x1

    .line 71
    .line 72
    invoke-static {p0}, Lnet/bytebuddy/implementation/HashCodeMethod;->usingTypeHashOffset(Z)Lnet/bytebuddy/implementation/HashCodeMethod;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0

    .line 77
    :cond_1
    invoke-static {}, Lnet/bytebuddy/implementation/HashCodeMethod;->usingDefaultOffset()Lnet/bytebuddy/implementation/HashCodeMethod;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0

    .line 82
    :cond_2
    invoke-static {}, Lnet/bytebuddy/implementation/HashCodeMethod;->usingSuperClassOffset()Lnet/bytebuddy/implementation/HashCodeMethod;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0

    .line 87
    :cond_3
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->getSuperClass()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    goto :goto_0

    .line 92
    :cond_4
    if-eqz p2, :cond_5

    .line 93
    .line 94
    xor-int/lit8 p0, p3, 0x1

    .line 95
    .line 96
    invoke-static {p0}, Lnet/bytebuddy/implementation/HashCodeMethod;->usingTypeHashOffset(Z)Lnet/bytebuddy/implementation/HashCodeMethod;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    return-object p0

    .line 101
    :cond_5
    invoke-static {}, Lnet/bytebuddy/implementation/HashCodeMethod;->usingDefaultOffset()Lnet/bytebuddy/implementation/HashCodeMethod;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    return-object p0
.end method
