.class public final Lj41;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static volatile α:Ljava/lang/ClassLoader;

.field public static final β:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lj41;->β:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    return-void
.end method

.method public static α(Landroid/content/Context;Ljava/util/List;)V
    .locals 6

    .line 1
    const-string v0, "DYHelper"

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_4

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lh41;

    .line 18
    .line 19
    iget-object v2, v1, Lh41;->α:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v2}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-nez v3, :cond_0

    .line 34
    .line 35
    :try_start_0
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v3}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    if-eqz v4, :cond_2

    .line 44
    .line 45
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-eqz v4, :cond_1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    const/4 v4, 0x0

    .line 57
    invoke-virtual {v2, v3, v4, v4}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    .line 58
    .line 59
    .line 60
    new-instance v2, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    const-string v4, "[LIVEPHOTO-MERGE-OFFICIAL-CLEAN] uri="

    .line 66
    .line 67
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-static {v0, v2}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    goto :goto_2

    .line 81
    :catchall_0
    move-exception v2

    .line 82
    goto :goto_3

    .line 83
    :cond_2
    :goto_1
    new-instance v3, Ljava/io/File;

    .line 84
    .line 85
    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-static {p0, v3}, Lj41;->β(Landroid/content/Context;Ljava/io/File;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_3

    .line 96
    .line 97
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 98
    .line 99
    .line 100
    :cond_3
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    new-instance v4, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 111
    .line 112
    .line 113
    const-string v5, "[LIVEPHOTO-MERGE-OFFICIAL-CLEAN] file="

    .line 114
    .line 115
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    const-string v2, ", exists="

    .line 122
    .line 123
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    invoke-static {v0, v2}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    :goto_2
    sget-object v2, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 137
    .line 138
    goto :goto_4

    .line 139
    :goto_3
    new-instance v3, Leo1;

    .line 140
    .line 141
    invoke-direct {v3, v2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 142
    .line 143
    .line 144
    move-object v2, v3

    .line 145
    :goto_4
    invoke-static {v2}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    if-eqz v2, :cond_0

    .line 150
    .line 151
    iget-object v1, v1, Lh41;->β:Ljava/lang/String;

    .line 152
    .line 153
    const-string v3, "[LIVEPHOTO-MERGE-OFFICIAL-CLEAN-FAIL] file="

    .line 154
    .line 155
    invoke-static {v3, v1, v0, v2}, Lnx;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 156
    .line 157
    .line 158
    goto/16 :goto_0

    .line 159
    .line 160
    :cond_4
    return-void
.end method

.method public static β(Landroid/content/Context;Ljava/io/File;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    sget-object v0, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 10
    .line 11
    sget-object v2, Landroid/provider/MediaStore$Video$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 12
    .line 13
    sget-object v3, Landroid/provider/MediaStore$Downloads;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 14
    .line 15
    filled-new-array {v0, v2, v3}, [Landroid/net/Uri;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    move-object v4, v0

    .line 38
    check-cast v4, Landroid/net/Uri;

    .line 39
    .line 40
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    const-string v0, "_id"

    .line 45
    .line 46
    filled-new-array {v0}, [Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    const-string v6, "_data=? OR _display_name=?"

    .line 51
    .line 52
    filled-new-array {v1, p1}, [Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    const/4 v8, 0x0

    .line 57
    invoke-virtual/range {v3 .. v8}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 58
    .line 59
    .line 60
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 61
    const/4 v0, 0x0

    .line 62
    if-eqz v3, :cond_2

    .line 63
    .line 64
    :goto_1
    :try_start_1
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-eqz v5, :cond_1

    .line 69
    .line 70
    const/4 v5, 0x0

    .line 71
    invoke-interface {v3, v5}, Landroid/database/Cursor;->getLong(I)J

    .line 72
    .line 73
    .line 74
    move-result-wide v5

    .line 75
    invoke-static {v4, v5, v6}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    invoke-virtual {v6, v5, v0, v0}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :catchall_0
    move-exception v0

    .line 91
    move-object v4, v0

    .line 92
    goto :goto_2

    .line 93
    :cond_1
    :try_start_2
    invoke-interface {v3}, Ljava/io/Closeable;->close()V

    .line 94
    .line 95
    .line 96
    sget-object v0, Ls62;->α:Ls62;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 97
    .line 98
    goto :goto_4

    .line 99
    :catchall_1
    move-exception v0

    .line 100
    goto :goto_3

    .line 101
    :goto_2
    :try_start_3
    throw v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 102
    :catchall_2
    move-exception v0

    .line 103
    :try_start_4
    invoke-static {v3, v4}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 104
    .line 105
    .line 106
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 107
    :goto_3
    new-instance v3, Leo1;

    .line 108
    .line 109
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 110
    .line 111
    .line 112
    move-object v0, v3

    .line 113
    :cond_2
    :goto_4
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    if-eqz v0, :cond_0

    .line 118
    .line 119
    const-string v3, "DYHelper"

    .line 120
    .line 121
    const-string v4, "[LIVEPHOTO-MERGE-OFFICIAL-MEDIASTORE-CLEAN-FAIL] file="

    .line 122
    .line 123
    invoke-static {v4, p1, v3, v0}, Lnx;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 124
    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_3
    return-void
.end method

.method public static γ(Ljava/io/File;Ljava/lang/String;)V
    .locals 4

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const-string v3, ".raw"

    .line 12
    .line 13
    invoke-static {v2, v3}, Lnx;->θ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :try_start_0
    invoke-static {v0, p1}, Lj41;->δ(Ljava/io/File;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    if-nez p1, :cond_0

    .line 32
    .line 33
    invoke-static {v0, p0}, Ls30;->и(Ljava/io/File;Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    :try_start_1
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 37
    .line 38
    .line 39
    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 40
    if-eqz p0, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception p0

    .line 44
    goto :goto_1

    .line 45
    :cond_0
    :try_start_2
    new-instance v1, Ljava/io/FileOutputStream;

    .line 46
    .line 47
    invoke-direct {v1, p0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 48
    .line 49
    .line 50
    :try_start_3
    sget-object p0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 51
    .line 52
    const/16 v2, 0x64

    .line 53
    .line 54
    invoke-virtual {p1, p0, v2, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 55
    .line 56
    .line 57
    :try_start_4
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 61
    .line 62
    .line 63
    :try_start_5
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    if-eqz p0, :cond_1

    .line 68
    .line 69
    :goto_0
    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 70
    .line 71
    .line 72
    :catchall_1
    :cond_1
    return-void

    .line 73
    :catchall_2
    move-exception p0

    .line 74
    :try_start_6
    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 75
    :catchall_3
    move-exception p1

    .line 76
    :try_start_7
    invoke-static {v1, p0}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 77
    .line 78
    .line 79
    throw p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 80
    :goto_1
    :try_start_8
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eqz p1, :cond_2

    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 87
    .line 88
    .line 89
    :catchall_4
    :cond_2
    throw p0
.end method

.method public static δ(Ljava/io/File;Ljava/lang/String;)V
    .locals 4

    .line 1
    new-instance v0, Ljava/io/FileOutputStream;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    sget-object v1, Lwx;->α:Lt41;

    .line 7
    .line 8
    const-string v1, "User-Agent"

    .line 9
    .line 10
    const-string v2, "Mozilla/5.0"

    .line 11
    .line 12
    new-instance v3, Ll91;

    .line 13
    .line 14
    invoke-direct {v3, v1, v2}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v3}, Lex0;->Λ(Ll91;)Ljava/util/Map;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, "*/*"

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-static {p1, v1, v3, v2}, Lwx;->ε(Ljava/lang/String;Ljava/util/Map;ZLjava/lang/String;)Lvx;

    .line 28
    .line 29
    .line 30
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 31
    const/high16 v1, 0x20000

    .line 32
    .line 33
    :try_start_1
    new-array v1, v1, [B

    .line 34
    .line 35
    :goto_0
    iget-object v2, p1, Lvx;->δ:Ljava/io/BufferedInputStream;

    .line 36
    .line 37
    invoke-virtual {v2, v1}, Ljava/io/InputStream;->read([B)I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-lez v2, :cond_0

    .line 42
    .line 43
    invoke-virtual {v0, v1, v3, v2}, Ljava/io/OutputStream;->write([BII)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception p0

    .line 48
    goto :goto_2

    .line 49
    :cond_0
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V

    .line 53
    .line 54
    .line 55
    :try_start_2
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_1

    .line 60
    .line 61
    invoke-virtual {p0}, Ljava/io/File;->length()J

    .line 62
    .line 63
    .line 64
    move-result-wide v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 65
    const-wide/16 v2, 0x0

    .line 66
    .line 67
    cmp-long p0, v0, v2

    .line 68
    .line 69
    if-lez p0, :cond_1

    .line 70
    .line 71
    invoke-virtual {p1}, Lvx;->α()V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :catchall_1
    move-exception p0

    .line 76
    goto :goto_1

    .line 77
    :cond_1
    :try_start_3
    new-instance p0, Ljava/lang/Exception;

    .line 78
    .line 79
    const-string v0, "\u4e0b\u8f7d\u5185\u5bb9\u4e3a\u7a7a"

    .line 80
    .line 81
    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 85
    :goto_1
    invoke-virtual {p1}, Lvx;->α()V

    .line 86
    .line 87
    .line 88
    throw p0

    .line 89
    :goto_2
    :try_start_4
    invoke-virtual {p1}, Lvx;->α()V

    .line 90
    .line 91
    .line 92
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 93
    :catchall_2
    move-exception p0

    .line 94
    :try_start_5
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 95
    :catchall_3
    move-exception p1

    .line 96
    invoke-static {v0, p0}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 97
    .line 98
    .line 99
    throw p1
.end method

.method public static ε(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    array-length v1, v0

    .line 13
    const/4 v2, 0x0

    .line 14
    move v3, v2

    .line 15
    :goto_0
    const/4 v4, 0x0

    .line 16
    if-ge v3, v1, :cond_1

    .line 17
    .line 18
    aget-object v5, v0, v3

    .line 19
    .line 20
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    invoke-static {v6, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    if-eqz v6, :cond_0

    .line 29
    .line 30
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    array-length v6, v6

    .line 38
    if-nez v6, :cond_0

    .line 39
    .line 40
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-nez v6, :cond_0

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    move-object v5, v4

    .line 55
    :goto_1
    if-nez v5, :cond_4

    .line 56
    .line 57
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    array-length v1, v0

    .line 69
    :goto_2
    if-ge v2, v1, :cond_3

    .line 70
    .line 71
    aget-object v3, v0, v2

    .line 72
    .line 73
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    invoke-static {v5, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    if-eqz v5, :cond_2

    .line 82
    .line 83
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    array-length v5, v5

    .line 91
    if-nez v5, :cond_2

    .line 92
    .line 93
    move-object v5, v3

    .line 94
    goto :goto_3

    .line 95
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_3
    move-object v5, v4

    .line 99
    :goto_3
    if-nez v5, :cond_4

    .line 100
    .line 101
    return-object v4

    .line 102
    :cond_4
    const/4 p1, 0x1

    .line 103
    invoke-virtual {v5, p1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v5, p0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    return-object p0
.end method

.method public static ζ(Ljava/lang/reflect/Method;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "encodeLivePhoto"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    array-length v0, v0

    .line 19
    const/4 v2, 0x3

    .line 20
    if-ne v0, v2, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    aget-object v0, v0, v1

    .line 27
    .line 28
    const-class v2, Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const/4 v3, 0x1

    .line 41
    aget-object v0, v0, v3

    .line 42
    .line 43
    invoke-static {v0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_0

    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    const/4 v0, 0x2

    .line 54
    aget-object p0, p0, v0

    .line 55
    .line 56
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 57
    .line 58
    invoke-static {p0, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-eqz p0, :cond_0

    .line 63
    .line 64
    return v3

    .line 65
    :cond_0
    return v1
.end method

.method public static η(Ljava/lang/Object;)Li41;
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    :goto_0
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const-class v2, Ljava/lang/Object;

    .line 13
    .line 14
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    array-length v3, v2

    .line 25
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-static {v1, v2}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    const/4 v3, 0x1

    .line 46
    const/4 v4, 0x0

    .line 47
    if-eqz v2, :cond_8

    .line 48
    .line 49
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    check-cast v2, Ljava/lang/reflect/Field;

    .line 54
    .line 55
    :try_start_0
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    instance-of v5, v2, Ljava/util/List;

    .line 63
    .line 64
    if-eqz v5, :cond_2

    .line 65
    .line 66
    check-cast v2, Ljava/util/List;

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :catchall_0
    move-exception v2

    .line 70
    goto :goto_3

    .line 71
    :cond_2
    move-object v2, v4

    .line 72
    :goto_1
    if-eqz v2, :cond_4

    .line 73
    .line 74
    new-instance v5, Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    :cond_3
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    if-eqz v6, :cond_5

    .line 88
    .line 89
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    instance-of v7, v6, Ljava/lang/String;

    .line 94
    .line 95
    if-eqz v7, :cond_3

    .line 96
    .line 97
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 98
    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_4
    move-object v5, v4

    .line 102
    goto :goto_4

    .line 103
    :goto_3
    new-instance v5, Leo1;

    .line 104
    .line 105
    invoke-direct {v5, v2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 106
    .line 107
    .line 108
    :cond_5
    :goto_4
    instance-of v2, v5, Leo1;

    .line 109
    .line 110
    if-eqz v2, :cond_6

    .line 111
    .line 112
    move-object v5, v4

    .line 113
    :cond_6
    check-cast v5, Ljava/util/List;

    .line 114
    .line 115
    if-eqz v5, :cond_7

    .line 116
    .line 117
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    if-nez v2, :cond_7

    .line 122
    .line 123
    goto :goto_5

    .line 124
    :cond_7
    move-object v5, v4

    .line 125
    :goto_5
    if-eqz v5, :cond_1

    .line 126
    .line 127
    goto :goto_6

    .line 128
    :cond_8
    move-object v5, v4

    .line 129
    :goto_6
    if-nez v5, :cond_9

    .line 130
    .line 131
    sget-object v5, Ljz;->ε:Ljz;

    .line 132
    .line 133
    :cond_9
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    :cond_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    if-eqz v2, :cond_e

    .line 142
    .line 143
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    check-cast v2, Ljava/lang/reflect/Field;

    .line 148
    .line 149
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 154
    .line 155
    invoke-static {v6, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v6

    .line 159
    if-nez v6, :cond_b

    .line 160
    .line 161
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    const-class v7, Ljava/lang/Integer;

    .line 166
    .line 167
    invoke-static {v6, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v6

    .line 171
    if-nez v6, :cond_b

    .line 172
    .line 173
    move-object v2, v4

    .line 174
    goto :goto_9

    .line 175
    :cond_b
    :try_start_1
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    instance-of v6, v2, Ljava/lang/Integer;

    .line 183
    .line 184
    if-eqz v6, :cond_c

    .line 185
    .line 186
    check-cast v2, Ljava/lang/Integer;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 187
    .line 188
    goto :goto_8

    .line 189
    :catchall_1
    move-exception v2

    .line 190
    goto :goto_7

    .line 191
    :cond_c
    move-object v2, v4

    .line 192
    goto :goto_8

    .line 193
    :goto_7
    new-instance v6, Leo1;

    .line 194
    .line 195
    invoke-direct {v6, v2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 196
    .line 197
    .line 198
    move-object v2, v6

    .line 199
    :goto_8
    instance-of v6, v2, Leo1;

    .line 200
    .line 201
    if-eqz v6, :cond_d

    .line 202
    .line 203
    move-object v2, v4

    .line 204
    :cond_d
    check-cast v2, Ljava/lang/Integer;

    .line 205
    .line 206
    :goto_9
    if-eqz v2, :cond_a

    .line 207
    .line 208
    goto :goto_a

    .line 209
    :cond_e
    move-object v2, v4

    .line 210
    :goto_a
    const/4 v0, 0x0

    .line 211
    if-eqz v2, :cond_f

    .line 212
    .line 213
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 214
    .line 215
    .line 216
    move-result v2

    .line 217
    goto :goto_b

    .line 218
    :cond_f
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    const-string v6, "retCode=(-?\\d+)"

    .line 223
    .line 224
    invoke-static {v6}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 225
    .line 226
    .line 227
    move-result-object v6

    .line 228
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v6, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 235
    .line 236
    .line 237
    move-result-object v6

    .line 238
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    invoke-static {v6, v0, v2}, Lv71;->α(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Lix0;

    .line 242
    .line 243
    .line 244
    move-result-object v2

    .line 245
    if-eqz v2, :cond_10

    .line 246
    .line 247
    invoke-virtual {v2}, Lix0;->α()Ljava/util/List;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    invoke-static {v3, v2}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    check-cast v2, Ljava/lang/String;

    .line 256
    .line 257
    if-eqz v2, :cond_10

    .line 258
    .line 259
    const/16 v6, 0xa

    .line 260
    .line 261
    invoke-static {v2, v6}, Lx02;->Ρ(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    if-eqz v2, :cond_10

    .line 266
    .line 267
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 268
    .line 269
    .line 270
    move-result v2

    .line 271
    goto :goto_b

    .line 272
    :cond_10
    const/high16 v2, -0x80000000

    .line 273
    .line 274
    :goto_b
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 275
    .line 276
    .line 277
    move-result-object v6

    .line 278
    :cond_11
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 279
    .line 280
    .line 281
    move-result v7

    .line 282
    if-eqz v7, :cond_16

    .line 283
    .line 284
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v7

    .line 288
    check-cast v7, Ljava/lang/reflect/Field;

    .line 289
    .line 290
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    move-result-object v8

    .line 294
    const-class v9, Ljava/lang/String;

    .line 295
    .line 296
    invoke-static {v8, v9}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    move-result v8

    .line 300
    if-nez v8, :cond_13

    .line 301
    .line 302
    :cond_12
    move-object v7, v4

    .line 303
    goto :goto_e

    .line 304
    :cond_13
    :try_start_2
    invoke-virtual {v7, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v7, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v7

    .line 311
    instance-of v8, v7, Ljava/lang/String;

    .line 312
    .line 313
    if-eqz v8, :cond_14

    .line 314
    .line 315
    check-cast v7, Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 316
    .line 317
    goto :goto_d

    .line 318
    :catchall_2
    move-exception v7

    .line 319
    goto :goto_c

    .line 320
    :cond_14
    move-object v7, v4

    .line 321
    goto :goto_d

    .line 322
    :goto_c
    new-instance v8, Leo1;

    .line 323
    .line 324
    invoke-direct {v8, v7}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 325
    .line 326
    .line 327
    move-object v7, v8

    .line 328
    :goto_d
    instance-of v8, v7, Leo1;

    .line 329
    .line 330
    if-eqz v8, :cond_15

    .line 331
    .line 332
    move-object v7, v4

    .line 333
    :cond_15
    check-cast v7, Ljava/lang/String;

    .line 334
    .line 335
    if-eqz v7, :cond_12

    .line 336
    .line 337
    invoke-static {v7}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 338
    .line 339
    .line 340
    move-result v8

    .line 341
    if-nez v8, :cond_12

    .line 342
    .line 343
    :goto_e
    if-eqz v7, :cond_11

    .line 344
    .line 345
    goto :goto_f

    .line 346
    :cond_16
    move-object v7, v4

    .line 347
    :goto_f
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 348
    .line 349
    .line 350
    move-result-object v1

    .line 351
    :cond_17
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 352
    .line 353
    .line 354
    move-result v6

    .line 355
    if-eqz v6, :cond_1b

    .line 356
    .line 357
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v6

    .line 361
    check-cast v6, Ljava/lang/reflect/Field;

    .line 362
    .line 363
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    move-result-object v8

    .line 367
    sget-object v9, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 368
    .line 369
    invoke-static {v8, v9}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    move-result v8

    .line 373
    if-nez v8, :cond_18

    .line 374
    .line 375
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 376
    .line 377
    .line 378
    move-result-object v8

    .line 379
    const-class v9, Ljava/lang/Boolean;

    .line 380
    .line 381
    invoke-static {v8, v9}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    move-result v8

    .line 385
    if-nez v8, :cond_18

    .line 386
    .line 387
    move-object v6, v4

    .line 388
    goto :goto_12

    .line 389
    :cond_18
    :try_start_3
    invoke-virtual {v6, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v6, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v6

    .line 396
    instance-of v8, v6, Ljava/lang/Boolean;

    .line 397
    .line 398
    if-eqz v8, :cond_19

    .line 399
    .line 400
    check-cast v6, Ljava/lang/Boolean;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 401
    .line 402
    goto :goto_11

    .line 403
    :catchall_3
    move-exception v6

    .line 404
    goto :goto_10

    .line 405
    :cond_19
    move-object v6, v4

    .line 406
    goto :goto_11

    .line 407
    :goto_10
    new-instance v8, Leo1;

    .line 408
    .line 409
    invoke-direct {v8, v6}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 410
    .line 411
    .line 412
    move-object v6, v8

    .line 413
    :goto_11
    instance-of v8, v6, Leo1;

    .line 414
    .line 415
    if-eqz v8, :cond_1a

    .line 416
    .line 417
    move-object v6, v4

    .line 418
    :cond_1a
    check-cast v6, Ljava/lang/Boolean;

    .line 419
    .line 420
    :goto_12
    if-eqz v6, :cond_17

    .line 421
    .line 422
    move-object v4, v6

    .line 423
    :cond_1b
    if-eqz v4, :cond_1c

    .line 424
    .line 425
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 426
    .line 427
    .line 428
    move-result p0

    .line 429
    goto :goto_13

    .line 430
    :cond_1c
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object p0

    .line 434
    const-string v1, "hasSaveToAlbum=true"

    .line 435
    .line 436
    invoke-static {p0, v1, v0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 437
    .line 438
    .line 439
    move-result p0

    .line 440
    :goto_13
    new-instance v0, Li41;

    .line 441
    .line 442
    invoke-direct {v0, v7, v2, v5, p0}, Li41;-><init>(Ljava/lang/String;ILjava/util/List;Z)V

    .line 443
    .line 444
    .line 445
    return-object v0
.end method

.method public static θ(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lg41;
    .locals 26

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Le41;

    .line 10
    .line 11
    const-string v1, "\u5b98\u65b9\u5408\u5e76\u7f3a\u5c11\u9759\u6001\u56fe\u5019\u9009"

    .line 12
    .line 13
    invoke-direct {v0, v1}, Le41;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    new-instance v0, Le41;

    .line 24
    .line 25
    const-string v1, "\u5b98\u65b9\u5408\u5e76\u7f3a\u5c11\u89c6\u9891\u5019\u9009"

    .line 26
    .line 27
    invoke-direct {v0, v1}, Le41;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_1
    sget-object v0, Lj41;->α:Ljava/lang/ClassLoader;

    .line 32
    .line 33
    const-string v2, "DYHelper"

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x0

    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-nez v0, :cond_2

    .line 48
    .line 49
    const-class v0, Lj41;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    if-nez v0, :cond_2

    .line 56
    .line 57
    move-object v5, v3

    .line 58
    goto :goto_4

    .line 59
    :cond_2
    :try_start_0
    const-string v5, "~795CFE82AE87DC48225355B65A8474AC8888795688CFC505AE0FEA03DD2E4A64886E5A9CE1AA251B943D998A6435981074F0"

    .line 60
    .line 61
    invoke-static {v5}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    invoke-static {v5, v4, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    const-string v5, "Companion"

    .line 70
    .line 71
    invoke-virtual {v0, v5}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {v0, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    if-nez v0, :cond_3

    .line 80
    .line 81
    :goto_0
    move-object v0, v3

    .line 82
    goto :goto_2

    .line 83
    :cond_3
    const-string v5, "ensureReady"

    .line 84
    .line 85
    invoke-static {v0, v5}, Lj41;->ε(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    if-nez v5, :cond_4

    .line 90
    .line 91
    const-string v5, "getOrDefault"

    .line 92
    .line 93
    invoke-static {v0, v5}, Lj41;->ε(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    if-nez v5, :cond_4

    .line 98
    .line 99
    const-string v5, "getOrElse"

    .line 100
    .line 101
    invoke-static {v0, v5}, Lj41;->ε(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    if-nez v5, :cond_4

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :catchall_0
    move-exception v0

    .line 109
    goto :goto_1

    .line 110
    :cond_4
    const-string v0, "albumService"

    .line 111
    .line 112
    invoke-static {v5, v0}, Lj41;->ε(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
    goto :goto_2

    .line 117
    :goto_1
    new-instance v5, Leo1;

    .line 118
    .line 119
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 120
    .line 121
    .line 122
    move-object v0, v5

    .line 123
    :goto_2
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    if-nez v5, :cond_5

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_5
    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    const-string v6, "[LIVEPHOTO-MERGE-OFFICIAL-SERVICE-FAIL] "

    .line 135
    .line 136
    invoke-static {v6, v0, v2, v5}, Lnx;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 137
    .line 138
    .line 139
    move-object v0, v3

    .line 140
    :goto_3
    move-object v5, v0

    .line 141
    :goto_4
    if-nez v5, :cond_6

    .line 142
    .line 143
    new-instance v0, Le41;

    .line 144
    .line 145
    const-string v1, "\u65e0\u6cd5\u83b7\u53d6 IExternalService.albumService"

    .line 146
    .line 147
    invoke-direct {v0, v1}, Le41;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    return-object v0

    .line 151
    :cond_6
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v6

    .line 159
    sget-object v7, Lj41;->β:Ljava/util/concurrent/ConcurrentHashMap;

    .line 160
    .line 161
    invoke-virtual {v7, v6}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v8

    .line 165
    check-cast v8, Ljava/lang/reflect/Method;

    .line 166
    .line 167
    const/4 v9, 0x1

    .line 168
    if-eqz v8, :cond_7

    .line 169
    .line 170
    goto/16 :goto_b

    .line 171
    .line 172
    :cond_7
    move-object v8, v0

    .line 173
    :goto_5
    if-eqz v8, :cond_b

    .line 174
    .line 175
    const-class v10, Ljava/lang/Object;

    .line 176
    .line 177
    invoke-virtual {v8, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v10

    .line 181
    if-nez v10, :cond_b

    .line 182
    .line 183
    invoke-virtual {v8}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 184
    .line 185
    .line 186
    move-result-object v10

    .line 187
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    array-length v11, v10

    .line 191
    move v12, v4

    .line 192
    :goto_6
    if-ge v12, v11, :cond_9

    .line 193
    .line 194
    aget-object v13, v10, v12

    .line 195
    .line 196
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    invoke-static {v13}, Lj41;->ζ(Ljava/lang/reflect/Method;)Z

    .line 200
    .line 201
    .line 202
    move-result v14

    .line 203
    if-eqz v14, :cond_8

    .line 204
    .line 205
    goto :goto_7

    .line 206
    :cond_8
    add-int/lit8 v12, v12, 0x1

    .line 207
    .line 208
    goto :goto_6

    .line 209
    :cond_9
    move-object v13, v3

    .line 210
    :goto_7
    if-eqz v13, :cond_a

    .line 211
    .line 212
    invoke-virtual {v13, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v7, v6, v13}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-object v8, v13

    .line 219
    goto :goto_b

    .line 220
    :cond_a
    invoke-virtual {v8}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    move-result-object v8

    .line 224
    goto :goto_5

    .line 225
    :cond_b
    invoke-virtual {v0}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    array-length v8, v0

    .line 233
    move v10, v4

    .line 234
    :goto_8
    if-ge v10, v8, :cond_f

    .line 235
    .line 236
    aget-object v11, v0, v10

    .line 237
    .line 238
    invoke-virtual {v11}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 239
    .line 240
    .line 241
    move-result-object v11

    .line 242
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    array-length v12, v11

    .line 246
    move v13, v4

    .line 247
    :goto_9
    if-ge v13, v12, :cond_d

    .line 248
    .line 249
    aget-object v14, v11, v13

    .line 250
    .line 251
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    invoke-static {v14}, Lj41;->ζ(Ljava/lang/reflect/Method;)Z

    .line 255
    .line 256
    .line 257
    move-result v15

    .line 258
    if-eqz v15, :cond_c

    .line 259
    .line 260
    goto :goto_a

    .line 261
    :cond_c
    add-int/lit8 v13, v13, 0x1

    .line 262
    .line 263
    goto :goto_9

    .line 264
    :cond_d
    move-object v14, v3

    .line 265
    :goto_a
    if-eqz v14, :cond_e

    .line 266
    .line 267
    invoke-virtual {v14, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v7, v6, v14}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-object v8, v14

    .line 274
    goto :goto_b

    .line 275
    :cond_e
    add-int/lit8 v10, v10, 0x1

    .line 276
    .line 277
    goto :goto_8

    .line 278
    :cond_f
    move-object v8, v3

    .line 279
    :goto_b
    if-nez v8, :cond_10

    .line 280
    .line 281
    new-instance v0, Le41;

    .line 282
    .line 283
    const-string v1, "\u65e0\u6cd5\u5b9a\u4f4d encodeLivePhoto(String,String,long)"

    .line 284
    .line 285
    invoke-direct {v0, v1}, Le41;-><init>(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    return-object v0

    .line 289
    :cond_10
    new-instance v6, Ljava/io/File;

    .line 290
    .line 291
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    const-string v7, "dyhelper_official_livephoto"

    .line 296
    .line 297
    invoke-direct {v6, v0, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    .line 301
    .line 302
    .line 303
    move-result v0

    .line 304
    if-nez v0, :cond_11

    .line 305
    .line 306
    invoke-virtual {v6}, Ljava/io/File;->mkdirs()Z

    .line 307
    .line 308
    .line 309
    :cond_11
    new-instance v7, Ljava/util/ArrayList;

    .line 310
    .line 311
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 312
    .line 313
    .line 314
    move-object/from16 v10, p3

    .line 315
    .line 316
    :try_start_1
    invoke-static {v10, v9}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 317
    .line 318
    .line 319
    move-result-object v11

    .line 320
    move-object/from16 v12, p2

    .line 321
    .line 322
    invoke-static {v12, v9}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 323
    .line 324
    .line 325
    move-result-object v13

    .line 326
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 327
    .line 328
    .line 329
    move-result v0

    .line 330
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 331
    .line 332
    .line 333
    move-result v14
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 334
    const-string v15, ", image="

    .line 335
    .line 336
    const-string v3, ", video="

    .line 337
    .line 338
    const-string v4, "/"

    .line 339
    .line 340
    if-gt v0, v14, :cond_13

    .line 341
    .line 342
    :try_start_2
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 343
    .line 344
    .line 345
    move-result v0

    .line 346
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 347
    .line 348
    .line 349
    move-result v14

    .line 350
    if-le v0, v14, :cond_12

    .line 351
    .line 352
    goto :goto_c

    .line 353
    :cond_12
    move/from16 v16, v9

    .line 354
    .line 355
    move-object/from16 v17, v11

    .line 356
    .line 357
    goto :goto_d

    .line 358
    :catchall_1
    move-exception v0

    .line 359
    move-object/from16 v23, v7

    .line 360
    .line 361
    goto/16 :goto_24

    .line 362
    .line 363
    :cond_13
    :goto_c
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 364
    .line 365
    .line 366
    move-result v0

    .line 367
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 368
    .line 369
    .line 370
    move-result v10

    .line 371
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 372
    .line 373
    .line 374
    move-result v14

    .line 375
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 376
    .line 377
    .line 378
    move-result v12

    .line 379
    move/from16 v16, v9

    .line 380
    .line 381
    new-instance v9, Ljava/lang/StringBuilder;

    .line 382
    .line 383
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 384
    .line 385
    .line 386
    move-object/from16 v17, v11

    .line 387
    .line 388
    const-string v11, "[LIVEPHOTO-MERGE-OFFICIAL-LIMIT] awemeId="

    .line 389
    .line 390
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 400
    .line 401
    .line 402
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 406
    .line 407
    .line 408
    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 412
    .line 413
    .line 414
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    invoke-static {v2, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 425
    .line 426
    .line 427
    :goto_d
    invoke-interface/range {v17 .. v17}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 428
    .line 429
    .line 430
    move-result-object v9

    .line 431
    const/4 v0, 0x0

    .line 432
    const/4 v10, 0x0

    .line 433
    :goto_e
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 434
    .line 435
    .line 436
    move-result v11

    .line 437
    if-eqz v11, :cond_2a

    .line 438
    .line 439
    add-int/lit8 v11, v0, 0x1

    .line 440
    .line 441
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    check-cast v0, Ljava/lang/String;

    .line 446
    .line 447
    const-string v12, "dy_official_lp_video_"

    .line 448
    .line 449
    const-string v14, ".mp4"

    .line 450
    .line 451
    invoke-static {v12, v14, v6}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 452
    .line 453
    .line 454
    move-result-object v12

    .line 455
    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 456
    .line 457
    .line 458
    const-wide/16 v18, 0x0

    .line 459
    .line 460
    :try_start_3
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 461
    .line 462
    .line 463
    invoke-static {v12, v0}, Lj41;->δ(Ljava/io/File;Ljava/lang/String;)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v12}, Ljava/io/File;->exists()Z

    .line 467
    .line 468
    .line 469
    move-result v0

    .line 470
    if-eqz v0, :cond_14

    .line 471
    .line 472
    invoke-virtual {v12}, Ljava/io/File;->length()J

    .line 473
    .line 474
    .line 475
    move-result-wide v20

    .line 476
    cmp-long v0, v20, v18

    .line 477
    .line 478
    if-lez v0, :cond_14

    .line 479
    .line 480
    move/from16 v0, v16

    .line 481
    .line 482
    goto :goto_f

    .line 483
    :catchall_2
    move-exception v0

    .line 484
    goto :goto_10

    .line 485
    :cond_14
    const/4 v0, 0x0

    .line 486
    :goto_f
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 487
    .line 488
    .line 489
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 490
    goto :goto_11

    .line 491
    :goto_10
    :try_start_4
    new-instance v14, Leo1;

    .line 492
    .line 493
    invoke-direct {v14, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 494
    .line 495
    .line 496
    move-object v0, v14

    .line 497
    :goto_11
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 498
    .line 499
    .line 500
    move-result-object v14

    .line 501
    if-nez v14, :cond_15

    .line 502
    .line 503
    goto :goto_12

    .line 504
    :cond_15
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 505
    .line 506
    move-object v10, v14

    .line 507
    :goto_12
    check-cast v0, Ljava/lang/Boolean;

    .line 508
    .line 509
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 510
    .line 511
    .line 512
    move-result v0

    .line 513
    if-eqz v0, :cond_29

    .line 514
    .line 515
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 516
    .line 517
    .line 518
    new-instance v0, Landroid/media/MediaMetadataRetriever;

    .line 519
    .line 520
    invoke-direct {v0}, Landroid/media/MediaMetadataRetriever;-><init>()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 521
    .line 522
    .line 523
    :try_start_5
    invoke-virtual {v12}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 524
    .line 525
    .line 526
    move-result-object v14

    .line 527
    invoke-virtual {v0, v14}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V

    .line 528
    .line 529
    .line 530
    const/16 v14, 0x9

    .line 531
    .line 532
    invoke-virtual {v0, v14}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 533
    .line 534
    .line 535
    move-result-object v14
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 536
    if-eqz v14, :cond_17

    .line 537
    .line 538
    move-object/from16 p2, v0

    .line 539
    .line 540
    const/16 v0, 0xa

    .line 541
    .line 542
    :try_start_6
    invoke-static {v14, v0}, Lx02;->Τ(Ljava/lang/String;I)Ljava/lang/Long;

    .line 543
    .line 544
    .line 545
    move-result-object v0

    .line 546
    if-eqz v0, :cond_18

    .line 547
    .line 548
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 549
    .line 550
    .line 551
    move-result-wide v20

    .line 552
    cmp-long v14, v20, v18

    .line 553
    .line 554
    if-lez v14, :cond_16

    .line 555
    .line 556
    goto :goto_13

    .line 557
    :cond_16
    const/4 v0, 0x0

    .line 558
    :goto_13
    if-eqz v0, :cond_18

    .line 559
    .line 560
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 561
    .line 562
    .line 563
    move-result-wide v20
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 564
    goto :goto_14

    .line 565
    :cond_17
    move-object/from16 p2, v0

    .line 566
    .line 567
    :cond_18
    move-wide/from16 v20, v18

    .line 568
    .line 569
    :goto_14
    :try_start_7
    invoke-virtual/range {p2 .. p2}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 570
    .line 571
    .line 572
    goto :goto_15

    .line 573
    :catchall_3
    move-object/from16 p2, v0

    .line 574
    .line 575
    :catchall_4
    :try_start_8
    invoke-virtual/range {p2 .. p2}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 576
    .line 577
    .line 578
    :catchall_5
    move-wide/from16 v20, v18

    .line 579
    .line 580
    :catchall_6
    :goto_15
    :try_start_9
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 581
    .line 582
    .line 583
    move-result-object v14

    .line 584
    const/4 v0, 0x0

    .line 585
    :goto_16
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 586
    .line 587
    .line 588
    move-result v22

    .line 589
    if-eqz v22, :cond_28

    .line 590
    .line 591
    move-object/from16 p2, v9

    .line 592
    .line 593
    add-int/lit8 v9, v0, 0x1

    .line 594
    .line 595
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 596
    .line 597
    .line 598
    move-result-object v0

    .line 599
    check-cast v0, Ljava/lang/String;

    .line 600
    .line 601
    move-object/from16 p3, v10

    .line 602
    .line 603
    const-string v10, "dy_official_lp_image_"

    .line 604
    .line 605
    move-object/from16 v22, v12

    .line 606
    .line 607
    const-string v12, ".jpg"

    .line 608
    .line 609
    invoke-static {v10, v12, v6}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 610
    .line 611
    .line 612
    move-result-object v10

    .line 613
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 614
    .line 615
    .line 616
    :try_start_a
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 617
    .line 618
    .line 619
    invoke-static {v10, v0}, Lj41;->γ(Ljava/io/File;Ljava/lang/String;)V

    .line 620
    .line 621
    .line 622
    invoke-virtual {v10}, Ljava/io/File;->exists()Z

    .line 623
    .line 624
    .line 625
    move-result v0

    .line 626
    if-eqz v0, :cond_19

    .line 627
    .line 628
    invoke-virtual {v10}, Ljava/io/File;->length()J

    .line 629
    .line 630
    .line 631
    move-result-wide v23

    .line 632
    cmp-long v0, v23, v18

    .line 633
    .line 634
    if-lez v0, :cond_19

    .line 635
    .line 636
    move/from16 v0, v16

    .line 637
    .line 638
    goto :goto_17

    .line 639
    :catchall_7
    move-exception v0

    .line 640
    goto :goto_18

    .line 641
    :cond_19
    const/4 v0, 0x0

    .line 642
    :goto_17
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 643
    .line 644
    .line 645
    move-result-object v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 646
    goto :goto_19

    .line 647
    :goto_18
    :try_start_b
    new-instance v12, Leo1;

    .line 648
    .line 649
    invoke-direct {v12, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 650
    .line 651
    .line 652
    move-object v0, v12

    .line 653
    :goto_19
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 654
    .line 655
    .line 656
    move-result-object v12

    .line 657
    if-nez v12, :cond_1a

    .line 658
    .line 659
    move-object/from16 v12, p3

    .line 660
    .line 661
    goto :goto_1a

    .line 662
    :cond_1a
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 663
    .line 664
    :goto_1a
    check-cast v0, Ljava/lang/Boolean;

    .line 665
    .line 666
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 667
    .line 668
    .line 669
    move-result v0

    .line 670
    if-eqz v0, :cond_27

    .line 671
    .line 672
    invoke-interface/range {v17 .. v17}, Ljava/util/List;->size()I

    .line 673
    .line 674
    .line 675
    move-result v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 676
    move-object/from16 v23, v7

    .line 677
    .line 678
    :try_start_c
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 679
    .line 680
    .line 681
    move-result v7

    .line 682
    move-object/from16 v24, v10

    .line 683
    .line 684
    new-instance v10, Ljava/lang/StringBuilder;

    .line 685
    .line 686
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 687
    .line 688
    .line 689
    move-object/from16 p3, v12

    .line 690
    .line 691
    const-string v12, "[LIVEPHOTO-MERGE-OFFICIAL-TRY] awemeId="

    .line 692
    .line 693
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 694
    .line 695
    .line 696
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 697
    .line 698
    .line 699
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 700
    .line 701
    .line 702
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 703
    .line 704
    .line 705
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 706
    .line 707
    .line 708
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 709
    .line 710
    .line 711
    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 712
    .line 713
    .line 714
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 715
    .line 716
    .line 717
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 718
    .line 719
    .line 720
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 721
    .line 722
    .line 723
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 724
    .line 725
    .line 726
    move-result-object v0

    .line 727
    invoke-static {v2, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_a

    .line 728
    .line 729
    .line 730
    :try_start_d
    invoke-virtual/range {v24 .. v24}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 731
    .line 732
    .line 733
    move-result-object v0

    .line 734
    invoke-virtual/range {v22 .. v22}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 735
    .line 736
    .line 737
    move-result-object v7

    .line 738
    invoke-static/range {v20 .. v21}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 739
    .line 740
    .line 741
    move-result-object v10

    .line 742
    filled-new-array {v0, v7, v10}, [Ljava/lang/Object;

    .line 743
    .line 744
    .line 745
    move-result-object v0

    .line 746
    invoke-virtual {v8, v5, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 747
    .line 748
    .line 749
    move-result-object v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    .line 750
    goto :goto_1b

    .line 751
    :catchall_8
    move-exception v0

    .line 752
    :try_start_e
    new-instance v7, Leo1;

    .line 753
    .line 754
    invoke-direct {v7, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 755
    .line 756
    .line 757
    move-object v0, v7

    .line 758
    :goto_1b
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 759
    .line 760
    .line 761
    move-result-object v7

    .line 762
    if-nez v7, :cond_1b

    .line 763
    .line 764
    move-object/from16 v12, p3

    .line 765
    .line 766
    move-object v7, v0

    .line 767
    goto :goto_1c

    .line 768
    :cond_1b
    move-object v12, v7

    .line 769
    const/4 v7, 0x0

    .line 770
    :goto_1c
    if-nez v7, :cond_1c

    .line 771
    .line 772
    move-object/from16 v24, v2

    .line 773
    .line 774
    move-object/from16 v25, v3

    .line 775
    .line 776
    move-object v10, v12

    .line 777
    move-object/from16 v12, p0

    .line 778
    .line 779
    goto/16 :goto_22

    .line 780
    .line 781
    :cond_1c
    invoke-static {v7}, Lj41;->η(Ljava/lang/Object;)Li41;

    .line 782
    .line 783
    .line 784
    move-result-object v10

    .line 785
    iget v0, v10, Li41;->γ:I

    .line 786
    .line 787
    if-nez v0, :cond_26

    .line 788
    .line 789
    iget-object v0, v10, Li41;->α:Ljava/util/List;

    .line 790
    .line 791
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 792
    .line 793
    .line 794
    move-result v0

    .line 795
    if-nez v0, :cond_26

    .line 796
    .line 797
    invoke-virtual {v10}, Li41;->α()Ljava/util/List;

    .line 798
    .line 799
    .line 800
    move-result-object v0

    .line 801
    new-instance v1, Ljava/util/ArrayList;

    .line 802
    .line 803
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 804
    .line 805
    .line 806
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 807
    .line 808
    .line 809
    move-result-object v3

    .line 810
    :cond_1d
    :goto_1d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 811
    .line 812
    .line 813
    move-result v0

    .line 814
    if-eqz v0, :cond_1f

    .line 815
    .line 816
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 817
    .line 818
    .line 819
    move-result-object v4

    .line 820
    move-object v5, v4

    .line 821
    check-cast v5, Lh41;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_a

    .line 822
    .line 823
    :try_start_f
    iget-object v0, v5, Lh41;->α:Ljava/lang/String;

    .line 824
    .line 825
    invoke-static {v6, v0}, Lj41;->κ(Ljava/io/File;Ljava/lang/String;)V

    .line 826
    .line 827
    .line 828
    sget-object v0, Ls62;->α:Ls62;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_9

    .line 829
    .line 830
    goto :goto_1e

    .line 831
    :catchall_9
    move-exception v0

    .line 832
    :try_start_10
    new-instance v8, Leo1;

    .line 833
    .line 834
    invoke-direct {v8, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 835
    .line 836
    .line 837
    move-object v0, v8

    .line 838
    :goto_1e
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 839
    .line 840
    .line 841
    move-result-object v8

    .line 842
    if-eqz v8, :cond_1e

    .line 843
    .line 844
    iget-object v5, v5, Lh41;->β:Ljava/lang/String;

    .line 845
    .line 846
    invoke-virtual {v8}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 847
    .line 848
    .line 849
    move-result-object v8

    .line 850
    new-instance v9, Ljava/lang/StringBuilder;

    .line 851
    .line 852
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 853
    .line 854
    .line 855
    const-string v11, "[LIVEPHOTO-MERGE-OFFICIAL-INVALID] file="

    .line 856
    .line 857
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 858
    .line 859
    .line 860
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 861
    .line 862
    .line 863
    const-string v5, ", err="

    .line 864
    .line 865
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 866
    .line 867
    .line 868
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 869
    .line 870
    .line 871
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 872
    .line 873
    .line 874
    move-result-object v5

    .line 875
    invoke-static {v2, v5}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 876
    .line 877
    .line 878
    goto :goto_1f

    .line 879
    :catchall_a
    move-exception v0

    .line 880
    goto/16 :goto_24

    .line 881
    .line 882
    :cond_1e
    :goto_1f
    instance-of v0, v0, Leo1;

    .line 883
    .line 884
    if-nez v0, :cond_1d

    .line 885
    .line 886
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 887
    .line 888
    .line 889
    goto :goto_1d

    .line 890
    :cond_1f
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 891
    .line 892
    .line 893
    move-result v0

    .line 894
    if-nez v0, :cond_22

    .line 895
    .line 896
    new-instance v0, Lf41;

    .line 897
    .line 898
    invoke-direct {v0, v1}, Lf41;-><init>(Ljava/util/ArrayList;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_a

    .line 899
    .line 900
    .line 901
    invoke-virtual/range {v23 .. v23}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 902
    .line 903
    .line 904
    move-result-object v1

    .line 905
    :catchall_b
    :cond_20
    :goto_20
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 906
    .line 907
    .line 908
    move-result v2

    .line 909
    if-eqz v2, :cond_21

    .line 910
    .line 911
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 912
    .line 913
    .line 914
    move-result-object v2

    .line 915
    check-cast v2, Ljava/io/File;

    .line 916
    .line 917
    :try_start_11
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 918
    .line 919
    .line 920
    move-result v3

    .line 921
    if-eqz v3, :cond_20

    .line 922
    .line 923
    invoke-virtual {v2}, Ljava/io/File;->delete()Z
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_b

    .line 924
    .line 925
    .line 926
    goto :goto_20

    .line 927
    :cond_21
    return-object v0

    .line 928
    :cond_22
    :try_start_12
    invoke-virtual {v10}, Li41;->α()Ljava/util/List;

    .line 929
    .line 930
    .line 931
    move-result-object v0

    .line 932
    move-object/from16 v12, p0

    .line 933
    .line 934
    invoke-static {v12, v0}, Lj41;->α(Landroid/content/Context;Ljava/util/List;)V

    .line 935
    .line 936
    .line 937
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 938
    .line 939
    new-instance v1, Ljava/lang/StringBuilder;

    .line 940
    .line 941
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 942
    .line 943
    .line 944
    const-string v2, "\u5b98\u65b9\u5408\u5e76\u8fd4\u56de\u6210\u529f\u4f46\u4ea7\u7269\u672a\u5305\u542b\u53ef\u64ad\u653e\u89c6\u9891: "

    .line 945
    .line 946
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 947
    .line 948
    .line 949
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 950
    .line 951
    .line 952
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 953
    .line 954
    .line 955
    move-result-object v1

    .line 956
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 957
    .line 958
    .line 959
    new-instance v1, Le41;

    .line 960
    .line 961
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 962
    .line 963
    .line 964
    move-result-object v0

    .line 965
    if-nez v0, :cond_23

    .line 966
    .line 967
    const-string v0, "\u5b98\u65b9\u5408\u5e76\u4ea7\u7269\u6821\u9a8c\u5931\u8d25"

    .line 968
    .line 969
    :cond_23
    invoke-direct {v1, v0}, Le41;-><init>(Ljava/lang/String;)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_a

    .line 970
    .line 971
    .line 972
    invoke-virtual/range {v23 .. v23}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 973
    .line 974
    .line 975
    move-result-object v0

    .line 976
    :catchall_c
    :cond_24
    :goto_21
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 977
    .line 978
    .line 979
    move-result v2

    .line 980
    if-eqz v2, :cond_25

    .line 981
    .line 982
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 983
    .line 984
    .line 985
    move-result-object v2

    .line 986
    check-cast v2, Ljava/io/File;

    .line 987
    .line 988
    :try_start_13
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 989
    .line 990
    .line 991
    move-result v3

    .line 992
    if-eqz v3, :cond_24

    .line 993
    .line 994
    invoke-virtual {v2}, Ljava/io/File;->delete()Z
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_c

    .line 995
    .line 996
    .line 997
    goto :goto_21

    .line 998
    :cond_25
    return-object v1

    .line 999
    :cond_26
    move-object/from16 v12, p0

    .line 1000
    .line 1001
    :try_start_14
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1002
    .line 1003
    iget v1, v10, Li41;->γ:I

    .line 1004
    .line 1005
    iget-object v10, v10, Li41;->δ:Ljava/lang/String;

    .line 1006
    .line 1007
    move-object/from16 v24, v2

    .line 1008
    .line 1009
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1010
    .line 1011
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1012
    .line 1013
    .line 1014
    move-object/from16 v25, v3

    .line 1015
    .line 1016
    const-string v3, "retCode="

    .line 1017
    .line 1018
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1019
    .line 1020
    .line 1021
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1022
    .line 1023
    .line 1024
    const-string v1, ", msg="

    .line 1025
    .line 1026
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1027
    .line 1028
    .line 1029
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1030
    .line 1031
    .line 1032
    const-string v1, ", result="

    .line 1033
    .line 1034
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1035
    .line 1036
    .line 1037
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1038
    .line 1039
    .line 1040
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v1

    .line 1044
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1045
    .line 1046
    .line 1047
    move-object v10, v0

    .line 1048
    goto :goto_22

    .line 1049
    :cond_27
    move-object/from16 v24, v2

    .line 1050
    .line 1051
    move-object/from16 v25, v3

    .line 1052
    .line 1053
    move-object/from16 v23, v7

    .line 1054
    .line 1055
    move-object/from16 p3, v12

    .line 1056
    .line 1057
    move-object/from16 v12, p0

    .line 1058
    .line 1059
    move-object/from16 v10, p3

    .line 1060
    .line 1061
    :goto_22
    move-object/from16 v1, p1

    .line 1062
    .line 1063
    move v0, v9

    .line 1064
    move-object/from16 v12, v22

    .line 1065
    .line 1066
    move-object/from16 v7, v23

    .line 1067
    .line 1068
    move-object/from16 v2, v24

    .line 1069
    .line 1070
    move-object/from16 v3, v25

    .line 1071
    .line 1072
    move-object/from16 v9, p2

    .line 1073
    .line 1074
    goto/16 :goto_16

    .line 1075
    .line 1076
    :cond_28
    move-object/from16 p3, v10

    .line 1077
    .line 1078
    :cond_29
    move-object/from16 v12, p0

    .line 1079
    .line 1080
    move-object/from16 v24, v2

    .line 1081
    .line 1082
    move-object/from16 v25, v3

    .line 1083
    .line 1084
    move-object/from16 v23, v7

    .line 1085
    .line 1086
    move-object/from16 p2, v9

    .line 1087
    .line 1088
    move-object/from16 v1, p1

    .line 1089
    .line 1090
    move-object/from16 v9, p2

    .line 1091
    .line 1092
    move v0, v11

    .line 1093
    move-object/from16 v7, v23

    .line 1094
    .line 1095
    move-object/from16 v2, v24

    .line 1096
    .line 1097
    move-object/from16 v3, v25

    .line 1098
    .line 1099
    goto/16 :goto_e

    .line 1100
    .line 1101
    :cond_2a
    move-object/from16 v23, v7

    .line 1102
    .line 1103
    new-instance v0, Le41;

    .line 1104
    .line 1105
    if-eqz v10, :cond_2b

    .line 1106
    .line 1107
    invoke-virtual {v10}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1108
    .line 1109
    .line 1110
    move-result-object v1

    .line 1111
    if-nez v1, :cond_2c

    .line 1112
    .line 1113
    :cond_2b
    const-string v1, "\u5b98\u65b9\u5408\u5e76\u6240\u6709\u5019\u9009\u5747\u5931\u8d25"

    .line 1114
    .line 1115
    :cond_2c
    invoke-direct {v0, v1}, Le41;-><init>(Ljava/lang/String;)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_a

    .line 1116
    .line 1117
    .line 1118
    invoke-virtual/range {v23 .. v23}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v1

    .line 1122
    :catchall_d
    :cond_2d
    :goto_23
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1123
    .line 1124
    .line 1125
    move-result v2

    .line 1126
    if-eqz v2, :cond_2e

    .line 1127
    .line 1128
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v2

    .line 1132
    check-cast v2, Ljava/io/File;

    .line 1133
    .line 1134
    :try_start_15
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 1135
    .line 1136
    .line 1137
    move-result v3

    .line 1138
    if-eqz v3, :cond_2d

    .line 1139
    .line 1140
    invoke-virtual {v2}, Ljava/io/File;->delete()Z
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_d

    .line 1141
    .line 1142
    .line 1143
    goto :goto_23

    .line 1144
    :cond_2e
    return-object v0

    .line 1145
    :goto_24
    invoke-virtual/range {v23 .. v23}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v1

    .line 1149
    :catchall_e
    :cond_2f
    :goto_25
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1150
    .line 1151
    .line 1152
    move-result v2

    .line 1153
    if-eqz v2, :cond_30

    .line 1154
    .line 1155
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v2

    .line 1159
    check-cast v2, Ljava/io/File;

    .line 1160
    .line 1161
    :try_start_16
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 1162
    .line 1163
    .line 1164
    move-result v3

    .line 1165
    if-eqz v3, :cond_2f

    .line 1166
    .line 1167
    invoke-virtual {v2}, Ljava/io/File;->delete()Z
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_e

    .line 1168
    .line 1169
    .line 1170
    goto :goto_25

    .line 1171
    :cond_30
    throw v0
.end method

.method public static ι(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lm3;Lbf0;)Ljava/util/List;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-static {p0, p1, p2, p3}, Lj41;->θ(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lg41;

    .line 5
    .line 6
    .line 7
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    goto :goto_0

    .line 9
    :catchall_0
    move-exception p0

    .line 10
    new-instance p2, Leo1;

    .line 11
    .line 12
    invoke-direct {p2, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 13
    .line 14
    .line 15
    move-object p0, p2

    .line 16
    :goto_0
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    if-nez p2, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    new-instance p0, Le41;

    .line 24
    .line 25
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    if-nez p3, :cond_1

    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    :cond_1
    invoke-direct {p0, p3}, Le41;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :goto_1
    check-cast p0, Lg41;

    .line 39
    .line 40
    instance-of p2, p0, Lf41;

    .line 41
    .line 42
    const-string p3, "DYHelper"

    .line 43
    .line 44
    if-eqz p2, :cond_4

    .line 45
    .line 46
    move-object p2, p0

    .line 47
    check-cast p2, Lf41;

    .line 48
    .line 49
    iget-object p2, p2, Lf41;->α:Ljava/util/ArrayList;

    .line 50
    .line 51
    new-instance v0, Ljava/util/ArrayList;

    .line 52
    .line 53
    const/16 v1, 0xa

    .line 54
    .line 55
    invoke-static {p2, v1}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_2

    .line 71
    .line 72
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    check-cast v1, Lh41;

    .line 77
    .line 78
    iget-object v1, v1, Lh41;->β:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_2
    new-instance p2, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    const-string v1, "[LIVEPHOTO-MERGE-OFFICIAL-DONE] awemeId="

    .line 87
    .line 88
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v1, ", saved="

    .line 95
    .line 96
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    invoke-static {p3, p2}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    :try_start_1
    check-cast p0, Lf41;

    .line 110
    .line 111
    iget-object p0, p0, Lf41;->α:Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-virtual {p4, p0}, Lm3;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    check-cast p0, Ljava/util/List;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :catchall_1
    move-exception p0

    .line 121
    new-instance p2, Leo1;

    .line 122
    .line 123
    invoke-direct {p2, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 124
    .line 125
    .line 126
    move-object p0, p2

    .line 127
    :goto_3
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    if-nez p2, :cond_3

    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_3
    new-instance p0, Ljava/lang/StringBuilder;

    .line 135
    .line 136
    const-string p4, "[LIVEPHOTO-MERGE-OFFICIAL-EXPORT-FAIL] awemeId="

    .line 137
    .line 138
    invoke-direct {p0, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    invoke-static {p3, p0, p2}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p5}, Lbf0;->invoke()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    check-cast p0, Ljava/util/List;

    .line 156
    .line 157
    :goto_4
    check-cast p0, Ljava/util/List;

    .line 158
    .line 159
    goto :goto_5

    .line 160
    :cond_4
    check-cast p0, Le41;

    .line 161
    .line 162
    iget-object p0, p0, Le41;->α:Ljava/lang/String;

    .line 163
    .line 164
    const-string p2, "[LIVEPHOTO-MERGE-OFFICIAL-FALLBACK] awemeId="

    .line 165
    .line 166
    const-string p4, ", reason="

    .line 167
    .line 168
    invoke-static {p2, p1, p4, p0, p3}, Lnx;->ψ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p5}, Lbf0;->invoke()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    check-cast p0, Ljava/util/List;

    .line 176
    .line 177
    :goto_5
    return-object p0
.end method

.method public static κ(Ljava/io/File;Ljava/lang/String;)V
    .locals 7

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_4

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    const-wide/16 v3, 0x0

    .line 17
    .line 18
    cmp-long p1, v1, v3

    .line 19
    .line 20
    if-lez p1, :cond_4

    .line 21
    .line 22
    invoke-static {v0}, Ls30;->й(Ljava/io/File;)[B

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    array-length v0, p1

    .line 27
    const/16 v1, 0x10

    .line 28
    .line 29
    if-lt v0, v1, :cond_3

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    aget-byte v0, p1, v0

    .line 33
    .line 34
    const/4 v2, -0x1

    .line 35
    if-ne v0, v2, :cond_3

    .line 36
    .line 37
    const/4 v0, 0x1

    .line 38
    aget-byte v0, p1, v0

    .line 39
    .line 40
    const/16 v3, -0x28

    .line 41
    .line 42
    if-ne v0, v3, :cond_3

    .line 43
    .line 44
    const/4 v0, 0x4

    .line 45
    :goto_0
    add-int/lit8 v3, v0, 0x8

    .line 46
    .line 47
    array-length v4, p1

    .line 48
    if-ge v3, v4, :cond_1

    .line 49
    .line 50
    aget-byte v3, p1, v0

    .line 51
    .line 52
    const/16 v4, 0x66

    .line 53
    .line 54
    if-ne v3, v4, :cond_0

    .line 55
    .line 56
    add-int/lit8 v3, v0, 0x1

    .line 57
    .line 58
    aget-byte v3, p1, v3

    .line 59
    .line 60
    const/16 v4, 0x74

    .line 61
    .line 62
    if-ne v3, v4, :cond_0

    .line 63
    .line 64
    add-int/lit8 v3, v0, 0x2

    .line 65
    .line 66
    aget-byte v3, p1, v3

    .line 67
    .line 68
    const/16 v4, 0x79

    .line 69
    .line 70
    if-ne v3, v4, :cond_0

    .line 71
    .line 72
    add-int/lit8 v3, v0, 0x3

    .line 73
    .line 74
    aget-byte v3, p1, v3

    .line 75
    .line 76
    const/16 v4, 0x70

    .line 77
    .line 78
    if-ne v3, v4, :cond_0

    .line 79
    .line 80
    add-int/lit8 v3, v0, -0x4

    .line 81
    .line 82
    aget-byte v4, p1, v3

    .line 83
    .line 84
    and-int/lit16 v4, v4, 0xff

    .line 85
    .line 86
    shl-int/lit8 v4, v4, 0x18

    .line 87
    .line 88
    add-int/lit8 v5, v0, -0x3

    .line 89
    .line 90
    aget-byte v5, p1, v5

    .line 91
    .line 92
    and-int/lit16 v5, v5, 0xff

    .line 93
    .line 94
    shl-int/2addr v5, v1

    .line 95
    or-int/2addr v4, v5

    .line 96
    add-int/lit8 v5, v0, -0x2

    .line 97
    .line 98
    aget-byte v5, p1, v5

    .line 99
    .line 100
    and-int/lit16 v5, v5, 0xff

    .line 101
    .line 102
    const/16 v6, 0x8

    .line 103
    .line 104
    shl-int/2addr v5, v6

    .line 105
    or-int/2addr v4, v5

    .line 106
    add-int/lit8 v5, v0, -0x1

    .line 107
    .line 108
    aget-byte v5, p1, v5

    .line 109
    .line 110
    and-int/lit16 v5, v5, 0xff

    .line 111
    .line 112
    or-int/2addr v4, v5

    .line 113
    if-lt v4, v6, :cond_0

    .line 114
    .line 115
    add-int/2addr v4, v3

    .line 116
    array-length v5, p1

    .line 117
    if-gt v4, v5, :cond_0

    .line 118
    .line 119
    move v2, v3

    .line 120
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_1
    if-lez v2, :cond_2

    .line 124
    .line 125
    array-length v0, p1

    .line 126
    if-ge v2, v0, :cond_2

    .line 127
    .line 128
    const-string v0, "dy_official_lp_check_"

    .line 129
    .line 130
    const-string v1, ".mp4"

    .line 131
    .line 132
    invoke-static {v0, v1, p0}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    :try_start_0
    new-instance v0, Ljava/io/FileOutputStream;

    .line 137
    .line 138
    invoke-direct {v0, p0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 139
    .line 140
    .line 141
    :try_start_1
    array-length v1, p1

    .line 142
    sub-int/2addr v1, v2

    .line 143
    invoke-virtual {v0, p1, v2, v1}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 144
    .line 145
    .line 146
    :try_start_2
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    invoke-static {p0}, Lj41;->λ(Ljava/io/File;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 153
    .line 154
    .line 155
    :try_start_3
    invoke-virtual {p0}, Ljava/io/File;->delete()Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 156
    .line 157
    .line 158
    :catchall_0
    return-void

    .line 159
    :catchall_1
    move-exception p1

    .line 160
    goto :goto_1

    .line 161
    :catchall_2
    move-exception p1

    .line 162
    :try_start_4
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 163
    :catchall_3
    move-exception v1

    .line 164
    :try_start_5
    invoke-static {v0, p1}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 165
    .line 166
    .line 167
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 168
    :goto_1
    :try_start_6
    invoke-virtual {p0}, Ljava/io/File;->delete()Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 169
    .line 170
    .line 171
    :catchall_4
    throw p1

    .line 172
    :cond_2
    new-instance p0, Ljava/lang/Exception;

    .line 173
    .line 174
    const-string p1, "\u5b98\u65b9\u8f93\u51fa\u672a\u627e\u5230\u8ffd\u52a0 MP4"

    .line 175
    .line 176
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    throw p0

    .line 180
    :cond_3
    new-instance p0, Ljava/lang/Exception;

    .line 181
    .line 182
    const-string p1, "\u5b98\u65b9\u8f93\u51fa\u4e0d\u662f\u6709\u6548 JPEG"

    .line 183
    .line 184
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    throw p0

    .line 188
    :cond_4
    new-instance p0, Ljava/lang/Exception;

    .line 189
    .line 190
    const-string p1, "\u5b98\u65b9\u8f93\u51fa\u6587\u4ef6\u4e0d\u5b58\u5728\u6216\u4e3a\u7a7a"

    .line 191
    .line 192
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    throw p0
.end method

.method public static λ(Ljava/io/File;)V
    .locals 8

    .line 1
    new-instance v0, Landroid/media/MediaMetadataRetriever;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {v0, p0}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/16 p0, 0x9

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const-wide/16 v1, 0x0

    .line 20
    .line 21
    const/16 v3, 0xa

    .line 22
    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    invoke-static {p0, v3}, Lx02;->Τ(Ljava/lang/String;I)Ljava/lang/Long;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    if-eqz p0, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 32
    .line 33
    .line 34
    move-result-wide v4

    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception p0

    .line 37
    goto :goto_2

    .line 38
    :cond_0
    move-wide v4, v1

    .line 39
    :goto_0
    const/16 p0, 0x12

    .line 40
    .line 41
    invoke-virtual {v0, p0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    const/4 v6, 0x0

    .line 46
    if-eqz p0, :cond_1

    .line 47
    .line 48
    invoke-static {p0, v3}, Lx02;->Ρ(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    if-eqz p0, :cond_1

    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    goto :goto_1

    .line 59
    :cond_1
    move p0, v6

    .line 60
    :goto_1
    const/16 v7, 0x13

    .line 61
    .line 62
    invoke-virtual {v0, v7}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    if-eqz v7, :cond_2

    .line 67
    .line 68
    invoke-static {v7, v3}, Lx02;->Ρ(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    if-eqz v3, :cond_2

    .line 73
    .line 74
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 75
    .line 76
    .line 77
    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    :cond_2
    cmp-long v1, v4, v1

    .line 79
    .line 80
    if-lez v1, :cond_4

    .line 81
    .line 82
    if-lez p0, :cond_3

    .line 83
    .line 84
    if-lez v6, :cond_3

    .line 85
    .line 86
    :try_start_1
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 87
    .line 88
    .line 89
    :catchall_1
    return-void

    .line 90
    :cond_3
    :try_start_2
    new-instance p0, Ljava/lang/Exception;

    .line 91
    .line 92
    const-string v1, "\u89c6\u9891\u65e0\u6709\u6548\u5c3a\u5bf8"

    .line 93
    .line 94
    invoke-direct {p0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw p0

    .line 98
    :cond_4
    new-instance p0, Ljava/lang/Exception;

    .line 99
    .line 100
    const-string v1, "\u89c6\u9891\u65e0\u6709\u6548\u65f6\u957f"

    .line 101
    .line 102
    invoke-direct {p0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 106
    :goto_2
    :try_start_3
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 107
    .line 108
    .line 109
    :catchall_2
    throw p0
.end method
