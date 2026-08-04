.class public final Lyyds/ᛸᛲᛳᲈ;
.super Ljava/io/InputStream;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛲᛴᛳᛲ:Ljava/util/ArrayDeque;


# instance fields
.field public ᲀᛲᛳᲀ:Lyyds/ᛴᛴᛸᲈ;

.field public ᲇᲈᛵᛷ:Ljava/io/IOException;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayDeque;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/ArrayDeque;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lyyds/ᛸᛲᛳᲈ;->ᛲᛴᛳᛲ:Ljava/util/ArrayDeque;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final available()I
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛸᛲᛳᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛴᛴᛸᲈ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyyds/ᛴᛴᛸᲈ;->available()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final close()V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛸᛲᛳᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛴᛴᛸᲈ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyyds/ᛴᛴᛸᲈ;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final mark(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛸᛲᛳᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛴᛴᛸᲈ;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lyyds/ᛴᛴᛸᲈ;->mark(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final markSupported()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛸᛲᛳᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛴᛴᛸᲈ;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    return p0
.end method

.method public final read()I
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lyyds/ᛸᛲᛳᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛴᛴᛸᲈ;

    .line 2
    .line 3
    invoke-virtual {v0}, Lyyds/ᛴᛴᛸᲈ;->read()I

    .line 4
    .line 5
    .line 6
    move-result p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return p0

    .line 8
    :catch_0
    move-exception v0

    .line 9
    iput-object v0, p0, Lyyds/ᛸᛲᛳᲈ;->ᲇᲈᛵᛷ:Ljava/io/IOException;

    .line 10
    .line 11
    throw v0
.end method

.method public final read([B)I
    .locals 1

    .line 12
    :try_start_0
    iget-object v0, p0, Lyyds/ᛸᛲᛳᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛴᛴᛸᲈ;

    invoke-virtual {v0, p1}, Ljava/io/InputStream;->read([B)I

    move-result p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    move-exception p1

    .line 13
    iput-object p1, p0, Lyyds/ᛸᛲᛳᲈ;->ᲇᲈᛵᛷ:Ljava/io/IOException;

    .line 14
    throw p1
.end method

.method public final read([BII)I
    .locals 1

    .line 15
    :try_start_0
    iget-object v0, p0, Lyyds/ᛸᛲᛳᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛴᛴᛸᲈ;

    invoke-virtual {v0, p1, p2, p3}, Lyyds/ᛴᛴᛸᲈ;->read([BII)I

    move-result p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    move-exception p1

    .line 16
    iput-object p1, p0, Lyyds/ᛸᛲᛳᲈ;->ᲇᲈᛵᛷ:Ljava/io/IOException;

    .line 17
    throw p1
.end method

.method public final declared-synchronized reset()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lyyds/ᛸᛲᛳᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛴᛴᛸᲈ;

    .line 3
    .line 4
    invoke-virtual {v0}, Lyyds/ᛴᛴᛸᲈ;->reset()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    .line 7
    monitor-exit p0

    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception v0

    .line 10
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11
    throw v0
.end method

.method public final skip(J)J
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lyyds/ᛸᛲᛳᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛴᛴᛸᲈ;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lyyds/ᛴᛴᛸᲈ;->skip(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return-wide p0

    .line 8
    :catch_0
    move-exception p1

    .line 9
    iput-object p1, p0, Lyyds/ᛸᛲᛳᲈ;->ᲇᲈᛵᛷ:Ljava/io/IOException;

    .line 10
    .line 11
    throw p1
.end method
