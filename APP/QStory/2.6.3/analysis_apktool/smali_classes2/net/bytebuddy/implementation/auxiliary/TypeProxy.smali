.class public Lnet/bytebuddy/implementation/auxiliary/TypeProxy;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/auxiliary/TypeProxy$MethodCall;,
        Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForDefaultMethod;,
        Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByReflectionFactory;,
        Lnet/bytebuddy/implementation/auxiliary/TypeProxy$ForSuperMethodByConstructor;,
        Lnet/bytebuddy/implementation/auxiliary/TypeProxy$InvocationFactory;,
        Lnet/bytebuddy/implementation/auxiliary/TypeProxy$SilentConstruction;,
        Lnet/bytebuddy/implementation/auxiliary/TypeProxy$AbstractMethodErrorThrow;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field public static final INSTANCE_FIELD:Ljava/lang/String; = "target"

.field public static final REFLECTION_METHOD:Ljava/lang/String; = "make"


# instance fields
.field private final ignoreFinalizer:Z

.field private final implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

.field private final invocationFactory:Lnet/bytebuddy/implementation/auxiliary/TypeProxy$InvocationFactory;

.field private final proxiedType:Lnet/bytebuddy/description/type/TypeDescription;

.field private final serializableProxy:Z


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/implementation/Implementation$Target;Lnet/bytebuddy/implementation/auxiliary/TypeProxy$InvocationFactory;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy;->proxiedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy;->implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy;->invocationFactory:Lnet/bytebuddy/implementation/auxiliary/TypeProxy$InvocationFactory;

    .line 9
    .line 10
    iput-boolean p4, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy;->ignoreFinalizer:Z

    .line 11
    .line 12
    iput-boolean p5, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy;->serializableProxy:Z

    .line 13
    .line 14
    return-void
.end method

.method public static synthetic access$200(Lnet/bytebuddy/implementation/auxiliary/TypeProxy;)Lnet/bytebuddy/implementation/Implementation$Target;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy;->implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$300(Lnet/bytebuddy/implementation/auxiliary/TypeProxy;)Lnet/bytebuddy/description/type/TypeDescription;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy;->proxiedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$400(Lnet/bytebuddy/implementation/auxiliary/TypeProxy;)Lnet/bytebuddy/implementation/auxiliary/TypeProxy$InvocationFactory;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy;->invocationFactory:Lnet/bytebuddy/implementation/auxiliary/TypeProxy$InvocationFactory;

    .line 2
    .line 3
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
    iget-boolean v2, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy;->ignoreFinalizer:Z

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/auxiliary/TypeProxy;

    .line 23
    .line 24
    iget-boolean v3, p1, Lnet/bytebuddy/implementation/auxiliary/TypeProxy;->ignoreFinalizer:Z

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget-boolean v2, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy;->serializableProxy:Z

    .line 30
    .line 31
    iget-boolean v3, p1, Lnet/bytebuddy/implementation/auxiliary/TypeProxy;->serializableProxy:Z

    .line 32
    .line 33
    if-eq v2, v3, :cond_4

    .line 34
    .line 35
    return v1

    .line 36
    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy;->proxiedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 37
    .line 38
    iget-object v3, p1, Lnet/bytebuddy/implementation/auxiliary/TypeProxy;->proxiedType:Lnet/bytebuddy/description/type/TypeDescription;

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy;->implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

    .line 48
    .line 49
    iget-object v3, p1, Lnet/bytebuddy/implementation/auxiliary/TypeProxy;->implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

    .line 50
    .line 51
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-nez v2, :cond_6

    .line 56
    .line 57
    return v1

    .line 58
    :cond_6
    iget-object p0, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy;->invocationFactory:Lnet/bytebuddy/implementation/auxiliary/TypeProxy$InvocationFactory;

    .line 59
    .line 60
    iget-object p1, p1, Lnet/bytebuddy/implementation/auxiliary/TypeProxy;->invocationFactory:Lnet/bytebuddy/implementation/auxiliary/TypeProxy$InvocationFactory;

    .line 61
    .line 62
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-nez p0, :cond_7

    .line 67
    .line 68
    return v1

    .line 69
    :cond_7
    return v0
.end method

.method public getSuffix()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy;->proxiedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-static {v1}, Lnet/bytebuddy/utility/RandomString;->hashOf(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    iget-boolean v1, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy;->ignoreFinalizer:Z

    .line 20
    .line 21
    const-string v2, "0"

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    const-string v1, "I"

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move-object v1, v2

    .line 29
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-boolean p0, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy;->serializableProxy:Z

    .line 33
    .line 34
    if-eqz p0, :cond_1

    .line 35
    .line 36
    const-string v2, "S"

    .line 37
    .line 38
    :cond_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0
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
    iget-object v2, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy;->proxiedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲(Lnet/bytebuddy/description/type/TypeDescription;II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v2, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy;->implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

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
    iget-object v0, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy;->invocationFactory:Lnet/bytebuddy/implementation/auxiliary/TypeProxy$InvocationFactory;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    add-int/2addr v0, v2

    .line 33
    mul-int/2addr v0, v1

    .line 34
    iget-boolean v2, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy;->ignoreFinalizer:Z

    .line 35
    .line 36
    add-int/2addr v0, v2

    .line 37
    mul-int/2addr v0, v1

    .line 38
    iget-boolean p0, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy;->serializableProxy:Z

    .line 39
    .line 40
    add-int/2addr v0, p0

    .line 41
    return v0
.end method

.method public make(Ljava/lang/String;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/implementation/MethodAccessorFactory;)Lnet/bytebuddy/dynamic/DynamicType;
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/ByteBuddy;

    .line 2
    .line 3
    invoke-direct {v0, p2}, Lnet/bytebuddy/ByteBuddy;-><init>(Lnet/bytebuddy/ClassFileVersion;)V

    .line 4
    .line 5
    .line 6
    sget-object p2, Lnet/bytebuddy/dynamic/scaffold/TypeValidation;->DISABLED:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 7
    .line 8
    invoke-virtual {v0, p2}, Lnet/bytebuddy/ByteBuddy;->with(Lnet/bytebuddy/dynamic/scaffold/TypeValidation;)Lnet/bytebuddy/ByteBuddy;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    iget-boolean v0, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy;->ignoreFinalizer:Z

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isFinalizer()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->none()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :goto_0
    invoke-virtual {p2, v0}, Lnet/bytebuddy/ByteBuddy;->ignore(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/ByteBuddy;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    iget-object v0, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy;->proxiedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 30
    .line 31
    invoke-virtual {p2, v0}, Lnet/bytebuddy/ByteBuddy;->subclass(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-interface {p2, p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->name(Ljava/lang/String;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    sget-object p2, Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType;->DEFAULT_TYPE_MODIFIER:[Lnet/bytebuddy/description/modifier/ModifierContributor$ForType;

    .line 40
    .line 41
    invoke-interface {p1, p2}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->modifiers([Lnet/bytebuddy/description/modifier/ModifierContributor$ForType;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iget-boolean p2, p0, Lnet/bytebuddy/implementation/auxiliary/TypeProxy;->serializableProxy:Z

    .line 46
    .line 47
    const/4 v0, 0x1

    .line 48
    const/4 v1, 0x0

    .line 49
    if-eqz p2, :cond_1

    .line 50
    .line 51
    new-array p2, v0, [Ljava/lang/Class;

    .line 52
    .line 53
    const-class v2, Ljava/io/Serializable;

    .line 54
    .line 55
    aput-object v2, p2, v1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    new-array p2, v1, [Ljava/lang/Class;

    .line 59
    .line 60
    :goto_1
    invoke-interface {p1, p2}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->implement([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition$Optional;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->any()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    invoke-interface {p1, p2}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    new-instance p2, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$MethodCall;

    .line 73
    .line 74
    invoke-direct {p2, p0, p3}, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$MethodCall;-><init>(Lnet/bytebuddy/implementation/auxiliary/TypeProxy;Lnet/bytebuddy/implementation/MethodAccessorFactory;)V

    .line 75
    .line 76
    .line 77
    invoke-interface {p1, p2}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    new-array p1, v0, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    .line 82
    .line 83
    sget-object p2, Lnet/bytebuddy/description/modifier/Ownership;->STATIC:Lnet/bytebuddy/description/modifier/Ownership;

    .line 84
    .line 85
    aput-object p2, p1, v1

    .line 86
    .line 87
    const-string p2, "make"

    .line 88
    .line 89
    const-class p3, Lnet/bytebuddy/dynamic/TargetType;

    .line 90
    .line 91
    invoke-interface {p0, p2, p3, p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineMethod(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    sget-object p1, Lnet/bytebuddy/implementation/auxiliary/TypeProxy$SilentConstruction;->INSTANCE:Lnet/bytebuddy/implementation/auxiliary/TypeProxy$SilentConstruction;

    .line 96
    .line 97
    invoke-interface {p0, p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-interface {p0}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->make()Lnet/bytebuddy/dynamic/DynamicType$Unloaded;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    return-object p0
.end method
