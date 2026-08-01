.class public Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;
.super Lnet/bytebuddy/dynamic/loading/InjectionClassLoader;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$SingletonEnumeration;,
        Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$EmptyEnumeration;,
        Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ChildFirst;,
        Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;,
        Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PackageLookupStrategy;,
        Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ClassDefinitionAction;,
        Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$SynchronizationStrategy;
    }
.end annotation


# static fields
.field private static final ACCESS_CONTROLLER:Z

.field private static final FROM_BEGINNING:I = 0x0

.field private static final NO_URL:Ljava/net/URL;
    .annotation runtime Lnet/bytebuddy/utility/nullability/AlwaysNull;
    .end annotation
.end field

.field private static final PACKAGE_LOOKUP_STRATEGY:Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PackageLookupStrategy;

.field protected static final SYNCHRONIZATION_STRATEGY:Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$SynchronizationStrategy$Initializable;

.field public static final URL_SCHEMA:Ljava/lang/String; = "bytebuddy"


# instance fields
.field protected final accessControlContext:Ljava/lang/Object;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field protected final classFilePostProcessor:Lnet/bytebuddy/dynamic/loading/ClassFilePostProcessor;

.field protected final packageDefinitionStrategy:Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy;

.field protected final persistenceHandler:Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;

.field protected final protectionDomain:Ljava/security/ProtectionDomain;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field protected final typeDefinitions:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljava/lang/String;",
            "[B>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    const-string v2, "java.security.AccessController"

    .line 4
    .line 5
    invoke-static {v2, v1, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string v2, "net.bytebuddy.securitymanager"

    .line 9
    .line 10
    const-string v3, "true"

    .line 11
    .line 12
    invoke-static {v2, v3}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-static {v2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    sput-boolean v2, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->ACCESS_CONTROLLER:Z
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
    :catch_1
    sput-boolean v1, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->ACCESS_CONTROLLER:Z

    .line 25
    .line 26
    :goto_0
    sput-object v0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->NO_URL:Ljava/net/URL;

    .line 27
    .line 28
    sget-object v0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PackageLookupStrategy$CreationAction;->INSTANCE:Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PackageLookupStrategy$CreationAction;

    .line 29
    .line 30
    invoke-static {v0}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PackageLookupStrategy;

    .line 35
    .line 36
    sput-object v0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->PACKAGE_LOOKUP_STRATEGY:Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PackageLookupStrategy;

    .line 37
    .line 38
    sget-object v0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$SynchronizationStrategy$CreationAction;->INSTANCE:Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$SynchronizationStrategy$CreationAction;

    .line 39
    .line 40
    invoke-static {v0}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$SynchronizationStrategy$Initializable;

    .line 45
    .line 46
    sput-object v0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->SYNCHRONIZATION_STRATEGY:Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$SynchronizationStrategy$Initializable;

    .line 47
    .line 48
    invoke-static {}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->doRegisterAsParallelCapable()V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>(Ljava/lang/ClassLoader;Ljava/util/Map;)V
    .locals 1
    .param p1    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "[B>;)V"
        }
    .end annotation

    const/4 v0, 0x1

    .line 32
    invoke-direct {p0, p1, v0, p2}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;-><init>(Ljava/lang/ClassLoader;ZLjava/util/Map;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/ClassLoader;Ljava/util/Map;Ljava/security/ProtectionDomain;Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy;)V
    .locals 7
    .param p1    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p3    # Ljava/security/ProtectionDomain;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "[B>;",
            "Ljava/security/ProtectionDomain;",
            "Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;",
            "Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy;",
            ")V"
        }
    .end annotation

    const/4 v2, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    .line 29
    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;-><init>(Ljava/lang/ClassLoader;ZLjava/util/Map;Ljava/security/ProtectionDomain;Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/ClassLoader;Ljava/util/Map;Ljava/security/ProtectionDomain;Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy;Lnet/bytebuddy/dynamic/loading/ClassFilePostProcessor;)V
    .locals 8
    .param p1    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p3    # Ljava/security/ProtectionDomain;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "[B>;",
            "Ljava/security/ProtectionDomain;",
            "Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;",
            "Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy;",
            "Lnet/bytebuddy/dynamic/loading/ClassFilePostProcessor;",
            ")V"
        }
    .end annotation

    const/4 v2, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    .line 31
    invoke-direct/range {v0 .. v7}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;-><init>(Ljava/lang/ClassLoader;ZLjava/util/Map;Ljava/security/ProtectionDomain;Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy;Lnet/bytebuddy/dynamic/loading/ClassFilePostProcessor;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/ClassLoader;Ljava/util/Map;Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;)V
    .locals 1
    .param p1    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "[B>;",
            "Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x1

    .line 27
    invoke-direct {p0, p1, v0, p2, p3}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;-><init>(Ljava/lang/ClassLoader;ZLjava/util/Map;Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/ClassLoader;ZLjava/util/Map;)V
    .locals 1
    .param p1    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Z",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "[B>;)V"
        }
    .end annotation

    .line 26
    sget-object v0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;->LATENT:Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;

    invoke-direct {p0, p1, p2, p3, v0}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;-><init>(Ljava/lang/ClassLoader;ZLjava/util/Map;Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/ClassLoader;ZLjava/util/Map;Ljava/security/ProtectionDomain;Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy;)V
    .locals 8
    .param p1    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p4    # Ljava/security/ProtectionDomain;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Z",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "[B>;",
            "Ljava/security/ProtectionDomain;",
            "Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;",
            "Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy;",
            ")V"
        }
    .end annotation

    .line 30
    sget-object v7, Lnet/bytebuddy/dynamic/loading/ClassFilePostProcessor$NoOp;->INSTANCE:Lnet/bytebuddy/dynamic/loading/ClassFilePostProcessor$NoOp;

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v7}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;-><init>(Ljava/lang/ClassLoader;ZLjava/util/Map;Ljava/security/ProtectionDomain;Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy;Lnet/bytebuddy/dynamic/loading/ClassFilePostProcessor;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/ClassLoader;ZLjava/util/Map;Ljava/security/ProtectionDomain;Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy;Lnet/bytebuddy/dynamic/loading/ClassFilePostProcessor;)V
    .locals 0
    .param p1    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p4    # Ljava/security/ProtectionDomain;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Z",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "[B>;",
            "Ljava/security/ProtectionDomain;",
            "Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;",
            "Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy;",
            "Lnet/bytebuddy/dynamic/loading/ClassFilePostProcessor;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/dynamic/loading/InjectionClassLoader;-><init>(Ljava/lang/ClassLoader;Z)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {p1, p3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(Ljava/util/Map;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->typeDefinitions:Ljava/util/concurrent/ConcurrentMap;

    .line 10
    .line 11
    iput-object p4, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->protectionDomain:Ljava/security/ProtectionDomain;

    .line 12
    .line 13
    iput-object p5, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->persistenceHandler:Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;

    .line 14
    .line 15
    iput-object p6, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->packageDefinitionStrategy:Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy;

    .line 16
    .line 17
    iput-object p7, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->classFilePostProcessor:Lnet/bytebuddy/dynamic/loading/ClassFilePostProcessor;

    .line 18
    .line 19
    invoke-static {}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->getContext()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->accessControlContext:Ljava/lang/Object;

    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>(Ljava/lang/ClassLoader;ZLjava/util/Map;Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;)V
    .locals 7
    .param p1    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Z",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "[B>;",
            "Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;",
            ")V"
        }
    .end annotation

    .line 28
    sget-object v4, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy;->NO_PROTECTION_DOMAIN:Ljava/security/ProtectionDomain;

    sget-object v6, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Trivial;->INSTANCE:Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Trivial;

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;-><init>(Ljava/lang/ClassLoader;ZLjava/util/Map;Ljava/security/ProtectionDomain;Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy;)V

    return-void
.end method

.method public static synthetic access$000()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->methodHandle()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic access$100()Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PackageLookupStrategy;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->PACKAGE_LOOKUP_STRATEGY:Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PackageLookupStrategy;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$200(Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URL;)Ljava/lang/Package;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p8}, Ljava/lang/ClassLoader;->definePackage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URL;)Ljava/lang/Package;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic access$300(Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;Ljava/lang/String;[BIILjava/security/ProtectionDomain;)Ljava/lang/Class;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p5}, Ljava/lang/ClassLoader;->defineClass(Ljava/lang/String;[BIILjava/security/ProtectionDomain;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic access$400(Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;Ljava/lang/String;)Ljava/lang/Package;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->doGetPackage(Ljava/lang/String;)Ljava/lang/Package;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic access$600()Ljava/net/URL;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->NO_URL:Ljava/net/URL;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$700(Ljava/security/PrivilegedAction;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private doGetPackage(Ljava/lang/String;)Ljava/lang/Package;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Ljava/lang/ClassLoader;->getPackage(Ljava/lang/String;)Ljava/lang/Package;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

    sget-boolean v0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->ACCESS_CONTROLLER:Z

    if-eqz v0, :cond_0

    invoke-static {p0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 17
    :cond_0
    invoke-interface {p0}, Ljava/security/PrivilegedAction;->run()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static doPrivileged(Ljava/security/PrivilegedAction;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/security/PrivilegedAction<",
            "TT;>;",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/build/AccessControllerPlugin$Enhance;
    .end annotation

    .line 1
    sget-boolean v0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->ACCESS_CONTROLLER:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Ljava/security/AccessControlContext;

    .line 6
    .line 7
    invoke-static {p0, p1}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;Ljava/security/AccessControlContext;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-interface {p0}, Ljava/security/PrivilegedAction;->run()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method private static doRegisterAsParallelCapable()V
    .locals 3

    .line 1
    :try_start_0
    const-class v0, Ljava/lang/ClassLoader;

    .line 2
    .line 3
    const-string v1, "registerAsParallelCapable"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    :catchall_0
    return-void
.end method

.method private static getContext()Ljava/lang/Object;
    .locals 1
    .annotation runtime Lnet/bytebuddy/build/AccessControllerPlugin$Enhance;
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    sget-boolean v0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->ACCESS_CONTROLLER:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Ljava/security/AccessController;->getContext()Ljava/security/AccessControlContext;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public static load(Ljava/lang/ClassLoader;Ljava/util/Map;)Ljava/util/Map;
    .locals 7
    .param p0    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Ljava/util/Map<",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "[B>;)",
            "Ljava/util/Map<",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    .line 167
    sget-object v2, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy;->NO_PROTECTION_DOMAIN:Ljava/security/ProtectionDomain;

    sget-object v3, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;->LATENT:Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;

    sget-object v4, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Trivial;->INSTANCE:Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Trivial;

    const/4 v5, 0x0

    const/4 v6, 0x1

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v6}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->load(Ljava/lang/ClassLoader;Ljava/util/Map;Ljava/security/ProtectionDomain;Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy;ZZ)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static load(Ljava/lang/ClassLoader;Ljava/util/Map;Ljava/security/ProtectionDomain;Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy;Lnet/bytebuddy/dynamic/loading/ClassLoaderDecorator$Factory;ZZ)Ljava/util/Map;
    .locals 8
    .param p0    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p2    # Ljava/security/ProtectionDomain;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Ljava/util/Map<",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "[B>;",
            "Ljava/security/ProtectionDomain;",
            "Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;",
            "Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy;",
            "Lnet/bytebuddy/dynamic/loading/ClassLoaderDecorator$Factory;",
            "ZZ)",
            "Ljava/util/Map<",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    .line 1
    new-instance v3, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ljava/util/Map$Entry;

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lnet/bytebuddy/description/type/TypeDescription;

    .line 31
    .line 32
    invoke-interface {v2}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v3, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    new-instance v0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;

    .line 45
    .line 46
    sget-object v7, Lnet/bytebuddy/dynamic/loading/ClassFilePostProcessor$NoOp;->INSTANCE:Lnet/bytebuddy/dynamic/loading/ClassFilePostProcessor$NoOp;

    .line 47
    .line 48
    move-object v1, p0

    .line 49
    move-object v4, p2

    .line 50
    move-object v5, p3

    .line 51
    move-object v6, p4

    .line 52
    move v2, p7

    .line 53
    invoke-direct/range {v0 .. v7}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;-><init>(Ljava/lang/ClassLoader;ZLjava/util/Map;Ljava/security/ProtectionDomain;Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy;Lnet/bytebuddy/dynamic/loading/ClassFilePostProcessor;)V

    .line 54
    .line 55
    .line 56
    invoke-interface {p5, v0, v3}, Lnet/bytebuddy/dynamic/loading/ClassLoaderDecorator$Factory;->make(Ljava/lang/ClassLoader;Ljava/util/Map;)Lnet/bytebuddy/dynamic/loading/ClassLoaderDecorator;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    new-instance p2, Ljava/util/LinkedHashMap;

    .line 61
    .line 62
    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result p3

    .line 77
    if-eqz p3, :cond_4

    .line 78
    .line 79
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p3

    .line 83
    check-cast p3, Lnet/bytebuddy/description/type/TypeDescription;

    .line 84
    .line 85
    invoke-interface {p0, p3}, Lnet/bytebuddy/dynamic/loading/ClassLoaderDecorator;->isSkipped(Lnet/bytebuddy/description/type/TypeDescription;)Z

    .line 86
    .line 87
    .line 88
    move-result p4

    .line 89
    if-eqz p4, :cond_1

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_1
    :try_start_0
    invoke-interface {p0, p3}, Lnet/bytebuddy/dynamic/loading/ClassLoaderDecorator;->apply(Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/ClassLoader;

    .line 93
    .line 94
    .line 95
    move-result-object p4

    .line 96
    invoke-interface {p3}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p5

    .line 100
    const/4 p7, 0x0

    .line 101
    invoke-static {p5, p7, p4}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    move-result-object p5

    .line 105
    invoke-static {}, Lnet/bytebuddy/utility/GraalImageCode;->getCurrent()Lnet/bytebuddy/utility/GraalImageCode;

    .line 106
    .line 107
    .line 108
    move-result-object p7

    .line 109
    invoke-virtual {p7}, Lnet/bytebuddy/utility/GraalImageCode;->isNativeImageExecution()Z

    .line 110
    .line 111
    .line 112
    move-result p7

    .line 113
    if-nez p7, :cond_3

    .line 114
    .line 115
    if-eqz p6, :cond_3

    .line 116
    .line 117
    invoke-virtual {p5}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 118
    .line 119
    .line 120
    move-result-object p7

    .line 121
    if-ne p7, p4, :cond_2

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 125
    .line 126
    new-instance p1, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 129
    .line 130
    .line 131
    const-string p2, "Class already loaded: "

    .line 132
    .line 133
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    throw p0

    .line 147
    :catch_0
    move-exception v0

    .line 148
    move-object p0, v0

    .line 149
    goto :goto_3

    .line 150
    :cond_3
    :goto_2
    invoke-interface {p2, p3, p5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 151
    .line 152
    .line 153
    goto :goto_1

    .line 154
    :goto_3
    const-string p1, "Cannot load class "

    .line 155
    .line 156
    invoke-static {p1, p3}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    invoke-static {p1, p0}, L飘花落叶言苏世哲楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 161
    .line 162
    .line 163
    const/4 p0, 0x0

    .line 164
    return-object p0

    .line 165
    :cond_4
    return-object p2
.end method

.method public static load(Ljava/lang/ClassLoader;Ljava/util/Map;Ljava/security/ProtectionDomain;Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy;ZZ)Ljava/util/Map;
    .locals 8
    .param p0    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p2    # Ljava/security/ProtectionDomain;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Ljava/util/Map<",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "[B>;",
            "Ljava/security/ProtectionDomain;",
            "Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;",
            "Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy;",
            "ZZ)",
            "Ljava/util/Map<",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    .line 166
    sget-object v5, Lnet/bytebuddy/dynamic/loading/ClassLoaderDecorator$Factory$NoOp;->INSTANCE:Lnet/bytebuddy/dynamic/loading/ClassLoaderDecorator$Factory$NoOp;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v6, p5

    move v7, p6

    invoke-static/range {v0 .. v7}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->load(Ljava/lang/ClassLoader;Ljava/util/Map;Ljava/security/ProtectionDomain;Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy;Lnet/bytebuddy/dynamic/loading/ClassLoaderDecorator$Factory;ZZ)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static methodHandle()Ljava/lang/Object;
    .locals 3

    .line 1
    const-string v0, "java.lang.invoke.MethodHandles"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "lookup"

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, v2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0
.end method


# virtual methods
.method public doDefineClasses(Ljava/util/Map;)Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "[B>;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Ljava/util/Map$Entry;

    .line 25
    .line 26
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    iget-object v4, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->typeDefinitions:Ljava/util/concurrent/ConcurrentMap;

    .line 31
    .line 32
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-interface {v4, v5, v2}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    :try_start_0
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 49
    .line 50
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_1

    .line 66
    .line 67
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    check-cast v2, Ljava/lang/String;

    .line 72
    .line 73
    sget-object v3, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->SYNCHRONIZATION_STRATEGY:Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$SynchronizationStrategy$Initializable;

    .line 74
    .line 75
    invoke-interface {v3}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$SynchronizationStrategy$Initializable;->initialize()Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$SynchronizationStrategy;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-interface {v3, p0, v2}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$SynchronizationStrategy;->getClassLoadingLock(Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;Ljava/lang/String;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 84
    :try_start_1
    invoke-virtual {p0, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    invoke-interface {v1, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    monitor-exit v3

    .line 92
    goto :goto_1

    .line 93
    :catchall_0
    move-exception p1

    .line 94
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 95
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 96
    :catchall_1
    move-exception p1

    .line 97
    goto :goto_3

    .line 98
    :cond_1
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-eqz v0, :cond_3

    .line 111
    .line 112
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    check-cast v0, Ljava/util/Map$Entry;

    .line 117
    .line 118
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    if-nez v2, :cond_2

    .line 123
    .line 124
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->persistenceHandler:Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;

    .line 125
    .line 126
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    check-cast v0, Ljava/lang/String;

    .line 131
    .line 132
    iget-object v3, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->typeDefinitions:Ljava/util/concurrent/ConcurrentMap;

    .line 133
    .line 134
    invoke-virtual {v2, v0, v3}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;->release(Ljava/lang/String;Ljava/util/concurrent/ConcurrentMap;)V

    .line 135
    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_2
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->typeDefinitions:Ljava/util/concurrent/ConcurrentMap;

    .line 139
    .line 140
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_3
    return-object v1

    .line 153
    :goto_3
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    if-eqz v1, :cond_5

    .line 166
    .line 167
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    check-cast v1, Ljava/util/Map$Entry;

    .line 172
    .line 173
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    if-nez v2, :cond_4

    .line 178
    .line 179
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->persistenceHandler:Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;

    .line 180
    .line 181
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    check-cast v1, Ljava/lang/String;

    .line 186
    .line 187
    iget-object v3, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->typeDefinitions:Ljava/util/concurrent/ConcurrentMap;

    .line 188
    .line 189
    invoke-virtual {v2, v1, v3}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;->release(Ljava/lang/String;Ljava/util/concurrent/ConcurrentMap;)V

    .line 190
    .line 191
    .line 192
    goto :goto_4

    .line 193
    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->typeDefinitions:Ljava/util/concurrent/ConcurrentMap;

    .line 194
    .line 195
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    goto :goto_4

    .line 207
    :cond_5
    throw p1
.end method

.method public findClass(Ljava/lang/String;)Ljava/lang/Class;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->persistenceHandler:Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->typeDefinitions:Ljava/util/concurrent/ConcurrentMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1, v1}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;->lookup(Ljava/lang/String;Ljava/util/concurrent/ConcurrentMap;)[B

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v1, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ClassDefinitionAction;

    .line 12
    .line 13
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->classFilePostProcessor:Lnet/bytebuddy/dynamic/loading/ClassFilePostProcessor;

    .line 14
    .line 15
    iget-object v3, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->protectionDomain:Ljava/security/ProtectionDomain;

    .line 16
    .line 17
    invoke-interface {v2, p0, p1, v3, v0}, Lnet/bytebuddy/dynamic/loading/ClassFilePostProcessor;->transform(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/security/ProtectionDomain;[B)[B

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-direct {v1, p0, p1, v0}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ClassDefinitionAction;-><init>(Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;Ljava/lang/String;[B)V

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->accessControlContext:Ljava/lang/Object;

    .line 25
    .line 26
    invoke-static {v1, p0}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->doPrivileged(Ljava/security/PrivilegedAction;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Ljava/lang/Class;

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_0
    new-instance p0, Ljava/lang/ClassNotFoundException;

    .line 34
    .line 35
    invoke-direct {p0, p1}, Ljava/lang/ClassNotFoundException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p0
.end method

.method public findResource(Ljava/lang/String;)Ljava/net/URL;
    .locals 1
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->persistenceHandler:Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->typeDefinitions:Ljava/util/concurrent/ConcurrentMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p0}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;->url(Ljava/lang/String;Ljava/util/concurrent/ConcurrentMap;)Ljava/net/URL;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public findResources(Ljava/lang/String;)Ljava/util/Enumeration;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Enumeration<",
            "Ljava/net/URL;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->persistenceHandler:Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->typeDefinitions:Ljava/util/concurrent/ConcurrentMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p0}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;->url(Ljava/lang/String;Ljava/util/concurrent/ConcurrentMap;)Ljava/net/URL;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    sget-object p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$EmptyEnumeration;->INSTANCE:Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$EmptyEnumeration;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    new-instance p1, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$SingletonEnumeration;

    .line 15
    .line 16
    invoke-direct {p1, p0}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$SingletonEnumeration;-><init>(Ljava/net/URL;)V

    .line 17
    .line 18
    .line 19
    return-object p1
.end method
