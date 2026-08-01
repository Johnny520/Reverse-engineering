.class public Lkevin/fun/hook/SparkRenewHelper;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkevin/fun/hook/SparkRenewHelper$SparkInfo;
    }
.end annotation


# static fields
.field private static final AUTO_DELAY_SECONDS:I = 0xf

.field private static final DEFAULT_MESSAGE:Ljava/lang/String;

.field private static final KEY_CONV_NAME_MAP:Ljava/lang/String;

.field private static final KEY_CONV_RENEW_PREFIX:Ljava/lang/String;

.field private static final KEY_CUSTOM_MESSAGE:Ljava/lang/String;

.field private static final KEY_LAST_AUTO_DONE_DATE:Ljava/lang/String;

.field private static final KEY_ONLY_SPARK_FILTER:Ljava/lang/String;

.field private static final KEY_SPARK_CONV_CUSTOM_MSG_PREFIX:Ljava/lang/String;

.field private static final KEY_SPARK_CONV_ENABLE_PREFIX:Ljava/lang/String;

.field private static final KEY_SPARK_CONV_RANDOM_API_PREFIX:Ljava/lang/String;

.field private static final KEY_SPARK_CONV_USE_CUSTOM_PREFIX:Ljava/lang/String;

.field private static final KEY_SPARK_ENABLE:Ljava/lang/String;

.field private static final MAIN_HANDLER:Landroid/os/Handler;

.field private static final PREF_NAME:Ljava/lang/String;

.field private static final RANDOM_API_ABUSE:Ljava/lang/String;

.field private static final RANDOM_API_DOG:Ljava/lang/String;

.field private static final RANDOM_API_FUNNY:Ljava/lang/String;

.field private static final RANDOM_API_JOKE:Ljava/lang/String;

.field private static final RANDOM_API_LOVE:Ljava/lang/String;

.field private static final RANDOM_API_POEM:Ljava/lang/String;

.field private static final RANDOM_API_QUOTE:Ljava/lang/String;

.field private static final RANDOM_API_SOUP:Ljava/lang/String;

.field private static final RANDOM_API_TADY:Ljava/lang/String;

.field private static final TAG:Ljava/lang/String;

.field private static final TAG_CHECKED:I = 0x10000040

.field private static final TAG_VIEW:I = 0x10000041

.field private static final WAIT_SEND_READY_MAX_SECONDS:I = 0x1e

.field private static final WAIT_SPARK_MAX_SECONDS:I = 0x3c

.field private static final allConversations:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap",
            "<",
            "Ljava/lang/String;",
            "Lkevin/fun/hook/SparkRenewHelper$SparkInfo;",
            ">;"
        }
    .end annotation
.end field

.field private static final autoRenewTriggered:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private static classLoader:Ljava/lang/ClassLoader;

.field private static final hooked:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private static hostContext:Landroid/content/Context;

.field private static final imSdkContextInstance:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private static mainHandler:Landroid/os/Handler;

.field private static final myUid:Ljava/util/concurrent/atomic/AtomicLong;

.field private static volatile pendingProfileUid:Ljava/lang/String;

.field private static progressDialog:Landroid/app/ProgressDialog;

.field private static renewProgressBar:Landroid/widget/ProgressBar;

.field private static renewProgressDialog:Landroid/app/AlertDialog;

.field private static renewProgressText:Landroid/widget/TextView;

.field private static renewTaskNameText:Landroid/widget/TextView;

.field private static final sendMsgHandlerInstance:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private static final sendReady:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private static final short:[S

.field private static final sparkConversations:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap",
            "<",
            "Ljava/lang/String;",
            "Lkevin/fun/hook/SparkRenewHelper$SparkInfo;",
            ">;"
        }
    .end annotation
.end field

.field private static final sparkUserNameMap:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap",
            "<",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final templateMessage:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private static final uidNameCache:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const/4 v6, 0x0

    const/4 v4, 0x0

    const/16 v0, 0xb49

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/SparkRenewHelper;->short:[S

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    sget v1, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    xor-int/lit16 v1, v1, 0x22c

    const/16 v2, 0x236

    invoke-static {v0, v4, v1, v2}, Landroidx/activity/ۨ۠۟ۧ;->۟ۡۨۨۧ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/SparkRenewHelper;->DEFAULT_MESSAGE:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/4 v1, 0x2

    sget v2, Landroidx/activity/ۤۧۧۧ;->۟۟ۢ۠ۡ:I

    xor-int/lit16 v2, v2, 0x1f9

    const/16 v3, 0x6b3

    invoke-static {v0, v1, v2, v3}, Landroidx/customview/ۤۡۥ;->۟ۢۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/SparkRenewHelper;->KEY_CONV_NAME_MAP:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x15

    sget v2, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۧۨۨ:I

    xor-int/lit8 v2, v2, -0x74

    const/16 v3, 0x94e

    invoke-static {v0, v1, v2, v3}, Landroidx/drawerlayout/ۤۨۡۤ;->ۤ۠ۤ۠([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/SparkRenewHelper;->KEY_CONV_RENEW_PREFIX:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x26

    sget v2, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    xor-int/lit16 v2, v2, 0x16d

    const/16 v3, 0xb74

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢ۟ۥۨ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/SparkRenewHelper;->KEY_CUSTOM_MESSAGE:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x3a

    sget v2, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۢ۟ۡ:I

    xor-int/lit16 v2, v2, -0x277

    const/16 v3, 0x8c5

    invoke-static {v0, v1, v2, v3}, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۥۧۤ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/SparkRenewHelper;->KEY_LAST_AUTO_DONE_DATE:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x53

    sget v2, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۡۦۥۨ:I

    xor-int/lit16 v2, v2, 0x10f

    const/16 v3, 0x6ed

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟ۡۧۨ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/SparkRenewHelper;->KEY_ONLY_SPARK_FILTER:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x64

    sget v2, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v2, v2, 0x130

    const/16 v3, 0x785

    invoke-static {v0, v1, v2, v3}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۧۢۨۡ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/SparkRenewHelper;->KEY_SPARK_CONV_CUSTOM_MSG_PREFIX:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x7a

    sget v2, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    xor-int/lit16 v2, v2, -0x20e

    const/16 v3, 0x6e4

    invoke-static {v0, v1, v2, v3}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟ۧۢۥ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/SparkRenewHelper;->KEY_SPARK_CONV_ENABLE_PREFIX:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x8c

    sget v2, Landroidx/activity/ۨ۠۟ۧ;->۟ۦۥۢۢ:I

    xor-int/lit16 v2, v2, 0x323

    const/16 v3, 0x447

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۦۣۣۦ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/SparkRenewHelper;->KEY_SPARK_CONV_RANDOM_API_PREFIX:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0xa2

    sget v2, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۥۨ:I

    xor-int/lit16 v2, v2, 0x292

    const/16 v3, 0xa16

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢ۟ۥۨ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/SparkRenewHelper;->KEY_SPARK_CONV_USE_CUSTOM_PREFIX:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0xb8

    sget v2, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    xor-int/lit16 v2, v2, -0x331

    const/16 v3, 0x221

    invoke-static {v0, v1, v2, v3}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦۣ۠ۤ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/SparkRenewHelper;->KEY_SPARK_ENABLE:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0xca

    sget v2, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۨۤۨۡ:I

    xor-int/lit16 v2, v2, -0x3af

    const/16 v3, 0x2c0

    invoke-static {v0, v1, v2, v3}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣ۟۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/SparkRenewHelper;->PREF_NAME:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0xd5

    sget v2, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦۦۤ۟:I

    xor-int/lit16 v2, v2, 0x89

    const/16 v3, 0x14e

    invoke-static {v0, v1, v2, v3}, Landroidx/core/ۧ۟ۤۨ;->ۡۥ۟ۥ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/SparkRenewHelper;->RANDOM_API_ABUSE:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0xda

    sget v2, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣ۠ۧ:I

    xor-int/lit16 v2, v2, -0x1e9

    const/16 v3, 0xbc4

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۢ۠ۥۨ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/SparkRenewHelper;->RANDOM_API_DOG:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0xdd

    sget v2, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    xor-int/lit16 v2, v2, 0x387

    const/16 v3, 0x40d

    invoke-static {v0, v1, v2, v3}, Landroidx/loader/ۣۦ۟ۡ;->ۣ۟ۤ۟ۦ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/SparkRenewHelper;->RANDOM_API_FUNNY:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0xe2

    sget v2, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۨ۠ۧ:I

    xor-int/lit16 v2, v2, -0x1ba

    const/16 v3, 0x3f7

    invoke-static {v0, v1, v2, v3}, Lkevin/fun/hook/۟ۥ۠۠;->ۣۨۢ۟([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/SparkRenewHelper;->RANDOM_API_JOKE:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0xe6

    sget v2, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣۡۢ۟:I

    xor-int/lit16 v2, v2, 0x326

    const/16 v3, 0x617

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۥۡۤۧ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/SparkRenewHelper;->RANDOM_API_LOVE:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0xea

    sget v2, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦۦۤ۟:I

    xor-int/lit16 v2, v2, 0x88

    const/16 v3, 0x6d3

    invoke-static {v0, v1, v2, v3}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟۟۠ۤۤ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/SparkRenewHelper;->RANDOM_API_POEM:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0xee

    sget v2, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/lit16 v2, v2, 0x31a

    const/16 v3, 0x66c

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢۦۤ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/SparkRenewHelper;->RANDOM_API_QUOTE:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0xf3

    sget v2, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/lit16 v2, v2, 0x31b

    const/16 v3, 0xa8a

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟۟۟ۦۢ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/SparkRenewHelper;->RANDOM_API_SOUP:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0xf7

    sget v2, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    xor-int/lit16 v2, v2, 0x309

    const/16 v3, 0xcbf

    invoke-static {v0, v1, v2, v3}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣۣ۟ۤۤ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/SparkRenewHelper;->RANDOM_API_TADY:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0xfb

    sget v2, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۡۦۥۨ:I

    xor-int/lit16 v2, v2, 0x119

    const/16 v3, 0xb96

    invoke-static {v0, v1, v2, v3}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦۣ۠ۤ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/SparkRenewHelper;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lkevin/fun/hook/SparkRenewHelper;->hooked:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lkevin/fun/hook/SparkRenewHelper;->autoRenewTriggered:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lkevin/fun/hook/SparkRenewHelper;->sendReady:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v2, -0x3bf

    sget v1, Landroidx/loader/ۡۢۢ;->ۣۡۦ۟:I

    int-to-long v4, v1

    xor-long/2addr v2, v4

    invoke-direct {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    sput-object v0, Lkevin/fun/hook/SparkRenewHelper;->myUid:Ljava/util/concurrent/atomic/AtomicLong;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lkevin/fun/hook/SparkRenewHelper;->sparkConversations:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lkevin/fun/hook/SparkRenewHelper;->allConversations:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0, v6}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lkevin/fun/hook/SparkRenewHelper;->sendMsgHandlerInstance:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0, v6}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lkevin/fun/hook/SparkRenewHelper;->templateMessage:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0, v6}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lkevin/fun/hook/SparkRenewHelper;->imSdkContextInstance:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lkevin/fun/hook/SparkRenewHelper;->uidNameCache:Ljava/util/concurrent/ConcurrentHashMap;

    sput-object v6, Lkevin/fun/hook/SparkRenewHelper;->pendingProfileUid:Ljava/lang/String;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۧۤۡۨ()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lkevin/fun/hook/SparkRenewHelper;->MAIN_HANDLER:Landroid/os/Handler;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lkevin/fun/hook/SparkRenewHelper;->sparkUserNameMap:Ljava/util/concurrent/ConcurrentHashMap;

    return-void

    nop

    :array_0
    .array-data 2
        -0x25f5s
        -0x20eds
        0x6c0s
        0x6c3s
        0x6d2s
        0x6c1s
        0x6d8s
        0x6ecs
        0x6d0s
        0x6dcs
        0x6dds
        0x6c5s
        0x6ecs
        0x6dds
        0x6d2s
        0x6des
        0x6d6s
        0x6ecs
        0x6des
        0x6d2s
        0x6c3s
        0x93ds
        0x93es
        0x92fs
        0x93cs
        0x925s
        0x911s
        0x92ds
        0x921s
        0x920s
        0x938s
        0x911s
        0x93cs
        0x92bs
        0x920s
        0x92bs
        0x939s
        0x911s
        0xb07s
        0xb04s
        0xb15s
        0xb06s
        0xb1fs
        0xb2bs
        0xb17s
        0xb01s
        0xb07s
        0xb00s
        0xb1bs
        0xb19s
        0xb2bs
        0xb19s
        0xb11s
        0xb07s
        0xb07s
        0xb15s
        0xb13s
        0xb11s
        0x8b6s
        0x8b5s
        0x8a4s
        0x8b7s
        0x8aes
        0x89as
        0x8a9s
        0x8a4s
        0x8b6s
        0x8b1s
        0x89as
        0x8a4s
        0x8b0s
        0x8b1s
        0x8aas
        0x89as
        0x8a1s
        0x8aas
        0x8abs
        0x8a0s
        0x89as
        0x8a1s
        0x8a4s
        0x8b1s
        0x8a0s
        0x69es
        0x69ds
        0x68cs
        0x69fs
        0x686s
        0x6b2s
        0x682s
        0x683s
        0x681s
        0x694s
        0x6b2s
        0x68bs
        0x684s
        0x681s
        0x699s
        0x688s
        0x69fs
        0x7f6s
        0x7f5s
        0x7e4s
        0x7f7s
        0x7ees
        0x7das
        0x7e6s
        0x7eas
        0x7ebs
        0x7f3s
        0x7das
        0x7e6s
        0x7f0s
        0x7f6s
        0x7f1s
        0x7eas
        0x7e8s
        0x7das
        0x7e8s
        0x7f6s
        0x7e2s
        0x7das
        0x697s
        0x694s
        0x685s
        0x696s
        0x68fs
        0x6bbs
        0x687s
        0x68bs
        0x68as
        0x692s
        0x6bbs
        0x681s
        0x68as
        0x685s
        0x686s
        0x688s
        0x681s
        0x6bbs
        0x434s
        0x437s
        0x426s
        0x435s
        0x42cs
        0x418s
        0x424s
        0x428s
        0x429s
        0x431s
        0x418s
        0x435s
        0x426s
        0x429s
        0x423s
        0x428s
        0x42as
        0x418s
        0x426s
        0x437s
        0x42es
        0x418s
        0xa65s
        0xa66s
        0xa77s
        0xa64s
        0xa7ds
        0xa49s
        0xa75s
        0xa79s
        0xa78s
        0xa60s
        0xa49s
        0xa63s
        0xa65s
        0xa73s
        0xa49s
        0xa75s
        0xa63s
        0xa65s
        0xa62s
        0xa79s
        0xa7bs
        0xa49s
        0x252s
        0x251s
        0x240s
        0x253s
        0x24as
        0x27es
        0x253s
        0x244s
        0x24fs
        0x244s
        0x256s
        0x27es
        0x244s
        0x24fs
        0x240s
        0x243s
        0x24ds
        0x244s
        0x2abs
        0x2a5s
        0x2b6s
        0x2a9s
        0x2aes
        0x29fs
        0x2b0s
        0x2b2s
        0x2a5s
        0x2a6s
        0x2b3s
        0x12fs
        0x12cs
        0x13bs
        0x13ds
        0x12bs
        0xba0s
        0xbabs
        0xba3s
        0x46bs
        0x478s
        0x463s
        0x463s
        0x474s
        0x39ds
        0x398s
        0x39cs
        0x392s
        0x67bs
        0x678s
        0x661s
        0x672s
        0x6a3s
        0x6bcs
        0x6b6s
        0x6bes
        0x61ds
        0x619s
        0x603s
        0x618s
        0x609s
        0xaf9s
        0xae5s
        0xaffs
        0xafas
        0xccbs
        0xcdes
        0xcdbs
        0xcc6s
        0x3b86s
        0xbdds
        0xbf3s
        0xbe0s
        0xbffs
        0xbf8s
        0x3b87s
        0xb2as
        0xb28s
        0xb39s
        0xb0es
        0xb22s
        0xb23s
        0xb39s
        0xb28s
        0xb23s
        0xb39s
        0x93bs
        0x934s
        0x937s
        0x936s
        0x93ds
        0x31a3s
        0x1f8s
        0x1d6s
        0x1c5s
        0x1das
        0x1dds
        0x31a2s
        0x193s
        0x62e6s
        -0x7dfcs
        0x6c3bs
        0x61dcs
        0x6b92s
        0x66ccs
        0x5eb1s
        0x5f8bs
        0x189s
        0x1b9s
        0x461s
        0x462s
        0x473s
        0x460s
        0x479s
        0x44ds
        0x471s
        0x47ds
        0x47cs
        0x464s
        0x44ds
        0x471s
        0x467s
        0x461s
        0x466s
        0x47ds
        0x47fs
        0x44ds
        0x47fs
        0x461s
        0x475s
        0x44ds
        0x2d7s
        0x2d4s
        0x2c5s
        0x2d6s
        0x2cfs
        0x2fbs
        0x2c7s
        0x2cbs
        0x2cas
        0x2d2s
        0x2fbs
        0x2d1s
        0x2d7s
        0x2c1s
        0x2fbs
        0x2c7s
        0x2d1s
        0x2d7s
        0x2d0s
        0x2cbs
        0x2c9s
        0x2fbs
        0x2c3as
        0xb80s
        0x60a2s
        0x63c0s
        0x764bs
        -0x7b6fs
        0x2c95s
        -0xbc6s
        0xa15s
        0x55b0s
        0x74d8s
        0x7a5es
        -0x777cs
        0x917s
        0x90bs
        0x906s
        0x978s
        0x962s
        0x6cbas
        0x7c75s
        0x4d7ds
        -0x7646s
        0x22es
        0x223s
        0x25ds
        0x247s
        0x6690s
        0x5fffs
        -0x6f83s
        0x61c8s
        0x85ds
        0x85fs
        0x84es
        0x879s
        0x855s
        0x854s
        0x84cs
        0x85fs
        0x848s
        0x849s
        0x85bs
        0x84es
        0x853s
        0x855s
        0x854s
        0x86es
        0x843s
        0x84as
        0x85fs
        0x65bs
        0x659s
        0x648s
        0x67fs
        0x653s
        0x652s
        0x64as
        0x659s
        0x64es
        0x64fs
        0x65ds
        0x648s
        0x655s
        0x653s
        0x652s
        0x675s
        0x658s
        0x3690s
        0x6cbs
        0x6e5s
        0x6f6s
        0x6e9s
        0x6ees
        0x3691s
        0x6a0s
        0x484es
        0x6a0s
        0x6c4s
        0x6d9s
        0x6c8s
        0x6efs
        0x6efs
        0x6ebs
        0x6aes
        0x6e9s
        0x6f5s
        0x6f3s
        0x6e5s
        0x6f2s
        0x6d5s
        0x6e9s
        0x6e4s
        0x6a0s
        -0x7ac9s
        0x5556s
        0x6a0s
        0x6eds
        0x6f9s
        0x6d5s
        0x6e9s
        0x6e4s
        0x6a0s
        0x5fb1s
        -0x745bs
        0x6bas
        0x6a0s
        0x3c01s
        0xc5as
        0xc74s
        0xc67s
        0xc78s
        0xc7fs
        0x3c00s
        0xc31s
        0xc74s
        0xc69s
        0xc65s
        0xc63s
        0xc70s
        0xc72s
        0xc65s
        0xc5es
        0xc65s
        0xc79s
        0xc74s
        0xc63s
        0xc44s
        0xc78s
        0xc75s
        0xc31s
        0x5313s
        0x5229s
        0xc2bs
        0xc31s
        0x1b1s
        0x1b3s
        0x1a2s
        0x194s
        0x1a4s
        0x1bfs
        0x1b2s
        0x1b1s
        0x1b3s
        0xaacs
        0xaa0s
        0xaa1s
        0xaa1s
        0xaaas
        0xaacs
        0xabbs
        0xa98s
        0xabcs
        0x30bs
        0x30as
        0x325s
        0x314s
        0x314s
        0x321s
        0x30as
        0x310s
        0x301s
        0x316s
        0x322s
        0x30bs
        0x316s
        0x301s
        0x303s
        0x316s
        0x30bs
        0x311s
        0x30as
        0x300s
        0xbfas
        0xbfbs
        0xbc6s
        0xbf0s
        0xbe6s
        0xbe6s
        0xbfcs
        0xbfas
        0xbfbs
        0xbd9s
        0xbfcs
        0xbe6s
        0xbe1s
        0xbc1s
        0xbf4s
        0xbf7s
        0xbc6s
        0xbfds
        0xbfas
        0xbe2s
        0x987s
        0x984s
        0x995s
        0x986s
        0x99fs
        0x9abs
        0x997s
        0x99bs
        0x99as
        0x982s
        0x9abs
        0x997s
        0x981s
        0x987s
        0x980s
        0x99bs
        0x999s
        0x9abs
        0x999s
        0x987s
        0x993s
        0x9abs
        0x23fs
        0x23cs
        0x22ds
        0x23es
        0x227s
        0x213s
        0x22fs
        0x223s
        0x222s
        0x23as
        0x213s
        0x222s
        0x22ds
        0x221s
        0x229s
        0x213s
        0x221s
        0x22ds
        0x23cs
        0x213s
        0x34as
        0x349s
        0x358s
        0x34bs
        0x352s
        0x366s
        0x35as
        0x356s
        0x357s
        0x34fs
        0x366s
        0x34bs
        0x358s
        0x357s
        0x35ds
        0x356s
        0x354s
        0x366s
        0x358s
        0x349s
        0x350s
        0x366s
        0x1e6s
        0x1eds
        0x1e5s
        -0x2f9ds
        -0x2a85s
        0x20bs
        0x208s
        0x219s
        0x20as
        0x213s
        0x227s
        0x21bs
        0x20ds
        0x20bs
        0x20cs
        0x217s
        0x215s
        0x227s
        0x215s
        0x21ds
        0x20bs
        0x20bs
        0x219s
        0x21fs
        0x21ds
        0x67es
        0x648s
        0x643s
        0x649s
        0x660s
        0x65es
        0x64as
        0x665s
        0x64cs
        0x643s
        0x649s
        0x641s
        0x648s
        0x65fs
        0x65es
        0x34a7s
        0x4fcs
        0x4d2s
        0x4c1s
        0x4des
        0x4d9s
        0x34a6s
        0x497s
        0x4fes
        0x4fas
        0x4e4s
        0x4d3s
        0x4dcs
        0x4f4s
        0x4d8s
        0x4d9s
        0x4c3s
        0x4d2s
        0x4cfs
        0x4c3s
        0x4a8ds
        0x7ecds
        -0x445s
        0x4abas
        -0x7bb6s
        0x56acs
        0x5a4ds
        0x497s
        0x4e4s
        0x4d2s
        0x4d9s
        0x4d3s
        0x4fas
        0x4c4s
        0x4d0s
        0x4ffs
        0x4d6s
        0x4d9s
        0x4d3s
        0x4dbs
        0x4d2s
        0x4c5s
        0x361as
        0x641s
        0x66fs
        0x67cs
        0x663s
        0x664s
        0x361bs
        0x62as
        0x618es
        -0x69d6s
        0x62as
        0x659s
        0x66fs
        0x664s
        0x66es
        0x647s
        0x679s
        0x66ds
        0x642s
        0x66bs
        0x664s
        0x66es
        0x666s
        0x66fs
        0x678s
        0x62as
        0x5f3bs
        -0x74d1s
        0x630s
        0x600s
        0x3a63s
        0xa38s
        0xa16s
        0xa05s
        0xa1as
        0xa1ds
        0x3a62s
        0xa53s
        0x5868s
        0x5489s
        0xa3bs
        0xa12s
        0xa1ds
        0xa17s
        0xa1fs
        0xa16s
        0xa01s
        0x5342s
        -0x78aas
        0xa49s
        0xa79s
        0x253s
        0x25cs
        0x25fs
        0x25es
        0x255s
        0x3223s
        0x278s
        0x256s
        0x245s
        0x25as
        0x25ds
        0x3222s
        0x213s
        0x6fbbs
        0x625cs
        0x6812s
        0x654cs
        0x4c09s
        0x7849s
        -0x2c1s
        0x4c3es
        -0x7d32s
        0x5028s
        0x5cc9s
        0x7849s
        0x213s
        0x27es
        0x256s
        0x240s
        0x240s
        0x252s
        0x254s
        0x256s
        -0x2c1s
        0x797as
        0x5db6s
        0x752cs
        0x59ads
        0x213s
        0x27es
        0x256s
        0x240s
        0x240s
        0x252s
        0x254s
        0x256s
        0x213s
        0x6812s
        0x654cs
        0x9e7s
        0x9e4s
        0x9fds
        0x9ees
        0x64a0s
        -0x7048s
        0x805s
        0x800s
        0x804s
        0x80as
        0x7f96s
        -0x70a6s
        0xc22s
        0xc29s
        0xc21s
        -0x7612s
        0x792ds
        0x6b9s
        0x6bds
        0x6a7s
        0x6bcs
        0x6ads
        -0x702fs
        0x5b69s
        0xb66s
        0xb75s
        0xb6es
        0xb6es
        0xb79s
        0x6756s
        0x7859s
        0x755s
        0x74as
        0x740s
        0x748s
        -0x77bbs
        -0x77a1s
        0x608s
        0x614s
        0x60es
        0x60bs
        0x6c8es
        -0x6683s
        0x6b38s
        0xb10s
        0xb05s
        0xb00s
        0xb1ds
        0x5589s
        0x55fds
        0x4805s
        0x708bs
        0x48c5s
        0x5f26s
        0x561s
        0x562s
        0x575s
        0x573s
        0x565s
        0x5472s
        0x5381s
        -0x7ac3s
        -0x7ades
        0x4d48s
        0x76eds
        -0x77d1s
        -0x77e1s
        0x2das
        0x2d9s
        0x2c0s
        0x2d3s
        0x6cbs
        0x6d7s
        0x6d7s
        0x6d3s
        0x6d0s
        0x699s
        0x68cs
        0x68cs
        0x6c2s
        0x6d3s
        0x6cas
        0x68ds
        0x6d0s
        0x6d6s
        0x6das
        0x6c2s
        0x6cds
        0x6d4s
        0x68ds
        0x6c0s
        0x6cds
        0x68cs
        0x6c2s
        0x6d3s
        0x6cas
        0x68cs
        0x6cfs
        0x6ccs
        0x6d5s
        0x6c6s
        0x68ds
        0x6d3s
        0x6cbs
        0x6d3s
        0x491s
        0x494s
        0x490s
        0x49es
        0x959s
        0x945s
        0x945s
        0x941s
        0x942s
        0x90bs
        0x91es
        0x91es
        0x950s
        0x941s
        0x958s
        0x91fs
        0x942s
        0x944s
        0x948s
        0x950s
        0x95fs
        0x946s
        0x91fs
        0x952s
        0x95fs
        0x91es
        0x950s
        0x941s
        0x958s
        0x91es
        0x940s
        0x946s
        0x949s
        0x959s
        0x91fs
        0x941s
        0x959s
        0x941s
        0xcfbs
        0xcf0s
        0xcf8s
        0xbf1s
        0xbeds
        0xbeds
        0xbe9s
        0xbeas
        0xba3s
        0xbb6s
        0xbb6s
        0xbf8s
        0xbe9s
        0xbf0s
        0xbb7s
        0xbeas
        0xbecs
        0xbe0s
        0xbf8s
        0xbf7s
        0xbees
        0xbb7s
        0xbfas
        0xbf7s
        0xbb6s
        0xbf8s
        0xbe9s
        0xbf0s
        0xbb6s
        0xbeds
        0xbf0s
        0xbf8s
        0xbf7s
        0xbfes
        0xbf6s
        0xbecs
        0xbb7s
        0xbe9s
        0xbf1s
        0xbe9s
        0x29bs
        0x29fs
        0x285s
        0x29es
        0x28fs
        0x722s
        0x73es
        0x73es
        0x73as
        0x739s
        0x770s
        0x765s
        0x765s
        0x72bs
        0x73as
        0x723s
        0x764s
        0x739s
        0x73fs
        0x733s
        0x72bs
        0x724s
        0x73ds
        0x764s
        0x729s
        0x724s
        0x765s
        0x72bs
        0x73as
        0x723s
        0x765s
        0x733s
        0x723s
        0x733s
        0x72bs
        0x724s
        0x764s
        0x73as
        0x722s
        0x73as
        0xa00s
        0xa13s
        0xa08s
        0xa08s
        0xa1fs
        0x23ds
        0x221s
        0x221s
        0x225s
        0x226s
        0x26fs
        0x27as
        0x27as
        0x234s
        0x225s
        0x23cs
        0x27bs
        0x226s
        0x220s
        0x22cs
        0x234s
        0x23bs
        0x222s
        0x27bs
        0x236s
        0x23bs
        0x27as
        0x234s
        0x225s
        0x23cs
        0x27as
        0x232s
        0x234s
        0x23as
        0x22ds
        0x23cs
        0x234s
        0x23as
        0x27bs
        0x225s
        0x23ds
        0x225s
        0x972s
        0x96ds
        0x967s
        0x96fs
        0x250s
        0x24cs
        0x24cs
        0x248s
        0x24bs
        0x202s
        0x217s
        0x217s
        0x259s
        0x248s
        0x251s
        0x216s
        0x24bs
        0x24ds
        0x241s
        0x259s
        0x256s
        0x24fs
        0x216s
        0x25bs
        0x256s
        0x217s
        0x259s
        0x248s
        0x251s
        0x217s
        0x25fs
        0x24ds
        0x24bs
        0x250s
        0x251s
        0x216s
        0x248s
        0x250s
        0x248s
        0x64as
        0x656s
        0x64cs
        0x649s
        0xc29s
        0xc35s
        0xc35s
        0xc31s
        0xc32s
        0xc7bs
        0xc6es
        0xc6es
        0xc20s
        0xc31s
        0xc28s
        0xc6fs
        0xc32s
        0xc34s
        0xc38s
        0xc20s
        0xc2fs
        0xc36s
        0xc6fs
        0xc22s
        0xc2fs
        0xc6es
        0xc20s
        0xc31s
        0xc28s
        0xc6es
        0xc25s
        0xc2bs
        0xc35s
        0xc6fs
        0xc31s
        0xc29s
        0xc31s
        0x185s
        0x190s
        0x195s
        0x188s
        0x4a3s
        0x4bfs
        0x4bfs
        0x4bbs
        0x4b8s
        0x4f1s
        0x4e4s
        0x4e4s
        0x4aas
        0x4bbs
        0x4a2s
        0x4e5s
        0x4b8s
        0x4bes
        0x4b2s
        0x4aas
        0x4a5s
        0x4bcs
        0x4e5s
        0x4a8s
        0x4a5s
        0x4e4s
        0x4aas
        0x4bbs
        0x4a2s
        0x4e4s
        0x4a7s
        0x4a2s
        0x4b8s
        0x4a3s
        0x4a2s
        0x4e5s
        0x4bbs
        0x4a3s
        0x4bbs
        0x5fds
        0x5fes
        0x5e9s
        0x5efs
        0x5f9s
        0x6acs
        0x6b0s
        0x6b0s
        0x6b4s
        0x6b7s
        0x6fes
        0x6ebs
        0x6ebs
        0x6a5s
        0x6b4s
        0x6ads
        0x6eas
        0x6b7s
        0x6b1s
        0x6bds
        0x6a5s
        0x6aas
        0x6b3s
        0x6eas
        0x6a7s
        0x6aas
        0x6ebs
        0x6a5s
        0x6b4s
        0x6ads
        0x6ebs
        0x696s
        0x6ads
        0x6a0s
        0x6ads
        0x6a7s
        0x6b1s
        0x6a8s
        0x6a1s
        0x6eas
        0x6b4s
        0x6acs
        0x6b4s
        0xbd3s
        0xbcfs
        0xbcfs
        0xbcbs
        0xbc8s
        0xb81s
        0xb94s
        0xb94s
        0xbdas
        0xbcbs
        0xbd2s
        0xb95s
        0xbc8s
        0xbces
        0xbc2s
        0xbdas
        0xbd5s
        0xbccs
        0xb95s
        0xbd8s
        0xbd5s
        0xb94s
        0xbdas
        0xbcbs
        0xbd2s
        0xb94s
        0xbc9s
        0xbc8s
        0xbd3s
        0xbc2s
        0xb95s
        0xbcbs
        0xbd3s
        0xbcbs
        -0x2b04s
        -0x2e1cs
        0xb27s
        0xb25s
        0xb34s
        0x37as
        0x35cs
        0x34as
        0x35ds
        0x302s
        0x36es
        0x348s
        0x34as
        0x341s
        0x35bs
        0x60ds
        0x62fs
        0x63as
        0x629s
        0x62cs
        0x62cs
        0x621s
        0x66fs
        0x675s
        0x66es
        0x670s
        0x3655s
        0x60es
        0x620s
        0x633s
        0x62cs
        0x62bs
        0x3654s
        0x665s
        -0x6f36s
        0x617fs
        0x63c2s
        0x6e0ds
        0x65e0s
        0x55a6s
        0x5288s
        0x58d1s
        0x5947s
        0x587ds
        0x665s
        0x631s
        0x63cs
        0x635s
        0x620s
        0x678s
        0xbdfs
        0xb9cs
        0xb90s
        0xb9bs
        0xb9as
        0xbc2s
        0xc9cs
        0xc9ds
        0xc8fs
        0xce4s
        0xcf1s
        0x3b49s
        0xb12s
        0xb3cs
        0xb2fs
        0xb30s
        0xb37s
        0x3b48s
        0xb79s
        -0x622as
        0x6c63s
        0x6edes
        0x6311s
        0x4563s
        0x7123s
        0xb79s
        0xb2ds
        0xb20s
        0xb29s
        0xb3cs
        0xb64s
        0x3642s
        0x619s
        0x637s
        0x624s
        0x63bs
        0x63cs
        0x3643s
        0x672s
        -0x7a1bs
        0x5584s
        -0x6f23s
        0x6168s
        0x63d5s
        0x6e1as
        0x5f63s
        -0x7489s
        0x668s
        0x658s
        0x1f6s
        0x1f6s
        0x1f6s
        0x1f6s
        0x1a2s
        0x1c2s
        0x1c2s
        0x1a2s
        0x1ebs
        0x1ebs
        0xbb1s
        0xbb2s
        0xba3s
        0xbb0s
        0xba9s
        0xb9ds
        0xba1s
        0xbads
        0xbacs
        0xbb4s
        0xb9ds
        0xbb0s
        0xba7s
        0xbacs
        0xba7s
        0xbb5s
        0xb9ds
        0xc60s
        0xc63s
        0xc72s
        0xc61s
        0xc78s
        0xc4cs
        0xc70s
        0xc7cs
        0xc7ds
        0xc65s
        0xc4cs
        0xc76s
        0xc7ds
        0xc72s
        0xc71s
        0xc7fs
        0xc76s
        0xc4cs
        0x8abs
        0x8a8s
        0x8b9s
        0x8aas
        0x8b3s
        0x887s
        0x8aas
        0x8bds
        0x8b6s
        0x8bds
        0x8afs
        0x887s
        0x8bds
        0x8b6s
        0x8b9s
        0x8bas
        0x8b4s
        0x8bds
        0x9das
        0x9d9s
        0x9c8s
        0x9dbs
        0x9c2s
        0x9f6s
        0x9c6s
        0x9c7s
        0x9c5s
        0x9d0s
        0x9f6s
        0x9cfs
        0x9c0s
        0x9c5s
        0x9dds
        0x9ccs
        0x9dbs
        0x4cds
        0x4ces
        0x4dfs
        0x4ccs
        0x4d5s
        0x4e1s
        0x4dds
        0x4d1s
        0x4d0s
        0x4c8s
        0x4e1s
        0x4cbs
        0x4cds
        0x4dbs
        0x4e1s
        0x4dds
        0x4cbs
        0x4cds
        0x4cas
        0x4d1s
        0x4d3s
        0x4e1s
        0x5573s
        0x68e3s
        0x518cs
        -0x61f2s
        0x6fbbs
        0x6d06s
        0x60c9s
        0x5731s
        0x5d0ds
        0x48b9s
        -0x79b7s
        0x488es
        0x7cces
        0x5f46s
        0x4d69s
        0x59ecs
        -0x7ca2s
        0x592es
        0x4cfds
        0x5331s
        0x590ds
        0x2e4as
        0x2ecbs
        -0x99cs
        0x772es
        0x79a8s
        -0x748es
        0x524fs
        0x6bd3s
        0x7c77s
        0x72f1s
        -0x7fd5s
        0x5babs
        -0x7041s
        0x6409s
        0x71fds
        -0x69b5s
        0x489es
        0x712s
        0x711s
        0x700s
        0x713s
        0x70as
        0x73es
        0x713s
        0x704s
        0x70fs
        0x704s
        0x716s
        0x73es
        0x704s
        0x70fs
        0x700s
        0x703s
        0x70ds
        0x704s
        -0x2fb7s
        -0x2aafs
        0x5ff0s
        0x61ees
        0x6158s
        -0x7a3bs
        0x55a4s
        0x5442s
        0x7619s
        -0x7b3ds
        0x5f0fs
        0x55b9s
        -0x682s
        0x559ds
        0x4897s
        0x6439s
        0x54das
        0x6421s
        0x5972s
        0x4872s
        0x4858s
        0x7fb3s
        -0x79c8s
        0x5d8bs
        -0x7251s
        -0x682s
        0x57ffs
        -0x765as
        0x50acs
        -0x7655s
        -0x6842s
        0x6197s
        0x7179s
        0x3670s
        0x656s
        0x64bs
        0x656s
        0x656s
        0x641s
        0x64es
        0x614s
        0x614s
        0x617s
        0x61ds
        0x61fs
        0x60as
        0x60as
        0x650s
        0x656s
        0x640s
        0x657s
        0x60as
        0x655s
        0x657s
        0x64as
        0x643s
        0x64cs
        0x649s
        0x640s
        0x60as
        0xafcs
        0xaf3s
        0xaf9s
        0xaefs
        0xaf2s
        0xaf4s
        0xaf9s
        0xab3s
        0xaf4s
        0xaf3s
        0xae9s
        0xaf8s
        0xaf3s
        0xae9s
        0xab3s
        0xafcs
        0xafes
        0xae9s
        0xaf4s
        0xaf2s
        0xaf3s
        0xab3s
        0xacbs
        0xad4s
        0xad8s
        0xacas
        0x2b7s
        0x2bbs
        0x2b9s
        0x2fas
        0x2a7s
        0x2a7s
        0x2fas
        0x2b5s
        0x2bas
        0x2b0s
        0x2a6s
        0x2bbs
        0x2bds
        0x2b0s
        0x2fas
        0x2a1s
        0x2b3s
        0x2b7s
        0x2fas
        0x2b5s
        0x2a3s
        0x2b1s
        0x2b9s
        0x2b1s
        0x32d4s
        0x28fs
        0x2a1s
        0x2b2s
        0x2ads
        0x2aas
        0x32d5s
        -0x6d22s
        -0x72fds
        0x291s
        0x28ds
        0x280s
        0x6097s
        0x5dc4s
        0x4cffs
        -0x654fs
        0x5bf5s
        -0x701fs
        0x2fes
        0x2e4s
        0x6009s
        0x693cs
        0x67bas
        0x5ae9s
        0x70c1s
        0x67des
        0x4bd2s
        -0x6264s
        -0x7d53s
        0x58dds
        0x4d0es
        0x66c0s
        0x6b0fs
        -0x6ef9s
        0x60b2s
        0x620fs
        0x6fc0s
        0x7488s
        0x5f78s
        -0x817s
        0x3c9s
        0x3cas
        0x3dbs
        0x3c8s
        0x3d1s
        0x3e5s
        0x3d6s
        0x3dbs
        0x3c9s
        0x3ces
        0x3e5s
        0x3dbs
        0x3cfs
        0x3ces
        0x3d5s
        0x3e5s
        0x3des
        0x3d5s
        0x3d4s
        0x3dfs
        0x3e5s
        0x3des
        0x3dbs
        0x3ces
        0x3dfs
        0x33fs
        0x31cs
        0x30ds
        0x31es
        0x307s
        0x33es
        0x309s
        0x302s
        0x309s
        0x31bs
        0xadds
        0x259s
        0x1a3s
        0x1a1s
        0x1b0s
        0x187s
        0x1abs
        0x1aas
        0x1b2s
        0x1a1s
        0x1b6s
        0x1b7s
        0x1a5s
        0x1b0s
        0x1ads
        0x1abs
        0x1aas
        0x190s
        0x1bds
        0x1b4s
        0x1a1s
        0x40ds
        0x40fs
        0x41es
        0x429s
        0x405s
        0x404s
        0x41cs
        0x40fs
        0x418s
        0x419s
        0x40bs
        0x41es
        0x403s
        0x405s
        0x404s
        0x423s
        0x40es
        0x437s
        0x42cs
        0x435s
        0x435s
        0x44es
        0x44cs
        0x45ds
        0x46as
        0x446s
        0x447s
        0x45fs
        0x44cs
        0x45bs
        0x45as
        0x448s
        0x45ds
        0x440s
        0x446s
        0x447s
        0x47as
        0x441s
        0x446s
        0x45bs
        0x45ds
        0x460s
        0x44ds
        0x5a5s
        0x5a7s
        0x5b6s
        0x587s
        0x5bas
        0x5b6s
        0xb08s
        0xb53s
        0xb0as
        0xb06s
        0xb07s
        0xb1as
        0xb0cs
        0xb0as
        0xb1cs
        0xb1ds
        0xb00s
        0xb1fs
        0xb0cs
        0xb36s
        0xb0as
        0xb01s
        0xb08s
        0xb1ds
        0xb36s
        0xb0ds
        0xb08s
        0xb1ds
        0xb08s
        0x3das
        0x3d0s
        0x3dds
        0x3d1s
        0x3d9s
        0x3e3s
        0x3d5s
        0x3d2s
        0x3das
        0x3d3s
        0x3cfs
        0x613s
        0x614s
        0x601s
        0x612s
        0x614s
        0xbfds
        0xbf6s
        0xbfcs
        0x3cbs
        0x3ccs
        0x3d9s
        0x3ccs
        0x3dds
        0x1e2s
        0x1e7s
        0x1ffs
        0x1f5s
        0x90es
        0x91fs
        0x902s
        0x90es
        0x3265s
        0x23es
        0x210s
        0x203s
        0x21cs
        0x21bs
        0x3264s
        0x255s
        0x205s
        0x207s
        0x21as
        0x216s
        0x210s
        0x206s
        0x206s
        0x236s
        0x21as
        0x21bs
        0x203s
        0x210s
        0x207s
        0x206s
        0x214s
        0x201s
        0x21cs
        0x21as
        0x21bs
        0x226s
        0x205s
        0x214s
        0x207s
        0x21es
        0x5d77s
        0x5c4ds
        0x24fs
        0x27fs
        0x3375s
        0x32es
        0x300s
        0x313s
        0x30cs
        0x30bs
        0x3374s
        0x345s
        0x782cs
        0x5ce0s
        -0x7120s
        0x6693s
        -0x397s
        0x644fs
        0x6653s
        -0x6a5ds
        0x5155s
        0x730es
        -0x7e2cs
        0x6615s
        0x600bs
        0x6b5bs
        0x6947s
        -0x6549s
        0x5e41s
        0x7c1as
        -0x7140s
        0x6901s
        0x6f1fs
        0xc7bs
        0x427as
        0x6750s
        0x585es
        0x5ed9s
        0x436bs
        -0x6244s
        0x69c1s
        0x506cs
        -0x785cs
        0xbb7s
        0xbb4s
        0xba5s
        0xbb6s
        0xbafs
        0xb9bs
        0xba8s
        0xba5s
        0xbb7s
        0xbb0s
        0xb9bs
        0xba5s
        0xbb1s
        0xbb0s
        0xbabs
        0xb9bs
        0xba0s
        0xbabs
        0xbaas
        0xba1s
        0xb9bs
        0xba0s
        0xba5s
        0xbb0s
        0xba1s
        0x6845s
        0x6d0cs
        0x7a6es
        -0x774cs
        0x44cfs
        0x532cs
        0x57f7s
        0x5301s
        0x7e03s
        -0x7a3es
        0x3c76s
        0xc2ds
        0xc03s
        0xc10s
        0xc0fs
        0xc08s
        0x3c77s
        0xc46s
        0x5fb7s
        -0x6399s
        0x645es
        0x53a5s
        0x6b4cs
        0x5057s
        0x728cs
        -0xc96s
        0x5fb0s
        0x61ees
        -0x7274s
        0x5eces
        0x728bs
        0x7c0ds
        -0x7129s
        0x5239s
        -0x6e17s
        0x69d0s
        0x5e2bs
        0x66c2s
        0x5dd9s
        0x7f02s
        0x1e2s
        0x5207s
        0x4f0ds
        0x50a0s
        0x63a3s
        0x5340s
        0x5239s
        0x4fe8s
        0x6689s
        0x7829s
        0x4e09s
        0x6e28s
        0x6cd3s
        0x55e6s
        0x5065s
        -0x75c3s
        0x326ds
        0x236s
        0x218s
        0x20bs
        0x214s
        0x213s
        0x326cs
        0x25ds
        0x51acs
        -0x6d84s
        0x6a45s
        0x5dbes
        0x4c50s
        -0x6d97s
        0x5b4cs
        0x6735s
        -0x28fs
        0x5221s
        0x691fs
        0x7c90s
        0x7216s
        -0x7f34s
        0x78bas
        0x763cs
        -0x7b1as
        0x5ddbs
        0x6447s
        0x65ds
        0x65ds
        0x666cs
        0x5726s
        -0x6b3s
        0xb74s
        0x696es
        0x59e1s
        -0xb9cs
        0x2ces
        0x5bf5s
        -0x701fs
        -0x222s
        0xcaas
        0x6ea5s
        0x52ees
        0x7b2bs
        0x7eeas
        0x5e6s
        0x24as
        0x4c40s
        0x3572s
        0x529s
        0x507s
        0x514s
        0x50bs
        0x50cs
        0x3573s
        0x542s
        0x7b8fs
        0x7509s
        -0x782ds
        0x5c53s
        -0x77b9s
        0x542s
        0x537s
        0x52bs
        0x526s
        0x55fs
        0x3eas
        0x5ae3s
        0x66bas
        0x3f7s
        0x593bs
        0x5f45s
        0x66d9s
        0x4e9s
        0x911s
        0x6b21s
        0x5baes
        0x90cs
        0x267s
        0x5b76s
        -0x709es
        0x27as
        0x344cs
        0x417s
        0x439s
        0x42as
        0x435s
        0x432s
        0x344ds
        0x47cs
        -0x7a4as
        0x56f4s
        0x7ab1s
        0x7437s
        -0x7913s
        0x5b5es
        0x5a64s
        0x466s
        0x47cs
        0x779cs
        0x791as
        -0x7440s
        0x5673s
        0x5749s
        0x94bs
        0x951s
        -0x2db9s
        -0x28a1s
        0x2d6s
        0x2d5s
        0x2c4s
        0x2d7s
        0x2ces
        0x2fas
        0x2c6s
        0x2d0s
        0x2d6s
        0x2d1s
        0x2cas
        0x2c8s
        0x2fas
        0x2c8s
        0x2c0s
        0x2d6s
        0x2d6s
        0x2c4s
        0x2c2s
        0x2c0s
        0x2b1s
        0x2b2s
        0x2a3s
        0x2b0s
        0x2a9s
        0x29ds
        0x2a1s
        0x2ads
        0x2acs
        0x2b4s
        0x29ds
        0x2b0s
        0x2a7s
        0x2acs
        0x2a7s
        0x2b5s
        0x29ds
        0x21as
        0x212s
        0x204s
        0x204s
        0x216s
        0x210s
        0x212s
        0x208s
        0x204s
        0x212s
        0x203s
        0x208s
        0x21bs
        0x218s
        0x214s
        0x216s
        0x21bs
        0x208s
        0x21as
        0x212s
        0x203s
        0x21fs
        0x218s
        0x213s
        0x3b56s
        0xb0ds
        0xb23s
        0xb30s
        0xb2fs
        0xb28s
        0x3b57s
        0xb66s
        0xb2fs
        0xb2bs
        0xb15s
        0xb22s
        0xb2ds
        0xb05s
        0xb29s
        0xb28s
        0xb32s
        0xb23s
        0xb3es
        0xb32s
        0x457cs
        0x713cs
        -0xbb6s
        0x5890s
        0x66ces
        0x5897s
        -0x64b9s
        0x632s
        0x624s
        0x635s
        0x612s
        0x624s
        0x62fs
        0x625s
        0x624s
        0x633s
        0x5e4s
        0x5f2s
        0x5e3s
        0x5d4s
        0x5f8s
        0x5f9s
        0x5e1s
        0x5f2s
        0x5e5s
        0x5e4s
        0x5f6s
        0x5e3s
        0x5fes
        0x5f8s
        0x5f9s
        0x5des
        0x5f3s
        0x6d8s
        0x6ces
        0x6dfs
        0x6e8s
        0x6c4s
        0x6c5s
        0x6dds
        0x6ces
        0x6d9s
        0x6d8s
        0x6cas
        0x6dfs
        0x6c2s
        0x6c4s
        0x6c5s
        0x6f8s
        0x6c3s
        0x6c4s
        0x6d9s
        0x6dfs
        0x6e2s
        0x6cfs
        0x873s
        0x865s
        0x874s
        0x843s
        0x86fs
        0x86es
        0x876s
        0x865s
        0x872s
        0x873s
        0x861s
        0x874s
        0x869s
        0x86fs
        0x86es
        0x854s
        0x879s
        0x870s
        0x865s
        0x1b1s
        0x1a7s
        0x1b6s
        0x18fs
        0x1b1s
        0x1a5s
        0x196s
        0x1bbs
        0x1b2s
        0x1a7s
        0x9abs
        0x9bds
        0x9acs
        0x98ds
        0x9ads
        0x9b1s
        0x9bcs
        0x519s
        0x50fs
        0x51es
        0x527s
        0x519s
        0x50ds
        0x523s
        0x50es
        0xa93s
        0xa85s
        0xa94s
        0xaa3s
        0xa92s
        0xa85s
        0xa81s
        0xa94s
        0xa85s
        0xa84s
        0xaa1s
        0xa94s
        0x872s
        0x870s
        0x861s
        0x859s
        0x87as
        0x876s
        0x874s
        0x879s
        0x850s
        0x86ds
        0x861s
        0xcf9s
        0xcb0s
        0xcfds
        0xcebs
        0xce3s
        0xcfes
        0xcd5s
        0xcecs
        0xce5s
        0xcf8s
        0xcd5s
        0xcf9s
        0xcefs
        0xce4s
        0xcees
        0x3fes
        0x3f3s
        0x3fas
        0x3efs
        0x18fs
        0x188s
        0x195s
        0x192s
        0x194s
        0x193s
        0x185s
        0x192s
        0x18fs
        0x189s
        0x188s
        0x1b9s
        0x192s
        0x19fs
        0x196s
        0x183s
        0x2fbs
        0x2e6s
        0x2f7s
        0x2ffs
        0x2cds
        0x2e6s
        0x2ebs
        0x2e2s
        0x2f7s
        0x2cds
        0x2fes
        0x2fds
        0x2f1s
        0x2f3s
        0x2fes
        0x1c8s
        0x1d9s
        0x1c4s
        0x1c8s
        0xaf5s
        0xae4s
        0xaf3s
        0xaf7s
        0xae2s
        0xaf3s
        0xaf2s
        0xad7s
        0xae2s
        0xcffs
        0xce5s
        0xcc9s
        0xcf5s
        0xcf7s
        0xce4s
        0xcf2s
        0x45ds
        0x443s
        0x457s
        0x478s
        0x459s
        0x45es
        0x444s
        0x3f8s
        0x3ees
        0x3fcs
        0x3cds
        0x3e0s
        0x3e9s
        0x3fcs
        0x13ds
        0x12bs
        0x13as
        0x10ds
        0x121s
        0x120s
        0x13as
        0x12bs
        0x120s
        0x13as
        0x8afs
        0x899s
        0x892s
        0x898s
        0x8b1s
        0x88fs
        0x89bs
        0x8b4s
        0x89ds
        0x892s
        0x898s
        0x890s
        0x899s
        0x88es
        0xb4ds
        0xb65s
        0xb73s
        0xb73s
        0xb61s
        0xb67s
        0xb65s
        0x7fes
        0x7e5s
        0x7d2s
        0x7c6s
        0x7c2s
        0x7d2s
        0x7c4s
        0x7c3s
        0x7fbs
        0x7des
        0x7c4s
        0x7c3s
        0x7d2s
        0x7d9s
        0x7d2s
        0x7c5s
        0x3265s
        0x23es
        0x210s
        0x203s
        0x21cs
        0x21bs
        0x3264s
        0x255s
        0x2539s
        0x255s
        0x655fs
        0x600bs
        0x5045s
        0x5309s
        0x59ccs
        0x74f1s
        0x255s
        0x206s
        0x210s
        0x21bs
        0x211s
        0x255s
        0x67ccs
        0x6ea0s
        0x3479s
        0x422s
        0x40cs
        0x41fs
        0x400s
        0x407s
        0x3478s
        0x449s
        0x2325s
        0x449s
        0x4a64s
        0x6146s
        0x6768s
        0x72eds
        0x57abs
        0x6119s
        0x4a43s
        0x6119s
        0x453s
        0x449s
        0x375fs
        0x704s
        0x72as
        0x739s
        0x726s
        0x721s
        0x375es
        0x76fs
        0x2003s
        0x76fs
        0x549es
        -0x68b2s
        0x7724s
        -0x7a02s
        0x584ds
        0x5977s
        0x775s
        0x745s
        0x3a06s
        0xa5ds
        0xa73s
        0xa60s
        0xa7fs
        0xa78s
        0x3a07s
        0xa36s
        0x7d09s
        0x5188s
        0x59c7s
        -0x65e9s
        0x5514s
        0x542es
        0xa36s
        0xa75s
        0xa77s
        0xa63s
        0xa65s
        0xa73s
        0xa2cs
        0xa1cs
        0x3b7fs
        0xb24s
        0xb0as
        0xb19s
        0xb06s
        0xb01s
        0x3b7es
        0xb4fs
        0x58bes
        -0x6492s
        0x6357s
        0x54acs
        0x7455s
        0x525es
        -0xb9ds
        0x6e8fs
        0x67bas
        0x7582s
        0x7b04s
        -0x7622s
        0xb4fs
        0xb07s
        0xb0es
        0xb01s
        0xb0bs
        0xb03s
        0xb0as
        0xb1ds
        0xb52s
        0x3b3s
        0x3fes
        0x3e0s
        0x3f4s
        0x3aes
        0x9f8s
        0x9fbs
        0x9eas
        0x9f9s
        0x9e0s
        0x9d4s
        0x9e8s
        0x9e4s
        0x9e5s
        0x9fds
        0x9d4s
        0x9e8s
        0x9fes
        0x9f8s
        0x9ffs
        0x9e4s
        0x9e6s
        0x9d4s
        0x9e6s
        0x9f8s
        0x9ecs
        0x9d4s
        0x5c7s
        0x5c4s
        0x5d5s
        0x5c6s
        0x5dfs
        0x5ebs
        0x5d7s
        0x5dbs
        0x5das
        0x5c2s
        0x5ebs
        0x5d1s
        0x5das
        0x5d5s
        0x5d6s
        0x5d8s
        0x5d1s
        0x5ebs
        0x55as
        0x559s
        0x548s
        0x55bs
        0x542s
        0x576s
        0x54as
        0x546s
        0x547s
        0x55fs
        0x576s
        0x55bs
        0x548s
        0x547s
        0x54ds
        0x546s
        0x544s
        0x576s
        0x548s
        0x559s
        0x540s
        0x576s
        0xb0fs
        0xb0cs
        0xb1ds
        0xb0es
        0xb17s
        0xb23s
        0xb13s
        0xb12s
        0xb10s
        0xb05s
        0xb23s
        0xb1as
        0xb15s
        0xb10s
        0xb08s
        0xb19s
        0xb0es
        0xaa8s
        0xaabs
        0xabas
        0xaa9s
        0xab0s
        0xa84s
        0xab8s
        0xab4s
        0xab5s
        0xaads
        0xa84s
        0xaaes
        0xaa8s
        0xabes
        0xa84s
        0xab8s
        0xaaes
        0xaa8s
        0xaafs
        0xab4s
        0xab6s
        0xa84s
        -0x7135s
        0x503ds
        -0x7f4es
        0x5ac2s
        0x4f11s
        0x50dds
        0x5ae1s
        -0x77fas
        0x7cd6s
        -0x7daes
        0x5822s
        0x4df1s
        0x523ds
        0x5801s
        0x5477s
        0x6a29s
        0x4b46s
        0x5fc3s
        0x3228s
        0x273s
        0x25ds
        0x24es
        0x251s
        0x256s
        0x3229s
        0x218s
        0x24bs
        0x250s
        0x257s
        0x24fs
        0x27bs
        0x257s
        0x256s
        0x24es
        0x25ds
        0x24as
        0x24bs
        0x259s
        0x24cs
        0x251s
        0x257s
        0x256s
        0x27bs
        0x24ds
        0x24bs
        0x24cs
        0x257s
        0x255s
        0x275s
        0x24bs
        0x25fs
        0x27cs
        0x251s
        0x259s
        0x254s
        0x257s
        0x25fs
        0x5d3as
        0x5c00s
        0x202s
        0x232s
        0x6979s
        -0x7d9fs
        0x78dds
        -0x77efs
        -0x76efs
        0x79d2s
        -0x759ds
        0x5edbs
        0x6ff8s
        0x70f7s
        -0x71a9s
        -0x71b3s
        0x6770s
        -0x6d7ds
        0x60c6s
        0x5b62s
        0x5b16s
        0x46ees
        0x7e60s
        0x462es
        0x51cds
        0x5aabs
        0x5d58s
        -0x741cs
        -0x7405s
        0x860s
        0x863s
        0x87as
        0x869s
        0xad2s
        0xad7s
        0xad3s
        0xadds
        0x7cas
        0x7c1s
        0x7c9s
        0x712s
        0x716s
        0x70cs
        0x717s
        0x706s
        0x4f1s
        0x4e2s
        0x4f9s
        0x4f9s
        0x4ees
        0x952s
        0x94ds
        0x947s
        0x94fs
        0x696s
        0x68as
        0x690s
        0x695s
        0x6d9s
        0x6ccs
        0x6c9s
        0x6d4s
        0x327s
        0x324s
        0x333s
        0x335s
        0x323s
        -0x6ac6s
        0x67das
        -0x6c44s
        0x6209s
        0x60b4s
        0x6d7bs
        0x7948s
        0x52b8s
        0x566as
        0x6834s
        0x7df9s
        0x5e0ds
        0x3813s
        0x848s
        0x866s
        0x875s
        0x86as
        0x86ds
        0x3812s
        0x823s
        0x870s
        0x86bs
        0x86cs
        0x874s
        0x851s
        0x862s
        0x86ds
        0x867s
        0x86cs
        0x86es
        0x842s
        0x873s
        0x86as
        0x850s
        0x866s
        0x86fs
        0x866s
        0x860s
        0x877s
        0x847s
        0x86as
        0x862s
        0x86fs
        0x86cs
        0x864s
        0x5701s
        0x563bs
        0x839s
        0x809s
        0x7429s
        -0x790ds
        0x5d3fs
        0x5789s
        0x5f32s
        0x66aes
        -0x7476s
        0x58c8s
        0x748ds
        0x7a0bs
        -0x772fs
        0x9a8s
        0x9abs
        0x9bas
        0x9a9s
        0x9b0s
        0x984s
        0x9a9s
        0x9bes
        0x9b5s
        0x9bes
        0x9acs
        0x984s
        0x9bes
        0x9b5s
        0x9bas
        0x9b9s
        0x9b7s
        0x9bes
        0x42b3s
        0x6a48s
        0x754cs
        0x7c1ds
        -0x7139s
        0x578fs
        -0x7855s
        0x72das
        0x5398s
        -0x6b14s
        0x6559s
        0x67e4s
        0x6a2bs
        0x518cs
        0x5064s
        0x6101s
        -0x7c77s
        0x59f9s
        0x4c2as
        0x53e6s
        0x59das
        0x365cs
        0x607s
        0x629s
        0x63as
        0x625s
        0x622s
        0x365ds
        0x66cs
        0x63fs
        0x624s
        0x623s
        0x63bs
        0x61fs
        0x63cs
        0x62ds
        0x63es
        0x627s
        0x601s
        0x62ds
        0x622s
        0x62ds
        0x62bs
        0x629s
        0x608s
        0x625s
        0x62ds
        0x620s
        0x623s
        0x62bs
        0x594es
        0x5874s
        0x676s
        0x646s
        0x2473s
        0x5d6ds
        0xc3cs
        0xc39s
        0xc78s
        0xc3cs
        0x4351s
        0x7c77s
        -0x7153s
        0x5561s
        0x5fd7s
        0xc3cs
        0xcabs
        0xc3cs
        0xc39s
        0xc78s
        0xc3cs
        0x4236s
        0x5399s
        0x72f1s
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
    const-string v0, "pjYTUmlXpb7WbpcSj6ul5jNL6ecI"

    invoke-static {v0}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۦۣۣۧ(Ljava/lang/String;)Ljava/lang/String;

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

.method static bridge synthetic _$$Nest$sfgetrenewProgressBar()Landroid/widget/ProgressBar;
    .locals 1

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۥۦۦۦ()Landroid/widget/ProgressBar;

    move-result-object v0

    return-object v0
.end method

.method static bridge synthetic _$$Nest$sfgetrenewProgressDialog()Landroid/app/AlertDialog;
    .locals 1

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۢۢۨ()Landroid/app/AlertDialog;

    move-result-object v0

    return-object v0
.end method

.method static bridge synthetic _$$Nest$sfgetrenewProgressText()Landroid/widget/TextView;
    .locals 1

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۦۧۥۨ()Landroid/widget/TextView;

    move-result-object v0

    return-object v0
.end method

.method static bridge synthetic _$$Nest$sfgetrenewTaskNameText()Landroid/widget/TextView;
    .locals 1

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۢۨۦۨ()Landroid/widget/TextView;

    move-result-object v0

    return-object v0
.end method

.method static bridge synthetic _$$Nest$sfputrenewProgressBar(Landroid/widget/ProgressBar;)V
    .locals 0

    sput-object p0, Lkevin/fun/hook/SparkRenewHelper;->renewProgressBar:Landroid/widget/ProgressBar;

    return-void
.end method

.method static bridge synthetic _$$Nest$sfputrenewProgressDialog(Landroid/app/AlertDialog;)V
    .locals 0

    sput-object p0, Lkevin/fun/hook/SparkRenewHelper;->renewProgressDialog:Landroid/app/AlertDialog;

    return-void
.end method

.method static bridge synthetic _$$Nest$sfputrenewProgressText(Landroid/widget/TextView;)V
    .locals 0

    sput-object p0, Lkevin/fun/hook/SparkRenewHelper;->renewProgressText:Landroid/widget/TextView;

    return-void
.end method

.method static bridge synthetic _$$Nest$sfputrenewTaskNameText(Landroid/widget/TextView;)V
    .locals 3

    sput-object p0, Lkevin/fun/hook/SparkRenewHelper;->renewTaskNameText:Landroid/widget/TextView;

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
    const-string v0, "uM7dL9c9fl49wuib9n"

    invoke-static {v0}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۧۢ۟ۢ(Ljava/lang/String;)Ljava/lang/String;

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

.method static bridge synthetic _$$Nest$smdismissProgressDialog()V
    .locals 0

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۠ۡۦۢ()V

    return-void
.end method

.method static bridge synthetic _$$Nest$smdp(Landroid/content/Context;I)I
    .locals 1

    invoke-static {p0, p1}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v0

    return v0
.end method

.method public static captureImSdkContext(Ljava/lang/Object;)V
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
    invoke-static {}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟ۢۢۥ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-gtz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    const-string v0, "hRFCY4qhJ9IFrKYCT"

    invoke-static {v0}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->۟ۧۦ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :goto_2
    :sswitch_6
    return-void

    :sswitch_7
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۦۡۨۨ()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-static {v0, p0}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۡۥۦ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۨ۟ۨۢ()V

    goto :goto_2

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
.end method

.method public static captureSendMsgHandler(Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۠ۧ۟ۢ()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟ۤۥۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۠ۧ۟ۢ()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-static {v0, p0}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۡۥۦ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۨ۟ۨۢ()V

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

.method public static captureTemplateMessage(Ljava/lang/Object;)V
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
    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۡ۟ۦ()I

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
    const-string v0, "xqU"

    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۣۣ۟۟ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

    :goto_2
    :sswitch_6
    return-void

    :sswitch_7
    const/4 v0, 0x0

    :try_start_0
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v1

    const/16 v2, 0x102

    sget v3, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۥۨ:I

    xor-int/lit16 v3, v3, 0x28e

    const/16 v4, 0xb4d

    invoke-static {v1, v2, v3, v4}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟۟۟ۦۢ([SIII)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p0, v1, v2}, Lkevin/fun/hook/SparkRenewHelper;->۟ۢۥ۟۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    const/16 v1, 0x748

    :goto_3
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_3

    :sswitch_8
    const v1, 0xbe22

    goto :goto_3

    :catchall_0
    move-exception v1

    :sswitch_9
    const v1, 0xbe7f

    :goto_4
    const v2, 0xbe90

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_3

    goto :goto_4

    :cond_2
    :sswitch_a
    const v1, 0xbebd

    goto :goto_4

    :sswitch_b
    if-nez v0, :cond_2

    const v1, 0xbedc

    goto :goto_4

    :sswitch_c
    :try_start_1
    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;

    move-result-object v0

    const v1, 0xbefb

    :goto_5
    const v2, 0xbf0c

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_4

    goto :goto_5

    :goto_6
    :sswitch_d
    invoke-static {v0}, Landroidx/documentfile/ۡۢ۟ۥ;->ۢۥۦۣ(Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xc202

    :goto_7
    const v2, 0xc213

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_5

    goto :goto_7

    :sswitch_e
    if-eqz v1, :cond_3

    const v0, 0xc25f

    goto :goto_7

    :sswitch_f
    const v1, 0xbf1a

    goto :goto_5

    :sswitch_10
    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۡۢ۠(Ljava/lang/Object;)Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v0

    goto :goto_6

    :cond_3
    :sswitch_11
    const v0, 0xc240

    goto :goto_7

    :sswitch_12
    :try_start_2
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x10c

    sget v2, Lkevin/fun/hook/۟ۥ۠۠;->ۢۦۧۧ:I

    xor-int/lit16 v2, v2, -0x1c2

    const/16 v3, 0x958

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟ۡۧۨ([SIII)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lkevin/fun/hook/SparkRenewHelper;->۟ۢۥ۟۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-result-object p0

    const v0, 0xc27e

    :goto_8
    const v1, 0xc28f

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_6

    goto :goto_8

    :goto_9
    :sswitch_13
    :try_start_3
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟۠ۧۤ۠()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-static {v0, p0}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۡۥۦ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۨ۟ۨۢ()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    const v0, 0xc2fa

    :goto_a
    const v1, 0xc30b

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_7

    goto :goto_a

    :sswitch_14
    const v0, 0xc5a4

    goto :goto_a

    :sswitch_15
    const v0, 0xc29d

    goto :goto_8

    :catchall_1
    move-exception v0

    invoke-static {v0}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣۡۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v2

    const/16 v3, 0x111

    sget v4, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۤ۟ۧۤ:I

    xor-int/lit16 v4, v4, -0x1f6

    const/16 v5, 0x1b3

    invoke-static {v2, v3, v4, v5}, Landroidx/emoji2/ۢۧۡۧ;->۟ۥۢ۟ۢ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۦۣ(Ljava/lang/Object;)V

    goto/16 :goto_2

    :catchall_2
    move-exception v0

    goto :goto_9

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
        0xb97b -> :sswitch_9
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
        0x1f7 -> :sswitch_f
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_e
        0x32 -> :sswitch_11
        0x4c -> :sswitch_6
        0x53 -> :sswitch_12
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_13
        0xf1 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_14
        0x6af -> :sswitch_6
    .end sparse-switch
.end method

.method private static checkReadyState()V
    .locals 3

    const-class v2, Lkevin/fun/hook/SparkRenewHelper;

    monitor-enter v2

    :try_start_0
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۠ۧ۟ۢ()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟ۤۥۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟۠ۧۤ۠()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟ۤۥۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

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
    const/4 v0, 0x1

    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v1, 0xbe22

    goto :goto_2

    :sswitch_7
    const/4 v0, 0x0

    :sswitch_8
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۡۡۧۧ()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۥۥۤ۟(Ljava/lang/Object;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

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
        0xb97b -> :sswitch_8
    .end sparse-switch
.end method

.method private static clearConversationCustomMessage(Ljava/lang/String;)V
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v1

    const/16 v2, 0x123

    sget v3, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۤۥ:I

    xor-int/lit16 v3, v3, 0x3af

    const/16 v4, 0x412

    invoke-static {v1, v2, v3, v4}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۢۦۣ۠([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0, p0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/core/ۧ۟ۤۨ;->ۨۢۢۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v1

    const/16 v2, 0x139

    sget v3, Landroidx/activity/ۦۧۥۥ;->۟ۦۢۧۤ:I

    xor-int/lit8 v3, v3, -0x23

    const/16 v4, 0x2a4

    invoke-static {v1, v2, v3, v4}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۢۤۤ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0, p0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroidx/interpolator/ۣ۟ۤۢۧ;->۟ۥۥۥۤ(Ljava/lang/Object;Z)V

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "Mvu7S7e0FYxrniyb1"

    invoke-static {v0}, Landroidx/startup/۟ۦۤۨۧ;->۟۟۟ۨۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

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

.method private static createOptionRow(Landroid/content/Context;Ljava/lang/String;Z)Landroid/widget/LinearLayout;
    .locals 10

    const v1, -0x1d3ab

    const/4 v9, 0x0

    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-static {v2, v9}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    sget v0, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    xor-int/lit16 v0, v0, -0x17b

    invoke-static {v2, v0}, Landroidx/emoji2/ۢۧۡۧ;->ۡۤۥ(Ljava/lang/Object;I)V

    sget v3, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v3, v3, 0x132

    invoke-static {p0, v3}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v4

    invoke-static {p0, v0}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v5

    invoke-static {p0, v3}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v3

    invoke-static {p0, v0}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v0

    invoke-static {v2, v4, v5, v3, v0}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper;->ۤۥۥ۟(Ljava/lang/Object;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {v2, v0}, Landroidx/activity/ۦۧۥۥ;->۟ۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Landroid/widget/TextView;

    invoke-direct {v3, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {v3, p1}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v0, 0x41800000    # 16.0f

    invoke-static {v3, v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

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
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x6eb

    goto :goto_1

    :sswitch_4
    move v0, v1

    :goto_2
    invoke-static {v3, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    sget v4, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۤۨۨ:I

    xor-int/lit16 v4, v4, -0x10e

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-direct {v0, v9, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-static {v3, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۢۥۨۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Landroid/widget/TextView;

    invoke-direct {v4, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    sget v0, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    xor-int/lit16 v5, v0, -0x218

    const/16 v0, 0x748

    :goto_3
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_3

    :sswitch_5
    if-eqz p2, :cond_1

    const v0, 0xbe60

    goto :goto_3

    :sswitch_6
    const v0, -0xcccccd

    goto :goto_2

    :cond_1
    :sswitch_7
    const v0, 0xbe41

    goto :goto_3

    :sswitch_8
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v6, 0x14f

    const/4 v7, 0x1

    const/16 v8, 0xb29

    invoke-static {v0, v6, v7, v8}, Landroidx/customview/ۤۡۥ;->۟ۢۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v0, 0x41900000    # 18.0f

    invoke-static {v4, v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    invoke-static {v4, v1}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    invoke-static {v4, v9}, Landroidx/loader/۟۠ۢۧۡ;->ۦۡ۠ۨ(Ljava/lang/Object;I)V

    const v0, 0xbe7f

    :goto_4
    const v1, 0xbe90

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_3

    goto :goto_4

    :goto_5
    :sswitch_9
    invoke-static {p0, v5}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v0

    invoke-static {v4, v0, v9, v9, v9}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    invoke-static {v2, v3}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v4}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, -0x1000003b

    sget v1, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۦۣۧ:I

    xor-int/2addr v0, v1

    invoke-static {p2}, Landroidx/loader/ۡۢۢ;->ۤۨۡۥ(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v2, v0, v1}, Landroidx/vectordrawable/ۢۤۡۤ;->ۡۤۦۤ(Ljava/lang/Object;ILjava/lang/Object;)V

    const v0, -0x10000383

    sget v1, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    xor-int/2addr v0, v1

    invoke-static {v2, v0, v4}, Landroidx/vectordrawable/ۢۤۡۤ;->ۡۤۦۤ(Ljava/lang/Object;ILjava/lang/Object;)V

    return-object v2

    :sswitch_a
    const v0, 0xbe9e

    goto :goto_4

    :sswitch_b
    invoke-static {v4, v5}, Landroidx/loader/۟۠ۢۧۡ;->ۦۡ۠ۨ(Ljava/lang/Object;I)V

    goto :goto_5

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

.method private static createRippleDrawable(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
    .locals 10

    const/4 v1, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const-string v5, "\u06e2\u06e3\u06e0"

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

    new-array v1, v7, [I

    const-string v5, "\u06e8\u06e6"

    move-object v4, v1

    goto :goto_0

    :sswitch_0
    invoke-static {v2, v9}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۥ۟ۢۧ(Ljava/lang/Object;F)V

    const-string v1, "\u06e7\u06e6\u06e5"

    move-object v5, v1

    goto :goto_0

    :sswitch_1
    sget v8, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۡۦۥۨ:I

    const-string v1, "\u06e0\u06e6\u06df"

    move-object v5, v1

    goto :goto_0

    :sswitch_2
    const v1, 0x2200011e

    xor-int v6, v1, v8

    const-string v1, "\u06e4\u06e7\u06e2"

    move-object v5, v1

    goto :goto_0

    :sswitch_3
    sget v6, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦۦۤ۟:I

    const-string v1, "\u06e1\u06e3\u06df"

    move-object v5, v1

    goto :goto_0

    :sswitch_4
    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const-string v5, "\u06df\u06e1"

    move-object v2, v1

    goto :goto_0

    :sswitch_5
    new-instance v1, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    const-string v5, "\u06e3\u06e5\u06e0"

    move-object v3, v1

    goto :goto_0

    :sswitch_6
    invoke-static {v2, v6}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    const-string v1, "\u06e5\u06e1\u06e7"

    move-object v5, v1

    goto :goto_0

    :sswitch_7
    xor-int/lit16 v8, v6, 0x8c

    const-string v1, "\u06e7\u06e6\u06df"

    move-object v5, v1

    goto :goto_0

    :sswitch_8
    sget v8, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۥۨ:I

    const-string v1, "\u06e0\u06e1\u06e4"

    move-object v5, v1

    goto :goto_0

    :sswitch_9
    invoke-static {p0, v6}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v8

    const-string v1, "\u06e3\u06e5\u06e3"

    move-object v5, v1

    goto :goto_0

    :sswitch_a
    xor-int/lit16 v6, v8, 0x288

    const-string v1, "\u06e6\u06e5\u06e7"

    move-object v5, v1

    goto :goto_0

    :sswitch_b
    const v1, 0x10100a7

    aput v1, v4, v8

    const-string v1, "\u06e6\u06e0"

    move-object v5, v1

    goto :goto_0

    :sswitch_c
    invoke-static {v3, v4, v2}, Landroidx/drawerlayout/ۤۨۡۤ;->ۥۨۨۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e2\u06e2"

    move-object v5, v1

    goto :goto_0

    :sswitch_d
    int-to-float v9, v8

    const-string v1, "\u06df\u06e6\u06e2"

    move-object v5, v1

    goto :goto_0

    :sswitch_e
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v0, v7}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    const-string v1, "\u06e1\u06e1\u06e4"

    move-object v5, v1

    goto :goto_0

    :sswitch_f
    const/4 v1, 0x1

    new-array v1, v1, [I

    const-string v5, "\u06e1\u06e4"

    move-object v4, v1

    goto :goto_0

    :sswitch_10
    invoke-static {v3, v4, v0}, Landroidx/drawerlayout/ۤۨۡۤ;->ۥۨۨۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e1\u06df\u06e1"

    move-object v5, v1

    goto/16 :goto_0

    :sswitch_11
    return-object v3

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe2 -> :sswitch_1
        0xdc23 -> :sswitch_3
        0xdcba -> :sswitch_c
        0xdcfe -> :sswitch_10
        0x1aa7db -> :sswitch_0
        0x1aab03 -> :sswitch_a
        0x1aab99 -> :sswitch_2
        0x1aae83 -> :sswitch_11
        0x1aaec4 -> :sswitch_f
        0x1aaefd -> :sswitch_7
        0x1ab2bf -> :sswitch_5
        0x1ab6be -> :sswitch_4
        0x1ab6c1 -> :sswitch_d
        0x1ababf -> :sswitch_6
        0x1abdcb -> :sswitch_8
        0x1ac208 -> :sswitch_9
        0x1ac5e0 -> :sswitch_b
        0x1ac5e6 -> :sswitch_e
    .end sparse-switch
.end method

.method private static createSparkItemView(Landroid/content/Context;Lkevin/fun/hook/SparkRenewHelper$SparkInfo;)Landroid/widget/LinearLayout;
    .locals 10

    new-instance v7, Landroid/widget/LinearLayout;

    invoke-direct {v7, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    invoke-static {v7, v0}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    sget v0, Landroidx/core/ۧ۟ۤۨ;->ۣۤ۠ۤ:I

    xor-int/lit16 v0, v0, 0x1af

    invoke-static {v7, v0}, Landroidx/emoji2/ۢۧۡۧ;->ۡۤۥ(Ljava/lang/Object;I)V

    sget v1, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    xor-int/lit16 v1, v1, 0x2f2

    invoke-static {p0, v1}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v2

    sget v3, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    xor-int/lit16 v3, v3, 0x25d

    invoke-static {p0, v3}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v4

    invoke-static {p0, v1}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v1

    invoke-static {p0, v3}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v3

    invoke-static {v7, v2, v4, v1, v3}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper;->ۤۥۥ۟(Ljava/lang/Object;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v7, v1}, Landroidx/activity/ۦۧۥۥ;->۟ۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x0

    invoke-static {v2, v1}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    invoke-static {v2, v0}, Landroidx/emoji2/ۢۧۡۧ;->ۡۤۥ(Ljava/lang/Object;I)V

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, 0x0

    sget v3, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۤۥ:I

    xor-int/lit16 v3, v3, -0x3b9

    const v4, 0x3eb33333    # 0.35f

    invoke-direct {v0, v1, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-static {v2, v0}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣۡۥۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v0, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v0, v0, 0x114

    invoke-static {p0, v0}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v3

    new-instance v4, Landroid/widget/FrameLayout;

    invoke-direct {v4, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v0, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-static {v4, v0}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۣۡ۠۟(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Landroid/view/View;

    invoke-direct {v5, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v0, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-static {v5, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۦۤۡۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1}, Landroidx/core/ۤۦ۟ۢ;->ۣ۟ۡۦۢ(Ljava/lang/Object;)Z

    move-result v1

    invoke-static {p1}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۣ۟ۧ۠ۥ(Ljava/lang/Object;)Z

    move-result v6

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
    if-nez v6, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const v0, 0x66999999

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v1, 0x6eb

    goto :goto_1

    :sswitch_4
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_5
    if-eqz v1, :cond_1

    const v0, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_6
    const v0, 0xbe41

    goto :goto_2

    :sswitch_7
    const v0, 0x66f9a825

    const v1, 0xbe7f

    :goto_3
    const v8, 0xbe90

    xor-int/2addr v1, v8

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :goto_4
    :sswitch_8
    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 v8, 0x1

    invoke-static {v1, v8}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۤۨۦۡ(Ljava/lang/Object;I)V

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    invoke-static {v5, v1}, Landroidx/core/ktx/۟۟ۡۢ۠;->۟۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4, v5}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۡۢ۟۟(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Landroid/widget/TextView;

    invoke-direct {v5, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const v0, 0xbefb

    :goto_5
    const v1, 0xbf0c

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_4

    goto :goto_5

    :cond_2
    :sswitch_9
    const v0, 0xbf39

    goto :goto_5

    :sswitch_a
    const v1, 0xbe9e

    goto :goto_3

    :sswitch_b
    const v0, 0x6666bb6a

    goto :goto_4

    :sswitch_c
    if-eqz v6, :cond_2

    const v0, 0xc1e3

    goto :goto_5

    :sswitch_d
    invoke-static {p1}, Landroidx/loader/ۥۧۨۤ;->۟ۢۢۥۤ(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Landroidx/documentfile/ۡۢ۟ۥ;->ۢۢۨ۠(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0xc202

    :goto_6
    const v6, 0xc213

    xor-int/2addr v1, v6

    sparse-switch v1, :sswitch_data_5

    goto :goto_6

    :sswitch_e
    const v1, 0xc221

    goto :goto_6

    :sswitch_f
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x150

    const/4 v6, 0x1

    const/16 v8, 0xbad

    invoke-static {v0, v1, v6, v8}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣ۟۠ۢۡ([SIII)Ljava/lang/String;

    move-result-object v0

    :sswitch_10
    invoke-static {v5, v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v0, 0x41900000    # 18.0f

    invoke-static {v5, v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v5, v0, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۤۦۤۢ(Ljava/lang/Object;Ljava/lang/Object;I)V

    sget v0, Lkevin/fun/hook/۟ۥ۠۠;->ۢۦۧۧ:I

    xor-int/lit16 v0, v0, 0x1c4

    invoke-static {v5, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    sget v0, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v0, v0, 0x21f

    invoke-static {v5, v0}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v1, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    iput v0, v1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    invoke-static {v5, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۢۥۨۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4, v5}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۡۢ۟۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v4}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v7, v2}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x1

    invoke-static {v2, v0}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, 0x0

    sget v3, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۨ۠ۧ:I

    xor-int/lit16 v3, v3, 0x1bc

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-static {v2, v0}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣۡۥۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v0, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    xor-int/lit16 v0, v0, 0x31d

    invoke-static {p0, v0}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v0

    const/4 v1, 0x0

    sget v3, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    xor-int/lit8 v3, v3, 0x41

    invoke-static {p0, v3}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v3

    const/4 v4, 0x0

    invoke-static {v2, v0, v1, v3, v4}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    invoke-static {p1}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۣ۟ۧ۠ۥ(Ljava/lang/Object;)Z

    move-result v1

    sget v3, Lkevin/fun/hook/۟ۥ۠۠;->ۢۦۧۧ:I

    const v0, 0xc27e

    :goto_7
    const v4, 0xc28f

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_6

    goto :goto_7

    :cond_3
    :sswitch_11
    const v0, 0xc2bc

    goto :goto_7

    :sswitch_12
    if-nez v1, :cond_3

    const v0, 0xc2db

    goto :goto_7

    :sswitch_13
    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v1

    const/16 v4, 0x151

    sget v5, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    xor-int/lit8 v5, v5, -0x32

    const/16 v6, 0x620

    invoke-static {v1, v4, v5, v6}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۤ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v1, 0x41200000    # 10.0f

    invoke-static {v0, v1}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v1, 0x6667a2

    xor-int/2addr v1, v3

    invoke-static {v0, v1}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    sget v5, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    xor-int/lit16 v5, v5, 0x17d

    invoke-static {p0, v5}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v5

    invoke-static {v0, v1, v3, v4, v5}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    invoke-static {v2, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0xc2fa

    :goto_8
    const v1, 0xc30b

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_7

    goto :goto_8

    :sswitch_14
    const v0, 0xc5a4

    goto :goto_8

    :sswitch_15
    invoke-static {p1}, Landroidx/core/ۤۦ۟ۢ;->ۣ۟ۡۦۢ(Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xc601

    :goto_9
    const v3, 0xc612

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_8

    goto :goto_9

    :sswitch_16
    if-eqz v1, :cond_4

    const v0, 0xc65e

    goto :goto_9

    :cond_4
    :sswitch_17
    const v0, 0xc63f

    goto :goto_9

    :sswitch_18
    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v1

    const/16 v3, 0x155

    sget v4, Landroidx/startup/۟ۦۤۨۧ;->ۧۡۡۦ:I

    xor-int/lit16 v4, v4, -0x113

    const/16 v5, 0xa35

    invoke-static {v1, v3, v4, v5}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟ۧۢۥ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v1, 0x41200000    # 10.0f

    invoke-static {v0, v1}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v1, -0x1d241

    sget v3, Landroidx/activity/ۤۧۧۧ;->۟۟ۢ۠ۡ:I

    xor-int/2addr v1, v3

    invoke-static {v0, v1}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    sget v5, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    xor-int/lit16 v5, v5, 0x162

    invoke-static {p0, v5}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v5

    invoke-static {v0, v1, v3, v4, v5}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    invoke-static {v2, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0xc67d

    :goto_a
    const v1, 0xc68e

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_9

    goto :goto_a

    :sswitch_19
    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {p1}, Landroidx/viewpager/ۣۢ۟ۤ;->۟۟ۨۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/lifecycle/process/۠ۢۧۡ;->۟ۦۣۤۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const v0, 0xc984

    :goto_b
    const v4, 0xc995

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_a

    goto :goto_b

    :sswitch_1a
    if-eqz v3, :cond_5

    const v0, 0xc9e1

    goto :goto_b

    :sswitch_1b
    const v0, 0xc69c

    goto :goto_a

    :cond_5
    :sswitch_1c
    const v0, 0xc9c2

    goto :goto_b

    :sswitch_1d
    invoke-static {v3}, Landroidx/activity/ۨ۠۟ۧ;->۟ۧ۟ۡ۠(Ljava/lang/Object;)Z

    move-result v4

    const v0, 0xca00

    :goto_c
    const v5, 0xca11

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_b

    goto :goto_c

    :cond_6
    :sswitch_1e
    const v0, 0xca3e

    goto :goto_c

    :sswitch_1f
    if-nez v4, :cond_6

    const v0, 0xca5d

    goto :goto_c

    :sswitch_20
    invoke-static {v1, v3}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0xca7c

    :goto_d
    const v3, 0xca8d

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_c

    goto :goto_d

    :sswitch_21
    const v0, 0xcd26

    goto :goto_d

    :sswitch_22
    invoke-static {p1}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->۟ۢۨۢۨ(Ljava/lang/Object;)J

    move-result-wide v4

    invoke-static {v4, v5}, Lkevin/fun/hook/SparkRenewHelper;->۟ۧۢۨ(J)Ljava/lang/String;

    move-result-object v3

    const v0, 0xcd83

    :goto_e
    const v4, 0xcd94

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_d

    goto :goto_e

    :sswitch_23
    if-eqz v3, :cond_7

    const v0, 0xcde0

    goto :goto_e

    :cond_7
    :sswitch_24
    const v0, 0xcdc1

    goto :goto_e

    :sswitch_25
    invoke-static {v3}, Landroidx/activity/ۨ۠۟ۧ;->۟ۧ۟ۡ۠(Ljava/lang/Object;)Z

    move-result v4

    const v0, 0xcdff

    :goto_f
    const v5, 0xce10

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_e

    goto :goto_f

    :cond_8
    :sswitch_26
    const v0, 0xce3d

    goto :goto_f

    :sswitch_27
    if-nez v4, :cond_8

    const v0, 0xd0e7

    goto :goto_f

    :sswitch_28
    invoke-static {v1, v3}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0xd106

    :goto_10
    const v3, 0xd117

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_f

    goto :goto_10

    :sswitch_29
    const v0, 0xd125

    goto :goto_10

    :sswitch_2a
    invoke-static {p1}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->۟ۢۨۢۨ(Ljava/lang/Object;)J

    move-result-wide v4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v3

    const/16 v6, 0x15c

    sget v8, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۤ۟ۨ:I

    xor-int/lit16 v8, v8, -0x1ab

    const/16 v9, 0x942

    invoke-static {v3, v6, v8, v9}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۥۡۤۧ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0, v4, v5}, Landroidx/loader/ۢۥ۟;->۟ۥۣۢۡ(Ljava/lang/Object;J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_2b
    invoke-static {p1}, Landroidx/loader/ۥۧۨۤ;->۟۟۟ۧۦ(Ljava/lang/Object;)I

    move-result v3

    const v0, 0xd182

    :goto_11
    const v4, 0xd193

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_10

    goto :goto_11

    :sswitch_2c
    const/4 v0, 0x2

    if-eq v3, v0, :cond_9

    const v0, 0xd1df

    goto :goto_11

    :cond_9
    :sswitch_2d
    const v0, 0xd1c0

    goto :goto_11

    :sswitch_2e
    invoke-static {p1}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->۟ۢۨۢۨ(Ljava/lang/Object;)J

    move-result-wide v4

    const v0, 0xd1fe

    :goto_12
    const v3, 0xd20f

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_11

    goto :goto_12

    :sswitch_2f
    const-wide/16 v8, 0x0

    cmp-long v0, v4, v8

    if-lez v0, :cond_a

    const v0, 0xd4e6

    goto :goto_12

    :cond_a
    :sswitch_30
    const v0, 0xd4c7

    goto :goto_12

    :sswitch_31
    new-instance v0, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda11;

    invoke-direct {v0, p1, p0}, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda11;-><init>(Lkevin/fun/hook/SparkRenewHelper$SparkInfo;Landroid/content/Context;)V

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۦۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_32
    const/high16 v0, 0x41400000    # 12.0f

    invoke-static {v1, v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v0, -0x999916

    sget v3, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦۦۤ۟:I

    xor-int/2addr v0, v3

    invoke-static {v1, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    invoke-static {}, Landroidx/interpolator/ۣ۟ۤۢۧ;->۟ۧ۟ۥۧ()Landroid/graphics/Typeface;

    move-result-object v0

    invoke-static {v1, v0}, Landroidx/customview/ۡۤۡۤ;->ۧ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v1}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Landroid/widget/TextView;

    invoke-direct {v3, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {p1}, Landroidx/viewpager/ۣۢ۟ۤ;->۟۟ۨۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const v0, 0xd505

    :goto_13
    const v4, 0xd516

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_12

    goto :goto_13

    :sswitch_33
    if-eqz v1, :cond_b

    const v0, 0xd562

    goto :goto_13

    :cond_b
    :sswitch_34
    const v0, 0xd543

    goto :goto_13

    :sswitch_35
    invoke-static {p1}, Landroidx/viewpager/ۣۢ۟ۤ;->۟۟ۨۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const v1, 0xd581

    :goto_14
    const v4, 0xd592

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_13

    goto :goto_14

    :sswitch_36
    const v1, 0xd5a0

    goto :goto_14

    :sswitch_37
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x161

    sget v4, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۨۥۦ۟:I

    xor-int/lit16 v4, v4, 0x28f

    const/16 v5, 0xb90

    invoke-static {v0, v1, v4, v5}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۧۨۦۦ([SIII)Ljava/lang/String;

    move-result-object v0

    :sswitch_38
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v4

    const/16 v5, 0x163

    sget v6, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    xor-int/lit8 v6, v6, -0x16

    const/16 v8, 0x267

    invoke-static {v4, v5, v6, v8}, Landroidx/interpolator/۟ۧۦ۟ۨ;->۠ۤۤۡ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v0, 0x41300000    # 11.0f

    invoke-static {v3, v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v0, -0x666741

    sget v1, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۧ۠۠ۡ:I

    xor-int/2addr v0, v1

    invoke-static {v3, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const/4 v0, 0x0

    sget v1, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    xor-int/lit16 v1, v1, 0x3a3

    invoke-static {p0, v1}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v3, v0, v1, v4, v5}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    invoke-static {v2, v3}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v7, v2}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v8, Landroid/widget/LinearLayout;

    invoke-direct {v8, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x1

    invoke-static {v8, v0}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    sget v0, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۨۥۦ۟:I

    xor-int/lit16 v0, v0, 0x29c

    invoke-static {v8, v0}, Landroidx/emoji2/ۢۧۡۧ;->ۡۤۥ(Ljava/lang/Object;I)V

    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    sget v0, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    xor-int/lit16 v0, v0, -0x20e

    invoke-static {p0, v0}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v0

    int-to-float v0, v0

    invoke-static {v3, v0}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۥ۟ۢۧ(Ljava/lang/Object;F)V

    const/high16 v0, 0x41300000    # 11.0f

    invoke-static {v2, v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v2, v0, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۤۦۤۢ(Ljava/lang/Object;Ljava/lang/Object;I)V

    sget v0, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    xor-int/lit16 v0, v0, 0x2f2

    invoke-static {p0, v0}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v1

    sget v4, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    xor-int/lit8 v4, v4, 0x74

    invoke-static {p0, v4}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v5

    invoke-static {p0, v0}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v0

    invoke-static {p0, v4}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v4

    invoke-static {v2, v1, v5, v0, v4}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    invoke-static {v2, v3}, Landroidx/core/ۧ۟ۤۨ;->ۣ۟ۢۧ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v0, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢ۟ۥ:I

    xor-int/lit16 v0, v0, -0x176

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v1, v0, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v2, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۢۥۨۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Landroid/widget/TextView;

    invoke-direct {v4, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const/high16 v0, 0x41200000    # 10.0f

    invoke-static {v4, v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v4, v0, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۤۦۤۢ(Ljava/lang/Object;Ljava/lang/Object;I)V

    const v0, 0x9999f7

    sget v1, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣ۠ۢۢ:I

    xor-int/2addr v0, v1

    invoke-static {v4, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    sget v0, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    xor-int/lit8 v0, v0, -0x80

    invoke-static {p0, v0}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v1

    sget v5, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    xor-int/lit8 v5, v5, -0x17

    invoke-static {p0, v5}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v6

    invoke-static {p0, v0}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v0

    invoke-static {p0, v5}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v5

    invoke-static {v4, v1, v6, v0, v5}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    sget v1, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۢ۟ۡ:I

    xor-int/lit16 v1, v1, -0x280

    invoke-static {p0, v1}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v1

    int-to-float v1, v1

    invoke-static {v0, v1}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۥ۟ۢۧ(Ljava/lang/Object;F)V

    const/4 v1, 0x1

    invoke-static {p0, v1}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v1

    const v5, -0x22000066

    sget v6, Landroidx/customview/ۤۡۥ;->ۣ۟ۢۥۢ:I

    xor-int/2addr v5, v6

    invoke-static {v0, v1, v5}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۣ۟ۧ۟۠(Ljava/lang/Object;II)V

    const v1, 0x110003a0

    sget v5, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    xor-int/2addr v1, v5

    invoke-static {v0, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    invoke-static {v4, v0}, Landroidx/core/ۧ۟ۤۨ;->ۣ۟ۢۧ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v0, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۤۥ:I

    xor-int/lit16 v0, v0, -0x3b9

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v1, v0, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    sget v0, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢ۟ۥ:I

    xor-int/lit16 v0, v0, 0x172

    invoke-static {p0, v0}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v0

    iput v0, v1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    invoke-static {v4, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۢۥۨۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Landroid/widget/TextView;

    invoke-direct {v5, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x169

    sget v6, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    xor-int/lit8 v6, v6, -0x72

    const/16 v9, 0x6f2

    invoke-static {v0, v1, v6, v9}, Landroidx/customview/ۤۡۥ;->۟ۢۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v0, 0x41200000    # 10.0f

    invoke-static {v5, v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v5, v0, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۤۦۤۢ(Ljava/lang/Object;Ljava/lang/Object;I)V

    const v0, -0x1d128

    sget v1, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۨۥۦ۟:I

    xor-int/2addr v0, v1

    invoke-static {v5, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    sget v0, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    xor-int/lit8 v0, v0, 0x58

    invoke-static {p0, v0}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v1

    sget v6, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    xor-int/lit8 v6, v6, 0x4c

    invoke-static {p0, v6}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v9

    invoke-static {p0, v0}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v0

    invoke-static {p0, v6}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v6

    invoke-static {v5, v1, v9, v0, v6}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    sget v1, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    xor-int/lit8 v1, v1, -0x66

    invoke-static {p0, v1}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v1

    int-to-float v1, v1

    invoke-static {v0, v1}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۥ۟ۢۧ(Ljava/lang/Object;F)V

    const/4 v1, 0x1

    invoke-static {p0, v1}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v1

    const v6, -0x33fe2c3c    # -3.4033424E7f

    sget v9, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣ۠ۢۢ:I

    xor-int/2addr v6, v9

    invoke-static {v0, v1, v6}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۣ۟ۧ۟۠(Ljava/lang/Object;II)V

    const v1, 0x11fe2fec

    sget v6, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۤۥ:I

    xor-int/2addr v1, v6

    invoke-static {v0, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    invoke-static {v5, v0}, Landroidx/core/ۧ۟ۤۨ;->ۣ۟ۢۧ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v0, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣ۠ۢۢ:I

    xor-int/lit8 v0, v0, 0x6f

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v1, v0, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    sget v0, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۤۨۨ:I

    xor-int/lit16 v0, v0, 0x10a

    invoke-static {p0, v0}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v0

    iput v0, v1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    invoke-static {v5, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۢۥۨۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v6, 0x33fe2c55

    new-instance v0, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda13;

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda13;-><init>(Lkevin/fun/hook/SparkRenewHelper$SparkInfo;Landroid/widget/TextView;Landroid/graphics/drawable/GradientDrawable;Landroid/widget/TextView;Landroid/widget/TextView;)V

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۣ۠ۢۥ(Ljava/lang/Object;)V

    new-instance v1, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda14;

    invoke-direct {v1, p0, p1, v0}, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda14;-><init>(Landroid/content/Context;Lkevin/fun/hook/SparkRenewHelper$SparkInfo;Ljava/lang/Runnable;)V

    invoke-static {v2, v1}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۦۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda15;

    invoke-direct {v1, p0, p1, v0}, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda15;-><init>(Landroid/content/Context;Lkevin/fun/hook/SparkRenewHelper$SparkInfo;Ljava/lang/Runnable;)V

    invoke-static {v4, v1}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۦۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda16;

    invoke-direct {v1, p1, v0, p0}, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda16;-><init>(Lkevin/fun/hook/SparkRenewHelper$SparkInfo;Ljava/lang/Runnable;Landroid/content/Context;)V

    invoke-static {v5, v1}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۦۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v8, v2}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v8, v4}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v8, v5}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v7, v8}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Landroid/widget/Switch;

    invoke-direct {v2, p0}, Landroid/widget/Switch;-><init>(Landroid/content/Context;)V

    invoke-static {p1}, Landroidx/viewpager/ۣۢ۟ۤ;->۟۟ۨۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/SparkRenewHelper;->۟ۧۡۦۧ(Ljava/lang/Object;)Z

    move-result v3

    invoke-static {v2, v3}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۤ۠ۧ(Ljava/lang/Object;Z)V

    sget v0, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۨۤۨۡ:I

    xor-int/lit16 v0, v0, -0x398

    invoke-static {p0, v0}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v0

    sget v1, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۥۨ:I

    xor-int/lit16 v1, v1, 0x298

    invoke-static {p0, v1}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v1

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v4, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    sget v0, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    xor-int/lit8 v0, v0, -0x34

    invoke-static {p0, v0}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v0

    iput v0, v4, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    invoke-static {v2, v4}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠۠ۡۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0xd888

    :goto_15
    const v1, 0xd899

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_14

    goto :goto_15

    :sswitch_39
    if-eqz v3, :cond_c

    const v0, 0xd8e5

    goto :goto_15

    :cond_c
    :sswitch_3a
    const v0, 0xd8c6

    goto :goto_15

    :sswitch_3b
    const v0, -0x1d3ab

    const v1, 0xd904

    :goto_16
    const v4, 0xd915

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_15

    goto :goto_16

    :sswitch_3c
    const v1, 0xd923

    goto :goto_16

    :sswitch_3d
    const v0, -0x333334

    :sswitch_3e
    invoke-static {v0}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢۥۦۥ(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    const v0, 0xd980

    :goto_17
    const v4, 0xd991

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_16

    goto :goto_17

    :sswitch_3f
    if-eqz v3, :cond_d

    const v0, 0xdc68

    goto :goto_17

    :cond_d
    :sswitch_40
    const v0, 0xdc49

    goto :goto_17

    :sswitch_41
    const v0, 0xdc87

    :goto_18
    const v3, 0xdc98

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_17

    goto :goto_18

    :sswitch_42
    const v0, 0xdca6

    goto :goto_18

    :sswitch_43
    move v0, v6

    :goto_19
    invoke-static {v0}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢۥۦۥ(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-static {v2, v1}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۢۦۧۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟۠۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda17;

    invoke-direct {v0, p1, v2}, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda17;-><init>(Lkevin/fun/hook/SparkRenewHelper$SparkInfo;Landroid/widget/Switch;)V

    invoke-static {v2, v0}, Landroidx/core/ۧ۟ۤۨ;->ۣ۟ۡۤ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v7, v2}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v7

    :sswitch_44
    const v0, 0x33cccccc

    goto :goto_19

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
        0x36 -> :sswitch_8
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_5
        0xb918 -> :sswitch_b
        0xb939 -> :sswitch_7
        0xb97b -> :sswitch_6
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_8
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_9
        0x35 -> :sswitch_f
        0x1f7 -> :sswitch_c
        0x7eef -> :sswitch_d
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_e
        0x32 -> :sswitch_10
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_11
        0x33 -> :sswitch_15
        0x54 -> :sswitch_13
        0xf1 -> :sswitch_12
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_14
        0x6af -> :sswitch_19
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_16
        0x2d -> :sswitch_19
        0x32 -> :sswitch_17
        0x4c -> :sswitch_18
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_19
        0xf3 -> :sswitch_1b
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1a
        0x36 -> :sswitch_1c
        0x57 -> :sswitch_22
        0x74 -> :sswitch_1d
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_1e
        0x11 -> :sswitch_1f
        0x2f -> :sswitch_22
        0x4c -> :sswitch_20
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_21
        0x7ab -> :sswitch_2b
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_23
        0x36 -> :sswitch_24
        0x55 -> :sswitch_2a
        0x74 -> :sswitch_25
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_26
        0x2d -> :sswitch_2a
        0x3ef -> :sswitch_27
        0x1ef7 -> :sswitch_28
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_29
        0x32 -> :sswitch_2b
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x11 -> :sswitch_2c
        0x32 -> :sswitch_2d
        0x4c -> :sswitch_2e
        0x53 -> :sswitch_32
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x3f1 -> :sswitch_2f
        0x6a7 -> :sswitch_30
        0x6c8 -> :sswitch_32
        0x6e9 -> :sswitch_31
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x13 -> :sswitch_33
        0x32 -> :sswitch_34
        0x55 -> :sswitch_37
        0x74 -> :sswitch_35
    .end sparse-switch

    :sswitch_data_13
    .sparse-switch
        0x13 -> :sswitch_36
        0x32 -> :sswitch_38
    .end sparse-switch

    :sswitch_data_14
    .sparse-switch
        0x11 -> :sswitch_39
        0x3e -> :sswitch_3a
        0x5f -> :sswitch_3d
        0x7c -> :sswitch_3b
    .end sparse-switch

    :sswitch_data_15
    .sparse-switch
        0x11 -> :sswitch_3c
        0x36 -> :sswitch_3e
    .end sparse-switch

    :sswitch_data_16
    .sparse-switch
        0x11 -> :sswitch_3f
        0x5bb -> :sswitch_40
        0x5d8 -> :sswitch_44
        0x5f9 -> :sswitch_41
    .end sparse-switch

    :sswitch_data_17
    .sparse-switch
        0x1f -> :sswitch_42
        0x3e -> :sswitch_43
    .end sparse-switch
.end method

.method private static dismissProgressDialog()V
    .locals 2

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۥۢۤ۠()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lkevin/fun/hook/SparkRenewHelper$2;

    invoke-direct {v1}, Lkevin/fun/hook/SparkRenewHelper$2;-><init>()V

    invoke-static {v0, v1}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method private static dp(Landroid/content/Context;F)I
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
    const/high16 v0, 0x40400000    # 3.0f

    mul-float/2addr v0, p1

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

.method private static dp(Landroid/content/Context;I)I
    .locals 8

    const/4 v1, 0x0

    const/4 v5, 0x0

    const-string v3, "\u06e1\u06e4\u06e8"

    move-object v0, v1

    move-object v2, v1

    move v4, v5

    move v6, v5

    move v7, v5

    :goto_0
    invoke-static {v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {v2}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟۟ۤۦۤ(Ljava/lang/Object;)Landroid/util/DisplayMetrics;

    move-result-object v0

    const-string v1, "\u06e3\u06e6\u06e7"

    move-object v3, v1

    goto :goto_0

    :sswitch_0
    const/high16 v1, 0x3f000000    # 0.5f

    add-float v5, v4, v1

    const-string v1, "\u06e1\u06e3\u06e5"

    move-object v3, v1

    move v7, v5

    goto :goto_0

    :sswitch_1
    float-to-int p1, v7

    const-string v1, "\u06e5\u06e3\u06e0"

    move-object v3, v1

    goto :goto_0

    :sswitch_2
    mul-float v4, v7, v6

    const-string v1, "\u06e3\u06e3\u06e3"

    move-object v3, v1

    goto :goto_0

    :sswitch_3
    int-to-float v5, p1

    const-string v1, "\u06df\u06df\u06e0"

    move-object v3, v1

    move v7, v5

    goto :goto_0

    :sswitch_4
    invoke-static {v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۦۡۧ(Ljava/lang/Object;)F

    move-result v5

    const-string v1, "\u06e4\u06e8\u06e5"

    move-object v3, v1

    move v6, v5

    goto :goto_0

    :sswitch_5
    invoke-static {p0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۨ۟ۨ(Ljava/lang/Object;)Landroid/content/res/Resources;

    move-result-object v1

    const-string v3, "\u06e5\u06e7"

    move-object v2, v1

    goto :goto_0

    :sswitch_6
    return p1

    :sswitch_data_0
    .sparse-switch
        0x1aa700 -> :sswitch_2
        0x1aaf03 -> :sswitch_1
        0x1aaf25 -> :sswitch_5
        0x1ab683 -> :sswitch_0
        0x1ab6e4 -> :sswitch_4
        0x1abae1 -> :sswitch_3
        0x1abe02 -> :sswitch_6
    .end sparse-switch
.end method

.method private static extractOtherUid(Ljava/lang/Object;Ljava/lang/Object;)J
    .locals 10

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    :try_start_0
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v4, 0x16d

    sget v5, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۡۦۥۨ:I

    xor-int/lit16 v5, v5, 0x10d

    const/16 v6, 0x83a

    invoke-static {v0, v4, v5, v6}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟ۧۢۥ([SIII)Ljava/lang/String;

    move-result-object v0

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {p0, v0, v4}, Lkevin/fun/hook/SparkRenewHelper;->۟ۢۥ۟۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v5, v0, Ljava/lang/Number;

    const/16 v4, 0x650

    :goto_0
    xor-int/lit16 v4, v4, 0x661

    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v4, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v5, :cond_0

    const/16 v4, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast v0, Ljava/lang/Number;

    invoke-static {v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۡۢۦ۟(Ljava/lang/Object;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    :goto_1
    const/16 v1, 0x6cc

    :goto_2
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_2

    :sswitch_3
    const/16 v1, 0x6eb

    goto :goto_2

    :sswitch_4
    move v5, v0

    :goto_3
    :try_start_1
    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    move-result-object v0

    :try_start_2
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v1

    const/16 v4, 0x180

    sget v6, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۣۧۢ:I

    xor-int/lit16 v6, v6, -0x3d8

    const/16 v7, 0x63c

    invoke-static {v1, v4, v6, v7}, Landroidx/customview/ۤۡۥ;->۟ۢۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {p0, v1, v4}, Lkevin/fun/hook/SparkRenewHelper;->۟ۢۥ۟۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۡۢ۠(Ljava/lang/Object;)Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-result-object v0

    const v1, 0xbe7f

    :goto_4
    const v4, 0xbe90

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_2

    goto :goto_4

    :sswitch_5
    move-object v1, v0

    :goto_5
    :try_start_3
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۣۢۤ۠()Ljava/util/concurrent/atomic/AtomicLong;

    move-result-object v0

    invoke-static {v0}, Landroidx/appcompat/resources/ۦۨۦۢ;->ۦۧۧ۟(Ljava/lang/Object;)J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    move-result-wide v6

    const v0, 0xbefb

    :goto_6
    const v4, 0xbf0c

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_3

    goto :goto_6

    :cond_1
    :sswitch_6
    const v0, 0xbf39

    goto :goto_6

    :catchall_0
    move-exception v0

    const/16 v0, 0x748

    :goto_7
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_4

    goto :goto_7

    :sswitch_7
    const v0, 0xbe22

    goto :goto_7

    :sswitch_8
    move v0, v1

    goto :goto_1

    :sswitch_9
    const v1, 0xbe9e

    goto :goto_4

    :catchall_1
    move-exception v1

    move-object v1, v0

    goto :goto_5

    :sswitch_a
    cmp-long v0, v6, v2

    if-nez v0, :cond_1

    const v0, 0xc1e3

    goto :goto_6

    :sswitch_b
    :try_start_4
    invoke-static {}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۨۤ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/loader/۟۠ۢۧۡ;->ۧۧۥ(Ljava/lang/Object;)J

    move-result-wide v6

    const v0, 0xc202

    :goto_8
    const v4, 0xc213

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_5

    goto :goto_8

    :sswitch_c
    cmp-long v0, v6, v2

    if-lez v0, :cond_2

    const v0, 0xc25f

    goto :goto_8

    :cond_2
    :sswitch_d
    const v0, 0xc240

    goto :goto_8

    :sswitch_e
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۣۢۤ۠()Ljava/util/concurrent/atomic/AtomicLong;

    move-result-object v0

    invoke-static {v0, v6, v7}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۟ۥۦۨ(Ljava/lang/Object;J)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    const v0, 0xc27e

    :goto_9
    const v4, 0xc28f

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_6

    goto :goto_9

    :goto_a
    :sswitch_f
    const v0, 0xc2fa

    :goto_b
    const v4, 0xc30b

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_7

    goto :goto_b

    :sswitch_10
    const/4 v0, 0x1

    if-ne v5, v0, :cond_3

    const v0, 0xc5e2

    goto :goto_b

    :sswitch_11
    const v0, 0xc29d

    goto :goto_9

    :catchall_2
    move-exception v0

    :try_start_5
    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۦۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v6

    const/16 v7, 0x191

    sget v8, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۤۦۤۧ:I

    xor-int/lit16 v8, v8, 0x178

    const/16 v9, 0x680

    invoke-static {v6, v7, v8, v9}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧ۠ۥ۟([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {v4, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۦۣ(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_a

    :catchall_3
    move-exception v0

    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۦۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v4

    const/16 v5, 0x1b8

    sget v6, Landroidx/activity/ۣۦۡۥ;->ۣۢۤۡ:I

    xor-int/lit8 v6, v6, 0x1e

    const/16 v7, 0xc11

    invoke-static {v4, v5, v6, v7}, Landroidx/activity/ۦۧۥۥ;->۟ۤۡۦۦ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۦۣ(Ljava/lang/Object;)V

    move-wide v0, v2

    :goto_c
    :sswitch_12
    return-wide v0

    :cond_3
    :sswitch_13
    const v0, 0xc5c3

    goto :goto_b

    :sswitch_14
    :try_start_6
    invoke-static {v1}, Lkevin/fun/hook/SparkRenewHelper;->۟ۥۣۡۨ(Ljava/lang/Object;)J
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    move-result-wide v0

    const v4, 0xc601

    :goto_d
    const v6, 0xc612

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_8

    goto :goto_d

    :sswitch_15
    cmp-long v4, v0, v2

    if-lez v4, :cond_4

    const v4, 0xc65e

    goto :goto_d

    :cond_4
    :sswitch_16
    const v4, 0xc63f

    goto :goto_d

    :sswitch_17
    const v0, 0xc67d

    :goto_e
    const v1, 0xc68e

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_9

    goto :goto_e

    :cond_5
    :sswitch_18
    const v0, 0xc6bb

    goto :goto_e

    :sswitch_19
    const/4 v0, 0x2

    if-ne v5, v0, :cond_5

    const v0, 0xc965

    goto :goto_e

    :sswitch_1a
    move-wide v0, v2

    goto :goto_c

    :sswitch_1b
    move-wide v0, v2

    goto :goto_c

    :sswitch_1c
    move v5, v1

    goto/16 :goto_3

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_1c
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0xe -> :sswitch_5
        0xef -> :sswitch_9
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0x16 -> :sswitch_6
        0x35 -> :sswitch_f
        0x1f7 -> :sswitch_a
        0x7eef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x11 -> :sswitch_7
        0xb97b -> :sswitch_8
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_c
        0x32 -> :sswitch_d
        0x4c -> :sswitch_e
        0x53 -> :sswitch_f
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_f
        0xf1 -> :sswitch_11
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_10
        0x6af -> :sswitch_13
        0x6c8 -> :sswitch_17
        0x6e9 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_15
        0x2d -> :sswitch_17
        0x32 -> :sswitch_16
        0x4c -> :sswitch_12
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_18
        0x35 -> :sswitch_1b
        0xf3 -> :sswitch_19
        0xfeb -> :sswitch_1a
    .end sparse-switch
.end method

.method private static forceWakeupAndSync()V
    .locals 6

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۦۡۨۨ()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟ۤۥۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-static {}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۢۥ۠()I

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
    const-string v0, "zBymfVeBiwUf8Dcw7AEIO"

    invoke-static {v0}, Landroidx/startup/۟ۦۤۨۧ;->۟۟۟ۨۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :goto_2
    :sswitch_6
    return-void

    :sswitch_7
    :try_start_0
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v2, 0x1d4

    sget v3, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    xor-int/lit8 v3, v3, 0x5b

    const/16 v4, 0x1d6

    invoke-static {v0, v2, v3, v4}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۧ۟ۧۢ([SIII)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v0, v2}, Lkevin/fun/hook/SparkRenewHelper;->۟ۢۥ۟۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v2

    const/16 v3, 0x1dd

    sget v4, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۦۣۧ:I

    xor-int/lit8 v4, v4, -0x74

    const/16 v5, 0xacf

    invoke-static {v2, v3, v4, v5}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۢۦۣ۠([SIII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v0, v2, v3}, Lkevin/fun/hook/SparkRenewHelper;->۟ۢۥ۟۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v2, 0x1e6

    sget v3, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    xor-int/lit8 v3, v3, 0x5d

    const/16 v4, 0x364

    invoke-static {v0, v2, v3, v4}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۦۥۢ([SIII)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v0, v2}, Lkevin/fun/hook/SparkRenewHelper;->۟ۢۥ۟۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v2, 0x1fa

    sget v3, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/lit16 v3, v3, 0x30b

    const/16 v4, 0xb95

    invoke-static {v0, v2, v3, v4}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣ۟۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v0, v2}, Lkevin/fun/hook/SparkRenewHelper;->۟ۢۥ۟۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
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

    goto :goto_2

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

.method public static getAllConversationsMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lkevin/fun/hook/SparkRenewHelper$SparkInfo;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۦۦ۟ۦ()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    return-object v0
.end method

.method private static getConversationCustomMessage(Ljava/lang/String;)Ljava/lang/String;
    .locals 10

    const/4 v7, 0x0

    const/4 v1, 0x0

    const-string v9, "\u06e8\u06e3\u06e5"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move v6, v7

    move v8, v7

    :goto_0
    invoke-static {v9}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "\u06df\u06e5\u06e0"

    move-object v5, v1

    move-object v9, v7

    goto :goto_0

    :sswitch_0
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const-string v1, "\u06e1\u06e4\u06e6"

    move-object v9, v1

    goto :goto_0

    :sswitch_1
    invoke-static {v4, p0}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۦۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e2\u06e6\u06e1"

    move-object v3, v1

    move-object v9, v7

    goto :goto_0

    :sswitch_2
    const/16 v1, 0x20e

    const/16 v4, 0x9f4

    invoke-static {v0, v1, v6, v4}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۧۨۦۦ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e0\u06e2\u06e6"

    move-object v4, v1

    move-object v9, v7

    goto :goto_0

    :sswitch_3
    sget v7, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    const-string v1, "\u06e6\u06e6\u06e1"

    move v8, v7

    move-object v9, v1

    goto :goto_0

    :sswitch_4
    invoke-static {v5}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e3\u06df\u06e0"

    move-object v4, v1

    move-object v9, v7

    goto :goto_0

    :sswitch_5
    invoke-static {v2, p0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v7, "\u06e0\u06e3\u06e6"

    move-object v5, v1

    move-object v9, v7

    goto :goto_0

    :sswitch_6
    xor-int/lit8 v1, v8, 0x5f

    const-string v7, "\u06e4\u06e6"

    move v6, v1

    move-object v9, v7

    goto :goto_0

    :sswitch_7
    invoke-static {v5, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v7, "\u06e7\u06e7\u06e0"

    move-object v2, v1

    move-object v9, v7

    goto :goto_0

    :sswitch_8
    const-string v1, "\u06e3\u06e2\u06e4"

    move-object v9, v1

    goto :goto_0

    :sswitch_9
    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;

    move-result-object p0

    const-string v1, "\u06e8\u06e1\u06e3"

    move-object v9, v1

    goto :goto_0

    :sswitch_a
    return-object v3

    :sswitch_data_0
    .sparse-switch
        0xdc82 -> :sswitch_2
        0x1aa7ba -> :sswitch_0
        0x1aab24 -> :sswitch_7
        0x1aab43 -> :sswitch_4
        0x1aaf23 -> :sswitch_3
        0x1ab31d -> :sswitch_a
        0x1ab604 -> :sswitch_8
        0x1ab665 -> :sswitch_9
        0x1ac221 -> :sswitch_6
        0x1ac600 -> :sswitch_5
        0x1ac90a -> :sswitch_1
    .end sparse-switch
.end method

.method public static getConversationName(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

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
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v2

    const/16 v3, 0x224

    sget v4, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    xor-int/lit8 v4, v4, -0x62

    const/16 v5, 0x24c

    invoke-static {v2, v3, v4, v5}, Landroidx/loader/ۣۦ۟ۡ;->ۣ۟ۤ۟ۦ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, p0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۦۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    :goto_1
    :sswitch_3
    return-object v0

    :catchall_0
    move-exception v1

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_3
        0xef -> :sswitch_2
    .end sparse-switch
.end method

.method private static getConversationRandomApiType(Ljava/lang/String;)Ljava/lang/String;
    .locals 10

    const/4 v7, 0x0

    const/4 v1, 0x0

    const-string v9, "\u06e6\u06e4\u06df"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move v6, v7

    move v8, v7

    :goto_0
    invoke-static {v9}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {v0, p0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v7, "\u06e5\u06e8\u06e0"

    move-object v5, v1

    move-object v9, v7

    goto :goto_0

    :sswitch_0
    invoke-static {v4, p0}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۦۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e8\u06e5"

    move-object v2, v1

    move-object v9, v7

    goto :goto_0

    :sswitch_1
    invoke-static {v5}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e4\u06e3\u06e1"

    move-object v4, v1

    move-object v9, v7

    goto :goto_0

    :sswitch_2
    const/16 v1, 0x24e

    const/16 v7, 0x182

    invoke-static {v3, v1, v8, v7}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۤ۠ۡ([SIII)Ljava/lang/String;

    move-result-object p0

    const-string v1, "\u06df\u06e6\u06e3"

    move-object v9, v1

    goto :goto_0

    :sswitch_3
    sget v1, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۤۨۨ:I

    const-string v7, "\u06e6\u06e2\u06e7"

    move v6, v1

    move-object v9, v7

    goto :goto_0

    :sswitch_4
    xor-int/lit16 v7, v6, 0x11a

    const-string v1, "\u06e2\u06e3\u06e7"

    move v8, v7

    move-object v9, v1

    goto :goto_0

    :sswitch_5
    invoke-static {v5, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\u06e4\u06e6"

    move-object v9, v1

    goto :goto_0

    :sswitch_6
    const-string v1, "\u06e8\u06e2"

    move-object v9, v1

    goto :goto_0

    :sswitch_7
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v1

    const-string v7, "\u06e6\u06e0\u06e5"

    move-object v3, v1

    move-object v9, v7

    goto :goto_0

    :sswitch_8
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v1

    const-string v7, "\u06e3\u06e1\u06e3"

    move-object v3, v1

    move-object v9, v7

    goto :goto_0

    :sswitch_9
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "\u06e1\u06e4\u06e3"

    move-object v5, v1

    move-object v9, v7

    goto :goto_0

    :sswitch_a
    const/16 v1, 0x238

    const/16 v4, 0x339

    invoke-static {v3, v1, v8, v4}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۥۡۤۧ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e8\u06e3\u06e7"

    move-object v4, v1

    move-object v9, v7

    goto :goto_0

    :sswitch_b
    xor-int/lit16 v7, v6, 0xc0

    const-string v1, "\u06e8\u06df\u06e7"

    move v8, v7

    move-object v9, v1

    goto :goto_0

    :sswitch_c
    sget v1, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    const-string v7, "\u06e6\u06e6\u06e6"

    move v6, v1

    move-object v9, v7

    goto :goto_0

    :sswitch_d
    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        0xdcfa -> :sswitch_8
        0xdcfd -> :sswitch_d
        0x1aa7dc -> :sswitch_0
        0x1aaf20 -> :sswitch_7
        0x1ab2c6 -> :sswitch_a
        0x1ab645 -> :sswitch_c
        0x1aba42 -> :sswitch_6
        0x1abe9d -> :sswitch_1
        0x1ac16b -> :sswitch_3
        0x1ac1ab -> :sswitch_4
        0x1ac1e1 -> :sswitch_9
        0x1ac226 -> :sswitch_b
        0x1ac8d0 -> :sswitch_2
        0x1ac94c -> :sswitch_5
    .end sparse-switch
.end method

.method private static getConversationsNeedingAutoRenewal()Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lkevin/fun/hook/SparkRenewHelper$SparkInfo;",
            ">;"
        }
    .end annotation

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۦۦ۟ۦ()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-static {v0}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->۟ۦۦۨ(Ljava/lang/Object;)Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Landroidx/interpolator/۟ۧۦ۟ۨ;->۟ۦۦۧۨ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v3

    :sswitch_0
    invoke-static {v3}, Landroidx/activity/ۣۦۡۥ;->ۣ۟ۧۧۡ(Ljava/lang/Object;)Z

    move-result v1

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
    if-nez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_3
    invoke-static {v3}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۦۥۦۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkevin/fun/hook/SparkRenewHelper$SparkInfo;

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-nez v0, :cond_1

    const/16 v1, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v1, 0x70a

    goto :goto_1

    :sswitch_6
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_7
    const v0, 0xbe22

    goto :goto_2

    :sswitch_8
    invoke-static {v0}, Landroidx/viewpager/ۣۢ۟ۤ;->۟۟ۨۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/SparkRenewHelper;->۟ۧۡۦۧ(Ljava/lang/Object;)Z

    move-result v4

    const v1, 0xbe7f

    :goto_3
    const v5, 0xbe90

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_9
    const v1, 0xbebd

    goto :goto_3

    :sswitch_a
    if-nez v4, :cond_2

    const v1, 0xbedc

    goto :goto_3

    :sswitch_b
    const v0, 0xbefb

    :goto_4
    const v1, 0xbf0c

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :sswitch_c
    const v0, 0xbf1a

    goto :goto_4

    :sswitch_d
    invoke-static {v0}, Landroidx/viewpager/ۣۢ۟ۤ;->۟۟ۨۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/SparkRenewHelper;->۠ۦۥۨ(Ljava/lang/Object;)Z

    move-result v4

    const v1, 0xc202

    :goto_5
    const v5, 0xc213

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_5

    goto :goto_5

    :sswitch_e
    if-eqz v4, :cond_3

    const v1, 0xc25f

    goto :goto_5

    :cond_3
    :sswitch_f
    const v1, 0xc240

    goto :goto_5

    :sswitch_10
    const v0, 0xc27e

    :goto_6
    const v1, 0xc28f

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_6

    goto :goto_6

    :sswitch_11
    const v0, 0xc29d

    goto :goto_6

    :sswitch_12
    invoke-static {v2, v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۣۣۢ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    const v0, 0xc2fa

    :goto_7
    const v1, 0xc30b

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_7

    goto :goto_7

    :sswitch_13
    const v0, 0xc5a4

    goto :goto_7

    :sswitch_14
    return-object v2

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_1
        0x31 -> :sswitch_2
        0xcc -> :sswitch_14
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
        0x11 -> :sswitch_7
        0xb97b -> :sswitch_0
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_d
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_0
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
        0x12 -> :sswitch_0
        0xf1 -> :sswitch_11
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_13
        0x6af -> :sswitch_0
    .end sparse-switch
.end method

.method public static getCustomMessage()Ljava/lang/String;
    .locals 5

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۥۨۦۡ()Landroid/content/Context;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x251

    sget v3, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣ۠ۢۢ:I

    xor-int/lit8 v3, v3, -0x6d

    const/16 v4, 0x85e

    invoke-static {v0, v1, v3, v4}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣۣ۟ۤۤ([SIII)Ljava/lang/String;

    move-result-object v0

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
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v1

    const/16 v2, 0x253

    sget v3, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۨۥۦ۟:I

    xor-int/lit16 v3, v3, 0x299

    const/16 v4, 0x278

    invoke-static {v1, v2, v3, v4}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢۦۤ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۦۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :sswitch_3
    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_3
        0xef -> :sswitch_2
    .end sparse-switch
.end method

.method private static getMainHandler()Landroid/os/Handler;
    .locals 2

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۦۣۧ۟()Landroid/os/Handler;

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
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۧۤۡۨ()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lkevin/fun/hook/SparkRenewHelper;->mainHandler:Landroid/os/Handler;

    :sswitch_3
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۦۣۧ۟()Landroid/os/Handler;

    move-result-object v0

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method private static getOrInstantiateHandler()Ljava/lang/Object;
    .locals 16

    const/4 v2, 0x0

    const/4 v1, 0x0

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۠ۧ۟ۢ()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟ۤۥۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/16 v3, 0x650

    :goto_0
    xor-int/lit16 v3, v3, 0x661

    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v3, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v0, :cond_0

    const/16 v3, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v3, 0x267

    sget v4, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣۡۢ۟:I

    xor-int/lit16 v4, v4, 0x32d

    const/16 v5, 0x62d

    invoke-static {v0, v3, v4, v5}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۦ۠ۧۨ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۦۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۦۡۨۨ()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟ۤۥۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v5, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x276

    sget v3, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۡۦۥۨ:I

    xor-int/lit16 v3, v3, 0x134

    const/16 v4, 0x4b7

    invoke-static {v0, v1, v3, v4}, Landroidx/versionedparcelable/۠ۡۧۤ;->۟۟ۤۢۡ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۦۣ(Ljava/lang/Object;)V

    move-object v0, v2

    :goto_2
    :sswitch_6
    return-object v0

    :sswitch_7
    :try_start_0
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۦ۠ۡۡ()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-static {v0, v3}, Lkevin/fun/hook/۟ۥ۠۠;->۟ۢۧۧۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۢۥۤ(Ljava/lang/Object;)[Ljava/lang/reflect/Constructor;

    move-result-object v6

    array-length v7, v6

    move v0, v1

    :sswitch_8
    const/16 v3, 0x748

    :goto_3
    xor-int/lit16 v3, v3, 0x759

    sparse-switch v3, :sswitch_data_2

    goto :goto_3

    :sswitch_9
    if-lt v0, v7, :cond_2

    const v3, 0xbe60

    goto :goto_3

    :cond_2
    :sswitch_a
    const v3, 0xbe41

    goto :goto_3

    :sswitch_b
    const v0, 0xbe7f

    :goto_4
    const v1, 0xbe90

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_3

    goto :goto_4

    :goto_5
    :sswitch_c
    move-object v0, v2

    goto :goto_2

    :sswitch_d
    const v0, 0xbe9e

    goto :goto_4

    :sswitch_e
    aget-object v8, v6, v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v3, 0x1

    :try_start_1
    invoke-static {v8, v3}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۢ۟ۨ۟(Ljava/lang/Object;Z)V

    invoke-static {v8}, Landroidx/customview/ۤۡۥ;->۟ۢ۟ۨۨ(Ljava/lang/Object;)[Ljava/lang/Class;

    move-result-object v9

    array-length v3, v9

    new-array v10, v3, [Ljava/lang/Object;

    move v4, v1

    :sswitch_f
    array-length v11, v9

    const v3, 0xbefb

    :goto_6
    const v12, 0xbf0c

    xor-int/2addr v3, v12

    sparse-switch v3, :sswitch_data_4

    goto :goto_6

    :cond_3
    :sswitch_10
    const v3, 0xbf39

    goto :goto_6

    :sswitch_11
    if-lt v4, v11, :cond_3

    const v3, 0xc1e3

    goto :goto_6

    :sswitch_12
    invoke-static {v8, v10}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۡ۟ۥۦ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۠ۧ۟ۢ()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v4

    invoke-static {v4, v3}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۡۥۦ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۨ۟ۨۢ()V

    move-object v0, v3

    goto :goto_2

    :sswitch_13
    aget-object v11, v9, v4

    invoke-static {v5}, Landroidx/emoji2/ۢۧۡۧ;->۟ۤۤۨۢ(Ljava/lang/Object;)Ljava/lang/Class;

    move-result-object v3

    invoke-static {v11, v3}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->۟ۥۧۤ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    const v3, 0xc202

    :goto_7
    const v13, 0xc213

    xor-int/2addr v3, v13

    sparse-switch v3, :sswitch_data_5

    goto :goto_7

    :sswitch_14
    if-eqz v12, :cond_4

    const v3, 0xc25f

    goto :goto_7

    :cond_4
    :sswitch_15
    const v3, 0xc240

    goto :goto_7

    :sswitch_16
    aput-object v5, v10, v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const v3, 0xc27e

    :goto_8
    const v11, 0xc28f

    xor-int/2addr v3, v11

    sparse-switch v3, :sswitch_data_6

    goto :goto_8

    :goto_9
    :sswitch_17
    sget v3, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۨ۠ۨ:I

    xor-int/lit16 v3, v3, 0x35a

    add-int/2addr v4, v3

    const v3, 0xd581

    :goto_a
    const v11, 0xd592

    xor-int/2addr v3, v11

    sparse-switch v3, :sswitch_data_7

    goto :goto_a

    :sswitch_18
    const v3, 0xd5a0

    goto :goto_a

    :sswitch_19
    const v3, 0xc29d

    goto :goto_8

    :sswitch_1a
    :try_start_2
    invoke-static {}, Landroidx/loader/۟۠ۢۧۡ;->۟۟۠ۢۨ()Ljava/lang/Class;

    move-result-object v12

    const v3, 0xc2fa

    :goto_b
    const v13, 0xc30b

    xor-int/2addr v3, v13

    sparse-switch v3, :sswitch_data_8

    goto :goto_b

    :sswitch_1b
    if-eq v11, v12, :cond_5

    const v3, 0xc5e2

    goto :goto_b

    :cond_5
    :sswitch_1c
    const v3, 0xc5c3

    goto :goto_b

    :sswitch_1d
    const v3, 0xc601

    :goto_c
    const v12, 0xc612

    xor-int/2addr v3, v12

    sparse-switch v3, :sswitch_data_9

    goto :goto_c

    :sswitch_1e
    const-class v3, Ljava/lang/Integer;

    if-ne v11, v3, :cond_6

    const v3, 0xc65e

    goto :goto_c

    :cond_6
    :sswitch_1f
    const v3, 0xc63f

    goto :goto_c

    :sswitch_20
    const v3, 0xc67d

    :goto_d
    const v11, 0xc68e

    xor-int/2addr v3, v11

    sparse-switch v3, :sswitch_data_a

    goto :goto_d

    :sswitch_21
    const/4 v3, 0x0

    invoke-static {v3}, Landroidx/activity/ۤۧۧۧ;->ۣ۟ۦۣ۠(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v10, v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_9

    :catchall_0
    move-exception v3

    :try_start_3
    invoke-static {v3}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣۡۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v8

    const/16 v9, 0x2a0

    sget v10, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    xor-int/lit8 v10, v10, 0x57

    const/16 v11, 0x60a

    invoke-static {v8, v9, v10, v11}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦۣ۠ۤ([SIII)Ljava/lang/String;

    move-result-object v8

    invoke-static {v4, v8}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {v4, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v3}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۦۣ(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    sget v3, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/lit16 v3, v3, 0x31e

    add-int/2addr v0, v3

    const v3, 0xd888

    :goto_e
    const v4, 0xd899

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_b

    goto :goto_e

    :sswitch_22
    const v3, 0xd8a7

    goto :goto_e

    :sswitch_23
    const v3, 0xc69c

    goto :goto_d

    :sswitch_24
    :try_start_4
    invoke-static {}, Landroidx/loader/ۣ۟۟ۧ۠;->۟ۧۤۨۧ()Ljava/lang/Class;

    move-result-object v12

    const v3, 0xc984

    :goto_f
    const v13, 0xc995

    xor-int/2addr v3, v13

    sparse-switch v3, :sswitch_data_c

    goto :goto_f

    :sswitch_25
    if-eq v11, v12, :cond_7

    const v3, 0xc9e1

    goto :goto_f

    :cond_7
    :sswitch_26
    const v3, 0xc9c2

    goto :goto_f

    :sswitch_27
    const v3, 0xca00

    :goto_10
    const v12, 0xca11

    xor-int/2addr v3, v12

    sparse-switch v3, :sswitch_data_d

    goto :goto_10

    :cond_8
    :sswitch_28
    const v3, 0xca3e

    goto :goto_10

    :sswitch_29
    const-class v3, Ljava/lang/Long;

    if-ne v11, v3, :cond_8

    const v3, 0xca5d

    goto :goto_10

    :sswitch_2a
    const v3, 0xca7c

    :goto_11
    const v11, 0xca8d

    xor-int/2addr v3, v11

    sparse-switch v3, :sswitch_data_e

    goto :goto_11

    :sswitch_2b
    const v3, 0xcd26

    goto :goto_11

    :sswitch_2c
    invoke-static {}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۥۧۧۥ()Ljava/lang/Class;

    move-result-object v12

    const v3, 0xcd83

    :goto_12
    const v13, 0xcd94

    xor-int/2addr v3, v13

    sparse-switch v3, :sswitch_data_f

    goto :goto_12

    :sswitch_2d
    if-eq v11, v12, :cond_9

    const v3, 0xcde0

    goto :goto_12

    :cond_9
    :sswitch_2e
    const v3, 0xcdc1

    goto :goto_12

    :sswitch_2f
    const v3, 0xcdff

    :goto_13
    const v12, 0xce10

    xor-int/2addr v3, v12

    sparse-switch v3, :sswitch_data_10

    goto :goto_13

    :cond_a
    :sswitch_30
    const v3, 0xce3d

    goto :goto_13

    :sswitch_31
    const-class v3, Ljava/lang/Boolean;

    if-ne v11, v3, :cond_a

    const v3, 0xd0e7

    goto :goto_13

    :sswitch_32
    const v3, 0xd106

    :goto_14
    const v11, 0xd117

    xor-int/2addr v3, v11

    sparse-switch v3, :sswitch_data_11

    goto :goto_14

    :sswitch_33
    const v3, 0xd125

    goto :goto_14

    :sswitch_34
    const/4 v3, 0x0

    aput-object v3, v10, v4

    const v3, 0xd182

    :goto_15
    const v11, 0xd193

    xor-int/2addr v3, v11

    sparse-switch v3, :sswitch_data_12

    goto :goto_15

    :sswitch_35
    const v3, 0xd1a1

    goto :goto_15

    :sswitch_36
    const/4 v3, 0x0

    invoke-static {v3}, Landroidx/loader/ۡۢۢ;->ۤۨۡۥ(Z)Ljava/lang/Boolean;

    move-result-object v3

    aput-object v3, v10, v4

    const v3, 0xd1fe

    :goto_16
    const v11, 0xd20f

    xor-int/2addr v3, v11

    sparse-switch v3, :sswitch_data_13

    goto :goto_16

    :sswitch_37
    const v3, 0xd4a8

    goto :goto_16

    :sswitch_38
    const-wide/16 v12, 0x13

    sget v3, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۥۧ۟:I

    int-to-long v14, v3

    xor-long/2addr v12, v14

    invoke-static {v12, v13}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟۟۟ۦۤ(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v10, v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    const v3, 0xd505

    :goto_17
    const v11, 0xd516

    xor-int/2addr v3, v11

    sparse-switch v3, :sswitch_data_14

    goto :goto_17

    :sswitch_39
    const v3, 0xd524

    goto :goto_17

    :catchall_1
    move-exception v0

    invoke-static {v0}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣۡۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v3

    const/16 v4, 0x2be

    sget v5, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    xor-int/lit16 v5, v5, 0x23b

    const/16 v6, 0xa73

    invoke-static {v3, v4, v5, v6}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۢ۠ۥۨ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۦۣ(Ljava/lang/Object;)V

    goto/16 :goto_5

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

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_9
        0xb918 -> :sswitch_e
        0xb939 -> :sswitch_b
        0xb97b -> :sswitch_a
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_c
        0xef -> :sswitch_d
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_10
        0x35 -> :sswitch_13
        0x1f7 -> :sswitch_11
        0x7eef -> :sswitch_12
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_14
        0x32 -> :sswitch_15
        0x4c -> :sswitch_16
        0x53 -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_17
        0xf1 -> :sswitch_19
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x13 -> :sswitch_18
        0x32 -> :sswitch_f
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x1f1 -> :sswitch_1b
        0x6af -> :sswitch_1c
        0x6c8 -> :sswitch_21
        0x6e9 -> :sswitch_1d
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x13 -> :sswitch_1e
        0x2d -> :sswitch_24
        0x32 -> :sswitch_1f
        0x4c -> :sswitch_20
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x12 -> :sswitch_21
        0xf3 -> :sswitch_23
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0x11 -> :sswitch_22
        0x3e -> :sswitch_8
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0x11 -> :sswitch_25
        0x36 -> :sswitch_26
        0x57 -> :sswitch_38
        0x74 -> :sswitch_27
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0xe -> :sswitch_28
        0x11 -> :sswitch_29
        0x2f -> :sswitch_2c
        0x4c -> :sswitch_2a
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xf1 -> :sswitch_2b
        0x7ab -> :sswitch_38
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x17 -> :sswitch_2d
        0x36 -> :sswitch_2e
        0x55 -> :sswitch_36
        0x74 -> :sswitch_2f
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0xe -> :sswitch_30
        0x2d -> :sswitch_34
        0x3ef -> :sswitch_31
        0x1ef7 -> :sswitch_32
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x11 -> :sswitch_33
        0x32 -> :sswitch_36
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x11 -> :sswitch_35
        0x32 -> :sswitch_17
    .end sparse-switch

    :sswitch_data_13
    .sparse-switch
        0x3f1 -> :sswitch_37
        0x6a7 -> :sswitch_17
    .end sparse-switch

    :sswitch_data_14
    .sparse-switch
        0x13 -> :sswitch_39
        0x32 -> :sswitch_17
    .end sparse-switch
.end method

.method private static getOrInstantiateMessage()Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟۠ۧۤ۠()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟ۤۥۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

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
    :try_start_0
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v1

    const/16 v2, 0x2d3

    sget v3, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v3, v3, 0x123

    const/16 v4, 0x230

    invoke-static {v1, v2, v3, v4}, Landroidx/emoji2/ۢۧۡۧ;->۟ۥۢ۟ۢ([SIII)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lkevin/fun/hook/SparkRenewHelper;->۟ۢۥ۟۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    :goto_1
    return-object v0

    :sswitch_3
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x2d8

    sget v2, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    xor-int/lit16 v2, v2, 0x38c

    const/16 v3, 0x233

    invoke-static {v0, v1, v2, v3}, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۥۧۤ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۦۣ(Ljava/lang/Object;)V

    const/4 v0, 0x0

    goto :goto_1

    :catchall_0
    move-exception v1

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

.method private static getRandomApiName(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x304

    sget v2, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۡۦۥۨ:I

    xor-int/lit16 v2, v2, 0x11a

    const/16 v3, 0x98b

    invoke-static {v0, v1, v2, v3}, Landroidx/activity/ۦۧۥۥ;->۟ۤۡۦۦ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x308

    sget v2, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    xor-int/lit16 v2, v2, 0xc1

    const/16 v3, 0x465

    invoke-static {v0, v1, v2, v3}, Landroidx/drawerlayout/ۤۨۡۤ;->ۤ۠ۤ۠([SIII)Ljava/lang/String;

    move-result-object v0

    :goto_1
    return-object v0

    :sswitch_3
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x30a

    sget v2, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v2, v2, 0x122

    const/16 v3, 0x86f

    invoke-static {v0, v1, v2, v3}, Landroidx/customview/ۡۤۡۤ;->ۧ۟ۤۨ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x6cc

    :goto_2
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_2

    :sswitch_4
    if-eqz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_2

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_2

    :sswitch_6
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x30e

    sget v2, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    xor-int/lit8 v2, v2, 0x70

    const/16 v3, 0x487

    invoke-static {v0, v1, v2, v3}, Landroidx/emoji2/ۢۧۡۧ;->۟ۥۢ۟ۢ([SIII)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :sswitch_7
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x310

    sget v2, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۤ۟ۨ:I

    xor-int/lit16 v2, v2, -0x1ad

    const/16 v3, 0xc46

    invoke-static {v0, v1, v2, v3}, Landroidx/customview/ۤۡۥ;->۟ۢۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

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
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x313

    sget v2, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۥۧ۟:I

    xor-int/lit8 v2, v2, 0x11

    const/16 v3, 0xbfa

    invoke-static {v0, v1, v2, v3}, Landroidx/activity/ۦۧۥۥ;->۟ۤۡۦۦ([SIII)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :sswitch_b
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x315

    sget v2, Landroidx/activity/ۣۦۡۥ;->ۣۢۤۡ:I

    xor-int/lit8 v2, v2, 0x7

    const/16 v3, 0x6c8

    invoke-static {v0, v1, v2, v3}, Landroidx/startup/۟ۦۤۨۧ;->۟ۦۦۦ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xbe7f

    :goto_4
    const v2, 0xbe90

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_3

    goto :goto_4

    :cond_3
    :sswitch_c
    const v0, 0xbebd

    goto :goto_4

    :sswitch_d
    if-eqz v1, :cond_3

    const v0, 0xbedc

    goto :goto_4

    :sswitch_e
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x31a

    sget v2, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣ۠ۧ:I

    xor-int/lit16 v2, v2, -0x1ea

    const/16 v3, 0x43c

    invoke-static {v0, v1, v2, v3}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۧۢۨۡ([SIII)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_1

    :sswitch_f
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x31c

    sget v2, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    xor-int/lit16 v2, v2, -0x3c7

    const/16 v3, 0xb00

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟ۡۧۨ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xbefb

    :goto_5
    const v2, 0xbf0c

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_4

    goto :goto_5

    :cond_4
    :sswitch_10
    const v0, 0xbf39

    goto :goto_5

    :sswitch_11
    if-eqz v1, :cond_4

    const v0, 0xc1e3

    goto :goto_5

    :sswitch_12
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x321

    sget v2, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۡۨۨۧ:I

    xor-int/lit16 v2, v2, -0x1e6

    const/16 v3, 0x348

    invoke-static {v0, v1, v2, v3}, Landroidx/activity/ۤۧۧۧ;->ۣ۟۟۠ۡ([SIII)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_1

    :sswitch_13
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x323

    sget v2, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    xor-int/lit8 v2, v2, -0x18

    const/16 v3, 0x725

    invoke-static {v0, v1, v2, v3}, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۡۨۧ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xc202

    :goto_6
    const v2, 0xc213

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :sswitch_14
    if-eqz v1, :cond_5

    const v0, 0xc25f

    goto :goto_6

    :cond_5
    :sswitch_15
    const v0, 0xc240

    goto :goto_6

    :sswitch_16
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x327

    sget v2, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۤۦۤۧ:I

    xor-int/lit16 v2, v2, 0x15d

    const/16 v3, 0x392

    invoke-static {v0, v1, v2, v3}, Lkevin/fun/hook/۟ۥ۠۠;->ۣۨۢ۟([SIII)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_1

    :sswitch_17
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x329

    sget v2, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢ۟ۥ:I

    xor-int/lit16 v2, v2, 0x170

    const/16 v3, 0x67b

    invoke-static {v0, v1, v2, v3}, Lorg/luckypray/dexkit/۠۠ۥ;->۟ۥۧۦ۠([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xc27e

    :goto_7
    const v2, 0xc28f

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_6

    goto :goto_7

    :cond_6
    :sswitch_18
    const v0, 0xc2bc

    goto :goto_7

    :sswitch_19
    if-eqz v1, :cond_6

    const v0, 0xc2db

    goto :goto_7

    :sswitch_1a
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x32d

    sget v2, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۧۨۨ:I

    xor-int/lit8 v2, v2, -0x62

    const/16 v3, 0x75c

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۢۥ۠۟([SIII)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_1

    :sswitch_1b
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x330

    sget v2, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۤۨۨ:I

    xor-int/lit16 v2, v2, 0x108

    const/16 v3, 0xb64

    invoke-static {v0, v1, v2, v3}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۢۦۣ۠([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xc2fa

    :goto_8
    const v2, 0xc30b

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_7

    goto :goto_8

    :sswitch_1c
    if-eqz v1, :cond_7

    const v0, 0xc5e2

    goto :goto_8

    :cond_7
    :sswitch_1d
    const v0, 0xc5c3

    goto :goto_8

    :sswitch_1e
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x334

    sget v2, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    xor-int/lit8 v2, v2, -0x16

    const/16 v3, 0x60f

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۢ۠ۥۨ([SIII)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_1

    :sswitch_1f
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x33a

    sget v2, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    xor-int/lit16 v2, v2, 0x308

    const/16 v3, 0x500

    invoke-static {v0, v1, v2, v3}, Lorg/luckypray/dexkit/۠۠ۥ;->۟ۥۧۦ۠([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xc601

    :goto_9
    const v2, 0xc612

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_8

    goto :goto_9

    :sswitch_20
    if-eqz v1, :cond_8

    const v0, 0xc65e

    goto :goto_9

    :cond_8
    :sswitch_21
    const v0, 0xc63f

    goto :goto_9

    :sswitch_22
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x33f

    sget v2, Landroidx/customview/ۡۤۡۤ;->۟ۦ۟ۨۨ:I

    xor-int/lit16 v2, v2, 0xf7

    const/16 v3, 0x791

    invoke-static {v0, v1, v2, v3}, Lkevin/fun/hook/۟ۥ۠۠;->ۣۨۢ۟([SIII)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_1

    :sswitch_23
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x343

    sget v2, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    xor-int/lit16 v2, v2, 0x22a

    const/16 v3, 0x3f2

    invoke-static {v0, v1, v2, v3}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦۣ۠ۤ([SIII)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_1

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
        0x2d -> :sswitch_f
        0x4c -> :sswitch_e
        0xef -> :sswitch_d
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_10
        0x35 -> :sswitch_13
        0x1f7 -> :sswitch_11
        0x7eef -> :sswitch_12
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_14
        0x32 -> :sswitch_15
        0x4c -> :sswitch_16
        0x53 -> :sswitch_17
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_18
        0x33 -> :sswitch_1b
        0x54 -> :sswitch_1a
        0xf1 -> :sswitch_19
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_1c
        0x6af -> :sswitch_1d
        0x6c8 -> :sswitch_1f
        0x6e9 -> :sswitch_1e
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_20
        0x2d -> :sswitch_23
        0x32 -> :sswitch_21
        0x4c -> :sswitch_22
    .end sparse-switch
.end method

.method private static getRandomApiUrl(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x347

    sget v2, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۤۨۨ:I

    xor-int/lit16 v2, v2, 0x108

    const/16 v3, 0x2b6

    invoke-static {v0, v1, v2, v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧ۠ۥ۟([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x34b

    sget v2, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    xor-int/lit16 v2, v2, 0x2dc

    const/16 v3, 0x6a3

    invoke-static {v0, v1, v2, v3}, Landroidx/activity/ۣۦۡۥ;->۟ۡۨ۟۟([SIII)Ljava/lang/String;

    move-result-object v0

    :goto_1
    return-object v0

    :sswitch_3
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x36d

    sget v2, Landroidx/customview/ۡۤۡۤ;->۟ۦ۟ۨۨ:I

    xor-int/lit16 v2, v2, 0xf7

    const/16 v3, 0x4fb

    invoke-static {v0, v1, v2, v3}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۢۤۤ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x6cc

    :goto_2
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_2

    :sswitch_4
    if-eqz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_2

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_2

    :sswitch_6
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x371

    sget v2, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    xor-int/lit16 v2, v2, -0x149

    const/16 v3, 0x931

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۥۡۤۧ([SIII)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :sswitch_7
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x393

    sget v2, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/lit16 v2, v2, 0x31c

    const/16 v3, 0xc9f

    invoke-static {v0, v1, v2, v3}, Landroidx/activity/ۦۧۥۥ;->۟ۤۡۦۦ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

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
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x396

    sget v2, Landroidx/activity/ۣۦۡۥ;->ۣۢۤۡ:I

    xor-int/lit8 v2, v2, 0x27

    const/16 v3, 0xb99

    invoke-static {v0, v1, v2, v3}, Landroidx/core/ۧ۟ۤۨ;->ۡۥ۟ۥ([SIII)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :sswitch_b
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x3bb

    sget v2, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۤ۟ۧۤ:I

    xor-int/lit16 v2, v2, -0x1e3

    const/16 v3, 0x2ea

    invoke-static {v0, v1, v2, v3}, Landroidx/emoji2/ۢۧۡۧ;->۟ۥۢ۟ۢ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xbe7f

    :goto_4
    const v2, 0xbe90

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_3

    goto :goto_4

    :cond_3
    :sswitch_c
    const v0, 0xbebd

    goto :goto_4

    :sswitch_d
    if-eqz v1, :cond_3

    const v0, 0xbedc

    goto :goto_4

    :sswitch_e
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x3c0

    sget v2, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    xor-int/lit16 v2, v2, 0x32e

    const/16 v3, 0x74a

    invoke-static {v0, v1, v2, v3}, Landroidx/loader/ۥۧۨۤ;->۟ۢۢ۠ۥ([SIII)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_1

    :sswitch_f
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x3e3

    sget v2, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۧۨۨ:I

    xor-int/lit8 v2, v2, -0x68

    const/16 v3, 0xa66

    invoke-static {v0, v1, v2, v3}, Landroidx/core/ۤۦ۟ۢ;->ۣۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xbefb

    :goto_5
    const v2, 0xbf0c

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_4

    goto :goto_5

    :cond_4
    :sswitch_10
    const v0, 0xbf39

    goto :goto_5

    :sswitch_11
    if-eqz v1, :cond_4

    const v0, 0xc1e3

    goto :goto_5

    :sswitch_12
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x3e8

    sget v2, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۥۦ:I

    xor-int/lit16 v2, v2, 0x242

    const/16 v3, 0x255

    invoke-static {v0, v1, v2, v3}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣ۟۠ۢۡ([SIII)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_1

    :sswitch_13
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x40d

    sget v2, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣ۠ۢۢ:I

    xor-int/lit8 v2, v2, -0x6b

    const/16 v3, 0x902

    invoke-static {v0, v1, v2, v3}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۦ۠ۧۨ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xc202

    :goto_6
    const v2, 0xc213

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :sswitch_14
    if-eqz v1, :cond_5

    const v0, 0xc25f

    goto :goto_6

    :cond_5
    :sswitch_15
    const v0, 0xc240

    goto :goto_6

    :sswitch_16
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x411

    sget v2, Landroidx/appcompat/ۣۧۤۢ;->۟۠ۡۤۤ:I

    xor-int/lit16 v2, v2, -0xd0

    const/16 v3, 0x238

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢ۟ۥۨ([SIII)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_1

    :sswitch_17
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x434

    sget v2, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۥۨ:I

    xor-int/lit16 v2, v2, 0x280

    const/16 v3, 0x639

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢۦۤ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xc27e

    :goto_7
    const v2, 0xc28f

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_6

    goto :goto_7

    :cond_6
    :sswitch_18
    const v0, 0xc2bc

    goto :goto_7

    :sswitch_19
    if-eqz v1, :cond_6

    const v0, 0xc2db

    goto :goto_7

    :sswitch_1a
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x438

    sget v2, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    xor-int/lit8 v2, v2, -0x55

    const/16 v3, 0xc41

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟ۡۧۨ([SIII)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_1

    :sswitch_1b
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x459

    sget v2, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦۦۤ۟:I

    xor-int/lit16 v2, v2, 0x88

    const/16 v3, 0x1f1

    invoke-static {v0, v1, v2, v3}, Landroidx/loader/ۥۧۨۤ;->۟ۢۢ۠ۥ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xc2fa

    :goto_8
    const v2, 0xc30b

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_7

    goto :goto_8

    :sswitch_1c
    if-eqz v1, :cond_7

    const v0, 0xc5e2

    goto :goto_8

    :cond_7
    :sswitch_1d
    const v0, 0xc5c3

    goto :goto_8

    :sswitch_1e
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x45d

    sget v2, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    xor-int/lit16 v2, v2, -0x14a

    const/16 v3, 0x4cb

    invoke-static {v0, v1, v2, v3}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟۟۠ۤۤ([SIII)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_1

    :sswitch_1f
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x480

    sget v2, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۧۨۨ:I

    xor-int/lit8 v2, v2, -0x68

    const/16 v3, 0x59c

    invoke-static {v0, v1, v2, v3}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۧۢۨۡ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xc601

    :goto_9
    const v2, 0xc612

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_8

    goto :goto_9

    :sswitch_20
    if-eqz v1, :cond_8

    const v0, 0xc65e

    goto :goto_9

    :cond_8
    :sswitch_21
    const v0, 0xc63f

    goto :goto_9

    :sswitch_22
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x485

    sget v2, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۣۧۢ:I

    xor-int/lit16 v2, v2, -0x3e1

    const/16 v3, 0x6c4

    invoke-static {v0, v1, v2, v3}, Landroidx/core/ktx/۟۟ۡۢ۠;->۟ۢۦۧ([SIII)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_1

    :sswitch_23
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x4ab

    sget v2, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۡۨۨۧ:I

    xor-int/lit16 v2, v2, -0x1c6

    const/16 v3, 0xbbb

    invoke-static {v0, v1, v2, v3}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۦۥۢ([SIII)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_1

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
        0x2d -> :sswitch_f
        0x4c -> :sswitch_e
        0xef -> :sswitch_d
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_10
        0x35 -> :sswitch_13
        0x1f7 -> :sswitch_11
        0x7eef -> :sswitch_12
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_14
        0x32 -> :sswitch_15
        0x4c -> :sswitch_16
        0x53 -> :sswitch_17
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_18
        0x33 -> :sswitch_1b
        0x54 -> :sswitch_1a
        0xf1 -> :sswitch_19
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_1c
        0x6af -> :sswitch_1d
        0x6c8 -> :sswitch_1f
        0x6e9 -> :sswitch_1e
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_20
        0x2d -> :sswitch_23
        0x32 -> :sswitch_21
        0x4c -> :sswitch_22
    .end sparse-switch
.end method

.method private static getRandomSayingText(Ljava/lang/String;)Ljava/lang/String;
    .locals 11

    const/4 v4, 0x0

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x4cd

    sget v2, Landroidx/activity/ۨ۠۟ۧ;->۟ۦۥۢۢ:I

    xor-int/lit16 v2, v2, 0x337

    const/16 v3, 0xcc1

    invoke-static {v0, v1, v2, v3}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۦ۠ۧۨ([SIII)Ljava/lang/String;

    move-result-object v1

    :try_start_0
    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper;->۟ۦ۟ۢ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lkevin/fun/hook/SparkRenewHelper;->۟ۥۣۤۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/net/URL;

    invoke-direct {v2, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۡۨۢ(Ljava/lang/Object;)Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    :try_start_1
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v2

    const/16 v3, 0x4cf

    sget v6, Landroidx/activity/ۦۧۥۥ;->۟ۦۢۧۤ:I

    xor-int/lit8 v6, v6, -0x38

    const/16 v7, 0xb60

    invoke-static {v2, v3, v6, v7}, Landroidx/loader/ۡۢۢ;->ۡ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۤ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v2, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    xor-int/lit16 v2, v2, 0x13c1

    invoke-static {v0, v2}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۧ۟ۦۥ(Ljava/lang/Object;I)V

    invoke-static {v0, v2}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣ۟۟ۦ(Ljava/lang/Object;I)V

    const/4 v2, 0x0

    invoke-static {v0, v2}, Landroidx/startup/۟ۦۤۨۧ;->ۣ۟ۧۢۡ(Ljava/lang/Object;Z)V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v2

    const/16 v3, 0x4d2

    sget v6, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۦۣۧ:I

    xor-int/lit8 v6, v6, -0x71

    const/16 v7, 0x32f

    invoke-static {v2, v3, v6, v7}, Landroidx/activity/ۨ۠۟ۧ;->۟ۡۨۨۧ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v3

    const/16 v6, 0x4dc

    sget v7, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    xor-int/lit16 v7, v7, 0x172

    const/16 v8, 0x640

    invoke-static {v3, v6, v7, v8}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۢۤۤ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v2, v3}, Landroidx/activity/ۤۧۧۧ;->ۣ۠ۧۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Landroidx/loader/ۣ۟۟ۧ۠;->۟ۤ(Ljava/lang/Object;)I

    move-result v3

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
    const/16 v2, 0xc8

    if-eq v3, v2, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v6

    const/16 v7, 0x4e7

    sget v8, Lorg/luckypray/dexkit/۠۠ۥ;->ۣ۟ۡۢۡ:I

    xor-int/lit16 v8, v8, -0xfb

    const/16 v9, 0x645

    invoke-static {v6, v7, v8, v9}, Landroidx/activity/ۨ۠۟ۧ;->۟ۡۨۨۧ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v5

    const/16 v6, 0x4ff

    sget v7, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۤ۟ۧۤ:I

    xor-int/lit16 v7, v7, -0x1e2

    const/16 v8, 0xbff

    invoke-static {v5, v6, v7, v8}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۢ۠ۤۥ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v3}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۦۣ(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_c

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_4
    const/4 v2, 0x0

    :try_start_2
    invoke-static {v2}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۨ۠ۦ۟(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :sswitch_5
    const/16 v2, 0x748

    :goto_2
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v2, 0xbe22

    goto :goto_2

    :catchall_0
    move-exception v2

    const v2, 0xbe7f

    :goto_3
    const v3, 0xbe90

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_3

    goto :goto_3

    :sswitch_7
    const v2, 0xbe9e

    goto :goto_3

    :sswitch_8
    const v2, 0xbefb

    :goto_4
    const v3, 0xbf0c

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_4

    goto :goto_4

    :cond_1
    :sswitch_9
    const v2, 0xbf39

    goto :goto_4

    :sswitch_a
    if-eqz v0, :cond_1

    const v2, 0xc1e3

    goto :goto_4

    :sswitch_b
    :try_start_3
    invoke-static {v0}, Landroidx/emoji2/ۢۧۡۧ;->ۢۤۤۡ(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :sswitch_c
    const v0, 0xc202

    :goto_5
    const v2, 0xc213

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_5

    goto :goto_5

    :sswitch_d
    const v0, 0xc221

    goto :goto_5

    :catchall_1
    move-exception v0

    const v0, 0xc27e

    :goto_6
    const v2, 0xc28f

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_6

    goto :goto_6

    :sswitch_e
    const v0, 0xc29d

    goto :goto_6

    :sswitch_f
    move-object v0, v1

    :goto_7
    return-object v0

    :sswitch_10
    :try_start_4
    new-instance v3, Ljava/io/BufferedReader;

    new-instance v2, Ljava/io/InputStreamReader;

    invoke-static {v0}, Landroidx/customview/ۤۡۥ;->۠ۢ۠۟(Ljava/lang/Object;)Ljava/io/InputStream;

    move-result-object v6

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v7

    const/16 v8, 0x505

    sget v9, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۢ۠۠ۨ:I

    xor-int/lit8 v9, v9, -0x50

    const/16 v10, 0xcc9

    invoke-static {v7, v8, v9, v10}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢۦۤ([SIII)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v2, v6, v7}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    invoke-direct {v3, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_c

    :try_start_5
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    :sswitch_11
    invoke-static {v3}, Landroidx/loader/ۥۧۨۤ;->ۦۥۢ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const v2, 0xc2fa

    :goto_8
    const v7, 0xc30b

    xor-int/2addr v2, v7

    sparse-switch v2, :sswitch_data_7

    goto :goto_8

    :sswitch_12
    if-nez v6, :cond_2

    const v2, 0xc5e2

    goto :goto_8

    :cond_2
    :sswitch_13
    const v2, 0xc5c3

    goto :goto_8

    :sswitch_14
    invoke-static {v4}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroidx/documentfile/ۡۢ۟ۥ;->۠۠ۦۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroidx/documentfile/ۡۢ۟ۥ;->ۢۥۦۣ(Ljava/lang/Object;)Z

    move-result v6

    const v4, 0xc601

    :goto_9
    const v7, 0xc612

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_8

    goto :goto_9

    :sswitch_15
    if-eqz v6, :cond_3

    const v4, 0xc65e

    goto :goto_9

    :cond_3
    :sswitch_16
    const v4, 0xc63f

    goto :goto_9

    :sswitch_17
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v4

    const/16 v6, 0x50a

    sget v7, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v7, v7, 0x132

    const/16 v8, 0xb59

    invoke-static {v4, v6, v7, v8}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۤ۟۠([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۦۣ(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_d

    :try_start_6
    invoke-static {v3}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۨ۠ۦ۟(Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :sswitch_18
    const v2, 0xc67d

    :goto_a
    const v3, 0xc68e

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_9

    goto :goto_a

    :sswitch_19
    const v2, 0xca00

    :goto_b
    const v3, 0xca11

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_a

    goto :goto_b

    :cond_4
    :sswitch_1a
    const v2, 0xca3e

    goto :goto_b

    :sswitch_1b
    const v2, 0xc69c

    goto :goto_a

    :catchall_2
    move-exception v2

    const v2, 0xc984

    :goto_c
    const v3, 0xc995

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_b

    goto :goto_c

    :sswitch_1c
    const v2, 0xc9a3

    goto :goto_c

    :sswitch_1d
    if-eqz v0, :cond_4

    const v2, 0xca5d

    goto :goto_b

    :sswitch_1e
    :try_start_7
    invoke-static {v0}, Landroidx/emoji2/ۢۧۡۧ;->ۢۤۤۡ(Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :sswitch_1f
    const v0, 0xca7c

    :goto_d
    const v2, 0xca8d

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_c

    goto :goto_d

    :sswitch_20
    const v0, 0xcd26

    goto :goto_d

    :catchall_3
    move-exception v0

    const v0, 0xcd83

    :goto_e
    const v2, 0xcd94

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_d

    goto :goto_e

    :sswitch_21
    const v0, 0xcda2

    goto :goto_e

    :sswitch_22
    move-object v0, v1

    goto/16 :goto_7

    :sswitch_23
    :try_start_8
    invoke-static {v3}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۨ۠ۦ۟(Ljava/lang/Object;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    :sswitch_24
    const v1, 0xcdff

    :goto_f
    const v3, 0xce10

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_e

    goto :goto_f

    :sswitch_25
    const v1, 0xd182

    :goto_10
    const v3, 0xd193

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_f

    goto :goto_10

    :sswitch_26
    if-eqz v0, :cond_5

    const v1, 0xd1df

    goto :goto_10

    :sswitch_27
    const v1, 0xce1e

    goto :goto_f

    :catchall_4
    move-exception v1

    const v1, 0xd106

    :goto_11
    const v3, 0xd117

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_10

    goto :goto_11

    :sswitch_28
    const v1, 0xd125

    goto :goto_11

    :cond_5
    :sswitch_29
    const v1, 0xd1c0

    goto :goto_10

    :sswitch_2a
    :try_start_9
    invoke-static {v0}, Landroidx/emoji2/ۢۧۡۧ;->ۢۤۤۡ(Ljava/lang/Object;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    :sswitch_2b
    const v0, 0xd1fe

    :goto_12
    const v1, 0xd20f

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_11

    goto :goto_12

    :sswitch_2c
    const v0, 0xd4a8

    goto :goto_12

    :catchall_5
    move-exception v0

    const v0, 0xd505

    :goto_13
    const v1, 0xd516

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_12

    goto :goto_13

    :sswitch_2d
    const v0, 0xd524

    goto :goto_13

    :sswitch_2e
    move-object v0, v2

    goto/16 :goto_7

    :sswitch_2f
    :try_start_a
    invoke-static {v4, v6}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_d

    const v2, 0xd581

    :goto_14
    const v6, 0xd592

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_13

    goto :goto_14

    :sswitch_30
    const v2, 0xd5a0

    goto :goto_14

    :catchall_6
    move-exception v0

    move-object v2, v0

    move-object v3, v4

    move-object v5, v4

    :goto_15
    :try_start_b
    invoke-static {v2}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣۡۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v4

    const/16 v6, 0x51e

    sget v7, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    xor-int/lit16 v7, v7, 0x3b2

    const/16 v8, 0x652

    invoke-static {v4, v6, v7, v8}, Landroidx/versionedparcelable/۠ۡۧۤ;->۟۟ۤۢۡ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۦۣ(Ljava/lang/Object;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_9

    const v0, 0xd888

    :goto_16
    const v2, 0xd899

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_14

    goto :goto_16

    :sswitch_31
    if-eqz v3, :cond_6

    const v0, 0xd8e5

    goto :goto_16

    :cond_6
    :sswitch_32
    const v0, 0xd8c6

    goto :goto_16

    :sswitch_33
    :try_start_c
    invoke-static {v3}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۨ۠ۦ۟(Ljava/lang/Object;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    :sswitch_34
    const v0, 0xd904

    :goto_17
    const v2, 0xd915

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_15

    goto :goto_17

    :sswitch_35
    const v0, 0xd923

    goto :goto_17

    :catchall_7
    move-exception v0

    const v0, 0xd980

    :goto_18
    const v2, 0xd991

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_16

    goto :goto_18

    :sswitch_36
    const v0, 0xdc2a

    goto :goto_18

    :sswitch_37
    const v0, 0xdc87

    :goto_19
    const v2, 0xdc98

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_17

    goto :goto_19

    :sswitch_38
    if-eqz v5, :cond_7

    const v0, 0xdce4

    goto :goto_19

    :cond_7
    :sswitch_39
    const v0, 0xdcc5

    goto :goto_19

    :sswitch_3a
    :try_start_d
    invoke-static {v5}, Landroidx/emoji2/ۢۧۡۧ;->ۢۤۤۡ(Ljava/lang/Object;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    :sswitch_3b
    const v0, 0xdd03

    :goto_1a
    const v2, 0xdd14

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_18

    goto :goto_1a

    :sswitch_3c
    const v0, 0xdd22

    goto :goto_1a

    :catchall_8
    move-exception v0

    const v0, 0x1700af

    :goto_1b
    const v2, 0x1700c0

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_19

    goto :goto_1b

    :sswitch_3d
    const v0, 0x1700ce

    goto :goto_1b

    :sswitch_3e
    move-object v0, v1

    goto/16 :goto_7

    :catchall_9
    move-exception v0

    const v1, 0x17012b

    :goto_1c
    const v2, 0x17013c

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_1a

    goto :goto_1c

    :sswitch_3f
    if-eqz v3, :cond_8

    const v1, 0x170188

    goto :goto_1c

    :cond_8
    :sswitch_40
    const v1, 0x170169

    goto :goto_1c

    :sswitch_41
    :try_start_e
    invoke-static {v3}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۨ۠ۦ۟(Ljava/lang/Object;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_a

    :sswitch_42
    const v1, 0x1701a7

    :goto_1d
    const v2, 0x1701b8

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_1b

    goto :goto_1d

    :sswitch_43
    const v1, 0x170451

    goto :goto_1d

    :catchall_a
    move-exception v1

    const v1, 0x1704ae

    :goto_1e
    const v2, 0x1704bf

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_1c

    goto :goto_1e

    :sswitch_44
    const v1, 0x1704cd

    goto :goto_1e

    :sswitch_45
    const v1, 0x17052a

    :goto_1f
    const v2, 0x17053b

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_1d

    goto :goto_1f

    :sswitch_46
    if-eqz v5, :cond_9

    const v1, 0x170812

    goto :goto_1f

    :cond_9
    :sswitch_47
    const v1, 0x170568

    goto :goto_1f

    :sswitch_48
    :try_start_f
    invoke-static {v5}, Landroidx/emoji2/ۢۧۡۧ;->ۢۤۤۡ(Ljava/lang/Object;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_b

    :sswitch_49
    const v1, 0x170831

    :goto_20
    const v2, 0x170842

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_1e

    goto :goto_20

    :sswitch_4a
    throw v0

    :sswitch_4b
    const v1, 0x170850

    goto :goto_20

    :catchall_b
    move-exception v1

    const v1, 0x1708ad

    :goto_21
    const v2, 0x1708be

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_1f

    goto :goto_21

    :sswitch_4c
    const v1, 0x1708cc

    goto :goto_21

    :catchall_c
    move-exception v2

    move-object v3, v4

    move-object v5, v0

    goto/16 :goto_15

    :catchall_d
    move-exception v2

    move-object v5, v0

    goto/16 :goto_15

    nop

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
        0x36 -> :sswitch_3
        0x1d7 -> :sswitch_8
        0x1f4 -> :sswitch_4
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_8
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_5
        0xef -> :sswitch_7
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_9
        0x35 -> :sswitch_f
        0x1f7 -> :sswitch_a
        0x7eef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_d
        0x32 -> :sswitch_f
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_c
        0xf1 -> :sswitch_e
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_12
        0x6af -> :sswitch_13
        0x6c8 -> :sswitch_2f
        0x6e9 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_15
        0x2d -> :sswitch_23
        0x32 -> :sswitch_16
        0x4c -> :sswitch_17
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_19
        0xf3 -> :sswitch_1b
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0xe -> :sswitch_1a
        0x11 -> :sswitch_1d
        0x2f -> :sswitch_22
        0x4c -> :sswitch_1e
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0x11 -> :sswitch_1c
        0x36 -> :sswitch_18
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_20
        0x7ab -> :sswitch_22
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_21
        0x36 -> :sswitch_1f
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_25
        0x3ef -> :sswitch_27
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_26
        0x32 -> :sswitch_29
        0x4c -> :sswitch_2a
        0x53 -> :sswitch_2e
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x11 -> :sswitch_28
        0x32 -> :sswitch_24
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x3f1 -> :sswitch_2c
        0x6a7 -> :sswitch_2e
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x13 -> :sswitch_2d
        0x32 -> :sswitch_2b
    .end sparse-switch

    :sswitch_data_13
    .sparse-switch
        0x13 -> :sswitch_30
        0x32 -> :sswitch_11
    .end sparse-switch

    :sswitch_data_14
    .sparse-switch
        0x11 -> :sswitch_31
        0x3e -> :sswitch_32
        0x5f -> :sswitch_37
        0x7c -> :sswitch_33
    .end sparse-switch

    :sswitch_data_15
    .sparse-switch
        0x11 -> :sswitch_35
        0x36 -> :sswitch_37
    .end sparse-switch

    :sswitch_data_16
    .sparse-switch
        0x11 -> :sswitch_36
        0x5bb -> :sswitch_34
    .end sparse-switch

    :sswitch_data_17
    .sparse-switch
        0x1f -> :sswitch_38
        0x3e -> :sswitch_39
        0x5d -> :sswitch_3e
        0x7c -> :sswitch_3a
    .end sparse-switch

    :sswitch_data_18
    .sparse-switch
        0x17 -> :sswitch_3c
        0x36 -> :sswitch_3e
    .end sparse-switch

    :sswitch_data_19
    .sparse-switch
        0xe -> :sswitch_3b
        0x6f -> :sswitch_3d
    .end sparse-switch

    :sswitch_data_1a
    .sparse-switch
        0x17 -> :sswitch_3f
        0x55 -> :sswitch_45
        0x76 -> :sswitch_40
        0xb4 -> :sswitch_41
    .end sparse-switch

    :sswitch_data_1b
    .sparse-switch
        0x1f -> :sswitch_43
        0x5e9 -> :sswitch_45
    .end sparse-switch

    :sswitch_data_1c
    .sparse-switch
        0x11 -> :sswitch_44
        0x72 -> :sswitch_42
    .end sparse-switch

    :sswitch_data_1d
    .sparse-switch
        0x11 -> :sswitch_46
        0x53 -> :sswitch_4a
        0x72 -> :sswitch_47
        0xd29 -> :sswitch_48
    .end sparse-switch

    :sswitch_data_1e
    .sparse-switch
        0x12 -> :sswitch_4a
        0x73 -> :sswitch_4b
    .end sparse-switch

    :sswitch_data_1f
    .sparse-switch
        0x13 -> :sswitch_4c
        0x72 -> :sswitch_49
    .end sparse-switch
.end method

.method private static getSparkUserName(J)Ljava/lang/String;
    .locals 6

    const/4 v0, 0x0

    const-string v5, "\u06e4\u06e3\u06e8"

    move-object v1, v0

    move-object v2, v0

    move-object v3, v0

    move-object v4, v0

    :goto_0
    invoke-static {v5}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-static {v2, v3}, Landroidx/customview/ۡۤۡۤ;->۟ۥۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v0, "\u06e3\u06e0\u06e4"

    move-object v5, v0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۧۢۢ۠()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    const-string v5, "\u06e8\u06e6\u06e1"

    move-object v2, v0

    goto :goto_0

    :sswitch_1
    invoke-static {p0, p1}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟۟۟ۦۤ(J)Ljava/lang/Long;

    move-result-object v0

    const-string v5, "\u06e4\u06e1\u06e5"

    move-object v3, v0

    goto :goto_0

    :sswitch_2
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    const-string v5, "\u06e5\u06e4\u06e7"

    move-object v4, v0

    goto :goto_0

    :sswitch_3
    return-object v4

    :sswitch_data_0
    .sparse-switch
        0x1ab627 -> :sswitch_2
        0x1aba49 -> :sswitch_0
        0x1abe28 -> :sswitch_3
        0x1ac9a3 -> :sswitch_1
    .end sparse-switch
.end method

.method private static getTodayDateString()Ljava/lang/String;
    .locals 10

    const/4 v8, 0x0

    const/4 v1, 0x0

    const-string v6, "\u06e5\u06e4\u06e7"

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

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v1

    const-string v6, "\u06e6\u06df\u06e0"

    move-object v2, v1

    goto :goto_0

    :sswitch_0
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    const-string v6, "\u06e7\u06e7\u06e0"

    move-object v4, v1

    goto :goto_0

    :sswitch_1
    new-instance v1, Ljava/text/SimpleDateFormat;

    invoke-direct {v1, v5, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    const-string v6, "\u06e7\u06e0\u06e1"

    move-object v3, v1

    goto :goto_0

    :sswitch_2
    const/16 v1, 0x530

    const/16 v5, 0x18f

    invoke-static {v2, v1, v9, v5}, Landroidx/loader/ۥۧۨۤ;->۟ۢۢ۠ۥ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e5\u06e1\u06e8"

    move-object v5, v1

    goto :goto_0

    :sswitch_3
    invoke-static {}, Landroidx/activity/ۤۧۧۧ;->ۦۥۣ۟()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "\u06e2\u06e8\u06e4"

    move-object v6, v1

    goto :goto_0

    :sswitch_4
    invoke-static {v3, v4}, Landroidx/appcompat/resources/ۦۨۦۢ;->ۣ۟ۧۡۡ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e1\u06e7\u06e2"

    move-object v5, v1

    goto :goto_0

    :sswitch_5
    xor-int/lit16 v8, v7, 0x106

    const-string v1, "\u06e6\u06e7\u06e0"

    move-object v6, v1

    move v9, v8

    goto :goto_0

    :sswitch_6
    sget v7, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۤۨۨ:I

    const-string v1, "\u06e5\u06df\u06e0"

    move-object v6, v1

    goto :goto_0

    :sswitch_7
    return-object v5

    :sswitch_data_0
    .sparse-switch
        0x1aaf7c -> :sswitch_7
        0x1ab35e -> :sswitch_1
        0x1abd86 -> :sswitch_5
        0x1abdcc -> :sswitch_3
        0x1ac147 -> :sswitch_6
        0x1ac23f -> :sswitch_2
        0x1ac528 -> :sswitch_0
        0x1ac600 -> :sswitch_4
    .end sparse-switch
.end method

.method private static hasRenewedToday(Ljava/lang/String;)Z
    .locals 11

    const/4 v7, 0x0

    const/4 v1, 0x0

    const-string v10, "\u06e7\u06e3\u06e1"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move v6, v7

    move v8, v7

    move v9, v7

    :goto_0
    invoke-static {v10}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟۟ۨۡ()Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e2\u06df"

    move-object v5, v1

    move-object v10, v7

    goto :goto_0

    :sswitch_0
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const-string v1, "\u06e6\u06e3\u06e4"

    move-object v10, v1

    goto :goto_0

    :sswitch_1
    invoke-static {v4}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e1\u06e0\u06e2"

    move-object v5, v1

    move-object v10, v7

    goto :goto_0

    :sswitch_2
    invoke-static {v2, p0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v7, "\u06e5\u06e7\u06df"

    move-object v4, v1

    move-object v10, v7

    goto :goto_0

    :sswitch_3
    const/16 v1, 0x53a

    const/16 v5, 0xbc2

    invoke-static {v0, v1, v8, v5}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۧۢۨۡ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e4\u06e7\u06e7"

    move-object v5, v1

    move-object v10, v7

    goto :goto_0

    :sswitch_4
    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;

    move-result-object p0

    const-string v1, "\u06e0\u06e3\u06e3"

    move-object v10, v1

    goto :goto_0

    :sswitch_5
    invoke-static {v5, p0}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۦۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e1\u06e3"

    move-object v3, v1

    move-object v10, v7

    goto :goto_0

    :sswitch_6
    xor-int/lit16 v7, v9, 0xd2

    const-string v1, "\u06e8\u06df\u06e5"

    move v8, v7

    move-object v10, v1

    goto :goto_0

    :sswitch_7
    sget v7, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    const-string v1, "\u06e0\u06e3\u06e4"

    move v9, v7

    move-object v10, v1

    goto :goto_0

    :sswitch_8
    invoke-static {v5, v3}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const-string v7, "\u06e5\u06e1"

    move v6, v1

    move-object v10, v7

    goto :goto_0

    :sswitch_9
    invoke-static {v4, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v7, "\u06e2\u06df\u06e6"

    move-object v2, v1

    move-object v10, v7

    goto :goto_0

    :sswitch_a
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "\u06e3\u06e7"

    move-object v4, v1

    move-object v10, v7

    goto :goto_0

    :sswitch_b
    return v6

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc3d -> :sswitch_8
        0xdc64 -> :sswitch_0
        0xdc9c -> :sswitch_b
        0x1aab40 -> :sswitch_5
        0x1aab41 -> :sswitch_6
        0x1aaea3 -> :sswitch_4
        0x1ab249 -> :sswitch_2
        0x1abac4 -> :sswitch_9
        0x1abe7d -> :sswitch_1
        0x1ac1c7 -> :sswitch_7
        0x1ac585 -> :sswitch_a
        0x1ac8ce -> :sswitch_3
    .end sparse-switch
.end method

.method public static init(Ljava/lang/ClassLoader;Landroid/content/Context;)V
    .locals 3

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۧۡۤ()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroidx/loader/ۣۦ۟ۡ;->ۤۦ۟ۨ(Ljava/lang/Object;ZZ)Z

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
    invoke-static {}, Landroidx/drawerlayout/ۤۨۡۤ;->ۨۧۢۤ()I

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
    const-string v0, "KDrruYQBShaUp790y5QdvixS"

    invoke-static {v0}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->۟ۢۢۡۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :goto_2
    :sswitch_6
    return-void

    :sswitch_7
    sput-object p0, Lkevin/fun/hook/SparkRenewHelper;->classLoader:Ljava/lang/ClassLoader;

    sput-object p1, Lkevin/fun/hook/SparkRenewHelper;->hostContext:Landroid/content/Context;

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟۟ۨ۟()Landroid/os/Handler;

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

.method private static isConversationEnabled(Ljava/lang/String;)Z
    .locals 7

    const/4 v1, 0x0

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۦۦ۟ۦ()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-static {v0, p0}, Landroidx/customview/ۡۤۡۤ;->۟ۥۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkevin/fun/hook/SparkRenewHelper$SparkInfo;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v3

    const/16 v4, 0x54b

    sget v5, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۤۥ:I

    xor-int/lit16 v5, v5, 0x3ab

    const/16 v6, 0xc13

    invoke-static {v3, v4, v5, v6}, Landroidx/core/ۧ۟ۤۨ;->ۡۥ۟ۥ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, p0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۟ۥۤۦۥ(Ljava/lang/Object;)Z

    move-result v4

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
    if-eqz v4, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v0, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0, p0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۥۣۤۧ(Ljava/lang/Object;Z)Z

    move-result v0

    :goto_1
    return v0

    :sswitch_3
    const/16 v2, 0x6cc

    :goto_2
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_2

    :sswitch_4
    if-eqz v0, :cond_1

    const/16 v2, 0x729

    goto :goto_2

    :cond_1
    :sswitch_5
    const/16 v2, 0x70a

    goto :goto_2

    :sswitch_6
    invoke-static {v0}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۣ۟ۧ۠ۥ(Ljava/lang/Object;)Z

    move-result v2

    const/16 v0, 0x748

    :goto_3
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_3

    :sswitch_7
    if-eqz v2, :cond_2

    const v0, 0xbe60

    goto :goto_3

    :cond_2
    :sswitch_8
    const v0, 0xbe41

    goto :goto_3

    :sswitch_9
    const/4 v0, 0x1

    goto :goto_1

    :sswitch_a
    move v0, v1

    goto :goto_1

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
        0x1d7 -> :sswitch_a
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_7
        0xb918 -> :sswitch_a
        0xb939 -> :sswitch_9
        0xb97b -> :sswitch_8
    .end sparse-switch
.end method

.method public static isEnabled()Z
    .locals 5

    const/4 v0, 0x0

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۥۨۦۡ()Landroid/content/Context;

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
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v1

    const/16 v2, 0x55d

    sget v3, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۥۧ۟:I

    xor-int/lit8 v3, v3, 0x1

    const/16 v4, 0x8d8

    invoke-static {v1, v2, v3, v4}, Landroidx/interpolator/۟ۧۦ۟ۨ;->۠ۤۤۡ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۥۣۤۧ(Ljava/lang/Object;Z)Z

    move-result v0

    :sswitch_3
    return v0

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_3
        0xef -> :sswitch_2
    .end sparse-switch
.end method

.method private static isOnlySparkFilter()Z
    .locals 8

    const/4 v1, 0x0

    const/4 v5, 0x0

    const-string v3, "\u06e8\u06e2\u06e0"

    move-object v0, v1

    move-object v2, v1

    move v4, v5

    move v6, v5

    move v7, v5

    :goto_0
    invoke-static {v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    xor-int/lit16 v7, v6, 0x3b1

    const-string v1, "\u06e8\u06e5\u06e6"

    move-object v3, v1

    goto :goto_0

    :sswitch_0
    const/16 v1, 0x56f

    const/16 v2, 0x9a9

    invoke-static {v0, v1, v7, v2}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۧۨۦۦ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v3, "\u06e2\u06e6\u06e5"

    move-object v2, v1

    goto :goto_0

    :sswitch_1
    invoke-static {v2, v5}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۥۣۤۧ(Ljava/lang/Object;Z)Z

    move-result v4

    const-string v1, "\u06df\u06e3\u06e2"

    move-object v3, v1

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const-string v1, "\u06e8\u06e5\u06e2"

    move-object v3, v1

    goto :goto_0

    :sswitch_3
    sget v6, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    const-string v1, "\u06e2\u06e0\u06e6"

    move-object v3, v1

    goto :goto_0

    :sswitch_4
    return v4

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa77e -> :sswitch_4
        0x1ab321 -> :sswitch_1
        0x1ac926 -> :sswitch_2
        0x1ac985 -> :sswitch_3
        0x1ac989 -> :sswitch_0
    .end sparse-switch
.end method

.method private static isSendReady()Z
    .locals 3

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۥۣۨ()Ljava/lang/Object;

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۦ۟ۡۤ()Ljava/lang/Object;

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۦۡۨۨ()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟ۤۥۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۠ۧ۟ۢ()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟ۤۥۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟۠ۧۤ۠()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟ۤۥۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

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
    const/4 v0, 0x1

    const v1, 0xbe7f

    :goto_3
    const v2, 0xbe90

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :goto_4
    :sswitch_9
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۡۡۧۧ()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۥۥۤ۟(Ljava/lang/Object;Z)V

    return v0

    :sswitch_a
    const v1, 0xbe9e

    goto :goto_3

    :sswitch_b
    const/4 v0, 0x0

    goto :goto_4

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_b
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
        0xef -> :sswitch_a
    .end sparse-switch
.end method

.method private static isUseCustomMessage(Ljava/lang/String;)Z
    .locals 10

    const/4 v1, 0x0

    const/4 v7, 0x0

    const-string v5, "\u06e3\u06e5\u06e0"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move v6, v7

    move v8, v7

    move v9, v7

    :goto_0
    invoke-static {v5}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {v4}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v5, "\u06e6\u06e5\u06e3"

    move-object v3, v1

    goto :goto_0

    :sswitch_0
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v1

    const-string v5, "\u06e1\u06e7\u06e3"

    move-object v2, v1

    goto :goto_0

    :sswitch_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\u06e4\u06e0\u06e7"

    move-object v4, v1

    goto :goto_0

    :sswitch_2
    invoke-static {v3, v7}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۥۣۤۧ(Ljava/lang/Object;Z)Z

    move-result v6

    const-string v1, "\u06e0\u06df\u06e2"

    move-object v5, v1

    goto :goto_0

    :sswitch_3
    sget v8, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    const-string v1, "\u06e4\u06e2"

    move-object v5, v1

    goto :goto_0

    :sswitch_4
    const/16 v1, 0x580

    const/16 v3, 0x4be

    invoke-static {v2, v1, v9, v3}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۢۦۣ۠([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v5, "\u06df\u06e2\u06e8"

    move-object v3, v1

    goto :goto_0

    :sswitch_5
    invoke-static {v0, p0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v5, "\u06e0\u06e6\u06e0"

    move-object v4, v1

    goto :goto_0

    :sswitch_6
    xor-int/lit8 v9, v8, -0x6

    const-string v1, "\u06e6\u06e7\u06e7"

    move-object v5, v1

    goto :goto_0

    :sswitch_7
    const-string v1, "\u06e4\u06e7\u06e1"

    move-object v5, v1

    goto :goto_0

    :sswitch_8
    invoke-static {v4, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\u06e5\u06e3\u06e5"

    move-object v5, v1

    goto :goto_0

    :sswitch_9
    return v6

    :sswitch_data_0
    .sparse-switch
        0xdc7e -> :sswitch_6
        0x1aa765 -> :sswitch_8
        0x1aaac3 -> :sswitch_9
        0x1aaf7d -> :sswitch_3
        0x1ab6be -> :sswitch_1
        0x1ab9eb -> :sswitch_0
        0x1ababe -> :sswitch_2
        0x1abe07 -> :sswitch_5
        0x1ac204 -> :sswitch_7
        0x1ac246 -> :sswitch_4
    .end sparse-switch
.end method

.method static synthetic lambda$0(Landroid/app/Activity;)V
    .locals 0

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper;->۟ۦۤ۠۠(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic lambda$1(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Landroidx/customview/ۡۤۡۤ;->ۧۢۡۧ(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic lambda$10(Landroid/content/Context;Lkevin/fun/hook/SparkRenewHelper$SparkInfo;Ljava/lang/Runnable;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lkevin/fun/hook/SparkRenewHelper;->ۣۢۥ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic lambda$11(Landroid/content/Context;Lkevin/fun/hook/SparkRenewHelper$SparkInfo;Ljava/lang/Runnable;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lkevin/fun/hook/SparkRenewHelper;->۟ۥۤۢۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic lambda$12(Lkevin/fun/hook/SparkRenewHelper$SparkInfo;Ljava/lang/Runnable;Landroid/content/Context;Landroid/view/View;)V
    .locals 8

    const/4 v1, 0x0

    const/4 v5, 0x0

    const-string v7, "\u06e3\u06e8\u06e2"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move v4, v5

    move v6, v5

    :goto_0
    invoke-static {v7}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    const/16 v1, 0x596

    const/16 v3, 0x881

    invoke-static {v0, v1, v4, v3}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۨۤ۠۠([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e8\u06e2\u06e7"

    move-object v3, v1

    goto :goto_0

    :sswitch_0
    invoke-static {v3}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۧۨۢ(Ljava/lang/Object;)V

    const-string v1, "\u06e0\u06df\u06e2"

    move-object v7, v1

    goto :goto_0

    :sswitch_1
    xor-int/lit16 v1, v6, 0x209

    const-string v7, "\u06df\u06e4\u06df"

    move v4, v1

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/viewpager/ۣۢ۟ۤ;->۟۟ۨۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06df\u06e8\u06e4"

    move-object v3, v1

    goto :goto_0

    :sswitch_3
    sget v1, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    const-string v7, "\u06e1\u06e6\u06e0"

    move v6, v1

    goto :goto_0

    :sswitch_4
    const-string v1, "\u06df\u06e0\u06e1"

    move-object v7, v1

    goto :goto_0

    :sswitch_5
    const-string v1, "\u06e5\u06e0\u06df"

    move-object v7, v1

    goto :goto_0

    :sswitch_6
    invoke-static {p2, v3, v5}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۨۡ۠ۢ(Ljava/lang/Object;Ljava/lang/Object;I)Landroid/widget/Toast;

    move-result-object v1

    const-string v7, "\u06e5\u06e4\u06e2"

    move-object v2, v1

    goto :goto_0

    :sswitch_7
    invoke-static {p1}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۣ۠ۢۥ(Ljava/lang/Object;)V

    const-string v1, "\u06e8\u06e1\u06e2"

    move-object v7, v1

    goto :goto_0

    :sswitch_8
    invoke-static {v2}, Landroidx/viewpager/ۣۢ۟ۤ;->۠۠ۥۣ(Ljava/lang/Object;)V

    const-string v1, "\u06e4\u06e0\u06e4"

    move-object v7, v1

    goto :goto_0

    :sswitch_9
    const-string v1, "\u06e2\u06e1\u06e8"

    move-object v7, v1

    goto :goto_0

    :sswitch_a
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const-string v1, "\u06e5\u06e7\u06df"

    move-object v7, v1

    goto :goto_0

    :sswitch_b
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa720 -> :sswitch_9
        0x1aa81b -> :sswitch_0
        0x1aaac3 -> :sswitch_7
        0x1aaf5b -> :sswitch_1
        0x1ab289 -> :sswitch_5
        0x1ab71d -> :sswitch_2
        0x1ab9e8 -> :sswitch_b
        0x1abda4 -> :sswitch_a
        0x1abe23 -> :sswitch_8
        0x1abe7d -> :sswitch_3
        0x1ac909 -> :sswitch_4
        0x1ac92d -> :sswitch_6
    .end sparse-switch
.end method

.method static synthetic lambda$13(Lkevin/fun/hook/SparkRenewHelper$SparkInfo;Landroid/widget/Switch;Landroid/widget/CompoundButton;Z)V
    .locals 4

    invoke-static {p0}, Landroidx/viewpager/ۣۢ۟ۤ;->۟۟ۨۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p3}, Lkevin/fun/hook/SparkRenewHelper;->۟ۥۥۥۨ(Ljava/lang/Object;Z)V

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
    if-eqz p3, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const v0, -0x1d3ab

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v1, 0x6eb

    goto :goto_1

    :sswitch_4
    const v0, -0x333334

    :sswitch_5
    invoke-static {v0}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢۥۦۥ(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz p3, :cond_1

    const v0, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    const v0, 0x33fe2c55

    const v1, 0xbe7f

    :goto_3
    const v3, 0xbe90

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :goto_4
    :sswitch_9
    invoke-static {v0}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢۥۦۥ(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-static {p1, v2}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۢۦۧۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟۠۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۥۦۨ۠()I

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
    const v0, 0x33cccccc

    goto :goto_4

    :sswitch_d
    if-ltz v1, :cond_2

    const v0, 0xc1e3

    goto :goto_5

    :sswitch_e
    const-string v0, "wUPxR"

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->ۨۤۨۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

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

.method static synthetic lambda$14(Lkevin/fun/hook/SparkRenewHelper$SparkInfo;Landroid/widget/CompoundButton;Z)V
    .locals 2

    const/4 v0, 0x0

    const-string v1, "\u06df\u06e7\u06e6"

    :goto_0
    invoke-static {v1}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p0}, Landroidx/viewpager/ۣۢ۟ۤ;->۟۟ۨۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e1\u06e6\u06e2"

    goto :goto_0

    :sswitch_0
    invoke-static {v0, p2}, Lkevin/fun/hook/SparkRenewHelper;->۟ۥۥۥۨ(Ljava/lang/Object;Z)V

    const-string v1, "\u06e2\u06e0\u06e4"

    goto :goto_0

    :sswitch_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aaf5d -> :sswitch_0
        0x1ab266 -> :sswitch_1
    .end sparse-switch
.end method

.method static synthetic lambda$15(Landroid/widget/EditText;Landroid/content/Context;Lkevin/fun/hook/SparkRenewHelper$SparkInfo;Ljava/lang/Runnable;Landroid/content/DialogInterface;I)V
    .locals 5

    const/4 v4, 0x0

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
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x59d

    sget v2, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣ۠ۧ:I

    xor-int/lit16 v2, v2, -0x1ee

    const/16 v3, 0x6b4

    invoke-static {v0, v1, v2, v3}, Landroidx/drawerlayout/ۤۨۡۤ;->ۤ۠ۤ۠([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, v4}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۨۡ۠ۢ(Ljava/lang/Object;Ljava/lang/Object;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-static {v0}, Landroidx/viewpager/ۣۢ۟ۤ;->۠۠ۥۣ(Ljava/lang/Object;)V

    :goto_1
    return-void

    :sswitch_3
    invoke-static {p2}, Landroidx/viewpager/ۣۢ۟ۤ;->۟۟ۨۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkevin/fun/hook/SparkRenewHelper;->۟ۢ۠۟ۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p2}, Landroidx/viewpager/ۣۢ۟ۤ;->۟۟ۨۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lkevin/fun/hook/SparkRenewHelper;->ۧ۟ۤۥ(Ljava/lang/Object;Z)V

    const/16 v0, 0x6cc

    :goto_2
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_2

    :sswitch_4
    if-eqz p3, :cond_1

    const/16 v0, 0x729

    goto :goto_2

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_2

    :sswitch_6
    invoke-static {p3}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۣ۠ۢۥ(Ljava/lang/Object;)V

    :sswitch_7
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x5a3

    sget v2, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۧۨۨ:I

    xor-int/lit8 v2, v2, -0x6b

    const/16 v3, 0x2b4

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۨۦۣۨ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, v4}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۨۡ۠ۢ(Ljava/lang/Object;Ljava/lang/Object;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-static {v0}, Landroidx/viewpager/ۣۢ۟ۤ;->۠۠ۥۣ(Ljava/lang/Object;)V

    goto :goto_1

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

.method static synthetic lambda$16(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Landroidx/customview/ۡۤۡۤ;->ۧۢۡۧ(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic lambda$17(Ljava/util/List;I[ILandroid/view/View;)V
    .locals 4

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    invoke-static {p0}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۥۨۨ۠(Ljava/lang/Object;)I

    move-result v1

    const/16 v0, 0x650

    :goto_1
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_1

    :sswitch_1
    if-lt v3, v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_1

    :sswitch_2
    aput p1, p2, v2

    invoke-static {}, Landroidx/appcompat/ۣۧۤۢ;->ۢ۟۟ۨ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_2
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_2

    :sswitch_3
    if-ltz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_2

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_2

    :sswitch_5
    const-string v0, "82LljJ2k4DhW2"

    invoke-static {v0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۣ۟ۧۢۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(D)V

    :sswitch_6
    return-void

    :sswitch_7
    invoke-static {p0, v3}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۦۣ۟۠(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    const/16 v1, 0x748

    :goto_3
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_3

    :sswitch_8
    if-ne v3, p1, :cond_2

    const v1, 0xbe60

    goto :goto_3

    :cond_2
    :sswitch_9
    const v1, 0xbe41

    goto :goto_3

    :sswitch_a
    const/4 v1, 0x1

    :goto_4
    invoke-static {v0, v1}, Lkevin/fun/hook/SparkRenewHelper;->ۥۣ۟ۡ(Ljava/lang/Object;Z)V

    sget v0, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۦۣۧ:I

    xor-int/lit8 v0, v0, -0x7c

    add-int/2addr v0, v3

    const v1, 0xbe7f

    :goto_5
    const v3, 0xbe90

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_3

    goto :goto_5

    :sswitch_b
    move v3, v0

    goto :goto_0

    :sswitch_c
    const v1, 0xbe9e

    goto :goto_5

    :sswitch_d
    move v1, v2

    goto :goto_4

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
        0xb918 -> :sswitch_d
        0xb939 -> :sswitch_a
        0xb97b -> :sswitch_9
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_b
        0xef -> :sswitch_c
    .end sparse-switch
.end method

.method static synthetic lambda$18([ILkevin/fun/hook/SparkRenewHelper$SparkInfo;[Ljava/lang/String;Ljava/lang/Runnable;Landroid/app/Dialog;Landroid/view/View;)V
    .locals 2

    const/4 v0, 0x0

    aget v0, p0, v0

    invoke-static {p1}, Landroidx/viewpager/ۣۢ۟ۤ;->۟۟ۨۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    aget-object v0, p2, v0

    invoke-static {v1, v0}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۡ۟۠(Ljava/lang/Object;Ljava/lang/Object;)V

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
    if-eqz p3, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p3}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۣ۠ۢۥ(Ljava/lang/Object;)V

    :sswitch_3
    invoke-static {p4}, Landroidx/customview/ۡۤۡۤ;->ۧۢۡۧ(Ljava/lang/Object;)V

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

.method static synthetic lambda$19(Landroid/app/Activity;ZLjava/lang/String;)V
    .locals 13

    :try_start_0
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۠ۡۦۢ()V

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
    invoke-static {p0}, Landroidx/loader/ۣۦ۟ۡ;->ۥۣ۠ۨ(Ljava/lang/Object;)Z

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
    new-instance v1, Landroid/app/Dialog;

    const v0, 0x1030277

    sget v2, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۥۦ:I

    xor-int/2addr v0, v2

    invoke-direct {v1, p0, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    const/4 v0, 0x0

    invoke-static {v1, v0}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۡۡ۠(Ljava/lang/Object;Z)V

    new-instance v2, Landroid/widget/FrameLayout;

    invoke-direct {v2, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    sget v3, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    xor-int/lit16 v3, v3, 0x16a

    invoke-direct {v0, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-static {v2, v0}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۣۡ۠۟(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0x7ffffe95

    sget v4, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    xor-int/2addr v0, v4

    invoke-static {v2, v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۣۢۧ(Ljava/lang/Object;I)V

    new-instance v4, Landroid/widget/LinearLayout;

    invoke-direct {v4, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x1

    invoke-static {v4, v0}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    sget v0, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    xor-int/lit16 v5, v0, -0x11a

    invoke-static {v4, v5}, Landroidx/emoji2/ۢۧۡۧ;->ۡۤۥ(Ljava/lang/Object;I)V

    sget v0, Landroidx/activity/ۤۧۧۧ;->۟۟ۢ۠ۡ:I

    xor-int/lit16 v0, v0, 0x1f2

    invoke-static {p0, v0}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v6

    invoke-static {p0, v0}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v7

    invoke-static {p0, v0}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v8

    invoke-static {p0, v0}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v0

    invoke-static {v4, v6, v7, v8, v0}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    sget v6, Landroidx/activity/ۨ۠۟ۧ;->۟ۦۥۢۢ:I

    xor-int/lit16 v6, v6, 0x22d

    invoke-static {p0, v6}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v6

    sget v7, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    xor-int/lit8 v7, v7, -0x74

    invoke-direct {v0, v6, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    iput v5, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    invoke-static {v4, v0}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣۡۥۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-static {v0, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    sget v6, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    xor-int/lit16 v6, v6, 0x16d

    invoke-static {p0, v6}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v7

    int-to-float v7, v7

    invoke-static {v0, v7}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۥ۟ۢۧ(Ljava/lang/Object;F)V

    invoke-static {v4, v0}, Landroidx/activity/ۦۧۥۥ;->۟ۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v7, Landroid/widget/TextView;

    invoke-direct {v7, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const v0, 0xa89c

    sget v8, Landroidx/activity/ۦۧۥۥ;->۟ۦۢۧۤ:I

    xor-int/2addr v8, v0

    const v0, 0xbe7f

    :goto_3
    const v9, 0xbe90

    xor-int/2addr v0, v9

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_8
    const v0, 0xbebd

    goto :goto_3

    :sswitch_9
    if-eqz p1, :cond_2

    const v0, 0xbedc

    goto :goto_3

    :sswitch_a
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v9, 0x5ab

    const/4 v10, 0x1

    const/16 v11, 0x959

    invoke-static {v0, v9, v10, v11}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۢۦۣ۠([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v7, v8}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const v0, 0xbefb

    :goto_4
    const v9, 0xbf0c

    xor-int/2addr v0, v9

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :goto_5
    :sswitch_b
    const/high16 v0, 0x42300000    # 44.0f

    invoke-static {v7, v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    invoke-static {v7, v5}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    const/4 v0, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    sget v11, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    xor-int/lit16 v11, v11, -0x32b

    invoke-static {p0, v11}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v11

    invoke-static {v7, v0, v9, v10, v11}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    invoke-static {v4, v7}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v7, Landroid/widget/TextView;

    invoke-direct {v7, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const v0, -0xe0e160

    sget v9, Landroidx/core/ۧ۟ۤۨ;->ۣۤ۠ۤ:I

    xor-int/2addr v9, v0

    const v0, 0xc202

    :goto_6
    const v10, 0xc213

    xor-int/2addr v0, v10

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :sswitch_c
    if-eqz p1, :cond_3

    const v0, 0xc25f

    goto :goto_6

    :sswitch_d
    const v0, 0xbf1a

    goto :goto_4

    :sswitch_e
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v9, 0x5ac

    sget v10, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢ۟ۥ:I

    xor-int/lit16 v10, v10, 0x176

    const/16 v11, 0x86b

    invoke-static {v0, v9, v10, v11}, Landroidx/customview/ۤۡۥ;->۟ۢۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_5

    :catchall_0
    move-exception v0

    :goto_7
    :sswitch_f
    return-void

    :cond_3
    :sswitch_10
    const v0, 0xc240

    goto :goto_6

    :sswitch_11
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v10, 0x5ae

    sget v11, Landroidx/activity/ۨ۠۟ۧ;->۟ۦۥۢۢ:I

    xor-int/lit16 v11, v11, 0x330

    const/16 v12, 0x9c3

    invoke-static {v0, v10, v11, v12}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢ۟ۥۨ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v7, v9}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const v0, 0xc27e

    :goto_8
    const v9, 0xc28f

    xor-int/2addr v0, v9

    sparse-switch v0, :sswitch_data_6

    goto :goto_8

    :goto_9
    :sswitch_12
    const/high16 v0, 0x41900000    # 18.0f

    invoke-static {v7, v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->۟ۡۡۧۦ()Landroid/graphics/Typeface;

    move-result-object v0

    invoke-static {v7, v0}, Landroidx/customview/ۡۤۡۤ;->ۧ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v7, v5}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    const/4 v0, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    sget v11, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۡۨۨۧ:I

    xor-int/lit16 v11, v11, -0x1ec

    invoke-static {p0, v11}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v11

    invoke-static {v7, v0, v9, v10, v11}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    invoke-static {v4, v7}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {v0, p2}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v7, 0x41600000    # 14.0f

    invoke-static {v0, v7}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v7, -0x999abc

    sget v9, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣۡۢ۟:I

    xor-int/2addr v7, v9

    invoke-static {v0, v7}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    invoke-static {v0, v5}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    sget v5, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۦۣۧ:I

    xor-int/lit8 v5, v5, -0x7f

    invoke-static {p0, v5}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v5

    int-to-float v5, v5

    const v7, 0x3f99999a    # 1.2f

    invoke-static {v0, v5, v7}, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦ۠ۦۢ(Ljava/lang/Object;FF)V

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    invoke-static {p0, v6}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v6

    invoke-static {v0, v5, v7, v9, v6}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    invoke-static {v4, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/view/View;

    invoke-direct {v0, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v6, 0x1

    invoke-static {p0, v6}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v6

    invoke-direct {v5, v3, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v0, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۦۤۡۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v3, -0x11120f

    sget v5, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/2addr v3, v5

    invoke-static {v0, v3}, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۤۥۧ(Ljava/lang/Object;I)V

    invoke-static {v4, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Landroid/widget/TextView;

    invoke-direct {v3, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v5, 0x5b8

    sget v6, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۦۣۧ:I

    xor-int/lit8 v6, v6, -0x7f

    const/16 v7, 0x618

    invoke-static {v0, v5, v6, v7}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۢۧۢ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v0, 0x41700000    # 15.0f

    invoke-static {v3, v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v0, 0xc2fa

    :goto_a
    const v5, 0xc30b

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_7

    goto :goto_a

    :sswitch_13
    if-eqz p1, :cond_4

    const v0, 0xc5e2

    goto :goto_a

    :sswitch_14
    const v0, 0xc29d

    goto/16 :goto_8

    :sswitch_15
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v10, 0x5b3

    sget v11, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۥۨ:I

    xor-int/lit16 v11, v11, 0x281

    const/16 v12, 0x29a

    invoke-static {v0, v10, v11, v12}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۡۤۥ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v7, v9}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    goto/16 :goto_9

    :cond_4
    :sswitch_16
    const v0, 0xc5c3

    goto :goto_a

    :sswitch_17
    invoke-static {v3, v8}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const v0, 0xc601

    :goto_b
    const v5, 0xc612

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_8

    goto :goto_b

    :sswitch_18
    const v0, 0xc620

    goto :goto_b

    :sswitch_19
    const v0, -0x666701

    sget v5, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    xor-int/2addr v0, v5

    invoke-static {v3, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    :sswitch_1a
    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->۟ۡۡۧۦ()Landroid/graphics/Typeface;

    move-result-object v0

    invoke-static {v3, v0}, Landroidx/customview/ۡۤۡۤ;->ۧ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v0, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    xor-int/lit16 v0, v0, 0x31c

    invoke-static {v3, v0}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    const/4 v0, 0x0

    sget v5, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    xor-int/lit16 v5, v5, 0x25d

    invoke-static {p0, v5}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v5

    const/4 v6, 0x0

    sget v7, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۢ۟ۡ:I

    xor-int/lit16 v7, v7, -0x266

    invoke-static {p0, v7}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v7

    invoke-static {v3, v0, v5, v6, v7}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    new-instance v0, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda10;

    invoke-direct {v0, v1}, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda10;-><init>(Landroid/app/Dialog;)V

    invoke-static {v3, v0}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۦۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4, v3}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v4}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۡۢ۟۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1, v2}, Landroidx/viewpager/ۣۢ۟ۤ;->ۥۢۨۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0x3f666666    # 0.9f

    invoke-static {v4, v0}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۟ۡۦ۟ۦ(Ljava/lang/Object;F)V

    const v0, 0x3f666666    # 0.9f

    invoke-static {v4, v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣ۟ۡۢ(Ljava/lang/Object;F)V

    const/4 v0, 0x0

    invoke-static {v4, v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۡۦۦۧ(Ljava/lang/Object;F)V

    invoke-static {v4}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۥۣۤۤ(Ljava/lang/Object;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v0, v2}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۡۢۢ(Ljava/lang/Object;F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v0, v2}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۣۡۦ۠(Ljava/lang/Object;F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v0, v2}, Landroidx/documentfile/ۡۢ۟ۥ;->ۣۤۦۦ(Ljava/lang/Object;F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v2, 0x1b1

    sget v4, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    int-to-long v4, v4

    xor-long/2addr v2, v4

    invoke-static {v0, v2, v3}, Landroidx/loader/ۥۧۨۤ;->ۣۣۧ۠(Ljava/lang/Object;J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v2, Landroid/view/animation/OvershootInterpolator;

    invoke-direct {v2}, Landroid/view/animation/OvershootInterpolator;-><init>()V

    invoke-static {v0, v2}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۦ۟ۢ۟(Ljava/lang/Object;Ljava/lang/Object;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۤ۟ۥ(Ljava/lang/Object;)V

    invoke-static {v1}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۦۧۤۡ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const v0, 0xc67d

    :goto_c
    const v1, 0xc68e

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_9

    goto :goto_c

    :sswitch_1b
    const v0, 0xc69c

    goto :goto_c

    :sswitch_1c
    invoke-static {}, Landroidx/loader/ۢۥ۟;->۟ۦۦۨۢ()I

    move-result v1

    const v0, 0xc984

    :goto_d
    const v2, 0xc995

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_a

    goto :goto_d

    :sswitch_1d
    if-ltz v1, :cond_5

    const v0, 0xc9e1

    goto :goto_d

    :cond_5
    :sswitch_1e
    const v0, 0xc9c2

    goto :goto_d

    :sswitch_1f
    const-string v0, "8tGWr82QMJiB"

    invoke-static {v0}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۤۡۧۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    goto/16 :goto_7

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_1c
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
        0xb97b -> :sswitch_1c
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_8
        0x2d -> :sswitch_e
        0x4c -> :sswitch_a
        0xef -> :sswitch_9
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_b
        0x1f7 -> :sswitch_d
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_c
        0x32 -> :sswitch_10
        0x4c -> :sswitch_11
        0x53 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_12
        0xf1 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_13
        0x6af -> :sswitch_16
        0x6c8 -> :sswitch_19
        0x6e9 -> :sswitch_17
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_18
        0x32 -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_f
        0xf3 -> :sswitch_1b
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1d
        0x36 -> :sswitch_1e
        0x57 -> :sswitch_f
        0x74 -> :sswitch_1f
    .end sparse-switch
.end method

.method static synthetic lambda$2(Landroid/widget/Switch;Landroid/widget/CompoundButton;Z)V
    .locals 4

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x5bc

    sget v2, Lorg/luckypray/dexkit/۠۠ۥ;->ۣ۟ۡۢۡ:I

    xor-int/lit16 v2, v2, -0xf1

    const/16 v3, 0x761

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۢۧۢ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Landroidx/interpolator/ۣ۟ۤۢۧ;->۟ۥۥۥۤ(Ljava/lang/Object;Z)V

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
    const v0, -0x1d3ab

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v1, 0x6eb

    goto :goto_1

    :sswitch_4
    const v0, -0x333334

    :sswitch_5
    invoke-static {v0}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢۥۦۥ(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-static {p0, v0}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۢۦۧۤ(Ljava/lang/Object;Ljava/lang/Object;)V

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
    const v0, 0x33fe2c55

    const v1, 0xbe7f

    :goto_3
    const v2, 0xbe90

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :goto_4
    :sswitch_9
    invoke-static {v0}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢۥۦۥ(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-static {p0, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟۠۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۥۦۨ۠()I

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
    const v0, 0x33cccccc

    goto :goto_4

    :sswitch_d
    if-ltz v1, :cond_2

    const v0, 0xc1e3

    goto :goto_5

    :sswitch_e
    const-string v0, "fYQpDENpjDm"

    invoke-static {v0}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۤۥۧۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

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

.method static synthetic lambda$20(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Landroidx/customview/ۡۤۡۤ;->ۧۢۡۧ(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic lambda$3(Landroid/widget/Switch;Landroid/app/Dialog;Landroid/content/Context;Landroid/widget/CompoundButton;Z)V
    .locals 3

    invoke-static {p4}, Lkevin/fun/hook/SparkRenewHelper;->ۣۡ۟ۤ(Z)V

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
    if-eqz p4, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const v0, -0x1d3ab

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v1, 0x6eb

    goto :goto_1

    :sswitch_4
    const v0, -0x333334

    :sswitch_5
    invoke-static {v0}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢۥۦۥ(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-static {p0, v0}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۢۦۧۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz p4, :cond_1

    const v0, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    const v0, 0x33fe2c55

    const v1, 0xbe7f

    :goto_3
    const v2, 0xbe90

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :goto_4
    :sswitch_9
    invoke-static {v0}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢۥۦۥ(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-static {p0, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟۠۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1}, Landroidx/customview/ۡۤۡۤ;->ۧۢۡۧ(Ljava/lang/Object;)V

    invoke-static {p2}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۧۧۦۦ(Ljava/lang/Object;)V

    invoke-static {}, Landroidx/activity/ۤۧۧۧ;->ۥۢۧۡ()I

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
    const v0, 0x33cccccc

    goto :goto_4

    :sswitch_d
    if-ltz v1, :cond_2

    const v0, 0xc1e3

    goto :goto_5

    :sswitch_e
    const-string v0, "pzQLvol0RCS3TqU1U"

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۤۡۥۡ(Ljava/lang/String;)Ljava/lang/String;

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

.method static synthetic lambda$4(Landroid/widget/LinearLayout;Ljava/util/ArrayList;Landroid/widget/TextView;Landroid/content/Context;)V
    .locals 8

    invoke-static {p0}, Landroidx/lifecycle/process/۠ۢۧۡ;->۟ۦۡۢۡ(Ljava/lang/Object;)V

    invoke-static {p1}, Landroidx/loader/ۣ۟۟ۧ۠;->۟ۤۡۨۥ(Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۧۥۨۦ()Z

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
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۢۡۡ()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-static {v0}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->۟ۦۦۨ(Ljava/lang/Object;)Ljava/util/Collection;

    move-result-object v0

    invoke-static {p1, v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۡۥۥ۠(Ljava/lang/Object;Ljava/lang/Object;)Z

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x6eb

    goto :goto_1

    :sswitch_4
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۦۦ۟ۦ()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-static {v0}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->۟ۦۦۨ(Ljava/lang/Object;)Ljava/util/Collection;

    move-result-object v0

    invoke-static {p1, v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۡۥۥ۠(Ljava/lang/Object;Ljava/lang/Object;)Z

    :sswitch_5
    new-instance v0, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda8;

    invoke-direct {v0}, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda8;-><init>()V

    invoke-static {p1, v0}, Landroidx/loader/ۢۥ۟;->ۧ۟ۤۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p2}, Lkevin/fun/hook/SparkRenewHelper;->ۥۤۧۧ(Ljava/lang/Object;)V

    invoke-static {p1}, Landroidx/loader/ۢۥ۟;->۟ۥۡۢۥ(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz v1, :cond_1

    const v0, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    sget v1, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    xor-int/lit16 v1, v1, 0x23f

    invoke-static {v0, v1}, Landroidx/emoji2/ۢۧۡۧ;->ۡۤۥ(Ljava/lang/Object;I)V

    sget v2, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    xor-int/lit16 v2, v2, -0x3dc

    invoke-static {p3, v2}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v3

    sget v4, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    xor-int/lit16 v4, v4, -0x238

    invoke-static {p3, v4}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v5

    invoke-static {p3, v2}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v2

    invoke-static {p3, v4}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v4

    invoke-static {v0, v3, v5, v2, v4}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, p3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v3

    const/16 v4, 0x5ce

    sget v5, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v5, v5, 0x20c

    const/16 v6, 0x874

    invoke-static {v3, v4, v5, v6}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣۣ۟ۤۤ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v3, 0x42280000    # 42.0f

    invoke-static {v2, v3}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    invoke-static {v2, v1}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    new-instance v3, Landroid/widget/TextView;

    invoke-direct {v3, p3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v4

    const/16 v5, 0x5d0

    sget v6, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    xor-int/lit16 v6, v6, -0x14b

    const/16 v7, 0x672

    invoke-static {v4, v5, v6, v7}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣ۟۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v4, 0x41500000    # 13.0f

    invoke-static {v3, v4}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v4, 0x7774c9

    sget v5, Landroidx/loader/ۡۢۢ;->ۣۡۦ۟:I

    xor-int/2addr v4, v5

    invoke-static {v3, v4}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    invoke-static {v3, v1}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    sget v1, Landroidx/appcompat/ۣۧۤۢ;->۟۠ۡۤۤ:I

    xor-int/lit16 v1, v1, -0xef

    invoke-static {p3, v1}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v1

    int-to-float v1, v1

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v3, v1, v4}, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦ۠ۦۢ(Ljava/lang/Object;FF)V

    invoke-static {v0, v2}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v3}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0xbe7f

    :goto_3
    const v1, 0xbe90

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :sswitch_9
    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۡ۟ۨۨ()I

    move-result v1

    const v0, 0xc202

    :goto_4
    const v2, 0xc213

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :sswitch_a
    if-ltz v1, :cond_3

    const v0, 0xc25f

    goto :goto_4

    :sswitch_b
    const v0, 0xbe9e

    goto :goto_3

    :sswitch_c
    invoke-static {p1}, Lorg/luckypray/dexkit/۠۠ۥ;->۟ۥ۠ۦۢ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v1

    :sswitch_d
    invoke-static {v1}, Landroidx/activity/ۣۦۡۥ;->ۣ۟ۧۧۡ(Ljava/lang/Object;)Z

    move-result v2

    const v0, 0xbefb

    :goto_5
    const v3, 0xbf0c

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_5

    goto :goto_5

    :cond_2
    :sswitch_e
    const v0, 0xbf39

    goto :goto_5

    :sswitch_f
    if-nez v2, :cond_2

    const v0, 0xc1e3

    goto :goto_5

    :cond_3
    :sswitch_10
    const v0, 0xc240

    goto :goto_4

    :sswitch_11
    const-string v0, "OG3cR1VyEDVh7EtOO"

    invoke-static {v0}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۣۤۨۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

    :sswitch_12
    return-void

    :sswitch_13
    invoke-static {v1}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۦۥۦۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkevin/fun/hook/SparkRenewHelper$SparkInfo;

    invoke-static {p3, v0}, Lkevin/fun/hook/SparkRenewHelper;->۟۠ۡۨۥ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/widget/LinearLayout;

    move-result-object v2

    invoke-static {p0, v2}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1, v0}, Landroidx/activity/ۣۦۡۥ;->ۧۧ۠۠(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v2

    invoke-static {p1}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣ۟۠ۨ(Ljava/lang/Object;)I

    move-result v3

    const v0, 0xc27e

    :goto_6
    const v4, 0xc28f

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_6

    goto :goto_6

    :cond_4
    :sswitch_14
    const v0, 0xc2bc

    goto :goto_6

    :sswitch_15
    add-int/lit8 v0, v3, -0x1

    if-eq v2, v0, :cond_4

    const v0, 0xc2db

    goto :goto_6

    :sswitch_16
    new-instance v0, Landroid/view/View;

    invoke-direct {v0, p3}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-static {p3, v2}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۨۧۢ(Ljava/lang/Object;F)I

    move-result v2

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    sget v4, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۨۥۦ۟:I

    xor-int/lit16 v4, v4, -0x28e

    invoke-direct {v3, v4, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v0, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۦۤۡۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v2, -0x111103

    sget v3, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۥۧ۟:I

    xor-int/2addr v2, v3

    invoke-static {v0, v2}, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۤۥۧ(Ljava/lang/Object;I)V

    invoke-static {p0, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0xc2fa

    :goto_7
    const v2, 0xc30b

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_7

    goto :goto_7

    :sswitch_17
    const v0, 0xc5a4

    goto :goto_7

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
        0x11 -> :sswitch_a
        0x32 -> :sswitch_10
        0x4c -> :sswitch_11
        0x53 -> :sswitch_12
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x16 -> :sswitch_e
        0x35 -> :sswitch_13
        0x1f7 -> :sswitch_f
        0x7eef -> :sswitch_9
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_14
        0x33 -> :sswitch_d
        0x54 -> :sswitch_16
        0xf1 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_17
        0x6af -> :sswitch_d
    .end sparse-switch
.end method

.method static synthetic lambda$5(Lkevin/fun/hook/SparkRenewHelper$SparkInfo;Lkevin/fun/hook/SparkRenewHelper$SparkInfo;)I
    .locals 6

    const/4 v1, 0x1

    invoke-static {p0}, Landroidx/core/ۤۦ۟ۢ;->ۣ۟ۡۦۢ(Ljava/lang/Object;)Z

    move-result v3

    invoke-static {p1}, Landroidx/core/ۤۦ۟ۢ;->ۣ۟ۡۦۢ(Ljava/lang/Object;)Z

    move-result v4

    const/4 v0, -0x1

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
    if-eq v3, v4, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/core/ۤۦ۟ۢ;->ۣ۟ۡۦۢ(Ljava/lang/Object;)Z

    move-result v3

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v3, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v1, 0xbe22

    goto :goto_2

    :sswitch_7
    move v0, v1

    :goto_3
    :sswitch_8
    return v0

    :sswitch_9
    invoke-static {p0}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۣ۟ۧ۠ۥ(Ljava/lang/Object;)Z

    move-result v3

    invoke-static {p1}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۣ۟ۧ۠ۥ(Ljava/lang/Object;)Z

    move-result v4

    const v2, 0xbe7f

    :goto_4
    const v5, 0xbe90

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_3

    goto :goto_4

    :cond_2
    :sswitch_a
    const v2, 0xbebd

    goto :goto_4

    :sswitch_b
    if-eq v3, v4, :cond_2

    const v2, 0xbedc

    goto :goto_4

    :sswitch_c
    invoke-static {p0}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۣ۟ۧ۠ۥ(Ljava/lang/Object;)Z

    move-result v3

    const v2, 0xbefb

    :goto_5
    const v4, 0xbf0c

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_4

    goto :goto_5

    :cond_3
    :sswitch_d
    const v2, 0xbf39

    goto :goto_5

    :sswitch_e
    if-eqz v3, :cond_3

    const v2, 0xc1e3

    goto :goto_5

    :sswitch_f
    const v1, 0xc202

    :goto_6
    const v2, 0xc213

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_5

    goto :goto_6

    :sswitch_10
    const v1, 0xc221

    goto :goto_6

    :sswitch_11
    move v0, v1

    goto :goto_3

    :sswitch_12
    invoke-static {p0}, Landroidx/loader/ۥۧۨۤ;->۟ۢۢۥۤ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p1}, Landroidx/loader/ۥۧۨۤ;->۟ۢۢۥۤ(Ljava/lang/Object;)I

    move-result v2

    const v0, 0xc27e

    :goto_7
    const v3, 0xc28f

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_6

    goto :goto_7

    :cond_4
    :sswitch_13
    const v0, 0xc2bc

    goto :goto_7

    :sswitch_14
    if-eq v1, v2, :cond_4

    const v0, 0xc2db

    goto :goto_7

    :sswitch_15
    invoke-static {p1}, Landroidx/loader/ۥۧۨۤ;->۟ۢۢۥۤ(Ljava/lang/Object;)I

    move-result v0

    invoke-static {p0}, Landroidx/loader/ۥۧۨۤ;->۟ۢۢۥۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int/2addr v0, v1

    goto :goto_3

    :sswitch_16
    invoke-static {p0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->۟ۢۨۢۨ(Ljava/lang/Object;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۧۢۨۦ(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->۟ۢۨۢۨ(Ljava/lang/Object;)J

    move-result-wide v2

    invoke-static {v2, v3}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۧۢۨۦ(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/core/ۧ۟ۤۨ;->۟ۢۥۤۥ(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_3

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
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_8
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_a
        0x2d -> :sswitch_12
        0x4c -> :sswitch_c
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_d
        0x35 -> :sswitch_11
        0x1f7 -> :sswitch_e
        0x7eef -> :sswitch_f
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_10
        0x32 -> :sswitch_8
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_13
        0x33 -> :sswitch_16
        0x54 -> :sswitch_15
        0xf1 -> :sswitch_14
    .end sparse-switch
.end method

.method static synthetic lambda$6(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 2

    invoke-static {p0}, Landroidx/customview/ۡۤۡۤ;->ۧۢۡۧ(Ljava/lang/Object;)V

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
    const-string v0, "Tz1nG7JGstfqrQF5QimuVxDYR"

    invoke-static {v0}, Landroidx/startup/۟ۦۤۨۧ;->۟۟۟ۨۦ(Ljava/lang/String;)Ljava/lang/String;

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

.method static synthetic lambda$7(Landroid/os/Handler;Ljava/lang/Runnable;Landroid/content/DialogInterface;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/emoji2/ۢۧۡۧ;->۟ۧۤۢۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic lambda$8(Lkevin/fun/hook/SparkRenewHelper$SparkInfo;Landroid/content/Context;Landroid/view/View;)V
    .locals 8

    const/16 v1, 0x650

    :try_start_0
    invoke-static {p0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->۟ۢۨۢۨ(Ljava/lang/Object;)J

    move-result-wide v2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v4

    const/16 v5, 0x5f0

    sget v6, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۤۨۨ:I

    xor-int/lit16 v6, v6, 0x116

    const/16 v7, 0x625

    invoke-static {v4, v5, v6, v7}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟۟۟ۦۢ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0, v2, v3}, Landroidx/loader/ۢۥ۟;->۟ۥۣۢۡ(Ljava/lang/Object;J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Landroid/content/Intent;

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v3

    const/16 v4, 0x60a

    sget v5, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    xor-int/lit16 v5, v5, 0xd9

    const/16 v6, 0xa9d

    invoke-static {v3, v4, v5, v6}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣۣ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0}, Landroidx/activity/ۣۦۡۥ;->۟ۡۦۧۥ(Ljava/lang/Object;)Landroid/net/Uri;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v3, 0x624

    sget v4, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    xor-int/lit8 v4, v4, 0x4a

    const/16 v5, 0x2d4

    invoke-static {v0, v3, v4, v5}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦۣ۠ۤ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->۟ۤۢۧ۠(Ljava/lang/Object;Ljava/lang/Object;)Landroid/content/Intent;

    const v0, 0x100003a0

    sget v3, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    xor-int/2addr v0, v3

    invoke-static {v2, v0}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۢۡۤۨ(Ljava/lang/Object;I)Landroid/content/Intent;

    invoke-static {p1, v2}, Landroidx/loader/ۣ۟۟ۧ۠;->۟ۡۡۨ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v0, v1

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

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v3

    const/16 v4, 0x63c

    sget v5, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    xor-int/lit8 v5, v5, -0x62

    const/16 v6, 0x2c4

    invoke-static {v3, v4, v5, v6}, Lkevin/fun/hook/۟ۥ۠۠;->ۣۨۢ۟([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۦۣ(Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    sget v2, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۨ۠ۧ:I

    xor-int/lit16 v2, v2, -0x1b6

    const/16 v3, 0x5e9

    invoke-static {v0, v1, v2, v3}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۦۥۢ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroidx/documentfile/ۡۢ۟ۥ;->ۣ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
    .end sparse-switch
.end method

.method static synthetic lambda$9(Lkevin/fun/hook/SparkRenewHelper$SparkInfo;Landroid/widget/TextView;Landroid/graphics/drawable/GradientDrawable;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 9

    const/16 v1, 0x8

    const/4 v2, 0x0

    invoke-static {p0}, Landroidx/viewpager/ۣۢ۟ۤ;->۟۟ۨۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/SparkRenewHelper;->ۤۤۢۡ(Ljava/lang/Object;)Z

    move-result v4

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
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v3, 0x658

    sget v5, Lkevin/fun/hook/۟ۥ۠۠;->ۢۦۧۧ:I

    xor-int/lit16 v5, v5, -0x1c2

    const/16 v6, 0x347

    invoke-static {v0, v3, v5, v6}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣۣ۟ۤۤ([SIII)Ljava/lang/String;

    move-result-object v0

    const/16 v3, 0x6cc

    :goto_1
    xor-int/lit16 v3, v3, 0x6dd

    sparse-switch v3, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v3, 0x6eb

    goto :goto_1

    :sswitch_4
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v3, 0x65d

    sget v5, Landroidx/core/ۧ۟ۤۨ;->ۣۤ۠ۤ:I

    xor-int/lit16 v5, v5, 0x1bb

    const/16 v6, 0x788

    invoke-static {v0, v3, v5, v6}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧ۠ۥ۟([SIII)Ljava/lang/String;

    move-result-object v0

    :sswitch_5
    invoke-static {p1, v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz v4, :cond_1

    const v0, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    const/4 v0, -0x1

    const v3, 0xbe7f

    :goto_3
    const v5, 0xbe90

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_3

    goto :goto_3

    :goto_4
    :sswitch_9
    invoke-static {p1, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const v0, 0xbefb

    :goto_5
    const v3, 0xbf0c

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_4

    goto :goto_5

    :cond_2
    :sswitch_a
    const v0, 0xbf39

    goto :goto_5

    :sswitch_b
    const v3, 0xbe9e

    goto :goto_3

    :sswitch_c
    const v0, -0x99999a

    goto :goto_4

    :sswitch_d
    if-eqz v4, :cond_2

    const v0, 0xc1e3

    goto :goto_5

    :sswitch_e
    const v0, -0x1d3ab

    const v3, 0xc202

    :goto_6
    const v5, 0xc213

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_5

    goto :goto_6

    :sswitch_f
    const v3, 0xc221

    goto :goto_6

    :sswitch_10
    const/high16 v0, 0x11000000

    :sswitch_11
    invoke-static {p2, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    invoke-static {p0}, Landroidx/viewpager/ۣۢ۟ۤ;->۟۟ۨۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/SparkRenewHelper;->۟ۦ۟ۢ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/SparkRenewHelper;->ۥۨۤۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v5

    const/16 v6, 0x661

    sget v7, Lkevin/fun/hook/۟ۥ۠۠;->ۢۦۧۧ:I

    xor-int/lit16 v7, v7, -0x1c8

    const/16 v8, 0x8f3

    invoke-static {v5, v6, v7, v8}, Landroidx/loader/ۢۥ۟;->۟ۧ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v3, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p3, v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0xc27e

    :goto_7
    const v3, 0xc28f

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_6

    goto :goto_7

    :cond_3
    :sswitch_12
    const v0, 0xc2bc

    goto :goto_7

    :sswitch_13
    if-eqz v4, :cond_3

    const v0, 0xc2db

    goto :goto_7

    :sswitch_14
    const v0, 0xc2fa

    :goto_8
    const v3, 0xc30b

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_7

    goto :goto_8

    :sswitch_15
    const v0, 0xc5a4

    goto :goto_8

    :sswitch_16
    move v0, v1

    :goto_9
    invoke-static {p3, v0}, Landroidx/loader/۟۠ۢۧۡ;->ۦۡ۠ۨ(Ljava/lang/Object;I)V

    const v0, 0xc601

    :goto_a
    const v3, 0xc612

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_8

    goto :goto_a

    :sswitch_17
    if-eqz v4, :cond_4

    const v0, 0xc65e

    goto :goto_a

    :sswitch_18
    move v0, v2

    goto :goto_9

    :cond_4
    :sswitch_19
    const v0, 0xc63f

    goto :goto_a

    :sswitch_1a
    move v2, v1

    :sswitch_1b
    invoke-static {p4, v2}, Landroidx/loader/۟۠ۢۧۡ;->ۦۡ۠ۨ(Ljava/lang/Object;I)V

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
        0x33 -> :sswitch_18
        0x54 -> :sswitch_14
        0xf1 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_15
        0x6af -> :sswitch_16
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_17
        0x2d -> :sswitch_1a
        0x32 -> :sswitch_19
        0x4c -> :sswitch_1b
    .end sparse-switch
.end method

.method public static onMainActivityResume(Landroid/app/Activity;)V
    .locals 6

    invoke-static {}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->۟ۢۤۤۥ()Z

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
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez p0, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {p0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۣۦۣۨ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lkevin/fun/hook/SparkRenewHelper;->hostContext:Landroid/content/Context;

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟۟ۨۡ()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v1

    const/16 v2, 0x664

    sget v3, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣ۠ۧ:I

    xor-int/lit16 v3, v3, -0x1f3

    const/16 v4, 0x3ba

    invoke-static {v1, v2, v3, v4}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢ۟ۥۨ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۦۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    invoke-static {}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۢۦۥۢ()I

    move-result v1

    const v0, 0xbe7f

    :goto_3
    const v2, 0xbe90

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_3
    :sswitch_9
    const v0, 0xbebd

    goto :goto_3

    :sswitch_a
    if-ltz v1, :cond_3

    const v0, 0xbedc

    goto :goto_3

    :sswitch_b
    const-string v0, "rMbJzGubpDsdsyy"

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->۟۟ۧۡۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :goto_4
    :sswitch_c
    return-void

    :sswitch_d
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۨۥۣ()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroidx/loader/ۣۦ۟ۡ;->ۤۦ۟ۨ(Ljava/lang/Object;ZZ)Z

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
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda9;

    invoke-direct {v1, p0}, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda9;-><init>(Landroid/app/Activity;)V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v2

    const/16 v3, 0x67d

    sget v4, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۡۨۨۧ:I

    xor-int/lit16 v4, v4, -0x1ee

    const/16 v5, 0x36c

    invoke-static {v2, v3, v4, v5}, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۥۧۤ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    invoke-static {v0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۥۦۤۡ(Ljava/lang/Object;)V

    goto :goto_4

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
        0x1d7 -> :sswitch_5
        0x1f4 -> :sswitch_c
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
.end method

.method private static parseOtherUidFromConversationId(Ljava/lang/String;)J
    .locals 7

    const-wide/16 v0, 0x126

    sget v2, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۧ۠۠ۡ:I

    int-to-long v2, v2

    xor-long/2addr v0, v2

    :try_start_0
    invoke-static {p0}, Landroidx/documentfile/ۡۢ۟ۥ;->ۢۥۦۣ(Ljava/lang/Object;)Z

    move-result v3

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
    if-eqz v3, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v2

    const/16 v3, 0x687

    const/4 v4, 0x1

    const/16 v5, 0xae7

    invoke-static {v2, v3, v4, v5}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۦۥۢ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0, v2}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۢۦۣۨ(Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/String;

    move-result-object v3

    array-length v4, v3

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/4 v2, 0x4

    if-lt v4, v2, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v2

    const/16 v4, 0x688

    const/4 v5, 0x1

    const/16 v6, 0x268

    invoke-static {v2, v4, v5, v6}, Landroidx/customview/ۡۤۡۤ;->ۧ۟ۤۨ([SIII)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x1

    aget-object v4, v3, v4

    invoke-static {v2, v4}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    const/16 v2, 0x748

    :goto_2
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz v4, :cond_2

    const v2, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v2, 0xbe41

    goto :goto_2

    :sswitch_8
    const/4 v2, 0x3

    aget-object v2, v3, v2

    invoke-static {v2}, Landroidx/loader/۟۠ۢۧۡ;->ۧۧۥ(Ljava/lang/Object;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v0

    :goto_3
    :sswitch_9
    return-wide v0

    :catchall_0
    move-exception v2

    goto :goto_3

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_9
        0xef -> :sswitch_2
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
.end method

.method public static processConversationSpark(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 18

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;

    move-result-object v6

    const/4 v4, 0x0

    const/4 v3, 0x0

    :try_start_0
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v2

    const/16 v5, 0x689

    sget v7, Landroidx/activity/ۣۦۡۥ;->ۣۢۤۡ:I

    xor-int/lit8 v7, v7, 0x11

    const/16 v8, 0x1c4

    invoke-static {v2, v5, v7, v8}, Landroidx/loader/ۣۦ۟ۡ;->ۣ۟ۤ۟ۦ([SIII)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/Object;

    move-object/from16 v0, p0

    invoke-static {v0, v2, v5}, Lkevin/fun/hook/SparkRenewHelper;->۟ۢۥ۟۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v7, v2, Ljava/lang/Number;

    const/16 v5, 0x650

    :goto_0
    xor-int/lit16 v5, v5, 0x661

    sparse-switch v5, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v5, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v7, :cond_0

    const/16 v5, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast v2, Ljava/lang/Number;

    invoke-static {v2}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۡۢۦ۟(Ljava/lang/Object;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v2

    :goto_1
    const/16 v3, 0x6cc

    :goto_2
    xor-int/lit16 v3, v3, 0x6dd

    sparse-switch v3, :sswitch_data_1

    goto :goto_2

    :sswitch_3
    const/16 v3, 0x6eb

    goto :goto_2

    :sswitch_4
    move v8, v2

    :goto_3
    :try_start_1
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v2

    const/16 v3, 0x69c

    sget v4, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۤۦۤۧ:I

    xor-int/lit16 v4, v4, 0x14e

    const/16 v5, 0x46a

    invoke-static {v2, v3, v4, v5}, Landroidx/startup/۟ۦۤۨۧ;->۟ۦۦۦ([SIII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    move-object/from16 v0, p0

    invoke-static {v0, v2, v3}, Lkevin/fun/hook/SparkRenewHelper;->۟ۢۥ۟۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۡۢ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Landroidx/documentfile/ۡۢ۟ۥ;->ۢۥۦۣ(Ljava/lang/Object;)Z

    move-result v3

    const v2, 0xbe7f

    :goto_4
    const v4, 0xbe90

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_2

    goto :goto_4

    :cond_1
    :sswitch_5
    const v2, 0xbebd

    goto :goto_4

    :catchall_0
    move-exception v2

    const/16 v2, 0x748

    :goto_5
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_3

    goto :goto_5

    :sswitch_6
    const v2, 0xbe22

    goto :goto_5

    :sswitch_7
    move v2, v3

    goto :goto_1

    :sswitch_8
    if-nez v3, :cond_1

    const v2, 0xbedc

    goto :goto_4

    :sswitch_9
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v2

    const/16 v3, 0x6ad

    sget v4, Landroidx/core/ۧ۟ۤۨ;->ۣۤ۠ۤ:I

    xor-int/lit16 v4, v4, 0x1bb

    const/16 v5, 0x459

    invoke-static {v2, v3, v4, v5}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۢۦۣ۠([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v9}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_6

    move-result v3

    const v2, 0xbefb

    :goto_6
    const v4, 0xbf0c

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_4

    goto :goto_6

    :cond_2
    :sswitch_a
    const v2, 0xbf39

    goto :goto_6

    :sswitch_b
    if-eqz v3, :cond_2

    const v2, 0xc1e3

    goto :goto_6

    :sswitch_c
    const v2, 0xc202

    :goto_7
    const v3, 0xc213

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_5

    goto :goto_7

    :sswitch_d
    const v2, 0xc221

    goto :goto_7

    :sswitch_e
    const-wide/16 v4, 0x0

    :try_start_2
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v2

    const/16 v3, 0x6b1

    sget v7, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    xor-int/lit8 v7, v7, 0x5f

    const/16 v10, 0x429

    invoke-static {v2, v3, v7, v10}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۧۨۦۦ([SIII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    move-object/from16 v0, p0

    invoke-static {v0, v2, v3}, Lkevin/fun/hook/SparkRenewHelper;->۟ۢۥ۟۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v7, v2, Ljava/lang/Number;

    const v3, 0xc27e

    :goto_8
    const v10, 0xc28f

    xor-int/2addr v3, v10

    sparse-switch v3, :sswitch_data_6

    goto :goto_8

    :cond_3
    :sswitch_f
    const v3, 0xc2bc

    goto :goto_8

    :sswitch_10
    if-eqz v7, :cond_3

    const v3, 0xc2db

    goto :goto_8

    :sswitch_11
    check-cast v2, Ljava/lang/Number;

    invoke-static {v2}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۤۥۨۦ(Ljava/lang/Object;)J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-result-wide v2

    :goto_9
    const v4, 0xc2fa

    :goto_a
    const v5, 0xc30b

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_7

    goto :goto_a

    :sswitch_12
    const v4, 0xc5a4

    goto :goto_a

    :sswitch_13
    move-wide v4, v2

    :sswitch_14
    :try_start_3
    invoke-static/range {p0 .. p1}, Lkevin/fun/hook/SparkRenewHelper;->۟ۢۤۢۨ(Ljava/lang/Object;Ljava/lang/Object;)J

    move-result-wide v10

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۦۦ۟ۦ()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v2

    invoke-static {v2, v9}, Landroidx/customview/ۡۤۡۤ;->۟ۥۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkevin/fun/hook/SparkRenewHelper$SparkInfo;

    const v3, 0xc67d

    :goto_b
    const v7, 0xc68e

    xor-int/2addr v3, v7

    sparse-switch v3, :sswitch_data_8

    goto :goto_b

    :cond_4
    :sswitch_15
    const v3, 0xc6bb

    goto :goto_b

    :catchall_1
    move-exception v2

    const v2, 0xc601

    :goto_c
    const v3, 0xc612

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_9

    goto :goto_c

    :sswitch_16
    const v2, 0xc620

    goto :goto_c

    :sswitch_17
    move-wide v2, v4

    goto :goto_9

    :sswitch_18
    if-nez v2, :cond_4

    const v3, 0xc965

    goto :goto_b

    :sswitch_19
    new-instance v2, Lkevin/fun/hook/SparkRenewHelper$SparkInfo;

    invoke-direct {v2}, Lkevin/fun/hook/SparkRenewHelper$SparkInfo;-><init>()V

    const v3, 0xc984

    :goto_d
    const v7, 0xc995

    xor-int/2addr v3, v7

    sparse-switch v3, :sswitch_data_a

    goto :goto_d

    :sswitch_1a
    const v3, 0xc9a3

    goto :goto_d

    :sswitch_1b
    move-object v7, v2

    :goto_e
    iput-object v9, v7, Lkevin/fun/hook/SparkRenewHelper$SparkInfo;->conversationId:Ljava/lang/String;

    iput-wide v4, v7, Lkevin/fun/hook/SparkRenewHelper$SparkInfo;->conversationShortId:J

    iput-wide v10, v7, Lkevin/fun/hook/SparkRenewHelper$SparkInfo;->otherUid:J

    iput v8, v7, Lkevin/fun/hook/SparkRenewHelper$SparkInfo;->conversationType:I

    const/4 v2, 0x0

    iput-boolean v2, v7, Lkevin/fun/hook/SparkRenewHelper$SparkInfo;->hasSpark:Z

    const/4 v2, 0x0

    iput-boolean v2, v7, Lkevin/fun/hook/SparkRenewHelper$SparkInfo;->needsRenewal:Z

    const/4 v2, 0x0

    iput v2, v7, Lkevin/fun/hook/SparkRenewHelper$SparkInfo;->days:I

    const/4 v2, -0x1

    iput v2, v7, Lkevin/fun/hook/SparkRenewHelper$SparkInfo;->currentState:I

    iput-object v6, v7, Lkevin/fun/hook/SparkRenewHelper$SparkInfo;->stateText:Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_6

    :try_start_4
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v2

    const/16 v3, 0x6c7

    sget v4, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    xor-int/lit16 v4, v4, -0x16d

    const/16 v5, 0x5c2

    invoke-static {v2, v3, v4, v5}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۧۡۥۡ([SIII)Ljava/lang/String;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_7

    move-result-object v2

    const/4 v3, 0x0

    :try_start_5
    new-array v3, v3, [Ljava/lang/Object;

    move-object/from16 v0, p1

    invoke-static {v0, v2, v3}, Lkevin/fun/hook/SparkRenewHelper;->۟ۢۥ۟۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v4, v2, Ljava/util/Map;

    const v3, 0xca00

    :goto_f
    const v5, 0xca11

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_b

    goto :goto_f

    :cond_5
    :sswitch_1c
    const v3, 0xca3e

    goto :goto_f

    :sswitch_1d
    if-eqz v4, :cond_5

    const v3, 0xca5d

    goto :goto_f

    :sswitch_1e
    check-cast v2, Ljava/util/Map;

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v3

    const/16 v4, 0x6cd

    sget v5, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۥۦ:I

    xor-int/lit16 v5, v5, 0x270

    const/16 v8, 0xb69

    invoke-static {v3, v4, v5, v8}, Landroidx/core/ktx/۟۟ۡۢ۠;->۟ۢۦۧ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->۟ۡۥ۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v4, v2, Ljava/lang/String;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    const v3, 0xca7c

    :goto_10
    const v5, 0xca8d

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_c

    goto :goto_10

    :sswitch_1f
    if-eqz v4, :cond_6

    const v3, 0xcd64

    goto :goto_10

    :cond_6
    :sswitch_20
    const v3, 0xcd45

    goto :goto_10

    :sswitch_21
    :try_start_6
    check-cast v2, Ljava/lang/String;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    const v3, 0xcd83

    :goto_11
    const v4, 0xcd94

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_d

    goto :goto_11

    :sswitch_22
    const v3, 0xcda2

    goto :goto_11

    :sswitch_23
    move-object v3, v2

    :goto_12
    :try_start_7
    invoke-static {v3}, Landroidx/documentfile/ۡۢ۟ۥ;->ۢۥۦۣ(Ljava/lang/Object;)Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    move-result v4

    const v2, 0xd106

    :goto_13
    const v5, 0xd117

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_e

    goto :goto_13

    :sswitch_24
    if-nez v4, :cond_8

    const v2, 0xd163

    goto :goto_13

    :catchall_2
    move-exception v2

    const v2, 0xcdff

    :goto_14
    const v3, 0xce10

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_f

    goto :goto_14

    :goto_15
    :sswitch_25
    :try_start_8
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۦۦ۟ۦ()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v2

    invoke-static {v2, v9, v7}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۤۦۣۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v7}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۣ۟ۧ۠ۥ(Ljava/lang/Object;)Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    move-result v3

    const v2, 0x170fb3

    :goto_16
    const v4, 0x170fc4

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_10

    goto :goto_16

    :cond_7
    :sswitch_26
    const v2, 0x170ff1

    goto :goto_16

    :sswitch_27
    const v2, 0xce1e

    goto :goto_14

    :sswitch_28
    const/4 v2, 0x0

    move-object v3, v2

    goto :goto_12

    :cond_8
    :sswitch_29
    const v2, 0xd144

    goto :goto_13

    :sswitch_2a
    :try_start_9
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v3

    const/16 v4, 0x6e4

    sget v5, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v5, v5, 0x12d

    const/16 v8, 0x3bc

    invoke-static {v3, v4, v5, v8}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۡۤۥ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/activity/ۦۧۥۥ;->ۣ۟ۦۤۤ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object v4

    const v2, 0xd182

    :goto_17
    const v3, 0xd193

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_11

    goto :goto_17

    :sswitch_2b
    if-eqz v4, :cond_9

    const v2, 0xd1df

    goto :goto_17

    :cond_9
    :sswitch_2c
    const v2, 0xd1c0

    goto :goto_17

    :sswitch_2d
    invoke-static {v4}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۥۤۦۣ(Ljava/lang/Object;)I

    move-result v3

    const v2, 0xd1fe

    :goto_18
    const v5, 0xd20f

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_12

    goto :goto_18

    :sswitch_2e
    if-lez v3, :cond_a

    const v2, 0xd4e6

    goto :goto_18

    :cond_a
    :sswitch_2f
    const v2, 0xd4c7

    goto :goto_18

    :sswitch_30
    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->۟ۦۡ۠ۡ()J

    move-result-wide v2

    const-wide/16 v10, 0x3e8

    div-long v10, v2, v10

    const/4 v2, 0x0

    move v3, v2

    :goto_19
    invoke-static {v4}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۥۤۦۣ(Ljava/lang/Object;)I

    move-result v5

    const v2, 0xd505

    :goto_1a
    const v8, 0xd516

    xor-int/2addr v2, v8

    sparse-switch v2, :sswitch_data_13

    goto :goto_1a

    :sswitch_31
    if-lt v3, v5, :cond_b

    const v2, 0xd562

    goto :goto_1a

    :cond_b
    :sswitch_32
    const v2, 0xd543

    goto :goto_1a

    :sswitch_33
    const/4 v3, -0x1

    const/4 v2, 0x0

    const v4, 0xd581

    :goto_1b
    const v5, 0xd592

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_14

    goto :goto_1b

    :sswitch_34
    const v4, 0xd5a0

    goto :goto_1b

    :sswitch_35
    move-object v4, v6

    :goto_1c
    const v5, 0xdd03

    :goto_1d
    const v6, 0xdd14

    xor-int/2addr v5, v6

    sparse-switch v5, :sswitch_data_15

    goto :goto_1d

    :sswitch_36
    const/4 v5, -0x1

    if-eq v3, v5, :cond_f

    const v5, 0x170090

    goto :goto_1d

    :sswitch_37
    invoke-static {v4, v3}, Landroidx/activity/ۦۧۥۥ;->ۣ۟۟ۤۧ(Ljava/lang/Object;I)Lorg/json/JSONObject;

    move-result-object v5

    const v2, 0xd888

    :goto_1e
    const v8, 0xd899

    xor-int/2addr v2, v8

    sparse-switch v2, :sswitch_data_16

    goto :goto_1e

    :sswitch_38
    if-nez v5, :cond_c

    const v2, 0xd8e5

    goto :goto_1e

    :cond_c
    :sswitch_39
    const v2, 0xd8c6

    goto :goto_1e

    :sswitch_3a
    const v2, 0xd904

    :goto_1f
    const v5, 0xd915

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_17

    goto :goto_1f

    :sswitch_3b
    const v2, 0xd923

    goto :goto_1f

    :sswitch_3c
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v2

    const/16 v8, 0x6ef

    sget v12, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    xor-int/lit16 v12, v12, 0x3a5

    const/16 v13, 0x660

    invoke-static {v2, v8, v12, v13}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۤ۟۠([SIII)Ljava/lang/String;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    move-result-object v2

    const-wide/16 v12, 0x15f

    sget v8, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۤۦۤۧ:I

    int-to-long v14, v8

    xor-long/2addr v12, v14

    :try_start_a
    invoke-static {v5, v2, v12, v13}, Landroidx/drawerlayout/ۤۨۡۤ;->۟۠ۤۢۥ(Ljava/lang/Object;Ljava/lang/Object;J)J

    move-result-wide v14

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v2

    const/16 v8, 0x6f4

    sget v16, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    xor-int/lit8 v16, v16, 0x51

    const/16 v17, 0xb98

    move/from16 v0, v16

    move/from16 v1, v17

    invoke-static {v2, v8, v0, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->ۤ۠ۤ۠([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v5, v2, v12, v13}, Landroidx/drawerlayout/ۤۨۡۤ;->۟۠ۤۢۥ(Ljava/lang/Object;Ljava/lang/Object;J)J

    move-result-wide v12

    const v2, 0xd980

    :goto_20
    const v8, 0xd991

    xor-int/2addr v2, v8

    sparse-switch v2, :sswitch_data_18

    goto :goto_20

    :sswitch_3d
    cmp-long v2, v14, v10

    if-gtz v2, :cond_d

    const v2, 0xdc68

    goto :goto_20

    :cond_d
    :sswitch_3e
    const v2, 0xdc49

    goto :goto_20

    :sswitch_3f
    const v2, 0xdc87

    :goto_21
    const v8, 0xdc98

    xor-int/2addr v2, v8

    sparse-switch v2, :sswitch_data_19

    goto :goto_21

    :sswitch_40
    cmp-long v2, v10, v12

    if-gez v2, :cond_e

    const v2, 0xdce4

    goto :goto_21

    :cond_e
    :sswitch_41
    const v2, 0xdcc5

    goto :goto_21

    :sswitch_42
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v2

    const/16 v3, 0x6f7

    sget v4, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    xor-int/lit16 v4, v4, 0x3a5

    const/16 v6, 0x3b8

    invoke-static {v2, v3, v4, v6}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۥۡۤۧ([SIII)Ljava/lang/String;

    move-result-object v2

    sget v3, Landroidx/activity/ۨ۠۟ۧ;->۟ۦۥۢۢ:I

    xor-int/lit16 v3, v3, -0x336

    invoke-static {v5, v2, v3}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۡ۠ۤۦ(Ljava/lang/Object;Ljava/lang/Object;I)I

    move-result v3

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v2

    const/16 v4, 0x6fc

    sget v6, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    xor-int/lit8 v6, v6, -0x72

    const/16 v8, 0x186

    invoke-static {v2, v4, v6, v8}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۧۨۦۦ([SIII)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    invoke-static {v5, v2, v4}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۡ۠ۤۦ(Ljava/lang/Object;Ljava/lang/Object;I)I

    move-result v2

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v4

    const/16 v6, 0x700

    sget v8, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    xor-int/lit8 v8, v8, 0x56

    const/16 v10, 0x97a

    invoke-static {v4, v6, v8, v10}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۨۤ۠۠([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2}, Landroidx/documentfile/ۡۢ۟ۥ;->ۢۢۨ۠(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v4, v6}, Landroidx/loader/۟۠ۢۧۡ;->ۣ۟ۨ۠۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    goto/16 :goto_1c

    :cond_f
    :sswitch_43
    const v5, 0xdd41

    goto/16 :goto_1d

    :sswitch_44
    const/4 v5, 0x1

    const/4 v6, 0x1

    iput-boolean v6, v7, Lkevin/fun/hook/SparkRenewHelper$SparkInfo;->hasSpark:Z

    iput v3, v7, Lkevin/fun/hook/SparkRenewHelper$SparkInfo;->currentState:I

    iput v2, v7, Lkevin/fun/hook/SparkRenewHelper$SparkInfo;->days:I

    iput-object v4, v7, Lkevin/fun/hook/SparkRenewHelper$SparkInfo;->stateText:Ljava/lang/String;

    const v2, 0x1700af

    :goto_22
    const v4, 0x1700c0

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_1a

    goto :goto_22

    :cond_10
    :sswitch_45
    const v2, 0x1700ed

    goto :goto_22

    :sswitch_46
    const/4 v2, 0x2

    if-eq v3, v2, :cond_10

    const v2, 0x17010c

    goto :goto_22

    :sswitch_47
    const v2, 0x17012b

    :goto_23
    const v4, 0x17013c

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_1b

    goto :goto_23

    :sswitch_48
    const/4 v2, 0x3

    if-eq v3, v2, :cond_11

    const v2, 0x170188

    goto :goto_23

    :cond_11
    :sswitch_49
    const v2, 0x170169

    goto :goto_23

    :sswitch_4a
    const/4 v2, 0x0

    const v3, 0x1701a7

    :goto_24
    const v4, 0x1701b8

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_1c

    goto :goto_24

    :sswitch_4b
    const v3, 0x170451

    goto :goto_24

    :sswitch_4c
    move v2, v5

    :sswitch_4d
    iput-boolean v2, v7, Lkevin/fun/hook/SparkRenewHelper$SparkInfo;->needsRenewal:Z
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    const v2, 0x1704ae

    :goto_25
    const v3, 0x1704bf

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_1d

    goto :goto_25

    :sswitch_4e
    const v2, 0x1704cd

    goto :goto_25

    :catchall_3
    move-exception v2

    const v2, 0x17052a

    :goto_26
    const v3, 0x17053b

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_1e

    goto :goto_26

    :sswitch_4f
    const v2, 0x170549

    goto :goto_26

    :sswitch_50
    sget v2, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۢ۟ۡ:I

    xor-int/lit16 v2, v2, -0x26f

    add-int/2addr v2, v3

    const v3, 0x170831

    :goto_27
    const v5, 0x170842

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_1f

    goto :goto_27

    :sswitch_51
    move v3, v2

    goto/16 :goto_19

    :sswitch_52
    const v3, 0x170850

    goto :goto_27

    :sswitch_53
    const v2, 0x1708ad

    :goto_28
    const v3, 0x1708be

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_20

    goto :goto_28

    :sswitch_54
    const v2, 0x1708cc

    goto :goto_28

    :sswitch_55
    const v2, 0x170929

    :goto_29
    const v3, 0x17093a

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_21

    goto :goto_29

    :sswitch_56
    const v2, 0x170bd3

    goto :goto_29

    :sswitch_57
    const v2, 0x170c30

    :goto_2a
    const v3, 0x170c41

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_22

    goto :goto_2a

    :sswitch_58
    const v2, 0x170c4f

    goto :goto_2a

    :catchall_4
    move-exception v2

    const v2, 0x170cac

    :goto_2b
    const v3, 0x170cbd

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_23

    goto :goto_2b

    :sswitch_59
    const v2, 0x170ccb

    goto :goto_2b

    :sswitch_5a
    if-eqz v3, :cond_7

    const v2, 0x171010

    goto/16 :goto_16

    :sswitch_5b
    :try_start_b
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۢۡۡ()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v2

    invoke-static {v2, v9, v7}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۤۦۣۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    const v2, 0x17102f

    :goto_2c
    const v3, 0x171040

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_24

    goto :goto_2c

    :goto_2d
    :sswitch_5c
    return-void

    :sswitch_5d
    const v2, 0x17104e

    goto :goto_2c

    :catchall_5
    move-exception v2

    const v3, 0x1710ab

    :goto_2e
    const v4, 0x1710bc

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_25

    goto :goto_2e

    :sswitch_5e
    const v3, 0x171355

    goto :goto_2e

    :sswitch_5f
    invoke-static {}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۤۢۤۦ()I

    move-result v3

    const v2, 0x1713b2

    :goto_2f
    const v4, 0x1713c3

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_26

    goto :goto_2f

    :cond_12
    :sswitch_60
    const v2, 0x1713f0

    goto :goto_2f

    :sswitch_61
    if-gtz v3, :cond_12

    const v2, 0x17140f

    goto :goto_2f

    :sswitch_62
    const-string v2, "FgJt2gCdZS"

    invoke-static {v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۧ۟۠ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v2

    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v3, v2}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    goto :goto_2d

    :catchall_6
    move-exception v2

    :sswitch_63
    invoke-static {v2}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣۡۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v4

    const/16 v5, 0x704

    sget v6, Landroidx/core/ۧ۟ۤۨ;->ۣۤ۠ۤ:I

    xor-int/lit16 v6, v6, 0x19b

    const/16 v7, 0x275

    invoke-static {v4, v5, v6, v7}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣۣ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v3, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۦۣ(Ljava/lang/Object;)V

    goto :goto_2d

    :catchall_7
    move-exception v2

    goto/16 :goto_15

    :sswitch_64
    move-object v7, v2

    goto/16 :goto_e

    :sswitch_65
    move v8, v4

    goto/16 :goto_3

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_65
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0xe -> :sswitch_5
        0x2d -> :sswitch_5f
        0x4c -> :sswitch_9
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_a
        0x35 -> :sswitch_e
        0x1f7 -> :sswitch_b
        0x7eef -> :sswitch_c
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_d
        0x32 -> :sswitch_5f
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_f
        0x33 -> :sswitch_14
        0x54 -> :sswitch_11
        0xf1 -> :sswitch_10
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_12
        0x6af -> :sswitch_13
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x12 -> :sswitch_15
        0x35 -> :sswitch_64
        0xf3 -> :sswitch_18
        0xfeb -> :sswitch_19
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x13 -> :sswitch_16
        0x32 -> :sswitch_17
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1a
        0x36 -> :sswitch_1b
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_1c
        0x11 -> :sswitch_1d
        0x2f -> :sswitch_57
        0x4c -> :sswitch_1e
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_1f
        0x7ab -> :sswitch_20
        0x7c8 -> :sswitch_28
        0x7e9 -> :sswitch_21
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_22
        0x36 -> :sswitch_23
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0x11 -> :sswitch_24
        0x32 -> :sswitch_29
        0x53 -> :sswitch_55
        0x74 -> :sswitch_2a
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0xe -> :sswitch_25
        0x3ef -> :sswitch_27
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x16 -> :sswitch_26
        0x35 -> :sswitch_5c
        0x77 -> :sswitch_5a
        0x1fd4 -> :sswitch_5b
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x11 -> :sswitch_2b
        0x32 -> :sswitch_2c
        0x4c -> :sswitch_2d
        0x53 -> :sswitch_53
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x3f1 -> :sswitch_2e
        0x6a7 -> :sswitch_2f
        0x6c8 -> :sswitch_53
        0x6e9 -> :sswitch_30
    .end sparse-switch

    :sswitch_data_13
    .sparse-switch
        0x13 -> :sswitch_31
        0x32 -> :sswitch_32
        0x55 -> :sswitch_37
        0x74 -> :sswitch_33
    .end sparse-switch

    :sswitch_data_14
    .sparse-switch
        0x13 -> :sswitch_34
        0x32 -> :sswitch_35
    .end sparse-switch

    :sswitch_data_15
    .sparse-switch
        0x17 -> :sswitch_36
        0x36 -> :sswitch_43
        0x55 -> :sswitch_25
        0x17dd84 -> :sswitch_44
    .end sparse-switch

    :sswitch_data_16
    .sparse-switch
        0x11 -> :sswitch_38
        0x3e -> :sswitch_39
        0x5f -> :sswitch_3c
        0x7c -> :sswitch_3a
    .end sparse-switch

    :sswitch_data_17
    .sparse-switch
        0x11 -> :sswitch_3b
        0x36 -> :sswitch_50
    .end sparse-switch

    :sswitch_data_18
    .sparse-switch
        0x11 -> :sswitch_3d
        0x5bb -> :sswitch_3e
        0x5d8 -> :sswitch_50
        0x5f9 -> :sswitch_3f
    .end sparse-switch

    :sswitch_data_19
    .sparse-switch
        0x1f -> :sswitch_40
        0x3e -> :sswitch_41
        0x5d -> :sswitch_50
        0x7c -> :sswitch_42
    .end sparse-switch

    :sswitch_data_1a
    .sparse-switch
        0xe -> :sswitch_45
        0x2d -> :sswitch_4c
        0x6f -> :sswitch_46
        0x1cc -> :sswitch_47
    .end sparse-switch

    :sswitch_data_1b
    .sparse-switch
        0x17 -> :sswitch_48
        0x55 -> :sswitch_4c
        0x76 -> :sswitch_49
        0xb4 -> :sswitch_4a
    .end sparse-switch

    :sswitch_data_1c
    .sparse-switch
        0x1f -> :sswitch_4b
        0x5e9 -> :sswitch_4d
    .end sparse-switch

    :sswitch_data_1d
    .sparse-switch
        0x11 -> :sswitch_4e
        0x72 -> :sswitch_25
    .end sparse-switch

    :sswitch_data_1e
    .sparse-switch
        0x11 -> :sswitch_4f
        0x72 -> :sswitch_25
    .end sparse-switch

    :sswitch_data_1f
    .sparse-switch
        0x12 -> :sswitch_51
        0x73 -> :sswitch_52
    .end sparse-switch

    :sswitch_data_20
    .sparse-switch
        0x13 -> :sswitch_54
        0x72 -> :sswitch_25
    .end sparse-switch

    :sswitch_data_21
    .sparse-switch
        0x13 -> :sswitch_56
        0x2e9 -> :sswitch_25
    .end sparse-switch

    :sswitch_data_22
    .sparse-switch
        0xe -> :sswitch_25
        0x71 -> :sswitch_58
    .end sparse-switch

    :sswitch_data_23
    .sparse-switch
        0x11 -> :sswitch_59
        0x76 -> :sswitch_25
    .end sparse-switch

    :sswitch_data_24
    .sparse-switch
        0xe -> :sswitch_5c
        0x6f -> :sswitch_5d
    .end sparse-switch

    :sswitch_data_25
    .sparse-switch
        0x17 -> :sswitch_5e
        0x3e9 -> :sswitch_63
    .end sparse-switch

    :sswitch_data_26
    .sparse-switch
        0x12 -> :sswitch_60
        0x33 -> :sswitch_5c
        0x71 -> :sswitch_61
        0x7cc -> :sswitch_62
    .end sparse-switch
.end method

.method private static runAutoRenewFlow(Landroid/app/Activity;)V
    .locals 18

    const/4 v5, 0x0

    const/4 v4, 0x0

    const/4 v2, 0x1

    new-array v8, v2, [Z

    const/4 v2, 0x0

    :sswitch_0
    const/16 v3, 0x650

    :goto_0
    xor-int/lit16 v3, v3, 0x661

    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_1
    const/16 v3, 0x68e

    goto :goto_0

    :sswitch_2
    const/16 v3, 0xf

    if-lt v2, v3, :cond_0

    const/16 v3, 0x6ad

    goto :goto_0

    :sswitch_3
    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    const/16 v2, 0x6eb

    goto :goto_1

    :sswitch_5
    const/4 v3, 0x0

    :try_start_0
    aget-boolean v6, v8, v3

    const/16 v3, 0x748

    :goto_2
    xor-int/lit16 v3, v3, 0x759

    sparse-switch v3, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz v6, :cond_1

    const v3, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_7
    const v3, 0xbe41

    goto :goto_2

    :sswitch_8
    const/4 v2, 0x0

    move v3, v2

    :sswitch_9
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۢۡۡ()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v2

    invoke-static {v2}, Landroidx/activity/ۦۧۥۥ;->ۣ۟ۦۢ(Ljava/lang/Object;)Z

    move-result v6

    const v2, 0xbe7f

    :goto_3
    const v7, 0xbe90

    xor-int/2addr v2, v7

    sparse-switch v2, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_a
    const v2, 0xbebd

    goto :goto_3

    :sswitch_b
    if-eqz v6, :cond_2

    const v2, 0xbedc

    goto :goto_3

    :sswitch_c
    const v2, 0xbefb

    :goto_4
    const v6, 0xbf0c

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_4

    goto :goto_4

    :cond_3
    :sswitch_d
    const v2, 0xbf39

    goto :goto_4

    :sswitch_e
    const/16 v2, 0x3c

    if-lt v3, v2, :cond_3

    const v2, 0xc1e3

    goto :goto_4

    :sswitch_f
    const v2, 0xc202

    :goto_5
    const v3, 0xc213

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_5

    goto :goto_5

    :sswitch_10
    const v2, 0xc221

    goto :goto_5

    :sswitch_11
    const/4 v2, 0x0

    aget-boolean v6, v8, v2

    const v2, 0xc27e

    :goto_6
    const v7, 0xc28f

    xor-int/2addr v2, v7

    sparse-switch v2, :sswitch_data_6

    goto :goto_6

    :cond_4
    :sswitch_12
    const v2, 0xc2bc

    goto :goto_6

    :sswitch_13
    if-eqz v6, :cond_4

    const v2, 0xc2db

    goto :goto_6

    :sswitch_14
    const v2, 0xc2fa

    :goto_7
    const v3, 0xc30b

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_7

    goto :goto_7

    :sswitch_15
    const v2, 0xc5a4

    goto :goto_7

    :sswitch_16
    const-wide/16 v6, 0x3e8

    invoke-static {v6, v7}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۡۡۥۨ(J)V

    sget v2, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    xor-int/lit16 v2, v2, -0x21f

    add-int/2addr v3, v2

    const v2, 0xc601

    :goto_8
    const v6, 0xc612

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_8

    goto :goto_8

    :sswitch_17
    const v2, 0xc620

    goto :goto_8

    :sswitch_18
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۢۡۡ()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v2

    invoke-static {v2}, Landroidx/activity/ۦۧۥۥ;->ۣ۟ۦۢ(Ljava/lang/Object;)Z

    move-result v3

    const v2, 0xc67d

    :goto_9
    const v6, 0xc68e

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_9

    goto :goto_9

    :cond_5
    :sswitch_19
    const v2, 0xc6bb

    goto :goto_9

    :sswitch_1a
    if-eqz v3, :cond_5

    const v2, 0xc965

    goto :goto_9

    :sswitch_1b
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v2

    const/16 v3, 0x728

    sget v4, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    xor-int/lit8 v4, v4, -0x61

    const/16 v5, 0x365

    invoke-static {v2, v3, v4, v5}, Landroidx/interpolator/۟ۧۦ۟ۨ;->۠ۤۤۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۦۣ(Ljava/lang/Object;)V

    const/4 v2, 0x0

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v3

    const/16 v4, 0x73d

    sget v5, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    xor-int/lit16 v5, v5, 0x241

    const/16 v6, 0xc71

    invoke-static {v3, v4, v5, v6}, Landroidx/loader/ۢۥ۟;->۟ۧ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, p0

    invoke-static {v0, v2, v3}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۡۧ۠(Ljava/lang/Object;ZLjava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۨۥۣ()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v3}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۥۥۤ۟(Ljava/lang/Object;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۠ۡۦۢ()V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۨۥۣ()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v3}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۥۥۤ۟(Ljava/lang/Object;Z)V

    invoke-static {}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۤۦۣ()I

    move-result v3

    const v2, 0xc984

    :goto_a
    const v4, 0xc995

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_a

    goto :goto_a

    :sswitch_1c
    if-gtz v3, :cond_6

    const v2, 0xc9e1

    goto :goto_a

    :cond_6
    :sswitch_1d
    const v2, 0xc9c2

    goto :goto_a

    :sswitch_1e
    const-string v2, "mn"

    invoke-static {v2}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۡۡۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v3, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :goto_b
    :sswitch_1f
    return-void

    :sswitch_20
    :try_start_1
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡ۠ۡۤ()Ljava/util/ArrayList;

    move-result-object v9

    invoke-static {v9}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣ۟۠ۨ(Ljava/lang/Object;)I

    move-result v10

    invoke-static {v9}, Landroidx/loader/ۢۥ۟;->۟ۥۡۢۥ(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v3

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v2

    const/16 v6, 0x74f

    sget v7, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦۦۤ۟:I

    xor-int/lit16 v7, v7, 0x95

    const/16 v11, 0xbc4

    invoke-static {v2, v6, v7, v11}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟۟۠ۤۤ([SIII)Ljava/lang/String;

    move-result-object v11

    const v2, 0xca00

    :goto_c
    const v6, 0xca11

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_b

    goto :goto_c

    :cond_7
    :sswitch_21
    const v2, 0xca3e

    goto :goto_c

    :sswitch_22
    if-eqz v3, :cond_7

    const v2, 0xca5d

    goto :goto_c

    :sswitch_23
    :try_start_2
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟۟ۨۡ()Ljava/lang/String;

    move-result-object v2

    invoke-static {v11, v2}, Landroidx/core/ۧ۟ۤۨ;->ۨۢۢۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x1

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v3

    const/16 v4, 0x768

    sget v5, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    xor-int/lit8 v5, v5, -0x1a

    const/16 v6, 0xa05

    invoke-static {v3, v4, v5, v6}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟ۡۧۨ([SIII)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, p0

    invoke-static {v0, v2, v3}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۡۧ۠(Ljava/lang/Object;ZLjava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۨۥۣ()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v3}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۥۥۤ۟(Ljava/lang/Object;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۠ۡۦۢ()V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۨۥۣ()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v3}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۥۥۤ۟(Ljava/lang/Object;Z)V

    goto :goto_b

    :sswitch_24
    const/4 v2, 0x0

    move v3, v2

    :sswitch_25
    :try_start_3
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۡ۠ۢ()Z

    move-result v6

    const v2, 0xca7c

    :goto_d
    const v7, 0xca8d

    xor-int/2addr v2, v7

    sparse-switch v2, :sswitch_data_c

    goto :goto_d

    :sswitch_26
    if-nez v6, :cond_8

    const v2, 0xcd64

    goto :goto_d

    :cond_8
    :sswitch_27
    const v2, 0xcd45

    goto :goto_d

    :sswitch_28
    const v2, 0xcd83

    :goto_e
    const v6, 0xcd94

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_d

    goto :goto_e

    :sswitch_29
    const/16 v2, 0x1e

    if-lt v3, v2, :cond_9

    const v2, 0xcde0

    goto :goto_e

    :cond_9
    :sswitch_2a
    const v2, 0xcdc1

    goto :goto_e

    :sswitch_2b
    const v2, 0xcdff

    :goto_f
    const v3, 0xce10

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_e

    goto :goto_f

    :sswitch_2c
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۡ۠ۢ()Z

    move-result v3

    const v2, 0xd505

    :goto_10
    const v6, 0xd516

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_f

    goto :goto_10

    :sswitch_2d
    if-nez v3, :cond_b

    const v2, 0xd562

    goto :goto_10

    :sswitch_2e
    const v2, 0xce1e

    goto :goto_f

    :sswitch_2f
    const/4 v2, 0x0

    aget-boolean v6, v8, v2

    const v2, 0xd106

    :goto_11
    const v7, 0xd117

    xor-int/2addr v2, v7

    sparse-switch v2, :sswitch_data_10

    goto :goto_11

    :sswitch_30
    if-eqz v6, :cond_a

    const v2, 0xd163

    goto :goto_11

    :cond_a
    :sswitch_31
    const v2, 0xd144

    goto :goto_11

    :sswitch_32
    const v2, 0xd182

    :goto_12
    const v3, 0xd193

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_11

    goto :goto_12

    :sswitch_33
    const v2, 0xd1a1

    goto :goto_12

    :sswitch_34
    const-wide/16 v6, 0x3e8

    invoke-static {v6, v7}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۡۡۥۨ(J)V

    sget v2, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    xor-int/lit16 v2, v2, 0xc2

    add-int/2addr v3, v2

    const v2, 0xd1fe

    :goto_13
    const v6, 0xd20f

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_12

    goto :goto_13

    :sswitch_35
    const v2, 0xd4a8

    goto :goto_13

    :cond_b
    :sswitch_36
    const v2, 0xd543

    goto :goto_10

    :sswitch_37
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v2

    const/16 v3, 0x772

    sget v4, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۤۥ:I

    xor-int/lit16 v4, v4, 0x3ae

    const/16 v5, 0xc66

    invoke-static {v2, v3, v4, v5}, Landroidx/startup/ۤۧۥۣ;->۟ۧۦ۠ۦ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۦۣ(Ljava/lang/Object;)V

    const/4 v2, 0x0

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v3

    const/16 v4, 0x789

    sget v5, Landroidx/loader/ۡۢۢ;->ۣۡۦ۟:I

    xor-int/lit16 v5, v5, -0x3aa

    const/16 v6, 0x1e8

    invoke-static {v3, v4, v5, v6}, Landroidx/loader/۟۠ۢۧۡ;->ۢ۟ۨۥ([SIII)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, p0

    invoke-static {v0, v2, v3}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۡۧ۠(Ljava/lang/Object;ZLjava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۨۥۣ()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v3}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۥۥۤ۟(Ljava/lang/Object;Z)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۠ۡۦۢ()V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۨۥۣ()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v3}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۥۥۤ۟(Ljava/lang/Object;Z)V

    goto/16 :goto_b

    :sswitch_38
    :try_start_4
    move-object/from16 v0, p0

    invoke-static {v0, v10, v8}, Lkevin/fun/hook/SparkRenewHelper;->ۣۧ۠ۤ(Ljava/lang/Object;ILjava/lang/Object;)V

    const/4 v2, 0x0

    move v7, v2

    move v3, v5

    :goto_14
    const/4 v5, 0x1

    invoke-static {v9}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣ۟۠ۨ(Ljava/lang/Object;)I

    move-result v6

    const v2, 0xd581

    :goto_15
    const v12, 0xd592

    xor-int/2addr v2, v12

    sparse-switch v2, :sswitch_data_13

    goto :goto_15

    :sswitch_39
    if-lt v7, v6, :cond_c

    const v2, 0xd869

    goto :goto_15

    :cond_c
    :sswitch_3a
    const v2, 0xd5bf

    goto :goto_15

    :sswitch_3b
    const v2, 0xd888

    :goto_16
    const v6, 0xd899

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_14

    goto :goto_16

    :sswitch_3c
    const v2, 0xd8a7

    goto :goto_16

    :sswitch_3d
    invoke-static {v9, v7}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟۠ۢۢۨ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkevin/fun/hook/SparkRenewHelper$SparkInfo;

    invoke-static {v2}, Landroidx/viewpager/ۣۢ۟ۤ;->۟۟ۨۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lkevin/fun/hook/SparkRenewHelper;->۠ۦۥۨ(Ljava/lang/Object;)Z

    move-result v12

    const v6, 0xd904

    :goto_17
    const v13, 0xd915

    xor-int/2addr v6, v13

    sparse-switch v6, :sswitch_data_15

    goto :goto_17

    :sswitch_3e
    if-eqz v12, :cond_d

    const v6, 0xd961

    goto :goto_17

    :cond_d
    :sswitch_3f
    const v6, 0xd942

    goto :goto_17

    :sswitch_40
    const v2, 0xd980

    :goto_18
    const v5, 0xd991

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_16

    goto :goto_18

    :sswitch_41
    const v2, 0xdc2a

    goto :goto_18

    :sswitch_42
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۡ۠ۢ()Z

    move-result v12

    const v6, 0xdc87

    :goto_19
    const v13, 0xdc98

    xor-int/2addr v6, v13

    sparse-switch v6, :sswitch_data_17

    goto :goto_19

    :sswitch_43
    if-nez v12, :cond_e

    const v6, 0xdce4

    goto :goto_19

    :cond_e
    :sswitch_44
    const v6, 0xdcc5

    goto :goto_19

    :sswitch_45
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v2

    const/16 v6, 0x7a0

    sget v7, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۢۥۨۦ:I

    xor-int/lit16 v7, v7, 0x285

    const/16 v9, 0x27d

    invoke-static {v2, v6, v7, v9}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣ۟۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۦۣ(Ljava/lang/Object;)V

    :sswitch_46
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۥ۠ۤۡ()V

    const v2, 0xdd03

    :goto_1a
    const v6, 0xdd14

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_18

    goto :goto_1a

    :sswitch_47
    if-lez v10, :cond_f

    const v2, 0x170090

    goto :goto_1a

    :cond_f
    :sswitch_48
    const v2, 0xdd41

    goto :goto_1a

    :sswitch_49
    const v2, 0x1700af

    :goto_1b
    const v6, 0x1700c0

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_19

    goto :goto_1b

    :cond_10
    :sswitch_4a
    const v2, 0x1700ed

    goto :goto_1b

    :sswitch_4b
    if-lez v3, :cond_10

    const v2, 0x17010c

    goto :goto_1b

    :sswitch_4c
    const v2, 0x17012b

    :goto_1c
    const v6, 0x17013c

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_1a

    goto :goto_1c

    :sswitch_4d
    add-int v2, v3, v4

    if-lt v2, v10, :cond_11

    const v2, 0x170188

    goto :goto_1c

    :cond_11
    :sswitch_4e
    const v2, 0x170169

    goto :goto_1c

    :sswitch_4f
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟۟ۨۡ()Ljava/lang/String;

    move-result-object v2

    invoke-static {v11, v2}, Landroidx/core/ۧ۟ۤۨ;->ۨۢۢۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v2, 0x1701a7

    :goto_1d
    const v6, 0x1701b8

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_1b

    goto :goto_1d

    :sswitch_50
    const v2, 0x170451

    goto :goto_1d

    :sswitch_51
    const v2, 0x1704ae

    :goto_1e
    const v6, 0x1704bf

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_1c

    goto :goto_1e

    :sswitch_52
    if-lez v10, :cond_12

    const v2, 0x17050b

    goto :goto_1e

    :cond_12
    :sswitch_53
    const v2, 0x1704ec

    goto :goto_1e

    :sswitch_54
    const v2, 0x17052a

    :goto_1f
    const v6, 0x17053b

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_1d

    goto :goto_1f

    :sswitch_55
    if-nez v3, :cond_13

    const v2, 0x170812

    goto :goto_1f

    :cond_13
    :sswitch_56
    const v2, 0x170568

    goto :goto_1f

    :sswitch_57
    const v2, 0x170831

    :goto_20
    const v6, 0x170842

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_1e

    goto :goto_20

    :cond_14
    :sswitch_58
    const v2, 0x17086f

    goto :goto_20

    :sswitch_59
    if-ne v4, v10, :cond_14

    const v2, 0x17088e

    goto :goto_20

    :sswitch_5a
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۨۥۣ()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v2

    const/4 v6, 0x0

    invoke-static {v2, v6}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۥۥۤ۟(Ljava/lang/Object;Z)V

    const v2, 0x1708ad

    :goto_21
    const v6, 0x1708be

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_1f

    goto :goto_21

    :sswitch_5b
    const v2, 0x1708cc

    goto :goto_21

    :sswitch_5c
    const/4 v2, 0x0

    aget-boolean v6, v8, v2

    const v2, 0x170929

    :goto_22
    const v7, 0x17093a

    xor-int/2addr v2, v7

    sparse-switch v2, :sswitch_data_20

    goto :goto_22

    :sswitch_5d
    if-eqz v6, :cond_15

    const v2, 0x170c11

    goto :goto_22

    :cond_15
    :sswitch_5e
    const v2, 0x170bf2

    goto :goto_22

    :sswitch_5f
    move-object/from16 v0, p0

    invoke-static {v0, v10, v3, v4}, Lkevin/fun/hook/SparkRenewHelper;->۟ۥۣۤۧ(Ljava/lang/Object;III)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    const v2, 0x170c30

    :goto_23
    const v3, 0x170c41

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_21

    goto :goto_23

    :goto_24
    :sswitch_60
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۠ۡۦۢ()V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۨۥۣ()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v3}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۥۥۤ۟(Ljava/lang/Object;Z)V

    const v2, 0x17102f

    :goto_25
    const v3, 0x171040

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_22

    goto :goto_25

    :sswitch_61
    const v2, 0x17104e

    goto :goto_25

    :sswitch_62
    const v2, 0x170c4f

    goto :goto_23

    :sswitch_63
    const v2, 0x170cac

    :goto_26
    const v6, 0x170cbd

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_23

    goto :goto_26

    :sswitch_64
    if-lez v3, :cond_16

    const v2, 0x170f94

    goto :goto_26

    :cond_16
    :sswitch_65
    const v2, 0x170cea

    goto :goto_26

    :sswitch_66
    const v2, 0x170fb3

    :goto_27
    const v6, 0x170fc4

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_24

    goto :goto_27

    :sswitch_67
    move v2, v5

    :goto_28
    :try_start_5
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v6

    const/16 v7, 0x7b6

    sget v9, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۨ۠ۧ:I

    xor-int/lit16 v9, v9, -0x1b8

    const/16 v11, 0x657

    invoke-static {v6, v7, v9, v11}, Landroidx/customview/ۡۤۡۤ;->ۧ۟ۤۨ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {v5, v10}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v6

    const/16 v7, 0x7c0

    sget v9, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    xor-int/lit8 v9, v9, -0x72

    const/16 v10, 0xb7e

    invoke-static {v6, v7, v9, v10}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۡۤۥ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {v5, v3}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v5

    const/16 v6, 0x7c4

    sget v7, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    xor-int/lit16 v7, v7, -0x3c8

    const/16 v9, 0x2c4

    invoke-static {v5, v6, v7, v9}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۦۣۣۦ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v3, v4}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v3}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, p0

    invoke-static {v0, v2, v3}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۡۧ۠(Ljava/lang/Object;ZLjava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto/16 :goto_24

    :catchall_0
    move-exception v2

    :try_start_6
    invoke-static {v2}, Landroidx/loader/ۥۧۨۤ;->ۦۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v5

    const/16 v6, 0x7f2

    sget v7, Landroidx/loader/ۡۢۢ;->ۣۡۦ۟:I

    xor-int/lit16 v7, v7, -0x3b0

    const/16 v9, 0x45c

    invoke-static {v5, v6, v7, v9}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۧۨۦۦ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {v4, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v3}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۦۣ(Ljava/lang/Object;)V

    const/4 v3, 0x0

    aget-boolean v4, v8, v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    const v3, 0x171b34

    :goto_29
    const v5, 0x171b45

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_25

    goto :goto_29

    :cond_17
    :sswitch_68
    const v3, 0x171b72

    goto :goto_29

    :sswitch_69
    const v2, 0x170fd2

    goto/16 :goto_27

    :sswitch_6a
    const/4 v2, 0x0

    goto/16 :goto_28

    :sswitch_6b
    const/4 v5, 0x0

    aget-boolean v6, v8, v5

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v5

    const/16 v12, 0x7c8

    const/4 v13, 0x1

    const/16 v14, 0xc85

    invoke-static {v5, v12, v13, v14}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۤ۟۠([SIII)Ljava/lang/String;

    move-result-object v12

    const v5, 0x1710ab

    :goto_2a
    const v13, 0x1710bc

    xor-int/2addr v5, v13

    sparse-switch v5, :sswitch_data_26

    goto :goto_2a

    :sswitch_6c
    if-nez v6, :cond_18

    const v5, 0x171393

    goto :goto_2a

    :cond_18
    :sswitch_6d
    const v5, 0x171374

    goto :goto_2a

    :sswitch_6e
    sget v5, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۡۨۨۧ:I

    :try_start_7
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v13

    const/16 v14, 0x7c9

    sget v15, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    xor-int/lit8 v15, v15, 0x57

    const/16 v16, 0x5c6

    invoke-static/range {v13 .. v16}, Landroidx/core/ktx/۟۟ۡۢ۠;->۟ۢۦۧ([SIII)Ljava/lang/String;

    move-result-object v13

    invoke-static {v6, v13}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    xor-int/lit16 v5, v5, -0x1e7

    add-int/2addr v5, v7

    invoke-static {v6, v5}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {v5, v12}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {v5, v10}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v6

    const/16 v13, 0x7ce

    sget v14, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦۦۤ۟:I

    xor-int/lit16 v14, v14, 0x8e

    const/16 v15, 0x26a

    invoke-static {v6, v13, v14, v15}, Landroidx/appcompat/ۣۧۤۢ;->ۢۥۢ۟([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {v5}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v7, v10, v5}, Lkevin/fun/hook/SparkRenewHelper;->ۤۡۥۤ(IILjava/lang/Object;)V

    :sswitch_6f
    invoke-static {v2}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۢ۟۟(Ljava/lang/Object;)Z

    move-result v6

    const v5, 0x1713b2

    :goto_2b
    const v13, 0x1713c3

    xor-int/2addr v5, v13

    sparse-switch v5, :sswitch_data_27

    goto :goto_2b

    :cond_19
    :sswitch_70
    const v5, 0x1713f0

    goto :goto_2b

    :sswitch_71
    if-eqz v6, :cond_19

    const v5, 0x17140f

    goto :goto_2b

    :sswitch_72
    sget v5, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۡۦۥۨ:I

    xor-int/lit16 v5, v5, 0x11f

    add-int/2addr v3, v5

    invoke-static {v2}, Landroidx/viewpager/ۣۢ۟ۤ;->۟۟ۨۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/SparkRenewHelper;->ۤۥۦ۠(Ljava/lang/Object;)V

    const v2, 0x17142e

    :goto_2c
    const v5, 0x17143f

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_28

    goto :goto_2c

    :sswitch_73
    const v2, 0x17144d

    goto :goto_2c

    :sswitch_74
    move v2, v3

    :goto_2d
    const/4 v3, 0x0

    aget-boolean v5, v8, v3

    const v3, 0x171735

    :goto_2e
    const v6, 0x171746

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_29

    goto :goto_2e

    :cond_1a
    :sswitch_75
    const v3, 0x171773

    goto :goto_2e

    :sswitch_76
    sget v5, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    xor-int/lit16 v5, v5, -0x259

    add-int/2addr v4, v5

    invoke-static {v2}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->۟ۢۨۢۨ(Ljava/lang/Object;)J

    move-result-wide v14

    invoke-static {v2}, Landroidx/loader/ۥۧۨۤ;->۟ۢۢۥۤ(Ljava/lang/Object;)I

    move-result v2

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v6

    const/16 v13, 0x7d0

    sget v16, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    move/from16 v0, v16

    xor-int/lit16 v0, v0, 0x3b2

    move/from16 v16, v0

    const/16 v17, 0x562

    move/from16 v0, v16

    move/from16 v1, v17

    invoke-static {v6, v13, v0, v1}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠۠ۧۥ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {v5, v14, v15}, Landroidx/loader/ۢۥ۟;->۟ۥۣۢۡ(Ljava/lang/Object;J)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v6

    const/16 v13, 0x7e2

    sget v14, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۤ۟ۧۤ:I

    xor-int/lit16 v14, v14, -0x1e4

    const/16 v15, 0x3ca

    invoke-static {v6, v13, v14, v15}, Landroidx/versionedparcelable/۠ۡۧۤ;->۟۟ۤۢۡ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {v5, v2}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۦۣ(Ljava/lang/Object;)V

    move v2, v3

    goto :goto_2d

    :sswitch_77
    if-nez v5, :cond_1a

    const v3, 0x171792

    goto :goto_2e

    :sswitch_78
    sget v3, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    sget v5, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦۦۤ۟:I

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    xor-int/lit16 v3, v3, -0x10a

    add-int/2addr v3, v7

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v13

    const/16 v14, 0x7e6

    sget v15, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۤ۟ۨ:I

    xor-int/lit16 v15, v15, -0x1ac

    const/16 v16, 0x4c9

    invoke-static/range {v13 .. v16}, Landroidx/activity/ۣۦۡۥ;->۟ۡۨ۟۟([SIII)Ljava/lang/String;

    move-result-object v13

    invoke-static {v6, v13}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    xor-int/lit16 v5, v5, 0x8d

    add-int/2addr v5, v7

    invoke-static {v6, v5}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {v5, v12}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {v5, v10}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v6

    const/16 v12, 0x7ea

    sget v13, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۨ۠ۧ:I

    xor-int/lit16 v13, v13, -0x1ba

    const/16 v14, 0x931

    invoke-static {v6, v12, v13, v14}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۨۦۣۨ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {v5, v2}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v6

    const/16 v12, 0x7ee

    sget v13, Landroidx/activity/ۤۧۧۧ;->۟۟ۢ۠ۡ:I

    xor-int/lit16 v13, v13, 0x1ee

    const/16 v14, 0x247

    invoke-static {v6, v12, v13, v14}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۦۧۦ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {v5, v4}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {v5}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v10, v5}, Lkevin/fun/hook/SparkRenewHelper;->ۤۡۥۤ(IILjava/lang/Object;)V

    :sswitch_79
    const-wide/16 v12, -0x663

    sget v3, Landroidx/loader/ۡۢۢ;->ۣۡۦ۟:I

    int-to-long v14, v3

    xor-long/2addr v12, v14

    invoke-static {v12, v13}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۡۡۥۨ(J)V

    move v3, v2

    :sswitch_7a
    sget v2, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    xor-int/lit8 v2, v2, -0x75

    add-int v5, v7, v2

    const v2, 0x1717b1

    :goto_2f
    const v6, 0x1717c2

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_2a

    goto :goto_2f

    :sswitch_7b
    move v7, v5

    goto/16 :goto_14

    :sswitch_7c
    const v2, 0x1717d0

    goto :goto_2f

    :sswitch_7d
    const-wide/16 v6, 0x3e8

    invoke-static {v6, v7}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۡۡۥۨ(J)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    sget v3, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣ۠ۢۢ:I

    xor-int/lit8 v3, v3, -0x70

    add-int/2addr v2, v3

    const v3, 0x17182d

    :goto_30
    const v6, 0x17183e

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_2b

    goto :goto_30

    :sswitch_7e
    const v3, 0x171ad7

    goto :goto_30

    :sswitch_7f
    if-nez v4, :cond_17

    const v3, 0x171b91

    goto/16 :goto_29

    :sswitch_80
    :try_start_8
    invoke-static {v2}, Landroidx/loader/ۥۧۨۤ;->ۦۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v4, 0x0

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v5

    const/16 v6, 0x803

    sget v7, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۢ۟ۡ:I

    xor-int/lit16 v7, v7, -0x269

    const/16 v8, 0x971

    invoke-static {v5, v6, v7, v8}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۥۡۤۧ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v3, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-static {v0, v4, v2}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۡۧ۠(Ljava/lang/Object;ZLjava/lang/Object;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :sswitch_81
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۠ۡۦۢ()V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۨۥۣ()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v3}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۥۥۤ۟(Ljava/lang/Object;Z)V

    goto/16 :goto_b

    :catchall_1
    move-exception v2

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۠ۡۦۢ()V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۨۥۣ()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v3, v4}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۥۥۤ۟(Ljava/lang/Object;Z)V

    throw v2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_1
        0x31 -> :sswitch_2
        0xcc -> :sswitch_3
        0xef -> :sswitch_5
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_8
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_7d
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_a
        0x2d -> :sswitch_18
        0x4c -> :sswitch_c
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_d
        0x35 -> :sswitch_11
        0x1f7 -> :sswitch_e
        0x7eef -> :sswitch_f
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_10
        0x32 -> :sswitch_18
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
        0x6af -> :sswitch_18
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_17
        0x32 -> :sswitch_9
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_19
        0x35 -> :sswitch_20
        0xf3 -> :sswitch_1a
        0xfeb -> :sswitch_1b
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1c
        0x36 -> :sswitch_1d
        0x57 -> :sswitch_1f
        0x74 -> :sswitch_1e
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_21
        0x11 -> :sswitch_22
        0x2f -> :sswitch_24
        0x4c -> :sswitch_23
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_26
        0x7ab -> :sswitch_27
        0x7c8 -> :sswitch_2c
        0x7e9 -> :sswitch_28
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_29
        0x36 -> :sswitch_2a
        0x55 -> :sswitch_2f
        0x74 -> :sswitch_2b
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_2c
        0x3ef -> :sswitch_2e
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x13 -> :sswitch_2d
        0x32 -> :sswitch_36
        0x55 -> :sswitch_38
        0x74 -> :sswitch_37
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x11 -> :sswitch_30
        0x32 -> :sswitch_31
        0x53 -> :sswitch_34
        0x74 -> :sswitch_32
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x11 -> :sswitch_33
        0x32 -> :sswitch_2c
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x3f1 -> :sswitch_35
        0x6a7 -> :sswitch_25
    .end sparse-switch

    :sswitch_data_13
    .sparse-switch
        0x13 -> :sswitch_39
        0x2d -> :sswitch_3d
        0x32 -> :sswitch_3a
        0xdfb -> :sswitch_3b
    .end sparse-switch

    :sswitch_data_14
    .sparse-switch
        0x11 -> :sswitch_3c
        0x3e -> :sswitch_46
    .end sparse-switch

    :sswitch_data_15
    .sparse-switch
        0x11 -> :sswitch_3e
        0x36 -> :sswitch_3f
        0x57 -> :sswitch_42
        0x74 -> :sswitch_40
    .end sparse-switch

    :sswitch_data_16
    .sparse-switch
        0x11 -> :sswitch_41
        0x5bb -> :sswitch_7a
    .end sparse-switch

    :sswitch_data_17
    .sparse-switch
        0x1f -> :sswitch_43
        0x3e -> :sswitch_44
        0x5d -> :sswitch_6b
        0x7c -> :sswitch_45
    .end sparse-switch

    :sswitch_data_18
    .sparse-switch
        0x17 -> :sswitch_47
        0x36 -> :sswitch_48
        0x55 -> :sswitch_51
        0x17dd84 -> :sswitch_49
    .end sparse-switch

    :sswitch_data_19
    .sparse-switch
        0xe -> :sswitch_4a
        0x2d -> :sswitch_51
        0x6f -> :sswitch_4b
        0x1cc -> :sswitch_4c
    .end sparse-switch

    :sswitch_data_1a
    .sparse-switch
        0x17 -> :sswitch_4d
        0x55 -> :sswitch_51
        0x76 -> :sswitch_4e
        0xb4 -> :sswitch_4f
    .end sparse-switch

    :sswitch_data_1b
    .sparse-switch
        0x1f -> :sswitch_50
        0x5e9 -> :sswitch_5c
    .end sparse-switch

    :sswitch_data_1c
    .sparse-switch
        0x11 -> :sswitch_52
        0x53 -> :sswitch_5c
        0x72 -> :sswitch_53
        0x1b4 -> :sswitch_54
    .end sparse-switch

    :sswitch_data_1d
    .sparse-switch
        0x11 -> :sswitch_55
        0x53 -> :sswitch_5c
        0x72 -> :sswitch_56
        0xd29 -> :sswitch_57
    .end sparse-switch

    :sswitch_data_1e
    .sparse-switch
        0x12 -> :sswitch_58
        0x2d -> :sswitch_5c
        0x73 -> :sswitch_59
        0xcc -> :sswitch_5a
    .end sparse-switch

    :sswitch_data_1f
    .sparse-switch
        0x13 -> :sswitch_5b
        0x72 -> :sswitch_5c
    .end sparse-switch

    :sswitch_data_20
    .sparse-switch
        0x13 -> :sswitch_5d
        0x2c8 -> :sswitch_63
        0x2e9 -> :sswitch_5e
        0x52b -> :sswitch_5f
    .end sparse-switch

    :sswitch_data_21
    .sparse-switch
        0xe -> :sswitch_60
        0x71 -> :sswitch_62
    .end sparse-switch

    :sswitch_data_22
    .sparse-switch
        0xe -> :sswitch_1f
        0x6f -> :sswitch_61
    .end sparse-switch

    :sswitch_data_23
    .sparse-switch
        0x11 -> :sswitch_64
        0x57 -> :sswitch_6a
        0x76 -> :sswitch_65
        0x329 -> :sswitch_66
    .end sparse-switch

    :sswitch_data_24
    .sparse-switch
        0x16 -> :sswitch_67
        0x77 -> :sswitch_69
    .end sparse-switch

    :sswitch_data_25
    .sparse-switch
        0x16 -> :sswitch_68
        0x37 -> :sswitch_81
        0x71 -> :sswitch_7f
        0xd4 -> :sswitch_80
    .end sparse-switch

    :sswitch_data_26
    .sparse-switch
        0x17 -> :sswitch_6c
        0x32f -> :sswitch_6e
        0x3c8 -> :sswitch_6f
        0x3e9 -> :sswitch_6d
    .end sparse-switch

    :sswitch_data_27
    .sparse-switch
        0x12 -> :sswitch_70
        0x33 -> :sswitch_76
        0x71 -> :sswitch_71
        0x7cc -> :sswitch_72
    .end sparse-switch

    :sswitch_data_28
    .sparse-switch
        0x11 -> :sswitch_73
        0x72 -> :sswitch_74
    .end sparse-switch

    :sswitch_data_29
    .sparse-switch
        0x12 -> :sswitch_75
        0x35 -> :sswitch_79
        0x73 -> :sswitch_77
        0xd4 -> :sswitch_78
    .end sparse-switch

    :sswitch_data_2a
    .sparse-switch
        0x12 -> :sswitch_7b
        0x73 -> :sswitch_7c
    .end sparse-switch

    :sswitch_data_2b
    .sparse-switch
        0x13 -> :sswitch_7e
        0x2e9 -> :sswitch_0
    .end sparse-switch
.end method

.method public static saveCustomMessage(Ljava/lang/String;)V
    .locals 4

    invoke-static {p0}, Landroidx/documentfile/ۡۢ۟ۥ;->ۢۥۦۣ(Ljava/lang/Object;)Z

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
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x80a

    sget v2, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    xor-int/lit16 v2, v2, 0x17b

    const/16 v3, 0xa7a

    invoke-static {v0, v1, v2, v3}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣۣ۟ۤۤ([SIII)Ljava/lang/String;

    move-result-object p0

    :sswitch_3
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x80c

    sget v2, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۤۥ:I

    xor-int/lit16 v2, v2, 0x3ad

    const/16 v3, 0x2a5

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۦۣۣۦ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Landroidx/core/ۧ۟ۤۨ;->ۨۢۢۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method private static saveRenewDate(Ljava/lang/String;)V
    .locals 9

    const/4 v6, 0x0

    const/4 v1, 0x0

    const-string v8, "\u06e8\u06e0\u06e2"

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

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\u06e1\u06e3"

    move-object v3, v1

    move-object v8, v6

    goto :goto_0

    :sswitch_0
    invoke-static {v3}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e5\u06e2\u06e0"

    move-object v4, v1

    move-object v8, v6

    goto :goto_0

    :sswitch_1
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v1

    const-string v6, "\u06e1\u06e1\u06e2"

    move-object v2, v1

    move-object v8, v6

    goto :goto_0

    :sswitch_2
    invoke-static {v4, p0}, Landroidx/core/ۧ۟ۤۨ;->ۨۢۢۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e8\u06e0\u06e4"

    move-object v8, v1

    goto :goto_0

    :sswitch_3
    const/16 v1, 0x820

    const/16 v4, 0x2c2

    invoke-static {v2, v1, v5, v4}, Landroidx/loader/ۥۧۨۤ;->۟ۢۢ۠ۥ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v6, "\u06e1\u06df\u06e1"

    move-object v4, v1

    move-object v8, v6

    goto :goto_0

    :sswitch_4
    invoke-static {v0, p0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v6, "\u06df\u06e8\u06e3"

    move-object v3, v1

    move-object v8, v6

    goto :goto_0

    :sswitch_5
    sget v6, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۢۥۨۦ:I

    const-string v1, "\u06df\u06e3\u06e7"

    move v7, v6

    move-object v8, v1

    goto :goto_0

    :sswitch_6
    xor-int/lit16 v1, v7, 0x282

    const-string v6, "\u06e2\u06e7\u06e4"

    move v5, v1

    move-object v8, v6

    goto :goto_0

    :sswitch_7
    invoke-static {v3, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\u06e4\u06e6\u06df"

    move-object v8, v1

    goto :goto_0

    :sswitch_8
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟۟ۨۡ()Ljava/lang/String;

    move-result-object p0

    const-string v1, "\u06df\u06e8\u06e2"

    move-object v8, v1

    goto :goto_0

    :sswitch_9
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc22 -> :sswitch_1
        0x1aa783 -> :sswitch_6
        0x1aa819 -> :sswitch_2
        0x1aa81a -> :sswitch_0
        0x1aae83 -> :sswitch_7
        0x1aaec2 -> :sswitch_5
        0x1ab33f -> :sswitch_3
        0x1aba9d -> :sswitch_4
        0x1abde3 -> :sswitch_8
        0x1ac8ec -> :sswitch_9
    .end sparse-switch
.end method

.method private static saveSparkUserName(JLjava/lang/String;)V
    .locals 4

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
    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-lez v0, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz p2, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {p2}, Landroidx/activity/ۨ۠۟ۧ;->۟ۧ۟ۡ۠(Ljava/lang/Object;)Z

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
    const v0, 0xbe7f

    :goto_3
    const v1, 0xbe90

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :goto_4
    :sswitch_9
    return-void

    :sswitch_a
    const v0, 0xbe9e

    goto :goto_3

    :sswitch_b
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۧۢۢ۠()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-static {p0, p1}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟۟۟ۦۤ(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v0, v1, p2}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۤۦۣۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lkevin/fun/hook/۟ۥ۠۠;->ۥ۠۠ۤ()I

    move-result v1

    const v0, 0xbefb

    :goto_5
    const v2, 0xbf0c

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_4

    goto :goto_5

    :cond_3
    :sswitch_c
    const v0, 0xbf39

    goto :goto_5

    :sswitch_d
    if-ltz v1, :cond_3

    const v0, 0xc1e3

    goto :goto_5

    :sswitch_e
    const-string v0, "dXH"

    invoke-static {v0}, Landroidx/activity/ۦۧۥۥ;->ۧۧ۠ۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    goto :goto_4

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
        0x1d7 -> :sswitch_9
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
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_c
        0x35 -> :sswitch_9
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch
.end method

.method private static sendSparkMessage(Lkevin/fun/hook/SparkRenewHelper$SparkInfo;)Z
    .locals 14

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۦ۠ۡۡ()Ljava/lang/ClassLoader;

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
    const/4 v0, 0x0

    :goto_1
    return v0

    :sswitch_3
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x831

    sget v2, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    xor-int/lit16 v2, v2, 0x2e6

    const/16 v3, 0x257

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۢۥ۠۟([SIII)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۦۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۦۡۨۨ()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟ۤۥۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const/16 v0, 0x6cc

    :goto_2
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_2

    :sswitch_4
    if-nez v1, :cond_1

    const/16 v0, 0x729

    goto :goto_2

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_2

    :sswitch_6
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x849

    sget v2, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    xor-int/lit8 v2, v2, 0x69

    const/16 v3, 0xb46

    invoke-static {v0, v1, v2, v3}, Landroidx/core/ۧ۟ۤۨ;->ۡۥ۟ۥ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۦۣ(Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۠ۧ۟ۢ()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۡۥۦ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۡۡۧۧ()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۥۥۤ۟(Ljava/lang/Object;Z)V

    const/4 v0, 0x0

    goto :goto_1

    :sswitch_7
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۥۣۨ()Ljava/lang/Object;

    move-result-object v5

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۦ۟ۡۤ()Ljava/lang/Object;

    move-result-object v6

    const/16 v0, 0x748

    :goto_3
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_3

    :sswitch_8
    if-eqz v5, :cond_2

    const v0, 0xbe60

    goto :goto_3

    :cond_2
    :sswitch_9
    const v0, 0xbe41

    goto :goto_3

    :sswitch_a
    const v0, 0xbe7f

    :goto_4
    const v1, 0xbe90

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_3

    goto :goto_4

    :cond_3
    :sswitch_b
    const v0, 0xbebd

    goto :goto_4

    :sswitch_c
    if-nez v6, :cond_3

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
    invoke-static {v5}, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۡۢ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v6}, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۡۢ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v3

    const/16 v4, 0x9ae

    sget v5, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/lit16 v5, v5, 0x302

    const/16 v6, 0xb6f

    invoke-static {v3, v4, v5, v6}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣۣ۟ۤۤ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v2

    const/16 v3, 0x9cb

    sget v4, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/lit16 v4, v4, 0x31a

    const/16 v5, 0x393

    invoke-static {v2, v3, v4, v5}, Landroidx/core/ۧ۟ۤۨ;->ۡۥ۟ۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۦۣ(Ljava/lang/Object;)V

    const/4 v0, 0x0

    goto/16 :goto_1

    :sswitch_f
    const v0, 0xbf1a

    goto :goto_5

    :sswitch_10
    :try_start_0
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۣۢۤ۠()Ljava/util/concurrent/atomic/AtomicLong;

    move-result-object v0

    invoke-static {v0}, Landroidx/appcompat/resources/ۦۨۦۢ;->ۦۧۧ۟(Ljava/lang/Object;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    move-result-wide v8

    const v0, 0xc202

    :goto_6
    const v1, 0xc213

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :sswitch_11
    const-wide/16 v0, 0x0

    cmp-long v0, v8, v0

    if-eqz v0, :cond_4

    const v0, 0xc25f

    goto :goto_6

    :cond_4
    :sswitch_12
    const v0, 0xc240

    goto :goto_6

    :sswitch_13
    :try_start_1
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x864

    sget v3, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۤۦۤۧ:I

    xor-int/lit16 v3, v3, 0x156

    const/16 v7, 0x641

    invoke-static {v0, v1, v3, v7}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۨۤ۠۠([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v9}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟۟۟ۦۤ(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    sget v7, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۡۨۨۧ:I

    xor-int/lit16 v7, v7, -0x1e8

    aput-object v1, v3, v7

    invoke-static {v6, v0, v3}, Lkevin/fun/hook/SparkRenewHelper;->۟ۢۥ۟۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    const v0, 0xc27e

    :goto_7
    const v1, 0xc28f

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_6

    goto :goto_7

    :goto_8
    :sswitch_14
    :try_start_2
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x86d

    sget v3, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    xor-int/lit16 v3, v3, 0xd2

    const/16 v7, 0x597

    invoke-static {v0, v1, v3, v7}, Landroidx/loader/ۣۦ۟ۡ;->ۣ۟ۤ۟ۦ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Landroidx/viewpager/ۣۢ۟ۤ;->۟۟ۨۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    sget v7, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    xor-int/lit8 v7, v7, 0x49

    aput-object v1, v3, v7

    invoke-static {v6, v0, v3}, Lkevin/fun/hook/SparkRenewHelper;->۟ۢۥ۟۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x87e

    sget v3, Landroidx/appcompat/ۣۧۤۢ;->۟۠ۡۤۤ:I

    xor-int/lit16 v3, v3, -0xfb

    const/16 v7, 0x6ab

    invoke-static {v0, v1, v3, v7}, Landroidx/activity/ۤۧۧۧ;->ۣ۟۟۠ۡ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۣۨۦۢ(Ljava/lang/Object;)J

    move-result-wide v8

    invoke-static {v8, v9}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟۟۟ۦۤ(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    sget v7, Landroidx/appcompat/ۣۧۤۢ;->۟۠ۡۤۤ:I

    xor-int/lit16 v7, v7, -0xed

    aput-object v1, v3, v7

    invoke-static {v6, v0, v3}, Lkevin/fun/hook/SparkRenewHelper;->۟ۢۥ۟۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x894

    sget v3, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۤۦۤۧ:I

    xor-int/lit16 v3, v3, 0x14c

    const/16 v7, 0x800

    invoke-static {v0, v1, v3, v7}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۧۨۦۦ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Landroidx/loader/ۥۧۨۤ;->۟۟۟ۧۦ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Landroidx/activity/ۤۧۧۧ;->ۣ۟ۦۣ۠(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    sget v7, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    xor-int/lit16 v7, v7, 0x166

    aput-object v1, v3, v7

    invoke-static {v6, v0, v3}, Lkevin/fun/hook/SparkRenewHelper;->۟ۢۥ۟۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x8a7

    sget v3, Lkevin/fun/hook/۟ۥ۠۠;->ۢۦۧۧ:I

    xor-int/lit16 v3, v3, -0x1cf

    const/16 v7, 0x1c2

    invoke-static {v0, v1, v3, v7}, Landroidx/loader/ۥۧۨۤ;->۟ۢۢ۠ۥ([SIII)Ljava/lang/String;

    move-result-object v0

    sget v1, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢ۟ۥ:I

    xor-int/lit16 v1, v1, 0x173

    invoke-static {v1}, Landroidx/activity/ۤۧۧۧ;->ۣ۟ۦۣ۠(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    sget v7, Landroidx/activity/ۤۧۧۧ;->۟۟ۢ۠ۡ:I

    xor-int/lit16 v7, v7, 0x1ea

    aput-object v1, v3, v7

    invoke-static {v6, v0, v3}, Lkevin/fun/hook/SparkRenewHelper;->۟ۢۥ۟۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x8b1

    sget v3, Landroidx/activity/ۨ۠۟ۧ;->۟ۦۥۢۢ:I

    xor-int/lit16 v3, v3, 0x332

    const/16 v7, 0x9d8

    invoke-static {v0, v1, v3, v7}, Landroidx/activity/ۤۧۧۧ;->ۣ۟۟۠ۡ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->۟ۡۡۥۡ()Ljava/util/UUID;

    move-result-object v1

    invoke-static {v1}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۤۦۧۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    sget v7, Landroidx/appcompat/ۣۧۤۢ;->۟۠ۡۤۤ:I

    xor-int/lit16 v7, v7, -0xed

    aput-object v1, v3, v7

    invoke-static {v6, v0, v3}, Lkevin/fun/hook/SparkRenewHelper;->۟ۢۥ۟۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x8b8

    sget v3, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۤۦۤۧ:I

    xor-int/lit16 v3, v3, 0x157

    const/16 v7, 0x56a

    invoke-static {v0, v1, v3, v7}, Landroidx/loader/ۢۥ۟;->۟ۧ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v0

    const-wide/16 v8, 0x0

    invoke-static {v8, v9}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟۟۟ۦۤ(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    sget v7, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۦۣۧ:I

    xor-int/lit8 v7, v7, -0x7b

    aput-object v1, v3, v7

    invoke-static {v6, v0, v3}, Lkevin/fun/hook/SparkRenewHelper;->۟ۢۥ۟۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x8c0

    sget v3, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    xor-int/lit16 v3, v3, 0x222

    const/16 v7, 0xae0

    invoke-static {v0, v1, v3, v7}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢ۟ۥۨ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->۟ۦۡ۠ۡ()J

    move-result-wide v8

    invoke-static {v8, v9}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟۟۟ۦۤ(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    sget v7, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    xor-int/lit8 v7, v7, 0x49

    aput-object v1, v3, v7

    invoke-static {v6, v0, v3}, Lkevin/fun/hook/SparkRenewHelper;->۟ۢۥ۟۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    const/4 v0, 0x0

    :try_start_3
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v1

    const/16 v3, 0x8cc

    sget v7, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۢ۟ۡ:I

    xor-int/lit16 v7, v7, -0x265

    const/16 v8, 0x815

    invoke-static {v1, v3, v7, v8}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۤ۟۠([SIII)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v6, v1, v3}, Lkevin/fun/hook/SparkRenewHelper;->۟ۢۥ۟۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result-object v0

    const v1, 0xc2fa

    :goto_9
    const v3, 0xc30b

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_7

    goto :goto_9

    :sswitch_15
    const v1, 0xc5a4

    goto :goto_9

    :sswitch_16
    const v0, 0xc29d

    goto/16 :goto_7

    :catchall_0
    move-exception v1

    :sswitch_17
    :try_start_4
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    instance-of v7, v0, Ljava/util/Map;

    const v1, 0xc601

    :goto_a
    const v8, 0xc612

    xor-int/2addr v1, v8

    sparse-switch v1, :sswitch_data_8

    goto :goto_a

    :sswitch_18
    if-eqz v7, :cond_5

    const v1, 0xc65e

    goto :goto_a

    :cond_5
    :sswitch_19
    const v1, 0xc63f

    goto :goto_a

    :sswitch_1a
    check-cast v0, Ljava/util/Map;

    invoke-static {v3, v0}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۨۡۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_1b
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x8d7

    sget v7, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۣۧۢ:I

    xor-int/lit16 v7, v7, -0x3ca

    const/16 v8, 0xc8a

    invoke-static {v0, v1, v7, v8}, Landroidx/loader/۟۠ۢۧۡ;->ۢ۟ۨۥ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨۤ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v2}, Landroidx/documentfile/ۡۢ۟ۥ;->ۢۥۦۣ(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    move-result v1

    const v0, 0xc67d

    :goto_b
    const v7, 0xc68e

    xor-int/2addr v0, v7

    sparse-switch v0, :sswitch_data_9

    goto :goto_b

    :cond_6
    :sswitch_1c
    const v0, 0xc6bb

    goto :goto_b

    :sswitch_1d
    if-nez v1, :cond_6

    const v0, 0xc965

    goto :goto_b

    :sswitch_1e
    const/4 v0, 0x1

    :try_start_5
    new-array v0, v0, [Ljava/lang/Object;

    sget v1, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    xor-int/lit16 v1, v1, 0xc3

    aput-object v3, v0, v1

    invoke-static {v6, v2, v0}, Lkevin/fun/hook/SparkRenewHelper;->۟ۢۥ۟۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    const v0, 0xc984

    :goto_c
    const v1, 0xc995

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_a

    goto :goto_c

    :sswitch_1f
    const v0, 0xc9a3

    goto :goto_c

    :catchall_1
    move-exception v0

    :sswitch_20
    :try_start_6
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x8e6

    sget v3, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۧۨۨ:I

    xor-int/lit8 v3, v3, -0x67

    const/16 v7, 0x38a

    invoke-static {v0, v1, v3, v7}, Landroidx/loader/ۥۧۨۤ;->۟ۢۢ۠ۥ([SIII)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v2, v0, v1}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۡ۟ۤۦ(Ljava/lang/Object;Ljava/lang/Object;I)Lorg/json/JSONObject;

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x8ea

    sget v3, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۤۥ:I

    xor-int/lit16 v3, v3, 0x3a9

    const/16 v7, 0x1e6

    invoke-static {v0, v1, v3, v7}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢۦۤ([SIII)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v2, v0, v1}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۡ۟ۤۦ(Ljava/lang/Object;Ljava/lang/Object;I)Lorg/json/JSONObject;

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x8fa

    sget v3, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۢۥۨۦ:I

    xor-int/lit16 v3, v3, 0x29c

    const/16 v7, 0x292

    invoke-static {v0, v1, v3, v7}, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۡۨۧ([SIII)Ljava/lang/String;

    move-result-object v0

    sget v1, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    xor-int/lit16 v1, v1, 0x3c3

    invoke-static {v2, v0, v1}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۡ۟ۤۦ(Ljava/lang/Object;Ljava/lang/Object;I)Lorg/json/JSONObject;

    invoke-static {p0}, Landroidx/viewpager/ۣۢ۟ۤ;->۟۟ۨۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/SparkRenewHelper;->ۤۤۢۡ(Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xca00

    :goto_d
    const v3, 0xca11

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_b

    goto :goto_d

    :cond_7
    :sswitch_21
    const v0, 0xca3e

    goto :goto_d

    :sswitch_22
    if-eqz v1, :cond_7

    const v0, 0xca5d

    goto :goto_d

    :sswitch_23
    invoke-static {p0}, Landroidx/viewpager/ۣۢ۟ۤ;->۟۟ۨۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/SparkRenewHelper;->۟ۥۧۡ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/documentfile/ۡۢ۟ۥ;->ۢۥۦۣ(Ljava/lang/Object;)Z

    move-result v3

    const v1, 0xca7c

    :goto_e
    const v7, 0xca8d

    xor-int/2addr v1, v7

    sparse-switch v1, :sswitch_data_c

    goto :goto_e

    :sswitch_24
    if-nez v3, :cond_8

    const v1, 0xcd64

    goto :goto_e

    :cond_8
    :sswitch_25
    const v1, 0xcd45

    goto :goto_e

    :sswitch_26
    const v1, 0xcd83

    :goto_f
    const v3, 0xcd94

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_d

    goto :goto_f

    :sswitch_27
    const v1, 0xcda2

    goto :goto_f

    :sswitch_28
    invoke-static {p0}, Landroidx/viewpager/ۣۢ۟ۤ;->۟۟ۨۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/SparkRenewHelper;->ۨ۠ۦۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const v1, 0xcdff

    :goto_10
    const v3, 0xce10

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_e

    goto :goto_10

    :goto_11
    :sswitch_29
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v1

    const/16 v3, 0x909

    sget v7, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣ۠ۢۢ:I

    xor-int/lit8 v7, v7, -0x6b

    const/16 v8, 0x1bc

    invoke-static {v1, v3, v7, v8}, Landroidx/loader/ۢۥ۟;->۟ۧ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1, v0}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x90d

    sget v3, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣ۠ۧ:I

    xor-int/lit16 v3, v3, -0x1e3

    const/16 v7, 0xa96

    invoke-static {v0, v1, v3, v7}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۦۣۣۦ([SIII)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v2, v0, v1}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۡ۟ۤۦ(Ljava/lang/Object;Ljava/lang/Object;I)Lorg/json/JSONObject;

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x916

    sget v3, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    xor-int/lit16 v3, v3, 0x30a

    const/16 v7, 0xc96

    invoke-static {v0, v1, v3, v7}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۢۦۣ۠([SIII)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v2, v0, v1}, Landroidx/activity/ۦۧۥۥ;->ۡۨ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;Z)Lorg/json/JSONObject;

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x91d

    sget v3, Landroidx/activity/ۦۧۥۥ;->۟ۦۢۧۤ:I

    xor-int/lit8 v3, v3, -0x34

    const/16 v7, 0x430

    invoke-static {v0, v1, v3, v7}, Landroidx/activity/ۦۧۥۥ;->۟ۤۡۦۦ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0, v4}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۦ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x924

    sget v3, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣۡۢ۟:I

    xor-int/lit16 v3, v3, 0x325

    const/16 v7, 0x399

    invoke-static {v0, v1, v3, v7}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۢۤۤ([SIII)Ljava/lang/String;

    move-result-object v0

    sget v1, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    xor-int/lit16 v1, v1, 0x3c5

    invoke-static {v2, v0, v1}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۡ۟ۤۦ(Ljava/lang/Object;Ljava/lang/Object;I)Lorg/json/JSONObject;

    invoke-static {v2}, Landroidx/viewpager/ۣۢ۟ۤ;->ۣۧۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v1

    const/16 v2, 0x92b

    sget v3, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۨ۠ۧ:I

    xor-int/lit16 v3, v3, -0x1b8

    const/16 v7, 0x14e

    invoke-static {v1, v2, v3, v7}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۡۤۥ([SIII)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    sget v3, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦۦۤ۟:I

    xor-int/lit16 v3, v3, 0x8c

    aput-object v0, v2, v3

    invoke-static {v6, v1, v2}, Lkevin/fun/hook/SparkRenewHelper;->۟ۢۥ۟۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-static {v5}, Landroidx/emoji2/ۢۧۡۧ;->۟ۤۤۨۢ(Ljava/lang/Object;)Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Landroidx/appcompat/ۣۧۤۢ;->۠ۡۢ(Ljava/lang/Object;)[Ljava/lang/reflect/Method;

    move-result-object v7

    array-length v8, v7

    const/4 v1, 0x0

    move v2, v1

    :goto_12
    const v1, 0xd106

    :goto_13
    const v3, 0xd117

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_f

    goto :goto_13

    :sswitch_2a
    if-lt v2, v8, :cond_9

    const v1, 0xd163

    goto :goto_13

    :sswitch_2b
    const v1, 0xce1e

    goto/16 :goto_10

    :sswitch_2c
    invoke-static {p0}, Landroidx/viewpager/ۣۢ۟ۤ;->۟۟ۨۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/SparkRenewHelper;->ۨ۠ۦۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_11

    :cond_9
    :sswitch_2d
    const v1, 0xd144

    goto :goto_13

    :sswitch_2e
    const v1, 0xd182

    :goto_14
    const v2, 0xd193

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_10

    goto :goto_14

    :sswitch_2f
    const v1, 0xd1a1

    goto :goto_14

    :sswitch_30
    aget-object v1, v7, v2

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v3

    const/16 v9, 0x935

    sget v10, Landroidx/activity/ۦۧۥۥ;->۟ۦۢۧۤ:I

    xor-int/lit8 v10, v10, -0x3b

    const/16 v11, 0x8fc

    invoke-static {v3, v9, v10, v11}, Lkevin/fun/hook/۟ۥ۠۠;->ۣۨۢ۟([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v4}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۦۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1}, Landroidx/interpolator/۟ۧۦ۟ۨ;->۟۟ۦ۠ۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v3, v9}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    const v3, 0xd1fe

    :goto_15
    const v10, 0xd20f

    xor-int/2addr v3, v10

    sparse-switch v3, :sswitch_data_11

    goto :goto_15

    :sswitch_31
    if-nez v9, :cond_a

    const v3, 0xd4e6

    goto :goto_15

    :cond_a
    :sswitch_32
    const v3, 0xd4c7

    goto :goto_15

    :sswitch_33
    const v1, 0xd505

    :goto_16
    const v3, 0xd516

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_12

    goto :goto_16

    :sswitch_34
    const v1, 0xd524

    goto :goto_16

    :sswitch_35
    invoke-static {v1}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۡۤ۠۟(Ljava/lang/Object;)[Ljava/lang/Class;

    move-result-object v9

    array-length v10, v9

    const v3, 0xd581

    :goto_17
    const v11, 0xd592

    xor-int/2addr v3, v11

    sparse-switch v3, :sswitch_data_13

    goto :goto_17

    :sswitch_36
    const/4 v3, 0x2

    if-lt v10, v3, :cond_b

    const v3, 0xd869

    goto :goto_17

    :cond_b
    :sswitch_37
    const v3, 0xd5bf

    goto :goto_17

    :sswitch_38
    array-length v10, v9

    const v3, 0xd888

    :goto_18
    const v11, 0xd899

    xor-int/2addr v3, v11

    sparse-switch v3, :sswitch_data_14

    goto :goto_18

    :sswitch_39
    const/4 v3, 0x3

    if-le v10, v3, :cond_c

    const v3, 0xd8e5

    goto :goto_18

    :cond_c
    :sswitch_3a
    const v3, 0xd8c6

    goto :goto_18

    :sswitch_3b
    const v1, 0xd904

    :goto_19
    const v3, 0xd915

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_15

    goto :goto_19

    :sswitch_3c
    const v1, 0xd923

    goto :goto_19

    :sswitch_3d
    const/4 v3, 0x0

    aget-object v3, v9, v3

    invoke-static {v3}, Landroidx/core/ۤۦ۟ۢ;->ۡۡۢۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v10

    const/16 v11, 0x943

    sget v12, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    xor-int/lit8 v12, v12, -0x15

    const/16 v13, 0xb00

    invoke-static {v10, v11, v12, v13}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦۣ۠ۤ([SIII)Ljava/lang/String;

    move-result-object v10

    invoke-static {v3, v10}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    const v3, 0xd980

    :goto_1a
    const v11, 0xd991

    xor-int/2addr v3, v11

    sparse-switch v3, :sswitch_data_16

    goto :goto_1a

    :sswitch_3e
    if-nez v10, :cond_d

    const v3, 0xdc68

    goto :goto_1a

    :cond_d
    :sswitch_3f
    const v3, 0xdc49

    goto :goto_1a

    :sswitch_40
    const v1, 0xdc87

    :goto_1b
    const v3, 0xdc98

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_17

    goto :goto_1b

    :sswitch_41
    const v1, 0xdca6

    goto :goto_1b

    :sswitch_42
    const/4 v3, 0x1

    aget-object v10, v9, v3

    const v3, 0xdd03

    :goto_1c
    const v11, 0xdd14

    xor-int/2addr v3, v11

    sparse-switch v3, :sswitch_data_18

    goto :goto_1c

    :sswitch_43
    const-class v3, Ljava/util/Map;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    if-eq v10, v3, :cond_e

    const v3, 0x170090

    goto :goto_1c

    :cond_e
    :sswitch_44
    const v3, 0xdd41

    goto :goto_1c

    :sswitch_45
    const v1, 0x1700af

    :goto_1d
    const v3, 0x1700c0

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_19

    goto :goto_1d

    :sswitch_46
    sget v1, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    xor-int/lit16 v1, v1, 0x167

    add-int/2addr v1, v2

    const v2, 0x170c30

    :goto_1e
    const v3, 0x170c41

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_1a

    goto :goto_1e

    :sswitch_47
    move v2, v1

    goto/16 :goto_12

    :sswitch_48
    const v1, 0x1700ce

    goto :goto_1d

    :sswitch_49
    :try_start_7
    array-length v10, v9

    const v3, 0x17012b

    :goto_1f
    const v11, 0x17013c

    xor-int/2addr v3, v11

    sparse-switch v3, :sswitch_data_1b

    goto :goto_1f

    :sswitch_4a
    const/4 v3, 0x3

    if-ne v10, v3, :cond_f

    const v3, 0x170188

    goto :goto_1f

    :cond_f
    :sswitch_4b
    const v3, 0x170169

    goto :goto_1f

    :sswitch_4c
    const/4 v3, 0x2

    aget-object v3, v9, v3

    invoke-static {v3}, Landroidx/core/ۤۦ۟ۢ;->ۡۡۢۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v9

    const/16 v10, 0x94a

    sget v11, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v11, v11, 0x21e

    const/16 v12, 0x7b7

    invoke-static {v9, v10, v11, v12}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟۟۟ۦۢ([SIII)Ljava/lang/String;

    move-result-object v9

    invoke-static {v3, v9}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    const v3, 0x1701a7

    :goto_20
    const v10, 0x1701b8

    xor-int/2addr v3, v10

    sparse-switch v3, :sswitch_data_1c

    goto :goto_20

    :sswitch_4d
    if-nez v9, :cond_10

    const v3, 0x17048f

    goto :goto_20

    :cond_10
    :sswitch_4e
    const v3, 0x170470

    goto :goto_20

    :sswitch_4f
    const v1, 0x1704ae

    :goto_21
    const v3, 0x1704bf

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_1d

    goto :goto_21

    :sswitch_50
    const v1, 0x1704cd

    goto :goto_21

    :sswitch_51
    move-object v0, v1

    :sswitch_52
    const v1, 0x17052a

    :goto_22
    const v2, 0x17053b

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_1e

    goto :goto_22

    :sswitch_53
    if-nez v0, :cond_11

    const v1, 0x170812

    goto :goto_22

    :cond_11
    :sswitch_54
    const v1, 0x170568

    goto :goto_22

    :sswitch_55
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0x95a

    sget v2, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦۦۤ۟:I

    xor-int/lit16 v2, v2, 0x94

    const/16 v3, 0x275

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۦۣۣۦ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۦۣ(Ljava/lang/Object;)V

    const/4 v0, 0x0

    goto/16 :goto_1

    :sswitch_56
    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۣۨۧ(Ljava/lang/Object;Z)V

    invoke-static {v0}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۡۤ۠۟(Ljava/lang/Object;)[Ljava/lang/Class;

    move-result-object v1

    array-length v2, v1

    const v1, 0x170831

    :goto_23
    const v3, 0x170842

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_1f

    goto :goto_23

    :cond_12
    :sswitch_57
    const v1, 0x17086f

    goto :goto_23

    :sswitch_58
    const/4 v1, 0x2

    if-ne v2, v1, :cond_12

    const v1, 0x17088e

    goto :goto_23

    :sswitch_59
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    sget v3, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    xor-int/lit16 v3, v3, -0x16b

    aput-object v6, v2, v3

    sget v3, Landroidx/startup/۟ۦۤۨۧ;->ۧۡۡۦ:I

    xor-int/lit16 v3, v3, -0x115

    aput-object v1, v2, v3

    invoke-static {v0, v5, v2}, Landroidx/loader/ۢۥ۟;->۟ۤ۟ۥ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x1708ad

    :goto_24
    const v1, 0x1708be

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_20

    goto :goto_24

    :sswitch_5a
    const v0, 0x1708cc

    goto :goto_24

    :sswitch_5b
    const v1, 0x170929

    :goto_25
    const v3, 0x17093a

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_21

    goto :goto_25

    :sswitch_5c
    const/4 v1, 0x3

    if-ne v2, v1, :cond_13

    const v1, 0x170c11

    goto :goto_25

    :cond_13
    :sswitch_5d
    const v1, 0x170bf2

    goto :goto_25

    :sswitch_5e
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    sget v3, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۡۦۥۨ:I

    xor-int/lit16 v3, v3, 0x11e

    aput-object v6, v2, v3

    sget v3, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    xor-int/lit8 v3, v3, 0x73

    aput-object v1, v2, v3

    sget v1, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v1, v1, 0x20c

    const/4 v3, 0x0

    aput-object v3, v2, v1

    invoke-static {v0, v5, v2}, Landroidx/loader/ۢۥ۟;->۟ۤ۟ۥ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :sswitch_5f
    const/4 v0, 0x1

    goto/16 :goto_1

    :sswitch_60
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v1

    const/16 v3, 0x972

    sget v4, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    xor-int/lit16 v4, v4, 0x247

    const/16 v5, 0x469

    invoke-static {v1, v3, v4, v5}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۦ۠ۧۨ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0, v2}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۦۣ(Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    const/4 v0, 0x0

    goto/16 :goto_1

    :sswitch_61
    const v2, 0x170c4f

    goto/16 :goto_1e

    :catchall_2
    move-exception v0

    invoke-static {v0}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣۡۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v3

    const/16 v4, 0x986

    sget v5, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۢۥۨۦ:I

    xor-int/lit16 v5, v5, 0x281

    const/16 v6, 0x74f

    invoke-static {v3, v4, v5, v6}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۢ۠ۤۥ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۦۣ(Ljava/lang/Object;)V

    instance-of v2, v0, Ljava/lang/reflect/InvocationTargetException;

    const v1, 0x170cac

    :goto_26
    const v3, 0x170cbd

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_22

    goto :goto_26

    :sswitch_62
    if-eqz v2, :cond_14

    const v1, 0x170f94

    goto :goto_26

    :cond_14
    :sswitch_63
    const v1, 0x170cea

    goto :goto_26

    :sswitch_64
    check-cast v0, Ljava/lang/reflect/InvocationTargetException;

    invoke-static {v0}, Landroidx/loader/ۡۢۢ;->ۨۦۧۢ(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-static {v0}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣۡۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v2

    const/16 v3, 0x998

    sget v4, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣ۠ۧ:I

    xor-int/lit16 v4, v4, -0x1fe

    const/16 v5, 0xa16

    invoke-static {v2, v3, v4, v5}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۤ۟۠([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۦۣ(Ljava/lang/Object;)V

    :sswitch_65
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۡۡۧۧ()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۥۥۤ۟(Ljava/lang/Object;Z)V

    const/4 v0, 0x0

    goto/16 :goto_1

    :catchall_3
    move-exception v0

    goto/16 :goto_8

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
        0x11 -> :sswitch_11
        0x32 -> :sswitch_12
        0x4c -> :sswitch_13
        0x53 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_14
        0xf1 -> :sswitch_16
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_15
        0x6af -> :sswitch_17
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_18
        0x2d -> :sswitch_1b
        0x32 -> :sswitch_19
        0x4c -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1c
        0x35 -> :sswitch_20
        0xf3 -> :sswitch_1d
        0xfeb -> :sswitch_1e
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1f
        0x36 -> :sswitch_20
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_21
        0x11 -> :sswitch_22
        0x2f -> :sswitch_2c
        0x4c -> :sswitch_23
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_24
        0x7ab -> :sswitch_25
        0x7c8 -> :sswitch_28
        0x7e9 -> :sswitch_26
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_27
        0x36 -> :sswitch_29
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_29
        0x3ef -> :sswitch_2b
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_2a
        0x32 -> :sswitch_2d
        0x53 -> :sswitch_30
        0x74 -> :sswitch_2e
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x11 -> :sswitch_2f
        0x32 -> :sswitch_52
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x3f1 -> :sswitch_31
        0x6a7 -> :sswitch_32
        0x6c8 -> :sswitch_35
        0x6e9 -> :sswitch_33
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x13 -> :sswitch_34
        0x32 -> :sswitch_46
    .end sparse-switch

    :sswitch_data_13
    .sparse-switch
        0x13 -> :sswitch_36
        0x2d -> :sswitch_46
        0x32 -> :sswitch_37
        0xdfb -> :sswitch_38
    .end sparse-switch

    :sswitch_data_14
    .sparse-switch
        0x11 -> :sswitch_39
        0x3e -> :sswitch_3a
        0x5f -> :sswitch_3d
        0x7c -> :sswitch_3b
    .end sparse-switch

    :sswitch_data_15
    .sparse-switch
        0x11 -> :sswitch_3c
        0x36 -> :sswitch_46
    .end sparse-switch

    :sswitch_data_16
    .sparse-switch
        0x11 -> :sswitch_3e
        0x5bb -> :sswitch_3f
        0x5d8 -> :sswitch_42
        0x5f9 -> :sswitch_40
    .end sparse-switch

    :sswitch_data_17
    .sparse-switch
        0x1f -> :sswitch_41
        0x3e -> :sswitch_46
    .end sparse-switch

    :sswitch_data_18
    .sparse-switch
        0x17 -> :sswitch_43
        0x36 -> :sswitch_44
        0x55 -> :sswitch_49
        0x17dd84 -> :sswitch_45
    .end sparse-switch

    :sswitch_data_19
    .sparse-switch
        0xe -> :sswitch_46
        0x6f -> :sswitch_48
    .end sparse-switch

    :sswitch_data_1a
    .sparse-switch
        0xe -> :sswitch_47
        0x71 -> :sswitch_61
    .end sparse-switch

    :sswitch_data_1b
    .sparse-switch
        0x17 -> :sswitch_4a
        0x55 -> :sswitch_51
        0x76 -> :sswitch_4b
        0xb4 -> :sswitch_4c
    .end sparse-switch

    :sswitch_data_1c
    .sparse-switch
        0x1f -> :sswitch_4d
        0x537 -> :sswitch_4f
        0x5c8 -> :sswitch_51
        0x5e9 -> :sswitch_4e
    .end sparse-switch

    :sswitch_data_1d
    .sparse-switch
        0x11 -> :sswitch_50
        0x72 -> :sswitch_46
    .end sparse-switch

    :sswitch_data_1e
    .sparse-switch
        0x11 -> :sswitch_53
        0x53 -> :sswitch_56
        0x72 -> :sswitch_54
        0xd29 -> :sswitch_55
    .end sparse-switch

    :sswitch_data_1f
    .sparse-switch
        0x12 -> :sswitch_57
        0x2d -> :sswitch_5b
        0x73 -> :sswitch_58
        0xcc -> :sswitch_59
    .end sparse-switch

    :sswitch_data_20
    .sparse-switch
        0x13 -> :sswitch_5a
        0x72 -> :sswitch_5f
    .end sparse-switch

    :sswitch_data_21
    .sparse-switch
        0x13 -> :sswitch_5c
        0x2c8 -> :sswitch_60
        0x2e9 -> :sswitch_5d
        0x52b -> :sswitch_5e
    .end sparse-switch

    :sswitch_data_22
    .sparse-switch
        0x11 -> :sswitch_62
        0x57 -> :sswitch_65
        0x76 -> :sswitch_63
        0x329 -> :sswitch_64
    .end sparse-switch
.end method

.method private static setConversationCustomMessage(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v1

    const/16 v2, 0x9d0

    sget v3, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v3, v3, 0x218

    const/16 v4, 0x98b

    invoke-static {v1, v2, v3, v4}, Landroidx/loader/ۢۥ۟;->۟ۧ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0, p0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Landroidx/core/ۧ۟ۤۨ;->ۨۢۢۧ(Ljava/lang/Object;Ljava/lang/Object;)V

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "YaIUcxQ21vJhaRK7Z5Mw1oAbCkSqK"

    invoke-static {v0}, Landroidx/loader/ۥۧۨۤ;->ۣۣ۟۟ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

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

.method private static setConversationEnabled(Ljava/lang/String;Z)V
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v1

    const/16 v2, 0x9e6

    sget v3, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    xor-int/lit16 v3, v3, -0x24c

    const/16 v4, 0x5b4

    invoke-static {v1, v2, v3, v4}, Landroidx/activity/ۦۧۥۥ;->۟ۤۡۦۦ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0, p0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Landroidx/interpolator/ۣ۟ۤۢۧ;->۟ۥۥۥۤ(Ljava/lang/Object;Z)V

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "eTbsbSqwY4ZlijXFI7WBB"

    invoke-static {v0}, Landroidx/core/ktx/۟۟ۡۢ۠;->۟ۥ۟ۨ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

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

.method private static setConversationRandomApiType(Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    const/4 v7, 0x0

    const/4 v1, 0x0

    const-string v5, "\u06e6\u06e5\u06e1"

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

    invoke-static {v3, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\u06e8\u06df\u06e6"

    move-object v5, v1

    goto :goto_0

    :sswitch_0
    invoke-static {v0, p0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v5, "\u06e0\u06e0\u06e4"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v1

    const-string v5, "\u06e6\u06e8\u06e8"

    move-object v2, v1

    goto :goto_0

    :sswitch_2
    invoke-static {v4, p1}, Landroidx/core/ۧ۟ۤۨ;->ۨۢۢۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e7\u06e5\u06e5"

    move-object v5, v1

    goto :goto_0

    :sswitch_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\u06e4\u06e7\u06df"

    move-object v3, v1

    goto :goto_0

    :sswitch_4
    xor-int/lit16 v7, v6, 0x1fc

    const-string v1, "\u06df\u06e0\u06e1"

    move-object v5, v1

    move v8, v7

    goto :goto_0

    :sswitch_5
    const/16 v1, 0x9f8

    const/16 v4, 0x529

    invoke-static {v2, v1, v8, v4}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢ۟ۥۨ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v5, "\u06e8\u06e1\u06e1"

    move-object v4, v1

    goto :goto_0

    :sswitch_6
    sget v6, Landroidx/activity/ۤۧۧۧ;->۟۟ۢ۠ۡ:I

    const-string v1, "\u06e2\u06e4\u06e5"

    move-object v5, v1

    goto :goto_0

    :sswitch_7
    invoke-static {v3}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v5, "\u06e2\u06e0"

    move-object v4, v1

    goto :goto_0

    :sswitch_8
    const-string v1, "\u06e0\u06e8\u06e4"

    move-object v5, v1

    goto :goto_0

    :sswitch_9
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc3e -> :sswitch_8
        0x1aa720 -> :sswitch_5
        0x1aaae4 -> :sswitch_7
        0x1aabdc -> :sswitch_2
        0x1ab2e3 -> :sswitch_4
        0x1ababc -> :sswitch_1
        0x1ac202 -> :sswitch_3
        0x1ac266 -> :sswitch_6
        0x1ac5c7 -> :sswitch_9
        0x1ac8cf -> :sswitch_0
    .end sparse-switch
.end method

.method private static setOnlySparkFilter(Z)V
    .locals 4

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0xa0e

    sget v2, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v2, v2, 0x21f

    const/16 v3, 0xb7c

    invoke-static {v0, v1, v2, v3}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۢ۠ۤۥ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Landroidx/interpolator/ۣ۟ۤۢۧ;->۟ۥۥۥۤ(Ljava/lang/Object;Z)V

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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "RDcF"

    invoke-static {v0}, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۧۧۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

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

.method private static setUseCustomMessage(Ljava/lang/String;Z)V
    .locals 9

    const/4 v7, 0x0

    const/4 v1, 0x0

    const-string v5, "\u06e2\u06e3\u06df"

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

    invoke-static {v3, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\u06e4\u06e2\u06e4"

    move-object v5, v1

    goto :goto_0

    :sswitch_0
    const/16 v1, 0xa1f

    const/16 v4, 0xadb

    invoke-static {v2, v1, v6, v4}, Landroidx/activity/ۣۦۡۥ;->۟ۡۨ۟۟([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v5, "\u06e5\u06e3\u06e6"

    move-object v4, v1

    goto :goto_0

    :sswitch_1
    invoke-static {v3}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v5, "\u06e6\u06e1\u06e1"

    move-object v4, v1

    goto :goto_0

    :sswitch_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\u06e3\u06e7\u06e5"

    move-object v3, v1

    goto :goto_0

    :sswitch_3
    sget v7, Landroidx/activity/ۤۧۧۧ;->۟۟ۢ۠ۡ:I

    const-string v1, "\u06e2\u06e6\u06e8"

    move-object v5, v1

    move v8, v7

    goto :goto_0

    :sswitch_4
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v1

    const-string v5, "\u06e7\u06e2\u06e7"

    move-object v2, v1

    goto :goto_0

    :sswitch_5
    invoke-static {v0, p0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v5, "\u06e2\u06e5"

    move-object v3, v1

    goto :goto_0

    :sswitch_6
    const-string v1, "\u06e3\u06e5\u06e7"

    move-object v5, v1

    goto :goto_0

    :sswitch_7
    xor-int/lit16 v6, v8, 0x1fc

    const-string v1, "\u06e4\u06df\u06e4"

    move-object v5, v1

    goto :goto_0

    :sswitch_8
    invoke-static {v4, p1}, Landroidx/interpolator/ۣ۟ۤۢۧ;->۟ۥۥۥۤ(Ljava/lang/Object;Z)V

    const-string v1, "\u06e7\u06e5\u06e6"

    move-object v5, v1

    goto :goto_0

    :sswitch_9
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc43 -> :sswitch_1
        0x1ab2be -> :sswitch_2
        0x1ab324 -> :sswitch_7
        0x1ab6c5 -> :sswitch_8
        0x1ab701 -> :sswitch_4
        0x1ab9c9 -> :sswitch_0
        0x1aba26 -> :sswitch_5
        0x1ac186 -> :sswitch_6
        0x1ac56c -> :sswitch_3
        0x1ac5c8 -> :sswitch_9
    .end sparse-switch
.end method

.method private static showBackgroundResultToast(Landroid/app/Activity;III)V
    .locals 4

    const/4 v1, 0x0

    const-string v3, "\u06e0\u06e5\u06e8"

    move-object v0, v1

    move-object v2, v1

    :goto_0
    invoke-static {v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    new-instance v0, Lkevin/fun/hook/SparkRenewHelper$4;

    invoke-direct {v0, p2, p3, p0}, Lkevin/fun/hook/SparkRenewHelper$4;-><init>(IILandroid/app/Activity;)V

    const-string v1, "\u06e0\u06e3\u06e6"

    move-object v3, v1

    goto :goto_0

    :sswitch_0
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۥۢۤ۠()Landroid/os/Handler;

    move-result-object v1

    const-string v3, "\u06e7\u06e4\u06e7"

    move-object v2, v1

    goto :goto_0

    :sswitch_1
    invoke-static {v2, v0}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    const-string v1, "\u06e0\u06e3\u06df"

    move-object v3, v1

    goto :goto_0

    :sswitch_2
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aab3c -> :sswitch_2
        0x1aab43 -> :sswitch_1
        0x1aab83 -> :sswitch_0
    .end sparse-switch
.end method

.method private static showConversationCustomMsgDialog(Landroid/content/Context;Lkevin/fun/hook/SparkRenewHelper$SparkInfo;Ljava/lang/Runnable;)V
    .locals 7

    :try_start_0
    new-instance v0, Landroid/widget/EditText;

    invoke-direct {v0, p0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    invoke-static {p1}, Landroidx/viewpager/ۣۢ۟ۤ;->۟۟ۨۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/SparkRenewHelper;->۟ۥۧۡ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۡۡۦ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v1

    const/16 v2, 0xa35

    sget v3, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۢۥۨۦ:I

    xor-int/lit16 v3, v3, 0x294

    const/16 v4, 0x158

    invoke-static {v1, v2, v3, v4}, Landroidx/activity/ۨ۠۟ۧ;->۟ۡۨۨۧ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۥۣۢ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v1, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    xor-int/lit8 v1, v1, -0x11

    invoke-static {v0, v1}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۟ۤ۠ۥۥ(Ljava/lang/Object;I)V

    const v1, -0xfffcf3

    sget v2, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    xor-int/2addr v1, v2

    invoke-static {v0, v1}, Landroidx/vectordrawable/۟ۧۢۧۨ;->۟ۡۦۦۨ(Ljava/lang/Object;I)V

    const v1, -0x66657a

    sget v2, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/2addr v1, v2

    invoke-static {v0, v1}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۧۧۨ(Ljava/lang/Object;I)V

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۠۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v1, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    xor-int/lit16 v1, v1, -0x32f

    invoke-static {p0, v1}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v2

    invoke-static {p0, v1}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v3

    invoke-static {p0, v1}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v4

    invoke-static {p0, v1}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v5

    invoke-static {v0, v2, v3, v4, v5}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۥۣۨۦ(Ljava/lang/Object;IIII)V

    new-instance v2, Landroid/widget/FrameLayout;

    invoke-direct {v2, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    sget v3, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    xor-int/lit16 v3, v3, 0x319

    invoke-static {p0, v3}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v4

    sget v5, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣ۠ۢۢ:I

    xor-int/lit8 v5, v5, -0x65

    invoke-static {p0, v5}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v5

    invoke-static {p0, v3}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v3

    const/4 v6, 0x0

    invoke-static {v2, v4, v5, v3, v6}, Landroidx/documentfile/ۡۢ۟ۥ;->ۣ۟۠ۧ(Ljava/lang/Object;IIII)V

    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const v4, 0xa0bed

    sget v5, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۡۨۨۧ:I

    xor-int/2addr v4, v5

    invoke-static {v3, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    invoke-static {p0, v1}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v1

    int-to-float v1, v1

    invoke-static {v3, v1}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۥ۟ۢۧ(Ljava/lang/Object;F)V

    invoke-static {v0, v3}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۠۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v0}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۡۢ۟۟(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Landroid/app/AlertDialog$Builder;

    sget v3, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    xor-int/lit16 v3, v3, 0x163

    invoke-direct {v1, p0, v3}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v3

    const/16 v4, 0xa3c

    sget v5, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/lit16 v5, v5, 0x318

    const/16 v6, 0x3b8

    invoke-static {v3, v4, v5, v6}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۢ۠ۤۥ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۣ۟ۦۤۡ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    invoke-static {v1, v2}, Landroidx/activity/ۦۧۥۥ;->ۣۢ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v2

    const/16 v3, 0xa43

    sget v4, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v4, v4, 0x124

    const/16 v5, 0x7a1

    invoke-static {v2, v3, v4, v5}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۢۥ۠۟([SIII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۡ۠۠ۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v2

    const/16 v3, 0xa45

    sget v4, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    xor-int/lit16 v4, v4, 0x164

    const/16 v5, 0x49b

    invoke-static {v2, v3, v4, v5}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۦۤۢۦ([SIII)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda0;

    invoke-direct {v3, v0, p0, p1, p2}, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda0;-><init>(Landroid/widget/EditText;Landroid/content/Context;Lkevin/fun/hook/SparkRenewHelper$SparkInfo;Ljava/lang/Runnable;)V

    invoke-static {v1, v2, v3}, Landroidx/customview/ۤۡۥ;->۟۠۟ۦ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۤۧ۟(Ljava/lang/Object;)Landroid/app/AlertDialog;
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

    invoke-static {v0}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣۡۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v2

    const/16 v3, 0xa47

    sget v4, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۧۨۨ:I

    xor-int/lit8 v4, v4, -0x4a

    const/16 v5, 0x238

    invoke-static {v2, v3, v4, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟ۡۧۨ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۦۣ(Ljava/lang/Object;)V

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
    .end sparse-switch
.end method

.method private static showProgressDialogWithBackgroundButton(Landroid/app/Activity;I[Z)V
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
    invoke-static {}, Lkevin/fun/hook/۟ۥ۠۠;->ۥ۠۠ۤ()I

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
    const-string v0, "QukcomvwwhppEM58M"

    invoke-static {v0}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۥۧۨ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

    :goto_2
    :sswitch_6
    return-void

    :sswitch_7
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۥۢۤ۠()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lkevin/fun/hook/SparkRenewHelper$3;

    invoke-direct {v1, p0, p1, p2}, Lkevin/fun/hook/SparkRenewHelper$3;-><init>(Landroid/app/Activity;I[Z)V

    invoke-static {v0, v1}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_2

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
.end method

.method private static showRandomApiSelectDialog(Landroid/content/Context;Lkevin/fun/hook/SparkRenewHelper$SparkInfo;Ljava/lang/Runnable;)V
    .locals 14

    :try_start_0
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0xa72

    sget v2, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۢ۟ۡ:I

    xor-int/lit16 v2, v2, -0x26e

    const/16 v3, 0x9bc

    invoke-static {v0, v1, v2, v3}, Landroidx/startup/ۤۧۥۣ;->۟ۧۦ۠ۦ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v1

    const/16 v2, 0xa74

    sget v3, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    xor-int/lit8 v3, v3, -0x38

    const/16 v4, 0x3cc

    invoke-static {v1, v2, v3, v4}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۦۤۢۦ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v2

    const/16 v3, 0xa76

    sget v4, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۣۧۢ:I

    xor-int/lit16 v4, v4, -0x3c5

    const/16 v5, 0xb05

    invoke-static {v2, v3, v4, v5}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۧۢۨۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v3

    const/16 v4, 0xa78

    sget v5, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۧۨۨ:I

    xor-int/lit8 v5, v5, -0x61

    const/16 v6, 0x18e

    invoke-static {v3, v4, v5, v6}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۤ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v4

    const/16 v5, 0xa7a

    sget v6, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    xor-int/lit16 v6, v6, -0x10b

    const/16 v7, 0xbe6

    invoke-static {v4, v5, v6, v7}, Landroidx/drawerlayout/ۤۨۡۤ;->ۤ۠ۤ۠([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v5

    const/16 v6, 0xa7c

    sget v7, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۨۥۦ۟:I

    xor-int/lit16 v7, v7, 0x28f

    const/16 v8, 0x580

    invoke-static {v5, v6, v7, v8}, Landroidx/appcompat/ۣۧۤۢ;->ۢۥۢ۟([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v6

    const/16 v7, 0xa7e

    sget v8, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    xor-int/lit16 v8, v8, 0x2fd

    const/16 v9, 0xca2

    invoke-static {v6, v7, v8, v9}, Lorg/luckypray/dexkit/۠۠ۥ;->۟ۥۧۦ۠([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v7

    const/16 v8, 0xa81

    sget v9, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    xor-int/lit16 v9, v9, -0x16d

    const/16 v10, 0x8e4

    invoke-static {v7, v8, v9, v10}, Landroidx/customview/ۤۡۥ;->۟ۢۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v7

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v8

    const/16 v9, 0xa87

    sget v10, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    xor-int/lit8 v10, v10, 0x56

    const/16 v11, 0x948

    invoke-static {v8, v9, v10, v11}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢ۟ۥۨ([SIII)Ljava/lang/String;

    move-result-object v8

    const/16 v9, 0x9

    new-array v9, v9, [Ljava/lang/String;

    sget v10, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    xor-int/lit16 v10, v10, 0x166

    aput-object v0, v9, v10

    sget v0, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢ۟ۥ:I

    xor-int/lit16 v0, v0, 0x175

    aput-object v1, v9, v0

    sget v0, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    xor-int/lit16 v0, v0, 0x164

    aput-object v2, v9, v0

    sget v0, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣ۠ۢۢ:I

    xor-int/lit8 v0, v0, -0x6e

    aput-object v3, v9, v0

    sget v0, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    xor-int/lit8 v0, v0, 0x4d

    aput-object v4, v9, v0

    sget v0, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۢ۠۠ۨ:I

    xor-int/lit8 v0, v0, -0x50

    aput-object v5, v9, v0

    sget v0, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    xor-int/lit8 v0, v0, 0x74

    aput-object v6, v9, v0

    sget v0, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    xor-int/lit16 v0, v0, 0x254

    aput-object v7, v9, v0

    sget v0, Landroidx/loader/ۡۢۢ;->ۣۡۦ۟:I

    xor-int/lit16 v0, v0, -0x3b7

    aput-object v8, v9, v0

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0xa8b

    sget v2, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢ۟ۥ:I

    xor-int/lit16 v2, v2, 0x170

    const/16 v3, 0x80c

    invoke-static {v0, v1, v2, v3}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۤ۟۠([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v1

    const/16 v2, 0xa8f

    sget v3, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    xor-int/lit8 v3, v3, -0x18

    const/16 v4, 0xab8

    invoke-static {v1, v2, v3, v4}, Landroidx/core/ۧ۟ۤۨ;->ۡۥ۟ۥ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v2

    const/16 v3, 0xa93

    sget v4, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    xor-int/lit16 v4, v4, 0x30e

    const/16 v5, 0x7ae

    invoke-static {v2, v3, v4, v5}, Landroidx/loader/ۥۧۨۤ;->۟ۢۢ۠ۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v3

    const/16 v4, 0xa96

    sget v5, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    xor-int/lit16 v5, v5, -0x21b

    const/16 v6, 0x763

    invoke-static {v3, v4, v5, v6}, Landroidx/loader/ۣۦ۟ۡ;->ۣ۟ۤ۟ۦ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v3

    const/16 v5, 0xa9b

    sget v6, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    xor-int/lit16 v6, v6, 0x308

    const/16 v7, 0x497

    invoke-static {v3, v5, v6, v7}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧ۠ۥ۟([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v3

    const/16 v6, 0xaa0

    sget v7, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۧۨۨ:I

    xor-int/lit8 v7, v7, -0x67

    const/16 v8, 0x922

    invoke-static {v3, v6, v7, v8}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠۠ۧۥ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v3

    const/16 v7, 0xaa4

    sget v8, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۤ۟ۧۤ:I

    xor-int/lit16 v8, v8, -0x1e4

    const/16 v10, 0x6e5

    invoke-static {v3, v7, v8, v10}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۧ۟ۧۢ([SIII)Ljava/lang/String;

    move-result-object v7

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v3

    const/16 v8, 0xaa8

    sget v10, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    xor-int/lit16 v10, v10, -0x25e

    const/16 v11, 0x6ad

    invoke-static {v3, v8, v10, v11}, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۡۨۧ([SIII)Ljava/lang/String;

    move-result-object v8

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v3

    const/16 v10, 0xaac

    sget v11, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    xor-int/lit16 v11, v11, -0x328

    const/16 v12, 0x346

    invoke-static {v3, v10, v11, v12}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣۣ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v10

    const/16 v3, 0x9

    new-array v3, v3, [Ljava/lang/String;

    sget v11, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۢ۟ۡ:I

    xor-int/lit16 v11, v11, -0x270

    aput-object v0, v3, v11

    sget v0, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۤۦۤۧ:I

    xor-int/lit16 v0, v0, 0x15e

    aput-object v1, v3, v0

    sget v0, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۡۨۨۧ:I

    xor-int/lit16 v0, v0, -0x1e6

    aput-object v2, v3, v0

    sget v0, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    xor-int/lit16 v0, v0, -0x21d

    aput-object v4, v3, v0

    sget v0, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v0, v0, 0x20a

    aput-object v5, v3, v0

    sget v0, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    xor-int/lit16 v0, v0, -0x21b

    aput-object v6, v3, v0

    sget v0, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦۦۤ۟:I

    xor-int/lit16 v0, v0, 0x8a

    aput-object v7, v3, v0

    sget v0, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    xor-int/lit16 v0, v0, 0x385

    aput-object v8, v3, v0

    sget v0, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۤ۟ۨ:I

    xor-int/lit16 v0, v0, -0x1a8

    aput-object v10, v3, v0

    invoke-static {p1}, Landroidx/viewpager/ۣۢ۟ۤ;->۟۟ۨۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/SparkRenewHelper;->۟ۦ۟ۢ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v0, 0x0

    :goto_0
    array-length v4, v3

    const/16 v1, 0x650

    :goto_1
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_1

    :cond_0
    :sswitch_0
    const/16 v1, 0x68e

    goto :goto_1

    :sswitch_1
    if-lt v0, v4, :cond_0

    const/16 v1, 0x6ad

    goto :goto_1

    :sswitch_2
    const/4 v0, 0x2

    const/16 v1, 0x6cc

    :goto_2
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_2

    :sswitch_3
    const/16 v1, 0x6eb

    goto :goto_2

    :sswitch_4
    move v6, v0

    :goto_3
    new-instance v5, Landroid/app/Dialog;

    const v0, 0x10300e3

    sget v1, Landroidx/customview/ۡۤۡۤ;->۟ۦ۟ۨۨ:I

    xor-int/2addr v0, v1

    invoke-direct {v5, p0, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    const/4 v0, 0x1

    invoke-static {v5, v0}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۡۡ۠(Ljava/lang/Object;Z)V

    const/4 v0, 0x1

    invoke-static {v5, v0}, Landroidx/emoji2/ۢۧۡۧ;->ۦ۠ۥۤ(Ljava/lang/Object;Z)V

    new-instance v7, Landroid/widget/FrameLayout;

    invoke-direct {v7, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    sget v1, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    xor-int/lit16 v1, v1, -0x383

    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-static {v7, v0}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۣۡ۠۟(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, -0x7ffffe16

    sget v2, Landroidx/activity/ۤۧۧۧ;->۟۟ۢ۠ۡ:I

    xor-int/2addr v0, v2

    invoke-static {v7, v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۣۢۧ(Ljava/lang/Object;I)V

    new-instance v8, Landroid/widget/LinearLayout;

    invoke-direct {v8, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x1

    invoke-static {v8, v0}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    invoke-static {v8, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۡ۠ۨ۟(Ljava/lang/Object;I)V

    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    sget v2, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/lit16 v2, v2, -0x31f

    invoke-direct {v0, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v2, 0x50

    iput v2, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    invoke-static {v8, v0}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣۡۥۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-static {v0, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    sget v1, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۥۧ۟:I

    xor-int/lit8 v1, v1, 0x7

    const/16 v2, 0x8

    new-array v2, v2, [F

    const/4 v4, 0x0

    invoke-static {p0, v1}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v10

    int-to-float v10, v10

    aput v10, v2, v4

    const/4 v4, 0x1

    invoke-static {p0, v1}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v10

    int-to-float v10, v10

    aput v10, v2, v4

    const/4 v4, 0x2

    invoke-static {p0, v1}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v10

    int-to-float v10, v10

    aput v10, v2, v4

    const/4 v4, 0x3

    invoke-static {p0, v1}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v1

    int-to-float v1, v1

    aput v1, v2, v4

    const/4 v1, 0x4

    const/4 v4, 0x0

    aput v4, v2, v1

    const/4 v1, 0x5

    const/4 v4, 0x0

    aput v4, v2, v1

    const/4 v1, 0x6

    const/4 v4, 0x0

    aput v4, v2, v1

    const/4 v1, 0x7

    const/4 v4, 0x0

    aput v4, v2, v1

    invoke-static {v0, v2}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣۨۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v8, v0}, Landroidx/activity/ۦۧۥۥ;->۟ۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    sget v1, Landroidx/core/ۧ۟ۤۨ;->ۣۤ۠ۤ:I

    xor-int/lit16 v1, v1, 0x1af

    invoke-static {v0, v1}, Landroidx/emoji2/ۢۧۡۧ;->ۡۤۥ(Ljava/lang/Object;I)V

    sget v2, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۨ۠ۧ:I

    xor-int/lit16 v2, v2, -0x1aa

    invoke-static {p0, v2}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v4

    invoke-static {p0, v2}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v10

    invoke-static {p0, v2}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v2

    invoke-static {p0, v1}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v1

    invoke-static {v0, v4, v10, v2, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v2

    const/16 v4, 0xab1

    sget v10, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۥۧ۟:I

    xor-int/lit8 v10, v10, 0x1b

    const/16 v11, 0x533

    invoke-static {v2, v4, v10, v11}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢۦۤ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v2, 0x41900000    # 18.0f

    invoke-static {v1, v2}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const/4 v2, 0x0

    const/4 v4, 0x1

    invoke-static {v1, v2, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۤۦۤۢ(Ljava/lang/Object;Ljava/lang/Object;I)V

    const v2, 0xcccca9

    sget v4, Landroidx/customview/ۤۡۥ;->ۣ۟ۢۥۢ:I

    xor-int/2addr v2, v4

    invoke-static {v1, v2}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v4, 0x0

    sget v10, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    xor-int/lit16 v10, v10, -0xc3

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-direct {v2, v4, v10, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۢۥۨۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v4

    const/16 v10, 0xab9

    sget v11, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    xor-int/lit16 v11, v11, 0x2fc

    const/16 v12, 0x5bc

    invoke-static {v4, v10, v11, v12}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۨۦۣۨ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v4, 0x41700000    # 15.0f

    invoke-static {v2, v4}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v4, -0x6665e5

    sget v10, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    xor-int/2addr v4, v10

    invoke-static {v2, v4}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    new-instance v4, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda5;

    invoke-direct {v4, v5}, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda5;-><init>(Landroid/app/Dialog;)V

    invoke-static {v2, v4}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۦۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v1}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v2}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v8, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/view/View;

    invoke-direct {v0, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-static {p0, v2}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۨۧۢ(Ljava/lang/Object;F)I

    move-result v2

    sget v4, Lkevin/fun/hook/۟ۥ۠۠;->ۢۦۧۧ:I

    xor-int/lit16 v4, v4, 0x1c4

    invoke-direct {v1, v4, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v0, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۦۤۡۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v1, -0x111038

    sget v2, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۧ۠۠ۡ:I

    xor-int/2addr v1, v2

    invoke-static {v0, v1}, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۤۥۧ(Ljava/lang/Object;I)V

    invoke-static {v8, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v10, Landroid/widget/LinearLayout;

    invoke-direct {v10, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x1

    invoke-static {v10, v0}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v0

    sget v1, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    xor-int/lit16 v1, v1, 0x3a8

    invoke-static {p0, v1}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v1

    const/4 v2, 0x0

    invoke-static {p0, v2}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v2

    sget v4, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    xor-int/lit16 v4, v4, -0x101

    invoke-static {p0, v4}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v4

    invoke-static {v10, v0, v1, v2, v4}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    const/4 v0, 0x1

    new-array v1, v0, [I

    sget v0, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    xor-int/lit16 v0, v0, -0x16b

    aput v6, v1, v0

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x0

    move v4, v0

    :goto_4
    array-length v2, v9

    const v0, 0xbe7f

    :goto_5
    const v12, 0xbe90

    xor-int/2addr v0, v12

    sparse-switch v0, :sswitch_data_2

    goto :goto_5

    :cond_1
    :sswitch_5
    const v0, 0xbebd

    goto :goto_5

    :sswitch_6
    aget-object v1, v3, v0

    invoke-static {v1, v2}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    const/16 v1, 0x748

    :goto_6
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_3

    goto :goto_6

    :sswitch_7
    if-eqz v4, :cond_2

    const v1, 0xbe60

    goto :goto_6

    :cond_2
    :sswitch_8
    const v1, 0xbe41

    goto :goto_6

    :sswitch_9
    move v6, v0

    goto/16 :goto_3

    :sswitch_a
    if-lt v4, v2, :cond_1

    const v0, 0xbedc

    goto :goto_5

    :sswitch_b
    invoke-static {v8, v10}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v6, Landroid/widget/LinearLayout;

    invoke-direct {v6, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    invoke-static {v6, v0}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    sget v0, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    xor-int/lit8 v0, v0, 0x46

    invoke-static {p0, v0}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v0

    sget v2, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۤ۟ۨ:I

    xor-int/lit16 v2, v2, -0x1c0

    invoke-static {p0, v2}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v2

    sget v4, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    xor-int/lit16 v4, v4, 0x172

    invoke-static {p0, v4}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v9

    invoke-static {p0, v4}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v4

    invoke-static {v6, v0, v2, v9, v4}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    new-instance v9, Landroid/widget/TextView;

    invoke-direct {v9, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v2, 0xabb

    sget v4, Landroidx/appcompat/ۣۧۤۢ;->۟۠ۡۤۤ:I

    xor-int/lit16 v4, v4, -0xef

    const/16 v10, 0x597

    invoke-static {v0, v2, v4, v10}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۦۤۢۦ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v0, 0x41800000    # 16.0f

    invoke-static {v9, v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v0, -0x1d0a8

    sget v2, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    xor-int/2addr v0, v2

    invoke-static {v9, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const/4 v0, 0x0

    const/4 v2, 0x1

    invoke-static {v9, v0, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۤۦۤۢ(Ljava/lang/Object;Ljava/lang/Object;I)V

    sget v0, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۦۦۤ۟:I

    xor-int/lit16 v0, v0, 0x9d

    invoke-static {v9, v0}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v2, 0x0

    const/4 v4, -0x2

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-direct {v0, v2, v4, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-static {v9, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۢۥۨۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda7;

    move-object v2, p1

    move-object/from16 v4, p2

    invoke-direct/range {v0 .. v5}, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda7;-><init>([ILkevin/fun/hook/SparkRenewHelper$SparkInfo;[Ljava/lang/String;Ljava/lang/Runnable;Landroid/app/Dialog;)V

    invoke-static {v9, v0}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۦۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v6, v9}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v8, v6}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v7, v8}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۡۢ۟۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v5, v7}, Landroidx/viewpager/ۣۢ۟ۤ;->ۥۢۨۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v0, Landroidx/activity/ۦۧۥۥ;->۟ۦۢۧۤ:I

    xor-int/lit16 v0, v0, -0x1a5

    invoke-static {p0, v0}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v0

    int-to-float v0, v0

    invoke-static {v8, v0}, Landroidx/loader/ۡۢۢ;->۠ۡۤۨ(Ljava/lang/Object;F)V

    invoke-static {v8}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۥۣۤۤ(Ljava/lang/Object;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroidx/loader/ۣ۟۟ۧ۠;->ۤۢ۠ۥ(Ljava/lang/Object;F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v2, -0x334

    sget v1, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    int-to-long v6, v1

    xor-long/2addr v2, v6

    invoke-static {v0, v2, v3}, Landroidx/loader/ۥۧۨۤ;->ۣۣۧ۠(Ljava/lang/Object;J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۦ۟ۢ۟(Ljava/lang/Object;Ljava/lang/Object;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۤ۟ۥ(Ljava/lang/Object;)V

    invoke-static {v5}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۦۧۤۡ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const v0, 0xbefb

    :goto_7
    const v1, 0xbf0c

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_4

    goto :goto_7

    :goto_8
    :sswitch_c
    invoke-static {}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣۣ۟۠()I

    move-result v1

    const v0, 0xc984

    :goto_9
    const v2, 0xc995

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_5

    goto :goto_9

    :sswitch_d
    if-ltz v1, :cond_5

    const v0, 0xc9e1

    goto :goto_9

    :sswitch_e
    const v0, 0xbf1a

    goto :goto_7

    :sswitch_f
    const/4 v0, 0x0

    :try_start_1
    aget-object v12, v9, v4

    const v2, 0xc202

    :goto_a
    const v13, 0xc213

    xor-int/2addr v2, v13

    sparse-switch v2, :sswitch_data_6

    goto :goto_a

    :sswitch_10
    if-ne v4, v6, :cond_3

    const v2, 0xc25f

    goto :goto_a

    :cond_3
    :sswitch_11
    const v2, 0xc240

    goto :goto_a

    :sswitch_12
    const/4 v0, 0x1

    :sswitch_13
    invoke-static {p0, v12, v0}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۧ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;Z)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-static {v11, v0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v2, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda6;

    invoke-direct {v2, v11, v4, v1}, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda6;-><init>(Ljava/util/List;I[I)V

    invoke-static {v0, v2}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۣۤۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v10, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    array-length v2, v9

    sget v12, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۨۥۦ۟:I

    const v0, 0xc27e

    :goto_b
    const v13, 0xc28f

    xor-int/2addr v0, v13

    sparse-switch v0, :sswitch_data_7

    goto :goto_b

    :cond_4
    :sswitch_14
    const v0, 0xc2bc

    goto :goto_b

    :sswitch_15
    xor-int/lit16 v0, v12, -0x28e

    add-int/2addr v0, v2

    if-ge v4, v0, :cond_4

    const v0, 0xc2db

    goto :goto_b

    :sswitch_16
    new-instance v0, Landroid/view/View;

    invoke-direct {v0, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v12, 0x3f000000    # 0.5f

    invoke-static {p0, v12}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۨۧۢ(Ljava/lang/Object;F)I

    move-result v12

    sget v13, Lorg/luckypray/dexkit/۠۠ۥ;->ۣ۟ۡۢۡ:I

    xor-int/lit16 v13, v13, 0xe2

    invoke-direct {v2, v13, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v0, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۦۤۡۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v2, -0xf0c03

    sget v12, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    xor-int/2addr v2, v12

    invoke-static {v0, v2}, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۤۥۧ(Ljava/lang/Object;I)V

    invoke-static {v10, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const v0, 0xc2fa

    :goto_c
    const v2, 0xc30b

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_8

    goto :goto_c

    :sswitch_17
    const v0, 0xc5a4

    goto :goto_c

    :sswitch_18
    sget v0, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    xor-int/lit8 v0, v0, 0x48

    add-int v2, v4, v0

    const v0, 0xc601

    :goto_d
    const v4, 0xc612

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_9

    goto :goto_d

    :sswitch_19
    const v0, 0xc620

    goto :goto_d

    :sswitch_1a
    move v4, v2

    goto/16 :goto_4

    :sswitch_1b
    sget v1, Landroidx/activity/ۦۧۥۥ;->۟ۦۢۧۤ:I

    xor-int/lit8 v1, v1, -0x36

    add-int/2addr v1, v0

    const v0, 0xc67d

    :goto_e
    const v4, 0xc68e

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_a

    goto :goto_e

    :sswitch_1c
    move v0, v1

    goto/16 :goto_0

    :sswitch_1d
    const v0, 0xc69c

    goto :goto_e

    :catchall_0
    move-exception v0

    invoke-static {v0}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣۡۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v2

    const/16 v3, 0xabd

    sget v4, Landroidx/activity/ۣۦۡۥ;->ۣۢۤۡ:I

    xor-int/lit8 v4, v4, 0x27

    const/16 v5, 0x803

    invoke-static {v2, v3, v4, v5}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۤ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۦۣ(Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_5
    :sswitch_1e
    const v0, 0xc9c2

    goto/16 :goto_9

    :sswitch_1f
    const-string v0, "jtXVrgj8JcLnOHGobELTFSKqRVVUe"

    invoke-static {v0}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->۟ۧۦ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

    :sswitch_20
    return-void

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
        0xe -> :sswitch_5
        0x2d -> :sswitch_f
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0x11 -> :sswitch_7
        0xb918 -> :sswitch_1b
        0xb939 -> :sswitch_9
        0xb97b -> :sswitch_8
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_c
        0x1f7 -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_d
        0x36 -> :sswitch_1e
        0x57 -> :sswitch_20
        0x74 -> :sswitch_1f
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x11 -> :sswitch_10
        0x32 -> :sswitch_11
        0x4c -> :sswitch_12
        0x53 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x12 -> :sswitch_14
        0x33 -> :sswitch_18
        0x54 -> :sswitch_16
        0xf1 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x1f1 -> :sswitch_17
        0x6af -> :sswitch_18
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x13 -> :sswitch_19
        0x32 -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x12 -> :sswitch_1c
        0xf3 -> :sswitch_1d
    .end sparse-switch
.end method

.method private static showResult(Landroid/app/Activity;ZLjava/lang/String;)V
    .locals 2

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟۟ۨ۟()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda12;

    invoke-direct {v1, p0, p1, p2}, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda12;-><init>(Landroid/app/Activity;ZLjava/lang/String;)V

    invoke-static {v0, v1}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "rII"

    invoke-static {v0}, Landroidx/drawerlayout/ۤۨۡۤ;->ۡۢۢ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

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

.method public static showSparkManageDialog(Landroid/content/Context;)V
    .locals 13

    :try_start_0
    new-instance v2, Landroid/app/Dialog;

    const v0, 0x1030059

    sget v1, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    xor-int/2addr v0, v1

    invoke-direct {v2, p0, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    const/4 v0, 0x1

    invoke-static {v2, v0}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۡۡ۠(Ljava/lang/Object;Z)V

    const/4 v0, 0x1

    invoke-static {v2, v0}, Landroidx/emoji2/ۢۧۡۧ;->ۦ۠ۥۤ(Ljava/lang/Object;Z)V

    new-instance v3, Landroid/widget/FrameLayout;

    invoke-direct {v3, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    sget v1, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    xor-int/lit16 v1, v1, 0x259

    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-static {v3, v0}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۣۡ۠۟(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0x7fffff85

    sget v4, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۦۣۧ:I

    xor-int/2addr v0, v4

    invoke-static {v3, v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۣۢۧ(Ljava/lang/Object;I)V

    new-instance v4, Landroid/widget/LinearLayout;

    invoke-direct {v4, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x1

    invoke-static {v4, v0}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    invoke-static {v4, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۡ۠ۨ۟(Ljava/lang/Object;I)V

    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    sget v5, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v5, v5, -0x210

    invoke-direct {v0, v1, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v6, 0x50

    iput v6, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    invoke-static {v4, v0}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣۡۥۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-static {v0, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    sget v1, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۨۥۦ۟:I

    xor-int/lit16 v1, v1, 0x299

    const/16 v6, 0x8

    new-array v6, v6, [F

    const/4 v7, 0x0

    invoke-static {p0, v1}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v8

    int-to-float v8, v8

    aput v8, v6, v7

    const/4 v7, 0x1

    invoke-static {p0, v1}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v8

    int-to-float v8, v8

    aput v8, v6, v7

    const/4 v7, 0x2

    invoke-static {p0, v1}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v8

    int-to-float v8, v8

    aput v8, v6, v7

    const/4 v7, 0x3

    invoke-static {p0, v1}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v8

    int-to-float v8, v8

    aput v8, v6, v7

    const/4 v7, 0x4

    const/4 v8, 0x0

    aput v8, v6, v7

    const/4 v7, 0x5

    const/4 v8, 0x0

    aput v8, v6, v7

    const/4 v7, 0x6

    const/4 v8, 0x0

    aput v8, v6, v7

    const/4 v7, 0x7

    const/4 v8, 0x0

    aput v8, v6, v7

    invoke-static {v0, v6}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣۨۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4, v0}, Landroidx/activity/ۦۧۥۥ;->۟ۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v6, 0x0

    invoke-static {v0, v6}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    sget v6, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    xor-int/lit16 v6, v6, 0x176

    invoke-static {v0, v6}, Landroidx/emoji2/ۢۧۡۧ;->ۡۤۥ(Ljava/lang/Object;I)V

    invoke-static {p0, v1}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v7

    invoke-static {p0, v1}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v8

    invoke-static {p0, v1}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v1

    sget v9, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    xor-int/lit16 v9, v9, -0x32f

    invoke-static {p0, v9}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v9

    invoke-static {v0, v7, v8, v1, v9}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v7

    const/16 v8, 0xae2

    sget v9, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۤۥ:I

    xor-int/lit16 v9, v9, 0x3bd

    const/16 v10, 0x442

    invoke-static {v7, v8, v9, v10}, Lkevin/fun/hook/۟ۥ۠۠;->ۣۨۢ۟([SIII)Ljava/lang/String;

    move-result-object v7

    invoke-static {v1, v7}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v7, 0x41a00000    # 20.0f

    invoke-static {v1, v7}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-static {v1, v7, v8}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۤۦۤۢ(Ljava/lang/Object;Ljava/lang/Object;I)V

    const v7, -0xcccc86

    sget v8, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    xor-int/2addr v7, v8

    invoke-static {v1, v7}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v8, 0x0

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-direct {v7, v8, v5, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-static {v1, v7}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۢۥۨۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Landroid/widget/TextView;

    invoke-direct {v5, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v7

    const/16 v8, 0xae6

    sget v9, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    xor-int/lit8 v9, v9, 0x50

    const/16 v10, 0x4be

    invoke-static {v7, v8, v9, v10}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦۣ۠ۤ([SIII)Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v7}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v7, 0x41700000    # 15.0f

    invoke-static {v5, v7}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v7, 0x1d3d0

    sget v8, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۦۣۧ:I

    xor-int/2addr v7, v8

    invoke-static {v5, v7}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-static {v5, v7, v8}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۤۦۤۢ(Ljava/lang/Object;Ljava/lang/Object;I)V

    new-instance v7, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda19;

    invoke-direct {v7, v2}, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda19;-><init>(Landroid/app/Dialog;)V

    invoke-static {v5, v7}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۦۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v1}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v5}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Landroid/widget/LinearLayout;

    invoke-direct {v5, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    invoke-static {v5, v0}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    invoke-static {v5, v6}, Landroidx/emoji2/ۢۧۡۧ;->ۡۤۥ(Ljava/lang/Object;I)V

    sget v0, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۤ۟ۨ:I

    xor-int/lit16 v0, v0, -0x1bc

    invoke-static {p0, v0}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v1

    sget v6, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۢ۟ۡ:I

    xor-int/lit16 v6, v6, -0x268

    invoke-static {p0, v6}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v7

    invoke-static {p0, v0}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v0

    invoke-static {p0, v6}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v6

    invoke-static {v5, v1, v7, v0, v6}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper;->ۤۥۥ۟(Ljava/lang/Object;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {v5, v0}, Landroidx/activity/ۦۧۥۥ;->۟ۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v6, Landroid/widget/LinearLayout;

    invoke-direct {v6, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    invoke-static {v6, v0}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    sget v0, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۥۨ:I

    xor-int/lit16 v0, v0, 0x294

    invoke-static {v6, v0}, Landroidx/emoji2/ۢۧۡۧ;->ۡۤۥ(Ljava/lang/Object;I)V

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, 0x0

    sget v7, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    xor-int/lit16 v7, v7, -0x384

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v7, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-static {v6, v0}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣۡۥۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v7, Landroid/widget/TextView;

    invoke-direct {v7, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0xae8

    sget v8, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    xor-int/lit16 v8, v8, 0x163

    const/16 v9, 0xa60

    invoke-static {v0, v1, v8, v9}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟۟۟ۦۢ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v0, 0x41600000    # 14.0f

    invoke-static {v7, v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v0, -0xcccfc2

    sget v1, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    xor-int/2addr v0, v1

    invoke-static {v7, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, 0x0

    sget v8, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۥۨ:I

    xor-int/lit16 v8, v8, -0x286

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v8, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-static {v7, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۢۥۨۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v8, Landroid/widget/Switch;

    invoke-direct {v8, p0}, Landroid/widget/Switch;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0xaed

    sget v9, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۤۨۨ:I

    xor-int/lit16 v9, v9, 0x11e

    const/16 v10, 0x9db

    invoke-static {v0, v1, v9, v10}, Landroidx/activity/ۨ۠۟ۧ;->۟ۡۨۨۧ([SIII)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۥۣۤۧ(Ljava/lang/Object;Z)Z

    move-result v9

    invoke-static {v8, v9}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۤ۠ۧ(Ljava/lang/Object;Z)V

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
    if-eqz v9, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const v0, -0x1d3ab

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v1, 0x6eb

    goto :goto_1

    :sswitch_4
    const v0, -0x333334

    :sswitch_5
    invoke-static {v0}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢۥۦۥ(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-static {v8, v0}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۢۦۧۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz v9, :cond_1

    const v0, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    const v0, 0x33fe2c55

    const v1, 0xbe7f

    :goto_3
    const v9, 0xbe90

    xor-int/2addr v1, v9

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :goto_4
    :sswitch_9
    invoke-static {v0}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢۥۦۥ(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-static {v8, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟۠۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda20;

    invoke-direct {v0, v8}, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda20;-><init>(Landroid/widget/Switch;)V

    invoke-static {v8, v0}, Landroidx/core/ۧ۟ۤۨ;->ۣ۟ۡۤ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v6, v7}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v6, v8}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v7, Landroid/view/View;

    invoke-direct {v7, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, 0x1

    invoke-static {p0, v1}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v1

    sget v8, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    xor-int/lit16 v8, v8, -0x111

    invoke-static {p0, v8}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v8

    invoke-direct {v0, v1, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v7, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۦۤۡۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, -0x111164

    sget v1, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    xor-int/2addr v0, v1

    invoke-static {v7, v0}, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۤۥۧ(Ljava/lang/Object;I)V

    new-instance v8, Landroid/widget/LinearLayout;

    invoke-direct {v8, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    invoke-static {v8, v0}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    sget v0, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    xor-int/lit8 v0, v0, -0x4

    invoke-static {v8, v0}, Landroidx/emoji2/ۢۧۡۧ;->ۡۤۥ(Ljava/lang/Object;I)V

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, 0x0

    sget v9, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢ۟ۥ:I

    xor-int/lit16 v9, v9, -0x176

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v9, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-static {v8, v0}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣۡۥۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v0, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    xor-int/lit8 v0, v0, -0x66

    invoke-static {p0, v0}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v0

    const/4 v1, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static {v8, v0, v1, v9, v10}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    new-instance v9, Landroid/widget/TextView;

    invoke-direct {v9, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0xaff

    sget v10, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    xor-int/lit8 v10, v10, -0x15

    const/16 v11, 0xc76

    invoke-static {v0, v1, v10, v11}, Landroidx/emoji2/ۢۧۡۧ;->۟ۥۢ۟ۢ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v0, 0x41600000    # 14.0f

    invoke-static {v9, v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v0, -0xcccc9f

    sget v1, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    xor-int/2addr v0, v1

    invoke-static {v9, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, 0x0

    const/4 v10, -0x2

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v10, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-static {v9, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۢۥۨۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v10, Landroid/widget/Switch;

    invoke-direct {v10, p0}, Landroid/widget/Switch;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۧۥۨۦ()Z

    move-result v11

    invoke-static {v10, v11}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۤ۠ۧ(Ljava/lang/Object;Z)V

    const v0, 0xbefb

    :goto_5
    const v1, 0xbf0c

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_4

    goto :goto_5

    :cond_2
    :sswitch_a
    const v0, 0xbf39

    goto :goto_5

    :sswitch_b
    const v1, 0xbe9e

    goto/16 :goto_3

    :sswitch_c
    const v0, 0x33cccccc

    goto/16 :goto_4

    :sswitch_d
    if-eqz v11, :cond_2

    const v0, 0xc1e3

    goto :goto_5

    :sswitch_e
    const v0, -0x1d3ab

    const v1, 0xc202

    :goto_6
    const v12, 0xc213

    xor-int/2addr v1, v12

    sparse-switch v1, :sswitch_data_5

    goto :goto_6

    :sswitch_f
    const v1, 0xc221

    goto :goto_6

    :sswitch_10
    const v0, -0x333334

    :sswitch_11
    invoke-static {v0}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢۥۦۥ(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-static {v10, v0}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۢۦۧۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0xc27e

    :goto_7
    const v1, 0xc28f

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_6

    goto :goto_7

    :cond_3
    :sswitch_12
    const v0, 0xc2bc

    goto :goto_7

    :sswitch_13
    if-eqz v11, :cond_3

    const v0, 0xc2db

    goto :goto_7

    :sswitch_14
    const v0, 0x33fe2c55

    const v1, 0xc2fa

    :goto_8
    const v11, 0xc30b

    xor-int/2addr v1, v11

    sparse-switch v1, :sswitch_data_7

    goto :goto_8

    :sswitch_15
    const v1, 0xc5a4

    goto :goto_8

    :sswitch_16
    const v0, 0x33cccccc

    :sswitch_17
    invoke-static {v0}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢۥۦۥ(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-static {v10, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟۠۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda1;

    invoke-direct {v0, v10, v2, p0}, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda1;-><init>(Landroid/widget/Switch;Landroid/app/Dialog;Landroid/content/Context;)V

    invoke-static {v10, v0}, Landroidx/core/ۧ۟ۤۨ;->ۣ۟ۡۤ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v8, v9}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v8, v10}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v5, v6}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v5, v7}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v5, v8}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4, v5}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/view/View;

    invoke-direct {v0, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v5, 0x3f000000    # 0.5f

    invoke-static {p0, v5}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۨۧۢ(Ljava/lang/Object;F)I

    move-result v5

    sget v6, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    xor-int/lit16 v6, v6, -0x167

    invoke-direct {v1, v6, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v0, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۦۤۡۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v1, -0x111396

    sget v5, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۥۨ:I

    xor-int/2addr v1, v5

    invoke-static {v0, v1}, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۤۥۧ(Ljava/lang/Object;I)V

    invoke-static {v4, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    sget v1, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    xor-int/lit8 v1, v1, 0x58

    invoke-static {v0, v1}, Landroidx/emoji2/ۢۧۡۧ;->ۡۤۥ(Ljava/lang/Object;I)V

    sget v1, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۢ۠۠ۨ:I

    xor-int/lit8 v1, v1, -0x5f

    invoke-static {p0, v1}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v1

    sget v5, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣۡۢ۟:I

    xor-int/lit16 v5, v5, 0x32e

    invoke-static {p0, v5}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v5

    sget v6, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۥۦ:I

    xor-int/lit16 v6, v6, 0x273

    invoke-static {p0, v6}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v6

    sget v7, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    xor-int/lit8 v7, v7, -0x7e

    invoke-static {p0, v7}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v7

    invoke-static {v0, v1, v5, v6, v7}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {v1}, Lkevin/fun/hook/SparkRenewHelper;->ۥۤۧۧ(Ljava/lang/Object;)V

    const/high16 v5, 0x41400000    # 12.0f

    invoke-static {v1, v5}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v5, -0x66676b

    sget v6, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۤۨۨ:I

    xor-int/2addr v5, v6

    invoke-static {v1, v5}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    sget v5, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢ۟ۥ:I

    xor-int/lit16 v5, v5, 0x165

    invoke-static {v1, v5}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    sget v5, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v5, v5, 0x20a

    invoke-static {v1, v5}, Landroidx/activity/ۨ۠۟ۧ;->۟ۢۤۢ(Ljava/lang/Object;I)V

    invoke-static {v0, v1}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Landroid/widget/TextView;

    invoke-direct {v5, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v6

    const/16 v7, 0xb06

    sget v8, Landroidx/customview/ۡۤۡۤ;->۟ۦ۟ۨۨ:I

    xor-int/lit16 v8, v8, 0xfd

    const/16 v9, 0x263

    invoke-static {v6, v7, v8, v9}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦۣ۠ۤ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v6, 0x41200000    # 10.0f

    invoke-static {v5, v6}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v6, -0x444772

    sget v7, Landroidx/activity/ۨ۠۟ۧ;->۟ۦۥۢۢ:I

    xor-int/2addr v6, v7

    invoke-static {v5, v6}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    sget v6, Landroidx/customview/ۤۡۥ;->ۣ۟ۢۥۢ:I

    xor-int/lit8 v6, v6, -0x75

    invoke-static {v5, v6}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    sget v6, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۠ۧۡ۟:I

    xor-int/lit16 v6, v6, -0x16f

    invoke-static {v5, v6}, Landroidx/activity/ۨ۠۟ۧ;->۟ۢۤۢ(Ljava/lang/Object;I)V

    const/4 v7, 0x0

    invoke-static {p0, v6}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v6

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static {v5, v7, v6, v8, v9}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    invoke-static {v0, v5}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/view/View;

    invoke-direct {v0, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v6, 0x3f000000    # 0.5f

    invoke-static {p0, v6}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۨۧۢ(Ljava/lang/Object;F)I

    move-result v6

    sget v7, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۡۨۨۧ:I

    xor-int/lit16 v7, v7, 0x1e7

    invoke-direct {v5, v7, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v0, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۦۤۡۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v5, 0x111164

    sget v6, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    xor-int/2addr v5, v6

    invoke-static {v0, v5}, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۤۥۧ(Ljava/lang/Object;I)V

    invoke-static {v4, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۨ۟ۨ(Ljava/lang/Object;)Landroid/content/res/Resources;

    move-result-object v5

    invoke-static {v5}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟۟ۤۦۤ(Ljava/lang/Object;)Landroid/util/DisplayMetrics;

    move-result-object v5

    invoke-static {v5}, Landroidx/loader/ۡۢۢ;->ۤۤ۠ۤ(Ljava/lang/Object;)I

    move-result v5

    int-to-double v6, v5

    const-wide v8, 0x3fe199999999999aL    # 0.55

    mul-double/2addr v6, v8

    double-to-int v5, v6

    new-instance v6, Landroid/widget/ScrollView;

    invoke-direct {v6, p0}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    sget v8, Lkevin/fun/hook/۟ۥ۠۠;->ۢۦۧۧ:I

    xor-int/lit16 v8, v8, 0x1c4

    invoke-direct {v7, v8, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v6, v7}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧۦ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v5, 0x0

    invoke-static {v6, v5}, Lorg/luckypray/dexkit/۠۠ۥ;->۟ۤ۟ۡۦ(Ljava/lang/Object;I)V

    new-instance v5, Landroid/widget/LinearLayout;

    invoke-direct {v5, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v7, 0x1

    invoke-static {v5, v7}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    sget v7, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    xor-int/lit8 v7, v7, 0x42

    invoke-static {p0, v7}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v8

    const/4 v9, 0x0

    invoke-static {p0, v7}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v10

    invoke-static {p0, v7}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v7

    invoke-static {v5, v8, v9, v10, v7}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    new-instance v7, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda2;

    invoke-direct {v7, v5, v0, v1, p0}, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda2;-><init>(Landroid/widget/LinearLayout;Ljava/util/ArrayList;Landroid/widget/TextView;Landroid/content/Context;)V

    invoke-static {v7}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۣ۠ۢۥ(Ljava/lang/Object;)V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۧۤۡۨ()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lkevin/fun/hook/SparkRenewHelper$5;

    invoke-direct {v1, v2, v7, v0}, Lkevin/fun/hook/SparkRenewHelper$5;-><init>(Landroid/app/Dialog;Ljava/lang/Runnable;Landroid/os/Handler;)V

    const-wide/16 v8, -0x13fe

    sget v7, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    int-to-long v10, v7

    xor-long/2addr v8, v10

    invoke-static {v0, v1, v8, v9}, Landroidx/loader/۟۠ۢۧۡ;->ۣۤۧۢ(Ljava/lang/Object;Ljava/lang/Object;J)Z

    invoke-static {v6, v5}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۥۧ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4, v6}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3, v4}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۡۢ۟۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v3}, Landroidx/viewpager/ۣۢ۟ۤ;->ۥۢۨۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v5, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۥۨ:I

    xor-int/lit16 v5, v5, 0x314

    invoke-static {p0, v5}, Lkevin/fun/hook/SparkRenewHelper;->۟ۡۥۣۨ(Ljava/lang/Object;I)I

    move-result v5

    int-to-float v5, v5

    invoke-static {v4, v5}, Landroidx/loader/ۡۢۢ;->۠ۡۤۨ(Ljava/lang/Object;F)V

    invoke-static {v4}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۥۣۤۤ(Ljava/lang/Object;)Landroid/view/ViewPropertyAnimator;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v4, v5}, Landroidx/loader/ۣ۟۟ۧ۠;->ۤۢ۠ۥ(Ljava/lang/Object;F)Landroid/view/ViewPropertyAnimator;

    move-result-object v4

    const-wide/16 v6, -0xcc

    sget v5, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۡۨۨۧ:I

    int-to-long v8, v5

    xor-long/2addr v6, v8

    invoke-static {v4, v6, v7}, Landroidx/loader/ۥۧۨۤ;->ۣۣۧ۠(Ljava/lang/Object;J)Landroid/view/ViewPropertyAnimator;

    move-result-object v4

    new-instance v5, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v5}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-static {v4, v5}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۦ۟ۢ۟(Ljava/lang/Object;Ljava/lang/Object;)Landroid/view/ViewPropertyAnimator;

    move-result-object v4

    invoke-static {v4}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۤ۟ۥ(Ljava/lang/Object;)V

    new-instance v4, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda3;

    invoke-direct {v4, v2}, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda3;-><init>(Landroid/app/Dialog;)V

    invoke-static {v3, v4}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۥۥۥۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda4;

    invoke-direct {v3, v0, v1}, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda4;-><init>(Landroid/os/Handler;Ljava/lang/Runnable;)V

    invoke-static {v2, v3}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->۟ۧ۟ۧۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۦۧۤۡ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const v0, 0xc601

    :goto_9
    const v1, 0xc612

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_8

    goto :goto_9

    :sswitch_18
    const v0, 0xc620

    goto :goto_9

    :catchall_0
    move-exception v0

    invoke-static {v0}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣۡۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v2

    const/16 v3, 0xb14

    sget v4, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۥۦ:I

    xor-int/lit16 v4, v4, 0x246

    const/16 v5, 0x64c

    invoke-static {v2, v3, v4, v5}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣ۟۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۦۣ(Ljava/lang/Object;)V

    :sswitch_19
    invoke-static {}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۡۢۦ()I

    move-result v1

    const v0, 0xc67d

    :goto_a
    const v2, 0xc68e

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_9

    goto :goto_a

    :cond_4
    :sswitch_1a
    const v0, 0xc6bb

    goto :goto_a

    :sswitch_1b
    if-gtz v1, :cond_4

    const v0, 0xc965

    goto :goto_a

    :sswitch_1c
    const-string v0, "UX9AljZuBcb3"

    invoke-static {v0}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->۟۠ۧۡ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_1d
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
        0x32 -> :sswitch_19
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1a
        0x35 -> :sswitch_1d
        0xf3 -> :sswitch_1b
        0xfeb -> :sswitch_1c
    .end sparse-switch
.end method

.method private static updateOptionSelectedState(Landroid/widget/LinearLayout;Z)V
    .locals 7

    const/4 v6, 0x1

    const/4 v5, 0x0

    const v3, -0x1d3ab

    invoke-static {p0, v5}, Landroidx/activity/ۨ۠۟ۧ;->ۣۣ۠ۨ(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {p0, v6}, Landroidx/activity/ۨ۠۟ۧ;->ۣۣ۠ۨ(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

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
    if-eqz p1, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v2, 0x6eb

    goto :goto_1

    :sswitch_4
    move v2, v3

    :goto_2
    invoke-static {v0, v2}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const/16 v0, 0x748

    :goto_3
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_3

    :sswitch_5
    if-eqz p1, :cond_1

    const v0, 0xbe60

    goto :goto_3

    :sswitch_6
    const v2, -0xcccccd

    goto :goto_2

    :cond_1
    :sswitch_7
    const v0, 0xbe41

    goto :goto_3

    :sswitch_8
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v2, 0xb35

    const/16 v4, 0x360

    invoke-static {v0, v2, v6, v4}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣ۟۠ۢۡ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v0, 0x41900000    # 18.0f

    invoke-static {v1, v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    invoke-static {v1, v3}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    invoke-static {v1, v5}, Landroidx/loader/۟۠ۢۧۡ;->ۦۡ۠ۨ(Ljava/lang/Object;I)V

    const v0, 0xbe7f

    :goto_4
    const v1, 0xbe90

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_3

    goto :goto_4

    :goto_5
    :sswitch_9
    const v0, 0x100002cd

    sget v1, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۨۥۦ۟:I

    xor-int/2addr v0, v1

    invoke-static {p1}, Landroidx/loader/ۡۢۢ;->ۤۨۡۥ(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {p0, v0, v1}, Landroidx/vectordrawable/ۢۤۡۤ;->ۡۤۦۤ(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-static {}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۤۦۣ()I

    move-result v1

    const v0, 0xbefb

    :goto_6
    const v2, 0xbf0c

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_4

    goto :goto_6

    :cond_2
    :sswitch_a
    const v0, 0xbf39

    goto :goto_6

    :sswitch_b
    const v0, 0xbe9e

    goto :goto_4

    :sswitch_c
    sget v0, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    xor-int/lit16 v0, v0, 0x38a

    invoke-static {v1, v0}, Landroidx/loader/۟۠ۢۧۡ;->ۦۡ۠ۨ(Ljava/lang/Object;I)V

    goto :goto_5

    :sswitch_d
    if-gtz v1, :cond_2

    const v0, 0xc1e3

    goto :goto_6

    :sswitch_e
    const-string v0, "FX6A2r8weoJktW"

    invoke-static {v0}, Landroidx/core/ktx/۟۟ۡۢ۠;->۟ۥ۟ۨ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

    :sswitch_f
    return-void

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

.method private static updateProgress(IILjava/lang/String;)V
    .locals 2

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۢۢۨ()Landroid/app/AlertDialog;

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
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۢۢۨ()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-static {v0}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۧۧۨۢ(Ljava/lang/Object;)Z

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
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۥۢۤ۠()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lkevin/fun/hook/SparkRenewHelper$1;

    invoke-direct {v1, p0, p1, p2}, Lkevin/fun/hook/SparkRenewHelper$1;-><init>(IILjava/lang/String;)V

    invoke-static {v0, v1}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۣۣ۟ۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    :sswitch_8
    return-void

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

.method private static updateStatsText(Landroid/widget/TextView;)V
    .locals 5

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۢۡۡ()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-static {v0}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۥۡ۟۟(Ljava/lang/Object;)I

    move-result v3

    const/4 v0, 0x0

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->ۣ۟ۢۡۡ()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v1

    invoke-static {v1}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->۟ۦۦۨ(Ljava/lang/Object;)Ljava/util/Collection;

    move-result-object v1

    invoke-static {v1}, Landroidx/interpolator/۟ۧۦ۟ۨ;->۟ۦۦۧۨ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v4

    move v1, v0

    :goto_0
    :sswitch_0
    invoke-static {v4}, Landroidx/activity/ۣۦۡۥ;->ۣ۟ۧۧۡ(Ljava/lang/Object;)Z

    move-result v2

    const/16 v0, 0x650

    :goto_1
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    :cond_0
    :sswitch_1
    const/16 v0, 0x68e

    goto :goto_1

    :sswitch_2
    if-nez v2, :cond_0

    const/16 v0, 0x6ad

    goto :goto_1

    :sswitch_3
    invoke-static {v3}, Landroidx/activity/ۤۧۧۧ;->ۣ۟ۦۣ۠(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1}, Landroidx/activity/ۤۧۧۧ;->ۣ۟ۦۣ۠(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    sget v3, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۡۦۥۨ:I

    xor-int/lit16 v3, v3, 0x11e

    aput-object v0, v2, v3

    sget v0, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    xor-int/lit16 v0, v0, 0x30c

    aput-object v1, v2, v0

    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->۟ۤۦۣۨ()[S

    move-result-object v0

    const/16 v1, 0xb36

    sget v3, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۢ۠۠ۨ:I

    xor-int/lit8 v3, v3, -0x5a

    const/16 v4, 0xc1c

    invoke-static {v0, v1, v3, v4}, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۥۧۤ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۣۢ۠ۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :sswitch_4
    invoke-static {v4}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۦۥۦۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkevin/fun/hook/SparkRenewHelper$SparkInfo;

    const/16 v2, 0x6cc

    :goto_2
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_2

    :sswitch_5
    if-eqz v0, :cond_1

    const/16 v2, 0x729

    goto :goto_2

    :cond_1
    :sswitch_6
    const/16 v2, 0x70a

    goto :goto_2

    :sswitch_7
    invoke-static {v0}, Landroidx/core/ۤۦ۟ۢ;->ۣ۟ۡۦۢ(Ljava/lang/Object;)Z

    move-result v2

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
    sget v0, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    xor-int/lit16 v0, v0, 0x178

    add-int/2addr v0, v1

    const v1, 0xbe7f

    :goto_4
    const v2, 0xbe90

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_3

    goto :goto_4

    :sswitch_b
    move v1, v0

    goto :goto_0

    :sswitch_c
    const v1, 0xbe9e

    goto :goto_4

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_1
        0x31 -> :sswitch_2
        0xcc -> :sswitch_3
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_6
        0x1d7 -> :sswitch_0
        0x1f4 -> :sswitch_7
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_8
        0xb918 -> :sswitch_0
        0xb939 -> :sswitch_a
        0xb97b -> :sswitch_9
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_b
        0xef -> :sswitch_c
    .end sparse-switch
.end method

.method public static ۣ۟۟ۨۡ()Ljava/lang/String;
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
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->getTodayDateString()Ljava/lang/String;

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

.method public static ۟۠ۡۨۥ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/widget/LinearLayout;
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
    check-cast p0, Landroid/content/Context;

    check-cast p1, Lkevin/fun/hook/SparkRenewHelper$SparkInfo;

    invoke-static {p0, p1}, Lkevin/fun/hook/SparkRenewHelper;->createSparkItemView(Landroid/content/Context;Lkevin/fun/hook/SparkRenewHelper$SparkInfo;)Landroid/widget/LinearLayout;

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

.method public static ۟۠ۧۤ۠()Ljava/util/concurrent/atomic/AtomicReference;
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
    sget-object v0, Lkevin/fun/hook/SparkRenewHelper;->templateMessage:Ljava/util/concurrent/atomic/AtomicReference;

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

.method public static ۟ۡ۠ۡۤ()Ljava/util/ArrayList;
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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->getConversationsNeedingAutoRenewal()Ljava/util/ArrayList;

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

.method public static ۟ۡۥۣۨ(Ljava/lang/Object;I)I
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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/content/Context;

    invoke-static {p0, p1}, Lkevin/fun/hook/SparkRenewHelper;->dp(Landroid/content/Context;I)I

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

.method public static ۣ۟ۡۧ۠(Ljava/lang/Object;ZLjava/lang/Object;)V
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
    check-cast p0, Landroid/app/Activity;

    check-cast p2, Ljava/lang/String;

    invoke-static {p0, p1, p2}, Lkevin/fun/hook/SparkRenewHelper;->showResult(Landroid/app/Activity;ZLjava/lang/String;)V

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

.method public static ۟ۡۧ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;Z)Landroid/widget/LinearLayout;
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
    check-cast p0, Landroid/content/Context;

    check-cast p1, Ljava/lang/String;

    invoke-static {p0, p1, p2}, Lkevin/fun/hook/SparkRenewHelper;->createOptionRow(Landroid/content/Context;Ljava/lang/String;Z)Landroid/widget/LinearLayout;

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

.method public static ۣ۟ۢ۟۟(Ljava/lang/Object;)Z
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
    check-cast p0, Lkevin/fun/hook/SparkRenewHelper$SparkInfo;

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper;->sendSparkMessage(Lkevin/fun/hook/SparkRenewHelper$SparkInfo;)Z

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

.method public static ۟ۢ۠۟ۦ(Ljava/lang/Object;Ljava/lang/Object;)V
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
    check-cast p0, Ljava/lang/String;

    check-cast p1, Ljava/lang/String;

    invoke-static {p0, p1}, Lkevin/fun/hook/SparkRenewHelper;->setConversationCustomMessage(Ljava/lang/String;Ljava/lang/String;)V

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

.method public static ۣ۟ۢۢۨ()Landroid/app/AlertDialog;
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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/SparkRenewHelper;->renewProgressDialog:Landroid/app/AlertDialog;

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

.method public static ۣ۟ۢۡۡ()Ljava/util/concurrent/ConcurrentHashMap;
    .locals 2

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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/SparkRenewHelper;->sparkConversations:Ljava/util/concurrent/ConcurrentHashMap;

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

.method public static ۟ۢۤۢۨ(Ljava/lang/Object;Ljava/lang/Object;)J
    .locals 3

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
    invoke-static {p0, p1}, Lkevin/fun/hook/SparkRenewHelper;->extractOtherUid(Ljava/lang/Object;Ljava/lang/Object;)J

    move-result-wide v0

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

.method public static ۟ۢۥ۟۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p1, Ljava/lang/String;

    check-cast p2, [Ljava/lang/Object;

    invoke-static {p0, p1, p2}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

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

.method public static ۣ۟۟ۨ۟()Landroid/os/Handler;
    .locals 2

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۡ۟ۨۨ()I

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
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->getMainHandler()Landroid/os/Handler;

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

.method public static ۣ۟ۨۥۣ()Ljava/util/concurrent/atomic/AtomicBoolean;
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
    sget-object v0, Lkevin/fun/hook/SparkRenewHelper;->autoRenewTriggered:Ljava/util/concurrent/atomic/AtomicBoolean;

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

.method public static ۣ۟ۨۧۢ(Ljava/lang/Object;F)I
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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/content/Context;

    invoke-static {p0, p1}, Lkevin/fun/hook/SparkRenewHelper;->dp(Landroid/content/Context;F)I

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

.method public static ۟ۤۡ۟۠(Ljava/lang/Object;Ljava/lang/Object;)V
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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Ljava/lang/String;

    check-cast p1, Ljava/lang/String;

    invoke-static {p0, p1}, Lkevin/fun/hook/SparkRenewHelper;->setConversationRandomApiType(Ljava/lang/String;Ljava/lang/String;)V

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

.method public static ۟ۤۦۣۨ()[S
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
    sget-object v0, Lkevin/fun/hook/SparkRenewHelper;->short:[S

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

.method public static ۟ۤۧۨۢ(Ljava/lang/Object;)V
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
    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper;->clearConversationCustomMessage(Ljava/lang/String;)V

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
    const-string v0, "ARTpFigHywK"

    invoke-static {v0}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣ۟ۢۥ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

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

.method public static ۟ۥۣۡۨ(Ljava/lang/Object;)J
    .locals 3

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
    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper;->parseOtherUidFromConversationId(Ljava/lang/String;)J

    move-result-wide v0

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

.method public static ۟ۥۤۢۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
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

    check-cast p1, Lkevin/fun/hook/SparkRenewHelper$SparkInfo;

    check-cast p2, Ljava/lang/Runnable;

    invoke-static {p0, p1, p2}, Lkevin/fun/hook/SparkRenewHelper;->showRandomApiSelectDialog(Landroid/content/Context;Lkevin/fun/hook/SparkRenewHelper$SparkInfo;Ljava/lang/Runnable;)V

    :sswitch_3
    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۥۦۨ۠()I

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
    const-string v0, "oJpwuQNaPDAbsizzj"

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->ۨۤۨۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

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

.method public static ۟ۥۣۤۧ(Ljava/lang/Object;III)V
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
    check-cast p0, Landroid/app/Activity;

    invoke-static {p0, p1, p2, p3}, Lkevin/fun/hook/SparkRenewHelper;->showBackgroundResultToast(Landroid/app/Activity;III)V

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

.method public static ۟ۥۣۤۧ(Ljava/lang/Object;)Ljava/lang/String;
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
    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper;->getRandomApiUrl(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۟ۥۥۥۨ(Ljava/lang/Object;Z)V
    .locals 2

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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Ljava/lang/String;

    invoke-static {p0, p1}, Lkevin/fun/hook/SparkRenewHelper;->setConversationEnabled(Ljava/lang/String;Z)V

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

.method public static ۟ۥۦۦۦ()Landroid/widget/ProgressBar;
    .locals 2

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۡ۟ۨۨ()I

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
    sget-object v0, Lkevin/fun/hook/SparkRenewHelper;->renewProgressBar:Landroid/widget/ProgressBar;

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

.method public static ۟ۥۧۡ۠(Ljava/lang/Object;)Ljava/lang/String;
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
    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper;->getConversationCustomMessage(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۟ۥۣۨ()Ljava/lang/Object;
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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->getOrInstantiateHandler()Ljava/lang/Object;

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

.method public static ۟ۥۨۦۡ()Landroid/content/Context;
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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/SparkRenewHelper;->hostContext:Landroid/content/Context;

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

.method public static ۟ۦ۟ۡۤ()Ljava/lang/Object;
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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->getOrInstantiateMessage()Ljava/lang/Object;

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

.method public static ۟ۦ۟ۢ۟(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper;->getConversationRandomApiType(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۟ۦ۠ۡۡ()Ljava/lang/ClassLoader;
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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/SparkRenewHelper;->classLoader:Ljava/lang/ClassLoader;

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

.method public static ۟ۦۤ۠۠(Ljava/lang/Object;)V
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
    check-cast p0, Landroid/app/Activity;

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper;->runAutoRenewFlow(Landroid/app/Activity;)V

    :sswitch_3
    invoke-static {}, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۥۢۦ()I

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
    const-string v0, "wi6N6VFD"

    invoke-static {v0}, Landroidx/core/ktx/۟۟ۡۢ۠;->۟ۥ۟ۨ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

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

.method public static ۟ۦۦ۟ۦ()Ljava/util/concurrent/ConcurrentHashMap;
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
    sget-object v0, Lkevin/fun/hook/SparkRenewHelper;->allConversations:Ljava/util/concurrent/ConcurrentHashMap;

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

.method public static ۟ۦۣۧ۟()Landroid/os/Handler;
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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/SparkRenewHelper;->mainHandler:Landroid/os/Handler;

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

.method public static ۟ۦۧۥۨ()Landroid/widget/TextView;
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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/SparkRenewHelper;->renewProgressText:Landroid/widget/TextView;

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

.method public static ۣ۟ۧۡۤ()Ljava/util/concurrent/atomic/AtomicBoolean;
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
    sget-object v0, Lkevin/fun/hook/SparkRenewHelper;->hooked:Ljava/util/concurrent/atomic/AtomicBoolean;

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

.method public static ۟ۧۡۦۧ(Ljava/lang/Object;)Z
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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper;->isConversationEnabled(Ljava/lang/String;)Z

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

.method public static ۟ۧۢۢ۠()Ljava/util/concurrent/ConcurrentHashMap;
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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/SparkRenewHelper;->sparkUserNameMap:Ljava/util/concurrent/ConcurrentHashMap;

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

.method public static ۟ۧۢۨ(J)Ljava/lang/String;
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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0, p1}, Lkevin/fun/hook/SparkRenewHelper;->getSparkUserName(J)Ljava/lang/String;

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

.method public static ۠ۡۦۢ()V
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
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->dismissProgressDialog()V

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

.method public static ۠ۦۥۨ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۡ۟ۨۨ()I

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

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper;->hasRenewedToday(Ljava/lang/String;)Z

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

.method public static ۠ۧ۟ۢ()Ljava/util/concurrent/atomic/AtomicReference;
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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/SparkRenewHelper;->sendMsgHandlerInstance:Ljava/util/concurrent/atomic/AtomicReference;

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

.method public static ۣۡ۟ۤ(Z)V
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
    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper;->setOnlySparkFilter(Z)V

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

.method public static ۡ۠ۢ()Z
    .locals 2

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۡ۟ۨۨ()I

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
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->isSendReady()Z

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

.method public static ۡۡۧۧ()Ljava/util/concurrent/atomic/AtomicBoolean;
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
    sget-object v0, Lkevin/fun/hook/SparkRenewHelper;->sendReady:Ljava/util/concurrent/atomic/AtomicBoolean;

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

.method public static ۣۢۤ۠()Ljava/util/concurrent/atomic/AtomicLong;
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
    sget-object v0, Lkevin/fun/hook/SparkRenewHelper;->myUid:Ljava/util/concurrent/atomic/AtomicLong;

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

.method public static ۢۨۦۨ()Landroid/widget/TextView;
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
    sget-object v0, Lkevin/fun/hook/SparkRenewHelper;->renewTaskNameText:Landroid/widget/TextView;

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

.method public static ۣ۟ۦۣ(Ljava/lang/Object;)V
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

.method public static ۣۢۥ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/content/Context;

    check-cast p1, Lkevin/fun/hook/SparkRenewHelper$SparkInfo;

    check-cast p2, Ljava/lang/Runnable;

    invoke-static {p0, p1, p2}, Lkevin/fun/hook/SparkRenewHelper;->showConversationCustomMsgDialog(Landroid/content/Context;Lkevin/fun/hook/SparkRenewHelper$SparkInfo;Ljava/lang/Runnable;)V

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

.method public static ۤۡۥۤ(IILjava/lang/Object;)V
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
    check-cast p2, Ljava/lang/String;

    invoke-static {p0, p1, p2}, Lkevin/fun/hook/SparkRenewHelper;->updateProgress(IILjava/lang/String;)V

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

.method public static ۤۤۢۡ(Ljava/lang/Object;)Z
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
    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper;->isUseCustomMessage(Ljava/lang/String;)Z

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

.method public static ۤۥۥ۟(Ljava/lang/Object;)Landroid/graphics/drawable/Drawable;
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

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper;->createRippleDrawable(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

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

.method public static ۤۥۦ۠(Ljava/lang/Object;)V
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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper;->saveRenewDate(Ljava/lang/String;)V

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

.method public static ۥ۠ۤۡ()V
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
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->forceWakeupAndSync()V

    :sswitch_3
    invoke-static {}, Landroidx/loader/ۥۧۨۤ;->ۣۡۧۨ()I

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
    const-string v0, "w8FFKOcwNFNhrNC2"

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۧ۟۠ۥ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۥۢۤ۠()Landroid/os/Handler;
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
    sget-object v0, Lkevin/fun/hook/SparkRenewHelper;->MAIN_HANDLER:Landroid/os/Handler;

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

.method public static ۥۣ۟ۡ(Ljava/lang/Object;Z)V
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
    check-cast p0, Landroid/widget/LinearLayout;

    invoke-static {p0, p1}, Lkevin/fun/hook/SparkRenewHelper;->updateOptionSelectedState(Landroid/widget/LinearLayout;Z)V

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

.method public static ۥۤۧۧ(Ljava/lang/Object;)V
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
    check-cast p0, Landroid/widget/TextView;

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper;->updateStatsText(Landroid/widget/TextView;)V

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

.method public static ۥۨۤۧ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۡ۟ۨۨ()I

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

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper;->getRandomApiName(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۦۡۨۨ()Ljava/util/concurrent/atomic/AtomicReference;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۦۣ۠۠()I

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
    sget-object v0, Lkevin/fun/hook/SparkRenewHelper;->imSdkContextInstance:Ljava/util/concurrent/atomic/AtomicReference;

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

.method public static ۧ۟ۤۥ(Ljava/lang/Object;Z)V
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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Ljava/lang/String;

    invoke-static {p0, p1}, Lkevin/fun/hook/SparkRenewHelper;->setUseCustomMessage(Ljava/lang/String;Z)V

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

.method public static ۣۧ۠ۤ(Ljava/lang/Object;ILjava/lang/Object;)V
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
    check-cast p0, Landroid/app/Activity;

    check-cast p2, [Z

    invoke-static {p0, p1, p2}, Lkevin/fun/hook/SparkRenewHelper;->showProgressDialogWithBackgroundButton(Landroid/app/Activity;I[Z)V

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

.method public static ۧۥۨۦ()Z
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
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->isOnlySparkFilter()Z

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

.method public static ۨ۟ۨۢ()V
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
    invoke-static {}, Lkevin/fun/hook/SparkRenewHelper;->checkReadyState()V

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

.method public static ۨ۠ۦۧ(Ljava/lang/Object;)Ljava/lang/String;
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
    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper;->getRandomSayingText(Ljava/lang/String;)Ljava/lang/String;

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
