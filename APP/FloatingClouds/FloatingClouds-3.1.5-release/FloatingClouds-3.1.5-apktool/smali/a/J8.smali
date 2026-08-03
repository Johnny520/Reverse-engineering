.class public final La/J8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/ClassLoader;

.field public final b:Ljava/lang/String;

.field public final c:La/t;


# direct methods
.method public constructor <init>(Ljava/lang/ClassLoader;Ljava/lang/String;La/t;)V
    .locals 1

    const-string v0, "classLoader"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "processName"

    invoke-static {p2, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/J8;->a:Ljava/lang/ClassLoader;

    iput-object p2, p0, La/J8;->b:Ljava/lang/String;

    iput-object p3, p0, La/J8;->c:La/t;

    return-void
.end method

.method public static a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    .locals 2

    sget-object v0, Lio/github/libxposed/api/XposedInterface$ExceptionMode;->PROTECTIVE:Lio/github/libxposed/api/XposedInterface$ExceptionMode;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "className"

    invoke-static {p1, v1}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "methodName"

    invoke-static {p2, v1}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "exceptionMode"

    invoke-static {v0, v1}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v1, p3

    invoke-static {p3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p3

    iget-object v1, p0, La/J8;->a:Ljava/lang/ClassLoader;

    invoke-static {p1, v1, p2, p3}, La/A1;->e(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object p3

    if-nez p3, :cond_0

    new-instance p0, Ljava/lang/StringBuilder;

    const-string p3, "findAndHook: method not found: "

    invoke-direct {p0, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, La/x1;->e([Ljava/lang/Object;)V

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0, p3}, La/J8;->f(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    move-result-object p0

    const/16 p1, 0x32

    invoke-interface {p0, p1}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->setPriority(I)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    move-result-object p0

    invoke-interface {p0, v0}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->setExceptionMode(Lio/github/libxposed/api/XposedInterface$ExceptionMode;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    move-result-object p0

    new-instance p1, La/G8;

    const/4 p2, 0x0

    invoke-direct {p1, p4, p2}, La/G8;-><init>(La/D7;I)V

    invoke-interface {p0, p1}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    move-result-object p0

    return-object p0
.end method

.method public static b(La/J8;Ljava/lang/String;La/D7;La/D7;)Ljava/util/ArrayList;
    .locals 6

    const/4 v0, 0x1

    sget-object v1, Lio/github/libxposed/api/XposedInterface$ExceptionMode;->PROTECTIVE:Lio/github/libxposed/api/XposedInterface$ExceptionMode;

    const-string v2, "className"

    invoke-static {p1, v2}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "exceptionMode"

    invoke-static {v1, v2}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, La/A1;->a:Ljava/util/WeakHashMap;

    const-string v2, "classLoader"

    iget-object v3, p0, La/J8;->a:Ljava/lang/ClassLoader;

    invoke-static {v3, v2}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, p1}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    const/4 v2, 0x0

    if-nez p1, :cond_0

    new-array p1, v2, [Ljava/lang/reflect/Method;

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, La/A1;->f(Ljava/lang/Class;La/D7;)[Ljava/lang/reflect/Method;

    move-result-object p1

    :goto_0
    new-instance p2, Ljava/util/ArrayList;

    array-length v3, p1

    invoke-direct {p2, v3}, Ljava/util/ArrayList;-><init>(I)V

    array-length v3, p1

    :goto_1
    if-ge v2, v3, :cond_1

    aget-object v4, p1, v2

    invoke-virtual {p0, v4}, La/J8;->f(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    move-result-object v4

    const/16 v5, 0x32

    invoke-interface {v4, v5}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->setPriority(I)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    move-result-object v4

    invoke-interface {v4, v1}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->setExceptionMode(Lio/github/libxposed/api/XposedInterface$ExceptionMode;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    move-result-object v4

    new-instance v5, La/G8;

    invoke-direct {v5, p3, v0}, La/G8;-><init>(La/D7;I)V

    invoke-interface {v4, v5}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    move-result-object v4

    invoke-virtual {p2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/2addr v2, v0

    goto :goto_1

    :cond_1
    return-object p2
.end method

.method public static c(La/J8;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    .locals 5

    sget-object v0, Lio/github/libxposed/api/XposedInterface$ExceptionMode;->PROTECTIVE:Lio/github/libxposed/api/XposedInterface$ExceptionMode;

    const-string v1, "exceptionMode"

    invoke-static {v0, v1}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, La/J8;->a:Ljava/lang/ClassLoader;

    const-string v2, "java.io.FileOutputStream"

    invoke-static {v1, v2}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, La/N1;->c0([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v3

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Class;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ljava/lang/Class;

    :try_start_0
    array-length v4, v3

    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ljava/lang/Class;

    invoke-virtual {v1, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p0, v1}, La/J8;->f(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    move-result-object p0

    const/16 p1, 0x32

    invoke-interface {p0, p1}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->setPriority(I)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    move-result-object p0

    invoke-interface {p0, v0}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->setExceptionMode(Lio/github/libxposed/api/XposedInterface$ExceptionMode;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    move-result-object p0

    new-instance p1, La/G8;

    const/4 v0, 0x4

    invoke-direct {p1, p2, v0}, La/G8;-><init>(La/D7;I)V

    invoke-interface {p0, p1}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    move-result-object p0

    return-object p0

    :catch_0
    new-instance p0, La/l8;

    const/16 p2, 0x12

    invoke-direct {p0, p2}, La/l8;-><init>(I)V

    const/16 p2, 0x1f

    invoke-static {p1, v2, p0, p2}, La/N1;->e0([Ljava/lang/Object;Ljava/lang/String;La/D7;I)Ljava/lang/String;

    move-result-object p0

    const-string p1, "findAndHookConstructor: ctor not found: java.io.FileOutputStream("

    const-string p2, ")"

    invoke-static {p1, p0, p2}, La/z;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, La/x1;->e([Ljava/lang/Object;)V

    :goto_0
    return-object v2
.end method

.method public static d(La/J8;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)V
    .locals 2

    sget-object v0, Lio/github/libxposed/api/XposedInterface$ExceptionMode;->PROTECTIVE:Lio/github/libxposed/api/XposedInterface$ExceptionMode;

    const-string v1, "exceptionMode"

    invoke-static {v0, v1}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, La/Fd;->a(Ljava/lang/String;)La/o6;

    move-result-object p1

    array-length v1, p4

    invoke-static {p4, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p4

    iget-object v1, p0, La/J8;->a:Ljava/lang/ClassLoader;

    invoke-static {p2, v1, p3, p4}, La/A1;->e(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object p4

    if-nez p4, :cond_0

    new-instance p0, Ljava/lang/StringBuilder;

    const-string p1, "findAndHookGuarded: method not found: "

    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, La/x1;->e([Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {p0, p4}, La/J8;->f(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    move-result-object p0

    const/16 p2, 0x32

    invoke-interface {p0, p2}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->setPriority(I)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    move-result-object p0

    invoke-interface {p0, v0}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->setExceptionMode(Lio/github/libxposed/api/XposedInterface$ExceptionMode;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    move-result-object p0

    new-instance p2, La/H8;

    const/4 p3, 0x0

    invoke-direct {p2, p1, p5, p3}, La/H8;-><init>(La/o6;La/D7;I)V

    invoke-interface {p0, p2}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    return-void
.end method

.method public static e(La/J8;Ljava/lang/String;Ljava/lang/String;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    .locals 3

    sget-object v0, Lio/github/libxposed/api/XposedInterface$ExceptionMode;->PROTECTIVE:Lio/github/libxposed/api/XposedInterface$ExceptionMode;

    const-string v1, "exceptionMode"

    invoke-static {v0, v1}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, La/J8;->a:Ljava/lang/ClassLoader;

    invoke-static {p1, v2, p2, v1}, La/A1;->e(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance p0, Ljava/lang/StringBuilder;

    const-string p3, "findAndHookNoArgs: method not found: "

    invoke-direct {p0, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, La/x1;->e([Ljava/lang/Object;)V

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0, v1}, La/J8;->f(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    move-result-object p0

    const/16 p1, 0x32

    invoke-interface {p0, p1}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->setPriority(I)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    move-result-object p0

    invoke-interface {p0, v0}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->setExceptionMode(Lio/github/libxposed/api/XposedInterface$ExceptionMode;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    move-result-object p0

    new-instance p1, La/G8;

    const/4 p2, 0x3

    invoke-direct {p1, p3, p2}, La/G8;-><init>(La/D7;I)V

    invoke-interface {p0, p1}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    move-result-object p0

    return-object p0
.end method

.method public static g(La/J8;Ljava/lang/reflect/Method;La/D7;)V
    .locals 2

    sget-object v0, Lio/github/libxposed/api/XposedInterface$ExceptionMode;->PROTECTIVE:Lio/github/libxposed/api/XposedInterface$ExceptionMode;

    const-string v1, "exceptionMode"

    invoke-static {v0, v1}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, La/J8;->f(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    move-result-object p0

    const/16 p1, 0x32

    invoke-interface {p0, p1}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->setPriority(I)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    move-result-object p0

    invoke-interface {p0, v0}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->setExceptionMode(Lio/github/libxposed/api/XposedInterface$ExceptionMode;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    move-result-object p0

    new-instance p1, La/G8;

    const/4 v0, 0x2

    invoke-direct {p1, p2, v0}, La/G8;-><init>(La/D7;I)V

    invoke-interface {p0, p1}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    move-result-object p0

    const-string p1, "intercept(...)"

    invoke-static {p0, p1}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public static h(La/J8;Ljava/lang/String;Ljava/lang/reflect/Method;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    .locals 2

    sget-object v0, Lio/github/libxposed/api/XposedInterface$ExceptionMode;->PROTECTIVE:Lio/github/libxposed/api/XposedInterface$ExceptionMode;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "method"

    invoke-static {p2, v1}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "exceptionMode"

    invoke-static {v0, v1}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, La/Fd;->a(Ljava/lang/String;)La/o6;

    move-result-object p1

    invoke-virtual {p0, p2}, La/J8;->f(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    move-result-object p0

    const/16 p2, 0x32

    invoke-interface {p0, p2}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->setPriority(I)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    move-result-object p0

    invoke-interface {p0, v0}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->setExceptionMode(Lio/github/libxposed/api/XposedInterface$ExceptionMode;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    move-result-object p0

    new-instance p2, La/H8;

    const/4 v0, 0x1

    invoke-direct {p2, p1, p3, v0}, La/H8;-><init>(La/o6;La/D7;I)V

    invoke-interface {p0, p2}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    move-result-object p0

    const-string p1, "intercept(...)"

    invoke-static {p0, p1}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method


# virtual methods
.method public final f(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;
    .locals 1

    const-string v0, "executable"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La/J8;->c:La/t;

    invoke-virtual {v0, p1}, La/t;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/github/libxposed/api/XposedInterface$HookBuilder;

    return-object p1
.end method
