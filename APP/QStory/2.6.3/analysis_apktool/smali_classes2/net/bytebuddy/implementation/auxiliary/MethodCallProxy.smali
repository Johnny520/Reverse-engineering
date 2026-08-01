.class public Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$AssignableSignatureCall;,
        Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$MethodCall;,
        Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$ConstructorCall;,
        Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$PrecomputedMethodGraph;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final FIELD_NAME_PREFIX:Ljava/lang/String; = "argument"


# instance fields
.field private final assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

.field private final serializableProxy:Z

.field private final specialMethodInvocation:Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation;Z)V
    .locals 1

    .line 11
    sget-object v0, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->DEFAULT:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    invoke-direct {p0, p1, p2, v0}, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy;-><init>(Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation;ZLnet/bytebuddy/implementation/bytecode/assign/Assigner;)V

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation;ZLnet/bytebuddy/implementation/bytecode/assign/Assigner;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy;->specialMethodInvocation:Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation;

    .line 5
    .line 6
    iput-boolean p2, p0, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy;->serializableProxy:Z

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 9
    .line 10
    return-void
.end method

.method private static extractFields(Lnet/bytebuddy/description/method/MethodDescription;)Ljava/util/LinkedHashMap;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ")",
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-static {v2}, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy;->fieldName(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {p0}, Lnet/bytebuddy/description/method/MethodDescription;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDefinition;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v0, v1, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    :cond_0
    invoke-interface {p0}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, Lnet/bytebuddy/description/method/ParameterDescription;

    .line 48
    .line 49
    add-int/lit8 v3, v2, 0x1

    .line 50
    .line 51
    invoke-static {v2}, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy;->fieldName(I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-interface {v1}, Lnet/bytebuddy/description/method/ParameterDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-interface {v1}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move v2, v3

    .line 67
    goto :goto_0

    .line 68
    :cond_1
    return-object v0
.end method

.method private static fieldName(I)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "argument"

    .line 2
    .line 3
    invoke-static {p0, v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method


# virtual methods
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
    iget-boolean v2, p0, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy;->serializableProxy:Z

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy;

    .line 23
    .line 24
    iget-boolean v3, p1, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy;->serializableProxy:Z

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy;->specialMethodInvocation:Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation;

    .line 30
    .line 31
    iget-object v3, p1, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy;->specialMethodInvocation:Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation;

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
    iget-object p0, p0, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 41
    .line 42
    iget-object p1, p1, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-nez p0, :cond_5

    .line 49
    .line 50
    return v1

    .line 51
    :cond_5
    return v0
.end method

.method public getSuffix()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy;->specialMethodInvocation:Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation;

    .line 7
    .line 8
    invoke-interface {v1}, Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation;->getMethodDescription()Lnet/bytebuddy/description/method/MethodDescription;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-static {v1}, Lnet/bytebuddy/utility/RandomString;->hashOf(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    iget-boolean p0, p0, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy;->serializableProxy:Z

    .line 24
    .line 25
    if-eqz p0, :cond_0

    .line 26
    .line 27
    const-string p0, "S"

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const-string p0, "0"

    .line 31
    .line 32
    :goto_0
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
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
    iget-object v1, p0, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy;->specialMethodInvocation:Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation;

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
    iget-boolean v0, p0, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy;->serializableProxy:Z

    .line 21
    .line 22
    add-int/2addr v1, v0

    .line 23
    mul-int/lit8 v1, v1, 0x1f

    .line 24
    .line 25
    iget-object p0, p0, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    add-int/2addr p0, v1

    .line 32
    return p0
.end method

.method public make(Ljava/lang/String;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/implementation/MethodAccessorFactory;)Lnet/bytebuddy/dynamic/DynamicType;
    .locals 4

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy;->specialMethodInvocation:Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation;

    .line 2
    .line 3
    sget-object v1, Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;->DEFAULT:Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;

    .line 4
    .line 5
    invoke-interface {p3, v0, v1}, Lnet/bytebuddy/implementation/MethodAccessorFactory;->registerAccessorFor(Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation;Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;)Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    invoke-static {p3}, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy;->extractFields(Lnet/bytebuddy/description/method/MethodDescription;)Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, Lnet/bytebuddy/ByteBuddy;

    .line 14
    .line 15
    invoke-direct {v1, p2}, Lnet/bytebuddy/ByteBuddy;-><init>(Lnet/bytebuddy/ClassFileVersion;)V

    .line 16
    .line 17
    .line 18
    sget-object p2, Lnet/bytebuddy/dynamic/scaffold/TypeValidation;->DISABLED:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 19
    .line 20
    invoke-virtual {v1, p2}, Lnet/bytebuddy/ByteBuddy;->with(Lnet/bytebuddy/dynamic/scaffold/TypeValidation;)Lnet/bytebuddy/ByteBuddy;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    sget-object v1, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$PrecomputedMethodGraph;->INSTANCE:Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$PrecomputedMethodGraph;

    .line 25
    .line 26
    invoke-virtual {p2, v1}, Lnet/bytebuddy/ByteBuddy;->with(Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/ByteBuddy;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    const-class v1, Ljava/lang/Object;

    .line 31
    .line 32
    sget-object v2, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;->NO_CONSTRUCTORS:Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;

    .line 33
    .line 34
    invoke-virtual {p2, v1, v2}, Lnet/bytebuddy/ByteBuddy;->subclass(Ljava/lang/Class;Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-interface {p2, p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->name(Ljava/lang/String;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    sget-object p2, Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType;->DEFAULT_TYPE_MODIFIER:[Lnet/bytebuddy/description/modifier/ModifierContributor$ForType;

    .line 43
    .line 44
    invoke-interface {p1, p2}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->modifiers([Lnet/bytebuddy/description/modifier/ModifierContributor$ForType;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const/4 p2, 0x2

    .line 49
    new-array p2, p2, [Ljava/lang/reflect/Type;

    .line 50
    .line 51
    const-class v1, Ljava/lang/Runnable;

    .line 52
    .line 53
    const/4 v2, 0x0

    .line 54
    aput-object v1, p2, v2

    .line 55
    .line 56
    const/4 v1, 0x1

    .line 57
    const-class v3, Ljava/util/concurrent/Callable;

    .line 58
    .line 59
    aput-object v3, p2, v1

    .line 60
    .line 61
    invoke-interface {p1, p2}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->implement([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition$Optional;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    new-instance p2, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$MethodCall;

    .line 66
    .line 67
    iget-object v3, p0, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 68
    .line 69
    invoke-direct {p2, p3, v3}, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$MethodCall;-><init>(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;)V

    .line 70
    .line 71
    .line 72
    invoke-interface {p1, p2}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iget-boolean p0, p0, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy;->serializableProxy:Z

    .line 77
    .line 78
    if-eqz p0, :cond_0

    .line 79
    .line 80
    new-array p0, v1, [Ljava/lang/Class;

    .line 81
    .line 82
    const-class p2, Ljava/io/Serializable;

    .line 83
    .line 84
    aput-object p2, p0, v2

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_0
    new-array p0, v2, [Ljava/lang/Class;

    .line 88
    .line 89
    :goto_0
    invoke-interface {p1, p0}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->implement([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition$Optional;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    new-array p1, v2, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    .line 94
    .line 95
    invoke-interface {p0, p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineConstructor([Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-interface {p0, p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters(Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    sget-object p1, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$ConstructorCall;->INSTANCE:Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$ConstructorCall;

    .line 108
    .line 109
    invoke-interface {p0, p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 122
    .line 123
    .line 124
    move-result p2

    .line 125
    if-eqz p2, :cond_1

    .line 126
    .line 127
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    check-cast p2, Ljava/util/Map$Entry;

    .line 132
    .line 133
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p3

    .line 137
    check-cast p3, Ljava/lang/String;

    .line 138
    .line 139
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    check-cast p2, Lnet/bytebuddy/description/type/TypeDefinition;

    .line 144
    .line 145
    new-array v0, v1, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForField;

    .line 146
    .line 147
    sget-object v3, Lnet/bytebuddy/description/modifier/Visibility;->PRIVATE:Lnet/bytebuddy/description/modifier/Visibility;

    .line 148
    .line 149
    aput-object v3, v0, v2

    .line 150
    .line 151
    invoke-interface {p0, p3, p2, v0}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineField(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDefinition;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForField;)Lnet/bytebuddy/dynamic/DynamicType$Builder$FieldDefinition$Optional$Valuable;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    goto :goto_1

    .line 156
    :cond_1
    invoke-interface {p0}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->make()Lnet/bytebuddy/dynamic/DynamicType$Unloaded;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    return-object p0
.end method
