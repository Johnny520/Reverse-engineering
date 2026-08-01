.class public Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ChildFirst;
.super Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ChildFirst"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ChildFirst$PrependingEnumeration;
    }
.end annotation


# static fields
.field private static final CLASS_FILE_SUFFIX:Ljava/lang/String; = ".class"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    invoke-static {}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ChildFirst;->doRegisterAsParallelCapable()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public constructor <init>(Ljava/lang/ClassLoader;Ljava/util/Map;)V
    .locals 0
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

    .line 1
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;-><init>(Ljava/lang/ClassLoader;Ljava/util/Map;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public constructor <init>(Ljava/lang/ClassLoader;Ljava/util/Map;Ljava/security/ProtectionDomain;Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy;)V
    .locals 0
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

    .line 8
    invoke-direct/range {p0 .. p5}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;-><init>(Ljava/lang/ClassLoader;Ljava/util/Map;Ljava/security/ProtectionDomain;Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/ClassLoader;Ljava/util/Map;Ljava/security/ProtectionDomain;Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy;Lnet/bytebuddy/dynamic/loading/ClassFilePostProcessor;)V
    .locals 0
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

    .line 10
    invoke-direct/range {p0 .. p6}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;-><init>(Ljava/lang/ClassLoader;Ljava/util/Map;Ljava/security/ProtectionDomain;Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy;Lnet/bytebuddy/dynamic/loading/ClassFilePostProcessor;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/ClassLoader;Ljava/util/Map;Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;)V
    .locals 0
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

    .line 6
    invoke-direct {p0, p1, p2, p3}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;-><init>(Ljava/lang/ClassLoader;Ljava/util/Map;Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/ClassLoader;ZLjava/util/Map;)V
    .locals 0
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

    .line 5
    invoke-direct {p0, p1, p2, p3}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;-><init>(Ljava/lang/ClassLoader;ZLjava/util/Map;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/ClassLoader;ZLjava/util/Map;Ljava/security/ProtectionDomain;Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy;)V
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
            ")V"
        }
    .end annotation

    .line 9
    invoke-direct/range {p0 .. p6}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;-><init>(Ljava/lang/ClassLoader;ZLjava/util/Map;Ljava/security/ProtectionDomain;Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy;)V

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

    .line 11
    invoke-direct/range {p0 .. p7}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;-><init>(Ljava/lang/ClassLoader;ZLjava/util/Map;Ljava/security/ProtectionDomain;Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy;Lnet/bytebuddy/dynamic/loading/ClassFilePostProcessor;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/ClassLoader;ZLjava/util/Map;Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;)V
    .locals 0
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

    .line 7
    invoke-direct {p0, p1, p2, p3, p4}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;-><init>(Ljava/lang/ClassLoader;ZLjava/util/Map;Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;)V

    return-void
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

.method private isShadowed(Ljava/lang/String;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->persistenceHandler:Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;

    .line 2
    .line 3
    invoke-virtual {v0}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;->isManifest()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_3

    .line 9
    .line 10
    const-string v0, ".class"

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    const/16 v0, 0x2f

    .line 20
    .line 21
    const/16 v2, 0x2e

    .line 22
    .line 23
    invoke-virtual {p1, v0, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    add-int/lit8 p1, p1, -0x6

    .line 32
    .line 33
    invoke-virtual {v0, v1, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    sget-object v0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->SYNCHRONIZATION_STRATEGY:Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$SynchronizationStrategy$Initializable;

    .line 38
    .line 39
    invoke-interface {v0}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$SynchronizationStrategy$Initializable;->initialize()Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$SynchronizationStrategy;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-interface {v0, p0, p1}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$SynchronizationStrategy;->getClassLoadingLock(Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;Ljava/lang/String;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    monitor-enter v0

    .line 48
    :try_start_0
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->typeDefinitions:Ljava/util/concurrent/ConcurrentMap;

    .line 49
    .line 50
    invoke-interface {v2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    const/4 v3, 0x1

    .line 55
    if-eqz v2, :cond_1

    .line 56
    .line 57
    monitor-exit v0

    .line 58
    return v3

    .line 59
    :catchall_0
    move-exception p0

    .line 60
    goto :goto_0

    .line 61
    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/ClassLoader;->findLoadedClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    if-eqz p1, :cond_2

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    if-ne p1, p0, :cond_2

    .line 72
    .line 73
    move v1, v3

    .line 74
    :cond_2
    monitor-exit v0

    .line 75
    return v1

    .line 76
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    throw p0

    .line 78
    :cond_3
    :goto_1
    return v1
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

    invoke-static/range {v0 .. v6}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ChildFirst;->load(Ljava/lang/ClassLoader;Ljava/util/Map;Ljava/security/ProtectionDomain;Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy;ZZ)Ljava/util/Map;

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
    new-instance v0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ChildFirst;

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
    invoke-direct/range {v0 .. v7}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ChildFirst;-><init>(Ljava/lang/ClassLoader;ZLjava/util/Map;Ljava/security/ProtectionDomain;Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy;Lnet/bytebuddy/dynamic/loading/ClassFilePostProcessor;)V

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
    invoke-interface {p0, p3}, Lnet/bytebuddy/dynamic/loading/ClassLoaderDecorator;->apply(Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/ClassLoader;

    .line 93
    .line 94
    .line 95
    move-result-object p4

    .line 96
    :try_start_0
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
    invoke-static {p1, p3}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    invoke-static {p1, p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;Ljava/lang/Throwable;)V

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

    invoke-static/range {v0 .. v7}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ChildFirst;->load(Ljava/lang/ClassLoader;Ljava/util/Map;Ljava/security/ProtectionDomain;Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy;Lnet/bytebuddy/dynamic/loading/ClassLoaderDecorator$Factory;ZZ)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getResource(Ljava/lang/String;)Ljava/net/URL;
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->persistenceHandler:Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->typeDefinitions:Ljava/util/concurrent/ConcurrentMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1, v1}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;->url(Ljava/lang/String;Ljava/util/concurrent/ConcurrentMap;)Ljava/net/URL;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-direct {p0, p1}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ChildFirst;->isShadowed(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-super {p0, p1}, Ljava/lang/ClassLoader;->getResource(Ljava/lang/String;)Ljava/net/URL;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_1
    :goto_0
    return-object v0
.end method

.method public getResources(Ljava/lang/String;)Ljava/util/Enumeration;
    .locals 2
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
    iget-object v1, p0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->typeDefinitions:Ljava/util/concurrent/ConcurrentMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1, v1}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$PersistenceHandler;->url(Ljava/lang/String;Ljava/util/concurrent/ConcurrentMap;)Ljava/net/URL;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-super {p0, p1}, Ljava/lang/ClassLoader;->getResources(Ljava/lang/String;)Ljava/util/Enumeration;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    new-instance v1, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ChildFirst$PrependingEnumeration;

    .line 17
    .line 18
    invoke-super {p0, p1}, Ljava/lang/ClassLoader;->getResources(Ljava/lang/String;)Ljava/util/Enumeration;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-direct {v1, v0, p0}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$ChildFirst$PrependingEnumeration;-><init>(Ljava/net/URL;Ljava/util/Enumeration;)V

    .line 23
    .line 24
    .line 25
    return-object v1
.end method

.method public loadClass(Ljava/lang/String;Z)Ljava/lang/Class;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->SYNCHRONIZATION_STRATEGY:Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$SynchronizationStrategy$Initializable;

    .line 2
    .line 3
    invoke-interface {v0}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$SynchronizationStrategy$Initializable;->initialize()Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$SynchronizationStrategy;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0, p0, p1}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader$SynchronizationStrategy;->getClassLoadingLock(Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    monitor-enter v0

    .line 12
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/ClassLoader;->findLoadedClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    return-object v1

    .line 20
    :catchall_0
    move-exception p0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    :try_start_1
    invoke-virtual {p0, p1}, Lnet/bytebuddy/dynamic/loading/ByteArrayClassLoader;->findClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    if-eqz p2, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0, v1}, Ljava/lang/ClassLoader;->resolveClass(Ljava/lang/Class;)V
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    .line 30
    .line 31
    :cond_1
    :try_start_2
    monitor-exit v0

    .line 32
    return-object v1

    .line 33
    :catch_0
    invoke-super {p0, p1, p2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;Z)Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    monitor-exit v0

    .line 38
    return-object p0

    .line 39
    :goto_0
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 40
    throw p0
.end method
