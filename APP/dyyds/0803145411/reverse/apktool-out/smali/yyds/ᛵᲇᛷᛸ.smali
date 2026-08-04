.class public final Lyyds/ᛵᲇᛷᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/os/Handler$Callback;


# static fields
.field public static final ᲀᛲᛳᲀ:Lyyds/ᛱᛵᲈᲁ;


# instance fields
.field public volatile ᛲᲈᲁ:Lyyds/ᲁᛷᛲ;

.field public final ᛵᛸᛸᛷ:Lyyds/ᛷᛲᲇᲀ;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᛱᛵᲈᲁ;

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lyyds/ᛱᛵᲈᲁ;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lyyds/ᛵᲇᛷᛸ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛵᲈᲁ;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lyyds/ᛷᛲᲇᲀ;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Lyyds/ᛴᲈᛲᛷ;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lyyds/ᛵᲇᛷᛸ;->ᛵᛸᛸᛷ:Lyyds/ᛷᛲᲇᲀ;

    .line 11
    .line 12
    new-instance p0, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    sget-object p0, Lyyds/ᛲᲀᛳ;->ᲀᛲᛳᲀ:Ljava/io/File;

    .line 18
    .line 19
    return-void
.end method

.method public static ᛲᲈᲁ(Landroid/content/Context;)Landroid/app/Activity;
    .locals 1

    .line 1
    instance-of v0, p0, Landroid/app/Activity;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Landroid/app/Activity;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    instance-of v0, p0, Landroid/content/ContextWrapper;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    check-cast p0, Landroid/content/ContextWrapper;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0}, Lyyds/ᛵᲇᛷᛸ;->ᛲᲈᲁ(Landroid/content/Context;)Landroid/app/Activity;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_1
    const/4 p0, 0x0

    .line 24
    return-object p0
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final ᛵᛸᛸᛷ(Landroid/content/Context;)Lyyds/ᲁᛷᛲ;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_7

    .line 3
    .line 4
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    if-ne v1, v2, :cond_4

    .line 13
    .line 14
    instance-of v1, p1, Landroid/app/Application;

    .line 15
    .line 16
    if-nez v1, :cond_4

    .line 17
    .line 18
    instance-of v1, p1, Landroidx/fragment/app/FragmentActivity;

    .line 19
    .line 20
    if-eqz v1, :cond_3

    .line 21
    .line 22
    check-cast p1, Landroidx/fragment/app/FragmentActivity;

    .line 23
    .line 24
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    if-ne v1, v2, :cond_2

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-nez p0, :cond_1

    .line 39
    .line 40
    invoke-static {p1}, Lyyds/ᛵᲇᛷᛸ;->ᛲᲈᲁ(Landroid/content/Context;)Landroid/app/Activity;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    if-eqz p0, :cond_0

    .line 45
    .line 46
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-static {p0}, Lcom/bumptech/glide/ᛲᲈᲁ;->ᛲᲈᲁ(Landroid/content/Context;)Lcom/bumptech/glide/ᛲᲈᲁ;

    .line 55
    .line 56
    .line 57
    throw v0

    .line 58
    :cond_1
    const-string p0, "You cannot start a load for a destroyed activity"

    .line 59
    .line 60
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-object v0

    .line 64
    :cond_2
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p0, p1}, Lyyds/ᛵᲇᛷᛸ;->ᛵᛸᛸᛷ(Landroid/content/Context;)Lyyds/ᲁᛷᛲ;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0

    .line 73
    :cond_3
    instance-of v0, p1, Landroid/content/ContextWrapper;

    .line 74
    .line 75
    if-eqz v0, :cond_4

    .line 76
    .line 77
    move-object v0, p1

    .line 78
    check-cast v0, Landroid/content/ContextWrapper;

    .line 79
    .line 80
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    if-eqz v1, :cond_4

    .line 89
    .line 90
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {p0, p1}, Lyyds/ᛵᲇᛷᛸ;->ᛵᛸᛸᛷ(Landroid/content/Context;)Lyyds/ᲁᛷᛲ;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    return-object p0

    .line 99
    :cond_4
    iget-object v0, p0, Lyyds/ᛵᲇᛷᛸ;->ᛲᲈᲁ:Lyyds/ᲁᛷᛲ;

    .line 100
    .line 101
    if-nez v0, :cond_6

    .line 102
    .line 103
    monitor-enter p0

    .line 104
    :try_start_0
    iget-object v0, p0, Lyyds/ᛵᲇᛷᛸ;->ᛲᲈᲁ:Lyyds/ᲁᛷᛲ;

    .line 105
    .line 106
    if-nez v0, :cond_5

    .line 107
    .line 108
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-static {v0}, Lcom/bumptech/glide/ᛲᲈᲁ;->ᛲᲈᲁ(Landroid/content/Context;)Lcom/bumptech/glide/ᛲᲈᲁ;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    new-instance v1, Lyyds/ᛷᛶᲇᲁ;

    .line 117
    .line 118
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 119
    .line 120
    .line 121
    new-instance v2, Lyyds/ᛷᛶᲇᲁ;

    .line 122
    .line 123
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    new-instance v3, Lyyds/ᲁᛷᛲ;

    .line 131
    .line 132
    invoke-direct {v3, v0, v1, v2, p1}, Lyyds/ᲁᛷᛲ;-><init>(Lcom/bumptech/glide/ᛲᲈᲁ;Lyyds/ᲀᲇᛵ;Lyyds/ᛷᛶᲇᲁ;Landroid/content/Context;)V

    .line 133
    .line 134
    .line 135
    iput-object v3, p0, Lyyds/ᛵᲇᛷᛸ;->ᛲᲈᲁ:Lyyds/ᲁᛷᛲ;

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :catchall_0
    move-exception p1

    .line 139
    goto :goto_1

    .line 140
    :cond_5
    :goto_0
    monitor-exit p0

    .line 141
    goto :goto_2

    .line 142
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 143
    throw p1

    .line 144
    :cond_6
    :goto_2
    iget-object p0, p0, Lyyds/ᛵᲇᛷᛸ;->ᛲᲈᲁ:Lyyds/ᲁᛷᛲ;

    .line 145
    .line 146
    return-object p0

    .line 147
    :cond_7
    const-string p0, "You cannot start a load on a null Context"

    .line 148
    .line 149
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    return-object v0
.end method
