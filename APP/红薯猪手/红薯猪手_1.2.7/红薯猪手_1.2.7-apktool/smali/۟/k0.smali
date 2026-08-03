.class public L۟/k0;
.super L۟/jb;
.source "SourceFile"


# direct methods
.method public static ۥۣ۠(Ljava/io/File;Ljava/io/File;)V
    .locals 4

    .line 1
    const/16 v0, 0x2000

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_6

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v0, L۟/t2;

    .line 25
    .line 26
    const-string v1, "Tried to overwrite the destination, but failed to delete it."

    .line 27
    .line 28
    invoke-direct {v0, p0, p1, v1, v3}, L۟/t2;-><init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    throw v0

    .line 32
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    new-instance v0, L۟/v2;

    .line 46
    .line 47
    const-string v1, "Failed to create target directory."

    .line 48
    .line 49
    invoke-direct {v0, p0, p1, v1}, L۟/v2;-><init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw v0

    .line 53
    :cond_3
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    if-eqz v1, :cond_4

    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 60
    .line 61
    .line 62
    :cond_4
    new-instance v1, Ljava/io/FileInputStream;

    .line 63
    .line 64
    invoke-direct {v1, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 65
    .line 66
    .line 67
    :try_start_0
    new-instance p0, Ljava/io/FileOutputStream;

    .line 68
    .line 69
    invoke-direct {p0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 70
    .line 71
    .line 72
    :try_start_1
    new-array p1, v0, [B

    .line 73
    .line 74
    :goto_1
    invoke-virtual {v1, p1}, Ljava/io/InputStream;->read([B)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-ltz v0, :cond_5

    .line 79
    .line 80
    invoke-virtual {p0, p1, v3, v0}, Ljava/io/OutputStream;->write([BII)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_5
    :try_start_2
    invoke-static {p0, v2}, L۟/jb;->ۥ۟(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 85
    .line 86
    .line 87
    invoke-static {v1, v2}, L۟/jb;->ۥ۟(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 88
    .line 89
    .line 90
    :goto_2
    return-void

    .line 91
    :catchall_0
    move-exception p1

    .line 92
    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 93
    :catchall_1
    move-exception v0

    .line 94
    :try_start_4
    invoke-static {p0, p1}, L۟/jb;->ۥ۟(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 95
    .line 96
    .line 97
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 98
    :catchall_2
    move-exception p0

    .line 99
    :try_start_5
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 100
    :catchall_3
    move-exception p1

    .line 101
    invoke-static {v1, p0}, L۟/jb;->ۥ۟(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 102
    .line 103
    .line 104
    throw p1

    .line 105
    :cond_6
    new-instance p1, L۟/t2;

    .line 106
    .line 107
    const/4 v0, 0x1

    .line 108
    const-string v1, "The source file doesn\'t exist."

    .line 109
    .line 110
    invoke-direct {p1, p0, v2, v1, v0}, L۟/t2;-><init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;I)V

    .line 111
    .line 112
    .line 113
    throw p1
.end method
