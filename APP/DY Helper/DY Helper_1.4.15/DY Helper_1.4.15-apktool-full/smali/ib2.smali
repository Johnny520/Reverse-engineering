.class public final Lib2;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lib2;

.field public static final β:Landroid/os/Handler;

.field public static final γ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final δ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final ε:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final ζ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public static final η:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final θ:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final ι:Lf3;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lib2;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lib2;->α:Lib2;

    .line 7
    .line 8
    new-instance v0, Landroid/os/Handler;

    .line 9
    .line 10
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lib2;->β:Landroid/os/Handler;

    .line 18
    .line 19
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lib2;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 26
    .line 27
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lib2;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 33
    .line 34
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 35
    .line 36
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lib2;->ε:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 40
    .line 41
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lib2;->ζ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 46
    .line 47
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 48
    .line 49
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 50
    .line 51
    .line 52
    sput-object v0, Lib2;->η:Ljava/util/concurrent/ConcurrentHashMap;

    .line 53
    .line 54
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 55
    .line 56
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lib2;->θ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 60
    .line 61
    new-instance v0, Lf3;

    .line 62
    .line 63
    const/4 v1, 0x3

    .line 64
    invoke-direct {v0, v1}, Lf3;-><init>(I)V

    .line 65
    .line 66
    .line 67
    sput-object v0, Lib2;->ι:Lf3;

    .line 68
    .line 69
    return-void
.end method

.method public static Α(Ljava/io/File;)J
    .locals 5

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    :try_start_0
    new-instance v2, Landroid/media/MediaMetadataRetriever;

    .line 4
    .line 5
    invoke-direct {v2}, Landroid/media/MediaMetadataRetriever;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 6
    .line 7
    .line 8
    :try_start_1
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {v2, p0}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/16 p0, 0x9

    .line 16
    .line 17
    invoke-virtual {v2, p0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    const/16 v3, 0xa

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
    move-result-wide v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception p0

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    move-wide v3, v0

    .line 39
    :goto_0
    :try_start_2
    invoke-virtual {v2}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 40
    .line 41
    .line 42
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    goto :goto_3

    .line 47
    :catchall_1
    move-exception p0

    .line 48
    goto :goto_2

    .line 49
    :goto_1
    invoke-virtual {v2}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 50
    .line 51
    .line 52
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 53
    :goto_2
    new-instance v2, Leo1;

    .line 54
    .line 55
    invoke-direct {v2, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    move-object p0, v2

    .line 59
    :goto_3
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    instance-of v1, p0, Leo1;

    .line 64
    .line 65
    if-eqz v1, :cond_1

    .line 66
    .line 67
    move-object p0, v0

    .line 68
    :cond_1
    check-cast p0, Ljava/lang/Number;

    .line 69
    .line 70
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 71
    .line 72
    .line 73
    move-result-wide v0

    .line 74
    return-wide v0
.end method

.method public static Β(Ljava/lang/Object;)Lab2;
    .locals 12

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lib2;->ι(Ljava/lang/Class;)Lbb2;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    goto :goto_2

    .line 13
    :cond_0
    :try_start_0
    iget-object v0, v1, Lbb2;->α:Ljava/lang/reflect/Field;

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    instance-of v3, v0, Ljava/io/File;

    .line 20
    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    check-cast v0, Ljava/io/File;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move-object v0, v2

    .line 29
    goto :goto_1

    .line 30
    :goto_0
    new-instance v3, Leo1;

    .line 31
    .line 32
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    move-object v0, v3

    .line 36
    :goto_1
    instance-of v3, v0, Leo1;

    .line 37
    .line 38
    if-eqz v3, :cond_2

    .line 39
    .line 40
    move-object v0, v2

    .line 41
    :cond_2
    move-object v8, v0

    .line 42
    check-cast v8, Ljava/io/File;

    .line 43
    .line 44
    if-nez v8, :cond_3

    .line 45
    .line 46
    :goto_2
    return-object v2

    .line 47
    :cond_3
    :try_start_1
    iget-object v0, v1, Lbb2;->β:Ljava/lang/reflect/Field;

    .line 48
    .line 49
    if-eqz v0, :cond_4

    .line 50
    .line 51
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    goto :goto_3

    .line 56
    :catchall_1
    move-exception v0

    .line 57
    goto :goto_4

    .line 58
    :cond_4
    move-object v0, v2

    .line 59
    :goto_3
    instance-of v3, v0, Ljava/lang/Number;

    .line 60
    .line 61
    if-eqz v3, :cond_5

    .line 62
    .line 63
    check-cast v0, Ljava/lang/Number;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 64
    .line 65
    goto :goto_5

    .line 66
    :cond_5
    move-object v0, v2

    .line 67
    goto :goto_5

    .line 68
    :goto_4
    new-instance v3, Leo1;

    .line 69
    .line 70
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    move-object v0, v3

    .line 74
    :goto_5
    instance-of v3, v0, Leo1;

    .line 75
    .line 76
    if-eqz v3, :cond_6

    .line 77
    .line 78
    move-object v0, v2

    .line 79
    :cond_6
    check-cast v0, Ljava/lang/Number;

    .line 80
    .line 81
    if-eqz v0, :cond_7

    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 84
    .line 85
    .line 86
    move-result-wide v3

    .line 87
    :goto_6
    move-wide v9, v3

    .line 88
    goto :goto_7

    .line 89
    :cond_7
    const-wide/16 v3, 0x0

    .line 90
    .line 91
    goto :goto_6

    .line 92
    :goto_7
    :try_start_2
    iget-object v0, v1, Lbb2;->γ:Ljava/lang/reflect/Field;

    .line 93
    .line 94
    if-eqz v0, :cond_8

    .line 95
    .line 96
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    goto :goto_8

    .line 101
    :catchall_2
    move-exception v0

    .line 102
    goto :goto_9

    .line 103
    :cond_8
    move-object v0, v2

    .line 104
    :goto_8
    instance-of v3, v0, Ljava/util/List;

    .line 105
    .line 106
    if-eqz v3, :cond_9

    .line 107
    .line 108
    check-cast v0, Ljava/util/List;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 109
    .line 110
    goto :goto_a

    .line 111
    :cond_9
    move-object v0, v2

    .line 112
    goto :goto_a

    .line 113
    :goto_9
    new-instance v3, Leo1;

    .line 114
    .line 115
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 116
    .line 117
    .line 118
    move-object v0, v3

    .line 119
    :goto_a
    instance-of v3, v0, Leo1;

    .line 120
    .line 121
    if-eqz v3, :cond_a

    .line 122
    .line 123
    goto :goto_b

    .line 124
    :cond_a
    move-object v2, v0

    .line 125
    :goto_b
    check-cast v2, Ljava/util/List;

    .line 126
    .line 127
    if-nez v2, :cond_b

    .line 128
    .line 129
    sget-object v2, Ljz;->ε:Ljz;

    .line 130
    .line 131
    :cond_b
    move-object v11, v2

    .line 132
    new-instance v3, Lab2;

    .line 133
    .line 134
    iget-object v5, v1, Lbb2;->α:Ljava/lang/reflect/Field;

    .line 135
    .line 136
    iget-object v6, v1, Lbb2;->β:Ljava/lang/reflect/Field;

    .line 137
    .line 138
    iget-object v7, v1, Lbb2;->γ:Ljava/lang/reflect/Field;

    .line 139
    .line 140
    move-object v4, p0

    .line 141
    invoke-direct/range {v3 .. v11}, Lab2;-><init>(Ljava/lang/Object;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/io/File;JLjava/util/List;)V

    .line 142
    .line 143
    .line 144
    return-object v3
.end method

.method public static Γ(Ljava/io/File;Ljava/io/File;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_9

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/io/File;->length()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    const-wide/16 v2, 0x0

    .line 12
    .line 13
    cmp-long v0, v0, v2

    .line 14
    .line 15
    if-lez v0, :cond_9

    .line 16
    .line 17
    new-instance v0, Ljava/io/File;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    const-string v5, ".dyhelper.bak"

    .line 34
    .line 35
    invoke-static {v4, v5}, Lnx;->θ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-direct {v0, v1, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    :catchall_0
    :cond_1
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    invoke-virtual {p1, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-nez v1, :cond_3

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    const/4 v1, 0x0

    .line 68
    :cond_3
    :goto_0
    invoke-virtual {p0, p1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-nez v4, :cond_4

    .line 73
    .line 74
    invoke-static {p0, p1}, Ls30;->и(Ljava/io/File;Ljava/io/File;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 78
    .line 79
    .line 80
    :cond_4
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    if-eqz p0, :cond_7

    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/io/File;->length()J

    .line 87
    .line 88
    .line 89
    move-result-wide v4

    .line 90
    cmp-long p0, v4, v2

    .line 91
    .line 92
    if-gtz p0, :cond_5

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_5
    :try_start_1
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    if-eqz p0, :cond_6

    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 102
    .line 103
    .line 104
    :catchall_1
    :cond_6
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-virtual {p1}, Ljava/io/File;->length()J

    .line 109
    .line 110
    .line 111
    move-result-wide v0

    .line 112
    invoke-static {p1}, Lib2;->Α(Ljava/io/File;)J

    .line 113
    .line 114
    .line 115
    move-result-wide v2

    .line 116
    const-string p1, "comment original voice file overwritten path="

    .line 117
    .line 118
    const-string v4, ", size="

    .line 119
    .line 120
    invoke-static {p1, p0, v0, v1, v4}, Lnx;->π(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    const-string p1, ", metaDuration="

    .line 125
    .line 126
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    const-string p1, "rb360b99c73f2f647"

    .line 137
    .line 138
    invoke-static {p1, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :cond_7
    :goto_1
    if-eqz v1, :cond_8

    .line 143
    .line 144
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 145
    .line 146
    .line 147
    move-result p0

    .line 148
    if-eqz p0, :cond_8

    .line 149
    .line 150
    invoke-virtual {v0, p1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 151
    .line 152
    .line 153
    :cond_8
    const-string p0, "\u8986\u76d6\u539f\u59cb\u8bc4\u8bba\u8bed\u97f3\u5931\u8d25"

    .line 154
    .line 155
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    return-void

    .line 159
    :cond_9
    const-string p0, "\u66ff\u6362\u8bed\u97f3\u4e34\u65f6\u6587\u4ef6\u65e0\u6548"

    .line 160
    .line 161
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    return-void
.end method

.method public static Δ(Lib2;Ljava/lang/ClassLoader;)Ljava/util/List;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    sget-object v2, Lox;->α:Ljava/lang/Object;

    .line 6
    .line 7
    sget-object v2, Lkx;->ｓ:Lkx;

    .line 8
    .line 9
    invoke-static {v2, v1}, Lox;->σ(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const-string v4, "):"

    .line 14
    .line 15
    const-string v5, "("

    .line 16
    .line 17
    const-string v6, "#"

    .line 18
    .line 19
    const/4 v7, 0x1

    .line 20
    if-eqz v2, :cond_7

    .line 21
    .line 22
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v8

    .line 26
    if-eqz v8, :cond_0

    .line 27
    .line 28
    goto/16 :goto_4

    .line 29
    .line 30
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v8

    .line 43
    if-eqz v8, :cond_2

    .line 44
    .line 45
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v8

    .line 49
    move-object v9, v8

    .line 50
    check-cast v9, Ljava/lang/reflect/Method;

    .line 51
    .line 52
    invoke-static {v9}, Lib2;->υ(Ljava/lang/reflect/Method;)Z

    .line 53
    .line 54
    .line 55
    move-result v9

    .line 56
    if-eqz v9, :cond_1

    .line 57
    .line 58
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    new-instance v2, Lqy1;

    .line 63
    .line 64
    const/16 v8, 0xb

    .line 65
    .line 66
    invoke-direct {v2, v0, v8}, Lqy1;-><init>(Lib2;I)V

    .line 67
    .line 68
    .line 69
    invoke-static {v1, v2}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-eqz v2, :cond_3

    .line 82
    .line 83
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    check-cast v2, Ljava/lang/reflect/Method;

    .line 88
    .line 89
    invoke-virtual {v2, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_3
    new-instance v1, Ljava/util/HashSet;

    .line 94
    .line 95
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 96
    .line 97
    .line 98
    new-instance v2, Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v8

    .line 111
    if-eqz v8, :cond_6

    .line 112
    .line 113
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    move-object v9, v8

    .line 118
    check-cast v9, Ljava/lang/reflect/Method;

    .line 119
    .line 120
    invoke-static {v9}, Llz1;->τ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v10

    .line 124
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v11

    .line 128
    invoke-static {v11, v9}, Llz1;->ο(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v12

    .line 132
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    move-result-object v13

    .line 136
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    new-instance v14, Ljava/util/ArrayList;

    .line 140
    .line 141
    array-length v15, v13

    .line 142
    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 143
    .line 144
    .line 145
    array-length v15, v13

    .line 146
    const/4 v3, 0x0

    .line 147
    :goto_3
    if-ge v3, v15, :cond_4

    .line 148
    .line 149
    move-object/from16 p0, v0

    .line 150
    .line 151
    aget-object v0, v13, v3

    .line 152
    .line 153
    invoke-static {v0, v14, v3, v7}, Llz1;->δ(Ljava/lang/Class;Ljava/util/ArrayList;II)I

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    move-object/from16 v0, p0

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_4
    move-object/from16 p0, v0

    .line 161
    .line 162
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 167
    .line 168
    .line 169
    const/16 v19, 0x0

    .line 170
    .line 171
    const/16 v20, 0x3e

    .line 172
    .line 173
    const-string v15, ","

    .line 174
    .line 175
    const/16 v16, 0x0

    .line 176
    .line 177
    const/16 v17, 0x0

    .line 178
    .line 179
    const/16 v18, 0x0

    .line 180
    .line 181
    invoke-static/range {v14 .. v20}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-static {v10, v6, v11, v5, v0}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-static {v0, v4, v12, v1}, Llz1;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashSet;)Z

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    if-eqz v0, :cond_5

    .line 194
    .line 195
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    :cond_5
    move-object/from16 v0, p0

    .line 199
    .line 200
    goto :goto_2

    .line 201
    :cond_6
    return-object v2

    .line 202
    :cond_7
    :goto_4
    const-string v2, "~78BBAA042CD8BAA2073ADC6B9996030F9A590BEBC2C973FA8B62006CE4037E2C5D21B11231425EB6B3F9FD879B1DF4B587D2ECCD25FD89B97692FDF6367CB59934F5A507881932ED312579"

    .line 203
    .line 204
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    const-string v3, "~78ABF9C3EBB978C766D1EEE85DA4659DFA297141942A5334E9FFCE7ECA2DA6EE95D1E1C9D4E5924F6B52F2A316EB620663A06FDEEEB5A62DE86A34E6B3DE9292C4969A9785D875429A6DFA35747485"

    .line 209
    .line 210
    invoke-static {v3}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    const-string v8, "~78CB965E478A78D38827E0D26879E5129ED28BC0948C0FBC37EEE6CBB3E95B8A4AC1363A6DDE54331B5A47A070A6589A6520FAB8DF66D7EBF463C6CCECF5668CF5BFAF654DDBA3604FF390D96AB8F3A901AF006B220BE9"

    .line 215
    .line 216
    invoke-static {v8}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v8

    .line 220
    filled-new-array {v2, v3, v8}, [Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    invoke-static {v2}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    new-instance v3, Ljava/util/ArrayList;

    .line 229
    .line 230
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 231
    .line 232
    .line 233
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    :cond_8
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 238
    .line 239
    .line 240
    move-result v8

    .line 241
    if-eqz v8, :cond_9

    .line 242
    .line 243
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v8

    .line 247
    check-cast v8, Ljava/lang/String;

    .line 248
    .line 249
    invoke-static {v1, v8}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    move-result-object v8

    .line 253
    if-eqz v8, :cond_8

    .line 254
    .line 255
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    goto :goto_5

    .line 259
    :cond_9
    new-instance v1, Ljava/util/ArrayList;

    .line 260
    .line 261
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 269
    .line 270
    .line 271
    move-result v3

    .line 272
    if-eqz v3, :cond_b

    .line 273
    .line 274
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v3

    .line 278
    check-cast v3, Ljava/lang/Class;

    .line 279
    .line 280
    new-instance v8, Ljava/util/ArrayList;

    .line 281
    .line 282
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 286
    .line 287
    .line 288
    move-result-object v9

    .line 289
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    invoke-static {v8, v9}, Lxh;->э(Ljava/util/AbstractCollection;[Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    invoke-static {v3}, Lib2;->ε(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 296
    .line 297
    .line 298
    move-result-object v3

    .line 299
    new-instance v9, Ljava/util/ArrayList;

    .line 300
    .line 301
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 305
    .line 306
    .line 307
    move-result-object v3

    .line 308
    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 309
    .line 310
    .line 311
    move-result v10

    .line 312
    if-eqz v10, :cond_a

    .line 313
    .line 314
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v10

    .line 318
    check-cast v10, Ljava/lang/Class;

    .line 319
    .line 320
    invoke-virtual {v10}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 321
    .line 322
    .line 323
    move-result-object v10

    .line 324
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    invoke-static {v10}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 328
    .line 329
    .line 330
    move-result-object v10

    .line 331
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 332
    .line 333
    .line 334
    invoke-static {v9, v10}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 335
    .line 336
    .line 337
    goto :goto_7

    .line 338
    :cond_a
    invoke-static {v8, v9}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 339
    .line 340
    .line 341
    invoke-static {v1, v8}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 342
    .line 343
    .line 344
    goto :goto_6

    .line 345
    :cond_b
    new-instance v2, Ljava/util/ArrayList;

    .line 346
    .line 347
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 351
    .line 352
    .line 353
    move-result-object v1

    .line 354
    :cond_c
    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 355
    .line 356
    .line 357
    move-result v3

    .line 358
    if-eqz v3, :cond_d

    .line 359
    .line 360
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v3

    .line 364
    move-object v8, v3

    .line 365
    check-cast v8, Ljava/lang/reflect/Method;

    .line 366
    .line 367
    invoke-static {v8}, Lib2;->υ(Ljava/lang/reflect/Method;)Z

    .line 368
    .line 369
    .line 370
    move-result v8

    .line 371
    if-eqz v8, :cond_c

    .line 372
    .line 373
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 374
    .line 375
    .line 376
    goto :goto_8

    .line 377
    :cond_d
    new-instance v1, Lqy1;

    .line 378
    .line 379
    const/16 v3, 0x9

    .line 380
    .line 381
    invoke-direct {v1, v0, v3}, Lqy1;-><init>(Lib2;I)V

    .line 382
    .line 383
    .line 384
    invoke-static {v2, v1}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 389
    .line 390
    .line 391
    move-result-object v1

    .line 392
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 393
    .line 394
    .line 395
    move-result v2

    .line 396
    if-eqz v2, :cond_e

    .line 397
    .line 398
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v2

    .line 402
    check-cast v2, Ljava/lang/reflect/Method;

    .line 403
    .line 404
    invoke-virtual {v2, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 405
    .line 406
    .line 407
    goto :goto_9

    .line 408
    :cond_e
    new-instance v1, Ljava/util/HashSet;

    .line 409
    .line 410
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 411
    .line 412
    .line 413
    new-instance v2, Ljava/util/ArrayList;

    .line 414
    .line 415
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 416
    .line 417
    .line 418
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 423
    .line 424
    .line 425
    move-result v3

    .line 426
    if-eqz v3, :cond_11

    .line 427
    .line 428
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v3

    .line 432
    move-object v8, v3

    .line 433
    check-cast v8, Ljava/lang/reflect/Method;

    .line 434
    .line 435
    invoke-static {v8}, Llz1;->τ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object v9

    .line 439
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v10

    .line 443
    invoke-static {v10, v8}, Llz1;->ο(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object v11

    .line 447
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 448
    .line 449
    .line 450
    move-result-object v12

    .line 451
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 452
    .line 453
    .line 454
    new-instance v13, Ljava/util/ArrayList;

    .line 455
    .line 456
    array-length v14, v12

    .line 457
    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 458
    .line 459
    .line 460
    array-length v14, v12

    .line 461
    const/4 v15, 0x0

    .line 462
    :goto_b
    if-ge v15, v14, :cond_f

    .line 463
    .line 464
    move-object/from16 p0, v0

    .line 465
    .line 466
    aget-object v0, v12, v15

    .line 467
    .line 468
    invoke-static {v0, v13, v15, v7}, Llz1;->δ(Ljava/lang/Class;Ljava/util/ArrayList;II)I

    .line 469
    .line 470
    .line 471
    move-result v15

    .line 472
    move-object/from16 v0, p0

    .line 473
    .line 474
    goto :goto_b

    .line 475
    :cond_f
    move-object/from16 p0, v0

    .line 476
    .line 477
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 478
    .line 479
    .line 480
    move-result v0

    .line 481
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 482
    .line 483
    .line 484
    const/16 v18, 0x0

    .line 485
    .line 486
    const/16 v19, 0x3e

    .line 487
    .line 488
    const-string v14, ","

    .line 489
    .line 490
    const/4 v15, 0x0

    .line 491
    const/16 v16, 0x0

    .line 492
    .line 493
    const/16 v17, 0x0

    .line 494
    .line 495
    invoke-static/range {v13 .. v19}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    invoke-static {v9, v6, v10, v5, v0}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    invoke-static {v0, v4, v11, v1}, Llz1;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashSet;)Z

    .line 504
    .line 505
    .line 506
    move-result v0

    .line 507
    if-eqz v0, :cond_10

    .line 508
    .line 509
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 510
    .line 511
    .line 512
    :cond_10
    move-object/from16 v0, p0

    .line 513
    .line 514
    goto :goto_a

    .line 515
    :cond_11
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 516
    .line 517
    .line 518
    move-result v0

    .line 519
    if-nez v0, :cond_12

    .line 520
    .line 521
    return-object v2

    .line 522
    :cond_12
    sget-object v0, Ljz;->ε:Ljz;

    .line 523
    .line 524
    return-object v0
.end method

.method public static Ζ(I)Lda1;
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p0, v0, :cond_4

    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    if-eq p0, v0, :cond_4

    .line 6
    .line 7
    const/4 v0, 0x3

    .line 8
    if-eq p0, v0, :cond_3

    .line 9
    .line 10
    const/4 v0, 0x4

    .line 11
    if-eq p0, v0, :cond_2

    .line 12
    .line 13
    const/16 v0, 0x15

    .line 14
    .line 15
    if-eq p0, v0, :cond_1

    .line 16
    .line 17
    const/16 v0, 0x16

    .line 18
    .line 19
    if-ne p0, v0, :cond_0

    .line 20
    .line 21
    sget-object p0, Lda1;->ι:Lda1;

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    new-instance v1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    const-string v2, "\u4e0d\u652f\u6301\u7684 PCM \u7f16\u7801: "

    .line 29
    .line 30
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw v0

    .line 48
    :cond_1
    sget-object p0, Lda1;->θ:Lda1;

    .line 49
    .line 50
    return-object p0

    .line 51
    :cond_2
    sget-object p0, Lda1;->κ:Lda1;

    .line 52
    .line 53
    return-object p0

    .line 54
    :cond_3
    sget-object p0, Lda1;->ζ:Lda1;

    .line 55
    .line 56
    return-object p0

    .line 57
    :cond_4
    sget-object p0, Lda1;->η:Lda1;

    .line 58
    .line 59
    return-object p0
.end method

.method public static Η(Ljava/util/ArrayList;)V
    .locals 7

    .line 1
    new-instance v0, Lorg/json/JSONArray;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/HashSet;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v2, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_1

    .line 25
    .line 26
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    move-object v5, v4

    .line 31
    check-cast v5, Lqa2;

    .line 32
    .line 33
    iget-object v5, v5, Lqa2;->γ:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v1, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-eqz v5, :cond_0

    .line 40
    .line 41
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    check-cast v2, Lqa2;

    .line 60
    .line 61
    new-instance v3, Lorg/json/JSONObject;

    .line 62
    .line 63
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 64
    .line 65
    .line 66
    const-string v4, "id"

    .line 67
    .line 68
    iget-object v5, v2, Lqa2;->α:Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 71
    .line 72
    .line 73
    const-string v4, "name"

    .line 74
    .line 75
    iget-object v5, v2, Lqa2;->β:Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 78
    .line 79
    .line 80
    const-string v4, "uri"

    .line 81
    .line 82
    iget-object v5, v2, Lqa2;->γ:Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 85
    .line 86
    .line 87
    const-string v4, "durationMs"

    .line 88
    .line 89
    iget-wide v5, v2, Lqa2;->δ:J

    .line 90
    .line 91
    invoke-virtual {v3, v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_2
    sget-object v1, Lui1;->α:Ljava/lang/Object;

    .line 99
    .line 100
    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    const-string v1, "voice_replace_audio_list"

    .line 108
    .line 109
    invoke-static {v1, v0}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-static {p0}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    check-cast p0, Lqa2;

    .line 117
    .line 118
    const-string v0, "voice_replace_mp3_name"

    .line 119
    .line 120
    const-string v1, "voice_replace_mp3_uri"

    .line 121
    .line 122
    if-eqz p0, :cond_3

    .line 123
    .line 124
    iget-object v2, p0, Lqa2;->γ:Ljava/lang/String;

    .line 125
    .line 126
    invoke-static {v1, v2}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    iget-object p0, p0, Lqa2;->β:Ljava/lang/String;

    .line 130
    .line 131
    invoke-static {v0, p0}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :cond_3
    invoke-static {v1}, Lui1;->Κ(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-static {v0}, Lui1;->Κ(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    return-void
.end method

.method public static Θ(Ljava/lang/reflect/Method;)I
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 14
    .line 15
    invoke-static {v1, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    const/16 v1, 0xc8

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v1, v2

    .line 26
    :goto_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    array-length v4, v3

    .line 34
    move v5, v2

    .line 35
    :goto_1
    if-ge v5, v4, :cond_2

    .line 36
    .line 37
    aget-object v6, v3, v5

    .line 38
    .line 39
    invoke-static {v6}, Lib2;->ι(Ljava/lang/Class;)Lbb2;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    if-eqz v6, :cond_1

    .line 44
    .line 45
    add-int/lit16 v1, v1, 0x258

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    :goto_2
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    array-length v3, v3

    .line 56
    const/4 v4, 0x1

    .line 57
    if-gt v4, v3, :cond_3

    .line 58
    .line 59
    const/4 v4, 0x4

    .line 60
    if-ge v3, v4, :cond_3

    .line 61
    .line 62
    add-int/lit16 v1, v1, 0xc8

    .line 63
    .line 64
    :cond_3
    const-string v3, "~78BBAA042CD8BAA2073ADC6B9996030F9A590BEBC2C973FA8B62006CE4037E2C5D21B11231425EB6B3F9FD879B1DF4B587D2ECCD25FD89B97692FDF6367CB59934F5A507881932ED312579"

    .line 65
    .line 66
    invoke-static {v3}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-eqz v3, :cond_4

    .line 75
    .line 76
    add-int/lit16 v1, v1, 0x3e8

    .line 77
    .line 78
    :cond_4
    const-string v3, "~792076A9A8C9D37392B1BEA902D394F25696F0B296E3734A648C9033FB98898FC7E4AEBAAB2A51156B9784EA8E"

    .line 79
    .line 80
    invoke-static {v3}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-static {v0, v3, v2}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-eqz v3, :cond_5

    .line 89
    .line 90
    add-int/lit16 v1, v1, 0x1f4

    .line 91
    .line 92
    :cond_5
    const-string v3, "AudioRecordPanelFragment"

    .line 93
    .line 94
    invoke-static {v0, v3, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    if-eqz v3, :cond_6

    .line 99
    .line 100
    add-int/lit16 v1, v1, 0x1f4

    .line 101
    .line 102
    :cond_6
    const-string v3, "AudioCommentRecording"

    .line 103
    .line 104
    invoke-static {v0, v3, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eqz v0, :cond_7

    .line 109
    .line 110
    add-int/lit16 v1, v1, 0x12c

    .line 111
    .line 112
    :cond_7
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    array-length v3, v0

    .line 120
    :goto_3
    if-ge v2, v3, :cond_9

    .line 121
    .line 122
    aget-object v4, v0, v2

    .line 123
    .line 124
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    const-string v5, "~78B71E7541C477E838C50BCD302E054C40CC02248AA0B9F3FD7D96E48E5395705804FE3D36452620E7FC53FD8B9A95157A99FAA773CE660D7C7738560C6110F6C94E186A484AA44D"

    .line 129
    .line 130
    invoke-static {v5}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    if-eqz v4, :cond_8

    .line 139
    .line 140
    add-int/lit16 v1, v1, 0x12c

    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_8
    add-int/lit8 v2, v2, 0x1

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_9
    :goto_4
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 147
    .line 148
    .line 149
    move-result p0

    .line 150
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 151
    .line 152
    .line 153
    move-result p0

    .line 154
    if-nez p0, :cond_a

    .line 155
    .line 156
    add-int/lit8 v1, v1, 0x64

    .line 157
    .line 158
    :cond_a
    return v1
.end method

.method public static Ι(Ljava/lang/reflect/Method;)I
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 14
    .line 15
    invoke-static {v1, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    const/16 v1, 0x12c

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v1, v2

    .line 26
    :goto_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    array-length v4, v3

    .line 34
    move v5, v2

    .line 35
    :goto_1
    if-ge v5, v4, :cond_2

    .line 36
    .line 37
    aget-object v6, v3, v5

    .line 38
    .line 39
    invoke-static {v6}, Lib2;->ι(Ljava/lang/Class;)Lbb2;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    if-eqz v6, :cond_1

    .line 44
    .line 45
    add-int/lit16 v1, v1, 0x320

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    :goto_2
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-static {v3}, Lg7;->б([Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    check-cast v3, Ljava/lang/Class;

    .line 63
    .line 64
    if-eqz v3, :cond_3

    .line 65
    .line 66
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    goto :goto_3

    .line 71
    :cond_3
    const/4 v3, 0x0

    .line 72
    :goto_3
    const-string v4, "~789F9198A9AE6768B1E75F22FE4AFF5FB8139FFB2E3E8ED9059A4B8CF38A7C966955DCB17D901708EC38BEC31F5673DC6814DF5F607943847446CE2B584C33D3A13A"

    .line 73
    .line 74
    invoke-static {v4}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-static {v3, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-eqz v3, :cond_4

    .line 83
    .line 84
    add-int/lit16 v1, v1, 0x12c

    .line 85
    .line 86
    :cond_4
    const-string v3, "~79E5B19C89B3C3BDFA87D5FC28F4667EC8FACC5D1EBC6A59BA9DEDCE"

    .line 87
    .line 88
    invoke-static {v3}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-static {v0, v3, v2}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-eqz v2, :cond_5

    .line 97
    .line 98
    add-int/lit16 v1, v1, 0x190

    .line 99
    .line 100
    :cond_5
    const-string v2, "audio"

    .line 101
    .line 102
    const/4 v3, 0x1

    .line 103
    invoke-static {v0, v2, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-eqz v2, :cond_6

    .line 108
    .line 109
    add-int/lit16 v1, v1, 0x12c

    .line 110
    .line 111
    :cond_6
    const-string v2, "~78B71E7541C477E838C50BCD302E054C40CC02248AA0B9F3FD7794A78143886D1800F82A71492D2EFEBF50F69EC092027CD8E9B672D52762657C36503D2A32ECDF4324524659B85D"

    .line 112
    .line 113
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    if-eqz v2, :cond_7

    .line 122
    .line 123
    add-int/lit16 v1, v1, 0x12c

    .line 124
    .line 125
    :cond_7
    const-string v2, "~796C0BCB62BCE6FE82C87A254D6EEBA7FF748413BC384A314027F4FDD0319181261306E8D79B9D665CEFDE51625B554792EFFB41899CEB9C050D6E42C136"

    .line 126
    .line 127
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-eqz v0, :cond_8

    .line 136
    .line 137
    add-int/lit16 v1, v1, 0xc8

    .line 138
    .line 139
    :cond_8
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    if-nez v0, :cond_9

    .line 148
    .line 149
    add-int/lit8 v1, v1, 0x64

    .line 150
    .line 151
    :cond_9
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-nez v0, :cond_a

    .line 160
    .line 161
    add-int/lit16 v1, v1, 0xc8

    .line 162
    .line 163
    :cond_a
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    invoke-virtual {p0}, Ljava/lang/Class;->isInterface()Z

    .line 168
    .line 169
    .line 170
    move-result p0

    .line 171
    if-nez p0, :cond_b

    .line 172
    .line 173
    add-int/lit16 v1, v1, 0xc8

    .line 174
    .line 175
    :cond_b
    return v1
.end method

.method public static final Κ(Lum1;Lpa2;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p4, p0, Lum1;->ε:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iput-object p4, p1, Lpa2;->ζ:Ljava/util/List;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lum1;->ε:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/16 p1, 0x8

    .line 24
    .line 25
    :goto_0
    invoke-virtual {p2, p1}, Landroid/view/View;->setVisibility(I)V

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Lum1;->ε:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, Ljava/util/List;

    .line 31
    .line 32
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    new-instance p1, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string p0, " \u4e2a"

    .line 45
    .line 46
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {p3, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public static Λ(Landroid/widget/Button;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, v0, Lxx;->Α:Ljava/lang/String;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setMinWidth(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setMinHeight(I)V

    .line 25
    .line 26
    .line 27
    iget-object v2, v0, Lxx;->ζ:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    iget-object v0, v0, Lxx;->χ:Ljava/lang/String;

    .line 44
    .line 45
    const/16 v3, 0xa

    .line 46
    .line 47
    invoke-static {v3, v2, v1, v0}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {p0, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public static Μ(Landroid/widget/ProgressBar;Lxx;)V
    .locals 1

    .line 1
    iget-object v0, p1, Lxx;->ι:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object p1, p1, Lxx;->χ:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v0}, Landroid/widget/ProgressBar;->setProgressTintList(Landroid/content/res/ColorStateList;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p1}, Landroid/widget/ProgressBar;->setProgressBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v0}, Landroid/widget/ProgressBar;->setIndeterminateTintList(Landroid/content/res/ColorStateList;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public static Ν(Landroid/media/MediaExtractor;Landroid/media/MediaCodec;Landroid/media/MediaCodec;Landroid/media/MediaMuxer;JIILda1;Le80;)V
    .locals 42

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    move-object/from16 v0, p3

    .line 6
    .line 7
    move/from16 v10, p7

    .line 8
    .line 9
    new-instance v11, Landroid/media/MediaCodec$BufferInfo;

    .line 10
    .line 11
    invoke-direct {v11}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v12, Landroid/media/MediaCodec$BufferInfo;

    .line 15
    .line 16
    invoke-direct {v12}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    .line 17
    .line 18
    .line 19
    mul-int/lit8 v13, v10, 0x2

    .line 20
    .line 21
    if-lez p6, :cond_27

    .line 22
    .line 23
    const/4 v14, 0x1

    .line 24
    if-gt v14, v10, :cond_26

    .line 25
    .line 26
    const/4 v3, 0x3

    .line 27
    if-ge v10, v3, :cond_26

    .line 28
    .line 29
    new-instance v15, Lw6;

    .line 30
    .line 31
    invoke-direct {v15}, Lw6;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 35
    .line 36
    .line 37
    move-result-wide v16

    .line 38
    const/4 v3, -0x1

    .line 39
    const/4 v4, 0x0

    .line 40
    move-object/from16 v18, p8

    .line 41
    .line 42
    move/from16 v21, v3

    .line 43
    .line 44
    move v7, v4

    .line 45
    move v8, v7

    .line 46
    move/from16 v19, v8

    .line 47
    .line 48
    move/from16 v20, v19

    .line 49
    .line 50
    move/from16 v22, v20

    .line 51
    .line 52
    const-wide/16 v23, 0x0

    .line 53
    .line 54
    const-wide/16 v25, 0x0

    .line 55
    .line 56
    :goto_0
    if-nez v7, :cond_25

    .line 57
    .line 58
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 59
    .line 60
    .line 61
    move-result-wide v27

    .line 62
    sub-long v27, v27, v16

    .line 63
    .line 64
    const-wide/32 v29, 0xea60

    .line 65
    .line 66
    .line 67
    cmp-long v27, v27, v29

    .line 68
    .line 69
    if-gtz v27, :cond_24

    .line 70
    .line 71
    move/from16 v27, v21

    .line 72
    .line 73
    move/from16 v21, v7

    .line 74
    .line 75
    move/from16 v7, v27

    .line 76
    .line 77
    move/from16 v27, v8

    .line 78
    .line 79
    move v8, v14

    .line 80
    :goto_1
    const/4 v14, -0x2

    .line 81
    move/from16 p8, v8

    .line 82
    .line 83
    const-wide/16 v8, 0x3e8

    .line 84
    .line 85
    const/4 v5, 0x2

    .line 86
    if-eqz p8, :cond_8

    .line 87
    .line 88
    invoke-virtual {v2, v12, v8, v9}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    if-ne v6, v3, :cond_0

    .line 93
    .line 94
    move v8, v4

    .line 95
    :goto_2
    const/4 v14, 0x1

    .line 96
    goto :goto_1

    .line 97
    :cond_0
    if-ne v6, v14, :cond_2

    .line 98
    .line 99
    if-nez v27, :cond_1

    .line 100
    .line 101
    invoke-virtual {v2}, Landroid/media/MediaCodec;->getOutputFormat()Landroid/media/MediaFormat;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    invoke-virtual {v0, v5}, Landroid/media/MediaMuxer;->addTrack(Landroid/media/MediaFormat;)I

    .line 106
    .line 107
    .line 108
    move-result v7

    .line 109
    invoke-virtual {v0}, Landroid/media/MediaMuxer;->start()V

    .line 110
    .line 111
    .line 112
    move/from16 v8, p8

    .line 113
    .line 114
    const/4 v14, 0x1

    .line 115
    const/16 v27, 0x1

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_1
    const-string v0, "\u7f16\u7801\u5668\u8f93\u51fa\u683c\u5f0f\u91cd\u590d\u53d8\u5316"

    .line 119
    .line 120
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :cond_2
    if-ltz v6, :cond_7

    .line 125
    .line 126
    invoke-virtual {v2, v6}, Landroid/media/MediaCodec;->getOutputBuffer(I)Ljava/nio/ByteBuffer;

    .line 127
    .line 128
    .line 129
    move-result-object v8

    .line 130
    iget v9, v12, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 131
    .line 132
    and-int/2addr v5, v9

    .line 133
    if-eqz v5, :cond_3

    .line 134
    .line 135
    iput v4, v12, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 136
    .line 137
    :cond_3
    iget v5, v12, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 138
    .line 139
    if-lez v5, :cond_5

    .line 140
    .line 141
    if-eqz v8, :cond_5

    .line 142
    .line 143
    if-eqz v27, :cond_4

    .line 144
    .line 145
    iget v5, v12, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 146
    .line 147
    invoke-virtual {v8, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 148
    .line 149
    .line 150
    iget v5, v12, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 151
    .line 152
    iget v9, v12, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 153
    .line 154
    add-int/2addr v5, v9

    .line 155
    invoke-virtual {v8, v5}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, v7, v8, v12}, Landroid/media/MediaMuxer;->writeSampleData(ILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V

    .line 159
    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_4
    const-string v0, "Muxer \u5c1a\u672a\u542f\u52a8"

    .line 163
    .line 164
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    :cond_5
    :goto_3
    iget v5, v12, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 169
    .line 170
    and-int/lit8 v5, v5, 0x4

    .line 171
    .line 172
    if-eqz v5, :cond_6

    .line 173
    .line 174
    const/16 v21, 0x1

    .line 175
    .line 176
    goto :goto_4

    .line 177
    :cond_6
    move/from16 v21, v4

    .line 178
    .line 179
    :goto_4
    invoke-virtual {v2, v6, v4}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    .line 180
    .line 181
    .line 182
    if-eqz v21, :cond_7

    .line 183
    .line 184
    if-eqz v27, :cond_25

    .line 185
    .line 186
    invoke-virtual {v0}, Landroid/media/MediaMuxer;->stop()V

    .line 187
    .line 188
    .line 189
    return-void

    .line 190
    :cond_7
    move/from16 v8, p8

    .line 191
    .line 192
    goto :goto_2

    .line 193
    :cond_8
    :goto_5
    invoke-virtual {v15}, Lw6;->isEmpty()Z

    .line 194
    .line 195
    .line 196
    move-result v6

    .line 197
    const-wide/32 v31, 0xf4240

    .line 198
    .line 199
    .line 200
    const-string v9, ", frame="

    .line 201
    .line 202
    if-nez v6, :cond_f

    .line 203
    .line 204
    if-nez v20, :cond_f

    .line 205
    .line 206
    const-wide/16 v3, 0x0

    .line 207
    .line 208
    invoke-virtual {v2, v3, v4}, Landroid/media/MediaCodec;->dequeueInputBuffer(J)I

    .line 209
    .line 210
    .line 211
    move-result v5

    .line 212
    if-ltz v5, :cond_e

    .line 213
    .line 214
    invoke-virtual {v2, v5}, Landroid/media/MediaCodec;->getInputBuffer(I)Ljava/nio/ByteBuffer;

    .line 215
    .line 216
    .line 217
    move-result-object v3

    .line 218
    if-eqz v3, :cond_d

    .line 219
    .line 220
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v15}, Lw6;->isEmpty()Z

    .line 224
    .line 225
    .line 226
    move-result v4

    .line 227
    if-nez v4, :cond_c

    .line 228
    .line 229
    iget-object v4, v15, Lw6;->ζ:[Ljava/lang/Object;

    .line 230
    .line 231
    iget v6, v15, Lw6;->ε:I

    .line 232
    .line 233
    aget-object v4, v4, v6

    .line 234
    .line 235
    check-cast v4, Lxa2;

    .line 236
    .line 237
    iget-object v6, v4, Lxa2;->α:[B

    .line 238
    .line 239
    iget-object v14, v4, Lxa2;->α:[B

    .line 240
    .line 241
    array-length v6, v6

    .line 242
    iget v8, v4, Lxa2;->β:I

    .line 243
    .line 244
    sub-int/2addr v6, v8

    .line 245
    invoke-virtual {v3}, Ljava/nio/Buffer;->remaining()I

    .line 246
    .line 247
    .line 248
    move-result v8

    .line 249
    if-lez v6, :cond_b

    .line 250
    .line 251
    rem-int v36, v6, v13

    .line 252
    .line 253
    if-nez v36, :cond_b

    .line 254
    .line 255
    invoke-static {v6, v8}, Ljava/lang/Math;->min(II)I

    .line 256
    .line 257
    .line 258
    move-result v6

    .line 259
    rem-int v36, v6, v13

    .line 260
    .line 261
    sub-int v6, v6, v36

    .line 262
    .line 263
    if-lez v6, :cond_a

    .line 264
    .line 265
    move/from16 v8, p6

    .line 266
    .line 267
    int-to-long v9, v8

    .line 268
    div-long v36, v25, v9

    .line 269
    .line 270
    rem-long v38, v25, v9

    .line 271
    .line 272
    mul-long v36, v36, v31

    .line 273
    .line 274
    mul-long v38, v38, v31

    .line 275
    .line 276
    div-long v38, v38, v9

    .line 277
    .line 278
    add-long v38, v38, v36

    .line 279
    .line 280
    div-int v9, v6, v13

    .line 281
    .line 282
    int-to-long v9, v9

    .line 283
    add-long v25, v25, v9

    .line 284
    .line 285
    iget v9, v4, Lxa2;->β:I

    .line 286
    .line 287
    invoke-virtual {v3, v14, v9, v6}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 288
    .line 289
    .line 290
    move-object v3, v4

    .line 291
    const/4 v4, 0x0

    .line 292
    const/4 v8, 0x0

    .line 293
    move-object v9, v3

    .line 294
    move v3, v5

    .line 295
    move v5, v6

    .line 296
    move/from16 v30, v7

    .line 297
    .line 298
    move-object/from16 v29, v11

    .line 299
    .line 300
    move-wide/from16 v6, v38

    .line 301
    .line 302
    const-wide/16 v10, 0x0

    .line 303
    .line 304
    const/16 v35, 0x0

    .line 305
    .line 306
    invoke-virtual/range {v2 .. v8}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    .line 307
    .line 308
    .line 309
    iget v3, v9, Lxa2;->β:I

    .line 310
    .line 311
    add-int/2addr v3, v5

    .line 312
    iput v3, v9, Lxa2;->β:I

    .line 313
    .line 314
    array-length v4, v14

    .line 315
    sub-int/2addr v4, v3

    .line 316
    if-nez v4, :cond_9

    .line 317
    .line 318
    invoke-virtual {v15}, Lw6;->removeFirst()Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    :cond_9
    move/from16 v10, p7

    .line 322
    .line 323
    move-object/from16 v11, v29

    .line 324
    .line 325
    move/from16 v7, v30

    .line 326
    .line 327
    move/from16 v4, v35

    .line 328
    .line 329
    const/4 v3, -0x1

    .line 330
    const/4 v5, 0x2

    .line 331
    const-wide/16 v8, 0x3e8

    .line 332
    .line 333
    const/4 v14, -0x2

    .line 334
    goto/16 :goto_5

    .line 335
    .line 336
    :cond_a
    move/from16 v36, v8

    .line 337
    .line 338
    const-string v0, "\u7f16\u7801\u5668\u8f93\u5165\u7f13\u51b2\u533a\u4e0d\u8db3\u4e00\u4e2a PCM \u5e27: capacity="

    .line 339
    .line 340
    move/from16 v1, v36

    .line 341
    .line 342
    invoke-static {v1, v13, v0, v9}, Lnx;->δ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    invoke-static {v0}, Lγ;->δ(Ljava/lang/Object;)V

    .line 347
    .line 348
    .line 349
    return-void

    .line 350
    :cond_b
    const-string v0, "\u5f85\u7f16\u7801 PCM \u4e0d\u662f\u5b8c\u6574\u58f0\u9053\u5e27: bytes="

    .line 351
    .line 352
    invoke-static {v6, v13, v0, v9}, Lnx;->δ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    invoke-static {v0}, Lγ;->δ(Ljava/lang/Object;)V

    .line 357
    .line 358
    .line 359
    return-void

    .line 360
    :cond_c
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 361
    .line 362
    const-string v1, "ArrayDeque is empty."

    .line 363
    .line 364
    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    throw v0

    .line 368
    :cond_d
    const-string v0, "\u7f16\u7801\u5668\u8f93\u5165\u7f13\u51b2\u533a\u4e3a\u7a7a"

    .line 369
    .line 370
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    return-void

    .line 374
    :cond_e
    move/from16 v14, p6

    .line 375
    .line 376
    move/from16 v30, v7

    .line 377
    .line 378
    move-object/from16 v29, v11

    .line 379
    .line 380
    const/16 v35, 0x0

    .line 381
    .line 382
    move-wide v10, v3

    .line 383
    goto :goto_6

    .line 384
    :cond_f
    move/from16 v14, p6

    .line 385
    .line 386
    move/from16 v35, v4

    .line 387
    .line 388
    move/from16 v30, v7

    .line 389
    .line 390
    move-object/from16 v29, v11

    .line 391
    .line 392
    const-wide/16 v10, 0x0

    .line 393
    .line 394
    :goto_6
    if-eqz v19, :cond_10

    .line 395
    .line 396
    invoke-virtual {v15}, Lw6;->isEmpty()Z

    .line 397
    .line 398
    .line 399
    move-result v3

    .line 400
    if-eqz v3, :cond_10

    .line 401
    .line 402
    if-nez v20, :cond_10

    .line 403
    .line 404
    invoke-virtual {v2, v10, v11}, Landroid/media/MediaCodec;->dequeueInputBuffer(J)I

    .line 405
    .line 406
    .line 407
    move-result v3

    .line 408
    if-ltz v3, :cond_10

    .line 409
    .line 410
    int-to-long v4, v14

    .line 411
    div-long v6, v25, v4

    .line 412
    .line 413
    rem-long v33, v25, v4

    .line 414
    .line 415
    mul-long v6, v6, v31

    .line 416
    .line 417
    mul-long v33, v33, v31

    .line 418
    .line 419
    div-long v33, v33, v4

    .line 420
    .line 421
    add-long v6, v33, v6

    .line 422
    .line 423
    const/4 v8, 0x4

    .line 424
    const/4 v4, 0x0

    .line 425
    const/4 v5, 0x0

    .line 426
    move-wide/from16 v31, v10

    .line 427
    .line 428
    move/from16 v10, v35

    .line 429
    .line 430
    invoke-virtual/range {v2 .. v8}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    .line 431
    .line 432
    .line 433
    const/16 v20, 0x1

    .line 434
    .line 435
    goto :goto_7

    .line 436
    :cond_10
    move-wide/from16 v31, v10

    .line 437
    .line 438
    move/from16 v10, v35

    .line 439
    .line 440
    :goto_7
    invoke-virtual {v15}, Lw6;->isEmpty()Z

    .line 441
    .line 442
    .line 443
    move-result v2

    .line 444
    if-eqz v2, :cond_11

    .line 445
    .line 446
    if-eqz v19, :cond_12

    .line 447
    .line 448
    :cond_11
    move-object/from16 v8, p0

    .line 449
    .line 450
    move v7, v10

    .line 451
    move-wide/from16 v5, v23

    .line 452
    .line 453
    move-object/from16 v3, v29

    .line 454
    .line 455
    move/from16 v10, p7

    .line 456
    .line 457
    goto/16 :goto_13

    .line 458
    .line 459
    :cond_12
    if-nez v22, :cond_18

    .line 460
    .line 461
    const-wide/16 v2, 0x3e8

    .line 462
    .line 463
    invoke-virtual {v1, v2, v3}, Landroid/media/MediaCodec;->dequeueInputBuffer(J)I

    .line 464
    .line 465
    .line 466
    move-result v4

    .line 467
    if-ltz v4, :cond_17

    .line 468
    .line 469
    invoke-virtual {v1, v4}, Landroid/media/MediaCodec;->getInputBuffer(I)Ljava/nio/ByteBuffer;

    .line 470
    .line 471
    .line 472
    move-result-object v5

    .line 473
    move-object/from16 v8, p0

    .line 474
    .line 475
    if-eqz v5, :cond_13

    .line 476
    .line 477
    invoke-virtual {v8, v5, v10}, Landroid/media/MediaExtractor;->readSampleData(Ljava/nio/ByteBuffer;I)I

    .line 478
    .line 479
    .line 480
    move-result v5

    .line 481
    move-wide/from16 v40, v2

    .line 482
    .line 483
    move v2, v4

    .line 484
    move v4, v5

    .line 485
    goto :goto_8

    .line 486
    :cond_13
    move-wide/from16 v40, v2

    .line 487
    .line 488
    move v2, v4

    .line 489
    const/4 v4, -0x1

    .line 490
    :goto_8
    invoke-virtual {v8}, Landroid/media/MediaExtractor;->getSampleTime()J

    .line 491
    .line 492
    .line 493
    move-result-wide v5

    .line 494
    cmp-long v3, v5, v31

    .line 495
    .line 496
    if-gez v3, :cond_14

    .line 497
    .line 498
    move-wide/from16 v5, v31

    .line 499
    .line 500
    :cond_14
    if-ltz v4, :cond_15

    .line 501
    .line 502
    cmp-long v3, v5, p4

    .line 503
    .line 504
    if-ltz v3, :cond_16

    .line 505
    .line 506
    :cond_15
    move-wide/from16 v10, v40

    .line 507
    .line 508
    goto :goto_a

    .line 509
    :cond_16
    const-wide/16 v23, 0x5a

    .line 510
    .line 511
    mul-long v23, v23, v5

    .line 512
    .line 513
    div-long v10, v23, p4

    .line 514
    .line 515
    long-to-int v3, v10

    .line 516
    const/4 v7, 0x5

    .line 517
    const/16 v10, 0x5f

    .line 518
    .line 519
    invoke-static {v3, v7, v10}, Lj81;->μ(III)I

    .line 520
    .line 521
    .line 522
    move-result v3

    .line 523
    new-instance v7, Len0;

    .line 524
    .line 525
    const/4 v10, 0x2

    .line 526
    move-object/from16 v11, p9

    .line 527
    .line 528
    invoke-direct {v7, v3, v10, v11}, Len0;-><init>(IILjava/lang/Object;)V

    .line 529
    .line 530
    .line 531
    sget-object v3, Lib2;->β:Landroid/os/Handler;

    .line 532
    .line 533
    invoke-virtual {v3, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 534
    .line 535
    .line 536
    const/4 v3, 0x0

    .line 537
    invoke-virtual {v8}, Landroid/media/MediaExtractor;->getSampleFlags()I

    .line 538
    .line 539
    .line 540
    move-result v7

    .line 541
    move-wide/from16 v10, v40

    .line 542
    .line 543
    invoke-virtual/range {v1 .. v7}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    .line 544
    .line 545
    .line 546
    invoke-virtual {v8}, Landroid/media/MediaExtractor;->advance()Z

    .line 547
    .line 548
    .line 549
    move-object/from16 v1, p1

    .line 550
    .line 551
    :goto_9
    move-wide/from16 v23, v5

    .line 552
    .line 553
    goto :goto_c

    .line 554
    :goto_a
    const/4 v4, 0x0

    .line 555
    const/4 v7, 0x4

    .line 556
    const/4 v3, 0x0

    .line 557
    move-object/from16 v1, p1

    .line 558
    .line 559
    move-wide/from16 v5, v23

    .line 560
    .line 561
    invoke-virtual/range {v1 .. v7}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    .line 562
    .line 563
    .line 564
    const/16 v22, 0x1

    .line 565
    .line 566
    goto :goto_c

    .line 567
    :cond_17
    move-wide v10, v2

    .line 568
    :goto_b
    move-object/from16 v8, p0

    .line 569
    .line 570
    move-wide/from16 v5, v23

    .line 571
    .line 572
    goto :goto_9

    .line 573
    :cond_18
    const-wide/16 v10, 0x3e8

    .line 574
    .line 575
    goto :goto_b

    .line 576
    :goto_c
    xor-int/lit8 v4, v19, 0x1

    .line 577
    .line 578
    move-object/from16 v2, v18

    .line 579
    .line 580
    :goto_d
    if-eqz v4, :cond_23

    .line 581
    .line 582
    move-object/from16 v3, v29

    .line 583
    .line 584
    invoke-virtual {v1, v3, v10, v11}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    .line 585
    .line 586
    .line 587
    move-result v5

    .line 588
    const/4 v7, -0x1

    .line 589
    if-ne v5, v7, :cond_19

    .line 590
    .line 591
    move-object/from16 v29, v3

    .line 592
    .line 593
    const/4 v4, 0x0

    .line 594
    goto :goto_d

    .line 595
    :cond_19
    const/4 v6, -0x2

    .line 596
    if-ne v5, v6, :cond_1d

    .line 597
    .line 598
    invoke-virtual {v1}, Landroid/media/MediaCodec;->getOutputFormat()Landroid/media/MediaFormat;

    .line 599
    .line 600
    .line 601
    move-result-object v2

    .line 602
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 603
    .line 604
    .line 605
    const-string v5, "sample-rate"

    .line 606
    .line 607
    invoke-virtual {v2, v5}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 608
    .line 609
    .line 610
    move-result v5

    .line 611
    const-string v6, "channel-count"

    .line 612
    .line 613
    invoke-virtual {v2, v6}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 614
    .line 615
    .line 616
    move-result v6

    .line 617
    const-string v7, " output="

    .line 618
    .line 619
    if-ne v5, v14, :cond_1c

    .line 620
    .line 621
    move/from16 v10, p7

    .line 622
    .line 623
    if-ne v6, v10, :cond_1b

    .line 624
    .line 625
    const-string v5, "pcm-encoding"

    .line 626
    .line 627
    const/4 v11, 0x2

    .line 628
    invoke-virtual {v2, v5, v11}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;I)I

    .line 629
    .line 630
    .line 631
    move-result v2

    .line 632
    invoke-static {v2}, Lib2;->Ζ(I)Lda1;

    .line 633
    .line 634
    .line 635
    move-result-object v2

    .line 636
    const-string v5, " channels="

    .line 637
    .line 638
    const-string v6, " encoding="

    .line 639
    .line 640
    const-string v7, "decoder PCM format sampleRate="

    .line 641
    .line 642
    invoke-static {v7, v14, v5, v10, v6}, Lnx;->ο(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 643
    .line 644
    .line 645
    move-result-object v5

    .line 646
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 647
    .line 648
    .line 649
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 650
    .line 651
    .line 652
    move-result-object v5

    .line 653
    const-string v6, "rb360b99c73f2f647"

    .line 654
    .line 655
    invoke-static {v6, v5}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 656
    .line 657
    .line 658
    :cond_1a
    move-object/from16 v29, v3

    .line 659
    .line 660
    :goto_e
    const-wide/16 v10, 0x3e8

    .line 661
    .line 662
    goto :goto_d

    .line 663
    :cond_1b
    const-string v0, "\u89e3\u7801\u58f0\u9053\u6570\u53d8\u5316\uff0c\u62d2\u7edd\u9519\u8bef\u58f0\u9053\u8f6c\u7801: input="

    .line 664
    .line 665
    invoke-static {v10, v6, v0, v7}, Lnx;->δ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 666
    .line 667
    .line 668
    move-result-object v0

    .line 669
    invoke-static {v0}, Lγ;->δ(Ljava/lang/Object;)V

    .line 670
    .line 671
    .line 672
    return-void

    .line 673
    :cond_1c
    const-string v0, "\u89e3\u7801\u91c7\u6837\u7387\u53d8\u5316\uff0c\u62d2\u7edd\u9519\u8bef\u901f\u7387\u8f6c\u7801: input="

    .line 674
    .line 675
    invoke-static {v14, v5, v0, v7}, Lnx;->δ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 676
    .line 677
    .line 678
    move-result-object v0

    .line 679
    invoke-static {v0}, Lγ;->δ(Ljava/lang/Object;)V

    .line 680
    .line 681
    .line 682
    return-void

    .line 683
    :cond_1d
    move/from16 v10, p7

    .line 684
    .line 685
    const/4 v11, 0x2

    .line 686
    if-ltz v5, :cond_1a

    .line 687
    .line 688
    :try_start_0
    invoke-virtual {v1, v5}, Landroid/media/MediaCodec;->getOutputBuffer(I)Ljava/nio/ByteBuffer;

    .line 689
    .line 690
    .line 691
    move-result-object v6

    .line 692
    iget v7, v3, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 693
    .line 694
    if-lez v7, :cond_20

    .line 695
    .line 696
    if-eqz v6, :cond_20

    .line 697
    .line 698
    invoke-static {v6, v3, v2}, Lib2;->η(Ljava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;Lda1;)[B

    .line 699
    .line 700
    .line 701
    move-result-object v6

    .line 702
    array-length v7, v6

    .line 703
    rem-int/2addr v7, v13

    .line 704
    if-nez v7, :cond_1f

    .line 705
    .line 706
    array-length v7, v6

    .line 707
    if-nez v7, :cond_1e

    .line 708
    .line 709
    goto :goto_f

    .line 710
    :cond_1e
    new-instance v7, Lxa2;

    .line 711
    .line 712
    invoke-direct {v7, v6}, Lxa2;-><init>([B)V

    .line 713
    .line 714
    .line 715
    invoke-virtual {v15, v7}, Lw6;->addLast(Ljava/lang/Object;)V

    .line 716
    .line 717
    .line 718
    goto :goto_f

    .line 719
    :catchall_0
    move-exception v0

    .line 720
    const/4 v7, 0x0

    .line 721
    goto :goto_12

    .line 722
    :cond_1f
    array-length v0, v6

    .line 723
    new-instance v2, Ljava/lang/StringBuilder;

    .line 724
    .line 725
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 726
    .line 727
    .line 728
    const-string v3, "\u89e3\u7801 PCM \u4e0d\u662f\u5b8c\u6574\u58f0\u9053\u5e27: bytes="

    .line 729
    .line 730
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 731
    .line 732
    .line 733
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 734
    .line 735
    .line 736
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 737
    .line 738
    .line 739
    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 740
    .line 741
    .line 742
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 743
    .line 744
    .line 745
    move-result-object v0

    .line 746
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 747
    .line 748
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 749
    .line 750
    .line 751
    move-result-object v0

    .line 752
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 753
    .line 754
    .line 755
    throw v2

    .line 756
    :cond_20
    :goto_f
    iget v6, v3, Landroid/media/MediaCodec$BufferInfo;->flags:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 757
    .line 758
    and-int/lit8 v6, v6, 0x4

    .line 759
    .line 760
    if-eqz v6, :cond_21

    .line 761
    .line 762
    const/16 v19, 0x1

    .line 763
    .line 764
    :goto_10
    const/4 v6, 0x0

    .line 765
    goto :goto_11

    .line 766
    :cond_21
    const/16 v19, 0x0

    .line 767
    .line 768
    goto :goto_10

    .line 769
    :goto_11
    invoke-virtual {v1, v5, v6}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    .line 770
    .line 771
    .line 772
    if-nez v19, :cond_22

    .line 773
    .line 774
    invoke-virtual {v15}, Lw6;->isEmpty()Z

    .line 775
    .line 776
    .line 777
    move-result v5

    .line 778
    if-nez v5, :cond_1a

    .line 779
    .line 780
    :cond_22
    move-object/from16 v29, v3

    .line 781
    .line 782
    const/4 v4, 0x0

    .line 783
    goto :goto_e

    .line 784
    :goto_12
    invoke-virtual {v1, v5, v7}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    .line 785
    .line 786
    .line 787
    throw v0

    .line 788
    :cond_23
    move/from16 v10, p7

    .line 789
    .line 790
    move-object/from16 v18, v2

    .line 791
    .line 792
    move/from16 v7, v21

    .line 793
    .line 794
    move/from16 v8, v27

    .line 795
    .line 796
    move-object/from16 v11, v29

    .line 797
    .line 798
    move/from16 v21, v30

    .line 799
    .line 800
    const/4 v3, -0x1

    .line 801
    const/4 v4, 0x0

    .line 802
    const/4 v14, 0x1

    .line 803
    move-object/from16 v2, p2

    .line 804
    .line 805
    goto/16 :goto_0

    .line 806
    .line 807
    :goto_13
    move-object/from16 v2, p2

    .line 808
    .line 809
    move-object v11, v3

    .line 810
    move-wide/from16 v23, v5

    .line 811
    .line 812
    move v4, v7

    .line 813
    move/from16 v7, v21

    .line 814
    .line 815
    move/from16 v8, v27

    .line 816
    .line 817
    move/from16 v21, v30

    .line 818
    .line 819
    const/4 v3, -0x1

    .line 820
    const/4 v14, 0x1

    .line 821
    goto/16 :goto_0

    .line 822
    .line 823
    :cond_24
    const-string v0, "\u97f3\u9891\u8f6c\u7801\u8d85\u65f6"

    .line 824
    .line 825
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 826
    .line 827
    .line 828
    :cond_25
    return-void

    .line 829
    :cond_26
    const-string v0, "\u4ec5\u652f\u6301\u5355\u58f0\u9053\u6216\u53cc\u58f0\u9053 PCM"

    .line 830
    .line 831
    invoke-static {v0}, Lγ;->ν(Ljava/lang/String;)V

    .line 832
    .line 833
    .line 834
    return-void

    .line 835
    :cond_27
    const-string v0, "\u91c7\u6837\u7387\u5fc5\u987b\u4e3a\u6b63\u6570"

    .line 836
    .line 837
    invoke-static {v0}, Lγ;->ν(Ljava/lang/String;)V

    .line 838
    .line 839
    .line 840
    return-void
.end method

.method public static Ξ(Landroid/content/Context;Landroid/net/Uri;Ljava/io/File;JLjava/lang/String;Le80;)V
    .locals 17

    .line 1
    move-wide/from16 v0, p3

    .line 2
    .line 3
    move-object/from16 v2, p5

    .line 4
    .line 5
    move-object/from16 v12, p6

    .line 6
    .line 7
    const-string v3, "audio/mp4a-latm"

    .line 8
    .line 9
    const-string v13, "rb360b99c73f2f647"

    .line 10
    .line 11
    :try_start_0
    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->exists()Z

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->delete()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    :catchall_0
    :cond_0
    const/4 v4, 0x0

    .line 21
    :try_start_1
    new-instance v5, Landroid/media/MediaExtractor;

    .line 22
    .line 23
    invoke-direct {v5}, Landroid/media/MediaExtractor;-><init>()V

    .line 24
    .line 25
    .line 26
    move-object/from16 v6, p0

    .line 27
    .line 28
    move-object/from16 v7, p1

    .line 29
    .line 30
    invoke-virtual {v5, v6, v7, v4}, Landroid/media/MediaExtractor;->setDataSource(Landroid/content/Context;Landroid/net/Uri;Ljava/util/Map;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_10

    .line 31
    .line 32
    .line 33
    :try_start_2
    invoke-virtual {v5}, Landroid/media/MediaExtractor;->getTrackCount()I

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    const/4 v7, 0x0

    .line 38
    invoke-static {v7, v6}, Lj81;->Σ(II)Lxm0;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    invoke-virtual {v6}, Lvm0;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    :cond_1
    move-object v8, v6

    .line 47
    check-cast v8, Lwm0;

    .line 48
    .line 49
    iget-boolean v8, v8, Lwm0;->η:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_e

    .line 50
    .line 51
    const-string v9, "mime"

    .line 52
    .line 53
    const/4 v10, 0x1

    .line 54
    if-eqz v8, :cond_2

    .line 55
    .line 56
    :try_start_3
    move-object v8, v6

    .line 57
    check-cast v8, Lwm0;

    .line 58
    .line 59
    invoke-virtual {v8}, Lwm0;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v8

    .line 63
    move-object v11, v8

    .line 64
    check-cast v11, Ljava/lang/Number;

    .line 65
    .line 66
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 67
    .line 68
    .line 69
    move-result v11

    .line 70
    invoke-virtual {v5, v11}, Landroid/media/MediaExtractor;->getTrackFormat(I)Landroid/media/MediaFormat;

    .line 71
    .line 72
    .line 73
    move-result-object v11

    .line 74
    invoke-virtual {v11, v9}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v11

    .line 78
    if-eqz v11, :cond_1

    .line 79
    .line 80
    const-string v14, "audio/"

    .line 81
    .line 82
    invoke-static {v11, v14, v7}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 83
    .line 84
    .line 85
    move-result v11
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 86
    if-ne v11, v10, :cond_1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :catchall_1
    move-exception v0

    .line 90
    move-object v6, v4

    .line 91
    move-object v10, v6

    .line 92
    move-object v4, v5

    .line 93
    move-object v5, v10

    .line 94
    goto/16 :goto_5

    .line 95
    .line 96
    :cond_2
    move-object v8, v4

    .line 97
    :goto_0
    :try_start_4
    check-cast v8, Ljava/lang/Integer;

    .line 98
    .line 99
    if-eqz v8, :cond_6

    .line 100
    .line 101
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    invoke-virtual {v5, v6}, Landroid/media/MediaExtractor;->selectTrack(I)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v5, v6}, Landroid/media/MediaExtractor;->getTrackFormat(I)Landroid/media/MediaFormat;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v6, v9}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v8

    .line 119
    if-eqz v8, :cond_5

    .line 120
    .line 121
    const-string v9, "sample-rate"

    .line 122
    .line 123
    invoke-virtual {v6, v9}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 124
    .line 125
    .line 126
    move-result v9

    .line 127
    const-string v11, "channel-count"

    .line 128
    .line 129
    invoke-virtual {v6, v11}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 130
    .line 131
    .line 132
    move-result v11

    .line 133
    const/16 v14, 0x1f40

    .line 134
    .line 135
    if-lt v9, v14, :cond_4

    .line 136
    .line 137
    if-gt v10, v11, :cond_3

    .line 138
    .line 139
    const/4 v14, 0x3

    .line 140
    if-ge v11, v14, :cond_3

    .line 141
    .line 142
    const-string v14, "pcm-encoding"

    .line 143
    .line 144
    const/4 v15, 0x2

    .line 145
    invoke-virtual {v6, v14, v15}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;I)I

    .line 146
    .line 147
    .line 148
    move-result v14

    .line 149
    invoke-static {v14}, Lib2;->Ζ(I)Lda1;

    .line 150
    .line 151
    .line 152
    move-result-object v14

    .line 153
    new-instance v10, Ljava/lang/StringBuilder;

    .line 154
    .line 155
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 156
    .line 157
    .line 158
    const-string v15, "start transcode "

    .line 159
    .line 160
    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    const-string v15, " voice mime="

    .line 167
    .line 168
    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    const-string v15, " sampleRate="

    .line 175
    .line 176
    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    const-string v15, " channels="

    .line 183
    .line 184
    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    const-string v15, " pcm="

    .line 191
    .line 192
    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v10, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    const-string v15, " maxDuration="

    .line 199
    .line 200
    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v10, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v10

    .line 210
    invoke-static {v13, v10}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    sget-object v15, Lib2;->β:Landroid/os/Handler;

    .line 214
    .line 215
    new-instance v10, Lma2;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_e

    .line 216
    .line 217
    const/4 v4, 0x0

    .line 218
    :try_start_5
    invoke-direct {v10, v4, v12}, Lma2;-><init>(ILe80;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v15, v10}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 222
    .line 223
    .line 224
    invoke-static {v8}, Landroid/media/MediaCodec;->createDecoderByType(Ljava/lang/String;)Landroid/media/MediaCodec;

    .line 225
    .line 226
    .line 227
    move-result-object v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_c

    .line 228
    const/4 v8, 0x0

    .line 229
    :try_start_6
    invoke-virtual {v4, v6, v8, v8, v7}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_d

    .line 230
    .line 231
    .line 232
    :try_start_7
    invoke-virtual {v4}, Landroid/media/MediaCodec;->start()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_c

    .line 233
    .line 234
    .line 235
    :try_start_8
    invoke-static {v3, v9, v11}, Landroid/media/MediaFormat;->createAudioFormat(Ljava/lang/String;II)Landroid/media/MediaFormat;

    .line 236
    .line 237
    .line 238
    move-result-object v6

    .line 239
    const-string v8, "aac-profile"

    .line 240
    .line 241
    const/4 v10, 0x2

    .line 242
    invoke-virtual {v6, v8, v10}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 243
    .line 244
    .line 245
    const-string v8, "bitrate"

    .line 246
    .line 247
    const v10, 0x17700

    .line 248
    .line 249
    .line 250
    invoke-virtual {v6, v8, v10}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 251
    .line 252
    .line 253
    const-string v8, "max-input-size"

    .line 254
    .line 255
    const/16 v10, 0x4000

    .line 256
    .line 257
    invoke-virtual {v6, v8, v10}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 258
    .line 259
    .line 260
    invoke-static {v3}, Landroid/media/MediaCodec;->createEncoderByType(Ljava/lang/String;)Landroid/media/MediaCodec;

    .line 261
    .line 262
    .line 263
    move-result-object v3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_b

    .line 264
    const/4 v8, 0x1

    .line 265
    const/4 v10, 0x0

    .line 266
    :try_start_9
    invoke-virtual {v3, v6, v10, v10, v8}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v3}, Landroid/media/MediaCodec;->start()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_a

    .line 270
    .line 271
    .line 272
    :try_start_a
    new-instance v6, Landroid/media/MediaMuxer;

    .line 273
    .line 274
    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v8

    .line 278
    invoke-direct {v6, v8, v7}, Landroid/media/MediaMuxer;-><init>(Ljava/lang/String;I)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_9

    .line 279
    .line 280
    .line 281
    const-wide/16 v7, 0x3e8

    .line 282
    .line 283
    mul-long/2addr v7, v0

    .line 284
    move-object v10, v5

    .line 285
    move-object v5, v3

    .line 286
    move-object v3, v10

    .line 287
    move v10, v11

    .line 288
    move-object v11, v14

    .line 289
    :try_start_b
    invoke-static/range {v3 .. v12}, Lib2;->Ν(Landroid/media/MediaExtractor;Landroid/media/MediaCodec;Landroid/media/MediaCodec;Landroid/media/MediaMuxer;JIILda1;Le80;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->length()J

    .line 297
    .line 298
    .line 299
    move-result-wide v7

    .line 300
    invoke-static/range {p2 .. p2}, Lib2;->Α(Ljava/io/File;)J

    .line 301
    .line 302
    .line 303
    move-result-wide v9

    .line 304
    new-instance v1, Ljava/lang/StringBuilder;

    .line 305
    .line 306
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 307
    .line 308
    .line 309
    const-string v11, "finish transcode "

    .line 310
    .line 311
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    const-string v2, " voice file="

    .line 318
    .line 319
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    const-string v0, ", size="

    .line 326
    .line 327
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v1, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 331
    .line 332
    .line 333
    const-string v0, ", metaDuration="

    .line 334
    .line 335
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v1, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    invoke-static {v13, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    new-instance v0, Lma2;

    .line 349
    .line 350
    const/4 v1, 0x1

    .line 351
    invoke-direct {v0, v1, v12}, Lma2;-><init>(ILe80;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v15, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    .line 355
    .line 356
    .line 357
    :try_start_c
    invoke-virtual {v3}, Landroid/media/MediaExtractor;->release()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 358
    .line 359
    .line 360
    :catchall_2
    :try_start_d
    invoke-virtual {v4}, Landroid/media/MediaCodec;->stop()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    .line 361
    .line 362
    .line 363
    :catchall_3
    :try_start_e
    invoke-virtual {v4}, Landroid/media/MediaCodec;->release()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .line 364
    .line 365
    .line 366
    :catchall_4
    :try_start_f
    invoke-virtual {v5}, Landroid/media/MediaCodec;->stop()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    .line 367
    .line 368
    .line 369
    :catchall_5
    :try_start_10
    invoke-virtual {v5}, Landroid/media/MediaCodec;->release()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_6

    .line 370
    .line 371
    .line 372
    :catchall_6
    :try_start_11
    invoke-virtual {v6}, Landroid/media/MediaMuxer;->release()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    .line 373
    .line 374
    .line 375
    :catchall_7
    return-void

    .line 376
    :catchall_8
    move-exception v0

    .line 377
    :goto_1
    move-object v10, v4

    .line 378
    move-object v4, v3

    .line 379
    goto/16 :goto_5

    .line 380
    .line 381
    :catchall_9
    move-exception v0

    .line 382
    move-object/from16 v16, v5

    .line 383
    .line 384
    move-object v5, v3

    .line 385
    move-object/from16 v3, v16

    .line 386
    .line 387
    move-object v6, v10

    .line 388
    goto :goto_1

    .line 389
    :catchall_a
    move-exception v0

    .line 390
    move-object v3, v5

    .line 391
    :goto_2
    move-object v5, v10

    .line 392
    move-object v6, v5

    .line 393
    goto :goto_1

    .line 394
    :catchall_b
    move-exception v0

    .line 395
    move-object v3, v5

    .line 396
    const/4 v10, 0x0

    .line 397
    goto :goto_2

    .line 398
    :catchall_c
    move-exception v0

    .line 399
    move-object v3, v5

    .line 400
    const/4 v10, 0x0

    .line 401
    :goto_3
    move-object v4, v3

    .line 402
    move-object v5, v10

    .line 403
    :goto_4
    move-object v6, v5

    .line 404
    goto/16 :goto_5

    .line 405
    .line 406
    :catchall_d
    move-exception v0

    .line 407
    move-object v3, v5

    .line 408
    move-object v10, v8

    .line 409
    goto :goto_3

    .line 410
    :catchall_e
    move-exception v0

    .line 411
    move-object v10, v4

    .line 412
    move-object v3, v5

    .line 413
    goto :goto_3

    .line 414
    :cond_3
    move-object v10, v4

    .line 415
    move-object v3, v5

    .line 416
    move v0, v11

    .line 417
    :try_start_12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 418
    .line 419
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 420
    .line 421
    .line 422
    const-string v2, "\u4ec5\u652f\u6301\u5355\u58f0\u9053\u6216\u53cc\u58f0\u9053\u97f3\u9891: channels="

    .line 423
    .line 424
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 435
    .line 436
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object v0

    .line 440
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 441
    .line 442
    .line 443
    throw v1

    .line 444
    :catchall_f
    move-exception v0

    .line 445
    goto :goto_3

    .line 446
    :cond_4
    move-object v10, v4

    .line 447
    move-object v3, v5

    .line 448
    new-instance v0, Ljava/lang/StringBuilder;

    .line 449
    .line 450
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 451
    .line 452
    .line 453
    const-string v1, "\u4e0d\u652f\u6301\u7684\u97f3\u9891\u91c7\u6837\u7387: "

    .line 454
    .line 455
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 456
    .line 457
    .line 458
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 459
    .line 460
    .line 461
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 466
    .line 467
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 472
    .line 473
    .line 474
    throw v1

    .line 475
    :cond_5
    move-object v10, v4

    .line 476
    move-object v3, v5

    .line 477
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 478
    .line 479
    const-string v1, "\u97f3\u9891\u683c\u5f0f\u672a\u77e5"

    .line 480
    .line 481
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 482
    .line 483
    .line 484
    throw v0

    .line 485
    :cond_6
    move-object v10, v4

    .line 486
    move-object v3, v5

    .line 487
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 488
    .line 489
    const-string v1, "\u672a\u627e\u5230\u97f3\u9891\u8f68\u9053"

    .line 490
    .line 491
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 492
    .line 493
    .line 494
    throw v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_f

    .line 495
    :catchall_10
    move-exception v0

    .line 496
    move-object v10, v4

    .line 497
    move-object v5, v4

    .line 498
    goto :goto_4

    .line 499
    :goto_5
    if-eqz v4, :cond_7

    .line 500
    .line 501
    :try_start_13
    invoke-virtual {v4}, Landroid/media/MediaExtractor;->release()V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_11

    .line 502
    .line 503
    .line 504
    :catchall_11
    :cond_7
    if-eqz v10, :cond_8

    .line 505
    .line 506
    :try_start_14
    invoke-virtual {v10}, Landroid/media/MediaCodec;->stop()V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_12

    .line 507
    .line 508
    .line 509
    :catchall_12
    :cond_8
    if-eqz v10, :cond_9

    .line 510
    .line 511
    :try_start_15
    invoke-virtual {v10}, Landroid/media/MediaCodec;->release()V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_13

    .line 512
    .line 513
    .line 514
    :catchall_13
    :cond_9
    if-eqz v5, :cond_a

    .line 515
    .line 516
    :try_start_16
    invoke-virtual {v5}, Landroid/media/MediaCodec;->stop()V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_14

    .line 517
    .line 518
    .line 519
    :catchall_14
    :cond_a
    if-eqz v5, :cond_b

    .line 520
    .line 521
    :try_start_17
    invoke-virtual {v5}, Landroid/media/MediaCodec;->release()V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_15

    .line 522
    .line 523
    .line 524
    :catchall_15
    :cond_b
    if-eqz v6, :cond_c

    .line 525
    .line 526
    :try_start_18
    invoke-virtual {v6}, Landroid/media/MediaMuxer;->release()V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_16

    .line 527
    .line 528
    .line 529
    :catchall_16
    :cond_c
    throw v0
.end method

.method public static final α(Lib2;Ljava/lang/Object;)V
    .locals 18

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    const-string v2, ", waveHead="

    .line 4
    .line 5
    const-string v3, ", waveSize="

    .line 6
    .line 7
    const-string v4, "rb360b99c73f2f647"

    .line 8
    .line 9
    const-string v5, "apply comment event replacement path="

    .line 10
    .line 11
    const-string v6, "probe comment-event class="

    .line 12
    .line 13
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lib2;->θ(Ljava/lang/Class;)Lra2;

    .line 18
    .line 19
    .line 20
    move-result-object v7

    .line 21
    if-nez v7, :cond_0

    .line 22
    .line 23
    goto/16 :goto_d

    .line 24
    .line 25
    :cond_0
    iget-object v0, v7, Lra2;->α:Ljava/lang/reflect/Field;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    instance-of v8, v0, Ljava/io/File;

    .line 32
    .line 33
    const/4 v9, 0x0

    .line 34
    if-eqz v8, :cond_1

    .line 35
    .line 36
    check-cast v0, Ljava/io/File;

    .line 37
    .line 38
    move-object v8, v0

    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    goto/16 :goto_b

    .line 42
    .line 43
    :cond_1
    move-object v8, v9

    .line 44
    :goto_0
    if-nez v8, :cond_2

    .line 45
    .line 46
    goto/16 :goto_d

    .line 47
    .line 48
    :cond_2
    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    const-string v10, "/comment/audio/"

    .line 56
    .line 57
    const/4 v11, 0x0

    .line 58
    invoke-static {v0, v10, v11}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 59
    .line 60
    .line 61
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    if-nez v0, :cond_3

    .line 63
    .line 64
    goto/16 :goto_d

    .line 65
    .line 66
    :cond_3
    :try_start_1
    iget-object v0, v7, Lra2;->β:Ljava/lang/reflect/Field;

    .line 67
    .line 68
    if-eqz v0, :cond_4

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    goto :goto_1

    .line 75
    :catchall_1
    move-exception v0

    .line 76
    goto :goto_3

    .line 77
    :cond_4
    move-object v0, v9

    .line 78
    :goto_1
    instance-of v10, v0, Ljava/lang/Number;

    .line 79
    .line 80
    if-eqz v10, :cond_5

    .line 81
    .line 82
    check-cast v0, Ljava/lang/Number;

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_5
    move-object v0, v9

    .line 86
    :goto_2
    if-eqz v0, :cond_6

    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 89
    .line 90
    .line 91
    move-result-wide v10

    .line 92
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 93
    .line 94
    .line 95
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 96
    goto :goto_4

    .line 97
    :cond_6
    move-object v0, v9

    .line 98
    goto :goto_4

    .line 99
    :goto_3
    :try_start_2
    new-instance v10, Leo1;

    .line 100
    .line 101
    invoke-direct {v10, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 102
    .line 103
    .line 104
    move-object v0, v10

    .line 105
    :goto_4
    instance-of v10, v0, Leo1;

    .line 106
    .line 107
    if-eqz v10, :cond_7

    .line 108
    .line 109
    move-object v0, v9

    .line 110
    :cond_7
    check-cast v0, Ljava/lang/Long;

    .line 111
    .line 112
    if-eqz v0, :cond_8

    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 115
    .line 116
    .line 117
    move-result-wide v10
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 118
    goto :goto_5

    .line 119
    :cond_8
    const-wide/16 v10, 0x0

    .line 120
    .line 121
    :goto_5
    :try_start_3
    iget-object v0, v7, Lra2;->γ:Ljava/lang/reflect/Field;

    .line 122
    .line 123
    if-eqz v0, :cond_9

    .line 124
    .line 125
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    goto :goto_6

    .line 130
    :catchall_2
    move-exception v0

    .line 131
    goto :goto_7

    .line 132
    :cond_9
    move-object v0, v9

    .line 133
    :goto_6
    instance-of v12, v0, Ljava/util/List;

    .line 134
    .line 135
    if-eqz v12, :cond_a

    .line 136
    .line 137
    check-cast v0, Ljava/util/List;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 138
    .line 139
    goto :goto_8

    .line 140
    :cond_a
    move-object v0, v9

    .line 141
    goto :goto_8

    .line 142
    :goto_7
    :try_start_4
    new-instance v12, Leo1;

    .line 143
    .line 144
    invoke-direct {v12, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 145
    .line 146
    .line 147
    move-object v0, v12

    .line 148
    :goto_8
    instance-of v12, v0, Leo1;

    .line 149
    .line 150
    if-eqz v12, :cond_b

    .line 151
    .line 152
    goto :goto_9

    .line 153
    :cond_b
    move-object v9, v0

    .line 154
    :goto_9
    check-cast v9, Ljava/util/List;

    .line 155
    .line 156
    if-nez v9, :cond_c

    .line 157
    .line 158
    sget-object v9, Ljz;->ε:Ljz;

    .line 159
    .line 160
    :cond_c
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v12

    .line 172
    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    .line 173
    .line 174
    .line 175
    move-result v13

    .line 176
    invoke-virtual {v8}, Ljava/io/File;->length()J

    .line 177
    .line 178
    .line 179
    move-result-wide v14

    .line 180
    move-object/from16 p0, v7

    .line 181
    .line 182
    move-object/from16 v16, v8

    .line 183
    .line 184
    invoke-static/range {v16 .. v16}, Lib2;->Α(Ljava/io/File;)J

    .line 185
    .line 186
    .line 187
    move-result-wide v7

    .line 188
    move-object/from16 v17, v5

    .line 189
    .line 190
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 191
    .line 192
    .line 193
    move-result v5

    .line 194
    const/4 v1, 0x6

    .line 195
    invoke-static {v9, v1}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 196
    .line 197
    .line 198
    move-result-object v9

    .line 199
    new-instance v1, Ljava/lang/StringBuilder;

    .line 200
    .line 201
    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    const-string v0, ", path="

    .line 208
    .line 209
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    const-string v0, ", exists="

    .line 216
    .line 217
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    const-string v0, ", size="

    .line 224
    .line 225
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v1, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    const-string v0, ", eventDuration="

    .line 232
    .line 233
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v1, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    const-string v0, ", metaDuration="

    .line 240
    .line 241
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v1, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-static {v4, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    sget-object v0, Lib2;->η:Ljava/util/concurrent/ConcurrentHashMap;

    .line 267
    .line 268
    invoke-virtual/range {v16 .. v16}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    check-cast v0, Lwa2;

    .line 277
    .line 278
    if-nez v0, :cond_d

    .line 279
    .line 280
    goto :goto_d

    .line 281
    :cond_d
    move-object/from16 v1, p0

    .line 282
    .line 283
    iget-object v5, v1, Lra2;->β:Ljava/lang/reflect/Field;

    .line 284
    .line 285
    if-eqz v5, :cond_e

    .line 286
    .line 287
    iget-wide v6, v0, Lwa2;->α:J

    .line 288
    .line 289
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 290
    .line 291
    .line 292
    move-result-object v6

    .line 293
    move-object/from16 v7, p1

    .line 294
    .line 295
    invoke-virtual {v5, v7, v6}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    goto :goto_a

    .line 299
    :cond_e
    move-object/from16 v7, p1

    .line 300
    .line 301
    :goto_a
    iget-object v1, v1, Lra2;->γ:Ljava/lang/reflect/Field;

    .line 302
    .line 303
    if-eqz v1, :cond_f

    .line 304
    .line 305
    iget-object v5, v0, Lwa2;->β:Ljava/util/List;

    .line 306
    .line 307
    invoke-virtual {v1, v7, v5}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 308
    .line 309
    .line 310
    :cond_f
    invoke-virtual/range {v16 .. v16}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    iget-wide v5, v0, Lwa2;->α:J

    .line 315
    .line 316
    iget-object v7, v0, Lwa2;->β:Ljava/util/List;

    .line 317
    .line 318
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 319
    .line 320
    .line 321
    move-result v7

    .line 322
    iget-object v0, v0, Lwa2;->β:Ljava/util/List;

    .line 323
    .line 324
    const/4 v8, 0x6

    .line 325
    invoke-static {v0, v8}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    new-instance v8, Ljava/lang/StringBuilder;

    .line 330
    .line 331
    move-object/from16 v9, v17

    .line 332
    .line 333
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    const-string v1, ", hostDuration="

    .line 340
    .line 341
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v8, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    invoke-static {v4, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 364
    .line 365
    .line 366
    sget-object v0, Ls62;->α:Ls62;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 367
    .line 368
    goto :goto_c

    .line 369
    :goto_b
    new-instance v1, Leo1;

    .line 370
    .line 371
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 372
    .line 373
    .line 374
    move-object v0, v1

    .line 375
    :goto_c
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    if-eqz v0, :cond_10

    .line 380
    .line 381
    const-string v1, "handle comment audio event failed"

    .line 382
    .line 383
    invoke-static {v4, v1, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 384
    .line 385
    .line 386
    :cond_10
    :goto_d
    return-void
.end method

.method public static final β(Lib2;Ljava/lang/Object;)V
    .locals 7

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_7

    .line 4
    .line 5
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lib2;->δ(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_6

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Ljava/lang/reflect/Field;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 34
    .line 35
    .line 36
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 37
    if-nez v2, :cond_1

    .line 38
    .line 39
    :try_start_1
    invoke-virtual {v1, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    goto :goto_1

    .line 44
    :catchall_0
    move-exception v1

    .line 45
    :try_start_2
    new-instance v2, Leo1;

    .line 46
    .line 47
    invoke-direct {v2, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    move-object v1, v2

    .line 51
    :goto_1
    instance-of v2, v1, Leo1;

    .line 52
    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    const/4 v1, 0x0

    .line 56
    :cond_2
    if-nez v1, :cond_3

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    new-instance v2, Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 73
    .line 74
    .line 75
    array-length v3, v1

    .line 76
    const/4 v4, 0x0

    .line 77
    :goto_2
    if-ge v4, v3, :cond_5

    .line 78
    .line 79
    aget-object v5, v1, v4

    .line 80
    .line 81
    invoke-static {v5}, Lib2;->φ(Ljava/lang/reflect/Method;)Z

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    if-eqz v6, :cond_4

    .line 86
    .line 87
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    goto :goto_3

    .line 91
    :catchall_1
    move-exception p0

    .line 92
    goto :goto_5

    .line 93
    :cond_4
    :goto_3
    add-int/lit8 v4, v4, 0x1

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_5
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-eqz v2, :cond_1

    .line 105
    .line 106
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    check-cast v2, Ljava/lang/reflect/Method;

    .line 111
    .line 112
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    new-instance v3, Lia2;

    .line 116
    .line 117
    const/4 v4, 0x1

    .line 118
    invoke-direct {v3, p0, v4}, Lia2;-><init>(Lib2;I)V

    .line 119
    .line 120
    .line 121
    invoke-static {v2, v3}, Lib2;->μ(Ljava/lang/reflect/Method;Lp70;)V

    .line 122
    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_6
    sget-object p0, Ls62;->α:Ls62;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 126
    .line 127
    goto :goto_6

    .line 128
    :goto_5
    new-instance v0, Leo1;

    .line 129
    .line 130
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 131
    .line 132
    .line 133
    move-object p0, v0

    .line 134
    :goto_6
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    if-eqz p0, :cond_7

    .line 139
    .line 140
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    const-string v0, "install IM helper voice hook failed "

    .line 149
    .line 150
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    const-string v0, "rb360b99c73f2f647"

    .line 155
    .line 156
    invoke-static {v0, p1, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 157
    .line 158
    .line 159
    :cond_7
    :goto_7
    return-void
.end method

.method public static final γ(Lib2;Lk01;)Z
    .locals 6

    .line 1
    iget-object p0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    if-nez p0, :cond_0

    .line 5
    .line 6
    goto :goto_2

    .line 7
    :cond_0
    array-length v0, p0

    .line 8
    const/4 v1, 0x0

    .line 9
    move v2, v1

    .line 10
    :goto_0
    const/4 v3, 0x0

    .line 11
    if-ge v2, v0, :cond_2

    .line 12
    .line 13
    aget-object v4, p0, v2

    .line 14
    .line 15
    instance-of v5, v4, Ljava/lang/Enum;

    .line 16
    .line 17
    if-eqz v5, :cond_1

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    move-object v4, v3

    .line 24
    :goto_1
    instance-of v0, v4, Ljava/lang/Enum;

    .line 25
    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    move-object v3, v4

    .line 29
    check-cast v3, Ljava/lang/Enum;

    .line 30
    .line 31
    :cond_3
    if-eqz v3, :cond_4

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    const-string v0, "RECORD_COMPLETE"

    .line 38
    .line 39
    invoke-static {p0, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-nez p0, :cond_5

    .line 44
    .line 45
    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    const-string v0, "COMPLETE"

    .line 50
    .line 51
    invoke-static {p0, v0, p1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-nez p0, :cond_5

    .line 56
    .line 57
    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    const-string v0, "FINISH"

    .line 62
    .line 63
    invoke-static {p0, v0, p1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    if-nez p0, :cond_5

    .line 68
    .line 69
    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    const-string v0, "SUCCESS"

    .line 74
    .line 75
    invoke-static {p0, v0, p1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    if-eqz p0, :cond_6

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_4
    invoke-static {p0}, Lib2;->κ([Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    if-eqz p0, :cond_6

    .line 87
    .line 88
    :cond_5
    :goto_2
    return p1

    .line 89
    :cond_6
    return v1
.end method

.method public static δ(Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const-class v1, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    invoke-static {p0, v0}, Llz1;->ι(Ljava/lang/Class;Ljava/util/ArrayList;)Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return-object v0
.end method

.method public static ε(Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lw6;

    .line 7
    .line 8
    invoke-direct {v1}, Lw6;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, p0}, Lw6;->addLast(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {v1}, Lw6;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-nez p0, :cond_1

    .line 19
    .line 20
    invoke-virtual {v1}, Lw6;->removeFirst()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Ljava/lang/Class;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredClasses()[Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    array-length v2, p0

    .line 34
    const/4 v3, 0x0

    .line 35
    :goto_0
    if-ge v3, v2, :cond_0

    .line 36
    .line 37
    aget-object v4, p0, v3

    .line 38
    .line 39
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v4}, Lw6;->addLast(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    add-int/lit8 v3, v3, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    return-object v0
.end method

.method public static ζ(Landroid/content/Context;Lya2;Lqa2;Ljava/io/File;JLjava/util/List;Le80;)Lcb2;
    .locals 20

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "rb360b99c73f2f647"

    .line 4
    .line 5
    const-string v2, "audio"

    .line 6
    .line 7
    move-object/from16 v3, p2

    .line 8
    .line 9
    iget-object v3, v3, Lqa2;->γ:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    const/4 v5, 0x0

    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    return-object v5

    .line 19
    :cond_0
    :try_start_0
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 20
    .line 21
    .line 22
    move-result-object v7

    .line 23
    invoke-virtual/range {p3 .. p3}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    if-nez v3, :cond_1

    .line 28
    .line 29
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception v0

    .line 35
    goto/16 :goto_c

    .line 36
    .line 37
    :cond_1
    :goto_0
    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    sget-object v4, Lya2;->ζ:Lya2;

    .line 41
    .line 42
    if-ne v0, v4, :cond_2

    .line 43
    .line 44
    :try_start_1
    new-instance v2, Ljava/io/File;

    .line 45
    .line 46
    invoke-virtual/range {p3 .. p3}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    new-instance v8, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v6, ".dyhelper.tmp.m4a"

    .line 59
    .line 60
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    invoke-direct {v2, v3, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    move-object v8, v2

    .line 71
    goto :goto_1

    .line 72
    :cond_2
    new-instance v6, Ljava/io/File;

    .line 73
    .line 74
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 75
    .line 76
    .line 77
    move-result-wide v8

    .line 78
    new-instance v10, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {v10, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v10, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v2, "_dyhelper.m4a"

    .line 87
    .line 88
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-direct {v6, v3, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    move-object v8, v6

    .line 99
    :goto_1
    if-ne v0, v4, :cond_3

    .line 100
    .line 101
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    const-string v11, "comment"

    .line 105
    .line 106
    const-wide/16 v9, 0x7148

    .line 107
    .line 108
    move-object/from16 v6, p0

    .line 109
    .line 110
    move-object/from16 v12, p7

    .line 111
    .line 112
    invoke-static/range {v6 .. v12}, Lib2;->Ξ(Landroid/content/Context;Landroid/net/Uri;Ljava/io/File;JLjava/lang/String;Le80;)V

    .line 113
    .line 114
    .line 115
    move-object/from16 v2, p3

    .line 116
    .line 117
    invoke-static {v8, v2}, Lib2;->Γ(Ljava/io/File;Ljava/io/File;)V

    .line 118
    .line 119
    .line 120
    invoke-static {v2}, Lib2;->Α(Ljava/io/File;)J

    .line 121
    .line 122
    .line 123
    move-result-wide v6

    .line 124
    goto :goto_2

    .line 125
    :cond_3
    move-object/from16 v2, p3

    .line 126
    .line 127
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    const-string v11, "im"

    .line 131
    .line 132
    const-wide/32 v9, 0xea60

    .line 133
    .line 134
    .line 135
    move-object/from16 v6, p0

    .line 136
    .line 137
    move-object/from16 v12, p7

    .line 138
    .line 139
    invoke-static/range {v6 .. v12}, Lib2;->Ξ(Landroid/content/Context;Landroid/net/Uri;Ljava/io/File;JLjava/lang/String;Le80;)V

    .line 140
    .line 141
    .line 142
    invoke-static {v8}, Lib2;->Α(Ljava/io/File;)J

    .line 143
    .line 144
    .line 145
    move-result-wide v6

    .line 146
    :goto_2
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    const-wide/16 v9, 0x0

    .line 151
    .line 152
    cmp-long v6, v6, v9

    .line 153
    .line 154
    if-lez v6, :cond_4

    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_4
    move-object v3, v5

    .line 158
    :goto_3
    const-wide/16 v6, 0x3e8

    .line 159
    .line 160
    if-eqz v3, :cond_5

    .line 161
    .line 162
    :goto_4
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 163
    .line 164
    .line 165
    move-result-wide v9

    .line 166
    goto :goto_6

    .line 167
    :cond_5
    invoke-static/range {p4 .. p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 168
    .line 169
    .line 170
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 171
    cmp-long v9, p4, v9

    .line 172
    .line 173
    if-lez v9, :cond_6

    .line 174
    .line 175
    goto :goto_5

    .line 176
    :cond_6
    move-object v3, v5

    .line 177
    :goto_5
    if-eqz v3, :cond_7

    .line 178
    .line 179
    goto :goto_4

    .line 180
    :cond_7
    move-wide v9, v6

    .line 181
    :goto_6
    sget-object v3, Lkf0;->ζ:Lkf0;

    .line 182
    .line 183
    const v11, 0x3da3d70a    # 0.08f

    .line 184
    .line 185
    .line 186
    const v12, 0x3eb33333    # 0.35f

    .line 187
    .line 188
    .line 189
    const/4 v13, 0x0

    .line 190
    const/4 v14, 0x4

    .line 191
    if-ne v0, v4, :cond_b

    .line 192
    .line 193
    :try_start_2
    invoke-virtual {v3, v9, v10}, Lkf0;->α(J)J

    .line 194
    .line 195
    .line 196
    move-result-wide v6

    .line 197
    const-wide/16 v15, 0xa

    .line 198
    .line 199
    cmp-long v17, v6, v15

    .line 200
    .line 201
    if-gtz v17, :cond_8

    .line 202
    .line 203
    const-wide/16 v15, 0x4

    .line 204
    .line 205
    :goto_7
    add-long/2addr v6, v15

    .line 206
    goto :goto_8

    .line 207
    :cond_8
    const-wide/16 v17, 0x14

    .line 208
    .line 209
    cmp-long v19, v6, v17

    .line 210
    .line 211
    if-gtz v19, :cond_9

    .line 212
    .line 213
    sub-long/2addr v6, v15

    .line 214
    const-wide/16 v15, 0x2

    .line 215
    .line 216
    div-long/2addr v6, v15

    .line 217
    const-wide/16 v15, 0xe

    .line 218
    .line 219
    goto :goto_7

    .line 220
    :cond_9
    const-wide/16 v15, 0x3c

    .line 221
    .line 222
    cmp-long v15, v6, v15

    .line 223
    .line 224
    if-gtz v15, :cond_a

    .line 225
    .line 226
    sub-long v6, v6, v17

    .line 227
    .line 228
    const-wide/16 v15, 0x8

    .line 229
    .line 230
    div-long/2addr v6, v15

    .line 231
    const-wide/16 v15, 0x13

    .line 232
    .line 233
    goto :goto_7

    .line 234
    :cond_a
    const-wide/16 v6, 0x16

    .line 235
    .line 236
    :goto_8
    long-to-int v6, v6

    .line 237
    const/16 v7, 0x16

    .line 238
    .line 239
    invoke-static {v6, v14, v7}, Lj81;->μ(III)I

    .line 240
    .line 241
    .line 242
    move-result v6

    .line 243
    new-instance v7, Ljava/util/ArrayList;

    .line 244
    .line 245
    invoke-direct {v7, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 246
    .line 247
    .line 248
    :goto_9
    if-ge v13, v6, :cond_10

    .line 249
    .line 250
    rem-int/lit8 v14, v13, 0x5

    .line 251
    .line 252
    int-to-float v14, v14

    .line 253
    mul-float/2addr v14, v11

    .line 254
    add-float/2addr v14, v12

    .line 255
    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 256
    .line 257
    .line 258
    move-result-object v14

    .line 259
    invoke-virtual {v7, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    add-int/lit8 v13, v13, 0x1

    .line 263
    .line 264
    goto :goto_9

    .line 265
    :cond_b
    invoke-interface/range {p6 .. p6}, Ljava/util/Collection;->isEmpty()Z

    .line 266
    .line 267
    .line 268
    move-result v15

    .line 269
    if-nez v15, :cond_c

    .line 270
    .line 271
    move-object/from16 v15, p6

    .line 272
    .line 273
    goto :goto_a

    .line 274
    :cond_c
    move-object v15, v5

    .line 275
    :goto_a
    if-nez v15, :cond_f

    .line 276
    .line 277
    div-long v6, v9, v6

    .line 278
    .line 279
    const-wide/16 v15, 0x1

    .line 280
    .line 281
    cmp-long v17, v6, v15

    .line 282
    .line 283
    if-gez v17, :cond_d

    .line 284
    .line 285
    move-wide v6, v15

    .line 286
    :cond_d
    int-to-long v14, v14

    .line 287
    mul-long/2addr v6, v14

    .line 288
    long-to-int v6, v6

    .line 289
    const/16 v7, 0xc

    .line 290
    .line 291
    invoke-static {v7, v6}, Ljava/lang/Math;->max(II)I

    .line 292
    .line 293
    .line 294
    move-result v6

    .line 295
    const/16 v7, 0x50

    .line 296
    .line 297
    if-le v6, v7, :cond_e

    .line 298
    .line 299
    move v6, v7

    .line 300
    :cond_e
    new-instance v7, Ljava/util/ArrayList;

    .line 301
    .line 302
    invoke-direct {v7, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 303
    .line 304
    .line 305
    :goto_b
    if-ge v13, v6, :cond_10

    .line 306
    .line 307
    rem-int/lit8 v14, v13, 0x5

    .line 308
    .line 309
    int-to-float v14, v14

    .line 310
    mul-float/2addr v14, v11

    .line 311
    add-float/2addr v14, v12

    .line 312
    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 313
    .line 314
    .line 315
    move-result-object v14

    .line 316
    invoke-virtual {v7, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    add-int/lit8 v13, v13, 0x1

    .line 320
    .line 321
    goto :goto_b

    .line 322
    :cond_f
    move-object v7, v15

    .line 323
    :cond_10
    if-ne v0, v4, :cond_11

    .line 324
    .line 325
    move-object v8, v2

    .line 326
    :cond_11
    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    new-instance v6, Ljava/lang/StringBuilder;

    .line 331
    .line 332
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 333
    .line 334
    .line 335
    const-string v11, "voice replaced file="

    .line 336
    .line 337
    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    const-string v2, ", duration="

    .line 344
    .line 345
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v6, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    invoke-static {v1, v2}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    new-instance v2, Lcb2;

    .line 359
    .line 360
    invoke-direct {v2, v8, v9, v10, v7}, Lcb2;-><init>(Ljava/io/File;JLjava/util/List;)V

    .line 361
    .line 362
    .line 363
    if-ne v0, v4, :cond_12

    .line 364
    .line 365
    sget-object v0, Lib2;->η:Ljava/util/concurrent/ConcurrentHashMap;

    .line 366
    .line 367
    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v4

    .line 371
    new-instance v6, Lwa2;

    .line 372
    .line 373
    invoke-virtual {v3, v9, v10}, Lkf0;->α(J)J

    .line 374
    .line 375
    .line 376
    move-result-wide v11

    .line 377
    invoke-direct {v6, v11, v12, v7}, Lwa2;-><init>(JLjava/util/List;)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v0, v4, v6}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    const-string v0, "comment-replacement"

    .line 384
    .line 385
    invoke-static {v0, v8, v9, v10, v7}, Lib2;->ψ(Ljava/lang/String;Ljava/io/File;JLjava/util/List;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 386
    .line 387
    .line 388
    goto :goto_d

    .line 389
    :goto_c
    new-instance v2, Leo1;

    .line 390
    .line 391
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 392
    .line 393
    .line 394
    :cond_12
    :goto_d
    invoke-static {v2}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    if-eqz v0, :cond_13

    .line 399
    .line 400
    const-string v3, "build replacement failed"

    .line 401
    .line 402
    invoke-static {v1, v3, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 403
    .line 404
    .line 405
    new-instance v1, Lka2;

    .line 406
    .line 407
    const/4 v3, 0x1

    .line 408
    move-object/from16 v6, p0

    .line 409
    .line 410
    invoke-direct {v1, v6, v3, v0}, Lka2;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 411
    .line 412
    .line 413
    sget-object v0, Lib2;->β:Landroid/os/Handler;

    .line 414
    .line 415
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 416
    .line 417
    .line 418
    :cond_13
    instance-of v0, v2, Leo1;

    .line 419
    .line 420
    if-eqz v0, :cond_14

    .line 421
    .line 422
    goto :goto_e

    .line 423
    :cond_14
    move-object v5, v2

    .line 424
    :goto_e
    check-cast v5, Lcb2;

    .line 425
    .line 426
    return-object v5
.end method

.method public static η(Ljava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;Lda1;)[B
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget v0, p1, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 8
    .line 9
    .line 10
    iget v0, p1, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 11
    .line 12
    iget p1, p1, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 13
    .line 14
    add-int/2addr v0, p1

    .line 15
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    sget-object p1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget v1, p2, Lda1;->ε:I

    .line 33
    .line 34
    rem-int/2addr v0, v1

    .line 35
    if-nez v0, :cond_a

    .line 36
    .line 37
    sget-object v0, Lda1;->η:Lda1;

    .line 38
    .line 39
    if-ne p2, v0, :cond_0

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    new-array p1, p1, [B

    .line 46
    .line 47
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 48
    .line 49
    .line 50
    return-object p1

    .line 51
    :cond_0
    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    div-int/2addr v0, v1

    .line 56
    mul-int/lit8 v1, v0, 0x2

    .line 57
    .line 58
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v1, p1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    const/4 v1, 0x0

    .line 67
    move v2, v1

    .line 68
    :goto_0
    if-ge v2, v0, :cond_9

    .line 69
    .line 70
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-eqz v3, :cond_8

    .line 75
    .line 76
    const/4 v4, 0x1

    .line 77
    if-eq v3, v4, :cond_7

    .line 78
    .line 79
    const/4 v4, 0x2

    .line 80
    if-eq v3, v4, :cond_5

    .line 81
    .line 82
    const/4 v4, 0x3

    .line 83
    if-eq v3, v4, :cond_4

    .line 84
    .line 85
    const/4 v4, 0x4

    .line 86
    if-ne v3, v4, :cond_3

    .line 87
    .line 88
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getFloat()F

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    const v5, 0x7f7fffff    # Float.MAX_VALUE

    .line 97
    .line 98
    .line 99
    cmpg-float v4, v4, v5

    .line 100
    .line 101
    if-gtz v4, :cond_2

    .line 102
    .line 103
    const/high16 v4, -0x40800000    # -1.0f

    .line 104
    .line 105
    const/high16 v5, 0x3f800000    # 1.0f

    .line 106
    .line 107
    invoke-static {v3, v4, v5}, Lj81;->λ(FFF)F

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    const/4 v4, 0x0

    .line 112
    cmpl-float v4, v3, v4

    .line 113
    .line 114
    const/16 v5, 0x7fff

    .line 115
    .line 116
    if-ltz v4, :cond_1

    .line 117
    .line 118
    int-to-float v4, v5

    .line 119
    :goto_1
    mul-float/2addr v3, v4

    .line 120
    goto :goto_2

    .line 121
    :cond_1
    const/high16 v4, 0x47000000    # 32768.0f

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :goto_2
    invoke-static {v3}, Ljx0;->в(F)I

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    const/16 v4, -0x8000

    .line 129
    .line 130
    invoke-static {v3, v4, v5}, Lj81;->μ(III)I

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    :goto_3
    int-to-short v3, v3

    .line 135
    goto :goto_4

    .line 136
    :cond_2
    move v3, v1

    .line 137
    goto :goto_4

    .line 138
    :cond_3
    invoke-static {}, Lγ;->κ()V

    .line 139
    .line 140
    .line 141
    const/4 p0, 0x0

    .line 142
    return-object p0

    .line 143
    :cond_4
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    shr-int/lit8 v3, v3, 0x10

    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_5
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    and-int/lit16 v3, v3, 0xff

    .line 155
    .line 156
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    and-int/lit16 v4, v4, 0xff

    .line 161
    .line 162
    shl-int/lit8 v4, v4, 0x8

    .line 163
    .line 164
    or-int/2addr v3, v4

    .line 165
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    .line 166
    .line 167
    .line 168
    move-result v4

    .line 169
    and-int/lit16 v4, v4, 0xff

    .line 170
    .line 171
    shl-int/lit8 v4, v4, 0x10

    .line 172
    .line 173
    or-int/2addr v3, v4

    .line 174
    const/high16 v4, 0x800000

    .line 175
    .line 176
    and-int/2addr v4, v3

    .line 177
    if-eqz v4, :cond_6

    .line 178
    .line 179
    const/high16 v4, -0x1000000

    .line 180
    .line 181
    or-int/2addr v3, v4

    .line 182
    :cond_6
    shr-int/lit8 v3, v3, 0x8

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_7
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getShort()S

    .line 186
    .line 187
    .line 188
    move-result v3

    .line 189
    goto :goto_4

    .line 190
    :cond_8
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    .line 191
    .line 192
    .line 193
    move-result v3

    .line 194
    and-int/lit16 v3, v3, 0xff

    .line 195
    .line 196
    add-int/lit8 v3, v3, -0x80

    .line 197
    .line 198
    shl-int/lit8 v3, v3, 0x8

    .line 199
    .line 200
    goto :goto_3

    .line 201
    :goto_4
    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 202
    .line 203
    .line 204
    add-int/lit8 v2, v2, 0x1

    .line 205
    .line 206
    goto/16 :goto_0

    .line 207
    .line 208
    :cond_9
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    return-object p0

    .line 216
    :cond_a
    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    .line 217
    .line 218
    .line 219
    move-result p0

    .line 220
    new-instance p1, Ljava/lang/StringBuilder;

    .line 221
    .line 222
    const-string v0, "PCM \u6570\u636e\u4e0d\u662f\u5b8c\u6574\u91c7\u6837: bytes="

    .line 223
    .line 224
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    const-string p0, ", encoding="

    .line 231
    .line 232
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 243
    .line 244
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    throw p1
.end method

.method public static θ(Ljava/lang/Class;)Lra2;
    .locals 7

    .line 1
    invoke-static {p0}, Lib2;->δ(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Ljava/lang/reflect/Field;

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    const/4 v2, 0x0

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    move-object v3, v1

    .line 42
    check-cast v3, Ljava/lang/reflect/Field;

    .line 43
    .line 44
    const-class v4, Ljava/io/File;

    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {v4, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    move-object v1, v2

    .line 58
    :goto_1
    check-cast v1, Ljava/lang/reflect/Field;

    .line 59
    .line 60
    if-nez v1, :cond_3

    .line 61
    .line 62
    goto :goto_4

    .line 63
    :cond_3
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_5

    .line 72
    .line 73
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    move-object v4, v3

    .line 78
    check-cast v4, Ljava/lang/reflect/Field;

    .line 79
    .line 80
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    sget-object v6, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 85
    .line 86
    invoke-static {v5, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    if-nez v5, :cond_6

    .line 91
    .line 92
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    const-class v5, Ljava/lang/Long;

    .line 97
    .line 98
    invoke-static {v4, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    if-eqz v4, :cond_4

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_5
    move-object v3, v2

    .line 106
    :cond_6
    :goto_2
    check-cast v3, Ljava/lang/reflect/Field;

    .line 107
    .line 108
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    :cond_7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-eqz v0, :cond_8

    .line 117
    .line 118
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    move-object v4, v0

    .line 123
    check-cast v4, Ljava/lang/reflect/Field;

    .line 124
    .line 125
    const-class v5, Ljava/util/List;

    .line 126
    .line 127
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    invoke-virtual {v5, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    if-eqz v4, :cond_7

    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_8
    move-object v0, v2

    .line 139
    :goto_3
    check-cast v0, Ljava/lang/reflect/Field;

    .line 140
    .line 141
    if-nez v3, :cond_9

    .line 142
    .line 143
    if-nez v0, :cond_9

    .line 144
    .line 145
    :goto_4
    return-object v2

    .line 146
    :cond_9
    new-instance p0, Lra2;

    .line 147
    .line 148
    invoke-direct {p0, v1, v3, v0}, Lra2;-><init>(Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)V

    .line 149
    .line 150
    .line 151
    return-object p0
.end method

.method public static ι(Ljava/lang/Class;)Lbb2;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto :goto_2

    .line 5
    :cond_0
    invoke-static {p0}, Lib2;->δ(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Ljava/lang/reflect/Field;

    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    move-object v3, v2

    .line 45
    check-cast v3, Ljava/lang/reflect/Field;

    .line 46
    .line 47
    const-class v4, Ljava/io/File;

    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v4, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_2

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    move-object v2, v0

    .line 61
    :goto_1
    check-cast v2, Ljava/lang/reflect/Field;

    .line 62
    .line 63
    if-nez v2, :cond_4

    .line 64
    .line 65
    :goto_2
    return-object v0

    .line 66
    :cond_4
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    :cond_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-eqz v3, :cond_6

    .line 75
    .line 76
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    move-object v4, v3

    .line 81
    check-cast v4, Ljava/lang/reflect/Field;

    .line 82
    .line 83
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    sget-object v6, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 88
    .line 89
    invoke-static {v5, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    if-nez v5, :cond_7

    .line 94
    .line 95
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    const-class v5, Ljava/lang/Long;

    .line 100
    .line 101
    invoke-static {v4, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    if-eqz v4, :cond_5

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_6
    move-object v3, v0

    .line 109
    :cond_7
    :goto_3
    check-cast v3, Ljava/lang/reflect/Field;

    .line 110
    .line 111
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    :cond_8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    if-eqz v1, :cond_9

    .line 120
    .line 121
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    move-object v4, v1

    .line 126
    check-cast v4, Ljava/lang/reflect/Field;

    .line 127
    .line 128
    const-class v5, Ljava/util/List;

    .line 129
    .line 130
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    invoke-virtual {v5, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    if-eqz v4, :cond_8

    .line 139
    .line 140
    move-object v0, v1

    .line 141
    :cond_9
    check-cast v0, Ljava/lang/reflect/Field;

    .line 142
    .line 143
    new-instance p0, Lbb2;

    .line 144
    .line 145
    invoke-direct {p0, v2, v3, v0}, Lbb2;-><init>(Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)V

    .line 146
    .line 147
    .line 148
    return-object p0
.end method

.method public static κ([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    array-length v0, p0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_2

    .line 7
    .line 8
    aget-object v2, p0, v1

    .line 9
    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    invoke-static {v2}, Lib2;->Β(Ljava/lang/Object;)Lab2;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    if-eqz v3, :cond_1

    .line 17
    .line 18
    return-object v2

    .line 19
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method public static λ(Lk01;Lya2;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p3

    .line 6
    .line 7
    invoke-static/range {p2 .. p2}, Lib2;->Β(Ljava/lang/Object;)Lab2;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    const-string v5, "skip "

    .line 12
    .line 13
    const-string v6, "rb360b99c73f2f647"

    .line 14
    .line 15
    if-nez v4, :cond_0

    .line 16
    .line 17
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v1, " voice replace: voice info not recognized "

    .line 26
    .line 27
    invoke-static {v5, v3, v1, v0, v6}, Lnx;->ψ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    iget-wide v7, v4, Lab2;->ζ:J

    .line 32
    .line 33
    iget-object v9, v4, Lab2;->η:Ljava/util/List;

    .line 34
    .line 35
    iget-object v10, v4, Lab2;->ε:Ljava/io/File;

    .line 36
    .line 37
    sget-object v11, Lya2;->η:Lya2;

    .line 38
    .line 39
    if-ne v2, v11, :cond_4

    .line 40
    .line 41
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 42
    .line 43
    .line 44
    move-result-wide v12

    .line 45
    sget-object v0, Lib2;->θ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 48
    .line 49
    .line 50
    move-result-object v14

    .line 51
    invoke-interface {v14}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v14

    .line 55
    :goto_0
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v15

    .line 59
    if-eqz v15, :cond_2

    .line 60
    .line 61
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v15

    .line 65
    check-cast v15, Ljava/util/Map$Entry;

    .line 66
    .line 67
    invoke-interface {v15}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v16

    .line 71
    move-object/from16 v17, v4

    .line 72
    .line 73
    move-object/from16 v4, v16

    .line 74
    .line 75
    check-cast v4, Ljava/lang/String;

    .line 76
    .line 77
    invoke-interface {v15}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v15

    .line 81
    check-cast v15, Ljava/lang/Number;

    .line 82
    .line 83
    invoke-virtual {v15}, Ljava/lang/Number;->longValue()J

    .line 84
    .line 85
    .line 86
    move-result-wide v15

    .line 87
    cmp-long v18, v15, v12

    .line 88
    .line 89
    if-gez v18, :cond_1

    .line 90
    .line 91
    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 92
    .line 93
    .line 94
    move-result-object v15

    .line 95
    invoke-virtual {v0, v4, v15}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    :cond_1
    move-object/from16 v4, v17

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_2
    move-object/from16 v17, v4

    .line 102
    .line 103
    invoke-virtual {v10}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    invoke-virtual {v0, v4}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    check-cast v4, Ljava/lang/Long;

    .line 112
    .line 113
    if-eqz v4, :cond_5

    .line 114
    .line 115
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 116
    .line 117
    .line 118
    move-result-wide v14

    .line 119
    cmp-long v4, v14, v12

    .line 120
    .line 121
    if-gez v4, :cond_3

    .line 122
    .line 123
    invoke-virtual {v10}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    invoke-virtual {v0, v4}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_3
    invoke-virtual {v10}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    const-string v2, "pass through replaced IM voice path="

    .line 140
    .line 141
    const-string v3, ", duration="

    .line 142
    .line 143
    invoke-static {v2, v0, v7, v8, v3}, Lnx;->π(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    const-string v2, ", waveSize="

    .line 148
    .line 149
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-static {v6, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    return-void

    .line 163
    :cond_4
    move-object/from16 v17, v4

    .line 164
    .line 165
    :cond_5
    :goto_1
    iget-object v4, v1, Lk01;->β:Ljava/lang/Object;

    .line 166
    .line 167
    instance-of v0, v4, Landroid/app/Activity;

    .line 168
    .line 169
    const/4 v12, 0x0

    .line 170
    if-eqz v0, :cond_6

    .line 171
    .line 172
    check-cast v4, Landroid/app/Activity;

    .line 173
    .line 174
    :goto_2
    move-object v0, v4

    .line 175
    goto :goto_7

    .line 176
    :cond_6
    :try_start_0
    const-string v0, "getActivity"

    .line 177
    .line 178
    new-array v14, v12, [Ljava/lang/Object;

    .line 179
    .line 180
    invoke-static {v4, v0, v14}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    instance-of v14, v0, Landroid/app/Activity;

    .line 185
    .line 186
    if-eqz v14, :cond_7

    .line 187
    .line 188
    check-cast v0, Landroid/app/Activity;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 189
    .line 190
    goto :goto_4

    .line 191
    :catchall_0
    move-exception v0

    .line 192
    goto :goto_3

    .line 193
    :cond_7
    const/4 v0, 0x0

    .line 194
    goto :goto_4

    .line 195
    :goto_3
    new-instance v14, Leo1;

    .line 196
    .line 197
    invoke-direct {v14, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 198
    .line 199
    .line 200
    move-object v0, v14

    .line 201
    :goto_4
    instance-of v14, v0, Leo1;

    .line 202
    .line 203
    if-eqz v14, :cond_8

    .line 204
    .line 205
    const/4 v0, 0x0

    .line 206
    :cond_8
    check-cast v0, Landroid/app/Activity;

    .line 207
    .line 208
    if-eqz v0, :cond_9

    .line 209
    .line 210
    goto :goto_7

    .line 211
    :cond_9
    :try_start_1
    const-string v0, "getContext"

    .line 212
    .line 213
    new-array v14, v12, [Ljava/lang/Object;

    .line 214
    .line 215
    invoke-static {v4, v0, v14}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    instance-of v4, v0, Landroid/content/Context;

    .line 220
    .line 221
    if-eqz v4, :cond_a

    .line 222
    .line 223
    check-cast v0, Landroid/content/Context;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 224
    .line 225
    goto :goto_6

    .line 226
    :catchall_1
    move-exception v0

    .line 227
    goto :goto_5

    .line 228
    :cond_a
    const/4 v0, 0x0

    .line 229
    goto :goto_6

    .line 230
    :goto_5
    new-instance v4, Leo1;

    .line 231
    .line 232
    invoke-direct {v4, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 233
    .line 234
    .line 235
    move-object v0, v4

    .line 236
    :goto_6
    instance-of v4, v0, Leo1;

    .line 237
    .line 238
    if-eqz v4, :cond_b

    .line 239
    .line 240
    const/4 v0, 0x0

    .line 241
    :cond_b
    check-cast v0, Landroid/content/Context;

    .line 242
    .line 243
    instance-of v4, v0, Landroid/app/Activity;

    .line 244
    .line 245
    if-eqz v4, :cond_c

    .line 246
    .line 247
    move-object v4, v0

    .line 248
    check-cast v4, Landroid/app/Activity;

    .line 249
    .line 250
    goto :goto_2

    .line 251
    :cond_c
    invoke-static {}, Li;->α()Landroid/app/Activity;

    .line 252
    .line 253
    .line 254
    move-result-object v4

    .line 255
    goto :goto_2

    .line 256
    :goto_7
    if-nez v0, :cond_d

    .line 257
    .line 258
    new-instance v0, Ljava/lang/StringBuilder;

    .line 259
    .line 260
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    const-string v1, " voice replace: activity not found"

    .line 267
    .line 268
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    invoke-static {v6, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    return-void

    .line 279
    :cond_d
    invoke-static {}, Lx9;->π()Z

    .line 280
    .line 281
    .line 282
    move-result v4

    .line 283
    if-eqz v4, :cond_1b

    .line 284
    .line 285
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->ξ()Z

    .line 286
    .line 287
    .line 288
    move-result v4

    .line 289
    if-eqz v4, :cond_1b

    .line 290
    .line 291
    const-string v4, "voice_replace_enabled"

    .line 292
    .line 293
    invoke-static {v4, v12}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 294
    .line 295
    .line 296
    move-result v4

    .line 297
    if-nez v4, :cond_e

    .line 298
    .line 299
    goto/16 :goto_10

    .line 300
    .line 301
    :cond_e
    invoke-static {}, Lib2;->χ()Ljava/util/ArrayList;

    .line 302
    .line 303
    .line 304
    move-result-object v4

    .line 305
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 306
    .line 307
    .line 308
    move-result v4

    .line 309
    const-string v14, "voice_replace_confirm_before_send"

    .line 310
    .line 311
    const-string v15, "voice_replace_mode"

    .line 312
    .line 313
    const/4 v13, 0x1

    .line 314
    if-eqz v4, :cond_10

    .line 315
    .line 316
    :try_start_2
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 317
    .line 318
    .line 319
    move-result-object v4

    .line 320
    invoke-interface {v4, v15, v12}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 321
    .line 322
    .line 323
    move-result v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 324
    goto :goto_8

    .line 325
    :catchall_2
    move v4, v12

    .line 326
    :goto_8
    if-nez v4, :cond_f

    .line 327
    .line 328
    invoke-static {v14, v13}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 329
    .line 330
    .line 331
    move-result v4

    .line 332
    if-eqz v4, :cond_f

    .line 333
    .line 334
    move v4, v13

    .line 335
    goto :goto_9

    .line 336
    :cond_f
    move v4, v12

    .line 337
    :goto_9
    if-nez v4, :cond_10

    .line 338
    .line 339
    goto/16 :goto_10

    .line 340
    .line 341
    :cond_10
    const-string v4, "voice_replace_scope"

    .line 342
    .line 343
    :try_start_3
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 344
    .line 345
    .line 346
    move-result-object v13

    .line 347
    invoke-interface {v13, v4, v12}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 348
    .line 349
    .line 350
    move-result v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 351
    :goto_a
    const/4 v13, 0x1

    .line 352
    goto :goto_b

    .line 353
    :catchall_3
    move v4, v12

    .line 354
    goto :goto_a

    .line 355
    :goto_b
    if-eq v4, v13, :cond_12

    .line 356
    .line 357
    const/4 v13, 0x2

    .line 358
    if-eq v4, v13, :cond_11

    .line 359
    .line 360
    goto :goto_c

    .line 361
    :cond_11
    if-ne v2, v11, :cond_1b

    .line 362
    .line 363
    goto :goto_c

    .line 364
    :cond_12
    sget-object v4, Lya2;->ζ:Lya2;

    .line 365
    .line 366
    if-ne v2, v4, :cond_1b

    .line 367
    .line 368
    :goto_c
    const-string v4, "-original"

    .line 369
    .line 370
    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v4

    .line 374
    invoke-static {v4, v10, v7, v8, v9}, Lib2;->ψ(Ljava/lang/String;Ljava/io/File;JLjava/util/List;)V

    .line 375
    .line 376
    .line 377
    iget-object v13, v2, Lya2;->ε:Lkf0;

    .line 378
    .line 379
    invoke-virtual {v13, v7, v8}, Lkf0;->β(J)J

    .line 380
    .line 381
    .line 382
    move-result-wide v4

    .line 383
    move-object/from16 v19, v0

    .line 384
    .line 385
    :try_start_4
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    invoke-interface {v0, v15, v12}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 390
    .line 391
    .line 392
    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 393
    goto :goto_d

    .line 394
    :catchall_4
    move v0, v12

    .line 395
    :goto_d
    if-nez v0, :cond_13

    .line 396
    .line 397
    const/4 v0, 0x1

    .line 398
    invoke-static {v14, v0}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 399
    .line 400
    .line 401
    move-result v14

    .line 402
    if-eqz v14, :cond_13

    .line 403
    .line 404
    move v12, v0

    .line 405
    :cond_13
    if-eqz v12, :cond_17

    .line 406
    .line 407
    iget-object v0, v1, Lk01;->α:Ljava/lang/reflect/Executable;

    .line 408
    .line 409
    instance-of v7, v0, Ljava/lang/reflect/Method;

    .line 410
    .line 411
    if-eqz v7, :cond_14

    .line 412
    .line 413
    check-cast v0, Ljava/lang/reflect/Method;

    .line 414
    .line 415
    move-object/from16 v20, v0

    .line 416
    .line 417
    goto :goto_e

    .line 418
    :cond_14
    const/16 v20, 0x0

    .line 419
    .line 420
    :goto_e
    if-nez v20, :cond_15

    .line 421
    .line 422
    goto/16 :goto_f

    .line 423
    .line 424
    :cond_15
    iget-object v7, v1, Lk01;->β:Ljava/lang/Object;

    .line 425
    .line 426
    iget-object v0, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 427
    .line 428
    if-nez v0, :cond_16

    .line 429
    .line 430
    goto/16 :goto_f

    .line 431
    .line 432
    :cond_16
    array-length v8, v0

    .line 433
    invoke-static {v0, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v22

    .line 437
    const/4 v8, 0x0

    .line 438
    invoke-virtual {v1, v8}, Lk01;->α(Ljava/lang/Object;)V

    .line 439
    .line 440
    .line 441
    new-instance v0, Ljava/lang/StringBuilder;

    .line 442
    .line 443
    const-string v1, "show "

    .line 444
    .line 445
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 449
    .line 450
    .line 451
    const-string v1, " voice replace confirm"

    .line 452
    .line 453
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    invoke-static {v6, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 461
    .line 462
    .line 463
    new-instance v0, Lna2;

    .line 464
    .line 465
    move-object/from16 v3, v17

    .line 466
    .line 467
    move-object/from16 v1, v19

    .line 468
    .line 469
    move-object/from16 v6, v20

    .line 470
    .line 471
    move-object/from16 v8, v22

    .line 472
    .line 473
    invoke-direct/range {v0 .. v8}, Lna2;-><init>(Landroid/app/Activity;Lya2;Lab2;JLjava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 474
    .line 475
    .line 476
    move-object/from16 v21, v7

    .line 477
    .line 478
    new-instance v18, Lv8;

    .line 479
    .line 480
    const/16 v24, 0x8

    .line 481
    .line 482
    move-object/from16 v23, v0

    .line 483
    .line 484
    invoke-direct/range {v18 .. v24}, Lv8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 485
    .line 486
    .line 487
    move-object/from16 v0, v18

    .line 488
    .line 489
    sget-object v1, Lib2;->β:Landroid/os/Handler;

    .line 490
    .line 491
    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 492
    .line 493
    .line 494
    goto :goto_f

    .line 495
    :cond_17
    move-object/from16 v12, v17

    .line 496
    .line 497
    new-instance v0, Ljava/lang/StringBuilder;

    .line 498
    .line 499
    const-string v1, "auto replace "

    .line 500
    .line 501
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 502
    .line 503
    .line 504
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 505
    .line 506
    .line 507
    const-string v1, " voice"

    .line 508
    .line 509
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object v0

    .line 516
    invoke-static {v6, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 517
    .line 518
    .line 519
    invoke-static {}, Lib2;->χ()Ljava/util/ArrayList;

    .line 520
    .line 521
    .line 522
    move-result-object v0

    .line 523
    invoke-static {v0}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    move-object v2, v0

    .line 528
    check-cast v2, Lqa2;

    .line 529
    .line 530
    if-nez v2, :cond_18

    .line 531
    .line 532
    goto :goto_f

    .line 533
    :cond_18
    invoke-virtual {v13, v7, v8}, Lkf0;->β(J)J

    .line 534
    .line 535
    .line 536
    move-result-wide v4

    .line 537
    new-instance v7, Lhu1;

    .line 538
    .line 539
    const/16 v0, 0x8

    .line 540
    .line 541
    invoke-direct {v7, v0}, Lhu1;-><init>(I)V

    .line 542
    .line 543
    .line 544
    move-object/from16 v1, p1

    .line 545
    .line 546
    move-object v6, v9

    .line 547
    move-object v3, v10

    .line 548
    move-object/from16 v0, v19

    .line 549
    .line 550
    invoke-static/range {v0 .. v7}, Lib2;->ζ(Landroid/content/Context;Lya2;Lqa2;Ljava/io/File;JLjava/util/List;Le80;)Lcb2;

    .line 551
    .line 552
    .line 553
    move-result-object v0

    .line 554
    move-object v2, v1

    .line 555
    if-nez v0, :cond_19

    .line 556
    .line 557
    goto :goto_f

    .line 558
    :cond_19
    invoke-virtual {v12, v0, v13}, Lab2;->α(Lcb2;Lkf0;)V

    .line 559
    .line 560
    .line 561
    if-ne v2, v11, :cond_1a

    .line 562
    .line 563
    invoke-static {v0}, Lib2;->ω(Lcb2;)V

    .line 564
    .line 565
    .line 566
    :cond_1a
    :goto_f
    return-void

    .line 567
    :cond_1b
    :goto_10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 568
    .line 569
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 570
    .line 571
    .line 572
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 573
    .line 574
    .line 575
    const-string v1, " voice replace: disabled or no audio"

    .line 576
    .line 577
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 578
    .line 579
    .line 580
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 581
    .line 582
    .line 583
    move-result-object v0

    .line 584
    invoke-static {v6, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 585
    .line 586
    .line 587
    return-void
.end method

.method public static μ(Ljava/lang/reflect/Method;Lp70;)V
    .locals 12

    .line 1
    invoke-static {p0}, Llz1;->τ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1, p0}, Llz1;->ο(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    new-instance v4, Ljava/util/ArrayList;

    .line 21
    .line 22
    array-length v5, v3

    .line 23
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 24
    .line 25
    .line 26
    array-length v5, v3

    .line 27
    const/4 v6, 0x0

    .line 28
    :goto_0
    const/4 v11, 0x1

    .line 29
    if-ge v6, v5, :cond_0

    .line 30
    .line 31
    aget-object v7, v3, v6

    .line 32
    .line 33
    invoke-static {v7, v4, v6, v11}, Llz1;->δ(Ljava/lang/Class;Ljava/util/ArrayList;II)I

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 43
    .line 44
    .line 45
    const/4 v9, 0x0

    .line 46
    const/16 v10, 0x3e

    .line 47
    .line 48
    const-string v5, ","

    .line 49
    .line 50
    const/4 v6, 0x0

    .line 51
    const/4 v7, 0x0

    .line 52
    const/4 v8, 0x0

    .line 53
    invoke-static/range {v4 .. v10}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    const-string v4, "("

    .line 58
    .line 59
    const-string v5, "#"

    .line 60
    .line 61
    invoke-static {v0, v5, v1, v4, v3}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    const-string v1, "):"

    .line 66
    .line 67
    invoke-static {v0, v1, v2}, Llz1;->π(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    sget-object v2, Lib2;->ζ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 72
    .line 73
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_1

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_1
    :try_start_0
    invoke-virtual {p0, v11}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 81
    .line 82
    .line 83
    sget-object v0, Lxq0;->α:Lxq0;

    .line 84
    .line 85
    invoke-interface {p1}, Lp70;->invoke()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    check-cast p1, Lm01;

    .line 90
    .line 91
    invoke-virtual {v0, p0, p1}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 92
    .line 93
    .line 94
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    goto :goto_1

    .line 96
    :catchall_0
    move-exception v0

    .line 97
    move-object p1, v0

    .line 98
    new-instance v0, Leo1;

    .line 99
    .line 100
    invoke-direct {v0, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 101
    .line 102
    .line 103
    move-object p1, v0

    .line 104
    :goto_1
    instance-of v0, p1, Leo1;

    .line 105
    .line 106
    const-string v3, "rb360b99c73f2f647"

    .line 107
    .line 108
    if-nez v0, :cond_2

    .line 109
    .line 110
    move-object v0, p1

    .line 111
    check-cast v0, Ll01;

    .line 112
    .line 113
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    const-string v6, "hooked "

    .line 126
    .line 127
    invoke-static {v6, v0, v5, v4, v3}, Lnx;->ψ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    :cond_2
    invoke-static {p1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    if-eqz p1, :cond_3

    .line 135
    .line 136
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    const-string v1, "hook failed "

    .line 152
    .line 153
    invoke-static {v1, v0, v5, p0}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    invoke-static {v3, p0, p1}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 158
    .line 159
    .line 160
    :cond_3
    :goto_2
    return-void
.end method

.method public static σ(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)V
    .locals 3

    .line 1
    sget-object v0, Lib2;->ι:Lf3;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/lang/Integer;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    :goto_0
    add-int/lit8 v2, v1, 0x1

    .line 18
    .line 19
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v0, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    :try_start_0
    sget-object v2, Lxq0;->α:Lxq0;

    .line 27
    .line 28
    invoke-virtual {v2, p1, p0, p2}, Lxq0;->ζ(Ljava/lang/reflect/Member;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    goto :goto_1

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    new-instance p1, Leo1;

    .line 35
    .line 36
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    move-object p0, p1

    .line 40
    :goto_1
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    if-eqz p0, :cond_1

    .line 45
    .line 46
    const-string p1, "rb360b99c73f2f647"

    .line 47
    .line 48
    const-string p2, "invoke original voice method failed"

    .line 49
    .line 50
    invoke-static {p1, p2, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    if-nez v1, :cond_2

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_2
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {v0, p0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    :goto_2
    return-void
.end method

.method public static τ()Z
    .locals 2

    .line 1
    sget-object v0, Lib2;->ι:Lf3;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Integer;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v0, v1

    .line 18
    :goto_0
    if-lez v0, :cond_1

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    return v0

    .line 22
    :cond_1
    return v1
.end method

.method public static υ(Ljava/lang/reflect/Method;)Z
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->isInterface()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto/16 :goto_2

    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    goto/16 :goto_2

    .line 25
    .line 26
    :cond_1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isNative(I)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    goto/16 :goto_2

    .line 37
    .line 38
    :cond_2
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 43
    .line 44
    invoke-static {v0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_3

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_3
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    array-length v0, v0

    .line 59
    if-nez v0, :cond_4

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_4
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    array-length v0, v0

    .line 67
    const/4 v2, 0x3

    .line 68
    if-le v0, v2, :cond_5

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_5
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    array-length v0, v0

    .line 76
    const/4 v2, 0x2

    .line 77
    const/4 v3, 0x1

    .line 78
    if-ne v0, v2, :cond_6

    .line 79
    .line 80
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    aget-object v0, v0, v1

    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    const-string v2, "~78B71E7541C477E838C50BCD302E054C40CC02248AA0B9F3FD7D96E48E5395705804FE3D36452620E7FC53FD8B9A95157A99FAA773CE660D7C7738560C6110F6C94E186A484AA44D"

    .line 91
    .line 92
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_6

    .line 101
    .line 102
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    aget-object v0, v0, v3

    .line 107
    .line 108
    invoke-static {v0}, Lib2;->ι(Ljava/lang/Class;)Lbb2;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    if-eqz v0, :cond_6

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_6
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    array-length v2, v0

    .line 123
    move v4, v1

    .line 124
    :goto_0
    if-ge v4, v2, :cond_8

    .line 125
    .line 126
    aget-object v5, v0, v4

    .line 127
    .line 128
    invoke-static {v5}, Lib2;->ι(Ljava/lang/Class;)Lbb2;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    if-eqz v5, :cond_7

    .line 133
    .line 134
    invoke-static {p0}, Lib2;->Θ(Ljava/lang/reflect/Method;)I

    .line 135
    .line 136
    .line 137
    move-result p0

    .line 138
    const/16 v0, 0x384

    .line 139
    .line 140
    if-lt p0, v0, :cond_8

    .line 141
    .line 142
    :goto_1
    return v3

    .line 143
    :cond_7
    add-int/lit8 v4, v4, 0x1

    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_8
    :goto_2
    return v1
.end method

.method public static φ(Ljava/lang/reflect/Method;)Z
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->isInterface()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto/16 :goto_2

    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    goto/16 :goto_2

    .line 25
    .line 26
    :cond_1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isNative(I)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    goto/16 :goto_2

    .line 37
    .line 38
    :cond_2
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 43
    .line 44
    invoke-static {v0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_3

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_3
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    array-length v0, v0

    .line 59
    if-nez v0, :cond_4

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_4
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    array-length v0, v0

    .line 67
    const/4 v2, 0x4

    .line 68
    if-le v0, v2, :cond_5

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_5
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    array-length v0, v0

    .line 76
    const/4 v2, 0x2

    .line 77
    const/4 v3, 0x1

    .line 78
    if-ne v0, v2, :cond_6

    .line 79
    .line 80
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    aget-object v0, v0, v1

    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    const-string v2, "~789F9198A9AE6768B1E75F22FE4AFF5FB8139FFB2E3E8ED9059A4B8CF38A7C966955DCB17D901708EC38BEC31F5673DC6814DF5F607943847446CE2B584C33D3A13A"

    .line 91
    .line 92
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_6

    .line 101
    .line 102
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    aget-object v0, v0, v3

    .line 107
    .line 108
    invoke-static {v0}, Lib2;->ι(Ljava/lang/Class;)Lbb2;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    if-eqz v0, :cond_6

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_6
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    array-length v2, v0

    .line 123
    move v4, v1

    .line 124
    :goto_0
    if-ge v4, v2, :cond_8

    .line 125
    .line 126
    aget-object v5, v0, v4

    .line 127
    .line 128
    invoke-static {v5}, Lib2;->ι(Ljava/lang/Class;)Lbb2;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    if-eqz v5, :cond_7

    .line 133
    .line 134
    invoke-static {p0}, Lib2;->Ι(Ljava/lang/reflect/Method;)I

    .line 135
    .line 136
    .line 137
    move-result p0

    .line 138
    const/16 v0, 0x320

    .line 139
    .line 140
    if-lt p0, v0, :cond_8

    .line 141
    .line 142
    :goto_1
    return v3

    .line 143
    :cond_7
    add-int/lit8 v4, v4, 0x1

    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_8
    :goto_2
    return v1
.end method

.method public static χ()Ljava/util/ArrayList;
    .locals 13

    .line 1
    const-string v1, ""

    .line 2
    .line 3
    new-instance v2, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    :try_start_0
    const-string v0, "voice_replace_audio_list"

    .line 9
    .line 10
    invoke-static {v0, v1}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-nez v3, :cond_4

    .line 19
    .line 20
    new-instance v3, Lorg/json/JSONArray;

    .line 21
    .line 22
    invoke-direct {v3, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/4 v4, 0x0

    .line 30
    :goto_0
    if-ge v4, v0, :cond_4

    .line 31
    .line 32
    invoke-virtual {v3, v4}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    if-nez v5, :cond_0

    .line 37
    .line 38
    goto :goto_3

    .line 39
    :cond_0
    const-string v6, "uri"

    .line 40
    .line 41
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v10

    .line 45
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-static {v10}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-nez v6, :cond_3

    .line 53
    .line 54
    const-string v6, "id"

    .line 55
    .line 56
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    invoke-static {v6}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    if-eqz v7, :cond_1

    .line 65
    .line 66
    move-object v8, v10

    .line 67
    goto :goto_1

    .line 68
    :cond_1
    move-object v8, v6

    .line 69
    :goto_1
    const-string v6, "name"

    .line 70
    .line 71
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    invoke-static {v6}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    if-eqz v7, :cond_2

    .line 80
    .line 81
    const-string v6, "\u672a\u547d\u540d\u97f3\u9891"

    .line 82
    .line 83
    :cond_2
    move-object v9, v6

    .line 84
    goto :goto_2

    .line 85
    :catchall_0
    move-exception v0

    .line 86
    goto :goto_4

    .line 87
    :goto_2
    const-string v6, "durationMs"

    .line 88
    .line 89
    const-wide/16 v11, 0x0

    .line 90
    .line 91
    invoke-virtual {v5, v6, v11, v12}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 92
    .line 93
    .line 94
    move-result-wide v11

    .line 95
    new-instance v7, Lqa2;

    .line 96
    .line 97
    invoke-direct/range {v7 .. v12}, Lqa2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    :cond_3
    :goto_3
    add-int/lit8 v4, v4, 0x1

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_4
    sget-object v0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    .line 108
    goto :goto_5

    .line 109
    :goto_4
    new-instance v3, Leo1;

    .line 110
    .line 111
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 112
    .line 113
    .line 114
    move-object v0, v3

    .line 115
    :goto_5
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    if-eqz v0, :cond_5

    .line 120
    .line 121
    const-string v3, "rb360b99c73f2f647"

    .line 122
    .line 123
    const-string v4, "load voice audio list failed"

    .line 124
    .line 125
    invoke-static {v3, v4, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 126
    .line 127
    .line 128
    :cond_5
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-eqz v0, :cond_7

    .line 133
    .line 134
    const-string v0, "voice_replace_mp3_uri"

    .line 135
    .line 136
    invoke-static {v0, v1}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-nez v0, :cond_7

    .line 145
    .line 146
    const-string v0, "voice_replace_mp3_name"

    .line 147
    .line 148
    invoke-static {v0, v1}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    if-eqz v1, :cond_6

    .line 157
    .line 158
    const-string v0, "\u5df2\u9009\u62e9 MP3"

    .line 159
    .line 160
    :cond_6
    move-object v5, v0

    .line 161
    new-instance v3, Lqa2;

    .line 162
    .line 163
    const-wide/16 v7, 0x0

    .line 164
    .line 165
    move-object v6, v4

    .line 166
    invoke-direct/range {v3 .. v8}, Lqa2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    invoke-static {v2}, Lib2;->Η(Ljava/util/ArrayList;)V

    .line 173
    .line 174
    .line 175
    :cond_7
    new-instance v0, Ljava/util/HashSet;

    .line 176
    .line 177
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 178
    .line 179
    .line 180
    new-instance v1, Ljava/util/ArrayList;

    .line 181
    .line 182
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    :cond_8
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    if-eqz v3, :cond_9

    .line 194
    .line 195
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    move-object v4, v3

    .line 200
    check-cast v4, Lqa2;

    .line 201
    .line 202
    iget-object v4, v4, Lqa2;->γ:Ljava/lang/String;

    .line 203
    .line 204
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v4

    .line 208
    if-eqz v4, :cond_8

    .line 209
    .line 210
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    goto :goto_6

    .line 214
    :cond_9
    new-instance v0, Ljava/util/ArrayList;

    .line 215
    .line 216
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 217
    .line 218
    .line 219
    return-object v0
.end method

.method public static ψ(Ljava/lang/String;Ljava/io/File;JLjava/util/List;)V
    .locals 14

    .line 1
    const-string v1, "rb360b99c73f2f647"

    .line 2
    .line 3
    const-string v2, "probe "

    .line 4
    .line 5
    :try_start_0
    invoke-static {p1}, Lib2;->Α(Ljava/io/File;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v3

    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    invoke-virtual {p1}, Ljava/io/File;->length()J

    .line 30
    .line 31
    .line 32
    move-result-wide v8

    .line 33
    invoke-interface/range {p4 .. p4}, Ljava/util/List;->size()I

    .line 34
    .line 35
    .line 36
    move-result v10

    .line 37
    const/4 v11, 0x6

    .line 38
    move-object/from16 v12, p4

    .line 39
    .line 40
    invoke-static {v12, v11}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v11

    .line 44
    new-instance v12, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {v12, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v12, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v13, " classFile="

    .line 53
    .line 54
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v0, ", path="

    .line 61
    .line 62
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v0, ", name="

    .line 69
    .line 70
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v0, ", exists="

    .line 77
    .line 78
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v0, ", size="

    .line 85
    .line 86
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v12, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v0, ", recordDuration="

    .line 93
    .line 94
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    move-wide/from16 v5, p2

    .line 98
    .line 99
    invoke-virtual {v12, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const-string v0, ", metaDuration="

    .line 103
    .line 104
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v12, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string v0, ", waveSize="

    .line 111
    .line 112
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    const-string v0, ", waveHead="

    .line 119
    .line 120
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-static {v1, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    sget-object v0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 134
    .line 135
    goto :goto_0

    .line 136
    :catchall_0
    move-exception v0

    .line 137
    new-instance v3, Leo1;

    .line 138
    .line 139
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 140
    .line 141
    .line 142
    move-object v0, v3

    .line 143
    :goto_0
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    if-eqz v0, :cond_0

    .line 148
    .line 149
    new-instance v3, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    const-string p0, " failed"

    .line 158
    .line 159
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    invoke-static {v1, p0, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 167
    .line 168
    .line 169
    :cond_0
    return-void
.end method

.method public static ω(Lcb2;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcb2;->α:Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    const-wide/16 v3, 0x7530

    .line 12
    .line 13
    add-long/2addr v1, v3

    .line 14
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    sget-object v2, Lib2;->θ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 19
    .line 20
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcb2;->α:Ljava/io/File;

    .line 24
    .line 25
    iget-wide v1, p0, Lcb2;->β:J

    .line 26
    .line 27
    iget-object p0, p0, Lcb2;->γ:Ljava/util/List;

    .line 28
    .line 29
    const-string v3, "im-replacement"

    .line 30
    .line 31
    invoke-static {v3, v0, v1, v2, p0}, Lib2;->ψ(Ljava/lang/String;Ljava/io/File;JLjava/util/List;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final Ε(Ljava/lang/ClassLoader;)Ljava/util/List;
    .locals 21

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    sget-object v1, Lox;->α:Ljava/lang/Object;

    .line 4
    .line 5
    sget-object v1, Lkx;->ｕ:Lkx;

    .line 6
    .line 7
    invoke-static {v1, v0}, Lox;->σ(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "):"

    .line 12
    .line 13
    const-string v3, "("

    .line 14
    .line 15
    const-string v4, "#"

    .line 16
    .line 17
    const/4 v6, 0x1

    .line 18
    if-eqz v1, :cond_7

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v7

    .line 24
    if-eqz v7, :cond_0

    .line 25
    .line 26
    goto/16 :goto_4

    .line 27
    .line 28
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    if-eqz v7, :cond_2

    .line 42
    .line 43
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    move-object v8, v7

    .line 48
    check-cast v8, Ljava/lang/reflect/Method;

    .line 49
    .line 50
    invoke-static {v8}, Lib2;->φ(Ljava/lang/reflect/Method;)Z

    .line 51
    .line 52
    .line 53
    move-result v8

    .line 54
    if-eqz v8, :cond_1

    .line 55
    .line 56
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    if-eqz v7, :cond_3

    .line 69
    .line 70
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    check-cast v7, Ljava/lang/reflect/Method;

    .line 75
    .line 76
    invoke-virtual {v7, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    new-instance v1, Ljava/util/HashSet;

    .line 81
    .line 82
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 83
    .line 84
    .line 85
    new-instance v7, Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result v8

    .line 98
    if-eqz v8, :cond_6

    .line 99
    .line 100
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v8

    .line 104
    move-object v9, v8

    .line 105
    check-cast v9, Ljava/lang/reflect/Method;

    .line 106
    .line 107
    invoke-static {v9}, Llz1;->τ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v10

    .line 111
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v11

    .line 115
    invoke-static {v11, v9}, Llz1;->ο(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v12

    .line 119
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    move-result-object v13

    .line 123
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    new-instance v14, Ljava/util/ArrayList;

    .line 127
    .line 128
    array-length v15, v13

    .line 129
    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 130
    .line 131
    .line 132
    array-length v15, v13

    .line 133
    const/4 v5, 0x0

    .line 134
    :goto_3
    if-ge v5, v15, :cond_4

    .line 135
    .line 136
    move-object/from16 p0, v0

    .line 137
    .line 138
    aget-object v0, v13, v5

    .line 139
    .line 140
    invoke-static {v0, v14, v5, v6}, Llz1;->δ(Ljava/lang/Class;Ljava/util/ArrayList;II)I

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    move-object/from16 v0, p0

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_4
    move-object/from16 p0, v0

    .line 148
    .line 149
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 154
    .line 155
    .line 156
    const/16 v19, 0x0

    .line 157
    .line 158
    const/16 v20, 0x3e

    .line 159
    .line 160
    const-string v15, ","

    .line 161
    .line 162
    const/16 v16, 0x0

    .line 163
    .line 164
    const/16 v17, 0x0

    .line 165
    .line 166
    const/16 v18, 0x0

    .line 167
    .line 168
    invoke-static/range {v14 .. v20}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-static {v10, v4, v11, v3, v0}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-static {v0, v2, v12, v1}, Llz1;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashSet;)Z

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    if-eqz v0, :cond_5

    .line 181
    .line 182
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    :cond_5
    move-object/from16 v0, p0

    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_6
    return-object v7

    .line 189
    :cond_7
    :goto_4
    const-string v1, "~78B71E7541C477E838C50BCD302E054C40CC02248AA0B9F3FD7794A78143886D1800F82A71492D2EFEBF50F69EC092027CD8E9B672D52762657C36503D2A32ECDF4324524659B85D"

    .line 190
    .line 191
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    const-string v5, "~78A74DB286A5B58D592E394EF41C63DE20BC788EDC43993D9FEA5AB5AF6D50AFD0F0A8F194EEE1D726145FD213361DB182A777A0AE8B08F4F88BB26292D31FE70F2128D25D9DD7C430B16F76"

    .line 196
    .line 197
    invoke-static {v5}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    const-string v7, "~796C0BCB62BCE6FE82C87A254D6EEBA7FF748413BC384A314027F4FDD0319181261306E8D79B9D665CEFDE51625B554792EFFB41899CEB9C050D6E42C136"

    .line 202
    .line 203
    invoke-static {v7}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v7

    .line 207
    filled-new-array {v1, v5, v7}, [Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    invoke-static {v1}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    new-instance v5, Ljava/util/ArrayList;

    .line 216
    .line 217
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 218
    .line 219
    .line 220
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    :cond_8
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 225
    .line 226
    .line 227
    move-result v7

    .line 228
    if-eqz v7, :cond_9

    .line 229
    .line 230
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v7

    .line 234
    check-cast v7, Ljava/lang/String;

    .line 235
    .line 236
    invoke-static {v0, v7}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    move-result-object v7

    .line 240
    if-eqz v7, :cond_8

    .line 241
    .line 242
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    goto :goto_5

    .line 246
    :cond_9
    new-instance v0, Ljava/util/ArrayList;

    .line 247
    .line 248
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 256
    .line 257
    .line 258
    move-result v5

    .line 259
    if-eqz v5, :cond_b

    .line 260
    .line 261
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v5

    .line 265
    check-cast v5, Ljava/lang/Class;

    .line 266
    .line 267
    new-instance v7, Ljava/util/ArrayList;

    .line 268
    .line 269
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v5}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 273
    .line 274
    .line 275
    move-result-object v8

    .line 276
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    invoke-static {v7, v8}, Lxh;->э(Ljava/util/AbstractCollection;[Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    invoke-static {v5}, Lib2;->ε(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 283
    .line 284
    .line 285
    move-result-object v5

    .line 286
    new-instance v8, Ljava/util/ArrayList;

    .line 287
    .line 288
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 292
    .line 293
    .line 294
    move-result-object v5

    .line 295
    :goto_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 296
    .line 297
    .line 298
    move-result v9

    .line 299
    if-eqz v9, :cond_a

    .line 300
    .line 301
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v9

    .line 305
    check-cast v9, Ljava/lang/Class;

    .line 306
    .line 307
    invoke-virtual {v9}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 308
    .line 309
    .line 310
    move-result-object v9

    .line 311
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    invoke-static {v9}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 315
    .line 316
    .line 317
    move-result-object v9

    .line 318
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    invoke-static {v8, v9}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 322
    .line 323
    .line 324
    goto :goto_7

    .line 325
    :cond_a
    invoke-static {v7, v8}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 326
    .line 327
    .line 328
    invoke-static {v0, v7}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 329
    .line 330
    .line 331
    goto :goto_6

    .line 332
    :cond_b
    new-instance v1, Ljava/util/ArrayList;

    .line 333
    .line 334
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    :cond_c
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 342
    .line 343
    .line 344
    move-result v5

    .line 345
    if-eqz v5, :cond_d

    .line 346
    .line 347
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v5

    .line 351
    move-object v7, v5

    .line 352
    check-cast v7, Ljava/lang/reflect/Method;

    .line 353
    .line 354
    invoke-static {v7}, Lib2;->φ(Ljava/lang/reflect/Method;)Z

    .line 355
    .line 356
    .line 357
    move-result v7

    .line 358
    if-eqz v7, :cond_c

    .line 359
    .line 360
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    goto :goto_8

    .line 364
    :cond_d
    new-instance v0, Lqy1;

    .line 365
    .line 366
    const/16 v5, 0xa

    .line 367
    .line 368
    move-object/from16 v7, p0

    .line 369
    .line 370
    invoke-direct {v0, v7, v5}, Lqy1;-><init>(Lib2;I)V

    .line 371
    .line 372
    .line 373
    invoke-static {v1, v0}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 382
    .line 383
    .line 384
    move-result v5

    .line 385
    if-eqz v5, :cond_e

    .line 386
    .line 387
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v5

    .line 391
    check-cast v5, Ljava/lang/reflect/Method;

    .line 392
    .line 393
    invoke-virtual {v5, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 394
    .line 395
    .line 396
    goto :goto_9

    .line 397
    :cond_e
    new-instance v1, Ljava/util/HashSet;

    .line 398
    .line 399
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 400
    .line 401
    .line 402
    new-instance v5, Ljava/util/ArrayList;

    .line 403
    .line 404
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 405
    .line 406
    .line 407
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 412
    .line 413
    .line 414
    move-result v7

    .line 415
    if-eqz v7, :cond_11

    .line 416
    .line 417
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v7

    .line 421
    move-object v8, v7

    .line 422
    check-cast v8, Ljava/lang/reflect/Method;

    .line 423
    .line 424
    invoke-static {v8}, Llz1;->τ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v9

    .line 428
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v10

    .line 432
    invoke-static {v10, v8}, Llz1;->ο(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object v11

    .line 436
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 437
    .line 438
    .line 439
    move-result-object v12

    .line 440
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 441
    .line 442
    .line 443
    new-instance v13, Ljava/util/ArrayList;

    .line 444
    .line 445
    array-length v14, v12

    .line 446
    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 447
    .line 448
    .line 449
    array-length v14, v12

    .line 450
    const/4 v15, 0x0

    .line 451
    :goto_b
    if-ge v15, v14, :cond_f

    .line 452
    .line 453
    move-object/from16 p0, v0

    .line 454
    .line 455
    aget-object v0, v12, v15

    .line 456
    .line 457
    invoke-static {v0, v13, v15, v6}, Llz1;->δ(Ljava/lang/Class;Ljava/util/ArrayList;II)I

    .line 458
    .line 459
    .line 460
    move-result v15

    .line 461
    move-object/from16 v0, p0

    .line 462
    .line 463
    goto :goto_b

    .line 464
    :cond_f
    move-object/from16 p0, v0

    .line 465
    .line 466
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 467
    .line 468
    .line 469
    move-result v0

    .line 470
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 471
    .line 472
    .line 473
    const/16 v18, 0x0

    .line 474
    .line 475
    const/16 v19, 0x3e

    .line 476
    .line 477
    const-string v14, ","

    .line 478
    .line 479
    const/4 v15, 0x0

    .line 480
    const/16 v16, 0x0

    .line 481
    .line 482
    const/16 v17, 0x0

    .line 483
    .line 484
    invoke-static/range {v13 .. v19}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    invoke-static {v9, v4, v10, v3, v0}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    invoke-static {v0, v2, v11, v1}, Llz1;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashSet;)Z

    .line 493
    .line 494
    .line 495
    move-result v0

    .line 496
    if-eqz v0, :cond_10

    .line 497
    .line 498
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 499
    .line 500
    .line 501
    :cond_10
    move-object/from16 v0, p0

    .line 502
    .line 503
    goto :goto_a

    .line 504
    :cond_11
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 505
    .line 506
    .line 507
    move-result v0

    .line 508
    if-nez v0, :cond_12

    .line 509
    .line 510
    return-object v5

    .line 511
    :cond_12
    sget-object v0, Ljz;->ε:Ljz;

    .line 512
    .line 513
    return-object v0
.end method

.method public final ν(Ljava/lang/ClassLoader;)V
    .locals 9

    .line 1
    const-string v0, "rb360b99c73f2f647"

    .line 2
    .line 3
    :try_start_0
    sget-object v1, Lqe0;->α:Ljava/lang/Object;

    .line 4
    .line 5
    const-string v1, "~792CC2D8C5D51E39AD4E690FAB6B92B18C03F97DDE8AB94312851DBF90DE22E29AC5FA85873739BB209E3F8E8F8E"

    .line 6
    .line 7
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {p1, v1}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    const-string p0, "comment audio event hook target not found"

    .line 18
    .line 19
    invoke-static {v0, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    goto/16 :goto_3

    .line 23
    .line 24
    :catchall_0
    move-exception p0

    .line 25
    goto/16 :goto_4

    .line 26
    .line 27
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    new-instance v1, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    array-length v2, p1

    .line 40
    const/4 v3, 0x0

    .line 41
    move v4, v3

    .line 42
    :goto_0
    const/4 v5, 0x1

    .line 43
    if-ge v4, v2, :cond_2

    .line 44
    .line 45
    aget-object v6, p1, v4

    .line 46
    .line 47
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    if-eqz v7, :cond_1

    .line 56
    .line 57
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    if-nez v7, :cond_1

    .line 66
    .line 67
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isNative(I)Z

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    if-nez v7, :cond_1

    .line 76
    .line 77
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    sget-object v8, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 82
    .line 83
    invoke-static {v7, v8}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    if-eqz v7, :cond_1

    .line 88
    .line 89
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    array-length v7, v7

    .line 94
    if-ne v7, v5, :cond_1

    .line 95
    .line 96
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    aget-object v5, v5, v3

    .line 101
    .line 102
    const-class v7, Ljava/lang/Object;

    .line 103
    .line 104
    invoke-static {v5, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    if-eqz v5, :cond_1

    .line 109
    .line 110
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-eqz v2, :cond_3

    .line 125
    .line 126
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    check-cast v2, Ljava/lang/reflect/Method;

    .line 131
    .line 132
    invoke-virtual {v2, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 133
    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    if-eqz p1, :cond_4

    .line 141
    .line 142
    const-string p0, "comment audio event hook method not found"

    .line 143
    .line 144
    invoke-static {v0, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    if-eqz v1, :cond_5

    .line 157
    .line 158
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    check-cast v1, Ljava/lang/reflect/Method;

    .line 163
    .line 164
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    new-instance v2, Lia2;

    .line 168
    .line 169
    const/4 v3, 0x2

    .line 170
    invoke-direct {v2, p0, v3}, Lia2;-><init>(Lib2;I)V

    .line 171
    .line 172
    .line 173
    invoke-static {v1, v2}, Lib2;->μ(Ljava/lang/reflect/Method;Lp70;)V

    .line 174
    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_5
    :goto_3
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 178
    .line 179
    goto :goto_5

    .line 180
    :goto_4
    new-instance p1, Leo1;

    .line 181
    .line 182
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 183
    .line 184
    .line 185
    move-object p0, p1

    .line 186
    :goto_5
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    if-eqz p0, :cond_6

    .line 191
    .line 192
    const-string p1, "install comment audio event hook failed"

    .line 193
    .line 194
    invoke-static {v0, p1, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 195
    .line 196
    .line 197
    :cond_6
    return-void
.end method

.method public final ξ(Ljava/lang/ClassLoader;)V
    .locals 5

    .line 1
    const-string v0, "rb360b99c73f2f647"

    .line 2
    .line 3
    :try_start_0
    invoke-static {p0, p1}, Lib2;->Δ(Lib2;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    sget-object p0, Lib2;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    const-string p0, "legacy comment voice replace hook target not found, runtime hook active"

    .line 22
    .line 23
    invoke-static {v0, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    goto :goto_1

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    goto :goto_2

    .line 29
    :cond_0
    const-string p0, "comment voice replace hook target not found"

    .line 30
    .line 31
    invoke-static {v0, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Ljava/lang/reflect/Method;

    .line 50
    .line 51
    new-instance v3, Lia2;

    .line 52
    .line 53
    const/4 v4, 0x6

    .line 54
    invoke-direct {v3, p0, v4}, Lia2;-><init>(Lib2;I)V

    .line 55
    .line 56
    .line 57
    invoke-static {v2, v3}, Lib2;->μ(Ljava/lang/reflect/Method;Lp70;)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    invoke-virtual {p0, p1}, Lib2;->ν(Ljava/lang/ClassLoader;)V

    .line 62
    .line 63
    .line 64
    :goto_1
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :goto_2
    new-instance p1, Leo1;

    .line 68
    .line 69
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 70
    .line 71
    .line 72
    move-object p0, p1

    .line 73
    :goto_3
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    if-eqz p0, :cond_3

    .line 78
    .line 79
    const-string p1, "install comment voice replace hook failed"

    .line 80
    .line 81
    invoke-static {v0, p1, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    :cond_3
    return-void
.end method

.method public final ο(Ljava/lang/ClassLoader;)V
    .locals 4

    .line 1
    const-string v0, "rb360b99c73f2f647"

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0, p1}, Lib2;->Ε(Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const-string p0, "IM voice replace hook target not found, allowDexKitScan=false"

    .line 14
    .line 15
    invoke-static {v0, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    goto :goto_1

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    goto :goto_2

    .line 21
    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Ljava/lang/reflect/Method;

    .line 36
    .line 37
    new-instance v2, Lia2;

    .line 38
    .line 39
    const/4 v3, 0x5

    .line 40
    invoke-direct {v2, p0, v3}, Lia2;-><init>(Lib2;I)V

    .line 41
    .line 42
    .line 43
    invoke-static {v1, v2}, Lib2;->μ(Ljava/lang/reflect/Method;Lp70;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    :goto_1
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    goto :goto_3

    .line 50
    :goto_2
    new-instance p1, Leo1;

    .line 51
    .line 52
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    move-object p0, p1

    .line 56
    :goto_3
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    if-eqz p0, :cond_2

    .line 61
    .line 62
    const-string p1, "install IM voice replace hook failed"

    .line 63
    .line 64
    invoke-static {v0, p1, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    return-void
.end method

.method public final π(Ljava/lang/ClassLoader;)V
    .locals 11

    .line 1
    const-string v0, "rb360b99c73f2f647"

    .line 2
    .line 3
    sget-object v1, Lib2;->ε:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 8
    .line 9
    .line 10
    move-result v4

    .line 11
    if-nez v4, :cond_0

    .line 12
    .line 13
    goto/16 :goto_8

    .line 14
    .line 15
    :cond_0
    :try_start_0
    sget-object v4, Lqe0;->α:Ljava/lang/Object;

    .line 16
    .line 17
    const-string v4, "~78B71E7541C477E838C50BCD302E054C40CC02248AA0B9F3FD7794A78143886D1800F82A71492D2EFEBF50F69EC092027CD8E9B672D52762657C36503D2A32ECDF4324524659B85D"

    .line 18
    .line 19
    invoke-static {v4}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-static {p1, v4}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 30
    .line 31
    .line 32
    const-string p0, "IM voice runtime hook target not found"

    .line 33
    .line 34
    invoke-static {v0, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    goto/16 :goto_5

    .line 38
    .line 39
    :catchall_0
    move-exception p0

    .line 40
    goto/16 :goto_6

    .line 41
    .line 42
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    array-length v5, v4

    .line 50
    move v6, v2

    .line 51
    :goto_0
    if-ge v6, v5, :cond_2

    .line 52
    .line 53
    aget-object v7, v4, v6

    .line 54
    .line 55
    invoke-virtual {v7, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 56
    .line 57
    .line 58
    add-int/lit8 v6, v6, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    array-length v5, v4

    .line 62
    move v6, v2

    .line 63
    :goto_1
    if-ge v6, v5, :cond_3

    .line 64
    .line 65
    aget-object v7, v4, v6

    .line 66
    .line 67
    sget-object v8, Lxq0;->α:Lxq0;

    .line 68
    .line 69
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    new-instance v9, Ldb2;

    .line 73
    .line 74
    const/4 v10, 0x5

    .line 75
    invoke-direct {v9, p0, v10}, Ldb2;-><init>(Lib2;I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v8, v7, v9}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 79
    .line 80
    .line 81
    add-int/lit8 v6, v6, 0x1

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    new-instance v4, Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 94
    .line 95
    .line 96
    array-length v5, p1

    .line 97
    move v6, v2

    .line 98
    :goto_2
    if-ge v6, v5, :cond_5

    .line 99
    .line 100
    aget-object v7, p1, v6

    .line 101
    .line 102
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 103
    .line 104
    .line 105
    move-result v8

    .line 106
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 107
    .line 108
    .line 109
    move-result v8

    .line 110
    if-nez v8, :cond_4

    .line 111
    .line 112
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 113
    .line 114
    .line 115
    move-result v8

    .line 116
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 117
    .line 118
    .line 119
    move-result v8

    .line 120
    if-nez v8, :cond_4

    .line 121
    .line 122
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 123
    .line 124
    .line 125
    move-result v8

    .line 126
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isNative(I)Z

    .line 127
    .line 128
    .line 129
    move-result v8

    .line 130
    if-nez v8, :cond_4

    .line 131
    .line 132
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    sget-object v9, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 137
    .line 138
    invoke-static {v8, v9}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v8

    .line 142
    if-eqz v8, :cond_4

    .line 143
    .line 144
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    move-result-object v8

    .line 148
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    array-length v8, v8

    .line 152
    if-nez v8, :cond_4

    .line 153
    .line 154
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    :cond_4
    add-int/lit8 v6, v6, 0x1

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_5
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 165
    .line 166
    .line 167
    move-result v5

    .line 168
    if-eqz v5, :cond_6

    .line 169
    .line 170
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v5

    .line 174
    check-cast v5, Ljava/lang/reflect/Method;

    .line 175
    .line 176
    invoke-virtual {v5, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 177
    .line 178
    .line 179
    goto :goto_3

    .line 180
    :cond_6
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    if-eqz v3, :cond_7

    .line 189
    .line 190
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    check-cast v3, Ljava/lang/reflect/Method;

    .line 195
    .line 196
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    new-instance v4, Lia2;

    .line 200
    .line 201
    const/4 v5, 0x4

    .line 202
    invoke-direct {v4, p0, v5}, Lia2;-><init>(Lib2;I)V

    .line 203
    .line 204
    .line 205
    invoke-static {v3, v4}, Lib2;->μ(Ljava/lang/reflect/Method;Lp70;)V

    .line 206
    .line 207
    .line 208
    goto :goto_4

    .line 209
    :cond_7
    :goto_5
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 210
    .line 211
    goto :goto_7

    .line 212
    :goto_6
    new-instance p1, Leo1;

    .line 213
    .line 214
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 215
    .line 216
    .line 217
    move-object p0, p1

    .line 218
    :goto_7
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    if-eqz p0, :cond_8

    .line 223
    .line 224
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 225
    .line 226
    .line 227
    const-string p1, "install IM voice runtime hook failed"

    .line 228
    .line 229
    invoke-static {v0, p1, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 230
    .line 231
    .line 232
    :cond_8
    :goto_8
    return-void
.end method

.method public final ρ(Ljava/lang/ClassLoader;)V
    .locals 9

    .line 1
    const-string v0, "rb360b99c73f2f647"

    .line 2
    .line 3
    :try_start_0
    sget-object v1, Lqe0;->α:Ljava/lang/Object;

    .line 4
    .line 5
    const-string v1, "~79285FCA4BF93B20DAE3F7561F6F9778B9C5EA825069EB9A10CF99B6A4267A188660BEE55E6E09F04B2E52048729E5"

    .line 6
    .line 7
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {p1, v1}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    const-string p0, "voice runnable hook target not found"

    .line 18
    .line 19
    invoke-static {v0, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    goto/16 :goto_3

    .line 23
    .line 24
    :catchall_0
    move-exception p0

    .line 25
    goto/16 :goto_4

    .line 26
    .line 27
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    new-instance v1, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    array-length v2, p1

    .line 40
    const/4 v3, 0x0

    .line 41
    move v4, v3

    .line 42
    :goto_0
    const/4 v5, 0x1

    .line 43
    if-ge v4, v2, :cond_2

    .line 44
    .line 45
    aget-object v6, p1, v4

    .line 46
    .line 47
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    if-eqz v7, :cond_1

    .line 56
    .line 57
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    if-nez v7, :cond_1

    .line 66
    .line 67
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isNative(I)Z

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    if-nez v7, :cond_1

    .line 76
    .line 77
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    sget-object v8, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 82
    .line 83
    invoke-static {v7, v8}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    if-eqz v7, :cond_1

    .line 88
    .line 89
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    array-length v7, v7

    .line 94
    if-ne v7, v5, :cond_1

    .line 95
    .line 96
    const-class v5, Ljava/lang/Runnable;

    .line 97
    .line 98
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    aget-object v7, v7, v3

    .line 103
    .line 104
    invoke-virtual {v5, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    if-eqz v5, :cond_1

    .line 109
    .line 110
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-eqz v2, :cond_3

    .line 125
    .line 126
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    check-cast v2, Ljava/lang/reflect/Method;

    .line 131
    .line 132
    invoke-virtual {v2, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 133
    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    if-eqz p1, :cond_4

    .line 141
    .line 142
    const-string p0, "voice runnable hook method not found"

    .line 143
    .line 144
    invoke-static {v0, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_4
    sget-object p1, Lib2;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 149
    .line 150
    invoke-virtual {p1, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    if-eqz v1, :cond_5

    .line 162
    .line 163
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    check-cast v1, Ljava/lang/reflect/Method;

    .line 168
    .line 169
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    new-instance v2, Lia2;

    .line 173
    .line 174
    const/4 v3, 0x3

    .line 175
    invoke-direct {v2, p0, v3}, Lia2;-><init>(Lib2;I)V

    .line 176
    .line 177
    .line 178
    invoke-static {v1, v2}, Lib2;->μ(Ljava/lang/reflect/Method;Lp70;)V

    .line 179
    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_5
    :goto_3
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 183
    .line 184
    goto :goto_5

    .line 185
    :goto_4
    new-instance p1, Leo1;

    .line 186
    .line 187
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 188
    .line 189
    .line 190
    move-object p0, p1

    .line 191
    :goto_5
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    if-eqz p0, :cond_6

    .line 196
    .line 197
    const-string p1, "install voice runnable hook failed"

    .line 198
    .line 199
    invoke-static {v0, p1, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 200
    .line 201
    .line 202
    :cond_6
    return-void
.end method
