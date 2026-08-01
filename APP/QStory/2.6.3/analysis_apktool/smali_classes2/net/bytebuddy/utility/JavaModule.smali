.class public Lnet/bytebuddy/utility/JavaModule;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/description/NamedElement$WithOptionalName;
.implements Lnet/bytebuddy/description/annotation/AnnotationSource;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/utility/JavaModule$Module;,
        Lnet/bytebuddy/utility/JavaModule$Resolver;
    }
.end annotation


# static fields
.field private static final ACCESS_CONTROLLER:Z

.field protected static final MODULE:Lnet/bytebuddy/utility/JavaModule$Module;

.field protected static final RESOLVER:Lnet/bytebuddy/utility/JavaModule$Resolver;

.field public static final UNSUPPORTED:Lnet/bytebuddy/utility/JavaModule;
    .annotation runtime Lnet/bytebuddy/utility/nullability/AlwaysNull;
    .end annotation
.end field


# instance fields
.field private final module:Ljava/lang/reflect/AnnotatedElement;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    const-string v2, "java.security.AccessController"

    .line 4
    .line 5
    invoke-static {v2, v1, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string v2, "net.bytebuddy.securitymanager"

    .line 9
    .line 10
    const-string v3, "true"

    .line 11
    .line 12
    invoke-static {v2, v3}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-static {v2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    sput-boolean v2, Lnet/bytebuddy/utility/JavaModule;->ACCESS_CONTROLLER:Z
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    const/4 v1, 0x1

    .line 24
    :catch_1
    sput-boolean v1, Lnet/bytebuddy/utility/JavaModule;->ACCESS_CONTROLLER:Z

    .line 25
    .line 26
    :goto_0
    sput-object v0, Lnet/bytebuddy/utility/JavaModule;->UNSUPPORTED:Lnet/bytebuddy/utility/JavaModule;

    .line 27
    .line 28
    const-class v0, Lnet/bytebuddy/utility/JavaModule$Resolver;

    .line 29
    .line 30
    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0}, Lnet/bytebuddy/utility/JavaModule;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Lnet/bytebuddy/utility/JavaModule$Resolver;

    .line 39
    .line 40
    sput-object v0, Lnet/bytebuddy/utility/JavaModule;->RESOLVER:Lnet/bytebuddy/utility/JavaModule$Resolver;

    .line 41
    .line 42
    const-class v0, Lnet/bytebuddy/utility/JavaModule$Module;

    .line 43
    .line 44
    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {v0}, Lnet/bytebuddy/utility/JavaModule;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Lnet/bytebuddy/utility/JavaModule$Module;

    .line 53
    .line 54
    sput-object v0, Lnet/bytebuddy/utility/JavaModule;->MODULE:Lnet/bytebuddy/utility/JavaModule$Module;

    .line 55
    .line 56
    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/AnnotatedElement;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/utility/JavaModule;->module:Ljava/lang/reflect/AnnotatedElement;

    .line 5
    .line 6
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
    sget-boolean v0, Lnet/bytebuddy/utility/JavaModule;->ACCESS_CONTROLLER:Z

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

.method public static isSupported()Z
    .locals 2

    .line 1
    sget-object v0, Lnet/bytebuddy/ClassFileVersion;->JAVA_V5:Lnet/bytebuddy/ClassFileVersion;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/ClassFileVersion;->ofThisVm(Lnet/bytebuddy/ClassFileVersion;)Lnet/bytebuddy/ClassFileVersion;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lnet/bytebuddy/ClassFileVersion;->JAVA_V9:Lnet/bytebuddy/ClassFileVersion;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lnet/bytebuddy/ClassFileVersion;->isAtLeast(Lnet/bytebuddy/ClassFileVersion;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public static of(Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaModule;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/utility/JavaModule;->MODULE:Lnet/bytebuddy/utility/JavaModule$Module;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Lnet/bytebuddy/utility/JavaModule$Module;->isInstance(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lnet/bytebuddy/utility/JavaModule;

    .line 10
    .line 11
    check-cast p0, Ljava/lang/reflect/AnnotatedElement;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lnet/bytebuddy/utility/JavaModule;-><init>(Ljava/lang/reflect/AnnotatedElement;)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    const-string v0, "Not a Java module: "

    .line 18
    .line 19
    invoke-static {p0, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    return-object p0
.end method

.method public static ofType(Ljava/lang/Class;)Lnet/bytebuddy/utility/JavaModule;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/utility/JavaModule;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/utility/JavaModule;->RESOLVER:Lnet/bytebuddy/utility/JavaModule$Resolver;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Lnet/bytebuddy/utility/JavaModule$Resolver;->getModule(Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lnet/bytebuddy/utility/JavaModule;->UNSUPPORTED:Lnet/bytebuddy/utility/JavaModule;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v0, Lnet/bytebuddy/utility/JavaModule;

    .line 13
    .line 14
    check-cast p0, Ljava/lang/reflect/AnnotatedElement;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lnet/bytebuddy/utility/JavaModule;-><init>(Ljava/lang/reflect/AnnotatedElement;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method


# virtual methods
.method public canRead(Lnet/bytebuddy/utility/JavaModule;)Z
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/utility/JavaModule;->MODULE:Lnet/bytebuddy/utility/JavaModule$Module;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/utility/JavaModule;->module:Ljava/lang/reflect/AnnotatedElement;

    .line 4
    .line 5
    invoke-virtual {p1}, Lnet/bytebuddy/utility/JavaModule;->unwrap()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {v0, p0, p1}, Lnet/bytebuddy/utility/JavaModule$Module;->canRead(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    instance-of v0, p1, Lnet/bytebuddy/utility/JavaModule;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_1
    check-cast p1, Lnet/bytebuddy/utility/JavaModule;

    .line 12
    .line 13
    iget-object p0, p0, Lnet/bytebuddy/utility/JavaModule;->module:Ljava/lang/reflect/AnnotatedElement;

    .line 14
    .line 15
    iget-object p1, p1, Lnet/bytebuddy/utility/JavaModule;->module:Ljava/lang/reflect/AnnotatedElement;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method public getActualName()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/utility/JavaModule;->MODULE:Lnet/bytebuddy/utility/JavaModule$Module;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/utility/JavaModule;->module:Ljava/lang/reflect/AnnotatedElement;

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lnet/bytebuddy/utility/JavaModule$Module;->getName(Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public getClassLoader()Ljava/lang/ClassLoader;
    .locals 1
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/utility/JavaModule;->MODULE:Lnet/bytebuddy/utility/JavaModule$Module;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/utility/JavaModule;->module:Ljava/lang/reflect/AnnotatedElement;

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lnet/bytebuddy/utility/JavaModule$Module;->getClassLoader(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationList$ForLoadedAnnotations;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/utility/JavaModule;->module:Ljava/lang/reflect/AnnotatedElement;

    .line 4
    .line 5
    invoke-interface {p0}, Ljava/lang/reflect/AnnotatedElement;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-direct {v0, p0}, Lnet/bytebuddy/description/annotation/AnnotationList$ForLoadedAnnotations;-><init>([Ljava/lang/annotation/Annotation;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public getPackages()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/utility/JavaModule;->MODULE:Lnet/bytebuddy/utility/JavaModule$Module;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/utility/JavaModule;->module:Ljava/lang/reflect/AnnotatedElement;

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lnet/bytebuddy/utility/JavaModule$Module;->getPackages(Ljava/lang/Object;)Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;
    .locals 1
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/utility/JavaModule;->MODULE:Lnet/bytebuddy/utility/JavaModule$Module;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/utility/JavaModule;->module:Ljava/lang/reflect/AnnotatedElement;

    .line 4
    .line 5
    invoke-interface {v0, p0, p1}, Lnet/bytebuddy/utility/JavaModule$Module;->getResourceAsStream(Ljava/lang/Object;Ljava/lang/String;)Ljava/io/InputStream;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/utility/JavaModule;->module:Ljava/lang/reflect/AnnotatedElement;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public isExported(Lnet/bytebuddy/description/type/PackageDescription;Lnet/bytebuddy/utility/JavaModule;)Z
    .locals 1
    .param p1    # Lnet/bytebuddy/description/type/PackageDescription;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-interface {p1}, Lnet/bytebuddy/description/type/PackageDescription;->isDefault()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    sget-object v0, Lnet/bytebuddy/utility/JavaModule;->MODULE:Lnet/bytebuddy/utility/JavaModule$Module;

    .line 10
    .line 11
    iget-object p0, p0, Lnet/bytebuddy/utility/JavaModule;->module:Ljava/lang/reflect/AnnotatedElement;

    .line 12
    .line 13
    invoke-interface {p1}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p2}, Lnet/bytebuddy/utility/JavaModule;->unwrap()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-interface {v0, p0, p1, p2}, Lnet/bytebuddy/utility/JavaModule$Module;->isExported(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-eqz p0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p0, 0x0

    .line 29
    return p0

    .line 30
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 31
    return p0
.end method

.method public isNamed()Z
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/utility/JavaModule;->MODULE:Lnet/bytebuddy/utility/JavaModule$Module;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/utility/JavaModule;->module:Ljava/lang/reflect/AnnotatedElement;

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lnet/bytebuddy/utility/JavaModule$Module;->isNamed(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public isOpened(Lnet/bytebuddy/description/type/PackageDescription;Lnet/bytebuddy/utility/JavaModule;)Z
    .locals 1
    .param p1    # Lnet/bytebuddy/description/type/PackageDescription;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-interface {p1}, Lnet/bytebuddy/description/type/PackageDescription;->isDefault()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    sget-object v0, Lnet/bytebuddy/utility/JavaModule;->MODULE:Lnet/bytebuddy/utility/JavaModule$Module;

    .line 10
    .line 11
    iget-object p0, p0, Lnet/bytebuddy/utility/JavaModule;->module:Ljava/lang/reflect/AnnotatedElement;

    .line 12
    .line 13
    invoke-interface {p1}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p2}, Lnet/bytebuddy/utility/JavaModule;->unwrap()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-interface {v0, p0, p1, p2}, Lnet/bytebuddy/utility/JavaModule$Module;->isOpen(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-eqz p0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p0, 0x0

    .line 29
    return p0

    .line 30
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 31
    return p0
.end method

.method public toDescription()Lnet/bytebuddy/description/module/ModuleDescription;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/utility/JavaModule;->module:Ljava/lang/reflect/AnnotatedElement;

    .line 2
    .line 3
    invoke-static {p0}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->of(Ljava/lang/Object;)Lnet/bytebuddy/description/module/ModuleDescription;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/utility/JavaModule;->module:Ljava/lang/reflect/AnnotatedElement;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public unwrap()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/utility/JavaModule;->module:Ljava/lang/reflect/AnnotatedElement;

    .line 2
    .line 3
    return-object p0
.end method
