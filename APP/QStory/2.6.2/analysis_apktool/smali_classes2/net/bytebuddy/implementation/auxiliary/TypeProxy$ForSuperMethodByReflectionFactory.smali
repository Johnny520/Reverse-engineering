.class public Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByReflectionFactory;
.super Lnet/bytebuddy/implementation/bytecode/StackManipulation$AbstractBase;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/auxiliary/TypeProxy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForSuperMethodByReflectionFactory"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final ignoreFinalizer:Z

.field private final implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

.field private final proxiedType:Lnet/bytebuddy/description/type/TypeDescription;

.field private final serializableProxy:Z


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/implementation/Implementation$Target;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$AbstractBase;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByReflectionFactory;->proxiedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByReflectionFactory;->implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

    .line 7
    .line 8
    iput-boolean p3, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByReflectionFactory;->ignoreFinalizer:Z

    .line 9
    .line 10
    iput-boolean p4, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByReflectionFactory;->serializableProxy:Z

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;
    .locals 6

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByReflectionFactory;->proxiedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByReflectionFactory;->implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

    .line 6
    .line 7
    sget-object v3, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$InvocationFactory$Default;->SUPER_METHOD:Lnet/bytebuddy/implementation/auxiliary/TypeProxy$InvocationFactory$Default;

    .line 8
    .line 9
    iget-boolean v4, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByReflectionFactory;->ignoreFinalizer:Z

    .line 10
    .line 11
    iget-boolean v5, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByReflectionFactory;->serializableProxy:Z

    .line 12
    .line 13
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/implementation/auxiliary/TypeProxy;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/implementation/Implementation$Target;Lnet/bytebuddy/implementation/auxiliary/TypeProxy$InvocationFactory;ZZ)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p2, v0}, Lnet/bytebuddy/implementation/Implementation$Context;->register(Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 21
    .line 22
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-string v2, "make"

    .line 27
    .line 28
    invoke-static {v2}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    const/4 v3, 0x0

    .line 33
    invoke-static {v3}, Lnet/bytebuddy/matcher/ElementMatchers;->takesArguments(I)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-interface {v2, v4}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-interface {v1, v2}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Lnet/bytebuddy/description/method/MethodList;

    .line 46
    .line 47
    invoke-interface {v1}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 52
    .line 53
    invoke-static {v1}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-static {}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadThis()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredFields()Lnet/bytebuddy/description/field/FieldList;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    const-string v4, "target"

    .line 66
    .line 67
    invoke-static {v4}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-interface {p0, v4}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    check-cast p0, Lnet/bytebuddy/description/field/FieldList;

    .line 76
    .line 77
    invoke-interface {p0}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    check-cast p0, Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    .line 82
    .line 83
    invoke-static {p0}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->forField(Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-interface {p0}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;->write()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    const/4 v4, 0x4

    .line 92
    new-array v4, v4, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 93
    .line 94
    aput-object v1, v4, v3

    .line 95
    .line 96
    sget-object v1, Lnet/bytebuddy/implementation/bytecode/Duplication;->SINGLE:Lnet/bytebuddy/implementation/bytecode/Duplication;

    .line 97
    .line 98
    const/4 v3, 0x1

    .line 99
    aput-object v1, v4, v3

    .line 100
    .line 101
    const/4 v1, 0x2

    .line 102
    aput-object v2, v4, v1

    .line 103
    .line 104
    const/4 v1, 0x3

    .line 105
    aput-object p0, v4, v1

    .line 106
    .line 107
    invoke-direct {v0, v4}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, p1, p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
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
    iget-boolean v2, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByReflectionFactory;->ignoreFinalizer:Z

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByReflectionFactory;

    .line 23
    .line 24
    iget-boolean v3, p1, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByReflectionFactory;->ignoreFinalizer:Z

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget-boolean v2, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByReflectionFactory;->serializableProxy:Z

    .line 30
    .line 31
    iget-boolean v3, p1, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByReflectionFactory;->serializableProxy:Z

    .line 32
    .line 33
    if-eq v2, v3, :cond_4

    .line 34
    .line 35
    return v1

    .line 36
    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByReflectionFactory;->proxiedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 37
    .line 38
    iget-object v3, p1, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByReflectionFactory;->proxiedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 39
    .line 40
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-nez v2, :cond_5

    .line 45
    .line 46
    return v1

    .line 47
    :cond_5
    iget-object p0, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByReflectionFactory;->implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

    .line 48
    .line 49
    iget-object p1, p1, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByReflectionFactory;->implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

    .line 50
    .line 51
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-nez p0, :cond_6

    .line 56
    .line 57
    return v1

    .line 58
    :cond_6
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
    iget-object v2, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByReflectionFactory;->proxiedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲(Lnet/bytebuddy/description/type/TypeDescription;II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v2, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByReflectionFactory;->implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    add-int/2addr v2, v0

    .line 25
    mul-int/2addr v2, v1

    .line 26
    iget-boolean v0, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByReflectionFactory;->ignoreFinalizer:Z

    .line 27
    .line 28
    add-int/2addr v2, v0

    .line 29
    mul-int/2addr v2, v1

    .line 30
    iget-boolean p0, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByReflectionFactory;->serializableProxy:Z

    .line 31
    .line 32
    add-int/2addr v2, p0

    .line 33
    return v2
.end method
