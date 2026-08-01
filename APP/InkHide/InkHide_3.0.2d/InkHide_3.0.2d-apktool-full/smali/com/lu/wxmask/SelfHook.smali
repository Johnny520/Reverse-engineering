.class public Lcom/lu/wxmask/SelfHook;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le0/a;


# annotations
.annotation build Lc/a;
.end annotation


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

.method public static getInstance()Lcom/lu/wxmask/SelfHook;
    .locals 1

    .line 1
    sget-object v0, Lm0/i;->a:Lcom/lu/wxmask/SelfHook;

    .line 2
    .line 3
    return-object v0
.end method

.method private handleDebugHook(Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 1

    .line 1
    const-string p1, "android.app.Activity"

    .line 2
    .line 3
    invoke-static {p1}, Lm0/c;->a(Ljava/lang/String;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance p2, Lm0/g;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-direct {p2, v0}, Lm0/g;-><init>(I)V

    .line 11
    .line 12
    .line 13
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    const-string v0, "onResume"

    .line 18
    .line 19
    invoke-static {p1, v0, p2}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 20
    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public handleHook(Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 2

    .line 1
    const-class p1, Lcom/lu/wxmask/SelfHook;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p2, p2, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

    .line 8
    .line 9
    new-instance v0, Lm0/g;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {v0, v1}, Lm0/g;-><init>(I)V

    .line 13
    .line 14
    .line 15
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "isModuleEnable"

    .line 20
    .line 21
    invoke-static {p1, p2, v1, v0}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public isModuleEnable()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic onCreate()V
    .locals 0

    .line 1
    return-void
.end method
