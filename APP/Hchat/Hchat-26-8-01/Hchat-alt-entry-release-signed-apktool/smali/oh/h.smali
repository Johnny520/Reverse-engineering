.class public abstract Loh/h;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static a:Loh/g; = null

.field public static b:Z = false


# direct methods
.method public static final A(III)I
    .locals 1

    .line 1
    if-lez p2, :cond_4

    .line 2
    .line 3
    if-lt p0, p1, :cond_0

    .line 4
    .line 5
    goto :goto_3

    .line 6
    :cond_0
    rem-int v0, p1, p2

    .line 7
    .line 8
    if-ltz v0, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    add-int/2addr v0, p2

    .line 12
    :goto_0
    rem-int/2addr p0, p2

    .line 13
    if-ltz p0, :cond_2

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_2
    add-int/2addr p0, p2

    .line 17
    :goto_1
    sub-int/2addr v0, p0

    .line 18
    rem-int/2addr v0, p2

    .line 19
    if-ltz v0, :cond_3

    .line 20
    .line 21
    goto :goto_2

    .line 22
    :cond_3
    add-int/2addr v0, p2

    .line 23
    :goto_2
    sub-int/2addr p1, v0

    .line 24
    return p1

    .line 25
    :cond_4
    if-gez p2, :cond_9

    .line 26
    .line 27
    if-gt p0, p1, :cond_5

    .line 28
    .line 29
    :goto_3
    return p1

    .line 30
    :cond_5
    neg-int p2, p2

    .line 31
    rem-int/2addr p0, p2

    .line 32
    if-ltz p0, :cond_6

    .line 33
    .line 34
    goto :goto_4

    .line 35
    :cond_6
    add-int/2addr p0, p2

    .line 36
    :goto_4
    rem-int v0, p1, p2

    .line 37
    .line 38
    if-ltz v0, :cond_7

    .line 39
    .line 40
    goto :goto_5

    .line 41
    :cond_7
    add-int/2addr v0, p2

    .line 42
    :goto_5
    sub-int/2addr p0, v0

    .line 43
    rem-int/2addr p0, p2

    .line 44
    if-ltz p0, :cond_8

    .line 45
    .line 46
    goto :goto_6

    .line 47
    :cond_8
    add-int/2addr p0, p2

    .line 48
    :goto_6
    add-int/2addr p0, p1

    .line 49
    return p0

    .line 50
    :cond_9
    const-string p0, "Step is zero."

    .line 51
    .line 52
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    return p0
.end method

.method public static B(Ljava/lang/reflect/Method;Ljava/lang/ClassLoader;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    move-object p1, v0

    .line 12
    :cond_0
    invoke-static {p1}, Loh/h;->M(Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-class v0, Lmb/a;

    .line 17
    .line 18
    monitor-enter v0

    .line 19
    :try_start_0
    sget-object v1, Lmb/a;->f:Ljava/util/HashSet;

    .line 20
    .line 21
    invoke-virtual {v1, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    monitor-exit v0

    .line 28
    return-void

    .line 29
    :cond_1
    :try_start_1
    sget-object v2, Lr8/i;->b:Lr8/i;

    .line 30
    .line 31
    new-instance v3, Lba/f;

    .line 32
    .line 33
    const/16 v4, 0x12

    .line 34
    .line 35
    invoke-direct {v3, v4}, Lba/f;-><init>(I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, p0, v3}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    .line 43
    .line 44
    monitor-exit v0

    .line 45
    return-void

    .line 46
    :catchall_0
    move-exception p0

    .line 47
    monitor-exit v0

    .line 48
    throw p0
.end method

.method public static C(Ljava/lang/reflect/Method;Ljava/lang/ClassLoader;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    move-object p1, v0

    .line 12
    :cond_0
    invoke-static {p1}, Loh/h;->M(Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-class v0, Lmb/a;

    .line 17
    .line 18
    monitor-enter v0

    .line 19
    :try_start_0
    sget-object v1, Lmb/a;->e:Ljava/util/HashSet;

    .line 20
    .line 21
    invoke-virtual {v1, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    monitor-exit v0

    .line 28
    return-void

    .line 29
    :cond_1
    :try_start_1
    sget-object v2, Lr8/i;->b:Lr8/i;

    .line 30
    .line 31
    new-instance v3, Lba/f;

    .line 32
    .line 33
    const/16 v4, 0x13

    .line 34
    .line 35
    invoke-direct {v3, v4}, Lba/f;-><init>(I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, p0, v3}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    .line 43
    .line 44
    monitor-exit v0

    .line 45
    return-void

    .line 46
    :catchall_0
    move-exception p0

    .line 47
    monitor-exit v0

    .line 48
    throw p0
.end method

.method public static D(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Landroid/content/Context;)V
    .locals 8

    .line 1
    if-eqz p2, :cond_5

    .line 2
    .line 3
    if-eqz p1, :cond_5

    .line 4
    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    invoke-static {p2}, Loh/h;->F(Landroid/content/Context;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    const-string v0, "Hchat_wechat_tablet_cache"

    .line 16
    .line 17
    invoke-static {p2, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-static {p2, p1}, Loh/h;->m(Landroid/content/Context;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-static {p1}, Loh/h;->H(Ljava/lang/ClassLoader;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    move-object v4, p0

    .line 33
    move-object v5, p1

    .line 34
    move-object p0, v1

    .line 35
    move-object v1, p2

    .line 36
    goto :goto_0

    .line 37
    :cond_2
    const-string v1, "Lenovo TB-9707F"

    .line 38
    .line 39
    filled-new-array {v1}, [Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    const-string v6, "pad_method"

    .line 44
    .line 45
    move-object v4, p0

    .line 46
    move-object v5, p1

    .line 47
    move-object v1, p2

    .line 48
    invoke-static/range {v1 .. v7}, Loh/h;->x(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    :goto_0
    if-nez v0, :cond_3

    .line 53
    .line 54
    if-nez p0, :cond_3

    .line 55
    .line 56
    const-string p0, "[Hchat:Tablet] \u5b89\u88c5\u5931\u8d25: \u672a\u5b9a\u4f4d\u5e73\u677f\u68c0\u6d4b\u65b9\u6cd5"

    .line 57
    .line 58
    invoke-static {p0}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_3
    if-eqz p0, :cond_4

    .line 63
    .line 64
    invoke-static {p0, v5}, Loh/h;->C(Ljava/lang/reflect/Method;Ljava/lang/ClassLoader;)V

    .line 65
    .line 66
    .line 67
    :cond_4
    invoke-static {v5}, Loh/h;->G(Ljava/lang/ClassLoader;)Z

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    if-nez p0, :cond_5

    .line 72
    .line 73
    const-string p0, "loginAsOtherDeviceBtn"

    .line 74
    .line 75
    filled-new-array {p0}, [Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    const-string v6, "login_button_method"

    .line 80
    .line 81
    invoke-static/range {v1 .. v7}, Loh/h;->x(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    if-eqz p0, :cond_5

    .line 86
    .line 87
    invoke-static {p0, v5}, Loh/h;->B(Ljava/lang/reflect/Method;Ljava/lang/ClassLoader;)V

    .line 88
    .line 89
    .line 90
    const-string p1, "login_button_method"

    .line 91
    .line 92
    invoke-static {v2, v3, p1, p0}, Loh/h;->R(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 93
    .line 94
    .line 95
    :cond_5
    :goto_1
    return-void
.end method

.method public static E(Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v0, 0x0

    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lud/a;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Lud/a;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    invoke-virtual {p1, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lud/a;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    if-eqz v0, :cond_2

    .line 39
    .line 40
    :goto_1
    const/4 p0, 0x1

    .line 41
    return p0

    .line 42
    :cond_2
    const/4 p0, 0x0

    .line 43
    return p0
.end method

.method public static F(Landroid/content/Context;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const-string v1, "Hchat_wechat_tablet_config"

    .line 6
    .line 7
    invoke-static {p0, v1}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v1, "tablet_enable"

    .line 12
    .line 13
    invoke-interface {p0, v1, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public static G(Ljava/lang/ClassLoader;)Z
    .locals 2

    .line 1
    const-class v0, Lmb/a;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lmb/a;->f:Ljava/util/HashSet;

    .line 5
    .line 6
    invoke-static {p0}, Loh/h;->M(Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {v1, p0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    monitor-exit v0

    .line 15
    return p0

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    monitor-exit v0

    .line 18
    throw p0
.end method

.method public static H(Ljava/lang/ClassLoader;)Z
    .locals 2

    .line 1
    const-class v0, Lmb/a;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lmb/a;->e:Ljava/util/HashSet;

    .line 5
    .line 6
    invoke-static {p0}, Loh/h;->M(Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {v1, p0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    monitor-exit v0

    .line 15
    return p0

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    monitor-exit v0

    .line 18
    throw p0
.end method

.method public static I(Ljava/util/ArrayList;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x4

    .line 6
    const/4 v2, 0x0

    .line 7
    if-ge v0, v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lnc/a;

    .line 15
    .line 16
    iget-object v0, v0, Lnc/a;->h:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lqc/d;

    .line 19
    .line 20
    invoke-virtual {v0}, Lqc/d;->b()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/4 v3, 0x5

    .line 25
    if-eq v1, v3, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    invoke-virtual {v0}, Lqc/d;->a()Ljf/h;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget-object v1, v0, Ljf/h;->b:Ljava/lang/String;

    .line 33
    .line 34
    const-string v3, "makeConcatWithConstants"

    .line 35
    .line 36
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-nez v1, :cond_2

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    iget-object v0, v0, Ljf/h;->c:Ljava/lang/String;

    .line 44
    .line 45
    const-string v1, "Ljava/lang/invoke/StringConcatFactory;"

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_3

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    const/4 v0, 0x1

    .line 55
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    check-cast v1, Lnc/a;

    .line 60
    .line 61
    iget-object v1, v1, Lnc/a;->h:Ljava/lang/Object;

    .line 62
    .line 63
    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-nez v1, :cond_4

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_4
    const/4 v1, 0x3

    .line 71
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    check-cast p0, Lnc/a;

    .line 76
    .line 77
    iget p0, p0, Lnc/a;->g:I

    .line 78
    .line 79
    const/16 v1, 0xa

    .line 80
    .line 81
    if-eq p0, v1, :cond_5

    .line 82
    .line 83
    :goto_0
    return v2

    .line 84
    :cond_5
    return v0
.end method

.method public static J(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_4

    .line 3
    .line 4
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_4

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    new-array v1, v1, [C

    .line 16
    .line 17
    fill-array-data v1, :array_0

    .line 18
    .line 19
    .line 20
    invoke-static {p0, v1}, Log/m;->S0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    if-eqz p0, :cond_4

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-lez v1, :cond_0

    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v1, 0x0

    .line 35
    :goto_0
    if-eqz v1, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move-object p0, v0

    .line 39
    :goto_1
    if-eqz p0, :cond_4

    .line 40
    .line 41
    invoke-static {p0}, Log/t;->g0(Ljava/lang/String;)Ljava/lang/Long;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 48
    .line 49
    .line 50
    move-result-wide v1

    .line 51
    invoke-static {v1, v2}, Ljava/lang/Long;->toUnsignedString(J)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    return-object v1

    .line 58
    :cond_2
    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseUnsignedLong(Ljava/lang/String;)J

    .line 59
    .line 60
    .line 61
    move-result-wide v1

    .line 62
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 63
    .line 64
    .line 65
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    goto :goto_2

    .line 67
    :catchall_0
    move-exception p0

    .line 68
    new-instance v1, Lsf/f;

    .line 69
    .line 70
    invoke-direct {v1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    move-object p0, v1

    .line 74
    :goto_2
    nop

    .line 75
    instance-of v1, p0, Lsf/f;

    .line 76
    .line 77
    if-eqz v1, :cond_3

    .line 78
    .line 79
    move-object p0, v0

    .line 80
    :cond_3
    check-cast p0, Ljava/lang/Long;

    .line 81
    .line 82
    if-eqz p0, :cond_4

    .line 83
    .line 84
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 85
    .line 86
    .line 87
    move-result-wide v0

    .line 88
    invoke-static {v0, v1}, Ljava/lang/Long;->toUnsignedString(J)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    :cond_4
    return-object v0

    .line 93
    :array_0
    .array-data 2
        0x27s
        0x22s
    .end array-data
.end method

.method public static K(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto :goto_4

    .line 9
    :cond_0
    const-string v0, "cache_key"

    .line 10
    .line 11
    const-string v2, ""

    .line 12
    .line 13
    invoke-interface {p0, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_1

    .line 22
    .line 23
    goto :goto_4

    .line 24
    :cond_1
    invoke-interface {p0, p3, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    if-eqz p0, :cond_5

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-lez p1, :cond_2

    .line 35
    .line 36
    const/4 p1, 0x1

    .line 37
    goto :goto_0

    .line 38
    :cond_2
    const/4 p1, 0x0

    .line 39
    :goto_0
    if-eqz p1, :cond_3

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_3
    move-object p0, v1

    .line 43
    :goto_1
    if-eqz p0, :cond_5

    .line 44
    .line 45
    :try_start_0
    new-instance p1, Llh/d;

    .line 46
    .line 47
    invoke-direct {p1, p0}, Llh/d;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, p2}, Llh/d;->b(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 51
    .line 52
    .line 53
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    goto :goto_2

    .line 55
    :catchall_0
    move-exception p0

    .line 56
    new-instance p1, Lsf/f;

    .line 57
    .line 58
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    move-object p0, p1

    .line 62
    :goto_2
    nop

    .line 63
    instance-of p1, p0, Lsf/f;

    .line 64
    .line 65
    if-eqz p1, :cond_4

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_4
    move-object v1, p0

    .line 69
    :goto_3
    check-cast v1, Ljava/lang/reflect/Method;

    .line 70
    .line 71
    :cond_5
    :goto_4
    return-object v1
.end method

.method public static L(Landroid/content/Context;)Ljava/util/List;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "plugin_agent"

    .line 4
    .line 5
    const-string v2, "activity"

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const-string v3, "floating_shortcut_menu"

    .line 11
    .line 12
    invoke-static {v0, v3}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    const-string v4, "enable"

    .line 17
    .line 18
    const-string v5, "legacy_agent_settings_migrated_v1"

    .line 19
    .line 20
    const/4 v6, 0x0

    .line 21
    invoke-interface {v3, v5, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 22
    .line 23
    .line 24
    move-result v7

    .line 25
    const/4 v8, 0x1

    .line 26
    if-eqz v7, :cond_0

    .line 27
    .line 28
    goto/16 :goto_3

    .line 29
    .line 30
    :cond_0
    const-string v7, "agent_floating_window"

    .line 31
    .line 32
    invoke-static {v0, v7}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 33
    .line 34
    .line 35
    move-result-object v7

    .line 36
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 37
    .line 38
    .line 39
    move-result-object v9

    .line 40
    :try_start_0
    invoke-interface {v7, v4, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 45
    .line 46
    .line 47
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception v0

    .line 50
    new-instance v10, Lsf/f;

    .line 51
    .line 52
    invoke-direct {v10, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    move-object v0, v10

    .line 56
    :goto_0
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 57
    .line 58
    instance-of v11, v0, Lsf/f;

    .line 59
    .line 60
    if-eqz v11, :cond_1

    .line 61
    .line 62
    move-object v0, v10

    .line 63
    :cond_1
    check-cast v0, Ljava/lang/Boolean;

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_2

    .line 70
    .line 71
    invoke-interface {v3, v4}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-nez v0, :cond_2

    .line 76
    .line 77
    invoke-interface {v9, v4, v8}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 78
    .line 79
    .line 80
    const-string v0, "scope"

    .line 81
    .line 82
    invoke-interface {v3, v0}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    if-nez v4, :cond_2

    .line 87
    .line 88
    const-string v4, "all"

    .line 89
    .line 90
    invoke-interface {v9, v0, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 91
    .line 92
    .line 93
    :cond_2
    const-string v4, "position_x"

    .line 94
    .line 95
    invoke-interface {v7, v4}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    const/4 v10, 0x0

    .line 100
    const/high16 v11, 0x3f800000    # 1.0f

    .line 101
    .line 102
    if-eqz v0, :cond_4

    .line 103
    .line 104
    invoke-interface {v3, v4}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-nez v0, :cond_4

    .line 109
    .line 110
    :try_start_1
    invoke-interface {v7, v4, v11}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 115
    .line 116
    .line 117
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 118
    goto :goto_1

    .line 119
    :catchall_1
    move-exception v0

    .line 120
    new-instance v12, Lsf/f;

    .line 121
    .line 122
    invoke-direct {v12, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 123
    .line 124
    .line 125
    move-object v0, v12

    .line 126
    :goto_1
    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 127
    .line 128
    .line 129
    move-result-object v12

    .line 130
    instance-of v13, v0, Lsf/f;

    .line 131
    .line 132
    if-eqz v13, :cond_3

    .line 133
    .line 134
    move-object v0, v12

    .line 135
    :cond_3
    check-cast v0, Ljava/lang/Number;

    .line 136
    .line 137
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    invoke-static {v0, v10, v11}, Lr9/e0;->q(FFF)F

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    invoke-interface {v9, v4, v0}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    .line 146
    .line 147
    .line 148
    :cond_4
    const-string v4, "position_y"

    .line 149
    .line 150
    invoke-interface {v7, v4}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    if-eqz v0, :cond_6

    .line 155
    .line 156
    invoke-interface {v3, v4}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    if-nez v0, :cond_6

    .line 161
    .line 162
    const v12, 0x3eeb851f    # 0.46f

    .line 163
    .line 164
    .line 165
    :try_start_2
    invoke-interface {v7, v4, v12}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 170
    .line 171
    .line 172
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 173
    goto :goto_2

    .line 174
    :catchall_2
    move-exception v0

    .line 175
    new-instance v7, Lsf/f;

    .line 176
    .line 177
    invoke-direct {v7, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 178
    .line 179
    .line 180
    move-object v0, v7

    .line 181
    :goto_2
    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 182
    .line 183
    .line 184
    move-result-object v7

    .line 185
    instance-of v12, v0, Lsf/f;

    .line 186
    .line 187
    if-eqz v12, :cond_5

    .line 188
    .line 189
    move-object v0, v7

    .line 190
    :cond_5
    check-cast v0, Ljava/lang/Number;

    .line 191
    .line 192
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    invoke-static {v0, v10, v11}, Lr9/e0;->q(FFF)F

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    invoke-interface {v9, v4, v0}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    .line 201
    .line 202
    .line 203
    :cond_6
    invoke-interface {v9, v5, v8}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 208
    .line 209
    .line 210
    :goto_3
    const/4 v0, 0x0

    .line 211
    const-string v4, "items"

    .line 212
    .line 213
    invoke-interface {v3, v4, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    const-string v5, "agent_item_migrated_v1"

    .line 218
    .line 219
    if-eqz v0, :cond_14

    .line 220
    .line 221
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 222
    .line 223
    .line 224
    move-result v7

    .line 225
    if-eqz v7, :cond_7

    .line 226
    .line 227
    goto/16 :goto_c

    .line 228
    .line 229
    :cond_7
    :try_start_3
    new-instance v7, Lorg/json/JSONArray;

    .line 230
    .line 231
    invoke-direct {v7, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    invoke-static {}, La/a;->E()Luf/c;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-virtual {v7}, Lorg/json/JSONArray;->length()I

    .line 239
    .line 240
    .line 241
    move-result v9

    .line 242
    move v10, v6

    .line 243
    :goto_4
    if-lt v10, v9, :cond_8

    .line 244
    .line 245
    invoke-static {v0}, La/a;->t(Luf/c;)Luf/c;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    goto/16 :goto_9

    .line 250
    .line 251
    :catchall_3
    move-exception v0

    .line 252
    goto/16 :goto_8

    .line 253
    .line 254
    :cond_8
    invoke-virtual {v7, v10}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 255
    .line 256
    .line 257
    move-result-object v11

    .line 258
    if-eqz v11, :cond_e

    .line 259
    .line 260
    const-string v12, "id"

    .line 261
    .line 262
    invoke-virtual {v11, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v12

    .line 266
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    invoke-static {v12}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 270
    .line 271
    .line 272
    move-result-object v12

    .line 273
    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v14

    .line 277
    const-string v12, "title"

    .line 278
    .line 279
    invoke-virtual {v11, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v12

    .line 283
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 284
    .line 285
    .line 286
    invoke-static {v12}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 287
    .line 288
    .line 289
    move-result-object v12

    .line 290
    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v15

    .line 294
    const-string v12, "actionType"

    .line 295
    .line 296
    invoke-virtual {v11, v12, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v12

    .line 300
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    invoke-static {v12}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 304
    .line 305
    .line 306
    move-result-object v12

    .line 307
    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v12

    .line 311
    invoke-static {v12, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    move-result v13

    .line 315
    if-eqz v13, :cond_9

    .line 316
    .line 317
    const-string v13, "target"

    .line 318
    .line 319
    invoke-virtual {v11, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v13

    .line 323
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 324
    .line 325
    .line 326
    invoke-static {v13}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 327
    .line 328
    .line 329
    move-result-object v13

    .line 330
    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v13

    .line 334
    :goto_5
    move-object/from16 v17, v13

    .line 335
    .line 336
    goto :goto_6

    .line 337
    :cond_9
    const-string v13, ""

    .line 338
    .line 339
    goto :goto_5

    .line 340
    :goto_6
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    .line 341
    .line 342
    .line 343
    move-result v13

    .line 344
    if-nez v13, :cond_a

    .line 345
    .line 346
    goto :goto_7

    .line 347
    :cond_a
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 348
    .line 349
    .line 350
    move-result v13

    .line 351
    if-nez v13, :cond_b

    .line 352
    .line 353
    goto :goto_7

    .line 354
    :cond_b
    invoke-static {v12, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    move-result v13

    .line 358
    if-nez v13, :cond_c

    .line 359
    .line 360
    const-string v13, "module_settings"

    .line 361
    .line 362
    invoke-static {v12, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    move-result v13

    .line 366
    if-nez v13, :cond_c

    .line 367
    .line 368
    invoke-static {v12, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    move-result v13

    .line 372
    if-nez v13, :cond_c

    .line 373
    .line 374
    goto :goto_7

    .line 375
    :cond_c
    invoke-static {v12, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    move-result v13

    .line 379
    if-eqz v13, :cond_d

    .line 380
    .line 381
    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    .line 382
    .line 383
    .line 384
    move-result v13

    .line 385
    if-nez v13, :cond_d

    .line 386
    .line 387
    goto :goto_7

    .line 388
    :cond_d
    new-instance v13, Lk9/j;

    .line 389
    .line 390
    const-string v6, "iconPath"

    .line 391
    .line 392
    invoke-virtual {v11, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v6

    .line 396
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 397
    .line 398
    .line 399
    invoke-static {v6}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 400
    .line 401
    .line 402
    move-result-object v6

    .line 403
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v18

    .line 407
    const-string v6, "darkIconPath"

    .line 408
    .line 409
    invoke-virtual {v11, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v6

    .line 413
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 414
    .line 415
    .line 416
    invoke-static {v6}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 417
    .line 418
    .line 419
    move-result-object v6

    .line 420
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v19

    .line 424
    const-string v6, "enabled"

    .line 425
    .line 426
    invoke-virtual {v11, v6, v8}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 427
    .line 428
    .line 429
    move-result v20

    .line 430
    move-object/from16 v16, v12

    .line 431
    .line 432
    invoke-direct/range {v13 .. v20}, Lk9/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 433
    .line 434
    .line 435
    invoke-virtual {v0, v13}, Luf/c;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 436
    .line 437
    .line 438
    :cond_e
    :goto_7
    add-int/lit8 v10, v10, 0x1

    .line 439
    .line 440
    const/4 v6, 0x0

    .line 441
    goto/16 :goto_4

    .line 442
    .line 443
    :goto_8
    new-instance v2, Lsf/f;

    .line 444
    .line 445
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 446
    .line 447
    .line 448
    move-object v0, v2

    .line 449
    :goto_9
    invoke-static {}, Loh/h;->s()Ljava/util/List;

    .line 450
    .line 451
    .line 452
    move-result-object v2

    .line 453
    instance-of v6, v0, Lsf/f;

    .line 454
    .line 455
    if-eqz v6, :cond_f

    .line 456
    .line 457
    move-object v0, v2

    .line 458
    :cond_f
    check-cast v0, Ljava/util/List;

    .line 459
    .line 460
    const/4 v2, 0x0

    .line 461
    invoke-interface {v3, v5, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 462
    .line 463
    .line 464
    move-result v2

    .line 465
    if-eqz v2, :cond_10

    .line 466
    .line 467
    return-object v0

    .line 468
    :cond_10
    if-eqz v0, :cond_11

    .line 469
    .line 470
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 471
    .line 472
    .line 473
    move-result v2

    .line 474
    if-eqz v2, :cond_11

    .line 475
    .line 476
    goto :goto_a

    .line 477
    :cond_11
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 478
    .line 479
    .line 480
    move-result-object v2

    .line 481
    :cond_12
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 482
    .line 483
    .line 484
    move-result v6

    .line 485
    if-eqz v6, :cond_13

    .line 486
    .line 487
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object v6

    .line 491
    check-cast v6, Lk9/j;

    .line 492
    .line 493
    iget-object v6, v6, Lk9/j;->c:Ljava/lang/String;

    .line 494
    .line 495
    invoke-static {v6, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 496
    .line 497
    .line 498
    move-result v6

    .line 499
    if-eqz v6, :cond_12

    .line 500
    .line 501
    goto :goto_b

    .line 502
    :cond_13
    :goto_a
    new-instance v9, Lk9/j;

    .line 503
    .line 504
    const-string v14, ""

    .line 505
    .line 506
    const/16 v16, 0x1

    .line 507
    .line 508
    const-string v10, "plugin_agent"

    .line 509
    .line 510
    const-string v11, "\u63d2\u4ef6 Agent"

    .line 511
    .line 512
    const-string v12, "plugin_agent"

    .line 513
    .line 514
    const-string v13, ""

    .line 515
    .line 516
    move-object v15, v14

    .line 517
    invoke-direct/range {v9 .. v16}, Lk9/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 518
    .line 519
    .line 520
    invoke-static {v9}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 521
    .line 522
    .line 523
    move-result-object v1

    .line 524
    invoke-static {v1, v0}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    :goto_b
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 529
    .line 530
    .line 531
    move-result-object v1

    .line 532
    invoke-static {v0}, Loh/h;->w(Ljava/util/List;)Lorg/json/JSONArray;

    .line 533
    .line 534
    .line 535
    move-result-object v2

    .line 536
    invoke-virtual {v2}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v2

    .line 540
    invoke-interface {v1, v4, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 541
    .line 542
    .line 543
    move-result-object v1

    .line 544
    invoke-interface {v1, v5, v8}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 545
    .line 546
    .line 547
    move-result-object v1

    .line 548
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 549
    .line 550
    .line 551
    return-object v0

    .line 552
    :cond_14
    :goto_c
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 553
    .line 554
    .line 555
    move-result-object v0

    .line 556
    invoke-interface {v0, v5, v8}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 561
    .line 562
    .line 563
    invoke-static {}, Loh/h;->s()Ljava/util/List;

    .line 564
    .line 565
    .line 566
    move-result-object v0

    .line 567
    return-object v0
.end method

.method public static M(Ljava/lang/ClassLoader;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v0, ":"

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public static N(Lk5/u;II)La/a;
    .locals 1

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    new-instance p0, Ld6/f;

    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/4 p2, 0x0

    .line 15
    const-string v0, "Invalid reference type: %d"

    .line 16
    .line 17
    invoke-direct {p0, p2, v0, p1}, Ld6/f;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    throw p0

    .line 21
    :pswitch_0
    new-instance p1, Ln5/c;

    .line 22
    .line 23
    invoke-direct {p1, p0, p2}, Ln5/c;-><init>(Lk5/u;I)V

    .line 24
    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_1
    new-instance p1, Ln5/a;

    .line 28
    .line 29
    invoke-direct {p1, p0, p2}, Ln5/a;-><init>(Lk5/u;I)V

    .line 30
    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_2
    new-instance p1, Ln5/d;

    .line 34
    .line 35
    invoke-direct {p1, p0, p2}, Ln5/d;-><init>(Lk5/u;I)V

    .line 36
    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_3
    new-instance p1, Ln5/e;

    .line 40
    .line 41
    invoke-direct {p1, p0, p2}, Ln5/e;-><init>(Lk5/u;I)V

    .line 42
    .line 43
    .line 44
    return-object p1

    .line 45
    :pswitch_4
    new-instance p1, Ln5/b;

    .line 46
    .line 47
    invoke-direct {p1, p0, p2}, Ln5/b;-><init>(Lk5/u;I)V

    .line 48
    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_5
    new-instance p1, Ln5/g;

    .line 52
    .line 53
    invoke-direct {p1, p0, p2}, Ln5/g;-><init>(Lk5/u;I)V

    .line 54
    .line 55
    .line 56
    return-object p1

    .line 57
    :pswitch_6
    new-instance p1, Ln5/f;

    .line 58
    .line 59
    invoke-direct {p1, p0, p2}, Ln5/f;-><init>(Lk5/u;I)V

    .line 60
    .line 61
    .line 62
    return-object p1

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static O(Ljava/lang/String;)Ljava/util/Set;
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    :cond_0
    const/4 v0, 0x6

    .line 6
    new-array v1, v0, [C

    .line 7
    .line 8
    fill-array-data v1, :array_0

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v1, v0}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-static {p0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {v1, v0}, Lj8/b;->r(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_4

    .line 58
    .line 59
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    move-object v2, v1

    .line 64
    check-cast v2, Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-lez v2, :cond_3

    .line 71
    .line 72
    const/4 v2, 0x1

    .line 73
    goto :goto_2

    .line 74
    :cond_3
    const/4 v2, 0x0

    .line 75
    :goto_2
    if-eqz v2, :cond_2

    .line 76
    .line 77
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_4
    invoke-static {p0}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    nop

    .line 87
    :array_0
    .array-data 2
        0x2cs
        0x7cs
        0x3bs
        0xas
        -0xf4s
        -0xe5s
    .end array-data
.end method

.method public static P(Ljava/lang/String;Lud/p;Ljava/util/ArrayList;Lgf/a;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x4

    .line 12
    move v4, v2

    .line 13
    move v5, v4

    .line 14
    :goto_0
    if-ge v4, v0, :cond_a

    .line 15
    .line 16
    invoke-virtual {p0, v4}, Ljava/lang/String;->codePointAt(I)I

    .line 17
    .line 18
    .line 19
    move-result v6

    .line 20
    invoke-static {v6}, Ljava/lang/Character;->charCount(I)I

    .line 21
    .line 22
    .line 23
    move-result v7

    .line 24
    add-int/2addr v4, v7

    .line 25
    const/4 v7, 0x1

    .line 26
    if-ne v6, v7, :cond_0

    .line 27
    .line 28
    move v8, v7

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    move v8, v2

    .line 31
    :goto_1
    const/4 v9, 0x2

    .line 32
    if-ne v6, v9, :cond_1

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_1
    move v7, v2

    .line 36
    :goto_2
    if-nez v8, :cond_3

    .line 37
    .line 38
    if-eqz v7, :cond_2

    .line 39
    .line 40
    goto :goto_3

    .line 41
    :cond_2
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_3
    :goto_3
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-eqz v6, :cond_4

    .line 50
    .line 51
    new-instance v6, Lpd/d;

    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    invoke-direct {v6, v7}, Lpd/d;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-static {v6}, Lqd/l;->Z(Lud/p;)Lqd/m;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    invoke-virtual {p1, v6}, Lud/p;->I(Lqd/l;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 68
    .line 69
    .line 70
    :cond_4
    if-eqz v8, :cond_5

    .line 71
    .line 72
    add-int/lit8 v6, v5, 0x1

    .line 73
    .line 74
    sget-object v7, Lqd/j;->u:Lqd/h;

    .line 75
    .line 76
    invoke-static {p3, v5, v7}, Lqd/l;->U(Lgf/a;ILqd/j;)Lqd/r;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    invoke-virtual {p1, v5}, Lud/p;->I(Lqd/l;)V

    .line 81
    .line 82
    .line 83
    move v5, v6

    .line 84
    goto :goto_0

    .line 85
    :cond_5
    add-int/lit8 v6, v3, 0x1

    .line 86
    .line 87
    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    check-cast v3, Lnc/a;

    .line 92
    .line 93
    invoke-static {v3}, La7/a;->n(Lnc/a;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    if-nez v7, :cond_6

    .line 98
    .line 99
    const-wide/16 v7, 0x0

    .line 100
    .line 101
    sget-object v3, Lqd/j;->u:Lqd/h;

    .line 102
    .line 103
    invoke-static {v7, v8, v3}, Lqd/l;->S(JLqd/j;)Lqd/n;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    goto :goto_4

    .line 108
    :cond_6
    instance-of v8, v7, Lqd/n;

    .line 109
    .line 110
    if-eqz v8, :cond_7

    .line 111
    .line 112
    move-object v3, v7

    .line 113
    check-cast v3, Lqd/n;

    .line 114
    .line 115
    goto :goto_4

    .line 116
    :cond_7
    instance-of v8, v7, Lqd/j;

    .line 117
    .line 118
    if-eqz v8, :cond_8

    .line 119
    .line 120
    new-instance v3, Lpd/c;

    .line 121
    .line 122
    check-cast v7, Lqd/j;

    .line 123
    .line 124
    invoke-direct {v3, v7}, Lpd/c;-><init>(Lqd/j;)V

    .line 125
    .line 126
    .line 127
    invoke-static {v3}, Lqd/l;->Z(Lud/p;)Lqd/m;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    goto :goto_4

    .line 132
    :cond_8
    instance-of v8, v7, Ljava/lang/String;

    .line 133
    .line 134
    if-eqz v8, :cond_9

    .line 135
    .line 136
    new-instance v3, Lpd/d;

    .line 137
    .line 138
    check-cast v7, Ljava/lang/String;

    .line 139
    .line 140
    invoke-direct {v3, v7}, Lpd/d;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    invoke-static {v3}, Lqd/l;->Z(Lud/p;)Lqd/m;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    :goto_4
    invoke-virtual {p1, v3}, Lud/p;->I(Lqd/l;)V

    .line 148
    .line 149
    .line 150
    move v3, v6

    .line 151
    goto/16 :goto_0

    .line 152
    .line 153
    :cond_9
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    const-string p1, "Can\'t build insn arg from encoded value: "

    .line 158
    .line 159
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    invoke-static {p0}, Lah/a;->k(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    return-void

    .line 167
    :cond_a
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 168
    .line 169
    .line 170
    move-result p0

    .line 171
    if-eqz p0, :cond_b

    .line 172
    .line 173
    new-instance p0, Lpd/d;

    .line 174
    .line 175
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p2

    .line 179
    invoke-direct {p0, p2}, Lpd/d;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    invoke-static {p0}, Lqd/l;->Z(Lud/p;)Lqd/m;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    invoke-virtual {p1, p0}, Lud/p;->I(Lqd/l;)V

    .line 187
    .line 188
    .line 189
    :cond_b
    return-void
.end method

.method public static final Q(Le1/c;)Lu2/k;
    .locals 4

    .line 1
    new-instance v0, Lu2/k;

    .line 2
    .line 3
    iget v1, p0, Le1/c;->a:F

    .line 4
    .line 5
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget v2, p0, Le1/c;->b:F

    .line 10
    .line 11
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    iget v3, p0, Le1/c;->c:F

    .line 16
    .line 17
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    iget p0, p0, Le1/c;->d:F

    .line 22
    .line 23
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    invoke-direct {v0, v1, v2, v3, p0}, Lu2/k;-><init>(IIII)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method

.method public static R(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "L"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p3}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/16 v2, 0x2e

    .line 17
    .line 18
    const/16 v3, 0x2f

    .line 19
    .line 20
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ";->"

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const/16 v1, 0x28

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    array-length v2, v1

    .line 55
    const/4 v3, 0x0

    .line 56
    :goto_0
    if-ge v3, v2, :cond_0

    .line 57
    .line 58
    aget-object v4, v1, v3

    .line 59
    .line 60
    sget-object v5, Lmb/a;->e:Ljava/util/HashSet;

    .line 61
    .line 62
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-static {v4}, Loh/h;->W(Ljava/lang/Class;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    add-int/lit8 v3, v3, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    const/16 v1, 0x29

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    sget-object v1, Lmb/a;->e:Ljava/util/HashSet;

    .line 81
    .line 82
    invoke-virtual {p3}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    move-result-object p3

    .line 86
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-static {p3}, Loh/h;->W(Ljava/lang/Class;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p3

    .line 93
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p3

    .line 100
    invoke-static {p0, p1, p2, p3}, Loh/h;->S(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    return-void
.end method

.method public static S(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "cache_key"

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    if-eqz p3, :cond_3

    .line 11
    .line 12
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    :try_start_0
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const-string v2, ""

    .line 24
    .line 25
    invoke-interface {p0, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-nez p0, :cond_2

    .line 34
    .line 35
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 36
    .line 37
    .line 38
    :cond_2
    invoke-interface {v1, v0, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-interface {p0, p2, p3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    :catchall_0
    :cond_3
    :goto_0
    return-void
.end method

.method public static final T(Lf2/q;Lh3/g;)V
    .locals 12

    .line 1
    invoke-virtual {p0}, Lf2/q;->k()Lf2/m;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lf2/u;->g:Lf2/x;

    .line 6
    .line 7
    iget-object v0, v0, Lf2/m;->g:Lf/k0;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    move-object v0, v1

    .line 17
    :cond_0
    if-nez v0, :cond_c

    .line 18
    .line 19
    invoke-virtual {p0}, Lf2/q;->l()Lf2/q;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    goto/16 :goto_4

    .line 26
    .line 27
    :cond_1
    invoke-virtual {v0}, Lf2/q;->k()Lf2/m;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    sget-object v3, Lf2/u;->e:Lf2/x;

    .line 32
    .line 33
    iget-object v2, v2, Lf2/m;->g:Lf/k0;

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    if-nez v2, :cond_2

    .line 40
    .line 41
    move-object v2, v1

    .line 42
    :cond_2
    if-eqz v2, :cond_b

    .line 43
    .line 44
    invoke-virtual {v0}, Lf2/q;->k()Lf2/m;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    sget-object v3, Lf2/u;->f:Lf2/x;

    .line 49
    .line 50
    iget-object v2, v2, Lf2/m;->g:Lf/k0;

    .line 51
    .line 52
    invoke-virtual {v2, v3}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    if-nez v2, :cond_3

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    move-object v1, v2

    .line 60
    :goto_0
    check-cast v1, Lf2/d;

    .line 61
    .line 62
    if-eqz v1, :cond_4

    .line 63
    .line 64
    iget v2, v1, Lf2/d;->a:I

    .line 65
    .line 66
    if-ltz v2, :cond_b

    .line 67
    .line 68
    iget v1, v1, Lf2/d;->b:I

    .line 69
    .line 70
    if-gez v1, :cond_4

    .line 71
    .line 72
    goto/16 :goto_4

    .line 73
    .line 74
    :cond_4
    invoke-virtual {p0}, Lf2/q;->k()Lf2/m;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    sget-object v2, Lf2/u;->I:Lf2/x;

    .line 79
    .line 80
    iget-object v1, v1, Lf2/m;->g:Lf/k0;

    .line 81
    .line 82
    invoke-virtual {v1, v2}, Lf/k0;->c(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-nez v1, :cond_5

    .line 87
    .line 88
    goto/16 :goto_4

    .line 89
    .line 90
    :cond_5
    new-instance v1, Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 93
    .line 94
    .line 95
    const/4 v2, 0x4

    .line 96
    invoke-static {v2, v0}, Lf2/q;->j(ILf2/q;)Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    const/4 v3, 0x0

    .line 105
    move v4, v3

    .line 106
    move v5, v4

    .line 107
    :goto_1
    if-ge v4, v2, :cond_7

    .line 108
    .line 109
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    check-cast v6, Lf2/q;

    .line 114
    .line 115
    invoke-virtual {v6}, Lf2/q;->k()Lf2/m;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    sget-object v8, Lf2/u;->I:Lf2/x;

    .line 120
    .line 121
    iget-object v7, v7, Lf2/m;->g:Lf/k0;

    .line 122
    .line 123
    invoke-virtual {v7, v8}, Lf/k0;->c(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    if-eqz v7, :cond_6

    .line 128
    .line 129
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    iget-object v6, v6, Lf2/q;->c:Lx1/f0;

    .line 133
    .line 134
    invoke-virtual {v6}, Lx1/f0;->v()I

    .line 135
    .line 136
    .line 137
    move-result v6

    .line 138
    iget-object v7, p0, Lf2/q;->c:Lx1/f0;

    .line 139
    .line 140
    invoke-virtual {v7}, Lx1/f0;->v()I

    .line 141
    .line 142
    .line 143
    move-result v7

    .line 144
    if-ge v6, v7, :cond_6

    .line 145
    .line 146
    add-int/lit8 v5, v5, 0x1

    .line 147
    .line 148
    :cond_6
    add-int/lit8 v4, v4, 0x1

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_7
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-nez v0, :cond_b

    .line 156
    .line 157
    invoke-static {v1}, Loh/h;->n(Ljava/util/ArrayList;)Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-eqz v0, :cond_8

    .line 162
    .line 163
    move v6, v3

    .line 164
    goto :goto_2

    .line 165
    :cond_8
    move v6, v5

    .line 166
    :goto_2
    if-eqz v0, :cond_9

    .line 167
    .line 168
    move v8, v5

    .line 169
    goto :goto_3

    .line 170
    :cond_9
    move v8, v3

    .line 171
    :goto_3
    invoke-virtual {p0}, Lf2/q;->k()Lf2/m;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    sget-object v0, Lf2/u;->I:Lf2/x;

    .line 176
    .line 177
    iget-object p0, p0, Lf2/m;->g:Lf/k0;

    .line 178
    .line 179
    invoke-virtual {p0, v0}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    if-nez p0, :cond_a

    .line 184
    .line 185
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 186
    .line 187
    :cond_a
    check-cast p0, Ljava/lang/Boolean;

    .line 188
    .line 189
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 190
    .line 191
    .line 192
    move-result v11

    .line 193
    const/4 v9, 0x1

    .line 194
    const/4 v10, 0x0

    .line 195
    const/4 v7, 0x1

    .line 196
    invoke-static/range {v6 .. v11}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;->obtain(IIIIZZ)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    iget-object p1, p1, Lh3/g;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 201
    .line 202
    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionItemInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;)V

    .line 203
    .line 204
    .line 205
    :cond_b
    :goto_4
    return-void

    .line 206
    :cond_c
    invoke-static {}, Lah/a;->d()V

    .line 207
    .line 208
    .line 209
    return-void
.end method

.method public static U(Lorg/json/JSONObject;)V
    .locals 10

    .line 1
    const-string v0, "2"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const-string v1, "4"

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const-class v3, Ljava/lang/String;

    .line 17
    .line 18
    :try_start_0
    const-string v4, "com.tencent.mmkv.MMKV"

    .line 19
    .line 20
    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    const-string v5, "mmkvWithID"

    .line 25
    .line 26
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 27
    .line 28
    filled-new-array {v3, v6}, [Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    invoke-virtual {v4, v5, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    const-string v6, "db_max_id_record"

    .line 37
    .line 38
    const/4 v7, 0x2

    .line 39
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    filled-new-array {v6, v7}, [Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    const/4 v7, 0x0

    .line 48
    invoke-virtual {v5, v7, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    const-string v6, "decodeLong"

    .line 53
    .line 54
    sget-object v7, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 55
    .line 56
    filled-new-array {v3, v7}, [Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v4, v6, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    const-string v4, "msg.message"

    .line 65
    .line 66
    const-wide/16 v6, 0x0

    .line 67
    .line 68
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    filled-new-array {v4, v8}, [Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-virtual {v3, v5, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    instance-of v4, v3, Ljava/lang/Number;

    .line 81
    .line 82
    if-eqz v4, :cond_1

    .line 83
    .line 84
    check-cast v3, Ljava/lang/Number;

    .line 85
    .line 86
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 87
    .line 88
    .line 89
    move-result-wide v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    goto :goto_0

    .line 91
    :cond_1
    move-wide v3, v6

    .line 92
    :goto_0
    cmp-long v5, v3, v6

    .line 93
    .line 94
    const-wide/16 v6, 0x1

    .line 95
    .line 96
    if-nez v5, :cond_2

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_2
    const-wide/32 v8, 0xf4240

    .line 100
    .line 101
    .line 102
    cmp-long v5, v3, v8

    .line 103
    .line 104
    if-nez v5, :cond_3

    .line 105
    .line 106
    const-wide/32 v6, 0x989680

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_3
    const-wide/32 v8, 0x55d4a80

    .line 111
    .line 112
    .line 113
    cmp-long v5, v3, v8

    .line 114
    .line 115
    if-nez v5, :cond_4

    .line 116
    .line 117
    const-wide/32 v6, 0x1dcd6501

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_4
    add-long/2addr v6, v3

    .line 122
    goto :goto_1

    .line 123
    :catchall_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 124
    .line 125
    .line 126
    move-result-wide v6

    .line 127
    :goto_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 128
    .line 129
    .line 130
    move-result-wide v3

    .line 131
    new-instance v5, Ljava/lang/StringBuilder;

    .line 132
    .line 133
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    const-string v2, "T"

    .line 143
    .line 144
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v5, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    const-string v5, "8"

    .line 155
    .line 156
    invoke-virtual {v0, v5, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 157
    .line 158
    .line 159
    const-wide/16 v5, 0x3e8

    .line 160
    .line 161
    div-long/2addr v3, v5

    .line 162
    long-to-int v3, v3

    .line 163
    const-string v4, "7"

    .line 164
    .line 165
    invoke-virtual {v0, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 166
    .line 167
    .line 168
    invoke-virtual {p0, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 169
    .line 170
    .line 171
    invoke-virtual {p0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 172
    .line 173
    .line 174
    return-void
.end method

.method public static final V(Ljava/io/File;)Ldg/c;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    sget-char v0, Ljava/io/File;->separatorChar:C

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x4

    .line 15
    invoke-static {p0, v0, v1, v2}, Log/m;->q0(Ljava/lang/CharSequence;CII)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const/4 v4, 0x1

    .line 20
    if-nez v3, :cond_2

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-le v3, v4, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-ne v3, v0, :cond_1

    .line 33
    .line 34
    const/4 v3, 0x2

    .line 35
    invoke-static {p0, v0, v3, v2}, Log/m;->q0(Ljava/lang/CharSequence;CII)I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-ltz v3, :cond_1

    .line 40
    .line 41
    add-int/2addr v3, v4

    .line 42
    invoke-static {p0, v0, v3, v2}, Log/m;->q0(Ljava/lang/CharSequence;CII)I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-ltz v2, :cond_0

    .line 47
    .line 48
    add-int/2addr v2, v4

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    goto :goto_0

    .line 55
    :cond_1
    move v2, v4

    .line 56
    goto :goto_0

    .line 57
    :cond_2
    const/16 v2, 0x3a

    .line 58
    .line 59
    if-lez v3, :cond_3

    .line 60
    .line 61
    add-int/lit8 v5, v3, -0x1

    .line 62
    .line 63
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-ne v5, v2, :cond_3

    .line 68
    .line 69
    add-int/lit8 v2, v3, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    const/4 v5, -0x1

    .line 73
    if-ne v3, v5, :cond_4

    .line 74
    .line 75
    invoke-static {p0, v2}, Log/m;->l0(Ljava/lang/CharSequence;C)Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_4

    .line 80
    .line 81
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    goto :goto_0

    .line 86
    :cond_4
    move v2, v1

    .line 87
    :goto_0
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-nez v2, :cond_5

    .line 100
    .line 101
    sget-object p0, Ltf/t;->g:Ltf/t;

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_5
    new-array v2, v4, [C

    .line 105
    .line 106
    aput-char v0, v2, v1

    .line 107
    .line 108
    const/4 v0, 0x6

    .line 109
    invoke-static {p0, v2, v0}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    new-instance v0, Ljava/util/ArrayList;

    .line 114
    .line 115
    invoke-static {p0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 120
    .line 121
    .line 122
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-eqz v1, :cond_6

    .line 131
    .line 132
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    check-cast v1, Ljava/lang/String;

    .line 137
    .line 138
    new-instance v2, Ljava/io/File;

    .line 139
    .line 140
    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_6
    move-object p0, v0

    .line 148
    :goto_2
    new-instance v0, Ldg/c;

    .line 149
    .line 150
    new-instance v1, Ljava/io/File;

    .line 151
    .line 152
    invoke-direct {v1, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    invoke-direct {v0, v1, p0}, Ldg/c;-><init>(Ljava/io/File;Ljava/util/List;)V

    .line 156
    .line 157
    .line 158
    return-object v0
.end method

.method public static W(Ljava/lang/Class;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_9

    .line 6
    .line 7
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    const-string p0, "Z"

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_1
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    const-string p0, "B"

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_2
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 39
    .line 40
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    const-string p0, "C"

    .line 47
    .line 48
    return-object p0

    .line 49
    :cond_3
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 50
    .line 51
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_4

    .line 56
    .line 57
    const-string p0, "S"

    .line 58
    .line 59
    return-object p0

    .line 60
    :cond_4
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 61
    .line 62
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_5

    .line 67
    .line 68
    const-string p0, "I"

    .line 69
    .line 70
    return-object p0

    .line 71
    :cond_5
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 72
    .line 73
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_6

    .line 78
    .line 79
    const-string p0, "J"

    .line 80
    .line 81
    return-object p0

    .line 82
    :cond_6
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 83
    .line 84
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_7

    .line 89
    .line 90
    const-string p0, "F"

    .line 91
    .line 92
    return-object p0

    .line 93
    :cond_7
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 94
    .line 95
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    if-eqz p0, :cond_8

    .line 100
    .line 101
    const-string p0, "D"

    .line 102
    .line 103
    return-object p0

    .line 104
    :cond_8
    :goto_0
    const-string p0, "V"

    .line 105
    .line 106
    return-object p0

    .line 107
    :cond_9
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    const/16 v1, 0x2f

    .line 112
    .line 113
    const/16 v2, 0x2e

    .line 114
    .line 115
    if-eqz v0, :cond_a

    .line 116
    .line 117
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    return-object p0

    .line 129
    :cond_a
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    const-string v0, "L"

    .line 141
    .line 142
    const-string v1, ";"

    .line 143
    .line 144
    invoke-static {v0, p0, v1}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    return-object p0
.end method

.method public static final X(JLpg/c;)J
    .locals 8

    .line 1
    iget-object v0, p2, Lpg/c;->g:Ljava/util/concurrent/TimeUnit;

    .line 2
    .line 3
    const-wide v1, 0x3ffffffffffa14bfL    # 1.9999999999138678

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    sget-object v3, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    neg-long v4, v1

    .line 15
    cmp-long v4, v4, p0

    .line 16
    .line 17
    if-gtz v4, :cond_0

    .line 18
    .line 19
    cmp-long v1, p0, v1

    .line 20
    .line 21
    if-gtz v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {v3, p0, p1, v0}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    .line 24
    .line 25
    .line 26
    move-result-wide p0

    .line 27
    sget-object p2, Lpg/a;->g:Ll3/w;

    .line 28
    .line 29
    const/4 p2, 0x1

    .line 30
    shl-long/2addr p0, p2

    .line 31
    sget p2, Lpg/b;->a:I

    .line 32
    .line 33
    return-wide p0

    .line 34
    :cond_0
    sget-object v1, Lpg/c;->i:Lpg/c;

    .line 35
    .line 36
    invoke-virtual {p2, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-ltz v1, :cond_e

    .line 41
    .line 42
    invoke-static {p0, p1}, Ljava/lang/Long;->signum(J)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    int-to-long v0, v0

    .line 47
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    cmp-long v4, p0, v2

    .line 53
    .line 54
    if-gez v4, :cond_1

    .line 55
    .line 56
    move-wide p0, v2

    .line 57
    :cond_1
    invoke-static {p0, p1}, Ljava/lang/Math;->abs(J)J

    .line 58
    .line 59
    .line 60
    move-result-wide p0

    .line 61
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    const/4 v3, 0x2

    .line 66
    const-wide/16 v4, 0x0

    .line 67
    .line 68
    const-wide/16 v6, 0x1

    .line 69
    .line 70
    if-eq v2, v3, :cond_6

    .line 71
    .line 72
    const/4 v3, 0x3

    .line 73
    if-eq v2, v3, :cond_5

    .line 74
    .line 75
    const/4 v3, 0x4

    .line 76
    if-eq v2, v3, :cond_4

    .line 77
    .line 78
    const/4 v3, 0x5

    .line 79
    if-eq v2, v3, :cond_3

    .line 80
    .line 81
    const/4 v3, 0x6

    .line 82
    if-ne v2, v3, :cond_2

    .line 83
    .line 84
    const-wide/32 v2, 0x5265c00

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_2
    const-string p0, "Wrong unit for millisMultiplier: "

    .line 89
    .line 90
    invoke-static {p2, p0}, Lokio/a;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    return-wide v4

    .line 94
    :cond_3
    const-wide/32 v2, 0x36ee80

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_4
    const-wide/32 v2, 0xea60

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_5
    const-wide/16 v2, 0x3e8

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_6
    move-wide v2, v6

    .line 106
    :goto_0
    cmp-long p2, p0, v4

    .line 107
    .line 108
    if-nez p2, :cond_7

    .line 109
    .line 110
    :goto_1
    move-wide p0, v4

    .line 111
    goto :goto_3

    .line 112
    :cond_7
    cmp-long p2, p0, v6

    .line 113
    .line 114
    const-wide v4, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    if-nez p2, :cond_9

    .line 120
    .line 121
    cmp-long p0, v2, v4

    .line 122
    .line 123
    if-lez p0, :cond_8

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_8
    move-wide p0, v2

    .line 127
    goto :goto_3

    .line 128
    :cond_9
    cmp-long p2, v2, v6

    .line 129
    .line 130
    if-nez p2, :cond_a

    .line 131
    .line 132
    cmp-long p2, p0, v4

    .line 133
    .line 134
    if-lez p2, :cond_d

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_a
    invoke-static {p0, p1}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    .line 138
    .line 139
    .line 140
    move-result p2

    .line 141
    rsub-int p2, p2, 0x80

    .line 142
    .line 143
    invoke-static {v2, v3}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    .line 144
    .line 145
    .line 146
    move-result v6

    .line 147
    sub-int/2addr p2, v6

    .line 148
    const/16 v6, 0x3f

    .line 149
    .line 150
    if-ge p2, v6, :cond_b

    .line 151
    .line 152
    mul-long/2addr p0, v2

    .line 153
    goto :goto_3

    .line 154
    :cond_b
    if-le p2, v6, :cond_c

    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_c
    mul-long/2addr p0, v2

    .line 158
    cmp-long p2, p0, v4

    .line 159
    .line 160
    if-lez p2, :cond_d

    .line 161
    .line 162
    :goto_2
    goto :goto_1

    .line 163
    :cond_d
    :goto_3
    mul-long/2addr v0, p0

    .line 164
    invoke-static {v0, v1}, Loh/h;->v(J)J

    .line 165
    .line 166
    .line 167
    move-result-wide p0

    .line 168
    return-wide p0

    .line 169
    :cond_e
    sget-object p2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 170
    .line 171
    invoke-virtual {p2, p0, p1, v0}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    .line 172
    .line 173
    .line 174
    move-result-wide v1

    .line 175
    const-wide v3, -0x3fffffffffffffffL    # -2.0000000000000004

    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    const-wide v5, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    invoke-static/range {v1 .. v6}, Lr9/e0;->s(JJJ)J

    .line 186
    .line 187
    .line 188
    move-result-wide p0

    .line 189
    invoke-static {p0, p1}, Loh/h;->v(J)J

    .line 190
    .line 191
    .line 192
    move-result-wide p0

    .line 193
    return-wide p0
.end method

.method public static Y(Lm4/b;Lk4/b;Lo4/a;Ln4/a;Lr4/p;)Lr4/k;
    .locals 25

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v2, p3

    .line 4
    .line 5
    move-object/from16 v0, p0

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    iget-object v0, v0, Lm4/b;->a:Lo4/b;

    .line 10
    .line 11
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-boolean v4, v0, Lo4/b;->a:Z

    .line 15
    .line 16
    const/4 v5, 0x1

    .line 17
    if-eqz v4, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iput-boolean v5, v0, Lo4/b;->a:Z

    .line 21
    .line 22
    :goto_0
    invoke-virtual {v1}, Lk4/b;->d()V

    .line 23
    .line 24
    .line 25
    iget-object v7, v1, Lk4/b;->f:Lv4/d0;

    .line 26
    .line 27
    invoke-virtual {v1}, Lk4/b;->d()V

    .line 28
    .line 29
    .line 30
    iget v0, v1, Lk4/b;->e:I

    .line 31
    .line 32
    and-int/lit8 v8, v0, -0x21

    .line 33
    .line 34
    invoke-virtual {v1}, Lk4/b;->c()V

    .line 35
    .line 36
    .line 37
    iget-object v0, v1, Lk4/b;->k:Lh4/u;

    .line 38
    .line 39
    const-string v4, "SourceFile"

    .line 40
    .line 41
    invoke-virtual {v0, v4}, Lh4/u;->o(Ljava/lang/String;)Lh4/s;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    instance-of v4, v0, Lh4/q;

    .line 46
    .line 47
    if-eqz v4, :cond_1

    .line 48
    .line 49
    check-cast v0, Lh4/q;

    .line 50
    .line 51
    iget-object v0, v0, Lh4/q;->b:Lv4/c0;

    .line 52
    .line 53
    move-object v11, v0

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    const/4 v11, 0x0

    .line 56
    :goto_1
    new-instance v6, Lr4/k;

    .line 57
    .line 58
    invoke-virtual {v1}, Lk4/b;->d()V

    .line 59
    .line 60
    .line 61
    iget-object v9, v1, Lk4/b;->g:Lv4/d0;

    .line 62
    .line 63
    invoke-virtual {v1}, Lk4/b;->d()V

    .line 64
    .line 65
    .line 66
    iget-object v10, v1, Lk4/b;->h:Lw4/e;

    .line 67
    .line 68
    invoke-direct/range {v6 .. v11}, Lr4/k;-><init>(Lv4/d0;ILv4/d0;Lw4/e;Lv4/c0;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, Lk4/b;->d()V

    .line 72
    .line 73
    .line 74
    iget-object v0, v1, Lk4/b;->f:Lv4/d0;

    .line 75
    .line 76
    invoke-virtual {v1}, Lk4/b;->c()V

    .line 77
    .line 78
    .line 79
    iget-object v4, v1, Lk4/b;->k:Lh4/u;

    .line 80
    .line 81
    invoke-static {v4}, Lig/a;->s(Lh4/u;)Lt4/b;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    const-string v8, "EnclosingMethod"

    .line 86
    .line 87
    invoke-virtual {v4, v8}, Lh4/u;->o(Ljava/lang/String;)Lh4/s;

    .line 88
    .line 89
    .line 90
    move-result-object v8

    .line 91
    check-cast v8, Lh4/f;

    .line 92
    .line 93
    const/4 v9, 0x3

    .line 94
    const/4 v10, 0x0

    .line 95
    if-nez v8, :cond_2

    .line 96
    .line 97
    const/4 v8, 0x0

    .line 98
    goto :goto_2

    .line 99
    :cond_2
    iget-object v11, v8, Lh4/f;->b:Lv4/d0;

    .line 100
    .line 101
    iget-object v8, v8, Lh4/f;->c:Lv4/z;

    .line 102
    .line 103
    if-nez v8, :cond_3

    .line 104
    .line 105
    new-instance v8, Lt4/a;

    .line 106
    .line 107
    sget-object v13, Lr4/d;->b:Lv4/d0;

    .line 108
    .line 109
    invoke-direct {v8, v13, v9}, Lt4/a;-><init>(Lv4/d0;I)V

    .line 110
    .line 111
    .line 112
    new-instance v13, Lt4/d;

    .line 113
    .line 114
    sget-object v14, Lr4/d;->k:Lv4/c0;

    .line 115
    .line 116
    invoke-direct {v13, v14, v11}, Lt4/d;-><init>(Lv4/c0;Lv4/a;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v8, v13}, Lt4/a;->n(Lt4/d;)V

    .line 120
    .line 121
    .line 122
    iput-boolean v10, v8, Lz4/j;->g:Z

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_3
    new-instance v13, Lv4/y;

    .line 126
    .line 127
    invoke-direct {v13, v11, v8}, Lv4/e;-><init>(Lv4/d0;Lv4/z;)V

    .line 128
    .line 129
    .line 130
    new-instance v8, Lt4/a;

    .line 131
    .line 132
    sget-object v11, Lr4/d;->c:Lv4/d0;

    .line 133
    .line 134
    invoke-direct {v8, v11, v9}, Lt4/a;-><init>(Lv4/d0;I)V

    .line 135
    .line 136
    .line 137
    new-instance v11, Lt4/d;

    .line 138
    .line 139
    sget-object v14, Lr4/d;->k:Lv4/c0;

    .line 140
    .line 141
    invoke-direct {v11, v14, v13}, Lt4/d;-><init>(Lv4/c0;Lv4/a;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v8, v11}, Lt4/a;->n(Lt4/d;)V

    .line 145
    .line 146
    .line 147
    iput-boolean v10, v8, Lz4/j;->g:Z

    .line 148
    .line 149
    :goto_2
    if-nez v8, :cond_4

    .line 150
    .line 151
    move v11, v5

    .line 152
    goto :goto_3

    .line 153
    :cond_4
    move v11, v10

    .line 154
    :goto_3
    :try_start_0
    invoke-static {v0, v4, v11}, Lig/a;->a0(Lv4/d0;Lh4/u;Z)Lt4/b;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    if-eqz v0, :cond_5

    .line 159
    .line 160
    new-instance v4, Lt4/b;

    .line 161
    .line 162
    invoke-direct {v4}, Lt4/b;-><init>()V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v4, v7}, Lt4/b;->m(Lt4/b;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v4, v0}, Lt4/b;->m(Lt4/b;)V

    .line 169
    .line 170
    .line 171
    iput-boolean v10, v4, Lz4/j;->g:Z
    :try_end_0
    .catch Lz4/l; {:try_start_0 .. :try_end_0} :catch_0

    .line 172
    .line 173
    move-object v7, v4

    .line 174
    goto :goto_6

    .line 175
    :goto_4
    move-object/from16 v4, p2

    .line 176
    .line 177
    goto :goto_5

    .line 178
    :catch_0
    move-exception v0

    .line 179
    goto :goto_4

    .line 180
    :goto_5
    iget-object v4, v4, Lo4/a;->a:Ljava/io/PrintStream;

    .line 181
    .line 182
    new-instance v11, Ljava/lang/StringBuilder;

    .line 183
    .line 184
    const-string v13, "warning: "

    .line 185
    .line 186
    invoke-direct {v11, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-virtual {v4, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    :cond_5
    :goto_6
    if-eqz v8, :cond_6

    .line 204
    .line 205
    invoke-static {v7, v8}, Lt4/b;->n(Lt4/b;Lt4/a;)Lt4/b;

    .line 206
    .line 207
    .line 208
    move-result-object v7

    .line 209
    :cond_6
    invoke-virtual {v1}, Lk4/b;->d()V

    .line 210
    .line 211
    .line 212
    iget v0, v1, Lk4/b;->e:I

    .line 213
    .line 214
    and-int/lit16 v0, v0, 0x2000

    .line 215
    .line 216
    if-eqz v0, :cond_a

    .line 217
    .line 218
    invoke-virtual {v1}, Lk4/b;->d()V

    .line 219
    .line 220
    .line 221
    iget-object v0, v1, Lk4/b;->f:Lv4/d0;

    .line 222
    .line 223
    invoke-virtual {v1}, Lk4/b;->c()V

    .line 224
    .line 225
    .line 226
    iget-object v4, v1, Lk4/b;->j:Lh4/u;

    .line 227
    .line 228
    iget-object v8, v4, Lz4/e;->h:[Ljava/lang/Object;

    .line 229
    .line 230
    array-length v8, v8

    .line 231
    new-instance v11, Lt4/a;

    .line 232
    .line 233
    const/4 v13, 0x4

    .line 234
    invoke-direct {v11, v0, v13}, Lt4/a;-><init>(Lv4/d0;I)V

    .line 235
    .line 236
    .line 237
    move v0, v10

    .line 238
    move v13, v0

    .line 239
    :goto_7
    if-ge v0, v8, :cond_8

    .line 240
    .line 241
    invoke-virtual {v4, v0}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v14

    .line 245
    check-cast v14, Ll4/b;

    .line 246
    .line 247
    invoke-interface {v14}, Ll4/a;->getAttributes()Lh4/u;

    .line 248
    .line 249
    .line 250
    move-result-object v15

    .line 251
    const-string v12, "AnnotationDefault"

    .line 252
    .line 253
    invoke-virtual {v15, v12}, Lh4/u;->o(Ljava/lang/String;)Lh4/s;

    .line 254
    .line 255
    .line 256
    move-result-object v12

    .line 257
    check-cast v12, Lh4/a;

    .line 258
    .line 259
    if-eqz v12, :cond_7

    .line 260
    .line 261
    new-instance v13, Lt4/d;

    .line 262
    .line 263
    invoke-interface {v14}, Ll4/a;->d()Lv4/z;

    .line 264
    .line 265
    .line 266
    move-result-object v14

    .line 267
    iget-object v14, v14, Lv4/z;->g:Lv4/c0;

    .line 268
    .line 269
    iget-object v12, v12, Lh4/a;->b:Lv4/a;

    .line 270
    .line 271
    invoke-direct {v13, v14, v12}, Lt4/d;-><init>(Lv4/c0;Lv4/a;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v11, v13}, Lt4/a;->l(Lt4/d;)V

    .line 275
    .line 276
    .line 277
    move v13, v5

    .line 278
    :cond_7
    add-int/lit8 v0, v0, 0x1

    .line 279
    .line 280
    goto :goto_7

    .line 281
    :cond_8
    if-nez v13, :cond_9

    .line 282
    .line 283
    const/4 v0, 0x0

    .line 284
    goto :goto_8

    .line 285
    :cond_9
    iput-boolean v10, v11, Lz4/j;->g:Z

    .line 286
    .line 287
    new-instance v0, Lt4/a;

    .line 288
    .line 289
    sget-object v4, Lr4/d;->a:Lv4/d0;

    .line 290
    .line 291
    invoke-direct {v0, v4, v9}, Lt4/a;-><init>(Lv4/d0;I)V

    .line 292
    .line 293
    .line 294
    new-instance v4, Lt4/d;

    .line 295
    .line 296
    sget-object v8, Lr4/d;->k:Lv4/c0;

    .line 297
    .line 298
    new-instance v12, Lv4/b;

    .line 299
    .line 300
    invoke-direct {v12, v11}, Lv4/b;-><init>(Lt4/a;)V

    .line 301
    .line 302
    .line 303
    invoke-direct {v4, v8, v12}, Lt4/d;-><init>(Lv4/c0;Lv4/a;)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v0, v4}, Lt4/a;->n(Lt4/d;)V

    .line 307
    .line 308
    .line 309
    iput-boolean v10, v0, Lz4/j;->g:Z

    .line 310
    .line 311
    :goto_8
    if-eqz v0, :cond_a

    .line 312
    .line 313
    invoke-static {v7, v0}, Lt4/b;->n(Lt4/b;Lt4/a;)Lt4/b;

    .line 314
    .line 315
    .line 316
    move-result-object v7

    .line 317
    :cond_a
    iget-object v0, v7, Lt4/b;->h:Ljava/util/TreeMap;

    .line 318
    .line 319
    invoke-virtual {v0}, Ljava/util/TreeMap;->size()I

    .line 320
    .line 321
    .line 322
    move-result v0

    .line 323
    if-eqz v0, :cond_c

    .line 324
    .line 325
    iget-object v0, v6, Lr4/k;->o:Lr4/e;

    .line 326
    .line 327
    iget-object v4, v0, Lr4/e;->k:Lr4/b;

    .line 328
    .line 329
    if-nez v4, :cond_b

    .line 330
    .line 331
    new-instance v4, Lr4/b;

    .line 332
    .line 333
    invoke-direct {v4, v7, v3}, Lr4/b;-><init>(Lt4/b;Lr4/p;)V

    .line 334
    .line 335
    .line 336
    iput-object v4, v0, Lr4/e;->k:Lr4/b;

    .line 337
    .line 338
    goto :goto_a

    .line 339
    :cond_b
    const-string v0, "class annotations already set"

    .line 340
    .line 341
    invoke-static {v0}, Lj8/o;->w(Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    :goto_9
    const/4 v0, 0x0

    .line 345
    return-object v0

    .line 346
    :cond_c
    :goto_a
    iget-object v0, v3, Lr4/p;->i:Lr4/w;

    .line 347
    .line 348
    iget-object v4, v3, Lr4/p;->j:Lr4/j0;

    .line 349
    .line 350
    iget-object v7, v3, Lr4/p;->n:Lr4/h0;

    .line 351
    .line 352
    iget-object v8, v3, Lr4/p;->m:Lr4/g;

    .line 353
    .line 354
    invoke-virtual {v1}, Lk4/b;->d()V

    .line 355
    .line 356
    .line 357
    iget-object v11, v1, Lk4/b;->f:Lv4/d0;

    .line 358
    .line 359
    invoke-virtual {v1}, Lk4/b;->c()V

    .line 360
    .line 361
    .line 362
    iget-object v12, v1, Lk4/b;->i:Lh4/u;

    .line 363
    .line 364
    iget-object v13, v12, Lz4/e;->h:[Ljava/lang/Object;

    .line 365
    .line 366
    array-length v13, v13

    .line 367
    move v14, v10

    .line 368
    :goto_b
    if-ge v14, v13, :cond_13

    .line 369
    .line 370
    invoke-virtual {v12, v14}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v15

    .line 374
    check-cast v15, Ll4/d;

    .line 375
    .line 376
    move/from16 v16, v9

    .line 377
    .line 378
    iget-object v9, v15, Ll4/e;->d:Lh4/u;

    .line 379
    .line 380
    iget-object v5, v15, Ll4/e;->c:Lv4/z;

    .line 381
    .line 382
    :try_start_1
    new-instance v10, Lv4/m;

    .line 383
    .line 384
    invoke-direct {v10, v11, v5}, Lv4/w;-><init>(Lv4/d0;Lv4/z;)V

    .line 385
    .line 386
    .line 387
    iget v15, v15, Ll4/e;->b:I

    .line 388
    .line 389
    and-int/lit8 v18, v15, 0x8

    .line 390
    .line 391
    if-eqz v18, :cond_d

    .line 392
    .line 393
    const/16 v18, 0x1

    .line 394
    .line 395
    goto :goto_c

    .line 396
    :cond_d
    const/16 v18, 0x0

    .line 397
    .line 398
    :goto_c
    if-eqz v18, :cond_10

    .line 399
    .line 400
    move-object/from16 v18, v11

    .line 401
    .line 402
    const-string v11, "ConstantValue"

    .line 403
    .line 404
    invoke-virtual {v9, v11}, Lh4/u;->o(Ljava/lang/String;)Lh4/s;

    .line 405
    .line 406
    .line 407
    move-result-object v11

    .line 408
    check-cast v11, Lh4/d;

    .line 409
    .line 410
    if-nez v11, :cond_e

    .line 411
    .line 412
    const/4 v11, 0x0

    .line 413
    :goto_d
    move-object/from16 p2, v9

    .line 414
    .line 415
    goto :goto_e

    .line 416
    :cond_e
    iget-object v11, v11, Lh4/d;->b:Lv4/f0;

    .line 417
    .line 418
    goto :goto_d

    .line 419
    :goto_e
    new-instance v9, Lr4/r;

    .line 420
    .line 421
    invoke-direct {v9, v10, v15}, Lr4/r;-><init>(Lv4/m;I)V

    .line 422
    .line 423
    .line 424
    if-eqz v11, :cond_f

    .line 425
    .line 426
    invoke-virtual {v5}, Lv4/z;->k()Lw4/c;

    .line 427
    .line 428
    .line 429
    move-result-object v15

    .line 430
    invoke-static {v11, v15}, Loh/h;->q(Lv4/f0;Lw4/c;)Lv4/f0;

    .line 431
    .line 432
    .line 433
    move-result-object v11

    .line 434
    goto :goto_f

    .line 435
    :catch_1
    move-exception v0

    .line 436
    goto :goto_12

    .line 437
    :cond_f
    :goto_f
    invoke-virtual {v6, v9, v11}, Lr4/k;->i(Lr4/r;Lv4/a;)V

    .line 438
    .line 439
    .line 440
    goto :goto_10

    .line 441
    :cond_10
    move-object/from16 p2, v9

    .line 442
    .line 443
    move-object/from16 v18, v11

    .line 444
    .line 445
    new-instance v9, Lr4/r;

    .line 446
    .line 447
    invoke-direct {v9, v10, v15}, Lr4/r;-><init>(Lv4/m;I)V

    .line 448
    .line 449
    .line 450
    iget-object v11, v6, Lr4/k;->m:Lr4/j;

    .line 451
    .line 452
    iget-object v11, v11, Lr4/j;->n:Ljava/util/ArrayList;

    .line 453
    .line 454
    invoke-virtual {v11, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 455
    .line 456
    .line 457
    :goto_10
    invoke-static/range {p2 .. p2}, Lig/a;->s(Lh4/u;)Lt4/b;

    .line 458
    .line 459
    .line 460
    move-result-object v9

    .line 461
    iget-object v11, v9, Lt4/b;->h:Ljava/util/TreeMap;

    .line 462
    .line 463
    invoke-virtual {v11}, Ljava/util/TreeMap;->size()I

    .line 464
    .line 465
    .line 466
    move-result v11

    .line 467
    if-eqz v11, :cond_12

    .line 468
    .line 469
    iget-object v11, v6, Lr4/k;->o:Lr4/e;

    .line 470
    .line 471
    iget-object v15, v11, Lr4/e;->l:Ljava/util/ArrayList;

    .line 472
    .line 473
    if-nez v15, :cond_11

    .line 474
    .line 475
    new-instance v15, Ljava/util/ArrayList;

    .line 476
    .line 477
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 478
    .line 479
    .line 480
    iput-object v15, v11, Lr4/e;->l:Ljava/util/ArrayList;

    .line 481
    .line 482
    :cond_11
    iget-object v11, v11, Lr4/e;->l:Ljava/util/ArrayList;

    .line 483
    .line 484
    new-instance v15, Lr4/u;

    .line 485
    .line 486
    move-object/from16 p2, v12

    .line 487
    .line 488
    new-instance v12, Lr4/b;

    .line 489
    .line 490
    invoke-direct {v12, v9, v3}, Lr4/b;-><init>(Lt4/b;Lr4/p;)V

    .line 491
    .line 492
    .line 493
    invoke-direct {v15, v10, v12}, Lr4/u;-><init>(Lv4/m;Lr4/b;)V

    .line 494
    .line 495
    .line 496
    invoke-virtual {v11, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 497
    .line 498
    .line 499
    goto :goto_11

    .line 500
    :cond_12
    move-object/from16 p2, v12

    .line 501
    .line 502
    :goto_11
    iget-object v9, v3, Lr4/p;->i:Lr4/w;

    .line 503
    .line 504
    invoke-virtual {v9, v10}, Lr4/w;->m(Lv4/m;)Lr4/v;
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 505
    .line 506
    .line 507
    add-int/lit8 v14, v14, 0x1

    .line 508
    .line 509
    move-object/from16 v12, p2

    .line 510
    .line 511
    move/from16 v9, v16

    .line 512
    .line 513
    move-object/from16 v11, v18

    .line 514
    .line 515
    const/4 v5, 0x1

    .line 516
    const/4 v10, 0x0

    .line 517
    goto/16 :goto_b

    .line 518
    .line 519
    :goto_12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 520
    .line 521
    const-string v2, "...while processing "

    .line 522
    .line 523
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 524
    .line 525
    .line 526
    iget-object v2, v5, Lv4/z;->g:Lv4/c0;

    .line 527
    .line 528
    invoke-virtual {v2}, Lv4/c0;->a()Ljava/lang/String;

    .line 529
    .line 530
    .line 531
    move-result-object v2

    .line 532
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 533
    .line 534
    .line 535
    const-string v2, " "

    .line 536
    .line 537
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 538
    .line 539
    .line 540
    iget-object v2, v5, Lv4/z;->h:Lv4/c0;

    .line 541
    .line 542
    invoke-virtual {v2}, Lv4/c0;->a()Ljava/lang/String;

    .line 543
    .line 544
    .line 545
    move-result-object v2

    .line 546
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 547
    .line 548
    .line 549
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object v1

    .line 553
    invoke-static {v1, v0}, Lf4/a;->b(Ljava/lang/String;Ljava/lang/Exception;)Lf4/a;

    .line 554
    .line 555
    .line 556
    move-result-object v0

    .line 557
    throw v0

    .line 558
    :cond_13
    move/from16 v16, v9

    .line 559
    .line 560
    invoke-virtual {v1}, Lk4/b;->d()V

    .line 561
    .line 562
    .line 563
    iget-object v5, v1, Lk4/b;->f:Lv4/d0;

    .line 564
    .line 565
    invoke-virtual {v1}, Lk4/b;->c()V

    .line 566
    .line 567
    .line 568
    iget-object v9, v1, Lk4/b;->j:Lh4/u;

    .line 569
    .line 570
    iget-object v10, v9, Lz4/e;->h:[Ljava/lang/Object;

    .line 571
    .line 572
    array-length v10, v10

    .line 573
    const/4 v11, 0x0

    .line 574
    :goto_13
    if-ge v11, v10, :cond_27

    .line 575
    .line 576
    invoke-virtual {v9, v11}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 577
    .line 578
    .line 579
    move-result-object v13

    .line 580
    check-cast v13, Ll4/b;

    .line 581
    .line 582
    :try_start_2
    new-instance v14, Lv4/y;

    .line 583
    .line 584
    invoke-interface {v13}, Ll4/a;->d()Lv4/z;

    .line 585
    .line 586
    .line 587
    move-result-object v15

    .line 588
    invoke-direct {v14, v5, v15}, Lv4/e;-><init>(Lv4/d0;Lv4/z;)V

    .line 589
    .line 590
    .line 591
    invoke-interface {v13}, Ll4/a;->c()I

    .line 592
    .line 593
    .line 594
    move-result v12

    .line 595
    and-int/lit8 v18, v12, 0x8

    .line 596
    .line 597
    if-eqz v18, :cond_14

    .line 598
    .line 599
    const/16 v18, 0x1

    .line 600
    .line 601
    goto :goto_14

    .line 602
    :cond_14
    const/16 v18, 0x0

    .line 603
    .line 604
    :goto_14
    and-int/lit8 v19, v12, 0x2

    .line 605
    .line 606
    if-eqz v19, :cond_15

    .line 607
    .line 608
    const/16 v19, 0x1

    .line 609
    .line 610
    goto :goto_15

    .line 611
    :cond_15
    const/16 v19, 0x0

    .line 612
    .line 613
    :goto_15
    move/from16 v20, v10

    .line 614
    .line 615
    and-int/lit16 v10, v12, 0x100

    .line 616
    .line 617
    if-eqz v10, :cond_16

    .line 618
    .line 619
    const/4 v10, 0x1

    .line 620
    goto :goto_16

    .line 621
    :cond_16
    const/4 v10, 0x0

    .line 622
    :goto_16
    move/from16 v21, v10

    .line 623
    .line 624
    and-int/lit16 v10, v12, 0x400

    .line 625
    .line 626
    if-eqz v10, :cond_17

    .line 627
    .line 628
    const/16 v22, 0x1

    .line 629
    .line 630
    goto :goto_17

    .line 631
    :cond_17
    const/16 v22, 0x0

    .line 632
    .line 633
    :goto_17
    iget-object v10, v15, Lv4/z;->g:Lv4/c0;

    .line 634
    .line 635
    iget-object v10, v10, Lv4/c0;->g:Ljava/lang/String;

    .line 636
    .line 637
    move/from16 v23, v11

    .line 638
    .line 639
    const-string v11, "<init>"

    .line 640
    .line 641
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 642
    .line 643
    .line 644
    move-result v10

    .line 645
    if-nez v10, :cond_19

    .line 646
    .line 647
    iget-object v10, v15, Lv4/z;->g:Lv4/c0;

    .line 648
    .line 649
    iget-object v10, v10, Lv4/c0;->g:Ljava/lang/String;

    .line 650
    .line 651
    const-string v11, "<clinit>"

    .line 652
    .line 653
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 654
    .line 655
    .line 656
    move-result v10

    .line 657
    if-eqz v10, :cond_18

    .line 658
    .line 659
    goto :goto_18

    .line 660
    :cond_18
    const/4 v10, 0x0

    .line 661
    goto :goto_19

    .line 662
    :cond_19
    :goto_18
    const/4 v10, 0x1

    .line 663
    :goto_19
    if-nez v21, :cond_1a

    .line 664
    .line 665
    if-eqz v22, :cond_1b

    .line 666
    .line 667
    :cond_1a
    move-object/from16 v22, v9

    .line 668
    .line 669
    move/from16 v24, v10

    .line 670
    .line 671
    goto :goto_1b

    .line 672
    :cond_1b
    new-instance v11, Li4/m;

    .line 673
    .line 674
    invoke-direct {v11, v13, v1}, Li4/m;-><init>(Ll4/b;Lk4/b;)V

    .line 675
    .line 676
    .line 677
    invoke-static {v11, v9, v2}, Li4/z;->b(Li4/m;Lh4/u;Ln4/a;)Lf1/h;

    .line 678
    .line 679
    .line 680
    move-result-object v11

    .line 681
    move-object/from16 v22, v9

    .line 682
    .line 683
    iget-object v9, v14, Lv4/e;->i:Lw4/a;

    .line 684
    .line 685
    if-eqz v18, :cond_1c

    .line 686
    .line 687
    move/from16 v24, v10

    .line 688
    .line 689
    goto :goto_1a

    .line 690
    :cond_1c
    move/from16 v24, v10

    .line 691
    .line 692
    iget-object v10, v14, Lv4/e;->j:Lw4/a;

    .line 693
    .line 694
    if-nez v10, :cond_1d

    .line 695
    .line 696
    iget-object v10, v5, Lv4/d0;->g:Lw4/c;

    .line 697
    .line 698
    invoke-virtual {v9, v10}, Lw4/a;->e(Lw4/c;)Lw4/a;

    .line 699
    .line 700
    .line 701
    move-result-object v9

    .line 702
    iput-object v9, v14, Lv4/e;->j:Lw4/a;

    .line 703
    .line 704
    :cond_1d
    iget-object v9, v14, Lv4/e;->j:Lw4/a;

    .line 705
    .line 706
    :goto_1a
    iget-object v9, v9, Lw4/a;->i:Lw4/b;

    .line 707
    .line 708
    invoke-virtual {v9}, Lw4/b;->o()I

    .line 709
    .line 710
    .line 711
    move-result v9

    .line 712
    iget-object v10, v5, Lv4/d0;->g:Lw4/c;

    .line 713
    .line 714
    iget-object v10, v10, Lw4/c;->g:Ljava/lang/String;

    .line 715
    .line 716
    invoke-interface {v13}, Ll4/a;->getName()Lv4/c0;

    .line 717
    .line 718
    .line 719
    move-result-object v10

    .line 720
    iget-object v10, v10, Lv4/c0;->g:Ljava/lang/String;

    .line 721
    .line 722
    const/4 v10, 0x2

    .line 723
    invoke-static {v11, v10, v9, v2}, Lp4/y;->b(Lf1/h;IILn4/a;)Li4/a;

    .line 724
    .line 725
    .line 726
    move-result-object v9

    .line 727
    goto :goto_1c

    .line 728
    :catch_2
    move-exception v0

    .line 729
    goto/16 :goto_20

    .line 730
    .line 731
    :goto_1b
    const/4 v9, 0x0

    .line 732
    :goto_1c
    and-int/lit8 v10, v12, 0x20

    .line 733
    .line 734
    if-eqz v10, :cond_1e

    .line 735
    .line 736
    const/high16 v10, 0x20000

    .line 737
    .line 738
    or-int/2addr v12, v10

    .line 739
    if-nez v21, :cond_1e

    .line 740
    .line 741
    and-int/lit8 v12, v12, -0x21

    .line 742
    .line 743
    :cond_1e
    if-eqz v24, :cond_1f

    .line 744
    .line 745
    const/high16 v10, 0x10000

    .line 746
    .line 747
    or-int/2addr v12, v10

    .line 748
    :cond_1f
    invoke-interface {v13}, Ll4/a;->getAttributes()Lh4/u;

    .line 749
    .line 750
    .line 751
    move-result-object v10

    .line 752
    const-string v11, "Exceptions"

    .line 753
    .line 754
    invoke-virtual {v10, v11}, Lh4/u;->o(Ljava/lang/String;)Lh4/s;

    .line 755
    .line 756
    .line 757
    move-result-object v10

    .line 758
    check-cast v10, Lh4/g;

    .line 759
    .line 760
    if-nez v10, :cond_20

    .line 761
    .line 762
    sget-object v10, Lw4/b;->i:Lw4/b;

    .line 763
    .line 764
    goto :goto_1d

    .line 765
    :cond_20
    iget-object v10, v10, Lh4/g;->b:Lw4/e;

    .line 766
    .line 767
    :goto_1d
    new-instance v11, Lr4/t;

    .line 768
    .line 769
    invoke-direct {v11, v14, v12, v9, v10}, Lr4/t;-><init>(Lv4/y;ILi4/a;Lw4/e;)V

    .line 770
    .line 771
    .line 772
    iget-object v9, v15, Lv4/z;->g:Lv4/c0;

    .line 773
    .line 774
    iget-object v9, v9, Lv4/c0;->g:Ljava/lang/String;

    .line 775
    .line 776
    const-string v10, "<init>"

    .line 777
    .line 778
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 779
    .line 780
    .line 781
    move-result v9

    .line 782
    if-nez v9, :cond_22

    .line 783
    .line 784
    iget-object v9, v15, Lv4/z;->g:Lv4/c0;

    .line 785
    .line 786
    iget-object v9, v9, Lv4/c0;->g:Ljava/lang/String;

    .line 787
    .line 788
    const-string v10, "<clinit>"

    .line 789
    .line 790
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 791
    .line 792
    .line 793
    move-result v9

    .line 794
    if-nez v9, :cond_22

    .line 795
    .line 796
    if-nez v18, :cond_22

    .line 797
    .line 798
    if-eqz v19, :cond_21

    .line 799
    .line 800
    goto :goto_1e

    .line 801
    :cond_21
    iget-object v9, v6, Lr4/k;->m:Lr4/j;

    .line 802
    .line 803
    iget-object v9, v9, Lr4/j;->p:Ljava/util/ArrayList;

    .line 804
    .line 805
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 806
    .line 807
    .line 808
    goto :goto_1f

    .line 809
    :cond_22
    :goto_1e
    iget-object v9, v6, Lr4/k;->m:Lr4/j;

    .line 810
    .line 811
    iget-object v9, v9, Lr4/j;->o:Ljava/util/ArrayList;

    .line 812
    .line 813
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 814
    .line 815
    .line 816
    :goto_1f
    invoke-static {v13}, Lig/a;->w(Ll4/b;)Lt4/b;

    .line 817
    .line 818
    .line 819
    move-result-object v9

    .line 820
    iget-object v10, v9, Lt4/b;->h:Ljava/util/TreeMap;

    .line 821
    .line 822
    invoke-virtual {v10}, Ljava/util/TreeMap;->size()I

    .line 823
    .line 824
    .line 825
    move-result v10

    .line 826
    if-eqz v10, :cond_24

    .line 827
    .line 828
    iget-object v10, v6, Lr4/k;->o:Lr4/e;

    .line 829
    .line 830
    iget-object v11, v10, Lr4/e;->m:Ljava/util/ArrayList;

    .line 831
    .line 832
    if-nez v11, :cond_23

    .line 833
    .line 834
    new-instance v11, Ljava/util/ArrayList;

    .line 835
    .line 836
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 837
    .line 838
    .line 839
    iput-object v11, v10, Lr4/e;->m:Ljava/util/ArrayList;

    .line 840
    .line 841
    :cond_23
    iget-object v10, v10, Lr4/e;->m:Ljava/util/ArrayList;

    .line 842
    .line 843
    new-instance v11, Lr4/f0;

    .line 844
    .line 845
    new-instance v12, Lr4/b;

    .line 846
    .line 847
    invoke-direct {v12, v9, v3}, Lr4/b;-><init>(Lt4/b;Lr4/p;)V

    .line 848
    .line 849
    .line 850
    invoke-direct {v11, v14, v12}, Lr4/f0;-><init>(Lv4/y;Lr4/b;)V

    .line 851
    .line 852
    .line 853
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 854
    .line 855
    .line 856
    :cond_24
    invoke-static {v13}, Lig/a;->y(Ll4/b;)Lt4/c;

    .line 857
    .line 858
    .line 859
    move-result-object v9

    .line 860
    iget-object v10, v9, Lz4/e;->h:[Ljava/lang/Object;

    .line 861
    .line 862
    array-length v10, v10

    .line 863
    if-eqz v10, :cond_26

    .line 864
    .line 865
    iget-object v10, v6, Lr4/k;->o:Lr4/e;

    .line 866
    .line 867
    iget-object v11, v10, Lr4/e;->n:Ljava/util/ArrayList;

    .line 868
    .line 869
    if-nez v11, :cond_25

    .line 870
    .line 871
    new-instance v11, Ljava/util/ArrayList;

    .line 872
    .line 873
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 874
    .line 875
    .line 876
    iput-object v11, v10, Lr4/e;->n:Ljava/util/ArrayList;

    .line 877
    .line 878
    :cond_25
    iget-object v10, v10, Lr4/e;->n:Ljava/util/ArrayList;

    .line 879
    .line 880
    new-instance v11, Lr4/m0;

    .line 881
    .line 882
    invoke-direct {v11, v14, v9, v3}, Lr4/m0;-><init>(Lv4/y;Lt4/c;Lr4/p;)V

    .line 883
    .line 884
    .line 885
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 886
    .line 887
    .line 888
    :cond_26
    iget-object v9, v3, Lr4/p;->j:Lr4/j0;

    .line 889
    .line 890
    invoke-virtual {v9, v14}, Lr4/j0;->m(Lv4/e;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_2

    .line 891
    .line 892
    .line 893
    add-int/lit8 v11, v23, 0x1

    .line 894
    .line 895
    move/from16 v10, v20

    .line 896
    .line 897
    move-object/from16 v9, v22

    .line 898
    .line 899
    goto/16 :goto_13

    .line 900
    .line 901
    :goto_20
    new-instance v1, Ljava/lang/StringBuilder;

    .line 902
    .line 903
    const-string v2, "...while processing "

    .line 904
    .line 905
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 906
    .line 907
    .line 908
    invoke-interface {v13}, Ll4/a;->getName()Lv4/c0;

    .line 909
    .line 910
    .line 911
    move-result-object v2

    .line 912
    invoke-virtual {v2}, Lv4/c0;->a()Ljava/lang/String;

    .line 913
    .line 914
    .line 915
    move-result-object v2

    .line 916
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 917
    .line 918
    .line 919
    const-string v2, " "

    .line 920
    .line 921
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 922
    .line 923
    .line 924
    invoke-interface {v13}, Ll4/a;->e()Lv4/c0;

    .line 925
    .line 926
    .line 927
    move-result-object v2

    .line 928
    invoke-virtual {v2}, Lv4/c0;->a()Ljava/lang/String;

    .line 929
    .line 930
    .line 931
    move-result-object v2

    .line 932
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 933
    .line 934
    .line 935
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 936
    .line 937
    .line 938
    move-result-object v1

    .line 939
    invoke-static {v1, v0}, Lf4/a;->b(Ljava/lang/String;Ljava/lang/Exception;)Lf4/a;

    .line 940
    .line 941
    .line 942
    move-result-object v0

    .line 943
    throw v0

    .line 944
    :cond_27
    invoke-virtual {v1}, Lk4/b;->d()V

    .line 945
    .line 946
    .line 947
    iget-object v2, v1, Lk4/b;->d:Lv4/e0;

    .line 948
    .line 949
    iget-object v3, v2, Lv4/e0;->h:[Lv4/a;

    .line 950
    .line 951
    array-length v3, v3

    .line 952
    const/4 v5, 0x0

    .line 953
    :goto_21
    if-ge v5, v3, :cond_38

    .line 954
    .line 955
    :try_start_3
    iget-object v9, v2, Lv4/e0;->h:[Lv4/a;

    .line 956
    .line 957
    aget-object v9, v9, v5
    :try_end_3
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_3 .. :try_end_3} :catch_3

    .line 958
    .line 959
    instance-of v10, v9, Lv4/y;

    .line 960
    .line 961
    if-eqz v10, :cond_29

    .line 962
    .line 963
    check-cast v9, Lv4/e;

    .line 964
    .line 965
    invoke-virtual {v4, v9}, Lr4/j0;->m(Lv4/e;)V

    .line 966
    .line 967
    .line 968
    :cond_28
    :goto_22
    const/4 v11, 0x0

    .line 969
    const/4 v14, 0x1

    .line 970
    goto/16 :goto_28

    .line 971
    .line 972
    :cond_29
    instance-of v10, v9, Lv4/p;

    .line 973
    .line 974
    if-eqz v10, :cond_2a

    .line 975
    .line 976
    check-cast v9, Lv4/p;

    .line 977
    .line 978
    invoke-virtual {v9}, Lv4/p;->l()Lv4/y;

    .line 979
    .line 980
    .line 981
    move-result-object v9

    .line 982
    invoke-virtual {v4, v9}, Lr4/j0;->m(Lv4/e;)V

    .line 983
    .line 984
    .line 985
    goto :goto_22

    .line 986
    :cond_2a
    instance-of v10, v9, Lv4/m;

    .line 987
    .line 988
    if-eqz v10, :cond_2b

    .line 989
    .line 990
    check-cast v9, Lv4/m;

    .line 991
    .line 992
    invoke-virtual {v0, v9}, Lr4/w;->m(Lv4/m;)Lr4/v;

    .line 993
    .line 994
    .line 995
    goto :goto_22

    .line 996
    :cond_2b
    instance-of v10, v9, Lv4/l;

    .line 997
    .line 998
    if-eqz v10, :cond_2c

    .line 999
    .line 1000
    check-cast v9, Lv4/l;

    .line 1001
    .line 1002
    invoke-virtual {v9}, Lv4/l;->k()Lv4/m;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v9

    .line 1006
    invoke-virtual {v0, v9}, Lr4/w;->m(Lv4/m;)Lr4/v;

    .line 1007
    .line 1008
    .line 1009
    goto :goto_22

    .line 1010
    :cond_2c
    instance-of v10, v9, Lv4/x;

    .line 1011
    .line 1012
    if-eqz v10, :cond_2d

    .line 1013
    .line 1014
    check-cast v9, Lv4/x;

    .line 1015
    .line 1016
    invoke-virtual {v7, v9}, Lr4/h0;->q(Lv4/x;)V

    .line 1017
    .line 1018
    .line 1019
    goto :goto_22

    .line 1020
    :cond_2d
    instance-of v10, v9, Lv4/q;

    .line 1021
    .line 1022
    if-eqz v10, :cond_28

    .line 1023
    .line 1024
    check-cast v9, Lv4/q;

    .line 1025
    .line 1026
    iget v10, v9, Lv4/q;->g:I

    .line 1027
    .line 1028
    invoke-virtual {v1}, Lk4/b;->c()V

    .line 1029
    .line 1030
    .line 1031
    iget-object v11, v1, Lk4/b;->k:Lh4/u;

    .line 1032
    .line 1033
    const-string v12, "BootstrapMethods"

    .line 1034
    .line 1035
    invoke-virtual {v11, v12}, Lh4/u;->o(Ljava/lang/String;)Lh4/s;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v11

    .line 1039
    check-cast v11, Lh4/b;

    .line 1040
    .line 1041
    if-eqz v11, :cond_2e

    .line 1042
    .line 1043
    iget-object v11, v11, Lh4/b;->b:Li4/c;

    .line 1044
    .line 1045
    goto :goto_23

    .line 1046
    :cond_2e
    sget-object v11, Li4/c;->i:Li4/c;

    .line 1047
    .line 1048
    :goto_23
    invoke-virtual {v11, v10}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v10

    .line 1052
    check-cast v10, Li4/b;

    .line 1053
    .line 1054
    iget-object v11, v10, Li4/b;->b:Lv4/x;

    .line 1055
    .line 1056
    iget-object v12, v9, Lv4/q;->h:Lv4/z;

    .line 1057
    .line 1058
    iget-object v10, v10, Li4/b;->a:Lh4/u;

    .line 1059
    .line 1060
    if-eqz v11, :cond_36

    .line 1061
    .line 1062
    if-eqz v12, :cond_35

    .line 1063
    .line 1064
    new-instance v13, Lv4/c;

    .line 1065
    .line 1066
    iget-object v14, v10, Lz4/e;->h:[Ljava/lang/Object;

    .line 1067
    .line 1068
    array-length v14, v14

    .line 1069
    add-int/lit8 v14, v14, 0x3

    .line 1070
    .line 1071
    invoke-direct {v13, v14}, Lz4/e;-><init>(I)V

    .line 1072
    .line 1073
    .line 1074
    const/4 v14, 0x0

    .line 1075
    invoke-virtual {v13, v14, v11}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 1076
    .line 1077
    .line 1078
    iget-object v11, v12, Lv4/z;->g:Lv4/c0;

    .line 1079
    .line 1080
    const/4 v14, 0x1

    .line 1081
    invoke-virtual {v13, v14, v11}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 1082
    .line 1083
    .line 1084
    new-instance v11, Lv4/a0;

    .line 1085
    .line 1086
    iget-object v12, v12, Lv4/z;->h:Lv4/c0;

    .line 1087
    .line 1088
    iget-object v12, v12, Lv4/c0;->g:Ljava/lang/String;

    .line 1089
    .line 1090
    invoke-static {v12}, Lw4/a;->b(Ljava/lang/String;)Lw4/a;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v12

    .line 1094
    invoke-direct {v11, v12}, Lv4/a0;-><init>(Lw4/a;)V

    .line 1095
    .line 1096
    .line 1097
    const/4 v12, 0x2

    .line 1098
    invoke-virtual {v13, v12, v11}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 1099
    .line 1100
    .line 1101
    const/4 v11, 0x0

    .line 1102
    :goto_24
    iget-object v15, v10, Lz4/e;->h:[Ljava/lang/Object;

    .line 1103
    .line 1104
    array-length v15, v15

    .line 1105
    if-ge v11, v15, :cond_2f

    .line 1106
    .line 1107
    add-int/lit8 v15, v11, 0x3

    .line 1108
    .line 1109
    invoke-virtual {v10, v11}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v17

    .line 1113
    move-object/from16 v12, v17

    .line 1114
    .line 1115
    check-cast v12, Lv4/a;

    .line 1116
    .line 1117
    invoke-virtual {v13, v15, v12}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 1118
    .line 1119
    .line 1120
    add-int/lit8 v11, v11, 0x1

    .line 1121
    .line 1122
    const/4 v12, 0x2

    .line 1123
    goto :goto_24

    .line 1124
    :cond_2f
    const/4 v11, 0x0

    .line 1125
    iput-boolean v11, v13, Lz4/j;->g:Z

    .line 1126
    .line 1127
    new-instance v10, Lv4/h;

    .line 1128
    .line 1129
    invoke-direct {v10, v13}, Lv4/d;-><init>(Lv4/c;)V

    .line 1130
    .line 1131
    .line 1132
    invoke-virtual {v1}, Lk4/b;->d()V

    .line 1133
    .line 1134
    .line 1135
    iget-object v12, v1, Lk4/b;->f:Lv4/d0;

    .line 1136
    .line 1137
    iget-object v13, v9, Lv4/q;->j:Lv4/d0;

    .line 1138
    .line 1139
    if-nez v13, :cond_34

    .line 1140
    .line 1141
    if-eqz v12, :cond_33

    .line 1142
    .line 1143
    iput-object v12, v9, Lv4/q;->j:Lv4/d0;

    .line 1144
    .line 1145
    iget-object v12, v9, Lv4/q;->k:Lv4/h;

    .line 1146
    .line 1147
    if-nez v12, :cond_32

    .line 1148
    .line 1149
    iput-object v10, v9, Lv4/q;->k:Lv4/h;

    .line 1150
    .line 1151
    iget-object v9, v9, Lv4/q;->l:Ljava/util/ArrayList;

    .line 1152
    .line 1153
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v9

    .line 1157
    :goto_25
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 1158
    .line 1159
    .line 1160
    move-result v10

    .line 1161
    if-eqz v10, :cond_37

    .line 1162
    .line 1163
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v10

    .line 1167
    check-cast v10, Lv4/i;

    .line 1168
    .line 1169
    monitor-enter v8

    .line 1170
    if-eqz v10, :cond_31

    .line 1171
    .line 1172
    :try_start_4
    invoke-virtual {v8}, Lr4/o0;->g()V

    .line 1173
    .line 1174
    .line 1175
    iget-object v12, v8, Lr4/g;->g:Ljava/util/TreeMap;

    .line 1176
    .line 1177
    invoke-virtual {v12, v10}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v12

    .line 1181
    check-cast v12, Lr4/f;

    .line 1182
    .line 1183
    if-nez v12, :cond_30

    .line 1184
    .line 1185
    new-instance v12, Lr4/f;

    .line 1186
    .line 1187
    invoke-direct {v12, v10}, Lr4/f;-><init>(Lv4/i;)V

    .line 1188
    .line 1189
    .line 1190
    iget-object v13, v8, Lr4/g;->g:Ljava/util/TreeMap;

    .line 1191
    .line 1192
    invoke-virtual {v13, v10, v12}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 1193
    .line 1194
    .line 1195
    goto :goto_26

    .line 1196
    :catchall_0
    move-exception v0

    .line 1197
    goto :goto_27

    .line 1198
    :cond_30
    :goto_26
    monitor-exit v8

    .line 1199
    goto :goto_25

    .line 1200
    :cond_31
    :try_start_5
    new-instance v0, Ljava/lang/NullPointerException;

    .line 1201
    .line 1202
    const-string v1, "cstRef"

    .line 1203
    .line 1204
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 1205
    .line 1206
    .line 1207
    throw v0

    .line 1208
    :goto_27
    monitor-exit v8
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 1209
    throw v0

    .line 1210
    :cond_32
    const-string v0, "already added call site"

    .line 1211
    .line 1212
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 1213
    .line 1214
    .line 1215
    goto/16 :goto_9

    .line 1216
    .line 1217
    :cond_33
    const-string v0, "declaringClass == null"

    .line 1218
    .line 1219
    invoke-static {v0}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 1220
    .line 1221
    .line 1222
    goto/16 :goto_9

    .line 1223
    .line 1224
    :cond_34
    const-string v0, "already added declaring class"

    .line 1225
    .line 1226
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 1227
    .line 1228
    .line 1229
    goto/16 :goto_9

    .line 1230
    .line 1231
    :cond_35
    const-string v0, "nat == null"

    .line 1232
    .line 1233
    invoke-static {v0}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 1234
    .line 1235
    .line 1236
    goto/16 :goto_9

    .line 1237
    .line 1238
    :cond_36
    const-string v0, "bootstrapMethodHandle == null"

    .line 1239
    .line 1240
    invoke-static {v0}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 1241
    .line 1242
    .line 1243
    goto/16 :goto_9

    .line 1244
    .line 1245
    :cond_37
    :goto_28
    add-int/lit8 v5, v5, 0x1

    .line 1246
    .line 1247
    goto/16 :goto_21

    .line 1248
    .line 1249
    :catch_3
    new-instance v0, Lf4/a;

    .line 1250
    .line 1251
    invoke-static {v5}, La/a;->X0(I)Ljava/lang/String;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v1

    .line 1255
    const-string v2, "invalid constant pool index "

    .line 1256
    .line 1257
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v1

    .line 1261
    const/4 v2, 0x0

    .line 1262
    invoke-direct {v0, v1, v2}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 1263
    .line 1264
    .line 1265
    throw v0

    .line 1266
    :cond_38
    return-object v6
.end method

.method public static final a(Lh0/l;Ly0/c;Ls0/d;Li0/h0;I)V
    .locals 12

    .line 1
    move/from16 v0, p4

    .line 2
    .line 3
    const v3, -0x40fab302

    .line 4
    .line 5
    .line 6
    invoke-virtual {p3, v3}, Li0/h0;->b0(I)Li0/h0;

    .line 7
    .line 8
    .line 9
    and-int/lit8 v3, v0, 0x6

    .line 10
    .line 11
    const/4 v4, 0x4

    .line 12
    if-nez v3, :cond_2

    .line 13
    .line 14
    and-int/lit8 v3, v0, 0x8

    .line 15
    .line 16
    if-nez v3, :cond_0

    .line 17
    .line 18
    invoke-virtual {p3, p0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p3, p0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    :goto_0
    if-eqz v3, :cond_1

    .line 28
    .line 29
    move v3, v4

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    const/4 v3, 0x2

    .line 32
    :goto_1
    or-int/2addr v3, v0

    .line 33
    goto :goto_2

    .line 34
    :cond_2
    move v3, v0

    .line 35
    :goto_2
    and-int/lit8 v5, v0, 0x30

    .line 36
    .line 37
    const/16 v6, 0x20

    .line 38
    .line 39
    if-nez v5, :cond_4

    .line 40
    .line 41
    invoke-virtual {p3, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-eqz v5, :cond_3

    .line 46
    .line 47
    move v5, v6

    .line 48
    goto :goto_3

    .line 49
    :cond_3
    const/16 v5, 0x10

    .line 50
    .line 51
    :goto_3
    or-int/2addr v3, v5

    .line 52
    :cond_4
    and-int/lit16 v5, v0, 0x180

    .line 53
    .line 54
    if-nez v5, :cond_6

    .line 55
    .line 56
    invoke-virtual {p3, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    if-eqz v8, :cond_5

    .line 61
    .line 62
    const/16 v8, 0x100

    .line 63
    .line 64
    goto :goto_4

    .line 65
    :cond_5
    const/16 v8, 0x80

    .line 66
    .line 67
    :goto_4
    or-int/2addr v3, v8

    .line 68
    :cond_6
    and-int/lit16 v8, v3, 0x93

    .line 69
    .line 70
    const/16 v9, 0x92

    .line 71
    .line 72
    const/4 v10, 0x0

    .line 73
    const/4 v11, 0x1

    .line 74
    if-eq v8, v9, :cond_7

    .line 75
    .line 76
    move v8, v11

    .line 77
    goto :goto_5

    .line 78
    :cond_7
    move v8, v10

    .line 79
    :goto_5
    and-int/lit8 v9, v3, 0x1

    .line 80
    .line 81
    invoke-virtual {p3, v9, v8}, Li0/h0;->S(IZ)Z

    .line 82
    .line 83
    .line 84
    move-result v8

    .line 85
    if-eqz v8, :cond_d

    .line 86
    .line 87
    and-int/lit8 v8, v3, 0x70

    .line 88
    .line 89
    if-ne v8, v6, :cond_8

    .line 90
    .line 91
    move v6, v11

    .line 92
    goto :goto_6

    .line 93
    :cond_8
    move v6, v10

    .line 94
    :goto_6
    and-int/lit8 v8, v3, 0xe

    .line 95
    .line 96
    if-eq v8, v4, :cond_a

    .line 97
    .line 98
    and-int/lit8 v4, v3, 0x8

    .line 99
    .line 100
    if-eqz v4, :cond_9

    .line 101
    .line 102
    invoke-virtual {p3, p0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    if-eqz v4, :cond_9

    .line 107
    .line 108
    goto :goto_7

    .line 109
    :cond_9
    move v11, v10

    .line 110
    :cond_a
    :goto_7
    or-int v4, v6, v11

    .line 111
    .line 112
    invoke-virtual {p3}, Li0/h0;->P()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    if-nez v4, :cond_b

    .line 117
    .line 118
    sget-object v4, Li0/l;->a:Li0/e;

    .line 119
    .line 120
    if-ne v6, v4, :cond_c

    .line 121
    .line 122
    :cond_b
    new-instance v6, Lh0/k;

    .line 123
    .line 124
    invoke-direct {v6, p1, p0}, Lh0/k;-><init>(Ly0/c;Lh0/l;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p3, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    :cond_c
    check-cast v6, Lh0/k;

    .line 131
    .line 132
    new-instance v5, Ly2/c0;

    .line 133
    .line 134
    sget-object v4, Ly2/d0;->g:Ly2/d0;

    .line 135
    .line 136
    invoke-direct {v5, v10, v4, v10}, Ly2/c0;-><init>(ZLy2/d0;Z)V

    .line 137
    .line 138
    .line 139
    shl-int/lit8 v3, v3, 0x3

    .line 140
    .line 141
    and-int/lit16 v3, v3, 0x1c00

    .line 142
    .line 143
    or-int/lit16 v8, v3, 0x180

    .line 144
    .line 145
    const/4 v9, 0x2

    .line 146
    const/4 v4, 0x0

    .line 147
    move-object v7, p3

    .line 148
    move-object v3, v6

    .line 149
    move-object v6, p2

    .line 150
    invoke-static/range {v3 .. v9}, Ly2/m;->a(Ly2/b0;Lfg/a;Ly2/c0;Ls0/d;Li0/h0;II)V

    .line 151
    .line 152
    .line 153
    goto :goto_8

    .line 154
    :cond_d
    invoke-virtual {p3}, Li0/h0;->V()V

    .line 155
    .line 156
    .line 157
    :goto_8
    invoke-virtual {p3}, Li0/h0;->t()Li0/r1;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    if-eqz v6, :cond_e

    .line 162
    .line 163
    new-instance v0, Lb0/r;

    .line 164
    .line 165
    const/4 v5, 0x3

    .line 166
    move-object v1, p0

    .line 167
    move-object v2, p1

    .line 168
    move-object v3, p2

    .line 169
    move/from16 v4, p4

    .line 170
    .line 171
    invoke-direct/range {v0 .. v5}, Lb0/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 172
    .line 173
    .line 174
    iput-object v0, v6, Li0/r1;->d:Lfg/p;

    .line 175
    .line 176
    :cond_e
    return-void
.end method

.method public static final b(Lh0/l;ZLt2/j;ZJFLy0/o;Li0/h0;I)V
    .locals 19

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    move/from16 v7, p1

    .line 4
    .line 5
    move-object/from16 v8, p2

    .line 6
    .line 7
    move/from16 v9, p3

    .line 8
    .line 9
    move-object/from16 v10, p7

    .line 10
    .line 11
    move-object/from16 v11, p8

    .line 12
    .line 13
    move/from16 v12, p9

    .line 14
    .line 15
    const v0, -0x1bcadee8

    .line 16
    .line 17
    .line 18
    invoke-virtual {v11, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 19
    .line 20
    .line 21
    and-int/lit8 v0, v12, 0x6

    .line 22
    .line 23
    const/4 v1, 0x4

    .line 24
    if-nez v0, :cond_2

    .line 25
    .line 26
    and-int/lit8 v0, v12, 0x8

    .line 27
    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {v11, v6}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {v11, v6}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    :goto_0
    if-eqz v0, :cond_1

    .line 40
    .line 41
    move v0, v1

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const/4 v0, 0x2

    .line 44
    :goto_1
    or-int/2addr v0, v12

    .line 45
    goto :goto_2

    .line 46
    :cond_2
    move v0, v12

    .line 47
    :goto_2
    and-int/lit8 v2, v12, 0x30

    .line 48
    .line 49
    const/16 v3, 0x20

    .line 50
    .line 51
    if-nez v2, :cond_4

    .line 52
    .line 53
    invoke-virtual {v11, v7}, Li0/h0;->g(Z)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_3

    .line 58
    .line 59
    move v2, v3

    .line 60
    goto :goto_3

    .line 61
    :cond_3
    const/16 v2, 0x10

    .line 62
    .line 63
    :goto_3
    or-int/2addr v0, v2

    .line 64
    :cond_4
    and-int/lit16 v2, v12, 0x180

    .line 65
    .line 66
    if-nez v2, :cond_6

    .line 67
    .line 68
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    invoke-virtual {v11, v2}, Li0/h0;->d(I)Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-eqz v2, :cond_5

    .line 77
    .line 78
    const/16 v2, 0x100

    .line 79
    .line 80
    goto :goto_4

    .line 81
    :cond_5
    const/16 v2, 0x80

    .line 82
    .line 83
    :goto_4
    or-int/2addr v0, v2

    .line 84
    :cond_6
    and-int/lit16 v2, v12, 0xc00

    .line 85
    .line 86
    if-nez v2, :cond_8

    .line 87
    .line 88
    invoke-virtual {v11, v9}, Li0/h0;->g(Z)Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-eqz v2, :cond_7

    .line 93
    .line 94
    const/16 v2, 0x800

    .line 95
    .line 96
    goto :goto_5

    .line 97
    :cond_7
    const/16 v2, 0x400

    .line 98
    .line 99
    :goto_5
    or-int/2addr v0, v2

    .line 100
    :cond_8
    and-int/lit16 v2, v12, 0x6000

    .line 101
    .line 102
    if-nez v2, :cond_9

    .line 103
    .line 104
    or-int/lit16 v0, v0, 0x2000

    .line 105
    .line 106
    :cond_9
    const/high16 v2, 0x180000

    .line 107
    .line 108
    and-int/2addr v2, v12

    .line 109
    if-nez v2, :cond_b

    .line 110
    .line 111
    invoke-virtual {v11, v10}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-eqz v2, :cond_a

    .line 116
    .line 117
    const/high16 v2, 0x100000

    .line 118
    .line 119
    goto :goto_6

    .line 120
    :cond_a
    const/high16 v2, 0x80000

    .line 121
    .line 122
    :goto_6
    or-int/2addr v0, v2

    .line 123
    :cond_b
    const v2, 0x82493

    .line 124
    .line 125
    .line 126
    and-int/2addr v2, v0

    .line 127
    const v4, 0x82492

    .line 128
    .line 129
    .line 130
    const/4 v5, 0x0

    .line 131
    if-eq v2, v4, :cond_c

    .line 132
    .line 133
    const/4 v2, 0x1

    .line 134
    goto :goto_7

    .line 135
    :cond_c
    move v2, v5

    .line 136
    :goto_7
    and-int/lit8 v4, v0, 0x1

    .line 137
    .line 138
    invoke-virtual {v11, v4, v2}, Li0/h0;->S(IZ)Z

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    if-eqz v2, :cond_1d

    .line 143
    .line 144
    invoke-virtual {v11}, Li0/h0;->X()V

    .line 145
    .line 146
    .line 147
    and-int/lit8 v2, v12, 0x1

    .line 148
    .line 149
    const v4, -0xe001

    .line 150
    .line 151
    .line 152
    if-eqz v2, :cond_e

    .line 153
    .line 154
    invoke-virtual {v11}, Li0/h0;->B()Z

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    if-eqz v2, :cond_d

    .line 159
    .line 160
    goto :goto_8

    .line 161
    :cond_d
    invoke-virtual {v11}, Li0/h0;->V()V

    .line 162
    .line 163
    .line 164
    and-int/2addr v0, v4

    .line 165
    move-wide/from16 v14, p4

    .line 166
    .line 167
    goto :goto_9

    .line 168
    :cond_e
    :goto_8
    and-int/2addr v0, v4

    .line 169
    const-wide v14, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    :goto_9
    invoke-virtual {v11}, Li0/h0;->q()V

    .line 175
    .line 176
    .line 177
    sget-object v2, Lt2/j;->h:Lt2/j;

    .line 178
    .line 179
    sget-object v4, Lt2/j;->g:Lt2/j;

    .line 180
    .line 181
    if-eqz v7, :cond_12

    .line 182
    .line 183
    sget v16, Lh0/h0;->a:F

    .line 184
    .line 185
    if-ne v8, v4, :cond_f

    .line 186
    .line 187
    if-eqz v9, :cond_10

    .line 188
    .line 189
    :cond_f
    if-ne v8, v2, :cond_11

    .line 190
    .line 191
    if-eqz v9, :cond_11

    .line 192
    .line 193
    :cond_10
    const/4 v2, 0x1

    .line 194
    goto :goto_a

    .line 195
    :cond_11
    move v2, v5

    .line 196
    :goto_a
    move v4, v2

    .line 197
    goto :goto_c

    .line 198
    :cond_12
    sget v16, Lh0/h0;->a:F

    .line 199
    .line 200
    if-ne v8, v4, :cond_13

    .line 201
    .line 202
    if-eqz v9, :cond_14

    .line 203
    .line 204
    :cond_13
    if-ne v8, v2, :cond_15

    .line 205
    .line 206
    if-eqz v9, :cond_15

    .line 207
    .line 208
    :cond_14
    const/4 v2, 0x1

    .line 209
    goto :goto_b

    .line 210
    :cond_15
    move v2, v5

    .line 211
    :goto_b
    if-nez v2, :cond_16

    .line 212
    .line 213
    const/4 v4, 0x1

    .line 214
    goto :goto_c

    .line 215
    :cond_16
    move v4, v5

    .line 216
    :goto_c
    if-eqz v4, :cond_17

    .line 217
    .line 218
    sget-object v2, Ly0/a;->b:Ly0/d;

    .line 219
    .line 220
    goto :goto_d

    .line 221
    :cond_17
    sget-object v2, Ly0/a;->a:Ly0/d;

    .line 222
    .line 223
    :goto_d
    and-int/lit8 v13, v0, 0xe

    .line 224
    .line 225
    if-eq v13, v1, :cond_19

    .line 226
    .line 227
    and-int/lit8 v1, v0, 0x8

    .line 228
    .line 229
    if-eqz v1, :cond_18

    .line 230
    .line 231
    invoke-virtual {v11, v6}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v1

    .line 235
    if-eqz v1, :cond_18

    .line 236
    .line 237
    goto :goto_e

    .line 238
    :cond_18
    move v1, v5

    .line 239
    goto :goto_f

    .line 240
    :cond_19
    :goto_e
    const/4 v1, 0x1

    .line 241
    :goto_f
    and-int/lit8 v0, v0, 0x70

    .line 242
    .line 243
    if-ne v0, v3, :cond_1a

    .line 244
    .line 245
    const/4 v5, 0x1

    .line 246
    :cond_1a
    or-int v0, v1, v5

    .line 247
    .line 248
    invoke-virtual {v11, v4}, Li0/h0;->g(Z)Z

    .line 249
    .line 250
    .line 251
    move-result v1

    .line 252
    or-int/2addr v0, v1

    .line 253
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    if-nez v0, :cond_1b

    .line 258
    .line 259
    sget-object v0, Li0/l;->a:Li0/e;

    .line 260
    .line 261
    if-ne v1, v0, :cond_1c

    .line 262
    .line 263
    :cond_1b
    new-instance v1, Lfb/h0;

    .line 264
    .line 265
    invoke-direct {v1, v6, v7, v4}, Lfb/h0;-><init>(Lh0/l;ZZ)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v11, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    :cond_1c
    check-cast v1, Lfg/l;

    .line 272
    .line 273
    invoke-static {v10, v1}, Lf2/o;->a(Ly0/o;Lfg/l;)Ly0/o;

    .line 274
    .line 275
    .line 276
    move-result-object v5

    .line 277
    sget-object v0, Ly1/h1;->t:Li0/m2;

    .line 278
    .line 279
    invoke-virtual {v11, v0}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    move-object v1, v0

    .line 284
    check-cast v1, Ly1/l2;

    .line 285
    .line 286
    new-instance v0, Lh0/a;

    .line 287
    .line 288
    move-wide/from16 v17, v14

    .line 289
    .line 290
    move-object v14, v2

    .line 291
    move-wide/from16 v2, v17

    .line 292
    .line 293
    invoke-direct/range {v0 .. v6}, Lh0/a;-><init>(Ly1/l2;JZLy0/o;Lh0/l;)V

    .line 294
    .line 295
    .line 296
    const v1, 0x515e2041

    .line 297
    .line 298
    .line 299
    invoke-static {v1, v0, v11}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    or-int/lit16 v1, v13, 0x180

    .line 304
    .line 305
    invoke-static {v6, v14, v0, v11, v1}, Loh/h;->a(Lh0/l;Ly0/c;Ls0/d;Li0/h0;I)V

    .line 306
    .line 307
    .line 308
    goto :goto_10

    .line 309
    :cond_1d
    invoke-virtual {v11}, Li0/h0;->V()V

    .line 310
    .line 311
    .line 312
    move-wide/from16 v2, p4

    .line 313
    .line 314
    :goto_10
    invoke-virtual {v11}, Li0/h0;->t()Li0/r1;

    .line 315
    .line 316
    .line 317
    move-result-object v11

    .line 318
    if-eqz v11, :cond_1e

    .line 319
    .line 320
    new-instance v0, Lh0/b;

    .line 321
    .line 322
    move-object v1, v6

    .line 323
    move v4, v9

    .line 324
    move v9, v12

    .line 325
    move-wide v5, v2

    .line 326
    move v2, v7

    .line 327
    move-object v3, v8

    .line 328
    move-object v8, v10

    .line 329
    move/from16 v7, p6

    .line 330
    .line 331
    invoke-direct/range {v0 .. v9}, Lh0/b;-><init>(Lh0/l;ZLt2/j;ZJFLy0/o;I)V

    .line 332
    .line 333
    .line 334
    iput-object v0, v11, Li0/r1;->d:Lfg/p;

    .line 335
    .line 336
    :cond_1e
    return-void
.end method

.method public static final c(Ly0/o;Lfg/a;ZLi0/h0;I)V
    .locals 4

    .line 1
    const v0, 0x7ddd909a

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p4, 0x6

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p3, p0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x2

    .line 20
    :goto_0
    or-int/2addr v0, p4

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move v0, p4

    .line 23
    :goto_1
    invoke-virtual {p3, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    const/16 v1, 0x20

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_2
    const/16 v1, 0x10

    .line 33
    .line 34
    :goto_2
    or-int/2addr v0, v1

    .line 35
    invoke-virtual {p3, p2}, Li0/h0;->g(Z)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_3

    .line 40
    .line 41
    const/16 v1, 0x100

    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_3
    const/16 v1, 0x80

    .line 45
    .line 46
    :goto_3
    or-int/2addr v0, v1

    .line 47
    and-int/lit16 v1, v0, 0x93

    .line 48
    .line 49
    const/16 v2, 0x92

    .line 50
    .line 51
    const/4 v3, 0x1

    .line 52
    if-eq v1, v2, :cond_4

    .line 53
    .line 54
    move v1, v3

    .line 55
    goto :goto_4

    .line 56
    :cond_4
    const/4 v1, 0x0

    .line 57
    :goto_4
    and-int/2addr v0, v3

    .line 58
    invoke-virtual {p3, v0, v1}, Li0/h0;->S(IZ)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_5

    .line 63
    .line 64
    sget v0, Lh0/h0;->a:F

    .line 65
    .line 66
    sget v1, Lh0/h0;->b:F

    .line 67
    .line 68
    invoke-static {p0, v0, v1}, Lp/h1;->k(Ly0/o;FF)Ly0/o;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    new-instance v1, Lh0/f;

    .line 73
    .line 74
    const/4 v2, 0x0

    .line 75
    invoke-direct {v1, p1, p2, v2}, Lh0/f;-><init>(Ljava/lang/Object;ZI)V

    .line 76
    .line 77
    .line 78
    invoke-static {v0, v1}, Ly0/a;->a(Ly0/o;Lfg/q;)Ly0/o;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-static {p3, v0}, Lp/d;->c(Li0/h0;Ly0/o;)V

    .line 83
    .line 84
    .line 85
    goto :goto_5

    .line 86
    :cond_5
    invoke-virtual {p3}, Li0/h0;->V()V

    .line 87
    .line 88
    .line 89
    :goto_5
    invoke-virtual {p3}, Li0/h0;->t()Li0/r1;

    .line 90
    .line 91
    .line 92
    move-result-object p3

    .line 93
    if-eqz p3, :cond_6

    .line 94
    .line 95
    new-instance v0, Lh0/e;

    .line 96
    .line 97
    invoke-direct {v0, p0, p1, p2, p4}, Lh0/e;-><init>(Ly0/o;Lfg/a;ZI)V

    .line 98
    .line 99
    .line 100
    iput-object v0, p3, Li0/r1;->d:Lfg/p;

    .line 101
    .line 102
    :cond_6
    return-void
.end method

.method public static final d(Ly0/o;Ljava/lang/String;JJJZLfg/a;JJZLs0/d;Li0/h0;II)V
    .locals 29

    .line 1
    move-object/from16 v14, p9

    .line 2
    .line 3
    move-object/from16 v0, p15

    .line 4
    .line 5
    move-object/from16 v1, p16

    .line 6
    .line 7
    move/from16 v2, p17

    .line 8
    .line 9
    move/from16 v3, p18

    .line 10
    .line 11
    const v4, 0x98b8438

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v4}, Li0/h0;->b0(I)Li0/h0;

    .line 15
    .line 16
    .line 17
    and-int/lit8 v4, v2, 0x6

    .line 18
    .line 19
    const/4 v5, 0x1

    .line 20
    if-nez v4, :cond_1

    .line 21
    .line 22
    invoke-virtual {v1, v5}, Li0/h0;->g(Z)Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    const/4 v4, 0x4

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v4, 0x2

    .line 31
    :goto_0
    or-int/2addr v4, v2

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move v4, v2

    .line 34
    :goto_1
    or-int/lit8 v4, v4, 0x30

    .line 35
    .line 36
    and-int/lit16 v6, v2, 0x180

    .line 37
    .line 38
    move-object/from16 v12, p1

    .line 39
    .line 40
    if-nez v6, :cond_3

    .line 41
    .line 42
    invoke-virtual {v1, v12}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    if-eqz v6, :cond_2

    .line 47
    .line 48
    const/16 v6, 0x100

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    const/16 v6, 0x80

    .line 52
    .line 53
    :goto_2
    or-int/2addr v4, v6

    .line 54
    :cond_3
    and-int/lit16 v6, v2, 0xc00

    .line 55
    .line 56
    if-nez v6, :cond_4

    .line 57
    .line 58
    or-int/lit16 v4, v4, 0x400

    .line 59
    .line 60
    :cond_4
    or-int/lit16 v6, v4, 0x6000

    .line 61
    .line 62
    const/high16 v7, 0x30000

    .line 63
    .line 64
    and-int v8, v2, v7

    .line 65
    .line 66
    if-nez v8, :cond_5

    .line 67
    .line 68
    const v6, 0x16000

    .line 69
    .line 70
    .line 71
    or-int/2addr v6, v4

    .line 72
    :cond_5
    const/high16 v4, 0x180000

    .line 73
    .line 74
    and-int v8, v2, v4

    .line 75
    .line 76
    if-nez v8, :cond_6

    .line 77
    .line 78
    const/high16 v8, 0x80000

    .line 79
    .line 80
    or-int/2addr v6, v8

    .line 81
    :cond_6
    const/high16 v8, 0xc00000

    .line 82
    .line 83
    or-int/2addr v6, v8

    .line 84
    const/high16 v8, 0x6000000

    .line 85
    .line 86
    and-int/2addr v8, v2

    .line 87
    if-nez v8, :cond_8

    .line 88
    .line 89
    invoke-virtual {v1, v14}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v8

    .line 93
    if-eqz v8, :cond_7

    .line 94
    .line 95
    const/high16 v8, 0x4000000

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_7
    const/high16 v8, 0x2000000

    .line 99
    .line 100
    :goto_3
    or-int/2addr v6, v8

    .line 101
    :cond_8
    const/high16 v8, 0x30000000

    .line 102
    .line 103
    or-int/2addr v6, v8

    .line 104
    or-int/lit16 v8, v3, 0x1b6

    .line 105
    .line 106
    and-int/lit16 v9, v3, 0xc00

    .line 107
    .line 108
    if-nez v9, :cond_a

    .line 109
    .line 110
    invoke-virtual {v1, v0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v9

    .line 114
    if-eqz v9, :cond_9

    .line 115
    .line 116
    const/16 v9, 0x800

    .line 117
    .line 118
    goto :goto_4

    .line 119
    :cond_9
    const/16 v9, 0x400

    .line 120
    .line 121
    :goto_4
    or-int/2addr v8, v9

    .line 122
    :cond_a
    const v9, 0x12492493

    .line 123
    .line 124
    .line 125
    and-int/2addr v9, v6

    .line 126
    const v10, 0x12492492

    .line 127
    .line 128
    .line 129
    if-ne v9, v10, :cond_c

    .line 130
    .line 131
    and-int/lit16 v9, v8, 0x493

    .line 132
    .line 133
    const/16 v10, 0x492

    .line 134
    .line 135
    if-eq v9, v10, :cond_b

    .line 136
    .line 137
    goto :goto_5

    .line 138
    :cond_b
    const/4 v9, 0x0

    .line 139
    goto :goto_6

    .line 140
    :cond_c
    :goto_5
    move v9, v5

    .line 141
    :goto_6
    and-int/lit8 v10, v6, 0x1

    .line 142
    .line 143
    invoke-virtual {v1, v10, v9}, Li0/h0;->S(IZ)Z

    .line 144
    .line 145
    .line 146
    move-result v9

    .line 147
    if-eqz v9, :cond_13

    .line 148
    .line 149
    invoke-virtual {v1}, Li0/h0;->X()V

    .line 150
    .line 151
    .line 152
    and-int/lit8 v9, v2, 0x1

    .line 153
    .line 154
    const v10, -0x3f1c01

    .line 155
    .line 156
    .line 157
    if-eqz v9, :cond_e

    .line 158
    .line 159
    invoke-virtual {v1}, Li0/h0;->B()Z

    .line 160
    .line 161
    .line 162
    move-result v9

    .line 163
    if-eqz v9, :cond_d

    .line 164
    .line 165
    goto :goto_7

    .line 166
    :cond_d
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 167
    .line 168
    .line 169
    and-int/2addr v6, v10

    .line 170
    move-object/from16 v13, p0

    .line 171
    .line 172
    move-wide/from16 v15, p2

    .line 173
    .line 174
    move-wide/from16 v2, p4

    .line 175
    .line 176
    move-wide/from16 v19, p6

    .line 177
    .line 178
    move-wide/from16 v9, p10

    .line 179
    .line 180
    move-wide/from16 v21, p12

    .line 181
    .line 182
    move/from16 v17, v7

    .line 183
    .line 184
    move/from16 v18, v8

    .line 185
    .line 186
    move/from16 v7, p14

    .line 187
    .line 188
    move v8, v6

    .line 189
    move/from16 v6, p8

    .line 190
    .line 191
    goto :goto_8

    .line 192
    :cond_e
    :goto_7
    sget v9, Lxh/i;->c:I

    .line 193
    .line 194
    sget-object v9, Lbi/d;->a:Li0/m2;

    .line 195
    .line 196
    invoke-virtual {v1, v9}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v13

    .line 200
    check-cast v13, Lbi/b;

    .line 201
    .line 202
    invoke-virtual {v13}, Lbi/b;->d()J

    .line 203
    .line 204
    .line 205
    move-result-wide v15

    .line 206
    invoke-virtual {v1, v9}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v13

    .line 210
    check-cast v13, Lbi/b;

    .line 211
    .line 212
    iget-object v13, v13, Lbi/b;->K:Li0/j1;

    .line 213
    .line 214
    invoke-virtual {v13}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v13

    .line 218
    check-cast v13, Lf1/w;

    .line 219
    .line 220
    move/from16 v17, v7

    .line 221
    .line 222
    move/from16 v18, v8

    .line 223
    .line 224
    iget-wide v7, v13, Lf1/w;->a:J

    .line 225
    .line 226
    invoke-virtual {v1, v9}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v9

    .line 230
    check-cast v9, Lbi/b;

    .line 231
    .line 232
    invoke-virtual {v9}, Lbi/b;->a()J

    .line 233
    .line 234
    .line 235
    move-result-wide v19

    .line 236
    and-int/2addr v6, v10

    .line 237
    sget-wide v9, Lxh/i;->a:J

    .line 238
    .line 239
    sget-wide v21, Lxh/i;->b:J

    .line 240
    .line 241
    sget-object v13, Ly0/l;->a:Ly0/l;

    .line 242
    .line 243
    move-wide v2, v7

    .line 244
    move v7, v5

    .line 245
    move v8, v6

    .line 246
    move v6, v7

    .line 247
    :goto_8
    invoke-virtual {v1}, Li0/h0;->q()V

    .line 248
    .line 249
    .line 250
    sget-object v23, Lp/s1;->v:Ljava/util/WeakHashMap;

    .line 251
    .line 252
    move/from16 v23, v4

    .line 253
    .line 254
    invoke-static {v1}, Lp/c;->e(Li0/h0;)Lp/s1;

    .line 255
    .line 256
    .line 257
    move-result-object v4

    .line 258
    iget-object v4, v4, Lp/s1;->f:Lp/b;

    .line 259
    .line 260
    invoke-static {v4, v1}, Lp/d;->d(Lp/b;Li0/h0;)Lp/j0;

    .line 261
    .line 262
    .line 263
    move-result-object v4

    .line 264
    invoke-virtual {v4}, Lp/j0;->c()F

    .line 265
    .line 266
    .line 267
    move-result v4

    .line 268
    invoke-static {v1}, Lp/c;->e(Li0/h0;)Lp/s1;

    .line 269
    .line 270
    .line 271
    move-result-object v5

    .line 272
    iget-object v5, v5, Lp/s1;->a:Lp/b;

    .line 273
    .line 274
    invoke-static {v5, v1}, Lp/d;->d(Lp/b;Li0/h0;)Lp/j0;

    .line 275
    .line 276
    .line 277
    move-result-object v5

    .line 278
    invoke-virtual {v5}, Lp/j0;->c()F

    .line 279
    .line 280
    .line 281
    move-result v5

    .line 282
    invoke-static {v1}, Lp/c;->e(Li0/h0;)Lp/s1;

    .line 283
    .line 284
    .line 285
    move-result-object v11

    .line 286
    iget-object v11, v11, Lp/s1;->b:Lp/b;

    .line 287
    .line 288
    invoke-static {v11, v1}, Lp/d;->d(Lp/b;Li0/h0;)Lp/j0;

    .line 289
    .line 290
    .line 291
    move-result-object v11

    .line 292
    invoke-virtual {v11}, Lp/j0;->c()F

    .line 293
    .line 294
    .line 295
    move-result v11

    .line 296
    invoke-virtual {v1, v4}, Li0/h0;->c(F)Z

    .line 297
    .line 298
    .line 299
    move-result v24

    .line 300
    invoke-virtual {v1, v5}, Li0/h0;->c(F)Z

    .line 301
    .line 302
    .line 303
    move-result v25

    .line 304
    or-int v24, v24, v25

    .line 305
    .line 306
    invoke-virtual {v1, v11}, Li0/h0;->c(F)Z

    .line 307
    .line 308
    .line 309
    move-result v25

    .line 310
    or-int v24, v24, v25

    .line 311
    .line 312
    move-wide/from16 p2, v2

    .line 313
    .line 314
    invoke-virtual {v1}, Li0/h0;->P()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v2

    .line 318
    if-nez v24, :cond_f

    .line 319
    .line 320
    sget-object v3, Li0/l;->a:Li0/e;

    .line 321
    .line 322
    if-ne v2, v3, :cond_12

    .line 323
    .line 324
    :cond_f
    new-instance v2, Lu2/f;

    .line 325
    .line 326
    invoke-direct {v2, v4}, Lu2/f;-><init>(F)V

    .line 327
    .line 328
    .line 329
    new-instance v3, Lu2/f;

    .line 330
    .line 331
    invoke-direct {v3, v5}, Lu2/f;-><init>(F)V

    .line 332
    .line 333
    .line 334
    new-instance v4, Lu2/f;

    .line 335
    .line 336
    invoke-direct {v4, v11}, Lu2/f;-><init>(F)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v3, v4}, Lu2/f;->compareTo(Ljava/lang/Object;)I

    .line 340
    .line 341
    .line 342
    move-result v5

    .line 343
    if-ltz v5, :cond_10

    .line 344
    .line 345
    goto :goto_9

    .line 346
    :cond_10
    move-object v3, v4

    .line 347
    :goto_9
    invoke-virtual {v2, v3}, Lu2/f;->compareTo(Ljava/lang/Object;)I

    .line 348
    .line 349
    .line 350
    move-result v4

    .line 351
    if-ltz v4, :cond_11

    .line 352
    .line 353
    goto :goto_a

    .line 354
    :cond_11
    move-object v2, v3

    .line 355
    :goto_a
    new-instance v3, Lu2/f;

    .line 356
    .line 357
    iget v2, v2, Lu2/f;->g:F

    .line 358
    .line 359
    invoke-direct {v3, v2}, Lu2/f;-><init>(F)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v1, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 363
    .line 364
    .line 365
    move-object v2, v3

    .line 366
    :cond_12
    check-cast v2, Lu2/f;

    .line 367
    .line 368
    iget v2, v2, Lu2/f;->g:F

    .line 369
    .line 370
    invoke-static {v14, v1}, Li0/r;->y(Ljava/lang/Object;Li0/h0;)Li0/a1;

    .line 371
    .line 372
    .line 373
    move-result-object v3

    .line 374
    new-instance v4, Lxh/q;

    .line 375
    .line 376
    const/4 v5, 0x0

    .line 377
    invoke-direct {v4, v3, v5}, Lxh/q;-><init>(Li0/a1;I)V

    .line 378
    .line 379
    .line 380
    const v5, 0x20b4ce13

    .line 381
    .line 382
    .line 383
    invoke-static {v5, v4, v1}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 384
    .line 385
    .line 386
    move-result-object v4

    .line 387
    new-instance v5, Lu2/f;

    .line 388
    .line 389
    invoke-direct {v5, v2}, Lu2/f;-><init>(F)V

    .line 390
    .line 391
    .line 392
    new-instance v2, Lxh/l;

    .line 393
    .line 394
    const/4 v11, 0x1

    .line 395
    invoke-direct {v2, v3, v0, v11}, Lxh/l;-><init>(Li0/a1;Ls0/d;I)V

    .line 396
    .line 397
    .line 398
    const v3, -0xab68634

    .line 399
    .line 400
    .line 401
    invoke-static {v3, v2, v1}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 402
    .line 403
    .line 404
    move-result-object v2

    .line 405
    and-int/lit8 v3, v8, 0xe

    .line 406
    .line 407
    or-int v3, v3, v23

    .line 408
    .line 409
    shl-int/lit8 v11, v18, 0xc

    .line 410
    .line 411
    const v23, 0xe000

    .line 412
    .line 413
    .line 414
    and-int v23, v11, v23

    .line 415
    .line 416
    or-int v3, v3, v23

    .line 417
    .line 418
    const/high16 v23, 0x70000

    .line 419
    .line 420
    and-int v11, v11, v23

    .line 421
    .line 422
    or-int/2addr v3, v11

    .line 423
    shl-int/lit8 v11, v8, 0x12

    .line 424
    .line 425
    const/high16 v23, 0x1c00000

    .line 426
    .line 427
    and-int v23, v11, v23

    .line 428
    .line 429
    or-int v3, v3, v23

    .line 430
    .line 431
    const/high16 v23, 0xe000000

    .line 432
    .line 433
    and-int v11, v11, v23

    .line 434
    .line 435
    or-int/2addr v3, v11

    .line 436
    shl-int/lit8 v11, v8, 0xf

    .line 437
    .line 438
    const/high16 v23, 0x70000000

    .line 439
    .line 440
    and-int v11, v11, v23

    .line 441
    .line 442
    or-int/2addr v3, v11

    .line 443
    shr-int/lit8 v8, v8, 0x15

    .line 444
    .line 445
    and-int/lit8 v11, v8, 0xe

    .line 446
    .line 447
    or-int v11, v11, v17

    .line 448
    .line 449
    and-int/lit8 v17, v8, 0x70

    .line 450
    .line 451
    or-int v11, v11, v17

    .line 452
    .line 453
    and-int/lit16 v8, v8, 0x380

    .line 454
    .line 455
    or-int/2addr v8, v11

    .line 456
    shl-int/lit8 v11, v18, 0x3

    .line 457
    .line 458
    and-int/lit16 v11, v11, 0x1c00

    .line 459
    .line 460
    or-int/2addr v8, v11

    .line 461
    move-object/from16 v18, v1

    .line 462
    .line 463
    move-object/from16 v17, v2

    .line 464
    .line 465
    move-object v11, v13

    .line 466
    move-wide v0, v15

    .line 467
    move-object/from16 v16, v5

    .line 468
    .line 469
    move v13, v6

    .line 470
    move v15, v7

    .line 471
    move-wide v6, v9

    .line 472
    move-object v10, v4

    .line 473
    move-wide/from16 v4, v19

    .line 474
    .line 475
    move/from16 v19, v3

    .line 476
    .line 477
    move/from16 v20, v8

    .line 478
    .line 479
    move-wide/from16 v8, v21

    .line 480
    .line 481
    move-wide/from16 v2, p2

    .line 482
    .line 483
    invoke-static/range {v0 .. v20}, Lg4/a;->c(JJJJJLs0/d;Ly0/o;Ljava/lang/String;ZLfg/a;ZLu2/f;Ls0/d;Li0/h0;II)V

    .line 484
    .line 485
    .line 486
    move-wide/from16 v27, v8

    .line 487
    .line 488
    move v9, v13

    .line 489
    move-wide/from16 v13, v27

    .line 490
    .line 491
    move-wide/from16 v27, v0

    .line 492
    .line 493
    move-object v1, v11

    .line 494
    move-wide v11, v6

    .line 495
    move-wide v7, v4

    .line 496
    move-wide v5, v2

    .line 497
    move-wide/from16 v3, v27

    .line 498
    .line 499
    goto :goto_b

    .line 500
    :cond_13
    invoke-virtual/range {p16 .. p16}, Li0/h0;->V()V

    .line 501
    .line 502
    .line 503
    move-object/from16 v1, p0

    .line 504
    .line 505
    move-wide/from16 v3, p2

    .line 506
    .line 507
    move-wide/from16 v5, p4

    .line 508
    .line 509
    move-wide/from16 v7, p6

    .line 510
    .line 511
    move/from16 v9, p8

    .line 512
    .line 513
    move-wide/from16 v11, p10

    .line 514
    .line 515
    move-wide/from16 v13, p12

    .line 516
    .line 517
    move/from16 v15, p14

    .line 518
    .line 519
    :goto_b
    invoke-virtual/range {p16 .. p16}, Li0/h0;->t()Li0/r1;

    .line 520
    .line 521
    .line 522
    move-result-object v0

    .line 523
    if-eqz v0, :cond_14

    .line 524
    .line 525
    move-object v2, v0

    .line 526
    new-instance v0, Lxh/r;

    .line 527
    .line 528
    move-object/from16 v10, p9

    .line 529
    .line 530
    move-object/from16 v16, p15

    .line 531
    .line 532
    move/from16 v17, p17

    .line 533
    .line 534
    move/from16 v18, p18

    .line 535
    .line 536
    move-object/from16 v26, v2

    .line 537
    .line 538
    move-object/from16 v2, p1

    .line 539
    .line 540
    invoke-direct/range {v0 .. v18}, Lxh/r;-><init>(Ly0/o;Ljava/lang/String;JJJZLfg/a;JJZLs0/d;II)V

    .line 541
    .line 542
    .line 543
    move-object/from16 v2, v26

    .line 544
    .line 545
    iput-object v0, v2, Li0/r1;->d:Lfg/p;

    .line 546
    .line 547
    :cond_14
    return-void
.end method

.method public static final e(JJ)J
    .locals 7

    .line 1
    const-wide v0, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    cmp-long v2, p0, v0

    .line 7
    .line 8
    const-wide v3, -0x3fffffffffffffffL    # -2.0000000000000004

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    if-eqz v2, :cond_3

    .line 14
    .line 15
    cmp-long v2, p0, v3

    .line 16
    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    cmp-long v0, p2, v0

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    cmp-long v0, p2, v3

    .line 25
    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    add-long v1, p0, p2

    .line 30
    .line 31
    const-wide v3, -0x3fffffffffffffffL    # -2.0000000000000004

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    const-wide v5, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    invoke-static/range {v1 .. v6}, Lr9/e0;->s(JJJ)J

    .line 42
    .line 43
    .line 44
    move-result-wide p0

    .line 45
    return-wide p0

    .line 46
    :cond_2
    :goto_0
    return-wide p2

    .line 47
    :cond_3
    :goto_1
    cmp-long v2, v3, p2

    .line 48
    .line 49
    if-gez v2, :cond_4

    .line 50
    .line 51
    cmp-long v0, p2, v0

    .line 52
    .line 53
    if-gez v0, :cond_4

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_4
    xor-long/2addr p2, p0

    .line 57
    const-wide/16 v0, 0x0

    .line 58
    .line 59
    cmp-long p2, p2, v0

    .line 60
    .line 61
    if-ltz p2, :cond_5

    .line 62
    .line 63
    :goto_2
    return-wide p0

    .line 64
    :cond_5
    const-wide p0, 0x7fffffffffffc0deL

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    return-wide p0
.end method

.method public static f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_2
    const/4 v0, 0x0

    .line 26
    invoke-static {p1, p0, v0}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_3

    .line 31
    .line 32
    :goto_0
    return-object p1

    .line 33
    :cond_3
    invoke-static {p0, p1, v0}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    :goto_1
    return-object p0

    .line 40
    :cond_4
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0
.end method

.method public static g(Lorg/json/JSONObject;)V
    .locals 12

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x3e8

    .line 6
    .line 7
    div-long v2, v0, v2

    .line 8
    .line 9
    long-to-int v2, v2

    .line 10
    const-string v3, "4"

    .line 11
    .line 12
    invoke-virtual {p0, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 13
    .line 14
    .line 15
    const-string v2, ""

    .line 16
    .line 17
    :try_start_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->account()Lg8/a;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->account()Lg8/a;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v3}, Lg8/a;->c()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    :cond_0
    move-object v3, v2

    .line 33
    :goto_0
    new-instance v4, Ljava/text/SimpleDateFormat;

    .line 34
    .line 35
    const-string v5, "ssHHmmMMddyy"

    .line 36
    .line 37
    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 38
    .line 39
    invoke-direct {v4, v5, v6}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 40
    .line 41
    .line 42
    new-instance v5, Ljava/util/Date;

    .line 43
    .line 44
    invoke-direct {v5, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v4, v5}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    if-eqz v3, :cond_4

    .line 52
    .line 53
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    const/4 v6, 0x1

    .line 58
    if-gt v5, v6, :cond_1

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    const/4 v5, 0x0

    .line 66
    :try_start_1
    const-string v6, "MD5"

    .line 67
    .line 68
    invoke-static {v6}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    invoke-virtual {v6, v3}, Ljava/security/MessageDigest;->digest([B)[B

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    new-instance v6, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    .line 80
    .line 81
    array-length v7, v3

    .line 82
    move v8, v5

    .line 83
    :goto_1
    if-ge v8, v7, :cond_3

    .line 84
    .line 85
    aget-byte v9, v3, v8

    .line 86
    .line 87
    and-int/lit16 v9, v9, 0xff

    .line 88
    .line 89
    invoke-static {v9}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v9

    .line 93
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 94
    .line 95
    .line 96
    move-result v10

    .line 97
    const/4 v11, 0x2

    .line 98
    if-ge v10, v11, :cond_2

    .line 99
    .line 100
    const/16 v10, 0x30

    .line 101
    .line 102
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    :cond_2
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    add-int/lit8 v8, v8, 0x1

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_3
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 115
    :catchall_1
    new-instance v3, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    const/4 v4, 0x7

    .line 124
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 125
    .line 126
    .line 127
    move-result v6

    .line 128
    invoke-static {v4, v6}, Ljava/lang/Math;->min(II)I

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    invoke-virtual {v2, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    goto :goto_3

    .line 144
    :cond_4
    :goto_2
    const-string v2, "fffffff"

    .line 145
    .line 146
    invoke-static {v4, v2}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    :goto_3
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 151
    .line 152
    const-wide/32 v4, 0xffff

    .line 153
    .line 154
    .line 155
    rem-long v4, v0, v4

    .line 156
    .line 157
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    const-string v5, "%04x"

    .line 166
    .line 167
    invoke-static {v3, v5, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    const-wide/16 v4, 0x7

    .line 172
    .line 173
    rem-long/2addr v0, v4

    .line 174
    const-wide/16 v4, 0x64

    .line 175
    .line 176
    add-long/2addr v0, v4

    .line 177
    new-instance v4, Ljava/lang/StringBuilder;

    .line 178
    .line 179
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    const-string v1, "5"

    .line 200
    .line 201
    invoke-virtual {p0, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 202
    .line 203
    .line 204
    return-void
.end method

.method public static h(IILjava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    if-gez p0, :cond_0

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    filled-new-array {p2, p0}, [Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string p1, "%s (%s) must not be negative"

    .line 12
    .line 13
    invoke-static {p1, p0}, Lr9/e0;->I(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    if-ltz p1, :cond_1

    .line 19
    .line 20
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    filled-new-array {p2, p0, p1}, [Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    const-string p1, "%s (%s) must not be greater than size (%s)"

    .line 33
    .line 34
    invoke-static {p1, p0}, Lr9/e0;->I(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :cond_1
    const-string p0, "negative size: "

    .line 40
    .line 41
    invoke-static {p1, p0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/4 p0, 0x0

    .line 49
    return-object p0
.end method

.method public static i(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const-string v0, "Hchat_block_at_all_notification_config"

    .line 8
    .line 9
    invoke-static {p0, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const-string v0, "block_at_all_notification_enable"

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    return v1

    .line 23
    :cond_0
    const-string v0, "block_at_all_notification_groups"

    .line 24
    .line 25
    invoke-interface {p0, v0}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    const/4 p0, 0x1

    .line 32
    return p0

    .line 33
    :cond_1
    const-string v1, ""

    .line 34
    .line 35
    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-static {p0}, Loh/h;->O(Ljava/lang/String;)Ljava/util/Set;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    return p0
.end method

.method public static final j(Ljava/lang/Number;Ljava/lang/Number;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Random range is empty: ["

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string p0, ", "

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string p0, ")."

    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public static final k(Lx1/i;Lfg/a;Lyf/c;)Ljava/lang/Object;
    .locals 10

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Ly0/n;

    .line 3
    .line 4
    iget-object v1, v0, Ly0/n;->g:Ly0/n;

    .line 5
    .line 6
    iget-boolean v1, v1, Ly0/n;->t:Z

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_6

    .line 11
    .line 12
    :cond_0
    if-nez v1, :cond_1

    .line 13
    .line 14
    const-string v1, "visitAncestors called on an unattached node"

    .line 15
    .line 16
    invoke-static {v1}, Lu1/a;->b(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    iget-object v0, v0, Ly0/n;->g:Ly0/n;

    .line 20
    .line 21
    iget-object v0, v0, Ly0/n;->k:Ly0/n;

    .line 22
    .line 23
    invoke-static {p0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    :goto_0
    const/4 v2, 0x0

    .line 28
    if-eqz v1, :cond_c

    .line 29
    .line 30
    iget-object v3, v1, Lx1/f0;->L:Lx1/b1;

    .line 31
    .line 32
    iget-object v3, v3, Lx1/b1;->f:Ly0/n;

    .line 33
    .line 34
    iget v3, v3, Ly0/n;->j:I

    .line 35
    .line 36
    const/high16 v4, 0x80000

    .line 37
    .line 38
    and-int/2addr v3, v4

    .line 39
    if-eqz v3, :cond_a

    .line 40
    .line 41
    :goto_1
    if-eqz v0, :cond_a

    .line 42
    .line 43
    iget v3, v0, Ly0/n;->i:I

    .line 44
    .line 45
    and-int/2addr v3, v4

    .line 46
    if-eqz v3, :cond_9

    .line 47
    .line 48
    move-object v3, v0

    .line 49
    move-object v5, v2

    .line 50
    :goto_2
    if-eqz v3, :cond_9

    .line 51
    .line 52
    instance-of v6, v3, Lc2/a;

    .line 53
    .line 54
    if-eqz v6, :cond_2

    .line 55
    .line 56
    move-object v2, v3

    .line 57
    goto :goto_5

    .line 58
    :cond_2
    iget v6, v3, Ly0/n;->i:I

    .line 59
    .line 60
    and-int/2addr v6, v4

    .line 61
    if-eqz v6, :cond_8

    .line 62
    .line 63
    instance-of v6, v3, Lx1/j;

    .line 64
    .line 65
    if-eqz v6, :cond_8

    .line 66
    .line 67
    move-object v6, v3

    .line 68
    check-cast v6, Lx1/j;

    .line 69
    .line 70
    iget-object v6, v6, Lx1/j;->v:Ly0/n;

    .line 71
    .line 72
    const/4 v7, 0x0

    .line 73
    :goto_3
    const/4 v8, 0x1

    .line 74
    if-eqz v6, :cond_7

    .line 75
    .line 76
    iget v9, v6, Ly0/n;->i:I

    .line 77
    .line 78
    and-int/2addr v9, v4

    .line 79
    if-eqz v9, :cond_6

    .line 80
    .line 81
    add-int/lit8 v7, v7, 0x1

    .line 82
    .line 83
    if-ne v7, v8, :cond_3

    .line 84
    .line 85
    move-object v3, v6

    .line 86
    goto :goto_4

    .line 87
    :cond_3
    if-nez v5, :cond_4

    .line 88
    .line 89
    new-instance v5, Lj0/b;

    .line 90
    .line 91
    const/16 v8, 0x10

    .line 92
    .line 93
    new-array v8, v8, [Ly0/n;

    .line 94
    .line 95
    invoke-direct {v5, v8}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    :cond_4
    if-eqz v3, :cond_5

    .line 99
    .line 100
    invoke-virtual {v5, v3}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    move-object v3, v2

    .line 104
    :cond_5
    invoke-virtual {v5, v6}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    :cond_6
    :goto_4
    iget-object v6, v6, Ly0/n;->l:Ly0/n;

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_7
    if-ne v7, v8, :cond_8

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_8
    invoke-static {v5}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    goto :goto_2

    .line 118
    :cond_9
    iget-object v0, v0, Ly0/n;->k:Ly0/n;

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_a
    invoke-virtual {v1}, Lx1/f0;->u()Lx1/f0;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    if-eqz v1, :cond_b

    .line 126
    .line 127
    iget-object v0, v1, Lx1/f0;->L:Lx1/b1;

    .line 128
    .line 129
    if-eqz v0, :cond_b

    .line 130
    .line 131
    iget-object v0, v0, Lx1/b1;->e:Lx1/b2;

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_b
    move-object v0, v2

    .line 135
    goto :goto_0

    .line 136
    :cond_c
    :goto_5
    check-cast v2, Lc2/a;

    .line 137
    .line 138
    if-nez v2, :cond_d

    .line 139
    .line 140
    goto :goto_6

    .line 141
    :cond_d
    invoke-static {p0}, Lx1/k;->v(Lx1/i;)Lx1/i1;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    new-instance v0, Lc1/b;

    .line 146
    .line 147
    const/4 v1, 0x1

    .line 148
    invoke-direct {v0, p1, v1, p0}, Lc1/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    invoke-interface {v2, p0, v0, p2}, Lc2/a;->A0(Lx1/i1;Lc1/b;Lyf/c;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    sget-object p1, Lxf/a;->g:Lxf/a;

    .line 156
    .line 157
    if-ne p0, p1, :cond_e

    .line 158
    .line 159
    return-object p0

    .line 160
    :cond_e
    :goto_6
    sget-object p0, Lsf/n;->a:Lsf/n;

    .line 161
    .line 162
    return-object p0
.end method

.method public static l(Lgf/a;Ljava/util/ArrayList;)Lud/p;
    .locals 4

    .line 1
    :try_start_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x3

    .line 6
    sub-int/2addr v0, v1

    .line 7
    iget v2, p0, Lgf/a;->j:I

    .line 8
    .line 9
    add-int/2addr v0, v2

    .line 10
    new-instance v2, Lud/p;

    .line 11
    .line 12
    sget-object v3, Lpd/k;->V:Lpd/k;

    .line 13
    .line 14
    invoke-direct {v2, v3, v0}, Lud/p;-><init>(Lpd/k;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lnc/a;

    .line 22
    .line 23
    iget-object v0, v0, Lnc/a;->h:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v0, v2, p1, p0}, Loh/h;->P(Ljava/lang/String;Lud/p;Ljava/util/ArrayList;Lgf/a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    .line 30
    return-object v2

    .line 31
    :catch_0
    move-exception p0

    .line 32
    new-instance p1, Lud/p;

    .line 33
    .line 34
    sget-object v0, Lpd/k;->Q:Lpd/k;

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    invoke-direct {p1, v0, v1}, Lud/p;-><init>(Lpd/k;I)V

    .line 38
    .line 39
    .line 40
    sget-object v0, Lmd/a;->m:Lmd/a;

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Lmd/e;->w(Lmd/a;)V

    .line 43
    .line 44
    .line 45
    new-instance v0, Lnd/p;

    .line 46
    .line 47
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const-string v2, "Failed to process dynamic string concat: "

    .line 52
    .line 53
    invoke-static {v2, v1}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-direct {v0, v1, p0}, Lnd/p;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 58
    .line 59
    .line 60
    sget-object p0, Lmd/b;->c:Lmd/b;

    .line 61
    .line 62
    invoke-virtual {p1, p0, v0}, Lmd/e;->x(Lmd/b;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    return-object p1
.end method

.method public static m(Landroid/content/Context;Ljava/lang/ClassLoader;)Ljava/lang/String;
    .locals 7

    .line 1
    invoke-static {p0, p1}, Lo8/k;->a(Landroid/content/Context;Ljava/lang/ClassLoader;)Ll8/i;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object v0, p0, Ll8/i;->c:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v1, p0, Ll8/i;->d:Ljava/lang/String;

    .line 8
    .line 9
    iget-wide v2, p0, Ll8/i;->a:J

    .line 10
    .line 11
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-object v3, p0, Ll8/i;->e:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v4, p0, Ll8/i;->f:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v5, p0, Ll8/i;->g:Ljava/lang/String;

    .line 20
    .line 21
    iget-wide p0, p0, Ll8/i;->b:J

    .line 22
    .line 23
    invoke-static {p0, p1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    filled-new-array/range {v0 .. v6}, [Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const/4 v4, 0x0

    .line 36
    const/16 v5, 0x3e

    .line 37
    .line 38
    const-string v1, "|"

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    const/4 v3, 0x0

    .line 42
    invoke-static/range {v0 .. v5}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0
.end method

.method public static final n(Ljava/util/ArrayList;)Z
    .locals 14

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    const/4 v2, 0x1

    .line 7
    if-ge v0, v1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_4

    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    const-wide v3, 0xffffffffL

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    const/16 v5, 0x20

    .line 22
    .line 23
    if-gt v0, v2, :cond_1

    .line 24
    .line 25
    sget-object p0, Ltf/t;->g:Ltf/t;

    .line 26
    .line 27
    goto/16 :goto_1

    .line 28
    .line 29
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    sub-int/2addr v7, v2

    .line 43
    move v8, v1

    .line 44
    :goto_0
    if-ge v8, v7, :cond_2

    .line 45
    .line 46
    add-int/lit8 v8, v8, 0x1

    .line 47
    .line 48
    invoke-virtual {p0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v9

    .line 52
    move-object v10, v9

    .line 53
    check-cast v10, Lf2/q;

    .line 54
    .line 55
    check-cast v6, Lf2/q;

    .line 56
    .line 57
    invoke-virtual {v6}, Lf2/q;->g()Le1/c;

    .line 58
    .line 59
    .line 60
    move-result-object v11

    .line 61
    invoke-virtual {v11}, Le1/c;->b()J

    .line 62
    .line 63
    .line 64
    move-result-wide v11

    .line 65
    shr-long/2addr v11, v5

    .line 66
    long-to-int v11, v11

    .line 67
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 68
    .line 69
    .line 70
    move-result v11

    .line 71
    invoke-virtual {v10}, Lf2/q;->g()Le1/c;

    .line 72
    .line 73
    .line 74
    move-result-object v12

    .line 75
    invoke-virtual {v12}, Le1/c;->b()J

    .line 76
    .line 77
    .line 78
    move-result-wide v12

    .line 79
    shr-long/2addr v12, v5

    .line 80
    long-to-int v12, v12

    .line 81
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 82
    .line 83
    .line 84
    move-result v12

    .line 85
    sub-float/2addr v11, v12

    .line 86
    invoke-static {v11}, Ljava/lang/Math;->abs(F)F

    .line 87
    .line 88
    .line 89
    move-result v11

    .line 90
    invoke-virtual {v6}, Lf2/q;->g()Le1/c;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    invoke-virtual {v6}, Le1/c;->b()J

    .line 95
    .line 96
    .line 97
    move-result-wide v12

    .line 98
    and-long/2addr v12, v3

    .line 99
    long-to-int v6, v12

    .line 100
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    invoke-virtual {v10}, Lf2/q;->g()Le1/c;

    .line 105
    .line 106
    .line 107
    move-result-object v10

    .line 108
    invoke-virtual {v10}, Le1/c;->b()J

    .line 109
    .line 110
    .line 111
    move-result-wide v12

    .line 112
    and-long/2addr v12, v3

    .line 113
    long-to-int v10, v12

    .line 114
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 115
    .line 116
    .line 117
    move-result v10

    .line 118
    sub-float/2addr v6, v10

    .line 119
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    .line 120
    .line 121
    .line 122
    move-result v6

    .line 123
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 124
    .line 125
    .line 126
    move-result v10

    .line 127
    int-to-long v10, v10

    .line 128
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 129
    .line 130
    .line 131
    move-result v6

    .line 132
    int-to-long v12, v6

    .line 133
    shl-long/2addr v10, v5

    .line 134
    and-long/2addr v12, v3

    .line 135
    or-long/2addr v10, v12

    .line 136
    new-instance v6, Le1/b;

    .line 137
    .line 138
    invoke-direct {v6, v10, v11}, Le1/b;-><init>(J)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-object v6, v9

    .line 145
    goto :goto_0

    .line 146
    :cond_2
    move-object p0, v0

    .line 147
    :goto_1
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    if-ne v0, v2, :cond_3

    .line 152
    .line 153
    invoke-static {p0}, Ltf/m;->t1(Ljava/util/List;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    check-cast p0, Le1/b;

    .line 158
    .line 159
    iget-wide v6, p0, Le1/b;->a:J

    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_3
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-eqz v0, :cond_4

    .line 167
    .line 168
    const-string v0, "Empty collection can\'t be reduced."

    .line 169
    .line 170
    invoke-static {v0}, Lw2/a;->c(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    :cond_4
    invoke-static {p0}, Ltf/m;->t1(Ljava/util/List;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 178
    .line 179
    .line 180
    move-result v6

    .line 181
    sub-int/2addr v6, v2

    .line 182
    if-gt v2, v6, :cond_5

    .line 183
    .line 184
    move v7, v2

    .line 185
    :goto_2
    invoke-interface {p0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v8

    .line 189
    check-cast v8, Le1/b;

    .line 190
    .line 191
    iget-wide v8, v8, Le1/b;->a:J

    .line 192
    .line 193
    check-cast v0, Le1/b;

    .line 194
    .line 195
    iget-wide v10, v0, Le1/b;->a:J

    .line 196
    .line 197
    invoke-static {v10, v11, v8, v9}, Le1/b;->e(JJ)J

    .line 198
    .line 199
    .line 200
    move-result-wide v8

    .line 201
    new-instance v0, Le1/b;

    .line 202
    .line 203
    invoke-direct {v0, v8, v9}, Le1/b;-><init>(J)V

    .line 204
    .line 205
    .line 206
    if-eq v7, v6, :cond_5

    .line 207
    .line 208
    add-int/lit8 v7, v7, 0x1

    .line 209
    .line 210
    goto :goto_2

    .line 211
    :cond_5
    check-cast v0, Le1/b;

    .line 212
    .line 213
    iget-wide v6, v0, Le1/b;->a:J

    .line 214
    .line 215
    :goto_3
    shr-long v8, v6, v5

    .line 216
    .line 217
    long-to-int p0, v8

    .line 218
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 219
    .line 220
    .line 221
    move-result p0

    .line 222
    and-long/2addr v3, v6

    .line 223
    long-to-int v0, v3

    .line 224
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    cmpg-float p0, v0, p0

    .line 229
    .line 230
    if-gez p0, :cond_6

    .line 231
    .line 232
    :goto_4
    return v2

    .line 233
    :cond_6
    return v1
.end method

.method public static o(II)V
    .locals 2

    .line 1
    if-ltz p0, :cond_1

    .line 2
    .line 3
    if-lt p0, p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    return-void

    .line 7
    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 8
    .line 9
    const-string v1, "index"

    .line 10
    .line 11
    if-ltz p0, :cond_3

    .line 12
    .line 13
    if-gez p1, :cond_2

    .line 14
    .line 15
    const-string p0, "negative size: "

    .line 16
    .line 17
    invoke-static {p1, p0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_2
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    filled-new-array {v1, p0, p1}, [Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    const-string p1, "%s (%s) must be less than size (%s)"

    .line 38
    .line 39
    invoke-static {p1, p0}, Lr9/e0;->I(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    goto :goto_1

    .line 44
    :cond_3
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    filled-new-array {v1, p0}, [Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    const-string p1, "%s (%s) must not be negative"

    .line 53
    .line 54
    invoke-static {p1, p0}, Lr9/e0;->I(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    :goto_1
    invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw v0
.end method

.method public static p(III)V
    .locals 1

    .line 1
    if-ltz p0, :cond_1

    .line 2
    .line 3
    if-lt p1, p0, :cond_1

    .line 4
    .line 5
    if-le p1, p2, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    return-void

    .line 9
    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 10
    .line 11
    if-ltz p0, :cond_4

    .line 12
    .line 13
    if-gt p0, p2, :cond_4

    .line 14
    .line 15
    if-ltz p1, :cond_3

    .line 16
    .line 17
    if-le p1, p2, :cond_2

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    filled-new-array {p1, p0}, [Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    const-string p1, "end index (%s) must not be less than start index (%s)"

    .line 33
    .line 34
    invoke-static {p1, p0}, Lr9/e0;->I(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    goto :goto_2

    .line 39
    :cond_3
    :goto_1
    const-string p0, "end index"

    .line 40
    .line 41
    invoke-static {p1, p2, p0}, Loh/h;->h(IILjava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    goto :goto_2

    .line 46
    :cond_4
    const-string p1, "start index"

    .line 47
    .line 48
    invoke-static {p0, p2, p1}, Loh/h;->h(IILjava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    :goto_2
    invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw v0
.end method

.method public static q(Lv4/f0;Lw4/c;)Lv4/f0;
    .locals 3

    .line 1
    invoke-interface {p0}, Lw4/d;->getType()Lw4/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lw4/c;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    iget v0, p1, Lw4/c;->h:I

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    if-eq v0, v1, :cond_7

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    if-eq v0, v1, :cond_5

    .line 19
    .line 20
    const/4 v1, 0x3

    .line 21
    if-eq v0, v1, :cond_3

    .line 22
    .line 23
    const/16 v1, 0x8

    .line 24
    .line 25
    if-ne v0, v1, :cond_2

    .line 26
    .line 27
    check-cast p0, Lv4/o;

    .line 28
    .line 29
    iget p0, p0, Lv4/s;->g:I

    .line 30
    .line 31
    int-to-short p1, p0

    .line 32
    if-ne p1, p0, :cond_1

    .line 33
    .line 34
    new-instance p0, Lv4/b0;

    .line 35
    .line 36
    invoke-direct {p0, p1}, Lv4/s;-><init>(I)V

    .line 37
    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_1
    const-string p1, "bogus short value: "

    .line 41
    .line 42
    invoke-static {p0, p1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    return-object p0

    .line 51
    :cond_2
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 52
    .line 53
    new-instance v1, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string v2, "can\'t coerce "

    .line 56
    .line 57
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string p0, " to "

    .line 64
    .line 65
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-direct {v0, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw v0

    .line 79
    :cond_3
    check-cast p0, Lv4/o;

    .line 80
    .line 81
    iget p0, p0, Lv4/s;->g:I

    .line 82
    .line 83
    int-to-char p1, p0

    .line 84
    if-ne p1, p0, :cond_4

    .line 85
    .line 86
    new-instance p0, Lv4/j;

    .line 87
    .line 88
    invoke-direct {p0, p1}, Lv4/s;-><init>(I)V

    .line 89
    .line 90
    .line 91
    return-object p0

    .line 92
    :cond_4
    const-string p1, "bogus char value: "

    .line 93
    .line 94
    invoke-static {p0, p1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    const/4 p0, 0x0

    .line 102
    return-object p0

    .line 103
    :cond_5
    check-cast p0, Lv4/o;

    .line 104
    .line 105
    iget p0, p0, Lv4/s;->g:I

    .line 106
    .line 107
    int-to-byte p1, p0

    .line 108
    if-ne p1, p0, :cond_6

    .line 109
    .line 110
    new-instance p0, Lv4/g;

    .line 111
    .line 112
    invoke-direct {p0, p1}, Lv4/s;-><init>(I)V

    .line 113
    .line 114
    .line 115
    return-object p0

    .line 116
    :cond_6
    const-string p1, "bogus byte value: "

    .line 117
    .line 118
    invoke-static {p0, p1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    const/4 p0, 0x0

    .line 126
    return-object p0

    .line 127
    :cond_7
    check-cast p0, Lv4/o;

    .line 128
    .line 129
    iget p0, p0, Lv4/s;->g:I

    .line 130
    .line 131
    invoke-static {p0}, Lv4/f;->n(I)Lv4/f;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    return-object p0
.end method

.method public static final r(Lc1/d;F)Lf1/g;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v3, p1

    .line 4
    .line 5
    float-to-double v1, v3

    .line 6
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    double-to-float v1, v1

    .line 11
    float-to-int v1, v1

    .line 12
    mul-int/lit8 v1, v1, 0x2

    .line 13
    .line 14
    sget-object v2, Lr9/e0;->g:Lf1/g;

    .line 15
    .line 16
    sget-object v4, Lr9/e0;->h:Lf1/b;

    .line 17
    .line 18
    sget-object v5, Lr9/e0;->i:Lh1/b;

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    if-eqz v4, :cond_1

    .line 23
    .line 24
    iget-object v6, v2, Lf1/g;->a:Landroid/graphics/Bitmap;

    .line 25
    .line 26
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    if-gt v1, v7, :cond_1

    .line 31
    .line 32
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    if-le v1, v6, :cond_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    :goto_0
    move-object v7, v2

    .line 40
    move-object v8, v4

    .line 41
    goto :goto_2

    .line 42
    :cond_1
    :goto_1
    const/4 v2, 0x1

    .line 43
    invoke-static {v1, v1, v2}, Lf1/c0;->e(III)Lf1/g;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    sput-object v2, Lr9/e0;->g:Lf1/g;

    .line 48
    .line 49
    invoke-static {v2}, Lf1/c0;->a(Lf1/g;)Lf1/b;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    sput-object v4, Lr9/e0;->h:Lf1/b;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :goto_2
    if-nez v5, :cond_2

    .line 57
    .line 58
    new-instance v5, Lh1/b;

    .line 59
    .line 60
    invoke-direct {v5}, Lh1/b;-><init>()V

    .line 61
    .line 62
    .line 63
    sput-object v5, Lr9/e0;->i:Lh1/b;

    .line 64
    .line 65
    :cond_2
    move-object v9, v5

    .line 66
    iget-object v1, v9, Lh1/b;->g:Lh1/a;

    .line 67
    .line 68
    iget-object v2, v0, Lc1/d;->g:Lc1/a;

    .line 69
    .line 70
    invoke-interface {v2}, Lc1/a;->getLayoutDirection()Lu2/m;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    iget-object v4, v7, Lf1/g;->a:Landroid/graphics/Bitmap;

    .line 75
    .line 76
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    int-to-float v5, v5

    .line 81
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    int-to-float v4, v4

    .line 86
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    int-to-long v5, v5

    .line 91
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    int-to-long v10, v4

    .line 96
    const/16 v4, 0x20

    .line 97
    .line 98
    shl-long/2addr v5, v4

    .line 99
    const-wide v17, 0xffffffffL

    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    and-long v10, v10, v17

    .line 105
    .line 106
    or-long/2addr v5, v10

    .line 107
    iget-object v10, v1, Lh1/a;->a:Lu2/c;

    .line 108
    .line 109
    iget-object v11, v1, Lh1/a;->b:Lu2/m;

    .line 110
    .line 111
    iget-object v12, v1, Lh1/a;->c:Lf1/u;

    .line 112
    .line 113
    iget-wide v13, v1, Lh1/a;->d:J

    .line 114
    .line 115
    iput-object v0, v1, Lh1/a;->a:Lu2/c;

    .line 116
    .line 117
    iput-object v2, v1, Lh1/a;->b:Lu2/m;

    .line 118
    .line 119
    iput-object v8, v1, Lh1/a;->c:Lf1/u;

    .line 120
    .line 121
    iput-wide v5, v1, Lh1/a;->d:J

    .line 122
    .line 123
    invoke-virtual {v8}, Lf1/b;->e()V

    .line 124
    .line 125
    .line 126
    move-object v0, v10

    .line 127
    move-object v2, v11

    .line 128
    sget-wide v10, Lf1/w;->b:J

    .line 129
    .line 130
    move-object v5, v12

    .line 131
    move-wide v14, v13

    .line 132
    invoke-interface {v9}, Lh1/d;->a()J

    .line 133
    .line 134
    .line 135
    move-result-wide v12

    .line 136
    move-wide/from16 v19, v14

    .line 137
    .line 138
    const/4 v15, 0x0

    .line 139
    const/16 v16, 0x3a

    .line 140
    .line 141
    const/4 v14, 0x0

    .line 142
    move-wide/from16 v21, v19

    .line 143
    .line 144
    invoke-static/range {v9 .. v16}, Lh1/d;->Z(Lh1/d;JJFII)V

    .line 145
    .line 146
    .line 147
    const-wide v19, 0xff000000L

    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    invoke-static/range {v19 .. v20}, Lf1/c0;->d(J)J

    .line 153
    .line 154
    .line 155
    move-result-wide v10

    .line 156
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 157
    .line 158
    .line 159
    move-result v6

    .line 160
    int-to-long v12, v6

    .line 161
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 162
    .line 163
    .line 164
    move-result v6

    .line 165
    int-to-long v14, v6

    .line 166
    shl-long/2addr v12, v4

    .line 167
    and-long v14, v14, v17

    .line 168
    .line 169
    or-long/2addr v12, v14

    .line 170
    const/4 v15, 0x0

    .line 171
    const/16 v16, 0x78

    .line 172
    .line 173
    const/4 v14, 0x0

    .line 174
    invoke-static/range {v9 .. v16}, Lh1/d;->Z(Lh1/d;JJFII)V

    .line 175
    .line 176
    .line 177
    invoke-static/range {v19 .. v20}, Lf1/c0;->d(J)J

    .line 178
    .line 179
    .line 180
    move-result-wide v10

    .line 181
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 182
    .line 183
    .line 184
    move-result v6

    .line 185
    int-to-long v12, v6

    .line 186
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 187
    .line 188
    .line 189
    move-result v6

    .line 190
    int-to-long v14, v6

    .line 191
    shl-long/2addr v12, v4

    .line 192
    and-long v14, v14, v17

    .line 193
    .line 194
    or-long/2addr v12, v14

    .line 195
    const/16 v6, 0x78

    .line 196
    .line 197
    move-wide/from16 v23, v12

    .line 198
    .line 199
    move-object v12, v5

    .line 200
    move-wide/from16 v4, v23

    .line 201
    .line 202
    move-wide/from16 v23, v10

    .line 203
    .line 204
    move-object v10, v0

    .line 205
    move-object v11, v2

    .line 206
    move-object v0, v9

    .line 207
    move-object v9, v1

    .line 208
    move-wide/from16 v1, v23

    .line 209
    .line 210
    invoke-static/range {v0 .. v6}, Lh1/d;->O(Lh1/d;JFJI)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v8}, Lf1/b;->p()V

    .line 214
    .line 215
    .line 216
    iput-object v10, v9, Lh1/a;->a:Lu2/c;

    .line 217
    .line 218
    iput-object v11, v9, Lh1/a;->b:Lu2/m;

    .line 219
    .line 220
    iput-object v12, v9, Lh1/a;->c:Lf1/u;

    .line 221
    .line 222
    move-wide/from16 v14, v21

    .line 223
    .line 224
    iput-wide v14, v9, Lh1/a;->d:J

    .line 225
    .line 226
    return-object v7
.end method

.method public static s()Ljava/util/List;
    .locals 14

    .line 1
    new-instance v0, Lk9/j;

    .line 2
    .line 3
    const-string v5, ""

    .line 4
    .line 5
    const/4 v7, 0x1

    .line 6
    const-string v1, "plugin_agent"

    .line 7
    .line 8
    const-string v2, "\u63d2\u4ef6 Agent"

    .line 9
    .line 10
    const-string v3, "plugin_agent"

    .line 11
    .line 12
    const-string v4, ""

    .line 13
    .line 14
    move-object v6, v5

    .line 15
    invoke-direct/range {v0 .. v7}, Lk9/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 16
    .line 17
    .line 18
    new-instance v1, Lk9/j;

    .line 19
    .line 20
    const-string v6, ""

    .line 21
    .line 22
    const/4 v8, 0x1

    .line 23
    const-string v2, "module_settings"

    .line 24
    .line 25
    const-string v3, "\u8bbe\u7f6e"

    .line 26
    .line 27
    const-string v4, "module_settings"

    .line 28
    .line 29
    const-string v5, ""

    .line 30
    .line 31
    move-object v7, v6

    .line 32
    invoke-direct/range {v1 .. v8}, Lk9/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 33
    .line 34
    .line 35
    new-instance v2, Lk9/j;

    .line 36
    .line 37
    const-string v7, ""

    .line 38
    .line 39
    const/4 v9, 0x1

    .line 40
    const-string v3, "scan"

    .line 41
    .line 42
    const-string v4, "\u626b\u4e00\u626b"

    .line 43
    .line 44
    const-string v5, "activity"

    .line 45
    .line 46
    const-string v6, "com.tencent.mm.plugin.scanner.ui.BaseScanUI"

    .line 47
    .line 48
    move-object v8, v7

    .line 49
    invoke-direct/range {v2 .. v9}, Lk9/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 50
    .line 51
    .line 52
    new-instance v3, Lk9/j;

    .line 53
    .line 54
    const-string v8, ""

    .line 55
    .line 56
    const/4 v10, 0x1

    .line 57
    const-string v4, "moments"

    .line 58
    .line 59
    const-string v5, "\u670b\u53cb\u5708"

    .line 60
    .line 61
    const-string v6, "activity"

    .line 62
    .line 63
    const-string v7, "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI"

    .line 64
    .line 65
    move-object v9, v8

    .line 66
    invoke-direct/range {v3 .. v10}, Lk9/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 67
    .line 68
    .line 69
    new-instance v4, Lk9/j;

    .line 70
    .line 71
    const-string v9, ""

    .line 72
    .line 73
    const/4 v11, 0x1

    .line 74
    const-string v5, "finder"

    .line 75
    .line 76
    const-string v6, "\u89c6\u9891\u53f7"

    .line 77
    .line 78
    const-string v7, "activity"

    .line 79
    .line 80
    const-string v8, "com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI"

    .line 81
    .line 82
    move-object v10, v9

    .line 83
    invoke-direct/range {v4 .. v11}, Lk9/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 84
    .line 85
    .line 86
    new-instance v5, Lk9/j;

    .line 87
    .line 88
    const-string v10, ""

    .line 89
    .line 90
    const/4 v12, 0x1

    .line 91
    const-string v6, "favorite"

    .line 92
    .line 93
    const-string v7, "\u6536\u85cf"

    .line 94
    .line 95
    const-string v8, "activity"

    .line 96
    .line 97
    const-string v9, "com.tencent.mm.plugin.fav.ui.FavoriteIndexUI"

    .line 98
    .line 99
    move-object v11, v10

    .line 100
    invoke-direct/range {v5 .. v12}, Lk9/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 101
    .line 102
    .line 103
    new-instance v6, Lk9/j;

    .line 104
    .line 105
    const-string v11, ""

    .line 106
    .line 107
    const/4 v13, 0x1

    .line 108
    const-string v7, "wallet"

    .line 109
    .line 110
    const-string v8, "\u94b1\u5305"

    .line 111
    .line 112
    const-string v9, "activity"

    .line 113
    .line 114
    const-string v10, "com.tencent.mm.plugin.mall.ui.MallIndexUIv2"

    .line 115
    .line 116
    move-object v12, v11

    .line 117
    invoke-direct/range {v6 .. v13}, Lk9/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 118
    .line 119
    .line 120
    filled-new-array/range {v0 .. v6}, [Lk9/j;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    return-object v0
.end method

.method public static t(Lp4/t;Ljava/util/List;Lua/c;)Lua/c;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "transfer_rule_default_template_id"

    .line 5
    .line 6
    const-string v1, ""

    .line 7
    .line 8
    invoke-virtual {p0, v0, v1}, Lp4/t;->y(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    move-object v1, v0

    .line 27
    check-cast v1, Lua/i;

    .line 28
    .line 29
    iget-object v1, v1, Lua/i;->a:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v0, 0x0

    .line 39
    :goto_0
    check-cast v0, Lua/i;

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    iget-object p0, v0, Lua/i;->b:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v0, p0, p2}, Lig/a;->d(Lua/i;Ljava/lang/String;Lua/c;)Lua/c;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0

    .line 50
    :cond_2
    return-object p2
.end method

.method public static final u(Lh1/d;Li1/b;)V
    .locals 18

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-interface/range {p0 .. p0}, Lh1/d;->z0()Lb5/c;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lb5/c;->p()Lf1/u;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface/range {p0 .. p0}, Lh1/d;->z0()Lb5/c;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-object v2, v2, Lb5/c;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Li1/b;

    .line 18
    .line 19
    iget-object v3, v0, Li1/b;->a:Li1/d;

    .line 20
    .line 21
    iget-boolean v4, v0, Li1/b;->s:Z

    .line 22
    .line 23
    if-eqz v4, :cond_0

    .line 24
    .line 25
    goto/16 :goto_9

    .line 26
    .line 27
    :cond_0
    invoke-virtual {v0}, Li1/b;->a()V

    .line 28
    .line 29
    .line 30
    invoke-interface {v3}, Li1/d;->A()Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-nez v4, :cond_1

    .line 35
    .line 36
    :try_start_0
    iget-object v4, v0, Li1/b;->a:Li1/d;

    .line 37
    .line 38
    iget-object v5, v0, Li1/b;->b:Lu2/c;

    .line 39
    .line 40
    iget-object v6, v0, Li1/b;->c:Lu2/m;

    .line 41
    .line 42
    iget-object v7, v0, Li1/b;->e:Lb1/f;

    .line 43
    .line 44
    invoke-interface {v4, v5, v6, v0, v7}, Li1/d;->m(Lu2/c;Lu2/m;Li1/b;Lb1/f;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    :catchall_0
    :cond_1
    invoke-interface {v3}, Li1/d;->M()F

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    const/4 v5, 0x0

    .line 52
    cmpl-float v4, v4, v5

    .line 53
    .line 54
    const/4 v5, 0x1

    .line 55
    if-lez v4, :cond_2

    .line 56
    .line 57
    move v4, v5

    .line 58
    goto :goto_0

    .line 59
    :cond_2
    const/4 v4, 0x0

    .line 60
    :goto_0
    if-eqz v4, :cond_3

    .line 61
    .line 62
    invoke-interface {v1}, Lf1/u;->r()V

    .line 63
    .line 64
    .line 65
    :cond_3
    invoke-static {v1}, Lf1/c;->a(Lf1/u;)Landroid/graphics/Canvas;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    invoke-virtual {v7}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    .line 70
    .line 71
    .line 72
    move-result v13

    .line 73
    if-nez v13, :cond_7

    .line 74
    .line 75
    iget-wide v8, v0, Li1/b;->t:J

    .line 76
    .line 77
    const/16 v10, 0x20

    .line 78
    .line 79
    shr-long v11, v8, v10

    .line 80
    .line 81
    long-to-int v11, v11

    .line 82
    int-to-float v11, v11

    .line 83
    const-wide v14, 0xffffffffL

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    and-long/2addr v8, v14

    .line 89
    long-to-int v8, v8

    .line 90
    int-to-float v9, v8

    .line 91
    move-object v8, v7

    .line 92
    iget-wide v6, v0, Li1/b;->u:J

    .line 93
    .line 94
    move-wide/from16 v16, v14

    .line 95
    .line 96
    shr-long v14, v6, v10

    .line 97
    .line 98
    long-to-int v10, v14

    .line 99
    int-to-float v10, v10

    .line 100
    add-float/2addr v10, v11

    .line 101
    and-long v6, v6, v16

    .line 102
    .line 103
    long-to-int v6, v6

    .line 104
    int-to-float v6, v6

    .line 105
    add-float/2addr v6, v9

    .line 106
    invoke-interface {v3}, Li1/d;->a()F

    .line 107
    .line 108
    .line 109
    move-result v7

    .line 110
    invoke-interface {v3}, Li1/d;->x()Lf1/n;

    .line 111
    .line 112
    .line 113
    move-result-object v12

    .line 114
    invoke-interface {v3}, Li1/d;->O()I

    .line 115
    .line 116
    .line 117
    move-result v14

    .line 118
    const/high16 v15, 0x3f800000    # 1.0f

    .line 119
    .line 120
    cmpg-float v15, v7, v15

    .line 121
    .line 122
    if-ltz v15, :cond_5

    .line 123
    .line 124
    const/4 v15, 0x3

    .line 125
    if-ne v14, v15, :cond_5

    .line 126
    .line 127
    if-nez v12, :cond_5

    .line 128
    .line 129
    invoke-interface {v3}, Li1/d;->w()I

    .line 130
    .line 131
    .line 132
    move-result v15

    .line 133
    if-ne v15, v5, :cond_4

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_4
    invoke-virtual {v8}, Landroid/graphics/Canvas;->save()I

    .line 137
    .line 138
    .line 139
    move-object v7, v8

    .line 140
    move v8, v11

    .line 141
    goto :goto_2

    .line 142
    :cond_5
    :goto_1
    iget-object v15, v0, Li1/b;->p:Lf1/h;

    .line 143
    .line 144
    if-nez v15, :cond_6

    .line 145
    .line 146
    invoke-static {}, Lf1/c0;->f()Lf1/h;

    .line 147
    .line 148
    .line 149
    move-result-object v15

    .line 150
    iput-object v15, v0, Li1/b;->p:Lf1/h;

    .line 151
    .line 152
    :cond_6
    invoke-virtual {v15, v7}, Lf1/h;->u(F)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v15, v14}, Lf1/h;->v(I)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v15, v12}, Lf1/h;->x(Lf1/n;)V

    .line 159
    .line 160
    .line 161
    iget-object v7, v15, Lf1/h;->i:Ljava/lang/Object;

    .line 162
    .line 163
    move-object v12, v7

    .line 164
    check-cast v12, Landroid/graphics/Paint;

    .line 165
    .line 166
    move-object v7, v8

    .line 167
    move v8, v11

    .line 168
    move v11, v6

    .line 169
    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->saveLayer(FFFFLandroid/graphics/Paint;)I

    .line 170
    .line 171
    .line 172
    :goto_2
    invoke-virtual {v7, v8, v9}, Landroid/graphics/Canvas;->translate(FF)V

    .line 173
    .line 174
    .line 175
    invoke-interface {v3}, Li1/d;->K()Landroid/graphics/Matrix;

    .line 176
    .line 177
    .line 178
    move-result-object v6

    .line 179
    invoke-virtual {v7, v6}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 180
    .line 181
    .line 182
    :cond_7
    if-nez v13, :cond_8

    .line 183
    .line 184
    iget-boolean v6, v0, Li1/b;->w:Z

    .line 185
    .line 186
    if-eqz v6, :cond_8

    .line 187
    .line 188
    move v6, v5

    .line 189
    goto :goto_3

    .line 190
    :cond_8
    const/4 v6, 0x0

    .line 191
    :goto_3
    if-eqz v6, :cond_d

    .line 192
    .line 193
    invoke-interface {v1}, Lf1/u;->e()V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v0}, Li1/b;->d()Lf1/c0;

    .line 197
    .line 198
    .line 199
    move-result-object v8

    .line 200
    instance-of v9, v8, Lf1/k0;

    .line 201
    .line 202
    if-eqz v9, :cond_9

    .line 203
    .line 204
    check-cast v8, Lf1/k0;

    .line 205
    .line 206
    iget-object v8, v8, Lf1/k0;->f:Le1/c;

    .line 207
    .line 208
    invoke-static {v1, v8}, Lf1/u;->k(Lf1/u;Le1/c;)V

    .line 209
    .line 210
    .line 211
    goto :goto_5

    .line 212
    :cond_9
    instance-of v9, v8, Lf1/l0;

    .line 213
    .line 214
    if-eqz v9, :cond_b

    .line 215
    .line 216
    iget-object v9, v0, Li1/b;->m:Lf1/j;

    .line 217
    .line 218
    if-eqz v9, :cond_a

    .line 219
    .line 220
    iget-object v10, v9, Lf1/j;->a:Landroid/graphics/Path;

    .line 221
    .line 222
    invoke-virtual {v10}, Landroid/graphics/Path;->rewind()V

    .line 223
    .line 224
    .line 225
    goto :goto_4

    .line 226
    :cond_a
    invoke-static {}, Lf1/l;->a()Lf1/j;

    .line 227
    .line 228
    .line 229
    move-result-object v9

    .line 230
    iput-object v9, v0, Li1/b;->m:Lf1/j;

    .line 231
    .line 232
    :goto_4
    check-cast v8, Lf1/l0;

    .line 233
    .line 234
    iget-object v8, v8, Lf1/l0;->f:Le1/d;

    .line 235
    .line 236
    invoke-static {v9, v8}, Lf1/j;->c(Lf1/j;Le1/d;)V

    .line 237
    .line 238
    .line 239
    invoke-interface {v1, v9}, Lf1/u;->d(Lf1/j;)V

    .line 240
    .line 241
    .line 242
    goto :goto_5

    .line 243
    :cond_b
    instance-of v9, v8, Lf1/j0;

    .line 244
    .line 245
    if-eqz v9, :cond_c

    .line 246
    .line 247
    check-cast v8, Lf1/j0;

    .line 248
    .line 249
    iget-object v8, v8, Lf1/j0;->f:Lf1/j;

    .line 250
    .line 251
    invoke-interface {v1, v8}, Lf1/u;->d(Lf1/j;)V

    .line 252
    .line 253
    .line 254
    goto :goto_5

    .line 255
    :cond_c
    invoke-static {}, Lokio/a;->k()V

    .line 256
    .line 257
    .line 258
    return-void

    .line 259
    :cond_d
    :goto_5
    if-eqz v2, :cond_13

    .line 260
    .line 261
    iget-object v2, v2, Li1/b;->r:Lb/f;

    .line 262
    .line 263
    iget-boolean v8, v2, Lb/f;->a:Z

    .line 264
    .line 265
    if-nez v8, :cond_e

    .line 266
    .line 267
    const-string v8, "Only add dependencies during a tracking"

    .line 268
    .line 269
    invoke-static {v8}, Lf1/g0;->a(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    :cond_e
    iget-object v8, v2, Lb/f;->d:Ljava/lang/Object;

    .line 273
    .line 274
    check-cast v8, Lf/l0;

    .line 275
    .line 276
    const/4 v9, 0x0

    .line 277
    if-eqz v8, :cond_f

    .line 278
    .line 279
    invoke-virtual {v8, v0}, Lf/l0;->a(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    goto :goto_6

    .line 283
    :cond_f
    iget-object v8, v2, Lb/f;->b:Ljava/lang/Object;

    .line 284
    .line 285
    check-cast v8, Li1/b;

    .line 286
    .line 287
    if-eqz v8, :cond_10

    .line 288
    .line 289
    sget-object v8, Lf/s0;->a:Lf/l0;

    .line 290
    .line 291
    new-instance v8, Lf/l0;

    .line 292
    .line 293
    invoke-direct {v8}, Lf/l0;-><init>()V

    .line 294
    .line 295
    .line 296
    iget-object v10, v2, Lb/f;->b:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast v10, Li1/b;

    .line 299
    .line 300
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v8, v10}, Lf/l0;->a(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    invoke-virtual {v8, v0}, Lf/l0;->a(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    iput-object v8, v2, Lb/f;->d:Ljava/lang/Object;

    .line 310
    .line 311
    iput-object v9, v2, Lb/f;->b:Ljava/lang/Object;

    .line 312
    .line 313
    goto :goto_6

    .line 314
    :cond_10
    iput-object v0, v2, Lb/f;->b:Ljava/lang/Object;

    .line 315
    .line 316
    :goto_6
    iget-object v8, v2, Lb/f;->e:Ljava/lang/Object;

    .line 317
    .line 318
    check-cast v8, Lf/l0;

    .line 319
    .line 320
    if-eqz v8, :cond_11

    .line 321
    .line 322
    invoke-virtual {v8, v0}, Lf/l0;->l(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    move-result v2

    .line 326
    xor-int/2addr v2, v5

    .line 327
    goto :goto_7

    .line 328
    :cond_11
    iget-object v8, v2, Lb/f;->c:Ljava/lang/Object;

    .line 329
    .line 330
    check-cast v8, Li1/b;

    .line 331
    .line 332
    if-eq v8, v0, :cond_12

    .line 333
    .line 334
    move v2, v5

    .line 335
    goto :goto_7

    .line 336
    :cond_12
    iput-object v9, v2, Lb/f;->c:Ljava/lang/Object;

    .line 337
    .line 338
    const/4 v2, 0x0

    .line 339
    :goto_7
    if-eqz v2, :cond_13

    .line 340
    .line 341
    iget v2, v0, Li1/b;->q:I

    .line 342
    .line 343
    add-int/2addr v2, v5

    .line 344
    iput v2, v0, Li1/b;->q:I

    .line 345
    .line 346
    :cond_13
    move-object v2, v1

    .line 347
    check-cast v2, Lf1/b;

    .line 348
    .line 349
    iget-object v2, v2, Lf1/b;->a:Landroid/graphics/Canvas;

    .line 350
    .line 351
    invoke-virtual {v2}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    .line 352
    .line 353
    .line 354
    move-result v2

    .line 355
    if-nez v2, :cond_15

    .line 356
    .line 357
    iget-object v2, v0, Li1/b;->o:Lh1/b;

    .line 358
    .line 359
    if-nez v2, :cond_14

    .line 360
    .line 361
    new-instance v2, Lh1/b;

    .line 362
    .line 363
    invoke-direct {v2}, Lh1/b;-><init>()V

    .line 364
    .line 365
    .line 366
    iput-object v2, v0, Li1/b;->o:Lh1/b;

    .line 367
    .line 368
    :cond_14
    iget-object v3, v2, Lh1/b;->h:Lb5/c;

    .line 369
    .line 370
    iget-object v5, v0, Li1/b;->b:Lu2/c;

    .line 371
    .line 372
    iget-object v8, v0, Li1/b;->c:Lu2/m;

    .line 373
    .line 374
    iget-wide v9, v0, Li1/b;->u:J

    .line 375
    .line 376
    invoke-static {v9, v10}, Lr9/e0;->q0(J)J

    .line 377
    .line 378
    .line 379
    move-result-wide v9

    .line 380
    invoke-virtual {v3}, Lb5/c;->s()Lu2/c;

    .line 381
    .line 382
    .line 383
    move-result-object v11

    .line 384
    invoke-virtual {v3}, Lb5/c;->u()Lu2/m;

    .line 385
    .line 386
    .line 387
    move-result-object v12

    .line 388
    invoke-virtual {v3}, Lb5/c;->p()Lf1/u;

    .line 389
    .line 390
    .line 391
    move-result-object v14

    .line 392
    move/from16 p0, v6

    .line 393
    .line 394
    move-object v15, v7

    .line 395
    invoke-virtual {v3}, Lb5/c;->v()J

    .line 396
    .line 397
    .line 398
    move-result-wide v6

    .line 399
    move/from16 v16, v4

    .line 400
    .line 401
    iget-object v4, v3, Lb5/c;->b:Ljava/lang/Object;

    .line 402
    .line 403
    check-cast v4, Li1/b;

    .line 404
    .line 405
    invoke-virtual {v3, v5}, Lb5/c;->R(Lu2/c;)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v3, v8}, Lb5/c;->S(Lu2/m;)V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v3, v1}, Lb5/c;->P(Lf1/u;)V

    .line 412
    .line 413
    .line 414
    invoke-virtual {v3, v9, v10}, Lb5/c;->U(J)V

    .line 415
    .line 416
    .line 417
    iput-object v0, v3, Lb5/c;->b:Ljava/lang/Object;

    .line 418
    .line 419
    invoke-interface {v1}, Lf1/u;->e()V

    .line 420
    .line 421
    .line 422
    :try_start_1
    invoke-virtual {v0, v2}, Li1/b;->c(Lh1/d;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 423
    .line 424
    .line 425
    invoke-interface {v1}, Lf1/u;->p()V

    .line 426
    .line 427
    .line 428
    invoke-virtual {v3, v11}, Lb5/c;->R(Lu2/c;)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v3, v12}, Lb5/c;->S(Lu2/m;)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v3, v14}, Lb5/c;->P(Lf1/u;)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {v3, v6, v7}, Lb5/c;->U(J)V

    .line 438
    .line 439
    .line 440
    iput-object v4, v3, Lb5/c;->b:Ljava/lang/Object;

    .line 441
    .line 442
    goto :goto_8

    .line 443
    :catchall_1
    move-exception v0

    .line 444
    invoke-interface {v1}, Lf1/u;->p()V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v3, v11}, Lb5/c;->R(Lu2/c;)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v3, v12}, Lb5/c;->S(Lu2/m;)V

    .line 451
    .line 452
    .line 453
    invoke-virtual {v3, v14}, Lb5/c;->P(Lf1/u;)V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v3, v6, v7}, Lb5/c;->U(J)V

    .line 457
    .line 458
    .line 459
    iput-object v4, v3, Lb5/c;->b:Ljava/lang/Object;

    .line 460
    .line 461
    throw v0

    .line 462
    :cond_15
    move/from16 v16, v4

    .line 463
    .line 464
    move/from16 p0, v6

    .line 465
    .line 466
    move-object v15, v7

    .line 467
    invoke-interface {v3, v1}, Li1/d;->N(Lf1/u;)V

    .line 468
    .line 469
    .line 470
    :goto_8
    if-eqz p0, :cond_16

    .line 471
    .line 472
    invoke-interface {v1}, Lf1/u;->p()V

    .line 473
    .line 474
    .line 475
    :cond_16
    if-eqz v16, :cond_17

    .line 476
    .line 477
    invoke-interface {v1}, Lf1/u;->g()V

    .line 478
    .line 479
    .line 480
    :cond_17
    if-nez v13, :cond_18

    .line 481
    .line 482
    invoke-virtual {v15}, Landroid/graphics/Canvas;->restore()V

    .line 483
    .line 484
    .line 485
    :cond_18
    :goto_9
    return-void
.end method

.method public static final v(J)J
    .locals 3

    .line 1
    sget-object v0, Lpg/a;->g:Ll3/w;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    shl-long/2addr p0, v1

    .line 5
    const-wide/16 v1, 0x1

    .line 6
    .line 7
    add-long/2addr p0, v1

    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    sget v0, Lpg/b;->a:I

    .line 12
    .line 13
    return-wide p0
.end method

.method public static w(Ljava/util/List;)Lorg/json/JSONArray;
    .locals 6

    .line 1
    new-instance v0, Lorg/json/JSONArray;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/HashSet;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v2, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    move-object v4, v3

    .line 31
    check-cast v4, Lk9/j;

    .line 32
    .line 33
    iget-object v4, v4, Lk9/j;->a:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_0

    .line 40
    .line 41
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_3

    .line 54
    .line 55
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    check-cast v1, Lk9/j;

    .line 60
    .line 61
    new-instance v2, Lorg/json/JSONObject;

    .line 62
    .line 63
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 64
    .line 65
    .line 66
    iget-object v3, v1, Lk9/j;->a:Ljava/lang/String;

    .line 67
    .line 68
    iget-object v4, v1, Lk9/j;->c:Ljava/lang/String;

    .line 69
    .line 70
    const-string v5, "id"

    .line 71
    .line 72
    invoke-virtual {v2, v5, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 73
    .line 74
    .line 75
    iget-object v3, v1, Lk9/j;->b:Ljava/lang/String;

    .line 76
    .line 77
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    const-string v5, "title"

    .line 86
    .line 87
    invoke-virtual {v2, v5, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 88
    .line 89
    .line 90
    const-string v3, "actionType"

    .line 91
    .line 92
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 93
    .line 94
    .line 95
    const-string v3, "activity"

    .line 96
    .line 97
    invoke-static {v4, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    if-eqz v3, :cond_2

    .line 102
    .line 103
    iget-object v3, v1, Lk9/j;->d:Ljava/lang/String;

    .line 104
    .line 105
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    goto :goto_2

    .line 114
    :cond_2
    const-string v3, ""

    .line 115
    .line 116
    :goto_2
    const-string v4, "target"

    .line 117
    .line 118
    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 119
    .line 120
    .line 121
    iget-object v3, v1, Lk9/j;->e:Ljava/lang/String;

    .line 122
    .line 123
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    const-string v4, "iconPath"

    .line 132
    .line 133
    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 134
    .line 135
    .line 136
    iget-object v3, v1, Lk9/j;->f:Ljava/lang/String;

    .line 137
    .line 138
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    const-string v4, "darkIconPath"

    .line 147
    .line 148
    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 149
    .line 150
    .line 151
    const-string v3, "enabled"

    .line 152
    .line 153
    iget-boolean v1, v1, Lk9/j;->g:Z

    .line 154
    .line 155
    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 159
    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_3
    return-object v0
.end method

.method public static varargs x(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/reflect/Method;
    .locals 5

    .line 1
    invoke-static {p1, p2, p4, p5}, Loh/h;->K(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :try_start_0
    new-instance v1, Lch/e;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v2, Lfh/k;

    .line 15
    .line 16
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-static {p6}, Ltf/l;->L0([Ljava/lang/Object;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-static {v2, v3}, Lfh/k;->u0(Lfh/k;Ljava/util/Collection;)V

    .line 24
    .line 25
    .line 26
    iput-object v2, v1, Lch/e;->h:Lfh/k;

    .line 27
    .line 28
    invoke-virtual {p3, v1}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    invoke-virtual {p3}, Lhh/e;->a()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p3

    .line 36
    check-cast p3, Lhh/o;

    .line 37
    .line 38
    if-eqz p3, :cond_1

    .line 39
    .line 40
    iget-object v1, p3, Lhh/o;->j:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {p1, p2, p5, v1}, Loh/h;->S(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p3, p4}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 46
    .line 47
    .line 48
    move-result-object p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    goto :goto_1

    .line 50
    :catchall_0
    move-exception p3

    .line 51
    goto :goto_0

    .line 52
    :cond_1
    move-object p3, v0

    .line 53
    goto :goto_1

    .line 54
    :goto_0
    new-instance p4, Lsf/f;

    .line 55
    .line 56
    invoke-direct {p4, p3}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    move-object p3, p4

    .line 60
    :goto_1
    invoke-static {p3}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 61
    .line 62
    .line 63
    move-result-object p4

    .line 64
    const/16 v1, 0x3f

    .line 65
    .line 66
    if-nez p4, :cond_2

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_2
    invoke-static {p6, v0, v1}, Ltf/l;->F0([Ljava/lang/Object;Lfg/l;I)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p3

    .line 73
    invoke-virtual {p4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    const-string v3, "[Hchat:Tablet] \u5b9a\u4f4d\u5931\u8d25: "

    .line 78
    .line 79
    const-string v4, " "

    .line 80
    .line 81
    invoke-static {v3, p3, v4, v2, p4}, Leh/a;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    move-object p3, v0

    .line 85
    :goto_2
    check-cast p3, Ljava/lang/reflect/Method;

    .line 86
    .line 87
    if-nez p3, :cond_3

    .line 88
    .line 89
    :try_start_1
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    const-string p4, "cache_key"

    .line 94
    .line 95
    invoke-interface {p1, p4, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-interface {p1, p5}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 104
    .line 105
    .line 106
    :catchall_1
    invoke-static {p6, v0, v1}, Ltf/l;->F0([Ljava/lang/Object;Lfg/l;I)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    new-instance p2, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    const-string p4, "[Hchat:Tablet] \u672a\u547d\u4e2d\u65b9\u6cd5: "

    .line 117
    .line 118
    invoke-direct {p2, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    const-string p1, " pkg="

    .line 125
    .line 126
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-static {p0}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    :cond_3
    return-object p3
.end method

.method public static varargs y(Landroid/content/ContentValues;[Ljava/lang/String;)Ljava/lang/Long;
    .locals 5

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    const/4 v2, 0x0

    .line 4
    if-lt v1, v0, :cond_0

    .line 5
    .line 6
    return-object v2

    .line 7
    :cond_0
    aget-object v3, p1, v1

    .line 8
    .line 9
    invoke-virtual {p0, v3}, Landroid/content/ContentValues;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    if-eqz v3, :cond_3

    .line 14
    .line 15
    instance-of v4, v3, Ljava/lang/Number;

    .line 16
    .line 17
    if-eqz v4, :cond_1

    .line 18
    .line 19
    check-cast v3, Ljava/lang/Number;

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 22
    .line 23
    .line 24
    move-result-wide p0

    .line 25
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-static {v3}, Loh/h;->J(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    if-eqz v3, :cond_3

    .line 39
    .line 40
    :try_start_0
    invoke-static {v3}, Ljava/lang/Long;->parseUnsignedLong(Ljava/lang/String;)J

    .line 41
    .line 42
    .line 43
    move-result-wide p0

    .line 44
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 45
    .line 46
    .line 47
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    goto :goto_1

    .line 49
    :catchall_0
    move-exception p0

    .line 50
    new-instance p1, Lsf/f;

    .line 51
    .line 52
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    move-object p0, p1

    .line 56
    :goto_1
    nop

    .line 57
    instance-of p1, p0, Lsf/f;

    .line 58
    .line 59
    if-eqz p1, :cond_2

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_2
    move-object v2, p0

    .line 63
    :goto_2
    check-cast v2, Ljava/lang/Long;

    .line 64
    .line 65
    return-object v2

    .line 66
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 67
    .line 68
    goto :goto_0
.end method

.method public static z(Ljava/lang/Object;Lp8/d0;)Lha/c0;
    .locals 14

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "com.tencent.mm.plugin.sns.storage.SnsInfo"

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x0

    .line 19
    const/4 v2, 0x0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    move-object v3, v2

    .line 23
    goto :goto_3

    .line 24
    :cond_0
    :try_start_0
    const-string v0, "convertTo"

    .line 25
    .line 26
    new-array v3, v1, [Ljava/lang/Object;

    .line 27
    .line 28
    invoke-static {p0, v0, v3}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    instance-of v3, v0, Landroid/content/ContentValues;

    .line 33
    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    check-cast v0, Landroid/content/ContentValues;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception v0

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move-object v0, v2

    .line 42
    :goto_0
    if-eqz v0, :cond_2

    .line 43
    .line 44
    new-instance v3, Landroid/content/ContentValues;

    .line 45
    .line 46
    invoke-direct {v3, v0}, Landroid/content/ContentValues;-><init>(Landroid/content/ContentValues;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    move-object v3, v2

    .line 51
    goto :goto_2

    .line 52
    :goto_1
    new-instance v3, Lsf/f;

    .line 53
    .line 54
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    :goto_2
    invoke-static {v3}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    if-eqz v0, :cond_3

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    new-instance v4, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    const-string v5, "\u670b\u53cb\u5708\u8bb0\u5f55\u5bfc\u51fa\u5931\u8d25: "

    .line 70
    .line 71
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {p1, v0}, Lp8/d0;->l(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :cond_3
    instance-of p1, v3, Lsf/f;

    .line 85
    .line 86
    if-eqz p1, :cond_4

    .line 87
    .line 88
    move-object v3, v2

    .line 89
    :cond_4
    check-cast v3, Landroid/content/ContentValues;

    .line 90
    .line 91
    :goto_3
    if-eqz v3, :cond_f

    .line 92
    .line 93
    const-string p1, "field_snsId"

    .line 94
    .line 95
    const-string v0, "svrId"

    .line 96
    .line 97
    const-string v4, "snsId"

    .line 98
    .line 99
    filled-new-array {v4, p1, v0}, [Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-static {v3, p1}, Loh/h;->y(Landroid/content/ContentValues;[Ljava/lang/String;)Ljava/lang/Long;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    if-eqz p1, :cond_f

    .line 108
    .line 109
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 110
    .line 111
    .line 112
    move-result-wide v6

    .line 113
    const-wide/16 v4, 0x0

    .line 114
    .line 115
    cmp-long p1, v6, v4

    .line 116
    .line 117
    if-nez p1, :cond_5

    .line 118
    .line 119
    goto/16 :goto_a

    .line 120
    .line 121
    :cond_5
    const-string p1, "userName"

    .line 122
    .line 123
    const-string v0, "field_userName"

    .line 124
    .line 125
    filled-new-array {p1, v0}, [Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    :goto_4
    const/4 v0, 0x2

    .line 130
    if-lt v1, v0, :cond_6

    .line 131
    .line 132
    const-string p1, ""

    .line 133
    .line 134
    goto :goto_6

    .line 135
    :cond_6
    aget-object v8, p1, v1

    .line 136
    .line 137
    invoke-virtual {v3, v8}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v8

    .line 141
    if-eqz v8, :cond_e

    .line 142
    .line 143
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 144
    .line 145
    .line 146
    move-result v9

    .line 147
    if-nez v9, :cond_7

    .line 148
    .line 149
    goto :goto_5

    .line 150
    :cond_7
    move-object v8, v2

    .line 151
    :goto_5
    if-eqz v8, :cond_e

    .line 152
    .line 153
    move-object p1, v8

    .line 154
    :goto_6
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v8

    .line 162
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    if-eqz p1, :cond_8

    .line 167
    .line 168
    goto/16 :goto_a

    .line 169
    .line 170
    :cond_8
    const-string p1, "timestamp"

    .line 171
    .line 172
    const-string v1, "field_timestamp"

    .line 173
    .line 174
    const-string v2, "createTime"

    .line 175
    .line 176
    const-string v9, "field_createTime"

    .line 177
    .line 178
    const-string v10, "create_time"

    .line 179
    .line 180
    filled-new-array {v2, v9, v10, p1, v1}, [Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    invoke-static {v3, p1}, Loh/h;->y(Landroid/content/ContentValues;[Ljava/lang/String;)Ljava/lang/Long;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    if-eqz p1, :cond_9

    .line 189
    .line 190
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 191
    .line 192
    .line 193
    move-result-wide v4

    .line 194
    :cond_9
    move-wide v9, v4

    .line 195
    const-string p1, "type"

    .line 196
    .line 197
    const-string v1, "field_type"

    .line 198
    .line 199
    filled-new-array {p1, v1}, [Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    invoke-static {v3, p1}, Loh/h;->y(Landroid/content/ContentValues;[Ljava/lang/String;)Ljava/lang/Long;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    if-eqz p1, :cond_a

    .line 208
    .line 209
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 210
    .line 211
    .line 212
    move-result-wide v1

    .line 213
    long-to-int p1, v1

    .line 214
    goto :goto_7

    .line 215
    :cond_a
    const/4 p1, -0x1

    .line 216
    :goto_7
    invoke-static {p0}, Lr9/e0;->L(Ljava/lang/Object;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v12

    .line 220
    new-instance v4, Lha/c0;

    .line 221
    .line 222
    invoke-static {v6, v7}, Ljava/lang/Long;->toUnsignedString(J)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v5

    .line 226
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    sget-object v1, Lha/d0;->h:La2/a;

    .line 230
    .line 231
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    const/4 v1, 0x1

    .line 235
    if-eq p1, v1, :cond_d

    .line 236
    .line 237
    if-eq p1, v0, :cond_c

    .line 238
    .line 239
    const/16 v0, 0xf

    .line 240
    .line 241
    if-eq p1, v0, :cond_b

    .line 242
    .line 243
    const/16 v0, 0x36

    .line 244
    .line 245
    if-eq p1, v0, :cond_d

    .line 246
    .line 247
    sget-object p1, Lha/d0;->l:Lha/d0;

    .line 248
    .line 249
    :goto_8
    move-object v13, p0

    .line 250
    move-object v11, p1

    .line 251
    goto :goto_9

    .line 252
    :cond_b
    sget-object p1, Lha/d0;->k:Lha/d0;

    .line 253
    .line 254
    goto :goto_8

    .line 255
    :cond_c
    sget-object p1, Lha/d0;->i:Lha/d0;

    .line 256
    .line 257
    goto :goto_8

    .line 258
    :cond_d
    sget-object p1, Lha/d0;->j:Lha/d0;

    .line 259
    .line 260
    goto :goto_8

    .line 261
    :goto_9
    invoke-direct/range {v4 .. v13}, Lha/c0;-><init>(Ljava/lang/String;JLjava/lang/String;JLha/d0;Ljava/lang/String;Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    move-object v2, v4

    .line 265
    goto :goto_a

    .line 266
    :cond_e
    move-object v13, p0

    .line 267
    add-int/lit8 v1, v1, 0x1

    .line 268
    .line 269
    move-object p0, v13

    .line 270
    goto/16 :goto_4

    .line 271
    .line 272
    :cond_f
    :goto_a
    return-object v2
.end method
