.class public final Lkevin/fun/hook/DexKitFinder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkevin/fun/hook/DexKitFinder$FinderTask;,
        Lkevin/fun/hook/DexKitFinder$SafeFinder;
    }
.end annotation


# static fields
.field private static final BATCH_SIZE:I = 0x14

.field private static final GC_INTERVAL:I = 0xc

.field private static final KEY_COMMENT_INTERACTION_DELEGATE:Ljava/lang/String;

.field private static final TAG:Ljava/lang/String;

.field private static final TASK_NAMES:Ljava/util/Map;
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

.field private static currentTask:Ljava/util/concurrent/atomic/AtomicInteger;

.field private static volatile dialogShowing:Z

.field private static volatile isBackgroundMode:Z

.field private static volatile progressBar:Landroid/widget/ProgressBar;

.field private static volatile progressDialog:Landroid/app/AlertDialog;

.field private static volatile progressText:Landroid/widget/TextView;

.field private static final short:[S

.field private static taskCounter:I

.field private static volatile taskNameText:Landroid/widget/TextView;

.field private static totalTasks:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    const/16 v10, 0x5b6

    const/16 v9, 0x3b6

    const/16 v8, 0x361

    const/16 v7, 0x22d

    const/4 v4, 0x0

    const/16 v0, 0xb58

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/DexKitFinder;->short:[S

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟ۢۡۧۥ()[S

    move-result-object v0

    sget v1, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۥۦ:I

    xor-int/lit16 v1, v1, 0x27b

    const/16 v2, 0x3ab

    invoke-static {v0, v4, v1, v2}, Landroidx/drawerlayout/ۤۨۡۤ;->ۤ۠ۤ۠([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/DexKitFinder;->KEY_COMMENT_INTERACTION_DELEGATE:Ljava/lang/String;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v1, 0x1c

    sget v2, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    xor-int/lit16 v2, v2, 0x161

    const/16 v3, 0xc1b

    invoke-static {v0, v1, v2, v3}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠۠ۧۥ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/DexKitFinder;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v4}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Lkevin/fun/hook/DexKitFinder;->currentTask:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v4}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Lkevin/fun/hook/DexKitFinder;->totalTasks:Ljava/util/concurrent/atomic/AtomicInteger;

    sput-boolean v4, Lkevin/fun/hook/DexKitFinder;->dialogShowing:Z

    sput-boolean v4, Lkevin/fun/hook/DexKitFinder;->isBackgroundMode:Z

    sput v4, Lkevin/fun/hook/DexKitFinder;->taskCounter:I

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x23

    sget v3, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    xor-int/lit16 v3, v3, 0x16c

    const/16 v4, 0x85d    # 3.0E-42f

    invoke-static {v1, v2, v3, v4}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۧۨۦۦ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x38

    sget v4, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    xor-int/lit16 v4, v4, -0x217

    const/16 v5, 0xaf9

    invoke-static {v2, v3, v4, v5}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣ۟۠ۢۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x41

    sget v3, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    xor-int/lit16 v3, v3, -0x250

    const/16 v4, 0x4be

    invoke-static {v1, v2, v3, v4}, Landroidx/loader/ۢۥ۟;->۟ۧ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x57

    sget v4, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    xor-int/lit8 v4, v4, 0x58

    const/16 v5, 0x62e

    invoke-static {v2, v3, v4, v5}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۢۤۤ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x61

    sget v3, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۤ۟ۨ:I

    xor-int/lit16 v3, v3, -0x1a5

    const/16 v4, 0x826

    invoke-static {v1, v2, v3, v4}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۧۨۦۦ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x6c

    sget v4, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۨ۠ۧ:I

    xor-int/lit16 v4, v4, -0x1bc

    const/16 v5, 0xb4b

    invoke-static {v2, v3, v4, v5}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۢۥ۠۟([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x72

    sget v3, Landroidx/activity/ۨ۠۟ۧ;->۟ۦۥۢۢ:I

    xor-int/lit16 v3, v3, 0x324

    const/16 v4, 0x2d9

    invoke-static {v1, v2, v3, v4}, Landroidx/interpolator/۟ۧۦ۟ۨ;->۠ۤۤۡ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x83

    sget v4, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    xor-int/lit8 v4, v4, -0x20

    const/16 v5, 0x5f6

    invoke-static {v2, v3, v4, v5}, Landroidx/drawerlayout/ۤۨۡۤ;->ۤ۠ۤ۠([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x8f

    sget v3, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۦۣۧ:I

    xor-int/lit8 v3, v3, -0x70

    const/16 v4, 0xbfa

    invoke-static {v1, v2, v3, v4}, Landroidx/loader/ۡۢۢ;->ۡ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0xa4

    sget v4, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۥۧ۟:I

    xor-int/lit8 v4, v4, 0x1b

    const/16 v5, 0xcb1

    invoke-static {v2, v3, v4, v5}, Landroidx/emoji2/ۢۧۡۧ;->۟ۥۢ۟ۢ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0xac

    sget v3, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۨۤۨۡ:I

    xor-int/lit16 v3, v3, -0x3b4

    const/16 v4, 0x868

    invoke-static {v1, v2, v3, v4}, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۥۧۤ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0xc2

    sget v4, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۤۨۨ:I

    xor-int/lit16 v4, v4, 0x101

    const/16 v5, 0xac9

    invoke-static {v2, v3, v4, v5}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۢۤۤ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0xcf

    sget v3, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۤۥ:I

    xor-int/lit16 v3, v3, 0x3a1

    const/16 v4, 0xa49

    invoke-static {v1, v2, v3, v4}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢ۟ۥۨ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0xe7

    sget v4, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    xor-int/lit8 v4, v4, 0x55

    const/16 v5, 0x2f6

    invoke-static {v2, v3, v4, v5}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۢ۠ۥۨ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0xee

    sget v3, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    xor-int/lit16 v3, v3, 0x237

    const/16 v4, 0xca4

    invoke-static {v1, v2, v3, v4}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۢۤۤ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x107

    sget v4, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    xor-int/lit16 v4, v4, -0x218

    const/16 v5, 0xa21

    invoke-static {v2, v3, v4, v5}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢ۟ۥۨ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x10f

    sget v3, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    xor-int/lit16 v3, v3, 0x176

    const/16 v4, 0xb2d

    invoke-static {v1, v2, v3, v4}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۨۦۣۨ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x11f

    sget v4, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦۦۤ۟:I

    xor-int/lit16 v4, v4, 0x85

    const/16 v5, 0x289

    invoke-static {v2, v3, v4, v5}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۤۦۢۧ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x128

    sget v3, Landroidx/appcompat/ۣۧۤۢ;->۟۠ۡۤۤ:I

    xor-int/lit16 v3, v3, -0xe8

    const/16 v4, 0x44d

    invoke-static {v1, v2, v3, v4}, Landroidx/customview/ۤۡۥ;->۟ۢۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x133

    sget v4, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۤۨۨ:I

    xor-int/lit16 v4, v4, 0x104

    const/16 v5, 0xa51

    invoke-static {v2, v3, v4, v5}, Landroidx/activity/ۣۦۡۥ;->۟ۡۨ۟۟([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x13b

    sget v3, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    xor-int/lit16 v3, v3, -0x165

    const/16 v4, 0x504

    invoke-static {v1, v2, v3, v4}, Landroidx/versionedparcelable/۠ۡۧۤ;->۟۟ۤۢۡ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x149

    sget v4, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۢۥۨۦ:I

    xor-int/lit16 v4, v4, 0x29b

    const/16 v5, 0xc68

    invoke-static {v2, v3, v4, v5}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۦۣۣۦ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x151

    sget v3, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣ۠ۢۢ:I

    xor-int/lit8 v3, v3, -0x66

    const/16 v4, 0x4cf

    invoke-static {v1, v2, v3, v4}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦۣ۠ۤ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x15c

    sget v4, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۢۥۨۦ:I

    xor-int/lit16 v4, v4, 0x29b

    const/16 v5, 0x6c0

    invoke-static {v2, v3, v4, v5}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠۠ۧۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x164

    sget v3, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۦۣۧ:I

    xor-int/lit8 v3, v3, -0x75

    const/16 v4, 0x7a9

    invoke-static {v1, v2, v3, v4}, Landroidx/drawerlayout/ۤۨۡۤ;->ۤ۠ۤ۠([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x172

    sget v4, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۤۦۤۧ:I

    xor-int/lit16 v4, v4, 0x157

    const/16 v5, 0x9fa

    invoke-static {v2, v3, v4, v5}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧ۠ۥ۟([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x17a

    sget v3, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۤۦۤۧ:I

    xor-int/lit16 v3, v3, 0x14b

    const/16 v4, 0xcb8

    invoke-static {v1, v2, v3, v4}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣ۟۠ۢۡ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x18e

    sget v4, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    xor-int/lit16 v4, v4, -0x254

    const/16 v5, 0x754

    invoke-static {v2, v3, v4, v5}, Landroidx/versionedparcelable/۠ۡۧۤ;->۟۟ۤۢۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x198

    sget v3, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v3, v3, 0x12a

    const/16 v4, 0x9a9

    invoke-static {v1, v2, v3, v4}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۥۡۤۧ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x1a4

    sget v4, Landroidx/activity/ۦۧۥۥ;->۟ۦۢۧۤ:I

    xor-int/lit8 v4, v4, -0x3d

    const/16 v5, 0xa45

    invoke-static {v2, v3, v4, v5}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۧۨۦۦ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x1ac

    sget v3, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    xor-int/lit8 v3, v3, 0x5f

    const/16 v4, 0x983

    invoke-static {v1, v2, v3, v4}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣ۟۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x1b9

    sget v4, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣۡۢ۟:I

    xor-int/lit16 v4, v4, 0x324

    const/16 v5, 0x5d7

    invoke-static {v2, v3, v4, v5}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۨۤ۠۠([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x1bf

    sget v3, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    xor-int/lit16 v3, v3, 0x2f1

    const/16 v4, 0x31a

    invoke-static {v1, v2, v3, v4}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۢۤۤ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x1ce

    sget v4, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    xor-int/lit16 v4, v4, 0xc5

    const/16 v5, 0x94d

    invoke-static {v2, v3, v4, v5}, Landroidx/activity/ۤۧۧۧ;->ۣ۟۟۠ۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x1d4

    sget v3, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    xor-int/lit16 v3, v3, 0x169

    const/16 v4, 0x8f6

    invoke-static {v1, v2, v3, v4}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟۟۟ۦۢ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x1e3

    sget v4, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۥۦ:I

    xor-int/lit16 v4, v4, 0x260

    const/16 v5, 0x864

    invoke-static {v2, v3, v4, v5}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۢۤۤ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x1ea

    sget v3, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۡۨۨۧ:I

    xor-int/lit16 v3, v3, -0x1ea

    const/16 v4, 0xb10

    invoke-static {v1, v2, v3, v4}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۨۦۣۨ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x1f8

    sget v4, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    xor-int/lit16 v4, v4, -0x25f

    const/16 v5, 0x87c

    invoke-static {v2, v3, v4, v5}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۢۥ۠۟([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x1ff

    sget v4, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    xor-int/lit16 v4, v4, 0x38c

    const/16 v5, 0xa47

    invoke-static {v1, v3, v4, v5}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟۟۠ۤۤ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v4, 0x20d

    sget v5, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۨۥۦ۟:I

    xor-int/lit16 v5, v5, 0x29c

    const/16 v6, 0x3c8

    invoke-static {v3, v4, v5, v6}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۤ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x21e

    sget v4, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    xor-int/lit16 v4, v4, -0x211

    const/16 v5, 0x7bf

    invoke-static {v1, v3, v4, v5}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۢۤۤ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lkevin/fun/hook/DexKitFinder;->short:[S

    sget v4, Landroidx/activity/ۣۦۡۥ;->ۣۢۤۡ:I

    xor-int/lit8 v4, v4, 0x7

    const/16 v5, 0x177

    invoke-static {v3, v7, v4, v5}, Landroidx/customview/ۡۤۡۤ;->ۧ۟ۤۨ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x232

    sget v4, Landroidx/activity/ۦۧۥۥ;->۟ۦۢۧۤ:I

    xor-int/lit8 v4, v4, -0x3b

    const/16 v5, 0x5ba

    invoke-static {v1, v3, v4, v5}, Landroidx/customview/ۡۤۡۤ;->ۧ۟ۤۨ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v4, 0x240

    sget v5, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۡۨۨۧ:I

    xor-int/lit16 v5, v5, -0x1e1

    const/16 v6, 0x271

    invoke-static {v3, v4, v5, v6}, Landroidx/activity/ۤۧۧۧ;->ۣ۟۟۠ۡ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x247

    sget v4, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۤۥ:I

    xor-int/lit16 v4, v4, 0x3b6

    const/16 v5, 0x805

    invoke-static {v1, v3, v4, v5}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۤ۟۠([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v4, 0x256

    sget v5, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۥۧ۟:I

    xor-int/lit8 v5, v5, 0x1f

    const/16 v6, 0x458

    invoke-static {v3, v4, v5, v6}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۧۨۦۦ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x262

    sget v4, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/lit16 v4, v4, 0x306

    const/16 v5, 0x1b8

    invoke-static {v1, v3, v4, v5}, Lorg/luckypray/dexkit/۠۠ۥ;->۟ۥۧۦ۠([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v4, 0x27b

    sget v5, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    xor-int/lit8 v5, v5, -0x28

    const/16 v6, 0x3b8

    invoke-static {v3, v4, v5, v6}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧ۠ۥ۟([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x28d

    sget v4, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣ۠ۢۢ:I

    xor-int/lit8 v4, v4, -0x7e

    const/16 v5, 0x95b

    invoke-static {v1, v3, v4, v5}, Landroidx/appcompat/ۣۧۤۢ;->ۢۥۢ۟([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v4, 0x2a0

    sget v5, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    xor-int/lit16 v5, v5, -0x16d

    invoke-static {v3, v4, v5, v9}, Landroidx/loader/ۡۢۢ;->ۡ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v4, 0x2a6

    sget v5, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۢ۟ۡ:I

    xor-int/lit16 v5, v5, -0x27c

    const/16 v6, 0x5c4

    invoke-static {v1, v4, v5, v6}, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۡۨۧ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x2ba

    sget v4, Landroidx/core/ۧ۟ۤۨ;->ۣۤ۠ۤ:I

    xor-int/lit16 v4, v4, 0x1af

    const/16 v5, 0xb8e

    invoke-static {v1, v3, v4, v5}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۢ۠ۥۨ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v4, 0x2ca

    sget v5, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    xor-int/lit16 v5, v5, 0x2f9

    const/16 v6, 0x3a1

    invoke-static {v3, v4, v5, v6}, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۡۨۧ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x2d1

    sget v4, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۨۤۨۡ:I

    xor-int/lit16 v4, v4, -0x3ab

    const/16 v5, 0x33e

    invoke-static {v1, v3, v4, v5}, Landroidx/loader/ۡۢۢ;->ۡ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v4, 0x2e0

    sget v5, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    xor-int/lit8 v5, v5, -0x1c

    invoke-static {v3, v4, v5, v8}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۦۤۢۦ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x2e8

    sget v4, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۢۥۨۦ:I

    xor-int/lit16 v4, v4, 0x280

    const/16 v5, 0xb28

    invoke-static {v1, v3, v4, v5}, Landroidx/loader/ۢۥ۟;->۟ۧ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v4, 0x2fb

    sget v5, Lorg/luckypray/dexkit/۠۠ۥ;->ۣ۟ۡۢۡ:I

    xor-int/lit16 v5, v5, -0xe6

    const/16 v6, 0x765

    invoke-static {v3, v4, v5, v6}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۦۥۢ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x302

    sget v4, Landroidx/startup/۟ۦۤۨۧ;->ۧۡۡۦ:I

    xor-int/lit16 v4, v4, -0x105

    const/16 v5, 0x9b6

    invoke-static {v1, v3, v4, v5}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢۦۤ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v4, 0x313

    sget v5, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    xor-int/lit16 v5, v5, -0x3cc

    const/16 v6, 0x22a

    invoke-static {v3, v4, v5, v6}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۢۥ۠۟([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x31b

    sget v4, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۤۦۤۧ:I

    xor-int/lit16 v4, v4, 0x148

    const/16 v5, 0xb40

    invoke-static {v1, v3, v4, v5}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۤۦۢۧ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v4, 0x332

    sget v5, Landroidx/core/ۧ۟ۤۨ;->ۣۤ۠ۤ:I

    xor-int/lit16 v5, v5, 0x1b6

    const/16 v6, 0x570

    invoke-static {v3, v4, v5, v6}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۡۤۥ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x33b

    sget v4, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۨۥۦ۟:I

    xor-int/lit16 v4, v4, 0x282

    const/16 v5, 0x25b

    invoke-static {v1, v3, v4, v5}, Lkevin/fun/hook/۟ۥ۠۠;->ۣۨۢ۟([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v4, 0x34a

    sget v5, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۤۥ:I

    xor-int/lit16 v5, v5, 0x3be

    const/16 v6, 0x60c

    invoke-static {v3, v4, v5, v6}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۢۥ۠۟([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x351

    sget v4, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۢۥۨۦ:I

    xor-int/lit16 v4, v4, 0x283

    const/16 v5, 0xcc0

    invoke-static {v1, v3, v4, v5}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۢۥ۠۟([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lkevin/fun/hook/DexKitFinder;->short:[S

    sget v4, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۨۥۦ۟:I

    xor-int/lit16 v4, v4, 0x285

    const/16 v5, 0x50f

    invoke-static {v3, v8, v4, v5}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۢۧۢ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x369

    sget v4, Landroidx/startup/۟ۦۤۨۧ;->ۧۡۡۦ:I

    xor-int/lit16 v4, v4, -0x11b

    const/16 v5, 0x8ae

    invoke-static {v1, v3, v4, v5}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۧۡۥۡ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v4, 0x378

    sget v5, Landroidx/customview/ۤۡۥ;->ۣ۟ۢۥۢ:I

    xor-int/lit8 v5, v5, -0x63

    const/16 v6, 0x352

    invoke-static {v3, v4, v5, v6}, Landroidx/versionedparcelable/۠ۡۧۤ;->۟۟ۤۢۡ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x37f

    sget v4, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۤ۟ۧۤ:I

    xor-int/lit16 v4, v4, -0x1fe

    const/16 v5, 0x9b9

    invoke-static {v1, v3, v4, v5}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۤۦۢۧ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v4, 0x399

    sget v5, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    xor-int/lit16 v5, v5, -0x103

    const/16 v6, 0xa3e

    invoke-static {v3, v4, v5, v6}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧ۠ۥ۟([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x3a3

    sget v4, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    xor-int/lit16 v4, v4, 0x23d

    const/16 v5, 0x5fc

    invoke-static {v1, v3, v4, v5}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧ۠ۥ۟([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lkevin/fun/hook/DexKitFinder;->short:[S

    sget v4, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۡۨۨۧ:I

    xor-int/lit16 v4, v4, -0x1ed

    const/16 v5, 0x889

    invoke-static {v3, v9, v4, v5}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۦ۠ۧۨ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x3c1

    sget v4, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    xor-int/lit16 v4, v4, 0x39c

    const/16 v5, 0x2ec

    invoke-static {v1, v3, v4, v5}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۢۧۢ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v4, 0x3df

    sget v5, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v5, v5, 0x12f

    const/16 v6, 0x523

    invoke-static {v3, v4, v5, v6}, Landroidx/core/ktx/۟۟ۡۢ۠;->۟ۢۦۧ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x3e8

    sget v4, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۢۥۨۦ:I

    xor-int/lit16 v4, v4, 0x299

    const/16 v5, 0x8b2

    invoke-static {v1, v3, v4, v5}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢ۟ۥۨ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v4, 0x3f2

    sget v5, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/lit16 v5, v5, 0x31b

    const/16 v6, 0x5e4

    invoke-static {v3, v4, v5, v6}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۦۤۢۦ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x3f6

    sget v4, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۨ۠ۨ:I

    xor-int/lit16 v4, v4, 0x357

    const/16 v5, 0xc17

    invoke-static {v1, v3, v4, v5}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣ۟۠ۢۡ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v4, 0x402

    sget v5, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    xor-int/lit16 v5, v5, 0x16e

    const/16 v6, 0x34d

    invoke-static {v3, v4, v5, v6}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۦۣۣۦ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x40a

    sget v4, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    xor-int/lit16 v4, v4, 0x2ea

    const/16 v5, 0x8fe

    invoke-static {v1, v3, v4, v5}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۦۤۢۦ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v4, 0x41e

    sget v5, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۨۤۨۡ:I

    xor-int/lit16 v5, v5, -0x3ae

    invoke-static {v3, v4, v5, v7}, Landroidx/activity/ۦۧۥۥ;->۟ۤۡۦۦ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x426

    sget v4, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    xor-int/lit16 v4, v4, 0x3b2

    const/16 v5, 0x445

    invoke-static {v1, v3, v4, v5}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢ۟ۥۨ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v4, 0x438

    sget v5, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦۦۤ۟:I

    xor-int/lit16 v5, v5, 0x87

    const/16 v6, 0x159

    invoke-static {v3, v4, v5, v6}, Landroidx/loader/۟۠ۢۧۡ;->ۢ۟ۨۥ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x443

    sget v4, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    xor-int/lit16 v4, v4, -0x107

    const/16 v5, 0x8ea

    invoke-static {v1, v3, v4, v5}, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۡۨۧ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v4, 0x451

    sget v5, Landroidx/activity/ۨ۠۟ۧ;->۟ۦۥۢۢ:I

    xor-int/lit16 v5, v5, 0x325

    const/16 v6, 0x252

    invoke-static {v3, v4, v5, v6}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۨۦۣۨ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x461

    sget v4, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣ۠ۢۢ:I

    xor-int/lit8 v4, v4, -0x61

    const/16 v5, 0x3d2

    invoke-static {v1, v3, v4, v5}, Landroidx/core/ۧ۟ۤۨ;->ۡۥ۟ۥ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v4, 0x46f

    sget v5, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۨۥۦ۟:I

    xor-int/lit16 v5, v5, 0x29d

    const/16 v6, 0x3ff

    invoke-static {v3, v4, v5, v6}, Landroidx/loader/ۥۧۨۤ;->۟ۢۢ۠ۥ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x47f

    sget v4, Landroidx/loader/ۡۢۢ;->ۣۡۦ۟:I

    xor-int/lit16 v4, v4, -0x3b1

    const/16 v5, 0xb8f

    invoke-static {v1, v3, v4, v5}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۢ۠ۤۥ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v4, 0x48d

    sget v5, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    xor-int/lit16 v5, v5, -0x3d4

    const/16 v6, 0x762

    invoke-static {v3, v4, v5, v6}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۧۡۥۡ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x49d

    sget v4, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    xor-int/lit8 v4, v4, 0x7c

    const/16 v5, 0x780

    invoke-static {v1, v3, v4, v5}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۦۥۢ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v4, 0x4ab

    sget v5, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    xor-int/lit16 v5, v5, -0x119

    const/16 v6, 0x46c

    invoke-static {v3, v4, v5, v6}, Landroidx/core/ۤۦ۟ۢ;->ۣۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x4bb

    sget v4, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    xor-int/lit16 v4, v4, 0x380

    const/16 v5, 0x697

    invoke-static {v1, v3, v4, v5}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣۣ۟ۤۤ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v4, 0x4db

    sget v5, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۤ۟ۨ:I

    xor-int/lit16 v5, v5, -0x1c0

    const/16 v6, 0x633

    invoke-static {v3, v4, v5, v6}, Landroidx/loader/ۡۢۢ;->ۡ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x4eb

    sget v4, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۥۧ۟:I

    xor-int/lit8 v4, v4, 0x1c

    const/16 v5, 0x1c7

    invoke-static {v1, v3, v4, v5}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠۠ۧۥ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v4, 0x4fa

    sget v5, Landroidx/activity/ۣۦۡۥ;->ۣۢۤۡ:I

    xor-int/lit8 v5, v5, 0xa

    const/16 v6, 0xae3

    invoke-static {v3, v4, v5, v6}, Landroidx/activity/ۨ۠۟ۧ;->۟ۡۨۨۧ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x502

    sget v4, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/lit16 v4, v4, 0x303

    const/16 v5, 0x819

    invoke-static {v1, v3, v4, v5}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۦ۠ۧۨ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v4, 0x51e

    sget v5, Landroidx/loader/ۡۢۢ;->ۣۡۦ۟:I

    xor-int/lit16 v5, v5, -0x3b5

    const/16 v6, 0xc24

    invoke-static {v3, v4, v5, v6}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۦ۠ۧۨ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x528

    sget v4, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v4, v4, 0x135

    const/16 v5, 0x574

    invoke-static {v1, v3, v4, v5}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۦۤۢۦ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v4, 0x53b

    sget v5, Landroidx/customview/ۡۤۡۤ;->۟ۦ۟ۨۨ:I

    xor-int/lit16 v5, v5, 0xfa

    const/16 v6, 0x699

    invoke-static {v3, v4, v5, v6}, Landroidx/loader/ۢۥ۟;->۟ۧ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x544

    sget v4, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣ۠ۢۢ:I

    xor-int/lit8 v4, v4, -0x62

    const/16 v5, 0x211

    invoke-static {v1, v3, v4, v5}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۤۦۢۧ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v4, 0x553

    sget v5, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    xor-int/lit8 v5, v5, -0x65

    const/16 v6, 0x23f

    invoke-static {v3, v4, v5, v6}, Landroidx/activity/ۨ۠۟ۧ;->۟ۡۨۨۧ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x564

    sget v4, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۤ۟ۨ:I

    xor-int/lit16 v4, v4, -0x1a1

    const/16 v5, 0xbd9

    invoke-static {v1, v3, v4, v5}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۢ۠ۤۥ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x573

    sget v3, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    xor-int/lit16 v3, v3, -0x17b

    const/16 v4, 0xc69

    invoke-static {v1, v2, v3, v4}, Landroidx/core/ktx/۟۟ۡۢ۠;->۟ۢۦۧ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x583

    sget v4, Landroidx/activity/ۦۧۥۥ;->۟ۦۢۧۤ:I

    xor-int/lit8 v4, v4, -0x3d

    const/16 v5, 0x45b

    invoke-static {v2, v3, v4, v5}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦۣ۠ۤ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x58b

    sget v3, Landroidx/customview/ۡۤۡۤ;->۟ۦ۟ۨۨ:I

    xor-int/lit16 v3, v3, 0xe9

    const/16 v4, 0x1a2

    invoke-static {v1, v2, v3, v4}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۤۦۢۧ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x5a5

    sget v4, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۤ۟ۨ:I

    xor-int/lit16 v4, v4, -0x1a2

    const/16 v5, 0x618

    invoke-static {v2, v3, v4, v5}, Landroidx/appcompat/ۣۧۤۢ;->ۢۥۢ۟([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x5b3

    sget v3, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۨ۠ۧ:I

    xor-int/lit16 v3, v3, -0x19d

    const/16 v4, 0x629

    invoke-static {v1, v2, v3, v4}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۢۥ۠۟([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x5d4

    sget v4, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣۡۢ۟:I

    xor-int/lit16 v4, v4, 0x32f

    const/16 v5, 0x3a4

    invoke-static {v2, v3, v4, v5}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۤ۟۠([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x5e1

    sget v3, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    xor-int/lit16 v3, v3, 0x173

    const/16 v4, 0x72a

    invoke-static {v1, v2, v3, v4}, Landroidx/customview/ۡۤۡۤ;->ۧ۟ۤۨ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x5f6

    sget v4, Landroidx/customview/ۡۤۡۤ;->۟ۦ۟ۨۨ:I

    xor-int/lit16 v4, v4, 0xfb

    invoke-static {v2, v3, v4, v10}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۥۡۤۧ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x5fe

    sget v3, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v3, v3, 0x218

    const/16 v4, 0x53d

    invoke-static {v1, v2, v3, v4}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۤ۟۠([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x614

    sget v4, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/lit16 v4, v4, 0x315

    const/16 v5, 0x51c

    invoke-static {v2, v3, v4, v5}, Landroidx/core/ۤۦ۟ۢ;->ۣۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x61e

    sget v3, Landroidx/activity/ۤۧۧۧ;->۟۟ۢ۠ۡ:I

    xor-int/lit16 v3, v3, 0x1f6

    const/16 v4, 0x821

    invoke-static {v1, v2, v3, v4}, Landroidx/startup/۟ۦۤۨۧ;->۟ۦۦۦ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x63a

    sget v4, Landroidx/activity/ۦۧۥۥ;->۟ۦۢۧۤ:I

    xor-int/lit8 v4, v4, -0x3d

    const/16 v5, 0x1a7

    invoke-static {v2, v3, v4, v5}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۧۡۥۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x642

    sget v3, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۡۨۨۧ:I

    xor-int/lit16 v3, v3, -0x1f5

    const/16 v4, 0x8f5

    invoke-static {v1, v2, v3, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟ۡۧۨ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x655

    sget v4, Landroidx/startup/۟ۦۤۨۧ;->ۧۡۡۦ:I

    xor-int/lit16 v4, v4, -0x11d

    const/16 v5, 0x649

    invoke-static {v2, v3, v4, v5}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣۣ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x65e

    sget v3, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    xor-int/lit16 v3, v3, 0x17e

    const/16 v4, 0x71e

    invoke-static {v1, v2, v3, v4}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠۠ۧۥ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x676

    sget v4, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۤ۟ۨ:I

    xor-int/lit16 v4, v4, -0x1aa

    const/16 v5, 0x59f

    invoke-static {v2, v3, v4, v5}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۢۤۤ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x67c

    sget v3, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v3, v3, 0x21a

    const/16 v4, 0x774

    invoke-static {v1, v2, v3, v4}, Landroidx/loader/ۢۥ۟;->۟ۧ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x690

    sget v4, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۢ۟ۡ:I

    xor-int/lit16 v4, v4, -0x280

    const/16 v5, 0x64f

    invoke-static {v2, v3, v4, v5}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۥۡۤۧ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x6a0

    sget v3, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    xor-int/lit16 v3, v3, -0x334

    const/16 v4, 0x8c0

    invoke-static {v1, v2, v3, v4}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۢ۠ۤۥ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x6b1

    sget v4, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۤۨۨ:I

    xor-int/lit16 v4, v4, 0x106

    const/16 v5, 0x4c2

    invoke-static {v2, v3, v4, v5}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۢۤۤ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x6bb

    sget v3, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    xor-int/lit8 v3, v3, -0x19

    const/16 v4, 0x860

    invoke-static {v1, v2, v3, v4}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۦۥۢ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x6c6

    sget v4, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    xor-int/lit8 v4, v4, -0x33

    const/16 v5, 0x909

    invoke-static {v2, v3, v4, v5}, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۥۧۤ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x6cd

    sget v3, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۤۥ:I

    xor-int/lit16 v3, v3, 0x3a8

    const/16 v4, 0x6e1

    invoke-static {v1, v2, v3, v4}, Landroidx/startup/۟ۦۤۨۧ;->۟ۦۦۦ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x6de

    sget v4, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦۦۤ۟:I

    xor-int/lit16 v4, v4, 0x84

    const/16 v5, 0x406

    invoke-static {v2, v3, v4, v5}, Landroidx/loader/ۢۥ۟;->۟ۧ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x6e6

    sget v3, Landroidx/loader/ۡۢۢ;->ۣۡۦ۟:I

    xor-int/lit16 v3, v3, -0x3b5

    const/16 v4, 0x974

    invoke-static {v1, v2, v3, v4}, Landroidx/startup/۟ۦۤۨۧ;->۟ۦۦۦ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x6f0

    sget v4, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۨ۠ۧ:I

    xor-int/lit16 v4, v4, -0x1b6

    const/16 v5, 0x460

    invoke-static {v2, v3, v4, v5}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۤ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x6f8

    sget v3, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    xor-int/lit8 v3, v3, 0x5e

    const/16 v4, 0x37c

    invoke-static {v1, v2, v3, v4}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۢ۠ۥۨ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x70f

    sget v4, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    xor-int/lit16 v4, v4, 0x174

    const/16 v5, 0x173

    invoke-static {v2, v3, v4, v5}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۢۧۢ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x71c

    sget v3, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۥۨ:I

    xor-int/lit16 v3, v3, 0x296

    const/16 v4, 0x205

    invoke-static {v1, v2, v3, v4}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧ۠ۥ۟([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x72e

    sget v4, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    xor-int/lit16 v4, v4, 0x17f

    const/16 v5, 0xb48

    invoke-static {v2, v3, v4, v5}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣۣ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x734

    sget v3, Landroidx/activity/ۤۧۧۧ;->۟۟ۢ۠ۡ:I

    xor-int/lit16 v3, v3, 0x1f1

    const/16 v4, 0xa08

    invoke-static {v1, v2, v3, v4}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۢ۠ۤۥ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x74f

    sget v4, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    xor-int/lit8 v4, v4, 0x41

    const/16 v5, 0x2d6

    invoke-static {v2, v3, v4, v5}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۤ۟۠([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x757

    sget v3, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    xor-int/lit16 v3, v3, 0x259

    const/16 v4, 0x257

    invoke-static {v1, v2, v3, v4}, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۡۨۧ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x761

    sget v4, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    xor-int/lit16 v4, v4, -0x16e

    const/16 v5, 0x44e

    invoke-static {v2, v3, v4, v5}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۥۡۤۧ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x768

    sget v3, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۨ۠ۧ:I

    xor-int/lit16 v3, v3, -0x1ad

    const/16 v4, 0x5c9

    invoke-static {v1, v2, v3, v4}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟۟۠ۤۤ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x779

    sget v4, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۤ۟ۨ:I

    xor-int/lit16 v4, v4, -0x1a8

    const/16 v5, 0x80e

    invoke-static {v2, v3, v4, v5}, Landroidx/activity/ۨ۠۟ۧ;->۟ۡۨۨۧ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x781

    sget v3, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۥۧ۟:I

    xor-int/lit8 v3, v3, 0xf

    const/16 v4, 0xa39

    invoke-static {v1, v2, v3, v4}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۢۧۢ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x79d

    sget v4, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣ۠ۢۢ:I

    xor-int/lit8 v4, v4, -0x65

    const/16 v5, 0x713

    invoke-static {v2, v3, v4, v5}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۧۨۦۦ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x7a7

    sget v3, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    xor-int/lit16 v3, v3, -0x167

    const/16 v4, 0x999

    invoke-static {v1, v2, v3, v4}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۧۢۨۡ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x7b3

    sget v4, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۦۣۧ:I

    xor-int/lit8 v4, v4, -0x7d

    const/16 v5, 0xbd2

    invoke-static {v2, v3, v4, v5}, Landroidx/customview/ۡۤۡۤ;->ۧ۟ۤۨ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x7b9

    sget v3, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    xor-int/lit16 v3, v3, 0x233

    const/16 v4, 0x9d6

    invoke-static {v1, v2, v3, v4}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟۟۠ۤۤ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x7d6

    sget v4, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    xor-int/lit16 v4, v4, -0x252

    const/16 v5, 0x7d2

    invoke-static {v2, v3, v4, v5}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۢۦۣ۠([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x7de

    sget v3, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v3, v3, 0x227

    const/16 v4, 0x24e

    invoke-static {v1, v2, v3, v4}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۨۦۣۨ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x807

    sget v4, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣ۠ۧ:I

    xor-int/lit16 v4, v4, -0x1ff

    const/16 v5, 0x819

    invoke-static {v2, v3, v4, v5}, Landroidx/core/ۧ۟ۤۨ;->ۡۥ۟ۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x81c

    sget v3, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    xor-int/lit16 v3, v3, 0x17f

    const/16 v4, 0x5bb

    invoke-static {v1, v2, v3, v4}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۦۥۢ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x835

    sget v4, Landroidx/activity/ۦۧۥۥ;->۟ۦۢۧۤ:I

    xor-int/lit8 v4, v4, -0x33

    const/16 v5, 0x857

    invoke-static {v2, v3, v4, v5}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۦ۠ۧۨ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x83b

    sget v3, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۢ۠۠ۨ:I

    xor-int/lit8 v3, v3, -0x63

    const/16 v4, 0x59c

    invoke-static {v1, v2, v3, v4}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۤۦۢۧ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x863

    sget v4, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۦۣۧ:I

    xor-int/lit8 v4, v4, -0x72

    const/16 v5, 0x1d2

    invoke-static {v2, v3, v4, v5}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۤ۟۠([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x86e

    sget v3, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۤ۟ۨ:I

    xor-int/lit16 v3, v3, -0x1b4

    const/16 v4, 0x602

    invoke-static {v1, v2, v3, v4}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣۣ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x88a

    sget v4, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    xor-int/lit16 v4, v4, 0x2f7

    const/16 v5, 0x320

    invoke-static {v2, v3, v4, v5}, Landroidx/startup/۟ۦۤۨۧ;->۟ۦۦۦ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x893

    sget v3, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    xor-int/lit16 v3, v3, 0x396

    const/16 v4, 0x263

    invoke-static {v1, v2, v3, v4}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۧۢۨۡ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x8a7

    sget v4, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۨ۠ۧ:I

    xor-int/lit16 v4, v4, -0x1b6

    const/16 v5, 0xb42

    invoke-static {v2, v3, v4, v5}, Landroidx/activity/ۨ۠۟ۧ;->۟ۡۨۨۧ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x8af

    sget v3, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    xor-int/lit16 v3, v3, 0xd6

    invoke-static {v1, v2, v3, v10}, Landroidx/customview/ۡۤۡۤ;->ۧ۟ۤۨ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x8c4

    sget v4, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    xor-int/lit8 v4, v4, 0x58

    const/16 v5, 0xbbb

    invoke-static {v2, v3, v4, v5}, Landroidx/versionedparcelable/۠ۡۧۤ;->۟۟ۤۢۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x8ce

    sget v3, Lorg/luckypray/dexkit/۠۠ۥ;->ۣ۟ۡۢۡ:I

    xor-int/lit16 v3, v3, -0xc3

    const/16 v4, 0x894

    invoke-static {v1, v2, v3, v4}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۧۡۥۡ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x8ee

    sget v4, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۧۨۨ:I

    xor-int/lit8 v4, v4, -0x69

    const/16 v5, 0x685

    invoke-static {v2, v3, v4, v5}, Landroidx/core/ۧ۟ۤۨ;->ۡۥ۟ۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x8f8

    sget v3, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۥۨ:I

    xor-int/lit16 v3, v3, 0x296

    const/16 v4, 0x356

    invoke-static {v1, v2, v3, v4}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟۟۠ۤۤ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x90a

    sget v4, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    xor-int/lit16 v4, v4, 0x2f7

    const/16 v5, 0x43d

    invoke-static {v2, v3, v4, v5}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢ۟ۥۨ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x913

    sget v3, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    xor-int/lit16 v3, v3, -0x20a

    const/16 v4, 0x9b1

    invoke-static {v1, v2, v3, v4}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢۦۤ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x929

    sget v4, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    xor-int/lit16 v4, v4, 0x303

    const/16 v5, 0x766

    invoke-static {v2, v3, v4, v5}, Landroidx/activity/ۨ۠۟ۧ;->۟ۡۨۨۧ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x937

    sget v3, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v3, v3, 0x203

    const/16 v4, 0x9e7

    invoke-static {v1, v2, v3, v4}, Landroidx/loader/ۥۧۨۤ;->۟ۢۢ۠ۥ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x944

    sget v4, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۨۤۨۡ:I

    xor-int/lit16 v4, v4, -0x3ae

    const/16 v5, 0x9fa

    invoke-static {v2, v3, v4, v5}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۢ۠ۥۨ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x94c

    sget v3, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    xor-int/lit16 v3, v3, 0xd7

    const/16 v4, 0x9da

    invoke-static {v1, v2, v3, v4}, Landroidx/activity/ۨ۠۟ۧ;->۟ۡۨۨۧ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x960

    sget v4, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    xor-int/lit16 v4, v4, 0x170

    const/16 v5, 0xc9b

    invoke-static {v2, v3, v4, v5}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۡۤۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

    sget-object v1, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v2, 0x969

    sget v3, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦۦۤ۟:I

    xor-int/lit16 v3, v3, 0x81

    const/16 v4, 0xb46

    invoke-static {v1, v2, v3, v4}, Landroidx/customview/ۤۡۥ;->۟ۢۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkevin/fun/hook/DexKitFinder;->short:[S

    const/16 v3, 0x976

    sget v4, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣ۠ۢۢ:I

    xor-int/lit8 v4, v4, -0x62

    const/16 v5, 0x91a

    invoke-static {v2, v3, v4, v5}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۥۡۤۧ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :array_0
    .array-data 2
        0x3e8s
        0x3e4s
        0x3e6s
        0x3e6s
        0x3ees
        0x3e5s
        0x3ffs
        0x3f4s
        0x3e2s
        0x3e5s
        0x3ffs
        0x3ees
        0x3f9s
        0x3eas
        0x3e8s
        0x3ffs
        0x3e2s
        0x3e4s
        0x3e5s
        0x3f4s
        0x3efs
        0x3ees
        0x3e7s
        0x3ees
        0x3ecs
        0x3eas
        0x3ffs
        0x3ees
        0x3c0bs
        0xc50s
        0xc7es
        0xc6ds
        0xc72s
        0xc75s
        0x3c0as
        0x810s
        0x81cs
        0x814s
        0x813s
        0x802s
        0x809s
        0x81cs
        0x81fs
        0x802s
        0x811s
        0x81cs
        0x804s
        0x812s
        0x808s
        0x809s
        0x802s
        0x81es
        0x811s
        0x81cs
        0x80es
        0x80es
        0x6d1cs
        0x6887s
        0x44c2s
        -0x6d74s
        0x62fes
        0x7187s
        0x54fas
        0x56b9s
        0x7682s
        0x4f3s
        0x4ffs
        0x4f7s
        0x4f0s
        0x4e1s
        0x4eas
        0x4ffs
        0x4fcs
        0x4e1s
        0x4f2s
        0x4ffs
        0x4e7s
        0x4f1s
        0x4ebs
        0x4eas
        0x4e1s
        0x4f3s
        0x4fbs
        0x4eas
        0x4f6s
        0x4f1s
        0x4fas
        0x61cbs
        0x6450s
        -0x61a8s
        -0x693as
        0x6e29s
        0x7d50s
        0x635es
        0x6540s
        0x6397s
        0x6afbs
        0x86es
        0x849s
        0x84bs
        0x843s
        0x872s
        0x847s
        0x844s
        0x86fs
        0x852s
        0x843s
        0x84bs
        0x6caes
        0x6935s
        -0x6d23s
        -0x6cc2s
        -0x64bes
        -0x6cces
        0x29es
        0x29cs
        0x28ds
        0x286s
        0x28ds
        0x298s
        0x29bs
        0x286s
        0x290s
        0x29ds
        0x286s
        0x294s
        0x29cs
        0x28ds
        0x291s
        0x296s
        0x29ds
        0x6213s
        0x6788s
        -0x79bfs
        0x5620s
        0x6df1s
        0x7e88s
        0x5d6s
        0x5bfs
        0x5b2s
        0x5d6s
        0x604fs
        0x6923s
        0xbb7s
        0xbbfs
        0xba9s
        0xba9s
        0xbbbs
        0xbbds
        0xbbfs
        0xba5s
        0xbb2s
        0xbbbs
        0xbb4s
        0xbbes
        0xbb6s
        0xbbfs
        0xba8s
        0xba5s
        0xbb9s
        0xbb6s
        0xbbbs
        0xba9s
        0xba9s
        0x6b54s
        0x6ecfs
        0x6139s
        0x6cdes
        0x55b5s
        0x78b7s
        0x5ad9s
        0x70cas
        0x82bs
        0x827s
        0x825s
        0x825s
        0x82ds
        0x826s
        0x83cs
        0x837s
        0x82es
        0x83as
        0x829s
        0x82fs
        0x825s
        0x82ds
        0x826s
        0x83cs
        0x837s
        0x82bs
        0x824s
        0x829s
        0x83bs
        0x83bs
        0x6d2cs
        0x68b7s
        -0x7ef3s
        -0x7e8ds
        0xa8fs
        0xabbs
        0xaa8s
        0xaaes
        0xaa4s
        0xaacs
        0xaa7s
        0xabds
        0x76b2s
        0xa08s
        0xa1es
        0xa0cs
        0xa04s
        0xa0cs
        0xa16s
        0xa1bs
        0xa08s
        0xa1es
        0xa16s
        0xa08s
        0xa0ds
        0xa16s
        0xa0cs
        0xa1bs
        0xa1bs
        0xa06s
        0xa1bs
        0xa16s
        0xa0as
        0xa05s
        0xa08s
        0xa1as
        0xa1as
        0x6513s
        0x6088s
        0x5169s
        0x5b3ds
        0x5c89s
        0x56bcs
        0x7e8ds
        0xce5s
        0xcf3s
        0xce1s
        0xce9s
        0xce1s
        0xcfbs
        0xcf6s
        0xce5s
        0xcf3s
        0xcfbs
        0xce5s
        0xce0s
        0xcfbs
        0xce1s
        0xcf6s
        0xcf6s
        0xcebs
        0xcf6s
        0xcfbs
        0xce9s
        0xce1s
        0xcf0s
        0xcecs
        0xcebs
        0xce0s
        0x6dc4s
        0x685fs
        0x59bes
        0x53eas
        0x545es
        0x5e6bs
        0x6f98s
        0x66f4s
        0xb7fs
        0xb48s
        0xb40s
        0xb42s
        0xb5bs
        0xb48s
        0xb72s
        0xb6cs
        0xb4es
        0xb59s
        0xb44s
        0xb42s
        0xb43s
        0xb6fs
        0xb4cs
        0xb5fs
        0x656cs
        0x60f7s
        0x6644s
        0x4dd5s
        0x6a86s
        0x7b72s
        -0x6b13s
        0x6730s
        0x6e5cs
        0x41fs
        0x408s
        0x40cs
        0x409s
        0x412s
        0x409s
        0x402s
        0x400s
        0x40cs
        0x41fs
        0x406s
        0x6db4s
        0x682fs
        0x57a3s
        -0x7e56s
        0x6256s
        -0x7e1fs
        0x6fe8s
        0x6684s
        0x556s
        0x541s
        0x545s
        0x540s
        0x55bs
        0x540s
        0x54bs
        0x556s
        0x541s
        0x555s
        0x551s
        0x541s
        0x557s
        0x550s
        0x6b8ds
        0x6e16s
        0x519as
        -0x786ds
        -0x7861s
        0x602as
        0x69d1s
        0x60bds
        0x483s
        0x486s
        0x499s
        0x48as
        0x490s
        0x481s
        0x49as
        0x482s
        0x48ds
        0x48as
        0x49ds
        0x6125s
        0x64bes
        0x7034s
        0x626ds
        0x487as
        0x63b0s
        0x6379s
        0x6a15s
        0x7fas
        0x7ccs
        0x7c7s
        0x7cds
        0x7e4s
        0x7das
        0x7ces
        0x7e1s
        0x7c8s
        0x7c7s
        0x7cds
        0x7c5s
        0x7ccs
        0x7dbs
        0x6e1fs
        0x6b84s
        0x6472s
        0x6995s
        0x5a2bs
        -0x6605s
        0x6c43s
        0x652fs
        0xcees
        0xcd1s
        0xcdcs
        0xcdds
        0xcd7s
        0xcees
        0xcd1s
        0xcdds
        0xccfs
        0xcf0s
        0xcd7s
        0xcd4s
        0xcdcs
        0xcdds
        0xccas
        0xce7s
        0xcdas
        0xcd1s
        0xcd6s
        0xcdcs
        0x60b1s
        0x652as
        -0x716es
        -0x603bs
        -0x716es
        0x51aas
        0x7985s
        0x5cces
        0x62eds
        0x6b81s
        0x9ebs
        0x9c8s
        0x9cas
        0x9c2s
        0x9f6s
        0x9fbs
        0x9ccs
        0x9cfs
        0x9dbs
        0x9ccs
        0x9das
        0x9c1s
        0x6da0s
        0x683bs
        -0x7a6fs
        0x5c9bs
        0x5872s
        0x6ff5s
        0x6ffcs
        0x6690s
        0x9c7s
        0x9ecs
        0x9f6s
        0x9e1s
        0x9efs
        0x9e6s
        0x9dcs
        0x9ees
        0x9e6s
        0x9f7s
        0x9ebs
        0x9ecs
        0x9e7s
        0x6232s
        0x67a9s
        0x561bs
        0x542cs
        0x606es
        0x6902s
        0x358s
        0x353s
        0x35ds
        0x345s
        0x35fs
        0x357s
        0x355s
        0x350s
        0x353s
        0x345s
        0x359s
        0x356s
        0x35bs
        0x349s
        0x349s
        0x6ea8s
        0x6b33s
        0x506as
        -0x7edbs
        0x6988s
        0x7536s
        0x8b7s
        0x8a3s
        0x8a2s
        0x8b9s
        0x8a9s
        0x8a6s
        0x8bas
        0x8b7s
        0x8afs
        0x8a9s
        0x8b5s
        0x8bas
        0x8b7s
        0x8a5s
        0x8a5s
        0x6f81s
        0x6a1as
        -0x7672s
        0x5accs
        -0x7846s
        0x6cc9s
        0x741fs
        0xb45s
        0xb63s
        0xb75s
        0xb62s
        0xb59s
        0xb7es
        0xb76s
        0xb7fs
        0xb4fs
        0xb53s
        0xb5cs
        0xb51s
        0xb43s
        0xb43s
        0x6f99s
        0x6a02s
        0x7d54s
        0x6a4bs
        0x479ds
        0x6813s
        0x7407s
        0xa09s
        0xa22s
        0xa30s
        0xa05s
        0xa00s
        0xa04s
        0xa22s
        0xa2bs
        0xa2bs
        0xa14s
        0xa33s
        0xa26s
        0xa33s
        0xa22s
        0x642ds
        0x61b6s
        0x386s
        0x3ads
        0x3bfs
        0x38as
        0x38fs
        0x38bs
        0x3ads
        0x3a4s
        0x3a4s
        0x39bs
        0x3bcs
        0x3a9s
        0x3bcs
        0x3ads
        0x7fb3s
        0x7ecs
        0x7das
        0x7d1s
        0x7dbs
        0x7f2s
        0x7ccs
        0x7d8s
        0x7f7s
        0x7des
        0x7d1s
        0x7dbs
        0x7d3s
        0x7das
        0x7cds
        0x7ccs
        0x6692s
        0x6309s
        0x52a6s
        -0x6e8as
        0x7d0cs
        0x5f7s
        0x5dbs
        0x5c8s
        0x5d1s
        0x5c8s
        0x5dfs
        0x5dbs
        0x5des
        0x5e5s
        0x5f9s
        0x5f6s
        0x5fbs
        0x5e9s
        0x5e9s
        0x6594s
        0x600fs
        0x6a76s
        -0x763fs
        0x4d6bs
        -0x7654s
        0x7e0as
        0x856s
        0x86cs
        0x868s
        0x855s
        0x869s
        0x864s
        0x87cs
        0x860s
        0x877s
        0x85as
        0x846s
        0x869s
        0x864s
        0x876s
        0x876s
        0x63bds
        0x6626s
        0x40bs
        0x431s
        0x435s
        0x408s
        0x434s
        0x439s
        0x421s
        0x43ds
        0x42as
        0x7823s
        0x1f6s
        0x1dds
        0x1cfs
        0x1fas
        0x1dfs
        0x1fbs
        0x1d7s
        0x1d6s
        0x1ccs
        0x1dds
        0x1d6s
        0x1ccs
        0x1fbs
        0x1dds
        0x1d4s
        0x1d4s
        0x1eds
        0x1f1s
        0x1e7s
        0x1f5s
        0x1fds
        0x1ecs
        0x1f0s
        0x1f7s
        0x1fcs
        0x645ds
        0x61c6s
        0x6608s
        0x753cs
        0x398s
        0x3fas
        0x3dfs
        0x398s
        0x523ds
        0x5801s
        0x50eds
        0x52fbs
        0x398s
        0x3eds
        0x3f1s
        0x398s
        0x6601s
        0x6f6ds
        0x913s
        0x914s
        0x916s
        0x91es
        0x90bs
        0x91as
        0x91cs
        0x91es
        0x904s
        0x90fs
        0x912s
        0x916s
        0x91es
        0x904s
        0x918s
        0x917s
        0x91as
        0x908s
        0x908s
        0x6453s
        0x61c8s
        -0x65e0s
        -0x643ds
        0x6640s
        -0x69bes
        0x58cs
        0x58bs
        0x589s
        0x581s
        0x594s
        0x585s
        0x583s
        0x581s
        0x59bs
        0x590s
        0x58ds
        0x589s
        0x581s
        0x59bs
        0x5a9s
        0x5a1s
        0x5b0s
        0x5acs
        0x5abs
        0x5a0s
        0xbccs
        0xbc1s
        0xbdas
        0xbdas
        0xbc1s
        0xbc3s
        0xbd1s
        0xbdas
        0xbcfs
        0xbccs
        0xbd1s
        0xbcds
        0xbc2s
        0xbcfs
        0xbdds
        0xbdds
        0x6444s
        0x61dfs
        0x5d34s
        -0x6cb7s
        0x6ba6s
        0x78dfs
        0x7fdas
        0x36as
        0x377s
        0x373s
        0x37bs
        0x36bs
        0x36as
        0x377s
        0x372s
        0x36ds
        0x361s
        0x37ds
        0x372s
        0x37fs
        0x36ds
        0x36ds
        0x6484s
        0x611fs
        0x6697s
        -0x696bs
        0x6b5ds
        0x5c6es
        0x5077s
        0x7f1as
        0xb64s
        0xb41s
        0xb5es
        0xb4ds
        0xb7bs
        0xb51s
        0xb46s
        0xb5cs
        0xb40s
        0xb4ds
        0xb5bs
        0xb41s
        0xb5bs
        0xb77s
        0xb6bs
        0xb64s
        0xb69s
        0xb7bs
        0xb7bs
        0x6080s
        0x651bs
        0x5cfbs
        0x56d0s
        0x536ds
        0x6575s
        0x7b1es
        0x9ffs
        0x987s
        0x98es
        0x9f8s
        0x9e9s
        0x9e3s
        0x9ffs
        0x9e9s
        0x9fds
        0x9ffs
        0x9e2s
        0x9e9s
        0x9f5s
        0x9fas
        0x9f7s
        0x9e5s
        0x9e5s
        0x65cfs
        0x6054s
        0x675as
        -0x6c1bs
        0x6a16s
        0x5d25s
        0x513cs
        0x7e51s
        0xb01s
        0xb35s
        0xb24s
        0xb29s
        0xb2fs
        0xb12s
        0xb25s
        0xb23s
        0xb2fs
        0xb32s
        0xb24s
        0xb13s
        0xb34s
        0xb21s
        0xb34s
        0xb35s
        0xb33s
        0xb1fs
        0xb03s
        0xb0cs
        0xb01s
        0xb13s
        0xb13s
        0x6295s
        0x670es
        -0x6d7ds
        -0x621fs
        -0x7140s
        0x5a25s
        0x77c6s
        0x6571s
        0x790bs
        0x20ds
        0x234s
        0x232s
        0x238s
        0x23es
        0x21ds
        0x232s
        0x237s
        0x23es
        0x204s
        0x218s
        0x217s
        0x21as
        0x208s
        0x208s
        0x61e9s
        0x6472s
        -0x6e01s
        -0x6163s
        0x791fs
        0x5d54s
        0x7a77s
        0xc96s
        0xcafs
        0xca9s
        0xca3s
        0xca5s
        0xc86s
        0xca9s
        0xcacs
        0xca5s
        0xc9fs
        0xcads
        0xca5s
        0xcb4s
        0xca8s
        0xcafs
        0xca4s
        0x62eas
        0x6771s
        -0x6d04s
        -0x6262s
        0x7a1cs
        0x5e57s
        0x60b6s
        0x69das
        0x8fds
        0x8e5s
        0x8e7s
        0x8e0s
        0x8f1s
        0x8efs
        0x8eas
        0x8f1s
        0x8eds
        0x8e6s
        0x8efs
        0x8fes
        0x8fas
        0x8ebs
        0x8fcs
        0x64b7s
        0x612cs
        -0x715fs
        -0x736bs
        0x79b2s
        -0x7e30s
        0x7f29s
        0x9fas
        0x9d6s
        0x9d4s
        0x9d4s
        0x9dcs
        0x9d7s
        0x9cds
        0x9f1s
        0x9dcs
        0x9d8s
        0x9dds
        0x9dcs
        0x9cbs
        0x9ees
        0x9d0s
        0x9dds
        0x9des
        0x9dcs
        0x9cds
        0x9e6s
        0x9d4s
        0x9dcs
        0x9cds
        0x9d1s
        0x9d6s
        0x9dds
        0x6ddbs
        0x6840s
        -0x7e06s
        -0x7e7cs
        0x530as
        -0x652as
        0x74fas
        0x44c8s
        0x6f87s
        0x66ebs
        0x5bfs
        0x593s
        0x591s
        0x591s
        0x599s
        0x592s
        0x588s
        0x595s
        0x592s
        0x58cs
        0x589s
        0x588s
        0x5a3s
        0x591s
        0x599s
        0x588s
        0x594s
        0x593s
        0x598s
        0x6f6cs
        0x6af7s
        -0x7cb3s
        -0x7ccds
        -0x78e6s
        0x59ecs
        0x60cfs
        0x5a92s
        0x5673s
        0x6d30s
        0x645cs
        0x2afs
        0x283s
        0x281s
        0x281s
        0x289s
        0x282s
        0x298s
        0x2bcs
        0x28ds
        0x28bs
        0x289s
        0x2a4s
        0x289s
        0x28ds
        0x288s
        0x289s
        0x29es
        0x2a1s
        0x283s
        0x288s
        0x299s
        0x280s
        0x289s
        0x2b3s
        0x2a1s
        0x2a9s
        0x2b8s
        0x2a4s
        0x2a3s
        0x2a8s
        0x62c6s
        0x675ds
        -0x7119s
        -0x7167s
        0x5c17s
        0x6f02s
        0x5274s
        0x609as
        0x69f6s
        0x8f3s
        0x8f3s
        0x8f3s
        0x8eds
        0x8ffs
        0x8f7s
        0x8e6s
        0x8fas
        0x8fds
        0x8f6s
        0x6201s
        0x679as
        0x605ds
        0x6931s
        0xc41s
        0xc5es
        0xc53s
        0xc52s
        0xc58s
        0xc48s
        0xc51s
        0xc5es
        0xc52s
        0xc5bs
        0xc53s
        0xc44s
        0x64a8s
        0x6133s
        -0x7575s
        -0x6424s
        -0x6435s
        0x5492s
        0x581as
        0x68f8s
        0x8a8s
        0x8b7s
        0x8bas
        0x8bbs
        0x8b1s
        0x8a1s
        0x8bas
        0x8abs
        0x8acs
        0x8bfs
        0x8aas
        0x8b7s
        0x8b1s
        0x8b0s
        0x8a1s
        0x8b8s
        0x8b7s
        0x8bbs
        0x8b2s
        0x8bas
        0x65c8s
        0x6053s
        -0x7415s
        -0x6544s
        0x6532s
        -0x6827s
        0x597as
        0x6998s
        0x417s
        0x42cs
        0x435s
        0x436s
        0x404s
        0x421s
        0x424s
        0x435s
        0x431s
        0x420s
        0x437s
        0x41as
        0x428s
        0x420s
        0x431s
        0x42ds
        0x42as
        0x421s
        0x66bcs
        0x6327s
        0x10bs
        0x130s
        0x129s
        0x12as
        -0x6ea5s
        -0x6fecs
        0x5731s
        0x64e0s
        0x6d8cs
        0x8abs
        0x88es
        0x88bs
        0x89as
        0x89es
        0x88fs
        0x898s
        0x8dbs
        0x8b5s
        0x8a9s
        0x8a6s
        0x8abs
        0x8b9s
        0x8b9s
        0x65b7s
        0x602cs
        0x213s
        0x236s
        0x233s
        0x222s
        0x226s
        0x237s
        0x220s
        0x263s
        0x20ds
        0x211s
        0x21es
        0x213s
        0x201s
        0x201s
        0x393s
        0x3b6s
        0x3b3s
        0x3a2s
        0x3a6s
        0x3b7s
        0x3a0s
        0x3e0s
        0x38ds
        0x391s
        0x39es
        0x393s
        0x381s
        0x381s
        0x641as
        0x6181s
        0x3bes
        0x39bs
        0x39es
        0x38fs
        0x38bs
        0x39as
        0x38ds
        0x3cds
        0x3a0s
        0x3bcs
        0x3b3s
        0x3bes
        0x3acs
        0x3acs
        0xbces
        0xbebs
        0xbees
        0xbffs
        0xbfbs
        0xbeas
        0xbfds
        0xbbcs
        0xbd0s
        0xbccs
        0xbc3s
        0xbces
        0xbdcs
        0xbdcs
        0x6087s
        0x651cs
        0x723s
        0x706s
        0x703s
        0x712s
        0x716s
        0x707s
        0x710s
        0x751s
        0x73ds
        0x721s
        0x72es
        0x723s
        0x731s
        0x731s
        0x7c1s
        0x7e4s
        0x7e1s
        0x7f0s
        0x7f4s
        0x7e5s
        0x7f2s
        0x7b4s
        0x7dfs
        0x7c3s
        0x7ccs
        0x7c1s
        0x7d3s
        0x7d3s
        0x6389s
        0x6612s
        0x42ds
        0x408s
        0x40ds
        0x41cs
        0x418s
        0x409s
        0x41es
        0x458s
        0x433s
        0x42fs
        0x420s
        0x42ds
        0x43fs
        0x43fs
        0x6d1s
        0x6d2s
        0x6d2s
        0x6d3s
        0x6c8s
        0x6d5s
        0x6d8s
        0x6c3s
        0x6c3s
        0x6d8s
        0x6das
        0x6c8s
        0x6d5s
        0x6d6s
        0x6c5s
        0x6c8s
        0x6d4s
        0x6d8s
        0x6d9s
        0x6c3s
        0x6d6s
        0x6des
        0x6d9s
        0x6d2s
        0x6c5s
        0x6c8s
        0x6das
        0x6d2s
        0x6c3s
        0x6dfs
        0x6d8s
        0x6d3s
        0x61d6s
        0x644ds
        0x672s
        0x657s
        0x652s
        0x643s
        0x647s
        0x656s
        0x641s
        0x606s
        0x66cs
        0x670s
        0x67fs
        0x672s
        0x660s
        0x660s
        0x194s
        0x182s
        0x193s
        0x198s
        0x183s
        0x186s
        0x193s
        0x186s
        0x198s
        0x18as
        0x182s
        0x193s
        0x18fs
        0x188s
        0x183s
        0x6d06s
        0x689ds
        -0x7ea3s
        0x5179s
        0x6f93s
        0x698ds
        0x6f5as
        0x6636s
        0x85bs
        0x878s
        0x86as
        0x87cs
        0x84as
        0x87cs
        0x86as
        0x86as
        0x870s
        0x876s
        0x877s
        0x84fs
        0x870s
        0x87cs
        0x86es
        0x851s
        0x876s
        0x875s
        0x87ds
        0x87cs
        0x86bs
        0x846s
        0x874s
        0x87cs
        0x86ds
        0x871s
        0x876s
        0x87ds
        0x6bc1s
        0x6e5as
        0x5bdes
        0x6b08s
        0x433es
        -0x7807s
        -0x7a1es
        0x5adas
        0x699ds
        0x60f1s
        0x536s
        0x535s
        0x527s
        0x531s
        0x52bs
        0x535s
        0x530s
        0x535s
        0x524s
        0x520s
        0x531s
        0x526s
        0x52bs
        0x539s
        0x531s
        0x520s
        0x53cs
        0x53bs
        0x530s
        0x617cs
        0x64e7s
        0x5163s
        0x7ed9s
        -0x6965s
        -0x682cs
        0x50f1s
        0x6320s
        0x6a4cs
        0x254s
        0x25cs
        0x241s
        0x245s
        0x248s
        0x24es
        0x242s
        0x244s
        0x253s
        0x24es
        0x252s
        0x25ds
        0x250s
        0x242s
        0x242s
        0x65das
        0x6041s
        0x27as
        0x272s
        0x26fs
        0x26bs
        0x266s
        0x260s
        0x26cs
        0x26as
        0x27ds
        0x260s
        0x27cs
        0x273s
        0x27es
        0x26cs
        0x26cs
        0xb8cs
        0xb8as
        0xb9cs
        0xb8bs
        0xb86s
        0xb90s
        0xb97s
        0xb9fs
        0xb96s
        0xb86s
        0xb9as
        0xb95s
        0xb98s
        0xb8as
        0xb8as
        0xc3cs
        0xc3as
        0xc2cs
        0xc3bs
        0xc36s
        0xc24s
        0xc26s
        0xc2ds
        0xc2cs
        0xc25s
        0xc36s
        0xc2as
        0xc25s
        0xc28s
        0xc3as
        0xc3as
        0x63bes
        0x6625s
        0x7173s
        0x666cs
        0x6e7as
        0x53d0s
        0x7820s
        0x5670s
        0x1f5s
        0x1c3s
        0x1ces
        0x1ces
        0x1d2s
        0x1c3s
        0x1d2s
        0x1c7s
        0x1d0s
        0x1efs
        0x1c3s
        0x1d1s
        0x1c9s
        0x1e1s
        0x1c7s
        0x1ces
        0x1ces
        0x1f7s
        0x1ebs
        0x1fds
        0x1efs
        0x1e7s
        0x1f6s
        0x1eas
        0x1eds
        0x1e6s
        0x61fds
        0x6466s
        0x5ed9s
        0x78a0s
        -0x698as
        0x7971s
        0x554ds
        0x575bs
        0x638s
        0x64ds
        0x651s
        0x638s
        0x63a1s
        0x6acds
        0x664s
        0x67cs
        0x665s
        0x67ds
        0x660s
        0x676s
        0x66ds
        0x670s
        0x667s
        0x668s
        0x664s
        0x660s
        0x66as
        0x676s
        0x660s
        0x66as
        0x666s
        0x667s
        0x676s
        0x66as
        0x66cs
        0x665s
        0x665s
        0x676s
        0x67cs
        0x660s
        0x676s
        0x664s
        0x66cs
        0x67ds
        0x661s
        0x666s
        0x66ds
        0x6441s
        0x61das
        0x5abes
        0x510cs
        0x63a5s
        0x555as
        0x6ba3s
        0x50f1s
        0x52e7s
        0x3f1s
        0x3eds
        0x661ds
        0x6f71s
        0x778s
        0x74fs
        0x759s
        0x75as
        0x745s
        0x744s
        0x759s
        0x74fs
        0x76bs
        0x74es
        0x74bs
        0x75as
        0x75es
        0x74fs
        0x758s
        0x775s
        0x769s
        0x766s
        0x76bs
        0x779s
        0x779s
        0x6253s
        0x67c8s
        -0x7390s
        -0x62d9s
        -0x6a4cs
        -0x6b05s
        0x53des
        0x79cds
        0x574s
        0x570s
        0x562s
        0x56es
        0x578s
        0x56es
        0x56es
        0x574s
        0x572s
        0x573s
        0x562s
        0x570s
        0x572s
        0x579s
        0x578s
        0x571s
        0x562s
        0x57es
        0x571s
        0x57cs
        0x56es
        0x56es
        0x62f9s
        0x6762s
        0x555s
        0x551s
        0x53cs
        0x4a06s
        -0x713fs
        0x6f3ds
        0x5297s
        0x7967s
        0x86cs
        0x864s
        0x872s
        0x872s
        0x860s
        0x866s
        0x864s
        0x87es
        0x872s
        0x864s
        0x875s
        0x87es
        0x86ds
        0x86es
        0x862s
        0x860s
        0x86ds
        0x87es
        0x864s
        0x879s
        0x875s
        0x87es
        0x86cs
        0x864s
        0x875s
        0x869s
        0x86es
        0x865s
        0x6642s
        0x63d9s
        0x6c2fs
        0x61c8s
        0x668bs
        0x5697s
        0x641es
        0x6d72s
        0x8b7s
        0x8b4s
        0x8a6s
        0x8b0s
        0x8aas
        0x8b6s
        0x8bas
        0x8bbs
        0x8a1s
        0x8b0s
        0x8bbs
        0x8a1s
        0x8aas
        0x8b8s
        0x8b0s
        0x8a1s
        0x8bds
        0x8bas
        0x8b1s
        0x61acs
        0x6437s
        0x544fs
        0x48e2s
        0x554cs
        0x5452s
        0x58b3s
        0x63f0s
        0x6a9cs
        0x75cs
        0x75fs
        0x74ds
        0x75bs
        0x741s
        0x75ds
        0x751s
        0x750s
        0x74as
        0x75bs
        0x750s
        0x74as
        0x741s
        0x74as
        0x74cs
        0x74bs
        0x75bs
        0x741s
        0x753s
        0x75bs
        0x74as
        0x756s
        0x751s
        0x75as
        0x627as
        0x67e1s
        0x5799s
        0x4b34s
        0x6026s
        0x694as
        0x732s
        0x718s
        0x701s
        0x70cs
        0x724s
        0x715s
        0x713s
        0x711s
        0x724s
        0x715s
        0x706s
        0x715s
        0x719s
        0x707s
        0x72bs
        0x737s
        0x738s
        0x735s
        0x727s
        0x727s
        0x61aas
        0x6431s
        0x609s
        0x623s
        0x63as
        0x637s
        0x61fs
        0x62es
        0x628s
        0x62as
        0x61fs
        0x62es
        0x63ds
        0x62es
        0x622s
        0x63cs
        0x882s
        0x88fs
        0x894s
        0x894s
        0x88fs
        0x88ds
        0x89fs
        0x894s
        0x881s
        0x882s
        0x89fs
        0x88ds
        0x885s
        0x894s
        0x888s
        0x88fs
        0x884s
        0x6327s
        0x66bcs
        0x5a57s
        -0x6bd6s
        0x6cc5s
        0x7fbcs
        0x56d9s
        0x5a38s
        0x617bs
        0x6817s
        0x825s
        0x82ds
        0x82fs
        0x82as
        0x829s
        0x83fs
        0x823s
        0x82cs
        0x821s
        0x833s
        0x833s
        0x6eecs
        0x6b77s
        -0x7e9fs
        0x69ccs
        -0x67bcs
        0x7667s
        0x7572s
        0x6a4s
        0x6acs
        0x6aes
        0x6abs
        0x6a8s
        0x6bes
        0x6a9s
        0x688s
        0x685s
        0x684s
        0x6bes
        0x6acs
        0x6a4s
        0x6b5s
        0x6a9s
        0x6aes
        0x6a5s
        0x63e3s
        0x6678s
        -0x6d6as
        -0x7e37s
        -0x7392s
        0x64c3s
        0x61bfs
        0x68d3s
        0x937s
        0x93bs
        0x939s
        0x939s
        0x931s
        0x93as
        0x920s
        0x92bs
        0x936s
        0x933s
        0x6385s
        0x661es
        -0x705cs
        -0x7026s
        -0x7b54s
        0x620fs
        0x61d9s
        0x68b5s
        0x335s
        0x331s
        0x323s
        0x33as
        0x313s
        0x30es
        0x30bs
        0x31ds
        0x30es
        0x318s
        0x323s
        0x33ds
        0x31fs
        0x308s
        0x315s
        0x313s
        0x312s
        0x323s
        0x33fs
        0x310s
        0x31ds
        0x30fs
        0x30fs
        0x6696s
        0x630ds
        0x13as
        0x13es
        -0x71e1s
        0x52a2s
        0x132s
        0x110s
        0x107s
        0x11as
        0x11cs
        0x11ds
        0x7d08s
        0x248s
        0x240s
        0x256s
        0x256s
        0x244s
        0x242s
        0x240s
        0x25as
        0x243s
        0x24cs
        0x240s
        0x249s
        0x241s
        0x25as
        0x24bs
        0x244s
        0x248s
        0x240s
        0x6cads
        0x6936s
        0x66c0s
        0x6b27s
        0x501fs
        0x60fds
        0xa5bs
        0xa60s
        0xa69s
        0xa7as
        0xa6ds
        0xa58s
        0xa69s
        0xa6bs
        0xa63s
        0xa69s
        0xa6fs
        0xa6ds
        0xa57s
        0xa5bs
        0xa7cs
        0xa69s
        0xa7cs
        0xa61s
        0xa6bs
        0xa57s
        0xa4bs
        0xa7as
        0xa6ds
        0xa69s
        0xa7cs
        0xa67s
        0xa7as
        0x6533s
        0x60a8s
        0x50d0s
        0x4c7ds
        0x51d3s
        0x50cds
        0x5c2cs
        0x54bes
        0x204s
        0x21fs
        0x216s
        0x205s
        0x212s
        0x208s
        0x21as
        0x212s
        0x219s
        0x202s
        0x63abs
        0x6630s
        0x5648s
        0x4ae5s
        -0x786es
        0x571bs
        0x7835s
        0x59as
        0x581s
        0x588s
        0x59bs
        0x58cs
        0x596s
        0x584s
        0x58cs
        0x587s
        0x59cs
        0x596s
        0x584s
        0x58cs
        0x59ds
        0x581s
        0x586s
        0x58ds
        0x6febs
        0x6a70s
        0x5a08s
        0x46a5s
        -0x742es
        0x5b5bs
        0x6db7s
        0x64dbs
        0xa6ds
        0xa70s
        0xa74s
        0xa7cs
        0xa66s
        0xa7as
        0xa76s
        0xa74s
        0xa69s
        0xa76s
        0xa77s
        0xa7cs
        0xa77s
        0xa6ds
        0xa66s
        0xa6cs
        0xa69s
        0xa7ds
        0xa78s
        0xa6ds
        0xa7cs
        0xa66s
        0xa74s
        0xa7cs
        0xa6ds
        0xa71s
        0xa76s
        0xa7ds
        0x60f6s
        0x656ds
        0x62e5s
        -0x6d19s
        0x79d7s
        0x49e5s
        0x61e7s
        0x62a3s
        0x62aas
        0x6bc6s
        0x9dcs
        0x9f4s
        0x9f6s
        0x9f3s
        0x9f0s
        0x9c6s
        0x9d4s
        0x9fcs
        0x9eds
        0x9f1s
        0x9f6s
        0x9fds
        0x6c37s
        0x69acs
        -0x7c46s
        0x6b17s
        0x5085s
        0x6067s
        0x982s
        0x99fs
        0x99bs
        0x993s
        0x989s
        0x999s
        0x984s
        0x989s
        0x984s
        0x993s
        0x982s
        0x984s
        0x98fs
        0x989s
        0x982s
        0x993s
        0x98es
        0x982s
        0x989s
        0x980s
        0x99fs
        0x993s
        0x981s
        0x989s
        0x990s
        0x99fs
        0x993s
        0x99as
        0x992s
        0x6037s
        0x65acs
        0x6224s
        -0x6ddas
        0x6255s
        0x60fes
        0x5c85s
        0x6c67s
        0x20cs
        0x20fs
        0x21ds
        0x20bs
        0x211s
        0x202s
        0x207s
        0x21ds
        0x21as
        0x211s
        0x208s
        0x21cs
        0x20fs
        0x209s
        0x203s
        0x20bs
        0x200s
        0x21as
        0x211s
        0x21es
        0x20fs
        0x200s
        0x20bs
        0x202s
        0x211s
        0x218s
        0x207s
        0x20bs
        0x219s
        0x211s
        0x21es
        0x20fs
        0x209s
        0x20bs
        0x21cs
        0x211s
        0x208s
        0x207s
        0x20bs
        0x202s
        0x20as
        0x6ffcs
        0x6a67s
        0x84fs
        0x87cs
        0x86bs
        0x86ds
        0x870s
        0x87as
        0x878s
        0x875s
        0x84fs
        0x870s
        0x87cs
        0x86es
        0x849s
        0x878s
        0x87es
        0x87cs
        0x86bs
        0x534es
        0x63acs
        0x5efs
        0x5f2s
        0x5f6s
        0x5fes
        0x5e4s
        0x5f4s
        0x5e9s
        0x5e4s
        0x5e9s
        0x5fes
        0x5efs
        0x5e9s
        0x5e2s
        0x5e4s
        0x5f8s
        0x5d4s
        0x5d6s
        0x5d6s
        0x5f8s
        0x5d4s
        0x5d6s
        0x5d6s
        0x5des
        0x5d5s
        0x5cfs
        0x6fb2s
        0x6a29s
        -0x7c6ds
        -0x7c13s
        0x5300s
        0x63e2s
        0x5d0s
        0x5f5s
        0x5eas
        0x5f9s
        0x5ces
        0x5f3s
        0x5f3s
        0x5f1s
        0x5dds
        0x5e9s
        0x5f8s
        0x5f5s
        0x5f9s
        0x5f2s
        0x5ffs
        0x5f9s
        0x5cbs
        0x5f5s
        0x5f8s
        0x5fbs
        0x5f9s
        0x5e8s
        0x5c3s
        0x5c9s
        0x5ecs
        0x5f8s
        0x5fds
        0x5e8s
        0x5f9s
        0x5c8s
        0x5f9s
        0x5e4s
        0x5e8s
        0x5c3s
        0x5d1s
        0x5f9s
        0x5e8s
        0x5f4s
        0x5f3s
        0x5f8s
        0x6637s
        0x63acs
        0x7726s
        0x657fs
        -0x6bdas
        0x4f68s
        0x64a2s
        0x6726s
        0x6462s
        0x646bs
        0x6d07s
        0x641s
        0x64ds
        0x64fs
        0x64fs
        0x647s
        0x64cs
        0x656s
        0x65ds
        0x64bs
        0x64cs
        0x656s
        0x647s
        0x650s
        0x643s
        0x641s
        0x656s
        0x64bs
        0x64ds
        0x64cs
        0x65ds
        0x646s
        0x647s
        0x64es
        0x647s
        0x645s
        0x643s
        0x656s
        0x647s
        0x64c5s
        0x615es
        -0x771cs
        -0x7766s
        0x4d84s
        0x4db2s
        0x4dc3s
        0x7726s
        0x7f5bs
        0x237s
        0x22cs
        0x236s
        0x220s
        0x22bs
        0x23cs
        0x22fs
        0x22as
        0x230s
        0x237s
        0x226s
        0x22ds
        0x226s
        0x231s
        0x23cs
        0x220s
        0x22fs
        0x222s
        0x230s
        0x230s
        0x6ca7s
        0x693cs
        -0x7d5cs
        0x6f3as
        0x7d93s
        0x5f6es
        0x5d2as
        0x7739s
        0x5f0s
        0x5f3s
        0x5f3s
        0x5f2s
        0x5e9s
        0x5f4s
        0x5f3s
        0x5fas
        0x5fas
        0x5f9s
        0x5e1s
        0x5e9s
        0x5f2s
        0x5f3s
        0x5e5s
        0x5f5s
        0x5e9s
        0x5e2s
        0x5ffs
        0x5fbs
        0x5f3s
        0x6c5es
        0x69c5s
        0x586as
        0x55b8s
        0x6e4ds
        -0x61b1s
        0x59a0s
        0x5541s
        0x6e02s
        0x676es
        0x8d2s
        0x8d1s
        0x8d1s
        0x8d0s
        0x8cbs
        0x8d6s
        0x8d1s
        0x8d8s
        0x8d8s
        0x8dbs
        0x8c3s
        0x8cbs
        0x8d0s
        0x8d1s
        0x8c7s
        0x8d7s
        0x8cbs
        0x8c0s
        0x8dds
        0x8d9s
        0x8d1s
        0x8cbs
        0x8c2s
        0x8dds
        0x8c7s
        0x8dds
        0x8d6s
        0x8dds
        0x8d8s
        0x8dds
        0x8c0s
        0x8cds
        0x6160s
        0x64fbs
        0x5554s
        0x5886s
        0x6373s
        -0x6c8fs
        0x60bbs
        0x7fbfs
        0x633cs
        0x6a50s
        0x31fs
        0x31bs
        0x309s
        0x311s
        0x313s
        0x302s
        0x309s
        0x312s
        0x317s
        0x302s
        0x317s
        0x309s
        0x31bs
        0x313s
        0x302s
        0x31es
        0x319s
        0x312s
        0x63d8s
        0x6643s
        0x47as
        0x458s
        0x449s
        0x479s
        0x45cs
        0x449s
        0x45cs
        0x9f0s
        0x9d5s
        0x9d0s
        0x9c1s
        0x9c5s
        0x9d4s
        0x9c3s
        0x985s
        0x9ees
        0x9f8s
        0x9fcs
        0x9ees
        0x9e4s
        0x9e2s
        0x9f4s
        0x9e3s
        0x9ees
        0x9f7s
        0x9f8s
        0x9f4s
        0x9fds
        0x9f5s
        0x6083s
        0x6518s
        0x727s
        0x702s
        0x707s
        0x716s
        0x712s
        0x703s
        0x714s
        0x752s
        0x724es
        0x6551s
        0x5c31s
        0x6cd3s
        0x9a6s
        0x9a9s
        0x9b3s
        0x9aes
        0x9b8s
        0x9a8s
        0x9b1s
        0x9a2s
        0x9b5s
        0x9a1s
        0x9abs
        0x9a8s
        0x9b0s
        0x6e1fs
        0x6b84s
        -0x6038s
        0x6758s
        0x5800s
        0x6bbas
        -0x6106s
        0x7581s
        0x99bs
        0x994s
        0x98es
        0x993s
        0x985s
        0x995s
        0x98cs
        0x99fs
        0x988s
        0x99cs
        0x996s
        0x995s
        0x98ds
        0x985s
        0x997s
        0x99fs
        0x98es
        0x992s
        0x995s
        0x98es
        0x6b7es
        0x6ee5s
        -0x6557s
        0x6239s
        0x5d61s
        0x6edbs
        -0x6465s
        0x6922s
        0x604es
        0xb00s
        0xb09s
        0xb14s
        0xb05s
        0xb03s
        0xb19s
        0xb05s
        0xb0as
        0xb07s
        0xb15s
        0xb15s
        0xb0fs
        0xb05s
        0x6effs
        0x6b64s
        0x95cs
        0x955s
        0x948s
        0x959s
        0x95fs
        0x945s
        0x959s
        0x956s
        0x95bs
        0x949s
        0x949s
        0x953s
        0x959s
        0x230s
        0x22fs
        0x222s
        0x223s
        0x229s
        0x239s
        0x236s
        0x22as
        0x227s
        0x23fs
        0x239s
        0x227s
        0x222s
        0x222s
        0x234s
        0x239s
        0x220s
        0x22fs
        0x223s
        0x22as
        0x222s
        0x2bds
        0x2a2s
        0x2afs
        0x2aes
        0x2a4s
        0x2b4s
        0x2bbs
        0x2a7s
        0x2aas
        0x2b2s
        0x2b4s
        0x2aas
        0x2afs
        0x2afs
        0x2b9s
        0x2b4s
        0x2d9s
        0x2dds
        0x2des
        0x2b4s
        0x2ads
        0x2a2s
        0x2aes
        0x2a7s
        0x2afs
        0xabas
        0xaa5s
        0xaa8s
        0xaa9s
        0xaa3s
        0xab3s
        0xabcs
        0xaa0s
        0xaads
        0xab5s
        0xab3s
        0xaads
        0xaa8s
        0xaa8s
        0xabes
        0xab3s
        0xaa4s
        0xades
        0xadas
        0xad8s
        0xab3s
        0xaaas
        0xaa5s
        0xaa9s
        0xaa0s
        0xaa8s
        0x11ds
        0x102s
        0x10fs
        0x10es
        0x104s
        0x114s
        0x11bs
        0x107s
        0x10as
        0x112s
        0x114s
        0x10as
        0x10fs
        0x10fs
        0x119s
        0x114s
        0x109s
        0x112s
        0x11fs
        0x10es
        0x11ds
        0x108s
        0x17as
        0x114s
        0x10ds
        0x102s
        0x10es
        0x107s
        0x10fs
        0x3519s
        0x542s
        0x56cs
        0x57fs
        0x560s
        0x567s
        0x3518s
        0x529s
        -0x6af5s
        -0x6bbcs
        -0x7532s
        0x7f02s
        0x4b24s
        0x56d8s
        0x7016s
        0x5a0bs
        0x5b31s
        0x533s
        0x529s
        0x858s
        0x843s
        0x84as
        0x859s
        0x84es
        0x6a7s
        0x6bcs
        0x6b5s
        0x6a6s
        0x6b1s
        0x6a4s
        0x6b5s
        0x6bas
        0x6b1s
        0x6b8s
        0x5bes
        0x5a5s
        0x5acs
        0x5bfs
        0x5a8s
        0x5b2s
        0x5a9s
        0x5a4s
        0x5acs
        0x5a1s
        0x5a2s
        0x5aas
        0x263s
        0xa4bs
        0xa47s
        0xa45s
        0xa06s
        0xa4as
        0xa51s
        0xa5cs
        0xa4ds
        0xa4cs
        0xa49s
        0xa46s
        0xa4bs
        0xa4ds
        0x331s
        0x33ds
        0x33fs
        0x37cs
        0x321s
        0x321s
        0x37cs
        0x333s
        0x33cs
        0x336s
        0x320s
        0x33ds
        0x33bs
        0x336s
        0x37cs
        0x327s
        0x335s
        0x331s
        0x37cs
        0x333s
        0x325s
        0x337s
        0x33fs
        0x337s
        0x279s
        0x951s
        0x95ds
        0x95fs
        0x91cs
        0x950s
        0x94bs
        0x946s
        0x957s
        0x956s
        0x953s
        0x95cs
        0x951s
        0x957s
        0x1a0s
        0x1acs
        0x1aes
        0x1eds
        0x1b0s
        0x1b0s
        0x1eds
        0x1a2s
        0x1ads
        0x1a7s
        0x1b1s
        0x1acs
        0x1aas
        0x1a7s
        0x1eds
        0x1b6s
        0x1a4s
        0x1a0s
        0x1eds
        0x1a2s
        0x1b4s
        0x1a6s
        0x1aes
        0x1a6s
        0xb87s
        0xb8bs
        0xb89s
        0xbcas
        0xb97s
        0xb97s
        0xbcas
        0xb85s
        0xb8as
        0xb80s
        0xb96s
        0xb8bs
        0xb8ds
        0xb80s
        0xbcas
        0xb91s
        0xb83s
        0xb87s
        0xbcas
        0xb85s
        0xb93s
        0xb81s
        0xb89s
        0xb81s
        0xbcas
        0xc27s
        0xc51s
        0x6c6s
        0x6cas
        0x6c8s
        0x68bs
        0x6c7s
        0x6dcs
        0x6d1s
        0x6c0s
        0x6c1s
        0x6c4s
        0x6cbs
        0x6c6s
        0x6c0s
        0x68bs
        0x6c4s
        0x6cbs
        0x6c1s
        0x6d7s
        0x6cas
        0x6ccs
        0x6c1s
        0x68bs
        0x782s
        0x78ds
        0x782s
        0x37bds
        0x7e6s
        0x7c8s
        0x7dbs
        0x7c4s
        0x7c3s
        0x37bcs
        0x78ds
        0x6159s
        0x621ds
        -0x778as
        0x590bs
        0x5e9cs
        -0x7578s
        0x797s
        0x78ds
        0x633ds
        0x5f76s
        -0x67a4s
        -0x66eds
        0x5586s
        0x5278s
        -0x71a8s
        -0x763cs
        0x9a6s
        0x9b6s
        0x9b9s
        0x9b6s
        0x55a0s
        0x5d61s
        0x4a4bs
        0x448s
        0x448s
        0x448s
        0x3626s
        0x67ds
        0x653s
        0x640s
        0x65fs
        0x658s
        0x3627s
        0x616s
        0x6008s
        0x7f0cs
        -0x7613s
        0x5890s
        0x5dcfs
        -0x7215s
        0x6e70s
        0x5f07s
        -0x74eds
        0x60cs
        0x616s
        0x598s
        0x5a3s
        0x5aas
        0x5b9s
        0x5aes
        0x58fs
        0x5a2s
        0x5aas
        0x5a7s
        0x5a4s
        0x5acs
        0x5ebs
        0x5a5s
        0x5a4s
        0x5bfs
        0x5a2s
        0x5ads
        0x5b2s
        0x58as
        0x5a8s
        0x5bfs
        0x5a2s
        0x5a4s
        0x5a5s
        0x5ebs
        0x5720s
        0x5966s
        0x5415s
        0x76b8s
        0x467cs
        0x507s
        0x518s
        0x50ds
        0x51as
        0x509s
        0x51cs
        0x501s
        0x507s
        0x506s
        0x524s
        0x501s
        0x51bs
        0x51cs
        0xa61s
        0xa7as
        0xa63s
        0xa63s
        0xa2fs
        0xa6cs
        0xa6es
        0xa61s
        0xa61s
        0xa60s
        0xa7bs
        0xa2fs
        0xa6ds
        0xa6as
        0xa2fs
        0xa6cs
        0xa6es
        0xa7cs
        0xa7bs
        0xa2fs
        0xa7bs
        0xa60s
        0xa2fs
        0xa61s
        0xa60s
        0xa61s
        0xa22s
        0xa61s
        0xa7as
        0xa63s
        0xa63s
        0xa2fs
        0xa7bs
        0xa76s
        0xa7fs
        0xa6as
        0xa2fs
        0xa64s
        0xa60s
        0xa7bs
        0xa63s
        0xa66s
        0xa61s
        0xa21s
        0xa6cs
        0xa60s
        0xa63s
        0xa63s
        0xa6as
        0xa6cs
        0xa7bs
        0xa66s
        0xa60s
        0xa61s
        0xa7cs
        0xa21s
        0xa42s
        0xa7as
        0xa7bs
        0xa6es
        0xa6ds
        0xa63s
        0xa6as
        0xa43s
        0xa66s
        0xa7cs
        0xa7bs
        0xa33s
        0xa6cs
        0xa60s
        0xa62s
        0xa21s
        0xa64s
        0xa78s
        0xa6es
        0xa66s
        0xa21s
        0xa7cs
        0xa67s
        0xa6es
        0xa7ds
        0xa6as
        0xa63s
        0xa66s
        0xa6ds
        0xa21s
        0xa40s
        0xa7fs
        0xa6as
        0xa7ds
        0xa6es
        0xa7bs
        0xa66s
        0xa60s
        0xa61s
        0xa31s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "LhYbA5UcOilFBYkETqi2dJyM"

    invoke-static {v0}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۤۡۧۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

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

.method static bridge synthetic _$$Nest$sfgetTASK_NAMES()Ljava/util/Map;
    .locals 1

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->ۡۨ()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method static bridge synthetic _$$Nest$sfgetcurrentTask()Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 1

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟۟ۡۤۦ()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    return-object v0
.end method

.method static bridge synthetic _$$Nest$sfgettaskCounter()I
    .locals 1

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟ۧۦۤۤ()I

    move-result v0

    return v0
.end method

.method static bridge synthetic _$$Nest$sfgettotalTasks()Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 1

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->ۦۣ۟ۤ()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    return-object v0
.end method

.method static bridge synthetic _$$Nest$sfputtaskCounter(I)V
    .locals 0

    sput p0, Lkevin/fun/hook/DexKitFinder;->taskCounter:I

    return-void
.end method

.method static bridge synthetic _$$Nest$smfindClassByStrings(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;[Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-static {p0, p1, p2}, Lkevin/fun/hook/DexKitFinder;->ۥۧۢۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static bridge synthetic _$$Nest$smfindMethodNameByStrings(Lorg/luckypray/dexkit/DexKitBridge;[Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-static {p0, p1}, Lkevin/fun/hook/DexKitFinder;->۟ۦ۠ۢ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static bridge synthetic _$$Nest$smforceGC()V
    .locals 0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟ۤۤۥۡ()V

    return-void
.end method

.method static bridge synthetic _$$Nest$smisTargetPackage(Ljava/lang/String;)Z
    .locals 1

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder;->ۥۡۦ۟(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method static bridge synthetic _$$Nest$smtriggerGC()V
    .locals 3

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->ۡۧ۟۟()V

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۡ۟ۦ()I

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
    const-string v0, "xDKDZmjiU0"

    invoke-static {v0}, Landroidx/loader/ۣ۟۟ۧ۠;->۟ۧ۠ۡۥ(Ljava/lang/String;)Ljava/lang/String;

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

.method static bridge synthetic _$$Nest$smupdateProgress(IILjava/lang/String;)V
    .locals 2

    invoke-static {p0, p1, p2}, Lkevin/fun/hook/DexKitFinder;->۟ۤۨۧۧ(IILjava/lang/Object;)V

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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "2xz"

    invoke-static {v0}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۢ۟ۡ۠(Ljava/lang/String;)Ljava/lang/String;

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

.method static synthetic access$0(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;[Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-static {p0, p1, p2}, Lkevin/fun/hook/DexKitFinder;->ۥۧۢۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$1(Lorg/luckypray/dexkit/DexKitBridge;[Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-static {p0, p1}, Lkevin/fun/hook/DexKitFinder;->۟ۦ۠ۢ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$2(Ljava/lang/String;)Z
    .locals 1

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder;->ۥۡۦ۟(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static clearDexKitCache()V
    .locals 4

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->ۡۨ()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Landroidx/activity/ۣۦۡۥ;->۟ۥۥۣۡ(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/۟ۥ۠۠;->ۣ۟۟ۤ۟(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v1

    :sswitch_0
    invoke-static {v1}, Landroidx/activity/ۣۦۡۥ;->ۣ۟ۧۧۡ(Ljava/lang/Object;)Z

    move-result v2

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_1
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_2
    if-nez v2, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_3
    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟ۢۡۧۥ()[S

    move-result-object v0

    const/16 v1, 0x985

    sget v2, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    xor-int/lit8 v2, v2, 0x67

    const/16 v3, 0x266

    invoke-static {v0, v1, v2, v3}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۦۥۢ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/activity/ۣۦۡۥ;->۟ۥۨۨ۟(Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟ۢۡۧۥ()[S

    move-result-object v0

    const/16 v1, 0x99a

    sget v2, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    xor-int/lit16 v2, v2, -0x112

    const/16 v3, 0x2eb

    invoke-static {v0, v1, v2, v3}, Landroidx/activity/ۤۧۧۧ;->ۣ۟۟۠ۡ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/activity/ۣۦۡۥ;->۟ۥۨۨ۟(Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟ۢۡۧۥ()[S

    move-result-object v0

    const/16 v1, 0x9b3

    sget v2, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦۦۤ۟:I

    xor-int/lit16 v2, v2, 0x96

    const/16 v3, 0xaec

    invoke-static {v0, v1, v2, v3}, Landroidx/loader/ۣۦ۟ۡ;->ۣ۟ۤ۟ۦ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/activity/ۣۦۡۥ;->۟ۥۨۨ۟(Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟ۢۡۧۥ()[S

    move-result-object v0

    const/16 v1, 0x9cd

    sget v2, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣۡۢ۟:I

    xor-int/lit16 v2, v2, 0x33f

    const/16 v3, 0x14b

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢ۟ۥۨ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/activity/ۣۦۡۥ;->۟ۥۨۨ۟(Ljava/lang/Object;)V

    invoke-static {}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->۟۟ۡۡۦ()I

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
    const-string v0, "CsJ8vO5n3o1TAKV92m"

    invoke-static {v0}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->۟ۤۦۡۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_7
    return-void

    :sswitch_8
    invoke-static {v1}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۦۥۦۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Landroidx/activity/ۣۦۡۥ;->۟ۥۨۨ۟(Ljava/lang/Object;)V

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
        0xb97b -> :sswitch_0
    .end sparse-switch
.end method

.method private static dismissProgressDialog()V
    .locals 5

    const/4 v1, 0x0

    const-string v4, "\u06e2\u06e3\u06e6"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    :goto_0
    invoke-static {v4}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    new-instance v1, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda7;

    invoke-direct {v1}, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda7;-><init>()V

    const-string v4, "\u06e0\u06e7"

    move-object v2, v1

    goto :goto_0

    :sswitch_0
    invoke-static {v0, v2}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    const-string v1, "\u06e8\u06e0"

    move-object v4, v1

    goto :goto_0

    :sswitch_1
    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۧۤۡۨ()Landroid/os/Looper;

    move-result-object v1

    const-string v4, "\u06e1\u06df\u06e2"

    move-object v3, v1

    goto :goto_0

    :sswitch_2
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    const-string v1, "\u06e1\u06e5\u06e0"

    move-object v4, v1

    goto :goto_0

    :sswitch_3
    const/4 v1, 0x0

    sput-boolean v1, Lkevin/fun/hook/DexKitFinder;->dialogShowing:Z

    const-string v1, "\u06e0\u06e2\u06e5"

    move-object v4, v1

    goto :goto_0

    :sswitch_4
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc07 -> :sswitch_0
        0xdcf8 -> :sswitch_4
        0x1aab23 -> :sswitch_1
        0x1aae84 -> :sswitch_2
        0x1ab2c5 -> :sswitch_3
    .end sparse-switch
.end method

.method private static dp(Landroid/content/Context;I)I
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
    if-nez p0, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget v0, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣ۠ۧ:I

    xor-int/lit16 v0, v0, -0x1e9

    mul-int/2addr v0, p1

    :goto_1
    return v0

    :sswitch_3
    invoke-static {p0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۨ۟ۨ(Ljava/lang/Object;)Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {v0}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟۟ۤۦۤ(Ljava/lang/Object;)Landroid/util/DisplayMetrics;

    move-result-object v0

    invoke-static {v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۦۡۧ(Ljava/lang/Object;)F

    move-result v0

    int-to-float v1, p1

    mul-float/2addr v0, v1

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method public static findAll(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Landroid/content/Context;)V
    .locals 10

    const/4 v0, 0x0

    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۧۤۡۨ()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v2, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->ۡۨ()Ljava/util/Map;

    move-result-object v1

    invoke-static {v1}, Landroidx/activity/ۨ۠۟ۧ;->ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v4

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->ۦۣ۟ۤ()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-static {v1, v4}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۥۤۥۢ(Ljava/lang/Object;I)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟۟ۡۤۦ()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۥۤۥۢ(Ljava/lang/Object;I)V

    sput v0, Lkevin/fun/hook/DexKitFinder;->taskCounter:I

    new-instance v1, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda5;

    invoke-direct {v1, p2, v4}, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda5;-><init>(Landroid/content/Context;I)V

    invoke-static {v2, v1}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    :try_start_0
    new-instance v1, Lkevin/fun/hook/DexKitFinder$SafeFinder;

    invoke-direct {v1, v3, p2, p0, p1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;-><init>(Ljava/lang/StringBuilder;Landroid/content/Context;Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;)V

    invoke-static {v1}, Lkevin/fun/hook/DexKitFinder;->ۥۧ۟ۢ(Ljava/lang/Object;)V

    invoke-static {v1}, Lkevin/fun/hook/DexKitFinder;->ۢ۠ۨۥ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :sswitch_0
    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟ۤۤۥۡ()V

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_1
    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->ۡۨ()Ljava/util/Map;

    move-result-object v1

    invoke-static {v1}, Landroidx/activity/ۣۦۡۥ;->۟ۥۥۣۡ(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/۟ۥ۠۠;->ۣ۟۟ۤ۟(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v5

    move v1, v0

    :goto_1
    :sswitch_2
    invoke-static {v5}, Landroidx/activity/ۣۦۡۥ;->ۣ۟ۧۧۡ(Ljava/lang/Object;)Z

    move-result v6

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_1

    goto :goto_2

    :sswitch_3
    if-nez v6, :cond_0

    const v0, 0xbe60

    goto :goto_2

    :sswitch_4
    const/16 v1, 0x66f

    goto :goto_0

    :catchall_0
    move-exception v1

    :try_start_1
    invoke-static {v1}, Landroidx/loader/ۥۧۨۤ;->ۦۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟ۢۡۧۥ()[S

    move-result-object v6

    const/16 v7, 0x9ea

    sget v8, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۤۦۤۧ:I

    xor-int/lit16 v8, v8, 0x14c

    const/16 v9, 0x509

    invoke-static {v6, v7, v8, v9}, Landroidx/core/ktx/۟۟ۡۢ۠;->۟ۢۦۧ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {v5, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/DexKitFinder;->۟۠ۢ۟ۦ(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/16 v1, 0x6cc

    :goto_3
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_2

    goto :goto_3

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_3

    :cond_0
    :sswitch_6
    const v0, 0xbe41

    goto :goto_2

    :sswitch_7
    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->ۣ۠ۤ()V

    new-instance v0, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda6;

    invoke-direct {v0, p2, v3, v4, v1}, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda6;-><init>(Landroid/content/Context;Ljava/lang/StringBuilder;II)V

    invoke-static {v2, v0}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-static {}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۦۣۡۡ()I

    move-result v1

    const v0, 0xbe7f

    :goto_4
    const v2, 0xbe90

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_3

    goto :goto_4

    :cond_1
    :sswitch_8
    const v0, 0xbebd

    goto :goto_4

    :sswitch_9
    if-ltz v1, :cond_1

    const v0, 0xbedc

    goto :goto_4

    :sswitch_a
    const-string v0, "Qr1y8aURPNsgSOouR3jUWcforseJ"

    invoke-static {v0}, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۧۢۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_b
    return-void

    :sswitch_c
    invoke-static {v5}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۦۥۦۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/4 v6, 0x0

    invoke-static {v0, v6}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۦۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const v0, 0xbefb

    :goto_5
    const v7, 0xbf0c

    xor-int/2addr v0, v7

    sparse-switch v0, :sswitch_data_4

    goto :goto_5

    :cond_2
    :sswitch_d
    const v0, 0xbf39

    goto :goto_5

    :sswitch_e
    if-eqz v6, :cond_2

    const v0, 0xc1e3

    goto :goto_5

    :sswitch_f
    invoke-static {v6}, Landroidx/activity/ۨ۠۟ۧ;->۟ۧ۟ۡ۠(Ljava/lang/Object;)Z

    move-result v6

    const v0, 0xc202

    :goto_6
    const v7, 0xc213

    xor-int/2addr v0, v7

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :sswitch_10
    if-nez v6, :cond_3

    const v0, 0xc25f

    goto :goto_6

    :cond_3
    :sswitch_11
    const v0, 0xc240

    goto :goto_6

    :sswitch_12
    sget v0, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    xor-int/lit16 v0, v0, 0x2ff

    add-int/2addr v0, v1

    const v1, 0xc27e

    :goto_7
    const v6, 0xc28f

    xor-int/2addr v1, v6

    sparse-switch v1, :sswitch_data_6

    goto :goto_7

    :sswitch_13
    move v1, v0

    goto/16 :goto_1

    :sswitch_14
    const v1, 0xc29d

    goto :goto_7

    :catchall_1
    move-exception v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟ۤۤۥۡ()V

    throw v0

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_1
        0x31 -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0xb918 -> :sswitch_c
        0xb939 -> :sswitch_7
        0xb97b -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_0
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
        0x16 -> :sswitch_d
        0x35 -> :sswitch_2
        0x1f7 -> :sswitch_e
        0x7eef -> :sswitch_f
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_10
        0x32 -> :sswitch_11
        0x4c -> :sswitch_12
        0x53 -> :sswitch_2
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_13
        0xf1 -> :sswitch_14
    .end sparse-switch
.end method

.method public static findAllKS(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Landroid/content/Context;)V
    .locals 12

    const/4 v11, 0x0

    const/4 v0, 0x0

    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۧۤۡۨ()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v2, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget v1, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    xor-int/lit8 v4, v1, -0x78

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->ۦۣ۟ۤ()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-static {v1, v4}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۥۤۥۢ(Ljava/lang/Object;I)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟۟ۡۤۦ()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۥۤۥۢ(Ljava/lang/Object;I)V

    sput v0, Lkevin/fun/hook/DexKitFinder;->taskCounter:I

    new-instance v1, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda11;

    invoke-direct {v1, p2, v4}, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda11;-><init>(Landroid/content/Context;I)V

    invoke-static {v2, v1}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v1, Lkevin/fun/hook/DexKitFinder$SafeFinder;

    invoke-direct {v1, v3, p2, p0, p1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;-><init>(Ljava/lang/StringBuilder;Landroid/content/Context;Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;)V

    new-instance v5, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda12;

    invoke-direct {v5, p0, p1}, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda12;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟ۢۡۧۥ()[S

    move-result-object v6

    const/16 v7, 0x9fd

    sget v8, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۨ۠ۨ:I

    xor-int/lit16 v8, v8, 0x35e

    const/16 v9, 0x80b

    invoke-static {v6, v7, v8, v9}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۦ۠ۧۨ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v1, v6, v5}, Lkevin/fun/hook/DexKitFinder;->ۨۦ۠ۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda13;

    invoke-direct {v5, p0}, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda13;-><init>(Lorg/luckypray/dexkit/DexKitBridge;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟ۢۡۧۥ()[S

    move-result-object v7

    const/16 v8, 0xa02

    sget v9, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۢ۟ۡ:I

    xor-int/lit16 v9, v9, -0x266

    const/16 v10, 0x6f4

    invoke-static {v7, v8, v9, v10}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢ۟ۥۨ([SIII)Ljava/lang/String;

    move-result-object v7

    invoke-static {v1, v7, v5}, Lkevin/fun/hook/DexKitFinder;->ۨۦ۠ۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v6, v11}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۦۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

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
    if-eqz v5, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    sget v0, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۢۥۨۦ:I

    xor-int/lit16 v0, v0, 0x292

    add-int/lit8 v0, v0, 0x0

    :sswitch_3
    invoke-static {v7, v11}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۦۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-eqz v5, :cond_1

    const/16 v1, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v1, 0x70a

    goto :goto_1

    :sswitch_6
    sget v1, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۡۨۨۧ:I

    xor-int/lit16 v1, v1, -0x1e7

    add-int/2addr v0, v1

    :sswitch_7
    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟ۤۤۥۡ()V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->ۣ۠ۤ()V

    new-instance v1, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda14;

    invoke-direct {v1, p2, v3, v4, v0}, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda14;-><init>(Landroid/content/Context;Ljava/lang/StringBuilder;II)V

    invoke-static {v2, v1}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

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

.method public static findAllXHS(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Landroid/content/Context;)V
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x1

    new-instance v3, Landroid/os/Handler;

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۧۤۡۨ()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v3, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->ۦۣ۟ۤ()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v2

    invoke-static {v2, v1}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۥۤۥۢ(Ljava/lang/Object;I)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟۟ۡۤۦ()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v2

    invoke-static {v2, v0}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۥۤۥۢ(Ljava/lang/Object;I)V

    sput v0, Lkevin/fun/hook/DexKitFinder;->taskCounter:I

    new-instance v2, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda2;

    invoke-direct {v2, p2, v1}, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda2;-><init>(Landroid/content/Context;I)V

    invoke-static {v3, v2}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v2, Lkevin/fun/hook/DexKitFinder$SafeFinder;

    invoke-direct {v2, v4, p2, p0, p1}, Lkevin/fun/hook/DexKitFinder$SafeFinder;-><init>(Ljava/lang/StringBuilder;Landroid/content/Context;Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;)V

    new-instance v5, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda3;

    invoke-direct {v5, p0, p1}, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda3;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟ۢۡۧۥ()[S

    move-result-object v6

    const/16 v7, 0xa0c

    sget v8, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۣۧۢ:I

    xor-int/lit16 v8, v8, -0x3cb

    const/16 v9, 0x5ed

    invoke-static {v6, v7, v8, v9}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۦۤۢۦ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6, v5}, Lkevin/fun/hook/DexKitFinder;->ۨۦ۠ۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x0

    invoke-static {v6, v2}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۦۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v5, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    move v0, v1

    :sswitch_3
    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟ۤۤۥۡ()V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->ۣ۠ۤ()V

    new-instance v2, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda4;

    invoke-direct {v2, p2, v4, v1, v0}, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda4;-><init>(Landroid/content/Context;Ljava/lang/StringBuilder;II)V

    invoke-static {v3, v2}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method private static varargs findClassByStrings(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;[Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->ۦۥۦۤ()Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟ۢۡۧۥ()[S

    move-result-object v1

    const/16 v2, 0xa18

    const/4 v3, 0x1

    const/16 v4, 0x23b

    invoke-static {v1, v2, v3, v4}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۥۡۤۧ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟ۢۡۧۥ()[S

    move-result-object v2

    const/16 v3, 0xa19

    sget v4, Landroidx/customview/ۡۤۡۤ;->۟ۦ۟ۨۨ:I

    xor-int/lit16 v4, v4, 0xfe

    const/16 v5, 0xa28

    invoke-static {v2, v3, v4, v5}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۨۤ۠۠([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟ۢۡۧۥ()[S

    move-result-object v3

    const/16 v4, 0xa26

    sget v5, Landroidx/activity/ۤۧۧۧ;->۟۟ۢ۠ۡ:I

    xor-int/lit16 v5, v5, 0x1f2

    const/16 v6, 0x352

    invoke-static {v3, v4, v5, v6}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۢۦۣ۠([SIII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/String;

    sget v5, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    xor-int/lit16 v5, v5, 0x2fe

    aput-object v3, v4, v5

    sget v3, Lorg/luckypray/dexkit/۠۠ۥ;->ۣ۟ۡۢۡ:I

    xor-int/lit16 v3, v3, -0xe4

    aput-object v1, v4, v3

    sget v1, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    xor-int/lit8 v1, v1, -0x78

    aput-object v2, v4, v1

    invoke-static {v4}, Landroidx/startup/ۤۧۥۣ;->ۡ۠(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lkevin/fun/hook/DexKitFinder;->۟ۡۥۦۣ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->ۦۨ۟ۢ()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v1

    invoke-static {v1, p2}, Lkevin/fun/hook/DexKitFinder;->ۥۨۦۣ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v1

    invoke-static {v0, v1}, Lkevin/fun/hook/DexKitFinder;->ۨۨۡۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v0

    invoke-static {p0, v0}, Lkevin/fun/hook/DexKitFinder;->ۣۨۥ۟(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder;->ۣ۟ۡۢۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;

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
    if-eqz v0, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder;->۟ۦۦ۠ۧ(Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassData;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder;->۟ۦۣۢ(Ljava/lang/Object;)Ljava/lang/String;

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
    const/4 v0, 0x0

    :sswitch_5
    return-object v0

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

.method private static varargs findMethodNameByStrings(Lorg/luckypray/dexkit/DexKitBridge;[Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->ۦۥۦۤ()Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟ۢۡۧۥ()[S

    move-result-object v1

    const/16 v2, 0xa3e

    const/4 v3, 0x1

    const/16 v4, 0x221

    invoke-static {v1, v2, v3, v4}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣۣ۟ۤۤ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟ۢۡۧۥ()[S

    move-result-object v2

    const/16 v3, 0xa3f

    sget v4, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    xor-int/lit16 v4, v4, -0x168

    const/16 v5, 0x932

    invoke-static {v2, v3, v4, v5}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۢ۠ۥۨ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟ۢۡۧۥ()[S

    move-result-object v3

    const/16 v4, 0xa4c

    sget v5, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/lit16 v5, v5, 0x307

    const/16 v6, 0x1c3

    invoke-static {v3, v4, v5, v6}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۤ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/String;

    sget v5, Lkevin/fun/hook/۟ۥ۠۠;->ۢۦۧۧ:I

    xor-int/lit16 v5, v5, -0x1c5

    aput-object v3, v4, v5

    sget v3, Landroidx/appcompat/ۣۧۤۢ;->۟۠ۡۤۤ:I

    xor-int/lit16 v3, v3, -0xee

    aput-object v1, v4, v3

    sget v1, Landroidx/activity/ۤۧۧۧ;->۟۟ۢ۠ۡ:I

    xor-int/lit16 v1, v1, 0x1e8

    aput-object v2, v4, v1

    invoke-static {v4}, Landroidx/startup/ۤۧۥۣ;->ۡ۠(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lkevin/fun/hook/DexKitFinder;->۟ۡۥۦۣ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->ۦۨ۟ۢ()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v1

    invoke-static {v1, p1}, Lkevin/fun/hook/DexKitFinder;->ۥۨۦۣ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v1

    invoke-static {v0, v1}, Lkevin/fun/hook/DexKitFinder;->ۨۨۡۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v0

    invoke-static {p0, v0}, Lkevin/fun/hook/DexKitFinder;->ۣۨۥ۟(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder;->ۣ۟ۡۢۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;

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
    if-eqz v0, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder;->ۣ۠۟ۥ(Ljava/lang/Object;)Ljava/lang/String;

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
    const/4 v0, 0x0

    :sswitch_5
    return-object v0

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

.method private static forceGC()V
    .locals 4

    :try_start_0
    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۟ۥۥۡۨ()V

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۢۨۦۥ()V

    const-wide/16 v0, 0x369

    sget v2, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۨ۠ۨ:I

    int-to-long v2, v2

    xor-long/2addr v0, v2

    invoke-static {v0, v1}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۡۡۥۨ(J)V
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

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
    .end sparse-switch
.end method

.method private static isTargetPackage(Ljava/lang/String;)Z
    .locals 5

    const/4 v0, 0x0

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
    if-nez p0, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟ۢۡۧۥ()[S

    move-result-object v1

    const/16 v2, 0xa64

    sget v3, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    xor-int/lit8 v3, v3, -0x2d

    const/16 v4, 0xbe4

    invoke-static {v1, v2, v3, v4}, Lkevin/fun/hook/۟ۥ۠۠;->ۣۨۢ۟([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1}, Landroidx/core/ۧ۟ۤۨ;->ۨۨ۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v2, :cond_1

    const/16 v1, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v1, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟ۢۡۧۥ()[S

    move-result-object v1

    const/16 v2, 0xa7d

    sget v3, Landroidx/appcompat/ۣۧۤۢ;->۟۠ۡۤۤ:I

    xor-int/lit16 v3, v3, -0xef

    const/16 v4, 0xc7f

    invoke-static {v1, v2, v3, v4}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۧۨۦۦ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1}, Landroidx/core/ۧ۟ۤۨ;->ۨۨ۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-nez v2, :cond_2

    const v1, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v1, 0xbe41

    goto :goto_2

    :sswitch_8
    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟ۢۡۧۥ()[S

    move-result-object v1

    const/16 v2, 0xa7f

    sget v3, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v3, v3, 0x218

    const/16 v4, 0x6a5

    invoke-static {v1, v2, v3, v4}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۦۤۢۦ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1}, Landroidx/core/ۧ۟ۤۨ;->ۨۨ۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const v1, 0xbe7f

    :goto_3
    const v3, 0xbe90

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :cond_3
    :sswitch_9
    const v1, 0xbebd

    goto :goto_3

    :sswitch_a
    if-nez v2, :cond_3

    const v1, 0xbedc

    goto :goto_3

    :sswitch_b
    const/4 v0, 0x1

    :sswitch_c
    return v0

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_c
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_b
        0x1f4 -> :sswitch_5
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
        0x2d -> :sswitch_b
        0x4c -> :sswitch_c
        0xef -> :sswitch_a
    .end sparse-switch
.end method

.method static synthetic lambda$0(IILjava/lang/String;)V
    .locals 6

    :try_start_0
    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->ۦ۠ۥ۠()Landroid/widget/ProgressBar;

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
    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->ۦ۠ۥ۠()Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-static {v0, p0}, Landroidx/loader/ۣ۟۟ۧ۠;->ۤۥۨۨ(Ljava/lang/Object;I)V

    :sswitch_3
    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->ۢۧۡۢ()Landroid/widget/TextView;

    move-result-object v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-eqz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->ۢۧۡۢ()Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v1, p0}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟ۢۡۧۥ()[S

    move-result-object v2

    const/16 v3, 0xa95

    sget v4, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۤۥ:I

    xor-int/lit16 v4, v4, 0x3ba

    const/16 v5, 0x7a2

    invoke-static {v2, v3, v4, v5}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧ۠ۥ۟([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, p1}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_7
    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->ۣۣۨ۠()Landroid/widget/TextView;

    move-result-object v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_8
    if-eqz v1, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_9
    const v0, 0xbe41

    goto :goto_2

    :sswitch_a
    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->ۣۣۨ۠()Landroid/widget/TextView;

    move-result-object v0

    invoke-static {v0, p2}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const v0, 0xbe7f

    :goto_3
    const v1, 0xbe90

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :goto_4
    :sswitch_b
    return-void

    :sswitch_c
    const v0, 0xbe9e

    goto :goto_3

    :catchall_0
    move-exception v0

    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۦۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟ۢۡۧۥ()[S

    move-result-object v2

    const/16 v3, 0xa98

    sget v4, Landroidx/core/ۧ۟ۤۨ;->ۣۤ۠ۤ:I

    xor-int/lit16 v4, v4, 0x1af

    const/16 v5, 0x7ad

    invoke-static {v2, v3, v4, v5}, Landroidx/emoji2/ۢۧۡۧ;->۟ۥۢ۟ۢ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder;->۟۠ۢ۟ۦ(Ljava/lang/Object;)V

    goto :goto_4

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

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_8
        0xb918 -> :sswitch_b
        0xb939 -> :sswitch_a
        0xb97b -> :sswitch_9
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_b
        0xef -> :sswitch_c
    .end sparse-switch
.end method

.method static synthetic lambda$1(Landroid/content/Context;I)V
    .locals 10

    const/4 v9, 0x0

    const/4 v0, 0x1

    :try_start_0
    sput-boolean v0, Lkevin/fun/hook/DexKitFinder;->dialogShowing:Z

    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    sget v1, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۨۤۨۡ:I

    xor-int/lit16 v1, v1, -0x3b5

    invoke-static {v0, v1}, Landroidx/emoji2/ۢۧۡۧ;->ۡۤۥ(Ljava/lang/Object;I)V

    sget v1, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    xor-int/lit16 v1, v1, 0xdb

    invoke-static {p0, v1}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v2

    invoke-static {p0, v1}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v3

    invoke-static {p0, v1}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v4

    invoke-static {p0, v1}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v1

    invoke-static {v0, v2, v3, v4, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    sget v2, Lkevin/fun/hook/۟ۥ۠۠;->ۢۦۧۧ:I

    xor-int/lit16 v2, v2, -0x85

    invoke-static {p0, v2}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v2

    sget v3, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    xor-int/lit16 v3, v3, -0x168

    invoke-direct {v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v0, v1}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣۡۥۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    sget v2, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    xor-int/lit16 v2, v2, 0x16a

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    sget v4, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۧۨۨ:I

    xor-int/lit8 v4, v4, -0x73

    invoke-static {p0, v4}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v5

    int-to-float v5, v5

    invoke-static {v1, v5}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۥ۟ۢۧ(Ljava/lang/Object;F)V

    invoke-static {v0, v1}, Landroidx/activity/ۦۧۥۥ;->۟ۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Landroid/widget/LinearLayout;

    invoke-direct {v1, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v5, 0x0

    invoke-static {v1, v5}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    invoke-static {v1, v4}, Landroidx/emoji2/ۢۧۡۧ;->ۡۤۥ(Ljava/lang/Object;I)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v5, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v1, v5}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣۡۥۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static {p0, v4}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v4

    invoke-static {v1, v5, v6, v7, v4}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    new-instance v4, Landroid/widget/TextView;

    invoke-direct {v4, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟ۢۡۧۥ()[S

    move-result-object v5

    const/16 v6, 0xaa8

    sget v7, Landroidx/activity/ۨ۠۟ۧ;->۟ۦۥۢۢ:I

    xor-int/lit16 v7, v7, 0x331

    const/16 v8, 0x85e

    invoke-static {v5, v6, v7, v8}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۧ۟ۧۢ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v5, 0x41900000    # 18.0f

    invoke-static {v4, v5}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->۟ۡۡۧۦ()Landroid/graphics/Typeface;

    move-result-object v5

    invoke-static {v4, v5}, Landroidx/customview/ۡۤۡۤ;->ۧ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    const v5, -0xcccf6d

    sget v6, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    xor-int/2addr v5, v6

    invoke-static {v4, v5}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v6, 0x0

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-direct {v5, v6, v3, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-static {v4, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۢۥۨۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1, v4}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Landroid/widget/TextView;

    invoke-direct {v3, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟ۢۡۧۥ()[S

    move-result-object v4

    const/16 v5, 0xaac

    sget v6, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    xor-int/lit8 v6, v6, 0x56

    const/16 v7, 0x188

    invoke-static {v4, v5, v6, v7}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۧۨۦۦ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v4, 0x41400000    # 12.0f

    invoke-static {v3, v4}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v4, 0x6667db

    sget v5, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۨ۠ۧ:I

    xor-int/2addr v4, v5

    invoke-static {v3, v4}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    sget v4, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۥۦ:I

    xor-int/lit16 v4, v4, 0x26b

    invoke-static {p0, v4}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v5

    sget v6, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    xor-int/lit16 v6, v6, -0x325

    invoke-static {p0, v6}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v7

    invoke-static {p0, v4}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v4

    invoke-static {p0, v6}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v6

    invoke-static {v3, v5, v7, v4, v6}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const v5, 0xa0bed

    sget v6, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۤ۟ۧۤ:I

    xor-int/2addr v5, v6

    invoke-static {v4, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    sget v5, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۧۨۨ:I

    xor-int/lit8 v5, v5, -0x6e

    invoke-static {p0, v5}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v5

    int-to-float v5, v5

    invoke-static {v4, v5}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۥ۟ۢۧ(Ljava/lang/Object;F)V

    invoke-static {v3, v4}, Landroidx/core/ۧ۟ۤۨ;->ۣ۟ۢۧ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda0;

    invoke-direct {v4, p0}, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda0;-><init>(Landroid/content/Context;)V

    invoke-static {v3, v4}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۦۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1, v3}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v1}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Landroid/widget/ProgressBar;

    const/4 v3, 0x0

    const v4, 0x1010367

    sget v5, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/2addr v4, v5

    invoke-direct {v1, p0, v3, v4}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    sput-object v1, Lkevin/fun/hook/DexKitFinder;->progressBar:Landroid/widget/ProgressBar;

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->ۦ۠ۥ۠()Landroid/widget/ProgressBar;

    move-result-object v1

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    sget v4, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۧۨۨ:I

    xor-int/lit8 v4, v4, -0x67

    invoke-static {p0, v4}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v4

    invoke-direct {v3, v2, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v1, v3}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۦۤ۟ۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const v2, 0x1f1edb

    sget v3, Lkevin/fun/hook/۟ۥ۠۠;->ۢۦۧۧ:I

    xor-int/2addr v2, v3

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    sget v2, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    xor-int/lit16 v2, v2, 0x2fc

    invoke-static {p0, v2}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v3

    int-to-float v3, v3

    invoke-static {v1, v3}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۥ۟ۢۧ(Ljava/lang/Object;F)V

    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const v4, 0xa915

    sget v5, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۨ۠ۧ:I

    xor-int/2addr v4, v5

    invoke-static {v3, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    invoke-static {p0, v2}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v4

    int-to-float v4, v4

    invoke-static {v3, v4}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۥ۟ۢۧ(Ljava/lang/Object;F)V

    new-instance v4, Landroid/graphics/drawable/ClipDrawable;

    const v5, 0x800051

    sget v6, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    xor-int/2addr v5, v6

    const/4 v6, 0x1

    invoke-direct {v4, v3, v5, v6}, Landroid/graphics/drawable/ClipDrawable;-><init>(Landroid/graphics/drawable/Drawable;II)V

    new-instance v3, Landroid/graphics/drawable/LayerDrawable;

    new-array v2, v2, [Landroid/graphics/drawable/Drawable;

    const/4 v5, 0x0

    aput-object v1, v2, v5

    const/4 v1, 0x1

    aput-object v4, v2, v1

    invoke-direct {v3, v2}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    const/4 v1, 0x0

    const v2, -0x10201e8

    sget v4, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۤ۟ۧۤ:I

    xor-int/2addr v2, v4

    invoke-static {v3, v1, v2}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣۨ۠ۡ(Ljava/lang/Object;II)V

    const/4 v1, 0x1

    const v2, 0x1020312

    sget v4, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/2addr v2, v4

    invoke-static {v3, v1, v2}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣۨ۠ۡ(Ljava/lang/Object;II)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->ۦ۠ۥ۠()Landroid/widget/ProgressBar;

    move-result-object v1

    invoke-static {v1, v3}, Landroidx/activity/ۨ۠۟ۧ;->ۡۢۦۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->ۦ۠ۥ۠()Landroid/widget/ProgressBar;

    move-result-object v1

    invoke-static {v1, p1}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦۥۨ۟(Ljava/lang/Object;I)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->ۦ۠ۥ۠()Landroid/widget/ProgressBar;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Landroidx/loader/ۣ۟۟ۧ۠;->ۤۥۨۨ(Ljava/lang/Object;I)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->ۦ۠ۥ۠()Landroid/widget/ProgressBar;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    sput-object v1, Lkevin/fun/hook/DexKitFinder;->progressText:Landroid/widget/TextView;

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->ۢۧۡۢ()Landroid/widget/TextView;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟ۢۡۧۥ()[S

    move-result-object v3

    const/16 v4, 0xab0

    sget v5, Landroidx/activity/ۦۧۥۥ;->۟ۦۢۧۤ:I

    xor-int/lit8 v5, v5, -0x31

    const/16 v6, 0x996

    invoke-static {v3, v4, v5, v6}, Landroidx/activity/ۦۧۥۥ;->۟ۤۡۦۦ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, p1}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->ۢۧۡۢ()Landroid/widget/TextView;

    move-result-object v1

    const/high16 v2, 0x41500000    # 13.0f

    invoke-static {v1, v2}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->ۢۧۡۢ()Landroid/widget/TextView;

    move-result-object v1

    const v2, 0xab6b

    sget v3, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    xor-int/2addr v2, v3

    invoke-static {v1, v2}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->ۢۧۡۢ()Landroid/widget/TextView;

    move-result-object v1

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->۟ۡۡۧۦ()Landroid/graphics/Typeface;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/customview/ۡۤۡۤ;->ۧ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->ۢۧۡۢ()Landroid/widget/TextView;

    move-result-object v1

    sget v2, Landroidx/core/ۧ۟ۤۨ;->ۣۤ۠ۤ:I

    xor-int/lit16 v2, v2, 0x1ae

    invoke-static {v1, v2}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->ۢۧۡۢ()Landroid/widget/TextView;

    move-result-object v1

    const/4 v2, 0x0

    sget v3, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    xor-int/lit16 v3, v3, -0x256

    invoke-static {p0, v3}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v1, v2, v3, v4, v5}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->ۢۧۡۢ()Landroid/widget/TextView;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    sput-object v1, Lkevin/fun/hook/DexKitFinder;->taskNameText:Landroid/widget/TextView;

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->ۣۣۨ۠()Landroid/widget/TextView;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟ۢۡۧۥ()[S

    move-result-object v2

    const/16 v3, 0xab4

    sget v4, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۡۦۥۨ:I

    xor-int/lit16 v4, v4, 0x118

    const/16 v5, 0x466

    invoke-static {v2, v3, v4, v5}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۡۤۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->ۣۣۨ۠()Landroid/widget/TextView;

    move-result-object v1

    const/high16 v2, 0x41300000    # 11.0f

    invoke-static {v1, v2}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->ۣۣۨ۠()Landroid/widget/TextView;

    move-result-object v1

    const v2, 0x6665c3

    sget v3, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۨۤۨۡ:I

    xor-int/2addr v2, v3

    invoke-static {v1, v2}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->ۣۣۨ۠()Landroid/widget/TextView;

    move-result-object v1

    sget v2, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۥۧ۟:I

    xor-int/lit8 v2, v2, 0x2

    invoke-static {v1, v2}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->ۣۣۨ۠()Landroid/widget/TextView;

    move-result-object v1

    const/4 v2, 0x0

    sget v3, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/lit16 v3, v3, 0x319

    invoke-static {p0, v3}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v1, v2, v3, v4, v5}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->ۣۣۨ۠()Landroid/widget/TextView;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-static {v1, v0}, Landroidx/activity/ۦۧۥۥ;->ۣۢ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    invoke-static {v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۨۤ۟ۧ(Ljava/lang/Object;)Landroid/app/AlertDialog;

    move-result-object v1

    sput-object v1, Lkevin/fun/hook/DexKitFinder;->progressDialog:Landroid/app/AlertDialog;

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟ۧۢۦ۟()Landroid/app/AlertDialog;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟ۡ۠ۨۥ(Ljava/lang/Object;Z)V

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟ۧۢۦ۟()Landroid/app/AlertDialog;

    move-result-object v1

    invoke-static {v1}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->۟ۥۨۢ۠(Ljava/lang/Object;)V

    const v1, 0x3f666666    # 0.9f

    invoke-static {v0, v1}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۟ۡۦ۟ۦ(Ljava/lang/Object;F)V

    const v1, 0x3f666666    # 0.9f

    invoke-static {v0, v1}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣ۟ۡۢ(Ljava/lang/Object;F)V

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۡۦۦۧ(Ljava/lang/Object;F)V

    invoke-static {v0}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۥۣۤۤ(Ljava/lang/Object;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۡۢۢ(Ljava/lang/Object;F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۣۡۦ۠(Ljava/lang/Object;F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Landroidx/documentfile/ۡۢ۟ۥ;->ۣۤۦۦ(Ljava/lang/Object;F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v2, 0x2e6

    sget v1, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    int-to-long v4, v1

    xor-long/2addr v2, v4

    invoke-static {v0, v2, v3}, Landroidx/loader/ۥۧۨۤ;->ۣۣۧ۠(Ljava/lang/Object;J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Landroid/view/animation/OvershootInterpolator;

    invoke-direct {v1}, Landroid/view/animation/OvershootInterpolator;-><init>()V

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۦ۟ۢ۟(Ljava/lang/Object;Ljava/lang/Object;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۤ۟ۥ(Ljava/lang/Object;)V
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

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟ۢۡۧۥ()[S

    move-result-object v2

    const/16 v3, 0xaba

    sget v4, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۤ۟ۨ:I

    xor-int/lit16 v4, v4, -0x1bd

    const/16 v5, 0x636

    invoke-static {v2, v3, v4, v5}, Landroidx/activity/ۦۧۥۥ;->۟ۤۡۦۦ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder;->۟۠ۢ۟ۦ(Ljava/lang/Object;)V

    sput-boolean v9, Lkevin/fun/hook/DexKitFinder;->dialogShowing:Z

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
    .end sparse-switch
.end method

.method static synthetic lambda$10(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;)Ljava/lang/String;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v7, 0x0

    const/4 v1, 0x0

    const-string v5, "\u06e6\u06e4\u06e5"

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

    sget v6, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣ۠ۧ:I

    const-string v1, "\u06e5\u06e0\u06e3"

    move-object v5, v1

    goto :goto_0

    :sswitch_0
    const/16 v0, 0xacd

    const/16 v1, 0x5cb

    invoke-static {v3, v0, v8, v1}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟۟۟ۦۢ([SIII)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e3\u06e6\u06e5"

    move-object v5, v1

    goto :goto_0

    :sswitch_1
    xor-int/lit16 v7, v6, -0x1f3

    const-string v1, "\u06df\u06e0"

    move-object v5, v1

    move v8, v7

    goto :goto_0

    :sswitch_2
    sget v6, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۨۥۦ۟:I

    const-string v1, "\u06e8\u06e5\u06e3"

    move-object v5, v1

    goto :goto_0

    :sswitch_3
    aput-object v0, v4, v8

    const-string v1, "\u06e2\u06e1\u06e3"

    move-object v5, v1

    goto :goto_0

    :sswitch_4
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v5, "\u06e0\u06e5\u06e4"

    move-object v4, v1

    goto :goto_0

    :sswitch_5
    xor-int/lit16 v7, v6, 0x28d

    const-string v1, "\u06e1\u06e3\u06df"

    move-object v5, v1

    move v8, v7

    goto :goto_0

    :sswitch_6
    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟ۢۡۧۥ()[S

    move-result-object v1

    const-string v5, "\u06e0\u06e5\u06e0"

    move-object v3, v1

    goto :goto_0

    :sswitch_7
    invoke-static {p0, p1, v4}, Lkevin/fun/hook/DexKitFinder;->ۥۧۢۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v5, "\u06e3\u06e5\u06e0"

    move-object v2, v1

    goto :goto_0

    :sswitch_8
    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe1 -> :sswitch_0
        0x1aab7f -> :sswitch_2
        0x1aaefd -> :sswitch_3
        0x1ab284 -> :sswitch_7
        0x1ab6be -> :sswitch_8
        0x1ab6e2 -> :sswitch_4
        0x1abda8 -> :sswitch_1
        0x1ac1e7 -> :sswitch_6
        0x1ac986 -> :sswitch_5
    .end sparse-switch
.end method

.method static synthetic lambda$11(Landroid/content/Context;Ljava/lang/StringBuilder;II)V
    .locals 7

    const/4 v1, 0x0

    const/4 v5, 0x0

    const-string v3, "\u06e3\u06e2\u06e8"

    move-object v0, v1

    move-object v2, v1

    move v4, v5

    move v6, v5

    :goto_0
    invoke-static {v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟ۢۡۧۥ()[S

    move-result-object v0

    const-string v1, "\u06e3\u06df\u06e8"

    move-object v3, v1

    goto :goto_0

    :sswitch_0
    sget v4, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۤ۟ۨ:I

    const-string v1, "\u06e7\u06e6\u06e3"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    const/16 v1, 0xae6

    const/16 v2, 0x81a

    invoke-static {v0, v1, v6, v2}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣۣ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v3, "\u06df\u06e4\u06e6"

    move-object v2, v1

    goto :goto_0

    :sswitch_2
    invoke-static {p0, v2, p1, p2, p3}, Lkevin/fun/hook/DexKitFinder;->ۣ۟ۤ۠ۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    const-string v1, "\u06e5\u06e3"

    move-object v3, v1

    goto :goto_0

    :sswitch_3
    xor-int/lit16 v5, v4, -0x1ab

    const-string v1, "\u06e2\u06e7\u06e2"

    move-object v3, v1

    move v6, v5

    goto :goto_0

    :sswitch_4
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc9e -> :sswitch_4
        0x1aa7a1 -> :sswitch_2
        0x1ab33d -> :sswitch_1
        0x1ab60c -> :sswitch_0
        0x1ac5e4 -> :sswitch_3
    .end sparse-switch
.end method

.method static synthetic lambda$12(Landroid/content/Context;I)V
    .locals 0

    invoke-static {p0, p1}, Lkevin/fun/hook/DexKitFinder;->۟۠ۨۤ۟(Ljava/lang/Object;I)V

    return-void
.end method

.method static synthetic lambda$13(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;)Ljava/lang/String;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v8, 0x0

    const/4 v1, 0x0

    const-string v6, "\u06e5\u06df\u06e4"

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

    aput-object v0, v4, v7

    const-string v1, "\u06df\u06e1\u06e0"

    move-object v6, v1

    goto :goto_0

    :sswitch_0
    sget v8, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    const-string v1, "\u06df\u06e4\u06e0"

    move-object v6, v1

    move v9, v8

    goto :goto_0

    :sswitch_1
    xor-int/lit16 v7, v9, 0x3a0

    const-string v1, "\u06e1\u06e1"

    move-object v6, v1

    goto :goto_0

    :sswitch_2
    aput-object v2, v4, v7

    const-string v1, "\u06e5\u06e7\u06e1"

    move-object v6, v1

    goto :goto_0

    :sswitch_3
    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟ۢۡۧۥ()[S

    move-result-object v1

    const-string v6, "\u06e6\u06df\u06e0"

    move-object v5, v1

    goto :goto_0

    :sswitch_4
    sget v8, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢ۟ۥ:I

    const-string v1, "\u06e7\u06e1\u06e0"

    move-object v6, v1

    move v9, v8

    goto :goto_0

    :sswitch_5
    invoke-static {p0, p1, v4}, Lkevin/fun/hook/DexKitFinder;->ۥۧۢۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e1\u06e8\u06e3"

    move-object v3, v1

    goto :goto_0

    :sswitch_6
    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟ۢۡۧۥ()[S

    move-result-object v1

    const-string v6, "\u06e2\u06e1\u06e4"

    move-object v5, v1

    goto :goto_0

    :sswitch_7
    const-string v1, "\u06e2\u06e7\u06e2"

    move-object v6, v1

    goto :goto_0

    :sswitch_8
    xor-int/lit16 v7, v9, -0x119

    const-string v1, "\u06e6\u06e4\u06df"

    move-object v6, v1

    goto :goto_0

    :sswitch_9
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const-string v6, "\u06df\u06e6\u06e2"

    move-object v4, v1

    goto :goto_0

    :sswitch_a
    const/16 v0, 0xaeb

    const/16 v1, 0x568

    invoke-static {v5, v0, v7, v1}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۧۡۥۡ([SIII)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e2\u06e6"

    move-object v6, v1

    goto :goto_0

    :sswitch_b
    xor-int/lit16 v7, v9, 0x175

    const-string v1, "\u06e2\u06e8\u06e1"

    move-object v6, v1

    goto :goto_0

    :sswitch_c
    sget v8, Lorg/luckypray/dexkit/۠۠ۥ;->ۣ۟ۡۢۡ:I

    const-string v1, "\u06e6\u06e2\u06e1"

    move-object v6, v1

    move v9, v8

    goto :goto_0

    :sswitch_d
    const/16 v1, 0xaf8

    const/16 v2, 0xa0f

    invoke-static {v5, v1, v7, v2}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۨۦۣۨ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e0\u06e5\u06e5"

    move-object v2, v1

    goto :goto_0

    :sswitch_e
    sget v8, Landroidx/startup/۟ۦۤۨۧ;->ۧۡۡۦ:I

    const-string v1, "\u06df\u06e1\u06e5"

    move-object v6, v1

    move v9, v8

    goto :goto_0

    :sswitch_f
    xor-int/lit16 v7, v9, -0x83

    const-string v1, "\u06e8\u06e4\u06e3"

    move-object v6, v1

    goto/16 :goto_0

    :sswitch_10
    return-object v3

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc44 -> :sswitch_3
        0x1aa73e -> :sswitch_4
        0x1aa743 -> :sswitch_8
        0x1aa79b -> :sswitch_1
        0x1aa7db -> :sswitch_0
        0x1aab80 -> :sswitch_9
        0x1aaf9c -> :sswitch_10
        0x1ab285 -> :sswitch_e
        0x1ab33d -> :sswitch_6
        0x1ab35b -> :sswitch_2
        0x1abd8a -> :sswitch_7
        0x1abe7f -> :sswitch_5
        0x1ac147 -> :sswitch_c
        0x1ac1a5 -> :sswitch_f
        0x1ac1e1 -> :sswitch_a
        0x1ac546 -> :sswitch_b
        0x1ac967 -> :sswitch_d
    .end sparse-switch
.end method

.method static synthetic lambda$14(Lorg/luckypray/dexkit/DexKitBridge;)Ljava/lang/String;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v1, 0x0

    const/4 v8, 0x1

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟ۦۥۧۤ()Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->ۣۨۤۨ()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v2

    invoke-static {}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۧۨۤۨ()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkevin/fun/hook/DexKitFinder;->ۣ۟ۧ۟ۢ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    move-result-object v2

    invoke-static {v0, v2}, Lkevin/fun/hook/DexKitFinder;->۟ۡۤۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindClass;

    move-result-object v0

    invoke-static {p0, v0}, Lkevin/fun/hook/DexKitFinder;->ۢۢ۟ۨ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder;->ۢۦۣۣ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez v0, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->ۦۥۦۤ()Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v2

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۣۧ۠(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v2, v0}, Lkevin/fun/hook/DexKitFinder;->۟۟۠ۢۤ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->ۦۨ۟ۢ()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v2

    invoke-static {}, Landroidx/activity/ۤۧۧۧ;->۟ۡۢۥۦ()Ljava/lang/String;

    move-result-object v3

    new-array v4, v8, [Ljava/lang/String;

    sget v5, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    xor-int/lit16 v5, v5, 0x2fe

    aput-object v3, v4, v5

    invoke-static {v2, v4}, Lkevin/fun/hook/DexKitFinder;->ۥۨۦۣ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->ۦۨ۟ۢ()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣ۟ۥۡۦ()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۤۡۢۧ()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/String;

    sget v7, Landroidx/core/ۧ۟ۤۨ;->ۣۤ۠ۤ:I

    xor-int/lit16 v7, v7, 0x1bf

    aput-object v4, v6, v7

    sget v4, Lkevin/fun/hook/۟ۥ۠۠;->ۢۦۧۧ:I

    xor-int/lit16 v4, v4, -0x1c6

    aput-object v5, v6, v4

    invoke-static {v3, v6}, Lkevin/fun/hook/DexKitFinder;->ۣ۟ۤ۠ۢ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v3

    invoke-static {v2, v3}, Lkevin/fun/hook/DexKitFinder;->ۣۧۦۣ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v2

    invoke-static {}, Landroidx/loader/ۢۥ۟;->ۣ۟ۢۡۧ()Ljava/lang/String;

    move-result-object v3

    new-array v4, v8, [Ljava/lang/String;

    sget v5, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v5, v5, 0x20e

    aput-object v3, v4, v5

    invoke-static {v2, v4}, Lkevin/fun/hook/DexKitFinder;->ۣ۟ۤ۠ۢ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    move-result-object v2

    invoke-static {v0, v2}, Lkevin/fun/hook/DexKitFinder;->ۨۨۡۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindMethod;

    move-result-object v0

    invoke-static {p0, v0}, Lkevin/fun/hook/DexKitFinder;->ۣۨۥ۟(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder;->ۣ۟ۡۢۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v0, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder;->۟ۥۦۧۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_2
    move-object v1, v0

    :sswitch_6
    return-object v1

    :sswitch_7
    move-object v0, v1

    goto :goto_2

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
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch
.end method

.method static synthetic lambda$15(Landroid/content/Context;Ljava/lang/StringBuilder;II)V
    .locals 2

    const/4 v0, 0x0

    const-string v1, "\u06e6\u06e1\u06e7"

    :goto_0
    invoke-static {v1}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p0, v0, p1, p2, p3}, Lkevin/fun/hook/DexKitFinder;->ۣ۟ۤ۠ۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    const-string v1, "\u06e4\u06e6\u06e8"

    goto :goto_0

    :sswitch_0
    invoke-static {}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۢ۠ۥۧ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06df\u06e0\u06e0"

    goto :goto_0

    :sswitch_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1abaa6 -> :sswitch_1
        0x1ac18c -> :sswitch_0
    .end sparse-switch
.end method

.method static synthetic lambda$2(Landroid/content/Context;Landroid/view/View;)V
    .locals 2

    const/4 v0, 0x1

    sput-boolean v0, Lkevin/fun/hook/DexKitFinder;->isBackgroundMode:Z

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟ۧۢۦ۟()Landroid/app/AlertDialog;

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
    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟ۧۢۦ۟()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-static {v0}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۧۧۨۢ(Ljava/lang/Object;)Z

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
    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟ۧۢۦ۟()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۥۤۧۢ(Ljava/lang/Object;)V

    :sswitch_6
    const/4 v0, 0x0

    sput-boolean v0, Lkevin/fun/hook/DexKitFinder;->dialogShowing:Z

    invoke-static {}, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۡۨۨۡ()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Landroidx/activity/ۣۦۡۥ;->۟ۥۨۧۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۣ۟ۡۨۡ()I

    move-result v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_7
    if-gtz v1, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_8
    const v0, 0xbe41

    goto :goto_2

    :sswitch_9
    const-string v0, "cYfF2mSeT34XSXMfeM0kK"

    invoke-static {v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۟ۡ۠ۢ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

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

.method static synthetic lambda$3()V
    .locals 3

    :try_start_0
    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟ۧۢۦ۟()Landroid/app/AlertDialog;

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
    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟ۧۢۦ۟()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-static {v0}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۧۧۨۢ(Ljava/lang/Object;)Z

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
    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟ۧۢۦ۟()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۥۤۧۢ(Ljava/lang/Object;)V

    const/4 v0, 0x0

    sput-object v0, Lkevin/fun/hook/DexKitFinder;->progressDialog:Landroid/app/AlertDialog;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :catchall_0
    move-exception v0

    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۦۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroidx/customview/ۤۡۥ;->ۥ۠ۧۧ()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder;->۟۠ۢ۟ۦ(Ljava/lang/Object;)V

    :sswitch_7
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
        0xb97b -> :sswitch_7
    .end sparse-switch
.end method

.method static synthetic lambda$4(Landroid/content/Context;Ljava/lang/String;Ljava/lang/StringBuilder;II)V
    .locals 10

    :try_start_0
    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x1

    invoke-static {v2, v0}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    sget v0, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۤ۟ۨ:I

    xor-int/lit16 v0, v0, -0x1bc

    invoke-static {p0, v0}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v1

    invoke-static {p0, v0}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v3

    invoke-static {p0, v0}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v4

    sget v5, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v5, v5, 0x216

    invoke-static {p0, v5}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v5

    invoke-static {v2, v1, v3, v4, v5}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    sget v3, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    sget v4, Landroidx/startup/۟ۦۤۨۧ;->ۧۡۡۦ:I

    xor-int/lit16 v4, v4, 0x115

    xor-int/lit16 v3, v3, -0x179

    invoke-direct {v1, v4, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v2, v1}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣۡۥۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-static {v1, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    invoke-static {p0, v0}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v3

    int-to-float v3, v3

    invoke-static {p0, v0}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v4

    int-to-float v4, v4

    invoke-static {p0, v0}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v5

    int-to-float v5, v5

    invoke-static {p0, v0}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v0

    int-to-float v0, v0

    const/16 v6, 0x8

    new-array v6, v6, [F

    const/4 v7, 0x0

    const/4 v8, 0x0

    aput v8, v6, v7

    const/4 v7, 0x1

    const/4 v8, 0x0

    aput v8, v6, v7

    sget v7, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۧۨۨ:I

    xor-int/lit8 v7, v7, -0x61

    const/4 v8, 0x0

    aput v8, v6, v7

    const/4 v8, 0x3

    const/4 v9, 0x0

    aput v9, v6, v8

    sget v8, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    xor-int/lit16 v8, v8, -0x10d

    aput v3, v6, v8

    const/4 v3, 0x5

    aput v4, v6, v3

    const/4 v3, 0x6

    aput v5, v6, v3

    const/4 v3, 0x7

    aput v0, v6, v3

    invoke-static {v1, v6}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣۨۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v1}, Landroidx/activity/ۦۧۥۥ;->۟ۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/view/View;

    invoke-direct {v0, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    sget v3, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣۡۢ۟:I

    xor-int/lit16 v3, v3, 0x30a

    invoke-static {p0, v3}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v3

    invoke-static {p0, v8}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v4

    invoke-direct {v1, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/4 v3, 0x1

    iput v3, v1, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    sget v3, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    xor-int/lit16 v3, v3, -0x17b

    invoke-static {p0, v3}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v4

    iput v4, v1, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-static {v0, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۦۤۡۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const v4, -0x1f1ca7

    sget v5, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۤۥ:I

    xor-int/2addr v4, v5

    invoke-static {v1, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    invoke-static {p0, v7}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v4

    int-to-float v4, v4

    invoke-static {v1, v4}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۥ۟ۢۧ(Ljava/lang/Object;F)V

    invoke-static {v0, v1}, Landroidx/core/ktx/۟۟ۡۢ۠;->۟۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {v0, p1}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v1, 0x41900000    # 18.0f

    invoke-static {v0, v1}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->۟ۡۡۧۦ()Landroid/graphics/Typeface;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/customview/ۡۤۡۤ;->ۧ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    const v1, 0xccccdf

    sget v4, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    xor-int/2addr v1, v4

    invoke-static {v0, v1}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    sget v1, Landroidx/startup/۟ۦۤۨۧ;->ۧۡۡۦ:I

    xor-int/lit16 v4, v1, -0x105

    invoke-static {v0, v4}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    const/4 v1, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static {p0, v3}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v7

    invoke-static {v0, v1, v5, v6, v7}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    invoke-static {v2, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Landroid/widget/LinearLayout;

    invoke-direct {v5, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    invoke-static {v5, v0}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    invoke-static {v5, v4}, Landroidx/emoji2/ۢۧۡۧ;->ۡۤۥ(Ljava/lang/Object;I)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v6, 0x0

    invoke-static {p0, v3}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v3

    invoke-static {v5, v0, v1, v6, v3}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    new-instance v3, Landroid/widget/TextView;

    invoke-direct {v3, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {p2}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۤۨ(Ljava/lang/Object;)I

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
    invoke-static {}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣ۟۠ۦۦ()Ljava/lang/String;

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
    invoke-static {}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۣۥۤۨ()Ljava/lang/String;

    move-result-object v0

    :sswitch_5
    invoke-static {v3, v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v0, 0x42100000    # 36.0f

    invoke-static {v3, v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    invoke-static {p2}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۤۨ(Ljava/lang/Object;)I

    move-result v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-nez v1, :cond_1

    const v0, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    const v0, -0xb350b0

    const v1, 0xbe7f

    :goto_3
    const v6, 0xbe90

    xor-int/2addr v1, v6

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :goto_4
    :sswitch_9
    invoke-static {v3, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/16 v6, 0x8

    invoke-static {p0, v6}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v6

    const/4 v7, 0x0

    invoke-static {v3, v0, v1, v6, v7}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    invoke-static {v5, v3}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Landroid/widget/TextView;

    invoke-direct {v3, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {p2}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۤۨ(Ljava/lang/Object;)I

    move-result v1

    const v0, 0xbefb

    :goto_5
    const v6, 0xbf0c

    xor-int/2addr v0, v6

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
    const/16 v0, -0x6b00

    goto :goto_4

    :sswitch_d
    if-nez v1, :cond_2

    const v0, 0xc1e3

    goto :goto_5

    :sswitch_e
    invoke-static {}, Landroidx/core/ktx/۟۟ۡۢ۠;->ۡۥۦۦ()Ljava/lang/String;

    move-result-object v0

    const v1, 0xc202

    :goto_6
    const v6, 0xc213

    xor-int/2addr v1, v6

    sparse-switch v1, :sswitch_data_5

    goto :goto_6

    :sswitch_f
    const v1, 0xc221

    goto :goto_6

    :sswitch_10
    invoke-static {}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۡ۟ۥۦ()Ljava/lang/String;

    move-result-object v0

    :sswitch_11
    invoke-static {v3, v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v0, 0x41800000    # 16.0f

    invoke-static {v3, v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->۟ۡۡۧۦ()Landroid/graphics/Typeface;

    move-result-object v0

    invoke-static {v3, v0}, Landroidx/customview/ۡۤۡۤ;->ۧ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p2}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۤۨ(Ljava/lang/Object;)I

    move-result v1

    const v0, 0xc27e

    :goto_7
    const v6, 0xc28f

    xor-int/2addr v0, v6

    sparse-switch v0, :sswitch_data_6

    goto :goto_7

    :cond_3
    :sswitch_12
    const v0, 0xc2bc

    goto :goto_7

    :sswitch_13
    if-nez v1, :cond_3

    const v0, 0xc2db

    goto :goto_7

    :sswitch_14
    const v0, -0xb350b0

    const v1, 0xc2fa

    :goto_8
    const v6, 0xc30b

    xor-int/2addr v1, v6

    sparse-switch v1, :sswitch_data_7

    goto :goto_8

    :sswitch_15
    const v1, 0xc5a4

    goto :goto_8

    :sswitch_16
    const/16 v0, -0x6b00

    :sswitch_17
    invoke-static {v3, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    invoke-static {v5, v3}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v5}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    invoke-static {v0, v4}, Landroidx/emoji2/ۢۧۡۧ;->ۡۤۥ(Ljava/lang/Object;I)V

    sget v1, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    xor-int/lit16 v1, v1, 0x222

    invoke-static {p0, v1}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v1

    sget v3, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۨۤۨۡ:I

    xor-int/lit16 v3, v3, -0x3b0

    invoke-static {p0, v3}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v3

    sget v4, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    xor-int/lit16 v4, v4, 0x3ac

    invoke-static {p0, v4}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v4

    sget v5, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    xor-int/lit16 v5, v5, 0x224

    invoke-static {p0, v5}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v5

    invoke-static {v0, v1, v3, v4, v5}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const v3, 0xa09af

    sget v4, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۨۤۨۡ:I

    xor-int/2addr v3, v4

    invoke-static {v1, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    sget v3, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    xor-int/lit16 v3, v3, 0x2f4

    invoke-static {p0, v3}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v3

    int-to-float v3, v3

    invoke-static {v1, v3}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۥ۟ۢۧ(Ljava/lang/Object;F)V

    invoke-static {v0, v1}, Landroidx/activity/ۦۧۥۥ;->۟ۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦ۟ۤۢ()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v3, p3}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟۠ۡۥ۟()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v3, p4}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v3}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v3, 0x41400000    # 12.0f

    invoke-static {v1, v3}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v3, -0x9999d1

    sget v4, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    xor-int/2addr v3, v4

    invoke-static {v1, v3}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    invoke-static {v0, v1}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {p2}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۤۨ(Ljava/lang/Object;)I

    move-result v3

    const v0, 0xc601

    :goto_9
    const v4, 0xc612

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_8

    goto :goto_9

    :sswitch_18
    if-nez v3, :cond_4

    const v0, 0xc65e

    goto :goto_9

    :cond_4
    :sswitch_19
    const v0, 0xc63f

    goto :goto_9

    :sswitch_1a
    invoke-static {}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧۤۢۥ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0xccccdf

    sget v3, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    xor-int/2addr v0, v3

    invoke-static {v1, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const v0, 0xc67d

    :goto_a
    const v3, 0xc68e

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_9

    goto :goto_a

    :goto_b
    :sswitch_1b
    const/high16 v0, 0x41500000    # 13.0f

    invoke-static {v1, v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    sget v0, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۤ۟ۧۤ:I

    xor-int/lit16 v0, v0, -0x1e4

    invoke-static {p0, v0}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v0

    int-to-float v0, v0

    const v3, 0x3f99999a    # 1.2f

    invoke-static {v1, v0, v3}, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦ۠ۦۢ(Ljava/lang/Object;FF)V

    sget v0, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    xor-int/lit8 v0, v0, -0x65

    invoke-static {v1, v0}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    const/4 v0, 0x0

    sget v3, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    xor-int/lit16 v3, v3, -0x210

    invoke-static {p0, v3}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v3

    const/4 v4, 0x0

    sget v5, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    xor-int/lit16 v5, v5, -0x24e

    invoke-static {p0, v5}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v5

    invoke-static {v1, v0, v3, v4, v5}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    invoke-static {v2, v1}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Landroid/view/View;

    invoke-direct {v1, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v3, 0x1

    invoke-static {p0, v3}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v3

    sget v4, Landroidx/startup/۟ۦۤۨۧ;->ۧۡۡۦ:I

    xor-int/lit16 v4, v4, 0x115

    invoke-direct {v0, v4, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۦۤۡۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0x111174

    sget v3, Landroidx/customview/ۤۡۥ;->ۣ۟ۢۥۢ:I

    xor-int/2addr v0, v3

    invoke-static {v1, v0}, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۤۥۧ(Ljava/lang/Object;I)V

    invoke-static {v1}, Landroidx/core/ktx/۟۟ۡۢ۠;->ۥۥۨۨ(Ljava/lang/Object;)Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    sget v3, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    xor-int/lit16 v3, v3, 0x171

    invoke-static {p0, v3}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v4

    iput v4, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    invoke-static {p0, v3}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v3

    iput v3, v0, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۦۤۡۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v1}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    sget v3, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۡۦۥۨ:I

    sget v4, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۤۦۤۧ:I

    xor-int/lit16 v4, v4, -0x160

    xor-int/lit16 v3, v3, -0x120

    invoke-direct {v1, v4, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v0, v1}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣۡۥۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۡۡۢۥ()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v3, 0x41700000    # 15.0f

    invoke-static {v1, v3}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v3, 0x66678d

    sget v4, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣ۠ۧ:I

    xor-int/2addr v3, v4

    invoke-static {v1, v3}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    sget v3, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    xor-int/lit16 v3, v3, 0x31c

    invoke-static {v1, v3}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    sget v3, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۥۨ:I

    xor-int/lit16 v3, v3, 0x294

    invoke-static {p0, v3}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v3

    sget v4, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۧۨۨ:I

    xor-int/lit8 v4, v4, -0x6d

    invoke-static {p0, v4}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v4

    sget v5, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    xor-int/lit8 v5, v5, -0x4

    invoke-static {p0, v5}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v5

    sget v6, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    xor-int/lit16 v6, v6, 0x168

    invoke-static {p0, v6}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v6

    invoke-static {v1, v3, v4, v5, v6}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v4, 0x0

    const/4 v5, -0x2

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-direct {v3, v4, v5, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-static {v1, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۢۥۨۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const v4, -0xa0be1

    sget v5, Landroidx/activity/ۤۧۧۧ;->۟۟ۢ۠ۡ:I

    xor-int/2addr v4, v5

    invoke-static {v3, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    sget v4, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    xor-int/lit16 v4, v4, 0x3b9

    invoke-static {p0, v4}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v4

    int-to-float v4, v4

    invoke-static {v3, v4}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۥ۟ۢۧ(Ljava/lang/Object;F)V

    invoke-static {v1, v3}, Landroidx/core/ۧ۟ۤۨ;->ۣ۟ۢۧ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Landroid/widget/TextView;

    invoke-direct {v3, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Landroidx/vectordrawable/ۢۤۡۤ;->ۦ۟ۦۧ()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v4, 0x41700000    # 15.0f

    invoke-static {v3, v4}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v4, -0xab09

    sget v5, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    xor-int/2addr v4, v5

    invoke-static {v3, v4}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->۟ۡۡۧۦ()Landroid/graphics/Typeface;

    move-result-object v4

    invoke-static {v3, v4}, Landroidx/customview/ۡۤۡۤ;->ۧ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v4, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v4, v4, 0x137

    invoke-static {v3, v4}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    sget v4, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    xor-int/lit16 v4, v4, 0x169

    invoke-static {p0, v4}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v4

    sget v5, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۣۧۢ:I

    xor-int/lit16 v5, v5, -0x3c9

    invoke-static {p0, v5}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v5

    sget v6, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۥۦ:I

    xor-int/lit16 v6, v6, 0x277

    invoke-static {p0, v6}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v6

    sget v7, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/lit16 v7, v7, 0x311

    invoke-static {p0, v7}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v7

    invoke-static {v3, v4, v5, v6, v7}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v5, 0x0

    const/4 v6, -0x2

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-direct {v4, v5, v6, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-static {v3, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۢۥۨۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const v5, 0xa0a6f

    sget v6, Landroidx/customview/ۤۡۥ;->ۣ۟ۢۥۢ:I

    xor-int/2addr v5, v6

    invoke-static {v4, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    sget v5, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۣۧۢ:I

    xor-int/lit16 v5, v5, -0x3e0

    invoke-static {p0, v5}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v5

    int-to-float v5, v5

    invoke-static {v4, v5}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۥ۟ۢۧ(Ljava/lang/Object;F)V

    invoke-static {v3, v4}, Landroidx/core/ۧ۟ۤۨ;->ۣ۟ۢۧ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Landroid/view/View;

    invoke-direct {v4, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v6, 0x1

    invoke-static {p0, v6}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v6

    sget v7, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    xor-int/lit16 v7, v7, -0xc4

    invoke-direct {v5, v6, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v4, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۦۤۡۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v5, 0x111164

    sget v6, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    xor-int/2addr v5, v6

    invoke-static {v4, v5}, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۤۥۧ(Ljava/lang/Object;I)V

    invoke-static {v0, v1}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v4}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v3}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-static {v0, v2}, Landroidx/activity/ۦۧۥۥ;->ۣۢ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-static {v0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۨۤ۟ۧ(Ljava/lang/Object;)Landroid/app/AlertDialog;

    move-result-object v0

    new-instance v4, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda15;

    invoke-direct {v4, v0, p0}, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda15;-><init>(Landroid/app/AlertDialog;Landroid/content/Context;)V

    invoke-static {v1, v4}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۦۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda1;

    invoke-direct {v1, v0, p0}, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda1;-><init>(Landroid/app/AlertDialog;Landroid/content/Context;)V

    invoke-static {v3, v1}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۦۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->۟ۥۨۢ۠(Ljava/lang/Object;)V

    sget v1, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    xor-int/lit16 v1, v1, 0x1ef

    invoke-static {p0, v1}, Lkevin/fun/hook/DexKitFinder;->ۨ۠ۡۡ(Ljava/lang/Object;I)I

    move-result v1

    int-to-float v1, v1

    invoke-static {v2, v1}, Landroidx/loader/ۡۢۢ;->۠ۡۤۨ(Ljava/lang/Object;F)V

    invoke-static {v2}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۥۣۤۤ(Ljava/lang/Object;)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Landroidx/loader/ۣ۟۟ۧ۠;->ۤۢ۠ۥ(Ljava/lang/Object;F)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const-wide/16 v2, -0x2f0

    sget v4, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    int-to-long v4, v4

    xor-long/2addr v2, v4

    invoke-static {v1, v2, v3}, Landroidx/loader/ۥۧۨۤ;->ۣۣۧ۠(Ljava/lang/Object;J)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    new-instance v2, Landroid/view/animation/OvershootInterpolator;

    const v3, 0x3f4ccccd    # 0.8f

    invoke-direct {v2, v3}, Landroid/view/animation/OvershootInterpolator;-><init>(F)V

    invoke-static {v1, v2}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۦ۟ۢ۟(Ljava/lang/Object;Ljava/lang/Object;)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-static {v1}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۤ۟ۥ(Ljava/lang/Object;)V

    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣ۟۠۟ۡ(Ljava/lang/Object;Z)V

    const v0, 0xc984

    :goto_c
    const v1, 0xc995

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_a

    goto :goto_c

    :sswitch_1c
    const v0, 0xc9a3

    goto :goto_c

    :sswitch_1d
    const v0, 0xc69c

    goto/16 :goto_a

    :sswitch_1e
    invoke-static {p2}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۣۣ۟۟۠()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v3, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->۟۠ۢۥۧ()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, -0x999bb8

    sget v3, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    xor-int/2addr v0, v3

    invoke-static {v1, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_b

    :catchall_0
    move-exception v0

    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۦۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣ۟ۤۧۢ()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder;->۟۠ۢ۟ۦ(Ljava/lang/Object;)V

    :try_start_1
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-static {v0, p1}, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۣ۟ۦۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    invoke-static {p2}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۤۨ(Ljava/lang/Object;)I

    move-result v1

    const v0, 0xca00

    :goto_d
    const v3, 0xca11

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_b

    goto :goto_d

    :cond_5
    :sswitch_1f
    const v0, 0xca3e

    goto :goto_d

    :sswitch_20
    if-nez v1, :cond_5

    const v0, 0xca5d

    goto :goto_d

    :sswitch_21
    invoke-static {}, Landroidx/activity/ۤۧۧۧ;->۠ۡ۠ۡ()Ljava/lang/String;

    move-result-object v0

    const v1, 0xca7c

    :goto_e
    const v3, 0xca8d

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_c

    goto :goto_e

    :sswitch_22
    const v1, 0xcd26

    goto :goto_e

    :sswitch_23
    invoke-static {p2}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦ۠ۨۤ()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :sswitch_24
    invoke-static {v2, v0}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۥۡۨ۟(Ljava/lang/Object;Ljava/lang/Object;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۣۢۢ۠()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroidx/customview/ۤۡۥ;->۟۠۟ۦ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۤۧ۟(Ljava/lang/Object;)Landroid/app/AlertDialog;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const v0, 0xcd83

    :goto_f
    const v1, 0xcd94

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_d

    goto :goto_f

    :sswitch_25
    const v0, 0xcda2

    goto :goto_f

    :catchall_1
    move-exception v0

    :sswitch_26
    invoke-static {}, Landroidx/loader/ۣۦ۟ۡ;->۟ۦ۠ۨ()I

    move-result v1

    const v0, 0xcdff

    :goto_10
    const v2, 0xce10

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_e

    goto :goto_10

    :cond_6
    :sswitch_27
    const v0, 0xce3d

    goto :goto_10

    :sswitch_28
    if-ltz v1, :cond_6

    const v0, 0xd0e7

    goto :goto_10

    :sswitch_29
    const-string v0, "UM19Ywd7xafRdqjS9uhvImJ781oaP"

    invoke-static {v0}, Landroidx/emoji2/ۢۧۡۧ;->ۣۢ۠ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :sswitch_2a
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
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_a
        0x35 -> :sswitch_10
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_11
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_12
        0x33 -> :sswitch_16
        0x54 -> :sswitch_14
        0xf1 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_15
        0x6af -> :sswitch_17
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_18
        0x2d -> :sswitch_1e
        0x32 -> :sswitch_19
        0x4c -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1b
        0xf3 -> :sswitch_1d
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1c
        0x36 -> :sswitch_26
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_1f
        0x11 -> :sswitch_20
        0x2f -> :sswitch_23
        0x4c -> :sswitch_21
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_22
        0x7ab -> :sswitch_24
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_25
        0x36 -> :sswitch_26
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_27
        0x2d -> :sswitch_2a
        0x3ef -> :sswitch_28
        0x1ef7 -> :sswitch_29
    .end sparse-switch
.end method

.method static synthetic lambda$5(Landroid/app/AlertDialog;Landroid/content/Context;Landroid/view/View;)V
    .locals 2

    const/4 v0, 0x0

    const-string v1, "\u06df\u06e8\u06e8"

    :goto_0
    invoke-static {v1}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p0}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۥۤۧۢ(Ljava/lang/Object;)V

    const-string v1, "\u06e1\u06df\u06df"

    goto :goto_0

    :sswitch_0
    invoke-static {p1, v0}, Landroidx/activity/ۣۦۡۥ;->۟ۥۨۧۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06df\u06e0\u06e3"

    goto :goto_0

    :sswitch_1
    invoke-static {}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۣۢۢ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e1\u06e8\u06e6"

    goto :goto_0

    :sswitch_2
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa722 -> :sswitch_2
        0x1aae81 -> :sswitch_1
        0x1aaf9f -> :sswitch_0
    .end sparse-switch
.end method

.method static synthetic lambda$6(Landroid/app/AlertDialog;Landroid/content/Context;Landroid/view/View;)V
    .locals 3

    invoke-static {p0}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۥۤۧۢ(Ljava/lang/Object;)V

    :try_start_0
    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->۟۟ۦۦۥ()I

    move-result v0

    invoke-static {v0}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۨۢۢۡ(I)V

    const/4 v0, 0x0

    invoke-static {v0}, Landroidx/appcompat/resources/ۦۨۦۢ;->ۣۢۦۥ(I)V
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

    invoke-static {}, Landroidx/loader/ۣ۟۟ۧ۠;->۟ۢۧۦ۠()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DexKitFinder;->۟۠ۢ۟ۦ(Ljava/lang/Object;)V

    invoke-static {}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۤۡ۟()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroidx/documentfile/ۡۢ۟ۥ;->ۣ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    :sswitch_3
    const/16 v0, 0x70a

    goto :goto_2

    :sswitch_4
    const-string v0, "FqDLHNmsPKl"

    invoke-static {v0}, Lkevin/fun/hook/۟ۥ۠۠;->ۣۣۤۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

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

.method static synthetic lambda$7(Landroid/content/Context;I)V
    .locals 2

    invoke-static {p0, p1}, Lkevin/fun/hook/DexKitFinder;->۟۠ۨۤ۟(Ljava/lang/Object;I)V

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۡ۟ۦ()I

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
    const-string v0, "rDK"

    invoke-static {v0}, Lkevin/fun/hook/۟ۥ۠۠;->ۣۣۤۢ(Ljava/lang/String;)Ljava/lang/String;

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

.method static synthetic lambda$8(Landroid/content/Context;Ljava/lang/StringBuilder;II)V
    .locals 2

    const/4 v0, 0x0

    const-string v1, "\u06e1\u06e2\u06e8"

    :goto_0
    invoke-static {v1}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    return-void

    :sswitch_0
    invoke-static {p0, v0, p1, p2, p3}, Lkevin/fun/hook/DexKitFinder;->ۣ۟ۤ۠ۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    const-string v1, "\u06e4\u06e6\u06e2"

    goto :goto_0

    :sswitch_1
    invoke-static {}, Landroidx/customview/ۤۡۥ;->۟ۦۤۤۤ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e7\u06e2\u06e1"

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x1aaee7 -> :sswitch_1
        0x1ac566 -> :sswitch_0
    .end sparse-switch
.end method

.method static synthetic lambda$9(Landroid/content/Context;I)V
    .locals 0

    invoke-static {p0, p1}, Lkevin/fun/hook/DexKitFinder;->۟۠ۨۤ۟(Ljava/lang/Object;I)V

    return-void
.end method

.method private static showProgressDialog(Landroid/content/Context;I)V
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
    if-nez p0, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
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
    const-string v0, "qIKXuzTb1lco5VV"

    invoke-static {v0}, Landroidx/startup/۟ۦۤۨۧ;->۟۟۟ۨۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

    :goto_2
    :sswitch_6
    return-void

    :sswitch_7
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۧۤۡۨ()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda8;

    invoke-direct {v1, p0, p1}, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda8;-><init>(Landroid/content/Context;I)V

    invoke-static {v0, v1}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

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
.end method

.method private static showResultDialog(Landroid/content/Context;Ljava/lang/String;Ljava/lang/StringBuilder;II)V
    .locals 7

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
    new-instance v6, Landroid/os/Handler;

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۧۤۡۨ()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v6, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v0, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda9;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p4

    move v5, p3

    invoke-direct/range {v0 .. v5}, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda9;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/StringBuilder;II)V

    invoke-static {v6, v0}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

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

.method private static triggerGC()V
    .locals 2

    :try_start_0
    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۟ۥۥۡۨ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :sswitch_0
    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_1
    invoke-static {}, Landroidx/documentfile/ۡۢ۟ۥ;->۟۟ۧۢۡ()I

    move-result v1

    const/16 v0, 0x748

    :goto_1
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_2
    if-gtz v1, :cond_0

    const v0, 0xbe60

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x66f

    goto :goto_0

    :catchall_0
    move-exception v0

    const/16 v0, 0x6cc

    :goto_2
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_4
    const/16 v0, 0x6eb

    goto :goto_2

    :cond_0
    :sswitch_5
    const v0, 0xbe41

    goto :goto_1

    :sswitch_6
    const-string v0, "gTLsyw3w87JGIe35aQgaSZ3Kxtg"

    invoke-static {v0}, Landroidx/core/ktx/۟۟ۡۢ۠;->۟ۥ۟ۨ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

    :sswitch_7
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_1
        0x31 -> :sswitch_3
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_2
        0xb918 -> :sswitch_7
        0xb939 -> :sswitch_6
        0xb97b -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_0
    .end sparse-switch
.end method

.method private static updateProgress(IILjava/lang/String;)V
    .locals 2

    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۟۠ۡۧۤ()Z

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
    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->۠ۧۤ()Z

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
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :sswitch_7
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۧۤۡۨ()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda10;

    invoke-direct {v1, p0, p1, p2}, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda10;-><init>(IILjava/lang/String;)V

    invoke-static {v0, v1}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    :sswitch_8
    return-void

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

.method public static ۟۟۠ۢۤ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindMethod;
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
    check-cast p0, Lorg/luckypray/dexkit/query/FindMethod;

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/FindMethod;->searchInClass(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/FindMethod;

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

.method public static ۟۟ۡۤۦ()Ljava/util/concurrent/atomic/AtomicInteger;
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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/DexKitFinder;->currentTask:Ljava/util/concurrent/atomic/AtomicInteger;

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

.method public static ۟۠ۡۧۤ()Z
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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-boolean v0, Lkevin/fun/hook/DexKitFinder;->dialogShowing:Z

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

.method public static ۟۠ۢ۟ۦ(Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۣۣۨ()I

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

.method public static ۟۠ۨۤ۟(Ljava/lang/Object;I)V
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
    check-cast p0, Landroid/content/Context;

    invoke-static {p0, p1}, Lkevin/fun/hook/DexKitFinder;->showProgressDialog(Landroid/content/Context;I)V

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

.method public static ۣ۟ۡۢۧ(Ljava/lang/Object;)Ljava/lang/Object;
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
    check-cast p0, Lorg/luckypray/dexkit/result/MethodDataList;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodDataList;->firstOrNull()Ljava/lang/Object;

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

.method public static ۟ۡۤۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindClass;
    .locals 2

    invoke-static {}, Landroidx/loader/ۥۧۨۤ;->ۣۡۧۨ()I

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
    check-cast p0, Lorg/luckypray/dexkit/query/FindClass;

    check-cast p1, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/FindClass;->matcher(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)Lorg/luckypray/dexkit/query/FindClass;

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

.method public static ۟ۡۥۦۣ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindMethod;
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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/query/FindMethod;

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/FindMethod;->searchPackages(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/FindMethod;

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

.method public static ۟ۢۡۧۥ()[S
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
    sget-object v0, Lkevin/fun/hook/DexKitFinder;->short:[S

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

.method public static ۣ۟ۤ۠ۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 2

    invoke-static {}, Landroidx/activity/ۤۧۧۧ;->ۥۢۧۡ()I

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

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/StringBuilder;

    invoke-static {p0, p1, p2, p3, p4}, Lkevin/fun/hook/DexKitFinder;->showResultDialog(Landroid/content/Context;Ljava/lang/String;Ljava/lang/StringBuilder;II)V

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

.method public static ۣ۟ۤ۠ۢ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
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
    check-cast p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

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

.method public static ۟ۤۤۥۡ()V
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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->forceGC()V

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

.method public static ۟ۤۨۧۧ(IILjava/lang/Object;)V
    .locals 3

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p2, Ljava/lang/String;

    invoke-static {p0, p1, p2}, Lkevin/fun/hook/DexKitFinder;->updateProgress(IILjava/lang/String;)V

    :sswitch_3
    invoke-static {}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟ۢۡ۟()I

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
    const-string v0, "bMeWIlCizeGzLHZ5rbGh"

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

.method public static ۟ۥۦۧۨ(Ljava/lang/Object;)Ljava/lang/String;
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
    check-cast p0, Lorg/luckypray/dexkit/result/MethodData;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodData;->getName()Ljava/lang/String;

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

.method public static ۟ۦ۠ۢ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۤۦۥۥ()I

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
    check-cast p0, Lorg/luckypray/dexkit/DexKitBridge;

    check-cast p1, [Ljava/lang/String;

    invoke-static {p0, p1}, Lkevin/fun/hook/DexKitFinder;->findMethodNameByStrings(Lorg/luckypray/dexkit/DexKitBridge;[Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۟ۦۣۢ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroidx/activity/ۤۧۧۧ;->ۥۢۧۡ()I

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
    check-cast p0, Lorg/luckypray/dexkit/result/ClassData;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/ClassData;->getName()Ljava/lang/String;

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

.method public static ۟ۦۥۧۤ()Lorg/luckypray/dexkit/query/FindClass;
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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lorg/luckypray/dexkit/query/FindClass;->create()Lorg/luckypray/dexkit/query/FindClass;

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

.method public static ۟ۦۦ۠ۧ(Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassData;
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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/result/MethodData;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodData;->getDeclaredClass()Lorg/luckypray/dexkit/result/ClassData;

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

.method public static ۣ۟ۧ۟ۢ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
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
    check-cast p0, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->className(Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

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

.method public static ۟ۧۢۦ۟()Landroid/app/AlertDialog;
    .locals 2

    invoke-static {}, Landroidx/drawerlayout/ۤۨۡۤ;->ۨۧۢۤ()I

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
    sget-object v0, Lkevin/fun/hook/DexKitFinder;->progressDialog:Landroid/app/AlertDialog;

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

.method public static ۟ۧۦۤۤ()I
    .locals 2

    invoke-static {}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۢۦۥۢ()I

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
    sget v0, Lkevin/fun/hook/DexKitFinder;->taskCounter:I

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

.method public static ۣ۠۟ۥ(Ljava/lang/Object;)Ljava/lang/String;
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
    check-cast p0, Lorg/luckypray/dexkit/result/MethodData;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodData;->getMethodName()Ljava/lang/String;

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

.method public static ۣ۠ۤ()V
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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->dismissProgressDialog()V

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

.method public static ۠ۧۤ()Z
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
    sget-boolean v0, Lkevin/fun/hook/DexKitFinder;->isBackgroundMode:Z

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

.method public static ۡۧ۟۟()V
    .locals 2

    invoke-static {}, Landroidx/core/ۧ۟ۤۨ;->۟ۦ۠ۢ()I

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
    invoke-static {}, Lkevin/fun/hook/DexKitFinder;->triggerGC()V

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

.method public static ۡۨ()Ljava/util/Map;
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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/DexKitFinder;->TASK_NAMES:Ljava/util/Map;

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

.method public static ۢ۠ۨۥ(Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۧۢ۟ۥ()I

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
    check-cast p0, Lkevin/fun/hook/DexKitFinder$SafeFinder;

    invoke-virtual {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->executeBatch2()V

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

.method public static ۢۢ۟ۨ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/ClassDataList;
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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/DexKitBridge;

    check-cast p1, Lorg/luckypray/dexkit/query/FindClass;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->findClass(Lorg/luckypray/dexkit/query/FindClass;)Lorg/luckypray/dexkit/result/ClassDataList;

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

.method public static ۢۦۣۣ(Ljava/lang/Object;)Ljava/lang/Object;
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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/result/ClassDataList;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/ClassDataList;->firstOrNull()Ljava/lang/Object;

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

.method public static ۢۧۡۢ()Landroid/widget/TextView;
    .locals 2

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->۟ۥ۟ۦ۟()I

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
    sget-object v0, Lkevin/fun/hook/DexKitFinder;->progressText:Landroid/widget/TextView;

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

.method public static ۥۡۦ۟(Ljava/lang/Object;)Z
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
    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lkevin/fun/hook/DexKitFinder;->isTargetPackage(Ljava/lang/String;)Z

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

.method public static ۥۧ۟ۢ(Ljava/lang/Object;)V
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
    check-cast p0, Lkevin/fun/hook/DexKitFinder$SafeFinder;

    invoke-virtual {p0}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->executeBatch1()V

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

.method public static ۥۧۢۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
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
    check-cast p0, Lorg/luckypray/dexkit/DexKitBridge;

    check-cast p1, Ljava/lang/ClassLoader;

    check-cast p2, [Ljava/lang/String;

    invoke-static {p0, p1, p2}, Lkevin/fun/hook/DexKitFinder;->findClassByStrings(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;[Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۥۨۦۣ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2

    invoke-static {}, Landroidx/vectordrawable/۟ۤۨۥۣ;->۟ۥۧۨ()I

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
    check-cast p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->usingStrings([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

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

.method public static ۦۣ۟ۤ()Ljava/util/concurrent/atomic/AtomicInteger;
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
    sget-object v0, Lkevin/fun/hook/DexKitFinder;->totalTasks:Ljava/util/concurrent/atomic/AtomicInteger;

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

.method public static ۦ۠ۥ۠()Landroid/widget/ProgressBar;
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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/DexKitFinder;->progressBar:Landroid/widget/ProgressBar;

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

.method public static ۦۥۦۤ()Lorg/luckypray/dexkit/query/FindMethod;
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
    invoke-static {}, Lorg/luckypray/dexkit/query/FindMethod;->create()Lorg/luckypray/dexkit/query/FindMethod;

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

.method public static ۦۨ۟ۢ()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
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
    invoke-static {}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->create()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

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

.method public static ۣۧۦۣ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;
    .locals 2

    invoke-static {}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۤ۠ۧۡ()I

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
    check-cast p0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->addInvoke(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

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

.method public static ۨ۠ۡۡ(Ljava/lang/Object;I)I
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
    check-cast p0, Landroid/content/Context;

    invoke-static {p0, p1}, Lkevin/fun/hook/DexKitFinder;->dp(Landroid/content/Context;I)I

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

.method public static ۣۣۨ۠()Landroid/widget/TextView;
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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/DexKitFinder;->taskNameText:Landroid/widget/TextView;

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

.method public static ۣۨۥ۟(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/result/MethodDataList;
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
    check-cast p0, Lorg/luckypray/dexkit/DexKitBridge;

    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/result/MethodDataList;

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

.method public static ۣۨۤۨ()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;
    .locals 2

    invoke-static {}, Landroidx/loader/ۡۢۢ;->ۢۥۧ۟()I

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
    invoke-static {}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->create()Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

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

.method public static ۨۦ۠ۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
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
    check-cast p0, Lkevin/fun/hook/DexKitFinder$SafeFinder;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Lkevin/fun/hook/DexKitFinder$FinderTask;

    invoke-virtual {p0, p1, p2}, Lkevin/fun/hook/DexKitFinder$SafeFinder;->find(Ljava/lang/String;Lkevin/fun/hook/DexKitFinder$FinderTask;)V

    :sswitch_3
    invoke-static {}, Lorg/luckypray/dexkit/۠۠ۥ;->ۡۥ۠ۦ()I

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
    const-string v0, "sPm"

    invoke-static {v0}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۥۧۨ۠(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۨۨۡۡ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/luckypray/dexkit/query/FindMethod;
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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lorg/luckypray/dexkit/query/FindMethod;

    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;)Lorg/luckypray/dexkit/query/FindMethod;

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
