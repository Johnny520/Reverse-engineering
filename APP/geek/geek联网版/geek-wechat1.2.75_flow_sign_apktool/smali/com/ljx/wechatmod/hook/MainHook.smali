.class public final Lcom/ljx/wechatmod/hook/MainHook;
.super Ljava/lang/Object;

# interfaces
.implements Lde/robv/android/xposed/IXposedHookLoadPackage;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public handleLoadPackage(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 3

    .line 1
    const-string v0, "xiujhaRTbQ==\n"

    .line 2
    .line 3
    const-string v1, "qlvT5NYyAMg=\n"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0, p1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->packageName:Ljava/lang/String;

    .line 13
    .line 14
    const-string v1, "bFC4DR4+Fpd4WrZLEyAD1ms=\n"

    .line 15
    .line 16
    const-string v2, "Dz/VI3JUbrk=\n"

    .line 17
    .line 18
    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v0, v1}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    const-string v0, "W9coJnX65WtP3SZgeOTwKlyWMGE33fwsVvkmfHDm9DFB\n"

    .line 29
    .line 30
    const-string v1, "OLhFCBmQnUU=\n"

    .line 31
    .line 32
    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget-object p1, p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

    .line 37
    .line 38
    const-string v1, "UQ4iZJqbq915HhtiiIs=\n"

    .line 39
    .line 40
    const-string v2, "OH1vC/7ux7g=\n"

    .line 41
    .line 42
    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    new-instance v2, Lqs;

    .line 47
    .line 48
    invoke-direct {v2}, Lde/robv/android/xposed/XC_MethodReplacement;-><init>()V

    .line 49
    .line 50
    .line 51
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-static {v0, p1, v1, v2}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_0
    iget-object v0, p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->packageName:Ljava/lang/String;

    .line 60
    .line 61
    const-string v1, "lV7kFvv568aTX/0W4vE=\n"

    .line 62
    .line 63
    const-string v2, "9jGJOI+chaU=\n"

    .line 64
    .line 65
    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-static {v0, v1}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_1

    .line 74
    .line 75
    return-void

    .line 76
    :cond_1
    const-string v0, "4yEhBvXUIGA=\n"

    .line 77
    .line 78
    const-string v1, "jE9idJC1VAU=\n"

    .line 79
    .line 80
    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    new-instance v1, Ljs;

    .line 85
    .line 86
    const/4 v2, 0x4

    .line 87
    invoke-direct {v1, v2, p1}, Ljs;-><init>(ILjava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    const-class v1, Landroid/app/Application;

    .line 95
    .line 96
    invoke-static {v1, v0, p1}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 97
    .line 98
    .line 99
    return-void
.end method
