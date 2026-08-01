.class public final Lr0/r1;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lr0/t1;

.field public final synthetic b:Ljava/lang/reflect/Method;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lr0/t1;Ljava/lang/reflect/Method;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr0/r1;->a:Lr0/t1;

    .line 2
    .line 3
    iput-object p2, p0, Lr0/r1;->b:Ljava/lang/reflect/Method;

    .line 4
    .line 5
    iput-object p3, p0, Lr0/r1;->c:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 6

    .line 1
    const-string v0, "param"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr0/r1;->a:Lr0/t1;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lr0/t1;->A()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_5

    .line 16
    .line 17
    iget-object v0, p0, Lr0/r1;->a:Lr0/t1;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {}, Lr0/t1;->n()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_5

    .line 27
    .line 28
    iget-object v0, p0, Lr0/r1;->a:Lr0/t1;

    .line 29
    .line 30
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 31
    .line 32
    iget-object v1, p0, Lr0/r1;->c:Ljava/lang/String;

    .line 33
    .line 34
    if-nez p1, :cond_0

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    iget-object v2, v0, Lr0/t1;->v:Ljava/util/ArrayList;

    .line 41
    .line 42
    monitor-enter v2

    .line 43
    :try_start_0
    iget-object v3, v0, Lr0/t1;->v:Ljava/util/ArrayList;

    .line 44
    .line 45
    new-instance v4, Lr0/n1;

    .line 46
    .line 47
    const/4 v5, 0x1

    .line 48
    invoke-direct {v4, v5}, Lr0/n1;-><init>(I)V

    .line 49
    .line 50
    .line 51
    invoke-static {v3, v4}, LF0/q;->g0(Ljava/util/ArrayList;LM0/l;)V

    .line 52
    .line 53
    .line 54
    iget-object v3, v0, Lr0/t1;->v:Ljava/util/ArrayList;

    .line 55
    .line 56
    if-eqz v3, :cond_1

    .line 57
    .line 58
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-eqz v4, :cond_1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :catchall_0
    move-exception p1

    .line 66
    goto :goto_1

    .line 67
    :cond_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-eqz v4, :cond_3

    .line 76
    .line 77
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    check-cast v4, Ljava/lang/ref/WeakReference;

    .line 82
    .line 83
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    if-ne v4, p1, :cond_2

    .line 88
    .line 89
    monitor-exit v2

    .line 90
    return-void

    .line 91
    :cond_3
    :goto_0
    :try_start_1
    iget-object v3, v0, Lr0/t1;->v:Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    const/16 v4, 0xc

    .line 98
    .line 99
    if-lt v3, v4, :cond_4

    .line 100
    .line 101
    iget-object v3, v0, Lr0/t1;->v:Ljava/util/ArrayList;

    .line 102
    .line 103
    const/4 v4, 0x0

    .line 104
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    :cond_4
    iget-object v0, v0, Lr0/t1;->v:Ljava/util/ArrayList;

    .line 108
    .line 109
    new-instance v3, Ljava/lang/ref/WeakReference;

    .line 110
    .line 111
    invoke-direct {v3, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 115
    .line 116
    .line 117
    monitor-exit v2

    .line 118
    const-string v0, "track voip audio"

    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-static {}, Lr0/t1;->d0()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    filled-new-array {v0, v1, p1, v2}, [Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-static {p1}, Li0/a;->a([Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :goto_1
    monitor-exit v2

    .line 141
    throw p1

    .line 142
    :cond_5
    return-void
.end method

.method public final beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 10

    .line 1
    const-string v0, "param"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr0/r1;->a:Lr0/t1;

    .line 7
    .line 8
    iget-object v1, v0, Lr0/t1;->t:Ljava/lang/ThreadLocal;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-static {v1, v2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    iget-object v3, p0, Lr0/r1;->c:Ljava/lang/String;

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    const-string v1, "vibrator"

    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    invoke-static {v3, v1, v2}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    goto/16 :goto_2

    .line 34
    .line 35
    :cond_0
    invoke-static {}, Lr0/t1;->A()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_5

    .line 40
    .line 41
    sget-boolean v1, Lz0/i;->a:Z

    .line 42
    .line 43
    invoke-static {}, Lz0/g;->i()Ljava/util/ArrayList;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_1

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_1
    const/4 v1, 0x0

    .line 55
    invoke-virtual {v0, v1}, Lr0/t1;->R(Ljava/lang/String;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_2

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_2
    invoke-virtual {v0}, Lr0/t1;->T()Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-eqz v2, :cond_3

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    invoke-virtual {v0}, Lr0/t1;->S()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    if-eqz v2, :cond_5

    .line 74
    .line 75
    invoke-static {}, Lr0/t1;->n()Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_5

    .line 80
    .line 81
    :goto_0
    invoke-virtual {v0}, Lr0/t1;->S()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v8

    .line 85
    iget-object v9, p0, Lr0/r1;->b:Ljava/lang/reflect/Method;

    .line 86
    .line 87
    invoke-static {v9}, Lr0/t1;->P(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    if-nez v8, :cond_4

    .line 92
    .line 93
    const-string v2, "unknown"

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_4
    move-object v2, v8

    .line 97
    :goto_1
    const-string v5, "masked="

    .line 98
    .line 99
    invoke-virtual {v5, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    invoke-virtual {v0}, Lr0/t1;->T()Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    const-string v6, "suppressed="

    .line 108
    .line 109
    invoke-static {v6, v2}, LL/d;->k(Ljava/lang/String;Z)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    invoke-static {}, Lr0/t1;->d0()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v7

    .line 117
    const-string v2, "block voip audio"

    .line 118
    .line 119
    filled-new-array/range {v2 .. v7}, [Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-static {v2}, Li0/a;->a([Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    const-string v2, "audio:"

    .line 127
    .line 128
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    invoke-virtual {v0, v2, v8}, Lr0/t1;->O(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 136
    .line 137
    invoke-static {v0}, Lr0/t1;->a0(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    invoke-static {p1, v9, v1}, Lr0/t1;->g(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Ljava/lang/reflect/Method;Ljava/lang/Integer;)V

    .line 141
    .line 142
    .line 143
    :cond_5
    :goto_2
    return-void
.end method
