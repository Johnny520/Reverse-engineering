.class public final Lyq0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lyq0;

.field private static final β:Ljava/lang/String; = "r29ad36de2985c377"

.field private static volatile γ:Lio/github/libxposed/api/XposedModule;

.field public static final δ:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lyq0;

    .line 2
    .line 3
    invoke-direct {v0}, Lyq0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lyq0;->α:Lyq0;

    .line 7
    .line 8
    const/16 v0, 0x8

    .line 9
    .line 10
    sput v0, Lyq0;->δ:I

    .line 11
    .line 12
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final η()Lio/github/libxposed/api/XposedModule;
    .locals 0

    .line 1
    sget-object p0, Lyq0;->γ:Lio/github/libxposed/api/XposedModule;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "libxposed runtime is not bound; hooks must be installed after onModuleLoaded"

    .line 7
    .line 8
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0
.end method


# virtual methods
.method public final α(Lio/github/libxposed/api/XposedModule;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sput-object p1, Lyq0;->γ:Lio/github/libxposed/api/XposedModule;

    .line 5
    .line 6
    return-void
.end method

.method public final β(Ljava/lang/reflect/Executable;Lm01;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lyq0;->η()Lio/github/libxposed/api/XposedModule;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0, p1}, Lio/github/libxposed/api/XposedModule;->hook(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p2}, Lm01;->getPriority$app()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-interface {p0, p1}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->setPriority(I)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    sget-object p1, Lio/github/libxposed/api/XposedInterface$ExceptionMode;->PASSTHROUGH:Lio/github/libxposed/api/XposedInterface$ExceptionMode;

    .line 24
    .line 25
    invoke-interface {p0, p1}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->setExceptionMode(Lio/github/libxposed/api/XposedInterface$ExceptionMode;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    new-instance p1, Lob;

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    invoke-direct {p1, v0, p2}, Lob;-><init>(ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-interface {p0, p1}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    return-object p0
.end method

.method public final γ(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lyq0;->η()Lio/github/libxposed/api/XposedModule;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0, p1}, Lio/github/libxposed/api/XposedModule;->getInvoker(Ljava/lang/reflect/Method;)Lio/github/libxposed/api/XposedInterface$Invoker;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    sget-object p1, Lio/github/libxposed/api/XposedInterface$Invoker$Type;->ORIGIN:Lio/github/libxposed/api/XposedInterface$Invoker$Type$Origin;

    .line 19
    .line 20
    invoke-interface {p0, p1}, Lio/github/libxposed/api/XposedInterface$Invoker;->setType(Lio/github/libxposed/api/XposedInterface$Invoker$Type;)Lio/github/libxposed/api/XposedInterface$Invoker;

    .line 21
    .line 22
    .line 23
    array-length p1, p3

    .line 24
    invoke-static {p3, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-interface {p0, p2, p1}, Lio/github/libxposed/api/XposedInterface$Invoker;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public final δ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object p0, Lyq0;->γ:Lio/github/libxposed/api/XposedModule;

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const/4 v0, 0x3

    .line 16
    invoke-virtual {p0, v0, p1, p2}, Lio/github/libxposed/api/XposedModule;->log(ILjava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object p0, Lyq0;->γ:Lio/github/libxposed/api/XposedModule;

    .line 11
    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    invoke-static {p1, p2, p3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const/4 v0, 0x6

    .line 19
    invoke-virtual {p0, v0, p1, p2, p3}, Lio/github/libxposed/api/XposedModule;->log(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final ζ(Ljava/lang/String;Ljava/lang/reflect/Executable;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string p1, " callback failed: "

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const-string p2, "r29ad36de2985c377"

    .line 31
    .line 32
    invoke-virtual {p0, p2, p1, p3}, Lyq0;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method
