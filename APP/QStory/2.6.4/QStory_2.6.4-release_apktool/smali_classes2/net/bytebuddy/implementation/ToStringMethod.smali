.class public Lnet/bytebuddy/implementation/ToStringMethod;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/implementation/Implementation;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/ToStringMethod$ValueConsumer;,
        Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver;,
        Lnet/bytebuddy/implementation/ToStringMethod$Appender;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final STRING_BUILDER_CONSTRUCTOR:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field private static final TO_STRING:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;


# instance fields
.field private final definer:Ljava/lang/String;

.field private final end:Ljava/lang/String;

.field private final ignored:Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "-",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;"
        }
    .end annotation
.end field

.field private final prefixResolver:Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver;

.field private final separator:Ljava/lang/String;

.field private final start:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-class v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v1}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isConstructor()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const-class v3, Ljava/lang/String;

    .line 16
    .line 17
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-static {v3}, Lnet/bytebuddy/matcher/ElementMatchers;->takesArguments([Ljava/lang/Class;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-interface {v2, v3}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-interface {v1, v2}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Lnet/bytebuddy/description/method/MethodList;

    .line 34
    .line 35
    invoke-interface {v1}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 40
    .line 41
    sput-object v1, Lnet/bytebuddy/implementation/ToStringMethod;->STRING_BUILDER_CONSTRUCTOR:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 42
    .line 43
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isToString()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Lnet/bytebuddy/description/method/MethodList;

    .line 60
    .line 61
    invoke-interface {v0}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 66
    .line 67
    sput-object v0, Lnet/bytebuddy/implementation/ToStringMethod;->TO_STRING:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 68
    .line 69
    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver;)V
    .locals 7

    .line 1
    const-string v5, "="

    .line 2
    .line 3
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->none()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 4
    .line 5
    .line 6
    move-result-object v6

    .line 7
    const-string v2, "{"

    .line 8
    .line 9
    const-string v3, "}"

    .line 10
    .line 11
    const-string v4, ", "

    .line 12
    .line 13
    move-object v0, p0

    .line 14
    move-object v1, p1

    .line 15
    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/implementation/ToStringMethod;-><init>(Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnet/bytebuddy/matcher/ElementMatcher$Junction;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method private constructor <init>(Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnet/bytebuddy/matcher/ElementMatcher$Junction;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "-",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;)V"
        }
    .end annotation

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lnet/bytebuddy/implementation/ToStringMethod;->prefixResolver:Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver;

    .line 21
    iput-object p2, p0, Lnet/bytebuddy/implementation/ToStringMethod;->start:Ljava/lang/String;

    .line 22
    iput-object p3, p0, Lnet/bytebuddy/implementation/ToStringMethod;->end:Ljava/lang/String;

    .line 23
    iput-object p4, p0, Lnet/bytebuddy/implementation/ToStringMethod;->separator:Ljava/lang/String;

    .line 24
    iput-object p5, p0, Lnet/bytebuddy/implementation/ToStringMethod;->definer:Ljava/lang/String;

    .line 25
    iput-object p6, p0, Lnet/bytebuddy/implementation/ToStringMethod;->ignored:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    return-void
.end method

.method public static synthetic access$000()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/ToStringMethod;->STRING_BUILDER_CONSTRUCTOR:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$100()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/ToStringMethod;->TO_STRING:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 2
    .line 3
    return-object v0
.end method

.method public static prefixedBy(Ljava/lang/String;)Lnet/bytebuddy/implementation/ToStringMethod;
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    new-instance v0, Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver$ForFixedValue;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver$ForFixedValue;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lnet/bytebuddy/implementation/ToStringMethod;->prefixedBy(Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver;)Lnet/bytebuddy/implementation/ToStringMethod;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :cond_0
    const-string p0, "Prefix cannot be null"

    .line 14
    .line 15
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    return-object p0
.end method

.method public static prefixedBy(Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver;)Lnet/bytebuddy/implementation/ToStringMethod;
    .locals 1

    .line 20
    new-instance v0, Lnet/bytebuddy/implementation/ToStringMethod;

    invoke-direct {v0, p0}, Lnet/bytebuddy/implementation/ToStringMethod;-><init>(Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver;)V

    return-object v0
.end method

.method public static prefixedByCanonicalClassName()Lnet/bytebuddy/implementation/ToStringMethod;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver$Default;->CANONICAL_CLASS_NAME:Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver$Default;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/implementation/ToStringMethod;->prefixedBy(Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver;)Lnet/bytebuddy/implementation/ToStringMethod;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static prefixedByFullyQualifiedClassName()Lnet/bytebuddy/implementation/ToStringMethod;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver$Default;->FULLY_QUALIFIED_CLASS_NAME:Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver$Default;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/implementation/ToStringMethod;->prefixedBy(Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver;)Lnet/bytebuddy/implementation/ToStringMethod;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static prefixedBySimpleClassName()Lnet/bytebuddy/implementation/ToStringMethod;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver$Default;->SIMPLE_CLASS_NAME:Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver$Default;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/implementation/ToStringMethod;->prefixedBy(Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver;)Lnet/bytebuddy/implementation/ToStringMethod;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method


# virtual methods
.method public appender(Lnet/bytebuddy/implementation/Implementation$Target;)Lnet/bytebuddy/implementation/ToStringMethod$Appender;
    .locals 10

    .line 1
    invoke-interface {p1}, Lnet/bytebuddy/implementation/Implementation$Target;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lnet/bytebuddy/description/ModifierReviewable$ForTypeDefinition;->isInterface()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lnet/bytebuddy/implementation/ToStringMethod;->prefixResolver:Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver;

    .line 13
    .line 14
    invoke-interface {p1}, Lnet/bytebuddy/implementation/Implementation$Target;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-interface {v0, v2}, Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver;->resolve(Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    if-eqz v4, :cond_0

    .line 23
    .line 24
    new-instance v3, Lnet/bytebuddy/implementation/ToStringMethod$Appender;

    .line 25
    .line 26
    iget-object v5, p0, Lnet/bytebuddy/implementation/ToStringMethod;->start:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v6, p0, Lnet/bytebuddy/implementation/ToStringMethod;->end:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v7, p0, Lnet/bytebuddy/implementation/ToStringMethod;->separator:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v8, p0, Lnet/bytebuddy/implementation/ToStringMethod;->definer:Ljava/lang/String;

    .line 33
    .line 34
    invoke-interface {p1}, Lnet/bytebuddy/implementation/Implementation$Target;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredFields()Lnet/bytebuddy/description/field/FieldList;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isStatic()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-object p0, p0, Lnet/bytebuddy/implementation/ToStringMethod;->ignored:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 47
    .line 48
    invoke-interface {v0, p0}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->or(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-static {p0}, Lnet/bytebuddy/matcher/ElementMatchers;->not(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-interface {p1, p0}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 57
    .line 58
    .line 59
    move-result-object v9

    .line 60
    invoke-direct/range {v3 .. v9}, Lnet/bytebuddy/implementation/ToStringMethod$Appender;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 61
    .line 62
    .line 63
    return-object v3

    .line 64
    :cond_0
    const-string p0, "Prefix for toString method cannot be null"

    .line 65
    .line 66
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return-object v1

    .line 70
    :cond_1
    const-string p0, "Cannot implement meaningful toString method for "

    .line 71
    .line 72
    invoke-interface {p1}, Lnet/bytebuddy/implementation/Implementation$Target;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-static {p1, p0}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰哲楪;->飘花落叶言子世楪苏哲兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    return-object v1
.end method

.method public bridge synthetic appender(Lnet/bytebuddy/implementation/Implementation$Target;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;
    .locals 0

    .line 80
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/ToStringMethod;->appender(Lnet/bytebuddy/implementation/Implementation$Target;)Lnet/bytebuddy/implementation/ToStringMethod$Appender;

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/ToStringMethod;->start:Ljava/lang/String;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/ToStringMethod;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/implementation/ToStringMethod;->start:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/ToStringMethod;->end:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v3, p1, Lnet/bytebuddy/implementation/ToStringMethod;->end:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-nez v2, :cond_4

    .line 42
    .line 43
    return v1

    .line 44
    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/implementation/ToStringMethod;->separator:Ljava/lang/String;

    .line 45
    .line 46
    iget-object v3, p1, Lnet/bytebuddy/implementation/ToStringMethod;->separator:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-nez v2, :cond_5

    .line 53
    .line 54
    return v1

    .line 55
    :cond_5
    iget-object v2, p0, Lnet/bytebuddy/implementation/ToStringMethod;->definer:Ljava/lang/String;

    .line 56
    .line 57
    iget-object v3, p1, Lnet/bytebuddy/implementation/ToStringMethod;->definer:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-nez v2, :cond_6

    .line 64
    .line 65
    return v1

    .line 66
    :cond_6
    iget-object v2, p0, Lnet/bytebuddy/implementation/ToStringMethod;->prefixResolver:Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver;

    .line 67
    .line 68
    iget-object v3, p1, Lnet/bytebuddy/implementation/ToStringMethod;->prefixResolver:Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver;

    .line 69
    .line 70
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-nez v2, :cond_7

    .line 75
    .line 76
    return v1

    .line 77
    :cond_7
    iget-object p0, p0, Lnet/bytebuddy/implementation/ToStringMethod;->ignored:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 78
    .line 79
    iget-object p1, p1, Lnet/bytebuddy/implementation/ToStringMethod;->ignored:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 80
    .line 81
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    if-nez p0, :cond_8

    .line 86
    .line 87
    return v1

    .line 88
    :cond_8
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
    iget-object v2, p0, Lnet/bytebuddy/implementation/ToStringMethod;->prefixResolver:Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    add-int/2addr v2, v0

    .line 19
    mul-int/2addr v2, v1

    .line 20
    iget-object v0, p0, Lnet/bytebuddy/implementation/ToStringMethod;->start:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {v2, v1, v0}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-object v2, p0, Lnet/bytebuddy/implementation/ToStringMethod;->end:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v0, v1, v2}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-object v2, p0, Lnet/bytebuddy/implementation/ToStringMethod;->separator:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v0, v1, v2}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget-object v2, p0, Lnet/bytebuddy/implementation/ToStringMethod;->definer:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {v0, v1, v2}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-object p0, p0, Lnet/bytebuddy/implementation/ToStringMethod;->ignored:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    add-int/2addr p0, v0

    .line 51
    return p0
.end method

.method public prepare(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;
    .locals 0

    .line 1
    return-object p1
.end method

.method public withIgnoredFields(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/implementation/ToStringMethod;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;)",
            "Lnet/bytebuddy/implementation/ToStringMethod;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/ToStringMethod;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/implementation/ToStringMethod;->prefixResolver:Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/implementation/ToStringMethod;->start:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/implementation/ToStringMethod;->end:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lnet/bytebuddy/implementation/ToStringMethod;->separator:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v5, p0, Lnet/bytebuddy/implementation/ToStringMethod;->definer:Ljava/lang/String;

    .line 12
    .line 13
    iget-object p0, p0, Lnet/bytebuddy/implementation/ToStringMethod;->ignored:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 14
    .line 15
    invoke-interface {p0, p1}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->or(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 16
    .line 17
    .line 18
    move-result-object v6

    .line 19
    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/implementation/ToStringMethod;-><init>(Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnet/bytebuddy/matcher/ElementMatcher$Junction;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public withTokens(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/bytebuddy/implementation/Implementation;
    .locals 7

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    if-eqz p4, :cond_0

    .line 8
    .line 9
    new-instance v0, Lnet/bytebuddy/implementation/ToStringMethod;

    .line 10
    .line 11
    iget-object v1, p0, Lnet/bytebuddy/implementation/ToStringMethod;->prefixResolver:Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver;

    .line 12
    .line 13
    iget-object v6, p0, Lnet/bytebuddy/implementation/ToStringMethod;->ignored:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 14
    .line 15
    move-object v2, p1

    .line 16
    move-object v3, p2

    .line 17
    move-object v4, p3

    .line 18
    move-object v5, p4

    .line 19
    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/implementation/ToStringMethod;-><init>(Lnet/bytebuddy/implementation/ToStringMethod$PrefixResolver;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnet/bytebuddy/matcher/ElementMatcher$Junction;)V

    .line 20
    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_0
    const-string p0, "Token values cannot be null"

    .line 24
    .line 25
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return-object p0
.end method
