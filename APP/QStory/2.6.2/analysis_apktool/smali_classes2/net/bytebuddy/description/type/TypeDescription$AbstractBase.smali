.class public abstract Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;
.super Lnet/bytebuddy/description/TypeVariableSource$AbstractBase;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/description/type/TypeDescription;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/type/TypeDescription;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "AbstractBase"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/description/type/TypeDescription$AbstractBase$OfSimpleType;
    }
.end annotation


# static fields
.field private static final ACCESS_CONTROLLER:Z

.field public static final RAW_TYPES:Z


# instance fields
.field private transient synthetic hashCode:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-string v1, "java.security.AccessController"

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-static {v1, v0, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string v1, "net.bytebuddy.securitymanager"

    .line 9
    .line 10
    const-string v2, "true"

    .line 11
    .line 12
    invoke-static {v1, v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {v1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    sput-boolean v1, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->ACCESS_CONTROLLER:Z
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    const/4 v1, 0x1

    .line 24
    sput-boolean v1, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->ACCESS_CONTROLLER:Z

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catch_1
    sput-boolean v0, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->ACCESS_CONTROLLER:Z

    .line 28
    .line 29
    :goto_0
    :try_start_1
    new-instance v1, Lnet/bytebuddy/utility/privilege/GetSystemPropertyAction;

    .line 30
    .line 31
    const-string v2, "net.bytebuddy.raw"

    .line 32
    .line 33
    invoke-direct {v1, v2}, Lnet/bytebuddy/utility/privilege/GetSystemPropertyAction;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-static {v1}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 46
    :catch_2
    sput-boolean v0, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->RAW_TYPES:Z

    .line 47
    .line 48
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/description/TypeVariableSource$AbstractBase;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
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
    sget-boolean v0, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->ACCESS_CONTROLLER:Z

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

.method private static isAssignable(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription;)Z
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDefinition;->isArray()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v2, 0x0

    .line 14
    const-class v3, Ljava/lang/Object;

    .line 15
    .line 16
    if-eqz v0, :cond_4

    .line 17
    .line 18
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->isArray()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription;->getComponentType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDescription;->getComponentType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {p0, p1}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->isAssignable(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    return p0

    .line 37
    :cond_1
    invoke-interface {p0, v3}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-nez p1, :cond_3

    .line 42
    .line 43
    sget-object p1, Lnet/bytebuddy/description/type/TypeDescription;->ARRAY_INTERFACES:Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 44
    .line 45
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-interface {p1, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-eqz p0, :cond_2

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    return v2

    .line 57
    :cond_3
    :goto_0
    return v1

    .line 58
    :cond_4
    invoke-interface {p0, v3}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_5

    .line 63
    .line 64
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDefinition;->isPrimitive()Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    xor-int/2addr p0, v1

    .line 69
    return p0

    .line 70
    :cond_5
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDefinition;->getSuperClass()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    if-eqz v0, :cond_6

    .line 75
    .line 76
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription;->isAssignableFrom(Lnet/bytebuddy/description/type/TypeDescription;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_6

    .line 85
    .line 86
    return v1

    .line 87
    :cond_6
    invoke-interface {p0}, Lnet/bytebuddy/description/ModifierReviewable$ForTypeDefinition;->isInterface()Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_8

    .line 92
    .line 93
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDefinition;->getInterfaces()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeList$Generic;->asErasures()Lnet/bytebuddy/description/type/TypeList;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    :cond_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_8

    .line 110
    .line 111
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    check-cast v0, Lnet/bytebuddy/description/type/TypeDescription;

    .line 116
    .line 117
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription;->isAssignableFrom(Lnet/bytebuddy/description/type/TypeDescription;)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eqz v0, :cond_7

    .line 122
    .line 123
    return v1

    .line 124
    :cond_8
    return v2
.end method


# virtual methods
.method public accept(Lnet/bytebuddy/description/TypeVariableSource$Visitor;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lnet/bytebuddy/description/TypeVariableSource$Visitor<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    invoke-interface {p1, p0}, Lnet/bytebuddy/description/TypeVariableSource$Visitor;->onType(Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public asBoxed()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 1

    .line 1
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-class p0, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    const-class p0, Ljava/lang/Byte;

    .line 25
    .line 26
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_1
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    const-class p0, Ljava/lang/Short;

    .line 40
    .line 41
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :cond_2
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 47
    .line 48
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    const-class p0, Ljava/lang/Character;

    .line 55
    .line 56
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :cond_3
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 62
    .line 63
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_4

    .line 68
    .line 69
    const-class p0, Ljava/lang/Integer;

    .line 70
    .line 71
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0

    .line 76
    :cond_4
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 77
    .line 78
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_5

    .line 83
    .line 84
    const-class p0, Ljava/lang/Long;

    .line 85
    .line 86
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :cond_5
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 92
    .line 93
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_6

    .line 98
    .line 99
    const-class p0, Ljava/lang/Float;

    .line 100
    .line 101
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    return-object p0

    .line 106
    :cond_6
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 107
    .line 108
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_7

    .line 113
    .line 114
    const-class p0, Ljava/lang/Double;

    .line 115
    .line 116
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    :cond_7
    return-object p0
.end method

.method public asErasure()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 0

    .line 1
    return-object p0
.end method

.method public asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForErasure;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForErasure;-><init>(Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public asUnboxed()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 1

    .line 1
    const-class v0, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 10
    .line 11
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    const-class v0, Ljava/lang/Byte;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    sget-object p0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 25
    .line 26
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_1
    const-class v0, Ljava/lang/Short;

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    sget-object p0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 40
    .line 41
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :cond_2
    const-class v0, Ljava/lang/Character;

    .line 47
    .line 48
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    sget-object p0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 55
    .line 56
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :cond_3
    const-class v0, Ljava/lang/Integer;

    .line 62
    .line 63
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_4

    .line 68
    .line 69
    sget-object p0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 70
    .line 71
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0

    .line 76
    :cond_4
    const-class v0, Ljava/lang/Long;

    .line 77
    .line 78
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_5

    .line 83
    .line 84
    sget-object p0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 85
    .line 86
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :cond_5
    const-class v0, Ljava/lang/Float;

    .line 92
    .line 93
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_6

    .line 98
    .line 99
    sget-object p0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 100
    .line 101
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    return-object p0

    .line 106
    :cond_6
    const-class v0, Ljava/lang/Double;

    .line 107
    .line 108
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_7

    .line 113
    .line 114
    sget-object p0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 115
    .line 116
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    :cond_7
    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3
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
    instance-of v1, p1, Lnet/bytebuddy/description/type/TypeDefinition;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lnet/bytebuddy/description/type/TypeDefinition;

    .line 12
    .line 13
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDefinition;->getSort()Lnet/bytebuddy/description/type/TypeDefinition$Sort;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->isNonGeneric()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    invoke-interface {p0}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-interface {p1}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-eqz p0, :cond_2

    .line 40
    .line 41
    return v0

    .line 42
    :cond_2
    return v2
.end method

.method public getActualModifiers(Z)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->isModuleType()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const p0, 0x8000

    .line 8
    .line 9
    .line 10
    return p0

    .line 11
    :cond_0
    invoke-interface {p0}, Lnet/bytebuddy/description/ModifierReviewable;->getModifiers()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-interface {p0}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-class v2, Ljava/lang/Deprecated;

    .line 20
    .line 21
    invoke-interface {v1, v2}, Lnet/bytebuddy/description/annotation/AnnotationList;->isAnnotationPresent(Ljava/lang/Class;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v2, 0x0

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    const/high16 v1, 0x20000

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move v1, v2

    .line 32
    :goto_0
    or-int/2addr v0, v1

    .line 33
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->isRecord()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    const/high16 v1, 0x10000

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    move v1, v2

    .line 43
    :goto_1
    or-int/2addr v0, v1

    .line 44
    if-eqz p1, :cond_3

    .line 45
    .line 46
    const/16 v2, 0x20

    .line 47
    .line 48
    :cond_3
    or-int p1, v0, v2

    .line 49
    .line 50
    invoke-virtual {p0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->isPrivate()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_4

    .line 55
    .line 56
    and-int/lit8 p0, p1, -0xb

    .line 57
    .line 58
    return p0

    .line 59
    :cond_4
    invoke-virtual {p0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->isProtected()Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-eqz p0, :cond_5

    .line 64
    .line 65
    and-int/lit8 p0, p1, -0xd

    .line 66
    .line 67
    or-int/lit8 p0, p0, 0x1

    .line 68
    .line 69
    return p0

    .line 70
    :cond_5
    and-int/lit8 p0, p1, -0x9

    .line 71
    .line 72
    return p0
.end method

.method public getActualName()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->isArray()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    move v1, v0

    .line 9
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 10
    .line 11
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription;->getComponentType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->isArray()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    new-instance v2, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-interface {p0}, Lnet/bytebuddy/description/NamedElement;->getActualName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    :goto_0
    if-ge v0, v1, :cond_1

    .line 34
    .line 35
    const-string p0, "[]"

    .line 36
    .line 37
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    add-int/lit8 v0, v0, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :cond_2
    invoke-interface {p0}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method

.method public getClassFileVersion()Lnet/bytebuddy/ClassFileVersion;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public getDefaultValue()Ljava/lang/Object;
    .locals 2
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :cond_1
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :cond_2
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0

    .line 52
    :cond_3
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 53
    .line 54
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_4

    .line 59
    .line 60
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :cond_4
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 66
    .line 67
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_5

    .line 72
    .line 73
    const-wide/16 v0, 0x0

    .line 74
    .line 75
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0

    .line 80
    :cond_5
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 81
    .line 82
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_6

    .line 87
    .line 88
    const/4 p0, 0x0

    .line 89
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    return-object p0

    .line 94
    :cond_6
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 95
    .line 96
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    if-eqz p0, :cond_7

    .line 101
    .line 102
    const-wide/16 v0, 0x0

    .line 103
    .line 104
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    return-object p0

    .line 109
    :cond_7
    const/4 p0, 0x0

    .line 110
    return-object p0
.end method

.method public getEnclosingSource()Lnet/bytebuddy/description/TypeVariableSource;
    .locals 1
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription;->getEnclosingMethod()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->isStatic()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    sget-object p0, Lnet/bytebuddy/description/TypeVariableSource;->UNDEFINED:Lnet/bytebuddy/description/TypeVariableSource;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription;->getEnclosingType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_1
    return-object v0
.end method

.method public getGenericSignature()Ljava/lang/String;
    .locals 8
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    :try_start_0
    new-instance v0, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;

    .line 2
    .line 3
    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Lnet/bytebuddy/description/TypeVariableSource;->getTypeVariables()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v2, 0x0

    .line 15
    move v3, v2

    .line 16
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    const/4 v5, 0x1

    .line 21
    if-eqz v4, :cond_2

    .line 22
    .line 23
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 28
    .line 29
    invoke-interface {v3}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->getSymbol()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-virtual {v0, v4}, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->visitFormalTypeParameter(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-interface {v3}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->getUpperBounds()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-eqz v4, :cond_1

    .line 49
    .line 50
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    check-cast v4, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 55
    .line 56
    new-instance v6, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$ForSignatureVisitor;

    .line 57
    .line 58
    invoke-interface {v4}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    invoke-interface {v7}, Lnet/bytebuddy/description/ModifierReviewable$ForTypeDefinition;->isInterface()Z

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    if-eqz v7, :cond_0

    .line 67
    .line 68
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->visitInterfaceBound()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    goto :goto_2

    .line 73
    :cond_0
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->visitClassBound()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    :goto_2
    invoke-direct {v6, v7}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$ForSignatureVisitor;-><init>(Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;)V

    .line 78
    .line 79
    .line 80
    invoke-interface {v4, v6}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_1
    move v3, v5

    .line 85
    goto :goto_0

    .line 86
    :cond_2
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->getSuperClass()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    if-nez v1, :cond_3

    .line 91
    .line 92
    const-class v1, Ljava/lang/Object;

    .line 93
    .line 94
    invoke-static {v1}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    :cond_3
    new-instance v4, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$ForSignatureVisitor;

    .line 99
    .line 100
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->visitSuperclass()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    invoke-direct {v4, v6}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$ForSignatureVisitor;-><init>(Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;)V

    .line 105
    .line 106
    .line 107
    invoke-interface {v1, v4}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    if-nez v3, :cond_5

    .line 111
    .line 112
    invoke-interface {v1}, Lnet/bytebuddy/description/type/TypeDefinition;->getSort()Lnet/bytebuddy/description/type/TypeDefinition$Sort;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-virtual {v1}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->isNonGeneric()Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-nez v1, :cond_4

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_4
    move v1, v2

    .line 124
    goto :goto_4

    .line 125
    :cond_5
    :goto_3
    move v1, v5

    .line 126
    :goto_4
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->getInterfaces()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    if-eqz v3, :cond_8

    .line 139
    .line 140
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    check-cast v3, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 145
    .line 146
    new-instance v4, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$ForSignatureVisitor;

    .line 147
    .line 148
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->visitInterface()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    invoke-direct {v4, v6}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$ForSignatureVisitor;-><init>(Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;)V

    .line 153
    .line 154
    .line 155
    invoke-interface {v3, v4}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    if-nez v1, :cond_7

    .line 159
    .line 160
    invoke-interface {v3}, Lnet/bytebuddy/description/type/TypeDefinition;->getSort()Lnet/bytebuddy/description/type/TypeDefinition$Sort;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-virtual {v1}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->isNonGeneric()Z

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    if-nez v1, :cond_6

    .line 169
    .line 170
    goto :goto_6

    .line 171
    :cond_6
    move v1, v2

    .line 172
    goto :goto_5

    .line 173
    :cond_7
    :goto_6
    move v1, v5

    .line 174
    goto :goto_5

    .line 175
    :cond_8
    if-eqz v1, :cond_9

    .line 176
    .line 177
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/signature/SignatureWriter;->toString()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    return-object p0

    .line 182
    :cond_9
    sget-object p0, Lnet/bytebuddy/description/NamedElement$WithDescriptor;->NON_GENERIC_SIGNATURE:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/reflect/GenericSignatureFormatError; {:try_start_0 .. :try_end_0} :catch_0

    .line 183
    .line 184
    return-object p0

    .line 185
    :catch_0
    sget-object p0, Lnet/bytebuddy/description/NamedElement$WithDescriptor;->NON_GENERIC_SIGNATURE:Ljava/lang/String;

    .line 186
    .line 187
    return-object p0
.end method

.method public getInheritedAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;
    .locals 4

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->getSuperClass()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p0}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v1, Ljava/util/HashSet;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 32
    .line 33
    invoke-interface {v3}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getAnnotationType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    new-instance v2, Lnet/bytebuddy/description/annotation/AnnotationList$Explicit;

    .line 42
    .line 43
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDescription;->getInheritedAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/annotation/AnnotationList;->inherited(Ljava/util/Set;)Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {p0, v0}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-direct {v2, p0}, Lnet/bytebuddy/description/annotation/AnnotationList$Explicit;-><init>(Ljava/util/List;)V

    .line 60
    .line 61
    .line 62
    return-object v2
.end method

.method public getInnerClassCount()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->isStatic()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-nez p0, :cond_1

    .line 14
    .line 15
    return v1

    .line 16
    :cond_1
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription;->getInnerClassCount()I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    add-int/lit8 p0, p0, 0x1

    .line 21
    .line 22
    return p0
.end method

.method public getInternalName()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/16 v0, 0x2e

    .line 6
    .line 7
    const/16 v1, 0x2f

    .line 8
    .line 9
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public getLongSimpleName()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription;->getSimpleName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDescription;->getLongSimpleName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v0, "."

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription;->getSimpleName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method

.method public getSort()Lnet/bytebuddy/description/type/TypeDefinition$Sort;
    .locals 0

    .line 1
    sget-object p0, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->NON_GENERIC:Lnet/bytebuddy/description/type/TypeDefinition$Sort;

    .line 2
    .line 3
    return-object p0
.end method

.method public getTypeName()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public hashCode()I
    .locals 1
    .annotation runtime Lnet/bytebuddy/build/CachedReturnPlugin$Enhance;
        value = "hashCode"
    .end annotation

    .line 1
    iget v0, p0, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->hashCode:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-interface {p0}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    :goto_0
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget p0, p0, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->hashCode:I

    .line 18
    .line 19
    return p0

    .line 20
    :cond_1
    iput v0, p0, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->hashCode:I

    .line 21
    .line 22
    return v0
.end method

.method public isAccessibleTo(Lnet/bytebuddy/description/type/TypeDescription;)Z
    .locals 1

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->isPrimitive()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->isArray()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription;->getComponentType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-interface {p0, p1}, Lnet/bytebuddy/description/ByteCodeElement;->isVisibleTo(Lnet/bytebuddy/description/type/TypeDescription;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->isPublic()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_2

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->isSamePackage(Lnet/bytebuddy/description/type/TypeDescription;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eqz p0, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 p0, 0x0

    .line 38
    return p0

    .line 39
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 40
    return p0
.end method

.method public isAnnotationReturnType()Z
    .locals 2

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->isPrimitive()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_3

    .line 6
    .line 7
    const-class v0, Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_3

    .line 14
    .line 15
    const-class v0, Ljava/lang/Enum;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->isAssignableTo(Ljava/lang/Class;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    :cond_0
    const-class v0, Ljava/lang/annotation/Annotation;

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->isAssignableTo(Ljava/lang/Class;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    :cond_1
    const-class v0, Ljava/lang/Class;

    .line 44
    .line 45
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_3

    .line 50
    .line 51
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->isArray()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription;->getComponentType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDefinition;->isArray()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_2

    .line 66
    .line 67
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription;->getComponentType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription;->isAnnotationReturnType()Z

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    if-eqz p0, :cond_2

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    const/4 p0, 0x0

    .line 79
    return p0

    .line 80
    :cond_3
    :goto_0
    const/4 p0, 0x1

    .line 81
    return p0
.end method

.method public isAnnotationValue()Z
    .locals 1

    .line 361
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->isPrimitive()Z

    move-result v0

    if-nez v0, :cond_1

    const-class v0, Ljava/lang/String;

    .line 362
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-nez v0, :cond_1

    const-class v0, Lnet/bytebuddy/description/type/TypeDescription;

    .line 363
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->isAssignableTo(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_1

    const-class v0, Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 364
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->isAssignableTo(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_1

    const-class v0, Lnet/bytebuddy/description/enumeration/EnumerationDescription;

    .line 365
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->isAssignableTo(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 366
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->isArray()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription;->getComponentType()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDefinition;->isArray()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription;->getComponentType()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p0

    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription;->isAnnotationValue()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public isAnnotationValue(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    const-class v0, Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    instance-of v0, p1, Lnet/bytebuddy/description/type/TypeDescription;

    .line 11
    .line 12
    if-nez v0, :cond_15

    .line 13
    .line 14
    :cond_0
    instance-of v0, p1, Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    move-object v0, p1

    .line 19
    check-cast v0, Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 20
    .line 21
    invoke-interface {v0}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getAnnotationType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_15

    .line 30
    .line 31
    :cond_1
    instance-of v0, p1, Lnet/bytebuddy/description/enumeration/EnumerationDescription;

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    move-object v0, p1

    .line 36
    check-cast v0, Lnet/bytebuddy/description/enumeration/EnumerationDescription;

    .line 37
    .line 38
    invoke-interface {v0}, Lnet/bytebuddy/description/enumeration/EnumerationDescription;->getEnumerationType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-nez v0, :cond_15

    .line 47
    .line 48
    :cond_2
    const-class v0, Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    instance-of v0, p1, Ljava/lang/String;

    .line 57
    .line 58
    if-nez v0, :cond_15

    .line 59
    .line 60
    :cond_3
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 61
    .line 62
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_4

    .line 67
    .line 68
    instance-of v0, p1, Ljava/lang/Boolean;

    .line 69
    .line 70
    if-nez v0, :cond_15

    .line 71
    .line 72
    :cond_4
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 73
    .line 74
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_5

    .line 79
    .line 80
    instance-of v0, p1, Ljava/lang/Byte;

    .line 81
    .line 82
    if-nez v0, :cond_15

    .line 83
    .line 84
    :cond_5
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 85
    .line 86
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_6

    .line 91
    .line 92
    instance-of v0, p1, Ljava/lang/Short;

    .line 93
    .line 94
    if-nez v0, :cond_15

    .line 95
    .line 96
    :cond_6
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 97
    .line 98
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-eqz v0, :cond_7

    .line 103
    .line 104
    instance-of v0, p1, Ljava/lang/Character;

    .line 105
    .line 106
    if-nez v0, :cond_15

    .line 107
    .line 108
    :cond_7
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 109
    .line 110
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-eqz v0, :cond_8

    .line 115
    .line 116
    instance-of v0, p1, Ljava/lang/Integer;

    .line 117
    .line 118
    if-nez v0, :cond_15

    .line 119
    .line 120
    :cond_8
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 121
    .line 122
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-eqz v0, :cond_9

    .line 127
    .line 128
    instance-of v0, p1, Ljava/lang/Long;

    .line 129
    .line 130
    if-nez v0, :cond_15

    .line 131
    .line 132
    :cond_9
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 133
    .line 134
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-eqz v0, :cond_a

    .line 139
    .line 140
    instance-of v0, p1, Ljava/lang/Float;

    .line 141
    .line 142
    if-nez v0, :cond_15

    .line 143
    .line 144
    :cond_a
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 145
    .line 146
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    if-eqz v0, :cond_b

    .line 151
    .line 152
    instance-of v0, p1, Ljava/lang/Double;

    .line 153
    .line 154
    if-nez v0, :cond_15

    .line 155
    .line 156
    :cond_b
    const-class v0, [Ljava/lang/String;

    .line 157
    .line 158
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    if-eqz v0, :cond_c

    .line 163
    .line 164
    instance-of v0, p1, [Ljava/lang/String;

    .line 165
    .line 166
    if-nez v0, :cond_15

    .line 167
    .line 168
    :cond_c
    const-class v0, [Z

    .line 169
    .line 170
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    if-eqz v0, :cond_d

    .line 175
    .line 176
    instance-of v0, p1, [Z

    .line 177
    .line 178
    if-nez v0, :cond_15

    .line 179
    .line 180
    :cond_d
    const-class v0, [B

    .line 181
    .line 182
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    if-eqz v0, :cond_e

    .line 187
    .line 188
    instance-of v0, p1, [B

    .line 189
    .line 190
    if-nez v0, :cond_15

    .line 191
    .line 192
    :cond_e
    const-class v0, [S

    .line 193
    .line 194
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    if-eqz v0, :cond_f

    .line 199
    .line 200
    instance-of v0, p1, [S

    .line 201
    .line 202
    if-nez v0, :cond_15

    .line 203
    .line 204
    :cond_f
    const-class v0, [C

    .line 205
    .line 206
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    if-eqz v0, :cond_10

    .line 211
    .line 212
    instance-of v0, p1, [C

    .line 213
    .line 214
    if-nez v0, :cond_15

    .line 215
    .line 216
    :cond_10
    const-class v0, [I

    .line 217
    .line 218
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    if-eqz v0, :cond_11

    .line 223
    .line 224
    instance-of v0, p1, [I

    .line 225
    .line 226
    if-nez v0, :cond_15

    .line 227
    .line 228
    :cond_11
    const-class v0, [J

    .line 229
    .line 230
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    if-eqz v0, :cond_12

    .line 235
    .line 236
    instance-of v0, p1, [J

    .line 237
    .line 238
    if-nez v0, :cond_15

    .line 239
    .line 240
    :cond_12
    const-class v0, [F

    .line 241
    .line 242
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 243
    .line 244
    .line 245
    move-result v0

    .line 246
    if-eqz v0, :cond_13

    .line 247
    .line 248
    instance-of v0, p1, [F

    .line 249
    .line 250
    if-nez v0, :cond_15

    .line 251
    .line 252
    :cond_13
    const-class v0, [D

    .line 253
    .line 254
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 255
    .line 256
    .line 257
    move-result v0

    .line 258
    if-eqz v0, :cond_14

    .line 259
    .line 260
    instance-of v0, p1, [D

    .line 261
    .line 262
    if-nez v0, :cond_15

    .line 263
    .line 264
    :cond_14
    const-class v0, [Ljava/lang/Class;

    .line 265
    .line 266
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 267
    .line 268
    .line 269
    move-result v0

    .line 270
    if-eqz v0, :cond_16

    .line 271
    .line 272
    instance-of v0, p1, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 273
    .line 274
    if-eqz v0, :cond_16

    .line 275
    .line 276
    :cond_15
    return v1

    .line 277
    :cond_16
    const-class v0, [Ljava/lang/annotation/Annotation;

    .line 278
    .line 279
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->isAssignableTo(Ljava/lang/Class;)Z

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    const/4 v2, 0x0

    .line 284
    if-eqz v0, :cond_19

    .line 285
    .line 286
    instance-of v0, p1, [Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 287
    .line 288
    if-eqz v0, :cond_19

    .line 289
    .line 290
    check-cast p1, [Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 291
    .line 292
    check-cast p1, [Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 293
    .line 294
    array-length v0, p1

    .line 295
    move v3, v2

    .line 296
    :goto_0
    if-ge v3, v0, :cond_18

    .line 297
    .line 298
    aget-object v4, p1, v3

    .line 299
    .line 300
    invoke-interface {v4}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getAnnotationType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 301
    .line 302
    .line 303
    move-result-object v4

    .line 304
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription;->getComponentType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 305
    .line 306
    .line 307
    move-result-object v5

    .line 308
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    move-result v4

    .line 312
    if-nez v4, :cond_17

    .line 313
    .line 314
    return v2

    .line 315
    :cond_17
    add-int/lit8 v3, v3, 0x1

    .line 316
    .line 317
    goto :goto_0

    .line 318
    :cond_18
    return v1

    .line 319
    :cond_19
    const-class v0, [Ljava/lang/Enum;

    .line 320
    .line 321
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->isAssignableTo(Ljava/lang/Class;)Z

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    if-eqz v0, :cond_1c

    .line 326
    .line 327
    instance-of v0, p1, [Lnet/bytebuddy/description/enumeration/EnumerationDescription;

    .line 328
    .line 329
    if-eqz v0, :cond_1c

    .line 330
    .line 331
    check-cast p1, [Lnet/bytebuddy/description/enumeration/EnumerationDescription;

    .line 332
    .line 333
    check-cast p1, [Lnet/bytebuddy/description/enumeration/EnumerationDescription;

    .line 334
    .line 335
    array-length v0, p1

    .line 336
    move v3, v2

    .line 337
    :goto_1
    if-ge v3, v0, :cond_1b

    .line 338
    .line 339
    aget-object v4, p1, v3

    .line 340
    .line 341
    invoke-interface {v4}, Lnet/bytebuddy/description/enumeration/EnumerationDescription;->getEnumerationType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 342
    .line 343
    .line 344
    move-result-object v4

    .line 345
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription;->getComponentType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 346
    .line 347
    .line 348
    move-result-object v5

    .line 349
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    move-result v4

    .line 353
    if-nez v4, :cond_1a

    .line 354
    .line 355
    return v2

    .line 356
    :cond_1a
    add-int/lit8 v3, v3, 0x1

    .line 357
    .line 358
    goto :goto_1

    .line 359
    :cond_1b
    return v1

    .line 360
    :cond_1c
    return v2
.end method

.method public isAssignableFrom(Ljava/lang/Class;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->isAssignableFrom(Lnet/bytebuddy/description/type/TypeDescription;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public isAssignableFrom(Lnet/bytebuddy/description/type/TypeDescription;)Z
    .locals 0

    .line 10
    invoke-static {p0, p1}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->isAssignable(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription;)Z

    move-result p0

    return p0
.end method

.method public isAssignableTo(Ljava/lang/Class;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->isAssignableTo(Lnet/bytebuddy/description/type/TypeDescription;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public isAssignableTo(Lnet/bytebuddy/description/type/TypeDescription;)Z
    .locals 0

    .line 10
    invoke-static {p1, p0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->isAssignable(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription;)Z

    move-result p0

    return p0
.end method

.method public isCompileTimeConstant()Z
    .locals 1

    .line 1
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    const-class v0, Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    const-class v0, Ljava/lang/Class;

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_1

    .line 48
    .line 49
    sget-object v0, Lnet/bytebuddy/utility/JavaType;->METHOD_TYPE:Lnet/bytebuddy/utility/JavaType;

    .line 50
    .line 51
    invoke-virtual {v0}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_1

    .line 60
    .line 61
    sget-object v0, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLE:Lnet/bytebuddy/utility/JavaType;

    .line 62
    .line 63
    invoke-virtual {v0}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    if-eqz p0, :cond_0

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    const/4 p0, 0x0

    .line 75
    return p0

    .line 76
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 77
    return p0
.end method

.method public isGenerified()Z
    .locals 2

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/TypeVariableSource;->getTypeVariables()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    invoke-virtual {p0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->isStatic()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-interface {v0}, Lnet/bytebuddy/description/TypeVariableSource;->isGenerified()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    return v1

    .line 32
    :cond_1
    const/4 v0, 0x0

    .line 33
    :try_start_0
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription;->getEnclosingMethod()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    if-eqz p0, :cond_2

    .line 38
    .line 39
    invoke-interface {p0}, Lnet/bytebuddy/description/TypeVariableSource;->isGenerified()Z

    .line 40
    .line 41
    .line 42
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    if-eqz p0, :cond_2

    .line 44
    .line 45
    return v1

    .line 46
    :catchall_0
    :cond_2
    return v0
.end method

.method public isInHierarchyWith(Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->isAssignableTo(Ljava/lang/Class;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 17
    return p0
.end method

.method public isInHierarchyWith(Lnet/bytebuddy/description/type/TypeDescription;)Z
    .locals 1

    .line 18
    invoke-virtual {p0, p1}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->isAssignableTo(Lnet/bytebuddy/description/type/TypeDescription;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->isAssignableFrom(Lnet/bytebuddy/description/type/TypeDescription;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public isInferrable()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public isInnerClass()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->isStatic()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->isNestedClass()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public isInstance(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public isMemberType()Z
    .locals 1

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription;->isLocalType()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription;->isAnonymousType()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public isModuleType()Z
    .locals 1

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "module-info"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public isNestHost()Z
    .locals 1

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription;->getNestHost()Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public isNestMateOf(Ljava/lang/Class;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 14
    invoke-static {p1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->isNestMateOf(Lnet/bytebuddy/description/type/TypeDescription;)Z

    move-result p0

    return p0
.end method

.method public isNestMateOf(Lnet/bytebuddy/description/type/TypeDescription;)Z
    .locals 0

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription;->getNestHost()Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDescription;->getNestHost()Lnet/bytebuddy/description/type/TypeDescription;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public isNestedClass()Z
    .locals 0

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public isPackageType()Z
    .locals 1

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription;->getSimpleName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "package-info"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public isPrimitiveWrapper()Z
    .locals 1

    .line 1
    const-class v0, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const-class v0, Ljava/lang/Byte;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    const-class v0, Ljava/lang/Short;

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    const-class v0, Ljava/lang/Character;

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    const-class v0, Ljava/lang/Integer;

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    const-class v0, Ljava/lang/Long;

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_1

    .line 48
    .line 49
    const-class v0, Ljava/lang/Float;

    .line 50
    .line 51
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_1

    .line 56
    .line 57
    const-class v0, Ljava/lang/Double;

    .line 58
    .line 59
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-eqz p0, :cond_0

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    const/4 p0, 0x0

    .line 67
    return p0

    .line 68
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 69
    return p0
.end method

.method public isSamePackage(Lnet/bytebuddy/description/type/TypeDescription;)Z
    .locals 0

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription;->getPackage()Lnet/bytebuddy/description/type/PackageDescription;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDescription;->getPackage()Lnet/bytebuddy/description/type/PackageDescription;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0

    .line 19
    :cond_1
    :goto_0
    if-ne p0, p1, :cond_2

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_2
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public isSealed()Z
    .locals 1

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->isPrimitive()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->isArray()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription;->getPermittedSubtypes()Lnet/bytebuddy/description/type/TypeList;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-nez p0, :cond_0

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    return p0
.end method

.method public isVisibleTo(Lnet/bytebuddy/description/type/TypeDescription;)Z
    .locals 1

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->isPrimitive()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->isArray()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription;->getComponentType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-interface {p0, p1}, Lnet/bytebuddy/description/ByteCodeElement;->isVisibleTo(Lnet/bytebuddy/description/type/TypeDescription;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->isPublic()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_2

    .line 29
    .line 30
    invoke-virtual {p0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->isProtected()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_2

    .line 35
    .line 36
    invoke-virtual {p0, p1}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->isSamePackage(Lnet/bytebuddy/description/type/TypeDescription;)Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-eqz p0, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/4 p0, 0x0

    .line 44
    return p0

    .line 45
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 46
    return p0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/description/type/TypeDefinition$SuperClassIterator;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lnet/bytebuddy/description/type/TypeDefinition$SuperClassIterator;-><init>(Lnet/bytebuddy/description/type/TypeDefinition;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public represents(Ljava/lang/reflect/Type;)Z
    .locals 0

    .line 1
    invoke-static {p1}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->describe(Ljava/lang/reflect/Type;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public toSafeString()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->isPrimitive()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    const-string v1, ""

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    invoke-virtual {p0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->isInterface()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    const-string v1, "interface"

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const-string v1, "class"

    .line 25
    .line 26
    :goto_0
    const-string v2, " "

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-interface {p0}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0
.end method
