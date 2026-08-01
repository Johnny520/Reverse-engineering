.class public final Lc0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld0/b;


# direct methods
.method public static o(Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook;
    .locals 2

    .line 1
    instance-of v0, p0, Lde/robv/android/xposed/XC_MethodReplacement;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lc0/b;

    .line 6
    .line 7
    check-cast p0, Lde/robv/android/xposed/XC_MethodReplacement;

    .line 8
    .line 9
    iget v1, p0, Lde/robv/android/xposed/XC_MethodReplacement;->priority:I

    .line 10
    .line 11
    invoke-direct {v0, v1}, Lde/robv/android/xposed/XC_MethodReplacement;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iput-object p0, v0, Lc0/b;->a:Lde/robv/android/xposed/XC_MethodReplacement;

    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    new-instance v0, Lr0/q1;

    .line 18
    .line 19
    invoke-direct {v0, p0}, Lr0/q1;-><init>(Lde/robv/android/xposed/XC_MethodHook;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public static varargs p([Ljava/lang/Object;)V
    .locals 3

    .line 1
    array-length v0, p0

    .line 2
    add-int/lit8 v0, v0, -0x1

    .line 3
    .line 4
    aget-object v1, p0, v0

    .line 5
    .line 6
    instance-of v2, v1, Lde/robv/android/xposed/XC_MethodHook;

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    check-cast v1, Lde/robv/android/xposed/XC_MethodHook;

    .line 11
    .line 12
    invoke-static {v1}, Lc0/c;->o(Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    aput-object v1, p0, v0

    .line 17
    .line 18
    :cond_0
    return-void
.end method


# virtual methods
.method public final varargs a(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;
    .locals 0

    .line 1
    invoke-static {p1, p2, p3, p4}, Lde/robv/android/xposed/XposedHelpers;->findMethodExactIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final varargs b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;
    .locals 0

    .line 1
    invoke-static {p1, p2, p3}, Lde/robv/android/xposed/XposedHelpers;->findMethodExactIfExists(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final varargs c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p1, p2, p3}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final d(Ljava/lang/Class;Ld0/c;)[Ljava/lang/reflect/Method;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/LinkedList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_1

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    array-length v1, p1

    .line 13
    const/4 v2, 0x0

    .line 14
    :goto_0
    if-ge v2, v1, :cond_1

    .line 15
    .line 16
    aget-object v3, p1, v2

    .line 17
    .line 18
    invoke-interface {p2, v3}, Ld0/c;->a(Ljava/lang/reflect/AccessibleObject;)Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-eqz v4, :cond_0

    .line 23
    .line 24
    const/4 v4, 0x1

    .line 25
    invoke-virtual {v3, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    new-array p1, p1, [Ljava/lang/reflect/Method;

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, [Ljava/lang/reflect/Method;

    .line 45
    .line 46
    return-object p1
.end method

.method public final e(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    .locals 0

    .line 1
    invoke-static {p2}, Lc0/c;->o(Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-static {p1, p2}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final varargs g(Ljava/lang/Class;Ljava/lang/Class;[Ljava/lang/Class;)[Ljava/lang/reflect/Method;
    .locals 0

    .line 1
    invoke-static {p1, p2, p3}, Lde/robv/android/xposed/XposedHelpers;->findMethodsByExactParameters(Ljava/lang/Class;Ljava/lang/Class;[Ljava/lang/Class;)[Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final varargs h(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    .locals 0

    .line 1
    invoke-static {p3}, Lc0/c;->p([Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p1, p2, p3}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    return-object p1
.end method

.method public final i(Ljava/lang/Class;Ld0/c;)[Ljava/lang/reflect/Field;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/LinkedList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    array-length v1, p1

    .line 11
    const/4 v2, 0x0

    .line 12
    :goto_0
    if-ge v2, v1, :cond_1

    .line 13
    .line 14
    aget-object v3, p1, v2

    .line 15
    .line 16
    invoke-interface {p2, v3}, Ld0/c;->a(Ljava/lang/reflect/AccessibleObject;)Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    if-eqz v4, :cond_0

    .line 21
    .line 22
    const/4 v4, 0x1

    .line 23
    invoke-virtual {v3, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    new-array p1, p1, [Ljava/lang/reflect/Field;

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    check-cast p1, [Ljava/lang/reflect/Field;

    .line 43
    .line 44
    return-object p1
.end method

.method public final j(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final k(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Field;
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lde/robv/android/xposed/XposedHelpers;->findFirstFieldByExactType(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;
    .locals 0

    .line 1
    invoke-static {p2, p1}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final m(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1, p3, p2}, Lde/robv/android/xposed/XposedHelpers;->setObjectField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final varargs n(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    .locals 0

    .line 1
    invoke-static {p4}, Lc0/c;->p([Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p1, p2, p3, p4}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    return-object p1
.end method
