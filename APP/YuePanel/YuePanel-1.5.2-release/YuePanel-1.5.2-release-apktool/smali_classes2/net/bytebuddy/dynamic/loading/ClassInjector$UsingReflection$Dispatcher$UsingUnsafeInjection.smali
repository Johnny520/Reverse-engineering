.class public Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher;
.implements Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$Initializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "UsingUnsafeInjection"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final accessor:Ljava/lang/Object;

.field private final defineClass:Ljava/lang/reflect/Method;

.field private final definePackage:Ljava/lang/reflect/Method;

.field private final findLoadedClass:Ljava/lang/reflect/Method;

.field private final getClassLoadingLock:Ljava/lang/reflect/Method;

.field private final getDefinedPackage:Ljava/lang/reflect/Method;
    .annotation runtime Lnet/bytebuddy/utility/nullability/UnknownNull;
    .end annotation
.end field

.field private final getPackage:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V
    .locals 0
    .param p4    # Ljava/lang/reflect/Method;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->accessor:Ljava/lang/Object;

    iput-object p2, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->findLoadedClass:Ljava/lang/reflect/Method;

    iput-object p3, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->defineClass:Ljava/lang/reflect/Method;

    iput-object p4, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->getDefinedPackage:Ljava/lang/reflect/Method;

    iput-object p5, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->getPackage:Ljava/lang/reflect/Method;

    iput-object p6, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->definePackage:Ljava/lang/reflect/Method;

    iput-object p7, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->getClassLoadingLock:Ljava/lang/reflect/Method;

    return-void
.end method

.method public static make()Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$Initializable;
    .locals 40
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "Assuring privilege is explicit user responsibility."
        value = {
            "DP_DO_INSIDE_DO_PRIVILEGED"
        }
    .end annotation

    const-string v1, "definePackage"

    const-string v2, "getPackage"

    const-class v3, Ljava/security/ProtectionDomain;

    const-class v4, [B

    const-string v5, "defineClass"

    const-string v6, "findLoadedClass"

    const-class v9, Ljava/lang/ClassLoader;

    const-class v10, Ljava/lang/String;

    const/4 v7, 0x1

    const-string v0, "getClassLoadingLock"

    invoke-static {}, Lnet/bytebuddy/utility/GraalImageCode;->getCurrent()Lnet/bytebuddy/utility/GraalImageCode;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Lnet/bytebuddy/utility/GraalImageCode;->isDefined()Z

    move-result v18

    invoke-static/range {v18 .. v18}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v11

    const-string v12, "net.bytebuddy.safe"

    invoke-static {v12, v11}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_0

    new-instance v0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$Initializable$Unavailable;

    const-string v1, "Use of Unsafe was disabled by system property"

    invoke-direct {v0, v1}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$Initializable$Unavailable;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_0
    const-string v11, "sun.misc.Unsafe"

    invoke-static {v11}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v11

    const-string v12, "theUnsafe"

    invoke-virtual {v11, v12}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v12

    invoke-virtual {v12, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    const/4 v13, 0x0

    invoke-virtual {v12, v13}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    invoke-static {}, Lnet/bytebuddy/utility/JavaModule;->isSupported()Z

    move-result v21

    const-string v13, "getDefinedPackage"

    if-eqz v21, :cond_1

    :try_start_0
    filled-new-array {v10}, [Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v9, v13, v8}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_1
    const/4 v8, 0x0

    :goto_0
    new-instance v14, Lnet/bytebuddy/ByteBuddy;

    invoke-direct {v14}, Lnet/bytebuddy/ByteBuddy;-><init>()V

    sget-object v15, Lnet/bytebuddy/dynamic/scaffold/TypeValidation;->DISABLED:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    invoke-virtual {v14, v15}, Lnet/bytebuddy/ByteBuddy;->with(Lnet/bytebuddy/dynamic/scaffold/TypeValidation;)Lnet/bytebuddy/ByteBuddy;

    move-result-object v14

    sget-object v15, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;->NO_CONSTRUCTORS:Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;

    const-class v7, Ljava/lang/Object;

    invoke-virtual {v14, v7, v15}, Lnet/bytebuddy/ByteBuddy;->subclass(Ljava/lang/Class;Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object v14

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v26, v12

    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, "$ByteBuddyAccessor$V1"

    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v14, v12}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->name(Ljava/lang/String;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object v12

    sget-object v14, Lnet/bytebuddy/description/modifier/Visibility;->PUBLIC:Lnet/bytebuddy/description/modifier/Visibility;

    move-object/from16 v27, v11

    const/4 v15, 0x1

    new-array v11, v15, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    const/4 v15, 0x0

    aput-object v14, v11, v15

    const-class v15, Ljava/lang/Class;

    invoke-interface {v12, v6, v15, v11}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineMethod(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    move-result-object v11

    const/4 v12, 0x2

    move-object/from16 v28, v0

    new-array v0, v12, [Ljava/lang/reflect/Type;

    const/4 v12, 0x0

    aput-object v9, v0, v12

    const/4 v12, 0x1

    aput-object v10, v0, v12

    invoke-interface {v11, v0}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    move-result-object v0

    filled-new-array {v10}, [Ljava/lang/Class;

    move-result-object v11

    invoke-virtual {v9, v6, v11}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v11

    invoke-static {v11}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Ljava/lang/reflect/Method;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    move-result-object v11

    move-object/from16 v29, v6

    const/4 v6, 0x0

    invoke-virtual {v11, v6}, Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;->onArgument(I)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object v11

    filled-new-array {v12}, [I

    move-result-object v6

    invoke-virtual {v11, v6}, Lnet/bytebuddy/implementation/MethodCall;->withArgument([I)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object v6

    invoke-interface {v0, v6}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    move-result-object v0

    new-array v6, v12, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    const/4 v11, 0x0

    aput-object v14, v6, v11

    invoke-interface {v0, v5, v15, v6}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineMethod(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    move-result-object v0

    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    move-object/from16 v30, v15

    const/4 v12, 0x6

    new-array v15, v12, [Ljava/lang/reflect/Type;

    aput-object v9, v15, v11

    const/4 v12, 0x1

    aput-object v10, v15, v12

    const/4 v12, 0x2

    aput-object v4, v15, v12

    const/4 v12, 0x3

    aput-object v6, v15, v12

    const/4 v12, 0x4

    aput-object v6, v15, v12

    const/4 v12, 0x5

    aput-object v3, v15, v12

    invoke-interface {v0, v15}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    move-result-object v0

    filled-new-array {v10, v4, v6, v6, v3}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v9, v5, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    invoke-static {v3}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Ljava/lang/reflect/Method;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    move-result-object v3

    invoke-virtual {v3, v11}, Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;->onArgument(I)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object v3

    move-object/from16 v31, v5

    const/4 v4, 0x1

    const/4 v6, 0x2

    const/4 v11, 0x4

    const/4 v15, 0x3

    filled-new-array {v4, v6, v15, v11, v12}, [I

    move-result-object v5

    invoke-virtual {v3, v5}, Lnet/bytebuddy/implementation/MethodCall;->withArgument([I)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object v3

    invoke-interface {v0, v3}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    move-result-object v0

    new-array v3, v4, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    const/4 v5, 0x0

    aput-object v14, v3, v5

    const-class v11, Ljava/lang/Package;

    invoke-interface {v0, v2, v11, v3}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineMethod(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    move-result-object v0

    new-array v3, v6, [Ljava/lang/reflect/Type;

    aput-object v9, v3, v5

    aput-object v10, v3, v4

    invoke-interface {v0, v3}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    move-result-object v0

    filled-new-array {v10}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v9, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    invoke-static {v3}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Ljava/lang/reflect/Method;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    move-result-object v3

    invoke-virtual {v3, v5}, Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;->onArgument(I)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object v3

    filled-new-array {v4}, [I

    move-result-object v6

    invoke-virtual {v3, v6}, Lnet/bytebuddy/implementation/MethodCall;->withArgument([I)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object v3

    invoke-interface {v0, v3}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    move-result-object v0

    new-array v3, v4, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    aput-object v14, v3, v5

    invoke-interface {v0, v1, v11, v3}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineMethod(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    move-result-object v0

    const/16 v3, 0x9

    new-array v3, v3, [Ljava/lang/reflect/Type;

    aput-object v9, v3, v5

    aput-object v10, v3, v4

    const/4 v4, 0x2

    aput-object v10, v3, v4

    const/4 v4, 0x3

    aput-object v10, v3, v4

    const/4 v4, 0x4

    aput-object v10, v3, v4

    const/4 v4, 0x5

    aput-object v10, v3, v4

    const/4 v4, 0x6

    aput-object v10, v3, v4

    const/4 v4, 0x7

    aput-object v10, v3, v4

    const-class v4, Ljava/net/URL;

    const/16 v5, 0x8

    aput-object v4, v3, v5

    invoke-interface {v0, v3}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    move-result-object v0

    const-class v38, Ljava/lang/String;

    const-class v39, Ljava/net/URL;

    const-class v32, Ljava/lang/String;

    const-class v33, Ljava/lang/String;

    const-class v34, Ljava/lang/String;

    const-class v35, Ljava/lang/String;

    const-class v36, Ljava/lang/String;

    const-class v37, Ljava/lang/String;

    filled-new-array/range {v32 .. v39}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v9, v1, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    invoke-static {v3}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Ljava/lang/reflect/Method;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;->onArgument(I)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object v3

    const/16 v5, 0x8

    new-array v5, v5, [I

    fill-array-data v5, :array_0

    invoke-virtual {v3, v5}, Lnet/bytebuddy/implementation/MethodCall;->withArgument([I)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object v3

    invoke-interface {v0, v3}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    move-result-object v0

    const/4 v3, 0x1

    if-eqz v8, :cond_2

    new-array v5, v3, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    aput-object v14, v5, v4

    invoke-interface {v0, v13, v11, v5}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineMethod(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    move-result-object v0

    const/4 v5, 0x2

    new-array v6, v5, [Ljava/lang/reflect/Type;

    aput-object v9, v6, v4

    aput-object v10, v6, v3

    invoke-interface {v0, v6}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    move-result-object v0

    invoke-static {v8}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Ljava/lang/reflect/Method;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    move-result-object v5

    invoke-virtual {v5, v4}, Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;->onArgument(I)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object v5

    filled-new-array {v3}, [I

    move-result-object v6

    invoke-virtual {v5, v6}, Lnet/bytebuddy/implementation/MethodCall;->withArgument([I)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object v5

    invoke-interface {v0, v5}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    move-result-object v0

    :cond_2
    :try_start_1
    new-array v5, v3, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    aput-object v14, v5, v4
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_3

    move-object/from16 v6, v28

    :try_start_2
    invoke-interface {v0, v6, v7, v5}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineMethod(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    move-result-object v5
    :try_end_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_4

    const/4 v11, 0x2

    :try_start_3
    new-array v12, v11, [Ljava/lang/reflect/Type;

    aput-object v9, v12, v4

    aput-object v10, v12, v3

    invoke-interface {v5, v12}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    move-result-object v3

    filled-new-array {v10}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v9, v6, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-static {v4}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Ljava/lang/reflect/Method;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;->onArgument(I)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object v4
    :try_end_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_3 .. :try_end_3} :catch_1

    const/4 v5, 0x1

    :try_start_4
    filled-new-array {v5}, [I

    move-result-object v11
    :try_end_4
    .catch Ljava/lang/NoSuchMethodException; {:try_start_4 .. :try_end_4} :catch_2

    :try_start_5
    invoke-virtual {v4, v11}, Lnet/bytebuddy/implementation/MethodCall;->withArgument([I)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object v4

    invoke-interface {v3, v4}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    move-result-object v0
    :try_end_5
    .catch Ljava/lang/NoSuchMethodException; {:try_start_5 .. :try_end_5} :catch_1

    goto :goto_3

    :catch_1
    :goto_1
    const/4 v3, 0x1

    goto :goto_2

    :catch_2
    move v3, v5

    goto :goto_2

    :catch_3
    move-object/from16 v6, v28

    goto :goto_1

    :catch_4
    :goto_2
    new-array v4, v3, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    sget-object v5, Lnet/bytebuddy/description/modifier/Visibility;->PUBLIC:Lnet/bytebuddy/description/modifier/Visibility;

    const/4 v11, 0x0

    aput-object v5, v4, v11

    invoke-interface {v0, v6, v7, v4}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineMethod(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    move-result-object v0

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/reflect/Type;

    aput-object v9, v4, v11

    aput-object v10, v4, v3

    invoke-interface {v0, v4}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    move-result-object v0

    invoke-static {v11}, Lnet/bytebuddy/implementation/FixedValue;->argument(I)Lnet/bytebuddy/implementation/FixedValue$AssignerConfigurable;

    move-result-object v3

    invoke-interface {v0, v3}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->make()Lnet/bytebuddy/dynamic/DynamicType$Unloaded;

    move-result-object v0

    sget-object v3, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy;->BOOTSTRAP_LOADER:Ljava/lang/ClassLoader;

    new-instance v4, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$ForUnsafeInjection;

    invoke-direct {v4}, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy$ForUnsafeInjection;-><init>()V

    invoke-interface {v0, v3, v4}, Lnet/bytebuddy/dynamic/DynamicType$Unloaded;->load(Ljava/lang/ClassLoader;Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy;)Lnet/bytebuddy/dynamic/DynamicType$Loaded;

    move-result-object v0

    invoke-interface {v0}, Lnet/bytebuddy/dynamic/DynamicType$Loaded;->getLoaded()Ljava/lang/Class;

    move-result-object v0

    new-instance v3, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;

    const-string v4, "allocateInstance"

    filled-new-array/range {v30 .. v30}, [Ljava/lang/Class;

    move-result-object v5

    move-object/from16 v7, v27

    invoke-virtual {v7, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v7, v26

    invoke-virtual {v4, v7, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    filled-new-array {v9, v10}, [Ljava/lang/Class;

    move-result-object v4

    move-object/from16 v5, v29

    invoke-virtual {v0, v5, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v16

    sget-object v27, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-class v28, Ljava/security/ProtectionDomain;

    const-class v23, Ljava/lang/ClassLoader;

    const-class v24, Ljava/lang/String;

    const-class v25, [B

    move-object/from16 v26, v27

    filled-new-array/range {v23 .. v28}, [Ljava/lang/Class;

    move-result-object v4

    move-object/from16 v5, v31

    invoke-virtual {v0, v5, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v17

    if-eqz v8, :cond_3

    filled-new-array {v9, v10}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v0, v13, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v13

    move-object/from16 v18, v13

    goto :goto_4

    :cond_3
    const/16 v18, 0x0

    :goto_4
    filled-new-array {v9, v10}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v0, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v19

    const-class v27, Ljava/lang/String;

    const-class v28, Ljava/net/URL;

    const-class v20, Ljava/lang/ClassLoader;

    const-class v21, Ljava/lang/String;

    const-class v22, Ljava/lang/String;

    const-class v23, Ljava/lang/String;

    const-class v24, Ljava/lang/String;

    const-class v25, Ljava/lang/String;

    const-class v26, Ljava/lang/String;

    filled-new-array/range {v20 .. v28}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v20

    filled-new-array {v9, v10}, [Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v6, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v21

    move-object v14, v3

    invoke-direct/range {v14 .. v21}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;-><init>(Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    return-object v3

    nop

    :array_0
    .array-data 4
        0x1
        0x2
        0x3
        0x4
        0x5
        0x6
        0x7
        0x8
    .end array-data
.end method


# virtual methods
.method public defineClass(Ljava/lang/ClassLoader;Ljava/lang/String;[BLjava/security/ProtectionDomain;)Ljava/lang/Class;
    .locals 9
    .param p4    # Ljava/security/ProtectionDomain;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Ljava/lang/String;",
            "[B",
            "Ljava/security/ProtectionDomain;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->defineClass:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->accessor:Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    array-length v2, p3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v8, p4

    filled-new-array/range {v3 .. v8}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :goto_0
    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :goto_1
    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public definePackage(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URL;)Ljava/lang/Package;
    .locals 2
    .param p3    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p9    # Ljava/net/URL;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    :try_start_0
    iget-object v0, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->definePackage:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->accessor:Ljava/lang/Object;

    filled-new-array/range {p1 .. p9}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Package;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :goto_0
    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :goto_1
    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw p2
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
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->accessor:Ljava/lang/Object;

    check-cast p1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;

    iget-object v3, p1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->accessor:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->findLoadedClass:Ljava/lang/reflect/Method;

    iget-object v3, p1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->findLoadedClass:Ljava/lang/reflect/Method;

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Method;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->defineClass:Ljava/lang/reflect/Method;

    iget-object v3, p1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->defineClass:Ljava/lang/reflect/Method;

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Method;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    return v1

    :cond_5
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->getDefinedPackage:Ljava/lang/reflect/Method;

    iget-object v3, p1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->getDefinedPackage:Ljava/lang/reflect/Method;

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Method;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    return v1

    :cond_6
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->getPackage:Ljava/lang/reflect/Method;

    iget-object v3, p1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->getPackage:Ljava/lang/reflect/Method;

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Method;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    return v1

    :cond_7
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->definePackage:Ljava/lang/reflect/Method;

    iget-object v3, p1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->definePackage:Ljava/lang/reflect/Method;

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Method;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    return v1

    :cond_8
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->getClassLoadingLock:Ljava/lang/reflect/Method;

    iget-object p1, p1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->getClassLoadingLock:Ljava/lang/reflect/Method;

    invoke-virtual {v2, p1}, Ljava/lang/reflect/Method;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v1

    :cond_9
    return v0
.end method

.method public findClass(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->findLoadedClass:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->accessor:Ljava/lang/Object;

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :goto_0
    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :goto_1
    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public getClassLoadingLock(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->getClassLoadingLock:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->accessor:Ljava/lang/Object;

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :goto_0
    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :goto_1
    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public getDefinedPackage(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Package;
    .locals 2
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    iget-object v0, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->getDefinedPackage:Ljava/lang/reflect/Method;

    if-nez v0, :cond_0

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->getPackage(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Package;

    move-result-object p1

    return-object p1

    :cond_0
    :try_start_0
    iget-object v1, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->accessor:Ljava/lang/Object;

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Package;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :goto_0
    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :goto_1
    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public getPackage(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Package;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->getPackage:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->accessor:Ljava/lang/Object;

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Package;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :goto_0
    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :goto_1
    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->accessor:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->findLoadedClass:Ljava/lang/reflect/Method;

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->defineClass:Ljava/lang/reflect/Method;

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->getDefinedPackage:Ljava/lang/reflect/Method;

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->getPackage:Ljava/lang/reflect/Method;

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->definePackage:Ljava/lang/reflect/Method;

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection;->getClassLoadingLock:Ljava/lang/reflect/Method;

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public initialize()Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher;
    .locals 3

    invoke-static {}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;->access$000()Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$System;

    move-result-object v0

    invoke-interface {v0}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$System;->getSecurityManager()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection;->access$100()Ljava/lang/reflect/Method;

    move-result-object v1

    sget-object v2, Lnet/bytebuddy/dynamic/loading/ClassInjector;->SUPPRESS_ACCESS_CHECKS:Ljava/security/Permission;

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1

    :goto_0
    new-instance v1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$Unavailable;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$Unavailable;-><init>(Ljava/lang/String;)V

    return-object v1

    :goto_1
    new-instance v1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$Unavailable;

    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingReflection$Dispatcher$Unavailable;-><init>(Ljava/lang/String;)V

    return-object v1

    :cond_0
    :goto_2
    return-object p0
.end method

.method public isAvailable()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
