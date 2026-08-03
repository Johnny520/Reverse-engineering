.class public abstract Lnet/bytebuddy/asm/ClassVisitorFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;,
        Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;,
        Lnet/bytebuddy/asm/ClassVisitorFactory$TypePathTranslator;,
        Lnet/bytebuddy/asm/ClassVisitorFactory$FrameTranslator;,
        Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantArrayTranslator;,
        Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;,
        Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantDynamicTranslator;,
        Lnet/bytebuddy/asm/ClassVisitorFactory$HandleTranslator;,
        Lnet/bytebuddy/asm/ClassVisitorFactory$LabelArrayTranslator;,
        Lnet/bytebuddy/asm/ClassVisitorFactory$LabelTranslator;,
        Lnet/bytebuddy/asm/ClassVisitorFactory$NullCheckedConstruction;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final ACCESS_CONTROLLER:Z

.field private static final DELEGATE:Ljava/lang/String; = "delegate"

.field private static final LABELS:Ljava/lang/String; = "labels"

.field private static final WRAP:Ljava/lang/String; = "wrap"


# instance fields
.field private final type:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


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

    sput-boolean v1, Lnet/bytebuddy/asm/ClassVisitorFactory;->ACCESS_CONTROLLER:Z
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x1

    :catch_1
    sput-boolean v0, Lnet/bytebuddy/asm/ClassVisitorFactory;->ACCESS_CONTROLLER:Z

    :goto_0
    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/bytebuddy/asm/ClassVisitorFactory;->type:Ljava/lang/Class;

    return-void
.end method

.method public static synthetic access$000(Lnet/bytebuddy/ByteBuddy;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-static/range {p0 .. p12}, Lnet/bytebuddy/asm/ClassVisitorFactory;->toMethodVisitorBuilder(Lnet/bytebuddy/ByteBuddy;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$100(Lnet/bytebuddy/ByteBuddy;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-static/range {p0 .. p5}, Lnet/bytebuddy/asm/ClassVisitorFactory;->toVisitorBuilder(Lnet/bytebuddy/ByteBuddy;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$200(Lnet/bytebuddy/dynamic/DynamicType$Builder;Ljava/lang/Class;Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/DynamicType;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-static {p0, p1, p2, p3, p4}, Lnet/bytebuddy/asm/ClassVisitorFactory;->toAttributeWrapper(Lnet/bytebuddy/dynamic/DynamicType$Builder;Ljava/lang/Class;Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/DynamicType;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lnet/bytebuddy/asm/ClassVisitorFactory;->toConvertedParameter(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    move-result-object p0

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

    sget-boolean v0, Lnet/bytebuddy/asm/ClassVisitorFactory;->ACCESS_CONTROLLER:Z

    if-eqz v0, :cond_0

    invoke-static {p0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-interface {p0}, Ljava/security/PrivilegedAction;->run()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static of(Ljava/lang/Class;)Lnet/bytebuddy/asm/ClassVisitorFactory;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TS;>;)",
            "Lnet/bytebuddy/asm/ClassVisitorFactory<",
            "TS;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/ByteBuddy;

    invoke-direct {v0}, Lnet/bytebuddy/ByteBuddy;-><init>()V

    sget-object v1, Lnet/bytebuddy/dynamic/scaffold/TypeValidation;->DISABLED:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    invoke-virtual {v0, v1}, Lnet/bytebuddy/ByteBuddy;->with(Lnet/bytebuddy/dynamic/scaffold/TypeValidation;)Lnet/bytebuddy/ByteBuddy;

    move-result-object v0

    invoke-static {p0, v0}, Lnet/bytebuddy/asm/ClassVisitorFactory;->of(Ljava/lang/Class;Lnet/bytebuddy/ByteBuddy;)Lnet/bytebuddy/asm/ClassVisitorFactory;

    move-result-object p0

    return-object p0
.end method

.method public static of(Ljava/lang/Class;Lnet/bytebuddy/ByteBuddy;)Lnet/bytebuddy/asm/ClassVisitorFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TS;>;",
            "Lnet/bytebuddy/ByteBuddy;",
            ")",
            "Lnet/bytebuddy/asm/ClassVisitorFactory<",
            "TS;>;"
        }
    .end annotation

    .line 2
    new-instance v0, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;

    invoke-direct {v0, p0, p1}, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;-><init>(Ljava/lang/Class;Lnet/bytebuddy/ByteBuddy;)V

    invoke-static {v0}, Lnet/bytebuddy/asm/ClassVisitorFactory;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lnet/bytebuddy/asm/ClassVisitorFactory;

    return-object p0
.end method

.method private static toAttributeWrapper(Lnet/bytebuddy/dynamic/DynamicType$Builder;Ljava/lang/Class;Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/DynamicType;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    sget-object v0, Lnet/bytebuddy/description/modifier/Visibility;->PUBLIC:Lnet/bytebuddy/description/modifier/Visibility;

    const/4 v1, 0x2

    new-array v2, v1, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForField;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    sget-object v4, Lnet/bytebuddy/description/modifier/FieldManifestation;->FINAL:Lnet/bytebuddy/description/modifier/FieldManifestation;

    const/4 v5, 0x1

    aput-object v4, v2, v5

    const-string v4, "delegate"

    invoke-interface {p0, v4, p2, v2}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineField(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForField;)Lnet/bytebuddy/dynamic/DynamicType$Builder$FieldDefinition$Optional$Valuable;

    move-result-object p0

    new-array v2, v5, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    aput-object v0, v2, v3

    invoke-interface {p0, v2}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineConstructor([Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    move-result-object p0

    new-array v2, v5, [Ljava/lang/reflect/Type;

    aput-object p2, v2, v3

    invoke-interface {p0, v2}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    move-result-object p0

    const-class v2, Ljava/lang/String;

    filled-new-array {v2}, [Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {p1, v6}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v6

    invoke-static {v6}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Ljava/lang/reflect/Constructor;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    move-result-object v6

    invoke-virtual {v6}, Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;->onSuper()Lnet/bytebuddy/implementation/MethodCall;

    move-result-object v6

    new-instance v7, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    sget-object v8, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->REFERENCE:Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    invoke-virtual {v8, v5}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadFrom(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v8

    new-instance v9, Lnet/bytebuddy/description/field/FieldDescription$ForLoadedField;

    const-string v10, "type"

    invoke-virtual {p2, v10}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v10

    invoke-direct {v9, v10}, Lnet/bytebuddy/description/field/FieldDescription$ForLoadedField;-><init>(Ljava/lang/reflect/Field;)V

    invoke-static {v9}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->forField(Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;

    move-result-object v9

    invoke-interface {v9}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;->read()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v9

    new-array v10, v1, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    aput-object v8, v10, v3

    aput-object v9, v10, v5

    invoke-direct {v7, v10}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    invoke-virtual {v6, v7, v2}, Lnet/bytebuddy/implementation/MethodCall;->with(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Ljava/lang/reflect/Type;)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object v2

    invoke-static {v4}, Lnet/bytebuddy/implementation/FieldAccessor;->ofField(Ljava/lang/String;)Lnet/bytebuddy/implementation/FieldAccessor$OwnerTypeLocatable;

    move-result-object v6

    invoke-interface {v6, v3}, Lnet/bytebuddy/implementation/FieldAccessor$PropertyConfigurable;->setsArgumentAt(I)Lnet/bytebuddy/implementation/Implementation$Composable;

    move-result-object v6

    invoke-virtual {v2, v6}, Lnet/bytebuddy/implementation/MethodCall;->andThen(Lnet/bytebuddy/implementation/Implementation$Composable;)Lnet/bytebuddy/implementation/Implementation$Composable;

    move-result-object v2

    invoke-interface {p0, v2}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    move-result-object p0

    new-array v1, v1, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    aput-object v0, v1, v3

    sget-object v0, Lnet/bytebuddy/description/modifier/Ownership;->STATIC:Lnet/bytebuddy/description/modifier/Ownership;

    aput-object v0, v1, v5

    const-string v0, "attribute"

    invoke-interface {p0, v0, p1, v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineMethod(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    move-result-object p0

    new-array v0, v5, [Ljava/lang/reflect/Type;

    aput-object p2, v0, v3

    invoke-interface {p0, v0}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    move-result-object p0

    new-instance v0, Lnet/bytebuddy/implementation/Implementation$Simple;

    new-instance v1, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;

    invoke-direct {v1, p1, p2, p3, p4}, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription;)V

    new-array p1, v5, [Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;

    aput-object v1, p1, v3

    invoke-direct {v0, p1}, Lnet/bytebuddy/implementation/Implementation$Simple;-><init>([Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;)V

    invoke-interface {p0, v0}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    move-result-object p0

    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isProtected()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p1

    invoke-interface {p0, p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    move-result-object p0

    const-class p1, Ljava/lang/UnsupportedOperationException;

    invoke-static {p1}, Lnet/bytebuddy/implementation/ExceptionMethod;->throwing(Ljava/lang/Class;)Lnet/bytebuddy/implementation/Implementation;

    move-result-object p1

    invoke-interface {p0, p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    move-result-object p0

    const-string p1, "isUnknown"

    invoke-static {p1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p3

    invoke-interface {p0, p3}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    move-result-object p0

    const/4 p3, 0x0

    invoke-virtual {p2, p1, p3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    invoke-static {p1}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Ljava/lang/reflect/Method;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    move-result-object p1

    invoke-virtual {p1, v4}, Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;->onField(Ljava/lang/String;)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object p1

    invoke-interface {p0, p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    move-result-object p0

    const-string p1, "isCodeAttribute"

    invoke-static {p1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p4

    invoke-interface {p0, p4}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    move-result-object p0

    invoke-virtual {p2, p1, p3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    invoke-static {p1}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Ljava/lang/reflect/Method;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    move-result-object p1

    invoke-virtual {p1, v4}, Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;->onField(Ljava/lang/String;)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object p1

    invoke-interface {p0, p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    move-result-object p0

    invoke-interface {p0}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->make()Lnet/bytebuddy/dynamic/DynamicType$Unloaded;

    move-result-object p0

    return-object p0
.end method

.method private static toConvertedParameter(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "IZ)",
            "Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;"
        }
    .end annotation

    new-instance v0, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForStackManipulation;

    new-instance v1, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    if-eqz p4, :cond_0

    invoke-static {}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadThis()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object p4

    goto :goto_0

    :cond_0
    sget-object p4, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Trivial;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Trivial;

    :goto_0
    sget-object v2, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->REFERENCE:Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    invoke-virtual {v2, p3}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadFrom(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object p3

    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    move-result-object p0

    invoke-static {p2}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p2

    invoke-interface {p0, p2}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    move-result-object p0

    check-cast p0, Lnet/bytebuddy/description/method/MethodList;

    invoke-interface {p0}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-static {p0}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    move-result-object p0

    const/4 p2, 0x3

    new-array p2, p2, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    const/4 v2, 0x0

    aput-object p4, p2, v2

    const/4 p4, 0x1

    aput-object p3, p2, p4

    const/4 p3, 0x2

    aput-object p0, p2, p3

    invoke-direct {v1, p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    invoke-direct {v0, v1, p1}, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForStackManipulation;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Ljava/lang/reflect/Type;)V

    return-object v0
.end method

.method private static toMethodVisitorBuilder(Lnet/bytebuddy/ByteBuddy;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 20
    .param p3    # Ljava/lang/Class;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Class;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p5    # Ljava/lang/Class;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p6    # Ljava/lang/Class;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p7    # Ljava/lang/Class;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p8    # Ljava/lang/Class;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p9    # Ljava/lang/Class;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p10    # Ljava/lang/Class;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p11    # Ljava/lang/Class;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p12    # Ljava/lang/Class;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/ByteBuddy;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "*>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    move-object/from16 v0, p5

    move-object/from16 v1, p6

    move-object/from16 v2, p9

    move-object/from16 v3, p10

    move-object/from16 v4, p11

    move-object/from16 v5, p12

    const-string v6, "labels"

    invoke-static {v6}, Lnet/bytebuddy/implementation/FieldAccessor;->ofField(Ljava/lang/String;)Lnet/bytebuddy/implementation/FieldAccessor$OwnerTypeLocatable;

    move-result-object v7

    new-instance v8, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    const-class v9, Ljava/util/HashMap;

    invoke-static {v9}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v10

    invoke-static {v10}, Lnet/bytebuddy/implementation/bytecode/TypeCreation;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v10

    invoke-static {v9}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v9

    invoke-interface {v9}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    move-result-object v9

    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isConstructor()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v11

    const/4 v12, 0x0

    invoke-static {v12}, Lnet/bytebuddy/matcher/ElementMatchers;->takesArguments(I)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v13

    invoke-interface {v11, v13}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v11

    invoke-interface {v9, v11}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    move-result-object v9

    check-cast v9, Lnet/bytebuddy/description/method/MethodList;

    invoke-interface {v9}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-static {v9}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    move-result-object v9

    const/4 v11, 0x3

    new-array v11, v11, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    aput-object v10, v11, v12

    sget-object v10, Lnet/bytebuddy/implementation/bytecode/Duplication;->SINGLE:Lnet/bytebuddy/implementation/bytecode/Duplication;

    const/4 v13, 0x1

    aput-object v10, v11, v13

    const/4 v10, 0x2

    aput-object v9, v11, v10

    invoke-direct {v8, v11}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    const-class v9, Ljava/util/Map;

    invoke-interface {v7, v8, v9}, Lnet/bytebuddy/implementation/FieldAccessor$PropertyConfigurable;->setsValue(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Ljava/lang/reflect/Type;)Lnet/bytebuddy/implementation/Implementation$Composable;

    move-result-object v19

    move-object/from16 v14, p0

    move-object/from16 v15, p1

    move-object/from16 v16, p2

    move-object/from16 v17, p3

    move-object/from16 v18, p4

    invoke-static/range {v14 .. v19}, Lnet/bytebuddy/asm/ClassVisitorFactory;->toVisitorBuilder(Lnet/bytebuddy/ByteBuddy;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object v7

    const-class v8, [Ljava/lang/Object;

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    sget-object v11, Lnet/bytebuddy/description/modifier/Visibility;->PRIVATE:Lnet/bytebuddy/description/modifier/Visibility;

    new-array v14, v10, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForField;

    aput-object v11, v14, v12

    sget-object v15, Lnet/bytebuddy/description/modifier/FieldManifestation;->FINAL:Lnet/bytebuddy/description/modifier/FieldManifestation;

    aput-object v15, v14, v13

    invoke-interface {v7, v6, v9, v14}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineField(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForField;)Lnet/bytebuddy/dynamic/DynamicType$Builder$FieldDefinition$Optional$Valuable;

    move-result-object v7

    const-string v9, "label"

    new-array v14, v13, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    aput-object v11, v14, v12

    invoke-interface {v7, v9, v1, v14}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineMethod(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    move-result-object v7

    new-array v9, v13, [Ljava/lang/reflect/Type;

    aput-object v0, v9, v12

    invoke-interface {v7, v9}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    move-result-object v7

    new-instance v9, Lnet/bytebuddy/implementation/Implementation$Simple;

    new-instance v14, Lnet/bytebuddy/asm/ClassVisitorFactory$LabelTranslator;

    invoke-direct {v14, v1}, Lnet/bytebuddy/asm/ClassVisitorFactory$LabelTranslator;-><init>(Ljava/lang/Class;)V

    new-array v15, v13, [Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;

    aput-object v14, v15, v12

    invoke-direct {v9, v15}, Lnet/bytebuddy/implementation/Implementation$Simple;-><init>([Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;)V

    invoke-interface {v7, v9}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    move-result-object v7

    invoke-static/range {p6 .. p6}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v9

    invoke-static {v9}, Lnet/bytebuddy/description/type/TypeDescription$ArrayProjection;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v9

    new-array v14, v13, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    aput-object v11, v14, v12

    invoke-interface {v7, v6, v9, v14}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineMethod(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDefinition;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    move-result-object v6

    invoke-static/range {p5 .. p5}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v7

    invoke-static {v7}, Lnet/bytebuddy/description/type/TypeDescription$ArrayProjection;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v7

    new-array v9, v13, [Lnet/bytebuddy/description/type/TypeDefinition;

    aput-object v7, v9, v12

    invoke-interface {v6, v9}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters([Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    move-result-object v6

    new-instance v7, Lnet/bytebuddy/implementation/Implementation$Simple;

    new-instance v9, Lnet/bytebuddy/asm/ClassVisitorFactory$LabelArrayTranslator;

    invoke-direct {v9, v0, v1}, Lnet/bytebuddy/asm/ClassVisitorFactory$LabelArrayTranslator;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    new-array v14, v13, [Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;

    aput-object v9, v14, v12

    invoke-direct {v7, v14}, Lnet/bytebuddy/implementation/Implementation$Simple;-><init>([Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;)V

    invoke-interface {v6, v7}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    move-result-object v6

    const-string v7, "frames"

    new-array v9, v13, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    aput-object v11, v9, v12

    invoke-interface {v6, v7, v8, v9}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineMethod(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    move-result-object v6

    new-array v7, v13, [Ljava/lang/reflect/Type;

    aput-object v8, v7, v12

    invoke-interface {v6, v7}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    move-result-object v6

    new-instance v7, Lnet/bytebuddy/implementation/Implementation$Simple;

    new-instance v9, Lnet/bytebuddy/asm/ClassVisitorFactory$FrameTranslator;

    invoke-direct {v9, v0, v1}, Lnet/bytebuddy/asm/ClassVisitorFactory$FrameTranslator;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    new-array v0, v13, [Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;

    aput-object v9, v0, v12

    invoke-direct {v7, v0}, Lnet/bytebuddy/implementation/Implementation$Simple;-><init>([Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;)V

    invoke-interface {v6, v7}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    move-result-object v7

    :cond_0
    if-eqz v2, :cond_1

    if-eqz v3, :cond_1

    new-array v0, v10, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    sget-object v1, Lnet/bytebuddy/description/modifier/Visibility;->PRIVATE:Lnet/bytebuddy/description/modifier/Visibility;

    aput-object v1, v0, v12

    sget-object v1, Lnet/bytebuddy/description/modifier/Ownership;->STATIC:Lnet/bytebuddy/description/modifier/Ownership;

    aput-object v1, v0, v13

    const-string v1, "handle"

    invoke-interface {v7, v1, v3, v0}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineMethod(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    move-result-object v0

    new-array v1, v13, [Ljava/lang/reflect/Type;

    aput-object v2, v1, v12

    invoke-interface {v0, v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    move-result-object v0

    new-instance v1, Lnet/bytebuddy/implementation/Implementation$Simple;

    new-instance v6, Lnet/bytebuddy/asm/ClassVisitorFactory$HandleTranslator;

    invoke-direct {v6, v2, v3}, Lnet/bytebuddy/asm/ClassVisitorFactory$HandleTranslator;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    new-array v7, v13, [Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;

    aput-object v6, v7, v12

    invoke-direct {v1, v7}, Lnet/bytebuddy/implementation/Implementation$Simple;-><init>([Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;)V

    invoke-interface {v0, v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    move-result-object v7

    :cond_1
    if-eqz v4, :cond_2

    if-eqz v5, :cond_2

    if-eqz v2, :cond_2

    if-eqz v3, :cond_2

    new-array v0, v10, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    sget-object v1, Lnet/bytebuddy/description/modifier/Visibility;->PRIVATE:Lnet/bytebuddy/description/modifier/Visibility;

    aput-object v1, v0, v12

    sget-object v1, Lnet/bytebuddy/description/modifier/Ownership;->STATIC:Lnet/bytebuddy/description/modifier/Ownership;

    aput-object v1, v0, v13

    const-string v1, "constantDyanmic"

    invoke-interface {v7, v1, v5, v0}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineMethod(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    move-result-object v0

    new-array v1, v13, [Ljava/lang/reflect/Type;

    aput-object v4, v1, v12

    invoke-interface {v0, v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    move-result-object v0

    new-instance v1, Lnet/bytebuddy/implementation/Implementation$Simple;

    new-instance v6, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantDynamicTranslator;

    invoke-direct {v6, v4, v5, v2, v3}, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantDynamicTranslator;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    new-array v7, v13, [Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;

    aput-object v6, v7, v12

    invoke-direct {v1, v7}, Lnet/bytebuddy/implementation/Implementation$Simple;-><init>([Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;)V

    invoke-interface {v0, v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    move-result-object v7

    :cond_2
    sget-object v0, Lnet/bytebuddy/description/modifier/Visibility;->PRIVATE:Lnet/bytebuddy/description/modifier/Visibility;

    sget-object v1, Lnet/bytebuddy/description/modifier/Ownership;->STATIC:Lnet/bytebuddy/description/modifier/Ownership;

    new-array v6, v10, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    aput-object v0, v6, v12

    aput-object v1, v6, v13

    const-string v9, "constant"

    const-class v11, Ljava/lang/Object;

    invoke-interface {v7, v9, v11, v6}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineMethod(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    move-result-object v6

    new-array v7, v13, [Ljava/lang/reflect/Type;

    aput-object v11, v7, v12

    invoke-interface {v6, v7}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    move-result-object v6

    new-instance v7, Lnet/bytebuddy/implementation/Implementation$Simple;

    new-instance v9, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;

    move-object/from16 p0, v9

    move-object/from16 p1, p9

    move-object/from16 p2, p10

    move-object/from16 p3, p7

    move-object/from16 p4, p8

    move-object/from16 p5, p11

    move-object/from16 p6, p12

    invoke-direct/range {p0 .. p6}, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    new-array v2, v13, [Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;

    aput-object v9, v2, v12

    invoke-direct {v7, v2}, Lnet/bytebuddy/implementation/Implementation$Simple;-><init>([Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;)V

    invoke-interface {v6, v7}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    move-result-object v2

    const-string v3, "constants"

    new-array v4, v10, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    aput-object v0, v4, v12

    aput-object v1, v4, v13

    invoke-interface {v2, v3, v8, v4}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineMethod(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    move-result-object v0

    new-array v1, v13, [Ljava/lang/reflect/Type;

    aput-object v8, v1, v12

    invoke-interface {v0, v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    move-result-object v0

    new-instance v1, Lnet/bytebuddy/implementation/Implementation$Simple;

    new-instance v2, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantArrayTranslator;

    invoke-direct {v2}, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantArrayTranslator;-><init>()V

    new-array v3, v13, [Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;

    aput-object v2, v3, v12

    invoke-direct {v1, v3}, Lnet/bytebuddy/implementation/Implementation$Simple;-><init>([Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;)V

    invoke-interface {v0, v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    move-result-object v0

    return-object v0
.end method

.method private static toVisitorBuilder(Lnet/bytebuddy/ByteBuddy;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 8
    .param p3    # Ljava/lang/Class;
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
            "Lnet/bytebuddy/ByteBuddy;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Lnet/bytebuddy/implementation/Implementation;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "*>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;->NO_CONSTRUCTORS:Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;

    invoke-virtual {p0, p1, v0}, Lnet/bytebuddy/ByteBuddy;->subclass(Ljava/lang/Class;Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object p0

    sget-object v0, Lnet/bytebuddy/description/modifier/Visibility;->PRIVATE:Lnet/bytebuddy/description/modifier/Visibility;

    const/4 v1, 0x2

    new-array v2, v1, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForField;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    sget-object v4, Lnet/bytebuddy/description/modifier/FieldManifestation;->FINAL:Lnet/bytebuddy/description/modifier/FieldManifestation;

    const/4 v5, 0x1

    aput-object v4, v2, v5

    const-string v4, "delegate"

    invoke-interface {p0, v4, p2, v2}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineField(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForField;)Lnet/bytebuddy/dynamic/DynamicType$Builder$FieldDefinition$Optional$Valuable;

    move-result-object p0

    sget-object v2, Lnet/bytebuddy/description/modifier/Visibility;->PUBLIC:Lnet/bytebuddy/description/modifier/Visibility;

    new-array v6, v5, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    aput-object v2, v6, v3

    invoke-interface {p0, v6}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineConstructor([Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    move-result-object p0

    new-array v6, v5, [Ljava/lang/reflect/Type;

    aput-object p2, v6, v3

    invoke-interface {p0, v6}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    move-result-object p0

    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v6}, [Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {p1, v6}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v6

    invoke-static {v6}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Ljava/lang/reflect/Constructor;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    move-result-object v6

    sget v7, Lnet/bytebuddy/utility/OpenedClassReader;->ASM_API:I

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v6, v7}, Lnet/bytebuddy/implementation/MethodCall;->with([Ljava/lang/Object;)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object v6

    invoke-static {v4}, Lnet/bytebuddy/implementation/FieldAccessor;->ofField(Ljava/lang/String;)Lnet/bytebuddy/implementation/FieldAccessor$OwnerTypeLocatable;

    move-result-object v4

    invoke-interface {v4, v3}, Lnet/bytebuddy/implementation/FieldAccessor$PropertyConfigurable;->setsArgumentAt(I)Lnet/bytebuddy/implementation/Implementation$Composable;

    move-result-object v4

    invoke-virtual {v6, v4}, Lnet/bytebuddy/implementation/MethodCall;->andThen(Lnet/bytebuddy/implementation/Implementation$Composable;)Lnet/bytebuddy/implementation/Implementation$Composable;

    move-result-object v4

    invoke-interface {v4, p5}, Lnet/bytebuddy/implementation/Implementation$Composable;->andThen(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/implementation/Implementation;

    move-result-object p5

    invoke-interface {p0, p5}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    move-result-object p0

    sget-object p5, Lnet/bytebuddy/description/modifier/Ownership;->STATIC:Lnet/bytebuddy/description/modifier/Ownership;

    new-array v4, v1, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    aput-object v2, v4, v3

    aput-object p5, v4, v5

    const-string v2, "wrap"

    invoke-interface {p0, v2, p1, v4}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineMethod(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    move-result-object p0

    new-array p1, v5, [Ljava/lang/reflect/Type;

    aput-object p2, p1, v3

    invoke-interface {p0, p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    move-result-object p0

    new-instance p1, Lnet/bytebuddy/implementation/Implementation$Simple;

    new-instance v2, Lnet/bytebuddy/asm/ClassVisitorFactory$NullCheckedConstruction;

    invoke-direct {v2, p2}, Lnet/bytebuddy/asm/ClassVisitorFactory$NullCheckedConstruction;-><init>(Ljava/lang/Class;)V

    new-array p2, v5, [Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;

    aput-object v2, p2, v3

    invoke-direct {p1, p2}, Lnet/bytebuddy/implementation/Implementation$Simple;-><init>([Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;)V

    invoke-interface {p0, p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    move-result-object p0

    if-eqz p3, :cond_1

    if-nez p4, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "typePath"

    new-array p2, v1, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    aput-object v0, p2, v3

    aput-object p5, p2, v5

    invoke-interface {p0, p1, p4, p2}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineMethod(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    move-result-object p0

    new-array p1, v5, [Ljava/lang/reflect/Type;

    aput-object p3, p1, v3

    invoke-interface {p0, p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    move-result-object p0

    new-instance p1, Lnet/bytebuddy/implementation/Implementation$Simple;

    new-instance p2, Lnet/bytebuddy/asm/ClassVisitorFactory$TypePathTranslator;

    invoke-direct {p2, p3, p4}, Lnet/bytebuddy/asm/ClassVisitorFactory$TypePathTranslator;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    new-array p3, v5, [Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;

    aput-object p2, p3, v3

    invoke-direct {p1, p3}, Lnet/bytebuddy/implementation/Implementation$Simple;-><init>([Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;)V

    invoke-interface {p0, p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    move-result-object p0

    :cond_1
    :goto_0
    return-object p0
.end method


# virtual methods
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
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory;->type:Ljava/lang/Class;

    check-cast p1, Lnet/bytebuddy/asm/ClassVisitorFactory;

    iget-object p1, p1, Lnet/bytebuddy/asm/ClassVisitorFactory;->type:Ljava/lang/Class;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v1

    :cond_3
    return v0
.end method

.method public getType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lnet/bytebuddy/asm/ClassVisitorFactory;->type:Ljava/lang/Class;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/asm/ClassVisitorFactory;->type:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public abstract unwrap(Ljava/lang/Object;)Lnet/bytebuddy/jar/asm/ClassVisitor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lnet/bytebuddy/jar/asm/ClassVisitor;"
        }
    .end annotation
.end method

.method public abstract wrap(Lnet/bytebuddy/jar/asm/ClassVisitor;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/jar/asm/ClassVisitor;",
            ")TT;"
        }
    .end annotation
.end method
