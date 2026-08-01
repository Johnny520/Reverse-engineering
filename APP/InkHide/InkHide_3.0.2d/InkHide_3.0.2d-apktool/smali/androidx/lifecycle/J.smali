.class public final Landroidx/lifecycle/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/O;


# instance fields
.field public final b:Landroid/app/Application;

.field public final c:Landroidx/lifecycle/N;

.field public final d:Landroid/os/Bundle;

.field public final e:Landroidx/lifecycle/u;

.field public final f:LM/d;


# direct methods
.method public constructor <init>(Landroid/app/Application;LM/f;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-interface {p2}, LM/f;->b()LM/d;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Landroidx/lifecycle/J;->f:LM/d;

    .line 9
    .line 10
    invoke-interface {p2}, Landroidx/lifecycle/s;->c()Landroidx/lifecycle/u;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    iput-object p2, p0, Landroidx/lifecycle/J;->e:Landroidx/lifecycle/u;

    .line 15
    .line 16
    iput-object p3, p0, Landroidx/lifecycle/J;->d:Landroid/os/Bundle;

    .line 17
    .line 18
    iput-object p1, p0, Landroidx/lifecycle/J;->b:Landroid/app/Application;

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    sget-object p2, Landroidx/lifecycle/N;->f:Landroidx/lifecycle/N;

    .line 23
    .line 24
    if-nez p2, :cond_0

    .line 25
    .line 26
    new-instance p2, Landroidx/lifecycle/N;

    .line 27
    .line 28
    invoke-direct {p2, p1}, Landroidx/lifecycle/N;-><init>(Landroid/app/Application;)V

    .line 29
    .line 30
    .line 31
    sput-object p2, Landroidx/lifecycle/N;->f:Landroidx/lifecycle/N;

    .line 32
    .line 33
    :cond_0
    sget-object p1, Landroidx/lifecycle/N;->f:Landroidx/lifecycle/N;

    .line 34
    .line 35
    invoke-static {p1}, LN0/g;->b(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    new-instance p1, Landroidx/lifecycle/N;

    .line 40
    .line 41
    const/4 p2, 0x0

    .line 42
    invoke-direct {p1, p2}, Landroidx/lifecycle/N;-><init>(Landroid/app/Application;)V

    .line 43
    .line 44
    .line 45
    :goto_0
    iput-object p1, p0, Landroidx/lifecycle/J;->c:Landroidx/lifecycle/N;

    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;Ljava/lang/String;)Landroidx/lifecycle/L;
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/J;->e:Landroidx/lifecycle/u;

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    const-class v1, Landroidx/lifecycle/a;

    .line 6
    .line 7
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object v2, p0, Landroidx/lifecycle/J;->b:Landroid/app/Application;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    sget-object v2, Landroidx/lifecycle/K;->a:Ljava/util/List;

    .line 18
    .line 19
    invoke-static {p1, v2}, Landroidx/lifecycle/K;->a(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    sget-object v2, Landroidx/lifecycle/K;->b:Ljava/util/List;

    .line 25
    .line 26
    invoke-static {p1, v2}, Landroidx/lifecycle/K;->a(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    :goto_0
    if-nez v2, :cond_3

    .line 31
    .line 32
    iget-object p2, p0, Landroidx/lifecycle/J;->b:Landroid/app/Application;

    .line 33
    .line 34
    if-eqz p2, :cond_1

    .line 35
    .line 36
    iget-object p2, p0, Landroidx/lifecycle/J;->c:Landroidx/lifecycle/N;

    .line 37
    .line 38
    invoke-virtual {p2, p1}, Landroidx/lifecycle/N;->e(Ljava/lang/Class;)Landroidx/lifecycle/L;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1

    .line 43
    :cond_1
    sget-object p2, Landroidx/lifecycle/M;->d:Landroidx/lifecycle/M;

    .line 44
    .line 45
    if-nez p2, :cond_2

    .line 46
    .line 47
    new-instance p2, Landroidx/lifecycle/M;

    .line 48
    .line 49
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 50
    .line 51
    .line 52
    sput-object p2, Landroidx/lifecycle/M;->d:Landroidx/lifecycle/M;

    .line 53
    .line 54
    :cond_2
    sget-object p2, Landroidx/lifecycle/M;->d:Landroidx/lifecycle/M;

    .line 55
    .line 56
    invoke-static {p2}, LN0/g;->b(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2, p1}, Landroidx/lifecycle/M;->e(Ljava/lang/Class;)Landroidx/lifecycle/L;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    return-object p1

    .line 64
    :cond_3
    iget-object v3, p0, Landroidx/lifecycle/J;->f:LM/d;

    .line 65
    .line 66
    invoke-static {v3}, LN0/g;->b(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object v4, p0, Landroidx/lifecycle/J;->d:Landroid/os/Bundle;

    .line 70
    .line 71
    invoke-virtual {v3, p2}, LM/d;->c(Ljava/lang/String;)Landroid/os/Bundle;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    sget-object v6, Landroidx/lifecycle/F;->f:[Ljava/lang/Class;

    .line 76
    .line 77
    invoke-static {v5, v4}, Landroidx/lifecycle/G;->b(Landroid/os/Bundle;Landroid/os/Bundle;)Landroidx/lifecycle/F;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    new-instance v5, Landroidx/lifecycle/SavedStateHandleController;

    .line 82
    .line 83
    invoke-direct {v5, p2, v4}, Landroidx/lifecycle/SavedStateHandleController;-><init>(Ljava/lang/String;Landroidx/lifecycle/F;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v5, v3, v0}, Landroidx/lifecycle/SavedStateHandleController;->d(LM/d;Landroidx/lifecycle/u;)V

    .line 87
    .line 88
    .line 89
    iget-object p2, v0, Landroidx/lifecycle/u;->c:Landroidx/lifecycle/n;

    .line 90
    .line 91
    sget-object v6, Landroidx/lifecycle/n;->b:Landroidx/lifecycle/n;

    .line 92
    .line 93
    if-eq p2, v6, :cond_5

    .line 94
    .line 95
    sget-object v6, Landroidx/lifecycle/n;->d:Landroidx/lifecycle/n;

    .line 96
    .line 97
    invoke-virtual {p2, v6}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 98
    .line 99
    .line 100
    move-result p2

    .line 101
    if-ltz p2, :cond_4

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_4
    new-instance p2, Landroidx/lifecycle/LegacySavedStateHandleController$tryToAddRecreator$1;

    .line 105
    .line 106
    invoke-direct {p2, v3, v0}, Landroidx/lifecycle/LegacySavedStateHandleController$tryToAddRecreator$1;-><init>(LM/d;Landroidx/lifecycle/u;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, p2}, Landroidx/lifecycle/u;->a(Landroidx/lifecycle/r;)V

    .line 110
    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_5
    :goto_1
    invoke-virtual {v3}, LM/d;->g()V

    .line 114
    .line 115
    .line 116
    :goto_2
    if-eqz v1, :cond_6

    .line 117
    .line 118
    iget-object p2, p0, Landroidx/lifecycle/J;->b:Landroid/app/Application;

    .line 119
    .line 120
    if-eqz p2, :cond_6

    .line 121
    .line 122
    filled-new-array {p2, v4}, [Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    invoke-static {p1, v2, p2}, Landroidx/lifecycle/K;->b(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Landroidx/lifecycle/L;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    goto :goto_3

    .line 131
    :cond_6
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    invoke-static {p1, v2, p2}, Landroidx/lifecycle/K;->b(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Landroidx/lifecycle/L;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    :goto_3
    const-string p2, "androidx.lifecycle.savedstate.vm.tag"

    .line 140
    .line 141
    iget-object v0, p1, Landroidx/lifecycle/L;->a:Ljava/util/HashMap;

    .line 142
    .line 143
    monitor-enter v0

    .line 144
    :try_start_0
    iget-object v1, p1, Landroidx/lifecycle/L;->a:Ljava/util/HashMap;

    .line 145
    .line 146
    invoke-virtual {v1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    if-nez v1, :cond_7

    .line 151
    .line 152
    iget-object v2, p1, Landroidx/lifecycle/L;->a:Ljava/util/HashMap;

    .line 153
    .line 154
    invoke-virtual {v2, p2, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    goto :goto_4

    .line 158
    :catchall_0
    move-exception p1

    .line 159
    goto :goto_6

    .line 160
    :cond_7
    :goto_4
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 161
    if-nez v1, :cond_8

    .line 162
    .line 163
    goto :goto_5

    .line 164
    :cond_8
    move-object v5, v1

    .line 165
    :goto_5
    iget-boolean p2, p1, Landroidx/lifecycle/L;->c:Z

    .line 166
    .line 167
    if-eqz p2, :cond_9

    .line 168
    .line 169
    invoke-static {v5}, Landroidx/lifecycle/L;->a(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    :cond_9
    return-object p1

    .line 173
    :goto_6
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 174
    throw p1

    .line 175
    :cond_a
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 176
    .line 177
    const-string p2, "SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras)."

    .line 178
    .line 179
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    throw p1
.end method

.method public final e(Ljava/lang/Class;)Landroidx/lifecycle/L;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1, v0}, Landroidx/lifecycle/J;->a(Ljava/lang/Class;Ljava/lang/String;)Landroidx/lifecycle/L;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 13
    .line 14
    const-string v0, "Local and anonymous classes can not be ViewModels"

    .line 15
    .line 16
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p1
.end method

.method public final h(Ljava/lang/Class;LJ/c;)Landroidx/lifecycle/L;
    .locals 3

    .line 1
    sget-object v0, Landroidx/lifecycle/M;->c:Landroidx/lifecycle/M;

    .line 2
    .line 3
    iget-object v1, p2, LJ/b;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/String;

    .line 12
    .line 13
    if-eqz v0, :cond_5

    .line 14
    .line 15
    sget-object v2, Landroidx/lifecycle/G;->a:Landroidx/lifecycle/M;

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    if-eqz v2, :cond_3

    .line 22
    .line 23
    sget-object v2, Landroidx/lifecycle/G;->b:Landroidx/lifecycle/M;

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    if-eqz v2, :cond_3

    .line 30
    .line 31
    sget-object v0, Landroidx/lifecycle/M;->b:Landroidx/lifecycle/M;

    .line 32
    .line 33
    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Landroid/app/Application;

    .line 38
    .line 39
    const-class v1, Landroidx/lifecycle/a;

    .line 40
    .line 41
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_0

    .line 46
    .line 47
    if-eqz v0, :cond_0

    .line 48
    .line 49
    sget-object v2, Landroidx/lifecycle/K;->a:Ljava/util/List;

    .line 50
    .line 51
    invoke-static {p1, v2}, Landroidx/lifecycle/K;->a(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    sget-object v2, Landroidx/lifecycle/K;->b:Ljava/util/List;

    .line 57
    .line 58
    invoke-static {p1, v2}, Landroidx/lifecycle/K;->a(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    :goto_0
    if-nez v2, :cond_1

    .line 63
    .line 64
    iget-object v0, p0, Landroidx/lifecycle/J;->c:Landroidx/lifecycle/N;

    .line 65
    .line 66
    invoke-virtual {v0, p1, p2}, Landroidx/lifecycle/N;->h(Ljava/lang/Class;LJ/c;)Landroidx/lifecycle/L;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    return-object p1

    .line 71
    :cond_1
    if-eqz v1, :cond_2

    .line 72
    .line 73
    if-eqz v0, :cond_2

    .line 74
    .line 75
    invoke-static {p2}, Landroidx/lifecycle/G;->c(LJ/c;)Landroidx/lifecycle/F;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    filled-new-array {v0, p2}, [Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    invoke-static {p1, v2, p2}, Landroidx/lifecycle/K;->b(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Landroidx/lifecycle/L;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    return-object p1

    .line 88
    :cond_2
    invoke-static {p2}, Landroidx/lifecycle/G;->c(LJ/c;)Landroidx/lifecycle/F;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    invoke-static {p1, v2, p2}, Landroidx/lifecycle/K;->b(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Landroidx/lifecycle/L;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    return-object p1

    .line 101
    :cond_3
    iget-object p2, p0, Landroidx/lifecycle/J;->e:Landroidx/lifecycle/u;

    .line 102
    .line 103
    if-eqz p2, :cond_4

    .line 104
    .line 105
    invoke-virtual {p0, p1, v0}, Landroidx/lifecycle/J;->a(Ljava/lang/Class;Ljava/lang/String;)Landroidx/lifecycle/L;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    return-object p1

    .line 110
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 111
    .line 112
    const-string p2, "SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel."

    .line 113
    .line 114
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw p1

    .line 118
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 119
    .line 120
    const-string p2, "VIEW_MODEL_KEY must always be provided by ViewModelProvider"

    .line 121
    .line 122
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw p1
.end method
