.class public Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/dynamic/ClassFileLocator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/ClassFileLocator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForInstrumentation"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation$ExtractionClassFileTransformer;,
        Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation$ClassLoadingDelegate;,
        Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation$Dispatcher;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final ACCESS_CONTROLLER:Z

.field private static final DISPATCHER:Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation$Dispatcher;


# instance fields
.field private final classLoadingDelegate:Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation$ClassLoadingDelegate;

.field private final instrumentation:Ljava/lang/instrument/Instrumentation;


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
    sput-boolean v1, Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation;->ACCESS_CONTROLLER:Z
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
    sput-boolean v0, Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation;->ACCESS_CONTROLLER:Z

    .line 25
    .line 26
    :goto_0
    const-class v0, Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation$Dispatcher;

    .line 27
    .line 28
    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation$Dispatcher;

    .line 37
    .line 38
    sput-object v0, Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation;->DISPATCHER:Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation$Dispatcher;

    .line 39
    .line 40
    return-void
.end method

.method public constructor <init>(Ljava/lang/instrument/Instrumentation;Ljava/lang/ClassLoader;)V
    .locals 0
    .param p2    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 24
    invoke-static {p2}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation$ClassLoadingDelegate$Default;->of(Ljava/lang/ClassLoader;)Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation$ClassLoadingDelegate;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation;-><init>(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation$ClassLoadingDelegate;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation$ClassLoadingDelegate;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation;->DISPATCHER:Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation$Dispatcher;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation$Dispatcher;->isRetransformClassesSupported(Ljava/lang/instrument/Instrumentation;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iput-object p1, p0, Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation;->instrumentation:Ljava/lang/instrument/Instrumentation;

    .line 13
    .line 14
    iput-object p2, p0, Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation;->classLoadingDelegate:Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation$ClassLoadingDelegate;

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const-string p0, " does not support retransformation"

    .line 18
    .line 19
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    throw p0
.end method

.method public static synthetic access$000(Ljava/security/PrivilegedAction;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

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

    .line 1
    sget-boolean v0, Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation;->ACCESS_CONTROLLER:Z

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

.method public static fromInstalledAgent(Ljava/lang/ClassLoader;)Lnet/bytebuddy/dynamic/ClassFileLocator;
    .locals 2
    .param p0    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    new-instance v0, Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation;

    .line 2
    .line 3
    invoke-static {}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation;->resolveByteBuddyAgentInstrumentation()Ljava/lang/instrument/Instrumentation;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1, p0}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation;-><init>(Ljava/lang/instrument/Instrumentation;Ljava/lang/ClassLoader;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public static of(Ljava/lang/instrument/Instrumentation;Ljava/lang/Class;)Lnet/bytebuddy/dynamic/ClassFileLocator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/instrument/Instrumentation;",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/dynamic/ClassFileLocator;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation;

    .line 2
    .line 3
    invoke-static {p1}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation$ClassLoadingDelegate$Explicit;->of(Ljava/lang/Class;)Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation$ClassLoadingDelegate;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {v0, p0, p1}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation;-><init>(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation$ClassLoadingDelegate;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method private static resolveByteBuddyAgentInstrumentation()Ljava/lang/instrument/Instrumentation;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    const-string v2, "net.bytebuddy.agent.Installer"

    .line 7
    .line 8
    invoke-virtual {v1, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-class v2, Lnet/bytebuddy/agent/builder/AgentBuilder;

    .line 13
    .line 14
    invoke-static {v2}, Lnet/bytebuddy/utility/JavaModule;->ofType(Ljava/lang/Class;)Lnet/bytebuddy/utility/JavaModule;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-static {v1}, Lnet/bytebuddy/utility/JavaModule;->ofType(Ljava/lang/Class;)Lnet/bytebuddy/utility/JavaModule;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    invoke-virtual {v2, v3}, Lnet/bytebuddy/utility/JavaModule;->canRead(Lnet/bytebuddy/utility/JavaModule;)Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-nez v4, :cond_0

    .line 29
    .line 30
    const-string v4, "java.lang.Module"

    .line 31
    .line 32
    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    const-string v5, "addReads"

    .line 37
    .line 38
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    invoke-virtual {v4, v5, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-virtual {v2}, Lnet/bytebuddy/utility/JavaModule;->unwrap()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v3}, Lnet/bytebuddy/utility/JavaModule;->unwrap()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-virtual {v4, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :catch_0
    move-exception v1

    .line 63
    goto :goto_1

    .line 64
    :cond_0
    :goto_0
    const-string v2, "getInstrumentation"

    .line 65
    .line 66
    invoke-virtual {v1, v2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v1, v0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    check-cast v1, Ljava/lang/instrument/Instrumentation;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    .line 76
    return-object v1

    .line 77
    :goto_1
    const-string v2, "The Byte Buddy agent is not installed or not accessible"

    .line 78
    .line 79
    invoke-static {v2, v1}, L飘花落叶言苏世哲楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    return-object v0

    .line 83
    :catch_1
    move-exception v0

    .line 84
    throw v0
.end method


# virtual methods
.method public close()V
    .locals 0

    .line 1
    return-void
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
    iget-object v2, p0, Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation;->instrumentation:Ljava/lang/instrument/Instrumentation;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation;->instrumentation:Ljava/lang/instrument/Instrumentation;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    iget-object p0, p0, Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation;->classLoadingDelegate:Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation$ClassLoadingDelegate;

    .line 34
    .line 35
    iget-object p1, p1, Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation;->classLoadingDelegate:Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation$ClassLoadingDelegate;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-nez p0, :cond_4

    .line 42
    .line 43
    return v1

    .line 44
    :cond_4
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
    iget-object v1, p0, Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation;->instrumentation:Ljava/lang/instrument/Instrumentation;

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
    iget-object p0, p0, Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation;->classLoadingDelegate:Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation$ClassLoadingDelegate;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    add-int/2addr p0, v1

    .line 27
    return p0
.end method

.method public locate(Ljava/lang/String;)Lnet/bytebuddy/dynamic/ClassFileLocator$Resolution;
    .locals 4

    .line 1
    :try_start_0
    new-instance v0, Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation$ExtractionClassFileTransformer;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation;->classLoadingDelegate:Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation$ClassLoadingDelegate;

    .line 4
    .line 5
    invoke-interface {v1}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation$ClassLoadingDelegate;->getClassLoader()Ljava/lang/ClassLoader;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1, p1}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation$ExtractionClassFileTransformer;-><init>(Ljava/lang/ClassLoader;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sget-object v1, Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation;->DISPATCHER:Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation$Dispatcher;

    .line 13
    .line 14
    iget-object v2, p0, Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation;->instrumentation:Ljava/lang/instrument/Instrumentation;

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    invoke-interface {v1, v2, v0, v3}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation$Dispatcher;->addTransformer(Ljava/lang/instrument/Instrumentation;Ljava/lang/instrument/ClassFileTransformer;Z)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    :try_start_1
    iget-object v2, p0, Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation;->instrumentation:Ljava/lang/instrument/Instrumentation;

    .line 21
    .line 22
    iget-object v3, p0, Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation;->classLoadingDelegate:Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation$ClassLoadingDelegate;

    .line 23
    .line 24
    invoke-interface {v3, p1}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation$ClassLoadingDelegate;->locate(Ljava/lang/String;)Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-interface {v1, v2, v3}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation$Dispatcher;->retransformClasses(Ljava/lang/instrument/Instrumentation;[Ljava/lang/Class;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation$ExtractionClassFileTransformer;->getBinaryRepresentation()[B

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    if-nez v1, :cond_0

    .line 40
    .line 41
    new-instance v1, Lnet/bytebuddy/dynamic/ClassFileLocator$Resolution$Illegal;

    .line 42
    .line 43
    invoke-direct {v1, p1}, Lnet/bytebuddy/dynamic/ClassFileLocator$Resolution$Illegal;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception v1

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    new-instance v2, Lnet/bytebuddy/dynamic/ClassFileLocator$Resolution$Explicit;

    .line 50
    .line 51
    invoke-direct {v2, v1}, Lnet/bytebuddy/dynamic/ClassFileLocator$Resolution$Explicit;-><init>([B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    .line 53
    .line 54
    move-object v1, v2

    .line 55
    :goto_0
    :try_start_2
    iget-object p0, p0, Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation;->instrumentation:Ljava/lang/instrument/Instrumentation;

    .line 56
    .line 57
    invoke-interface {p0, v0}, Ljava/lang/instrument/Instrumentation;->removeTransformer(Ljava/lang/instrument/ClassFileTransformer;)Z

    .line 58
    .line 59
    .line 60
    return-object v1

    .line 61
    :goto_1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/ClassFileLocator$ForInstrumentation;->instrumentation:Ljava/lang/instrument/Instrumentation;

    .line 62
    .line 63
    invoke-interface {p0, v0}, Ljava/lang/instrument/Instrumentation;->removeTransformer(Ljava/lang/instrument/ClassFileTransformer;)Z

    .line 64
    .line 65
    .line 66
    throw v1
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 67
    :catch_0
    new-instance p0, Lnet/bytebuddy/dynamic/ClassFileLocator$Resolution$Illegal;

    .line 68
    .line 69
    invoke-direct {p0, p1}, Lnet/bytebuddy/dynamic/ClassFileLocator$Resolution$Illegal;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-object p0

    .line 73
    :catch_1
    move-exception p0

    .line 74
    throw p0
.end method
