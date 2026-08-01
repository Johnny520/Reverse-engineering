.class public final Ltop/suzhelan/qstory/hook/InjectHook;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lde/robv/android/xposed/IXposedHookLoadPackage;
.implements Lde/robv/android/xposed/IXposedHookZygoteInit;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0017\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Ltop/suzhelan/qstory/hook/InjectHook;",
        "Lde/robv/android/xposed/IXposedHookLoadPackage;",
        "Lde/robv/android/xposed/IXposedHookZygoteInit;",
        "<init>",
        "()V",
        "Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;",
        "param",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "injectOnce",
        "(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V",
        "Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;",
        "loadPackageParam",
        "Ljava/lang/reflect/Method;",
        "getApplicationCreateMethod",
        "(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)Ljava/lang/reflect/Method;",
        "handleLoadPackage",
        "(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V",
        "Lde/robv/android/xposed/IXposedHookZygoteInit$StartupParam;",
        "startupParam",
        "initZygote",
        "(Lde/robv/android/xposed/IXposedHookZygoteInit$StartupParam;)V",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u82cf\u4e16\u54f2\u5b50\u696a\u5170/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
        "hookEnter",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u82cf\u4e16\u54f2\u5b50\u696a\u5170/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "isInject",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "Lde/robv/android/xposed/IXposedHookZygoteInit$StartupParam;",
        "QStory:app_publishRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final hookEnter:L飘花落叶言苏世哲子楪兰/飘花落叶言子楪世苏哲兰;

.field private final isInject:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private startupParam:Lde/robv/android/xposed/IXposedHookZygoteInit$StartupParam;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, L飘花落叶言苏世哲子楪兰/飘花落叶言子楪世苏哲兰;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ltop/suzhelan/qstory/hook/InjectHook;->hookEnter:L飘花落叶言苏世哲子楪兰/飘花落叶言子楪世苏哲兰;

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Ltop/suzhelan/qstory/hook/InjectHook;->isInject:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 18
    .line 19
    return-void
.end method

.method public static final synthetic access$injectOnce(Ltop/suzhelan/qstory/hook/InjectHook;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ltop/suzhelan/qstory/hook/InjectHook;->injectOnce(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final getApplicationCreateMethod(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)Ljava/lang/reflect/Method;
    .locals 5

    .line 1
    const-string p0, "onCreate"

    .line 2
    .line 3
    const-string v0, "attachBaseContext"

    .line 4
    .line 5
    const-class v1, Landroid/content/Context;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    :try_start_0
    iget-object v3, p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->appInfo:Landroid/content/pm/ApplicationInfo;

    .line 9
    .line 10
    iget-object v3, v3, Landroid/content/pm/ApplicationInfo;->name:Ljava/lang/String;

    .line 11
    .line 12
    iget-object p1, p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

    .line 13
    .line 14
    invoke-virtual {p1, v3}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    :try_start_1
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {p1, v0, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 23
    .line 24
    .line 25
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    return-object p0

    .line 27
    :catchall_0
    :try_start_2
    invoke-virtual {p1, p0, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 28
    .line 29
    .line 30
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 31
    goto :goto_0

    .line 32
    :catchall_1
    :try_start_3
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-virtual {v3, v0, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 41
    .line 42
    .line 43
    move-result-object p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 44
    goto :goto_0

    .line 45
    :catchall_2
    :try_start_4
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p1, p0, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 50
    .line 51
    .line 52
    move-result-object p0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 53
    :goto_0
    return-object p0

    .line 54
    :catch_0
    :try_start_5
    const-class p0, Landroid/content/ContextWrapper;

    .line 55
    .line 56
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p0, v0, p1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 61
    .line 62
    .line 63
    move-result-object v2
    :try_end_5
    .catch Ljava/lang/NoSuchMethodException; {:try_start_5 .. :try_end_5} :catch_1

    .line 64
    :catch_1
    return-object v2
.end method

.method private final injectOnce(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 4

    .line 1
    const-string v0, " Loading Time "

    .line 2
    .line 3
    iget-object v1, p0, Ltop/suzhelan/qstory/hook/InjectHook;->isInject:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v2, "[QStory] "

    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object v3, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->method:Ljava/lang/reflect/Member;

    .line 21
    .line 22
    invoke-interface {v3}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v3, " startLoad"

    .line 30
    .line 31
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-static {v1}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    new-instance v1, Ltop/linl/dexparser/util/Utils$MTimer;

    .line 42
    .line 43
    invoke-direct {v1}, Ltop/linl/dexparser/util/Utils$MTimer;-><init>()V

    .line 44
    .line 45
    .line 46
    :try_start_0
    iget-object v3, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    check-cast v3, Landroid/content/ContextWrapper;

    .line 52
    .line 53
    iget-object p0, p0, Ltop/suzhelan/qstory/hook/InjectHook;->hookEnter:L飘花落叶言苏世哲子楪兰/飘花落叶言子楪世苏哲兰;

    .line 54
    .line 55
    invoke-virtual {v3}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-static {v3}, L飘花落叶言苏世哲子楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    .line 67
    .line 68
    new-instance p0, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    :goto_0
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->method:Ljava/lang/reflect/Member;

    .line 74
    .line 75
    invoke-interface {p1}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1}, Ltop/linl/dexparser/util/Utils$MTimer;->get()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-static {p0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :catchall_0
    move-exception p0

    .line 101
    :try_start_1
    invoke-static {p0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 102
    .line 103
    .line 104
    new-instance p0, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :catchall_1
    move-exception p0

    .line 111
    new-instance v3, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->method:Ljava/lang/reflect/Member;

    .line 117
    .line 118
    invoke-interface {p1}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1}, Ltop/linl/dexparser/util/Utils$MTimer;->get()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-static {p1}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    throw p0
.end method


# virtual methods
.method public handleLoadPackage(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 6

    .line 1
    const-string v0, "com.tencent.mobileqq"

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    :try_start_0
    iget-object v2, p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->packageName:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v3, p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->processName:Ljava/lang/String;

    .line 10
    .line 11
    iget-boolean v4, p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->isFirstApplication:Z

    .line 12
    .line 13
    if-nez v4, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    if-nez v4, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    invoke-static {}, L飘花落叶言苏哲楪兰子世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰()V

    .line 24
    .line 25
    .line 26
    iget-object v4, p0, Ltop/suzhelan/qstory/hook/InjectHook;->hookEnter:L飘花落叶言苏世哲子楪兰/飘花落叶言子楪世苏哲兰;

    .line 27
    .line 28
    iget-object v5, p0, Ltop/suzhelan/qstory/hook/InjectHook;->startupParam:Lde/robv/android/xposed/IXposedHookZygoteInit$StartupParam;

    .line 29
    .line 30
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget-object v5, v5, Lde/robv/android/xposed/IXposedHookZygoteInit$StartupParam;->modulePath:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    const/16 v4, 0x669

    .line 42
    .line 43
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    sput-object v5, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v4, p0, Ltop/suzhelan/qstory/hook/InjectHook;->startupParam:Lde/robv/android/xposed/IXposedHookZygoteInit$StartupParam;

    .line 49
    .line 50
    iget-object v4, v4, Lde/robv/android/xposed/IXposedHookZygoteInit$StartupParam;->modulePath:Ljava/lang/String;

    .line 51
    .line 52
    sput-object v4, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 53
    .line 54
    const-string v4, "com.tencent.mobileqq:MSF"

    .line 55
    .line 56
    filled-new-array {v0, v4}, [Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-static {v0}, Lkotlin/collections/飘花落叶言子楪哲世苏兰;->飘花落叶言子苏兰楪世哲([Ljava/lang/Object;)Ljava/util/Set;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    sput-object v2, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 65
    .line 66
    sput-object v3, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 67
    .line 68
    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-nez v0, :cond_2

    .line 73
    .line 74
    :goto_0
    return-void

    .line 75
    :cond_2
    iget-object v0, p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->appInfo:Landroid/content/pm/ApplicationInfo;

    .line 76
    .line 77
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 78
    .line 79
    invoke-direct {p0, p1}, Ltop/suzhelan/qstory/hook/InjectHook;->getApplicationCreateMethod(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)Ljava/lang/reflect/Method;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    if-eqz v0, :cond_3

    .line 84
    .line 85
    new-instance v2, L飘花落叶言苏世哲子楪兰/飘花落叶言子楪世苏兰哲;

    .line 86
    .line 87
    const/4 v3, 0x0

    .line 88
    invoke-direct {v2, p0, v3}, L飘花落叶言苏世哲子楪兰/飘花落叶言子楪世苏兰哲;-><init>(Ltop/suzhelan/qstory/hook/InjectHook;I)V

    .line 89
    .line 90
    .line 91
    invoke-static {v0, v2}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :catchall_0
    move-exception p0

    .line 96
    goto :goto_2

    .line 97
    :cond_3
    :goto_1
    iget-object p1, p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

    .line 98
    .line 99
    const-string v0, "com.tencent.common.app.BaseApplicationImpl"

    .line 100
    .line 101
    invoke-virtual {p1, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    const-string v0, "onCreate"

    .line 106
    .line 107
    new-instance v2, L飘花落叶言苏世哲子楪兰/飘花落叶言子楪世苏兰哲;

    .line 108
    .line 109
    invoke-direct {v2, p0, v1}, L飘花落叶言苏世哲子楪兰/飘花落叶言子楪世苏兰哲;-><init>(Ltop/suzhelan/qstory/hook/InjectHook;I)V

    .line 110
    .line 111
    .line 112
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-static {p1, v0, p0}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :goto_2
    sget-object p1, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 121
    .line 122
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    const-string v0, "init"

    .line 127
    .line 128
    invoke-static {v0, p1, p0, v1}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 129
    .line 130
    .line 131
    invoke-static {p0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/Throwable;)V

    .line 132
    .line 133
    .line 134
    return-void
.end method

.method public initZygote(Lde/robv/android/xposed/IXposedHookZygoteInit$StartupParam;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ltop/suzhelan/qstory/hook/InjectHook;->startupParam:Lde/robv/android/xposed/IXposedHookZygoteInit$StartupParam;

    .line 5
    .line 6
    return-void
.end method
