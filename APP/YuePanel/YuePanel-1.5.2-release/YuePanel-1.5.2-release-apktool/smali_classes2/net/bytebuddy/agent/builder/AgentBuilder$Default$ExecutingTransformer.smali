.class public Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;
.super Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$AbstractBase;
.source "SourceFile"


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

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "java.security.AccessController"

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    const-string v1, "net.bytebuddy.securitymanager"

    const-string v2, "true"

    invoke-static {v1, v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v1

    sput-boolean v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->ACCESS_CONTROLLER:Z
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x1

    :catch_1
    sput-boolean v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->ACCESS_CONTROLLER:Z

    :goto_0
    sget-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$Factory$CreationAction;->INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$Factory$CreationAction;

    invoke-static {v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->access$500(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$Factory;

    sput-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->FACTORY:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$Factory;

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionEnforcer;Ljava/util/List;Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;)V
    .locals 2
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

    move-object v0, p0

    invoke-direct {p0}, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$AbstractBase;-><init>()V

    move-object v1, p1

    iput-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    move-object v1, p4

    iput-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->typeStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;

    move-object v1, p3

    iput-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    move-object v1, p5

    iput-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    move-object v1, p6

    iput-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    move-object v1, p2

    iput-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    move-object v1, p7

    iput-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->nativeMethodStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;

    move-object v1, p8

    iput-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->initializationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;

    move-object v1, p9

    iput-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->injectionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;

    move-object v1, p10

    iput-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->lambdaInstrumentationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;

    move-object v1, p11

    iput-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->descriptionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;

    move-object v1, p12

    iput-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->fallbackStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;

    move-object v1, p13

    iput-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->classFileBufferStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;

    move-object/from16 v1, p14

    iput-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->installationListener:Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;

    move-object/from16 v1, p15

    iput-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->ignoreMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    move-object/from16 v1, p16

    iput-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->resubmissionEnforcer:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionEnforcer;

    move-object/from16 v1, p17

    iput-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->transformations:Ljava/util/List;

    move-object/from16 v1, p18

    iput-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    invoke-static {}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->getContext()Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->accessControlContext:Ljava/lang/Object;

    return-void
.end method

.method public static synthetic access$1800(Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;Lnet/bytebuddy/utility/JavaModule;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;Ljava/security/ProtectionDomain;[B)[B
    .locals 0

    invoke-direct/range {p0 .. p6}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->transform(Lnet/bytebuddy/utility/JavaModule;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;Ljava/security/ProtectionDomain;[B)[B

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

    sget-boolean v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->ACCESS_CONTROLLER:Z

    if-eqz v0, :cond_0

    check-cast p1, Ljava/security/AccessControlContext;

    invoke-static {p0, p1}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;Ljava/security/AccessControlContext;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-interface {p0}, Ljava/security/PrivilegedAction;->run()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private doTransform(Lnet/bytebuddy/utility/JavaModule;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;ZLjava/security/ProtectionDomain;Lnet/bytebuddy/pool/TypePool;Lnet/bytebuddy/dynamic/ClassFileLocator;)[B
    .locals 14
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

    move-object v0, p0

    move-object/from16 v9, p2

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->descriptionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;

    iget-object v5, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move-object/from16 v4, p7

    move-object/from16 v6, p2

    move-object v7, p1

    invoke-interface/range {v1 .. v7}, Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;->apply(Ljava/lang/String;Ljava/lang/Class;Lnet/bytebuddy/pool/TypePool;Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v10

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->ignoreMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    move-object v2, v10

    move-object/from16 v3, p2

    move-object v4, p1

    move-object/from16 v5, p4

    move-object/from16 v6, p6

    invoke-interface/range {v1 .. v6}, Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;->matches(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Ljava/lang/Class;Ljava/security/ProtectionDomain;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->transformations:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;

    invoke-virtual {v8}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;->getMatcher()Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    move-result-object v1

    move-object v2, v10

    move-object/from16 v3, p2

    move-object v4, p1

    move-object/from16 v5, p4

    move-object/from16 v6, p6

    invoke-interface/range {v1 .. v6}, Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;->matches(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Ljava/lang/Class;Ljava/security/ProtectionDomain;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v8}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;->getTransformers()Ljava/util/List;

    move-result-object v1

    invoke-interface {v11, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v8}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;->isTerminal()Z

    move-result v1

    if-eqz v1, :cond_0

    :cond_1
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    move-object v12, p1

    move/from16 v13, p5

    invoke-interface {v1, v10, v9, p1, v13}, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;->onIgnored(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Z)V

    invoke-static {}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;->access$1700()[B

    move-result-object v1

    return-object v1

    :cond_2
    move-object v12, p1

    move/from16 v13, p5

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->typeStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;

    iget-object v3, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    iget-object v2, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->nativeMethodStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;

    invoke-interface {v2}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;->resolve()Lnet/bytebuddy/dynamic/scaffold/inline/MethodNameTransformer;

    move-result-object v5

    move-object v2, v10

    move-object/from16 v4, p8

    move-object/from16 v6, p2

    move-object v7, p1

    move-object/from16 v8, p6

    invoke-interface/range {v1 .. v8}, Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;->builder(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/dynamic/scaffold/inline/MethodNameTransformer;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Ljava/security/ProtectionDomain;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object v1

    iget-object v2, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->initializationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;

    invoke-interface {v2}, Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;->dispatcher()Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy$Dispatcher;

    move-result-object v7

    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    move-object v2, v1

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer;

    move-object v3, v10

    move-object/from16 v4, p2

    move-object v5, p1

    move-object/from16 v6, p6

    invoke-interface/range {v1 .. v6}, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer;->transform(Lnet/bytebuddy/dynamic/DynamicType$Builder;Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Ljava/security/ProtectionDomain;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object v2

    goto :goto_0

    :cond_3
    invoke-interface {v7, v2}, Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy$Dispatcher;->apply(Lnet/bytebuddy/dynamic/DynamicType$Builder;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object v1

    sget-object v2, Lnet/bytebuddy/dynamic/TypeResolutionStrategy$Disabled;->INSTANCE:Lnet/bytebuddy/dynamic/TypeResolutionStrategy$Disabled;

    move-object/from16 v3, p7

    invoke-interface {v1, v2, v3}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->make(Lnet/bytebuddy/dynamic/TypeResolutionStrategy;Lnet/bytebuddy/pool/TypePool;)Lnet/bytebuddy/dynamic/DynamicType$Unloaded;

    move-result-object v8

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->injectionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;

    move-object/from16 v2, p6

    invoke-interface {v7, v8, v9, v2, v1}, Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy$Dispatcher;->register(Lnet/bytebuddy/dynamic/DynamicType;Ljava/lang/ClassLoader;Ljava/security/ProtectionDomain;Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;)V

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    move-object v2, v10

    move-object/from16 v3, p2

    move-object v4, p1

    move/from16 v5, p5

    move-object v6, v8

    invoke-interface/range {v1 .. v6}, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;->onTransformation(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;ZLnet/bytebuddy/dynamic/DynamicType;)V

    invoke-interface {v8}, Lnet/bytebuddy/dynamic/DynamicType;->getBytes()[B

    move-result-object v1

    return-object v1
.end method

.method private static getContext()Ljava/lang/Object;
    .locals 1
    .annotation runtime Lnet/bytebuddy/build/AccessControllerPlugin$Enhance;
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    sget-boolean v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->ACCESS_CONTROLLER:Z

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/security/AccessController;->getContext()Ljava/security/AccessControlContext;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private transform(Lnet/bytebuddy/utility/JavaModule;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;Ljava/security/ProtectionDomain;[B)[B
    .locals 19
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

    move-object/from16 v10, p0

    move-object/from16 v11, p1

    move-object/from16 v12, p2

    move-object/from16 v0, p3

    move-object/from16 v13, p4

    const/4 v14, 0x1

    const/4 v15, 0x0

    .line 11
    const-string v9, "Failed transformation of "

    if-eqz v0, :cond_b

    iget-object v1, v10, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->lambdaInstrumentationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;

    invoke-virtual {v1, v13}, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;->isInstrumented(Ljava/lang/Class;)Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_a

    :cond_0
    const/16 v1, 0x2f

    const/16 v2, 0x2e

    .line 12
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v8

    .line 13
    :try_start_0
    iget-object v0, v10, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->resubmissionEnforcer:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionEnforcer;

    invoke-interface {v0, v8, v12, v11, v13}, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionEnforcer;->isEnforced(Ljava/lang/String;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 14
    invoke-static {}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->access$1600()[B

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    move-exception v0

    move-object v15, v8

    move-object v7, v9

    move-object v8, v0

    goto/16 :goto_6

    .line 15
    :cond_1
    :try_start_1
    iget-object v0, v10, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    if-eqz v13, :cond_2

    move v1, v14

    goto :goto_0

    :cond_2
    move v1, v15

    :goto_0
    invoke-interface {v0, v8, v12, v11, v1}, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;->onDiscovery(Ljava/lang/String;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Z)V

    .line 16
    new-instance v7, Lnet/bytebuddy/dynamic/ClassFileLocator$Compound;

    iget-object v1, v10, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->classFileBufferStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;

    move-object v2, v8

    move-object/from16 v3, p6

    move-object/from16 v4, p2

    move-object/from16 v5, p1

    move-object/from16 v6, p5

    invoke-interface/range {v1 .. v6}, Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;->resolve(Ljava/lang/String;[BLjava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Ljava/security/ProtectionDomain;)Lnet/bytebuddy/dynamic/ClassFileLocator;

    move-result-object v0

    iget-object v1, v10, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    iget-object v2, v10, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    .line 17
    invoke-interface {v2, v12, v11}, Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;->classFileLocator(Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;)Lnet/bytebuddy/dynamic/ClassFileLocator;

    move-result-object v2

    const/4 v3, 0x3

    new-array v3, v3, [Lnet/bytebuddy/dynamic/ClassFileLocator;

    aput-object v0, v3, v15

    aput-object v1, v3, v14

    const/4 v0, 0x2

    aput-object v2, v3, v0

    invoke-direct {v7, v3}, Lnet/bytebuddy/dynamic/ClassFileLocator$Compound;-><init>([Lnet/bytebuddy/dynamic/ClassFileLocator;)V

    .line 18
    iget-object v0, v10, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->classFileBufferStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;

    iget-object v1, v10, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    invoke-interface {v0, v1, v7, v12, v8}, Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;->typePool(Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/dynamic/ClassFileLocator;Ljava/lang/ClassLoader;Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool;

    move-result-object v16
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    if-eqz v13, :cond_3

    move v6, v14

    goto :goto_1

    :cond_3
    move v6, v15

    :goto_1
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object v4, v8

    move-object/from16 v5, p4

    move-object/from16 v17, v7

    move-object/from16 v7, p5

    move-object v15, v8

    move-object/from16 v8, v16

    move-object/from16 v18, v9

    move-object/from16 v9, v17

    .line 19
    :try_start_2
    invoke-direct/range {v1 .. v9}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->doTransform(Lnet/bytebuddy/utility/JavaModule;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;ZLjava/security/ProtectionDomain;Lnet/bytebuddy/pool/TypePool;Lnet/bytebuddy/dynamic/ClassFileLocator;)[B

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 20
    iget-object v1, v10, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    if-eqz v13, :cond_4

    goto :goto_2

    :cond_4
    const/4 v14, 0x0

    :goto_2
    invoke-interface {v1, v15, v12, v11, v14}, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;->onComplete(Ljava/lang/String;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Z)V

    return-object v0

    :catchall_1
    move-exception v0

    move-object v1, v0

    if-eqz v13, :cond_5

    .line 21
    :try_start_3
    iget-object v0, v10, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->descriptionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;

    invoke-interface {v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;->isLoadedFirst()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, v10, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->fallbackStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;

    invoke-interface {v0, v13, v1}, Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;->isFallback(Ljava/lang/Class;Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 22
    invoke-static {}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->access$1500()Ljava/lang/Class;

    move-result-object v5

    const/4 v6, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object v4, v15

    move-object/from16 v7, p5

    move-object/from16 v8, v16

    move-object/from16 v9, v17

    invoke-direct/range {v1 .. v9}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->doTransform(Lnet/bytebuddy/utility/JavaModule;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;ZLjava/security/ProtectionDomain;Lnet/bytebuddy/pool/TypePool;Lnet/bytebuddy/dynamic/ClassFileLocator;)[B

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 23
    iget-object v1, v10, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    invoke-interface {v1, v15, v12, v11, v14}, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;->onComplete(Ljava/lang/String;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Z)V

    return-object v0

    :catchall_2
    move-exception v0

    goto :goto_3

    .line 24
    :cond_5
    :try_start_4
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_3
    move-exception v0

    move-object v15, v8

    move-object/from16 v18, v9

    .line 25
    :goto_3
    :try_start_5
    iget-object v1, v10, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    if-eqz v13, :cond_6

    move v5, v14

    goto :goto_4

    :cond_6
    const/4 v5, 0x0

    :goto_4
    move-object v2, v15

    move-object/from16 v3, p2

    move-object/from16 v4, p1

    move-object v6, v0

    invoke-interface/range {v1 .. v6}, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;->onError(Ljava/lang/String;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;ZLjava/lang/Throwable;)V

    .line 26
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v7, v18

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    :catchall_4
    move-exception v0

    .line 27
    iget-object v1, v10, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    if-eqz v13, :cond_7

    goto :goto_5

    :cond_7
    const/4 v14, 0x0

    :goto_5
    invoke-interface {v1, v15, v12, v11, v14}, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;->onComplete(Ljava/lang/String;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Z)V

    .line 28
    throw v0

    .line 29
    :goto_6
    :try_start_6
    iget-object v0, v10, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    if-eqz v13, :cond_8

    move v1, v14

    goto :goto_7

    :cond_8
    const/4 v1, 0x0

    :goto_7
    invoke-interface {v0, v15, v12, v11, v1}, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;->onDiscovery(Ljava/lang/String;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Z)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 30
    iget-object v1, v10, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    if-eqz v13, :cond_9

    move v5, v14

    goto :goto_8

    :cond_9
    const/4 v5, 0x0

    :goto_8
    move-object v2, v15

    move-object/from16 v3, p2

    move-object/from16 v4, p1

    move-object v6, v8

    invoke-interface/range {v1 .. v6}, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;->onError(Ljava/lang/String;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;ZLjava/lang/Throwable;)V

    .line 31
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catchall_5
    move-exception v0

    .line 32
    iget-object v1, v10, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    if-eqz v13, :cond_a

    move v5, v14

    goto :goto_9

    :cond_a
    const/4 v5, 0x0

    :goto_9
    move-object v2, v15

    move-object/from16 v3, p2

    move-object/from16 v4, p1

    move-object v6, v8

    invoke-interface/range {v1 .. v6}, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;->onError(Ljava/lang/String;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;ZLjava/lang/Throwable;)V

    .line 33
    throw v0

    .line 34
    :cond_b
    :goto_a
    invoke-static {}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->access$1600()[B

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public iterator(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Ljava/lang/Class;Ljava/security/ProtectionDomain;)Ljava/util/Iterator;
    .locals 8
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

    iget-object v0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->ignoreMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;->matches(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Ljava/lang/Class;Ljava/security/ProtectionDomain;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance v7, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$TransformerIterator;

    iget-object v6, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->transformations:Ljava/util/List;

    move-object v0, v7

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$TransformerIterator;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Ljava/lang/Class;Ljava/security/ProtectionDomain;Ljava/util/List;)V

    move-object p1, v7

    :goto_0
    return-object p1
.end method

.method public declared-synchronized reset(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;)Z
    .locals 15

    move-object v1, p0

    monitor-enter p0

    :try_start_0
    invoke-interface/range {p1 .. p2}, Ljava/lang/instrument/Instrumentation;->removeTransformer(Ljava/lang/instrument/ClassFileTransformer;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v4, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    iget-object v5, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    iget-object v6, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->descriptionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;

    iget-object v7, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->fallbackStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;

    iget-object v9, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->lambdaInstrumentationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;

    sget-object v10, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener$NoOp;->INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener$NoOp;

    new-instance v12, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$SimpleMatcher;

    iget-object v0, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->ignoreMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    iget-object v2, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->transformations:Ljava/util/List;

    invoke-direct {v12, v0, v2}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$SimpleMatcher;-><init>(Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Ljava/util/List;)V

    sget-object v14, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$Inactive;->INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$Inactive;

    move-object/from16 v2, p3

    move-object/from16 v3, p1

    move-object/from16 v8, p4

    move-object/from16 v11, p6

    move-object/from16 v13, p5

    invoke-virtual/range {v2 .. v14}, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;->apply(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;)V

    iget-object v0, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->installationListener:Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    invoke-interface {v0, v2, v3}, Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;->onReset(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
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

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    invoke-interface {v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;->acquire()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    :try_start_0
    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$LegacyVmDispatcher;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-direct/range {v1 .. v7}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$LegacyVmDispatcher;-><init>(Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;Ljava/security/ProtectionDomain;[B)V

    iget-object p1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->accessControlContext:Ljava/lang/Object;

    invoke-static {v0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->doPrivileged(Ljava/security/PrivilegedAction;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    iget-object p2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    invoke-interface {p2}, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;->release()V

    return-object p1

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    invoke-interface {p2}, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;->release()V

    .line 4
    throw p1

    .line 5
    :cond_0
    invoke-static {}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->access$1600()[B

    move-result-object p1

    return-object p1
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

    .line 6
    iget-object v0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    invoke-interface {v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;->acquire()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 7
    :try_start_0
    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$Java9CapableVmDispatcher;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    move-object v8, p6

    invoke-direct/range {v1 .. v8}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$Java9CapableVmDispatcher;-><init>(Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;Ljava/lang/Object;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;Ljava/security/ProtectionDomain;[B)V

    iget-object p1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->accessControlContext:Ljava/lang/Object;

    invoke-static {v0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->doPrivileged(Ljava/security/PrivilegedAction;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    iget-object p2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    invoke-interface {p2}, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;->release()V

    return-object p1

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    invoke-interface {p2}, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;->release()V

    .line 9
    throw p1

    .line 10
    :cond_0
    invoke-static {}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->access$1600()[B

    move-result-object p1

    return-object p1
.end method
