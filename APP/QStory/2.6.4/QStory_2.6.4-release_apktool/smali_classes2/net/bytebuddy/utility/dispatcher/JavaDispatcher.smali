.class public Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

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
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

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
    invoke-static {p0, p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世苏兰(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

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

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v2, "Instance check requires a single regular-typed argument: "

    .line 4
    .line 5
    const-string v3, "Instance check requires a boolean return type: "

    .line 6
    .line 7
    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 8
    .line 9
    const-class v5, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Instance;

    .line 10
    .line 11
    const-class v6, Ljava/lang/Object;

    .line 12
    .line 13
    const-class v7, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$IsStatic;

    .line 14
    .line 15
    const/4 v8, 0x0

    .line 16
    :try_start_0
    const-class v0, Ljava/lang/System;

    .line 17
    .line 18
    const-string v9, "getSecurityManager"

    .line 19
    .line 20
    invoke-virtual {v0, v9, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0, v8, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    const-string v9, "java.lang.RuntimePermission"

    .line 31
    .line 32
    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v9

    .line 36
    const-class v10, Ljava/lang/String;

    .line 37
    .line 38
    filled-new-array {v10}, [Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v10

    .line 42
    invoke-virtual {v9, v10}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 43
    .line 44
    .line 45
    move-result-object v9

    .line 46
    const-string v10, "net.bytebuddy.createJavaDispatcher"

    .line 47
    .line 48
    filled-new-array {v10}, [Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v10

    .line 52
    invoke-virtual {v9, v10}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v9

    .line 56
    const-string v10, "java.lang.SecurityManager"

    .line 57
    .line 58
    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v10

    .line 62
    const-string v11, "checkPermission"

    .line 63
    .line 64
    const-class v12, Ljava/security/Permission;

    .line 65
    .line 66
    filled-new-array {v12}, [Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object v12

    .line 70
    invoke-virtual {v10, v11, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 71
    .line 72
    .line 73
    move-result-object v10

    .line 74
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v9

    .line 78
    invoke-virtual {v10, v0, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 79
    .line 80
    .line 81
    goto :goto_3

    .line 82
    :catch_0
    move-exception v0

    .line 83
    goto :goto_0

    .line 84
    :catch_1
    move-exception v0

    .line 85
    goto :goto_1

    .line 86
    :catch_2
    move-exception v0

    .line 87
    goto :goto_2

    .line 88
    :goto_0
    const-string v1, "Failed to instantiate runtime permission"

    .line 89
    .line 90
    invoke-static {v1, v0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 91
    .line 92
    .line 93
    return-object v8

    .line 94
    :goto_1
    const-string v1, "Failed to access security manager"

    .line 95
    .line 96
    invoke-static {v1, v0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 97
    .line 98
    .line 99
    return-object v8

    .line 100
    :goto_2
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    instance-of v1, v0, Ljava/lang/RuntimeException;

    .line 105
    .line 106
    if-nez v1, :cond_0

    .line 107
    .line 108
    const-string v1, "Failed to assert access rights using security manager"

    .line 109
    .line 110
    invoke-static {v1, v0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 111
    .line 112
    .line 113
    return-object v8

    .line 114
    :cond_0
    check-cast v0, Ljava/lang/RuntimeException;

    .line 115
    .line 116
    throw v0

    .line 117
    :catch_3
    :cond_1
    :goto_3
    iget-boolean v0, v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->generate:Z

    .line 118
    .line 119
    if-eqz v0, :cond_2

    .line 120
    .line 121
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 122
    .line 123
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 124
    .line 125
    .line 126
    :goto_4
    move-object v9, v0

    .line 127
    goto :goto_5

    .line 128
    :cond_2
    new-instance v0, Ljava/util/HashMap;

    .line 129
    .line 130
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 131
    .line 132
    .line 133
    goto :goto_4

    .line 134
    :goto_5
    iget-object v0, v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->proxy:Ljava/lang/Class;

    .line 135
    .line 136
    const-class v10, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Defaults;

    .line 137
    .line 138
    invoke-virtual {v0, v10}, Ljava/lang/Class;->isAnnotationPresent(Ljava/lang/Class;)Z

    .line 139
    .line 140
    .line 141
    move-result v11

    .line 142
    iget-object v0, v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->proxy:Ljava/lang/Class;

    .line 143
    .line 144
    const-class v12, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Proxied;

    .line 145
    .line 146
    invoke-virtual {v0, v12}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    check-cast v0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Proxied;

    .line 151
    .line 152
    invoke-interface {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Proxied;->value()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v13

    .line 156
    const/4 v15, 0x0

    .line 157
    :try_start_1
    iget-object v0, v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->classLoader:Ljava/lang/ClassLoader;

    .line 158
    .line 159
    invoke-static {v13, v15, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    move-result-object v13
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_16

    .line 163
    iget-boolean v0, v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->generate:Z

    .line 164
    .line 165
    if-eqz v0, :cond_3

    .line 166
    .line 167
    move-object/from16 v16, v8

    .line 168
    .line 169
    invoke-static {}, Lnet/bytebuddy/utility/GraalImageCode;->getCurrent()Lnet/bytebuddy/utility/GraalImageCode;

    .line 170
    .line 171
    .line 172
    move-result-object v8

    .line 173
    move/from16 v17, v15

    .line 174
    .line 175
    iget-object v15, v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->proxy:Ljava/lang/Class;

    .line 176
    .line 177
    invoke-virtual {v15}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 178
    .line 179
    .line 180
    move-result-object v15

    .line 181
    sget-object v14, Lnet/bytebuddy/utility/MethodComparator;->INSTANCE:Lnet/bytebuddy/utility/MethodComparator;

    .line 182
    .line 183
    invoke-virtual {v8, v15, v14}, Lnet/bytebuddy/utility/GraalImageCode;->sorted([Ljava/lang/Object;Ljava/util/Comparator;)[Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v8

    .line 187
    check-cast v8, [Ljava/lang/reflect/Method;

    .line 188
    .line 189
    goto :goto_6

    .line 190
    :cond_3
    move-object/from16 v16, v8

    .line 191
    .line 192
    move/from16 v17, v15

    .line 193
    .line 194
    iget-object v8, v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->proxy:Ljava/lang/Class;

    .line 195
    .line 196
    invoke-virtual {v8}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 197
    .line 198
    .line 199
    move-result-object v8

    .line 200
    :goto_6
    array-length v14, v8

    .line 201
    move v15, v0

    .line 202
    move-object/from16 v19, v8

    .line 203
    .line 204
    move/from16 v8, v17

    .line 205
    .line 206
    :goto_7
    if-ge v8, v14, :cond_2e

    .line 207
    .line 208
    move/from16 v20, v8

    .line 209
    .line 210
    aget-object v8, v19, v20

    .line 211
    .line 212
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    if-ne v0, v6, :cond_4

    .line 217
    .line 218
    move/from16 v21, v11

    .line 219
    .line 220
    goto :goto_8

    .line 221
    :cond_4
    invoke-virtual {v8, v5}, Ljava/lang/reflect/AccessibleObject;->isAnnotationPresent(Ljava/lang/Class;)Z

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    if-eqz v0, :cond_7

    .line 226
    .line 227
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    array-length v0, v0

    .line 232
    move/from16 v21, v11

    .line 233
    .line 234
    const/4 v11, 0x1

    .line 235
    if-ne v0, v11, :cond_6

    .line 236
    .line 237
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    aget-object v0, v0, v17

    .line 242
    .line 243
    invoke-virtual {v0, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    if-eqz v0, :cond_6

    .line 248
    .line 249
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    if-ne v0, v4, :cond_5

    .line 254
    .line 255
    new-instance v0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForInstanceCheck;

    .line 256
    .line 257
    invoke-direct {v0, v13}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForInstanceCheck;-><init>(Ljava/lang/Class;)V

    .line 258
    .line 259
    .line 260
    invoke-interface {v9, v8, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    goto :goto_8

    .line 264
    :cond_5
    invoke-static {v8, v3}, L飘花落叶言世哲苏子兰楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    return-object v16

    .line 268
    :cond_6
    invoke-static {v8, v2}, L飘花落叶言世哲苏子兰楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    return-object v16

    .line 272
    :cond_7
    move/from16 v21, v11

    .line 273
    .line 274
    const-class v0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Container;

    .line 275
    .line 276
    invoke-virtual {v8, v0}, Ljava/lang/reflect/AccessibleObject;->isAnnotationPresent(Ljava/lang/Class;)Z

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    if-eqz v0, :cond_a

    .line 281
    .line 282
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    array-length v0, v0

    .line 287
    const/4 v11, 0x1

    .line 288
    if-ne v0, v11, :cond_9

    .line 289
    .line 290
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    aget-object v0, v0, v17

    .line 295
    .line 296
    sget-object v11, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 297
    .line 298
    if-ne v0, v11, :cond_9

    .line 299
    .line 300
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 305
    .line 306
    .line 307
    move-result v0

    .line 308
    if-eqz v0, :cond_8

    .line 309
    .line 310
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    invoke-virtual {v0, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 319
    .line 320
    .line 321
    move-result v0

    .line 322
    if-eqz v0, :cond_8

    .line 323
    .line 324
    new-instance v0, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForContainerCreation;

    .line 325
    .line 326
    invoke-direct {v0, v13}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForContainerCreation;-><init>(Ljava/lang/Class;)V

    .line 327
    .line 328
    .line 329
    invoke-interface {v9, v8, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    :goto_8
    move-object/from16 v24, v2

    .line 333
    .line 334
    move-object/from16 v25, v3

    .line 335
    .line 336
    move-object/from16 v31, v4

    .line 337
    .line 338
    move-object/from16 v32, v5

    .line 339
    .line 340
    move-object/from16 v33, v6

    .line 341
    .line 342
    move/from16 v22, v14

    .line 343
    .line 344
    goto/16 :goto_2f

    .line 345
    .line 346
    :cond_8
    const-string v0, "Container creation requires an assignable array as return value: "

    .line 347
    .line 348
    invoke-static {v8, v0}, L飘花落叶言世哲苏子兰楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    return-object v16

    .line 352
    :cond_9
    const-string v0, "Container creation requires a single int-typed argument: "

    .line 353
    .line 354
    invoke-static {v8, v0}, L飘花落叶言世哲苏子兰楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    return-object v16

    .line 358
    :cond_a
    invoke-virtual {v13}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    const-string v11, "java.lang.invoke.MethodHandles"

    .line 363
    .line 364
    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    move-result v0

    .line 368
    if-eqz v0, :cond_c

    .line 369
    .line 370
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    const-string v11, "lookup"

    .line 375
    .line 376
    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 377
    .line 378
    .line 379
    move-result v0

    .line 380
    if-nez v0, :cond_b

    .line 381
    .line 382
    goto :goto_9

    .line 383
    :cond_b
    const-string v0, "Cannot resolve Byte Buddy lookup via dispatcher"

    .line 384
    .line 385
    invoke-static {v0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 386
    .line 387
    .line 388
    return-object v16

    .line 389
    :cond_c
    :goto_9
    :try_start_2
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    invoke-virtual {v8, v7}, Ljava/lang/reflect/AccessibleObject;->isAnnotationPresent(Ljava/lang/Class;)Z

    .line 394
    .line 395
    .line 396
    move-result v11
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_15
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_14
    .catchall {:try_start_2 .. :try_end_2} :catchall_8

    .line 397
    move/from16 v22, v11

    .line 398
    .line 399
    const-class v11, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$IsConstructor;

    .line 400
    .line 401
    if-nez v22, :cond_d

    .line 402
    .line 403
    :try_start_3
    invoke-virtual {v8, v11}, Ljava/lang/reflect/AccessibleObject;->isAnnotationPresent(Ljava/lang/Class;)Z

    .line 404
    .line 405
    .line 406
    move-result v22
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_b
    .catch Ljava/lang/NoSuchMethodException; {:try_start_3 .. :try_end_3} :catch_a
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 407
    if-eqz v22, :cond_e

    .line 408
    .line 409
    :cond_d
    move-object/from16 v24, v2

    .line 410
    .line 411
    move-object/from16 v25, v3

    .line 412
    .line 413
    move/from16 v22, v14

    .line 414
    .line 415
    move/from16 v23, v15

    .line 416
    .line 417
    goto/16 :goto_19

    .line 418
    .line 419
    :cond_e
    move/from16 v22, v14

    .line 420
    .line 421
    :try_start_4
    array-length v14, v0

    .line 422
    if-eqz v14, :cond_10

    .line 423
    .line 424
    aget-object v14, v0, v17

    .line 425
    .line 426
    invoke-virtual {v14, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 427
    .line 428
    .line 429
    move-result v14

    .line 430
    if-eqz v14, :cond_f

    .line 431
    .line 432
    array-length v14, v0
    :try_end_4
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_4} :catch_9
    .catch Ljava/lang/NoSuchMethodException; {:try_start_4 .. :try_end_4} :catch_8
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 433
    move/from16 v23, v14

    .line 434
    .line 435
    const/16 v18, 0x1

    .line 436
    .line 437
    add-int/lit8 v14, v23, -0x1

    .line 438
    .line 439
    move/from16 v23, v15

    .line 440
    .line 441
    :try_start_5
    new-array v15, v14, [Ljava/lang/Class;
    :try_end_5
    .catch Ljava/lang/ClassNotFoundException; {:try_start_5 .. :try_end_5} :catch_7
    .catch Ljava/lang/NoSuchMethodException; {:try_start_5 .. :try_end_5} :catch_6
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 442
    .line 443
    move-object/from16 v24, v2

    .line 444
    .line 445
    move-object/from16 v25, v3

    .line 446
    .line 447
    move/from16 v3, v17

    .line 448
    .line 449
    move/from16 v2, v18

    .line 450
    .line 451
    :try_start_6
    invoke-static {v0, v2, v15, v3, v14}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 452
    .line 453
    .line 454
    move-object v0, v15

    .line 455
    const/4 v2, 0x1

    .line 456
    goto/16 :goto_1a

    .line 457
    .line 458
    :catchall_0
    move-exception v0

    .line 459
    :goto_a
    move-object/from16 v31, v4

    .line 460
    .line 461
    :goto_b
    move-object/from16 v32, v5

    .line 462
    .line 463
    :goto_c
    move-object/from16 v33, v6

    .line 464
    .line 465
    :goto_d
    move/from16 v15, v23

    .line 466
    .line 467
    goto/16 :goto_28

    .line 468
    .line 469
    :catch_4
    move-exception v0

    .line 470
    :goto_e
    move-object/from16 v31, v4

    .line 471
    .line 472
    :goto_f
    move-object/from16 v32, v5

    .line 473
    .line 474
    :goto_10
    move-object/from16 v33, v6

    .line 475
    .line 476
    :goto_11
    move/from16 v15, v23

    .line 477
    .line 478
    goto/16 :goto_29

    .line 479
    .line 480
    :catch_5
    move-exception v0

    .line 481
    :goto_12
    move-object/from16 v31, v4

    .line 482
    .line 483
    :goto_13
    move-object/from16 v32, v5

    .line 484
    .line 485
    :goto_14
    move-object/from16 v33, v6

    .line 486
    .line 487
    :goto_15
    move/from16 v15, v23

    .line 488
    .line 489
    goto/16 :goto_2c

    .line 490
    .line 491
    :catchall_1
    move-exception v0

    .line 492
    move-object/from16 v24, v2

    .line 493
    .line 494
    move-object/from16 v25, v3

    .line 495
    .line 496
    goto :goto_a

    .line 497
    :catch_6
    move-exception v0

    .line 498
    move-object/from16 v24, v2

    .line 499
    .line 500
    move-object/from16 v25, v3

    .line 501
    .line 502
    goto :goto_e

    .line 503
    :catch_7
    move-exception v0

    .line 504
    move-object/from16 v24, v2

    .line 505
    .line 506
    move-object/from16 v25, v3

    .line 507
    .line 508
    goto :goto_12

    .line 509
    :catchall_2
    move-exception v0

    .line 510
    move-object/from16 v24, v2

    .line 511
    .line 512
    move-object/from16 v25, v3

    .line 513
    .line 514
    :goto_16
    move/from16 v23, v15

    .line 515
    .line 516
    move-object/from16 v31, v4

    .line 517
    .line 518
    move-object/from16 v32, v5

    .line 519
    .line 520
    move-object/from16 v33, v6

    .line 521
    .line 522
    goto/16 :goto_28

    .line 523
    .line 524
    :catch_8
    move-exception v0

    .line 525
    move-object/from16 v24, v2

    .line 526
    .line 527
    move-object/from16 v25, v3

    .line 528
    .line 529
    :goto_17
    move/from16 v23, v15

    .line 530
    .line 531
    move-object/from16 v31, v4

    .line 532
    .line 533
    move-object/from16 v32, v5

    .line 534
    .line 535
    move-object/from16 v33, v6

    .line 536
    .line 537
    goto/16 :goto_29

    .line 538
    .line 539
    :catch_9
    move-exception v0

    .line 540
    move-object/from16 v24, v2

    .line 541
    .line 542
    move-object/from16 v25, v3

    .line 543
    .line 544
    :goto_18
    move/from16 v23, v15

    .line 545
    .line 546
    move-object/from16 v31, v4

    .line 547
    .line 548
    move-object/from16 v32, v5

    .line 549
    .line 550
    move-object/from16 v33, v6

    .line 551
    .line 552
    goto/16 :goto_2c

    .line 553
    .line 554
    :cond_f
    move-object/from16 v24, v2

    .line 555
    .line 556
    move-object/from16 v25, v3

    .line 557
    .line 558
    move/from16 v23, v15

    .line 559
    .line 560
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 561
    .line 562
    new-instance v2, Ljava/lang/StringBuilder;

    .line 563
    .line 564
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 565
    .line 566
    .line 567
    const-string v3, "Cannot assign self type: "

    .line 568
    .line 569
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 570
    .line 571
    .line 572
    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 573
    .line 574
    .line 575
    const-string v3, " on "

    .line 576
    .line 577
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 578
    .line 579
    .line 580
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 581
    .line 582
    .line 583
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object v2

    .line 587
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 588
    .line 589
    .line 590
    throw v0

    .line 591
    :cond_10
    move-object/from16 v24, v2

    .line 592
    .line 593
    move-object/from16 v25, v3

    .line 594
    .line 595
    move/from16 v23, v15

    .line 596
    .line 597
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 598
    .line 599
    new-instance v2, Ljava/lang/StringBuilder;

    .line 600
    .line 601
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 602
    .line 603
    .line 604
    const-string v3, "Expected self type: "

    .line 605
    .line 606
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 607
    .line 608
    .line 609
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 610
    .line 611
    .line 612
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 613
    .line 614
    .line 615
    move-result-object v2

    .line 616
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 617
    .line 618
    .line 619
    throw v0

    .line 620
    :catchall_3
    move-exception v0

    .line 621
    move-object/from16 v24, v2

    .line 622
    .line 623
    move-object/from16 v25, v3

    .line 624
    .line 625
    move/from16 v22, v14

    .line 626
    .line 627
    goto :goto_16

    .line 628
    :catch_a
    move-exception v0

    .line 629
    move-object/from16 v24, v2

    .line 630
    .line 631
    move-object/from16 v25, v3

    .line 632
    .line 633
    move/from16 v22, v14

    .line 634
    .line 635
    goto :goto_17

    .line 636
    :catch_b
    move-exception v0

    .line 637
    move-object/from16 v24, v2

    .line 638
    .line 639
    move-object/from16 v25, v3

    .line 640
    .line 641
    move/from16 v22, v14

    .line 642
    .line 643
    goto :goto_18

    .line 644
    :goto_19
    const/4 v2, 0x0

    .line 645
    :goto_1a
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    .line 646
    .line 647
    .line 648
    move-result-object v3

    .line 649
    const/4 v14, 0x0

    .line 650
    :goto_1b
    array-length v15, v0

    .line 651
    if-ge v14, v15, :cond_19

    .line 652
    .line 653
    add-int v15, v14, v2

    .line 654
    .line 655
    aget-object v15, v3, v15

    .line 656
    .line 657
    move/from16 v26, v2

    .line 658
    .line 659
    array-length v2, v15

    .line 660
    move-object/from16 v27, v3

    .line 661
    .line 662
    const/4 v3, 0x0

    .line 663
    :goto_1c
    if-ge v3, v2, :cond_18

    .line 664
    .line 665
    move/from16 v28, v2

    .line 666
    .line 667
    aget-object v2, v15, v3

    .line 668
    .line 669
    move/from16 v29, v3

    .line 670
    .line 671
    instance-of v3, v2, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Proxied;

    .line 672
    .line 673
    if-eqz v3, :cond_17

    .line 674
    .line 675
    const/4 v3, 0x0

    .line 676
    :goto_1d
    aget-object v15, v0, v14

    .line 677
    .line 678
    invoke-virtual {v15}, Ljava/lang/Class;->isArray()Z

    .line 679
    .line 680
    .line 681
    move-result v15

    .line 682
    if-eqz v15, :cond_11

    .line 683
    .line 684
    add-int/lit8 v3, v3, 0x1

    .line 685
    .line 686
    aget-object v15, v0, v14

    .line 687
    .line 688
    invoke-virtual {v15}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 689
    .line 690
    .line 691
    move-result-object v15

    .line 692
    aput-object v15, v0, v14
    :try_end_6
    .catch Ljava/lang/ClassNotFoundException; {:try_start_6 .. :try_end_6} :catch_5
    .catch Ljava/lang/NoSuchMethodException; {:try_start_6 .. :try_end_6} :catch_4
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 693
    .line 694
    goto :goto_1d

    .line 695
    :cond_11
    const-string v15, " at "

    .line 696
    .line 697
    move-object/from16 v30, v2

    .line 698
    .line 699
    const-string v2, " of "

    .line 700
    .line 701
    if-lez v3, :cond_15

    .line 702
    .line 703
    :try_start_7
    aget-object v28, v0, v14

    .line 704
    .line 705
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Class;->isPrimitive()Z

    .line 706
    .line 707
    .line 708
    move-result v28

    .line 709
    if-nez v28, :cond_14

    .line 710
    .line 711
    move/from16 v28, v3

    .line 712
    .line 713
    aget-object v3, v0, v14

    .line 714
    .line 715
    move-object/from16 v29, v30

    .line 716
    .line 717
    check-cast v29, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Proxied;
    :try_end_7
    .catch Ljava/lang/ClassNotFoundException; {:try_start_7 .. :try_end_7} :catch_5
    .catch Ljava/lang/NoSuchMethodException; {:try_start_7 .. :try_end_7} :catch_4
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 718
    .line 719
    move-object/from16 v31, v4

    .line 720
    .line 721
    :try_start_8
    invoke-interface/range {v29 .. v29}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Proxied;->value()Ljava/lang/String;

    .line 722
    .line 723
    .line 724
    move-result-object v4
    :try_end_8
    .catch Ljava/lang/ClassNotFoundException; {:try_start_8 .. :try_end_8} :catch_11
    .catch Ljava/lang/NoSuchMethodException; {:try_start_8 .. :try_end_8} :catch_10
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 725
    move-object/from16 v32, v5

    .line 726
    .line 727
    :try_start_9
    iget-object v5, v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->classLoader:Ljava/lang/ClassLoader;
    :try_end_9
    .catch Ljava/lang/ClassNotFoundException; {:try_start_9 .. :try_end_9} :catch_f
    .catch Ljava/lang/NoSuchMethodException; {:try_start_9 .. :try_end_9} :catch_e
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 728
    .line 729
    move-object/from16 v33, v6

    .line 730
    .line 731
    const/4 v6, 0x0

    .line 732
    :try_start_a
    invoke-static {v4, v6, v5}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 733
    .line 734
    .line 735
    move-result-object v4

    .line 736
    invoke-virtual {v3, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 737
    .line 738
    .line 739
    move-result v3

    .line 740
    if-eqz v3, :cond_13

    .line 741
    .line 742
    new-instance v2, Ljava/lang/StringBuilder;

    .line 743
    .line 744
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 745
    .line 746
    .line 747
    move/from16 v3, v28

    .line 748
    .line 749
    :goto_1e
    add-int/lit8 v4, v3, -0x1

    .line 750
    .line 751
    if-lez v3, :cond_12

    .line 752
    .line 753
    const/16 v3, 0x5b

    .line 754
    .line 755
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 756
    .line 757
    .line 758
    move v3, v4

    .line 759
    goto :goto_1e

    .line 760
    :catchall_4
    move-exception v0

    .line 761
    goto/16 :goto_d

    .line 762
    .line 763
    :catch_c
    move-exception v0

    .line 764
    goto/16 :goto_11

    .line 765
    .line 766
    :catch_d
    move-exception v0

    .line 767
    goto/16 :goto_15

    .line 768
    .line 769
    :cond_12
    const/16 v3, 0x4c

    .line 770
    .line 771
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 772
    .line 773
    .line 774
    move-object/from16 v3, v30

    .line 775
    .line 776
    check-cast v3, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Proxied;

    .line 777
    .line 778
    invoke-interface {v3}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Proxied;->value()Ljava/lang/String;

    .line 779
    .line 780
    .line 781
    move-result-object v3

    .line 782
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 783
    .line 784
    .line 785
    const/16 v3, 0x3b

    .line 786
    .line 787
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 788
    .line 789
    .line 790
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 791
    .line 792
    .line 793
    move-result-object v2

    .line 794
    iget-object v3, v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->classLoader:Ljava/lang/ClassLoader;

    .line 795
    .line 796
    const/4 v6, 0x0

    .line 797
    invoke-static {v2, v6, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 798
    .line 799
    .line 800
    move-result-object v2

    .line 801
    aput-object v2, v0, v14

    .line 802
    .line 803
    goto/16 :goto_1f

    .line 804
    .line 805
    :cond_13
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 806
    .line 807
    new-instance v3, Ljava/lang/StringBuilder;

    .line 808
    .line 809
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 810
    .line 811
    .line 812
    const-string v4, "Cannot resolve to component type: "

    .line 813
    .line 814
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 815
    .line 816
    .line 817
    move-object/from16 v4, v30

    .line 818
    .line 819
    check-cast v4, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Proxied;

    .line 820
    .line 821
    invoke-interface {v4}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Proxied;->value()Ljava/lang/String;

    .line 822
    .line 823
    .line 824
    move-result-object v4

    .line 825
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 826
    .line 827
    .line 828
    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 829
    .line 830
    .line 831
    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 832
    .line 833
    .line 834
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 835
    .line 836
    .line 837
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 838
    .line 839
    .line 840
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 841
    .line 842
    .line 843
    move-result-object v2

    .line 844
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 845
    .line 846
    .line 847
    throw v0

    .line 848
    :catchall_5
    move-exception v0

    .line 849
    goto/16 :goto_c

    .line 850
    .line 851
    :catch_e
    move-exception v0

    .line 852
    goto/16 :goto_10

    .line 853
    .line 854
    :catch_f
    move-exception v0

    .line 855
    goto/16 :goto_14

    .line 856
    .line 857
    :catchall_6
    move-exception v0

    .line 858
    goto/16 :goto_b

    .line 859
    .line 860
    :catch_10
    move-exception v0

    .line 861
    goto/16 :goto_f

    .line 862
    .line 863
    :catch_11
    move-exception v0

    .line 864
    goto/16 :goto_13

    .line 865
    .line 866
    :cond_14
    move-object/from16 v31, v4

    .line 867
    .line 868
    move-object/from16 v32, v5

    .line 869
    .line 870
    move-object/from16 v33, v6

    .line 871
    .line 872
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 873
    .line 874
    new-instance v3, Ljava/lang/StringBuilder;

    .line 875
    .line 876
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 877
    .line 878
    .line 879
    const-string v4, "Primitive values are not supposed to be proxied: "

    .line 880
    .line 881
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 882
    .line 883
    .line 884
    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 885
    .line 886
    .line 887
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 888
    .line 889
    .line 890
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 891
    .line 892
    .line 893
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 894
    .line 895
    .line 896
    move-result-object v2

    .line 897
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 898
    .line 899
    .line 900
    throw v0

    .line 901
    :cond_15
    move-object/from16 v31, v4

    .line 902
    .line 903
    move-object/from16 v32, v5

    .line 904
    .line 905
    move-object/from16 v33, v6

    .line 906
    .line 907
    move-object/from16 v3, v30

    .line 908
    .line 909
    check-cast v3, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Proxied;

    .line 910
    .line 911
    invoke-interface {v3}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Proxied;->value()Ljava/lang/String;

    .line 912
    .line 913
    .line 914
    move-result-object v3

    .line 915
    iget-object v4, v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->classLoader:Ljava/lang/ClassLoader;

    .line 916
    .line 917
    const/4 v6, 0x0

    .line 918
    invoke-static {v3, v6, v4}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 919
    .line 920
    .line 921
    move-result-object v3

    .line 922
    aget-object v4, v0, v14

    .line 923
    .line 924
    invoke-virtual {v4, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 925
    .line 926
    .line 927
    move-result v4

    .line 928
    if-eqz v4, :cond_16

    .line 929
    .line 930
    aput-object v3, v0, v14

    .line 931
    .line 932
    goto :goto_1f

    .line 933
    :cond_16
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 934
    .line 935
    new-instance v4, Ljava/lang/StringBuilder;

    .line 936
    .line 937
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 938
    .line 939
    .line 940
    const-string v5, "Cannot resolve to type: "

    .line 941
    .line 942
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 943
    .line 944
    .line 945
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 946
    .line 947
    .line 948
    move-result-object v3

    .line 949
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 950
    .line 951
    .line 952
    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 953
    .line 954
    .line 955
    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 956
    .line 957
    .line 958
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 959
    .line 960
    .line 961
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 962
    .line 963
    .line 964
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 965
    .line 966
    .line 967
    move-result-object v2

    .line 968
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 969
    .line 970
    .line 971
    throw v0

    .line 972
    :cond_17
    move-object/from16 v31, v4

    .line 973
    .line 974
    move-object/from16 v32, v5

    .line 975
    .line 976
    move-object/from16 v33, v6

    .line 977
    .line 978
    add-int/lit8 v3, v29, 0x1

    .line 979
    .line 980
    move/from16 v2, v28

    .line 981
    .line 982
    goto/16 :goto_1c

    .line 983
    .line 984
    :cond_18
    move-object/from16 v31, v4

    .line 985
    .line 986
    move-object/from16 v32, v5

    .line 987
    .line 988
    move-object/from16 v33, v6

    .line 989
    .line 990
    :goto_1f
    add-int/lit8 v14, v14, 0x1

    .line 991
    .line 992
    move/from16 v2, v26

    .line 993
    .line 994
    move-object/from16 v3, v27

    .line 995
    .line 996
    move-object/from16 v4, v31

    .line 997
    .line 998
    move-object/from16 v5, v32

    .line 999
    .line 1000
    move-object/from16 v6, v33

    .line 1001
    .line 1002
    goto/16 :goto_1b

    .line 1003
    .line 1004
    :cond_19
    move-object/from16 v31, v4

    .line 1005
    .line 1006
    move-object/from16 v32, v5

    .line 1007
    .line 1008
    move-object/from16 v33, v6

    .line 1009
    .line 1010
    invoke-virtual {v8, v11}, Ljava/lang/reflect/AccessibleObject;->isAnnotationPresent(Ljava/lang/Class;)Z

    .line 1011
    .line 1012
    .line 1013
    move-result v2
    :try_end_a
    .catch Ljava/lang/ClassNotFoundException; {:try_start_a .. :try_end_a} :catch_d
    .catch Ljava/lang/NoSuchMethodException; {:try_start_a .. :try_end_a} :catch_c
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 1014
    const-string v3, " to "

    .line 1015
    .line 1016
    const-string v4, "Cannot assign "

    .line 1017
    .line 1018
    if-eqz v2, :cond_1d

    .line 1019
    .line 1020
    :try_start_b
    invoke-virtual {v13, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v0

    .line 1024
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v2

    .line 1028
    invoke-virtual {v2, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1029
    .line 1030
    .line 1031
    move-result v2

    .line 1032
    if-eqz v2, :cond_1c

    .line 1033
    .line 1034
    invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->getModifiers()I

    .line 1035
    .line 1036
    .line 1037
    move-result v2

    .line 1038
    const/4 v11, 0x1

    .line 1039
    and-int/2addr v2, v11

    .line 1040
    if-eqz v2, :cond_1b

    .line 1041
    .line 1042
    invoke-virtual {v13}, Ljava/lang/Class;->getModifiers()I

    .line 1043
    .line 1044
    .line 1045
    move-result v2

    .line 1046
    and-int/2addr v2, v11

    .line 1047
    if-nez v2, :cond_1a

    .line 1048
    .line 1049
    goto :goto_20

    .line 1050
    :cond_1a
    move/from16 v15, v23

    .line 1051
    .line 1052
    goto :goto_21

    .line 1053
    :cond_1b
    :goto_20
    invoke-virtual {v0, v11}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_b
    .catch Ljava/lang/ClassNotFoundException; {:try_start_b .. :try_end_b} :catch_d
    .catch Ljava/lang/NoSuchMethodException; {:try_start_b .. :try_end_b} :catch_c
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 1054
    .line 1055
    .line 1056
    const/4 v15, 0x0

    .line 1057
    :goto_21
    :try_start_c
    new-instance v2, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForConstructor;

    .line 1058
    .line 1059
    invoke-direct {v2, v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForConstructor;-><init>(Ljava/lang/reflect/Constructor;)V

    .line 1060
    .line 1061
    .line 1062
    invoke-interface {v9, v8, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_c
    .catch Ljava/lang/ClassNotFoundException; {:try_start_c .. :try_end_c} :catch_13
    .catch Ljava/lang/NoSuchMethodException; {:try_start_c .. :try_end_c} :catch_12
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    .line 1063
    .line 1064
    .line 1065
    goto/16 :goto_2f

    .line 1066
    .line 1067
    :catchall_7
    move-exception v0

    .line 1068
    goto/16 :goto_28

    .line 1069
    .line 1070
    :catch_12
    move-exception v0

    .line 1071
    goto/16 :goto_29

    .line 1072
    .line 1073
    :catch_13
    move-exception v0

    .line 1074
    goto/16 :goto_2c

    .line 1075
    .line 1076
    :cond_1c
    :try_start_d
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 1077
    .line 1078
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1079
    .line 1080
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 1081
    .line 1082
    .line 1083
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1084
    .line 1085
    .line 1086
    invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v0

    .line 1090
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v0

    .line 1094
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1095
    .line 1096
    .line 1097
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1098
    .line 1099
    .line 1100
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1101
    .line 1102
    .line 1103
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v0

    .line 1107
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1108
    .line 1109
    .line 1110
    throw v2

    .line 1111
    :cond_1d
    invoke-virtual {v8, v12}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v2

    .line 1115
    check-cast v2, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Proxied;

    .line 1116
    .line 1117
    if-nez v2, :cond_1e

    .line 1118
    .line 1119
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v2

    .line 1123
    goto :goto_22

    .line 1124
    :cond_1e
    invoke-interface {v2}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Proxied;->value()Ljava/lang/String;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v2

    .line 1128
    :goto_22
    invoke-virtual {v13, v2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v0

    .line 1132
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v2

    .line 1136
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v5

    .line 1140
    invoke-virtual {v2, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1141
    .line 1142
    .line 1143
    move-result v2

    .line 1144
    if-eqz v2, :cond_29

    .line 1145
    .line 1146
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getExceptionTypes()[Ljava/lang/Class;

    .line 1147
    .line 1148
    .line 1149
    move-result-object v2

    .line 1150
    array-length v3, v2
    :try_end_d
    .catch Ljava/lang/ClassNotFoundException; {:try_start_d .. :try_end_d} :catch_d
    .catch Ljava/lang/NoSuchMethodException; {:try_start_d .. :try_end_d} :catch_c
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 1151
    const/4 v4, 0x0

    .line 1152
    :goto_23
    const-string v5, "Resolved method for "

    .line 1153
    .line 1154
    if-ge v4, v3, :cond_23

    .line 1155
    .line 1156
    :try_start_e
    aget-object v6, v2, v4

    .line 1157
    .line 1158
    const-class v11, Ljava/lang/RuntimeException;

    .line 1159
    .line 1160
    invoke-virtual {v11, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1161
    .line 1162
    .line 1163
    move-result v11

    .line 1164
    if-nez v11, :cond_1f

    .line 1165
    .line 1166
    const-class v11, Ljava/lang/Error;

    .line 1167
    .line 1168
    invoke-virtual {v11, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1169
    .line 1170
    .line 1171
    move-result v11

    .line 1172
    if-eqz v11, :cond_20

    .line 1173
    .line 1174
    :cond_1f
    move-object/from16 v26, v2

    .line 1175
    .line 1176
    goto :goto_25

    .line 1177
    :cond_20
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getExceptionTypes()[Ljava/lang/Class;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v11

    .line 1181
    array-length v14, v11

    .line 1182
    const/4 v15, 0x0

    .line 1183
    :goto_24
    if-ge v15, v14, :cond_22

    .line 1184
    .line 1185
    move-object/from16 v26, v2

    .line 1186
    .line 1187
    aget-object v2, v11, v15

    .line 1188
    .line 1189
    invoke-virtual {v2, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1190
    .line 1191
    .line 1192
    move-result v2

    .line 1193
    if-eqz v2, :cond_21

    .line 1194
    .line 1195
    goto :goto_25

    .line 1196
    :cond_21
    add-int/lit8 v15, v15, 0x1

    .line 1197
    .line 1198
    move-object/from16 v2, v26

    .line 1199
    .line 1200
    goto :goto_24

    .line 1201
    :cond_22
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1202
    .line 1203
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1204
    .line 1205
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1206
    .line 1207
    .line 1208
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1209
    .line 1210
    .line 1211
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1212
    .line 1213
    .line 1214
    const-string v3, " throws undeclared checked exception "

    .line 1215
    .line 1216
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1217
    .line 1218
    .line 1219
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1220
    .line 1221
    .line 1222
    move-result-object v3

    .line 1223
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1224
    .line 1225
    .line 1226
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1227
    .line 1228
    .line 1229
    move-result-object v2

    .line 1230
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1231
    .line 1232
    .line 1233
    throw v0

    .line 1234
    :goto_25
    add-int/lit8 v4, v4, 0x1

    .line 1235
    .line 1236
    move-object/from16 v2, v26

    .line 1237
    .line 1238
    goto :goto_23

    .line 1239
    :cond_23
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 1240
    .line 1241
    .line 1242
    move-result v2

    .line 1243
    const/16 v18, 0x1

    .line 1244
    .line 1245
    and-int/lit8 v2, v2, 0x1

    .line 1246
    .line 1247
    if-eqz v2, :cond_24

    .line 1248
    .line 1249
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 1250
    .line 1251
    .line 1252
    move-result-object v2

    .line 1253
    invoke-virtual {v2}, Ljava/lang/Class;->getModifiers()I

    .line 1254
    .line 1255
    .line 1256
    move-result v2

    .line 1257
    and-int/lit8 v2, v2, 0x1

    .line 1258
    .line 1259
    if-nez v2, :cond_25

    .line 1260
    .line 1261
    :cond_24
    const/4 v11, 0x1

    .line 1262
    goto :goto_26

    .line 1263
    :cond_25
    move/from16 v15, v23

    .line 1264
    .line 1265
    goto :goto_27

    .line 1266
    :goto_26
    invoke-virtual {v0, v11}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_e
    .catch Ljava/lang/ClassNotFoundException; {:try_start_e .. :try_end_e} :catch_d
    .catch Ljava/lang/NoSuchMethodException; {:try_start_e .. :try_end_e} :catch_c
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .line 1267
    .line 1268
    .line 1269
    const/4 v15, 0x0

    .line 1270
    :goto_27
    :try_start_f
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 1271
    .line 1272
    .line 1273
    move-result v2

    .line 1274
    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 1275
    .line 1276
    .line 1277
    move-result v2

    .line 1278
    if-eqz v2, :cond_27

    .line 1279
    .line 1280
    invoke-virtual {v8, v7}, Ljava/lang/reflect/AccessibleObject;->isAnnotationPresent(Ljava/lang/Class;)Z

    .line 1281
    .line 1282
    .line 1283
    move-result v2

    .line 1284
    if-eqz v2, :cond_26

    .line 1285
    .line 1286
    new-instance v2, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForStaticMethod;

    .line 1287
    .line 1288
    invoke-direct {v2, v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForStaticMethod;-><init>(Ljava/lang/reflect/Method;)V

    .line 1289
    .line 1290
    .line 1291
    invoke-interface {v9, v8, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1292
    .line 1293
    .line 1294
    goto/16 :goto_2f

    .line 1295
    .line 1296
    :cond_26
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 1297
    .line 1298
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1299
    .line 1300
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1301
    .line 1302
    .line 1303
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1304
    .line 1305
    .line 1306
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1307
    .line 1308
    .line 1309
    const-string v4, " was expected to be static: "

    .line 1310
    .line 1311
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1312
    .line 1313
    .line 1314
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1315
    .line 1316
    .line 1317
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1318
    .line 1319
    .line 1320
    move-result-object v0

    .line 1321
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1322
    .line 1323
    .line 1324
    throw v2

    .line 1325
    :cond_27
    invoke-virtual {v8, v7}, Ljava/lang/reflect/AccessibleObject;->isAnnotationPresent(Ljava/lang/Class;)Z

    .line 1326
    .line 1327
    .line 1328
    move-result v2

    .line 1329
    if-nez v2, :cond_28

    .line 1330
    .line 1331
    new-instance v2, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForNonStaticMethod;

    .line 1332
    .line 1333
    invoke-direct {v2, v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForNonStaticMethod;-><init>(Ljava/lang/reflect/Method;)V

    .line 1334
    .line 1335
    .line 1336
    invoke-interface {v9, v8, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1337
    .line 1338
    .line 1339
    goto/16 :goto_2f

    .line 1340
    .line 1341
    :cond_28
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 1342
    .line 1343
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1344
    .line 1345
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1346
    .line 1347
    .line 1348
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1349
    .line 1350
    .line 1351
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1352
    .line 1353
    .line 1354
    const-string v4, " was expected to be virtual: "

    .line 1355
    .line 1356
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1357
    .line 1358
    .line 1359
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1360
    .line 1361
    .line 1362
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1363
    .line 1364
    .line 1365
    move-result-object v0

    .line 1366
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1367
    .line 1368
    .line 1369
    throw v2
    :try_end_f
    .catch Ljava/lang/ClassNotFoundException; {:try_start_f .. :try_end_f} :catch_13
    .catch Ljava/lang/NoSuchMethodException; {:try_start_f .. :try_end_f} :catch_12
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    .line 1370
    :cond_29
    :try_start_10
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 1371
    .line 1372
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1373
    .line 1374
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 1375
    .line 1376
    .line 1377
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1378
    .line 1379
    .line 1380
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1381
    .line 1382
    .line 1383
    move-result-object v0

    .line 1384
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1385
    .line 1386
    .line 1387
    move-result-object v0

    .line 1388
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1389
    .line 1390
    .line 1391
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1392
    .line 1393
    .line 1394
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1395
    .line 1396
    .line 1397
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v0

    .line 1401
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1402
    .line 1403
    .line 1404
    throw v2
    :try_end_10
    .catch Ljava/lang/ClassNotFoundException; {:try_start_10 .. :try_end_10} :catch_d
    .catch Ljava/lang/NoSuchMethodException; {:try_start_10 .. :try_end_10} :catch_c
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    .line 1405
    :catchall_8
    move-exception v0

    .line 1406
    move-object/from16 v24, v2

    .line 1407
    .line 1408
    move-object/from16 v25, v3

    .line 1409
    .line 1410
    move-object/from16 v31, v4

    .line 1411
    .line 1412
    move-object/from16 v32, v5

    .line 1413
    .line 1414
    move-object/from16 v33, v6

    .line 1415
    .line 1416
    move/from16 v22, v14

    .line 1417
    .line 1418
    move/from16 v23, v15

    .line 1419
    .line 1420
    goto :goto_28

    .line 1421
    :catch_14
    move-exception v0

    .line 1422
    move-object/from16 v24, v2

    .line 1423
    .line 1424
    move-object/from16 v25, v3

    .line 1425
    .line 1426
    move-object/from16 v31, v4

    .line 1427
    .line 1428
    move-object/from16 v32, v5

    .line 1429
    .line 1430
    move-object/from16 v33, v6

    .line 1431
    .line 1432
    move/from16 v22, v14

    .line 1433
    .line 1434
    move/from16 v23, v15

    .line 1435
    .line 1436
    goto :goto_29

    .line 1437
    :catch_15
    move-exception v0

    .line 1438
    move-object/from16 v24, v2

    .line 1439
    .line 1440
    move-object/from16 v25, v3

    .line 1441
    .line 1442
    move-object/from16 v31, v4

    .line 1443
    .line 1444
    move-object/from16 v32, v5

    .line 1445
    .line 1446
    move-object/from16 v33, v6

    .line 1447
    .line 1448
    move/from16 v22, v14

    .line 1449
    .line 1450
    move/from16 v23, v15

    .line 1451
    .line 1452
    goto :goto_2c

    .line 1453
    :goto_28
    new-instance v2, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForUnresolvedMethod;

    .line 1454
    .line 1455
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1456
    .line 1457
    const-string v4, "Unexpected error: "

    .line 1458
    .line 1459
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1460
    .line 1461
    .line 1462
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1463
    .line 1464
    .line 1465
    move-result-object v0

    .line 1466
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1467
    .line 1468
    .line 1469
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1470
    .line 1471
    .line 1472
    move-result-object v0

    .line 1473
    invoke-direct {v2, v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForUnresolvedMethod;-><init>(Ljava/lang/String;)V

    .line 1474
    .line 1475
    .line 1476
    invoke-interface {v9, v8, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1477
    .line 1478
    .line 1479
    goto :goto_2f

    .line 1480
    :goto_29
    if-nez v21, :cond_2b

    .line 1481
    .line 1482
    invoke-virtual {v8, v10}, Ljava/lang/reflect/AccessibleObject;->isAnnotationPresent(Ljava/lang/Class;)Z

    .line 1483
    .line 1484
    .line 1485
    move-result v2

    .line 1486
    if-eqz v2, :cond_2a

    .line 1487
    .line 1488
    goto :goto_2a

    .line 1489
    :cond_2a
    new-instance v2, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForUnresolvedMethod;

    .line 1490
    .line 1491
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1492
    .line 1493
    const-string v4, "Method not available on current VM: "

    .line 1494
    .line 1495
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1496
    .line 1497
    .line 1498
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1499
    .line 1500
    .line 1501
    move-result-object v0

    .line 1502
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1503
    .line 1504
    .line 1505
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1506
    .line 1507
    .line 1508
    move-result-object v0

    .line 1509
    invoke-direct {v2, v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForUnresolvedMethod;-><init>(Ljava/lang/String;)V

    .line 1510
    .line 1511
    .line 1512
    goto :goto_2b

    .line 1513
    :cond_2b
    :goto_2a
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1514
    .line 1515
    .line 1516
    move-result-object v0

    .line 1517
    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;->of(Ljava/lang/Class;)Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher;

    .line 1518
    .line 1519
    .line 1520
    move-result-object v2

    .line 1521
    :goto_2b
    invoke-interface {v9, v8, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1522
    .line 1523
    .line 1524
    goto :goto_2f

    .line 1525
    :goto_2c
    if-nez v21, :cond_2d

    .line 1526
    .line 1527
    invoke-virtual {v8, v10}, Ljava/lang/reflect/AccessibleObject;->isAnnotationPresent(Ljava/lang/Class;)Z

    .line 1528
    .line 1529
    .line 1530
    move-result v2

    .line 1531
    if-eqz v2, :cond_2c

    .line 1532
    .line 1533
    goto :goto_2d

    .line 1534
    :cond_2c
    new-instance v2, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForUnresolvedMethod;

    .line 1535
    .line 1536
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1537
    .line 1538
    const-string v4, "Class not available on current VM: "

    .line 1539
    .line 1540
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1541
    .line 1542
    .line 1543
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1544
    .line 1545
    .line 1546
    move-result-object v0

    .line 1547
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1548
    .line 1549
    .line 1550
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1551
    .line 1552
    .line 1553
    move-result-object v0

    .line 1554
    invoke-direct {v2, v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForUnresolvedMethod;-><init>(Ljava/lang/String;)V

    .line 1555
    .line 1556
    .line 1557
    goto :goto_2e

    .line 1558
    :cond_2d
    :goto_2d
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1559
    .line 1560
    .line 1561
    move-result-object v0

    .line 1562
    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;->of(Ljava/lang/Class;)Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher;

    .line 1563
    .line 1564
    .line 1565
    move-result-object v2

    .line 1566
    :goto_2e
    invoke-interface {v9, v8, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1567
    .line 1568
    .line 1569
    :goto_2f
    add-int/lit8 v8, v20, 0x1

    .line 1570
    .line 1571
    move/from16 v11, v21

    .line 1572
    .line 1573
    move/from16 v14, v22

    .line 1574
    .line 1575
    move-object/from16 v2, v24

    .line 1576
    .line 1577
    move-object/from16 v3, v25

    .line 1578
    .line 1579
    move-object/from16 v4, v31

    .line 1580
    .line 1581
    move-object/from16 v5, v32

    .line 1582
    .line 1583
    move-object/from16 v6, v33

    .line 1584
    .line 1585
    const/16 v17, 0x0

    .line 1586
    .line 1587
    goto/16 :goto_7

    .line 1588
    .line 1589
    :cond_2e
    move/from16 v23, v15

    .line 1590
    .line 1591
    iget-object v0, v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->proxy:Ljava/lang/Class;

    .line 1592
    .line 1593
    if-eqz v23, :cond_2f

    .line 1594
    .line 1595
    invoke-static {v0, v9}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader;->proxy(Ljava/lang/Class;Ljava/util/Map;)Ljava/lang/Object;

    .line 1596
    .line 1597
    .line 1598
    move-result-object v0

    .line 1599
    return-object v0

    .line 1600
    :cond_2f
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1601
    .line 1602
    .line 1603
    move-result-object v0

    .line 1604
    iget-object v1, v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->proxy:Ljava/lang/Class;

    .line 1605
    .line 1606
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 1607
    .line 1608
    .line 1609
    move-result-object v1

    .line 1610
    new-instance v2, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$ProxiedInvocationHandler;

    .line 1611
    .line 1612
    invoke-virtual {v13}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1613
    .line 1614
    .line 1615
    move-result-object v3

    .line 1616
    invoke-direct {v2, v3, v9}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$ProxiedInvocationHandler;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 1617
    .line 1618
    .line 1619
    invoke-static {v0, v1, v2}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 1620
    .line 1621
    .line 1622
    move-result-object v0

    .line 1623
    return-object v0

    .line 1624
    :catch_16
    move-exception v0

    .line 1625
    move-object/from16 v24, v2

    .line 1626
    .line 1627
    move-object/from16 v25, v3

    .line 1628
    .line 1629
    move-object/from16 v31, v4

    .line 1630
    .line 1631
    move-object/from16 v32, v5

    .line 1632
    .line 1633
    move-object/from16 v33, v6

    .line 1634
    .line 1635
    move-object/from16 v16, v8

    .line 1636
    .line 1637
    move/from16 v21, v11

    .line 1638
    .line 1639
    iget-boolean v2, v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->generate:Z

    .line 1640
    .line 1641
    if-eqz v2, :cond_30

    .line 1642
    .line 1643
    invoke-static {}, Lnet/bytebuddy/utility/GraalImageCode;->getCurrent()Lnet/bytebuddy/utility/GraalImageCode;

    .line 1644
    .line 1645
    .line 1646
    move-result-object v2

    .line 1647
    iget-object v3, v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->proxy:Ljava/lang/Class;

    .line 1648
    .line 1649
    invoke-virtual {v3}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 1650
    .line 1651
    .line 1652
    move-result-object v3

    .line 1653
    sget-object v4, Lnet/bytebuddy/utility/MethodComparator;->INSTANCE:Lnet/bytebuddy/utility/MethodComparator;

    .line 1654
    .line 1655
    invoke-virtual {v2, v3, v4}, Lnet/bytebuddy/utility/GraalImageCode;->sorted([Ljava/lang/Object;Ljava/util/Comparator;)[Ljava/lang/Object;

    .line 1656
    .line 1657
    .line 1658
    move-result-object v2

    .line 1659
    check-cast v2, [Ljava/lang/reflect/Method;

    .line 1660
    .line 1661
    goto :goto_30

    .line 1662
    :cond_30
    iget-object v2, v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->proxy:Ljava/lang/Class;

    .line 1663
    .line 1664
    invoke-virtual {v2}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 1665
    .line 1666
    .line 1667
    move-result-object v2

    .line 1668
    :goto_30
    array-length v3, v2

    .line 1669
    const/4 v4, 0x0

    .line 1670
    :goto_31
    if-ge v4, v3, :cond_37

    .line 1671
    .line 1672
    aget-object v5, v2, v4

    .line 1673
    .line 1674
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 1675
    .line 1676
    .line 1677
    move-result-object v6

    .line 1678
    move-object/from16 v7, v33

    .line 1679
    .line 1680
    if-ne v6, v7, :cond_31

    .line 1681
    .line 1682
    move-object/from16 v19, v2

    .line 1683
    .line 1684
    move-object/from16 v14, v24

    .line 1685
    .line 1686
    move-object/from16 v8, v25

    .line 1687
    .line 1688
    move-object/from16 v12, v31

    .line 1689
    .line 1690
    move-object/from16 v6, v32

    .line 1691
    .line 1692
    const/16 v17, 0x0

    .line 1693
    .line 1694
    goto/16 :goto_34

    .line 1695
    .line 1696
    :cond_31
    move-object/from16 v6, v32

    .line 1697
    .line 1698
    invoke-virtual {v5, v6}, Ljava/lang/reflect/AccessibleObject;->isAnnotationPresent(Ljava/lang/Class;)Z

    .line 1699
    .line 1700
    .line 1701
    move-result v8

    .line 1702
    if-eqz v8, :cond_34

    .line 1703
    .line 1704
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1705
    .line 1706
    .line 1707
    move-result-object v8

    .line 1708
    array-length v8, v8

    .line 1709
    const/4 v11, 0x1

    .line 1710
    if-ne v8, v11, :cond_33

    .line 1711
    .line 1712
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1713
    .line 1714
    .line 1715
    move-result-object v8

    .line 1716
    const/16 v17, 0x0

    .line 1717
    .line 1718
    aget-object v8, v8, v17

    .line 1719
    .line 1720
    invoke-virtual {v8}, Ljava/lang/Class;->isPrimitive()Z

    .line 1721
    .line 1722
    .line 1723
    move-result v8

    .line 1724
    if-nez v8, :cond_33

    .line 1725
    .line 1726
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1727
    .line 1728
    .line 1729
    move-result-object v8

    .line 1730
    aget-object v8, v8, v17

    .line 1731
    .line 1732
    invoke-virtual {v8}, Ljava/lang/Class;->isArray()Z

    .line 1733
    .line 1734
    .line 1735
    move-result v8

    .line 1736
    if-nez v8, :cond_33

    .line 1737
    .line 1738
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1739
    .line 1740
    .line 1741
    move-result-object v8

    .line 1742
    move-object/from16 v12, v31

    .line 1743
    .line 1744
    if-ne v8, v12, :cond_32

    .line 1745
    .line 1746
    sget-object v8, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;->BOOLEAN:Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;

    .line 1747
    .line 1748
    invoke-interface {v9, v5, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1749
    .line 1750
    .line 1751
    move-object/from16 v19, v2

    .line 1752
    .line 1753
    move-object/from16 v14, v24

    .line 1754
    .line 1755
    move-object/from16 v8, v25

    .line 1756
    .line 1757
    goto :goto_34

    .line 1758
    :cond_32
    move-object/from16 v8, v25

    .line 1759
    .line 1760
    invoke-static {v5, v8}, L飘花落叶言世哲苏子兰楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1761
    .line 1762
    .line 1763
    return-object v16

    .line 1764
    :cond_33
    move-object/from16 v14, v24

    .line 1765
    .line 1766
    invoke-static {v5, v14}, L飘花落叶言世哲苏子兰楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1767
    .line 1768
    .line 1769
    return-object v16

    .line 1770
    :cond_34
    move-object/from16 v14, v24

    .line 1771
    .line 1772
    move-object/from16 v8, v25

    .line 1773
    .line 1774
    move-object/from16 v12, v31

    .line 1775
    .line 1776
    const/4 v11, 0x1

    .line 1777
    const/16 v17, 0x0

    .line 1778
    .line 1779
    if-nez v21, :cond_35

    .line 1780
    .line 1781
    invoke-virtual {v5, v10}, Ljava/lang/reflect/AccessibleObject;->isAnnotationPresent(Ljava/lang/Class;)Z

    .line 1782
    .line 1783
    .line 1784
    move-result v15

    .line 1785
    if-eqz v15, :cond_36

    .line 1786
    .line 1787
    :cond_35
    move-object/from16 v19, v2

    .line 1788
    .line 1789
    goto :goto_32

    .line 1790
    :cond_36
    new-instance v15, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForUnresolvedMethod;

    .line 1791
    .line 1792
    new-instance v11, Ljava/lang/StringBuilder;

    .line 1793
    .line 1794
    move-object/from16 v19, v2

    .line 1795
    .line 1796
    const-string v2, "Type not available on current VM: "

    .line 1797
    .line 1798
    invoke-direct {v11, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1799
    .line 1800
    .line 1801
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1802
    .line 1803
    .line 1804
    move-result-object v2

    .line 1805
    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1806
    .line 1807
    .line 1808
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1809
    .line 1810
    .line 1811
    move-result-object v2

    .line 1812
    invoke-direct {v15, v2}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForUnresolvedMethod;-><init>(Ljava/lang/String;)V

    .line 1813
    .line 1814
    .line 1815
    goto :goto_33

    .line 1816
    :goto_32
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1817
    .line 1818
    .line 1819
    move-result-object v2

    .line 1820
    invoke-static {v2}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher$ForDefaultValue;->of(Ljava/lang/Class;)Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$Dispatcher;

    .line 1821
    .line 1822
    .line 1823
    move-result-object v15

    .line 1824
    :goto_33
    invoke-interface {v9, v5, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1825
    .line 1826
    .line 1827
    :goto_34
    add-int/lit8 v4, v4, 0x1

    .line 1828
    .line 1829
    move-object/from16 v32, v6

    .line 1830
    .line 1831
    move-object/from16 v33, v7

    .line 1832
    .line 1833
    move-object/from16 v25, v8

    .line 1834
    .line 1835
    move-object/from16 v31, v12

    .line 1836
    .line 1837
    move-object/from16 v24, v14

    .line 1838
    .line 1839
    move-object/from16 v2, v19

    .line 1840
    .line 1841
    goto/16 :goto_31

    .line 1842
    .line 1843
    :cond_37
    iget-boolean v0, v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->generate:Z

    .line 1844
    .line 1845
    iget-object v2, v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->proxy:Ljava/lang/Class;

    .line 1846
    .line 1847
    if-eqz v0, :cond_38

    .line 1848
    .line 1849
    invoke-static {v2, v9}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$DynamicClassLoader;->proxy(Ljava/lang/Class;Ljava/util/Map;)Ljava/lang/Object;

    .line 1850
    .line 1851
    .line 1852
    move-result-object v0

    .line 1853
    return-object v0

    .line 1854
    :cond_38
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1855
    .line 1856
    .line 1857
    move-result-object v0

    .line 1858
    iget-object v1, v1, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->proxy:Ljava/lang/Class;

    .line 1859
    .line 1860
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 1861
    .line 1862
    .line 1863
    move-result-object v1

    .line 1864
    new-instance v2, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$ProxiedInvocationHandler;

    .line 1865
    .line 1866
    invoke-direct {v2, v13, v9}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher$ProxiedInvocationHandler;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 1867
    .line 1868
    .line 1869
    invoke-static {v0, v1, v2}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 1870
    .line 1871
    .line 1872
    move-result-object v0

    .line 1873
    return-object v0
.end method
