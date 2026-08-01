.class public Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/security/PrivilegedAction;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader;,
        Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$ProxiedInvocationHandler;,
        Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher;,
        Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DirectInvoker;,
        Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$InvokerCreationAction;,
        Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Defaults;,
        Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Container;,
        Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Instance;,
        Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$IsConstructor;,
        Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$IsStatic;,
        Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Proxied;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/security/PrivilegedAction<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final ACCESS_CONTROLLER:Z

.field private static final GENERATE:Z

.field public static final GENERATE_PROPERTY:Ljava/lang/String; = "net.bytebuddy.generate"

.field private static final INVOKER:Lnet/bytebuddy/utility/Invoker;

.field private static final RESOLVER:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader$Resolver;


# instance fields
.field private final classLoader:Ljava/lang/ClassLoader;
    .annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling;
        value = .enum Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;->REVERSE_NULLABILITY:Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final generate:Z

.field private final proxy:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TT;>;"
        }
    .end annotation
.end field


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
    sput-boolean v2, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->ACCESS_CONTROLLER:Z
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
    sput-boolean v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->ACCESS_CONTROLLER:Z

    .line 25
    .line 26
    :goto_0
    new-instance v1, Lnet/bytebuddy/utility/privilege/GetSystemPropertyAction;

    .line 27
    .line 28
    const-string v2, "net.bytebuddy.generate"

    .line 29
    .line 30
    invoke-direct {v1, v2}, Lnet/bytebuddy/utility/privilege/GetSystemPropertyAction;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v1}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    sput-boolean v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->GENERATE:Z

    .line 44
    .line 45
    sget-object v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader$Resolver$CreationAction;->INSTANCE:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader$Resolver$CreationAction;

    .line 46
    .line 47
    invoke-static {v1}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader$Resolver;

    .line 52
    .line 53
    sput-object v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->RESOLVER:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader$Resolver;

    .line 54
    .line 55
    new-instance v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$InvokerCreationAction;

    .line 56
    .line 57
    invoke-direct {v1, v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$InvokerCreationAction;-><init>(Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$1;)V

    .line 58
    .line 59
    .line 60
    invoke-static {v1}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Lnet/bytebuddy/utility/Invoker;

    .line 65
    .line 66
    sput-object v0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->INVOKER:Lnet/bytebuddy/utility/Invoker;

    .line 67
    .line 68
    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Ljava/lang/ClassLoader;Z)V
    .locals 0
    .param p2    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/ClassLoader;",
            "Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->proxy:Ljava/lang/Class;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->classLoader:Ljava/lang/ClassLoader;

    .line 7
    .line 8
    iput-boolean p3, p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->generate:Z

    .line 9
    .line 10
    return-void
.end method

.method public static synthetic access$100()Lnet/bytebuddy/utility/Invoker;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->INVOKER:Lnet/bytebuddy/utility/Invoker;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$200(Ljava/security/PrivilegedAction;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic access$300()Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader$Resolver;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->RESOLVER:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader$Resolver;

    .line 2
    .line 3
    return-object v0
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
    sget-boolean v0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->ACCESS_CONTROLLER:Z

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

.method public static of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Ljava/security/PrivilegedAction<",
            "TT;>;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 81
    invoke-static {p0, v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/security/PrivilegedAction;

    move-result-object p0

    return-object p0
.end method

.method public static of(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/security/PrivilegedAction;
    .locals 1
    .param p1    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/ClassLoader;",
            ")",
            "Ljava/security/PrivilegedAction<",
            "TT;>;"
        }
    .end annotation

    .line 80
    sget-boolean v0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->GENERATE:Z

    invoke-static {p0, p1, v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;Ljava/lang/ClassLoader;Z)Ljava/security/PrivilegedAction;

    move-result-object p0

    return-object p0
.end method

.method public static of(Ljava/lang/Class;Ljava/lang/ClassLoader;Z)Ljava/security/PrivilegedAction;
    .locals 3
    .param p1    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/ClassLoader;",
            "Z)",
            "Ljava/security/PrivilegedAction<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->isInterface()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    const-class v0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Proxied;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Ljava/lang/Class;->isAnnotationPresent(Ljava/lang/Class;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Proxied;

    .line 21
    .line 22
    invoke-interface {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Proxied;->value()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v2, "java.security."

    .line 27
    .line 28
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    new-instance v0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;

    .line 35
    .line 36
    invoke-direct {v0, p0, p1, p2}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;-><init>(Ljava/lang/Class;Ljava/lang/ClassLoader;Z)V

    .line 37
    .line 38
    .line 39
    return-object v0

    .line 40
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    const-string p1, "Classes related to Java security cannot be proxied: "

    .line 45
    .line 46
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v1

    .line 54
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    const-string p1, " to be annotated with "

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    const-string v0, "Expected "

    .line 65
    .line 66
    invoke-static {v0, p0, p1, p2}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世哲苏(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    return-object v1

    .line 70
    :cond_2
    const-string p1, "Expected an interface instead of "

    .line 71
    .line 72
    invoke-static {p0, p1}, L飘花落叶言苏楪世子兰哲/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    return-object v1
.end method


# virtual methods
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
    iget-boolean v2, p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->generate:Z

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;

    .line 23
    .line 24
    iget-boolean v3, p1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->generate:Z

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->proxy:Ljava/lang/Class;

    .line 30
    .line 31
    iget-object v3, p1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->proxy:Ljava/lang/Class;

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_4

    .line 38
    .line 39
    return v1

    .line 40
    :cond_4
    iget-object p0, p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->classLoader:Ljava/lang/ClassLoader;

    .line 41
    .line 42
    iget-object p1, p1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->classLoader:Ljava/lang/ClassLoader;

    .line 43
    .line 44
    if-eqz p1, :cond_5

    .line 45
    .line 46
    if-eqz p0, :cond_6

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-nez p0, :cond_7

    .line 53
    .line 54
    return v1

    .line 55
    :cond_5
    if-eqz p0, :cond_7

    .line 56
    .line 57
    :cond_6
    return v1

    .line 58
    :cond_7
    return v0
.end method

.method public hashCode()I
    .locals 3

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
    const/16 v1, 0x1f

    .line 10
    .line 11
    mul-int/2addr v0, v1

    .line 12
    iget-object v2, p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->proxy:Ljava/lang/Class;

    .line 13
    .line 14
    invoke-static {v0, v1, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(IILjava/lang/Class;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v2, p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->classLoader:Ljava/lang/ClassLoader;

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    add-int/2addr v0, v2

    .line 27
    :cond_0
    mul-int/2addr v0, v1

    .line 28
    iget-boolean p0, p0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->generate:Z

    .line 29
    .line 30
    add-int/2addr v0, p0

    .line 31
    return v0
.end method

.method public run()Ljava/lang/Object;
    .locals 34
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    move-object/from16 v1, p0

    .line 1
    const-string v2, "Instance check requires a single regular-typed argument: "

    const-string v3, "Instance check requires a boolean return type: "

    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const-class v5, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Instance;

    const-class v6, Ljava/lang/Object;

    const-class v7, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$IsStatic;

    const/4 v8, 0x0

    :try_start_0
    const-class v0, Ljava/lang/System;

    const-string v9, "getSecurityManager"

    invoke-virtual {v0, v9, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v8, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2
    const-string v9, "java.lang.RuntimePermission"

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    const-class v10, Ljava/lang/String;

    filled-new-array {v10}, [Ljava/lang/Class;

    move-result-object v10

    .line 3
    invoke-virtual {v9, v10}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v9

    const-string v10, "net.bytebuddy.createJavaDispatcher"

    filled-new-array {v10}, [Ljava/lang/Object;

    move-result-object v10

    .line 4
    invoke-virtual {v9, v10}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    .line 5
    const-string v10, "java.lang.SecurityManager"

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    const-string v11, "checkPermission"

    const-class v12, Ljava/security/Permission;

    filled-new-array {v12}, [Ljava/lang/Class;

    move-result-object v12

    .line 6
    invoke-virtual {v10, v11, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v10

    filled-new-array {v9}, [Ljava/lang/Object;

    move-result-object v9

    .line 7
    invoke-virtual {v10, v0, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1

    :catch_2
    move-exception v0

    goto :goto_2

    .line 8
    :goto_0
    const-string v1, "Failed to instantiate runtime permission"

    invoke-static {v1, v0}, L飘花落叶言苏世哲楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v8

    .line 9
    :goto_1
    const-string v1, "Failed to access security manager"

    invoke-static {v1, v0}, L飘花落叶言苏世哲楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v8

    .line 10
    :goto_2
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    move-result-object v0

    .line 11
    instance-of v1, v0, Ljava/lang/RuntimeException;

    if-nez v1, :cond_0

    .line 12
    const-string v1, "Failed to assert access rights using security manager"

    invoke-static {v1, v0}, L飘花落叶言苏世哲楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v8

    .line 13
    :cond_0
    check-cast v0, Ljava/lang/RuntimeException;

    throw v0

    .line 14
    :catch_3
    :cond_1
    :goto_3
    iget-boolean v0, v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->generate:Z

    if-eqz v0, :cond_2

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    :goto_4
    move-object v9, v0

    goto :goto_5

    :cond_2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    goto :goto_4

    .line 15
    :goto_5
    iget-object v0, v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->proxy:Ljava/lang/Class;

    const-class v10, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Defaults;

    invoke-virtual {v0, v10}, Ljava/lang/Class;->isAnnotationPresent(Ljava/lang/Class;)Z

    move-result v11

    .line 16
    iget-object v0, v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->proxy:Ljava/lang/Class;

    const-class v12, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Proxied;

    invoke-virtual {v0, v12}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Proxied;

    invoke-interface {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Proxied;->value()Ljava/lang/String;

    move-result-object v13

    const/4 v15, 0x0

    .line 17
    :try_start_1
    iget-object v0, v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->classLoader:Ljava/lang/ClassLoader;

    invoke-static {v13, v15, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v13
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_16

    .line 18
    iget-boolean v0, v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->generate:Z

    if-eqz v0, :cond_3

    move-object/from16 v16, v8

    .line 19
    invoke-static {}, Lnet/bytebuddy/utility/GraalImageCode;->getCurrent()Lnet/bytebuddy/utility/GraalImageCode;

    move-result-object v8

    move/from16 v17, v15

    iget-object v15, v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->proxy:Ljava/lang/Class;

    invoke-virtual {v15}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v15

    sget-object v14, Lnet/bytebuddy/utility/MethodComparator;->INSTANCE:Lnet/bytebuddy/utility/MethodComparator;

    invoke-virtual {v8, v15, v14}, Lnet/bytebuddy/utility/GraalImageCode;->sorted([Ljava/lang/Object;Ljava/util/Comparator;)[Ljava/lang/Object;

    move-result-object v8

    check-cast v8, [Ljava/lang/reflect/Method;

    goto :goto_6

    :cond_3
    move-object/from16 v16, v8

    move/from16 v17, v15

    iget-object v8, v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->proxy:Ljava/lang/Class;

    .line 20
    invoke-virtual {v8}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v8

    .line 21
    :goto_6
    array-length v14, v8

    move v15, v0

    move-object/from16 v19, v8

    move/from16 v8, v17

    :goto_7
    if-ge v8, v14, :cond_2e

    move/from16 v20, v8

    aget-object v8, v19, v20

    .line 22
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    if-ne v0, v6, :cond_4

    move/from16 v21, v11

    goto :goto_8

    .line 23
    :cond_4
    invoke-virtual {v8, v5}, Ljava/lang/reflect/AccessibleObject;->isAnnotationPresent(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 24
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    array-length v0, v0

    move/from16 v21, v11

    const/4 v11, 0x1

    if-ne v0, v11, :cond_6

    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    aget-object v0, v0, v17

    invoke-virtual {v0, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 25
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v0

    if-ne v0, v4, :cond_5

    .line 26
    new-instance v0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForInstanceCheck;

    invoke-direct {v0, v13}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForInstanceCheck;-><init>(Ljava/lang/Class;)V

    invoke-interface {v9, v8, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_8

    .line 27
    :cond_5
    invoke-static {v8, v3}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v16

    .line 28
    :cond_6
    invoke-static {v8, v2}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v16

    :cond_7
    move/from16 v21, v11

    .line 29
    const-class v0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Container;

    invoke-virtual {v8, v0}, Ljava/lang/reflect/AccessibleObject;->isAnnotationPresent(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 30
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    array-length v0, v0

    const/4 v11, 0x1

    if-ne v0, v11, :cond_9

    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    aget-object v0, v0, v17

    sget-object v11, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v0, v11, :cond_9

    .line 31
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 32
    new-instance v0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForContainerCreation;

    invoke-direct {v0, v13}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForContainerCreation;-><init>(Ljava/lang/Class;)V

    invoke-interface {v9, v8, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_8
    move-object/from16 v24, v2

    move-object/from16 v25, v3

    move-object/from16 v31, v4

    move-object/from16 v32, v5

    move-object/from16 v33, v6

    move/from16 v22, v14

    goto/16 :goto_2f

    .line 33
    :cond_8
    const-string v0, "Container creation requires an assignable array as return value: "

    invoke-static {v8, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v16

    .line 34
    :cond_9
    const-string v0, "Container creation requires a single int-typed argument: "

    invoke-static {v8, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v16

    .line 35
    :cond_a
    invoke-virtual {v13}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v11, "java.lang.invoke.MethodHandles"

    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v11, "lookup"

    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_9

    .line 36
    :cond_b
    const-string v0, "Cannot resolve Byte Buddy lookup via dispatcher"

    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;)V

    return-object v16

    .line 37
    :cond_c
    :goto_9
    :try_start_2
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    .line 38
    invoke-virtual {v8, v7}, Ljava/lang/reflect/AccessibleObject;->isAnnotationPresent(Ljava/lang/Class;)Z

    move-result v11
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_15
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_14
    .catchall {:try_start_2 .. :try_end_2} :catchall_8

    move/from16 v22, v11

    const-class v11, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$IsConstructor;

    if-nez v22, :cond_d

    :try_start_3
    invoke-virtual {v8, v11}, Ljava/lang/reflect/AccessibleObject;->isAnnotationPresent(Ljava/lang/Class;)Z

    move-result v22
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_b
    .catch Ljava/lang/NoSuchMethodException; {:try_start_3 .. :try_end_3} :catch_a
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    if-eqz v22, :cond_e

    :cond_d
    move-object/from16 v24, v2

    move-object/from16 v25, v3

    move/from16 v22, v14

    move/from16 v23, v15

    goto/16 :goto_19

    :cond_e
    move/from16 v22, v14

    .line 39
    :try_start_4
    array-length v14, v0

    if-eqz v14, :cond_10

    .line 40
    aget-object v14, v0, v17

    invoke-virtual {v14, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v14

    if-eqz v14, :cond_f

    .line 41
    array-length v14, v0
    :try_end_4
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_4} :catch_9
    .catch Ljava/lang/NoSuchMethodException; {:try_start_4 .. :try_end_4} :catch_8
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    move/from16 v23, v14

    const/16 v18, 0x1

    add-int/lit8 v14, v23, -0x1

    move/from16 v23, v15

    :try_start_5
    new-array v15, v14, [Ljava/lang/Class;
    :try_end_5
    .catch Ljava/lang/ClassNotFoundException; {:try_start_5 .. :try_end_5} :catch_7
    .catch Ljava/lang/NoSuchMethodException; {:try_start_5 .. :try_end_5} :catch_6
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    move-object/from16 v24, v2

    move-object/from16 v25, v3

    move/from16 v3, v17

    move/from16 v2, v18

    .line 42
    :try_start_6
    invoke-static {v0, v2, v15, v3, v14}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v0, v15

    const/4 v2, 0x1

    goto/16 :goto_1a

    :catchall_0
    move-exception v0

    :goto_a
    move-object/from16 v31, v4

    :goto_b
    move-object/from16 v32, v5

    :goto_c
    move-object/from16 v33, v6

    :goto_d
    move/from16 v15, v23

    goto/16 :goto_28

    :catch_4
    move-exception v0

    :goto_e
    move-object/from16 v31, v4

    :goto_f
    move-object/from16 v32, v5

    :goto_10
    move-object/from16 v33, v6

    :goto_11
    move/from16 v15, v23

    goto/16 :goto_29

    :catch_5
    move-exception v0

    :goto_12
    move-object/from16 v31, v4

    :goto_13
    move-object/from16 v32, v5

    :goto_14
    move-object/from16 v33, v6

    :goto_15
    move/from16 v15, v23

    goto/16 :goto_2c

    :catchall_1
    move-exception v0

    move-object/from16 v24, v2

    move-object/from16 v25, v3

    goto :goto_a

    :catch_6
    move-exception v0

    move-object/from16 v24, v2

    move-object/from16 v25, v3

    goto :goto_e

    :catch_7
    move-exception v0

    move-object/from16 v24, v2

    move-object/from16 v25, v3

    goto :goto_12

    :catchall_2
    move-exception v0

    move-object/from16 v24, v2

    move-object/from16 v25, v3

    :goto_16
    move/from16 v23, v15

    move-object/from16 v31, v4

    move-object/from16 v32, v5

    move-object/from16 v33, v6

    goto/16 :goto_28

    :catch_8
    move-exception v0

    move-object/from16 v24, v2

    move-object/from16 v25, v3

    :goto_17
    move/from16 v23, v15

    move-object/from16 v31, v4

    move-object/from16 v32, v5

    move-object/from16 v33, v6

    goto/16 :goto_29

    :catch_9
    move-exception v0

    move-object/from16 v24, v2

    move-object/from16 v25, v3

    :goto_18
    move/from16 v23, v15

    move-object/from16 v31, v4

    move-object/from16 v32, v5

    move-object/from16 v33, v6

    goto/16 :goto_2c

    :cond_f
    move-object/from16 v24, v2

    move-object/from16 v25, v3

    move/from16 v23, v15

    .line 43
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Cannot assign self type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " on "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_10
    move-object/from16 v24, v2

    move-object/from16 v25, v3

    move/from16 v23, v15

    .line 44
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Expected self type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_3
    move-exception v0

    move-object/from16 v24, v2

    move-object/from16 v25, v3

    move/from16 v22, v14

    goto :goto_16

    :catch_a
    move-exception v0

    move-object/from16 v24, v2

    move-object/from16 v25, v3

    move/from16 v22, v14

    goto :goto_17

    :catch_b
    move-exception v0

    move-object/from16 v24, v2

    move-object/from16 v25, v3

    move/from16 v22, v14

    goto :goto_18

    :goto_19
    const/4 v2, 0x0

    .line 45
    :goto_1a
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    move-result-object v3

    const/4 v14, 0x0

    .line 46
    :goto_1b
    array-length v15, v0

    if-ge v14, v15, :cond_19

    add-int v15, v14, v2

    .line 47
    aget-object v15, v3, v15

    move/from16 v26, v2

    array-length v2, v15

    move-object/from16 v27, v3

    const/4 v3, 0x0

    :goto_1c
    if-ge v3, v2, :cond_18

    move/from16 v28, v2

    aget-object v2, v15, v3

    move/from16 v29, v3

    .line 48
    instance-of v3, v2, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Proxied;

    if-eqz v3, :cond_17

    const/4 v3, 0x0

    .line 49
    :goto_1d
    aget-object v15, v0, v14

    invoke-virtual {v15}, Ljava/lang/Class;->isArray()Z

    move-result v15

    if-eqz v15, :cond_11

    add-int/lit8 v3, v3, 0x1

    .line 50
    aget-object v15, v0, v14

    invoke-virtual {v15}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v15

    aput-object v15, v0, v14
    :try_end_6
    .catch Ljava/lang/ClassNotFoundException; {:try_start_6 .. :try_end_6} :catch_5
    .catch Ljava/lang/NoSuchMethodException; {:try_start_6 .. :try_end_6} :catch_4
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_1d

    .line 51
    :cond_11
    const-string v15, " at "

    move-object/from16 v30, v2

    const-string v2, " of "

    if-lez v3, :cond_15

    .line 52
    :try_start_7
    aget-object v28, v0, v14

    invoke-virtual/range {v28 .. v28}, Ljava/lang/Class;->isPrimitive()Z

    move-result v28

    if-nez v28, :cond_14

    move/from16 v28, v3

    .line 53
    aget-object v3, v0, v14

    move-object/from16 v29, v30

    check-cast v29, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Proxied;
    :try_end_7
    .catch Ljava/lang/ClassNotFoundException; {:try_start_7 .. :try_end_7} :catch_5
    .catch Ljava/lang/NoSuchMethodException; {:try_start_7 .. :try_end_7} :catch_4
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    move-object/from16 v31, v4

    :try_start_8
    invoke-interface/range {v29 .. v29}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Proxied;->value()Ljava/lang/String;

    move-result-object v4
    :try_end_8
    .catch Ljava/lang/ClassNotFoundException; {:try_start_8 .. :try_end_8} :catch_11
    .catch Ljava/lang/NoSuchMethodException; {:try_start_8 .. :try_end_8} :catch_10
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    move-object/from16 v32, v5

    :try_start_9
    iget-object v5, v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->classLoader:Ljava/lang/ClassLoader;
    :try_end_9
    .catch Ljava/lang/ClassNotFoundException; {:try_start_9 .. :try_end_9} :catch_f
    .catch Ljava/lang/NoSuchMethodException; {:try_start_9 .. :try_end_9} :catch_e
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    move-object/from16 v33, v6

    const/4 v6, 0x0

    :try_start_a
    invoke-static {v4, v6, v5}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_13

    .line 54
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v3, v28

    :goto_1e
    add-int/lit8 v4, v3, -0x1

    if-lez v3, :cond_12

    const/16 v3, 0x5b

    .line 55
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move v3, v4

    goto :goto_1e

    :catchall_4
    move-exception v0

    goto/16 :goto_d

    :catch_c
    move-exception v0

    goto/16 :goto_11

    :catch_d
    move-exception v0

    goto/16 :goto_15

    :cond_12
    const/16 v3, 0x4c

    .line 56
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-object/from16 v3, v30

    check-cast v3, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Proxied;

    .line 57
    invoke-interface {v3}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Proxied;->value()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x3b

    .line 58
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 59
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->classLoader:Ljava/lang/ClassLoader;

    const/4 v6, 0x0

    .line 60
    invoke-static {v2, v6, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v2

    aput-object v2, v0, v14

    goto/16 :goto_1f

    .line 61
    :cond_13
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Cannot resolve to component type: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v4, v30

    check-cast v4, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Proxied;

    invoke-interface {v4}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Proxied;->value()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_5
    move-exception v0

    goto/16 :goto_c

    :catch_e
    move-exception v0

    goto/16 :goto_10

    :catch_f
    move-exception v0

    goto/16 :goto_14

    :catchall_6
    move-exception v0

    goto/16 :goto_b

    :catch_10
    move-exception v0

    goto/16 :goto_f

    :catch_11
    move-exception v0

    goto/16 :goto_13

    :cond_14
    move-object/from16 v31, v4

    move-object/from16 v32, v5

    move-object/from16 v33, v6

    .line 62
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Primitive values are not supposed to be proxied: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_15
    move-object/from16 v31, v4

    move-object/from16 v32, v5

    move-object/from16 v33, v6

    .line 63
    move-object/from16 v3, v30

    check-cast v3, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Proxied;

    invoke-interface {v3}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Proxied;->value()Ljava/lang/String;

    move-result-object v3

    iget-object v4, v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->classLoader:Ljava/lang/ClassLoader;

    const/4 v6, 0x0

    invoke-static {v3, v6, v4}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v3

    .line 64
    aget-object v4, v0, v14

    invoke-virtual {v4, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_16

    .line 65
    aput-object v3, v0, v14

    goto :goto_1f

    .line 66
    :cond_16
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Cannot resolve to type: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_17
    move-object/from16 v31, v4

    move-object/from16 v32, v5

    move-object/from16 v33, v6

    add-int/lit8 v3, v29, 0x1

    move/from16 v2, v28

    goto/16 :goto_1c

    :cond_18
    move-object/from16 v31, v4

    move-object/from16 v32, v5

    move-object/from16 v33, v6

    :goto_1f
    add-int/lit8 v14, v14, 0x1

    move/from16 v2, v26

    move-object/from16 v3, v27

    move-object/from16 v4, v31

    move-object/from16 v5, v32

    move-object/from16 v6, v33

    goto/16 :goto_1b

    :cond_19
    move-object/from16 v31, v4

    move-object/from16 v32, v5

    move-object/from16 v33, v6

    .line 67
    invoke-virtual {v8, v11}, Ljava/lang/reflect/AccessibleObject;->isAnnotationPresent(Ljava/lang/Class;)Z

    move-result v2
    :try_end_a
    .catch Ljava/lang/ClassNotFoundException; {:try_start_a .. :try_end_a} :catch_d
    .catch Ljava/lang/NoSuchMethodException; {:try_start_a .. :try_end_a} :catch_c
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    const-string v3, " to "

    const-string v4, "Cannot assign "

    if-eqz v2, :cond_1d

    .line 68
    :try_start_b
    invoke-virtual {v13, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    .line 69
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_1c

    .line 70
    invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->getModifiers()I

    move-result v2

    const/4 v11, 0x1

    and-int/2addr v2, v11

    if-eqz v2, :cond_1b

    invoke-virtual {v13}, Ljava/lang/Class;->getModifiers()I

    move-result v2

    and-int/2addr v2, v11

    if-nez v2, :cond_1a

    goto :goto_20

    :cond_1a
    move/from16 v15, v23

    goto :goto_21

    .line 71
    :cond_1b
    :goto_20
    invoke-virtual {v0, v11}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_b
    .catch Ljava/lang/ClassNotFoundException; {:try_start_b .. :try_end_b} :catch_d
    .catch Ljava/lang/NoSuchMethodException; {:try_start_b .. :try_end_b} :catch_c
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    const/4 v15, 0x0

    .line 72
    :goto_21
    :try_start_c
    new-instance v2, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForConstructor;

    invoke-direct {v2, v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForConstructor;-><init>(Ljava/lang/reflect/Constructor;)V

    invoke-interface {v9, v8, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_c
    .catch Ljava/lang/ClassNotFoundException; {:try_start_c .. :try_end_c} :catch_13
    .catch Ljava/lang/NoSuchMethodException; {:try_start_c .. :try_end_c} :catch_12
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    goto/16 :goto_2f

    :catchall_7
    move-exception v0

    goto/16 :goto_28

    :catch_12
    move-exception v0

    goto/16 :goto_29

    :catch_13
    move-exception v0

    goto/16 :goto_2c

    .line 73
    :cond_1c
    :try_start_d
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 74
    :cond_1d
    invoke-virtual {v8, v12}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v2

    check-cast v2, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Proxied;

    if-nez v2, :cond_1e

    .line 75
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v2

    goto :goto_22

    :cond_1e
    invoke-interface {v2}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Proxied;->value()Ljava/lang/String;

    move-result-object v2

    :goto_22
    invoke-virtual {v13, v2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 76
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_29

    .line 77
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getExceptionTypes()[Ljava/lang/Class;

    move-result-object v2

    array-length v3, v2
    :try_end_d
    .catch Ljava/lang/ClassNotFoundException; {:try_start_d .. :try_end_d} :catch_d
    .catch Ljava/lang/NoSuchMethodException; {:try_start_d .. :try_end_d} :catch_c
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    const/4 v4, 0x0

    :goto_23
    const-string v5, "Resolved method for "

    if-ge v4, v3, :cond_23

    :try_start_e
    aget-object v6, v2, v4

    .line 78
    const-class v11, Ljava/lang/RuntimeException;

    invoke-virtual {v11, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v11

    if-nez v11, :cond_1f

    const-class v11, Ljava/lang/Error;

    invoke-virtual {v11, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v11

    if-eqz v11, :cond_20

    :cond_1f
    move-object/from16 v26, v2

    goto :goto_25

    .line 79
    :cond_20
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getExceptionTypes()[Ljava/lang/Class;

    move-result-object v11

    array-length v14, v11

    const/4 v15, 0x0

    :goto_24
    if-ge v15, v14, :cond_22

    move-object/from16 v26, v2

    aget-object v2, v11, v15

    .line 80
    invoke-virtual {v2, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_21

    goto :goto_25

    :cond_21
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v2, v26

    goto :goto_24

    .line 81
    :cond_22
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " throws undeclared checked exception "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_25
    add-int/lit8 v4, v4, 0x1

    move-object/from16 v2, v26

    goto :goto_23

    .line 82
    :cond_23
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v2

    const/16 v18, 0x1

    and-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_24

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getModifiers()I

    move-result v2

    and-int/lit8 v2, v2, 0x1

    if-nez v2, :cond_25

    :cond_24
    const/4 v11, 0x1

    goto :goto_26

    :cond_25
    move/from16 v15, v23

    goto :goto_27

    .line 83
    :goto_26
    invoke-virtual {v0, v11}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_e
    .catch Ljava/lang/ClassNotFoundException; {:try_start_e .. :try_end_e} :catch_d
    .catch Ljava/lang/NoSuchMethodException; {:try_start_e .. :try_end_e} :catch_c
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    const/4 v15, 0x0

    .line 84
    :goto_27
    :try_start_f
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v2

    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v2

    if-eqz v2, :cond_27

    .line 85
    invoke-virtual {v8, v7}, Ljava/lang/reflect/AccessibleObject;->isAnnotationPresent(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_26

    .line 86
    new-instance v2, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForStaticMethod;

    invoke-direct {v2, v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForStaticMethod;-><init>(Ljava/lang/reflect/Method;)V

    invoke-interface {v9, v8, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_2f

    .line 87
    :cond_26
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " was expected to be static: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 88
    :cond_27
    invoke-virtual {v8, v7}, Ljava/lang/reflect/AccessibleObject;->isAnnotationPresent(Ljava/lang/Class;)Z

    move-result v2

    if-nez v2, :cond_28

    .line 89
    new-instance v2, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForNonStaticMethod;

    invoke-direct {v2, v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForNonStaticMethod;-><init>(Ljava/lang/reflect/Method;)V

    invoke-interface {v9, v8, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_2f

    .line 90
    :cond_28
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " was expected to be virtual: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_f
    .catch Ljava/lang/ClassNotFoundException; {:try_start_f .. :try_end_f} :catch_13
    .catch Ljava/lang/NoSuchMethodException; {:try_start_f .. :try_end_f} :catch_12
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    .line 91
    :cond_29
    :try_start_10
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_10
    .catch Ljava/lang/ClassNotFoundException; {:try_start_10 .. :try_end_10} :catch_d
    .catch Ljava/lang/NoSuchMethodException; {:try_start_10 .. :try_end_10} :catch_c
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    :catchall_8
    move-exception v0

    move-object/from16 v24, v2

    move-object/from16 v25, v3

    move-object/from16 v31, v4

    move-object/from16 v32, v5

    move-object/from16 v33, v6

    move/from16 v22, v14

    move/from16 v23, v15

    goto :goto_28

    :catch_14
    move-exception v0

    move-object/from16 v24, v2

    move-object/from16 v25, v3

    move-object/from16 v31, v4

    move-object/from16 v32, v5

    move-object/from16 v33, v6

    move/from16 v22, v14

    move/from16 v23, v15

    goto :goto_29

    :catch_15
    move-exception v0

    move-object/from16 v24, v2

    move-object/from16 v25, v3

    move-object/from16 v31, v4

    move-object/from16 v32, v5

    move-object/from16 v33, v6

    move/from16 v22, v14

    move/from16 v23, v15

    goto :goto_2c

    .line 92
    :goto_28
    new-instance v2, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForUnresolvedMethod;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Unexpected error: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForUnresolvedMethod;-><init>(Ljava/lang/String;)V

    invoke-interface {v9, v8, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2f

    :goto_29
    if-nez v21, :cond_2b

    .line 93
    invoke-virtual {v8, v10}, Ljava/lang/reflect/AccessibleObject;->isAnnotationPresent(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_2a

    goto :goto_2a

    .line 94
    :cond_2a
    new-instance v2, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForUnresolvedMethod;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Method not available on current VM: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 95
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForUnresolvedMethod;-><init>(Ljava/lang/String;)V

    goto :goto_2b

    .line 96
    :cond_2b
    :goto_2a
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;->of(Ljava/lang/Class;)Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher;

    move-result-object v2

    .line 97
    :goto_2b
    invoke-interface {v9, v8, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2f

    :goto_2c
    if-nez v21, :cond_2d

    .line 98
    invoke-virtual {v8, v10}, Ljava/lang/reflect/AccessibleObject;->isAnnotationPresent(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_2c

    goto :goto_2d

    .line 99
    :cond_2c
    new-instance v2, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForUnresolvedMethod;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Class not available on current VM: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 100
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForUnresolvedMethod;-><init>(Ljava/lang/String;)V

    goto :goto_2e

    .line 101
    :cond_2d
    :goto_2d
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;->of(Ljava/lang/Class;)Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher;

    move-result-object v2

    .line 102
    :goto_2e
    invoke-interface {v9, v8, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_2f
    add-int/lit8 v8, v20, 0x1

    move/from16 v11, v21

    move/from16 v14, v22

    move-object/from16 v2, v24

    move-object/from16 v3, v25

    move-object/from16 v4, v31

    move-object/from16 v5, v32

    move-object/from16 v6, v33

    const/16 v17, 0x0

    goto/16 :goto_7

    :cond_2e
    move/from16 v23, v15

    .line 103
    iget-object v0, v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->proxy:Ljava/lang/Class;

    if-eqz v23, :cond_2f

    .line 104
    invoke-static {v0, v9}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader;->proxy(Ljava/lang/Class;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 105
    :cond_2f
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    iget-object v1, v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->proxy:Ljava/lang/Class;

    filled-new-array {v1}, [Ljava/lang/Class;

    move-result-object v1

    new-instance v2, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$ProxiedInvocationHandler;

    .line 106
    invoke-virtual {v13}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v9}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$ProxiedInvocationHandler;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 107
    invoke-static {v0, v1, v2}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :catch_16
    move-exception v0

    move-object/from16 v24, v2

    move-object/from16 v25, v3

    move-object/from16 v31, v4

    move-object/from16 v32, v5

    move-object/from16 v33, v6

    move-object/from16 v16, v8

    move/from16 v21, v11

    .line 108
    iget-boolean v2, v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->generate:Z

    if-eqz v2, :cond_30

    .line 109
    invoke-static {}, Lnet/bytebuddy/utility/GraalImageCode;->getCurrent()Lnet/bytebuddy/utility/GraalImageCode;

    move-result-object v2

    iget-object v3, v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->proxy:Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v3

    sget-object v4, Lnet/bytebuddy/utility/MethodComparator;->INSTANCE:Lnet/bytebuddy/utility/MethodComparator;

    invoke-virtual {v2, v3, v4}, Lnet/bytebuddy/utility/GraalImageCode;->sorted([Ljava/lang/Object;Ljava/util/Comparator;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/reflect/Method;

    goto :goto_30

    :cond_30
    iget-object v2, v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->proxy:Ljava/lang/Class;

    .line 110
    invoke-virtual {v2}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v2

    .line 111
    :goto_30
    array-length v3, v2

    const/4 v4, 0x0

    :goto_31
    if-ge v4, v3, :cond_37

    aget-object v5, v2, v4

    .line 112
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v6

    move-object/from16 v7, v33

    if-ne v6, v7, :cond_31

    move-object/from16 v19, v2

    move-object/from16 v14, v24

    move-object/from16 v8, v25

    move-object/from16 v12, v31

    move-object/from16 v6, v32

    const/16 v17, 0x0

    goto/16 :goto_34

    :cond_31
    move-object/from16 v6, v32

    .line 113
    invoke-virtual {v5, v6}, Ljava/lang/reflect/AccessibleObject;->isAnnotationPresent(Ljava/lang/Class;)Z

    move-result v8

    if-eqz v8, :cond_34

    .line 114
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v8

    array-length v8, v8

    const/4 v11, 0x1

    if-ne v8, v11, :cond_33

    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v8

    const/16 v17, 0x0

    aget-object v8, v8, v17

    invoke-virtual {v8}, Ljava/lang/Class;->isPrimitive()Z

    move-result v8

    if-nez v8, :cond_33

    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v8

    aget-object v8, v8, v17

    invoke-virtual {v8}, Ljava/lang/Class;->isArray()Z

    move-result v8

    if-nez v8, :cond_33

    .line 115
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v8

    move-object/from16 v12, v31

    if-ne v8, v12, :cond_32

    .line 116
    sget-object v8, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;->BOOLEAN:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

    invoke-interface {v9, v5, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v19, v2

    move-object/from16 v14, v24

    move-object/from16 v8, v25

    goto :goto_34

    :cond_32
    move-object/from16 v8, v25

    .line 117
    invoke-static {v5, v8}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v16

    :cond_33
    move-object/from16 v14, v24

    .line 118
    invoke-static {v5, v14}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v16

    :cond_34
    move-object/from16 v14, v24

    move-object/from16 v8, v25

    move-object/from16 v12, v31

    const/4 v11, 0x1

    const/16 v17, 0x0

    if-nez v21, :cond_35

    .line 119
    invoke-virtual {v5, v10}, Ljava/lang/reflect/AccessibleObject;->isAnnotationPresent(Ljava/lang/Class;)Z

    move-result v15

    if-eqz v15, :cond_36

    :cond_35
    move-object/from16 v19, v2

    goto :goto_32

    .line 120
    :cond_36
    new-instance v15, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForUnresolvedMethod;

    new-instance v11, Ljava/lang/StringBuilder;

    move-object/from16 v19, v2

    const-string v2, "Type not available on current VM: "

    invoke-direct {v11, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 121
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v15, v2}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForUnresolvedMethod;-><init>(Ljava/lang/String;)V

    goto :goto_33

    .line 122
    :goto_32
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v2

    invoke-static {v2}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;->of(Ljava/lang/Class;)Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher;

    move-result-object v15

    .line 123
    :goto_33
    invoke-interface {v9, v5, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_34
    add-int/lit8 v4, v4, 0x1

    move-object/from16 v32, v6

    move-object/from16 v33, v7

    move-object/from16 v25, v8

    move-object/from16 v31, v12

    move-object/from16 v24, v14

    move-object/from16 v2, v19

    goto/16 :goto_31

    .line 124
    :cond_37
    iget-boolean v0, v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->generate:Z

    .line 125
    iget-object v2, v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->proxy:Ljava/lang/Class;

    if-eqz v0, :cond_38

    .line 126
    invoke-static {v2, v9}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader;->proxy(Ljava/lang/Class;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 127
    :cond_38
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    iget-object v1, v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->proxy:Ljava/lang/Class;

    filled-new-array {v1}, [Ljava/lang/Class;

    move-result-object v1

    new-instance v2, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$ProxiedInvocationHandler;

    invoke-direct {v2, v13, v9}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$ProxiedInvocationHandler;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    invoke-static {v0, v1, v2}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
