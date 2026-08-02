.class public final Luc2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lib3;


# instance fields
.field public final a:Landroid/app/Application;

.field public final b:Lhb3;

.field public final c:Landroid/os/Bundle;

.field public final d:Lba1;

.field public final e:Lqc2;


# direct methods
.method public constructor <init>(Landroid/app/Application;Ltc2;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-interface {p2}, Ltc2;->getSavedStateRegistry()Lqc2;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Luc2;->e:Lqc2;

    .line 9
    .line 10
    invoke-interface {p2}, Lia1;->getLifecycle()Lba1;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    iput-object p2, p0, Luc2;->d:Lba1;

    .line 15
    .line 16
    iput-object p3, p0, Luc2;->c:Landroid/os/Bundle;

    .line 17
    .line 18
    iput-object p1, p0, Luc2;->a:Landroid/app/Application;

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    sget-object p2, Lhb3;->c:Lhb3;

    .line 23
    .line 24
    if-nez p2, :cond_0

    .line 25
    .line 26
    new-instance p2, Lhb3;

    .line 27
    .line 28
    invoke-direct {p2, p1}, Lhb3;-><init>(Landroid/app/Application;)V

    .line 29
    .line 30
    .line 31
    sput-object p2, Lhb3;->c:Lhb3;

    .line 32
    .line 33
    :cond_0
    sget-object p1, Lhb3;->c:Lhb3;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    new-instance p1, Lhb3;

    .line 40
    .line 41
    const/4 p2, 0x0

    .line 42
    invoke-direct {p1, p2}, Lhb3;-><init>(Landroid/app/Application;)V

    .line 43
    .line 44
    .line 45
    :goto_0
    iput-object p1, p0, Luc2;->b:Lhb3;

    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Lfb3;
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
    invoke-virtual {p0, v0, p1}, Luc2;->d(Ljava/lang/String;Ljava/lang/Class;)Lfb3;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 13
    .line 14
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public final b(Ljava/lang/Class;Lwj1;)Lfb3;
    .locals 4

    .line 1
    sget-object v0, Lp7;->g:Ljx2;

    .line 2
    .line 3
    iget-object v1, p2, Ls20;->a:Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/String;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v0, :cond_5

    .line 13
    .line 14
    sget-object v3, Lup0;->f:Li51;

    .line 15
    .line 16
    invoke-virtual {v1, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    if-eqz v3, :cond_3

    .line 21
    .line 22
    sget-object v3, Lup0;->g:Lj51;

    .line 23
    .line 24
    invoke-virtual {v1, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    if-eqz v3, :cond_3

    .line 29
    .line 30
    sget-object v0, Lhb3;->d:Lix2;

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Landroid/app/Application;

    .line 37
    .line 38
    const-class v1, Ljc;

    .line 39
    .line 40
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    sget-object v2, Lvc2;->a:Ljava/util/List;

    .line 49
    .line 50
    invoke-static {p1, v2}, Lvc2;->a(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    sget-object v2, Lvc2;->b:Ljava/util/List;

    .line 56
    .line 57
    invoke-static {p1, v2}, Lvc2;->a(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    :goto_0
    if-nez v2, :cond_1

    .line 62
    .line 63
    iget-object p0, p0, Luc2;->b:Lhb3;

    .line 64
    .line 65
    invoke-virtual {p0, p1, p2}, Lhb3;->b(Ljava/lang/Class;Lwj1;)Lfb3;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0

    .line 70
    :cond_1
    if-eqz v1, :cond_2

    .line 71
    .line 72
    if-eqz v0, :cond_2

    .line 73
    .line 74
    invoke-static {p2}, Lup0;->q(Lwj1;)Ljc2;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    filled-new-array {v0, p0}, [Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-static {p1, v2, p0}, Lvc2;->b(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Lfb3;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0

    .line 87
    :cond_2
    invoke-static {p2}, Lup0;->q(Lwj1;)Ljc2;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-static {p1, v2, p0}, Lvc2;->b(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Lfb3;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    return-object p0

    .line 100
    :cond_3
    iget-object p2, p0, Luc2;->d:Lba1;

    .line 101
    .line 102
    if-eqz p2, :cond_4

    .line 103
    .line 104
    invoke-virtual {p0, v0, p1}, Luc2;->d(Ljava/lang/String;Ljava/lang/Class;)Lfb3;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    return-object p0

    .line 109
    :cond_4
    const-string p0, "SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel."

    .line 110
    .line 111
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    return-object v2

    .line 115
    :cond_5
    const-string p0, "VIEW_MODEL_KEY must always be provided by ViewModelProvider"

    .line 116
    .line 117
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    return-object v2
.end method

.method public final c(Lbt;Lwj1;)Lfb3;
    .locals 0

    .line 1
    invoke-static {p1}, Lp40;->y(Lbt;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1, p2}, Luc2;->b(Ljava/lang/Class;Lwj1;)Lfb3;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final d(Ljava/lang/String;Ljava/lang/Class;)Lfb3;
    .locals 7

    .line 1
    iget-object v0, p0, Luc2;->d:Lba1;

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    const-class v1, Ljc;

    .line 6
    .line 7
    invoke-virtual {v1, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object v2, p0, Luc2;->a:Landroid/app/Application;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    sget-object v2, Lvc2;->a:Ljava/util/List;

    .line 18
    .line 19
    invoke-static {p2, v2}, Lvc2;->a(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    sget-object v2, Lvc2;->b:Ljava/util/List;

    .line 25
    .line 26
    invoke-static {p2, v2}, Lvc2;->a(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    :goto_0
    if-nez v2, :cond_3

    .line 31
    .line 32
    iget-object p1, p0, Luc2;->a:Landroid/app/Application;

    .line 33
    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    iget-object p0, p0, Luc2;->b:Lhb3;

    .line 37
    .line 38
    invoke-virtual {p0, p2}, Lhb3;->a(Ljava/lang/Class;)Lfb3;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :cond_1
    sget-object p0, Ljb3;->a:Ljb3;

    .line 44
    .line 45
    if-nez p0, :cond_2

    .line 46
    .line 47
    new-instance p0, Ljb3;

    .line 48
    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    .line 51
    .line 52
    sput-object p0, Ljb3;->a:Ljb3;

    .line 53
    .line 54
    :cond_2
    sget-object p0, Ljb3;->a:Ljb3;

    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-static {p2}, Lci0;->G(Ljava/lang/Class;)Lfb3;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0

    .line 64
    :cond_3
    iget-object v3, p0, Luc2;->e:Lqc2;

    .line 65
    .line 66
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    iget-object v4, p0, Luc2;->c:Landroid/os/Bundle;

    .line 70
    .line 71
    invoke-virtual {v3, p1}, Lqc2;->a(Ljava/lang/String;)Landroid/os/Bundle;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    invoke-static {v5, v4}, Lp40;->o(Landroid/os/Bundle;Landroid/os/Bundle;)Ljc2;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    new-instance v5, Lkc2;

    .line 80
    .line 81
    invoke-direct {v5, p1, v4}, Lkc2;-><init>(Ljava/lang/String;Ljc2;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v5, v0, v3}, Lkc2;->h(Lba1;Lqc2;)V

    .line 85
    .line 86
    .line 87
    move-object p1, v0

    .line 88
    check-cast p1, Lla1;

    .line 89
    .line 90
    iget-object p1, p1, Lla1;->h:Laa1;

    .line 91
    .line 92
    sget-object v6, Laa1;->i:Laa1;

    .line 93
    .line 94
    if-eq p1, v6, :cond_5

    .line 95
    .line 96
    sget-object v6, Laa1;->k:Laa1;

    .line 97
    .line 98
    invoke-virtual {p1, v6}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-ltz p1, :cond_4

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_4
    new-instance p1, Ly50;

    .line 106
    .line 107
    invoke-direct {p1, v0, v3}, Ly50;-><init>(Lba1;Lqc2;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, p1}, Lba1;->a(Lha1;)V

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_5
    :goto_1
    invoke-virtual {v3}, Lqc2;->d()V

    .line 115
    .line 116
    .line 117
    :goto_2
    if-eqz v1, :cond_6

    .line 118
    .line 119
    iget-object p0, p0, Luc2;->a:Landroid/app/Application;

    .line 120
    .line 121
    if-eqz p0, :cond_6

    .line 122
    .line 123
    filled-new-array {p0, v4}, [Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-static {p2, v2, p0}, Lvc2;->b(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Lfb3;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    goto :goto_3

    .line 132
    :cond_6
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-static {p2, v2, p0}, Lvc2;->b(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Lfb3;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    :goto_3
    const-string p1, "androidx.lifecycle.savedstate.vm.tag"

    .line 141
    .line 142
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    iget-object p2, p0, Lfb3;->a:Lgb3;

    .line 146
    .line 147
    if-eqz p2, :cond_8

    .line 148
    .line 149
    iget-boolean v0, p2, Lgb3;->d:Z

    .line 150
    .line 151
    if-eqz v0, :cond_7

    .line 152
    .line 153
    invoke-static {v5}, Lgb3;->a(Ljava/lang/AutoCloseable;)V

    .line 154
    .line 155
    .line 156
    return-object p0

    .line 157
    :cond_7
    iget-object v0, p2, Lgb3;->a:Lix2;

    .line 158
    .line 159
    monitor-enter v0

    .line 160
    :try_start_0
    iget-object p2, p2, Lgb3;->b:Ljava/util/LinkedHashMap;

    .line 161
    .line 162
    invoke-interface {p2, p1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    check-cast p1, Ljava/lang/AutoCloseable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 167
    .line 168
    monitor-exit v0

    .line 169
    invoke-static {p1}, Lgb3;->a(Ljava/lang/AutoCloseable;)V

    .line 170
    .line 171
    .line 172
    return-object p0

    .line 173
    :catchall_0
    move-exception p0

    .line 174
    monitor-exit v0

    .line 175
    throw p0

    .line 176
    :cond_8
    return-object p0

    .line 177
    :cond_9
    const-string p0, "SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras)."

    .line 178
    .line 179
    invoke-static {p0}, Lc80;->t(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    const/4 p0, 0x0

    .line 183
    return-object p0
.end method
