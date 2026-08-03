.class public abstract Lde/robv/android/xposed/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile a:Lio/github/libxposed/api/XposedModule;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    return-void
.end method

.method public static final a(Ljava/lang/Class;Ljava/lang/String;Lde/robv/android/xposed/c;)V
    .locals 5

    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object p0

    const-string v0, "getDeclaredMethods(...)"

    invoke-static {p0, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p0, v2

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, p1}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    const/16 p1, 0xa

    invoke-static {v0, p1}, LE0/n;->k0(Ljava/lang/Iterable;I)I

    move-result p1

    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Method;

    invoke-static {v0}, LQ0/g;->b(Ljava/lang/Object;)V

    invoke-static {v0, p2}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-static {p0}, LE0/l;->B0(Ljava/util/ArrayList;)Ljava/util/Set;

    return-void
.end method

.method public static final b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;
    .locals 2

    const-string v0, "member"

    invoke-static {p0, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Ljava/lang/reflect/Executable;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ljava/lang/reflect/Executable;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    sget-object p0, Lde/robv/android/xposed/d;->a:Lio/github/libxposed/api/XposedModule;

    if-eqz p0, :cond_1

    invoke-virtual {p0, v0}, Lio/github/libxposed/api/XposedModule;->hook(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    move-result-object p0

    iget v1, p1, Lde/robv/android/xposed/c;->a:I

    invoke-interface {p0, v1}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->setPriority(I)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    move-result-object p0

    sget-object v1, Lio/github/libxposed/api/XposedInterface$ExceptionMode;->PASSTHROUGH:Lio/github/libxposed/api/XposedInterface$ExceptionMode;

    invoke-interface {p0, v1}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->setExceptionMode(Lio/github/libxposed/api/XposedInterface$ExceptionMode;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    move-result-object p0

    new-instance v1, Lde/robv/android/xposed/XposedBridge$LegacyHooker;

    invoke-direct {v1, v0, p1}, Lde/robv/android/xposed/XposedBridge$LegacyHooker;-><init>(Ljava/lang/reflect/Executable;Lde/robv/android/xposed/c;)V

    check-cast v1, Lio/github/libxposed/api/XposedInterface$Hooker;

    invoke-interface {p0, v1}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    move-result-object p0

    const-string p1, "intercept(...)"

    invoke-static {p0, p1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lx0/e;

    const/16 p1, 0x1c

    invoke-direct {p0, p1}, Lx0/e;-><init>(I)V

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "libxposed module is not initialized"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Only methods and constructors can be hooked: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final c(Lio/github/libxposed/api/XposedModule;)V
    .locals 1

    const-string v0, "module"

    invoke-static {p0, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p0, Lde/robv/android/xposed/d;->a:Lio/github/libxposed/api/XposedModule;

    return-void
.end method

.method public static final d(Ljava/lang/String;)V
    .locals 4

    const-string v0, "text"

    invoke-static {p0, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    sget-object v0, Lde/robv/android/xposed/d;->a:Lio/github/libxposed/api/XposedModule;

    if-eqz v0, :cond_0

    const-string v1, "OKK-Xposed"

    const/4 v2, 0x0

    const/4 v3, 0x4

    invoke-virtual {v0, v3, v1, p0, v2}, Lio/github/libxposed/api/XposedModule;->log(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :cond_0
    :goto_0
    return-void
.end method

.method public static final e(Ljava/lang/Throwable;)V
    .locals 4

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    :try_start_0
    sget-object v0, Lde/robv/android/xposed/d;->a:Lio/github/libxposed/api/XposedModule;

    if-eqz v0, :cond_1

    const-string v1, "OKK-Xposed"

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    const/4 v3, 0x6

    invoke-virtual {v0, v3, v1, v2, p0}, Lio/github/libxposed/api/XposedModule;->log(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-static {p0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :cond_1
    :goto_2
    return-void
.end method
