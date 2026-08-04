.class public final Lio/github/libxposed/service/XposedProvider;
.super Landroid/content/ContentProvider;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/content/ContentProvider;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final call(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 3

    .line 1
    const-string p0, "SendBinder"

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_5

    .line 8
    .line 9
    if-eqz p3, :cond_5

    .line 10
    .line 11
    const-string p0, "binder"

    .line 12
    .line 13
    invoke-virtual {p3, p0}, Landroid/os/Bundle;->getBinder(Ljava/lang/String;)Landroid/os/IBinder;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-eqz p0, :cond_4

    .line 18
    .line 19
    const-string p1, "XposedProvider"

    .line 20
    .line 21
    new-instance p2, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string p3, "binder received: "

    .line 24
    .line 25
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    sget-object p1, Lyyds/ᛵᛸᲇᲈ;->ᛲᲈᲁ:Ljava/util/HashSet;

    .line 39
    .line 40
    monitor-enter p1

    .line 41
    :try_start_0
    new-instance p2, Lyyds/ᛶᲀᲈᛵ;

    .line 42
    .line 43
    sget p3, Lyyds/ᛶᲈᛸᛵ;->ᲀᛲᛳᲀ:I

    .line 44
    .line 45
    const-string p3, "io.github.libxposed.service.IXposedService"

    .line 46
    .line 47
    invoke-interface {p0, p3}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 48
    .line 49
    .line 50
    move-result-object p3

    .line 51
    if-eqz p3, :cond_0

    .line 52
    .line 53
    instance-of v0, p3, Lyyds/ᛵᛵᲀᲇ;

    .line 54
    .line 55
    if-eqz v0, :cond_0

    .line 56
    .line 57
    check-cast p3, Lyyds/ᛵᛵᲀᲇ;

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    new-instance p3, Lyyds/ᲀᛱᛵᛸ;

    .line 61
    .line 62
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object p0, p3, Lyyds/ᲀᛱᛵᛸ;->ᲀᛲᛳᲀ:Landroid/os/IBinder;

    .line 66
    .line 67
    :goto_0
    invoke-direct {p2, p3}, Lyyds/ᛶᲀᲈᛵ;-><init>(Lyyds/ᛵᛵᲀᲇ;)V

    .line 68
    .line 69
    .line 70
    sget-object p3, Lyyds/ᛵᛸᲇᲈ;->ᛵᛸᛸᛷ:Lcom/ss/android/ugc/awemes/MainApp;

    .line 71
    .line 72
    if-nez p3, :cond_1

    .line 73
    .line 74
    invoke-virtual {p1, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    goto :goto_3

    .line 78
    :catchall_0
    move-exception p0

    .line 79
    goto :goto_2

    .line 80
    :cond_1
    new-instance p3, Lyyds/ᛳᛲᛲᲈ;

    .line 81
    .line 82
    const/4 v0, 0x1

    .line 83
    invoke-direct {p3, p2, v0}, Lyyds/ᛳᛲᛲᲈ;-><init>(Lyyds/ᛶᲀᲈᛵ;I)V

    .line 84
    .line 85
    .line 86
    const/4 v0, 0x0

    .line 87
    invoke-interface {p0, p3, v0}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V

    .line 88
    .line 89
    .line 90
    sget-object p0, Lyyds/ᛵᛸᲇᲈ;->ᛵᛸᛸᛷ:Lcom/ss/android/ugc/awemes/MainApp;

    .line 91
    .line 92
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    const-wide v0, -0x49bf5e68a836eL

    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    sput-object p2, Lcom/ss/android/ugc/awemes/MainApp;->ᲀᛲᛳᲀ:Lyyds/ᛶᲀᲈᛵ;

    .line 104
    .line 105
    sget-object p0, Lcom/ss/android/ugc/awemes/MainApp;->ᲇᲈᛵᛷ:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 106
    .line 107
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object p3

    .line 111
    const-wide v0, -0x49bd3e68a836eL

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    :cond_2
    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-eqz v0, :cond_3

    .line 124
    .line 125
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    check-cast v0, Lyyds/ᲁᲀᲁᛸ;

    .line 130
    .line 131
    invoke-virtual {p0, v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-eqz v1, :cond_2

    .line 136
    .line 137
    check-cast v0, Lcom/ss/android/ugc/awemes/MainActivity;

    .line 138
    .line 139
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    new-instance v1, Lyyds/ᲈᛷᛲᛸ;

    .line 143
    .line 144
    const/4 v2, 0x7

    .line 145
    invoke-direct {v1, v0, v2, p2}, Lyyds/ᲈᛷᛲᛸ;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 149
    .line 150
    .line 151
    goto :goto_1

    .line 152
    :goto_2
    :try_start_1
    const-string p2, "XposedServiceHelper"

    .line 153
    .line 154
    const-string p3, "onBinderReceived"

    .line 155
    .line 156
    invoke-static {p2, p3, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 157
    .line 158
    .line 159
    :cond_3
    :goto_3
    monitor-exit p1

    .line 160
    goto :goto_4

    .line 161
    :catchall_1
    move-exception p0

    .line 162
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 163
    throw p0

    .line 164
    :cond_4
    :goto_4
    new-instance p0, Landroid/os/Bundle;

    .line 165
    .line 166
    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    .line 167
    .line 168
    .line 169
    return-object p0

    .line 170
    :cond_5
    const/4 p0, 0x0

    .line 171
    return-object p0
.end method

.method public final delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final getType(Landroid/net/Uri;)Ljava/lang/String;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final onCreate()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget p0, p0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 10
    .line 11
    const/16 v0, 0x1e

    .line 12
    .line 13
    if-lt p0, v0, :cond_0

    .line 14
    .line 15
    sget p0, Lyyds/ᛴᛸᲀᲇ;->ᛲᲈᲁ:I

    .line 16
    .line 17
    :cond_0
    const/4 p0, 0x1

    .line 18
    return p0
.end method

.method public final query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method
