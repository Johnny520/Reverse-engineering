.class public Lnet/bytebuddy/build/HashCodeAndEqualsPlugin;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/build/Plugin;
.implements Lnet/bytebuddy/build/Plugin$Factory;
.implements Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Factory;
.implements Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueMatcher;,
        Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$AnnotationOrderComparator;,
        Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Identity;,
        Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Sorted;,
        Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling;,
        Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;,
        Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$WithNonNullableFields;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final ENHANCE_INCLUDE_SYNTHETIC_FIELDS:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field private static final ENHANCE_INVOKE_SUPER:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field private static final ENHANCE_PERMIT_SUBCLASS_EQUALITY:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field private static final ENHANCE_SIMPLE_COMPARISON_FIRST:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field private static final ENHANCE_USE_TYPE_HASH_CONSTANT:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field private static final SORTED_VALUE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field private static final VALUE_HANDLING_VALUE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;


# instance fields
.field private final annotationType:Ljava/lang/String;
    .annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling;
        value = .enum Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;->REVERSE_NULLABILITY:Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-class v0, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "invokeSuper"

    .line 12
    .line 13
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lnet/bytebuddy/description/method/MethodList;

    .line 22
    .line 23
    invoke-interface {v1}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 28
    .line 29
    sput-object v1, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin;->ENHANCE_INVOKE_SUPER:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 30
    .line 31
    const-string v1, "simpleComparisonsFirst"

    .line 32
    .line 33
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Lnet/bytebuddy/description/method/MethodList;

    .line 42
    .line 43
    invoke-interface {v1}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 48
    .line 49
    sput-object v1, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin;->ENHANCE_SIMPLE_COMPARISON_FIRST:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 50
    .line 51
    const-string v1, "includeSyntheticFields"

    .line 52
    .line 53
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    check-cast v1, Lnet/bytebuddy/description/method/MethodList;

    .line 62
    .line 63
    invoke-interface {v1}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 68
    .line 69
    sput-object v1, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin;->ENHANCE_INCLUDE_SYNTHETIC_FIELDS:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 70
    .line 71
    const-string v1, "permitSubclassEquality"

    .line 72
    .line 73
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    check-cast v1, Lnet/bytebuddy/description/method/MethodList;

    .line 82
    .line 83
    invoke-interface {v1}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    check-cast v1, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 88
    .line 89
    sput-object v1, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin;->ENHANCE_PERMIT_SUBCLASS_EQUALITY:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 90
    .line 91
    const-string v1, "useTypeHashConstant"

    .line 92
    .line 93
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    check-cast v0, Lnet/bytebuddy/description/method/MethodList;

    .line 102
    .line 103
    invoke-interface {v0}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    check-cast v0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 108
    .line 109
    sput-object v0, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin;->ENHANCE_USE_TYPE_HASH_CONSTANT:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 110
    .line 111
    const-class v0, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling;

    .line 112
    .line 113
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    const-string v1, "value"

    .line 122
    .line 123
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    invoke-interface {v0, v2}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    check-cast v0, Lnet/bytebuddy/description/method/MethodList;

    .line 132
    .line 133
    invoke-interface {v0}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    check-cast v0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 138
    .line 139
    sput-object v0, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin;->VALUE_HANDLING_VALUE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 140
    .line 141
    const-class v0, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Sorted;

    .line 142
    .line 143
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    check-cast v0, Lnet/bytebuddy/description/method/MethodList;

    .line 160
    .line 161
    invoke-interface {v0}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    check-cast v0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 166
    .line 167
    sput-object v0, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin;->SORTED_VALUE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 168
    .line 169
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, v0}, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin;->annotationType:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static synthetic access$100()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin;->SORTED_VALUE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$200()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin;->VALUE_HANDLING_VALUE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/dynamic/DynamicType$Builder;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "*>;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/dynamic/ClassFileLocator;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "*>;"
        }
    .end annotation

    .line 1
    invoke-interface {p2}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    const-class v0, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;

    .line 6
    .line 7
    invoke-interface {p3, v0}, Lnet/bytebuddy/description/annotation/AnnotationList;->ofType(Ljava/lang/Class;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable;

    .line 8
    .line 9
    .line 10
    move-result-object p3

    .line 11
    invoke-interface {p2}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isHashCode()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-interface {v1, v2}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lnet/bytebuddy/description/method/MethodList;

    .line 24
    .line 25
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    const-class v2, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Identity;

    .line 30
    .line 31
    const-class v3, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance$InvokeSuper;

    .line 32
    .line 33
    const-class v4, Ljava/lang/Boolean;

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isHashCode()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-interface {p1, v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    sget-object v1, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin;->ENHANCE_INVOKE_SUPER:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 46
    .line 47
    invoke-interface {p3, v1}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-interface {v1, v5}, Lnet/bytebuddy/description/annotation/AnnotationValue;->load(Ljava/lang/ClassLoader;)Lnet/bytebuddy/description/annotation/AnnotationValue$Loaded;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-interface {v1, v3}, Lnet/bytebuddy/description/annotation/AnnotationValue$Loaded;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    check-cast v1, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance$InvokeSuper;

    .line 64
    .line 65
    sget-object v5, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin;->ENHANCE_USE_TYPE_HASH_CONSTANT:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 66
    .line 67
    invoke-interface {p3, v5}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    invoke-interface {v5, v4}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    check-cast v5, Ljava/lang/Boolean;

    .line 76
    .line 77
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    sget-object v6, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin;->ENHANCE_PERMIT_SUBCLASS_EQUALITY:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 82
    .line 83
    invoke-interface {p3, v6}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    invoke-interface {v6, v4}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    check-cast v6, Ljava/lang/Boolean;

    .line 92
    .line 93
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    invoke-virtual {v1, p2, v5, v6}, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance$InvokeSuper;->hashCodeMethod(Lnet/bytebuddy/description/type/TypeDescription;ZZ)Lnet/bytebuddy/implementation/HashCodeMethod;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    sget-object v5, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin;->ENHANCE_INCLUDE_SYNTHETIC_FIELDS:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 102
    .line 103
    invoke-interface {p3, v5}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    invoke-interface {v5, v4}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    check-cast v5, Ljava/lang/Boolean;

    .line 112
    .line 113
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    if-eqz v5, :cond_0

    .line 118
    .line 119
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->none()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    goto :goto_0

    .line 124
    :cond_0
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isSynthetic()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    :goto_0
    invoke-virtual {v1, v5}, Lnet/bytebuddy/implementation/HashCodeMethod;->withIgnoredFields(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/implementation/HashCodeMethod;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    new-instance v5, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueMatcher;

    .line 133
    .line 134
    sget-object v6, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;->IGNORE:Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;

    .line 135
    .line 136
    invoke-direct {v5, v6}, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueMatcher;-><init>(Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1, v5}, Lnet/bytebuddy/implementation/HashCodeMethod;->withIgnoredFields(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/implementation/HashCodeMethod;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    new-instance v5, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueMatcher;

    .line 144
    .line 145
    sget-object v6, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;->REVERSE_NULLABILITY:Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;

    .line 146
    .line 147
    invoke-direct {v5, v6}, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueMatcher;-><init>(Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0, v5}, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin;->nonNullable(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    invoke-virtual {v1, v5}, Lnet/bytebuddy/implementation/HashCodeMethod;->withNonNullableFields(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/implementation/HashCodeMethod;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-static {v2}, Lnet/bytebuddy/matcher/ElementMatchers;->isAnnotatedWith(Ljava/lang/Class;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    invoke-virtual {v1, v5}, Lnet/bytebuddy/implementation/HashCodeMethod;->withIdentityFields(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/implementation/HashCodeMethod;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    invoke-interface {p1, v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    :cond_1
    invoke-interface {p2}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isEquals()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 175
    .line 176
    .line 177
    move-result-object v5

    .line 178
    invoke-interface {v1, v5}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    check-cast v1, Lnet/bytebuddy/description/method/MethodList;

    .line 183
    .line 184
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    if-eqz v1, :cond_5

    .line 189
    .line 190
    sget-object v1, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin;->ENHANCE_INVOKE_SUPER:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 191
    .line 192
    invoke-interface {p3, v1}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-interface {v1, v0}, Lnet/bytebuddy/description/annotation/AnnotationValue;->load(Ljava/lang/ClassLoader;)Lnet/bytebuddy/description/annotation/AnnotationValue$Loaded;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-interface {v0, v3}, Lnet/bytebuddy/description/annotation/AnnotationValue$Loaded;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    check-cast v0, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance$InvokeSuper;

    .line 209
    .line 210
    invoke-virtual {v0, p2}, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance$InvokeSuper;->equalsMethod(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/EqualsMethod;

    .line 211
    .line 212
    .line 213
    move-result-object p2

    .line 214
    sget-object v0, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin;->ENHANCE_INCLUDE_SYNTHETIC_FIELDS:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 215
    .line 216
    invoke-interface {p3, v0}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-interface {v0, v4}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    check-cast v0, Ljava/lang/Boolean;

    .line 225
    .line 226
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    if-eqz v0, :cond_2

    .line 231
    .line 232
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->none()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    goto :goto_1

    .line 237
    :cond_2
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isSynthetic()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    :goto_1
    invoke-virtual {p2, v0}, Lnet/bytebuddy/implementation/EqualsMethod;->withIgnoredFields(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/implementation/EqualsMethod;

    .line 242
    .line 243
    .line 244
    move-result-object p2

    .line 245
    new-instance v0, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueMatcher;

    .line 246
    .line 247
    sget-object v1, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;->IGNORE:Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;

    .line 248
    .line 249
    invoke-direct {v0, v1}, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueMatcher;-><init>(Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {p2, v0}, Lnet/bytebuddy/implementation/EqualsMethod;->withIgnoredFields(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/implementation/EqualsMethod;

    .line 253
    .line 254
    .line 255
    move-result-object p2

    .line 256
    new-instance v0, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueMatcher;

    .line 257
    .line 258
    sget-object v1, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;->REVERSE_NULLABILITY:Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;

    .line 259
    .line 260
    invoke-direct {v0, v1}, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueMatcher;-><init>(Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {p0, v0}, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin;->nonNullable(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    invoke-virtual {p2, v0}, Lnet/bytebuddy/implementation/EqualsMethod;->withNonNullableFields(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/implementation/EqualsMethod;

    .line 268
    .line 269
    .line 270
    move-result-object p2

    .line 271
    invoke-static {v2}, Lnet/bytebuddy/matcher/ElementMatchers;->isAnnotatedWith(Ljava/lang/Class;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    invoke-virtual {p2, v0}, Lnet/bytebuddy/implementation/EqualsMethod;->withIdentityFields(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/implementation/EqualsMethod;

    .line 276
    .line 277
    .line 278
    move-result-object p2

    .line 279
    sget-object v0, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$AnnotationOrderComparator;->INSTANCE:Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$AnnotationOrderComparator;

    .line 280
    .line 281
    invoke-virtual {p2, v0}, Lnet/bytebuddy/implementation/EqualsMethod;->withFieldOrder(Ljava/util/Comparator;)Lnet/bytebuddy/implementation/EqualsMethod;

    .line 282
    .line 283
    .line 284
    move-result-object p2

    .line 285
    sget-object v0, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin;->ENHANCE_SIMPLE_COMPARISON_FIRST:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 286
    .line 287
    invoke-interface {p3, v0}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    invoke-interface {v0, v4}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    check-cast v0, Ljava/lang/Boolean;

    .line 296
    .line 297
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 298
    .line 299
    .line 300
    move-result v0

    .line 301
    if-eqz v0, :cond_3

    .line 302
    .line 303
    invoke-virtual {p2}, Lnet/bytebuddy/implementation/EqualsMethod;->withPrimitiveTypedFieldsFirst()Lnet/bytebuddy/implementation/EqualsMethod;

    .line 304
    .line 305
    .line 306
    move-result-object p2

    .line 307
    invoke-virtual {p2}, Lnet/bytebuddy/implementation/EqualsMethod;->withEnumerationTypedFieldsFirst()Lnet/bytebuddy/implementation/EqualsMethod;

    .line 308
    .line 309
    .line 310
    move-result-object p2

    .line 311
    invoke-virtual {p2}, Lnet/bytebuddy/implementation/EqualsMethod;->withPrimitiveWrapperTypedFieldsFirst()Lnet/bytebuddy/implementation/EqualsMethod;

    .line 312
    .line 313
    .line 314
    move-result-object p2

    .line 315
    invoke-virtual {p2}, Lnet/bytebuddy/implementation/EqualsMethod;->withStringTypedFieldsFirst()Lnet/bytebuddy/implementation/EqualsMethod;

    .line 316
    .line 317
    .line 318
    move-result-object p2

    .line 319
    :cond_3
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isEquals()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    invoke-interface {p1, v0}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    .line 324
    .line 325
    .line 326
    move-result-object p1

    .line 327
    sget-object v0, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin;->ENHANCE_PERMIT_SUBCLASS_EQUALITY:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 328
    .line 329
    invoke-interface {p3, v0}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 330
    .line 331
    .line 332
    move-result-object p3

    .line 333
    invoke-interface {p3, v4}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object p3

    .line 337
    check-cast p3, Ljava/lang/Boolean;

    .line 338
    .line 339
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 340
    .line 341
    .line 342
    move-result p3

    .line 343
    if-eqz p3, :cond_4

    .line 344
    .line 345
    invoke-virtual {p2}, Lnet/bytebuddy/implementation/EqualsMethod;->withSubclassEquality()Lnet/bytebuddy/implementation/EqualsMethod;

    .line 346
    .line 347
    .line 348
    move-result-object p2

    .line 349
    :cond_4
    invoke-interface {p1, p2}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 350
    .line 351
    .line 352
    move-result-object p1

    .line 353
    invoke-interface {p1, p0}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition;->attribute(Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Factory;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition;

    .line 354
    .line 355
    .line 356
    move-result-object p0

    .line 357
    return-object p0

    .line 358
    :cond_5
    return-object p1
.end method

.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;)V
    .locals 1

    .line 359
    iget-object p2, p0, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin;->annotationType:Ljava/lang/String;

    if-eqz p2, :cond_0

    .line 360
    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "L"

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p0, p0, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin;->annotationType:Ljava/lang/String;

    const/16 p3, 0x2e

    const/16 v0, 0x2f

    .line 361
    invoke-virtual {p0, p3, v0}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ";"

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 p2, 0x1

    const/4 p3, 0x0

    .line 362
    invoke-virtual {p1, p3, p0, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitParameterAnnotation(ILjava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 363
    invoke-virtual {p0}, Lnet/bytebuddy/jar/asm/AnnotationVisitor;->visitEnd()V

    :cond_0
    return-void
.end method

.method public close()V
    .locals 0

    .line 1
    return-void
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
    iget-object p0, p0, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin;->annotationType:Ljava/lang/String;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin;

    .line 23
    .line 24
    iget-object p1, p1, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin;->annotationType:Ljava/lang/String;

    .line 25
    .line 26
    if-eqz p1, :cond_3

    .line 27
    .line 28
    if-eqz p0, :cond_4

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-nez p0, :cond_5

    .line 35
    .line 36
    return v1

    .line 37
    :cond_3
    if-eqz p0, :cond_5

    .line 38
    .line 39
    :cond_4
    return v1

    .line 40
    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 1

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
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget-object p0, p0, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin;->annotationType:Ljava/lang/String;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    add-int/2addr p0, v0

    .line 20
    return p0

    .line 21
    :cond_0
    return v0
.end method

.method public make()Lnet/bytebuddy/build/Plugin;
    .locals 0

    .line 1
    return-object p0
.end method

.method public make(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender;
    .locals 0

    .line 2
    return-object p0
.end method

.method public bridge synthetic matches(Ljava/lang/Object;)Z
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 19
    check-cast p1, Lnet/bytebuddy/description/type/TypeDescription;

    invoke-virtual {p0, p1}, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin;->matches(Lnet/bytebuddy/description/type/TypeDescription;)Z

    move-result p0

    return p0
.end method

.method public matches(Lnet/bytebuddy/description/type/TypeDescription;)Z
    .locals 0
    .param p1    # Lnet/bytebuddy/description/type/TypeDescription;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-interface {p1}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-class p1, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;

    .line 8
    .line 9
    invoke-interface {p0, p1}, Lnet/bytebuddy/description/annotation/AnnotationList;->isAnnotationPresent(Ljava/lang/Class;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public nonNullable(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "Lnet/bytebuddy/description/field/FieldDescription;",
            ">;)",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "Lnet/bytebuddy/description/field/FieldDescription;",
            ">;"
        }
    .end annotation

    .line 1
    return-object p1
.end method
