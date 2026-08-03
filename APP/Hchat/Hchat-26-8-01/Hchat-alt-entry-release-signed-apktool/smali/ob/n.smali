.class public final Lob/n;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lr8/g;

.field public final b:Lia/t;

.field public final c:Landroid/content/SharedPreferences;

.field public final d:Landroid/os/Handler;

.field public final e:Lob/d;

.field public final f:Lb5/c;

.field public final g:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final h:Ljava/util/concurrent/ConcurrentHashMap;

.field public final i:Ljava/util/Set;

.field public final j:Ljava/util/Map;

.field public final k:Ljava/util/concurrent/ThreadPoolExecutor;

.field public l:Landroid/media/MediaPlayer;

.field public m:Ljava/io/File;

.field public n:J


# direct methods
.method public constructor <init>(Lr8/g;Lia/t;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lob/n;->a:Lr8/g;

    .line 8
    .line 9
    iput-object p2, p0, Lob/n;->b:Lia/t;

    .line 10
    .line 11
    sget-object p2, Lob/p;->a:Ljava/util/List;

    .line 12
    .line 13
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 14
    .line 15
    const-string p2, "Hchat_text_voice_config"

    .line 16
    .line 17
    invoke-static {p1, p2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    iput-object p2, p0, Lob/n;->c:Landroid/content/SharedPreferences;

    .line 22
    .line 23
    new-instance v0, Landroid/os/Handler;

    .line 24
    .line 25
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lob/n;->d:Landroid/os/Handler;

    .line 33
    .line 34
    new-instance v0, Lob/d;

    .line 35
    .line 36
    invoke-direct {v0}, Lob/d;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Lob/n;->e:Lob/d;

    .line 40
    .line 41
    new-instance v0, Lb5/c;

    .line 42
    .line 43
    const/16 v1, 0xd

    .line 44
    .line 45
    invoke-direct {v0, p1, v1}, Lb5/c;-><init>(Landroid/content/Context;I)V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, Lob/n;->f:Lb5/c;

    .line 49
    .line 50
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 51
    .line 52
    const/4 v1, 0x1

    .line 53
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, Lob/n;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 57
    .line 58
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 59
    .line 60
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object v0, p0, Lob/n;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 64
    .line 65
    invoke-static {}, Lj8/b;->o()Ljava/util/Set;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iput-object v0, p0, Lob/n;->i:Ljava/util/Set;

    .line 70
    .line 71
    invoke-static {}, Lp/a;->p()Ljava/util/Map;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iput-object v0, p0, Lob/n;->j:Ljava/util/Map;

    .line 76
    .line 77
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 78
    .line 79
    new-instance v7, Ljava/util/concurrent/ArrayBlockingQueue;

    .line 80
    .line 81
    const/16 v0, 0x8

    .line 82
    .line 83
    invoke-direct {v7, v0}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(I)V

    .line 84
    .line 85
    .line 86
    new-instance v8, Lc9/q;

    .line 87
    .line 88
    const/16 v0, 0x15

    .line 89
    .line 90
    invoke-direct {v8, v0}, Lc9/q;-><init>(I)V

    .line 91
    .line 92
    .line 93
    const/4 v2, 0x1

    .line 94
    const/4 v3, 0x1

    .line 95
    const-wide/16 v4, 0x0

    .line 96
    .line 97
    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 98
    .line 99
    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 100
    .line 101
    .line 102
    iput-object v1, p0, Lob/n;->k:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 103
    .line 104
    new-instance v0, Lb9/b;

    .line 105
    .line 106
    const/16 v1, 0x9

    .line 107
    .line 108
    invoke-direct {v0, p0, v1}, Lb9/b;-><init>(Ljava/lang/Object;I)V

    .line 109
    .line 110
    .line 111
    invoke-interface {p2, v0}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 112
    .line 113
    .line 114
    new-instance p2, Ljava/io/File;

    .line 115
    .line 116
    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    const-string v0, "hchat_text_voice"

    .line 121
    .line 122
    invoke-direct {p2, p1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p2}, Ljava/io/File;->isDirectory()Z

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    if-nez p1, :cond_0

    .line 130
    .line 131
    invoke-virtual {p2}, Ljava/io/File;->mkdirs()Z

    .line 132
    .line 133
    .line 134
    :cond_0
    invoke-virtual {p2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    if-eqz p1, :cond_2

    .line 139
    .line 140
    array-length p2, p1

    .line 141
    const/4 v0, 0x0

    .line 142
    move v1, v0

    .line 143
    :goto_0
    if-ge v1, p2, :cond_2

    .line 144
    .line 145
    aget-object v2, p1, v1

    .line 146
    .line 147
    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    const-string v4, "hchat_text_voice_"

    .line 155
    .line 156
    invoke-static {v3, v4, v0}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    if-eqz v3, :cond_1

    .line 161
    .line 162
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 163
    .line 164
    .line 165
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 166
    .line 167
    goto :goto_0

    .line 168
    :cond_2
    return-void
.end method

.method public static b(Ljava/lang/Object;Landroid/view/MenuItem;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    if-eqz v0, :cond_9

    .line 6
    .line 7
    const-class v1, Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_9

    .line 14
    .line 15
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :cond_0
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_8

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Ljava/lang/reflect/Field;

    .line 34
    .line 35
    const-class v3, Ljava/util/List;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {v3, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-nez v3, :cond_1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    invoke-static {v2, p0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-static {v2}, Lgg/x;->e(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    const/4 v4, 0x0

    .line 57
    if-eqz v3, :cond_2

    .line 58
    .line 59
    check-cast v2, Ljava/util/List;

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_2
    move-object v2, v4

    .line 63
    :goto_2
    if-eqz v2, :cond_0

    .line 64
    .line 65
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    const/4 v5, 0x0

    .line 70
    move v6, v5

    .line 71
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    if-eqz v7, :cond_5

    .line 76
    .line 77
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    if-eq v7, p1, :cond_6

    .line 82
    .line 83
    instance-of v8, v7, Landroid/view/MenuItem;

    .line 84
    .line 85
    if-eqz v8, :cond_3

    .line 86
    .line 87
    check-cast v7, Landroid/view/MenuItem;

    .line 88
    .line 89
    goto :goto_4

    .line 90
    :cond_3
    move-object v7, v4

    .line 91
    :goto_4
    if-eqz v7, :cond_4

    .line 92
    .line 93
    invoke-interface {v7}, Landroid/view/MenuItem;->getItemId()I

    .line 94
    .line 95
    .line 96
    move-result v7

    .line 97
    const v8, 0x48435456    # 200017.34f

    .line 98
    .line 99
    .line 100
    if-ne v7, v8, :cond_4

    .line 101
    .line 102
    goto :goto_5

    .line 103
    :cond_4
    add-int/lit8 v6, v6, 0x1

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_5
    const/4 v6, -0x1

    .line 107
    :cond_6
    :goto_5
    if-lez v6, :cond_7

    .line 108
    .line 109
    :try_start_0
    invoke-interface {v2, v6}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    invoke-interface {v2, v5, v3}, Ljava/util/List;->add(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 114
    .line 115
    .line 116
    :catchall_0
    :cond_7
    if-ltz v6, :cond_0

    .line 117
    .line 118
    goto :goto_6

    .line 119
    :cond_8
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    goto :goto_0

    .line 124
    :cond_9
    :goto_6
    return-void
.end method

.method public static e(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Number;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    invoke-static {p0, p1, v0}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    instance-of v0, p1, Ljava/lang/Number;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    check-cast p1, Ljava/lang/Number;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object p1, v1

    .line 17
    :goto_0
    if-eqz p1, :cond_1

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_1
    invoke-static {p0, p2}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    instance-of p2, p1, Ljava/lang/Number;

    .line 25
    .line 26
    if-eqz p2, :cond_2

    .line 27
    .line 28
    check-cast p1, Ljava/lang/Number;

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_2
    move-object p1, v1

    .line 32
    :goto_1
    if-eqz p1, :cond_3

    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_3
    invoke-static {p0, p3}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    instance-of p1, p0, Ljava/lang/Number;

    .line 40
    .line 41
    if-eqz p1, :cond_4

    .line 42
    .line 43
    check-cast p0, Ljava/lang/Number;

    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_4
    return-object v1
.end method

.method public static f(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    invoke-static {p0, p1, v0}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_0
    invoke-static {p0, p2}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :cond_1
    invoke-static {p0, p3}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    if-eqz p0, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    goto :goto_0

    .line 39
    :cond_2
    const/4 p0, 0x0

    .line 40
    :goto_0
    if-eqz p0, :cond_3

    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_3
    const-string p0, ""

    .line 44
    .line 45
    return-object p0
.end method

.method public static h(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_e

    .line 3
    .line 4
    const/4 v1, 0x5

    .line 5
    if-gt p0, v1, :cond_e

    .line 6
    .line 7
    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto/16 :goto_5

    .line 14
    .line 15
    :cond_0
    const-string v1, "field_msgId"

    .line 16
    .line 17
    const-string v2, "msgId"

    .line 18
    .line 19
    const-string v3, "getMsgId"

    .line 20
    .line 21
    invoke-static {p1, v3, v1, v2}, Lob/n;->e(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Number;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const/4 v2, 0x0

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const-string v1, "getMsgID"

    .line 30
    .line 31
    new-array v3, v2, [Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {p1, v1, v3}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    instance-of v3, v1, Ljava/lang/Number;

    .line 38
    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    check-cast v1, Ljava/lang/Number;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    move-object v1, v0

    .line 45
    :goto_0
    const-string v3, "com.tencent.mm.storage."

    .line 46
    .line 47
    invoke-static {v3, p1, v2}, Leh/a;->z(Ljava/lang/String;Ljava/lang/Object;Z)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    const/4 v4, 0x1

    .line 52
    if-eqz v3, :cond_4

    .line 53
    .line 54
    if-eqz v1, :cond_4

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 57
    .line 58
    .line 59
    move-result-wide v5

    .line 60
    const-wide/16 v7, 0x0

    .line 61
    .line 62
    cmp-long v1, v5, v7

    .line 63
    .line 64
    if-lez v1, :cond_3

    .line 65
    .line 66
    move v1, v4

    .line 67
    goto :goto_1

    .line 68
    :cond_3
    move v1, v2

    .line 69
    :goto_1
    if-ne v1, v4, :cond_4

    .line 70
    .line 71
    return-object p1

    .line 72
    :cond_4
    instance-of v1, p1, Landroid/view/View;

    .line 73
    .line 74
    if-eqz v1, :cond_5

    .line 75
    .line 76
    check-cast p1, Landroid/view/View;

    .line 77
    .line 78
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    add-int/2addr p0, v4

    .line 83
    invoke-static {p0, p1, p2}, Lob/n;->h(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0

    .line 88
    :cond_5
    instance-of v1, p1, [Ljava/lang/Object;

    .line 89
    .line 90
    if-eqz v1, :cond_7

    .line 91
    .line 92
    check-cast p1, [Ljava/lang/Object;

    .line 93
    .line 94
    array-length v1, p1

    .line 95
    :goto_2
    if-ge v2, v1, :cond_e

    .line 96
    .line 97
    aget-object v3, p1, v2

    .line 98
    .line 99
    add-int/lit8 v5, p0, 0x1

    .line 100
    .line 101
    invoke-static {v5, v3, p2}, Lob/n;->h(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    if-eqz v3, :cond_6

    .line 106
    .line 107
    return-object v3

    .line 108
    :cond_6
    add-int/lit8 v2, v2, 0x1

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_7
    instance-of v1, p1, Ljava/util/Collection;

    .line 112
    .line 113
    if-eqz v1, :cond_9

    .line 114
    .line 115
    check-cast p1, Ljava/lang/Iterable;

    .line 116
    .line 117
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    :cond_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    if-eqz v1, :cond_e

    .line 126
    .line 127
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    add-int/lit8 v2, p0, 0x1

    .line 132
    .line 133
    invoke-static {v2, v1, p2}, Lob/n;->h(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    if-eqz v1, :cond_8

    .line 138
    .line 139
    return-object v1

    .line 140
    :cond_9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    const-string v3, "java."

    .line 149
    .line 150
    invoke-static {v1, v3, v2}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    if-nez v3, :cond_e

    .line 155
    .line 156
    const-string v3, "android."

    .line 157
    .line 158
    invoke-static {v1, v3, v2}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    if-eqz v1, :cond_a

    .line 163
    .line 164
    goto :goto_5

    .line 165
    :cond_a
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    :goto_3
    if-eqz v1, :cond_e

    .line 170
    .line 171
    const-class v2, Ljava/lang/Object;

    .line 172
    .line 173
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    if-nez v2, :cond_e

    .line 178
    .line 179
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    :cond_b
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    if-eqz v3, :cond_d

    .line 192
    .line 193
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    check-cast v3, Ljava/lang/reflect/Field;

    .line 198
    .line 199
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    move-result-object v5

    .line 203
    invoke-virtual {v5}, Ljava/lang/Class;->isPrimitive()Z

    .line 204
    .line 205
    .line 206
    move-result v5

    .line 207
    if-nez v5, :cond_b

    .line 208
    .line 209
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    move-result-object v5

    .line 213
    const-class v6, Ljava/lang/String;

    .line 214
    .line 215
    invoke-static {v5, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v5

    .line 219
    if-eqz v5, :cond_c

    .line 220
    .line 221
    goto :goto_4

    .line 222
    :cond_c
    invoke-static {v3, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    if-eqz v3, :cond_b

    .line 227
    .line 228
    add-int/lit8 v5, p0, 0x1

    .line 229
    .line 230
    invoke-static {v5, v3, p2}, Lob/n;->h(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v3

    .line 234
    if-eqz v3, :cond_b

    .line 235
    .line 236
    return-object v3

    .line 237
    :cond_d
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    goto :goto_3

    .line 242
    :cond_e
    :goto_5
    return-object v0
.end method

.method public static m(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 1

    .line 1
    instance-of v0, p1, Ljava/lang/InterruptedException;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string p0, "\u64cd\u4f5c\u5df2\u53d6\u6d88"

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_3

    .line 13
    .line 14
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-eqz p1, :cond_3

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-lez v0, :cond_1

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 v0, 0x0

    .line 33
    :goto_0
    if-eqz v0, :cond_2

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_2
    const/4 p1, 0x0

    .line 37
    :goto_1
    if-eqz p1, :cond_3

    .line 38
    .line 39
    return-object p1

    .line 40
    :cond_3
    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_4

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Class;->isInterface()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_3

    .line 22
    :cond_0
    iget-object v0, p0, Lob/n;->i:Ljava/util/Set;

    .line 23
    .line 24
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    const/4 p1, 0x1

    .line 31
    return p1

    .line 32
    :cond_1
    :try_start_0
    sget-object v1, Lr8/i;->b:Lr8/i;

    .line 33
    .line 34
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->accessible(Ljava/lang/reflect/Method;)Ljava/lang/reflect/Method;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    move-object v2, p1

    .line 42
    :goto_0
    invoke-virtual {v1, v2, p2}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 43
    .line 44
    .line 45
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :catchall_0
    move-exception p2

    .line 49
    new-instance v1, Lsf/f;

    .line 50
    .line 51
    invoke-direct {v1, p2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    move-object p2, v1

    .line 55
    :goto_1
    invoke-static {p2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    if-nez v1, :cond_3

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    new-instance p2, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    const-string v0, "\u6587\u672c\u8f6c\u8bed\u97f3\u83dc\u5355 Hook \u5b89\u88c5\u5931\u8d25: "

    .line 72
    .line 73
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iget-object p2, p0, Lob/n;->b:Lia/t;

    .line 84
    .line 85
    invoke-virtual {p2, p1, v1}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 89
    .line 90
    :goto_2
    check-cast p2, Ljava/lang/Boolean;

    .line 91
    .line 92
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    return p1

    .line 97
    :cond_4
    :goto_3
    const/4 p1, 0x0

    .line 98
    return p1
.end method

.method public final c(Lob/k;)Ljava/io/File;
    .locals 5

    .line 1
    sget-object v0, Lob/p;->a:Ljava/util/List;

    .line 2
    .line 3
    iget-object p1, p1, Lob/k;->a:Ljava/lang/String;

    .line 4
    .line 5
    const-string v0, "tts:"

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-static {p1, v0, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    const-string p1, ".wav"

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string p1, ".mp3"

    .line 18
    .line 19
    :goto_0
    new-instance v0, Ljava/io/File;

    .line 20
    .line 21
    new-instance v1, Ljava/io/File;

    .line 22
    .line 23
    iget-object v2, p0, Lob/n;->a:Lr8/g;

    .line 24
    .line 25
    iget-object v2, v2, Lr8/g;->a:Landroid/content/Context;

    .line 26
    .line 27
    invoke-virtual {v2}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    const-string v3, "hchat_text_voice"

    .line 32
    .line 33
    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-nez v2, :cond_1

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 43
    .line 44
    .line 45
    :cond_1
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    new-instance v3, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const-string v4, "hchat_text_voice_"

    .line 52
    .line 53
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return-object v0
.end method

.method public final d()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lob/n;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lob/n;->c:Landroid/content/SharedPreferences;

    .line 11
    .line 12
    const-string v2, "text_voice_play_enable"

    .line 13
    .line 14
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    return v0

    .line 22
    :cond_0
    return v1
.end method

.method public final g()V
    .locals 4

    .line 1
    iget-wide v0, p0, Lob/n;->n:J

    .line 2
    .line 3
    const-wide/16 v2, 0x1

    .line 4
    .line 5
    add-long/2addr v0, v2

    .line 6
    iput-wide v0, p0, Lob/n;->n:J

    .line 7
    .line 8
    iget-object v0, p0, Lob/n;->l:Landroid/media/MediaPlayer;

    .line 9
    .line 10
    iget-object v1, p0, Lob/n;->m:Ljava/io/File;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    iput-object v2, p0, Lob/n;->l:Landroid/media/MediaPlayer;

    .line 14
    .line 15
    iput-object v2, p0, Lob/n;->m:Ljava/io/File;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    :try_start_0
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    :catchall_0
    :cond_0
    if-eqz v0, :cond_1

    .line 23
    .line 24
    :try_start_1
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 25
    .line 26
    .line 27
    :catchall_1
    :cond_1
    if-eqz v0, :cond_2

    .line 28
    .line 29
    :try_start_2
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 30
    .line 31
    .line 32
    :catchall_2
    :cond_2
    if-eqz v1, :cond_3

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 35
    .line 36
    .line 37
    :cond_3
    return-void
.end method

.method public final i()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lob/n;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lob/n;->c:Landroid/content/SharedPreferences;

    .line 11
    .line 12
    const-string v2, "text_voice_send_enable"

    .line 13
    .line 14
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    return v0

    .line 22
    :cond_0
    return v1
.end method

.method public final j(Lob/j;)Lob/k;
    .locals 12

    .line 1
    sget-object v0, Lob/p;->a:Ljava/util/List;

    .line 2
    .line 3
    iget-object v0, p0, Lob/n;->a:Lr8/g;

    .line 4
    .line 5
    iget-object v1, v0, Lr8/g;->a:Landroid/content/Context;

    .line 6
    .line 7
    iget-object v0, v0, Lr8/g;->a:Landroid/content/Context;

    .line 8
    .line 9
    const-string v2, "Hchat_text_voice_config"

    .line 10
    .line 11
    invoke-static {v1, v2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v3, "text_voice_engine"

    .line 16
    .line 17
    const-string v4, "online"

    .line 18
    .line 19
    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const-string v3, ""

    .line 24
    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    move-object v1, v3

    .line 28
    :cond_0
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-eqz v5, :cond_1

    .line 33
    .line 34
    move-object v7, v4

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move-object v7, v1

    .line 37
    :goto_0
    sget-object v1, Lob/j;->h:Lob/j;

    .line 38
    .line 39
    if-ne p1, v1, :cond_2

    .line 40
    .line 41
    const-string v4, "v50"

    .line 42
    .line 43
    :goto_1
    move-object v8, v4

    .line 44
    goto :goto_3

    .line 45
    :cond_2
    invoke-static {v0}, Lob/p;->b(Landroid/content/Context;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    sget-object v5, Lob/p;->a:Ljava/util/List;

    .line 50
    .line 51
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    :cond_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v8

    .line 59
    if-eqz v8, :cond_4

    .line 60
    .line 61
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v8

    .line 65
    move-object v9, v8

    .line 66
    check-cast v9, Lob/o;

    .line 67
    .line 68
    iget-object v9, v9, Lob/o;->a:Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {v9, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v9

    .line 74
    if-eqz v9, :cond_3

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_4
    const/4 v8, 0x0

    .line 78
    :goto_2
    check-cast v8, Lob/o;

    .line 79
    .line 80
    if-eqz v8, :cond_5

    .line 81
    .line 82
    iget-object v4, v8, Lob/o;->c:Ljava/lang/String;

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_5
    invoke-static {v5}, Ltf/m;->t1(Ljava/util/List;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    check-cast v4, Lob/o;

    .line 90
    .line 91
    iget-object v4, v4, Lob/o;->c:Ljava/lang/String;

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :goto_3
    new-instance v6, Lob/k;

    .line 95
    .line 96
    iget-object v4, p0, Lob/n;->c:Landroid/content/SharedPreferences;

    .line 97
    .line 98
    const-string v5, "text_voice_tts_voice"

    .line 99
    .line 100
    invoke-interface {v4, v5, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    if-nez v4, :cond_6

    .line 105
    .line 106
    move-object v9, v3

    .line 107
    goto :goto_4

    .line 108
    :cond_6
    move-object v9, v4

    .line 109
    :goto_4
    sget-object v3, Lob/p;->a:Ljava/util/List;

    .line 110
    .line 111
    invoke-static {v0, v2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    const-string v2, "text_voice_speech_rate"

    .line 116
    .line 117
    const/high16 v3, 0x3f800000    # 1.0f

    .line 118
    .line 119
    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    invoke-static {v0}, Lob/p;->a(F)F

    .line 124
    .line 125
    .line 126
    move-result v10

    .line 127
    if-ne p1, v1, :cond_7

    .line 128
    .line 129
    const/4 p1, 0x1

    .line 130
    :goto_5
    move v11, p1

    .line 131
    goto :goto_6

    .line 132
    :cond_7
    const/4 p1, 0x0

    .line 133
    goto :goto_5

    .line 134
    :goto_6
    invoke-direct/range {v6 .. v11}, Lob/k;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FZ)V

    .line 135
    .line 136
    .line 137
    return-object v6
.end method

.method public final k(Ljava/lang/String;Lob/k;Ljava/io/File;)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    sget-object v2, Lob/p;->a:Ljava/util/List;

    .line 6
    .line 7
    iget-object v2, v0, Lob/k;->a:Ljava/lang/String;

    .line 8
    .line 9
    const-string v3, "tts:"

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    invoke-static {v2, v3, v4}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    const-string v12, ""

    .line 17
    .line 18
    if-eqz v3, :cond_6

    .line 19
    .line 20
    invoke-static {v2}, Lob/p;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v13

    .line 24
    iget-object v6, v0, Lob/k;->c:Ljava/lang/String;

    .line 25
    .line 26
    iget v7, v0, Lob/k;->d:F

    .line 27
    .line 28
    iget-boolean v8, v0, Lob/k;->e:Z

    .line 29
    .line 30
    iget-object v2, v1, Lob/n;->f:Lb5/c;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-object v0, v2, Lb5/c;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Landroid/content/Context;

    .line 41
    .line 42
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    if-eqz v3, :cond_0

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    move-object v3, v0

    .line 50
    :goto_0
    iget-object v0, v2, Lb5/c;->c:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 55
    .line 56
    .line 57
    move-result-wide v10

    .line 58
    new-instance v14, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-static {v3, v13}, Lnb/c;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v15

    .line 71
    const/4 v5, 0x0

    .line 72
    :goto_1
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_4

    .line 77
    .line 78
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    move-object v5, v0

    .line 83
    check-cast v5, Ljava/lang/String;

    .line 84
    .line 85
    invoke-virtual {v2, v10, v11}, Lb5/c;->k(J)V

    .line 86
    .line 87
    .line 88
    move-object/from16 v4, p1

    .line 89
    .line 90
    move-object/from16 v9, p3

    .line 91
    .line 92
    :try_start_0
    invoke-virtual/range {v2 .. v11}, Lb5/c;->V(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FZLjava/io/File;J)V
    :try_end_0
    .catch Lob/b; {:try_start_0 .. :try_end_0} :catch_0

    .line 93
    .line 94
    .line 95
    goto/16 :goto_a

    .line 96
    .line 97
    :catch_0
    move-exception v0

    .line 98
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    if-eqz v4, :cond_1

    .line 103
    .line 104
    const-string v5, "\u7cfb\u7edf\u9ed8\u8ba4"

    .line 105
    .line 106
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    if-nez v4, :cond_2

    .line 111
    .line 112
    move-object v4, v12

    .line 113
    :cond_2
    move-object/from16 p2, v0

    .line 114
    .line 115
    new-instance v0, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    const-string v5, "\uff1a"

    .line 124
    .line 125
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    invoke-static {v13}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-eqz v0, :cond_3

    .line 143
    .line 144
    move-object/from16 v5, p2

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_3
    throw p2

    .line 148
    :cond_4
    const/4 v0, 0x3

    .line 149
    invoke-static {v0, v14}, Ltf/m;->M1(ILjava/util/List;)Ljava/util/List;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    const/4 v10, 0x0

    .line 154
    const/16 v11, 0x3e

    .line 155
    .line 156
    const-string v7, "\uff1b"

    .line 157
    .line 158
    const/4 v8, 0x0

    .line 159
    const/4 v9, 0x0

    .line 160
    invoke-static/range {v6 .. v11}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 165
    .line 166
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    if-eqz v3, :cond_5

    .line 171
    .line 172
    const-string v0, "TTS \u5f15\u64ce\u521d\u59cb\u5316\u5931\u8d25"

    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_5
    const-string v3, "\u53ef\u7528 TTS \u5f15\u64ce\u5747\u521d\u59cb\u5316\u5931\u8d25\uff08"

    .line 176
    .line 177
    const-string v4, "\uff09"

    .line 178
    .line 179
    invoke-static {v3, v0, v4}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    :goto_2
    invoke-direct {v2, v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 184
    .line 185
    .line 186
    throw v2

    .line 187
    :cond_6
    move-object/from16 v9, p3

    .line 188
    .line 189
    iget-object v2, v0, Lob/k;->b:Ljava/lang/String;

    .line 190
    .line 191
    iget v0, v0, Lob/k;->d:F

    .line 192
    .line 193
    invoke-static {v0}, Lob/p;->a(F)F

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    const/high16 v3, 0x3f800000    # 1.0f

    .line 198
    .line 199
    sub-float/2addr v0, v3

    .line 200
    const/high16 v3, 0x41200000    # 10.0f

    .line 201
    .line 202
    mul-float/2addr v0, v3

    .line 203
    invoke-static {v0}, Lig/a;->X(F)I

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    const/16 v3, -0x9

    .line 208
    .line 209
    const/16 v6, 0x14

    .line 210
    .line 211
    invoke-static {v0, v3, v6}, Lr9/e0;->r(III)I

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    iget-object v7, v1, Lob/n;->e:Lob/d;

    .line 216
    .line 217
    iget-object v7, v7, Lob/d;->a:Lokhttp3/OkHttpClient;

    .line 218
    .line 219
    const-string v8, "\u5728\u7ebf\u8bed\u97f3\u670d\u52a1\u8fd4\u56de\u9519\u8bef: "

    .line 220
    .line 221
    const-string v10, "\u5728\u7ebf\u8bed\u97f3\u8bf7\u6c42\u5931\u8d25: HTTP "

    .line 222
    .line 223
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    invoke-static/range {p1 .. p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 230
    .line 231
    .line 232
    move-result-object v11

    .line 233
    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v11

    .line 237
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 238
    .line 239
    .line 240
    move-result v13

    .line 241
    if-lez v13, :cond_1b

    .line 242
    .line 243
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 244
    .line 245
    .line 246
    move-result v13

    .line 247
    const/16 v14, 0x7d0

    .line 248
    .line 249
    if-gt v13, v14, :cond_1a

    .line 250
    .line 251
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 252
    .line 253
    .line 254
    move-result-wide v13

    .line 255
    const-string v15, "platform"

    .line 256
    .line 257
    const-string v5, "Android"

    .line 258
    .line 259
    const-string v3, "model_id"

    .line 260
    .line 261
    const-string v6, "tts_bcut"

    .line 262
    .line 263
    invoke-static {v3, v6, v15, v5}, Lwb/en;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 264
    .line 265
    .line 266
    move-result-object v3

    .line 267
    new-instance v5, Lorg/json/JSONArray;

    .line 268
    .line 269
    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v5, v11}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 273
    .line 274
    .line 275
    move-result-object v5

    .line 276
    const-string v6, "raw_data"

    .line 277
    .line 278
    invoke-virtual {v3, v6, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 279
    .line 280
    .line 281
    new-instance v5, Lorg/json/JSONObject;

    .line 282
    .line 283
    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 284
    .line 285
    .line 286
    const-string v6, "format"

    .line 287
    .line 288
    const-string v11, "mp3"

    .line 289
    .line 290
    invoke-virtual {v5, v6, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 291
    .line 292
    .line 293
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 294
    .line 295
    .line 296
    move-result-object v6

    .line 297
    new-instance v11, Ljava/lang/StringBuilder;

    .line 298
    .line 299
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    const-string v6, "_"

    .line 306
    .line 307
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v11, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v6

    .line 317
    const-string v11, "logid"

    .line 318
    .line 319
    invoke-virtual {v5, v11, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 320
    .line 321
    .line 322
    const-string v6, "method"

    .line 323
    .line 324
    invoke-virtual {v5, v6, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 325
    .line 326
    .line 327
    const-string v6, "pitch_rate"

    .line 328
    .line 329
    invoke-virtual {v5, v6, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 330
    .line 331
    .line 332
    const-string v6, "sample_rate"

    .line 333
    .line 334
    const/16 v11, 0x3e80

    .line 335
    .line 336
    invoke-virtual {v5, v6, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 337
    .line 338
    .line 339
    const-string v6, "speech_rate"

    .line 340
    .line 341
    const/16 v11, 0x14

    .line 342
    .line 343
    const/16 v15, -0x9

    .line 344
    .line 345
    invoke-static {v0, v15, v11}, Lr9/e0;->r(III)I

    .line 346
    .line 347
    .line 348
    move-result v0

    .line 349
    invoke-virtual {v5, v6, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 350
    .line 351
    .line 352
    const-string v0, "voice"

    .line 353
    .line 354
    invoke-virtual {v5, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 355
    .line 356
    .line 357
    const-string v0, "voice_engine"

    .line 358
    .line 359
    const-string v2, "bili"

    .line 360
    .line 361
    invoke-virtual {v5, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 362
    .line 363
    .line 364
    const-string v0, "volume"

    .line 365
    .line 366
    const/16 v2, 0x32

    .line 367
    .line 368
    invoke-virtual {v5, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 369
    .line 370
    .line 371
    const-string v0, "raw_params"

    .line 372
    .line 373
    invoke-virtual {v3, v0, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 374
    .line 375
    .line 376
    new-instance v0, Lokhttp3/Request$Builder;

    .line 377
    .line 378
    invoke-direct {v0}, Lokhttp3/Request$Builder;-><init>()V

    .line 379
    .line 380
    .line 381
    const-wide/16 v5, 0x3e8

    .line 382
    .line 383
    div-long/2addr v13, v5

    .line 384
    new-instance v2, Ljava/lang/StringBuilder;

    .line 385
    .line 386
    const-string v5, "https://member.bilibili.com/x/material/rubick-interface/sync-task?aurora_version=2.33.0&montage_version=1.36.1.3&sdk_type=mon&ts="

    .line 387
    .line 388
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v2, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v2

    .line 398
    invoke-virtual {v0, v2}, Lokhttp3/Request$Builder;->url(Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    const-string v2, "env"

    .line 403
    .line 404
    const-string v5, "prod"

    .line 405
    .line 406
    invoke-virtual {v0, v2, v5}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    const-string v2, "APP-KEY"

    .line 411
    .line 412
    const-string v5, "bilistudio"

    .line 413
    .line 414
    invoke-virtual {v0, v2, v5}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    const-string v2, "bili-http-engine"

    .line 419
    .line 420
    const-string v5, "cronet"

    .line 421
    .line 422
    invoke-virtual {v0, v2, v5}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    const-string v2, "User-Agent"

    .line 427
    .line 428
    const-string v5, "com.bilibili.studio/2740030 (Linux; U; Android 13; zh_CN; 21121210C; Build/TKQ1.220807.001; Cronet/88.0.4324.188)"

    .line 429
    .line 430
    invoke-virtual {v0, v2, v5}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    sget-object v2, Lokhttp3/RequestBody;->Companion:Lokhttp3/RequestBody$Companion;

    .line 435
    .line 436
    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object v3

    .line 440
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 441
    .line 442
    .line 443
    sget-object v5, Lob/d;->b:Lokhttp3/MediaType;

    .line 444
    .line 445
    invoke-virtual {v2, v3, v5}, Lokhttp3/RequestBody$Companion;->create(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/RequestBody;

    .line 446
    .line 447
    .line 448
    move-result-object v2

    .line 449
    invoke-virtual {v0, v2}, Lokhttp3/Request$Builder;->post(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    invoke-virtual {v0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    invoke-virtual {v7, v0}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    invoke-interface {v0}, Lokhttp3/Call;->execute()Lokhttp3/Response;

    .line 462
    .line 463
    .line 464
    move-result-object v2

    .line 465
    :try_start_1
    invoke-virtual {v2}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    if-eqz v0, :cond_7

    .line 470
    .line 471
    invoke-virtual {v0}, Lokhttp3/ResponseBody;->string()Ljava/lang/String;

    .line 472
    .line 473
    .line 474
    move-result-object v0

    .line 475
    goto :goto_3

    .line 476
    :catchall_0
    move-exception v0

    .line 477
    move-object v3, v0

    .line 478
    goto/16 :goto_f

    .line 479
    .line 480
    :cond_7
    const/4 v0, 0x0

    .line 481
    :goto_3
    if-nez v0, :cond_8

    .line 482
    .line 483
    move-object v0, v12

    .line 484
    :cond_8
    invoke-virtual {v2}, Lokhttp3/Response;->isSuccessful()Z

    .line 485
    .line 486
    .line 487
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 488
    if-eqz v3, :cond_19

    .line 489
    .line 490
    :try_start_2
    new-instance v3, Lorg/json/JSONObject;

    .line 491
    .line 492
    invoke-direct {v3, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 493
    .line 494
    .line 495
    goto :goto_4

    .line 496
    :catchall_1
    move-exception v0

    .line 497
    :try_start_3
    new-instance v3, Lsf/f;

    .line 498
    .line 499
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 500
    .line 501
    .line 502
    :goto_4
    invoke-static {v3}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    if-nez v0, :cond_18

    .line 507
    .line 508
    check-cast v3, Lorg/json/JSONObject;

    .line 509
    .line 510
    const-string v0, "code"

    .line 511
    .line 512
    const/4 v5, -0x1

    .line 513
    invoke-virtual {v3, v0, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 514
    .line 515
    .line 516
    move-result v0

    .line 517
    if-eqz v0, :cond_a

    .line 518
    .line 519
    const-string v4, "message"

    .line 520
    .line 521
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 522
    .line 523
    .line 524
    move-result-object v3

    .line 525
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 526
    .line 527
    .line 528
    move-result v4

    .line 529
    if-eqz v4, :cond_9

    .line 530
    .line 531
    new-instance v3, Ljava/lang/StringBuilder;

    .line 532
    .line 533
    invoke-direct {v3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 534
    .line 535
    .line 536
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 537
    .line 538
    .line 539
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object v3

    .line 543
    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 544
    .line 545
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 546
    .line 547
    .line 548
    move-result-object v3

    .line 549
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 550
    .line 551
    .line 552
    throw v0

    .line 553
    :cond_a
    const-string v0, "data"

    .line 554
    .line 555
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    if-eqz v0, :cond_b

    .line 560
    .line 561
    const-string v3, "result"

    .line 562
    .line 563
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 564
    .line 565
    .line 566
    move-result-object v0

    .line 567
    if-eqz v0, :cond_b

    .line 568
    .line 569
    const-string v3, "results"

    .line 570
    .line 571
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    if-eqz v0, :cond_b

    .line 576
    .line 577
    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 578
    .line 579
    .line 580
    move-result-object v0

    .line 581
    if-eqz v0, :cond_b

    .line 582
    .line 583
    const-string v3, "url"

    .line 584
    .line 585
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    move-result-object v0

    .line 589
    goto :goto_5

    .line 590
    :cond_b
    const/4 v0, 0x0

    .line 591
    :goto_5
    if-nez v0, :cond_c

    .line 592
    .line 593
    goto :goto_6

    .line 594
    :cond_c
    move-object v12, v0

    .line 595
    :goto_6
    const-string v0, "https://"

    .line 596
    .line 597
    const/4 v3, 0x1

    .line 598
    invoke-static {v12, v0, v3}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 599
    .line 600
    .line 601
    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 602
    if-eqz v0, :cond_d

    .line 603
    .line 604
    move-object v5, v12

    .line 605
    goto :goto_7

    .line 606
    :cond_d
    const/4 v5, 0x0

    .line 607
    :goto_7
    if-eqz v5, :cond_17

    .line 608
    .line 609
    invoke-interface {v2}, Ljava/io/Closeable;->close()V

    .line 610
    .line 611
    .line 612
    const-string v0, "\u4e0b\u8f7d\u8bed\u97f3\u5931\u8d25: HTTP "

    .line 613
    .line 614
    invoke-virtual {v9}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 615
    .line 616
    .line 617
    move-result-object v2

    .line 618
    if-eqz v2, :cond_f

    .line 619
    .line 620
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    .line 621
    .line 622
    .line 623
    move-result v3

    .line 624
    if-nez v3, :cond_f

    .line 625
    .line 626
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 627
    .line 628
    .line 629
    move-result v2

    .line 630
    if-eqz v2, :cond_e

    .line 631
    .line 632
    goto :goto_8

    .line 633
    :cond_e
    const-string v0, "\u65e0\u6cd5\u521b\u5efa\u8bed\u97f3\u7f13\u5b58\u76ee\u5f55"

    .line 634
    .line 635
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 636
    .line 637
    .line 638
    return-void

    .line 639
    :cond_f
    :goto_8
    new-instance v2, Ljava/io/File;

    .line 640
    .line 641
    invoke-virtual {v9}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 642
    .line 643
    .line 644
    move-result-object v3

    .line 645
    invoke-virtual {v9}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 646
    .line 647
    .line 648
    move-result-object v6

    .line 649
    const-string v8, ".part"

    .line 650
    .line 651
    invoke-static {v6, v8}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 652
    .line 653
    .line 654
    move-result-object v6

    .line 655
    invoke-direct {v2, v3, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 656
    .line 657
    .line 658
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 659
    .line 660
    .line 661
    invoke-virtual {v9}, Ljava/io/File;->delete()Z

    .line 662
    .line 663
    .line 664
    :try_start_4
    new-instance v3, Lokhttp3/Request$Builder;

    .line 665
    .line 666
    invoke-direct {v3}, Lokhttp3/Request$Builder;-><init>()V

    .line 667
    .line 668
    .line 669
    invoke-virtual {v3, v5}, Lokhttp3/Request$Builder;->url(Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 670
    .line 671
    .line 672
    move-result-object v3

    .line 673
    invoke-virtual {v3}, Lokhttp3/Request$Builder;->get()Lokhttp3/Request$Builder;

    .line 674
    .line 675
    .line 676
    move-result-object v3

    .line 677
    invoke-virtual {v3}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    .line 678
    .line 679
    .line 680
    move-result-object v3

    .line 681
    invoke-virtual {v7, v3}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    .line 682
    .line 683
    .line 684
    move-result-object v3

    .line 685
    invoke-interface {v3}, Lokhttp3/Call;->execute()Lokhttp3/Response;

    .line 686
    .line 687
    .line 688
    move-result-object v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 689
    :try_start_5
    invoke-virtual {v3}, Lokhttp3/Response;->isSuccessful()Z

    .line 690
    .line 691
    .line 692
    move-result v5

    .line 693
    if-eqz v5, :cond_16

    .line 694
    .line 695
    invoke-virtual {v3}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    .line 696
    .line 697
    .line 698
    move-result-object v0

    .line 699
    if-eqz v0, :cond_15

    .line 700
    .line 701
    invoke-virtual {v0}, Lokhttp3/ResponseBody;->contentLength()J

    .line 702
    .line 703
    .line 704
    move-result-wide v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 705
    const-wide/32 v7, 0x1000000

    .line 706
    .line 707
    .line 708
    cmp-long v5, v5, v7

    .line 709
    .line 710
    const-string v6, "\u8bed\u97f3\u6587\u4ef6\u8d85\u8fc7 16 MiB"

    .line 711
    .line 712
    if-gtz v5, :cond_14

    .line 713
    .line 714
    :try_start_6
    invoke-virtual {v0}, Lokhttp3/ResponseBody;->byteStream()Ljava/io/InputStream;

    .line 715
    .line 716
    .line 717
    move-result-object v5
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 718
    :try_start_7
    new-instance v10, Ljava/io/FileOutputStream;

    .line 719
    .line 720
    invoke-direct {v10, v2, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 721
    .line 722
    .line 723
    const/16 v0, 0x2000

    .line 724
    .line 725
    :try_start_8
    new-array v0, v0, [B

    .line 726
    .line 727
    const-wide/16 v11, 0x0

    .line 728
    .line 729
    move-wide v13, v11

    .line 730
    :goto_9
    invoke-virtual {v5, v0}, Ljava/io/InputStream;->read([B)I

    .line 731
    .line 732
    .line 733
    move-result v15
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 734
    if-gez v15, :cond_12

    .line 735
    .line 736
    :try_start_9
    invoke-virtual {v10}, Ljava/io/FileOutputStream;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 737
    .line 738
    .line 739
    :try_start_a
    invoke-interface {v5}, Ljava/io/Closeable;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 740
    .line 741
    .line 742
    :try_start_b
    invoke-interface {v3}, Ljava/io/Closeable;->close()V

    .line 743
    .line 744
    .line 745
    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    .line 746
    .line 747
    .line 748
    move-result v0

    .line 749
    if-eqz v0, :cond_11

    .line 750
    .line 751
    invoke-virtual {v2}, Ljava/io/File;->length()J

    .line 752
    .line 753
    .line 754
    move-result-wide v3

    .line 755
    cmp-long v0, v3, v11

    .line 756
    .line 757
    if-lez v0, :cond_11

    .line 758
    .line 759
    invoke-virtual {v2, v9}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 760
    .line 761
    .line 762
    move-result v0

    .line 763
    if-nez v0, :cond_10

    .line 764
    .line 765
    invoke-static {v2, v9}, Ldg/l;->a0(Ljava/io/File;Ljava/io/File;)V

    .line 766
    .line 767
    .line 768
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 769
    .line 770
    .line 771
    goto :goto_a

    .line 772
    :catchall_2
    move-exception v0

    .line 773
    goto :goto_e

    .line 774
    :cond_10
    :goto_a
    return-void

    .line 775
    :cond_11
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 776
    .line 777
    const-string v3, "\u4e0b\u8f7d\u5230\u7684\u8bed\u97f3\u6587\u4ef6\u4e3a\u7a7a"

    .line 778
    .line 779
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 780
    .line 781
    .line 782
    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 783
    :catchall_3
    move-exception v0

    .line 784
    move-object v4, v0

    .line 785
    goto :goto_d

    .line 786
    :catchall_4
    move-exception v0

    .line 787
    move-object v4, v0

    .line 788
    goto :goto_c

    .line 789
    :cond_12
    move-wide/from16 p1, v7

    .line 790
    .line 791
    int-to-long v7, v15

    .line 792
    add-long/2addr v13, v7

    .line 793
    cmp-long v7, v13, p1

    .line 794
    .line 795
    if-gtz v7, :cond_13

    .line 796
    .line 797
    :try_start_c
    invoke-virtual {v10, v0, v4, v15}, Ljava/io/FileOutputStream;->write([BII)V

    .line 798
    .line 799
    .line 800
    move-wide/from16 v7, p1

    .line 801
    .line 802
    goto :goto_9

    .line 803
    :catchall_5
    move-exception v0

    .line 804
    move-object v4, v0

    .line 805
    goto :goto_b

    .line 806
    :cond_13
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 807
    .line 808
    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 809
    .line 810
    .line 811
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 812
    :goto_b
    :try_start_d
    throw v4
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 813
    :catchall_6
    move-exception v0

    .line 814
    :try_start_e
    invoke-static {v10, v4}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 815
    .line 816
    .line 817
    throw v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .line 818
    :goto_c
    :try_start_f
    throw v4
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    .line 819
    :catchall_7
    move-exception v0

    .line 820
    :try_start_10
    invoke-static {v5, v4}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 821
    .line 822
    .line 823
    throw v0

    .line 824
    :cond_14
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 825
    .line 826
    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 827
    .line 828
    .line 829
    throw v0

    .line 830
    :cond_15
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 831
    .line 832
    const-string v4, "\u4e0b\u8f7d\u8bed\u97f3\u5931\u8d25: \u8fd4\u56de\u5185\u5bb9\u4e3a\u7a7a"

    .line 833
    .line 834
    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 835
    .line 836
    .line 837
    throw v0

    .line 838
    :cond_16
    new-instance v4, Ljava/lang/IllegalStateException;

    .line 839
    .line 840
    invoke-virtual {v3}, Lokhttp3/Response;->code()I

    .line 841
    .line 842
    .line 843
    move-result v5

    .line 844
    new-instance v6, Ljava/lang/StringBuilder;

    .line 845
    .line 846
    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 847
    .line 848
    .line 849
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 850
    .line 851
    .line 852
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 853
    .line 854
    .line 855
    move-result-object v0

    .line 856
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 857
    .line 858
    .line 859
    move-result-object v0

    .line 860
    invoke-direct {v4, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 861
    .line 862
    .line 863
    throw v4
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_3

    .line 864
    :goto_d
    :try_start_11
    throw v4
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    .line 865
    :catchall_8
    move-exception v0

    .line 866
    :try_start_12
    invoke-static {v3, v4}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 867
    .line 868
    .line 869
    throw v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_2

    .line 870
    :goto_e
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 871
    .line 872
    .line 873
    invoke-virtual {v9}, Ljava/io/File;->delete()Z

    .line 874
    .line 875
    .line 876
    throw v0

    .line 877
    :cond_17
    :try_start_13
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 878
    .line 879
    const-string v3, "\u5728\u7ebf\u8bed\u97f3\u672a\u8fd4\u56de\u5b89\u5168\u7684\u97f3\u9891\u5730\u5740"

    .line 880
    .line 881
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 882
    .line 883
    .line 884
    throw v0

    .line 885
    :cond_18
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 886
    .line 887
    const-string v3, "\u5728\u7ebf\u8bed\u97f3\u8fd4\u56de\u5185\u5bb9\u65e0\u6cd5\u89e3\u6790"

    .line 888
    .line 889
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 890
    .line 891
    .line 892
    throw v0

    .line 893
    :cond_19
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 894
    .line 895
    invoke-virtual {v2}, Lokhttp3/Response;->code()I

    .line 896
    .line 897
    .line 898
    move-result v3

    .line 899
    new-instance v4, Ljava/lang/StringBuilder;

    .line 900
    .line 901
    invoke-direct {v4, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 902
    .line 903
    .line 904
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 905
    .line 906
    .line 907
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 908
    .line 909
    .line 910
    move-result-object v3

    .line 911
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 912
    .line 913
    .line 914
    move-result-object v3

    .line 915
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 916
    .line 917
    .line 918
    throw v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_0

    .line 919
    :goto_f
    :try_start_14
    throw v3
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_9

    .line 920
    :catchall_9
    move-exception v0

    .line 921
    invoke-static {v2, v3}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 922
    .line 923
    .line 924
    throw v0

    .line 925
    :cond_1a
    const-string v0, "\u6587\u5b57\u4e0d\u80fd\u8d85\u8fc7 2000 \u4e2a\u5b57\u7b26"

    .line 926
    .line 927
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 928
    .line 929
    .line 930
    return-void

    .line 931
    :cond_1b
    const-string v0, "\u6587\u5b57\u4e0d\u80fd\u4e3a\u7a7a"

    .line 932
    .line 933
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 934
    .line 935
    .line 936
    return-void
.end method

.method public final l(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->currentActivity()Lq8/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lq8/o;->a()Landroid/app/Activity;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    new-instance v1, Lac/l;

    .line 14
    .line 15
    const/16 v2, 0x17

    .line 16
    .line 17
    invoke-direct {v1, v0, p0, p1, v2}, Lac/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lob/n;->d:Landroid/os/Handler;

    .line 21
    .line 22
    invoke-virtual {p1, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 23
    .line 24
    .line 25
    return-void
.end method
