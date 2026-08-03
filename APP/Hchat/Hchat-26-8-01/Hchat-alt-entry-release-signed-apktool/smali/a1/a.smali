.class public final synthetic La1/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lib/c;Lr8/g;)V
    .locals 0

    .line 1
    const/16 p1, 0x17

    .line 2
    .line 3
    iput p1, p0, La1/a;->g:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, La1/a;->h:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 11
    iput p2, p0, La1/a;->g:I

    iput-object p1, p0, La1/a;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()V
    .locals 4

    .line 1
    iget-object v0, p0, La1/a;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lg8/g;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-boolean v1, v0, Lg8/g;->e:Z

    .line 7
    .line 8
    if-nez v1, :cond_2

    .line 9
    .line 10
    iget-object v1, v0, Lg8/g;->a:Lo8/d;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-instance v2, Lg8/e;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, v0, v3}, Lg8/e;-><init>(Ljava/lang/Object;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v2}, Lo8/d;->g(Lo8/c;)V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    iput-boolean v1, v0, Lg8/g;->e:Z

    .line 26
    .line 27
    const-string v1, "\u7fa4\u804a\u53d8\u66f4\u76d1\u542c\u5df2\u5b89\u88c5"

    .line 28
    .line 29
    iget-object v2, v0, Lg8/g;->c:Lg1/d;

    .line 30
    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    const-string v2, "[WeChatChatroomChangeApi] "

    .line 34
    .line 35
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-static {v1}, Li8/i;->f(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    :cond_1
    monitor-exit v0

    .line 43
    goto :goto_1

    .line 44
    :catchall_0
    move-exception v1

    .line 45
    goto :goto_2

    .line 46
    :cond_2
    :goto_0
    monitor-exit v0

    .line 47
    :goto_1
    return-void

    .line 48
    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    throw v1
.end method

.method private final b()V
    .locals 8

    .line 1
    iget-object v0, p0, La1/a;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lq8/o;

    .line 4
    .line 5
    const-string v1, "\u5f53\u524dActivity Hook\u5931\u8d25: "

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-boolean v2, v0, Lq8/o;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return-void

    .line 14
    :cond_0
    :try_start_1
    const-class v2, Landroid/app/Activity;

    .line 15
    .line 16
    const-string v3, "onResume"

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    new-array v5, v4, [Ljava/lang/Class;

    .line 20
    .line 21
    invoke-static {v2, v3, v5}, Lh/Hchat/utils/KavaReflector;->findDeclaredMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    const-class v3, Landroid/app/Activity;

    .line 26
    .line 27
    const-string v5, "onPause"

    .line 28
    .line 29
    new-array v6, v4, [Ljava/lang/Class;

    .line 30
    .line 31
    invoke-static {v3, v5, v6}, Lh/Hchat/utils/KavaReflector;->findDeclaredMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    const-class v5, Landroid/app/Activity;

    .line 36
    .line 37
    const-string v6, "onDestroy"

    .line 38
    .line 39
    new-array v4, v4, [Ljava/lang/Class;

    .line 40
    .line 41
    invoke-static {v5, v6, v4}, Lh/Hchat/utils/KavaReflector;->findDeclaredMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    sget-object v5, Lr8/i;->b:Lr8/i;

    .line 46
    .line 47
    new-instance v6, Lq8/n;

    .line 48
    .line 49
    const/4 v7, 0x0

    .line 50
    invoke-direct {v6, v0, v7}, Lq8/n;-><init>(Lq8/o;I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v5, v2, v6}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 54
    .line 55
    .line 56
    new-instance v2, Lq8/n;

    .line 57
    .line 58
    const/4 v6, 0x1

    .line 59
    invoke-direct {v2, v0, v6}, Lq8/n;-><init>(Lq8/o;I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v5, v3, v2}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v5, v4, v2}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 66
    .line 67
    .line 68
    const/4 v2, 0x1

    .line 69
    iput-boolean v2, v0, Lq8/o;->c:Z

    .line 70
    .line 71
    const-string v2, "\u5f53\u524dActivity Hook\u5df2\u5b89\u88c5"

    .line 72
    .line 73
    iget-object v3, v0, Lq8/o;->a:Li8/f;

    .line 74
    .line 75
    if-eqz v3, :cond_1

    .line 76
    .line 77
    const-string v3, "[WeChatCurrentActivityApi] "

    .line 78
    .line 79
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-static {v2}, Li8/i;->f(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :catchall_0
    move-exception v2

    .line 88
    :try_start_2
    new-instance v3, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    iget-object v2, v0, Lq8/o;->a:Li8/f;

    .line 105
    .line 106
    if-eqz v2, :cond_1

    .line 107
    .line 108
    const-string v2, "[WeChatCurrentActivityApi] "

    .line 109
    .line 110
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-static {v1}, Li8/i;->f(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 115
    .line 116
    .line 117
    :cond_1
    :goto_0
    monitor-exit v0

    .line 118
    return-void

    .line 119
    :catchall_1
    move-exception v1

    .line 120
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 121
    throw v1
.end method

.method private final c()V
    .locals 4

    .line 1
    iget-object v0, p0, La1/a;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lq8/i;

    .line 4
    .line 5
    const-string v1, "Activity\u542f\u52a8\u76d1\u542cHook: methods="

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-boolean v2, v0, Lq8/i;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return-void

    .line 14
    :cond_0
    :try_start_1
    const-class v2, Landroid/app/Activity;

    .line 15
    .line 16
    invoke-virtual {v0, v2}, Lq8/i;->a(Ljava/lang/Class;)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const-class v3, Landroid/content/ContextWrapper;

    .line 21
    .line 22
    invoke-virtual {v0, v3}, Lq8/i;->a(Ljava/lang/Class;)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    add-int/2addr v2, v3

    .line 27
    if-lez v2, :cond_1

    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v3, 0x0

    .line 32
    :goto_0
    iput-boolean v3, v0, Lq8/i;->c:Z

    .line 33
    .line 34
    new-instance v3, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iget-object v2, v0, Lq8/i;->a:Li8/f;

    .line 47
    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    const-string v2, "[WeChatActivityStartApi] "

    .line 51
    .line 52
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-static {v1}, Li8/i;->f(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 57
    .line 58
    .line 59
    :cond_2
    monitor-exit v0

    .line 60
    return-void

    .line 61
    :catchall_0
    move-exception v1

    .line 62
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 63
    throw v1
.end method

.method private final d()V
    .locals 5

    .line 1
    iget-object v0, p0, La1/a;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lq8/q;

    .line 4
    .line 5
    const-string v1, "\u751f\u547d\u5468\u671f\u76d1\u542cHook: methods="

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-boolean v2, v0, Lq8/q;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return-void

    .line 14
    :cond_0
    :try_start_1
    const-string v2, "onResume"

    .line 15
    .line 16
    const-string v3, "resume"

    .line 17
    .line 18
    invoke-virtual {v0, v2, v3}, Lq8/q;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const-string v3, "onPause"

    .line 23
    .line 24
    const-string v4, "pause"

    .line 25
    .line 26
    invoke-virtual {v0, v3, v4}, Lq8/q;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    add-int/2addr v2, v3

    .line 31
    const-string v3, "onDestroy"

    .line 32
    .line 33
    const-string v4, "destroy"

    .line 34
    .line 35
    invoke-virtual {v0, v3, v4}, Lq8/q;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    add-int/2addr v2, v3

    .line 40
    if-lez v2, :cond_1

    .line 41
    .line 42
    const/4 v3, 0x1

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const/4 v3, 0x0

    .line 45
    :goto_0
    iput-boolean v3, v0, Lq8/q;->c:Z

    .line 46
    .line 47
    new-instance v3, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v0, v1}, Lq8/q;->b(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 60
    .line 61
    .line 62
    monitor-exit v0

    .line 63
    return-void

    .line 64
    :catchall_0
    move-exception v1

    .line 65
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 66
    throw v1
.end method

.method private final e()V
    .locals 4

    .line 1
    iget-object v0, p0, La1/a;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lq8/m;

    .line 4
    .line 5
    const-string v1, "\u804a\u5929\u9875\u76d1\u542c\u5df2\u5b89\u88c5: dexMethods="

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-boolean v2, v0, Lq8/m;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    :try_start_1
    invoke-virtual {v0}, Lq8/m;->d()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    iput v2, v0, Lq8/m;->i:I

    .line 19
    .line 20
    iget-object v2, v0, Lq8/m;->d:Lq8/i;

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    new-instance v3, Lq8/j;

    .line 25
    .line 26
    invoke-direct {v3, v0}, Lq8/j;-><init>(Lq8/m;)V

    .line 27
    .line 28
    .line 29
    iget-object v2, v2, Lq8/i;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 30
    .line 31
    invoke-virtual {v2, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->addIfAbsent(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception v1

    .line 36
    goto :goto_2

    .line 37
    :cond_1
    :goto_0
    iget-object v2, v0, Lq8/m;->c:Lq8/q;

    .line 38
    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    new-instance v3, Lq8/k;

    .line 42
    .line 43
    invoke-direct {v3, v0}, Lq8/k;-><init>(Lq8/m;)V

    .line 44
    .line 45
    .line 46
    iget-object v2, v2, Lq8/q;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 47
    .line 48
    invoke-virtual {v2, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->addIfAbsent(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    :cond_2
    const/4 v2, 0x1

    .line 52
    iput-boolean v2, v0, Lq8/m;->h:Z

    .line 53
    .line 54
    new-instance v2, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    iget v1, v0, Lq8/m;->i:I

    .line 60
    .line 61
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {v0, v1}, Lq8/m;->e(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 69
    .line 70
    .line 71
    monitor-exit v0

    .line 72
    :goto_1
    return-void

    .line 73
    :goto_2
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 74
    throw v1
.end method

.method private final f()V
    .locals 5

    .line 1
    iget-object v0, p0, La1/a;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ll3/r;

    .line 4
    .line 5
    const-string v1, "fetchFonts result is not OK. ("

    .line 6
    .line 7
    iget-object v2, v0, Ll3/r;->d:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v2

    .line 10
    :try_start_0
    iget-object v3, v0, Ll3/r;->h:La7/a;

    .line 11
    .line 12
    if-nez v3, :cond_0

    .line 13
    .line 14
    monitor-exit v2

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    goto/16 :goto_7

    .line 18
    .line 19
    :cond_0
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    :try_start_1
    invoke-virtual {v0}, Ll3/r;->c()Le3/d;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    iget v3, v2, Le3/d;->e:I

    .line 25
    .line 26
    const/4 v4, 0x2

    .line 27
    if-ne v3, v4, :cond_1

    .line 28
    .line 29
    iget-object v4, v0, Ll3/r;->d:Ljava/lang/Object;

    .line 30
    .line 31
    monitor-enter v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 32
    :try_start_2
    monitor-exit v4

    .line 33
    goto :goto_0

    .line 34
    :catchall_1
    move-exception v1

    .line 35
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 36
    :try_start_3
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 37
    :catchall_2
    move-exception v1

    .line 38
    goto/16 :goto_4

    .line 39
    .line 40
    :cond_1
    :goto_0
    if-nez v3, :cond_4

    .line 41
    .line 42
    :try_start_4
    const-string v1, "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"

    .line 43
    .line 44
    sget v3, Ld3/c;->a:I

    .line 45
    .line 46
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget-object v1, v0, Ll3/r;->c:La2/a;

    .line 50
    .line 51
    iget-object v3, v0, Ll3/r;->a:Landroid/content/Context;

    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    filled-new-array {v2}, [Le3/d;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    sget-object v4, Lb3/c;->a:La/a;

    .line 61
    .line 62
    const-string v4, "TypefaceCompat.createFromFontInfo"

    .line 63
    .line 64
    invoke-static {v4}, La/a;->o(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 65
    .line 66
    .line 67
    :try_start_5
    sget-object v4, Lb3/c;->a:La/a;

    .line 68
    .line 69
    invoke-virtual {v4, v3, v1}, La/a;->D(Landroid/content/Context;[Le3/d;)Landroid/graphics/Typeface;

    .line 70
    .line 71
    .line 72
    move-result-object v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    .line 73
    :try_start_6
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 74
    .line 75
    .line 76
    iget-object v3, v0, Ll3/r;->a:Landroid/content/Context;

    .line 77
    .line 78
    iget-object v2, v2, Le3/d;->a:Landroid/net/Uri;

    .line 79
    .line 80
    invoke-static {v3, v2}, La7/a;->C(Landroid/content/Context;Landroid/net/Uri;)Ljava/nio/MappedByteBuffer;

    .line 81
    .line 82
    .line 83
    move-result-object v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 84
    if-eqz v2, :cond_3

    .line 85
    .line 86
    if-eqz v1, :cond_3

    .line 87
    .line 88
    :try_start_7
    const-string v3, "EmojiCompat.MetadataRepo.create"

    .line 89
    .line 90
    invoke-static {v3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    new-instance v3, Lhb/c;

    .line 94
    .line 95
    invoke-static {v2}, Lbe/h;->T(Ljava/nio/MappedByteBuffer;)Lm3/b;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-direct {v3, v1, v2}, Lhb/c;-><init>(Landroid/graphics/Typeface;Lm3/b;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 100
    .line 101
    .line 102
    :try_start_8
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 103
    .line 104
    .line 105
    :try_start_9
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 106
    .line 107
    .line 108
    iget-object v1, v0, Ll3/r;->d:Ljava/lang/Object;

    .line 109
    .line 110
    monitor-enter v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 111
    :try_start_a
    iget-object v2, v0, Ll3/r;->h:La7/a;

    .line 112
    .line 113
    if-eqz v2, :cond_2

    .line 114
    .line 115
    invoke-virtual {v2, v3}, La7/a;->E(Lhb/c;)V

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :catchall_3
    move-exception v2

    .line 120
    goto :goto_2

    .line 121
    :cond_2
    :goto_1
    monitor-exit v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 122
    :try_start_b
    invoke-virtual {v0}, Ll3/r;->b()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :goto_2
    :try_start_c
    monitor-exit v1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 127
    :try_start_d
    throw v2
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 128
    :catchall_4
    move-exception v1

    .line 129
    :try_start_e
    sget v2, Ld3/c;->a:I

    .line 130
    .line 131
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 132
    .line 133
    .line 134
    throw v1

    .line 135
    :cond_3
    new-instance v1, Ljava/lang/RuntimeException;

    .line 136
    .line 137
    const-string v2, "Unable to open file."

    .line 138
    .line 139
    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    throw v1

    .line 143
    :catchall_5
    move-exception v1

    .line 144
    goto :goto_3

    .line 145
    :catchall_6
    move-exception v1

    .line 146
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 147
    .line 148
    .line 149
    throw v1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    .line 150
    :goto_3
    :try_start_f
    sget v2, Ld3/c;->a:I

    .line 151
    .line 152
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 153
    .line 154
    .line 155
    throw v1

    .line 156
    :cond_4
    new-instance v2, Ljava/lang/RuntimeException;

    .line 157
    .line 158
    new-instance v4, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    const-string v1, ")"

    .line 167
    .line 168
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    throw v2
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    .line 179
    :goto_4
    iget-object v3, v0, Ll3/r;->d:Ljava/lang/Object;

    .line 180
    .line 181
    monitor-enter v3

    .line 182
    :try_start_10
    iget-object v2, v0, Ll3/r;->h:La7/a;

    .line 183
    .line 184
    if-eqz v2, :cond_5

    .line 185
    .line 186
    invoke-virtual {v2, v1}, La7/a;->D(Ljava/lang/Throwable;)V

    .line 187
    .line 188
    .line 189
    goto :goto_5

    .line 190
    :catchall_7
    move-exception v0

    .line 191
    goto :goto_6

    .line 192
    :cond_5
    :goto_5
    monitor-exit v3
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    .line 193
    invoke-virtual {v0}, Ll3/r;->b()V

    .line 194
    .line 195
    .line 196
    return-void

    .line 197
    :goto_6
    :try_start_11
    monitor-exit v3
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    .line 198
    throw v0

    .line 199
    :goto_7
    :try_start_12
    monitor-exit v2
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_0

    .line 200
    throw v0
.end method

.method private final g()V
    .locals 9

    .line 1
    iget-object v0, p0, La1/a;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lrb/k;

    .line 4
    .line 5
    const-string v1, "\u6b63\u5728\u68c0\u6d4b "

    .line 6
    .line 7
    iget-object v2, v0, Lrb/k;->d:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v2

    .line 10
    :try_start_0
    iget-boolean v3, v0, Lrb/k;->m:Z

    .line 11
    .line 12
    if-eqz v3, :cond_f

    .line 13
    .line 14
    iget-object v3, v0, Lrb/k;->q:Lrb/h;

    .line 15
    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    goto/16 :goto_c

    .line 19
    .line 20
    :cond_0
    iget-object v3, v0, Lrb/k;->g:Ljava/util/ArrayDeque;

    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    const/4 v4, 0x0

    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    move-object v3, v4

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iget-object v3, v0, Lrb/k;->g:Ljava/util/ArrayDeque;

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    check-cast v3, Lrb/j;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    .line 38
    .line 39
    :goto_0
    monitor-exit v2

    .line 40
    if-nez v3, :cond_2

    .line 41
    .line 42
    invoke-virtual {v0}, Lrb/k;->e()V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_2
    iget-object v2, v0, Lrb/k;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 47
    .line 48
    iget-object v5, v3, Lrb/j;->a:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v2, v5}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    check-cast v2, Ljava/lang/String;

    .line 55
    .line 56
    if-nez v2, :cond_3

    .line 57
    .line 58
    const-string v2, ""

    .line 59
    .line 60
    :cond_3
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz v5, :cond_4

    .line 65
    .line 66
    iget-object v2, v3, Lrb/j;->a:Ljava/lang/String;

    .line 67
    .line 68
    :cond_4
    :try_start_1
    iget-object v5, v0, Lrb/k;->k:Lrb/c;

    .line 69
    .line 70
    if-eqz v5, :cond_5

    .line 71
    .line 72
    iget-object v6, v3, Lrb/j;->a:Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {v5, v6}, Lrb/c;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 78
    goto :goto_2

    .line 79
    :catchall_0
    move-exception v5

    .line 80
    goto :goto_1

    .line 81
    :cond_5
    move-object v5, v4

    .line 82
    goto :goto_2

    .line 83
    :goto_1
    new-instance v6, Lsf/f;

    .line 84
    .line 85
    invoke-direct {v6, v5}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    move-object v5, v6

    .line 89
    :goto_2
    nop

    .line 90
    instance-of v6, v5, Lsf/f;

    .line 91
    .line 92
    if-eqz v6, :cond_6

    .line 93
    .line 94
    move-object v5, v4

    .line 95
    :cond_6
    if-nez v5, :cond_7

    .line 96
    .line 97
    new-instance v1, Lrb/d;

    .line 98
    .line 99
    iget-object v3, v3, Lrb/j;->a:Ljava/lang/String;

    .line 100
    .line 101
    sget-object v4, Lrb/e;->i:Lrb/e;

    .line 102
    .line 103
    const-string v5, "\u6784\u9020\u68c0\u6d4b\u8bf7\u6c42\u5931\u8d25"

    .line 104
    .line 105
    invoke-direct {v1, v3, v2, v4, v5}, Lrb/d;-><init>(Ljava/lang/String;Ljava/lang/String;Lrb/e;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v1}, Lrb/k;->i(Lrb/d;)V

    .line 109
    .line 110
    .line 111
    goto/16 :goto_9

    .line 112
    .line 113
    :cond_7
    new-instance v6, Lrb/h;

    .line 114
    .line 115
    invoke-direct {v6, v3, v5}, Lrb/h;-><init>(Lrb/j;Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    iget-object v7, v0, Lrb/k;->d:Ljava/lang/Object;

    .line 119
    .line 120
    monitor-enter v7

    .line 121
    :try_start_2
    iget-boolean v8, v0, Lrb/k;->m:Z

    .line 122
    .line 123
    if-nez v8, :cond_8

    .line 124
    .line 125
    iget-object v1, v0, Lrb/k;->g:Ljava/util/ArrayDeque;

    .line 126
    .line 127
    invoke-virtual {v1, v3}, Ljava/util/ArrayDeque;->addFirst(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0}, Lrb/k;->h()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 131
    .line 132
    .line 133
    monitor-exit v7

    .line 134
    goto/16 :goto_9

    .line 135
    .line 136
    :catchall_1
    move-exception v0

    .line 137
    goto/16 :goto_b

    .line 138
    .line 139
    :cond_8
    :try_start_3
    iput-object v6, v0, Lrb/k;->q:Lrb/h;

    .line 140
    .line 141
    iput-object v2, v0, Lrb/k;->o:Ljava/lang/String;

    .line 142
    .line 143
    new-instance v3, Ljava/lang/StringBuilder;

    .line 144
    .line 145
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    iput-object v1, v0, Lrb/k;->n:Ljava/lang/String;

    .line 156
    .line 157
    invoke-virtual {v0}, Lrb/k;->h()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 158
    .line 159
    .line 160
    monitor-exit v7

    .line 161
    invoke-virtual {v0}, Lrb/k;->m()V

    .line 162
    .line 163
    .line 164
    const/4 v1, 0x0

    .line 165
    :try_start_4
    iget-object v2, v0, Lrb/k;->k:Lrb/c;

    .line 166
    .line 167
    if-eqz v2, :cond_a

    .line 168
    .line 169
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->network()Lm8/a;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    if-eqz v3, :cond_9

    .line 174
    .line 175
    iget-object v2, v2, Lrb/c;->a:Lr8/g;

    .line 176
    .line 177
    iget-object v2, v2, Lr8/g;->e:Lh/Hchat/dexkit/DexFinder;

    .line 178
    .line 179
    invoke-virtual {v3, v2}, Lm8/a;->a(Lh/Hchat/dexkit/DexFinder;)V

    .line 180
    .line 181
    .line 182
    iget-object v2, v3, Lm8/a;->a:Lm8/c;

    .line 183
    .line 184
    invoke-virtual {v2, v5}, Lm8/c;->j(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    goto :goto_3

    .line 189
    :cond_9
    move v2, v1

    .line 190
    :goto_3
    const/4 v3, 0x1

    .line 191
    if-ne v2, v3, :cond_a

    .line 192
    .line 193
    goto :goto_4

    .line 194
    :cond_a
    move v3, v1

    .line 195
    :goto_4
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 196
    .line 197
    .line 198
    move-result-object v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 199
    goto :goto_5

    .line 200
    :catchall_2
    move-exception v2

    .line 201
    new-instance v3, Lsf/f;

    .line 202
    .line 203
    invoke-direct {v3, v2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 204
    .line 205
    .line 206
    move-object v2, v3

    .line 207
    :goto_5
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 208
    .line 209
    instance-of v5, v2, Lsf/f;

    .line 210
    .line 211
    if-eqz v5, :cond_b

    .line 212
    .line 213
    move-object v2, v3

    .line 214
    :cond_b
    check-cast v2, Ljava/lang/Boolean;

    .line 215
    .line 216
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 217
    .line 218
    .line 219
    move-result v2

    .line 220
    if-nez v2, :cond_d

    .line 221
    .line 222
    iget-object v1, v0, Lrb/k;->d:Ljava/lang/Object;

    .line 223
    .line 224
    monitor-enter v1

    .line 225
    :try_start_5
    iget-object v2, v0, Lrb/k;->q:Lrb/h;

    .line 226
    .line 227
    if-ne v2, v6, :cond_c

    .line 228
    .line 229
    iput-object v4, v0, Lrb/k;->q:Lrb/h;

    .line 230
    .line 231
    goto :goto_6

    .line 232
    :catchall_3
    move-exception v0

    .line 233
    goto :goto_7

    .line 234
    :cond_c
    :goto_6
    const-string v2, ""

    .line 235
    .line 236
    iput-object v2, v0, Lrb/k;->o:Ljava/lang/String;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 237
    .line 238
    monitor-exit v1

    .line 239
    const-string v1, "\u68c0\u6d4b\u8bf7\u6c42\u53d1\u9001\u5931\u8d25"

    .line 240
    .line 241
    invoke-virtual {v0, v6, v1}, Lrb/k;->f(Lrb/h;Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    goto :goto_9

    .line 245
    :goto_7
    monitor-exit v1

    .line 246
    throw v0

    .line 247
    :cond_d
    iget-object v2, v0, Lrb/k;->e:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 248
    .line 249
    new-instance v3, Lrb/g;

    .line 250
    .line 251
    const/4 v4, 0x0

    .line 252
    invoke-direct {v3, v0, v4, v6}, Lrb/g;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    iget-object v4, v0, Lrb/k;->c:Lrb/l;

    .line 256
    .line 257
    iget-object v4, v4, Lrb/l;->a:Landroid/content/SharedPreferences;

    .line 258
    .line 259
    const-string v5, "zombie_check_timeout_seconds"

    .line 260
    .line 261
    const/16 v7, 0xf

    .line 262
    .line 263
    invoke-interface {v4, v5, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 264
    .line 265
    .line 266
    move-result v4

    .line 267
    const/4 v5, 0x5

    .line 268
    const/16 v7, 0x3c

    .line 269
    .line 270
    invoke-static {v4, v5, v7}, Lr9/e0;->r(III)I

    .line 271
    .line 272
    .line 273
    move-result v4

    .line 274
    int-to-long v4, v4

    .line 275
    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 276
    .line 277
    invoke-virtual {v2, v3, v4, v5, v7}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    iget-object v3, v0, Lrb/k;->d:Ljava/lang/Object;

    .line 282
    .line 283
    monitor-enter v3

    .line 284
    :try_start_6
    iget-object v0, v0, Lrb/k;->q:Lrb/h;

    .line 285
    .line 286
    if-ne v0, v6, :cond_e

    .line 287
    .line 288
    iput-object v2, v6, Lrb/h;->c:Ljava/util/concurrent/ScheduledFuture;

    .line 289
    .line 290
    goto :goto_8

    .line 291
    :catchall_4
    move-exception v0

    .line 292
    goto :goto_a

    .line 293
    :cond_e
    invoke-interface {v2, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 294
    .line 295
    .line 296
    :goto_8
    monitor-exit v3

    .line 297
    :goto_9
    return-void

    .line 298
    :goto_a
    monitor-exit v3

    .line 299
    throw v0

    .line 300
    :goto_b
    monitor-exit v7

    .line 301
    throw v0

    .line 302
    :catchall_5
    move-exception v0

    .line 303
    goto :goto_d

    .line 304
    :cond_f
    :goto_c
    monitor-exit v2

    .line 305
    return-void

    .line 306
    :goto_d
    monitor-exit v2

    .line 307
    throw v0
.end method


# virtual methods
.method public final run()V
    .locals 26

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, La1/a;->g:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x3

    .line 7
    const/4 v4, 0x2

    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v6, 0x1

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v0, v1, La1/a;->h:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lgg/q;

    .line 16
    .line 17
    iput-boolean v5, v0, Lgg/q;->g:Z

    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    iget-object v0, v1, La1/a;->h:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lu9/f;

    .line 23
    .line 24
    invoke-virtual {v0}, Lu9/f;->invoke()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_1
    iget-object v0, v1, La1/a;->h:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Lra/c;

    .line 31
    .line 32
    invoke-virtual {v0}, Lra/c;->f()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_2
    invoke-direct {v1}, La1/a;->g()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_3
    iget-object v0, v1, La1/a;->h:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Ln2/v;

    .line 43
    .line 44
    iget-object v7, v0, Ln2/v;->b:Lb5/c;

    .line 45
    .line 46
    iput-object v2, v0, Ln2/v;->n:La1/a;

    .line 47
    .line 48
    iget-object v8, v0, Ln2/v;->m:Lj0/b;

    .line 49
    .line 50
    iget-object v0, v0, Ln2/v;->a:Landroid/view/View;

    .line 51
    .line 52
    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    .line 53
    .line 54
    .line 55
    move-result v9

    .line 56
    if-nez v9, :cond_0

    .line 57
    .line 58
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v0}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    if-eqz v0, :cond_0

    .line 67
    .line 68
    invoke-virtual {v0}, Landroid/view/View;->onCheckIsTextEditor()Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-ne v0, v6, :cond_0

    .line 73
    .line 74
    invoke-virtual {v8}, Lj0/b;->g()V

    .line 75
    .line 76
    .line 77
    goto/16 :goto_6

    .line 78
    .line 79
    :cond_0
    iget-object v0, v8, Lj0/b;->g:[Ljava/lang/Object;

    .line 80
    .line 81
    iget v9, v8, Lj0/b;->i:I

    .line 82
    .line 83
    move-object v10, v2

    .line 84
    move v11, v5

    .line 85
    :goto_0
    if-ge v11, v9, :cond_7

    .line 86
    .line 87
    aget-object v12, v0, v11

    .line 88
    .line 89
    check-cast v12, Ln2/u;

    .line 90
    .line 91
    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    .line 92
    .line 93
    .line 94
    move-result v13

    .line 95
    if-eqz v13, :cond_5

    .line 96
    .line 97
    if-eq v13, v6, :cond_4

    .line 98
    .line 99
    if-eq v13, v4, :cond_2

    .line 100
    .line 101
    if-ne v13, v3, :cond_1

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_1
    invoke-static {}, Lokio/a;->k()V

    .line 105
    .line 106
    .line 107
    goto/16 :goto_6

    .line 108
    .line 109
    :cond_2
    :goto_1
    sget-object v13, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 110
    .line 111
    invoke-static {v2, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v13

    .line 115
    if-nez v13, :cond_6

    .line 116
    .line 117
    sget-object v10, Ln2/u;->i:Ln2/u;

    .line 118
    .line 119
    if-ne v12, v10, :cond_3

    .line 120
    .line 121
    move v10, v6

    .line 122
    goto :goto_2

    .line 123
    :cond_3
    move v10, v5

    .line 124
    :goto_2
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 125
    .line 126
    .line 127
    move-result-object v10

    .line 128
    goto :goto_4

    .line 129
    :cond_4
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 130
    .line 131
    :goto_3
    move-object v10, v2

    .line 132
    goto :goto_4

    .line 133
    :cond_5
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_6
    :goto_4
    add-int/lit8 v11, v11, 0x1

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_7
    invoke-virtual {v8}, Lj0/b;->g()V

    .line 140
    .line 141
    .line 142
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 143
    .line 144
    invoke-static {v2, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-eqz v0, :cond_8

    .line 149
    .line 150
    iget-object v0, v7, Lb5/c;->b:Ljava/lang/Object;

    .line 151
    .line 152
    invoke-interface {v0}, Lsf/c;->getValue()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 157
    .line 158
    iget-object v3, v7, Lb5/c;->a:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v3, Landroid/view/View;

    .line 161
    .line 162
    invoke-virtual {v0, v3}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    .line 163
    .line 164
    .line 165
    :cond_8
    if-eqz v10, :cond_a

    .line 166
    .line 167
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    if-eqz v0, :cond_9

    .line 172
    .line 173
    iget-object v0, v7, Lb5/c;->c:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v0, Landroidx/lifecycle/x;

    .line 176
    .line 177
    iget-object v0, v0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v0, Landroidx/lifecycle/x;

    .line 180
    .line 181
    invoke-virtual {v0}, Landroidx/lifecycle/x;->b0()V

    .line 182
    .line 183
    .line 184
    goto :goto_5

    .line 185
    :cond_9
    iget-object v0, v7, Lb5/c;->c:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v0, Landroidx/lifecycle/x;

    .line 188
    .line 189
    iget-object v0, v0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v0, Landroidx/lifecycle/x;

    .line 192
    .line 193
    invoke-virtual {v0}, Landroidx/lifecycle/x;->y()V

    .line 194
    .line 195
    .line 196
    :cond_a
    :goto_5
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 197
    .line 198
    invoke-static {v2, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    if-eqz v0, :cond_b

    .line 203
    .line 204
    iget-object v0, v7, Lb5/c;->b:Ljava/lang/Object;

    .line 205
    .line 206
    invoke-interface {v0}, Lsf/c;->getValue()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 211
    .line 212
    iget-object v2, v7, Lb5/c;->a:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v2, Landroid/view/View;

    .line 215
    .line 216
    invoke-virtual {v0, v2}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    .line 217
    .line 218
    .line 219
    :cond_b
    :goto_6
    return-void

    .line 220
    :pswitch_4
    invoke-direct {v1}, La1/a;->f()V

    .line 221
    .line 222
    .line 223
    return-void

    .line 224
    :pswitch_5
    iget-object v0, v1, La1/a;->h:Ljava/lang/Object;

    .line 225
    .line 226
    check-cast v0, Lr8/g;

    .line 227
    .line 228
    :try_start_0
    new-instance v2, Le8/c;

    .line 229
    .line 230
    iget-object v3, v0, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 231
    .line 232
    iget-object v4, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 233
    .line 234
    iget-object v0, v0, Lr8/g;->a:Landroid/content/Context;

    .line 235
    .line 236
    invoke-direct {v2, v3, v4, v0}, Le8/c;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Landroid/content/Context;)V

    .line 237
    .line 238
    .line 239
    new-instance v3, Lib/b;

    .line 240
    .line 241
    invoke-direct {v3, v0, v5}, Lib/b;-><init>(Landroid/content/Context;I)V

    .line 242
    .line 243
    .line 244
    iget-object v7, v3, Lib/b;->a:Landroid/content/SharedPreferences;

    .line 245
    .line 246
    const-string v8, "plus_menu_enable"

    .line 247
    .line 248
    invoke-interface {v7, v8, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 249
    .line 250
    .line 251
    move-result v8

    .line 252
    if-nez v8, :cond_c

    .line 253
    .line 254
    const-string v8, "plugin_agent_plus_menu_enable"

    .line 255
    .line 256
    invoke-interface {v7, v8, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 257
    .line 258
    .line 259
    move-result v7

    .line 260
    if-nez v7, :cond_c

    .line 261
    .line 262
    invoke-static {v0}, Lya/i;->c(Landroid/content/Context;)Z

    .line 263
    .line 264
    .line 265
    move-result v7

    .line 266
    if-nez v7, :cond_c

    .line 267
    .line 268
    invoke-static {v0}, Lf8/i;->T(Landroid/content/Context;)Z

    .line 269
    .line 270
    .line 271
    move-result v7

    .line 272
    if-eqz v7, :cond_d

    .line 273
    .line 274
    goto :goto_7

    .line 275
    :catchall_0
    move-exception v0

    .line 276
    goto :goto_8

    .line 277
    :cond_c
    :goto_7
    move v5, v6

    .line 278
    :cond_d
    invoke-virtual {v2, v5}, Le8/c;->k(Z)V

    .line 279
    .line 280
    .line 281
    new-instance v5, Lq8/h;

    .line 282
    .line 283
    invoke-direct {v5, v0, v4, v2, v3}, Lq8/h;-><init>(Landroid/content/Context;Ljava/lang/ClassLoader;Le8/c;Lib/b;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v5}, Lq8/h;->r()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 287
    .line 288
    .line 289
    goto :goto_9

    .line 290
    :goto_8
    const-string v2, "[Hchat:Settings] \u8bbe\u7f6e\u5165\u53e3\u5b89\u88c5\u5931\u8d25"

    .line 291
    .line 292
    invoke-static {v2, v0}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 293
    .line 294
    .line 295
    :goto_9
    return-void

    .line 296
    :pswitch_6
    iget-object v0, v1, La1/a;->h:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast v0, Lia/a0;

    .line 299
    .line 300
    iget-object v0, v0, Lia/a0;->a:Lr8/g;

    .line 301
    .line 302
    iget-object v0, v0, Lr8/g;->a:Landroid/content/Context;

    .line 303
    .line 304
    const-string v2, "\u4f2a\u8bc4\u8bba\u4ec5\u5728\u672c\u673a\u663e\u793a\uff0c\u4e0d\u80fd\u56de\u590d"

    .line 305
    .line 306
    invoke-static {v0, v2, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 311
    .line 312
    .line 313
    return-void

    .line 314
    :pswitch_7
    invoke-direct {v1}, La1/a;->e()V

    .line 315
    .line 316
    .line 317
    return-void

    .line 318
    :pswitch_8
    iget-object v0, v1, La1/a;->h:Ljava/lang/Object;

    .line 319
    .line 320
    check-cast v0, Lk8/p;

    .line 321
    .line 322
    invoke-virtual {v0}, Lk8/p;->b()V

    .line 323
    .line 324
    .line 325
    return-void

    .line 326
    :pswitch_9
    invoke-direct {v1}, La1/a;->d()V

    .line 327
    .line 328
    .line 329
    return-void

    .line 330
    :pswitch_a
    invoke-direct {v1}, La1/a;->c()V

    .line 331
    .line 332
    .line 333
    return-void

    .line 334
    :pswitch_b
    invoke-direct {v1}, La1/a;->b()V

    .line 335
    .line 336
    .line 337
    return-void

    .line 338
    :pswitch_c
    invoke-direct {v1}, La1/a;->a()V

    .line 339
    .line 340
    .line 341
    return-void

    .line 342
    :pswitch_d
    iget-object v0, v1, La1/a;->h:Ljava/lang/Object;

    .line 343
    .line 344
    move-object v2, v0

    .line 345
    check-cast v2, Lg8/j;

    .line 346
    .line 347
    monitor-enter v2

    .line 348
    :try_start_1
    iget-boolean v0, v2, Lg8/j;->e:Z

    .line 349
    .line 350
    if-nez v0, :cond_10

    .line 351
    .line 352
    iget-object v0, v2, Lg8/j;->a:Lo8/d;

    .line 353
    .line 354
    if-nez v0, :cond_e

    .line 355
    .line 356
    goto :goto_a

    .line 357
    :cond_e
    new-instance v3, Lg8/e;

    .line 358
    .line 359
    invoke-direct {v3, v2, v6}, Lg8/e;-><init>(Ljava/lang/Object;I)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v0, v3}, Lo8/d;->g(Lo8/c;)V

    .line 363
    .line 364
    .line 365
    iput-boolean v6, v2, Lg8/j;->e:Z

    .line 366
    .line 367
    const-string v0, "\u8054\u7cfb\u4eba\u53d8\u66f4\u76d1\u542c\u5df2\u5b89\u88c5"

    .line 368
    .line 369
    iget-object v3, v2, Lg8/j;->c:Lg1/d;

    .line 370
    .line 371
    if-eqz v3, :cond_f

    .line 372
    .line 373
    const-string v3, "[WeChatContactChangeApi] "

    .line 374
    .line 375
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    invoke-static {v0}, Li8/i;->f(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 380
    .line 381
    .line 382
    :cond_f
    monitor-exit v2

    .line 383
    goto :goto_b

    .line 384
    :catchall_1
    move-exception v0

    .line 385
    goto :goto_c

    .line 386
    :cond_10
    :goto_a
    monitor-exit v2

    .line 387
    :goto_b
    return-void

    .line 388
    :goto_c
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 389
    throw v0

    .line 390
    :pswitch_e
    iget-object v0, v1, La1/a;->h:Ljava/lang/Object;

    .line 391
    .line 392
    move-object v2, v0

    .line 393
    check-cast v2, Lh8/b;

    .line 394
    .line 395
    monitor-enter v2

    .line 396
    :try_start_3
    iget-boolean v0, v2, Lh8/b;->e:Z

    .line 397
    .line 398
    if-nez v0, :cond_13

    .line 399
    .line 400
    iget-object v0, v2, Lh8/b;->a:Lo8/d;

    .line 401
    .line 402
    if-nez v0, :cond_11

    .line 403
    .line 404
    goto :goto_d

    .line 405
    :cond_11
    new-instance v3, Lg8/e;

    .line 406
    .line 407
    invoke-direct {v3, v2, v4}, Lg8/e;-><init>(Ljava/lang/Object;I)V

    .line 408
    .line 409
    .line 410
    invoke-virtual {v0, v3}, Lo8/d;->g(Lo8/c;)V

    .line 411
    .line 412
    .line 413
    iput-boolean v6, v2, Lh8/b;->e:Z

    .line 414
    .line 415
    const-string v0, "\u4f1a\u8bdd\u53d8\u66f4\u76d1\u542c\u5df2\u5b89\u88c5"

    .line 416
    .line 417
    iget-object v3, v2, Lh8/b;->c:Lg1/d;

    .line 418
    .line 419
    if-eqz v3, :cond_12

    .line 420
    .line 421
    const-string v3, "[WeChatConversationChangeApi] "

    .line 422
    .line 423
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    invoke-static {v0}, Li8/i;->f(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 428
    .line 429
    .line 430
    :cond_12
    monitor-exit v2

    .line 431
    goto :goto_e

    .line 432
    :catchall_2
    move-exception v0

    .line 433
    goto :goto_f

    .line 434
    :cond_13
    :goto_d
    monitor-exit v2

    .line 435
    :goto_e
    return-void

    .line 436
    :goto_f
    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 437
    throw v0

    .line 438
    :pswitch_f
    iget-object v0, v1, La1/a;->h:Ljava/lang/Object;

    .line 439
    .line 440
    check-cast v0, Lk8/i;

    .line 441
    .line 442
    invoke-virtual {v0}, Lk8/i;->a()V

    .line 443
    .line 444
    .line 445
    return-void

    .line 446
    :pswitch_10
    iget-object v0, v1, La1/a;->h:Ljava/lang/Object;

    .line 447
    .line 448
    check-cast v0, Lo8/d;

    .line 449
    .line 450
    invoke-virtual {v0}, Lo8/d;->e()V

    .line 451
    .line 452
    .line 453
    return-void

    .line 454
    :pswitch_11
    iget-object v0, v1, La1/a;->h:Ljava/lang/Object;

    .line 455
    .line 456
    check-cast v0, Lha/z;

    .line 457
    .line 458
    iget-object v2, v0, Lha/z;->g:Ljava/util/Map;

    .line 459
    .line 460
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 461
    .line 462
    .line 463
    monitor-enter v2

    .line 464
    :try_start_5
    iget-object v3, v0, Lha/z;->g:Ljava/util/Map;

    .line 465
    .line 466
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 467
    .line 468
    .line 469
    move-result-object v3

    .line 470
    check-cast v3, Ljava/lang/Iterable;

    .line 471
    .line 472
    new-instance v4, Ljava/util/ArrayList;

    .line 473
    .line 474
    invoke-static {v3}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 475
    .line 476
    .line 477
    move-result v5

    .line 478
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 479
    .line 480
    .line 481
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 482
    .line 483
    .line 484
    move-result-object v3

    .line 485
    :goto_10
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 486
    .line 487
    .line 488
    move-result v5

    .line 489
    if-eqz v5, :cond_14

    .line 490
    .line 491
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object v5

    .line 495
    check-cast v5, Ljava/util/Map$Entry;

    .line 496
    .line 497
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    move-result-object v6

    .line 501
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object v5

    .line 505
    new-instance v7, Lsf/e;

    .line 506
    .line 507
    invoke-direct {v7, v6, v5}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 508
    .line 509
    .line 510
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 511
    .line 512
    .line 513
    goto :goto_10

    .line 514
    :catchall_3
    move-exception v0

    .line 515
    goto :goto_12

    .line 516
    :cond_14
    monitor-exit v2

    .line 517
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 518
    .line 519
    .line 520
    move-result-object v2

    .line 521
    :cond_15
    :goto_11
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 522
    .line 523
    .line 524
    move-result v3

    .line 525
    if-eqz v3, :cond_16

    .line 526
    .line 527
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    move-result-object v3

    .line 531
    check-cast v3, Lsf/e;

    .line 532
    .line 533
    iget-object v4, v3, Lsf/e;->g:Ljava/lang/Object;

    .line 534
    .line 535
    check-cast v4, Landroid/view/View;

    .line 536
    .line 537
    iget-object v3, v3, Lsf/e;->h:Ljava/lang/Object;

    .line 538
    .line 539
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 540
    .line 541
    .line 542
    invoke-virtual {v0, v4}, Lha/z;->q(Landroid/view/View;)V

    .line 543
    .line 544
    .line 545
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 546
    .line 547
    .line 548
    invoke-virtual {v0, v3}, Lha/z;->r(Ljava/lang/Object;)Z

    .line 549
    .line 550
    .line 551
    move-result v3

    .line 552
    if-eqz v3, :cond_15

    .line 553
    .line 554
    invoke-virtual {v0, v4}, Lha/z;->d(Landroid/view/View;)V

    .line 555
    .line 556
    .line 557
    goto :goto_11

    .line 558
    :cond_16
    return-void

    .line 559
    :goto_12
    monitor-exit v2

    .line 560
    throw v0

    .line 561
    :pswitch_12
    const-string v2, "last_result"

    .line 562
    .line 563
    const-string v3, "last_time"

    .line 564
    .line 565
    iget-object v0, v1, La1/a;->h:Ljava/lang/Object;

    .line 566
    .line 567
    move-object v4, v0

    .line 568
    check-cast v4, Lha/m;

    .line 569
    .line 570
    const-string v7, ""

    .line 571
    .line 572
    iget-object v8, v4, Lha/m;->b:Landroid/content/SharedPreferences;

    .line 573
    .line 574
    const-string v0, "enable"

    .line 575
    .line 576
    invoke-interface {v8, v0, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 577
    .line 578
    .line 579
    move-result v0

    .line 580
    if-nez v0, :cond_17

    .line 581
    .line 582
    goto/16 :goto_18

    .line 583
    .line 584
    :cond_17
    const-string v0, "time_window_enable"

    .line 585
    .line 586
    invoke-interface {v8, v0, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 587
    .line 588
    .line 589
    move-result v0

    .line 590
    if-eqz v0, :cond_1a

    .line 591
    .line 592
    const-string v0, "start_time"

    .line 593
    .line 594
    const-string v9, "08:00:00"

    .line 595
    .line 596
    invoke-interface {v8, v0, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 597
    .line 598
    .line 599
    move-result-object v0

    .line 600
    if-nez v0, :cond_18

    .line 601
    .line 602
    move-object v0, v7

    .line 603
    :cond_18
    const-string v9, "end_time"

    .line 604
    .line 605
    const-string v10, "23:00:00"

    .line 606
    .line 607
    invoke-interface {v8, v9, v10}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 608
    .line 609
    .line 610
    move-result-object v9

    .line 611
    if-nez v9, :cond_19

    .line 612
    .line 613
    move-object v9, v7

    .line 614
    :cond_19
    invoke-static {v0, v9}, Lr9/e0;->H(Ljava/lang/String;Ljava/lang/String;)Z

    .line 615
    .line 616
    .line 617
    move-result v0

    .line 618
    if-nez v0, :cond_1a

    .line 619
    .line 620
    goto/16 :goto_18

    .line 621
    .line 622
    :cond_1a
    const-string v0, "interval_seconds"

    .line 623
    .line 624
    const/16 v9, 0x12c

    .line 625
    .line 626
    invoke-interface {v8, v0, v9}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 627
    .line 628
    .line 629
    move-result v0

    .line 630
    if-gez v0, :cond_1b

    .line 631
    .line 632
    move v0, v5

    .line 633
    :cond_1b
    int-to-long v9, v0

    .line 634
    const-wide/16 v11, 0x3e8

    .line 635
    .line 636
    mul-long/2addr v9, v11

    .line 637
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 638
    .line 639
    .line 640
    move-result-wide v11

    .line 641
    iget-wide v13, v4, Lha/m;->e:J

    .line 642
    .line 643
    sub-long v13, v11, v13

    .line 644
    .line 645
    cmp-long v0, v13, v9

    .line 646
    .line 647
    if-gez v0, :cond_1c

    .line 648
    .line 649
    goto/16 :goto_18

    .line 650
    .line 651
    :cond_1c
    iput-wide v11, v4, Lha/m;->e:J

    .line 652
    .line 653
    :try_start_6
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->snsApi()Lp8/d0;

    .line 654
    .line 655
    .line 656
    move-result-object v0

    .line 657
    if-eqz v0, :cond_1d

    .line 658
    .line 659
    invoke-virtual {v0}, Lp8/d0;->s()Z

    .line 660
    .line 661
    .line 662
    move-result v0

    .line 663
    if-ne v0, v6, :cond_1d

    .line 664
    .line 665
    move v5, v6

    .line 666
    goto :goto_13

    .line 667
    :catchall_4
    move-exception v0

    .line 668
    goto :goto_14

    .line 669
    :cond_1d
    :goto_13
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 670
    .line 671
    .line 672
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 673
    goto :goto_15

    .line 674
    :goto_14
    new-instance v5, Lsf/f;

    .line 675
    .line 676
    invoke-direct {v5, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 677
    .line 678
    .line 679
    move-object v0, v5

    .line 680
    :goto_15
    nop

    .line 681
    instance-of v5, v0, Lsf/f;

    .line 682
    .line 683
    const-wide/16 v13, 0x7530

    .line 684
    .line 685
    if-nez v5, :cond_20

    .line 686
    .line 687
    move-object v5, v0

    .line 688
    check-cast v5, Ljava/lang/Boolean;

    .line 689
    .line 690
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 691
    .line 692
    .line 693
    move-result v5

    .line 694
    if-nez v5, :cond_1e

    .line 695
    .line 696
    sub-long v15, v11, v9

    .line 697
    .line 698
    invoke-static {v9, v10, v13, v14}, Ljava/lang/Math;->min(JJ)J

    .line 699
    .line 700
    .line 701
    move-result-wide v17

    .line 702
    add-long v13, v17, v15

    .line 703
    .line 704
    iput-wide v13, v4, Lha/m;->e:J

    .line 705
    .line 706
    :cond_1e
    if-eqz v5, :cond_1f

    .line 707
    .line 708
    const-string v5, "\u5237\u65b0\u8bf7\u6c42\u5df2\u63d0\u4ea4"

    .line 709
    .line 710
    goto :goto_16

    .line 711
    :cond_1f
    const-string v5, "\u5237\u65b0\u8bf7\u6c42\u63d0\u4ea4\u5931\u8d25"

    .line 712
    .line 713
    :goto_16
    invoke-interface {v8}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 714
    .line 715
    .line 716
    move-result-object v6

    .line 717
    invoke-interface {v6, v3, v11, v12}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 718
    .line 719
    .line 720
    move-result-object v6

    .line 721
    invoke-interface {v6, v2, v5}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 722
    .line 723
    .line 724
    move-result-object v5

    .line 725
    invoke-interface {v5}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 726
    .line 727
    .line 728
    :cond_20
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 729
    .line 730
    .line 731
    move-result-object v0

    .line 732
    if-eqz v0, :cond_22

    .line 733
    .line 734
    sub-long v5, v11, v9

    .line 735
    .line 736
    const-wide/16 v13, 0x7530

    .line 737
    .line 738
    invoke-static {v9, v10, v13, v14}, Ljava/lang/Math;->min(JJ)J

    .line 739
    .line 740
    .line 741
    move-result-wide v9

    .line 742
    add-long/2addr v9, v5

    .line 743
    iput-wide v9, v4, Lha/m;->e:J

    .line 744
    .line 745
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 746
    .line 747
    .line 748
    move-result-object v5

    .line 749
    if-nez v5, :cond_21

    .line 750
    .line 751
    goto :goto_17

    .line 752
    :cond_21
    move-object v7, v5

    .line 753
    :goto_17
    const-string v5, "\u5237\u65b0\u5f02\u5e38\uff1a"

    .line 754
    .line 755
    invoke-virtual {v5, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 756
    .line 757
    .line 758
    move-result-object v5

    .line 759
    invoke-interface {v8}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 760
    .line 761
    .line 762
    move-result-object v6

    .line 763
    invoke-interface {v6, v3, v11, v12}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 764
    .line 765
    .line 766
    move-result-object v3

    .line 767
    invoke-interface {v3, v2, v5}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 768
    .line 769
    .line 770
    move-result-object v2

    .line 771
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 772
    .line 773
    .line 774
    iget-object v2, v4, Lha/m;->a:Lab/b;

    .line 775
    .line 776
    const-string v3, "\u670b\u53cb\u5708\u81ea\u52a8\u5237\u65b0\u5931\u8d25"

    .line 777
    .line 778
    invoke-virtual {v2, v3, v0}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 779
    .line 780
    .line 781
    :cond_22
    :goto_18
    return-void

    .line 782
    :pswitch_13
    iget-object v0, v1, La1/a;->h:Ljava/lang/Object;

    .line 783
    .line 784
    check-cast v0, Leb/w0;

    .line 785
    .line 786
    invoke-static {v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->A(Leb/w0;)V

    .line 787
    .line 788
    .line 789
    return-void

    .line 790
    :pswitch_14
    iget-object v0, v1, La1/a;->h:Ljava/lang/Object;

    .line 791
    .line 792
    check-cast v0, Lh/Hchat/hooks/items/protobuf/ProtobufPacketRuntime$Packet;

    .line 793
    .line 794
    invoke-static {v0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->t(Lh/Hchat/hooks/items/protobuf/ProtobufPacketRuntime$Packet;)V

    .line 795
    .line 796
    .line 797
    return-void

    .line 798
    :pswitch_15
    iget-object v0, v1, La1/a;->h:Ljava/lang/Object;

    .line 799
    .line 800
    check-cast v0, Lh/Hchat/hooks/items/script/ScriptMessageBean;

    .line 801
    .line 802
    :try_start_7
    sget-object v2, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 803
    .line 804
    invoke-virtual {v2, v0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->dispatchOnHandleMsg(Lh/Hchat/hooks/items/script/ScriptMessageBean;)V

    .line 805
    .line 806
    .line 807
    invoke-virtual {v2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->hasImageDownloadCallback()Z

    .line 808
    .line 809
    .line 810
    move-result v3

    .line 811
    if-eqz v3, :cond_23

    .line 812
    .line 813
    invoke-virtual {v2, v0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->dispatchOnImageDownload(Lh/Hchat/hooks/items/script/ScriptMessageBean;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 814
    .line 815
    .line 816
    goto :goto_19

    .line 817
    :catchall_5
    move-exception v0

    .line 818
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 819
    .line 820
    .line 821
    move-result-object v2

    .line 822
    const-string v3, "[Hchat:Script] \u6d88\u606f\u76d1\u542c\u5f02\u6b65\u5206\u53d1\u5931\u8d25: "

    .line 823
    .line 824
    invoke-static {v3, v2, v0}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 825
    .line 826
    .line 827
    :cond_23
    :goto_19
    return-void

    .line 828
    :pswitch_16
    iget-object v0, v1, La1/a;->h:Ljava/lang/Object;

    .line 829
    .line 830
    check-cast v0, Lc9/r1;

    .line 831
    .line 832
    iget-object v2, v0, Lc9/r1;->a:Landroid/app/Activity;

    .line 833
    .line 834
    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    .line 835
    .line 836
    .line 837
    move-result v3

    .line 838
    if-nez v3, :cond_24

    .line 839
    .line 840
    invoke-virtual {v2}, Landroid/app/Activity;->isDestroyed()Z

    .line 841
    .line 842
    .line 843
    move-result v3

    .line 844
    if-nez v3, :cond_24

    .line 845
    .line 846
    sget-object v3, Lc9/j1;->a:Lc9/j1;

    .line 847
    .line 848
    iget-object v3, v0, Lc9/r1;->b:Ljava/lang/String;

    .line 849
    .line 850
    new-instance v4, Lab/a;

    .line 851
    .line 852
    const/16 v5, 0x9

    .line 853
    .line 854
    invoke-direct {v4, v0, v5}, Lab/a;-><init>(Ljava/lang/Object;I)V

    .line 855
    .line 856
    .line 857
    invoke-static {v2, v3, v4}, Lc9/j1;->v(Landroid/app/Activity;Ljava/lang/String;Lfg/a;)V

    .line 858
    .line 859
    .line 860
    :cond_24
    return-void

    .line 861
    :pswitch_17
    iget-object v0, v1, La1/a;->h:Ljava/lang/Object;

    .line 862
    .line 863
    check-cast v0, Lc9/x1;

    .line 864
    .line 865
    iget-object v7, v0, Lc9/x1;->a:Lc9/u1;

    .line 866
    .line 867
    iget-object v8, v7, Lc9/u1;->a:Landroid/app/Activity;

    .line 868
    .line 869
    invoke-virtual {v8}, Landroid/app/Activity;->isFinishing()Z

    .line 870
    .line 871
    .line 872
    move-result v9

    .line 873
    if-nez v9, :cond_39

    .line 874
    .line 875
    invoke-virtual {v8}, Landroid/app/Activity;->isDestroyed()Z

    .line 876
    .line 877
    .line 878
    move-result v9

    .line 879
    if-eqz v9, :cond_25

    .line 880
    .line 881
    goto/16 :goto_26

    .line 882
    .line 883
    :cond_25
    iget-object v9, v0, Lc9/x1;->b:Lc9/v1;

    .line 884
    .line 885
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 886
    .line 887
    .line 888
    move-result v9

    .line 889
    if-eqz v9, :cond_37

    .line 890
    .line 891
    if-eq v9, v6, :cond_36

    .line 892
    .line 893
    if-eq v9, v4, :cond_27

    .line 894
    .line 895
    if-ne v9, v3, :cond_26

    .line 896
    .line 897
    goto :goto_1a

    .line 898
    :cond_26
    invoke-static {}, Lokio/a;->k()V

    .line 899
    .line 900
    .line 901
    goto/16 :goto_26

    .line 902
    .line 903
    :cond_27
    :goto_1a
    iget-object v0, v0, Lc9/x1;->b:Lc9/v1;

    .line 904
    .line 905
    sget-object v2, Lc9/v1;->i:Lc9/v1;

    .line 906
    .line 907
    if-ne v0, v2, :cond_28

    .line 908
    .line 909
    move v0, v6

    .line 910
    goto :goto_1b

    .line 911
    :cond_28
    move v0, v5

    .line 912
    :goto_1b
    iget-object v2, v7, Lc9/u1;->c:Ljava/lang/String;

    .line 913
    .line 914
    iget-object v3, v7, Lc9/u1;->b:Ljava/lang/String;

    .line 915
    .line 916
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 917
    .line 918
    .line 919
    sget-object v4, Lc9/o2;->a:Ljava/lang/Object;

    .line 920
    .line 921
    monitor-enter v4

    .line 922
    :try_start_8
    invoke-static {}, Lc9/o2;->a()Ljava/lang/String;

    .line 923
    .line 924
    .line 925
    move-result-object v9

    .line 926
    invoke-static {v2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 927
    .line 928
    .line 929
    move-result-object v2

    .line 930
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 931
    .line 932
    .line 933
    move-result-object v2

    .line 934
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 935
    .line 936
    .line 937
    move-result-object v3

    .line 938
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 939
    .line 940
    .line 941
    move-result-object v3

    .line 942
    invoke-static {v9}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 943
    .line 944
    .line 945
    move-result v10

    .line 946
    if-nez v10, :cond_2c

    .line 947
    .line 948
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 949
    .line 950
    .line 951
    move-result v10

    .line 952
    if-nez v10, :cond_2c

    .line 953
    .line 954
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 955
    .line 956
    .line 957
    move-result v10

    .line 958
    if-eqz v10, :cond_29

    .line 959
    .line 960
    goto :goto_1e

    .line 961
    :cond_29
    invoke-static {v8, v9}, Lc9/o2;->j(Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;

    .line 962
    .line 963
    .line 964
    move-result-object v10

    .line 965
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 966
    .line 967
    .line 968
    move-result-object v11

    .line 969
    move v12, v5

    .line 970
    :goto_1c
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 971
    .line 972
    .line 973
    move-result v13

    .line 974
    if-eqz v13, :cond_2b

    .line 975
    .line 976
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 977
    .line 978
    .line 979
    move-result-object v13

    .line 980
    check-cast v13, Lc9/a;

    .line 981
    .line 982
    iget-object v14, v13, Lc9/a;->a:Ljava/lang/String;

    .line 983
    .line 984
    invoke-static {v14, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 985
    .line 986
    .line 987
    move-result v14

    .line 988
    if-eqz v14, :cond_2a

    .line 989
    .line 990
    iget-object v13, v13, Lc9/a;->e:Ljava/util/List;

    .line 991
    .line 992
    invoke-interface {v13, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 993
    .line 994
    .line 995
    move-result v13

    .line 996
    if-eqz v13, :cond_2a

    .line 997
    .line 998
    goto :goto_1d

    .line 999
    :catchall_6
    move-exception v0

    .line 1000
    goto/16 :goto_24

    .line 1001
    .line 1002
    :cond_2a
    add-int/lit8 v12, v12, 0x1

    .line 1003
    .line 1004
    goto :goto_1c

    .line 1005
    :cond_2b
    const/4 v12, -0x1

    .line 1006
    :goto_1d
    if-gez v12, :cond_2d

    .line 1007
    .line 1008
    :cond_2c
    :goto_1e
    move v6, v5

    .line 1009
    goto/16 :goto_22

    .line 1010
    .line 1011
    :cond_2d
    invoke-interface {v10, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v2

    .line 1015
    move-object v13, v2

    .line 1016
    check-cast v13, Lc9/a;

    .line 1017
    .line 1018
    if-eqz v0, :cond_30

    .line 1019
    .line 1020
    invoke-static {v3}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v2

    .line 1024
    iget-object v11, v13, Lc9/a;->f:Ljava/util/List;

    .line 1025
    .line 1026
    new-instance v14, Ljava/util/ArrayList;

    .line 1027
    .line 1028
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 1029
    .line 1030
    .line 1031
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v11

    .line 1035
    :goto_1f
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 1036
    .line 1037
    .line 1038
    move-result v15

    .line 1039
    if-eqz v15, :cond_2f

    .line 1040
    .line 1041
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v15

    .line 1045
    move-object v6, v15

    .line 1046
    check-cast v6, Ljava/lang/String;

    .line 1047
    .line 1048
    invoke-static {v6, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1049
    .line 1050
    .line 1051
    move-result v6

    .line 1052
    if-nez v6, :cond_2e

    .line 1053
    .line 1054
    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1055
    .line 1056
    .line 1057
    :cond_2e
    const/4 v6, 0x1

    .line 1058
    goto :goto_1f

    .line 1059
    :cond_2f
    invoke-static {v2, v14}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v2

    .line 1063
    goto :goto_21

    .line 1064
    :cond_30
    iget-object v2, v13, Lc9/a;->f:Ljava/util/List;

    .line 1065
    .line 1066
    new-instance v6, Ljava/util/ArrayList;

    .line 1067
    .line 1068
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 1069
    .line 1070
    .line 1071
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v2

    .line 1075
    :cond_31
    :goto_20
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1076
    .line 1077
    .line 1078
    move-result v11

    .line 1079
    if-eqz v11, :cond_32

    .line 1080
    .line 1081
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v11

    .line 1085
    move-object v14, v11

    .line 1086
    check-cast v14, Ljava/lang/String;

    .line 1087
    .line 1088
    invoke-static {v14, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1089
    .line 1090
    .line 1091
    move-result v14

    .line 1092
    if-nez v14, :cond_31

    .line 1093
    .line 1094
    invoke-virtual {v6, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1095
    .line 1096
    .line 1097
    goto :goto_20

    .line 1098
    :cond_32
    move-object v2, v6

    .line 1099
    :goto_21
    iget-object v3, v13, Lc9/a;->f:Ljava/util/List;

    .line 1100
    .line 1101
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1102
    .line 1103
    .line 1104
    move-result v3

    .line 1105
    if-eqz v3, :cond_33

    .line 1106
    .line 1107
    const/4 v6, 0x1

    .line 1108
    goto :goto_22

    .line 1109
    :cond_33
    new-instance v3, Ljava/util/ArrayList;

    .line 1110
    .line 1111
    invoke-direct {v3, v10}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1112
    .line 1113
    .line 1114
    const/16 v24, 0x0

    .line 1115
    .line 1116
    const/16 v25, 0xfdf

    .line 1117
    .line 1118
    const/4 v14, 0x0

    .line 1119
    const/4 v15, 0x0

    .line 1120
    const/16 v16, 0x0

    .line 1121
    .line 1122
    const/16 v17, 0x0

    .line 1123
    .line 1124
    const/16 v18, 0x0

    .line 1125
    .line 1126
    const/16 v20, 0x0

    .line 1127
    .line 1128
    const/16 v21, 0x0

    .line 1129
    .line 1130
    const/16 v22, 0x0

    .line 1131
    .line 1132
    const/16 v23, 0x0

    .line 1133
    .line 1134
    move-object/from16 v19, v2

    .line 1135
    .line 1136
    invoke-static/range {v13 .. v25}, Lc9/a;->a(Lc9/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;ZLjava/lang/String;ZZZI)Lc9/a;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v2

    .line 1140
    invoke-virtual {v3, v12, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 1141
    .line 1142
    .line 1143
    invoke-static {v3}, Lc9/o2;->l(Ljava/util/List;)Ljava/util/ArrayList;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v2

    .line 1147
    invoke-static {v8, v9, v2}, Lc9/o2;->r(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)Z

    .line 1148
    .line 1149
    .line 1150
    move-result v6
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 1151
    :goto_22
    monitor-exit v4

    .line 1152
    invoke-virtual {v8}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v2

    .line 1156
    if-nez v6, :cond_34

    .line 1157
    .line 1158
    const-string v0, "\u66f4\u65b0\u5206\u7ec4\u7f6e\u9876\u5931\u8d25"

    .line 1159
    .line 1160
    goto :goto_23

    .line 1161
    :cond_34
    if-eqz v0, :cond_35

    .line 1162
    .line 1163
    const-string v0, "\u5df2\u5728\u5f53\u524d\u5206\u7ec4\u7f6e\u9876"

    .line 1164
    .line 1165
    goto :goto_23

    .line 1166
    :cond_35
    const-string v0, "\u5df2\u53d6\u6d88\u5f53\u524d\u5206\u7ec4\u7f6e\u9876"

    .line 1167
    .line 1168
    :goto_23
    invoke-static {v2, v0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v0

    .line 1172
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1173
    .line 1174
    .line 1175
    if-eqz v6, :cond_39

    .line 1176
    .line 1177
    sget-object v0, Lc9/d2;->a:Lc9/d2;

    .line 1178
    .line 1179
    iget-object v0, v7, Lc9/u1;->d:Ljava/lang/Object;

    .line 1180
    .line 1181
    invoke-static {v0, v8}, Lc9/d2;->w(Ljava/lang/Object;Landroid/content/Context;)V

    .line 1182
    .line 1183
    .line 1184
    goto :goto_26

    .line 1185
    :goto_24
    monitor-exit v4

    .line 1186
    throw v0

    .line 1187
    :cond_36
    sget-object v0, Lc9/j1;->a:Lc9/j1;

    .line 1188
    .line 1189
    iget-object v0, v7, Lc9/u1;->b:Ljava/lang/String;

    .line 1190
    .line 1191
    new-instance v2, Laa/c;

    .line 1192
    .line 1193
    const/4 v3, 0x5

    .line 1194
    invoke-direct {v2, v8, v3, v7}, Laa/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1195
    .line 1196
    .line 1197
    invoke-static {v8, v0, v2}, Lc9/j1;->v(Landroid/app/Activity;Ljava/lang/String;Lfg/a;)V

    .line 1198
    .line 1199
    .line 1200
    goto :goto_26

    .line 1201
    :cond_37
    iget-object v0, v7, Lc9/u1;->b:Ljava/lang/String;

    .line 1202
    .line 1203
    invoke-static {v8, v0, v2}, Lc9/o2;->s(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    .line 1204
    .line 1205
    .line 1206
    move-result v0

    .line 1207
    invoke-virtual {v8}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v2

    .line 1211
    if-eqz v0, :cond_38

    .line 1212
    .line 1213
    const-string v3, "\u5df2\u79fb\u51fa\u5f53\u524d\u5206\u7ec4"

    .line 1214
    .line 1215
    goto :goto_25

    .line 1216
    :cond_38
    const-string v3, "\u79fb\u51fa\u4f1a\u8bdd\u5931\u8d25"

    .line 1217
    .line 1218
    :goto_25
    invoke-static {v2, v3, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1219
    .line 1220
    .line 1221
    move-result-object v2

    .line 1222
    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    .line 1223
    .line 1224
    .line 1225
    if-eqz v0, :cond_39

    .line 1226
    .line 1227
    invoke-static {v8}, Lc9/d2;->y(Landroid/content/Context;)V

    .line 1228
    .line 1229
    .line 1230
    sget-object v0, Lc9/d2;->a:Lc9/d2;

    .line 1231
    .line 1232
    iget-object v0, v7, Lc9/u1;->d:Ljava/lang/Object;

    .line 1233
    .line 1234
    invoke-static {v0, v8}, Lc9/d2;->w(Ljava/lang/Object;Landroid/content/Context;)V

    .line 1235
    .line 1236
    .line 1237
    :cond_39
    :goto_26
    return-void

    .line 1238
    :pswitch_18
    iget-object v0, v1, La1/a;->h:Ljava/lang/Object;

    .line 1239
    .line 1240
    check-cast v0, Lc9/r0;

    .line 1241
    .line 1242
    invoke-virtual {v0}, Lc9/r0;->invoke()Ljava/lang/Object;

    .line 1243
    .line 1244
    .line 1245
    return-void

    .line 1246
    :pswitch_19
    iget-object v0, v1, La1/a;->h:Ljava/lang/Object;

    .line 1247
    .line 1248
    check-cast v0, Lb0/h;

    .line 1249
    .line 1250
    iget-object v0, v0, Lb0/h;->h:Landroid/view/ActionMode;

    .line 1251
    .line 1252
    if-eqz v0, :cond_3a

    .line 1253
    .line 1254
    invoke-virtual {v0}, Landroid/view/ActionMode;->finish()V

    .line 1255
    .line 1256
    .line 1257
    :cond_3a
    return-void

    .line 1258
    :pswitch_1a
    iget-object v0, v1, La1/a;->h:Ljava/lang/Object;

    .line 1259
    .line 1260
    check-cast v0, Ly2/v;

    .line 1261
    .line 1262
    invoke-static {v0}, Ly2/v;->a(Ly2/v;)V

    .line 1263
    .line 1264
    .line 1265
    return-void

    .line 1266
    :pswitch_1b
    iget-object v0, v1, La1/a;->h:Ljava/lang/Object;

    .line 1267
    .line 1268
    check-cast v0, Landroidx/lifecycle/y;

    .line 1269
    .line 1270
    iget-object v2, v0, Landroidx/lifecycle/y;->l:Landroidx/lifecycle/s;

    .line 1271
    .line 1272
    iget v3, v0, Landroidx/lifecycle/y;->h:I

    .line 1273
    .line 1274
    if-nez v3, :cond_3b

    .line 1275
    .line 1276
    const/4 v3, 0x1

    .line 1277
    iput-boolean v3, v0, Landroidx/lifecycle/y;->i:Z

    .line 1278
    .line 1279
    sget-object v4, Landroidx/lifecycle/k;->ON_PAUSE:Landroidx/lifecycle/k;

    .line 1280
    .line 1281
    invoke-virtual {v2, v4}, Landroidx/lifecycle/s;->d(Landroidx/lifecycle/k;)V

    .line 1282
    .line 1283
    .line 1284
    goto :goto_27

    .line 1285
    :cond_3b
    const/4 v3, 0x1

    .line 1286
    :goto_27
    iget v4, v0, Landroidx/lifecycle/y;->g:I

    .line 1287
    .line 1288
    if-nez v4, :cond_3c

    .line 1289
    .line 1290
    iget-boolean v4, v0, Landroidx/lifecycle/y;->i:Z

    .line 1291
    .line 1292
    if-eqz v4, :cond_3c

    .line 1293
    .line 1294
    sget-object v4, Landroidx/lifecycle/k;->ON_STOP:Landroidx/lifecycle/k;

    .line 1295
    .line 1296
    invoke-virtual {v2, v4}, Landroidx/lifecycle/s;->d(Landroidx/lifecycle/k;)V

    .line 1297
    .line 1298
    .line 1299
    iput-boolean v3, v0, Landroidx/lifecycle/y;->j:Z

    .line 1300
    .line 1301
    :cond_3c
    return-void

    .line 1302
    :pswitch_1c
    iget-object v0, v1, La1/a;->h:Ljava/lang/Object;

    .line 1303
    .line 1304
    check-cast v0, La1/i;

    .line 1305
    .line 1306
    invoke-virtual {v0}, La1/i;->i()Z

    .line 1307
    .line 1308
    .line 1309
    move-result v2

    .line 1310
    iget-object v3, v0, La1/i;->g:Ly1/t;

    .line 1311
    .line 1312
    if-nez v2, :cond_3d

    .line 1313
    .line 1314
    goto/16 :goto_2c

    .line 1315
    .line 1316
    :cond_3d
    const-string v2, "ContentCapture:changeChecker"

    .line 1317
    .line 1318
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 1319
    .line 1320
    .line 1321
    const/4 v2, 0x1

    .line 1322
    :try_start_9
    invoke-virtual {v3, v2}, Ly1/t;->x(Z)V

    .line 1323
    .line 1324
    .line 1325
    iget-object v2, v0, La1/i;->q:Lf/w;

    .line 1326
    .line 1327
    iget-object v6, v2, Lf/k;->b:[I

    .line 1328
    .line 1329
    iget-object v2, v2, Lf/k;->a:[J

    .line 1330
    .line 1331
    array-length v7, v2

    .line 1332
    sub-int/2addr v7, v4

    .line 1333
    if-ltz v7, :cond_41

    .line 1334
    .line 1335
    move v4, v5

    .line 1336
    :goto_28
    aget-wide v8, v2, v4

    .line 1337
    .line 1338
    not-long v10, v8

    .line 1339
    const/4 v12, 0x7

    .line 1340
    shl-long/2addr v10, v12

    .line 1341
    and-long/2addr v10, v8

    .line 1342
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    and-long/2addr v10, v12

    .line 1348
    cmp-long v10, v10, v12

    .line 1349
    .line 1350
    if-eqz v10, :cond_40

    .line 1351
    .line 1352
    sub-int v10, v4, v7

    .line 1353
    .line 1354
    not-int v10, v10

    .line 1355
    ushr-int/lit8 v10, v10, 0x1f

    .line 1356
    .line 1357
    const/16 v11, 0x8

    .line 1358
    .line 1359
    rsub-int/lit8 v10, v10, 0x8

    .line 1360
    .line 1361
    move v12, v5

    .line 1362
    :goto_29
    if-ge v12, v10, :cond_3f

    .line 1363
    .line 1364
    const-wide/16 v13, 0xff

    .line 1365
    .line 1366
    and-long/2addr v13, v8

    .line 1367
    const-wide/16 v15, 0x80

    .line 1368
    .line 1369
    cmp-long v13, v13, v15

    .line 1370
    .line 1371
    if-gez v13, :cond_3e

    .line 1372
    .line 1373
    shl-int/lit8 v13, v4, 0x3

    .line 1374
    .line 1375
    add-int/2addr v13, v12

    .line 1376
    aget v15, v6, v13

    .line 1377
    .line 1378
    invoke-virtual {v0}, La1/i;->h()Lf/k;

    .line 1379
    .line 1380
    .line 1381
    move-result-object v13

    .line 1382
    invoke-virtual {v13, v15}, Lf/k;->a(I)Z

    .line 1383
    .line 1384
    .line 1385
    move-result v13

    .line 1386
    if-nez v13, :cond_3e

    .line 1387
    .line 1388
    iget-object v13, v0, La1/i;->j:Ljava/util/ArrayList;

    .line 1389
    .line 1390
    new-instance v14, La1/j;

    .line 1391
    .line 1392
    move-object/from16 v21, v6

    .line 1393
    .line 1394
    iget-wide v5, v0, La1/i;->p:J

    .line 1395
    .line 1396
    sget-object v18, La1/k;->h:La1/k;

    .line 1397
    .line 1398
    const/16 v19, 0x0

    .line 1399
    .line 1400
    move-wide/from16 v16, v5

    .line 1401
    .line 1402
    invoke-direct/range {v14 .. v19}, La1/j;-><init>(IJLa1/k;Landroidx/lifecycle/x;)V

    .line 1403
    .line 1404
    .line 1405
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1406
    .line 1407
    .line 1408
    iget-object v5, v0, La1/i;->n:Lsg/c;

    .line 1409
    .line 1410
    sget-object v6, Lsf/n;->a:Lsf/n;

    .line 1411
    .line 1412
    invoke-interface {v5, v6}, Lsg/p;->p(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1413
    .line 1414
    .line 1415
    goto :goto_2a

    .line 1416
    :cond_3e
    move-object/from16 v21, v6

    .line 1417
    .line 1418
    :goto_2a
    shr-long/2addr v8, v11

    .line 1419
    add-int/lit8 v12, v12, 0x1

    .line 1420
    .line 1421
    move-object/from16 v6, v21

    .line 1422
    .line 1423
    const/4 v5, 0x0

    .line 1424
    goto :goto_29

    .line 1425
    :cond_3f
    move-object/from16 v21, v6

    .line 1426
    .line 1427
    if-ne v10, v11, :cond_41

    .line 1428
    .line 1429
    goto :goto_2b

    .line 1430
    :cond_40
    move-object/from16 v21, v6

    .line 1431
    .line 1432
    :goto_2b
    if-eq v4, v7, :cond_41

    .line 1433
    .line 1434
    add-int/lit8 v4, v4, 0x1

    .line 1435
    .line 1436
    move-object/from16 v6, v21

    .line 1437
    .line 1438
    const/4 v5, 0x0

    .line 1439
    goto :goto_28

    .line 1440
    :cond_41
    const-string v2, "ContentCapture:sendAppearEvents"

    .line 1441
    .line 1442
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    .line 1443
    .line 1444
    .line 1445
    :try_start_a
    invoke-virtual {v3}, Ly1/t;->getSemanticsOwner()Lf2/s;

    .line 1446
    .line 1447
    .line 1448
    move-result-object v2

    .line 1449
    invoke-virtual {v2}, Lf2/s;->a()Lf2/q;

    .line 1450
    .line 1451
    .line 1452
    move-result-object v2

    .line 1453
    iget-object v3, v0, La1/i;->r:Ly1/f2;

    .line 1454
    .line 1455
    invoke-virtual {v0, v2, v3}, La1/i;->k(Lf2/q;Ly1/f2;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 1456
    .line 1457
    .line 1458
    :try_start_b
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1459
    .line 1460
    .line 1461
    invoke-virtual {v0}, La1/i;->h()Lf/k;

    .line 1462
    .line 1463
    .line 1464
    move-result-object v2

    .line 1465
    invoke-virtual {v0, v2}, La1/i;->f(Lf/k;)V

    .line 1466
    .line 1467
    .line 1468
    invoke-virtual {v0}, La1/i;->o()V

    .line 1469
    .line 1470
    .line 1471
    const/4 v2, 0x0

    .line 1472
    iput-boolean v2, v0, La1/i;->s:Z
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    .line 1473
    .line 1474
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1475
    .line 1476
    .line 1477
    :goto_2c
    return-void

    .line 1478
    :catchall_7
    move-exception v0

    .line 1479
    goto :goto_2d

    .line 1480
    :catchall_8
    move-exception v0

    .line 1481
    :try_start_c
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1482
    .line 1483
    .line 1484
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    .line 1485
    :goto_2d
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1486
    .line 1487
    .line 1488
    throw v0

    .line 1489
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
