.class Lcom/esotericsoftware/reflectasm/AccessClassLoader;
.super Ljava/lang/ClassLoader;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field private static final accessClassLoaders:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "Ljava/lang/ClassLoader;",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/esotericsoftware/reflectasm/AccessClassLoader;",
            ">;>;"
        }
    .end annotation
.end field

.field private static volatile defineClassMethod:Ljava/lang/reflect/Method;

.field private static volatile selfContextAccessClassLoader:Lcom/esotericsoftware/reflectasm/AccessClassLoader;

.field private static final selfContextParentClassLoader:Ljava/lang/ClassLoader;


# instance fields
.field private final localClassNames:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/esotericsoftware/reflectasm/AccessClassLoader;->accessClassLoaders:Ljava/util/WeakHashMap;

    .line 7
    .line 8
    const-class v0, Lcom/esotericsoftware/reflectasm/AccessClassLoader;

    .line 9
    .line 10
    invoke-static {v0}, Lcom/esotericsoftware/reflectasm/AccessClassLoader;->getParentClassLoader(Ljava/lang/Class;)Ljava/lang/ClassLoader;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lcom/esotericsoftware/reflectasm/AccessClassLoader;->selfContextParentClassLoader:Ljava/lang/ClassLoader;

    .line 15
    .line 16
    new-instance v1, Lcom/esotericsoftware/reflectasm/AccessClassLoader;

    .line 17
    .line 18
    invoke-direct {v1, v0}, Lcom/esotericsoftware/reflectasm/AccessClassLoader;-><init>(Ljava/lang/ClassLoader;)V

    .line 19
    .line 20
    .line 21
    sput-object v1, Lcom/esotericsoftware/reflectasm/AccessClassLoader;->selfContextAccessClassLoader:Lcom/esotericsoftware/reflectasm/AccessClassLoader;

    .line 22
    .line 23
    return-void
.end method

.method private constructor <init>(Ljava/lang/ClassLoader;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/lang/ClassLoader;-><init>(Ljava/lang/ClassLoader;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/util/HashSet;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/esotericsoftware/reflectasm/AccessClassLoader;->localClassNames:Ljava/util/HashSet;

    .line 10
    .line 11
    return-void
.end method

.method public static activeAccessClassLoaders()I
    .locals 2

    .line 1
    sget-object v0, Lcom/esotericsoftware/reflectasm/AccessClassLoader;->accessClassLoaders:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/WeakHashMap;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sget-object v1, Lcom/esotericsoftware/reflectasm/AccessClassLoader;->selfContextAccessClassLoader:Lcom/esotericsoftware/reflectasm/AccessClassLoader;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    :cond_0
    return v0
.end method

.method public static areInSameRuntimeClassLoader(Ljava/lang/Class;Ljava/lang/Class;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    return v2

    .line 13
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const/4 v1, 0x1

    .line 26
    if-nez p0, :cond_3

    .line 27
    .line 28
    if-eqz p1, :cond_2

    .line 29
    .line 30
    if-ne p1, v0, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    return v2

    .line 34
    :cond_2
    :goto_0
    return v1

    .line 35
    :cond_3
    if-nez p1, :cond_5

    .line 36
    .line 37
    if-ne p0, v0, :cond_4

    .line 38
    .line 39
    return v1

    .line 40
    :cond_4
    return v2

    .line 41
    :cond_5
    if-ne p0, p1, :cond_6

    .line 42
    .line 43
    return v1

    .line 44
    :cond_6
    return v2
.end method

.method public static get(Ljava/lang/Class;)Lcom/esotericsoftware/reflectasm/AccessClassLoader;
    .locals 3

    .line 1
    invoke-static {p0}, Lcom/esotericsoftware/reflectasm/AccessClassLoader;->getParentClassLoader(Ljava/lang/Class;)Ljava/lang/ClassLoader;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Lcom/esotericsoftware/reflectasm/AccessClassLoader;->selfContextParentClassLoader:Ljava/lang/ClassLoader;

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    sget-object p0, Lcom/esotericsoftware/reflectasm/AccessClassLoader;->selfContextAccessClassLoader:Lcom/esotericsoftware/reflectasm/AccessClassLoader;

    .line 14
    .line 15
    if-nez p0, :cond_1

    .line 16
    .line 17
    sget-object p0, Lcom/esotericsoftware/reflectasm/AccessClassLoader;->accessClassLoaders:Ljava/util/WeakHashMap;

    .line 18
    .line 19
    monitor-enter p0

    .line 20
    :try_start_0
    sget-object v1, Lcom/esotericsoftware/reflectasm/AccessClassLoader;->selfContextAccessClassLoader:Lcom/esotericsoftware/reflectasm/AccessClassLoader;

    .line 21
    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    new-instance v1, Lcom/esotericsoftware/reflectasm/AccessClassLoader;

    .line 25
    .line 26
    invoke-direct {v1, v0}, Lcom/esotericsoftware/reflectasm/AccessClassLoader;-><init>(Ljava/lang/ClassLoader;)V

    .line 27
    .line 28
    .line 29
    sput-object v1, Lcom/esotericsoftware/reflectasm/AccessClassLoader;->selfContextAccessClassLoader:Lcom/esotericsoftware/reflectasm/AccessClassLoader;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception v0

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    :goto_0
    monitor-exit p0

    .line 35
    goto :goto_2

    .line 36
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    throw v0

    .line 38
    :cond_1
    :goto_2
    sget-object p0, Lcom/esotericsoftware/reflectasm/AccessClassLoader;->selfContextAccessClassLoader:Lcom/esotericsoftware/reflectasm/AccessClassLoader;

    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_2
    sget-object v0, Lcom/esotericsoftware/reflectasm/AccessClassLoader;->accessClassLoaders:Ljava/util/WeakHashMap;

    .line 42
    .line 43
    monitor-enter v0

    .line 44
    :try_start_1
    invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 49
    .line 50
    if-eqz v1, :cond_4

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, Lcom/esotericsoftware/reflectasm/AccessClassLoader;

    .line 57
    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    monitor-exit v0

    .line 61
    return-object v1

    .line 62
    :catchall_1
    move-exception p0

    .line 63
    goto :goto_3

    .line 64
    :cond_3
    invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    :cond_4
    new-instance v1, Lcom/esotericsoftware/reflectasm/AccessClassLoader;

    .line 68
    .line 69
    invoke-direct {v1, p0}, Lcom/esotericsoftware/reflectasm/AccessClassLoader;-><init>(Ljava/lang/ClassLoader;)V

    .line 70
    .line 71
    .line 72
    new-instance v2, Ljava/lang/ref/WeakReference;

    .line 73
    .line 74
    invoke-direct {v2, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, p0, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    monitor-exit v0

    .line 81
    return-object v1

    .line 82
    :goto_3
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 83
    throw p0
.end method

.method private static getDefineClassMethod()Ljava/lang/reflect/Method;
    .locals 7

    .line 1
    sget-object v0, Lcom/esotericsoftware/reflectasm/AccessClassLoader;->defineClassMethod:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    sget-object v0, Lcom/esotericsoftware/reflectasm/AccessClassLoader;->accessClassLoaders:Ljava/util/WeakHashMap;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/esotericsoftware/reflectasm/AccessClassLoader;->defineClassMethod:Ljava/lang/reflect/Method;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    const-class v1, Ljava/lang/ClassLoader;

    .line 13
    .line 14
    const-string v2, "defineClass"

    .line 15
    .line 16
    const-class v3, Ljava/lang/String;

    .line 17
    .line 18
    const-class v4, [B

    .line 19
    .line 20
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 21
    .line 22
    const-class v6, Ljava/security/ProtectionDomain;

    .line 23
    .line 24
    filled-new-array {v3, v4, v5, v5, v6}, [Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    sput-object v1, Lcom/esotericsoftware/reflectasm/AccessClassLoader;->defineClassMethod:Ljava/lang/reflect/Method;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    :try_start_1
    sget-object v1, Lcom/esotericsoftware/reflectasm/AccessClassLoader;->defineClassMethod:Ljava/lang/reflect/Method;

    .line 35
    .line 36
    const/4 v2, 0x1

    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception v1

    .line 42
    goto :goto_1

    .line 43
    :catch_0
    :cond_0
    :goto_0
    :try_start_2
    monitor-exit v0

    .line 44
    goto :goto_2

    .line 45
    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 46
    throw v1

    .line 47
    :cond_1
    :goto_2
    sget-object v0, Lcom/esotericsoftware/reflectasm/AccessClassLoader;->defineClassMethod:Ljava/lang/reflect/Method;

    .line 48
    .line 49
    return-object v0
.end method

.method private static getParentClassLoader(Ljava/lang/Class;)Ljava/lang/ClassLoader;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :cond_0
    return-object p0
.end method

.method public static remove(Ljava/lang/ClassLoader;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/esotericsoftware/reflectasm/AccessClassLoader;->selfContextParentClassLoader:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    sput-object p0, Lcom/esotericsoftware/reflectasm/AccessClassLoader;->selfContextAccessClassLoader:Lcom/esotericsoftware/reflectasm/AccessClassLoader;

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    sget-object v0, Lcom/esotericsoftware/reflectasm/AccessClassLoader;->accessClassLoaders:Ljava/util/WeakHashMap;

    .line 14
    .line 15
    monitor-enter v0

    .line 16
    :try_start_0
    invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    monitor-exit v0

    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    throw p0
.end method


# virtual methods
.method public defineAccessClass(Ljava/lang/String;[B)Ljava/lang/Class;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/reflectasm/AccessClassLoader;->localClassNames:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/reflectasm/AccessClassLoader;->defineClass(Ljava/lang/String;[B)Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public defineClass(Ljava/lang/String;[B)Ljava/lang/Class;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[B)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-static {}, Lcom/esotericsoftware/reflectasm/AccessClassLoader;->getDefineClassMethod()Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/ClassLoader;->getParent()Ljava/lang/ClassLoader;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    array-length v3, p2

    .line 15
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-virtual {v4}, Ljava/lang/Class;->getProtectionDomain()Ljava/security/ProtectionDomain;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    filled-new-array {p1, p2, v2, v3, v4}, [Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    return-object v0

    .line 38
    :catch_0
    array-length v5, p2

    .line 39
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Ljava/lang/Class;->getProtectionDomain()Ljava/security/ProtectionDomain;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    const/4 v4, 0x0

    .line 48
    move-object v1, p0

    .line 49
    move-object v2, p1

    .line 50
    move-object v3, p2

    .line 51
    invoke-virtual/range {v1 .. v6}, Ljava/lang/ClassLoader;->defineClass(Ljava/lang/String;[BIILjava/security/ProtectionDomain;)Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0
.end method

.method public loadAccessClass(Ljava/lang/String;)Ljava/lang/Class;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/reflectasm/AccessClassLoader;->localClassNames:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    :try_start_0
    invoke-virtual {p0, p1, v0}, Lcom/esotericsoftware/reflectasm/AccessClassLoader;->loadClass(Ljava/lang/String;Z)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    return-object p0

    .line 15
    :catch_0
    move-exception p0

    .line 16
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return-object p0
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
    const-class v0, Lcom/esotericsoftware/reflectasm/FieldAccess;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    const-class v0, Lcom/esotericsoftware/reflectasm/MethodAccess;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_1
    const-class v0, Lcom/esotericsoftware/reflectasm/ConstructorAccess;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    return-object v0

    .line 40
    :cond_2
    const-class v0, Lcom/esotericsoftware/reflectasm/PublicConstructorAccess;

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_3

    .line 51
    .line 52
    return-object v0

    .line 53
    :cond_3
    invoke-super {p0, p1, p2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;Z)Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0
.end method
