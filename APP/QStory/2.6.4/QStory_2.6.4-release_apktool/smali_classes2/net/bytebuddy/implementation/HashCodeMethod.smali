.class public Lnet/bytebuddy/implementation/HashCodeMethod;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/implementation/Implementation;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/HashCodeMethod$Appender;,
        Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;,
        Lnet/bytebuddy/implementation/HashCodeMethod$NullValueGuard;,
        Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final DEFAULT_MULTIPLIER:I = 0x1f

.field private static final DEFAULT_OFFSET:I = 0x11

.field private static final GET_CLASS:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field private static final HASH_CODE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;


# instance fields
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

.field private final multiplier:I

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

.field private final offsetProvider:Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-class v0, Ljava/lang/Object;

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
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isHashCode()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {v1, v2}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lnet/bytebuddy/description/method/MethodList;

    .line 20
    .line 21
    invoke-interface {v1}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 26
    .line 27
    sput-object v1, Lnet/bytebuddy/implementation/HashCodeMethod;->HASH_CODE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 28
    .line 29
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-string v1, "getClass"

    .line 38
    .line 39
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const/4 v2, 0x0

    .line 44
    invoke-static {v2}, Lnet/bytebuddy/matcher/ElementMatchers;->takesArguments(I)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-interface {v1, v2}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Lnet/bytebuddy/description/method/MethodList;

    .line 57
    .line 58
    invoke-interface {v0}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 63
    .line 64
    sput-object v0, Lnet/bytebuddy/implementation/HashCodeMethod;->GET_CLASS:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 65
    .line 66
    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider;)V
    .locals 6

    .line 1
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->none()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 2
    .line 3
    .line 4
    move-result-object v3

    .line 5
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->none()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 6
    .line 7
    .line 8
    move-result-object v4

    .line 9
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->none()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 10
    .line 11
    .line 12
    move-result-object v5

    .line 13
    const/16 v2, 0x1f

    .line 14
    .line 15
    move-object v0, p0

    .line 16
    move-object v1, p1

    .line 17
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/implementation/HashCodeMethod;-><init>(Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider;ILnet/bytebuddy/matcher/ElementMatcher$Junction;Lnet/bytebuddy/matcher/ElementMatcher$Junction;Lnet/bytebuddy/matcher/ElementMatcher$Junction;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private constructor <init>(Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider;ILnet/bytebuddy/matcher/ElementMatcher$Junction;Lnet/bytebuddy/matcher/ElementMatcher$Junction;Lnet/bytebuddy/matcher/ElementMatcher$Junction;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider;",
            "I",
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
            ">;)V"
        }
    .end annotation

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lnet/bytebuddy/implementation/HashCodeMethod;->offsetProvider:Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider;

    .line 23
    iput p2, p0, Lnet/bytebuddy/implementation/HashCodeMethod;->multiplier:I

    .line 24
    iput-object p3, p0, Lnet/bytebuddy/implementation/HashCodeMethod;->ignored:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 25
    iput-object p4, p0, Lnet/bytebuddy/implementation/HashCodeMethod;->nonNullable:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 26
    iput-object p5, p0, Lnet/bytebuddy/implementation/HashCodeMethod;->identity:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    return-void
.end method

.method public static synthetic access$000()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/HashCodeMethod;->HASH_CODE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$100()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/HashCodeMethod;->GET_CLASS:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 2
    .line 3
    return-object v0
.end method

.method public static usingDefaultOffset()Lnet/bytebuddy/implementation/HashCodeMethod;
    .locals 1

    .line 1
    const/16 v0, 0x11

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/implementation/HashCodeMethod;->usingOffset(I)Lnet/bytebuddy/implementation/HashCodeMethod;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static usingOffset(I)Lnet/bytebuddy/implementation/HashCodeMethod;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/HashCodeMethod;

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider$ForFixedValue;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider$ForFixedValue;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Lnet/bytebuddy/implementation/HashCodeMethod;-><init>(Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static usingSuperClassOffset()Lnet/bytebuddy/implementation/HashCodeMethod;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/HashCodeMethod;

    .line 2
    .line 3
    sget-object v1, Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider$ForSuperMethodCall;->INSTANCE:Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider$ForSuperMethodCall;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lnet/bytebuddy/implementation/HashCodeMethod;-><init>(Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static usingTypeHashOffset(Z)Lnet/bytebuddy/implementation/HashCodeMethod;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/HashCodeMethod;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    sget-object p0, Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider$ForDynamicTypeHash;->INSTANCE:Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider$ForDynamicTypeHash;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object p0, Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider$ForStaticTypeHash;->INSTANCE:Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider$ForStaticTypeHash;

    .line 9
    .line 10
    :goto_0
    invoke-direct {v0, p0}, Lnet/bytebuddy/implementation/HashCodeMethod;-><init>(Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method


# virtual methods
.method public appender(Lnet/bytebuddy/implementation/Implementation$Target;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;
    .locals 7

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
    new-instance v1, Lnet/bytebuddy/implementation/HashCodeMethod$Appender;

    .line 12
    .line 13
    iget-object v0, p0, Lnet/bytebuddy/implementation/HashCodeMethod;->offsetProvider:Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider;

    .line 14
    .line 15
    invoke-interface {p1}, Lnet/bytebuddy/implementation/Implementation$Target;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-interface {v0, v2}, Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider;->resolve(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget v3, p0, Lnet/bytebuddy/implementation/HashCodeMethod;->multiplier:I

    .line 24
    .line 25
    invoke-interface {p1}, Lnet/bytebuddy/implementation/Implementation$Target;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredFields()Lnet/bytebuddy/description/field/FieldList;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isStatic()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-object v4, p0, Lnet/bytebuddy/implementation/HashCodeMethod;->ignored:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 38
    .line 39
    invoke-interface {v0, v4}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->or(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->not(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-interface {p1, v0}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    iget-object v5, p0, Lnet/bytebuddy/implementation/HashCodeMethod;->nonNullable:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 52
    .line 53
    iget-object v6, p0, Lnet/bytebuddy/implementation/HashCodeMethod;->identity:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 54
    .line 55
    invoke-direct/range {v1 .. v6}, Lnet/bytebuddy/implementation/HashCodeMethod$Appender;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;ILjava/util/List;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 56
    .line 57
    .line 58
    return-object v1

    .line 59
    :cond_0
    const-string p0, "Cannot implement meaningful hash code method for "

    .line 60
    .line 61
    invoke-interface {p1}, Lnet/bytebuddy/implementation/Implementation$Target;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-static {p1, p0}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰哲楪;->飘花落叶言子世楪苏哲兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const/4 p0, 0x0

    .line 69
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
    iget v2, p0, Lnet/bytebuddy/implementation/HashCodeMethod;->multiplier:I

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/HashCodeMethod;

    .line 23
    .line 24
    iget v3, p1, Lnet/bytebuddy/implementation/HashCodeMethod;->multiplier:I

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/implementation/HashCodeMethod;->offsetProvider:Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider;

    .line 30
    .line 31
    iget-object v3, p1, Lnet/bytebuddy/implementation/HashCodeMethod;->offsetProvider:Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider;

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_4

    .line 38
    .line 39
    return v1

    .line 40
    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/implementation/HashCodeMethod;->ignored:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 41
    .line 42
    iget-object v3, p1, Lnet/bytebuddy/implementation/HashCodeMethod;->ignored:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-nez v2, :cond_5

    .line 49
    .line 50
    return v1

    .line 51
    :cond_5
    iget-object v2, p0, Lnet/bytebuddy/implementation/HashCodeMethod;->nonNullable:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 52
    .line 53
    iget-object v3, p1, Lnet/bytebuddy/implementation/HashCodeMethod;->nonNullable:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 54
    .line 55
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-nez v2, :cond_6

    .line 60
    .line 61
    return v1

    .line 62
    :cond_6
    iget-object p0, p0, Lnet/bytebuddy/implementation/HashCodeMethod;->identity:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 63
    .line 64
    iget-object p1, p1, Lnet/bytebuddy/implementation/HashCodeMethod;->identity:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 65
    .line 66
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    if-nez p0, :cond_7

    .line 71
    .line 72
    return v1

    .line 73
    :cond_7
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
    iget-object v1, p0, Lnet/bytebuddy/implementation/HashCodeMethod;->offsetProvider:Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider;

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
    iget v0, p0, Lnet/bytebuddy/implementation/HashCodeMethod;->multiplier:I

    .line 21
    .line 22
    add-int/2addr v1, v0

    .line 23
    mul-int/lit8 v1, v1, 0x1f

    .line 24
    .line 25
    iget-object v0, p0, Lnet/bytebuddy/implementation/HashCodeMethod;->ignored:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    add-int/2addr v0, v1

    .line 32
    mul-int/lit8 v0, v0, 0x1f

    .line 33
    .line 34
    iget-object v1, p0, Lnet/bytebuddy/implementation/HashCodeMethod;->nonNullable:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    add-int/2addr v1, v0

    .line 41
    mul-int/lit8 v1, v1, 0x1f

    .line 42
    .line 43
    iget-object p0, p0, Lnet/bytebuddy/implementation/HashCodeMethod;->identity:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    add-int/2addr p0, v1

    .line 50
    return p0
.end method

.method public prepare(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;
    .locals 0

    .line 1
    return-object p1
.end method

.method public withIdentityFields(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/implementation/HashCodeMethod;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;)",
            "Lnet/bytebuddy/implementation/HashCodeMethod;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/HashCodeMethod;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/implementation/HashCodeMethod;->offsetProvider:Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider;

    .line 4
    .line 5
    iget v2, p0, Lnet/bytebuddy/implementation/HashCodeMethod;->multiplier:I

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/implementation/HashCodeMethod;->ignored:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 8
    .line 9
    iget-object v4, p0, Lnet/bytebuddy/implementation/HashCodeMethod;->nonNullable:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 10
    .line 11
    iget-object p0, p0, Lnet/bytebuddy/implementation/HashCodeMethod;->identity:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 12
    .line 13
    invoke-interface {p0, p1}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->or(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/implementation/HashCodeMethod;-><init>(Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider;ILnet/bytebuddy/matcher/ElementMatcher$Junction;Lnet/bytebuddy/matcher/ElementMatcher$Junction;Lnet/bytebuddy/matcher/ElementMatcher$Junction;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public withIgnoredFields(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/implementation/HashCodeMethod;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;)",
            "Lnet/bytebuddy/implementation/HashCodeMethod;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/HashCodeMethod;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/implementation/HashCodeMethod;->offsetProvider:Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider;

    .line 4
    .line 5
    iget v2, p0, Lnet/bytebuddy/implementation/HashCodeMethod;->multiplier:I

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/implementation/HashCodeMethod;->ignored:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 8
    .line 9
    invoke-interface {v3, p1}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->or(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    iget-object v4, p0, Lnet/bytebuddy/implementation/HashCodeMethod;->nonNullable:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 14
    .line 15
    iget-object v5, p0, Lnet/bytebuddy/implementation/HashCodeMethod;->identity:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 16
    .line 17
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/implementation/HashCodeMethod;-><init>(Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider;ILnet/bytebuddy/matcher/ElementMatcher$Junction;Lnet/bytebuddy/matcher/ElementMatcher$Junction;Lnet/bytebuddy/matcher/ElementMatcher$Junction;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public withMultiplier(I)Lnet/bytebuddy/implementation/HashCodeMethod;
    .locals 6

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance v0, Lnet/bytebuddy/implementation/HashCodeMethod;

    .line 4
    .line 5
    iget-object v1, p0, Lnet/bytebuddy/implementation/HashCodeMethod;->offsetProvider:Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider;

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/implementation/HashCodeMethod;->ignored:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 8
    .line 9
    iget-object v4, p0, Lnet/bytebuddy/implementation/HashCodeMethod;->nonNullable:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 10
    .line 11
    iget-object v5, p0, Lnet/bytebuddy/implementation/HashCodeMethod;->identity:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 12
    .line 13
    move v2, p1

    .line 14
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/implementation/HashCodeMethod;-><init>(Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider;ILnet/bytebuddy/matcher/ElementMatcher$Junction;Lnet/bytebuddy/matcher/ElementMatcher$Junction;Lnet/bytebuddy/matcher/ElementMatcher$Junction;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    const-string p0, "Hash code multiplier must not be zero"

    .line 19
    .line 20
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return-object p0
.end method

.method public withNonNullableFields(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/implementation/HashCodeMethod;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;)",
            "Lnet/bytebuddy/implementation/HashCodeMethod;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/HashCodeMethod;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/implementation/HashCodeMethod;->offsetProvider:Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider;

    .line 4
    .line 5
    iget v2, p0, Lnet/bytebuddy/implementation/HashCodeMethod;->multiplier:I

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/implementation/HashCodeMethod;->ignored:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 8
    .line 9
    iget-object v4, p0, Lnet/bytebuddy/implementation/HashCodeMethod;->nonNullable:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 10
    .line 11
    invoke-interface {v4, p1}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->or(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    iget-object v5, p0, Lnet/bytebuddy/implementation/HashCodeMethod;->identity:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 16
    .line 17
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/implementation/HashCodeMethod;-><init>(Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider;ILnet/bytebuddy/matcher/ElementMatcher$Junction;Lnet/bytebuddy/matcher/ElementMatcher$Junction;Lnet/bytebuddy/matcher/ElementMatcher$Junction;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method
