.class public final Lc0/b;
.super Lde/robv/android/xposed/XC_MethodReplacement;
.source "SourceFile"


# instance fields
.field public a:Lde/robv/android/xposed/XC_MethodReplacement;


# virtual methods
.method public final replaceHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)Ljava/lang/Object;
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lc0/b;->a:Lde/robv/android/xposed/XC_MethodReplacement;

    .line 2
    .line 3
    const-string v1, "replaceHookedMethod"

    .line 4
    .line 5
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-static {v0, v1, v2}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    return-object p1

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    sget-object v1, Lc0/f;->a:LH/a;

    .line 16
    .line 17
    iget-object v1, v1, LH/a;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, LA0/a;

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {v1, v0}, LA0/a;->d(Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->method:Ljava/lang/reflect/Member;

    .line 28
    .line 29
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 30
    .line 31
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {v0, v1, p1}, Lde/robv/android/xposed/XposedBridge;->invokeOriginalMethod(Ljava/lang/reflect/Member;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1
.end method
