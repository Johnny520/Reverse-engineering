.class public abstract Lnet/bytebuddy/utility/JavaConstant$Simple;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/utility/JavaConstant;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/utility/JavaConstant;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Simple"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher;,
        Lnet/bytebuddy/utility/JavaConstant$Simple$OfTypeDescription;,
        Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lnet/bytebuddy/utility/JavaConstant;"
    }
.end annotation


# static fields
.field private static final ACCESS_CONTROLLER:Z

.field protected static final CLASS_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfClassDesc;

.field protected static final CONSTANT_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher;

.field protected static final DIRECT_METHOD_HANDLE_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc;

.field protected static final DIRECT_METHOD_HANDLE_DESC_KIND:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc$ForKind;

.field protected static final DYNAMIC_CONSTANT_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDynamicConstantDesc;

.field protected static final METHOD_HANDLE_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfMethodHandleDesc;

.field protected static final METHOD_TYPE_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfMethodTypeDesc;


# instance fields
.field private final typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

.field protected final value:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
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

    sput-boolean v1, Lnet/bytebuddy/utility/JavaConstant$Simple;->ACCESS_CONTROLLER:Z
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x1

    :catch_1
    sput-boolean v0, Lnet/bytebuddy/utility/JavaConstant$Simple;->ACCESS_CONTROLLER:Z

    :goto_0
    const-class v0, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher;

    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;

    move-result-object v0

    invoke-static {v0}, Lnet/bytebuddy/utility/JavaConstant$Simple;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher;

    sput-object v0, Lnet/bytebuddy/utility/JavaConstant$Simple;->CONSTANT_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher;

    const-class v0, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfClassDesc;

    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;

    move-result-object v0

    invoke-static {v0}, Lnet/bytebuddy/utility/JavaConstant$Simple;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfClassDesc;

    sput-object v0, Lnet/bytebuddy/utility/JavaConstant$Simple;->CLASS_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfClassDesc;

    const-class v0, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfMethodTypeDesc;

    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;

    move-result-object v0

    invoke-static {v0}, Lnet/bytebuddy/utility/JavaConstant$Simple;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfMethodTypeDesc;

    sput-object v0, Lnet/bytebuddy/utility/JavaConstant$Simple;->METHOD_TYPE_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfMethodTypeDesc;

    const-class v0, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfMethodHandleDesc;

    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;

    move-result-object v0

    invoke-static {v0}, Lnet/bytebuddy/utility/JavaConstant$Simple;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfMethodHandleDesc;

    sput-object v0, Lnet/bytebuddy/utility/JavaConstant$Simple;->METHOD_HANDLE_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfMethodHandleDesc;

    const-class v0, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc;

    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;

    move-result-object v0

    invoke-static {v0}, Lnet/bytebuddy/utility/JavaConstant$Simple;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc;

    sput-object v0, Lnet/bytebuddy/utility/JavaConstant$Simple;->DIRECT_METHOD_HANDLE_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc;

    const-class v0, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc$ForKind;

    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;

    move-result-object v0

    invoke-static {v0}, Lnet/bytebuddy/utility/JavaConstant$Simple;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc$ForKind;

    sput-object v0, Lnet/bytebuddy/utility/JavaConstant$Simple;->DIRECT_METHOD_HANDLE_DESC_KIND:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc$ForKind;

    const-class v0, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDynamicConstantDesc;

    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;

    move-result-object v0

    invoke-static {v0}, Lnet/bytebuddy/utility/JavaConstant$Simple;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDynamicConstantDesc;

    sput-object v0, Lnet/bytebuddy/utility/JavaConstant$Simple;->DYNAMIC_CONSTANT_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDynamicConstantDesc;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lnet/bytebuddy/description/type/TypeDescription;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/bytebuddy/utility/JavaConstant$Simple;->value:Ljava/lang/Object;

    iput-object p2, p0, Lnet/bytebuddy/utility/JavaConstant$Simple;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

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

    sget-boolean v0, Lnet/bytebuddy/utility/JavaConstant$Simple;->ACCESS_CONTROLLER:Z

    if-eqz v0, :cond_0

    invoke-static {p0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-interface {p0}, Ljava/security/PrivilegedAction;->run()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/utility/JavaConstant;
    .locals 3

    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->isPrimitive()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTypeDescription;

    invoke-direct {v0, p0}, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTypeDescription;-><init>(Lnet/bytebuddy/description/type/TypeDescription;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "A primitive type cannot be represented as a type constant: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ofDescription(Ljava/lang/Object;Ljava/lang/ClassLoader;)Lnet/bytebuddy/utility/JavaConstant;
    .locals 0
    .param p1    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    invoke-static {p1}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForClassLoader;->of(Ljava/lang/ClassLoader;)Lnet/bytebuddy/dynamic/ClassFileLocator;

    move-result-object p1

    invoke-static {p0, p1}, Lnet/bytebuddy/utility/JavaConstant$Simple;->ofDescription(Ljava/lang/Object;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/utility/JavaConstant;

    move-result-object p0

    return-object p0
.end method

.method public static ofDescription(Ljava/lang/Object;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/utility/JavaConstant;
    .locals 0

    .line 2
    invoke-static {p1}, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;->of(Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/pool/TypePool;

    move-result-object p1

    invoke-static {p0, p1}, Lnet/bytebuddy/utility/JavaConstant$Simple;->ofDescription(Ljava/lang/Object;Lnet/bytebuddy/pool/TypePool;)Lnet/bytebuddy/utility/JavaConstant;

    move-result-object p0

    return-object p0
.end method

.method public static ofDescription(Ljava/lang/Object;Lnet/bytebuddy/pool/TypePool;)Lnet/bytebuddy/utility/JavaConstant;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 3
    instance-of v2, v0, Ljava/lang/Integer;

    if-eqz v2, :cond_0

    .line 4
    new-instance v1, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForInteger;

    check-cast v0, Ljava/lang/Integer;

    invoke-direct {v1, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForInteger;-><init>(Ljava/lang/Integer;)V

    return-object v1

    .line 5
    :cond_0
    instance-of v2, v0, Ljava/lang/Long;

    if-eqz v2, :cond_1

    .line 6
    new-instance v1, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForLong;

    check-cast v0, Ljava/lang/Long;

    invoke-direct {v1, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForLong;-><init>(Ljava/lang/Long;)V

    return-object v1

    .line 7
    :cond_1
    instance-of v2, v0, Ljava/lang/Float;

    if-eqz v2, :cond_2

    .line 8
    new-instance v1, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForFloat;

    check-cast v0, Ljava/lang/Float;

    invoke-direct {v1, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForFloat;-><init>(Ljava/lang/Float;)V

    return-object v1

    .line 9
    :cond_2
    instance-of v2, v0, Ljava/lang/Double;

    if-eqz v2, :cond_3

    .line 10
    new-instance v1, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForDouble;

    check-cast v0, Ljava/lang/Double;

    invoke-direct {v1, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForDouble;-><init>(Ljava/lang/Double;)V

    return-object v1

    .line 11
    :cond_3
    instance-of v2, v0, Ljava/lang/String;

    if-eqz v2, :cond_4

    .line 12
    new-instance v1, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForString;

    check-cast v0, Ljava/lang/String;

    invoke-direct {v1, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForString;-><init>(Ljava/lang/String;)V

    return-object v1

    .line 13
    :cond_4
    sget-object v2, Lnet/bytebuddy/utility/JavaConstant$Simple;->CLASS_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfClassDesc;

    invoke-interface {v2, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher;->isInstance(Ljava/lang/Object;)Z

    move-result v3

    const/16 v4, 0x2e

    const/16 v5, 0x2f

    const/16 v6, 0x9

    if-eqz v3, :cond_6

    .line 14
    invoke-interface {v2, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfClassDesc;->descriptorString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/Type;->getSort()I

    move-result v2

    if-ne v2, v6, :cond_5

    .line 16
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/Type;->getInternalName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v5, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 17
    :cond_5
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/Type;->getClassName()Ljava/lang/String;

    move-result-object v0

    .line 18
    :goto_0
    invoke-interface {v1, v0}, Lnet/bytebuddy/pool/TypePool;->describe(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    move-result-object v0

    .line 19
    invoke-interface {v0}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    .line 20
    invoke-static {v0}, Lnet/bytebuddy/utility/JavaConstant$Simple;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/utility/JavaConstant;

    move-result-object v0

    return-object v0

    .line 21
    :cond_6
    sget-object v2, Lnet/bytebuddy/utility/JavaConstant$Simple;->METHOD_TYPE_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfMethodTypeDesc;

    invoke-interface {v2, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher;->isInstance(Ljava/lang/Object;)Z

    move-result v3

    const/4 v7, 0x0

    if-eqz v3, :cond_a

    .line 22
    invoke-interface {v2, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfMethodTypeDesc;->parameterArray(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    .line 23
    new-instance v3, Ljava/util/ArrayList;

    array-length v8, v2

    invoke-direct {v3, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 24
    array-length v8, v2

    :goto_1
    if-ge v7, v8, :cond_8

    aget-object v9, v2, v7

    .line 25
    sget-object v10, Lnet/bytebuddy/utility/JavaConstant$Simple;->CLASS_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfClassDesc;

    invoke-interface {v10, v9}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfClassDesc;->descriptorString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    move-result-object v9

    .line 26
    invoke-virtual {v9}, Lnet/bytebuddy/jar/asm/Type;->getSort()I

    move-result v10

    if-ne v10, v6, :cond_7

    .line 27
    invoke-virtual {v9}, Lnet/bytebuddy/jar/asm/Type;->getInternalName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9, v5, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v9

    goto :goto_2

    .line 28
    :cond_7
    invoke-virtual {v9}, Lnet/bytebuddy/jar/asm/Type;->getClassName()Ljava/lang/String;

    move-result-object v9

    .line 29
    :goto_2
    invoke-interface {v1, v9}, Lnet/bytebuddy/pool/TypePool;->describe(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    move-result-object v9

    .line 30
    invoke-interface {v9}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v9

    .line 31
    invoke-interface {v3, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 32
    :cond_8
    sget-object v2, Lnet/bytebuddy/utility/JavaConstant$Simple;->CLASS_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfClassDesc;

    sget-object v7, Lnet/bytebuddy/utility/JavaConstant$Simple;->METHOD_TYPE_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfMethodTypeDesc;

    invoke-interface {v7, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfMethodTypeDesc;->returnType(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v2, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfClassDesc;->descriptorString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    move-result-object v0

    .line 33
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/Type;->getSort()I

    move-result v2

    if-ne v2, v6, :cond_9

    .line 34
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/Type;->getInternalName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v5, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    .line 35
    :cond_9
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/Type;->getClassName()Ljava/lang/String;

    move-result-object v0

    .line 36
    :goto_3
    invoke-interface {v1, v0}, Lnet/bytebuddy/pool/TypePool;->describe(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    move-result-object v0

    .line 37
    invoke-interface {v0}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    .line 38
    invoke-static {v0, v3}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->of(Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)Lnet/bytebuddy/utility/JavaConstant$MethodType;

    move-result-object v0

    return-object v0

    .line 39
    :cond_a
    sget-object v3, Lnet/bytebuddy/utility/JavaConstant$Simple;->DIRECT_METHOD_HANDLE_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc;

    invoke-interface {v3, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher;->isInstance(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_f

    .line 40
    sget-object v3, Lnet/bytebuddy/utility/JavaConstant$Simple;->METHOD_HANDLE_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfMethodHandleDesc;

    invoke-interface {v3, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfMethodHandleDesc;->invocationType(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfMethodTypeDesc;->parameterArray(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    .line 41
    new-instance v13, Ljava/util/ArrayList;

    array-length v3, v2

    invoke-direct {v13, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 42
    array-length v3, v2

    :goto_4
    if-ge v7, v3, :cond_c

    aget-object v8, v2, v7

    .line 43
    sget-object v9, Lnet/bytebuddy/utility/JavaConstant$Simple;->CLASS_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfClassDesc;

    invoke-interface {v9, v8}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfClassDesc;->descriptorString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    move-result-object v8

    .line 44
    invoke-virtual {v8}, Lnet/bytebuddy/jar/asm/Type;->getSort()I

    move-result v9

    if-ne v9, v6, :cond_b

    .line 45
    invoke-virtual {v8}, Lnet/bytebuddy/jar/asm/Type;->getInternalName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8, v5, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v8

    goto :goto_5

    .line 46
    :cond_b
    invoke-virtual {v8}, Lnet/bytebuddy/jar/asm/Type;->getClassName()Ljava/lang/String;

    move-result-object v8

    .line 47
    :goto_5
    invoke-interface {v1, v8}, Lnet/bytebuddy/pool/TypePool;->describe(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    move-result-object v8

    .line 48
    invoke-interface {v8}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v8

    .line 49
    invoke-interface {v13, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    .line 50
    :cond_c
    sget-object v2, Lnet/bytebuddy/utility/JavaConstant$Simple;->CLASS_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfClassDesc;

    sget-object v3, Lnet/bytebuddy/utility/JavaConstant$Simple;->METHOD_TYPE_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfMethodTypeDesc;

    sget-object v7, Lnet/bytebuddy/utility/JavaConstant$Simple;->METHOD_HANDLE_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfMethodHandleDesc;

    invoke-interface {v7, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfMethodHandleDesc;->invocationType(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v3, v7}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfMethodTypeDesc;->returnType(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfClassDesc;->descriptorString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    move-result-object v3

    .line 51
    new-instance v7, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    sget-object v8, Lnet/bytebuddy/utility/JavaConstant$Simple;->DIRECT_METHOD_HANDLE_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc;

    invoke-interface {v8, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc;->refKind(Ljava/lang/Object;)I

    move-result v9

    invoke-static {v9}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;->of(I)Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    move-result-object v9

    .line 52
    invoke-interface {v8, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc;->owner(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    invoke-interface {v2, v10}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfClassDesc;->descriptorString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    move-result-object v2

    invoke-virtual {v2}, Lnet/bytebuddy/jar/asm/Type;->getClassName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lnet/bytebuddy/pool/TypePool;->describe(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    move-result-object v2

    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v10

    .line 53
    invoke-interface {v8, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc;->methodName(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 54
    invoke-interface {v8, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc;->refKind(Ljava/lang/Object;)I

    move-result v0

    const/16 v2, 0x8

    if-ne v0, v2, :cond_d

    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 55
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    :goto_6
    move-object v12, v0

    goto :goto_8

    .line 56
    :cond_d
    invoke-virtual {v3}, Lnet/bytebuddy/jar/asm/Type;->getSort()I

    move-result v0

    if-ne v0, v6, :cond_e

    invoke-virtual {v3}, Lnet/bytebuddy/jar/asm/Type;->getInternalName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v5, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    goto :goto_7

    :cond_e
    invoke-virtual {v3}, Lnet/bytebuddy/jar/asm/Type;->getClassName()Ljava/lang/String;

    move-result-object v0

    :goto_7
    invoke-interface {v1, v0}, Lnet/bytebuddy/pool/TypePool;->describe(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    move-result-object v0

    invoke-interface {v0}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    goto :goto_6

    :goto_8
    move-object v8, v7

    invoke-direct/range {v8 .. v13}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;-><init>(Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    return-object v7

    .line 57
    :cond_f
    sget-object v2, Lnet/bytebuddy/utility/JavaConstant$Simple;->DYNAMIC_CONSTANT_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDynamicConstantDesc;

    invoke-interface {v2, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher;->isInstance(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_15

    .line 58
    invoke-interface {v2, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDynamicConstantDesc;->bootstrapMethod(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v3, v2}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc;->lookupDescriptor(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Type;->getMethodType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    move-result-object v2

    .line 59
    new-instance v13, Ljava/util/ArrayList;

    invoke-virtual {v2}, Lnet/bytebuddy/jar/asm/Type;->getArgumentTypes()[Lnet/bytebuddy/jar/asm/Type;

    move-result-object v3

    array-length v3, v3

    invoke-direct {v13, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 60
    invoke-virtual {v2}, Lnet/bytebuddy/jar/asm/Type;->getArgumentTypes()[Lnet/bytebuddy/jar/asm/Type;

    move-result-object v3

    array-length v8, v3

    move v9, v7

    :goto_9
    if-ge v9, v8, :cond_11

    aget-object v10, v3, v9

    .line 61
    invoke-virtual {v10}, Lnet/bytebuddy/jar/asm/Type;->getSort()I

    move-result v11

    if-ne v11, v6, :cond_10

    .line 62
    invoke-virtual {v10}, Lnet/bytebuddy/jar/asm/Type;->getInternalName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10, v5, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v10

    goto :goto_a

    .line 63
    :cond_10
    invoke-virtual {v10}, Lnet/bytebuddy/jar/asm/Type;->getClassName()Ljava/lang/String;

    move-result-object v10

    .line 64
    :goto_a
    invoke-interface {v1, v10}, Lnet/bytebuddy/pool/TypePool;->describe(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    move-result-object v10

    .line 65
    invoke-interface {v10}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v10

    .line 66
    invoke-interface {v13, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v9, v9, 0x1

    goto :goto_9

    .line 67
    :cond_11
    sget-object v3, Lnet/bytebuddy/utility/JavaConstant$Simple;->DYNAMIC_CONSTANT_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDynamicConstantDesc;

    invoke-interface {v3, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDynamicConstantDesc;->bootstrapArgs(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    .line 68
    new-instance v14, Ljava/util/ArrayList;

    array-length v8, v3

    invoke-direct {v14, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 69
    array-length v8, v3

    :goto_b
    if-ge v7, v8, :cond_12

    aget-object v9, v3, v7

    .line 70
    invoke-static {v9, v1}, Lnet/bytebuddy/utility/JavaConstant$Simple;->ofDescription(Ljava/lang/Object;Lnet/bytebuddy/pool/TypePool;)Lnet/bytebuddy/utility/JavaConstant;

    move-result-object v9

    invoke-interface {v14, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_b

    .line 71
    :cond_12
    sget-object v3, Lnet/bytebuddy/utility/JavaConstant$Simple;->CLASS_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfClassDesc;

    sget-object v7, Lnet/bytebuddy/utility/JavaConstant$Simple;->DYNAMIC_CONSTANT_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDynamicConstantDesc;

    invoke-interface {v7, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDynamicConstantDesc;->constantType(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v3, v8}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfClassDesc;->descriptorString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    move-result-object v8

    .line 72
    new-instance v15, Lnet/bytebuddy/utility/JavaConstant$Dynamic;

    invoke-interface {v7, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDynamicConstantDesc;->constantName(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    .line 73
    invoke-virtual {v8}, Lnet/bytebuddy/jar/asm/Type;->getSort()I

    move-result v9

    if-ne v9, v6, :cond_13

    .line 74
    invoke-virtual {v8}, Lnet/bytebuddy/jar/asm/Type;->getInternalName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8, v5, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v8

    goto :goto_c

    .line 75
    :cond_13
    invoke-virtual {v8}, Lnet/bytebuddy/jar/asm/Type;->getClassName()Ljava/lang/String;

    move-result-object v8

    .line 76
    :goto_c
    invoke-interface {v1, v8}, Lnet/bytebuddy/pool/TypePool;->describe(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    move-result-object v8

    .line 77
    invoke-interface {v8}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v11

    new-instance v10, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    sget-object v8, Lnet/bytebuddy/utility/JavaConstant$Simple;->DIRECT_METHOD_HANDLE_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc;

    .line 78
    invoke-interface {v7, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDynamicConstantDesc;->bootstrapMethod(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v8, v9}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc;->refKind(Ljava/lang/Object;)I

    move-result v9

    invoke-static {v9}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;->of(I)Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    move-result-object v9

    .line 79
    invoke-interface {v7, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDynamicConstantDesc;->bootstrapMethod(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v8, v4}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc;->owner(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3, v4}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfClassDesc;->descriptorString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    move-result-object v3

    invoke-virtual {v3}, Lnet/bytebuddy/jar/asm/Type;->getClassName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Lnet/bytebuddy/pool/TypePool;->describe(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    move-result-object v3

    invoke-interface {v3}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v3

    .line 80
    invoke-interface {v7, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDynamicConstantDesc;->bootstrapMethod(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v8, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc;->methodName(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 81
    invoke-virtual {v2}, Lnet/bytebuddy/jar/asm/Type;->getReturnType()Lnet/bytebuddy/jar/asm/Type;

    move-result-object v4

    invoke-virtual {v4}, Lnet/bytebuddy/jar/asm/Type;->getSort()I

    move-result v4

    if-ne v4, v6, :cond_14

    .line 82
    invoke-virtual {v2}, Lnet/bytebuddy/jar/asm/Type;->getReturnType()Lnet/bytebuddy/jar/asm/Type;

    move-result-object v2

    invoke-virtual {v2}, Lnet/bytebuddy/jar/asm/Type;->getInternalName()Ljava/lang/String;

    move-result-object v2

    const/16 v4, 0x2e

    invoke-virtual {v2, v5, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v2

    goto :goto_d

    .line 83
    :cond_14
    invoke-virtual {v2}, Lnet/bytebuddy/jar/asm/Type;->getReturnType()Lnet/bytebuddy/jar/asm/Type;

    move-result-object v2

    invoke-virtual {v2}, Lnet/bytebuddy/jar/asm/Type;->getClassName()Ljava/lang/String;

    move-result-object v2

    .line 84
    :goto_d
    invoke-interface {v1, v2}, Lnet/bytebuddy/pool/TypePool;->describe(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    move-result-object v1

    .line 85
    invoke-interface {v1}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v1

    move-object v8, v10

    move-object v2, v10

    move-object v10, v3

    move-object v3, v11

    move-object v11, v0

    move-object v0, v12

    move-object v12, v1

    invoke-direct/range {v8 .. v13}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;-><init>(Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    invoke-direct {v15, v0, v3, v2, v14}, Lnet/bytebuddy/utility/JavaConstant$Dynamic;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/utility/JavaConstant$MethodHandle;Ljava/util/List;)V

    return-object v15

    .line 86
    :cond_15
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Not a resolvable constant description or not expressible as a constant pool value: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static ofLoaded(Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant;
    .locals 3

    invoke-static {p0}, Lnet/bytebuddy/utility/JavaConstant$Simple;->ofLoadedOrNull(Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Not a constant: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ofLoadedOrNull(Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant;
    .locals 1
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    instance-of v0, p0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    new-instance v0, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForInteger;

    check-cast p0, Ljava/lang/Integer;

    invoke-direct {v0, p0}, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForInteger;-><init>(Ljava/lang/Integer;)V

    return-object v0

    :cond_0
    instance-of v0, p0, Ljava/lang/Long;

    if-eqz v0, :cond_1

    new-instance v0, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForLong;

    check-cast p0, Ljava/lang/Long;

    invoke-direct {v0, p0}, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForLong;-><init>(Ljava/lang/Long;)V

    return-object v0

    :cond_1
    instance-of v0, p0, Ljava/lang/Float;

    if-eqz v0, :cond_2

    new-instance v0, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForFloat;

    check-cast p0, Ljava/lang/Float;

    invoke-direct {v0, p0}, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForFloat;-><init>(Ljava/lang/Float;)V

    return-object v0

    :cond_2
    instance-of v0, p0, Ljava/lang/Double;

    if-eqz v0, :cond_3

    new-instance v0, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForDouble;

    check-cast p0, Ljava/lang/Double;

    invoke-direct {v0, p0}, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForDouble;-><init>(Ljava/lang/Double;)V

    return-object v0

    :cond_3
    instance-of v0, p0, Ljava/lang/String;

    if-eqz v0, :cond_4

    new-instance v0, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForString;

    check-cast p0, Ljava/lang/String;

    invoke-direct {v0, p0}, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForString;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_4
    instance-of v0, p0, Ljava/lang/Class;

    if-eqz v0, :cond_5

    check-cast p0, Ljava/lang/Class;

    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/utility/JavaConstant$Simple;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/utility/JavaConstant;

    move-result-object p0

    return-object p0

    :cond_5
    sget-object v0, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLE:Lnet/bytebuddy/utility/JavaType;

    invoke-virtual {v0, p0}, Lnet/bytebuddy/utility/JavaType;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {p0}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->ofLoaded(Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    move-result-object p0

    return-object p0

    :cond_6
    sget-object v0, Lnet/bytebuddy/utility/JavaType;->METHOD_TYPE:Lnet/bytebuddy/utility/JavaType;

    invoke-virtual {v0, p0}, Lnet/bytebuddy/utility/JavaType;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {p0}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->ofLoaded(Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant$MethodType;

    move-result-object p0

    return-object p0

    :cond_7
    const/4 p0, 0x0

    return-object p0
.end method

.method public static wrap(Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "*>;)",
            "Ljava/util/List<",
            "Lnet/bytebuddy/utility/JavaConstant;",
            ">;"
        }
    .end annotation

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 7
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 8
    invoke-static {v1}, Lnet/bytebuddy/utility/JavaConstant$Simple;->wrap(Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static wrap(Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant;
    .locals 1

    .line 1
    instance-of v0, p0, Lnet/bytebuddy/utility/JavaConstant;

    if-eqz v0, :cond_0

    .line 2
    check-cast p0, Lnet/bytebuddy/utility/JavaConstant;

    return-object p0

    .line 3
    :cond_0
    instance-of v0, p0, Lnet/bytebuddy/description/type/TypeDescription;

    if-eqz v0, :cond_1

    .line 4
    check-cast p0, Lnet/bytebuddy/description/type/TypeDescription;

    invoke-static {p0}, Lnet/bytebuddy/utility/JavaConstant$Simple;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/utility/JavaConstant;

    move-result-object p0

    return-object p0

    .line 5
    :cond_1
    invoke-static {p0}, Lnet/bytebuddy/utility/JavaConstant$Simple;->ofLoaded(Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lnet/bytebuddy/utility/JavaConstant$Simple;->value:Ljava/lang/Object;

    check-cast p1, Lnet/bytebuddy/utility/JavaConstant$Simple;

    iget-object p1, p1, Lnet/bytebuddy/utility/JavaConstant$Simple;->value:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 1

    iget-object v0, p0, Lnet/bytebuddy/utility/JavaConstant$Simple;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    return-object v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lnet/bytebuddy/utility/JavaConstant$Simple;->value:Ljava/lang/Object;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lnet/bytebuddy/utility/JavaConstant$Simple;->value:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnet/bytebuddy/utility/JavaConstant$Simple;->value:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
