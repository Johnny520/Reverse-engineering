.class public final Lbb/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public volatile e:Ljava/lang/reflect/GenericDeclaration;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lh/Hchat/dexkit/DexFinder;Lq8/o;Lj8/n;Li8/f;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lbb/b;->a:Ljava/lang/Object;

    .line 23
    iput-object p2, p0, Lbb/b;->b:Ljava/lang/Object;

    .line 24
    iput-object p3, p0, Lbb/b;->c:Ljava/lang/Object;

    .line 25
    iput-object p4, p0, Lbb/b;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lr8/g;Lab/b;Lbb/c;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lbb/b;->a:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lbb/b;->b:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lbb/b;->c:Ljava/lang/Object;

    .line 12
    .line 13
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lbb/b;->d:Ljava/lang/Object;

    .line 19
    .line 20
    return-void
.end method

.method public static varargs b([Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-ge v1, v0, :cond_1

    .line 4
    .line 5
    aget-object v2, p0, v1

    .line 6
    .line 7
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-nez v3, :cond_0

    .line 12
    .line 13
    return-object v2

    .line 14
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const-string p0, ""

    .line 18
    .line 19
    return-object p0
.end method

.method public static f(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/io/InputStream;
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_9

    .line 3
    .line 4
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_4

    .line 11
    .line 12
    :cond_0
    const-string v1, "com.tencent.mm.vfs.w6"

    .line 13
    .line 14
    const-string v2, "com.tencent.mm.vfs.p6"

    .line 15
    .line 16
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const/4 v2, 0x0

    .line 21
    move v3, v2

    .line 22
    :goto_0
    const/4 v4, 0x2

    .line 23
    if-ge v3, v4, :cond_9

    .line 24
    .line 25
    aget-object v5, v1, v3

    .line 26
    .line 27
    invoke-static {v5, p0}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    if-nez v5, :cond_1

    .line 32
    .line 33
    goto/16 :goto_3

    .line 34
    .line 35
    :cond_1
    const-string v6, "E"

    .line 36
    .line 37
    const-string v7, "F"

    .line 38
    .line 39
    filled-new-array {v6, v7}, [Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    move v7, v2

    .line 44
    :goto_1
    const-class v8, Ljava/lang/String;

    .line 45
    .line 46
    if-ge v7, v4, :cond_3

    .line 47
    .line 48
    aget-object v9, v6, v7

    .line 49
    .line 50
    filled-new-array {v8}, [Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    invoke-static {v5, v9, v8}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v9

    .line 62
    invoke-static {v8, v0, v9}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v8

    .line 66
    instance-of v9, v8, Ljava/io/InputStream;

    .line 67
    .line 68
    if-eqz v9, :cond_2

    .line 69
    .line 70
    check-cast v8, Ljava/io/InputStream;

    .line 71
    .line 72
    return-object v8

    .line 73
    :cond_2
    add-int/lit8 v7, v7, 0x1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    invoke-static {v5}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    :cond_4
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    if-eqz v5, :cond_8

    .line 89
    .line 90
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    check-cast v5, Ljava/lang/reflect/Method;

    .line 95
    .line 96
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    if-nez v6, :cond_5

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_5
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    const-class v7, Ljava/io/InputStream;

    .line 112
    .line 113
    if-eq v6, v7, :cond_6

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_6
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    array-length v7, v6

    .line 121
    const/4 v9, 0x1

    .line 122
    if-ne v7, v9, :cond_4

    .line 123
    .line 124
    aget-object v6, v6, v2

    .line 125
    .line 126
    if-eq v6, v8, :cond_7

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_7
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    invoke-static {v5, v0, v6}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    instance-of v6, v5, Ljava/io/InputStream;

    .line 138
    .line 139
    if-eqz v6, :cond_4

    .line 140
    .line 141
    check-cast v5, Ljava/io/InputStream;

    .line 142
    .line 143
    return-object v5

    .line 144
    :cond_8
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_9
    :goto_4
    return-object v0
.end method

.method public static h(Ljava/lang/Object;)J
    .locals 5

    .line 1
    instance-of v0, p0, Ljava/lang/Number;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 10
    .line 11
    .line 12
    move-result-wide v3

    .line 13
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    return-wide v0

    .line 18
    :cond_0
    if-nez p0, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    :try_start_0
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 30
    .line 31
    .line 32
    move-result-wide v3

    .line 33
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 34
    .line 35
    .line 36
    move-result-wide v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    return-wide v0

    .line 38
    :catchall_0
    :goto_0
    return-wide v1
.end method

.method public static i(Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-string p1, ""

    .line 9
    .line 10
    :goto_0
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_2

    .line 15
    .line 16
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    invoke-interface {p2, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-interface {p2, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    :cond_2
    :goto_1
    return-void
.end method

.method public static r(Landroid/os/AsyncTask;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lh/Hchat/utils/KavaReflector;->findFieldRecursive(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    if-ne v0, v1, :cond_2

    .line 20
    .line 21
    instance-of v1, p2, Ljava/lang/Boolean;

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    check-cast p2, Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-eqz p2, :cond_1

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    :cond_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 40
    .line 41
    if-ne v0, v1, :cond_4

    .line 42
    .line 43
    instance-of v1, p2, Ljava/lang/Number;

    .line 44
    .line 45
    if-eqz v1, :cond_3

    .line 46
    .line 47
    check-cast p2, Ljava/lang/Number;

    .line 48
    .line 49
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    :cond_3
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    goto :goto_1

    .line 58
    :cond_4
    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 59
    .line 60
    if-ne v0, v1, :cond_6

    .line 61
    .line 62
    instance-of v1, p2, Ljava/lang/Number;

    .line 63
    .line 64
    if-eqz v1, :cond_5

    .line 65
    .line 66
    check-cast p2, Ljava/lang/Number;

    .line 67
    .line 68
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 69
    .line 70
    .line 71
    move-result-wide v1

    .line 72
    goto :goto_0

    .line 73
    :cond_5
    const-wide/16 v1, 0x0

    .line 74
    .line 75
    :goto_0
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    :cond_6
    :goto_1
    if-eqz p2, :cond_7

    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/Class;->isPrimitive()Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-nez v1, :cond_7

    .line 86
    .line 87
    invoke-virtual {v0, p2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_8

    .line 92
    .line 93
    :cond_7
    invoke-static {p1, p0, p2}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    .line 95
    .line 96
    :catchall_0
    :cond_8
    :goto_2
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, Leh/a;->y(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    const-string v1, "\u751f\u6210\u89c6\u9891\u7f29\u7565\u56fe\u5931\u8d25: "

    .line 17
    .line 18
    const-string v2, "video_thumb_"

    .line 19
    .line 20
    new-instance v3, Landroid/media/MediaMetadataRetriever;

    .line 21
    .line 22
    invoke-direct {v3}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 23
    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    :try_start_0
    invoke-virtual {v3, p1}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-wide/16 v5, 0x0

    .line 30
    .line 31
    const/4 v7, 0x2

    .line 32
    invoke-virtual {v3, v5, v6, v7}, Landroid/media/MediaMetadataRetriever;->getFrameAtTime(JI)Landroid/graphics/Bitmap;

    .line 33
    .line 34
    .line 35
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 36
    if-nez v5, :cond_2

    .line 37
    .line 38
    if-eqz v5, :cond_1

    .line 39
    .line 40
    :goto_0
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->recycle()V

    .line 41
    .line 42
    .line 43
    :cond_1
    :try_start_1
    invoke-virtual {v3}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    .line 44
    .line 45
    .line 46
    return-object v0

    .line 47
    :cond_2
    :try_start_2
    new-instance v6, Ljava/io/File;

    .line 48
    .line 49
    iget-object v7, p0, Lbb/b;->a:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v7, Landroid/content/Context;

    .line 52
    .line 53
    invoke-virtual {v7}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    const-string v8, "Hchat_media"

    .line 58
    .line 59
    invoke-direct {v6, v7, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v6}, Ljava/io/File;->isDirectory()Z

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    if-nez v7, :cond_3

    .line 67
    .line 68
    invoke-virtual {v6}, Ljava/io/File;->mkdirs()Z

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    if-nez v7, :cond_3

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :catchall_0
    move-exception p1

    .line 76
    move-object v2, v4

    .line 77
    :goto_1
    move-object v4, v5

    .line 78
    goto :goto_4

    .line 79
    :cond_3
    new-instance v7, Ljava/io/File;

    .line 80
    .line 81
    new-instance v8, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    invoke-direct {v8, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string p1, ".jpg"

    .line 98
    .line 99
    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-direct {v7, v6, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    new-instance p1, Ljava/io/FileOutputStream;

    .line 110
    .line 111
    invoke-direct {p1, v7}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 112
    .line 113
    .line 114
    :try_start_3
    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 115
    .line 116
    const/16 v4, 0x55

    .line 117
    .line 118
    invoke-virtual {v5, v2, v4, p1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 119
    .line 120
    .line 121
    move-result v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 122
    if-nez v2, :cond_5

    .line 123
    .line 124
    :try_start_4
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 125
    .line 126
    .line 127
    :catchall_1
    :goto_2
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->recycle()V

    .line 128
    .line 129
    .line 130
    :cond_4
    :goto_3
    :try_start_5
    invoke-virtual {v3}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 131
    .line 132
    .line 133
    goto :goto_5

    .line 134
    :cond_5
    :try_start_6
    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 141
    :try_start_7
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 142
    .line 143
    .line 144
    goto :goto_2

    .line 145
    :catchall_2
    move-exception v2

    .line 146
    move-object v4, v2

    .line 147
    move-object v2, p1

    .line 148
    move-object p1, v4

    .line 149
    goto :goto_1

    .line 150
    :catchall_3
    move-exception p1

    .line 151
    move-object v2, v4

    .line 152
    :goto_4
    :try_start_8
    new-instance v5, Ljava/lang/StringBuilder;

    .line 153
    .line 154
    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    invoke-virtual {p0, p1}, Lbb/b;->c(Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 169
    .line 170
    .line 171
    if-eqz v2, :cond_6

    .line 172
    .line 173
    :try_start_9
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 174
    .line 175
    .line 176
    :catchall_4
    :cond_6
    if-eqz v4, :cond_4

    .line 177
    .line 178
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    .line 179
    .line 180
    .line 181
    goto :goto_3

    .line 182
    :catchall_5
    :goto_5
    return-object v0

    .line 183
    :catchall_6
    move-exception p1

    .line 184
    if-eqz v2, :cond_7

    .line 185
    .line 186
    :try_start_a
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 187
    .line 188
    .line 189
    :catchall_7
    :cond_7
    if-eqz v4, :cond_8

    .line 190
    .line 191
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    .line 192
    .line 193
    .line 194
    :cond_8
    :try_start_b
    invoke-virtual {v3}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    .line 195
    .line 196
    .line 197
    :catchall_8
    throw p1
.end method

.method public c(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "[WeChatVideoApi] "

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Li8/i;->f(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public declared-synchronized d(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    const-string v0, "video_"

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    const-string p1, ""
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    monitor-exit p0

    .line 13
    return-object p1

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    goto/16 :goto_7

    .line 16
    .line 17
    :cond_0
    :try_start_1
    new-instance v1, Ljava/io/File;

    .line 18
    .line 19
    invoke-direct {v1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    monitor-exit p0

    .line 33
    return-object p1

    .line 34
    :cond_1
    :try_start_2
    new-instance v1, Ljava/io/File;

    .line 35
    .line 36
    iget-object v2, p0, Lbb/b;->a:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v2, Landroid/content/Context;

    .line 39
    .line 40
    invoke-virtual {v2}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    const-string v3, "Hchat_message_video"

    .line 45
    .line 46
    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-nez v2, :cond_2

    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-nez v2, :cond_2

    .line 60
    .line 61
    const-string p1, ""
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 62
    .line 63
    monitor-exit p0

    .line 64
    return-object p1

    .line 65
    :cond_2
    :try_start_3
    new-instance v2, Ljava/io/File;

    .line 66
    .line 67
    new-instance v3, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v0, ".mp4"

    .line 84
    .line 85
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-direct {v2, v1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    const-wide/16 v3, 0x0

    .line 100
    .line 101
    if-eqz v0, :cond_3

    .line 102
    .line 103
    invoke-virtual {v2}, Ljava/io/File;->length()J

    .line 104
    .line 105
    .line 106
    move-result-wide v0

    .line 107
    cmp-long v0, v0, v3

    .line 108
    .line 109
    if-lez v0, :cond_3

    .line 110
    .line 111
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 115
    monitor-exit p0

    .line 116
    return-object p1

    .line 117
    :cond_3
    :try_start_4
    invoke-static {p1, p2}, Lbb/b;->f(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/io/InputStream;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    if-nez p1, :cond_4

    .line 122
    .line 123
    const-string p1, ""
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 124
    .line 125
    monitor-exit p0

    .line 126
    return-object p1

    .line 127
    :cond_4
    :try_start_5
    new-instance p2, Ljava/io/FileOutputStream;

    .line 128
    .line 129
    const/4 v0, 0x0

    .line 130
    invoke-direct {p2, v2, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 131
    .line 132
    .line 133
    const/16 v1, 0x2000

    .line 134
    .line 135
    :try_start_6
    new-array v1, v1, [B

    .line 136
    .line 137
    :goto_0
    invoke-virtual {p1, v1}, Ljava/io/InputStream;->read([B)I

    .line 138
    .line 139
    .line 140
    move-result v5

    .line 141
    if-lez v5, :cond_5

    .line 142
    .line 143
    invoke-virtual {p2, v1, v0, v5}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 144
    .line 145
    .line 146
    goto :goto_0

    .line 147
    :catchall_1
    move-exception v0

    .line 148
    goto :goto_2

    .line 149
    :cond_5
    :try_start_7
    invoke-virtual {p2}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 150
    .line 151
    .line 152
    :try_start_8
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 153
    .line 154
    .line 155
    :try_start_9
    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    if-eqz p1, :cond_6

    .line 160
    .line 161
    invoke-virtual {v2}, Ljava/io/File;->length()J

    .line 162
    .line 163
    .line 164
    move-result-wide p1

    .line 165
    cmp-long p1, p1, v3

    .line 166
    .line 167
    if-lez p1, :cond_6

    .line 168
    .line 169
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    goto :goto_1

    .line 174
    :cond_6
    const-string p1, ""
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 175
    .line 176
    :goto_1
    monitor-exit p0

    .line 177
    return-object p1

    .line 178
    :catchall_2
    move-exception p1

    .line 179
    goto :goto_6

    .line 180
    :catchall_3
    move-exception p2

    .line 181
    goto :goto_4

    .line 182
    :goto_2
    :try_start_a
    invoke-virtual {p2}, Ljava/io/FileOutputStream;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 183
    .line 184
    .line 185
    goto :goto_3

    .line 186
    :catchall_4
    move-exception p2

    .line 187
    :try_start_b
    invoke-virtual {v0, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 188
    .line 189
    .line 190
    :goto_3
    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 191
    :goto_4
    :try_start_c
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 192
    .line 193
    .line 194
    goto :goto_5

    .line 195
    :catchall_5
    move-exception p1

    .line 196
    :try_start_d
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 197
    .line 198
    .line 199
    :goto_5
    throw p2
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 200
    :goto_6
    :try_start_e
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 201
    .line 202
    .line 203
    move-result p2

    .line 204
    if-eqz p2, :cond_7

    .line 205
    .line 206
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 207
    .line 208
    .line 209
    :cond_7
    new-instance p2, Ljava/lang/StringBuilder;

    .line 210
    .line 211
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 212
    .line 213
    .line 214
    const-string v0, "\u8bfb\u53d6\u89c6\u9891VFS\u8def\u5f84\u5f02\u5e38: "

    .line 215
    .line 216
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    invoke-virtual {p0, p1}, Lbb/b;->c(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    const-string p1, ""
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    .line 234
    .line 235
    monitor-exit p0

    .line 236
    return-object p1

    .line 237
    :goto_7
    :try_start_f
    monitor-exit p0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    .line 238
    throw p1
.end method

.method public e()Landroid/os/AsyncTask;
    .locals 5

    .line 1
    const-string v0, "\u53d1\u9001\u89c6\u9891\u5931\u8d25: Task\u7c7b\u578b\u4e0d\u5339\u914d "

    .line 2
    .line 3
    iget-object v1, p0, Lbb/b;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lh/Hchat/dexkit/DexFinder;

    .line 6
    .line 7
    iget-object v1, v1, Lh/Hchat/dexkit/DexFinder;->sendVideoTaskClass:Ljava/lang/Class;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    return-object v2

    .line 13
    :cond_0
    const/4 v3, 0x0

    .line 14
    :try_start_0
    new-array v4, v3, [Ljava/lang/Class;

    .line 15
    .line 16
    invoke-static {v1, v4}, Lh/Hchat/utils/KavaReflector;->findConstructor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    new-array v3, v3, [Ljava/lang/Object;

    .line 21
    .line 22
    invoke-static {v4, v3}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    instance-of v4, v3, Landroid/os/AsyncTask;

    .line 27
    .line 28
    if-nez v4, :cond_1

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {p0, v0}, Lbb/b;->c(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    return-object v2

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    check-cast v3, Landroid/os/AsyncTask;

    .line 45
    .line 46
    return-object v3

    .line 47
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v4, "\u521b\u5efa\u89c6\u9891\u53d1\u9001Task\u5931\u8d25: "

    .line 50
    .line 51
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v1, " "

    .line 62
    .line 63
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {p0, v0}, Lbb/b;->c(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    return-object v2
.end method

.method public g(Ljava/lang/String;)Ljava/util/LinkedHashMap;
    .locals 10

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    goto/16 :goto_5

    .line 13
    .line 14
    :cond_0
    const/16 v1, 0x3c

    .line 15
    .line 16
    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(I)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-gez v1, :cond_1

    .line 21
    .line 22
    goto/16 :goto_5

    .line 23
    .line 24
    :cond_1
    :try_start_0
    invoke-static {}, Landroid/util/Xml;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    new-instance v3, Ljava/io/StringReader;

    .line 29
    .line 30
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-direct {v3, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    move-object p1, v2

    .line 38
    check-cast p1, Lb8/a;

    .line 39
    .line 40
    iput-object v3, p1, Lc8/b;->n:Ljava/io/StringReader;

    .line 41
    .line 42
    const/4 v1, 0x0

    .line 43
    iput v1, p1, Lc8/b;->u:I

    .line 44
    .line 45
    iput-boolean v1, p1, Lc8/b;->C:Z

    .line 46
    .line 47
    const/4 v4, 0x0

    .line 48
    iput-object v4, p1, Lc8/b;->y:Ljava/lang/String;

    .line 49
    .line 50
    iput-object v4, p1, Lc8/b;->w:Ljava/lang/String;

    .line 51
    .line 52
    iput-boolean v1, p1, Lc8/b;->A:Z

    .line 53
    .line 54
    const/4 v5, -0x1

    .line 55
    iput v5, p1, Lc8/b;->B:I

    .line 56
    .line 57
    iput v1, p1, Lc8/b;->q:I

    .line 58
    .line 59
    iput v1, p1, Lc8/b;->r:I

    .line 60
    .line 61
    iput v1, p1, Lc8/b;->s:I

    .line 62
    .line 63
    iput v1, p1, Lc8/b;->t:I

    .line 64
    .line 65
    iput v1, p1, Lc8/b;->j:I

    .line 66
    .line 67
    iput-object v4, p1, Lc8/b;->h:Ljava/util/HashMap;

    .line 68
    .line 69
    iput-object v3, p1, Lb8/a;->e0:Ljava/io/StringReader;

    .line 70
    .line 71
    move-object p1, v2

    .line 72
    check-cast p1, Lc8/b;

    .line 73
    .line 74
    iget p1, p1, Lc8/b;->u:I

    .line 75
    .line 76
    move-object v3, v4

    .line 77
    :goto_0
    const/4 v5, 0x1

    .line 78
    if-eq p1, v5, :cond_a

    .line 79
    .line 80
    const/4 v5, 0x2

    .line 81
    if-ne p1, v5, :cond_7

    .line 82
    .line 83
    move-object p1, v2

    .line 84
    check-cast p1, Lc8/b;

    .line 85
    .line 86
    iget-object p1, p1, Lc8/b;->y:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    .line 88
    const-string v3, ""

    .line 89
    .line 90
    if-eqz p1, :cond_2

    .line 91
    .line 92
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 97
    .line 98
    invoke-virtual {p1, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    goto :goto_1

    .line 103
    :cond_2
    move-object p1, v3

    .line 104
    :goto_1
    move v5, v1

    .line 105
    :goto_2
    move-object v6, v2

    .line 106
    check-cast v6, Lc8/b;

    .line 107
    .line 108
    iget v6, v6, Lc8/b;->B:I

    .line 109
    .line 110
    if-ge v5, v6, :cond_6

    .line 111
    .line 112
    move-object v6, v2

    .line 113
    check-cast v6, Lc8/b;

    .line 114
    .line 115
    iget v7, v6, Lc8/b;->B:I

    .line 116
    .line 117
    if-ge v5, v7, :cond_5

    .line 118
    .line 119
    iget-object v6, v6, Lc8/b;->D:[Ljava/lang/String;

    .line 120
    .line 121
    mul-int/lit8 v7, v5, 0x4

    .line 122
    .line 123
    add-int/lit8 v8, v7, 0x2

    .line 124
    .line 125
    aget-object v6, v6, v8

    .line 126
    .line 127
    if-eqz v6, :cond_3

    .line 128
    .line 129
    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 134
    .line 135
    invoke-virtual {v6, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    goto :goto_3

    .line 140
    :cond_3
    move-object v6, v3

    .line 141
    :goto_3
    move-object v8, v2

    .line 142
    check-cast v8, Lc8/b;

    .line 143
    .line 144
    iget v9, v8, Lc8/b;->B:I

    .line 145
    .line 146
    if-ge v5, v9, :cond_4

    .line 147
    .line 148
    iget-object v8, v8, Lc8/b;->D:[Ljava/lang/String;

    .line 149
    .line 150
    add-int/lit8 v7, v7, 0x3

    .line 151
    .line 152
    aget-object v7, v8, v7

    .line 153
    .line 154
    invoke-static {v6, v7, v0}, Lbb/b;->i(Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;)V

    .line 155
    .line 156
    .line 157
    add-int/lit8 v5, v5, 0x1

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :catchall_0
    move-exception p1

    .line 161
    goto :goto_6

    .line 162
    :cond_4
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    .line 163
    .line 164
    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    .line 165
    .line 166
    .line 167
    throw p1

    .line 168
    :cond_5
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    .line 169
    .line 170
    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    .line 171
    .line 172
    .line 173
    throw p1

    .line 174
    :cond_6
    move-object v3, p1

    .line 175
    goto :goto_4

    .line 176
    :cond_7
    const/4 v5, 0x4

    .line 177
    if-ne p1, v5, :cond_8

    .line 178
    .line 179
    if-eqz v3, :cond_8

    .line 180
    .line 181
    move-object p1, v2

    .line 182
    check-cast p1, Lc8/b;

    .line 183
    .line 184
    invoke-virtual {p1}, Lc8/b;->h()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-static {v3, p1, v0}, Lbb/b;->i(Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;)V

    .line 189
    .line 190
    .line 191
    goto :goto_4

    .line 192
    :cond_8
    const/4 v5, 0x3

    .line 193
    if-ne p1, v5, :cond_9

    .line 194
    .line 195
    move-object v3, v4

    .line 196
    :cond_9
    :goto_4
    move-object p1, v2

    .line 197
    check-cast p1, Lb8/a;

    .line 198
    .line 199
    invoke-virtual {p1}, Lb8/a;->z()I

    .line 200
    .line 201
    .line 202
    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 203
    goto :goto_0

    .line 204
    :cond_a
    :goto_5
    return-object v0

    .line 205
    :goto_6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 206
    .line 207
    const-string v2, "\u89e3\u6790\u89c6\u9891reserved4\u5931\u8d25: "

    .line 208
    .line 209
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    invoke-virtual {p0, p1}, Lbb/b;->c(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    return-object v0
.end method

.method public j(Ljava/lang/String;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lbb/b;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    :goto_0
    if-nez p1, :cond_1

    .line 18
    .line 19
    const-string p1, ""

    .line 20
    .line 21
    :cond_1
    sget-object v1, Lbb/l;->c:Log/k;

    .line 22
    .line 23
    invoke-static {p1}, Lzb/c;->b(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_2

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_2
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    invoke-virtual {v1, p1}, Lg8/i;->n(Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatContact;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    if-eqz v1, :cond_3

    .line 41
    .line 42
    iget v2, v1, Lh/Hchat/hooks/api/model/WeChatContact;->gender:I

    .line 43
    .line 44
    if-eqz v2, :cond_3

    .line 45
    .line 46
    invoke-virtual {v1}, Lh/Hchat/hooks/api/model/WeChatContact;->getRegion()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_5

    .line 55
    .line 56
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 57
    .line 58
    .line 59
    move-result-wide v1

    .line 60
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    check-cast v3, Ljava/lang/Long;

    .line 65
    .line 66
    if-eqz v3, :cond_4

    .line 67
    .line 68
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 69
    .line 70
    .line 71
    move-result-wide v3

    .line 72
    goto :goto_1

    .line 73
    :cond_4
    const-wide/16 v3, 0x0

    .line 74
    .line 75
    :goto_1
    sub-long v3, v1, v3

    .line 76
    .line 77
    const-wide/32 v5, 0x927c0

    .line 78
    .line 79
    .line 80
    cmp-long v3, v3, v5

    .line 81
    .line 82
    if-gez v3, :cond_6

    .line 83
    .line 84
    :cond_5
    :goto_2
    return-void

    .line 85
    :cond_6
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-virtual {v0, p1, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->tasks()Lo8/j;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    if-eqz v0, :cond_7

    .line 97
    .line 98
    new-instance v1, Lbb/a;

    .line 99
    .line 100
    const/4 v2, 0x0

    .line 101
    invoke-direct {v1, p0, p1, v2}, Lbb/a;-><init>(Lbb/b;Ljava/lang/String;I)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, v1}, Lo8/j;->d(Ljava/lang/Runnable;)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_7
    new-instance v0, Ljava/lang/Thread;

    .line 109
    .line 110
    new-instance v1, Lbb/a;

    .line 111
    .line 112
    const/4 v2, 0x1

    .line 113
    invoke-direct {v1, p0, p1, v2}, Lbb/a;-><init>(Lbb/b;Ljava/lang/String;I)V

    .line 114
    .line 115
    .line 116
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 120
    .line 121
    .line 122
    return-void
.end method

.method public k(Ljava/lang/String;)V
    .locals 5

    .line 1
    const-string v0, "real_tail_profile_refresh_"

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0, p1}, Lbb/b;->l(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lbb/b;->m(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->tasks()Lo8/j;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    new-instance v2, Lbb/a;

    .line 29
    .line 30
    const/4 v3, 0x2

    .line 31
    invoke-direct {v2, p0, p1, v3}, Lbb/a;-><init>(Lbb/b;Ljava/lang/String;I)V

    .line 32
    .line 33
    .line 34
    const-wide/16 v3, 0x9c4

    .line 35
    .line 36
    invoke-virtual {v1, v0, v3, v4, v2}, Lo8/j;->f(Ljava/lang/String;JLjava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    :cond_1
    return-void

    .line 40
    :goto_1
    iget-object v0, p0, Lbb/b;->b:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Lab/b;

    .line 43
    .line 44
    const-string v1, "\u8054\u7cfb\u4eba\u8d44\u6599\u9884\u53d6\u5931\u8d25"

    .line 45
    .line 46
    invoke-virtual {v0, v1, p1}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public l(Ljava/lang/String;)Z
    .locals 13

    .line 1
    iget-object v0, p0, Lbb/b;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lr8/g;

    .line 4
    .line 5
    iget-object v1, v0, Lr8/g;->e:Lh/Hchat/dexkit/DexFinder;

    .line 6
    .line 7
    iget-object v1, v1, Lh/Hchat/dexkit/DexFinder;->getContactAddMethods:Ljava/util/List;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_c

    .line 11
    .line 12
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_c

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Ljava/lang/reflect/Method;

    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    const/4 v5, 0x0

    .line 36
    if-eqz v4, :cond_6

    .line 37
    .line 38
    invoke-virtual {p0, v4}, Lbb/b;->p(Ljava/lang/Class;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    if-eqz v6, :cond_1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    iget-object v6, v0, Lr8/g;->e:Lh/Hchat/dexkit/DexFinder;

    .line 46
    .line 47
    invoke-static {v6, v4}, Lig/a;->A(Lh/Hchat/dexkit/DexFinder;Ljava/lang/Class;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    if-eqz v7, :cond_2

    .line 52
    .line 53
    move-object v6, v7

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    invoke-virtual {v4}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    array-length v8, v7

    .line 63
    move v9, v2

    .line 64
    :goto_0
    if-lt v9, v8, :cond_3

    .line 65
    .line 66
    invoke-virtual {v4}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-static {v6, v4}, Lig/a;->A(Lh/Hchat/dexkit/DexFinder;Ljava/lang/Class;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    goto :goto_1

    .line 75
    :cond_3
    aget-object v10, v7, v9

    .line 76
    .line 77
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, v10}, Lbb/b;->p(Ljava/lang/Class;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v11

    .line 84
    if-eqz v11, :cond_4

    .line 85
    .line 86
    move-object v6, v11

    .line 87
    goto :goto_1

    .line 88
    :cond_4
    invoke-static {v6, v10}, Lig/a;->A(Lh/Hchat/dexkit/DexFinder;Ljava/lang/Class;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v10

    .line 92
    if-eqz v10, :cond_5

    .line 93
    .line 94
    move-object v6, v10

    .line 95
    goto :goto_1

    .line 96
    :cond_5
    add-int/lit8 v9, v9, 0x1

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_6
    move-object v6, v5

    .line 100
    :goto_1
    if-eqz v6, :cond_0

    .line 101
    .line 102
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    const/4 v7, 0x1

    .line 107
    if-eqz v4, :cond_9

    .line 108
    .line 109
    array-length v8, v4

    .line 110
    const-string v9, ""

    .line 111
    .line 112
    const-class v10, Ljava/lang/String;

    .line 113
    .line 114
    const/4 v11, 0x2

    .line 115
    if-ne v8, v11, :cond_7

    .line 116
    .line 117
    aget-object v8, v4, v2

    .line 118
    .line 119
    invoke-static {v8, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v8

    .line 123
    if-eqz v8, :cond_7

    .line 124
    .line 125
    aget-object v8, v4, v7

    .line 126
    .line 127
    invoke-static {v8, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v8

    .line 131
    if-eqz v8, :cond_7

    .line 132
    .line 133
    new-array v5, v11, [Ljava/lang/Object;

    .line 134
    .line 135
    aput-object p1, v5, v2

    .line 136
    .line 137
    aput-object v9, v5, v7

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_7
    array-length v8, v4

    .line 141
    const/4 v12, 0x3

    .line 142
    if-ne v8, v12, :cond_9

    .line 143
    .line 144
    aget-object v8, v4, v2

    .line 145
    .line 146
    invoke-static {v8, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v8

    .line 150
    if-eqz v8, :cond_9

    .line 151
    .line 152
    aget-object v8, v4, v7

    .line 153
    .line 154
    invoke-static {v8, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v8

    .line 158
    if-eqz v8, :cond_9

    .line 159
    .line 160
    aget-object v8, v4, v11

    .line 161
    .line 162
    sget-object v10, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 163
    .line 164
    invoke-static {v8, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v8

    .line 168
    if-nez v8, :cond_8

    .line 169
    .line 170
    aget-object v4, v4, v11

    .line 171
    .line 172
    const-class v8, Ljava/lang/Integer;

    .line 173
    .line 174
    invoke-static {v4, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v4

    .line 178
    if-eqz v4, :cond_9

    .line 179
    .line 180
    :cond_8
    new-array v5, v12, [Ljava/lang/Object;

    .line 181
    .line 182
    aput-object p1, v5, v2

    .line 183
    .line 184
    aput-object v9, v5, v7

    .line 185
    .line 186
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    aput-object v4, v5, v11

    .line 191
    .line 192
    :cond_9
    :goto_2
    if-eqz v5, :cond_0

    .line 193
    .line 194
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    move-result-object v4

    .line 198
    invoke-virtual {v4, v6}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v4

    .line 202
    if-eqz v4, :cond_a

    .line 203
    .line 204
    goto :goto_3

    .line 205
    :cond_a
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v8

    .line 213
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    move-result-object v9

    .line 217
    array-length v10, v9

    .line 218
    invoke-static {v9, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v9

    .line 222
    check-cast v9, [Ljava/lang/Class;

    .line 223
    .line 224
    invoke-static {v4, v8, v9}, Lh/Hchat/utils/KavaReflector;->findDeclaredMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 225
    .line 226
    .line 227
    move-result-object v4

    .line 228
    if-eqz v4, :cond_b

    .line 229
    .line 230
    move-object v3, v4

    .line 231
    goto :goto_3

    .line 232
    :cond_b
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v8

    .line 240
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    array-length v9, v3

    .line 245
    invoke-static {v3, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v3

    .line 249
    check-cast v3, [Ljava/lang/Class;

    .line 250
    .line 251
    invoke-static {v4, v8, v3}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    :goto_3
    if-eqz v3, :cond_0

    .line 256
    .line 257
    array-length v4, v5

    .line 258
    invoke-static {v5, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v4

    .line 262
    invoke-static {v3, v6, v4}, Lh/Hchat/utils/KavaReflector;->invokeSuccessfully(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result v3

    .line 266
    if-eqz v3, :cond_0

    .line 267
    .line 268
    return v7

    .line 269
    :cond_c
    return v2
.end method

.method public m(Ljava/lang/String;)Z
    .locals 13

    .line 1
    iget-object v0, p0, Lbb/b;->e:Ljava/lang/reflect/GenericDeclaration;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Class;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    const/16 v3, 0xb6

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_2

    .line 13
    :cond_0
    :try_start_0
    iget-object v0, p0, Lbb/b;->a:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lr8/g;

    .line 16
    .line 17
    iget-object v0, v0, Lr8/g;->e:Lh/Hchat/dexkit/DexFinder;

    .line 18
    .line 19
    const-string v5, "/cgi-bin/micromsg-bin/getcontact"

    .line 20
    .line 21
    invoke-virtual {v0, v5, v3}, Lh/Hchat/dexkit/DexFinder;->findNativeNetSceneClass(Ljava/lang/String;I)Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    iget-object v5, p0, Lbb/b;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v5, Lab/b;

    .line 30
    .line 31
    const-string v6, "\u5b9a\u4f4d\u8054\u7cfb\u4eba\u8d44\u6599\u8bf7\u6c42\u5931\u8d25"

    .line 32
    .line 33
    invoke-virtual {v5, v6, v0}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-object v0, v4

    .line 37
    :goto_0
    if-eqz v0, :cond_1

    .line 38
    .line 39
    iput-object v0, p0, Lbb/b;->e:Ljava/lang/reflect/GenericDeclaration;

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move-object v0, v4

    .line 43
    :goto_1
    if-eqz v0, :cond_d

    .line 44
    .line 45
    :goto_2
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredConstructors(Ljava/lang/Class;)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-eqz v5, :cond_d

    .line 58
    .line 59
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    check-cast v5, Ljava/lang/reflect/Constructor;

    .line 64
    .line 65
    invoke-virtual {v5}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    if-eqz v6, :cond_3

    .line 70
    .line 71
    array-length v7, v6

    .line 72
    if-nez v7, :cond_4

    .line 73
    .line 74
    :cond_3
    move-object v7, v4

    .line 75
    goto/16 :goto_7

    .line 76
    .line 77
    :cond_4
    array-length v7, v6

    .line 78
    new-array v7, v7, [Ljava/lang/Object;

    .line 79
    .line 80
    array-length v8, v6

    .line 81
    move v9, v2

    .line 82
    move v10, v9

    .line 83
    :goto_3
    if-lt v9, v8, :cond_5

    .line 84
    .line 85
    if-eqz v10, :cond_3

    .line 86
    .line 87
    goto :goto_7

    .line 88
    :cond_5
    aget-object v11, v6, v9

    .line 89
    .line 90
    const-class v12, Ljava/lang/String;

    .line 91
    .line 92
    invoke-static {v11, v12}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v12

    .line 96
    if-eqz v12, :cond_6

    .line 97
    .line 98
    aput-object p1, v7, v9

    .line 99
    .line 100
    move v10, v1

    .line 101
    goto :goto_6

    .line 102
    :cond_6
    sget-object v12, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 103
    .line 104
    invoke-static {v11, v12}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v12

    .line 108
    if-nez v12, :cond_b

    .line 109
    .line 110
    const-class v12, Ljava/lang/Integer;

    .line 111
    .line 112
    invoke-static {v11, v12}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v12

    .line 116
    if-eqz v12, :cond_7

    .line 117
    .line 118
    goto :goto_5

    .line 119
    :cond_7
    sget-object v12, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 120
    .line 121
    invoke-static {v11, v12}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v12

    .line 125
    if-nez v12, :cond_a

    .line 126
    .line 127
    const-class v12, Ljava/lang/Long;

    .line 128
    .line 129
    invoke-static {v11, v12}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v12

    .line 133
    if-eqz v12, :cond_8

    .line 134
    .line 135
    goto :goto_4

    .line 136
    :cond_8
    sget-object v12, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 137
    .line 138
    invoke-static {v11, v12}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v12

    .line 142
    if-nez v12, :cond_9

    .line 143
    .line 144
    const-class v12, Ljava/lang/Boolean;

    .line 145
    .line 146
    invoke-static {v11, v12}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v11

    .line 150
    if-eqz v11, :cond_3

    .line 151
    .line 152
    :cond_9
    sget-object v11, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 153
    .line 154
    aput-object v11, v7, v9

    .line 155
    .line 156
    goto :goto_6

    .line 157
    :cond_a
    :goto_4
    const-wide/16 v11, 0x0

    .line 158
    .line 159
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 160
    .line 161
    .line 162
    move-result-object v11

    .line 163
    aput-object v11, v7, v9

    .line 164
    .line 165
    goto :goto_6

    .line 166
    :cond_b
    :goto_5
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 167
    .line 168
    .line 169
    move-result-object v11

    .line 170
    aput-object v11, v7, v9

    .line 171
    .line 172
    :goto_6
    add-int/lit8 v9, v9, 0x1

    .line 173
    .line 174
    goto :goto_3

    .line 175
    :goto_7
    if-eqz v7, :cond_2

    .line 176
    .line 177
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    invoke-static {v5, v6}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    if-eqz v5, :cond_2

    .line 186
    .line 187
    const/4 v6, -0x1

    .line 188
    :try_start_1
    const-string v7, "getType"

    .line 189
    .line 190
    new-array v8, v2, [Ljava/lang/Object;

    .line 191
    .line 192
    invoke-static {v5, v7, v8}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v7

    .line 196
    instance-of v8, v7, Ljava/lang/Number;

    .line 197
    .line 198
    if-eqz v8, :cond_c

    .line 199
    .line 200
    check-cast v7, Ljava/lang/Number;

    .line 201
    .line 202
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 203
    .line 204
    .line 205
    move-result v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 206
    :catchall_1
    :cond_c
    if-ne v6, v3, :cond_2

    .line 207
    .line 208
    move-object v4, v5

    .line 209
    :cond_d
    if-eqz v4, :cond_f

    .line 210
    .line 211
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->network()Lm8/a;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    if-eqz p1, :cond_f

    .line 216
    .line 217
    iget-object p1, p1, Lm8/a;->a:Lm8/c;

    .line 218
    .line 219
    invoke-virtual {p1, v4}, Lm8/c;->j(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result p1

    .line 223
    if-ne p1, v1, :cond_e

    .line 224
    .line 225
    goto :goto_8

    .line 226
    :cond_e
    move v1, v2

    .line 227
    :goto_8
    move v2, v1

    .line 228
    :cond_f
    return v2
.end method

.method public n(Ljava/lang/String;)Lj8/r;
    .locals 13

    .line 1
    const-string v0, "totallen"

    .line 2
    .line 3
    iget-object v1, p0, Lbb/b;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lh/Hchat/dexkit/DexFinder;

    .line 6
    .line 7
    iget-object v1, v1, Lh/Hchat/dexkit/DexFinder;->videoInfoByFileNameMethod:Ljava/lang/reflect/Method;

    .line 8
    .line 9
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x0

    .line 14
    if-nez v2, :cond_b

    .line 15
    .line 16
    if-eqz v1, :cond_b

    .line 17
    .line 18
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    goto/16 :goto_5

    .line 25
    .line 26
    :cond_0
    :try_start_0
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {v1, v3, p1}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    if-nez p1, :cond_1

    .line 35
    .line 36
    goto/16 :goto_5

    .line 37
    .line 38
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iget-object v2, p0, Lbb/b;->e:Ljava/lang/reflect/GenericDeclaration;

    .line 43
    .line 44
    check-cast v2, Ljava/lang/reflect/Method;

    .line 45
    .line 46
    if-eqz v2, :cond_2

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {v4, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz v4, :cond_2

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    move-object v2, v3

    .line 68
    :cond_3
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-eqz v4, :cond_6

    .line 73
    .line 74
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    check-cast v4, Ljava/lang/reflect/Method;

    .line 79
    .line 80
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    array-length v5, v5

    .line 85
    if-nez v5, :cond_3

    .line 86
    .line 87
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    const-class v6, Landroid/content/ContentValues;

    .line 92
    .line 93
    if-eq v5, v6, :cond_4

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_4
    if-eqz v2, :cond_5

    .line 97
    .line 98
    move-object v2, v3

    .line 99
    goto :goto_1

    .line 100
    :cond_5
    invoke-static {v4}, Lh/Hchat/utils/KavaReflector;->accessible(Ljava/lang/reflect/Method;)Ljava/lang/reflect/Method;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    goto :goto_0

    .line 105
    :cond_6
    iput-object v2, p0, Lbb/b;->e:Ljava/lang/reflect/GenericDeclaration;

    .line 106
    .line 107
    :goto_1
    const/4 v1, 0x0

    .line 108
    new-array v4, v1, [Ljava/lang/Object;

    .line 109
    .line 110
    invoke-static {v2, p1, v4}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    check-cast p1, Landroid/content/ContentValues;

    .line 115
    .line 116
    if-nez p1, :cond_7

    .line 117
    .line 118
    goto/16 :goto_5

    .line 119
    .line 120
    :cond_7
    const-string v2, "reserved4"

    .line 121
    .line 122
    invoke-virtual {p1, v2}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    invoke-virtual {p0, v2}, Lbb/b;->g(Ljava/lang/String;)Ljava/util/LinkedHashMap;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    const-string v4, "md5"

    .line 131
    .line 132
    invoke-virtual {v2, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    check-cast v4, Ljava/lang/String;

    .line 137
    .line 138
    const-string v5, "newmd5"

    .line 139
    .line 140
    invoke-virtual {v2, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    check-cast v5, Ljava/lang/String;

    .line 145
    .line 146
    const-string v6, "videomd5"

    .line 147
    .line 148
    invoke-virtual {p1, v6}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    filled-new-array {v4, v5, v6}, [Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    invoke-static {v4}, Lbb/b;->b([Ljava/lang/String;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    const-string v4, "cdnvideourl"

    .line 161
    .line 162
    invoke-virtual {v2, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    check-cast v4, Ljava/lang/String;

    .line 167
    .line 168
    filled-new-array {v4}, [Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    invoke-static {v4}, Lbb/b;->b([Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v7

    .line 176
    const-string v4, "aeskey"

    .line 177
    .line 178
    invoke-virtual {v2, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    check-cast v4, Ljava/lang/String;

    .line 183
    .line 184
    filled-new-array {v4}, [Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    invoke-static {v4}, Lbb/b;->b([Ljava/lang/String;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v8

    .line 192
    const-string v4, "length"

    .line 193
    .line 194
    invoke-virtual {v2, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v4

    .line 198
    invoke-static {v4}, Lbb/b;->h(Ljava/lang/Object;)J

    .line 199
    .line 200
    .line 201
    move-result-wide v4

    .line 202
    invoke-virtual {v2, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    invoke-static {v2}, Lbb/b;->h(Ljava/lang/Object;)J

    .line 207
    .line 208
    .line 209
    move-result-wide v9

    .line 210
    invoke-virtual {p1, v0}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-static {v0}, Lbb/b;->h(Ljava/lang/Object;)J

    .line 215
    .line 216
    .line 217
    move-result-wide v11

    .line 218
    const/4 v0, 0x3

    .line 219
    new-array v2, v0, [J

    .line 220
    .line 221
    aput-wide v4, v2, v1

    .line 222
    .line 223
    const/4 v4, 0x1

    .line 224
    aput-wide v9, v2, v4

    .line 225
    .line 226
    const/4 v4, 0x2

    .line 227
    aput-wide v11, v2, v4

    .line 228
    .line 229
    :goto_2
    const-wide/16 v4, 0x0

    .line 230
    .line 231
    if-ge v1, v0, :cond_9

    .line 232
    .line 233
    aget-wide v9, v2, v1

    .line 234
    .line 235
    cmp-long v11, v9, v4

    .line 236
    .line 237
    if-lez v11, :cond_8

    .line 238
    .line 239
    goto :goto_3

    .line 240
    :cond_8
    add-int/lit8 v1, v1, 0x1

    .line 241
    .line 242
    goto :goto_2

    .line 243
    :catchall_0
    move-exception v0

    .line 244
    move-object p1, v0

    .line 245
    goto :goto_4

    .line 246
    :cond_9
    move-wide v9, v4

    .line 247
    :goto_3
    const-string v0, "filenowsize"

    .line 248
    .line 249
    invoke-virtual {p1, v0}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    invoke-static {p1}, Lbb/b;->h(Ljava/lang/Object;)J

    .line 254
    .line 255
    .line 256
    move-result-wide v0

    .line 257
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 258
    .line 259
    .line 260
    move-result p1

    .line 261
    if-eqz p1, :cond_a

    .line 262
    .line 263
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 264
    .line 265
    .line 266
    move-result p1

    .line 267
    if-eqz p1, :cond_a

    .line 268
    .line 269
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 270
    .line 271
    .line 272
    move-result p1

    .line 273
    if-eqz p1, :cond_a

    .line 274
    .line 275
    cmp-long p1, v9, v4

    .line 276
    .line 277
    if-gtz p1, :cond_a

    .line 278
    .line 279
    cmp-long p1, v0, v4

    .line 280
    .line 281
    if-gtz p1, :cond_a

    .line 282
    .line 283
    goto :goto_5

    .line 284
    :cond_a
    new-instance v5, Lj8/r;

    .line 285
    .line 286
    invoke-direct/range {v5 .. v10}, Lj8/r;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 287
    .line 288
    .line 289
    return-object v5

    .line 290
    :goto_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 291
    .line 292
    const-string v1, "\u8bfb\u53d6\u89c6\u9891\u4e0b\u8f7d\u4fe1\u606f\u5931\u8d25: "

    .line 293
    .line 294
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object p1

    .line 301
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object p1

    .line 308
    invoke-virtual {p0, p1}, Lbb/b;->c(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    :cond_b
    :goto_5
    return-object v3
.end method

.method public o(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    iget-object v0, p0, Lbb/b;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lh/Hchat/dexkit/DexFinder;

    .line 4
    .line 5
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const-string v2, ""

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    goto/16 :goto_1

    .line 14
    .line 15
    :cond_0
    new-instance v1, Ljava/io/File;

    .line 16
    .line 17
    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    return-object p1

    .line 31
    :cond_1
    iget-object v1, v0, Lh/Hchat/dexkit/DexFinder;->videoPathMethod:Ljava/lang/reflect/Method;

    .line 32
    .line 33
    if-nez v1, :cond_2

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_2
    :try_start_0
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    const/4 v4, 0x0

    .line 41
    if-eqz v3, :cond_3

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_3
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    invoke-static {v0, v5}, Lig/a;->A(Lh/Hchat/dexkit/DexFinder;Ljava/lang/Class;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    if-eqz v6, :cond_4

    .line 53
    .line 54
    move-object v4, v6

    .line 55
    goto :goto_0

    .line 56
    :cond_4
    iget-object v0, v0, Lh/Hchat/dexkit/DexFinder;->videoPathOwnerGetterMethod:Ljava/lang/reflect/Method;

    .line 57
    .line 58
    if-eqz v0, :cond_6

    .line 59
    .line 60
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-eqz v6, :cond_6

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    array-length v6, v6

    .line 71
    if-nez v6, :cond_6

    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    if-nez v6, :cond_5

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_5
    const/4 v6, 0x0

    .line 85
    new-array v6, v6, [Ljava/lang/Object;

    .line 86
    .line 87
    invoke-static {v0, v4, v6}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v5, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    if-eqz v5, :cond_6

    .line 96
    .line 97
    move-object v4, v0

    .line 98
    :cond_6
    :goto_0
    if-nez v3, :cond_7

    .line 99
    .line 100
    if-nez v4, :cond_7

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_7
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-static {v1, v4, p1}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    instance-of v0, p1, Ljava/lang/String;

    .line 112
    .line 113
    if-nez v0, :cond_8

    .line 114
    .line 115
    :goto_1
    return-object v2

    .line 116
    :cond_8
    check-cast p1, Ljava/lang/String;

    .line 117
    .line 118
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {p0, v0, p1}, Lbb/b;->d(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 130
    return-object p1

    .line 131
    :catchall_0
    move-exception p1

    .line 132
    new-instance v0, Ljava/lang/StringBuilder;

    .line 133
    .line 134
    const-string v1, "\u89e3\u6790\u89c6\u9891\u6d88\u606f\u8def\u5f84\u5931\u8d25: "

    .line 135
    .line 136
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-virtual {p0, p1}, Lbb/b;->c(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    return-object v2
.end method

.method public p(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lbb/b;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lr8/g;

    .line 4
    .line 5
    iget-object v0, v0, Lr8/g;->e:Lh/Hchat/dexkit/DexFinder;

    .line 6
    .line 7
    iget-object v0, v0, Lh/Hchat/dexkit/DexFinder;->getContactServiceGetters:Ljava/util/List;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Ljava/lang/reflect/Method;

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {p1, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-nez v3, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 v3, 0x0

    .line 40
    new-array v3, v3, [Ljava/lang/Object;

    .line 41
    .line 42
    invoke-static {v2, v1, v3}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    if-eqz v2, :cond_0

    .line 47
    .line 48
    invoke-virtual {p1, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_0

    .line 53
    .line 54
    return-object v2

    .line 55
    :cond_2
    return-object v1
.end method

.method public q(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 10

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    iget-object v1, p0, Lbb/b;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroid/content/Context;

    .line 6
    .line 7
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x0

    .line 12
    if-nez v2, :cond_7

    .line 13
    .line 14
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    goto/16 :goto_3

    .line 21
    .line 22
    :cond_0
    invoke-static {p2}, Leh/a;->y(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    new-instance p1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v0, "\u53d1\u9001\u89c6\u9891\u5931\u8d25: \u6587\u4ef6\u4e0d\u5b58\u5728 "

    .line 31
    .line 32
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p0, p1}, Lbb/b;->c(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return v3

    .line 46
    :cond_1
    iget-object v2, p0, Lbb/b;->b:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, Lh/Hchat/dexkit/DexFinder;

    .line 49
    .line 50
    iget-object v2, v2, Lh/Hchat/dexkit/DexFinder;->sendVideoTaskClass:Ljava/lang/Class;

    .line 51
    .line 52
    if-eqz v2, :cond_6

    .line 53
    .line 54
    :try_start_0
    invoke-virtual {p0, p2}, Lbb/b;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-eqz v4, :cond_2

    .line 63
    .line 64
    const-string p1, "\u53d1\u9001\u89c6\u9891\u5931\u8d25: \u7f29\u7565\u56fe\u4e0d\u53ef\u7528"

    .line 65
    .line 66
    invoke-virtual {p0, p1}, Lbb/b;->c(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return v3

    .line 70
    :catchall_0
    move-exception p1

    .line 71
    goto/16 :goto_1

    .line 72
    .line 73
    :cond_2
    invoke-virtual {p0}, Lbb/b;->e()Landroid/os/AsyncTask;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    if-nez v4, :cond_3

    .line 78
    .line 79
    return v3

    .line 80
    :cond_3
    const-string v5, "a"

    .line 81
    .line 82
    const/4 v6, 0x0

    .line 83
    invoke-static {v4, v5, v6}, Lbb/b;->r(Landroid/os/AsyncTask;Ljava/lang/String;Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    const-string v5, "b"

    .line 87
    .line 88
    iget-object v6, p0, Lbb/b;->c:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v6, Lq8/o;

    .line 91
    .line 92
    invoke-virtual {v6}, Lq8/o;->a()Landroid/app/Activity;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    if-eqz v6, :cond_4

    .line 97
    .line 98
    move-object v1, v6

    .line 99
    :cond_4
    invoke-static {v4, v5, v1}, Lbb/b;->r(Landroid/os/AsyncTask;Ljava/lang/String;Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    const-string v1, "c"

    .line 103
    .line 104
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 105
    .line 106
    invoke-static {v4, v1, v5}, Lbb/b;->r(Landroid/os/AsyncTask;Ljava/lang/String;Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    const-string v1, "d"

    .line 110
    .line 111
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    invoke-static {v4, v1, v5}, Lbb/b;->r(Landroid/os/AsyncTask;Ljava/lang/String;Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    const-string v1, "e"

    .line 119
    .line 120
    new-instance v5, Landroid/media/MediaMetadataRetriever;

    .line 121
    .line 122
    invoke-direct {v5}, Landroid/media/MediaMetadataRetriever;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 123
    .line 124
    .line 125
    :try_start_1
    invoke-virtual {v5, p2}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    const/16 v6, 0x9

    .line 129
    .line 130
    invoke-virtual {v5, v6}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 135
    .line 136
    .line 137
    move-result v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 138
    if-eqz v7, :cond_5

    .line 139
    .line 140
    :catchall_1
    :try_start_2
    invoke-virtual {v5}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 141
    .line 142
    .line 143
    :catchall_2
    move v6, v3

    .line 144
    goto :goto_0

    .line 145
    :cond_5
    :try_start_3
    invoke-static {v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 146
    .line 147
    .line 148
    move-result-wide v6

    .line 149
    const-wide/16 v8, 0x3e7

    .line 150
    .line 151
    add-long/2addr v6, v8

    .line 152
    const-wide/16 v8, 0x3e8

    .line 153
    .line 154
    div-long/2addr v6, v8

    .line 155
    const-wide/16 v8, 0x0

    .line 156
    .line 157
    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 158
    .line 159
    .line 160
    move-result-wide v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 161
    long-to-int v6, v6

    .line 162
    :try_start_4
    invoke-virtual {v5}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 163
    .line 164
    .line 165
    :catchall_3
    :goto_0
    :try_start_5
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    invoke-static {v4, v1, v5}, Lbb/b;->r(Landroid/os/AsyncTask;Ljava/lang/String;Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    const-string v1, "f"

    .line 173
    .line 174
    invoke-static {v4, v1, p2}, Lbb/b;->r(Landroid/os/AsyncTask;Ljava/lang/String;Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    const-string p2, "g"

    .line 178
    .line 179
    invoke-static {v4, p2, v2}, Lbb/b;->r(Landroid/os/AsyncTask;Ljava/lang/String;Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    const-string p2, "h"

    .line 183
    .line 184
    invoke-static {v4, p2, p1}, Lbb/b;->r(Landroid/os/AsyncTask;Ljava/lang/String;Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    const-string p1, "i"

    .line 188
    .line 189
    invoke-static {v4, p1, v0}, Lbb/b;->r(Landroid/os/AsyncTask;Ljava/lang/String;Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    const-string p1, "p"

    .line 193
    .line 194
    invoke-static {v4, p1, v0}, Lbb/b;->r(Landroid/os/AsyncTask;Ljava/lang/String;Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    const-string p1, "r"

    .line 198
    .line 199
    invoke-static {v4, p1, v0}, Lbb/b;->r(Landroid/os/AsyncTask;Ljava/lang/String;Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    const-string p1, "s"

    .line 203
    .line 204
    invoke-static {v4, p1, v0}, Lbb/b;->r(Landroid/os/AsyncTask;Ljava/lang/String;Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    const-string p1, "j"

    .line 208
    .line 209
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 210
    .line 211
    invoke-static {v4, p1, p2}, Lbb/b;->r(Landroid/os/AsyncTask;Ljava/lang/String;Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    const-string p1, "l"

    .line 215
    .line 216
    invoke-static {v4, p1, p2}, Lbb/b;->r(Landroid/os/AsyncTask;Ljava/lang/String;Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    const-string p1, "m"

    .line 220
    .line 221
    invoke-static {v4, p1, p2}, Lbb/b;->r(Landroid/os/AsyncTask;Ljava/lang/String;Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    new-array p1, v3, [Ljava/lang/Object;

    .line 225
    .line 226
    invoke-virtual {v4, p1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 227
    .line 228
    .line 229
    const/4 v3, 0x1

    .line 230
    goto :goto_2

    .line 231
    :goto_1
    new-instance p2, Ljava/lang/StringBuilder;

    .line 232
    .line 233
    const-string v0, "\u53d1\u9001\u89c6\u9891\u5f02\u5e38: "

    .line 234
    .line 235
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    invoke-virtual {p0, p1}, Lbb/b;->c(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    :goto_2
    return v3

    .line 253
    :cond_6
    const-string p1, "\u53d1\u9001\u89c6\u9891\u5931\u8d25: API\u672a\u5c31\u7eea"

    .line 254
    .line 255
    invoke-virtual {p0, p1}, Lbb/b;->c(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    return v3

    .line 259
    :cond_7
    :goto_3
    const-string p1, "\u53d1\u9001\u89c6\u9891\u5931\u8d25: talker/videoPath\u4e3a\u7a7a"

    .line 260
    .line 261
    invoke-virtual {p0, p1}, Lbb/b;->c(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    return v3
.end method
