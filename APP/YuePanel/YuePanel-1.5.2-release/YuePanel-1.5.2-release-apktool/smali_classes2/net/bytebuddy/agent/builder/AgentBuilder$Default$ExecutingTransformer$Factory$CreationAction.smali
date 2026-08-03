.class public final enum Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$Factory$CreationAction;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Ljava/security/PrivilegedAction;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$Factory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "CreationAction"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$Factory$CreationAction;",
        ">;",
        "Ljava/security/PrivilegedAction<",
        "Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$Factory;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$Factory$CreationAction;

.field public static final enum INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$Factory$CreationAction;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$Factory$CreationAction;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$Factory$CreationAction;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$Factory$CreationAction;->INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$Factory$CreationAction;

    filled-new-array {v0}, [Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$Factory$CreationAction;

    move-result-object v0

    sput-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$Factory$CreationAction;->$VALUES:[Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$Factory$CreationAction;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$Factory$CreationAction;
    .locals 1

    const-class v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$Factory$CreationAction;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$Factory$CreationAction;

    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$Factory$CreationAction;
    .locals 1

    sget-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$Factory$CreationAction;->$VALUES:[Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$Factory$CreationAction;

    invoke-virtual {v0}, [Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$Factory$CreationAction;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$Factory$CreationAction;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic run()Ljava/lang/Object;
    .locals 1
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "Exception should not be rethrown but trigger a fallback."
        value = {
            "REC_CATCH_EXCEPTION"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$Factory$CreationAction;->run()Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$Factory;

    move-result-object v0

    return-object v0
.end method

.method public run()Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$Factory;
    .locals 20
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "Exception should not be rethrown but trigger a fallback."
        value = {
            "REC_CATCH_EXCEPTION"
        }
    .end annotation

    .line 2
    const-string v0, "transform"

    :try_start_0
    new-instance v1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$Factory$ForJava9CapableVm;

    new-instance v2, Lnet/bytebuddy/ByteBuddy;

    invoke-direct {v2}, Lnet/bytebuddy/ByteBuddy;-><init>()V

    sget-object v3, Lnet/bytebuddy/dynamic/scaffold/TypeValidation;->DISABLED:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 3
    invoke-virtual {v2, v3}, Lnet/bytebuddy/ByteBuddy;->with(Lnet/bytebuddy/dynamic/scaffold/TypeValidation;)Lnet/bytebuddy/ByteBuddy;

    move-result-object v2

    const-class v3, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;

    .line 4
    invoke-virtual {v2, v3}, Lnet/bytebuddy/ByteBuddy;->subclass(Ljava/lang/Class;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-class v4, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;

    .line 5
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "$ByteBuddy$ModuleSupport"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->name(Ljava/lang/String;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object v2

    .line 6
    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v3

    sget-object v4, Lnet/bytebuddy/utility/JavaType;->MODULE:Lnet/bytebuddy/utility/JavaType;

    invoke-virtual {v4}, Lnet/bytebuddy/utility/JavaType;->load()Ljava/lang/Class;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v5, v4}, Lnet/bytebuddy/matcher/ElementMatchers;->takesArgument(ILjava/lang/Class;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v4

    invoke-interface {v3, v4}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v3

    invoke-interface {v2, v3}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    move-result-object v2

    const-class v3, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;

    const-class v4, Ljava/lang/Object;

    const-class v5, Ljava/lang/ClassLoader;

    const-class v6, Ljava/lang/String;

    const-class v7, Ljava/lang/Class;

    const-class v8, Ljava/security/ProtectionDomain;

    const-class v9, [B

    filled-new-array/range {v4 .. v9}, [Ljava/lang/Class;

    move-result-object v4

    .line 7
    invoke-virtual {v3, v0, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {v0}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Ljava/lang/reflect/Method;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;->onSuper()Lnet/bytebuddy/implementation/MethodCall;

    move-result-object v0

    invoke-virtual {v0}, Lnet/bytebuddy/implementation/MethodCall;->withAllArguments()Lnet/bytebuddy/implementation/MethodCall;

    move-result-object v0

    .line 9
    invoke-interface {v2, v0}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    move-result-object v0

    .line 10
    invoke-interface {v0}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->make()Lnet/bytebuddy/dynamic/DynamicType$Unloaded;

    move-result-object v0

    const-class v2, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;

    .line 11
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    sget-object v3, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;->WRAPPER_PERSISTENT:Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;

    const-class v4, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer;

    .line 12
    invoke-virtual {v4}, Ljava/lang/Class;->getProtectionDomain()Ljava/security/ProtectionDomain;

    move-result-object v4

    invoke-virtual {v3, v4}, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Default;->with(Ljava/security/ProtectionDomain;)Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$Configurable;

    move-result-object v3

    .line 13
    invoke-interface {v0, v2, v3}, Lnet/bytebuddy/dynamic/DynamicType$Unloaded;->load(Ljava/lang/ClassLoader;Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy;)Lnet/bytebuddy/dynamic/DynamicType$Loaded;

    move-result-object v0

    .line 14
    invoke-interface {v0}, Lnet/bytebuddy/dynamic/DynamicType$Loaded;->getLoaded()Ljava/lang/Class;

    move-result-object v0

    const-class v2, Lnet/bytebuddy/ByteBuddy;

    const-class v3, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;

    const-class v4, Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;

    const-class v5, Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;

    const-class v6, Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    const-class v7, Lnet/bytebuddy/dynamic/ClassFileLocator;

    const-class v8, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$NativeMethodStrategy;

    const-class v9, Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;

    const-class v10, Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;

    const-class v11, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;

    const-class v12, Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;

    const-class v13, Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;

    const-class v14, Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;

    const-class v15, Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;

    const-class v16, Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;

    const-class v17, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy$ResubmissionEnforcer;

    const-class v18, Ljava/util/List;

    const-class v19, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;

    filled-new-array/range {v2 .. v19}, [Ljava/lang/Class;

    move-result-object v2

    .line 15
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-direct {v1, v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$Factory$ForJava9CapableVm;-><init>(Ljava/lang/reflect/Constructor;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    .line 16
    :catch_0
    sget-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$Factory$ForLegacyVm;->INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$ExecutingTransformer$Factory$ForLegacyVm;

    return-object v0
.end method
