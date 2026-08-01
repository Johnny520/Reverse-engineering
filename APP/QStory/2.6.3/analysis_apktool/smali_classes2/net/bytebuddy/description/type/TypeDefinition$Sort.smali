.class public final enum Lnet/bytebuddy/description/type/TypeDefinition$Sort;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/type/TypeDefinition;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Sort"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/description/type/TypeDefinition$Sort$AnnotatedType;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/description/type/TypeDefinition$Sort;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/description/type/TypeDefinition$Sort;

.field private static final ACCESS_CONTROLLER:Z

.field private static final ANNOTATED_TYPE:Lnet/bytebuddy/description/type/TypeDefinition$Sort$AnnotatedType;

.field public static final enum GENERIC_ARRAY:Lnet/bytebuddy/description/type/TypeDefinition$Sort;

.field public static final enum NON_GENERIC:Lnet/bytebuddy/description/type/TypeDefinition$Sort;

.field public static final enum PARAMETERIZED:Lnet/bytebuddy/description/type/TypeDefinition$Sort;

.field public static final enum VARIABLE:Lnet/bytebuddy/description/type/TypeDefinition$Sort;

.field public static final enum VARIABLE_SYMBOLIC:Lnet/bytebuddy/description/type/TypeDefinition$Sort;

.field public static final enum WILDCARD:Lnet/bytebuddy/description/type/TypeDefinition$Sort;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    const-string v2, "java.security.AccessController"

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-static {v2, v1, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const-string v2, "net.bytebuddy.securitymanager"

    .line 10
    .line 11
    const-string v3, "true"

    .line 12
    .line 13
    invoke-static {v2, v3}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-static {v2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    sput-boolean v2, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->ACCESS_CONTROLLER:Z
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catch_0
    sput-boolean v0, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->ACCESS_CONTROLLER:Z

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catch_1
    sput-boolean v1, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->ACCESS_CONTROLLER:Z

    .line 28
    .line 29
    :goto_0
    new-instance v3, Lnet/bytebuddy/description/type/TypeDefinition$Sort;

    .line 30
    .line 31
    const-string v2, "NON_GENERIC"

    .line 32
    .line 33
    invoke-direct {v3, v2, v1}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;-><init>(Ljava/lang/String;I)V

    .line 34
    .line 35
    .line 36
    sput-object v3, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->NON_GENERIC:Lnet/bytebuddy/description/type/TypeDefinition$Sort;

    .line 37
    .line 38
    new-instance v4, Lnet/bytebuddy/description/type/TypeDefinition$Sort;

    .line 39
    .line 40
    const-string v1, "GENERIC_ARRAY"

    .line 41
    .line 42
    invoke-direct {v4, v1, v0}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;-><init>(Ljava/lang/String;I)V

    .line 43
    .line 44
    .line 45
    sput-object v4, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->GENERIC_ARRAY:Lnet/bytebuddy/description/type/TypeDefinition$Sort;

    .line 46
    .line 47
    new-instance v5, Lnet/bytebuddy/description/type/TypeDefinition$Sort;

    .line 48
    .line 49
    const-string v0, "PARAMETERIZED"

    .line 50
    .line 51
    const/4 v1, 0x2

    .line 52
    invoke-direct {v5, v0, v1}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;-><init>(Ljava/lang/String;I)V

    .line 53
    .line 54
    .line 55
    sput-object v5, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->PARAMETERIZED:Lnet/bytebuddy/description/type/TypeDefinition$Sort;

    .line 56
    .line 57
    new-instance v6, Lnet/bytebuddy/description/type/TypeDefinition$Sort;

    .line 58
    .line 59
    const-string v0, "WILDCARD"

    .line 60
    .line 61
    const/4 v1, 0x3

    .line 62
    invoke-direct {v6, v0, v1}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;-><init>(Ljava/lang/String;I)V

    .line 63
    .line 64
    .line 65
    sput-object v6, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->WILDCARD:Lnet/bytebuddy/description/type/TypeDefinition$Sort;

    .line 66
    .line 67
    new-instance v7, Lnet/bytebuddy/description/type/TypeDefinition$Sort;

    .line 68
    .line 69
    const-string v0, "VARIABLE"

    .line 70
    .line 71
    const/4 v1, 0x4

    .line 72
    invoke-direct {v7, v0, v1}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;-><init>(Ljava/lang/String;I)V

    .line 73
    .line 74
    .line 75
    sput-object v7, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->VARIABLE:Lnet/bytebuddy/description/type/TypeDefinition$Sort;

    .line 76
    .line 77
    new-instance v8, Lnet/bytebuddy/description/type/TypeDefinition$Sort;

    .line 78
    .line 79
    const-string v0, "VARIABLE_SYMBOLIC"

    .line 80
    .line 81
    const/4 v1, 0x5

    .line 82
    invoke-direct {v8, v0, v1}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;-><init>(Ljava/lang/String;I)V

    .line 83
    .line 84
    .line 85
    sput-object v8, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->VARIABLE_SYMBOLIC:Lnet/bytebuddy/description/type/TypeDefinition$Sort;

    .line 86
    .line 87
    filled-new-array/range {v3 .. v8}, [Lnet/bytebuddy/description/type/TypeDefinition$Sort;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    sput-object v0, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->$VALUES:[Lnet/bytebuddy/description/type/TypeDefinition$Sort;

    .line 92
    .line 93
    const-class v0, Lnet/bytebuddy/description/type/TypeDefinition$Sort$AnnotatedType;

    .line 94
    .line 95
    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    check-cast v0, Lnet/bytebuddy/description/type/TypeDefinition$Sort$AnnotatedType;

    .line 104
    .line 105
    sput-object v0, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->ANNOTATED_TYPE:Lnet/bytebuddy/description/type/TypeDefinition$Sort$AnnotatedType;

    .line 106
    .line 107
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static describe(Ljava/lang/reflect/Type;)Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .locals 1

    .line 68
    sget-object v0, Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader$NoOp;->INSTANCE:Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader$NoOp;

    invoke-static {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->describe(Ljava/lang/reflect/Type;Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object p0

    return-object p0
.end method

.method public static describe(Ljava/lang/reflect/Type;Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader;)Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .locals 1

    .line 1
    instance-of v0, p0, Ljava/lang/Class;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;

    .line 6
    .line 7
    check-cast p0, Ljava/lang/Class;

    .line 8
    .line 9
    invoke-direct {v0, p0, p1}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;-><init>(Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader;)V

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    instance-of v0, p0, Ljava/lang/reflect/GenericArrayType;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    new-instance v0, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfGenericArray$ForLoadedType;

    .line 18
    .line 19
    check-cast p0, Ljava/lang/reflect/GenericArrayType;

    .line 20
    .line 21
    invoke-direct {v0, p0, p1}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfGenericArray$ForLoadedType;-><init>(Ljava/lang/reflect/GenericArrayType;Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader;)V

    .line 22
    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_1
    instance-of v0, p0, Ljava/lang/reflect/ParameterizedType;

    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    new-instance v0, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfParameterizedType$ForLoadedType;

    .line 30
    .line 31
    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    .line 32
    .line 33
    invoke-direct {v0, p0, p1}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfParameterizedType$ForLoadedType;-><init>(Ljava/lang/reflect/ParameterizedType;Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader;)V

    .line 34
    .line 35
    .line 36
    return-object v0

    .line 37
    :cond_2
    instance-of v0, p0, Ljava/lang/reflect/TypeVariable;

    .line 38
    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    new-instance v0, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfTypeVariable$ForLoadedType;

    .line 42
    .line 43
    check-cast p0, Ljava/lang/reflect/TypeVariable;

    .line 44
    .line 45
    invoke-direct {v0, p0, p1}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfTypeVariable$ForLoadedType;-><init>(Ljava/lang/reflect/TypeVariable;Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader;)V

    .line 46
    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_3
    instance-of v0, p0, Ljava/lang/reflect/WildcardType;

    .line 50
    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    new-instance v0, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfWildcardType$ForLoadedType;

    .line 54
    .line 55
    check-cast p0, Ljava/lang/reflect/WildcardType;

    .line 56
    .line 57
    invoke-direct {v0, p0, p1}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfWildcardType$ForLoadedType;-><init>(Ljava/lang/reflect/WildcardType;Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader;)V

    .line 58
    .line 59
    .line 60
    return-object v0

    .line 61
    :cond_4
    const-string p1, "Unknown type: "

    .line 62
    .line 63
    invoke-static {p0, p1}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const/4 p0, 0x0

    .line 67
    return-object p0
.end method

.method public static describeAnnotated(Ljava/lang/reflect/AnnotatedElement;)Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .locals 2

    .line 1
    sget-object v0, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->ANNOTATED_TYPE:Lnet/bytebuddy/description/type/TypeDefinition$Sort$AnnotatedType;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Lnet/bytebuddy/description/type/TypeDefinition$Sort$AnnotatedType;->isInstance(Ljava/lang/reflect/AnnotatedElement;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-interface {v0, p0}, Lnet/bytebuddy/description/type/TypeDefinition$Sort$AnnotatedType;->getType(Ljava/lang/reflect/AnnotatedElement;)Ljava/lang/reflect/Type;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader$Delegator$Simple;

    .line 14
    .line 15
    invoke-direct {v1, p0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader$Delegator$Simple;-><init>(Ljava/lang/reflect/AnnotatedElement;)V

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->describe(Ljava/lang/reflect/Type;Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_0
    const-string v0, "Not an instance of AnnotatedType: "

    .line 24
    .line 25
    invoke-static {p0, v0}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return-object p0
.end method

.method public static describeOrNull(Ljava/lang/reflect/Type;Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader;)Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .locals 1
    .param p0    # Ljava/lang/reflect/Type;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-static {p0, p1}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->describe(Ljava/lang/reflect/Type;Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0

    .line 8
    :cond_0
    new-instance p0, Ljava/lang/TypeNotPresentException;

    .line 9
    .line 10
    const-string p1, "<unknown>"

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {p0, p1, v0}, Ljava/lang/TypeNotPresentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    throw p0
.end method

.method private static doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/security/PrivilegedAction<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/build/AccessControllerPlugin$Enhance;
    .end annotation

    .line 1
    sget-boolean v0, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->ACCESS_CONTROLLER:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-interface {p0}, Ljava/security/PrivilegedAction;->run()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/description/type/TypeDefinition$Sort;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/description/type/TypeDefinition$Sort;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/description/type/TypeDefinition$Sort;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/description/type/TypeDefinition$Sort;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->$VALUES:[Lnet/bytebuddy/description/type/TypeDefinition$Sort;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/description/type/TypeDefinition$Sort;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/description/type/TypeDefinition$Sort;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public isGenericArray()Z
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->GENERIC_ARRAY:Lnet/bytebuddy/description/type/TypeDefinition$Sort;

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public isNonGeneric()Z
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->NON_GENERIC:Lnet/bytebuddy/description/type/TypeDefinition$Sort;

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public isParameterized()Z
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->PARAMETERIZED:Lnet/bytebuddy/description/type/TypeDefinition$Sort;

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public isTypeVariable()Z
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->VARIABLE:Lnet/bytebuddy/description/type/TypeDefinition$Sort;

    .line 2
    .line 3
    if-eq p0, v0, :cond_1

    .line 4
    .line 5
    sget-object v0, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->VARIABLE_SYMBOLIC:Lnet/bytebuddy/description/type/TypeDefinition$Sort;

    .line 6
    .line 7
    if-ne p0, v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0

    .line 12
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 13
    return p0
.end method

.method public isWildcard()Z
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->WILDCARD:Lnet/bytebuddy/description/type/TypeDefinition$Sort;

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method
