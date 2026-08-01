.class public abstract Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter;
.super Lnet/bytebuddy/description/method/ParameterDescription$InDefinedShape$AbstractBase;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/method/ParameterDescription;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "ForLoadedParameter"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter$OfLegacyVmConstructor;,
        Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter$OfLegacyVmMethod;,
        Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter$OfConstructor;,
        Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter$OfMethod;,
        Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter$Parameter;,
        Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter$ParameterAnnotationSource;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/reflect/AccessibleObject;",
        ">",
        "Lnet/bytebuddy/description/method/ParameterDescription$InDefinedShape$AbstractBase;"
    }
.end annotation


# static fields
.field private static final ACCESS_CONTROLLER:Z

.field private static final MALFORMED_PARAMETERS_EXCEPTION:Ljava/lang/String; = "java.lang.reflect.MalformedParametersException"

.field private static final PARAMETER:Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter$Parameter;


# instance fields
.field protected final executable:Ljava/lang/reflect/AccessibleObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field protected final index:I

.field protected final parameterAnnotationSource:Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter$ParameterAnnotationSource;


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
    sput-boolean v1, Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter;->ACCESS_CONTROLLER:Z
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
    sput-boolean v0, Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter;->ACCESS_CONTROLLER:Z

    .line 25
    .line 26
    :goto_0
    const-class v0, Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter$Parameter;

    .line 27
    .line 28
    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0}, Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter$Parameter;

    .line 37
    .line 38
    sput-object v0, Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter;->PARAMETER:Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter$Parameter;

    .line 39
    .line 40
    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/AccessibleObject;ILnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter$ParameterAnnotationSource;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;I",
            "Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter$ParameterAnnotationSource;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/description/method/ParameterDescription$InDefinedShape$AbstractBase;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter;->executable:Ljava/lang/reflect/AccessibleObject;

    .line 5
    .line 6
    iput p2, p0, Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter;->index:I

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter;->parameterAnnotationSource:Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter$ParameterAnnotationSource;

    .line 9
    .line 10
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
    sget-boolean v0, Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter;->ACCESS_CONTROLLER:Z

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


# virtual methods
.method public getIndex()I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter;->index:I

    .line 2
    .line 3
    return p0
.end method

.method public getModifiers()I
    .locals 3

    .line 1
    :try_start_0
    sget-object v0, Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter;->PARAMETER:Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter$Parameter;

    .line 2
    .line 3
    sget-object v1, Lnet/bytebuddy/description/method/ParameterList$ForLoadedExecutable;->EXECUTABLE:Lnet/bytebuddy/description/method/ParameterList$ForLoadedExecutable$Executable;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter;->executable:Ljava/lang/reflect/AccessibleObject;

    .line 6
    .line 7
    invoke-interface {v1, v2}, Lnet/bytebuddy/description/method/ParameterList$ForLoadedExecutable$Executable;->getParameters(Ljava/lang/Object;)[Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget v2, p0, Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter;->index:I

    .line 12
    .line 13
    aget-object v1, v1, v2

    .line 14
    .line 15
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter$Parameter;->getModifiers(Ljava/lang/Object;)I

    .line 16
    .line 17
    .line 18
    move-result p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    return p0

    .line 20
    :catch_0
    move-exception v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const-string v2, "java.lang.reflect.MalformedParametersException"

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    invoke-super {p0}, Lnet/bytebuddy/description/method/ParameterDescription$AbstractBase;->getModifiers()I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    return p0

    .line 42
    :cond_0
    throw v0
.end method

.method public getName()Ljava/lang/String;
    .locals 3

    .line 1
    :try_start_0
    sget-object v0, Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter;->PARAMETER:Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter$Parameter;

    .line 2
    .line 3
    sget-object v1, Lnet/bytebuddy/description/method/ParameterList$ForLoadedExecutable;->EXECUTABLE:Lnet/bytebuddy/description/method/ParameterList$ForLoadedExecutable$Executable;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter;->executable:Ljava/lang/reflect/AccessibleObject;

    .line 6
    .line 7
    invoke-interface {v1, v2}, Lnet/bytebuddy/description/method/ParameterList$ForLoadedExecutable$Executable;->getParameters(Ljava/lang/Object;)[Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget v2, p0, Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter;->index:I

    .line 12
    .line 13
    aget-object v1, v1, v2

    .line 14
    .line 15
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter$Parameter;->getName(Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    return-object p0

    .line 20
    :catch_0
    move-exception v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const-string v2, "java.lang.reflect.MalformedParametersException"

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    invoke-super {p0}, Lnet/bytebuddy/description/method/ParameterDescription$AbstractBase;->getName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :cond_0
    throw v0
.end method

.method public hasModifiers()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter;->isNamed()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter;->getModifiers()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 17
    return p0
.end method

.method public isNamed()Z
    .locals 3

    .line 1
    :try_start_0
    sget-object v0, Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter;->PARAMETER:Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter$Parameter;

    .line 2
    .line 3
    sget-object v1, Lnet/bytebuddy/description/method/ParameterList$ForLoadedExecutable;->EXECUTABLE:Lnet/bytebuddy/description/method/ParameterList$ForLoadedExecutable$Executable;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter;->executable:Ljava/lang/reflect/AccessibleObject;

    .line 6
    .line 7
    invoke-interface {v1, v2}, Lnet/bytebuddy/description/method/ParameterList$ForLoadedExecutable$Executable;->getParameters(Ljava/lang/Object;)[Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget p0, p0, Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter;->index:I

    .line 12
    .line 13
    aget-object p0, v1, p0

    .line 14
    .line 15
    invoke-interface {v0, p0}, Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter$Parameter;->isNamePresent(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    return p0

    .line 20
    :catch_0
    move-exception p0

    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, "java.lang.reflect.MalformedParametersException"

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    const/4 p0, 0x0

    .line 38
    return p0

    .line 39
    :cond_0
    throw p0
.end method
