.class public abstract Landroidx/lifecycle/G;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroidx/lifecycle/M;

.field public static final b:Landroidx/lifecycle/M;

.field public static final c:Landroidx/lifecycle/M;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/lifecycle/M;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/lifecycle/G;->a:Landroidx/lifecycle/M;

    .line 7
    .line 8
    new-instance v0, Landroidx/lifecycle/M;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Landroidx/lifecycle/G;->b:Landroidx/lifecycle/M;

    .line 14
    .line 15
    new-instance v0, Landroidx/lifecycle/M;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Landroidx/lifecycle/G;->c:Landroidx/lifecycle/M;

    .line 21
    .line 22
    return-void
.end method

.method public static final a(Landroidx/lifecycle/L;LM/d;Landroidx/lifecycle/u;)V
    .locals 2

    .line 1
    const-string v0, "registry"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "lifecycle"

    .line 7
    .line 8
    invoke-static {p2, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "androidx.lifecycle.savedstate.vm.tag"

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/lifecycle/L;->a:Ljava/util/HashMap;

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    monitor-enter v1

    .line 20
    :try_start_0
    iget-object p0, p0, Landroidx/lifecycle/L;->a:Ljava/util/HashMap;

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    :goto_0
    check-cast p0, Landroidx/lifecycle/SavedStateHandleController;

    .line 28
    .line 29
    if-eqz p0, :cond_3

    .line 30
    .line 31
    iget-boolean v0, p0, Landroidx/lifecycle/SavedStateHandleController;->c:Z

    .line 32
    .line 33
    if-nez v0, :cond_3

    .line 34
    .line 35
    invoke-virtual {p0, p1, p2}, Landroidx/lifecycle/SavedStateHandleController;->d(LM/d;Landroidx/lifecycle/u;)V

    .line 36
    .line 37
    .line 38
    iget-object p0, p2, Landroidx/lifecycle/u;->c:Landroidx/lifecycle/n;

    .line 39
    .line 40
    sget-object v0, Landroidx/lifecycle/n;->b:Landroidx/lifecycle/n;

    .line 41
    .line 42
    if-eq p0, v0, :cond_2

    .line 43
    .line 44
    sget-object v0, Landroidx/lifecycle/n;->d:Landroidx/lifecycle/n;

    .line 45
    .line 46
    invoke-virtual {p0, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-ltz p0, :cond_1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    new-instance p0, Landroidx/lifecycle/LegacySavedStateHandleController$tryToAddRecreator$1;

    .line 54
    .line 55
    invoke-direct {p0, p1, p2}, Landroidx/lifecycle/LegacySavedStateHandleController$tryToAddRecreator$1;-><init>(LM/d;Landroidx/lifecycle/u;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2, p0}, Landroidx/lifecycle/u;->a(Landroidx/lifecycle/r;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_2
    :goto_1
    invoke-virtual {p1}, LM/d;->g()V

    .line 63
    .line 64
    .line 65
    :cond_3
    return-void

    .line 66
    :catchall_0
    move-exception p0

    .line 67
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    throw p0
.end method

.method public static b(Landroid/os/Bundle;Landroid/os/Bundle;)Landroidx/lifecycle/F;
    .locals 5

    .line 1
    if-nez p0, :cond_2

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    new-instance p0, Landroidx/lifecycle/F;

    .line 6
    .line 7
    invoke-direct {p0}, Landroidx/lifecycle/F;-><init>()V

    .line 8
    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    new-instance p0, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Ljava/lang/String;

    .line 35
    .line 36
    const-string v2, "key"

    .line 37
    .line 38
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {p0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    new-instance p1, Landroidx/lifecycle/F;

    .line 50
    .line 51
    invoke-direct {p1, p0}, Landroidx/lifecycle/F;-><init>(Ljava/util/HashMap;)V

    .line 52
    .line 53
    .line 54
    return-object p1

    .line 55
    :cond_2
    const-string p1, "keys"

    .line 56
    .line 57
    invoke-virtual {p0, p1}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    const-string v0, "values"

    .line 62
    .line 63
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    if-eqz p1, :cond_4

    .line 68
    .line 69
    if-eqz p0, :cond_4

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-ne v0, v1, :cond_4

    .line 80
    .line 81
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 82
    .line 83
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    const/4 v2, 0x0

    .line 91
    :goto_1
    if-ge v2, v1, :cond_3

    .line 92
    .line 93
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    const-string v4, "null cannot be cast to non-null type kotlin.String"

    .line 98
    .line 99
    invoke-static {v3, v4}, LN0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    check-cast v3, Ljava/lang/String;

    .line 103
    .line 104
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    add-int/lit8 v2, v2, 0x1

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_3
    new-instance p0, Landroidx/lifecycle/F;

    .line 115
    .line 116
    invoke-direct {p0, v0}, Landroidx/lifecycle/F;-><init>(Ljava/util/HashMap;)V

    .line 117
    .line 118
    .line 119
    return-object p0

    .line 120
    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 121
    .line 122
    const-string p1, "Invalid bundle passed as restored state"

    .line 123
    .line 124
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw p0
.end method

.method public static final c(LJ/c;)Landroidx/lifecycle/F;
    .locals 7

    .line 1
    sget-object v0, Landroidx/lifecycle/G;->a:Landroidx/lifecycle/M;

    .line 2
    .line 3
    iget-object p0, p0, LJ/b;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, LM/f;

    .line 12
    .line 13
    if-eqz v0, :cond_8

    .line 14
    .line 15
    sget-object v1, Landroidx/lifecycle/G;->b:Landroidx/lifecycle/M;

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Landroidx/lifecycle/Q;

    .line 22
    .line 23
    if-eqz v1, :cond_7

    .line 24
    .line 25
    sget-object v2, Landroidx/lifecycle/G;->c:Landroidx/lifecycle/M;

    .line 26
    .line 27
    invoke-virtual {p0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Landroid/os/Bundle;

    .line 32
    .line 33
    sget-object v3, Landroidx/lifecycle/M;->c:Landroidx/lifecycle/M;

    .line 34
    .line 35
    invoke-virtual {p0, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, Ljava/lang/String;

    .line 40
    .line 41
    if-eqz p0, :cond_6

    .line 42
    .line 43
    invoke-interface {v0}, LM/f;->b()LM/d;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, LM/d;->d()LM/c;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    instance-of v3, v0, Landroidx/lifecycle/H;

    .line 52
    .line 53
    const/4 v4, 0x0

    .line 54
    if-eqz v3, :cond_0

    .line 55
    .line 56
    check-cast v0, Landroidx/lifecycle/H;

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    move-object v0, v4

    .line 60
    :goto_0
    if-eqz v0, :cond_5

    .line 61
    .line 62
    invoke-static {v1}, Landroidx/lifecycle/G;->d(Landroidx/lifecycle/Q;)Landroidx/lifecycle/I;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    iget-object v1, v1, Landroidx/lifecycle/I;->d:Ljava/util/LinkedHashMap;

    .line 67
    .line 68
    invoke-virtual {v1, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    check-cast v3, Landroidx/lifecycle/F;

    .line 73
    .line 74
    if-nez v3, :cond_4

    .line 75
    .line 76
    sget-object v3, Landroidx/lifecycle/F;->f:[Ljava/lang/Class;

    .line 77
    .line 78
    invoke-virtual {v0}, Landroidx/lifecycle/H;->b()V

    .line 79
    .line 80
    .line 81
    iget-object v3, v0, Landroidx/lifecycle/H;->c:Landroid/os/Bundle;

    .line 82
    .line 83
    if-eqz v3, :cond_1

    .line 84
    .line 85
    invoke-virtual {v3, p0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    goto :goto_1

    .line 90
    :cond_1
    move-object v3, v4

    .line 91
    :goto_1
    iget-object v5, v0, Landroidx/lifecycle/H;->c:Landroid/os/Bundle;

    .line 92
    .line 93
    if-eqz v5, :cond_2

    .line 94
    .line 95
    invoke-virtual {v5, p0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    :cond_2
    iget-object v5, v0, Landroidx/lifecycle/H;->c:Landroid/os/Bundle;

    .line 99
    .line 100
    if-eqz v5, :cond_3

    .line 101
    .line 102
    invoke-virtual {v5}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    const/4 v6, 0x1

    .line 107
    if-ne v5, v6, :cond_3

    .line 108
    .line 109
    iput-object v4, v0, Landroidx/lifecycle/H;->c:Landroid/os/Bundle;

    .line 110
    .line 111
    :cond_3
    invoke-static {v3, v2}, Landroidx/lifecycle/G;->b(Landroid/os/Bundle;Landroid/os/Bundle;)Landroidx/lifecycle/F;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-interface {v1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    return-object v0

    .line 119
    :cond_4
    return-object v3

    .line 120
    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 121
    .line 122
    const-string v0, "enableSavedStateHandles() wasn\'t called prior to createSavedStateHandle() call"

    .line 123
    .line 124
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw p0

    .line 128
    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 129
    .line 130
    const-string v0, "CreationExtras must have a value by `VIEW_MODEL_KEY`"

    .line 131
    .line 132
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw p0

    .line 136
    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 137
    .line 138
    const-string v0, "CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`"

    .line 139
    .line 140
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    throw p0

    .line 144
    :cond_8
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 145
    .line 146
    const-string v0, "CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`"

    .line 147
    .line 148
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    throw p0
.end method

.method public static final d(Landroidx/lifecycle/Q;)Landroidx/lifecycle/I;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, LN0/m;->a:LN0/n;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v1, LN0/d;

    .line 12
    .line 13
    const-class v2, Landroidx/lifecycle/I;

    .line 14
    .line 15
    invoke-direct {v1, v2}, LN0/d;-><init>(Ljava/lang/Class;)V

    .line 16
    .line 17
    .line 18
    new-instance v3, LJ/d;

    .line 19
    .line 20
    invoke-interface {v1}, LN0/c;->a()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const-string v4, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>"

    .line 25
    .line 26
    invoke-static {v1, v4}, LN0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {v3, v1}, LJ/d;-><init>(Ljava/lang/Class;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    new-instance v1, LC/j;

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    new-array v3, v3, [LJ/d;

    .line 39
    .line 40
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, [LJ/d;

    .line 45
    .line 46
    array-length v3, v0

    .line 47
    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, [LJ/d;

    .line 52
    .line 53
    invoke-direct {v1, v0}, LC/j;-><init>([LJ/d;)V

    .line 54
    .line 55
    .line 56
    new-instance v0, LC/h;

    .line 57
    .line 58
    invoke-interface {p0}, Landroidx/lifecycle/Q;->getViewModelStore()Landroidx/lifecycle/P;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    instance-of v4, p0, Landroidx/lifecycle/i;

    .line 63
    .line 64
    if-eqz v4, :cond_0

    .line 65
    .line 66
    check-cast p0, Landroidx/lifecycle/i;

    .line 67
    .line 68
    invoke-interface {p0}, Landroidx/lifecycle/i;->a()LJ/b;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    goto :goto_0

    .line 73
    :cond_0
    sget-object p0, LJ/a;->b:LJ/a;

    .line 74
    .line 75
    :goto_0
    invoke-direct {v0, v3, v1, p0}, LC/h;-><init>(Landroidx/lifecycle/P;Landroidx/lifecycle/O;LJ/b;)V

    .line 76
    .line 77
    .line 78
    const-string p0, "androidx.lifecycle.internal.SavedStateHandlesVM"

    .line 79
    .line 80
    invoke-virtual {v0, v2, p0}, LC/h;->j(Ljava/lang/Class;Ljava/lang/String;)Landroidx/lifecycle/L;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    check-cast p0, Landroidx/lifecycle/I;

    .line 85
    .line 86
    return-object p0
.end method
