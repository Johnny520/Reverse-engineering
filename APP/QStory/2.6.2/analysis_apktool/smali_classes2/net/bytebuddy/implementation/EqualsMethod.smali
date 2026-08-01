.class public Lnet/bytebuddy/implementation/EqualsMethod;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/implementation/Implementation;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/EqualsMethod$CompoundComparator;,
        Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator;,
        Lnet/bytebuddy/implementation/EqualsMethod$NaturalOrderComparator;,
        Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;,
        Lnet/bytebuddy/implementation/EqualsMethod$Appender;,
        Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;,
        Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard;,
        Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;,
        Lnet/bytebuddy/implementation/EqualsMethod$SuperClassCheck;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final EQUALS:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;


# instance fields
.field private final comparator:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "-",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;"
        }
    .end annotation
.end field

.field private final identity:Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "-",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;"
        }
    .end annotation
.end field

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

.field private final nonNullable:Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "-",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;"
        }
    .end annotation
.end field

.field private final superClassCheck:Lnet/bytebuddy/implementation/EqualsMethod$SuperClassCheck;

.field private final typeCompatibilityCheck:Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Ljava/lang/Object;

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
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isEquals()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lnet/bytebuddy/description/method/MethodList;

    .line 20
    .line 21
    invoke-interface {v0}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 26
    .line 27
    sput-object v0, Lnet/bytebuddy/implementation/EqualsMethod;->EQUALS:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/implementation/EqualsMethod$SuperClassCheck;)V
    .locals 7

    .line 1
    sget-object v2, Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;->EXACT:Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;

    .line 2
    .line 3
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->none()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->none()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->none()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    sget-object v6, Lnet/bytebuddy/implementation/EqualsMethod$NaturalOrderComparator;->INSTANCE:Lnet/bytebuddy/implementation/EqualsMethod$NaturalOrderComparator;

    .line 16
    .line 17
    move-object v0, p0

    .line 18
    move-object v1, p1

    .line 19
    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/implementation/EqualsMethod;-><init>(Lnet/bytebuddy/implementation/EqualsMethod$SuperClassCheck;Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;Lnet/bytebuddy/matcher/ElementMatcher$Junction;Lnet/bytebuddy/matcher/ElementMatcher$Junction;Lnet/bytebuddy/matcher/ElementMatcher$Junction;Ljava/util/Comparator;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method private constructor <init>(Lnet/bytebuddy/implementation/EqualsMethod$SuperClassCheck;Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;Lnet/bytebuddy/matcher/ElementMatcher$Junction;Lnet/bytebuddy/matcher/ElementMatcher$Junction;Lnet/bytebuddy/matcher/ElementMatcher$Junction;Ljava/util/Comparator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/implementation/EqualsMethod$SuperClassCheck;",
            "Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "-",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "-",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "-",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;",
            "Ljava/util/Comparator<",
            "-",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;)V"
        }
    .end annotation

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lnet/bytebuddy/implementation/EqualsMethod;->superClassCheck:Lnet/bytebuddy/implementation/EqualsMethod$SuperClassCheck;

    .line 25
    iput-object p2, p0, Lnet/bytebuddy/implementation/EqualsMethod;->typeCompatibilityCheck:Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;

    .line 26
    iput-object p3, p0, Lnet/bytebuddy/implementation/EqualsMethod;->ignored:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 27
    iput-object p4, p0, Lnet/bytebuddy/implementation/EqualsMethod;->nonNullable:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 28
    iput-object p5, p0, Lnet/bytebuddy/implementation/EqualsMethod;->identity:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 29
    iput-object p6, p0, Lnet/bytebuddy/implementation/EqualsMethod;->comparator:Ljava/util/Comparator;

    return-void
.end method

.method public static synthetic access$100()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/EqualsMethod;->EQUALS:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 2
    .line 3
    return-object v0
.end method

.method public static isolated()Lnet/bytebuddy/implementation/EqualsMethod;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/EqualsMethod;

    .line 2
    .line 3
    sget-object v1, Lnet/bytebuddy/implementation/EqualsMethod$SuperClassCheck;->DISABLED:Lnet/bytebuddy/implementation/EqualsMethod$SuperClassCheck;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lnet/bytebuddy/implementation/EqualsMethod;-><init>(Lnet/bytebuddy/implementation/EqualsMethod$SuperClassCheck;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static requiringSuperClassEquality()Lnet/bytebuddy/implementation/EqualsMethod;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/EqualsMethod;

    .line 2
    .line 3
    sget-object v1, Lnet/bytebuddy/implementation/EqualsMethod$SuperClassCheck;->ENABLED:Lnet/bytebuddy/implementation/EqualsMethod$SuperClassCheck;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lnet/bytebuddy/implementation/EqualsMethod;-><init>(Lnet/bytebuddy/implementation/EqualsMethod$SuperClassCheck;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method


# virtual methods
.method public appender(Lnet/bytebuddy/implementation/Implementation$Target;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;
    .locals 11

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
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v4, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-interface {p1}, Lnet/bytebuddy/implementation/Implementation$Target;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredFields()Lnet/bytebuddy/description/field/FieldList;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isStatic()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object v2, p0, Lnet/bytebuddy/implementation/EqualsMethod;->ignored:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 26
    .line 27
    invoke-interface {v1, v2}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->or(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

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
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lnet/bytebuddy/implementation/EqualsMethod;->comparator:Ljava/util/Comparator;

    .line 43
    .line 44
    invoke-static {v4, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 45
    .line 46
    .line 47
    new-instance v1, Lnet/bytebuddy/implementation/EqualsMethod$Appender;

    .line 48
    .line 49
    invoke-interface {p1}, Lnet/bytebuddy/implementation/Implementation$Target;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    new-instance v3, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 54
    .line 55
    iget-object v0, p0, Lnet/bytebuddy/implementation/EqualsMethod;->superClassCheck:Lnet/bytebuddy/implementation/EqualsMethod$SuperClassCheck;

    .line 56
    .line 57
    invoke-interface {p1}, Lnet/bytebuddy/implementation/Implementation$Target;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    invoke-virtual {v0, v5}, Lnet/bytebuddy/implementation/EqualsMethod$SuperClassCheck;->resolve(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadThis()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    sget-object v6, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->REFERENCE:Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 70
    .line 71
    const/4 v7, 0x1

    .line 72
    invoke-virtual {v6, v7}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadFrom(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    invoke-static {}, Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;->onIdentity()Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    invoke-virtual {v8}, Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;->returningTrue()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    iget-object v9, p0, Lnet/bytebuddy/implementation/EqualsMethod;->typeCompatibilityCheck:Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;

    .line 85
    .line 86
    invoke-interface {p1}, Lnet/bytebuddy/implementation/Implementation$Target;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {v9, p1}, Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;->resolve(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    const/4 v9, 0x5

    .line 95
    new-array v9, v9, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 96
    .line 97
    const/4 v10, 0x0

    .line 98
    aput-object v0, v9, v10

    .line 99
    .line 100
    aput-object v5, v9, v7

    .line 101
    .line 102
    const/4 v0, 0x2

    .line 103
    aput-object v6, v9, v0

    .line 104
    .line 105
    const/4 v0, 0x3

    .line 106
    aput-object v8, v9, v0

    .line 107
    .line 108
    const/4 v0, 0x4

    .line 109
    aput-object p1, v9, v0

    .line 110
    .line 111
    invoke-direct {v3, v9}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 112
    .line 113
    .line 114
    iget-object v5, p0, Lnet/bytebuddy/implementation/EqualsMethod;->nonNullable:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 115
    .line 116
    iget-object v6, p0, Lnet/bytebuddy/implementation/EqualsMethod;->identity:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 117
    .line 118
    invoke-direct/range {v1 .. v6}, Lnet/bytebuddy/implementation/EqualsMethod$Appender;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Ljava/util/List;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 119
    .line 120
    .line 121
    return-object v1

    .line 122
    :cond_0
    const-string p0, "Cannot implement meaningful equals method for "

    .line 123
    .line 124
    invoke-interface {p1}, Lnet/bytebuddy/implementation/Implementation$Target;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-static {p1, p0}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    const/4 p0, 0x0

    .line 132
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
    iget-object v2, p0, Lnet/bytebuddy/implementation/EqualsMethod;->superClassCheck:Lnet/bytebuddy/implementation/EqualsMethod$SuperClassCheck;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/EqualsMethod;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/implementation/EqualsMethod;->superClassCheck:Lnet/bytebuddy/implementation/EqualsMethod$SuperClassCheck;

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/EqualsMethod;->typeCompatibilityCheck:Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;

    .line 34
    .line 35
    iget-object v3, p1, Lnet/bytebuddy/implementation/EqualsMethod;->typeCompatibilityCheck:Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/EqualsMethod;->ignored:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 45
    .line 46
    iget-object v3, p1, Lnet/bytebuddy/implementation/EqualsMethod;->ignored:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 47
    .line 48
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/EqualsMethod;->nonNullable:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 56
    .line 57
    iget-object v3, p1, Lnet/bytebuddy/implementation/EqualsMethod;->nonNullable:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 58
    .line 59
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/EqualsMethod;->identity:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 67
    .line 68
    iget-object v3, p1, Lnet/bytebuddy/implementation/EqualsMethod;->identity:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

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
    iget-object p0, p0, Lnet/bytebuddy/implementation/EqualsMethod;->comparator:Ljava/util/Comparator;

    .line 78
    .line 79
    iget-object p1, p1, Lnet/bytebuddy/implementation/EqualsMethod;->comparator:Ljava/util/Comparator;

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
    .locals 2

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
    iget-object v1, p0, Lnet/bytebuddy/implementation/EqualsMethod;->superClassCheck:Lnet/bytebuddy/implementation/EqualsMethod$SuperClassCheck;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/2addr v1, v0

    .line 18
    mul-int/lit8 v1, v1, 0x1f

    .line 19
    .line 20
    iget-object v0, p0, Lnet/bytebuddy/implementation/EqualsMethod;->typeCompatibilityCheck:Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    add-int/2addr v0, v1

    .line 27
    mul-int/lit8 v0, v0, 0x1f

    .line 28
    .line 29
    iget-object v1, p0, Lnet/bytebuddy/implementation/EqualsMethod;->ignored:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    add-int/2addr v1, v0

    .line 36
    mul-int/lit8 v1, v1, 0x1f

    .line 37
    .line 38
    iget-object v0, p0, Lnet/bytebuddy/implementation/EqualsMethod;->nonNullable:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    add-int/2addr v0, v1

    .line 45
    mul-int/lit8 v0, v0, 0x1f

    .line 46
    .line 47
    iget-object v1, p0, Lnet/bytebuddy/implementation/EqualsMethod;->identity:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    add-int/2addr v1, v0

    .line 54
    mul-int/lit8 v1, v1, 0x1f

    .line 55
    .line 56
    iget-object p0, p0, Lnet/bytebuddy/implementation/EqualsMethod;->comparator:Ljava/util/Comparator;

    .line 57
    .line 58
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    add-int/2addr p0, v1

    .line 63
    return p0
.end method

.method public prepare(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;
    .locals 0

    .line 1
    return-object p1
.end method

.method public withEnumerationTypedFieldsFirst()Lnet/bytebuddy/implementation/EqualsMethod;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator;->FOR_ENUMERATION_TYPES:Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lnet/bytebuddy/implementation/EqualsMethod;->withFieldOrder(Ljava/util/Comparator;)Lnet/bytebuddy/implementation/EqualsMethod;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public withFieldOrder(Ljava/util/Comparator;)Lnet/bytebuddy/implementation/EqualsMethod;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Comparator<",
            "-",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;)",
            "Lnet/bytebuddy/implementation/EqualsMethod;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/EqualsMethod;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/implementation/EqualsMethod;->superClassCheck:Lnet/bytebuddy/implementation/EqualsMethod$SuperClassCheck;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/implementation/EqualsMethod;->typeCompatibilityCheck:Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/implementation/EqualsMethod;->ignored:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 8
    .line 9
    iget-object v4, p0, Lnet/bytebuddy/implementation/EqualsMethod;->nonNullable:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 10
    .line 11
    iget-object v5, p0, Lnet/bytebuddy/implementation/EqualsMethod;->identity:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 12
    .line 13
    new-instance v6, Lnet/bytebuddy/implementation/EqualsMethod$CompoundComparator;

    .line 14
    .line 15
    iget-object p0, p0, Lnet/bytebuddy/implementation/EqualsMethod;->comparator:Ljava/util/Comparator;

    .line 16
    .line 17
    const/4 v7, 0x2

    .line 18
    new-array v7, v7, [Ljava/util/Comparator;

    .line 19
    .line 20
    const/4 v8, 0x0

    .line 21
    aput-object p0, v7, v8

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    aput-object p1, v7, p0

    .line 25
    .line 26
    invoke-direct {v6, v7}, Lnet/bytebuddy/implementation/EqualsMethod$CompoundComparator;-><init>([Ljava/util/Comparator;)V

    .line 27
    .line 28
    .line 29
    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/implementation/EqualsMethod;-><init>(Lnet/bytebuddy/implementation/EqualsMethod$SuperClassCheck;Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;Lnet/bytebuddy/matcher/ElementMatcher$Junction;Lnet/bytebuddy/matcher/ElementMatcher$Junction;Lnet/bytebuddy/matcher/ElementMatcher$Junction;Ljava/util/Comparator;)V

    .line 30
    .line 31
    .line 32
    return-object v0
.end method

.method public withIdentityFields(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/implementation/EqualsMethod;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;)",
            "Lnet/bytebuddy/implementation/EqualsMethod;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/EqualsMethod;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/implementation/EqualsMethod;->superClassCheck:Lnet/bytebuddy/implementation/EqualsMethod$SuperClassCheck;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/implementation/EqualsMethod;->typeCompatibilityCheck:Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/implementation/EqualsMethod;->ignored:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 8
    .line 9
    iget-object v4, p0, Lnet/bytebuddy/implementation/EqualsMethod;->nonNullable:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 10
    .line 11
    iget-object v5, p0, Lnet/bytebuddy/implementation/EqualsMethod;->identity:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 12
    .line 13
    invoke-interface {v5, p1}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->or(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    iget-object v6, p0, Lnet/bytebuddy/implementation/EqualsMethod;->comparator:Ljava/util/Comparator;

    .line 18
    .line 19
    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/implementation/EqualsMethod;-><init>(Lnet/bytebuddy/implementation/EqualsMethod$SuperClassCheck;Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;Lnet/bytebuddy/matcher/ElementMatcher$Junction;Lnet/bytebuddy/matcher/ElementMatcher$Junction;Lnet/bytebuddy/matcher/ElementMatcher$Junction;Ljava/util/Comparator;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public withIgnoredFields(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/implementation/EqualsMethod;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;)",
            "Lnet/bytebuddy/implementation/EqualsMethod;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/EqualsMethod;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/implementation/EqualsMethod;->superClassCheck:Lnet/bytebuddy/implementation/EqualsMethod$SuperClassCheck;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/implementation/EqualsMethod;->typeCompatibilityCheck:Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/implementation/EqualsMethod;->ignored:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 8
    .line 9
    invoke-interface {v3, p1}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->or(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    iget-object v4, p0, Lnet/bytebuddy/implementation/EqualsMethod;->nonNullable:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 14
    .line 15
    iget-object v5, p0, Lnet/bytebuddy/implementation/EqualsMethod;->identity:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 16
    .line 17
    iget-object v6, p0, Lnet/bytebuddy/implementation/EqualsMethod;->comparator:Ljava/util/Comparator;

    .line 18
    .line 19
    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/implementation/EqualsMethod;-><init>(Lnet/bytebuddy/implementation/EqualsMethod$SuperClassCheck;Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;Lnet/bytebuddy/matcher/ElementMatcher$Junction;Lnet/bytebuddy/matcher/ElementMatcher$Junction;Lnet/bytebuddy/matcher/ElementMatcher$Junction;Ljava/util/Comparator;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public withNonNullableFields(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/implementation/EqualsMethod;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;)",
            "Lnet/bytebuddy/implementation/EqualsMethod;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/EqualsMethod;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/implementation/EqualsMethod;->superClassCheck:Lnet/bytebuddy/implementation/EqualsMethod$SuperClassCheck;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/implementation/EqualsMethod;->typeCompatibilityCheck:Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/implementation/EqualsMethod;->ignored:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 8
    .line 9
    iget-object v4, p0, Lnet/bytebuddy/implementation/EqualsMethod;->nonNullable:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 10
    .line 11
    invoke-interface {v4, p1}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->or(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    iget-object v5, p0, Lnet/bytebuddy/implementation/EqualsMethod;->identity:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 16
    .line 17
    iget-object v6, p0, Lnet/bytebuddy/implementation/EqualsMethod;->comparator:Ljava/util/Comparator;

    .line 18
    .line 19
    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/implementation/EqualsMethod;-><init>(Lnet/bytebuddy/implementation/EqualsMethod$SuperClassCheck;Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;Lnet/bytebuddy/matcher/ElementMatcher$Junction;Lnet/bytebuddy/matcher/ElementMatcher$Junction;Lnet/bytebuddy/matcher/ElementMatcher$Junction;Ljava/util/Comparator;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public withPrimitiveTypedFieldsFirst()Lnet/bytebuddy/implementation/EqualsMethod;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator;->FOR_PRIMITIVE_TYPES:Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lnet/bytebuddy/implementation/EqualsMethod;->withFieldOrder(Ljava/util/Comparator;)Lnet/bytebuddy/implementation/EqualsMethod;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public withPrimitiveWrapperTypedFieldsFirst()Lnet/bytebuddy/implementation/EqualsMethod;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator;->FOR_PRIMITIVE_WRAPPER_TYPES:Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lnet/bytebuddy/implementation/EqualsMethod;->withFieldOrder(Ljava/util/Comparator;)Lnet/bytebuddy/implementation/EqualsMethod;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public withStringTypedFieldsFirst()Lnet/bytebuddy/implementation/EqualsMethod;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator;->FOR_STRING_TYPES:Lnet/bytebuddy/implementation/EqualsMethod$TypePropertyComparator;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lnet/bytebuddy/implementation/EqualsMethod;->withFieldOrder(Ljava/util/Comparator;)Lnet/bytebuddy/implementation/EqualsMethod;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public withSubclassEquality()Lnet/bytebuddy/implementation/EqualsMethod;
    .locals 7

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/EqualsMethod;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/implementation/EqualsMethod;->superClassCheck:Lnet/bytebuddy/implementation/EqualsMethod$SuperClassCheck;

    .line 4
    .line 5
    sget-object v2, Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;->SUBCLASS:Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/implementation/EqualsMethod;->ignored:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 8
    .line 9
    iget-object v4, p0, Lnet/bytebuddy/implementation/EqualsMethod;->nonNullable:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 10
    .line 11
    iget-object v5, p0, Lnet/bytebuddy/implementation/EqualsMethod;->identity:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 12
    .line 13
    iget-object v6, p0, Lnet/bytebuddy/implementation/EqualsMethod;->comparator:Ljava/util/Comparator;

    .line 14
    .line 15
    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/implementation/EqualsMethod;-><init>(Lnet/bytebuddy/implementation/EqualsMethod$SuperClassCheck;Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;Lnet/bytebuddy/matcher/ElementMatcher$Junction;Lnet/bytebuddy/matcher/ElementMatcher$Junction;Lnet/bytebuddy/matcher/ElementMatcher$Junction;Ljava/util/Comparator;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method
