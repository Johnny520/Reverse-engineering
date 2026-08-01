.class public final Ljy;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final κ:Ljava/lang/Object;

.field public static volatile λ:Ljy;


# instance fields
.field public final α:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

.field public final β:Ld7;

.field public volatile γ:I

.field public final δ:Landroid/os/Handler;

.field public final ε:Lfy;

.field public final ζ:Liy;

.field public final η:Li2;

.field public final θ:I

.field public final ι:Lcr;


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
    sput-object v0, Ljy;->κ:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lp50;)V
    .locals 5

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
    iput-object v0, p0, Ljy;->α:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 10
    .line 11
    const/4 v1, 0x3

    .line 12
    iput v1, p0, Ljy;->γ:I

    .line 13
    .line 14
    iget-object v1, p1, Lp50;->α:Liy;

    .line 15
    .line 16
    iput-object v1, p0, Ljy;->ζ:Liy;

    .line 17
    .line 18
    iget v2, p1, Lp50;->β:I

    .line 19
    .line 20
    iput v2, p0, Ljy;->θ:I

    .line 21
    .line 22
    iget-object p1, p1, Lp50;->γ:Lcr;

    .line 23
    .line 24
    iput-object p1, p0, Ljy;->ι:Lcr;

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
    iput-object p1, p0, Ljy;->δ:Landroid/os/Handler;

    .line 36
    .line 37
    new-instance p1, Ld7;

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    invoke-direct {p1, v3}, Ld7;-><init>(I)V

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, Ljy;->β:Ld7;

    .line 44
    .line 45
    new-instance p1, Li2;

    .line 46
    .line 47
    const/16 v4, 0x14

    .line 48
    .line 49
    invoke-direct {p1, v4}, Li2;-><init>(I)V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, Ljy;->η:Li2;

    .line 53
    .line 54
    new-instance p1, Lfy;

    .line 55
    .line 56
    invoke-direct {p1, p0}, Lfy;-><init>(Ljy;)V

    .line 57
    .line 58
    .line 59
    iput-object p1, p0, Ljy;->ε:Lfy;

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-interface {v4}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 66
    .line 67
    .line 68
    if-nez v2, :cond_0

    .line 69
    .line 70
    :try_start_0
    iput v3, p0, Ljy;->γ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :catchall_0
    move-exception p1

    .line 74
    iget-object p0, p0, Ljy;->α:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 75
    .line 76
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 81
    .line 82
    .line 83
    throw p1

    .line 84
    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Ljy;->β()I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-nez v0, :cond_1

    .line 96
    .line 97
    :try_start_1
    new-instance v0, Ley;

    .line 98
    .line 99
    invoke-direct {v0, p1}, Ley;-><init>(Lfy;)V

    .line 100
    .line 101
    .line 102
    invoke-interface {v1, v0}, Liy;->α(Lpd2;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :catchall_1
    move-exception p1

    .line 107
    invoke-virtual {p0, p1}, Ljy;->ε(Ljava/lang/Throwable;)V

    .line 108
    .line 109
    .line 110
    :cond_1
    return-void
.end method

.method public static α()Ljy;
    .locals 4

    .line 1
    sget-object v0, Ljy;->κ:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Ljy;->λ:Ljy;

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

.method public static γ()Z
    .locals 1

    .line 1
    sget-object v0, Ljy;->λ:Ljy;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method


# virtual methods
.method public final β()I
    .locals 1

    .line 1
    iget-object v0, p0, Ljy;->α:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

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
    iget v0, p0, Ljy;->γ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    iget-object p0, p0, Ljy;->α:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

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
    iget-object p0, p0, Ljy;->α:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

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

.method public final δ()V
    .locals 3

    .line 1
    iget v0, p0, Ljy;->θ:I

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
    invoke-virtual {p0}, Ljy;->β()I

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
    iget-object v0, p0, Ljy;->α:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

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
    iget v0, p0, Ljy;->γ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 29
    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    iget-object p0, p0, Ljy;->α:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

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
    iput v1, p0, Ljy;->γ:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 43
    .line 44
    iget-object v0, p0, Ljy;->α:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

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
    iget-object p0, p0, Ljy;->ε:Lfy;

    .line 54
    .line 55
    iget-object v0, p0, Lfy;->α:Ljy;

    .line 56
    .line 57
    :try_start_2
    new-instance v1, Ley;

    .line 58
    .line 59
    invoke-direct {v1, p0}, Ley;-><init>(Lfy;)V

    .line 60
    .line 61
    .line 62
    iget-object p0, v0, Ljy;->ζ:Liy;

    .line 63
    .line 64
    invoke-interface {p0, v1}, Liy;->α(Lpd2;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :catchall_0
    move-exception p0

    .line 69
    invoke-virtual {v0, p0}, Ljy;->ε(Ljava/lang/Throwable;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :catchall_1
    move-exception v0

    .line 74
    iget-object p0, p0, Ljy;->α:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 75
    .line 76
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 81
    .line 82
    .line 83
    throw v0

    .line 84
    :cond_3
    const-string p0, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading"

    .line 85
    .line 86
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public final ε(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Ljy;->α:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

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
    iput v1, p0, Ljy;->γ:I

    .line 17
    .line 18
    iget-object v1, p0, Ljy;->β:Ld7;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Ljy;->β:Ld7;

    .line 24
    .line 25
    invoke-virtual {v1}, Ld7;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Ljy;->α:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

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
    iget-object v1, p0, Ljy;->δ:Landroid/os/Handler;

    .line 38
    .line 39
    new-instance v2, Lhy;

    .line 40
    .line 41
    iget p0, p0, Ljy;->γ:I

    .line 42
    .line 43
    invoke-direct {v2, v0, p0, p1}, Lhy;-><init>(Ljava/util/List;ILjava/lang/Throwable;)V

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
    iget-object p0, p0, Ljy;->α:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

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

.method public final ζ(IIILjava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 11

    .line 1
    invoke-virtual {p0}, Ljy;->β()I

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
    if-eqz v0, :cond_19

    .line 13
    .line 14
    if-ltz p1, :cond_18

    .line 15
    .line 16
    if-ltz p2, :cond_17

    .line 17
    .line 18
    if-gt p1, p2, :cond_1

    .line 19
    .line 20
    move v0, v2

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move v0, v1

    .line 23
    :goto_1
    if-eqz v0, :cond_16

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    if-nez p4, :cond_2

    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_2
    invoke-interface {p4}, Ljava/lang/CharSequence;->length()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-gt p1, v3, :cond_3

    .line 34
    .line 35
    move v3, v2

    .line 36
    goto :goto_2

    .line 37
    :cond_3
    move v3, v1

    .line 38
    :goto_2
    if-eqz v3, :cond_15

    .line 39
    .line 40
    invoke-interface {p4}, Ljava/lang/CharSequence;->length()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-gt p2, v3, :cond_4

    .line 45
    .line 46
    move v3, v2

    .line 47
    goto :goto_3

    .line 48
    :cond_4
    move v3, v1

    .line 49
    :goto_3
    if-eqz v3, :cond_14

    .line 50
    .line 51
    invoke-interface {p4}, Ljava/lang/CharSequence;->length()I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_5

    .line 56
    .line 57
    if-ne p1, p2, :cond_6

    .line 58
    .line 59
    :cond_5
    move-object v5, p4

    .line 60
    goto/16 :goto_d

    .line 61
    .line 62
    :cond_6
    if-eq p3, v2, :cond_7

    .line 63
    .line 64
    move v9, v1

    .line 65
    goto :goto_4

    .line 66
    :cond_7
    move v9, v2

    .line 67
    :goto_4
    iget-object p0, p0, Ljy;->ε:Lfy;

    .line 68
    .line 69
    iget-object v4, p0, Lfy;->β:Lm6;

    .line 70
    .line 71
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    instance-of p0, p4, Lxx1;

    .line 75
    .line 76
    if-eqz p0, :cond_8

    .line 77
    .line 78
    move-object p3, p4

    .line 79
    check-cast p3, Lxx1;

    .line 80
    .line 81
    invoke-virtual {p3}, Lxx1;->α()V

    .line 82
    .line 83
    .line 84
    :cond_8
    const-class p3, Ll62;

    .line 85
    .line 86
    if-nez p0, :cond_a

    .line 87
    .line 88
    :try_start_0
    instance-of v2, p4, Landroid/text/Spannable;

    .line 89
    .line 90
    if-eqz v2, :cond_9

    .line 91
    .line 92
    goto :goto_6

    .line 93
    :cond_9
    instance-of v2, p4, Landroid/text/Spanned;

    .line 94
    .line 95
    if-eqz v2, :cond_b

    .line 96
    .line 97
    move-object v2, p4

    .line 98
    check-cast v2, Landroid/text/Spanned;

    .line 99
    .line 100
    add-int/lit8 v3, p1, -0x1

    .line 101
    .line 102
    add-int/lit8 v5, p2, 0x1

    .line 103
    .line 104
    invoke-interface {v2, v3, v5, p3}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-gt v2, p2, :cond_b

    .line 109
    .line 110
    new-instance v0, Lu62;

    .line 111
    .line 112
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 113
    .line 114
    .line 115
    iput-boolean v1, v0, Lu62;->ε:Z

    .line 116
    .line 117
    new-instance v2, Landroid/text/SpannableString;

    .line 118
    .line 119
    invoke-direct {v2, p4}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 120
    .line 121
    .line 122
    iput-object v2, v0, Lu62;->ζ:Landroid/text/Spannable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 123
    .line 124
    goto :goto_7

    .line 125
    :goto_5
    move-object v5, p4

    .line 126
    goto/16 :goto_c

    .line 127
    .line 128
    :catchall_0
    move-exception v0

    .line 129
    move-object p1, v0

    .line 130
    goto :goto_5

    .line 131
    :cond_a
    :goto_6
    :try_start_1
    new-instance v0, Lu62;

    .line 132
    .line 133
    move-object v2, p4

    .line 134
    check-cast v2, Landroid/text/Spannable;

    .line 135
    .line 136
    invoke-direct {v0, v2}, Lu62;-><init>(Landroid/text/Spannable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 137
    .line 138
    .line 139
    :cond_b
    :goto_7
    if-eqz v0, :cond_d

    .line 140
    .line 141
    :try_start_2
    iget-object v2, v0, Lu62;->ζ:Landroid/text/Spannable;

    .line 142
    .line 143
    invoke-interface {v2, p1, p2, p3}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p3

    .line 147
    check-cast p3, [Ll62;

    .line 148
    .line 149
    if-eqz p3, :cond_d

    .line 150
    .line 151
    array-length v2, p3

    .line 152
    if-lez v2, :cond_d

    .line 153
    .line 154
    array-length v2, p3

    .line 155
    :goto_8
    if-ge v1, v2, :cond_d

    .line 156
    .line 157
    aget-object v3, p3, v1

    .line 158
    .line 159
    iget-object v5, v0, Lu62;->ζ:Landroid/text/Spannable;

    .line 160
    .line 161
    invoke-interface {v5, v3}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 162
    .line 163
    .line 164
    move-result v5

    .line 165
    iget-object v6, v0, Lu62;->ζ:Landroid/text/Spannable;

    .line 166
    .line 167
    invoke-interface {v6, v3}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 168
    .line 169
    .line 170
    move-result v6

    .line 171
    if-eq v5, p2, :cond_c

    .line 172
    .line 173
    invoke-virtual {v0, v3}, Lu62;->removeSpan(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    :cond_c
    invoke-static {v5, p1}, Ljava/lang/Math;->min(II)I

    .line 177
    .line 178
    .line 179
    move-result p1

    .line 180
    invoke-static {v6, p2}, Ljava/lang/Math;->max(II)I

    .line 181
    .line 182
    .line 183
    move-result p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 184
    add-int/lit8 v1, v1, 0x1

    .line 185
    .line 186
    goto :goto_8

    .line 187
    :cond_d
    move v6, p1

    .line 188
    move v7, p2

    .line 189
    if-eq v6, v7, :cond_e

    .line 190
    .line 191
    :try_start_3
    invoke-interface {p4}, Ljava/lang/CharSequence;->length()I

    .line 192
    .line 193
    .line 194
    move-result p1

    .line 195
    if-lt v6, p1, :cond_f

    .line 196
    .line 197
    :cond_e
    move-object v5, p4

    .line 198
    goto :goto_b

    .line 199
    :cond_f
    new-instance v10, Ln5;

    .line 200
    .line 201
    iget-object p1, v4, Lm6;->ζ:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast p1, Li2;

    .line 204
    .line 205
    const/16 p2, 0xa

    .line 206
    .line 207
    const/4 p3, 0x0

    .line 208
    invoke-direct {v10, p2, v0, p1, p3}, Ln5;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 209
    .line 210
    .line 211
    const v8, 0x7fffffff

    .line 212
    .line 213
    .line 214
    move-object v5, p4

    .line 215
    :try_start_4
    invoke-virtual/range {v4 .. v10}, Lm6;->Ν(Ljava/lang/CharSequence;IIIZLty;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    check-cast p1, Lu62;

    .line 220
    .line 221
    if-eqz p1, :cond_11

    .line 222
    .line 223
    iget-object p1, p1, Lu62;->ζ:Landroid/text/Spannable;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 224
    .line 225
    if-eqz p0, :cond_10

    .line 226
    .line 227
    move-object p4, v5

    .line 228
    check-cast p4, Lxx1;

    .line 229
    .line 230
    invoke-virtual {p4}, Lxx1;->β()V

    .line 231
    .line 232
    .line 233
    :cond_10
    return-object p1

    .line 234
    :catchall_1
    move-exception v0

    .line 235
    :goto_9
    move-object p1, v0

    .line 236
    goto :goto_c

    .line 237
    :cond_11
    if-eqz p0, :cond_13

    .line 238
    .line 239
    :goto_a
    move-object p4, v5

    .line 240
    check-cast p4, Lxx1;

    .line 241
    .line 242
    invoke-virtual {p4}, Lxx1;->β()V

    .line 243
    .line 244
    .line 245
    return-object v5

    .line 246
    :catchall_2
    move-exception v0

    .line 247
    move-object v5, p4

    .line 248
    goto :goto_9

    .line 249
    :goto_b
    if-eqz p0, :cond_13

    .line 250
    .line 251
    goto :goto_a

    .line 252
    :goto_c
    if-eqz p0, :cond_12

    .line 253
    .line 254
    move-object p4, v5

    .line 255
    check-cast p4, Lxx1;

    .line 256
    .line 257
    invoke-virtual {p4}, Lxx1;->β()V

    .line 258
    .line 259
    .line 260
    :cond_12
    throw p1

    .line 261
    :cond_13
    :goto_d
    return-object v5

    .line 262
    :cond_14
    const-string p0, "end should be < than charSequence length"

    .line 263
    .line 264
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    :goto_e
    const/4 p0, 0x0

    .line 268
    return-object p0

    .line 269
    :cond_15
    const-string p0, "start should be < than charSequence length"

    .line 270
    .line 271
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    goto :goto_e

    .line 275
    :cond_16
    const-string p0, "start should be <= than end"

    .line 276
    .line 277
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    goto :goto_e

    .line 281
    :cond_17
    const-string p0, "end cannot be negative"

    .line 282
    .line 283
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    goto :goto_e

    .line 287
    :cond_18
    const-string p0, "start cannot be negative"

    .line 288
    .line 289
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    goto :goto_e

    .line 293
    :cond_19
    const-string p0, "Not initialized yet"

    .line 294
    .line 295
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    goto :goto_e
.end method

.method public final η(Lgy;)V
    .locals 4

    .line 1
    const-string v0, "initCallback cannot be null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lp91;->δ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ljy;->α:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 13
    .line 14
    .line 15
    :try_start_0
    iget v0, p0, Ljy;->γ:I

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    if-eq v0, v1, :cond_1

    .line 19
    .line 20
    iget v0, p0, Ljy;->γ:I

    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    if-ne v0, v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v0, p0, Ljy;->β:Ld7;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ld7;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    goto :goto_2

    .line 34
    :cond_1
    :goto_0
    iget-object v0, p0, Ljy;->δ:Landroid/os/Handler;

    .line 35
    .line 36
    new-instance v1, Lhy;

    .line 37
    .line 38
    iget v2, p0, Ljy;->γ:I

    .line 39
    .line 40
    filled-new-array {p1}, [Lgy;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const/4 v3, 0x0

    .line 49
    invoke-direct {v1, p1, v2, v3}, Lhy;-><init>(Ljava/util/List;ILjava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    .line 55
    :goto_1
    iget-object p0, p0, Ljy;->α:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 56
    .line 57
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :goto_2
    iget-object p0, p0, Ljy;->α:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 66
    .line 67
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 72
    .line 73
    .line 74
    throw p1
.end method
