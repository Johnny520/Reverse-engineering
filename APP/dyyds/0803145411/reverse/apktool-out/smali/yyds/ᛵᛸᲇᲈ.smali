.class public abstract Lyyds/ᛵᛸᲇᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛲᲈᲁ:Ljava/util/HashSet;

.field public static ᛵᛸᛸᛷ:Lcom/ss/android/ugc/awemes/MainApp;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lyyds/ᛵᛸᲇᲈ;->ᛲᲈᲁ:Ljava/util/HashSet;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    sput-object v0, Lyyds/ᛵᛸᲇᲈ;->ᛵᛸᛸᛷ:Lcom/ss/android/ugc/awemes/MainApp;

    .line 10
    .line 11
    return-void
.end method

.method public static ᛲᲈᲁ(Lcom/ss/android/ugc/awemes/MainApp;)V
    .locals 7

    .line 1
    sget-object v0, Lyyds/ᛵᛸᲇᲈ;->ᛲᲈᲁ:Ljava/util/HashSet;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sput-object p0, Lyyds/ᛵᛸᲇᲈ;->ᛵᛸᛸᛷ:Lcom/ss/android/ugc/awemes/MainApp;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    if-nez p0, :cond_3

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    :try_start_1
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Lyyds/ᛶᲀᲈᛵ;

    .line 27
    .line 28
    iget-object v2, v1, Lyyds/ᛶᲀᲈᛵ;->ᛲᲈᲁ:Lyyds/ᛵᛵᲀᲇ;

    .line 29
    .line 30
    check-cast v2, Lyyds/ᲀᛱᛵᛸ;

    .line 31
    .line 32
    iget-object v2, v2, Lyyds/ᲀᛱᛵᛸ;->ᲀᛲᛳᲀ:Landroid/os/IBinder;

    .line 33
    .line 34
    new-instance v3, Lyyds/ᛳᛲᛲᲈ;

    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    invoke-direct {v3, v1, v4}, Lyyds/ᛳᛲᛲᲈ;-><init>(Lyyds/ᛶᲀᲈᛵ;I)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v2, v3, v4}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V

    .line 41
    .line 42
    .line 43
    sget-object v2, Lyyds/ᛵᛸᲇᲈ;->ᛵᛸᛸᛷ:Lcom/ss/android/ugc/awemes/MainApp;

    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    sget-object v2, Lcom/ss/android/ugc/awemes/MainApp;->ᲀᛲᛳᲀ:Lyyds/ᛶᲀᲈᛵ;

    .line 49
    .line 50
    const-wide v2, -0x49bf5e68a836eL

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    sput-object v1, Lcom/ss/android/ugc/awemes/MainApp;->ᲀᛲᛳᲀ:Lyyds/ᛶᲀᲈᛵ;

    .line 59
    .line 60
    sget-object v2, Lcom/ss/android/ugc/awemes/MainApp;->ᲇᲈᛵᛷ:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    const-wide v4, -0x49bd3e68a836eL

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    if-eqz v4, :cond_0

    .line 79
    .line 80
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    check-cast v4, Lyyds/ᲁᲀᲁᛸ;

    .line 85
    .line 86
    invoke-virtual {v2, v4}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    if-eqz v5, :cond_1

    .line 91
    .line 92
    check-cast v4, Lcom/ss/android/ugc/awemes/MainActivity;

    .line 93
    .line 94
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    new-instance v5, Lyyds/ᲈᛷᛲᛸ;

    .line 98
    .line 99
    const/4 v6, 0x7

    .line 100
    invoke-direct {v5, v4, v6, v1}, Lyyds/ᲈᛷᛲᛸ;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v4, v5}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :catchall_0
    move-exception v1

    .line 108
    :try_start_2
    const-string v2, "XposedServiceHelper"

    .line 109
    .line 110
    const-string v3, "registerListener"

    .line 111
    .line 112
    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 113
    .line 114
    .line 115
    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :catchall_1
    move-exception p0

    .line 120
    goto :goto_2

    .line 121
    :cond_2
    sget-object p0, Lyyds/ᛵᛸᲇᲈ;->ᛲᲈᲁ:Ljava/util/HashSet;

    .line 122
    .line 123
    invoke-virtual {p0}, Ljava/util/HashSet;->clear()V

    .line 124
    .line 125
    .line 126
    :cond_3
    monitor-exit v0

    .line 127
    return-void

    .line 128
    :goto_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 129
    throw p0
.end method
