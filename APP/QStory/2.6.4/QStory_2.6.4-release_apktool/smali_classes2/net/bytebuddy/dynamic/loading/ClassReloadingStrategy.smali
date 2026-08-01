.class public Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$BootstrapInjection;,
        Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;,
        Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Dispatcher;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy<",
        "Ljava/lang/ClassLoader;",
        ">;"
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final ACCESS_CONTROLLER:Z

.field protected static final DISPATCHER:Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Dispatcher;


# instance fields
.field private final bootstrapInjection:Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$BootstrapInjection;

.field private final instrumentation:Ljava/lang/instrument/Instrumentation;

.field private final preregisteredTypes:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final strategy:Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;


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
    sput-boolean v1, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;->ACCESS_CONTROLLER:Z
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
    sput-boolean v0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;->ACCESS_CONTROLLER:Z

    .line 25
    .line 26
    :goto_0
    const-class v0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Dispatcher;

    .line 27
    .line 28
    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0}, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Dispatcher;

    .line 37
    .line 38
    sput-object v0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;->DISPATCHER:Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Dispatcher;

    .line 39
    .line 40
    return-void
.end method

.method public constructor <init>(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;)V
    .locals 2

    .line 17
    sget-object v0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$BootstrapInjection$Disabled;->INSTANCE:Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$BootstrapInjection$Disabled;

    .line 18
    sget-object v1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 19
    invoke-direct {p0, p1, p2, v0, v1}, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;-><init>(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$BootstrapInjection;Ljava/util/Map;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$BootstrapInjection;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/instrument/Instrumentation;",
            "Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;",
            "Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$BootstrapInjection;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;->instrumentation:Ljava/lang/instrument/Instrumentation;

    .line 5
    .line 6
    invoke-virtual {p2, p1}, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;->validate(Ljava/lang/instrument/Instrumentation;)Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;->strategy:Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;

    .line 11
    .line 12
    iput-object p3, p0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;->bootstrapInjection:Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$BootstrapInjection;

    .line 13
    .line 14
    iput-object p4, p0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;->preregisteredTypes:Ljava/util/Map;

    .line 15
    .line 16
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
    sget-boolean v0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;->ACCESS_CONTROLLER:Z

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

.method public static fromInstalledAgent()Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;
    .locals 1

    .line 11
    invoke-static {}, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;->resolveByteBuddyAgentInstrumentation()Ljava/lang/instrument/Instrumentation;

    move-result-object v0

    invoke-static {v0}, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;->of(Ljava/lang/instrument/Instrumentation;)Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;

    move-result-object v0

    return-object v0
.end method

.method public static fromInstalledAgent(Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;)Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;

    .line 2
    .line 3
    invoke-static {}, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;->resolveByteBuddyAgentInstrumentation()Ljava/lang/instrument/Instrumentation;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1, p0}, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;-><init>(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public static of(Ljava/lang/instrument/Instrumentation;)Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;
    .locals 2

    .line 1
    sget-object v0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;->DISPATCHER:Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Dispatcher;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Dispatcher;->isRetransformClassesSupported(Ljava/lang/instrument/Instrumentation;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;

    .line 10
    .line 11
    sget-object v1, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;->RETRANSFORMATION:Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;

    .line 12
    .line 13
    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;-><init>(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    invoke-interface {p0}, Ljava/lang/instrument/Instrumentation;->isRedefineClassesSupported()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    new-instance v0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;

    .line 24
    .line 25
    sget-object v1, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;->REDEFINITION:Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;

    .line 26
    .line 27
    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;-><init>(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;)V

    .line 28
    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_1
    const-string v0, "Instrumentation does not support reloading of classes: "

    .line 32
    .line 33
    invoke-static {p0, v0}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    return-object p0
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
    invoke-static {v2, v1}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;Ljava/lang/Throwable;)V

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
.method public enableBootstrapInjection(Ljava/io/File;)Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;
    .locals 4

    .line 1
    new-instance v0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;->instrumentation:Ljava/lang/instrument/Instrumentation;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;->strategy:Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;

    .line 6
    .line 7
    new-instance v3, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$BootstrapInjection$Enabled;

    .line 8
    .line 9
    invoke-direct {v3, p1}, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$BootstrapInjection$Enabled;-><init>(Ljava/io/File;)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;->preregisteredTypes:Ljava/util/Map;

    .line 13
    .line 14
    invoke-direct {v0, v1, v2, v3, p0}, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;-><init>(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$BootstrapInjection;Ljava/util/Map;)V

    .line 15
    .line 16
    .line 17
    return-object v0
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
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;->strategy:Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;->strategy:Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;

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
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;->instrumentation:Ljava/lang/instrument/Instrumentation;

    .line 34
    .line 35
    iget-object v3, p1, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;->instrumentation:Ljava/lang/instrument/Instrumentation;

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-nez v2, :cond_4

    .line 42
    .line 43
    return v1

    .line 44
    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;->bootstrapInjection:Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$BootstrapInjection;

    .line 45
    .line 46
    iget-object v3, p1, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;->bootstrapInjection:Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$BootstrapInjection;

    .line 47
    .line 48
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-nez v2, :cond_5

    .line 53
    .line 54
    return v1

    .line 55
    :cond_5
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;->preregisteredTypes:Ljava/util/Map;

    .line 56
    .line 57
    iget-object p1, p1, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;->preregisteredTypes:Ljava/util/Map;

    .line 58
    .line 59
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-nez p0, :cond_6

    .line 64
    .line 65
    return v1

    .line 66
    :cond_6
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
    iget-object v1, p0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;->instrumentation:Ljava/lang/instrument/Instrumentation;

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
    iget-object v0, p0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;->strategy:Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    add-int/2addr v0, v1

    .line 27
    mul-int/lit8 v0, v0, 0x1f

    .line 28
    .line 29
    iget-object v1, p0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;->bootstrapInjection:Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$BootstrapInjection;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    add-int/2addr v1, v0

    .line 36
    mul-int/lit8 v1, v1, 0x1f

    .line 37
    .line 38
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;->preregisteredTypes:Ljava/util/Map;

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    add-int/2addr p0, v1

    .line 45
    return p0
.end method

.method public load(Ljava/lang/ClassLoader;Ljava/util/Map;)Ljava/util/Map;
    .locals 8
    .param p1    # Ljava/lang/ClassLoader;
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

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;->preregisteredTypes:Ljava/util/Map;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;->instrumentation:Ljava/lang/instrument/Instrumentation;

    .line 9
    .line 10
    invoke-interface {v1, p1}, Ljava/lang/instrument/Instrumentation;->getInitiatedClasses(Ljava/lang/ClassLoader;)[Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    array-length v2, v1

    .line 15
    const/4 v3, 0x0

    .line 16
    :goto_0
    if-ge v3, v2, :cond_0

    .line 17
    .line 18
    aget-object v4, v1, v3

    .line 19
    .line 20
    invoke-static {v4}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->getName(Ljava/lang/Class;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    invoke-virtual {v0, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    add-int/lit8 v3, v3, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 31
    .line 32
    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 33
    .line 34
    .line 35
    new-instance v2, Ljava/util/HashMap;

    .line 36
    .line 37
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 38
    .line 39
    .line 40
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 41
    .line 42
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-eqz v4, :cond_2

    .line 58
    .line 59
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    check-cast v4, Ljava/util/Map$Entry;

    .line 64
    .line 65
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    check-cast v5, Lnet/bytebuddy/description/type/TypeDescription;

    .line 70
    .line 71
    invoke-interface {v5}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    invoke-virtual {v0, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    check-cast v5, Ljava/lang/Class;

    .line 80
    .line 81
    if-eqz v5, :cond_1

    .line 82
    .line 83
    new-instance v6, Ljava/lang/instrument/ClassDefinition;

    .line 84
    .line 85
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    check-cast v7, [B

    .line 90
    .line 91
    invoke-direct {v6, v5, v7}, Ljava/lang/instrument/ClassDefinition;-><init>(Ljava/lang/Class;[B)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1, v5, v6}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-virtual {v2, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_1
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_2
    :try_start_0
    iget-object p2, p0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;->strategy:Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;

    .line 118
    .line 119
    iget-object v0, p0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;->instrumentation:Ljava/lang/instrument/Instrumentation;

    .line 120
    .line 121
    invoke-virtual {p2, v0, v1}, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;->apply(Ljava/lang/instrument/Instrumentation;Ljava/util/Map;)V

    .line 122
    .line 123
    .line 124
    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    .line 125
    .line 126
    .line 127
    move-result p2

    .line 128
    if-nez p2, :cond_4

    .line 129
    .line 130
    if-nez p1, :cond_3

    .line 131
    .line 132
    iget-object p1, p0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;->bootstrapInjection:Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$BootstrapInjection;

    .line 133
    .line 134
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;->instrumentation:Ljava/lang/instrument/Instrumentation;

    .line 135
    .line 136
    invoke-interface {p1, p0}, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$BootstrapInjection;->make(Ljava/lang/instrument/Instrumentation;)Lnet/bytebuddy/dynamic/loading/ClassInjector;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    goto :goto_2

    .line 141
    :cond_3
    new-instance p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;

    .line 142
    .line 143
    invoke-direct {p0, p1}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;-><init>(Ljava/lang/ClassLoader;)V

    .line 144
    .line 145
    .line 146
    :goto_2
    invoke-interface {p0, v3}, Lnet/bytebuddy/dynamic/loading/ClassInjector;->inject(Ljava/util/Map;)Ljava/util/Map;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    invoke-virtual {v2, p0}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/instrument/UnmodifiableClassException; {:try_start_0 .. :try_end_0} :catch_0

    .line 151
    .line 152
    .line 153
    :cond_4
    return-object v2

    .line 154
    :catch_0
    move-exception p0

    .line 155
    const-string p1, "Cannot redefine specified class"

    .line 156
    .line 157
    invoke-static {p1, p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 158
    .line 159
    .line 160
    const/4 p0, 0x0

    .line 161
    return-object p0

    .line 162
    :catch_1
    move-exception p0

    .line 163
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 164
    .line 165
    const-string p2, "Could not locate classes for redefinition"

    .line 166
    .line 167
    invoke-direct {p1, p2, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 168
    .line 169
    .line 170
    throw p1
.end method

.method public varargs preregistered([Ljava/lang/Class;)Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;->preregisteredTypes:Ljava/util/Map;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 6
    .line 7
    .line 8
    array-length v1, p1

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v1, :cond_0

    .line 11
    .line 12
    aget-object v3, p1, v2

    .line 13
    .line 14
    invoke-static {v3}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->getName(Ljava/lang/Class;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance p1, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;

    .line 25
    .line 26
    iget-object v1, p0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;->instrumentation:Ljava/lang/instrument/Instrumentation;

    .line 27
    .line 28
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;->strategy:Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;

    .line 29
    .line 30
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;->bootstrapInjection:Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$BootstrapInjection;

    .line 31
    .line 32
    invoke-direct {p1, v1, v2, p0, v0}, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;-><init>(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$BootstrapInjection;Ljava/util/Map;)V

    .line 33
    .line 34
    .line 35
    return-object p1
.end method

.method public varargs reset(Lnet/bytebuddy/dynamic/ClassFileLocator;[Ljava/lang/Class;)Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/dynamic/ClassFileLocator;",
            "[",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;"
        }
    .end annotation

    .line 1
    array-length v0, p2

    .line 2
    if-lez v0, :cond_0

    .line 3
    .line 4
    :try_start_0
    iget-object v0, p0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;->strategy:Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;

    .line 5
    .line 6
    iget-object v1, p0, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;->instrumentation:Ljava/lang/instrument/Instrumentation;

    .line 7
    .line 8
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v0, v1, p1, v2}, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy$Strategy;->reset(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/dynamic/ClassFileLocator;Ljava/util/List;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/instrument/UnmodifiableClassException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :catch_0
    move-exception p0

    .line 17
    goto :goto_0

    .line 18
    :catch_1
    move-exception p0

    .line 19
    goto :goto_1

    .line 20
    :goto_0
    const-string p1, "Cannot reset types "

    .line 21
    .line 22
    invoke-static {p2}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-static {p1, p2, p0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    return-object p0

    .line 31
    :goto_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 32
    .line 33
    invoke-static {p2}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v1, "Cannot locate types "

    .line 40
    .line 41
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-direct {p1, p2, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_0
    return-object p0
.end method

.method public varargs reset([Ljava/lang/Class;)Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;"
        }
    .end annotation

    .line 56
    array-length v0, p1

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    aget-object v0, p1, v0

    .line 57
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-static {v0}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForClassLoader;->of(Ljava/lang/ClassLoader;)Lnet/bytebuddy/dynamic/ClassFileLocator;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;->reset(Lnet/bytebuddy/dynamic/ClassFileLocator;[Ljava/lang/Class;)Lnet/bytebuddy/dynamic/loading/ClassReloadingStrategy;

    move-result-object p0

    return-object p0
.end method
