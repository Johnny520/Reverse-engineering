.class final Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# static fields
.field private static activePlayer:Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;


# instance fields
.field private final audioFocusRequest:Landroid/media/AudioFocusRequest;

.field private final audioManager:Landroid/media/AudioManager;

.field private button:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/widget/TextView;",
            ">;"
        }
    .end annotation
.end field

.field private player:Landroid/media/MediaPlayer;

.field private playing:Z

.field private final settings:Lcom/mr/elaris/InAppSettings;


# direct methods
.method public constructor <init>(Lcom/mr/elaris/InAppSettings;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->button:Ljava/lang/ref/WeakReference;

    .line 11
    .line 12
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->settings:Lcom/mr/elaris/InAppSettings;

    .line 13
    .line 14
    iget-object p1, p1, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 15
    .line 16
    const-string v0, "audio"

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    instance-of v0, p1, Landroid/media/AudioManager;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    move-object v1, p1

    .line 27
    check-cast v1, Landroid/media/AudioManager;

    .line 28
    .line 29
    :cond_0
    iput-object v1, p0, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->audioManager:Landroid/media/AudioManager;

    .line 30
    .line 31
    invoke-static {}, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->audioAttributes()Landroid/media/AudioAttributes;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    new-instance v0, Landroid/media/AudioFocusRequest$Builder;

    .line 36
    .line 37
    const/4 v1, 0x3

    .line 38
    invoke-direct {v0, v1}, Landroid/media/AudioFocusRequest$Builder;-><init>(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p1}, Landroid/media/AudioFocusRequest$Builder;->setAudioAttributes(Landroid/media/AudioAttributes;)Landroid/media/AudioFocusRequest$Builder;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    new-instance v0, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer$1;

    .line 46
    .line 47
    invoke-direct {v0, p0}, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer$1;-><init>(Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, v0}, Landroid/media/AudioFocusRequest$Builder;->setOnAudioFocusChangeListener(Landroid/media/AudioManager$OnAudioFocusChangeListener;)Landroid/media/AudioFocusRequest$Builder;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p1}, Landroid/media/AudioFocusRequest$Builder;->build()Landroid/media/AudioFocusRequest;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->audioFocusRequest:Landroid/media/AudioFocusRequest;

    .line 59
    .line 60
    return-void
.end method

.method private abandonAudioFocus()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->audioManager:Landroid/media/AudioManager;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    :try_start_0
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->audioFocusRequest:Landroid/media/AudioFocusRequest;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Landroid/media/AudioManager;->abandonAudioFocusRequest(Landroid/media/AudioFocusRequest;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    :catchall_0
    :goto_0
    return-void
.end method

.method private static audioAttributes()Landroid/media/AudioAttributes;
    .locals 2

    .line 1
    new-instance v0, Landroid/media/AudioAttributes$Builder;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/media/AudioAttributes$Builder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x2

    .line 12
    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0
.end method

.method private createPlayer()Landroid/media/MediaPlayer;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->settings:Lcom/mr/elaris/InAppSettings;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 4
    .line 5
    const-string v1, "com.mr.elaris"

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/high16 v1, 0x7f030000

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->openRawResourceFd(I)Landroid/content/res/AssetFileDescriptor;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    new-instance v2, Landroid/media/MediaPlayer;

    .line 25
    .line 26
    invoke-direct {v2}, Landroid/media/MediaPlayer;-><init>()V

    .line 27
    .line 28
    .line 29
    :try_start_0
    invoke-static {}, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->audioAttributes()Landroid/media/AudioAttributes;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v2, v0}, Landroid/media/MediaPlayer;->setAudioAttributes(Landroid/media/AudioAttributes;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v1}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J

    .line 41
    .line 42
    .line 43
    move-result-wide v4

    .line 44
    invoke-virtual {v1}, Landroid/content/res/AssetFileDescriptor;->getLength()J

    .line 45
    .line 46
    .line 47
    move-result-wide v6

    .line 48
    invoke-virtual/range {v2 .. v7}, Landroid/media/MediaPlayer;->setDataSource(Ljava/io/FileDescriptor;JJ)V

    .line 49
    .line 50
    .line 51
    new-instance v0, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer$2;

    .line 52
    .line 53
    invoke-direct {v0, p0}, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer$2;-><init>(Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2, v0}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 57
    .line 58
    .line 59
    new-instance v0, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer$3;

    .line 60
    .line 61
    invoke-direct {v0, p0}, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer$3;-><init>(Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2, v0}, Landroid/media/MediaPlayer;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2}, Landroid/media/MediaPlayer;->prepare()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, Landroid/content/res/AssetFileDescriptor;->close()V

    .line 71
    .line 72
    .line 73
    return-object v2

    .line 74
    :catchall_0
    move-exception v0

    .line 75
    move-object p0, v0

    .line 76
    :try_start_1
    invoke-virtual {v2}, Landroid/media/MediaPlayer;->release()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 77
    .line 78
    .line 79
    :catchall_1
    :try_start_2
    instance-of v0, p0, Ljava/lang/Exception;

    .line 80
    .line 81
    if-eqz v0, :cond_0

    .line 82
    .line 83
    check-cast p0, Ljava/lang/Exception;

    .line 84
    .line 85
    throw p0

    .line 86
    :catchall_2
    move-exception v0

    .line 87
    move-object p0, v0

    .line 88
    goto :goto_0

    .line 89
    :cond_0
    new-instance v0, Ljava/lang/Exception;

    .line 90
    .line 91
    const-string v2, "motto MP3 player creation failed"

    .line 92
    .line 93
    invoke-direct {v0, v2, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 97
    :goto_0
    invoke-virtual {v1}, Landroid/content/res/AssetFileDescriptor;->close()V

    .line 98
    .line 99
    .line 100
    throw p0

    .line 101
    :cond_1
    const-string p0, "motto MP3 resource unavailable"

    .line 102
    .line 103
    invoke-static {p0}, Lu2;->b(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    const/4 p0, 0x0

    .line 107
    return-object p0
.end method

.method private renderButton()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->button:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/widget/TextView;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    sget-object v1, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->activePlayer:Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    iget-boolean v1, v1, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->playing:Z

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    move v1, v2

    .line 24
    :goto_0
    const/4 v3, 0x0

    .line 25
    :try_start_0
    iget-object v4, p0, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->settings:Lcom/mr/elaris/InAppSettings;

    .line 26
    .line 27
    iget-object v4, v4, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 28
    .line 29
    const-string v5, "com.mr.elaris"

    .line 30
    .line 31
    const/4 v6, 0x2

    .line 32
    invoke-virtual {v4, v5, v6}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    const/high16 v5, 0x7f020000

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    const v5, 0x7f020001

    .line 42
    .line 43
    .line 44
    :goto_1
    invoke-virtual {v4, v5}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 45
    .line 46
    .line 47
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 48
    if-eqz v4, :cond_3

    .line 49
    .line 50
    :try_start_1
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    iget-object v5, p0, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->settings:Lcom/mr/elaris/InAppSettings;

    .line 55
    .line 56
    invoke-static {v5}, Lcom/mr/elaris/InAppSettingsSecondaryStyle;->subtitleColor(Lcom/mr/elaris/InAppSettings;)I

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    invoke-virtual {v4, v5}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 61
    .line 62
    .line 63
    iget-object v5, p0, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->settings:Lcom/mr/elaris/InAppSettings;

    .line 64
    .line 65
    const/high16 v6, 0x41500000    # 13.0f

    .line 66
    .line 67
    invoke-virtual {v5, v6}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->settings:Lcom/mr/elaris/InAppSettings;

    .line 72
    .line 73
    invoke-virtual {p0, v6}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    invoke-virtual {v4, v2, v2, v5, p0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 78
    .line 79
    .line 80
    goto :goto_3

    .line 81
    :catchall_0
    move-exception p0

    .line 82
    goto :goto_2

    .line 83
    :catchall_1
    move-exception p0

    .line 84
    move-object v4, v3

    .line 85
    :goto_2
    const-string v2, "settings"

    .line 86
    .line 87
    const-string v5, "motto-icon"

    .line 88
    .line 89
    invoke-static {v2, v5, p0}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 90
    .line 91
    .line 92
    :cond_3
    :goto_3
    invoke-virtual {v0, v4, v3, v3, v3}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 93
    .line 94
    .line 95
    if-eqz v1, :cond_4

    .line 96
    .line 97
    const-string p0, "\u505c\u6b62\u9898\u8bcd\u97f3\u9891"

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_4
    const-string p0, "\u64ad\u653e\u9898\u8bcd\u97f3\u9891"

    .line 101
    .line 102
    :goto_4
    invoke-virtual {v0, p0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, p0}, Landroid/view/View;->setTooltipText(Ljava/lang/CharSequence;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 109
    .line 110
    .line 111
    return-void
.end method

.method private requestAudioFocus()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->audioManager:Landroid/media/AudioManager;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->audioFocusRequest:Landroid/media/AudioFocusRequest;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioFocusRequest;)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-ne p0, v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0

    .line 17
    :cond_1
    :goto_0
    return v1
.end method


# virtual methods
.method public bindButton(Landroid/widget/TextView;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->button:Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    sget-object v0, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->activePlayer:Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    if-eq v0, p0, :cond_0

    .line 13
    .line 14
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 15
    .line 16
    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iput-object v1, v0, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->button:Ljava/lang/ref/WeakReference;

    .line 20
    .line 21
    :cond_0
    invoke-direct {p0}, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->renderButton()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public release()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->playing:Z

    .line 3
    .line 4
    sget-object v0, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->activePlayer:Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-ne v0, p0, :cond_0

    .line 8
    .line 9
    sput-object v1, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->activePlayer:Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->player:Landroid/media/MediaPlayer;

    .line 12
    .line 13
    iput-object v1, p0, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->player:Landroid/media/MediaPlayer;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    :try_start_0
    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v0

    .line 28
    const-string v1, "settings"

    .line 29
    .line 30
    const-string v2, "motto-mp3-release"

    .line 31
    .line 32
    invoke-static {v1, v2, v0}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    :goto_0
    invoke-direct {p0}, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->abandonAudioFocus()V

    .line 36
    .line 37
    .line 38
    invoke-direct {p0}, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->renderButton()V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public toggle()V
    .locals 3

    .line 1
    sget-object v0, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->activePlayer:Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->release()V

    .line 6
    .line 7
    .line 8
    if-eq v0, p0, :cond_0

    .line 9
    .line 10
    invoke-direct {p0}, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->renderButton()V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void

    .line 14
    :cond_1
    :try_start_0
    invoke-direct {p0}, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->requestAudioFocus()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_2

    .line 19
    .line 20
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->settings:Lcom/mr/elaris/InAppSettings;

    .line 21
    .line 22
    const-string v1, "\u6682\u65f6\u65e0\u6cd5\u83b7\u5f97\u97f3\u9891\u64ad\u653e\u6743\u9650"

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lcom/mr/elaris/InAppSettings;->toast(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception v0

    .line 29
    goto :goto_0

    .line 30
    :cond_2
    invoke-direct {p0}, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->createPlayer()Landroid/media/MediaPlayer;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->player:Landroid/media/MediaPlayer;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    .line 37
    .line 38
    .line 39
    const/4 v0, 0x1

    .line 40
    iput-boolean v0, p0, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->playing:Z

    .line 41
    .line 42
    sput-object p0, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->activePlayer:Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;

    .line 43
    .line 44
    invoke-direct {p0}, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->renderButton()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :goto_0
    const-string v1, "settings"

    .line 49
    .line 50
    const-string v2, "motto-mp3-play"

    .line 51
    .line 52
    invoke-static {v1, v2, v0}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->release()V

    .line 56
    .line 57
    .line 58
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsMottoAudioPlayer;->settings:Lcom/mr/elaris/InAppSettings;

    .line 59
    .line 60
    const-string v0, "\u9898\u8bcd\u97f3\u9891\u6682\u65f6\u65e0\u6cd5\u64ad\u653e"

    .line 61
    .line 62
    invoke-virtual {p0, v0}, Lcom/mr/elaris/InAppSettings;->toast(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method
