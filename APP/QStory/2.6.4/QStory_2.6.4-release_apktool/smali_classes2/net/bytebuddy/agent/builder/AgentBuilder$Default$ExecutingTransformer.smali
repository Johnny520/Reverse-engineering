.class public Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;
.super Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$AbstractBase;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder$Default;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ExecutingTransformer"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$Java9CapableVmDispatcher;,
        Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$LegacyVmDispatcher;,
        Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$Factory;
    }
.end annotation


# static fields
.field private static final ACCESS_CONTROLLER:Z

.field protected static final FACTORY:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$Factory;


# instance fields
.field private final accessControlContext:Ljava/lang/Object;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final byteBuddy:Lnet/bytebuddy/ByteBuddy;

.field private final circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

.field private final classFileBufferStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;

.field private final classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

.field private final descriptionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;

.field private final fallbackStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;

.field private final ignoreMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

.field private final initializationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;

.field private final injectionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;

.field private final installationListener:Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;

.field private final lambdaInstrumentationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;

.field private final listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

.field private final locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

.field private final nativeMethodStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;

.field private final poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

.field private final resubmissionEnforcer:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionEnforcer;

.field private final transformations:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;",
            ">;"
        }
    .end annotation
.end field

.field private final typeStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;


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
    sput-boolean v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->ACCESS_CONTROLLER:Z
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
    sput-boolean v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->ACCESS_CONTROLLER:Z

    .line 25
    .line 26
    :goto_0
    sget-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$Factory$CreationAction;->INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$Factory$CreationAction;

    .line 27
    .line 28
    invoke-static {v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->access$500(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$Factory;

    .line 33
    .line 34
    sput-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->FACTORY:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$Factory;

    .line 35
    .line 36
    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionEnforcer;Ljava/util/List;Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/ByteBuddy;",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;",
            "Lnet/bytebuddy/dynamic/ClassFileLocator;",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionEnforcer;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;",
            ">;",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$AbstractBase;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    .line 5
    .line 6
    iput-object p4, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->typeStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    .line 9
    .line 10
    iput-object p5, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    .line 11
    .line 12
    iput-object p6, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 13
    .line 14
    iput-object p2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    .line 15
    .line 16
    iput-object p7, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->nativeMethodStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;

    .line 17
    .line 18
    iput-object p8, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->initializationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;

    .line 19
    .line 20
    iput-object p9, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->injectionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;

    .line 21
    .line 22
    iput-object p10, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->lambdaInstrumentationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;

    .line 23
    .line 24
    iput-object p11, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->descriptionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;

    .line 25
    .line 26
    iput-object p12, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->fallbackStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;

    .line 27
    .line 28
    iput-object p13, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->classFileBufferStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;

    .line 29
    .line 30
    iput-object p14, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->installationListener:Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;

    .line 31
    .line 32
    iput-object p15, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->ignoreMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    .line 33
    .line 34
    move-object/from16 p1, p16

    .line 35
    .line 36
    iput-object p1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->resubmissionEnforcer:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionEnforcer;

    .line 37
    .line 38
    move-object/from16 p1, p17

    .line 39
    .line 40
    iput-object p1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->transformations:Ljava/util/List;

    .line 41
    .line 42
    move-object/from16 p1, p18

    .line 43
    .line 44
    iput-object p1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    .line 45
    .line 46
    invoke-static {}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->getContext()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iput-object p1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->accessControlContext:Ljava/lang/Object;

    .line 51
    .line 52
    return-void
.end method

.method public static synthetic access$1800(Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;Lnet/bytebuddy/utility/JavaModule;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;Ljava/security/ProtectionDomain;[B)[B
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->transform(Lnet/bytebuddy/utility/JavaModule;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;Ljava/security/ProtectionDomain;[B)[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
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
    sget-boolean v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->ACCESS_CONTROLLER:Z

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

.method private doTransform(Lnet/bytebuddy/utility/JavaModule;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;ZLjava/security/ProtectionDomain;Lnet/bytebuddy/pool/TypePool;Lnet/bytebuddy/dynamic/ClassFileLocator;)[B
    .locals 11
    .param p1    # Lnet/bytebuddy/utility/JavaModule;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Class;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p6    # Ljava/security/ProtectionDomain;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/utility/JavaModule;",
            "Ljava/lang/ClassLoader;",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;Z",
            "Ljava/security/ProtectionDomain;",
            "Lnet/bytebuddy/pool/TypePool;",
            "Lnet/bytebuddy/dynamic/ClassFileLocator;",
            ")[B"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->descriptionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;

    .line 2
    .line 3
    iget-object v5, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    .line 4
    .line 5
    move-object v7, p1

    .line 6
    move-object v6, p2

    .line 7
    move-object v2, p3

    .line 8
    move-object v3, p4

    .line 9
    move-object/from16 v4, p7

    .line 10
    .line 11
    invoke-interface/range {v1 .. v7}, Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;->apply(Ljava/lang/String;Ljava/lang/Class;Lnet/bytebuddy/pool/TypePool;Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    new-instance v9, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->ignoreMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    .line 21
    .line 22
    move-object v4, p1

    .line 23
    move-object v3, p2

    .line 24
    move-object v5, p4

    .line 25
    move-object/from16 v6, p6

    .line 26
    .line 27
    invoke-interface/range {v1 .. v6}, Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;->matches(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Ljava/lang/Class;Ljava/security/ProtectionDomain;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_1

    .line 32
    .line 33
    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->transformations:Ljava/util/List;

    .line 34
    .line 35
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v7

    .line 39
    :cond_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    move-object v8, v1

    .line 50
    check-cast v8, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;

    .line 51
    .line 52
    invoke-virtual {v8}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;->getMatcher()Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    move-object v4, p1

    .line 57
    move-object v3, p2

    .line 58
    move-object v5, p4

    .line 59
    move-object/from16 v6, p6

    .line 60
    .line 61
    invoke-interface/range {v1 .. v6}, Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;->matches(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Ljava/lang/Class;Ljava/security/ProtectionDomain;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_0

    .line 66
    .line 67
    invoke-virtual {v8}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;->getTransformers()Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 72
    .line 73
    .line 74
    invoke-virtual {v8}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;->isTerminal()Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_0

    .line 79
    .line 80
    :cond_1
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-eqz v1, :cond_2

    .line 85
    .line 86
    iget-object v0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    .line 87
    .line 88
    move/from16 v10, p5

    .line 89
    .line 90
    invoke-interface {v0, v2, p2, p1, v10}, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;->onIgnored(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Z)V

    .line 91
    .line 92
    .line 93
    invoke-static {}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;->access$1700()[B

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    return-object v0

    .line 98
    :cond_2
    move/from16 v10, p5

    .line 99
    .line 100
    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->typeStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;

    .line 101
    .line 102
    iget-object v3, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    .line 103
    .line 104
    iget-object v4, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->nativeMethodStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;

    .line 105
    .line 106
    invoke-interface {v4}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;->resolve()Lnet/bytebuddy/dynamic/scaffold/inline/MethodNameTransformer;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    move-object v7, p1

    .line 111
    move-object v6, p2

    .line 112
    move-object/from16 v8, p6

    .line 113
    .line 114
    move-object/from16 v4, p8

    .line 115
    .line 116
    invoke-interface/range {v1 .. v8}, Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;->builder(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/dynamic/scaffold/inline/MethodNameTransformer;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Ljava/security/ProtectionDomain;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    iget-object v3, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->initializationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;

    .line 121
    .line 122
    invoke-interface {v3}, Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;->dispatcher()Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy$Dispatcher;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 127
    .line 128
    .line 129
    move-result-object v8

    .line 130
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    if-eqz v3, :cond_3

    .line 135
    .line 136
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    check-cast v3, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer;

    .line 141
    .line 142
    move-object v4, v2

    .line 143
    move-object v2, v1

    .line 144
    move-object v1, v3

    .line 145
    move-object v3, v4

    .line 146
    move-object v5, p1

    .line 147
    move-object v4, p2

    .line 148
    move-object/from16 v6, p6

    .line 149
    .line 150
    invoke-interface/range {v1 .. v6}, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer;->transform(Lnet/bytebuddy/dynamic/DynamicType$Builder;Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Ljava/security/ProtectionDomain;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    move-object v2, v3

    .line 155
    goto :goto_0

    .line 156
    :cond_3
    invoke-interface {v7, v1}, Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy$Dispatcher;->apply(Lnet/bytebuddy/dynamic/DynamicType$Builder;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    sget-object v4, Lnet/bytebuddy/dynamic/TypeResolutionStrategy$Disabled;->INSTANCE:Lnet/bytebuddy/dynamic/TypeResolutionStrategy$Disabled;

    .line 161
    .line 162
    move-object/from16 v5, p7

    .line 163
    .line 164
    invoke-interface {v1, v4, v5}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->make(Lnet/bytebuddy/dynamic/TypeResolutionStrategy;Lnet/bytebuddy/pool/TypePool;)Lnet/bytebuddy/dynamic/DynamicType$Unloaded;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->injectionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;

    .line 169
    .line 170
    move-object/from16 v6, p6

    .line 171
    .line 172
    invoke-interface {v7, v5, p2, v6, v1}, Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy$Dispatcher;->register(Lnet/bytebuddy/dynamic/DynamicType;Ljava/lang/ClassLoader;Ljava/security/ProtectionDomain;Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;)V

    .line 173
    .line 174
    .line 175
    iget-object v0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    .line 176
    .line 177
    move-object v3, p1

    .line 178
    move-object v1, v2

    .line 179
    move v4, v10

    .line 180
    move-object v2, p2

    .line 181
    invoke-interface/range {v0 .. v5}, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;->onTransformation(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;ZLnet/bytebuddy/dynamic/DynamicType;)V

    .line 182
    .line 183
    .line 184
    invoke-interface {v5}, Lnet/bytebuddy/dynamic/DynamicType;->getBytes()[B

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    return-object v0
.end method

.method private static getContext()Ljava/lang/Object;
    .locals 1
    .annotation runtime Lnet/bytebuddy/build/AccessControllerPlugin$Enhance;
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    sget-boolean v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->ACCESS_CONTROLLER:Z

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

.method private transform(Lnet/bytebuddy/utility/JavaModule;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;Ljava/security/ProtectionDomain;[B)[B
    .locals 14
    .param p1    # Lnet/bytebuddy/utility/JavaModule;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Class;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p5    # Ljava/security/ProtectionDomain;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/utility/JavaModule;",
            "Ljava/lang/ClassLoader;",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/security/ProtectionDomain;",
            "[B)[B"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    move-object/from16 v2, p2

    .line 2
    .line 3
    move-object/from16 v0, p3

    .line 4
    .line 5
    move-object/from16 v6, p4

    .line 6
    .line 7
    const-string v10, "Failed transformation of "

    .line 8
    .line 9
    if-eqz v0, :cond_b

    .line 10
    .line 11
    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->lambdaInstrumentationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;

    .line 12
    .line 13
    invoke-virtual {v1, v6}, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;->isInstrumented(Ljava/lang/Class;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    goto/16 :goto_f

    .line 20
    .line 21
    :cond_0
    const/16 v1, 0x2f

    .line 22
    .line 23
    const/16 v3, 0x2e

    .line 24
    .line 25
    invoke-virtual {v0, v1, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const/4 v11, 0x0

    .line 30
    const/4 v12, 0x1

    .line 31
    :try_start_0
    iget-object v0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->resubmissionEnforcer:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionEnforcer;

    .line 32
    .line 33
    invoke-interface {v0, v1, v2, p1, v6}, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionEnforcer;->isEnforced(Ljava/lang/String;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Ljava/lang/Class;)Z

    .line 34
    .line 35
    .line 36
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_9

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    :try_start_1
    invoke-static {}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->access$1600()[B

    .line 40
    .line 41
    .line 42
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    return-object p0

    .line 44
    :catchall_0
    move-exception v0

    .line 45
    move-object v5, v0

    .line 46
    move-object v13, v6

    .line 47
    goto/16 :goto_9

    .line 48
    .line 49
    :cond_1
    :try_start_2
    iget-object v0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    .line 50
    .line 51
    if-eqz v6, :cond_2

    .line 52
    .line 53
    move v3, v12

    .line 54
    goto :goto_0

    .line 55
    :cond_2
    move v3, v11

    .line 56
    :goto_0
    invoke-interface {v0, v1, v2, p1, v3}, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;->onDiscovery(Ljava/lang/String;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Z)V

    .line 57
    .line 58
    .line 59
    new-instance v9, Lnet/bytebuddy/dynamic/ClassFileLocator$Compound;

    .line 60
    .line 61
    iget-object v0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->classFileBufferStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    .line 62
    .line 63
    move-object v4, p1

    .line 64
    move-object/from16 v5, p5

    .line 65
    .line 66
    move-object v3, v2

    .line 67
    move-object/from16 v2, p6

    .line 68
    .line 69
    :try_start_3
    invoke-interface/range {v0 .. v5}, Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;->resolve(Ljava/lang/String;[BLjava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Ljava/security/ProtectionDomain;)Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 70
    .line 71
    .line 72
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_7

    .line 73
    move-object v2, v3

    .line 74
    :try_start_4
    iget-object v4, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 75
    .line 76
    iget-object v5, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    .line 77
    .line 78
    invoke-interface {v5, v2, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;->classFileLocator(Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;)Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 79
    .line 80
    .line 81
    move-result-object v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 82
    const/4 v7, 0x3

    .line 83
    :try_start_5
    new-array v7, v7, [Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 84
    .line 85
    aput-object v0, v7, v11

    .line 86
    .line 87
    aput-object v4, v7, v12

    .line 88
    .line 89
    const/4 v0, 0x2

    .line 90
    aput-object v5, v7, v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    .line 91
    .line 92
    :try_start_6
    invoke-direct {v9, v7}, Lnet/bytebuddy/dynamic/ClassFileLocator$Compound;-><init>([Lnet/bytebuddy/dynamic/ClassFileLocator;)V

    .line 93
    .line 94
    .line 95
    iget-object v0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->classFileBufferStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;

    .line 96
    .line 97
    iget-object v4, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    .line 98
    .line 99
    invoke-interface {v0, v4, v9, v2, v1}, Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;->typePool(Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/dynamic/ClassFileLocator;Ljava/lang/ClassLoader;Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool;

    .line 100
    .line 101
    .line 102
    move-result-object v8
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 103
    move-object v5, v6

    .line 104
    if-eqz v6, :cond_3

    .line 105
    .line 106
    move v6, v12

    .line 107
    :goto_1
    move-object/from16 v7, p5

    .line 108
    .line 109
    move-object v4, v1

    .line 110
    move-object v3, v2

    .line 111
    move-object v1, p0

    .line 112
    move-object v2, p1

    .line 113
    goto :goto_2

    .line 114
    :cond_3
    move v6, v11

    .line 115
    goto :goto_1

    .line 116
    :goto_2
    :try_start_7
    invoke-direct/range {v1 .. v9}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->doTransform(Lnet/bytebuddy/utility/JavaModule;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;ZLjava/security/ProtectionDomain;Lnet/bytebuddy/pool/TypePool;Lnet/bytebuddy/dynamic/ClassFileLocator;)[B

    .line 117
    .line 118
    .line 119
    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 120
    move-object v2, v3

    .line 121
    move-object v13, v5

    .line 122
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    .line 123
    .line 124
    if-eqz v13, :cond_4

    .line 125
    .line 126
    move v11, v12

    .line 127
    :cond_4
    invoke-interface {p0, v4, v2, p1, v11}, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;->onComplete(Ljava/lang/String;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Z)V

    .line 128
    .line 129
    .line 130
    return-object v0

    .line 131
    :catchall_1
    move-exception v0

    .line 132
    move-object v2, v3

    .line 133
    move-object v13, v5

    .line 134
    if-eqz v13, :cond_5

    .line 135
    .line 136
    :try_start_8
    iget-object v5, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->descriptionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;

    .line 137
    .line 138
    invoke-interface {v5}, Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;->isLoadedFirst()Z

    .line 139
    .line 140
    .line 141
    move-result v5

    .line 142
    if-eqz v5, :cond_5

    .line 143
    .line 144
    iget-object v5, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->fallbackStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;

    .line 145
    .line 146
    invoke-interface {v5, v13, v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;->isFallback(Ljava/lang/Class;Ljava/lang/Throwable;)Z

    .line 147
    .line 148
    .line 149
    move-result v5

    .line 150
    if-eqz v5, :cond_5

    .line 151
    .line 152
    invoke-static {}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->access$1500()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    move-result-object v5
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 156
    const/4 v6, 0x1

    .line 157
    move-object v1, p0

    .line 158
    move-object/from16 v7, p5

    .line 159
    .line 160
    move-object v3, v2

    .line 161
    move-object v2, p1

    .line 162
    :try_start_9
    invoke-direct/range {v1 .. v9}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->doTransform(Lnet/bytebuddy/utility/JavaModule;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;ZLjava/security/ProtectionDomain;Lnet/bytebuddy/pool/TypePool;Lnet/bytebuddy/dynamic/ClassFileLocator;)[B

    .line 163
    .line 164
    .line 165
    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 166
    move-object v2, v3

    .line 167
    move-object v1, v4

    .line 168
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    .line 169
    .line 170
    invoke-interface {p0, v1, v2, p1, v12}, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;->onComplete(Ljava/lang/String;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Z)V

    .line 171
    .line 172
    .line 173
    return-object v0

    .line 174
    :catchall_2
    move-exception v0

    .line 175
    move-object v2, v3

    .line 176
    :goto_3
    move-object v1, v4

    .line 177
    :goto_4
    move-object v5, v0

    .line 178
    goto :goto_6

    .line 179
    :catchall_3
    move-exception v0

    .line 180
    goto :goto_3

    .line 181
    :cond_5
    move-object v1, v4

    .line 182
    :try_start_a
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 183
    :catchall_4
    move-exception v0

    .line 184
    goto :goto_4

    .line 185
    :catchall_5
    move-exception v0

    .line 186
    :goto_5
    move-object v13, v6

    .line 187
    goto :goto_4

    .line 188
    :catchall_6
    move-exception v0

    .line 189
    goto :goto_5

    .line 190
    :catchall_7
    move-exception v0

    .line 191
    move-object v2, v3

    .line 192
    goto :goto_5

    .line 193
    :goto_6
    :try_start_b
    iget-object v0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    .line 194
    .line 195
    if-eqz v13, :cond_6

    .line 196
    .line 197
    move v4, v12

    .line 198
    :goto_7
    move-object v3, p1

    .line 199
    goto :goto_8

    .line 200
    :cond_6
    move v4, v11

    .line 201
    goto :goto_7

    .line 202
    :goto_8
    invoke-interface/range {v0 .. v5}, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;->onError(Ljava/lang/String;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;ZLjava/lang/Throwable;)V

    .line 203
    .line 204
    .line 205
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 206
    .line 207
    new-instance v4, Ljava/lang/StringBuilder;

    .line 208
    .line 209
    invoke-direct {v4, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v4

    .line 219
    invoke-direct {v0, v4, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 220
    .line 221
    .line 222
    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    .line 223
    :catchall_8
    move-exception v0

    .line 224
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    .line 225
    .line 226
    if-eqz v13, :cond_7

    .line 227
    .line 228
    move v11, v12

    .line 229
    :cond_7
    invoke-interface {p0, v1, v2, p1, v11}, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;->onComplete(Ljava/lang/String;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Z)V

    .line 230
    .line 231
    .line 232
    throw v0

    .line 233
    :catchall_9
    move-exception v0

    .line 234
    move-object v13, v6

    .line 235
    move-object v5, v0

    .line 236
    :goto_9
    :try_start_c
    iget-object v0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    .line 237
    .line 238
    if-eqz v13, :cond_8

    .line 239
    .line 240
    move v4, v12

    .line 241
    goto :goto_a

    .line 242
    :cond_8
    move v4, v11

    .line 243
    :goto_a
    invoke-interface {v0, v1, v2, p1, v4}, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;->onDiscovery(Ljava/lang/String;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Z)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_a

    .line 244
    .line 245
    .line 246
    iget-object v0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    .line 247
    .line 248
    if-eqz v13, :cond_9

    .line 249
    .line 250
    move v4, v12

    .line 251
    :goto_b
    move-object v3, p1

    .line 252
    goto :goto_c

    .line 253
    :cond_9
    move v4, v11

    .line 254
    goto :goto_b

    .line 255
    :goto_c
    invoke-interface/range {v0 .. v5}, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;->onError(Ljava/lang/String;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;ZLjava/lang/Throwable;)V

    .line 256
    .line 257
    .line 258
    invoke-static {v10, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    invoke-static {p0, v5}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 263
    .line 264
    .line 265
    const/4 p0, 0x0

    .line 266
    return-object p0

    .line 267
    :catchall_a
    move-exception v0

    .line 268
    move-object v7, v0

    .line 269
    iget-object v0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    .line 270
    .line 271
    if-eqz v13, :cond_a

    .line 272
    .line 273
    move v4, v12

    .line 274
    :goto_d
    move-object v3, p1

    .line 275
    move-object/from16 v2, p2

    .line 276
    .line 277
    goto :goto_e

    .line 278
    :cond_a
    move v4, v11

    .line 279
    goto :goto_d

    .line 280
    :goto_e
    invoke-interface/range {v0 .. v5}, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;->onError(Ljava/lang/String;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;ZLjava/lang/Throwable;)V

    .line 281
    .line 282
    .line 283
    throw v7

    .line 284
    :cond_b
    :goto_f
    invoke-static {}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->access$1600()[B

    .line 285
    .line 286
    .line 287
    move-result-object p0

    .line 288
    return-object p0
.end method


# virtual methods
.method public iterator(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Ljava/lang/Class;Ljava/security/ProtectionDomain;)Ljava/util/Iterator;
    .locals 7
    .param p2    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p3    # Lnet/bytebuddy/utility/JavaModule;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Class;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p5    # Ljava/security/ProtectionDomain;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Ljava/lang/ClassLoader;",
            "Lnet/bytebuddy/utility/JavaModule;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/security/ProtectionDomain;",
            ")",
            "Ljava/util/Iterator<",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->ignoreMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    .line 2
    .line 3
    move-object v1, p1

    .line 4
    move-object v2, p2

    .line 5
    move-object v3, p3

    .line 6
    move-object v4, p4

    .line 7
    move-object v5, p5

    .line 8
    invoke-interface/range {v0 .. v5}, Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;->matches(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Ljava/lang/Class;Ljava/security/ProtectionDomain;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    sget-object p0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_0
    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$TransformerIterator;

    .line 22
    .line 23
    iget-object v6, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->transformations:Ljava/util/List;

    .line 24
    .line 25
    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$TransformerIterator;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Ljava/lang/Class;Ljava/security/ProtectionDomain;Ljava/util/List;)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public declared-synchronized reset(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;)Z
    .locals 14

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-interface/range {p1 .. p2}, Ljava/lang/instrument/Instrumentation;->removeTransformer(Ljava/lang/instrument/ClassFileTransformer;)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v3, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    .line 9
    .line 10
    iget-object v4, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    .line 11
    .line 12
    iget-object v5, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->descriptionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;

    .line 13
    .line 14
    iget-object v6, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->fallbackStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;

    .line 15
    .line 16
    iget-object v8, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->lambdaInstrumentationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;

    .line 17
    .line 18
    sget-object v9, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener$NoOp;->INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener$NoOp;

    .line 19
    .line 20
    new-instance v11, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$SimpleMatcher;

    .line 21
    .line 22
    iget-object v0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->ignoreMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    .line 23
    .line 24
    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->transformations:Ljava/util/List;

    .line 25
    .line 26
    invoke-direct {v11, v0, v1}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$SimpleMatcher;-><init>(Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Ljava/util/List;)V

    .line 27
    .line 28
    .line 29
    sget-object v13, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$Inactive;->INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$Inactive;

    .line 30
    .line 31
    move-object v2, p1

    .line 32
    move-object/from16 v1, p3

    .line 33
    .line 34
    move-object/from16 v7, p4

    .line 35
    .line 36
    move-object/from16 v12, p5

    .line 37
    .line 38
    move-object/from16 v10, p6

    .line 39
    .line 40
    invoke-virtual/range {v1 .. v13}, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;->apply(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->installationListener:Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;

    .line 44
    .line 45
    move-object/from16 v1, p2

    .line 46
    .line 47
    invoke-interface {v0, p1, v1}, Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;->onReset(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    monitor-exit p0

    .line 51
    const/4 p0, 0x1

    .line 52
    return p0

    .line 53
    :catchall_0
    move-exception v0

    .line 54
    move-object p1, v0

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    monitor-exit p0

    .line 57
    const/4 p0, 0x0

    .line 58
    return p0

    .line 59
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 60
    throw p1
.end method

.method public transform(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;Ljava/security/ProtectionDomain;[B)[B
    .locals 8
    .param p1    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Class;
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
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/security/ProtectionDomain;",
            "[B)[B"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 294
    iget-object v0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    invoke-interface {v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;->acquire()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 295
    :try_start_0
    new-instance v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$LegacyVmDispatcher;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    :try_start_1
    invoke-direct/range {v1 .. v7}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$LegacyVmDispatcher;-><init>(Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;Ljava/security/ProtectionDomain;[B)V

    iget-object p0, v2, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->accessControlContext:Ljava/lang/Object;

    invoke-static {v1, p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->doPrivileged(Ljava/security/PrivilegedAction;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [B
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 296
    iget-object p1, v2, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    invoke-interface {p1}, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;->release()V

    return-object p0

    :catchall_0
    move-exception v0

    :goto_0
    move-object p0, v0

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v2, p0

    goto :goto_0

    :goto_1
    iget-object p1, v2, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    invoke-interface {p1}, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;->release()V

    .line 297
    throw p0

    .line 298
    :cond_0
    invoke-static {}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->access$1600()[B

    move-result-object p0

    return-object p0
.end method

.method public transform(Ljava/lang/Object;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;Ljava/security/ProtectionDomain;[B)[B
    .locals 9
    .param p2    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Class;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p5    # Ljava/security/ProtectionDomain;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/ClassLoader;",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/security/ProtectionDomain;",
            "[B)[B"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 289
    iget-object v0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    invoke-interface {v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;->acquire()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 290
    :try_start_0
    new-instance v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$Java9CapableVmDispatcher;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    move-object v8, p6

    :try_start_1
    invoke-direct/range {v1 .. v8}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$Java9CapableVmDispatcher;-><init>(Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;Ljava/lang/Object;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;Ljava/security/ProtectionDomain;[B)V

    iget-object p0, v2, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->accessControlContext:Ljava/lang/Object;

    invoke-static {v1, p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->doPrivileged(Ljava/security/PrivilegedAction;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [B
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 291
    iget-object p1, v2, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    invoke-interface {p1}, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;->release()V

    return-object p0

    :catchall_0
    move-exception v0

    :goto_0
    move-object p0, v0

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v2, p0

    goto :goto_0

    :goto_1
    iget-object p1, v2, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    invoke-interface {p1}, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;->release()V

    .line 292
    throw p0

    .line 293
    :cond_0
    invoke-static {}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->access$1600()[B

    move-result-object p0

    return-object p0
.end method
