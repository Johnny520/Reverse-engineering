.class public final Lyyds/ᛲᲀᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᲀᛲᛳᲀ:Ljava/io/File;

.field public static volatile ᲇᲈᛵᛷ:Lyyds/ᛲᲀᛳ;


# instance fields
.field public ᛲᲈᲁ:I

.field public ᛵᛸᛸᛷ:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    const-string v1, "/proc/self/fd"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lyyds/ᛲᲀᛳ;->ᲀᛲᛳᲀ:Ljava/io/File;

    .line 9
    .line 10
    return-void
.end method

.method public static ᛲᲈᲁ()Lyyds/ᛲᲀᛳ;
    .locals 4

    .line 1
    sget-object v0, Lyyds/ᛲᲀᛳ;->ᲇᲈᛵᛷ:Lyyds/ᛲᲀᛳ;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lyyds/ᛲᲀᛳ;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lyyds/ᛲᲀᛳ;->ᲇᲈᛵᛷ:Lyyds/ᛲᲀᛳ;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lyyds/ᛲᲀᛳ;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    iput-boolean v2, v1, Lyyds/ᛲᲀᛳ;->ᛵᛸᛸᛷ:Z

    .line 19
    .line 20
    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 24
    .line 25
    .line 26
    sput-object v1, Lyyds/ᛲᲀᛳ;->ᲇᲈᛵᛷ:Lyyds/ᛲᲀᛳ;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception v1

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    :goto_0
    monitor-exit v0

    .line 32
    goto :goto_2

    .line 33
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    throw v1

    .line 35
    :cond_1
    :goto_2
    sget-object v0, Lyyds/ᛲᲀᛳ;->ᲇᲈᛵᛷ:Lyyds/ᛲᲀᛳ;

    .line 36
    .line 37
    return-object v0
.end method


# virtual methods
.method public final ᛵᛸᛸᛷ(IIZZ)Z
    .locals 7

    .line 1
    const-string v0, ", limit 20000"

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    if-nez p3, :cond_0

    .line 6
    .line 7
    const-string p0, "HardwareConfig"

    .line 8
    .line 9
    invoke-static {p0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_7

    .line 14
    .line 15
    const-string p0, "HardwareConfig"

    .line 16
    .line 17
    const-string p1, "Hardware config disallowed by caller"

    .line 18
    .line 19
    invoke-static {p0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    return v2

    .line 23
    :cond_0
    if-eqz p4, :cond_1

    .line 24
    .line 25
    const-string p0, "HardwareConfig"

    .line 26
    .line 27
    invoke-static {p0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_7

    .line 32
    .line 33
    const-string p0, "HardwareConfig"

    .line 34
    .line 35
    const-string p1, "Hardware config disallowed because exif orientation is required"

    .line 36
    .line 37
    invoke-static {p0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    return v2

    .line 41
    :cond_1
    if-ltz p1, :cond_6

    .line 42
    .line 43
    if-gez p2, :cond_2

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_2
    const-string p1, "Excluding HARDWARE bitmap config because we\'re over the file descriptor limit, file descriptors "

    .line 47
    .line 48
    monitor-enter p0

    .line 49
    :try_start_0
    iget p2, p0, Lyyds/ᛲᲀᛳ;->ᛲᲈᲁ:I

    .line 50
    .line 51
    const/4 p3, 0x1

    .line 52
    add-int/2addr p2, p3

    .line 53
    iput p2, p0, Lyyds/ᛲᲀᛳ;->ᛲᲈᲁ:I

    .line 54
    .line 55
    const/16 p4, 0x32

    .line 56
    .line 57
    if-lt p2, p4, :cond_4

    .line 58
    .line 59
    iput v2, p0, Lyyds/ᛲᲀᛳ;->ᛲᲈᲁ:I

    .line 60
    .line 61
    sget-object p2, Lyyds/ᛲᲀᛳ;->ᲀᛲᛳᲀ:Ljava/io/File;

    .line 62
    .line 63
    invoke-virtual {p2}, Ljava/io/File;->list()[Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    array-length p2, p2

    .line 68
    const-wide/16 v3, 0x4e20

    .line 69
    .line 70
    int-to-long v5, p2

    .line 71
    cmp-long p4, v5, v3

    .line 72
    .line 73
    if-gez p4, :cond_3

    .line 74
    .line 75
    move p4, p3

    .line 76
    goto :goto_0

    .line 77
    :cond_3
    move p4, v2

    .line 78
    :goto_0
    iput-boolean p4, p0, Lyyds/ᛲᲀᛳ;->ᛵᛸᛸᛷ:Z

    .line 79
    .line 80
    if-nez p4, :cond_4

    .line 81
    .line 82
    const-string p4, "Downsampler"

    .line 83
    .line 84
    const/4 v3, 0x5

    .line 85
    invoke-static {p4, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 86
    .line 87
    .line 88
    move-result p4

    .line 89
    if-eqz p4, :cond_4

    .line 90
    .line 91
    const-string p4, "Downsampler"

    .line 92
    .line 93
    new-instance v3, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    invoke-direct {v3, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-static {p4, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :catchall_0
    move-exception p1

    .line 113
    goto :goto_2

    .line 114
    :cond_4
    :goto_1
    iget-boolean p1, p0, Lyyds/ᛲᲀᛳ;->ᛵᛸᛸᛷ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 115
    .line 116
    monitor-exit p0

    .line 117
    if-nez p1, :cond_5

    .line 118
    .line 119
    const-string p0, "HardwareConfig"

    .line 120
    .line 121
    invoke-static {p0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    if-eqz p0, :cond_7

    .line 126
    .line 127
    const-string p0, "HardwareConfig"

    .line 128
    .line 129
    const-string p1, "Hardware config disallowed because there are insufficient FDs"

    .line 130
    .line 131
    invoke-static {p0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 132
    .line 133
    .line 134
    return v2

    .line 135
    :cond_5
    return p3

    .line 136
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 137
    throw p1

    .line 138
    :cond_6
    :goto_3
    const-string p0, "HardwareConfig"

    .line 139
    .line 140
    invoke-static {p0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 141
    .line 142
    .line 143
    move-result p0

    .line 144
    if-eqz p0, :cond_7

    .line 145
    .line 146
    const-string p0, "HardwareConfig"

    .line 147
    .line 148
    const-string p1, "Hardware config disallowed because of invalid dimensions"

    .line 149
    .line 150
    invoke-static {p0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 151
    .line 152
    .line 153
    :cond_7
    return v2
.end method
