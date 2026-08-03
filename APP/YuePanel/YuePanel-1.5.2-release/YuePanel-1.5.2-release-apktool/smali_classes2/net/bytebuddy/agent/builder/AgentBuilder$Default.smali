.class public Lnet/bytebuddy/agent/builder/AgentBuilder$Default;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/agent/builder/AgentBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Default"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Redefining;,
        Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;,
        Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Ignoring;,
        Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;,
        Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;,
        Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;,
        Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;,
        Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;,
        Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Dispatcher;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final ACCESS_CONTROLLER:Z

.field private static final DEFAULT_LOCK:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

.field private static final DISPATCHER:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Dispatcher;

.field private static final INSTALLER_GETTER:Ljava/lang/String; = "getInstrumentation"

.field private static final INSTALLER_TYPE:Ljava/lang/String; = "net.bytebuddy.agent.Installer"

.field private static final NOT_PREVIOUSLY_DEFINED:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/AlwaysNull;
    .end annotation
.end field

.field private static final NO_TRANSFORMATION:[B
    .annotation runtime Lnet/bytebuddy/utility/nullability/AlwaysNull;
    .end annotation
.end field


# instance fields
.field protected final byteBuddy:Lnet/bytebuddy/ByteBuddy;

.field protected final circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

.field protected final classFileBufferStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;

.field protected final classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

.field protected final descriptionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;

.field protected final fallbackStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;

.field protected final ignoreMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

.field protected final initializationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;

.field protected final injectionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;

.field protected final installationListener:Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;

.field protected final lambdaInstrumentationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;

.field protected final listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

.field protected final locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

.field protected final nativeMethodStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;

.field protected final poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

.field protected final redefinitionBatchAllocator:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;

.field protected final redefinitionDiscoveryStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;

.field protected final redefinitionListener:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;

.field protected final redefinitionResubmissionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;

.field protected final redefinitionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;

.field protected final transformations:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;",
            ">;"
        }
    .end annotation
.end field

.field protected final transformerDecorator:Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;

.field protected final typeStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;

.field protected final warmupStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    const-string v2, "java.security.AccessController"

    invoke-static {v2, v0, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    const-string v2, "net.bytebuddy.securitymanager"

    const-string v3, "true"

    invoke-static {v2, v3}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v2

    sput-boolean v2, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->ACCESS_CONTROLLER:Z
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x1

    :catch_1
    sput-boolean v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->ACCESS_CONTROLLER:Z

    :goto_0
    sput-object v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->NO_TRANSFORMATION:[B

    sput-object v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->NOT_PREVIOUSLY_DEFINED:Ljava/lang/Class;

    const-class v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Dispatcher;

    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;

    move-result-object v0

    invoke-static {v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Dispatcher;

    sput-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->DISPATCHER:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Dispatcher;

    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$Default;

    invoke-direct {v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock$Default;-><init>()V

    sput-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->DEFAULT_LOCK:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/ByteBuddy;

    invoke-direct {v0}, Lnet/bytebuddy/ByteBuddy;-><init>()V

    invoke-direct {p0, v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;-><init>(Lnet/bytebuddy/ByteBuddy;)V

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/ByteBuddy;)V
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 2
    sget-object v2, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener$NoOp;->INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener$NoOp;

    sget-object v3, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->DEFAULT_LOCK:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    sget-object v4, Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$Default;->FAST:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy$Default;

    sget-object v5, Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy$Default;->REBASE:Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy$Default;

    sget-object v6, Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy$ForClassLoader;->STRONG:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy$ForClassLoader;

    sget-object v7, Lnet/bytebuddy/dynamic/ClassFileLocator$NoOp;->INSTANCE:Lnet/bytebuddy/dynamic/ClassFileLocator$NoOp;

    sget-object v8, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy$Disabled;->INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy$Disabled;

    sget-object v9, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy$NoOp;->INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy$NoOp;

    sget-object v10, Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator$NoOp;->INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator$NoOp;

    new-instance v12, Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy$SelfInjection$Split;

    move-object v11, v12

    invoke-direct {v12}, Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy$SelfInjection$Split;-><init>()V

    sget-object v12, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;->DISABLED:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;

    sget-object v13, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy$SinglePass;->INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy$SinglePass;

    sget-object v14, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator$ForTotal;->INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator$ForTotal;

    sget-object v15, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener$NoOp;->INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener$NoOp;

    sget-object v16, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy$Disabled;->INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy$Disabled;

    sget-object v17, Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy$UsingReflection;->INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy$UsingReflection;

    sget-object v18, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;->DISABLED:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;

    sget-object v19, Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy$Default;->HYBRID:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy$Default;

    .line 3
    invoke-static {}, Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy$ByThrowableType;->ofOptionalTypes()Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;

    move-result-object v20

    sget-object v21, Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy$Default;->RETAINING:Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy$Default;

    sget-object v22, Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener$NoOp;->INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener$NoOp;

    move-object/from16 v25, v0

    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher$Disjunction;

    move-object/from16 v23, v0

    new-instance v1, Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher$ForElementMatchers;

    move-object/from16 v26, v2

    .line 4
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->any()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v2

    move-object/from16 v27, v3

    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isBootstrapClassLoader()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v3

    move-object/from16 v28, v4

    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isExtensionClassLoader()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v4

    invoke-interface {v3, v4}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->or(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher$ForElementMatchers;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;)V

    new-instance v2, Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher$ForElementMatchers;

    const-string v3, "net.bytebuddy."

    .line 5
    invoke-static {v3}, Lnet/bytebuddy/matcher/ElementMatchers;->nameStartsWith(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v3

    const-string v4, "net.bytebuddy.renamed."

    .line 6
    invoke-static {v4}, Lnet/bytebuddy/matcher/ElementMatchers;->nameStartsWith(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v4

    invoke-static {v4}, Lnet/bytebuddy/matcher/ElementMatchers;->not(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v4

    invoke-interface {v3, v4}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v3

    const-string v4, "sun.reflect."

    .line 7
    invoke-static {v4}, Lnet/bytebuddy/matcher/ElementMatchers;->nameStartsWith(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v4

    const-string v24, "jdk.internal.reflect."

    move-object/from16 v29, v5

    invoke-static/range {v24 .. v24}, Lnet/bytebuddy/matcher/ElementMatchers;->nameStartsWith(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v5

    invoke-interface {v4, v5}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->or(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v4

    invoke-interface {v3, v4}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->or(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v3

    .line 8
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isSynthetic()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v4

    invoke-interface {v3, v4}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->or(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v3

    invoke-direct {v2, v3}, Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher$ForElementMatchers;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;)V

    const/4 v3, 0x2

    new-array v3, v3, [Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v1, 0x1

    aput-object v2, v3, v1

    invoke-direct {v0, v3}, Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher$Disjunction;-><init>([Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;)V

    .line 9
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v24

    move-object/from16 v1, p1

    move-object/from16 v0, v25

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    move-object/from16 v4, v28

    move-object/from16 v5, v29

    .line 10
    invoke-direct/range {v0 .. v24}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;-><init>(Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/ByteBuddy;",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;",
            "Lnet/bytebuddy/dynamic/ClassFileLocator;",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation;",
            ">;)V"
        }
    .end annotation

    move-object v0, p0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    .line 12
    iput-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    move-object v1, p2

    .line 13
    iput-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    move-object v1, p3

    .line 14
    iput-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    move-object v1, p4

    .line 15
    iput-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    move-object v1, p5

    .line 16
    iput-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->typeStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;

    move-object v1, p6

    .line 17
    iput-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    move-object v1, p7

    .line 18
    iput-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    move-object v1, p8

    .line 19
    iput-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->nativeMethodStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;

    move-object v1, p9

    .line 20
    iput-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->warmupStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;

    move-object v1, p10

    .line 21
    iput-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformerDecorator:Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;

    move-object v1, p11

    .line 22
    iput-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->initializationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;

    move-object v1, p12

    .line 23
    iput-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;

    move-object v1, p13

    .line 24
    iput-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionDiscoveryStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;

    move-object/from16 v1, p14

    .line 25
    iput-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionBatchAllocator:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;

    move-object/from16 v1, p15

    .line 26
    iput-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionListener:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;

    move-object/from16 v1, p16

    .line 27
    iput-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionResubmissionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;

    move-object/from16 v1, p17

    .line 28
    iput-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->injectionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;

    move-object/from16 v1, p18

    .line 29
    iput-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->lambdaInstrumentationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;

    move-object/from16 v1, p19

    .line 30
    iput-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->descriptionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;

    move-object/from16 v1, p20

    .line 31
    iput-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->fallbackStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;

    move-object/from16 v1, p21

    .line 32
    iput-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileBufferStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;

    move-object/from16 v1, p22

    .line 33
    iput-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->installationListener:Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;

    move-object/from16 v1, p23

    .line 34
    iput-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->ignoreMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    move-object/from16 v1, p24

    .line 35
    iput-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformations:Ljava/util/List;

    return-void
.end method

.method public static synthetic access$1400()Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Dispatcher;
    .locals 1

    sget-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->DISPATCHER:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Dispatcher;

    return-object v0
.end method

.method public static synthetic access$1500()Ljava/lang/Class;
    .locals 1

    sget-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->NOT_PREVIOUSLY_DEFINED:Ljava/lang/Class;

    return-object v0
.end method

.method public static synthetic access$1600()[B
    .locals 1

    sget-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->NO_TRANSFORMATION:[B

    return-object v0
.end method

.method public static synthetic access$500(Ljava/security/PrivilegedAction;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private doInstall(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler;)Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v15, p1

    move-object/from16 v0, p3

    iget-object v2, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    invoke-interface {v2}, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;->acquire()Z

    move-result v2

    if-eqz v2, :cond_3

    :try_start_0
    iget-object v2, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionResubmissionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;

    iget-object v4, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    iget-object v5, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    iget-object v6, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->descriptionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;

    iget-object v7, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->fallbackStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;

    iget-object v8, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    iget-object v9, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->installationListener:Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;

    iget-object v10, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    new-instance v11, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$SimpleMatcher;

    iget-object v3, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->ignoreMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    iget-object v12, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformations:Ljava/util/List;

    invoke-direct {v11, v3, v12}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$SimpleMatcher;-><init>(Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Ljava/util/List;)V

    iget-object v12, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;

    iget-object v13, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionBatchAllocator:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;

    iget-object v14, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionListener:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;

    move-object/from16 v3, p1

    invoke-interface/range {v2 .. v14}, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;->apply(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;)Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy$Installation;

    move-result-object v16

    iget-object v2, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformerDecorator:Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;

    invoke-virtual/range {v16 .. v16}, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy$Installation;->getListener()Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    move-result-object v3

    invoke-virtual/range {v16 .. v16}, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy$Installation;->getInstallationListener()Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;

    move-result-object v4

    invoke-virtual/range {v16 .. v16}, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy$Installation;->getResubmissionEnforcer()Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionEnforcer;

    move-result-object v5

    invoke-direct {v1, v3, v4, v5}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->makeRaw(Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionEnforcer;)Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    move-result-object v3

    invoke-interface {v2, v3}, Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;->decorate(Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;)Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    move-result-object v14

    invoke-virtual/range {v16 .. v16}, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy$Installation;->getInstallationListener()Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;

    move-result-object v2

    invoke-interface {v2, v15, v14}, Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;->onBeforeInstall(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    :try_start_1
    iget-object v4, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->warmupStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;

    iget-object v6, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    iget-object v7, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;

    iget-object v8, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    invoke-virtual/range {v16 .. v16}, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy$Installation;->getInstallationListener()Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;

    move-result-object v9

    move-object v5, v14

    invoke-interface/range {v4 .. v9}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;->apply(Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;)V

    invoke-interface {v0, v15}, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler;->onBeforeRegistration(Ljava/lang/instrument/Instrumentation;)V

    invoke-interface {v0, v14}, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler;->onRegistration(Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;

    invoke-virtual {v2}, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;->isRetransforming()Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v2, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->DISPATCHER:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Dispatcher;

    const/4 v3, 0x1

    invoke-interface {v2, v15, v14, v3}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Dispatcher;->addTransformer(Ljava/lang/instrument/Instrumentation;Ljava/lang/instrument/ClassFileTransformer;Z)V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v1, v14

    goto :goto_1

    :cond_0
    invoke-interface {v15, v14}, Ljava/lang/instrument/Instrumentation;->addTransformer(Ljava/lang/instrument/ClassFileTransformer;)V

    :cond_1
    :goto_0
    invoke-interface {v0, v15}, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler;->onAfterRegistration(Ljava/lang/instrument/Instrumentation;)V

    iget-object v0, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->nativeMethodStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;

    invoke-interface {v0, v15, v14}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;->apply(Ljava/lang/instrument/Instrumentation;Ljava/lang/instrument/ClassFileTransformer;)V

    iget-object v0, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->lambdaInstrumentationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;

    iget-object v2, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    invoke-virtual {v0, v2, v15, v14}, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;->apply(Lnet/bytebuddy/ByteBuddy;Ljava/lang/instrument/Instrumentation;Ljava/lang/instrument/ClassFileTransformer;)V

    iget-object v2, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;

    iget-object v4, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    iget-object v5, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    iget-object v6, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->descriptionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;

    iget-object v7, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->fallbackStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;

    iget-object v8, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionDiscoveryStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;

    iget-object v9, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->lambdaInstrumentationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;

    invoke-virtual/range {v16 .. v16}, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy$Installation;->getListener()Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    move-result-object v10

    iget-object v11, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionListener:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;

    iget-object v13, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionBatchAllocator:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;

    iget-object v0, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object/from16 v3, p1

    move-object/from16 v12, p2

    move-object v1, v14

    move-object v14, v0

    :try_start_2
    invoke-virtual/range {v2 .. v14}, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;->apply(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    :goto_1
    :try_start_3
    invoke-virtual/range {v16 .. v16}, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy$Installation;->getInstallationListener()Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;

    move-result-object v2

    invoke-interface {v2, v15, v1, v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;->onError(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_2

    :goto_2
    invoke-virtual/range {v16 .. v16}, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy$Installation;->getInstallationListener()Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;

    move-result-object v0

    invoke-interface {v0, v15, v1}, Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;->onInstall(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    move-object v2, v1

    move-object/from16 v1, p0

    iget-object v0, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    invoke-interface {v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;->release()V

    return-object v2

    :catchall_2
    move-exception v0

    move-object/from16 v1, p0

    goto :goto_3

    :cond_2
    move-object v2, v1

    move-object/from16 v1, p0

    :try_start_4
    invoke-interface {v15, v2}, Ljava/lang/instrument/Instrumentation;->removeTransformer(Ljava/lang/instrument/ClassFileTransformer;)Z

    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "Could not install class file transformer"

    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :catchall_3
    move-exception v0

    :goto_3
    iget-object v2, v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    invoke-interface {v2}, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;->release()V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Could not acquire the circularity lock upon installation."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
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

    sget-boolean v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->ACCESS_CONTROLLER:Z

    if-eqz v0, :cond_0

    invoke-static {p0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-interface {p0}, Ljava/security/PrivilegedAction;->run()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private makeRaw(Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionEnforcer;)Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v3, p1

    move-object/from16 v15, p2

    move-object/from16 v17, p3

    .line 3
    sget-object v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;->FACTORY:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$Factory;

    iget-object v2, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    iget-object v4, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    iget-object v5, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->typeStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;

    iget-object v6, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    iget-object v7, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    iget-object v8, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->nativeMethodStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;

    iget-object v9, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->initializationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;

    iget-object v10, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->injectionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;

    iget-object v11, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->lambdaInstrumentationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;

    iget-object v12, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->descriptionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;

    iget-object v13, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->fallbackStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;

    iget-object v14, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileBufferStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;

    move-object/from16 p1, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->ignoreMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    move-object/from16 v16, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformations:Ljava/util/List;

    move-object/from16 v18, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    move-object/from16 v19, v1

    move-object/from16 v1, p1

    invoke-interface/range {v1 .. v19}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$Factory;->make(Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionEnforcer;Ljava/util/List;Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;)Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    move-result-object v1

    return-object v1
.end method

.method public static of(Ljava/util/List;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/build/Plugin;",
            ">;)",
            "Lnet/bytebuddy/agent/builder/AgentBuilder;"
        }
    .end annotation

    .line 2
    sget-object v0, Lnet/bytebuddy/build/EntryPoint$Default;->REBASE:Lnet/bytebuddy/build/EntryPoint$Default;

    invoke-static {v0, p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->of(Lnet/bytebuddy/build/EntryPoint;Ljava/util/List;)Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    return-object p0
.end method

.method public static of(Lnet/bytebuddy/ClassFileVersion;Ljava/util/List;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/ClassFileVersion;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/build/Plugin;",
            ">;)",
            "Lnet/bytebuddy/agent/builder/AgentBuilder;"
        }
    .end annotation

    .line 6
    sget-object v0, Lnet/bytebuddy/build/EntryPoint$Default;->REBASE:Lnet/bytebuddy/build/EntryPoint$Default;

    invoke-static {v0, p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->of(Lnet/bytebuddy/build/EntryPoint;Lnet/bytebuddy/ClassFileVersion;Ljava/util/List;)Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    return-object p0
.end method

.method public static varargs of(Lnet/bytebuddy/ClassFileVersion;[Lnet/bytebuddy/build/Plugin;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 0

    .line 5
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->of(Lnet/bytebuddy/ClassFileVersion;Ljava/util/List;)Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    return-object p0
.end method

.method public static of(Lnet/bytebuddy/build/EntryPoint;Ljava/util/List;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/build/EntryPoint;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/build/Plugin;",
            ">;)",
            "Lnet/bytebuddy/agent/builder/AgentBuilder;"
        }
    .end annotation

    .line 4
    sget-object v0, Lnet/bytebuddy/ClassFileVersion;->JAVA_V5:Lnet/bytebuddy/ClassFileVersion;

    invoke-static {v0}, Lnet/bytebuddy/ClassFileVersion;->ofThisVm(Lnet/bytebuddy/ClassFileVersion;)Lnet/bytebuddy/ClassFileVersion;

    move-result-object v0

    invoke-static {p0, v0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->of(Lnet/bytebuddy/build/EntryPoint;Lnet/bytebuddy/ClassFileVersion;Ljava/util/List;)Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    return-object p0
.end method

.method public static of(Lnet/bytebuddy/build/EntryPoint;Lnet/bytebuddy/ClassFileVersion;Ljava/util/List;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/build/EntryPoint;",
            "Lnet/bytebuddy/ClassFileVersion;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/build/Plugin;",
            ">;)",
            "Lnet/bytebuddy/agent/builder/AgentBuilder;"
        }
    .end annotation

    .line 8
    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;

    invoke-interface {p0, p1}, Lnet/bytebuddy/build/EntryPoint;->byteBuddy(Lnet/bytebuddy/ClassFileVersion;)Lnet/bytebuddy/ByteBuddy;

    move-result-object p1

    invoke-direct {v0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;-><init>(Lnet/bytebuddy/ByteBuddy;)V

    new-instance p1, Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy$ForBuildEntryPoint;

    invoke-direct {p1, p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy$ForBuildEntryPoint;-><init>(Lnet/bytebuddy/build/EntryPoint;)V

    invoke-virtual {v0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->with(Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;)Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    .line 9
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lnet/bytebuddy/build/Plugin;

    .line 10
    invoke-interface {p0, p2}, Lnet/bytebuddy/agent/builder/AgentBuilder;->type(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$Identified$Narrowable;

    move-result-object p0

    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForBuildPlugin;

    invoke-direct {v0, p2}, Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer$ForBuildPlugin;-><init>(Lnet/bytebuddy/build/Plugin;)V

    invoke-interface {p0, v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Identified;->transform(Lnet/bytebuddy/agent/builder/AgentBuilder$Transformer;)Lnet/bytebuddy/agent/builder/AgentBuilder$Identified$Extendable;

    move-result-object p0

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public static varargs of(Lnet/bytebuddy/build/EntryPoint;Lnet/bytebuddy/ClassFileVersion;[Lnet/bytebuddy/build/Plugin;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 0

    .line 7
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->of(Lnet/bytebuddy/build/EntryPoint;Lnet/bytebuddy/ClassFileVersion;Ljava/util/List;)Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    return-object p0
.end method

.method public static varargs of(Lnet/bytebuddy/build/EntryPoint;[Lnet/bytebuddy/build/Plugin;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 0

    .line 3
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->of(Lnet/bytebuddy/build/EntryPoint;Ljava/util/List;)Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    return-object p0
.end method

.method public static varargs of([Lnet/bytebuddy/build/Plugin;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 0

    .line 1
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->of(Ljava/util/List;)Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    return-object p0
.end method

.method private static resolveByteBuddyAgentInstrumentation()Ljava/lang/instrument/Instrumentation;
    .locals 6

    :try_start_0
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const-string v1, "net.bytebuddy.agent.Installer"

    invoke-virtual {v0, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lnet/bytebuddy/agent/builder/AgentBuilder;

    invoke-static {v1}, Lnet/bytebuddy/utility/JavaModule;->ofType(Ljava/lang/Class;)Lnet/bytebuddy/utility/JavaModule;

    move-result-object v1

    invoke-static {v0}, Lnet/bytebuddy/utility/JavaModule;->ofType(Ljava/lang/Class;)Lnet/bytebuddy/utility/JavaModule;

    move-result-object v2

    if-eqz v1, :cond_0

    invoke-virtual {v1, v2}, Lnet/bytebuddy/utility/JavaModule;->canRead(Lnet/bytebuddy/utility/JavaModule;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "java.lang.Module"

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    const-string v4, "addReads"

    filled-new-array {v3}, [Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    invoke-virtual {v1}, Lnet/bytebuddy/utility/JavaModule;->unwrap()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v2}, Lnet/bytebuddy/utility/JavaModule;->unwrap()Ljava/lang/Object;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v3, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_2

    :cond_0
    :goto_0
    const-string v1, "getInstrumentation"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/instrument/Instrumentation;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :goto_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "The Byte Buddy agent is not installed or not accessible"

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :goto_2
    throw v0
.end method


# virtual methods
.method public assureReadEdgeFromAndTo(Ljava/lang/instrument/Instrumentation;Ljava/util/Collection;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/instrument/Instrumentation;",
            "Ljava/util/Collection<",
            "+",
            "Lnet/bytebuddy/utility/JavaModule;",
            ">;)",
            "Lnet/bytebuddy/agent/builder/AgentBuilder;"
        }
    .end annotation

    .line 4
    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener$ModuleReadEdgeCompleting;

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1, p2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    const/4 p2, 0x1

    invoke-direct {v0, p1, p2, v1}, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener$ModuleReadEdgeCompleting;-><init>(Ljava/lang/instrument/Instrumentation;ZLjava/util/Set;)V

    invoke-virtual {p0, v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->with(Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;)Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p1

    return-object p1
.end method

.method public varargs assureReadEdgeFromAndTo(Ljava/lang/instrument/Instrumentation;[Ljava/lang/Class;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/instrument/Instrumentation;",
            "[",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/agent/builder/AgentBuilder;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lnet/bytebuddy/utility/JavaModule;->isSupported()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 2
    invoke-static {p1, v0, p2}, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener$ModuleReadEdgeCompleting;->of(Ljava/lang/instrument/Instrumentation;Z[Ljava/lang/Class;)Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->with(Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;)Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, p0

    :goto_0
    return-object p1
.end method

.method public varargs assureReadEdgeFromAndTo(Ljava/lang/instrument/Instrumentation;[Lnet/bytebuddy/utility/JavaModule;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 0

    .line 3
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->assureReadEdgeFromAndTo(Ljava/lang/instrument/Instrumentation;Ljava/util/Collection;)Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p1

    return-object p1
.end method

.method public assureReadEdgeTo(Ljava/lang/instrument/Instrumentation;Ljava/util/Collection;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/instrument/Instrumentation;",
            "Ljava/util/Collection<",
            "+",
            "Lnet/bytebuddy/utility/JavaModule;",
            ">;)",
            "Lnet/bytebuddy/agent/builder/AgentBuilder;"
        }
    .end annotation

    .line 4
    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener$ModuleReadEdgeCompleting;

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1, p2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    const/4 p2, 0x0

    invoke-direct {v0, p1, p2, v1}, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener$ModuleReadEdgeCompleting;-><init>(Ljava/lang/instrument/Instrumentation;ZLjava/util/Set;)V

    invoke-virtual {p0, v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->with(Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;)Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p1

    return-object p1
.end method

.method public varargs assureReadEdgeTo(Ljava/lang/instrument/Instrumentation;[Ljava/lang/Class;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/instrument/Instrumentation;",
            "[",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/agent/builder/AgentBuilder;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lnet/bytebuddy/utility/JavaModule;->isSupported()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 2
    invoke-static {p1, v0, p2}, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener$ModuleReadEdgeCompleting;->of(Ljava/lang/instrument/Instrumentation;Z[Ljava/lang/Class;)Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->with(Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;)Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, p0

    :goto_0
    return-object p1
.end method

.method public varargs assureReadEdgeTo(Ljava/lang/instrument/Instrumentation;[Lnet/bytebuddy/utility/JavaModule;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 0

    .line 3
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->assureReadEdgeTo(Ljava/lang/instrument/Instrumentation;Ljava/util/Collection;)Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p1

    return-object p1
.end method

.method public disableClassFormatChanges()Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 27

    move-object/from16 v0, p0

    new-instance v26, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    sget-object v2, Lnet/bytebuddy/implementation/Implementation$Context$Disabled$Factory;->INSTANCE:Lnet/bytebuddy/implementation/Implementation$Context$Disabled$Factory;

    invoke-virtual {v1, v2}, Lnet/bytebuddy/ByteBuddy;->with(Lnet/bytebuddy/implementation/Implementation$Context$Factory;)Lnet/bytebuddy/ByteBuddy;

    move-result-object v2

    iget-object v3, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    iget-object v4, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    iget-object v5, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->typeStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;

    sget-object v6, Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy$Default;->DECORATE:Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy$Default;

    if-ne v1, v6, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy$Default;->REDEFINE_FROZEN:Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy$Default;

    move-object v6, v1

    :goto_0
    iget-object v7, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    iget-object v8, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    sget-object v9, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy$Disabled;->INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy$Disabled;

    iget-object v10, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->warmupStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;

    iget-object v11, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformerDecorator:Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;

    sget-object v12, Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy$NoOp;->INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy$NoOp;

    iget-object v13, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;

    iget-object v14, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionDiscoveryStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;

    iget-object v15, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionBatchAllocator:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionListener:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;

    move-object/from16 v16, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionResubmissionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;

    move-object/from16 v17, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->injectionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;

    move-object/from16 v18, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->lambdaInstrumentationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;

    move-object/from16 v19, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->descriptionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;

    move-object/from16 v20, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->fallbackStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;

    move-object/from16 v21, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileBufferStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;

    move-object/from16 v22, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->installationListener:Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;

    move-object/from16 v23, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->ignoreMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    move-object/from16 v24, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformations:Ljava/util/List;

    move-object/from16 v25, v1

    move-object/from16 v1, v26

    invoke-direct/range {v1 .. v25}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;-><init>(Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Ljava/util/List;)V

    return-object v26
.end method

.method public disableNativeMethodPrefix()Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 28

    move-object/from16 v0, p0

    new-instance v26, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;

    move-object/from16 v1, v26

    iget-object v2, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    iget-object v3, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    iget-object v4, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    iget-object v5, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    iget-object v6, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->typeStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;

    iget-object v7, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    iget-object v8, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    sget-object v9, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy$Disabled;->INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy$Disabled;

    iget-object v10, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->warmupStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;

    iget-object v11, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformerDecorator:Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;

    iget-object v12, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->initializationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;

    iget-object v13, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;

    iget-object v14, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionDiscoveryStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;

    iget-object v15, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionBatchAllocator:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;

    move-object/from16 v27, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionListener:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;

    move-object/from16 v16, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionResubmissionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;

    move-object/from16 v17, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->injectionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;

    move-object/from16 v18, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->lambdaInstrumentationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;

    move-object/from16 v19, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->descriptionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;

    move-object/from16 v20, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->fallbackStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;

    move-object/from16 v21, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileBufferStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;

    move-object/from16 v22, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->installationListener:Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;

    move-object/from16 v23, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->ignoreMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    move-object/from16 v24, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformations:Ljava/util/List;

    move-object/from16 v25, v1

    move-object/from16 v1, v27

    invoke-direct/range {v1 .. v25}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;-><init>(Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Ljava/util/List;)V

    return-object v26
.end method

.method public enableNativeMethodPrefix(Ljava/lang/String;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 28

    move-object/from16 v0, p0

    new-instance v26, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;

    move-object/from16 v1, v26

    iget-object v2, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    iget-object v3, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    iget-object v4, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    iget-object v5, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    iget-object v6, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->typeStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;

    iget-object v7, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    iget-object v8, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    invoke-static/range {p1 .. p1}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy$ForPrefix;->of(Ljava/lang/String;)Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;

    move-result-object v9

    iget-object v10, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->warmupStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;

    iget-object v11, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformerDecorator:Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;

    iget-object v12, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->initializationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;

    iget-object v13, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;

    iget-object v14, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionDiscoveryStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;

    iget-object v15, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionBatchAllocator:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;

    move-object/from16 v27, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionListener:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;

    move-object/from16 v16, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionResubmissionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;

    move-object/from16 v17, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->injectionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;

    move-object/from16 v18, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->lambdaInstrumentationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;

    move-object/from16 v19, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->descriptionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;

    move-object/from16 v20, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->fallbackStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;

    move-object/from16 v21, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileBufferStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;

    move-object/from16 v22, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->installationListener:Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;

    move-object/from16 v23, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->ignoreMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    move-object/from16 v24, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformations:Ljava/util/List;

    move-object/from16 v25, v1

    move-object/from16 v1, v27

    invoke-direct/range {v1 .. v25}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;-><init>(Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Ljava/util/List;)V

    return-object v26
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;

    check-cast p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;

    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->lambdaInstrumentationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;

    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->lambdaInstrumentationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    invoke-virtual {v2, v3}, Lnet/bytebuddy/ByteBuddy;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    return v1

    :cond_5
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    return v1

    :cond_6
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    return v1

    :cond_7
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    return v1

    :cond_8
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->typeStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;

    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->typeStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    return v1

    :cond_9
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    return v1

    :cond_a
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    return v1

    :cond_b
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->nativeMethodStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;

    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->nativeMethodStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    return v1

    :cond_c
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->warmupStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;

    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->warmupStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    return v1

    :cond_d
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformerDecorator:Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;

    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformerDecorator:Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    return v1

    :cond_e
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->initializationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;

    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->initializationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_f

    return v1

    :cond_f
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionDiscoveryStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;

    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionDiscoveryStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_10

    return v1

    :cond_10
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionBatchAllocator:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;

    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionBatchAllocator:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_11

    return v1

    :cond_11
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionListener:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;

    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionListener:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_12

    return v1

    :cond_12
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionResubmissionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;

    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionResubmissionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_13

    return v1

    :cond_13
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->injectionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;

    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->injectionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_14

    return v1

    :cond_14
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->descriptionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;

    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->descriptionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_15

    return v1

    :cond_15
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->fallbackStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;

    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->fallbackStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_16

    return v1

    :cond_16
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileBufferStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;

    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileBufferStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_17

    return v1

    :cond_17
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->installationListener:Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;

    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->installationListener:Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_18

    return v1

    :cond_18
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->ignoreMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    iget-object v3, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->ignoreMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_19

    return v1

    :cond_19
    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformations:Ljava/util/List;

    iget-object p1, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformations:Ljava/util/List;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1a

    return v1

    :cond_1a
    return v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    invoke-virtual {v1}, Lnet/bytebuddy/ByteBuddy;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->typeStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->nativeMethodStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->warmupStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformerDecorator:Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->initializationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionDiscoveryStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionBatchAllocator:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionListener:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionResubmissionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->injectionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->lambdaInstrumentationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->descriptionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->fallbackStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileBufferStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->installationListener:Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->ignoreMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformations:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public ignore(Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$Ignored;
    .locals 1

    .line 4
    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Ignoring;

    invoke-direct {v0, p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Ignoring;-><init>(Lnet/bytebuddy/agent/builder/AgentBuilder$Default;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;)V

    return-object v0
.end method

.method public ignore(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$Ignored;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;)",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$Ignored;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->any()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->ignore(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$Ignored;

    move-result-object p1

    return-object p1
.end method

.method public ignore(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$Ignored;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Ljava/lang/ClassLoader;",
            ">;)",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$Ignored;"
        }
    .end annotation

    .line 2
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->any()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->ignore(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$Ignored;

    move-result-object p1

    return-object p1
.end method

.method public ignore(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$Ignored;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Ljava/lang/ClassLoader;",
            ">;",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/utility/JavaModule;",
            ">;)",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$Ignored;"
        }
    .end annotation

    .line 3
    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher$ForElementMatchers;

    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->supportsModules()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v1

    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->not(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v1

    invoke-interface {v1, p3}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->or(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p3

    invoke-direct {v0, p1, p2, p3}, Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher$ForElementMatchers;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;)V

    invoke-virtual {p0, v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->ignore(Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$Ignored;

    move-result-object p1

    return-object p1
.end method

.method public installOn(Ljava/lang/instrument/Instrumentation;)Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;
    .locals 3

    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$SimpleMatcher;

    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->ignoreMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformations:Ljava/util/List;

    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$SimpleMatcher;-><init>(Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Ljava/util/List;)V

    sget-object v1, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$NoOp;->INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler$NoOp;

    invoke-direct {p0, p1, v0, v1}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->doInstall(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler;)Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    move-result-object p1

    return-object p1
.end method

.method public installOnByteBuddyAgent()Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;
    .locals 1

    invoke-static {}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->resolveByteBuddyAgentInstrumentation()Ljava/lang/instrument/Instrumentation;

    move-result-object v0

    invoke-virtual {p0, v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->installOn(Ljava/lang/instrument/Instrumentation;)Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic makeRaw()Ljava/lang/instrument/ClassFileTransformer;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->makeRaw()Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    move-result-object v0

    return-object v0
.end method

.method public makeRaw()Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;
    .locals 3

    .line 2
    iget-object v0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    sget-object v1, Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener$NoOp;->INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener$NoOp;

    sget-object v2, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionEnforcer$Disabled;->INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionEnforcer$Disabled;

    invoke-direct {p0, v0, v1, v2}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->makeRaw(Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionEnforcer;)Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    move-result-object v0

    return-object v0
.end method

.method public patchOn(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;)Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;
    .locals 1

    .line 1
    invoke-static {p2}, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;->of(Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;)Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->patchOn(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;)Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    move-result-object p1

    return-object p1
.end method

.method public patchOn(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;)Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;
    .locals 4

    .line 3
    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$DifferentialMatcher;

    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->ignoreMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformations:Ljava/util/List;

    instance-of v3, p2, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$Substitutable;

    if-eqz v3, :cond_0

    move-object v3, p2

    check-cast v3, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$Substitutable;

    .line 4
    invoke-interface {v3}, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer$Substitutable;->unwrap()Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object v3, p2

    :goto_0
    invoke-direct {v0, v1, v2, v3}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transformation$DifferentialMatcher;-><init>(Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Ljava/util/List;Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;)V

    .line 5
    invoke-virtual {p0, p1, p2, v0, p3}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->patchOn(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;)Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    move-result-object p1

    return-object p1
.end method

.method public patchOn(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;)Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;
    .locals 1

    .line 2
    invoke-static {p2}, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;->of(Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;)Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;

    move-result-object v0

    invoke-virtual {p0, p1, p2, p3, v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->patchOn(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;)Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    move-result-object p1

    return-object p1
.end method

.method public patchOn(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;)Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;
    .locals 0

    .line 6
    invoke-virtual {p4, p2}, Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;->toHandler(Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;)Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler;

    move-result-object p2

    invoke-direct {p0, p1, p3, p2}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->doInstall(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode$Handler;)Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    move-result-object p1

    return-object p1
.end method

.method public patchOnByteBuddyAgent(Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;)Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;
    .locals 1

    .line 1
    invoke-static {}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->resolveByteBuddyAgentInstrumentation()Ljava/lang/instrument/Instrumentation;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->patchOn(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;)Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    move-result-object p1

    return-object p1
.end method

.method public patchOnByteBuddyAgent(Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;)Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;
    .locals 1

    .line 2
    invoke-static {}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->resolveByteBuddyAgentInstrumentation()Ljava/lang/instrument/Instrumentation;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->patchOn(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;)Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    move-result-object p1

    return-object p1
.end method

.method public type(Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$Identified$Narrowable;
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v1, v2}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Transforming;-><init>(Lnet/bytebuddy/agent/builder/AgentBuilder$Default;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Ljava/util/List;Z)V

    return-object v0
.end method

.method public type(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$Identified$Narrowable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;)",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$Identified$Narrowable;"
        }
    .end annotation

    .line 2
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->any()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->type(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$Identified$Narrowable;

    move-result-object p1

    return-object p1
.end method

.method public type(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$Identified$Narrowable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Ljava/lang/ClassLoader;",
            ">;)",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$Identified$Narrowable;"
        }
    .end annotation

    .line 3
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->any()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->type(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$Identified$Narrowable;

    move-result-object p1

    return-object p1
.end method

.method public type(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$Identified$Narrowable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Ljava/lang/ClassLoader;",
            ">;",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/utility/JavaModule;",
            ">;)",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$Identified$Narrowable;"
        }
    .end annotation

    .line 4
    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher$ForElementMatchers;

    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->supportsModules()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v1

    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->not(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v1

    invoke-interface {v1, p3}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->or(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p3

    invoke-direct {v0, p1, p2, p3}, Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher$ForElementMatchers;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;)V

    invoke-virtual {p0, v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->type(Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$Identified$Narrowable;

    move-result-object p1

    return-object p1
.end method

.method public warmUp(Ljava/util/Collection;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/Class<",
            "*>;>;)",
            "Lnet/bytebuddy/agent/builder/AgentBuilder;"
        }
    .end annotation

    move-object/from16 v0, p0

    .line 2
    invoke-interface/range {p1 .. p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 3
    :cond_0
    invoke-interface/range {p1 .. p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Class;

    .line 4
    invoke-virtual {v2}, Ljava/lang/Class;->isPrimitive()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    .line 5
    :cond_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Cannot warm up primitive or array type: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 6
    :cond_2
    new-instance v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;

    move-object v3, v1

    iget-object v4, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    iget-object v5, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    iget-object v6, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    iget-object v7, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    iget-object v8, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->typeStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;

    iget-object v9, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    iget-object v10, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    iget-object v11, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->nativeMethodStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;

    iget-object v2, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->warmupStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;

    move-object/from16 v12, p1

    .line 7
    invoke-interface {v2, v12}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;->with(Ljava/util/Collection;)Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;

    move-result-object v12

    iget-object v13, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformerDecorator:Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;

    iget-object v14, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->initializationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;

    iget-object v15, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;

    iget-object v2, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionDiscoveryStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;

    move-object/from16 v16, v2

    iget-object v2, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionBatchAllocator:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;

    move-object/from16 v17, v2

    iget-object v2, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionListener:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;

    move-object/from16 v18, v2

    iget-object v2, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionResubmissionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;

    move-object/from16 v19, v2

    iget-object v2, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->injectionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;

    move-object/from16 v20, v2

    iget-object v2, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->lambdaInstrumentationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;

    move-object/from16 v21, v2

    iget-object v2, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->descriptionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;

    move-object/from16 v22, v2

    iget-object v2, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->fallbackStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;

    move-object/from16 v23, v2

    iget-object v2, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileBufferStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;

    move-object/from16 v24, v2

    iget-object v2, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->installationListener:Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;

    move-object/from16 v25, v2

    iget-object v2, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->ignoreMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    move-object/from16 v26, v2

    iget-object v2, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformations:Ljava/util/List;

    move-object/from16 v27, v2

    invoke-direct/range {v3 .. v27}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;-><init>(Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Ljava/util/List;)V

    return-object v1
.end method

.method public varargs warmUp([Ljava/lang/Class;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/agent/builder/AgentBuilder;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->warmUp(Ljava/util/Collection;)Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p1

    return-object p1
.end method

.method public with(Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;)Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$WithoutBatchStrategy;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v13, p1

    .line 9
    new-instance v26, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Redefining;

    move-object/from16 v1, v26

    iget-object v2, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    iget-object v3, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    iget-object v4, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    iget-object v5, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    iget-object v6, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->typeStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;

    iget-object v7, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    iget-object v8, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    iget-object v9, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->nativeMethodStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;

    iget-object v10, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->warmupStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;

    iget-object v11, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformerDecorator:Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;

    iget-object v12, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->initializationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;

    sget-object v14, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy$SinglePass;->INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy$SinglePass;

    sget-object v15, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator$ForTotal;->INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator$ForTotal;

    sget-object v16, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener$NoOp;->INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener$NoOp;

    sget-object v17, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy$Disabled;->INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy$Disabled;

    move-object/from16 p1, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->injectionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;

    move-object/from16 v18, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->lambdaInstrumentationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;

    move-object/from16 v19, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->descriptionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;

    move-object/from16 v20, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->fallbackStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;

    move-object/from16 v21, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileBufferStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;

    move-object/from16 v22, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->installationListener:Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;

    move-object/from16 v23, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->ignoreMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    move-object/from16 v24, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformations:Ljava/util/List;

    move-object/from16 v25, v1

    move-object/from16 v1, p1

    invoke-direct/range {v1 .. v25}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Redefining;-><init>(Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Ljava/util/List;)V

    return-object v26
.end method

.method public with(Lnet/bytebuddy/ByteBuddy;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    .line 1
    new-instance v26, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;

    move-object/from16 v1, v26

    iget-object v3, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    iget-object v4, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    iget-object v5, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    iget-object v6, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->typeStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;

    iget-object v7, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    iget-object v8, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    iget-object v9, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->nativeMethodStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;

    iget-object v10, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->warmupStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;

    iget-object v11, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformerDecorator:Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;

    iget-object v12, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->initializationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;

    iget-object v13, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;

    iget-object v14, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionDiscoveryStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;

    iget-object v15, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionBatchAllocator:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;

    move-object/from16 p1, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionListener:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;

    move-object/from16 v16, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionResubmissionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;

    move-object/from16 v17, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->injectionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;

    move-object/from16 v18, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->lambdaInstrumentationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;

    move-object/from16 v19, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->descriptionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;

    move-object/from16 v20, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->fallbackStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;

    move-object/from16 v21, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileBufferStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;

    move-object/from16 v22, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->installationListener:Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;

    move-object/from16 v23, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->ignoreMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    move-object/from16 v24, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformations:Ljava/util/List;

    move-object/from16 v25, v1

    move-object/from16 v1, p1

    invoke-direct/range {v1 .. v25}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;-><init>(Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Ljava/util/List;)V

    return-object v26
.end method

.method public with(Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v4, p1

    .line 3
    new-instance v26, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;

    move-object/from16 v1, v26

    iget-object v2, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    iget-object v3, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    iget-object v5, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    iget-object v6, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->typeStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;

    iget-object v7, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    iget-object v8, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    iget-object v9, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->nativeMethodStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;

    iget-object v10, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->warmupStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;

    iget-object v11, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformerDecorator:Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;

    iget-object v12, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->initializationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;

    iget-object v13, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;

    iget-object v14, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionDiscoveryStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;

    iget-object v15, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionBatchAllocator:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;

    move-object/from16 p1, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionListener:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;

    move-object/from16 v16, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionResubmissionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;

    move-object/from16 v17, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->injectionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;

    move-object/from16 v18, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->lambdaInstrumentationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;

    move-object/from16 v19, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->descriptionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;

    move-object/from16 v20, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->fallbackStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;

    move-object/from16 v21, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileBufferStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;

    move-object/from16 v22, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->installationListener:Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;

    move-object/from16 v23, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->ignoreMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    move-object/from16 v24, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformations:Ljava/util/List;

    move-object/from16 v25, v1

    move-object/from16 v1, p1

    invoke-direct/range {v1 .. v25}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;-><init>(Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Ljava/util/List;)V

    return-object v26
.end method

.method public with(Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v22, p1

    .line 14
    new-instance v26, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;

    move-object/from16 v1, v26

    iget-object v2, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    iget-object v3, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    iget-object v4, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    iget-object v5, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    iget-object v6, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->typeStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;

    iget-object v7, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    iget-object v8, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    iget-object v9, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->nativeMethodStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;

    iget-object v10, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->warmupStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;

    iget-object v11, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformerDecorator:Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;

    iget-object v12, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->initializationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;

    iget-object v13, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;

    iget-object v14, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionDiscoveryStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;

    iget-object v15, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionBatchAllocator:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;

    move-object/from16 p1, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionListener:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;

    move-object/from16 v16, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionResubmissionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;

    move-object/from16 v17, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->injectionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;

    move-object/from16 v18, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->lambdaInstrumentationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;

    move-object/from16 v19, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->descriptionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;

    move-object/from16 v20, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->fallbackStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;

    move-object/from16 v21, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->installationListener:Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;

    move-object/from16 v23, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->ignoreMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    move-object/from16 v24, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformations:Ljava/util/List;

    move-object/from16 v25, v1

    move-object/from16 v1, p1

    invoke-direct/range {v1 .. v25}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;-><init>(Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Ljava/util/List;)V

    return-object v26
.end method

.method public with(Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v20, p1

    .line 12
    new-instance v26, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;

    move-object/from16 v1, v26

    iget-object v2, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    iget-object v3, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    iget-object v4, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    iget-object v5, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    iget-object v6, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->typeStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;

    iget-object v7, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    iget-object v8, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    iget-object v9, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->nativeMethodStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;

    iget-object v10, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->warmupStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;

    iget-object v11, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformerDecorator:Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;

    iget-object v12, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->initializationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;

    iget-object v13, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;

    iget-object v14, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionDiscoveryStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;

    iget-object v15, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionBatchAllocator:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;

    move-object/from16 p1, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionListener:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;

    move-object/from16 v16, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionResubmissionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;

    move-object/from16 v17, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->injectionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;

    move-object/from16 v18, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->lambdaInstrumentationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;

    move-object/from16 v19, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->fallbackStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;

    move-object/from16 v21, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileBufferStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;

    move-object/from16 v22, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->installationListener:Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;

    move-object/from16 v23, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->ignoreMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    move-object/from16 v24, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformations:Ljava/util/List;

    move-object/from16 v25, v1

    move-object/from16 v1, p1

    invoke-direct/range {v1 .. v25}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;-><init>(Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Ljava/util/List;)V

    return-object v26
.end method

.method public with(Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v21, p1

    .line 13
    new-instance v26, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;

    move-object/from16 v1, v26

    iget-object v2, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    iget-object v3, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    iget-object v4, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    iget-object v5, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    iget-object v6, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->typeStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;

    iget-object v7, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    iget-object v8, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    iget-object v9, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->nativeMethodStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;

    iget-object v10, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->warmupStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;

    iget-object v11, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformerDecorator:Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;

    iget-object v12, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->initializationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;

    iget-object v13, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;

    iget-object v14, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionDiscoveryStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;

    iget-object v15, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionBatchAllocator:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;

    move-object/from16 p1, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionListener:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;

    move-object/from16 v16, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionResubmissionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;

    move-object/from16 v17, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->injectionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;

    move-object/from16 v18, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->lambdaInstrumentationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;

    move-object/from16 v19, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->descriptionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;

    move-object/from16 v20, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileBufferStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;

    move-object/from16 v22, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->installationListener:Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;

    move-object/from16 v23, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->ignoreMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    move-object/from16 v24, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformations:Ljava/util/List;

    move-object/from16 v25, v1

    move-object/from16 v1, p1

    invoke-direct/range {v1 .. v25}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;-><init>(Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Ljava/util/List;)V

    return-object v26
.end method

.method public with(Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v12, p1

    .line 10
    new-instance v26, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;

    move-object/from16 v1, v26

    iget-object v2, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    iget-object v3, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    iget-object v4, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    iget-object v5, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    iget-object v6, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->typeStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;

    iget-object v7, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    iget-object v8, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    iget-object v9, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->nativeMethodStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;

    iget-object v10, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->warmupStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;

    iget-object v11, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformerDecorator:Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;

    iget-object v13, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;

    iget-object v14, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionDiscoveryStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;

    iget-object v15, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionBatchAllocator:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;

    move-object/from16 p1, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionListener:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;

    move-object/from16 v16, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionResubmissionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;

    move-object/from16 v17, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->injectionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;

    move-object/from16 v18, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->lambdaInstrumentationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;

    move-object/from16 v19, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->descriptionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;

    move-object/from16 v20, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->fallbackStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;

    move-object/from16 v21, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileBufferStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;

    move-object/from16 v22, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->installationListener:Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;

    move-object/from16 v23, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->ignoreMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    move-object/from16 v24, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformations:Ljava/util/List;

    move-object/from16 v25, v1

    move-object/from16 v1, p1

    invoke-direct/range {v1 .. v25}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;-><init>(Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Ljava/util/List;)V

    return-object v26
.end method

.method public with(Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v18, p1

    .line 16
    new-instance v26, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;

    move-object/from16 v1, v26

    iget-object v2, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    iget-object v3, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    iget-object v4, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    iget-object v5, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    iget-object v6, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->typeStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;

    iget-object v7, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    iget-object v8, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    iget-object v9, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->nativeMethodStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;

    iget-object v10, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->warmupStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;

    iget-object v11, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformerDecorator:Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;

    iget-object v12, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->initializationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;

    iget-object v13, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;

    iget-object v14, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionDiscoveryStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;

    iget-object v15, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionBatchAllocator:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;

    move-object/from16 p1, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionListener:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;

    move-object/from16 v16, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionResubmissionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;

    move-object/from16 v17, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->lambdaInstrumentationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;

    move-object/from16 v19, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->descriptionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;

    move-object/from16 v20, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->fallbackStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;

    move-object/from16 v21, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileBufferStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;

    move-object/from16 v22, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->installationListener:Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;

    move-object/from16 v23, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->ignoreMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    move-object/from16 v24, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformations:Ljava/util/List;

    move-object/from16 v25, v1

    move-object/from16 v1, p1

    invoke-direct/range {v1 .. v25}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;-><init>(Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Ljava/util/List;)V

    return-object v26
.end method

.method public with(Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 30

    move-object/from16 v0, p0

    .line 15
    new-instance v26, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;

    move-object/from16 v1, v26

    iget-object v2, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    iget-object v3, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    iget-object v4, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    iget-object v5, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    iget-object v6, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->typeStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;

    iget-object v7, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    iget-object v8, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    iget-object v9, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->nativeMethodStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;

    iget-object v10, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->warmupStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;

    iget-object v11, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformerDecorator:Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;

    iget-object v12, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->initializationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;

    iget-object v13, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;

    iget-object v14, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionDiscoveryStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;

    iget-object v15, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionBatchAllocator:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;

    move-object/from16 v27, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionListener:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;

    move-object/from16 v16, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionResubmissionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;

    move-object/from16 v17, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->injectionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;

    move-object/from16 v18, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->lambdaInstrumentationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;

    move-object/from16 v19, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->descriptionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;

    move-object/from16 v20, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->fallbackStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;

    move-object/from16 v21, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileBufferStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;

    move-object/from16 v22, v1

    new-instance v1, Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener$Compound;

    move-object/from16 v23, v1

    move-object/from16 v28, v2

    iget-object v2, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->installationListener:Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;

    move-object/from16 v29, v3

    const/4 v3, 0x2

    new-array v3, v3, [Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;

    const/16 v24, 0x0

    aput-object v2, v3, v24

    const/4 v2, 0x1

    aput-object p1, v3, v2

    invoke-direct {v1, v3}, Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener$Compound;-><init>([Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;)V

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->ignoreMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    move-object/from16 v24, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformations:Ljava/util/List;

    move-object/from16 v25, v1

    move-object/from16 v1, v27

    move-object/from16 v2, v28

    move-object/from16 v3, v29

    invoke-direct/range {v1 .. v25}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;-><init>(Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Ljava/util/List;)V

    return-object v26
.end method

.method public with(Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v19, p1

    .line 11
    new-instance v26, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;

    move-object/from16 v1, v26

    iget-object v2, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    iget-object v3, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    iget-object v4, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    iget-object v5, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    iget-object v6, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->typeStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;

    iget-object v7, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    iget-object v8, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    iget-object v9, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->nativeMethodStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;

    iget-object v10, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->warmupStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;

    iget-object v11, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformerDecorator:Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;

    iget-object v12, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->initializationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;

    iget-object v13, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;

    iget-object v14, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionDiscoveryStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;

    iget-object v15, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionBatchAllocator:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;

    move-object/from16 p1, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionListener:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;

    move-object/from16 v16, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionResubmissionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;

    move-object/from16 v17, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->injectionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;

    move-object/from16 v18, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->descriptionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;

    move-object/from16 v20, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->fallbackStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;

    move-object/from16 v21, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileBufferStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;

    move-object/from16 v22, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->installationListener:Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;

    move-object/from16 v23, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->ignoreMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    move-object/from16 v24, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformations:Ljava/util/List;

    move-object/from16 v25, v1

    move-object/from16 v1, p1

    invoke-direct/range {v1 .. v25}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;-><init>(Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Ljava/util/List;)V

    return-object v26
.end method

.method public with(Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 28

    move-object/from16 v0, p0

    .line 2
    new-instance v26, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;

    move-object/from16 v1, v26

    iget-object v2, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    new-instance v4, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener$Compound;

    move-object v3, v4

    iget-object v5, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    const/4 v6, 0x2

    new-array v6, v6, [Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    const/4 v7, 0x0

    aput-object v5, v6, v7

    const/4 v5, 0x1

    aput-object p1, v6, v5

    invoke-direct {v4, v6}, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener$Compound;-><init>([Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;)V

    iget-object v4, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    iget-object v5, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    iget-object v6, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->typeStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;

    iget-object v7, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    iget-object v8, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    iget-object v9, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->nativeMethodStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;

    iget-object v10, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->warmupStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;

    iget-object v11, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformerDecorator:Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;

    iget-object v12, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->initializationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;

    iget-object v13, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;

    iget-object v14, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionDiscoveryStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;

    iget-object v15, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionBatchAllocator:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;

    move-object/from16 v27, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionListener:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;

    move-object/from16 v16, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionResubmissionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;

    move-object/from16 v17, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->injectionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;

    move-object/from16 v18, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->lambdaInstrumentationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;

    move-object/from16 v19, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->descriptionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;

    move-object/from16 v20, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->fallbackStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;

    move-object/from16 v21, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileBufferStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;

    move-object/from16 v22, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->installationListener:Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;

    move-object/from16 v23, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->ignoreMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    move-object/from16 v24, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformations:Ljava/util/List;

    move-object/from16 v25, v1

    move-object/from16 v1, v27

    invoke-direct/range {v1 .. v25}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;-><init>(Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Ljava/util/List;)V

    return-object v26
.end method

.method public with(Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    .line 6
    new-instance v26, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;

    move-object/from16 v1, v26

    iget-object v2, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    iget-object v3, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    iget-object v4, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    iget-object v5, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    iget-object v6, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->typeStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;

    iget-object v8, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    iget-object v9, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->nativeMethodStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;

    iget-object v10, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->warmupStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;

    iget-object v11, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformerDecorator:Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;

    iget-object v12, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->initializationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;

    iget-object v13, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;

    iget-object v14, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionDiscoveryStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;

    iget-object v15, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionBatchAllocator:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;

    move-object/from16 p1, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionListener:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;

    move-object/from16 v16, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionResubmissionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;

    move-object/from16 v17, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->injectionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;

    move-object/from16 v18, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->lambdaInstrumentationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;

    move-object/from16 v19, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->descriptionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;

    move-object/from16 v20, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->fallbackStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;

    move-object/from16 v21, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileBufferStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;

    move-object/from16 v22, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->installationListener:Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;

    move-object/from16 v23, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->ignoreMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    move-object/from16 v24, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformations:Ljava/util/List;

    move-object/from16 v25, v1

    move-object/from16 v1, p1

    invoke-direct/range {v1 .. v25}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;-><init>(Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Ljava/util/List;)V

    return-object v26
.end method

.method public with(Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v5, p1

    .line 5
    new-instance v26, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;

    move-object/from16 v1, v26

    iget-object v2, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    iget-object v3, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    iget-object v4, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    iget-object v6, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->typeStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;

    iget-object v7, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    iget-object v8, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    iget-object v9, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->nativeMethodStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;

    iget-object v10, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->warmupStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;

    iget-object v11, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformerDecorator:Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;

    iget-object v12, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->initializationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;

    iget-object v13, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;

    iget-object v14, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionDiscoveryStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;

    iget-object v15, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionBatchAllocator:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;

    move-object/from16 p1, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionListener:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;

    move-object/from16 v16, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionResubmissionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;

    move-object/from16 v17, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->injectionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;

    move-object/from16 v18, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->lambdaInstrumentationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;

    move-object/from16 v19, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->descriptionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;

    move-object/from16 v20, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->fallbackStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;

    move-object/from16 v21, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileBufferStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;

    move-object/from16 v22, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->installationListener:Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;

    move-object/from16 v23, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->ignoreMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    move-object/from16 v24, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformations:Ljava/util/List;

    move-object/from16 v25, v1

    move-object/from16 v1, p1

    invoke-direct/range {v1 .. v25}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;-><init>(Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Ljava/util/List;)V

    return-object v26
.end method

.method public with(Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 28

    move-object/from16 v0, p0

    .line 8
    new-instance v26, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;

    move-object/from16 v1, v26

    iget-object v2, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    iget-object v3, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    iget-object v4, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    iget-object v5, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    iget-object v6, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->typeStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;

    iget-object v7, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    iget-object v8, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    iget-object v9, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->nativeMethodStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;

    iget-object v10, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->warmupStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;

    new-instance v12, Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator$Compound;

    move-object v11, v12

    iget-object v13, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformerDecorator:Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;

    const/4 v14, 0x2

    new-array v14, v14, [Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;

    const/4 v15, 0x0

    aput-object v13, v14, v15

    const/4 v13, 0x1

    aput-object p1, v14, v13

    invoke-direct {v12, v14}, Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator$Compound;-><init>([Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;)V

    iget-object v12, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->initializationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;

    iget-object v13, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;

    iget-object v14, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionDiscoveryStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;

    iget-object v15, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionBatchAllocator:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;

    move-object/from16 v27, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionListener:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;

    move-object/from16 v16, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionResubmissionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;

    move-object/from16 v17, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->injectionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;

    move-object/from16 v18, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->lambdaInstrumentationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;

    move-object/from16 v19, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->descriptionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;

    move-object/from16 v20, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->fallbackStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;

    move-object/from16 v21, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileBufferStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;

    move-object/from16 v22, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->installationListener:Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;

    move-object/from16 v23, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->ignoreMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    move-object/from16 v24, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformations:Ljava/util/List;

    move-object/from16 v25, v1

    move-object/from16 v1, v27

    invoke-direct/range {v1 .. v25}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;-><init>(Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Ljava/util/List;)V

    return-object v26
.end method

.method public with(Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    .line 4
    new-instance v26, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;

    move-object/from16 v1, v26

    iget-object v2, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    iget-object v3, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    iget-object v4, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    iget-object v5, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    iget-object v7, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    iget-object v8, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    iget-object v9, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->nativeMethodStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;

    iget-object v10, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->warmupStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;

    iget-object v11, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformerDecorator:Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;

    iget-object v12, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->initializationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;

    iget-object v13, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;

    iget-object v14, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionDiscoveryStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;

    iget-object v15, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionBatchAllocator:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;

    move-object/from16 p1, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionListener:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;

    move-object/from16 v16, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionResubmissionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;

    move-object/from16 v17, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->injectionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;

    move-object/from16 v18, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->lambdaInstrumentationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;

    move-object/from16 v19, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->descriptionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;

    move-object/from16 v20, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->fallbackStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;

    move-object/from16 v21, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileBufferStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;

    move-object/from16 v22, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->installationListener:Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;

    move-object/from16 v23, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->ignoreMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    move-object/from16 v24, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformations:Ljava/util/List;

    move-object/from16 v25, v1

    move-object/from16 v1, p1

    invoke-direct/range {v1 .. v25}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;-><init>(Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Ljava/util/List;)V

    return-object v26
.end method

.method public with(Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 28

    move-object/from16 v0, p0

    .line 7
    new-instance v26, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;

    move-object/from16 v1, v26

    iget-object v2, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    iget-object v3, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->listener:Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    iget-object v4, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->circularityLock:Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    iget-object v5, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->poolStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    iget-object v6, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->typeStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;

    iget-object v7, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->locationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    new-instance v9, Lnet/bytebuddy/dynamic/ClassFileLocator$Compound;

    move-object v8, v9

    iget-object v10, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    const/4 v11, 0x2

    new-array v11, v11, [Lnet/bytebuddy/dynamic/ClassFileLocator;

    const/4 v12, 0x0

    aput-object v10, v11, v12

    const/4 v10, 0x1

    aput-object p1, v11, v10

    invoke-direct {v9, v11}, Lnet/bytebuddy/dynamic/ClassFileLocator$Compound;-><init>([Lnet/bytebuddy/dynamic/ClassFileLocator;)V

    iget-object v9, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->nativeMethodStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;

    iget-object v10, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->warmupStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;

    iget-object v11, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformerDecorator:Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;

    iget-object v12, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->initializationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;

    iget-object v13, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;

    iget-object v14, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionDiscoveryStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;

    iget-object v15, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionBatchAllocator:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;

    move-object/from16 v27, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionListener:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;

    move-object/from16 v16, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->redefinitionResubmissionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;

    move-object/from16 v17, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->injectionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;

    move-object/from16 v18, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->lambdaInstrumentationStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;

    move-object/from16 v19, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->descriptionStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;

    move-object/from16 v20, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->fallbackStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;

    move-object/from16 v21, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->classFileBufferStrategy:Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;

    move-object/from16 v22, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->installationListener:Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;

    move-object/from16 v23, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->ignoreMatcher:Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    move-object/from16 v24, v1

    iget-object v1, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->transformations:Ljava/util/List;

    move-object/from16 v25, v1

    move-object/from16 v1, v27

    invoke-direct/range {v1 .. v25}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;-><init>(Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Lnet/bytebuddy/dynamic/ClassFileLocator;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$DiscoveryStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$BatchAllocator;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$Listener;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Ljava/util/List;)V

    return-object v26
.end method
