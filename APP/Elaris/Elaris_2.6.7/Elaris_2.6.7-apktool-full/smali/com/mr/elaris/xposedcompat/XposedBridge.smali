.class public final Lcom/mr/elaris/xposedcompat/XposedBridge;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# static fields
.field public static final BOOTCLASSLOADER:Ljava/lang/ClassLoader;

.field public static XPOSED_BRIDGE_VERSION:I

.field private static volatile sFramework:Lio/github/libxposed/api/XposedInterface;

.field private static volatile sFrameworkClassName:Ljava/lang/String;

.field private static volatile sLoggingEnabled:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Lcom/mr/elaris/xposedcompat/XposedBridge;->BOOTCLASSLOADER:Ljava/lang/ClassLoader;

    .line 6
    .line 7
    const/16 v0, 0x66

    .line 8
    .line 9
    sput v0, Lcom/mr/elaris/xposedcompat/XposedBridge;->XPOSED_BRIDGE_VERSION:I

    .line 10
    .line 11
    const-string v0, ""

    .line 12
    .line 13
    sput-object v0, Lcom/mr/elaris/xposedcompat/XposedBridge;->sFrameworkClassName:Ljava/lang/String;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    sput-boolean v0, Lcom/mr/elaris/xposedcompat/XposedBridge;->sLoggingEnabled:Z

    .line 17
    .line 18
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

.method public static bridge synthetic a(Lio/github/libxposed/api/XposedInterface$Chain;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/mr/elaris/xposedcompat/XposedBridge;->invokeHook(Lio/github/libxposed/api/XposedInterface$Chain;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static appendFrameworkSource(Ljava/lang/StringBuilder;Ljava/lang/String;)V
    .locals 2

    .line 1
    if-eqz p0, :cond_5

    .line 2
    .line 3
    if-eqz p1, :cond_5

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_5

    .line 10
    .line 11
    const-string v0, "com.mr.elaris."

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    invoke-static {p1}, Lcom/mr/elaris/xposedcompat/XposedBridge;->isFrameworkMarker(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-lez v0, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-lez v1, :cond_2

    .line 42
    .line 43
    const/4 v1, 0x1

    .line 44
    goto :goto_0

    .line 45
    :cond_2
    const/4 v1, 0x0

    .line 46
    :goto_0
    add-int/2addr v0, v1

    .line 47
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    add-int/2addr v1, v0

    .line 52
    const/16 v0, 0x6e

    .line 53
    .line 54
    if-le v1, v0, :cond_3

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-lez v0, :cond_4

    .line 62
    .line 63
    const/16 v0, 0x20

    .line 64
    .line 65
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    :cond_4
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    :cond_5
    :goto_1
    return-void
.end method

.method public static attachModernFramework(Lio/github/libxposed/api/XposedInterface;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    sput-object p0, Lcom/mr/elaris/xposedcompat/XposedBridge;->sFramework:Lio/github/libxposed/api/XposedInterface;

    .line 4
    .line 5
    invoke-static {p0}, Lcom/mr/elaris/xposedcompat/XposedBridge;->rememberFrameworkClass(Lio/github/libxposed/api/XposedInterface;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public static detachModernFramework(Lio/github/libxposed/api/XposedInterface;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    sget-object v0, Lcom/mr/elaris/xposedcompat/XposedBridge;->sFramework:Lio/github/libxposed/api/XposedInterface;

    .line 4
    .line 5
    if-ne v0, p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    sput-object p0, Lcom/mr/elaris/xposedcompat/XposedBridge;->sFramework:Lio/github/libxposed/api/XposedInterface;

    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public static getFrameworkClassName()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lcom/mr/elaris/xposedcompat/XposedBridge;->sFrameworkClassName:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-lez v1, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    sget-object v0, Lcom/mr/elaris/xposedcompat/XposedBridge;->sFramework:Lio/github/libxposed/api/XposedInterface;

    .line 13
    .line 14
    const-string v1, ""

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    return-object v1

    .line 19
    :cond_1
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    return-object v0

    .line 28
    :catchall_0
    return-object v1
.end method

.method public static getFrameworkName()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lcom/mr/elaris/xposedcompat/XposedBridge;->sFramework:Lio/github/libxposed/api/XposedInterface;

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-object v1

    .line 8
    :cond_0
    :try_start_0
    invoke-interface {v0}, Lio/github/libxposed/api/XposedInterface;->getFrameworkName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    return-object v0

    .line 13
    :catchall_0
    return-object v1
.end method

.method public static getFrameworkVersion()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lcom/mr/elaris/xposedcompat/XposedBridge;->sFramework:Lio/github/libxposed/api/XposedInterface;

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-object v1

    .line 8
    :cond_0
    :try_start_0
    invoke-interface {v0}, Lio/github/libxposed/api/XposedInterface;->getFrameworkVersion()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    return-object v0

    .line 13
    :catchall_0
    return-object v1
.end method

.method public static getModuleApplicationInfo()Landroid/content/pm/ApplicationInfo;
    .locals 2

    .line 1
    sget-object v0, Lcom/mr/elaris/xposedcompat/XposedBridge;->sFramework:Lio/github/libxposed/api/XposedInterface;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    :try_start_0
    invoke-interface {v0}, Lio/github/libxposed/api/XposedInterface;->getModuleApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 8
    .line 9
    .line 10
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    return-object v0

    .line 12
    :catchall_0
    return-object v1
.end method

.method public static getRemotePreferences(Ljava/lang/String;)Landroid/content/SharedPreferences;
    .locals 2

    .line 1
    sget-object v0, Lcom/mr/elaris/xposedcompat/XposedBridge;->sFramework:Lio/github/libxposed/api/XposedInterface;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    :try_start_0
    invoke-interface {v0, p0}, Lio/github/libxposed/api/XposedInterface;->getRemotePreferences(Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 8
    .line 9
    .line 10
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    return-object p0

    .line 12
    :catchall_0
    return-object v1
.end method

.method public static getXposedVersion()I
    .locals 1

    .line 1
    sget-object v0, Lcom/mr/elaris/xposedcompat/XposedBridge;->sFramework:Lio/github/libxposed/api/XposedInterface;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget v0, Lcom/mr/elaris/xposedcompat/XposedBridge;->XPOSED_BRIDGE_VERSION:I

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    :try_start_0
    invoke-interface {v0}, Lio/github/libxposed/api/XposedInterface;->getApiVersion()I

    .line 9
    .line 10
    .line 11
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    return v0

    .line 13
    :catchall_0
    sget v0, Lcom/mr/elaris/xposedcompat/XposedBridge;->XPOSED_BRIDGE_VERSION:I

    .line 14
    .line 15
    return v0
.end method

.method public static hookAllConstructors(Ljava/lang/Class;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Ljava/util/Set;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/mr/elaris/xposedcompat/XC_MethodHook;",
            ")",
            "Ljava/util/Set<",
            "Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    goto :goto_2

    .line 9
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    array-length v1, p0

    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_0
    if-ge v2, v1, :cond_1

    .line 16
    .line 17
    aget-object v3, p0, v2

    .line 18
    .line 19
    const/4 v4, 0x1

    .line 20
    :try_start_0
    invoke-virtual {v3, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 21
    .line 22
    .line 23
    invoke-static {v3, p1}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-interface {v0, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :catchall_0
    move-exception v4

    .line 32
    new-instance v5, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v6, "hookAllConstructors failed "

    .line 35
    .line 36
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v3, ": "

    .line 43
    .line 44
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-static {v3}, Lcom/mr/elaris/xposedcompat/XposedBridge;->log(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    :goto_2
    return-object v0
.end method

.method public static hookAllMethods(Ljava/lang/Class;Ljava/lang/String;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Ljava/util/Set;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "Lcom/mr/elaris/xposedcompat/XC_MethodHook;",
            ")",
            "Ljava/util/Set<",
            "Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    if-eqz p0, :cond_2

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    goto :goto_2

    .line 11
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    array-length v1, p0

    .line 16
    const/4 v2, 0x0

    .line 17
    :goto_0
    if-ge v2, v1, :cond_2

    .line 18
    .line 19
    aget-object v3, p0, v2

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-nez v4, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    const/4 v4, 0x1

    .line 33
    :try_start_0
    invoke-virtual {v3, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 34
    .line 35
    .line 36
    invoke-static {v3, p2}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-interface {v0, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :catchall_0
    move-exception v4

    .line 45
    new-instance v5, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v6, "hookAllMethods failed "

    .line 48
    .line 49
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v3, ": "

    .line 56
    .line 57
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-static {v3}, Lcom/mr/elaris/xposedcompat/XposedBridge;->log(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    :goto_2
    return-object v0
.end method

.method public static hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;
    .locals 3

    .line 1
    instance-of v0, p0, Ljava/lang/reflect/Executable;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/mr/elaris/xposedcompat/XposedBridge;->requireFramework()Lio/github/libxposed/api/XposedInterface;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    move-object v1, p0

    .line 12
    check-cast v1, Ljava/lang/reflect/Executable;

    .line 13
    .line 14
    invoke-interface {v0, v1}, Lio/github/libxposed/api/XposedInterface;->hook(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget v1, p1, Lcom/mr/elaris/xposedcompat/callbacks/XCallback;->priority:I

    .line 19
    .line 20
    invoke-interface {v0, v1}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->setPriority(I)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sget-object v1, Lio/github/libxposed/api/XposedInterface$ExceptionMode;->PROTECTIVE:Lio/github/libxposed/api/XposedInterface$ExceptionMode;

    .line 25
    .line 26
    invoke-interface {v0, v1}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->setExceptionMode(Lio/github/libxposed/api/XposedInterface$ExceptionMode;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    new-instance v1, Lcom/mr/elaris/xposedcompat/XposedBridge$1;

    .line 31
    .line 32
    invoke-direct {v1, p1}, Lcom/mr/elaris/xposedcompat/XposedBridge$1;-><init>(Lcom/mr/elaris/xposedcompat/XC_MethodHook;)V

    .line 33
    .line 34
    .line 35
    invoke-interface {v0, v1}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    new-instance v1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 40
    .line 41
    new-instance v2, Lcom/mr/elaris/xposedcompat/XposedBridge$2;

    .line 42
    .line 43
    invoke-direct {v2, v0}, Lcom/mr/elaris/xposedcompat/XposedBridge$2;-><init>(Lio/github/libxposed/api/XposedInterface$HookHandle;)V

    .line 44
    .line 45
    .line 46
    invoke-direct {v1, p0, p1, v2}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;-><init>(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;Ljava/lang/Runnable;)V

    .line 47
    .line 48
    .line 49
    return-object v1

    .line 50
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    .line 51
    .line 52
    const-string p1, "callback == null"

    .line 53
    .line 54
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p0

    .line 58
    :cond_1
    const-string p1, "Only methods and constructors can be hooked: "

    .line 59
    .line 60
    invoke-static {p0, p1}, Lu2;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const/4 p0, 0x0

    .line 64
    return-object p0
.end method

.method private static invokeHook(Lio/github/libxposed/api/XposedInterface$Chain;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->getExecutable()Ljava/lang/reflect/Executable;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iput-object v1, v0, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->method:Ljava/lang/reflect/Member;

    .line 11
    .line 12
    invoke-static {p0}, Lcom/mr/elaris/xposedcompat/XposedBridge;->safeThisObject(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iput-object v1, v0, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v1}, Lcom/mr/elaris/xposedcompat/XposedBridge;->toArray(Ljava/util/List;)[Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iput-object v1, v0, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;->beforeHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->shouldReturnEarly()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_2

    .line 36
    .line 37
    :try_start_0
    iget-object v1, v0, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 38
    .line 39
    invoke-interface {p0, v1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed([Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-static {p0}, Lcom/mr/elaris/xposedcompat/XposedBridge;->safeThisObject(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    iget-object v2, v0, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 48
    .line 49
    if-nez v2, :cond_1

    .line 50
    .line 51
    if-eqz p0, :cond_0

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    move-object p0, v1

    .line 55
    :goto_0
    iput-object p0, v0, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :catchall_0
    move-exception p0

    .line 59
    goto :goto_2

    .line 60
    :cond_1
    :goto_1
    invoke-virtual {v0, v1}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->clearReturnEarly()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    .line 65
    .line 66
    goto :goto_3

    .line 67
    :goto_2
    invoke-virtual {v0, p0}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->setThrowable(Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->clearReturnEarly()V

    .line 71
    .line 72
    .line 73
    :cond_2
    :goto_3
    invoke-virtual {p1, v0}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;->afterHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->getResultOrThrowable()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0
.end method

.method public static invokeOriginalMethod(Ljava/lang/reflect/Member;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    if-eqz p0, :cond_5

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    new-array p2, p2, [Ljava/lang/Object;

    .line 7
    .line 8
    :cond_0
    sget-object v0, Lcom/mr/elaris/xposedcompat/XposedBridge;->sFramework:Lio/github/libxposed/api/XposedInterface;

    .line 9
    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    instance-of v1, p0, Ljava/lang/reflect/Method;

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    check-cast p0, Ljava/lang/reflect/Method;

    .line 17
    .line 18
    invoke-interface {v0, p0}, Lio/github/libxposed/api/XposedInterface;->getInvoker(Ljava/lang/reflect/Method;)Lio/github/libxposed/api/XposedInterface$Invoker;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    sget-object v0, Lio/github/libxposed/api/XposedInterface$Invoker$Type;->ORIGIN:Lio/github/libxposed/api/XposedInterface$Invoker$Type$Origin;

    .line 23
    .line 24
    invoke-interface {p0, v0}, Lio/github/libxposed/api/XposedInterface$Invoker;->setType(Lio/github/libxposed/api/XposedInterface$Invoker$Type;)Lio/github/libxposed/api/XposedInterface$Invoker;

    .line 25
    .line 26
    .line 27
    invoke-interface {p0, p1, p2}, Lio/github/libxposed/api/XposedInterface$Invoker;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_1
    instance-of v1, p0, Ljava/lang/reflect/Constructor;

    .line 33
    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    check-cast p0, Ljava/lang/reflect/Constructor;

    .line 37
    .line 38
    invoke-interface {v0, p0}, Lio/github/libxposed/api/XposedInterface;->getInvoker(Ljava/lang/reflect/Constructor;)Lio/github/libxposed/api/XposedInterface$CtorInvoker;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    sget-object p1, Lio/github/libxposed/api/XposedInterface$Invoker$Type;->ORIGIN:Lio/github/libxposed/api/XposedInterface$Invoker$Type$Origin;

    .line 43
    .line 44
    invoke-interface {p0, p1}, Lio/github/libxposed/api/XposedInterface$CtorInvoker;->setType(Lio/github/libxposed/api/XposedInterface$Invoker$Type;)Lio/github/libxposed/api/XposedInterface$Invoker;

    .line 45
    .line 46
    .line 47
    invoke-interface {p0, p2}, Lio/github/libxposed/api/XposedInterface$CtorInvoker;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0

    .line 52
    :cond_2
    instance-of v0, p0, Ljava/lang/reflect/Method;

    .line 53
    .line 54
    const/4 v1, 0x1

    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    check-cast p0, Ljava/lang/reflect/Method;

    .line 58
    .line 59
    invoke-virtual {p0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0

    .line 67
    :cond_3
    instance-of p1, p0, Ljava/lang/reflect/Constructor;

    .line 68
    .line 69
    if-eqz p1, :cond_4

    .line 70
    .line 71
    check-cast p0, Ljava/lang/reflect/Constructor;

    .line 72
    .line 73
    invoke-virtual {p0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, p2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0

    .line 81
    :cond_4
    const-string p1, "Unsupported member: "

    .line 82
    .line 83
    invoke-static {p0, p1}, Lu2;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    const/4 p0, 0x0

    .line 87
    return-object p0

    .line 88
    :cond_5
    new-instance p0, Ljava/lang/NullPointerException;

    .line 89
    .line 90
    const-string p1, "method == null"

    .line 91
    .line 92
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw p0
.end method

.method private static isFrameworkMarker(Ljava/lang/String;)Z
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    const-string v0, "lsposed"

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_2

    .line 17
    .line 18
    const-string v0, "lspd"

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_2

    .line 25
    .line 26
    const-string v0, "lspatch"

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    const-string v0, "npatch"

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_2

    .line 41
    .line 42
    const-string v0, "nitsuya"

    .line 43
    .line 44
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_2

    .line 49
    .line 50
    const-string v0, "fpa"

    .line 51
    .line 52
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-nez v0, :cond_2

    .line 57
    .line 58
    const-string v0, "fankes"

    .line 59
    .line 60
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_2

    .line 65
    .line 66
    const-string v0, "libxposed"

    .line 67
    .line 68
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    if-eqz p0, :cond_1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    const/4 p0, 0x0

    .line 76
    return p0

    .line 77
    :cond_2
    :goto_1
    const/4 p0, 0x1

    .line 78
    return p0
.end method

.method public static declared-synchronized log(Ljava/lang/String;)V
    .locals 3

    const-class v0, Lcom/mr/elaris/xposedcompat/XposedBridge;

    monitor-enter v0

    .line 29
    :try_start_0
    sget-boolean v1, Lcom/mr/elaris/xposedcompat/XposedBridge;->sLoggingEnabled:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x4

    const/4 v2, 0x0

    .line 30
    :try_start_1
    invoke-static {v1, p0, v2}, Lcom/mr/elaris/xposedcompat/XposedBridge;->logRaw(ILjava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method

.method public static declared-synchronized log(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    const-class v0, Lcom/mr/elaris/xposedcompat/XposedBridge;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-boolean v1, Lcom/mr/elaris/xposedcompat/XposedBridge;->sLoggingEnabled:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-void

    .line 10
    :cond_0
    if-nez p0, :cond_1

    .line 11
    .line 12
    :try_start_1
    const-string v1, "null"

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception p0

    .line 16
    goto :goto_1

    .line 17
    :cond_1
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :goto_0
    const/4 v2, 0x6

    .line 22
    invoke-static {v2, v1, p0}, Lcom/mr/elaris/xposedcompat/XposedBridge;->logRaw(ILjava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    .line 24
    .line 25
    monitor-exit v0

    .line 26
    return-void

    .line 27
    :goto_1
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 28
    throw p0
.end method

.method public static declared-synchronized logAlways(Ljava/lang/String;)V
    .locals 3

    .line 1
    const-class v0, Lcom/mr/elaris/xposedcompat/XposedBridge;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x4

    .line 5
    const/4 v2, 0x0

    .line 6
    :try_start_0
    invoke-static {v1, p0, v2}, Lcom/mr/elaris/xposedcompat/XposedBridge;->logRaw(ILjava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p0

    .line 12
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 13
    throw p0
.end method

.method private static logRaw(ILjava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const-string p1, "null"

    .line 4
    .line 5
    :cond_0
    sget-object v0, Lcom/mr/elaris/xposedcompat/XposedBridge;->sFramework:Lio/github/libxposed/api/XposedInterface;

    .line 6
    .line 7
    const-string v1, "Elaris"

    .line 8
    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    if-nez p2, :cond_1

    .line 12
    .line 13
    :try_start_0
    invoke-interface {v0, p0, v1, p1}, Lio/github/libxposed/api/XposedInterface;->log(ILjava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    invoke-interface {v0, p0, v1, p1, p2}, Lio/github/libxposed/api/XposedInterface;->log(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catchall_0
    :cond_2
    if-nez p2, :cond_3

    .line 22
    .line 23
    :try_start_1
    invoke-static {v1, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_3
    invoke-static {v1, p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 28
    .line 29
    .line 30
    :catchall_1
    :goto_0
    return-void
.end method

.method private static rememberFrameworkClass(Lio/github/libxposed/api/XposedInterface;)V
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {v0, v1}, Lcom/mr/elaris/xposedcompat/XposedBridge;->appendFrameworkSource(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    if-eqz p0, :cond_0

    .line 26
    .line 27
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {v0, p0}, Lcom/mr/elaris/xposedcompat/XposedBridge;->appendFrameworkSource(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    new-instance p0, Ljava/lang/Throwable;

    .line 35
    .line 36
    invoke-direct {p0}, Ljava/lang/Throwable;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    const/4 v1, 0x0

    .line 44
    :goto_0
    array-length v2, p0

    .line 45
    if-ge v1, v2, :cond_2

    .line 46
    .line 47
    aget-object v2, p0, v1

    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-static {v2}, Lcom/mr/elaris/xposedcompat/XposedBridge;->isFrameworkMarker(Ljava/lang/String;)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_1

    .line 58
    .line 59
    aget-object p0, p0, v1

    .line 60
    .line 61
    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-static {v0, p0}, Lcom/mr/elaris/xposedcompat/XposedBridge;->appendFrameworkSource(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    if-lez p0, :cond_3

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    sput-object p0, Lcom/mr/elaris/xposedcompat/XposedBridge;->sFrameworkClassName:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    .line 84
    :catchall_0
    :cond_3
    return-void
.end method

.method private static requireFramework()Lio/github/libxposed/api/XposedInterface;
    .locals 1

    .line 1
    sget-object v0, Lcom/mr/elaris/xposedcompat/XposedBridge;->sFramework:Lio/github/libxposed/api/XposedInterface;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "Xposed framework is not attached"

    .line 7
    .line 8
    invoke-static {v0}, Lu2;->b(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method private static safeThisObject(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 0

    .line 1
    :try_start_0
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    return-object p0

    .line 6
    :catchall_0
    const/4 p0, 0x0

    .line 7
    return-object p0
.end method

.method public static setLoggingEnabled(Z)V
    .locals 0

    .line 1
    sput-boolean p0, Lcom/mr/elaris/xposedcompat/XposedBridge;->sLoggingEnabled:Z

    .line 2
    .line 3
    return-void
.end method

.method private static toArray(Ljava/util/List;)[Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)[",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_1

    .line 3
    .line 4
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    new-array v0, v0, [Ljava/lang/Object;

    .line 12
    .line 13
    invoke-interface {p0, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_1
    :goto_0
    new-array p0, v0, [Ljava/lang/Object;

    .line 19
    .line 20
    return-object p0
.end method

.method public static unhookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)V
    .locals 0

    .line 1
    return-void
.end method
