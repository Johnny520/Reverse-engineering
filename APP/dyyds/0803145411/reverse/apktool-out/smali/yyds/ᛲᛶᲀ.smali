.class public abstract Lyyds/ᛲᛶᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final ᲀᛲᛳᲀ:Lyyds/ᛱᲈᲀ;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lyyds/ᛷᛲᲈᛲ;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lyyds/ᲇᲁᲀᲁ;->ᲇᲇᲇᛱ:Lyyds/ᲇᲁᲀᲁ;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lyyds/ᛷᛲᲈᛲ;->ᛱᛸᲁᲇ(Lyyds/ᲇᲁᲀᲁ;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, v1, Lyyds/ᲇᲁᲀᲁ;->ᲀᛲᛳᲀ:[B

    .line 12
    .line 13
    array-length v1, v1

    .line 14
    int-to-long v1, v1

    .line 15
    new-instance v3, Lyyds/ᛱᲈᲀ;

    .line 16
    .line 17
    invoke-direct {v3, v1, v2, v0}, Lyyds/ᛱᲈᲀ;-><init>(JLyyds/ᛷᛲᲈᛲ;)V

    .line 18
    .line 19
    .line 20
    sput-object v3, Lyyds/ᛲᛶᲀ;->ᲀᛲᛳᲀ:Lyyds/ᛱᲈᲀ;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public close()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᛲᛶᲀ;->ᛳᲁᲁᲇ()Lyyds/ᛴᲇᛸ;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lyyds/ᛶᲁᛵᛲ;->ᛵᛸᛸᛷ(Ljava/io/Closeable;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final ᛲᲈᲁ()Ljava/io/InputStream;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᛲᛶᲀ;->ᛳᲁᲁᲇ()Lyyds/ᛴᲇᛸ;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Lyyds/ᛴᲇᛸ;->ᲀᛴᲁᲈ()Ljava/io/InputStream;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public abstract ᛳᲁᲁᲇ()Lyyds/ᛴᲇᛸ;
.end method

.method public abstract ᛶᛷᛲᲁ()J
.end method

.method public abstract ᛷᲈᲈᲁ()Lyyds/ᛴᛲᲁᲈ;
.end method

.method public final ᲇᛱᛲ()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lyyds/ᛲᛶᲀ;->ᛳᲁᲁᲇ()Lyyds/ᛴᲇᛸ;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_0
    invoke-virtual {p0}, Lyyds/ᛲᛶᲀ;->ᛷᲈᲈᲁ()Lyyds/ᛴᛲᲁᲈ;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    invoke-static {p0}, Lyyds/ᛴᛲᲁᲈ;->ᛲᲈᲁ(Lyyds/ᛴᛲᲁᲈ;)Ljava/nio/charset/Charset;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    if-nez p0, :cond_1

    .line 17
    .line 18
    :cond_0
    sget-object p0, Lyyds/ᛲᛵᛴᛴ;->ᛲᲈᲁ:Ljava/nio/charset/Charset;

    .line 19
    .line 20
    :cond_1
    invoke-static {v0, p0}, Lyyds/ᛴᛲᛲᲇ;->ᲇᲇᲇᛱ(Lyyds/ᛴᲇᛸ;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-interface {v0, p0}, Lyyds/ᛴᲇᛸ;->ᛱᛳᛶᛳ(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 28
    :try_start_1
    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception v1

    .line 33
    :goto_0
    move-object v2, v1

    .line 34
    move-object v1, p0

    .line 35
    move-object p0, v2

    .line 36
    goto :goto_1

    .line 37
    :catchall_1
    move-exception p0

    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    :try_start_2
    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :catchall_2
    move-exception v0

    .line 45
    invoke-static {p0, v0}, Lyyds/ᛷᛶᛷᛵ;->ᛲᲈᲁ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    :cond_2
    :goto_1
    if-nez p0, :cond_3

    .line 49
    .line 50
    return-object v1

    .line 51
    :cond_3
    throw p0
.end method

.method public final ᲇᲇᲇᛱ()[B
    .locals 6

    .line 1
    invoke-virtual {p0}, Lyyds/ᛲᛶᲀ;->ᛶᛷᛲᲁ()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/32 v2, 0x7fffffff

    .line 6
    .line 7
    .line 8
    cmp-long v2, v0, v2

    .line 9
    .line 10
    if-gtz v2, :cond_4

    .line 11
    .line 12
    invoke-virtual {p0}, Lyyds/ᛲᛶᲀ;->ᛳᲁᲁᲇ()Lyyds/ᛴᲇᛸ;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const/4 v2, 0x0

    .line 17
    :try_start_0
    invoke-interface {p0}, Lyyds/ᛴᲇᛸ;->ᛲᛲᲈᲈ()[B

    .line 18
    .line 19
    .line 20
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 21
    :try_start_1
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v2

    .line 26
    :goto_0
    move-object v5, v3

    .line 27
    move-object v3, v2

    .line 28
    move-object v2, v5

    .line 29
    goto :goto_1

    .line 30
    :catchall_1
    move-exception v3

    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    :try_start_2
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :catchall_2
    move-exception p0

    .line 38
    invoke-static {v3, p0}, Lyyds/ᛷᛶᛷᛵ;->ᛲᲈᲁ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    :goto_1
    if-nez v3, :cond_3

    .line 42
    .line 43
    array-length p0, v2

    .line 44
    const-wide/16 v3, -0x1

    .line 45
    .line 46
    cmp-long v3, v0, v3

    .line 47
    .line 48
    if-eqz v3, :cond_2

    .line 49
    .line 50
    int-to-long v3, p0

    .line 51
    cmp-long v3, v0, v3

    .line 52
    .line 53
    if-nez v3, :cond_1

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_1
    new-instance v2, Ljava/io/IOException;

    .line 57
    .line 58
    new-instance v3, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    const-string v4, "Content-Length ("

    .line 61
    .line 62
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v0, ") and stream length ("

    .line 69
    .line 70
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string p0, ") disagree"

    .line 77
    .line 78
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-direct {v2, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw v2

    .line 89
    :cond_2
    :goto_2
    return-object v2

    .line 90
    :cond_3
    throw v3

    .line 91
    :cond_4
    new-instance p0, Ljava/io/IOException;

    .line 92
    .line 93
    new-instance v2, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    const-string v3, "Cannot buffer entire body for content length: "

    .line 96
    .line 97
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    throw p0
.end method
