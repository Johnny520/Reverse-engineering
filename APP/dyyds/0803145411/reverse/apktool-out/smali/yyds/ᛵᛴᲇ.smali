.class public final Lyyds/ᛵᛴᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛱᲈᲁ:Lyyds/ᲇᛵᲁᛳ;

.field public static ᛲᛴᛳᛲ:Ljava/lang/String;

.field public static final ᛲᲈᲁ:Lyyds/ᛵᛴᲇ;

.field public static final ᛵᛸᛸᛷ:Ljava/lang/Object;

.field public static final ᛶᛷᛲᲁ:Landroid/os/Handler;

.field public static ᲀᛲᛳᲀ:J

.field public static final ᲇᲇᲇᛱ:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public static ᲇᲈᛵᛷ:Lyyds/ᛸᛷᛴᛴ;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᛵᛴᲇ;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lyyds/ᛵᛴᲇ;->ᛲᲈᲁ:Lyyds/ᛵᛴᲇ;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lyyds/ᛵᛴᲇ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 14
    .line 15
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lyyds/ᛵᛴᲇ;->ᲇᲇᲇᛱ:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 21
    .line 22
    new-instance v0, Landroid/os/Handler;

    .line 23
    .line 24
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lyyds/ᛵᛴᲇ;->ᛶᛷᛲᲁ:Landroid/os/Handler;

    .line 32
    .line 33
    invoke-static {}, Lyyds/ᛸᛳᛷᛳ;->ᛲᲈᲁ()Lyyds/ᲁᲀᲇᲀ;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sget-object v1, Lyyds/ᛱᲁᛵᛵ;->ᛲᲈᲁ:Lyyds/ᛵᲁᛸᛴ;

    .line 38
    .line 39
    sget-object v1, Lyyds/ᲇᛷᛶᛲ;->ᲇᲈᛵᛷ:Lyyds/ᲇᛷᛶᛲ;

    .line 40
    .line 41
    invoke-static {v0, v1}, Lyyds/ᛴᛶᲀᛲ;->ᛲᛲᲈᲈ(Lyyds/ᲁᛴᛲ;Lyyds/ᲁᛴᛲ;)Lyyds/ᲁᛴᛲ;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v0}, Lyyds/ᲀᛱᛳᲈ;->ᛲᲈᲁ(Lyyds/ᲁᛴᛲ;)Lyyds/ᲇᛵᲁᛳ;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sput-object v0, Lyyds/ᛵᛴᲇ;->ᛱᲈᲁ:Lyyds/ᲇᛵᲁᛳ;

    .line 50
    .line 51
    return-void
.end method

.method public static ᛱᲈᲁ(Landroid/content/Context;Landroid/net/Uri;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    const-wide v1, -0x1ff62e68a836eL

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const-wide p0, -0x1ff69e68a836eL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᲈᛵᛷ(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    :goto_0
    const-wide/16 v1, -0x1

    .line 41
    .line 42
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    const-wide v4, -0x1ff71e68a836eL

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    filled-new-array {p0}, [Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    const/4 v7, 0x0

    .line 60
    const/4 v8, 0x0

    .line 61
    const/4 v6, 0x0

    .line 62
    move-object v4, p1

    .line 63
    invoke-virtual/range {v3 .. v8}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 64
    .line 65
    .line 66
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 67
    if-eqz p0, :cond_3

    .line 68
    .line 69
    :try_start_1
    invoke-interface {p0}, Landroid/database/Cursor;->moveToFirst()Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-eqz p1, :cond_2

    .line 74
    .line 75
    const/4 p1, 0x0

    .line 76
    invoke-interface {p0, p1}, Landroid/database/Cursor;->isNull(I)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-nez v0, :cond_2

    .line 81
    .line 82
    invoke-interface {p0, p1}, Landroid/database/Cursor;->getLong(I)J

    .line 83
    .line 84
    .line 85
    move-result-wide v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 86
    goto :goto_1

    .line 87
    :catchall_0
    move-exception v0

    .line 88
    move-object p1, v0

    .line 89
    goto :goto_2

    .line 90
    :cond_2
    move-wide v3, v1

    .line 91
    :goto_1
    :try_start_2
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 92
    .line 93
    .line 94
    goto :goto_3

    .line 95
    :catchall_1
    move-exception v0

    .line 96
    move-object p0, v0

    .line 97
    goto :goto_4

    .line 98
    :goto_2
    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 99
    :catchall_2
    move-exception v0

    .line 100
    :try_start_4
    invoke-static {p0, p1}, Lyyds/ᛶᛶᲁᲇ;->ᛵᛸᛸᛷ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 101
    .line 102
    .line 103
    throw v0

    .line 104
    :cond_3
    move-wide v3, v1

    .line 105
    :goto_3
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 106
    .line 107
    .line 108
    move-result-object p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 109
    goto :goto_5

    .line 110
    :goto_4
    new-instance p1, Lyyds/ᲈᛵᛵᛴ;

    .line 111
    .line 112
    invoke-direct {p1, p0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 113
    .line 114
    .line 115
    move-object p0, p1

    .line 116
    :goto_5
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    instance-of v0, p0, Lyyds/ᲈᛵᛵᛴ;

    .line 121
    .line 122
    if-eqz v0, :cond_4

    .line 123
    .line 124
    move-object p0, p1

    .line 125
    :cond_4
    check-cast p0, Ljava/lang/Number;

    .line 126
    .line 127
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 128
    .line 129
    .line 130
    move-result-wide p0

    .line 131
    const-wide/16 v0, 0x0

    .line 132
    .line 133
    cmp-long v0, p0, v0

    .line 134
    .line 135
    if-lez v0, :cond_6

    .line 136
    .line 137
    const-wide/32 v0, 0x1400000

    .line 138
    .line 139
    .line 140
    cmp-long p0, p0, v0

    .line 141
    .line 142
    if-gtz p0, :cond_5

    .line 143
    .line 144
    goto :goto_6

    .line 145
    :cond_5
    const-wide p0, -0x1ff77e68a836eL

    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᲈᛵᛷ(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    :cond_6
    :goto_6
    return-void
.end method

.method public static ᛲᛴᛳᛲ(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
    .locals 6

    .line 1
    const-wide v0, -0x1ff01e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    sget-object v0, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sget-object v1, Lyyds/ᛷᛳᛲᛳ;->ᛲᛱᲁᛳ:Lyyds/ᛳᲀᛲ;

    .line 15
    .line 16
    sget-object v2, Lyyds/ᛷᛳᛲᛳ;->ᛵᛸᛸᛷ:[Lyyds/ᲀᛴᛶᲇ;

    .line 17
    .line 18
    const/16 v3, 0x22

    .line 19
    .line 20
    aget-object v2, v2, v3

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Lyyds/ᛳᲀᛲ;->ᛲᲈᲁ(Lyyds/ᲀᛴᛶᲇ;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Ljava/lang/String;

    .line 27
    .line 28
    sget-object v2, Lyyds/ᛵᛴᲇ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 29
    .line 30
    monitor-enter v2

    .line 31
    :try_start_0
    sget-object v3, Lyyds/ᛵᛴᲇ;->ᲇᲈᛵᛷ:Lyyds/ᛸᛷᛴᛴ;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    iget-object v5, v3, Lyyds/ᛸᛷᛴᛴ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v5, v1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-eqz v5, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    move-object v3, v4

    .line 46
    :goto_0
    if-eqz v3, :cond_2

    .line 47
    .line 48
    iget-object v0, v3, Lyyds/ᛸᛷᛴᛴ;->ᛵᛸᛸᛷ:Landroid/graphics/Bitmap;

    .line 49
    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    .line 53
    .line 54
    invoke-direct {v1, p0, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Landroid/graphics/drawable/BitmapDrawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 58
    .line 59
    .line 60
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    goto :goto_1

    .line 62
    :catchall_0
    move-exception p0

    .line 63
    goto :goto_3

    .line 64
    :cond_1
    :goto_1
    monitor-exit v2

    .line 65
    return-object v4

    .line 66
    :cond_2
    monitor-exit v2

    .line 67
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-static {}, Lyyds/ᛷᛳᛲᛳ;->ᲀᲇᛶᲈ()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-static {p0}, Lyyds/ᛲᲇᛸᲇ;->ᲀᛴᲁᲈ(Ljava/lang/CharSequence;)Z

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    if-eqz p0, :cond_3

    .line 79
    .line 80
    monitor-enter v2

    .line 81
    :try_start_1
    new-instance p0, Lyyds/ᛸᛷᛴᛴ;

    .line 82
    .line 83
    invoke-direct {p0, v4, v1}, Lyyds/ᛸᛷᛴᛴ;-><init>(Landroid/graphics/Bitmap;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    sput-object p0, Lyyds/ᛵᛴᲇ;->ᲇᲈᛵᛷ:Lyyds/ᛸᛷᛴᛴ;

    .line 87
    .line 88
    sput-object v4, Lyyds/ᛵᛴᲇ;->ᛲᛴᛳᛲ:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 89
    .line 90
    monitor-exit v2

    .line 91
    return-object v4

    .line 92
    :catchall_1
    move-exception p0

    .line 93
    monitor-exit v2

    .line 94
    throw p0

    .line 95
    :cond_3
    monitor-enter v2

    .line 96
    :try_start_2
    sget-object p0, Lyyds/ᛵᛴᲇ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 97
    .line 98
    invoke-static {p0, v1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    const/4 v0, 0x0

    .line 103
    if-eqz p0, :cond_4

    .line 104
    .line 105
    move p0, v0

    .line 106
    goto :goto_2

    .line 107
    :cond_4
    sput-object v1, Lyyds/ᛵᛴᲇ;->ᛲᛴᛳᛲ:Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 108
    .line 109
    const/4 p0, 0x1

    .line 110
    :goto_2
    monitor-exit v2

    .line 111
    if-nez p0, :cond_5

    .line 112
    .line 113
    return-object v4

    .line 114
    :cond_5
    sget-object p0, Lyyds/ᛵᛴᲇ;->ᛱᲈᲁ:Lyyds/ᲇᛵᲁᛳ;

    .line 115
    .line 116
    new-instance v2, Lyyds/ᛵᛶᛵᲇ;

    .line 117
    .line 118
    invoke-direct {v2, v1, v4, v0}, Lyyds/ᛵᛶᛵᲇ;-><init>(Ljava/lang/String;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 119
    .line 120
    .line 121
    const/4 v0, 0x3

    .line 122
    invoke-static {p0, v4, v2, v0}, Lyyds/ᲀᲀᛸᛱ;->ᛷᲈᲈᲁ(Lyyds/ᛴᲈᛳᲀ;Lyyds/ᲁᛴᛲ;Lyyds/ᛲᲇᲁᛴ;I)Lyyds/ᛲᛲᛵᛸ;

    .line 123
    .line 124
    .line 125
    return-object v4

    .line 126
    :catchall_2
    move-exception p0

    .line 127
    monitor-exit v2

    .line 128
    throw p0

    .line 129
    :goto_3
    monitor-exit v2

    .line 130
    throw p0
.end method

.method public static ᛲᲈᲁ([B)Landroid/graphics/Bitmap;
    .locals 8

    .line 1
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 8
    .line 9
    array-length v2, p0

    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {p0, v3, v2, v0}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 12
    .line 13
    .line 14
    iget v2, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    if-gt v1, v2, :cond_6

    .line 18
    .line 19
    const v5, 0x8001

    .line 20
    .line 21
    .line 22
    if-ge v2, v5, :cond_6

    .line 23
    .line 24
    iget v2, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 25
    .line 26
    if-gt v1, v2, :cond_6

    .line 27
    .line 28
    if-ge v2, v5, :cond_6

    .line 29
    .line 30
    move v2, v1

    .line 31
    :goto_0
    iget v5, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 32
    .line 33
    div-int/2addr v5, v2

    .line 34
    const/16 v6, 0x870

    .line 35
    .line 36
    if-gt v5, v6, :cond_5

    .line 37
    .line 38
    iget v5, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 39
    .line 40
    div-int/2addr v5, v2

    .line 41
    const/16 v6, 0xf00

    .line 42
    .line 43
    if-le v5, v6, :cond_0

    .line 44
    .line 45
    goto/16 :goto_2

    .line 46
    .line 47
    :cond_0
    array-length v0, p0

    .line 48
    new-instance v5, Landroid/graphics/BitmapFactory$Options;

    .line 49
    .line 50
    invoke-direct {v5}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 51
    .line 52
    .line 53
    sget-object v6, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 54
    .line 55
    iput-object v6, v5, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 56
    .line 57
    iput v2, v5, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 58
    .line 59
    iput-boolean v3, v5, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 60
    .line 61
    invoke-static {p0, v3, v0, v5}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    if-nez p0, :cond_1

    .line 66
    .line 67
    return-object v4

    .line 68
    :cond_1
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    int-to-float v0, v0

    .line 73
    const/high16 v2, 0x44870000    # 1080.0f

    .line 74
    .line 75
    div-float/2addr v2, v0

    .line 76
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    int-to-float v0, v0

    .line 81
    const/high16 v4, 0x44f00000    # 1920.0f

    .line 82
    .line 83
    div-float/2addr v4, v0

    .line 84
    invoke-static {v2, v4}, Ljava/lang/Math;->min(FF)F

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    const/high16 v2, 0x3f800000    # 1.0f

    .line 89
    .line 90
    invoke-static {v2, v0}, Ljava/lang/Math;->min(FF)F

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    int-to-float v2, v2

    .line 99
    mul-float/2addr v2, v0

    .line 100
    float-to-int v2, v2

    .line 101
    if-ge v2, v1, :cond_2

    .line 102
    .line 103
    move v2, v1

    .line 104
    :cond_2
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    int-to-float v4, v4

    .line 109
    mul-float/2addr v4, v0

    .line 110
    float-to-int v0, v4

    .line 111
    if-ge v0, v1, :cond_3

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_3
    move v1, v0

    .line 115
    :goto_1
    invoke-static {v2, v1, v6}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    const-wide v4, -0x1ffb4e68a836eL

    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    new-instance v4, Landroid/graphics/Canvas;

    .line 128
    .line 129
    invoke-direct {v4, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 130
    .line 131
    .line 132
    const/high16 v5, -0x1000000

    .line 133
    .line 134
    invoke-virtual {v4, v5}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 135
    .line 136
    .line 137
    new-instance v5, Landroid/graphics/Rect;

    .line 138
    .line 139
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 140
    .line 141
    .line 142
    move-result v6

    .line 143
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 144
    .line 145
    .line 146
    move-result v7

    .line 147
    invoke-direct {v5, v3, v3, v6, v7}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 148
    .line 149
    .line 150
    new-instance v6, Landroid/graphics/RectF;

    .line 151
    .line 152
    int-to-float v2, v2

    .line 153
    int-to-float v1, v1

    .line 154
    const/4 v7, 0x0

    .line 155
    invoke-direct {v6, v7, v7, v2, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 156
    .line 157
    .line 158
    new-instance v1, Landroid/graphics/Paint;

    .line 159
    .line 160
    const/4 v2, 0x7

    .line 161
    invoke-direct {v1, v2}, Landroid/graphics/Paint;-><init>(I)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v4, p0, v5, v6, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 165
    .line 166
    .line 167
    if-eq p0, v0, :cond_4

    .line 168
    .line 169
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    if-nez v1, :cond_4

    .line 174
    .line 175
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    .line 176
    .line 177
    .line 178
    :cond_4
    invoke-virtual {v0, v3}, Landroid/graphics/Bitmap;->setDensity(I)V

    .line 179
    .line 180
    .line 181
    return-object v0

    .line 182
    :cond_5
    :goto_2
    mul-int/lit8 v2, v2, 0x2

    .line 183
    .line 184
    goto/16 :goto_0

    .line 185
    .line 186
    :cond_6
    const-wide v0, -0x1ffa2e68a836eL

    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᲈᛵᛷ(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    return-object v4
.end method

.method public static ᛵᛸᛸᛷ(Landroid/graphics/Bitmap;)[B
    .locals 6

    .line 1
    const/4 v0, 0x7

    .line 2
    new-array v1, v0, [I

    .line 3
    .line 4
    fill-array-data v1, :array_0

    .line 5
    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, v0, :cond_2

    .line 9
    .line 10
    aget v3, v1, v2

    .line 11
    .line 12
    new-instance v4, Ljava/io/ByteArrayOutputStream;

    .line 13
    .line 14
    invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 15
    .line 16
    .line 17
    :try_start_0
    sget-object v5, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 18
    .line 19
    invoke-virtual {p0, v5, v3, v4}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 26
    .line 27
    .line 28
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 30
    .line 31
    .line 32
    array-length v4, v3

    .line 33
    const v5, 0x1e8480

    .line 34
    .line 35
    .line 36
    if-gt v4, v5, :cond_0

    .line 37
    .line 38
    return-object v3

    .line 39
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception p0

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const-wide v0, -0x1ffc6e68a836eL

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    :try_start_1
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 63
    :goto_1
    :try_start_2
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 64
    :catchall_1
    move-exception v0

    .line 65
    invoke-static {v4, p0}, Lyyds/ᛶᛶᲁᲇ;->ᛵᛸᛸᛷ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    throw v0

    .line 69
    :cond_2
    const-wide v0, -0x1ffcde68a836eL

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    const/4 p0, 0x0

    .line 82
    return-object p0

    .line 83
    :array_0
    .array-data 4
        0x58
        0x52
        0x4c
        0x46
        0x3e
        0x36
        0x2e
    .end array-data
.end method

.method public static ᛶᛷᛲᲁ(Landroid/content/Context;Landroid/net/Uri;)[B
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_2

    .line 10
    .line 11
    :try_start_0
    new-instance p1, Ljava/io/ByteArrayOutputStream;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 14
    .line 15
    .line 16
    const/16 v0, 0x4000

    .line 17
    .line 18
    new-array v0, v0, [B

    .line 19
    .line 20
    const-wide/16 v1, 0x0

    .line 21
    .line 22
    :goto_0
    invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-ltz v3, :cond_1

    .line 27
    .line 28
    int-to-long v4, v3

    .line 29
    add-long/2addr v1, v4

    .line 30
    const-wide/32 v4, 0x1400000

    .line 31
    .line 32
    .line 33
    cmp-long v4, v1, v4

    .line 34
    .line 35
    if-gtz v4, :cond_0

    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    invoke-virtual {p1, v0, v4, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    const-wide v0, -0x1ff8de68a836eL

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v0

    .line 63
    :cond_1
    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 64
    .line 65
    .line 66
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 68
    .line 69
    .line 70
    const-wide v0, -0x1ff99e68a836eL

    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    return-object p1

    .line 79
    :goto_1
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 80
    :catchall_1
    move-exception v0

    .line 81
    invoke-static {p0, p1}, Lyyds/ᛶᛶᲁᲇ;->ᛵᛸᛸᛷ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    throw v0

    .line 85
    :cond_2
    const-wide p0, -0x1ff83e68a836eL

    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    const/4 p0, 0x0

    .line 98
    return-object p0
.end method

.method public static ᲀᛲᛳᲀ(Lyyds/ᛷᲁᛷᛵ;)V
    .locals 4

    .line 1
    sget-wide v0, Lyyds/ᛵᛴᲇ;->ᲀᛲᛳᲀ:J

    .line 2
    .line 3
    iget-wide v2, p0, Lyyds/ᛷᲁᛷᛵ;->ᛵᛸᛸᛷ:J

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sget-object v0, Lyyds/ᛷᛳᛲᛳ;->ᛲᛱᲁᛳ:Lyyds/ᛳᲀᛲ;

    .line 15
    .line 16
    sget-object v1, Lyyds/ᛷᛳᛲᛳ;->ᛵᛸᛸᛷ:[Lyyds/ᲀᛴᛶᲇ;

    .line 17
    .line 18
    const/16 v2, 0x22

    .line 19
    .line 20
    aget-object v1, v1, v2

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lyyds/ᛳᲀᛲ;->ᛲᲈᲁ(Lyyds/ᲀᛴᛶᲇ;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Ljava/lang/String;

    .line 27
    .line 28
    iget-object p0, p0, Lyyds/ᛷᲁᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v0, p0}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-eqz p0, :cond_0

    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    new-instance p0, Lyyds/ᛳᲈᛵᛶ;

    .line 40
    .line 41
    const-wide v0, -0x27253e68a836eL

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p0
.end method

.method public static ᲇᲇᲇᛱ()V
    .locals 3

    .line 1
    new-instance v0, Lyyds/ᛱᛳᛳ;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, Lyyds/ᛱᛳᛳ;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-static {v1, v2}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, Lyyds/ᛱᛳᛳ;->run()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    sget-object v1, Lyyds/ᛵᛴᲇ;->ᛶᛷᛲᲁ:Landroid/os/Handler;

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 28
    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final ᲇᲈᛵᛷ(Landroid/content/Context;Landroid/net/Uri;Lyyds/ᛷᲁᛷᛵ;Lyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p4, Lyyds/ᛳᲁᛴᲁ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lyyds/ᛳᲁᛴᲁ;

    .line 7
    .line 8
    iget v1, v0, Lyyds/ᛳᲁᛴᲁ;->ᛱᲈᲁ:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lyyds/ᛳᲁᛴᲁ;->ᛱᲈᲁ:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lyyds/ᛳᲁᛴᲁ;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lyyds/ᛳᲁᛴᲁ;-><init>(Lyyds/ᛵᛴᲇ;Lyyds/ᛶᛴᲀᛲ;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p0, v0, Lyyds/ᛳᲁᛴᲁ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 26
    .line 27
    iget p4, v0, Lyyds/ᛳᲁᛴᲁ;->ᛱᲈᲁ:I

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    if-eqz p4, :cond_2

    .line 31
    .line 32
    if-ne p4, v1, :cond_1

    .line 33
    .line 34
    invoke-static {p0}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const-wide p0, -0x1ff1de68a836eL

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    return-object p0

    .line 52
    :cond_2
    invoke-static {p0}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    sget-object p0, Lyyds/ᛱᲁᛵᛵ;->ᛲᲈᲁ:Lyyds/ᛵᲁᛸᛴ;

    .line 56
    .line 57
    sget-object p0, Lyyds/ᲇᛷᛶᛲ;->ᲇᲈᛵᛷ:Lyyds/ᲇᛷᛶᛲ;

    .line 58
    .line 59
    new-instance v2, Lyyds/ᛵᛱᛱᛵ;

    .line 60
    .line 61
    const/4 v7, 0x2

    .line 62
    const/4 v6, 0x0

    .line 63
    move-object v4, p1

    .line 64
    move-object v5, p2

    .line 65
    move-object v3, p3

    .line 66
    invoke-direct/range {v2 .. v7}, Lyyds/ᛵᛱᛱᛵ;-><init>(Ljava/lang/Object;Landroid/content/Context;Landroid/net/Uri;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 67
    .line 68
    .line 69
    iput v1, v0, Lyyds/ᛳᲁᛴᲁ;->ᛱᲈᲁ:I

    .line 70
    .line 71
    invoke-static {p0, v2, v0}, Lyyds/ᲀᲀᛸᛱ;->ᛶᛳᛶᛵ(Lyyds/ᲁᛴᛲ;Lyyds/ᛲᲇᲁᛴ;Lyyds/ᛲᛱᛶᛸ;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    sget-object p1, Lyyds/ᛸᛴᲁᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛴᲁᛴ;

    .line 76
    .line 77
    if-ne p0, p1, :cond_3

    .line 78
    .line 79
    return-object p1

    .line 80
    :cond_3
    :goto_1
    check-cast p0, Lyyds/ᲁᛶᛱᛵ;

    .line 81
    .line 82
    iget-object p0, p0, Lyyds/ᲁᛶᛱᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 83
    .line 84
    return-object p0
.end method
