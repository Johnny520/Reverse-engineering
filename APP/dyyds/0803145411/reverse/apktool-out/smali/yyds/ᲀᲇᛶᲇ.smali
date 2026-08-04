.class public final Lyyds/ᲀᲇᛶᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛲᲈᲁ:Z

.field public final ᛵᛸᛸᛷ:Ljava/lang/Object;

.field public final ᲀᛲᛳᲀ:Ljava/lang/Object;

.field public final ᲇᲈᛵᛷ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lyyds/ᛳᛴ;Lyyds/ᛳᲇᛷᛷ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲀᲇᛶᲇ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᲀᲇᛶᲇ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 7
    .line 8
    iget-boolean p2, p2, Lyyds/ᛳᲇᛷᛷ;->ᛲᛴᛳᛲ:Z

    .line 9
    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget p1, p1, Lyyds/ᛳᛴ;->ᛲᛳᛶᲁ:I

    .line 15
    .line 16
    new-array p1, p1, [Z

    .line 17
    .line 18
    :goto_0
    iput-object p1, p0, Lyyds/ᲀᲇᛶᲇ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>(Lyyds/ᛳᲇᛲᲁ;Lyyds/ᲇᛷᲀᲀ;)V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Lyyds/ᛳᲈᛸᛸ;

    invoke-direct {v0, p0}, Lyyds/ᛳᲈᛸᛸ;-><init>(Lyyds/ᲀᲇᛶᲇ;)V

    iput-object v0, p0, Lyyds/ᲀᲇᛶᲇ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 23
    iput-object p1, p0, Lyyds/ᲀᲇᛶᲇ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 24
    iput-object p2, p0, Lyyds/ᲀᲇᛶᲇ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lyyds/ᲈᲀᛱᛷ;Lyyds/ᛵᛱᲈᛳ;Lyyds/ᲀᲇᲇᛵ;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lyyds/ᲀᲇᛶᲇ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 27
    iput-object p2, p0, Lyyds/ᲀᲇᛶᲇ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 28
    iput-object p3, p0, Lyyds/ᲀᲇᛶᲇ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    return-void
.end method

.method public static ᛵᛸᛸᛷ(Lyyds/ᲀᲇᛶᲇ;ZLjava/io/IOException;I)Ljava/io/IOException;
    .locals 11

    .line 1
    and-int/lit8 v0, p3, 0x4

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v1

    .line 10
    :goto_0
    and-int/lit8 p3, p3, 0x8

    .line 11
    .line 12
    if-eqz p3, :cond_1

    .line 13
    .line 14
    move p3, v2

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    move p3, v1

    .line 17
    :goto_1
    if-eqz p2, :cond_2

    .line 18
    .line 19
    invoke-virtual {p0, p2}, Lyyds/ᲀᲇᛶᲇ;->ᛶᛷᛲᲁ(Ljava/io/IOException;)V

    .line 20
    .line 21
    .line 22
    :cond_2
    if-eqz p3, :cond_4

    .line 23
    .line 24
    iget-object v3, p0, Lyyds/ᲀᲇᛶᲇ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v3, Lyyds/ᲈᲀᛱᛷ;

    .line 27
    .line 28
    iget-object v3, v3, Lyyds/ᲈᲀᛱᛷ;->ᲇᲇᲇᛱ:Lyyds/ᲈᲀᛶᛳ;

    .line 29
    .line 30
    if-eqz p2, :cond_3

    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    :cond_4
    :goto_2
    if-eqz v0, :cond_6

    .line 40
    .line 41
    iget-object v3, p0, Lyyds/ᲀᲇᛶᲇ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v3, Lyyds/ᲈᲀᛱᛷ;

    .line 44
    .line 45
    iget-object v3, v3, Lyyds/ᲈᲀᛱᛷ;->ᲇᲇᲇᛱ:Lyyds/ᲈᲀᛶᛳ;

    .line 46
    .line 47
    if-eqz p2, :cond_5

    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_5
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    :cond_6
    :goto_3
    iget-object v3, p0, Lyyds/ᲀᲇᛶᲇ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 57
    .line 58
    move-object v4, v3

    .line 59
    check-cast v4, Lyyds/ᲈᲀᛱᛷ;

    .line 60
    .line 61
    if-eqz p3, :cond_7

    .line 62
    .line 63
    if-nez p1, :cond_7

    .line 64
    .line 65
    move v6, v1

    .line 66
    goto :goto_4

    .line 67
    :cond_7
    move v6, v2

    .line 68
    :goto_4
    if-eqz v0, :cond_8

    .line 69
    .line 70
    if-nez p1, :cond_8

    .line 71
    .line 72
    move v7, v1

    .line 73
    goto :goto_5

    .line 74
    :cond_8
    move v7, v2

    .line 75
    :goto_5
    if-eqz p3, :cond_9

    .line 76
    .line 77
    if-eqz p1, :cond_9

    .line 78
    .line 79
    move v9, v1

    .line 80
    goto :goto_6

    .line 81
    :cond_9
    move v9, v2

    .line 82
    :goto_6
    if-eqz v0, :cond_a

    .line 83
    .line 84
    if-eqz p1, :cond_a

    .line 85
    .line 86
    move v8, v1

    .line 87
    :goto_7
    move-object v5, p0

    .line 88
    move-object v10, p2

    .line 89
    goto :goto_8

    .line 90
    :cond_a
    move v8, v2

    .line 91
    goto :goto_7

    .line 92
    :goto_8
    invoke-virtual/range {v4 .. v10}, Lyyds/ᲈᲀᛱᛷ;->ᛶᛷᛲᲁ(Lyyds/ᲀᲇᛶᲇ;ZZZZLjava/io/IOException;)Ljava/io/IOException;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0
.end method


# virtual methods
.method public ᛱᲈᲁ()Lyyds/ᲀᲈᛶᲈ;
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᲀᲇᛶᲇ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lyyds/ᲈᲀᛱᛷ;

    .line 4
    .line 5
    iget-boolean v1, v0, Lyyds/ᲈᲀᛱᛷ;->ᛷᛵᲇᲀ:Z

    .line 6
    .line 7
    if-nez v1, :cond_4

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    iput-boolean v1, v0, Lyyds/ᲈᲀᛱᛷ;->ᛷᛵᲇᲀ:Z

    .line 11
    .line 12
    iget-object v2, v0, Lyyds/ᲈᲀᛱᛷ;->ᛶᛷᛲᲁ:Lyyds/ᲀᲀᛱᛶ;

    .line 13
    .line 14
    invoke-virtual {v2}, Lyyds/ᛲᛳᛶᲈ;->ᛲᛳᛶᲁ()Z

    .line 15
    .line 16
    .line 17
    monitor-enter v0

    .line 18
    :try_start_0
    iget-object v2, v0, Lyyds/ᲈᲀᛱᛷ;->ᛳᛸᛴᛶ:Lyyds/ᲀᲇᛶᲇ;

    .line 19
    .line 20
    if-eqz v2, :cond_3

    .line 21
    .line 22
    iget-boolean v2, v0, Lyyds/ᲈᲀᛱᛷ;->ᲇᛱᛲ:Z

    .line 23
    .line 24
    if-nez v2, :cond_2

    .line 25
    .line 26
    iget-boolean v2, v0, Lyyds/ᲈᲀᛱᛷ;->ᛶᛳᛶᛵ:Z

    .line 27
    .line 28
    if-nez v2, :cond_2

    .line 29
    .line 30
    iget-boolean v2, v0, Lyyds/ᲈᲀᛱᛷ;->ᛱᛳᲇ:Z

    .line 31
    .line 32
    if-nez v2, :cond_1

    .line 33
    .line 34
    iget-boolean v2, v0, Lyyds/ᲈᲀᛱᛷ;->ᛳᲁᲁᲇ:Z

    .line 35
    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    iput-boolean v2, v0, Lyyds/ᲈᲀᛱᛷ;->ᛳᲁᲁᲇ:Z

    .line 40
    .line 41
    iput-boolean v1, v0, Lyyds/ᲈᲀᛱᛷ;->ᲇᛱᛲ:Z

    .line 42
    .line 43
    iput-boolean v1, v0, Lyyds/ᲈᲀᛱᛷ;->ᛶᛳᛶᛵ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    monitor-exit v0

    .line 46
    iget-object v0, p0, Lyyds/ᲀᲇᛶᲇ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, Lyyds/ᲀᲇᲇᛵ;

    .line 49
    .line 50
    invoke-interface {v0}, Lyyds/ᲀᲇᲇᛵ;->ᲇᲇᲇᛱ()Lyyds/ᛷᛷᲈᛸ;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Lyyds/ᲈᛸᲀᛸ;

    .line 55
    .line 56
    iget-object v1, v0, Lyyds/ᲈᛸᲀᛸ;->ᛲᛴᛳᛲ:Ljava/net/Socket;

    .line 57
    .line 58
    invoke-virtual {v1, v2}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Lyyds/ᲈᛸᲀᛸ;->ᛱᲈᲁ()V

    .line 62
    .line 63
    .line 64
    new-instance v0, Lyyds/ᲀᲈᛶᲈ;

    .line 65
    .line 66
    invoke-direct {v0, p0}, Lyyds/ᲀᲈᛶᲈ;-><init>(Lyyds/ᲀᲇᛶᲇ;)V

    .line 67
    .line 68
    .line 69
    return-object v0

    .line 70
    :catchall_0
    move-exception p0

    .line 71
    goto :goto_0

    .line 72
    :cond_0
    :try_start_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 73
    .line 74
    const-string v1, "Check failed."

    .line 75
    .line 76
    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw p0

    .line 80
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 81
    .line 82
    const-string v1, "Check failed."

    .line 83
    .line 84
    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw p0

    .line 88
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 89
    .line 90
    const-string v1, "Check failed."

    .line 91
    .line 92
    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw p0

    .line 96
    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 97
    .line 98
    const-string v1, "Check failed."

    .line 99
    .line 100
    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 104
    :goto_0
    monitor-exit v0

    .line 105
    throw p0

    .line 106
    :cond_4
    const-string p0, "Check failed."

    .line 107
    .line 108
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    const/4 p0, 0x0

    .line 112
    return-object p0
.end method

.method public ᛲᛴᛳᛲ(Lyyds/ᛴᛴᛷᲁ;)Lyyds/ᛳᛶᲈᲈ;
    .locals 8

    .line 1
    :try_start_0
    const-string v0, "Content-Type"

    .line 2
    .line 3
    iget-object v1, p1, Lyyds/ᛴᛴᛷᲁ;->ᛱᲈᲁ:Lyyds/ᛷᛸᛱᛴ;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Lyyds/ᛷᛸᛱᛴ;->ᛲᲈᲁ(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    :cond_0
    iget-object v1, p0, Lyyds/ᲀᲇᛶᲇ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lyyds/ᲀᲇᲇᛵ;

    .line 15
    .line 16
    invoke-interface {v1, p1}, Lyyds/ᲀᲇᲇᛵ;->ᛱᲈᲁ(Lyyds/ᛴᛴᛷᲁ;)J

    .line 17
    .line 18
    .line 19
    move-result-wide v5

    .line 20
    iget-object v1, p0, Lyyds/ᲀᲇᛶᲇ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, Lyyds/ᲀᲇᲇᛵ;

    .line 23
    .line 24
    invoke-interface {v1, p1}, Lyyds/ᲀᲇᲇᛵ;->ᛲᛳᛶᲁ(Lyyds/ᛴᛴᛷᲁ;)Lyyds/ᛷᛷᛳᛷ;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    new-instance v2, Lyyds/ᛸᛵᛱᛳ;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 29
    .line 30
    const/4 v7, 0x0

    .line 31
    move-object v3, p0

    .line 32
    :try_start_1
    invoke-direct/range {v2 .. v7}, Lyyds/ᛸᛵᛱᛳ;-><init>(Lyyds/ᲀᲇᛶᲇ;Lyyds/ᛷᛷᛳᛷ;JZ)V

    .line 33
    .line 34
    .line 35
    new-instance p0, Lyyds/ᛳᛶᲈᲈ;

    .line 36
    .line 37
    new-instance p1, Lyyds/ᲀᲀᛵᲈ;

    .line 38
    .line 39
    invoke-direct {p1, v2}, Lyyds/ᲀᲀᛵᲈ;-><init>(Lyyds/ᛷᛷᛳᛷ;)V

    .line 40
    .line 41
    .line 42
    invoke-direct {p0, v0, v5, v6, p1}, Lyyds/ᛳᛶᲈᲈ;-><init>(Ljava/lang/String;JLyyds/ᲀᲀᛵᲈ;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 43
    .line 44
    .line 45
    return-object p0

    .line 46
    :catch_0
    move-exception v0

    .line 47
    :goto_0
    move-object p0, v0

    .line 48
    goto :goto_1

    .line 49
    :catch_1
    move-exception v0

    .line 50
    move-object v3, p0

    .line 51
    goto :goto_0

    .line 52
    :goto_1
    iget-object p1, v3, Lyyds/ᲀᲇᛶᲇ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p1, Lyyds/ᲈᲀᛱᛷ;

    .line 55
    .line 56
    iget-object p1, p1, Lyyds/ᲈᲀᛱᛷ;->ᲇᲇᲇᛱ:Lyyds/ᲈᲀᛶᛳ;

    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3, p0}, Lyyds/ᲀᲇᛶᲇ;->ᛶᛷᛲᲁ(Ljava/io/IOException;)V

    .line 62
    .line 63
    .line 64
    throw p0
.end method

.method public ᛲᲈᲁ()V
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᲀᲇᛶᲇ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lyyds/ᛳᛴ;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, p0, v1}, Lyyds/ᛳᛴ;->ᲇᲇᲇᛱ(Lyyds/ᲀᲇᛶᲇ;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public ᛶᛷᛲᲁ(Ljava/io/IOException;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lyyds/ᲀᲇᛶᲇ;->ᛲᲈᲁ:Z

    .line 3
    .line 4
    iget-object v0, p0, Lyyds/ᲀᲇᛶᲇ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Lyyds/ᲀᲇᲇᛵ;

    .line 7
    .line 8
    invoke-interface {v0}, Lyyds/ᲀᲇᲇᛵ;->ᲇᲇᲇᛱ()Lyyds/ᛷᛷᲈᛸ;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object p0, p0, Lyyds/ᲀᲇᛶᲇ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lyyds/ᲈᲀᛱᛷ;

    .line 15
    .line 16
    invoke-interface {v0, p0, p1}, Lyyds/ᛷᛷᲈᛸ;->ᲇᲈᛵᛷ(Lyyds/ᲈᲀᛱᛷ;Ljava/io/IOException;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public ᲀᛲᛳᲀ()Lyyds/ᲈᛸᲀᛸ;
    .locals 2

    .line 1
    iget-object p0, p0, Lyyds/ᲀᲇᛶᲇ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lyyds/ᲀᲇᲇᛵ;

    .line 4
    .line 5
    invoke-interface {p0}, Lyyds/ᲀᲇᲇᛵ;->ᲇᲇᲇᛱ()Lyyds/ᛷᛷᲈᛸ;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    instance-of v0, p0, Lyyds/ᲈᛸᲀᛸ;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    check-cast p0, Lyyds/ᲈᛸᲀᛸ;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object p0, v1

    .line 18
    :goto_0
    if-eqz p0, :cond_1

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    const-string p0, "no connection for CONNECT tunnels"

    .line 22
    .line 23
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object v1
.end method

.method public ᲇᲇᲇᛱ(Z)Lyyds/ᲁᛸᛶᛲ;
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lyyds/ᲀᲇᛶᲇ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lyyds/ᲀᲇᲇᛵ;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lyyds/ᲀᲇᲇᛵ;->ᛷᲈᲈᲁ(Z)Lyyds/ᲁᛸᛶᛲ;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iput-object p0, p1, Lyyds/ᲁᛸᛶᛲ;->ᛱᛳᲇ:Lyyds/ᲀᲇᛶᲇ;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    return-object p1

    .line 14
    :catch_0
    move-exception p1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-object p1

    .line 17
    :goto_0
    iget-object v0, p0, Lyyds/ᲀᲇᛶᲇ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lyyds/ᲈᲀᛱᛷ;

    .line 20
    .line 21
    iget-object v0, v0, Lyyds/ᲈᲀᛱᛷ;->ᲇᲇᲇᛱ:Lyyds/ᲈᲀᛶᛳ;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lyyds/ᲀᲇᛶᲇ;->ᛶᛷᛲᲁ(Ljava/io/IOException;)V

    .line 27
    .line 28
    .line 29
    throw p1
.end method

.method public ᲇᲈᛵᛷ()Ljava/io/File;
    .locals 5

    .line 1
    iget-object v0, p0, Lyyds/ᲀᲇᛶᲇ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lyyds/ᛳᛴ;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, Lyyds/ᲀᲇᛶᲇ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Lyyds/ᛳᲇᛷᛷ;

    .line 9
    .line 10
    iget-object v2, v1, Lyyds/ᛳᲇᛷᛷ;->ᲇᲇᲇᛱ:Lyyds/ᲀᲇᛶᲇ;

    .line 11
    .line 12
    if-ne v2, p0, :cond_1

    .line 13
    .line 14
    iget-boolean v2, v1, Lyyds/ᛳᲇᛷᛷ;->ᛲᛴᛳᛲ:Z

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    iget-object v2, p0, Lyyds/ᲀᲇᛶᲇ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, [Z

    .line 22
    .line 23
    const/4 v4, 0x1

    .line 24
    aput-boolean v4, v2, v3

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    :goto_0
    invoke-virtual {v1, v3}, Lyyds/ᛳᲇᛷᛷ;->ᛵᛸᛸᛷ(I)Ljava/io/File;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    iget-object p0, p0, Lyyds/ᲀᲇᛶᲇ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p0, Lyyds/ᛳᛴ;

    .line 36
    .line 37
    iget-object p0, p0, Lyyds/ᛳᛴ;->ᲀᛲᛳᲀ:Ljava/io/File;

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z

    .line 40
    .line 41
    .line 42
    monitor-exit v0

    .line 43
    return-object v1

    .line 44
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 47
    .line 48
    .line 49
    throw p0

    .line 50
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    throw p0
.end method
