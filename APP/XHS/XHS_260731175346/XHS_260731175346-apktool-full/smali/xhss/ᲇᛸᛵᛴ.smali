.class public final Lxhss/ᲇᛸᛵᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛱᛱᛲᲇ:Lxhss/ᛵᲇᛷᲀ;

.field public final ᛳᲁᲇᛸ:Lxhss/ᛷᛶᛷᛲ;

.field public final ᛷᛵᛵᲈ:Lxhss/ᛸᲇᲇᛶ;

.field public ᲇᛴᲇᛵ:Z


# direct methods
.method public constructor <init>(Lxhss/ᛸᲇᲇᛶ;Lxhss/ᛵᲇᛷᲀ;Lxhss/ᛷᛶᛷᛲ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᲇᛸᛵᛴ;->ᛷᛵᛵᲈ:Lxhss/ᛸᲇᲇᛶ;

    .line 5
    .line 6
    iput-object p2, p0, Lxhss/ᲇᛸᛵᛴ;->ᛱᛱᛲᲇ:Lxhss/ᛵᲇᛷᲀ;

    .line 7
    .line 8
    iput-object p3, p0, Lxhss/ᲇᛸᛵᛴ;->ᛳᲁᲇᛸ:Lxhss/ᛷᛶᛷᛲ;

    .line 9
    .line 10
    return-void
.end method

.method public static ᛷᛵᛵᲈ(Lxhss/ᲇᛸᛵᛴ;ZLjava/io/IOException;I)Ljava/io/IOException;
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
    invoke-virtual {p0, p2}, Lxhss/ᲇᛸᛵᛴ;->ᲇᛴᲇᛵ(Ljava/io/IOException;)V

    .line 20
    .line 21
    .line 22
    :cond_2
    if-eqz p3, :cond_4

    .line 23
    .line 24
    iget-object v3, p0, Lxhss/ᲇᛸᛵᛴ;->ᛷᛵᛵᲈ:Lxhss/ᛸᲇᲇᛶ;

    .line 25
    .line 26
    iget-object v3, v3, Lxhss/ᛸᲇᲇᛶ;->ᛷᛴᛷᛱ:Lxhss/ᲀᲀᛱᲇ;

    .line 27
    .line 28
    if-eqz p2, :cond_3

    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    :cond_4
    :goto_2
    if-eqz v0, :cond_6

    .line 38
    .line 39
    iget-object v3, p0, Lxhss/ᲇᛸᛵᛴ;->ᛷᛵᛵᲈ:Lxhss/ᛸᲇᲇᛶ;

    .line 40
    .line 41
    iget-object v3, v3, Lxhss/ᛸᲇᲇᛶ;->ᛷᛴᛷᛱ:Lxhss/ᲀᲀᛱᲇ;

    .line 42
    .line 43
    if-eqz p2, :cond_5

    .line 44
    .line 45
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    goto :goto_3

    .line 49
    :cond_5
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    :cond_6
    :goto_3
    iget-object v4, p0, Lxhss/ᲇᛸᛵᛴ;->ᛷᛵᛵᲈ:Lxhss/ᛸᲇᲇᛶ;

    .line 53
    .line 54
    if-eqz p3, :cond_7

    .line 55
    .line 56
    if-nez p1, :cond_7

    .line 57
    .line 58
    move v6, v1

    .line 59
    goto :goto_4

    .line 60
    :cond_7
    move v6, v2

    .line 61
    :goto_4
    if-eqz v0, :cond_8

    .line 62
    .line 63
    if-nez p1, :cond_8

    .line 64
    .line 65
    move v7, v1

    .line 66
    goto :goto_5

    .line 67
    :cond_8
    move v7, v2

    .line 68
    :goto_5
    if-eqz p3, :cond_9

    .line 69
    .line 70
    if-eqz p1, :cond_9

    .line 71
    .line 72
    move v9, v1

    .line 73
    goto :goto_6

    .line 74
    :cond_9
    move v9, v2

    .line 75
    :goto_6
    if-eqz v0, :cond_a

    .line 76
    .line 77
    if-eqz p1, :cond_a

    .line 78
    .line 79
    move v8, v1

    .line 80
    :goto_7
    move-object v5, p0

    .line 81
    move-object v10, p2

    .line 82
    goto :goto_8

    .line 83
    :cond_a
    move v8, v2

    .line 84
    goto :goto_7

    .line 85
    :goto_8
    invoke-virtual/range {v4 .. v10}, Lxhss/ᛸᲇᲇᛶ;->ᲇᛶᛴᲀ(Lxhss/ᲇᛸᛵᛴ;ZZZZLjava/io/IOException;)Ljava/io/IOException;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    return-object p0
.end method


# virtual methods
.method public final ᛱᛱᛲᲇ()Lxhss/ᲈᲁᛲᲇ;
    .locals 2

    .line 1
    iget-object p0, p0, Lxhss/ᲇᛸᛵᛴ;->ᛳᲁᲇᛸ:Lxhss/ᛷᛶᛷᛲ;

    .line 2
    .line 3
    invoke-interface {p0}, Lxhss/ᛷᛶᛷᛲ;->ᲇᛴᲇᛵ()Lxhss/ᲀᲀᲁᛱ;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    instance-of v0, p0, Lxhss/ᲈᲁᛲᲇ;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    check-cast p0, Lxhss/ᲈᲁᛲᲇ;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object p0, v1

    .line 16
    :goto_0
    if-eqz p0, :cond_1

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_1
    const-string p0, "no connection for CONNECT tunnels"

    .line 20
    .line 21
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-object v1
.end method

.method public final ᛳᲁᲇᛸ(Lxhss/ᲀᛶᛷᲁ;)Lxhss/ᛴᛵᲈᛸ;
    .locals 8

    .line 1
    :try_start_0
    const-string v0, "Content-Type"

    .line 2
    .line 3
    iget-object v1, p1, Lxhss/ᲀᛶᛷᲁ;->ᲀᲇᛳᲁ:Lxhss/ᲁᛸᛱᛵ;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Lxhss/ᲁᛸᛱᛵ;->ᛷᛵᛵᲈ(Ljava/lang/String;)Ljava/lang/String;

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
    iget-object v1, p0, Lxhss/ᲇᛸᛵᛴ;->ᛳᲁᲇᛸ:Lxhss/ᛷᛶᛷᛲ;

    .line 13
    .line 14
    invoke-interface {v1, p1}, Lxhss/ᛷᛶᛷᛲ;->ᛷᛴᛷᛱ(Lxhss/ᲀᛶᛷᲁ;)J

    .line 15
    .line 16
    .line 17
    move-result-wide v5

    .line 18
    iget-object v1, p0, Lxhss/ᲇᛸᛵᛴ;->ᛳᲁᲇᛸ:Lxhss/ᛷᛶᛷᛲ;

    .line 19
    .line 20
    invoke-interface {v1, p1}, Lxhss/ᛷᛶᛷᛲ;->ᲇᛶᛴᲀ(Lxhss/ᲀᛶᛷᲁ;)Lxhss/ᲇᲁᲀᲇ;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    new-instance v2, Lxhss/ᲀᛵᛶᲀ;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 25
    .line 26
    const/4 v7, 0x0

    .line 27
    move-object v3, p0

    .line 28
    :try_start_1
    invoke-direct/range {v2 .. v7}, Lxhss/ᲀᛵᛶᲀ;-><init>(Lxhss/ᲇᛸᛵᛴ;Lxhss/ᲇᲁᲀᲇ;JZ)V

    .line 29
    .line 30
    .line 31
    new-instance p0, Lxhss/ᛴᛵᲈᛸ;

    .line 32
    .line 33
    new-instance p1, Lxhss/ᲁᛸᛵᛳ;

    .line 34
    .line 35
    invoke-direct {p1, v2}, Lxhss/ᲁᛸᛵᛳ;-><init>(Lxhss/ᲇᲁᲀᲇ;)V

    .line 36
    .line 37
    .line 38
    invoke-direct {p0, v0, v5, v6, p1}, Lxhss/ᛴᛵᲈᛸ;-><init>(Ljava/lang/String;JLxhss/ᲁᛸᛵᛳ;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 39
    .line 40
    .line 41
    return-object p0

    .line 42
    :catch_0
    move-exception v0

    .line 43
    :goto_0
    move-object p0, v0

    .line 44
    goto :goto_1

    .line 45
    :catch_1
    move-exception v0

    .line 46
    move-object v3, p0

    .line 47
    goto :goto_0

    .line 48
    :goto_1
    iget-object p1, v3, Lxhss/ᲇᛸᛵᛴ;->ᛷᛵᛵᲈ:Lxhss/ᛸᲇᲇᛶ;

    .line 49
    .line 50
    iget-object p1, p1, Lxhss/ᛸᲇᲇᛶ;->ᛷᛴᛷᛱ:Lxhss/ᲀᲀᛱᲇ;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3, p0}, Lxhss/ᲇᛸᛵᛴ;->ᲇᛴᲇᛵ(Ljava/io/IOException;)V

    .line 56
    .line 57
    .line 58
    throw p0
.end method

.method public final ᛷᛴᛷᛱ()Lxhss/ᛳᛱᛲᲀ;
    .locals 3

    .line 1
    iget-object v0, p0, Lxhss/ᲇᛸᛵᛴ;->ᛷᛵᛵᲈ:Lxhss/ᛸᲇᲇᛶ;

    .line 2
    .line 3
    iget-boolean v1, v0, Lxhss/ᛸᲇᲇᛶ;->ᲈᛳᲀ:Z

    .line 4
    .line 5
    if-nez v1, :cond_4

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    iput-boolean v1, v0, Lxhss/ᛸᲇᲇᛶ;->ᲈᛳᲀ:Z

    .line 9
    .line 10
    iget-object v2, v0, Lxhss/ᛸᲇᲇᛶ;->ᲇᛶᛴᲀ:Lxhss/ᲈᲁᛶᛱ;

    .line 11
    .line 12
    invoke-virtual {v2}, Lxhss/ᲈᲀᲇᛶ;->ᛸᛲᲀᛵ()Z

    .line 13
    .line 14
    .line 15
    monitor-enter v0

    .line 16
    :try_start_0
    iget-object v2, v0, Lxhss/ᛸᲇᲇᛶ;->ᛴᲈᛱᛴ:Lxhss/ᲇᛸᛵᛴ;

    .line 17
    .line 18
    if-eqz v2, :cond_3

    .line 19
    .line 20
    iget-boolean v2, v0, Lxhss/ᛸᲇᲇᛶ;->ᛳᲈᲈᛲ:Z

    .line 21
    .line 22
    if-nez v2, :cond_2

    .line 23
    .line 24
    iget-boolean v2, v0, Lxhss/ᛸᲇᲇᛶ;->ᛶᲇᲈᛸ:Z

    .line 25
    .line 26
    if-nez v2, :cond_2

    .line 27
    .line 28
    iget-boolean v2, v0, Lxhss/ᛸᲇᲇᛶ;->ᛸᛶᲈᛶ:Z

    .line 29
    .line 30
    if-nez v2, :cond_1

    .line 31
    .line 32
    iget-boolean v2, v0, Lxhss/ᛸᲇᲇᛶ;->ᲇᛸᛳᲁ:Z

    .line 33
    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    iput-boolean v2, v0, Lxhss/ᛸᲇᲇᛶ;->ᲇᛸᛳᲁ:Z

    .line 38
    .line 39
    iput-boolean v1, v0, Lxhss/ᛸᲇᲇᛶ;->ᛳᲈᲈᛲ:Z

    .line 40
    .line 41
    iput-boolean v1, v0, Lxhss/ᛸᲇᲇᛶ;->ᛶᲇᲈᛸ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    monitor-exit v0

    .line 44
    iget-object v0, p0, Lxhss/ᲇᛸᛵᛴ;->ᛳᲁᲇᛸ:Lxhss/ᛷᛶᛷᛲ;

    .line 45
    .line 46
    invoke-interface {v0}, Lxhss/ᛷᛶᛷᛲ;->ᲇᛴᲇᛵ()Lxhss/ᲀᲀᲁᛱ;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Lxhss/ᲈᲁᛲᲇ;

    .line 51
    .line 52
    iget-object v1, v0, Lxhss/ᲈᲁᛲᲇ;->ᛷᛴᛷᛱ:Ljava/net/Socket;

    .line 53
    .line 54
    invoke-virtual {v1, v2}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Lxhss/ᲈᲁᛲᲇ;->ᛸᛴᛶᛳ()V

    .line 58
    .line 59
    .line 60
    new-instance v0, Lxhss/ᛳᛱᛲᲀ;

    .line 61
    .line 62
    invoke-direct {v0, p0}, Lxhss/ᛳᛱᛲᲀ;-><init>(Lxhss/ᲇᛸᛵᛴ;)V

    .line 63
    .line 64
    .line 65
    return-object v0

    .line 66
    :catchall_0
    move-exception p0

    .line 67
    goto :goto_0

    .line 68
    :cond_0
    :try_start_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 69
    .line 70
    const-string v1, "Check failed."

    .line 71
    .line 72
    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw p0

    .line 76
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 77
    .line 78
    const-string v1, "Check failed."

    .line 79
    .line 80
    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw p0

    .line 84
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 85
    .line 86
    const-string v1, "Check failed."

    .line 87
    .line 88
    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw p0

    .line 92
    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 93
    .line 94
    const-string v1, "Check failed."

    .line 95
    .line 96
    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 100
    :goto_0
    monitor-exit v0

    .line 101
    throw p0

    .line 102
    :cond_4
    const-string p0, "Check failed."

    .line 103
    .line 104
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    const/4 p0, 0x0

    .line 108
    return-object p0
.end method

.method public final ᲇᛴᲇᛵ(Ljava/io/IOException;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lxhss/ᲇᛸᛵᛴ;->ᲇᛴᲇᛵ:Z

    .line 3
    .line 4
    iget-object v0, p0, Lxhss/ᲇᛸᛵᛴ;->ᛳᲁᲇᛸ:Lxhss/ᛷᛶᛷᛲ;

    .line 5
    .line 6
    invoke-interface {v0}, Lxhss/ᛷᛶᛷᛲ;->ᲇᛴᲇᛵ()Lxhss/ᲀᲀᲁᛱ;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object p0, p0, Lxhss/ᲇᛸᛵᛴ;->ᛷᛵᛵᲈ:Lxhss/ᛸᲇᲇᛶ;

    .line 11
    .line 12
    invoke-interface {v0, p0, p1}, Lxhss/ᲀᲀᲁᛱ;->ᲇᛶᛴᲀ(Lxhss/ᛸᲇᲇᛶ;Ljava/io/IOException;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
