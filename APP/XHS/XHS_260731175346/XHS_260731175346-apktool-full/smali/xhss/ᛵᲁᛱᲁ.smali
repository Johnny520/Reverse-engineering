.class public final Lxhss/ᛵᲁᛱᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᛸᛷᲈᲈ:Ljava/lang/Object;

.field public static volatile ᲈᛳᲀ:Lxhss/ᛵᲁᛱᲁ;


# instance fields
.field public final ᛱᛱᛲᲇ:Lxhss/ᛴᛲᛴᲇ;

.field public volatile ᛳᲁᲇᛸ:I

.field public final ᛷᛴᛷᛱ:Lxhss/ᛲᲈᛱᛳ;

.field public final ᛷᛵᛵᲈ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

.field public final ᛸᛲᲀᛵ:Lxhss/ᛶᛸᲀᲁ;

.field public final ᛸᛴᛶᛳ:I

.field public final ᲀᲇᛳᲁ:Lxhss/ᛳᛴᲀᲁ;

.field public final ᲇᛴᲇᛵ:Landroid/os/Handler;

.field public final ᲇᛶᛴᲀ:Lxhss/ᛳᛶᛸᛷ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lxhss/ᛵᲁᛱᲁ;->ᛸᛷᲈᲈ:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lxhss/ᛸᛶᛱᲀ;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lxhss/ᛵᲁᛱᲁ;->ᛷᛵᛵᲈ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 10
    .line 11
    const/4 v1, 0x3

    .line 12
    iput v1, p0, Lxhss/ᛵᲁᛱᲁ;->ᛳᲁᲇᛸ:I

    .line 13
    .line 14
    iget-object v1, p1, Lxhss/ᛸᛶᛱᲀ;->ᛷᛵᛵᲈ:Lxhss/ᛳᛶᛸᛷ;

    .line 15
    .line 16
    iput-object v1, p0, Lxhss/ᛵᲁᛱᲁ;->ᲇᛶᛴᲀ:Lxhss/ᛳᛶᛸᛷ;

    .line 17
    .line 18
    iget v2, p1, Lxhss/ᛸᛶᛱᲀ;->ᛱᛱᛲᲇ:I

    .line 19
    .line 20
    iput v2, p0, Lxhss/ᛵᲁᛱᲁ;->ᛸᛴᛶᛳ:I

    .line 21
    .line 22
    iget-object p1, p1, Lxhss/ᛸᛶᛱᲀ;->ᛳᲁᲇᛸ:Lxhss/ᛶᛸᲀᲁ;

    .line 23
    .line 24
    iput-object p1, p0, Lxhss/ᛵᲁᛱᲁ;->ᛸᛲᲀᛵ:Lxhss/ᛶᛸᲀᲁ;

    .line 25
    .line 26
    new-instance p1, Landroid/os/Handler;

    .line 27
    .line 28
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-direct {p1, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lxhss/ᛵᲁᛱᲁ;->ᲇᛴᲇᛵ:Landroid/os/Handler;

    .line 36
    .line 37
    new-instance p1, Lxhss/ᛴᛲᛴᲇ;

    .line 38
    .line 39
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 40
    .line 41
    .line 42
    sget-object v3, Lxhss/ᛵᛵᛲᲈ;->ᛷᛵᛵᲈ:[I

    .line 43
    .line 44
    iput-object v3, p1, Lxhss/ᛴᛲᛴᲇ;->ᛱᛱᛲᲇ:[I

    .line 45
    .line 46
    sget-object v3, Lxhss/ᛵᛵᛲᲈ;->ᛱᛱᛲᲇ:[Ljava/lang/Object;

    .line 47
    .line 48
    iput-object v3, p1, Lxhss/ᛴᛲᛴᲇ;->ᛳᲁᲇᛸ:[Ljava/lang/Object;

    .line 49
    .line 50
    iput-object p1, p0, Lxhss/ᛵᲁᛱᲁ;->ᛱᛱᛲᲇ:Lxhss/ᛴᛲᛴᲇ;

    .line 51
    .line 52
    new-instance p1, Lxhss/ᛳᛴᲀᲁ;

    .line 53
    .line 54
    const/16 v3, 0x17

    .line 55
    .line 56
    invoke-direct {p1, v3}, Lxhss/ᛳᛴᲀᲁ;-><init>(I)V

    .line 57
    .line 58
    .line 59
    iput-object p1, p0, Lxhss/ᛵᲁᛱᲁ;->ᲀᲇᛳᲁ:Lxhss/ᛳᛴᲀᲁ;

    .line 60
    .line 61
    new-instance p1, Lxhss/ᛲᲈᛱᛳ;

    .line 62
    .line 63
    invoke-direct {p1, p0}, Lxhss/ᛲᲈᛱᛳ;-><init>(Lxhss/ᛵᲁᛱᲁ;)V

    .line 64
    .line 65
    .line 66
    iput-object p1, p0, Lxhss/ᛵᲁᛱᲁ;->ᛷᛴᛷᛱ:Lxhss/ᛲᲈᛱᛳ;

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-interface {v3}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 73
    .line 74
    .line 75
    if-nez v2, :cond_0

    .line 76
    .line 77
    const/4 v2, 0x0

    .line 78
    :try_start_0
    iput v2, p0, Lxhss/ᛵᲁᛱᲁ;->ᛳᲁᲇᛸ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :catchall_0
    move-exception p1

    .line 82
    iget-object p0, p0, Lxhss/ᛵᲁᛱᲁ;->ᛷᛵᛵᲈ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 83
    .line 84
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 89
    .line 90
    .line 91
    throw p1

    .line 92
    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Lxhss/ᛵᲁᛱᲁ;->ᛱᛱᛲᲇ()I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-nez v0, :cond_1

    .line 104
    .line 105
    :try_start_1
    new-instance v0, Lxhss/ᛴᛲᲀᛶ;

    .line 106
    .line 107
    invoke-direct {v0, p1}, Lxhss/ᛴᛲᲀᛶ;-><init>(Lxhss/ᛲᲈᛱᛳ;)V

    .line 108
    .line 109
    .line 110
    invoke-interface {v1, v0}, Lxhss/ᛳᛶᛸᛷ;->ᛸᛴᛶᛳ(Lxhss/ᛱᛱᛷᛸ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :catchall_1
    move-exception p1

    .line 115
    invoke-virtual {p0, p1}, Lxhss/ᛵᲁᛱᲁ;->ᲇᛴᲇᛵ(Ljava/lang/Throwable;)V

    .line 116
    .line 117
    .line 118
    :cond_1
    return-void
.end method

.method public static ᛷᛵᛵᲈ()Lxhss/ᛵᲁᛱᲁ;
    .locals 4

    .line 1
    sget-object v0, Lxhss/ᛵᲁᛱᲁ;->ᛸᛷᲈᲈ:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lxhss/ᛵᲁᛱᲁ;->ᲈᛳᲀ:Lxhss/ᛵᲁᛱᲁ;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v2, 0x0

    .line 11
    :goto_0
    const-string v3, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK\'s manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message."

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    monitor-exit v0

    .line 16
    return-object v1

    .line 17
    :catchall_0
    move-exception v1

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    invoke-direct {v1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw v1

    .line 25
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    throw v1
.end method


# virtual methods
.method public final ᛱᛱᛲᲇ()I
    .locals 1

    .line 1
    iget-object v0, p0, Lxhss/ᛵᲁᛱᲁ;->ᛷᛵᛵᲈ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 8
    .line 9
    .line 10
    :try_start_0
    iget v0, p0, Lxhss/ᛵᲁᛱᲁ;->ᛳᲁᲇᛸ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    iget-object p0, p0, Lxhss/ᛵᲁᛱᲁ;->ᛷᛵᛵᲈ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 19
    .line 20
    .line 21
    return v0

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    iget-object p0, p0, Lxhss/ᛵᲁᛱᲁ;->ᛷᛵᛵᲈ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 30
    .line 31
    .line 32
    throw v0
.end method

.method public final ᛳᲁᲇᛸ()V
    .locals 3

    .line 1
    iget v0, p0, Lxhss/ᛵᲁᛱᲁ;->ᛸᛴᛶᛳ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ne v0, v2, :cond_0

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
    if-eqz v0, :cond_3

    .line 11
    .line 12
    invoke-virtual {p0}, Lxhss/ᛵᲁᛱᲁ;->ᛱᛱᛲᲇ()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-ne v0, v2, :cond_1

    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    iget-object v0, p0, Lxhss/ᛵᲁᛱᲁ;->ᛷᛵᛵᲈ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 26
    .line 27
    .line 28
    :try_start_0
    iget v0, p0, Lxhss/ᛵᲁᛱᲁ;->ᛳᲁᲇᛸ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 29
    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    iget-object p0, p0, Lxhss/ᛵᲁᛱᲁ;->ᛷᛵᛵᲈ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    :try_start_1
    iput v1, p0, Lxhss/ᛵᲁᛱᲁ;->ᛳᲁᲇᛸ:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 43
    .line 44
    iget-object v0, p0, Lxhss/ᛵᲁᛱᲁ;->ᛷᛵᛵᲈ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 51
    .line 52
    .line 53
    iget-object p0, p0, Lxhss/ᛵᲁᛱᲁ;->ᛷᛴᛷᛱ:Lxhss/ᛲᲈᛱᛳ;

    .line 54
    .line 55
    iget-object v0, p0, Lxhss/ᛲᲈᛱᛳ;->ᛷᛵᛵᲈ:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, Lxhss/ᛵᲁᛱᲁ;

    .line 58
    .line 59
    :try_start_2
    new-instance v1, Lxhss/ᛴᛲᲀᛶ;

    .line 60
    .line 61
    invoke-direct {v1, p0}, Lxhss/ᛴᛲᲀᛶ;-><init>(Lxhss/ᛲᲈᛱᛳ;)V

    .line 62
    .line 63
    .line 64
    iget-object p0, v0, Lxhss/ᛵᲁᛱᲁ;->ᲇᛶᛴᲀ:Lxhss/ᛳᛶᛸᛷ;

    .line 65
    .line 66
    invoke-interface {p0, v1}, Lxhss/ᛳᛶᛸᛷ;->ᛸᛴᛶᛳ(Lxhss/ᛱᛱᛷᛸ;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :catchall_0
    move-exception p0

    .line 71
    invoke-virtual {v0, p0}, Lxhss/ᛵᲁᛱᲁ;->ᲇᛴᲇᛵ(Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :catchall_1
    move-exception v0

    .line 76
    iget-object p0, p0, Lxhss/ᛵᲁᛱᲁ;->ᛷᛵᛵᲈ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 77
    .line 78
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 83
    .line 84
    .line 85
    throw v0

    .line 86
    :cond_3
    const-string p0, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading"

    .line 87
    .line 88
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public final ᛷᛴᛷᛱ(Ljava/lang/CharSequence;II)Ljava/lang/CharSequence;
    .locals 11

    .line 1
    invoke-virtual {p0}, Lxhss/ᛵᲁᛱᲁ;->ᛱᛱᛲᲇ()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-ne v0, v2, :cond_0

    .line 8
    .line 9
    move v0, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    const/4 v3, 0x0

    .line 13
    if-eqz v0, :cond_18

    .line 14
    .line 15
    if-ltz p2, :cond_17

    .line 16
    .line 17
    if-ltz p3, :cond_16

    .line 18
    .line 19
    if-gt p2, p3, :cond_1

    .line 20
    .line 21
    move v0, v2

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move v0, v1

    .line 24
    :goto_1
    if-eqz v0, :cond_15

    .line 25
    .line 26
    if-nez p1, :cond_2

    .line 27
    .line 28
    return-object v3

    .line 29
    :cond_2
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-gt p2, v0, :cond_3

    .line 34
    .line 35
    move v0, v2

    .line 36
    goto :goto_2

    .line 37
    :cond_3
    move v0, v1

    .line 38
    :goto_2
    if-eqz v0, :cond_14

    .line 39
    .line 40
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-gt p3, v0, :cond_4

    .line 45
    .line 46
    goto :goto_3

    .line 47
    :cond_4
    move v2, v1

    .line 48
    :goto_3
    if-eqz v2, :cond_13

    .line 49
    .line 50
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_5

    .line 55
    .line 56
    if-ne p2, p3, :cond_6

    .line 57
    .line 58
    :cond_5
    move-object v5, p1

    .line 59
    goto/16 :goto_c

    .line 60
    .line 61
    :cond_6
    iget-object p0, p0, Lxhss/ᛵᲁᛱᲁ;->ᛷᛴᛷᛱ:Lxhss/ᛲᲈᛱᛳ;

    .line 62
    .line 63
    iget-object p0, p0, Lxhss/ᛲᲈᛱᛳ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 64
    .line 65
    move-object v4, p0

    .line 66
    check-cast v4, Lxhss/ᛷᛱᛳᲁ;

    .line 67
    .line 68
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    instance-of p0, p1, Lxhss/ᛳᛸᛷᛸ;

    .line 72
    .line 73
    if-eqz p0, :cond_7

    .line 74
    .line 75
    move-object v0, p1

    .line 76
    check-cast v0, Lxhss/ᛳᛸᛷᛸ;

    .line 77
    .line 78
    invoke-virtual {v0}, Lxhss/ᛳᛸᛷᛸ;->ᛷᛵᛵᲈ()V

    .line 79
    .line 80
    .line 81
    :cond_7
    const-class v0, Lxhss/ᛴᛸᛵᛵ;

    .line 82
    .line 83
    if-nez p0, :cond_9

    .line 84
    .line 85
    :try_start_0
    instance-of v2, p1, Landroid/text/Spannable;

    .line 86
    .line 87
    if-eqz v2, :cond_8

    .line 88
    .line 89
    goto :goto_5

    .line 90
    :cond_8
    instance-of v2, p1, Landroid/text/Spanned;

    .line 91
    .line 92
    if-eqz v2, :cond_a

    .line 93
    .line 94
    move-object v2, p1

    .line 95
    check-cast v2, Landroid/text/Spanned;

    .line 96
    .line 97
    add-int/lit8 v5, p2, -0x1

    .line 98
    .line 99
    add-int/lit8 v6, p3, 0x1

    .line 100
    .line 101
    invoke-interface {v2, v5, v6, v0}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    if-gt v2, p3, :cond_a

    .line 106
    .line 107
    new-instance v3, Lxhss/ᛴᲈᛱᛲ;

    .line 108
    .line 109
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 110
    .line 111
    .line 112
    iput-boolean v1, v3, Lxhss/ᛴᲈᛱᛲ;->ᛱᛱᛲᲇ:Z

    .line 113
    .line 114
    new-instance v2, Landroid/text/SpannableString;

    .line 115
    .line 116
    invoke-direct {v2, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 117
    .line 118
    .line 119
    iput-object v2, v3, Lxhss/ᛴᲈᛱᛲ;->ᛳᲁᲇᛸ:Landroid/text/Spannable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 120
    .line 121
    goto :goto_6

    .line 122
    :goto_4
    move-object v5, p1

    .line 123
    goto/16 :goto_b

    .line 124
    .line 125
    :catchall_0
    move-exception v0

    .line 126
    move-object p2, v0

    .line 127
    goto :goto_4

    .line 128
    :cond_9
    :goto_5
    :try_start_1
    new-instance v3, Lxhss/ᛴᲈᛱᛲ;

    .line 129
    .line 130
    move-object v2, p1

    .line 131
    check-cast v2, Landroid/text/Spannable;

    .line 132
    .line 133
    invoke-direct {v3, v2}, Lxhss/ᛴᲈᛱᛲ;-><init>(Landroid/text/Spannable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 134
    .line 135
    .line 136
    :cond_a
    :goto_6
    if-eqz v3, :cond_c

    .line 137
    .line 138
    :try_start_2
    iget-object v2, v3, Lxhss/ᛴᲈᛱᛲ;->ᛳᲁᲇᛸ:Landroid/text/Spannable;

    .line 139
    .line 140
    invoke-interface {v2, p2, p3, v0}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    check-cast v0, [Lxhss/ᛴᛸᛵᛵ;

    .line 145
    .line 146
    if-eqz v0, :cond_c

    .line 147
    .line 148
    array-length v2, v0

    .line 149
    if-lez v2, :cond_c

    .line 150
    .line 151
    array-length v2, v0

    .line 152
    :goto_7
    if-ge v1, v2, :cond_c

    .line 153
    .line 154
    aget-object v5, v0, v1

    .line 155
    .line 156
    iget-object v6, v3, Lxhss/ᛴᲈᛱᛲ;->ᛳᲁᲇᛸ:Landroid/text/Spannable;

    .line 157
    .line 158
    invoke-interface {v6, v5}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 159
    .line 160
    .line 161
    move-result v6

    .line 162
    iget-object v7, v3, Lxhss/ᛴᲈᛱᛲ;->ᛳᲁᲇᛸ:Landroid/text/Spannable;

    .line 163
    .line 164
    invoke-interface {v7, v5}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 165
    .line 166
    .line 167
    move-result v7

    .line 168
    if-eq v6, p3, :cond_b

    .line 169
    .line 170
    invoke-virtual {v3, v5}, Lxhss/ᛴᲈᛱᛲ;->removeSpan(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    :cond_b
    invoke-static {v6, p2}, Ljava/lang/Math;->min(II)I

    .line 174
    .line 175
    .line 176
    move-result p2

    .line 177
    invoke-static {v7, p3}, Ljava/lang/Math;->max(II)I

    .line 178
    .line 179
    .line 180
    move-result p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 181
    add-int/lit8 v1, v1, 0x1

    .line 182
    .line 183
    goto :goto_7

    .line 184
    :cond_c
    move v6, p2

    .line 185
    move v7, p3

    .line 186
    if-eq v6, v7, :cond_d

    .line 187
    .line 188
    :try_start_3
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 189
    .line 190
    .line 191
    move-result p2

    .line 192
    if-lt v6, p2, :cond_e

    .line 193
    .line 194
    :cond_d
    move-object v5, p1

    .line 195
    goto :goto_a

    .line 196
    :cond_e
    new-instance v10, Lxhss/ᛳᛱᛲᲀ;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 197
    .line 198
    :try_start_4
    iget-object p2, v4, Lxhss/ᛷᛱᛳᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast p2, Lxhss/ᛳᛴᲀᲁ;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 201
    .line 202
    const/4 p3, 0x7

    .line 203
    :try_start_5
    invoke-direct {v10, p3, v3, p2}, Lxhss/ᛳᛱᛲᲀ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 204
    .line 205
    .line 206
    const/4 v9, 0x0

    .line 207
    const v8, 0x7fffffff

    .line 208
    .line 209
    .line 210
    move-object v5, p1

    .line 211
    :try_start_6
    invoke-virtual/range {v4 .. v10}, Lxhss/ᛷᛱᛳᲁ;->ᛸᛶᛴᲈ(Ljava/lang/CharSequence;IIIZLxhss/ᲈᛶᛶᛲ;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    check-cast p1, Lxhss/ᛴᲈᛱᛲ;

    .line 216
    .line 217
    if-eqz p1, :cond_10

    .line 218
    .line 219
    iget-object p1, p1, Lxhss/ᛴᲈᛱᛲ;->ᛳᲁᲇᛸ:Landroid/text/Spannable;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 220
    .line 221
    if-eqz p0, :cond_f

    .line 222
    .line 223
    move-object p0, v5

    .line 224
    check-cast p0, Lxhss/ᛳᛸᛷᛸ;

    .line 225
    .line 226
    invoke-virtual {p0}, Lxhss/ᛳᛸᛷᛸ;->ᛱᛱᛲᲇ()V

    .line 227
    .line 228
    .line 229
    :cond_f
    return-object p1

    .line 230
    :catchall_1
    move-exception v0

    .line 231
    :goto_8
    move-object p2, v0

    .line 232
    goto :goto_b

    .line 233
    :cond_10
    if-eqz p0, :cond_12

    .line 234
    .line 235
    :goto_9
    move-object p1, v5

    .line 236
    check-cast p1, Lxhss/ᛳᛸᛷᛸ;

    .line 237
    .line 238
    invoke-virtual {p1}, Lxhss/ᛳᛸᛷᛸ;->ᛱᛱᛲᲇ()V

    .line 239
    .line 240
    .line 241
    return-object v5

    .line 242
    :catchall_2
    move-exception v0

    .line 243
    move-object v5, p1

    .line 244
    goto :goto_8

    .line 245
    :catchall_3
    move-exception v0

    .line 246
    move-object v5, p1

    .line 247
    move-object p1, v0

    .line 248
    move-object p2, p1

    .line 249
    goto :goto_b

    .line 250
    :goto_a
    if-eqz p0, :cond_12

    .line 251
    .line 252
    goto :goto_9

    .line 253
    :goto_b
    if-eqz p0, :cond_11

    .line 254
    .line 255
    move-object p1, v5

    .line 256
    check-cast p1, Lxhss/ᛳᛸᛷᛸ;

    .line 257
    .line 258
    invoke-virtual {p1}, Lxhss/ᛳᛸᛷᛸ;->ᛱᛱᛲᲇ()V

    .line 259
    .line 260
    .line 261
    :cond_11
    throw p2

    .line 262
    :cond_12
    :goto_c
    return-object v5

    .line 263
    :cond_13
    const-string p0, "end should be < than charSequence length"

    .line 264
    .line 265
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    return-object v3

    .line 269
    :cond_14
    const-string p0, "start should be < than charSequence length"

    .line 270
    .line 271
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    return-object v3

    .line 275
    :cond_15
    const-string p0, "start should be <= than end"

    .line 276
    .line 277
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    return-object v3

    .line 281
    :cond_16
    const-string p0, "end cannot be negative"

    .line 282
    .line 283
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    return-object v3

    .line 287
    :cond_17
    const-string p0, "start cannot be negative"

    .line 288
    .line 289
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    return-object v3

    .line 293
    :cond_18
    const-string p0, "Not initialized yet"

    .line 294
    .line 295
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    return-object v3
.end method

.method public final ᲇᛴᲇᛵ(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lxhss/ᛵᲁᛱᲁ;->ᛷᛵᛵᲈ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x2

    .line 16
    :try_start_0
    iput v1, p0, Lxhss/ᛵᲁᛱᲁ;->ᛳᲁᲇᛸ:I

    .line 17
    .line 18
    iget-object v1, p0, Lxhss/ᛵᲁᛱᲁ;->ᛱᛱᛲᲇ:Lxhss/ᛴᛲᛴᲇ;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lxhss/ᛵᲁᛱᲁ;->ᛱᛱᛲᲇ:Lxhss/ᛴᛲᛴᲇ;

    .line 24
    .line 25
    invoke-virtual {v1}, Lxhss/ᛴᛲᛴᲇ;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lxhss/ᛵᲁᛱᲁ;->ᛷᛵᛵᲈ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Lxhss/ᛵᲁᛱᲁ;->ᲇᛴᲇᛵ:Landroid/os/Handler;

    .line 38
    .line 39
    new-instance v2, Lxhss/ᛵᛶᛲᛳ;

    .line 40
    .line 41
    iget p0, p0, Lxhss/ᛵᲁᛱᲁ;->ᛳᲁᲇᛸ:I

    .line 42
    .line 43
    invoke-direct {v2, v0, p0, p1}, Lxhss/ᛵᛶᛲᛳ;-><init>(Ljava/util/List;ILjava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    iget-object p0, p0, Lxhss/ᛵᲁᛱᲁ;->ᛷᛵᛵᲈ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 52
    .line 53
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 58
    .line 59
    .line 60
    throw p1
.end method

.method public final ᲇᛶᛴᲀ(Lxhss/ᛳᛱᛲᲈ;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lxhss/ᛵᲁᛱᲁ;->ᛷᛵᛵᲈ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 8
    .line 9
    .line 10
    :try_start_0
    iget v0, p0, Lxhss/ᛵᲁᛱᲁ;->ᛳᲁᲇᛸ:I

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    iget v0, p0, Lxhss/ᛵᲁᛱᲁ;->ᛳᲁᲇᛸ:I

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    if-ne v0, v1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object v0, p0, Lxhss/ᛵᲁᛱᲁ;->ᛱᛱᛲᲇ:Lxhss/ᛴᛲᛴᲇ;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lxhss/ᛴᛲᛴᲇ;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    goto :goto_1

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    goto :goto_2

    .line 29
    :cond_1
    :goto_0
    iget-object v0, p0, Lxhss/ᛵᲁᛱᲁ;->ᲇᛴᲇᛵ:Landroid/os/Handler;

    .line 30
    .line 31
    new-instance v1, Lxhss/ᛵᛶᛲᛳ;

    .line 32
    .line 33
    iget v2, p0, Lxhss/ᛵᲁᛱᲁ;->ᛳᲁᲇᛸ:I

    .line 34
    .line 35
    filled-new-array {p1}, [Lxhss/ᛳᛱᛲᲈ;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const/4 v3, 0x0

    .line 44
    invoke-direct {v1, p1, v2, v3}, Lxhss/ᛵᛶᛲᛳ;-><init>(Ljava/util/List;ILjava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    :goto_1
    iget-object p0, p0, Lxhss/ᛵᲁᛱᲁ;->ᛷᛵᛵᲈ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :goto_2
    iget-object p0, p0, Lxhss/ᛵᲁᛱᲁ;->ᛷᛵᛵᲈ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 67
    .line 68
    .line 69
    throw p1
.end method
