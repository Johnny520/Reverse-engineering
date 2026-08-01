.class public Lio/github/libxposed/service/RemotePreferences$Editor;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/content/SharedPreferences$Editor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/github/libxposed/service/RemotePreferences;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "Editor"
.end annotation


# instance fields
.field private mClear:Z

.field private final mDelete:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final mPut:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lio/github/libxposed/service/RemotePreferences;


# direct methods
.method public constructor <init>(Lio/github/libxposed/service/RemotePreferences;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/github/libxposed/service/RemotePreferences$Editor;->this$0:Lio/github/libxposed/service/RemotePreferences;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/util/HashSet;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lio/github/libxposed/service/RemotePreferences$Editor;->mDelete:Ljava/util/HashSet;

    .line 12
    .line 13
    new-instance p1, Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lio/github/libxposed/service/RemotePreferences$Editor;->mPut:Ljava/util/HashMap;

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    iput-boolean p1, p0, Lio/github/libxposed/service/RemotePreferences$Editor;->mClear:Z

    .line 22
    .line 23
    return-void
.end method

.method public static synthetic a(Lio/github/libxposed/service/RemotePreferences$Editor;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lio/github/libxposed/service/RemotePreferences$Editor;->lambda$apply$0(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private buildCommitBundle()Landroid/os/Bundle;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lio/github/libxposed/service/RemotePreferences$Editor;->mClear:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lio/github/libxposed/service/RemotePreferences$Editor;->mDelete:Ljava/util/HashSet;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lio/github/libxposed/service/RemotePreferences$Editor;->mPut:Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return-object p0

    .line 23
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    .line 24
    .line 25
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string v1, "clear"

    .line 29
    .line 30
    iget-boolean v2, p0, Lio/github/libxposed/service/RemotePreferences$Editor;->mClear:Z

    .line 31
    .line 32
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 33
    .line 34
    .line 35
    new-instance v1, Ljava/util/HashSet;

    .line 36
    .line 37
    iget-object v2, p0, Lio/github/libxposed/service/RemotePreferences$Editor;->mDelete:Ljava/util/HashSet;

    .line 38
    .line 39
    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 40
    .line 41
    .line 42
    const-string v2, "delete"

    .line 43
    .line 44
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 45
    .line 46
    .line 47
    new-instance v1, Ljava/util/HashMap;

    .line 48
    .line 49
    iget-object p0, p0, Lio/github/libxposed/service/RemotePreferences$Editor;->mPut:Ljava/util/HashMap;

    .line 50
    .line 51
    invoke-direct {v1, p0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 52
    .line 53
    .line 54
    const-string p0, "put"

    .line 55
    .line 56
    invoke-virtual {v0, p0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 57
    .line 58
    .line 59
    return-object v0
.end method

.method private doCommit(Landroid/os/Bundle;)Z
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lio/github/libxposed/service/RemotePreferences$Editor;->this$0:Lio/github/libxposed/service/RemotePreferences;

    .line 4
    .line 5
    invoke-static {v0}, Lio/github/libxposed/service/RemotePreferences;->d(Lio/github/libxposed/service/RemotePreferences;)Lio/github/libxposed/service/XposedService;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lio/github/libxposed/service/XposedService;->asInterface()Lio/github/libxposed/service/IXposedService;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object p0, p0, Lio/github/libxposed/service/RemotePreferences$Editor;->this$0:Lio/github/libxposed/service/RemotePreferences;

    .line 14
    .line 15
    invoke-static {p0}, Lio/github/libxposed/service/RemotePreferences;->a(Lio/github/libxposed/service/RemotePreferences;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-interface {v0, p0, p1}, Lio/github/libxposed/service/IXposedService;->updateRemotePreferences(Ljava/lang/String;Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    move-exception p0

    .line 24
    const-string p1, "RemotePreferences"

    .line 25
    .line 26
    const-string v0, "Failed to commit changes to framework"

    .line 27
    .line 28
    invoke-static {p1, v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return p0

    .line 33
    :cond_0
    :goto_0
    const/4 p0, 0x1

    .line 34
    return p0
.end method

.method private doUpdate()V
    .locals 5

    .line 1
    iget-object v0, p0, Lio/github/libxposed/service/RemotePreferences$Editor;->this$0:Lio/github/libxposed/service/RemotePreferences;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Ljava/util/HashMap;

    .line 5
    .line 6
    iget-object v2, p0, Lio/github/libxposed/service/RemotePreferences$Editor;->this$0:Lio/github/libxposed/service/RemotePreferences;

    .line 7
    .line 8
    invoke-static {v2}, Lio/github/libxposed/service/RemotePreferences;->c(Lio/github/libxposed/service/RemotePreferences;)Ljava/util/Map;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 13
    .line 14
    .line 15
    iget-boolean v2, p0, Lio/github/libxposed/service/RemotePreferences$Editor;->mClear:Z

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    goto/16 :goto_3

    .line 25
    .line 26
    :cond_0
    :goto_0
    iget-object v2, p0, Lio/github/libxposed/service/RemotePreferences$Editor;->mDelete:Ljava/util/HashSet;

    .line 27
    .line 28
    new-instance v3, Lvb;

    .line 29
    .line 30
    invoke-direct {v3, v1}, Lvb;-><init>(Ljava/util/HashMap;)V

    .line 31
    .line 32
    .line 33
    invoke-interface {v2, v3}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 34
    .line 35
    .line 36
    iget-object v2, p0, Lio/github/libxposed/service/RemotePreferences$Editor;->mPut:Ljava/util/HashMap;

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 39
    .line 40
    .line 41
    iget-object v2, p0, Lio/github/libxposed/service/RemotePreferences$Editor;->this$0:Lio/github/libxposed/service/RemotePreferences;

    .line 42
    .line 43
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-static {v2, v1}, Lio/github/libxposed/service/RemotePreferences;->e(Lio/github/libxposed/service/RemotePreferences;Ljava/util/Map;)V

    .line 48
    .line 49
    .line 50
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    iget-object v0, p0, Lio/github/libxposed/service/RemotePreferences$Editor;->this$0:Lio/github/libxposed/service/RemotePreferences;

    .line 52
    .line 53
    invoke-static {v0}, Lio/github/libxposed/service/RemotePreferences;->b(Lio/github/libxposed/service/RemotePreferences;)Ljava/util/Map;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    monitor-enter v1

    .line 58
    :try_start_1
    new-instance v0, Ljava/util/ArrayList;

    .line 59
    .line 60
    iget-object v2, p0, Lio/github/libxposed/service/RemotePreferences$Editor;->this$0:Lio/github/libxposed/service/RemotePreferences;

    .line 61
    .line 62
    invoke-static {v2}, Lio/github/libxposed/service/RemotePreferences;->b(Lio/github/libxposed/service/RemotePreferences;)Ljava/util/Map;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 71
    .line 72
    .line 73
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 74
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-eqz v1, :cond_4

    .line 83
    .line 84
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    check-cast v1, Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;

    .line 89
    .line 90
    iget-boolean v2, p0, Lio/github/libxposed/service/RemotePreferences$Editor;->mClear:Z

    .line 91
    .line 92
    if-eqz v2, :cond_2

    .line 93
    .line 94
    sget-boolean v2, Lio/github/libxposed/service/RemotePreferences;->shouldNotifyCleared:Z

    .line 95
    .line 96
    if-eqz v2, :cond_2

    .line 97
    .line 98
    iget-object v2, p0, Lio/github/libxposed/service/RemotePreferences$Editor;->this$0:Lio/github/libxposed/service/RemotePreferences;

    .line 99
    .line 100
    const/4 v3, 0x0

    .line 101
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;->onSharedPreferenceChanged(Landroid/content/SharedPreferences;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    :cond_2
    iget-object v2, p0, Lio/github/libxposed/service/RemotePreferences$Editor;->mDelete:Ljava/util/HashSet;

    .line 105
    .line 106
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-eqz v3, :cond_3

    .line 115
    .line 116
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    check-cast v3, Ljava/lang/String;

    .line 121
    .line 122
    iget-object v4, p0, Lio/github/libxposed/service/RemotePreferences$Editor;->this$0:Lio/github/libxposed/service/RemotePreferences;

    .line 123
    .line 124
    invoke-interface {v1, v4, v3}, Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;->onSharedPreferenceChanged(Landroid/content/SharedPreferences;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_3
    iget-object v2, p0, Lio/github/libxposed/service/RemotePreferences$Editor;->mPut:Ljava/util/HashMap;

    .line 129
    .line 130
    invoke-virtual {v2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    if-eqz v3, :cond_1

    .line 143
    .line 144
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    check-cast v3, Ljava/lang/String;

    .line 149
    .line 150
    iget-object v4, p0, Lio/github/libxposed/service/RemotePreferences$Editor;->this$0:Lio/github/libxposed/service/RemotePreferences;

    .line 151
    .line 152
    invoke-interface {v1, v4, v3}, Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;->onSharedPreferenceChanged(Landroid/content/SharedPreferences;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_4
    return-void

    .line 157
    :catchall_1
    move-exception p0

    .line 158
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 159
    throw p0

    .line 160
    :goto_3
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 161
    throw p0
.end method

.method private synthetic lambda$apply$0(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lio/github/libxposed/service/RemotePreferences$Editor;->doCommit(Landroid/os/Bundle;)Z

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private put(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/github/libxposed/service/RemotePreferences$Editor;->mDelete:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lio/github/libxposed/service/RemotePreferences$Editor;->mPut:Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public apply()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lio/github/libxposed/service/RemotePreferences$Editor;->buildCommitBundle()Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-direct {p0}, Lio/github/libxposed/service/RemotePreferences$Editor;->doUpdate()V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lio/github/libxposed/service/RemotePreferences;->f()Ljava/util/concurrent/ExecutorService;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    new-instance v2, Ls1;

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    invoke-direct {v2, p0, v0, v3}, Ls1;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 19
    .line 20
    .line 21
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public clear()Landroid/content/SharedPreferences$Editor;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lio/github/libxposed/service/RemotePreferences$Editor;->mClear:Z

    .line 3
    .line 4
    iget-object v0, p0, Lio/github/libxposed/service/RemotePreferences$Editor;->mDelete:Ljava/util/HashSet;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lio/github/libxposed/service/RemotePreferences$Editor;->mPut:Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 12
    .line 13
    .line 14
    return-object p0
.end method

.method public commit()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lio/github/libxposed/service/RemotePreferences$Editor;->buildCommitBundle()Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    invoke-direct {p0}, Lio/github/libxposed/service/RemotePreferences$Editor;->doUpdate()V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, v0}, Lio/github/libxposed/service/RemotePreferences$Editor;->doCommit(Landroid/os/Bundle;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    .locals 0

    .line 1
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-direct {p0, p1, p2}, Lio/github/libxposed/service/RemotePreferences$Editor;->put(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method public putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;
    .locals 0

    .line 1
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-direct {p0, p1, p2}, Lio/github/libxposed/service/RemotePreferences$Editor;->put(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method public putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
    .locals 0

    .line 1
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-direct {p0, p1, p2}, Lio/github/libxposed/service/RemotePreferences$Editor;->put(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method public putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
    .locals 0

    .line 1
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-direct {p0, p1, p2}, Lio/github/libxposed/service/RemotePreferences$Editor;->put(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method public putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lio/github/libxposed/service/RemotePreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 4
    .line 5
    .line 6
    return-object p0

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2}, Lio/github/libxposed/service/RemotePreferences$Editor;->put(Ljava/lang/String;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Landroid/content/SharedPreferences$Editor;"
        }
    .end annotation

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lio/github/libxposed/service/RemotePreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 4
    .line 5
    .line 6
    return-object p0

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2}, Lio/github/libxposed/service/RemotePreferences$Editor;->put(Ljava/lang/String;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/github/libxposed/service/RemotePreferences$Editor;->mDelete:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lio/github/libxposed/service/RemotePreferences$Editor;->mPut:Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-object p0
.end method
