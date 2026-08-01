.class public Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;
.super Lnet/bytebuddy/dynamic/loading/ClassInjector$AbstractBase;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/loading/ClassInjector;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "UsingReflection"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$System;,
        Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final ACCESS_CONTROLLER:Z

.field private static final CHECK_PERMISSION:Ljava/lang/reflect/Method;

.field private static final DISPATCHER:Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$Initializable;

.field private static final SYSTEM:Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$System;


# instance fields
.field private final classLoader:Ljava/lang/ClassLoader;

.field private final forbidExisting:Z

.field private final packageDefinitionStrategy:Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy;

.field private final protectionDomain:Ljava/security/ProtectionDomain;
    .annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling;
        value = .enum Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;->REVERSE_NULLABILITY:Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

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
    sput-boolean v1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;->ACCESS_CONTROLLER:Z
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    const/4 v0, 0x1

    .line 24
    :catch_1
    sput-boolean v0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;->ACCESS_CONTROLLER:Z

    .line 25
    .line 26
    :goto_0
    sget-object v0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$CreationAction;->INSTANCE:Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$CreationAction;

    .line 27
    .line 28
    invoke-static {v0}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$Initializable;

    .line 33
    .line 34
    sput-object v0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;->DISPATCHER:Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$Initializable;

    .line 35
    .line 36
    const-class v0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$System;

    .line 37
    .line 38
    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$System;

    .line 47
    .line 48
    sput-object v0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;->SYSTEM:Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$System;

    .line 49
    .line 50
    new-instance v0, Lnet/bytebuddy/utility/privilege/GetMethodAction;

    .line 51
    .line 52
    const-class v1, Ljava/security/Permission;

    .line 53
    .line 54
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    const-string v2, "java.lang.SecurityManager"

    .line 59
    .line 60
    const-string v3, "checkPermission"

    .line 61
    .line 62
    invoke-direct {v0, v2, v3, v1}, Lnet/bytebuddy/utility/privilege/GetMethodAction;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 63
    .line 64
    .line 65
    invoke-static {v0}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    check-cast v0, Ljava/lang/reflect/Method;

    .line 70
    .line 71
    sput-object v0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;->CHECK_PERMISSION:Ljava/lang/reflect/Method;

    .line 72
    .line 73
    return-void
.end method

.method public constructor <init>(Ljava/lang/ClassLoader;)V
    .locals 1

    .line 23
    sget-object v0, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy;->NO_PROTECTION_DOMAIN:Ljava/security/ProtectionDomain;

    invoke-direct {p0, p1, v0}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;-><init>(Ljava/lang/ClassLoader;Ljava/security/ProtectionDomain;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/ClassLoader;Ljava/security/ProtectionDomain;)V
    .locals 2
    .param p2    # Ljava/security/ProtectionDomain;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 22
    sget-object v0, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Trivial;->INSTANCE:Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Trivial;

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;-><init>(Ljava/lang/ClassLoader;Ljava/security/ProtectionDomain;Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/ClassLoader;Ljava/security/ProtectionDomain;Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy;Z)V
    .locals 0
    .param p2    # Ljava/security/ProtectionDomain;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/dynamic/loading/ClassInjector$AbstractBase;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iput-object p1, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;->classLoader:Ljava/lang/ClassLoader;

    .line 7
    .line 8
    iput-object p2, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;->protectionDomain:Ljava/security/ProtectionDomain;

    .line 9
    .line 10
    iput-object p3, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;->packageDefinitionStrategy:Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy;

    .line 11
    .line 12
    iput-boolean p4, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;->forbidExisting:Z

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const-string p0, "Cannot inject classes into the bootstrap class loader"

    .line 16
    .line 17
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    throw p0
.end method

.method public static synthetic access$000()Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$System;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;->SYSTEM:Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$System;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$100()Ljava/lang/reflect/Method;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;->CHECK_PERMISSION:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    return-object v0
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
    sget-boolean v0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;->ACCESS_CONTROLLER:Z

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

.method public static isAvailable()Z
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;->DISPATCHER:Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$Initializable;

    .line 2
    .line 3
    invoke-interface {v0}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$Initializable;->isAvailable()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static ofSystemClassLoader()Lnet/bytebuddy/dynamic/loading/ClassInjector;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;-><init>(Ljava/lang/ClassLoader;)V

    .line 8
    .line 9
    .line 10
    return-object v0
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
    iget-boolean v2, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;->forbidExisting:Z

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;

    .line 23
    .line 24
    iget-boolean v3, p1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;->forbidExisting:Z

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;->classLoader:Ljava/lang/ClassLoader;

    .line 30
    .line 31
    iget-object v3, p1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;->classLoader:Ljava/lang/ClassLoader;

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
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;->protectionDomain:Ljava/security/ProtectionDomain;

    .line 41
    .line 42
    iget-object v3, p1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;->protectionDomain:Ljava/security/ProtectionDomain;

    .line 43
    .line 44
    if-eqz v3, :cond_5

    .line 45
    .line 46
    if-eqz v2, :cond_6

    .line 47
    .line 48
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-nez v2, :cond_7

    .line 53
    .line 54
    return v1

    .line 55
    :cond_5
    if-eqz v2, :cond_7

    .line 56
    .line 57
    :cond_6
    return v1

    .line 58
    :cond_7
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;->packageDefinitionStrategy:Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy;

    .line 59
    .line 60
    iget-object p1, p1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;->packageDefinitionStrategy:Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy;

    .line 61
    .line 62
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-nez p0, :cond_8

    .line 67
    .line 68
    return v1

    .line 69
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
    iget-object v1, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;->classLoader:Ljava/lang/ClassLoader;

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
    iget-object v0, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;->protectionDomain:Ljava/security/ProtectionDomain;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    add-int/2addr v1, v0

    .line 29
    :cond_0
    mul-int/lit8 v1, v1, 0x1f

    .line 30
    .line 31
    iget-object v0, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;->packageDefinitionStrategy:Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    add-int/2addr v0, v1

    .line 38
    mul-int/lit8 v0, v0, 0x1f

    .line 39
    .line 40
    iget-boolean p0, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;->forbidExisting:Z

    .line 41
    .line 42
    add-int/2addr v0, p0

    .line 43
    return v0
.end method

.method public injectRaw(Ljava/util/Set;Lnet/bytebuddy/dynamic/ClassFileLocator;)Ljava/util/Map;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lnet/bytebuddy/dynamic/ClassFileLocator;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;->DISPATCHER:Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$Initializable;

    .line 4
    .line 5
    invoke-interface {v0}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$Initializable;->initialize()Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    new-instance v12, Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-direct {v12}, Ljava/util/HashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-interface/range {p1 .. p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v13

    .line 18
    :goto_0
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_7

    .line 23
    .line 24
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    move-object v14, v0

    .line 29
    check-cast v14, Ljava/lang/String;

    .line 30
    .line 31
    iget-object v0, v1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;->classLoader:Ljava/lang/ClassLoader;

    .line 32
    .line 33
    invoke-interface {v2, v0, v14}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher;->getClassLoadingLock(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v15

    .line 37
    monitor-enter v15

    .line 38
    :try_start_0
    iget-object v0, v1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;->classLoader:Ljava/lang/ClassLoader;

    .line 39
    .line 40
    invoke-interface {v2, v0, v14}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher;->findClass(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-nez v0, :cond_5

    .line 45
    .line 46
    const/16 v0, 0x2e

    .line 47
    .line 48
    invoke-virtual {v14, v0}, Ljava/lang/String;->lastIndexOf(I)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    const/4 v3, -0x1

    .line 53
    if-eq v0, v3, :cond_4

    .line 54
    .line 55
    const/4 v3, 0x0

    .line 56
    invoke-virtual {v14, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    iget-object v0, v1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;->packageDefinitionStrategy:Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy;

    .line 61
    .line 62
    iget-object v3, v1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;->classLoader:Ljava/lang/ClassLoader;

    .line 63
    .line 64
    invoke-interface {v0, v3, v4, v14}, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy;->define(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;)Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-interface {v3}, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition;->isDefined()Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_4

    .line 73
    .line 74
    iget-object v0, v1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;->classLoader:Ljava/lang/ClassLoader;

    .line 75
    .line 76
    invoke-interface {v2, v0, v4}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher;->getDefinedPackage(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Package;

    .line 77
    .line 78
    .line 79
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    if-nez v0, :cond_2

    .line 81
    .line 82
    move-object v5, v3

    .line 83
    :try_start_1
    iget-object v3, v1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;->classLoader:Ljava/lang/ClassLoader;
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_8
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 84
    .line 85
    move-object v6, v5

    .line 86
    :try_start_2
    invoke-interface {v6}, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition;->getSpecificationTitle()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v5
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_7
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 90
    move-object v7, v6

    .line 91
    :try_start_3
    invoke-interface {v7}, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition;->getSpecificationVersion()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v6
    :try_end_3
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_6
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 95
    move-object v8, v7

    .line 96
    :try_start_4
    invoke-interface {v8}, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition;->getSpecificationVendor()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v7
    :try_end_4
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_5
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 100
    move-object v9, v8

    .line 101
    :try_start_5
    invoke-interface {v9}, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition;->getImplementationTitle()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v8
    :try_end_5
    .catch Ljava/lang/IllegalStateException; {:try_start_5 .. :try_end_5} :catch_4
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 105
    move-object v10, v9

    .line 106
    :try_start_6
    invoke-interface {v10}, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition;->getImplementationVersion()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v9
    :try_end_6
    .catch Ljava/lang/IllegalStateException; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 110
    move-object v11, v10

    .line 111
    :try_start_7
    invoke-interface {v11}, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition;->getImplementationVendor()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v10
    :try_end_7
    .catch Ljava/lang/IllegalStateException; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 115
    move-object/from16 v16, v11

    .line 116
    .line 117
    :try_start_8
    invoke-interface/range {v16 .. v16}, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition;->getSealBase()Ljava/net/URL;

    .line 118
    .line 119
    .line 120
    move-result-object v11
    :try_end_8
    .catch Ljava/lang/IllegalStateException; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 121
    move-object/from16 p1, v13

    .line 122
    .line 123
    move-object/from16 v13, v16

    .line 124
    .line 125
    :try_start_9
    invoke-interface/range {v2 .. v11}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher;->definePackage(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URL;)Ljava/lang/Package;
    :try_end_9
    .catch Ljava/lang/IllegalStateException; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 126
    .line 127
    .line 128
    goto/16 :goto_2

    .line 129
    .line 130
    :catchall_0
    move-exception v0

    .line 131
    goto/16 :goto_4

    .line 132
    .line 133
    :catch_0
    move-exception v0

    .line 134
    goto :goto_1

    .line 135
    :catch_1
    move-exception v0

    .line 136
    move-object/from16 p1, v13

    .line 137
    .line 138
    move-object/from16 v13, v16

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :catch_2
    move-exception v0

    .line 142
    move-object/from16 p1, v13

    .line 143
    .line 144
    move-object v13, v11

    .line 145
    goto :goto_1

    .line 146
    :catch_3
    move-exception v0

    .line 147
    move-object/from16 p1, v13

    .line 148
    .line 149
    move-object v13, v10

    .line 150
    goto :goto_1

    .line 151
    :catch_4
    move-exception v0

    .line 152
    move-object/from16 p1, v13

    .line 153
    .line 154
    move-object v13, v9

    .line 155
    goto :goto_1

    .line 156
    :catch_5
    move-exception v0

    .line 157
    move-object/from16 p1, v13

    .line 158
    .line 159
    move-object v13, v8

    .line 160
    goto :goto_1

    .line 161
    :catch_6
    move-exception v0

    .line 162
    move-object/from16 p1, v13

    .line 163
    .line 164
    move-object v13, v7

    .line 165
    goto :goto_1

    .line 166
    :catch_7
    move-exception v0

    .line 167
    move-object/from16 p1, v13

    .line 168
    .line 169
    move-object v13, v6

    .line 170
    goto :goto_1

    .line 171
    :catch_8
    move-exception v0

    .line 172
    move-object/from16 p1, v13

    .line 173
    .line 174
    move-object v13, v5

    .line 175
    :goto_1
    :try_start_a
    iget-object v3, v1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;->classLoader:Ljava/lang/ClassLoader;

    .line 176
    .line 177
    invoke-interface {v2, v3, v4}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher;->getPackage(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Package;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    if-eqz v3, :cond_1

    .line 182
    .line 183
    invoke-interface {v13, v3}, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition;->isCompatibleTo(Ljava/lang/Package;)Z

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    if-eqz v0, :cond_0

    .line 188
    .line 189
    goto :goto_2

    .line 190
    :cond_0
    new-instance v0, Ljava/lang/SecurityException;

    .line 191
    .line 192
    new-instance v1, Ljava/lang/StringBuilder;

    .line 193
    .line 194
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 195
    .line 196
    .line 197
    const-string v2, "Sealing violation for package "

    .line 198
    .line 199
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    const-string v2, " (getPackage fallback)"

    .line 206
    .line 207
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    invoke-direct {v0, v1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    throw v0

    .line 218
    :cond_1
    throw v0

    .line 219
    :cond_2
    move-object/from16 p1, v13

    .line 220
    .line 221
    move-object v13, v3

    .line 222
    invoke-interface {v13, v0}, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition;->isCompatibleTo(Ljava/lang/Package;)Z

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    if-eqz v0, :cond_3

    .line 227
    .line 228
    goto :goto_2

    .line 229
    :cond_3
    new-instance v0, Ljava/lang/SecurityException;

    .line 230
    .line 231
    new-instance v1, Ljava/lang/StringBuilder;

    .line 232
    .line 233
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 234
    .line 235
    .line 236
    const-string v2, "Sealing violation for package "

    .line 237
    .line 238
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    invoke-direct {v0, v1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 252
    :cond_4
    move-object/from16 p1, v13

    .line 253
    .line 254
    :goto_2
    :try_start_b
    iget-object v0, v1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;->classLoader:Ljava/lang/ClassLoader;

    .line 255
    .line 256
    move-object/from16 v3, p2

    .line 257
    .line 258
    invoke-interface {v3, v14}, Lnet/bytebuddy/dynamic/ClassFileLocator;->locate(Ljava/lang/String;)Lnet/bytebuddy/dynamic/ClassFileLocator$Resolution;

    .line 259
    .line 260
    .line 261
    move-result-object v4

    .line 262
    invoke-interface {v4}, Lnet/bytebuddy/dynamic/ClassFileLocator$Resolution;->resolve()[B

    .line 263
    .line 264
    .line 265
    move-result-object v4

    .line 266
    iget-object v5, v1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;->protectionDomain:Ljava/security/ProtectionDomain;

    .line 267
    .line 268
    invoke-interface {v2, v0, v14, v4, v5}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher;->defineClass(Ljava/lang/ClassLoader;Ljava/lang/String;[BLjava/security/ProtectionDomain;)Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    move-result-object v0
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_9
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 272
    goto :goto_3

    .line 273
    :catch_9
    move-exception v0

    .line 274
    :try_start_c
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 275
    .line 276
    new-instance v2, Ljava/lang/StringBuilder;

    .line 277
    .line 278
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 279
    .line 280
    .line 281
    const-string v3, "Could not resolve type description for "

    .line 282
    .line 283
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v2

    .line 293
    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 294
    .line 295
    .line 296
    throw v1

    .line 297
    :cond_5
    move-object/from16 v3, p2

    .line 298
    .line 299
    move-object/from16 p1, v13

    .line 300
    .line 301
    iget-boolean v4, v1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;->forbidExisting:Z

    .line 302
    .line 303
    if-nez v4, :cond_6

    .line 304
    .line 305
    :goto_3
    invoke-virtual {v12, v14, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    monitor-exit v15

    .line 309
    move-object/from16 v13, p1

    .line 310
    .line 311
    goto/16 :goto_0

    .line 312
    .line 313
    :cond_6
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 314
    .line 315
    new-instance v2, Ljava/lang/StringBuilder;

    .line 316
    .line 317
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 318
    .line 319
    .line 320
    const-string v3, "Cannot inject already loaded type: "

    .line 321
    .line 322
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    throw v1

    .line 336
    :goto_4
    monitor-exit v15
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 337
    throw v0

    .line 338
    :cond_7
    return-object v12
.end method

.method public isAlive()Z
    .locals 0

    .line 1
    invoke-static {}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;->isAvailable()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method
