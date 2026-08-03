.class public final synthetic Lab/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lab/a;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lab/a;->h:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final e()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lab/a;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ld9/d;

    .line 4
    .line 5
    iget-object v0, v0, Ld9/d;->e:Ld9/m;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_4

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    invoke-virtual {v0}, Ld9/m;->h()Ld9/i;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const/4 v3, 0x1

    .line 16
    if-eqz v2, :cond_3

    .line 17
    .line 18
    iget-object v4, v2, Ld9/i;->a:Ljava/lang/reflect/Method;

    .line 19
    .line 20
    new-instance v5, Ld9/l;

    .line 21
    .line 22
    const/4 v6, 0x2

    .line 23
    invoke-direct {v5, v0, v6}, Ld9/l;-><init>(Ld9/m;I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v4, v5}, Ld9/m;->e(Ljava/lang/reflect/Executable;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    iget-object v5, v2, Ld9/i;->b:Ljava/lang/reflect/Constructor;

    .line 31
    .line 32
    new-instance v6, Ld9/l;

    .line 33
    .line 34
    const/4 v7, 0x0

    .line 35
    invoke-direct {v6, v0, v7}, Ld9/l;-><init>(Ld9/m;I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v5, v6}, Ld9/m;->e(Ljava/lang/reflect/Executable;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    iget-object v6, v2, Ld9/i;->c:Ljava/lang/reflect/Method;

    .line 43
    .line 44
    if-eqz v6, :cond_0

    .line 45
    .line 46
    new-instance v7, Ld9/l;

    .line 47
    .line 48
    const/4 v8, 0x3

    .line 49
    invoke-direct {v7, v0, v8}, Ld9/l;-><init>(Ld9/m;I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v6, v7}, Ld9/m;->e(Ljava/lang/reflect/Executable;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    goto :goto_0

    .line 57
    :catchall_0
    move-exception v1

    .line 58
    goto :goto_2

    .line 59
    :cond_0
    move v6, v3

    .line 60
    :goto_0
    iget-object v2, v2, Ld9/i;->d:Ljava/lang/reflect/Method;

    .line 61
    .line 62
    new-instance v7, Ld9/l;

    .line 63
    .line 64
    const/4 v8, 0x1

    .line 65
    invoke-direct {v7, v0, v8}, Ld9/l;-><init>(Ld9/m;I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v2, v7}, Ld9/m;->e(Ljava/lang/reflect/Executable;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-eqz v4, :cond_1

    .line 73
    .line 74
    if-eqz v5, :cond_1

    .line 75
    .line 76
    if-eqz v6, :cond_1

    .line 77
    .line 78
    if-eqz v2, :cond_1

    .line 79
    .line 80
    iput-boolean v3, v0, Ld9/m;->i:Z

    .line 81
    .line 82
    :cond_1
    sget-object v2, Lxa/a;->a:Lxa/a;

    .line 83
    .line 84
    iget-object v4, v0, Ld9/m;->a:Lr8/g;

    .line 85
    .line 86
    iget-object v5, v0, Ld9/m;->b:Lab/b;

    .line 87
    .line 88
    invoke-virtual {v2, v4, v5}, Lxa/a;->d(Lr8/g;Lfg/p;)Ljava/lang/reflect/Method;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    if-eqz v2, :cond_2

    .line 93
    .line 94
    new-instance v4, Ld9/l;

    .line 95
    .line 96
    const/4 v5, 0x5

    .line 97
    invoke-direct {v4, v0, v5}, Ld9/l;-><init>(Ld9/m;I)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v2, v4}, Ld9/m;->e(Ljava/lang/reflect/Executable;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 101
    .line 102
    .line 103
    :cond_2
    iget-boolean v2, v0, Ld9/m;->i:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    .line 105
    monitor-exit v0

    .line 106
    goto :goto_1

    .line 107
    :cond_3
    monitor-exit v0

    .line 108
    move v2, v1

    .line 109
    :goto_1
    if-ne v2, v3, :cond_4

    .line 110
    .line 111
    move v1, v3

    .line 112
    goto :goto_3

    .line 113
    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 114
    throw v1

    .line 115
    :cond_4
    :goto_3
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    return-object v0
.end method

.method private final f()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lab/a;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb9/a;

    .line 4
    .line 5
    iget-object v0, v0, Lb9/a;->f:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lda/h;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    const-string v2, "[Hchat:MessageTextColor] \u5b89\u88c5\u804a\u5929\u6d88\u606f\u7ed1\u5b9a Hook \u5931\u8d25: "

    .line 13
    .line 14
    monitor-enter v0

    .line 15
    :try_start_0
    iget-boolean v3, v0, Lda/h;->j:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    monitor-exit v0

    .line 21
    move v2, v4

    .line 22
    goto :goto_2

    .line 23
    :cond_0
    :try_start_1
    invoke-virtual {v0}, Lda/h;->p()Ljava/lang/reflect/Method;

    .line 24
    .line 25
    .line 26
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 27
    if-eqz v3, :cond_2

    .line 28
    .line 29
    :try_start_2
    sget-object v5, Lr8/i;->b:Lr8/i;

    .line 30
    .line 31
    new-instance v6, Lb9/e;

    .line 32
    .line 33
    const/4 v7, 0x5

    .line 34
    invoke-direct {v6, v0, v7}, Lb9/e;-><init>(Ljava/lang/Object;I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v5, v3, v6}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 38
    .line 39
    .line 40
    iput-boolean v4, v0, Lda/h;->j:Z

    .line 41
    .line 42
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception v3

    .line 46
    :try_start_3
    new-instance v5, Lsf/f;

    .line 47
    .line 48
    invoke-direct {v5, v3}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    move-object v3, v5

    .line 52
    :goto_0
    invoke-static {v3}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    if-nez v5, :cond_1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    new-instance v6, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v6, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-static {v2, v5}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 79
    .line 80
    :goto_1
    check-cast v3, Ljava/lang/Boolean;

    .line 81
    .line 82
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 83
    .line 84
    .line 85
    move-result v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 86
    monitor-exit v0

    .line 87
    goto :goto_2

    .line 88
    :catchall_1
    move-exception v1

    .line 89
    goto :goto_3

    .line 90
    :cond_2
    :try_start_4
    const-string v2, "[Hchat:MessageTextColor] \u5b9a\u4f4d\u804a\u5929\u6d88\u606f\u7ed1\u5b9a\u65b9\u6cd5\u5931\u8d25"

    .line 91
    .line 92
    invoke-static {v2}, Lfb/v0;->m(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 93
    .line 94
    .line 95
    monitor-exit v0

    .line 96
    move v2, v1

    .line 97
    :goto_2
    if-ne v2, v4, :cond_3

    .line 98
    .line 99
    move v1, v4

    .line 100
    goto :goto_4

    .line 101
    :goto_3
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 102
    throw v1

    .line 103
    :cond_3
    :goto_4
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    return-object v0
.end method

.method private final g()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lab/a;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lea/a;

    .line 4
    .line 5
    iget-object v0, v0, Lea/a;->e:Lea/c;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_4

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    iget-boolean v2, v0, Lea/c;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    monitor-exit v0

    .line 17
    move v2, v3

    .line 18
    goto :goto_4

    .line 19
    :cond_0
    :try_start_1
    invoke-virtual {v0}, Lea/c;->d()Ljava/lang/reflect/Constructor;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    invoke-virtual {v0}, Lea/c;->e()Ljava/lang/reflect/Method;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    sget-object v4, Lr8/i;->b:Lr8/i;

    .line 32
    .line 33
    new-instance v5, Lb9/e;

    .line 34
    .line 35
    const/4 v6, 0x7

    .line 36
    invoke-direct {v5, v0, v6}, Lb9/e;-><init>(Ljava/lang/Object;I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v4, v2, v5}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 40
    .line 41
    .line 42
    iput-boolean v3, v0, Lea/c;->c:Z

    .line 43
    .line 44
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :catchall_0
    move-exception v2

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    monitor-exit v0

    .line 50
    :goto_0
    move v2, v1

    .line 51
    goto :goto_4

    .line 52
    :cond_2
    monitor-exit v0

    .line 53
    goto :goto_0

    .line 54
    :goto_1
    :try_start_2
    new-instance v4, Lsf/f;

    .line 55
    .line 56
    invoke-direct {v4, v2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    move-object v2, v4

    .line 60
    :goto_2
    invoke-static {v2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    if-nez v4, :cond_3

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_3
    iget-object v2, v0, Lea/c;->d:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v2, Lab/b;

    .line 70
    .line 71
    const-string v5, "\u517c\u5bb9\u4f4e\u7248\u672c\u5c0f\u7a0b\u5e8fHook\u5931\u8d25"

    .line 72
    .line 73
    invoke-virtual {v2, v5, v4}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 77
    .line 78
    :goto_3
    check-cast v2, Ljava/lang/Boolean;

    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 81
    .line 82
    .line 83
    move-result v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 84
    monitor-exit v0

    .line 85
    :goto_4
    if-ne v2, v3, :cond_4

    .line 86
    .line 87
    move v1, v3

    .line 88
    goto :goto_5

    .line 89
    :catchall_1
    move-exception v1

    .line 90
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 91
    throw v1

    .line 92
    :cond_4
    :goto_5
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    return-object v0
.end method

.method private final h()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lab/a;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lfa/a;

    .line 4
    .line 5
    iget-object v0, v0, Lfa/a;->e:Lea/c;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_3

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    iget-boolean v2, v0, Lea/c;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    monitor-exit v0

    .line 17
    move v2, v3

    .line 18
    goto :goto_3

    .line 19
    :cond_0
    :try_start_1
    invoke-virtual {v0}, Lea/c;->h()Ljava/lang/reflect/Method;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    iget-object v4, v0, Lea/c;->a:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v4, Lr8/g;

    .line 28
    .line 29
    iget-object v4, v4, Lr8/g;->a:Landroid/content/Context;

    .line 30
    .line 31
    sget-object v5, Lr8/i;->b:Lr8/i;

    .line 32
    .line 33
    new-instance v6, Lea/b;

    .line 34
    .line 35
    const/4 v7, 0x1

    .line 36
    const/4 v8, 0x0

    .line 37
    invoke-direct {v6, v4, v7, v8}, Lea/b;-><init>(Landroid/content/Context;IZ)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v5, v2, v6}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 41
    .line 42
    .line 43
    iput-boolean v3, v0, Lea/c;->c:Z

    .line 44
    .line 45
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :catchall_0
    move-exception v2

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    monitor-exit v0

    .line 51
    move v2, v1

    .line 52
    goto :goto_3

    .line 53
    :goto_0
    :try_start_2
    new-instance v4, Lsf/f;

    .line 54
    .line 55
    invoke-direct {v4, v2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    move-object v2, v4

    .line 59
    :goto_1
    invoke-static {v2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    if-nez v4, :cond_2

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_2
    iget-object v2, v0, Lea/c;->d:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v2, Lab/b;

    .line 69
    .line 70
    const-string v5, "\u5c0f\u7a0b\u5e8f\u5f00\u5c4f\u5e7f\u544a Hook \u5b89\u88c5\u5931\u8d25"

    .line 71
    .line 72
    invoke-virtual {v2, v5, v4}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 76
    .line 77
    :goto_2
    check-cast v2, Ljava/lang/Boolean;

    .line 78
    .line 79
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 80
    .line 81
    .line 82
    move-result v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 83
    monitor-exit v0

    .line 84
    :goto_3
    if-ne v2, v3, :cond_3

    .line 85
    .line 86
    move v1, v3

    .line 87
    goto :goto_4

    .line 88
    :catchall_1
    move-exception v1

    .line 89
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 90
    throw v1

    .line 91
    :cond_3
    :goto_4
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    return-object v0
.end method

.method private final i()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lab/a;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lg9/a;

    .line 4
    .line 5
    iget-object v0, v0, Lg9/a;->e:Lg9/d;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_b

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    iget-object v2, v0, Lg9/d;->a:Lr8/g;

    .line 12
    .line 13
    iget-object v3, v0, Lg9/d;->b:Lab/b;

    .line 14
    .line 15
    invoke-static {v2, v3}, Lf8/i;->k0(Lr8/g;Lfg/p;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const/4 v4, 0x0

    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    move v3, v1

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    move v3, v1

    .line 33
    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v5, :cond_3

    .line 38
    .line 39
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    check-cast v5, Ljava/lang/reflect/Method;

    .line 44
    .line 45
    new-instance v6, Lg9/c;

    .line 46
    .line 47
    const/4 v7, 0x1

    .line 48
    invoke-direct {v6, v0, v7}, Lg9/c;-><init>(Lg9/d;I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v5, v6}, Lg9/d;->b(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    if-eqz v5, :cond_1

    .line 56
    .line 57
    add-int/lit8 v3, v3, 0x1

    .line 58
    .line 59
    if-ltz v3, :cond_2

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    invoke-static {}, La/a;->P0()V

    .line 63
    .line 64
    .line 65
    throw v4

    .line 66
    :catchall_0
    move-exception v1

    .line 67
    goto :goto_5

    .line 68
    :cond_3
    :goto_1
    iget-object v2, v0, Lg9/d;->a:Lr8/g;

    .line 69
    .line 70
    iget-object v5, v0, Lg9/d;->b:Lab/b;

    .line 71
    .line 72
    invoke-static {v2, v5}, Lf8/i;->j0(Lr8/g;Lfg/p;)Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    if-eqz v5, :cond_4

    .line 81
    .line 82
    move v5, v1

    .line 83
    goto :goto_3

    .line 84
    :cond_4
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    move v5, v1

    .line 89
    :cond_5
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    if-eqz v6, :cond_7

    .line 94
    .line 95
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    check-cast v6, Ljava/lang/reflect/Method;

    .line 100
    .line 101
    new-instance v7, Lg9/c;

    .line 102
    .line 103
    const/4 v8, 0x0

    .line 104
    invoke-direct {v7, v0, v8}, Lg9/c;-><init>(Lg9/d;I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v6, v7}, Lg9/d;->b(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 108
    .line 109
    .line 110
    move-result v6

    .line 111
    if-eqz v6, :cond_5

    .line 112
    .line 113
    add-int/lit8 v5, v5, 0x1

    .line 114
    .line 115
    if-ltz v5, :cond_6

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_6
    invoke-static {}, La/a;->P0()V

    .line 119
    .line 120
    .line 121
    throw v4

    .line 122
    :cond_7
    :goto_3
    if-gtz v3, :cond_8

    .line 123
    .line 124
    iget-object v2, v0, Lg9/d;->b:Lab/b;

    .line 125
    .line 126
    const-string v6, "\u4fdd\u5b58\u8868\u60c5\u83dc\u5355\u521b\u5efa Hook \u672a\u5b89\u88c5"

    .line 127
    .line 128
    invoke-virtual {v2, v6, v4}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    :cond_8
    if-gtz v5, :cond_9

    .line 132
    .line 133
    iget-object v2, v0, Lg9/d;->b:Lab/b;

    .line 134
    .line 135
    const-string v6, "\u4fdd\u5b58\u8868\u60c5\u83dc\u5355\u70b9\u51fb Hook \u672a\u5b89\u88c5"

    .line 136
    .line 137
    invoke-virtual {v2, v6, v4}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 138
    .line 139
    .line 140
    :cond_9
    const/4 v2, 0x1

    .line 141
    if-lez v3, :cond_a

    .line 142
    .line 143
    if-lez v5, :cond_a

    .line 144
    .line 145
    move v3, v2

    .line 146
    goto :goto_4

    .line 147
    :cond_a
    move v3, v1

    .line 148
    :goto_4
    monitor-exit v0

    .line 149
    if-ne v3, v2, :cond_b

    .line 150
    .line 151
    move v1, v2

    .line 152
    goto :goto_6

    .line 153
    :goto_5
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 154
    throw v1

    .line 155
    :cond_b
    :goto_6
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    return-object v0
.end method

.method private final j()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lab/a;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lh9/a;

    .line 4
    .line 5
    iget-object v0, v0, Lh9/a;->e:Lh9/b;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    iget-boolean v2, v0, Lh9/b;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    monitor-exit v0

    .line 17
    move v2, v3

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    :try_start_1
    invoke-virtual {v0}, Lh9/b;->a()Ljava/util/ArrayList;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    if-eqz v4, :cond_1

    .line 28
    .line 29
    monitor-exit v0

    .line 30
    move v2, v1

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    :try_start_2
    sget-object v4, Lh9/d;->a:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 33
    .line 34
    iget-object v4, v0, Lh9/b;->a:Lr8/g;

    .line 35
    .line 36
    iget-object v4, v4, Lr8/g;->a:Landroid/content/Context;

    .line 37
    .line 38
    iget-object v5, v0, Lh9/b;->b:Lab/b;

    .line 39
    .line 40
    invoke-static {v4, v2, v5}, Lh9/d;->c(Landroid/content/Context;Ljava/util/ArrayList;Lfg/p;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    iput-boolean v2, v0, Lh9/b;->d:Z

    .line 45
    .line 46
    iget-boolean v2, v0, Lh9/b;->d:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 47
    .line 48
    monitor-exit v0

    .line 49
    :goto_0
    if-ne v2, v3, :cond_2

    .line 50
    .line 51
    move v1, v3

    .line 52
    goto :goto_1

    .line 53
    :catchall_0
    move-exception v1

    .line 54
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 55
    throw v1

    .line 56
    :cond_2
    :goto_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    return-object v0
.end method

.method private final k()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lab/a;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lha/l;

    .line 4
    .line 5
    iget-object v0, v0, Lha/l;->e:Lha/m;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, v0, Lha/m;->b:Landroid/content/SharedPreferences;

    .line 10
    .line 11
    iget-object v2, v0, Lha/m;->c:Lb9/b;

    .line 12
    .line 13
    invoke-interface {v1, v2}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lha/m;->a()V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    return-object v0
.end method

.method private final l()Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, Lab/a;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lha/e0;

    .line 4
    .line 5
    iget-object v0, v0, Lha/e0;->e:Lea/c;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_9

    .line 9
    .line 10
    const-string v2, "\u670b\u53cb\u5708\u4e0a\u4f20\u5c3e\u5df4Hook\u5b89\u88c5\u5931\u8d25: "

    .line 11
    .line 12
    monitor-enter v0

    .line 13
    :try_start_0
    iget-boolean v3, v0, Lea/c;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    monitor-exit v0

    .line 19
    move v2, v4

    .line 20
    goto/16 :goto_5

    .line 21
    .line 22
    :cond_0
    :try_start_1
    iget-object v3, v0, Lea/c;->a:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v3, Lr8/g;

    .line 25
    .line 26
    iget-object v3, v3, Lr8/g;->e:Lh/Hchat/dexkit/DexFinder;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 27
    .line 28
    :try_start_2
    invoke-virtual {v3}, Lh/Hchat/dexkit/DexFinder;->resolveSnsUploadApi()V

    .line 29
    .line 30
    .line 31
    sget-object v5, Lsf/n;->a:Lsf/n;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception v5

    .line 35
    :try_start_3
    new-instance v6, Lsf/f;

    .line 36
    .line 37
    invoke-direct {v6, v5}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    move-object v5, v6

    .line 41
    :goto_0
    invoke-static {v5}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    if-eqz v5, :cond_1

    .line 46
    .line 47
    iget-object v6, v0, Lea/c;->d:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v6, Lab/b;

    .line 50
    .line 51
    const-string v7, "\u670b\u53cb\u5708\u4e0a\u4f20\u5c3e\u5df4\u5b9a\u4f4d\u670b\u53cb\u5708\u53d1\u5e03\u65b9\u6cd5\u5931\u8d25"

    .line 52
    .line 53
    invoke-virtual {v6, v7, v5}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :catchall_1
    move-exception v1

    .line 58
    goto/16 :goto_6

    .line 59
    .line 60
    :cond_1
    :goto_1
    iget-object v5, v3, Lh/Hchat/dexkit/DexFinder;->snsCommitMethod:Ljava/lang/reflect/Method;

    .line 61
    .line 62
    if-eqz v5, :cond_8

    .line 63
    .line 64
    iget-object v6, v3, Lh/Hchat/dexkit/DexFinder;->snsSetSdkIdMethod:Ljava/lang/reflect/Method;

    .line 65
    .line 66
    if-eqz v6, :cond_7

    .line 67
    .line 68
    iget-object v3, v3, Lh/Hchat/dexkit/DexFinder;->snsSetSdkAppNameMethod:Ljava/lang/reflect/Method;

    .line 69
    .line 70
    if-eqz v3, :cond_6

    .line 71
    .line 72
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 77
    .line 78
    .line 79
    move-result v7

    .line 80
    if-nez v7, :cond_5

    .line 81
    .line 82
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    invoke-virtual {v7}, Ljava/lang/Class;->isInterface()Z

    .line 87
    .line 88
    .line 89
    move-result v7
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 90
    if-eqz v7, :cond_2

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_2
    :try_start_4
    sget-object v7, Lr8/i;->b:Lr8/i;

    .line 94
    .line 95
    new-instance v8, Laa/d;

    .line 96
    .line 97
    const/4 v9, 0x1

    .line 98
    invoke-direct {v8, v0, v6, v3, v9}, Laa/d;-><init>(Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/lang/Object;I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v7, v5, v8}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 102
    .line 103
    .line 104
    iput-boolean v4, v0, Lea/c;->c:Z

    .line 105
    .line 106
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :catchall_2
    move-exception v3

    .line 110
    :try_start_5
    new-instance v6, Lsf/f;

    .line 111
    .line 112
    invoke-direct {v6, v3}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 113
    .line 114
    .line 115
    move-object v3, v6

    .line 116
    :goto_2
    invoke-static {v3}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    if-eqz v6, :cond_3

    .line 121
    .line 122
    iget-object v7, v0, Lea/c;->d:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v7, Lab/b;

    .line 125
    .line 126
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    new-instance v8, Ljava/lang/StringBuilder;

    .line 131
    .line 132
    invoke-direct {v8, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    invoke-virtual {v7, v2, v6}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    :cond_3
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 146
    .line 147
    instance-of v5, v3, Lsf/f;

    .line 148
    .line 149
    if-eqz v5, :cond_4

    .line 150
    .line 151
    move-object v3, v2

    .line 152
    :cond_4
    check-cast v3, Ljava/lang/Boolean;

    .line 153
    .line 154
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 155
    .line 156
    .line 157
    move-result v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 158
    monitor-exit v0

    .line 159
    goto :goto_5

    .line 160
    :cond_5
    :goto_3
    monitor-exit v0

    .line 161
    :goto_4
    move v2, v1

    .line 162
    goto :goto_5

    .line 163
    :cond_6
    monitor-exit v0

    .line 164
    goto :goto_4

    .line 165
    :cond_7
    monitor-exit v0

    .line 166
    goto :goto_4

    .line 167
    :cond_8
    monitor-exit v0

    .line 168
    goto :goto_4

    .line 169
    :goto_5
    if-ne v2, v4, :cond_9

    .line 170
    .line 171
    move v1, v4

    .line 172
    goto :goto_7

    .line 173
    :goto_6
    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 174
    throw v1

    .line 175
    :cond_9
    :goto_7
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    return-object v0
.end method

.method private final m()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lab/a;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb9/a;

    .line 4
    .line 5
    iget-object v0, v0, Lb9/a;->f:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lha/g0;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-virtual {v0, v1}, Lha/g0;->b(Z)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v1, 0x0

    .line 20
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lab/a;->g:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, Lab/a;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lhb/u;

    .line 11
    .line 12
    iget-object v2, v0, Lhb/u;->e:Lhb/i0;

    .line 13
    .line 14
    if-eqz v2, :cond_1c

    .line 15
    .line 16
    iget-object v0, v2, Lhb/i0;->a:Lr8/g;

    .line 17
    .line 18
    iget-object v4, v2, Lhb/i0;->b:Lab/b;

    .line 19
    .line 20
    invoke-static {v0, v4}, Lac/p;->F(Lr8/g;Lfg/p;)Ljava/lang/reflect/Method;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v4, v2, Lhb/i0;->a:Lr8/g;

    .line 25
    .line 26
    iget-object v5, v2, Lhb/i0;->b:Lab/b;

    .line 27
    .line 28
    invoke-static {v4, v5}, Lac/p;->E(Lr8/g;Lfg/p;)Ljava/lang/reflect/Method;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    const/4 v5, 0x0

    .line 33
    if-eqz v4, :cond_0

    .line 34
    .line 35
    iget-object v6, v2, Lhb/i0;->a:Lr8/g;

    .line 36
    .line 37
    iget-object v7, v2, Lhb/i0;->b:Lab/b;

    .line 38
    .line 39
    invoke-static {v6, v4, v7}, Lac/p;->G(Lr8/g;Ljava/lang/reflect/Method;Lfg/p;)Ljava/lang/reflect/Method;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    move-object v6, v5

    .line 45
    :goto_0
    const/4 v7, 0x1

    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    if-eqz v6, :cond_1

    .line 49
    .line 50
    new-instance v8, Lhb/h0;

    .line 51
    .line 52
    const/4 v9, 0x0

    .line 53
    invoke-direct {v8, v2, v9}, Lhb/h0;-><init>(Lhb/i0;I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2, v0, v8}, Lhb/i0;->b(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_1

    .line 61
    .line 62
    move v8, v7

    .line 63
    goto :goto_1

    .line 64
    :cond_1
    const/4 v8, 0x0

    .line 65
    :goto_1
    if-eqz v4, :cond_2

    .line 66
    .line 67
    if-eqz v6, :cond_2

    .line 68
    .line 69
    new-instance v0, Lc9/c2;

    .line 70
    .line 71
    const/4 v9, 0x5

    .line 72
    invoke-direct {v0, v2, v9, v6}, Lc9/c2;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v4, v0}, Lhb/i0;->b(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_2

    .line 80
    .line 81
    move v4, v7

    .line 82
    goto :goto_2

    .line 83
    :cond_2
    const/4 v4, 0x0

    .line 84
    :goto_2
    sget-object v6, Le8/b;->a:Le8/b;

    .line 85
    .line 86
    iget-object v9, v2, Lhb/i0;->a:Lr8/g;

    .line 87
    .line 88
    iget-object v0, v9, Lr8/g;->a:Landroid/content/Context;

    .line 89
    .line 90
    iget-object v10, v9, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 91
    .line 92
    invoke-static {v0, v10}, Le8/b;->g(Landroid/content/Context;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v10

    .line 96
    iget-object v11, v2, Lhb/i0;->f:Landroid/content/SharedPreferences;

    .line 97
    .line 98
    iget-object v0, v9, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 99
    .line 100
    const-string v12, "retransmit_done_v1"

    .line 101
    .line 102
    invoke-static {v11, v10, v0, v12}, Le8/b;->f(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/util/List;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    new-instance v13, Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 109
    .line 110
    .line 111
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    :cond_3
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v14

    .line 119
    if-eqz v14, :cond_4

    .line 120
    .line 121
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v14

    .line 125
    move-object v15, v14

    .line 126
    check-cast v15, Ljava/lang/reflect/Method;

    .line 127
    .line 128
    invoke-static {v15}, Lhb/i0;->c(Ljava/lang/reflect/Method;)Z

    .line 129
    .line 130
    .line 131
    move-result v15

    .line 132
    if-eqz v15, :cond_3

    .line 133
    .line 134
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_4
    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-nez v0, :cond_5

    .line 143
    .line 144
    goto/16 :goto_9

    .line 145
    .line 146
    :cond_5
    :try_start_0
    iget-object v0, v9, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 147
    .line 148
    new-instance v13, Lch/e;

    .line 149
    .line 150
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 151
    .line 152
    .line 153
    new-instance v14, Lfh/k;

    .line 154
    .line 155
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 156
    .line 157
    .line 158
    const-string v15, "com.tencent.mm.ui.transmit.MsgRetransmitUI"

    .line 159
    .line 160
    const/4 v3, 0x5

    .line 161
    invoke-virtual {v14, v3, v15}, Lfh/k;->l0(ILjava/lang/String;)V

    .line 162
    .line 163
    .line 164
    const-string v3, "sendResult"

    .line 165
    .line 166
    const-string v15, "SendMsgUsernames"

    .line 167
    .line 168
    filled-new-array {v3, v15}, [Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    invoke-static {v3}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    invoke-static {v14, v3}, Lfh/k;->u0(Lfh/k;Ljava/util/Collection;)V

    .line 177
    .line 178
    .line 179
    iput-object v14, v13, Lch/e;->h:Lfh/k;

    .line 180
    .line 181
    invoke-virtual {v0, v13}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    new-instance v3, Ljava/util/ArrayList;

    .line 186
    .line 187
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 191
    .line 192
    .line 193
    move-result-object v13

    .line 194
    :cond_6
    :goto_4
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    if-eqz v0, :cond_8

    .line 199
    .line 200
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    check-cast v0, Lhh/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 205
    .line 206
    :try_start_1
    iget-object v14, v9, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 207
    .line 208
    invoke-virtual {v0, v14}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 209
    .line 210
    .line 211
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 212
    goto :goto_5

    .line 213
    :catchall_0
    move-exception v0

    .line 214
    :try_start_2
    new-instance v14, Lsf/f;

    .line 215
    .line 216
    invoke-direct {v14, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 217
    .line 218
    .line 219
    move-object v0, v14

    .line 220
    :goto_5
    nop

    .line 221
    instance-of v14, v0, Lsf/f;

    .line 222
    .line 223
    if-eqz v14, :cond_7

    .line 224
    .line 225
    move-object v0, v5

    .line 226
    :cond_7
    check-cast v0, Ljava/lang/reflect/Method;

    .line 227
    .line 228
    if-eqz v0, :cond_6

    .line 229
    .line 230
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    goto :goto_4

    .line 234
    :catchall_1
    move-exception v0

    .line 235
    goto :goto_8

    .line 236
    :cond_8
    new-instance v0, Ljava/util/ArrayList;

    .line 237
    .line 238
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    :cond_9
    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 246
    .line 247
    .line 248
    move-result v9

    .line 249
    if-eqz v9, :cond_a

    .line 250
    .line 251
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v9

    .line 255
    move-object v13, v9

    .line 256
    check-cast v13, Ljava/lang/reflect/Method;

    .line 257
    .line 258
    invoke-static {v13}, Lhb/i0;->c(Ljava/lang/reflect/Method;)Z

    .line 259
    .line 260
    .line 261
    move-result v13

    .line 262
    if-eqz v13, :cond_9

    .line 263
    .line 264
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    goto :goto_6

    .line 268
    :cond_a
    new-instance v3, Ljava/util/HashSet;

    .line 269
    .line 270
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 271
    .line 272
    .line 273
    new-instance v9, Ljava/util/ArrayList;

    .line 274
    .line 275
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    :cond_b
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 283
    .line 284
    .line 285
    move-result v13

    .line 286
    if-eqz v13, :cond_c

    .line 287
    .line 288
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v13

    .line 292
    move-object v14, v13

    .line 293
    check-cast v14, Ljava/lang/reflect/Method;

    .line 294
    .line 295
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v14

    .line 299
    invoke-virtual {v3, v14}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result v14

    .line 303
    if-eqz v14, :cond_b

    .line 304
    .line 305
    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 306
    .line 307
    .line 308
    goto :goto_7

    .line 309
    :goto_8
    new-instance v9, Lsf/f;

    .line 310
    .line 311
    invoke-direct {v9, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 312
    .line 313
    .line 314
    :cond_c
    invoke-static {v9}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    if-eqz v0, :cond_d

    .line 319
    .line 320
    iget-object v3, v2, Lhb/i0;->b:Lab/b;

    .line 321
    .line 322
    const-string v13, "\u5b9a\u4f4d\u7fa4\u53d1\u52a9\u624b\u91cd\u53d1\u5b8c\u6210\u65b9\u6cd5\u5931\u8d25"

    .line 323
    .line 324
    invoke-virtual {v3, v13, v0}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    :cond_d
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 328
    .line 329
    instance-of v3, v9, Lsf/f;

    .line 330
    .line 331
    if-eqz v3, :cond_e

    .line 332
    .line 333
    move-object v9, v0

    .line 334
    :cond_e
    move-object v13, v9

    .line 335
    check-cast v13, Ljava/util/List;

    .line 336
    .line 337
    invoke-interface {v13}, Ljava/util/Collection;->isEmpty()Z

    .line 338
    .line 339
    .line 340
    move-result v0

    .line 341
    if-nez v0, :cond_f

    .line 342
    .line 343
    invoke-virtual {v6, v11, v10, v12, v13}, Le8/b;->j(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 344
    .line 345
    .line 346
    :cond_f
    :goto_9
    invoke-interface {v13}, Ljava/util/Collection;->isEmpty()Z

    .line 347
    .line 348
    .line 349
    move-result v0

    .line 350
    if-nez v0, :cond_13

    .line 351
    .line 352
    invoke-interface {v13}, Ljava/util/Collection;->isEmpty()Z

    .line 353
    .line 354
    .line 355
    move-result v0

    .line 356
    if-eqz v0, :cond_10

    .line 357
    .line 358
    goto :goto_a

    .line 359
    :cond_10
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    :cond_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 364
    .line 365
    .line 366
    move-result v3

    .line 367
    if-eqz v3, :cond_12

    .line 368
    .line 369
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v3

    .line 373
    check-cast v3, Ljava/lang/reflect/Method;

    .line 374
    .line 375
    new-instance v6, Lhb/h0;

    .line 376
    .line 377
    const/4 v9, 0x1

    .line 378
    invoke-direct {v6, v2, v9}, Lhb/h0;-><init>(Lhb/i0;I)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v2, v3, v6}, Lhb/i0;->b(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 382
    .line 383
    .line 384
    move-result v3

    .line 385
    if-nez v3, :cond_11

    .line 386
    .line 387
    goto :goto_b

    .line 388
    :cond_12
    :goto_a
    move v3, v7

    .line 389
    goto :goto_c

    .line 390
    :cond_13
    :goto_b
    const/4 v3, 0x0

    .line 391
    :goto_c
    iget-object v6, v2, Lhb/i0;->i:Lhb/k;

    .line 392
    .line 393
    invoke-virtual {v6}, Lhb/k;->i()Lhb/g;

    .line 394
    .line 395
    .line 396
    move-result-object v9

    .line 397
    if-eqz v9, :cond_17

    .line 398
    .line 399
    iput-object v9, v6, Lhb/k;->f:Lhb/g;

    .line 400
    .line 401
    iget-boolean v0, v6, Lhb/k;->j:Z

    .line 402
    .line 403
    if-eqz v0, :cond_14

    .line 404
    .line 405
    move v0, v7

    .line 406
    goto :goto_e

    .line 407
    :cond_14
    :try_start_3
    sget-object v0, Lr8/i;->b:Lr8/i;

    .line 408
    .line 409
    iget-object v10, v9, Lhb/g;->c:Ljava/lang/reflect/Method;

    .line 410
    .line 411
    new-instance v11, Lb9/e;

    .line 412
    .line 413
    const/16 v12, 0xb

    .line 414
    .line 415
    invoke-direct {v11, v6, v12}, Lb9/e;-><init>(Ljava/lang/Object;I)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v0, v10, v11}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 419
    .line 420
    .line 421
    iput-boolean v7, v6, Lhb/k;->j:Z

    .line 422
    .line 423
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 424
    .line 425
    goto :goto_d

    .line 426
    :catchall_2
    move-exception v0

    .line 427
    new-instance v10, Lsf/f;

    .line 428
    .line 429
    invoke-direct {v10, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 430
    .line 431
    .line 432
    move-object v0, v10

    .line 433
    :goto_d
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 434
    .line 435
    .line 436
    move-result-object v10

    .line 437
    if-eqz v10, :cond_15

    .line 438
    .line 439
    iget-object v6, v6, Lhb/k;->b:Lab/b;

    .line 440
    .line 441
    iget-object v9, v9, Lhb/g;->c:Ljava/lang/reflect/Method;

    .line 442
    .line 443
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object v9

    .line 447
    new-instance v11, Ljava/lang/StringBuilder;

    .line 448
    .line 449
    const-string v12, "\u5fae\u4fe1\u539f\u751f\u7fa4\u53d1\u52a9\u624b\u5b8c\u6210\u56de\u8c03Hook\u5931\u8d25: "

    .line 450
    .line 451
    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 452
    .line 453
    .line 454
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 455
    .line 456
    .line 457
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object v9

    .line 461
    invoke-virtual {v6, v9, v10}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    :cond_15
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 465
    .line 466
    instance-of v9, v0, Lsf/f;

    .line 467
    .line 468
    if-eqz v9, :cond_16

    .line 469
    .line 470
    move-object v0, v6

    .line 471
    :cond_16
    check-cast v0, Ljava/lang/Boolean;

    .line 472
    .line 473
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 474
    .line 475
    .line 476
    move-result v0

    .line 477
    goto :goto_e

    .line 478
    :cond_17
    const/4 v0, 0x0

    .line 479
    :goto_e
    if-nez v8, :cond_18

    .line 480
    .line 481
    iget-object v6, v2, Lhb/i0;->b:Lab/b;

    .line 482
    .line 483
    const-string v9, "\u7fa4\u53d1\u52a9\u624b\u83dc\u5355\u521b\u5efaHook\u672a\u5b89\u88c5"

    .line 484
    .line 485
    invoke-virtual {v6, v9, v5}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    :cond_18
    if-nez v4, :cond_19

    .line 489
    .line 490
    iget-object v6, v2, Lhb/i0;->b:Lab/b;

    .line 491
    .line 492
    const-string v9, "\u7fa4\u53d1\u52a9\u624b\u83dc\u5355\u70b9\u51fbHook\u672a\u5b89\u88c5"

    .line 493
    .line 494
    invoke-virtual {v6, v9, v5}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    :cond_19
    if-nez v3, :cond_1a

    .line 498
    .line 499
    iget-object v6, v2, Lhb/i0;->b:Lab/b;

    .line 500
    .line 501
    const-string v9, "\u7fa4\u53d1\u52a9\u624b\u91cd\u53d1\u5b8c\u6210Hook\u672a\u5b89\u88c5"

    .line 502
    .line 503
    invoke-virtual {v6, v9, v5}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    :cond_1a
    if-nez v0, :cond_1b

    .line 507
    .line 508
    iget-object v2, v2, Lhb/i0;->b:Lab/b;

    .line 509
    .line 510
    const-string v6, "\u5fae\u4fe1\u539f\u751f\u7fa4\u53d1\u52a9\u624b\u901a\u9053\u672a\u5b89\u88c5"

    .line 511
    .line 512
    invoke-virtual {v2, v6, v5}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    :cond_1b
    if-eqz v8, :cond_1c

    .line 516
    .line 517
    if-eqz v4, :cond_1c

    .line 518
    .line 519
    if-eqz v3, :cond_1c

    .line 520
    .line 521
    if-eqz v0, :cond_1c

    .line 522
    .line 523
    move v3, v7

    .line 524
    goto :goto_f

    .line 525
    :cond_1c
    const/4 v3, 0x0

    .line 526
    :goto_f
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 527
    .line 528
    .line 529
    move-result-object v0

    .line 530
    return-object v0

    .line 531
    :pswitch_0
    invoke-direct {v1}, Lab/a;->m()Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    return-object v0

    .line 536
    :pswitch_1
    invoke-direct {v1}, Lab/a;->l()Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    return-object v0

    .line 541
    :pswitch_2
    iget-object v0, v1, Lab/a;->h:Ljava/lang/Object;

    .line 542
    .line 543
    check-cast v0, Lha/z;

    .line 544
    .line 545
    const-string v2, "com.tencent.mm.plugin.sns.storage.SnsInfo"

    .line 546
    .line 547
    iget-object v0, v0, Lha/z;->a:Lr8/g;

    .line 548
    .line 549
    iget-object v0, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 550
    .line 551
    invoke-static {v2, v0}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 552
    .line 553
    .line 554
    move-result-object v0

    .line 555
    return-object v0

    .line 556
    :pswitch_3
    invoke-direct {v1}, Lab/a;->k()Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    return-object v0

    .line 561
    :pswitch_4
    invoke-direct {v1}, Lab/a;->j()Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    move-result-object v0

    .line 565
    return-object v0

    .line 566
    :pswitch_5
    invoke-direct {v1}, Lab/a;->i()Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object v0

    .line 570
    return-object v0

    .line 571
    :pswitch_6
    iget-object v0, v1, Lab/a;->h:Ljava/lang/Object;

    .line 572
    .line 573
    check-cast v0, Lg0/n;

    .line 574
    .line 575
    const/4 v2, 0x0

    .line 576
    iput-object v2, v0, Lg0/n;->F:Lg0/m;

    .line 577
    .line 578
    invoke-static {v0}, Lx1/k;->n(Lx1/z1;)V

    .line 579
    .line 580
    .line 581
    invoke-static {v0}, Lx1/k;->m(Lx1/v;)V

    .line 582
    .line 583
    .line 584
    invoke-static {v0}, Lx1/k;->l(Lx1/m;)V

    .line 585
    .line 586
    .line 587
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 588
    .line 589
    return-object v0

    .line 590
    :pswitch_7
    iget-object v0, v1, Lab/a;->h:Ljava/lang/Object;

    .line 591
    .line 592
    check-cast v0, Lg0/j;

    .line 593
    .line 594
    const/4 v2, 0x0

    .line 595
    iput-object v2, v0, Lg0/j;->I:Lg0/i;

    .line 596
    .line 597
    invoke-static {v0}, Lx1/k;->n(Lx1/z1;)V

    .line 598
    .line 599
    .line 600
    invoke-static {v0}, Lx1/k;->m(Lx1/v;)V

    .line 601
    .line 602
    .line 603
    invoke-static {v0}, Lx1/k;->l(Lx1/m;)V

    .line 604
    .line 605
    .line 606
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 607
    .line 608
    return-object v0

    .line 609
    :pswitch_8
    invoke-direct {v1}, Lab/a;->h()Ljava/lang/Object;

    .line 610
    .line 611
    .line 612
    move-result-object v0

    .line 613
    return-object v0

    .line 614
    :pswitch_9
    iget-object v0, v1, Lab/a;->h:Ljava/lang/Object;

    .line 615
    .line 616
    check-cast v0, Lf9/a;

    .line 617
    .line 618
    iget-object v0, v0, Lf9/a;->e:Lf9/e;

    .line 619
    .line 620
    const/4 v2, 0x0

    .line 621
    if-eqz v0, :cond_25

    .line 622
    .line 623
    iget-object v3, v0, Lf9/e;->a:Lr8/g;

    .line 624
    .line 625
    iget-object v4, v0, Lf9/e;->b:Lab/b;

    .line 626
    .line 627
    invoke-static {v3, v4}, Lf8/i;->j0(Lr8/g;Lfg/p;)Ljava/util/List;

    .line 628
    .line 629
    .line 630
    move-result-object v5

    .line 631
    invoke-static {v3, v4}, Lf8/i;->k0(Lr8/g;Lfg/p;)Ljava/util/List;

    .line 632
    .line 633
    .line 634
    move-result-object v3

    .line 635
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 636
    .line 637
    .line 638
    move-result v6

    .line 639
    const/4 v7, 0x0

    .line 640
    if-eqz v6, :cond_1d

    .line 641
    .line 642
    const-string v6, "\u4fee\u6539\u804a\u5929\u8bb0\u5f55\u5b9a\u4f4d\u83dc\u5355\u70b9\u51fb\u65b9\u6cd5\u5931\u8d25"

    .line 643
    .line 644
    invoke-virtual {v4, v6, v7}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 645
    .line 646
    .line 647
    :cond_1d
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 648
    .line 649
    .line 650
    move-result v6

    .line 651
    if-eqz v6, :cond_1e

    .line 652
    .line 653
    const-string v6, "\u4fee\u6539\u804a\u5929\u8bb0\u5f55\u5b9a\u4f4d\u83dc\u5355\u521b\u5efa\u65b9\u6cd5\u5931\u8d25"

    .line 654
    .line 655
    invoke-virtual {v4, v6, v7}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 656
    .line 657
    .line 658
    :cond_1e
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 659
    .line 660
    .line 661
    move-result-object v3

    .line 662
    move v6, v2

    .line 663
    :cond_1f
    :goto_10
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 664
    .line 665
    .line 666
    move-result v8

    .line 667
    const/4 v9, 0x1

    .line 668
    if-eqz v8, :cond_20

    .line 669
    .line 670
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 671
    .line 672
    .line 673
    move-result-object v8

    .line 674
    check-cast v8, Ljava/lang/reflect/Method;

    .line 675
    .line 676
    invoke-virtual {v0, v8, v9}, Lf9/e;->b(Ljava/lang/reflect/Method;Z)Z

    .line 677
    .line 678
    .line 679
    move-result v8

    .line 680
    if-eqz v8, :cond_1f

    .line 681
    .line 682
    add-int/lit8 v6, v6, 0x1

    .line 683
    .line 684
    goto :goto_10

    .line 685
    :cond_20
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 686
    .line 687
    .line 688
    move-result-object v3

    .line 689
    move v5, v2

    .line 690
    :cond_21
    :goto_11
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 691
    .line 692
    .line 693
    move-result v8

    .line 694
    if-eqz v8, :cond_22

    .line 695
    .line 696
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 697
    .line 698
    .line 699
    move-result-object v8

    .line 700
    check-cast v8, Ljava/lang/reflect/Method;

    .line 701
    .line 702
    invoke-virtual {v0, v8, v2}, Lf9/e;->b(Ljava/lang/reflect/Method;Z)Z

    .line 703
    .line 704
    .line 705
    move-result v8

    .line 706
    if-eqz v8, :cond_21

    .line 707
    .line 708
    add-int/lit8 v5, v5, 0x1

    .line 709
    .line 710
    goto :goto_11

    .line 711
    :cond_22
    if-lez v6, :cond_23

    .line 712
    .line 713
    if-gtz v5, :cond_24

    .line 714
    .line 715
    :cond_23
    const-string v0, "\u4fee\u6539\u804a\u5929\u8bb0\u5f55Hook\u672a\u5b89\u88c5"

    .line 716
    .line 717
    invoke-virtual {v4, v0, v7}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 718
    .line 719
    .line 720
    :cond_24
    if-lez v6, :cond_25

    .line 721
    .line 722
    if-lez v5, :cond_25

    .line 723
    .line 724
    move v2, v9

    .line 725
    :cond_25
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 726
    .line 727
    .line 728
    move-result-object v0

    .line 729
    return-object v0

    .line 730
    :pswitch_a
    iget-object v0, v1, Lab/a;->h:Ljava/lang/Object;

    .line 731
    .line 732
    check-cast v0, Lf0/u;

    .line 733
    .line 734
    new-instance v2, Landroid/view/inputmethod/BaseInputConnection;

    .line 735
    .line 736
    iget-object v0, v0, Lf0/u;->a:Landroid/view/View;

    .line 737
    .line 738
    const/4 v3, 0x0

    .line 739
    invoke-direct {v2, v0, v3}, Landroid/view/inputmethod/BaseInputConnection;-><init>(Landroid/view/View;Z)V

    .line 740
    .line 741
    .line 742
    return-object v2

    .line 743
    :pswitch_b
    iget-object v0, v1, Lab/a;->h:Ljava/lang/Object;

    .line 744
    .line 745
    check-cast v0, Lf0/n;

    .line 746
    .line 747
    iget-object v0, v0, Lf0/n;->b:Landroid/view/View;

    .line 748
    .line 749
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 750
    .line 751
    .line 752
    move-result-object v0

    .line 753
    const-string v2, "input_method"

    .line 754
    .line 755
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 756
    .line 757
    .line 758
    move-result-object v0

    .line 759
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 760
    .line 761
    .line 762
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 763
    .line 764
    return-object v0

    .line 765
    :pswitch_c
    iget-object v0, v1, Lab/a;->h:Ljava/lang/Object;

    .line 766
    .line 767
    check-cast v0, Lwb/p3;

    .line 768
    .line 769
    invoke-static {v0}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->o(Lwb/p3;)Ljava/lang/Boolean;

    .line 770
    .line 771
    .line 772
    move-result-object v0

    .line 773
    return-object v0

    .line 774
    :pswitch_d
    iget-object v0, v1, Lab/a;->h:Ljava/lang/Object;

    .line 775
    .line 776
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 777
    .line 778
    invoke-static {v0}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->p(Ljava/util/concurrent/CopyOnWriteArrayList;)Ljava/lang/Boolean;

    .line 779
    .line 780
    .line 781
    move-result-object v0

    .line 782
    return-object v0

    .line 783
    :pswitch_e
    invoke-direct {v1}, Lab/a;->g()Ljava/lang/Object;

    .line 784
    .line 785
    .line 786
    move-result-object v0

    .line 787
    return-object v0

    .line 788
    :pswitch_f
    invoke-direct {v1}, Lab/a;->f()Ljava/lang/Object;

    .line 789
    .line 790
    .line 791
    move-result-object v0

    .line 792
    return-object v0

    .line 793
    :pswitch_10
    invoke-direct {v1}, Lab/a;->e()Ljava/lang/Object;

    .line 794
    .line 795
    .line 796
    move-result-object v0

    .line 797
    return-object v0

    .line 798
    :pswitch_11
    iget-object v0, v1, Lab/a;->h:Ljava/lang/Object;

    .line 799
    .line 800
    check-cast v0, Lb9/a;

    .line 801
    .line 802
    iget-object v0, v0, Lb9/a;->f:Ljava/lang/Object;

    .line 803
    .line 804
    move-object v2, v0

    .line 805
    check-cast v2, Lcb/f;

    .line 806
    .line 807
    const/4 v0, 0x0

    .line 808
    if-eqz v2, :cond_2a

    .line 809
    .line 810
    monitor-enter v2

    .line 811
    :try_start_4
    iget-boolean v3, v2, Lcb/f;->c:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 812
    .line 813
    const/4 v4, 0x1

    .line 814
    if-eqz v3, :cond_26

    .line 815
    .line 816
    monitor-exit v2

    .line 817
    move v3, v4

    .line 818
    goto :goto_14

    .line 819
    :cond_26
    :try_start_5
    invoke-virtual {v2}, Lcb/f;->o()Lcb/c;

    .line 820
    .line 821
    .line 822
    move-result-object v3

    .line 823
    if-eqz v3, :cond_29

    .line 824
    .line 825
    iget-object v5, v3, Lcb/c;->a:Ljava/lang/reflect/Method;

    .line 826
    .line 827
    const/4 v6, -0x1

    .line 828
    const/4 v7, 0x2

    .line 829
    invoke-virtual {v2, v5, v7, v6}, Lcb/f;->f(Ljava/lang/reflect/Executable;II)Z

    .line 830
    .line 831
    .line 832
    move-result v5

    .line 833
    iget-object v6, v3, Lcb/c;->b:Ljava/lang/reflect/Constructor;

    .line 834
    .line 835
    invoke-virtual {v6}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 836
    .line 837
    .line 838
    move-result-object v8

    .line 839
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 840
    .line 841
    .line 842
    invoke-static {v8}, Lcb/f;->m([Ljava/lang/Class;)I

    .line 843
    .line 844
    .line 845
    move-result v8

    .line 846
    invoke-virtual {v2, v6, v7, v8}, Lcb/f;->f(Ljava/lang/reflect/Executable;II)Z

    .line 847
    .line 848
    .line 849
    move-result v6

    .line 850
    iget-object v3, v3, Lcb/c;->c:Ljava/lang/reflect/Method;

    .line 851
    .line 852
    if-eqz v3, :cond_27

    .line 853
    .line 854
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 855
    .line 856
    .line 857
    move-result-object v7

    .line 858
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 859
    .line 860
    .line 861
    invoke-static {v7}, Lcb/f;->m([Ljava/lang/Class;)I

    .line 862
    .line 863
    .line 864
    move-result v7

    .line 865
    const/4 v8, 0x3

    .line 866
    invoke-virtual {v2, v3, v8, v7}, Lcb/f;->f(Ljava/lang/reflect/Executable;II)Z

    .line 867
    .line 868
    .line 869
    move-result v3

    .line 870
    goto :goto_12

    .line 871
    :catchall_3
    move-exception v0

    .line 872
    goto :goto_15

    .line 873
    :cond_27
    move v3, v4

    .line 874
    :goto_12
    if-eqz v5, :cond_28

    .line 875
    .line 876
    if-eqz v6, :cond_28

    .line 877
    .line 878
    if-eqz v3, :cond_28

    .line 879
    .line 880
    move v3, v4

    .line 881
    goto :goto_13

    .line 882
    :cond_28
    move v3, v0

    .line 883
    :goto_13
    iput-boolean v3, v2, Lcb/f;->c:Z

    .line 884
    .line 885
    iget-boolean v3, v2, Lcb/f;->c:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 886
    .line 887
    monitor-exit v2

    .line 888
    goto :goto_14

    .line 889
    :cond_29
    :try_start_6
    const-string v3, "[Hchat:RoundAvatar] \u5b9a\u4f4d\u5fae\u4fe1\u5168\u5c40\u5934\u50cf\u5165\u53e3\u5931\u8d25"

    .line 890
    .line 891
    invoke-static {v3}, Lfb/v0;->m(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 892
    .line 893
    .line 894
    monitor-exit v2

    .line 895
    move v3, v0

    .line 896
    :goto_14
    if-ne v3, v4, :cond_2a

    .line 897
    .line 898
    move v0, v4

    .line 899
    goto :goto_16

    .line 900
    :goto_15
    :try_start_7
    monitor-exit v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 901
    throw v0

    .line 902
    :cond_2a
    :goto_16
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 903
    .line 904
    .line 905
    move-result-object v0

    .line 906
    return-object v0

    .line 907
    :pswitch_12
    iget-object v0, v1, Lab/a;->h:Ljava/lang/Object;

    .line 908
    .line 909
    check-cast v0, Lb5/c;

    .line 910
    .line 911
    iget-object v2, v0, Lb5/c;->a:Ljava/lang/Object;

    .line 912
    .line 913
    check-cast v2, Lr8/g;

    .line 914
    .line 915
    iget-object v0, v0, Lb5/c;->b:Ljava/lang/Object;

    .line 916
    .line 917
    move-object v3, v0

    .line 918
    check-cast v3, Lab/b;

    .line 919
    .line 920
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 921
    .line 922
    .line 923
    iget-object v0, v2, Lr8/g;->a:Landroid/content/Context;

    .line 924
    .line 925
    const-string v4, "Hchat_chat_live_photo_method_cache"

    .line 926
    .line 927
    invoke-static {v0, v4}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 928
    .line 929
    .line 930
    move-result-object v4

    .line 931
    iget-object v5, v2, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 932
    .line 933
    invoke-static {v0, v5}, Le8/b;->g(Landroid/content/Context;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 934
    .line 935
    .line 936
    move-result-object v6

    .line 937
    const-string v7, "storage_getter_v1"

    .line 938
    .line 939
    invoke-static {v4, v6, v5, v7}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 940
    .line 941
    .line 942
    move-result-object v0

    .line 943
    const-string v8, "record_query_v1"

    .line 944
    .line 945
    invoke-static {v4, v6, v5, v8}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 946
    .line 947
    .line 948
    move-result-object v9

    .line 949
    const-string v10, "media_factory_v1"

    .line 950
    .line 951
    invoke-static {v4, v6, v5, v10}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 952
    .line 953
    .line 954
    move-result-object v11

    .line 955
    const/4 v12, 0x0

    .line 956
    const/4 v13, 0x1

    .line 957
    if-eqz v0, :cond_2c

    .line 958
    .line 959
    if-eqz v9, :cond_2c

    .line 960
    .line 961
    if-eqz v11, :cond_2c

    .line 962
    .line 963
    new-instance v15, Lca/b;

    .line 964
    .line 965
    invoke-direct {v15, v0, v9, v11}, Lca/b;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    .line 966
    .line 967
    .line 968
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 969
    .line 970
    .line 971
    move-result-object v14

    .line 972
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 973
    .line 974
    .line 975
    invoke-static {v12, v14}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 976
    .line 977
    .line 978
    move-result-object v14

    .line 979
    check-cast v14, Ljava/lang/Class;

    .line 980
    .line 981
    if-eqz v14, :cond_2b

    .line 982
    .line 983
    invoke-static {v14, v11}, Lac/p;->x(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z

    .line 984
    .line 985
    .line 986
    move-result v14

    .line 987
    if-eqz v14, :cond_2b

    .line 988
    .line 989
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 990
    .line 991
    .line 992
    move-result-object v11

    .line 993
    aget-object v11, v11, v13

    .line 994
    .line 995
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 996
    .line 997
    .line 998
    invoke-static {v11, v9}, Lac/p;->B(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z

    .line 999
    .line 1000
    .line 1001
    move-result v11

    .line 1002
    if-eqz v11, :cond_2b

    .line 1003
    .line 1004
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v9

    .line 1008
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1009
    .line 1010
    .line 1011
    invoke-static {v9, v0}, Lac/p;->C(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z

    .line 1012
    .line 1013
    .line 1014
    move-result v0

    .line 1015
    if-eqz v0, :cond_2b

    .line 1016
    .line 1017
    goto :goto_17

    .line 1018
    :cond_2b
    const/4 v15, 0x0

    .line 1019
    :goto_17
    if-eqz v15, :cond_2c

    .line 1020
    .line 1021
    goto/16 :goto_26

    .line 1022
    .line 1023
    :cond_2c
    invoke-static {v4, v6, v7}, Le8/b;->a(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)V

    .line 1024
    .line 1025
    .line 1026
    invoke-static {v4, v6, v8}, Le8/b;->a(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)V

    .line 1027
    .line 1028
    .line 1029
    invoke-static {v4, v6, v10}, Le8/b;->a(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)V

    .line 1030
    .line 1031
    .line 1032
    :try_start_8
    iget-object v0, v2, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 1033
    .line 1034
    new-instance v2, Lch/e;

    .line 1035
    .line 1036
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1037
    .line 1038
    .line 1039
    new-instance v9, Lfh/k;

    .line 1040
    .line 1041
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 1042
    .line 1043
    .line 1044
    const-string v11, "ChatLiveMediaInfo imgInfo query failed, msgId="

    .line 1045
    .line 1046
    const-string v14, "create ChatLiveMediaInfo, msgId="

    .line 1047
    .line 1048
    filled-new-array {v11, v14}, [Ljava/lang/String;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v11

    .line 1052
    invoke-static {v11}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v11

    .line 1056
    invoke-static {v9, v11}, Lfh/k;->u0(Lfh/k;Ljava/util/Collection;)V

    .line 1057
    .line 1058
    .line 1059
    iput-object v9, v2, Lch/e;->h:Lfh/k;

    .line 1060
    .line 1061
    invoke-virtual {v0, v2}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v0

    .line 1065
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v2

    .line 1069
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1070
    .line 1071
    .line 1072
    :cond_2d
    :goto_18
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1073
    .line 1074
    .line 1075
    move-result v0

    .line 1076
    if-eqz v0, :cond_3c

    .line 1077
    .line 1078
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v0

    .line 1082
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1083
    .line 1084
    .line 1085
    move-object v9, v0

    .line 1086
    check-cast v9, Lhh/o;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 1087
    .line 1088
    :try_start_9
    invoke-virtual {v9}, Lhh/o;->p()Llh/d;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v0

    .line 1092
    invoke-virtual {v0, v5}, Llh/d;->b(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 1096
    goto :goto_19

    .line 1097
    :catchall_4
    move-exception v0

    .line 1098
    :try_start_a
    new-instance v11, Lsf/f;

    .line 1099
    .line 1100
    invoke-direct {v11, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1101
    .line 1102
    .line 1103
    move-object v0, v11

    .line 1104
    :goto_19
    nop

    .line 1105
    instance-of v11, v0, Lsf/f;

    .line 1106
    .line 1107
    if-eqz v11, :cond_2e

    .line 1108
    .line 1109
    const/4 v0, 0x0

    .line 1110
    :cond_2e
    check-cast v0, Ljava/lang/reflect/Method;

    .line 1111
    .line 1112
    if-eqz v0, :cond_2d

    .line 1113
    .line 1114
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1115
    .line 1116
    .line 1117
    move-result-object v0

    .line 1118
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1119
    .line 1120
    .line 1121
    array-length v11, v0

    .line 1122
    if-ne v11, v13, :cond_2f

    .line 1123
    .line 1124
    aget-object v0, v0, v12

    .line 1125
    .line 1126
    move-object v11, v0

    .line 1127
    goto :goto_1a

    .line 1128
    :cond_2f
    const/4 v11, 0x0

    .line 1129
    :goto_1a
    if-eqz v11, :cond_2d

    .line 1130
    .line 1131
    invoke-virtual {v9}, Lhh/o;->q()Lhh/p;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v0

    .line 1135
    new-instance v9, Ljava/util/ArrayList;

    .line 1136
    .line 1137
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 1138
    .line 1139
    .line 1140
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v14

    .line 1144
    :cond_30
    :goto_1b
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 1145
    .line 1146
    .line 1147
    move-result v0

    .line 1148
    if-eqz v0, :cond_32

    .line 1149
    .line 1150
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v0

    .line 1154
    check-cast v0, Lhh/o;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 1155
    .line 1156
    :try_start_b
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1157
    .line 1158
    .line 1159
    invoke-virtual {v0}, Lhh/o;->p()Llh/d;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v0

    .line 1163
    invoke-virtual {v0, v5}, Llh/d;->b(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 1167
    goto :goto_1c

    .line 1168
    :catchall_5
    move-exception v0

    .line 1169
    :try_start_c
    new-instance v15, Lsf/f;

    .line 1170
    .line 1171
    invoke-direct {v15, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1172
    .line 1173
    .line 1174
    move-object v0, v15

    .line 1175
    :goto_1c
    nop

    .line 1176
    instance-of v15, v0, Lsf/f;

    .line 1177
    .line 1178
    if-eqz v15, :cond_31

    .line 1179
    .line 1180
    const/4 v0, 0x0

    .line 1181
    :cond_31
    check-cast v0, Ljava/lang/reflect/Method;

    .line 1182
    .line 1183
    if-eqz v0, :cond_30

    .line 1184
    .line 1185
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1186
    .line 1187
    .line 1188
    goto :goto_1b

    .line 1189
    :catchall_6
    move-exception v0

    .line 1190
    goto/16 :goto_23

    .line 1191
    .line 1192
    :cond_32
    new-instance v0, Ljava/util/ArrayList;

    .line 1193
    .line 1194
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1195
    .line 1196
    .line 1197
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1198
    .line 1199
    .line 1200
    move-result-object v14

    .line 1201
    :goto_1d
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 1202
    .line 1203
    .line 1204
    move-result v15

    .line 1205
    if-eqz v15, :cond_34

    .line 1206
    .line 1207
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v15

    .line 1211
    move-object v12, v15

    .line 1212
    check-cast v12, Ljava/lang/reflect/Method;

    .line 1213
    .line 1214
    invoke-static {v11, v12}, Lac/p;->x(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z

    .line 1215
    .line 1216
    .line 1217
    move-result v12

    .line 1218
    if-eqz v12, :cond_33

    .line 1219
    .line 1220
    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1221
    .line 1222
    .line 1223
    :cond_33
    const/4 v12, 0x0

    .line 1224
    goto :goto_1d

    .line 1225
    :cond_34
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1226
    .line 1227
    .line 1228
    move-result-object v0

    .line 1229
    :goto_1e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1230
    .line 1231
    .line 1232
    move-result v11

    .line 1233
    if-eqz v11, :cond_3b

    .line 1234
    .line 1235
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v11

    .line 1239
    check-cast v11, Ljava/lang/reflect/Method;

    .line 1240
    .line 1241
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v12

    .line 1245
    aget-object v12, v12, v13

    .line 1246
    .line 1247
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1248
    .line 1249
    .line 1250
    move-result-object v14

    .line 1251
    :goto_1f
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 1252
    .line 1253
    .line 1254
    move-result v15

    .line 1255
    if-eqz v15, :cond_36

    .line 1256
    .line 1257
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v15

    .line 1261
    move-object v13, v15

    .line 1262
    check-cast v13, Ljava/lang/reflect/Method;

    .line 1263
    .line 1264
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1265
    .line 1266
    .line 1267
    invoke-static {v12, v13}, Lac/p;->B(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z

    .line 1268
    .line 1269
    .line 1270
    move-result v13

    .line 1271
    if-eqz v13, :cond_35

    .line 1272
    .line 1273
    goto :goto_20

    .line 1274
    :cond_35
    const/4 v13, 0x1

    .line 1275
    goto :goto_1f

    .line 1276
    :cond_36
    const/4 v15, 0x0

    .line 1277
    :goto_20
    check-cast v15, Ljava/lang/reflect/Method;

    .line 1278
    .line 1279
    if-eqz v15, :cond_3a

    .line 1280
    .line 1281
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1282
    .line 1283
    .line 1284
    move-result-object v12

    .line 1285
    :goto_21
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 1286
    .line 1287
    .line 1288
    move-result v13

    .line 1289
    if-eqz v13, :cond_38

    .line 1290
    .line 1291
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v13

    .line 1295
    move-object v14, v13

    .line 1296
    check-cast v14, Ljava/lang/reflect/Method;

    .line 1297
    .line 1298
    move-object/from16 v16, v0

    .line 1299
    .line 1300
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 1301
    .line 1302
    .line 1303
    move-result-object v0

    .line 1304
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1305
    .line 1306
    .line 1307
    invoke-static {v0, v14}, Lac/p;->C(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z

    .line 1308
    .line 1309
    .line 1310
    move-result v0

    .line 1311
    if-eqz v0, :cond_37

    .line 1312
    .line 1313
    goto :goto_22

    .line 1314
    :cond_37
    move-object/from16 v0, v16

    .line 1315
    .line 1316
    goto :goto_21

    .line 1317
    :cond_38
    move-object/from16 v16, v0

    .line 1318
    .line 1319
    const/4 v13, 0x0

    .line 1320
    :goto_22
    check-cast v13, Ljava/lang/reflect/Method;

    .line 1321
    .line 1322
    if-eqz v13, :cond_39

    .line 1323
    .line 1324
    new-instance v0, Lca/b;

    .line 1325
    .line 1326
    invoke-direct {v0, v13, v15, v11}, Lca/b;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    .line 1327
    .line 1328
    .line 1329
    goto :goto_24

    .line 1330
    :cond_39
    move-object/from16 v0, v16

    .line 1331
    .line 1332
    :cond_3a
    const/4 v13, 0x1

    .line 1333
    goto :goto_1e

    .line 1334
    :cond_3b
    const/4 v12, 0x0

    .line 1335
    goto/16 :goto_18

    .line 1336
    .line 1337
    :cond_3c
    const/4 v0, 0x0

    .line 1338
    goto :goto_24

    .line 1339
    :goto_23
    new-instance v2, Lsf/f;

    .line 1340
    .line 1341
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1342
    .line 1343
    .line 1344
    move-object v0, v2

    .line 1345
    :goto_24
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1346
    .line 1347
    .line 1348
    move-result-object v2

    .line 1349
    if-eqz v2, :cond_3d

    .line 1350
    .line 1351
    const-string v5, "\u5b9a\u4f4d\u804a\u5929\u5b9e\u51b5\u56fe\u7247\u65b9\u6cd5\u5931\u8d25"

    .line 1352
    .line 1353
    invoke-virtual {v3, v5, v2}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1354
    .line 1355
    .line 1356
    :cond_3d
    instance-of v2, v0, Lsf/f;

    .line 1357
    .line 1358
    if-eqz v2, :cond_3e

    .line 1359
    .line 1360
    const/4 v0, 0x0

    .line 1361
    :cond_3e
    check-cast v0, Lca/b;

    .line 1362
    .line 1363
    if-eqz v0, :cond_3f

    .line 1364
    .line 1365
    iget-object v2, v0, Lca/b;->a:Ljava/lang/reflect/Method;

    .line 1366
    .line 1367
    invoke-static {v4, v6, v7, v2}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 1368
    .line 1369
    .line 1370
    iget-object v2, v0, Lca/b;->b:Ljava/lang/reflect/Method;

    .line 1371
    .line 1372
    invoke-static {v4, v6, v8, v2}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 1373
    .line 1374
    .line 1375
    iget-object v2, v0, Lca/b;->c:Ljava/lang/reflect/Method;

    .line 1376
    .line 1377
    invoke-static {v4, v6, v10, v2}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 1378
    .line 1379
    .line 1380
    move-object v14, v0

    .line 1381
    goto :goto_25

    .line 1382
    :cond_3f
    const/4 v14, 0x0

    .line 1383
    :goto_25
    move-object v15, v14

    .line 1384
    :goto_26
    return-object v15

    .line 1385
    :pswitch_13
    iget-object v0, v1, Lab/a;->h:Ljava/lang/Object;

    .line 1386
    .line 1387
    check-cast v0, Lc9/r1;

    .line 1388
    .line 1389
    iget-object v0, v0, Lc9/r1;->a:Landroid/app/Activity;

    .line 1390
    .line 1391
    invoke-static {v0}, Lc9/d2;->y(Landroid/content/Context;)V

    .line 1392
    .line 1393
    .line 1394
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1395
    .line 1396
    return-object v0

    .line 1397
    :pswitch_14
    iget-object v0, v1, Lab/a;->h:Ljava/lang/Object;

    .line 1398
    .line 1399
    check-cast v0, Lc0/n;

    .line 1400
    .line 1401
    iget-boolean v2, v0, Ly0/n;->t:Z

    .line 1402
    .line 1403
    if-eqz v2, :cond_40

    .line 1404
    .line 1405
    invoke-static {v0}, Lc0/k;->b(Lx1/i;)Lz/c;

    .line 1406
    .line 1407
    .line 1408
    move-result-object v0

    .line 1409
    goto :goto_27

    .line 1410
    :cond_40
    sget-object v0, Lz/c;->b:Lz/c;

    .line 1411
    .line 1412
    :goto_27
    return-object v0

    .line 1413
    :pswitch_15
    iget-object v0, v1, Lab/a;->h:Ljava/lang/Object;

    .line 1414
    .line 1415
    check-cast v0, Lbb/e;

    .line 1416
    .line 1417
    iget-object v2, v0, Lbb/e;->e:Lbb/g;

    .line 1418
    .line 1419
    const/4 v3, 0x0

    .line 1420
    if-eqz v2, :cond_49

    .line 1421
    .line 1422
    iget-boolean v0, v2, Lbb/g;->l:Z

    .line 1423
    .line 1424
    const/4 v4, 0x1

    .line 1425
    if-eqz v0, :cond_41

    .line 1426
    .line 1427
    goto/16 :goto_2a

    .line 1428
    .line 1429
    :cond_41
    const-string v0, "fillingUsername:need getKfInfo"

    .line 1430
    .line 1431
    iget-object v5, v2, Lbb/g;->a:Lr8/g;

    .line 1432
    .line 1433
    iget-object v6, v5, Lr8/g;->a:Landroid/content/Context;

    .line 1434
    .line 1435
    iget-object v7, v5, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 1436
    .line 1437
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1438
    .line 1439
    .line 1440
    invoke-static {v6, v7}, Lo8/k;->a(Landroid/content/Context;Ljava/lang/ClassLoader;)Ll8/i;

    .line 1441
    .line 1442
    .line 1443
    move-result-object v6

    .line 1444
    iget-object v6, v6, Ll8/i;->h:Ljava/lang/String;

    .line 1445
    .line 1446
    iget-object v7, v2, Lbb/g;->k:Landroid/content/SharedPreferences;

    .line 1447
    .line 1448
    iget-object v5, v5, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 1449
    .line 1450
    const-string v8, "username_bind"

    .line 1451
    .line 1452
    invoke-static {v7, v6, v5, v8}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 1453
    .line 1454
    .line 1455
    move-result-object v5

    .line 1456
    const/4 v9, 0x0

    .line 1457
    if-eqz v5, :cond_43

    .line 1458
    .line 1459
    invoke-virtual {v2, v5}, Lbb/g;->m(Ljava/lang/reflect/Method;)Z

    .line 1460
    .line 1461
    .line 1462
    move-result v10

    .line 1463
    if-eqz v10, :cond_42

    .line 1464
    .line 1465
    goto :goto_28

    .line 1466
    :cond_42
    move-object v5, v9

    .line 1467
    :goto_28
    if-eqz v5, :cond_43

    .line 1468
    .line 1469
    goto :goto_29

    .line 1470
    :cond_43
    const-string v5, "MicroMsg.ChattingItem"

    .line 1471
    .line 1472
    filled-new-array {v5, v0}, [Ljava/lang/String;

    .line 1473
    .line 1474
    .line 1475
    move-result-object v5

    .line 1476
    invoke-virtual {v2, v5}, Lbb/g;->g([Ljava/lang/String;)Ljava/util/List;

    .line 1477
    .line 1478
    .line 1479
    move-result-object v5

    .line 1480
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 1481
    .line 1482
    .line 1483
    move-result v10

    .line 1484
    if-eqz v10, :cond_44

    .line 1485
    .line 1486
    filled-new-array {v0}, [Ljava/lang/String;

    .line 1487
    .line 1488
    .line 1489
    move-result-object v0

    .line 1490
    invoke-virtual {v2, v0}, Lbb/g;->g([Ljava/lang/String;)Ljava/util/List;

    .line 1491
    .line 1492
    .line 1493
    move-result-object v5

    .line 1494
    :cond_44
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1495
    .line 1496
    .line 1497
    move-result-object v0

    .line 1498
    :cond_45
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1499
    .line 1500
    .line 1501
    move-result v5

    .line 1502
    if-eqz v5, :cond_46

    .line 1503
    .line 1504
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1505
    .line 1506
    .line 1507
    move-result-object v5

    .line 1508
    move-object v10, v5

    .line 1509
    check-cast v10, Ljava/lang/reflect/Method;

    .line 1510
    .line 1511
    invoke-virtual {v2, v10}, Lbb/g;->m(Ljava/lang/reflect/Method;)Z

    .line 1512
    .line 1513
    .line 1514
    move-result v10

    .line 1515
    if-eqz v10, :cond_45

    .line 1516
    .line 1517
    move-object v9, v5

    .line 1518
    :cond_46
    move-object v5, v9

    .line 1519
    check-cast v5, Ljava/lang/reflect/Method;

    .line 1520
    .line 1521
    if-eqz v5, :cond_47

    .line 1522
    .line 1523
    invoke-static {v7, v6, v8, v5}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 1524
    .line 1525
    .line 1526
    goto :goto_29

    .line 1527
    :cond_47
    const-string v0, "cache.key"

    .line 1528
    .line 1529
    :try_start_d
    invoke-interface {v7}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 1530
    .line 1531
    .line 1532
    move-result-object v9

    .line 1533
    const-string v10, ""

    .line 1534
    .line 1535
    invoke-interface {v7, v0, v10}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1536
    .line 1537
    .line 1538
    move-result-object v7

    .line 1539
    invoke-static {v7, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1540
    .line 1541
    .line 1542
    move-result v7

    .line 1543
    if-nez v7, :cond_48

    .line 1544
    .line 1545
    invoke-interface {v9}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 1546
    .line 1547
    .line 1548
    move-result-object v7

    .line 1549
    invoke-interface {v7, v0, v6}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 1550
    .line 1551
    .line 1552
    :cond_48
    invoke-interface {v9, v8}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 1553
    .line 1554
    .line 1555
    move-result-object v0

    .line 1556
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    .line 1557
    .line 1558
    .line 1559
    :catchall_7
    :goto_29
    if-eqz v5, :cond_49

    .line 1560
    .line 1561
    :try_start_e
    sget-object v0, Lr8/i;->b:Lr8/i;

    .line 1562
    .line 1563
    new-instance v6, Lb9/e;

    .line 1564
    .line 1565
    const/4 v7, 0x3

    .line 1566
    invoke-direct {v6, v2, v7}, Lb9/e;-><init>(Ljava/lang/Object;I)V

    .line 1567
    .line 1568
    .line 1569
    invoke-virtual {v0, v5, v6}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 1570
    .line 1571
    .line 1572
    iput-boolean v4, v2, Lbb/g;->l:Z
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    .line 1573
    .line 1574
    :goto_2a
    move v3, v4

    .line 1575
    goto :goto_2b

    .line 1576
    :catchall_8
    move-exception v0

    .line 1577
    iget-object v2, v2, Lbb/g;->e:Lab/b;

    .line 1578
    .line 1579
    const-string v4, "\u5b9e\u540d\u5c3e\u5b57Hook\u5b89\u88c5\u5931\u8d25"

    .line 1580
    .line 1581
    invoke-virtual {v2, v4, v0}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1582
    .line 1583
    .line 1584
    :cond_49
    :goto_2b
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1585
    .line 1586
    .line 1587
    move-result-object v0

    .line 1588
    return-object v0

    .line 1589
    :pswitch_16
    iget-object v0, v1, Lab/a;->h:Ljava/lang/Object;

    .line 1590
    .line 1591
    check-cast v0, Lba/m;

    .line 1592
    .line 1593
    sget-object v2, Lba/m;->w:Ljava/util/ArrayList;

    .line 1594
    .line 1595
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 1596
    .line 1597
    invoke-static {v2}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 1598
    .line 1599
    .line 1600
    move-result v4

    .line 1601
    invoke-static {v4}, Ltf/y;->a0(I)I

    .line 1602
    .line 1603
    .line 1604
    move-result v4

    .line 1605
    const/16 v5, 0x10

    .line 1606
    .line 1607
    if-ge v4, v5, :cond_4a

    .line 1608
    .line 1609
    move v4, v5

    .line 1610
    :cond_4a
    invoke-direct {v3, v4}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 1611
    .line 1612
    .line 1613
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1614
    .line 1615
    .line 1616
    move-result-object v2

    .line 1617
    :goto_2c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1618
    .line 1619
    .line 1620
    move-result v4

    .line 1621
    if-eqz v4, :cond_4b

    .line 1622
    .line 1623
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1624
    .line 1625
    .line 1626
    move-result-object v4

    .line 1627
    move-object v5, v4

    .line 1628
    check-cast v5, Ljava/lang/String;

    .line 1629
    .line 1630
    iget-object v6, v0, Lba/m;->a:Lr8/g;

    .line 1631
    .line 1632
    iget-object v6, v6, Lr8/g;->a:Landroid/content/Context;

    .line 1633
    .line 1634
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1635
    .line 1636
    .line 1637
    move-result-object v6

    .line 1638
    const-string v7, "id"

    .line 1639
    .line 1640
    const-string v8, "com.tencent.mm"

    .line 1641
    .line 1642
    invoke-virtual {v6, v5, v7, v8}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 1643
    .line 1644
    .line 1645
    move-result v5

    .line 1646
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1647
    .line 1648
    .line 1649
    move-result-object v5

    .line 1650
    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1651
    .line 1652
    .line 1653
    goto :goto_2c

    .line 1654
    :cond_4b
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 1655
    .line 1656
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 1657
    .line 1658
    .line 1659
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 1660
    .line 1661
    .line 1662
    move-result-object v2

    .line 1663
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1664
    .line 1665
    .line 1666
    move-result-object v2

    .line 1667
    :cond_4c
    :goto_2d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1668
    .line 1669
    .line 1670
    move-result v3

    .line 1671
    if-eqz v3, :cond_4d

    .line 1672
    .line 1673
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1674
    .line 1675
    .line 1676
    move-result-object v3

    .line 1677
    check-cast v3, Ljava/util/Map$Entry;

    .line 1678
    .line 1679
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1680
    .line 1681
    .line 1682
    move-result-object v4

    .line 1683
    check-cast v4, Ljava/lang/Number;

    .line 1684
    .line 1685
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 1686
    .line 1687
    .line 1688
    move-result v4

    .line 1689
    if-eqz v4, :cond_4c

    .line 1690
    .line 1691
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1692
    .line 1693
    .line 1694
    move-result-object v4

    .line 1695
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1696
    .line 1697
    .line 1698
    move-result-object v3

    .line 1699
    invoke-virtual {v0, v4, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1700
    .line 1701
    .line 1702
    goto :goto_2d

    .line 1703
    :cond_4d
    return-object v0

    .line 1704
    :pswitch_17
    iget-object v0, v1, Lab/a;->h:Ljava/lang/Object;

    .line 1705
    .line 1706
    check-cast v0, Lb9/a;

    .line 1707
    .line 1708
    iget-object v0, v0, Lb9/a;->f:Ljava/lang/Object;

    .line 1709
    .line 1710
    move-object v2, v0

    .line 1711
    check-cast v2, Lba/m;

    .line 1712
    .line 1713
    const/4 v3, 0x0

    .line 1714
    if-eqz v2, :cond_55

    .line 1715
    .line 1716
    const-string v4, "[Hchat:MessageBubble] \u5b89\u88c5\u804a\u5929\u6c14\u6ce1 Hook \u5931\u8d25: "

    .line 1717
    .line 1718
    const-string v0, "[Hchat:MessageBubble] \u672a\u627e\u5230\u804a\u5929\u6c14\u6ce1\u8d44\u6e90: "

    .line 1719
    .line 1720
    monitor-enter v2

    .line 1721
    :try_start_f
    iget-boolean v5, v2, Lba/m;->n:Z
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_9

    .line 1722
    .line 1723
    const/4 v6, 0x1

    .line 1724
    if-eqz v5, :cond_4e

    .line 1725
    .line 1726
    monitor-exit v2

    .line 1727
    move v0, v6

    .line 1728
    goto/16 :goto_33

    .line 1729
    .line 1730
    :cond_4e
    :try_start_10
    iget-object v5, v2, Lba/m;->b:Landroid/content/SharedPreferences;

    .line 1731
    .line 1732
    const-string v7, "message_bubble_enable"

    .line 1733
    .line 1734
    invoke-interface {v5, v7, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 1735
    .line 1736
    .line 1737
    move-result v5

    .line 1738
    if-eqz v5, :cond_51

    .line 1739
    .line 1740
    iget-object v5, v2, Lba/m;->a:Lr8/g;

    .line 1741
    .line 1742
    iget-object v5, v5, Lr8/g;->a:Landroid/content/Context;

    .line 1743
    .line 1744
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1745
    .line 1746
    .line 1747
    move-result-object v5

    .line 1748
    invoke-virtual {v5}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 1749
    .line 1750
    .line 1751
    move-result-object v5

    .line 1752
    iget v5, v5, Landroid/content/res/Configuration;->uiMode:I

    .line 1753
    .line 1754
    and-int/lit8 v5, v5, 0x30

    .line 1755
    .line 1756
    const/16 v7, 0x20

    .line 1757
    .line 1758
    if-ne v5, v7, :cond_4f

    .line 1759
    .line 1760
    move v5, v6

    .line 1761
    goto :goto_2e

    .line 1762
    :cond_4f
    move v5, v3

    .line 1763
    :goto_2e
    if-eqz v5, :cond_50

    .line 1764
    .line 1765
    iget-object v5, v2, Lba/m;->b:Landroid/content/SharedPreferences;

    .line 1766
    .line 1767
    const-string v7, "message_bubble_separate_dark_mode"

    .line 1768
    .line 1769
    invoke-interface {v5, v7, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 1770
    .line 1771
    .line 1772
    move-result v5

    .line 1773
    if-eqz v5, :cond_50

    .line 1774
    .line 1775
    move v5, v6

    .line 1776
    goto :goto_2f

    .line 1777
    :catchall_9
    move-exception v0

    .line 1778
    goto/16 :goto_34

    .line 1779
    .line 1780
    :cond_50
    move v5, v3

    .line 1781
    :goto_2f
    iget-object v7, v2, Lba/m;->a:Lr8/g;

    .line 1782
    .line 1783
    iget-object v7, v7, Lr8/g;->a:Landroid/content/Context;

    .line 1784
    .line 1785
    invoke-static {v7, v5}, Lba/r;->g(Landroid/content/Context;Z)V

    .line 1786
    .line 1787
    .line 1788
    :cond_51
    invoke-virtual {v2}, Lba/m;->g()Ljava/util/Map;

    .line 1789
    .line 1790
    .line 1791
    move-result-object v5

    .line 1792
    invoke-interface {v5}, Ljava/util/Map;->isEmpty()Z

    .line 1793
    .line 1794
    .line 1795
    move-result v5

    .line 1796
    if-eqz v5, :cond_52

    .line 1797
    .line 1798
    sget-object v7, Lba/m;->w:Ljava/util/ArrayList;

    .line 1799
    .line 1800
    const/4 v11, 0x0

    .line 1801
    const/16 v12, 0x3f

    .line 1802
    .line 1803
    const/4 v8, 0x0

    .line 1804
    const/4 v9, 0x0

    .line 1805
    const/4 v10, 0x0

    .line 1806
    invoke-static/range {v7 .. v12}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 1807
    .line 1808
    .line 1809
    move-result-object v4

    .line 1810
    invoke-virtual {v0, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1811
    .line 1812
    .line 1813
    move-result-object v0

    .line 1814
    invoke-static {v0}, Lfb/v0;->m(Ljava/lang/String;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_9

    .line 1815
    .line 1816
    .line 1817
    monitor-exit v2

    .line 1818
    :goto_30
    move v0, v3

    .line 1819
    goto :goto_33

    .line 1820
    :cond_52
    :try_start_11
    invoke-virtual {v2}, Lba/m;->p()Ljava/lang/reflect/Method;

    .line 1821
    .line 1822
    .line 1823
    move-result-object v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_9

    .line 1824
    if-eqz v0, :cond_54

    .line 1825
    .line 1826
    :try_start_12
    sget-object v5, Lr8/i;->b:Lr8/i;

    .line 1827
    .line 1828
    new-instance v7, Lb9/e;

    .line 1829
    .line 1830
    const/4 v8, 0x1

    .line 1831
    invoke-direct {v7, v2, v8}, Lb9/e;-><init>(Ljava/lang/Object;I)V

    .line 1832
    .line 1833
    .line 1834
    invoke-virtual {v5, v0, v7}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 1835
    .line 1836
    .line 1837
    iput-boolean v6, v2, Lba/m;->n:Z

    .line 1838
    .line 1839
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_a

    .line 1840
    .line 1841
    goto :goto_31

    .line 1842
    :catchall_a
    move-exception v0

    .line 1843
    :try_start_13
    new-instance v5, Lsf/f;

    .line 1844
    .line 1845
    invoke-direct {v5, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1846
    .line 1847
    .line 1848
    move-object v0, v5

    .line 1849
    :goto_31
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1850
    .line 1851
    .line 1852
    move-result-object v5

    .line 1853
    if-nez v5, :cond_53

    .line 1854
    .line 1855
    goto :goto_32

    .line 1856
    :cond_53
    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1857
    .line 1858
    .line 1859
    move-result-object v0

    .line 1860
    new-instance v7, Ljava/lang/StringBuilder;

    .line 1861
    .line 1862
    invoke-direct {v7, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1863
    .line 1864
    .line 1865
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1866
    .line 1867
    .line 1868
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1869
    .line 1870
    .line 1871
    move-result-object v0

    .line 1872
    invoke-static {v0, v5}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1873
    .line 1874
    .line 1875
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1876
    .line 1877
    :goto_32
    check-cast v0, Ljava/lang/Boolean;

    .line 1878
    .line 1879
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1880
    .line 1881
    .line 1882
    move-result v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_9

    .line 1883
    monitor-exit v2

    .line 1884
    goto :goto_33

    .line 1885
    :cond_54
    :try_start_14
    const-string v0, "[Hchat:MessageBubble] \u5b9a\u4f4d\u804a\u5929\u6d88\u606f\u7ed1\u5b9a\u65b9\u6cd5\u5931\u8d25"

    .line 1886
    .line 1887
    invoke-static {v0}, Lfb/v0;->m(Ljava/lang/String;)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_9

    .line 1888
    .line 1889
    .line 1890
    monitor-exit v2

    .line 1891
    goto :goto_30

    .line 1892
    :goto_33
    if-ne v0, v6, :cond_55

    .line 1893
    .line 1894
    move v3, v6

    .line 1895
    goto :goto_35

    .line 1896
    :goto_34
    :try_start_15
    monitor-exit v2
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_9

    .line 1897
    throw v0

    .line 1898
    :cond_55
    :goto_35
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1899
    .line 1900
    .line 1901
    move-result-object v0

    .line 1902
    return-object v0

    .line 1903
    :pswitch_18
    iget-object v0, v1, Lab/a;->h:Ljava/lang/Object;

    .line 1904
    .line 1905
    check-cast v0, Lb9/a;

    .line 1906
    .line 1907
    iget-object v0, v0, Lb9/a;->f:Ljava/lang/Object;

    .line 1908
    .line 1909
    move-object v2, v0

    .line 1910
    check-cast v2, Lb9/f;

    .line 1911
    .line 1912
    const/4 v3, 0x0

    .line 1913
    if-eqz v2, :cond_59

    .line 1914
    .line 1915
    const-string v4, "[Hchat:ChatTimeStyle] \u5b89\u88c5\u804a\u5929\u65f6\u95f4\u6837\u5f0f Hook \u5931\u8d25: "

    .line 1916
    .line 1917
    monitor-enter v2

    .line 1918
    :try_start_16
    iget-boolean v0, v2, Lb9/f;->d:Z
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_c

    .line 1919
    .line 1920
    const/4 v5, 0x1

    .line 1921
    if-eqz v0, :cond_56

    .line 1922
    .line 1923
    monitor-exit v2

    .line 1924
    move v0, v5

    .line 1925
    goto :goto_38

    .line 1926
    :cond_56
    :try_start_17
    invoke-virtual {v2}, Lb9/f;->h()Ljava/lang/reflect/Method;

    .line 1927
    .line 1928
    .line 1929
    move-result-object v0
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_c

    .line 1930
    if-eqz v0, :cond_58

    .line 1931
    .line 1932
    :try_start_18
    sget-object v6, Lr8/i;->b:Lr8/i;

    .line 1933
    .line 1934
    new-instance v7, Lb9/e;

    .line 1935
    .line 1936
    const/4 v8, 0x0

    .line 1937
    invoke-direct {v7, v2, v8}, Lb9/e;-><init>(Ljava/lang/Object;I)V

    .line 1938
    .line 1939
    .line 1940
    invoke-virtual {v6, v0, v7}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 1941
    .line 1942
    .line 1943
    iput-boolean v5, v2, Lb9/f;->d:Z

    .line 1944
    .line 1945
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_b

    .line 1946
    .line 1947
    goto :goto_36

    .line 1948
    :catchall_b
    move-exception v0

    .line 1949
    :try_start_19
    new-instance v6, Lsf/f;

    .line 1950
    .line 1951
    invoke-direct {v6, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1952
    .line 1953
    .line 1954
    move-object v0, v6

    .line 1955
    :goto_36
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1956
    .line 1957
    .line 1958
    move-result-object v6

    .line 1959
    if-nez v6, :cond_57

    .line 1960
    .line 1961
    goto :goto_37

    .line 1962
    :cond_57
    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1963
    .line 1964
    .line 1965
    move-result-object v0

    .line 1966
    new-instance v7, Ljava/lang/StringBuilder;

    .line 1967
    .line 1968
    invoke-direct {v7, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1969
    .line 1970
    .line 1971
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1972
    .line 1973
    .line 1974
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1975
    .line 1976
    .line 1977
    move-result-object v0

    .line 1978
    invoke-static {v0, v6}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1979
    .line 1980
    .line 1981
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1982
    .line 1983
    :goto_37
    check-cast v0, Ljava/lang/Boolean;

    .line 1984
    .line 1985
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1986
    .line 1987
    .line 1988
    move-result v0
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_c

    .line 1989
    monitor-exit v2

    .line 1990
    goto :goto_38

    .line 1991
    :catchall_c
    move-exception v0

    .line 1992
    goto :goto_39

    .line 1993
    :cond_58
    :try_start_1a
    const-string v0, "[Hchat:ChatTimeStyle] \u5b9a\u4f4d\u804a\u5929\u65f6\u95f4\u7ed1\u5b9a\u65b9\u6cd5\u5931\u8d25"

    .line 1994
    .line 1995
    invoke-static {v0}, Lfb/v0;->m(Ljava/lang/String;)V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_c

    .line 1996
    .line 1997
    .line 1998
    monitor-exit v2

    .line 1999
    move v0, v3

    .line 2000
    :goto_38
    if-ne v0, v5, :cond_59

    .line 2001
    .line 2002
    move v3, v5

    .line 2003
    goto :goto_3a

    .line 2004
    :goto_39
    :try_start_1b
    monitor-exit v2
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_c

    .line 2005
    throw v0

    .line 2006
    :cond_59
    :goto_3a
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2007
    .line 2008
    .line 2009
    move-result-object v0

    .line 2010
    return-object v0

    .line 2011
    :pswitch_19
    iget-object v0, v1, Lab/a;->h:Ljava/lang/Object;

    .line 2012
    .line 2013
    check-cast v0, Landroid/app/RemoteAction;

    .line 2014
    .line 2015
    invoke-virtual {v0}, Landroid/app/RemoteAction;->getActionIntent()Landroid/app/PendingIntent;

    .line 2016
    .line 2017
    .line 2018
    move-result-object v2

    .line 2019
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2020
    .line 2021
    const/16 v3, 0x22

    .line 2022
    .line 2023
    if-lt v0, v3, :cond_5a

    .line 2024
    .line 2025
    :try_start_1c
    invoke-static {}, Landroid/app/ActivityOptions;->makeBasic()Landroid/app/ActivityOptions;

    .line 2026
    .line 2027
    .line 2028
    move-result-object v0

    .line 2029
    invoke-static {v0}, Lb0/a0;->a(Landroid/app/ActivityOptions;)Landroid/app/ActivityOptions;

    .line 2030
    .line 2031
    .line 2032
    move-result-object v0

    .line 2033
    invoke-virtual {v0}, Landroid/app/ActivityOptions;->toBundle()Landroid/os/Bundle;

    .line 2034
    .line 2035
    .line 2036
    move-result-object v0

    .line 2037
    invoke-static {v2, v0}, Lb0/a0;->m(Landroid/app/PendingIntent;Landroid/os/Bundle;)V
    :try_end_1c
    .catch Landroid/app/PendingIntent$CanceledException; {:try_start_1c .. :try_end_1c} :catch_0

    .line 2038
    .line 2039
    .line 2040
    goto :goto_3b

    .line 2041
    :catch_0
    move-exception v0

    .line 2042
    const-string v3, "TextClassification"

    .line 2043
    .line 2044
    new-instance v4, Ljava/lang/StringBuilder;

    .line 2045
    .line 2046
    const-string v5, "error sending pendingIntent: "

    .line 2047
    .line 2048
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2049
    .line 2050
    .line 2051
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2052
    .line 2053
    .line 2054
    const-string v2, " error: "

    .line 2055
    .line 2056
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2057
    .line 2058
    .line 2059
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2060
    .line 2061
    .line 2062
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2063
    .line 2064
    .line 2065
    move-result-object v0

    .line 2066
    invoke-static {v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 2067
    .line 2068
    .line 2069
    goto :goto_3b

    .line 2070
    :cond_5a
    invoke-virtual {v2}, Landroid/app/PendingIntent;->send()V

    .line 2071
    .line 2072
    .line 2073
    :goto_3b
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 2074
    .line 2075
    return-object v0

    .line 2076
    :pswitch_1a
    iget-object v0, v1, Lab/a;->h:Ljava/lang/Object;

    .line 2077
    .line 2078
    check-cast v0, Lz/g;

    .line 2079
    .line 2080
    invoke-interface {v0}, Lz/g;->close()V

    .line 2081
    .line 2082
    .line 2083
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 2084
    .line 2085
    return-object v0

    .line 2086
    :pswitch_1b
    iget-object v0, v1, Lab/a;->h:Ljava/lang/Object;

    .line 2087
    .line 2088
    check-cast v0, Ld0/d;

    .line 2089
    .line 2090
    invoke-interface {v0}, Ld0/d;->j0()Lz/c;

    .line 2091
    .line 2092
    .line 2093
    move-result-object v0

    .line 2094
    return-object v0

    .line 2095
    :pswitch_1c
    iget-object v0, v1, Lab/a;->h:Ljava/lang/Object;

    .line 2096
    .line 2097
    check-cast v0, Lab/c;

    .line 2098
    .line 2099
    iget-object v2, v0, Lab/c;->e:Lab/f;

    .line 2100
    .line 2101
    const/4 v0, 0x0

    .line 2102
    if-eqz v2, :cond_5e

    .line 2103
    .line 2104
    monitor-enter v2

    .line 2105
    :try_start_1d
    iget-boolean v3, v2, Lab/f;->f:Z
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_e

    .line 2106
    .line 2107
    const/4 v4, 0x1

    .line 2108
    if-eqz v3, :cond_5b

    .line 2109
    .line 2110
    monitor-exit v2

    .line 2111
    move v3, v4

    .line 2112
    goto :goto_3d

    .line 2113
    :cond_5b
    :try_start_1e
    invoke-virtual {v2}, Lab/f;->d()Z

    .line 2114
    .line 2115
    .line 2116
    move-result v3

    .line 2117
    invoke-virtual {v2}, Lab/f;->e()Z

    .line 2118
    .line 2119
    .line 2120
    move-result v5

    .line 2121
    invoke-virtual {v2}, Lab/f;->f()Z

    .line 2122
    .line 2123
    .line 2124
    move-result v6
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_e

    .line 2125
    :try_start_1f
    invoke-virtual {v2}, Lab/f;->j()Ljava/lang/reflect/Method;
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_d

    .line 2126
    .line 2127
    .line 2128
    :catchall_d
    if-eqz v3, :cond_5d

    .line 2129
    .line 2130
    if-nez v5, :cond_5c

    .line 2131
    .line 2132
    if-eqz v6, :cond_5d

    .line 2133
    .line 2134
    :cond_5c
    move v3, v4

    .line 2135
    goto :goto_3c

    .line 2136
    :cond_5d
    move v3, v0

    .line 2137
    :goto_3c
    :try_start_20
    iput-boolean v3, v2, Lab/f;->f:Z

    .line 2138
    .line 2139
    iget-boolean v3, v2, Lab/f;->f:Z
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_e

    .line 2140
    .line 2141
    monitor-exit v2

    .line 2142
    :goto_3d
    if-ne v3, v4, :cond_5e

    .line 2143
    .line 2144
    move v0, v4

    .line 2145
    goto :goto_3e

    .line 2146
    :catchall_e
    move-exception v0

    .line 2147
    :try_start_21
    monitor-exit v2
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_e

    .line 2148
    throw v0

    .line 2149
    :cond_5e
    :goto_3e
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2150
    .line 2151
    .line 2152
    move-result-object v0

    .line 2153
    return-object v0

    .line 2154
    nop

    .line 2155
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
