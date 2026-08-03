.class public final synthetic Li/e0;
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
    iput p2, p0, Li/e0;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Li/e0;->h:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final e()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Li/e0;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb9/a;

    .line 4
    .line 5
    iget-object v0, v0, Lb9/a;->f:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lqa/f;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_6

    .line 11
    .line 12
    monitor-enter v0

    .line 13
    :try_start_0
    iget-boolean v2, v0, Lqa/f;->h:Z

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Lqa/f;->o()V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v1

    .line 22
    goto :goto_3

    .line 23
    :cond_0
    :goto_0
    iget-boolean v2, v0, Lqa/f;->i:Z

    .line 24
    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    invoke-virtual {v0}, Lqa/f;->p()V

    .line 28
    .line 29
    .line 30
    :cond_1
    iget-boolean v2, v0, Lqa/f;->j:Z

    .line 31
    .line 32
    if-nez v2, :cond_2

    .line 33
    .line 34
    invoke-virtual {v0}, Lqa/f;->n()V

    .line 35
    .line 36
    .line 37
    :cond_2
    iget-boolean v2, v0, Lqa/f;->k:Z

    .line 38
    .line 39
    if-nez v2, :cond_3

    .line 40
    .line 41
    invoke-virtual {v0}, Lqa/f;->m()V

    .line 42
    .line 43
    .line 44
    :cond_3
    iget-boolean v2, v0, Lqa/f;->h:Z

    .line 45
    .line 46
    const/4 v3, 0x1

    .line 47
    if-nez v2, :cond_5

    .line 48
    .line 49
    iget-boolean v2, v0, Lqa/f;->i:Z

    .line 50
    .line 51
    if-nez v2, :cond_5

    .line 52
    .line 53
    iget-boolean v2, v0, Lqa/f;->j:Z

    .line 54
    .line 55
    if-nez v2, :cond_5

    .line 56
    .line 57
    iget-boolean v2, v0, Lqa/f;->k:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    if-eqz v2, :cond_4

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_4
    move v2, v1

    .line 63
    goto :goto_2

    .line 64
    :cond_5
    :goto_1
    move v2, v3

    .line 65
    :goto_2
    monitor-exit v0

    .line 66
    if-ne v2, v3, :cond_6

    .line 67
    .line 68
    move v1, v3

    .line 69
    goto :goto_4

    .line 70
    :goto_3
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    throw v1

    .line 72
    :cond_6
    :goto_4
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    return-object v0
.end method

.method private final f()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Li/e0;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lrb/b;

    .line 4
    .line 5
    iget-object v0, v0, Lrb/b;->e:Lrb/c;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_6

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    iget-boolean v2, v0, Lrb/c;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

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
    goto/16 :goto_7

    .line 19
    .line 20
    :cond_0
    :try_start_1
    invoke-virtual {v0}, Lrb/c;->h()Ljava/lang/reflect/Constructor;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-eqz v2, :cond_4

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Lrb/c;->f(Ljava/lang/reflect/Constructor;)Ljava/lang/reflect/Method;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    if-eqz v4, :cond_3

    .line 31
    .line 32
    invoke-virtual {v0}, Lrb/c;->g()Ljava/lang/reflect/Method;

    .line 33
    .line 34
    .line 35
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->network()Lm8/a;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    if-eqz v5, :cond_1

    .line 40
    .line 41
    iget-object v6, v0, Lrb/c;->a:Lr8/g;

    .line 42
    .line 43
    iget-object v6, v6, Lr8/g;->e:Lh/Hchat/dexkit/DexFinder;

    .line 44
    .line 45
    invoke-virtual {v5, v6}, Lm8/a;->a(Lh/Hchat/dexkit/DexFinder;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception v2

    .line 50
    goto :goto_4

    .line 51
    :cond_1
    :goto_0
    sget-object v5, Lr8/i;->b:Lr8/i;

    .line 52
    .line 53
    new-instance v6, Lb9/e;

    .line 54
    .line 55
    const/16 v7, 0x19

    .line 56
    .line 57
    invoke-direct {v6, v0, v7}, Lb9/e;-><init>(Ljava/lang/Object;I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v5, v4, v6}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 61
    .line 62
    .line 63
    iput-object v2, v0, Lrb/c;->e:Ljava/lang/reflect/Constructor;

    .line 64
    .line 65
    iput-boolean v3, v0, Lrb/c;->h:Z

    .line 66
    .line 67
    iget-object v2, v0, Lrb/c;->b:Lrb/k;

    .line 68
    .line 69
    iget-object v4, v2, Lrb/k;->d:Ljava/lang/Object;

    .line 70
    .line 71
    monitor-enter v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    :try_start_2
    iput-boolean v3, v2, Lrb/k;->l:Z

    .line 73
    .line 74
    iget-boolean v5, v2, Lrb/k;->m:Z

    .line 75
    .line 76
    if-nez v5, :cond_2

    .line 77
    .line 78
    iget-object v5, v2, Lrb/k;->g:Ljava/util/ArrayDeque;

    .line 79
    .line 80
    invoke-virtual {v5}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    if-eqz v5, :cond_2

    .line 85
    .line 86
    iget-object v5, v2, Lrb/k;->h:Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    if-eqz v5, :cond_2

    .line 93
    .line 94
    const-string v5, "\u7b49\u5f85\u68c0\u6d4b"

    .line 95
    .line 96
    iput-object v5, v2, Lrb/k;->n:Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :catchall_1
    move-exception v2

    .line 100
    goto :goto_2

    .line 101
    :cond_2
    :goto_1
    :try_start_3
    monitor-exit v4

    .line 102
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 103
    .line 104
    goto :goto_5

    .line 105
    :goto_2
    monitor-exit v4

    .line 106
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 107
    :cond_3
    monitor-exit v0

    .line 108
    :goto_3
    move v2, v1

    .line 109
    goto :goto_7

    .line 110
    :cond_4
    monitor-exit v0

    .line 111
    goto :goto_3

    .line 112
    :goto_4
    :try_start_4
    new-instance v4, Lsf/f;

    .line 113
    .line 114
    invoke-direct {v4, v2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 115
    .line 116
    .line 117
    move-object v2, v4

    .line 118
    :goto_5
    invoke-static {v2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    if-nez v4, :cond_5

    .line 123
    .line 124
    goto :goto_6

    .line 125
    :cond_5
    iget-object v2, v0, Lrb/c;->c:Lia/t;

    .line 126
    .line 127
    const-string v5, "\u50f5\u5c38\u7c89\u68c0\u6d4b Hook \u5b89\u88c5\u5931\u8d25"

    .line 128
    .line 129
    invoke-virtual {v2, v5, v4}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 133
    .line 134
    :goto_6
    check-cast v2, Ljava/lang/Boolean;

    .line 135
    .line 136
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 137
    .line 138
    .line 139
    move-result v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 140
    monitor-exit v0

    .line 141
    :goto_7
    if-ne v2, v3, :cond_6

    .line 142
    .line 143
    move v1, v3

    .line 144
    goto :goto_8

    .line 145
    :catchall_2
    move-exception v1

    .line 146
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 147
    throw v1

    .line 148
    :cond_6
    :goto_8
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    return-object v0
.end method

.method private final g()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Li/e0;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb9/a;

    .line 4
    .line 5
    iget-object v0, v0, Lb9/a;->f:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ls9/b;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    const-string v2, "[Hchat:HideChatAvatar] \u5b89\u88c5\u804a\u5929\u5934\u50cf\u7ed1\u5b9a Hook \u5931\u8d25: "

    .line 13
    .line 14
    monitor-enter v0

    .line 15
    :try_start_0
    iget-boolean v3, v0, Ls9/b;->g:Z
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
    invoke-virtual {v0}, Ls9/b;->c()Ljava/lang/reflect/Method;

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
    const/16 v7, 0x1a

    .line 34
    .line 35
    invoke-direct {v6, v0, v7}, Lb9/e;-><init>(Ljava/lang/Object;I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v5, v3, v6}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 39
    .line 40
    .line 41
    iput-boolean v4, v0, Ls9/b;->g:Z

    .line 42
    .line 43
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception v3

    .line 47
    :try_start_3
    new-instance v5, Lsf/f;

    .line 48
    .line 49
    invoke-direct {v5, v3}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    move-object v3, v5

    .line 53
    :goto_0
    invoke-static {v3}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    if-nez v5, :cond_1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    new-instance v6, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {v6, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-static {v2, v5}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 77
    .line 78
    .line 79
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 80
    .line 81
    :goto_1
    check-cast v3, Ljava/lang/Boolean;

    .line 82
    .line 83
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 84
    .line 85
    .line 86
    move-result v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 87
    monitor-exit v0

    .line 88
    goto :goto_2

    .line 89
    :catchall_1
    move-exception v1

    .line 90
    goto :goto_3

    .line 91
    :cond_2
    :try_start_4
    const-string v2, "[Hchat:HideChatAvatar] \u5b9a\u4f4d\u804a\u5929\u5934\u50cf\u7ed1\u5b9a\u65b9\u6cd5\u5931\u8d25"

    .line 92
    .line 93
    invoke-static {v2}, Lfb/v0;->m(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 94
    .line 95
    .line 96
    monitor-exit v0

    .line 97
    move v2, v1

    .line 98
    :goto_2
    if-ne v2, v4, :cond_3

    .line 99
    .line 100
    move v1, v4

    .line 101
    goto :goto_4

    .line 102
    :goto_3
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 103
    throw v1

    .line 104
    :cond_3
    :goto_4
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    return-object v0
.end method

.method private final h()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Li/e0;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lsh/w1;

    .line 4
    .line 5
    iget-object v0, v0, Lsh/w1;->a:Lsh/x;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Lsh/x;->a:Lsh/e2;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, v0, Lsh/e2;->c:Li0/f1;

    .line 14
    .line 15
    invoke-virtual {v0}, Li0/f1;->g()F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-static {v0}, Lig/a;->X(F)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    :goto_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    return-object v0
.end method

.method private final i()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Li/e0;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb9/a;

    .line 4
    .line 5
    iget-object v0, v0, Lb9/a;->f:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lb5/c;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_5

    .line 11
    .line 12
    monitor-enter v0

    .line 13
    :try_start_0
    iget-object v2, v0, Lb5/c;->a:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, Lr8/g;

    .line 16
    .line 17
    new-instance v3, Li2/y;

    .line 18
    .line 19
    const/16 v4, 0x17

    .line 20
    .line 21
    invoke-direct {v3, v4}, Li2/y;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-static {v2, v3}, Lf8/i;->k0(Lr8/g;Lfg/p;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    move v3, v1

    .line 33
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_2

    .line 38
    .line 39
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    check-cast v4, Ljava/lang/reflect/Method;

    .line 44
    .line 45
    iget-object v5, v0, Lb5/c;->c:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v5, Ljava/util/Set;

    .line 48
    .line 49
    invoke-interface {v5, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-eqz v5, :cond_1

    .line 54
    .line 55
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    iget-object v5, v0, Lb5/c;->c:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v5, Ljava/util/Set;

    .line 61
    .line 62
    invoke-interface {v5, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-eqz v5, :cond_0

    .line 67
    .line 68
    invoke-virtual {v0, v4}, Lb5/c;->x(Ljava/lang/reflect/Method;)Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-eqz v4, :cond_0

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :catchall_0
    move-exception v1

    .line 76
    goto :goto_3

    .line 77
    :cond_2
    if-nez v3, :cond_3

    .line 78
    .line 79
    const-string v2, "[Hchat:HideChatMenu] \u5b9a\u4f4d\u6216\u5b89\u88c5\u804a\u5929\u957f\u6309\u83dc\u5355 Hook \u5931\u8d25"

    .line 80
    .line 81
    invoke-static {v2}, Lfb/v0;->m(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    .line 83
    .line 84
    :cond_3
    const/4 v2, 0x1

    .line 85
    if-lez v3, :cond_4

    .line 86
    .line 87
    move v3, v2

    .line 88
    goto :goto_2

    .line 89
    :cond_4
    move v3, v1

    .line 90
    :goto_2
    monitor-exit v0

    .line 91
    if-ne v3, v2, :cond_5

    .line 92
    .line 93
    move v1, v2

    .line 94
    goto :goto_4

    .line 95
    :goto_3
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 96
    throw v1

    .line 97
    :cond_5
    :goto_4
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    return-object v0
.end method

.method private final j()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Li/e0;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lu/d;

    .line 4
    .line 5
    iget-object v1, v0, Lu/d;->U:Lfg/l;

    .line 6
    .line 7
    iget-boolean v0, v0, Lu/d;->T:Z

    .line 8
    .line 9
    xor-int/lit8 v0, v0, 0x1

    .line 10
    .line 11
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 19
    .line 20
    return-object v0
.end method

.method private final k()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Li/e0;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lu3/c;

    .line 4
    .line 5
    invoke-interface {v0}, Landroidx/lifecycle/q;->f()Landroidx/lifecycle/s;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Lu3/a;

    .line 10
    .line 11
    invoke-direct {v2, v0}, Lu3/a;-><init>(Lu3/c;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2}, Landroidx/lifecycle/s;->a(Landroidx/lifecycle/p;)V

    .line 15
    .line 16
    .line 17
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 18
    .line 19
    return-object v0
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Li/e0;->g:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, Li/e0;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lu9/c;

    .line 11
    .line 12
    iget-object v0, v0, Lu9/c;->e:Lu9/h;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-virtual {v0, v2}, Lu9/h;->f(Z)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-ne v0, v2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v2, 0x0

    .line 25
    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0

    .line 30
    :pswitch_0
    invoke-direct {v1}, Li/e0;->k()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    return-object v0

    .line 35
    :pswitch_1
    invoke-direct {v1}, Li/e0;->j()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    return-object v0

    .line 40
    :pswitch_2
    iget-object v0, v1, Li/e0;->h:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Lth/i;

    .line 43
    .line 44
    invoke-virtual {v0}, Lth/i;->q1()V

    .line 45
    .line 46
    .line 47
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 48
    .line 49
    return-object v0

    .line 50
    :pswitch_3
    iget-object v0, v1, Li/e0;->h:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Ljava/util/List;

    .line 53
    .line 54
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    return-object v0

    .line 59
    :pswitch_4
    invoke-direct {v1}, Li/e0;->i()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    return-object v0

    .line 64
    :pswitch_5
    iget-object v0, v1, Li/e0;->h:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, Le1/c;

    .line 67
    .line 68
    return-object v0

    .line 69
    :pswitch_6
    invoke-direct {v1}, Li/e0;->h()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    return-object v0

    .line 74
    :pswitch_7
    iget-object v0, v1, Li/e0;->h:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, Li0/g1;

    .line 77
    .line 78
    invoke-virtual {v0}, Li0/g1;->g()I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    int-to-float v0, v0

    .line 83
    const/4 v2, 0x0

    .line 84
    cmpg-float v3, v0, v2

    .line 85
    .line 86
    if-gez v3, :cond_1

    .line 87
    .line 88
    move v0, v2

    .line 89
    :cond_1
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    return-object v0

    .line 94
    :pswitch_8
    invoke-direct {v1}, Li/e0;->g()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    return-object v0

    .line 99
    :pswitch_9
    iget-object v0, v1, Li/e0;->h:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v0, Ls3/e;

    .line 102
    .line 103
    sget-object v2, Lr3/c;->a:Lr3/c;

    .line 104
    .line 105
    sget-object v3, Ltf/t;->g:Ltf/t;

    .line 106
    .line 107
    iget-object v4, v0, Ls3/e;->c:Li0/j1;

    .line 108
    .line 109
    invoke-virtual {v4, v2}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    iget-object v2, v0, Ls3/e;->b:Li0/j1;

    .line 113
    .line 114
    invoke-virtual {v2, v3}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    iget-object v0, v0, Ls3/e;->d:Li0/j1;

    .line 118
    .line 119
    invoke-virtual {v0, v3}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 123
    .line 124
    return-object v0

    .line 125
    :pswitch_a
    iget-object v0, v1, Li/e0;->h:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v0, Ls2/b;

    .line 128
    .line 129
    iget-object v2, v0, Ls2/b;->i:Li0/j1;

    .line 130
    .line 131
    invoke-virtual {v2}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    check-cast v3, Le1/e;

    .line 136
    .line 137
    iget-wide v3, v3, Le1/e;->a:J

    .line 138
    .line 139
    const-wide v5, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    cmp-long v3, v3, v5

    .line 145
    .line 146
    if-nez v3, :cond_2

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_2
    invoke-virtual {v2}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    check-cast v3, Le1/e;

    .line 154
    .line 155
    iget-wide v3, v3, Le1/e;->a:J

    .line 156
    .line 157
    invoke-static {v3, v4}, Le1/e;->c(J)Z

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    if-eqz v3, :cond_3

    .line 162
    .line 163
    :goto_1
    const/4 v0, 0x0

    .line 164
    goto :goto_2

    .line 165
    :cond_3
    iget-object v0, v0, Ls2/b;->g:Lf1/p0;

    .line 166
    .line 167
    invoke-virtual {v2}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    check-cast v2, Le1/e;

    .line 172
    .line 173
    iget-wide v2, v2, Le1/e;->a:J

    .line 174
    .line 175
    invoke-virtual {v0, v2, v3}, Lf1/p0;->b(J)Landroid/graphics/Shader;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    :goto_2
    return-object v0

    .line 180
    :pswitch_b
    iget-object v0, v1, Li/e0;->h:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v0, Ls/z;

    .line 183
    .line 184
    iget-object v0, v0, Ls/z;->j:Ls/w;

    .line 185
    .line 186
    if-eqz v0, :cond_4

    .line 187
    .line 188
    invoke-static {v0}, Lx1/k;->l(Lx1/m;)V

    .line 189
    .line 190
    .line 191
    :cond_4
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 192
    .line 193
    return-object v0

    .line 194
    :pswitch_c
    invoke-direct {v1}, Li/e0;->f()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    return-object v0

    .line 199
    :pswitch_d
    iget-object v0, v1, Li/e0;->h:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v0, Lr9/a;

    .line 202
    .line 203
    iget-object v2, v0, Lr9/a;->e:Lr9/d0;

    .line 204
    .line 205
    const/4 v3, 0x0

    .line 206
    if-eqz v2, :cond_9

    .line 207
    .line 208
    :try_start_0
    invoke-virtual {v2}, Lr9/d0;->I()Z

    .line 209
    .line 210
    .line 211
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 212
    :try_start_1
    invoke-virtual {v2}, Lr9/d0;->H()Z

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    if-eqz v0, :cond_5

    .line 217
    .line 218
    add-int/lit8 v4, v4, 0x1

    .line 219
    .line 220
    :cond_5
    invoke-virtual {v2}, Lr9/d0;->F()Z

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    if-eqz v0, :cond_6

    .line 225
    .line 226
    add-int/lit8 v4, v4, 0x1

    .line 227
    .line 228
    :cond_6
    invoke-virtual {v2}, Lr9/d0;->G()Z

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    if-eqz v0, :cond_7

    .line 233
    .line 234
    add-int/lit8 v4, v4, 0x1

    .line 235
    .line 236
    :cond_7
    sget-object v0, Lsf/n;->a:Lsf/n;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 237
    .line 238
    goto :goto_4

    .line 239
    :catchall_0
    move-exception v0

    .line 240
    goto :goto_3

    .line 241
    :catchall_1
    move-exception v0

    .line 242
    move v4, v3

    .line 243
    :goto_3
    new-instance v5, Lsf/f;

    .line 244
    .line 245
    invoke-direct {v5, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 246
    .line 247
    .line 248
    move-object v0, v5

    .line 249
    :goto_4
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    if-eqz v0, :cond_8

    .line 254
    .line 255
    iget-object v2, v2, Lr9/d0;->b:Lia/t;

    .line 256
    .line 257
    const-string v5, "Hchat\u6269\u5c55\u529f\u80fd\u5b89\u88c5\u5f02\u5e38"

    .line 258
    .line 259
    invoke-virtual {v2, v5, v0}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    :cond_8
    if-lez v4, :cond_9

    .line 263
    .line 264
    const/4 v3, 0x1

    .line 265
    :cond_9
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    return-object v0

    .line 270
    :pswitch_e
    iget-object v0, v1, Li/e0;->h:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast v0, Ljava/util/concurrent/Callable;

    .line 273
    .line 274
    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 279
    .line 280
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result v0

    .line 284
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    return-object v0

    .line 289
    :pswitch_f
    iget-object v0, v1, Li/e0;->h:Ljava/lang/Object;

    .line 290
    .line 291
    check-cast v0, Lqb/a;

    .line 292
    .line 293
    iget-object v2, v0, Lqb/a;->e:Lqb/k;

    .line 294
    .line 295
    if-eqz v2, :cond_2c

    .line 296
    .line 297
    const-class v4, Landroid/view/View;

    .line 298
    .line 299
    iget-object v5, v2, Lqb/k;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 300
    .line 301
    iget-object v6, v2, Lqb/k;->b:Lia/t;

    .line 302
    .line 303
    sget-object v7, Le8/b;->a:Le8/b;

    .line 304
    .line 305
    iget-object v8, v2, Lqb/k;->e:Landroid/content/SharedPreferences;

    .line 306
    .line 307
    invoke-virtual {v2}, Lqb/k;->z()Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    iget-object v9, v2, Lqb/k;->a:Lr8/g;

    .line 312
    .line 313
    iget-object v10, v9, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 314
    .line 315
    const-string v11, "voice_menu_click"

    .line 316
    .line 317
    invoke-static {v8, v0, v10, v11}, Le8/b;->f(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/util/List;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    new-instance v12, Ljava/util/ArrayList;

    .line 322
    .line 323
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 324
    .line 325
    .line 326
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    :cond_a
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 331
    .line 332
    .line 333
    move-result v13

    .line 334
    if-eqz v13, :cond_b

    .line 335
    .line 336
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v13

    .line 340
    move-object v14, v13

    .line 341
    check-cast v14, Ljava/lang/reflect/Method;

    .line 342
    .line 343
    invoke-static {v14}, Lqb/k;->t(Ljava/lang/reflect/Method;)Z

    .line 344
    .line 345
    .line 346
    move-result v14

    .line 347
    if-eqz v14, :cond_a

    .line 348
    .line 349
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    goto :goto_5

    .line 353
    :cond_b
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 354
    .line 355
    .line 356
    move-result v0

    .line 357
    if-nez v0, :cond_c

    .line 358
    .line 359
    const/16 v16, 0x0

    .line 360
    .line 361
    goto/16 :goto_c

    .line 362
    .line 363
    :cond_c
    :try_start_2
    iget-object v0, v9, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 364
    .line 365
    new-instance v12, Lch/e;

    .line 366
    .line 367
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 368
    .line 369
    .line 370
    new-instance v14, Lfh/k;

    .line 371
    .line 372
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 373
    .line 374
    .line 375
    const-string v15, "ChattingItemVoice"
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 376
    .line 377
    const/16 v16, 0x0

    .line 378
    .line 379
    :try_start_3
    const-string v3, "Retr_Msg_content"

    .line 380
    .line 381
    const-string v13, "Retr_Msg_Type"

    .line 382
    .line 383
    filled-new-array {v15, v3, v13}, [Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v3

    .line 387
    invoke-static {v3}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 388
    .line 389
    .line 390
    move-result-object v3

    .line 391
    invoke-static {v14, v3}, Lfh/k;->u0(Lfh/k;Ljava/util/Collection;)V

    .line 392
    .line 393
    .line 394
    iput-object v14, v12, Lch/e;->h:Lfh/k;

    .line 395
    .line 396
    invoke-virtual {v0, v12}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    new-instance v3, Ljava/util/ArrayList;

    .line 401
    .line 402
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 403
    .line 404
    .line 405
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 406
    .line 407
    .line 408
    move-result-object v12

    .line 409
    :cond_d
    :goto_6
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 410
    .line 411
    .line 412
    move-result v0

    .line 413
    if-eqz v0, :cond_f

    .line 414
    .line 415
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    check-cast v0, Lhh/o;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 420
    .line 421
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 422
    .line 423
    .line 424
    invoke-virtual {v0}, Lhh/o;->p()Llh/d;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    invoke-virtual {v0, v10}, Llh/d;->b(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 429
    .line 430
    .line 431
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 432
    goto :goto_7

    .line 433
    :catchall_2
    move-exception v0

    .line 434
    :try_start_5
    new-instance v13, Lsf/f;

    .line 435
    .line 436
    invoke-direct {v13, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 437
    .line 438
    .line 439
    move-object v0, v13

    .line 440
    :goto_7
    nop

    .line 441
    instance-of v13, v0, Lsf/f;

    .line 442
    .line 443
    if-eqz v13, :cond_e

    .line 444
    .line 445
    const/4 v0, 0x0

    .line 446
    :cond_e
    check-cast v0, Ljava/lang/reflect/Method;

    .line 447
    .line 448
    if-eqz v0, :cond_d

    .line 449
    .line 450
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 451
    .line 452
    .line 453
    goto :goto_6

    .line 454
    :catchall_3
    move-exception v0

    .line 455
    goto :goto_a

    .line 456
    :cond_f
    new-instance v0, Ljava/util/ArrayList;

    .line 457
    .line 458
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 462
    .line 463
    .line 464
    move-result-object v3

    .line 465
    :cond_10
    :goto_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 466
    .line 467
    .line 468
    move-result v12

    .line 469
    if-eqz v12, :cond_11

    .line 470
    .line 471
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v12

    .line 475
    move-object v13, v12

    .line 476
    check-cast v13, Ljava/lang/reflect/Method;

    .line 477
    .line 478
    invoke-static {v13}, Lqb/k;->t(Ljava/lang/reflect/Method;)Z

    .line 479
    .line 480
    .line 481
    move-result v13

    .line 482
    if-eqz v13, :cond_10

    .line 483
    .line 484
    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 485
    .line 486
    .line 487
    goto :goto_8

    .line 488
    :cond_11
    new-instance v3, Ljava/util/HashSet;

    .line 489
    .line 490
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 491
    .line 492
    .line 493
    new-instance v12, Ljava/util/ArrayList;

    .line 494
    .line 495
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 496
    .line 497
    .line 498
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    :cond_12
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 503
    .line 504
    .line 505
    move-result v13

    .line 506
    if-eqz v13, :cond_13

    .line 507
    .line 508
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v13

    .line 512
    move-object v14, v13

    .line 513
    check-cast v14, Ljava/lang/reflect/Method;

    .line 514
    .line 515
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 516
    .line 517
    .line 518
    move-result-object v14

    .line 519
    invoke-virtual {v3, v14}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 520
    .line 521
    .line 522
    move-result v14

    .line 523
    if-eqz v14, :cond_12

    .line 524
    .line 525
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 526
    .line 527
    .line 528
    goto :goto_9

    .line 529
    :catchall_4
    move-exception v0

    .line 530
    const/16 v16, 0x0

    .line 531
    .line 532
    :goto_a
    new-instance v12, Lsf/f;

    .line 533
    .line 534
    invoke-direct {v12, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 535
    .line 536
    .line 537
    :cond_13
    invoke-static {v12}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 538
    .line 539
    .line 540
    move-result-object v0

    .line 541
    if-nez v0, :cond_14

    .line 542
    .line 543
    goto :goto_b

    .line 544
    :cond_14
    const-string v3, "\u8f6c\u53d1\u8bed\u97f3DexKit\u5b9a\u4f4d\u5931\u8d25"

    .line 545
    .line 546
    invoke-virtual {v6, v3, v0}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    sget-object v12, Ltf/t;->g:Ltf/t;

    .line 550
    .line 551
    :goto_b
    check-cast v12, Ljava/util/List;

    .line 552
    .line 553
    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    .line 554
    .line 555
    .line 556
    move-result v0

    .line 557
    if-nez v0, :cond_15

    .line 558
    .line 559
    invoke-virtual {v2}, Lqb/k;->z()Ljava/lang/String;

    .line 560
    .line 561
    .line 562
    move-result-object v0

    .line 563
    invoke-virtual {v7, v8, v0, v11, v12}, Le8/b;->j(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 564
    .line 565
    .line 566
    goto :goto_c

    .line 567
    :cond_15
    invoke-virtual {v2}, Lqb/k;->z()Ljava/lang/String;

    .line 568
    .line 569
    .line 570
    move-result-object v0

    .line 571
    const-string v3, "cache.key"

    .line 572
    .line 573
    :try_start_6
    invoke-interface {v8}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 574
    .line 575
    .line 576
    move-result-object v7

    .line 577
    const-string v13, ""

    .line 578
    .line 579
    invoke-interface {v8, v3, v13}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 580
    .line 581
    .line 582
    move-result-object v8

    .line 583
    invoke-static {v8, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 584
    .line 585
    .line 586
    move-result v8

    .line 587
    if-nez v8, :cond_16

    .line 588
    .line 589
    invoke-interface {v7}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 590
    .line 591
    .line 592
    move-result-object v8

    .line 593
    invoke-interface {v8, v3, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 594
    .line 595
    .line 596
    :cond_16
    invoke-interface {v7, v11}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 597
    .line 598
    .line 599
    move-result-object v0

    .line 600
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 601
    .line 602
    .line 603
    :catchall_5
    :goto_c
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    .line 604
    .line 605
    .line 606
    move-result v0

    .line 607
    if-eqz v0, :cond_17

    .line 608
    .line 609
    const-string v0, "\u8f6c\u53d1\u8bed\u97f3\u5b9a\u4f4d\u83dc\u5355\u70b9\u51fb\u65b9\u6cd5\u5931\u8d25"

    .line 610
    .line 611
    const/4 v3, 0x0

    .line 612
    invoke-virtual {v6, v0, v3}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    :cond_17
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 616
    .line 617
    .line 618
    move-result-object v0

    .line 619
    move/from16 v3, v16

    .line 620
    .line 621
    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 622
    .line 623
    .line 624
    move-result v7

    .line 625
    if-eqz v7, :cond_20

    .line 626
    .line 627
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 628
    .line 629
    .line 630
    move-result-object v7

    .line 631
    check-cast v7, Ljava/lang/reflect/Method;

    .line 632
    .line 633
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 634
    .line 635
    .line 636
    move-result-object v11

    .line 637
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 638
    .line 639
    .line 640
    invoke-virtual {v5}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 641
    .line 642
    .line 643
    move-result-object v12

    .line 644
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 645
    .line 646
    .line 647
    check-cast v12, Ljava/lang/Iterable;

    .line 648
    .line 649
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 650
    .line 651
    .line 652
    move-result-object v12

    .line 653
    :cond_18
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 654
    .line 655
    .line 656
    move-result v13

    .line 657
    if-eqz v13, :cond_19

    .line 658
    .line 659
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 660
    .line 661
    .line 662
    move-result-object v13

    .line 663
    move-object v14, v13

    .line 664
    check-cast v14, Ljava/lang/reflect/Method;

    .line 665
    .line 666
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 667
    .line 668
    .line 669
    move-result-object v14

    .line 670
    invoke-static {v14, v11}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 671
    .line 672
    .line 673
    move-result v14

    .line 674
    if-eqz v14, :cond_18

    .line 675
    .line 676
    goto :goto_e

    .line 677
    :cond_19
    const/4 v13, 0x0

    .line 678
    :goto_e
    check-cast v13, Ljava/lang/reflect/Method;

    .line 679
    .line 680
    if-eqz v13, :cond_1a

    .line 681
    .line 682
    const/16 v17, 0x1

    .line 683
    .line 684
    goto :goto_10

    .line 685
    :cond_1a
    invoke-static {v11}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 686
    .line 687
    .line 688
    move-result-object v11

    .line 689
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 690
    .line 691
    .line 692
    move-result-object v11

    .line 693
    :cond_1b
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 694
    .line 695
    .line 696
    move-result v12

    .line 697
    if-eqz v12, :cond_1c

    .line 698
    .line 699
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 700
    .line 701
    .line 702
    move-result-object v12

    .line 703
    move-object v13, v12

    .line 704
    check-cast v13, Ljava/lang/reflect/Method;

    .line 705
    .line 706
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 707
    .line 708
    .line 709
    move-result-object v14

    .line 710
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 711
    .line 712
    .line 713
    move-result-object v15

    .line 714
    const/16 v17, 0x1

    .line 715
    .line 716
    sget-object v8, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 717
    .line 718
    invoke-static {v15, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 719
    .line 720
    .line 721
    move-result v8

    .line 722
    if-eqz v8, :cond_1b

    .line 723
    .line 724
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 725
    .line 726
    .line 727
    move-result v8

    .line 728
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 729
    .line 730
    .line 731
    move-result v8

    .line 732
    if-nez v8, :cond_1b

    .line 733
    .line 734
    array-length v8, v14

    .line 735
    const/4 v13, 0x3

    .line 736
    if-gt v13, v8, :cond_1b

    .line 737
    .line 738
    const/4 v13, 0x5

    .line 739
    if-ge v8, v13, :cond_1b

    .line 740
    .line 741
    const-class v8, Landroid/view/MenuItem;

    .line 742
    .line 743
    aget-object v13, v14, v16

    .line 744
    .line 745
    invoke-virtual {v8, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 746
    .line 747
    .line 748
    move-result v8

    .line 749
    if-nez v8, :cond_1b

    .line 750
    .line 751
    aget-object v8, v14, v17

    .line 752
    .line 753
    invoke-virtual {v4, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 754
    .line 755
    .line 756
    move-result v8

    .line 757
    if-eqz v8, :cond_1b

    .line 758
    .line 759
    goto :goto_f

    .line 760
    :cond_1c
    const/16 v17, 0x1

    .line 761
    .line 762
    const/4 v12, 0x0

    .line 763
    :goto_f
    move-object v13, v12

    .line 764
    check-cast v13, Ljava/lang/reflect/Method;

    .line 765
    .line 766
    :goto_10
    if-eqz v13, :cond_1e

    .line 767
    .line 768
    new-instance v8, Lf9/d;

    .line 769
    .line 770
    const/4 v11, 0x2

    .line 771
    move/from16 v12, v17

    .line 772
    .line 773
    invoke-direct {v8, v12, v2, v11}, Lf9/d;-><init>(ZLjava/lang/Object;I)V

    .line 774
    .line 775
    .line 776
    invoke-virtual {v2, v13, v8}, Lqb/k;->o(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 777
    .line 778
    .line 779
    move-result v8

    .line 780
    if-eqz v8, :cond_1d

    .line 781
    .line 782
    add-int/lit8 v3, v3, 0x1

    .line 783
    .line 784
    :cond_1d
    new-instance v8, Lf9/d;

    .line 785
    .line 786
    const/4 v11, 0x2

    .line 787
    move/from16 v12, v16

    .line 788
    .line 789
    invoke-direct {v8, v12, v2, v11}, Lf9/d;-><init>(ZLjava/lang/Object;I)V

    .line 790
    .line 791
    .line 792
    invoke-virtual {v2, v7, v8}, Lqb/k;->o(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 793
    .line 794
    .line 795
    move-result v8

    .line 796
    if-eqz v8, :cond_1f

    .line 797
    .line 798
    invoke-virtual {v5, v7, v13}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 799
    .line 800
    .line 801
    add-int/lit8 v3, v3, 0x1

    .line 802
    .line 803
    goto :goto_11

    .line 804
    :cond_1e
    move/from16 v12, v16

    .line 805
    .line 806
    :cond_1f
    :goto_11
    move/from16 v16, v12

    .line 807
    .line 808
    goto/16 :goto_d

    .line 809
    .line 810
    :cond_20
    move/from16 v12, v16

    .line 811
    .line 812
    const/4 v7, 0x1

    .line 813
    invoke-static {v9, v7, v6}, Lj8/a;->g(Lr8/g;ZLfg/p;)Ljava/util/ArrayList;

    .line 814
    .line 815
    .line 816
    move-result-object v0

    .line 817
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 818
    .line 819
    .line 820
    move-result-object v0

    .line 821
    :cond_21
    :goto_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 822
    .line 823
    .line 824
    move-result v5

    .line 825
    if-eqz v5, :cond_22

    .line 826
    .line 827
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 828
    .line 829
    .line 830
    move-result-object v5

    .line 831
    check-cast v5, Ljava/lang/reflect/Method;

    .line 832
    .line 833
    new-instance v7, Lqb/j;

    .line 834
    .line 835
    const/4 v8, 0x1

    .line 836
    invoke-direct {v7, v2, v8}, Lqb/j;-><init>(Lqb/k;I)V

    .line 837
    .line 838
    .line 839
    invoke-virtual {v2, v5, v7}, Lqb/k;->o(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 840
    .line 841
    .line 842
    move-result v5

    .line 843
    if-eqz v5, :cond_21

    .line 844
    .line 845
    add-int/lit8 v3, v3, 0x1

    .line 846
    .line 847
    goto :goto_12

    .line 848
    :cond_22
    const/4 v7, 0x1

    .line 849
    invoke-static {v9, v7, v6}, Lj8/a;->f(Lr8/g;ZLfg/p;)Ljava/util/ArrayList;

    .line 850
    .line 851
    .line 852
    move-result-object v0

    .line 853
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 854
    .line 855
    .line 856
    move-result-object v0

    .line 857
    :cond_23
    :goto_13
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 858
    .line 859
    .line 860
    move-result v5

    .line 861
    if-eqz v5, :cond_24

    .line 862
    .line 863
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 864
    .line 865
    .line 866
    move-result-object v5

    .line 867
    check-cast v5, Ljava/lang/reflect/Method;

    .line 868
    .line 869
    new-instance v7, Lqb/j;

    .line 870
    .line 871
    const/4 v8, 0x0

    .line 872
    invoke-direct {v7, v2, v8}, Lqb/j;-><init>(Lqb/k;I)V

    .line 873
    .line 874
    .line 875
    invoke-virtual {v2, v5, v7}, Lqb/k;->o(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 876
    .line 877
    .line 878
    move-result v5

    .line 879
    if-eqz v5, :cond_23

    .line 880
    .line 881
    add-int/lit8 v3, v3, 0x1

    .line 882
    .line 883
    goto :goto_13

    .line 884
    :cond_24
    const-string v0, "com.tencent.mm.plugin.fav.ui.FavSelectUI"

    .line 885
    .line 886
    invoke-static {v0, v10}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 887
    .line 888
    .line 889
    move-result-object v0

    .line 890
    if-eqz v0, :cond_25

    .line 891
    .line 892
    const-string v5, "onItemClick"

    .line 893
    .line 894
    const-class v7, Landroid/widget/AdapterView;

    .line 895
    .line 896
    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 897
    .line 898
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 899
    .line 900
    .line 901
    sget-object v10, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 902
    .line 903
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 904
    .line 905
    .line 906
    filled-new-array {v7, v4, v8, v10}, [Ljava/lang/Class;

    .line 907
    .line 908
    .line 909
    move-result-object v4

    .line 910
    invoke-static {v0, v5, v4}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 911
    .line 912
    .line 913
    move-result-object v0

    .line 914
    if-eqz v0, :cond_25

    .line 915
    .line 916
    new-instance v4, Lqb/j;

    .line 917
    .line 918
    const/4 v5, 0x2

    .line 919
    invoke-direct {v4, v2, v5}, Lqb/j;-><init>(Lqb/k;I)V

    .line 920
    .line 921
    .line 922
    invoke-virtual {v2, v0, v4}, Lqb/k;->o(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 923
    .line 924
    .line 925
    move-result v0

    .line 926
    goto :goto_14

    .line 927
    :cond_25
    move v0, v12

    .line 928
    :goto_14
    if-eqz v0, :cond_26

    .line 929
    .line 930
    add-int/lit8 v3, v3, 0x1

    .line 931
    .line 932
    :cond_26
    invoke-static {v9, v6}, Lac/p;->E(Lr8/g;Lfg/p;)Ljava/lang/reflect/Method;

    .line 933
    .line 934
    .line 935
    move-result-object v0

    .line 936
    if-eqz v0, :cond_27

    .line 937
    .line 938
    invoke-static {v9, v0, v6}, Lac/p;->G(Lr8/g;Ljava/lang/reflect/Method;Lfg/p;)Ljava/lang/reflect/Method;

    .line 939
    .line 940
    .line 941
    move-result-object v4

    .line 942
    goto :goto_15

    .line 943
    :cond_27
    const/4 v4, 0x0

    .line 944
    :goto_15
    if-eqz v0, :cond_29

    .line 945
    .line 946
    if-eqz v4, :cond_29

    .line 947
    .line 948
    invoke-static {v9, v6}, Lac/p;->F(Lr8/g;Lfg/p;)Ljava/lang/reflect/Method;

    .line 949
    .line 950
    .line 951
    move-result-object v5

    .line 952
    if-eqz v5, :cond_28

    .line 953
    .line 954
    new-instance v7, Lqb/j;

    .line 955
    .line 956
    const/4 v8, 0x3

    .line 957
    invoke-direct {v7, v2, v8}, Lqb/j;-><init>(Lqb/k;I)V

    .line 958
    .line 959
    .line 960
    invoke-virtual {v2, v5, v7}, Lqb/k;->o(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 961
    .line 962
    .line 963
    move-result v5

    .line 964
    if-eqz v5, :cond_28

    .line 965
    .line 966
    add-int/lit8 v3, v3, 0x1

    .line 967
    .line 968
    :cond_28
    new-instance v5, Lc9/c2;

    .line 969
    .line 970
    const/16 v7, 0xe

    .line 971
    .line 972
    invoke-direct {v5, v2, v7, v4}, Lc9/c2;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 973
    .line 974
    .line 975
    invoke-virtual {v2, v0, v5}, Lqb/k;->o(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 976
    .line 977
    .line 978
    move-result v0

    .line 979
    if-eqz v0, :cond_29

    .line 980
    .line 981
    add-int/lit8 v3, v3, 0x1

    .line 982
    .line 983
    :cond_29
    if-gtz v3, :cond_2a

    .line 984
    .line 985
    const-string v0, "\u8f6c\u53d1\u8bed\u97f3Hook\u672a\u5b89\u88c5"

    .line 986
    .line 987
    const/4 v2, 0x0

    .line 988
    invoke-virtual {v6, v0, v2}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 989
    .line 990
    .line 991
    :cond_2a
    if-lez v3, :cond_2b

    .line 992
    .line 993
    const/4 v0, 0x1

    .line 994
    :goto_16
    const/4 v7, 0x1

    .line 995
    goto :goto_17

    .line 996
    :cond_2b
    move v0, v12

    .line 997
    goto :goto_16

    .line 998
    :goto_17
    if-ne v0, v7, :cond_2d

    .line 999
    .line 1000
    move v3, v7

    .line 1001
    goto :goto_18

    .line 1002
    :cond_2c
    const/4 v12, 0x0

    .line 1003
    :cond_2d
    move v3, v12

    .line 1004
    :goto_18
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v0

    .line 1008
    return-object v0

    .line 1009
    :pswitch_10
    invoke-direct {v1}, Li/e0;->e()Ljava/lang/Object;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v0

    .line 1013
    return-object v0

    .line 1014
    :pswitch_11
    iget-object v0, v1, Li/e0;->h:Ljava/lang/Object;

    .line 1015
    .line 1016
    check-cast v0, Lpb/a;

    .line 1017
    .line 1018
    iget-object v0, v0, Lpb/a;->e:Lcb/f;

    .line 1019
    .line 1020
    if-eqz v0, :cond_2e

    .line 1021
    .line 1022
    const/4 v2, 0x1

    .line 1023
    invoke-virtual {v0, v2}, Lcb/f;->g(Z)Z

    .line 1024
    .line 1025
    .line 1026
    move-result v0

    .line 1027
    if-ne v0, v2, :cond_2e

    .line 1028
    .line 1029
    goto :goto_19

    .line 1030
    :cond_2e
    const/4 v2, 0x0

    .line 1031
    :goto_19
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v0

    .line 1035
    return-object v0

    .line 1036
    :pswitch_12
    iget-object v0, v1, Li/e0;->h:Ljava/lang/Object;

    .line 1037
    .line 1038
    check-cast v0, Lob/f;

    .line 1039
    .line 1040
    iget-object v2, v0, Lob/f;->e:Lob/n;

    .line 1041
    .line 1042
    const/4 v0, 0x0

    .line 1043
    if-eqz v2, :cond_3a

    .line 1044
    .line 1045
    monitor-enter v2

    .line 1046
    :try_start_7
    iget-object v3, v2, Lob/n;->a:Lr8/g;

    .line 1047
    .line 1048
    iget-object v4, v2, Lob/n;->b:Lia/t;

    .line 1049
    .line 1050
    invoke-static {v3, v4}, Lf8/i;->k0(Lr8/g;Lfg/p;)Ljava/util/List;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v3

    .line 1054
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 1055
    .line 1056
    .line 1057
    move-result v4

    .line 1058
    const/4 v5, 0x0

    .line 1059
    if-eqz v4, :cond_2f

    .line 1060
    .line 1061
    move v4, v0

    .line 1062
    goto :goto_1b

    .line 1063
    :cond_2f
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v3

    .line 1067
    move v4, v0

    .line 1068
    :cond_30
    :goto_1a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1069
    .line 1070
    .line 1071
    move-result v6

    .line 1072
    if-eqz v6, :cond_32

    .line 1073
    .line 1074
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v6

    .line 1078
    check-cast v6, Ljava/lang/reflect/Method;

    .line 1079
    .line 1080
    new-instance v7, Lob/m;

    .line 1081
    .line 1082
    const/4 v8, 0x1

    .line 1083
    invoke-direct {v7, v2, v8}, Lob/m;-><init>(Lob/n;I)V

    .line 1084
    .line 1085
    .line 1086
    invoke-virtual {v2, v6, v7}, Lob/n;->a(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 1087
    .line 1088
    .line 1089
    move-result v6

    .line 1090
    if-eqz v6, :cond_30

    .line 1091
    .line 1092
    add-int/lit8 v4, v4, 0x1

    .line 1093
    .line 1094
    if-ltz v4, :cond_31

    .line 1095
    .line 1096
    goto :goto_1a

    .line 1097
    :cond_31
    invoke-static {}, La/a;->P0()V

    .line 1098
    .line 1099
    .line 1100
    throw v5

    .line 1101
    :catchall_6
    move-exception v0

    .line 1102
    goto :goto_1f

    .line 1103
    :cond_32
    :goto_1b
    iget-object v3, v2, Lob/n;->a:Lr8/g;

    .line 1104
    .line 1105
    iget-object v6, v2, Lob/n;->b:Lia/t;

    .line 1106
    .line 1107
    invoke-static {v3, v6}, Lf8/i;->j0(Lr8/g;Lfg/p;)Ljava/util/List;

    .line 1108
    .line 1109
    .line 1110
    move-result-object v3

    .line 1111
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 1112
    .line 1113
    .line 1114
    move-result v6

    .line 1115
    if-eqz v6, :cond_33

    .line 1116
    .line 1117
    move v6, v0

    .line 1118
    goto :goto_1d

    .line 1119
    :cond_33
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v3

    .line 1123
    move v6, v0

    .line 1124
    :cond_34
    :goto_1c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1125
    .line 1126
    .line 1127
    move-result v7

    .line 1128
    if-eqz v7, :cond_36

    .line 1129
    .line 1130
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v7

    .line 1134
    check-cast v7, Ljava/lang/reflect/Method;

    .line 1135
    .line 1136
    new-instance v8, Lob/m;

    .line 1137
    .line 1138
    const/4 v9, 0x0

    .line 1139
    invoke-direct {v8, v2, v9}, Lob/m;-><init>(Lob/n;I)V

    .line 1140
    .line 1141
    .line 1142
    invoke-virtual {v2, v7, v8}, Lob/n;->a(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 1143
    .line 1144
    .line 1145
    move-result v7

    .line 1146
    if-eqz v7, :cond_34

    .line 1147
    .line 1148
    add-int/lit8 v6, v6, 0x1

    .line 1149
    .line 1150
    if-ltz v6, :cond_35

    .line 1151
    .line 1152
    goto :goto_1c

    .line 1153
    :cond_35
    invoke-static {}, La/a;->P0()V

    .line 1154
    .line 1155
    .line 1156
    throw v5

    .line 1157
    :cond_36
    :goto_1d
    if-gtz v4, :cond_37

    .line 1158
    .line 1159
    iget-object v3, v2, Lob/n;->b:Lia/t;

    .line 1160
    .line 1161
    const-string v7, "\u6587\u672c\u8f6c\u8bed\u97f3\u83dc\u5355\u521b\u5efa Hook \u672a\u5b89\u88c5"

    .line 1162
    .line 1163
    invoke-virtual {v3, v7, v5}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1164
    .line 1165
    .line 1166
    :cond_37
    if-gtz v6, :cond_38

    .line 1167
    .line 1168
    iget-object v3, v2, Lob/n;->b:Lia/t;

    .line 1169
    .line 1170
    const-string v7, "\u6587\u672c\u8f6c\u8bed\u97f3\u83dc\u5355\u70b9\u51fb Hook \u672a\u5b89\u88c5"

    .line 1171
    .line 1172
    invoke-virtual {v3, v7, v5}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 1173
    .line 1174
    .line 1175
    :cond_38
    const/4 v3, 0x1

    .line 1176
    if-lez v4, :cond_39

    .line 1177
    .line 1178
    if-lez v6, :cond_39

    .line 1179
    .line 1180
    move v4, v3

    .line 1181
    goto :goto_1e

    .line 1182
    :cond_39
    move v4, v0

    .line 1183
    :goto_1e
    monitor-exit v2

    .line 1184
    if-ne v4, v3, :cond_3a

    .line 1185
    .line 1186
    move v0, v3

    .line 1187
    goto :goto_20

    .line 1188
    :goto_1f
    :try_start_8
    monitor-exit v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 1189
    throw v0

    .line 1190
    :cond_3a
    :goto_20
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v0

    .line 1194
    return-object v0

    .line 1195
    :pswitch_13
    iget-object v0, v1, Li/e0;->h:Ljava/lang/Object;

    .line 1196
    .line 1197
    check-cast v0, Lma/a;

    .line 1198
    .line 1199
    iget-object v0, v0, Lma/a;->e:Lcb/f;

    .line 1200
    .line 1201
    if-eqz v0, :cond_3b

    .line 1202
    .line 1203
    const/4 v2, 0x1

    .line 1204
    invoke-virtual {v0, v2}, Lcb/f;->g(Z)Z

    .line 1205
    .line 1206
    .line 1207
    move-result v0

    .line 1208
    if-ne v0, v2, :cond_3b

    .line 1209
    .line 1210
    goto :goto_21

    .line 1211
    :cond_3b
    const/4 v2, 0x0

    .line 1212
    :goto_21
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v0

    .line 1216
    return-object v0

    .line 1217
    :pswitch_14
    iget-object v0, v1, Li/e0;->h:Ljava/lang/Object;

    .line 1218
    .line 1219
    check-cast v0, Lm9/e;

    .line 1220
    .line 1221
    iget-object v0, v0, Lm9/e;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1222
    .line 1223
    const/4 v2, 0x0

    .line 1224
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1225
    .line 1226
    .line 1227
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1228
    .line 1229
    return-object v0

    .line 1230
    :pswitch_15
    iget-object v0, v1, Li/e0;->h:Ljava/lang/Object;

    .line 1231
    .line 1232
    check-cast v0, Lm9/a;

    .line 1233
    .line 1234
    iget-object v2, v0, Lm9/a;->e:Lm9/e;

    .line 1235
    .line 1236
    const/4 v3, 0x0

    .line 1237
    if-eqz v2, :cond_41

    .line 1238
    .line 1239
    monitor-enter v2

    .line 1240
    :try_start_9
    iget-boolean v0, v2, Lm9/e;->g:Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    .line 1241
    .line 1242
    const/4 v4, 0x1

    .line 1243
    if-eqz v0, :cond_3c

    .line 1244
    .line 1245
    monitor-exit v2

    .line 1246
    move v0, v4

    .line 1247
    goto/16 :goto_25

    .line 1248
    .line 1249
    :cond_3c
    :try_start_a
    iget-object v0, v2, Lm9/e;->a:Lr8/g;

    .line 1250
    .line 1251
    iget-object v0, v0, Lr8/g;->e:Lh/Hchat/dexkit/DexFinder;

    .line 1252
    .line 1253
    iget-object v0, v0, Lh/Hchat/dexkit/DexFinder;->emojiSendMethod:Ljava/lang/reflect/Method;

    .line 1254
    .line 1255
    if-eqz v0, :cond_40

    .line 1256
    .line 1257
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v5

    .line 1261
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1262
    .line 1263
    .line 1264
    move-result-object v6

    .line 1265
    sget-object v7, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 1266
    .line 1267
    invoke-static {v6, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1268
    .line 1269
    .line 1270
    move-result v6

    .line 1271
    if-eqz v6, :cond_3f

    .line 1272
    .line 1273
    array-length v6, v5

    .line 1274
    const/4 v7, 0x4

    .line 1275
    if-lt v6, v7, :cond_3f

    .line 1276
    .line 1277
    aget-object v6, v5, v3

    .line 1278
    .line 1279
    const-class v7, Ljava/lang/String;

    .line 1280
    .line 1281
    invoke-static {v6, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1282
    .line 1283
    .line 1284
    move-result v6

    .line 1285
    if-eqz v6, :cond_3f

    .line 1286
    .line 1287
    aget-object v5, v5, v4

    .line 1288
    .line 1289
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1290
    .line 1291
    .line 1292
    move-result-object v5

    .line 1293
    const-string v6, "com.tencent.mm.storage.emotion.EmojiInfo"

    .line 1294
    .line 1295
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1296
    .line 1297
    .line 1298
    move-result v5

    .line 1299
    if-eqz v5, :cond_3f

    .line 1300
    .line 1301
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1302
    .line 1303
    .line 1304
    move-result-object v5

    .line 1305
    aget-object v5, v5, v4

    .line 1306
    .line 1307
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1308
    .line 1309
    .line 1310
    invoke-virtual {v2, v5}, Lm9/e;->d(Ljava/lang/Class;)Ljava/util/LinkedHashMap;

    .line 1311
    .line 1312
    .line 1313
    move-result-object v5

    .line 1314
    if-eqz v5, :cond_3e

    .line 1315
    .line 1316
    iput-object v5, v2, Lm9/e;->f:Ljava/lang/Object;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 1317
    .line 1318
    :try_start_b
    sget-object v5, Lr8/i;->b:Lr8/i;

    .line 1319
    .line 1320
    new-instance v6, Lc9/c2;

    .line 1321
    .line 1322
    const/16 v7, 0x9

    .line 1323
    .line 1324
    invoke-direct {v6, v2, v7, v0}, Lc9/c2;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1325
    .line 1326
    .line 1327
    invoke-virtual {v5, v0, v6}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 1328
    .line 1329
    .line 1330
    iput-boolean v4, v2, Lm9/e;->g:Z

    .line 1331
    .line 1332
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    .line 1333
    .line 1334
    goto :goto_22

    .line 1335
    :catchall_7
    move-exception v0

    .line 1336
    :try_start_c
    new-instance v5, Lsf/f;

    .line 1337
    .line 1338
    invoke-direct {v5, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1339
    .line 1340
    .line 1341
    move-object v0, v5

    .line 1342
    :goto_22
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1343
    .line 1344
    .line 1345
    move-result-object v5

    .line 1346
    if-nez v5, :cond_3d

    .line 1347
    .line 1348
    goto :goto_23

    .line 1349
    :cond_3d
    sget-object v0, Ltf/u;->g:Ltf/u;

    .line 1350
    .line 1351
    iput-object v0, v2, Lm9/e;->f:Ljava/lang/Object;

    .line 1352
    .line 1353
    iget-object v0, v2, Lm9/e;->b:Lia/t;

    .line 1354
    .line 1355
    const-string v6, "\u6e38\u620f\u8868\u60c5\u53d1\u9001 Hook \u5b89\u88c5\u5931\u8d25"

    .line 1356
    .line 1357
    invoke-virtual {v0, v6, v5}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1358
    .line 1359
    .line 1360
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1361
    .line 1362
    :goto_23
    check-cast v0, Ljava/lang/Boolean;

    .line 1363
    .line 1364
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1365
    .line 1366
    .line 1367
    move-result v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    .line 1368
    monitor-exit v2

    .line 1369
    goto :goto_25

    .line 1370
    :catchall_8
    move-exception v0

    .line 1371
    goto :goto_26

    .line 1372
    :cond_3e
    monitor-exit v2

    .line 1373
    :goto_24
    move v0, v3

    .line 1374
    goto :goto_25

    .line 1375
    :cond_3f
    monitor-exit v2

    .line 1376
    goto :goto_24

    .line 1377
    :cond_40
    monitor-exit v2

    .line 1378
    goto :goto_24

    .line 1379
    :goto_25
    if-ne v0, v4, :cond_41

    .line 1380
    .line 1381
    move v3, v4

    .line 1382
    goto :goto_27

    .line 1383
    :goto_26
    :try_start_d
    monitor-exit v2
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    .line 1384
    throw v0

    .line 1385
    :cond_41
    :goto_27
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1386
    .line 1387
    .line 1388
    move-result-object v0

    .line 1389
    return-object v0

    .line 1390
    :pswitch_16
    iget-object v0, v1, Li/e0;->h:Ljava/lang/Object;

    .line 1391
    .line 1392
    check-cast v0, Ll9/a;

    .line 1393
    .line 1394
    iget-object v2, v0, Ll9/a;->e:Ll9/d;

    .line 1395
    .line 1396
    const/4 v0, 0x0

    .line 1397
    if-eqz v2, :cond_4a

    .line 1398
    .line 1399
    monitor-enter v2

    .line 1400
    :try_start_e
    iget-boolean v3, v2, Ll9/d;->f:Z

    .line 1401
    .line 1402
    if-nez v3, :cond_43

    .line 1403
    .line 1404
    invoke-virtual {v2}, Ll9/d;->f()Ljava/lang/reflect/Method;

    .line 1405
    .line 1406
    .line 1407
    move-result-object v3

    .line 1408
    if-eqz v3, :cond_42

    .line 1409
    .line 1410
    invoke-virtual {v2, v3}, Ll9/d;->b(Ljava/lang/reflect/Method;)Z

    .line 1411
    .line 1412
    .line 1413
    move-result v3
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_9

    .line 1414
    if-nez v3, :cond_43

    .line 1415
    .line 1416
    monitor-exit v2

    .line 1417
    goto :goto_2b

    .line 1418
    :catchall_9
    move-exception v0

    .line 1419
    goto :goto_2a

    .line 1420
    :cond_42
    monitor-exit v2

    .line 1421
    goto :goto_2b

    .line 1422
    :cond_43
    :try_start_f
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->version()Lo8/k;

    .line 1423
    .line 1424
    .line 1425
    move-result-object v3

    .line 1426
    const-wide/16 v4, 0x0

    .line 1427
    .line 1428
    if-eqz v3, :cond_44

    .line 1429
    .line 1430
    invoke-virtual {v3}, Lo8/k;->b()Ll8/i;

    .line 1431
    .line 1432
    .line 1433
    move-result-object v3

    .line 1434
    iget-wide v6, v3, Ll8/i;->a:J

    .line 1435
    .line 1436
    goto :goto_28

    .line 1437
    :cond_44
    move-wide v6, v4

    .line 1438
    :goto_28
    cmp-long v3, v6, v4

    .line 1439
    .line 1440
    const/4 v4, 0x1

    .line 1441
    if-eqz v3, :cond_45

    .line 1442
    .line 1443
    const-wide/16 v8, 0xb19

    .line 1444
    .line 1445
    cmp-long v3, v6, v8

    .line 1446
    .line 1447
    if-ltz v3, :cond_46

    .line 1448
    .line 1449
    :cond_45
    iget-boolean v3, v2, Ll9/d;->g:Z
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_9

    .line 1450
    .line 1451
    if-eqz v3, :cond_47

    .line 1452
    .line 1453
    :cond_46
    monitor-exit v2

    .line 1454
    :goto_29
    move v0, v4

    .line 1455
    goto :goto_2b

    .line 1456
    :cond_47
    :try_start_10
    invoke-virtual {v2}, Ll9/d;->g()Ljava/lang/reflect/Method;

    .line 1457
    .line 1458
    .line 1459
    move-result-object v3

    .line 1460
    if-eqz v3, :cond_49

    .line 1461
    .line 1462
    const-string v5, "\u65b0\u7248\u8f6c\u53d1\u8054\u7cfb\u4eba\u914d\u7f6e"

    .line 1463
    .line 1464
    new-instance v6, Ll9/b;

    .line 1465
    .line 1466
    const/4 v7, 0x1

    .line 1467
    invoke-direct {v6, v2, v7}, Ll9/b;-><init>(Ll9/d;I)V

    .line 1468
    .line 1469
    .line 1470
    invoke-virtual {v2, v3, v5, v6}, Ll9/d;->a(Ljava/lang/reflect/Method;Ljava/lang/String;Lfg/l;)Z

    .line 1471
    .line 1472
    .line 1473
    move-result v3
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_9

    .line 1474
    if-nez v3, :cond_48

    .line 1475
    .line 1476
    monitor-exit v2

    .line 1477
    goto :goto_2b

    .line 1478
    :cond_48
    :try_start_11
    iput-boolean v4, v2, Ll9/d;->g:Z
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_9

    .line 1479
    .line 1480
    monitor-exit v2

    .line 1481
    goto :goto_29

    .line 1482
    :cond_49
    monitor-exit v2

    .line 1483
    goto :goto_2b

    .line 1484
    :goto_2a
    :try_start_12
    monitor-exit v2
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_9

    .line 1485
    throw v0

    .line 1486
    :cond_4a
    :goto_2b
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1487
    .line 1488
    .line 1489
    move-result-object v0

    .line 1490
    return-object v0

    .line 1491
    :pswitch_17
    iget-object v0, v1, Li/e0;->h:Ljava/lang/Object;

    .line 1492
    .line 1493
    check-cast v0, Lk/y1;

    .line 1494
    .line 1495
    sget-object v2, Lk/m1;->a:Li0/u;

    .line 1496
    .line 1497
    invoke-static {v0, v2}, Lx1/k;->h(Lx1/h;Li0/p1;)Ljava/lang/Object;

    .line 1498
    .line 1499
    .line 1500
    move-result-object v2

    .line 1501
    check-cast v2, Lk/l1;

    .line 1502
    .line 1503
    iput-object v2, v0, Lk/y1;->F:Lk/l1;

    .line 1504
    .line 1505
    if-eqz v2, :cond_4b

    .line 1506
    .line 1507
    invoke-interface {v2}, Lk/l1;->a()Lk/k1;

    .line 1508
    .line 1509
    .line 1510
    move-result-object v2

    .line 1511
    goto :goto_2c

    .line 1512
    :cond_4b
    const/4 v2, 0x0

    .line 1513
    :goto_2c
    iput-object v2, v0, Lk/y1;->G:Lk/k1;

    .line 1514
    .line 1515
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1516
    .line 1517
    return-object v0

    .line 1518
    :pswitch_18
    iget-object v0, v1, Li/e0;->h:Ljava/lang/Object;

    .line 1519
    .line 1520
    check-cast v0, Ljb/a;

    .line 1521
    .line 1522
    iget-object v2, v0, Ljb/a;->e:Ljb/e;

    .line 1523
    .line 1524
    const/4 v3, 0x0

    .line 1525
    if-eqz v2, :cond_69

    .line 1526
    .line 1527
    iget-object v4, v2, Ljb/e;->a:Lr8/g;

    .line 1528
    .line 1529
    iget-object v5, v2, Ljb/e;->d:Ljava/util/Set;

    .line 1530
    .line 1531
    iget-object v6, v2, Ljb/e;->b:Lia/t;

    .line 1532
    .line 1533
    iget-object v0, v4, Lr8/g;->a:Landroid/content/Context;

    .line 1534
    .line 1535
    iget-object v7, v4, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 1536
    .line 1537
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1538
    .line 1539
    .line 1540
    invoke-static {v0, v7}, Lo8/k;->a(Landroid/content/Context;Ljava/lang/ClassLoader;)Ll8/i;

    .line 1541
    .line 1542
    .line 1543
    move-result-object v0

    .line 1544
    iget-object v0, v0, Ll8/i;->h:Ljava/lang/String;

    .line 1545
    .line 1546
    iget-object v7, v2, Ljb/e;->c:Landroid/content/SharedPreferences;

    .line 1547
    .line 1548
    iget-object v8, v4, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 1549
    .line 1550
    const-string v9, "finder_menu_create"

    .line 1551
    .line 1552
    invoke-static {v7, v0, v8, v9}, Le8/b;->f(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/util/List;

    .line 1553
    .line 1554
    .line 1555
    move-result-object v8

    .line 1556
    new-instance v10, Ljava/util/ArrayList;

    .line 1557
    .line 1558
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 1559
    .line 1560
    .line 1561
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1562
    .line 1563
    .line 1564
    move-result-object v8

    .line 1565
    :cond_4c
    :goto_2d
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1566
    .line 1567
    .line 1568
    move-result v11

    .line 1569
    if-eqz v11, :cond_4d

    .line 1570
    .line 1571
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1572
    .line 1573
    .line 1574
    move-result-object v11

    .line 1575
    move-object v12, v11

    .line 1576
    check-cast v12, Ljava/lang/reflect/Method;

    .line 1577
    .line 1578
    invoke-static {v12}, Ljb/e;->g(Ljava/lang/reflect/Method;)Z

    .line 1579
    .line 1580
    .line 1581
    move-result v12

    .line 1582
    if-eqz v12, :cond_4c

    .line 1583
    .line 1584
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1585
    .line 1586
    .line 1587
    goto :goto_2d

    .line 1588
    :cond_4d
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1589
    .line 1590
    .line 1591
    move-result v8

    .line 1592
    if-nez v8, :cond_4e

    .line 1593
    .line 1594
    goto/16 :goto_31

    .line 1595
    .line 1596
    :cond_4e
    new-instance v8, Ljava/util/LinkedHashSet;

    .line 1597
    .line 1598
    invoke-direct {v8}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1599
    .line 1600
    .line 1601
    const-string v10, "pos is error "

    .line 1602
    .line 1603
    filled-new-array {v10}, [Ljava/lang/String;

    .line 1604
    .line 1605
    .line 1606
    move-result-object v10

    .line 1607
    invoke-virtual {v2, v10}, Ljb/e;->c([Ljava/lang/String;)Ljava/util/List;

    .line 1608
    .line 1609
    .line 1610
    move-result-object v10

    .line 1611
    new-instance v11, Ljava/util/ArrayList;

    .line 1612
    .line 1613
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 1614
    .line 1615
    .line 1616
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1617
    .line 1618
    .line 1619
    move-result-object v10

    .line 1620
    :cond_4f
    :goto_2e
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 1621
    .line 1622
    .line 1623
    move-result v12

    .line 1624
    if-eqz v12, :cond_50

    .line 1625
    .line 1626
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1627
    .line 1628
    .line 1629
    move-result-object v12

    .line 1630
    move-object v13, v12

    .line 1631
    check-cast v13, Ljava/lang/reflect/Method;

    .line 1632
    .line 1633
    invoke-static {v13}, Ljb/e;->g(Ljava/lang/reflect/Method;)Z

    .line 1634
    .line 1635
    .line 1636
    move-result v13

    .line 1637
    if-eqz v13, :cond_4f

    .line 1638
    .line 1639
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1640
    .line 1641
    .line 1642
    goto :goto_2e

    .line 1643
    :cond_50
    invoke-static {v8, v11}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1644
    .line 1645
    .line 1646
    const-string v10, "feed"

    .line 1647
    .line 1648
    const-string v11, "menu"

    .line 1649
    .line 1650
    const-string v12, "sheet"

    .line 1651
    .line 1652
    const-string v13, "holder"

    .line 1653
    .line 1654
    const-string v14, "KEY_FINDER_SELF_FLAG"

    .line 1655
    .line 1656
    filled-new-array {v10, v11, v12, v13, v14}, [Ljava/lang/String;

    .line 1657
    .line 1658
    .line 1659
    move-result-object v10

    .line 1660
    invoke-virtual {v2, v10}, Ljb/e;->c([Ljava/lang/String;)Ljava/util/List;

    .line 1661
    .line 1662
    .line 1663
    move-result-object v10

    .line 1664
    new-instance v11, Ljava/util/ArrayList;

    .line 1665
    .line 1666
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 1667
    .line 1668
    .line 1669
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1670
    .line 1671
    .line 1672
    move-result-object v10

    .line 1673
    :cond_51
    :goto_2f
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 1674
    .line 1675
    .line 1676
    move-result v12

    .line 1677
    if-eqz v12, :cond_52

    .line 1678
    .line 1679
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1680
    .line 1681
    .line 1682
    move-result-object v12

    .line 1683
    move-object v13, v12

    .line 1684
    check-cast v13, Ljava/lang/reflect/Method;

    .line 1685
    .line 1686
    invoke-static {v13}, Ljb/e;->g(Ljava/lang/reflect/Method;)Z

    .line 1687
    .line 1688
    .line 1689
    move-result v13

    .line 1690
    if-eqz v13, :cond_51

    .line 1691
    .line 1692
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1693
    .line 1694
    .line 1695
    goto :goto_2f

    .line 1696
    :cond_52
    invoke-static {v8, v11}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1697
    .line 1698
    .line 1699
    const-string v10, "getCreateSecondMoreMenuListener: username="

    .line 1700
    .line 1701
    filled-new-array {v10}, [Ljava/lang/String;

    .line 1702
    .line 1703
    .line 1704
    move-result-object v10

    .line 1705
    invoke-virtual {v2, v10}, Ljb/e;->c([Ljava/lang/String;)Ljava/util/List;

    .line 1706
    .line 1707
    .line 1708
    move-result-object v10

    .line 1709
    new-instance v11, Ljava/util/ArrayList;

    .line 1710
    .line 1711
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 1712
    .line 1713
    .line 1714
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1715
    .line 1716
    .line 1717
    move-result-object v10

    .line 1718
    :cond_53
    :goto_30
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 1719
    .line 1720
    .line 1721
    move-result v12

    .line 1722
    if-eqz v12, :cond_54

    .line 1723
    .line 1724
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1725
    .line 1726
    .line 1727
    move-result-object v12

    .line 1728
    move-object v13, v12

    .line 1729
    check-cast v13, Ljava/lang/reflect/Method;

    .line 1730
    .line 1731
    invoke-static {v13}, Ljb/e;->g(Ljava/lang/reflect/Method;)Z

    .line 1732
    .line 1733
    .line 1734
    move-result v13

    .line 1735
    if-eqz v13, :cond_53

    .line 1736
    .line 1737
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1738
    .line 1739
    .line 1740
    goto :goto_30

    .line 1741
    :cond_54
    invoke-static {v8, v11}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1742
    .line 1743
    .line 1744
    invoke-static {v8}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1745
    .line 1746
    .line 1747
    move-result-object v10

    .line 1748
    invoke-virtual {v2, v0, v9, v10}, Ljb/e;->j(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 1749
    .line 1750
    .line 1751
    invoke-static {v8}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1752
    .line 1753
    .line 1754
    move-result-object v10

    .line 1755
    :goto_31
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1756
    .line 1757
    .line 1758
    move-result-object v8

    .line 1759
    move v9, v3

    .line 1760
    :cond_55
    :goto_32
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1761
    .line 1762
    .line 1763
    move-result v0

    .line 1764
    const/4 v10, 0x1

    .line 1765
    if-eqz v0, :cond_58

    .line 1766
    .line 1767
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1768
    .line 1769
    .line 1770
    move-result-object v0

    .line 1771
    move-object v11, v0

    .line 1772
    check-cast v11, Ljava/lang/reflect/Method;

    .line 1773
    .line 1774
    invoke-interface {v5, v11}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 1775
    .line 1776
    .line 1777
    move-result v0

    .line 1778
    if-nez v0, :cond_56

    .line 1779
    .line 1780
    goto :goto_35

    .line 1781
    :cond_56
    :try_start_13
    sget-object v0, Lr8/i;->b:Lr8/i;

    .line 1782
    .line 1783
    new-instance v10, Ljb/d;

    .line 1784
    .line 1785
    const/4 v12, 0x1

    .line 1786
    invoke-direct {v10, v2, v12}, Ljb/d;-><init>(Ljb/e;I)V

    .line 1787
    .line 1788
    .line 1789
    invoke-virtual {v0, v11, v10}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 1790
    .line 1791
    .line 1792
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_a

    .line 1793
    .line 1794
    goto :goto_33

    .line 1795
    :catchall_a
    move-exception v0

    .line 1796
    new-instance v10, Lsf/f;

    .line 1797
    .line 1798
    invoke-direct {v10, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1799
    .line 1800
    .line 1801
    move-object v0, v10

    .line 1802
    :goto_33
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1803
    .line 1804
    .line 1805
    move-result-object v10

    .line 1806
    if-nez v10, :cond_57

    .line 1807
    .line 1808
    goto :goto_34

    .line 1809
    :cond_57
    invoke-interface {v5, v11}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 1810
    .line 1811
    .line 1812
    const-string v0, "\u89c6\u9891\u53f7\u83dc\u5355\u521b\u5efaHook\u5931\u8d25"

    .line 1813
    .line 1814
    invoke-virtual {v6, v0, v10}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1815
    .line 1816
    .line 1817
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1818
    .line 1819
    :goto_34
    check-cast v0, Ljava/lang/Boolean;

    .line 1820
    .line 1821
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1822
    .line 1823
    .line 1824
    move-result v10

    .line 1825
    :goto_35
    if-eqz v10, :cond_55

    .line 1826
    .line 1827
    add-int/lit8 v9, v9, 0x1

    .line 1828
    .line 1829
    goto :goto_32

    .line 1830
    :cond_58
    iget-object v0, v4, Lr8/g;->a:Landroid/content/Context;

    .line 1831
    .line 1832
    iget-object v8, v4, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 1833
    .line 1834
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1835
    .line 1836
    .line 1837
    invoke-static {v0, v8}, Lo8/k;->a(Landroid/content/Context;Ljava/lang/ClassLoader;)Ll8/i;

    .line 1838
    .line 1839
    .line 1840
    move-result-object v0

    .line 1841
    iget-object v0, v0, Ll8/i;->h:Ljava/lang/String;

    .line 1842
    .line 1843
    iget-object v4, v4, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 1844
    .line 1845
    const-string v8, "finder_menu_click"

    .line 1846
    .line 1847
    invoke-static {v7, v0, v4, v8}, Le8/b;->f(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/util/List;

    .line 1848
    .line 1849
    .line 1850
    move-result-object v4

    .line 1851
    new-instance v7, Ljava/util/ArrayList;

    .line 1852
    .line 1853
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 1854
    .line 1855
    .line 1856
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1857
    .line 1858
    .line 1859
    move-result-object v4

    .line 1860
    :cond_59
    :goto_36
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1861
    .line 1862
    .line 1863
    move-result v11

    .line 1864
    if-eqz v11, :cond_5a

    .line 1865
    .line 1866
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1867
    .line 1868
    .line 1869
    move-result-object v11

    .line 1870
    move-object v12, v11

    .line 1871
    check-cast v12, Ljava/lang/reflect/Method;

    .line 1872
    .line 1873
    invoke-static {v12}, Ljb/e;->f(Ljava/lang/reflect/Method;)Z

    .line 1874
    .line 1875
    .line 1876
    move-result v12

    .line 1877
    if-eqz v12, :cond_59

    .line 1878
    .line 1879
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1880
    .line 1881
    .line 1882
    goto :goto_36

    .line 1883
    :cond_5a
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1884
    .line 1885
    .line 1886
    move-result v4

    .line 1887
    if-nez v4, :cond_5b

    .line 1888
    .line 1889
    goto/16 :goto_3a

    .line 1890
    .line 1891
    :cond_5b
    new-instance v4, Ljava/util/LinkedHashSet;

    .line 1892
    .line 1893
    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1894
    .line 1895
    .line 1896
    const-string v7, "[getMoreMenuItemSelectedListener] feed "

    .line 1897
    .line 1898
    filled-new-array {v7}, [Ljava/lang/String;

    .line 1899
    .line 1900
    .line 1901
    move-result-object v7

    .line 1902
    invoke-virtual {v2, v7}, Ljb/e;->c([Ljava/lang/String;)Ljava/util/List;

    .line 1903
    .line 1904
    .line 1905
    move-result-object v7

    .line 1906
    new-instance v11, Ljava/util/ArrayList;

    .line 1907
    .line 1908
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 1909
    .line 1910
    .line 1911
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1912
    .line 1913
    .line 1914
    move-result-object v7

    .line 1915
    :cond_5c
    :goto_37
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1916
    .line 1917
    .line 1918
    move-result v12

    .line 1919
    if-eqz v12, :cond_5d

    .line 1920
    .line 1921
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1922
    .line 1923
    .line 1924
    move-result-object v12

    .line 1925
    move-object v13, v12

    .line 1926
    check-cast v13, Ljava/lang/reflect/Method;

    .line 1927
    .line 1928
    invoke-static {v13}, Ljb/e;->f(Ljava/lang/reflect/Method;)Z

    .line 1929
    .line 1930
    .line 1931
    move-result v13

    .line 1932
    if-eqz v13, :cond_5c

    .line 1933
    .line 1934
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1935
    .line 1936
    .line 1937
    goto :goto_37

    .line 1938
    :cond_5d
    invoke-static {v4, v11}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1939
    .line 1940
    .line 1941
    const-string v7, "getMoreMenuItemSelectedListener feed "

    .line 1942
    .line 1943
    filled-new-array {v7}, [Ljava/lang/String;

    .line 1944
    .line 1945
    .line 1946
    move-result-object v7

    .line 1947
    invoke-virtual {v2, v7}, Ljb/e;->c([Ljava/lang/String;)Ljava/util/List;

    .line 1948
    .line 1949
    .line 1950
    move-result-object v7

    .line 1951
    new-instance v11, Ljava/util/ArrayList;

    .line 1952
    .line 1953
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 1954
    .line 1955
    .line 1956
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1957
    .line 1958
    .line 1959
    move-result-object v7

    .line 1960
    :cond_5e
    :goto_38
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1961
    .line 1962
    .line 1963
    move-result v12

    .line 1964
    if-eqz v12, :cond_5f

    .line 1965
    .line 1966
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1967
    .line 1968
    .line 1969
    move-result-object v12

    .line 1970
    move-object v13, v12

    .line 1971
    check-cast v13, Ljava/lang/reflect/Method;

    .line 1972
    .line 1973
    invoke-static {v13}, Ljb/e;->f(Ljava/lang/reflect/Method;)Z

    .line 1974
    .line 1975
    .line 1976
    move-result v13

    .line 1977
    if-eqz v13, :cond_5e

    .line 1978
    .line 1979
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1980
    .line 1981
    .line 1982
    goto :goto_38

    .line 1983
    :cond_5f
    invoke-static {v4, v11}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1984
    .line 1985
    .line 1986
    const-string v7, "button_speedplay"

    .line 1987
    .line 1988
    const-string v11, "ref_eid"

    .line 1989
    .line 1990
    filled-new-array {v7, v11}, [Ljava/lang/String;

    .line 1991
    .line 1992
    .line 1993
    move-result-object v7

    .line 1994
    invoke-virtual {v2, v7}, Ljb/e;->c([Ljava/lang/String;)Ljava/util/List;

    .line 1995
    .line 1996
    .line 1997
    move-result-object v7

    .line 1998
    new-instance v11, Ljava/util/ArrayList;

    .line 1999
    .line 2000
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 2001
    .line 2002
    .line 2003
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2004
    .line 2005
    .line 2006
    move-result-object v7

    .line 2007
    :cond_60
    :goto_39
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 2008
    .line 2009
    .line 2010
    move-result v12

    .line 2011
    if-eqz v12, :cond_61

    .line 2012
    .line 2013
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2014
    .line 2015
    .line 2016
    move-result-object v12

    .line 2017
    move-object v13, v12

    .line 2018
    check-cast v13, Ljava/lang/reflect/Method;

    .line 2019
    .line 2020
    invoke-static {v13}, Ljb/e;->f(Ljava/lang/reflect/Method;)Z

    .line 2021
    .line 2022
    .line 2023
    move-result v13

    .line 2024
    if-eqz v13, :cond_60

    .line 2025
    .line 2026
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2027
    .line 2028
    .line 2029
    goto :goto_39

    .line 2030
    :cond_61
    invoke-static {v4, v11}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 2031
    .line 2032
    .line 2033
    invoke-static {v4}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 2034
    .line 2035
    .line 2036
    move-result-object v7

    .line 2037
    invoke-virtual {v2, v0, v8, v7}, Ljb/e;->j(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 2038
    .line 2039
    .line 2040
    invoke-static {v4}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 2041
    .line 2042
    .line 2043
    move-result-object v7

    .line 2044
    :goto_3a
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2045
    .line 2046
    .line 2047
    move-result-object v4

    .line 2048
    move v7, v3

    .line 2049
    :cond_62
    :goto_3b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 2050
    .line 2051
    .line 2052
    move-result v0

    .line 2053
    if-eqz v0, :cond_65

    .line 2054
    .line 2055
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2056
    .line 2057
    .line 2058
    move-result-object v0

    .line 2059
    move-object v8, v0

    .line 2060
    check-cast v8, Ljava/lang/reflect/Method;

    .line 2061
    .line 2062
    invoke-interface {v5, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 2063
    .line 2064
    .line 2065
    move-result v0

    .line 2066
    if-nez v0, :cond_63

    .line 2067
    .line 2068
    move v0, v10

    .line 2069
    goto :goto_3e

    .line 2070
    :cond_63
    :try_start_14
    sget-object v0, Lr8/i;->b:Lr8/i;

    .line 2071
    .line 2072
    new-instance v11, Ljb/d;

    .line 2073
    .line 2074
    const/4 v12, 0x0

    .line 2075
    invoke-direct {v11, v2, v12}, Ljb/d;-><init>(Ljb/e;I)V

    .line 2076
    .line 2077
    .line 2078
    invoke-virtual {v0, v8, v11}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 2079
    .line 2080
    .line 2081
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_b

    .line 2082
    .line 2083
    goto :goto_3c

    .line 2084
    :catchall_b
    move-exception v0

    .line 2085
    new-instance v11, Lsf/f;

    .line 2086
    .line 2087
    invoke-direct {v11, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 2088
    .line 2089
    .line 2090
    move-object v0, v11

    .line 2091
    :goto_3c
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 2092
    .line 2093
    .line 2094
    move-result-object v11

    .line 2095
    if-nez v11, :cond_64

    .line 2096
    .line 2097
    goto :goto_3d

    .line 2098
    :cond_64
    invoke-interface {v5, v8}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 2099
    .line 2100
    .line 2101
    const-string v0, "\u89c6\u9891\u53f7\u83dc\u5355\u70b9\u51fbHook\u5931\u8d25"

    .line 2102
    .line 2103
    invoke-virtual {v6, v0, v11}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2104
    .line 2105
    .line 2106
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2107
    .line 2108
    :goto_3d
    check-cast v0, Ljava/lang/Boolean;

    .line 2109
    .line 2110
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2111
    .line 2112
    .line 2113
    move-result v0

    .line 2114
    :goto_3e
    if-eqz v0, :cond_62

    .line 2115
    .line 2116
    add-int/lit8 v7, v7, 0x1

    .line 2117
    .line 2118
    goto :goto_3b

    .line 2119
    :cond_65
    if-lez v9, :cond_66

    .line 2120
    .line 2121
    if-gtz v7, :cond_67

    .line 2122
    .line 2123
    :cond_66
    const-string v0, "\u89c6\u9891\u53f7\u5a92\u4f53\u4e0b\u8f7dHook\u672a\u5b89\u88c5"

    .line 2124
    .line 2125
    const/4 v2, 0x0

    .line 2126
    invoke-virtual {v6, v0, v2}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2127
    .line 2128
    .line 2129
    :cond_67
    if-lez v9, :cond_68

    .line 2130
    .line 2131
    if-lez v7, :cond_68

    .line 2132
    .line 2133
    move v0, v10

    .line 2134
    goto :goto_3f

    .line 2135
    :cond_68
    move v0, v3

    .line 2136
    :goto_3f
    if-ne v0, v10, :cond_69

    .line 2137
    .line 2138
    move v3, v10

    .line 2139
    :cond_69
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2140
    .line 2141
    .line 2142
    move-result-object v0

    .line 2143
    return-object v0

    .line 2144
    :pswitch_19
    iget-object v0, v1, Li/e0;->h:Ljava/lang/Object;

    .line 2145
    .line 2146
    check-cast v0, Lja/a;

    .line 2147
    .line 2148
    iget-object v0, v0, Lja/a;->e:Lhb/c;

    .line 2149
    .line 2150
    const/4 v2, 0x0

    .line 2151
    if-eqz v0, :cond_6f

    .line 2152
    .line 2153
    iget-object v3, v0, Lhb/c;->g:Ljava/lang/Object;

    .line 2154
    .line 2155
    check-cast v3, Lr8/g;

    .line 2156
    .line 2157
    iget-object v4, v0, Lhb/c;->h:Ljava/lang/Object;

    .line 2158
    .line 2159
    check-cast v4, Lia/t;

    .line 2160
    .line 2161
    invoke-static {v3, v4}, Lac/p;->F(Lr8/g;Lfg/p;)Ljava/lang/reflect/Method;

    .line 2162
    .line 2163
    .line 2164
    move-result-object v5

    .line 2165
    invoke-static {v3, v4}, Lac/p;->E(Lr8/g;Lfg/p;)Ljava/lang/reflect/Method;

    .line 2166
    .line 2167
    .line 2168
    move-result-object v6

    .line 2169
    const/4 v7, 0x0

    .line 2170
    if-eqz v6, :cond_6a

    .line 2171
    .line 2172
    invoke-static {v3, v6, v4}, Lac/p;->G(Lr8/g;Ljava/lang/reflect/Method;Lfg/p;)Ljava/lang/reflect/Method;

    .line 2173
    .line 2174
    .line 2175
    move-result-object v3

    .line 2176
    goto :goto_40

    .line 2177
    :cond_6a
    move-object v3, v7

    .line 2178
    :goto_40
    const/4 v8, 0x1

    .line 2179
    if-eqz v5, :cond_6b

    .line 2180
    .line 2181
    if-eqz v3, :cond_6b

    .line 2182
    .line 2183
    new-instance v9, Lb9/e;

    .line 2184
    .line 2185
    const/16 v10, 0xe

    .line 2186
    .line 2187
    invoke-direct {v9, v0, v10}, Lb9/e;-><init>(Ljava/lang/Object;I)V

    .line 2188
    .line 2189
    .line 2190
    invoke-virtual {v0, v5, v9}, Lhb/c;->p(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 2191
    .line 2192
    .line 2193
    move-result v5

    .line 2194
    if-eqz v5, :cond_6b

    .line 2195
    .line 2196
    move v5, v8

    .line 2197
    goto :goto_41

    .line 2198
    :cond_6b
    move v5, v2

    .line 2199
    :goto_41
    if-eqz v6, :cond_6c

    .line 2200
    .line 2201
    if-eqz v3, :cond_6c

    .line 2202
    .line 2203
    new-instance v9, Lc9/c2;

    .line 2204
    .line 2205
    const/4 v10, 0x6

    .line 2206
    invoke-direct {v9, v0, v10, v3}, Lc9/c2;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 2207
    .line 2208
    .line 2209
    invoke-virtual {v0, v6, v9}, Lhb/c;->p(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 2210
    .line 2211
    .line 2212
    move-result v0

    .line 2213
    if-eqz v0, :cond_6c

    .line 2214
    .line 2215
    move v0, v8

    .line 2216
    goto :goto_42

    .line 2217
    :cond_6c
    move v0, v2

    .line 2218
    :goto_42
    if-nez v5, :cond_6d

    .line 2219
    .line 2220
    const-string v3, "\u591a\u9009\u64a4\u56de\u83dc\u5355\u521b\u5efaHook\u672a\u5b89\u88c5"

    .line 2221
    .line 2222
    invoke-virtual {v4, v3, v7}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2223
    .line 2224
    .line 2225
    :cond_6d
    if-nez v0, :cond_6e

    .line 2226
    .line 2227
    const-string v3, "\u591a\u9009\u64a4\u56de\u83dc\u5355\u70b9\u51fbHook\u672a\u5b89\u88c5"

    .line 2228
    .line 2229
    invoke-virtual {v4, v3, v7}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2230
    .line 2231
    .line 2232
    :cond_6e
    if-eqz v5, :cond_6f

    .line 2233
    .line 2234
    if-eqz v0, :cond_6f

    .line 2235
    .line 2236
    move v2, v8

    .line 2237
    :cond_6f
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2238
    .line 2239
    .line 2240
    move-result-object v0

    .line 2241
    return-object v0

    .line 2242
    :pswitch_1a
    iget-object v0, v1, Li/e0;->h:Ljava/lang/Object;

    .line 2243
    .line 2244
    check-cast v0, Lj9/a;

    .line 2245
    .line 2246
    iget-object v2, v0, Lj9/a;->e:Lea/c;

    .line 2247
    .line 2248
    const/4 v3, 0x0

    .line 2249
    if-eqz v2, :cond_73

    .line 2250
    .line 2251
    monitor-enter v2

    .line 2252
    :try_start_15
    iget-boolean v0, v2, Lea/c;->c:Z
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_d

    .line 2253
    .line 2254
    const/4 v4, 0x1

    .line 2255
    if-eqz v0, :cond_70

    .line 2256
    .line 2257
    monitor-exit v2

    .line 2258
    move v0, v4

    .line 2259
    goto :goto_46

    .line 2260
    :cond_70
    :try_start_16
    invoke-virtual {v2}, Lea/c;->g()Ljava/lang/reflect/Method;

    .line 2261
    .line 2262
    .line 2263
    move-result-object v0

    .line 2264
    if-eqz v0, :cond_71

    .line 2265
    .line 2266
    sget-object v5, Lr8/i;->b:Lr8/i;

    .line 2267
    .line 2268
    new-instance v6, Lb9/e;

    .line 2269
    .line 2270
    const/16 v7, 0xd

    .line 2271
    .line 2272
    invoke-direct {v6, v2, v7}, Lb9/e;-><init>(Ljava/lang/Object;I)V

    .line 2273
    .line 2274
    .line 2275
    invoke-virtual {v5, v0, v6}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 2276
    .line 2277
    .line 2278
    iput-boolean v4, v2, Lea/c;->c:Z

    .line 2279
    .line 2280
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_c

    .line 2281
    .line 2282
    goto :goto_44

    .line 2283
    :catchall_c
    move-exception v0

    .line 2284
    goto :goto_43

    .line 2285
    :cond_71
    monitor-exit v2

    .line 2286
    move v0, v3

    .line 2287
    goto :goto_46

    .line 2288
    :goto_43
    :try_start_17
    new-instance v5, Lsf/f;

    .line 2289
    .line 2290
    invoke-direct {v5, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 2291
    .line 2292
    .line 2293
    move-object v0, v5

    .line 2294
    :goto_44
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 2295
    .line 2296
    .line 2297
    move-result-object v5

    .line 2298
    if-nez v5, :cond_72

    .line 2299
    .line 2300
    goto :goto_45

    .line 2301
    :cond_72
    iget-object v0, v2, Lea/c;->d:Ljava/lang/Object;

    .line 2302
    .line 2303
    check-cast v0, Lia/t;

    .line 2304
    .line 2305
    const-string v6, "\u4f2a\u9020\u8bed\u97f3\u65f6\u957f\u5f55\u97f3\u957f\u5ea6Hook\u5931\u8d25"

    .line 2306
    .line 2307
    invoke-virtual {v0, v6, v5}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2308
    .line 2309
    .line 2310
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2311
    .line 2312
    :goto_45
    check-cast v0, Ljava/lang/Boolean;

    .line 2313
    .line 2314
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2315
    .line 2316
    .line 2317
    move-result v0
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_d

    .line 2318
    monitor-exit v2

    .line 2319
    :goto_46
    if-ne v0, v4, :cond_73

    .line 2320
    .line 2321
    move v3, v4

    .line 2322
    goto :goto_47

    .line 2323
    :catchall_d
    move-exception v0

    .line 2324
    :try_start_18
    monitor-exit v2
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_d

    .line 2325
    throw v0

    .line 2326
    :cond_73
    :goto_47
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2327
    .line 2328
    .line 2329
    move-result-object v0

    .line 2330
    return-object v0

    .line 2331
    :pswitch_1b
    iget-object v0, v1, Li/e0;->h:Ljava/lang/Object;

    .line 2332
    .line 2333
    check-cast v0, Lb9/a;

    .line 2334
    .line 2335
    iget-object v0, v0, Lb9/a;->f:Ljava/lang/Object;

    .line 2336
    .line 2337
    check-cast v0, Lea/c;

    .line 2338
    .line 2339
    if-eqz v0, :cond_74

    .line 2340
    .line 2341
    const/4 v2, 0x1

    .line 2342
    invoke-virtual {v0, v2}, Lea/c;->a(Z)Z

    .line 2343
    .line 2344
    .line 2345
    move-result v0

    .line 2346
    if-ne v0, v2, :cond_74

    .line 2347
    .line 2348
    goto :goto_48

    .line 2349
    :cond_74
    const/4 v2, 0x0

    .line 2350
    :goto_48
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2351
    .line 2352
    .line 2353
    move-result-object v0

    .line 2354
    return-object v0

    .line 2355
    :pswitch_1c
    iget-object v0, v1, Li/e0;->h:Ljava/lang/Object;

    .line 2356
    .line 2357
    check-cast v0, Lqg/t;

    .line 2358
    .line 2359
    invoke-interface {v0}, Lqg/t;->n()Lwf/g;

    .line 2360
    .line 2361
    .line 2362
    move-result-object v0

    .line 2363
    invoke-static {v0}, Li/d;->n(Lwf/g;)F

    .line 2364
    .line 2365
    .line 2366
    move-result v0

    .line 2367
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 2368
    .line 2369
    .line 2370
    move-result-object v0

    .line 2371
    return-object v0

    .line 2372
    nop

    .line 2373
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
