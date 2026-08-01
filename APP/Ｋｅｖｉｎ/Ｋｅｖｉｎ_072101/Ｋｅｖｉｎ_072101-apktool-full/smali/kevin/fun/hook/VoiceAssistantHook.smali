.class public Lkevin/fun/hook/VoiceAssistantHook;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkevin/fun/hook/VoiceAssistantHook$AudioAdapter;,
        Lkevin/fun/hook/VoiceAssistantHook$AudioItem;,
        Lkevin/fun/hook/VoiceAssistantHook$HttpApi;
    }
.end annotation


# static fields
.field private static final DY_AUDIO_DIR:Ljava/lang/String;

.field private static final DY_IM_AUDIO_DIR:Ljava/lang/String;

.field private static final KEY_AUDIO_DIR_URI:Ljava/lang/String;

.field private static final KEY_TTS_KEY:Ljava/lang/String;

.field private static final PREFS_NAME:Ljava/lang/String;

.field private static final REQ_PICK_AUDIO_DIR:I = 0x2537

.field private static final TAG:Ljava/lang/String;

.field private static final TTS_API_URL:Ljava/lang/String;

.field private static audioListViewRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/widget/ListView;",
            ">;"
        }
    .end annotation
.end field

.field private static cachedAudioItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lkevin/fun/hook/VoiceAssistantHook$AudioItem;",
            ">;"
        }
    .end annotation
.end field

.field private static currentActivityRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private static currentTtsAudioPath:Ljava/lang/String;

.field private static currentTtsAudioUrl:Ljava/lang/String;

.field private static currentTtsCost:I

.field private static currentTtsDuration:J

.field private static currentTtsRemaining:I

.field private static dialogRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/app/Dialog;",
            ">;"
        }
    .end annotation
.end field

.field private static executorService:Ljava/util/concurrent/ExecutorService;

.field private static generatedAudioUrl:Ljava/lang/String;

.field private static isInitialized:Z

.field private static lastScanTime:J

.field private static mainHandler:Landroid/os/Handler;

.field private static mediaPlayer:Landroid/media/MediaPlayer;

.field private static onReplaceCompleteCallback:Ljava/lang/Runnable;

.field private static final playerLock:Ljava/lang/Object;

.field private static replaceBtnRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/widget/Button;",
            ">;"
        }
    .end annotation
.end field

.field private static selectedAudio:Landroid/net/Uri;

.field private static selectedVoiceId:Ljava/lang/String;

.field private static final short:[S

.field private static statusTextRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/widget/TextView;",
            ">;"
        }
    .end annotation
.end field

.field private static tabLocalRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/widget/TextView;",
            ">;"
        }
    .end annotation
.end field

.field private static tabTtsRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/widget/TextView;",
            ">;"
        }
    .end annotation
.end field

.field private static targetReplaceDir:Ljava/lang/String;

.field private static ttsApiKey:Ljava/lang/String;

.field private static ttsBreakClone:Z

.field private static ttsFlash:Z

.field private static ttsProbabilityOptimization:I

.field private static ttsRandomness:I

.field private static ttsSeed:I

.field private static ttsSharpen:Z

.field private static ttsSpinnerRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/widget/Spinner;",
            ">;"
        }
    .end annotation
.end field

.field private static ttsSrt:Z

.field private static ttsStabilityBoost:I

.field private static ttsStatusTextRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/widget/TextView;",
            ">;"
        }
    .end annotation
.end field

.field private static ttsStream:Z

.field private static voiceList:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 8

    const-wide/16 v6, 0x0

    const/4 v5, 0x0

    const/4 v4, 0x0

    const/16 v0, 0x7d4

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/VoiceAssistantHook;->short:[S

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    sget v1, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    xor-int/lit16 v1, v1, 0x3b8

    const/16 v2, 0x46c

    invoke-static {v0, v4, v1, v2}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢ۟ۥۨ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/VoiceAssistantHook;->DY_AUDIO_DIR:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v1, 0x3a

    sget v2, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣۡۢ۟:I

    xor-int/lit16 v2, v2, 0x30d

    const/16 v3, 0x8a9

    invoke-static {v0, v1, v2, v3}, Landroidx/customview/ۤۡۥ;->۟ۢۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/VoiceAssistantHook;->DY_IM_AUDIO_DIR:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v1, 0x69

    sget v2, Landroidx/activity/ۦۧۥۥ;->۟ۦۢۧۤ:I

    xor-int/lit8 v2, v2, -0x3a

    const/16 v3, 0x1ac

    invoke-static {v0, v1, v2, v3}, Landroidx/activity/ۣۦۡۥ;->۟ۡۨ۟۟([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/VoiceAssistantHook;->KEY_AUDIO_DIR_URI:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v1, 0x76

    sget v2, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    xor-int/lit8 v2, v2, 0x79

    const/16 v3, 0x1e6

    invoke-static {v0, v1, v2, v3}, Lorg/luckypray/dexkit/۠۠ۥ;->۟ۥۧۦ۠([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/VoiceAssistantHook;->KEY_TTS_KEY:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v1, 0x81

    sget v2, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    xor-int/lit16 v2, v2, -0x108

    const/16 v3, 0x15b

    invoke-static {v0, v1, v2, v3}, Landroidx/loader/ۣۦ۟ۡ;->ۣ۟ۤ۟ۦ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/VoiceAssistantHook;->PREFS_NAME:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v1, 0x90

    sget v2, Landroidx/customview/ۡۤۡۤ;->۟ۦ۟ۨۨ:I

    xor-int/lit16 v2, v2, 0xf5

    const/16 v3, 0x6cb

    invoke-static {v0, v1, v2, v3}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦۣ۠ۤ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/VoiceAssistantHook;->TAG:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v1, 0x96

    sget v2, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۤۦۤۧ:I

    xor-int/lit16 v2, v2, 0x149

    const/16 v3, 0x92a

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۥۡۤۧ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/VoiceAssistantHook;->TTS_API_URL:Ljava/lang/String;

    sput-object v5, Lkevin/fun/hook/VoiceAssistantHook;->currentTtsAudioUrl:Ljava/lang/String;

    sput v4, Lkevin/fun/hook/VoiceAssistantHook;->currentTtsCost:I

    sput v4, Lkevin/fun/hook/VoiceAssistantHook;->currentTtsRemaining:I

    sput-wide v6, Lkevin/fun/hook/VoiceAssistantHook;->currentTtsDuration:J

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lkevin/fun/hook/VoiceAssistantHook;->cachedAudioItems:Ljava/util/List;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lkevin/fun/hook/VoiceAssistantHook;->playerLock:Ljava/lang/Object;

    sput-boolean v4, Lkevin/fun/hook/VoiceAssistantHook;->isInitialized:Z

    sput-wide v6, Lkevin/fun/hook/VoiceAssistantHook;->lastScanTime:J

    sget v0, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    xor-int/lit8 v0, v0, -0x78

    invoke-static {v0}, Landroidx/interpolator/۟ۧۦ۟ۨ;->۟۟ۥۥۧ(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/VoiceAssistantHook;->executorService:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۧۤۡۨ()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lkevin/fun/hook/VoiceAssistantHook;->mainHandler:Landroid/os/Handler;

    sput-object v5, Lkevin/fun/hook/VoiceAssistantHook;->onReplaceCompleteCallback:Ljava/lang/Runnable;

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v1, 0xac

    sget v2, Landroidx/activity/ۣۦۡۥ;->ۣۢۤۡ:I

    xor-int/lit8 v2, v2, 0x38

    const/16 v3, 0xb03

    invoke-static {v0, v1, v2, v3}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣۣ۟ۤۤ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/VoiceAssistantHook;->targetReplaceDir:Ljava/lang/String;

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/VoiceAssistantHook;->ttsApiKey:Ljava/lang/String;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v1, Lkevin/fun/hook/VoiceAssistantHook;->voiceList:Ljava/util/Map;

    sput-object v0, Lkevin/fun/hook/VoiceAssistantHook;->selectedVoiceId:Ljava/lang/String;

    const/16 v0, 0x62

    sput v0, Lkevin/fun/hook/VoiceAssistantHook;->ttsRandomness:I

    const/16 v0, 0x100

    sput v0, Lkevin/fun/hook/VoiceAssistantHook;->ttsStabilityBoost:I

    const/16 v0, 0x5d

    sput v0, Lkevin/fun/hook/VoiceAssistantHook;->ttsProbabilityOptimization:I

    const/4 v0, 0x1

    sput-boolean v0, Lkevin/fun/hook/VoiceAssistantHook;->ttsBreakClone:Z

    sput-boolean v4, Lkevin/fun/hook/VoiceAssistantHook;->ttsSharpen:Z

    sput-boolean v4, Lkevin/fun/hook/VoiceAssistantHook;->ttsFlash:Z

    sput-boolean v4, Lkevin/fun/hook/VoiceAssistantHook;->ttsStream:Z

    sput-boolean v4, Lkevin/fun/hook/VoiceAssistantHook;->ttsSrt:Z

    const/4 v0, -0x1

    sput v0, Lkevin/fun/hook/VoiceAssistantHook;->ttsSeed:I

    return-void

    :array_0
    .array-data 2
        0x443s
        0x408s
        0x40ds
        0x418s
        0x40ds
        0x443s
        0x419s
        0x41fs
        0x409s
        0x41es
        0x443s
        0x45cs
        0x443s
        0x40fs
        0x403s
        0x401s
        0x442s
        0x41fs
        0x41fs
        0x442s
        0x40ds
        0x402s
        0x408s
        0x41es
        0x403s
        0x405s
        0x408s
        0x442s
        0x419s
        0x40bs
        0x40fs
        0x442s
        0x40ds
        0x41bs
        0x409s
        0x401s
        0x409s
        0x443s
        0x40as
        0x405s
        0x400s
        0x409s
        0x41fs
        0x443s
        0x40fs
        0x403s
        0x401s
        0x401s
        0x409s
        0x402s
        0x418s
        0x443s
        0x40ds
        0x419s
        0x408s
        0x405s
        0x403s
        0x443s
        0x886s
        0x8cds
        0x8c8s
        0x8dds
        0x8c8s
        0x886s
        0x8dcs
        0x8das
        0x8ccs
        0x8dbs
        0x886s
        0x899s
        0x886s
        0x8cas
        0x8c6s
        0x8c4s
        0x887s
        0x8das
        0x8das
        0x887s
        0x8c8s
        0x8c7s
        0x8cds
        0x8dbs
        0x8c6s
        0x8c0s
        0x8cds
        0x887s
        0x8dcs
        0x8ces
        0x8cas
        0x887s
        0x8c8s
        0x8des
        0x8ccs
        0x8c4s
        0x8ccs
        0x886s
        0x8cfs
        0x8c0s
        0x8c5s
        0x8ccs
        0x8das
        0x886s
        0x8c0s
        0x8c4s
        0x886s
        0x1cds
        0x1d9s
        0x1c8s
        0x1c5s
        0x1c3s
        0x1f3s
        0x1c8s
        0x1c5s
        0x1des
        0x1f3s
        0x1d9s
        0x1des
        0x1c5s
        0x192s
        0x192s
        0x195s
        0x1b9s
        0x187s
        0x196s
        0x18fs
        0x1b9s
        0x18ds
        0x183s
        0x19fs
        0x12ds
        0x134s
        0x132s
        0x138s
        0x13es
        0x104s
        0x13as
        0x128s
        0x128s
        0x132s
        0x128s
        0x12fs
        0x13as
        0x135s
        0x12fs
        0x36dbs
        -0x72das
        -0x6ec8s
        0x5462s
        0x6480s
        0x36das
        0x942s
        0x95es
        0x95es
        0x95as
        0x959s
        0x910s
        0x905s
        0x905s
        0x95cs
        0x91bs
        0x904s
        0x95cs
        0x945s
        0x949s
        0x95fs
        0x904s
        0x959s
        0x95es
        0x95fs
        0x94es
        0x943s
        0x945s
        0xb2cs
        0xb67s
        0xb62s
        0xb77s
        0xb62s
        0xb2cs
        0xb76s
        0xb70s
        0xb66s
        0xb71s
        0xb2cs
        0xb33s
        0xb2cs
        0xb60s
        0xb6cs
        0xb6es
        0xb2ds
        0xb70s
        0xb70s
        0xb2ds
        0xb62s
        0xb6ds
        0xb67s
        0xb71s
        0xb6cs
        0xb6as
        0xb67s
        0xb2ds
        0xb76s
        0xb64s
        0xb60s
        0xb2ds
        0xb62s
        0xb74s
        0xb66s
        0xb6es
        0xb66s
        0xb2cs
        0xb65s
        0xb6as
        0xb6fs
        0xb66s
        0xb70s
        0xb2cs
        0xb60s
        0xb6cs
        0xb6es
        0xb6es
        0xb66s
        0xb6ds
        0xb77s
        0xb2cs
        0xb62s
        0xb76s
        0xb67s
        0xb6as
        0xb6cs
        0xb2cs
        0x3503s
        -0x7102s
        -0x6d20s
        0x57bas
        0x6758s
        0x3502s
        0x533s
        0x225fs
        0x533s
        0x5708s
        0x5be9s
        0x5eeas
        -0x7132s
        0x6d55s
        0x5c22s
        -0x77cas
        0x529s
        0x533s
        0x5793s
        0x5b72s
        0x5e71s
        -0x71abs
        0x6dces
        0x5cb9s
        -0x7753s
        -0x64das
        0x69c6s
        0x6c03s
        0x5c1fs
        -0x6324s
        -0x6c42s
        0x6ea8s
        0x45d9s
        -0xbcbs
        0x549as
        0x631ds
        0x61f7s
        0x646as
        0x5538s
        0x659es
        -0x6f05s
        -0x2e98s
        -0x2a6cs
        -0x6c06s
        -0x6368s
        0x5f51s
        0x6137s
        -0x761as
        0x5b8ds
        -0x4eds
        0x6588s
        -0x6d55s
        0x604bs
        0x744cs
        0x5df7s
        -0x6c0cs
        0x6114s
        0x7513s
        0x5ca8s
        0x616as
        0x5176s
        -0x6e4bs
        -0x6129s
        0x6d9fs
        0x534fs
        -0x788cs
        -0x7c0bs
        -0x6015s
        -0x7d56s
        -0x614cs
        0x5bees
        0x6b0cs
        0x27d4s
        -0xbes
        0x2d14s
        -0x721fs
        -0x74f4s
        0x6702s
        0x72e4s
        0x61e7s
        0x5f37s
        -0x486s
        -0x7ef0s
        -0x7a8cs
        0x5b82s
        -0x7c9as
        -0x7a75s
        0x6985s
        0x44dds
        -0x7ef6s
        -0x62ecs
        0x7c63s
        0x6f60s
        0x51b0s
        0xac9s
        0xac9s
        0xac9s
        -0x658cs
        0x6894s
        -0x6272s
        -0x77f1s
        -0xa99s
        0x9c9s
        0x9c9s
        0x9ces
        0x9e2s
        0x9cbs
        0x9d2s
        0x9d4s
        0x9des
        0x9d8s
        0x9e2s
        0x9ces
        0x9cds
        0x9d4s
        0x9d3s
        0x9d3s
        0x9d8s
        0x9cfs
        0x5319s
        -0x713cs
        -0x69b6s
        -0x7c35s
        0x53aes
        -0x762fs
        0x4f94s
        0x197s
        0x197s
        0x197s
        -0x7207s
        0x61f7s
        -0x77c9s
        0x57ces
        0x6cd6s
        0x694bs
        -0x7dc3s
        0x5882s
        -0x663ds
        0x6b23s
        -0x61c7s
        -0x6ea5s
        0x6c4ds
        0x473cs
        -0x62efs
        -0x6d8ds
        0x6f65s
        0x4414s
        0x44efs
        0x51bas
        0x5dcas
        -0xa12s
        -0x7eebs
        -0x64d1s
        0x6f52s
        -0x7a72s
        0x6980s
        0x760s
        0x779s
        0x77fs
        0x775s
        0x773s
        0x749s
        0x777s
        0x765s
        0x765s
        0x77fs
        0x765s
        0x762s
        0x777s
        0x778s
        0x762s
        0xb3bs
        0xb2fs
        0xb3es
        0xb33s
        0xb35s
        0xb05s
        0xb3es
        0xb33s
        0xb28s
        0xb05s
        0xb2fs
        0xb28s
        0xb33s
        0x33e7s
        -0x77e6s
        -0x6bfcs
        0x515es
        0x61bcs
        0x33e6s
        0x3d7s
        0x24bbs
        0x3d7s
        0x51eas
        0x5a3cs
        0x50e1s
        0x5ac6s
        -0x712es
        0x3cds
        0x3d7s
        0x8d5s
        0x8das
        0x8d0s
        0x8c6s
        0x8dbs
        0x8dds
        0x8d0s
        0x89as
        0x8dds
        0x8das
        0x8c0s
        0x8d1s
        0x8das
        0x8c0s
        0x89as
        0x8d5s
        0x8d7s
        0x8c0s
        0x8dds
        0x8dbs
        0x8das
        0x89as
        0x8e2s
        0x8fds
        0x8f1s
        0x8e3s
        0x9eds
        0x9f1s
        0x9f1s
        0x9f5s
        0x9f6s
        0x9bfs
        0x9aas
        0x9aas
        0x9f3s
        0x9eas
        0x9e6s
        0x9f0s
        0x9abs
        0x9e4s
        0x9ecs
        0x5c9ds
        0x6283s
        0x674cs
        0x4b12s
        0x5a1fs
        -0x7118s
        0x4a60s
        0x7037s
        0x6db0s
        0x5e4fs
        0x537s
        0x549s
        0x54fs
        0x551s
        0x536s
        -0x7160s
        -0x6f0fs
        0xb9fs
        0xbb1s
        0xbads
        0x5626s
        0x4409s
        0x508cs
        -0xb28s
        -0x7fdds
        -0x65e7s
        0x5ffbs
        0x5540s
        0x7efcs
        0x7ecbs
        0x6e9cs
        -0x7f64s
        -0x7b08s
        0x5a0es
        -0x7d16s
        -0x7bf9s
        0x6809s
        0x7defs
        0x6eecs
        0x503cs
        -0x7ca5s
        0x59e4s
        0x5f84s
        -0x661fs
        0x77c2s
        0x4681s
        0x576fs
        -0x7cees
        0x77c2s
        0x8eds
        0x8fcs
        0x8e5s
        0x88cs
        0x8e7s
        0x8c9s
        0x8d5s
        -0x7587s
        0x50c6s
        -0x6e79s
        0x6367s
        -0x6983s
        -0x7c04s
        -0x789as
        0x5dd9s
        -0x7cb6s
        -0x7b23s
        0x6916s
        0x57c6s
        -0x7c03s
        0x6ff3s
        -0x7cb4s
        0x59f3s
        -0x78a0s
        -0x7f09s
        0x6d3cs
        0x53ecs
        -0x7829s
        0x6bd9s
        0x82es
        0x81as
        0x81bs
        0x807s
        0x800s
        0x81ds
        0x806s
        0x815s
        0x80es
        0x81bs
        0x806s
        0x800s
        0x801s
        0x999s
        0x9bes
        0x9bas
        0x9a9s
        0x9bes
        0x9a9s
        0x9fbs
        0xce0s
        0xcc6s
        0xcd0s
        0xcc7s
        0xc98s
        0xcf4s
        0xcd2s
        0xcd0s
        0xcdbs
        0xcc1s
        0x33es
        0x30fs
        0x316s
        0x319s
        0x310s
        0x307s
        0x350s
        0x34es
        0x351s
        0x34fs
        0x351s
        0x34fs
        0x35fs
        0x357s
        0x317s
        0x30bs
        0x30bs
        0x30fs
        0x30cs
        0x345s
        0x350s
        0x350s
        0x31es
        0x30fs
        0x316s
        0x319s
        0x310s
        0x307s
        0x351s
        0x31cs
        0x310s
        0x312s
        0x356s
        0x545s
        0x569s
        0x568s
        0x572s
        0x563s
        0x568s
        0x572s
        0x52bs
        0x552s
        0x57fs
        0x576s
        0x563s
        0x18fs
        0x19es
        0x19es
        0x182s
        0x187s
        0x18ds
        0x18fs
        0x19as
        0x187s
        0x181s
        0x180s
        0x1c1s
        0x184s
        0x19ds
        0x181s
        0x180s
        0x27bs
        0x262s
        0x264s
        0x26es
        0x268s
        0x244s
        0x269s
        0x72fs
        0x73es
        0x723s
        0x72fs
        0x10es
        0x102s
        0x103s
        0x119s
        0x108s
        0x103s
        0x119s
        0x11es
        0xa3as
        0xa29s
        0xa26s
        0xa2cs
        0xa27s
        0xa25s
        0xa26s
        0xa2ds
        0xa3bs
        0xa3bs
        0x618s
        0x61fs
        0x60as
        0x609s
        0x602s
        0x607s
        0x602s
        0x61fs
        0x612s
        0x634s
        0x609s
        0x604s
        0x604s
        0x618s
        0x61fs
        0x125s
        0x127s
        0x13as
        0x137s
        0x134s
        0x137s
        0x13cs
        0x139s
        0x13cs
        0x121s
        0x12cs
        0x10as
        0x13as
        0x125s
        0x121s
        0x13cs
        0x138s
        0x13cs
        0x12fs
        0x134s
        0x121s
        0x13cs
        0x13as
        0x13bs
        0x226s
        0x232s
        0x221s
        0x22ds
        0x225s
        0x233s
        0x214s
        0x22fs
        0x20bs
        0x225s
        0x225s
        0x230s
        0xb58s
        0xb48s
        0xb5fs
        0xb5bs
        0xb51s
        0xb65s
        0xb59s
        0xb56s
        0xb55s
        0xb54s
        0xb5fs
        0xa05s
        0xa0fs
        0xa02s
        0xa10s
        0xa0bs
        0x7e3s
        0x7f8s
        0x7f1s
        0x7e2s
        0x7e0s
        0x7f5s
        0x7fes
        0x605s
        0x602s
        0x604s
        0x613s
        0x617s
        0x61bs
        0x1f2s
        0x1f3s
        0x1f5s
        0x938s
        0x92es
        0x92es
        0x92fs
        0xa36s
        0xa2as
        0xa2as
        0xa2es
        0xa2ds
        0xa64s
        0xa71s
        0xa71s
        0xa28s
        0xa6fs
        0xa70s
        0xa28s
        0xa31s
        0xa3ds
        0xa2bs
        0xa70s
        0xa2ds
        0xa2as
        0xa2bs
        0xa3as
        0xa37s
        0xa31s
        0xa71s
        0xa3fs
        0xa2es
        0xa37s
        0xa71s
        0xa2as
        0xa2as
        0xa2ds
        0xa71s
        0xa39s
        0xa3bs
        0xa30s
        0xa3bs
        0xa2cs
        0xa3fs
        0xa2as
        0xa3bs
        0x8eds
        0x8d6s
        0x8d9s
        0x8cds
        0x8ccs
        0x8d0s
        0x8d7s
        0x8cas
        0x8d1s
        0x8c2s
        0x8dds
        0x8dcs
        0x804s
        0x803s
        0x816s
        0x803s
        0x802s
        0x804s
        0x6bbs
        0x6bes
        0x6abs
        0x6bes
        0xccfs
        0xcc2s
        0x34fs
        0x347s
        0x351s
        0x351s
        0x343s
        0x345s
        0x347s
        0x98fs
        0x9a8s
        0x9b5s
        0x9b3s
        0x9a0s
        0x9a0s
        0x9afs
        0x9a5s
        0x9afs
        0x9a3s
        0x9a8s
        0x9b2s
        0x9e6s
        0x985s
        0x9b4s
        0x9a3s
        0x9a2s
        0x9afs
        0x9b2s
        0x334es
        -0x774ds
        -0x6b53s
        0x51f7s
        0x6115s
        0x334fs
        0x37es
        0x30as
        0x30as
        0x30ds
        -0x73ces
        0x603cs
        0x5c5cs
        0x5d66s
        0x364s
        0x37es
        -0x75das
        0x6628s
        0x5c7bs
        -0x7791s
        -0x5b0s
        0x501s
        0x52fs
        0x533s
        0x60aas
        0x6002s
        0xae8s
        0xac6s
        0xadas
        0x6f43s
        0x6febs
        -0xa51s
        -0x7eacs
        0x6263s
        0x6d46s
        -0x6412s
        0x75cds
        0x7a5es
        0x6f97s
        0x44eas
        -0x78acs
        -0xa15s
        -0x7ef0s
        0x5ba2s
        0x5adbs
        0x630cs
        0x56a0s
        0x5b03s
        0x5a39s
        -0x4e5s
        0xad8s
        0xad0s
        0xac6s
        0xac6s
        0xad4s
        0xad2s
        0xad0s
        0x6bbfs
        0x7b70s
        -0x6674s
        -0x7886s
        -0x7398s
        0x6066s
        0x5a35s
        -0x71dfs
        -0x3e2s
        -0x76a2s
        0x6550s
        0x5930s
        0x580as
        -0x6d8s
        -0x75aes
        0x665cs
        -0x7745s
        0x60c8s
        -0x5ces
        -0x7137s
        -0x6b0ds
        -0x7115s
        0x276s
        0x235s
        0x26cs
        0x239s
        0xce4s
        0xce4s
        0xce3s
        0xccfs
        0x84as
        0x84as
        0x84ds
        0x861s
        0x84as
        0x85bs
        0x853s
        0x84es
        0x861s
        0xca8s
        0xcebs
        0xcf6s
        0xcb5s
        0x34b1s
        -0x70b4s
        -0x6caes
        0x5608s
        0x66eas
        0x34b0s
        0x481s
        -0x7433s
        0x67c3s
        0x5d90s
        -0x767cs
        -0x453s
        0x4bdes
        0x7189s
        0x4ecs
        0x4f1s
        0x492s
        0x6198s
        0x50afs
        0x7ba1s
        0x49bs
        0x481s
        0x38a7s
        -0x7ca6s
        -0x60bcs
        0x5a1es
        0x6afcs
        0x38a6s
        0x897s
        0x46bcs
        -0x7836s
        -0x60bcs
        -0x6fdas
        0x5186s
        -0x7a6es
        0x88ds
        0x897s
        0x2160s
        0x645s
        -0x76f7s
        0x6507s
        0x5de9s
        0x6475s
        0x66fs
        -0x798es
        0x6393s
        0x65fs
        0x645s
        0x640s
        0x601s
        0x7fb7s
        0x645s
        0x619s
        0x645s
        0x6beds
        -0x798es
        0x65fs
        0x645s
        0x640s
        0x601s
        0x76dcs
        0x645s
        0x619s
        0x645s
        0x540cs
        0x493cs
        0x65fs
        0x645s
        0x640s
        0x601s
        0x76dcs
        0x4689s
        -0x7801s
        -0x608fs
        -0x6feds
        0x51b3s
        -0x7a59s
        0x8b8s
        0x8a2s
        0x601es
        0x618ds
        0x5d82s
        -0x766as
        -0x457s
        0x583es
        0x54dfs
        -0x622as
        -0x6d4cs
        0x7ccbs
        0x5570s
        0x5314s
        -0x7900s
        0x64b5s
        0x61e1s
        0x51afs
        0x5ccas
        -0x6b94s
        -0x36ds
        -0x7798s
        0x52d7s
        0x54b7s
        0x6109s
        -0x6b94s
        0x5ccas
        0x51a9s
        0x4d9fs
        0x64fes
        -0x778es
        -0x6b94s
        0x3234s
        -0x7637s
        -0x6a29s
        0x508ds
        0x606fs
        0x3235s
        0x204s
        0x270s
        0x270s
        0x277s
        0x64dbs
        0x6146s
        0x5b15s
        -0x70ffs
        0x21es
        0x204s
        0x6c10s
        0x698ds
        0x53des
        -0x7836s
        0xad5s
        0xacfs
        0xbb8s
        0xba1s
        0xba7s
        0xbads
        0xbabs
        0x559s
        0x551s
        0x540s
        0x555s
        0x550s
        0x555s
        0x540s
        0x555s
        0x657s
        0x644s
        0x653s
        0x652s
        0x648s
        0x64es
        0x64fs
        0x634s
        0x600s
        0x601s
        0x61ds
        0x61as
        0x607s
        0x61cs
        0x60fs
        0x614s
        0x601s
        0x61cs
        0x61as
        0x61bs
        0x6b0s
        0x697s
        0x693s
        0x680s
        0x697s
        0x680s
        0x6d2s
        0xa2fs
        0xa09s
        0xa1fs
        0xa08s
        0xa57s
        0xa3bs
        0xa1ds
        0xa1fs
        0xa14s
        0xa0es
        0xcfas
        0xccbs
        0xcd2s
        0xcdds
        0xcd4s
        0xcc3s
        0xc94s
        0xc8as
        0xc95s
        0xc8bs
        0xc95s
        0xc8bs
        0xc9bs
        0xc93s
        0xcd3s
        0xccfs
        0xccfs
        0xccbs
        0xcc8s
        0xc81s
        0xc94s
        0xc94s
        0xcdas
        0xccbs
        0xcd2s
        0xcdds
        0xcd4s
        0xcc3s
        0xc95s
        0xcd8s
        0xcd4s
        0xcd6s
        0xc92s
        0x963s
        0x94fs
        0x94es
        0x954s
        0x945s
        0x94es
        0x954s
        0x90ds
        0x974s
        0x959s
        0x950s
        0x945s
        0x13as
        0x12bs
        0x12bs
        0x137s
        0x132s
        0x138s
        0x13as
        0x12fs
        0x132s
        0x134s
        0x135s
        0x174s
        0x131s
        0x128s
        0x134s
        0x135s
        0xaf0s
        0xaecs
        0xaecs
        0xae8s
        0xaebs
        0xaa2s
        0xab7s
        0xab7s
        0xaees
        0xaa9s
        0xab6s
        0xaees
        0xaf7s
        0xafbs
        0xaeds
        0xab6s
        0xaebs
        0xaecs
        0xaeds
        0xafcs
        0xaf1s
        0xaf7s
        0xab7s
        0xaf9s
        0xae8s
        0xaf1s
        0xab7s
        0xaecs
        0xaecs
        0xaebs
        0xab7s
        0xaees
        0xaf7s
        0xaf1s
        0xafbs
        0xafds
        0xaa7s
        0xaebs
        0xaf0s
        0xaf7s
        0xaefs
        0xaa5s
        0xafes
        0xaeds
        0xaf4s
        0xaf4s
        0x193s
        0x1a8s
        0x1a7s
        0x1b3s
        0x1b2s
        0x1aes
        0x1a9s
        0x1b4s
        0x1afs
        0x1bcs
        0x1a3s
        0x1a2s
        0xb09s
        0xb0es
        0xb1bs
        0xb0es
        0xb0fs
        0xb09s
        0x3a7s
        0x3a2s
        0x3b7s
        0x3a2s
        0xa91s
        0xa9cs
        0xabes
        0xa97s
        0xa8as
        0xabfs
        0xa9ds
        0xa96s
        0xa9ds
        0xa8as
        0xa99s
        0xa8cs
        0xa9ds
        0x686s
        0x689s
        0x685s
        0x68ds
        0x313s
        0x378bs
        -0x738as
        -0x6f98s
        0x5532s
        0x65d0s
        0x378as
        0x7bbs
        0x553bs
        -0x771as
        -0x6f98s
        -0x7a17s
        0x558cs
        -0x700ds
        0x5eaas
        -0x7542s
        0x7a1s
        0x7bbs
        0x229s
        0x26as
        0x233s
        0x266s
        0x2eb8s
        0x99ds
        0x9e9s
        0x9e9s
        0x9ees
        -0x7db0s
        -0x61b2s
        0x6f42s
        0x6adfs
        0x6bads
        0x5b22s
        0x54a9s
        0x632es
        0x48b3s
        0x6b0s
        0x6b0s
        0x6b0s
        0x50f0s
        0x6777s
        0x6abes
        0x6f23s
        0x5570s
        -0x7e9cs
        0xc7bs
        0xc61s
        0x56cbs
        0x5a2as
        -0x6cdds
        -0x63bfs
        0x723es
        0x5b85s
        0x5de1s
        -0x760bs
        0x358bs
        -0x718as
        -0x6d98s
        0x5732s
        0x67d0s
        0x358as
        0x5bbs
        0x22d7s
        0x5bbs
        0x601cs
        0x4b6ds
        -0x71a0s
        0x5402s
        0x5a99s
        0x5ba3s
        0x5a1s
        0x5bbs
        0x6248s
        0x671cs
        0x5752s
        0x5a37s
        -0x6d6fs
        -0x592s
        -0x716bs
        0x542as
        0x524as
        0x67f4s
        -0x6d6fs
        0x5a37s
        0x5754s
        0x4b62s
        0x6203s
        -0x7171s
        -0x6d6fs
        0x3c8bs
        -0x788as
        -0x6498s
        0x5e32s
        0x6ed0s
        0x3c8as
        0xcbbs
        0x2bd7s
        0xcbbs
        0x6a64s
        0x6ff9s
        0x5399s
        0x52a3s
        0xca1s
        0xcbbs
        0xc08s
        0xc4bs
        0xc12s
        0xc47s
        0x26ces
        0x1ebs
        -0x75das
        -0x69c8s
        0x6734s
        0x62a9s
        0x63dbs
        0x5354s
        0x348ds
        -0x7090s
        -0x6c92s
        0x5634s
        0x66d6s
        0x348cs
        0x4bds
        0x617ds
        0x6848s
        0x62a3s
        0x7da7s
        0x4c9s
        0x4f2s
        0x4fcs
        0x4ees
        0x4e9s
        0x4a7s
        0x4bds
        0x3436s
        -0x7035s
        -0x6c2bs
        0x568fs
        0x666ds
        0x3437s
        0x406s
        0x6218s
        0x7d1cs
        0x472s
        0x449s
        0x447s
        0x455s
        0x452s
        0x5d17s
        -0x76fds
        0x41cs
        0x406s
        0x3764s
        -0x7367s
        -0x6f79s
        0x55dds
        0x653fs
        0x3765s
        0x754s
        0x5543s
        0x62c4s
        -0x6f79s
        -0x7afas
        0x5563s
        -0x70e4s
        0x5e45s
        -0x75afs
        0x74es
        0x754s
        0x3cas
        0x3d3s
        0x3d5s
        0x3dfs
        0x3d9s
        0x3e3s
        0x3dds
        0x3cfs
        0x3cfs
        0x3d5s
        0x3cfs
        0x3c8s
        0x3dds
        0x3d2s
        0x3c8s
        0x6d6s
        0x6d6s
        0x6d1s
        0x6fds
        0x6c3s
        0x6d2s
        0x6cbs
        0x6fds
        0x6c9s
        0x6c7s
        0x6dbs
        0xa3es
        0xa27s
        0xa21s
        0xa2bs
        0xa2ds
        0xa17s
        0xa29s
        0xa3bs
        0xa3bs
        0xa21s
        0xa3bs
        0xa3cs
        0xa29s
        0xa26s
        0xa3cs
        0x584s
        0x590s
        0x581s
        0x58cs
        0x58as
        0x5bas
        0x581s
        0x58cs
        0x597s
        0x5bas
        0x590s
        0x597s
        0x58cs
        0x7043s
        0x59f8s
        -0x695cs
        0x6444s
        0x64bds
        0x5432s
        0x37f7s
        -0x73f6s
        -0x6fecs
        0x554es
        0x65acs
        0x37f6s
        0x7c7s
        0x483as
        0x5cbfs
        0x7109s
        0x58b2s
        0x5ed6s
        -0x753es
        0x7dds
        0x7c7s
        0x7cdes
        0x5565s
        0x45eds
        0x5168s
        0x5301s
        -0x78ebs
        0x6f86s
        0x53cds
        -0x7477s
        0x6787s
        0x4ac8s
        0x4cbs
        0x4cbs
        0x4cbs
        0x8c3s
        0x8ccs
        0x8c6s
        0x8d0s
        0x8cds
        0x8cbs
        0x8c6s
        0x88cs
        0x8cbs
        0x8ccs
        0x8d6s
        0x8c7s
        0x8ccs
        0x8d6s
        0x88cs
        0x8c3s
        0x8c1s
        0x8d6s
        0x8cbs
        0x8cds
        0x8ccs
        0x88cs
        0x8eds
        0x8f2s
        0x8e7s
        0x8ecs
        0x8fds
        0x8e6s
        0x8eds
        0x8e1s
        0x8f7s
        0x8efs
        0x8e7s
        0x8ecs
        0x8f6s
        0x8fds
        0x8f6s
        0x8f0s
        0x8e7s
        0x8e7s
        0x6083s
        0x5dd0s
        0x743es
        0x5d85s
        -0x6d27s
        0x6039s
        0x5be1s
        -0x700bs
        0x65fs
        0x64bs
        0x65as
        0x657s
        0x651s
        0x7e8s
        0x7efs
        0x7fas
        0x7efs
        0x7ees
        0x7e8s
        0x8d6s
        0x8cas
        0x8cas
        0x8ces
        0x8cds
        0x884s
        0x891s
        0x891s
        0x8c8s
        0x88fs
        0x890s
        0x8c8s
        0x8d1s
        0x8dds
        0x8cbs
        0x890s
        0x8cds
        0x8cas
        0x8cbs
        0x8das
        0x8d7s
        0x8d1s
        0x891s
        0x8dfs
        0x8ces
        0x8d7s
        0x891s
        0x8cas
        0x8cas
        0x8cds
        0x891s
        0x8d9s
        0x8dbs
        0x8d0s
        0x8dbs
        0x8ccs
        0x8dfs
        0x8cas
        0x8dbs
        0x891s
        0x274s
        0x271s
        0x264s
        0x271s
        0x917s
        0x91fs
        0x90es
        0x91bs
        0x91es
        0x91bs
        0x90es
        0x91bs
        0x719s
        0x705s
        0x705s
        0x701s
        0x6d3s
        0x6c2s
        0x6d5s
        0x6d1s
        0x6c4s
        0x6d5s
        0x6d4s
        0x6f1s
        0x6c4s
        0xbfas
        0xbffs
        0xbebs
        0xbees
        0xbfbs
        0xbeas
        0xbebs
        0xbces
        0xbfbs
        0xb54s
        0xb58s
        0xb59s
        0xb43s
        0xb52s
        0xb59s
        0xb43s
        0xb44s
        0x63as
        0x631s
        0x634s
        0x634s
        0x631s
        0x636s
        0x63fs
        0x4das
        0x4d5s
        0x4d2s
        0x4dds
        0x4d0s
        0x4e3s
        0x4dfs
        0x4ces
        0x4d9s
        0x4d8s
        0x4d5s
        0x4c8s
        0x57ds
        0x561s
        0x561s
        0x565s
        0x566s
        0x52fs
        0x53as
        0x53as
        0x563s
        0x524s
        0x53bs
        0x563s
        0x57as
        0x576s
        0x560s
        0x53bs
        0x566s
        0x561s
        0x560s
        0x571s
        0x57cs
        0x57as
        0x53as
        0x574s
        0x565s
        0x57cs
        0x53as
        0x574s
        0x576s
        0x576s
        0x57as
        0x560s
        0x57bs
        0x561s
        0x53as
        0x57cs
        0x57bs
        0x573s
        0x57as
        0x652s
        0x654s
        0x642s
        0x655s
        0x254s
        0x245s
        0x252s
        0x253s
        0x25es
        0x243s
        0x244s
        0x31b9s
        -0x75bcs
        -0x69a6s
        0x5300s
        0x63e2s
        0x31b8s
        0x189s
        -0x7139s
        -0x75b5s
        0x5eabs
        0x5f91s
        0x193s
        0x189s
        0x39a0s
        -0x7da3s
        -0x61bds
        0x5b19s
        0x6bfbs
        0x39a1s
        0x990s
        0x2efcs
        0x990s
        -0x6786s
        0x6c8es
        -0x7b0cs
        0x6720s
        0x5081s
        -0x7b6bs
        0x98as
        0x990s
        0xc3ds
        0xc24s
        0xc22s
        0xc28s
        0xc2es
        0xc14s
        0xc2as
        0xc38s
        0xc38s
        0xc22s
        0xc38s
        0xc3fs
        0xc2as
        0xc25s
        0xc3fs
        0x3a6s
        0x3a6s
        0x3a1s
        0x38ds
        0x3b3s
        0x3a2s
        0x3bbs
        0x38ds
        0x3b9s
        0x3b7s
        0x3abs
        0x9e8s
        0x9abs
        0x9b6s
        0x9f5s
        0x237s
        0x274s
        0x22ds
        0x278s
        0x6b3s
        0x6eas
        0x6fcs
        0x6ebs
        0xcffs
        0xcffs
        0xcf8s
        0xc8bs
        -0x621as
        0x73c5s
        0x4286s
        0x5368s
        0xbc0s
        0xbd1s
        0xbc8s
        0xba1s
        0xbcas
        0xbe4s
        0xbf8s
        0xbbbs
        -0x7365s
        -0x7701s
        0x5609s
        0x72ds
        0x73cs
        0x725s
        0x74cs
        0x727s
        0x709s
        0x715s
        0x5365s
        0x77acs
        0x8c7s
        0x8dds
        0xc10s
        0xc0cs
        0xc0cs
        0xc08s
        0xc0bs
        0xc42s
        0xc57s
        0xc57s
        0xc0es
        0xc17s
        0xc1bs
        0xc0ds
        0xc56s
        0xc19s
        0xc11s
        -0x7e46s
        0x5800s
        0x55cds
        0x51d5s
        0x751cs
        0x554ds
        0x599cs
        -0x75b8s
        0x4460s
        0x558es
        -0x7606s
        0x599bs
        0xa26s
        0xa28s
        0xa34s
        0x47d3s
        0x5356s
        0x519es
        0x6fc0s
        0xca6s
        0xceds
        0xce8s
        0xcfds
        0xce8s
        0xca6s
        0xcfcs
        0xcfas
        0xcecs
        0xcfbs
        0xca6s
        0xcb9s
        0xca6s
        0xceas
        0xce6s
        0xce4s
        0xca7s
        0xcfas
        0xcfas
        0xca7s
        0xce8s
        0xce7s
        0xceds
        0xcfbs
        0xce6s
        0xce0s
        0xceds
        0xca7s
        0xcfcs
        0xcees
        0xceas
        0xca7s
        0xce8s
        0xcfes
        0xcecs
        0xce4s
        0xcecs
        0xca6s
        0xcefs
        0xce0s
        0xce5s
        0xcecs
        0xcfas
        0xca6s
        0xceas
        0xce6s
        0xce4s
        0xce4s
        0xcecs
        0xce7s
        0xcfds
        0xca6s
        0xce8s
        0xcfcs
        0xceds
        0xce0s
        0xce6s
        0xca6s
        0x3731s
        -0x7334s
        -0x6f2es
        0x5588s
        0x656as
        0x3730s
        0x701s
        0x206ds
        0x701s
        0x62c1s
        0x6bf4s
        0x611fs
        0x7e1bs
        0x5cd8s
        -0x7304s
        0x6f67s
        -0x7c5s
        0x762s
        0x74es
        0x74fs
        0x755s
        0x744s
        0x759s
        0x755s
        0x491bs
        0x7d5bs
        0x3874s
        -0x7c77s
        -0x6069s
        0x5acds
        0x6a2fs
        0x3875s
        0x844s
        0x2f28s
        0x844s
        0x6e5as
        0x715es
        0x539ds
        -0x7c47s
        0x6022s
        0x5155s
        -0x7abfs
        0x85es
        0x844s
        0x3182s
        -0x7581s
        -0x699fs
        0x533bs
        0x63d9s
        0x3183s
        0x1b2s
        0x26des
        0x1b2s
        0x55bds
        0x533as
        0x58a3s
        -0x7349s
        0x1a8s
        0x1b2s
        0x3652s
        -0x7251s
        -0x6e4fs
        0x54ebs
        0x6409s
        0x3653s
        0x662s
        0x210es
        0x662s
        0x561es
        0x6d20s
        0x5f73s
        -0x7499s
        0x678s
        0x662s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟ۢۡ۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "q9IaXdDkxXN2ESBtkNXnZiJ"

    invoke-static {v0}, Landroidx/loader/۟۠ۢۧۡ;->ۨۧۦۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method static bridge synthetic _$$Nest$sfgetselectedAudio()Landroid/net/Uri;
    .locals 1

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->۟ۡ۟ۡۦ()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method static bridge synthetic _$$Nest$sfgetvoiceList()Ljava/util/Map;
    .locals 1

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۣۥ()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method static bridge synthetic _$$Nest$sfputselectedVoiceId(Ljava/lang/String;)V
    .locals 0

    sput-object p0, Lkevin/fun/hook/VoiceAssistantHook;->selectedVoiceId:Ljava/lang/String;

    return-void
.end method

.method static bridge synthetic _$$Nest$smdpToPx(Landroid/content/Context;F)I
    .locals 1

    invoke-static {p0, p1}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v0

    return v0
.end method

.method private static clearTtsResources()V
    .locals 3

    const/4 v0, 0x0

    const/4 v2, 0x0

    sput-object v2, Lkevin/fun/hook/VoiceAssistantHook;->currentTtsAudioPath:Ljava/lang/String;

    sput-object v2, Lkevin/fun/hook/VoiceAssistantHook;->currentTtsAudioUrl:Ljava/lang/String;

    sput v0, Lkevin/fun/hook/VoiceAssistantHook;->currentTtsCost:I

    sput v0, Lkevin/fun/hook/VoiceAssistantHook;->currentTtsRemaining:I

    const-wide/16 v0, 0x0

    sput-wide v0, Lkevin/fun/hook/VoiceAssistantHook;->currentTtsDuration:J

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۥۨ۠()Ljava/lang/String;

    move-result-object v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    :try_start_0
    new-instance v0, Ljava/io/File;

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۥۨ۠()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Landroidx/loader/۟۠ۢۧۡ;->ۣۣ۟ۢۤ(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x6eb

    goto :goto_1

    :catch_0
    move-exception v0

    :sswitch_4
    sput-object v2, Lkevin/fun/hook/VoiceAssistantHook;->currentTtsAudioPath:Ljava/lang/String;

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_5
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
    .end sparse-switch
.end method

.method private static createButtonBg(I)Landroid/graphics/drawable/Drawable;
    .locals 2

    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-static {v0, p0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v0, v1}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۥ۟ۢۧ(Ljava/lang/Object;F)V

    return-object v0
.end method

.method private static createDialog(Landroid/app/Activity;)V
    .locals 8

    :try_start_0
    invoke-static {p0}, Lkevin/fun/hook/VoiceAssistantHook;->۠ۡ۠۠(Ljava/lang/Object;)Landroid/widget/LinearLayout;

    move-result-object v0

    new-instance v1, Landroid/app/Dialog;

    invoke-direct {v1, p0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    const/4 v2, 0x1

    invoke-static {v1, v2}, Landroidx/viewpager/ۣۢ۟ۤ;->ۣ۟ۢۡۦ(Ljava/lang/Object;I)Z

    invoke-static {v1, v0}, Landroidx/viewpager/ۣۢ۟ۤ;->ۥۢۨۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x1

    invoke-static {v1, v0}, Landroidx/emoji2/ۢۧۡۧ;->ۦ۠ۥۤ(Ljava/lang/Object;Z)V

    invoke-static {v1}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۨۥۢ(Ljava/lang/Object;)Landroid/view/Window;

    move-result-object v2

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v2, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    const/4 v3, 0x0

    invoke-direct {v0, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-static {v2, v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟ۢ۟ۥ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v0, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۤ۟ۨ:I

    xor-int/lit16 v0, v0, -0x1bf

    invoke-static {v2, v0}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣۣۢۨ(Ljava/lang/Object;I)V

    invoke-static {v2}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->۟۠ۥۤۢ(Ljava/lang/Object;)Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    invoke-static {p0}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۣ۟ۤۢۨ(Ljava/lang/Object;)Landroid/content/res/Resources;

    move-result-object v3

    invoke-static {v3}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟۟ۤۦۤ(Ljava/lang/Object;)Landroid/util/DisplayMetrics;

    move-result-object v3

    invoke-static {v3}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۤ۠۠ۨ(Ljava/lang/Object;)I

    move-result v3

    int-to-double v4, v3

    const-wide v6, 0x3feccccccccccccdL    # 0.9

    mul-double/2addr v4, v6

    double-to-int v3, v4

    iput v3, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    const/4 v3, -0x2

    iput v3, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    invoke-static {v2, v0}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣ۟ۨ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_3
    invoke-static {v1}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۦۧۤۡ(Ljava/lang/Object;)V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lkevin/fun/hook/VoiceAssistantHook;->dialogRef:Ljava/lang/ref/WeakReference;

    invoke-static {p0}, Lkevin/fun/hook/VoiceAssistantHook;->ۢ۟ۥۦ(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    const/16 v0, 0x6eb

    goto :goto_1

    :catch_0
    move-exception v0

    invoke-static {v0}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۤ۟۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v2

    const/16 v3, 0xe6

    sget v4, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣ۠ۢۢ:I

    xor-int/lit8 v4, v4, -0x7d

    const/16 v5, 0x513

    invoke-static {v2, v3, v4, v5}, Landroidx/activity/ۨ۠۟ۧ;->۟ۡۨۨۧ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۨ۟(Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v1, 0xf8

    sget v2, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢ۟ۥ:I

    xor-int/lit16 v2, v2, 0x173

    const/16 v3, 0x588

    invoke-static {v0, v1, v2, v3}, Landroidx/core/ۤۦ۟ۢ;->ۣۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lkevin/fun/hook/VoiceAssistantHook;->ۣ۟۟ۡۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
    .end sparse-switch
.end method

.method private static createDialogBackground()Landroid/graphics/drawable/Drawable;
    .locals 5

    const/4 v3, 0x0

    const/4 v0, 0x0

    const-string v1, "\u06e7\u06e5\u06e2"

    move v2, v3

    move v4, v3

    :goto_0
    invoke-static {v1}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {v0, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    const-string v1, "\u06e8\u06e0\u06e4"

    goto :goto_0

    :sswitch_0
    xor-int/lit16 v3, v2, -0x2ff

    const-string v1, "\u06df\u06e4\u06e0"

    move v4, v3

    goto :goto_0

    :sswitch_1
    const/high16 v1, 0x41a00000    # 20.0f

    invoke-static {v0, v1}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۥ۟ۢۧ(Ljava/lang/Object;F)V

    const-string v1, "\u06e0\u06e2\u06e6"

    goto :goto_0

    :sswitch_2
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const-string v1, "\u06e2\u06e1\u06e3"

    goto :goto_0

    :sswitch_3
    sget v2, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    const-string v1, "\u06e8\u06e7\u06e8"

    goto :goto_0

    :sswitch_4
    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aab24 -> :sswitch_4
        0x1ab284 -> :sswitch_3
        0x1ac5c4 -> :sswitch_2
        0x1ac8ec -> :sswitch_1
        0x1ac9c9 -> :sswitch_0
    .end sparse-switch
.end method

.method private static createDialogContent(Landroid/app/Activity;)Landroid/widget/LinearLayout;
    .locals 6

    const/4 v4, 0x1

    new-instance v1, Landroid/widget/LinearLayout;

    invoke-direct {v1, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-static {v1, v4}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۤۥۣۧ()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {v1, v0}, Landroidx/loader/ۡۢۢ;->ۣۣ۟ۤۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v0, 0x41a00000    # 20.0f

    invoke-static {p0, v0}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v0

    invoke-static {v1, v0, v0, v0, v0}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    invoke-static {p0}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۧۡ۠(Ljava/lang/Object;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-static {v1, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/view/View;

    invoke-direct {v0, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    sget v2, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/lit16 v2, v2, -0x320

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v3, v2, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v0, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۦۤۡۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v3, -0x333161

    sget v4, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    xor-int/2addr v3, v4

    invoke-static {v0, v3}, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۤۥۧ(Ljava/lang/Object;I)V

    invoke-static {v1, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/VoiceAssistantHook;->۟ۢۢۥۦ(Ljava/lang/Object;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-static {v1, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/widget/FrameLayout;

    invoke-direct {v0, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    sget v4, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    xor-int/lit8 v4, v4, -0x49

    invoke-direct {v3, v2, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v0, v3}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۣۡ۠۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/VoiceAssistantHook;->۟ۡ۟ۨۦ(Ljava/lang/Object;)Landroid/widget/LinearLayout;

    move-result-object v2

    invoke-static {p0}, Lkevin/fun/hook/VoiceAssistantHook;->ۣ۠۟۠(Ljava/lang/Object;)Landroid/widget/LinearLayout;

    move-result-object v3

    sget v4, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/lit16 v4, v4, 0x317

    invoke-static {v3, v4}, Landroidx/loader/ۢۥ۟;->۟ۦۡۥۤ(Ljava/lang/Object;I)V

    invoke-static {v0, v2}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۡۢ۟۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v3}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۡۢ۟۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۥ۟۟()Ljava/lang/ref/WeakReference;

    move-result-object v4

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v4, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۥ۟۟()Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟ۦ۟ۡ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v4, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۥ۟۟()Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟ۦ۟ۡ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    new-instance v4, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda15;

    invoke-direct {v4, v2, v3, p0}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda15;-><init>(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    invoke-static {v0, v4}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۦۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_6
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۥ۠ۢ()Ljava/lang/ref/WeakReference;

    move-result-object v4

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_7
    if-eqz v4, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_8
    const v0, 0xbe41

    goto :goto_2

    :sswitch_9
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۥ۠ۢ()Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟ۦ۟ۡ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    const v0, 0xbe7f

    :goto_3
    const v5, 0xbe90

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_3
    :sswitch_a
    const v0, 0xbebd

    goto :goto_3

    :sswitch_b
    if-eqz v4, :cond_3

    const v0, 0xbedc

    goto :goto_3

    :sswitch_c
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۥ۠ۢ()Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟ۦ۟ۡ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    new-instance v4, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda16;

    invoke-direct {v4, v2, v3}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda16;-><init>(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;)V

    invoke-static {v0, v4}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۦۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_d
    return-object v1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_6
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_6
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_7
        0xb918 -> :sswitch_d
        0xb939 -> :sswitch_9
        0xb97b -> :sswitch_8
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_a
        0x2d -> :sswitch_d
        0x4c -> :sswitch_c
        0xef -> :sswitch_b
    .end sparse-switch
.end method

.method private static createEditTextBackground(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
    .locals 5

    const/4 v2, 0x0

    const/4 v0, 0x0

    const-string v4, "\u06e2\u06e3\u06e7"

    move v1, v2

    move v3, v2

    :goto_0
    invoke-static {v4}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v2

    sparse-switch v2, :sswitch_data_0

    const v2, 0x33316a

    xor-int/2addr v2, v1

    const-string v4, "\u06e0\u06e3\u06e1"

    move v3, v2

    goto :goto_0

    :sswitch_0
    const/4 v2, 0x1

    invoke-static {v0, v2, v3}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۣ۟ۧ۟۠(Ljava/lang/Object;II)V

    const-string v2, "\u06df\u06e5\u06e6"

    move-object v4, v2

    goto :goto_0

    :sswitch_1
    invoke-static {v0, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    const-string v2, "\u06e0\u06df\u06e0"

    move-object v4, v2

    goto :goto_0

    :sswitch_2
    xor-int/lit16 v2, v1, 0x3a5

    const-string v4, "\u06df\u06e2\u06df"

    move v3, v2

    goto :goto_0

    :sswitch_3
    const/high16 v2, 0x41000000    # 8.0f

    invoke-static {v0, v2}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۥ۟ۢۧ(Ljava/lang/Object;F)V

    const-string v2, "\u06e6\u06e6\u06e3"

    move-object v4, v2

    goto :goto_0

    :sswitch_4
    sget v1, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    const-string v2, "\u06e2\u06e8\u06e0"

    move-object v4, v2

    goto :goto_0

    :sswitch_5
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const-string v2, "\u06e4\u06e3\u06e3"

    move-object v4, v2

    goto :goto_0

    :sswitch_6
    sget v1, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۨۤۨۡ:I

    const-string v2, "\u06e5\u06e0\u06e8"

    move-object v4, v2

    goto :goto_0

    :sswitch_7
    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa75c -> :sswitch_1
        0x1aa7c0 -> :sswitch_3
        0x1aaac1 -> :sswitch_4
        0x1aab3e -> :sswitch_0
        0x1ab2c6 -> :sswitch_5
        0x1aba44 -> :sswitch_6
        0x1abdad -> :sswitch_2
        0x1ac223 -> :sswitch_7
    .end sparse-switch
.end method

.method private static createLargeButton(Landroid/content/Context;Ljava/lang/String;ILandroid/view/View$OnClickListener;)Landroid/widget/Button;
    .locals 11

    const/4 v1, 0x0

    const/high16 v10, 0x41a00000    # 20.0f

    const/high16 v9, 0x41400000    # 12.0f

    const/4 v5, 0x0

    const-string v3, "\u06e2\u06e1\u06e7"

    move-object v0, v1

    move-object v2, v1

    move v4, v5

    move v6, v5

    move v7, v5

    move v8, v5

    :goto_0
    invoke-static {v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    xor-int/lit8 v5, v8, -0x6c

    const-string v1, "\u06e8\u06e5\u06e0"

    move-object v3, v1

    move v7, v5

    goto :goto_0

    :sswitch_0
    invoke-static {p0, v9}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v5

    const-string v1, "\u06e6\u06e8\u06e2"

    move-object v3, v1

    move v6, v5

    goto :goto_0

    :sswitch_1
    const/high16 v1, 0x41c80000    # 25.0f

    invoke-static {v0, v1}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۥ۟ۢۧ(Ljava/lang/Object;F)V

    const-string v1, "\u06e5\u06e2\u06e4"

    move-object v3, v1

    goto :goto_0

    :sswitch_2
    invoke-static {v2, v7}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣ۟ۢ۟ۤ(Ljava/lang/Object;I)V

    const-string v1, "\u06e3\u06e1\u06e4"

    move-object v3, v1

    goto :goto_0

    :sswitch_3
    new-instance v1, Landroid/widget/Button;

    invoke-direct {v1, p0}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    const-string v3, "\u06e5\u06e5\u06e8"

    move-object v2, v1

    goto :goto_0

    :sswitch_4
    invoke-static {v2, p1}, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۣۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e7\u06e5\u06e4"

    move-object v3, v1

    goto :goto_0

    :sswitch_5
    sget v5, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۦۣۧ:I

    const-string v1, "\u06e1\u06e4"

    move-object v3, v1

    move v8, v5

    goto :goto_0

    :sswitch_6
    invoke-static {v2, p3}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۣۣ۟ۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e0\u06e5\u06e7"

    move-object v3, v1

    goto :goto_0

    :sswitch_7
    sget v5, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    const-string v1, "\u06e7\u06e8\u06e6"

    move-object v3, v1

    move v8, v5

    goto :goto_0

    :sswitch_8
    invoke-static {p0, v9}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v5

    const-string v1, "\u06e4\u06e2\u06e3"

    move-object v3, v1

    move v7, v5

    goto :goto_0

    :sswitch_9
    invoke-static {v2, v7}, Landroidx/viewpager/ۣۢ۟ۤ;->ۣۢ۟ۢ(Ljava/lang/Object;I)V

    const-string v1, "\u06e5\u06e8\u06e6"

    move-object v3, v1

    goto :goto_0

    :sswitch_a
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const-string v1, "\u06e4\u06e5\u06e8"

    move-object v3, v1

    goto :goto_0

    :sswitch_b
    invoke-static {v2, v8, v7, v4, v6}, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۧۡ۠ۨ(Ljava/lang/Object;IIII)V

    const-string v1, "\u06e7\u06e4\u06e5"

    move-object v3, v1

    goto :goto_0

    :sswitch_c
    const/high16 v1, 0x41600000    # 14.0f

    invoke-static {v2, v1}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟ۧ۟ۥۦ(Ljava/lang/Object;F)V

    const-string v1, "\u06e6\u06e2\u06df"

    move-object v3, v1

    goto :goto_0

    :sswitch_d
    invoke-static {p0, v10}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v5

    const-string v1, "\u06e5\u06e5\u06e3"

    move-object v3, v1

    move v8, v5

    goto :goto_0

    :sswitch_e
    invoke-static {v0, p2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    const-string v1, "\u06e2\u06e3\u06e0"

    move-object v3, v1

    goto/16 :goto_0

    :sswitch_f
    invoke-static {v2, v0}, Landroidx/activity/ۣۦۡۥ;->ۤۥ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e7\u06df\u06e7"

    move-object v3, v1

    goto/16 :goto_0

    :sswitch_10
    xor-int/lit8 v5, v8, -0x53

    const-string v1, "\u06e2\u06e8"

    move-object v3, v1

    move v7, v5

    goto/16 :goto_0

    :sswitch_11
    invoke-static {p0, v10}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v4

    const-string v1, "\u06e1\u06e6\u06e4"

    move-object v3, v1

    goto/16 :goto_0

    :sswitch_12
    return-object v2

    :sswitch_data_0
    .sparse-switch
        0xdc46 -> :sswitch_2
        0x1aab82 -> :sswitch_12
        0x1aaf5f -> :sswitch_0
        0x1ab288 -> :sswitch_3
        0x1ab2bf -> :sswitch_1
        0x1ab646 -> :sswitch_d
        0x1aba25 -> :sswitch_11
        0x1aba87 -> :sswitch_e
        0x1abde7 -> :sswitch_f
        0x1abe43 -> :sswitch_8
        0x1abe48 -> :sswitch_4
        0x1abea3 -> :sswitch_a
        0x1ac1a3 -> :sswitch_7
        0x1ac260 -> :sswitch_b
        0x1ac50f -> :sswitch_6
        0x1ac5a8 -> :sswitch_5
        0x1ac5c6 -> :sswitch_c
        0x1ac625 -> :sswitch_10
        0x1ac983 -> :sswitch_9
    .end sparse-switch
.end method

.method private static createLocalAudioLayout(Landroid/app/Activity;)Landroid/widget/LinearLayout;
    .locals 26

    const/4 v11, 0x0

    const/16 v22, 0x0

    const/16 v20, 0x0

    const/4 v7, 0x0

    const/16 v19, 0x0

    const/16 v17, 0x0

    const/4 v9, 0x0

    const/4 v15, 0x0

    const/16 v21, 0x0

    const/16 v16, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v6, 0x0

    const/4 v10, 0x0

    const/4 v5, 0x0

    const-string v18, "\u06df\u06e2\u06e6"

    :goto_0
    invoke-static/range {v18 .. v18}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v18

    sparse-switch v18, :sswitch_data_0

    const/16 v16, 0xff

    const/16 v18, 0xb2f

    move/from16 v0, v16

    move/from16 v1, v21

    move/from16 v2, v18

    invoke-static {v15, v0, v1, v2}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۡۤۥ([SIII)Ljava/lang/String;

    move-result-object v16

    move-object/from16 v0, v16

    invoke-static {v9, v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v22, Landroidx/core/ۧ۟ۤۨ;->ۣۤ۠ۤ:I

    const-string v18, "\u06e6\u06e0"

    goto :goto_0

    :sswitch_0
    const/16 v18, 0x1

    move/from16 v0, v18

    invoke-static {v8, v0}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۤۦۡۤ(Ljava/lang/Object;I)V

    move/from16 v0, v20

    invoke-static {v8, v0}, Landroidx/customview/ۤۡۥ;->۟ۥۡۢۡ(Ljava/lang/Object;I)V

    const/high16 v18, 0x42480000    # 50.0f

    move-object/from16 v0, p0

    move/from16 v1, v18

    invoke-static {v0, v1}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v22

    const-string v18, "\u06e3\u06e1\u06e5"

    goto :goto_0

    :sswitch_1
    invoke-static {v11, v12}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v8, Landroid/widget/ListView;

    move-object/from16 v0, p0

    invoke-direct {v8, v0}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    sget v22, Landroidx/core/ۧ۟ۤۨ;->ۣۤ۠ۤ:I

    const-string v18, "\u06e2\u06e3\u06df"

    goto :goto_0

    :sswitch_2
    new-instance v18, Lkevin/fun/hook/VoiceAssistantHook$AudioAdapter;

    move-object/from16 v0, v18

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v6}, Lkevin/fun/hook/VoiceAssistantHook$AudioAdapter;-><init>(Landroid/app/Activity;Ljava/util/List;)V

    move-object/from16 v0, v18

    invoke-static {v8, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۟ۥۣۢۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v10, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda30;

    move-object/from16 v0, v18

    invoke-direct {v10, v0}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda30;-><init>(Lkevin/fun/hook/VoiceAssistantHook$AudioAdapter;)V

    const-string v18, "\u06e5\u06e4\u06e0"

    goto :goto_0

    :sswitch_3
    invoke-static {v11, v8}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda31;

    invoke-direct {v5}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda31;-><init>()V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v15

    const-string v18, "\u06e7\u06e5\u06e1"

    goto :goto_0

    :sswitch_4
    new-instance v17, Landroid/widget/LinearLayout$LayoutParams;

    move-object/from16 v0, v17

    move/from16 v1, v20

    move/from16 v2, v21

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    move-object/from16 v0, v17

    invoke-static {v8, v0}, Landroidx/documentfile/ۡۢ۟ۥ;->ۥۨ۠۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->۟ۦۥۣۢ()Ljava/util/List;

    move-result-object v6

    const-string v18, "\u06e2\u06e8"

    goto/16 :goto_0

    :sswitch_5
    sget v22, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    const/16 v16, 0x10a

    move/from16 v0, v22

    xor-int/lit16 v0, v0, 0x20b

    move/from16 v18, v0

    const/16 v23, 0x708

    move/from16 v0, v16

    move/from16 v1, v18

    move/from16 v2, v23

    invoke-static {v15, v0, v1, v2}, Landroidx/core/ktx/۟۟ۡۢ۠;->۟ۢۦۧ([SIII)Ljava/lang/String;

    move-result-object v16

    const-string v18, "\u06e4\u06e0\u06e4"

    goto/16 :goto_0

    :sswitch_6
    invoke-static {v7, v14}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v11, v7}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/VoiceAssistantHook;->ۣ۠ۤۦ(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v12

    const-string v18, "\u06df\u06e4\u06e4"

    goto/16 :goto_0

    :sswitch_7
    sget v18, Landroidx/loader/ۡۢۢ;->ۣۡۦ۟:I

    move/from16 v0, v18

    xor-int/lit16 v0, v0, -0x3b9

    move/from16 v18, v0

    mul-int v21, v22, v18

    const-string v18, "\u06e5\u06e3\u06e1"

    goto/16 :goto_0

    :sswitch_8
    new-instance v17, Landroid/widget/LinearLayout$LayoutParams;

    move-object/from16 v0, v17

    move/from16 v1, v20

    move/from16 v2, v19

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v18, 0x0

    const/high16 v23, 0x41700000    # 15.0f

    move-object/from16 v0, p0

    move/from16 v1, v23

    invoke-static {v0, v1}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v23

    const/16 v24, 0x0

    const/16 v25, 0x0

    move-object/from16 v0, v17

    move/from16 v1, v18

    move/from16 v2, v23

    move/from16 v3, v24

    move/from16 v4, v25

    invoke-static {v0, v1, v2, v3, v4}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۨۥۡۥ(Ljava/lang/Object;IIII)V

    const-string v18, "\u06e0\u06df\u06e4"

    goto/16 :goto_0

    :sswitch_9
    move/from16 v0, v22

    xor-int/lit16 v0, v0, 0x176

    move/from16 v21, v0

    const/16 v16, 0x108

    const/16 v18, 0x6ad

    move/from16 v0, v16

    move/from16 v1, v21

    move/from16 v2, v18

    invoke-static {v15, v0, v1, v2}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢ۟ۥۨ([SIII)Ljava/lang/String;

    move-result-object v16

    sget v22, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    const-string v18, "\u06e4\u06e0\u06df"

    goto/16 :goto_0

    :sswitch_a
    move-object/from16 v0, v17

    invoke-static {v14, v0}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣ۟ۡۡۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v11, v14}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v11

    :sswitch_b
    new-instance v17, Landroid/widget/LinearLayout$LayoutParams;

    move-object/from16 v0, v17

    move/from16 v1, v20

    move/from16 v2, v19

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    move-object/from16 v0, v17

    invoke-static {v7, v0}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣۡۥۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v9, Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-direct {v9, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v18, "\u06e8\u06e8\u06e6"

    goto/16 :goto_0

    :sswitch_c
    const v18, -0x33328d

    xor-int v21, v18, v22

    new-instance v18, Landroid/graphics/drawable/ColorDrawable;

    move-object/from16 v0, v18

    move/from16 v1, v21

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    move-object/from16 v0, v18

    invoke-static {v8, v0}, Landroidx/activity/ۣۦۡۥ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v18, "\u06df\u06e6\u06e5"

    goto/16 :goto_0

    :sswitch_d
    new-instance v13, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda29;

    move-object/from16 v0, p0

    invoke-direct {v13, v0}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda29;-><init>(Landroid/app/Activity;)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v15

    sget v22, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢ۟ۥ:I

    const-string v18, "\u06e3\u06e3\u06e5"

    goto/16 :goto_0

    :sswitch_e
    sget v21, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    const v14, 0xde6979

    xor-int v22, v14, v21

    move-object/from16 v0, p0

    move-object/from16 v1, v16

    move/from16 v2, v22

    invoke-static {v0, v1, v2, v5}, Lkevin/fun/hook/VoiceAssistantHook;->ۣۥۥ۠(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)Landroid/widget/Button;

    move-result-object v14

    const-string v18, "\u06e5\u06e6\u06e7"

    goto/16 :goto_0

    :sswitch_f
    const/16 v18, 0x0

    move/from16 v0, v18

    invoke-static {v7, v0}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    sget v22, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۢ۠۠ۨ:I

    xor-int/lit8 v19, v22, 0x4b

    const-string v18, "\u06e2\u06e7\u06e0"

    goto/16 :goto_0

    :sswitch_10
    new-instance v11, Landroid/widget/LinearLayout;

    move-object/from16 v0, p0

    invoke-direct {v11, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/16 v18, 0x1

    move/from16 v0, v18

    invoke-static {v11, v0}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    sget v22, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۤۨۨ:I

    const-string v18, "\u06e3\u06e0\u06e2"

    goto/16 :goto_0

    :sswitch_11
    const v14, -0xb35310

    xor-int v21, v14, v22

    move-object/from16 v0, p0

    move-object/from16 v1, v16

    move/from16 v2, v21

    invoke-static {v0, v1, v2, v13}, Lkevin/fun/hook/VoiceAssistantHook;->۟ۢۥۣۨ(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)Landroid/widget/Button;

    move-result-object v14

    invoke-static {v7, v9}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v18, "\u06e7\u06df\u06df"

    goto/16 :goto_0

    :sswitch_12
    const v18, -0xfffe41

    xor-int v21, v18, v22

    move/from16 v0, v21

    invoke-static {v9, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const/high16 v18, 0x41600000    # 14.0f

    move/from16 v0, v18

    invoke-static {v9, v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const-string v18, "\u06e7\u06e2\u06e2"

    goto/16 :goto_0

    :sswitch_13
    invoke-static {v8, v10}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۧۤۤۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v18, Ljava/lang/ref/WeakReference;

    move-object/from16 v0, v18

    invoke-direct {v0, v8}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v18, Lkevin/fun/hook/VoiceAssistantHook;->audioListViewRef:Ljava/lang/ref/WeakReference;

    const-string v18, "\u06e8\u06df\u06df"

    goto/16 :goto_0

    :sswitch_14
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v15

    sget v22, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    move/from16 v0, v22

    xor-int/lit16 v0, v0, 0x25a

    move/from16 v21, v0

    const-string v18, "\u06e6\u06e6"

    goto/16 :goto_0

    :sswitch_15
    new-instance v18, Ljava/lang/ref/WeakReference;

    move-object/from16 v0, v18

    invoke-direct {v0, v14}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v18, Lkevin/fun/hook/VoiceAssistantHook;->replaceBtnRef:Ljava/lang/ref/WeakReference;

    const-string v18, "\u06e6\u06e1\u06e2"

    goto/16 :goto_0

    :sswitch_16
    const/16 v17, 0x0

    const/16 v18, 0x1

    move-object/from16 v0, v17

    move/from16 v1, v18

    invoke-static {v9, v0, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۤۦۤۢ(Ljava/lang/Object;Ljava/lang/Object;I)V

    new-instance v17, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v18, 0x0

    const/high16 v23, 0x3f800000    # 1.0f

    move-object/from16 v0, v17

    move/from16 v1, v18

    move/from16 v2, v19

    move/from16 v3, v23

    invoke-direct {v0, v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    move-object/from16 v0, v17

    invoke-static {v9, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۢۥۨۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v18, "\u06e6\u06e4\u06e6"

    goto/16 :goto_0

    :sswitch_17
    move/from16 v0, v22

    xor-int/lit16 v0, v0, -0x10d

    move/from16 v20, v0

    move/from16 v0, v20

    invoke-static {v11, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۡ۠ۨ۟(Ljava/lang/Object;I)V

    new-instance v7, Landroid/widget/LinearLayout;

    move-object/from16 v0, p0

    invoke-direct {v7, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const-string v18, "\u06e8\u06e2\u06e8"

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdc46 -> :sswitch_2
        0xdcba -> :sswitch_12
        0x1aa763 -> :sswitch_10
        0x1aa79f -> :sswitch_1
        0x1aa7de -> :sswitch_0
        0x1aaac5 -> :sswitch_a
        0x1ab2be -> :sswitch_c
        0x1ab33b -> :sswitch_b
        0x1ab625 -> :sswitch_17
        0x1ab647 -> :sswitch_7
        0x1ab685 -> :sswitch_9
        0x1ab9e3 -> :sswitch_11
        0x1ab9e8 -> :sswitch_e
        0x1abe03 -> :sswitch_4
        0x1abe21 -> :sswitch_13
        0x1abe66 -> :sswitch_15
        0x1ac187 -> :sswitch_8
        0x1ac1e8 -> :sswitch_d
        0x1ac507 -> :sswitch_6
        0x1ac567 -> :sswitch_16
        0x1ac5c3 -> :sswitch_5
        0x1ac8c8 -> :sswitch_3
        0x1ac92e -> :sswitch_f
        0x1ac9e6 -> :sswitch_14
    .end sparse-switch
.end method

.method private static createPathHintView(Landroid/app/Activity;)Landroid/view/View;
    .locals 10

    const/4 v9, 0x1

    const/high16 v5, 0x41200000    # 10.0f

    const/high16 v8, 0x41000000    # 8.0f

    const/4 v7, 0x0

    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-static {v2, v7}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    const v0, -0xa0825

    sget v1, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    xor-int/2addr v0, v1

    invoke-static {v2, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۡ۠ۨ۟(Ljava/lang/Object;I)V

    invoke-static {p0, v5}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v0

    invoke-static {p0, v8}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v1

    invoke-static {p0, v5}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v3

    invoke-static {p0, v8}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v4

    invoke-static {v2, v0, v1, v3, v4}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    sget v0, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۢۥۨۦ:I

    xor-int/lit16 v0, v0, 0x283

    invoke-static {v2, v0}, Landroidx/emoji2/ۢۧۡۧ;->ۡۤۥ(Ljava/lang/Object;I)V

    sget v0, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    sget v1, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۢ۠۠ۨ:I

    xor-int/lit8 v1, v1, 0x4b

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    xor-int/lit8 v0, v0, 0x75

    invoke-direct {v3, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/high16 v0, 0x40a00000    # 5.0f

    invoke-static {p0, v0}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v0

    invoke-static {p0, v5}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v4

    invoke-static {v3, v7, v0, v7, v4}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۨۥۡۥ(Ljava/lang/Object;IIII)V

    invoke-static {v2, v3}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣۡۥۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Landroid/widget/TextView;

    invoke-direct {v3, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v4, 0x10f

    sget v5, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۦۣۧ:I

    xor-int/lit8 v5, v5, -0x79

    const/16 v6, 0x955

    invoke-static {v0, v4, v5, v6}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۧ۟ۧۢ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v0, 0x41800000    # 16.0f

    invoke-static {v3, v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v0, 0xde69ee

    sget v4, Lorg/luckypray/dexkit/۠۠ۥ;->ۣ۟ۡۢۡ:I

    xor-int/2addr v4, v0

    invoke-static {v3, v4}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    invoke-static {p0, v8}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v0

    invoke-static {v3, v7, v7, v0, v7}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    new-instance v5, Landroid/widget/LinearLayout;

    invoke-direct {v5, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-static {v5, v9}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-direct {v0, v7, v1, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-static {v5, v0}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣۡۥۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v6, Landroid/widget/TextView;

    invoke-direct {v6, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v1, 0x111

    sget v7, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    xor-int/lit8 v7, v7, -0x33

    const/16 v8, 0x409

    invoke-static {v0, v1, v7, v8}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۢ۠ۥۨ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0xbbb899

    sget v1, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    xor-int/2addr v0, v1

    invoke-static {v6, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const/high16 v0, 0x41400000    # 12.0f

    invoke-static {v6, v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const/4 v0, 0x0

    invoke-static {v6, v0, v9}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۤۦۤۢ(Ljava/lang/Object;Ljava/lang/Object;I)V

    new-instance v7, Landroid/widget/TextView;

    invoke-direct {v7, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {p0}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۣۣ۟(Ljava/lang/Object;)Landroid/net/Uri;

    move-result-object v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v1, 0x118

    sget v8, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    xor-int/lit16 v8, v8, 0x22b

    const/16 v9, 0x2a2

    invoke-static {v0, v1, v8, v9}, Landroidx/versionedparcelable/۠ۡۧۤ;->۟۟ۤۢۡ([SIII)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v1, 0x6eb

    goto :goto_1

    :sswitch_4
    invoke-static {v1}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۦۧۤۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :sswitch_5
    invoke-static {v7, v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v7, v4}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const/high16 v0, 0x41300000    # 11.0f

    invoke-static {v7, v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    sget v0, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۤۨۨ:I

    xor-int/lit16 v0, v0, 0x10e

    invoke-static {v7, v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۣ۟۠۠(Ljava/lang/Object;I)V

    invoke-static {}, Landroidx/loader/۟۠ۢۧۡ;->ۢۢۤۥ()Landroid/text/TextUtils$TruncateAt;

    move-result-object v0

    invoke-static {v7, v0}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۢۢۨ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v5, v6}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v5, v7}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda7;

    invoke-direct {v0, p0}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda7;-><init>(Landroid/app/Activity;)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v1

    const/16 v4, 0x11d

    sget v6, Landroidx/core/ۧ۟ۤۨ;->ۣۤ۠ۤ:I

    xor-int/lit16 v6, v6, 0x1bb

    const/16 v7, 0x3fd

    invoke-static {v1, v4, v6, v7}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۤۦۢۧ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1, v0}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۣ۟ۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/widget/Button;

    move-result-object v0

    invoke-static {v2, v3}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v5}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_5
    .end sparse-switch
.end method

.method private static createSmallButton(Landroid/content/Context;Ljava/lang/String;ILandroid/view/View$OnClickListener;)Landroid/widget/Button;
    .locals 12

    const/high16 v11, 0x41000000    # 8.0f

    const/high16 v10, 0x40400000    # 3.0f

    const/4 v1, 0x0

    const/4 v6, 0x0

    const-string v4, "\u06e2\u06e5\u06e5"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move v5, v6

    move v7, v6

    move v8, v6

    move v9, v6

    :goto_0
    invoke-static {v4}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {v0, p3}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۣۣ۟ۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e3\u06e6"

    move-object v4, v1

    goto :goto_0

    :sswitch_0
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v1, v7, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const-string v4, "\u06e6\u06df\u06e4"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    invoke-static {v0, v2}, Landroidx/activity/ۣۦۡۥ;->ۤۥ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e2\u06e1\u06df"

    move-object v4, v1

    goto :goto_0

    :sswitch_2
    xor-int/lit16 v7, v9, -0x293

    const-string v1, "\u06e0\u06e8\u06e6"

    move-object v4, v1

    goto :goto_0

    :sswitch_3
    invoke-static {p0, v10}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v5

    const-string v1, "\u06e7\u06e3\u06e4"

    move-object v4, v1

    goto :goto_0

    :sswitch_4
    invoke-static {v0, v9}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣ۟ۢ۟ۤ(Ljava/lang/Object;I)V

    const-string v1, "\u06df\u06e3\u06e5"

    move-object v4, v1

    goto :goto_0

    :sswitch_5
    invoke-static {v0, v6}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۧ۠ۥ(Ljava/lang/Object;I)V

    const-string v1, "\u06e7\u06e1\u06e8"

    move-object v4, v1

    goto :goto_0

    :sswitch_6
    invoke-static {v0, v3}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣ۟ۡۡۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e6\u06e8\u06e5"

    move-object v4, v1

    goto :goto_0

    :sswitch_7
    invoke-static {v0, v8, v9, v7, v5}, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۧۡ۠ۨ(Ljava/lang/Object;IIII)V

    const-string v1, "\u06e8\u06e5\u06e8"

    move-object v4, v1

    goto :goto_0

    :sswitch_8
    invoke-static {v0, v6}, Landroidx/core/ۤۦ۟ۢ;->۟ۡۧۧۧ(Ljava/lang/Object;I)V

    const-string v1, "\u06e7\u06e6\u06e5"

    move-object v4, v1

    goto :goto_0

    :sswitch_9
    const/high16 v1, 0x41300000    # 11.0f

    invoke-static {v0, v1}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟ۧ۟ۥۦ(Ljava/lang/Object;F)V

    const-string v1, "\u06e1\u06e4\u06e7"

    move-object v4, v1

    goto :goto_0

    :sswitch_a
    new-instance v0, Landroid/widget/Button;

    invoke-direct {v0, p0}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    const-string v1, "\u06e5\u06e0\u06e1"

    move-object v4, v1

    goto :goto_0

    :sswitch_b
    const/high16 v1, 0x41600000    # 14.0f

    invoke-static {v2, v1}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۥ۟ۢۧ(Ljava/lang/Object;F)V

    const-string v1, "\u06df\u06e0\u06e0"

    move-object v4, v1

    goto :goto_0

    :sswitch_c
    invoke-static {v0, v6}, Landroidx/customview/ۡۤۡۤ;->۟۟۟۟ۨ(Ljava/lang/Object;Z)V

    const-string v1, "\u06df\u06e6\u06e0"

    move-object v4, v1

    goto :goto_0

    :sswitch_d
    invoke-static {p0, v11}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v8

    const-string v1, "\u06e6\u06e1"

    move-object v4, v1

    goto :goto_0

    :sswitch_e
    sget v9, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۢۥۨۦ:I

    const-string v1, "\u06e3\u06e8\u06e1"

    move-object v4, v1

    goto :goto_0

    :sswitch_f
    invoke-static {p0, v11}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v7

    const-string v1, "\u06e0\u06e8\u06df"

    move-object v4, v1

    goto/16 :goto_0

    :sswitch_10
    invoke-static {v2, p2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    const-string v1, "\u06e8\u06e5\u06e0"

    move-object v4, v1

    goto/16 :goto_0

    :sswitch_11
    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const-string v4, "\u06e7\u06e6\u06e7"

    move-object v2, v1

    goto/16 :goto_0

    :sswitch_12
    invoke-static {p0, v10}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v9

    const-string v1, "\u06e7\u06e1\u06df"

    move-object v4, v1

    goto/16 :goto_0

    :sswitch_13
    invoke-static {v0, p1}, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۣۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e8\u06e1\u06e6"

    move-object v4, v1

    goto/16 :goto_0

    :sswitch_14
    const/high16 v1, 0x41e00000    # 28.0f

    invoke-static {p0, v1}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v8

    const-string v1, "\u06e3\u06e1\u06e5"

    move-object v4, v1

    goto/16 :goto_0

    :sswitch_15
    sget v8, Landroidx/activity/ۨ۠۟ۧ;->۟ۦۥۢۢ:I

    const-string v1, "\u06e7\u06e8\u06e5"

    move-object v4, v1

    goto/16 :goto_0

    :sswitch_16
    xor-int/lit16 v9, v8, -0x336

    const-string v1, "\u06e8\u06df\u06e1"

    move-object v4, v1

    goto/16 :goto_0

    :sswitch_17
    return-object v0

    :sswitch_data_0
    .sparse-switch
        0xdc63 -> :sswitch_17
        0xdcbb -> :sswitch_12
        0x1aa71f -> :sswitch_1
        0x1aa781 -> :sswitch_d
        0x1aabd7 -> :sswitch_3
        0x1aabde -> :sswitch_0
        0x1aaf24 -> :sswitch_15
        0x1ab280 -> :sswitch_c
        0x1ab302 -> :sswitch_a
        0x1ab647 -> :sswitch_e
        0x1ab71c -> :sswitch_2
        0x1abda6 -> :sswitch_13
        0x1ac14b -> :sswitch_6
        0x1ac263 -> :sswitch_11
        0x1ac545 -> :sswitch_f
        0x1ac54e -> :sswitch_8
        0x1ac588 -> :sswitch_7
        0x1ac5e6 -> :sswitch_14
        0x1ac5e8 -> :sswitch_10
        0x1ac624 -> :sswitch_16
        0x1ac8ca -> :sswitch_4
        0x1ac90d -> :sswitch_9
        0x1ac983 -> :sswitch_b
        0x1ac98b -> :sswitch_5
    .end sparse-switch
.end method

.method private static createTab(Landroid/content/Context;Ljava/lang/String;Z)Landroid/widget/TextView;
    .locals 5

    const/high16 v3, 0x41700000    # 15.0f

    const/high16 v4, 0x41200000    # 10.0f

    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {v2, p1}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v0, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    xor-int/lit16 v0, v0, -0x17c

    invoke-static {v2, v0}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    const/high16 v0, 0x41600000    # 14.0f

    invoke-static {v2, v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    invoke-static {p0, v3}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v0

    invoke-static {p0, v4}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v1

    invoke-static {p0, v3}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v3

    invoke-static {p0, v4}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v4

    invoke-static {v2, v0, v1, v3, v4}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/high16 v0, 0x41c80000    # 25.0f

    invoke-static {v3, v0}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۥ۟ۢۧ(Ljava/lang/Object;F)V

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz p2, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const v0, -0xde690d

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v1, 0x6eb

    goto :goto_1

    :sswitch_4
    const v0, -0xf0f10

    :sswitch_5
    invoke-static {v3, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    invoke-static {v2, v3}, Landroidx/core/ۧ۟ۤۨ;->ۣ۟ۢۧ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz p2, :cond_1

    const v0, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    const/4 v0, -0x1

    const v1, 0xbe7f

    :goto_3
    const v3, 0xbe90

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :goto_4
    :sswitch_9
    invoke-static {v2, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    return-object v2

    :sswitch_a
    const v1, 0xbe9e

    goto :goto_3

    :sswitch_b
    const v0, -0x777778

    goto :goto_4

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_b
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0xef -> :sswitch_a
    .end sparse-switch
.end method

.method private static createTabBar(Landroid/app/Activity;)Landroid/widget/LinearLayout;
    .locals 14

    const/high16 v13, 0x41700000    # 15.0f

    const/4 v1, 0x0

    const/4 v11, 0x0

    const-string v9, "\u06e2\u06e8\u06e1"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move-object v7, v1

    move-object v8, v1

    move v10, v11

    move v12, v11

    :goto_0
    invoke-static {v9}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    new-instance v1, Landroid/widget/LinearLayout;

    invoke-direct {v1, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const-string v9, "\u06e1\u06e7\u06e5"

    move-object v2, v1

    goto :goto_0

    :sswitch_0
    sput-object v4, Lkevin/fun/hook/VoiceAssistantHook;->tabTtsRef:Ljava/lang/ref/WeakReference;

    const-string v1, "\u06e8\u06e8\u06e6"

    move-object v9, v1

    goto :goto_0

    :sswitch_1
    const/high16 v1, 0x40a00000    # 5.0f

    invoke-static {p0, v1}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v12

    const-string v1, "\u06e7\u06e1\u06e2"

    move-object v9, v1

    goto :goto_0

    :sswitch_2
    xor-int/lit16 v10, v12, 0x326

    const-string v1, "\u06e3\u06e1\u06e0"

    move-object v9, v1

    goto :goto_0

    :sswitch_3
    invoke-static {v5, v12, v11, v12, v11}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۨۥۡۥ(Ljava/lang/Object;IIII)V

    const-string v1, "\u06e7\u06e6\u06e7"

    move-object v9, v1

    goto :goto_0

    :sswitch_4
    xor-int/lit16 v10, v12, 0xe3

    const-string v1, "\u06e7\u06e6\u06e8"

    move-object v9, v1

    goto :goto_0

    :sswitch_5
    const/16 v1, 0x121

    const/16 v8, 0x646

    invoke-static {v7, v1, v10, v8}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧ۠ۥ۟([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v9, "\u06e0\u06e7\u06e3"

    move-object v8, v1

    goto :goto_0

    :sswitch_6
    sget v12, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    const-string v1, "\u06e1\u06e1\u06e0"

    move-object v9, v1

    goto :goto_0

    :sswitch_7
    xor-int/lit16 v10, v12, 0x256

    const-string v1, "\u06e6\u06e7\u06e0"

    move-object v9, v1

    goto :goto_0

    :sswitch_8
    sget v12, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    const-string v1, "\u06e3\u06e1\u06e3"

    move-object v9, v1

    goto :goto_0

    :sswitch_9
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v1

    const-string v9, "\u06e0\u06e5\u06e2"

    move-object v7, v1

    goto :goto_0

    :sswitch_a
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, v6}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const-string v9, "\u06df\u06e3\u06e3"

    move-object v3, v1

    goto :goto_0

    :sswitch_b
    invoke-static {p0, v13}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v10

    const-string v1, "\u06e4\u06e1"

    move-object v9, v1

    goto :goto_0

    :sswitch_c
    xor-int/lit16 v10, v12, 0x23f

    const-string v1, "\u06e8\u06e1"

    move-object v9, v1

    goto :goto_0

    :sswitch_d
    invoke-static {p0, v8, v11}, Lkevin/fun/hook/VoiceAssistantHook;->ۧۡۦ۟(Ljava/lang/Object;Ljava/lang/Object;Z)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "\u06e5\u06df\u06e0"

    move-object v9, v1

    goto :goto_0

    :sswitch_e
    invoke-static {v2, v11}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    const-string v1, "\u06e8\u06e7\u06e0"

    move-object v9, v1

    goto :goto_0

    :sswitch_f
    const/16 v1, 0x125

    const/16 v8, 0x818

    invoke-static {v7, v1, v10, v8}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۢ۠ۥۨ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v9, "\u06e1\u06e5\u06df"

    move-object v8, v1

    goto/16 :goto_0

    :sswitch_10
    sput-object v3, Lkevin/fun/hook/VoiceAssistantHook;->tabLocalRef:Ljava/lang/ref/WeakReference;

    const-string v1, "\u06e1\u06e2\u06e2"

    move-object v9, v1

    goto/16 :goto_0

    :sswitch_11
    const/4 v1, 0x1

    invoke-static {p0, v8, v1}, Lkevin/fun/hook/VoiceAssistantHook;->ۧۡۦ۟(Ljava/lang/Object;Ljava/lang/Object;Z)Landroid/widget/TextView;

    move-result-object v1

    const-string v9, "\u06e1\u06e3\u06df"

    move-object v6, v1

    goto/16 :goto_0

    :sswitch_12
    sget v12, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣۡۢ۟:I

    const-string v1, "\u06e0\u06e6"

    move-object v9, v1

    goto/16 :goto_0

    :sswitch_13
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v1

    const-string v9, "\u06e7\u06e7\u06e0"

    move-object v7, v1

    goto/16 :goto_0

    :sswitch_14
    invoke-static {v2, v6, v5}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣ۟ۢۤۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e4\u06e0\u06e0"

    move-object v9, v1

    goto/16 :goto_0

    :sswitch_15
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-direct {v1, v11, v10, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    const-string v9, "\u06e3\u06e6\u06e2"

    move-object v5, v1

    goto/16 :goto_0

    :sswitch_16
    invoke-static {v2, v10}, Landroidx/emoji2/ۢۧۡۧ;->ۡۤۥ(Ljava/lang/Object;I)V

    const-string v1, "\u06e1\u06e2\u06e6"

    move-object v9, v1

    goto/16 :goto_0

    :sswitch_17
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const-string v9, "\u06e4\u06e8\u06e3"

    move-object v4, v1

    goto/16 :goto_0

    :sswitch_18
    sget v12, Lorg/luckypray/dexkit/۠۠ۥ;->ۣ۟ۡۢۡ:I

    const-string v1, "\u06e8\u06e5\u06e6"

    move-object v9, v1

    goto/16 :goto_0

    :sswitch_19
    invoke-static {v2, v11, v12, v11, v10}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    const-string v1, "\u06e7\u06e3\u06e2"

    move-object v9, v1

    goto/16 :goto_0

    :sswitch_1a
    invoke-static {v2, v0, v5}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣ۟ۢۤۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e8\u06e1\u06e5"

    move-object v9, v1

    goto/16 :goto_0

    :sswitch_1b
    invoke-static {p0, v13}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v12

    const-string v1, "\u06e8\u06e3\u06e2"

    move-object v9, v1

    goto/16 :goto_0

    :sswitch_1c
    return-object v2

    :sswitch_data_0
    .sparse-switch
        0xdc06 -> :sswitch_2
        0xdc7d -> :sswitch_19
        0xdcf9 -> :sswitch_16
        0x1aa77f -> :sswitch_10
        0x1aab7d -> :sswitch_12
        0x1aabbc -> :sswitch_11
        0x1aaec0 -> :sswitch_7
        0x1aaee1 -> :sswitch_17
        0x1aaee5 -> :sswitch_1b
        0x1aaefd -> :sswitch_13
        0x1aaf3b -> :sswitch_d
        0x1aaf7f -> :sswitch_e
        0x1ab642 -> :sswitch_5
        0x1ab645 -> :sswitch_c
        0x1ab6df -> :sswitch_1
        0x1ab9e4 -> :sswitch_1a
        0x1abadf -> :sswitch_0
        0x1abd86 -> :sswitch_a
        0x1ac23f -> :sswitch_f
        0x1ac548 -> :sswitch_3
        0x1ac586 -> :sswitch_9
        0x1ac5e8 -> :sswitch_14
        0x1ac5e9 -> :sswitch_15
        0x1ac600 -> :sswitch_6
        0x1ac90c -> :sswitch_1c
        0x1ac947 -> :sswitch_b
        0x1ac989 -> :sswitch_4
        0x1ac9c1 -> :sswitch_8
        0x1ac9e6 -> :sswitch_18
    .end sparse-switch
.end method

.method private static createTinyButton(Landroid/content/Context;Ljava/lang/String;Landroid/view/View$OnClickListener;)Landroid/widget/Button;
    .locals 11

    const/high16 v10, 0x41100000    # 9.0f

    const/4 v1, 0x0

    const/high16 v9, 0x40a00000    # 5.0f

    const/4 v6, 0x0

    const-string v4, "\u06e6\u06e7\u06e4"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move v5, v6

    move v7, v6

    move v8, v6

    :goto_0
    invoke-static {v4}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    const/high16 v1, 0x41900000    # 18.0f

    invoke-static {p0, v1}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v7

    const-string v1, "\u06e0\u06e2\u06e8"

    move-object v4, v1

    goto :goto_0

    :sswitch_0
    invoke-static {v3, v10}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟ۧ۟ۥۦ(Ljava/lang/Object;F)V

    const-string v1, "\u06df\u06e8\u06e8"

    move-object v4, v1

    goto :goto_0

    :sswitch_1
    invoke-static {v3, v6}, Landroidx/core/ۤۦ۟ۢ;->۟ۡۧۧۧ(Ljava/lang/Object;I)V

    const-string v1, "\u06df\u06e8\u06e3"

    move-object v4, v1

    goto :goto_0

    :sswitch_2
    invoke-static {v3, p2}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۣۣ۟ۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e2\u06e3\u06e8"

    move-object v4, v1

    goto :goto_0

    :sswitch_3
    sget v7, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۣۧۢ:I

    const-string v1, "\u06e7\u06e0\u06e0"

    move-object v4, v1

    goto :goto_0

    :sswitch_4
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const-string v1, "\u06e2\u06e7\u06e3"

    move-object v4, v1

    goto :goto_0

    :sswitch_5
    invoke-static {v3, v8}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣ۟ۢ۟ۤ(Ljava/lang/Object;I)V

    const-string v1, "\u06df\u06e2\u06e8"

    move-object v4, v1

    goto :goto_0

    :sswitch_6
    invoke-static {p0, v9}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v8

    const-string v1, "\u06e7\u06e2"

    move-object v4, v1

    goto :goto_0

    :sswitch_7
    new-instance v1, Landroid/widget/Button;

    invoke-direct {v1, p0}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    const-string v4, "\u06df\u06e2\u06e4"

    move-object v3, v1

    goto :goto_0

    :sswitch_8
    invoke-static {v3, v7, v6, v8, v6}, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۧۡ۠ۨ(Ljava/lang/Object;IIII)V

    const-string v1, "\u06e7\u06e5\u06e4"

    move-object v4, v1

    goto :goto_0

    :sswitch_9
    invoke-static {v2, v8, v6, v6, v6}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۨۥۡۥ(Ljava/lang/Object;IIII)V

    const-string v1, "\u06e1\u06df\u06df"

    move-object v4, v1

    goto :goto_0

    :sswitch_a
    invoke-static {v3, v2}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣ۟ۡۡۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e2\u06e8"

    move-object v4, v1

    goto :goto_0

    :sswitch_b
    invoke-static {v3, v6}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۧ۠ۥ(Ljava/lang/Object;I)V

    const-string v1, "\u06e4\u06e6"

    move-object v4, v1

    goto :goto_0

    :sswitch_c
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v1, v5, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const-string v4, "\u06e4\u06e8\u06e4"

    move-object v2, v1

    goto :goto_0

    :sswitch_d
    invoke-static {v0, v7}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    const-string v1, "\u06e3\u06e0\u06e0"

    move-object v4, v1

    goto :goto_0

    :sswitch_e
    sget v5, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۢ۠۠ۨ:I

    const-string v1, "\u06e0\u06e0\u06e4"

    move-object v4, v1

    goto :goto_0

    :sswitch_f
    xor-int/lit8 v5, v8, -0x4

    const-string v1, "\u06e8\u06e7\u06e6"

    move-object v4, v1

    goto/16 :goto_0

    :sswitch_10
    invoke-static {v3, v6}, Landroidx/customview/ۡۤۡۤ;->۟۟۟۟ۨ(Ljava/lang/Object;Z)V

    const-string v1, "\u06e0\u06e3"

    move-object v4, v1

    goto/16 :goto_0

    :sswitch_11
    invoke-static {v0, v10}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۥ۟ۢۧ(Ljava/lang/Object;F)V

    const-string v1, "\u06e6\u06e3"

    move-object v4, v1

    goto/16 :goto_0

    :sswitch_12
    invoke-static {p0, v9}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v8

    const-string v1, "\u06e6\u06e5\u06e0"

    move-object v4, v1

    goto/16 :goto_0

    :sswitch_13
    invoke-static {v3, p1}, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۣۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e2\u06e3"

    move-object v4, v1

    goto/16 :goto_0

    :sswitch_14
    sget v8, Landroidx/activity/ۣۦۡۥ;->ۣۢۤۡ:I

    const-string v1, "\u06e7\u06e4\u06e7"

    move-object v4, v1

    goto/16 :goto_0

    :sswitch_15
    xor-int/lit16 v8, v7, 0x3c6

    const-string v1, "\u06e8\u06e1\u06e8"

    move-object v4, v1

    goto/16 :goto_0

    :sswitch_16
    invoke-static {v3, v0}, Landroidx/activity/ۣۦۡۥ;->ۤۥ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e1\u06e0\u06e8"

    move-object v4, v1

    goto/16 :goto_0

    :sswitch_17
    const v1, 0xde6946

    xor-int v7, v1, v5

    const-string v1, "\u06e3\u06e1"

    move-object v4, v1

    goto/16 :goto_0

    :sswitch_18
    invoke-static {p0, v9}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v7

    const-string v1, "\u06e2\u06e1\u06e1"

    move-object v4, v1

    goto/16 :goto_0

    :sswitch_19
    return-object v3

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc03 -> :sswitch_2
        0xdc41 -> :sswitch_0
        0xdc46 -> :sswitch_4
        0xdc5e -> :sswitch_d
        0xdc82 -> :sswitch_1
        0xdcbd -> :sswitch_16
        0xdcdb -> :sswitch_8
        0x1aa761 -> :sswitch_13
        0x1aa765 -> :sswitch_18
        0x1aa81f -> :sswitch_3
        0x1aaae4 -> :sswitch_17
        0x1aab26 -> :sswitch_14
        0x1aae81 -> :sswitch_a
        0x1aaea9 -> :sswitch_10
        0x1ab282 -> :sswitch_6
        0x1ab2c7 -> :sswitch_19
        0x1ab33e -> :sswitch_e
        0x1ab623 -> :sswitch_11
        0x1abae0 -> :sswitch_12
        0x1ac201 -> :sswitch_9
        0x1ac243 -> :sswitch_7
        0x1ac527 -> :sswitch_15
        0x1ac5aa -> :sswitch_f
        0x1ac5c6 -> :sswitch_b
        0x1ac90f -> :sswitch_5
        0x1ac9c7 -> :sswitch_c
    .end sparse-switch
.end method

.method private static createTitleBar(Landroid/app/Activity;)Landroid/widget/LinearLayout;
    .locals 14

    const/4 v1, 0x0

    const/4 v12, 0x0

    const/4 v11, 0x0

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v7, 0x0

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v9, 0x0

    const/4 v0, 0x0

    const-string v8, "\u06e2\u06df"

    :goto_0
    invoke-static {v8}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v8

    sparse-switch v8, :sswitch_data_0

    new-instance v8, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda38;

    invoke-direct {v8, p0}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda38;-><init>(Landroid/app/Activity;)V

    invoke-static {v3, v8}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۣۣ۟ۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v8, "\u06e0\u06e2\u06e7"

    goto :goto_0

    :sswitch_0
    sget v12, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    const v8, 0xfffda6

    xor-int v11, v8, v12

    const-string v8, "\u06e2\u06e8\u06e2"

    goto :goto_0

    :sswitch_1
    const/4 v5, 0x0

    const/4 v8, 0x1

    invoke-static {v2, v5, v8}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۤۦۤۢ(Ljava/lang/Object;Ljava/lang/Object;I)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v8, 0x0

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-direct {v5, v8, v10, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    const-string v8, "\u06df\u06e2\u06e4"

    goto :goto_0

    :sswitch_2
    invoke-static {v2, v11}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const/high16 v8, 0x41900000    # 18.0f

    invoke-static {v2, v8}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const-string v8, "\u06e3\u06e8\u06e4"

    goto :goto_0

    :sswitch_3
    const/high16 v8, 0x41a00000    # 20.0f

    invoke-static {v4, v8}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    invoke-static {v4, v12}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const-string v8, "\u06df\u06e7\u06e7"

    goto :goto_0

    :sswitch_4
    const/16 v6, 0x12a

    const/16 v8, 0x947

    invoke-static {v7, v6, v11, v8}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۨۤ۠۠([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v8, "\u06e3\u06e6\u06e2"

    goto :goto_0

    :sswitch_5
    invoke-static {v4, v0}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۦۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1, v2}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v8, "\u06df\u06df\u06e1"

    goto :goto_0

    :sswitch_6
    const/4 v8, 0x0

    invoke-static {v3, v8}, Landroidx/activity/ۣۦۡۥ;->ۤۥ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v10, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    const-string v8, "\u06e5\u06e7\u06df"

    goto :goto_0

    :sswitch_7
    xor-int/lit16 v11, v12, -0x1c7

    const/16 v6, 0x12e

    const/16 v8, 0x14d

    invoke-static {v7, v6, v11, v8}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣ۟۠ۢۡ([SIII)Ljava/lang/String;

    move-result-object v6

    const-string v8, "\u06e6\u06e6\u06e8"

    goto :goto_0

    :sswitch_8
    sget v12, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    xor-int/lit16 v11, v12, -0x383

    const-string v8, "\u06e5\u06e2\u06e2"

    goto :goto_0

    :sswitch_9
    invoke-static {v1, v3}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1, v4}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v8, "\u06e1\u06e5\u06e5"

    goto :goto_0

    :sswitch_a
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v7

    sget v12, Lkevin/fun/hook/۟ۥ۠۠;->ۢۦۧۧ:I

    const-string v8, "\u06df\u06e5\u06e8"

    goto/16 :goto_0

    :sswitch_b
    invoke-static {v4, v11, v10, v12, v9}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    new-instance v0, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda39;

    invoke-direct {v0}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda39;-><init>()V

    const-string v8, "\u06e6\u06df\u06e7"

    goto/16 :goto_0

    :sswitch_c
    sget v12, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    xor-int/lit16 v11, v12, 0x309

    const-string v8, "\u06e7\u06e3\u06e7"

    goto/16 :goto_0

    :sswitch_d
    const/high16 v8, 0x41200000    # 10.0f

    invoke-static {p0, v8}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v11

    const/high16 v8, 0x40a00000    # 5.0f

    invoke-static {p0, v8}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v10

    const-string v8, "\u06e3\u06e6\u06e5"

    goto/16 :goto_0

    :sswitch_e
    const v8, 0x77761d

    xor-int v12, v8, v10

    invoke-static {v3, v12}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣ۟ۢ۟ۤ(Ljava/lang/Object;I)V

    const-string v8, "\u06e0\u06e3"

    goto/16 :goto_0

    :sswitch_f
    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v7

    const-string v8, "\u06df\u06e5\u06e5"

    goto/16 :goto_0

    :sswitch_10
    invoke-static {v3, v6}, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۣۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v8, 0x41800000    # 16.0f

    invoke-static {v3, v8}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟ۧ۟ۥۦ(Ljava/lang/Object;F)V

    const-string v8, "\u06e8\u06e3\u06e8"

    goto/16 :goto_0

    :sswitch_11
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v5, v11, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v1, v5}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣۡۥۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v8, "\u06e7\u06e4\u06e7"

    goto/16 :goto_0

    :sswitch_12
    const/high16 v8, 0x41200000    # 10.0f

    invoke-static {p0, v8}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v12

    const/high16 v8, 0x40a00000    # 5.0f

    invoke-static {p0, v8}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v9

    const-string v8, "\u06e2\u06e7\u06e3"

    goto/16 :goto_0

    :sswitch_13
    invoke-static {v2, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۢۥۨۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Landroid/widget/Button;

    invoke-direct {v3, p0}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    const-string v8, "\u06e5\u06e8"

    goto/16 :goto_0

    :sswitch_14
    const/16 v6, 0x130

    const/4 v8, 0x1

    const/16 v13, 0xa01

    invoke-static {v7, v6, v8, v13}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟ۧۢۥ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v8, "\u06df\u06e4\u06e1"

    goto/16 :goto_0

    :sswitch_15
    new-instance v1, Landroid/widget/LinearLayout;

    invoke-direct {v1, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v8, 0x0

    invoke-static {v1, v8}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    const-string v8, "\u06e1\u06df\u06df"

    goto/16 :goto_0

    :sswitch_16
    sget v12, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    xor-int/lit16 v10, v12, -0x3a2

    const-string v8, "\u06df\u06e0\u06e3"

    goto/16 :goto_0

    :sswitch_17
    new-instance v4, Landroid/widget/TextView;

    invoke-direct {v4, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v7

    const-string v8, "\u06e7\u06e8\u06e2"

    goto/16 :goto_0

    :sswitch_18
    return-object v1

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc3d -> :sswitch_15
        0xdca3 -> :sswitch_a
        0x1aa701 -> :sswitch_9
        0x1aa722 -> :sswitch_11
        0x1aa761 -> :sswitch_13
        0x1aa79c -> :sswitch_3
        0x1aa7bf -> :sswitch_c
        0x1aa7c2 -> :sswitch_7
        0x1aa7ff -> :sswitch_d
        0x1aab25 -> :sswitch_17
        0x1aae81 -> :sswitch_8
        0x1aaf41 -> :sswitch_18
        0x1ab33e -> :sswitch_b
        0x1ab35c -> :sswitch_2
        0x1ab6df -> :sswitch_0
        0x1ab6e2 -> :sswitch_12
        0x1ab71f -> :sswitch_1
        0x1abde5 -> :sswitch_16
        0x1abe7d -> :sswitch_e
        0x1ac14e -> :sswitch_5
        0x1ac228 -> :sswitch_10
        0x1ac58b -> :sswitch_4
        0x1ac5aa -> :sswitch_f
        0x1ac621 -> :sswitch_14
        0x1ac94d -> :sswitch_6
    .end sparse-switch
.end method

.method private static createTtsLayout(Landroid/app/Activity;)Landroid/widget/LinearLayout;
    .locals 15

    const/high16 v14, 0x41600000    # 14.0f

    const/4 v13, 0x1

    const/high16 v12, 0x40a00000    # 5.0f

    const/high16 v11, 0x41200000    # 10.0f

    const/4 v10, 0x0

    new-instance v1, Landroid/widget/LinearLayout;

    invoke-direct {v1, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-static {v1, v13}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    sget v0, Landroidx/activity/ۦۧۥۥ;->۟ۦۢۧۤ:I

    xor-int/lit8 v0, v0, 0x34

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۡ۠ۨ۟(Ljava/lang/Object;I)V

    invoke-static {p0, v11}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v2

    invoke-static {v1, v10, v2, v10, v10}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v3

    const/16 v4, 0x131

    sget v5, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۢۥۨۦ:I

    xor-int/lit16 v5, v5, 0x294

    const/16 v6, 0x460

    invoke-static {v3, v4, v5, v6}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۨۦۣۨ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v3, -0xfffe8c

    sget v4, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢ۟ۥ:I

    xor-int/2addr v3, v4

    invoke-static {v2, v3}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    invoke-static {v2, v14}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const/4 v4, 0x0

    invoke-static {v2, v4, v13}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۤۦۤۢ(Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v1, v2}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Landroid/widget/EditText;

    invoke-direct {v2, p0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v4

    const/16 v5, 0x138

    sget v6, Lorg/luckypray/dexkit/۠۠ۥ;->ۣ۟ۡۢۡ:I

    xor-int/lit16 v6, v6, -0xee

    const/16 v7, 0xae7

    invoke-static {v4, v5, v6, v7}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۨۤ۠۠([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۥۣۢ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v4, 0x42a00000    # 80.0f

    invoke-static {p0, v4}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v4

    invoke-static {v2, v4}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->۟ۦ۟۠ۢ(Ljava/lang/Object;I)V

    sget v4, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣ۠ۧ:I

    xor-int/lit16 v4, v4, -0x1dc

    invoke-static {v2, v4}, Landroidx/core/ۤۦ۟ۢ;->ۧۡۨۥ(Ljava/lang/Object;I)V

    invoke-static {p0}, Lkevin/fun/hook/VoiceAssistantHook;->ۣۤۧۢ(Ljava/lang/Object;)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-static {v2, v4}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۠۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0, v11}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v4

    invoke-static {p0, v11}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v5

    invoke-static {p0, v11}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v6

    invoke-static {p0, v11}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v7

    invoke-static {v2, v4, v5, v6, v7}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۥۣۨۦ(Ljava/lang/Object;IIII)V

    sget v4, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    xor-int/lit8 v4, v4, -0x49

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v5, v0, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {p0, v12}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v6

    const/high16 v7, 0x41700000    # 15.0f

    invoke-static {p0, v7}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v7

    invoke-static {v5, v10, v6, v10, v7}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۨۥۡۥ(Ljava/lang/Object;IIII)V

    invoke-static {v2, v5}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟۠ۥۤۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1, v2}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Landroid/widget/TextView;

    invoke-direct {v5, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v6

    const/16 v7, 0x147

    sget v8, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    xor-int/lit16 v8, v8, -0x3c7

    const/16 v9, 0xa7d

    invoke-static {v6, v7, v8, v9}, Landroidx/versionedparcelable/۠ۡۧۤ;->۟۟ۤۢۡ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v5, v3}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    invoke-static {v5, v14}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const/4 v3, 0x0

    invoke-static {v5, v3, v13}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۤۦۤۢ(Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v1, v5}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Landroid/widget/Spinner;

    invoke-direct {v3, p0}, Landroid/widget/Spinner;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v5

    const/16 v6, 0x14c

    sget v7, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۦۣۧ:I

    xor-int/lit8 v7, v7, -0x6c

    const/16 v8, 0x9bd

    invoke-static {v5, v6, v7, v8}, Landroidx/startup/ۤۧۥۣ;->۟ۧۦ۠ۦ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟۟ۢۥ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Ljava/lang/ref/WeakReference;

    invoke-direct {v5, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v5, Lkevin/fun/hook/VoiceAssistantHook;->ttsSpinnerRef:Ljava/lang/ref/WeakReference;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v6

    const/16 v7, 0x15d

    sget v8, Landroidx/activity/ۤۧۧۧ;->۟۟ۢ۠ۡ:I

    xor-int/lit16 v8, v8, 0x1e0

    const/16 v9, 0x1b9

    invoke-static {v6, v7, v8, v9}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۧۨۦۦ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v6, Landroid/widget/ArrayAdapter;

    const v7, 0x109017c

    sget v8, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢ۟ۥ:I

    xor-int/2addr v7, v8

    invoke-direct {v6, p0, v7, v5}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    const v5, -0x1090251

    sget v7, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    xor-int/2addr v5, v7

    invoke-static {v6, v5}, Landroidx/loader/ۣۦ۟ۡ;->۟ۦۥ۟ۦ(Ljava/lang/Object;I)V

    invoke-static {v3, v6}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣ۟۟ۦۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Lkevin/fun/hook/VoiceAssistantHook$1;

    invoke-direct {v5}, Lkevin/fun/hook/VoiceAssistantHook$1;-><init>()V

    invoke-static {v3, v5}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣ۟ۡ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v5, v0, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {p0, v12}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v0

    const/high16 v4, 0x41700000    # 15.0f

    invoke-static {p0, v4}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v4

    invoke-static {v5, v10, v0, v10, v4}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۨۥۡۥ(Ljava/lang/Object;IIII)V

    invoke-static {v3, v5}, Landroidx/vectordrawable/۟ۤۨۥۣ;->۟۟۠۟ۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1, v3}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v3, 0x41400000    # 12.0f

    invoke-static {v0, v3}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v3, 0x777690

    sget v4, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۡۨۨۧ:I

    xor-int/2addr v3, v4

    invoke-static {v0, v3}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    invoke-static {p0, v11}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v3

    invoke-static {v0, v10, v10, v10, v3}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    invoke-static {v1, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Ljava/lang/ref/WeakReference;

    invoke-direct {v3, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v3, Lkevin/fun/hook/VoiceAssistantHook;->ttsStatusTextRef:Ljava/lang/ref/WeakReference;

    new-instance v3, Landroid/widget/LinearLayout;

    invoke-direct {v3, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-static {v3, v10}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    invoke-static {p0, v11}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v4

    invoke-static {v3, v10, v10, v10, v4}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    new-instance v4, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda9;

    invoke-direct {v4, v2, p0, v0}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda9;-><init>(Landroid/widget/EditText;Landroid/app/Activity;Landroid/widget/TextView;)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v2, 0x167

    sget v5, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    xor-int/lit8 v5, v5, 0x70

    const/16 v6, 0x295

    invoke-static {v0, v2, v5, v6}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۥۡۤۧ([SIII)Ljava/lang/String;

    move-result-object v0

    const v2, 0xde6aa9

    sget v5, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۨۤۨۡ:I

    xor-int/2addr v2, v5

    invoke-static {p0, v0, v2, v4}, Lkevin/fun/hook/VoiceAssistantHook;->۟ۢۥۣۨ(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)Landroid/widget/Button;

    move-result-object v0

    new-instance v2, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda10;

    invoke-direct {v2, p0}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda10;-><init>(Landroid/app/Activity;)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v4

    const/16 v5, 0x169

    sget v6, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۧۨۨ:I

    xor-int/lit8 v6, v6, -0x61

    const/16 v7, 0x3e2

    invoke-static {v4, v5, v6, v7}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۨۤ۠۠([SIII)Ljava/lang/String;

    move-result-object v4

    sget v5, Landroidx/appcompat/ۣۧۤۢ;->۟۠ۡۤۤ:I

    xor-int/lit16 v5, v5, 0x6713

    invoke-static {p0, v4, v5, v2}, Lkevin/fun/hook/VoiceAssistantHook;->۟ۢۥۣۨ(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)Landroid/widget/Button;

    move-result-object v2

    new-instance v4, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda12;

    invoke-direct {v4, p0}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda12;-><init>(Landroid/app/Activity;)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v5

    const/16 v6, 0x16b

    sget v7, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    xor-int/lit16 v7, v7, 0x164

    const/16 v8, 0xa29

    invoke-static {v5, v6, v7, v8}, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۥۧۤ([SIII)Ljava/lang/String;

    move-result-object v5

    const v6, 0xb35148

    sget v7, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۡۨۨۧ:I

    xor-int/2addr v6, v7

    invoke-static {p0, v5, v6, v4}, Lkevin/fun/hook/VoiceAssistantHook;->۟ۢۥۣۨ(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)Landroid/widget/Button;

    move-result-object v4

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    sget v6, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    xor-int/lit8 v6, v6, 0x12

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-direct {v5, v10, v6, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-static {p0, v12}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v6

    invoke-static {v5, v10, v10, v6, v10}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۨۥۡۥ(Ljava/lang/Object;IIII)V

    invoke-static {v0, v5}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣ۟ۡۡۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v5}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣ۟ۡۡۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4, v5}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣ۟ۡۡۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3, v2}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3, v4}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1, v3}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->۠۟ۥۦ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/documentfile/ۡۢ۟ۥ;->ۢۥۦۣ(Ljava/lang/Object;)Z

    move-result v2

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez v2, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۣۥ()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۡۧۡ(Ljava/lang/Object;)Z

    move-result v2

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v2, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {p0}, Lkevin/fun/hook/VoiceAssistantHook;->۠۠ۨ۟(Ljava/lang/Object;)V

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :sswitch_7
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۣۥ()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۡۧۡ(Ljava/lang/Object;)Z

    move-result v2

    const v0, 0xbe7f

    :goto_3
    const v3, 0xbe90

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_8
    const v0, 0xbebd

    goto :goto_3

    :sswitch_9
    if-nez v2, :cond_2

    const v0, 0xbedc

    goto :goto_3

    :sswitch_a
    invoke-static {p0}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۥۢۥ(Ljava/lang/Object;)V

    const v0, 0xbefb

    :goto_4
    const v2, 0xbf0c

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :sswitch_b
    return-object v1

    :sswitch_c
    const v0, 0xbf1a

    goto :goto_4

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_7
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_b
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_8
        0x2d -> :sswitch_b
        0x4c -> :sswitch_a
        0xef -> :sswitch_9
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_b
        0x1f7 -> :sswitch_c
    .end sparse-switch
.end method

.method private static dismissDialog()V
    .locals 3

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۣ۟ۢۤۤ()Ljava/lang/ref/WeakReference;

    move-result-object v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۣ۟ۢۤۤ()Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟ۦ۟ۡ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Dialog;

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v0, :cond_1

    const/16 v1, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v1, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۟ۤۥۣۡ(Ljava/lang/Object;)Z

    move-result v2

    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz v2, :cond_2

    const v1, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v1, 0xbe41

    goto :goto_2

    :sswitch_8
    invoke-static {v0}, Landroidx/customview/ۡۤۡۤ;->ۧۢۡۧ(Ljava/lang/Object;)V

    :sswitch_9
    const/4 v0, 0x0

    sput-object v0, Lkevin/fun/hook/VoiceAssistantHook;->dialogRef:Ljava/lang/ref/WeakReference;

    :sswitch_a
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۦۡۧ()V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۣۢۤ()V

    invoke-static {}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢ۠ۨ۟()I

    move-result v1

    const v0, 0xbe7f

    :goto_3
    const v2, 0xbe90

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_3
    :sswitch_b
    const v0, 0xbebd

    goto :goto_3

    :sswitch_c
    if-gtz v1, :cond_3

    const v0, 0xbedc

    goto :goto_3

    :sswitch_d
    const-string v0, "hAW5R6Q"

    invoke-static {v0}, Landroidx/startup/۟ۦۤۨۧ;->۟۟۟ۨۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_e
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_9
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_9
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_b
        0x2d -> :sswitch_e
        0x4c -> :sswitch_d
        0xef -> :sswitch_c
    .end sparse-switch
.end method

.method private static doReplace()V
    .locals 5

    const/4 v0, 0x0

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->۟ۡ۟ۡۦ()Landroid/net/Uri;

    move-result-object v2

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v1, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez v2, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v1

    const/16 v2, 0x16d

    sget v3, Landroidx/customview/ۤۡۥ;->ۣ۟ۢۥۢ:I

    xor-int/lit8 v3, v3, -0x6e

    const/16 v4, 0x9ca

    invoke-static {v1, v2, v3, v4}, Landroidx/drawerlayout/ۤۨۡۤ;->ۤ۠ۤ۠([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkevin/fun/hook/VoiceAssistantHook;->ۣ۟۟ۡۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۤۦۥۥ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-ltz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    const-string v0, "s4CHx77MwSdXW2iab9AezVEUqXy6"

    invoke-static {v0}, Landroidx/drawerlayout/ۤۨۡۤ;->ۡۢۢ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :goto_2
    :sswitch_6
    return-void

    :sswitch_7
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۣۨۤۢ()Ljava/lang/ref/WeakReference;

    move-result-object v2

    const/16 v1, 0x748

    :goto_3
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_3

    :sswitch_8
    if-eqz v2, :cond_2

    const v1, 0xbe60

    goto :goto_3

    :cond_2
    :sswitch_9
    const v1, 0xbe41

    goto :goto_3

    :sswitch_a
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۣۨۤۢ()Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟ۦ۟ۡ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    :sswitch_b
    const v1, 0xbe7f

    :goto_4
    const v2, 0xbe90

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_3

    goto :goto_4

    :cond_3
    :sswitch_c
    const v1, 0xbebd

    goto :goto_4

    :sswitch_d
    if-nez v0, :cond_3

    const v1, 0xbedc

    goto :goto_4

    :sswitch_e
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->۠ۤۨۧ()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    new-instance v2, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda17;

    invoke-direct {v2, v0}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda17;-><init>(Landroid/app/Activity;)V

    invoke-static {v1, v2}, Landroidx/activity/ۣۦۡۥ;->۟ۢ۠ۥۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_2

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_7
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_6
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_8
        0xb918 -> :sswitch_b
        0xb939 -> :sswitch_a
        0xb97b -> :sswitch_9
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_c
        0x2d -> :sswitch_e
        0x4c -> :sswitch_6
        0xef -> :sswitch_d
    .end sparse-switch
.end method

.method private static doTtsReplace(Landroid/app/Activity;)V
    .locals 4

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۥۨ۠()Ljava/lang/String;

    move-result-object v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    new-instance v0, Ljava/io/File;

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۥۨ۠()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Landroidx/vectordrawable/ۢۤۡۤ;->ۡ۠ۤ۠(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :sswitch_7
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۥۨ۠()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->۠ۤۨۧ()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    new-instance v2, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda41;

    invoke-direct {v2, p0, v0}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda41;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    invoke-static {v1, v2}, Landroidx/activity/ۣۦۡۥ;->۟ۢ۠ۥۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_3
    return-void

    :sswitch_8
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v1, 0x175

    sget v2, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۨۥۦ۟:I

    xor-int/lit16 v2, v2, 0x280

    const/16 v3, 0xae2

    invoke-static {v0, v1, v2, v3}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۦۥۢ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lkevin/fun/hook/VoiceAssistantHook;->ۣ۟۟ۡۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_3

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_8
    .end sparse-switch
.end method

.method private static downloadAudioFile(Ljava/lang/String;Landroid/widget/TextView;)V
    .locals 4

    const/4 v1, 0x0

    const-string v3, "\u06e7\u06e4\u06e8"

    move-object v0, v1

    move-object v2, v1

    :goto_0
    invoke-static {v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->۠ۤۨۧ()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    const-string v3, "\u06e2\u06e1\u06e3"

    move-object v2, v1

    goto :goto_0

    :sswitch_0
    invoke-static {v2, v0}, Landroidx/activity/ۣۦۡۥ;->۟ۢ۠ۥۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e3\u06e2\u06e6"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    new-instance v0, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda40;

    invoke-direct {v0, p0, p1}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda40;-><init>(Ljava/lang/String;Landroid/widget/TextView;)V

    const-string v1, "\u06e6\u06e7\u06df"

    move-object v3, v1

    goto :goto_0

    :sswitch_2
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1ab284 -> :sswitch_1
        0x1ab667 -> :sswitch_2
        0x1ac23e -> :sswitch_0
    .end sparse-switch
.end method

.method private static dpToPx(Landroid/content/Context;F)I
    .locals 2

    const/high16 v1, 0x3f000000    # 0.5f

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez p0, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const/high16 v0, 0x40400000    # 3.0f

    mul-float/2addr v0, p1

    add-float/2addr v0, v1

    float-to-int v0, v0

    :goto_1
    return v0

    :sswitch_3
    invoke-static {p0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۨ۟ۨ(Ljava/lang/Object;)Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {v0}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟۟ۤۦۤ(Ljava/lang/Object;)Landroid/util/DisplayMetrics;

    move-result-object v0

    invoke-static {v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۦۡۧ(Ljava/lang/Object;)F

    move-result v0

    mul-float/2addr v0, p1

    add-float/2addr v0, v1

    float-to-int v0, v0

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method private static getAudioDirUri(Landroid/content/Context;)Landroid/net/Uri;
    .locals 6

    const/4 v0, 0x0

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v1

    const/16 v2, 0x182

    sget v3, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    xor-int/lit16 v3, v3, 0x25c

    const/16 v4, 0x716

    invoke-static {v1, v2, v3, v4}, Landroidx/loader/ۢۥ۟;->۟ۧ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {p0, v1, v2}, Landroidx/drawerlayout/ۤۨۡۤ;->۠ۡۤۨ(Ljava/lang/Object;Ljava/lang/Object;I)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v2

    const/16 v3, 0x191

    sget v4, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۥۨ:I

    xor-int/lit16 v4, v4, 0x289

    const/16 v5, 0xb5a

    invoke-static {v2, v3, v4, v5}, Landroidx/interpolator/۟ۧۦ۟ۨ;->۠ۤۤۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Landroidx/loader/ۡۢۢ;->ۢۨۥ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v1, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez v2, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v1, 0x6eb

    goto :goto_1

    :sswitch_4
    invoke-static {v2}, Landroidx/activity/ۣۦۡۥ;->۟ۡۦۧۥ(Ljava/lang/Object;)Landroid/net/Uri;

    move-result-object v0

    :sswitch_5
    return-object v0

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_5
    .end sparse-switch
.end method

.method public static initWithContext(Landroid/content/Context;)V
    .locals 6

    :try_start_0
    invoke-static {p0}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۤ۠ۡ(Ljava/lang/Object;)V

    const/4 v0, 0x0

    invoke-static {v0}, Lkevin/fun/hook/VoiceAssistantHook;->۟ۥۨۢۧ(Ljava/lang/Object;)V

    const/4 v0, 0x1

    sput-boolean v0, Lkevin/fun/hook/VoiceAssistantHook;->isInitialized:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :goto_1
    :sswitch_0
    return-void

    :sswitch_1
    const/16 v0, 0x66f

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۦۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v2

    const/16 v3, 0x19e

    sget v4, Landroidx/activity/ۦۧۥۥ;->۟ۦۢۧۤ:I

    xor-int/lit8 v4, v4, -0x25

    const/16 v5, 0x3f7

    invoke-static {v2, v3, v4, v5}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۦۤۢۦ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۨ۟(Ljava/lang/Object;)V

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
    .end sparse-switch
.end method

.method static synthetic lambda$0(Landroid/content/Context;)V
    .locals 2

    invoke-static {p0}, Lkevin/fun/hook/VoiceAssistantHook;->ۨۥۧۦ(Ljava/lang/Object;)V

    invoke-static {}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۣۨۧۥ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "oM3NjD7JEMi50oCTLbkZz2pBHkIBN"

    invoke-static {v0}, Landroidx/startup/ۤۧۥۣ;->۟ۡ۟ۡۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method static synthetic lambda$1(Landroid/app/Activity;)V
    .locals 2

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۤۧۡۨ()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda8;

    invoke-direct {v1, p0}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda8;-><init>(Landroid/app/Activity;)V

    invoke-static {v0, v1}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method static synthetic lambda$10(Landroid/app/Activity;Landroid/view/View;)V
    .locals 6

    :try_start_0
    new-instance v0, Landroid/content/Intent;

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v1

    const/16 v2, 0x1ae

    sget v3, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    xor-int/lit16 v3, v3, -0x244

    const/16 v4, 0x8b4

    invoke-static {v1, v2, v3, v4}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۦۥۢ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v2

    const/16 v3, 0x1c8

    sget v4, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣ۠ۢۢ:I

    xor-int/lit8 v4, v4, -0x62

    const/16 v5, 0x985

    invoke-static {v2, v3, v4, v5}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠۠ۧۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroidx/activity/ۣۦۡۥ;->۟ۡۦۧۥ(Ljava/lang/Object;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-static {p0, v0}, Landroidx/core/ktx/۟۟ۨۧ۠;->ۣ۟ۧۢ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :goto_1
    :sswitch_0
    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۣ۟ۦۣۤ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_2
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_2

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x729

    goto :goto_2

    :sswitch_2
    const/16 v0, 0x66f

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v1, 0x1d7

    sget v2, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۣۧۢ:I

    xor-int/lit16 v2, v2, -0x3d8

    const/16 v3, 0x51f

    invoke-static {v0, v1, v2, v3}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۦ۠ۧۨ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lkevin/fun/hook/VoiceAssistantHook;->ۣ۟۟ۡۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    :sswitch_3
    const/16 v0, 0x70a

    goto :goto_2

    :sswitch_4
    const-string v0, "W7"

    invoke-static {v0}, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۧۤ۟ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_1
        0x36 -> :sswitch_3
        0x1d7 -> :sswitch_5
        0x1f4 -> :sswitch_4
    .end sparse-switch
.end method

.method static synthetic lambda$11(Landroid/widget/EditText;Landroid/app/Activity;Landroid/app/Dialog;Landroid/view/View;)V
    .locals 9

    const/4 v6, 0x0

    const/4 v1, 0x0

    const-string v8, "\u06e7\u06e8\u06df"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move v5, v6

    move v7, v6

    :goto_0
    invoke-static {v8}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {v3}, Landroidx/startup/ۤۧۥۣ;->۟۠ۧۨۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e7\u06e4\u06e1"

    move-object v4, v1

    move-object v8, v6

    goto :goto_0

    :sswitch_0
    invoke-static {p1, v4}, Lkevin/fun/hook/VoiceAssistantHook;->ۣ۟۟ۡۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e3\u06e3\u06e1"

    move-object v8, v1

    goto :goto_0

    :sswitch_1
    sget v1, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۧ۠۠ۡ:I

    const-string v6, "\u06e2\u06e3\u06e0"

    move v5, v1

    move-object v8, v6

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/drawerlayout/ۤۨۡۤ;->۟۠۟ۡۡ(Ljava/lang/Object;)Landroid/text/Editable;

    move-result-object v1

    const-string v6, "\u06e4\u06e2\u06e8"

    move-object v3, v1

    move-object v8, v6

    goto :goto_0

    :sswitch_3
    xor-int/lit16 v6, v5, 0x128

    const-string v1, "\u06e7\u06e4\u06df"

    move v7, v6

    move-object v8, v1

    goto :goto_0

    :sswitch_4
    const/16 v1, 0x1e8

    const/16 v4, 0xbd4

    invoke-static {v0, v1, v7, v4}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۧۨۦۦ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06df\u06e6\u06e1"

    move-object v4, v1

    move-object v8, v6

    goto :goto_0

    :sswitch_5
    invoke-static {p2}, Landroidx/customview/ۡۤۡۤ;->ۧۢۡۧ(Ljava/lang/Object;)V

    const-string v1, "\u06e8\u06e1\u06e3"

    move-object v8, v1

    goto :goto_0

    :sswitch_6
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const-string v1, "\u06e6\u06e5\u06e7"

    move-object v8, v1

    goto :goto_0

    :sswitch_7
    invoke-static {p1, v2}, Lkevin/fun/hook/VoiceAssistantHook;->ۧ۟ۢۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e7\u06e3\u06e2"

    move-object v8, v1

    goto :goto_0

    :sswitch_8
    invoke-static {v4}, Landroidx/documentfile/ۡۢ۟ۥ;->۠۠ۦۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e0\u06e1\u06e8"

    move-object v2, v1

    move-object v8, v6

    goto :goto_0

    :sswitch_9
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa7da -> :sswitch_0
        0x1aab07 -> :sswitch_7
        0x1ab2bf -> :sswitch_3
        0x1ab681 -> :sswitch_5
        0x1ac208 -> :sswitch_1
        0x1ac586 -> :sswitch_6
        0x1ac5a2 -> :sswitch_4
        0x1ac5a4 -> :sswitch_8
        0x1ac61e -> :sswitch_2
        0x1ac90a -> :sswitch_9
    .end sparse-switch
.end method

.method static synthetic lambda$12(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Landroidx/customview/ۡۤۡۤ;->ۧۢۡۧ(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic lambda$13(Landroid/widget/EditText;Landroid/app/Activity;Landroid/widget/TextView;Landroid/view/View;)V
    .locals 4

    invoke-static {p0}, Landroidx/drawerlayout/ۤۨۡۤ;->۟۠۟ۡۡ(Ljava/lang/Object;)Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Landroidx/startup/ۤۧۥۣ;->۟۠ۧۨۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/documentfile/ۡۢ۟ۥ;->۠۠ۦۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroidx/documentfile/ۡۢ۟ۥ;->ۢۥۦۣ(Ljava/lang/Object;)Z

    move-result v2

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v2, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v1, 0x1f6

    sget v2, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢ۟ۥ:I

    xor-int/lit16 v2, v2, 0x17d

    const/16 v3, 0xb6b

    invoke-static {v0, v1, v2, v3}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۧ۟ۧۢ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkevin/fun/hook/VoiceAssistantHook;->ۣ۟۟ۡۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_1
    :sswitch_3
    return-void

    :sswitch_4
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->۠۟ۥۦ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/documentfile/ۡۢ۟ۥ;->ۢۥۦۣ(Ljava/lang/Object;)Z

    move-result v2

    const/16 v0, 0x6cc

    :goto_2
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_2

    :sswitch_5
    if-eqz v2, :cond_1

    const/16 v0, 0x729

    goto :goto_2

    :cond_1
    :sswitch_6
    const/16 v0, 0x70a

    goto :goto_2

    :sswitch_7
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v1, 0x1ff

    sget v2, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢ۟ۥ:I

    xor-int/lit16 v2, v2, 0x164

    const/16 v3, 0x8ac

    invoke-static {v0, v1, v2, v3}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣ۟۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkevin/fun/hook/VoiceAssistantHook;->ۣ۟۟ۡۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Landroidx/appcompat/ۣۧۤۢ;->ۢ۟۟ۨ()I

    move-result v1

    const/16 v0, 0x748

    :goto_3
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_3

    :sswitch_8
    if-ltz v1, :cond_2

    const v0, 0xbe60

    goto :goto_3

    :cond_2
    :sswitch_9
    const v0, 0xbe41

    goto :goto_3

    :sswitch_a
    const-string v0, "ZmyK7ilrvhJs"

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۤۡۥۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    goto :goto_1

    :sswitch_b
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۣۢۢۤ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/documentfile/ۡۢ۟ۥ;->ۢۥۦۣ(Ljava/lang/Object;)Z

    move-result v2

    const v0, 0xbe7f

    :goto_4
    const v3, 0xbe90

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_3

    goto :goto_4

    :cond_3
    :sswitch_c
    const v0, 0xbebd

    goto :goto_4

    :sswitch_d
    if-eqz v2, :cond_3

    const v0, 0xbedc

    goto :goto_4

    :sswitch_e
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v1, 0x20f

    sget v2, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۥۧ۟:I

    xor-int/lit8 v2, v2, 0x15

    const/16 v3, 0x18e

    invoke-static {v0, v1, v2, v3}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣ۟۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkevin/fun/hook/VoiceAssistantHook;->ۣ۟۟ۡۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_1

    :sswitch_f
    invoke-static {v1, p2}, Lkevin/fun/hook/VoiceAssistantHook;->۟ۢۤ۠ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_6
        0x1d7 -> :sswitch_b
        0x1f4 -> :sswitch_7
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_8
        0xb918 -> :sswitch_3
        0xb939 -> :sswitch_a
        0xb97b -> :sswitch_9
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_c
        0x2d -> :sswitch_f
        0x4c -> :sswitch_e
        0xef -> :sswitch_d
    .end sparse-switch
.end method

.method static synthetic lambda$14(Landroid/app/Activity;Landroid/view/View;)V
    .locals 4

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۥۨ۠()Ljava/lang/String;

    move-result-object v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    new-instance v0, Ljava/io/File;

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۥۨ۠()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Landroidx/vectordrawable/ۢۤۡۤ;->ۡ۠ۤ۠(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۥۨ۠()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lkevin/fun/hook/VoiceAssistantHook;->۟ۨ۠۠(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :sswitch_7
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v1, 0x215

    sget v2, Lkevin/fun/hook/۟ۥ۠۠;->ۢۦۧۧ:I

    xor-int/lit16 v2, v2, -0x1cd

    const/16 v3, 0xc91

    invoke-static {v0, v1, v2, v3}, Landroidx/core/ktx/۟۟ۡۢ۠;->۟ۢۦۧ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lkevin/fun/hook/VoiceAssistantHook;->ۣ۟۟ۡۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_8
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_7
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_8
    .end sparse-switch
.end method

.method static synthetic lambda$15(Landroid/app/Activity;Landroid/view/View;)V
    .locals 4

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۥۨ۠()Ljava/lang/String;

    move-result-object v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    new-instance v0, Ljava/io/File;

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۥۨ۠()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Landroidx/vectordrawable/ۢۤۡۤ;->ۡ۠ۤ۠(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {p0}, Lkevin/fun/hook/VoiceAssistantHook;->ۣۢۤۤ(Ljava/lang/Object;)V

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :sswitch_7
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v1, 0x21d

    sget v2, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    xor-int/lit8 v2, v2, 0x5a

    const/16 v3, 0x8bb

    invoke-static {v0, v1, v2, v3}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣۣ۟ۤۤ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lkevin/fun/hook/VoiceAssistantHook;->ۣ۟۟ۡۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_8
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_7
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_8
    .end sparse-switch
.end method

.method static synthetic lambda$16(Ljava/lang/String;Landroid/widget/TextView;)V
    .locals 8

    :try_start_0
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v2, 0x225

    sget v3, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    xor-int/lit16 v3, v3, -0x106

    const/16 v4, 0x86f

    invoke-static {v0, v2, v3, v4}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۦۧۦ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->۠۟ۥۦ()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v4

    const/16 v5, 0x232

    sget v6, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۨۤۨۡ:I

    xor-int/lit16 v6, v6, -0x3a3

    const/16 v7, 0x9db

    invoke-static {v4, v5, v6, v7}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۦۧۦ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v3, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v0, v2}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۣۢۢۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v2, 0x239

    sget v3, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣ۠ۢۢ:I

    xor-int/lit8 v3, v3, -0x65

    const/16 v4, 0xcb5

    invoke-static {v0, v2, v3, v4}, Landroidx/activity/ۨ۠۟ۧ;->۟ۡۨۨۧ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v2

    const/16 v3, 0x243

    sget v4, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    xor-int/lit16 v4, v4, -0x304

    const/16 v5, 0x37f

    invoke-static {v2, v3, v4, v5}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦۣ۠ۤ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v0, v2}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۣۢۢۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v2, 0x264

    sget v3, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۡۨۨۧ:I

    xor-int/lit16 v3, v3, -0x1ec

    const/16 v4, 0x506

    invoke-static {v0, v2, v3, v4}, Landroidx/loader/ۡۢۢ;->ۡ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v2

    const/16 v3, 0x270

    sget v4, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    xor-int/lit16 v4, v4, 0x23e

    const/16 v5, 0x1ee

    invoke-static {v2, v3, v4, v5}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۤۦۢۧ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v0, v2}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۣۢۢۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v4

    const/16 v5, 0x280

    sget v6, Lkevin/fun/hook/۟ۥ۠۠;->ۢۦۧۧ:I

    xor-int/lit16 v6, v6, -0x1c4

    const/16 v7, 0x20d

    invoke-static {v4, v5, v6, v7}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۡۤۥ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۣۢۢۤ()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v4, v5}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v4

    const/16 v5, 0x287

    sget v6, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۡۨۨۧ:I

    xor-int/lit16 v6, v6, -0x1e4

    const/16 v7, 0x75b

    invoke-static {v4, v5, v6, v7}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۢۥ۠۟([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4, p0}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {v2, v3}, Landroidx/activity/ۣۦۡۥ;->۟ۥۨۨۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONArray;

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v3

    const/16 v4, 0x28b

    sget v5, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    xor-int/lit16 v5, v5, 0x171

    const/16 v6, 0x16d

    invoke-static {v3, v4, v5, v6}, Landroidx/activity/ۣۦۡۥ;->۟ۡۨ۟۟([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3, v2}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v2

    const/16 v3, 0x293

    sget v4, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    xor-int/lit16 v4, v4, -0x216

    const/16 v5, 0xa48

    invoke-static {v2, v3, v4, v5}, Lorg/luckypray/dexkit/۠۠ۥ;->۟ۥۧۦ۠([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->۟ۢۢۤۦ()I

    move-result v3

    invoke-static {v0, v2, v3}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۡ۟ۤۦ(Ljava/lang/Object;Ljava/lang/Object;I)Lorg/json/JSONObject;

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v2

    const/16 v3, 0x29d

    sget v4, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۨۤۨۡ:I

    xor-int/lit16 v4, v4, -0x3ab

    const/16 v5, 0x66b

    invoke-static {v2, v3, v4, v5}, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۡۨۧ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟۟۟ۤ()I

    move-result v3

    invoke-static {v0, v2, v3}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۡ۟ۤۦ(Ljava/lang/Object;Ljava/lang/Object;I)Lorg/json/JSONObject;

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v2

    const/16 v3, 0x2ac

    sget v4, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    xor-int/lit8 v4, v4, 0x51

    const/16 v5, 0x155

    invoke-static {v2, v3, v4, v5}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۢۦۣ۠([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->۟ۥۣ۠()I

    move-result v3

    invoke-static {v0, v2, v3}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۡ۟ۤۦ(Ljava/lang/Object;Ljava/lang/Object;I)Lorg/json/JSONObject;

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v2

    const/16 v3, 0x2c4

    sget v4, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    xor-int/lit16 v4, v4, 0x16a

    const/16 v5, 0x240

    invoke-static {v2, v3, v4, v5}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣ۟۠ۢۡ([SIII)Ljava/lang/String;

    move-result-object v2

    sget v3, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣ۠ۢۢ:I

    xor-int/lit8 v3, v3, -0x6c

    invoke-static {v0, v2, v3}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۡ۟ۤۦ(Ljava/lang/Object;Ljava/lang/Object;I)Lorg/json/JSONObject;

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v2

    const/16 v3, 0x2d0

    sget v4, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۤۨۨ:I

    xor-int/lit16 v4, v4, 0x107

    const/16 v5, 0xb3a

    invoke-static {v2, v3, v4, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟ۡۧۨ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۣ۟ۡۢ۟()Z

    move-result v3

    invoke-static {v0, v2, v3}, Landroidx/activity/ۦۧۥۥ;->ۡۨ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;Z)Lorg/json/JSONObject;

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v2

    const/16 v3, 0x2db

    sget v4, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    xor-int/lit8 v4, v4, 0x77

    const/16 v5, 0xa63

    invoke-static {v2, v3, v4, v5}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۨۤ۠۠([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۨۤۢۤ()Z

    move-result v3

    invoke-static {v0, v2, v3}, Landroidx/activity/ۦۧۥۥ;->ۡۨ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;Z)Lorg/json/JSONObject;

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v2

    const/16 v3, 0x2e0

    sget v4, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۤ۟ۨ:I

    xor-int/lit16 v4, v4, -0x1a9

    const/16 v5, 0x790

    invoke-static {v2, v3, v4, v5}, Landroidx/core/ۧ۟ۤۨ;->ۡۥ۟ۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۣۣۧ۠()Z

    move-result v3

    invoke-static {v0, v2, v3}, Landroidx/activity/ۦۧۥۥ;->ۡۨ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;Z)Lorg/json/JSONObject;

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v2

    const/16 v3, 0x2e7

    sget v4, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    xor-int/lit8 v4, v4, 0x74

    const/16 v5, 0x676

    invoke-static {v2, v3, v4, v5}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣۣ۟ۤۤ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۥۣۤۡ()Z

    move-result v3

    invoke-static {v0, v2, v3}, Landroidx/activity/ۦۧۥۥ;->ۡۨ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;Z)Lorg/json/JSONObject;

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v2

    const/16 v3, 0x2ed

    sget v4, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v4, v4, 0x125

    const/16 v5, 0x181

    invoke-static {v2, v3, v4, v5}, Landroidx/loader/ۡۢۢ;->ۡ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۥۨۨۨ()Z

    move-result v3

    invoke-static {v0, v2, v3}, Landroidx/activity/ۦۧۥۥ;->ۡۨ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;Z)Lorg/json/JSONObject;

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v2

    const/16 v3, 0x2f0

    sget v4, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۥۧ۟:I

    xor-int/lit8 v4, v4, 0x17

    const/16 v5, 0x94b

    invoke-static {v2, v3, v4, v5}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۢۥ۠۟([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۥۣ۟ۡ()I

    move-result v3

    invoke-static {v0, v2, v3}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۡ۟ۤۦ(Ljava/lang/Object;Ljava/lang/Object;I)Lorg/json/JSONObject;

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v2

    const/16 v3, 0x2f4

    sget v4, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۡۨۨۧ:I

    xor-int/lit16 v4, v4, -0x1c1

    const/16 v5, 0xa5e

    invoke-static {v2, v3, v4, v5}, Landroidx/startup/ۤۧۥۣ;->۟ۧۦ۠ۦ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, Landroidx/viewpager/ۣۢ۟ۤ;->ۣۧۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0, v1}, Lkevin/fun/hook/VoiceAssistantHook;->ۤ۟ۧ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v2, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v3, 0x31b

    sget v4, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    xor-int/lit16 v4, v4, 0xcf

    const/16 v5, 0x8b8

    invoke-static {v0, v3, v4, v5}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣۣ۟ۤۤ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v3, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :sswitch_7
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v2, 0x327

    sget v4, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    xor-int/lit16 v4, v4, 0x3a6

    const/16 v5, 0x877

    invoke-static {v0, v2, v4, v5}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۢۤۤ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v2

    const v0, 0xbe7f

    :goto_3
    const v4, 0xbe90

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_8
    const v0, 0xbebd

    goto :goto_3

    :sswitch_9
    const/16 v0, 0xc8

    if-ne v2, v0, :cond_2

    const v0, 0xbedc

    goto :goto_3

    :sswitch_a
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v2, 0x32d

    sget v4, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    xor-int/lit16 v4, v4, 0x2fa

    const/16 v5, 0x6df

    invoke-static {v0, v2, v4, v5}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۦۧۦ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۡۦۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v2

    const/16 v3, 0x331

    sget v4, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    xor-int/lit16 v4, v4, -0x3c2

    const/16 v5, 0xca6

    invoke-static {v2, v3, v4, v5}, Lorg/luckypray/dexkit/۠۠ۥ;->۟ۥۧۦ۠([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroidx/loader/ۡۢۢ;->ۨۥۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1, p1}, Lkevin/fun/hook/VoiceAssistantHook;->ۣۨۡۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0xbefb

    :goto_4
    const v1, 0xbf0c

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :goto_5
    :pswitch_0
    :sswitch_b
    return-void

    :sswitch_c
    const v0, 0xbf1a

    goto :goto_4

    :sswitch_d
    const v0, 0xc202

    :goto_6
    const v1, 0xc213

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :sswitch_e
    const/16 v0, 0x191

    if-ne v2, v0, :cond_3

    const v0, 0xc25f

    goto :goto_6

    :cond_3
    :sswitch_f
    const v0, 0xc240

    goto :goto_6

    :sswitch_10
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۤۧۡۨ()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda43;

    invoke-direct {v1, p1}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda43;-><init>(Landroid/widget/TextView;)V

    invoke-static {v0, v1}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    const v0, 0xc27e

    :goto_7
    const v1, 0xc28f

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_6

    goto :goto_7

    :sswitch_11
    const v0, 0xc29d

    goto :goto_7

    :sswitch_12
    const v0, 0xc2fa

    :goto_8
    const v1, 0xc30b

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_7

    goto :goto_8

    :sswitch_13
    const/16 v0, 0x193

    if-ne v2, v0, :cond_4

    const v0, 0xc5e2

    goto :goto_8

    :cond_4
    :sswitch_14
    const v0, 0xc5c3

    goto :goto_8

    :sswitch_15
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v1, 0x333

    sget v2, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣ۠ۧ:I

    xor-int/lit16 v2, v2, -0x1ed

    const/16 v4, 0x322

    invoke-static {v0, v1, v2, v4}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣۣ۟ۤۤ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v0, v1}, Landroidx/loader/۟۠ۢۧۡ;->ۣ۟ۨ۠۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v2, 0x33a

    sget v3, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    xor-int/lit16 v3, v3, -0x332

    const/16 v4, 0x9c6

    invoke-static {v0, v2, v3, v4}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۨۤ۠۠([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const v0, 0xc601

    :goto_9
    const v3, 0xc612

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_8

    goto :goto_9

    :sswitch_16
    if-eqz v2, :cond_5

    const v0, 0xc65e

    goto :goto_9

    :cond_5
    :sswitch_17
    const v0, 0xc63f

    goto :goto_9

    :sswitch_18
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۤۧۡۨ()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda44;

    invoke-direct {v1, p1}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda44;-><init>(Landroid/widget/TextView;)V

    invoke-static {v0, v1}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    const v0, 0xc67d

    :goto_a
    const v1, 0xc68e

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_9

    goto :goto_a

    :sswitch_19
    const v0, 0xc69c

    goto :goto_a

    :sswitch_1a
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۤۧۡۨ()Landroid/os/Handler;

    move-result-object v0

    new-instance v2, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda45;

    invoke-direct {v2, p1, v1}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda45;-><init>(Landroid/widget/TextView;Ljava/lang/String;)V

    invoke-static {v0, v2}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    const v0, 0xc984

    :goto_b
    const v1, 0xc995

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_a

    goto :goto_b

    :sswitch_1b
    const v0, 0xc9a3

    goto :goto_b

    :sswitch_1c
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۤۧۡۨ()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda46;

    invoke-direct {v1, p1, v3}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda46;-><init>(Landroid/widget/TextView;Lorg/json/JSONObject;)V

    invoke-static {v0, v1}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    const v0, 0xca00

    :goto_c
    const v1, 0xca11

    xor-int/2addr v0, v1

    packed-switch v0, :pswitch_data_0

    :pswitch_1
    goto :goto_c

    :pswitch_2
    const v0, 0xca1f

    goto :goto_c

    :sswitch_1d
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۤۧۡۨ()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda42;

    invoke-direct {v1, p1}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda42;-><init>(Landroid/widget/TextView;)V

    invoke-static {v0, v1}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_5

    :catch_0
    move-exception v0

    invoke-static {v0}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۤ۟۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v3

    const/16 v4, 0x34d

    sget v5, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/lit16 v5, v5, 0x30f

    const/16 v6, 0x35e

    invoke-static {v3, v4, v5, v6}, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۥۧۤ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۨ۟(Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۤۧۡۨ()Landroid/os/Handler;

    move-result-object v1

    new-instance v2, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda1;

    invoke-direct {v2, p1, v0}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda1;-><init>(Landroid/widget/TextView;Ljava/lang/Exception;)V

    invoke-static {v1, v2}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto/16 :goto_5

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_1d
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_1d
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_8
        0x2d -> :sswitch_d
        0x4c -> :sswitch_a
        0xef -> :sswitch_9
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_b
        0x1f7 -> :sswitch_c
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_e
        0x32 -> :sswitch_f
        0x4c -> :sswitch_10
        0x53 -> :sswitch_12
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_b
        0xf1 -> :sswitch_11
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_13
        0x6af -> :sswitch_14
        0x6c8 -> :sswitch_1c
        0x6e9 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_16
        0x2d -> :sswitch_1a
        0x32 -> :sswitch_17
        0x4c -> :sswitch_18
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_b
        0xf3 -> :sswitch_19
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1b
        0x36 -> :sswitch_b
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic lambda$17(Landroid/widget/TextView;)V
    .locals 7

    const/4 v1, 0x0

    const/4 v5, 0x0

    const-string v3, "\u06e4\u06e2\u06e2"

    move-object v0, v1

    move-object v2, v1

    move v4, v5

    move v6, v5

    :goto_0
    invoke-static {v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    return-void

    :sswitch_0
    xor-int/lit16 v4, v6, 0x388

    const-string v1, "\u06e1\u06e2\u06e4"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    invoke-static {p0, v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e0\u06e6\u06e7"

    move-object v3, v1

    goto :goto_0

    :sswitch_2
    const/16 v0, 0x35d

    const/16 v1, 0x54a

    invoke-static {v2, v0, v4, v1}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۦۤۢۦ([SIII)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e3\u06e7\u06e3"

    move-object v3, v1

    goto :goto_0

    :sswitch_3
    sget v5, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    const-string v1, "\u06e1\u06e5\u06e2"

    move-object v3, v1

    move v6, v5

    goto :goto_0

    :sswitch_4
    sget v5, Landroidx/activity/ۨ۠۟ۧ;->۟ۦۥۢۢ:I

    const-string v1, "\u06e8\u06e6\u06e2"

    move-object v3, v1

    move v6, v5

    goto :goto_0

    :sswitch_5
    invoke-static {p0, v4}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const-string v1, "\u06e6\u06e5\u06e7"

    move-object v3, v1

    goto :goto_0

    :sswitch_6
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v1

    const-string v3, "\u06e3\u06e3\u06e1"

    move-object v2, v1

    goto :goto_0

    :sswitch_7
    const v1, -0xfccb

    xor-int v4, v1, v6

    const-string v1, "\u06e6\u06e5\u06e6"

    move-object v3, v1

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aaba1 -> :sswitch_4
        0x1aaee3 -> :sswitch_2
        0x1aaf3e -> :sswitch_0
        0x1ab681 -> :sswitch_3
        0x1ab6ff -> :sswitch_1
        0x1aba24 -> :sswitch_6
        0x1ac207 -> :sswitch_5
        0x1ac9a4 -> :sswitch_7
    .end sparse-switch
.end method

.method static synthetic lambda$18(Landroid/widget/TextView;)V
    .locals 7

    const/4 v1, 0x0

    const/4 v5, 0x0

    const-string v3, "\u06e1\u06df"

    move-object v0, v1

    move-object v2, v1

    move v4, v5

    move v6, v5

    :goto_0
    invoke-static {v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    sget v4, Landroidx/activity/ۤۧۧۧ;->۟۟ۢ۠ۡ:I

    const-string v1, "\u06df\u06e1\u06e2"

    move-object v3, v1

    goto :goto_0

    :sswitch_0
    invoke-static {p0, v6}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const-string v1, "\u06e2\u06e5\u06e7"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    invoke-static {p0, v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e3\u06e5\u06df"

    move-object v3, v1

    goto :goto_0

    :sswitch_2
    sget v4, Landroidx/startup/۟ۦۤۨۧ;->ۧۡۡۦ:I

    const-string v1, "\u06e6\u06e2\u06e3"

    move-object v3, v1

    goto :goto_0

    :sswitch_3
    xor-int/lit16 v5, v4, 0x1e1

    const-string v1, "\u06e2\u06e6\u06e5"

    move-object v3, v1

    move v6, v5

    goto :goto_0

    :sswitch_4
    const/16 v0, 0x367

    const/16 v1, 0xaa3

    invoke-static {v2, v0, v6, v1}, Landroidx/core/ۤۦ۟ۢ;->ۣۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e0\u06e6"

    move-object v3, v1

    goto :goto_0

    :sswitch_5
    const v1, 0xfeea

    xor-int v5, v1, v4

    const-string v1, "\u06e6\u06df\u06e4"

    move-object v3, v1

    move v6, v5

    goto :goto_0

    :sswitch_6
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v1

    const-string v3, "\u06e8\u06e8"

    move-object v2, v1

    goto :goto_0

    :sswitch_7
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc06 -> :sswitch_1
        0xdc1e -> :sswitch_6
        0x1aa740 -> :sswitch_3
        0x1ab304 -> :sswitch_7
        0x1ab321 -> :sswitch_4
        0x1ab6bd -> :sswitch_2
        0x1ac14b -> :sswitch_0
        0x1ac1a7 -> :sswitch_5
    .end sparse-switch
.end method

.method static synthetic lambda$19(Landroid/widget/TextView;)V
    .locals 4

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v1, 0x372

    sget v2, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    xor-int/lit16 v2, v2, 0x16e

    const/16 v3, 0xae7

    invoke-static {v0, v1, v2, v3}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۤۦۢۧ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0xffcb

    sget v1, Landroidx/activity/ۦۧۥۥ;->۟ۦۢۧۤ:I

    xor-int/2addr v0, v1

    invoke-static {p0, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    invoke-static {}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟ۡۤۦ۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "GMcezWrRmUbiloeP8"

    invoke-static {v0}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۥۧۨ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

    :sswitch_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method static synthetic lambda$2(Landroid/app/Activity;)V
    .locals 0

    invoke-static {p0}, Lkevin/fun/hook/VoiceAssistantHook;->ۢ۟ۥۦ(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic lambda$20(Landroid/widget/TextView;Ljava/lang/String;)V
    .locals 9

    const/4 v7, 0x0

    const/4 v1, 0x0

    const-string v5, "\u06e1\u06e7\u06e5"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move v6, v7

    move v8, v7

    :goto_0
    invoke-static {v5}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\u06e3\u06e7\u06e5"

    move-object v3, v1

    goto :goto_0

    :sswitch_0
    invoke-static {v0, p1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v5, "\u06e8\u06e6\u06e6"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    const/16 v1, 0x37a

    const/16 v4, 0x401

    invoke-static {v2, v1, v8, v4}, Landroidx/core/ktx/۟۟ۡۢ۠;->۟ۢۦۧ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v5, "\u06e3\u06df\u06df"

    move-object v4, v1

    goto :goto_0

    :sswitch_2
    invoke-static {v3}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v5, "\u06e4\u06e1\u06df"

    move-object v4, v1

    goto :goto_0

    :sswitch_3
    sget v6, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    const-string v1, "\u06e2\u06e5\u06e7"

    move-object v5, v1

    goto :goto_0

    :sswitch_4
    invoke-static {p0, v4}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e0\u06e5\u06e5"

    move-object v5, v1

    goto :goto_0

    :sswitch_5
    invoke-static {v3, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\u06e0\u06e7\u06e6"

    move-object v5, v1

    goto :goto_0

    :sswitch_6
    const v1, 0xfde0

    xor-int v7, v1, v6

    const-string v1, "\u06e0\u06e0\u06e6"

    move-object v5, v1

    move v8, v7

    goto :goto_0

    :sswitch_7
    sget v6, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    const-string v1, "\u06e5\u06e2\u06e0"

    move-object v5, v1

    goto :goto_0

    :sswitch_8
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v1

    const-string v5, "\u06e8\u06e0\u06e6"

    move-object v2, v1

    goto :goto_0

    :sswitch_9
    invoke-static {p0, v8}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const-string v1, "\u06e7\u06e8\u06e7"

    move-object v5, v1

    goto :goto_0

    :sswitch_a
    xor-int/lit16 v7, v6, 0x387

    const-string v1, "\u06df\u06e7\u06e5"

    move-object v5, v1

    move v8, v7

    goto :goto_0

    :sswitch_b
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa7fd -> :sswitch_1
        0x1aaae6 -> :sswitch_9
        0x1aab80 -> :sswitch_7
        0x1aabbf -> :sswitch_0
        0x1ab304 -> :sswitch_a
        0x1ab603 -> :sswitch_5
        0x1ab701 -> :sswitch_8
        0x1aba02 -> :sswitch_4
        0x1abde3 -> :sswitch_6
        0x1ac626 -> :sswitch_b
        0x1ac8ee -> :sswitch_3
        0x1ac9a8 -> :sswitch_2
    .end sparse-switch
.end method

.method static synthetic lambda$21(Landroid/widget/TextView;Lorg/json/JSONObject;)V
    .locals 6

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v1, 0x37f

    sget v2, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۡۦۥۨ:I

    xor-int/lit16 v2, v2, 0x119

    const/16 v3, 0xab5

    invoke-static {v0, v1, v2, v3}, Landroidx/activity/ۦۧۥۥ;->۟ۤۡۦۦ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v1

    const/16 v2, 0x386

    sget v3, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    xor-int/lit8 v3, v3, -0x72

    const/16 v4, 0xc95

    invoke-static {v1, v2, v3, v4}, Landroidx/customview/ۤۡۥ;->۟ۢۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1}, Landroidx/loader/۟۠ۢۧۡ;->ۣ۟ۨ۠۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v2

    const/16 v3, 0x38a

    sget v4, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    xor-int/lit8 v4, v4, 0x4c

    const/16 v5, 0x304

    invoke-static {v2, v3, v4, v5}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۨۦۣۨ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, -0xfd73

    sget v1, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۨۥۦ۟:I

    xor-int/2addr v0, v1

    invoke-static {p0, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    invoke-static {}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣۣ۟۠()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "TbJqqllY9"

    invoke-static {v0}, Landroidx/core/ktx/۟۟ۡۢ۠;->۟ۥ۟ۨ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method static synthetic lambda$22(Landroid/widget/TextView;Ljava/lang/Exception;)V
    .locals 10

    const/4 v8, 0x0

    const/4 v1, 0x0

    const-string v6, "\u06e7\u06e4\u06e7"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move v7, v8

    move v9, v8

    :goto_0
    invoke-static {v6}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    const v1, -0xfcf3

    xor-int v8, v1, v7

    const-string v1, "\u06e1\u06e2\u06e5"

    move-object v6, v1

    move v9, v8

    goto :goto_0

    :sswitch_0
    sget v7, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    const-string v1, "\u06e5\u06e6\u06e3"

    move-object v6, v1

    goto :goto_0

    :sswitch_1
    invoke-static {p1}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۤ۟۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e1\u06e8\u06e7"

    move-object v3, v1

    goto :goto_0

    :sswitch_2
    invoke-static {v5}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e8\u06e7\u06e4"

    move-object v4, v1

    goto :goto_0

    :sswitch_3
    const/16 v1, 0x38f

    const/16 v4, 0x632

    invoke-static {v0, v1, v9, v4}, Landroidx/core/ktx/۟۟ۡۢ۠;->۟ۢۦۧ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e4\u06e4\u06e3"

    move-object v4, v1

    goto :goto_0

    :sswitch_4
    xor-int/lit16 v8, v7, -0x328

    const-string v1, "\u06e6\u06df\u06e1"

    move-object v6, v1

    move v9, v8

    goto :goto_0

    :sswitch_5
    invoke-static {v5, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v6, "\u06df\u06e3\u06e4"

    move-object v2, v1

    goto :goto_0

    :sswitch_6
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\u06e4\u06e7\u06e3"

    move-object v5, v1

    goto :goto_0

    :sswitch_7
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const-string v1, "\u06e3\u06e4\u06e0"

    move-object v6, v1

    goto :goto_0

    :sswitch_8
    invoke-static {v2, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v6, "\u06e5\u06e2\u06e8"

    move-object v5, v1

    goto :goto_0

    :sswitch_9
    sget v7, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    const-string v1, "\u06df\u06e5\u06e0"

    move-object v6, v1

    goto :goto_0

    :sswitch_a
    invoke-static {p0, v9}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const-string v1, "\u06e5\u06e2\u06e4"

    move-object v6, v1

    goto :goto_0

    :sswitch_b
    invoke-static {p0, v4}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e6\u06e1\u06df"

    move-object v6, v1

    goto :goto_0

    :sswitch_c
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa780 -> :sswitch_8
        0x1aaee4 -> :sswitch_a
        0x1aafa0 -> :sswitch_6
        0x1ab69f -> :sswitch_0
        0x1aba63 -> :sswitch_5
        0x1abac0 -> :sswitch_7
        0x1abde7 -> :sswitch_c
        0x1abdeb -> :sswitch_2
        0x1abe62 -> :sswitch_4
        0x1ac148 -> :sswitch_3
        0x1ac184 -> :sswitch_9
        0x1ac5aa -> :sswitch_1
        0x1ac9c5 -> :sswitch_b
    .end sparse-switch
.end method

.method static synthetic lambda$23(Landroid/widget/TextView;)V
    .locals 4

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v1, 0x394

    sget v2, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣۡۢ۟:I

    xor-int/lit16 v2, v2, 0x32a

    const/16 v3, 0x53e

    invoke-static {v0, v1, v2, v3}, Landroidx/versionedparcelable/۠ۡۧۤ;->۟۟ۤۢۡ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0xfe3b

    sget v1, Lkevin/fun/hook/۟ۥ۠۠;->ۢۦۧۧ:I

    xor-int/2addr v0, v1

    invoke-static {p0, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    invoke-static {}, Landroidx/activity/ۨ۠۟ۧ;->ۤۥۡ۠()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "ikXRRKqN"

    invoke-static {v0}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->۟ۤۦۡۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method static synthetic lambda$24(Ljava/lang/String;Landroid/widget/TextView;)V
    .locals 13

    const/4 v12, -0x1

    const/4 v2, 0x0

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v1, 0x39c

    sget v3, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣ۠ۢۢ:I

    xor-int/lit8 v3, v3, -0x6b

    const/16 v4, 0x258

    invoke-static {v0, v1, v3, v4}, Landroidx/startup/ۤۧۥۣ;->۟ۧۦ۠ۦ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v1, 0x3a0

    sget v4, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    xor-int/lit8 v4, v4, 0x4d

    const/16 v5, 0xc90

    invoke-static {v0, v1, v4, v5}, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۥۧۤ([SIII)Ljava/lang/String;

    move-result-object v4

    :try_start_0
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۣۨۤۢ()Ljava/lang/ref/WeakReference;

    move-result-object v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۣۨۤۢ()Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟ۦ۟ۡ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v1, 0x6eb

    goto :goto_1

    :sswitch_4
    move-object v1, v0

    :goto_2
    const/16 v0, 0x748

    :goto_3
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_3

    :sswitch_5
    if-nez v1, :cond_1

    const v0, 0xbe60

    goto :goto_3

    :sswitch_6
    move-object v1, v2

    goto :goto_2

    :cond_1
    :sswitch_7
    const v0, 0xbe41

    goto :goto_3

    :sswitch_8
    invoke-static {}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟۟۠()I

    move-result v1

    const v0, 0xbe7f

    :goto_4
    const v2, 0xbe90

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_3

    goto :goto_4

    :cond_2
    :sswitch_9
    const v0, 0xbebd

    goto :goto_4

    :sswitch_a
    if-ltz v1, :cond_2

    const v0, 0xbedc

    goto :goto_4

    :sswitch_b
    const-string v0, "6XQgk"

    invoke-static {v0}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->۟ۧۦ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

    :goto_5
    :sswitch_c
    return-void

    :sswitch_d
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۡۨۢ(Ljava/lang/Object;)Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    sget v5, Lorg/luckypray/dexkit/۠۠ۥ;->ۣ۟ۡۢۡ:I

    xor-int/lit16 v5, v5, -0x3a7b

    invoke-static {v0, v5}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۧ۟ۦۥ(Ljava/lang/Object;I)V

    invoke-static {v0, v5}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣ۟۟ۦ(Ljava/lang/Object;I)V

    invoke-static {v0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۢۤۡۨ(Ljava/lang/Object;)V

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->۟ۦۡ۠ۡ()J

    move-result-wide v6

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v8

    const/16 v9, 0x3a4

    sget v10, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    xor-int/lit16 v10, v10, -0x32c

    const/16 v11, 0x83e

    invoke-static {v8, v9, v10, v11}, Landroidx/startup/۟ۦۤۨۧ;->۟ۦۦۦ([SIII)Ljava/lang/String;

    move-result-object v8

    invoke-static {v5, v8}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {v5, v6, v7}, Landroidx/loader/ۢۥ۟;->۟ۥۣۢۡ(Ljava/lang/Object;J)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v6

    const/16 v7, 0x3ad

    sget v8, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    xor-int/lit8 v8, v8, 0x76

    const/16 v9, 0xc86

    invoke-static {v6, v7, v8, v9}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۨۤ۠۠([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {v5}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/io/File;

    invoke-static {v1}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۧ۟ۤۨ(Ljava/lang/Object;)Ljava/io/File;

    move-result-object v7

    invoke-direct {v6, v7, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-static {v0}, Landroidx/customview/ۤۡۥ;->۠ۢ۠۟(Ljava/lang/Object;)Ljava/io/InputStream;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_8

    move-result-object v5

    :try_start_2
    new-instance v7, Ljava/io/FileOutputStream;

    invoke-direct {v7, v6}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    const/16 v0, 0x2000

    :try_start_3
    new-array v8, v0, [B

    :sswitch_e
    invoke-static {v5, v8}, Landroidx/loader/ۥۧۨۤ;->ۦۥ۠۠(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v9

    const v0, 0xbefb

    :goto_6
    const v10, 0xbf0c

    xor-int/2addr v0, v10

    sparse-switch v0, :sswitch_data_4

    goto :goto_6

    :cond_3
    :sswitch_f
    const v0, 0xbf39

    goto :goto_6

    :sswitch_10
    if-ne v9, v12, :cond_3

    const v0, 0xc1e3

    goto :goto_6

    :sswitch_11
    invoke-static {v7}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۦۢۡۢ(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    :try_start_4
    invoke-static {v7}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۡ۠ۨ۠(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_6

    const v0, 0xc202

    :goto_7
    const v7, 0xc213

    xor-int/2addr v0, v7

    sparse-switch v0, :sswitch_data_5

    goto :goto_7

    :sswitch_12
    if-eqz v5, :cond_4

    const v0, 0xc25f

    goto :goto_7

    :cond_4
    :sswitch_13
    const v0, 0xc240

    goto :goto_7

    :sswitch_14
    :try_start_5
    invoke-static {v5}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟ۦۣۦۣ(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_8

    :sswitch_15
    :try_start_6
    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->۟ۦۡ۠ۡ()J

    move-result-wide v8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v0, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0, v8, v9}, Landroidx/loader/ۢۥ۟;->۟ۥۣۢۡ(Ljava/lang/Object;J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v5, Ljava/io/File;

    invoke-static {v1}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۧ۟ۤۨ(Ljava/lang/Object;)Ljava/io/File;

    move-result-object v7

    invoke-direct {v5, v7, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->۟ۦۡ۠ۡ()J

    move-result-wide v8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v0, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0, v8, v9}, Landroidx/loader/ۢۥ۟;->۟ۥۣۢۡ(Ljava/lang/Object;J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/io/File;

    invoke-static {v1}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۧ۟ۤۨ(Ljava/lang/Object;)Ljava/io/File;

    move-result-object v1

    invoke-direct {v3, v1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    :try_start_7
    new-instance v4, Ljava/io/FileInputStream;

    invoke-direct {v4, v6}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :try_start_8
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_9

    const/16 v0, 0x2000

    :try_start_9
    new-array v5, v0, [B

    :sswitch_16
    invoke-static {v4, v5}, Landroidx/loader/ۥۧۨۤ;->ۦۥ۠۠(Ljava/lang/Object;Ljava/lang/Object;)I
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    move-result v7

    const v0, 0xc27e

    :goto_8
    const v8, 0xc28f

    xor-int/2addr v0, v8

    sparse-switch v0, :sswitch_data_6

    goto :goto_8

    :cond_5
    :sswitch_17
    const v0, 0xc2bc

    goto :goto_8

    :sswitch_18
    if-ne v7, v12, :cond_5

    const v0, 0xc2db

    goto :goto_8

    :sswitch_19
    :try_start_a
    invoke-static {v1}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۡ۠ۨ۠(Ljava/lang/Object;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_9

    :try_start_b
    invoke-static {v4}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟ۦۣۦۣ(Ljava/lang/Object;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    :try_start_c
    invoke-static {v3}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۦ۠ۤۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/VoiceAssistantHook;->currentTtsAudioPath:Ljava/lang/String;

    invoke-static {v6}, Landroidx/loader/۟۠ۢۧۡ;->ۣۣ۟ۢۤ(Ljava/lang/Object;)Z

    invoke-static {v3}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۦ۠ۤۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v2

    const/16 v3, 0x3b1

    sget v4, Lorg/luckypray/dexkit/۠۠ۥ;->ۣ۟ۡۢۡ:I

    xor-int/lit16 v4, v4, -0xf5

    const/16 v5, 0x4a1

    invoke-static {v2, v3, v4, v5}, Landroidx/core/ۧ۟ۤۨ;->ۡۥ۟ۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۨ۟(Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۤۧۡۨ()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda13;

    invoke-direct {v1, p1}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda13;-><init>(Landroid/widget/TextView;)V

    invoke-static {v0, v1}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_0

    const v0, 0xc2fa

    :goto_9
    const v1, 0xc30b

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_7

    goto :goto_9

    :sswitch_1a
    const v0, 0xc5a4

    goto :goto_9

    :sswitch_1b
    const/4 v0, 0x0

    :try_start_d
    invoke-static {v1, v5, v0, v7}, Landroidx/drawerlayout/ۤۨۡۤ;->۟۠ۦۤۧ(Ljava/lang/Object;Ljava/lang/Object;II)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    const v0, 0xc601

    :goto_a
    const v7, 0xc612

    xor-int/2addr v0, v7

    sparse-switch v0, :sswitch_data_8

    goto :goto_a

    :sswitch_1c
    const v0, 0xc620

    goto :goto_a

    :catchall_0
    move-exception v2

    :try_start_e
    invoke-static {v1}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۡ۠ۨ۠(Ljava/lang/Object;)V

    throw v2
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    :catchall_1
    move-exception v0

    const v1, 0xc67d

    :goto_b
    const v3, 0xc68e

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_9

    goto :goto_b

    :goto_c
    :sswitch_1d
    const v1, 0xc984

    :goto_d
    const v3, 0xc995

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_a

    goto :goto_d

    :sswitch_1e
    if-eqz v2, :cond_6

    const v1, 0xc9e1

    goto :goto_d

    :sswitch_1f
    const v1, 0xc69c

    goto :goto_b

    :cond_6
    :sswitch_20
    const v1, 0xc9c2

    goto :goto_d

    :sswitch_21
    const v1, 0xca00

    :goto_e
    const v3, 0xca11

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_b

    goto :goto_e

    :cond_7
    :sswitch_22
    const v1, 0xca3e

    goto :goto_e

    :sswitch_23
    if-eq v2, v0, :cond_7

    const v1, 0xca5d

    goto :goto_e

    :sswitch_24
    :try_start_f
    invoke-static {v2, v0}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۨ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0xca7c

    :goto_f
    const v1, 0xca8d

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_c

    goto :goto_f

    :sswitch_25
    const v0, 0xcd26

    goto :goto_f

    :catchall_2
    move-exception v0

    const v1, 0xcd83

    :goto_10
    const v3, 0xcd94

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_d

    goto :goto_10

    :sswitch_26
    const v1, 0xcda2

    goto :goto_10

    :sswitch_27
    move-object v2, v0

    :sswitch_28
    invoke-static {v4}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟ۦۣۦۣ(Ljava/lang/Object;)V

    throw v2
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    :catchall_3
    move-exception v0

    :sswitch_29
    const v1, 0xcdff

    :goto_11
    const v3, 0xce10

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_e

    goto :goto_11

    :cond_8
    :sswitch_2a
    const v1, 0xce3d

    goto :goto_11

    :sswitch_2b
    if-eqz v2, :cond_8

    const v1, 0xd0e7

    goto :goto_11

    :sswitch_2c
    const v1, 0xd106

    :goto_12
    const v3, 0xd117

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_f

    goto :goto_12

    :sswitch_2d
    if-eq v2, v0, :cond_9

    const v1, 0xd163

    goto :goto_12

    :cond_9
    :sswitch_2e
    const v1, 0xd144

    goto :goto_12

    :sswitch_2f
    :try_start_10
    invoke-static {v2, v0}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۨ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0xd182

    :goto_13
    const v1, 0xd193

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_10

    goto :goto_13

    :sswitch_30
    const v0, 0xd1a1

    goto :goto_13

    :sswitch_31
    move-object v2, v0

    :sswitch_32
    throw v2
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_0

    :catch_0
    move-exception v0

    invoke-static {v0}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۤ۟۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v3

    const/16 v4, 0x3c7

    sget v5, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    xor-int/lit16 v5, v5, 0x169

    const/16 v6, 0x8b7

    invoke-static {v3, v4, v5, v6}, Landroidx/startup/۟ۦۤۨۧ;->۟ۦۦۦ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۨ۟(Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۤۧۡۨ()Landroid/os/Handler;

    move-result-object v1

    new-instance v2, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda14;

    invoke-direct {v2, p1, v0}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda14;-><init>(Landroid/widget/TextView;Ljava/lang/Exception;)V

    invoke-static {v1, v2}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto/16 :goto_5

    :sswitch_33
    const/4 v0, 0x0

    :try_start_11
    invoke-static {v7, v8, v0, v9}, Landroidx/drawerlayout/ۤۨۡۤ;->۟۠ۦۤۧ(Ljava/lang/Object;Ljava/lang/Object;II)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_4

    const v0, 0xd1fe

    :goto_14
    const v9, 0xd20f

    xor-int/2addr v0, v9

    sparse-switch v0, :sswitch_data_11

    goto :goto_14

    :sswitch_34
    const v0, 0xd4a8

    goto :goto_14

    :catchall_4
    move-exception v2

    :try_start_12
    invoke-static {v7}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۡ۠ۨ۠(Ljava/lang/Object;)V

    throw v2
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_5

    :catchall_5
    move-exception v0

    const v1, 0xd505

    :goto_15
    const v3, 0xd516

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_12

    goto :goto_15

    :sswitch_35
    const v1, 0xd524

    goto :goto_15

    :catchall_6
    move-exception v0

    :sswitch_36
    const v1, 0xd581

    :goto_16
    const v3, 0xd592

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_13

    goto :goto_16

    :sswitch_37
    if-nez v2, :cond_a

    const v1, 0xd869

    goto :goto_16

    :cond_a
    :sswitch_38
    const v1, 0xd5bf

    goto :goto_16

    :sswitch_39
    const v1, 0xd888

    :goto_17
    const v2, 0xd899

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_14

    goto :goto_17

    :sswitch_3a
    const v1, 0xd8a7

    goto :goto_17

    :sswitch_3b
    move-object v2, v0

    :sswitch_3c
    const v0, 0xdd03

    :goto_18
    const v1, 0xdd14

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_15

    goto :goto_18

    :sswitch_3d
    if-eqz v5, :cond_c

    const v0, 0x170090

    goto :goto_18

    :sswitch_3e
    const v1, 0xd904

    :goto_19
    const v3, 0xd915

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_16

    goto :goto_19

    :sswitch_3f
    if-eq v2, v0, :cond_b

    const v1, 0xd961

    goto :goto_19

    :cond_b
    :sswitch_40
    const v1, 0xd942

    goto :goto_19

    :sswitch_41
    :try_start_13
    invoke-static {v2, v0}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۨ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0xd980

    :goto_1a
    const v1, 0xd991

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_17

    goto :goto_1a

    :sswitch_42
    const v0, 0xdc2a

    goto :goto_1a

    :catchall_7
    move-exception v0

    const v1, 0xdc87

    :goto_1b
    const v3, 0xdc98

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_18

    goto :goto_1b

    :sswitch_43
    const v1, 0xdca6

    goto :goto_1b

    :cond_c
    :sswitch_44
    const v0, 0xdd41

    goto :goto_18

    :sswitch_45
    invoke-static {v5}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟ۦۣۦۣ(Ljava/lang/Object;)V

    :sswitch_46
    throw v2
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_7

    :catchall_8
    move-exception v0

    :sswitch_47
    const v1, 0x1700af

    :goto_1c
    const v3, 0x1700c0

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_19

    goto :goto_1c

    :cond_d
    :sswitch_48
    const v1, 0x1700ed

    goto :goto_1c

    :sswitch_49
    if-eqz v2, :cond_d

    const v1, 0x17010c

    goto :goto_1c

    :sswitch_4a
    const v1, 0x17012b

    :goto_1d
    const v3, 0x17013c

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_1a

    goto :goto_1d

    :sswitch_4b
    if-eq v2, v0, :cond_e

    const v1, 0x170188

    goto :goto_1d

    :cond_e
    :sswitch_4c
    const v1, 0x170169

    goto :goto_1d

    :sswitch_4d
    :try_start_14
    invoke-static {v2, v0}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۨ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0x1701a7

    :goto_1e
    const v1, 0x1701b8

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_1b

    goto :goto_1e

    :sswitch_4e
    const v0, 0x170451

    goto :goto_1e

    :sswitch_4f
    move-object v2, v0

    :sswitch_50
    throw v2
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_0

    :catchall_9
    move-exception v0

    goto/16 :goto_c

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_6
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_5
        0xb918 -> :sswitch_d
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_c
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_f
        0x35 -> :sswitch_33
        0x1f7 -> :sswitch_10
        0x7eef -> :sswitch_11
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_12
        0x32 -> :sswitch_13
        0x4c -> :sswitch_14
        0x53 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_17
        0x33 -> :sswitch_1b
        0x54 -> :sswitch_19
        0xf1 -> :sswitch_18
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_1a
        0x6af -> :sswitch_c
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_1c
        0x32 -> :sswitch_16
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1d
        0xf3 -> :sswitch_1f
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1e
        0x36 -> :sswitch_20
        0x57 -> :sswitch_27
        0x74 -> :sswitch_21
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_22
        0x11 -> :sswitch_23
        0x2f -> :sswitch_28
        0x4c -> :sswitch_24
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_25
        0x7ab -> :sswitch_28
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_26
        0x36 -> :sswitch_29
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_2a
        0x2d -> :sswitch_31
        0x3ef -> :sswitch_2b
        0x1ef7 -> :sswitch_2c
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_2d
        0x32 -> :sswitch_2e
        0x53 -> :sswitch_32
        0x74 -> :sswitch_2f
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x11 -> :sswitch_30
        0x32 -> :sswitch_32
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x3f1 -> :sswitch_34
        0x6a7 -> :sswitch_e
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x13 -> :sswitch_35
        0x32 -> :sswitch_36
    .end sparse-switch

    :sswitch_data_13
    .sparse-switch
        0x13 -> :sswitch_37
        0x2d -> :sswitch_3e
        0x32 -> :sswitch_38
        0xdfb -> :sswitch_39
    .end sparse-switch

    :sswitch_data_14
    .sparse-switch
        0x11 -> :sswitch_3a
        0x3e -> :sswitch_3b
    .end sparse-switch

    :sswitch_data_15
    .sparse-switch
        0x17 -> :sswitch_3d
        0x36 -> :sswitch_44
        0x55 -> :sswitch_46
        0x17dd84 -> :sswitch_45
    .end sparse-switch

    :sswitch_data_16
    .sparse-switch
        0x11 -> :sswitch_3f
        0x36 -> :sswitch_40
        0x57 -> :sswitch_3c
        0x74 -> :sswitch_41
    .end sparse-switch

    :sswitch_data_17
    .sparse-switch
        0x11 -> :sswitch_42
        0x5bb -> :sswitch_3c
    .end sparse-switch

    :sswitch_data_18
    .sparse-switch
        0x1f -> :sswitch_43
        0x3e -> :sswitch_47
    .end sparse-switch

    :sswitch_data_19
    .sparse-switch
        0xe -> :sswitch_48
        0x2d -> :sswitch_4f
        0x6f -> :sswitch_49
        0x1cc -> :sswitch_4a
    .end sparse-switch

    :sswitch_data_1a
    .sparse-switch
        0x17 -> :sswitch_4b
        0x55 -> :sswitch_50
        0x76 -> :sswitch_4c
        0xb4 -> :sswitch_4d
    .end sparse-switch

    :sswitch_data_1b
    .sparse-switch
        0x1f -> :sswitch_4e
        0x5e9 -> :sswitch_50
    .end sparse-switch
.end method

.method static synthetic lambda$25(Landroid/widget/TextView;)V
    .locals 5

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->۟ۦۤۢۨ()J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟۟۟ۦۤ(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۣ۟ۡۧ۟()I

    move-result v1

    invoke-static {v1}, Landroidx/activity/ۤۧۧۧ;->ۣ۟ۦۣ۠(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۣ۟۟ۧۤ()I

    move-result v2

    invoke-static {v2}, Landroidx/activity/ۤۧۧۧ;->ۣ۟ۦۣ۠(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    sget v4, Lkevin/fun/hook/۟ۥ۠۠;->ۢۦۧۧ:I

    xor-int/lit16 v4, v4, -0x1c5

    aput-object v0, v3, v4

    sget v0, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    xor-int/lit16 v0, v0, 0x178

    aput-object v1, v3, v0

    sget v0, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۨۤۨۡ:I

    xor-int/lit16 v0, v0, -0x3a8

    aput-object v2, v3, v0

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v1, 0x3d6

    sget v2, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۤۥ:I

    xor-int/lit16 v2, v2, 0x39b

    const/16 v4, 0x665

    invoke-static {v0, v1, v2, v4}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۧۡۥۡ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۣۢ۠ۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, -0xb35111

    sget v1, Landroidx/core/ۧ۟ۤۨ;->ۣۤ۠ۤ:I

    xor-int/2addr v0, v1

    invoke-static {p0, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    invoke-static {}, Landroidx/customview/ۡۤۡۤ;->۟ۡ۠ۧ۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "jLpmuoA3yMqW"

    invoke-static {v0}, Landroidx/appcompat/resources/ۦۨۦۢ;->ۣۡۧۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method static synthetic lambda$26(Landroid/widget/TextView;Ljava/lang/Exception;)V
    .locals 10

    const/4 v8, 0x0

    const/4 v1, 0x0

    const-string v6, "\u06e5\u06e3\u06e2"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move v7, v8

    move v9, v8

    :goto_0
    invoke-static {v6}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    xor-int/lit16 v8, v7, -0x252

    const-string v1, "\u06e3\u06e8\u06e1"

    move-object v6, v1

    move v9, v8

    goto :goto_0

    :sswitch_0
    sget v7, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    const-string v1, "\u06e2\u06e7\u06df"

    move-object v6, v1

    goto :goto_0

    :sswitch_1
    invoke-static {v4, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\u06e0\u06e6\u06e6"

    move-object v6, v1

    goto :goto_0

    :sswitch_2
    invoke-static {p0, v5}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e6\u06e1\u06e5"

    move-object v6, v1

    goto :goto_0

    :sswitch_3
    const/16 v1, 0x3f8

    const/16 v5, 0x882

    invoke-static {v2, v1, v9, v5}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢۦۤ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06df\u06e7\u06e1"

    move-object v5, v1

    goto :goto_0

    :sswitch_4
    const v1, -0xfca5

    xor-int v8, v1, v7

    const-string v1, "\u06e2\u06e1"

    move-object v6, v1

    move v9, v8

    goto :goto_0

    :sswitch_5
    sget v7, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۨ۠ۨ:I

    const-string v1, "\u06e5\u06e8\u06e0"

    move-object v6, v1

    goto :goto_0

    :sswitch_6
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\u06e0\u06e1\u06e6"

    move-object v4, v1

    goto :goto_0

    :sswitch_7
    invoke-static {v4}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06df\u06e2\u06e2"

    move-object v5, v1

    goto :goto_0

    :sswitch_8
    invoke-static {v0, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v6, "\u06e1\u06e6\u06e7"

    move-object v4, v1

    goto :goto_0

    :sswitch_9
    invoke-static {p1}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۤ۟۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e4\u06df\u06e7"

    move-object v3, v1

    goto :goto_0

    :sswitch_a
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v1

    const-string v6, "\u06e2\u06e8\u06df"

    move-object v2, v1

    goto :goto_0

    :sswitch_b
    invoke-static {p0, v9}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const-string v1, "\u06e2\u06e7\u06e5"

    move-object v6, v1

    goto :goto_0

    :sswitch_c
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc3f -> :sswitch_b
        0x1aa75f -> :sswitch_2
        0x1aa7f9 -> :sswitch_1
        0x1aab05 -> :sswitch_a
        0x1aaba0 -> :sswitch_8
        0x1aaf62 -> :sswitch_7
        0x1ab340 -> :sswitch_c
        0x1ab359 -> :sswitch_0
        0x1ab71c -> :sswitch_3
        0x1ab9cc -> :sswitch_6
        0x1abe04 -> :sswitch_9
        0x1abe9d -> :sswitch_4
        0x1ac18a -> :sswitch_5
    .end sparse-switch
.end method

.method static synthetic lambda$27(Ljava/lang/String;Landroid/app/Activity;)V
    .locals 6

    :try_start_0
    new-instance v0, Landroid/media/MediaPlayer;

    invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V

    sput-object v0, Lkevin/fun/hook/VoiceAssistantHook;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۨۧۤۤ()Landroid/media/MediaPlayer;

    move-result-object v0

    invoke-static {v0, p0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟۠ۡۥۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۨۧۤۤ()Landroid/media/MediaPlayer;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۟ۦۣ۠ۤ(Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۨۧۤۤ()Landroid/media/MediaPlayer;

    move-result-object v0

    invoke-static {v0}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۢۢۤۨ(Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۨۧۤۤ()Landroid/media/MediaPlayer;

    move-result-object v0

    new-instance v1, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda32;

    invoke-direct {v1}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda32;-><init>()V

    invoke-static {v0, v1}, Landroidx/startup/ۤۧۥۣ;->۟ۦۥ۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :goto_1
    :sswitch_0
    return-void

    :sswitch_1
    const/16 v0, 0x66f

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {v0}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۤ۟۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v2

    const/16 v3, 0x400

    sget v4, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۤ۟ۧۤ:I

    xor-int/lit16 v4, v4, -0x1e3

    const/16 v5, 0x4b3

    invoke-static {v2, v3, v4, v5}, Landroidx/startup/۟ۦۤۨۧ;->۟ۦۦۦ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkevin/fun/hook/VoiceAssistantHook;->ۣ۟۟ۡۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
    .end sparse-switch
.end method

.method static synthetic lambda$28(Landroid/media/MediaPlayer;)V
    .locals 0

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۦۡۧ()V

    return-void
.end method

.method static synthetic lambda$29(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 7

    const/4 v2, 0x0

    :try_start_0
    new-instance v1, Ljava/io/File;

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۣۣۥۢ()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Landroidx/vectordrawable/ۢۤۡۤ;->ۡ۠ۤ۠(Ljava/lang/Object;)Z

    move-result v3

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez v3, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v1}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۧۤۢۦ(Ljava/lang/Object;)Z

    move-result v3

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v3, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v1, 0x405

    sget v2, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    xor-int/lit16 v2, v2, 0x25b

    const/16 v3, 0xa25

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۨۦۣۨ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lkevin/fun/hook/VoiceAssistantHook;->ۣ۟۟ۡۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_2
    :sswitch_6
    return-void

    :sswitch_7
    new-instance v0, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda3;

    invoke-direct {v0}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda3;-><init>()V

    invoke-static {v1, v0}, Landroidx/customview/ۡۤۡۤ;->ۣۥۨۡ(Ljava/lang/Object;Ljava/lang/Object;)[Ljava/io/File;

    move-result-object v1

    const/16 v0, 0x748

    :goto_3
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_3

    :sswitch_8
    if-eqz v1, :cond_2

    const v0, 0xbe60

    goto :goto_3

    :cond_2
    :sswitch_9
    const v0, 0xbe41

    goto :goto_3

    :sswitch_a
    array-length v3, v1

    const v0, 0xbe7f

    :goto_4
    const v4, 0xbe90

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_3

    goto :goto_4

    :cond_3
    :sswitch_b
    const v0, 0xbebd

    goto :goto_4

    :sswitch_c
    if-nez v3, :cond_3

    const v0, 0xbedc

    goto :goto_4

    :sswitch_d
    const v0, 0xbefb

    :goto_5
    const v1, 0xbf0c

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_4

    goto :goto_5

    :sswitch_e
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v1, 0x40d

    sget v2, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۤۦۤۧ:I

    xor-int/lit16 v2, v2, 0x14e

    const/16 v3, 0x39f

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟۟۟ۦۢ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lkevin/fun/hook/VoiceAssistantHook;->ۣ۟۟ۡۧ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    invoke-static {v0}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۤ۟۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v3

    const/16 v4, 0x41e

    sget v5, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    xor-int/lit8 v5, v5, -0x26

    const/16 v6, 0x224

    invoke-static {v3, v4, v5, v6}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۨۤ۠۠([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۨ۟(Ljava/lang/Object;)V

    invoke-static {v0}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۤ۟۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v2

    const/16 v3, 0x42e

    sget v4, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۣۧۢ:I

    xor-int/lit16 v4, v4, -0x3c1

    const/16 v5, 0xaef

    invoke-static {v2, v3, v4, v5}, Landroidx/startup/۟ۦۤۨۧ;->۟ۦۦۦ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lkevin/fun/hook/VoiceAssistantHook;->ۣ۟۟ۡۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_2

    :sswitch_f
    const v0, 0xbf1a

    goto :goto_5

    :sswitch_10
    :try_start_1
    new-instance v0, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda4;

    invoke-direct {v0}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda4;-><init>()V

    invoke-static {v1, v0}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟۠ۨ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x0

    aget-object v0, v1, v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :try_start_2
    new-instance v3, Ljava/io/FileInputStream;

    invoke-direct {v3, p1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    :try_start_3
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    const/16 v0, 0x2000

    :try_start_4
    new-array v4, v0, [B

    :sswitch_11
    invoke-static {v3, v4}, Landroidx/loader/ۥۧۨۤ;->ۦۥ۠۠(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v5

    const v0, 0xc202

    :goto_6
    const v6, 0xc213

    xor-int/2addr v0, v6

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :sswitch_12
    if-gtz v5, :cond_4

    const v0, 0xc25f

    goto :goto_6

    :cond_4
    :sswitch_13
    const v0, 0xc240

    goto :goto_6

    :sswitch_14
    invoke-static {v1}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۦۢۡۢ(Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۤۧۡۨ()Landroid/os/Handler;

    move-result-object v0

    new-instance v4, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda5;

    invoke-direct {v4, p0}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda5;-><init>(Landroid/app/Activity;)V

    invoke-static {v0, v4}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    invoke-static {v1}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۡ۠ۨ۠(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    :try_start_6
    invoke-static {v3}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟ۦۣۦۣ(Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    const v0, 0xc27e

    :goto_7
    const v1, 0xc28f

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_6

    goto :goto_7

    :sswitch_15
    const v0, 0xc29d

    goto :goto_7

    :sswitch_16
    const/4 v0, 0x0

    :try_start_7
    invoke-static {v1, v4, v0, v5}, Landroidx/drawerlayout/ۤۨۡۤ;->۟۠ۦۤۧ(Ljava/lang/Object;Ljava/lang/Object;II)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    const v0, 0xc2fa

    :goto_8
    const v5, 0xc30b

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_7

    goto :goto_8

    :sswitch_17
    const v0, 0xc5a4

    goto :goto_8

    :catchall_0
    move-exception v0

    :try_start_8
    invoke-static {v1}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۡ۠ۨ۠(Ljava/lang/Object;)V

    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :catchall_1
    move-exception v1

    move-object v2, v0

    :goto_9
    const v0, 0xc601

    :goto_a
    const v4, 0xc612

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_8

    goto :goto_a

    :sswitch_18
    if-eqz v2, :cond_5

    const v0, 0xc65e

    goto :goto_a

    :cond_5
    :sswitch_19
    const v0, 0xc63f

    goto :goto_a

    :sswitch_1a
    const v0, 0xc67d

    :goto_b
    const v4, 0xc68e

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_9

    goto :goto_b

    :cond_6
    :sswitch_1b
    const v0, 0xc6bb

    goto :goto_b

    :sswitch_1c
    if-eq v2, v1, :cond_6

    const v0, 0xc965

    goto :goto_b

    :sswitch_1d
    :try_start_9
    invoke-static {v2, v1}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۨ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0xc984

    :goto_c
    const v1, 0xc995

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_a

    goto :goto_c

    :sswitch_1e
    const v0, 0xc9a3

    goto :goto_c

    :sswitch_1f
    move-object v2, v1

    :sswitch_20
    invoke-static {v3}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟ۦۣۦۣ(Ljava/lang/Object;)V

    throw v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    :catchall_2
    move-exception v1

    move-object v0, v2

    :goto_d
    const v2, 0xca00

    :goto_e
    const v3, 0xca11

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_b

    goto :goto_e

    :cond_7
    :sswitch_21
    const v2, 0xca3e

    goto :goto_e

    :sswitch_22
    if-eqz v0, :cond_7

    const v2, 0xca5d

    goto :goto_e

    :sswitch_23
    const v2, 0xca7c

    :goto_f
    const v3, 0xca8d

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_c

    goto :goto_f

    :sswitch_24
    if-eq v0, v1, :cond_8

    const v2, 0xcd64

    goto :goto_f

    :cond_8
    :sswitch_25
    const v2, 0xcd45

    goto :goto_f

    :sswitch_26
    :try_start_a
    invoke-static {v0, v1}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۨ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_10
    :sswitch_27
    throw v0
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_0

    :catchall_3
    move-exception v1

    move-object v0, v2

    goto :goto_d

    :catchall_4
    move-exception v0

    move-object v1, v0

    goto :goto_9

    :sswitch_28
    move-object v0, v1

    goto :goto_10

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_7
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_8
        0xb918 -> :sswitch_e
        0xb939 -> :sswitch_a
        0xb97b -> :sswitch_9
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_b
        0x2d -> :sswitch_10
        0x4c -> :sswitch_d
        0xef -> :sswitch_c
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_e
        0x1f7 -> :sswitch_f
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_12
        0x32 -> :sswitch_13
        0x4c -> :sswitch_14
        0x53 -> :sswitch_16
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_6
        0xf1 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_17
        0x6af -> :sswitch_11
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_18
        0x2d -> :sswitch_1f
        0x32 -> :sswitch_19
        0x4c -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1b
        0x35 -> :sswitch_20
        0xf3 -> :sswitch_1c
        0xfeb -> :sswitch_1d
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1e
        0x36 -> :sswitch_20
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_21
        0x11 -> :sswitch_22
        0x2f -> :sswitch_28
        0x4c -> :sswitch_23
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_24
        0x7ab -> :sswitch_25
        0x7c8 -> :sswitch_27
        0x7e9 -> :sswitch_26
    .end sparse-switch
.end method

.method static synthetic lambda$3(Landroid/content/Context;)V
    .locals 15

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v1, 0x434

    sget v2, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    xor-int/lit16 v2, v2, 0x22b

    const/16 v3, 0xbce

    invoke-static {v0, v1, v2, v3}, Landroidx/startup/ۤۧۥۣ;->۟ۧۦ۠ۦ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v1, 0x439

    sget v2, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    xor-int/lit16 v2, v2, 0x305

    const/16 v3, 0x534

    invoke-static {v0, v1, v2, v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧ۠ۥ۟([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v1, 0x441

    sget v3, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۤۨۨ:I

    xor-int/lit16 v3, v3, 0x10b

    const/16 v6, 0x621

    invoke-static {v0, v1, v3, v6}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۨۤ۠۠([SIII)Ljava/lang/String;

    move-result-object v6

    :try_start_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v1

    const/16 v3, 0x448

    sget v7, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v7, v7, 0x12b

    const/16 v8, 0x675

    invoke-static {v1, v3, v7, v8}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟۟۠ۤۤ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->۠۟ۥۦ()Ljava/lang/String;

    move-result-object v3

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v8

    const/16 v9, 0x455

    sget v10, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۢۥۨۦ:I

    xor-int/lit16 v10, v10, 0x294

    const/16 v11, 0x6f2

    invoke-static {v8, v9, v10, v11}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦۣ۠ۤ([SIII)Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-static {v7, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v3}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v3}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۣۢۢۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v1

    const/16 v3, 0x45c

    sget v7, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    xor-int/lit16 v7, v7, 0x16c

    const/16 v8, 0xa7a

    invoke-static {v1, v3, v7, v8}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣۣ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v3

    const/16 v7, 0x466

    sget v8, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۢۥۨۦ:I

    xor-int/lit16 v8, v8, 0x2b2

    const/16 v9, 0xcbb

    invoke-static {v3, v7, v8, v9}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۢۦۣ۠([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v3}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۣۢۢۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v1

    const/16 v3, 0x487

    sget v7, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    xor-int/lit16 v7, v7, 0x222

    const/16 v8, 0x920

    invoke-static {v1, v3, v7, v8}, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۥۧۤ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v3

    const/16 v7, 0x493

    sget v8, Landroidx/customview/ۤۡۥ;->ۣ۟ۢۥۢ:I

    xor-int/lit8 v8, v8, -0x76

    const/16 v9, 0x15b

    invoke-static {v3, v7, v8, v9}, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۥۧۤ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v3}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۣۢۢۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v1

    const/16 v3, 0x4a3

    sget v7, Landroidx/activity/ۣۦۡۥ;->ۣۢۤۡ:I

    xor-int/lit8 v7, v7, 0x2c

    const/16 v8, 0xa98

    invoke-static {v1, v3, v7, v8}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۦۣۣۦ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lkevin/fun/hook/VoiceAssistantHook;->ۤۥ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v3, 0x4d1

    sget v7, Landroidx/activity/ۤۧۧۧ;->۟۟ۢ۠ۡ:I

    xor-int/lit16 v7, v7, 0x1e6

    const/16 v8, 0x1c6

    invoke-static {v0, v3, v7, v8}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۦ۠ۧۨ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v3, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :sswitch_7
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v1, 0x4dd

    sget v7, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    xor-int/lit16 v7, v7, 0xc5

    const/16 v8, 0xb7a

    invoke-static {v0, v1, v7, v8}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣ۟۠ۢۡ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v1

    const v0, 0xbe7f

    :goto_3
    const v7, 0xbe90

    xor-int/2addr v0, v7

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_8
    const v0, 0xbebd

    goto :goto_3

    :sswitch_9
    const/16 v0, 0xc8

    if-ne v1, v0, :cond_2

    const v0, 0xbedc

    goto :goto_3

    :sswitch_a
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v1, 0x4e3

    sget v7, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    xor-int/lit16 v7, v7, -0x16f

    const/16 v8, 0x3c3

    invoke-static {v0, v1, v7, v8}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۧۡۥۡ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroidx/core/ۧ۟ۤۨ;->ۡۨ۟۟(Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object v7

    new-instance v8, Ljava/util/LinkedHashMap;

    invoke-direct {v8}, Ljava/util/LinkedHashMap;-><init>()V

    const/4 v0, 0x0

    move v1, v0

    :goto_4
    invoke-static {v7}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۥۤۦۣ(Ljava/lang/Object;)I

    move-result v3

    const v0, 0xbefb

    :goto_5
    const v9, 0xbf0c

    xor-int/2addr v0, v9

    sparse-switch v0, :sswitch_data_4

    goto :goto_5

    :cond_3
    :sswitch_b
    const v0, 0xbf39

    goto :goto_5

    :sswitch_c
    if-lt v1, v3, :cond_3

    const v0, 0xc1e3

    goto :goto_5

    :sswitch_d
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۤۧۡۨ()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda35;

    invoke-direct {v1, v8, p0}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda35;-><init>(Ljava/util/Map;Landroid/content/Context;)V

    invoke-static {v0, v1}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    const v0, 0xc202

    :goto_6
    const v1, 0xc213

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :sswitch_e
    const v0, 0xc221

    goto :goto_6

    :sswitch_f
    invoke-static {v7, v1}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۦۣۡ۠(Ljava/lang/Object;I)Lorg/json/JSONObject;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v9, 0x4e7

    sget v10, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    xor-int/lit16 v10, v10, 0x300

    const/16 v11, 0xaf8

    invoke-static {v0, v9, v10, v11}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۧۨۦۦ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroidx/loader/ۡۢۢ;->ۨۥۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v10, 0x4f4

    sget v11, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    xor-int/lit16 v11, v11, -0x25e

    const/16 v12, 0x6e8

    invoke-static {v0, v10, v11, v12}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟۟۟ۦۢ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroidx/loader/ۡۢۢ;->ۨۥۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v3, v6}, Landroidx/loader/ۢۥ۟;->۟ۤۥۥۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    const v0, 0xc27e

    :goto_7
    const v12, 0xc28f

    xor-int/2addr v0, v12

    sparse-switch v0, :sswitch_data_6

    goto :goto_7

    :cond_4
    :sswitch_10
    const v0, 0xc2bc

    goto :goto_7

    :sswitch_11
    if-eqz v11, :cond_4

    const v0, 0xc2db

    goto :goto_7

    :sswitch_12
    invoke-static {v3, v6}, Landroidx/loader/ۡۢۢ;->ۨۥۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const v3, 0xc2fa

    :goto_8
    const v11, 0xc30b

    xor-int/2addr v3, v11

    sparse-switch v3, :sswitch_data_7

    goto :goto_8

    :sswitch_13
    const v3, 0xc5a4

    goto :goto_8

    :sswitch_14
    move-object v3, v0

    :goto_9
    invoke-static {v3}, Landroidx/activity/ۨ۠۟ۧ;->۟ۧ۟ۡ۠(Ljava/lang/Object;)Z

    move-result v11

    const v0, 0xca7c

    :goto_a
    const v12, 0xca8d

    xor-int/2addr v0, v12

    sparse-switch v0, :sswitch_data_8

    goto :goto_a

    :sswitch_15
    if-eqz v11, :cond_7

    const v0, 0xcd64

    goto :goto_a

    :sswitch_16
    invoke-static {v3, v5}, Landroidx/loader/ۢۥ۟;->۟ۤۥۥۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    const v0, 0xc601

    :goto_b
    const v12, 0xc612

    xor-int/2addr v0, v12

    sparse-switch v0, :sswitch_data_9

    goto :goto_b

    :sswitch_17
    if-eqz v11, :cond_5

    const v0, 0xc65e

    goto :goto_b

    :cond_5
    :sswitch_18
    const v0, 0xc63f

    goto :goto_b

    :sswitch_19
    invoke-static {v3, v5}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۡۦۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v3

    invoke-static {v3, v4}, Landroidx/loader/ۢۥ۟;->۟ۤۥۥۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    const v0, 0xc67d

    :goto_c
    const v12, 0xc68e

    xor-int/2addr v0, v12

    sparse-switch v0, :sswitch_data_a

    goto :goto_c

    :cond_6
    :sswitch_1a
    const v0, 0xc6bb

    goto :goto_c

    :sswitch_1b
    if-eqz v11, :cond_6

    const v0, 0xc965

    goto :goto_c

    :sswitch_1c
    invoke-static {v3, v4}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۡۦۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0, v6}, Landroidx/loader/ۡۢۢ;->ۨۥۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const v3, 0xc984

    :goto_d
    const v11, 0xc995

    xor-int/2addr v3, v11

    sparse-switch v3, :sswitch_data_b

    goto :goto_d

    :sswitch_1d
    const v3, 0xc9a3

    goto :goto_d

    :sswitch_1e
    move-object v3, v0

    goto :goto_9

    :sswitch_1f
    const v0, 0xca00

    :goto_e
    const v3, 0xca11

    xor-int/2addr v0, v3

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    goto :goto_e

    :pswitch_1
    move-object v3, v2

    goto :goto_9

    :pswitch_2
    const v0, 0xca1f

    goto :goto_e

    :cond_7
    :sswitch_20
    const v0, 0xcd45

    goto :goto_a

    :sswitch_21
    const v0, 0xcd83

    :goto_f
    const v3, 0xcd94

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_c

    goto :goto_f

    :sswitch_22
    const v0, 0xcda2

    goto :goto_f

    :sswitch_23
    move-object v0, v2

    :goto_10
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v3, v10}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v3, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v0, v9}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۣۢۢۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sget v0, Landroidx/core/ۧ۟ۤۨ;->ۣۤ۠ۤ:I

    xor-int/lit16 v0, v0, 0x1be

    add-int/2addr v0, v1

    const v1, 0xcdff

    :goto_11
    const v3, 0xce10

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_d

    goto :goto_11

    :sswitch_24
    move v1, v0

    goto/16 :goto_4

    :sswitch_25
    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v11

    const/16 v12, 0x4f8

    const/4 v13, 0x1

    const/16 v14, 0x333

    invoke-static {v11, v12, v13, v14}, Landroidx/activity/ۣۦۡۥ;->۟ۡۨ۟۟([SIII)Ljava/lang/String;

    move-result-object v11

    invoke-static {v0, v11}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    goto :goto_10

    :sswitch_26
    const v1, 0xce1e

    goto :goto_11

    :catch_0
    move-exception v0

    invoke-static {v0}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۤ۟۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v2

    const/16 v3, 0x4f9

    sget v4, Landroidx/activity/ۨ۠۟ۧ;->۟ۦۥۢۢ:I

    xor-int/lit16 v4, v4, 0x324

    const/16 v5, 0x79b

    invoke-static {v2, v3, v4, v5}, Landroidx/activity/ۤۧۧۧ;->ۣ۟۟۠ۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۨ۟(Ljava/lang/Object;)V

    :sswitch_27
    return-void

    :sswitch_28
    move-object v3, v2

    goto/16 :goto_9

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_27
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_27
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_8
        0x2d -> :sswitch_27
        0x4c -> :sswitch_a
        0xef -> :sswitch_9
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_b
        0x35 -> :sswitch_f
        0x1f7 -> :sswitch_c
        0x7eef -> :sswitch_d
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_e
        0x32 -> :sswitch_27
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_10
        0x33 -> :sswitch_16
        0x54 -> :sswitch_12
        0xf1 -> :sswitch_11
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_13
        0x6af -> :sswitch_14
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0xf1 -> :sswitch_15
        0x7ab -> :sswitch_20
        0x7c8 -> :sswitch_25
        0x7e9 -> :sswitch_21
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x13 -> :sswitch_17
        0x2d -> :sswitch_28
        0x32 -> :sswitch_18
        0x4c -> :sswitch_19
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x12 -> :sswitch_1a
        0x35 -> :sswitch_1f
        0xf3 -> :sswitch_1b
        0xfeb -> :sswitch_1c
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0x11 -> :sswitch_1d
        0x36 -> :sswitch_1e
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
    .end packed-switch

    :sswitch_data_c
    .sparse-switch
        0x17 -> :sswitch_22
        0x36 -> :sswitch_23
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0xe -> :sswitch_24
        0x3ef -> :sswitch_26
    .end sparse-switch
.end method

.method static synthetic lambda$30(Ljava/io/File;)Z
    .locals 9

    const/4 v1, 0x0

    const/4 v6, 0x0

    const-string v4, "\u06e3\u06e0\u06e4"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move v5, v6

    move v7, v6

    move v8, v6

    :goto_0
    invoke-static {v4}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    return v5

    :sswitch_0
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v1

    const-string v4, "\u06e7\u06e7\u06e6"

    move-object v2, v1

    goto :goto_0

    :sswitch_1
    invoke-static {v3, v0}, Landroidx/activity/ۤۧۧۧ;->۟۟ۤۧ۠(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const-string v1, "\u06e0\u06e5\u06df"

    move-object v4, v1

    goto :goto_0

    :sswitch_2
    const/16 v0, 0x50a

    const/16 v1, 0x207

    invoke-static {v2, v0, v8, v1}, Landroidx/customview/ۡۤۡۤ;->ۧ۟ۤۨ([SIII)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e6\u06e2\u06df"

    move-object v4, v1

    goto :goto_0

    :sswitch_3
    sget v6, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    const-string v1, "\u06e3\u06e0"

    move-object v4, v1

    move v7, v6

    goto :goto_0

    :sswitch_4
    invoke-static {p0}, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۡۦۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "\u06e6\u06e8\u06df"

    move-object v3, v1

    goto :goto_0

    :sswitch_5
    xor-int/lit16 v6, v7, 0x3a4

    const-string v1, "\u06e3\u06e3\u06e0"

    move-object v4, v1

    move v8, v6

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdc5d -> :sswitch_5
        0x1ab627 -> :sswitch_4
        0x1ab680 -> :sswitch_2
        0x1ac1a3 -> :sswitch_1
        0x1ac25d -> :sswitch_0
        0x1ac606 -> :sswitch_3
    .end sparse-switch
.end method

.method static synthetic lambda$31(Ljava/io/File;Ljava/io/File;)I
    .locals 8

    const-wide/16 v4, 0x0

    const/4 v1, 0x0

    const-string v0, "\u06e5\u06e1\u06df"

    move-wide v2, v4

    move-wide v6, v4

    :goto_0
    invoke-static {v0}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-static {p0}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟ۤۤۧ۠(Ljava/lang/Object;)J

    move-result-wide v4

    const-string v0, "\u06df\u06e6\u06e3"

    move-wide v6, v4

    goto :goto_0

    :sswitch_0
    invoke-static {v2, v3, v6, v7}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۢ۠ۦۨ(JJ)I

    move-result v1

    const-string v0, "\u06e2\u06e1\u06e3"

    goto :goto_0

    :sswitch_1
    invoke-static {p1}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟ۤۤۧ۠(Ljava/lang/Object;)J

    move-result-wide v2

    const-string v0, "\u06e5\u06df\u06e4"

    goto :goto_0

    :sswitch_2
    return v1

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa7dc -> :sswitch_0
        0x1ab284 -> :sswitch_2
        0x1abdc3 -> :sswitch_1
    .end sparse-switch
.end method

.method static synthetic lambda$32(Landroid/app/Activity;)V
    .locals 4

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v1, 0x50e

    sget v2, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۣۧۢ:I

    xor-int/lit16 v2, v2, -0x3ce

    const/16 v3, 0x9bd

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟۟۟ۦۢ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lkevin/fun/hook/VoiceAssistantHook;->ۣ۟۟ۡۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->۟ۤۧۦ۟()V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۧ۟ۤ()Ljava/lang/Runnable;

    move-result-object v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۧ۟ۤ()Ljava/lang/Runnable;

    move-result-object v0

    const/4 v1, 0x0

    sput-object v1, Lkevin/fun/hook/VoiceAssistantHook;->onReplaceCompleteCallback:Ljava/lang/Runnable;

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۣ۠ۢۥ(Ljava/lang/Object;)V

    :sswitch_3
    invoke-static {}, Landroidx/customview/ۤۡۥ;->۟ۢۢۦ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-gtz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const-string v0, "tkUFbNqCqTGsyuM1FIkTKQ"

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۧ۟۠ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_7
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch
.end method

.method static synthetic lambda$33(Landroid/app/Activity;Landroid/view/View;)V
    .locals 9

    const/4 v7, 0x0

    const/4 v1, 0x0

    const-string v5, "\u06e5\u06e5\u06e1"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move v6, v7

    move v8, v7

    :goto_0
    invoke-static {v5}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    const/16 v1, 0x519

    const/16 v2, 0x69e

    invoke-static {v3, v1, v8, v2}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۡۤۥ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v5, "\u06e7\u06e1\u06e1"

    move-object v2, v1

    goto :goto_0

    :sswitch_0
    new-instance v1, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda28;

    invoke-direct {v1, p1, p0}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda28;-><init>(Landroid/view/View;Landroid/app/Activity;)V

    const-string v5, "\u06e7\u06e3\u06df"

    move-object v4, v1

    goto :goto_0

    :sswitch_1
    move-object v0, p1

    check-cast v0, Landroid/widget/Button;

    const-string v1, "\u06df\u06e8\u06e0"

    move-object v5, v1

    goto :goto_0

    :sswitch_2
    sget v6, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    const-string v1, "\u06e0\u06df"

    move-object v5, v1

    goto :goto_0

    :sswitch_3
    invoke-static {v4}, Lkevin/fun/hook/VoiceAssistantHook;->۟ۥۨۢۧ(Ljava/lang/Object;)V

    const-string v1, "\u06e2\u06e3\u06df"

    move-object v5, v1

    goto :goto_0

    :sswitch_4
    invoke-static {p1, v7}, Landroidx/loader/ۡۢۢ;->ۥۣۤ۟(Ljava/lang/Object;Z)V

    const-string v1, "\u06e8\u06df\u06e5"

    move-object v5, v1

    goto :goto_0

    :sswitch_5
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v1

    const-string v5, "\u06e3\u06e6\u06e5"

    move-object v3, v1

    goto :goto_0

    :sswitch_6
    invoke-static {v0, v2}, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۣۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e5\u06e4\u06e7"

    move-object v5, v1

    goto :goto_0

    :sswitch_7
    xor-int/lit16 v8, v6, 0x3a6

    const-string v1, "\u06df\u06e4\u06e0"

    move-object v5, v1

    goto :goto_0

    :sswitch_8
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbff -> :sswitch_7
        0x1aa817 -> :sswitch_5
        0x1ab2be -> :sswitch_8
        0x1ab6e2 -> :sswitch_2
        0x1abe28 -> :sswitch_0
        0x1abe41 -> :sswitch_4
        0x1ac547 -> :sswitch_6
        0x1ac583 -> :sswitch_3
        0x1ac8ce -> :sswitch_1
    .end sparse-switch
.end method

.method static synthetic lambda$34(Landroid/view/View;Landroid/app/Activity;)V
    .locals 4

    const/4 v1, 0x0

    const-string v3, "\u06e7\u06e8\u06df"

    move-object v0, v1

    move-object v2, v1

    :goto_0
    invoke-static {v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۤۧۡۨ()Landroid/os/Handler;

    move-result-object v1

    const-string v3, "\u06e6\u06e0\u06e7"

    move-object v2, v1

    goto :goto_0

    :sswitch_0
    new-instance v0, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda21;

    invoke-direct {v0, p0, p1}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda21;-><init>(Landroid/view/View;Landroid/app/Activity;)V

    const-string v1, "\u06e2\u06e3\u06e5"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    invoke-static {v2, v0}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    const-string v1, "\u06e7\u06e4\u06e4"

    move-object v3, v1

    goto :goto_0

    :sswitch_2
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1ab2c4 -> :sswitch_1
        0x1ac16d -> :sswitch_0
        0x1ac5a7 -> :sswitch_2
    .end sparse-switch
.end method

.method static synthetic lambda$35(Landroid/view/View;Landroid/app/Activity;)V
    .locals 4

    const/4 v0, 0x1

    invoke-static {p0, v0}, Landroidx/loader/ۡۢۢ;->ۥۣۤ۟(Ljava/lang/Object;Z)V

    check-cast p0, Landroid/widget/Button;

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v1, 0x51f

    sget v2, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۦۣۧ:I

    xor-int/lit8 v2, v2, -0x79

    const/16 v3, 0x2c7

    invoke-static {v0, v1, v2, v3}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣۣ۟ۤۤ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۣۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1}, Lkevin/fun/hook/VoiceAssistantHook;->ۢ۟ۥۦ(Ljava/lang/Object;)V

    invoke-static {}, Landroidx/documentfile/ۡۢ۟ۥ;->۟۟ۧۢۡ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "VNcDGou"

    invoke-static {v0}, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۧۤ۟ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method static synthetic lambda$36(Lkevin/fun/hook/VoiceAssistantHook$AudioAdapter;Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz p3, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->۟ۦۥۣۢ()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۥۨۨ۠(Ljava/lang/Object;)I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-ge p3, v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->۟ۦۥۣۢ()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, p3}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۦۣ۟۠(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkevin/fun/hook/VoiceAssistantHook$AudioItem;

    invoke-static {v0}, Lkevin/fun/hook/VoiceAssistantHook;->ۣۣ۠ۧ(Ljava/lang/Object;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/VoiceAssistantHook;->selectedAudio:Landroid/net/Uri;

    invoke-static {p0}, Lkevin/fun/hook/VoiceAssistantHook;->ۣۧۤ۠(Ljava/lang/Object;)V

    :sswitch_6
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_6
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_6
        0x1f4 -> :sswitch_5
    .end sparse-switch
.end method

.method static synthetic lambda$37(Landroid/view/View;)V
    .locals 0

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->۟ۡۥۢۨ()V

    return-void
.end method

.method static synthetic lambda$38(Landroid/app/Activity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lkevin/fun/hook/VoiceAssistantHook;->ۣ۟ۨۧ(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic lambda$39(Landroid/widget/ListView;)V
    .locals 2

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۤۧۡۨ()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda6;

    invoke-direct {v1, p0}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda6;-><init>(Landroid/widget/ListView;)V

    invoke-static {v0, v1}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-static {}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۤۡۥۣ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "crbW15JcMuk8cU3"

    invoke-static {v0}, Landroidx/startup/۟ۦۤۨۧ;->۟۟۟ۨۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method static synthetic lambda$4(Ljava/util/Map;Landroid/content/Context;)V
    .locals 2

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۣۥ()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Landroidx/loader/ۣ۟۟ۧ۠;->۟ۥۧ۠۟(Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۣۥ()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0, p0}, Landroidx/customview/ۤۡۥ;->ۣۤۢۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۣۥ()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۡۧۡ(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۣۥ()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Landroidx/viewpager/ۣۢ۟ۤ;->ۥۨۤۨ(Ljava/lang/Object;)Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Landroidx/interpolator/۟ۧۦ۟ۨ;->۟ۦۦۧۨ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v0

    invoke-static {v0}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۦۥۦۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    sput-object v0, Lkevin/fun/hook/VoiceAssistantHook;->selectedVoiceId:Ljava/lang/String;

    :sswitch_3
    invoke-static {p1}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۥۢۥ(Ljava/lang/Object;)V

    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method static synthetic lambda$40(Landroid/widget/ListView;)V
    .locals 3

    invoke-static {p0}, Landroidx/vectordrawable/۟ۤۨۥۣ;->۟ۡۨۧۤ(Ljava/lang/Object;)Landroid/widget/ListAdapter;

    move-result-object v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/vectordrawable/۟ۤۨۥۣ;->۟ۡۨۧۤ(Ljava/lang/Object;)Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Lkevin/fun/hook/VoiceAssistantHook$AudioAdapter;

    invoke-static {v0}, Lkevin/fun/hook/VoiceAssistantHook;->ۣۧۤ۠(Ljava/lang/Object;)V

    :sswitch_3
    invoke-static {}, Landroidx/core/ktx/۟۟ۨۧ۠;->ۣ۟ۦۣۡ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-gtz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const-string v0, "Xn"

    invoke-static {v0}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۧۢ۟ۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

    :sswitch_7
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch
.end method

.method static synthetic lambda$41(Ljava/lang/Runnable;)V
    .locals 5

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۣۨۤۢ()Ljava/lang/ref/WeakReference;

    move-result-object v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۣۨۤۢ()Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟ۦ۟ۡ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v1, 0x6eb

    goto :goto_1

    :sswitch_4
    const/4 v0, 0x0

    :sswitch_5
    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-nez v0, :cond_1

    const v1, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_7
    const v1, 0xbe41

    goto :goto_2

    :sswitch_8
    invoke-static {}, Landroidx/loader/ۢۥ۟;->۟ۦۦۨۢ()I

    move-result v1

    const v0, 0xbe7f

    :goto_3
    const v2, 0xbe90

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_9
    const v0, 0xbebd

    goto :goto_3

    :sswitch_a
    if-ltz v1, :cond_2

    const v0, 0xbedc

    goto :goto_3

    :sswitch_b
    const-string v0, "VjK9NWpVH2wlwO"

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۧ۟۠ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :goto_4
    :sswitch_c
    return-void

    :sswitch_d
    invoke-static {v0}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۣۣ۟(Ljava/lang/Object;)Landroid/net/Uri;

    move-result-object v3

    const v1, 0xbefb

    :goto_5
    const v4, 0xbf0c

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_4

    goto :goto_5

    :cond_3
    :sswitch_e
    const v1, 0xbf39

    goto :goto_5

    :sswitch_f
    if-nez v3, :cond_3

    const v1, 0xc1e3

    goto :goto_5

    :sswitch_10
    invoke-static {v0, v3}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۨۨۤۦ(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/documentfile/provider/DocumentFile;

    move-result-object v0

    invoke-static {v0, v2}, Lkevin/fun/hook/VoiceAssistantHook;->۟۠ۢ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->۟ۦۥۣۢ()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Landroidx/core/ۤۦ۟ۢ;->ۡۢۦ۟(Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->۟ۦۥۣۢ()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v2}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۤۦۣۤ(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->۟ۦۡ۠ۡ()J

    move-result-wide v0

    sput-wide v0, Lkevin/fun/hook/VoiceAssistantHook;->lastScanTime:J

    const v0, 0xc202

    :goto_6
    const v1, 0xc213

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :sswitch_11
    if-eqz p0, :cond_4

    const v0, 0xc25f

    goto :goto_6

    :cond_4
    :sswitch_12
    const v0, 0xc240

    goto :goto_6

    :sswitch_13
    invoke-static {p0}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۣ۠ۢۥ(Ljava/lang/Object;)V

    goto :goto_4

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_d
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_c
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_e
        0x35 -> :sswitch_10
        0x1f7 -> :sswitch_f
        0x7eef -> :sswitch_c
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_11
        0x32 -> :sswitch_12
        0x4c -> :sswitch_13
        0x53 -> :sswitch_c
    .end sparse-switch
.end method

.method static synthetic lambda$42(Landroid/app/Activity;)V
    .locals 8

    const/4 v1, 0x0

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v2, 0x521

    sget v3, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    xor-int/lit16 v3, v3, 0x17f

    const/16 v4, 0xc41

    invoke-static {v0, v2, v3, v4}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۤ۟۠([SIII)Ljava/lang/String;

    move-result-object v4

    :try_start_0
    new-instance v2, Ljava/io/File;

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۣۣۥۢ()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Landroidx/vectordrawable/ۢۤۡۤ;->ۡ۠ۤ۠(Ljava/lang/Object;)Z

    move-result v3

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez v3, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v2}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۧۤۢۦ(Ljava/lang/Object;)Z

    move-result v3

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v3, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v1, 0x527

    sget v2, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    xor-int/lit16 v2, v2, 0xcb

    const/16 v3, 0x4d0

    invoke-static {v0, v1, v2, v3}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۧۡۥۡ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lkevin/fun/hook/VoiceAssistantHook;->ۣ۟۟ۡۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_2
    :sswitch_6
    return-void

    :sswitch_7
    new-instance v0, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda18;

    invoke-direct {v0}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda18;-><init>()V

    invoke-static {v2, v0}, Landroidx/customview/ۡۤۡۤ;->ۣۥۨۡ(Ljava/lang/Object;Ljava/lang/Object;)[Ljava/io/File;

    move-result-object v2

    const/16 v0, 0x748

    :goto_3
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_3

    :sswitch_8
    if-eqz v2, :cond_2

    const v0, 0xbe60

    goto :goto_3

    :cond_2
    :sswitch_9
    const v0, 0xbe41

    goto :goto_3

    :sswitch_a
    array-length v3, v2

    const v0, 0xbe7f

    :goto_4
    const v5, 0xbe90

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_3

    goto :goto_4

    :cond_3
    :sswitch_b
    const v0, 0xbebd

    goto :goto_4

    :sswitch_c
    if-nez v3, :cond_3

    const v0, 0xbedc

    goto :goto_4

    :sswitch_d
    const v0, 0xbefb

    :goto_5
    const v1, 0xbf0c

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_4

    goto :goto_5

    :sswitch_e
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v1, 0x540

    sget v2, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۨۤۨۡ:I

    xor-int/lit16 v2, v2, -0x3b5

    const/16 v3, 0x562

    invoke-static {v0, v1, v2, v3}, Landroidx/core/ۧ۟ۤۨ;->ۡۥ۟ۥ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lkevin/fun/hook/VoiceAssistantHook;->ۣ۟۟ۡۧ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    invoke-static {}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۤ۠ۧۡ()I

    move-result v1

    const v0, 0xd182

    :goto_6
    const v2, 0xd193

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :sswitch_f
    if-gtz v1, :cond_b

    const v0, 0xd1df

    goto :goto_6

    :sswitch_10
    const v0, 0xbf1a

    goto :goto_5

    :sswitch_11
    :try_start_1
    new-instance v0, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda19;

    invoke-direct {v0}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda19;-><init>()V

    invoke-static {v2, v0}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟۠ۨ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x0

    aget-object v0, v2, v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :try_start_2
    invoke-static {p0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۨۢۢۥ(Ljava/lang/Object;)Landroid/content/ContentResolver;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->۟ۡ۟ۡۦ()Landroid/net/Uri;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۣۨۡ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/io/InputStream;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    move-result-object v3

    :try_start_3
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    const/16 v0, 0x2000

    :try_start_4
    new-array v5, v0, [B

    :sswitch_12
    invoke-static {v3, v5}, Landroidx/loader/ۥۧۨۤ;->ۦۥ۠۠(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v6

    const v0, 0xc202

    :goto_7
    const v7, 0xc213

    xor-int/2addr v0, v7

    sparse-switch v0, :sswitch_data_6

    goto :goto_7

    :sswitch_13
    if-gtz v6, :cond_4

    const v0, 0xc25f

    goto :goto_7

    :cond_4
    :sswitch_14
    const v0, 0xc240

    goto :goto_7

    :sswitch_15
    invoke-static {v2}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۦۢۡۢ(Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۤۧۡۨ()Landroid/os/Handler;

    move-result-object v0

    new-instance v5, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda20;

    invoke-direct {v5, p0}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda20;-><init>(Landroid/app/Activity;)V

    invoke-static {v0, v5}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    invoke-static {v2}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۡ۠ۨ۠(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    const v0, 0xc27e

    :goto_8
    const v2, 0xc28f

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_7

    goto :goto_8

    :cond_5
    :sswitch_16
    const v0, 0xc2bc

    goto :goto_8

    :sswitch_17
    if-eqz v3, :cond_5

    const v0, 0xc2db

    goto :goto_8

    :sswitch_18
    :try_start_6
    invoke-static {v3}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟ۦۣۦۣ(Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    const v0, 0xc2fa

    :goto_9
    const v1, 0xc30b

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_8

    goto :goto_9

    :sswitch_19
    const v0, 0xc5a4

    goto :goto_9

    :sswitch_1a
    const/4 v0, 0x0

    :try_start_7
    invoke-static {v2, v5, v0, v6}, Landroidx/drawerlayout/ۤۨۡۤ;->۟۠ۦۤۧ(Ljava/lang/Object;Ljava/lang/Object;II)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    const v0, 0xc601

    :goto_a
    const v6, 0xc612

    xor-int/2addr v0, v6

    sparse-switch v0, :sswitch_data_9

    goto :goto_a

    :sswitch_1b
    const v0, 0xc620

    goto :goto_a

    :catchall_0
    move-exception v0

    move-object v1, v0

    :try_start_8
    invoke-static {v2}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۡ۠ۨ۠(Ljava/lang/Object;)V

    throw v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :catchall_1
    move-exception v0

    const v2, 0xc67d

    :goto_b
    const v5, 0xc68e

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_a

    goto :goto_b

    :cond_6
    :sswitch_1c
    const v2, 0xc6bb

    goto :goto_b

    :sswitch_1d
    if-nez v1, :cond_6

    const v2, 0xc965

    goto :goto_b

    :sswitch_1e
    const v1, 0xc984

    :goto_c
    const v2, 0xc995

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_b

    goto :goto_c

    :sswitch_1f
    const v1, 0xc9a3

    goto :goto_c

    :sswitch_20
    const v2, 0xca00

    :goto_d
    const v5, 0xca11

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_c

    goto :goto_d

    :cond_7
    :sswitch_21
    const v2, 0xca3e

    goto :goto_d

    :sswitch_22
    if-eq v1, v0, :cond_7

    const v2, 0xca5d

    goto :goto_d

    :sswitch_23
    :try_start_9
    invoke-static {v1, v0}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۨ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    move-object v0, v1

    :goto_e
    :sswitch_24
    const v1, 0xca7c

    :goto_f
    const v2, 0xca8d

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_d

    goto :goto_f

    :sswitch_25
    if-eqz v3, :cond_8

    const v1, 0xcd64

    goto :goto_f

    :cond_8
    :sswitch_26
    const v1, 0xcd45

    goto :goto_f

    :sswitch_27
    :try_start_a
    invoke-static {v3}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟ۦۣۦۣ(Ljava/lang/Object;)V

    :sswitch_28
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    :catchall_2
    move-exception v1

    move-object v2, v1

    move-object v3, v0

    :goto_10
    const v0, 0xcd83

    :goto_11
    const v1, 0xcd94

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_e

    goto :goto_11

    :sswitch_29
    if-eqz v3, :cond_9

    const v0, 0xcde0

    goto :goto_11

    :cond_9
    :sswitch_2a
    const v0, 0xcdc1

    goto :goto_11

    :sswitch_2b
    const v0, 0xcdff

    :goto_12
    const v1, 0xce10

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_f

    goto :goto_12

    :cond_a
    :sswitch_2c
    const v0, 0xce3d

    goto :goto_12

    :sswitch_2d
    if-eq v3, v2, :cond_a

    const v0, 0xd0e7

    goto :goto_12

    :sswitch_2e
    :try_start_b
    invoke-static {v3, v2}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۨ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_13
    :sswitch_2f
    throw v3
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_0
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_1

    :catch_0
    move-exception v0

    :try_start_c
    invoke-static {v0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟۟ۦۨۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v3

    const/16 v5, 0x52f

    sget v6, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    xor-int/lit16 v6, v6, -0x11a

    const/16 v7, 0x59b

    invoke-static {v3, v5, v6, v7}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦۣ۠ۤ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۨ۟(Ljava/lang/Object;)V

    invoke-static {v0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟۟ۦۨۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v1, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lkevin/fun/hook/VoiceAssistantHook;->ۣ۟۟ۡۧ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_1

    const v0, 0xd106

    :goto_14
    const v1, 0xd117

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_10

    goto :goto_14

    :sswitch_30
    const v0, 0xd125

    goto :goto_14

    :cond_b
    :sswitch_31
    const v0, 0xd1c0

    goto/16 :goto_6

    :sswitch_32
    const-string v0, "Y0yItaWHXpIEs"

    invoke-static {v0}, Landroidx/core/ۤۦ۟ۢ;->ۣ۟۟ۧۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    goto/16 :goto_2

    :catch_1
    move-exception v0

    invoke-static {v0}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣۡۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v3

    const/16 v5, 0x551

    sget v6, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۣۧۢ:I

    xor-int/lit16 v6, v6, -0x3ca

    const/16 v7, 0xc9b

    invoke-static {v3, v5, v6, v7}, Landroidx/appcompat/ۣۧۤۢ;->ۢۥۢ۟([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۨ۟(Ljava/lang/Object;)V

    invoke-static {v0}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۤ۟۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v1, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lkevin/fun/hook/VoiceAssistantHook;->ۣ۟۟ۡۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_2

    :catchall_3
    move-exception v0

    move-object v2, v0

    move-object v3, v1

    goto/16 :goto_10

    :catchall_4
    move-exception v0

    move-object v2, v0

    move-object v3, v1

    goto/16 :goto_10

    :sswitch_33
    move-object v3, v2

    goto/16 :goto_13

    :sswitch_34
    move-object v0, v1

    goto/16 :goto_e

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_7
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_8
        0xb918 -> :sswitch_e
        0xb939 -> :sswitch_a
        0xb97b -> :sswitch_9
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_b
        0x2d -> :sswitch_11
        0x4c -> :sswitch_d
        0xef -> :sswitch_c
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_e
        0x1f7 -> :sswitch_10
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_31
        0x4c -> :sswitch_32
        0x53 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x11 -> :sswitch_13
        0x32 -> :sswitch_14
        0x4c -> :sswitch_15
        0x53 -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x12 -> :sswitch_16
        0x33 -> :sswitch_6
        0x54 -> :sswitch_18
        0xf1 -> :sswitch_17
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x1f1 -> :sswitch_19
        0x6af -> :sswitch_6
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x13 -> :sswitch_1b
        0x32 -> :sswitch_12
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x12 -> :sswitch_1c
        0x35 -> :sswitch_20
        0xf3 -> :sswitch_1d
        0xfeb -> :sswitch_1e
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0x11 -> :sswitch_1f
        0x36 -> :sswitch_24
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xe -> :sswitch_21
        0x11 -> :sswitch_22
        0x2f -> :sswitch_34
        0x4c -> :sswitch_23
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0xf1 -> :sswitch_25
        0x7ab -> :sswitch_26
        0x7c8 -> :sswitch_28
        0x7e9 -> :sswitch_27
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0x17 -> :sswitch_29
        0x36 -> :sswitch_2a
        0x55 -> :sswitch_33
        0x74 -> :sswitch_2b
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0xe -> :sswitch_2c
        0x2d -> :sswitch_2f
        0x3ef -> :sswitch_2d
        0x1ef7 -> :sswitch_2e
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x11 -> :sswitch_30
        0x32 -> :sswitch_6
    .end sparse-switch
.end method

.method static synthetic lambda$43(Ljava/io/File;)Z
    .locals 9

    const/4 v1, 0x0

    const/4 v6, 0x0

    const-string v4, "\u06e0\u06e3\u06e6"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move v5, v6

    move v7, v6

    move v8, v6

    :goto_0
    invoke-static {v4}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    sget v6, Landroidx/customview/ۡۤۡۤ;->۟ۦ۟ۨۨ:I

    const-string v1, "\u06e8\u06e1\u06e5"

    move-object v4, v1

    move v7, v6

    goto :goto_0

    :sswitch_0
    xor-int/lit16 v6, v7, 0xf7

    const-string v1, "\u06e7\u06e5\u06e3"

    move-object v4, v1

    move v8, v6

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۡۦۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e7\u06e2\u06df"

    move-object v4, v1

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v1

    const-string v4, "\u06e4\u06e1\u06e7"

    move-object v2, v1

    goto :goto_0

    :sswitch_3
    invoke-static {v0, v3}, Landroidx/activity/ۤۧۧۧ;->۟۟ۤۧ۠(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const-string v1, "\u06e5\u06e0\u06e1"

    move-object v4, v1

    goto :goto_0

    :sswitch_4
    const/16 v1, 0x560

    const/16 v3, 0xc26

    invoke-static {v2, v1, v8, v3}, Landroidx/emoji2/ۢۧۡۧ;->۟ۥۢ۟ۢ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v4, "\u06e2\u06e1\u06e3"

    move-object v3, v1

    goto :goto_0

    :sswitch_5
    return v5

    :sswitch_data_0
    .sparse-switch
        0x1aab43 -> :sswitch_1
        0x1ab284 -> :sswitch_3
        0x1abda6 -> :sswitch_5
        0x1ac564 -> :sswitch_2
        0x1ac5c5 -> :sswitch_4
        0x1ac90c -> :sswitch_0
    .end sparse-switch
.end method

.method static synthetic lambda$44(Ljava/io/File;Ljava/io/File;)I
    .locals 8

    const-wide/16 v4, 0x0

    const/4 v1, 0x0

    const-string v0, "\u06e4\u06e7\u06e2"

    move-wide v2, v4

    move-wide v6, v4

    :goto_0
    invoke-static {v0}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    return v1

    :sswitch_0
    invoke-static {p1}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟ۤۤۧ۠(Ljava/lang/Object;)J

    move-result-wide v2

    const-string v0, "\u06e6\u06e0\u06df"

    goto :goto_0

    :sswitch_1
    invoke-static {v2, v3, v6, v7}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۢ۠ۦۨ(JJ)I

    move-result v1

    const-string v0, "\u06e8\u06e0\u06e1"

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟ۤۤۧ۠(Ljava/lang/Object;)J

    move-result-wide v4

    const-string v0, "\u06e6\u06df\u06e6"

    move-wide v6, v4

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1ababf -> :sswitch_0
        0x1ac14d -> :sswitch_1
        0x1ac165 -> :sswitch_2
    .end sparse-switch
.end method

.method static synthetic lambda$45(Landroid/app/Activity;)V
    .locals 4

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v1, 0x564

    sget v2, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۥۧ۟:I

    xor-int/lit8 v2, v2, 0x1b

    const/16 v3, 0x1cb

    invoke-static {v0, v1, v2, v3}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣ۟۠ۢۡ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lkevin/fun/hook/VoiceAssistantHook;->ۣ۟۟ۡۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->۟ۤۧۦ۟()V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۧ۟ۤ()Ljava/lang/Runnable;

    move-result-object v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۧ۟ۤ()Ljava/lang/Runnable;

    move-result-object v0

    const/4 v1, 0x0

    sput-object v1, Lkevin/fun/hook/VoiceAssistantHook;->onReplaceCompleteCallback:Ljava/lang/Runnable;

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۣ۠ۢۥ(Ljava/lang/Object;)V

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method static synthetic lambda$46(Landroid/content/Context;Ljava/lang/String;)V
    .locals 6

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez p0, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۣ۟ۢۤۤ()Ljava/lang/ref/WeakReference;

    move-result-object v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۣ۟ۢۤۤ()Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟ۦ۟ۡ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz v1, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۣ۟ۢۤۤ()Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟ۦ۟ۡ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Dialog;

    invoke-static {v0}, Lkevin/fun/hook/۟ۥ۠۠;->۟ۥۧ۠۟(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object p0

    :sswitch_9
    const v0, 0xbe7f

    :goto_3
    const v1, 0xbe90

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_3
    :sswitch_a
    const v0, 0xbebd

    goto :goto_3

    :sswitch_b
    if-nez p0, :cond_3

    const v0, 0xbedc

    goto :goto_3

    :sswitch_c
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۣۨۤۢ()Ljava/lang/ref/WeakReference;

    move-result-object v1

    const v0, 0xbefb

    :goto_4
    const v2, 0xbf0c

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :cond_4
    :sswitch_d
    const v0, 0xbf39

    goto :goto_4

    :sswitch_e
    if-eqz v1, :cond_4

    const v0, 0xc1e3

    goto :goto_4

    :sswitch_f
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۣۨۤۢ()Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟ۦ۟ۡ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    move-object p0, v0

    :sswitch_10
    const v0, 0xc202

    :goto_5
    const v1, 0xc213

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_5

    goto :goto_5

    :sswitch_11
    if-nez p0, :cond_5

    const v0, 0xc25f

    goto :goto_5

    :cond_5
    :sswitch_12
    const v0, 0xc240

    goto :goto_5

    :sswitch_13
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v1

    const/16 v2, 0x56c

    sget v3, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    xor-int/lit8 v3, v3, -0x28

    const/16 v4, 0x49d

    invoke-static {v1, v2, v3, v4}, Landroidx/activity/ۣۦۡۥ;->۟ۡۨ۟۟([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0, p1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۨ۟(Ljava/lang/Object;)V

    invoke-static {}, Landroidx/loader/ۡۢۢ;->ۢۥۧ۟()I

    move-result v1

    const v0, 0xc27e

    :goto_6
    const v2, 0xc28f

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_6

    goto :goto_6

    :cond_6
    :sswitch_14
    const v0, 0xc2bc

    goto :goto_6

    :sswitch_15
    if-ltz v1, :cond_6

    const v0, 0xc2db

    goto :goto_6

    :sswitch_16
    const-string v0, "MDs"

    invoke-static {v0}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۧۦۦۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :goto_7
    :sswitch_17
    return-void

    :sswitch_18
    const/4 v0, 0x0

    :try_start_0
    invoke-static {p0, p1, v0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۨۡ۠ۢ(Ljava/lang/Object;Ljava/lang/Object;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-static {v0}, Landroidx/viewpager/ۣۢ۟ۤ;->۠۠ۥۣ(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const v0, 0xc2fa

    :goto_8
    const v1, 0xc30b

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_7

    goto :goto_8

    :sswitch_19
    const v0, 0xc5a4

    goto :goto_8

    :catch_0
    move-exception v0

    invoke-static {v0}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۤ۟۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v2

    const/16 v3, 0x57e

    sget v4, Landroidx/activity/ۤۧۧۧ;->۟۟ۢ۠ۡ:I

    xor-int/lit16 v4, v4, 0x1f8

    const/16 v5, 0x426

    invoke-static {v2, v3, v4, v5}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۢ۠ۤۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۨ۟(Ljava/lang/Object;)V

    goto :goto_7

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_10
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_9
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_9
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_a
        0x2d -> :sswitch_10
        0x4c -> :sswitch_c
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_d
        0x35 -> :sswitch_10
        0x1f7 -> :sswitch_e
        0x7eef -> :sswitch_f
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_11
        0x32 -> :sswitch_12
        0x4c -> :sswitch_13
        0x53 -> :sswitch_18
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_14
        0x33 -> :sswitch_17
        0x54 -> :sswitch_16
        0xf1 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_19
        0x6af -> :sswitch_17
    .end sparse-switch
.end method

.method static synthetic lambda$5(Landroid/app/Activity;)V
    .locals 7

    const/4 v2, 0x0

    :try_start_0
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۥۥ۟ۦ()Ljava/lang/ref/WeakReference;

    move-result-object v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۥۥ۟ۦ()Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟ۦ۟ۡ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v1, 0x6eb

    goto :goto_1

    :sswitch_4
    move-object v1, v0

    :goto_2
    const/16 v0, 0x748

    :goto_3
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_3

    :sswitch_5
    if-nez v1, :cond_1

    const v0, 0xbe60

    goto :goto_3

    :sswitch_6
    const/4 v0, 0x0

    move-object v1, v0

    goto :goto_2

    :cond_1
    :sswitch_7
    const v0, 0xbe41

    goto :goto_3

    :sswitch_8
    invoke-static {}, Landroidx/interpolator/ۦۨۢۦ;->ۣۤۦۦ()I

    move-result v1

    const v0, 0xbe7f

    :goto_4
    const v2, 0xbe90

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_3

    goto :goto_4

    :cond_2
    :sswitch_9
    const v0, 0xbebd

    goto :goto_4

    :sswitch_a
    if-ltz v1, :cond_2

    const v0, 0xbedc

    goto :goto_4

    :sswitch_b
    const-string v0, "RCZK24J8Y6lHddeyfORPy"

    invoke-static {v0}, Landroidx/interpolator/ۦۨۢۦ;->ۣۢۨۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :goto_5
    :pswitch_0
    :sswitch_c
    return-void

    :sswitch_d
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۣۥ()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۡۧۡ(Ljava/lang/Object;)Z

    move-result v3

    const v0, 0xbefb

    :goto_6
    const v4, 0xbf0c

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_4

    goto :goto_6

    :cond_3
    :sswitch_e
    const v0, 0xbf39

    goto :goto_6

    :sswitch_f
    if-nez v3, :cond_3

    const v0, 0xc1e3

    goto :goto_6

    :sswitch_10
    new-instance v5, Ljava/util/ArrayList;

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۣۥ()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Landroidx/activity/ۣۦۡۥ;->۟ۥۥۣۡ(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v0, Landroid/widget/ArrayAdapter;

    const v3, 0x109038a

    sget v4, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    xor-int/2addr v3, v4

    invoke-direct {v0, p0, v3, v5}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    const v3, -0x109032c

    sget v4, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    xor-int/2addr v3, v4

    invoke-static {v0, v3}, Landroidx/loader/ۣۦ۟ۡ;->۟ۦۥ۟ۦ(Ljava/lang/Object;I)V

    invoke-static {v1, v0}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣ۟۟ۦۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۣۢۢۤ()Ljava/lang/String;

    move-result-object v3

    const v0, 0xc202

    :goto_7
    const v4, 0xc213

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_5

    goto :goto_7

    :sswitch_11
    if-eqz v3, :cond_4

    const v0, 0xc25f

    goto :goto_7

    :cond_4
    :sswitch_12
    const v0, 0xc240

    goto :goto_7

    :sswitch_13
    invoke-static {v5}, Landroidx/activity/ۤۧۧۧ;->ۡۥۦۦ(Ljava/lang/Object;)Z

    move-result v3

    const v0, 0xc27e

    :goto_8
    const v4, 0xc28f

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_6

    goto :goto_8

    :cond_5
    :sswitch_14
    const v0, 0xc2bc

    goto :goto_8

    :sswitch_15
    if-nez v3, :cond_5

    const v0, 0xc2db

    goto :goto_8

    :sswitch_16
    move v3, v2

    :sswitch_17
    invoke-static {v5}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۥۨۨ۠(Ljava/lang/Object;)I

    move-result v4

    const v0, 0xc2fa

    :goto_9
    const v6, 0xc30b

    xor-int/2addr v0, v6

    sparse-switch v0, :sswitch_data_7

    goto :goto_9

    :sswitch_18
    if-lt v3, v4, :cond_6

    const v0, 0xc5e2

    goto :goto_9

    :cond_6
    :sswitch_19
    const v0, 0xc5c3

    goto :goto_9

    :sswitch_1a
    const v0, 0xc601

    :goto_a
    const v3, 0xc612

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_8

    goto :goto_a

    :sswitch_1b
    const v0, 0xc620

    goto :goto_a

    :sswitch_1c
    move v0, v2

    :goto_b
    invoke-static {v1, v0}, Landroidx/appcompat/ۣۧۤۢ;->ۣ۟ۡۥۡ(Ljava/lang/Object;I)V

    const v0, 0xca00

    :goto_c
    const v1, 0xca11

    xor-int/2addr v0, v1

    packed-switch v0, :pswitch_data_0

    :pswitch_1
    goto :goto_c

    :pswitch_2
    const v0, 0xca1f

    goto :goto_c

    :sswitch_1d
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۣۥ()Ljava/util/Map;

    move-result-object v0

    invoke-static {v5, v3}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۦۣ۟۠(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v0, v4}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->۟ۡۥ۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const v4, 0xc67d

    :goto_d
    const v6, 0xc68e

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_9

    goto :goto_d

    :cond_7
    :sswitch_1e
    const v4, 0xc6bb

    goto :goto_d

    :sswitch_1f
    if-eqz v0, :cond_7

    const v4, 0xc965

    goto :goto_d

    :sswitch_20
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۣۢۢۤ()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v4

    const v0, 0xc984

    :goto_e
    const v6, 0xc995

    xor-int/2addr v0, v6

    sparse-switch v0, :sswitch_data_a

    goto :goto_e

    :sswitch_21
    if-eqz v4, :cond_8

    const v0, 0xc9e1

    goto :goto_e

    :cond_8
    :sswitch_22
    const v0, 0xc9c2

    goto :goto_e

    :sswitch_23
    sget v0, Landroidx/customview/ۤۡۥ;->ۣ۟ۢۥۢ:I

    xor-int/lit8 v0, v0, -0x65

    add-int/2addr v3, v0

    const v0, 0xca7c

    :goto_f
    const v4, 0xca8d

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_b

    goto :goto_f

    :sswitch_24
    const v0, 0xcd26

    goto :goto_f

    :catch_0
    move-exception v0

    invoke-static {v0}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۤ۟۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v2

    const/16 v3, 0x590

    sget v4, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    xor-int/lit16 v4, v4, 0x3b1

    const/16 v5, 0x774

    invoke-static {v2, v3, v4, v5}, Landroidx/versionedparcelable/۠ۡۧۤ;->۟۟ۤۢۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۨ۟(Ljava/lang/Object;)V

    goto/16 :goto_5

    :sswitch_25
    move v0, v3

    goto/16 :goto_b

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_6
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_5
        0xb918 -> :sswitch_d
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_c
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_e
        0x35 -> :sswitch_c
        0x1f7 -> :sswitch_f
        0x7eef -> :sswitch_10
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_11
        0x32 -> :sswitch_12
        0x4c -> :sswitch_13
        0x53 -> :sswitch_c
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_14
        0x33 -> :sswitch_c
        0x54 -> :sswitch_16
        0xf1 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_18
        0x6af -> :sswitch_19
        0x6c8 -> :sswitch_1d
        0x6e9 -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_1b
        0x32 -> :sswitch_1c
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_2
    .end packed-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1e
        0x35 -> :sswitch_23
        0xf3 -> :sswitch_1f
        0xfeb -> :sswitch_20
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_21
        0x36 -> :sswitch_22
        0x57 -> :sswitch_23
        0x74 -> :sswitch_25
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xf1 -> :sswitch_24
        0x7ab -> :sswitch_17
    .end sparse-switch
.end method

.method static synthetic lambda$6(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;Landroid/view/View;)V
    .locals 3

    const/4 v2, 0x0

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۥ۟۟()Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟ۦ۟ۡ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lkevin/fun/hook/VoiceAssistantHook;->۟ۢۥۦۡ(Ljava/lang/Object;Z)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۥ۠ۢ()Ljava/lang/ref/WeakReference;

    move-result-object v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۥ۠ۢ()Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟ۦ۟ۡ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۥ۠ۢ()Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟ۦ۟ۡ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v0, v2}, Lkevin/fun/hook/VoiceAssistantHook;->۟ۢۥۦۡ(Ljava/lang/Object;Z)V

    :sswitch_6
    invoke-static {p0, v2}, Landroidx/loader/ۢۥ۟;->۟ۦۡۥۤ(Ljava/lang/Object;I)V

    sget v0, Landroidx/activity/ۣۦۡۥ;->ۣۢۤۡ:I

    xor-int/lit8 v0, v0, 0xa

    invoke-static {p1, v0}, Landroidx/loader/ۢۥ۟;->۟ۦۡۥۤ(Ljava/lang/Object;I)V

    invoke-static {p2}, Lkevin/fun/hook/VoiceAssistantHook;->ۢ۟ۥۦ(Ljava/lang/Object;)V

    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_6
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_6
        0x1f4 -> :sswitch_5
    .end sparse-switch
.end method

.method static synthetic lambda$7(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/view/View;)V
    .locals 3

    const/4 v2, 0x0

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۥ۠ۢ()Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟ۦ۟ۡ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lkevin/fun/hook/VoiceAssistantHook;->۟ۢۥۦۡ(Ljava/lang/Object;Z)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۥ۟۟()Ljava/lang/ref/WeakReference;

    move-result-object v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۥ۟۟()Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟ۦ۟ۡ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۥ۟۟()Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟ۦ۟ۡ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v0, v2}, Lkevin/fun/hook/VoiceAssistantHook;->۟ۢۥۦۡ(Ljava/lang/Object;Z)V

    :sswitch_6
    sget v0, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۨ۠ۨ:I

    xor-int/lit16 v0, v0, 0x353

    invoke-static {p0, v0}, Landroidx/loader/ۢۥ۟;->۟ۦۡۥۤ(Ljava/lang/Object;I)V

    invoke-static {p1, v2}, Landroidx/loader/ۢۥ۟;->۟ۦۡۥۤ(Ljava/lang/Object;I)V

    invoke-static {}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۤۦۥۥ()I

    move-result v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_7
    if-ltz v1, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_8
    const v0, 0xbe41

    goto :goto_2

    :sswitch_9
    const-string v0, "M7sGhWtdmd5n8p0bKkFv"

    invoke-static {v0}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۤۥۧۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_a
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_6
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_6
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_7
        0xb918 -> :sswitch_a
        0xb939 -> :sswitch_9
        0xb97b -> :sswitch_8
    .end sparse-switch
.end method

.method static synthetic lambda$8(Landroid/app/Activity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lkevin/fun/hook/VoiceAssistantHook;->۟ۤ۟۠ۦ(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic lambda$9(Landroid/view/View;)V
    .locals 0

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->۟ۤۧۦ۟()V

    return-void
.end method

.method private static loadTtsConfig(Landroid/content/Context;)V
    .locals 5

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez p0, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v1, 0x5a1

    sget v2, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    xor-int/lit8 v2, v2, -0x1d

    const/16 v3, 0x3bc

    invoke-static {v0, v1, v2, v3}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۦ۠ۧۨ([SIII)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->۠ۡۤۨ(Ljava/lang/Object;Ljava/lang/Object;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v1

    const/16 v2, 0x5b0

    sget v3, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣۡۢ۟:I

    xor-int/lit16 v3, v3, 0x329

    const/16 v4, 0x6a2

    invoke-static {v1, v2, v3, v4}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۦۣۣۦ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Landroidx/loader/ۡۢۢ;->ۢۨۥ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/VoiceAssistantHook;->ttsApiKey:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->۠۟ۥۦ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/activity/ۨ۠۟ۧ;->۟ۧ۟ۡ۠(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {p0}, Lkevin/fun/hook/VoiceAssistantHook;->۠۠ۨ۟(Ljava/lang/Object;)V

    :sswitch_6
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_6
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_6
        0x1f4 -> :sswitch_5
    .end sparse-switch
.end method

.method private static loadVoiceList(Landroid/content/Context;)V
    .locals 2

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->۠۟ۥۦ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/documentfile/ۡۢ۟ۥ;->ۢۥۦۣ(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->۠ۤۨۧ()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda0;-><init>(Landroid/content/Context;)V

    invoke-static {v0, v1}, Landroidx/activity/ۣۦۡۥ;->۟ۢ۠ۥۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_3
        0xef -> :sswitch_2
    .end sparse-switch
.end method

.method public static onApplicationQuit()V
    .locals 6

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۡۧۨۥ(Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->۠ۤۨۧ()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->۠ۤۨۧ()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-static {v0}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۧ۠ۦ۠(Ljava/lang/Object;)V

    :try_start_0
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->۠ۤۨۧ()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-static {}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣ۟ۥۢۥ()Ljava/util/concurrent/TimeUnit;

    move-result-object v1

    const-wide/16 v2, -0x2e1

    sget v4, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    int-to-long v4, v4

    xor-long/2addr v2, v4

    invoke-static {v0, v2, v3, v1}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۡۡۧ(Ljava/lang/Object;JLjava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->۠ۤۨۧ()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-static {v0}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣ۟ۦۦۢ(Ljava/lang/Object;)Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :catch_0
    move-exception v0

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->۠ۤۨۧ()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-static {v0}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣ۟ۦۦۢ(Ljava/lang/Object;)Ljava/util/List;

    :sswitch_7
    invoke-static {}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۣۨۧۥ()I

    move-result v1

    const v0, 0xbe7f

    :goto_3
    const v2, 0xbe90

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_8
    const v0, 0xbebd

    goto :goto_3

    :sswitch_9
    if-gtz v1, :cond_2

    const v0, 0xbedc

    goto :goto_3

    :sswitch_a
    const-string v0, "uYTWXuL52Q19"

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۡۡۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_b
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_7
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_8
        0x2d -> :sswitch_b
        0x4c -> :sswitch_a
        0xef -> :sswitch_9
    .end sparse-switch
.end method

.method public static onDirectoryPicked(Landroid/app/Activity;Landroid/content/Intent;)V
    .locals 6

    const/16 v1, 0x6ad

    :try_start_0
    invoke-static {p1}, Landroidx/customview/ۡۤۡۤ;->ۨ۠ۥۣ(Ljava/lang/Object;)Landroid/net/Uri;

    move-result-object v2

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez v2, :cond_0

    move v0, v1

    goto :goto_0

    :sswitch_2
    invoke-static {}, Landroidx/loader/ۢۥ۟;->۟ۦۦۨۢ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-ltz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    const-string v0, "cfVxNuEytDdczBLkF"

    invoke-static {v0}, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۣ۟ۤۧۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :goto_2
    :sswitch_6
    return-void

    :sswitch_7
    invoke-static {p0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۨۢۢۥ(Ljava/lang/Object;)Landroid/content/ContentResolver;

    move-result-object v0

    sget v1, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    xor-int/lit16 v1, v1, 0x22d

    invoke-static {v0, v2, v1}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥ(Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v1, 0x5bb

    sget v3, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۣۧۢ:I

    xor-int/lit16 v3, v3, -0x3ca

    const/16 v4, 0xa48

    invoke-static {v0, v1, v3, v4}, Landroidx/loader/ۡۢۢ;->ۡ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroidx/loader/ۡۢۢ;->۟ۤۡۤ۠(Ljava/lang/Object;Ljava/lang/Object;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-static {v0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۣ۟ۦۣ۟(Ljava/lang/Object;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v1

    const/16 v3, 0x5ca

    sget v4, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    xor-int/lit16 v4, v4, -0x255

    const/16 v5, 0x5e5

    invoke-static {v1, v3, v4, v5}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۢۦۣ۠([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۦۧۤۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Landroidx/core/ۧ۟ۤۨ;->۟۠ۨۨۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-static {v0}, Landroidx/vectordrawable/۟ۧۢۧۨ;->۠ۤۦۥ(Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v1, 0x5d7

    sget v2, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    xor-int/lit16 v2, v2, -0x10f

    const/16 v3, 0x6ad

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟ۡۧۨ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lkevin/fun/hook/VoiceAssistantHook;->ۣ۟۟ۡۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda37;

    invoke-direct {v0, p0}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda37;-><init>(Landroid/app/Activity;)V

    invoke-static {v0}, Lkevin/fun/hook/VoiceAssistantHook;->۟ۥۨۢۧ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v0, 0x748

    :goto_3
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_3

    :sswitch_8
    const v0, 0xbe22

    goto :goto_3

    :catchall_0
    move-exception v0

    invoke-static {v0}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣۡۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v2

    const/16 v3, 0x5dd

    sget v4, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    xor-int/lit16 v4, v4, 0x2f1

    const/16 v5, 0x7e7

    invoke-static {v2, v3, v4, v5}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۧۡۥۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۨ۟(Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v1, 0x5ec

    sget v2, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    xor-int/lit8 v2, v2, -0x16

    const/16 v3, 0xa30

    invoke-static {v0, v1, v2, v3}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦۣ۠ۤ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lkevin/fun/hook/VoiceAssistantHook;->ۣ۟۟ۡۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_7
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_6
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_8
        0xb97b -> :sswitch_6
    .end sparse-switch
.end method

.method private static performTtsConversion(Ljava/lang/String;Landroid/widget/TextView;)V
    .locals 5

    const/4 v4, 0x0

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v1, 0x5f2

    sget v2, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    xor-int/lit8 v2, v2, 0x41

    const/16 v3, 0x4e5

    invoke-static {v0, v1, v2, v3}, Landroidx/activity/ۦۧۥۥ;->۟ۤۡۦۦ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v0, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    xor-int/lit16 v0, v0, 0x67ca

    invoke-static {p1, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۥۨ۠()Ljava/lang/String;

    move-result-object v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    :try_start_0
    new-instance v0, Ljava/io/File;

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۥۨ۠()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Landroidx/loader/۟۠ۢۧۡ;->ۣۣ۟ۢۤ(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x6eb

    goto :goto_1

    :catch_0
    move-exception v0

    :sswitch_4
    sput-object v4, Lkevin/fun/hook/VoiceAssistantHook;->currentTtsAudioPath:Ljava/lang/String;

    :sswitch_5
    sput-object v4, Lkevin/fun/hook/VoiceAssistantHook;->currentTtsAudioUrl:Ljava/lang/String;

    invoke-static {p0}, Landroidx/emoji2/ۢۧۡۧ;->ۤۥۨۢ(Ljava/lang/Object;)I

    move-result v1

    sget v0, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    xor-int/lit16 v2, v0, -0x6ea

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-le v1, v2, :cond_1

    const v0, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    const/4 v0, 0x0

    invoke-static {p0, v0, v2}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->۟ۦ۠ۡ۠(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object p0

    const v0, 0xbe7f

    :goto_3
    const v1, 0xbe90

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :sswitch_9
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->۠ۤۨۧ()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda27;

    invoke-direct {v1, p0, p1}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda27;-><init>(Ljava/lang/String;Landroid/widget/TextView;)V

    invoke-static {v0, v1}, Landroidx/activity/ۣۦۡۥ;->۟ۢ۠ۥۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :sswitch_a
    const v0, 0xbe9e

    goto :goto_3

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_5
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_9
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0xef -> :sswitch_a
    .end sparse-switch
.end method

.method private static pickAudioDirectory(Landroid/app/Activity;)V
    .locals 5

    :try_start_0
    new-instance v0, Landroid/content/Intent;

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v1

    const/16 v2, 0x5fa

    sget v3, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    xor-int/lit16 v3, v3, 0x2d6

    const/16 v4, 0x8a2

    invoke-static {v1, v2, v3, v4}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣۣ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    sget v1, Landroidx/customview/ۤۡۥ;->ۣ۟ۢۥۢ:I

    xor-int/lit8 v1, v1, -0x27

    invoke-static {v0, v1}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۢۡۤۨ(Ljava/lang/Object;I)Landroid/content/Intent;

    sget v1, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    xor-int/lit16 v1, v1, -0x26f5

    invoke-static {p0, v0, v1}, Landroidx/core/ۧ۟ۤۨ;->ۦ۟۠ۤ(Ljava/lang/Object;Ljava/lang/Object;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :goto_1
    :sswitch_0
    return-void

    :sswitch_1
    const/16 v0, 0x66f

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v1, 0x622

    sget v2, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۨۤۨۡ:I

    xor-int/lit16 v2, v2, -0x3ae

    const/16 v3, 0x2d0

    invoke-static {v0, v1, v2, v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧ۠ۥ۟([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lkevin/fun/hook/VoiceAssistantHook;->ۣ۟۟ۡۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
    .end sparse-switch
.end method

.method private static playTtsAudio(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 4

    const/4 v1, 0x0

    const-string v3, "\u06e7\u06e8\u06e6"

    move-object v0, v1

    move-object v2, v1

    :goto_0
    invoke-static {v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۤۧۡۨ()Landroid/os/Handler;

    move-result-object v1

    const-string v3, "\u06e8\u06e6\u06e1"

    move-object v2, v1

    goto :goto_0

    :sswitch_0
    new-instance v0, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda34;

    invoke-direct {v0, p1, p0}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda34;-><init>(Ljava/lang/String;Landroid/app/Activity;)V

    const-string v1, "\u06e7\u06e7\u06e6"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    invoke-static {v2, v0}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    const-string v1, "\u06e3\u06e8\u06e1"

    move-object v3, v1

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۦۡۧ()V

    const-string v1, "\u06e6\u06e6\u06e8"

    move-object v3, v1

    goto :goto_0

    :sswitch_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1ab71c -> :sswitch_3
        0x1ac606 -> :sswitch_1
        0x1ac625 -> :sswitch_2
        0x1ac9a3 -> :sswitch_0
    .end sparse-switch
.end method

.method private static pollTtsResult(Ljava/lang/String;Ljava/util/Map;Landroid/widget/TextView;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Landroid/widget/TextView;",
            ")V"
        }
    .end annotation

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v1, 0x62a

    sget v2, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    xor-int/lit8 v2, v2, 0x57

    const/16 v3, 0x63e

    invoke-static {v0, v1, v2, v3}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠۠ۧۥ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v1, 0x62f

    sget v2, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۤۨۨ:I

    xor-int/lit16 v2, v2, 0x10a

    const/16 v4, 0x79b

    invoke-static {v0, v1, v2, v4}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۦۣۣۦ([SIII)Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0x3c

    const/4 v0, 0x0

    :sswitch_0
    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_1
    const/16 v1, 0x68e

    goto :goto_0

    :sswitch_2
    if-lt v0, v5, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_3
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۤۧۡۨ()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda22;

    invoke-direct {v1, p2}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda22;-><init>(Landroid/widget/TextView;)V

    invoke-static {v0, v1}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-static {}, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۤۥ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-ltz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const-string v0, "9JsN02N0"

    invoke-static {v0}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->۟ۢۢۡۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :goto_2
    :sswitch_7
    return-void

    :sswitch_8
    sget v1, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣۡۢ۟:I

    int-to-long v6, v1

    const-wide/16 v8, 0x6fe

    xor-long/2addr v6, v8

    :try_start_0
    invoke-static {v6, v7}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۡۡۥۨ(J)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v2

    const/16 v6, 0x635

    sget v7, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    xor-int/lit8 v7, v7, 0x5a

    const/16 v8, 0x8be

    invoke-static {v2, v6, v7, v8}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣۣ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    move-result-object v1

    :try_start_1
    invoke-static {v1, p0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, Lkevin/fun/hook/VoiceAssistantHook;->ۤۥ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    move-result-object v2

    const/16 v1, 0x748

    :goto_3
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_3

    :sswitch_9
    if-nez v2, :cond_2

    const v1, 0xbe60

    goto :goto_3

    :cond_2
    :sswitch_a
    const v1, 0xbe41

    goto :goto_3

    :sswitch_b
    const v1, 0xbe7f

    :goto_4
    const v2, 0xbe90

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_3

    goto :goto_4

    :goto_5
    :sswitch_c
    sget v1, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۧۨۨ:I

    xor-int/lit8 v1, v1, -0x64

    add-int/2addr v0, v1

    const v1, 0xd182

    :goto_6
    const v2, 0xd193

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_4

    goto :goto_6

    :sswitch_d
    const v1, 0xd1a1

    goto :goto_6

    :sswitch_e
    const v1, 0xbe9e

    goto :goto_4

    :sswitch_f
    :try_start_2
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-static {v6, v4}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v2

    const v1, 0xbefb

    :goto_7
    const v7, 0xbf0c

    xor-int/2addr v1, v7

    sparse-switch v1, :sswitch_data_5

    goto :goto_7

    :cond_3
    :sswitch_10
    const v1, 0xbf39

    goto :goto_7

    :sswitch_11
    const/16 v1, 0xc8

    if-ne v2, v1, :cond_3

    const v1, 0xc1e3

    goto :goto_7

    :sswitch_12
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v1

    const/16 v2, 0x65d

    sget v7, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۤۨۨ:I

    xor-int/lit16 v7, v7, 0x108

    const/16 v8, 0x210

    invoke-static {v1, v2, v7, v8}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۥۡۤۧ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v6, v1}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۡۦۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v1

    const/16 v6, 0x661

    sget v7, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣۡۢ۟:I

    xor-int/lit16 v7, v7, 0x32a

    const/16 v8, 0x97a

    invoke-static {v1, v6, v7, v8}, Landroidx/loader/ۥۧۨۤ;->۟ۢۢ۠ۥ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۡۦۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v6

    invoke-static {v6, v3}, Landroidx/loader/ۢۥ۟;->۟ۤۥۥۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    const v1, 0xc202

    :goto_8
    const v8, 0xc213

    xor-int/2addr v1, v8

    sparse-switch v1, :sswitch_data_6

    goto :goto_8

    :sswitch_13
    if-eqz v7, :cond_4

    const v1, 0xc25f

    goto :goto_8

    :cond_4
    :sswitch_14
    const v1, 0xc240

    goto :goto_8

    :sswitch_15
    invoke-static {v6, v3}, Landroidx/loader/ۡۢۢ;->ۨۥۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v1

    const/16 v8, 0x669

    sget v9, Landroidx/startup/۟ۦۤۨۧ;->ۧۡۡۦ:I

    xor-int/lit16 v9, v9, -0x112

    const/16 v10, 0x771

    invoke-static {v1, v8, v9, v10}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۢ۠ۥۨ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v7, v1}, Landroidx/core/ۧ۟ۤۨ;->ۨۨ۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    const v1, 0xc27e

    :goto_9
    const v9, 0xc28f

    xor-int/2addr v1, v9

    sparse-switch v1, :sswitch_data_7

    goto :goto_9

    :cond_5
    :sswitch_16
    const v1, 0xc2bc

    goto :goto_9

    :sswitch_17
    if-eqz v8, :cond_5

    const v1, 0xc2db

    goto :goto_9

    :sswitch_18
    sput-object v7, Lkevin/fun/hook/VoiceAssistantHook;->currentTtsAudioUrl:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v1

    const/16 v8, 0x66d

    sget v9, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    xor-int/lit8 v9, v9, 0x40

    const/16 v10, 0x6b0

    invoke-static {v1, v8, v9, v10}, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۡۨۧ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroidx/loader/ۡۢۢ;->ۨۥۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v8

    const/16 v9, 0x676

    sget v10, Landroidx/appcompat/ۣۧۤۢ;->۟۠ۡۤۤ:I

    xor-int/lit16 v10, v10, -0xe6

    const/16 v11, 0xb8f

    invoke-static {v8, v9, v10, v11}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۤۦۢۧ([SIII)Ljava/lang/String;

    move-result-object v8

    invoke-static {v2, v8}, Landroidx/loader/ۡۢۢ;->ۨۥۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۤۧۧ(Ljava/lang/Object;)Ljava/time/ZonedDateTime;

    move-result-object v1

    invoke-static {v2}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۤۧۧ(Ljava/lang/Object;)Ljava/time/ZonedDateTime;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/loader/ۡۢۢ;->۟ۦۤۨۢ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/time/Duration;

    move-result-object v1

    invoke-static {v1}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۣ۟ۢۤ۠(Ljava/lang/Object;)J

    move-result-wide v8

    sput-wide v8, Lkevin/fun/hook/VoiceAssistantHook;->currentTtsDuration:J

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v1

    const/16 v2, 0x67f

    sget v8, Landroidx/core/ۧ۟ۤۨ;->ۣۤ۠ۤ:I

    xor-int/lit16 v8, v8, 0x1b7

    const/16 v9, 0xb37

    invoke-static {v1, v2, v8, v9}, Landroidx/loader/ۥۧۨۤ;->۟ۢۢ۠ۥ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v6, v1}, Landroidx/core/ۧ۟ۤۨ;->ۡۨ۟۟(Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move-result-object v1

    const/4 v2, 0x0

    :try_start_3
    invoke-static {v1, v2}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۦۣۡ۠(Ljava/lang/Object;I)Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v2

    const/16 v6, 0x687

    sget v8, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    xor-int/lit16 v8, v8, -0x219

    const/16 v9, 0x658

    invoke-static {v2, v6, v8, v9}, Landroidx/customview/ۤۡۥ;->۟ۢۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۡۦۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v2

    const/16 v6, 0x68e

    sget v8, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v8, v8, 0x202

    const/16 v9, 0x4bc

    invoke-static {v2, v6, v8, v9}, Landroidx/appcompat/ۣۧۤۢ;->ۢۥۢ۟([SIII)Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    move-result-object v2

    const/4 v6, 0x0

    :try_start_4
    invoke-static {v1, v2, v6}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۡ۠ۤۦ(Ljava/lang/Object;Ljava/lang/Object;I)I

    move-result v1

    sput v1, Lkevin/fun/hook/VoiceAssistantHook;->currentTtsCost:I

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v1

    const/16 v2, 0x69a

    sget v6, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۨ۠ۧ:I

    xor-int/lit16 v6, v6, -0x19b

    const/16 v8, 0x515

    invoke-static {v1, v2, v6, v8}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۤ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, Lkevin/fun/hook/VoiceAssistantHook;->ۤۥ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const v1, 0xc2fa

    :goto_a
    const v6, 0xc30b

    xor-int/2addr v1, v6

    sparse-switch v1, :sswitch_data_8

    goto :goto_a

    :sswitch_19
    if-eqz v2, :cond_6

    const v1, 0xc5e2

    goto :goto_a

    :cond_6
    :sswitch_1a
    const v1, 0xc5c3

    goto :goto_a

    :sswitch_1b
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-static {v6, v4}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v2

    const v1, 0xc601

    :goto_b
    const v8, 0xc612

    xor-int/2addr v1, v8

    sparse-switch v1, :sswitch_data_9

    goto :goto_b

    :sswitch_1c
    const/16 v1, 0xc8

    if-ne v2, v1, :cond_7

    const v1, 0xc65e

    goto :goto_b

    :cond_7
    :sswitch_1d
    const v1, 0xc63f

    goto :goto_b

    :sswitch_1e
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v1

    const/16 v2, 0x6c1

    sget v8, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    xor-int/lit16 v8, v8, -0x25e

    const/16 v9, 0x627

    invoke-static {v1, v2, v8, v9}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۢۤۤ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v6, v1}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۡۦۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v2

    const/16 v6, 0x6c5

    sget v8, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۢۥۨۦ:I

    xor-int/lit16 v8, v8, 0x294

    const/16 v9, 0x237

    invoke-static {v2, v6, v8, v9}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟۟۠ۤۤ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v1

    sput v1, Lkevin/fun/hook/VoiceAssistantHook;->currentTtsRemaining:I

    const v1, 0xc67d

    :goto_c
    const v2, 0xc68e

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_a

    goto :goto_c

    :sswitch_1f
    invoke-static {v7, p2}, Lkevin/fun/hook/VoiceAssistantHook;->ۣ۟ۡۢ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    goto/16 :goto_2

    :catch_0
    move-exception v1

    const v2, 0xc984

    :goto_d
    const v6, 0xc995

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_b

    goto :goto_d

    :sswitch_20
    const v2, 0xc9a3

    goto :goto_d

    :sswitch_21
    const v1, 0xc69c

    goto :goto_c

    :catch_1
    move-exception v1

    const v2, 0xca00

    :goto_e
    const v6, 0xca11

    xor-int/2addr v2, v6

    packed-switch v2, :pswitch_data_0

    :pswitch_0
    goto :goto_e

    :goto_f
    :pswitch_1
    :sswitch_22
    invoke-static {v1}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۤ۟۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v6

    const/16 v7, 0x6cc

    sget v8, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢ۟ۥ:I

    xor-int/lit16 v8, v8, 0x179

    const/16 v9, 0x1a9

    invoke-static {v6, v7, v8, v9}, Landroidx/emoji2/ۢۧۡۧ;->۟ۥۢ۟ۢ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۨ۟(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_2
    const v2, 0xca1f

    goto :goto_e

    :sswitch_23
    const v1, 0xca7c

    :goto_10
    const v2, 0xca8d

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_c

    goto :goto_10

    :sswitch_24
    const v1, 0xcd26

    goto :goto_10

    :sswitch_25
    const v1, 0xcd83

    :goto_11
    const v2, 0xcd94

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_d

    goto :goto_11

    :sswitch_26
    const v1, 0xcda2

    goto :goto_11

    :sswitch_27
    const v1, 0xcdff

    :goto_12
    const v2, 0xce10

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_e

    goto :goto_12

    :sswitch_28
    const v1, 0xce1e

    goto :goto_12

    :catch_2
    move-exception v1

    const v2, 0xd106

    :goto_13
    const v6, 0xd117

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_f

    goto :goto_13

    :sswitch_29
    const v2, 0xd125

    goto :goto_13

    :catch_3
    move-exception v1

    goto :goto_f

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_1
        0x31 -> :sswitch_2
        0xcc -> :sswitch_3
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_9
        0xb918 -> :sswitch_f
        0xb939 -> :sswitch_b
        0xb97b -> :sswitch_a
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_c
        0xef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x11 -> :sswitch_d
        0x32 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x16 -> :sswitch_10
        0x35 -> :sswitch_27
        0x1f7 -> :sswitch_11
        0x7eef -> :sswitch_12
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x11 -> :sswitch_13
        0x32 -> :sswitch_14
        0x4c -> :sswitch_15
        0x53 -> :sswitch_25
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x12 -> :sswitch_16
        0x33 -> :sswitch_23
        0x54 -> :sswitch_18
        0xf1 -> :sswitch_17
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x1f1 -> :sswitch_19
        0x6af -> :sswitch_1a
        0x6c8 -> :sswitch_1f
        0x6e9 -> :sswitch_1b
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x13 -> :sswitch_1c
        0x2d -> :sswitch_1f
        0x32 -> :sswitch_1d
        0x4c -> :sswitch_1e
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x12 -> :sswitch_1f
        0xf3 -> :sswitch_21
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0x11 -> :sswitch_20
        0x36 -> :sswitch_22
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
    .end packed-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_24
        0x7ab -> :sswitch_c
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_26
        0x36 -> :sswitch_c
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_c
        0x3ef -> :sswitch_28
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_29
        0x32 -> :sswitch_22
    .end sparse-switch
.end method

.method private static refreshAudioList(Landroid/app/Activity;)V
    .locals 4

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۧۤۥۢ()Ljava/lang/ref/WeakReference;

    move-result-object v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۧۤۥۢ()Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟ۦ۟ۡ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v1, 0x6eb

    goto :goto_1

    :sswitch_4
    move-object v1, v0

    :goto_2
    const/16 v0, 0x748

    :goto_3
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_3

    :sswitch_5
    if-eqz v1, :cond_1

    const v0, 0xbe60

    goto :goto_3

    :sswitch_6
    const/4 v0, 0x0

    move-object v1, v0

    goto :goto_2

    :cond_1
    :sswitch_7
    const v0, 0xbe41

    goto :goto_3

    :sswitch_8
    const v0, 0xbe7f

    :goto_4
    const v2, 0xbe90

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_3

    goto :goto_4

    :cond_2
    :sswitch_9
    const v0, 0xbebd

    goto :goto_4

    :sswitch_a
    if-eqz p0, :cond_2

    const v0, 0xbedc

    goto :goto_4

    :sswitch_b
    invoke-static {p0}, Landroidx/loader/ۣۦ۟ۡ;->ۥۣ۠ۨ(Ljava/lang/Object;)Z

    move-result v2

    const v0, 0xbefb

    :goto_5
    const v3, 0xbf0c

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_4

    goto :goto_5

    :cond_3
    :sswitch_c
    const v0, 0xbf39

    goto :goto_5

    :sswitch_d
    if-eqz v2, :cond_3

    const v0, 0xc1e3

    goto :goto_5

    :sswitch_e
    const v0, 0xc202

    :goto_6
    const v1, 0xc213

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :sswitch_f
    const v0, 0xc221

    goto :goto_6

    :sswitch_10
    invoke-static {v1}, Landroidx/vectordrawable/۟ۤۨۥۣ;->۟ۡۨۧۤ(Ljava/lang/Object;)Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Lkevin/fun/hook/VoiceAssistantHook$AudioAdapter;

    const v2, 0xc27e

    :goto_7
    const v3, 0xc28f

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_6

    goto :goto_7

    :cond_4
    :sswitch_11
    const v2, 0xc2bc

    goto :goto_7

    :sswitch_12
    if-eqz v0, :cond_4

    const v2, 0xc2db

    goto :goto_7

    :sswitch_13
    invoke-static {v0}, Lkevin/fun/hook/VoiceAssistantHook;->ۣۧۤ۠(Ljava/lang/Object;)V

    :sswitch_14
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->۟ۦۥۣۢ()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Landroidx/activity/ۤۧۧۧ;->ۡۥۦۦ(Ljava/lang/Object;)Z

    move-result v2

    const v0, 0xc2fa

    :goto_8
    const v3, 0xc30b

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_7

    goto :goto_8

    :sswitch_15
    if-eqz v2, :cond_5

    const v0, 0xc5e2

    goto :goto_8

    :cond_5
    :sswitch_16
    const v0, 0xc5c3

    goto :goto_8

    :sswitch_17
    new-instance v0, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda2;

    invoke-direct {v0, v1}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda2;-><init>(Landroid/widget/ListView;)V

    invoke-static {v0}, Lkevin/fun/hook/VoiceAssistantHook;->۟ۥۨۢۧ(Ljava/lang/Object;)V

    :sswitch_18
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_6
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_5
        0xb918 -> :sswitch_18
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_18
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_c
        0x35 -> :sswitch_10
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_18
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_11
        0x33 -> :sswitch_14
        0x54 -> :sswitch_13
        0xf1 -> :sswitch_12
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_15
        0x6af -> :sswitch_16
        0x6c8 -> :sswitch_18
        0x6e9 -> :sswitch_17
    .end sparse-switch
.end method

.method private static refreshTtsVoiceSpinner(Landroid/content/Context;)V
    .locals 4

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۣۨۤۢ()Ljava/lang/ref/WeakReference;

    move-result-object v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۣۨۤۢ()Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟ۦ۟ۡ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v1, 0x6eb

    goto :goto_1

    :sswitch_4
    const/4 v0, 0x0

    :sswitch_5
    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-nez v0, :cond_1

    const v1, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_7
    const v1, 0xbe41

    goto :goto_2

    :sswitch_8
    instance-of v2, p0, Landroid/app/Activity;

    const v1, 0xbe7f

    :goto_3
    const v3, 0xbe90

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_9
    const v1, 0xbebd

    goto :goto_3

    :sswitch_a
    if-eqz v2, :cond_2

    const v1, 0xbedc

    goto :goto_3

    :sswitch_b
    check-cast p0, Landroid/app/Activity;

    move-object v0, p0

    :sswitch_c
    const v1, 0xbefb

    :goto_4
    const v2, 0xbf0c

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_4

    goto :goto_4

    :cond_3
    :sswitch_d
    const v1, 0xbf39

    goto :goto_4

    :sswitch_e
    if-nez v0, :cond_3

    const v1, 0xc1e3

    goto :goto_4

    :sswitch_f
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۤۧۡۨ()Landroid/os/Handler;

    move-result-object v1

    new-instance v2, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda33;

    invoke-direct {v2, v0}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda33;-><init>(Landroid/app/Activity;)V

    invoke-static {v1, v2}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    :sswitch_10
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_c
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_c
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_d
        0x35 -> :sswitch_f
        0x1f7 -> :sswitch_e
        0x7eef -> :sswitch_10
    .end sparse-switch
.end method

.method private static releaseMediaPlayer()V
    .locals 2

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۨۧۤۤ()Landroid/media/MediaPlayer;

    move-result-object v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    :try_start_0
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۨۧۤۤ()Landroid/media/MediaPlayer;

    move-result-object v0

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۢۡۢ(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۨۧۤۤ()Landroid/media/MediaPlayer;

    move-result-object v0

    invoke-static {v0}, Landroidx/customview/ۡۤۡۤ;->۟ۢۡۥۤ(Ljava/lang/Object;)V

    :sswitch_6
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۨۧۤۤ()Landroid/media/MediaPlayer;

    move-result-object v0

    invoke-static {v0}, Landroidx/core/ۧ۟ۤۨ;->ۡۡ(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_7
    const v0, 0xbe22

    goto :goto_2

    :catch_0
    move-exception v0

    :sswitch_8
    const/4 v0, 0x0

    sput-object v0, Lkevin/fun/hook/VoiceAssistantHook;->mediaPlayer:Landroid/media/MediaPlayer;

    :sswitch_9
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_9
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_6
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_7
        0xb97b -> :sswitch_8
    .end sparse-switch
.end method

.method private static releaseResources()V
    .locals 6

    :try_start_0
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۦۡۧ()V

    const/4 v0, 0x0

    sput-object v0, Lkevin/fun/hook/VoiceAssistantHook;->selectedAudio:Landroid/net/Uri;

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->۟ۦۥۣۢ()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Landroidx/core/ۤۦ۟ۢ;->ۡۢۦ۟(Ljava/lang/Object;)V

    const/4 v0, 0x0

    sput-object v0, Lkevin/fun/hook/VoiceAssistantHook;->generatedAudioUrl:Ljava/lang/String;

    const/4 v0, 0x0

    sput-object v0, Lkevin/fun/hook/VoiceAssistantHook;->currentTtsAudioPath:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :goto_1
    :sswitch_0
    invoke-static {}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟ۢۢۥ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_2
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_2

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x729

    goto :goto_2

    :sswitch_2
    const/16 v0, 0x66f

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۦۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v2

    const/16 v3, 0x6d9

    sget v4, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۢ۟ۡ:I

    xor-int/lit16 v4, v4, -0x27f

    const/16 v5, 0x9b0

    invoke-static {v2, v3, v4, v5}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۨۦۣۨ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۨ۟(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    :sswitch_3
    const/16 v0, 0x70a

    goto :goto_2

    :sswitch_4
    const-string v0, "HxowXfJnrWsD6F"

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۢۥۥ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_1
        0x36 -> :sswitch_3
        0x1d7 -> :sswitch_5
        0x1f4 -> :sswitch_4
    .end sparse-switch
.end method

.method private static saveTtsApiKey(Landroid/content/Context;Ljava/lang/String;)V
    .locals 10

    const/4 v8, 0x0

    const/4 v1, 0x0

    const-string v6, "\u06e2\u06e2\u06e5"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move v7, v8

    move v9, v8

    :goto_0
    invoke-static {v6}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    const/16 v1, 0x6ea

    const/16 v4, 0xc4b

    invoke-static {v5, v1, v9, v4}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦۣ۠ۤ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06df\u06e8\u06e1"

    move-object v4, v1

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Lkevin/fun/hook/VoiceAssistantHook;->۠۠ۨ۟(Ljava/lang/Object;)V

    const-string v1, "\u06df\u06e7\u06df"

    move-object v6, v1

    goto :goto_0

    :sswitch_1
    invoke-static {p0, v4, v8}, Landroidx/drawerlayout/ۤۨۡۤ;->۠ۡۤۨ(Ljava/lang/Object;Ljava/lang/Object;I)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v6, "\u06e1\u06e6\u06e2"

    move-object v3, v1

    goto :goto_0

    :sswitch_2
    sget v7, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    const-string v1, "\u06e8\u06e8\u06e5"

    move-object v6, v1

    goto :goto_0

    :sswitch_3
    invoke-static {v3}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۣ۟ۦۣ۟(Ljava/lang/Object;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "\u06e7\u06e4\u06e3"

    move-object v6, v1

    goto :goto_0

    :sswitch_4
    invoke-static {v0, v4, p1}, Landroidx/core/ۧ۟ۤۨ;->۟۠ۨۨۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v6, "\u06e5\u06e4\u06e1"

    move-object v2, v1

    goto :goto_0

    :sswitch_5
    xor-int/lit16 v9, v7, 0x302

    const-string v1, "\u06e1\u06e8\u06e1"

    move-object v6, v1

    goto :goto_0

    :sswitch_6
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v1

    const-string v6, "\u06e1\u06e4\u06e8"

    move-object v5, v1

    goto :goto_0

    :sswitch_7
    invoke-static {v2}, Landroidx/vectordrawable/۟ۧۢۧۨ;->۠ۤۦۥ(Ljava/lang/Object;)V

    const-string v1, "\u06e2\u06e3"

    move-object v6, v1

    goto :goto_0

    :sswitch_8
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v1

    const-string v6, "\u06e1\u06e6\u06e3"

    move-object v5, v1

    goto :goto_0

    :sswitch_9
    const/16 v1, 0x6f9

    const/16 v4, 0x3d2

    invoke-static {v5, v1, v9, v4}, Landroidx/loader/ۥۧۨۤ;->۟ۢۢ۠ۥ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e0\u06e8"

    move-object v4, v1

    goto :goto_0

    :sswitch_a
    sput-object p1, Lkevin/fun/hook/VoiceAssistantHook;->ttsApiKey:Ljava/lang/String;

    const-string v1, "\u06e8\u06e1\u06e1"

    move-object v6, v1

    goto :goto_0

    :sswitch_b
    sget v7, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    const-string v1, "\u06e6\u06e2\u06e7"

    move-object v6, v1

    goto :goto_0

    :sswitch_c
    xor-int/lit8 v9, v7, -0x7f

    const-string v1, "\u06e2\u06df\u06e4"

    move-object v6, v1

    goto :goto_0

    :sswitch_d
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc08 -> :sswitch_4
        0xdc41 -> :sswitch_0
        0x1aa7f7 -> :sswitch_d
        0x1aa818 -> :sswitch_1
        0x1aaf25 -> :sswitch_b
        0x1aaf5d -> :sswitch_3
        0x1aaf5e -> :sswitch_2
        0x1ab247 -> :sswitch_9
        0x1ab2a5 -> :sswitch_a
        0x1abe22 -> :sswitch_7
        0x1ac1ab -> :sswitch_5
        0x1ac5a6 -> :sswitch_8
        0x1ac908 -> :sswitch_6
        0x1ac9e5 -> :sswitch_c
    .end sparse-switch
.end method

.method private static scanAudiosAsync(Ljava/lang/Runnable;)V
    .locals 2

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->۠ۤۨۧ()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda11;

    invoke-direct {v1, p0}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda11;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v0, v1}, Landroidx/activity/ۣۦۡۥ;->۟ۢ۠ۥۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method private static scanDocumentTree(Landroidx/documentfile/provider/DocumentFile;Ljava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/documentfile/provider/DocumentFile;",
            "Ljava/util/List",
            "<",
            "Lkevin/fun/hook/VoiceAssistantHook$AudioItem;",
            ">;)V"
        }
    .end annotation

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz p0, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/activity/ۦۧۥۥ;->۟ۥۦۨۨ(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :sswitch_7
    invoke-static {p0}, Landroidx/appcompat/ۣۧۤۢ;->ۥۦۤۥ(Ljava/lang/Object;)[Landroidx/documentfile/provider/DocumentFile;

    move-result-object v2

    array-length v3, v2

    const/4 v0, 0x0

    :pswitch_0
    const v1, 0xbe7f

    :goto_3
    const v4, 0xbe90

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_8
    const v1, 0xbebd

    goto :goto_3

    :sswitch_9
    if-lt v0, v3, :cond_2

    const v1, 0xbedc

    goto :goto_3

    :sswitch_a
    aget-object v4, v2, v0

    invoke-static {v4}, Landroidx/activity/ۦۧۥۥ;->۟ۥۦۨۨ(Ljava/lang/Object;)Z

    move-result v5

    const v1, 0xbefb

    :goto_4
    const v6, 0xbf0c

    xor-int/2addr v1, v6

    sparse-switch v1, :sswitch_data_4

    goto :goto_4

    :cond_3
    :sswitch_b
    const v1, 0xbf39

    goto :goto_4

    :sswitch_c
    if-eqz v5, :cond_3

    const v1, 0xc1e3

    goto :goto_4

    :sswitch_d
    invoke-static {v4, p1}, Lkevin/fun/hook/VoiceAssistantHook;->۟۠ۢ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v1, 0xc202

    :goto_5
    const v4, 0xc213

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_5

    goto :goto_5

    :sswitch_e
    const v1, 0xc221

    goto :goto_5

    :sswitch_f
    invoke-static {v4}, Landroidx/core/ۧ۟ۤۨ;->۟۟ۤۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const v1, 0xc27e

    :goto_6
    const v6, 0xc28f

    xor-int/2addr v1, v6

    sparse-switch v1, :sswitch_data_6

    goto :goto_6

    :cond_4
    :sswitch_10
    const v1, 0xc2bc

    goto :goto_6

    :sswitch_11
    if-nez v5, :cond_4

    const v1, 0xc2db

    goto :goto_6

    :sswitch_12
    const v1, 0xc2fa

    :goto_7
    const v4, 0xc30b

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_7

    goto :goto_7

    :sswitch_13
    const v1, 0xc5a4

    goto :goto_7

    :sswitch_14
    invoke-static {v5}, Landroidx/appcompat/resources/ۦۨۦۢ;->ۨۡۥۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v1

    const/16 v7, 0x704

    sget v8, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۢ۟ۡ:I

    xor-int/lit16 v8, v8, -0x26c

    const/16 v9, 0x9c6

    invoke-static {v1, v7, v8, v9}, Landroidx/loader/ۣۦ۟ۡ;->ۣ۟ۤ۟ۦ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v6, v1}, Landroidx/activity/ۤۧۧۧ;->۟۟ۤۧ۠(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    const v1, 0xc601

    :goto_8
    const v8, 0xc612

    xor-int/2addr v1, v8

    sparse-switch v1, :sswitch_data_8

    goto :goto_8

    :sswitch_15
    if-nez v7, :cond_5

    const v1, 0xc65e

    goto :goto_8

    :cond_5
    :sswitch_16
    const v1, 0xc63f

    goto :goto_8

    :sswitch_17
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v1

    const/16 v7, 0x708

    sget v8, Landroidx/activity/ۨ۠۟ۧ;->۟ۦۥۢۢ:I

    xor-int/lit16 v8, v8, 0x331

    const/16 v9, 0x219

    invoke-static {v1, v7, v8, v9}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟۟۟ۦۢ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v6, v1}, Landroidx/activity/ۤۧۧۧ;->۟۟ۤۧ۠(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    const v1, 0xc67d

    :goto_9
    const v8, 0xc68e

    xor-int/2addr v1, v8

    sparse-switch v1, :sswitch_data_9

    goto :goto_9

    :cond_6
    :sswitch_18
    const v1, 0xc6bb

    goto :goto_9

    :sswitch_19
    if-nez v7, :cond_6

    const v1, 0xc965

    goto :goto_9

    :sswitch_1a
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v1

    const/16 v7, 0x70c

    sget v8, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۥۦ:I

    xor-int/lit16 v8, v8, 0x263

    const/16 v9, 0x69d

    invoke-static {v1, v7, v8, v9}, Landroidx/appcompat/ۣۧۤۢ;->ۢۥۢ۟([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v6, v1}, Landroidx/activity/ۤۧۧۧ;->۟۟ۤۧ۠(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    const v1, 0xc984

    :goto_a
    const v7, 0xc995

    xor-int/2addr v1, v7

    sparse-switch v1, :sswitch_data_a

    goto :goto_a

    :sswitch_1b
    if-eqz v6, :cond_7

    const v1, 0xc9e1

    goto :goto_a

    :cond_7
    :sswitch_1c
    const v1, 0xc9c2

    goto :goto_a

    :sswitch_1d
    new-instance v1, Lkevin/fun/hook/VoiceAssistantHook$AudioItem;

    const/4 v6, 0x0

    invoke-direct {v1, v6}, Lkevin/fun/hook/VoiceAssistantHook$AudioItem;-><init>(Lkevin/fun/hook/VoiceAssistantHook-IA;)V

    iput-object v5, v1, Lkevin/fun/hook/VoiceAssistantHook$AudioItem;->name:Ljava/lang/String;

    invoke-static {v4}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->۟۟ۧۧۦ(Ljava/lang/Object;)Landroid/net/Uri;

    move-result-object v4

    iput-object v4, v1, Lkevin/fun/hook/VoiceAssistantHook$AudioItem;->uri:Landroid/net/Uri;

    invoke-static {p1, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    :sswitch_1e
    sget v1, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۨ۠ۨ:I

    xor-int/lit16 v1, v1, 0x35a

    add-int/2addr v0, v1

    const v1, 0xca00

    :goto_b
    const v4, 0xca11

    xor-int/2addr v1, v4

    packed-switch v1, :pswitch_data_0

    :pswitch_1
    goto :goto_b

    :pswitch_2
    const v1, 0xca1f

    goto :goto_b

    :sswitch_1f
    invoke-static {}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۤۡۥۣ()I

    move-result v1

    const v0, 0xca7c

    :goto_c
    const v2, 0xca8d

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_b

    goto :goto_c

    :sswitch_20
    if-ltz v1, :cond_8

    const v0, 0xcd64

    goto :goto_c

    :cond_8
    :sswitch_21
    const v0, 0xcd45

    goto :goto_c

    :sswitch_22
    const-string v0, "uOo35m8wuZezvag4M"

    invoke-static {v0}, Landroidx/core/ۧ۟ۤۨ;->ۡۤ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_23
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_1f
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_1f
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_8
        0x2d -> :sswitch_a
        0x4c -> :sswitch_23
        0xef -> :sswitch_9
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_b
        0x35 -> :sswitch_f
        0x1f7 -> :sswitch_c
        0x7eef -> :sswitch_d
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_e
        0x32 -> :sswitch_1e
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_10
        0x33 -> :sswitch_14
        0x54 -> :sswitch_12
        0xf1 -> :sswitch_11
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_13
        0x6af -> :sswitch_1e
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_15
        0x2d -> :sswitch_1d
        0x32 -> :sswitch_16
        0x4c -> :sswitch_17
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_18
        0x35 -> :sswitch_1d
        0xf3 -> :sswitch_19
        0xfeb -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1b
        0x36 -> :sswitch_1c
        0x57 -> :sswitch_1e
        0x74 -> :sswitch_1d
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_2
    .end packed-switch

    :sswitch_data_b
    .sparse-switch
        0xf1 -> :sswitch_20
        0x7ab -> :sswitch_21
        0x7c8 -> :sswitch_23
        0x7e9 -> :sswitch_22
    .end sparse-switch
.end method

.method public static setOnReplaceCompleteCallback(Ljava/lang/Runnable;)V
    .locals 0

    sput-object p0, Lkevin/fun/hook/VoiceAssistantHook;->onReplaceCompleteCallback:Ljava/lang/Runnable;

    return-void
.end method

.method private static setTabActive(Landroid/widget/TextView;Z)V
    .locals 3

    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/high16 v0, 0x41c80000    # 25.0f

    invoke-static {v2, v0}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۥ۟ۢۧ(Ljava/lang/Object;F)V

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz p1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const v0, -0xde690d

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v1, 0x6eb

    goto :goto_1

    :sswitch_4
    const v0, -0xf0f10

    :sswitch_5
    invoke-static {v2, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    invoke-static {p0, v2}, Landroidx/core/ۧ۟ۤۨ;->ۣ۟ۢۧ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz p1, :cond_1

    const v0, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    const/4 v0, -0x1

    const v1, 0xbe7f

    :goto_3
    const v2, 0xbe90

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :goto_4
    :sswitch_9
    invoke-static {p0, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    invoke-static {}, Landroidx/viewpager/ۣۢ۟ۤ;->ۥ۠ۤ()I

    move-result v1

    const v0, 0xbefb

    :goto_5
    const v2, 0xbf0c

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_4

    goto :goto_5

    :cond_2
    :sswitch_a
    const v0, 0xbf39

    goto :goto_5

    :sswitch_b
    const v1, 0xbe9e

    goto :goto_3

    :sswitch_c
    const v0, -0x777778

    goto :goto_4

    :sswitch_d
    if-ltz v1, :cond_2

    const v0, 0xc1e3

    goto :goto_5

    :sswitch_e
    const-string v0, "LvV4aWEkdWX87NJ16cSoN"

    invoke-static {v0}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣ۠ۢۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :sswitch_f
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_c
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_a
        0x35 -> :sswitch_f
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch
.end method

.method private static showConfigDialog(Landroid/app/Activity;)V
    .locals 30

    const/4 v6, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v19, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v16, 0x0

    const/4 v5, 0x0

    const/4 v14, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v12, 0x0

    const-wide/16 v26, 0x0

    const/4 v7, 0x0

    const-string v18, "\u06e3\u06e0\u06df"

    :goto_0
    invoke-static/range {v18 .. v18}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v18

    sparse-switch v18, :sswitch_data_0

    invoke-static/range {v15 .. v16}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v18, 0x41400000    # 12.0f

    move/from16 v0, v18

    invoke-static {v15, v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    sget v24, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۤ۟ۨ:I

    const v18, 0xbbba14    # 1.723999E-38f

    xor-int v22, v18, v24

    move/from16 v0, v22

    invoke-static {v15, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const/high16 v18, 0x41700000    # 15.0f

    move-object/from16 v0, p0

    move/from16 v1, v18

    invoke-static {v0, v1}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v23

    const-string v18, "\u06e2\u06e1\u06e6"

    goto :goto_0

    :sswitch_0
    xor-int/lit8 v23, v21, -0x68

    const/16 v14, 0x74c

    const/16 v16, 0x80e

    move-object/from16 v0, v17

    move/from16 v1, v23

    move/from16 v2, v16

    invoke-static {v0, v14, v1, v2}, Landroidx/startup/ۤۧۥۣ;->۟ۧۦ۠ۦ([SIII)Ljava/lang/String;

    move-result-object v16

    move-object/from16 v0, v16

    invoke-static {v10, v0}, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۣۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v22, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    const v14, 0xb351a7

    xor-int v24, v14, v22

    invoke-static/range {v24 .. v24}, Lkevin/fun/hook/VoiceAssistantHook;->۟ۦ۠۠۠(I)Landroid/graphics/drawable/Drawable;

    move-result-object v14

    const-string v18, "\u06e0\u06e0\u06df"

    goto :goto_0

    :sswitch_1
    invoke-static {v10, v14}, Landroidx/activity/ۣۦۡۥ;->ۤۥ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v19, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    xor-int/lit8 v20, v19, -0x73

    move/from16 v0, v20

    invoke-static {v10, v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣ۟ۢ۟ۤ(Ljava/lang/Object;I)V

    const/high16 v18, 0x41a00000    # 20.0f

    move-object/from16 v0, p0

    move/from16 v1, v18

    invoke-static {v0, v1}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v21

    const/high16 v18, 0x41000000    # 8.0f

    move-object/from16 v0, p0

    move/from16 v1, v18

    invoke-static {v0, v1}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v23

    const-string v18, "\u06e6\u06e2\u06e1"

    goto :goto_0

    :sswitch_2
    invoke-static {v6, v15}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v15, Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-direct {v15, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v17

    sget v22, Lorg/luckypray/dexkit/۠۠ۥ;->ۣ۟ۡۢۡ:I

    move/from16 v0, v22

    xor-int/lit16 v0, v0, -0xeb

    move/from16 v23, v0

    const/16 v16, 0x718

    const/16 v18, 0xb81

    move-object/from16 v0, v17

    move/from16 v1, v16

    move/from16 v2, v23

    move/from16 v3, v18

    invoke-static {v0, v1, v2, v3}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣ۟۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v16

    const-string v18, "\u06e3\u06e8\u06e0"

    goto/16 :goto_0

    :sswitch_3
    move/from16 v0, v23

    xor-int/lit16 v0, v0, 0x17e

    move/from16 v24, v0

    const/16 v14, 0x720

    const/16 v16, 0x76c

    move-object/from16 v0, v17

    move/from16 v1, v24

    move/from16 v2, v16

    invoke-static {v0, v14, v1, v2}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۤ۟۠([SIII)Ljava/lang/String;

    move-result-object v14

    invoke-static {v5, v14}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۥۣۢ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->۠۟ۥۦ()Ljava/lang/String;

    move-result-object v16

    move-object/from16 v0, v16

    invoke-static {v5, v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۡۡۦ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/VoiceAssistantHook;->ۣۤۧۢ(Ljava/lang/Object;)Landroid/graphics/drawable/Drawable;

    move-result-object v14

    const-string v18, "\u06df\u06e6\u06e4"

    goto/16 :goto_0

    :sswitch_4
    invoke-static {v5, v14}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۠۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v18, 0x41200000    # 10.0f

    move-object/from16 v0, p0

    move/from16 v1, v18

    invoke-static {v0, v1}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v23

    const/high16 v18, 0x41200000    # 10.0f

    move-object/from16 v0, p0

    move/from16 v1, v18

    invoke-static {v0, v1}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v24

    const/high16 v18, 0x41200000    # 10.0f

    move-object/from16 v0, p0

    move/from16 v1, v18

    invoke-static {v0, v1}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v20

    const/high16 v18, 0x41200000    # 10.0f

    move-object/from16 v0, p0

    move/from16 v1, v18

    invoke-static {v0, v1}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v21

    move/from16 v0, v23

    move/from16 v1, v24

    move/from16 v2, v20

    move/from16 v3, v21

    invoke-static {v5, v0, v1, v2, v3}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۥۣۨۦ(Ljava/lang/Object;IIII)V

    const-string v18, "\u06e6\u06e0\u06e6"

    goto/16 :goto_0

    :sswitch_5
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v17

    sget v21, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    move/from16 v0, v21

    xor-int/lit16 v0, v0, -0x257

    move/from16 v23, v0

    const/16 v16, 0x73d

    const/16 v18, 0xa4d

    move-object/from16 v0, v17

    move/from16 v1, v16

    move/from16 v2, v23

    move/from16 v3, v18

    invoke-static {v0, v1, v2, v3}, Landroidx/customview/ۤۡۥ;->۟ۢۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v16

    invoke-static/range {v15 .. v16}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v18, 0x41200000    # 10.0f

    move/from16 v0, v18

    invoke-static {v15, v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const-string v18, "\u06df\u06e7\u06e4"

    goto/16 :goto_0

    :sswitch_6
    xor-int/lit8 v24, v23, -0x6e

    const/16 v16, 0x72e

    const/16 v18, 0xc78

    move-object/from16 v0, v17

    move/from16 v1, v16

    move/from16 v2, v24

    move/from16 v3, v18

    invoke-static {v0, v1, v2, v3}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۧ۟ۧۢ([SIII)Ljava/lang/String;

    move-result-object v16

    move-object/from16 v0, v16

    invoke-static {v8, v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v20, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    const v18, 0xde6866

    xor-int v21, v18, v20

    move/from16 v0, v21

    invoke-static {v8, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const-string v18, "\u06e1\u06e7\u06e0"

    goto/16 :goto_0

    :sswitch_7
    new-instance v4, Landroid/app/Dialog;

    move-object/from16 v0, p0

    invoke-direct {v4, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    const/4 v12, 0x1

    invoke-static {v4, v12}, Landroidx/viewpager/ۣۢ۟ۤ;->ۣ۟ۢۡۦ(Ljava/lang/Object;I)Z

    invoke-static {v4, v6}, Landroidx/viewpager/ۣۢ۟ۤ;->ۥۢۨۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۨۥۢ(Ljava/lang/Object;)Landroid/view/Window;

    move-result-object v12

    new-instance v18, Landroid/graphics/drawable/ColorDrawable;

    const/16 v25, 0x0

    move-object/from16 v0, v18

    move/from16 v1, v25

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    move-object/from16 v0, v18

    invoke-static {v12, v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟ۢ۟ۥ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v18, "\u06e0\u06e2\u06e7"

    goto/16 :goto_0

    :sswitch_8
    const/4 v10, 0x0

    invoke-static {v11, v10}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    const/high16 v10, 0x41700000    # 15.0f

    move-object/from16 v0, p0

    invoke-static {v0, v10}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v20

    const/4 v10, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move/from16 v0, v20

    move/from16 v1, v17

    move/from16 v2, v18

    invoke-static {v11, v10, v0, v1, v2}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    new-instance v10, Landroid/widget/Button;

    move-object/from16 v0, p0

    invoke-direct {v10, v0}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v17

    sget v21, Landroidx/customview/ۤۡۥ;->ۣ۟ۢۥۢ:I

    const-string v18, "\u06e4\u06e4\u06df"

    goto/16 :goto_0

    :sswitch_9
    new-instance v18, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda23;

    move-object/from16 v0, v18

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda23;-><init>(Landroid/app/Activity;)V

    move-object/from16 v0, v18

    invoke-static {v8, v0}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۦۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v11, v15}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v11, v8}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v6, v11}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v15, Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-direct {v15, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v18, "\u06e8\u06df\u06e1"

    goto/16 :goto_0

    :sswitch_a
    invoke-static {v10, v7}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۣۣ۟ۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda25;

    invoke-direct {v5, v4}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda25;-><init>(Landroid/app/Dialog;)V

    invoke-static {v9, v5}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۣۣ۟ۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۦۧۤۡ(Ljava/lang/Object;)V

    return-void

    :sswitch_b
    move-wide/from16 v0, v26

    double-to-int v0, v0

    move/from16 v19, v0

    sget v20, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    move/from16 v0, v20

    xor-int/lit16 v0, v0, -0x179

    move/from16 v21, v0

    move/from16 v0, v19

    move/from16 v1, v21

    invoke-static {v12, v0, v1}, Landroidx/startup/ۤۧۥۣ;->ۢۦ۠(Ljava/lang/Object;II)V

    new-instance v7, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda24;

    move-object/from16 v0, p0

    invoke-direct {v7, v5, v0, v4}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda24;-><init>(Landroid/widget/EditText;Landroid/app/Activity;Landroid/app/Dialog;)V

    const-string v18, "\u06e6\u06e5\u06df"

    goto/16 :goto_0

    :sswitch_c
    const/high16 v5, 0x40a00000    # 5.0f

    move-object/from16 v0, p0

    invoke-static {v0, v5}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v24

    const/4 v5, 0x0

    const/16 v17, 0x0

    move/from16 v0, v23

    move/from16 v1, v17

    move/from16 v2, v24

    invoke-static {v15, v5, v0, v1, v2}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    invoke-static {v6, v15}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Landroid/widget/EditText;

    move-object/from16 v0, p0

    invoke-direct {v5, v0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v17

    sget v23, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢ۟ۥ:I

    const-string v18, "\u06e0\u06e6\u06e2"

    goto/16 :goto_0

    :sswitch_d
    move-object/from16 v0, v16

    invoke-static {v9, v0}, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۣۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v23, Landroidx/customview/ۤۡۥ;->ۣ۟ۢۥۢ:I

    const v14, 0x616104

    xor-int v22, v14, v23

    invoke-static/range {v22 .. v22}, Lkevin/fun/hook/VoiceAssistantHook;->۟ۦ۠۠۠(I)Landroid/graphics/drawable/Drawable;

    move-result-object v14

    invoke-static {v9, v14}, Landroidx/activity/ۣۦۡۥ;->ۤۥ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v24, Lkevin/fun/hook/۟ۥ۠۠;->ۢۦۧۧ:I

    const-string v18, "\u06e8\u06e8\u06e0"

    goto/16 :goto_0

    :sswitch_e
    const/4 v15, 0x0

    const/16 v16, 0x0

    move/from16 v0, v23

    move/from16 v1, v16

    move/from16 v2, v24

    invoke-static {v11, v15, v0, v1, v2}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    new-instance v15, Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-direct {v15, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v17

    sget v20, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    move/from16 v0, v20

    xor-int/lit16 v0, v0, 0xc7

    move/from16 v21, v0

    const/16 v16, 0x72a

    const/16 v18, 0x8fd

    move-object/from16 v0, v17

    move/from16 v1, v16

    move/from16 v2, v21

    move/from16 v3, v18

    invoke-static {v0, v1, v2, v3}, Lorg/luckypray/dexkit/۠۠ۥ;->۟ۥۧۦ۠([SIII)Ljava/lang/String;

    move-result-object v16

    const-string v18, "\u06e7\u06e4\u06e0"

    goto/16 :goto_0

    :sswitch_f
    const/high16 v18, 0x41400000    # 12.0f

    move/from16 v0, v18

    invoke-static {v8, v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    invoke-static {v8}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۢ۠ۨۨ(Ljava/lang/Object;)I

    move-result v22

    sget v23, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۨ۠ۧ:I

    move/from16 v0, v23

    xor-int/lit16 v0, v0, -0x1b6

    move/from16 v24, v0

    or-int v20, v22, v24

    move/from16 v0, v20

    invoke-static {v8, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۢۨۥ(Ljava/lang/Object;I)V

    const-string v18, "\u06e5\u06df\u06e7"

    goto/16 :goto_0

    :sswitch_10
    sget v22, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    const v11, 0x777702

    xor-int v24, v11, v22

    move/from16 v0, v24

    invoke-static {v15, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    move/from16 v0, v19

    invoke-static {v15, v0}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    invoke-static {v6, v15}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v11, Landroid/widget/LinearLayout;

    move-object/from16 v0, p0

    invoke-direct {v11, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const-string v18, "\u06e5\u06df\u06e8"

    goto/16 :goto_0

    :sswitch_11
    invoke-static {v10, v13}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣ۟ۡۡۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v9, Landroid/widget/Button;

    move-object/from16 v0, p0

    invoke-direct {v9, v0}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v17

    sget v20, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    move/from16 v0, v20

    xor-int/lit16 v0, v0, -0x169

    move/from16 v21, v0

    const/16 v16, 0x74e

    const/16 v18, 0x248

    move-object/from16 v0, v17

    move/from16 v1, v16

    move/from16 v2, v21

    move/from16 v3, v18

    invoke-static {v0, v1, v2, v3}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۢۤۤ([SIII)Ljava/lang/String;

    move-result-object v16

    const-string v18, "\u06e5\u06e3\u06e5"

    goto/16 :goto_0

    :sswitch_12
    invoke-static {v6, v5}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v11, Landroid/widget/LinearLayout;

    move-object/from16 v0, p0

    invoke-direct {v11, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/16 v18, 0x0

    move/from16 v0, v18

    invoke-static {v11, v0}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    move/from16 v0, v19

    invoke-static {v11, v0}, Landroidx/emoji2/ۢۧۡۧ;->ۡۤۥ(Ljava/lang/Object;I)V

    const/high16 v18, 0x41700000    # 15.0f

    move-object/from16 v0, p0

    move/from16 v1, v18

    invoke-static {v0, v1}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v23

    const/high16 v18, 0x41200000    # 10.0f

    move-object/from16 v0, p0

    move/from16 v1, v18

    invoke-static {v0, v1}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v24

    const-string v18, "\u06e3\u06e3"

    goto/16 :goto_0

    :sswitch_13
    new-instance v6, Landroid/widget/LinearLayout;

    move-object/from16 v0, p0

    invoke-direct {v6, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/16 v18, 0x1

    move/from16 v0, v18

    invoke-static {v6, v0}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    const/high16 v18, 0x41a00000    # 20.0f

    move-object/from16 v0, p0

    move/from16 v1, v18

    invoke-static {v0, v1}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v22

    const/high16 v18, 0x41a00000    # 20.0f

    move-object/from16 v0, p0

    move/from16 v1, v18

    invoke-static {v0, v1}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v23

    const/high16 v18, 0x41a00000    # 20.0f

    move-object/from16 v0, p0

    move/from16 v1, v18

    invoke-static {v0, v1}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v24

    const/high16 v18, 0x41a00000    # 20.0f

    move-object/from16 v0, p0

    move/from16 v1, v18

    invoke-static {v0, v1}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v19

    const-string v18, "\u06e7\u06e8\u06e1"

    goto/16 :goto_0

    :sswitch_14
    invoke-static/range {v15 .. v16}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    move/from16 v0, v22

    invoke-static {v15, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const/high16 v8, 0x41400000    # 12.0f

    invoke-static {v15, v8}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    new-instance v8, Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-direct {v8, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v17

    sget v23, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۧۨۨ:I

    const-string v18, "\u06e1\u06e1\u06e8"

    goto/16 :goto_0

    :sswitch_15
    move/from16 v0, v22

    move/from16 v1, v23

    move/from16 v2, v24

    move/from16 v3, v19

    invoke-static {v6, v0, v1, v2, v3}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    new-instance v15, Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-direct {v15, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v17

    sget v22, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    move/from16 v0, v22

    xor-int/lit16 v0, v0, 0x171

    move/from16 v23, v0

    const/16 v16, 0x710

    const/16 v18, 0xcab

    move-object/from16 v0, v17

    move/from16 v1, v16

    move/from16 v2, v23

    move/from16 v3, v18

    invoke-static {v0, v1, v2, v3}, Landroidx/interpolator/۟ۧۦ۟ۨ;->۠ۤۤۡ([SIII)Ljava/lang/String;

    move-result-object v16

    const-string v18, "\u06e1\u06e2\u06e1"

    goto/16 :goto_0

    :sswitch_16
    invoke-static/range {v15 .. v16}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v18, 0x41800000    # 16.0f

    move/from16 v0, v18

    invoke-static {v15, v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const/16 v18, 0x0

    const/16 v19, 0x1

    move-object/from16 v0, v18

    move/from16 v1, v19

    invoke-static {v15, v0, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۤۦۤۢ(Ljava/lang/Object;Ljava/lang/Object;I)V

    sget v24, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    move/from16 v0, v24

    xor-int/lit16 v0, v0, 0x21f

    move/from16 v19, v0

    move/from16 v0, v19

    invoke-static {v15, v0}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    const-string v18, "\u06e2\u06e8\u06e2"

    goto/16 :goto_0

    :sswitch_17
    move/from16 v0, v24

    xor-int/lit16 v0, v0, 0x1c4

    move/from16 v19, v0

    move/from16 v0, v19

    invoke-static {v9, v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣ۟ۢ۟ۤ(Ljava/lang/Object;I)V

    const/high16 v18, 0x41a00000    # 20.0f

    move-object/from16 v0, p0

    move/from16 v1, v18

    invoke-static {v0, v1}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v20

    const/high16 v18, 0x41000000    # 8.0f

    move-object/from16 v0, p0

    move/from16 v1, v18

    invoke-static {v0, v1}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v21

    const/high16 v18, 0x41a00000    # 20.0f

    move-object/from16 v0, p0

    move/from16 v1, v18

    invoke-static {v0, v1}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v23

    const/high16 v18, 0x41000000    # 8.0f

    move-object/from16 v0, p0

    move/from16 v1, v18

    invoke-static {v0, v1}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v22

    const-string v18, "\u06e8\u06e4"

    goto/16 :goto_0

    :sswitch_18
    move/from16 v0, v20

    move/from16 v1, v21

    move/from16 v2, v23

    move/from16 v3, v22

    invoke-static {v9, v0, v1, v2, v3}, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۧۡ۠ۨ(Ljava/lang/Object;IIII)V

    new-instance v13, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v18, 0x0

    const/16 v25, -0x2

    const/high16 v28, 0x3f800000    # 1.0f

    move/from16 v0, v18

    move/from16 v1, v25

    move/from16 v2, v28

    invoke-direct {v13, v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-static {v9, v13}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣ۟ۡۡۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v11, v10}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v11, v9}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v6, v11}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v18, "\u06e2\u06df\u06e5"

    goto/16 :goto_0

    :sswitch_19
    const/high16 v13, 0x41a00000    # 20.0f

    move-object/from16 v0, p0

    invoke-static {v0, v13}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v22

    const/high16 v13, 0x41000000    # 8.0f

    move-object/from16 v0, p0

    invoke-static {v0, v13}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v24

    move/from16 v0, v21

    move/from16 v1, v23

    move/from16 v2, v22

    move/from16 v3, v24

    invoke-static {v10, v0, v1, v2, v3}, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۧۡ۠ۨ(Ljava/lang/Object;IIII)V

    new-instance v13, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v18, 0x0

    const/16 v19, -0x2

    const/high16 v25, 0x3f800000    # 1.0f

    move/from16 v0, v18

    move/from16 v1, v19

    move/from16 v2, v25

    invoke-direct {v13, v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    const/high16 v18, 0x41200000    # 10.0f

    move-object/from16 v0, p0

    move/from16 v1, v18

    invoke-static {v0, v1}, Lkevin/fun/hook/VoiceAssistantHook;->۟۟ۤۢ۟(Ljava/lang/Object;F)I

    move-result v19

    const/16 v18, 0x0

    const/16 v25, 0x0

    const/16 v28, 0x0

    move/from16 v0, v18

    move/from16 v1, v25

    move/from16 v2, v19

    move/from16 v3, v28

    invoke-static {v13, v0, v1, v2, v3}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۨۥۡۥ(Ljava/lang/Object;IIII)V

    const-string v18, "\u06e6\u06e6\u06e8"

    goto/16 :goto_0

    :sswitch_1a
    invoke-static {v4}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۨۥۢ(Ljava/lang/Object;)Landroid/view/Window;

    move-result-object v12

    invoke-static/range {p0 .. p0}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۣ۟ۤۢۨ(Ljava/lang/Object;)Landroid/content/res/Resources;

    move-result-object v18

    invoke-static/range {v18 .. v18}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟۟ۤۦۤ(Ljava/lang/Object;)Landroid/util/DisplayMetrics;

    move-result-object v18

    invoke-static/range {v18 .. v18}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۤ۠۠ۨ(Ljava/lang/Object;)I

    move-result v24

    move/from16 v0, v24

    int-to-double v0, v0

    move-wide/from16 v26, v0

    const-wide v28, 0x3fe999999999999aL    # 0.8

    mul-double v26, v26, v28

    const-string v18, "\u06e4\u06e3\u06e5"

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc60 -> :sswitch_e
        0xdcfc -> :sswitch_18
        0x1aa7dd -> :sswitch_4
        0x1aa7fc -> :sswitch_10
        0x1aaadf -> :sswitch_1
        0x1aab25 -> :sswitch_1a
        0x1aab9c -> :sswitch_3
        0x1aaec8 -> :sswitch_6
        0x1aaee0 -> :sswitch_16
        0x1aaf7a -> :sswitch_f
        0x1ab248 -> :sswitch_7
        0x1ab287 -> :sswitch_c
        0x1ab35c -> :sswitch_2
        0x1ab622 -> :sswitch_13
        0x1aba46 -> :sswitch_b
        0x1aba5f -> :sswitch_0
        0x1abd8d -> :sswitch_9
        0x1abd8e -> :sswitch_8
        0x1abe07 -> :sswitch_d
        0x1ac16c -> :sswitch_12
        0x1ac1a5 -> :sswitch_19
        0x1ac200 -> :sswitch_a
        0x1ac228 -> :sswitch_11
        0x1ac5a3 -> :sswitch_14
        0x1ac620 -> :sswitch_15
        0x1ac8ca -> :sswitch_5
        0x1ac9e0 -> :sswitch_17
    .end sparse-switch
.end method

.method public static showDialog(Landroid/content/Context;)V
    .locals 4

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v1, 0x750

    sget v2, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    xor-int/lit16 v2, v2, -0x3fa

    const/16 v3, 0xc89

    invoke-static {v0, v1, v2, v3}, Landroidx/loader/ۥۧۨۤ;->۟ۢۢ۠ۥ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۣۢۢۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Landroidx/activity/ۣۦۡۥ;->ۦۧۥۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "J4Q4nIhr97cXG8dCgmSYDFsLTC5O"

    invoke-static {v0}, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۧۤ۟ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method public static showDialog(Landroid/content/Context;Ljava/lang/String;)V
    .locals 4

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->۟ۤۡۦۡ()Z

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۟ۢۢۡۡ(Ljava/lang/Object;)V

    :sswitch_3
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-nez p0, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v0

    const/16 v1, 0x78a

    sget v2, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۥۧ۟:I

    xor-int/lit8 v2, v2, 0x9

    const/16 v3, 0x721

    invoke-static {v0, v1, v2, v3}, Landroidx/drawerlayout/ۤۨۡۤ;->ۤ۠ۤ۠([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۨ۟(Ljava/lang/Object;)V

    :goto_2
    :sswitch_7
    return-void

    :sswitch_8
    instance-of v1, p0, Landroid/app/Activity;

    const/16 v0, 0x748

    :goto_3
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_3

    :sswitch_9
    if-eqz v1, :cond_2

    const v0, 0xbe60

    goto :goto_3

    :cond_2
    :sswitch_a
    const v0, 0xbe41

    goto :goto_3

    :sswitch_b
    new-instance v1, Ljava/lang/ref/WeakReference;

    move-object v0, p0

    check-cast v0, Landroid/app/Activity;

    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v1, Lkevin/fun/hook/VoiceAssistantHook;->currentActivityRef:Ljava/lang/ref/WeakReference;

    :sswitch_c
    sput-object p1, Lkevin/fun/hook/VoiceAssistantHook;->targetReplaceDir:Ljava/lang/String;

    invoke-static {}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۥۣۥ()Landroid/os/Looper;

    move-result-object v1

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۧۤۡۨ()Landroid/os/Looper;

    move-result-object v2

    const v0, 0xbe7f

    :goto_4
    const v3, 0xbe90

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_3

    goto :goto_4

    :cond_3
    :sswitch_d
    const v0, 0xbebd

    goto :goto_4

    :sswitch_e
    if-ne v1, v2, :cond_3

    const v0, 0xbedc

    goto :goto_4

    :sswitch_f
    invoke-static {p0}, Lkevin/fun/hook/VoiceAssistantHook;->ۨۥۧۦ(Ljava/lang/Object;)V

    const v0, 0xbefb

    :goto_5
    const v1, 0xbf0c

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_4

    goto :goto_5

    :goto_6
    :sswitch_10
    invoke-static {}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣ۟()I

    move-result v1

    const v0, 0xc202

    :goto_7
    const v2, 0xc213

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_5

    goto :goto_7

    :sswitch_11
    if-ltz v1, :cond_4

    const v0, 0xc25f

    goto :goto_7

    :sswitch_12
    const v0, 0xbf1a

    goto :goto_5

    :sswitch_13
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۤۧۡۨ()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda36;

    invoke-direct {v1, p0}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda36;-><init>(Landroid/content/Context;)V

    invoke-static {v0, v1}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_6

    :cond_4
    :sswitch_14
    const v0, 0xc240

    goto :goto_7

    :sswitch_15
    const-string v0, "Tkzi77iVYJ9qlbxcuOBZfVZr5vx"

    invoke-static {v0}, Landroidx/loader/ۢۥ۟;->۟ۦۡۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    goto/16 :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_8
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_9
        0xb918 -> :sswitch_c
        0xb939 -> :sswitch_b
        0xb97b -> :sswitch_a
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_d
        0x2d -> :sswitch_13
        0x4c -> :sswitch_f
        0xef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_10
        0x1f7 -> :sswitch_12
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_11
        0x32 -> :sswitch_14
        0x4c -> :sswitch_15
        0x53 -> :sswitch_7
    .end sparse-switch
.end method

.method private static showDialogInternal(Landroid/content/Context;)V
    .locals 6

    :try_start_0
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۣ۟ۢۤۤ()Ljava/lang/ref/WeakReference;

    move-result-object v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۣ۟ۢۤۤ()Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟ۦ۟ۡ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۣ۟ۢۤۤ()Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟ۦ۟ۡ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Dialog;

    invoke-static {v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۟ۤۥۣۡ(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz v1, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۣ۟ۢۤۤ()Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟ۦ۟ۡ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Dialog;

    invoke-static {v0}, Landroidx/customview/ۡۤۡۤ;->ۧۢۡۧ(Ljava/lang/Object;)V

    const/4 v0, 0x0

    sput-object v0, Lkevin/fun/hook/VoiceAssistantHook;->dialogRef:Ljava/lang/ref/WeakReference;

    :goto_3
    :sswitch_9
    return-void

    :sswitch_a
    instance-of v1, p0, Landroid/app/Activity;

    const v0, 0xbe7f

    :goto_4
    const v2, 0xbe90

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_3

    goto :goto_4

    :cond_3
    :sswitch_b
    const v0, 0xbebd

    goto :goto_4

    :sswitch_c
    if-nez v1, :cond_3

    const v0, 0xbedc

    goto :goto_4

    :sswitch_d
    check-cast p0, Landroid/app/Activity;

    invoke-static {p0}, Landroidx/loader/ۣۦ۟ۡ;->ۥۣ۠ۨ(Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xbefb

    :goto_5
    const v2, 0xbf0c

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_4

    goto :goto_5

    :cond_4
    :sswitch_e
    const v0, 0xbf39

    goto :goto_5

    :sswitch_f
    if-nez v1, :cond_4

    const v0, 0xc1e3

    goto :goto_5

    :sswitch_10
    invoke-static {p0}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۥۣۢۥ(Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xc202

    :goto_6
    const v2, 0xc213

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :sswitch_11
    if-eqz v1, :cond_5

    const v0, 0xc25f

    goto :goto_6

    :cond_5
    :sswitch_12
    const v0, 0xc240

    goto :goto_6

    :sswitch_13
    const v0, 0xc27e

    :goto_7
    const v1, 0xc28f

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_6

    goto :goto_7

    :sswitch_14
    const v0, 0xc29d

    goto :goto_7

    :sswitch_15
    invoke-static {p0}, Lkevin/fun/hook/VoiceAssistantHook;->۟ۧۡۦ۠(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const v0, 0xc2fa

    :goto_8
    const v1, 0xc30b

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_7

    goto :goto_8

    :sswitch_16
    const v0, 0xc5a4

    goto :goto_8

    :catch_0
    move-exception v0

    invoke-static {v0}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۤ۟۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v2

    const/16 v3, 0x7a4

    sget v4, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۡۨۨۧ:I

    xor-int/lit16 v4, v4, -0x1f6

    const/16 v5, 0x864

    invoke-static {v2, v3, v4, v5}, Landroidx/emoji2/ۢۧۡۧ;->۟ۥۢ۟ۢ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۨ۟(Ljava/lang/Object;)V

    goto/16 :goto_3

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_a
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_a
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_b
        0x2d -> :sswitch_d
        0x4c -> :sswitch_9
        0xef -> :sswitch_c
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_e
        0x35 -> :sswitch_9
        0x1f7 -> :sswitch_f
        0x7eef -> :sswitch_10
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_11
        0x32 -> :sswitch_12
        0x4c -> :sswitch_13
        0x53 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_9
        0xf1 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_16
        0x6af -> :sswitch_9
    .end sparse-switch
.end method

.method private static showToast(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۤۧۡۨ()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda26;

    invoke-direct {v1, p0, p1}, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda26;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-static {v0, v1}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-static {}, Landroidx/loader/ۣۦ۟ۡ;->۟ۦ۠ۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "rGFbL"

    invoke-static {v0}, Lkevin/fun/hook/۟ۥ۠۠;->ۣۣۤۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(D)V

    :sswitch_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method public static startVoiceAssistant(Landroid/content/Context;)V
    .locals 6

    :try_start_0
    invoke-static {p0}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۤ۠ۡ(Ljava/lang/Object;)V

    const/4 v0, 0x0

    invoke-static {v0}, Lkevin/fun/hook/VoiceAssistantHook;->۟ۥۨۢۧ(Ljava/lang/Object;)V

    const/4 v0, 0x1

    sput-boolean v0, Lkevin/fun/hook/VoiceAssistantHook;->isInitialized:Z

    instance-of v1, p0, Landroid/app/Activity;

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    new-instance v0, Ljava/lang/ref/WeakReference;

    check-cast p0, Landroid/app/Activity;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lkevin/fun/hook/VoiceAssistantHook;->currentActivityRef:Ljava/lang/ref/WeakReference;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x6eb

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۦۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v2

    const/16 v3, 0x7b6

    sget v4, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣ۠ۧ:I

    xor-int/lit16 v4, v4, -0x1e5

    const/16 v5, 0x192

    invoke-static {v2, v3, v4, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟ۡۧۨ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۨ۟(Ljava/lang/Object;)V

    :sswitch_4
    invoke-static {}, Lkevin/fun/hook/۟ۥ۠۠;->ۥ۠۠ۤ()I

    move-result v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_5
    if-ltz v1, :cond_1

    const v0, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_6
    const v0, 0xbe41

    goto :goto_2

    :sswitch_7
    const-string v0, "llgNeE"

    invoke-static {v0}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۥ۟ۡۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_8
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_5
        0xb918 -> :sswitch_8
        0xb939 -> :sswitch_7
        0xb97b -> :sswitch_6
    .end sparse-switch
.end method

.method public static stopVoiceAssistant(Landroid/content/Context;)V
    .locals 6

    :try_start_0
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->۟ۤۧۦ۟()V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۡۢ۟۟()V

    const/4 v0, 0x0

    sput-boolean v0, Lkevin/fun/hook/VoiceAssistantHook;->isInitialized:Z

    const/4 v0, 0x0

    sput-object v0, Lkevin/fun/hook/VoiceAssistantHook;->currentActivityRef:Ljava/lang/ref/WeakReference;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :goto_1
    :sswitch_0
    invoke-static {}, Landroidx/startup/۟ۦۤۨۧ;->ۣۨۢۤ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_2
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_2

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x729

    goto :goto_2

    :sswitch_2
    const/16 v0, 0x66f

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۦۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->ۢۧۤۤ()[S

    move-result-object v2

    const/16 v3, 0x7c5

    sget v4, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    xor-int/lit16 v4, v4, 0x38d

    const/16 v5, 0x642

    invoke-static {v2, v3, v4, v5}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۢۥ۠۟([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/VoiceAssistantHook;->ۦۨ۟(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    :sswitch_3
    const/16 v0, 0x70a

    goto :goto_2

    :sswitch_4
    const-string v0, "7v7qSzS1n"

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۢۥۥ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_1
        0x36 -> :sswitch_3
        0x1d7 -> :sswitch_5
        0x1f4 -> :sswitch_4
    .end sparse-switch
.end method

.method public static ۟۟۟۟ۤ()I
    .locals 2

    invoke-static {}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۡۧۦۤ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget v0, Lkevin/fun/hook/VoiceAssistantHook;->ttsStabilityBoost:I

    :sswitch_3
    return v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣ۟۟ۡۧ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۥۢۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/content/Context;

    check-cast p1, Ljava/lang/String;

    invoke-static {p0, p1}, Lkevin/fun/hook/VoiceAssistantHook;->showToast(Landroid/content/Context;Ljava/lang/String;)V

    :sswitch_3
    return-void

    :sswitch_4
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣ۟۟ۧۤ()I
    .locals 2

    invoke-static {}, Landroidx/documentfile/ۡۢ۟ۥ;->۟۟ۧۢۡ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget v0, Lkevin/fun/hook/VoiceAssistantHook;->currentTtsRemaining:I

    :sswitch_3
    return v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟۟ۤۢ۟(Ljava/lang/Object;F)I
    .locals 2

    invoke-static {}, Landroidx/interpolator/ۦۨۢۦ;->ۣۤۦۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/content/Context;

    invoke-static {p0, p1}, Lkevin/fun/hook/VoiceAssistantHook;->dpToPx(Landroid/content/Context;F)I

    move-result v0

    :sswitch_3
    return v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟۟ۧ۟ۤ()Ljava/lang/Runnable;
    .locals 2

    invoke-static {}, Landroidx/viewpager/ۣۢ۟ۤ;->ۥ۠ۤ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/VoiceAssistantHook;->onReplaceCompleteCallback:Ljava/lang/Runnable;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟۠ۢ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠ۦۤۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroidx/documentfile/provider/DocumentFile;

    check-cast p1, Ljava/util/List;

    invoke-static {p0, p1}, Lkevin/fun/hook/VoiceAssistantHook;->scanDocumentTree(Landroidx/documentfile/provider/DocumentFile;Ljava/util/List;)V

    :sswitch_3
    return-void

    :sswitch_4
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۡ۟ۡۦ()Landroid/net/Uri;
    .locals 2

    invoke-static {}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۥۥۦۢ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/VoiceAssistantHook;->selectedAudio:Landroid/net/Uri;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۡ۟ۨۦ(Ljava/lang/Object;)Landroid/widget/LinearLayout;
    .locals 2

    invoke-static {}, Landroidx/startup/۟ۦۤۨۧ;->ۣۨۢۤ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/app/Activity;

    invoke-static {p0}, Lkevin/fun/hook/VoiceAssistantHook;->createLocalAudioLayout(Landroid/app/Activity;)Landroid/widget/LinearLayout;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣ۟ۡۢ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۥۦۨ۠()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Ljava/lang/String;

    check-cast p1, Landroid/widget/TextView;

    invoke-static {p0, p1}, Lkevin/fun/hook/VoiceAssistantHook;->downloadAudioFile(Ljava/lang/String;Landroid/widget/TextView;)V

    :sswitch_3
    invoke-static {}, Landroidx/vectordrawable/۟ۤۨۥۣ;->۟ۥۧۨ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-gtz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const-string v0, "jUj7xxTMObjTTEkCL8pCp"

    invoke-static {v0}, Landroidx/documentfile/ۡۢ۟ۥ;->ۣ۠ۧ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_7
    return-void

    :sswitch_8
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_9
    const v0, 0xbe22

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_9
        0xb97b -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣ۟ۡۢ۟()Z
    .locals 2

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠ۦۤۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-boolean v0, Lkevin/fun/hook/VoiceAssistantHook;->ttsBreakClone:Z

    :sswitch_3
    return v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۡۥۢۨ()V
    .locals 3

    invoke-static {}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۤۡۥۣ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->doReplace()V

    :sswitch_3
    invoke-static {}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۤۡۥۣ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-ltz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const-string v0, "DuXtaiQszke6LHhakQK"

    invoke-static {v0}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->۟۠ۧۡ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(D)V

    :sswitch_7
    return-void

    :sswitch_8
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_9
    const v0, 0xbe22

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_9
        0xb97b -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۢۢۤۦ()I
    .locals 2

    invoke-static {}, Landroidx/activity/ۣۦۡۥ;->ۦۧۥۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget v0, Lkevin/fun/hook/VoiceAssistantHook;->ttsRandomness:I

    :sswitch_3
    return v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۢۢۥۦ(Ljava/lang/Object;)Landroid/widget/LinearLayout;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣۣ۟۠()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/app/Activity;

    invoke-static {p0}, Lkevin/fun/hook/VoiceAssistantHook;->createTabBar(Landroid/app/Activity;)Landroid/widget/LinearLayout;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۢۤ۠ۥ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۣ۟ۦۣۤ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Ljava/lang/String;

    check-cast p1, Landroid/widget/TextView;

    invoke-static {p0, p1}, Lkevin/fun/hook/VoiceAssistantHook;->performTtsConversion(Ljava/lang/String;Landroid/widget/TextView;)V

    :sswitch_3
    return-void

    :sswitch_4
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣ۟ۢۤۤ()Ljava/lang/ref/WeakReference;
    .locals 2

    invoke-static {}, Landroidx/customview/ۡۤۡۤ;->۟ۡ۠ۧ۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/VoiceAssistantHook;->dialogRef:Ljava/lang/ref/WeakReference;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۢۥۦۡ(Ljava/lang/Object;Z)V
    .locals 2

    invoke-static {}, Landroidx/loader/ۣۦ۟ۡ;->۟ۦ۠ۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/widget/TextView;

    invoke-static {p0, p1}, Lkevin/fun/hook/VoiceAssistantHook;->setTabActive(Landroid/widget/TextView;Z)V

    :sswitch_3
    invoke-static {}, Landroidx/core/ktx/۟۟ۨۧ۠;->ۣ۟ۦۣۡ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-gtz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const-string v0, "T2dClOYUFcOG"

    invoke-static {v0}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->۟ۡۨ۟ۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_7
    return-void

    :sswitch_8
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_9
    const v0, 0xbe22

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_9
        0xb97b -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۢۥۣۨ(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)Landroid/widget/Button;
    .locals 2

    invoke-static {}, Landroidx/core/ۤۦ۟ۢ;->ۣۧۧۡ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/content/Context;

    check-cast p1, Ljava/lang/String;

    check-cast p3, Landroid/view/View$OnClickListener;

    invoke-static {p0, p1, p2, p3}, Lkevin/fun/hook/VoiceAssistantHook;->createSmallButton(Landroid/content/Context;Ljava/lang/String;ILandroid/view/View$OnClickListener;)Landroid/widget/Button;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣ۟ۡۧ۟()I
    .locals 2

    invoke-static {}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣ۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget v0, Lkevin/fun/hook/VoiceAssistantHook;->currentTtsCost:I

    :sswitch_3
    return v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۤ۟۠ۦ(Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟ۢۢۥ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/app/Activity;

    invoke-static {p0}, Lkevin/fun/hook/VoiceAssistantHook;->showConfigDialog(Landroid/app/Activity;)V

    :sswitch_3
    invoke-static {}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣۣ۟۠()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-ltz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const-string v0, "0G20zh4J"

    invoke-static {v0}, Landroidx/appcompat/ۣۧۤۢ;->۟۟ۡۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

    :sswitch_7
    return-void

    :sswitch_8
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_9
    const v0, 0xbe22

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_9
        0xb97b -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۤۡۦۡ()Z
    .locals 2

    invoke-static {}, Landroidx/activity/ۨ۠۟ۧ;->ۤۥۡ۠()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-boolean v0, Lkevin/fun/hook/VoiceAssistantHook;->isInitialized:Z

    :sswitch_3
    return v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۤۧۦ۟()V
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟ۡۤۦ۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->dismissDialog()V

    :sswitch_3
    return-void

    :sswitch_4
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۥۣ۠()I
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟ۡۤۦ۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget v0, Lkevin/fun/hook/VoiceAssistantHook;->ttsProbabilityOptimization:I

    :sswitch_3
    return v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۥۨۢۧ(Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۡۧۦۤ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Ljava/lang/Runnable;

    invoke-static {p0}, Lkevin/fun/hook/VoiceAssistantHook;->scanAudiosAsync(Ljava/lang/Runnable;)V

    :sswitch_3
    return-void

    :sswitch_4
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۦ۠۠۠(I)Landroid/graphics/drawable/Drawable;
    .locals 2

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠ۦۤۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/VoiceAssistantHook;->createButtonBg(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۦۤۢۨ()J
    .locals 3

    invoke-static {}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۢۥ۠()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-wide v0, Lkevin/fun/hook/VoiceAssistantHook;->currentTtsDuration:J

    :sswitch_3
    return-wide v0

    :sswitch_4
    const-wide/16 v0, 0x0

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v2, 0x6eb

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۦۥۣۢ()Ljava/util/List;
    .locals 2

    invoke-static {}, Landroidx/activity/ۨ۠۟ۧ;->ۤۥۡ۠()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/VoiceAssistantHook;->cachedAudioItems:Ljava/util/List;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۧۡۦ۠(Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۥۥۦۢ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/app/Activity;

    invoke-static {p0}, Lkevin/fun/hook/VoiceAssistantHook;->createDialog(Landroid/app/Activity;)V

    :sswitch_3
    return-void

    :sswitch_4
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۨ۠۠(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۢۡۡۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/app/Activity;

    check-cast p1, Ljava/lang/String;

    invoke-static {p0, p1}, Lkevin/fun/hook/VoiceAssistantHook;->playTtsAudio(Landroid/app/Activity;Ljava/lang/String;)V

    :sswitch_3
    return-void

    :sswitch_4
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣ۠۟۠(Ljava/lang/Object;)Landroid/widget/LinearLayout;
    .locals 2

    invoke-static {}, Landroidx/startup/۟ۦۤۨۧ;->ۣۨۢۤ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/app/Activity;

    invoke-static {p0}, Lkevin/fun/hook/VoiceAssistantHook;->createTtsLayout(Landroid/app/Activity;)Landroid/widget/LinearLayout;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۠۟ۥۦ()Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroidx/startup/ۤۧۥۣ;->۟۠ۨۢۡ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/VoiceAssistantHook;->ttsApiKey:Ljava/lang/String;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۠۠ۨ۟(Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/activity/ۣۦۡۥ;->ۦۧۥۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Lkevin/fun/hook/VoiceAssistantHook;->loadVoiceList(Landroid/content/Context;)V

    :sswitch_3
    return-void

    :sswitch_4
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۠ۡ۠۠(Ljava/lang/Object;)Landroid/widget/LinearLayout;
    .locals 2

    invoke-static {}, Landroidx/activity/ۦۧۥۥ;->ۣ۠ۦۤ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/app/Activity;

    invoke-static {p0}, Lkevin/fun/hook/VoiceAssistantHook;->createDialogContent(Landroid/app/Activity;)Landroid/widget/LinearLayout;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣۣ۠ۧ(Ljava/lang/Object;)Landroid/net/Uri;
    .locals 2

    invoke-static {}, Lorg/luckypray/dexkit/۠۠ۥ;->ۡۥ۠ۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/VoiceAssistantHook$AudioItem;

    iget-object v0, p0, Lkevin/fun/hook/VoiceAssistantHook$AudioItem;->uri:Landroid/net/Uri;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣ۠ۤۦ(Ljava/lang/Object;)Landroid/view/View;
    .locals 2

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۣ۟ۦۣۤ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/app/Activity;

    invoke-static {p0}, Lkevin/fun/hook/VoiceAssistantHook;->createPathHintView(Landroid/app/Activity;)Landroid/view/View;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۠ۤۨۧ()Ljava/util/concurrent/ExecutorService;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۡۢۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/VoiceAssistantHook;->executorService:Ljava/util/concurrent/ExecutorService;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۡۢ۟۟()V
    .locals 2

    invoke-static {}, Landroidx/customview/ۡۤۡۤ;->۟ۡ۠ۧ۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->releaseResources()V

    :sswitch_3
    invoke-static {}, Landroidx/customview/ۤۡۥ;->۟ۢۢۦ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-gtz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const-string v0, "iURwUFDk9tODc4feR"

    invoke-static {v0}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->۟ۡۨ۟ۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_7
    return-void

    :sswitch_8
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_9
    const v0, 0xbe22

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_9
        0xb97b -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۢ۟ۥۦ(Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۣۢۢۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/app/Activity;

    invoke-static {p0}, Lkevin/fun/hook/VoiceAssistantHook;->refreshAudioList(Landroid/app/Activity;)V

    :sswitch_3
    return-void

    :sswitch_4
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣۢۢۤ()Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۥۥۦۢ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/VoiceAssistantHook;->selectedVoiceId:Ljava/lang/String;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣۢۤۤ(Ljava/lang/Object;)V
    .locals 3

    invoke-static {}, Lkevin/fun/hook/۟ۥ۠۠;->ۥ۠۠ۤ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/app/Activity;

    invoke-static {p0}, Lkevin/fun/hook/VoiceAssistantHook;->doTtsReplace(Landroid/app/Activity;)V

    :sswitch_3
    invoke-static {}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟ۡۤۦ۟()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-ltz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const-string v0, "nFPYH9Q07d2dQsSLhYGWjqN06"

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۣۨۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

    :sswitch_7
    return-void

    :sswitch_8
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_9
    const v0, 0xbe22

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_9
        0xb97b -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۢۥ۟۟()Ljava/lang/ref/WeakReference;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢ۠ۨ۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/VoiceAssistantHook;->tabLocalRef:Ljava/lang/ref/WeakReference;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۢۥۨ۠()Ljava/lang/String;
    .locals 2

    invoke-static {}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۤۧۢ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/VoiceAssistantHook;->currentTtsAudioPath:Ljava/lang/String;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۢۧۤۤ()[S
    .locals 2

    invoke-static {}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۦۣۡۡ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/VoiceAssistantHook;->short:[S

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣ۟ۨۧ(Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۣ۟ۦۣۤ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/app/Activity;

    invoke-static {p0}, Lkevin/fun/hook/VoiceAssistantHook;->pickAudioDirectory(Landroid/app/Activity;)V

    :sswitch_3
    invoke-static {}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۤۦۣ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-gtz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const-string v0, "Yzp4QvtTvw1JjnDG"

    invoke-static {v0}, Landroidx/startup/ۤۧۥۣ;->۟ۡ۟ۡۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_7
    return-void

    :sswitch_8
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_9
    const v0, 0xbe22

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_9
        0xb97b -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣۢۤ()V
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۡۢۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->clearTtsResources()V

    :sswitch_3
    return-void

    :sswitch_4
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣۣۥۢ()Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟۟۠()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/VoiceAssistantHook;->targetReplaceDir:Ljava/lang/String;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣۥۥ۠(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)Landroid/widget/Button;
    .locals 2

    invoke-static {}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۤۧۢ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/content/Context;

    check-cast p1, Ljava/lang/String;

    check-cast p3, Landroid/view/View$OnClickListener;

    invoke-static {p0, p1, p2, p3}, Lkevin/fun/hook/VoiceAssistantHook;->createLargeButton(Landroid/content/Context;Ljava/lang/String;ILandroid/view/View$OnClickListener;)Landroid/widget/Button;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣۣۧ۠()Z
    .locals 2

    invoke-static {}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۣۢۢۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-boolean v0, Lkevin/fun/hook/VoiceAssistantHook;->ttsSharpen:Z

    :sswitch_3
    return v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۤ۟ۧ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟ۢۡ۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Ljava/lang/String;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/util/Map;

    invoke-static {p0, p1, p2}, Lkevin/fun/hook/VoiceAssistantHook$HttpApi;->post(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۤۥ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۤۥ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Ljava/lang/String;

    check-cast p1, Ljava/util/Map;

    invoke-static {p0, p1}, Lkevin/fun/hook/VoiceAssistantHook$HttpApi;->get(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۤۥۣۧ()Landroid/graphics/drawable/Drawable;
    .locals 2

    invoke-static {}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۦۣۡۡ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->createDialogBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۤۧۡۨ()Landroid/os/Handler;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟ۡۤۦ۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/VoiceAssistantHook;->mainHandler:Landroid/os/Handler;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣۤۧۢ(Ljava/lang/Object;)Landroid/graphics/drawable/Drawable;
    .locals 2

    invoke-static {}, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۤۥ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Lkevin/fun/hook/VoiceAssistantHook;->createEditTextBackground(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۥۣ۟ۡ()I
    .locals 2

    invoke-static {}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣ۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget v0, Lkevin/fun/hook/VoiceAssistantHook;->ttsSeed:I

    :sswitch_3
    return v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۥۣۤۡ()Z
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->۟۟ۡۡۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-boolean v0, Lkevin/fun/hook/VoiceAssistantHook;->ttsStream:Z

    :sswitch_3
    return v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۥۥ۟ۦ()Ljava/lang/ref/WeakReference;
    .locals 2

    invoke-static {}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۢۡۡۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/VoiceAssistantHook;->ttsSpinnerRef:Ljava/lang/ref/WeakReference;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۥۨۨۨ()Z
    .locals 2

    invoke-static {}, Lkevin/fun/hook/۟ۥ۠۠;->ۥ۠۠ۤ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-boolean v0, Lkevin/fun/hook/VoiceAssistantHook;->ttsSrt:Z

    :sswitch_3
    return v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۦۣۣ۟(Ljava/lang/Object;)Landroid/net/Uri;
    .locals 2

    invoke-static {}, Landroidx/appcompat/ۣۧۤۢ;->ۢ۟۟ۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Lkevin/fun/hook/VoiceAssistantHook;->getAudioDirUri(Landroid/content/Context;)Landroid/net/Uri;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۦۣ۟ۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/widget/Button;
    .locals 2

    invoke-static {}, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣۤۥۥ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/content/Context;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Landroid/view/View$OnClickListener;

    invoke-static {p0, p1, p2}, Lkevin/fun/hook/VoiceAssistantHook;->createTinyButton(Landroid/content/Context;Ljava/lang/String;Landroid/view/View$OnClickListener;)Landroid/widget/Button;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۦۣۥ()Ljava/util/Map;
    .locals 2

    invoke-static {}, Landroidx/activity/ۦۧۥۥ;->ۣ۠ۦۤ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/VoiceAssistantHook;->voiceList:Ljava/util/Map;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۦۤ۠ۡ(Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۤۧۢ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Lkevin/fun/hook/VoiceAssistantHook;->loadTtsConfig(Landroid/content/Context;)V

    :sswitch_3
    invoke-static {}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۡۧۦۤ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-gtz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const-string v0, "1CrKwLHCpx0zdj1wS"

    invoke-static {v0}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۧۡۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

    :sswitch_7
    return-void

    :sswitch_8
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_9
    const v0, 0xbe22

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_9
        0xb97b -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۦۥ۠ۢ()Ljava/lang/ref/WeakReference;
    .locals 2

    invoke-static {}, Landroidx/activity/ۦۧۥۥ;->ۣ۠ۦۤ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/VoiceAssistantHook;->tabTtsRef:Ljava/lang/ref/WeakReference;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۦۥۢۥ(Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۢۥ۠()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Lkevin/fun/hook/VoiceAssistantHook;->refreshTtsVoiceSpinner(Landroid/content/Context;)V

    :sswitch_3
    return-void

    :sswitch_4
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۦۦۡۧ()V
    .locals 2

    invoke-static {}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۣۨۧۥ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/VoiceAssistantHook;->releaseMediaPlayer()V

    :sswitch_3
    invoke-static {}, Landroidx/startup/ۤۧۥۣ;->۟۠ۨۢۡ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-gtz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const-string v0, "0EBjHwJ4lQW"

    invoke-static {v0}, Landroidx/loader/ۡۢۢ;->ۨۦۦۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_7
    return-void

    :sswitch_8
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_9
    const v0, 0xbe22

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_9
        0xb97b -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۦۧۡ۠(Ljava/lang/Object;)Landroid/widget/LinearLayout;
    .locals 2

    invoke-static {}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟۟۠()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/app/Activity;

    invoke-static {p0}, Lkevin/fun/hook/VoiceAssistantHook;->createTitleBar(Landroid/app/Activity;)Landroid/widget/LinearLayout;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۦۨ۟(Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/loader/۟۠ۢۧۡ;->۟ۦۨ۠ۥ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V

    :sswitch_3
    return-void

    :sswitch_4
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۧ۟ۢۥ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    invoke-static {}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->۟۟ۡۡۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/content/Context;

    check-cast p1, Ljava/lang/String;

    invoke-static {p0, p1}, Lkevin/fun/hook/VoiceAssistantHook;->saveTtsApiKey(Landroid/content/Context;Ljava/lang/String;)V

    :sswitch_3
    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۣ۟ۦۣۤ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-ltz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const-string v0, "ID74"

    invoke-static {v0}, Landroidx/core/ktx/۟۟ۡۢ۠;->۟ۥ۟ۨ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(D)V

    :sswitch_7
    return-void

    :sswitch_8
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_9
    const v0, 0xbe22

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_9
        0xb97b -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۧۡۦ۟(Ljava/lang/Object;Ljava/lang/Object;Z)Landroid/widget/TextView;
    .locals 2

    invoke-static {}, Landroidx/customview/ۤۡۥ;->۟ۢۢۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/content/Context;

    check-cast p1, Ljava/lang/String;

    invoke-static {p0, p1, p2}, Lkevin/fun/hook/VoiceAssistantHook;->createTab(Landroid/content/Context;Ljava/lang/String;Z)Landroid/widget/TextView;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣۧۤ۠(Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۢۡۡۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/VoiceAssistantHook$AudioAdapter;

    invoke-virtual {p0}, Lkevin/fun/hook/VoiceAssistantHook$AudioAdapter;->notifyDataSetChanged()V

    :sswitch_3
    return-void

    :sswitch_4
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۧۤۥۢ()Ljava/lang/ref/WeakReference;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۥۢۦ۠()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/VoiceAssistantHook;->audioListViewRef:Ljava/lang/ref/WeakReference;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣۨۡۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/core/ktx/۟۟ۨۧ۠;->ۣ۟ۦۣۡ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Ljava/lang/String;

    check-cast p1, Ljava/util/Map;

    check-cast p2, Landroid/widget/TextView;

    invoke-static {p0, p1, p2}, Lkevin/fun/hook/VoiceAssistantHook;->pollTtsResult(Ljava/lang/String;Ljava/util/Map;Landroid/widget/TextView;)V

    :sswitch_3
    return-void

    :sswitch_4
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣۨۤۢ()Ljava/lang/ref/WeakReference;
    .locals 2

    invoke-static {}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۣ۟ۡۨۡ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/VoiceAssistantHook;->currentActivityRef:Ljava/lang/ref/WeakReference;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۨۤۢۤ()Z
    .locals 2

    invoke-static {}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۤۦۣ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-boolean v0, Lkevin/fun/hook/VoiceAssistantHook;->ttsFlash:Z

    :sswitch_3
    return v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۨۥۧۦ(Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lkevin/fun/hook/۟ۥ۠۠;->ۥ۠۠ۤ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Lkevin/fun/hook/VoiceAssistantHook;->showDialogInternal(Landroid/content/Context;)V

    :sswitch_3
    invoke-static {}, Landroidx/drawerlayout/ۤۨۡۤ;->ۨۧۢۤ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-ltz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const-string v0, "QHWM"

    invoke-static {v0}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->۟ۡۨ۟ۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_7
    return-void

    :sswitch_8
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_9
    const v0, 0xbe22

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_9
        0xb97b -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۨۧۤۤ()Landroid/media/MediaPlayer;
    .locals 2

    invoke-static {}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۤۢۤۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/VoiceAssistantHook;->mediaPlayer:Landroid/media/MediaPlayer;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method
